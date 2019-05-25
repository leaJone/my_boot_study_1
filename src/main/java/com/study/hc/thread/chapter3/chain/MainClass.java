package com.study.hc.thread.chapter3.chain;

/**
 * 测试
 */
public class MainClass {

    public static void main(String[] args) {
        AbstractCarHandler carheadHandle = new CarHeadHandler();
        AbstractCarHandler carbodyHandle = new CarBodyHandler();
        AbstractCarHandler carTailHandler = new CarTailHandler();

        //组装责任链
        carheadHandle.setNextCarHandler(carbodyHandle).setNextCarHandler(carTailHandler);

        //链头部开始执行
        carheadHandle.carHandler();
    }
}
