package ru.smartup.timetracker.pojo;

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
import static ru.smartup.timetracker.pojo.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TrackUnitProjectTask_setTrackUnitWorkDay_17492728589 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55442;
     Object term55473;

    public TrackUnitProjectTask_setTrackUnitWorkDay_17492728589() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55442 = newInstance(Class.forName("ru.smartup.timetracker.pojo.TrackUnitProjectTask"));
        Object term55445 = newInstance(Class.forName("java.util.Date"));
        setIntField(term55442, term55442.getClass(), "employeeId", -243422082);
        setLongField(term55442, term55442.getClass(), "trackUnitId", -685023850445639859L);
        setLongField(term55445, term55445.getClass(), "fastTime", 1643981113575L);
        setField(term55445, term55445.getClass(), "cdate", null);
        setField(term55442, term55442.getClass(), "trackUnitWorkDay", term55445);
        setIntField(term55442, term55442.getClass(), "projectId", 1384592638);
        setField(term55442, term55442.getClass(), "projectName", "rwKoAngzCu");
        setLongField(term55442, term55442.getClass(), "taskId", -6950146046121430355L);
        setField(term55442, term55442.getClass(), "taskName", "VUkRVwROTl");
        term55473 = newInstance(Class.forName("java.util.Date"));
        setLongField(term55473, term55473.getClass(), "fastTime", 1689428810999L);
        setField(term55473, term55473.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.TrackUnitProjectTask");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Date");
        Object[] args = new Object[1];
        args[0] = term55473;
        callMethod(klass, "setTrackUnitWorkDay", argTypes, term55442, args);
    }

};


