package icu.samnyan.aqua.sega.diva.handler.databank;

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
import static icu.samnyan.aqua.sega.diva.handler.databank.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ShopCatalogHandler_handle_20396988650 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term451;

    public ShopCatalogHandler_handle_20396988650() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term451 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.BaseRequest"));
        Object term536 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term537 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term538 = newInstance(Class.forName("java.time.LocalDate"));
        Object term542 = newInstance(Class.forName("java.time.LocalTime"));
        Object term547 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term557 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term574 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term575 = (long[]) newLongArray(1);
        Object[] term577 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term578 = (long[]) newLongArray(39);
        Object[] term618 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term619 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term620 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term621 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term451, term451.getClass(), "cmd", "LQFpaHEwXR");
        setField(term451, term451.getClass(), "req_id", "oVcInYnLWB");
        setField(term451, term451.getClass(), "game_id", "aJlieCFVtF");
        setField(term451, term451.getClass(), "r_ver", "ZiaGIbnzTs");
        setField(term451, term451.getClass(), "kc_serial", "tbcdzjIfER");
        setField(term451, term451.getClass(), "b_serial", "HyxfbSQYBe");
        setField(term451, term451.getClass(), "place_id", "pCTimMblYc");
        setIntField(term538, term538.getClass(), "year", 2021);
        setShortField(term538, term538.getClass(), "month", (short) 1);
        setShortField(term538, term538.getClass(), "day", (short) 18);
        setField(term537, term537.getClass(), "date", term538);
        setByteField(term542, term542.getClass(), "hour", (byte) 13);
        setByteField(term542, term542.getClass(), "minute", (byte) 38);
        setByteField(term542, term542.getClass(), "second", (byte) 26);
        setIntField(term542, term542.getClass(), "nano", 544608644);
        setField(term537, term537.getClass(), "time", term542);
        setField(term536, term536.getClass(), "dateTime", term537);
        setIntField(term547, term547.getClass(), "totalSeconds", -10800);
        setField(term547, term547.getClass(), "id", "-03:00");
        setField(term536, term536.getClass(), "offset", term547);
        setField(term557, term557.getClass(), "id", "America/Recife");
        setLongElement(term575, 0, -1767217224L);
        setField(term574, term574.getClass(), "standardTransitions", term575);
        setElement(term577, 1, term547);
        setField(term574, term574.getClass(), "standardOffsets", term577);
        setLongElement(term578, 0, -1767217224L);
        setLongElement(term578, 1, -1206957600L);
        setLongElement(term578, 2, -1191362400L);
        setLongElement(term578, 3, -1175374800L);
        setLongElement(term578, 4, -1159826400L);
        setLongElement(term578, 5, -633819600L);
        setLongElement(term578, 6, -622069200L);
        setLongElement(term578, 7, -602283600L);
        setLongElement(term578, 8, -591832800L);
        setLongElement(term578, 9, -570747600L);
        setLongElement(term578, 10, -560210400L);
        setLongElement(term578, 11, -539125200L);
        setLongElement(term578, 12, -531352800L);
        setLongElement(term578, 13, -191365200L);
        setLongElement(term578, 14, -184197600L);
        setLongElement(term578, 15, -155163600L);
        setLongElement(term578, 16, -150069600L);
        setLongElement(term578, 17, -128898000L);
        setLongElement(term578, 18, -121125600L);
        setLongElement(term578, 19, -99954000L);
        setLongElement(term578, 20, -89589600L);
        setLongElement(term578, 21, -68418000L);
        setLongElement(term578, 22, -57967200L);
        setLongElement(term578, 23, 499748400L);
        setLongElement(term578, 24, 511236000L);
        setLongElement(term578, 25, 530593200L);
        setLongElement(term578, 26, 540266400L);
        setLongElement(term578, 27, 562129200L);
        setLongElement(term578, 28, 571197600L);
        setLongElement(term578, 29, 592974000L);
        setLongElement(term578, 30, 602042400L);
        setLongElement(term578, 31, 624423600L);
        setLongElement(term578, 32, 634701600L);
        setLongElement(term578, 33, 938919600L);
        setLongElement(term578, 34, 951616800L);
        setLongElement(term578, 35, 970974000L);
        setLongElement(term578, 36, 971575200L);
        setLongElement(term578, 37, 1003028400L);
        setLongElement(term578, 38, 1013911200L);
        setField(term574, term574.getClass(), "savingsInstantTransitions", term578);
        setField(term574, term574.getClass(), "savingsLocalTransitions", term618);
        setElement(term619, 1, term547);
        setElement(term619, 3, term547);
        setElement(term619, 5, term547);
        setElement(term619, 7, term547);
        setElement(term619, 9, term547);
        setElement(term619, 11, term547);
        setElement(term619, 13, term547);
        setElement(term619, 15, term547);
        setElement(term619, 17, term547);
        setElement(term619, 19, term547);
        setElement(term619, 21, term547);
        setElement(term619, 23, term547);
        setElement(term619, 25, term547);
        setElement(term619, 27, term547);
        setElement(term619, 29, term547);
        setElement(term619, 31, term547);
        setElement(term619, 33, term547);
        setElement(term619, 35, term547);
        setElement(term619, 37, term547);
        setElement(term619, 39, term547);
        setField(term574, term574.getClass(), "wallOffsets", term619);
        setField(term574, term574.getClass(), "lastRules", term620);
        setField(term621, term621.getClass(), "table", null);
        setField(term621, term621.getClass(), "nextTable", null);
        setLongField(term621, term621.getClass(), "baseCount", 0L);
        setIntField(term621, term621.getClass(), "sizeCtl", 0);
        setIntField(term621, term621.getClass(), "transferIndex", 0);
        setIntField(term621, term621.getClass(), "cellsBusy", 0);
        setField(term621, term621.getClass(), "counterCells", null);
        setField(term621, term621.getClass(), "keySet", null);
        setField(term621, term621.getClass(), "values", null);
        setField(term621, term621.getClass(), "entrySet", null);
        setField(term621, term621.getClass(), "keySet", null);
        setField(term621, term621.getClass(), "values", null);
        setField(term574, term574.getClass(), "lastRulesCache", term621);
        setField(term557, term557.getClass(), "rules", term574);
        setField(term536, term536.getClass(), "zone", term557);
        setField(term451, term451.getClass(), "time_stamp", term536);
        setField(term451, term451.getClass(), "start_up_mode", "hNxWaHcfhY");
        setField(term451, term451.getClass(), "cmm_dly_mod", "RkybSrpybU");
        setField(term451, term451.getClass(), "cmm_dly_sec", "xOEqzGAmDU");
        setField(term451, term451.getClass(), "cmm_err_mod", "eZFUvlxvGV");
        setField(term451, term451.getClass(), "country_code", "BYqFIqCKAV");
        setField(term451, term451.getClass(), "region_code", "vrQLuWIDJX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.handler.databank.ShopCatalogHandler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.diva.model.request.BaseRequest");
        Object[] args = new Object[1];
        args[0] = term451;
        callMethod(klass, "handle", argTypes, null, args);
    }

};


