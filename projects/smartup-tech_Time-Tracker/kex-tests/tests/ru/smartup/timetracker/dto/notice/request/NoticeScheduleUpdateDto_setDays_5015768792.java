package ru.smartup.timetracker.dto.notice.request;

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
import static ru.smartup.timetracker.dto.notice.request.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class NoticeScheduleUpdateDto_setDays_5015768792 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term354;
     Object term374;

    public NoticeScheduleUpdateDto_setDays_5015768792() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term356 = new HashMap();
        Set<Object> term380 =  ((Map) term356).keySet();
        HashSet term355 = new HashSet((Collection<? extends Object>) term380);
        term354 = newInstance(Class.forName("ru.smartup.timetracker.dto.notice.request.NoticeScheduleUpdateDto"));
        setField(term354, term354.getClass(), "days", term355);
        HashMap term375 = new HashMap();
        Set<Object> term381 =  ((Map) term375).keySet();
        term374 = new HashSet((Collection<? extends Object>) term381);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.notice.request.NoticeScheduleUpdateDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Set");
        Object[] args = new Object[1];
        args[0] = term374;
        callMethod(klass, "setDays", argTypes, term354, args);
    }

};


