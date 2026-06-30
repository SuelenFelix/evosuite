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

public class TrackUnitCellDto_hashCode_90142400019 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3986;

    public TrackUnitCellDto_hashCode_90142400019() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3986 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitCellDto"));
        Object term3988 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term3986, term3986.getClass(), "id", -4920224193275732920L);
        setLongField(term3988, term3988.getClass(), "fastTime", 1725122217647L);
        setField(term3988, term3988.getClass(), "cdate", null);
        setField(term3986, term3986.getClass(), "workDay", term3988);
        setFloatField(term3986, term3986.getClass(), "hours", 0.13745493F);
        setBooleanField(term3986, term3986.getClass(), "blocked", true);
        setBooleanField(term3986, term3986.getClass(), "billable", true);
        setField(term3986, term3986.getClass(), "comment", "nyiiPDVjAc");
        setField(term3986, term3986.getClass(), "rejectReason", "aKnKipADSo");
        setBooleanField(term3986, term3986.getClass(), "rejected", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitCellDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term3986, args);
    }

};


