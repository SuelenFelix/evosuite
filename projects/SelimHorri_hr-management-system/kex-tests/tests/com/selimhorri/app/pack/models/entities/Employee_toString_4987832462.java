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
     Object term5853;

    public Employee_toString_4987832462() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term5854 = new Integer(696225243);
        Integer term5880 = new Integer(-1421649118);
        Double term5892 = new Double(0.6201564110803683);
        Double term5894 = new Double(0.5283886615348917);
        Integer term5897 = new Integer(-511248284);
        HashMap term5924 = new HashMap();
        Set<Object> term6095 =  ((Map) term5924).keySet();
        HashSet term5923 = new HashSet((Collection<? extends Object>) term6095);
        Integer term5931 = new Integer(529879356);
        Boolean term5957 = new Boolean(false);
        Integer term5996 = new Integer(-139694079);
        Integer term6022 = new Integer(-1602072035);
        Double term6034 = new Double(0.4478633017907302);
        Double term6036 = new Double(0.7998055139571558);
        Integer term6039 = new Integer(1902624392);
        HashSet term6043 = new HashSet();
        Integer term6045 = new Integer(904607217);
        Boolean term6049 = new Boolean(true);
        term5853 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Employee"));
        Object term5882 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5883 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5887 = newInstance(Class.forName("java.time.LocalTime"));
        Object term5896 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Department"));
        Object term5930 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.UserCredential"));
        Object term5995 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Employee"));
        Object term6024 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6025 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6029 = newInstance(Class.forName("java.time.LocalTime"));
        Object term6038 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Department"));
        Object term6044 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.UserCredential"));
        Object term6054 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Employee"));
        setField(term5853, term5853.getClass(), "empno", term5854);
        setField(term5853, term5853.getClass(), "ename", "bZrrPiMnsr");
        setField(term5853, term5853.getClass(), "job", "IeromvfDmz");
        setField(term5853, term5853.getClass(), "mgr", term5880);
        setIntField(term5883, term5883.getClass(), "year", 2022);
        setShortField(term5883, term5883.getClass(), "month", (short) 5);
        setShortField(term5883, term5883.getClass(), "day", (short) 28);
        setField(term5882, term5882.getClass(), "date", term5883);
        setByteField(term5887, term5887.getClass(), "hour", (byte) 20);
        setByteField(term5887, term5887.getClass(), "minute", (byte) 42);
        setByteField(term5887, term5887.getClass(), "second", (byte) 20);
        setIntField(term5887, term5887.getClass(), "nano", 528388661);
        setField(term5882, term5882.getClass(), "time", term5887);
        setField(term5853, term5853.getClass(), "hireDate", term5882);
        setField(term5853, term5853.getClass(), "sal", term5892);
        setField(term5853, term5853.getClass(), "comm", term5894);
        setField(term5896, term5896.getClass(), "deptno", term5897);
        setField(term5896, term5896.getClass(), "dname", "xJLHPTRSqe");
        setField(term5896, term5896.getClass(), "loc", "OIFZYdbUZz");
        setField(term5896, term5896.getClass(), "employees", term5923);
        setField(term5853, term5853.getClass(), "department", term5896);
        setField(term5930, term5930.getClass(), "id", term5931);
        setField(term5930, term5930.getClass(), "username", "wFyiZloCxg");
        setField(term5930, term5930.getClass(), "password", "xYztJEIPWy");
        setField(term5930, term5930.getClass(), "enabled", term5957);
        setField(term5930, term5930.getClass(), "email", "TDQIAXaJru");
        setField(term5930, term5930.getClass(), "phone", "frPMFqGmrE");
        setField(term5930, term5930.getClass(), "role", "DvfOYWcNBN");
        setField(term5995, term5995.getClass(), "empno", term5996);
        setField(term5995, term5995.getClass(), "ename", "PwMdJRwzDW");
        setField(term5995, term5995.getClass(), "job", "sMiHxgXUuN");
        setField(term5995, term5995.getClass(), "mgr", term6022);
        setIntField(term6025, term6025.getClass(), "year", 2018);
        setShortField(term6025, term6025.getClass(), "month", (short) 12);
        setShortField(term6025, term6025.getClass(), "day", (short) 17);
        setField(term6024, term6024.getClass(), "date", term6025);
        setByteField(term6029, term6029.getClass(), "hour", (byte) 2);
        setByteField(term6029, term6029.getClass(), "minute", (byte) 8);
        setByteField(term6029, term6029.getClass(), "second", (byte) 33);
        setIntField(term6029, term6029.getClass(), "nano", 799805513);
        setField(term6024, term6024.getClass(), "time", term6029);
        setField(term5995, term5995.getClass(), "hireDate", term6024);
        setField(term5995, term5995.getClass(), "sal", term6034);
        setField(term5995, term5995.getClass(), "comm", term6036);
        setField(term6038, term6038.getClass(), "deptno", term6039);
        setField(term6038, term6038.getClass(), "dname", "");
        setField(term6038, term6038.getClass(), "loc", "");
        setField(term6038, term6038.getClass(), "employees", term6043);
        setField(term5995, term5995.getClass(), "department", term6038);
        setField(term6044, term6044.getClass(), "id", term6045);
        setField(term6044, term6044.getClass(), "username", "");
        setField(term6044, term6044.getClass(), "password", "");
        setField(term6044, term6044.getClass(), "enabled", term6049);
        setField(term6044, term6044.getClass(), "email", "");
        setField(term6044, term6044.getClass(), "phone", "");
        setField(term6044, term6044.getClass(), "role", "");
        setField(term6054, term6054.getClass(), "empno", null);
        setField(term6054, term6054.getClass(), "ename", null);
        setField(term6054, term6054.getClass(), "job", null);
        setField(term6054, term6054.getClass(), "mgr", null);
        setField(term6054, term6054.getClass(), "hireDate", null);
        setField(term6054, term6054.getClass(), "sal", null);
        setField(term6054, term6054.getClass(), "comm", null);
        setField(term6054, term6054.getClass(), "department", null);
        setField(term6054, term6054.getClass(), "userCredential", null);
        setField(term6044, term6044.getClass(), "employee", term6054);
        setField(term5995, term5995.getClass(), "userCredential", term6044);
        setField(term5930, term5930.getClass(), "employee", term5995);
        setField(term5853, term5853.getClass(), "userCredential", term5930);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.selimhorri.app.pack.models.entities.Employee");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term5853, args);
    }

};


