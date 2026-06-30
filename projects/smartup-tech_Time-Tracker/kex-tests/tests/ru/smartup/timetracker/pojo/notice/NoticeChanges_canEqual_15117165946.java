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

public class NoticeChanges_canEqual_15117165946 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17099;
     Object term17102;

    public NoticeChanges_canEqual_15117165946() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17099 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeChanges"));
        Object term17100 = newInstance(Class.forName("java.lang.Object"));
        Object term17101 = newInstance(Class.forName("java.lang.Object"));
        setField(term17099, term17099.getClass(), "oldValue", term17100);
        setField(term17099, term17099.getClass(), "newValue", term17101);
        term17102 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.notice.NoticeChanges");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term17102;
        callMethod(klass, "canEqual", argTypes, term17099, args);
    }

};


