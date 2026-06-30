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

public class NoticeTrackUnitReject_getEndOfPeriodHasRejection_18205413542 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17710;

    public NoticeTrackUnitReject_getEndOfPeriodHasRejection_18205413542() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17710 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeTrackUnitReject"));
        Object term17711 = newInstance(Class.forName("java.util.Date"));
        Object term17713 = newInstance(Class.forName("java.util.Date"));
        setLongField(term17711, term17711.getClass(), "fastTime", 1442639565302L);
        setField(term17711, term17711.getClass(), "cdate", null);
        setField(term17710, term17710.getClass(), "startOfPeriodHasRejection", term17711);
        setLongField(term17713, term17713.getClass(), "fastTime", 1515890130018L);
        setField(term17713, term17713.getClass(), "cdate", null);
        setField(term17710, term17710.getClass(), "endOfPeriodHasRejection", term17713);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.notice.NoticeTrackUnitReject");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEndOfPeriodHasRejection", argTypes, term17710, args);
    }

};


