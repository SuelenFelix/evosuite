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

public class EmployeeDetailDto_setCreatedDate_3835799437 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3527;
     Object term3611;

    public EmployeeDetailDto_setCreatedDate_3835799437() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3527 = newInstance(Class.forName("ru.smartup.timetracker.dto.employee.response.EmployeeDetailDto"));
        Object term3528 = newInstance(Class.forName("ru.smartup.timetracker.dto.position.response.PositionDto"));
        Object term3544 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term3547 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term3550 = newInstance(Class.forName("java.util.ImmutableCollections$MapN"));
        Object[] term3551 = (Object[]) newArray("java.lang.Object", 0);
        Object term3553 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term3556 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term3609 = newInstance(Class.forName("java.util.ImmutableCollections$ListN"));
        Object[] term3610 = (Object[]) newArray("java.lang.Object", 0);
        setIntField(term3528, term3528.getClass(), "id", -73683645);
        setField(term3528, term3528.getClass(), "name", "sEnIVFtZuQ");
        setFloatField(term3528, term3528.getClass(), "externalRate", 0.5254275F);
        setBooleanField(term3528, term3528.getClass(), "isArchived", true);
        setIntField(term3544, term3544.getClass(), "nanos", 759000000);
        setLongField(term3544, term3544.getClass(), "fastTime", 1630941844000L);
        setField(term3544, term3544.getClass(), "cdate", null);
        setField(term3528, term3528.getClass(), "createdDate", term3544);
        setIntField(term3547, term3547.getClass(), "nanos", 956000000);
        setLongField(term3547, term3547.getClass(), "fastTime", 1739406992000L);
        setField(term3547, term3547.getClass(), "cdate", null);
        setField(term3528, term3528.getClass(), "lastModifiedDate", term3547);
        setField(term3527, term3527.getClass(), "position", term3528);
        setField(term3550, term3550.getClass(), "table", term3551);
        setIntField(term3550, term3550.getClass(), "size", 0);
        setField(term3550, term3550.getClass(), "keySet", null);
        setField(term3550, term3550.getClass(), "values", null);
        setField(term3527, term3527.getClass(), "projectRoles", term3550);
        setIntField(term3553, term3553.getClass(), "nanos", 573000000);
        setLongField(term3553, term3553.getClass(), "fastTime", 1329629467000L);
        setField(term3553, term3553.getClass(), "cdate", null);
        setField(term3527, term3527.getClass(), "createdDate", term3553);
        setIntField(term3556, term3556.getClass(), "nanos", 718000000);
        setLongField(term3556, term3556.getClass(), "fastTime", 1334842304000L);
        setField(term3556, term3556.getClass(), "cdate", null);
        setField(term3527, term3527.getClass(), "lastModifiedDate", term3556);
        setIntField(term3527, term3527.getClass(), "id", -226514366);
        setField(term3527, term3527.getClass(), "firstName", "ZVecLZMLHF");
        setField(term3527, term3527.getClass(), "middleName", "fztQhjqwdP");
        setField(term3527, term3527.getClass(), "lastName", "eVpkWxjuki");
        setField(term3527, term3527.getClass(), "email", "SJiQaLvSKv");
        setBooleanField(term3527, term3527.getClass(), "isArchived", true);
        setField(term3609, term3609.getClass(), "elements", term3610);
        setField(term3527, term3527.getClass(), "roles", term3609);
        term3611 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term3611, term3611.getClass(), "nanos", 764000000);
        setLongField(term3611, term3611.getClass(), "fastTime", 1496849028000L);
        setField(term3611, term3611.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.employee.response.EmployeeDetailDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.sql.Timestamp");
        Object[] args = new Object[1];
        args[0] = term3611;
        callMethod(klass, "setCreatedDate", argTypes, term3527, args);
    }

};


