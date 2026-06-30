package icu.samnyan.aqua.sega.diva.handler.card;

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
import static icu.samnyan.aqua.sega.diva.handler.card.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ChangeNameHandler_handle_9185056560 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1123;

    public ChangeNameHandler_handle_9185056560() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1123 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.ChangeNameRequest"));
        Object term1248 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term1249 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1250 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1254 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1259 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term1269 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term1286 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term1287 = (long[]) newLongArray(1);
        Object[] term1289 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term1290 = (long[]) newLongArray(39);
        Object[] term1330 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term1331 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term1332 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term1333 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term1123, term1123.getClass(), "a_code", "IDCWpPLRkE");
        setIntField(term1123, term1123.getClass(), "aime_id", 391863371);
        setField(term1123, term1123.getClass(), "aime_a_code", "nyiiPDVjAc");
        setIntField(term1123, term1123.getClass(), "pd_id", -1922583790);
        setIntField(term1123, term1123.getClass(), "accept_idx", -616727354);
        setField(term1123, term1123.getClass(), "player_name", "aKnKipADSo");
        setIntField(term1123, term1123.getClass(), "chg_name_price", -1955890973);
        setField(term1123, term1123.getClass(), "cmd", "wSQxaModmm");
        setField(term1123, term1123.getClass(), "req_id", "UlajhuVLaP");
        setField(term1123, term1123.getClass(), "game_id", "gGSMzuGICf");
        setField(term1123, term1123.getClass(), "r_ver", "hxCBltsObl");
        setField(term1123, term1123.getClass(), "kc_serial", "BndsHwAFMv");
        setField(term1123, term1123.getClass(), "b_serial", "GzFkzHGYFt");
        setField(term1123, term1123.getClass(), "place_id", "tShwQLRGNe");
        setIntField(term1250, term1250.getClass(), "year", 2015);
        setShortField(term1250, term1250.getClass(), "month", (short) 9);
        setShortField(term1250, term1250.getClass(), "day", (short) 19);
        setField(term1249, term1249.getClass(), "date", term1250);
        setByteField(term1254, term1254.getClass(), "hour", (byte) 9);
        setByteField(term1254, term1254.getClass(), "minute", (byte) 4);
        setByteField(term1254, term1254.getClass(), "second", (byte) 10);
        setIntField(term1254, term1254.getClass(), "nano", 401765865);
        setField(term1249, term1249.getClass(), "time", term1254);
        setField(term1248, term1248.getClass(), "dateTime", term1249);
        setIntField(term1259, term1259.getClass(), "totalSeconds", -10800);
        setField(term1259, term1259.getClass(), "id", "-03:00");
        setField(term1248, term1248.getClass(), "offset", term1259);
        setField(term1269, term1269.getClass(), "id", "America/Recife");
        setLongElement(term1287, 0, -1767217224L);
        setField(term1286, term1286.getClass(), "standardTransitions", term1287);
        setElement(term1289, 1, term1259);
        setField(term1286, term1286.getClass(), "standardOffsets", term1289);
        setLongElement(term1290, 0, -1767217224L);
        setLongElement(term1290, 1, -1206957600L);
        setLongElement(term1290, 2, -1191362400L);
        setLongElement(term1290, 3, -1175374800L);
        setLongElement(term1290, 4, -1159826400L);
        setLongElement(term1290, 5, -633819600L);
        setLongElement(term1290, 6, -622069200L);
        setLongElement(term1290, 7, -602283600L);
        setLongElement(term1290, 8, -591832800L);
        setLongElement(term1290, 9, -570747600L);
        setLongElement(term1290, 10, -560210400L);
        setLongElement(term1290, 11, -539125200L);
        setLongElement(term1290, 12, -531352800L);
        setLongElement(term1290, 13, -191365200L);
        setLongElement(term1290, 14, -184197600L);
        setLongElement(term1290, 15, -155163600L);
        setLongElement(term1290, 16, -150069600L);
        setLongElement(term1290, 17, -128898000L);
        setLongElement(term1290, 18, -121125600L);
        setLongElement(term1290, 19, -99954000L);
        setLongElement(term1290, 20, -89589600L);
        setLongElement(term1290, 21, -68418000L);
        setLongElement(term1290, 22, -57967200L);
        setLongElement(term1290, 23, 499748400L);
        setLongElement(term1290, 24, 511236000L);
        setLongElement(term1290, 25, 530593200L);
        setLongElement(term1290, 26, 540266400L);
        setLongElement(term1290, 27, 562129200L);
        setLongElement(term1290, 28, 571197600L);
        setLongElement(term1290, 29, 592974000L);
        setLongElement(term1290, 30, 602042400L);
        setLongElement(term1290, 31, 624423600L);
        setLongElement(term1290, 32, 634701600L);
        setLongElement(term1290, 33, 938919600L);
        setLongElement(term1290, 34, 951616800L);
        setLongElement(term1290, 35, 970974000L);
        setLongElement(term1290, 36, 971575200L);
        setLongElement(term1290, 37, 1003028400L);
        setLongElement(term1290, 38, 1013911200L);
        setField(term1286, term1286.getClass(), "savingsInstantTransitions", term1290);
        setField(term1286, term1286.getClass(), "savingsLocalTransitions", term1330);
        setElement(term1331, 1, term1259);
        setElement(term1331, 3, term1259);
        setElement(term1331, 5, term1259);
        setElement(term1331, 7, term1259);
        setElement(term1331, 9, term1259);
        setElement(term1331, 11, term1259);
        setElement(term1331, 13, term1259);
        setElement(term1331, 15, term1259);
        setElement(term1331, 17, term1259);
        setElement(term1331, 19, term1259);
        setElement(term1331, 21, term1259);
        setElement(term1331, 23, term1259);
        setElement(term1331, 25, term1259);
        setElement(term1331, 27, term1259);
        setElement(term1331, 29, term1259);
        setElement(term1331, 31, term1259);
        setElement(term1331, 33, term1259);
        setElement(term1331, 35, term1259);
        setElement(term1331, 37, term1259);
        setElement(term1331, 39, term1259);
        setField(term1286, term1286.getClass(), "wallOffsets", term1331);
        setField(term1286, term1286.getClass(), "lastRules", term1332);
        setField(term1333, term1333.getClass(), "table", null);
        setField(term1333, term1333.getClass(), "nextTable", null);
        setLongField(term1333, term1333.getClass(), "baseCount", 0L);
        setIntField(term1333, term1333.getClass(), "sizeCtl", 0);
        setIntField(term1333, term1333.getClass(), "transferIndex", 0);
        setIntField(term1333, term1333.getClass(), "cellsBusy", 0);
        setField(term1333, term1333.getClass(), "counterCells", null);
        setField(term1333, term1333.getClass(), "keySet", null);
        setField(term1333, term1333.getClass(), "values", null);
        setField(term1333, term1333.getClass(), "entrySet", null);
        setField(term1333, term1333.getClass(), "keySet", null);
        setField(term1333, term1333.getClass(), "values", null);
        setField(term1286, term1286.getClass(), "lastRulesCache", term1333);
        setField(term1269, term1269.getClass(), "rules", term1286);
        setField(term1248, term1248.getClass(), "zone", term1269);
        setField(term1123, term1123.getClass(), "time_stamp", term1248);
        setField(term1123, term1123.getClass(), "start_up_mode", "LvtrsXUliU");
        setField(term1123, term1123.getClass(), "cmm_dly_mod", "xLbjWUgOIL");
        setField(term1123, term1123.getClass(), "cmm_dly_sec", "jDtqGUpnZN");
        setField(term1123, term1123.getClass(), "cmm_err_mod", "nGKItKLYNC");
        setField(term1123, term1123.getClass(), "country_code", "UiUYnPrcCi");
        setField(term1123, term1123.getClass(), "region_code", "UoYtihxVaS");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.handler.card.ChangeNameHandler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.ChangeNameRequest");
        Object[] args = new Object[1];
        args[0] = term1123;
        callMethod(klass, "handle", argTypes, null, args);
    }

};


