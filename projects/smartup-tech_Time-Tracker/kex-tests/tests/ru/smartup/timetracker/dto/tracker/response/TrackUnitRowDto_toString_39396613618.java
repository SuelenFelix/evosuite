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
import java.util.ArrayList;
import java.lang.Object;

public class TrackUnitRowDto_toString_39396613618 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5848;

    public TrackUnitRowDto_toString_39396613618() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term5879 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitCellDto"));
        Object term5881 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term5879, term5879.getClass(), "id", 7276637106827860087L);
        setLongField(term5881, term5881.getClass(), "fastTime", 1589746751309L);
        setField(term5881, term5881.getClass(), "cdate", null);
        setField(term5879, term5879.getClass(), "workDay", term5881);
        setFloatField(term5879, term5879.getClass(), "hours", 0.10338366F);
        setBooleanField(term5879, term5879.getClass(), "blocked", false);
        setBooleanField(term5879, term5879.getClass(), "billable", false);
        setField(term5879, term5879.getClass(), "comment", "");
        setField(term5879, term5879.getClass(), "rejectReason", "");
        setBooleanField(term5879, term5879.getClass(), "rejected", true);
        Object term5889 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitCellDto"));
        Object term5891 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term5889, term5889.getClass(), "id", -3936701866695933852L);
        setLongField(term5891, term5891.getClass(), "fastTime", 1291280367982L);
        setField(term5891, term5891.getClass(), "cdate", null);
        setField(term5889, term5889.getClass(), "workDay", term5891);
        setFloatField(term5889, term5889.getClass(), "hours", 0.75913525F);
        setBooleanField(term5889, term5889.getClass(), "blocked", true);
        setBooleanField(term5889, term5889.getClass(), "billable", false);
        setField(term5889, term5889.getClass(), "comment", "");
        setField(term5889, term5889.getClass(), "rejectReason", "");
        setBooleanField(term5889, term5889.getClass(), "rejected", false);
        Object term5899 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitCellDto"));
        Object term5901 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term5899, term5899.getClass(), "id", 1215116475929634177L);
        setLongField(term5901, term5901.getClass(), "fastTime", 1491181740539L);
        setField(term5901, term5901.getClass(), "cdate", null);
        setField(term5899, term5899.getClass(), "workDay", term5901);
        setFloatField(term5899, term5899.getClass(), "hours", 0.7059082F);
        setBooleanField(term5899, term5899.getClass(), "blocked", false);
        setBooleanField(term5899, term5899.getClass(), "billable", false);
        setField(term5899, term5899.getClass(), "comment", "");
        setField(term5899, term5899.getClass(), "rejectReason", "");
        setBooleanField(term5899, term5899.getClass(), "rejected", true);
        Object term5909 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitCellDto"));
        Object term5911 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term5909, term5909.getClass(), "id", 1597484336218508869L);
        setLongField(term5911, term5911.getClass(), "fastTime", 1461996881310L);
        setField(term5911, term5911.getClass(), "cdate", null);
        setField(term5909, term5909.getClass(), "workDay", term5911);
        setFloatField(term5909, term5909.getClass(), "hours", 0.791695F);
        setBooleanField(term5909, term5909.getClass(), "blocked", true);
        setBooleanField(term5909, term5909.getClass(), "billable", true);
        setField(term5909, term5909.getClass(), "comment", "");
        setField(term5909, term5909.getClass(), "rejectReason", "");
        setBooleanField(term5909, term5909.getClass(), "rejected", true);
        Object term5919 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitCellDto"));
        Object term5921 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term5919, term5919.getClass(), "id", -685023850445639859L);
        setLongField(term5921, term5921.getClass(), "fastTime", 1818968525805L);
        setField(term5921, term5921.getClass(), "cdate", null);
        setField(term5919, term5919.getClass(), "workDay", term5921);
        setFloatField(term5919, term5919.getClass(), "hours", 0.07096106F);
        setBooleanField(term5919, term5919.getClass(), "blocked", false);
        setBooleanField(term5919, term5919.getClass(), "billable", true);
        setField(term5919, term5919.getClass(), "comment", "");
        setField(term5919, term5919.getClass(), "rejectReason", "");
        setBooleanField(term5919, term5919.getClass(), "rejected", false);
        ArrayList term5877 = new ArrayList();
        ((ArrayList) term5877).add(term5879);
        ((ArrayList) term5877).add(term5889);
        ((ArrayList) term5877).add(term5899);
        ((ArrayList) term5877).add(term5909);
        ((ArrayList) term5877).add(term5919);
        term5848 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitRowDto"));
        setIntField(term5848, term5848.getClass(), "employeeId", -1530420153);
        setIntField(term5848, term5848.getClass(), "projectId", -469968304);
        setField(term5848, term5848.getClass(), "projectName", "izPpKDErnQ");
        setLongField(term5848, term5848.getClass(), "taskId", 2354625302846375590L);
        setField(term5848, term5848.getClass(), "taskName", "NnpwZBUTvx");
        setBooleanField(term5848, term5848.getClass(), "observed", false);
        setField(term5848, term5848.getClass(), "units", term5877);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitRowDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term5848, args);
    }

};


