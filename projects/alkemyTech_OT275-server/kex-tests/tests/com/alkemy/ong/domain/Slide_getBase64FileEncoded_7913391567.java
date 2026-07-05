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

public class Slide_getBase64FileEncoded_7913391567 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12773;

    public Slide_getBase64FileEncoded_7913391567() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term12774 = new Long(3104349415269466587L);
        Integer term12788 = new Integer(444029505);
        term12773 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term12773, term12773.getClass(), "id", term12774);
        setField(term12773, term12773.getClass(), "imageUrl", "fwtOJhjXbW");
        setField(term12773, term12773.getClass(), "order", term12788);
        setField(term12773, term12773.getClass(), "text", "ltWBKZaXwJ");
        setField(term12773, term12773.getClass(), "base64FileEncoded", "FSQpgxQnsH");
        setField(term12773, term12773.getClass(), "contentType", "LBPwnVMEpP");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.domain.Slide");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBase64FileEncoded", argTypes, term12773, args);
    }

};


