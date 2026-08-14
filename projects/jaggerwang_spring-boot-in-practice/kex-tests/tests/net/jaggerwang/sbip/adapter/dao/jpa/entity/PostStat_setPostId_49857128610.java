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

public class PostStat_setPostId_49857128610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3850;
     Object term3877;

    public PostStat_setPostId_49857128610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3851 = new Long(5953383087795962419L);
        Long term3853 = new Long(7994303628307559416L);
        Long term3855 = new Long(2443640364875054177L);
        term3850 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.PostStat"));
        Object term3857 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3858 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3862 = newInstance(Class.forName("java.time.LocalTime"));
        Object term3867 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3868 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3872 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term3850, term3850.getClass(), "id", term3851);
        setField(term3850, term3850.getClass(), "postId", term3853);
        setField(term3850, term3850.getClass(), "likeCount", term3855);
        setIntField(term3858, term3858.getClass(), "year", 2015);
        setShortField(term3858, term3858.getClass(), "month", (short) 12);
        setShortField(term3858, term3858.getClass(), "day", (short) 23);
        setField(term3857, term3857.getClass(), "date", term3858);
        setByteField(term3862, term3862.getClass(), "hour", (byte) 14);
        setByteField(term3862, term3862.getClass(), "minute", (byte) 17);
        setByteField(term3862, term3862.getClass(), "second", (byte) 50);
        setIntField(term3862, term3862.getClass(), "nano", 325544804);
        setField(term3857, term3857.getClass(), "time", term3862);
        setField(term3850, term3850.getClass(), "createdAt", term3857);
        setIntField(term3868, term3868.getClass(), "year", 2027);
        setShortField(term3868, term3868.getClass(), "month", (short) 11);
        setShortField(term3868, term3868.getClass(), "day", (short) 8);
        setField(term3867, term3867.getClass(), "date", term3868);
        setByteField(term3872, term3872.getClass(), "hour", (byte) 11);
        setByteField(term3872, term3872.getClass(), "minute", (byte) 59);
        setByteField(term3872, term3872.getClass(), "second", (byte) 14);
        setIntField(term3872, term3872.getClass(), "nano", 322375591);
        setField(term3867, term3867.getClass(), "time", term3872);
        setField(term3850, term3850.getClass(), "updatedAt", term3867);
        term3877 = new Long(-1610676979013636850L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.PostStat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term3877;
        callMethod(klass, "setPostId", argTypes, term3850, args);
    }

};


