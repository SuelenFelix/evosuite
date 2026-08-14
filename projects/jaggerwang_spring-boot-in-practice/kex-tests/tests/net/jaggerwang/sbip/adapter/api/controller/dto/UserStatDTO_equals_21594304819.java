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

public class UserStatDTO_equals_21594304819 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28756;
     Object term28789;

    public UserStatDTO_equals_21594304819() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term28757 = new Long(3951346165629352117L);
        Long term28759 = new Long(-4187265590402169996L);
        Long term28761 = new Long(-8033044954947064558L);
        Long term28763 = new Long(4626639872957534248L);
        Long term28765 = new Long(-7062466217011408314L);
        Long term28767 = new Long(-5455716707538294699L);
        term28756 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserStatDTO"));
        Object term28769 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28770 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28774 = newInstance(Class.forName("java.time.LocalTime"));
        Object term28779 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28780 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28784 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term28756, term28756.getClass(), "id", term28757);
        setField(term28756, term28756.getClass(), "userId", term28759);
        setField(term28756, term28756.getClass(), "postCount", term28761);
        setField(term28756, term28756.getClass(), "likeCount", term28763);
        setField(term28756, term28756.getClass(), "followingCount", term28765);
        setField(term28756, term28756.getClass(), "followerCount", term28767);
        setIntField(term28770, term28770.getClass(), "year", 2016);
        setShortField(term28770, term28770.getClass(), "month", (short) 10);
        setShortField(term28770, term28770.getClass(), "day", (short) 12);
        setField(term28769, term28769.getClass(), "date", term28770);
        setByteField(term28774, term28774.getClass(), "hour", (byte) 11);
        setByteField(term28774, term28774.getClass(), "minute", (byte) 25);
        setByteField(term28774, term28774.getClass(), "second", (byte) 37);
        setIntField(term28774, term28774.getClass(), "nano", 215113477);
        setField(term28769, term28769.getClass(), "time", term28774);
        setField(term28756, term28756.getClass(), "createdAt", term28769);
        setIntField(term28780, term28780.getClass(), "year", 2012);
        setShortField(term28780, term28780.getClass(), "month", (short) 12);
        setShortField(term28780, term28780.getClass(), "day", (short) 10);
        setField(term28779, term28779.getClass(), "date", term28780);
        setByteField(term28784, term28784.getClass(), "hour", (byte) 6);
        setByteField(term28784, term28784.getClass(), "minute", (byte) 26);
        setByteField(term28784, term28784.getClass(), "second", (byte) 38);
        setIntField(term28784, term28784.getClass(), "nano", 934336730);
        setField(term28779, term28779.getClass(), "time", term28784);
        setField(term28756, term28756.getClass(), "updatedAt", term28779);
        term28789 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserStatDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term28789;
        callMethod(klass, "equals", argTypes, term28756, args);
    }

};


