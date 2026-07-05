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

public class NewsEntity_getImageUrl_15266803953 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term439;

    public NewsEntity_getImageUrl_15266803953() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term440 = new Long(4872422362414183754L);
        Long term479 = new Long(6811161968424632369L);
        term439 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.NewsEntity"));
        Object term478 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.CategoryEntity"));
        Object term517 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term521 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term439, term439.getClass(), "newsId", term440);
        setField(term439, term439.getClass(), "name", "HyxfbSQYBe");
        setField(term439, term439.getClass(), "content", "pCTimMblYc");
        setField(term439, term439.getClass(), "imageUrl", "hNxWaHcfhY");
        setField(term478, term478.getClass(), "categoryId", term479);
        setField(term478, term478.getClass(), "name", "RkybSrpybU");
        setField(term478, term478.getClass(), "description", "xOEqzGAmDU");
        setField(term478, term478.getClass(), "imageUrl", "eZFUvlxvGV");
        setIntField(term517, term517.getClass(), "nanos", 389000000);
        setLongField(term517, term517.getClass(), "fastTime", 1429013051000L);
        setField(term517, term517.getClass(), "cdate", null);
        setField(term478, term478.getClass(), "createTimestamp", term517);
        setBooleanField(term478, term478.getClass(), "softDeleted", true);
        setField(term439, term439.getClass(), "category", term478);
        setIntField(term521, term521.getClass(), "nanos", 288000000);
        setLongField(term521, term521.getClass(), "fastTime", 1495346663000L);
        setField(term521, term521.getClass(), "cdate", null);
        setField(term439, term439.getClass(), "createTimestamp", term521);
        setBooleanField(term439, term439.getClass(), "softDeleted", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.NewsEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getImageUrl", argTypes, term439, args);
    }

};


