package ru.smartup.timetracker.email.template.impl;

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
import static ru.smartup.timetracker.email.template.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class EmployeeRegistrationTemplate_getTemplate_15819655730 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1685;
     Object term1698;

    public EmployeeRegistrationTemplate_getTemplate_15819655730() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1685 = newInstance(Class.forName("ru.smartup.timetracker.email.template.impl.EmployeeRegistrationTemplate"));
        setField(term1685, term1685.getClass(), "registrationLink", "NRdvgJlhkX");
        Class<? extends Object> term1751 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.NoticeTypeEnum");
        Field term1750 = ((Class) term1751).getDeclaredField((String) "ADMIN_REMOVED");
        ((Field) term1750).setAccessible(true);
        Object enum3 = ((Field) term1750).get((Object) null);
        term1698 = newInstance(Class.forName("ru.smartup.timetracker.entity.Notice"));
        Object term1730 = newInstance(Class.forName("java.lang.Object"));
        Object term1734 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term1737 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term1698, term1698.getClass(), "id", 5270370404989704783L);
        setField(term1698, term1698.getClass(), "type", enum3);
        setIntField(term1698, term1698.getClass(), "employeeId", -1955890973);
        setField(term1698, term1698.getClass(), "text", "uuaPigETmJ");
        setField(term1698, term1698.getClass(), "data", term1730);
        setBooleanField(term1698, term1698.getClass(), "read", true);
        setBooleanField(term1698, term1698.getClass(), "deleted", true);
        setIntField(term1698, term1698.getClass(), "createdBy", -2038273078);
        setIntField(term1734, term1734.getClass(), "nanos", 389000000);
        setLongField(term1734, term1734.getClass(), "fastTime", 1429013051000L);
        setField(term1734, term1734.getClass(), "cdate", null);
        setField(term1698, term1698.getClass(), "createdDate", term1734);
        setIntField(term1737, term1737.getClass(), "nanos", 288000000);
        setLongField(term1737, term1737.getClass(), "fastTime", 1495346663000L);
        setField(term1737, term1737.getClass(), "cdate", null);
        setField(term1698, term1698.getClass(), "lastModifiedDate", term1737);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.email.template.impl.EmployeeRegistrationTemplate");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.smartup.timetracker.entity.Notice");
        Object[] args = new Object[1];
        args[0] = term1698;
        callMethod(klass, "getTemplate", argTypes, term1685, args);
    }

};


