package util

import play.api.libs.json.{JsValue, Json, OWrites}
/**
  * Created by zhuleqi on 2017/6/17.
  */
object JSONUtil {

  def toJSON[T:OWrites](datas:List[T ]):JsValue={
    Json.obj("status"->"OK",
      "value"->datas.map(Json.toJson(_)))
  }

  def toJSON[T:OWrites](page:Int,pageSize:Int,datas:List[T]):JsValue={
    Json.obj("status"->"OK",
      "page"->page,
      "pageSize"->pageSize,
      "value"->datas.map(Json.toJson(_)));

  }
  def toJSON[T:OWrites](t:T):JsValue={
      Json.obj("status"->"OK",
        "value"->Json.toJson(t))
  }

  def toSuccessJSON(): JsValue ={
    Json.obj("status"->"OK")
  }

  def toErrorJSON():JsValue={
    Json.obj("status"->"error")
  }
}
