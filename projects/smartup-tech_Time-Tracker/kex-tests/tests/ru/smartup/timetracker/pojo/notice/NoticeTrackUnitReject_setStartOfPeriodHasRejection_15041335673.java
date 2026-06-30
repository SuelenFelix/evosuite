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

public class NoticeTrackUnitReject_setStartOfPeriodHasRejection_15041335673 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17715;
     Object term17720;

    public NoticeTrackUnitReject_setStartOfPeriodHasRejection_15041335673() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17715 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeTrackUnitReject"));
        Object term17716 = newInstance(Class.forName("java.util.Date"));
        Object term17718 = newInstance(Class.forName("java.util.Date"));
        setLongField(term17716, term17716.getClass(), "fastTime", 1429023851389L);
        setField(term17716, term17716.getClass(), "cdate", null);
        setField(term17715, term17715.getClass(), "startOfPeriodHasRejection", term17716);
        setLongField(term17718, term17718.getClass(), "fastTime", 1495357463288L);
        setField(term17718, term17718.getClass(), "cdate", null);
        setField(term17715, term17715.getClass(), "endOfPeriodHasRejection", term17718);
        term17720 = newInstance(Class.forName("java.util.Date"));
        setLongField(term17720, term17720.getClass(), "fastTime", 1645834034896L);
        setField(term17720, term17720.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.notice.NoticeTrackUnitReject");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Date");
        Object[] args = new Object[1];
        args[0] = term17720;
        callMethod(klass, "setStartOfPeriodHasRejection", argTypes, term17715, args);
    }

};


