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

public class Comment_getStatus_9082564735 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2110;

    public Comment_getStatus_9082564735() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2213 = Class.forName((String) "in.cubestack.apps.blog.comment.domain.CommentStatus");
        Field term2212 = ((Class) term2213).getDeclaredField((String) "PUBLISHED");
        ((Field) term2212).setAccessible(true);
        Object enum5 = ((Field) term2212).get((Object) null);
        Long term2170 = new Long(5270370404989704783L);
        term2110 = newInstance(Class.forName("in.cubestack.apps.blog.comment.domain.Comment"));
        Object term2160 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2161 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2165 = newInstance(Class.forName("java.time.LocalTime"));
        Object term2172 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2173 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2177 = newInstance(Class.forName("java.time.LocalTime"));
        Object term2182 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2183 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2187 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term2110, term2110.getClass(), "title", "hNxWaHcfhY");
        setField(term2110, term2110.getClass(), "commenterId", "RkybSrpybU");
        setField(term2110, term2110.getClass(), "status", enum5);
        setField(term2110, term2110.getClass(), "content", "xOEqzGAmDU");
        setIntField(term2161, term2161.getClass(), "year", 2012);
        setShortField(term2161, term2161.getClass(), "month", (short) 9);
        setShortField(term2161, term2161.getClass(), "day", (short) 11);
        setField(term2160, term2160.getClass(), "date", term2161);
        setByteField(term2165, term2165.getClass(), "hour", (byte) 22);
        setByteField(term2165, term2165.getClass(), "minute", (byte) 10);
        setByteField(term2165, term2165.getClass(), "second", (byte) 8);
        setIntField(term2165, term2165.getClass(), "nano", 380008862);
        setField(term2160, term2160.getClass(), "time", term2165);
        setField(term2110, term2110.getClass(), "publishedAt", term2160);
        setField(term2110, term2110.getClass(), "id", term2170);
        setIntField(term2173, term2173.getClass(), "year", 2021);
        setShortField(term2173, term2173.getClass(), "month", (short) 9);
        setShortField(term2173, term2173.getClass(), "day", (short) 7);
        setField(term2172, term2172.getClass(), "date", term2173);
        setByteField(term2177, term2177.getClass(), "hour", (byte) 5);
        setByteField(term2177, term2177.getClass(), "minute", (byte) 25);
        setByteField(term2177, term2177.getClass(), "second", (byte) 7);
        setIntField(term2177, term2177.getClass(), "nano", 755924076);
        setField(term2172, term2172.getClass(), "time", term2177);
        setField(term2110, term2110.getClass(), "createdAt", term2172);
        setIntField(term2183, term2183.getClass(), "year", 2012);
        setShortField(term2183, term2183.getClass(), "month", (short) 2);
        setShortField(term2183, term2183.getClass(), "day", (short) 19);
        setField(term2182, term2182.getClass(), "date", term2183);
        setByteField(term2187, term2187.getClass(), "hour", (byte) 8);
        setByteField(term2187, term2187.getClass(), "minute", (byte) 4);
        setByteField(term2187, term2187.getClass(), "second", (byte) 43);
        setIntField(term2187, term2187.getClass(), "nano", 114930008);
        setField(term2182, term2182.getClass(), "time", term2187);
        setField(term2110, term2110.getClass(), "updatedAt", term2182);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.comment.domain.Comment");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStatus", argTypes, term2110, args);
    }

};


