package ru.smartup.timetracker.service.notification.notifier;

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
import static ru.smartup.timetracker.service.notification.notifier.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class NotifierObservable_notifyAllChannels_14547364619 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2862;

    public NotifierObservable_notifyAllChannels_14547364619() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2862 = newInstance(Class.forName("ru.smartup.timetracker.service.notification.notifier.NotifierObservable"));
        setField(term2862, term2862.getClass(), "appNotifiers", null);
        setField(term2862, term2862.getClass(), "executorService", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.service.notification.notifier.NotifierObservable");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.List");
        argTypes[1] = Class.forName("ru.smartup.timetracker.entity.Notice");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "notifyAllChannels", argTypes, term2862, args);
    }

};


