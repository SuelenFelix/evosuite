package in.cubestack.apps.blog.core.domain;

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
import static in.cubestack.apps.blog.core.domain.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Long;

public class Person_addRole_196040057514 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9569;
     Object term9714;

    public Person_addRole_196040057514() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term9810 = Class.forName((String) "in.cubestack.apps.blog.core.domain.PersonStatus");
        Field term9809 = ((Class) term9810).getDeclaredField((String) "ACTIVE");
        ((Field) term9809).setAccessible(true);
        Object enum21 = ((Field) term9809).get((Object) null);
        ArrayList term9688 = new ArrayList();
        Long term9692 = new Long(8059786003080744426L);
        term9569 = newInstance(Class.forName("in.cubestack.apps.blog.core.domain.Person"));
        Object term9694 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9695 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9699 = newInstance(Class.forName("java.time.LocalTime"));
        Object term9704 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9705 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9709 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term9569, term9569.getClass(), "firstName", "HzqpegHiRq");
        setField(term9569, term9569.getClass(), "lastName", "jwsfVjMoJT");
        setField(term9569, term9569.getClass(), "email", "ZfdXfCCFDf");
        setField(term9569, term9569.getClass(), "username", "MwwjNtdOFT");
        setField(term9569, term9569.getClass(), "password", "VYkqXKVlAJ");
        setField(term9569, term9569.getClass(), "profileImage", "XkIoWJRNwN");
        setField(term9569, term9569.getClass(), "status", enum21);
        setField(term9569, term9569.getClass(), "phone", "aNWLJdrZMq");
        setField(term9569, term9569.getClass(), "countryCode", "HHmNoYxIGj");
        setField(term9569, term9569.getClass(), "salt", "PtirvZmsGt");
        setField(term9569, term9569.getClass(), "personRoles", term9688);
        setField(term9569, term9569.getClass(), "id", term9692);
        setIntField(term9695, term9695.getClass(), "year", 2020);
        setShortField(term9695, term9695.getClass(), "month", (short) 5);
        setShortField(term9695, term9695.getClass(), "day", (short) 18);
        setField(term9694, term9694.getClass(), "date", term9695);
        setByteField(term9699, term9699.getClass(), "hour", (byte) 5);
        setByteField(term9699, term9699.getClass(), "minute", (byte) 46);
        setByteField(term9699, term9699.getClass(), "second", (byte) 13);
        setIntField(term9699, term9699.getClass(), "nano", 45893173);
        setField(term9694, term9694.getClass(), "time", term9699);
        setField(term9569, term9569.getClass(), "createdAt", term9694);
        setIntField(term9705, term9705.getClass(), "year", 2017);
        setShortField(term9705, term9705.getClass(), "month", (short) 4);
        setShortField(term9705, term9705.getClass(), "day", (short) 3);
        setField(term9704, term9704.getClass(), "date", term9705);
        setByteField(term9709, term9709.getClass(), "hour", (byte) 6);
        setByteField(term9709, term9709.getClass(), "minute", (byte) 51);
        setByteField(term9709, term9709.getClass(), "second", (byte) 10);
        setIntField(term9709, term9709.getClass(), "nano", 316377166);
        setField(term9704, term9704.getClass(), "time", term9709);
        setField(term9569, term9569.getClass(), "updatedAt", term9704);
        Long term9727 = new Long(-4365849114644724155L);
        term9714 = newInstance(Class.forName("in.cubestack.apps.blog.core.domain.Role"));
        Object term9729 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9730 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9734 = newInstance(Class.forName("java.time.LocalTime"));
        Object term9739 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9740 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9744 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term9714, term9714.getClass(), "roleName", "HWkpTmtlrc");
        setField(term9714, term9714.getClass(), "id", term9727);
        setIntField(term9730, term9730.getClass(), "year", 2027);
        setShortField(term9730, term9730.getClass(), "month", (short) 8);
        setShortField(term9730, term9730.getClass(), "day", (short) 23);
        setField(term9729, term9729.getClass(), "date", term9730);
        setByteField(term9734, term9734.getClass(), "hour", (byte) 15);
        setByteField(term9734, term9734.getClass(), "minute", (byte) 12);
        setByteField(term9734, term9734.getClass(), "second", (byte) 6);
        setIntField(term9734, term9734.getClass(), "nano", 541218258);
        setField(term9729, term9729.getClass(), "time", term9734);
        setField(term9714, term9714.getClass(), "createdAt", term9729);
        setIntField(term9740, term9740.getClass(), "year", 2013);
        setShortField(term9740, term9740.getClass(), "month", (short) 5);
        setShortField(term9740, term9740.getClass(), "day", (short) 26);
        setField(term9739, term9739.getClass(), "date", term9740);
        setByteField(term9744, term9744.getClass(), "hour", (byte) 4);
        setByteField(term9744, term9744.getClass(), "minute", (byte) 39);
        setByteField(term9744, term9744.getClass(), "second", (byte) 5);
        setIntField(term9744, term9744.getClass(), "nano", 392869354);
        setField(term9739, term9739.getClass(), "time", term9744);
        setField(term9714, term9714.getClass(), "updatedAt", term9739);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.core.domain.Person");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("in.cubestack.apps.blog.core.domain.Role");
        Object[] args = new Object[1];
        args[0] = term9714;
        callMethod(klass, "addRole", argTypes, term9569, args);
    }

};


