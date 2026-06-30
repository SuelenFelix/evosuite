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

public class Employee_getEname_18485706605 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6705;

    public Employee_getEname_18485706605() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term6706 = new Integer(1778570695);
        Integer term6732 = new Integer(-1142164411);
        Double term6744 = new Double(0.21883508391220008);
        Double term6746 = new Double(0.21718677136334108);
        Integer term6749 = new Integer(-1619435313);
        HashMap term6776 = new HashMap();
        Set<Object> term6888 =  ((Map) term6776).keySet();
        HashSet term6775 = new HashSet((Collection<? extends Object>) term6888);
        Integer term6783 = new Integer(469871899);
        Boolean term6809 = new Boolean(false);
        term6705 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Employee"));
        Object term6734 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6735 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6739 = newInstance(Class.forName("java.time.LocalTime"));
        Object term6748 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Department"));
        Object term6782 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.UserCredential"));
        Object term6847 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Employee"));
        setField(term6705, term6705.getClass(), "empno", term6706);
        setField(term6705, term6705.getClass(), "ename", "hHNIOlOzJc");
        setField(term6705, term6705.getClass(), "job", "ALRSeULyWV");
        setField(term6705, term6705.getClass(), "mgr", term6732);
        setIntField(term6735, term6735.getClass(), "year", 2014);
        setShortField(term6735, term6735.getClass(), "month", (short) 5);
        setShortField(term6735, term6735.getClass(), "day", (short) 18);
        setField(term6734, term6734.getClass(), "date", term6735);
        setByteField(term6739, term6739.getClass(), "hour", (byte) 19);
        setByteField(term6739, term6739.getClass(), "minute", (byte) 25);
        setByteField(term6739, term6739.getClass(), "second", (byte) 8);
        setIntField(term6739, term6739.getClass(), "nano", 217186771);
        setField(term6734, term6734.getClass(), "time", term6739);
        setField(term6705, term6705.getClass(), "hireDate", term6734);
        setField(term6705, term6705.getClass(), "sal", term6744);
        setField(term6705, term6705.getClass(), "comm", term6746);
        setField(term6748, term6748.getClass(), "deptno", term6749);
        setField(term6748, term6748.getClass(), "dname", "WVhzXHdyFF");
        setField(term6748, term6748.getClass(), "loc", "GLAWYoxkyw");
        setField(term6748, term6748.getClass(), "employees", term6775);
        setField(term6705, term6705.getClass(), "department", term6748);
        setField(term6782, term6782.getClass(), "id", term6783);
        setField(term6782, term6782.getClass(), "username", "ohZpRiNDZM");
        setField(term6782, term6782.getClass(), "password", "qEXIxhmUwz");
        setField(term6782, term6782.getClass(), "enabled", term6809);
        setField(term6782, term6782.getClass(), "email", "RlyxtfCqKY");
        setField(term6782, term6782.getClass(), "phone", "kyTUkLCRYm");
        setField(term6782, term6782.getClass(), "role", "oAotZgNUFH");
        setField(term6847, term6847.getClass(), "empno", null);
        setField(term6847, term6847.getClass(), "ename", null);
        setField(term6847, term6847.getClass(), "job", null);
        setField(term6847, term6847.getClass(), "mgr", null);
        setField(term6847, term6847.getClass(), "hireDate", null);
        setField(term6847, term6847.getClass(), "sal", null);
        setField(term6847, term6847.getClass(), "comm", null);
        setField(term6847, term6847.getClass(), "department", null);
        setField(term6847, term6847.getClass(), "userCredential", null);
        setField(term6782, term6782.getClass(), "employee", term6847);
        setField(term6705, term6705.getClass(), "userCredential", term6782);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.selimhorri.app.pack.models.entities.Employee");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEname", argTypes, term6705, args);
    }

};


