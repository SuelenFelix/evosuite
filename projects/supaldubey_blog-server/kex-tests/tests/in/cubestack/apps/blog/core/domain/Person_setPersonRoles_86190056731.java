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
import java.util.LinkedList;

public class Person_setPersonRoles_86190056731 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18527;
     Object term18672;

    public Person_setPersonRoles_86190056731() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term18736 = Class.forName((String) "in.cubestack.apps.blog.core.domain.PersonStatus");
        Field term18735 = ((Class) term18736).getDeclaredField((String) "ACTIVE");
        ((Field) term18735).setAccessible(true);
        Object enum39 = ((Field) term18735).get((Object) null);
        ArrayList term18646 = new ArrayList();
        Long term18650 = new Long(4178434741742309755L);
        term18527 = newInstance(Class.forName("in.cubestack.apps.blog.core.domain.Person"));
        Object term18652 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term18653 = newInstance(Class.forName("java.time.LocalDate"));
        Object term18657 = newInstance(Class.forName("java.time.LocalTime"));
        Object term18662 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term18663 = newInstance(Class.forName("java.time.LocalDate"));
        Object term18667 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term18527, term18527.getClass(), "firstName", "GEJABPlHSI");
        setField(term18527, term18527.getClass(), "lastName", "aQFUvuaYxd");
        setField(term18527, term18527.getClass(), "email", "zNFLXMifnS");
        setField(term18527, term18527.getClass(), "username", "HHQcYMSBVc");
        setField(term18527, term18527.getClass(), "password", "wdoqITnaAP");
        setField(term18527, term18527.getClass(), "profileImage", "rIPMBcrNqB");
        setField(term18527, term18527.getClass(), "status", enum39);
        setField(term18527, term18527.getClass(), "phone", "UDaboHZHhz");
        setField(term18527, term18527.getClass(), "countryCode", "nRvKihUSPj");
        setField(term18527, term18527.getClass(), "salt", "BbNeQJpYPr");
        setField(term18527, term18527.getClass(), "personRoles", term18646);
        setField(term18527, term18527.getClass(), "id", term18650);
        setIntField(term18653, term18653.getClass(), "year", 2011);
        setShortField(term18653, term18653.getClass(), "month", (short) 4);
        setShortField(term18653, term18653.getClass(), "day", (short) 19);
        setField(term18652, term18652.getClass(), "date", term18653);
        setByteField(term18657, term18657.getClass(), "hour", (byte) 12);
        setByteField(term18657, term18657.getClass(), "minute", (byte) 0);
        setByteField(term18657, term18657.getClass(), "second", (byte) 14);
        setIntField(term18657, term18657.getClass(), "nano", 849079063);
        setField(term18652, term18652.getClass(), "time", term18657);
        setField(term18527, term18527.getClass(), "createdAt", term18652);
        setIntField(term18663, term18663.getClass(), "year", 2014);
        setShortField(term18663, term18663.getClass(), "month", (short) 8);
        setShortField(term18663, term18663.getClass(), "day", (short) 17);
        setField(term18662, term18662.getClass(), "date", term18663);
        setByteField(term18667, term18667.getClass(), "hour", (byte) 19);
        setByteField(term18667, term18667.getClass(), "minute", (byte) 32);
        setByteField(term18667, term18667.getClass(), "second", (byte) 5);
        setIntField(term18667, term18667.getClass(), "nano", 604713831);
        setField(term18662, term18662.getClass(), "time", term18667);
        setField(term18527, term18527.getClass(), "updatedAt", term18662);
        term18672 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.core.domain.Person");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term18672;
        callMethod(klass, "setPersonRoles", argTypes, term18527, args);
    }

};


