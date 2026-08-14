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

public class UserStatDTO_hashCode_66462972321 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28824;

    public UserStatDTO_hashCode_66462972321() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term28825 = new Long(6848008460134431064L);
        Long term28827 = new Long(-5338413783740215067L);
        Long term28829 = new Long(-814922776357887557L);
        Long term28831 = new Long(800893933628130392L);
        Long term28833 = new Long(-6983938899150831997L);
        Long term28835 = new Long(-2720964670491002091L);
        term28824 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserStatDTO"));
        Object term28837 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28838 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28842 = newInstance(Class.forName("java.time.LocalTime"));
        Object term28847 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28848 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28852 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term28824, term28824.getClass(), "id", term28825);
        setField(term28824, term28824.getClass(), "userId", term28827);
        setField(term28824, term28824.getClass(), "postCount", term28829);
        setField(term28824, term28824.getClass(), "likeCount", term28831);
        setField(term28824, term28824.getClass(), "followingCount", term28833);
        setField(term28824, term28824.getClass(), "followerCount", term28835);
        setIntField(term28838, term28838.getClass(), "year", 2010);
        setShortField(term28838, term28838.getClass(), "month", (short) 5);
        setShortField(term28838, term28838.getClass(), "day", (short) 21);
        setField(term28837, term28837.getClass(), "date", term28838);
        setByteField(term28842, term28842.getClass(), "hour", (byte) 2);
        setByteField(term28842, term28842.getClass(), "minute", (byte) 7);
        setByteField(term28842, term28842.getClass(), "second", (byte) 22);
        setIntField(term28842, term28842.getClass(), "nano", 178273852);
        setField(term28837, term28837.getClass(), "time", term28842);
        setField(term28824, term28824.getClass(), "createdAt", term28837);
        setIntField(term28848, term28848.getClass(), "year", 2020);
        setShortField(term28848, term28848.getClass(), "month", (short) 7);
        setShortField(term28848, term28848.getClass(), "day", (short) 27);
        setField(term28847, term28847.getClass(), "date", term28848);
        setByteField(term28852, term28852.getClass(), "hour", (byte) 23);
        setByteField(term28852, term28852.getClass(), "minute", (byte) 41);
        setByteField(term28852, term28852.getClass(), "second", (byte) 32);
        setIntField(term28852, term28852.getClass(), "nano", 523353963);
        setField(term28847, term28847.getClass(), "time", term28852);
        setField(term28824, term28824.getClass(), "updatedAt", term28847);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserStatDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term28824, args);
    }

};


