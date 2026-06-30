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
import java.lang.Integer;
import java.lang.Long;
import java.lang.Object;

public class NoticeData_init_15844488074 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21434;
     Object term21449;
     Object term21464;

    public NoticeData_init_15844488074() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term21435 = new Integer(-203030934);
        term21434 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeProject"));
        setField(term21434, term21434.getClass(), "id", term21435);
        setField(term21434, term21434.getClass(), "name", "tPlsykYBqO");
        Long term21450 = new Long(-2813493605142626659L);
        term21449 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeTask"));
        setField(term21449, term21449.getClass(), "id", term21450);
        setField(term21449, term21449.getClass(), "name", "bLPjGVBhlX");
        term21464 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeTrackUnitReject"));
        Object term21465 = newInstance(Class.forName("java.util.Date"));
        Object term21467 = newInstance(Class.forName("java.util.Date"));
        setLongField(term21465, term21465.getClass(), "fastTime", 1550698994689L);
        setField(term21465, term21465.getClass(), "cdate", null);
        setField(term21464, term21464.getClass(), "startOfPeriodHasRejection", term21465);
        setLongField(term21467, term21467.getClass(), "fastTime", 1804998087131L);
        setField(term21467, term21467.getClass(), "cdate", null);
        setField(term21464, term21464.getClass(), "endOfPeriodHasRejection", term21467);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.notice.NoticeData");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("ru.smartup.timetracker.pojo.notice.NoticeProject");
        argTypes[1] = Class.forName("ru.smartup.timetracker.pojo.notice.NoticeTask");
        argTypes[2] = Class.forName("ru.smartup.timetracker.pojo.notice.NoticeTrackUnitReject");
        Object[] args = new Object[3];
        args[0] = term21434;
        args[1] = term21449;
        args[2] = term21464;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


