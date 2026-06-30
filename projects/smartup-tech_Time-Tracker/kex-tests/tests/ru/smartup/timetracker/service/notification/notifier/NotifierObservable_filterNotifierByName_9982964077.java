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
import java.util.HashMap;
import java.lang.Object;

public class NotifierObservable_filterNotifierByName_9982964077 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2719;
     Object term2729;

    public NotifierObservable_filterNotifierByName_9982964077() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2720 = new HashMap();
        term2719 = newInstance(Class.forName("ru.smartup.timetracker.service.notification.notifier.NotifierObservable"));
        setField(term2719, term2719.getClass(), "appNotifiers", term2720);
        setField(term2719, term2719.getClass(), "executorService", null);
        term2729 = (Object[]) newArray("java.lang.String", 6);
        setElement(term2729, 0, "onpbIeEKoi");
        setElement(term2729, 1, "YRHGsAkhxb");
        setElement(term2729, 2, "ffYhPOzlUs");
        setElement(term2729, 3, "MLqYREekMl");
        setElement(term2729, 4, "ytSBIKXogI");
        setElement(term2729, 5, "nHXjMycHlU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.service.notification.notifier.NotifierObservable");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term2729;
        callMethod(klass, "filterNotifierByName", argTypes, term2719, args);
    }

};


