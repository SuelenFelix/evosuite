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

public class SlideEntity_setText_18905945206 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15931;

    public SlideEntity_setText_18905945206() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term15932 = new Long(4513004407927379358L);
        Integer term15958 = new Integer(-1955890973);
        term15931 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.SlideEntity"));
        setField(term15931, term15931.getClass(), "slideId", term15932);
        setField(term15931, term15931.getClass(), "imageUrl", "XZkOUcbfFg");
        setField(term15931, term15931.getClass(), "text", "TGiJfagfky");
        setField(term15931, term15931.getClass(), "position", term15958);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.SlideEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "BJklinBmhN";
        callMethod(klass, "setText", argTypes, term15931, args);
    }

};


