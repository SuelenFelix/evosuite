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

public class UserCredential_setEmployee_177113211515 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4283;
     Object term4425;

    public UserCredential_setEmployee_177113211515() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term4284 = new Integer(787278105);
        Boolean term4310 = new Boolean(false);
        Integer term4349 = new Integer(-2063843486);
        Integer term4375 = new Integer(833762980);
        Double term4387 = new Double(0.9678135126533798);
        Double term4389 = new Double(0.3275035827937727);
        Integer term4392 = new Integer(320711637);
        HashMap term4419 = new HashMap();
        Set<Object> term4658 =  ((Map) term4419).keySet();
        HashSet term4418 = new HashSet((Collection<? extends Object>) term4658);
        term4283 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.UserCredential"));
        Object term4348 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Employee"));
        Object term4377 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4378 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4382 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4391 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Department"));
        Object term4424 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.UserCredential"));
        setField(term4283, term4283.getClass(), "id", term4284);
        setField(term4283, term4283.getClass(), "username", "gXFNBHJSey");
        setField(term4283, term4283.getClass(), "password", "wUcSfItZgv");
        setField(term4283, term4283.getClass(), "enabled", term4310);
        setField(term4283, term4283.getClass(), "email", "rOfPCPHmtJ");
        setField(term4283, term4283.getClass(), "phone", "EnmiAvfpJv");
        setField(term4283, term4283.getClass(), "role", "AdYzLPMcwe");
        setField(term4348, term4348.getClass(), "empno", term4349);
        setField(term4348, term4348.getClass(), "ename", "FrTZLybkKk");
        setField(term4348, term4348.getClass(), "job", "FlxVmiMYKP");
        setField(term4348, term4348.getClass(), "mgr", term4375);
        setIntField(term4378, term4378.getClass(), "year", 2029);
        setShortField(term4378, term4378.getClass(), "month", (short) 5);
        setShortField(term4378, term4378.getClass(), "day", (short) 11);
        setField(term4377, term4377.getClass(), "date", term4378);
        setByteField(term4382, term4382.getClass(), "hour", (byte) 20);
        setByteField(term4382, term4382.getClass(), "minute", (byte) 17);
        setByteField(term4382, term4382.getClass(), "second", (byte) 32);
        setIntField(term4382, term4382.getClass(), "nano", 327503582);
        setField(term4377, term4377.getClass(), "time", term4382);
        setField(term4348, term4348.getClass(), "hireDate", term4377);
        setField(term4348, term4348.getClass(), "sal", term4387);
        setField(term4348, term4348.getClass(), "comm", term4389);
        setField(term4391, term4391.getClass(), "deptno", term4392);
        setField(term4391, term4391.getClass(), "dname", "fgOpAWlGYN");
        setField(term4391, term4391.getClass(), "loc", "PNzNzzjSXM");
        setField(term4391, term4391.getClass(), "employees", term4418);
        setField(term4348, term4348.getClass(), "department", term4391);
        setField(term4424, term4424.getClass(), "id", null);
        setField(term4424, term4424.getClass(), "username", null);
        setField(term4424, term4424.getClass(), "password", null);
        setField(term4424, term4424.getClass(), "enabled", null);
        setField(term4424, term4424.getClass(), "email", null);
        setField(term4424, term4424.getClass(), "phone", null);
        setField(term4424, term4424.getClass(), "role", null);
        setField(term4424, term4424.getClass(), "employee", null);
        setField(term4348, term4348.getClass(), "userCredential", term4424);
        setField(term4283, term4283.getClass(), "employee", term4348);
        Integer term4426 = new Integer(464181937);
        Integer term4452 = new Integer(-1455526612);
        Double term4464 = new Double(0.2542403704113868);
        Double term4466 = new Double(0.4614378239284842);
        Integer term4469 = new Integer(-941356098);
        HashMap term4496 = new HashMap();
        Set<Object> term4699 =  ((Map) term4496).keySet();
        HashSet term4495 = new HashSet((Collection<? extends Object>) term4699);
        Integer term4503 = new Integer(-645429025);
        Boolean term4529 = new Boolean(false);
        term4425 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Employee"));
        Object term4454 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4455 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4459 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4468 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Department"));
        Object term4502 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.UserCredential"));
        Object term4567 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Employee"));
        setField(term4425, term4425.getClass(), "empno", term4426);
        setField(term4425, term4425.getClass(), "ename", "GuwJLKquuI");
        setField(term4425, term4425.getClass(), "job", "vYMCjgnztg");
        setField(term4425, term4425.getClass(), "mgr", term4452);
        setIntField(term4455, term4455.getClass(), "year", 2015);
        setShortField(term4455, term4455.getClass(), "month", (short) 2);
        setShortField(term4455, term4455.getClass(), "day", (short) 1);
        setField(term4454, term4454.getClass(), "date", term4455);
        setByteField(term4459, term4459.getClass(), "hour", (byte) 11);
        setByteField(term4459, term4459.getClass(), "minute", (byte) 31);
        setByteField(term4459, term4459.getClass(), "second", (byte) 24);
        setIntField(term4459, term4459.getClass(), "nano", 461437823);
        setField(term4454, term4454.getClass(), "time", term4459);
        setField(term4425, term4425.getClass(), "hireDate", term4454);
        setField(term4425, term4425.getClass(), "sal", term4464);
        setField(term4425, term4425.getClass(), "comm", term4466);
        setField(term4468, term4468.getClass(), "deptno", term4469);
        setField(term4468, term4468.getClass(), "dname", "YupgKTSEiI");
        setField(term4468, term4468.getClass(), "loc", "HuOUlaFmvJ");
        setField(term4468, term4468.getClass(), "employees", term4495);
        setField(term4425, term4425.getClass(), "department", term4468);
        setField(term4502, term4502.getClass(), "id", term4503);
        setField(term4502, term4502.getClass(), "username", "uMsWXqNhln");
        setField(term4502, term4502.getClass(), "password", "MAnhIPOtHL");
        setField(term4502, term4502.getClass(), "enabled", term4529);
        setField(term4502, term4502.getClass(), "email", "dikKjYjmRO");
        setField(term4502, term4502.getClass(), "phone", "GJnnMDVnEP");
        setField(term4502, term4502.getClass(), "role", "zSMVllDpfk");
        setField(term4567, term4567.getClass(), "empno", null);
        setField(term4567, term4567.getClass(), "ename", null);
        setField(term4567, term4567.getClass(), "job", null);
        setField(term4567, term4567.getClass(), "mgr", null);
        setField(term4567, term4567.getClass(), "hireDate", null);
        setField(term4567, term4567.getClass(), "sal", null);
        setField(term4567, term4567.getClass(), "comm", null);
        setField(term4567, term4567.getClass(), "department", null);
        setField(term4567, term4567.getClass(), "userCredential", null);
        setField(term4502, term4502.getClass(), "employee", term4567);
        setField(term4425, term4425.getClass(), "userCredential", term4502);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.selimhorri.app.pack.models.entities.UserCredential");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.selimhorri.app.pack.models.entities.Employee");
        Object[] args = new Object[1];
        args[0] = term4425;
        callMethod(klass, "setEmployee", argTypes, term4283, args);
    }

};


