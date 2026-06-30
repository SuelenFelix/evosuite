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

public class NoticeChanges_setOldValue_3083956703 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17087;
     Object term17090;

    public NoticeChanges_setOldValue_3083956703() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17087 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeChanges"));
        Object term17088 = newInstance(Class.forName("java.lang.Object"));
        Object term17089 = newInstance(Class.forName("java.lang.Object"));
        setField(term17087, term17087.getClass(), "oldValue", term17088);
        setField(term17087, term17087.getClass(), "newValue", term17089);
        term17090 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.notice.NoticeChanges");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term17090;
        callMethod(klass, "setOldValue", argTypes, term17087, args);
    }

};


