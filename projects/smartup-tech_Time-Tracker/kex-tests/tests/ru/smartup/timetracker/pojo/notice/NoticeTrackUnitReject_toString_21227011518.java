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

public class NoticeTrackUnitReject_toString_21227011518 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17746;

    public NoticeTrackUnitReject_toString_21227011518() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17746 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeTrackUnitReject"));
        Object term17747 = newInstance(Class.forName("java.util.Date"));
        Object term17749 = newInstance(Class.forName("java.util.Date"));
        setLongField(term17747, term17747.getClass(), "fastTime", 1668569229825L);
        setField(term17747, term17747.getClass(), "cdate", null);
        setField(term17746, term17746.getClass(), "startOfPeriodHasRejection", term17747);
        setLongField(term17749, term17749.getClass(), "fastTime", 1725122217647L);
        setField(term17749, term17749.getClass(), "cdate", null);
        setField(term17746, term17746.getClass(), "endOfPeriodHasRejection", term17749);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.notice.NoticeTrackUnitReject");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term17746, args);
    }

};


