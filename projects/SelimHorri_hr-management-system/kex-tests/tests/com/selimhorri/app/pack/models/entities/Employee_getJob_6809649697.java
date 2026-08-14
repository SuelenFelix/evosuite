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

public class Employee_getJob_6809649697 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7283;

    public Employee_getJob_6809649697() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term7284 = new Integer(760218111);
        Integer term7310 = new Integer(-1986366126);
        Double term7322 = new Double(0.9233657088240451);
        Double term7324 = new Double(0.04025609521413642);
        Integer term7327 = new Integer(-1963228619);
        HashMap term7354 = new HashMap();
        Set<Object> term7525 =  ((Map) term7354).keySet();
        HashSet term7353 = new HashSet((Collection<? extends Object>) term7525);
        Integer term7361 = new Integer(-1514240086);
        Boolean term7387 = new Boolean(true);
        Integer term7426 = new Integer(-709868952);
        Integer term7452 = new Integer(847207929);
        Double term7464 = new Double(0.3687319853615557);
        Double term7466 = new Double(0.5816591160182095);
        Integer term7469 = new Integer(-1665928103);
        HashSet term7473 = new HashSet();
        Integer term7475 = new Integer(-1808638031);
        Boolean term7479 = new Boolean(true);
        term7283 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Employee"));
        Object term7312 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7313 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7317 = newInstance(Class.forName("java.time.LocalTime"));
        Object term7326 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Department"));
        Object term7360 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.UserCredential"));
        Object term7425 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Employee"));
        Object term7454 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7455 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7459 = newInstance(Class.forName("java.time.LocalTime"));
        Object term7468 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Department"));
        Object term7474 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.UserCredential"));
        Object term7484 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Employee"));
        setField(term7283, term7283.getClass(), "empno", term7284);
        setField(term7283, term7283.getClass(), "ename", "IIZlqzOmtY");
        setField(term7283, term7283.getClass(), "job", "iRFRSxtnkr");
        setField(term7283, term7283.getClass(), "mgr", term7310);
        setIntField(term7313, term7313.getClass(), "year", 2028);
        setShortField(term7313, term7313.getClass(), "month", (short) 6);
        setShortField(term7313, term7313.getClass(), "day", (short) 21);
        setField(term7312, term7312.getClass(), "date", term7313);
        setByteField(term7317, term7317.getClass(), "hour", (byte) 2);
        setByteField(term7317, term7317.getClass(), "minute", (byte) 38);
        setByteField(term7317, term7317.getClass(), "second", (byte) 11);
        setIntField(term7317, term7317.getClass(), "nano", 40256095);
        setField(term7312, term7312.getClass(), "time", term7317);
        setField(term7283, term7283.getClass(), "hireDate", term7312);
        setField(term7283, term7283.getClass(), "sal", term7322);
        setField(term7283, term7283.getClass(), "comm", term7324);
        setField(term7326, term7326.getClass(), "deptno", term7327);
        setField(term7326, term7326.getClass(), "dname", "iGWkLjLGBY");
        setField(term7326, term7326.getClass(), "loc", "jUkXaNkoAg");
        setField(term7326, term7326.getClass(), "employees", term7353);
        setField(term7283, term7283.getClass(), "department", term7326);
        setField(term7360, term7360.getClass(), "id", term7361);
        setField(term7360, term7360.getClass(), "username", "VjtXZcUFNx");
        setField(term7360, term7360.getClass(), "password", "bOZSTccXbt");
        setField(term7360, term7360.getClass(), "enabled", term7387);
        setField(term7360, term7360.getClass(), "email", "MBSsxxeNUU");
        setField(term7360, term7360.getClass(), "phone", "NmUhmPLSgG");
        setField(term7360, term7360.getClass(), "role", "WJosrfBMfA");
        setField(term7425, term7425.getClass(), "empno", term7426);
        setField(term7425, term7425.getClass(), "ename", "mZsPsRzyhQ");
        setField(term7425, term7425.getClass(), "job", "IExlbTemvJ");
        setField(term7425, term7425.getClass(), "mgr", term7452);
        setIntField(term7455, term7455.getClass(), "year", 2017);
        setShortField(term7455, term7455.getClass(), "month", (short) 5);
        setShortField(term7455, term7455.getClass(), "day", (short) 17);
        setField(term7454, term7454.getClass(), "date", term7455);
        setByteField(term7459, term7459.getClass(), "hour", (byte) 22);
        setByteField(term7459, term7459.getClass(), "minute", (byte) 56);
        setByteField(term7459, term7459.getClass(), "second", (byte) 28);
        setIntField(term7459, term7459.getClass(), "nano", 581659115);
        setField(term7454, term7454.getClass(), "time", term7459);
        setField(term7425, term7425.getClass(), "hireDate", term7454);
        setField(term7425, term7425.getClass(), "sal", term7464);
        setField(term7425, term7425.getClass(), "comm", term7466);
        setField(term7468, term7468.getClass(), "deptno", term7469);
        setField(term7468, term7468.getClass(), "dname", "");
        setField(term7468, term7468.getClass(), "loc", "");
        setField(term7468, term7468.getClass(), "employees", term7473);
        setField(term7425, term7425.getClass(), "department", term7468);
        setField(term7474, term7474.getClass(), "id", term7475);
        setField(term7474, term7474.getClass(), "username", "");
        setField(term7474, term7474.getClass(), "password", "");
        setField(term7474, term7474.getClass(), "enabled", term7479);
        setField(term7474, term7474.getClass(), "email", "");
        setField(term7474, term7474.getClass(), "phone", "");
        setField(term7474, term7474.getClass(), "role", "");
        setField(term7484, term7484.getClass(), "empno", null);
        setField(term7484, term7484.getClass(), "ename", null);
        setField(term7484, term7484.getClass(), "job", null);
        setField(term7484, term7484.getClass(), "mgr", null);
        setField(term7484, term7484.getClass(), "hireDate", null);
        setField(term7484, term7484.getClass(), "sal", null);
        setField(term7484, term7484.getClass(), "comm", null);
        setField(term7484, term7484.getClass(), "department", null);
        setField(term7484, term7484.getClass(), "userCredential", null);
        setField(term7474, term7474.getClass(), "employee", term7484);
        setField(term7425, term7425.getClass(), "userCredential", term7474);
        setField(term7360, term7360.getClass(), "employee", term7425);
        setField(term7283, term7283.getClass(), "userCredential", term7360);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.selimhorri.app.pack.models.entities.Employee");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getJob", argTypes, term7283, args);
    }

};


