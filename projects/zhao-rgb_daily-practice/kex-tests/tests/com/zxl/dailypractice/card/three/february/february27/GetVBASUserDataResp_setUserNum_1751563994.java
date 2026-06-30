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

public class GetVBASUserDataResp_setUserNum_1751563994 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term158;

    public GetVBASUserDataResp_setUserNum_1751563994() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term158 = newInstance(Class.forName("com.zxl.dailypractice.card.three.february.february27.GetVBASUserDataResp"));
        setField(term158, term158.getClass(), "colTime", "MjGYSRKTNF");
        setField(term158, term158.getClass(), "userNum", "hRNSzYYIrc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.three.february.february27.GetVBASUserDataResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "RMFIsYGgne";
        callMethod(klass, "setUserNum", argTypes, term158, args);
    }

};


