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
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Integer;

public class Organization_getPhone_13037213974 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1193;

    public Organization_getPhone_13037213974() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1194 = new Long(8059786003080744426L);
        Long term1320 = new Long(-4365849114644724155L);
        Integer term1323 = new Integer(1622346318);
        Object term1319 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term1319, term1319.getClass(), "id", term1320);
        setField(term1319, term1319.getClass(), "imageUrl", "");
        setField(term1319, term1319.getClass(), "order", term1323);
        setField(term1319, term1319.getClass(), "text", "");
        setField(term1319, term1319.getClass(), "base64FileEncoded", "");
        setField(term1319, term1319.getClass(), "contentType", "");
        Long term1329 = new Long(2486810210675247493L);
        Integer term1332 = new Integer(1048535127);
        Object term1328 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term1328, term1328.getClass(), "id", term1329);
        setField(term1328, term1328.getClass(), "imageUrl", "");
        setField(term1328, term1328.getClass(), "order", term1332);
        setField(term1328, term1328.getClass(), "text", "");
        setField(term1328, term1328.getClass(), "base64FileEncoded", "");
        setField(term1328, term1328.getClass(), "contentType", "");
        Long term1338 = new Long(7009926388951271268L);
        Integer term1341 = new Integer(-655067527);
        Object term1337 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term1337, term1337.getClass(), "id", term1338);
        setField(term1337, term1337.getClass(), "imageUrl", "");
        setField(term1337, term1337.getClass(), "order", term1341);
        setField(term1337, term1337.getClass(), "text", "");
        setField(term1337, term1337.getClass(), "base64FileEncoded", "");
        setField(term1337, term1337.getClass(), "contentType", "");
        Long term1347 = new Long(-7672528020740371001L);
        Integer term1350 = new Integer(-6029667);
        Object term1346 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term1346, term1346.getClass(), "id", term1347);
        setField(term1346, term1346.getClass(), "imageUrl", "");
        setField(term1346, term1346.getClass(), "order", term1350);
        setField(term1346, term1346.getClass(), "text", "");
        setField(term1346, term1346.getClass(), "base64FileEncoded", "");
        setField(term1346, term1346.getClass(), "contentType", "");
        Long term1356 = new Long(-4502405999831680926L);
        Integer term1359 = new Integer(-2068769794);
        Object term1355 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term1355, term1355.getClass(), "id", term1356);
        setField(term1355, term1355.getClass(), "imageUrl", "");
        setField(term1355, term1355.getClass(), "order", term1359);
        setField(term1355, term1355.getClass(), "text", "");
        setField(term1355, term1355.getClass(), "base64FileEncoded", "");
        setField(term1355, term1355.getClass(), "contentType", "");
        ArrayList term1317 = new ArrayList();
        ((ArrayList) term1317).add(term1319);
        ((ArrayList) term1317).add(term1328);
        ((ArrayList) term1317).add(term1337);
        ((ArrayList) term1317).add(term1346);
        ((ArrayList) term1317).add(term1355);
        term1193 = newInstance(Class.forName("com.alkemy.ong.domain.Organization"));
        Object term1256 = newInstance(Class.forName("com.alkemy.ong.domain.SocialMedia"));
        setField(term1193, term1193.getClass(), "id", term1194);
        setField(term1193, term1193.getClass(), "name", "OEXDRUKcFl");
        setField(term1193, term1193.getClass(), "image", "RYdKCNNMBR");
        setField(term1193, term1193.getClass(), "phone", "yGtHPyvYiQ");
        setField(term1193, term1193.getClass(), "address", "MvRIxilFMJ");
        setField(term1193, term1193.getClass(), "email", "iNwOJRBEjp");
        setField(term1256, term1256.getClass(), "facebookUrl", "XylxrMBraH");
        setField(term1256, term1256.getClass(), "linkedInUrl", "pORebkoRdD");
        setField(term1256, term1256.getClass(), "instagramUrl", "mXGCWJDOqA");
        setField(term1193, term1193.getClass(), "socialMedia", term1256);
        setField(term1193, term1193.getClass(), "aboutUsText", "dpNsDgfPso");
        setField(term1193, term1193.getClass(), "welcomeText", "hCWPJQKpdc");
        setField(term1193, term1193.getClass(), "slides", term1317);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.domain.Organization");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPhone", argTypes, term1193, args);
    }

};


