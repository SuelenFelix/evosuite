package com.zxl.dailypractice.card.three.february.february1;

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
import static com.zxl.dailypractice.card.three.february.february1.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class IcutWSReq_getOrderId_119523230929 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6946;

    public IcutWSReq_getOrderId_119523230929() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6946 = newInstance(Class.forName("com.zxl.dailypractice.card.three.february.february1.IcutWSReq"));
        setField(term6946, term6946.getClass(), "orderId", null);
        setField(term6946, term6946.getClass(), "city", null);
        setField(term6946, term6946.getClass(), "classify", null);
        setField(term6946, term6946.getClass(), "neName", null);
        setField(term6946, term6946.getClass(), "coverList", null);
        setField(term6946, term6946.getClass(), "startTime", null);
        setField(term6946, term6946.getClass(), "endTime", null);
        setField(term6946, term6946.getClass(), "opDetails", null);
        setField(term6946, term6946.getClass(), "cutType", null);
        setField(term6946, term6946.getClass(), "opType", null);
        setField(term6946, term6946.getClass(), "opTitle", null);
        setField(term6946, term6946.getClass(), "taskid", null);
        setField(term6946, term6946.getClass(), "description", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.three.february.february1.IcutWSReq");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOrderId", argTypes, term6946, args);
    }

};


