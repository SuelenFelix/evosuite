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

public class EmployeeShortDto_setEmail_117966009712 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1092;

    public EmployeeShortDto_setEmail_117966009712() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1092 = newInstance(Class.forName("ru.smartup.timetracker.dto.employee.response.EmployeeShortDto"));
        Object term1143 = newInstance(Class.forName("java.util.ImmutableCollections$ListN"));
        Object[] term1144 = (Object[]) newArray("java.lang.Object", 0);
        setIntField(term1092, term1092.getClass(), "id", 1134449235);
        setField(term1092, term1092.getClass(), "firstName", "LvtrsXUliU");
        setField(term1092, term1092.getClass(), "middleName", "xLbjWUgOIL");
        setField(term1092, term1092.getClass(), "lastName", "jDtqGUpnZN");
        setField(term1092, term1092.getClass(), "email", "nGKItKLYNC");
        setBooleanField(term1092, term1092.getClass(), "isArchived", true);
        setField(term1143, term1143.getClass(), "elements", term1144);
        setField(term1092, term1092.getClass(), "roles", term1143);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.employee.response.EmployeeShortDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "UiUYnPrcCi";
        callMethod(klass, "setEmail", argTypes, term1092, args);
    }

};


