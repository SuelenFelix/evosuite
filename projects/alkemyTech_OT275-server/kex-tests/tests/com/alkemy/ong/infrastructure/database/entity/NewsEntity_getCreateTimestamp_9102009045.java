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

public class NewsEntity_getCreateTimestamp_9102009045 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term731;

    public NewsEntity_getCreateTimestamp_9102009045() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term732 = new Long(-2813493605142626659L);
        Long term771 = new Long(-8885298608300233488L);
        term731 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.NewsEntity"));
        Object term770 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.CategoryEntity"));
        Object term809 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term813 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term731, term731.getClass(), "newsId", term732);
        setField(term731, term731.getClass(), "name", "OWDIEULEFu");
        setField(term731, term731.getClass(), "content", "dWRymuLBtr");
        setField(term731, term731.getClass(), "imageUrl", "AijpHYOFuy");
        setField(term770, term770.getClass(), "categoryId", term771);
        setField(term770, term770.getClass(), "name", "SbAoxhfrkn");
        setField(term770, term770.getClass(), "description", "kuTXqwMtDB");
        setField(term770, term770.getClass(), "imageUrl", "Ghbwtircqb");
        setIntField(term809, term809.getClass(), "nanos", 25000000);
        setLongField(term809, term809.getClass(), "fastTime", 1797192828000L);
        setField(term809, term809.getClass(), "cdate", null);
        setField(term770, term770.getClass(), "createTimestamp", term809);
        setBooleanField(term770, term770.getClass(), "softDeleted", false);
        setField(term731, term731.getClass(), "category", term770);
        setIntField(term813, term813.getClass(), "nanos", 30000000);
        setLongField(term813, term813.getClass(), "fastTime", 1589447121000L);
        setField(term813, term813.getClass(), "cdate", null);
        setField(term731, term731.getClass(), "createTimestamp", term813);
        setBooleanField(term731, term731.getClass(), "softDeleted", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.NewsEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCreateTimestamp", argTypes, term731, args);
    }

};


