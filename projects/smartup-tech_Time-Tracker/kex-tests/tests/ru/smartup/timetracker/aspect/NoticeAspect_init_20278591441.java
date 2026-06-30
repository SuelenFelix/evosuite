package ru.smartup.timetracker.aspect;

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
import static ru.smartup.timetracker.aspect.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class NoticeAspect_init_20278591441 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);

    public NoticeAspect_init_20278591441() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.aspect.NoticeAspect");
        Class<?>[] argTypes = new Class<?>[8];
        argTypes[0] = Class.forName("ru.smartup.timetracker.service.RelationEmployeeRolesService");
        argTypes[1] = Class.forName("ru.smartup.timetracker.service.ProjectService");
        argTypes[2] = Class.forName("ru.smartup.timetracker.service.EmployeeService");
        argTypes[3] = Class.forName("ru.smartup.timetracker.service.TrackUnitService");
        argTypes[4] = Class.forName("ru.smartup.timetracker.service.notification.notifier.NotifierObservable");
        argTypes[5] = Class.forName("ru.smartup.timetracker.service.notification.NoticeScheduleService");
        argTypes[6] = Class.forName("ru.smartup.timetracker.service.notification.FreezeTracksSuccessNoticeCreationService");
        argTypes[7] = Class.forName("ru.smartup.timetracker.utils.FreezeDateUtils");
        Object[] args = new Object[8];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        args[6] = null;
        args[7] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


