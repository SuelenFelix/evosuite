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

public class Employee_setSal_149401133814 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9262;
     Object term9405;

    public Employee_setSal_149401133814() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term9263 = new Integer(-137577510);
        Integer term9289 = new Integer(719185716);
        Double term9301 = new Double(0.4183851447671385);
        Double term9303 = new Double(0.1530493698346701);
        Integer term9306 = new Integer(1624820010);
        HashMap term9333 = new HashMap();
        Set<Object> term9447 =  ((Map) term9333).keySet();
        HashSet term9332 = new HashSet((Collection<? extends Object>) term9447);
        Integer term9340 = new Integer(-203832871);
        Boolean term9366 = new Boolean(false);
        term9262 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Employee"));
        Object term9291 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9292 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9296 = newInstance(Class.forName("java.time.LocalTime"));
        Object term9305 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Department"));
        Object term9339 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.UserCredential"));
        Object term9404 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Employee"));
        setField(term9262, term9262.getClass(), "empno", term9263);
        setField(term9262, term9262.getClass(), "ename", "uplmRQRGWr");
        setField(term9262, term9262.getClass(), "job", "ZEmNnaQFYB");
        setField(term9262, term9262.getClass(), "mgr", term9289);
        setIntField(term9292, term9292.getClass(), "year", 2018);
        setShortField(term9292, term9292.getClass(), "month", (short) 9);
        setShortField(term9292, term9292.getClass(), "day", (short) 19);
        setField(term9291, term9291.getClass(), "date", term9292);
        setByteField(term9296, term9296.getClass(), "hour", (byte) 23);
        setByteField(term9296, term9296.getClass(), "minute", (byte) 30);
        setByteField(term9296, term9296.getClass(), "second", (byte) 11);
        setIntField(term9296, term9296.getClass(), "nano", 615798597);
        setField(term9291, term9291.getClass(), "time", term9296);
        setField(term9262, term9262.getClass(), "hireDate", term9291);
        setField(term9262, term9262.getClass(), "sal", term9301);
        setField(term9262, term9262.getClass(), "comm", term9303);
        setField(term9305, term9305.getClass(), "deptno", term9306);
        setField(term9305, term9305.getClass(), "dname", "FNxFpCZxLW");
        setField(term9305, term9305.getClass(), "loc", "sXMXSCUbRu");
        setField(term9305, term9305.getClass(), "employees", term9332);
        setField(term9262, term9262.getClass(), "department", term9305);
        setField(term9339, term9339.getClass(), "id", term9340);
        setField(term9339, term9339.getClass(), "username", "mXVgkxjTjD");
        setField(term9339, term9339.getClass(), "password", "qodBmKUkev");
        setField(term9339, term9339.getClass(), "enabled", term9366);
        setField(term9339, term9339.getClass(), "email", "QJuqwUQEyr");
        setField(term9339, term9339.getClass(), "phone", "qqUAzxxpNB");
        setField(term9339, term9339.getClass(), "role", "WqaQxuPbzr");
        setField(term9404, term9404.getClass(), "empno", null);
        setField(term9404, term9404.getClass(), "ename", null);
        setField(term9404, term9404.getClass(), "job", null);
        setField(term9404, term9404.getClass(), "mgr", null);
        setField(term9404, term9404.getClass(), "hireDate", null);
        setField(term9404, term9404.getClass(), "sal", null);
        setField(term9404, term9404.getClass(), "comm", null);
        setField(term9404, term9404.getClass(), "department", null);
        setField(term9404, term9404.getClass(), "userCredential", null);
        setField(term9339, term9339.getClass(), "employee", term9404);
        setField(term9262, term9262.getClass(), "userCredential", term9339);
        term9405 = new Double(0.406335810791266);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.selimhorri.app.pack.models.entities.Employee");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Double");
        Object[] args = new Object[1];
        args[0] = term9405;
        callMethod(klass, "setSal", argTypes, term9262, args);
    }

};


