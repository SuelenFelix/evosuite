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

public class GetPvPdRequest_getPdid_10515751030 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term270367;

    public GetPvPdRequest_getPdid_10515751030() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term270367 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.ingame.GetPvPdRequest"));
        int[] term270370 = (int[]) newIntArray(8);
        Object term270463 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term270464 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term270465 = newInstance(Class.forName("java.time.LocalDate"));
        Object term270469 = newInstance(Class.forName("java.time.LocalTime"));
        Object term270474 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term270484 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term270501 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term270502 = (long[]) newLongArray(1);
        Object[] term270504 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term270505 = (long[]) newLongArray(39);
        Object[] term270545 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term270546 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term270547 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term270548 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setIntField(term270367, term270367.getClass(), "pd_id", 1303770980);
        setIntField(term270367, term270367.getClass(), "difficulty", 1031864540);
        setIntElement(term270370, 0, 1753896565);
        setIntElement(term270370, 1, -753765560);
        setIntElement(term270370, 2, 848046430);
        setIntElement(term270370, 3, 820651993);
        setIntElement(term270370, 4, 571120325);
        setIntElement(term270370, 5, 4423606);
        setIntElement(term270370, 6, 1864589561);
        setIntElement(term270370, 7, 102882854);
        setField(term270367, term270367.getClass(), "pd_pv_id_lst", term270370);
        setField(term270367, term270367.getClass(), "cmd", "OGWRelGqxR");
        setField(term270367, term270367.getClass(), "req_id", "fKSWVsjAjO");
        setField(term270367, term270367.getClass(), "game_id", "mgPzmcygcU");
        setField(term270367, term270367.getClass(), "r_ver", "mvEDoAbPuT");
        setField(term270367, term270367.getClass(), "kc_serial", "EUWHyMdRKl");
        setField(term270367, term270367.getClass(), "b_serial", "YsUKZpMHKF");
        setField(term270367, term270367.getClass(), "place_id", "sPGChMFTge");
        setIntField(term270465, term270465.getClass(), "year", 2020);
        setShortField(term270465, term270465.getClass(), "month", (short) 5);
        setShortField(term270465, term270465.getClass(), "day", (short) 31);
        setField(term270464, term270464.getClass(), "date", term270465);
        setByteField(term270469, term270469.getClass(), "hour", (byte) 17);
        setByteField(term270469, term270469.getClass(), "minute", (byte) 5);
        setByteField(term270469, term270469.getClass(), "second", (byte) 38);
        setIntField(term270469, term270469.getClass(), "nano", 709012300);
        setField(term270464, term270464.getClass(), "time", term270469);
        setField(term270463, term270463.getClass(), "dateTime", term270464);
        setIntField(term270474, term270474.getClass(), "totalSeconds", -10800);
        setField(term270474, term270474.getClass(), "id", "-03:00");
        setField(term270463, term270463.getClass(), "offset", term270474);
        setField(term270484, term270484.getClass(), "id", "America/Recife");
        setLongElement(term270502, 0, -1767217224L);
        setField(term270501, term270501.getClass(), "standardTransitions", term270502);
        setElement(term270504, 1, term270474);
        setField(term270501, term270501.getClass(), "standardOffsets", term270504);
        setLongElement(term270505, 0, -1767217224L);
        setLongElement(term270505, 1, -1206957600L);
        setLongElement(term270505, 2, -1191362400L);
        setLongElement(term270505, 3, -1175374800L);
        setLongElement(term270505, 4, -1159826400L);
        setLongElement(term270505, 5, -633819600L);
        setLongElement(term270505, 6, -622069200L);
        setLongElement(term270505, 7, -602283600L);
        setLongElement(term270505, 8, -591832800L);
        setLongElement(term270505, 9, -570747600L);
        setLongElement(term270505, 10, -560210400L);
        setLongElement(term270505, 11, -539125200L);
        setLongElement(term270505, 12, -531352800L);
        setLongElement(term270505, 13, -191365200L);
        setLongElement(term270505, 14, -184197600L);
        setLongElement(term270505, 15, -155163600L);
        setLongElement(term270505, 16, -150069600L);
        setLongElement(term270505, 17, -128898000L);
        setLongElement(term270505, 18, -121125600L);
        setLongElement(term270505, 19, -99954000L);
        setLongElement(term270505, 20, -89589600L);
        setLongElement(term270505, 21, -68418000L);
        setLongElement(term270505, 22, -57967200L);
        setLongElement(term270505, 23, 499748400L);
        setLongElement(term270505, 24, 511236000L);
        setLongElement(term270505, 25, 530593200L);
        setLongElement(term270505, 26, 540266400L);
        setLongElement(term270505, 27, 562129200L);
        setLongElement(term270505, 28, 571197600L);
        setLongElement(term270505, 29, 592974000L);
        setLongElement(term270505, 30, 602042400L);
        setLongElement(term270505, 31, 624423600L);
        setLongElement(term270505, 32, 634701600L);
        setLongElement(term270505, 33, 938919600L);
        setLongElement(term270505, 34, 951616800L);
        setLongElement(term270505, 35, 970974000L);
        setLongElement(term270505, 36, 971575200L);
        setLongElement(term270505, 37, 1003028400L);
        setLongElement(term270505, 38, 1013911200L);
        setField(term270501, term270501.getClass(), "savingsInstantTransitions", term270505);
        setField(term270501, term270501.getClass(), "savingsLocalTransitions", term270545);
        setElement(term270546, 1, term270474);
        setElement(term270546, 3, term270474);
        setElement(term270546, 5, term270474);
        setElement(term270546, 7, term270474);
        setElement(term270546, 9, term270474);
        setElement(term270546, 11, term270474);
        setElement(term270546, 13, term270474);
        setElement(term270546, 15, term270474);
        setElement(term270546, 17, term270474);
        setElement(term270546, 19, term270474);
        setElement(term270546, 21, term270474);
        setElement(term270546, 23, term270474);
        setElement(term270546, 25, term270474);
        setElement(term270546, 27, term270474);
        setElement(term270546, 29, term270474);
        setElement(term270546, 31, term270474);
        setElement(term270546, 33, term270474);
        setElement(term270546, 35, term270474);
        setElement(term270546, 37, term270474);
        setElement(term270546, 39, term270474);
        setField(term270501, term270501.getClass(), "wallOffsets", term270546);
        setField(term270501, term270501.getClass(), "lastRules", term270547);
        setField(term270548, term270548.getClass(), "table", null);
        setField(term270548, term270548.getClass(), "nextTable", null);
        setLongField(term270548, term270548.getClass(), "baseCount", 0L);
        setIntField(term270548, term270548.getClass(), "sizeCtl", 0);
        setIntField(term270548, term270548.getClass(), "transferIndex", 0);
        setIntField(term270548, term270548.getClass(), "cellsBusy", 0);
        setField(term270548, term270548.getClass(), "counterCells", null);
        setField(term270548, term270548.getClass(), "keySet", null);
        setField(term270548, term270548.getClass(), "values", null);
        setField(term270548, term270548.getClass(), "entrySet", null);
        setField(term270548, term270548.getClass(), "keySet", null);
        setField(term270548, term270548.getClass(), "values", null);
        setField(term270501, term270501.getClass(), "lastRulesCache", term270548);
        setField(term270484, term270484.getClass(), "rules", term270501);
        setField(term270463, term270463.getClass(), "zone", term270484);
        setField(term270367, term270367.getClass(), "time_stamp", term270463);
        setField(term270367, term270367.getClass(), "start_up_mode", "DYmBIVURjz");
        setField(term270367, term270367.getClass(), "cmm_dly_mod", "BotFhHNSzH");
        setField(term270367, term270367.getClass(), "cmm_dly_sec", "LcLfqpnOTW");
        setField(term270367, term270367.getClass(), "cmm_err_mod", "hGwBHMBbGw");
        setField(term270367, term270367.getClass(), "country_code", "CzTiZXTrcB");
        setField(term270367, term270367.getClass(), "region_code", "HOEmWmVnLk");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.ingame.GetPvPdRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPd_id", argTypes, term270367, args);
    }

};


