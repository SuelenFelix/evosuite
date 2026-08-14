package ru.smartup.timetracker.core.freeze;

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
import static ru.smartup.timetracker.core.freeze.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ScheduleFreezeProperties_getTimeZone_6127208701 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27;

    public ScheduleFreezeProperties_getTimeZone_6127208701() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27 = newInstance(Class.forName("ru.smartup.timetracker.core.freeze.ScheduleFreezeProperties"));
        Object term28 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term43 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term44 = (long[]) newLongArray(3);
        Object[] term48 = (Object[]) newArray("java.time.ZoneOffset", 4);
        Object term49 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term51 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term53 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term55 = newInstance(Class.forName("java.time.ZoneOffset"));
        long[] term57 = (long[]) newLongArray(7);
        Object[] term65 = (Object[]) newArray("java.time.LocalDateTime", 14);
        Object term66 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term67 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term68 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term69 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term70 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term71 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term72 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term73 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term74 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term75 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term76 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term77 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term78 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term79 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object[] term80 = (Object[]) newArray("java.time.ZoneOffset", 8);
        Object term81 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term83 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term85 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term87 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object[] term89 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term90 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term95 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term28, term28.getClass(), "id", "Asia/Kolkata");
        setLongElement(term44, 0, -3645237208L);
        setLongElement(term44, 1, -3155694800L);
        setLongElement(term44, 2, -2019705670L);
        setField(term43, term43.getClass(), "standardTransitions", term44);
        setIntField(term49, term49.getClass(), "totalSeconds", 21208);
        setField(term49, term49.getClass(), "id", null);
        setElement(term48, 0, term49);
        setIntField(term51, term51.getClass(), "totalSeconds", 21200);
        setField(term51, term51.getClass(), "id", null);
        setElement(term48, 1, term51);
        setIntField(term53, term53.getClass(), "totalSeconds", 19270);
        setField(term53, term53.getClass(), "id", null);
        setElement(term48, 2, term53);
        setIntField(term55, term55.getClass(), "totalSeconds", 19800);
        setField(term55, term55.getClass(), "id", null);
        setElement(term48, 3, term55);
        setField(term43, term43.getClass(), "standardOffsets", term48);
        setLongElement(term57, 0, -3645237208L);
        setLongElement(term57, 1, -3155694800L);
        setLongElement(term57, 2, -2019705670L);
        setLongElement(term57, 3, -891581400L);
        setLongElement(term57, 4, -872058600L);
        setLongElement(term57, 5, -862637400L);
        setLongElement(term57, 6, -764145000L);
        setField(term43, term43.getClass(), "savingsInstantTransitions", term57);
        setField(term66, term66.getClass(), "date", null);
        setField(term66, term66.getClass(), "time", null);
        setElement(term65, 0, term66);
        setField(term67, term67.getClass(), "date", null);
        setField(term67, term67.getClass(), "time", null);
        setElement(term65, 1, term67);
        setField(term68, term68.getClass(), "date", null);
        setField(term68, term68.getClass(), "time", null);
        setElement(term65, 2, term68);
        setField(term69, term69.getClass(), "date", null);
        setField(term69, term69.getClass(), "time", null);
        setElement(term65, 3, term69);
        setField(term70, term70.getClass(), "date", null);
        setField(term70, term70.getClass(), "time", null);
        setElement(term65, 4, term70);
        setField(term71, term71.getClass(), "date", null);
        setField(term71, term71.getClass(), "time", null);
        setElement(term65, 5, term71);
        setField(term72, term72.getClass(), "date", null);
        setField(term72, term72.getClass(), "time", null);
        setElement(term65, 6, term72);
        setField(term73, term73.getClass(), "date", null);
        setField(term73, term73.getClass(), "time", null);
        setElement(term65, 7, term73);
        setField(term74, term74.getClass(), "date", null);
        setField(term74, term74.getClass(), "time", null);
        setElement(term65, 8, term74);
        setField(term75, term75.getClass(), "date", null);
        setField(term75, term75.getClass(), "time", null);
        setElement(term65, 9, term75);
        setField(term76, term76.getClass(), "date", null);
        setField(term76, term76.getClass(), "time", null);
        setElement(term65, 10, term76);
        setField(term77, term77.getClass(), "date", null);
        setField(term77, term77.getClass(), "time", null);
        setElement(term65, 11, term77);
        setField(term78, term78.getClass(), "date", null);
        setField(term78, term78.getClass(), "time", null);
        setElement(term65, 12, term78);
        setField(term79, term79.getClass(), "date", null);
        setField(term79, term79.getClass(), "time", null);
        setElement(term65, 13, term79);
        setField(term43, term43.getClass(), "savingsLocalTransitions", term65);
        setIntField(term81, term81.getClass(), "totalSeconds", 21208);
        setField(term81, term81.getClass(), "id", null);
        setElement(term80, 0, term81);
        setIntField(term83, term83.getClass(), "totalSeconds", 21200);
        setField(term83, term83.getClass(), "id", null);
        setElement(term80, 1, term83);
        setIntField(term85, term85.getClass(), "totalSeconds", 19270);
        setField(term85, term85.getClass(), "id", null);
        setElement(term80, 2, term85);
        setElement(term80, 3, term55);
        setIntField(term87, term87.getClass(), "totalSeconds", 23400);
        setField(term87, term87.getClass(), "id", null);
        setElement(term80, 4, term87);
        setElement(term80, 5, term55);
        setElement(term80, 6, term87);
        setElement(term80, 7, term55);
        setField(term43, term43.getClass(), "wallOffsets", term80);
        setField(term43, term43.getClass(), "lastRules", term89);
        setField(term90, term90.getClass(), "table", null);
        setField(term90, term90.getClass(), "nextTable", null);
        setLongField(term90, term90.getClass(), "baseCount", 0L);
        setIntField(term90, term90.getClass(), "sizeCtl", 0);
        setIntField(term90, term90.getClass(), "transferIndex", 0);
        setIntField(term90, term90.getClass(), "cellsBusy", 0);
        setField(term90, term90.getClass(), "counterCells", null);
        setField(term90, term90.getClass(), "keySet", null);
        setField(term90, term90.getClass(), "values", null);
        setField(term90, term90.getClass(), "entrySet", null);
        setField(term90, term90.getClass(), "keySet", null);
        setField(term90, term90.getClass(), "values", null);
        setField(term43, term43.getClass(), "lastRulesCache", term90);
        setField(term28, term28.getClass(), "rules", term43);
        setField(term27, term27.getClass(), "timeZone", term28);
        setByteField(term95, term95.getClass(), "hour", (byte) 12);
        setByteField(term95, term95.getClass(), "minute", (byte) 32);
        setByteField(term95, term95.getClass(), "second", (byte) 20);
        setIntField(term95, term95.getClass(), "nano", 132387463);
        setField(term27, term27.getClass(), "fixedTimeFreeze", term95);
        setIntField(term27, term27.getClass(), "dayToUnfreeze", 1484323161);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.core.freeze.ScheduleFreezeProperties");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTimeZone", argTypes, term27, args);
    }

};


