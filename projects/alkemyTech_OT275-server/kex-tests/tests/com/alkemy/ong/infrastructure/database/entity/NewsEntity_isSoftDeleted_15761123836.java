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

public class NewsEntity_isSoftDeleted_15761123836 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term877;

    public NewsEntity_isSoftDeleted_15761123836() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term878 = new Long(-4325723315152823407L);
        Long term917 = new Long(2535595959091595249L);
        term877 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.NewsEntity"));
        Object term916 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.CategoryEntity"));
        Object term955 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term959 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term877, term877.getClass(), "newsId", term878);
        setField(term877, term877.getClass(), "name", "xrwlQZdwCp");
        setField(term877, term877.getClass(), "content", "IDCWpPLRkE");
        setField(term877, term877.getClass(), "imageUrl", "nyiiPDVjAc");
        setField(term916, term916.getClass(), "categoryId", term917);
        setField(term916, term916.getClass(), "name", "aKnKipADSo");
        setField(term916, term916.getClass(), "description", "wSQxaModmm");
        setField(term916, term916.getClass(), "imageUrl", "UlajhuVLaP");
        setIntField(term955, term955.getClass(), "nanos", 80000000);
        setLongField(term955, term955.getClass(), "fastTime", 1745452162000L);
        setField(term955, term955.getClass(), "cdate", null);
        setField(term916, term916.getClass(), "createTimestamp", term955);
        setBooleanField(term916, term916.getClass(), "softDeleted", false);
        setField(term877, term877.getClass(), "category", term916);
        setIntField(term959, term959.getClass(), "nanos", 960000000);
        setLongField(term959, term959.getClass(), "fastTime", 1349058953000L);
        setField(term959, term959.getClass(), "cdate", null);
        setField(term877, term877.getClass(), "createTimestamp", term959);
        setBooleanField(term877, term877.getClass(), "softDeleted", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.NewsEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isSoftDeleted", argTypes, term877, args);
    }

};


