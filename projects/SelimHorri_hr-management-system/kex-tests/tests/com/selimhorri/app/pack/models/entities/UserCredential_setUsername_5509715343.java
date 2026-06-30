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

public class UserCredential_setUsername_5509715343 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term595;

    public UserCredential_setUsername_5509715343() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term596 = new Integer(493620644);
        Boolean term622 = new Boolean(true);
        Integer term661 = new Integer(1328271830);
        Integer term687 = new Integer(1596070772);
        Double term699 = new Double(0.22651340641904605);
        Double term701 = new Double(0.8878841294187743);
        Integer term704 = new Integer(97029295);
        HashMap term731 = new HashMap();
        Set<Object> term917 =  ((Map) term731).keySet();
        HashSet term730 = new HashSet((Collection<? extends Object>) term917);
        Integer term737 = new Integer(1090617576);
        Boolean term763 = new Boolean(false);
        Integer term802 = new Integer(962840079);
        Integer term806 = new Integer(1540719661);
        Double term809 = new Double(0.7591353014991907);
        Double term811 = new Double(0.791695029600875);
        term595 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.UserCredential"));
        Object term660 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Employee"));
        Object term689 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term690 = newInstance(Class.forName("java.time.LocalDate"));
        Object term694 = newInstance(Class.forName("java.time.LocalTime"));
        Object term703 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Department"));
        Object term736 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.UserCredential"));
        Object term801 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Employee"));
        Object term808 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term813 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Department"));
        Object term814 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.UserCredential"));
        setField(term595, term595.getClass(), "id", term596);
        setField(term595, term595.getClass(), "username", "vjxIhXHxGR");
        setField(term595, term595.getClass(), "password", "QXzGXbEXMu");
        setField(term595, term595.getClass(), "enabled", term622);
        setField(term595, term595.getClass(), "email", "qxSDVejjiY");
        setField(term595, term595.getClass(), "phone", "xBsXSDjXYK");
        setField(term595, term595.getClass(), "role", "sEnIVFtZuQ");
        setField(term660, term660.getClass(), "empno", term661);
        setField(term660, term660.getClass(), "ename", "ZVecLZMLHF");
        setField(term660, term660.getClass(), "job", "fztQhjqwdP");
        setField(term660, term660.getClass(), "mgr", term687);
        setIntField(term690, term690.getClass(), "year", 2014);
        setShortField(term690, term690.getClass(), "month", (short) 7);
        setShortField(term690, term690.getClass(), "day", (short) 13);
        setField(term689, term689.getClass(), "date", term690);
        setByteField(term694, term694.getClass(), "hour", (byte) 21);
        setByteField(term694, term694.getClass(), "minute", (byte) 46);
        setByteField(term694, term694.getClass(), "second", (byte) 0);
        setIntField(term694, term694.getClass(), "nano", 887884128);
        setField(term689, term689.getClass(), "time", term694);
        setField(term660, term660.getClass(), "hireDate", term689);
        setField(term660, term660.getClass(), "sal", term699);
        setField(term660, term660.getClass(), "comm", term701);
        setField(term703, term703.getClass(), "deptno", term704);
        setField(term703, term703.getClass(), "dname", "eVpkWxjuki");
        setField(term703, term703.getClass(), "loc", "SJiQaLvSKv");
        setField(term703, term703.getClass(), "employees", term730);
        setField(term660, term660.getClass(), "department", term703);
        setField(term736, term736.getClass(), "id", term737);
        setField(term736, term736.getClass(), "username", "UfQtPRyWRC");
        setField(term736, term736.getClass(), "password", "FPvxVzzSvD");
        setField(term736, term736.getClass(), "enabled", term763);
        setField(term736, term736.getClass(), "email", "WHcwFgsGFC");
        setField(term736, term736.getClass(), "phone", "HzqpegHiRq");
        setField(term736, term736.getClass(), "role", "jwsfVjMoJT");
        setField(term801, term801.getClass(), "empno", term802);
        setField(term801, term801.getClass(), "ename", "");
        setField(term801, term801.getClass(), "job", "");
        setField(term801, term801.getClass(), "mgr", term806);
        setField(term808, term808.getClass(), "date", null);
        setField(term808, term808.getClass(), "time", null);
        setField(term801, term801.getClass(), "hireDate", term808);
        setField(term801, term801.getClass(), "sal", term809);
        setField(term801, term801.getClass(), "comm", term811);
        setField(term813, term813.getClass(), "deptno", null);
        setField(term813, term813.getClass(), "dname", null);
        setField(term813, term813.getClass(), "loc", null);
        setField(term813, term813.getClass(), "employees", null);
        setField(term801, term801.getClass(), "department", term813);
        setField(term814, term814.getClass(), "id", null);
        setField(term814, term814.getClass(), "username", null);
        setField(term814, term814.getClass(), "password", null);
        setField(term814, term814.getClass(), "enabled", null);
        setField(term814, term814.getClass(), "email", null);
        setField(term814, term814.getClass(), "phone", null);
        setField(term814, term814.getClass(), "role", null);
        setField(term814, term814.getClass(), "employee", null);
        setField(term801, term801.getClass(), "userCredential", term814);
        setField(term736, term736.getClass(), "employee", term801);
        setField(term660, term660.getClass(), "userCredential", term736);
        setField(term595, term595.getClass(), "employee", term660);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.selimhorri.app.pack.models.entities.UserCredential");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ZfdXfCCFDf";
        callMethod(klass, "setUsername", argTypes, term595, args);
    }

};


