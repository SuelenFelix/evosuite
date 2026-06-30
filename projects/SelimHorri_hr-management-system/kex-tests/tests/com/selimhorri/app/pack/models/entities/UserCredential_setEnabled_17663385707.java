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

public class UserCredential_setEnabled_17663385707 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1827;
     Object term2047;

    public UserCredential_setEnabled_17663385707() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1828 = new Integer(663292551);
        Boolean term1854 = new Boolean(false);
        Integer term1893 = new Integer(-1885090354);
        Integer term1919 = new Integer(-2066804303);
        Double term1931 = new Double(0.3074693824288357);
        Double term1933 = new Double(0.1245258965512791);
        Integer term1936 = new Integer(-1731761810);
        HashMap term1963 = new HashMap();
        Set<Object> term2139 =  ((Map) term1963).keySet();
        HashSet term1962 = new HashSet((Collection<? extends Object>) term2139);
        Integer term1969 = new Integer(-1667990367);
        Boolean term1995 = new Boolean(true);
        Integer term2034 = new Integer(-1899301124);
        Integer term2038 = new Integer(-1882480155);
        Double term2041 = new Double(0.7818620200430967);
        Double term2043 = new Double(0.04640022995603543);
        term1827 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.UserCredential"));
        Object term1892 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Employee"));
        Object term1921 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1922 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1926 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1935 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Department"));
        Object term1968 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.UserCredential"));
        Object term2033 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Employee"));
        Object term2040 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2045 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Department"));
        Object term2046 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.UserCredential"));
        setField(term1827, term1827.getClass(), "id", term1828);
        setField(term1827, term1827.getClass(), "username", "OeQLvhVERT");
        setField(term1827, term1827.getClass(), "password", "IlvgFINwIa");
        setField(term1827, term1827.getClass(), "enabled", term1854);
        setField(term1827, term1827.getClass(), "email", "GEJABPlHSI");
        setField(term1827, term1827.getClass(), "phone", "aQFUvuaYxd");
        setField(term1827, term1827.getClass(), "role", "zNFLXMifnS");
        setField(term1892, term1892.getClass(), "empno", term1893);
        setField(term1892, term1892.getClass(), "ename", "HHQcYMSBVc");
        setField(term1892, term1892.getClass(), "job", "wdoqITnaAP");
        setField(term1892, term1892.getClass(), "mgr", term1919);
        setIntField(term1922, term1922.getClass(), "year", 2016);
        setShortField(term1922, term1922.getClass(), "month", (short) 2);
        setShortField(term1922, term1922.getClass(), "day", (short) 25);
        setField(term1921, term1921.getClass(), "date", term1922);
        setByteField(term1926, term1926.getClass(), "hour", (byte) 8);
        setByteField(term1926, term1926.getClass(), "minute", (byte) 54);
        setByteField(term1926, term1926.getClass(), "second", (byte) 40);
        setIntField(term1926, term1926.getClass(), "nano", 124525896);
        setField(term1921, term1921.getClass(), "time", term1926);
        setField(term1892, term1892.getClass(), "hireDate", term1921);
        setField(term1892, term1892.getClass(), "sal", term1931);
        setField(term1892, term1892.getClass(), "comm", term1933);
        setField(term1935, term1935.getClass(), "deptno", term1936);
        setField(term1935, term1935.getClass(), "dname", "rIPMBcrNqB");
        setField(term1935, term1935.getClass(), "loc", "UDaboHZHhz");
        setField(term1935, term1935.getClass(), "employees", term1962);
        setField(term1892, term1892.getClass(), "department", term1935);
        setField(term1968, term1968.getClass(), "id", term1969);
        setField(term1968, term1968.getClass(), "username", "xClUIcPECX");
        setField(term1968, term1968.getClass(), "password", "avhRaGZaBF");
        setField(term1968, term1968.getClass(), "enabled", term1995);
        setField(term1968, term1968.getClass(), "email", "JkgoRtImdE");
        setField(term1968, term1968.getClass(), "phone", "qFGKIJjlmV");
        setField(term1968, term1968.getClass(), "role", "IHqvyhMtuM");
        setField(term2033, term2033.getClass(), "empno", term2034);
        setField(term2033, term2033.getClass(), "ename", "");
        setField(term2033, term2033.getClass(), "job", "");
        setField(term2033, term2033.getClass(), "mgr", term2038);
        setField(term2040, term2040.getClass(), "date", null);
        setField(term2040, term2040.getClass(), "time", null);
        setField(term2033, term2033.getClass(), "hireDate", term2040);
        setField(term2033, term2033.getClass(), "sal", term2041);
        setField(term2033, term2033.getClass(), "comm", term2043);
        setField(term2045, term2045.getClass(), "deptno", null);
        setField(term2045, term2045.getClass(), "dname", null);
        setField(term2045, term2045.getClass(), "loc", null);
        setField(term2045, term2045.getClass(), "employees", null);
        setField(term2033, term2033.getClass(), "department", term2045);
        setField(term2046, term2046.getClass(), "id", null);
        setField(term2046, term2046.getClass(), "username", null);
        setField(term2046, term2046.getClass(), "password", null);
        setField(term2046, term2046.getClass(), "enabled", null);
        setField(term2046, term2046.getClass(), "email", null);
        setField(term2046, term2046.getClass(), "phone", null);
        setField(term2046, term2046.getClass(), "role", null);
        setField(term2046, term2046.getClass(), "employee", null);
        setField(term2033, term2033.getClass(), "userCredential", term2046);
        setField(term1968, term1968.getClass(), "employee", term2033);
        setField(term1892, term1892.getClass(), "userCredential", term1968);
        setField(term1827, term1827.getClass(), "employee", term1892);
        term2047 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.selimhorri.app.pack.models.entities.UserCredential");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[1];
        args[0] = term2047;
        callMethod(klass, "setEnabled", argTypes, term1827, args);
    }

};


