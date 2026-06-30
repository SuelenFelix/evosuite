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

public class SpendCreditRequest_getCmpgnpb_15513215425 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2370;

    public SpendCreditRequest_getCmpgnpb_15513215425() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2370 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.user.SpendCreditRequest"));
        int[] term2372 = (int[]) newIntArray(2);
        int[] term2375 = (int[]) newIntArray(1);
        int[] term2378 = (int[]) newIntArray(9);
        int[] term2388 = (int[]) newIntArray(3);
        Object term2476 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term2477 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2478 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2482 = newInstance(Class.forName("java.time.LocalTime"));
        Object term2487 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term2497 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term2514 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term2515 = (long[]) newLongArray(1);
        Object[] term2517 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term2518 = (long[]) newLongArray(39);
        Object[] term2558 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term2559 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term2560 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term2561 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setIntField(term2370, term2370.getClass(), "pd_id", 1442160736);
        setIntElement(term2372, 0, 1114000454);
        setIntElement(term2372, 1, -556405712);
        setField(term2370, term2370.getClass(), "my_qst_id", term2372);
        setIntElement(term2375, 0, -1772434990);
        setField(term2370, term2370.getClass(), "my_qst_sts", term2375);
        setIntField(term2370, term2370.getClass(), "crdt_typ", -1845499264);
        setIntElement(term2378, 0, -505439934);
        setIntElement(term2378, 1, -344842608);
        setIntElement(term2378, 2, 941650513);
        setIntElement(term2378, 3, 444029505);
        setIntElement(term2378, 4, -1034506028);
        setIntElement(term2378, 5, -1263114719);
        setIntElement(term2378, 6, -894662986);
        setIntElement(term2378, 7, 304775596);
        setIntElement(term2378, 8, -1347665717);
        setField(term2370, term2370.getClass(), "cmpgn_id", term2378);
        setIntElement(term2388, 0, -1888585309);
        setIntElement(term2388, 1, 683666002);
        setIntElement(term2388, 2, 1596213415);
        setField(term2370, term2370.getClass(), "cmpgn_pb", term2388);
        setField(term2370, term2370.getClass(), "cmd", "uWHnvSvaPl");
        setField(term2370, term2370.getClass(), "req_id", "kBdSllIBVz");
        setField(term2370, term2370.getClass(), "game_id", "TJmVBGfTML");
        setField(term2370, term2370.getClass(), "r_ver", "tPlsykYBqO");
        setField(term2370, term2370.getClass(), "kc_serial", "bLPjGVBhlX");
        setField(term2370, term2370.getClass(), "b_serial", "whBvTVIIlC");
        setField(term2370, term2370.getClass(), "place_id", "IgRJUzaCwW");
        setIntField(term2478, term2478.getClass(), "year", 2026);
        setShortField(term2478, term2478.getClass(), "month", (short) 12);
        setShortField(term2478, term2478.getClass(), "day", (short) 14);
        setField(term2477, term2477.getClass(), "date", term2478);
        setByteField(term2482, term2482.getClass(), "hour", (byte) 16);
        setByteField(term2482, term2482.getClass(), "minute", (byte) 34);
        setByteField(term2482, term2482.getClass(), "second", (byte) 9);
        setIntField(term2482, term2482.getClass(), "nano", 518326996);
        setField(term2477, term2477.getClass(), "time", term2482);
        setField(term2476, term2476.getClass(), "dateTime", term2477);
        setIntField(term2487, term2487.getClass(), "totalSeconds", -10800);
        setField(term2487, term2487.getClass(), "id", "-03:00");
        setField(term2476, term2476.getClass(), "offset", term2487);
        setField(term2497, term2497.getClass(), "id", "America/Recife");
        setLongElement(term2515, 0, -1767217224L);
        setField(term2514, term2514.getClass(), "standardTransitions", term2515);
        setElement(term2517, 1, term2487);
        setField(term2514, term2514.getClass(), "standardOffsets", term2517);
        setLongElement(term2518, 0, -1767217224L);
        setLongElement(term2518, 1, -1206957600L);
        setLongElement(term2518, 2, -1191362400L);
        setLongElement(term2518, 3, -1175374800L);
        setLongElement(term2518, 4, -1159826400L);
        setLongElement(term2518, 5, -633819600L);
        setLongElement(term2518, 6, -622069200L);
        setLongElement(term2518, 7, -602283600L);
        setLongElement(term2518, 8, -591832800L);
        setLongElement(term2518, 9, -570747600L);
        setLongElement(term2518, 10, -560210400L);
        setLongElement(term2518, 11, -539125200L);
        setLongElement(term2518, 12, -531352800L);
        setLongElement(term2518, 13, -191365200L);
        setLongElement(term2518, 14, -184197600L);
        setLongElement(term2518, 15, -155163600L);
        setLongElement(term2518, 16, -150069600L);
        setLongElement(term2518, 17, -128898000L);
        setLongElement(term2518, 18, -121125600L);
        setLongElement(term2518, 19, -99954000L);
        setLongElement(term2518, 20, -89589600L);
        setLongElement(term2518, 21, -68418000L);
        setLongElement(term2518, 22, -57967200L);
        setLongElement(term2518, 23, 499748400L);
        setLongElement(term2518, 24, 511236000L);
        setLongElement(term2518, 25, 530593200L);
        setLongElement(term2518, 26, 540266400L);
        setLongElement(term2518, 27, 562129200L);
        setLongElement(term2518, 28, 571197600L);
        setLongElement(term2518, 29, 592974000L);
        setLongElement(term2518, 30, 602042400L);
        setLongElement(term2518, 31, 624423600L);
        setLongElement(term2518, 32, 634701600L);
        setLongElement(term2518, 33, 938919600L);
        setLongElement(term2518, 34, 951616800L);
        setLongElement(term2518, 35, 970974000L);
        setLongElement(term2518, 36, 971575200L);
        setLongElement(term2518, 37, 1003028400L);
        setLongElement(term2518, 38, 1013911200L);
        setField(term2514, term2514.getClass(), "savingsInstantTransitions", term2518);
        setField(term2514, term2514.getClass(), "savingsLocalTransitions", term2558);
        setElement(term2559, 1, term2487);
        setElement(term2559, 3, term2487);
        setElement(term2559, 5, term2487);
        setElement(term2559, 7, term2487);
        setElement(term2559, 9, term2487);
        setElement(term2559, 11, term2487);
        setElement(term2559, 13, term2487);
        setElement(term2559, 15, term2487);
        setElement(term2559, 17, term2487);
        setElement(term2559, 19, term2487);
        setElement(term2559, 21, term2487);
        setElement(term2559, 23, term2487);
        setElement(term2559, 25, term2487);
        setElement(term2559, 27, term2487);
        setElement(term2559, 29, term2487);
        setElement(term2559, 31, term2487);
        setElement(term2559, 33, term2487);
        setElement(term2559, 35, term2487);
        setElement(term2559, 37, term2487);
        setElement(term2559, 39, term2487);
        setField(term2514, term2514.getClass(), "wallOffsets", term2559);
        setField(term2514, term2514.getClass(), "lastRules", term2560);
        setField(term2561, term2561.getClass(), "table", null);
        setField(term2561, term2561.getClass(), "nextTable", null);
        setLongField(term2561, term2561.getClass(), "baseCount", 0L);
        setIntField(term2561, term2561.getClass(), "sizeCtl", 0);
        setIntField(term2561, term2561.getClass(), "transferIndex", 0);
        setIntField(term2561, term2561.getClass(), "cellsBusy", 0);
        setField(term2561, term2561.getClass(), "counterCells", null);
        setField(term2561, term2561.getClass(), "keySet", null);
        setField(term2561, term2561.getClass(), "values", null);
        setField(term2561, term2561.getClass(), "entrySet", null);
        setField(term2561, term2561.getClass(), "keySet", null);
        setField(term2561, term2561.getClass(), "values", null);
        setField(term2514, term2514.getClass(), "lastRulesCache", term2561);
        setField(term2497, term2497.getClass(), "rules", term2514);
        setField(term2476, term2476.getClass(), "zone", term2497);
        setField(term2370, term2370.getClass(), "time_stamp", term2476);
        setField(term2370, term2370.getClass(), "start_up_mode", "JUmudUmaaV");
        setField(term2370, term2370.getClass(), "cmm_dly_mod", "KoyGrUJeJW");
        setField(term2370, term2370.getClass(), "cmm_dly_sec", "HqBOwkVqjD");
        setField(term2370, term2370.getClass(), "cmm_err_mod", "MAcUBcBckh");
        setField(term2370, term2370.getClass(), "country_code", "oVgzLbrsFr");
        setField(term2370, term2370.getClass(), "region_code", "vQVyKLdtaz");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.user.SpendCreditRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCmpgn_pb", argTypes, term2370, args);
    }

};


