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

public class UserFollow_UserFollowBuilder_createdAt_3113275094 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22671;
     Object term22698;

    public UserFollow_UserFollowBuilder_createdAt_3113275094() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term22672 = new Long(-872579514000598474L);
        Long term22674 = new Long(5097769785635819744L);
        Long term22676 = new Long(9192899183781208922L);
        term22671 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserFollow$UserFollowBuilder"));
        Object term22678 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term22679 = newInstance(Class.forName("java.time.LocalDate"));
        Object term22683 = newInstance(Class.forName("java.time.LocalTime"));
        Object term22688 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term22689 = newInstance(Class.forName("java.time.LocalDate"));
        Object term22693 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term22671, term22671.getClass(), "id", term22672);
        setField(term22671, term22671.getClass(), "followingId", term22674);
        setField(term22671, term22671.getClass(), "followerId", term22676);
        setIntField(term22679, term22679.getClass(), "year", 2016);
        setShortField(term22679, term22679.getClass(), "month", (short) 1);
        setShortField(term22679, term22679.getClass(), "day", (short) 24);
        setField(term22678, term22678.getClass(), "date", term22679);
        setByteField(term22683, term22683.getClass(), "hour", (byte) 23);
        setByteField(term22683, term22683.getClass(), "minute", (byte) 15);
        setByteField(term22683, term22683.getClass(), "second", (byte) 43);
        setIntField(term22683, term22683.getClass(), "nano", 860277753);
        setField(term22678, term22678.getClass(), "time", term22683);
        setField(term22671, term22671.getClass(), "createdAt", term22678);
        setIntField(term22689, term22689.getClass(), "year", 2016);
        setShortField(term22689, term22689.getClass(), "month", (short) 2);
        setShortField(term22689, term22689.getClass(), "day", (short) 2);
        setField(term22688, term22688.getClass(), "date", term22689);
        setByteField(term22693, term22693.getClass(), "hour", (byte) 16);
        setByteField(term22693, term22693.getClass(), "minute", (byte) 51);
        setByteField(term22693, term22693.getClass(), "second", (byte) 8);
        setIntField(term22693, term22693.getClass(), "nano", 991355221);
        setField(term22688, term22688.getClass(), "time", term22693);
        setField(term22671, term22671.getClass(), "updatedAt", term22688);
        term22698 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term22699 = newInstance(Class.forName("java.time.LocalDate"));
        Object term22703 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term22699, term22699.getClass(), "year", 2019);
        setShortField(term22699, term22699.getClass(), "month", (short) 12);
        setShortField(term22699, term22699.getClass(), "day", (short) 8);
        setField(term22698, term22698.getClass(), "date", term22699);
        setByteField(term22703, term22703.getClass(), "hour", (byte) 6);
        setByteField(term22703, term22703.getClass(), "minute", (byte) 0);
        setByteField(term22703, term22703.getClass(), "second", (byte) 32);
        setIntField(term22703, term22703.getClass(), "nano", 371231280);
        setField(term22698, term22698.getClass(), "time", term22703);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserFollow$UserFollowBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term22698;
        callMethod(klass, "createdAt", argTypes, term22671, args);
    }

};


