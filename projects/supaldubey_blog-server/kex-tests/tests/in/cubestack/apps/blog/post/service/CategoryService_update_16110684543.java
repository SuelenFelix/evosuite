package in.cubestack.apps.blog.post.service;

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
import static in.cubestack.apps.blog.post.service.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Long;
import java.lang.Object;

public class CategoryService_update_16110684543 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term277;

    public CategoryService_update_16110684543() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term326 = new ArrayList();
        Long term330 = new Long(-8257434502486459194L);
        term277 = newInstance(Class.forName("in.cubestack.apps.blog.post.domain.Category"));
        Object term332 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term333 = newInstance(Class.forName("java.time.LocalDate"));
        Object term337 = newInstance(Class.forName("java.time.LocalTime"));
        Object term342 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term343 = newInstance(Class.forName("java.time.LocalDate"));
        Object term347 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term277, term277.getClass(), "title", "MxlszYVzRf");
        setField(term277, term277.getClass(), "metaTitle", "LQFpaHEwXR");
        setField(term277, term277.getClass(), "slug", "oVcInYnLWB");
        setField(term277, term277.getClass(), "content", "aJlieCFVtF");
        setField(term277, term277.getClass(), "postCategories", term326);
        setField(term277, term277.getClass(), "id", term330);
        setIntField(term333, term333.getClass(), "year", 2012);
        setShortField(term333, term333.getClass(), "month", (short) 8);
        setShortField(term333, term333.getClass(), "day", (short) 25);
        setField(term332, term332.getClass(), "date", term333);
        setByteField(term337, term337.getClass(), "hour", (byte) 5);
        setByteField(term337, term337.getClass(), "minute", (byte) 20);
        setByteField(term337, term337.getClass(), "second", (byte) 50);
        setIntField(term337, term337.getClass(), "nano", 345595912);
        setField(term332, term332.getClass(), "time", term337);
        setField(term277, term277.getClass(), "createdAt", term332);
        setIntField(term343, term343.getClass(), "year", 2021);
        setShortField(term343, term343.getClass(), "month", (short) 1);
        setShortField(term343, term343.getClass(), "day", (short) 18);
        setField(term342, term342.getClass(), "date", term343);
        setByteField(term347, term347.getClass(), "hour", (byte) 13);
        setByteField(term347, term347.getClass(), "minute", (byte) 38);
        setByteField(term347, term347.getClass(), "second", (byte) 26);
        setIntField(term347, term347.getClass(), "nano", 544608644);
        setField(term342, term342.getClass(), "time", term347);
        setField(term277, term277.getClass(), "updatedAt", term342);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.post.service.CategoryService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("in.cubestack.apps.blog.post.domain.Category");
        Object[] args = new Object[1];
        args[0] = term277;
        callMethod(klass, "update", argTypes, null, args);
    }

};


