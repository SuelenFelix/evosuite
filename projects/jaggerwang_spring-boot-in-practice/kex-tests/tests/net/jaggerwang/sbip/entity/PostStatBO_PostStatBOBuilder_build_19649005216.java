package net.jaggerwang.sbip.entity;

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
import static net.jaggerwang.sbip.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class PostStatBO_PostStatBOBuilder_build_19649005216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21274;

    public PostStatBO_PostStatBOBuilder_build_19649005216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term21275 = new Long(-7423063312741500355L);
        Long term21277 = new Long(-8992404862613425105L);
        Long term21280 = new Long(3103198349031409063L);
        term21274 = newInstance(Class.forName("net.jaggerwang.sbip.entity.PostStatBO$PostStatBOBuilder"));
        Object term21282 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term21283 = newInstance(Class.forName("java.time.LocalDate"));
        Object term21287 = newInstance(Class.forName("java.time.LocalTime"));
        Object term21292 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term21293 = newInstance(Class.forName("java.time.LocalDate"));
        Object term21297 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term21274, term21274.getClass(), "id", term21275);
        setField(term21274, term21274.getClass(), "postId", term21277);
        setBooleanField(term21274, term21274.getClass(), "likeCount$set", true);
        setField(term21274, term21274.getClass(), "likeCount$value", term21280);
        setIntField(term21283, term21283.getClass(), "year", 2013);
        setShortField(term21283, term21283.getClass(), "month", (short) 1);
        setShortField(term21283, term21283.getClass(), "day", (short) 17);
        setField(term21282, term21282.getClass(), "date", term21283);
        setByteField(term21287, term21287.getClass(), "hour", (byte) 19);
        setByteField(term21287, term21287.getClass(), "minute", (byte) 49);
        setByteField(term21287, term21287.getClass(), "second", (byte) 53);
        setIntField(term21287, term21287.getClass(), "nano", 217542739);
        setField(term21282, term21282.getClass(), "time", term21287);
        setField(term21274, term21274.getClass(), "createdAt", term21282);
        setIntField(term21293, term21293.getClass(), "year", 2025);
        setShortField(term21293, term21293.getClass(), "month", (short) 8);
        setShortField(term21293, term21293.getClass(), "day", (short) 8);
        setField(term21292, term21292.getClass(), "date", term21293);
        setByteField(term21297, term21297.getClass(), "hour", (byte) 12);
        setByteField(term21297, term21297.getClass(), "minute", (byte) 29);
        setByteField(term21297, term21297.getClass(), "second", (byte) 36);
        setIntField(term21297, term21297.getClass(), "nano", 329488602);
        setField(term21292, term21292.getClass(), "time", term21297);
        setField(term21274, term21274.getClass(), "updatedAt", term21292);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.PostStatBO$PostStatBOBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term21274, args);
    }

};


