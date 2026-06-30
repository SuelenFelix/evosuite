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

public class NewsEntity_getCategory_11868002904 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term585;

    public NewsEntity_getCategory_11868002904() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term586 = new Long(-7237588299778557629L);
        Long term625 = new Long(6967924379644551255L);
        term585 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.NewsEntity"));
        Object term624 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.CategoryEntity"));
        Object term663 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term667 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term585, term585.getClass(), "newsId", term586);
        setField(term585, term585.getClass(), "name", "BYqFIqCKAV");
        setField(term585, term585.getClass(), "content", "vrQLuWIDJX");
        setField(term585, term585.getClass(), "imageUrl", "flxyYxBRtu");
        setField(term624, term624.getClass(), "categoryId", term625);
        setField(term624, term624.getClass(), "name", "OclPbYPkcH");
        setField(term624, term624.getClass(), "description", "IoAlmYsBwc");
        setField(term624, term624.getClass(), "imageUrl", "TEParAifyi");
        setIntField(term663, term663.getClass(), "nanos", 896000000);
        setLongField(term663, term663.getClass(), "fastTime", 1645823234000L);
        setField(term663, term663.getClass(), "cdate", null);
        setField(term624, term624.getClass(), "createTimestamp", term663);
        setBooleanField(term624, term624.getClass(), "softDeleted", false);
        setField(term585, term585.getClass(), "category", term624);
        setIntField(term667, term667.getClass(), "nanos", 23000000);
        setLongField(term667, term667.getClass(), "fastTime", 1500710268000L);
        setField(term667, term667.getClass(), "cdate", null);
        setField(term585, term585.getClass(), "createTimestamp", term667);
        setBooleanField(term585, term585.getClass(), "softDeleted", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.NewsEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCategory", argTypes, term585, args);
    }

};


