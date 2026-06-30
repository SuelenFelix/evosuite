package com.prac.react.model.dto;

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
import static com.prac.react.model.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class Culture_setStatus_163862137811 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32042;
     Object term32095;

    public Culture_setStatus_163862137811() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32042 = newInstance(Class.forName("com.prac.react.model.dto.Culture"));
        setIntField(term32042, term32042.getClass(), "keyNum", -1677599962);
        setField(term32042, term32042.getClass(), "keyHash", "ipoyEHBfoG");
        setField(term32042, term32042.getClass(), "name", "iSBTpbiteU");
        setIntField(term32042, term32042.getClass(), "likeCount", -1790275458);
        setIntField(term32042, term32042.getClass(), "status", -497534255);
        setField(term32042, term32042.getClass(), "explain", "MTwFbEoMZj");
        setField(term32042, term32042.getClass(), "fileUrl", "uEQbnHbyAn");
        setIntField(term32042, term32042.getClass(), "spot", 1588942911);
        term32095 = new Integer(-2129828854);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Culture");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term32095;
        callMethod(klass, "setStatus", argTypes, term32042, args);
    }

};


