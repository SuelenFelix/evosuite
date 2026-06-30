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

public class Employee_toString_4987832462 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5844;

    public Employee_toString_4987832462() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term5845 = new Integer(696225243);
        Integer term5871 = new Integer(-1421649118);
        Double term5883 = new Double(0.6201564110803683);
        Double term5885 = new Double(0.5283886615348917);
        Integer term5888 = new Integer(-511248284);
        HashMap term5915 = new HashMap();
        Set<Object> term6086 =  ((Map) term5915).keySet();
        HashSet term5914 = new HashSet((Collection<? extends Object>) term6086);
        Integer term5922 = new Integer(529879356);
        Boolean term5948 = new Boolean(false);
        Integer term5987 = new Integer(-139694079);
        Integer term6013 = new Integer(-1602072035);
        Double term6025 = new Double(0.4478633017907302);
        Double term6027 = new Double(0.7998055139571558);
        Integer term6030 = new Integer(1902624392);
        HashSet term6034 = new HashSet();
        Integer term6036 = new Integer(904607217);
        Boolean term6040 = new Boolean(true);
        term5844 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Employee"));
        Object term5873 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5874 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5878 = newInstance(Class.forName("java.time.LocalTime"));
        Object term5887 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Department"));
        Object term5921 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.UserCredential"));
        Object term5986 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Employee"));
        Object term6015 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6016 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6020 = newInstance(Class.forName("java.time.LocalTime"));
        Object term6029 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Department"));
        Object term6035 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.UserCredential"));
        Object term6045 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Employee"));
        setField(term5844, term5844.getClass(), "empno", term5845);
        setField(term5844, term5844.getClass(), "ename", "bZrrPiMnsr");
        setField(term5844, term5844.getClass(), "job", "IeromvfDmz");
        setField(term5844, term5844.getClass(), "mgr", term5871);
        setIntField(term5874, term5874.getClass(), "year", 2022);
        setShortField(term5874, term5874.getClass(), "month", (short) 5);
        setShortField(term5874, term5874.getClass(), "day", (short) 28);
        setField(term5873, term5873.getClass(), "date", term5874);
        setByteField(term5878, term5878.getClass(), "hour", (byte) 20);
        setByteField(term5878, term5878.getClass(), "minute", (byte) 42);
        setByteField(term5878, term5878.getClass(), "second", (byte) 20);
        setIntField(term5878, term5878.getClass(), "nano", 528388661);
        setField(term5873, term5873.getClass(), "time", term5878);
        setField(term5844, term5844.getClass(), "hireDate", term5873);
        setField(term5844, term5844.getClass(), "sal", term5883);
        setField(term5844, term5844.getClass(), "comm", term5885);
        setField(term5887, term5887.getClass(), "deptno", term5888);
        setField(term5887, term5887.getClass(), "dname", "xJLHPTRSqe");
        setField(term5887, term5887.getClass(), "loc", "OIFZYdbUZz");
        setField(term5887, term5887.getClass(), "employees", term5914);
        setField(term5844, term5844.getClass(), "department", term5887);
        setField(term5921, term5921.getClass(), "id", term5922);
        setField(term5921, term5921.getClass(), "username", "wFyiZloCxg");
        setField(term5921, term5921.getClass(), "password", "xYztJEIPWy");
        setField(term5921, term5921.getClass(), "enabled", term5948);
        setField(term5921, term5921.getClass(), "email", "TDQIAXaJru");
        setField(term5921, term5921.getClass(), "phone", "frPMFqGmrE");
        setField(term5921, term5921.getClass(), "role", "DvfOYWcNBN");
        setField(term5986, term5986.getClass(), "empno", term5987);
        setField(term5986, term5986.getClass(), "ename", "PwMdJRwzDW");
        setField(term5986, term5986.getClass(), "job", "sMiHxgXUuN");
        setField(term5986, term5986.getClass(), "mgr", term6013);
        setIntField(term6016, term6016.getClass(), "year", 2018);
        setShortField(term6016, term6016.getClass(), "month", (short) 12);
        setShortField(term6016, term6016.getClass(), "day", (short) 17);
        setField(term6015, term6015.getClass(), "date", term6016);
        setByteField(term6020, term6020.getClass(), "hour", (byte) 2);
        setByteField(term6020, term6020.getClass(), "minute", (byte) 8);
        setByteField(term6020, term6020.getClass(), "second", (byte) 33);
        setIntField(term6020, term6020.getClass(), "nano", 799805513);
        setField(term6015, term6015.getClass(), "time", term6020);
        setField(term5986, term5986.getClass(), "hireDate", term6015);
        setField(term5986, term5986.getClass(), "sal", term6025);
        setField(term5986, term5986.getClass(), "comm", term6027);
        setField(term6029, term6029.getClass(), "deptno", term6030);
        setField(term6029, term6029.getClass(), "dname", "");
        setField(term6029, term6029.getClass(), "loc", "");
        setField(term6029, term6029.getClass(), "employees", term6034);
        setField(term5986, term5986.getClass(), "department", term6029);
        setField(term6035, term6035.getClass(), "id", term6036);
        setField(term6035, term6035.getClass(), "username", "");
        setField(term6035, term6035.getClass(), "password", "");
        setField(term6035, term6035.getClass(), "enabled", term6040);
        setField(term6035, term6035.getClass(), "email", "");
        setField(term6035, term6035.getClass(), "phone", "");
        setField(term6035, term6035.getClass(), "role", "");
        setField(term6045, term6045.getClass(), "empno", null);
        setField(term6045, term6045.getClass(), "ename", null);
        setField(term6045, term6045.getClass(), "job", null);
        setField(term6045, term6045.getClass(), "mgr", null);
        setField(term6045, term6045.getClass(), "hireDate", null);
        setField(term6045, term6045.getClass(), "sal", null);
        setField(term6045, term6045.getClass(), "comm", null);
        setField(term6045, term6045.getClass(), "department", null);
        setField(term6045, term6045.getClass(), "userCredential", null);
        setField(term6035, term6035.getClass(), "employee", term6045);
        setField(term5986, term5986.getClass(), "userCredential", term6035);
        setField(term5921, term5921.getClass(), "employee", term5986);
        setField(term5844, term5844.getClass(), "userCredential", term5921);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.selimhorri.app.pack.models.entities.Employee");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term5844, args);
    }

};


