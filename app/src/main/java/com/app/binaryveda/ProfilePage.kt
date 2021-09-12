package com.app.binaryveda
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ProfilePage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.profile_page)
        val recyclerview = findViewById<RecyclerView>(R.id.recyclerview)
        recyclerview.setLayoutManager(GridLayoutManager(this, 2))
        val data = ArrayList<ProfilePageModel>()
        data.add(ProfilePageModel(R.drawable.ic_pplist1))
        data.add(ProfilePageModel(R.drawable.ic_pplist2))
        data.add(ProfilePageModel(R.drawable.ic_pplist3))
        data.add(ProfilePageModel(R.drawable.ic_pplist4))
        data.add(ProfilePageModel(R.drawable.ic_pplist5))
        data.add(ProfilePageModel(R.drawable.ic_pplist6))
        val adapter = CustomAdapterPP(data)
        recyclerview.adapter = adapter

    }
}