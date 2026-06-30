package ru.smartup.timetracker.dto.tracker.request;

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
import static ru.smartup.timetracker.dto.tracker.request.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class TrackUnitRowUpdateDto_hashCode_35898014511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term891;

    public TrackUnitRowUpdateDto_hashCode_35898014511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term897 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.request.TrackUnitCellUpdateDto"));
        Object term898 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term898, term898.getClass(), "fastTime", 1491181740539L);
        setField(term898, term898.getClass(), "cdate", null);
        setField(term897, term897.getClass(), "workDay", term898);
        setFloatField(term897, term897.getClass(), "hours", 0.5840714F);
        setField(term897, term897.getClass(), "comment", "");
        setBooleanField(term897, term897.getClass(), "billable", false);
        Object term903 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.request.TrackUnitCellUpdateDto"));
        Object term904 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term904, term904.getClass(), "fastTime", 1461996881310L);
        setField(term904, term904.getClass(), "cdate", null);
        setField(term903, term903.getClass(), "workDay", term904);
        setFloatField(term903, term903.getClass(), "hours", 0.478669F);
        setField(term903, term903.getClass(), "comment", "");
        setBooleanField(term903, term903.getClass(), "billable", false);
        Object term909 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.request.TrackUnitCellUpdateDto"));
        Object term910 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term910, term910.getClass(), "fastTime", 1818968525805L);
        setField(term910, term910.getClass(), "cdate", null);
        setField(term909, term909.getClass(), "workDay", term910);
        setFloatField(term909, term909.getClass(), "hours", 0.75592405F);
        setField(term909, term909.getClass(), "comment", "");
        setBooleanField(term909, term909.getClass(), "billable", true);
        Object term915 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.request.TrackUnitCellUpdateDto"));
        Object term916 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term916, term916.getClass(), "fastTime", 1603905786801L);
        setField(term916, term916.getClass(), "cdate", null);
        setField(term915, term915.getClass(), "workDay", term916);
        setFloatField(term915, term915.getClass(), "hours", 0.068145275F);
        setField(term915, term915.getClass(), "comment", "");
        setBooleanField(term915, term915.getClass(), "billable", true);
        Object term921 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.request.TrackUnitCellUpdateDto"));
        Object term922 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term922, term922.getClass(), "fastTime", 1369539267611L);
        setField(term922, term922.getClass(), "cdate", null);
        setField(term921, term921.getClass(), "workDay", term922);
        setFloatField(term921, term921.getClass(), "hours", 0.10667074F);
        setField(term921, term921.getClass(), "comment", "");
        setBooleanField(term921, term921.getClass(), "billable", true);
        Object term927 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.request.TrackUnitCellUpdateDto"));
        Object term928 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term928, term928.getClass(), "fastTime", 1510275079351L);
        setField(term928, term928.getClass(), "cdate", null);
        setField(term927, term927.getClass(), "workDay", term928);
        setFloatField(term927, term927.getClass(), "hours", 0.9571234F);
        setField(term927, term927.getClass(), "comment", "");
        setBooleanField(term927, term927.getClass(), "billable", false);
        ArrayList term895 = new ArrayList();
        ((ArrayList) term895).add(term897);
        ((ArrayList) term895).add(term903);
        ((ArrayList) term895).add(term909);
        ((ArrayList) term895).add(term915);
        ((ArrayList) term895).add(term921);
        ((ArrayList) term895).add(term927);
        term891 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.request.TrackUnitRowUpdateDto"));
        setIntField(term891, term891.getClass(), "employeeId", -655067527);
        setLongField(term891, term891.getClass(), "taskId", -8885298608300233488L);
        setBooleanField(term891, term891.getClass(), "observed", true);
        setField(term891, term891.getClass(), "units", term895);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.tracker.request.TrackUnitRowUpdateDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term891, args);
    }

};


