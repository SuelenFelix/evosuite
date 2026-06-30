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

public class NoticeUnfreeze_getUnfreezeRecordDate_9541979131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50084;

    public NoticeUnfreeze_getUnfreezeRecordDate_9541979131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50084 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeUnfreeze"));
        Object term50085 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term50085, term50085.getClass(), "year", 2017);
        setShortField(term50085, term50085.getClass(), "month", (short) 8);
        setShortField(term50085, term50085.getClass(), "day", (short) 7);
        setField(term50084, term50084.getClass(), "unfreezeRecordDate", term50085);
        setField(term50084, term50084.getClass(), "freezeDate", "zcorEihhLK");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.notice.NoticeUnfreeze");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUnfreezeRecordDate", argTypes, term50084, args);
    }

};


