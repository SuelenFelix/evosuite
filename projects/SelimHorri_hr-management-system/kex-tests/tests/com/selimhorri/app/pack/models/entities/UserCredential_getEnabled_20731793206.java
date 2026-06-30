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

public class UserCredential_getEnabled_20731793206 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1594;

    public UserCredential_getEnabled_20731793206() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1595 = new Integer(1555897383);
        Boolean term1621 = new Boolean(true);
        Integer term1660 = new Integer(202001407);
        Integer term1686 = new Integer(158873461);
        Double term1698 = new Double(0.7171972879282721);
        Double term1700 = new Double(0.9006361024877096);
        Integer term1703 = new Integer(-430151637);
        HashMap term1730 = new HashMap();
        Set<Object> term1826 =  ((Map) term1730).keySet();
        HashSet term1729 = new HashSet((Collection<? extends Object>) term1826);
        term1594 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.UserCredential"));
        Object term1659 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Employee"));
        Object term1688 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1689 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1693 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1702 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Department"));
        Object term1735 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.UserCredential"));
        setField(term1594, term1594.getClass(), "id", term1595);
        setField(term1594, term1594.getClass(), "username", "beAMpkroCQ");
        setField(term1594, term1594.getClass(), "password", "uSUvKAyuvd");
        setField(term1594, term1594.getClass(), "enabled", term1621);
        setField(term1594, term1594.getClass(), "email", "onQLVONGuf");
        setField(term1594, term1594.getClass(), "phone", "SOrEHbcbmn");
        setField(term1594, term1594.getClass(), "role", "bnsyeQXFdu");
        setField(term1659, term1659.getClass(), "empno", term1660);
        setField(term1659, term1659.getClass(), "ename", "BwtdjiefJn");
        setField(term1659, term1659.getClass(), "job", "jDmhBrIoDa");
        setField(term1659, term1659.getClass(), "mgr", term1686);
        setIntField(term1689, term1689.getClass(), "year", 2024);
        setShortField(term1689, term1689.getClass(), "month", (short) 5);
        setShortField(term1689, term1689.getClass(), "day", (short) 6);
        setField(term1688, term1688.getClass(), "date", term1689);
        setByteField(term1693, term1693.getClass(), "hour", (byte) 20);
        setByteField(term1693, term1693.getClass(), "minute", (byte) 14);
        setByteField(term1693, term1693.getClass(), "second", (byte) 27);
        setIntField(term1693, term1693.getClass(), "nano", 900636101);
        setField(term1688, term1688.getClass(), "time", term1693);
        setField(term1659, term1659.getClass(), "hireDate", term1688);
        setField(term1659, term1659.getClass(), "sal", term1698);
        setField(term1659, term1659.getClass(), "comm", term1700);
        setField(term1702, term1702.getClass(), "deptno", term1703);
        setField(term1702, term1702.getClass(), "dname", "SPtPatHeOm");
        setField(term1702, term1702.getClass(), "loc", "ywmcuThdfL");
        setField(term1702, term1702.getClass(), "employees", term1729);
        setField(term1659, term1659.getClass(), "department", term1702);
        setField(term1735, term1735.getClass(), "id", null);
        setField(term1735, term1735.getClass(), "username", null);
        setField(term1735, term1735.getClass(), "password", null);
        setField(term1735, term1735.getClass(), "enabled", null);
        setField(term1735, term1735.getClass(), "email", null);
        setField(term1735, term1735.getClass(), "phone", null);
        setField(term1735, term1735.getClass(), "role", null);
        setField(term1735, term1735.getClass(), "employee", null);
        setField(term1659, term1659.getClass(), "userCredential", term1735);
        setField(term1594, term1594.getClass(), "employee", term1659);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.selimhorri.app.pack.models.entities.UserCredential");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEnabled", argTypes, term1594, args);
    }

};


