package icu.samnyan.aqua.sega.diva.model.request.boot;

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
import static icu.samnyan.aqua.sega.diva.model.request.boot.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class AttendRequest_setAtndprm1_5511044895 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2648;

    public AttendRequest_setAtndprm1_5511044895() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2648 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.boot.AttendRequest"));
        Object term2781 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term2782 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2783 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2787 = newInstance(Class.forName("java.time.LocalTime"));
        Object term2792 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term2802 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term2819 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term2820 = (long[]) newLongArray(1);
        Object[] term2822 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term2823 = (long[]) newLongArray(39);
        Object[] term2863 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term2864 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term2865 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term2866 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term2648, term2648.getClass(), "atnd_lut", "PHvxnGHptP");
        setField(term2648, term2648.getClass(), "atnd_prm1", "TimdotUuNC");
        setField(term2648, term2648.getClass(), "atnd_prm2", "PkWMRdJcBb");
        setField(term2648, term2648.getClass(), "atnd_prm3", "jSpAteRute");
        setField(term2648, term2648.getClass(), "cmd", "swZVeJAxjt");
        setField(term2648, term2648.getClass(), "req_id", "xOcJIiQQDu");
        setField(term2648, term2648.getClass(), "game_id", "GVizqqzXpy");
        setField(term2648, term2648.getClass(), "r_ver", "JqXGgAhZPl");
        setField(term2648, term2648.getClass(), "kc_serial", "jiKYgYHqIS");
        setField(term2648, term2648.getClass(), "b_serial", "DfISiziTgG");
        setField(term2648, term2648.getClass(), "place_id", "XqgfKFvPSD");
        setIntField(term2783, term2783.getClass(), "year", 2026);
        setShortField(term2783, term2783.getClass(), "month", (short) 12);
        setShortField(term2783, term2783.getClass(), "day", (short) 14);
        setField(term2782, term2782.getClass(), "date", term2783);
        setByteField(term2787, term2787.getClass(), "hour", (byte) 16);
        setByteField(term2787, term2787.getClass(), "minute", (byte) 34);
        setByteField(term2787, term2787.getClass(), "second", (byte) 9);
        setIntField(term2787, term2787.getClass(), "nano", 518326996);
        setField(term2782, term2782.getClass(), "time", term2787);
        setField(term2781, term2781.getClass(), "dateTime", term2782);
        setIntField(term2792, term2792.getClass(), "totalSeconds", -10800);
        setField(term2792, term2792.getClass(), "id", "-03:00");
        setField(term2781, term2781.getClass(), "offset", term2792);
        setField(term2802, term2802.getClass(), "id", "America/Recife");
        setLongElement(term2820, 0, -1767217224L);
        setField(term2819, term2819.getClass(), "standardTransitions", term2820);
        setElement(term2822, 1, term2792);
        setField(term2819, term2819.getClass(), "standardOffsets", term2822);
        setLongElement(term2823, 0, -1767217224L);
        setLongElement(term2823, 1, -1206957600L);
        setLongElement(term2823, 2, -1191362400L);
        setLongElement(term2823, 3, -1175374800L);
        setLongElement(term2823, 4, -1159826400L);
        setLongElement(term2823, 5, -633819600L);
        setLongElement(term2823, 6, -622069200L);
        setLongElement(term2823, 7, -602283600L);
        setLongElement(term2823, 8, -591832800L);
        setLongElement(term2823, 9, -570747600L);
        setLongElement(term2823, 10, -560210400L);
        setLongElement(term2823, 11, -539125200L);
        setLongElement(term2823, 12, -531352800L);
        setLongElement(term2823, 13, -191365200L);
        setLongElement(term2823, 14, -184197600L);
        setLongElement(term2823, 15, -155163600L);
        setLongElement(term2823, 16, -150069600L);
        setLongElement(term2823, 17, -128898000L);
        setLongElement(term2823, 18, -121125600L);
        setLongElement(term2823, 19, -99954000L);
        setLongElement(term2823, 20, -89589600L);
        setLongElement(term2823, 21, -68418000L);
        setLongElement(term2823, 22, -57967200L);
        setLongElement(term2823, 23, 499748400L);
        setLongElement(term2823, 24, 511236000L);
        setLongElement(term2823, 25, 530593200L);
        setLongElement(term2823, 26, 540266400L);
        setLongElement(term2823, 27, 562129200L);
        setLongElement(term2823, 28, 571197600L);
        setLongElement(term2823, 29, 592974000L);
        setLongElement(term2823, 30, 602042400L);
        setLongElement(term2823, 31, 624423600L);
        setLongElement(term2823, 32, 634701600L);
        setLongElement(term2823, 33, 938919600L);
        setLongElement(term2823, 34, 951616800L);
        setLongElement(term2823, 35, 970974000L);
        setLongElement(term2823, 36, 971575200L);
        setLongElement(term2823, 37, 1003028400L);
        setLongElement(term2823, 38, 1013911200L);
        setField(term2819, term2819.getClass(), "savingsInstantTransitions", term2823);
        setField(term2819, term2819.getClass(), "savingsLocalTransitions", term2863);
        setElement(term2864, 1, term2792);
        setElement(term2864, 3, term2792);
        setElement(term2864, 5, term2792);
        setElement(term2864, 7, term2792);
        setElement(term2864, 9, term2792);
        setElement(term2864, 11, term2792);
        setElement(term2864, 13, term2792);
        setElement(term2864, 15, term2792);
        setElement(term2864, 17, term2792);
        setElement(term2864, 19, term2792);
        setElement(term2864, 21, term2792);
        setElement(term2864, 23, term2792);
        setElement(term2864, 25, term2792);
        setElement(term2864, 27, term2792);
        setElement(term2864, 29, term2792);
        setElement(term2864, 31, term2792);
        setElement(term2864, 33, term2792);
        setElement(term2864, 35, term2792);
        setElement(term2864, 37, term2792);
        setElement(term2864, 39, term2792);
        setField(term2819, term2819.getClass(), "wallOffsets", term2864);
        setField(term2819, term2819.getClass(), "lastRules", term2865);
        setField(term2866, term2866.getClass(), "table", null);
        setField(term2866, term2866.getClass(), "nextTable", null);
        setLongField(term2866, term2866.getClass(), "baseCount", 0L);
        setIntField(term2866, term2866.getClass(), "sizeCtl", 0);
        setIntField(term2866, term2866.getClass(), "transferIndex", 0);
        setIntField(term2866, term2866.getClass(), "cellsBusy", 0);
        setField(term2866, term2866.getClass(), "counterCells", null);
        setField(term2866, term2866.getClass(), "keySet", null);
        setField(term2866, term2866.getClass(), "values", null);
        setField(term2866, term2866.getClass(), "entrySet", null);
        setField(term2866, term2866.getClass(), "keySet", null);
        setField(term2866, term2866.getClass(), "values", null);
        setField(term2819, term2819.getClass(), "lastRulesCache", term2866);
        setField(term2802, term2802.getClass(), "rules", term2819);
        setField(term2781, term2781.getClass(), "zone", term2802);
        setField(term2648, term2648.getClass(), "time_stamp", term2781);
        setField(term2648, term2648.getClass(), "start_up_mode", "JiVRgTZvKc");
        setField(term2648, term2648.getClass(), "cmm_dly_mod", "XPKmummaqg");
        setField(term2648, term2648.getClass(), "cmm_dly_sec", "BKLfkLiZTH");
        setField(term2648, term2648.getClass(), "cmm_err_mod", "SPpkrGcPRr");
        setField(term2648, term2648.getClass(), "country_code", "sEccwbJKYE");
        setField(term2648, term2648.getClass(), "region_code", "AWRooQKkdW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.boot.AttendRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "vjxIhXHxGR";
        callMethod(klass, "setAtnd_prm1", argTypes, term2648, args);
    }

};


