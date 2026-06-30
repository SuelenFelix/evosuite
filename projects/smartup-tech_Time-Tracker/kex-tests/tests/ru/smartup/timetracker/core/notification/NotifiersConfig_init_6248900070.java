package ru.smartup.timetracker.core.notification;

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
import static ru.smartup.timetracker.core.notification.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;

public class NotifiersConfig_init_6248900070 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term14;

    public NotifiersConfig_init_6248900070() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("ru.smartup.timetracker.core.notification.EmailNotifierProperties"));
        setField(term1, term1.getClass(), "username", "PAEBtnZtTD");
        HashMap term15 = new HashMap();
        term14 = newInstance(Class.forName("ru.smartup.timetracker.email.template.EmailTemplateStrategy"));
        setField(term14, term14.getClass(), "generators", term15);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.core.notification.NotifiersConfig");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("ru.smartup.timetracker.core.notification.EmailNotifierProperties");
        argTypes[1] = Class.forName("ru.smartup.timetracker.email.template.EmailTemplateStrategy");
        Object[] args = new Object[2];
        args[0] = term1;
        args[1] = term14;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


