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

public class NewsEntity_getContent_14351847002 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term293;

    public NewsEntity_getContent_14351847002() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term294 = new Long(5270370404989704783L);
        Long term333 = new Long(7411271909051562686L);
        term293 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.NewsEntity"));
        Object term332 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.CategoryEntity"));
        Object term371 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term375 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term293, term293.getClass(), "newsId", term294);
        setField(term293, term293.getClass(), "name", "MxlszYVzRf");
        setField(term293, term293.getClass(), "content", "LQFpaHEwXR");
        setField(term293, term293.getClass(), "imageUrl", "oVcInYnLWB");
        setField(term332, term332.getClass(), "categoryId", term333);
        setField(term332, term332.getClass(), "name", "aJlieCFVtF");
        setField(term332, term332.getClass(), "description", "ZiaGIbnzTs");
        setField(term332, term332.getClass(), "imageUrl", "tbcdzjIfER");
        setIntField(term371, term371.getClass(), "nanos", 302000000);
        setLongField(term371, term371.getClass(), "fastTime", 1442628765000L);
        setField(term371, term371.getClass(), "cdate", null);
        setField(term332, term332.getClass(), "createTimestamp", term371);
        setBooleanField(term332, term332.getClass(), "softDeleted", true);
        setField(term293, term293.getClass(), "category", term332);
        setIntField(term375, term375.getClass(), "nanos", 18000000);
        setLongField(term375, term375.getClass(), "fastTime", 1515879330000L);
        setField(term375, term375.getClass(), "cdate", null);
        setField(term293, term293.getClass(), "createTimestamp", term375);
        setBooleanField(term293, term293.getClass(), "softDeleted", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.NewsEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getContent", argTypes, term293, args);
    }

};


