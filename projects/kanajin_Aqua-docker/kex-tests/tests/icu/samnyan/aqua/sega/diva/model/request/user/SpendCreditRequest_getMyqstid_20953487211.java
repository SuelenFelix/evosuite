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

public class SpendCreditRequest_getMyqstid_20953487211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term476;

    public SpendCreditRequest_getMyqstid_20953487211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term476 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.user.SpendCreditRequest"));
        int[] term478 = (int[]) newIntArray(1);
        int[] term480 = (int[]) newIntArray(6);
        int[] term488 = (int[]) newIntArray(2);
        int[] term491 = (int[]) newIntArray(6);
        Object term582 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term583 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term584 = newInstance(Class.forName("java.time.LocalDate"));
        Object term588 = newInstance(Class.forName("java.time.LocalTime"));
        Object term593 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term603 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term620 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term621 = (long[]) newLongArray(1);
        Object[] term623 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term624 = (long[]) newLongArray(39);
        Object[] term664 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term665 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term666 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term667 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setIntField(term476, term476.getClass(), "pd_id", 1622346318);
        setIntElement(term478, 0, 1048535127);
        setField(term476, term476.getClass(), "my_qst_id", term478);
        setIntElement(term480, 0, -655067527);
        setIntElement(term480, 1, -6029667);
        setIntElement(term480, 2, -2068769794);
        setIntElement(term480, 3, -117576464);
        setIntElement(term480, 4, -1007160944);
        setIntElement(term480, 5, 1135664017);
        setField(term476, term476.getClass(), "my_qst_sts", term480);
        setIntField(term476, term476.getClass(), "crdt_typ", 590364439);
        setIntElement(term488, 0, 865208305);
        setIntElement(term488, 1, -1275173084);
        setField(term476, term476.getClass(), "cmpgn_id", term488);
        setIntElement(term491, 0, -244121226);
        setIntElement(term491, 1, -203030934);
        setIntElement(term491, 2, -1179120542);
        setIntElement(term491, 3, -73683645);
        setIntElement(term491, 4, -226514366);
        setIntElement(term491, 5, 1193880199);
        setField(term476, term476.getClass(), "cmpgn_pb", term491);
        setField(term476, term476.getClass(), "cmd", "LQFpaHEwXR");
        setField(term476, term476.getClass(), "req_id", "oVcInYnLWB");
        setField(term476, term476.getClass(), "game_id", "aJlieCFVtF");
        setField(term476, term476.getClass(), "r_ver", "ZiaGIbnzTs");
        setField(term476, term476.getClass(), "kc_serial", "tbcdzjIfER");
        setField(term476, term476.getClass(), "b_serial", "HyxfbSQYBe");
        setField(term476, term476.getClass(), "place_id", "pCTimMblYc");
        setIntField(term584, term584.getClass(), "year", 2021);
        setShortField(term584, term584.getClass(), "month", (short) 1);
        setShortField(term584, term584.getClass(), "day", (short) 18);
        setField(term583, term583.getClass(), "date", term584);
        setByteField(term588, term588.getClass(), "hour", (byte) 13);
        setByteField(term588, term588.getClass(), "minute", (byte) 38);
        setByteField(term588, term588.getClass(), "second", (byte) 26);
        setIntField(term588, term588.getClass(), "nano", 544608644);
        setField(term583, term583.getClass(), "time", term588);
        setField(term582, term582.getClass(), "dateTime", term583);
        setIntField(term593, term593.getClass(), "totalSeconds", -10800);
        setField(term593, term593.getClass(), "id", "-03:00");
        setField(term582, term582.getClass(), "offset", term593);
        setField(term603, term603.getClass(), "id", "America/Recife");
        setLongElement(term621, 0, -1767217224L);
        setField(term620, term620.getClass(), "standardTransitions", term621);
        setElement(term623, 1, term593);
        setField(term620, term620.getClass(), "standardOffsets", term623);
        setLongElement(term624, 0, -1767217224L);
        setLongElement(term624, 1, -1206957600L);
        setLongElement(term624, 2, -1191362400L);
        setLongElement(term624, 3, -1175374800L);
        setLongElement(term624, 4, -1159826400L);
        setLongElement(term624, 5, -633819600L);
        setLongElement(term624, 6, -622069200L);
        setLongElement(term624, 7, -602283600L);
        setLongElement(term624, 8, -591832800L);
        setLongElement(term624, 9, -570747600L);
        setLongElement(term624, 10, -560210400L);
        setLongElement(term624, 11, -539125200L);
        setLongElement(term624, 12, -531352800L);
        setLongElement(term624, 13, -191365200L);
        setLongElement(term624, 14, -184197600L);
        setLongElement(term624, 15, -155163600L);
        setLongElement(term624, 16, -150069600L);
        setLongElement(term624, 17, -128898000L);
        setLongElement(term624, 18, -121125600L);
        setLongElement(term624, 19, -99954000L);
        setLongElement(term624, 20, -89589600L);
        setLongElement(term624, 21, -68418000L);
        setLongElement(term624, 22, -57967200L);
        setLongElement(term624, 23, 499748400L);
        setLongElement(term624, 24, 511236000L);
        setLongElement(term624, 25, 530593200L);
        setLongElement(term624, 26, 540266400L);
        setLongElement(term624, 27, 562129200L);
        setLongElement(term624, 28, 571197600L);
        setLongElement(term624, 29, 592974000L);
        setLongElement(term624, 30, 602042400L);
        setLongElement(term624, 31, 624423600L);
        setLongElement(term624, 32, 634701600L);
        setLongElement(term624, 33, 938919600L);
        setLongElement(term624, 34, 951616800L);
        setLongElement(term624, 35, 970974000L);
        setLongElement(term624, 36, 971575200L);
        setLongElement(term624, 37, 1003028400L);
        setLongElement(term624, 38, 1013911200L);
        setField(term620, term620.getClass(), "savingsInstantTransitions", term624);
        setField(term620, term620.getClass(), "savingsLocalTransitions", term664);
        setElement(term665, 1, term593);
        setElement(term665, 3, term593);
        setElement(term665, 5, term593);
        setElement(term665, 7, term593);
        setElement(term665, 9, term593);
        setElement(term665, 11, term593);
        setElement(term665, 13, term593);
        setElement(term665, 15, term593);
        setElement(term665, 17, term593);
        setElement(term665, 19, term593);
        setElement(term665, 21, term593);
        setElement(term665, 23, term593);
        setElement(term665, 25, term593);
        setElement(term665, 27, term593);
        setElement(term665, 29, term593);
        setElement(term665, 31, term593);
        setElement(term665, 33, term593);
        setElement(term665, 35, term593);
        setElement(term665, 37, term593);
        setElement(term665, 39, term593);
        setField(term620, term620.getClass(), "wallOffsets", term665);
        setField(term620, term620.getClass(), "lastRules", term666);
        setField(term667, term667.getClass(), "table", null);
        setField(term667, term667.getClass(), "nextTable", null);
        setLongField(term667, term667.getClass(), "baseCount", 0L);
        setIntField(term667, term667.getClass(), "sizeCtl", 0);
        setIntField(term667, term667.getClass(), "transferIndex", 0);
        setIntField(term667, term667.getClass(), "cellsBusy", 0);
        setField(term667, term667.getClass(), "counterCells", null);
        setField(term667, term667.getClass(), "keySet", null);
        setField(term667, term667.getClass(), "values", null);
        setField(term667, term667.getClass(), "entrySet", null);
        setField(term667, term667.getClass(), "keySet", null);
        setField(term667, term667.getClass(), "values", null);
        setField(term620, term620.getClass(), "lastRulesCache", term667);
        setField(term603, term603.getClass(), "rules", term620);
        setField(term582, term582.getClass(), "zone", term603);
        setField(term476, term476.getClass(), "time_stamp", term582);
        setField(term476, term476.getClass(), "start_up_mode", "hNxWaHcfhY");
        setField(term476, term476.getClass(), "cmm_dly_mod", "RkybSrpybU");
        setField(term476, term476.getClass(), "cmm_dly_sec", "xOEqzGAmDU");
        setField(term476, term476.getClass(), "cmm_err_mod", "eZFUvlxvGV");
        setField(term476, term476.getClass(), "country_code", "BYqFIqCKAV");
        setField(term476, term476.getClass(), "region_code", "vrQLuWIDJX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.user.SpendCreditRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMy_qst_id", argTypes, term476, args);
    }

};


