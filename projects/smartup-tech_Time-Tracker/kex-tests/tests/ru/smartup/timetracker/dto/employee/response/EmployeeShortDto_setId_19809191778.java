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
import java.lang.Integer;

public class EmployeeShortDto_setId_19809191778 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term652;
     Object term705;

    public EmployeeShortDto_setId_19809191778() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term652 = newInstance(Class.forName("ru.smartup.timetracker.dto.employee.response.EmployeeShortDto"));
        Object term703 = newInstance(Class.forName("java.util.ImmutableCollections$ListN"));
        Object[] term704 = (Object[]) newArray("java.lang.Object", 0);
        setIntField(term652, term652.getClass(), "id", -2038273078);
        setField(term652, term652.getClass(), "firstName", "IoAlmYsBwc");
        setField(term652, term652.getClass(), "middleName", "TEParAifyi");
        setField(term652, term652.getClass(), "lastName", "OWDIEULEFu");
        setField(term652, term652.getClass(), "email", "dWRymuLBtr");
        setBooleanField(term652, term652.getClass(), "isArchived", true);
        setField(term703, term703.getClass(), "elements", term704);
        setField(term652, term652.getClass(), "roles", term703);
        term705 = new Integer(1227103734);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.employee.response.EmployeeShortDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term705;
        callMethod(klass, "setId", argTypes, term652, args);
    }

};


