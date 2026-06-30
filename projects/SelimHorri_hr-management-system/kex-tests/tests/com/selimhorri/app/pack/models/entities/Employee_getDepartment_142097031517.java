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
     Object term9968;

    public Employee_getDepartment_142097031517() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term9969 = new Integer(1505375686);
        Integer term9995 = new Integer(-132005524);
        Double term10007 = new Double(0.14092209049948845);
        Double term10009 = new Double(0.7386250421411282);
        Integer term10012 = new Integer(-1235127374);
        HashMap term10039 = new HashMap();
        Set<Object> term10151 =  ((Map) term10039).keySet();
        HashSet term10038 = new HashSet((Collection<? extends Object>) term10151);
        Integer term10046 = new Integer(1763217806);
        Boolean term10072 = new Boolean(false);
        term9968 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Employee"));
        Object term9997 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9998 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10002 = newInstance(Class.forName("java.time.LocalTime"));
        Object term10011 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Department"));
        Object term10045 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.UserCredential"));
        Object term10110 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Employee"));
        setField(term9968, term9968.getClass(), "empno", term9969);
        setField(term9968, term9968.getClass(), "ename", "KDKQhbiclt");
        setField(term9968, term9968.getClass(), "job", "diWnDDpNWl");
        setField(term9968, term9968.getClass(), "mgr", term9995);
        setIntField(term9998, term9998.getClass(), "year", 2012);
        setShortField(term9998, term9998.getClass(), "month", (short) 10);
        setShortField(term9998, term9998.getClass(), "day", (short) 26);
        setField(term9997, term9997.getClass(), "date", term9998);
        setByteField(term10002, term10002.getClass(), "hour", (byte) 13);
        setByteField(term10002, term10002.getClass(), "minute", (byte) 50);
        setByteField(term10002, term10002.getClass(), "second", (byte) 34);
        setIntField(term10002, term10002.getClass(), "nano", 738625041);
        setField(term9997, term9997.getClass(), "time", term10002);
        setField(term9968, term9968.getClass(), "hireDate", term9997);
        setField(term9968, term9968.getClass(), "sal", term10007);
        setField(term9968, term9968.getClass(), "comm", term10009);
        setField(term10011, term10011.getClass(), "deptno", term10012);
        setField(term10011, term10011.getClass(), "dname", "jcrJhyEbDI");
        setField(term10011, term10011.getClass(), "loc", "DHbGOjJfEz");
        setField(term10011, term10011.getClass(), "employees", term10038);
        setField(term9968, term9968.getClass(), "department", term10011);
        setField(term10045, term10045.getClass(), "id", term10046);
        setField(term10045, term10045.getClass(), "username", "XhnCbWwpIr");
        setField(term10045, term10045.getClass(), "password", "BVMUadSiyU");
        setField(term10045, term10045.getClass(), "enabled", term10072);
        setField(term10045, term10045.getClass(), "email", "OhWrgFwvJi");
        setField(term10045, term10045.getClass(), "phone", "DfKWXfTINQ");
        setField(term10045, term10045.getClass(), "role", "KqusFIxuyo");
        setField(term10110, term10110.getClass(), "empno", null);
        setField(term10110, term10110.getClass(), "ename", null);
        setField(term10110, term10110.getClass(), "job", null);
        setField(term10110, term10110.getClass(), "mgr", null);
        setField(term10110, term10110.getClass(), "hireDate", null);
        setField(term10110, term10110.getClass(), "sal", null);
        setField(term10110, term10110.getClass(), "comm", null);
        setField(term10110, term10110.getClass(), "department", null);
        setField(term10110, term10110.getClass(), "userCredential", null);
        setField(term10045, term10045.getClass(), "employee", term10110);
        setField(term9968, term9968.getClass(), "userCredential", term10045);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.selimhorri.app.pack.models.entities.Employee");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDepartment", argTypes, term9968, args);
    }

};


