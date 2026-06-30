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

public class NoticeTrackUnitReject_init_15012705820 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17701;
     Object term17703;

    public NoticeTrackUnitReject_init_15012705820() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17701 = newInstance(Class.forName("java.util.Date"));
        setLongField(term17701, term17701.getClass(), "fastTime", 1345871412244L);
        setField(term17701, term17701.getClass(), "cdate", null);
        term17703 = newInstance(Class.forName("java.util.Date"));
        setLongField(term17703, term17703.getClass(), "fastTime", 1480438351369L);
        setField(term17703, term17703.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.notice.NoticeTrackUnitReject");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Date");
        argTypes[1] = Class.forName("java.util.Date");
        Object[] args = new Object[2];
        args[0] = term17701;
        args[1] = term17703;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


