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

public class PostStatBO_PostStatBOBuilder_toString_5410926247 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21302;

    public PostStatBO_PostStatBOBuilder_toString_5410926247() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term21303 = new Long(753095050088595263L);
        Long term21305 = new Long(3643973882575578879L);
        Long term21308 = new Long(-1750555031444556464L);
        term21302 = newInstance(Class.forName("net.jaggerwang.sbip.entity.PostStatBO$PostStatBOBuilder"));
        Object term21310 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term21311 = newInstance(Class.forName("java.time.LocalDate"));
        Object term21315 = newInstance(Class.forName("java.time.LocalTime"));
        Object term21320 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term21321 = newInstance(Class.forName("java.time.LocalDate"));
        Object term21325 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term21302, term21302.getClass(), "id", term21303);
        setField(term21302, term21302.getClass(), "postId", term21305);
        setBooleanField(term21302, term21302.getClass(), "likeCount$set", true);
        setField(term21302, term21302.getClass(), "likeCount$value", term21308);
        setIntField(term21311, term21311.getClass(), "year", 2024);
        setShortField(term21311, term21311.getClass(), "month", (short) 7);
        setShortField(term21311, term21311.getClass(), "day", (short) 29);
        setField(term21310, term21310.getClass(), "date", term21311);
        setByteField(term21315, term21315.getClass(), "hour", (byte) 19);
        setByteField(term21315, term21315.getClass(), "minute", (byte) 15);
        setByteField(term21315, term21315.getClass(), "second", (byte) 16);
        setIntField(term21315, term21315.getClass(), "nano", 554834199);
        setField(term21310, term21310.getClass(), "time", term21315);
        setField(term21302, term21302.getClass(), "createdAt", term21310);
        setIntField(term21321, term21321.getClass(), "year", 2018);
        setShortField(term21321, term21321.getClass(), "month", (short) 2);
        setShortField(term21321, term21321.getClass(), "day", (short) 13);
        setField(term21320, term21320.getClass(), "date", term21321);
        setByteField(term21325, term21325.getClass(), "hour", (byte) 15);
        setByteField(term21325, term21325.getClass(), "minute", (byte) 1);
        setByteField(term21325, term21325.getClass(), "second", (byte) 45);
        setIntField(term21325, term21325.getClass(), "nano", 380020898);
        setField(term21320, term21320.getClass(), "time", term21325);
        setField(term21302, term21302.getClass(), "updatedAt", term21320);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.PostStatBO$PostStatBOBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term21302, args);
    }

};


