package com.selimhorri.app.pack.models.entities;

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
import static com.selimhorri.app.pack.models.entities.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Double;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.Boolean;

public class Employee_setSal_149401133814 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9271;
     Object term9414;

    public Employee_setSal_149401133814() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term9272 = new Integer(-137577510);
        Integer term9298 = new Integer(719185716);
        Double term9310 = new Double(0.4183851447671385);
        Double term9312 = new Double(0.1530493698346701);
        Integer term9315 = new Integer(1624820010);
        HashMap term9342 = new HashMap();
        Set<Object> term9456 =  ((Map) term9342).keySet();
        HashSet term9341 = new HashSet((Collection<? extends Object>) term9456);
        Integer term9349 = new Integer(-203832871);
        Boolean term9375 = new Boolean(false);
        term9271 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Employee"));
        Object term9300 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9301 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9305 = newInstance(Class.forName("java.time.LocalTime"));
        Object term9314 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Department"));
        Object term9348 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.UserCredential"));
        Object term9413 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Employee"));
        setField(term9271, term9271.getClass(), "empno", term9272);
        setField(term9271, term9271.getClass(), "ename", "uplmRQRGWr");
        setField(term9271, term9271.getClass(), "job", "ZEmNnaQFYB");
        setField(term9271, term9271.getClass(), "mgr", term9298);
        setIntField(term9301, term9301.getClass(), "year", 2018);
        setShortField(term9301, term9301.getClass(), "month", (short) 9);
        setShortField(term9301, term9301.getClass(), "day", (short) 19);
        setField(term9300, term9300.getClass(), "date", term9301);
        setByteField(term9305, term9305.getClass(), "hour", (byte) 23);
        setByteField(term9305, term9305.getClass(), "minute", (byte) 30);
        setByteField(term9305, term9305.getClass(), "second", (byte) 11);
        setIntField(term9305, term9305.getClass(), "nano", 615798597);
        setField(term9300, term9300.getClass(), "time", term9305);
        setField(term9271, term9271.getClass(), "hireDate", term9300);
        setField(term9271, term9271.getClass(), "sal", term9310);
        setField(term9271, term9271.getClass(), "comm", term9312);
        setField(term9314, term9314.getClass(), "deptno", term9315);
        setField(term9314, term9314.getClass(), "dname", "FNxFpCZxLW");
        setField(term9314, term9314.getClass(), "loc", "sXMXSCUbRu");
        setField(term9314, term9314.getClass(), "employees", term9341);
        setField(term9271, term9271.getClass(), "department", term9314);
        setField(term9348, term9348.getClass(), "id", term9349);
        setField(term9348, term9348.getClass(), "username", "mXVgkxjTjD");
        setField(term9348, term9348.getClass(), "password", "qodBmKUkev");
        setField(term9348, term9348.getClass(), "enabled", term9375);
        setField(term9348, term9348.getClass(), "email", "QJuqwUQEyr");
        setField(term9348, term9348.getClass(), "phone", "qqUAzxxpNB");
        setField(term9348, term9348.getClass(), "role", "WqaQxuPbzr");
        setField(term9413, term9413.getClass(), "empno", null);
        setField(term9413, term9413.getClass(), "ename", null);
        setField(term9413, term9413.getClass(), "job", null);
        setField(term9413, term9413.getClass(), "mgr", null);
        setField(term9413, term9413.getClass(), "hireDate", null);
        setField(term9413, term9413.getClass(), "sal", null);
        setField(term9413, term9413.getClass(), "comm", null);
        setField(term9413, term9413.getClass(), "department", null);
        setField(term9413, term9413.getClass(), "userCredential", null);
        setField(term9348, term9348.getClass(), "employee", term9413);
        setField(term9271, term9271.getClass(), "userCredential", term9348);
        term9414 = new Double(0.406335810791266);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.selimhorri.app.pack.models.entities.Employee");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Double");
        Object[] args = new Object[1];
        args[0] = term9414;
        callMethod(klass, "setSal", argTypes, term9271, args);
    }

};


