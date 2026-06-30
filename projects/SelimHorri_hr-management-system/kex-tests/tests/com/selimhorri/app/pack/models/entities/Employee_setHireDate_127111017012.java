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

public class Employee_setHireDate_127111017012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8705;
     Object term8848;

    public Employee_setHireDate_127111017012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term8706 = new Integer(-1242946317);
        Integer term8732 = new Integer(-1541566235);
        Double term8744 = new Double(0.6259114447412901);
        Double term8746 = new Double(0.5795537811016872);
        Integer term8749 = new Integer(-189738995);
        HashMap term8776 = new HashMap();
        Set<Object> term8898 =  ((Map) term8776).keySet();
        HashSet term8775 = new HashSet((Collection<? extends Object>) term8898);
        Integer term8783 = new Integer(-679614653);
        Boolean term8809 = new Boolean(true);
        term8705 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Employee"));
        Object term8734 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8735 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8739 = newInstance(Class.forName("java.time.LocalTime"));
        Object term8748 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Department"));
        Object term8782 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.UserCredential"));
        Object term8847 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Employee"));
        setField(term8705, term8705.getClass(), "empno", term8706);
        setField(term8705, term8705.getClass(), "ename", "fhdhDeWdoi");
        setField(term8705, term8705.getClass(), "job", "FqrcltWSUd");
        setField(term8705, term8705.getClass(), "mgr", term8732);
        setIntField(term8735, term8735.getClass(), "year", 2022);
        setShortField(term8735, term8735.getClass(), "month", (short) 7);
        setShortField(term8735, term8735.getClass(), "day", (short) 9);
        setField(term8734, term8734.getClass(), "date", term8735);
        setByteField(term8739, term8739.getClass(), "hour", (byte) 21);
        setByteField(term8739, term8739.getClass(), "minute", (byte) 48);
        setByteField(term8739, term8739.getClass(), "second", (byte) 58);
        setIntField(term8739, term8739.getClass(), "nano", 579553780);
        setField(term8734, term8734.getClass(), "time", term8739);
        setField(term8705, term8705.getClass(), "hireDate", term8734);
        setField(term8705, term8705.getClass(), "sal", term8744);
        setField(term8705, term8705.getClass(), "comm", term8746);
        setField(term8748, term8748.getClass(), "deptno", term8749);
        setField(term8748, term8748.getClass(), "dname", "kAbILlhsZw");
        setField(term8748, term8748.getClass(), "loc", "QsIOCSpRow");
        setField(term8748, term8748.getClass(), "employees", term8775);
        setField(term8705, term8705.getClass(), "department", term8748);
        setField(term8782, term8782.getClass(), "id", term8783);
        setField(term8782, term8782.getClass(), "username", "PvtJhtGffh");
        setField(term8782, term8782.getClass(), "password", "KReGJTSQuY");
        setField(term8782, term8782.getClass(), "enabled", term8809);
        setField(term8782, term8782.getClass(), "email", "hqZmoXoMuS");
        setField(term8782, term8782.getClass(), "phone", "PUPJWadLXP");
        setField(term8782, term8782.getClass(), "role", "TBNsemBBKA");
        setField(term8847, term8847.getClass(), "empno", null);
        setField(term8847, term8847.getClass(), "ename", null);
        setField(term8847, term8847.getClass(), "job", null);
        setField(term8847, term8847.getClass(), "mgr", null);
        setField(term8847, term8847.getClass(), "hireDate", null);
        setField(term8847, term8847.getClass(), "sal", null);
        setField(term8847, term8847.getClass(), "comm", null);
        setField(term8847, term8847.getClass(), "department", null);
        setField(term8847, term8847.getClass(), "userCredential", null);
        setField(term8782, term8782.getClass(), "employee", term8847);
        setField(term8705, term8705.getClass(), "userCredential", term8782);
        term8848 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8849 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8853 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term8849, term8849.getClass(), "year", 2021);
        setShortField(term8849, term8849.getClass(), "month", (short) 11);
        setShortField(term8849, term8849.getClass(), "day", (short) 19);
        setField(term8848, term8848.getClass(), "date", term8849);
        setByteField(term8853, term8853.getClass(), "hour", (byte) 4);
        setByteField(term8853, term8853.getClass(), "minute", (byte) 39);
        setByteField(term8853, term8853.getClass(), "second", (byte) 43);
        setIntField(term8853, term8853.getClass(), "nano", 638695514);
        setField(term8848, term8848.getClass(), "time", term8853);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.selimhorri.app.pack.models.entities.Employee");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term8848;
        callMethod(klass, "setHireDate", argTypes, term8705, args);
    }

};


