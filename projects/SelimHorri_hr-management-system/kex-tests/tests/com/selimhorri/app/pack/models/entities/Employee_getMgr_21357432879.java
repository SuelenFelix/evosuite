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
     Object term7931;

    public Employee_getMgr_21357432879() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term7932 = new Integer(1670041824);
        Integer term7958 = new Integer(2140388634);
        Double term7970 = new Double(0.2048432493719995);
        Double term7972 = new Double(0.4582776614492583);
        Integer term7975 = new Integer(21095258);
        HashMap term8002 = new HashMap();
        Set<Object> term8114 =  ((Map) term8002).keySet();
        HashSet term8001 = new HashSet((Collection<? extends Object>) term8114);
        Integer term8009 = new Integer(-761675396);
        Boolean term8035 = new Boolean(true);
        term7931 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Employee"));
        Object term7960 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7961 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7965 = newInstance(Class.forName("java.time.LocalTime"));
        Object term7974 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Department"));
        Object term8008 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.UserCredential"));
        Object term8073 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Employee"));
        setField(term7931, term7931.getClass(), "empno", term7932);
        setField(term7931, term7931.getClass(), "ename", "pPxivEPfHY");
        setField(term7931, term7931.getClass(), "job", "BiitfiJmRW");
        setField(term7931, term7931.getClass(), "mgr", term7958);
        setIntField(term7961, term7961.getClass(), "year", 2014);
        setShortField(term7961, term7961.getClass(), "month", (short) 2);
        setShortField(term7961, term7961.getClass(), "day", (short) 5);
        setField(term7960, term7960.getClass(), "date", term7961);
        setByteField(term7965, term7965.getClass(), "hour", (byte) 14);
        setByteField(term7965, term7965.getClass(), "minute", (byte) 2);
        setByteField(term7965, term7965.getClass(), "second", (byte) 4);
        setIntField(term7965, term7965.getClass(), "nano", 458277660);
        setField(term7960, term7960.getClass(), "time", term7965);
        setField(term7931, term7931.getClass(), "hireDate", term7960);
        setField(term7931, term7931.getClass(), "sal", term7970);
        setField(term7931, term7931.getClass(), "comm", term7972);
        setField(term7974, term7974.getClass(), "deptno", term7975);
        setField(term7974, term7974.getClass(), "dname", "ILHarzuGbn");
        setField(term7974, term7974.getClass(), "loc", "uNGHHAwCFL");
        setField(term7974, term7974.getClass(), "employees", term8001);
        setField(term7931, term7931.getClass(), "department", term7974);
        setField(term8008, term8008.getClass(), "id", term8009);
        setField(term8008, term8008.getClass(), "username", "vFhRdscfFA");
        setField(term8008, term8008.getClass(), "password", "ZmfocrvaII");
        setField(term8008, term8008.getClass(), "enabled", term8035);
        setField(term8008, term8008.getClass(), "email", "LTbQXrGKuA");
        setField(term8008, term8008.getClass(), "phone", "gzmGmDALUv");
        setField(term8008, term8008.getClass(), "role", "ZRoptBRTDM");
        setField(term8073, term8073.getClass(), "empno", null);
        setField(term8073, term8073.getClass(), "ename", null);
        setField(term8073, term8073.getClass(), "job", null);
        setField(term8073, term8073.getClass(), "mgr", null);
        setField(term8073, term8073.getClass(), "hireDate", null);
        setField(term8073, term8073.getClass(), "sal", null);
        setField(term8073, term8073.getClass(), "comm", null);
        setField(term8073, term8073.getClass(), "department", null);
        setField(term8073, term8073.getClass(), "userCredential", null);
        setField(term8008, term8008.getClass(), "employee", term8073);
        setField(term7931, term7931.getClass(), "userCredential", term8008);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.selimhorri.app.pack.models.entities.Employee");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMgr", argTypes, term7931, args);
    }

};


