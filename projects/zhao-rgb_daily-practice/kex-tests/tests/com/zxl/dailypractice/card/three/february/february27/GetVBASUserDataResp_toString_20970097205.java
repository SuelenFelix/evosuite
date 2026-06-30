package com.zxl.dailypractice.card.three.february.february27;

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
import static com.zxl.dailypractice.card.three.february.february27.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class GetVBASUserDataResp_toString_20970097205 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term225;

    public GetVBASUserDataResp_toString_20970097205() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term225 = newInstance(Class.forName("com.zxl.dailypractice.card.three.february.february27.GetVBASUserDataResp"));
        setField(term225, term225.getClass(), "colTime", "NRdvgJlhkX");
        setField(term225, term225.getClass(), "userNum", "uuaPigETmJ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.three.february.february27.GetVBASUserDataResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term225, args);
    }

};


