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
import java.lang.Boolean;
import java.lang.Object;
import java.lang.Double;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class UserCredential_toString_7606450501 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public UserCredential_toString_7606450501() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2 = new Integer(568599855);
        Boolean term28 = new Boolean(false);
        Integer term67 = new Integer(1162663216);
        Integer term93 = new Integer(1484323161);
        Double term105 = new Double(0.13238746331190498);
        Double term107 = new Double(0.3455959125047594);
        Integer term110 = new Integer(391863371);
        HashMap term137 = new HashMap();
        Set<Object> term311 =  ((Map) term137).keySet();
        HashSet term136 = new HashSet((Collection<? extends Object>) term311);
        Integer term143 = new Integer(865208305);
        Boolean term169 = new Boolean(false);
        Integer term208 = new Integer(-2068769794);
        Integer term212 = new Integer(-117576464);
        Double term215 = new Double(0.9828442029246764);
        Double term217 = new Double(0.2779719046761513);
        term1 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.UserCredential"));
        Object term66 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Employee"));
        Object term95 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term96 = newInstance(Class.forName("java.time.LocalDate"));
        Object term100 = newInstance(Class.forName("java.time.LocalTime"));
        Object term109 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Department"));
        Object term142 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.UserCredential"));
        Object term207 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Employee"));
        Object term214 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term219 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Department"));
        Object term220 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.UserCredential"));
        setField(term1, term1.getClass(), "id", term2);
        setField(term1, term1.getClass(), "username", "PAEBtnZtTD");
        setField(term1, term1.getClass(), "password", "sjlJAEtRrb");
        setField(term1, term1.getClass(), "enabled", term28);
        setField(term1, term1.getClass(), "email", "MuLcgQHgqz");
        setField(term1, term1.getClass(), "phone", "xxtlPwDYFs");
        setField(term1, term1.getClass(), "role", "jJCZpVmanW");
        setField(term66, term66.getClass(), "empno", term67);
        setField(term66, term66.getClass(), "ename", "EGtDIRbSSb");
        setField(term66, term66.getClass(), "job", "SzjVpOQTyS");
        setField(term66, term66.getClass(), "mgr", term93);
        setIntField(term96, term96.getClass(), "year", 2012);
        setShortField(term96, term96.getClass(), "month", (short) 8);
        setShortField(term96, term96.getClass(), "day", (short) 25);
        setField(term95, term95.getClass(), "date", term96);
        setByteField(term100, term100.getClass(), "hour", (byte) 5);
        setByteField(term100, term100.getClass(), "minute", (byte) 20);
        setByteField(term100, term100.getClass(), "second", (byte) 50);
        setIntField(term100, term100.getClass(), "nano", 345595912);
        setField(term95, term95.getClass(), "time", term100);
        setField(term66, term66.getClass(), "hireDate", term95);
        setField(term66, term66.getClass(), "sal", term105);
        setField(term66, term66.getClass(), "comm", term107);
        setField(term109, term109.getClass(), "deptno", term110);
        setField(term109, term109.getClass(), "dname", "MjGYSRKTNF");
        setField(term109, term109.getClass(), "loc", "hRNSzYYIrc");
        setField(term109, term109.getClass(), "employees", term136);
        setField(term66, term66.getClass(), "department", term109);
        setField(term142, term142.getClass(), "id", term143);
        setField(term142, term142.getClass(), "username", "wSQxaModmm");
        setField(term142, term142.getClass(), "password", "UlajhuVLaP");
        setField(term142, term142.getClass(), "enabled", term169);
        setField(term142, term142.getClass(), "email", "gGSMzuGICf");
        setField(term142, term142.getClass(), "phone", "hxCBltsObl");
        setField(term142, term142.getClass(), "role", "BndsHwAFMv");
        setField(term207, term207.getClass(), "empno", term208);
        setField(term207, term207.getClass(), "ename", "");
        setField(term207, term207.getClass(), "job", "");
        setField(term207, term207.getClass(), "mgr", term212);
        setField(term214, term214.getClass(), "date", null);
        setField(term214, term214.getClass(), "time", null);
        setField(term207, term207.getClass(), "hireDate", term214);
        setField(term207, term207.getClass(), "sal", term215);
        setField(term207, term207.getClass(), "comm", term217);
        setField(term219, term219.getClass(), "deptno", null);
        setField(term219, term219.getClass(), "dname", null);
        setField(term219, term219.getClass(), "loc", null);
        setField(term219, term219.getClass(), "employees", null);
        setField(term207, term207.getClass(), "department", term219);
        setField(term220, term220.getClass(), "id", null);
        setField(term220, term220.getClass(), "username", null);
        setField(term220, term220.getClass(), "password", null);
        setField(term220, term220.getClass(), "enabled", null);
        setField(term220, term220.getClass(), "email", null);
        setField(term220, term220.getClass(), "phone", null);
        setField(term220, term220.getClass(), "role", null);
        setField(term220, term220.getClass(), "employee", null);
        setField(term207, term207.getClass(), "userCredential", term220);
        setField(term142, term142.getClass(), "employee", term207);
        setField(term66, term66.getClass(), "userCredential", term142);
        setField(term1, term1.getClass(), "employee", term66);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.selimhorri.app.pack.models.entities.UserCredential");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term1, args);
    }

};


