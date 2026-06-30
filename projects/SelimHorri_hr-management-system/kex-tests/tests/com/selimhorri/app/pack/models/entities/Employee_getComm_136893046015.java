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

public class Employee_getComm_136893046015 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9498;

    public Employee_getComm_136893046015() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term9499 = new Integer(1151963130);
        Integer term9525 = new Integer(-1855819749);
        Double term9537 = new Double(0.9329152993716182);
        Double term9539 = new Double(0.19249622994976234);
        Integer term9542 = new Integer(1059048043);
        HashMap term9569 = new HashMap();
        Set<Object> term9681 =  ((Map) term9569).keySet();
        HashSet term9568 = new HashSet((Collection<? extends Object>) term9681);
        Integer term9576 = new Integer(-359675864);
        Boolean term9602 = new Boolean(false);
        term9498 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Employee"));
        Object term9527 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9528 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9532 = newInstance(Class.forName("java.time.LocalTime"));
        Object term9541 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Department"));
        Object term9575 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.UserCredential"));
        Object term9640 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Employee"));
        setField(term9498, term9498.getClass(), "empno", term9499);
        setField(term9498, term9498.getClass(), "ename", "bjLZqJqmnv");
        setField(term9498, term9498.getClass(), "job", "TPbMBzbcHs");
        setField(term9498, term9498.getClass(), "mgr", term9525);
        setIntField(term9528, term9528.getClass(), "year", 2013);
        setShortField(term9528, term9528.getClass(), "month", (short) 11);
        setShortField(term9528, term9528.getClass(), "day", (short) 7);
        setField(term9527, term9527.getClass(), "date", term9528);
        setByteField(term9532, term9532.getClass(), "hour", (byte) 9);
        setByteField(term9532, term9532.getClass(), "minute", (byte) 3);
        setByteField(term9532, term9532.getClass(), "second", (byte) 32);
        setIntField(term9532, term9532.getClass(), "nano", 53548583);
        setField(term9527, term9527.getClass(), "time", term9532);
        setField(term9498, term9498.getClass(), "hireDate", term9527);
        setField(term9498, term9498.getClass(), "sal", term9537);
        setField(term9498, term9498.getClass(), "comm", term9539);
        setField(term9541, term9541.getClass(), "deptno", term9542);
        setField(term9541, term9541.getClass(), "dname", "spkDvqsOhJ");
        setField(term9541, term9541.getClass(), "loc", "faFVBESzWc");
        setField(term9541, term9541.getClass(), "employees", term9568);
        setField(term9498, term9498.getClass(), "department", term9541);
        setField(term9575, term9575.getClass(), "id", term9576);
        setField(term9575, term9575.getClass(), "username", "PxinRhWgwT");
        setField(term9575, term9575.getClass(), "password", "pZcEKUNIXL");
        setField(term9575, term9575.getClass(), "enabled", term9602);
        setField(term9575, term9575.getClass(), "email", "QbRtvZIDtW");
        setField(term9575, term9575.getClass(), "phone", "fbsmDvjMqr");
        setField(term9575, term9575.getClass(), "role", "tycssGWZvU");
        setField(term9640, term9640.getClass(), "empno", null);
        setField(term9640, term9640.getClass(), "ename", null);
        setField(term9640, term9640.getClass(), "job", null);
        setField(term9640, term9640.getClass(), "mgr", null);
        setField(term9640, term9640.getClass(), "hireDate", null);
        setField(term9640, term9640.getClass(), "sal", null);
        setField(term9640, term9640.getClass(), "comm", null);
        setField(term9640, term9640.getClass(), "department", null);
        setField(term9640, term9640.getClass(), "userCredential", null);
        setField(term9575, term9575.getClass(), "employee", term9640);
        setField(term9498, term9498.getClass(), "userCredential", term9575);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.selimhorri.app.pack.models.entities.Employee");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getComm", argTypes, term9498, args);
    }

};


