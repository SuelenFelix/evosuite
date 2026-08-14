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

public class UserBO_getEmail_9732286175 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25452;

    public UserBO_getEmail_9732286175() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term25453 = new Long(3951346165629352117L);
        Long term25503 = new Long(-4187265590402169996L);
        term25452 = newInstance(Class.forName("net.jaggerwang.sbip.entity.UserBO"));
        Object term25517 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term25518 = newInstance(Class.forName("java.time.LocalDate"));
        Object term25522 = newInstance(Class.forName("java.time.LocalTime"));
        Object term25527 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term25528 = newInstance(Class.forName("java.time.LocalDate"));
        Object term25532 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term25452, term25452.getClass(), "id", term25453);
        setField(term25452, term25452.getClass(), "username", "xvkbvaEGYd");
        setField(term25452, term25452.getClass(), "password", "HBGNxdNURv");
        setField(term25452, term25452.getClass(), "mobile", "mfCpTPPQQm");
        setField(term25452, term25452.getClass(), "email", "OcJCIDNIXA");
        setField(term25452, term25452.getClass(), "avatarId", term25503);
        setField(term25452, term25452.getClass(), "intro", "XfRABIFVEp");
        setIntField(term25518, term25518.getClass(), "year", 2012);
        setShortField(term25518, term25518.getClass(), "month", (short) 2);
        setShortField(term25518, term25518.getClass(), "day", (short) 18);
        setField(term25517, term25517.getClass(), "date", term25518);
        setByteField(term25522, term25522.getClass(), "hour", (byte) 4);
        setByteField(term25522, term25522.getClass(), "minute", (byte) 27);
        setByteField(term25522, term25522.getClass(), "second", (byte) 19);
        setIntField(term25522, term25522.getClass(), "nano", 948215601);
        setField(term25517, term25517.getClass(), "time", term25522);
        setField(term25452, term25452.getClass(), "createdAt", term25517);
        setIntField(term25528, term25528.getClass(), "year", 2029);
        setShortField(term25528, term25528.getClass(), "month", (short) 11);
        setShortField(term25528, term25528.getClass(), "day", (short) 23);
        setField(term25527, term25527.getClass(), "date", term25528);
        setByteField(term25532, term25532.getClass(), "hour", (byte) 18);
        setByteField(term25532, term25532.getClass(), "minute", (byte) 47);
        setByteField(term25532, term25532.getClass(), "second", (byte) 36);
        setIntField(term25532, term25532.getClass(), "nano", 43248731);
        setField(term25527, term25527.getClass(), "time", term25532);
        setField(term25452, term25452.getClass(), "updatedAt", term25527);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.UserBO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmail", argTypes, term25452, args);
    }

};


