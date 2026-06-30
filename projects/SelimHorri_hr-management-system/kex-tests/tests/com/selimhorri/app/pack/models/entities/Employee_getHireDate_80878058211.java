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

public class Employee_getHireDate_80878058211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8392;

    public Employee_getHireDate_80878058211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term8393 = new Integer(1523896653);
        Integer term8419 = new Integer(-1731921726);
        Double term8431 = new Double(0.9252082867478522);
        Double term8433 = new Double(0.9497134088791012);
        Integer term8436 = new Integer(919994471);
        HashMap term8463 = new HashMap();
        Set<Object> term8634 =  ((Map) term8463).keySet();
        HashSet term8462 = new HashSet((Collection<? extends Object>) term8634);
        Integer term8470 = new Integer(-2060535464);
        Boolean term8496 = new Boolean(true);
        Integer term8535 = new Integer(1302110708);
        Integer term8561 = new Integer(594705497);
        Double term8573 = new Double(0.8988977247873451);
        Double term8575 = new Double(0.12770018571966624);
        Integer term8578 = new Integer(-600102466);
        HashSet term8582 = new HashSet();
        Integer term8584 = new Integer(-899986714);
        Boolean term8588 = new Boolean(true);
        term8392 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Employee"));
        Object term8421 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8422 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8426 = newInstance(Class.forName("java.time.LocalTime"));
        Object term8435 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Department"));
        Object term8469 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.UserCredential"));
        Object term8534 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Employee"));
        Object term8563 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8564 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8568 = newInstance(Class.forName("java.time.LocalTime"));
        Object term8577 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Department"));
        Object term8583 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.UserCredential"));
        Object term8593 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Employee"));
        setField(term8392, term8392.getClass(), "empno", term8393);
        setField(term8392, term8392.getClass(), "ename", "uAgfQbLPeZ");
        setField(term8392, term8392.getClass(), "job", "aZiFZfzhQT");
        setField(term8392, term8392.getClass(), "mgr", term8419);
        setIntField(term8422, term8422.getClass(), "year", 2028);
        setShortField(term8422, term8422.getClass(), "month", (short) 7);
        setShortField(term8422, term8422.getClass(), "day", (short) 4);
        setField(term8421, term8421.getClass(), "date", term8422);
        setByteField(term8426, term8426.getClass(), "hour", (byte) 13);
        setByteField(term8426, term8426.getClass(), "minute", (byte) 43);
        setByteField(term8426, term8426.getClass(), "second", (byte) 17);
        setIntField(term8426, term8426.getClass(), "nano", 949713407);
        setField(term8421, term8421.getClass(), "time", term8426);
        setField(term8392, term8392.getClass(), "hireDate", term8421);
        setField(term8392, term8392.getClass(), "sal", term8431);
        setField(term8392, term8392.getClass(), "comm", term8433);
        setField(term8435, term8435.getClass(), "deptno", term8436);
        setField(term8435, term8435.getClass(), "dname", "HbzAbCwWRh");
        setField(term8435, term8435.getClass(), "loc", "yBgWgFtVxP");
        setField(term8435, term8435.getClass(), "employees", term8462);
        setField(term8392, term8392.getClass(), "department", term8435);
        setField(term8469, term8469.getClass(), "id", term8470);
        setField(term8469, term8469.getClass(), "username", "HtLEppUqzI");
        setField(term8469, term8469.getClass(), "password", "bVlRrMQeRY");
        setField(term8469, term8469.getClass(), "enabled", term8496);
        setField(term8469, term8469.getClass(), "email", "SXaXhlzAIB");
        setField(term8469, term8469.getClass(), "phone", "UPVTXSXUNh");
        setField(term8469, term8469.getClass(), "role", "cjCXbXuiFn");
        setField(term8534, term8534.getClass(), "empno", term8535);
        setField(term8534, term8534.getClass(), "ename", "SUIYUFtCCe");
        setField(term8534, term8534.getClass(), "job", "eKCrPCkedw");
        setField(term8534, term8534.getClass(), "mgr", term8561);
        setIntField(term8564, term8564.getClass(), "year", 2027);
        setShortField(term8564, term8564.getClass(), "month", (short) 12);
        setShortField(term8564, term8564.getClass(), "day", (short) 25);
        setField(term8563, term8563.getClass(), "date", term8564);
        setByteField(term8568, term8568.getClass(), "hour", (byte) 8);
        setByteField(term8568, term8568.getClass(), "minute", (byte) 19);
        setByteField(term8568, term8568.getClass(), "second", (byte) 20);
        setIntField(term8568, term8568.getClass(), "nano", 127700185);
        setField(term8563, term8563.getClass(), "time", term8568);
        setField(term8534, term8534.getClass(), "hireDate", term8563);
        setField(term8534, term8534.getClass(), "sal", term8573);
        setField(term8534, term8534.getClass(), "comm", term8575);
        setField(term8577, term8577.getClass(), "deptno", term8578);
        setField(term8577, term8577.getClass(), "dname", "");
        setField(term8577, term8577.getClass(), "loc", "");
        setField(term8577, term8577.getClass(), "employees", term8582);
        setField(term8534, term8534.getClass(), "department", term8577);
        setField(term8583, term8583.getClass(), "id", term8584);
        setField(term8583, term8583.getClass(), "username", "");
        setField(term8583, term8583.getClass(), "password", "");
        setField(term8583, term8583.getClass(), "enabled", term8588);
        setField(term8583, term8583.getClass(), "email", "");
        setField(term8583, term8583.getClass(), "phone", "");
        setField(term8583, term8583.getClass(), "role", "");
        setField(term8593, term8593.getClass(), "empno", null);
        setField(term8593, term8593.getClass(), "ename", null);
        setField(term8593, term8593.getClass(), "job", null);
        setField(term8593, term8593.getClass(), "mgr", null);
        setField(term8593, term8593.getClass(), "hireDate", null);
        setField(term8593, term8593.getClass(), "sal", null);
        setField(term8593, term8593.getClass(), "comm", null);
        setField(term8593, term8593.getClass(), "department", null);
        setField(term8593, term8593.getClass(), "userCredential", null);
        setField(term8583, term8583.getClass(), "employee", term8593);
        setField(term8534, term8534.getClass(), "userCredential", term8583);
        setField(term8469, term8469.getClass(), "employee", term8534);
        setField(term8392, term8392.getClass(), "userCredential", term8469);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.selimhorri.app.pack.models.entities.Employee");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHireDate", argTypes, term8392, args);
    }

};


