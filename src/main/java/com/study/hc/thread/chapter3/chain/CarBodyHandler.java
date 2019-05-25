package com.study.hc.thread.chapter3.chain;

/**
 * 职责：concreteHandler 具体的处理类
 */
public class CarBodyHandler extends AbstractCarHandler {
    @Override
    public void carHandler() {
        System.out.println("处理车的body！");

        //下传
        this.doChain();
    }
}
