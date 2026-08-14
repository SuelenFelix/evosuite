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

public class DanMuFormatModel_setId_12401701562 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3136;
     Object term3144;

    public DanMuFormatModel_setId_12401701562() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3137 = new Integer(-602026508);
        term3136 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanMuFormatModel"));
        setField(term3136, term3136.getClass(), "id", term3137);
        setIntField(term3136, term3136.getClass(), "fontColor", 391863371);
        setIntField(term3136, term3136.getClass(), "fontSize", 25);
        setIntField(term3136, term3136.getClass(), "textSpeed", -1922583790);
        setIntField(term3136, term3136.getClass(), "transitionType", 1);
        setIntField(term3136, term3136.getClass(), "popupStyle", -616727354);
        term3144 = new Integer(-157887805);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanMuFormatModel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term3144;
        callMethod(klass, "setId", argTypes, term3136, args);
    }

};


