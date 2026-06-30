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

public class StoreSsRequest_setSspvid_47209044710 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term251149;
     Object term251428;

    public StoreSsRequest_setSspvid_47209044710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term251149 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.ingame.StoreSsRequest"));
        int[] term251165 = (int[]) newIntArray(0);
        int[] term251166 = (int[]) newIntArray(1);
        int[] term251168 = (int[]) newIntArray(4);
        int[] term251173 = (int[]) newIntArray(8);
        Object term251266 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term251267 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term251268 = newInstance(Class.forName("java.time.LocalDate"));
        Object term251272 = newInstance(Class.forName("java.time.LocalTime"));
        Object term251277 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term251287 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term251304 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term251305 = (long[]) newLongArray(1);
        Object[] term251307 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term251308 = (long[]) newLongArray(39);
        Object[] term251348 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term251349 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term251350 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term251351 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setIntField(term251149, term251149.getClass(), "pd_id", 1644493995);
        setField(term251149, term251149.getClass(), "ss_dat_id", "rgZeldfAMO");
        setIntField(term251149, term251149.getClass(), "ss_pv_id", -2080348053);
        setIntField(term251149, term251149.getClass(), "ss_sel_pv_id", 974524212);
        setField(term251149, term251149.getClass(), "ss_mdl_id", term251165);
        setIntElement(term251166, 0, 687081718);
        setField(term251149, term251149.getClass(), "ss_sel_mdl_id", term251166);
        setIntElement(term251168, 0, -1957048886);
        setIntElement(term251168, 1, 1298181977);
        setIntElement(term251168, 2, 1195571510);
        setIntElement(term251168, 3, 1010066524);
        setField(term251149, term251149.getClass(), "ss_c_itm_id", term251168);
        setIntElement(term251173, 0, 993401156);
        setIntElement(term251173, 1, -1455259352);
        setIntElement(term251173, 2, -869786663);
        setIntElement(term251173, 3, -1753638648);
        setIntElement(term251173, 4, -1330635018);
        setIntElement(term251173, 5, 368967401);
        setIntElement(term251173, 6, -1964786033);
        setIntElement(term251173, 7, -2005048394);
        setField(term251149, term251149.getClass(), "ss_pxl_sz", term251173);
        setField(term251149, term251149.getClass(), "cmd", "btsBDylBZe");
        setField(term251149, term251149.getClass(), "req_id", "eAWJddaxnT");
        setField(term251149, term251149.getClass(), "game_id", "PyaMftIAzC");
        setField(term251149, term251149.getClass(), "r_ver", "QiSmNdQUzl");
        setField(term251149, term251149.getClass(), "kc_serial", "FsjVOWFhLi");
        setField(term251149, term251149.getClass(), "b_serial", "RReQXZQnIR");
        setField(term251149, term251149.getClass(), "place_id", "VnHgyPgIAn");
        setIntField(term251268, term251268.getClass(), "year", 2023);
        setShortField(term251268, term251268.getClass(), "month", (short) 8);
        setShortField(term251268, term251268.getClass(), "day", (short) 8);
        setField(term251267, term251267.getClass(), "date", term251268);
        setByteField(term251272, term251272.getClass(), "hour", (byte) 20);
        setByteField(term251272, term251272.getClass(), "minute", (byte) 17);
        setByteField(term251272, term251272.getClass(), "second", (byte) 40);
        setIntField(term251272, term251272.getClass(), "nano", 834219024);
        setField(term251267, term251267.getClass(), "time", term251272);
        setField(term251266, term251266.getClass(), "dateTime", term251267);
        setIntField(term251277, term251277.getClass(), "totalSeconds", -10800);
        setField(term251277, term251277.getClass(), "id", "-03:00");
        setField(term251266, term251266.getClass(), "offset", term251277);
        setField(term251287, term251287.getClass(), "id", "America/Recife");
        setLongElement(term251305, 0, -1767217224L);
        setField(term251304, term251304.getClass(), "standardTransitions", term251305);
        setElement(term251307, 1, term251277);
        setField(term251304, term251304.getClass(), "standardOffsets", term251307);
        setLongElement(term251308, 0, -1767217224L);
        setLongElement(term251308, 1, -1206957600L);
        setLongElement(term251308, 2, -1191362400L);
        setLongElement(term251308, 3, -1175374800L);
        setLongElement(term251308, 4, -1159826400L);
        setLongElement(term251308, 5, -633819600L);
        setLongElement(term251308, 6, -622069200L);
        setLongElement(term251308, 7, -602283600L);
        setLongElement(term251308, 8, -591832800L);
        setLongElement(term251308, 9, -570747600L);
        setLongElement(term251308, 10, -560210400L);
        setLongElement(term251308, 11, -539125200L);
        setLongElement(term251308, 12, -531352800L);
        setLongElement(term251308, 13, -191365200L);
        setLongElement(term251308, 14, -184197600L);
        setLongElement(term251308, 15, -155163600L);
        setLongElement(term251308, 16, -150069600L);
        setLongElement(term251308, 17, -128898000L);
        setLongElement(term251308, 18, -121125600L);
        setLongElement(term251308, 19, -99954000L);
        setLongElement(term251308, 20, -89589600L);
        setLongElement(term251308, 21, -68418000L);
        setLongElement(term251308, 22, -57967200L);
        setLongElement(term251308, 23, 499748400L);
        setLongElement(term251308, 24, 511236000L);
        setLongElement(term251308, 25, 530593200L);
        setLongElement(term251308, 26, 540266400L);
        setLongElement(term251308, 27, 562129200L);
        setLongElement(term251308, 28, 571197600L);
        setLongElement(term251308, 29, 592974000L);
        setLongElement(term251308, 30, 602042400L);
        setLongElement(term251308, 31, 624423600L);
        setLongElement(term251308, 32, 634701600L);
        setLongElement(term251308, 33, 938919600L);
        setLongElement(term251308, 34, 951616800L);
        setLongElement(term251308, 35, 970974000L);
        setLongElement(term251308, 36, 971575200L);
        setLongElement(term251308, 37, 1003028400L);
        setLongElement(term251308, 38, 1013911200L);
        setField(term251304, term251304.getClass(), "savingsInstantTransitions", term251308);
        setField(term251304, term251304.getClass(), "savingsLocalTransitions", term251348);
        setElement(term251349, 1, term251277);
        setElement(term251349, 3, term251277);
        setElement(term251349, 5, term251277);
        setElement(term251349, 7, term251277);
        setElement(term251349, 9, term251277);
        setElement(term251349, 11, term251277);
        setElement(term251349, 13, term251277);
        setElement(term251349, 15, term251277);
        setElement(term251349, 17, term251277);
        setElement(term251349, 19, term251277);
        setElement(term251349, 21, term251277);
        setElement(term251349, 23, term251277);
        setElement(term251349, 25, term251277);
        setElement(term251349, 27, term251277);
        setElement(term251349, 29, term251277);
        setElement(term251349, 31, term251277);
        setElement(term251349, 33, term251277);
        setElement(term251349, 35, term251277);
        setElement(term251349, 37, term251277);
        setElement(term251349, 39, term251277);
        setField(term251304, term251304.getClass(), "wallOffsets", term251349);
        setField(term251304, term251304.getClass(), "lastRules", term251350);
        setField(term251351, term251351.getClass(), "table", null);
        setField(term251351, term251351.getClass(), "nextTable", null);
        setLongField(term251351, term251351.getClass(), "baseCount", 0L);
        setIntField(term251351, term251351.getClass(), "sizeCtl", 0);
        setIntField(term251351, term251351.getClass(), "transferIndex", 0);
        setIntField(term251351, term251351.getClass(), "cellsBusy", 0);
        setField(term251351, term251351.getClass(), "counterCells", null);
        setField(term251351, term251351.getClass(), "keySet", null);
        setField(term251351, term251351.getClass(), "values", null);
        setField(term251351, term251351.getClass(), "entrySet", null);
        setField(term251351, term251351.getClass(), "keySet", null);
        setField(term251351, term251351.getClass(), "values", null);
        setField(term251304, term251304.getClass(), "lastRulesCache", term251351);
        setField(term251287, term251287.getClass(), "rules", term251304);
        setField(term251266, term251266.getClass(), "zone", term251287);
        setField(term251149, term251149.getClass(), "time_stamp", term251266);
        setField(term251149, term251149.getClass(), "start_up_mode", "EIkLuLTIDO");
        setField(term251149, term251149.getClass(), "cmm_dly_mod", "rQFJbYZksA");
        setField(term251149, term251149.getClass(), "cmm_dly_sec", "jndrnlnwbO");
        setField(term251149, term251149.getClass(), "cmm_err_mod", "qdFzHeHbQc");
        setField(term251149, term251149.getClass(), "country_code", "EcxYliBmNQ");
        setField(term251149, term251149.getClass(), "region_code", "MGbwgunHMQ");
        term251428 = new Integer(591994915);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.ingame.StoreSsRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term251428;
        callMethod(klass, "setSs_pv_id", argTypes, term251149, args);
    }

};


