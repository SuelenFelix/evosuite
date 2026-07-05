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

public class Slide_setText_98762185411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13171;

    public Slide_setText_98762185411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term13172 = new Long(3643973882575578879L);
        Integer term13186 = new Integer(-1347665717);
        term13171 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term13171, term13171.getClass(), "id", term13172);
        setField(term13171, term13171.getClass(), "imageUrl", "miJxAzOVJy");
        setField(term13171, term13171.getClass(), "order", term13186);
        setField(term13171, term13171.getClass(), "text", "kjqlBVaviD");
        setField(term13171, term13171.getClass(), "base64FileEncoded", "iVRXRDCrcM");
        setField(term13171, term13171.getClass(), "contentType", "WAZFhrxcSM");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.domain.Slide");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "gCRUlTuVMX";
        callMethod(klass, "setText", argTypes, term13171, args);
    }

};


