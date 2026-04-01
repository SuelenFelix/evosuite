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

public class Employee_setHireDate_127111017012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8714;
     Object term8857;

    public Employee_setHireDate_127111017012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term8715 = new Integer(-1242946317);
        Integer term8741 = new Integer(-1541566235);
        Double term8753 = new Double(0.6259114447412901);
        Double term8755 = new Double(0.5795537811016872);
        Integer term8758 = new Integer(-189738995);
        HashMap term8785 = new HashMap();
        Set<Object> term8907 =  ((Map) term8785).keySet();
        HashSet term8784 = new HashSet((Collection<? extends Object>) term8907);
        Integer term8792 = new Integer(-679614653);
        Boolean term8818 = new Boolean(true);
        term8714 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Employee"));
        Object term8743 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8744 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8748 = newInstance(Class.forName("java.time.LocalTime"));
        Object term8757 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Department"));
        Object term8791 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.UserCredential"));
        Object term8856 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Employee"));
        setField(term8714, term8714.getClass(), "empno", term8715);
        setField(term8714, term8714.getClass(), "ename", "fhdhDeWdoi");
        setField(term8714, term8714.getClass(), "job", "FqrcltWSUd");
        setField(term8714, term8714.getClass(), "mgr", term8741);
        setIntField(term8744, term8744.getClass(), "year", 2022);
        setShortField(term8744, term8744.getClass(), "month", (short) 7);
        setShortField(term8744, term8744.getClass(), "day", (short) 9);
        setField(term8743, term8743.getClass(), "date", term8744);
        setByteField(term8748, term8748.getClass(), "hour", (byte) 21);
        setByteField(term8748, term8748.getClass(), "minute", (byte) 48);
        setByteField(term8748, term8748.getClass(), "second", (byte) 58);
        setIntField(term8748, term8748.getClass(), "nano", 579553780);
        setField(term8743, term8743.getClass(), "time", term8748);
        setField(term8714, term8714.getClass(), "hireDate", term8743);
        setField(term8714, term8714.getClass(), "sal", term8753);
        setField(term8714, term8714.getClass(), "comm", term8755);
        setField(term8757, term8757.getClass(), "deptno", term8758);
        setField(term8757, term8757.getClass(), "dname", "kAbILlhsZw");
        setField(term8757, term8757.getClass(), "loc", "QsIOCSpRow");
        setField(term8757, term8757.getClass(), "employees", term8784);
        setField(term8714, term8714.getClass(), "department", term8757);
        setField(term8791, term8791.getClass(), "id", term8792);
        setField(term8791, term8791.getClass(), "username", "PvtJhtGffh");
        setField(term8791, term8791.getClass(), "password", "KReGJTSQuY");
        setField(term8791, term8791.getClass(), "enabled", term8818);
        setField(term8791, term8791.getClass(), "email", "hqZmoXoMuS");
        setField(term8791, term8791.getClass(), "phone", "PUPJWadLXP");
        setField(term8791, term8791.getClass(), "role", "TBNsemBBKA");
        setField(term8856, term8856.getClass(), "empno", null);
        setField(term8856, term8856.getClass(), "ename", null);
        setField(term8856, term8856.getClass(), "job", null);
        setField(term8856, term8856.getClass(), "mgr", null);
        setField(term8856, term8856.getClass(), "hireDate", null);
        setField(term8856, term8856.getClass(), "sal", null);
        setField(term8856, term8856.getClass(), "comm", null);
        setField(term8856, term8856.getClass(), "department", null);
        setField(term8856, term8856.getClass(), "userCredential", null);
        setField(term8791, term8791.getClass(), "employee", term8856);
        setField(term8714, term8714.getClass(), "userCredential", term8791);
        term8857 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8858 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8862 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term8858, term8858.getClass(), "year", 2021);
        setShortField(term8858, term8858.getClass(), "month", (short) 11);
        setShortField(term8858, term8858.getClass(), "day", (short) 19);
        setField(term8857, term8857.getClass(), "date", term8858);
        setByteField(term8862, term8862.getClass(), "hour", (byte) 4);
        setByteField(term8862, term8862.getClass(), "minute", (byte) 39);
        setByteField(term8862, term8862.getClass(), "second", (byte) 43);
        setIntField(term8862, term8862.getClass(), "nano", 638695514);
        setField(term8857, term8857.getClass(), "time", term8862);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.selimhorri.app.pack.models.entities.Employee");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term8857;
        callMethod(klass, "setHireDate", argTypes, term8714, args);
    }

};


