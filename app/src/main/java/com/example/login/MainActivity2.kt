package com.example.login

import android.annotation.SuppressLint
import android.app.DownloadManager
import android.app.SearchManager
import android.content.AbstractThreadedSyncAdapter
import android.content.Context
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.widget.SearchView
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.navigation.NavigationView
import com.synnapps.carouselview.CarouselView
import com.synnapps.carouselview.ImageListener
import kotlinx.android.synthetic.main.abb_bar_menu.*
import android.view.MenuItem as MenuItem2



class MainActivity2 : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
    @SuppressLint("WrongConstant")
    var imageArray:ArrayList<Int> = ArrayList()
    var carouselView:CarouselView?=null

    private lateinit var drawer: DrawerLayout
    private lateinit var toggle: ActionBarDrawerToggle
    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        var rec:RecyclerView
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main2)
//...................................................
        val departments= ArrayList<data>()
        departments.add(data("Make UP",R.drawable.makeup))
        departments.add(data("Clothes",R.drawable.clothes))
        departments.add(data("Electronics",R.drawable.electronics))
        departments.add(data("Dairy Products",R.drawable.v))
        departments.add(data("Dairy Products",R.drawable.dairy))
        departments.add(data("Frozen Products",R.drawable.frozen))

        recycle.layoutManager= LinearLayoutManager(this, LinearLayout.HORIZONTAL ,false)
        //define object from class adapter
        val adapt=adapter(departments)
        recycle.adapter=adapt
            //**********************************************************************

        imageArray.add(R.drawable.image6)
        imageArray.add(R.drawable.image1)
        imageArray.add(R.drawable.image2)
        imageArray.add(R.drawable.image3)
        imageArray.add(R.drawable.image4)
        imageArray.add(R.drawable.image5)






        carouselView=findViewById(R.id.carouselView)
        carouselView!!.pageCount=imageArray.size
        carouselView!!.setImageListener(imageListener)
        val toolbar:androidx.appcompat.widget.Toolbar=findViewById(R.id.toolbar_main)
        setSupportActionBar(toolbar)
        drawer=findViewById(R.id.drawer_layout)

        toggle= ActionBarDrawerToggle(this,drawer,toolbar,R.string.navigation_drawer_open,R.string.navigation_drawer_close)
        drawer.addDrawerListener(toggle)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeButtonEnabled(true)

        val navigationView:NavigationView=findViewById(R.id.nav_view)
        navigationView.setNavigationItemSelectedListener(this)

    }

    var imageListener = ImageListener { position, imageView ->imageView.setImageResource(imageArray[position]) }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater=menuInflater
        menuInflater.inflate(R.menu.main,menu)

        return true

    }

    override fun onOptionsItemSelected(item: MenuItem2): Boolean {
        var itemview=item.itemId
        when(itemview){
            R.id.main_search_icon->Toast.makeText(this,"clicked search",Toast.LENGTH_SHORT).show()
            R.id.main_notification_icon->Toast.makeText(this,"clicked notification",Toast.LENGTH_SHORT).show()
            R.id.main_cart_icon->Toast.makeText(this,"clicked cart",Toast.LENGTH_SHORT).show()
        }
        return false
    }

    override fun onNavigationItemSelected(item: MenuItem2): Boolean {
        when(item.itemId){
            R.id.nav_home-> Toast.makeText(this,"clicked home", Toast.LENGTH_SHORT).show()
            R.id.nav_logout-> Toast.makeText(this,"clicked logout", Toast.LENGTH_SHORT).show()
            R.id.nav_Offline-> Toast.makeText(this,"clicked offline", Toast.LENGTH_SHORT).show()
            R.id.nav_rate_us-> Toast.makeText(this,"clicked rate", Toast.LENGTH_SHORT).show()
            R.id.nav_setting-> Toast.makeText(this,"clicked setting", Toast.LENGTH_SHORT).show()
            R.id.nav_share-> Toast.makeText(this,"clicked share", Toast.LENGTH_SHORT).show()
            R.id.nav_trash-> Toast.makeText(this,"clicked trash", Toast.LENGTH_SHORT).show()
        }
        drawer.closeDrawer(GravityCompat.START)
        return true
    }

    override fun onPostCreate(savedInstanceState: Bundle?) {
        super.onPostCreate(savedInstanceState)
        toggle.syncState()
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
        toggle.onConfigurationChanged(newConfig)
    }


}