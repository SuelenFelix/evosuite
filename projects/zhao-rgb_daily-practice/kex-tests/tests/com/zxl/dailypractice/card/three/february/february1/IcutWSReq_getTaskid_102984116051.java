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

public class IcutWSReq_getTaskid_102984116051 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6968;

    public IcutWSReq_getTaskid_102984116051() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6968 = newInstance(Class.forName("com.zxl.dailypractice.card.three.february.february1.IcutWSReq"));
        setField(term6968, term6968.getClass(), "orderId", null);
        setField(term6968, term6968.getClass(), "city", null);
        setField(term6968, term6968.getClass(), "classify", null);
        setField(term6968, term6968.getClass(), "neName", null);
        setField(term6968, term6968.getClass(), "coverList", null);
        setField(term6968, term6968.getClass(), "startTime", null);
        setField(term6968, term6968.getClass(), "endTime", null);
        setField(term6968, term6968.getClass(), "opDetails", null);
        setField(term6968, term6968.getClass(), "cutType", null);
        setField(term6968, term6968.getClass(), "opType", null);
        setField(term6968, term6968.getClass(), "opTitle", null);
        setField(term6968, term6968.getClass(), "taskid", null);
        setField(term6968, term6968.getClass(), "description", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.three.february.february1.IcutWSReq");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTaskid", argTypes, term6968, args);
    }

};


