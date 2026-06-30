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

public class StoreSsRequest_setPdid_13760936368 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term250159;
     Object term250435;

    public StoreSsRequest_setPdid_13760936368() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term250159 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.ingame.StoreSsRequest"));
        int[] term250175 = (int[]) newIntArray(0);
        int[] term250176 = (int[]) newIntArray(2);
        int[] term250179 = (int[]) newIntArray(3);
        int[] term250183 = (int[]) newIntArray(5);
        Object term250273 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term250274 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term250275 = newInstance(Class.forName("java.time.LocalDate"));
        Object term250279 = newInstance(Class.forName("java.time.LocalTime"));
        Object term250284 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term250294 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term250311 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term250312 = (long[]) newLongArray(1);
        Object[] term250314 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term250315 = (long[]) newLongArray(39);
        Object[] term250355 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term250356 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term250357 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term250358 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setIntField(term250159, term250159.getClass(), "pd_id", 509295607);
        setField(term250159, term250159.getClass(), "ss_dat_id", "SiShLTAOSK");
        setIntField(term250159, term250159.getClass(), "ss_pv_id", 1851535256);
        setIntField(term250159, term250159.getClass(), "ss_sel_pv_id", -929025275);
        setField(term250159, term250159.getClass(), "ss_mdl_id", term250175);
        setIntElement(term250176, 0, -120023220);
        setIntElement(term250176, 1, 745003340);
        setField(term250159, term250159.getClass(), "ss_sel_mdl_id", term250176);
        setIntElement(term250179, 0, -1406590060);
        setIntElement(term250179, 1, -954027971);
        setIntElement(term250179, 2, -1703843446);
        setField(term250159, term250159.getClass(), "ss_c_itm_id", term250179);
        setIntElement(term250183, 0, -134360424);
        setIntElement(term250183, 1, -1534290882);
        setIntElement(term250183, 2, -1462894698);
        setIntElement(term250183, 3, 223824632);
        setIntElement(term250183, 4, -265125597);
        setField(term250159, term250159.getClass(), "ss_pxl_sz", term250183);
        setField(term250159, term250159.getClass(), "cmd", "FAPbpaVZzb");
        setField(term250159, term250159.getClass(), "req_id", "jMmGJiFUkL");
        setField(term250159, term250159.getClass(), "game_id", "fHyUJhfoxR");
        setField(term250159, term250159.getClass(), "r_ver", "CgnkREXVNP");
        setField(term250159, term250159.getClass(), "kc_serial", "mBAKehIGeW");
        setField(term250159, term250159.getClass(), "b_serial", "tmiPUgRXrn");
        setField(term250159, term250159.getClass(), "place_id", "VuZmwqnade");
        setIntField(term250275, term250275.getClass(), "year", 2016);
        setShortField(term250275, term250275.getClass(), "month", (short) 4);
        setShortField(term250275, term250275.getClass(), "day", (short) 23);
        setField(term250274, term250274.getClass(), "date", term250275);
        setByteField(term250279, term250279.getClass(), "hour", (byte) 13);
        setByteField(term250279, term250279.getClass(), "minute", (byte) 34);
        setByteField(term250279, term250279.getClass(), "second", (byte) 22);
        setIntField(term250279, term250279.getClass(), "nano", 20103660);
        setField(term250274, term250274.getClass(), "time", term250279);
        setField(term250273, term250273.getClass(), "dateTime", term250274);
        setIntField(term250284, term250284.getClass(), "totalSeconds", -10800);
        setField(term250284, term250284.getClass(), "id", "-03:00");
        setField(term250273, term250273.getClass(), "offset", term250284);
        setField(term250294, term250294.getClass(), "id", "America/Recife");
        setLongElement(term250312, 0, -1767217224L);
        setField(term250311, term250311.getClass(), "standardTransitions", term250312);
        setElement(term250314, 1, term250284);
        setField(term250311, term250311.getClass(), "standardOffsets", term250314);
        setLongElement(term250315, 0, -1767217224L);
        setLongElement(term250315, 1, -1206957600L);
        setLongElement(term250315, 2, -1191362400L);
        setLongElement(term250315, 3, -1175374800L);
        setLongElement(term250315, 4, -1159826400L);
        setLongElement(term250315, 5, -633819600L);
        setLongElement(term250315, 6, -622069200L);
        setLongElement(term250315, 7, -602283600L);
        setLongElement(term250315, 8, -591832800L);
        setLongElement(term250315, 9, -570747600L);
        setLongElement(term250315, 10, -560210400L);
        setLongElement(term250315, 11, -539125200L);
        setLongElement(term250315, 12, -531352800L);
        setLongElement(term250315, 13, -191365200L);
        setLongElement(term250315, 14, -184197600L);
        setLongElement(term250315, 15, -155163600L);
        setLongElement(term250315, 16, -150069600L);
        setLongElement(term250315, 17, -128898000L);
        setLongElement(term250315, 18, -121125600L);
        setLongElement(term250315, 19, -99954000L);
        setLongElement(term250315, 20, -89589600L);
        setLongElement(term250315, 21, -68418000L);
        setLongElement(term250315, 22, -57967200L);
        setLongElement(term250315, 23, 499748400L);
        setLongElement(term250315, 24, 511236000L);
        setLongElement(term250315, 25, 530593200L);
        setLongElement(term250315, 26, 540266400L);
        setLongElement(term250315, 27, 562129200L);
        setLongElement(term250315, 28, 571197600L);
        setLongElement(term250315, 29, 592974000L);
        setLongElement(term250315, 30, 602042400L);
        setLongElement(term250315, 31, 624423600L);
        setLongElement(term250315, 32, 634701600L);
        setLongElement(term250315, 33, 938919600L);
        setLongElement(term250315, 34, 951616800L);
        setLongElement(term250315, 35, 970974000L);
        setLongElement(term250315, 36, 971575200L);
        setLongElement(term250315, 37, 1003028400L);
        setLongElement(term250315, 38, 1013911200L);
        setField(term250311, term250311.getClass(), "savingsInstantTransitions", term250315);
        setField(term250311, term250311.getClass(), "savingsLocalTransitions", term250355);
        setElement(term250356, 1, term250284);
        setElement(term250356, 3, term250284);
        setElement(term250356, 5, term250284);
        setElement(term250356, 7, term250284);
        setElement(term250356, 9, term250284);
        setElement(term250356, 11, term250284);
        setElement(term250356, 13, term250284);
        setElement(term250356, 15, term250284);
        setElement(term250356, 17, term250284);
        setElement(term250356, 19, term250284);
        setElement(term250356, 21, term250284);
        setElement(term250356, 23, term250284);
        setElement(term250356, 25, term250284);
        setElement(term250356, 27, term250284);
        setElement(term250356, 29, term250284);
        setElement(term250356, 31, term250284);
        setElement(term250356, 33, term250284);
        setElement(term250356, 35, term250284);
        setElement(term250356, 37, term250284);
        setElement(term250356, 39, term250284);
        setField(term250311, term250311.getClass(), "wallOffsets", term250356);
        setField(term250311, term250311.getClass(), "lastRules", term250357);
        setField(term250358, term250358.getClass(), "table", null);
        setField(term250358, term250358.getClass(), "nextTable", null);
        setLongField(term250358, term250358.getClass(), "baseCount", 0L);
        setIntField(term250358, term250358.getClass(), "sizeCtl", 0);
        setIntField(term250358, term250358.getClass(), "transferIndex", 0);
        setIntField(term250358, term250358.getClass(), "cellsBusy", 0);
        setField(term250358, term250358.getClass(), "counterCells", null);
        setField(term250358, term250358.getClass(), "keySet", null);
        setField(term250358, term250358.getClass(), "values", null);
        setField(term250358, term250358.getClass(), "entrySet", null);
        setField(term250358, term250358.getClass(), "keySet", null);
        setField(term250358, term250358.getClass(), "values", null);
        setField(term250311, term250311.getClass(), "lastRulesCache", term250358);
        setField(term250294, term250294.getClass(), "rules", term250311);
        setField(term250273, term250273.getClass(), "zone", term250294);
        setField(term250159, term250159.getClass(), "time_stamp", term250273);
        setField(term250159, term250159.getClass(), "start_up_mode", "ohZrjboUnX");
        setField(term250159, term250159.getClass(), "cmm_dly_mod", "rwlrpQuNrG");
        setField(term250159, term250159.getClass(), "cmm_dly_sec", "fctYGLXetS");
        setField(term250159, term250159.getClass(), "cmm_err_mod", "UPbgrEUWQD");
        setField(term250159, term250159.getClass(), "country_code", "HABnTZidNp");
        setField(term250159, term250159.getClass(), "region_code", "qXysRdBrsg");
        term250435 = new Integer(2103046363);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.ingame.StoreSsRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term250435;
        callMethod(klass, "setPd_id", argTypes, term250159, args);
    }

};


