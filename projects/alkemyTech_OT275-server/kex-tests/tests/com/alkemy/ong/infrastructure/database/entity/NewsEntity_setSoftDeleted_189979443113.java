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
import java.lang.Boolean;

public class NewsEntity_setSoftDeleted_189979443113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2043;
     Object term2129;

    public NewsEntity_setSoftDeleted_189979443113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2044 = new Long(1967728129628047933L);
        Long term2083 = new Long(2120084523938730454L);
        term2043 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.NewsEntity"));
        Object term2082 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.CategoryEntity"));
        Object term2121 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term2125 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term2043, term2043.getClass(), "newsId", term2044);
        setField(term2043, term2043.getClass(), "name", "cAPeiZHKGJ");
        setField(term2043, term2043.getClass(), "content", "LvJFtLBaxj");
        setField(term2043, term2043.getClass(), "imageUrl", "PHvxnGHptP");
        setField(term2082, term2082.getClass(), "categoryId", term2083);
        setField(term2082, term2082.getClass(), "name", "TimdotUuNC");
        setField(term2082, term2082.getClass(), "description", "PkWMRdJcBb");
        setField(term2082, term2082.getClass(), "imageUrl", "jSpAteRute");
        setIntField(term2121, term2121.getClass(), "nanos", 573000000);
        setLongField(term2121, term2121.getClass(), "fastTime", 1329629467000L);
        setField(term2121, term2121.getClass(), "cdate", null);
        setField(term2082, term2082.getClass(), "createTimestamp", term2121);
        setBooleanField(term2082, term2082.getClass(), "softDeleted", false);
        setField(term2043, term2043.getClass(), "category", term2082);
        setIntField(term2125, term2125.getClass(), "nanos", 718000000);
        setLongField(term2125, term2125.getClass(), "fastTime", 1334842304000L);
        setField(term2125, term2125.getClass(), "cdate", null);
        setField(term2043, term2043.getClass(), "createTimestamp", term2125);
        setBooleanField(term2043, term2043.getClass(), "softDeleted", true);
        term2129 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.NewsEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term2129;
        callMethod(klass, "setSoftDeleted", argTypes, term2043, args);
    }

};


