package com.selimhorri.app.pack.models.dto;

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
import static com.selimhorri.app.pack.models.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Double;

public class BossEmployeeDTO_getJob_15207062895 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term210;

    public BossEmployeeDTO_getJob_15207062895() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term235 = new Double(0.28570734989730284);
        term210 = newInstance(Class.forName("com.selimhorri.app.pack.models.dto.BossEmployeeDTO"));
        setField(term210, term210.getClass(), "ename", "RMFIsYGgne");
        setField(term210, term210.getClass(), "job", "NRdvgJlhkX");
        setField(term210, term210.getClass(), "sal", term235);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.selimhorri.app.pack.models.dto.BossEmployeeDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getJob", argTypes, term210, args);
    }

};


