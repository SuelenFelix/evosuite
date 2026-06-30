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

public class UserCredential_setPassword_16061778015 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1211;

    public UserCredential_setPassword_16061778015() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1212 = new Integer(906181092);
        Boolean term1238 = new Boolean(false);
        Integer term1277 = new Integer(1045657203);
        Integer term1303 = new Integer(1386130016);
        Double term1315 = new Double(0.29874017652881824);
        Double term1317 = new Double(0.32554480512985284);
        Integer term1320 = new Integer(1072005683);
        HashMap term1347 = new HashMap();
        Set<Object> term1533 =  ((Map) term1347).keySet();
        HashSet term1346 = new HashSet((Collection<? extends Object>) term1533);
        Integer term1353 = new Integer(344323424);
        Boolean term1379 = new Boolean(true);
        Integer term1418 = new Integer(-343325701);
        Integer term1422 = new Integer(107945604);
        Double term1425 = new Double(0.3626177854778667);
        Double term1427 = new Double(0.3163771663728089);
        term1211 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.UserCredential"));
        Object term1276 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Employee"));
        Object term1305 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1306 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1310 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1319 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Department"));
        Object term1352 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.UserCredential"));
        Object term1417 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Employee"));
        Object term1424 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1429 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Department"));
        Object term1430 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.UserCredential"));
        setField(term1211, term1211.getClass(), "id", term1212);
        setField(term1211, term1211.getClass(), "username", "tlQSNgTkQX");
        setField(term1211, term1211.getClass(), "password", "PCipZnmBOF");
        setField(term1211, term1211.getClass(), "enabled", term1238);
        setField(term1211, term1211.getClass(), "email", "zcorEihhLK");
        setField(term1211, term1211.getClass(), "phone", "GrqozDKFOk");
        setField(term1211, term1211.getClass(), "role", "CFyoseFGLF");
        setField(term1276, term1276.getClass(), "empno", term1277);
        setField(term1276, term1276.getClass(), "ename", "SFqCrhEWLm");
        setField(term1276, term1276.getClass(), "job", "GZdcJyZntS");
        setField(term1276, term1276.getClass(), "mgr", term1303);
        setIntField(term1306, term1306.getClass(), "year", 2015);
        setShortField(term1306, term1306.getClass(), "month", (short) 12);
        setShortField(term1306, term1306.getClass(), "day", (short) 23);
        setField(term1305, term1305.getClass(), "date", term1306);
        setByteField(term1310, term1310.getClass(), "hour", (byte) 14);
        setByteField(term1310, term1310.getClass(), "minute", (byte) 17);
        setByteField(term1310, term1310.getClass(), "second", (byte) 50);
        setIntField(term1310, term1310.getClass(), "nano", 325544804);
        setField(term1305, term1305.getClass(), "time", term1310);
        setField(term1276, term1276.getClass(), "hireDate", term1305);
        setField(term1276, term1276.getClass(), "sal", term1315);
        setField(term1276, term1276.getClass(), "comm", term1317);
        setField(term1319, term1319.getClass(), "deptno", term1320);
        setField(term1319, term1319.getClass(), "dname", "OIHoJeysUi");
        setField(term1319, term1319.getClass(), "loc", "WXMWFDGcLB");
        setField(term1319, term1319.getClass(), "employees", term1346);
        setField(term1276, term1276.getClass(), "department", term1319);
        setField(term1352, term1352.getClass(), "id", term1353);
        setField(term1352, term1352.getClass(), "username", "NTlKJDDWlk");
        setField(term1352, term1352.getClass(), "password", "vOuMEpOQAg");
        setField(term1352, term1352.getClass(), "enabled", term1379);
        setField(term1352, term1352.getClass(), "email", "SIODFGaQhr");
        setField(term1352, term1352.getClass(), "phone", "qYzsiuXOgS");
        setField(term1352, term1352.getClass(), "role", "bxrCBbrrct");
        setField(term1417, term1417.getClass(), "empno", term1418);
        setField(term1417, term1417.getClass(), "ename", "");
        setField(term1417, term1417.getClass(), "job", "");
        setField(term1417, term1417.getClass(), "mgr", term1422);
        setField(term1424, term1424.getClass(), "date", null);
        setField(term1424, term1424.getClass(), "time", null);
        setField(term1417, term1417.getClass(), "hireDate", term1424);
        setField(term1417, term1417.getClass(), "sal", term1425);
        setField(term1417, term1417.getClass(), "comm", term1427);
        setField(term1429, term1429.getClass(), "deptno", null);
        setField(term1429, term1429.getClass(), "dname", null);
        setField(term1429, term1429.getClass(), "loc", null);
        setField(term1429, term1429.getClass(), "employees", null);
        setField(term1417, term1417.getClass(), "department", term1429);
        setField(term1430, term1430.getClass(), "id", null);
        setField(term1430, term1430.getClass(), "username", null);
        setField(term1430, term1430.getClass(), "password", null);
        setField(term1430, term1430.getClass(), "enabled", null);
        setField(term1430, term1430.getClass(), "email", null);
        setField(term1430, term1430.getClass(), "phone", null);
        setField(term1430, term1430.getClass(), "role", null);
        setField(term1430, term1430.getClass(), "employee", null);
        setField(term1417, term1417.getClass(), "userCredential", term1430);
        setField(term1352, term1352.getClass(), "employee", term1417);
        setField(term1276, term1276.getClass(), "userCredential", term1352);
        setField(term1211, term1211.getClass(), "employee", term1276);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.selimhorri.app.pack.models.entities.UserCredential");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "pvDEABOxLt";
        callMethod(klass, "setPassword", argTypes, term1211, args);
    }

};


