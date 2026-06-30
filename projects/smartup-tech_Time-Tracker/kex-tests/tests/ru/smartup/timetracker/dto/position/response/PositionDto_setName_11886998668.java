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

public class PositionDto_setName_11886998668 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term227;

    public PositionDto_setName_11886998668() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term227 = newInstance(Class.forName("ru.smartup.timetracker.dto.position.response.PositionDto"));
        Object term243 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term246 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term227, term227.getClass(), "id", 1227103734);
        setField(term227, term227.getClass(), "name", "MjGYSRKTNF");
        setFloatField(term227, term227.getClass(), "externalRate", 0.5254275F);
        setBooleanField(term227, term227.getClass(), "isArchived", true);
        setIntField(term243, term243.getClass(), "nanos", 457000000);
        setLongField(term243, term243.getClass(), "fastTime", 1706067372000L);
        setField(term243, term243.getClass(), "cdate", null);
        setField(term227, term227.getClass(), "createdDate", term243);
        setIntField(term246, term246.getClass(), "nanos", 992000000);
        setLongField(term246, term246.getClass(), "fastTime", 1863620294000L);
        setField(term246, term246.getClass(), "cdate", null);
        setField(term227, term227.getClass(), "lastModifiedDate", term246);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.position.response.PositionDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "hRNSzYYIrc";
        callMethod(klass, "setName", argTypes, term227, args);
    }

};


