package com.alkemy.ong.infrastructure.database.entity;

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
import static com.alkemy.ong.infrastructure.database.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Integer;

public class SlideEntity_getImageUrl_18968758151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15662;

    public SlideEntity_getImageUrl_18968758151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term15663 = new Long(6843866297465638866L);
        Integer term15689 = new Integer(1162663216);
        term15662 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.SlideEntity"));
        setField(term15662, term15662.getClass(), "slideId", term15663);
        setField(term15662, term15662.getClass(), "imageUrl", "YSrFKQQwXE");
        setField(term15662, term15662.getClass(), "text", "qxhOsmyyjm");
        setField(term15662, term15662.getClass(), "position", term15689);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.SlideEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getImageUrl", argTypes, term15662, args);
    }

};


