package com.example.new_post_api_project


import com.example.new_post_api_project.UsersModel.AlbumsModel
import com.example.new_post_api_project.UsersModel.CommentsModel
import com.example.new_post_api_project.UsersModel.PhotoesModel
import com.example.new_post_api_project.UsersModel.PostsModel
import com.example.new_post_api_project.UsersModel.UsersModel
import io.reactivex.Observable
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface ApiServies {

    @POST("todos")

    fun posttodoList(@Body toDoModel: ToDoModel): Observable<ToDoModel>

    @POST("users")

    fun postuserslist(@Body usersModel: UsersModel): Observable<UsersModel>

    @POST ("photes")

    fun postphotoeslist(@Body photoesModel: PhotoesModel): Observable<PhotoesModel>

   @POST ("Comments")
   fun postcommentslist(@Body commentsModel: CommentsModel): Observable<CommentsModel>

   @POST("Posts")
   fun postpostslist(@Body postsModel: PostsModel): Observable<PostsModel>

   @POST("Albums")

   fun postalbumslist(@Body albumsModel: AlbumsModel): Observable<AlbumsModel>




}