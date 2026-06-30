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

public class UserCredential_setEmail_20391188609 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2557;

    public UserCredential_setEmail_20391188609() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2558 = new Integer(-1022990421);
        Boolean term2584 = new Boolean(true);
        Integer term2623 = new Integer(1045547089);
        Integer term2649 = new Integer(-1122880881);
        Double term2661 = new Double(0.06480976831423468);
        Double term2663 = new Double(0.8490790645379176);
        Integer term2666 = new Integer(-542712742);
        HashMap term2693 = new HashMap();
        Set<Object> term2801 =  ((Map) term2693).keySet();
        HashSet term2692 = new HashSet((Collection<? extends Object>) term2801);
        term2557 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.UserCredential"));
        Object term2622 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Employee"));
        Object term2651 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2652 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2656 = newInstance(Class.forName("java.time.LocalTime"));
        Object term2665 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Department"));
        Object term2698 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.UserCredential"));
        setField(term2557, term2557.getClass(), "id", term2558);
        setField(term2557, term2557.getClass(), "username", "cdHYQDgUZR");
        setField(term2557, term2557.getClass(), "password", "KAORSSPSeV");
        setField(term2557, term2557.getClass(), "enabled", term2584);
        setField(term2557, term2557.getClass(), "email", "UimMMORkzd");
        setField(term2557, term2557.getClass(), "phone", "huVIXUWLtI");
        setField(term2557, term2557.getClass(), "role", "vhKzFyKPOT");
        setField(term2622, term2622.getClass(), "empno", term2623);
        setField(term2622, term2622.getClass(), "ename", "nQhIgWXdRc");
        setField(term2622, term2622.getClass(), "job", "EusenEbIoF");
        setField(term2622, term2622.getClass(), "mgr", term2649);
        setIntField(term2652, term2652.getClass(), "year", 2011);
        setShortField(term2652, term2652.getClass(), "month", (short) 4);
        setShortField(term2652, term2652.getClass(), "day", (short) 19);
        setField(term2651, term2651.getClass(), "date", term2652);
        setByteField(term2656, term2656.getClass(), "hour", (byte) 12);
        setByteField(term2656, term2656.getClass(), "minute", (byte) 0);
        setByteField(term2656, term2656.getClass(), "second", (byte) 14);
        setIntField(term2656, term2656.getClass(), "nano", 849079063);
        setField(term2651, term2651.getClass(), "time", term2656);
        setField(term2622, term2622.getClass(), "hireDate", term2651);
        setField(term2622, term2622.getClass(), "sal", term2661);
        setField(term2622, term2622.getClass(), "comm", term2663);
        setField(term2665, term2665.getClass(), "deptno", term2666);
        setField(term2665, term2665.getClass(), "dname", "SScVQYSvWH");
        setField(term2665, term2665.getClass(), "loc", "MnovcqFhCl");
        setField(term2665, term2665.getClass(), "employees", term2692);
        setField(term2622, term2622.getClass(), "department", term2665);
        setField(term2698, term2698.getClass(), "id", null);
        setField(term2698, term2698.getClass(), "username", null);
        setField(term2698, term2698.getClass(), "password", null);
        setField(term2698, term2698.getClass(), "enabled", null);
        setField(term2698, term2698.getClass(), "email", null);
        setField(term2698, term2698.getClass(), "phone", null);
        setField(term2698, term2698.getClass(), "role", null);
        setField(term2698, term2698.getClass(), "employee", null);
        setField(term2622, term2622.getClass(), "userCredential", term2698);
        setField(term2557, term2557.getClass(), "employee", term2622);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.selimhorri.app.pack.models.entities.UserCredential");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "tKmrUDURku";
        callMethod(klass, "setEmail", argTypes, term2557, args);
    }

};


