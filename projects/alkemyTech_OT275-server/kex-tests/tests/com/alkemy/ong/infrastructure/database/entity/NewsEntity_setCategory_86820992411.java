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

public class NewsEntity_setCategory_86820992411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1675;
     Object term1761;

    public NewsEntity_setCategory_86820992411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1676 = new Long(-4365849114644724155L);
        Long term1715 = new Long(2486810210675247493L);
        term1675 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.NewsEntity"));
        Object term1714 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.CategoryEntity"));
        Object term1753 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term1757 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term1675, term1675.getClass(), "newsId", term1676);
        setField(term1675, term1675.getClass(), "name", "bLPjGVBhlX");
        setField(term1675, term1675.getClass(), "content", "whBvTVIIlC");
        setField(term1675, term1675.getClass(), "imageUrl", "IgRJUzaCwW");
        setField(term1714, term1714.getClass(), "categoryId", term1715);
        setField(term1714, term1714.getClass(), "name", "JUmudUmaaV");
        setField(term1714, term1714.getClass(), "description", "KoyGrUJeJW");
        setField(term1714, term1714.getClass(), "imageUrl", "HqBOwkVqjD");
        setIntField(term1753, term1753.getClass(), "nanos", 394000000);
        setLongField(term1753, term1753.getClass(), "fastTime", 1538068116000L);
        setField(term1753, term1753.getClass(), "cdate", null);
        setField(term1714, term1714.getClass(), "createTimestamp", term1753);
        setBooleanField(term1714, term1714.getClass(), "softDeleted", true);
        setField(term1675, term1675.getClass(), "category", term1714);
        setIntField(term1757, term1757.getClass(), "nanos", 937000000);
        setLongField(term1757, term1757.getClass(), "fastTime", 1744079265000L);
        setField(term1757, term1757.getClass(), "cdate", null);
        setField(term1675, term1675.getClass(), "createTimestamp", term1757);
        setBooleanField(term1675, term1675.getClass(), "softDeleted", true);
        Long term1762 = new Long(7009926388951271268L);
        term1761 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.CategoryEntity"));
        Object term1800 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term1761, term1761.getClass(), "categoryId", term1762);
        setField(term1761, term1761.getClass(), "name", "MAcUBcBckh");
        setField(term1761, term1761.getClass(), "description", "oVgzLbrsFr");
        setField(term1761, term1761.getClass(), "imageUrl", "vQVyKLdtaz");
        setIntField(term1800, term1800.getClass(), "nanos", 385000000);
        setLongField(term1800, term1800.getClass(), "fastTime", 1347389761000L);
        setField(term1800, term1800.getClass(), "cdate", null);
        setField(term1761, term1761.getClass(), "createTimestamp", term1800);
        setBooleanField(term1761, term1761.getClass(), "softDeleted", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.NewsEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.alkemy.ong.infrastructure.database.entity.CategoryEntity");
        Object[] args = new Object[1];
        args[0] = term1761;
        callMethod(klass, "setCategory", argTypes, term1675, args);
    }

};


