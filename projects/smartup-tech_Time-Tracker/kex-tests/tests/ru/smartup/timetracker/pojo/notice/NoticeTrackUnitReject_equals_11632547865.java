package ru.smartup.timetracker.pojo.notice;

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
import static ru.smartup.timetracker.pojo.notice.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class NoticeTrackUnitReject_equals_11632547865 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17729;
     Object term17734;

    public NoticeTrackUnitReject_equals_11632547865() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17729 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeTrackUnitReject"));
        Object term17730 = newInstance(Class.forName("java.util.Date"));
        Object term17732 = newInstance(Class.forName("java.util.Date"));
        setLongField(term17730, term17730.getClass(), "fastTime", 1745462962080L);
        setField(term17730, term17730.getClass(), "cdate", null);
        setField(term17729, term17729.getClass(), "startOfPeriodHasRejection", term17730);
        setLongField(term17732, term17732.getClass(), "fastTime", 1349069753960L);
        setField(term17732, term17732.getClass(), "cdate", null);
        setField(term17729, term17729.getClass(), "endOfPeriodHasRejection", term17732);
        term17734 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.notice.NoticeTrackUnitReject");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term17734;
        callMethod(klass, "equals", argTypes, term17729, args);
    }

};


