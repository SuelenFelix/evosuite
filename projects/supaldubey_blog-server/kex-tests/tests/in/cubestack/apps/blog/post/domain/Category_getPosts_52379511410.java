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

public class Category_getPosts_52379511410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82903;

    public Category_getPosts_52379511410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term82952 = new ArrayList();
        Long term82956 = new Long(-9187816361133186528L);
        term82903 = newInstance(Class.forName("in.cubestack.apps.blog.post.domain.Category"));
        Object term82958 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term82959 = newInstance(Class.forName("java.time.LocalDate"));
        Object term82963 = newInstance(Class.forName("java.time.LocalTime"));
        Object term82968 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term82969 = newInstance(Class.forName("java.time.LocalDate"));
        Object term82973 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term82903, term82903.getClass(), "title", "fIMpTnCtOM");
        setField(term82903, term82903.getClass(), "metaTitle", "zsVQmqfyvx");
        setField(term82903, term82903.getClass(), "slug", "DKFEMZUVhd");
        setField(term82903, term82903.getClass(), "content", "xhjqWwsjmc");
        setField(term82903, term82903.getClass(), "postCategories", term82952);
        setField(term82903, term82903.getClass(), "id", term82956);
        setIntField(term82959, term82959.getClass(), "year", 2017);
        setShortField(term82959, term82959.getClass(), "month", (short) 2);
        setShortField(term82959, term82959.getClass(), "day", (short) 22);
        setField(term82958, term82958.getClass(), "date", term82959);
        setByteField(term82963, term82963.getClass(), "hour", (byte) 20);
        setByteField(term82963, term82963.getClass(), "minute", (byte) 59);
        setByteField(term82963, term82963.getClass(), "second", (byte) 8);
        setIntField(term82963, term82963.getClass(), "nano", 864237115);
        setField(term82958, term82958.getClass(), "time", term82963);
        setField(term82903, term82903.getClass(), "createdAt", term82958);
        setIntField(term82969, term82969.getClass(), "year", 2010);
        setShortField(term82969, term82969.getClass(), "month", (short) 7);
        setShortField(term82969, term82969.getClass(), "day", (short) 26);
        setField(term82968, term82968.getClass(), "date", term82969);
        setByteField(term82973, term82973.getClass(), "hour", (byte) 7);
        setByteField(term82973, term82973.getClass(), "minute", (byte) 19);
        setByteField(term82973, term82973.getClass(), "second", (byte) 57);
        setIntField(term82973, term82973.getClass(), "nano", 579137908);
        setField(term82968, term82968.getClass(), "time", term82973);
        setField(term82903, term82903.getClass(), "updatedAt", term82968);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.post.domain.Category");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPosts", argTypes, term82903, args);
    }

};


