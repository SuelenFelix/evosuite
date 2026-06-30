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

public class EmployeeShortDto_canEqual_144806570516 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2336;
     Object term2389;

    public EmployeeShortDto_canEqual_144806570516() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2336 = newInstance(Class.forName("ru.smartup.timetracker.dto.employee.response.EmployeeShortDto"));
        Object term2387 = newInstance(Class.forName("java.util.ImmutableCollections$ListN"));
        Object[] term2388 = (Object[]) newArray("java.lang.Object", 0);
        setIntField(term2336, term2336.getClass(), "id", -1685132342);
        setField(term2336, term2336.getClass(), "firstName", "fhkbdRViHi");
        setField(term2336, term2336.getClass(), "middleName", "uWHnvSvaPl");
        setField(term2336, term2336.getClass(), "lastName", "kBdSllIBVz");
        setField(term2336, term2336.getClass(), "email", "TJmVBGfTML");
        setBooleanField(term2336, term2336.getClass(), "isArchived", true);
        setField(term2387, term2387.getClass(), "elements", term2388);
        setField(term2336, term2336.getClass(), "roles", term2387);
        term2389 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.employee.response.EmployeeShortDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term2389;
        callMethod(klass, "canEqual", argTypes, term2336, args);
    }

};


