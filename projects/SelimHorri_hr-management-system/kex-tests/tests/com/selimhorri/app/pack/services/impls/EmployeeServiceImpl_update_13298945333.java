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
     Object term447;

    public EmployeeServiceImpl_update_13298945333() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term448 = new Integer(-1845499264);
        Integer term474 = new Integer(-505439934);
        Double term486 = new Double(0.8566567697571895);
        Double term488 = new Double(0.9203805380592256);
        Integer term491 = new Integer(-344842608);
        HashMap term518 = new HashMap();
        Set<Object> term697 =  ((Map) term518).keySet();
        HashSet term517 = new HashSet((Collection<? extends Object>) term697);
        Integer term525 = new Integer(-341962980);
        Boolean term551 = new Boolean(true);
        Integer term590 = new Integer(1596213415);
        Integer term616 = new Integer(-268815336);
        Double term628 = new Double(0.13246999699526574);
        Double term630 = new Double(0.9126850255993704);
        Integer term633 = new Integer(-1210583429);
        HashSet term637 = new HashSet();
        Integer term639 = new Integer(-663691365);
        Boolean term643 = new Boolean(true);
        Integer term649 = new Integer(-1347665717);
        Integer term651 = new Integer(-1888585309);
        Double term653 = new Double(0.3227335400819148);
        Double term655 = new Double(0.43337207054070237);
        term447 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Employee"));
        Object term476 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term477 = newInstance(Class.forName("java.time.LocalDate"));
        Object term481 = newInstance(Class.forName("java.time.LocalTime"));
        Object term490 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Department"));
        Object term524 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.UserCredential"));
        Object term589 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Employee"));
        Object term618 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term619 = newInstance(Class.forName("java.time.LocalDate"));
        Object term623 = newInstance(Class.forName("java.time.LocalTime"));
        Object term632 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Department"));
        Object term638 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.UserCredential"));
        Object term648 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Employee"));
        setField(term447, term447.getClass(), "empno", term448);
        setField(term447, term447.getClass(), "ename", "sQvGcVjdEx");
        setField(term447, term447.getClass(), "job", "rLHAoqXgPh");
        setField(term447, term447.getClass(), "mgr", term474);
        setIntField(term477, term477.getClass(), "year", 2027);
        setShortField(term477, term477.getClass(), "month", (short) 2);
        setShortField(term477, term477.getClass(), "day", (short) 19);
        setField(term476, term476.getClass(), "date", term477);
        setByteField(term481, term481.getClass(), "hour", (byte) 17);
        setByteField(term481, term481.getClass(), "minute", (byte) 37);
        setByteField(term481, term481.getClass(), "second", (byte) 27);
        setIntField(term481, term481.getClass(), "nano", 920380537);
        setField(term476, term476.getClass(), "time", term481);
        setField(term447, term447.getClass(), "hireDate", term476);
        setField(term447, term447.getClass(), "sal", term486);
        setField(term447, term447.getClass(), "comm", term488);
        setField(term490, term490.getClass(), "deptno", term491);
        setField(term490, term490.getClass(), "dname", "zUlRdimJtU");
        setField(term490, term490.getClass(), "loc", "vwbEQQNQrx");
        setField(term490, term490.getClass(), "employees", term517);
        setField(term447, term447.getClass(), "department", term490);
        setField(term524, term524.getClass(), "id", term525);
        setField(term524, term524.getClass(), "username", "hOncybyCAH");
        setField(term524, term524.getClass(), "password", "QduALnDSVo");
        setField(term524, term524.getClass(), "enabled", term551);
        setField(term524, term524.getClass(), "email", "izPpKDErnQ");
        setField(term524, term524.getClass(), "phone", "NnpwZBUTvx");
        setField(term524, term524.getClass(), "role", "tlQSNgTkQX");
        setField(term589, term589.getClass(), "empno", term590);
        setField(term589, term589.getClass(), "ename", "JppkknKVOw");
        setField(term589, term589.getClass(), "job", "iljANwuEjk");
        setField(term589, term589.getClass(), "mgr", term616);
        setIntField(term619, term619.getClass(), "year", 2012);
        setShortField(term619, term619.getClass(), "month", (short) 8);
        setShortField(term619, term619.getClass(), "day", (short) 25);
        setField(term618, term618.getClass(), "date", term619);
        setByteField(term623, term623.getClass(), "hour", (byte) 19);
        setByteField(term623, term623.getClass(), "minute", (byte) 49);
        setByteField(term623, term623.getClass(), "second", (byte) 8);
        setIntField(term623, term623.getClass(), "nano", 912685024);
        setField(term618, term618.getClass(), "time", term623);
        setField(term589, term589.getClass(), "hireDate", term618);
        setField(term589, term589.getClass(), "sal", term628);
        setField(term589, term589.getClass(), "comm", term630);
        setField(term632, term632.getClass(), "deptno", term633);
        setField(term632, term632.getClass(), "dname", "");
        setField(term632, term632.getClass(), "loc", "");
        setField(term632, term632.getClass(), "employees", term637);
        setField(term589, term589.getClass(), "department", term632);
        setField(term638, term638.getClass(), "id", term639);
        setField(term638, term638.getClass(), "username", "");
        setField(term638, term638.getClass(), "password", "");
        setField(term638, term638.getClass(), "enabled", term643);
        setField(term638, term638.getClass(), "email", "");
        setField(term638, term638.getClass(), "phone", "");
        setField(term638, term638.getClass(), "role", "");
        setField(term648, term648.getClass(), "empno", term649);
        setField(term648, term648.getClass(), "ename", null);
        setField(term648, term648.getClass(), "job", null);
        setField(term648, term648.getClass(), "mgr", term651);
        setField(term648, term648.getClass(), "hireDate", null);
        setField(term648, term648.getClass(), "sal", term653);
        setField(term648, term648.getClass(), "comm", term655);
        setField(term648, term648.getClass(), "department", null);
        setField(term648, term648.getClass(), "userCredential", null);
        setField(term638, term638.getClass(), "employee", term648);
        setField(term589, term589.getClass(), "userCredential", term638);
        setField(term524, term524.getClass(), "employee", term589);
        setField(term447, term447.getClass(), "userCredential", term524);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.selimhorri.app.pack.services.impls.EmployeeServiceImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.selimhorri.app.pack.models.entities.Employee");
        Object[] args = new Object[1];
        args[0] = term447;
        callMethod(klass, "update", argTypes, null, args);
    }

};


