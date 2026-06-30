package com.selimhorri.app.pack.services.impls;

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
import static com.selimhorri.app.pack.services.impls.ReflectionUtils.*;
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

public class EmployeeServiceImpl_save_9021193672 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term134;

    public EmployeeServiceImpl_save_9021193672() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term135 = new Integer(-2095575670);
        Integer term161 = new Integer(1225272962);
        Double term173 = new Double(0.22651340641904605);
        Double term175 = new Double(0.8878841294187743);
        Integer term178 = new Integer(1324040357);
        HashMap term205 = new HashMap();
        Set<Object> term376 =  ((Map) term205).keySet();
        HashSet term204 = new HashSet((Collection<? extends Object>) term376);
        Integer term212 = new Integer(-1772434990);
        Boolean term238 = new Boolean(false);
        Integer term277 = new Integer(1551099402);
        Integer term303 = new Integer(-2027534003);
        Double term315 = new Double(0.7591353014991907);
        Double term317 = new Double(0.791695029600875);
        Integer term320 = new Integer(1063420942);
        HashSet term324 = new HashSet();
        Integer term326 = new Integer(1375330971);
        Boolean term330 = new Boolean(true);
        term134 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Employee"));
        Object term163 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term164 = newInstance(Class.forName("java.time.LocalDate"));
        Object term168 = newInstance(Class.forName("java.time.LocalTime"));
        Object term177 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Department"));
        Object term211 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.UserCredential"));
        Object term276 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Employee"));
        Object term305 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term306 = newInstance(Class.forName("java.time.LocalDate"));
        Object term310 = newInstance(Class.forName("java.time.LocalTime"));
        Object term319 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Department"));
        Object term325 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.UserCredential"));
        Object term335 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Employee"));
        setField(term134, term134.getClass(), "empno", term135);
        setField(term134, term134.getClass(), "ename", "sEnIVFtZuQ");
        setField(term134, term134.getClass(), "job", "ZVecLZMLHF");
        setField(term134, term134.getClass(), "mgr", term161);
        setIntField(term164, term164.getClass(), "year", 2014);
        setShortField(term164, term164.getClass(), "month", (short) 7);
        setShortField(term164, term164.getClass(), "day", (short) 13);
        setField(term163, term163.getClass(), "date", term164);
        setByteField(term168, term168.getClass(), "hour", (byte) 21);
        setByteField(term168, term168.getClass(), "minute", (byte) 46);
        setByteField(term168, term168.getClass(), "second", (byte) 0);
        setIntField(term168, term168.getClass(), "nano", 887884128);
        setField(term163, term163.getClass(), "time", term168);
        setField(term134, term134.getClass(), "hireDate", term163);
        setField(term134, term134.getClass(), "sal", term173);
        setField(term134, term134.getClass(), "comm", term175);
        setField(term177, term177.getClass(), "deptno", term178);
        setField(term177, term177.getClass(), "dname", "fztQhjqwdP");
        setField(term177, term177.getClass(), "loc", "eVpkWxjuki");
        setField(term177, term177.getClass(), "employees", term204);
        setField(term134, term134.getClass(), "department", term177);
        setField(term211, term211.getClass(), "id", term212);
        setField(term211, term211.getClass(), "username", "PapWxkhEWe");
        setField(term211, term211.getClass(), "password", "smnHEqRFRx");
        setField(term211, term211.getClass(), "enabled", term238);
        setField(term211, term211.getClass(), "email", "XYtryyobou");
        setField(term211, term211.getClass(), "phone", "OYbzXylRWW");
        setField(term211, term211.getClass(), "role", "DSNsTGYXDF");
        setField(term276, term276.getClass(), "empno", term277);
        setField(term276, term276.getClass(), "ename", "XOiDvlDhdc");
        setField(term276, term276.getClass(), "job", "AdxvLJhNLe");
        setField(term276, term276.getClass(), "mgr", term303);
        setIntField(term306, term306.getClass(), "year", 2025);
        setShortField(term306, term306.getClass(), "month", (short) 3);
        setShortField(term306, term306.getClass(), "day", (short) 9);
        setField(term305, term305.getClass(), "date", term306);
        setByteField(term310, term310.getClass(), "hour", (byte) 5);
        setByteField(term310, term310.getClass(), "minute", (byte) 49);
        setByteField(term310, term310.getClass(), "second", (byte) 12);
        setIntField(term310, term310.getClass(), "nano", 791695028);
        setField(term305, term305.getClass(), "time", term310);
        setField(term276, term276.getClass(), "hireDate", term305);
        setField(term276, term276.getClass(), "sal", term315);
        setField(term276, term276.getClass(), "comm", term317);
        setField(term319, term319.getClass(), "deptno", term320);
        setField(term319, term319.getClass(), "dname", "");
        setField(term319, term319.getClass(), "loc", "");
        setField(term319, term319.getClass(), "employees", term324);
        setField(term276, term276.getClass(), "department", term319);
        setField(term325, term325.getClass(), "id", term326);
        setField(term325, term325.getClass(), "username", "");
        setField(term325, term325.getClass(), "password", "");
        setField(term325, term325.getClass(), "enabled", term330);
        setField(term325, term325.getClass(), "email", "");
        setField(term325, term325.getClass(), "phone", "");
        setField(term325, term325.getClass(), "role", "");
        setField(term335, term335.getClass(), "empno", null);
        setField(term335, term335.getClass(), "ename", null);
        setField(term335, term335.getClass(), "job", null);
        setField(term335, term335.getClass(), "mgr", null);
        setField(term335, term335.getClass(), "hireDate", null);
        setField(term335, term335.getClass(), "sal", null);
        setField(term335, term335.getClass(), "comm", null);
        setField(term335, term335.getClass(), "department", null);
        setField(term335, term335.getClass(), "userCredential", null);
        setField(term325, term325.getClass(), "employee", term335);
        setField(term276, term276.getClass(), "userCredential", term325);
        setField(term211, term211.getClass(), "employee", term276);
        setField(term134, term134.getClass(), "userCredential", term211);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.selimhorri.app.pack.services.impls.EmployeeServiceImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.selimhorri.app.pack.models.entities.Employee");
        Object[] args = new Object[1];
        args[0] = term134;
        callMethod(klass, "save", argTypes, null, args);
    }

};


