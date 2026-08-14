package net.jaggerwang.sbip.adapter.api.controller.dto;

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
import static net.jaggerwang.sbip.adapter.api.controller.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class PostStatDTO_getLikeCount_13442906735 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90285;

    public PostStatDTO_getLikeCount_13442906735() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term90286 = new Long(178361842517537670L);
        Long term90288 = new Long(8420774984276198981L);
        Long term90290 = new Long(8962086662826420449L);
        term90285 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.PostStatDTO"));
        Object term90292 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term90293 = newInstance(Class.forName("java.time.LocalDate"));
        Object term90297 = newInstance(Class.forName("java.time.LocalTime"));
        Object term90302 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term90303 = newInstance(Class.forName("java.time.LocalDate"));
        Object term90307 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term90285, term90285.getClass(), "id", term90286);
        setField(term90285, term90285.getClass(), "postId", term90288);
        setField(term90285, term90285.getClass(), "likeCount", term90290);
        setIntField(term90293, term90293.getClass(), "year", 2029);
        setShortField(term90293, term90293.getClass(), "month", (short) 6);
        setShortField(term90293, term90293.getClass(), "day", (short) 3);
        setField(term90292, term90292.getClass(), "date", term90293);
        setByteField(term90297, term90297.getClass(), "hour", (byte) 19);
        setByteField(term90297, term90297.getClass(), "minute", (byte) 12);
        setByteField(term90297, term90297.getClass(), "second", (byte) 52);
        setIntField(term90297, term90297.getClass(), "nano", 269583025);
        setField(term90292, term90292.getClass(), "time", term90297);
        setField(term90285, term90285.getClass(), "createdAt", term90292);
        setIntField(term90303, term90303.getClass(), "year", 2023);
        setShortField(term90303, term90303.getClass(), "month", (short) 9);
        setShortField(term90303, term90303.getClass(), "day", (short) 17);
        setField(term90302, term90302.getClass(), "date", term90303);
        setByteField(term90307, term90307.getClass(), "hour", (byte) 17);
        setByteField(term90307, term90307.getClass(), "minute", (byte) 10);
        setByteField(term90307, term90307.getClass(), "second", (byte) 24);
        setIntField(term90307, term90307.getClass(), "nano", 256215116);
        setField(term90302, term90302.getClass(), "time", term90307);
        setField(term90285, term90285.getClass(), "updatedAt", term90302);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.PostStatDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLikeCount", argTypes, term90285, args);
    }

};


