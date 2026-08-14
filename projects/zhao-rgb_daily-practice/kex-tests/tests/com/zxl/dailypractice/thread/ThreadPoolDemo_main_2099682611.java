package com.zxl.dailypractice.thread;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static com.zxl.dailypractice.thread.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ThreadPoolDemo_main_2099682611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1060;

    public ThreadPoolDemo_main_2099682611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1060 = (Object[]) newArray("java.lang.String", 7);
        setElement(term1060, 0, "eZFUvlxvGV");
        setElement(term1060, 1, "BYqFIqCKAV");
        setElement(term1060, 2, "vrQLuWIDJX");
        setElement(term1060, 3, "flxyYxBRtu");
        setElement(term1060, 4, "OclPbYPkcH");
        setElement(term1060, 5, "IoAlmYsBwc");
        setElement(term1060, 6, "TEParAifyi");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.thread.ThreadPoolDemo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1060;
        callMethod(klass, "main", argTypes, null, args);
    }

};


