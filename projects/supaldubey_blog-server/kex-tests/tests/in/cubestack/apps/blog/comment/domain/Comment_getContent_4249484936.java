package in.cubestack.apps.blog.comment.domain;

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
import static in.cubestack.apps.blog.comment.domain.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.lang.Long;

public class Comment_getContent_4249484936 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2511;

    public Comment_getContent_4249484936() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2614 = Class.forName((String) "in.cubestack.apps.blog.comment.domain.CommentStatus");
        Field term2613 = ((Class) term2614).getDeclaredField((String) "PUBLISHED");
        ((Field) term2613).setAccessible(true);
        Object enum6 = ((Field) term2613).get((Object) null);
        Long term2571 = new Long(7411271909051562686L);
        term2511 = newInstance(Class.forName("in.cubestack.apps.blog.comment.domain.Comment"));
        Object term2561 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2562 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2566 = newInstance(Class.forName("java.time.LocalTime"));
        Object term2573 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2574 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2578 = newInstance(Class.forName("java.time.LocalTime"));
        Object term2583 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2584 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2588 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term2511, term2511.getClass(), "title", "eZFUvlxvGV");
        setField(term2511, term2511.getClass(), "commenterId", "BYqFIqCKAV");
        setField(term2511, term2511.getClass(), "status", enum6);
        setField(term2511, term2511.getClass(), "content", "vrQLuWIDJX");
        setIntField(term2562, term2562.getClass(), "year", 2017);
        setShortField(term2562, term2562.getClass(), "month", (short) 6);
        setShortField(term2562, term2562.getClass(), "day", (short) 8);
        setField(term2561, term2561.getClass(), "date", term2562);
        setByteField(term2566, term2566.getClass(), "hour", (byte) 0);
        setByteField(term2566, term2566.getClass(), "minute", (byte) 18);
        setByteField(term2566, term2566.getClass(), "second", (byte) 55);
        setIntField(term2566, term2566.getClass(), "nano", 680586717);
        setField(term2561, term2561.getClass(), "time", term2566);
        setField(term2511, term2511.getClass(), "publishedAt", term2561);
        setField(term2511, term2511.getClass(), "id", term2571);
        setIntField(term2574, term2574.getClass(), "year", 2015);
        setShortField(term2574, term2574.getClass(), "month", (short) 9);
        setShortField(term2574, term2574.getClass(), "day", (short) 16);
        setField(term2573, term2573.getClass(), "date", term2574);
        setByteField(term2578, term2578.getClass(), "hour", (byte) 6);
        setByteField(term2578, term2578.getClass(), "minute", (byte) 19);
        setByteField(term2578, term2578.getClass(), "second", (byte) 42);
        setIntField(term2578, term2578.getClass(), "nano", 630084975);
        setField(term2573, term2573.getClass(), "time", term2578);
        setField(term2511, term2511.getClass(), "createdAt", term2573);
        setIntField(term2584, term2584.getClass(), "year", 2029);
        setShortField(term2584, term2584.getClass(), "month", (short) 6);
        setShortField(term2584, term2584.getClass(), "day", (short) 23);
        setField(term2583, term2583.getClass(), "date", term2584);
        setByteField(term2588, term2588.getClass(), "hour", (byte) 21);
        setByteField(term2588, term2588.getClass(), "minute", (byte) 55);
        setByteField(term2588, term2588.getClass(), "second", (byte) 27);
        setIntField(term2588, term2588.getClass(), "nano", 66889274);
        setField(term2583, term2583.getClass(), "time", term2588);
        setField(term2511, term2511.getClass(), "updatedAt", term2583);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.comment.domain.Comment");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getContent", argTypes, term2511, args);
    }

};


