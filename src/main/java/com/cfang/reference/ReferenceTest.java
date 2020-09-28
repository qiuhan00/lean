package com.cfang.reference;

import java.lang.ref.WeakReference;

/**
 * @author cfang 2020/9/15 10:25
 * @description
 */
public class ReferenceTest {

    public static void main(String[] args) throws Exception{

        ReferenceTest referenceTest = new ReferenceTest();

        WeakReference<ReferenceTest> weakReference = new WeakReference<>(referenceTest);

        System.out.println(weakReference.get());

        System.gc();
        System.out.println(weakReference.get());

        referenceTest = null;
        System.gc();
        System.out.println(weakReference.get());

    }
}
