package ru.smartup.timetracker.core;

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
import static ru.smartup.timetracker.core.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.Integer;

public class SessionEmployeePrincipal_isEmployeeOrManager_19169698048 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1985;
     Object term2013;

    public SessionEmployeePrincipal_isEmployeeOrManager_19169698048() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2000 = new HashMap();
        Set<Object> term2025 =  ((Map) term2000).keySet();
        HashSet term1999 = new HashSet((Collection<? extends Object>) term2025);
        HashMap term2008 = new HashMap();
        term1985 = newInstance(Class.forName("ru.smartup.timetracker.core.SessionEmployeePrincipal"));
        setIntField(term1985, term1985.getClass(), "id", 1048535127);
        setField(term1985, term1985.getClass(), "email", "uuaPigETmJ");
        setField(term1985, term1985.getClass(), "employeeRoles", term1999);
        setField(term1985, term1985.getClass(), "projectIdsByProjectRoles", term2008);
        term2013 = new Integer(-655067527);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.core.SessionEmployeePrincipal");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2013;
        callMethod(klass, "isEmployeeOrManager", argTypes, term1985, args);
    }

};


