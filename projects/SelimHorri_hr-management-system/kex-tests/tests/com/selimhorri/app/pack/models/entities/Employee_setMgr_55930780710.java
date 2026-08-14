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
     Object term8165;
     Object term8308;

    public Employee_setMgr_55930780710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term8166 = new Integer(-1954860951);
        Integer term8192 = new Integer(-2078879114);
        Double term8204 = new Double(0.46055414536796613);
        Double term8206 = new Double(0.7658890382866111);
        Integer term8209 = new Integer(-1186882318);
        HashMap term8236 = new HashMap();
        Set<Object> term8350 =  ((Map) term8236).keySet();
        HashSet term8235 = new HashSet((Collection<? extends Object>) term8350);
        Integer term8243 = new Integer(-2092117838);
        Boolean term8269 = new Boolean(true);
        term8165 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Employee"));
        Object term8194 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8195 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8199 = newInstance(Class.forName("java.time.LocalTime"));
        Object term8208 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Department"));
        Object term8242 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.UserCredential"));
        Object term8307 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Employee"));
        setField(term8165, term8165.getClass(), "empno", term8166);
        setField(term8165, term8165.getClass(), "ename", "vVVFChfeBQ");
        setField(term8165, term8165.getClass(), "job", "aASfcqfBbh");
        setField(term8165, term8165.getClass(), "mgr", term8192);
        setIntField(term8195, term8195.getClass(), "year", 2019);
        setShortField(term8195, term8195.getClass(), "month", (short) 3);
        setShortField(term8195, term8195.getClass(), "day", (short) 19);
        setField(term8194, term8194.getClass(), "date", term8195);
        setByteField(term8199, term8199.getClass(), "hour", (byte) 19);
        setByteField(term8199, term8199.getClass(), "minute", (byte) 24);
        setByteField(term8199, term8199.getClass(), "second", (byte) 21);
        setIntField(term8199, term8199.getClass(), "nano", 765889037);
        setField(term8194, term8194.getClass(), "time", term8199);
        setField(term8165, term8165.getClass(), "hireDate", term8194);
        setField(term8165, term8165.getClass(), "sal", term8204);
        setField(term8165, term8165.getClass(), "comm", term8206);
        setField(term8208, term8208.getClass(), "deptno", term8209);
        setField(term8208, term8208.getClass(), "dname", "DwpOIkpRFT");
        setField(term8208, term8208.getClass(), "loc", "LPlTDoLrUy");
        setField(term8208, term8208.getClass(), "employees", term8235);
        setField(term8165, term8165.getClass(), "department", term8208);
        setField(term8242, term8242.getClass(), "id", term8243);
        setField(term8242, term8242.getClass(), "username", "kNkFIdfwqs");
        setField(term8242, term8242.getClass(), "password", "sHLdqoTjnP");
        setField(term8242, term8242.getClass(), "enabled", term8269);
        setField(term8242, term8242.getClass(), "email", "UakuVGzEav");
        setField(term8242, term8242.getClass(), "phone", "DxiwTTouEo");
        setField(term8242, term8242.getClass(), "role", "ghoklPMuMt");
        setField(term8307, term8307.getClass(), "empno", null);
        setField(term8307, term8307.getClass(), "ename", null);
        setField(term8307, term8307.getClass(), "job", null);
        setField(term8307, term8307.getClass(), "mgr", null);
        setField(term8307, term8307.getClass(), "hireDate", null);
        setField(term8307, term8307.getClass(), "sal", null);
        setField(term8307, term8307.getClass(), "comm", null);
        setField(term8307, term8307.getClass(), "department", null);
        setField(term8307, term8307.getClass(), "userCredential", null);
        setField(term8242, term8242.getClass(), "employee", term8307);
        setField(term8165, term8165.getClass(), "userCredential", term8242);
        term8308 = new Integer(1524590776);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.selimhorri.app.pack.models.entities.Employee");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term8308;
        callMethod(klass, "setMgr", argTypes, term8165, args);
    }

};


