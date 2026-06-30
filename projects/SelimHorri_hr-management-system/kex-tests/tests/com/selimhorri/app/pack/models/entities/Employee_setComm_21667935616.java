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
     Object term9732;
     Object term9875;

    public Employee_setComm_21667935616() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term9733 = new Integer(-1671982964);
        Integer term9759 = new Integer(776218451);
        Double term9771 = new Double(0.2662471534242947);
        Double term9773 = new Double(0.9546635450423915);
        Integer term9776 = new Integer(-1362132929);
        HashMap term9803 = new HashMap();
        Set<Object> term9917 =  ((Map) term9803).keySet();
        HashSet term9802 = new HashSet((Collection<? extends Object>) term9917);
        Integer term9810 = new Integer(1757149811);
        Boolean term9836 = new Boolean(true);
        term9732 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Employee"));
        Object term9761 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9762 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9766 = newInstance(Class.forName("java.time.LocalTime"));
        Object term9775 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Department"));
        Object term9809 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.UserCredential"));
        Object term9874 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Employee"));
        setField(term9732, term9732.getClass(), "empno", term9733);
        setField(term9732, term9732.getClass(), "ename", "jcvrILwbgt");
        setField(term9732, term9732.getClass(), "job", "AphrAHzPMC");
        setField(term9732, term9732.getClass(), "mgr", term9759);
        setIntField(term9762, term9762.getClass(), "year", 2029);
        setShortField(term9762, term9762.getClass(), "month", (short) 2);
        setShortField(term9762, term9762.getClass(), "day", (short) 4);
        setField(term9761, term9761.getClass(), "date", term9762);
        setByteField(term9766, term9766.getClass(), "hour", (byte) 18);
        setByteField(term9766, term9766.getClass(), "minute", (byte) 31);
        setByteField(term9766, term9766.getClass(), "second", (byte) 27);
        setIntField(term9766, term9766.getClass(), "nano", 737016275);
        setField(term9761, term9761.getClass(), "time", term9766);
        setField(term9732, term9732.getClass(), "hireDate", term9761);
        setField(term9732, term9732.getClass(), "sal", term9771);
        setField(term9732, term9732.getClass(), "comm", term9773);
        setField(term9775, term9775.getClass(), "deptno", term9776);
        setField(term9775, term9775.getClass(), "dname", "iwismCnYjB");
        setField(term9775, term9775.getClass(), "loc", "GerBZdiruT");
        setField(term9775, term9775.getClass(), "employees", term9802);
        setField(term9732, term9732.getClass(), "department", term9775);
        setField(term9809, term9809.getClass(), "id", term9810);
        setField(term9809, term9809.getClass(), "username", "InNyZMCrst");
        setField(term9809, term9809.getClass(), "password", "llSJDzNeEq");
        setField(term9809, term9809.getClass(), "enabled", term9836);
        setField(term9809, term9809.getClass(), "email", "YIDNFdhfGO");
        setField(term9809, term9809.getClass(), "phone", "adNbqunmox");
        setField(term9809, term9809.getClass(), "role", "ImSBmTIdsP");
        setField(term9874, term9874.getClass(), "empno", null);
        setField(term9874, term9874.getClass(), "ename", null);
        setField(term9874, term9874.getClass(), "job", null);
        setField(term9874, term9874.getClass(), "mgr", null);
        setField(term9874, term9874.getClass(), "hireDate", null);
        setField(term9874, term9874.getClass(), "sal", null);
        setField(term9874, term9874.getClass(), "comm", null);
        setField(term9874, term9874.getClass(), "department", null);
        setField(term9874, term9874.getClass(), "userCredential", null);
        setField(term9809, term9809.getClass(), "employee", term9874);
        setField(term9732, term9732.getClass(), "userCredential", term9809);
        term9875 = new Double(0.4795388086922092);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.selimhorri.app.pack.models.entities.Employee");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Double");
        Object[] args = new Object[1];
        args[0] = term9875;
        callMethod(klass, "setComm", argTypes, term9732, args);
    }

};


