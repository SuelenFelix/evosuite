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
     Object term8949;

    public Employee_getSal_25489690613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term8950 = new Integer(-561851867);
        Integer term8976 = new Integer(-1809928454);
        Double term8988 = new Double(0.5940588918649367);
        Double term8990 = new Double(0.638695515317724);
        Integer term8993 = new Integer(-191639503);
        HashMap term9020 = new HashMap();
        Set<Object> term9191 =  ((Map) term9020).keySet();
        HashSet term9019 = new HashSet((Collection<? extends Object>) term9191);
        Integer term9027 = new Integer(-746950289);
        Boolean term9053 = new Boolean(false);
        Integer term9092 = new Integer(1201413899);
        Integer term9118 = new Integer(-376722373);
        Double term9130 = new Double(0.7437704061893722);
        Double term9132 = new Double(0.8101332136663211);
        Integer term9135 = new Integer(1180687854);
        HashSet term9139 = new HashSet();
        Integer term9141 = new Integer(328631288);
        Boolean term9145 = new Boolean(true);
        term8949 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Employee"));
        Object term8978 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8979 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8983 = newInstance(Class.forName("java.time.LocalTime"));
        Object term8992 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Department"));
        Object term9026 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.UserCredential"));
        Object term9091 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Employee"));
        Object term9120 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9121 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9125 = newInstance(Class.forName("java.time.LocalTime"));
        Object term9134 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Department"));
        Object term9140 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.UserCredential"));
        Object term9150 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Employee"));
        setField(term8949, term8949.getClass(), "empno", term8950);
        setField(term8949, term8949.getClass(), "ename", "DpNDxwXKkX");
        setField(term8949, term8949.getClass(), "job", "uxoFwkPfXf");
        setField(term8949, term8949.getClass(), "mgr", term8976);
        setIntField(term8979, term8979.getClass(), "year", 2015);
        setShortField(term8979, term8979.getClass(), "month", (short) 10);
        setShortField(term8979, term8979.getClass(), "day", (short) 4);
        setField(term8978, term8978.getClass(), "date", term8979);
        setByteField(term8983, term8983.getClass(), "hour", (byte) 1);
        setByteField(term8983, term8983.getClass(), "minute", (byte) 29);
        setByteField(term8983, term8983.getClass(), "second", (byte) 20);
        setIntField(term8983, term8983.getClass(), "nano", 558273892);
        setField(term8978, term8978.getClass(), "time", term8983);
        setField(term8949, term8949.getClass(), "hireDate", term8978);
        setField(term8949, term8949.getClass(), "sal", term8988);
        setField(term8949, term8949.getClass(), "comm", term8990);
        setField(term8992, term8992.getClass(), "deptno", term8993);
        setField(term8992, term8992.getClass(), "dname", "OoVnZTvxUt");
        setField(term8992, term8992.getClass(), "loc", "MnqnyndkhF");
        setField(term8992, term8992.getClass(), "employees", term9019);
        setField(term8949, term8949.getClass(), "department", term8992);
        setField(term9026, term9026.getClass(), "id", term9027);
        setField(term9026, term9026.getClass(), "username", "pkfsHvqODq");
        setField(term9026, term9026.getClass(), "password", "OoRBUdwown");
        setField(term9026, term9026.getClass(), "enabled", term9053);
        setField(term9026, term9026.getClass(), "email", "lSidZunNtu");
        setField(term9026, term9026.getClass(), "phone", "TLUhUnoanK");
        setField(term9026, term9026.getClass(), "role", "JXyQTIyIrU");
        setField(term9091, term9091.getClass(), "empno", term9092);
        setField(term9091, term9091.getClass(), "ename", "riyKkxMvWm");
        setField(term9091, term9091.getClass(), "job", "WENnGcBSTd");
        setField(term9091, term9091.getClass(), "mgr", term9118);
        setIntField(term9121, term9121.getClass(), "year", 2018);
        setShortField(term9121, term9121.getClass(), "month", (short) 5);
        setShortField(term9121, term9121.getClass(), "day", (short) 15);
        setField(term9120, term9120.getClass(), "date", term9121);
        setByteField(term9125, term9125.getClass(), "hour", (byte) 17);
        setByteField(term9125, term9125.getClass(), "minute", (byte) 19);
        setByteField(term9125, term9125.getClass(), "second", (byte) 28);
        setIntField(term9125, term9125.getClass(), "nano", 153049369);
        setField(term9120, term9120.getClass(), "time", term9125);
        setField(term9091, term9091.getClass(), "hireDate", term9120);
        setField(term9091, term9091.getClass(), "sal", term9130);
        setField(term9091, term9091.getClass(), "comm", term9132);
        setField(term9134, term9134.getClass(), "deptno", term9135);
        setField(term9134, term9134.getClass(), "dname", "");
        setField(term9134, term9134.getClass(), "loc", "");
        setField(term9134, term9134.getClass(), "employees", term9139);
        setField(term9091, term9091.getClass(), "department", term9134);
        setField(term9140, term9140.getClass(), "id", term9141);
        setField(term9140, term9140.getClass(), "username", "");
        setField(term9140, term9140.getClass(), "password", "");
        setField(term9140, term9140.getClass(), "enabled", term9145);
        setField(term9140, term9140.getClass(), "email", "");
        setField(term9140, term9140.getClass(), "phone", "");
        setField(term9140, term9140.getClass(), "role", "");
        setField(term9150, term9150.getClass(), "empno", null);
        setField(term9150, term9150.getClass(), "ename", null);
        setField(term9150, term9150.getClass(), "job", null);
        setField(term9150, term9150.getClass(), "mgr", null);
        setField(term9150, term9150.getClass(), "hireDate", null);
        setField(term9150, term9150.getClass(), "sal", null);
        setField(term9150, term9150.getClass(), "comm", null);
        setField(term9150, term9150.getClass(), "department", null);
        setField(term9150, term9150.getClass(), "userCredential", null);
        setField(term9140, term9140.getClass(), "employee", term9150);
        setField(term9091, term9091.getClass(), "userCredential", term9140);
        setField(term9026, term9026.getClass(), "employee", term9091);
        setField(term8949, term8949.getClass(), "userCredential", term9026);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.selimhorri.app.pack.models.entities.Employee");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSal", argTypes, term8949, args);
    }

};


