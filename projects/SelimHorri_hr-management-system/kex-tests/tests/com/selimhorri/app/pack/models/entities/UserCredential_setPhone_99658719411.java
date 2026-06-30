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
import java.lang.Boolean;
import java.lang.Object;
import java.lang.Double;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class UserCredential_setPhone_99658719411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3045;

    public UserCredential_setPhone_99658719411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3046 = new Integer(-1467089634);
        Boolean term3072 = new Boolean(true);
        Integer term3111 = new Integer(413548937);
        Integer term3137 = new Integer(1901317214);
        Double term3149 = new Double(0.8732511635701926);
        Double term3151 = new Double(0.8977760608415547);
        Integer term3154 = new Integer(1166710220);
        HashMap term3181 = new HashMap();
        Set<Object> term3289 =  ((Map) term3181).keySet();
        HashSet term3180 = new HashSet((Collection<? extends Object>) term3289);
        term3045 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.UserCredential"));
        Object term3110 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Employee"));
        Object term3139 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3140 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3144 = newInstance(Class.forName("java.time.LocalTime"));
        Object term3153 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Department"));
        Object term3186 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.UserCredential"));
        setField(term3045, term3045.getClass(), "id", term3046);
        setField(term3045, term3045.getClass(), "username", "EULDrUNQvw");
        setField(term3045, term3045.getClass(), "password", "BtvAvsJSei");
        setField(term3045, term3045.getClass(), "enabled", term3072);
        setField(term3045, term3045.getClass(), "email", "vqnBkkxoIa");
        setField(term3045, term3045.getClass(), "phone", "bycpZjxXFn");
        setField(term3045, term3045.getClass(), "role", "jQWttOAiwL");
        setField(term3110, term3110.getClass(), "empno", term3111);
        setField(term3110, term3110.getClass(), "ename", "DzKFxEuEEC");
        setField(term3110, term3110.getClass(), "job", "CAMnvfDLJL");
        setField(term3110, term3110.getClass(), "mgr", term3137);
        setIntField(term3140, term3140.getClass(), "year", 2027);
        setShortField(term3140, term3140.getClass(), "month", (short) 6);
        setShortField(term3140, term3140.getClass(), "day", (short) 20);
        setField(term3139, term3139.getClass(), "date", term3140);
        setByteField(term3144, term3144.getClass(), "hour", (byte) 23);
        setByteField(term3144, term3144.getClass(), "minute", (byte) 21);
        setByteField(term3144, term3144.getClass(), "second", (byte) 6);
        setIntField(term3144, term3144.getClass(), "nano", 897776059);
        setField(term3139, term3139.getClass(), "time", term3144);
        setField(term3110, term3110.getClass(), "hireDate", term3139);
        setField(term3110, term3110.getClass(), "sal", term3149);
        setField(term3110, term3110.getClass(), "comm", term3151);
        setField(term3153, term3153.getClass(), "deptno", term3154);
        setField(term3153, term3153.getClass(), "dname", "mfHtgSbdjD");
        setField(term3153, term3153.getClass(), "loc", "cmuaUiHMVL");
        setField(term3153, term3153.getClass(), "employees", term3180);
        setField(term3110, term3110.getClass(), "department", term3153);
        setField(term3186, term3186.getClass(), "id", null);
        setField(term3186, term3186.getClass(), "username", null);
        setField(term3186, term3186.getClass(), "password", null);
        setField(term3186, term3186.getClass(), "enabled", null);
        setField(term3186, term3186.getClass(), "email", null);
        setField(term3186, term3186.getClass(), "phone", null);
        setField(term3186, term3186.getClass(), "role", null);
        setField(term3186, term3186.getClass(), "employee", null);
        setField(term3110, term3110.getClass(), "userCredential", term3186);
        setField(term3045, term3045.getClass(), "employee", term3110);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.selimhorri.app.pack.models.entities.UserCredential");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "pDkMNnAGgv";
        callMethod(klass, "setPhone", argTypes, term3045, args);
    }

};


