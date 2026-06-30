package com.alkemy.ong.infrastructure.rest.response.slide;

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
import static com.alkemy.ong.infrastructure.rest.response.slide.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Integer;

public class ListSlideResponse_getSlides_15121753212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1240;

    public ListSlideResponse_getSlides_15121753212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1245 = new Integer(-203030934);
        Object term1243 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.slide.SlideResponse"));
        setField(term1243, term1243.getClass(), "imageUrl", "");
        setField(term1243, term1243.getClass(), "order", term1245);
        Integer term1249 = new Integer(-1179120542);
        Object term1247 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.slide.SlideResponse"));
        setField(term1247, term1247.getClass(), "imageUrl", "");
        setField(term1247, term1247.getClass(), "order", term1249);
        Integer term1253 = new Integer(-73683645);
        Object term1251 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.slide.SlideResponse"));
        setField(term1251, term1251.getClass(), "imageUrl", "");
        setField(term1251, term1251.getClass(), "order", term1253);
        Integer term1257 = new Integer(-226514366);
        Object term1255 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.slide.SlideResponse"));
        setField(term1255, term1255.getClass(), "imageUrl", "");
        setField(term1255, term1255.getClass(), "order", term1257);
        Integer term1261 = new Integer(1193880199);
        Object term1259 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.slide.SlideResponse"));
        setField(term1259, term1259.getClass(), "imageUrl", "");
        setField(term1259, term1259.getClass(), "order", term1261);
        Integer term1265 = new Integer(-1087774327);
        Object term1263 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.slide.SlideResponse"));
        setField(term1263, term1263.getClass(), "imageUrl", "");
        setField(term1263, term1263.getClass(), "order", term1265);
        Integer term1269 = new Integer(-1530420153);
        Object term1267 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.slide.SlideResponse"));
        setField(term1267, term1267.getClass(), "imageUrl", "");
        setField(term1267, term1267.getClass(), "order", term1269);
        Integer term1273 = new Integer(-469968304);
        Object term1271 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.slide.SlideResponse"));
        setField(term1271, term1271.getClass(), "imageUrl", "");
        setField(term1271, term1271.getClass(), "order", term1273);
        Integer term1277 = new Integer(-1145578966);
        Object term1275 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.slide.SlideResponse"));
        setField(term1275, term1275.getClass(), "imageUrl", "");
        setField(term1275, term1275.getClass(), "order", term1277);
        ArrayList term1241 = new ArrayList();
        ((ArrayList) term1241).add(term1243);
        ((ArrayList) term1241).add(term1247);
        ((ArrayList) term1241).add(term1251);
        ((ArrayList) term1241).add(term1255);
        ((ArrayList) term1241).add(term1259);
        ((ArrayList) term1241).add(term1263);
        ((ArrayList) term1241).add(term1267);
        ((ArrayList) term1241).add(term1271);
        ((ArrayList) term1241).add(term1275);
        term1240 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.slide.ListSlideResponse"));
        setField(term1240, term1240.getClass(), "slides", term1241);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.slide.ListSlideResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSlides", argTypes, term1240, args);
    }

};


