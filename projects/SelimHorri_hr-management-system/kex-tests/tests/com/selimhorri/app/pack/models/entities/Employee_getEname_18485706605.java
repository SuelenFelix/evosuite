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

public class Employee_getEname_18485706605 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6714;

    public Employee_getEname_18485706605() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term6715 = new Integer(1778570695);
        Integer term6741 = new Integer(-1142164411);
        Double term6753 = new Double(0.21883508391220008);
        Double term6755 = new Double(0.21718677136334108);
        Integer term6758 = new Integer(-1619435313);
        HashMap term6785 = new HashMap();
        Set<Object> term6897 =  ((Map) term6785).keySet();
        HashSet term6784 = new HashSet((Collection<? extends Object>) term6897);
        Integer term6792 = new Integer(469871899);
        Boolean term6818 = new Boolean(false);
        term6714 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Employee"));
        Object term6743 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6744 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6748 = newInstance(Class.forName("java.time.LocalTime"));
        Object term6757 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Department"));
        Object term6791 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.UserCredential"));
        Object term6856 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Employee"));
        setField(term6714, term6714.getClass(), "empno", term6715);
        setField(term6714, term6714.getClass(), "ename", "hHNIOlOzJc");
        setField(term6714, term6714.getClass(), "job", "ALRSeULyWV");
        setField(term6714, term6714.getClass(), "mgr", term6741);
        setIntField(term6744, term6744.getClass(), "year", 2014);
        setShortField(term6744, term6744.getClass(), "month", (short) 5);
        setShortField(term6744, term6744.getClass(), "day", (short) 18);
        setField(term6743, term6743.getClass(), "date", term6744);
        setByteField(term6748, term6748.getClass(), "hour", (byte) 19);
        setByteField(term6748, term6748.getClass(), "minute", (byte) 25);
        setByteField(term6748, term6748.getClass(), "second", (byte) 8);
        setIntField(term6748, term6748.getClass(), "nano", 217186771);
        setField(term6743, term6743.getClass(), "time", term6748);
        setField(term6714, term6714.getClass(), "hireDate", term6743);
        setField(term6714, term6714.getClass(), "sal", term6753);
        setField(term6714, term6714.getClass(), "comm", term6755);
        setField(term6757, term6757.getClass(), "deptno", term6758);
        setField(term6757, term6757.getClass(), "dname", "WVhzXHdyFF");
        setField(term6757, term6757.getClass(), "loc", "GLAWYoxkyw");
        setField(term6757, term6757.getClass(), "employees", term6784);
        setField(term6714, term6714.getClass(), "department", term6757);
        setField(term6791, term6791.getClass(), "id", term6792);
        setField(term6791, term6791.getClass(), "username", "ohZpRiNDZM");
        setField(term6791, term6791.getClass(), "password", "qEXIxhmUwz");
        setField(term6791, term6791.getClass(), "enabled", term6818);
        setField(term6791, term6791.getClass(), "email", "RlyxtfCqKY");
        setField(term6791, term6791.getClass(), "phone", "kyTUkLCRYm");
        setField(term6791, term6791.getClass(), "role", "oAotZgNUFH");
        setField(term6856, term6856.getClass(), "empno", null);
        setField(term6856, term6856.getClass(), "ename", null);
        setField(term6856, term6856.getClass(), "job", null);
        setField(term6856, term6856.getClass(), "mgr", null);
        setField(term6856, term6856.getClass(), "hireDate", null);
        setField(term6856, term6856.getClass(), "sal", null);
        setField(term6856, term6856.getClass(), "comm", null);
        setField(term6856, term6856.getClass(), "department", null);
        setField(term6856, term6856.getClass(), "userCredential", null);
        setField(term6791, term6791.getClass(), "employee", term6856);
        setField(term6714, term6714.getClass(), "userCredential", term6791);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.selimhorri.app.pack.models.entities.Employee");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEname", argTypes, term6714, args);
    }

};


