package com.example.new_post_api_project

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.new_post_api_project.UsersModel.AlbumsModel
import com.example.new_post_api_project.UsersModel.CommentsModel
import com.example.new_post_api_project.UsersModel.PhotoesModel
import com.example.new_post_api_project.UsersModel.PostsModel
import com.example.new_post_api_project.UsersModel.UsersModel
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val todobutton = findViewById<Button>(R.id.todobutton)
        todobutton.setOnClickListener {
            val retrofit = Retrofit.Builder()
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("https://jsonplaceholder.typicode.com/")
                .build().create(ApiServies::class.java).posttodoList(
                    ToDoModel(
                        1,
                        1,
                        "Kunal",
                        true

                    )
                )


            retrofit.observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe {
                    Toast.makeText(this, "${it.title}", Toast.LENGTH_LONG).show()
                }

        }
        val button2 = findViewById<Button>(R.id.userbutton1)
        button2.setOnClickListener {
            val retrofit = Retrofit.Builder()
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("https://jsonplaceholder.typicode.com/")
                .build().create(ApiServies::class.java).postuserslist(
                    UsersModel(
                        1,
                        "alex",
                        "my name is kunal",
                        "Chapra",

                        )
                )

            retrofit.observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe {
                    Toast.makeText(this, "${it.name}", Toast.LENGTH_LONG).show()
                }
        }
        val Api_Calling3 = findViewById<Button>(R.id.userbutton3)
        Api_Calling3.setOnClickListener {
            val retrofit = Retrofit.Builder()
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("https://jsonplaceholder.typicode.com/")
                .build().create(ApiServies::class.java).postalbumslist(
                    AlbumsModel(
                        2,
                        "ss",
                        1,


                        )
                )
            retrofit.observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe {
                    Toast.makeText(this, "${it.id}", Toast.LENGTH_LONG).show()
                }

        }
        val Api_Calling4 = findViewById<Button>(R.id.userbutton4)
        Api_Calling4.setOnClickListener {
            val retrofit = Retrofit.Builder()
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("https://jsonplaceholder.typicode.com/")
                .build().create(ApiServies::class.java).postcommentslist(
                    CommentsModel(
                        "kunal", "sharmakunal224@gmail.com", 998, "kunal2", 22,


                        )
                )
            retrofit.observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe {
                    Toast.makeText(this, "${it.name}", Toast.LENGTH_LONG).show()
                }
        }
        val Api_Calling5 = findViewById<Button>(R.id.userbutton5)
        Api_Calling5.setOnClickListener {
            val retrofit = Retrofit.Builder()
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("https://jsonplaceholder.typicode.com/")
                .build().create(ApiServies::class.java).postpostslist(
                    PostsModel(
                        "kun", 7, "abcd", 9


                    )
                )
            retrofit.observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe {
                    Toast.makeText(this, "${it.body}", Toast.LENGTH_LONG).show()
                }
        }
        val Api_Calling6 = findViewById<Button>(R.id.userbutton6)
        Api_Calling6.setOnClickListener {
            val retrofit = Retrofit.Builder()
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("https://jsonplaceholder.typicode.com/")
                .build().create(ApiServies::class.java).postalbumslist(
                    AlbumsModel(
                        8, "kunal@gmail.com", 9


                    )
                )
            retrofit.observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe {
                    Toast.makeText(this, "${it.userId}", Toast.LENGTH_LONG).show()
                }
        }
    }
}