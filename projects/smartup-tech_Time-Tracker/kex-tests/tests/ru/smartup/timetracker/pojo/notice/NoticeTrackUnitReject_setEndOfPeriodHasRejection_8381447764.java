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

public class NoticeTrackUnitReject_setEndOfPeriodHasRejection_8381447764 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17722;
     Object term17727;

    public NoticeTrackUnitReject_setEndOfPeriodHasRejection_8381447764() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17722 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeTrackUnitReject"));
        Object term17723 = newInstance(Class.forName("java.util.Date"));
        Object term17725 = newInstance(Class.forName("java.util.Date"));
        setLongField(term17723, term17723.getClass(), "fastTime", 1500721068023L);
        setField(term17723, term17723.getClass(), "cdate", null);
        setField(term17722, term17722.getClass(), "startOfPeriodHasRejection", term17723);
        setLongField(term17725, term17725.getClass(), "fastTime", 1797203628025L);
        setField(term17725, term17725.getClass(), "cdate", null);
        setField(term17722, term17722.getClass(), "endOfPeriodHasRejection", term17725);
        term17727 = newInstance(Class.forName("java.util.Date"));
        setLongField(term17727, term17727.getClass(), "fastTime", 1589457921030L);
        setField(term17727, term17727.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.notice.NoticeTrackUnitReject");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Date");
        Object[] args = new Object[1];
        args[0] = term17727;
        callMethod(klass, "setEndOfPeriodHasRejection", argTypes, term17722, args);
    }

};


