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

public class Employee_getSal_25489690613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8958;

    public Employee_getSal_25489690613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term8959 = new Integer(-561851867);
        Integer term8985 = new Integer(-1809928454);
        Double term8997 = new Double(0.5940588918649367);
        Double term8999 = new Double(0.638695515317724);
        Integer term9002 = new Integer(-191639503);
        HashMap term9029 = new HashMap();
        Set<Object> term9200 =  ((Map) term9029).keySet();
        HashSet term9028 = new HashSet((Collection<? extends Object>) term9200);
        Integer term9036 = new Integer(-746950289);
        Boolean term9062 = new Boolean(false);
        Integer term9101 = new Integer(1201413899);
        Integer term9127 = new Integer(-376722373);
        Double term9139 = new Double(0.7437704061893722);
        Double term9141 = new Double(0.8101332136663211);
        Integer term9144 = new Integer(1180687854);
        HashSet term9148 = new HashSet();
        Integer term9150 = new Integer(328631288);
        Boolean term9154 = new Boolean(true);
        term8958 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Employee"));
        Object term8987 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8988 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8992 = newInstance(Class.forName("java.time.LocalTime"));
        Object term9001 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Department"));
        Object term9035 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.UserCredential"));
        Object term9100 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Employee"));
        Object term9129 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9130 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9134 = newInstance(Class.forName("java.time.LocalTime"));
        Object term9143 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Department"));
        Object term9149 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.UserCredential"));
        Object term9159 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Employee"));
        setField(term8958, term8958.getClass(), "empno", term8959);
        setField(term8958, term8958.getClass(), "ename", "DpNDxwXKkX");
        setField(term8958, term8958.getClass(), "job", "uxoFwkPfXf");
        setField(term8958, term8958.getClass(), "mgr", term8985);
        setIntField(term8988, term8988.getClass(), "year", 2015);
        setShortField(term8988, term8988.getClass(), "month", (short) 10);
        setShortField(term8988, term8988.getClass(), "day", (short) 4);
        setField(term8987, term8987.getClass(), "date", term8988);
        setByteField(term8992, term8992.getClass(), "hour", (byte) 1);
        setByteField(term8992, term8992.getClass(), "minute", (byte) 29);
        setByteField(term8992, term8992.getClass(), "second", (byte) 20);
        setIntField(term8992, term8992.getClass(), "nano", 558273892);
        setField(term8987, term8987.getClass(), "time", term8992);
        setField(term8958, term8958.getClass(), "hireDate", term8987);
        setField(term8958, term8958.getClass(), "sal", term8997);
        setField(term8958, term8958.getClass(), "comm", term8999);
        setField(term9001, term9001.getClass(), "deptno", term9002);
        setField(term9001, term9001.getClass(), "dname", "OoVnZTvxUt");
        setField(term9001, term9001.getClass(), "loc", "MnqnyndkhF");
        setField(term9001, term9001.getClass(), "employees", term9028);
        setField(term8958, term8958.getClass(), "department", term9001);
        setField(term9035, term9035.getClass(), "id", term9036);
        setField(term9035, term9035.getClass(), "username", "pkfsHvqODq");
        setField(term9035, term9035.getClass(), "password", "OoRBUdwown");
        setField(term9035, term9035.getClass(), "enabled", term9062);
        setField(term9035, term9035.getClass(), "email", "lSidZunNtu");
        setField(term9035, term9035.getClass(), "phone", "TLUhUnoanK");
        setField(term9035, term9035.getClass(), "role", "JXyQTIyIrU");
        setField(term9100, term9100.getClass(), "empno", term9101);
        setField(term9100, term9100.getClass(), "ename", "riyKkxMvWm");
        setField(term9100, term9100.getClass(), "job", "WENnGcBSTd");
        setField(term9100, term9100.getClass(), "mgr", term9127);
        setIntField(term9130, term9130.getClass(), "year", 2018);
        setShortField(term9130, term9130.getClass(), "month", (short) 5);
        setShortField(term9130, term9130.getClass(), "day", (short) 15);
        setField(term9129, term9129.getClass(), "date", term9130);
        setByteField(term9134, term9134.getClass(), "hour", (byte) 17);
        setByteField(term9134, term9134.getClass(), "minute", (byte) 19);
        setByteField(term9134, term9134.getClass(), "second", (byte) 28);
        setIntField(term9134, term9134.getClass(), "nano", 153049369);
        setField(term9129, term9129.getClass(), "time", term9134);
        setField(term9100, term9100.getClass(), "hireDate", term9129);
        setField(term9100, term9100.getClass(), "sal", term9139);
        setField(term9100, term9100.getClass(), "comm", term9141);
        setField(term9143, term9143.getClass(), "deptno", term9144);
        setField(term9143, term9143.getClass(), "dname", "");
        setField(term9143, term9143.getClass(), "loc", "");
        setField(term9143, term9143.getClass(), "employees", term9148);
        setField(term9100, term9100.getClass(), "department", term9143);
        setField(term9149, term9149.getClass(), "id", term9150);
        setField(term9149, term9149.getClass(), "username", "");
        setField(term9149, term9149.getClass(), "password", "");
        setField(term9149, term9149.getClass(), "enabled", term9154);
        setField(term9149, term9149.getClass(), "email", "");
        setField(term9149, term9149.getClass(), "phone", "");
        setField(term9149, term9149.getClass(), "role", "");
        setField(term9159, term9159.getClass(), "empno", null);
        setField(term9159, term9159.getClass(), "ename", null);
        setField(term9159, term9159.getClass(), "job", null);
        setField(term9159, term9159.getClass(), "mgr", null);
        setField(term9159, term9159.getClass(), "hireDate", null);
        setField(term9159, term9159.getClass(), "sal", null);
        setField(term9159, term9159.getClass(), "comm", null);
        setField(term9159, term9159.getClass(), "department", null);
        setField(term9159, term9159.getClass(), "userCredential", null);
        setField(term9149, term9149.getClass(), "employee", term9159);
        setField(term9100, term9100.getClass(), "userCredential", term9149);
        setField(term9035, term9035.getClass(), "employee", term9100);
        setField(term8958, term8958.getClass(), "userCredential", term9035);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.selimhorri.app.pack.models.entities.Employee");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSal", argTypes, term8958, args);
    }

};


