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

public class User_getId_13676444454 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27876;

    public User_getId_13676444454() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term27877 = new Long(7269420277013840543L);
        Long term27927 = new Long(-6903160242975707710L);
        term27876 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.User"));
        Object term27941 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term27942 = newInstance(Class.forName("java.time.LocalDate"));
        Object term27946 = newInstance(Class.forName("java.time.LocalTime"));
        Object term27951 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term27952 = newInstance(Class.forName("java.time.LocalDate"));
        Object term27956 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term27876, term27876.getClass(), "id", term27877);
        setField(term27876, term27876.getClass(), "username", "TweMFhxNdj");
        setField(term27876, term27876.getClass(), "password", "NBrvVzvQHe");
        setField(term27876, term27876.getClass(), "mobile", "FjOiNAfBOc");
        setField(term27876, term27876.getClass(), "email", "iCCsaLHohG");
        setField(term27876, term27876.getClass(), "avatarId", term27927);
        setField(term27876, term27876.getClass(), "intro", "NJhGgctbdj");
        setIntField(term27942, term27942.getClass(), "year", 2020);
        setShortField(term27942, term27942.getClass(), "month", (short) 2);
        setShortField(term27942, term27942.getClass(), "day", (short) 22);
        setField(term27941, term27941.getClass(), "date", term27942);
        setByteField(term27946, term27946.getClass(), "hour", (byte) 5);
        setByteField(term27946, term27946.getClass(), "minute", (byte) 45);
        setByteField(term27946, term27946.getClass(), "second", (byte) 53);
        setIntField(term27946, term27946.getClass(), "nano", 933056720);
        setField(term27941, term27941.getClass(), "time", term27946);
        setField(term27876, term27876.getClass(), "createdAt", term27941);
        setIntField(term27952, term27952.getClass(), "year", 2012);
        setShortField(term27952, term27952.getClass(), "month", (short) 11);
        setShortField(term27952, term27952.getClass(), "day", (short) 26);
        setField(term27951, term27951.getClass(), "date", term27952);
        setByteField(term27956, term27956.getClass(), "hour", (byte) 23);
        setByteField(term27956, term27956.getClass(), "minute", (byte) 32);
        setByteField(term27956, term27956.getClass(), "second", (byte) 25);
        setIntField(term27956, term27956.getClass(), "nano", 47326173);
        setField(term27951, term27951.getClass(), "time", term27956);
        setField(term27876, term27876.getClass(), "updatedAt", term27951);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term27876, args);
    }

};


