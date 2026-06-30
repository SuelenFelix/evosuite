package icu.samnyan.aqua.sega.diva.model.request.ingame;

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
import static icu.samnyan.aqua.sega.diva.model.request.ingame.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class BuyCstmzItmRequest_getStartidx_2891587502 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term274001;

    public BuyCstmzItmRequest_getStartidx_2891587502() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term274001 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.ingame.BuyCstmzItmRequest"));
        Object term274091 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term274092 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term274093 = newInstance(Class.forName("java.time.LocalDate"));
        Object term274097 = newInstance(Class.forName("java.time.LocalTime"));
        Object term274102 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term274112 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term274129 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term274130 = (long[]) newLongArray(1);
        Object[] term274132 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term274133 = (long[]) newLongArray(39);
        Object[] term274173 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term274174 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term274175 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term274176 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setIntField(term274001, term274001.getClass(), "pd_id", 312103772);
        setIntField(term274001, term274001.getClass(), "accept_idx", -247421297);
        setIntField(term274001, term274001.getClass(), "start_idx", -1898514822);
        setIntField(term274001, term274001.getClass(), "cstmz_itm_id", 169905807);
        setIntField(term274001, term274001.getClass(), "cstmz_itm_price", 1345762730);
        setField(term274001, term274001.getClass(), "cmd", "oQFejbSARv");
        setField(term274001, term274001.getClass(), "req_id", "DzSvjuoClh");
        setField(term274001, term274001.getClass(), "game_id", "mKfcJwCzHA");
        setField(term274001, term274001.getClass(), "r_ver", "aAolDGKlZL");
        setField(term274001, term274001.getClass(), "kc_serial", "QowFnXBGSJ");
        setField(term274001, term274001.getClass(), "b_serial", "KZIClWErQV");
        setField(term274001, term274001.getClass(), "place_id", "NlMAkCBTMT");
        setIntField(term274093, term274093.getClass(), "year", 2019);
        setShortField(term274093, term274093.getClass(), "month", (short) 12);
        setShortField(term274093, term274093.getClass(), "day", (short) 8);
        setField(term274092, term274092.getClass(), "date", term274093);
        setByteField(term274097, term274097.getClass(), "hour", (byte) 6);
        setByteField(term274097, term274097.getClass(), "minute", (byte) 0);
        setByteField(term274097, term274097.getClass(), "second", (byte) 32);
        setIntField(term274097, term274097.getClass(), "nano", 371231280);
        setField(term274092, term274092.getClass(), "time", term274097);
        setField(term274091, term274091.getClass(), "dateTime", term274092);
        setIntField(term274102, term274102.getClass(), "totalSeconds", -10800);
        setField(term274102, term274102.getClass(), "id", "-03:00");
        setField(term274091, term274091.getClass(), "offset", term274102);
        setField(term274112, term274112.getClass(), "id", "America/Recife");
        setLongElement(term274130, 0, -1767217224L);
        setField(term274129, term274129.getClass(), "standardTransitions", term274130);
        setElement(term274132, 1, term274102);
        setField(term274129, term274129.getClass(), "standardOffsets", term274132);
        setLongElement(term274133, 0, -1767217224L);
        setLongElement(term274133, 1, -1206957600L);
        setLongElement(term274133, 2, -1191362400L);
        setLongElement(term274133, 3, -1175374800L);
        setLongElement(term274133, 4, -1159826400L);
        setLongElement(term274133, 5, -633819600L);
        setLongElement(term274133, 6, -622069200L);
        setLongElement(term274133, 7, -602283600L);
        setLongElement(term274133, 8, -591832800L);
        setLongElement(term274133, 9, -570747600L);
        setLongElement(term274133, 10, -560210400L);
        setLongElement(term274133, 11, -539125200L);
        setLongElement(term274133, 12, -531352800L);
        setLongElement(term274133, 13, -191365200L);
        setLongElement(term274133, 14, -184197600L);
        setLongElement(term274133, 15, -155163600L);
        setLongElement(term274133, 16, -150069600L);
        setLongElement(term274133, 17, -128898000L);
        setLongElement(term274133, 18, -121125600L);
        setLongElement(term274133, 19, -99954000L);
        setLongElement(term274133, 20, -89589600L);
        setLongElement(term274133, 21, -68418000L);
        setLongElement(term274133, 22, -57967200L);
        setLongElement(term274133, 23, 499748400L);
        setLongElement(term274133, 24, 511236000L);
        setLongElement(term274133, 25, 530593200L);
        setLongElement(term274133, 26, 540266400L);
        setLongElement(term274133, 27, 562129200L);
        setLongElement(term274133, 28, 571197600L);
        setLongElement(term274133, 29, 592974000L);
        setLongElement(term274133, 30, 602042400L);
        setLongElement(term274133, 31, 624423600L);
        setLongElement(term274133, 32, 634701600L);
        setLongElement(term274133, 33, 938919600L);
        setLongElement(term274133, 34, 951616800L);
        setLongElement(term274133, 35, 970974000L);
        setLongElement(term274133, 36, 971575200L);
        setLongElement(term274133, 37, 1003028400L);
        setLongElement(term274133, 38, 1013911200L);
        setField(term274129, term274129.getClass(), "savingsInstantTransitions", term274133);
        setField(term274129, term274129.getClass(), "savingsLocalTransitions", term274173);
        setElement(term274174, 1, term274102);
        setElement(term274174, 3, term274102);
        setElement(term274174, 5, term274102);
        setElement(term274174, 7, term274102);
        setElement(term274174, 9, term274102);
        setElement(term274174, 11, term274102);
        setElement(term274174, 13, term274102);
        setElement(term274174, 15, term274102);
        setElement(term274174, 17, term274102);
        setElement(term274174, 19, term274102);
        setElement(term274174, 21, term274102);
        setElement(term274174, 23, term274102);
        setElement(term274174, 25, term274102);
        setElement(term274174, 27, term274102);
        setElement(term274174, 29, term274102);
        setElement(term274174, 31, term274102);
        setElement(term274174, 33, term274102);
        setElement(term274174, 35, term274102);
        setElement(term274174, 37, term274102);
        setElement(term274174, 39, term274102);
        setField(term274129, term274129.getClass(), "wallOffsets", term274174);
        setField(term274129, term274129.getClass(), "lastRules", term274175);
        setField(term274176, term274176.getClass(), "table", null);
        setField(term274176, term274176.getClass(), "nextTable", null);
        setLongField(term274176, term274176.getClass(), "baseCount", 0L);
        setIntField(term274176, term274176.getClass(), "sizeCtl", 0);
        setIntField(term274176, term274176.getClass(), "transferIndex", 0);
        setIntField(term274176, term274176.getClass(), "cellsBusy", 0);
        setField(term274176, term274176.getClass(), "counterCells", null);
        setField(term274176, term274176.getClass(), "keySet", null);
        setField(term274176, term274176.getClass(), "values", null);
        setField(term274176, term274176.getClass(), "entrySet", null);
        setField(term274176, term274176.getClass(), "keySet", null);
        setField(term274176, term274176.getClass(), "values", null);
        setField(term274129, term274129.getClass(), "lastRulesCache", term274176);
        setField(term274112, term274112.getClass(), "rules", term274129);
        setField(term274091, term274091.getClass(), "zone", term274112);
        setField(term274001, term274001.getClass(), "time_stamp", term274091);
        setField(term274001, term274001.getClass(), "start_up_mode", "OZIAupXzmm");
        setField(term274001, term274001.getClass(), "cmm_dly_mod", "FYhlObvAKO");
        setField(term274001, term274001.getClass(), "cmm_dly_sec", "GFxNoBwsCD");
        setField(term274001, term274001.getClass(), "cmm_err_mod", "zBVQNMxMvk");
        setField(term274001, term274001.getClass(), "country_code", "iJSPWddhZO");
        setField(term274001, term274001.getClass(), "region_code", "WbvttDefvl");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.ingame.BuyCstmzItmRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStart_idx", argTypes, term274001, args);
    }

};


