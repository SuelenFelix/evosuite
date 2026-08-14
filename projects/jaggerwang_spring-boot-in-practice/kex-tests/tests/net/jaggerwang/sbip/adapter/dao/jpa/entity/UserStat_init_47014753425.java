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

public class UserStat_init_47014753425 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32632;
     Object term32634;
     Object term32636;
     Object term32638;
     Object term32640;
     Object term32642;
     Object term32644;
     Object term32654;

    public UserStat_init_47014753425() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32632 = new Long(-2217438327452869934L);
        term32634 = new Long(6427987239762071453L);
        term32636 = new Long(9216691136820489449L);
        term32638 = new Long(6460434640369527093L);
        term32640 = new Long(-5745335841303453480L);
        term32642 = new Long(7068447368781427495L);
        term32644 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term32645 = newInstance(Class.forName("java.time.LocalDate"));
        Object term32649 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term32645, term32645.getClass(), "year", 2013);
        setShortField(term32645, term32645.getClass(), "month", (short) 12);
        setShortField(term32645, term32645.getClass(), "day", (short) 7);
        setField(term32644, term32644.getClass(), "date", term32645);
        setByteField(term32649, term32649.getClass(), "hour", (byte) 15);
        setByteField(term32649, term32649.getClass(), "minute", (byte) 56);
        setByteField(term32649, term32649.getClass(), "second", (byte) 2);
        setIntField(term32649, term32649.getClass(), "nano", 550722676);
        setField(term32644, term32644.getClass(), "time", term32649);
        term32654 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term32655 = newInstance(Class.forName("java.time.LocalDate"));
        Object term32659 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term32655, term32655.getClass(), "year", 2014);
        setShortField(term32655, term32655.getClass(), "month", (short) 7);
        setShortField(term32655, term32655.getClass(), "day", (short) 18);
        setField(term32654, term32654.getClass(), "date", term32655);
        setByteField(term32659, term32659.getClass(), "hour", (byte) 19);
        setByteField(term32659, term32659.getClass(), "minute", (byte) 34);
        setByteField(term32659, term32659.getClass(), "second", (byte) 55);
        setIntField(term32659, term32659.getClass(), "nano", 945082868);
        setField(term32654, term32654.getClass(), "time", term32659);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserStat");
        Class<?>[] argTypes = new Class<?>[8];
        argTypes[0] = Class.forName("java.lang.Long");
        argTypes[1] = Class.forName("java.lang.Long");
        argTypes[2] = Class.forName("java.lang.Long");
        argTypes[3] = Class.forName("java.lang.Long");
        argTypes[4] = Class.forName("java.lang.Long");
        argTypes[5] = Class.forName("java.lang.Long");
        argTypes[6] = Class.forName("java.time.LocalDateTime");
        argTypes[7] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[8];
        args[0] = term32632;
        args[1] = term32634;
        args[2] = term32636;
        args[3] = term32638;
        args[4] = term32640;
        args[5] = term32642;
        args[6] = term32644;
        args[7] = term32654;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


