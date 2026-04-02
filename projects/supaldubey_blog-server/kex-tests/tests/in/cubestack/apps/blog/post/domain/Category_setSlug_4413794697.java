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

public class Category_setSlug_4413794697 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82514;

    public Category_setSlug_4413794697() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term82563 = new ArrayList();
        Long term82567 = new Long(-5919044245258983254L);
        term82514 = newInstance(Class.forName("in.cubestack.apps.blog.post.domain.Category"));
        Object term82569 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term82570 = newInstance(Class.forName("java.time.LocalDate"));
        Object term82574 = newInstance(Class.forName("java.time.LocalTime"));
        Object term82579 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term82580 = newInstance(Class.forName("java.time.LocalDate"));
        Object term82584 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term82514, term82514.getClass(), "title", "eZUuWCoERR");
        setField(term82514, term82514.getClass(), "metaTitle", "AMeLarREbk");
        setField(term82514, term82514.getClass(), "slug", "LQHAihGqFG");
        setField(term82514, term82514.getClass(), "content", "XNHngduAPd");
        setField(term82514, term82514.getClass(), "postCategories", term82563);
        setField(term82514, term82514.getClass(), "id", term82567);
        setIntField(term82570, term82570.getClass(), "year", 2014);
        setShortField(term82570, term82570.getClass(), "month", (short) 5);
        setShortField(term82570, term82570.getClass(), "day", (short) 7);
        setField(term82569, term82569.getClass(), "date", term82570);
        setByteField(term82574, term82574.getClass(), "hour", (byte) 3);
        setByteField(term82574, term82574.getClass(), "minute", (byte) 29);
        setByteField(term82574, term82574.getClass(), "second", (byte) 53);
        setIntField(term82574, term82574.getClass(), "nano", 601925853);
        setField(term82569, term82569.getClass(), "time", term82574);
        setField(term82514, term82514.getClass(), "createdAt", term82569);
        setIntField(term82580, term82580.getClass(), "year", 2015);
        setShortField(term82580, term82580.getClass(), "month", (short) 12);
        setShortField(term82580, term82580.getClass(), "day", (short) 3);
        setField(term82579, term82579.getClass(), "date", term82580);
        setByteField(term82584, term82584.getClass(), "hour", (byte) 9);
        setByteField(term82584, term82584.getClass(), "minute", (byte) 57);
        setByteField(term82584, term82584.getClass(), "second", (byte) 8);
        setIntField(term82584, term82584.getClass(), "nano", 387525054);
        setField(term82579, term82579.getClass(), "time", term82584);
        setField(term82514, term82514.getClass(), "updatedAt", term82579);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.post.domain.Category");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ewowfKAPBz";
        callMethod(klass, "setSlug", argTypes, term82514, args);
    }

};


