package controllers

import java.util.UUID
import javax.inject.{Inject, Singleton}

import entity.User
import mongo.MongoDBClient
import play.api._
import play.api.mvc._
import play.modules.reactivemongo.{MongoController, ReactiveMongoApi, ReactiveMongoComponents}
import reactivemongo.play.json.collection.JSONCollection
import play.api.libs.concurrent.Execution.Implicits.defaultContext


/**
  * Created by zhuleqi on 2017/3/22.
  */
class UserController @Inject() (val reactiveMongoApi: ReactiveMongoApi) extends Controller with MongoController with ReactiveMongoComponents {

  def userCollection = reactiveMongoApi.database.
    map(_.collection[JSONCollection]("user"))

  def insert(name:String,passowrd:String)=Action.async{

    var user = User(UUID.randomUUID().toString,
      name,
      passowrd,
    "",
      System.currentTimeMillis(),
      System.currentTimeMillis()
    )
  userCollection.flatMap(_.insert(user)).map(wr =>Ok(user.toString))


  }

  def getUser()=Action{
    //MongoDBClient.excute()
    Ok("name=")
  }

  def getUserById(id:Long) = Action{
    Ok("id,"+id)
  }
}
