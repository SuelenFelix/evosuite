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
     Object term8401;

    public Employee_getHireDate_80878058211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term8402 = new Integer(1523896653);
        Integer term8428 = new Integer(-1731921726);
        Double term8440 = new Double(0.9252082867478522);
        Double term8442 = new Double(0.9497134088791012);
        Integer term8445 = new Integer(919994471);
        HashMap term8472 = new HashMap();
        Set<Object> term8643 =  ((Map) term8472).keySet();
        HashSet term8471 = new HashSet((Collection<? extends Object>) term8643);
        Integer term8479 = new Integer(-2060535464);
        Boolean term8505 = new Boolean(true);
        Integer term8544 = new Integer(1302110708);
        Integer term8570 = new Integer(594705497);
        Double term8582 = new Double(0.8988977247873451);
        Double term8584 = new Double(0.12770018571966624);
        Integer term8587 = new Integer(-600102466);
        HashSet term8591 = new HashSet();
        Integer term8593 = new Integer(-899986714);
        Boolean term8597 = new Boolean(true);
        term8401 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Employee"));
        Object term8430 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8431 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8435 = newInstance(Class.forName("java.time.LocalTime"));
        Object term8444 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Department"));
        Object term8478 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.UserCredential"));
        Object term8543 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Employee"));
        Object term8572 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8573 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8577 = newInstance(Class.forName("java.time.LocalTime"));
        Object term8586 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Department"));
        Object term8592 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.UserCredential"));
        Object term8602 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Employee"));
        setField(term8401, term8401.getClass(), "empno", term8402);
        setField(term8401, term8401.getClass(), "ename", "uAgfQbLPeZ");
        setField(term8401, term8401.getClass(), "job", "aZiFZfzhQT");
        setField(term8401, term8401.getClass(), "mgr", term8428);
        setIntField(term8431, term8431.getClass(), "year", 2028);
        setShortField(term8431, term8431.getClass(), "month", (short) 7);
        setShortField(term8431, term8431.getClass(), "day", (short) 4);
        setField(term8430, term8430.getClass(), "date", term8431);
        setByteField(term8435, term8435.getClass(), "hour", (byte) 13);
        setByteField(term8435, term8435.getClass(), "minute", (byte) 43);
        setByteField(term8435, term8435.getClass(), "second", (byte) 17);
        setIntField(term8435, term8435.getClass(), "nano", 949713407);
        setField(term8430, term8430.getClass(), "time", term8435);
        setField(term8401, term8401.getClass(), "hireDate", term8430);
        setField(term8401, term8401.getClass(), "sal", term8440);
        setField(term8401, term8401.getClass(), "comm", term8442);
        setField(term8444, term8444.getClass(), "deptno", term8445);
        setField(term8444, term8444.getClass(), "dname", "HbzAbCwWRh");
        setField(term8444, term8444.getClass(), "loc", "yBgWgFtVxP");
        setField(term8444, term8444.getClass(), "employees", term8471);
        setField(term8401, term8401.getClass(), "department", term8444);
        setField(term8478, term8478.getClass(), "id", term8479);
        setField(term8478, term8478.getClass(), "username", "HtLEppUqzI");
        setField(term8478, term8478.getClass(), "password", "bVlRrMQeRY");
        setField(term8478, term8478.getClass(), "enabled", term8505);
        setField(term8478, term8478.getClass(), "email", "SXaXhlzAIB");
        setField(term8478, term8478.getClass(), "phone", "UPVTXSXUNh");
        setField(term8478, term8478.getClass(), "role", "cjCXbXuiFn");
        setField(term8543, term8543.getClass(), "empno", term8544);
        setField(term8543, term8543.getClass(), "ename", "SUIYUFtCCe");
        setField(term8543, term8543.getClass(), "job", "eKCrPCkedw");
        setField(term8543, term8543.getClass(), "mgr", term8570);
        setIntField(term8573, term8573.getClass(), "year", 2027);
        setShortField(term8573, term8573.getClass(), "month", (short) 12);
        setShortField(term8573, term8573.getClass(), "day", (short) 25);
        setField(term8572, term8572.getClass(), "date", term8573);
        setByteField(term8577, term8577.getClass(), "hour", (byte) 8);
        setByteField(term8577, term8577.getClass(), "minute", (byte) 19);
        setByteField(term8577, term8577.getClass(), "second", (byte) 20);
        setIntField(term8577, term8577.getClass(), "nano", 127700185);
        setField(term8572, term8572.getClass(), "time", term8577);
        setField(term8543, term8543.getClass(), "hireDate", term8572);
        setField(term8543, term8543.getClass(), "sal", term8582);
        setField(term8543, term8543.getClass(), "comm", term8584);
        setField(term8586, term8586.getClass(), "deptno", term8587);
        setField(term8586, term8586.getClass(), "dname", "");
        setField(term8586, term8586.getClass(), "loc", "");
        setField(term8586, term8586.getClass(), "employees", term8591);
        setField(term8543, term8543.getClass(), "department", term8586);
        setField(term8592, term8592.getClass(), "id", term8593);
        setField(term8592, term8592.getClass(), "username", "");
        setField(term8592, term8592.getClass(), "password", "");
        setField(term8592, term8592.getClass(), "enabled", term8597);
        setField(term8592, term8592.getClass(), "email", "");
        setField(term8592, term8592.getClass(), "phone", "");
        setField(term8592, term8592.getClass(), "role", "");
        setField(term8602, term8602.getClass(), "empno", null);
        setField(term8602, term8602.getClass(), "ename", null);
        setField(term8602, term8602.getClass(), "job", null);
        setField(term8602, term8602.getClass(), "mgr", null);
        setField(term8602, term8602.getClass(), "hireDate", null);
        setField(term8602, term8602.getClass(), "sal", null);
        setField(term8602, term8602.getClass(), "comm", null);
        setField(term8602, term8602.getClass(), "department", null);
        setField(term8602, term8602.getClass(), "userCredential", null);
        setField(term8592, term8592.getClass(), "employee", term8602);
        setField(term8543, term8543.getClass(), "userCredential", term8592);
        setField(term8478, term8478.getClass(), "employee", term8543);
        setField(term8401, term8401.getClass(), "userCredential", term8478);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.selimhorri.app.pack.models.entities.Employee");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHireDate", argTypes, term8401, args);
    }

};


