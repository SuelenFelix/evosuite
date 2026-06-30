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

public class UserCredential_getEmployee_54950020714 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4050;

    public UserCredential_getEmployee_54950020714() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term4051 = new Integer(-100825168);
        Boolean term4077 = new Boolean(false);
        Integer term4116 = new Integer(768407648);
        Integer term4142 = new Integer(-350454594);
        Double term4154 = new Double(0.47210750955444725);
        Double term4156 = new Double(0.8381176594884352);
        Integer term4159 = new Integer(-1148142995);
        HashMap term4186 = new HashMap();
        Set<Object> term4282 =  ((Map) term4186).keySet();
        HashSet term4185 = new HashSet((Collection<? extends Object>) term4282);
        term4050 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.UserCredential"));
        Object term4115 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Employee"));
        Object term4144 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4145 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4149 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4158 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Department"));
        Object term4191 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.UserCredential"));
        setField(term4050, term4050.getClass(), "id", term4051);
        setField(term4050, term4050.getClass(), "username", "UEdzEKEEEV");
        setField(term4050, term4050.getClass(), "password", "BcENaQFYSd");
        setField(term4050, term4050.getClass(), "enabled", term4077);
        setField(term4050, term4050.getClass(), "email", "POPYycoDBy");
        setField(term4050, term4050.getClass(), "phone", "LuWMOXdAPA");
        setField(term4050, term4050.getClass(), "role", "blSffTnsOv");
        setField(term4115, term4115.getClass(), "empno", term4116);
        setField(term4115, term4115.getClass(), "ename", "qbUMcIvEXH");
        setField(term4115, term4115.getClass(), "job", "TVxGTjeDcu");
        setField(term4115, term4115.getClass(), "mgr", term4142);
        setIntField(term4145, term4145.getClass(), "year", 2019);
        setShortField(term4145, term4145.getClass(), "month", (short) 6);
        setShortField(term4145, term4145.getClass(), "day", (short) 12);
        setField(term4144, term4144.getClass(), "date", term4145);
        setByteField(term4149, term4149.getClass(), "hour", (byte) 5);
        setByteField(term4149, term4149.getClass(), "minute", (byte) 13);
        setByteField(term4149, term4149.getClass(), "second", (byte) 8);
        setIntField(term4149, term4149.getClass(), "nano", 838117658);
        setField(term4144, term4144.getClass(), "time", term4149);
        setField(term4115, term4115.getClass(), "hireDate", term4144);
        setField(term4115, term4115.getClass(), "sal", term4154);
        setField(term4115, term4115.getClass(), "comm", term4156);
        setField(term4158, term4158.getClass(), "deptno", term4159);
        setField(term4158, term4158.getClass(), "dname", "ABPtcyCzkR");
        setField(term4158, term4158.getClass(), "loc", "QgHhxMyKvr");
        setField(term4158, term4158.getClass(), "employees", term4185);
        setField(term4115, term4115.getClass(), "department", term4158);
        setField(term4191, term4191.getClass(), "id", null);
        setField(term4191, term4191.getClass(), "username", null);
        setField(term4191, term4191.getClass(), "password", null);
        setField(term4191, term4191.getClass(), "enabled", null);
        setField(term4191, term4191.getClass(), "email", null);
        setField(term4191, term4191.getClass(), "phone", null);
        setField(term4191, term4191.getClass(), "role", null);
        setField(term4191, term4191.getClass(), "employee", null);
        setField(term4115, term4115.getClass(), "userCredential", term4191);
        setField(term4050, term4050.getClass(), "employee", term4115);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.selimhorri.app.pack.models.entities.UserCredential");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmployee", argTypes, term4050, args);
    }

};


