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

public class Slide_setId_17456627158 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12866;
     Object term12919;

    public Slide_setId_17456627158() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term12867 = new Long(-7423063312741500355L);
        Integer term12881 = new Integer(-1034506028);
        term12866 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term12866, term12866.getClass(), "id", term12867);
        setField(term12866, term12866.getClass(), "imageUrl", "cwALzyQVjH");
        setField(term12866, term12866.getClass(), "order", term12881);
        setField(term12866, term12866.getClass(), "text", "jlYNjpdkoz");
        setField(term12866, term12866.getClass(), "base64FileEncoded", "DZAGnhJkeU");
        setField(term12866, term12866.getClass(), "contentType", "xQuVexkiVz");
        term12919 = new Long(-8992404862613425105L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.domain.Slide");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term12919;
        callMethod(klass, "setId", argTypes, term12866, args);
    }

};


