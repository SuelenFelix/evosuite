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

public class PositionDto_setCreatedDate_96381270611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term349;
     Object term371;

    public PositionDto_setCreatedDate_96381270611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term349 = newInstance(Class.forName("ru.smartup.timetracker.dto.position.response.PositionDto"));
        Object term365 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term368 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term349, term349.getClass(), "id", -522618178);
        setField(term349, term349.getClass(), "name", "uuaPigETmJ");
        setFloatField(term349, term349.getClass(), "externalRate", 0.8783184F);
        setBooleanField(term349, term349.getClass(), "isArchived", true);
        setIntField(term365, term365.getClass(), "nanos", 689000000);
        setLongField(term365, term365.getClass(), "fastTime", 1550688194000L);
        setField(term365, term365.getClass(), "cdate", null);
        setField(term349, term349.getClass(), "createdDate", term365);
        setIntField(term368, term368.getClass(), "nanos", 131000000);
        setLongField(term368, term368.getClass(), "fastTime", 1804987287000L);
        setField(term368, term368.getClass(), "cdate", null);
        setField(term349, term349.getClass(), "lastModifiedDate", term368);
        term371 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term371, term371.getClass(), "nanos", 394000000);
        setLongField(term371, term371.getClass(), "fastTime", 1538068116000L);
        setField(term371, term371.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.position.response.PositionDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.sql.Timestamp");
        Object[] args = new Object[1];
        args[0] = term371;
        callMethod(klass, "setCreatedDate", argTypes, term349, args);
    }

};


