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

public class IcutWSReq_getDescription_104757386453 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6970;

    public IcutWSReq_getDescription_104757386453() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6970 = newInstance(Class.forName("com.zxl.dailypractice.card.three.february.february1.IcutWSReq"));
        setField(term6970, term6970.getClass(), "orderId", null);
        setField(term6970, term6970.getClass(), "city", null);
        setField(term6970, term6970.getClass(), "classify", null);
        setField(term6970, term6970.getClass(), "neName", null);
        setField(term6970, term6970.getClass(), "coverList", null);
        setField(term6970, term6970.getClass(), "startTime", null);
        setField(term6970, term6970.getClass(), "endTime", null);
        setField(term6970, term6970.getClass(), "opDetails", null);
        setField(term6970, term6970.getClass(), "cutType", null);
        setField(term6970, term6970.getClass(), "opType", null);
        setField(term6970, term6970.getClass(), "opTitle", null);
        setField(term6970, term6970.getClass(), "taskid", null);
        setField(term6970, term6970.getClass(), "description", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.three.february.february1.IcutWSReq");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDescription", argTypes, term6970, args);
    }

};


