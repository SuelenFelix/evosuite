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

public class NoticeUnfreeze_getFreezeDate_21121903202 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50111;

    public NoticeUnfreeze_getFreezeDate_21121903202() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50111 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeUnfreeze"));
        Object term50112 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term50112, term50112.getClass(), "year", 2021);
        setShortField(term50112, term50112.getClass(), "month", (short) 9);
        setShortField(term50112, term50112.getClass(), "day", (short) 6);
        setField(term50111, term50111.getClass(), "unfreezeRecordDate", term50112);
        setField(term50111, term50111.getClass(), "freezeDate", "GrqozDKFOk");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.notice.NoticeUnfreeze");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFreezeDate", argTypes, term50111, args);
    }

};


