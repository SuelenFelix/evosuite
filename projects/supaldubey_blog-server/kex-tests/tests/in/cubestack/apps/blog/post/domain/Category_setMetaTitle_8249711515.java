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

public class Category_setMetaTitle_8249711515 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82262;

    public Category_setMetaTitle_8249711515() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term82311 = new ArrayList();
        Long term82315 = new Long(5914809586547397675L);
        term82262 = newInstance(Class.forName("in.cubestack.apps.blog.post.domain.Category"));
        Object term82317 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term82318 = newInstance(Class.forName("java.time.LocalDate"));
        Object term82322 = newInstance(Class.forName("java.time.LocalTime"));
        Object term82327 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term82328 = newInstance(Class.forName("java.time.LocalDate"));
        Object term82332 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term82262, term82262.getClass(), "title", "pehbaguHxu");
        setField(term82262, term82262.getClass(), "metaTitle", "pcQcluzQgA");
        setField(term82262, term82262.getClass(), "slug", "iWOGNdtCLH");
        setField(term82262, term82262.getClass(), "content", "KoDRiNjUMj");
        setField(term82262, term82262.getClass(), "postCategories", term82311);
        setField(term82262, term82262.getClass(), "id", term82315);
        setIntField(term82318, term82318.getClass(), "year", 2025);
        setShortField(term82318, term82318.getClass(), "month", (short) 7);
        setShortField(term82318, term82318.getClass(), "day", (short) 2);
        setField(term82317, term82317.getClass(), "date", term82318);
        setByteField(term82322, term82322.getClass(), "hour", (byte) 16);
        setByteField(term82322, term82322.getClass(), "minute", (byte) 12);
        setByteField(term82322, term82322.getClass(), "second", (byte) 51);
        setIntField(term82322, term82322.getClass(), "nano", 833941622);
        setField(term82317, term82317.getClass(), "time", term82322);
        setField(term82262, term82262.getClass(), "createdAt", term82317);
        setIntField(term82328, term82328.getClass(), "year", 2017);
        setShortField(term82328, term82328.getClass(), "month", (short) 1);
        setShortField(term82328, term82328.getClass(), "day", (short) 15);
        setField(term82327, term82327.getClass(), "date", term82328);
        setByteField(term82332, term82332.getClass(), "hour", (byte) 8);
        setByteField(term82332, term82332.getClass(), "minute", (byte) 47);
        setByteField(term82332, term82332.getClass(), "second", (byte) 25);
        setIntField(term82332, term82332.getClass(), "nano", 337248129);
        setField(term82327, term82327.getClass(), "time", term82332);
        setField(term82262, term82262.getClass(), "updatedAt", term82327);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.post.domain.Category");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "LtnegjrHqS";
        callMethod(klass, "setMetaTitle", argTypes, term82262, args);
    }

};


