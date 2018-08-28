package io.github.bayu1993.kotlinrecyclerviewwithdagger.presentation.ui

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import android.widget.Toast
import com.google.gson.Gson
import dagger.android.AndroidInjection
import io.github.bayu1993.kotlinrecyclerviewwithdagger.R
import io.github.bayu1993.kotlinrecyclerviewwithdagger.presentation.model.Club
import io.github.bayu1993.kotlinrecyclerviewwithdagger.presentation.ui.adapter.ClubAdapter
import io.github.bayu1993.kotlinrecyclerviewwithdagger.utils.logD
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity(), MainView {

    private val tag = "MainActivity"

    @Inject
    lateinit var presenter: MainPresenter
    @Inject
    lateinit var clubAdapter: ClubAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        presenter.bind(this)

        setupView()
    }

    private fun setupView() {
        recClub.layoutManager = LinearLayoutManager(this)
        recClub.adapter = clubAdapter
        presenter.getClubs()
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.destroy()
    }

    override fun showProgress(show: Boolean) {
        progressbar.visibility = if (show) View.VISIBLE else View.GONE
    }

    override fun showMessage(msg: String?) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
    }

    override fun displayClub(club: List<Club>) {
        logD(tag, "club list ${Gson().toJsonTree(club)}")
        clubAdapter.clearItem()
        clubAdapter.addItems(club)
    }
}
