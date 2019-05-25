package com.study.hc.thread.chapter3.chain;

/**
 * 职责：concreteHandler 具体的处理类
 */
public class CarHeadHandler extends AbstractCarHandler {
    @Override
    public void carHandler() {
        System.out.println("处理车的head！");

        //下传职责
        this.doChain();
    }
}
