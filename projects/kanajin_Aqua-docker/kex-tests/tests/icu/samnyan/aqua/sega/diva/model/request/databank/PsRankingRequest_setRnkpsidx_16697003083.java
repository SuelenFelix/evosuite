package icu.samnyan.aqua.sega.diva.model.request.databank;

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
import static icu.samnyan.aqua.sega.diva.model.request.databank.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class PsRankingRequest_setRnkpsidx_16697003083 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1351;
     Object term1601;

    public PsRankingRequest_setRnkpsidx_16697003083() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1351 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.databank.PsRankingRequest"));
        int[] term1352 = (int[]) newIntArray(1);
        Object term1439 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term1440 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1441 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1445 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1450 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term1460 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term1477 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term1478 = (long[]) newLongArray(1);
        Object[] term1480 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term1481 = (long[]) newLongArray(39);
        Object[] term1521 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term1522 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term1523 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term1524 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setIntElement(term1352, 0, 1048535127);
        setField(term1351, term1351.getClass(), "rnk_ps_pv_id_lst", term1352);
        setIntField(term1351, term1351.getClass(), "rnk_ps_idx", -655067527);
        setField(term1351, term1351.getClass(), "cmd", "aKnKipADSo");
        setField(term1351, term1351.getClass(), "req_id", "wSQxaModmm");
        setField(term1351, term1351.getClass(), "game_id", "UlajhuVLaP");
        setField(term1351, term1351.getClass(), "r_ver", "gGSMzuGICf");
        setField(term1351, term1351.getClass(), "kc_serial", "hxCBltsObl");
        setField(term1351, term1351.getClass(), "b_serial", "BndsHwAFMv");
        setField(term1351, term1351.getClass(), "place_id", "GzFkzHGYFt");
        setIntField(term1441, term1441.getClass(), "year", 2015);
        setShortField(term1441, term1441.getClass(), "month", (short) 4);
        setShortField(term1441, term1441.getClass(), "day", (short) 14);
        setField(term1440, term1440.getClass(), "date", term1441);
        setByteField(term1445, term1445.getClass(), "hour", (byte) 18);
        setByteField(term1445, term1445.getClass(), "minute", (byte) 24);
        setByteField(term1445, term1445.getClass(), "second", (byte) 32);
        setIntField(term1445, term1445.getClass(), "nano", 369233818);
        setField(term1440, term1440.getClass(), "time", term1445);
        setField(term1439, term1439.getClass(), "dateTime", term1440);
        setIntField(term1450, term1450.getClass(), "totalSeconds", -10800);
        setField(term1450, term1450.getClass(), "id", "-03:00");
        setField(term1439, term1439.getClass(), "offset", term1450);
        setField(term1460, term1460.getClass(), "id", "America/Recife");
        setLongElement(term1478, 0, -1767217224L);
        setField(term1477, term1477.getClass(), "standardTransitions", term1478);
        setElement(term1480, 1, term1450);
        setField(term1477, term1477.getClass(), "standardOffsets", term1480);
        setLongElement(term1481, 0, -1767217224L);
        setLongElement(term1481, 1, -1206957600L);
        setLongElement(term1481, 2, -1191362400L);
        setLongElement(term1481, 3, -1175374800L);
        setLongElement(term1481, 4, -1159826400L);
        setLongElement(term1481, 5, -633819600L);
        setLongElement(term1481, 6, -622069200L);
        setLongElement(term1481, 7, -602283600L);
        setLongElement(term1481, 8, -591832800L);
        setLongElement(term1481, 9, -570747600L);
        setLongElement(term1481, 10, -560210400L);
        setLongElement(term1481, 11, -539125200L);
        setLongElement(term1481, 12, -531352800L);
        setLongElement(term1481, 13, -191365200L);
        setLongElement(term1481, 14, -184197600L);
        setLongElement(term1481, 15, -155163600L);
        setLongElement(term1481, 16, -150069600L);
        setLongElement(term1481, 17, -128898000L);
        setLongElement(term1481, 18, -121125600L);
        setLongElement(term1481, 19, -99954000L);
        setLongElement(term1481, 20, -89589600L);
        setLongElement(term1481, 21, -68418000L);
        setLongElement(term1481, 22, -57967200L);
        setLongElement(term1481, 23, 499748400L);
        setLongElement(term1481, 24, 511236000L);
        setLongElement(term1481, 25, 530593200L);
        setLongElement(term1481, 26, 540266400L);
        setLongElement(term1481, 27, 562129200L);
        setLongElement(term1481, 28, 571197600L);
        setLongElement(term1481, 29, 592974000L);
        setLongElement(term1481, 30, 602042400L);
        setLongElement(term1481, 31, 624423600L);
        setLongElement(term1481, 32, 634701600L);
        setLongElement(term1481, 33, 938919600L);
        setLongElement(term1481, 34, 951616800L);
        setLongElement(term1481, 35, 970974000L);
        setLongElement(term1481, 36, 971575200L);
        setLongElement(term1481, 37, 1003028400L);
        setLongElement(term1481, 38, 1013911200L);
        setField(term1477, term1477.getClass(), "savingsInstantTransitions", term1481);
        setField(term1477, term1477.getClass(), "savingsLocalTransitions", term1521);
        setElement(term1522, 1, term1450);
        setElement(term1522, 3, term1450);
        setElement(term1522, 5, term1450);
        setElement(term1522, 7, term1450);
        setElement(term1522, 9, term1450);
        setElement(term1522, 11, term1450);
        setElement(term1522, 13, term1450);
        setElement(term1522, 15, term1450);
        setElement(term1522, 17, term1450);
        setElement(term1522, 19, term1450);
        setElement(term1522, 21, term1450);
        setElement(term1522, 23, term1450);
        setElement(term1522, 25, term1450);
        setElement(term1522, 27, term1450);
        setElement(term1522, 29, term1450);
        setElement(term1522, 31, term1450);
        setElement(term1522, 33, term1450);
        setElement(term1522, 35, term1450);
        setElement(term1522, 37, term1450);
        setElement(term1522, 39, term1450);
        setField(term1477, term1477.getClass(), "wallOffsets", term1522);
        setField(term1477, term1477.getClass(), "lastRules", term1523);
        setField(term1524, term1524.getClass(), "table", null);
        setField(term1524, term1524.getClass(), "nextTable", null);
        setLongField(term1524, term1524.getClass(), "baseCount", 0L);
        setIntField(term1524, term1524.getClass(), "sizeCtl", 0);
        setIntField(term1524, term1524.getClass(), "transferIndex", 0);
        setIntField(term1524, term1524.getClass(), "cellsBusy", 0);
        setField(term1524, term1524.getClass(), "counterCells", null);
        setField(term1524, term1524.getClass(), "keySet", null);
        setField(term1524, term1524.getClass(), "values", null);
        setField(term1524, term1524.getClass(), "entrySet", null);
        setField(term1524, term1524.getClass(), "keySet", null);
        setField(term1524, term1524.getClass(), "values", null);
        setField(term1477, term1477.getClass(), "lastRulesCache", term1524);
        setField(term1460, term1460.getClass(), "rules", term1477);
        setField(term1439, term1439.getClass(), "zone", term1460);
        setField(term1351, term1351.getClass(), "time_stamp", term1439);
        setField(term1351, term1351.getClass(), "start_up_mode", "tShwQLRGNe");
        setField(term1351, term1351.getClass(), "cmm_dly_mod", "LvtrsXUliU");
        setField(term1351, term1351.getClass(), "cmm_dly_sec", "xLbjWUgOIL");
        setField(term1351, term1351.getClass(), "cmm_err_mod", "jDtqGUpnZN");
        setField(term1351, term1351.getClass(), "country_code", "nGKItKLYNC");
        setField(term1351, term1351.getClass(), "region_code", "UiUYnPrcCi");
        term1601 = new Integer(-6029667);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.databank.PsRankingRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1601;
        callMethod(klass, "setRnk_ps_idx", argTypes, term1351, args);
    }

};


