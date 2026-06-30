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

public class UserCredential_setRole_147617998613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3661;

    public UserCredential_setRole_147617998613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3662 = new Integer(-1268314569);
        Boolean term3688 = new Boolean(false);
        Integer term3727 = new Integer(877649659);
        Integer term3753 = new Integer(-1332748804);
        Double term3765 = new Double(0.8223115496053149);
        Double term3767 = new Double(0.06795505641704636);
        Integer term3770 = new Integer(1774507971);
        HashMap term3797 = new HashMap();
        Set<Object> term3989 =  ((Map) term3797).keySet();
        HashSet term3796 = new HashSet((Collection<? extends Object>) term3989);
        Integer term3803 = new Integer(-1420269858);
        Boolean term3829 = new Boolean(false);
        Integer term3868 = new Integer(-2119545015);
        Integer term3872 = new Integer(1272542218);
        Double term3875 = new Double(0.198746516614277);
        Double term3877 = new Double(0.16852568658760048);
        Integer term3880 = new Integer(1209799204);
        Integer term3883 = new Integer(-938508470);
        Boolean term3885 = new Boolean(true);
        term3661 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.UserCredential"));
        Object term3726 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Employee"));
        Object term3755 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3756 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3760 = newInstance(Class.forName("java.time.LocalTime"));
        Object term3769 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Department"));
        Object term3802 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.UserCredential"));
        Object term3867 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Employee"));
        Object term3874 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3879 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Department"));
        Object term3882 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.UserCredential"));
        setField(term3661, term3661.getClass(), "id", term3662);
        setField(term3661, term3661.getClass(), "username", "FIdNVptZpW");
        setField(term3661, term3661.getClass(), "password", "rQjxAhisjm");
        setField(term3661, term3661.getClass(), "enabled", term3688);
        setField(term3661, term3661.getClass(), "email", "ZDhASPHjDG");
        setField(term3661, term3661.getClass(), "phone", "HNVOAXYNEZ");
        setField(term3661, term3661.getClass(), "role", "gbbYBYyfvr");
        setField(term3726, term3726.getClass(), "empno", term3727);
        setField(term3726, term3726.getClass(), "ename", "SrWMUlbtWV");
        setField(term3726, term3726.getClass(), "job", "VePIumgrrU");
        setField(term3726, term3726.getClass(), "mgr", term3753);
        setIntField(term3756, term3756.getClass(), "year", 2026);
        setShortField(term3756, term3756.getClass(), "month", (short) 6);
        setShortField(term3756, term3756.getClass(), "day", (short) 13);
        setField(term3755, term3755.getClass(), "date", term3756);
        setByteField(term3760, term3760.getClass(), "hour", (byte) 19);
        setByteField(term3760, term3760.getClass(), "minute", (byte) 23);
        setByteField(term3760, term3760.getClass(), "second", (byte) 46);
        setIntField(term3760, term3760.getClass(), "nano", 67955056);
        setField(term3755, term3755.getClass(), "time", term3760);
        setField(term3726, term3726.getClass(), "hireDate", term3755);
        setField(term3726, term3726.getClass(), "sal", term3765);
        setField(term3726, term3726.getClass(), "comm", term3767);
        setField(term3769, term3769.getClass(), "deptno", term3770);
        setField(term3769, term3769.getClass(), "dname", "DPwIqlszZo");
        setField(term3769, term3769.getClass(), "loc", "mNgDshwZNc");
        setField(term3769, term3769.getClass(), "employees", term3796);
        setField(term3726, term3726.getClass(), "department", term3769);
        setField(term3802, term3802.getClass(), "id", term3803);
        setField(term3802, term3802.getClass(), "username", "pDqgDbJoFw");
        setField(term3802, term3802.getClass(), "password", "iVOvTzOxwt");
        setField(term3802, term3802.getClass(), "enabled", term3829);
        setField(term3802, term3802.getClass(), "email", "BjZQdecXvB");
        setField(term3802, term3802.getClass(), "phone", "iUkOOQhEkw");
        setField(term3802, term3802.getClass(), "role", "wmVoFoUVmU");
        setField(term3867, term3867.getClass(), "empno", term3868);
        setField(term3867, term3867.getClass(), "ename", "");
        setField(term3867, term3867.getClass(), "job", "");
        setField(term3867, term3867.getClass(), "mgr", term3872);
        setField(term3874, term3874.getClass(), "date", null);
        setField(term3874, term3874.getClass(), "time", null);
        setField(term3867, term3867.getClass(), "hireDate", term3874);
        setField(term3867, term3867.getClass(), "sal", term3875);
        setField(term3867, term3867.getClass(), "comm", term3877);
        setField(term3879, term3879.getClass(), "deptno", term3880);
        setField(term3879, term3879.getClass(), "dname", null);
        setField(term3879, term3879.getClass(), "loc", null);
        setField(term3879, term3879.getClass(), "employees", null);
        setField(term3867, term3867.getClass(), "department", term3879);
        setField(term3882, term3882.getClass(), "id", term3883);
        setField(term3882, term3882.getClass(), "username", null);
        setField(term3882, term3882.getClass(), "password", null);
        setField(term3882, term3882.getClass(), "enabled", term3885);
        setField(term3882, term3882.getClass(), "email", null);
        setField(term3882, term3882.getClass(), "phone", null);
        setField(term3882, term3882.getClass(), "role", null);
        setField(term3882, term3882.getClass(), "employee", null);
        setField(term3867, term3867.getClass(), "userCredential", term3882);
        setField(term3802, term3802.getClass(), "employee", term3867);
        setField(term3726, term3726.getClass(), "userCredential", term3802);
        setField(term3661, term3661.getClass(), "employee", term3726);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.selimhorri.app.pack.models.entities.UserCredential");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "VuLLXpvPpZ";
        callMethod(klass, "setRole", argTypes, term3661, args);
    }

};


