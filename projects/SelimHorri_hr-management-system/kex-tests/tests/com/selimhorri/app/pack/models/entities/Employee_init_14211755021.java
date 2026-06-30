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

public class Employee_init_14211755021 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5721;
     Object term5747;
     Object term5749;
     Object term5759;
     Object term5761;
     Object term5763;

    public Employee_init_14211755021() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5721 = new Integer(-75143033);
        term5747 = new Integer(797015478);
        term5749 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5750 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5754 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term5750, term5750.getClass(), "year", 2024);
        setShortField(term5750, term5750.getClass(), "month", (short) 3);
        setShortField(term5750, term5750.getClass(), "day", (short) 19);
        setField(term5749, term5749.getClass(), "date", term5750);
        setByteField(term5754, term5754.getClass(), "hour", (byte) 16);
        setByteField(term5754, term5754.getClass(), "minute", (byte) 8);
        setByteField(term5754, term5754.getClass(), "second", (byte) 55);
        setIntField(term5754, term5754.getClass(), "nano", 955822950);
        setField(term5749, term5749.getClass(), "time", term5754);
        term5759 = new Double(0.7106040066640994);
        term5761 = new Double(0.9558229513823179);
        Integer term5764 = new Integer(717574276);
        HashMap term5791 = new HashMap();
        Set<Object> term5843 =  ((Map) term5791).keySet();
        HashSet term5790 = new HashSet((Collection<? extends Object>) term5843);
        term5763 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Department"));
        setField(term5763, term5763.getClass(), "deptno", term5764);
        setField(term5763, term5763.getClass(), "dname", "qePuOCwoCf");
        setField(term5763, term5763.getClass(), "loc", "vJPujDInGq");
        setField(term5763, term5763.getClass(), "employees", term5790);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.selimhorri.app.pack.models.entities.Employee");
        Class<?>[] argTypes = new Class<?>[8];
        argTypes[0] = Class.forName("java.lang.Integer");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.Integer");
        argTypes[4] = Class.forName("java.time.LocalDateTime");
        argTypes[5] = Class.forName("java.lang.Double");
        argTypes[6] = Class.forName("java.lang.Double");
        argTypes[7] = Class.forName("com.selimhorri.app.pack.models.entities.Department");
        Object[] args = new Object[8];
        args[0] = term5721;
        args[1] = "yCWSlaOrSv";
        args[2] = "PFpWKxDIRz";
        args[3] = term5747;
        args[4] = term5749;
        args[5] = term5759;
        args[6] = term5761;
        args[7] = term5763;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


