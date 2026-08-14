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
     Object term132;

    public EmployeeServiceImpl_save_9021193672() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term133 = new Integer(-2095575670);
        Integer term159 = new Integer(1225272962);
        Double term171 = new Double(0.22651340641904605);
        Double term173 = new Double(0.8878841294187743);
        Integer term176 = new Integer(1324040357);
        HashMap term203 = new HashMap();
        Set<Object> term374 =  ((Map) term203).keySet();
        HashSet term202 = new HashSet((Collection<? extends Object>) term374);
        Integer term210 = new Integer(-1772434990);
        Boolean term236 = new Boolean(false);
        Integer term275 = new Integer(1551099402);
        Integer term301 = new Integer(-2027534003);
        Double term313 = new Double(0.7591353014991907);
        Double term315 = new Double(0.791695029600875);
        Integer term318 = new Integer(1063420942);
        HashSet term322 = new HashSet();
        Integer term324 = new Integer(1375330971);
        Boolean term328 = new Boolean(true);
        term132 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Employee"));
        Object term161 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term162 = newInstance(Class.forName("java.time.LocalDate"));
        Object term166 = newInstance(Class.forName("java.time.LocalTime"));
        Object term175 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Department"));
        Object term209 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.UserCredential"));
        Object term274 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Employee"));
        Object term303 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term304 = newInstance(Class.forName("java.time.LocalDate"));
        Object term308 = newInstance(Class.forName("java.time.LocalTime"));
        Object term317 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Department"));
        Object term323 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.UserCredential"));
        Object term333 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Employee"));
        setField(term132, term132.getClass(), "empno", term133);
        setField(term132, term132.getClass(), "ename", "sEnIVFtZuQ");
        setField(term132, term132.getClass(), "job", "ZVecLZMLHF");
        setField(term132, term132.getClass(), "mgr", term159);
        setIntField(term162, term162.getClass(), "year", 2014);
        setShortField(term162, term162.getClass(), "month", (short) 7);
        setShortField(term162, term162.getClass(), "day", (short) 13);
        setField(term161, term161.getClass(), "date", term162);
        setByteField(term166, term166.getClass(), "hour", (byte) 21);
        setByteField(term166, term166.getClass(), "minute", (byte) 46);
        setByteField(term166, term166.getClass(), "second", (byte) 0);
        setIntField(term166, term166.getClass(), "nano", 887884128);
        setField(term161, term161.getClass(), "time", term166);
        setField(term132, term132.getClass(), "hireDate", term161);
        setField(term132, term132.getClass(), "sal", term171);
        setField(term132, term132.getClass(), "comm", term173);
        setField(term175, term175.getClass(), "deptno", term176);
        setField(term175, term175.getClass(), "dname", "fztQhjqwdP");
        setField(term175, term175.getClass(), "loc", "eVpkWxjuki");
        setField(term175, term175.getClass(), "employees", term202);
        setField(term132, term132.getClass(), "department", term175);
        setField(term209, term209.getClass(), "id", term210);
        setField(term209, term209.getClass(), "username", "PapWxkhEWe");
        setField(term209, term209.getClass(), "password", "smnHEqRFRx");
        setField(term209, term209.getClass(), "enabled", term236);
        setField(term209, term209.getClass(), "email", "XYtryyobou");
        setField(term209, term209.getClass(), "phone", "OYbzXylRWW");
        setField(term209, term209.getClass(), "role", "DSNsTGYXDF");
        setField(term274, term274.getClass(), "empno", term275);
        setField(term274, term274.getClass(), "ename", "XOiDvlDhdc");
        setField(term274, term274.getClass(), "job", "AdxvLJhNLe");
        setField(term274, term274.getClass(), "mgr", term301);
        setIntField(term304, term304.getClass(), "year", 2025);
        setShortField(term304, term304.getClass(), "month", (short) 3);
        setShortField(term304, term304.getClass(), "day", (short) 9);
        setField(term303, term303.getClass(), "date", term304);
        setByteField(term308, term308.getClass(), "hour", (byte) 5);
        setByteField(term308, term308.getClass(), "minute", (byte) 49);
        setByteField(term308, term308.getClass(), "second", (byte) 12);
        setIntField(term308, term308.getClass(), "nano", 791695028);
        setField(term303, term303.getClass(), "time", term308);
        setField(term274, term274.getClass(), "hireDate", term303);
        setField(term274, term274.getClass(), "sal", term313);
        setField(term274, term274.getClass(), "comm", term315);
        setField(term317, term317.getClass(), "deptno", term318);
        setField(term317, term317.getClass(), "dname", "");
        setField(term317, term317.getClass(), "loc", "");
        setField(term317, term317.getClass(), "employees", term322);
        setField(term274, term274.getClass(), "department", term317);
        setField(term323, term323.getClass(), "id", term324);
        setField(term323, term323.getClass(), "username", "");
        setField(term323, term323.getClass(), "password", "");
        setField(term323, term323.getClass(), "enabled", term328);
        setField(term323, term323.getClass(), "email", "");
        setField(term323, term323.getClass(), "phone", "");
        setField(term323, term323.getClass(), "role", "");
        setField(term333, term333.getClass(), "empno", null);
        setField(term333, term333.getClass(), "ename", null);
        setField(term333, term333.getClass(), "job", null);
        setField(term333, term333.getClass(), "mgr", null);
        setField(term333, term333.getClass(), "hireDate", null);
        setField(term333, term333.getClass(), "sal", null);
        setField(term333, term333.getClass(), "comm", null);
        setField(term333, term333.getClass(), "department", null);
        setField(term333, term333.getClass(), "userCredential", null);
        setField(term323, term323.getClass(), "employee", term333);
        setField(term274, term274.getClass(), "userCredential", term323);
        setField(term209, term209.getClass(), "employee", term274);
        setField(term132, term132.getClass(), "userCredential", term209);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.selimhorri.app.pack.services.impls.EmployeeServiceImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.selimhorri.app.pack.models.entities.Employee");
        Object[] args = new Object[1];
        args[0] = term132;
        callMethod(klass, "save", argTypes, null, args);
    }

};


