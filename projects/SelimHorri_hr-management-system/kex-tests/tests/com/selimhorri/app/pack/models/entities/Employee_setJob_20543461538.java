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

public class Employee_setJob_20543461538 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7587;

    public Employee_setJob_20543461538() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term7588 = new Integer(2052244839);
        Integer term7614 = new Integer(-1763480506);
        Double term7626 = new Double(0.47349918501511923);
        Double term7628 = new Double(0.1241386580280961);
        Integer term7631 = new Integer(-1541297110);
        HashMap term7658 = new HashMap();
        Set<Object> term7841 =  ((Map) term7658).keySet();
        HashSet term7657 = new HashSet((Collection<? extends Object>) term7841);
        Integer term7665 = new Integer(1186917020);
        Boolean term7691 = new Boolean(false);
        Integer term7730 = new Integer(-1007935918);
        Integer term7756 = new Integer(1485731037);
        Double term7768 = new Double(0.6635389764920203);
        Double term7770 = new Double(0.9118883779077857);
        Integer term7773 = new Integer(1304396087);
        HashSet term7777 = new HashSet();
        Integer term7779 = new Integer(1782600602);
        Boolean term7783 = new Boolean(true);
        term7587 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Employee"));
        Object term7616 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7617 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7621 = newInstance(Class.forName("java.time.LocalTime"));
        Object term7630 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Department"));
        Object term7664 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.UserCredential"));
        Object term7729 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Employee"));
        Object term7758 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7759 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7763 = newInstance(Class.forName("java.time.LocalTime"));
        Object term7772 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Department"));
        Object term7778 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.UserCredential"));
        Object term7788 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Employee"));
        setField(term7587, term7587.getClass(), "empno", term7588);
        setField(term7587, term7587.getClass(), "ename", "ttlGywalKc");
        setField(term7587, term7587.getClass(), "job", "rQFBspqBzf");
        setField(term7587, term7587.getClass(), "mgr", term7614);
        setIntField(term7617, term7617.getClass(), "year", 2019);
        setShortField(term7617, term7617.getClass(), "month", (short) 6);
        setShortField(term7617, term7617.getClass(), "day", (short) 22);
        setField(term7616, term7616.getClass(), "date", term7617);
        setByteField(term7621, term7621.getClass(), "hour", (byte) 9);
        setByteField(term7621, term7621.getClass(), "minute", (byte) 14);
        setByteField(term7621, term7621.getClass(), "second", (byte) 27);
        setIntField(term7621, term7621.getClass(), "nano", 124138657);
        setField(term7616, term7616.getClass(), "time", term7621);
        setField(term7587, term7587.getClass(), "hireDate", term7616);
        setField(term7587, term7587.getClass(), "sal", term7626);
        setField(term7587, term7587.getClass(), "comm", term7628);
        setField(term7630, term7630.getClass(), "deptno", term7631);
        setField(term7630, term7630.getClass(), "dname", "FmWhAOGAMI");
        setField(term7630, term7630.getClass(), "loc", "GdjCkRsIrS");
        setField(term7630, term7630.getClass(), "employees", term7657);
        setField(term7587, term7587.getClass(), "department", term7630);
        setField(term7664, term7664.getClass(), "id", term7665);
        setField(term7664, term7664.getClass(), "username", "OUrtbTvuiW");
        setField(term7664, term7664.getClass(), "password", "UnkpYLSsCR");
        setField(term7664, term7664.getClass(), "enabled", term7691);
        setField(term7664, term7664.getClass(), "email", "AaxnITALtd");
        setField(term7664, term7664.getClass(), "phone", "RdnRRpWglh");
        setField(term7664, term7664.getClass(), "role", "YcXTXuOFYV");
        setField(term7729, term7729.getClass(), "empno", term7730);
        setField(term7729, term7729.getClass(), "ename", "zYOmoQqDOd");
        setField(term7729, term7729.getClass(), "job", "kmgEVEqTGa");
        setField(term7729, term7729.getClass(), "mgr", term7756);
        setIntField(term7759, term7759.getClass(), "year", 2023);
        setShortField(term7759, term7759.getClass(), "month", (short) 4);
        setShortField(term7759, term7759.getClass(), "day", (short) 10);
        setField(term7758, term7758.getClass(), "date", term7759);
        setByteField(term7763, term7763.getClass(), "hour", (byte) 19);
        setByteField(term7763, term7763.getClass(), "minute", (byte) 34);
        setByteField(term7763, term7763.getClass(), "second", (byte) 41);
        setIntField(term7763, term7763.getClass(), "nano", 911888376);
        setField(term7758, term7758.getClass(), "time", term7763);
        setField(term7729, term7729.getClass(), "hireDate", term7758);
        setField(term7729, term7729.getClass(), "sal", term7768);
        setField(term7729, term7729.getClass(), "comm", term7770);
        setField(term7772, term7772.getClass(), "deptno", term7773);
        setField(term7772, term7772.getClass(), "dname", "");
        setField(term7772, term7772.getClass(), "loc", "");
        setField(term7772, term7772.getClass(), "employees", term7777);
        setField(term7729, term7729.getClass(), "department", term7772);
        setField(term7778, term7778.getClass(), "id", term7779);
        setField(term7778, term7778.getClass(), "username", "");
        setField(term7778, term7778.getClass(), "password", "");
        setField(term7778, term7778.getClass(), "enabled", term7783);
        setField(term7778, term7778.getClass(), "email", "");
        setField(term7778, term7778.getClass(), "phone", "");
        setField(term7778, term7778.getClass(), "role", "");
        setField(term7788, term7788.getClass(), "empno", null);
        setField(term7788, term7788.getClass(), "ename", null);
        setField(term7788, term7788.getClass(), "job", null);
        setField(term7788, term7788.getClass(), "mgr", null);
        setField(term7788, term7788.getClass(), "hireDate", null);
        setField(term7788, term7788.getClass(), "sal", null);
        setField(term7788, term7788.getClass(), "comm", null);
        setField(term7788, term7788.getClass(), "department", null);
        setField(term7788, term7788.getClass(), "userCredential", null);
        setField(term7778, term7778.getClass(), "employee", term7788);
        setField(term7729, term7729.getClass(), "userCredential", term7778);
        setField(term7664, term7664.getClass(), "employee", term7729);
        setField(term7587, term7587.getClass(), "userCredential", term7664);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.selimhorri.app.pack.models.entities.Employee");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "HGhIlMCaKM";
        callMethod(klass, "setJob", argTypes, term7587, args);
    }

};


