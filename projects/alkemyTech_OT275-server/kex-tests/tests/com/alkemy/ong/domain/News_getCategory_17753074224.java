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

public class News_getCategory_17753074224 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17882;

    public News_getCategory_17753074224() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term17883 = new Long(204473662283899955L);
        Long term17922 = new Long(-4029227951294167228L);
        ArrayList term17960 = new ArrayList();
        term17882 = newInstance(Class.forName("com.alkemy.ong.domain.News"));
        Object term17921 = newInstance(Class.forName("com.alkemy.ong.domain.Category"));
        setField(term17882, term17882.getClass(), "id", term17883);
        setField(term17882, term17882.getClass(), "name", "iFFcolxwcm");
        setField(term17882, term17882.getClass(), "content", "bAsZBSqnyM");
        setField(term17882, term17882.getClass(), "imageUrl", "urrmpQzmTU");
        setField(term17921, term17921.getClass(), "id", term17922);
        setField(term17921, term17921.getClass(), "name", "GWoZyTTlNx");
        setField(term17921, term17921.getClass(), "description", "ntUYcalSmz");
        setField(term17921, term17921.getClass(), "imageUrl", "lnZXLpyQoO");
        setField(term17882, term17882.getClass(), "category", term17921);
        setField(term17882, term17882.getClass(), "comments", term17960);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.domain.News");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCategory", argTypes, term17882, args);
    }

};


