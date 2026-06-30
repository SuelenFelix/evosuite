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

public class Comment_getCommenterId_12126444534 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1709;

    public Comment_getCommenterId_12126444534() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1812 = Class.forName((String) "in.cubestack.apps.blog.comment.domain.CommentStatus");
        Field term1811 = ((Class) term1812).getDeclaredField((String) "PUBLISHED");
        ((Field) term1811).setAccessible(true);
        Object enum4 = ((Field) term1811).get((Object) null);
        Long term1769 = new Long(-8400487765614892086L);
        term1709 = newInstance(Class.forName("in.cubestack.apps.blog.comment.domain.Comment"));
        Object term1759 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1760 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1764 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1771 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1772 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1776 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1781 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1782 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1786 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1709, term1709.getClass(), "title", "tbcdzjIfER");
        setField(term1709, term1709.getClass(), "commenterId", "HyxfbSQYBe");
        setField(term1709, term1709.getClass(), "status", enum4);
        setField(term1709, term1709.getClass(), "content", "pCTimMblYc");
        setIntField(term1760, term1760.getClass(), "year", 2022);
        setShortField(term1760, term1760.getClass(), "month", (short) 11);
        setShortField(term1760, term1760.getClass(), "day", (short) 16);
        setField(term1759, term1759.getClass(), "date", term1760);
        setByteField(term1764, term1764.getClass(), "hour", (byte) 15);
        setByteField(term1764, term1764.getClass(), "minute", (byte) 54);
        setByteField(term1764, term1764.getClass(), "second", (byte) 2);
        setIntField(term1764, term1764.getClass(), "nano", 733274103);
        setField(term1759, term1759.getClass(), "time", term1764);
        setField(term1709, term1709.getClass(), "publishedAt", term1759);
        setField(term1709, term1709.getClass(), "id", term1769);
        setIntField(term1772, term1772.getClass(), "year", 2019);
        setShortField(term1772, term1772.getClass(), "month", (short) 2);
        setShortField(term1772, term1772.getClass(), "day", (short) 21);
        setField(term1771, term1771.getClass(), "date", term1772);
        setByteField(term1776, term1776.getClass(), "hour", (byte) 5);
        setByteField(term1776, term1776.getClass(), "minute", (byte) 41);
        setByteField(term1776, term1776.getClass(), "second", (byte) 11);
        setIntField(term1776, term1776.getClass(), "nano", 859829782);
        setField(term1771, term1771.getClass(), "time", term1776);
        setField(term1709, term1709.getClass(), "createdAt", term1771);
        setIntField(term1782, term1782.getClass(), "year", 2018);
        setShortField(term1782, term1782.getClass(), "month", (short) 9);
        setShortField(term1782, term1782.getClass(), "day", (short) 28);
        setField(term1781, term1781.getClass(), "date", term1782);
        setByteField(term1786, term1786.getClass(), "hour", (byte) 3);
        setByteField(term1786, term1786.getClass(), "minute", (byte) 37);
        setByteField(term1786, term1786.getClass(), "second", (byte) 46);
        setIntField(term1786, term1786.getClass(), "nano", 763326845);
        setField(term1781, term1781.getClass(), "time", term1786);
        setField(term1709, term1709.getClass(), "updatedAt", term1781);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.comment.domain.Comment");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCommenterId", argTypes, term1709, args);
    }

};


