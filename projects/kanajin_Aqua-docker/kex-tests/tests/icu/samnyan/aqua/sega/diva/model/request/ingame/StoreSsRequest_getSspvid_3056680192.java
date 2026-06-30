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

public class StoreSsRequest_getSspvid_3056680192 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term247135;

    public StoreSsRequest_getSspvid_3056680192() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term247135 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.ingame.StoreSsRequest"));
        int[] term247151 = (int[]) newIntArray(3);
        int[] term247155 = (int[]) newIntArray(5);
        int[] term247161 = (int[]) newIntArray(9);
        int[] term247171 = (int[]) newIntArray(6);
        Object term247262 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term247263 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term247264 = newInstance(Class.forName("java.time.LocalDate"));
        Object term247268 = newInstance(Class.forName("java.time.LocalTime"));
        Object term247273 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term247283 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term247300 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term247301 = (long[]) newLongArray(1);
        Object[] term247303 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term247304 = (long[]) newLongArray(39);
        Object[] term247344 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term247345 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term247346 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term247347 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setIntField(term247135, term247135.getClass(), "pd_id", -1608287733);
        setField(term247135, term247135.getClass(), "ss_dat_id", "fFCtsKLEIk");
        setIntField(term247135, term247135.getClass(), "ss_pv_id", -787362712);
        setIntField(term247135, term247135.getClass(), "ss_sel_pv_id", -1042588507);
        setIntElement(term247151, 0, -1795682837);
        setIntElement(term247151, 1, 1347194854);
        setIntElement(term247151, 2, -2013959962);
        setField(term247135, term247135.getClass(), "ss_mdl_id", term247151);
        setIntElement(term247155, 0, -1244232914);
        setIntElement(term247155, 1, -1224575973);
        setIntElement(term247155, 2, -1185520387);
        setIntElement(term247155, 3, 862559254);
        setIntElement(term247155, 4, 1275818994);
        setField(term247135, term247135.getClass(), "ss_sel_mdl_id", term247155);
        setIntElement(term247161, 0, 1168194804);
        setIntElement(term247161, 1, 1576155413);
        setIntElement(term247161, 2, 257835008);
        setIntElement(term247161, 3, -1629326147);
        setIntElement(term247161, 4, -1067802443);
        setIntElement(term247161, 5, -1302193011);
        setIntElement(term247161, 6, 1011894560);
        setIntElement(term247161, 7, 1363640409);
        setIntElement(term247161, 8, -1875559481);
        setField(term247135, term247135.getClass(), "ss_c_itm_id", term247161);
        setIntElement(term247171, 0, -1497934601);
        setIntElement(term247171, 1, -1163423381);
        setIntElement(term247171, 2, 2041532228);
        setIntElement(term247171, 3, -1130464407);
        setIntElement(term247171, 4, 297400041);
        setIntElement(term247171, 5, -1426600049);
        setField(term247135, term247135.getClass(), "ss_pxl_sz", term247171);
        setField(term247135, term247135.getClass(), "cmd", "VJiRAWIpQj");
        setField(term247135, term247135.getClass(), "req_id", "LurvjUHtJk");
        setField(term247135, term247135.getClass(), "game_id", "OBilYfBQsT");
        setField(term247135, term247135.getClass(), "r_ver", "iNsUMLKPwV");
        setField(term247135, term247135.getClass(), "kc_serial", "gLfAVhVVRi");
        setField(term247135, term247135.getClass(), "b_serial", "sfcitSKGGv");
        setField(term247135, term247135.getClass(), "place_id", "sPFYXUJQhh");
        setIntField(term247264, term247264.getClass(), "year", 2028);
        setShortField(term247264, term247264.getClass(), "month", (short) 12);
        setShortField(term247264, term247264.getClass(), "day", (short) 2);
        setField(term247263, term247263.getClass(), "date", term247264);
        setByteField(term247268, term247268.getClass(), "hour", (byte) 18);
        setByteField(term247268, term247268.getClass(), "minute", (byte) 6);
        setByteField(term247268, term247268.getClass(), "second", (byte) 45);
        setIntField(term247268, term247268.getClass(), "nano", 967474945);
        setField(term247263, term247263.getClass(), "time", term247268);
        setField(term247262, term247262.getClass(), "dateTime", term247263);
        setIntField(term247273, term247273.getClass(), "totalSeconds", -10800);
        setField(term247273, term247273.getClass(), "id", "-03:00");
        setField(term247262, term247262.getClass(), "offset", term247273);
        setField(term247283, term247283.getClass(), "id", "America/Recife");
        setLongElement(term247301, 0, -1767217224L);
        setField(term247300, term247300.getClass(), "standardTransitions", term247301);
        setElement(term247303, 1, term247273);
        setField(term247300, term247300.getClass(), "standardOffsets", term247303);
        setLongElement(term247304, 0, -1767217224L);
        setLongElement(term247304, 1, -1206957600L);
        setLongElement(term247304, 2, -1191362400L);
        setLongElement(term247304, 3, -1175374800L);
        setLongElement(term247304, 4, -1159826400L);
        setLongElement(term247304, 5, -633819600L);
        setLongElement(term247304, 6, -622069200L);
        setLongElement(term247304, 7, -602283600L);
        setLongElement(term247304, 8, -591832800L);
        setLongElement(term247304, 9, -570747600L);
        setLongElement(term247304, 10, -560210400L);
        setLongElement(term247304, 11, -539125200L);
        setLongElement(term247304, 12, -531352800L);
        setLongElement(term247304, 13, -191365200L);
        setLongElement(term247304, 14, -184197600L);
        setLongElement(term247304, 15, -155163600L);
        setLongElement(term247304, 16, -150069600L);
        setLongElement(term247304, 17, -128898000L);
        setLongElement(term247304, 18, -121125600L);
        setLongElement(term247304, 19, -99954000L);
        setLongElement(term247304, 20, -89589600L);
        setLongElement(term247304, 21, -68418000L);
        setLongElement(term247304, 22, -57967200L);
        setLongElement(term247304, 23, 499748400L);
        setLongElement(term247304, 24, 511236000L);
        setLongElement(term247304, 25, 530593200L);
        setLongElement(term247304, 26, 540266400L);
        setLongElement(term247304, 27, 562129200L);
        setLongElement(term247304, 28, 571197600L);
        setLongElement(term247304, 29, 592974000L);
        setLongElement(term247304, 30, 602042400L);
        setLongElement(term247304, 31, 624423600L);
        setLongElement(term247304, 32, 634701600L);
        setLongElement(term247304, 33, 938919600L);
        setLongElement(term247304, 34, 951616800L);
        setLongElement(term247304, 35, 970974000L);
        setLongElement(term247304, 36, 971575200L);
        setLongElement(term247304, 37, 1003028400L);
        setLongElement(term247304, 38, 1013911200L);
        setField(term247300, term247300.getClass(), "savingsInstantTransitions", term247304);
        setField(term247300, term247300.getClass(), "savingsLocalTransitions", term247344);
        setElement(term247345, 1, term247273);
        setElement(term247345, 3, term247273);
        setElement(term247345, 5, term247273);
        setElement(term247345, 7, term247273);
        setElement(term247345, 9, term247273);
        setElement(term247345, 11, term247273);
        setElement(term247345, 13, term247273);
        setElement(term247345, 15, term247273);
        setElement(term247345, 17, term247273);
        setElement(term247345, 19, term247273);
        setElement(term247345, 21, term247273);
        setElement(term247345, 23, term247273);
        setElement(term247345, 25, term247273);
        setElement(term247345, 27, term247273);
        setElement(term247345, 29, term247273);
        setElement(term247345, 31, term247273);
        setElement(term247345, 33, term247273);
        setElement(term247345, 35, term247273);
        setElement(term247345, 37, term247273);
        setElement(term247345, 39, term247273);
        setField(term247300, term247300.getClass(), "wallOffsets", term247345);
        setField(term247300, term247300.getClass(), "lastRules", term247346);
        setField(term247347, term247347.getClass(), "table", null);
        setField(term247347, term247347.getClass(), "nextTable", null);
        setLongField(term247347, term247347.getClass(), "baseCount", 0L);
        setIntField(term247347, term247347.getClass(), "sizeCtl", 0);
        setIntField(term247347, term247347.getClass(), "transferIndex", 0);
        setIntField(term247347, term247347.getClass(), "cellsBusy", 0);
        setField(term247347, term247347.getClass(), "counterCells", null);
        setField(term247347, term247347.getClass(), "keySet", null);
        setField(term247347, term247347.getClass(), "values", null);
        setField(term247347, term247347.getClass(), "entrySet", null);
        setField(term247347, term247347.getClass(), "keySet", null);
        setField(term247347, term247347.getClass(), "values", null);
        setField(term247300, term247300.getClass(), "lastRulesCache", term247347);
        setField(term247283, term247283.getClass(), "rules", term247300);
        setField(term247262, term247262.getClass(), "zone", term247283);
        setField(term247135, term247135.getClass(), "time_stamp", term247262);
        setField(term247135, term247135.getClass(), "start_up_mode", "rgqlgxwfGD");
        setField(term247135, term247135.getClass(), "cmm_dly_mod", "PDYTQfQsZd");
        setField(term247135, term247135.getClass(), "cmm_dly_sec", "scTfhtEKVY");
        setField(term247135, term247135.getClass(), "cmm_err_mod", "stIuzWhyLn");
        setField(term247135, term247135.getClass(), "country_code", "SsJjSkvgfn");
        setField(term247135, term247135.getClass(), "region_code", "tUeeoALgnV");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.ingame.StoreSsRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSs_pv_id", argTypes, term247135, args);
    }

};


