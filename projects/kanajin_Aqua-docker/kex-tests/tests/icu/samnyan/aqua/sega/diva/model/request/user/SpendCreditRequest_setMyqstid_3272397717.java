package icu.samnyan.aqua.sega.diva.model.request.user;

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
import static icu.samnyan.aqua.sega.diva.model.request.user.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class SpendCreditRequest_setMyqstid_3272397717 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3326;
     Object term3600;

    public SpendCreditRequest_setMyqstid_3272397717() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3326 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.user.SpendCreditRequest"));
        int[] term3328 = (int[]) newIntArray(7);
        int[] term3336 = (int[]) newIntArray(2);
        int[] term3340 = (int[]) newIntArray(6);
        int[] term3347 = (int[]) newIntArray(6);
        Object term3438 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term3439 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3440 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3444 = newInstance(Class.forName("java.time.LocalTime"));
        Object term3449 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term3459 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term3476 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term3477 = (long[]) newLongArray(1);
        Object[] term3479 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term3480 = (long[]) newLongArray(39);
        Object[] term3520 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term3521 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term3522 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term3523 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setIntField(term3326, term3326.getClass(), "pd_id", -375014958);
        setIntElement(term3328, 0, 1107176718);
        setIntElement(term3328, 1, 480137250);
        setIntElement(term3328, 2, -341152642);
        setIntElement(term3328, 3, -2015854073);
        setIntElement(term3328, 4, 538259104);
        setIntElement(term3328, 5, 96566506);
        setIntElement(term3328, 6, -343325701);
        setField(term3326, term3326.getClass(), "my_qst_id", term3328);
        setIntElement(term3336, 0, 107945604);
        setIntElement(term3336, 1, -1963464809);
        setField(term3326, term3326.getClass(), "my_qst_sts", term3336);
        setIntField(term3326, term3326.getClass(), "crdt_typ", 71190297);
        setIntElement(term3340, 0, 1202361360);
        setIntElement(term3340, 1, -2015048153);
        setIntElement(term3340, 2, -2063457669);
        setIntElement(term3340, 3, -1222006000);
        setIntElement(term3340, 4, 2095798786);
        setIntElement(term3340, 5, -1565502840);
        setField(term3326, term3326.getClass(), "cmpgn_id", term3340);
        setIntElement(term3347, 0, 344323424);
        setIntElement(term3347, 1, 9726679);
        setIntElement(term3347, 2, -25637976);
        setIntElement(term3347, 3, 1555897383);
        setIntElement(term3347, 4, 202001407);
        setIntElement(term3347, 5, 158873461);
        setField(term3326, term3326.getClass(), "cmpgn_pb", term3347);
        setField(term3326, term3326.getClass(), "cmd", "xOcJIiQQDu");
        setField(term3326, term3326.getClass(), "req_id", "GVizqqzXpy");
        setField(term3326, term3326.getClass(), "game_id", "JqXGgAhZPl");
        setField(term3326, term3326.getClass(), "r_ver", "jiKYgYHqIS");
        setField(term3326, term3326.getClass(), "kc_serial", "DfISiziTgG");
        setField(term3326, term3326.getClass(), "b_serial", "XqgfKFvPSD");
        setField(term3326, term3326.getClass(), "place_id", "JiVRgTZvKc");
        setIntField(term3440, term3440.getClass(), "year", 2024);
        setShortField(term3440, term3440.getClass(), "month", (short) 1);
        setShortField(term3440, term3440.getClass(), "day", (short) 24);
        setField(term3439, term3439.getClass(), "date", term3440);
        setByteField(term3444, term3444.getClass(), "hour", (byte) 20);
        setByteField(term3444, term3444.getClass(), "minute", (byte) 28);
        setByteField(term3444, term3444.getClass(), "second", (byte) 39);
        setIntField(term3444, term3444.getClass(), "nano", 952728177);
        setField(term3439, term3439.getClass(), "time", term3444);
        setField(term3438, term3438.getClass(), "dateTime", term3439);
        setIntField(term3449, term3449.getClass(), "totalSeconds", -10800);
        setField(term3449, term3449.getClass(), "id", "-03:00");
        setField(term3438, term3438.getClass(), "offset", term3449);
        setField(term3459, term3459.getClass(), "id", "America/Recife");
        setLongElement(term3477, 0, -1767217224L);
        setField(term3476, term3476.getClass(), "standardTransitions", term3477);
        setElement(term3479, 1, term3449);
        setField(term3476, term3476.getClass(), "standardOffsets", term3479);
        setLongElement(term3480, 0, -1767217224L);
        setLongElement(term3480, 1, -1206957600L);
        setLongElement(term3480, 2, -1191362400L);
        setLongElement(term3480, 3, -1175374800L);
        setLongElement(term3480, 4, -1159826400L);
        setLongElement(term3480, 5, -633819600L);
        setLongElement(term3480, 6, -622069200L);
        setLongElement(term3480, 7, -602283600L);
        setLongElement(term3480, 8, -591832800L);
        setLongElement(term3480, 9, -570747600L);
        setLongElement(term3480, 10, -560210400L);
        setLongElement(term3480, 11, -539125200L);
        setLongElement(term3480, 12, -531352800L);
        setLongElement(term3480, 13, -191365200L);
        setLongElement(term3480, 14, -184197600L);
        setLongElement(term3480, 15, -155163600L);
        setLongElement(term3480, 16, -150069600L);
        setLongElement(term3480, 17, -128898000L);
        setLongElement(term3480, 18, -121125600L);
        setLongElement(term3480, 19, -99954000L);
        setLongElement(term3480, 20, -89589600L);
        setLongElement(term3480, 21, -68418000L);
        setLongElement(term3480, 22, -57967200L);
        setLongElement(term3480, 23, 499748400L);
        setLongElement(term3480, 24, 511236000L);
        setLongElement(term3480, 25, 530593200L);
        setLongElement(term3480, 26, 540266400L);
        setLongElement(term3480, 27, 562129200L);
        setLongElement(term3480, 28, 571197600L);
        setLongElement(term3480, 29, 592974000L);
        setLongElement(term3480, 30, 602042400L);
        setLongElement(term3480, 31, 624423600L);
        setLongElement(term3480, 32, 634701600L);
        setLongElement(term3480, 33, 938919600L);
        setLongElement(term3480, 34, 951616800L);
        setLongElement(term3480, 35, 970974000L);
        setLongElement(term3480, 36, 971575200L);
        setLongElement(term3480, 37, 1003028400L);
        setLongElement(term3480, 38, 1013911200L);
        setField(term3476, term3476.getClass(), "savingsInstantTransitions", term3480);
        setField(term3476, term3476.getClass(), "savingsLocalTransitions", term3520);
        setElement(term3521, 1, term3449);
        setElement(term3521, 3, term3449);
        setElement(term3521, 5, term3449);
        setElement(term3521, 7, term3449);
        setElement(term3521, 9, term3449);
        setElement(term3521, 11, term3449);
        setElement(term3521, 13, term3449);
        setElement(term3521, 15, term3449);
        setElement(term3521, 17, term3449);
        setElement(term3521, 19, term3449);
        setElement(term3521, 21, term3449);
        setElement(term3521, 23, term3449);
        setElement(term3521, 25, term3449);
        setElement(term3521, 27, term3449);
        setElement(term3521, 29, term3449);
        setElement(term3521, 31, term3449);
        setElement(term3521, 33, term3449);
        setElement(term3521, 35, term3449);
        setElement(term3521, 37, term3449);
        setElement(term3521, 39, term3449);
        setField(term3476, term3476.getClass(), "wallOffsets", term3521);
        setField(term3476, term3476.getClass(), "lastRules", term3522);
        setField(term3523, term3523.getClass(), "table", null);
        setField(term3523, term3523.getClass(), "nextTable", null);
        setLongField(term3523, term3523.getClass(), "baseCount", 0L);
        setIntField(term3523, term3523.getClass(), "sizeCtl", 0);
        setIntField(term3523, term3523.getClass(), "transferIndex", 0);
        setIntField(term3523, term3523.getClass(), "cellsBusy", 0);
        setField(term3523, term3523.getClass(), "counterCells", null);
        setField(term3523, term3523.getClass(), "keySet", null);
        setField(term3523, term3523.getClass(), "values", null);
        setField(term3523, term3523.getClass(), "entrySet", null);
        setField(term3523, term3523.getClass(), "keySet", null);
        setField(term3523, term3523.getClass(), "values", null);
        setField(term3476, term3476.getClass(), "lastRulesCache", term3523);
        setField(term3459, term3459.getClass(), "rules", term3476);
        setField(term3438, term3438.getClass(), "zone", term3459);
        setField(term3326, term3326.getClass(), "time_stamp", term3438);
        setField(term3326, term3326.getClass(), "start_up_mode", "XPKmummaqg");
        setField(term3326, term3326.getClass(), "cmm_dly_mod", "BKLfkLiZTH");
        setField(term3326, term3326.getClass(), "cmm_dly_sec", "SPpkrGcPRr");
        setField(term3326, term3326.getClass(), "cmm_err_mod", "sEccwbJKYE");
        setField(term3326, term3326.getClass(), "country_code", "AWRooQKkdW");
        setField(term3326, term3326.getClass(), "region_code", "vjxIhXHxGR");
        term3600 = (int[]) newIntArray(2);
        setIntElement(term3600, 0, -430151637);
        setIntElement(term3600, 1, -1697741339);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.user.SpendCreditRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term3600;
        callMethod(klass, "setMy_qst_id", argTypes, term3326, args);
    }

};


