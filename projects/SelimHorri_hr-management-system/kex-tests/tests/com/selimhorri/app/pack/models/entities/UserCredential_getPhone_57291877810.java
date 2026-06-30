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

public class UserCredential_getPhone_57291877810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2812;

    public UserCredential_getPhone_57291877810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2813 = new Integer(-525257914);
        Boolean term2839 = new Boolean(false);
        Integer term2878 = new Integer(147209682);
        Integer term2904 = new Integer(34470066);
        Double term2916 = new Double(0.16755811343784477);
        Double term2918 = new Double(0.9090793968999221);
        Integer term2921 = new Integer(2058711405);
        HashMap term2948 = new HashMap();
        Set<Object> term3044 =  ((Map) term2948).keySet();
        HashSet term2947 = new HashSet((Collection<? extends Object>) term3044);
        term2812 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.UserCredential"));
        Object term2877 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Employee"));
        Object term2906 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2907 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2911 = newInstance(Class.forName("java.time.LocalTime"));
        Object term2920 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Department"));
        Object term2953 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.UserCredential"));
        setField(term2812, term2812.getClass(), "id", term2813);
        setField(term2812, term2812.getClass(), "username", "JeZbrwZmsP");
        setField(term2812, term2812.getClass(), "password", "bxyfeicqrK");
        setField(term2812, term2812.getClass(), "enabled", term2839);
        setField(term2812, term2812.getClass(), "email", "vBnWPlsZMk");
        setField(term2812, term2812.getClass(), "phone", "fIZsWucfXz");
        setField(term2812, term2812.getClass(), "role", "IApvtmfhnq");
        setField(term2877, term2877.getClass(), "empno", term2878);
        setField(term2877, term2877.getClass(), "ename", "VSaNnhMpRc");
        setField(term2877, term2877.getClass(), "job", "QNjNTLlUaV");
        setField(term2877, term2877.getClass(), "mgr", term2904);
        setIntField(term2907, term2907.getClass(), "year", 2013);
        setShortField(term2907, term2907.getClass(), "month", (short) 5);
        setShortField(term2907, term2907.getClass(), "day", (short) 9);
        setField(term2906, term2906.getClass(), "date", term2907);
        setByteField(term2911, term2911.getClass(), "hour", (byte) 4);
        setByteField(term2911, term2911.getClass(), "minute", (byte) 18);
        setByteField(term2911, term2911.getClass(), "second", (byte) 35);
        setIntField(term2911, term2911.getClass(), "nano", 909079395);
        setField(term2906, term2906.getClass(), "time", term2911);
        setField(term2877, term2877.getClass(), "hireDate", term2906);
        setField(term2877, term2877.getClass(), "sal", term2916);
        setField(term2877, term2877.getClass(), "comm", term2918);
        setField(term2920, term2920.getClass(), "deptno", term2921);
        setField(term2920, term2920.getClass(), "dname", "hIYsRyOZxk");
        setField(term2920, term2920.getClass(), "loc", "RjNoEywJbC");
        setField(term2920, term2920.getClass(), "employees", term2947);
        setField(term2877, term2877.getClass(), "department", term2920);
        setField(term2953, term2953.getClass(), "id", null);
        setField(term2953, term2953.getClass(), "username", null);
        setField(term2953, term2953.getClass(), "password", null);
        setField(term2953, term2953.getClass(), "enabled", null);
        setField(term2953, term2953.getClass(), "email", null);
        setField(term2953, term2953.getClass(), "phone", null);
        setField(term2953, term2953.getClass(), "role", null);
        setField(term2953, term2953.getClass(), "employee", null);
        setField(term2877, term2877.getClass(), "userCredential", term2953);
        setField(term2812, term2812.getClass(), "employee", term2877);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.selimhorri.app.pack.models.entities.UserCredential");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPhone", argTypes, term2812, args);
    }

};


