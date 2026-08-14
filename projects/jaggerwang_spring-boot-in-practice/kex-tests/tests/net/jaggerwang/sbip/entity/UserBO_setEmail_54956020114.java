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

public class UserBO_setEmail_54956020114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26735;

    public UserBO_setEmail_54956020114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term26736 = new Long(-5671086125367688052L);
        Long term26786 = new Long(7875739215674729968L);
        term26735 = newInstance(Class.forName("net.jaggerwang.sbip.entity.UserBO"));
        Object term26800 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term26801 = newInstance(Class.forName("java.time.LocalDate"));
        Object term26805 = newInstance(Class.forName("java.time.LocalTime"));
        Object term26810 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term26811 = newInstance(Class.forName("java.time.LocalDate"));
        Object term26815 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term26735, term26735.getClass(), "id", term26736);
        setField(term26735, term26735.getClass(), "username", "TweMFhxNdj");
        setField(term26735, term26735.getClass(), "password", "NBrvVzvQHe");
        setField(term26735, term26735.getClass(), "mobile", "FjOiNAfBOc");
        setField(term26735, term26735.getClass(), "email", "iCCsaLHohG");
        setField(term26735, term26735.getClass(), "avatarId", term26786);
        setField(term26735, term26735.getClass(), "intro", "NJhGgctbdj");
        setIntField(term26801, term26801.getClass(), "year", 2023);
        setShortField(term26801, term26801.getClass(), "month", (short) 11);
        setShortField(term26801, term26801.getClass(), "day", (short) 8);
        setField(term26800, term26800.getClass(), "date", term26801);
        setByteField(term26805, term26805.getClass(), "hour", (byte) 21);
        setByteField(term26805, term26805.getClass(), "minute", (byte) 57);
        setByteField(term26805, term26805.getClass(), "second", (byte) 28);
        setIntField(term26805, term26805.getClass(), "nano", 426944685);
        setField(term26800, term26800.getClass(), "time", term26805);
        setField(term26735, term26735.getClass(), "createdAt", term26800);
        setIntField(term26811, term26811.getClass(), "year", 2020);
        setShortField(term26811, term26811.getClass(), "month", (short) 9);
        setShortField(term26811, term26811.getClass(), "day", (short) 2);
        setField(term26810, term26810.getClass(), "date", term26811);
        setByteField(term26815, term26815.getClass(), "hour", (byte) 17);
        setByteField(term26815, term26815.getClass(), "minute", (byte) 47);
        setByteField(term26815, term26815.getClass(), "second", (byte) 32);
        setIntField(term26815, term26815.getClass(), "nano", 161829485);
        setField(term26810, term26810.getClass(), "time", term26815);
        setField(term26735, term26735.getClass(), "updatedAt", term26810);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.UserBO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "MYWYUeLGOp";
        callMethod(klass, "setEmail", argTypes, term26735, args);
    }

};


