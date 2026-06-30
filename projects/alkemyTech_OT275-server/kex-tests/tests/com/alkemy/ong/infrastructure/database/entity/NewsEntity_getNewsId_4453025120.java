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

public class NewsEntity_getNewsId_4453025120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public NewsEntity_getNewsId_4453025120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2 = new Long(2442117782898005296L);
        Long term41 = new Long(6375119433582206027L);
        term1 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.NewsEntity"));
        Object term40 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.CategoryEntity"));
        Object term79 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term83 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term1, term1.getClass(), "newsId", term2);
        setField(term1, term1.getClass(), "name", "PAEBtnZtTD");
        setField(term1, term1.getClass(), "content", "sjlJAEtRrb");
        setField(term1, term1.getClass(), "imageUrl", "MuLcgQHgqz");
        setField(term40, term40.getClass(), "categoryId", term41);
        setField(term40, term40.getClass(), "name", "xxtlPwDYFs");
        setField(term40, term40.getClass(), "description", "jJCZpVmanW");
        setField(term40, term40.getClass(), "imageUrl", "EGtDIRbSSb");
        setIntField(term79, term79.getClass(), "nanos", 244000000);
        setLongField(term79, term79.getClass(), "fastTime", 1345860612000L);
        setField(term79, term79.getClass(), "cdate", null);
        setField(term40, term40.getClass(), "createTimestamp", term79);
        setBooleanField(term40, term40.getClass(), "softDeleted", false);
        setField(term1, term1.getClass(), "category", term40);
        setIntField(term83, term83.getClass(), "nanos", 369000000);
        setLongField(term83, term83.getClass(), "fastTime", 1480427551000L);
        setField(term83, term83.getClass(), "cdate", null);
        setField(term1, term1.getClass(), "createTimestamp", term83);
        setBooleanField(term1, term1.getClass(), "softDeleted", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.NewsEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNewsId", argTypes, term1, args);
    }

};


