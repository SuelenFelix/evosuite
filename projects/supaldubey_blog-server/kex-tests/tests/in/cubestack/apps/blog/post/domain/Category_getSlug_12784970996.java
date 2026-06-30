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

public class Category_getSlug_12784970996 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82399;

    public Category_getSlug_12784970996() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term82448 = new ArrayList();
        Long term82452 = new Long(-8946539398468447729L);
        term82399 = newInstance(Class.forName("in.cubestack.apps.blog.post.domain.Category"));
        Object term82454 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term82455 = newInstance(Class.forName("java.time.LocalDate"));
        Object term82459 = newInstance(Class.forName("java.time.LocalTime"));
        Object term82464 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term82465 = newInstance(Class.forName("java.time.LocalDate"));
        Object term82469 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term82399, term82399.getClass(), "title", "iSrYZvDgVF");
        setField(term82399, term82399.getClass(), "metaTitle", "uVYuAEBgZy");
        setField(term82399, term82399.getClass(), "slug", "pOAxvXmQfD");
        setField(term82399, term82399.getClass(), "content", "mvWHHiGYmD");
        setField(term82399, term82399.getClass(), "postCategories", term82448);
        setField(term82399, term82399.getClass(), "id", term82452);
        setIntField(term82455, term82455.getClass(), "year", 2028);
        setShortField(term82455, term82455.getClass(), "month", (short) 2);
        setShortField(term82455, term82455.getClass(), "day", (short) 27);
        setField(term82454, term82454.getClass(), "date", term82455);
        setByteField(term82459, term82459.getClass(), "hour", (byte) 2);
        setByteField(term82459, term82459.getClass(), "minute", (byte) 5);
        setByteField(term82459, term82459.getClass(), "second", (byte) 39);
        setIntField(term82459, term82459.getClass(), "nano", 353732819);
        setField(term82454, term82454.getClass(), "time", term82459);
        setField(term82399, term82399.getClass(), "createdAt", term82454);
        setIntField(term82465, term82465.getClass(), "year", 2012);
        setShortField(term82465, term82465.getClass(), "month", (short) 7);
        setShortField(term82465, term82465.getClass(), "day", (short) 25);
        setField(term82464, term82464.getClass(), "date", term82465);
        setByteField(term82469, term82469.getClass(), "hour", (byte) 10);
        setByteField(term82469, term82469.getClass(), "minute", (byte) 47);
        setByteField(term82469, term82469.getClass(), "second", (byte) 40);
        setIntField(term82469, term82469.getClass(), "nano", 235079109);
        setField(term82464, term82464.getClass(), "time", term82469);
        setField(term82399, term82399.getClass(), "updatedAt", term82464);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.post.domain.Category");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSlug", argTypes, term82399, args);
    }

};


