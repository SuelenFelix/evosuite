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

public class UserCredential_getId_38596067616 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4750;

    public UserCredential_getId_38596067616() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term4751 = new Integer(-688213483);
        Boolean term4777 = new Boolean(false);
        Integer term4816 = new Integer(644154104);
        Integer term4842 = new Integer(76650923);
        Double term4854 = new Double(0.6416885379658445);
        Double term4856 = new Double(0.604465128384297);
        Integer term4859 = new Integer(1003743923);
        HashMap term4886 = new HashMap();
        Set<Object> term4982 =  ((Map) term4886).keySet();
        HashSet term4885 = new HashSet((Collection<? extends Object>) term4982);
        term4750 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.UserCredential"));
        Object term4815 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Employee"));
        Object term4844 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4845 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4849 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4858 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Department"));
        Object term4891 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.UserCredential"));
        setField(term4750, term4750.getClass(), "id", term4751);
        setField(term4750, term4750.getClass(), "username", "iptRXVDoYE");
        setField(term4750, term4750.getClass(), "password", "kucsxnvbES");
        setField(term4750, term4750.getClass(), "enabled", term4777);
        setField(term4750, term4750.getClass(), "email", "IdGzDFfcZf");
        setField(term4750, term4750.getClass(), "phone", "KDdRNhZmnU");
        setField(term4750, term4750.getClass(), "role", "iMsqJaKlDC");
        setField(term4815, term4815.getClass(), "empno", term4816);
        setField(term4815, term4815.getClass(), "ename", "aPkGHbZyjj");
        setField(term4815, term4815.getClass(), "job", "nSWdsVyJRI");
        setField(term4815, term4815.getClass(), "mgr", term4842);
        setIntField(term4845, term4845.getClass(), "year", 2022);
        setShortField(term4845, term4845.getClass(), "month", (short) 11);
        setShortField(term4845, term4845.getClass(), "day", (short) 2);
        setField(term4844, term4844.getClass(), "date", term4845);
        setByteField(term4849, term4849.getClass(), "hour", (byte) 4);
        setByteField(term4849, term4849.getClass(), "minute", (byte) 14);
        setByteField(term4849, term4849.getClass(), "second", (byte) 5);
        setIntField(term4849, term4849.getClass(), "nano", 604465127);
        setField(term4844, term4844.getClass(), "time", term4849);
        setField(term4815, term4815.getClass(), "hireDate", term4844);
        setField(term4815, term4815.getClass(), "sal", term4854);
        setField(term4815, term4815.getClass(), "comm", term4856);
        setField(term4858, term4858.getClass(), "deptno", term4859);
        setField(term4858, term4858.getClass(), "dname", "JBOPGgGKnc");
        setField(term4858, term4858.getClass(), "loc", "GlPTiCMCGP");
        setField(term4858, term4858.getClass(), "employees", term4885);
        setField(term4815, term4815.getClass(), "department", term4858);
        setField(term4891, term4891.getClass(), "id", null);
        setField(term4891, term4891.getClass(), "username", null);
        setField(term4891, term4891.getClass(), "password", null);
        setField(term4891, term4891.getClass(), "enabled", null);
        setField(term4891, term4891.getClass(), "email", null);
        setField(term4891, term4891.getClass(), "phone", null);
        setField(term4891, term4891.getClass(), "role", null);
        setField(term4891, term4891.getClass(), "employee", null);
        setField(term4815, term4815.getClass(), "userCredential", term4891);
        setField(term4750, term4750.getClass(), "employee", term4815);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.selimhorri.app.pack.models.entities.UserCredential");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term4750, args);
    }

};


