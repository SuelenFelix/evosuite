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

public class PvDefChrLstHandler_handle_19537833731 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5277;
     Object term5278;

    public PvDefChrLstHandler_handle_19537833731() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5277 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.handler.databank.PvDefChrLstHandler"));
        setField(term5277, term5277.getClass(), "mapper", null);
        term5278 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.BaseRequest"));
        Object term5363 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term5364 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5365 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5369 = newInstance(Class.forName("java.time.LocalTime"));
        Object term5374 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term5384 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term5401 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term5402 = (long[]) newLongArray(1);
        Object[] term5404 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term5405 = (long[]) newLongArray(39);
        Object[] term5445 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term5446 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term5447 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term5448 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term5278, term5278.getClass(), "cmd", "HHmNoYxIGj");
        setField(term5278, term5278.getClass(), "req_id", "PtirvZmsGt");
        setField(term5278, term5278.getClass(), "game_id", "HWkpTmtlrc");
        setField(term5278, term5278.getClass(), "r_ver", "hMmaoREuCK");
        setField(term5278, term5278.getClass(), "kc_serial", "VeDtgDzGAN");
        setField(term5278, term5278.getClass(), "b_serial", "aWYOWZFyaX");
        setField(term5278, term5278.getClass(), "place_id", "BRIVNtfUWU");
        setIntField(term5365, term5365.getClass(), "year", 2012);
        setShortField(term5365, term5365.getClass(), "month", (short) 9);
        setShortField(term5365, term5365.getClass(), "day", (short) 11);
        setField(term5364, term5364.getClass(), "date", term5365);
        setByteField(term5369, term5369.getClass(), "hour", (byte) 22);
        setByteField(term5369, term5369.getClass(), "minute", (byte) 10);
        setByteField(term5369, term5369.getClass(), "second", (byte) 8);
        setIntField(term5369, term5369.getClass(), "nano", 380008862);
        setField(term5364, term5364.getClass(), "time", term5369);
        setField(term5363, term5363.getClass(), "dateTime", term5364);
        setIntField(term5374, term5374.getClass(), "totalSeconds", -10800);
        setField(term5374, term5374.getClass(), "id", "-03:00");
        setField(term5363, term5363.getClass(), "offset", term5374);
        setField(term5384, term5384.getClass(), "id", "America/Recife");
        setLongElement(term5402, 0, -1767217224L);
        setField(term5401, term5401.getClass(), "standardTransitions", term5402);
        setElement(term5404, 1, term5374);
        setField(term5401, term5401.getClass(), "standardOffsets", term5404);
        setLongElement(term5405, 0, -1767217224L);
        setLongElement(term5405, 1, -1206957600L);
        setLongElement(term5405, 2, -1191362400L);
        setLongElement(term5405, 3, -1175374800L);
        setLongElement(term5405, 4, -1159826400L);
        setLongElement(term5405, 5, -633819600L);
        setLongElement(term5405, 6, -622069200L);
        setLongElement(term5405, 7, -602283600L);
        setLongElement(term5405, 8, -591832800L);
        setLongElement(term5405, 9, -570747600L);
        setLongElement(term5405, 10, -560210400L);
        setLongElement(term5405, 11, -539125200L);
        setLongElement(term5405, 12, -531352800L);
        setLongElement(term5405, 13, -191365200L);
        setLongElement(term5405, 14, -184197600L);
        setLongElement(term5405, 15, -155163600L);
        setLongElement(term5405, 16, -150069600L);
        setLongElement(term5405, 17, -128898000L);
        setLongElement(term5405, 18, -121125600L);
        setLongElement(term5405, 19, -99954000L);
        setLongElement(term5405, 20, -89589600L);
        setLongElement(term5405, 21, -68418000L);
        setLongElement(term5405, 22, -57967200L);
        setLongElement(term5405, 23, 499748400L);
        setLongElement(term5405, 24, 511236000L);
        setLongElement(term5405, 25, 530593200L);
        setLongElement(term5405, 26, 540266400L);
        setLongElement(term5405, 27, 562129200L);
        setLongElement(term5405, 28, 571197600L);
        setLongElement(term5405, 29, 592974000L);
        setLongElement(term5405, 30, 602042400L);
        setLongElement(term5405, 31, 624423600L);
        setLongElement(term5405, 32, 634701600L);
        setLongElement(term5405, 33, 938919600L);
        setLongElement(term5405, 34, 951616800L);
        setLongElement(term5405, 35, 970974000L);
        setLongElement(term5405, 36, 971575200L);
        setLongElement(term5405, 37, 1003028400L);
        setLongElement(term5405, 38, 1013911200L);
        setField(term5401, term5401.getClass(), "savingsInstantTransitions", term5405);
        setField(term5401, term5401.getClass(), "savingsLocalTransitions", term5445);
        setElement(term5446, 1, term5374);
        setElement(term5446, 3, term5374);
        setElement(term5446, 5, term5374);
        setElement(term5446, 7, term5374);
        setElement(term5446, 9, term5374);
        setElement(term5446, 11, term5374);
        setElement(term5446, 13, term5374);
        setElement(term5446, 15, term5374);
        setElement(term5446, 17, term5374);
        setElement(term5446, 19, term5374);
        setElement(term5446, 21, term5374);
        setElement(term5446, 23, term5374);
        setElement(term5446, 25, term5374);
        setElement(term5446, 27, term5374);
        setElement(term5446, 29, term5374);
        setElement(term5446, 31, term5374);
        setElement(term5446, 33, term5374);
        setElement(term5446, 35, term5374);
        setElement(term5446, 37, term5374);
        setElement(term5446, 39, term5374);
        setField(term5401, term5401.getClass(), "wallOffsets", term5446);
        setField(term5401, term5401.getClass(), "lastRules", term5447);
        setField(term5448, term5448.getClass(), "table", null);
        setField(term5448, term5448.getClass(), "nextTable", null);
        setLongField(term5448, term5448.getClass(), "baseCount", 0L);
        setIntField(term5448, term5448.getClass(), "sizeCtl", 0);
        setIntField(term5448, term5448.getClass(), "transferIndex", 0);
        setIntField(term5448, term5448.getClass(), "cellsBusy", 0);
        setField(term5448, term5448.getClass(), "counterCells", null);
        setField(term5448, term5448.getClass(), "keySet", null);
        setField(term5448, term5448.getClass(), "values", null);
        setField(term5448, term5448.getClass(), "entrySet", null);
        setField(term5448, term5448.getClass(), "keySet", null);
        setField(term5448, term5448.getClass(), "values", null);
        setField(term5401, term5401.getClass(), "lastRulesCache", term5448);
        setField(term5384, term5384.getClass(), "rules", term5401);
        setField(term5363, term5363.getClass(), "zone", term5384);
        setField(term5278, term5278.getClass(), "time_stamp", term5363);
        setField(term5278, term5278.getClass(), "start_up_mode", "DbiCVtPPCT");
        setField(term5278, term5278.getClass(), "cmm_dly_mod", "WzFopsaDuG");
        setField(term5278, term5278.getClass(), "cmm_dly_sec", "PapWxkhEWe");
        setField(term5278, term5278.getClass(), "cmm_err_mod", "smnHEqRFRx");
        setField(term5278, term5278.getClass(), "country_code", "XYtryyobou");
        setField(term5278, term5278.getClass(), "region_code", "OYbzXylRWW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.handler.databank.PvDefChrLstHandler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.diva.model.request.BaseRequest");
        Object[] args = new Object[1];
        args[0] = term5278;
        callMethod(klass, "handle", argTypes, term5277, args);
    }

};


