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

public class Comment_getPublishedAt_17907129937 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2912;

    public Comment_getPublishedAt_17907129937() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3015 = Class.forName((String) "in.cubestack.apps.blog.comment.domain.CommentStatus");
        Field term3014 = ((Class) term3015).getDeclaredField((String) "PUBLISHED");
        ((Field) term3014).setAccessible(true);
        Object enum7 = ((Field) term3014).get((Object) null);
        Long term2972 = new Long(4872422362414183754L);
        term2912 = newInstance(Class.forName("in.cubestack.apps.blog.comment.domain.Comment"));
        Object term2962 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2963 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2967 = newInstance(Class.forName("java.time.LocalTime"));
        Object term2974 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2975 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2979 = newInstance(Class.forName("java.time.LocalTime"));
        Object term2984 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2985 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2989 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term2912, term2912.getClass(), "title", "flxyYxBRtu");
        setField(term2912, term2912.getClass(), "commenterId", "OclPbYPkcH");
        setField(term2912, term2912.getClass(), "status", enum7);
        setField(term2912, term2912.getClass(), "content", "IoAlmYsBwc");
        setIntField(term2963, term2963.getClass(), "year", 2017);
        setShortField(term2963, term2963.getClass(), "month", (short) 3);
        setShortField(term2963, term2963.getClass(), "day", (short) 5);
        setField(term2962, term2962.getClass(), "date", term2963);
        setByteField(term2967, term2967.getClass(), "hour", (byte) 20);
        setByteField(term2967, term2967.getClass(), "minute", (byte) 34);
        setByteField(term2967, term2967.getClass(), "second", (byte) 55);
        setIntField(term2967, term2967.getClass(), "nano", 78024496);
        setField(term2962, term2962.getClass(), "time", term2967);
        setField(term2912, term2912.getClass(), "publishedAt", term2962);
        setField(term2912, term2912.getClass(), "id", term2972);
        setIntField(term2975, term2975.getClass(), "year", 2020);
        setShortField(term2975, term2975.getClass(), "month", (short) 7);
        setShortField(term2975, term2975.getClass(), "day", (short) 24);
        setField(term2974, term2974.getClass(), "date", term2975);
        setByteField(term2979, term2979.getClass(), "hour", (byte) 0);
        setByteField(term2979, term2979.getClass(), "minute", (byte) 59);
        setByteField(term2979, term2979.getClass(), "second", (byte) 56);
        setIntField(term2979, term2979.getClass(), "nano", 320219201);
        setField(term2974, term2974.getClass(), "time", term2979);
        setField(term2912, term2912.getClass(), "createdAt", term2974);
        setIntField(term2985, term2985.getClass(), "year", 2014);
        setShortField(term2985, term2985.getClass(), "month", (short) 7);
        setShortField(term2985, term2985.getClass(), "day", (short) 13);
        setField(term2984, term2984.getClass(), "date", term2985);
        setByteField(term2989, term2989.getClass(), "hour", (byte) 21);
        setByteField(term2989, term2989.getClass(), "minute", (byte) 46);
        setByteField(term2989, term2989.getClass(), "second", (byte) 0);
        setIntField(term2989, term2989.getClass(), "nano", 887884128);
        setField(term2984, term2984.getClass(), "time", term2989);
        setField(term2912, term2912.getClass(), "updatedAt", term2984);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.comment.domain.Comment");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPublishedAt", argTypes, term2912, args);
    }

};


