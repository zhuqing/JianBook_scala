package entity

/**
  * Created by zhuleqi on 2017/6/10.
  */

case class  Artical(val id:String,
                    val title:String,
                    val content:String,
                    val auther:String ,
                    val filePath:String,
                    val articalType:String,
                    val createDate:Long,
                    val modifyDate:Long)

object Artical{
  /**
    * 普通文章
    */
  val ARTICAL = "ARTICAL"
  /**
    * 听写
    */
  val DICTATION= "DICTATION"
  import   play.api.libs.json._

  implicit object ArticalWriter extends OWrites[Artical]{
    override def writes(o: Artical): JsObject = {
      Json.obj(
        "_id"->o.id,
        "title"->o.title,
        "content"->o.content,
        "auther"->o.auther,
        "filePath"->o.filePath,
        "articalTpe"->o.articalType,
        "createDate"->o.createDate,
        "modifyDate"->o.modifyDate
      )
    }
  }

  implicit object ArticalReader extends Reads[Artical]{
    override def reads(json: JsValue): JsResult[Artical] = {
      json match {
        case js:JsObject=>try{
          val id = (json \ "_id").as[String]
          val title = (json \ "title").as[String]
          val content = (json \"content").as[String]
          val auther = (json \"auther").as[String]
          var filePath = (json \ "filePath").as[String]
          var articalType = (json\ "articalType").as[String]
          val createDate = (json \ "createDate").as[Long]
          val modifyDate = (json \ "modifyDate").as[Long]

          JsSuccess(Artical(id,title,content,auther,filePath,articalType,createDate,modifyDate))
        }catch {
          case cause:Throwable=>JsError(cause.getMessage)
        }

        case _ => JsError("error")
      }

    }
  }
}
