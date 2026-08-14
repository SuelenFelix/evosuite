package ru.smartup.timetracker.service.freeze;

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
import static ru.smartup.timetracker.service.freeze.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class FreezeSchedulePlanner_init_146803214810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73846;

    public FreezeSchedulePlanner_init_146803214810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term73846 = newInstance(Class.forName("ru.smartup.timetracker.utils.FreezeDateUtils"));
        Object term73847 = newInstance(Class.forName("ru.smartup.timetracker.core.freeze.ScheduleFreezeProperties"));
        Object term73848 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term73867 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term73868 = (long[]) newLongArray(1);
        Object[] term73870 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term73871 = (long[]) newLongArray(86);
        Object[] term73958 = (Object[]) newArray("java.time.LocalDateTime", 172);
        Object[] term73959 = (Object[]) newArray("java.time.ZoneOffset", 87);
        Object[] term73960 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 2);
        Object term73961 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term73966 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term73848, term73848.getClass(), "id", "Australia/Sydney");
        setLongElement(term73868, 0, -2364113092L);
        setField(term73867, term73867.getClass(), "standardTransitions", term73868);
        setField(term73867, term73867.getClass(), "standardOffsets", term73870);
        setLongElement(term73871, 0, -2364113092L);
        setLongElement(term73871, 1, -1672560000L);
        setLongElement(term73871, 2, -1665388800L);
        setLongElement(term73871, 3, -883641600L);
        setLongElement(term73871, 4, -876124800L);
        setLongElement(term73871, 5, -860400000L);
        setLongElement(term73871, 6, -844675200L);
        setLongElement(term73871, 7, -828345600L);
        setLongElement(term73871, 8, -813225600L);
        setLongElement(term73871, 9, 57686400L);
        setLongElement(term73871, 10, 67968000L);
        setLongElement(term73871, 11, 89136000L);
        setLongElement(term73871, 12, 100022400L);
        setLongElement(term73871, 13, 120585600L);
        setLongElement(term73871, 14, 131472000L);
        setLongElement(term73871, 15, 152035200L);
        setLongElement(term73871, 16, 162921600L);
        setLongElement(term73871, 17, 183484800L);
        setLongElement(term73871, 18, 194976000L);
        setLongElement(term73871, 19, 215539200L);
        setLongElement(term73871, 20, 226425600L);
        setLongElement(term73871, 21, 246988800L);
        setLongElement(term73871, 22, 257875200L);
        setLongElement(term73871, 23, 278438400L);
        setLongElement(term73871, 24, 289324800L);
        setLongElement(term73871, 25, 309888000L);
        setLongElement(term73871, 26, 320774400L);
        setLongElement(term73871, 27, 341337600L);
        setLongElement(term73871, 28, 352224000L);
        setLongElement(term73871, 29, 372787200L);
        setLongElement(term73871, 30, 386697600L);
        setLongElement(term73871, 31, 404841600L);
        setLongElement(term73871, 32, 415728000L);
        setLongElement(term73871, 33, 436291200L);
        setLongElement(term73871, 34, 447177600L);
        setLongElement(term73871, 35, 467740800L);
        setLongElement(term73871, 36, 478627200L);
        setLongElement(term73871, 37, 499190400L);
        setLongElement(term73871, 38, 511286400L);
        setLongElement(term73871, 39, 530035200L);
        setLongElement(term73871, 40, 542736000L);
        setLongElement(term73871, 41, 562089600L);
        setLongElement(term73871, 42, 574790400L);
        setLongElement(term73871, 43, 594144000L);
        setLongElement(term73871, 44, 606240000L);
        setLongElement(term73871, 45, 625593600L);
        setLongElement(term73871, 46, 636480000L);
        setLongElement(term73871, 47, 657043200L);
        setLongElement(term73871, 48, 667929600L);
        setLongElement(term73871, 49, 688492800L);
        setLongElement(term73871, 50, 699379200L);
        setLongElement(term73871, 51, 719942400L);
        setLongElement(term73871, 52, 731433600L);
        setLongElement(term73871, 53, 751996800L);
        setLongElement(term73871, 54, 762883200L);
        setLongElement(term73871, 55, 783446400L);
        setLongElement(term73871, 56, 794332800L);
        setLongElement(term73871, 57, 814896000L);
        setLongElement(term73871, 58, 828201600L);
        setLongElement(term73871, 59, 846345600L);
        setLongElement(term73871, 60, 859651200L);
        setLongElement(term73871, 61, 877795200L);
        setLongElement(term73871, 62, 891100800L);
        setLongElement(term73871, 63, 909244800L);
        setLongElement(term73871, 64, 922550400L);
        setLongElement(term73871, 65, 941299200L);
        setLongElement(term73871, 66, 954000000L);
        setLongElement(term73871, 67, 967305600L);
        setLongElement(term73871, 68, 985449600L);
        setLongElement(term73871, 69, 1004198400L);
        setLongElement(term73871, 70, 1017504000L);
        setLongElement(term73871, 71, 1035648000L);
        setLongElement(term73871, 72, 1048953600L);
        setLongElement(term73871, 73, 1067097600L);
        setLongElement(term73871, 74, 1080403200L);
        setLongElement(term73871, 75, 1099152000L);
        setLongElement(term73871, 76, 1111852800L);
        setLongElement(term73871, 77, 1130601600L);
        setLongElement(term73871, 78, 1143907200L);
        setLongElement(term73871, 79, 1162051200L);
        setLongElement(term73871, 80, 1174752000L);
        setLongElement(term73871, 81, 1193500800L);
        setLongElement(term73871, 82, 1207411200L);
        setLongElement(term73871, 83, 1223136000L);
        setLongElement(term73871, 84, 1238860800L);
        setLongElement(term73871, 85, 1254585600L);
        setField(term73867, term73867.getClass(), "savingsInstantTransitions", term73871);
        setField(term73867, term73867.getClass(), "savingsLocalTransitions", term73958);
        setField(term73867, term73867.getClass(), "wallOffsets", term73959);
        setField(term73867, term73867.getClass(), "lastRules", term73960);
        setField(term73961, term73961.getClass(), "table", null);
        setField(term73961, term73961.getClass(), "nextTable", null);
        setLongField(term73961, term73961.getClass(), "baseCount", 0L);
        setIntField(term73961, term73961.getClass(), "sizeCtl", 0);
        setIntField(term73961, term73961.getClass(), "transferIndex", 0);
        setIntField(term73961, term73961.getClass(), "cellsBusy", 0);
        setField(term73961, term73961.getClass(), "counterCells", null);
        setField(term73961, term73961.getClass(), "keySet", null);
        setField(term73961, term73961.getClass(), "values", null);
        setField(term73961, term73961.getClass(), "entrySet", null);
        setField(term73961, term73961.getClass(), "keySet", null);
        setField(term73961, term73961.getClass(), "values", null);
        setField(term73867, term73867.getClass(), "lastRulesCache", term73961);
        setField(term73848, term73848.getClass(), "rules", term73867);
        setField(term73847, term73847.getClass(), "timeZone", term73848);
        setByteField(term73966, term73966.getClass(), "hour", (byte) 3);
        setByteField(term73966, term73966.getClass(), "minute", (byte) 14);
        setByteField(term73966, term73966.getClass(), "second", (byte) 8);
        setIntField(term73966, term73966.getClass(), "nano", 530944947);
        setField(term73847, term73847.getClass(), "fixedTimeFreeze", term73966);
        setIntField(term73847, term73847.getClass(), "dayToUnfreeze", -1415256843);
        setField(term73846, term73846.getClass(), "freezeProperties", term73847);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.service.freeze.FreezeSchedulePlanner");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("ru.smartup.timetracker.service.freeze.CRUDFreezeService");
        argTypes[1] = Class.forName("ru.smartup.timetracker.utils.FreezeDateUtils");
        argTypes[2] = Class.forName("ru.smartup.timetracker.service.freeze.FreezeScheduler");
        argTypes[3] = Class.forName("ru.smartup.timetracker.service.TrackUnitService");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = term73846;
        args[2] = null;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


