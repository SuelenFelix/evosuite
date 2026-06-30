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

public class PositionDto_canEqual_193077726514 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term452;
     Object term474;

    public PositionDto_canEqual_193077726514() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term452 = newInstance(Class.forName("ru.smartup.timetracker.dto.position.response.PositionDto"));
        Object term468 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term471 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term452, term452.getClass(), "id", 1585847225);
        setField(term452, term452.getClass(), "name", "oVcInYnLWB");
        setFloatField(term452, term452.getClass(), "externalRate", 0.3692338F);
        setBooleanField(term452, term452.getClass(), "isArchived", false);
        setIntField(term468, term468.getClass(), "nanos", 573000000);
        setLongField(term468, term468.getClass(), "fastTime", 1329629467000L);
        setField(term468, term468.getClass(), "cdate", null);
        setField(term452, term452.getClass(), "createdDate", term468);
        setIntField(term471, term471.getClass(), "nanos", 718000000);
        setLongField(term471, term471.getClass(), "fastTime", 1334842304000L);
        setField(term471, term471.getClass(), "cdate", null);
        setField(term452, term452.getClass(), "lastModifiedDate", term471);
        term474 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.position.response.PositionDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term474;
        callMethod(klass, "canEqual", argTypes, term452, args);
    }

};


