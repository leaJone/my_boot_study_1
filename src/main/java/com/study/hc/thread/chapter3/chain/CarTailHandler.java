package com.study.hc.thread.chapter3.chain;


/**
 * 职责：concreteHandler 具体的处理类(处理尾部)
 */
public class CarTailHandler extends AbstractCarHandler {
    @Override
    public void carHandler() {
        System.out.println("处理车的tail！");

        //下传
        this.doChain();
    }
}