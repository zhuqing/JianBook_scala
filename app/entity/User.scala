

package entity

/**
  * 用户实体对象
  * @param id
  * @param name
  * @param password
  * @param email
  * @param createDate
  * @param modifyDate
  */
case class User(val id:String ,
                val name: String,
                val password:String,
                val email:String,
                val createDate:Long,
                val modifyDate:Long)

object User{
  import   play.api.libs.json._

  implicit object UserWriter extends OWrites[User]{
    override def writes(o: User): JsObject = {
      Json.obj(
        "_id"->o.id,
        "name"->o.name,
        "password"->o.password,
        "email"->o.email,
        "createDate"->o.createDate,
        "modifyDate"->o.modifyDate
      )
    }
  }

  implicit object UserReader extends Reads[User]{
    override def reads(json: JsValue): JsResult[User] = {
      json match {
        case js:JsObject=>try{
          val id = (json \ "_id").as[String]
          val name = (json \ "name").as[String]
          val password = (json \"password").as[String]
          val email = (json \"email").as[String]
          val createDate = (json \ "createDate").as[Long]
          val modifyDate = (json \ "modifyDate").as[Long]

          JsSuccess(User(id,name,password,email,createDate,modifyDate))
        }catch {
          case cause:Throwable=>JsError(cause.getMessage)
        }

        case _ => JsError("error")
      }

    }
  }
}

