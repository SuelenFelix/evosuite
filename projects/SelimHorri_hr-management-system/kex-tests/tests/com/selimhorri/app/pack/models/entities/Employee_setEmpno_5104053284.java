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

public class Employee_setEmpno_5104053284 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6478;
     Object term6621;

    public Employee_setEmpno_5104053284() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term6479 = new Integer(-712023865);
        Integer term6505 = new Integer(613256157);
        Double term6517 = new Double(0.42544116787510533);
        Double term6519 = new Double(0.4841923400566003);
        Integer term6522 = new Integer(454242689);
        HashMap term6549 = new HashMap();
        Set<Object> term6663 =  ((Map) term6549).keySet();
        HashSet term6548 = new HashSet((Collection<? extends Object>) term6663);
        Integer term6556 = new Integer(1902784843);
        Boolean term6582 = new Boolean(true);
        term6478 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Employee"));
        Object term6507 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6508 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6512 = newInstance(Class.forName("java.time.LocalTime"));
        Object term6521 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Department"));
        Object term6555 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.UserCredential"));
        Object term6620 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Employee"));
        setField(term6478, term6478.getClass(), "empno", term6479);
        setField(term6478, term6478.getClass(), "ename", "QpEVWispEh");
        setField(term6478, term6478.getClass(), "job", "STofGrqXqL");
        setField(term6478, term6478.getClass(), "mgr", term6505);
        setIntField(term6508, term6508.getClass(), "year", 2018);
        setShortField(term6508, term6508.getClass(), "month", (short) 7);
        setShortField(term6508, term6508.getClass(), "day", (short) 6);
        setField(term6507, term6507.getClass(), "date", term6508);
        setByteField(term6512, term6512.getClass(), "hour", (byte) 6);
        setByteField(term6512, term6512.getClass(), "minute", (byte) 33);
        setByteField(term6512, term6512.getClass(), "second", (byte) 21);
        setIntField(term6512, term6512.getClass(), "nano", 484192339);
        setField(term6507, term6507.getClass(), "time", term6512);
        setField(term6478, term6478.getClass(), "hireDate", term6507);
        setField(term6478, term6478.getClass(), "sal", term6517);
        setField(term6478, term6478.getClass(), "comm", term6519);
        setField(term6521, term6521.getClass(), "deptno", term6522);
        setField(term6521, term6521.getClass(), "dname", "IoRhBfdSuN");
        setField(term6521, term6521.getClass(), "loc", "JGdxVjQzts");
        setField(term6521, term6521.getClass(), "employees", term6548);
        setField(term6478, term6478.getClass(), "department", term6521);
        setField(term6555, term6555.getClass(), "id", term6556);
        setField(term6555, term6555.getClass(), "username", "sCLAuKoiVL");
        setField(term6555, term6555.getClass(), "password", "pFWiDEnVnU");
        setField(term6555, term6555.getClass(), "enabled", term6582);
        setField(term6555, term6555.getClass(), "email", "NeEetzFhTt");
        setField(term6555, term6555.getClass(), "phone", "UgvuvUxKed");
        setField(term6555, term6555.getClass(), "role", "ljBBMsQpaM");
        setField(term6620, term6620.getClass(), "empno", null);
        setField(term6620, term6620.getClass(), "ename", null);
        setField(term6620, term6620.getClass(), "job", null);
        setField(term6620, term6620.getClass(), "mgr", null);
        setField(term6620, term6620.getClass(), "hireDate", null);
        setField(term6620, term6620.getClass(), "sal", null);
        setField(term6620, term6620.getClass(), "comm", null);
        setField(term6620, term6620.getClass(), "department", null);
        setField(term6620, term6620.getClass(), "userCredential", null);
        setField(term6555, term6555.getClass(), "employee", term6620);
        setField(term6478, term6478.getClass(), "userCredential", term6555);
        term6621 = new Integer(2021136615);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.selimhorri.app.pack.models.entities.Employee");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term6621;
        callMethod(klass, "setEmpno", argTypes, term6478, args);
    }

};


