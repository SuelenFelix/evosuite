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

public class TrackUnitCellDto_setRejected_52925906716 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3826;
     Object term3858;

    public TrackUnitCellDto_setRejected_52925906716() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3826 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitCellDto"));
        Object term3828 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term3826, term3826.getClass(), "id", -316468845751588286L);
        setLongField(term3828, term3828.getClass(), "fastTime", 1882638884364L);
        setField(term3828, term3828.getClass(), "cdate", null);
        setField(term3826, term3826.getClass(), "workDay", term3828);
        setFloatField(term3826, term3826.getClass(), "hours", 0.97262454F);
        setBooleanField(term3826, term3826.getClass(), "blocked", false);
        setBooleanField(term3826, term3826.getClass(), "billable", true);
        setField(term3826, term3826.getClass(), "comment", "AijpHYOFuy");
        setField(term3826, term3826.getClass(), "rejectReason", "SbAoxhfrkn");
        setBooleanField(term3826, term3826.getClass(), "rejected", false);
        term3858 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitCellDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term3858;
        callMethod(klass, "setRejected", argTypes, term3826, args);
    }

};


