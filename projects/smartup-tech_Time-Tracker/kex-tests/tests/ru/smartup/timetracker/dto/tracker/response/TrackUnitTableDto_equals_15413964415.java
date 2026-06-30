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

public class TrackUnitTableDto_equals_15413964415 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9186;
     Object term9215;

    public TrackUnitTableDto_equals_15413964415() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term9187 = new ArrayList();
        ArrayList term9200 = new ArrayList();
        ((ArrayList) term9200).add((Object)null);
        ((ArrayList) term9200).add((Object)null);
        ((ArrayList) term9200).add((Object)null);
        ((ArrayList) term9200).add((Object)null);
        ((ArrayList) term9200).add((Object)null);
        ((ArrayList) term9200).add((Object)null);
        ((ArrayList) term9200).add((Object)null);
        Object term9193 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitRowDto"));
        setIntField(term9193, term9193.getClass(), "employeeId", -1465035361);
        setIntField(term9193, term9193.getClass(), "projectId", 1090617576);
        setField(term9193, term9193.getClass(), "projectName", "");
        setLongField(term9193, term9193.getClass(), "taskId", -5724112525188606013L);
        setField(term9193, term9193.getClass(), "taskName", "");
        setBooleanField(term9193, term9193.getClass(), "observed", false);
        setField(term9193, term9193.getClass(), "units", term9200);
        ArrayList term9210 = new ArrayList();
        ((ArrayList) term9210).add((Object)null);
        ((ArrayList) term9210).add((Object)null);
        Object term9203 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitRowDto"));
        setIntField(term9203, term9203.getClass(), "employeeId", -1547384488);
        setIntField(term9203, term9203.getClass(), "projectId", 1442160736);
        setField(term9203, term9203.getClass(), "projectName", "");
        setLongField(term9203, term9203.getClass(), "taskId", -4030863184426321096L);
        setField(term9203, term9203.getClass(), "taskName", "");
        setBooleanField(term9203, term9203.getClass(), "observed", false);
        setField(term9203, term9203.getClass(), "units", term9210);
        ArrayList term9191 = new ArrayList();
        ((ArrayList) term9191).add(term9193);
        ((ArrayList) term9191).add(term9203);
        term9186 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitTableDto"));
        setField(term9186, term9186.getClass(), "days", term9187);
        setField(term9186, term9186.getClass(), "data", term9191);
        term9215 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitTableDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term9215;
        callMethod(klass, "equals", argTypes, term9186, args);
    }

};


