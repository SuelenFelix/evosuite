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

public class EmployeeDetailDto_getPosition_7235354631 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2674;

    public EmployeeDetailDto_getPosition_7235354631() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2674 = newInstance(Class.forName("ru.smartup.timetracker.dto.employee.response.EmployeeDetailDto"));
        Object term2675 = newInstance(Class.forName("ru.smartup.timetracker.dto.position.response.PositionDto"));
        Object term2691 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term2694 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term2697 = newInstance(Class.forName("java.util.ImmutableCollections$MapN"));
        Object[] term2698 = (Object[]) newArray("java.lang.Object", 0);
        Object term2700 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term2703 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term2756 = newInstance(Class.forName("java.util.ImmutableCollections$ListN"));
        Object[] term2757 = (Object[]) newArray("java.lang.Object", 0);
        setIntField(term2675, term2675.getClass(), "id", 1048535127);
        setField(term2675, term2675.getClass(), "name", "oVgzLbrsFr");
        setFloatField(term2675, term2675.getClass(), "externalRate", 0.13238746F);
        setBooleanField(term2675, term2675.getClass(), "isArchived", false);
        setIntField(term2691, term2691.getClass(), "nanos", 244000000);
        setLongField(term2691, term2691.getClass(), "fastTime", 1345860612000L);
        setField(term2691, term2691.getClass(), "cdate", null);
        setField(term2675, term2675.getClass(), "createdDate", term2691);
        setIntField(term2694, term2694.getClass(), "nanos", 369000000);
        setLongField(term2694, term2694.getClass(), "fastTime", 1480427551000L);
        setField(term2694, term2694.getClass(), "cdate", null);
        setField(term2675, term2675.getClass(), "lastModifiedDate", term2694);
        setField(term2674, term2674.getClass(), "position", term2675);
        setField(term2697, term2697.getClass(), "table", term2698);
        setIntField(term2697, term2697.getClass(), "size", 0);
        setField(term2697, term2697.getClass(), "keySet", null);
        setField(term2697, term2697.getClass(), "values", null);
        setField(term2674, term2674.getClass(), "projectRoles", term2697);
        setIntField(term2700, term2700.getClass(), "nanos", 830000000);
        setLongField(term2700, term2700.getClass(), "fastTime", 1610929382000L);
        setField(term2700, term2700.getClass(), "cdate", null);
        setField(term2674, term2674.getClass(), "createdDate", term2700);
        setIntField(term2703, term2703.getClass(), "nanos", 837000000);
        setLongField(term2703, term2703.getClass(), "fastTime", 1606034835000L);
        setField(term2703, term2703.getClass(), "cdate", null);
        setField(term2674, term2674.getClass(), "lastModifiedDate", term2703);
        setIntField(term2674, term2674.getClass(), "id", -655067527);
        setField(term2674, term2674.getClass(), "firstName", "vQVyKLdtaz");
        setField(term2674, term2674.getClass(), "middleName", "OWKQODBLzb");
        setField(term2674, term2674.getClass(), "lastName", "wGmYcqUkgE");
        setField(term2674, term2674.getClass(), "email", "idgaQsnJpQ");
        setBooleanField(term2674, term2674.getClass(), "isArchived", true);
        setField(term2756, term2756.getClass(), "elements", term2757);
        setField(term2674, term2674.getClass(), "roles", term2756);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.employee.response.EmployeeDetailDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPosition", argTypes, term2674, args);
    }

};


