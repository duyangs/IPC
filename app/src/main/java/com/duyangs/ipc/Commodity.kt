package com.duyangs.ipc

import java.io.Serializable


/**
 * "" IPC
 * create by DuYang
 * e-mail:duyangs1994@gmail.com
 * update time 2018/9/5.
 */
class Commodity(id: String?, name: String?, price: String?) : Serializable {

    companion object {
        private const val serialVersionUID = 1L
    }

    var commodityId: String? = id
    var commodityName: String? = name
    var commodityPrice: String? = price


}