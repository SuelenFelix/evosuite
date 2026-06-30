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
import java.util.HashMap;
import java.lang.Object;

public class NoticeAspect_init_20278591440 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term11;
     Object term22;

    public NoticeAspect_init_20278591440() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2 = new HashMap();
        term1 = newInstance(Class.forName("ru.smartup.timetracker.service.notification.notifier.NotifierObservable"));
        setField(term1, term1.getClass(), "appNotifiers", term2);
        setField(term1, term1.getClass(), "executorService", null);
        HashMap term12 = new HashMap();
        term11 = newInstance(Class.forName("ru.smartup.timetracker.service.notification.FreezeTracksSuccessNoticeCreationService"));
        setField(term11, term11.getClass(), "noticeCreationStrategies", term12);
        term22 = newInstance(Class.forName("ru.smartup.timetracker.utils.FreezeDateUtils"));
        Object term23 = newInstance(Class.forName("ru.smartup.timetracker.core.freeze.ScheduleFreezeProperties"));
        Object term24 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term39 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term40 = (long[]) newLongArray(2);
        Object[] term43 = (Object[]) newArray("java.time.ZoneOffset", 3);
        long[] term44 = (long[]) newLongArray(10);
        Object[] term55 = (Object[]) newArray("java.time.LocalDateTime", 20);
        Object[] term56 = (Object[]) newArray("java.time.ZoneOffset", 11);
        Object[] term57 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term58 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term63 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term24, term24.getClass(), "id", "Asia/Karachi");
        setLongElement(term40, 0, -1988166492L);
        setLongElement(term40, 1, -576135000L);
        setField(term39, term39.getClass(), "standardTransitions", term40);
        setField(term39, term39.getClass(), "standardOffsets", term43);
        setLongElement(term44, 0, -1988166492L);
        setLongElement(term44, 1, -862637400L);
        setLongElement(term44, 2, -764145000L);
        setLongElement(term44, 3, -576135000L);
        setLongElement(term44, 4, 1018119600L);
        setLongElement(term44, 5, 1033840800L);
        setLongElement(term44, 6, 1212260400L);
        setLongElement(term44, 7, 1225476000L);
        setLongElement(term44, 8, 1239735600L);
        setLongElement(term44, 9, 1257012000L);
        setField(term39, term39.getClass(), "savingsInstantTransitions", term44);
        setField(term39, term39.getClass(), "savingsLocalTransitions", term55);
        setField(term39, term39.getClass(), "wallOffsets", term56);
        setField(term39, term39.getClass(), "lastRules", term57);
        setField(term58, term58.getClass(), "table", null);
        setField(term58, term58.getClass(), "nextTable", null);
        setLongField(term58, term58.getClass(), "baseCount", 0L);
        setIntField(term58, term58.getClass(), "sizeCtl", 0);
        setIntField(term58, term58.getClass(), "transferIndex", 0);
        setIntField(term58, term58.getClass(), "cellsBusy", 0);
        setField(term58, term58.getClass(), "counterCells", null);
        setField(term58, term58.getClass(), "keySet", null);
        setField(term58, term58.getClass(), "values", null);
        setField(term58, term58.getClass(), "entrySet", null);
        setField(term58, term58.getClass(), "keySet", null);
        setField(term58, term58.getClass(), "values", null);
        setField(term39, term39.getClass(), "lastRulesCache", term58);
        setField(term24, term24.getClass(), "rules", term39);
        setField(term23, term23.getClass(), "timeZone", term24);
        setByteField(term63, term63.getClass(), "hour", (byte) 12);
        setByteField(term63, term63.getClass(), "minute", (byte) 32);
        setByteField(term63, term63.getClass(), "second", (byte) 20);
        setIntField(term63, term63.getClass(), "nano", 132387463);
        setField(term23, term23.getClass(), "fixedTimeFreeze", term63);
        setIntField(term23, term23.getClass(), "dayToUnfreeze", 568599855);
        setField(term22, term22.getClass(), "freezeProperties", term23);
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
        args[4] = term1;
        args[5] = null;
        args[6] = term11;
        args[7] = term22;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


