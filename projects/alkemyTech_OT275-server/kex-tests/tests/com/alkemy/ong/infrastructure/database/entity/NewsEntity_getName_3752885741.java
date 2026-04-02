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
import java.lang.Object;

public class NewsEntity_getName_3752885741 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term147;

    public NewsEntity_getName_3752885741() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term148 = new Long(-8257434502486459194L);
        Long term187 = new Long(-8400487765614892086L);
        term147 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.NewsEntity"));
        Object term186 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.CategoryEntity"));
        Object term225 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term229 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term147, term147.getClass(), "newsId", term148);
        setField(term147, term147.getClass(), "name", "SzjVpOQTyS");
        setField(term147, term147.getClass(), "content", "MjGYSRKTNF");
        setField(term147, term147.getClass(), "imageUrl", "hRNSzYYIrc");
        setField(term186, term186.getClass(), "categoryId", term187);
        setField(term186, term186.getClass(), "name", "RMFIsYGgne");
        setField(term186, term186.getClass(), "description", "NRdvgJlhkX");
        setField(term186, term186.getClass(), "imageUrl", "uuaPigETmJ");
        setIntField(term225, term225.getClass(), "nanos", 830000000);
        setLongField(term225, term225.getClass(), "fastTime", 1610929382000L);
        setField(term225, term225.getClass(), "cdate", null);
        setField(term186, term186.getClass(), "createTimestamp", term225);
        setBooleanField(term186, term186.getClass(), "softDeleted", false);
        setField(term147, term147.getClass(), "category", term186);
        setIntField(term229, term229.getClass(), "nanos", 837000000);
        setLongField(term229, term229.getClass(), "fastTime", 1606034835000L);
        setField(term229, term229.getClass(), "cdate", null);
        setField(term147, term147.getClass(), "createTimestamp", term229);
        setBooleanField(term147, term147.getClass(), "softDeleted", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.NewsEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term147, args);
    }

};


