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

public class NewsEntity_setNewsId_21334286547 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1023;
     Object term1109;

    public NewsEntity_setNewsId_21334286547() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1024 = new Long(-5476826692763582090L);
        Long term1063 = new Long(-872011222785455006L);
        term1023 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.NewsEntity"));
        Object term1062 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.CategoryEntity"));
        Object term1101 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term1105 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term1023, term1023.getClass(), "newsId", term1024);
        setField(term1023, term1023.getClass(), "name", "gGSMzuGICf");
        setField(term1023, term1023.getClass(), "content", "hxCBltsObl");
        setField(term1023, term1023.getClass(), "imageUrl", "BndsHwAFMv");
        setField(term1062, term1062.getClass(), "categoryId", term1063);
        setField(term1062, term1062.getClass(), "name", "GzFkzHGYFt");
        setField(term1062, term1062.getClass(), "description", "tShwQLRGNe");
        setField(term1062, term1062.getClass(), "imageUrl", "LvtrsXUliU");
        setIntField(term1101, term1101.getClass(), "nanos", 457000000);
        setLongField(term1101, term1101.getClass(), "fastTime", 1706067372000L);
        setField(term1101, term1101.getClass(), "cdate", null);
        setField(term1062, term1062.getClass(), "createTimestamp", term1101);
        setBooleanField(term1062, term1062.getClass(), "softDeleted", false);
        setField(term1023, term1023.getClass(), "category", term1062);
        setIntField(term1105, term1105.getClass(), "nanos", 992000000);
        setLongField(term1105, term1105.getClass(), "fastTime", 1863620294000L);
        setField(term1105, term1105.getClass(), "cdate", null);
        setField(term1023, term1023.getClass(), "createTimestamp", term1105);
        setBooleanField(term1023, term1023.getClass(), "softDeleted", false);
        term1109 = new Long(-316468845751588286L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.NewsEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term1109;
        callMethod(klass, "setNewsId", argTypes, term1023, args);
    }

};


