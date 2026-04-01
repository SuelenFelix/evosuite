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

public class Employee_getEmpno_3875961663 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6166;

    public Employee_getEmpno_3875961663() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term6167 = new Integer(18072182);
        Integer term6193 = new Integer(1544768934);
        Double term6205 = new Double(0.2682123119817419);
        Double term6207 = new Double(0.2465788293643847);
        Integer term6210 = new Integer(-383508597);
        HashMap term6237 = new HashMap();
        Set<Object> term6407 =  ((Map) term6237).keySet();
        HashSet term6236 = new HashSet((Collection<? extends Object>) term6407);
        Integer term6243 = new Integer(-819372164);
        Boolean term6269 = new Boolean(false);
        Integer term6308 = new Integer(958132675);
        Integer term6334 = new Integer(-689879283);
        Double term6346 = new Double(0.9194156323780788);
        Double term6348 = new Double(0.2589672937578553);
        Integer term6351 = new Integer(1985432430);
        HashSet term6355 = new HashSet();
        Integer term6357 = new Integer(-1735276919);
        Boolean term6361 = new Boolean(false);
        term6166 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Employee"));
        Object term6195 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6196 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6200 = newInstance(Class.forName("java.time.LocalTime"));
        Object term6209 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Department"));
        Object term6242 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.UserCredential"));
        Object term6307 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Employee"));
        Object term6336 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6337 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6341 = newInstance(Class.forName("java.time.LocalTime"));
        Object term6350 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Department"));
        Object term6356 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.UserCredential"));
        Object term6366 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Employee"));
        setField(term6166, term6166.getClass(), "empno", term6167);
        setField(term6166, term6166.getClass(), "ename", "cvbvwpPlNk");
        setField(term6166, term6166.getClass(), "job", "uCdLbhvYeG");
        setField(term6166, term6166.getClass(), "mgr", term6193);
        setIntField(term6196, term6196.getClass(), "year", 2015);
        setShortField(term6196, term6196.getClass(), "month", (short) 5);
        setShortField(term6196, term6196.getClass(), "day", (short) 14);
        setField(term6195, term6195.getClass(), "date", term6196);
        setByteField(term6200, term6200.getClass(), "hour", (byte) 13);
        setByteField(term6200, term6200.getClass(), "minute", (byte) 25);
        setByteField(term6200, term6200.getClass(), "second", (byte) 10);
        setIntField(term6200, term6200.getClass(), "nano", 246578829);
        setField(term6195, term6195.getClass(), "time", term6200);
        setField(term6166, term6166.getClass(), "hireDate", term6195);
        setField(term6166, term6166.getClass(), "sal", term6205);
        setField(term6166, term6166.getClass(), "comm", term6207);
        setField(term6209, term6209.getClass(), "deptno", term6210);
        setField(term6209, term6209.getClass(), "dname", "ipoyEHBfoG");
        setField(term6209, term6209.getClass(), "loc", "iSBTpbiteU");
        setField(term6209, term6209.getClass(), "employees", term6236);
        setField(term6166, term6166.getClass(), "department", term6209);
        setField(term6242, term6242.getClass(), "id", term6243);
        setField(term6242, term6242.getClass(), "username", "MTwFbEoMZj");
        setField(term6242, term6242.getClass(), "password", "uEQbnHbyAn");
        setField(term6242, term6242.getClass(), "enabled", term6269);
        setField(term6242, term6242.getClass(), "email", "JpFIuyNEKW");
        setField(term6242, term6242.getClass(), "phone", "NksHsgcqDx");
        setField(term6242, term6242.getClass(), "role", "RjSNvOEvcT");
        setField(term6307, term6307.getClass(), "empno", term6308);
        setField(term6307, term6307.getClass(), "ename", "HLzuMxigqS");
        setField(term6307, term6307.getClass(), "job", "wiBOoDCyzd");
        setField(term6307, term6307.getClass(), "mgr", term6334);
        setIntField(term6337, term6337.getClass(), "year", 2028);
        setShortField(term6337, term6337.getClass(), "month", (short) 5);
        setShortField(term6337, term6337.getClass(), "day", (short) 23);
        setField(term6336, term6336.getClass(), "date", term6337);
        setByteField(term6341, term6341.getClass(), "hour", (byte) 6);
        setByteField(term6341, term6341.getClass(), "minute", (byte) 0);
        setByteField(term6341, term6341.getClass(), "second", (byte) 51);
        setIntField(term6341, term6341.getClass(), "nano", 258967293);
        setField(term6336, term6336.getClass(), "time", term6341);
        setField(term6307, term6307.getClass(), "hireDate", term6336);
        setField(term6307, term6307.getClass(), "sal", term6346);
        setField(term6307, term6307.getClass(), "comm", term6348);
        setField(term6350, term6350.getClass(), "deptno", term6351);
        setField(term6350, term6350.getClass(), "dname", "");
        setField(term6350, term6350.getClass(), "loc", "");
        setField(term6350, term6350.getClass(), "employees", term6355);
        setField(term6307, term6307.getClass(), "department", term6350);
        setField(term6356, term6356.getClass(), "id", term6357);
        setField(term6356, term6356.getClass(), "username", "");
        setField(term6356, term6356.getClass(), "password", "");
        setField(term6356, term6356.getClass(), "enabled", term6361);
        setField(term6356, term6356.getClass(), "email", "");
        setField(term6356, term6356.getClass(), "phone", "");
        setField(term6356, term6356.getClass(), "role", "");
        setField(term6366, term6366.getClass(), "empno", null);
        setField(term6366, term6366.getClass(), "ename", null);
        setField(term6366, term6366.getClass(), "job", null);
        setField(term6366, term6366.getClass(), "mgr", null);
        setField(term6366, term6366.getClass(), "hireDate", null);
        setField(term6366, term6366.getClass(), "sal", null);
        setField(term6366, term6366.getClass(), "comm", null);
        setField(term6366, term6366.getClass(), "department", null);
        setField(term6366, term6366.getClass(), "userCredential", null);
        setField(term6356, term6356.getClass(), "employee", term6366);
        setField(term6307, term6307.getClass(), "userCredential", term6356);
        setField(term6242, term6242.getClass(), "employee", term6307);
        setField(term6166, term6166.getClass(), "userCredential", term6242);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.selimhorri.app.pack.models.entities.Employee");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmpno", argTypes, term6166, args);
    }

};


