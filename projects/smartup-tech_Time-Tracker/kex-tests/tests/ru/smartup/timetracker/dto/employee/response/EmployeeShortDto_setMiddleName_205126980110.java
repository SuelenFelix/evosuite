package ru.smartup.timetracker.dto.employee.response;

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
import static ru.smartup.timetracker.dto.employee.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class EmployeeShortDto_setMiddleName_205126980110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term862;

    public EmployeeShortDto_setMiddleName_205126980110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term862 = newInstance(Class.forName("ru.smartup.timetracker.dto.employee.response.EmployeeShortDto"));
        Object term913 = newInstance(Class.forName("java.util.ImmutableCollections$ListN"));
        Object[] term914 = (Object[]) newArray("java.lang.Object", 0);
        setIntField(term862, term862.getClass(), "id", 1725571209);
        setField(term862, term862.getClass(), "firstName", "IDCWpPLRkE");
        setField(term862, term862.getClass(), "middleName", "nyiiPDVjAc");
        setField(term862, term862.getClass(), "lastName", "aKnKipADSo");
        setField(term862, term862.getClass(), "email", "wSQxaModmm");
        setBooleanField(term862, term862.getClass(), "isArchived", true);
        setField(term913, term913.getClass(), "elements", term914);
        setField(term862, term862.getClass(), "roles", term913);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.employee.response.EmployeeShortDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "UlajhuVLaP";
        callMethod(klass, "setMiddleName", argTypes, term862, args);
    }

};


