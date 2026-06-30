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

public class NoticeTrackUnitReject_getStartOfPeriodHasRejection_9701876331 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17705;

    public NoticeTrackUnitReject_getStartOfPeriodHasRejection_9701876331() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17705 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeTrackUnitReject"));
        Object term17706 = newInstance(Class.forName("java.util.Date"));
        Object term17708 = newInstance(Class.forName("java.util.Date"));
        setLongField(term17706, term17706.getClass(), "fastTime", 1610940182830L);
        setField(term17706, term17706.getClass(), "cdate", null);
        setField(term17705, term17705.getClass(), "startOfPeriodHasRejection", term17706);
        setLongField(term17708, term17708.getClass(), "fastTime", 1606045635837L);
        setField(term17708, term17708.getClass(), "cdate", null);
        setField(term17705, term17705.getClass(), "endOfPeriodHasRejection", term17708);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.notice.NoticeTrackUnitReject");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStartOfPeriodHasRejection", argTypes, term17705, args);
    }

};


