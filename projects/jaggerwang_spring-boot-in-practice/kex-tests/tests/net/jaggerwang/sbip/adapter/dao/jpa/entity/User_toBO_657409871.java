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

public class User_toBO_657409871 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27606;

    public User_toBO_657409871() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term27607 = new Long(6762397834421232825L);
        Long term27657 = new Long(-5414076154478910734L);
        term27606 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.User"));
        Object term27671 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term27672 = newInstance(Class.forName("java.time.LocalDate"));
        Object term27676 = newInstance(Class.forName("java.time.LocalTime"));
        Object term27681 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term27682 = newInstance(Class.forName("java.time.LocalDate"));
        Object term27686 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term27606, term27606.getClass(), "id", term27607);
        setField(term27606, term27606.getClass(), "username", "jDmhBrIoDa");
        setField(term27606, term27606.getClass(), "password", "SPtPatHeOm");
        setField(term27606, term27606.getClass(), "mobile", "ywmcuThdfL");
        setField(term27606, term27606.getClass(), "email", "GBOEuByOfr");
        setField(term27606, term27606.getClass(), "avatarId", term27657);
        setField(term27606, term27606.getClass(), "intro", "NHbOFFjyVK");
        setIntField(term27672, term27672.getClass(), "year", 2029);
        setShortField(term27672, term27672.getClass(), "month", (short) 10);
        setShortField(term27672, term27672.getClass(), "day", (short) 12);
        setField(term27671, term27671.getClass(), "date", term27672);
        setByteField(term27676, term27676.getClass(), "hour", (byte) 12);
        setByteField(term27676, term27676.getClass(), "minute", (byte) 8);
        setByteField(term27676, term27676.getClass(), "second", (byte) 27);
        setIntField(term27676, term27676.getClass(), "nano", 729635487);
        setField(term27671, term27671.getClass(), "time", term27676);
        setField(term27606, term27606.getClass(), "createdAt", term27671);
        setIntField(term27682, term27682.getClass(), "year", 2015);
        setShortField(term27682, term27682.getClass(), "month", (short) 3);
        setShortField(term27682, term27682.getClass(), "day", (short) 29);
        setField(term27681, term27681.getClass(), "date", term27682);
        setByteField(term27686, term27686.getClass(), "hour", (byte) 23);
        setByteField(term27686, term27686.getClass(), "minute", (byte) 1);
        setByteField(term27686, term27686.getClass(), "second", (byte) 57);
        setIntField(term27686, term27686.getClass(), "nano", 425020447);
        setField(term27681, term27681.getClass(), "time", term27686);
        setField(term27606, term27606.getClass(), "updatedAt", term27681);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toBO", argTypes, term27606, args);
    }

};


