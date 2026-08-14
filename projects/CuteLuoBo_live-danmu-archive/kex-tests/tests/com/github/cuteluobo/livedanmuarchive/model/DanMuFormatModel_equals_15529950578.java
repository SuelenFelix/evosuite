package com.github.cuteluobo.livedanmuarchive.model;

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
import static com.github.cuteluobo.livedanmuarchive.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class DanMuFormatModel_equals_15529950578 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3175;

    public DanMuFormatModel_equals_15529950578() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3175 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanMuFormatModel"));
        setField(term3175, term3175.getClass(), "id", null);
        setIntField(term3175, term3175.getClass(), "fontColor", 0);
        setIntField(term3175, term3175.getClass(), "fontSize", 0);
        setIntField(term3175, term3175.getClass(), "textSpeed", 0);
        setIntField(term3175, term3175.getClass(), "transitionType", 0);
        setIntField(term3175, term3175.getClass(), "popupStyle", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanMuFormatModel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "equals", argTypes, term3175, args);
    }

};


