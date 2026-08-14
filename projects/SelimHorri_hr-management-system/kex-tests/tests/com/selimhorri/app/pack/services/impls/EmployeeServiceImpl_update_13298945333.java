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

public class EmployeeServiceImpl_update_13298945333 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term445;

    public EmployeeServiceImpl_update_13298945333() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term446 = new Integer(-1845499264);
        Integer term472 = new Integer(-505439934);
        Double term484 = new Double(0.8566567697571895);
        Double term486 = new Double(0.9203805380592256);
        Integer term489 = new Integer(-344842608);
        HashMap term516 = new HashMap();
        Set<Object> term695 =  ((Map) term516).keySet();
        HashSet term515 = new HashSet((Collection<? extends Object>) term695);
        Integer term523 = new Integer(-341962980);
        Boolean term549 = new Boolean(true);
        Integer term588 = new Integer(1596213415);
        Integer term614 = new Integer(-268815336);
        Double term626 = new Double(0.13246999699526574);
        Double term628 = new Double(0.9126850255993704);
        Integer term631 = new Integer(-1210583429);
        HashSet term635 = new HashSet();
        Integer term637 = new Integer(-663691365);
        Boolean term641 = new Boolean(true);
        Integer term647 = new Integer(-1347665717);
        Integer term649 = new Integer(-1888585309);
        Double term651 = new Double(0.3227335400819148);
        Double term653 = new Double(0.43337207054070237);
        term445 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Employee"));
        Object term474 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term475 = newInstance(Class.forName("java.time.LocalDate"));
        Object term479 = newInstance(Class.forName("java.time.LocalTime"));
        Object term488 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Department"));
        Object term522 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.UserCredential"));
        Object term587 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Employee"));
        Object term616 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term617 = newInstance(Class.forName("java.time.LocalDate"));
        Object term621 = newInstance(Class.forName("java.time.LocalTime"));
        Object term630 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Department"));
        Object term636 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.UserCredential"));
        Object term646 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Employee"));
        setField(term445, term445.getClass(), "empno", term446);
        setField(term445, term445.getClass(), "ename", "sQvGcVjdEx");
        setField(term445, term445.getClass(), "job", "rLHAoqXgPh");
        setField(term445, term445.getClass(), "mgr", term472);
        setIntField(term475, term475.getClass(), "year", 2027);
        setShortField(term475, term475.getClass(), "month", (short) 2);
        setShortField(term475, term475.getClass(), "day", (short) 19);
        setField(term474, term474.getClass(), "date", term475);
        setByteField(term479, term479.getClass(), "hour", (byte) 17);
        setByteField(term479, term479.getClass(), "minute", (byte) 37);
        setByteField(term479, term479.getClass(), "second", (byte) 27);
        setIntField(term479, term479.getClass(), "nano", 920380537);
        setField(term474, term474.getClass(), "time", term479);
        setField(term445, term445.getClass(), "hireDate", term474);
        setField(term445, term445.getClass(), "sal", term484);
        setField(term445, term445.getClass(), "comm", term486);
        setField(term488, term488.getClass(), "deptno", term489);
        setField(term488, term488.getClass(), "dname", "zUlRdimJtU");
        setField(term488, term488.getClass(), "loc", "vwbEQQNQrx");
        setField(term488, term488.getClass(), "employees", term515);
        setField(term445, term445.getClass(), "department", term488);
        setField(term522, term522.getClass(), "id", term523);
        setField(term522, term522.getClass(), "username", "hOncybyCAH");
        setField(term522, term522.getClass(), "password", "QduALnDSVo");
        setField(term522, term522.getClass(), "enabled", term549);
        setField(term522, term522.getClass(), "email", "izPpKDErnQ");
        setField(term522, term522.getClass(), "phone", "NnpwZBUTvx");
        setField(term522, term522.getClass(), "role", "tlQSNgTkQX");
        setField(term587, term587.getClass(), "empno", term588);
        setField(term587, term587.getClass(), "ename", "JppkknKVOw");
        setField(term587, term587.getClass(), "job", "iljANwuEjk");
        setField(term587, term587.getClass(), "mgr", term614);
        setIntField(term617, term617.getClass(), "year", 2012);
        setShortField(term617, term617.getClass(), "month", (short) 8);
        setShortField(term617, term617.getClass(), "day", (short) 25);
        setField(term616, term616.getClass(), "date", term617);
        setByteField(term621, term621.getClass(), "hour", (byte) 19);
        setByteField(term621, term621.getClass(), "minute", (byte) 49);
        setByteField(term621, term621.getClass(), "second", (byte) 8);
        setIntField(term621, term621.getClass(), "nano", 912685024);
        setField(term616, term616.getClass(), "time", term621);
        setField(term587, term587.getClass(), "hireDate", term616);
        setField(term587, term587.getClass(), "sal", term626);
        setField(term587, term587.getClass(), "comm", term628);
        setField(term630, term630.getClass(), "deptno", term631);
        setField(term630, term630.getClass(), "dname", "");
        setField(term630, term630.getClass(), "loc", "");
        setField(term630, term630.getClass(), "employees", term635);
        setField(term587, term587.getClass(), "department", term630);
        setField(term636, term636.getClass(), "id", term637);
        setField(term636, term636.getClass(), "username", "");
        setField(term636, term636.getClass(), "password", "");
        setField(term636, term636.getClass(), "enabled", term641);
        setField(term636, term636.getClass(), "email", "");
        setField(term636, term636.getClass(), "phone", "");
        setField(term636, term636.getClass(), "role", "");
        setField(term646, term646.getClass(), "empno", term647);
        setField(term646, term646.getClass(), "ename", null);
        setField(term646, term646.getClass(), "job", null);
        setField(term646, term646.getClass(), "mgr", term649);
        setField(term646, term646.getClass(), "hireDate", null);
        setField(term646, term646.getClass(), "sal", term651);
        setField(term646, term646.getClass(), "comm", term653);
        setField(term646, term646.getClass(), "department", null);
        setField(term646, term646.getClass(), "userCredential", null);
        setField(term636, term636.getClass(), "employee", term646);
        setField(term587, term587.getClass(), "userCredential", term636);
        setField(term522, term522.getClass(), "employee", term587);
        setField(term445, term445.getClass(), "userCredential", term522);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.selimhorri.app.pack.services.impls.EmployeeServiceImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.selimhorri.app.pack.models.entities.Employee");
        Object[] args = new Object[1];
        args[0] = term445;
        callMethod(klass, "update", argTypes, null, args);
    }

};


