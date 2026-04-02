package in.cubestack.apps.blog.post.domain;

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
import static in.cubestack.apps.blog.post.domain.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Long;
import java.lang.Object;

public class Category_setTitle_15256855583 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82010;

    public Category_setTitle_15256855583() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term82059 = new ArrayList();
        Long term82063 = new Long(-351840430901591519L);
        term82010 = newInstance(Class.forName("in.cubestack.apps.blog.post.domain.Category"));
        Object term82065 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term82066 = newInstance(Class.forName("java.time.LocalDate"));
        Object term82070 = newInstance(Class.forName("java.time.LocalTime"));
        Object term82075 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term82076 = newInstance(Class.forName("java.time.LocalDate"));
        Object term82080 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term82010, term82010.getClass(), "title", "uPuFIjvpsv");
        setField(term82010, term82010.getClass(), "metaTitle", "zNKHFvTvNQ");
        setField(term82010, term82010.getClass(), "slug", "cyqgSKerVH");
        setField(term82010, term82010.getClass(), "content", "KMFbAPDgQN");
        setField(term82010, term82010.getClass(), "postCategories", term82059);
        setField(term82010, term82010.getClass(), "id", term82063);
        setIntField(term82066, term82066.getClass(), "year", 2019);
        setShortField(term82066, term82066.getClass(), "month", (short) 7);
        setShortField(term82066, term82066.getClass(), "day", (short) 18);
        setField(term82065, term82065.getClass(), "date", term82066);
        setByteField(term82070, term82070.getClass(), "hour", (byte) 6);
        setByteField(term82070, term82070.getClass(), "minute", (byte) 12);
        setByteField(term82070, term82070.getClass(), "second", (byte) 52);
        setIntField(term82070, term82070.getClass(), "nano", 355715571);
        setField(term82065, term82065.getClass(), "time", term82070);
        setField(term82010, term82010.getClass(), "createdAt", term82065);
        setIntField(term82076, term82076.getClass(), "year", 2018);
        setShortField(term82076, term82076.getClass(), "month", (short) 3);
        setShortField(term82076, term82076.getClass(), "day", (short) 18);
        setField(term82075, term82075.getClass(), "date", term82076);
        setByteField(term82080, term82080.getClass(), "hour", (byte) 9);
        setByteField(term82080, term82080.getClass(), "minute", (byte) 6);
        setByteField(term82080, term82080.getClass(), "second", (byte) 2);
        setIntField(term82080, term82080.getClass(), "nano", 689374698);
        setField(term82075, term82075.getClass(), "time", term82080);
        setField(term82010, term82010.getClass(), "updatedAt", term82075);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.post.domain.Category");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "pOXTylvole";
        callMethod(klass, "setTitle", argTypes, term82010, args);
    }

};


