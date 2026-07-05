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

public class Slide_getContentType_6424780121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12215;

    public Slide_getContentType_6424780121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term12216 = new Long(-5004803270846838598L);
        Integer term12230 = new Integer(-556405712);
        term12215 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term12215, term12215.getClass(), "id", term12216);
        setField(term12215, term12215.getClass(), "imageUrl", "EGQLusEtRN");
        setField(term12215, term12215.getClass(), "order", term12230);
        setField(term12215, term12215.getClass(), "text", "GwGUMPdvZq");
        setField(term12215, term12215.getClass(), "base64FileEncoded", "iXRAYcFyfS");
        setField(term12215, term12215.getClass(), "contentType", "lokyclbLEz");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.domain.Slide");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getContentType", argTypes, term12215, args);
    }

};


