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

public class NoticeTrackUnitReject_canEqual_3590921576 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17735;
     Object term17740;

    public NoticeTrackUnitReject_canEqual_3590921576() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17735 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeTrackUnitReject"));
        Object term17736 = newInstance(Class.forName("java.util.Date"));
        Object term17738 = newInstance(Class.forName("java.util.Date"));
        setLongField(term17736, term17736.getClass(), "fastTime", 1706078172457L);
        setField(term17736, term17736.getClass(), "cdate", null);
        setField(term17735, term17735.getClass(), "startOfPeriodHasRejection", term17736);
        setLongField(term17738, term17738.getClass(), "fastTime", 1863631094992L);
        setField(term17738, term17738.getClass(), "cdate", null);
        setField(term17735, term17735.getClass(), "endOfPeriodHasRejection", term17738);
        term17740 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.notice.NoticeTrackUnitReject");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term17740;
        callMethod(klass, "canEqual", argTypes, term17735, args);
    }

};


