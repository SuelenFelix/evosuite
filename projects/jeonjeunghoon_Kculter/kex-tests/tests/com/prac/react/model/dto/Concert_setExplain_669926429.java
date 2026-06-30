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
import java.lang.Object;

public class Concert_setExplain_669926429 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19357;

    public Concert_setExplain_669926429() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19357 = newInstance(Class.forName("com.prac.react.model.dto.Concert"));
        Object term19395 = newInstance(Class.forName("java.util.Date"));
        Object term19397 = newInstance(Class.forName("java.util.Date"));
        setIntField(term19357, term19357.getClass(), "concertNum", 723812297);
        setField(term19357, term19357.getClass(), "concertHash", "EBSKhqDdUW");
        setField(term19357, term19357.getClass(), "concertName", "LvLbdICdfA");
        setField(term19357, term19357.getClass(), "explain", "rtifrlITwl");
        setLongField(term19395, term19395.getClass(), "fastTime", 1882638884364L);
        setField(term19395, term19395.getClass(), "cdate", null);
        setField(term19357, term19357.getClass(), "startDate", term19395);
        setLongField(term19397, term19397.getClass(), "fastTime", 1437757323580L);
        setField(term19397, term19397.getClass(), "cdate", null);
        setField(term19357, term19357.getClass(), "endDate", term19397);
        setDoubleField(term19357, term19357.getClass(), "lat", 0.3147638130628596);
        setDoubleField(term19357, term19357.getClass(), "lng", 0.24810335047389354);
        setIntField(term19357, term19357.getClass(), "starKey", 1639448749);
        setField(term19357, term19357.getClass(), "starHash", "yGWXZDjnPS");
        setField(term19357, term19357.getClass(), "imageUrl", "vZucxbGVyo");
        setIntField(term19357, term19357.getClass(), "status", 873659088);
        setField(term19357, term19357.getClass(), "starName", "ZZoLNbeORl");
        setField(term19357, term19357.getClass(), "placeName", "XjIOUIzJUP");
        setField(term19357, term19357.getClass(), "buySite", "iGTpXnnTqB");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Concert");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "XgJzBOYfQB";
        callMethod(klass, "setExplain", argTypes, term19357, args);
    }

};


