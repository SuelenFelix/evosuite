package ru.smartup.timetracker.dto.freeze.response;

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
import static ru.smartup.timetracker.dto.freeze.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class FreezeRecordDto_hashCode_10835038769 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4533;

    public FreezeRecordDto_hashCode_10835038769() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4605 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.FreezeRecordStatusEnum");
        Field term4604 = ((Class) term4605).getDeclaredField((String) "UN_FREEZE");
        ((Field) term4604).setAccessible(true);
        Object enum9 = ((Field) term4604).get((Object) null);
        term4533 = newInstance(Class.forName("ru.smartup.timetracker.dto.freeze.response.FreezeRecordDto"));
        Object term4534 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4551 = newInstance(Class.forName("ru.smartup.timetracker.dto.employee.response.EmployeeShortDto"));
        Object term4602 = newInstance(Class.forName("java.util.ImmutableCollections$ListN"));
        Object[] term4603 = (Object[]) newArray("java.lang.Object", 0);
        setIntField(term4534, term4534.getClass(), "year", 2017);
        setShortField(term4534, term4534.getClass(), "month", (short) 7);
        setShortField(term4534, term4534.getClass(), "day", (short) 22);
        setField(term4533, term4533.getClass(), "freezeDate", term4534);
        setField(term4533, term4533.getClass(), "status", enum9);
        setIntField(term4551, term4551.getClass(), "id", -1339778481);
        setField(term4551, term4551.getClass(), "firstName", "xrwlQZdwCp");
        setField(term4551, term4551.getClass(), "middleName", "IDCWpPLRkE");
        setField(term4551, term4551.getClass(), "lastName", "nyiiPDVjAc");
        setField(term4551, term4551.getClass(), "email", "aKnKipADSo");
        setBooleanField(term4551, term4551.getClass(), "isArchived", true);
        setField(term4602, term4602.getClass(), "elements", term4603);
        setField(term4551, term4551.getClass(), "roles", term4602);
        setField(term4533, term4533.getClass(), "employees", term4551);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.freeze.response.FreezeRecordDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term4533, args);
    }

};


