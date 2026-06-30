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

public class Category_getMetaTitle_9877285914 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82147;

    public Category_getMetaTitle_9877285914() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term82196 = new ArrayList();
        Long term82200 = new Long(3900637824492447206L);
        term82147 = newInstance(Class.forName("in.cubestack.apps.blog.post.domain.Category"));
        Object term82202 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term82203 = newInstance(Class.forName("java.time.LocalDate"));
        Object term82207 = newInstance(Class.forName("java.time.LocalTime"));
        Object term82212 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term82213 = newInstance(Class.forName("java.time.LocalDate"));
        Object term82217 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term82147, term82147.getClass(), "title", "kfguTpQAqI");
        setField(term82147, term82147.getClass(), "metaTitle", "YcPukufpJs");
        setField(term82147, term82147.getClass(), "slug", "vvGshYKSpj");
        setField(term82147, term82147.getClass(), "content", "haqqYHJKqP");
        setField(term82147, term82147.getClass(), "postCategories", term82196);
        setField(term82147, term82147.getClass(), "id", term82200);
        setIntField(term82203, term82203.getClass(), "year", 2022);
        setShortField(term82203, term82203.getClass(), "month", (short) 4);
        setShortField(term82203, term82203.getClass(), "day", (short) 23);
        setField(term82202, term82202.getClass(), "date", term82203);
        setByteField(term82207, term82207.getClass(), "hour", (byte) 7);
        setByteField(term82207, term82207.getClass(), "minute", (byte) 9);
        setByteField(term82207, term82207.getClass(), "second", (byte) 27);
        setIntField(term82207, term82207.getClass(), "nano", 843142535);
        setField(term82202, term82202.getClass(), "time", term82207);
        setField(term82147, term82147.getClass(), "createdAt", term82202);
        setIntField(term82213, term82213.getClass(), "year", 2014);
        setShortField(term82213, term82213.getClass(), "month", (short) 8);
        setShortField(term82213, term82213.getClass(), "day", (short) 14);
        setField(term82212, term82212.getClass(), "date", term82213);
        setByteField(term82217, term82217.getClass(), "hour", (byte) 7);
        setByteField(term82217, term82217.getClass(), "minute", (byte) 13);
        setByteField(term82217, term82217.getClass(), "second", (byte) 55);
        setIntField(term82217, term82217.getClass(), "nano", 81566526);
        setField(term82212, term82212.getClass(), "time", term82217);
        setField(term82147, term82147.getClass(), "updatedAt", term82212);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.post.domain.Category");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMetaTitle", argTypes, term82147, args);
    }

};


