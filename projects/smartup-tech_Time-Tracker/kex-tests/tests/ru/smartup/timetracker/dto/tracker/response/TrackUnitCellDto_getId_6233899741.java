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

public class TrackUnitCellDto_getId_6233899741 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2992;

    public TrackUnitCellDto_getId_6233899741() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2992 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitCellDto"));
        Object term2994 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term2992, term2992.getClass(), "id", 2442117782898005296L);
        setLongField(term2994, term2994.getClass(), "fastTime", 1345871412244L);
        setField(term2994, term2994.getClass(), "cdate", null);
        setField(term2992, term2992.getClass(), "workDay", term2994);
        setFloatField(term2992, term2992.getClass(), "hours", 0.5254275F);
        setBooleanField(term2992, term2992.getClass(), "blocked", true);
        setBooleanField(term2992, term2992.getClass(), "billable", false);
        setField(term2992, term2992.getClass(), "comment", "PAEBtnZtTD");
        setField(term2992, term2992.getClass(), "rejectReason", "sjlJAEtRrb");
        setBooleanField(term2992, term2992.getClass(), "rejected", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitCellDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term2992, args);
    }

};


