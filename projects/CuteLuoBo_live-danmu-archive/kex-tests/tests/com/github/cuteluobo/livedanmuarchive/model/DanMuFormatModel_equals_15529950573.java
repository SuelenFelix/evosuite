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
import java.lang.Integer;

public class DanMuFormatModel_equals_15529950573 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3146;
     Object term3154;

    public DanMuFormatModel_equals_15529950573() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3147 = new Integer(1876565163);
        term3146 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanMuFormatModel"));
        setField(term3146, term3146.getClass(), "id", term3147);
        setIntField(term3146, term3146.getClass(), "fontColor", -1955890973);
        setIntField(term3146, term3146.getClass(), "fontSize", 25);
        setIntField(term3146, term3146.getClass(), "textSpeed", -2038273078);
        setIntField(term3146, term3146.getClass(), "transitionType", 1);
        setIntField(term3146, term3146.getClass(), "popupStyle", 1227103734);
        term3154 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanMuFormatModel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term3154;
        callMethod(klass, "equals", argTypes, term3146, args);
    }

};


