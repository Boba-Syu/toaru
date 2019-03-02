package com.hunau.entty;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.Channel;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;

/**
 * Created by MI on 2019/3/2.
 */
public class BroadcastMain {
    public static void main(String[] args) {
        broadcastMain();
    }

    public static void broadcastMain() {
        EventLoopGroup bossGroup = new NioEventLoopGroup();
        EventLoopGroup workGroup = new NioEventLoopGroup();
        try{
            ServerBootstrap b = new ServerBootstrap();
            b.group(bossGroup, workGroup);
            b.channel(NioServerSocketChannel.class);
            b.childHandler(new BroadcastSocketChannelHandler());
            System.out.println("服务端开启等待客户端连接...");
            Channel ch = b.bind(BroadcastConfig.port).sync().channel();
            ch.closeFuture().sync();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            //优雅的退出程序
            bossGroup.shutdownGracefully();
            workGroup.shutdownGracefully();
        }
    }
}
