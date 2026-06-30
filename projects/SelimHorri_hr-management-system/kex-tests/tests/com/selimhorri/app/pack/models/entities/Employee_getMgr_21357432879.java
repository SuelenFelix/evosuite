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

public class Employee_getMgr_21357432879 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7922;

    public Employee_getMgr_21357432879() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term7923 = new Integer(1670041824);
        Integer term7949 = new Integer(2140388634);
        Double term7961 = new Double(0.2048432493719995);
        Double term7963 = new Double(0.4582776614492583);
        Integer term7966 = new Integer(21095258);
        HashMap term7993 = new HashMap();
        Set<Object> term8105 =  ((Map) term7993).keySet();
        HashSet term7992 = new HashSet((Collection<? extends Object>) term8105);
        Integer term8000 = new Integer(-761675396);
        Boolean term8026 = new Boolean(true);
        term7922 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Employee"));
        Object term7951 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7952 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7956 = newInstance(Class.forName("java.time.LocalTime"));
        Object term7965 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Department"));
        Object term7999 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.UserCredential"));
        Object term8064 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Employee"));
        setField(term7922, term7922.getClass(), "empno", term7923);
        setField(term7922, term7922.getClass(), "ename", "pPxivEPfHY");
        setField(term7922, term7922.getClass(), "job", "BiitfiJmRW");
        setField(term7922, term7922.getClass(), "mgr", term7949);
        setIntField(term7952, term7952.getClass(), "year", 2014);
        setShortField(term7952, term7952.getClass(), "month", (short) 2);
        setShortField(term7952, term7952.getClass(), "day", (short) 5);
        setField(term7951, term7951.getClass(), "date", term7952);
        setByteField(term7956, term7956.getClass(), "hour", (byte) 14);
        setByteField(term7956, term7956.getClass(), "minute", (byte) 2);
        setByteField(term7956, term7956.getClass(), "second", (byte) 4);
        setIntField(term7956, term7956.getClass(), "nano", 458277660);
        setField(term7951, term7951.getClass(), "time", term7956);
        setField(term7922, term7922.getClass(), "hireDate", term7951);
        setField(term7922, term7922.getClass(), "sal", term7961);
        setField(term7922, term7922.getClass(), "comm", term7963);
        setField(term7965, term7965.getClass(), "deptno", term7966);
        setField(term7965, term7965.getClass(), "dname", "ILHarzuGbn");
        setField(term7965, term7965.getClass(), "loc", "uNGHHAwCFL");
        setField(term7965, term7965.getClass(), "employees", term7992);
        setField(term7922, term7922.getClass(), "department", term7965);
        setField(term7999, term7999.getClass(), "id", term8000);
        setField(term7999, term7999.getClass(), "username", "vFhRdscfFA");
        setField(term7999, term7999.getClass(), "password", "ZmfocrvaII");
        setField(term7999, term7999.getClass(), "enabled", term8026);
        setField(term7999, term7999.getClass(), "email", "LTbQXrGKuA");
        setField(term7999, term7999.getClass(), "phone", "gzmGmDALUv");
        setField(term7999, term7999.getClass(), "role", "ZRoptBRTDM");
        setField(term8064, term8064.getClass(), "empno", null);
        setField(term8064, term8064.getClass(), "ename", null);
        setField(term8064, term8064.getClass(), "job", null);
        setField(term8064, term8064.getClass(), "mgr", null);
        setField(term8064, term8064.getClass(), "hireDate", null);
        setField(term8064, term8064.getClass(), "sal", null);
        setField(term8064, term8064.getClass(), "comm", null);
        setField(term8064, term8064.getClass(), "department", null);
        setField(term8064, term8064.getClass(), "userCredential", null);
        setField(term7999, term7999.getClass(), "employee", term8064);
        setField(term7922, term7922.getClass(), "userCredential", term7999);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.selimhorri.app.pack.models.entities.Employee");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMgr", argTypes, term7922, args);
    }

};


