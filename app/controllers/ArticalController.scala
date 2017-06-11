package controllers


import java.util.UUID
import javax.inject.{Inject, Singleton}

import com.google.common.annotations.VisibleForTesting
import entity.{Artical, User}
import play.api._
import play.api.mvc._
import play.modules.reactivemongo.{MongoController, ReactiveMongoApi, ReactiveMongoComponents}
import play.api.libs.concurrent.Execution.Implicits.defaultContext
import play.api.libs.json.Json
import reactivemongo.api.QueryOpts
import reactivemongo.bson.BSONDocument
import reactivemongo.play.json._
import reactivemongo.play.json.collection._

/**
  * Created by zhuleqi on 2017/6/10.
  */
class ArticalController  @Inject() (val reactiveMongoApi: ReactiveMongoApi) extends Controller with MongoController with ReactiveMongoComponents {

  def collection = reactiveMongoApi.database.
    map(_.collection[JSONCollection]("artical"))
  def insert(title:String,content:String)=Action.async{
    val userId = "123"
    val artical = Artical(
      UUID.randomUUID().toString,
      title,
      content,
      userId,
      System.currentTimeMillis(),
      System.currentTimeMillis()
    )

    collection.flatMap(_.insert(artical)).map(wr=>{
      Ok(artical.toString)
    })
  }
}
