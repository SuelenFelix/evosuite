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
import java.lang.Integer;

public class BuyCstmzItmRequest_setPdid_1583243665 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term275327;
     Object term275579;

    public BuyCstmzItmRequest_setPdid_1583243665() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term275327 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.ingame.BuyCstmzItmRequest"));
        Object term275417 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term275418 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term275419 = newInstance(Class.forName("java.time.LocalDate"));
        Object term275423 = newInstance(Class.forName("java.time.LocalTime"));
        Object term275428 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term275438 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term275455 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term275456 = (long[]) newLongArray(1);
        Object[] term275458 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term275459 = (long[]) newLongArray(39);
        Object[] term275499 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term275500 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term275501 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term275502 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setIntField(term275327, term275327.getClass(), "pd_id", 1425049877);
        setIntField(term275327, term275327.getClass(), "accept_idx", 1810111390);
        setIntField(term275327, term275327.getClass(), "start_idx", 1893467895);
        setIntField(term275327, term275327.getClass(), "cstmz_itm_id", 759796777);
        setIntField(term275327, term275327.getClass(), "cstmz_itm_price", 1909530475);
        setField(term275327, term275327.getClass(), "cmd", "ONkDXTThKL");
        setField(term275327, term275327.getClass(), "req_id", "AKbzAaAcmX");
        setField(term275327, term275327.getClass(), "game_id", "xiloHjgKux");
        setField(term275327, term275327.getClass(), "r_ver", "Pmajvqueiq");
        setField(term275327, term275327.getClass(), "kc_serial", "VjCLvZgmuN");
        setField(term275327, term275327.getClass(), "b_serial", "tQCalivCMp");
        setField(term275327, term275327.getClass(), "place_id", "fEiosUzVPM");
        setIntField(term275419, term275419.getClass(), "year", 2027);
        setShortField(term275419, term275419.getClass(), "month", (short) 1);
        setShortField(term275419, term275419.getClass(), "day", (short) 20);
        setField(term275418, term275418.getClass(), "date", term275419);
        setByteField(term275423, term275423.getClass(), "hour", (byte) 8);
        setByteField(term275423, term275423.getClass(), "minute", (byte) 5);
        setByteField(term275423, term275423.getClass(), "second", (byte) 44);
        setIntField(term275423, term275423.getClass(), "nano", 960768267);
        setField(term275418, term275418.getClass(), "time", term275423);
        setField(term275417, term275417.getClass(), "dateTime", term275418);
        setIntField(term275428, term275428.getClass(), "totalSeconds", -10800);
        setField(term275428, term275428.getClass(), "id", "-03:00");
        setField(term275417, term275417.getClass(), "offset", term275428);
        setField(term275438, term275438.getClass(), "id", "America/Recife");
        setLongElement(term275456, 0, -1767217224L);
        setField(term275455, term275455.getClass(), "standardTransitions", term275456);
        setElement(term275458, 1, term275428);
        setField(term275455, term275455.getClass(), "standardOffsets", term275458);
        setLongElement(term275459, 0, -1767217224L);
        setLongElement(term275459, 1, -1206957600L);
        setLongElement(term275459, 2, -1191362400L);
        setLongElement(term275459, 3, -1175374800L);
        setLongElement(term275459, 4, -1159826400L);
        setLongElement(term275459, 5, -633819600L);
        setLongElement(term275459, 6, -622069200L);
        setLongElement(term275459, 7, -602283600L);
        setLongElement(term275459, 8, -591832800L);
        setLongElement(term275459, 9, -570747600L);
        setLongElement(term275459, 10, -560210400L);
        setLongElement(term275459, 11, -539125200L);
        setLongElement(term275459, 12, -531352800L);
        setLongElement(term275459, 13, -191365200L);
        setLongElement(term275459, 14, -184197600L);
        setLongElement(term275459, 15, -155163600L);
        setLongElement(term275459, 16, -150069600L);
        setLongElement(term275459, 17, -128898000L);
        setLongElement(term275459, 18, -121125600L);
        setLongElement(term275459, 19, -99954000L);
        setLongElement(term275459, 20, -89589600L);
        setLongElement(term275459, 21, -68418000L);
        setLongElement(term275459, 22, -57967200L);
        setLongElement(term275459, 23, 499748400L);
        setLongElement(term275459, 24, 511236000L);
        setLongElement(term275459, 25, 530593200L);
        setLongElement(term275459, 26, 540266400L);
        setLongElement(term275459, 27, 562129200L);
        setLongElement(term275459, 28, 571197600L);
        setLongElement(term275459, 29, 592974000L);
        setLongElement(term275459, 30, 602042400L);
        setLongElement(term275459, 31, 624423600L);
        setLongElement(term275459, 32, 634701600L);
        setLongElement(term275459, 33, 938919600L);
        setLongElement(term275459, 34, 951616800L);
        setLongElement(term275459, 35, 970974000L);
        setLongElement(term275459, 36, 971575200L);
        setLongElement(term275459, 37, 1003028400L);
        setLongElement(term275459, 38, 1013911200L);
        setField(term275455, term275455.getClass(), "savingsInstantTransitions", term275459);
        setField(term275455, term275455.getClass(), "savingsLocalTransitions", term275499);
        setElement(term275500, 1, term275428);
        setElement(term275500, 3, term275428);
        setElement(term275500, 5, term275428);
        setElement(term275500, 7, term275428);
        setElement(term275500, 9, term275428);
        setElement(term275500, 11, term275428);
        setElement(term275500, 13, term275428);
        setElement(term275500, 15, term275428);
        setElement(term275500, 17, term275428);
        setElement(term275500, 19, term275428);
        setElement(term275500, 21, term275428);
        setElement(term275500, 23, term275428);
        setElement(term275500, 25, term275428);
        setElement(term275500, 27, term275428);
        setElement(term275500, 29, term275428);
        setElement(term275500, 31, term275428);
        setElement(term275500, 33, term275428);
        setElement(term275500, 35, term275428);
        setElement(term275500, 37, term275428);
        setElement(term275500, 39, term275428);
        setField(term275455, term275455.getClass(), "wallOffsets", term275500);
        setField(term275455, term275455.getClass(), "lastRules", term275501);
        setField(term275502, term275502.getClass(), "table", null);
        setField(term275502, term275502.getClass(), "nextTable", null);
        setLongField(term275502, term275502.getClass(), "baseCount", 0L);
        setIntField(term275502, term275502.getClass(), "sizeCtl", 0);
        setIntField(term275502, term275502.getClass(), "transferIndex", 0);
        setIntField(term275502, term275502.getClass(), "cellsBusy", 0);
        setField(term275502, term275502.getClass(), "counterCells", null);
        setField(term275502, term275502.getClass(), "keySet", null);
        setField(term275502, term275502.getClass(), "values", null);
        setField(term275502, term275502.getClass(), "entrySet", null);
        setField(term275502, term275502.getClass(), "keySet", null);
        setField(term275502, term275502.getClass(), "values", null);
        setField(term275455, term275455.getClass(), "lastRulesCache", term275502);
        setField(term275438, term275438.getClass(), "rules", term275455);
        setField(term275417, term275417.getClass(), "zone", term275438);
        setField(term275327, term275327.getClass(), "time_stamp", term275417);
        setField(term275327, term275327.getClass(), "start_up_mode", "USPyxkJGgn");
        setField(term275327, term275327.getClass(), "cmm_dly_mod", "VniuLGKjLe");
        setField(term275327, term275327.getClass(), "cmm_dly_sec", "nuzwgdczLX");
        setField(term275327, term275327.getClass(), "cmm_err_mod", "FdFPAsGWZj");
        setField(term275327, term275327.getClass(), "country_code", "sqctDxfcQV");
        setField(term275327, term275327.getClass(), "region_code", "KHXlwfHOLE");
        term275579 = new Integer(-1283945372);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.ingame.BuyCstmzItmRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term275579;
        callMethod(klass, "setPd_id", argTypes, term275327, args);
    }

};


