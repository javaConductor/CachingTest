package com.soulsys.gserv.test.caching

import com.soulsys.g_serv.*
import com.soulsys.g_serv.plugins.PluginMgr
import com.soulsys.g_serv.plugins.caching.CachingPlugin
import com.soulsys.g_serv.plugins.compression.CompressionPlugin
import com.soulsys.g_serv.plugins.eventLogger.EventLoggerPlugin

class Main {


    static void main( String[] args ){

        def gserv = new GServ()
        def pluginMgr = PluginMgr.instance()
        pluginMgr.register("caching", CachingPlugin.class)

        gserv.
        plugins{
            plugin("caching", [:])
        }
        .http {

            get("NAME", "GET", "/:one/:two") { one, two ->

            }
            ///// Caching plugin should add this function to the delegate
            etag("/*")
                    .weak { exchange ->


            }
            .strong { exchange, data ->

            }

    }
}}