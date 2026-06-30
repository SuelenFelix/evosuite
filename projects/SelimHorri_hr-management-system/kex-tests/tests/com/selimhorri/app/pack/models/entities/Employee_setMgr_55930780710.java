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

public class Employee_setMgr_55930780710 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8156;
     Object term8299;

    public Employee_setMgr_55930780710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term8157 = new Integer(-1954860951);
        Integer term8183 = new Integer(-2078879114);
        Double term8195 = new Double(0.46055414536796613);
        Double term8197 = new Double(0.7658890382866111);
        Integer term8200 = new Integer(-1186882318);
        HashMap term8227 = new HashMap();
        Set<Object> term8341 =  ((Map) term8227).keySet();
        HashSet term8226 = new HashSet((Collection<? extends Object>) term8341);
        Integer term8234 = new Integer(-2092117838);
        Boolean term8260 = new Boolean(true);
        term8156 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Employee"));
        Object term8185 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8186 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8190 = newInstance(Class.forName("java.time.LocalTime"));
        Object term8199 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Department"));
        Object term8233 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.UserCredential"));
        Object term8298 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Employee"));
        setField(term8156, term8156.getClass(), "empno", term8157);
        setField(term8156, term8156.getClass(), "ename", "vVVFChfeBQ");
        setField(term8156, term8156.getClass(), "job", "aASfcqfBbh");
        setField(term8156, term8156.getClass(), "mgr", term8183);
        setIntField(term8186, term8186.getClass(), "year", 2019);
        setShortField(term8186, term8186.getClass(), "month", (short) 3);
        setShortField(term8186, term8186.getClass(), "day", (short) 19);
        setField(term8185, term8185.getClass(), "date", term8186);
        setByteField(term8190, term8190.getClass(), "hour", (byte) 19);
        setByteField(term8190, term8190.getClass(), "minute", (byte) 24);
        setByteField(term8190, term8190.getClass(), "second", (byte) 21);
        setIntField(term8190, term8190.getClass(), "nano", 765889037);
        setField(term8185, term8185.getClass(), "time", term8190);
        setField(term8156, term8156.getClass(), "hireDate", term8185);
        setField(term8156, term8156.getClass(), "sal", term8195);
        setField(term8156, term8156.getClass(), "comm", term8197);
        setField(term8199, term8199.getClass(), "deptno", term8200);
        setField(term8199, term8199.getClass(), "dname", "DwpOIkpRFT");
        setField(term8199, term8199.getClass(), "loc", "LPlTDoLrUy");
        setField(term8199, term8199.getClass(), "employees", term8226);
        setField(term8156, term8156.getClass(), "department", term8199);
        setField(term8233, term8233.getClass(), "id", term8234);
        setField(term8233, term8233.getClass(), "username", "kNkFIdfwqs");
        setField(term8233, term8233.getClass(), "password", "sHLdqoTjnP");
        setField(term8233, term8233.getClass(), "enabled", term8260);
        setField(term8233, term8233.getClass(), "email", "UakuVGzEav");
        setField(term8233, term8233.getClass(), "phone", "DxiwTTouEo");
        setField(term8233, term8233.getClass(), "role", "ghoklPMuMt");
        setField(term8298, term8298.getClass(), "empno", null);
        setField(term8298, term8298.getClass(), "ename", null);
        setField(term8298, term8298.getClass(), "job", null);
        setField(term8298, term8298.getClass(), "mgr", null);
        setField(term8298, term8298.getClass(), "hireDate", null);
        setField(term8298, term8298.getClass(), "sal", null);
        setField(term8298, term8298.getClass(), "comm", null);
        setField(term8298, term8298.getClass(), "department", null);
        setField(term8298, term8298.getClass(), "userCredential", null);
        setField(term8233, term8233.getClass(), "employee", term8298);
        setField(term8156, term8156.getClass(), "userCredential", term8233);
        term8299 = new Integer(1524590776);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.selimhorri.app.pack.models.entities.Employee");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term8299;
        callMethod(klass, "setMgr", argTypes, term8156, args);
    }

};


