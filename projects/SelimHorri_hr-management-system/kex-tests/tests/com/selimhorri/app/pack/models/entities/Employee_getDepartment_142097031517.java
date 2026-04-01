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

public class Employee_getDepartment_142097031517 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9977;

    public Employee_getDepartment_142097031517() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term9978 = new Integer(1505375686);
        Integer term10004 = new Integer(-132005524);
        Double term10016 = new Double(0.14092209049948845);
        Double term10018 = new Double(0.7386250421411282);
        Integer term10021 = new Integer(-1235127374);
        HashMap term10048 = new HashMap();
        Set<Object> term10160 =  ((Map) term10048).keySet();
        HashSet term10047 = new HashSet((Collection<? extends Object>) term10160);
        Integer term10055 = new Integer(1763217806);
        Boolean term10081 = new Boolean(false);
        term9977 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Employee"));
        Object term10006 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10007 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10011 = newInstance(Class.forName("java.time.LocalTime"));
        Object term10020 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Department"));
        Object term10054 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.UserCredential"));
        Object term10119 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Employee"));
        setField(term9977, term9977.getClass(), "empno", term9978);
        setField(term9977, term9977.getClass(), "ename", "KDKQhbiclt");
        setField(term9977, term9977.getClass(), "job", "diWnDDpNWl");
        setField(term9977, term9977.getClass(), "mgr", term10004);
        setIntField(term10007, term10007.getClass(), "year", 2012);
        setShortField(term10007, term10007.getClass(), "month", (short) 10);
        setShortField(term10007, term10007.getClass(), "day", (short) 26);
        setField(term10006, term10006.getClass(), "date", term10007);
        setByteField(term10011, term10011.getClass(), "hour", (byte) 13);
        setByteField(term10011, term10011.getClass(), "minute", (byte) 50);
        setByteField(term10011, term10011.getClass(), "second", (byte) 34);
        setIntField(term10011, term10011.getClass(), "nano", 738625041);
        setField(term10006, term10006.getClass(), "time", term10011);
        setField(term9977, term9977.getClass(), "hireDate", term10006);
        setField(term9977, term9977.getClass(), "sal", term10016);
        setField(term9977, term9977.getClass(), "comm", term10018);
        setField(term10020, term10020.getClass(), "deptno", term10021);
        setField(term10020, term10020.getClass(), "dname", "jcrJhyEbDI");
        setField(term10020, term10020.getClass(), "loc", "DHbGOjJfEz");
        setField(term10020, term10020.getClass(), "employees", term10047);
        setField(term9977, term9977.getClass(), "department", term10020);
        setField(term10054, term10054.getClass(), "id", term10055);
        setField(term10054, term10054.getClass(), "username", "XhnCbWwpIr");
        setField(term10054, term10054.getClass(), "password", "BVMUadSiyU");
        setField(term10054, term10054.getClass(), "enabled", term10081);
        setField(term10054, term10054.getClass(), "email", "OhWrgFwvJi");
        setField(term10054, term10054.getClass(), "phone", "DfKWXfTINQ");
        setField(term10054, term10054.getClass(), "role", "KqusFIxuyo");
        setField(term10119, term10119.getClass(), "empno", null);
        setField(term10119, term10119.getClass(), "ename", null);
        setField(term10119, term10119.getClass(), "job", null);
        setField(term10119, term10119.getClass(), "mgr", null);
        setField(term10119, term10119.getClass(), "hireDate", null);
        setField(term10119, term10119.getClass(), "sal", null);
        setField(term10119, term10119.getClass(), "comm", null);
        setField(term10119, term10119.getClass(), "department", null);
        setField(term10119, term10119.getClass(), "userCredential", null);
        setField(term10054, term10054.getClass(), "employee", term10119);
        setField(term9977, term9977.getClass(), "userCredential", term10054);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.selimhorri.app.pack.models.entities.Employee");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDepartment", argTypes, term9977, args);
    }

};


