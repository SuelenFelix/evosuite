package com.alkemy.ong.domain;

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
import static com.alkemy.ong.domain.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Integer;

public class Slide_getId_13156209573 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12401;

    public Slide_getId_13156209573() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term12402 = new Long(7487838449539103993L);
        Integer term12416 = new Integer(-1845499264);
        term12401 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term12401, term12401.getClass(), "id", term12402);
        setField(term12401, term12401.getClass(), "imageUrl", "LNHkTUfuHX");
        setField(term12401, term12401.getClass(), "order", term12416);
        setField(term12401, term12401.getClass(), "text", "SVWcOAHiTp");
        setField(term12401, term12401.getClass(), "base64FileEncoded", "oShLCaneoQ");
        setField(term12401, term12401.getClass(), "contentType", "nwKkzNpzyC");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.domain.Slide");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term12401, args);
    }

};


