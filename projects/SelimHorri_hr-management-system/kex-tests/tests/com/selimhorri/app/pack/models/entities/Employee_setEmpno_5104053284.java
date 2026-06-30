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
     Object term6469;
     Object term6612;

    public Employee_setEmpno_5104053284() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term6470 = new Integer(-712023865);
        Integer term6496 = new Integer(613256157);
        Double term6508 = new Double(0.42544116787510533);
        Double term6510 = new Double(0.4841923400566003);
        Integer term6513 = new Integer(454242689);
        HashMap term6540 = new HashMap();
        Set<Object> term6654 =  ((Map) term6540).keySet();
        HashSet term6539 = new HashSet((Collection<? extends Object>) term6654);
        Integer term6547 = new Integer(1902784843);
        Boolean term6573 = new Boolean(true);
        term6469 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Employee"));
        Object term6498 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6499 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6503 = newInstance(Class.forName("java.time.LocalTime"));
        Object term6512 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Department"));
        Object term6546 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.UserCredential"));
        Object term6611 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Employee"));
        setField(term6469, term6469.getClass(), "empno", term6470);
        setField(term6469, term6469.getClass(), "ename", "QpEVWispEh");
        setField(term6469, term6469.getClass(), "job", "STofGrqXqL");
        setField(term6469, term6469.getClass(), "mgr", term6496);
        setIntField(term6499, term6499.getClass(), "year", 2018);
        setShortField(term6499, term6499.getClass(), "month", (short) 7);
        setShortField(term6499, term6499.getClass(), "day", (short) 6);
        setField(term6498, term6498.getClass(), "date", term6499);
        setByteField(term6503, term6503.getClass(), "hour", (byte) 6);
        setByteField(term6503, term6503.getClass(), "minute", (byte) 33);
        setByteField(term6503, term6503.getClass(), "second", (byte) 21);
        setIntField(term6503, term6503.getClass(), "nano", 484192339);
        setField(term6498, term6498.getClass(), "time", term6503);
        setField(term6469, term6469.getClass(), "hireDate", term6498);
        setField(term6469, term6469.getClass(), "sal", term6508);
        setField(term6469, term6469.getClass(), "comm", term6510);
        setField(term6512, term6512.getClass(), "deptno", term6513);
        setField(term6512, term6512.getClass(), "dname", "IoRhBfdSuN");
        setField(term6512, term6512.getClass(), "loc", "JGdxVjQzts");
        setField(term6512, term6512.getClass(), "employees", term6539);
        setField(term6469, term6469.getClass(), "department", term6512);
        setField(term6546, term6546.getClass(), "id", term6547);
        setField(term6546, term6546.getClass(), "username", "sCLAuKoiVL");
        setField(term6546, term6546.getClass(), "password", "pFWiDEnVnU");
        setField(term6546, term6546.getClass(), "enabled", term6573);
        setField(term6546, term6546.getClass(), "email", "NeEetzFhTt");
        setField(term6546, term6546.getClass(), "phone", "UgvuvUxKed");
        setField(term6546, term6546.getClass(), "role", "ljBBMsQpaM");
        setField(term6611, term6611.getClass(), "empno", null);
        setField(term6611, term6611.getClass(), "ename", null);
        setField(term6611, term6611.getClass(), "job", null);
        setField(term6611, term6611.getClass(), "mgr", null);
        setField(term6611, term6611.getClass(), "hireDate", null);
        setField(term6611, term6611.getClass(), "sal", null);
        setField(term6611, term6611.getClass(), "comm", null);
        setField(term6611, term6611.getClass(), "department", null);
        setField(term6611, term6611.getClass(), "userCredential", null);
        setField(term6546, term6546.getClass(), "employee", term6611);
        setField(term6469, term6469.getClass(), "userCredential", term6546);
        term6612 = new Integer(2021136615);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.selimhorri.app.pack.models.entities.Employee");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term6612;
        callMethod(klass, "setEmpno", argTypes, term6469, args);
    }

};


