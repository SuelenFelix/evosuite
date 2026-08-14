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

public class Employee_setComm_21667935616 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9741;
     Object term9884;

    public Employee_setComm_21667935616() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term9742 = new Integer(-1671982964);
        Integer term9768 = new Integer(776218451);
        Double term9780 = new Double(0.2662471534242947);
        Double term9782 = new Double(0.9546635450423915);
        Integer term9785 = new Integer(-1362132929);
        HashMap term9812 = new HashMap();
        Set<Object> term9926 =  ((Map) term9812).keySet();
        HashSet term9811 = new HashSet((Collection<? extends Object>) term9926);
        Integer term9819 = new Integer(1757149811);
        Boolean term9845 = new Boolean(true);
        term9741 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Employee"));
        Object term9770 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9771 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9775 = newInstance(Class.forName("java.time.LocalTime"));
        Object term9784 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Department"));
        Object term9818 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.UserCredential"));
        Object term9883 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Employee"));
        setField(term9741, term9741.getClass(), "empno", term9742);
        setField(term9741, term9741.getClass(), "ename", "jcvrILwbgt");
        setField(term9741, term9741.getClass(), "job", "AphrAHzPMC");
        setField(term9741, term9741.getClass(), "mgr", term9768);
        setIntField(term9771, term9771.getClass(), "year", 2029);
        setShortField(term9771, term9771.getClass(), "month", (short) 2);
        setShortField(term9771, term9771.getClass(), "day", (short) 4);
        setField(term9770, term9770.getClass(), "date", term9771);
        setByteField(term9775, term9775.getClass(), "hour", (byte) 18);
        setByteField(term9775, term9775.getClass(), "minute", (byte) 31);
        setByteField(term9775, term9775.getClass(), "second", (byte) 27);
        setIntField(term9775, term9775.getClass(), "nano", 737016275);
        setField(term9770, term9770.getClass(), "time", term9775);
        setField(term9741, term9741.getClass(), "hireDate", term9770);
        setField(term9741, term9741.getClass(), "sal", term9780);
        setField(term9741, term9741.getClass(), "comm", term9782);
        setField(term9784, term9784.getClass(), "deptno", term9785);
        setField(term9784, term9784.getClass(), "dname", "iwismCnYjB");
        setField(term9784, term9784.getClass(), "loc", "GerBZdiruT");
        setField(term9784, term9784.getClass(), "employees", term9811);
        setField(term9741, term9741.getClass(), "department", term9784);
        setField(term9818, term9818.getClass(), "id", term9819);
        setField(term9818, term9818.getClass(), "username", "InNyZMCrst");
        setField(term9818, term9818.getClass(), "password", "llSJDzNeEq");
        setField(term9818, term9818.getClass(), "enabled", term9845);
        setField(term9818, term9818.getClass(), "email", "YIDNFdhfGO");
        setField(term9818, term9818.getClass(), "phone", "adNbqunmox");
        setField(term9818, term9818.getClass(), "role", "ImSBmTIdsP");
        setField(term9883, term9883.getClass(), "empno", null);
        setField(term9883, term9883.getClass(), "ename", null);
        setField(term9883, term9883.getClass(), "job", null);
        setField(term9883, term9883.getClass(), "mgr", null);
        setField(term9883, term9883.getClass(), "hireDate", null);
        setField(term9883, term9883.getClass(), "sal", null);
        setField(term9883, term9883.getClass(), "comm", null);
        setField(term9883, term9883.getClass(), "department", null);
        setField(term9883, term9883.getClass(), "userCredential", null);
        setField(term9818, term9818.getClass(), "employee", term9883);
        setField(term9741, term9741.getClass(), "userCredential", term9818);
        term9884 = new Double(0.4795388086922092);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.selimhorri.app.pack.models.entities.Employee");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Double");
        Object[] args = new Object[1];
        args[0] = term9884;
        callMethod(klass, "setComm", argTypes, term9741, args);
    }

};


