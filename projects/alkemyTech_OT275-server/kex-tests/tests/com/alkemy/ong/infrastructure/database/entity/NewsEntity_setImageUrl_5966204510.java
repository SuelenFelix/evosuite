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

public class NewsEntity_setImageUrl_5966204510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1507;

    public NewsEntity_setImageUrl_5966204510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1508 = new Long(-2585684163342970173L);
        Long term1547 = new Long(8059786003080744426L);
        term1507 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.NewsEntity"));
        Object term1546 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.CategoryEntity"));
        Object term1585 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term1589 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term1507, term1507.getClass(), "newsId", term1508);
        setField(term1507, term1507.getClass(), "name", "hoicvmsovO");
        setField(term1507, term1507.getClass(), "content", "eqJfYWRaEL");
        setField(term1507, term1507.getClass(), "imageUrl", "fhkbdRViHi");
        setField(term1546, term1546.getClass(), "categoryId", term1547);
        setField(term1546, term1546.getClass(), "name", "uWHnvSvaPl");
        setField(term1546, term1546.getClass(), "description", "kBdSllIBVz");
        setField(term1546, term1546.getClass(), "imageUrl", "TJmVBGfTML");
        setIntField(term1585, term1585.getClass(), "nanos", 689000000);
        setLongField(term1585, term1585.getClass(), "fastTime", 1550688194000L);
        setField(term1585, term1585.getClass(), "cdate", null);
        setField(term1546, term1546.getClass(), "createTimestamp", term1585);
        setBooleanField(term1546, term1546.getClass(), "softDeleted", true);
        setField(term1507, term1507.getClass(), "category", term1546);
        setIntField(term1589, term1589.getClass(), "nanos", 131000000);
        setLongField(term1589, term1589.getClass(), "fastTime", 1804987287000L);
        setField(term1589, term1589.getClass(), "cdate", null);
        setField(term1507, term1507.getClass(), "createTimestamp", term1589);
        setBooleanField(term1507, term1507.getClass(), "softDeleted", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.NewsEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "tPlsykYBqO";
        callMethod(klass, "setImageUrl", argTypes, term1507, args);
    }

};


