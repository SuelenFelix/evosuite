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

public class Employee_setDepartment_12481779318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10211;
     Object term10354;

    public Employee_setDepartment_12481779318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term10212 = new Integer(1644949396);
        Integer term10238 = new Integer(-2017073245);
        Double term10250 = new Double(0.7813411062521521);
        Double term10252 = new Double(0.03215908136985579);
        Integer term10255 = new Integer(522440332);
        HashMap term10282 = new HashMap();
        Set<Object> term10436 =  ((Map) term10282).keySet();
        HashSet term10281 = new HashSet((Collection<? extends Object>) term10436);
        Integer term10289 = new Integer(1094297953);
        Boolean term10315 = new Boolean(false);
        term10211 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Employee"));
        Object term10240 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10241 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10245 = newInstance(Class.forName("java.time.LocalTime"));
        Object term10254 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Department"));
        Object term10288 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.UserCredential"));
        Object term10353 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Employee"));
        setField(term10211, term10211.getClass(), "empno", term10212);
        setField(term10211, term10211.getClass(), "ename", "CDpvEYMuDg");
        setField(term10211, term10211.getClass(), "job", "YaZCAiIUPe");
        setField(term10211, term10211.getClass(), "mgr", term10238);
        setIntField(term10241, term10241.getClass(), "year", 2025);
        setShortField(term10241, term10241.getClass(), "month", (short) 8);
        setShortField(term10241, term10241.getClass(), "day", (short) 18);
        setField(term10240, term10240.getClass(), "date", term10241);
        setByteField(term10245, term10245.getClass(), "hour", (byte) 11);
        setByteField(term10245, term10245.getClass(), "minute", (byte) 28);
        setByteField(term10245, term10245.getClass(), "second", (byte) 28);
        setIntField(term10245, term10245.getClass(), "nano", 32159081);
        setField(term10240, term10240.getClass(), "time", term10245);
        setField(term10211, term10211.getClass(), "hireDate", term10240);
        setField(term10211, term10211.getClass(), "sal", term10250);
        setField(term10211, term10211.getClass(), "comm", term10252);
        setField(term10254, term10254.getClass(), "deptno", term10255);
        setField(term10254, term10254.getClass(), "dname", "KsCWHUcJDd");
        setField(term10254, term10254.getClass(), "loc", "zkYsnzzwJu");
        setField(term10254, term10254.getClass(), "employees", term10281);
        setField(term10211, term10211.getClass(), "department", term10254);
        setField(term10288, term10288.getClass(), "id", term10289);
        setField(term10288, term10288.getClass(), "username", "rvUfMhtNrD");
        setField(term10288, term10288.getClass(), "password", "tVJNKfGPYg");
        setField(term10288, term10288.getClass(), "enabled", term10315);
        setField(term10288, term10288.getClass(), "email", "AlAUNSOTmH");
        setField(term10288, term10288.getClass(), "phone", "IeuSZGvhvH");
        setField(term10288, term10288.getClass(), "role", "zCejWZdaIc");
        setField(term10353, term10353.getClass(), "empno", null);
        setField(term10353, term10353.getClass(), "ename", null);
        setField(term10353, term10353.getClass(), "job", null);
        setField(term10353, term10353.getClass(), "mgr", null);
        setField(term10353, term10353.getClass(), "hireDate", null);
        setField(term10353, term10353.getClass(), "sal", null);
        setField(term10353, term10353.getClass(), "comm", null);
        setField(term10353, term10353.getClass(), "department", null);
        setField(term10353, term10353.getClass(), "userCredential", null);
        setField(term10288, term10288.getClass(), "employee", term10353);
        setField(term10211, term10211.getClass(), "userCredential", term10288);
        Integer term10355 = new Integer(-329141819);
        HashMap term10382 = new HashMap();
        Set<Object> term10507 =  ((Map) term10382).keySet();
        HashSet term10381 = new HashSet((Collection<? extends Object>) term10507);
        term10354 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Department"));
        setField(term10354, term10354.getClass(), "deptno", term10355);
        setField(term10354, term10354.getClass(), "dname", "aCfzlsgXhB");
        setField(term10354, term10354.getClass(), "loc", "HmhoMiUgEv");
        setField(term10354, term10354.getClass(), "employees", term10381);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.selimhorri.app.pack.models.entities.Employee");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.selimhorri.app.pack.models.entities.Department");
        Object[] args = new Object[1];
        args[0] = term10354;
        callMethod(klass, "setDepartment", argTypes, term10211, args);
    }

};


