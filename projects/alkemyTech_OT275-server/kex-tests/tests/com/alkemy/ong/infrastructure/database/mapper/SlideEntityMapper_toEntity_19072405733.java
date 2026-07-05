package com.alkemy.ong.infrastructure.database.mapper;

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
import static com.alkemy.ong.infrastructure.database.mapper.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Integer;

public class SlideEntityMapper_toEntity_19072405733 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term668;
     Object term669;

    public SlideEntityMapper_toEntity_19072405733() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term668 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.mapper.SlideEntityMapper"));
        Long term670 = new Long(-316468845751588286L);
        Integer term684 = new Integer(-2038273078);
        term669 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term669, term669.getClass(), "id", term670);
        setField(term669, term669.getClass(), "imageUrl", "xLbjWUgOIL");
        setField(term669, term669.getClass(), "order", term684);
        setField(term669, term669.getClass(), "text", "jDtqGUpnZN");
        setField(term669, term669.getClass(), "base64FileEncoded", "nGKItKLYNC");
        setField(term669, term669.getClass(), "contentType", "UiUYnPrcCi");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.mapper.SlideEntityMapper");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.alkemy.ong.domain.Slide");
        Object[] args = new Object[1];
        args[0] = term669;
        callMethod(klass, "toEntity", argTypes, term668, args);
    }

};


