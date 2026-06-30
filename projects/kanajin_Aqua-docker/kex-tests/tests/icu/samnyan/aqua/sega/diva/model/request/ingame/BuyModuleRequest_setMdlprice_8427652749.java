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

public class BuyModuleRequest_setMdlprice_8427652749 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term258379;
     Object term258631;

    public BuyModuleRequest_setMdlprice_8427652749() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term258379 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.ingame.BuyModuleRequest"));
        Object term258469 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term258470 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term258471 = newInstance(Class.forName("java.time.LocalDate"));
        Object term258475 = newInstance(Class.forName("java.time.LocalTime"));
        Object term258480 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term258490 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term258507 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term258508 = (long[]) newLongArray(1);
        Object[] term258510 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term258511 = (long[]) newLongArray(39);
        Object[] term258551 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term258552 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term258553 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term258554 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setIntField(term258379, term258379.getClass(), "pd_id", 1463985114);
        setIntField(term258379, term258379.getClass(), "accept_idx", 1088384689);
        setIntField(term258379, term258379.getClass(), "start_idx", -846282370);
        setIntField(term258379, term258379.getClass(), "mdl_id", -2112056147);
        setIntField(term258379, term258379.getClass(), "mdl_price", -125183551);
        setField(term258379, term258379.getClass(), "cmd", "pZsKceaypG");
        setField(term258379, term258379.getClass(), "req_id", "XZfWiBghln");
        setField(term258379, term258379.getClass(), "game_id", "mzCiczKZrz");
        setField(term258379, term258379.getClass(), "r_ver", "KHTorTPpue");
        setField(term258379, term258379.getClass(), "kc_serial", "UZGFzJfIBQ");
        setField(term258379, term258379.getClass(), "b_serial", "HVZdePgPWv");
        setField(term258379, term258379.getClass(), "place_id", "VhpcclRPZX");
        setIntField(term258471, term258471.getClass(), "year", 2029);
        setShortField(term258471, term258471.getClass(), "month", (short) 8);
        setShortField(term258471, term258471.getClass(), "day", (short) 14);
        setField(term258470, term258470.getClass(), "date", term258471);
        setByteField(term258475, term258475.getClass(), "hour", (byte) 10);
        setByteField(term258475, term258475.getClass(), "minute", (byte) 28);
        setByteField(term258475, term258475.getClass(), "second", (byte) 23);
        setIntField(term258475, term258475.getClass(), "nano", 676524979);
        setField(term258470, term258470.getClass(), "time", term258475);
        setField(term258469, term258469.getClass(), "dateTime", term258470);
        setIntField(term258480, term258480.getClass(), "totalSeconds", -10800);
        setField(term258480, term258480.getClass(), "id", "-03:00");
        setField(term258469, term258469.getClass(), "offset", term258480);
        setField(term258490, term258490.getClass(), "id", "America/Recife");
        setLongElement(term258508, 0, -1767217224L);
        setField(term258507, term258507.getClass(), "standardTransitions", term258508);
        setElement(term258510, 1, term258480);
        setField(term258507, term258507.getClass(), "standardOffsets", term258510);
        setLongElement(term258511, 0, -1767217224L);
        setLongElement(term258511, 1, -1206957600L);
        setLongElement(term258511, 2, -1191362400L);
        setLongElement(term258511, 3, -1175374800L);
        setLongElement(term258511, 4, -1159826400L);
        setLongElement(term258511, 5, -633819600L);
        setLongElement(term258511, 6, -622069200L);
        setLongElement(term258511, 7, -602283600L);
        setLongElement(term258511, 8, -591832800L);
        setLongElement(term258511, 9, -570747600L);
        setLongElement(term258511, 10, -560210400L);
        setLongElement(term258511, 11, -539125200L);
        setLongElement(term258511, 12, -531352800L);
        setLongElement(term258511, 13, -191365200L);
        setLongElement(term258511, 14, -184197600L);
        setLongElement(term258511, 15, -155163600L);
        setLongElement(term258511, 16, -150069600L);
        setLongElement(term258511, 17, -128898000L);
        setLongElement(term258511, 18, -121125600L);
        setLongElement(term258511, 19, -99954000L);
        setLongElement(term258511, 20, -89589600L);
        setLongElement(term258511, 21, -68418000L);
        setLongElement(term258511, 22, -57967200L);
        setLongElement(term258511, 23, 499748400L);
        setLongElement(term258511, 24, 511236000L);
        setLongElement(term258511, 25, 530593200L);
        setLongElement(term258511, 26, 540266400L);
        setLongElement(term258511, 27, 562129200L);
        setLongElement(term258511, 28, 571197600L);
        setLongElement(term258511, 29, 592974000L);
        setLongElement(term258511, 30, 602042400L);
        setLongElement(term258511, 31, 624423600L);
        setLongElement(term258511, 32, 634701600L);
        setLongElement(term258511, 33, 938919600L);
        setLongElement(term258511, 34, 951616800L);
        setLongElement(term258511, 35, 970974000L);
        setLongElement(term258511, 36, 971575200L);
        setLongElement(term258511, 37, 1003028400L);
        setLongElement(term258511, 38, 1013911200L);
        setField(term258507, term258507.getClass(), "savingsInstantTransitions", term258511);
        setField(term258507, term258507.getClass(), "savingsLocalTransitions", term258551);
        setElement(term258552, 1, term258480);
        setElement(term258552, 3, term258480);
        setElement(term258552, 5, term258480);
        setElement(term258552, 7, term258480);
        setElement(term258552, 9, term258480);
        setElement(term258552, 11, term258480);
        setElement(term258552, 13, term258480);
        setElement(term258552, 15, term258480);
        setElement(term258552, 17, term258480);
        setElement(term258552, 19, term258480);
        setElement(term258552, 21, term258480);
        setElement(term258552, 23, term258480);
        setElement(term258552, 25, term258480);
        setElement(term258552, 27, term258480);
        setElement(term258552, 29, term258480);
        setElement(term258552, 31, term258480);
        setElement(term258552, 33, term258480);
        setElement(term258552, 35, term258480);
        setElement(term258552, 37, term258480);
        setElement(term258552, 39, term258480);
        setField(term258507, term258507.getClass(), "wallOffsets", term258552);
        setField(term258507, term258507.getClass(), "lastRules", term258553);
        setField(term258554, term258554.getClass(), "table", null);
        setField(term258554, term258554.getClass(), "nextTable", null);
        setLongField(term258554, term258554.getClass(), "baseCount", 0L);
        setIntField(term258554, term258554.getClass(), "sizeCtl", 0);
        setIntField(term258554, term258554.getClass(), "transferIndex", 0);
        setIntField(term258554, term258554.getClass(), "cellsBusy", 0);
        setField(term258554, term258554.getClass(), "counterCells", null);
        setField(term258554, term258554.getClass(), "keySet", null);
        setField(term258554, term258554.getClass(), "values", null);
        setField(term258554, term258554.getClass(), "entrySet", null);
        setField(term258554, term258554.getClass(), "keySet", null);
        setField(term258554, term258554.getClass(), "values", null);
        setField(term258507, term258507.getClass(), "lastRulesCache", term258554);
        setField(term258490, term258490.getClass(), "rules", term258507);
        setField(term258469, term258469.getClass(), "zone", term258490);
        setField(term258379, term258379.getClass(), "time_stamp", term258469);
        setField(term258379, term258379.getClass(), "start_up_mode", "jecnsmPrVs");
        setField(term258379, term258379.getClass(), "cmm_dly_mod", "QkdgrEdqYo");
        setField(term258379, term258379.getClass(), "cmm_dly_sec", "oqAIcYaMFy");
        setField(term258379, term258379.getClass(), "cmm_err_mod", "eMJZEUCuiE");
        setField(term258379, term258379.getClass(), "country_code", "psNXkIHjLW");
        setField(term258379, term258379.getClass(), "region_code", "DeWUQxbivp");
        term258631 = new Integer(-1101782);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.ingame.BuyModuleRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term258631;
        callMethod(klass, "setMdl_price", argTypes, term258379, args);
    }

};


