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
     Object term7274;

    public Employee_getJob_6809649697() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term7275 = new Integer(760218111);
        Integer term7301 = new Integer(-1986366126);
        Double term7313 = new Double(0.9233657088240451);
        Double term7315 = new Double(0.04025609521413642);
        Integer term7318 = new Integer(-1963228619);
        HashMap term7345 = new HashMap();
        Set<Object> term7516 =  ((Map) term7345).keySet();
        HashSet term7344 = new HashSet((Collection<? extends Object>) term7516);
        Integer term7352 = new Integer(-1514240086);
        Boolean term7378 = new Boolean(true);
        Integer term7417 = new Integer(-709868952);
        Integer term7443 = new Integer(847207929);
        Double term7455 = new Double(0.3687319853615557);
        Double term7457 = new Double(0.5816591160182095);
        Integer term7460 = new Integer(-1665928103);
        HashSet term7464 = new HashSet();
        Integer term7466 = new Integer(-1808638031);
        Boolean term7470 = new Boolean(true);
        term7274 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Employee"));
        Object term7303 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7304 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7308 = newInstance(Class.forName("java.time.LocalTime"));
        Object term7317 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Department"));
        Object term7351 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.UserCredential"));
        Object term7416 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Employee"));
        Object term7445 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7446 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7450 = newInstance(Class.forName("java.time.LocalTime"));
        Object term7459 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Department"));
        Object term7465 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.UserCredential"));
        Object term7475 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Employee"));
        setField(term7274, term7274.getClass(), "empno", term7275);
        setField(term7274, term7274.getClass(), "ename", "IIZlqzOmtY");
        setField(term7274, term7274.getClass(), "job", "iRFRSxtnkr");
        setField(term7274, term7274.getClass(), "mgr", term7301);
        setIntField(term7304, term7304.getClass(), "year", 2028);
        setShortField(term7304, term7304.getClass(), "month", (short) 6);
        setShortField(term7304, term7304.getClass(), "day", (short) 21);
        setField(term7303, term7303.getClass(), "date", term7304);
        setByteField(term7308, term7308.getClass(), "hour", (byte) 2);
        setByteField(term7308, term7308.getClass(), "minute", (byte) 38);
        setByteField(term7308, term7308.getClass(), "second", (byte) 11);
        setIntField(term7308, term7308.getClass(), "nano", 40256095);
        setField(term7303, term7303.getClass(), "time", term7308);
        setField(term7274, term7274.getClass(), "hireDate", term7303);
        setField(term7274, term7274.getClass(), "sal", term7313);
        setField(term7274, term7274.getClass(), "comm", term7315);
        setField(term7317, term7317.getClass(), "deptno", term7318);
        setField(term7317, term7317.getClass(), "dname", "iGWkLjLGBY");
        setField(term7317, term7317.getClass(), "loc", "jUkXaNkoAg");
        setField(term7317, term7317.getClass(), "employees", term7344);
        setField(term7274, term7274.getClass(), "department", term7317);
        setField(term7351, term7351.getClass(), "id", term7352);
        setField(term7351, term7351.getClass(), "username", "VjtXZcUFNx");
        setField(term7351, term7351.getClass(), "password", "bOZSTccXbt");
        setField(term7351, term7351.getClass(), "enabled", term7378);
        setField(term7351, term7351.getClass(), "email", "MBSsxxeNUU");
        setField(term7351, term7351.getClass(), "phone", "NmUhmPLSgG");
        setField(term7351, term7351.getClass(), "role", "WJosrfBMfA");
        setField(term7416, term7416.getClass(), "empno", term7417);
        setField(term7416, term7416.getClass(), "ename", "mZsPsRzyhQ");
        setField(term7416, term7416.getClass(), "job", "IExlbTemvJ");
        setField(term7416, term7416.getClass(), "mgr", term7443);
        setIntField(term7446, term7446.getClass(), "year", 2017);
        setShortField(term7446, term7446.getClass(), "month", (short) 5);
        setShortField(term7446, term7446.getClass(), "day", (short) 17);
        setField(term7445, term7445.getClass(), "date", term7446);
        setByteField(term7450, term7450.getClass(), "hour", (byte) 22);
        setByteField(term7450, term7450.getClass(), "minute", (byte) 56);
        setByteField(term7450, term7450.getClass(), "second", (byte) 28);
        setIntField(term7450, term7450.getClass(), "nano", 581659115);
        setField(term7445, term7445.getClass(), "time", term7450);
        setField(term7416, term7416.getClass(), "hireDate", term7445);
        setField(term7416, term7416.getClass(), "sal", term7455);
        setField(term7416, term7416.getClass(), "comm", term7457);
        setField(term7459, term7459.getClass(), "deptno", term7460);
        setField(term7459, term7459.getClass(), "dname", "");
        setField(term7459, term7459.getClass(), "loc", "");
        setField(term7459, term7459.getClass(), "employees", term7464);
        setField(term7416, term7416.getClass(), "department", term7459);
        setField(term7465, term7465.getClass(), "id", term7466);
        setField(term7465, term7465.getClass(), "username", "");
        setField(term7465, term7465.getClass(), "password", "");
        setField(term7465, term7465.getClass(), "enabled", term7470);
        setField(term7465, term7465.getClass(), "email", "");
        setField(term7465, term7465.getClass(), "phone", "");
        setField(term7465, term7465.getClass(), "role", "");
        setField(term7475, term7475.getClass(), "empno", null);
        setField(term7475, term7475.getClass(), "ename", null);
        setField(term7475, term7475.getClass(), "job", null);
        setField(term7475, term7475.getClass(), "mgr", null);
        setField(term7475, term7475.getClass(), "hireDate", null);
        setField(term7475, term7475.getClass(), "sal", null);
        setField(term7475, term7475.getClass(), "comm", null);
        setField(term7475, term7475.getClass(), "department", null);
        setField(term7475, term7475.getClass(), "userCredential", null);
        setField(term7465, term7465.getClass(), "employee", term7475);
        setField(term7416, term7416.getClass(), "userCredential", term7465);
        setField(term7351, term7351.getClass(), "employee", term7416);
        setField(term7274, term7274.getClass(), "userCredential", term7351);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.selimhorri.app.pack.models.entities.Employee");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getJob", argTypes, term7274, args);
    }

};


