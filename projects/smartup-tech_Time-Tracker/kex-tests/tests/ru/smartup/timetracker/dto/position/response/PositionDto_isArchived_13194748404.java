package ru.smartup.timetracker.dto.position.response;

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
import static ru.smartup.timetracker.dto.position.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class PositionDto_isArchived_13194748404 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97;

    public PositionDto_isArchived_13194748404() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term97 = newInstance(Class.forName("ru.smartup.timetracker.dto.position.response.PositionDto"));
        Object term113 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term116 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term97, term97.getClass(), "id", 391863371);
        setField(term97, term97.getClass(), "name", "xxtlPwDYFs");
        setFloatField(term97, term97.getClass(), "externalRate", 0.09123778F);
        setBooleanField(term97, term97.getClass(), "isArchived", false);
        setIntField(term113, term113.getClass(), "nanos", 389000000);
        setLongField(term113, term113.getClass(), "fastTime", 1429013051000L);
        setField(term113, term113.getClass(), "cdate", null);
        setField(term97, term97.getClass(), "createdDate", term113);
        setIntField(term116, term116.getClass(), "nanos", 288000000);
        setLongField(term116, term116.getClass(), "fastTime", 1495346663000L);
        setField(term116, term116.getClass(), "cdate", null);
        setField(term97, term97.getClass(), "lastModifiedDate", term116);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.position.response.PositionDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isArchived", argTypes, term97, args);
    }

};


