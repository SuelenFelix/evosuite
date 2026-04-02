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

public class Comment_getTitle_5712731323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1308;

    public Comment_getTitle_5712731323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1411 = Class.forName((String) "in.cubestack.apps.blog.comment.domain.CommentStatus");
        Field term1410 = ((Class) term1411).getDeclaredField((String) "PUBLISHED");
        ((Field) term1410).setAccessible(true);
        Object enum3 = ((Field) term1410).get((Object) null);
        Long term1368 = new Long(-8257434502486459194L);
        term1308 = newInstance(Class.forName("in.cubestack.apps.blog.comment.domain.Comment"));
        Object term1358 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1359 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1363 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1370 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1371 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1375 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1380 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1381 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1385 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1308, term1308.getClass(), "title", "oVcInYnLWB");
        setField(term1308, term1308.getClass(), "commenterId", "aJlieCFVtF");
        setField(term1308, term1308.getClass(), "status", enum3);
        setField(term1308, term1308.getClass(), "content", "ZiaGIbnzTs");
        setIntField(term1359, term1359.getClass(), "year", 2025);
        setShortField(term1359, term1359.getClass(), "month", (short) 4);
        setShortField(term1359, term1359.getClass(), "day", (short) 24);
        setField(term1358, term1358.getClass(), "date", term1359);
        setByteField(term1363, term1363.getClass(), "hour", (byte) 18);
        setByteField(term1363, term1363.getClass(), "minute", (byte) 11);
        setByteField(term1363, term1363.getClass(), "second", (byte) 40);
        setIntField(term1363, term1363.getClass(), "nano", 137454929);
        setField(term1358, term1358.getClass(), "time", term1363);
        setField(term1308, term1308.getClass(), "publishedAt", term1358);
        setField(term1308, term1308.getClass(), "id", term1368);
        setIntField(term1371, term1371.getClass(), "year", 2024);
        setShortField(term1371, term1371.getClass(), "month", (short) 1);
        setShortField(term1371, term1371.getClass(), "day", (short) 24);
        setField(term1370, term1370.getClass(), "date", term1371);
        setByteField(term1375, term1375.getClass(), "hour", (byte) 20);
        setByteField(term1375, term1375.getClass(), "minute", (byte) 28);
        setByteField(term1375, term1375.getClass(), "second", (byte) 39);
        setIntField(term1375, term1375.getClass(), "nano", 952728177);
        setField(term1370, term1370.getClass(), "time", term1375);
        setField(term1308, term1308.getClass(), "createdAt", term1370);
        setIntField(term1381, term1381.getClass(), "year", 2029);
        setShortField(term1381, term1381.getClass(), "month", (short) 8);
        setShortField(term1381, term1381.getClass(), "day", (short) 29);
        setField(term1380, term1380.getClass(), "date", term1381);
        setByteField(term1385, term1385.getClass(), "hour", (byte) 15);
        setByteField(term1385, term1385.getClass(), "minute", (byte) 50);
        setByteField(term1385, term1385.getClass(), "second", (byte) 1);
        setIntField(term1385, term1385.getClass(), "nano", 277971904);
        setField(term1380, term1380.getClass(), "time", term1385);
        setField(term1308, term1308.getClass(), "updatedAt", term1380);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.comment.domain.Comment");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTitle", argTypes, term1308, args);
    }

};


