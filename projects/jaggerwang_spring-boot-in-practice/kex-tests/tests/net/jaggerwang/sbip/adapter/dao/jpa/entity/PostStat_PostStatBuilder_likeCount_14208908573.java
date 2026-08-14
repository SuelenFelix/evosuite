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

public class PostStat_PostStatBuilder_likeCount_14208908573 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31675;
     Object term31702;

    public PostStat_PostStatBuilder_likeCount_14208908573() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term31676 = new Long(-2080067238602928154L);
        Long term31678 = new Long(8202413349907503373L);
        Long term31680 = new Long(4715419421865334491L);
        term31675 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.PostStat$PostStatBuilder"));
        Object term31682 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term31683 = newInstance(Class.forName("java.time.LocalDate"));
        Object term31687 = newInstance(Class.forName("java.time.LocalTime"));
        Object term31692 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term31693 = newInstance(Class.forName("java.time.LocalDate"));
        Object term31697 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term31675, term31675.getClass(), "id", term31676);
        setField(term31675, term31675.getClass(), "postId", term31678);
        setField(term31675, term31675.getClass(), "likeCount", term31680);
        setIntField(term31683, term31683.getClass(), "year", 2010);
        setShortField(term31683, term31683.getClass(), "month", (short) 11);
        setShortField(term31683, term31683.getClass(), "day", (short) 12);
        setField(term31682, term31682.getClass(), "date", term31683);
        setByteField(term31687, term31687.getClass(), "hour", (byte) 19);
        setByteField(term31687, term31687.getClass(), "minute", (byte) 8);
        setByteField(term31687, term31687.getClass(), "second", (byte) 0);
        setIntField(term31687, term31687.getClass(), "nano", 224480743);
        setField(term31682, term31682.getClass(), "time", term31687);
        setField(term31675, term31675.getClass(), "createdAt", term31682);
        setIntField(term31693, term31693.getClass(), "year", 2023);
        setShortField(term31693, term31693.getClass(), "month", (short) 6);
        setShortField(term31693, term31693.getClass(), "day", (short) 11);
        setField(term31692, term31692.getClass(), "date", term31693);
        setByteField(term31697, term31697.getClass(), "hour", (byte) 20);
        setByteField(term31697, term31697.getClass(), "minute", (byte) 37);
        setByteField(term31697, term31697.getClass(), "second", (byte) 26);
        setIntField(term31697, term31697.getClass(), "nano", 879792435);
        setField(term31692, term31692.getClass(), "time", term31697);
        setField(term31675, term31675.getClass(), "updatedAt", term31692);
        term31702 = new Long(6320559761926095887L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.PostStat$PostStatBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term31702;
        callMethod(klass, "likeCount", argTypes, term31675, args);
    }

};


