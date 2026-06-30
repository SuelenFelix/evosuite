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

public class Employee_setEname_20227282206 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6939;

    public Employee_setEname_20227282206() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term6940 = new Integer(-1348703436);
        Integer term6966 = new Integer(-2027012650);
        Double term6978 = new Double(0.5569644096083258);
        Double term6980 = new Double(0.7527275444646349);
        Integer term6983 = new Integer(1343432022);
        HashMap term7010 = new HashMap();
        Set<Object> term7193 =  ((Map) term7010).keySet();
        HashSet term7009 = new HashSet((Collection<? extends Object>) term7193);
        Integer term7017 = new Integer(320739944);
        Boolean term7043 = new Boolean(false);
        Integer term7082 = new Integer(-1767079160);
        Integer term7108 = new Integer(-201010601);
        Double term7120 = new Double(0.38299462989514377);
        Double term7122 = new Double(0.12164012123809098);
        Integer term7125 = new Integer(2060027076);
        HashSet term7129 = new HashSet();
        Integer term7131 = new Integer(1841493736);
        Boolean term7135 = new Boolean(true);
        term6939 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Employee"));
        Object term6968 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6969 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6973 = newInstance(Class.forName("java.time.LocalTime"));
        Object term6982 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Department"));
        Object term7016 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.UserCredential"));
        Object term7081 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Employee"));
        Object term7110 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7111 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7115 = newInstance(Class.forName("java.time.LocalTime"));
        Object term7124 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Department"));
        Object term7130 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.UserCredential"));
        Object term7140 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Employee"));
        setField(term6939, term6939.getClass(), "empno", term6940);
        setField(term6939, term6939.getClass(), "ename", "TowhQcovXu");
        setField(term6939, term6939.getClass(), "job", "UFGOnIMOzf");
        setField(term6939, term6939.getClass(), "mgr", term6966);
        setIntField(term6969, term6969.getClass(), "year", 2021);
        setShortField(term6969, term6969.getClass(), "month", (short) 2);
        setShortField(term6969, term6969.getClass(), "day", (short) 21);
        setField(term6968, term6968.getClass(), "date", term6969);
        setByteField(term6973, term6973.getClass(), "hour", (byte) 4);
        setByteField(term6973, term6973.getClass(), "minute", (byte) 22);
        setByteField(term6973, term6973.getClass(), "second", (byte) 2);
        setIntField(term6973, term6973.getClass(), "nano", 752727543);
        setField(term6968, term6968.getClass(), "time", term6973);
        setField(term6939, term6939.getClass(), "hireDate", term6968);
        setField(term6939, term6939.getClass(), "sal", term6978);
        setField(term6939, term6939.getClass(), "comm", term6980);
        setField(term6982, term6982.getClass(), "deptno", term6983);
        setField(term6982, term6982.getClass(), "dname", "ySiyRlAQpt");
        setField(term6982, term6982.getClass(), "loc", "MiankJgKCp");
        setField(term6982, term6982.getClass(), "employees", term7009);
        setField(term6939, term6939.getClass(), "department", term6982);
        setField(term7016, term7016.getClass(), "id", term7017);
        setField(term7016, term7016.getClass(), "username", "lNbVasLAKL");
        setField(term7016, term7016.getClass(), "password", "wKeyHBCSLZ");
        setField(term7016, term7016.getClass(), "enabled", term7043);
        setField(term7016, term7016.getClass(), "email", "iQCLduwSPi");
        setField(term7016, term7016.getClass(), "phone", "ZcODLNhxqg");
        setField(term7016, term7016.getClass(), "role", "iNtHOROBMq");
        setField(term7081, term7081.getClass(), "empno", term7082);
        setField(term7081, term7081.getClass(), "ename", "lmZBCmpOeb");
        setField(term7081, term7081.getClass(), "job", "cPlYOAUqsP");
        setField(term7081, term7081.getClass(), "mgr", term7108);
        setIntField(term7111, term7111.getClass(), "year", 2017);
        setShortField(term7111, term7111.getClass(), "month", (short) 8);
        setShortField(term7111, term7111.getClass(), "day", (short) 30);
        setField(term7110, term7110.getClass(), "date", term7111);
        setByteField(term7115, term7115.getClass(), "hour", (byte) 3);
        setByteField(term7115, term7115.getClass(), "minute", (byte) 48);
        setByteField(term7115, term7115.getClass(), "second", (byte) 37);
        setIntField(term7115, term7115.getClass(), "nano", 121640121);
        setField(term7110, term7110.getClass(), "time", term7115);
        setField(term7081, term7081.getClass(), "hireDate", term7110);
        setField(term7081, term7081.getClass(), "sal", term7120);
        setField(term7081, term7081.getClass(), "comm", term7122);
        setField(term7124, term7124.getClass(), "deptno", term7125);
        setField(term7124, term7124.getClass(), "dname", "");
        setField(term7124, term7124.getClass(), "loc", "");
        setField(term7124, term7124.getClass(), "employees", term7129);
        setField(term7081, term7081.getClass(), "department", term7124);
        setField(term7130, term7130.getClass(), "id", term7131);
        setField(term7130, term7130.getClass(), "username", "");
        setField(term7130, term7130.getClass(), "password", "");
        setField(term7130, term7130.getClass(), "enabled", term7135);
        setField(term7130, term7130.getClass(), "email", "");
        setField(term7130, term7130.getClass(), "phone", "");
        setField(term7130, term7130.getClass(), "role", "");
        setField(term7140, term7140.getClass(), "empno", null);
        setField(term7140, term7140.getClass(), "ename", null);
        setField(term7140, term7140.getClass(), "job", null);
        setField(term7140, term7140.getClass(), "mgr", null);
        setField(term7140, term7140.getClass(), "hireDate", null);
        setField(term7140, term7140.getClass(), "sal", null);
        setField(term7140, term7140.getClass(), "comm", null);
        setField(term7140, term7140.getClass(), "department", null);
        setField(term7140, term7140.getClass(), "userCredential", null);
        setField(term7130, term7130.getClass(), "employee", term7140);
        setField(term7081, term7081.getClass(), "userCredential", term7130);
        setField(term7016, term7016.getClass(), "employee", term7081);
        setField(term6939, term6939.getClass(), "userCredential", term7016);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.selimhorri.app.pack.models.entities.Employee");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "GbvfbbsrOl";
        callMethod(klass, "setEname", argTypes, term6939, args);
    }

};


