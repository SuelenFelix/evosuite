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

public class SlideEntity_getSlideId_8316381420 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15613;

    public SlideEntity_getSlideId_8316381420() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term15614 = new Long(7489064039921396098L);
        Integer term15640 = new Integer(568599855);
        term15613 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.SlideEntity"));
        setField(term15613, term15613.getClass(), "slideId", term15614);
        setField(term15613, term15613.getClass(), "imageUrl", "xypryEkUPF");
        setField(term15613, term15613.getClass(), "text", "zyZTzHNjQr");
        setField(term15613, term15613.getClass(), "position", term15640);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.SlideEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSlideId", argTypes, term15613, args);
    }

};


