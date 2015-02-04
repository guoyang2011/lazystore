package cn.changhong.lazystore.service

import cn.changhong.lazystore.persistent.T.Tables.UAppstatsRow
import cn.changhong.lazystore.persistent.dao.ClientDeviceDao
import cn.changhong.web.util.{ResponseContent, RestRequest}

/**
 * Created by yangguo on 15-1-23.
 */
object ClientDeviceService {
  object AddClientDeviceService extends AddClientDeviceService with BaseAopService
  private[service] class AddClientDeviceService extends BaseService{
    override def apply(request: RestRequest): ResponseContent = {
      val content=ClientDeviceDao.addClientDevice(request)
      ResponseContent(content)
    }
  }

  object AddClientDeviceCopStats extends AddClientDeviceCopStats with BaseAopService
  private[service] class AddClientDeviceCopStats extends BaseService{
    override def apply(request: RestRequest): ResponseContent = {
      val content=ClientDeviceDao.addClientDeviceCopStats(request)
      ResponseContent(content)
    }
  }
}
