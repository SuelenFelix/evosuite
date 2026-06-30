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
     Object term6157;

    public Employee_getEmpno_3875961663() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term6158 = new Integer(18072182);
        Integer term6184 = new Integer(1544768934);
        Double term6196 = new Double(0.2682123119817419);
        Double term6198 = new Double(0.2465788293643847);
        Integer term6201 = new Integer(-383508597);
        HashMap term6228 = new HashMap();
        Set<Object> term6398 =  ((Map) term6228).keySet();
        HashSet term6227 = new HashSet((Collection<? extends Object>) term6398);
        Integer term6234 = new Integer(-819372164);
        Boolean term6260 = new Boolean(false);
        Integer term6299 = new Integer(958132675);
        Integer term6325 = new Integer(-689879283);
        Double term6337 = new Double(0.9194156323780788);
        Double term6339 = new Double(0.2589672937578553);
        Integer term6342 = new Integer(1985432430);
        HashSet term6346 = new HashSet();
        Integer term6348 = new Integer(-1735276919);
        Boolean term6352 = new Boolean(false);
        term6157 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Employee"));
        Object term6186 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6187 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6191 = newInstance(Class.forName("java.time.LocalTime"));
        Object term6200 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Department"));
        Object term6233 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.UserCredential"));
        Object term6298 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Employee"));
        Object term6327 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6328 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6332 = newInstance(Class.forName("java.time.LocalTime"));
        Object term6341 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Department"));
        Object term6347 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.UserCredential"));
        Object term6357 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Employee"));
        setField(term6157, term6157.getClass(), "empno", term6158);
        setField(term6157, term6157.getClass(), "ename", "cvbvwpPlNk");
        setField(term6157, term6157.getClass(), "job", "uCdLbhvYeG");
        setField(term6157, term6157.getClass(), "mgr", term6184);
        setIntField(term6187, term6187.getClass(), "year", 2015);
        setShortField(term6187, term6187.getClass(), "month", (short) 5);
        setShortField(term6187, term6187.getClass(), "day", (short) 14);
        setField(term6186, term6186.getClass(), "date", term6187);
        setByteField(term6191, term6191.getClass(), "hour", (byte) 13);
        setByteField(term6191, term6191.getClass(), "minute", (byte) 25);
        setByteField(term6191, term6191.getClass(), "second", (byte) 10);
        setIntField(term6191, term6191.getClass(), "nano", 246578829);
        setField(term6186, term6186.getClass(), "time", term6191);
        setField(term6157, term6157.getClass(), "hireDate", term6186);
        setField(term6157, term6157.getClass(), "sal", term6196);
        setField(term6157, term6157.getClass(), "comm", term6198);
        setField(term6200, term6200.getClass(), "deptno", term6201);
        setField(term6200, term6200.getClass(), "dname", "ipoyEHBfoG");
        setField(term6200, term6200.getClass(), "loc", "iSBTpbiteU");
        setField(term6200, term6200.getClass(), "employees", term6227);
        setField(term6157, term6157.getClass(), "department", term6200);
        setField(term6233, term6233.getClass(), "id", term6234);
        setField(term6233, term6233.getClass(), "username", "MTwFbEoMZj");
        setField(term6233, term6233.getClass(), "password", "uEQbnHbyAn");
        setField(term6233, term6233.getClass(), "enabled", term6260);
        setField(term6233, term6233.getClass(), "email", "JpFIuyNEKW");
        setField(term6233, term6233.getClass(), "phone", "NksHsgcqDx");
        setField(term6233, term6233.getClass(), "role", "RjSNvOEvcT");
        setField(term6298, term6298.getClass(), "empno", term6299);
        setField(term6298, term6298.getClass(), "ename", "HLzuMxigqS");
        setField(term6298, term6298.getClass(), "job", "wiBOoDCyzd");
        setField(term6298, term6298.getClass(), "mgr", term6325);
        setIntField(term6328, term6328.getClass(), "year", 2028);
        setShortField(term6328, term6328.getClass(), "month", (short) 5);
        setShortField(term6328, term6328.getClass(), "day", (short) 23);
        setField(term6327, term6327.getClass(), "date", term6328);
        setByteField(term6332, term6332.getClass(), "hour", (byte) 6);
        setByteField(term6332, term6332.getClass(), "minute", (byte) 0);
        setByteField(term6332, term6332.getClass(), "second", (byte) 51);
        setIntField(term6332, term6332.getClass(), "nano", 258967293);
        setField(term6327, term6327.getClass(), "time", term6332);
        setField(term6298, term6298.getClass(), "hireDate", term6327);
        setField(term6298, term6298.getClass(), "sal", term6337);
        setField(term6298, term6298.getClass(), "comm", term6339);
        setField(term6341, term6341.getClass(), "deptno", term6342);
        setField(term6341, term6341.getClass(), "dname", "");
        setField(term6341, term6341.getClass(), "loc", "");
        setField(term6341, term6341.getClass(), "employees", term6346);
        setField(term6298, term6298.getClass(), "department", term6341);
        setField(term6347, term6347.getClass(), "id", term6348);
        setField(term6347, term6347.getClass(), "username", "");
        setField(term6347, term6347.getClass(), "password", "");
        setField(term6347, term6347.getClass(), "enabled", term6352);
        setField(term6347, term6347.getClass(), "email", "");
        setField(term6347, term6347.getClass(), "phone", "");
        setField(term6347, term6347.getClass(), "role", "");
        setField(term6357, term6357.getClass(), "empno", null);
        setField(term6357, term6357.getClass(), "ename", null);
        setField(term6357, term6357.getClass(), "job", null);
        setField(term6357, term6357.getClass(), "mgr", null);
        setField(term6357, term6357.getClass(), "hireDate", null);
        setField(term6357, term6357.getClass(), "sal", null);
        setField(term6357, term6357.getClass(), "comm", null);
        setField(term6357, term6357.getClass(), "department", null);
        setField(term6357, term6357.getClass(), "userCredential", null);
        setField(term6347, term6347.getClass(), "employee", term6357);
        setField(term6298, term6298.getClass(), "userCredential", term6347);
        setField(term6233, term6233.getClass(), "employee", term6298);
        setField(term6157, term6157.getClass(), "userCredential", term6233);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.selimhorri.app.pack.models.entities.Employee");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmpno", argTypes, term6157, args);
    }

};


