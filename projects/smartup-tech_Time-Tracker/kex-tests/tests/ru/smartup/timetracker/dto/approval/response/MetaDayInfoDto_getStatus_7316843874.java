package ru.smartup.timetracker.dto.approval.response;

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
import static ru.smartup.timetracker.dto.approval.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class MetaDayInfoDto_getStatus_7316843874 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22967;

    public MetaDayInfoDto_getStatus_7316843874() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term22991 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProductionCalendarDayEnum");
        Field term22990 = ((Class) term22991).getDeclaredField((String) "SHORTENED_DAY");
        ((Field) term22990).setAccessible(true);
        Object enum41 = ((Field) term22990).get((Object) null);
        term22967 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.MetaDayInfoDto"));
        Object term22968 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term22968, term22968.getClass(), "year", 2010);
        setShortField(term22968, term22968.getClass(), "month", (short) 7);
        setShortField(term22968, term22968.getClass(), "day", (short) 3);
        setField(term22967, term22967.getClass(), "date", term22968);
        setField(term22967, term22967.getClass(), "status", enum41);
        setFloatField(term22967, term22967.getClass(), "standardHours", 0.75073326F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.MetaDayInfoDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStatus", argTypes, term22967, args);
    }

};


