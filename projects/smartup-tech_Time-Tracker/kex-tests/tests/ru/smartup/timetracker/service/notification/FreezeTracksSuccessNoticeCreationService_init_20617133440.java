package ru.smartup.timetracker.service.notification;

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
import static ru.smartup.timetracker.service.notification.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;
import java.lang.Object;

public class FreezeTracksSuccessNoticeCreationService_init_20617133440 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8391;

    public FreezeTracksSuccessNoticeCreationService_init_20617133440() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8391 = new LinkedList();
        ((LinkedList) term8391).add((Object)null);
        ((LinkedList) term8391).add((Object)null);
        ((LinkedList) term8391).add((Object)null);
        ((LinkedList) term8391).add((Object)null);
        ((LinkedList) term8391).add((Object)null);
        ((LinkedList) term8391).add((Object)null);
        ((LinkedList) term8391).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.service.notification.FreezeTracksSuccessNoticeCreationService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term8391;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


