package com.zxl.dailypractice.project.entity;

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
import static com.zxl.dailypractice.project.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;

public class Meetings_setRemark_173594824211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1094;

    public Meetings_setRemark_173594824211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1095 = new Integer(1134449235);
        term1094 = newInstance(Class.forName("com.zxl.dailypractice.project.entity.Meetings"));
        Object term1133 = newInstance(Class.forName("java.util.Date"));
        setField(term1094, term1094.getClass(), "id", term1095);
        setField(term1094, term1094.getClass(), "people", "LvtrsXUliU");
        setField(term1094, term1094.getClass(), "subject", "xLbjWUgOIL");
        setField(term1094, term1094.getClass(), "context", "jDtqGUpnZN");
        setLongField(term1133, term1133.getClass(), "fastTime", 1745462962080L);
        setField(term1133, term1133.getClass(), "cdate", null);
        setField(term1094, term1094.getClass(), "time", term1133);
        setField(term1094, term1094.getClass(), "remark", "nGKItKLYNC");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.project.entity.Meetings");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "UiUYnPrcCi";
        callMethod(klass, "setRemark", argTypes, term1094, args);
    }

};


