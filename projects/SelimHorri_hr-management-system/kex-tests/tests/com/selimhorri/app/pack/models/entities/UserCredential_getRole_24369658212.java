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

public class UserCredential_getRole_24369658212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3300;

    public UserCredential_getRole_24369658212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3301 = new Integer(954660603);
        Boolean term3327 = new Boolean(false);
        Integer term3366 = new Integer(-1351605385);
        Integer term3392 = new Integer(278355793);
        Double term3404 = new Double(0.9772425797816359);
        Double term3406 = new Double(0.32009327814110977);
        Integer term3409 = new Integer(-310648604);
        HashMap term3436 = new HashMap();
        Set<Object> term3610 =  ((Map) term3436).keySet();
        HashSet term3435 = new HashSet((Collection<? extends Object>) term3610);
        Integer term3442 = new Integer(1922684808);
        Boolean term3468 = new Boolean(true);
        Integer term3507 = new Integer(68922753);
        Integer term3511 = new Integer(-220791533);
        Double term3514 = new Double(0.4395312828193261);
        Double term3516 = new Double(0.5715204226647931);
        term3300 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.UserCredential"));
        Object term3365 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Employee"));
        Object term3394 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3395 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3399 = newInstance(Class.forName("java.time.LocalTime"));
        Object term3408 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Department"));
        Object term3441 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.UserCredential"));
        Object term3506 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Employee"));
        Object term3513 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3518 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Department"));
        Object term3519 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.UserCredential"));
        setField(term3300, term3300.getClass(), "id", term3301);
        setField(term3300, term3300.getClass(), "username", "PaCpFXGzdX");
        setField(term3300, term3300.getClass(), "password", "FftYCNbnks");
        setField(term3300, term3300.getClass(), "enabled", term3327);
        setField(term3300, term3300.getClass(), "email", "lJoltmsadS");
        setField(term3300, term3300.getClass(), "phone", "mvfDtZNEHr");
        setField(term3300, term3300.getClass(), "role", "bvSgmFUDOU");
        setField(term3365, term3365.getClass(), "empno", term3366);
        setField(term3365, term3365.getClass(), "ename", "XMHwbfiHRl");
        setField(term3365, term3365.getClass(), "job", "bucTnYicnp");
        setField(term3365, term3365.getClass(), "mgr", term3392);
        setIntField(term3395, term3395.getClass(), "year", 2029);
        setShortField(term3395, term3395.getClass(), "month", (short) 7);
        setShortField(term3395, term3395.getClass(), "day", (short) 19);
        setField(term3394, term3394.getClass(), "date", term3395);
        setByteField(term3399, term3399.getClass(), "hour", (byte) 17);
        setByteField(term3399, term3399.getClass(), "minute", (byte) 37);
        setByteField(term3399, term3399.getClass(), "second", (byte) 21);
        setIntField(term3399, term3399.getClass(), "nano", 320093277);
        setField(term3394, term3394.getClass(), "time", term3399);
        setField(term3365, term3365.getClass(), "hireDate", term3394);
        setField(term3365, term3365.getClass(), "sal", term3404);
        setField(term3365, term3365.getClass(), "comm", term3406);
        setField(term3408, term3408.getClass(), "deptno", term3409);
        setField(term3408, term3408.getClass(), "dname", "EkgprvqZlM");
        setField(term3408, term3408.getClass(), "loc", "fbnKvthhOz");
        setField(term3408, term3408.getClass(), "employees", term3435);
        setField(term3365, term3365.getClass(), "department", term3408);
        setField(term3441, term3441.getClass(), "id", term3442);
        setField(term3441, term3441.getClass(), "username", "HqoTWlkbwF");
        setField(term3441, term3441.getClass(), "password", "CwNELDTAPP");
        setField(term3441, term3441.getClass(), "enabled", term3468);
        setField(term3441, term3441.getClass(), "email", "GSzQdbHLHw");
        setField(term3441, term3441.getClass(), "phone", "IkfarsYNJO");
        setField(term3441, term3441.getClass(), "role", "aZKOWhHMEh");
        setField(term3506, term3506.getClass(), "empno", term3507);
        setField(term3506, term3506.getClass(), "ename", "");
        setField(term3506, term3506.getClass(), "job", "");
        setField(term3506, term3506.getClass(), "mgr", term3511);
        setField(term3513, term3513.getClass(), "date", null);
        setField(term3513, term3513.getClass(), "time", null);
        setField(term3506, term3506.getClass(), "hireDate", term3513);
        setField(term3506, term3506.getClass(), "sal", term3514);
        setField(term3506, term3506.getClass(), "comm", term3516);
        setField(term3518, term3518.getClass(), "deptno", null);
        setField(term3518, term3518.getClass(), "dname", null);
        setField(term3518, term3518.getClass(), "loc", null);
        setField(term3518, term3518.getClass(), "employees", null);
        setField(term3506, term3506.getClass(), "department", term3518);
        setField(term3519, term3519.getClass(), "id", null);
        setField(term3519, term3519.getClass(), "username", null);
        setField(term3519, term3519.getClass(), "password", null);
        setField(term3519, term3519.getClass(), "enabled", null);
        setField(term3519, term3519.getClass(), "email", null);
        setField(term3519, term3519.getClass(), "phone", null);
        setField(term3519, term3519.getClass(), "role", null);
        setField(term3519, term3519.getClass(), "employee", null);
        setField(term3506, term3506.getClass(), "userCredential", term3519);
        setField(term3441, term3441.getClass(), "employee", term3506);
        setField(term3365, term3365.getClass(), "userCredential", term3441);
        setField(term3300, term3300.getClass(), "employee", term3365);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.selimhorri.app.pack.models.entities.UserCredential");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRole", argTypes, term3300, args);
    }

};


