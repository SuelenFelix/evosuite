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

public class NoticeScheduleUpdateDto_canEqual_9371438954 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term412;
     Object term424;

    public NoticeScheduleUpdateDto_canEqual_9371438954() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term414 = new HashMap();
        Set<Object> term425 =  ((Map) term414).keySet();
        HashSet term413 = new HashSet((Collection<? extends Object>) term425);
        term412 = newInstance(Class.forName("ru.smartup.timetracker.dto.notice.request.NoticeScheduleUpdateDto"));
        setField(term412, term412.getClass(), "days", term413);
        term424 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.notice.request.NoticeScheduleUpdateDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term424;
        callMethod(klass, "canEqual", argTypes, term412, args);
    }

};


