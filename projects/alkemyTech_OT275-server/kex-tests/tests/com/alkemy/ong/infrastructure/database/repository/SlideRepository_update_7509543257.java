package com.alkemy.ong.infrastructure.database.repository;

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
import static com.alkemy.ong.infrastructure.database.repository.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Integer;

public class SlideRepository_update_7509543257 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term910;

    public SlideRepository_update_7509543257() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term911 = new Long(2936323121573284007L);
        Integer term925 = new Integer(1162663216);
        term910 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term910, term910.getClass(), "id", term911);
        setField(term910, term910.getClass(), "imageUrl", "HWkpTmtlrc");
        setField(term910, term910.getClass(), "order", term925);
        setField(term910, term910.getClass(), "text", "hMmaoREuCK");
        setField(term910, term910.getClass(), "base64FileEncoded", "VeDtgDzGAN");
        setField(term910, term910.getClass(), "contentType", "aWYOWZFyaX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.repository.SlideRepository");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.alkemy.ong.domain.Slide");
        Object[] args = new Object[1];
        args[0] = term910;
        callMethod(klass, "update", argTypes, null, args);
    }

};


