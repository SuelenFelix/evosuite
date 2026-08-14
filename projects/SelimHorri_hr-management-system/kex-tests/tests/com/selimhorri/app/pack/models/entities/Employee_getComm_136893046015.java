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
     Object term9507;

    public Employee_getComm_136893046015() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term9508 = new Integer(1151963130);
        Integer term9534 = new Integer(-1855819749);
        Double term9546 = new Double(0.9329152993716182);
        Double term9548 = new Double(0.19249622994976234);
        Integer term9551 = new Integer(1059048043);
        HashMap term9578 = new HashMap();
        Set<Object> term9690 =  ((Map) term9578).keySet();
        HashSet term9577 = new HashSet((Collection<? extends Object>) term9690);
        Integer term9585 = new Integer(-359675864);
        Boolean term9611 = new Boolean(false);
        term9507 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Employee"));
        Object term9536 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9537 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9541 = newInstance(Class.forName("java.time.LocalTime"));
        Object term9550 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Department"));
        Object term9584 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.UserCredential"));
        Object term9649 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Employee"));
        setField(term9507, term9507.getClass(), "empno", term9508);
        setField(term9507, term9507.getClass(), "ename", "bjLZqJqmnv");
        setField(term9507, term9507.getClass(), "job", "TPbMBzbcHs");
        setField(term9507, term9507.getClass(), "mgr", term9534);
        setIntField(term9537, term9537.getClass(), "year", 2013);
        setShortField(term9537, term9537.getClass(), "month", (short) 11);
        setShortField(term9537, term9537.getClass(), "day", (short) 7);
        setField(term9536, term9536.getClass(), "date", term9537);
        setByteField(term9541, term9541.getClass(), "hour", (byte) 9);
        setByteField(term9541, term9541.getClass(), "minute", (byte) 3);
        setByteField(term9541, term9541.getClass(), "second", (byte) 32);
        setIntField(term9541, term9541.getClass(), "nano", 53548583);
        setField(term9536, term9536.getClass(), "time", term9541);
        setField(term9507, term9507.getClass(), "hireDate", term9536);
        setField(term9507, term9507.getClass(), "sal", term9546);
        setField(term9507, term9507.getClass(), "comm", term9548);
        setField(term9550, term9550.getClass(), "deptno", term9551);
        setField(term9550, term9550.getClass(), "dname", "spkDvqsOhJ");
        setField(term9550, term9550.getClass(), "loc", "faFVBESzWc");
        setField(term9550, term9550.getClass(), "employees", term9577);
        setField(term9507, term9507.getClass(), "department", term9550);
        setField(term9584, term9584.getClass(), "id", term9585);
        setField(term9584, term9584.getClass(), "username", "PxinRhWgwT");
        setField(term9584, term9584.getClass(), "password", "pZcEKUNIXL");
        setField(term9584, term9584.getClass(), "enabled", term9611);
        setField(term9584, term9584.getClass(), "email", "QbRtvZIDtW");
        setField(term9584, term9584.getClass(), "phone", "fbsmDvjMqr");
        setField(term9584, term9584.getClass(), "role", "tycssGWZvU");
        setField(term9649, term9649.getClass(), "empno", null);
        setField(term9649, term9649.getClass(), "ename", null);
        setField(term9649, term9649.getClass(), "job", null);
        setField(term9649, term9649.getClass(), "mgr", null);
        setField(term9649, term9649.getClass(), "hireDate", null);
        setField(term9649, term9649.getClass(), "sal", null);
        setField(term9649, term9649.getClass(), "comm", null);
        setField(term9649, term9649.getClass(), "department", null);
        setField(term9649, term9649.getClass(), "userCredential", null);
        setField(term9584, term9584.getClass(), "employee", term9649);
        setField(term9507, term9507.getClass(), "userCredential", term9584);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.selimhorri.app.pack.models.entities.Employee");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getComm", argTypes, term9507, args);
    }

};


