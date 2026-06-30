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

public class TrackUnitCellDto_setBlocked_118016002712 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3570;
     Object term3602;

    public TrackUnitCellDto_setBlocked_118016002712() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3570 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitCellDto"));
        Object term3572 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term3570, term3570.getClass(), "id", -4325723315152823407L);
        setLongField(term3572, term3572.getClass(), "fastTime", 1745462962080L);
        setField(term3572, term3572.getClass(), "cdate", null);
        setField(term3570, term3570.getClass(), "workDay", term3572);
        setFloatField(term3570, term3570.getClass(), "hours", 0.24413109F);
        setBooleanField(term3570, term3570.getClass(), "blocked", true);
        setBooleanField(term3570, term3570.getClass(), "billable", true);
        setField(term3570, term3570.getClass(), "comment", "xOEqzGAmDU");
        setField(term3570, term3570.getClass(), "rejectReason", "eZFUvlxvGV");
        setBooleanField(term3570, term3570.getClass(), "rejected", false);
        term3602 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitCellDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term3602;
        callMethod(klass, "setBlocked", argTypes, term3570, args);
    }

};


