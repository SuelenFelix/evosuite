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
     Object term10202;
     Object term10345;

    public Employee_setDepartment_12481779318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term10203 = new Integer(1644949396);
        Integer term10229 = new Integer(-2017073245);
        Double term10241 = new Double(0.7813411062521521);
        Double term10243 = new Double(0.03215908136985579);
        Integer term10246 = new Integer(522440332);
        HashMap term10273 = new HashMap();
        Set<Object> term10427 =  ((Map) term10273).keySet();
        HashSet term10272 = new HashSet((Collection<? extends Object>) term10427);
        Integer term10280 = new Integer(1094297953);
        Boolean term10306 = new Boolean(false);
        term10202 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Employee"));
        Object term10231 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10232 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10236 = newInstance(Class.forName("java.time.LocalTime"));
        Object term10245 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Department"));
        Object term10279 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.UserCredential"));
        Object term10344 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Employee"));
        setField(term10202, term10202.getClass(), "empno", term10203);
        setField(term10202, term10202.getClass(), "ename", "CDpvEYMuDg");
        setField(term10202, term10202.getClass(), "job", "YaZCAiIUPe");
        setField(term10202, term10202.getClass(), "mgr", term10229);
        setIntField(term10232, term10232.getClass(), "year", 2025);
        setShortField(term10232, term10232.getClass(), "month", (short) 8);
        setShortField(term10232, term10232.getClass(), "day", (short) 18);
        setField(term10231, term10231.getClass(), "date", term10232);
        setByteField(term10236, term10236.getClass(), "hour", (byte) 11);
        setByteField(term10236, term10236.getClass(), "minute", (byte) 28);
        setByteField(term10236, term10236.getClass(), "second", (byte) 28);
        setIntField(term10236, term10236.getClass(), "nano", 32159081);
        setField(term10231, term10231.getClass(), "time", term10236);
        setField(term10202, term10202.getClass(), "hireDate", term10231);
        setField(term10202, term10202.getClass(), "sal", term10241);
        setField(term10202, term10202.getClass(), "comm", term10243);
        setField(term10245, term10245.getClass(), "deptno", term10246);
        setField(term10245, term10245.getClass(), "dname", "KsCWHUcJDd");
        setField(term10245, term10245.getClass(), "loc", "zkYsnzzwJu");
        setField(term10245, term10245.getClass(), "employees", term10272);
        setField(term10202, term10202.getClass(), "department", term10245);
        setField(term10279, term10279.getClass(), "id", term10280);
        setField(term10279, term10279.getClass(), "username", "rvUfMhtNrD");
        setField(term10279, term10279.getClass(), "password", "tVJNKfGPYg");
        setField(term10279, term10279.getClass(), "enabled", term10306);
        setField(term10279, term10279.getClass(), "email", "AlAUNSOTmH");
        setField(term10279, term10279.getClass(), "phone", "IeuSZGvhvH");
        setField(term10279, term10279.getClass(), "role", "zCejWZdaIc");
        setField(term10344, term10344.getClass(), "empno", null);
        setField(term10344, term10344.getClass(), "ename", null);
        setField(term10344, term10344.getClass(), "job", null);
        setField(term10344, term10344.getClass(), "mgr", null);
        setField(term10344, term10344.getClass(), "hireDate", null);
        setField(term10344, term10344.getClass(), "sal", null);
        setField(term10344, term10344.getClass(), "comm", null);
        setField(term10344, term10344.getClass(), "department", null);
        setField(term10344, term10344.getClass(), "userCredential", null);
        setField(term10279, term10279.getClass(), "employee", term10344);
        setField(term10202, term10202.getClass(), "userCredential", term10279);
        Integer term10346 = new Integer(-329141819);
        HashMap term10373 = new HashMap();
        Set<Object> term10498 =  ((Map) term10373).keySet();
        HashSet term10372 = new HashSet((Collection<? extends Object>) term10498);
        term10345 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Department"));
        setField(term10345, term10345.getClass(), "deptno", term10346);
        setField(term10345, term10345.getClass(), "dname", "aCfzlsgXhB");
        setField(term10345, term10345.getClass(), "loc", "HmhoMiUgEv");
        setField(term10345, term10345.getClass(), "employees", term10372);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.selimhorri.app.pack.models.entities.Employee");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.selimhorri.app.pack.models.entities.Department");
        Object[] args = new Object[1];
        args[0] = term10345;
        callMethod(klass, "setDepartment", argTypes, term10202, args);
    }

};


