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

public class UserCredential_getPassword_198353614 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term978;

    public UserCredential_getPassword_198353614() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term979 = new Integer(-1547384488);
        Boolean term1005 = new Boolean(true);
        Integer term1044 = new Integer(1442160736);
        Integer term1070 = new Integer(1114000454);
        Double term1082 = new Double(0.3227335400819148);
        Double term1084 = new Double(0.43337207054070237);
        Integer term1087 = new Integer(-556405712);
        HashMap term1114 = new HashMap();
        Set<Object> term1210 =  ((Map) term1114).keySet();
        HashSet term1113 = new HashSet((Collection<? extends Object>) term1210);
        term978 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.UserCredential"));
        Object term1043 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Employee"));
        Object term1072 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1073 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1077 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1086 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Department"));
        Object term1119 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.UserCredential"));
        setField(term978, term978.getClass(), "id", term979);
        setField(term978, term978.getClass(), "username", "MwwjNtdOFT");
        setField(term978, term978.getClass(), "password", "VYkqXKVlAJ");
        setField(term978, term978.getClass(), "enabled", term1005);
        setField(term978, term978.getClass(), "email", "XkIoWJRNwN");
        setField(term978, term978.getClass(), "phone", "aNWLJdrZMq");
        setField(term978, term978.getClass(), "role", "HHmNoYxIGj");
        setField(term1043, term1043.getClass(), "empno", term1044);
        setField(term1043, term1043.getClass(), "ename", "PtirvZmsGt");
        setField(term1043, term1043.getClass(), "job", "HWkpTmtlrc");
        setField(term1043, term1043.getClass(), "mgr", term1070);
        setIntField(term1073, term1073.getClass(), "year", 2016);
        setShortField(term1073, term1073.getClass(), "month", (short) 6);
        setShortField(term1073, term1073.getClass(), "day", (short) 15);
        setField(term1072, term1072.getClass(), "date", term1073);
        setByteField(term1077, term1077.getClass(), "hour", (byte) 21);
        setByteField(term1077, term1077.getClass(), "minute", (byte) 23);
        setByteField(term1077, term1077.getClass(), "second", (byte) 23);
        setIntField(term1077, term1077.getClass(), "nano", 433372070);
        setField(term1072, term1072.getClass(), "time", term1077);
        setField(term1043, term1043.getClass(), "hireDate", term1072);
        setField(term1043, term1043.getClass(), "sal", term1082);
        setField(term1043, term1043.getClass(), "comm", term1084);
        setField(term1086, term1086.getClass(), "deptno", term1087);
        setField(term1086, term1086.getClass(), "dname", "hMmaoREuCK");
        setField(term1086, term1086.getClass(), "loc", "VeDtgDzGAN");
        setField(term1086, term1086.getClass(), "employees", term1113);
        setField(term1043, term1043.getClass(), "department", term1086);
        setField(term1119, term1119.getClass(), "id", null);
        setField(term1119, term1119.getClass(), "username", null);
        setField(term1119, term1119.getClass(), "password", null);
        setField(term1119, term1119.getClass(), "enabled", null);
        setField(term1119, term1119.getClass(), "email", null);
        setField(term1119, term1119.getClass(), "phone", null);
        setField(term1119, term1119.getClass(), "role", null);
        setField(term1119, term1119.getClass(), "employee", null);
        setField(term1043, term1043.getClass(), "userCredential", term1119);
        setField(term978, term978.getClass(), "employee", term1043);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.selimhorri.app.pack.models.entities.UserCredential");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPassword", argTypes, term978, args);
    }

};


