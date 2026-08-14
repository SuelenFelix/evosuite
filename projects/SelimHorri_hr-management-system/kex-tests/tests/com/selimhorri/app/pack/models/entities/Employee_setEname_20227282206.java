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
     Object term6948;

    public Employee_setEname_20227282206() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term6949 = new Integer(-1348703436);
        Integer term6975 = new Integer(-2027012650);
        Double term6987 = new Double(0.5569644096083258);
        Double term6989 = new Double(0.7527275444646349);
        Integer term6992 = new Integer(1343432022);
        HashMap term7019 = new HashMap();
        Set<Object> term7202 =  ((Map) term7019).keySet();
        HashSet term7018 = new HashSet((Collection<? extends Object>) term7202);
        Integer term7026 = new Integer(320739944);
        Boolean term7052 = new Boolean(false);
        Integer term7091 = new Integer(-1767079160);
        Integer term7117 = new Integer(-201010601);
        Double term7129 = new Double(0.38299462989514377);
        Double term7131 = new Double(0.12164012123809098);
        Integer term7134 = new Integer(2060027076);
        HashSet term7138 = new HashSet();
        Integer term7140 = new Integer(1841493736);
        Boolean term7144 = new Boolean(true);
        term6948 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Employee"));
        Object term6977 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6978 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6982 = newInstance(Class.forName("java.time.LocalTime"));
        Object term6991 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Department"));
        Object term7025 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.UserCredential"));
        Object term7090 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Employee"));
        Object term7119 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7120 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7124 = newInstance(Class.forName("java.time.LocalTime"));
        Object term7133 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Department"));
        Object term7139 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.UserCredential"));
        Object term7149 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Employee"));
        setField(term6948, term6948.getClass(), "empno", term6949);
        setField(term6948, term6948.getClass(), "ename", "TowhQcovXu");
        setField(term6948, term6948.getClass(), "job", "UFGOnIMOzf");
        setField(term6948, term6948.getClass(), "mgr", term6975);
        setIntField(term6978, term6978.getClass(), "year", 2021);
        setShortField(term6978, term6978.getClass(), "month", (short) 2);
        setShortField(term6978, term6978.getClass(), "day", (short) 21);
        setField(term6977, term6977.getClass(), "date", term6978);
        setByteField(term6982, term6982.getClass(), "hour", (byte) 4);
        setByteField(term6982, term6982.getClass(), "minute", (byte) 22);
        setByteField(term6982, term6982.getClass(), "second", (byte) 2);
        setIntField(term6982, term6982.getClass(), "nano", 752727543);
        setField(term6977, term6977.getClass(), "time", term6982);
        setField(term6948, term6948.getClass(), "hireDate", term6977);
        setField(term6948, term6948.getClass(), "sal", term6987);
        setField(term6948, term6948.getClass(), "comm", term6989);
        setField(term6991, term6991.getClass(), "deptno", term6992);
        setField(term6991, term6991.getClass(), "dname", "ySiyRlAQpt");
        setField(term6991, term6991.getClass(), "loc", "MiankJgKCp");
        setField(term6991, term6991.getClass(), "employees", term7018);
        setField(term6948, term6948.getClass(), "department", term6991);
        setField(term7025, term7025.getClass(), "id", term7026);
        setField(term7025, term7025.getClass(), "username", "lNbVasLAKL");
        setField(term7025, term7025.getClass(), "password", "wKeyHBCSLZ");
        setField(term7025, term7025.getClass(), "enabled", term7052);
        setField(term7025, term7025.getClass(), "email", "iQCLduwSPi");
        setField(term7025, term7025.getClass(), "phone", "ZcODLNhxqg");
        setField(term7025, term7025.getClass(), "role", "iNtHOROBMq");
        setField(term7090, term7090.getClass(), "empno", term7091);
        setField(term7090, term7090.getClass(), "ename", "lmZBCmpOeb");
        setField(term7090, term7090.getClass(), "job", "cPlYOAUqsP");
        setField(term7090, term7090.getClass(), "mgr", term7117);
        setIntField(term7120, term7120.getClass(), "year", 2017);
        setShortField(term7120, term7120.getClass(), "month", (short) 8);
        setShortField(term7120, term7120.getClass(), "day", (short) 30);
        setField(term7119, term7119.getClass(), "date", term7120);
        setByteField(term7124, term7124.getClass(), "hour", (byte) 3);
        setByteField(term7124, term7124.getClass(), "minute", (byte) 48);
        setByteField(term7124, term7124.getClass(), "second", (byte) 37);
        setIntField(term7124, term7124.getClass(), "nano", 121640121);
        setField(term7119, term7119.getClass(), "time", term7124);
        setField(term7090, term7090.getClass(), "hireDate", term7119);
        setField(term7090, term7090.getClass(), "sal", term7129);
        setField(term7090, term7090.getClass(), "comm", term7131);
        setField(term7133, term7133.getClass(), "deptno", term7134);
        setField(term7133, term7133.getClass(), "dname", "");
        setField(term7133, term7133.getClass(), "loc", "");
        setField(term7133, term7133.getClass(), "employees", term7138);
        setField(term7090, term7090.getClass(), "department", term7133);
        setField(term7139, term7139.getClass(), "id", term7140);
        setField(term7139, term7139.getClass(), "username", "");
        setField(term7139, term7139.getClass(), "password", "");
        setField(term7139, term7139.getClass(), "enabled", term7144);
        setField(term7139, term7139.getClass(), "email", "");
        setField(term7139, term7139.getClass(), "phone", "");
        setField(term7139, term7139.getClass(), "role", "");
        setField(term7149, term7149.getClass(), "empno", null);
        setField(term7149, term7149.getClass(), "ename", null);
        setField(term7149, term7149.getClass(), "job", null);
        setField(term7149, term7149.getClass(), "mgr", null);
        setField(term7149, term7149.getClass(), "hireDate", null);
        setField(term7149, term7149.getClass(), "sal", null);
        setField(term7149, term7149.getClass(), "comm", null);
        setField(term7149, term7149.getClass(), "department", null);
        setField(term7149, term7149.getClass(), "userCredential", null);
        setField(term7139, term7139.getClass(), "employee", term7149);
        setField(term7090, term7090.getClass(), "userCredential", term7139);
        setField(term7025, term7025.getClass(), "employee", term7090);
        setField(term6948, term6948.getClass(), "userCredential", term7025);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.selimhorri.app.pack.models.entities.Employee");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "GbvfbbsrOl";
        callMethod(klass, "setEname", argTypes, term6948, args);
    }

};


