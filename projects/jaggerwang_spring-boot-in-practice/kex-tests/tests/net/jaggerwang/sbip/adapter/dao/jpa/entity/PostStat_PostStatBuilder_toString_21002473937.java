package net.jaggerwang.sbip.adapter.dao.jpa.entity;

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
import static net.jaggerwang.sbip.adapter.dao.jpa.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class PostStat_PostStatBuilder_toString_21002473937 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31805;

    public PostStat_PostStatBuilder_toString_21002473937() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term31806 = new Long(5391189846186870864L);
        Long term31808 = new Long(7314774835988078404L);
        Long term31810 = new Long(2777168805269959396L);
        term31805 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.PostStat$PostStatBuilder"));
        Object term31812 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term31813 = newInstance(Class.forName("java.time.LocalDate"));
        Object term31817 = newInstance(Class.forName("java.time.LocalTime"));
        Object term31822 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term31823 = newInstance(Class.forName("java.time.LocalDate"));
        Object term31827 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term31805, term31805.getClass(), "id", term31806);
        setField(term31805, term31805.getClass(), "postId", term31808);
        setField(term31805, term31805.getClass(), "likeCount", term31810);
        setIntField(term31813, term31813.getClass(), "year", 2016);
        setShortField(term31813, term31813.getClass(), "month", (short) 1);
        setShortField(term31813, term31813.getClass(), "day", (short) 2);
        setField(term31812, term31812.getClass(), "date", term31813);
        setByteField(term31817, term31817.getClass(), "hour", (byte) 13);
        setByteField(term31817, term31817.getClass(), "minute", (byte) 24);
        setByteField(term31817, term31817.getClass(), "second", (byte) 10);
        setIntField(term31817, term31817.getClass(), "nano", 70073780);
        setField(term31812, term31812.getClass(), "time", term31817);
        setField(term31805, term31805.getClass(), "createdAt", term31812);
        setIntField(term31823, term31823.getClass(), "year", 2013);
        setShortField(term31823, term31823.getClass(), "month", (short) 2);
        setShortField(term31823, term31823.getClass(), "day", (short) 21);
        setField(term31822, term31822.getClass(), "date", term31823);
        setByteField(term31827, term31827.getClass(), "hour", (byte) 4);
        setByteField(term31827, term31827.getClass(), "minute", (byte) 18);
        setByteField(term31827, term31827.getClass(), "second", (byte) 6);
        setIntField(term31827, term31827.getClass(), "nano", 2952762);
        setField(term31822, term31822.getClass(), "time", term31827);
        setField(term31805, term31805.getClass(), "updatedAt", term31822);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.PostStat$PostStatBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term31805, args);
    }

};


