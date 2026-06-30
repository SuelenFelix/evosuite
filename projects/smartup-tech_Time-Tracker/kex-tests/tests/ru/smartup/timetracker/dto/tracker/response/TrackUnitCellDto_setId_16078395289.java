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
import java.lang.Long;

public class TrackUnitCellDto_setId_16078395289 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3408;
     Object term3440;

    public TrackUnitCellDto_setId_16078395289() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3408 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitCellDto"));
        Object term3410 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term3408, term3408.getClass(), "id", -7237588299778557629L);
        setLongField(term3410, term3410.getClass(), "fastTime", 1645834034896L);
        setField(term3410, term3410.getClass(), "cdate", null);
        setField(term3408, term3408.getClass(), "workDay", term3410);
        setFloatField(term3408, term3408.getClass(), "hours", 0.13906479F);
        setBooleanField(term3408, term3408.getClass(), "blocked", true);
        setBooleanField(term3408, term3408.getClass(), "billable", false);
        setField(term3408, term3408.getClass(), "comment", "ZiaGIbnzTs");
        setField(term3408, term3408.getClass(), "rejectReason", "tbcdzjIfER");
        setBooleanField(term3408, term3408.getClass(), "rejected", true);
        term3440 = new Long(6967924379644551255L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitCellDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term3440;
        callMethod(klass, "setId", argTypes, term3408, args);
    }

};


