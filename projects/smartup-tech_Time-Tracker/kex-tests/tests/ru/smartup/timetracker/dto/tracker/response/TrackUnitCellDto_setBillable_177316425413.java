package ru.smartup.timetracker.dto.tracker.response;

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
import static ru.smartup.timetracker.dto.tracker.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Boolean;

public class TrackUnitCellDto_setBillable_177316425413 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3624;
     Object term3656;

    public TrackUnitCellDto_setBillable_177316425413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3624 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitCellDto"));
        Object term3626 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term3624, term3624.getClass(), "id", 2535595959091595249L);
        setLongField(term3626, term3626.getClass(), "fastTime", 1349069753960L);
        setField(term3626, term3626.getClass(), "cdate", null);
        setField(term3624, term3624.getClass(), "workDay", term3626);
        setFloatField(term3624, term3624.getClass(), "hours", 0.8474802F);
        setBooleanField(term3624, term3624.getClass(), "blocked", true);
        setBooleanField(term3624, term3624.getClass(), "billable", true);
        setField(term3624, term3624.getClass(), "comment", "BYqFIqCKAV");
        setField(term3624, term3624.getClass(), "rejectReason", "vrQLuWIDJX");
        setBooleanField(term3624, term3624.getClass(), "rejected", false);
        term3656 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitCellDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term3656;
        callMethod(klass, "setBillable", argTypes, term3624, args);
    }

};


