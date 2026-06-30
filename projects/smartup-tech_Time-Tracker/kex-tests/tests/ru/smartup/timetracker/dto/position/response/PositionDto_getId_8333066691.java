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

public class PositionDto_getId_8333066691 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public PositionDto_getId_8333066691() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("ru.smartup.timetracker.dto.position.response.PositionDto"));
        Object term17 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term20 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term1, term1.getClass(), "id", 568599855);
        setField(term1, term1.getClass(), "name", "PAEBtnZtTD");
        setFloatField(term1, term1.getClass(), "externalRate", 0.13238746F);
        setBooleanField(term1, term1.getClass(), "isArchived", false);
        setIntField(term17, term17.getClass(), "nanos", 244000000);
        setLongField(term17, term17.getClass(), "fastTime", 1345860612000L);
        setField(term17, term17.getClass(), "cdate", null);
        setField(term1, term1.getClass(), "createdDate", term17);
        setIntField(term20, term20.getClass(), "nanos", 369000000);
        setLongField(term20, term20.getClass(), "fastTime", 1480427551000L);
        setField(term20, term20.getClass(), "cdate", null);
        setField(term1, term1.getClass(), "lastModifiedDate", term20);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.position.response.PositionDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term1, args);
    }

};


