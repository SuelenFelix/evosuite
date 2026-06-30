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

public class StoreSsRequest_getSscitmid_18701511696 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term249159;

    public StoreSsRequest_getSscitmid_18701511696() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term249159 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.ingame.StoreSsRequest"));
        int[] term249175 = (int[]) newIntArray(3);
        int[] term249179 = (int[]) newIntArray(9);
        int[] term249189 = (int[]) newIntArray(2);
        int[] term249192 = (int[]) newIntArray(5);
        Object term249282 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term249283 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term249284 = newInstance(Class.forName("java.time.LocalDate"));
        Object term249288 = newInstance(Class.forName("java.time.LocalTime"));
        Object term249293 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term249303 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term249320 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term249321 = (long[]) newLongArray(1);
        Object[] term249323 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term249324 = (long[]) newLongArray(39);
        Object[] term249364 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term249365 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term249366 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term249367 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setIntField(term249159, term249159.getClass(), "pd_id", 2078524122);
        setField(term249159, term249159.getClass(), "ss_dat_id", "bxkUNyUzCb");
        setIntField(term249159, term249159.getClass(), "ss_pv_id", -672252701);
        setIntField(term249159, term249159.getClass(), "ss_sel_pv_id", 1004793565);
        setIntElement(term249175, 0, -1144912945);
        setIntElement(term249175, 1, 483996512);
        setIntElement(term249175, 2, 1522956975);
        setField(term249159, term249159.getClass(), "ss_mdl_id", term249175);
        setIntElement(term249179, 0, -1250900528);
        setIntElement(term249179, 1, 705024668);
        setIntElement(term249179, 2, 1701286319);
        setIntElement(term249179, 3, -1459413717);
        setIntElement(term249179, 4, -1524077442);
        setIntElement(term249179, 5, 1778637201);
        setIntElement(term249179, 6, -1014845523);
        setIntElement(term249179, 7, 1369062530);
        setIntElement(term249179, 8, -499218106);
        setField(term249159, term249159.getClass(), "ss_sel_mdl_id", term249179);
        setIntElement(term249189, 0, 543639529);
        setIntElement(term249189, 1, 1923413356);
        setField(term249159, term249159.getClass(), "ss_c_itm_id", term249189);
        setIntElement(term249192, 0, -1002442765);
        setIntElement(term249192, 1, 577762800);
        setIntElement(term249192, 2, -1630040826);
        setIntElement(term249192, 3, 29954683);
        setIntElement(term249192, 4, 58214031);
        setField(term249159, term249159.getClass(), "ss_pxl_sz", term249192);
        setField(term249159, term249159.getClass(), "cmd", "lyiWNZdiRp");
        setField(term249159, term249159.getClass(), "req_id", "BeeLASibwX");
        setField(term249159, term249159.getClass(), "game_id", "BqctwXkUdR");
        setField(term249159, term249159.getClass(), "r_ver", "GRVnFiwbnZ");
        setField(term249159, term249159.getClass(), "kc_serial", "bZevkoTsGp");
        setField(term249159, term249159.getClass(), "b_serial", "TjanzjjMgi");
        setField(term249159, term249159.getClass(), "place_id", "UOZvJkhjUs");
        setIntField(term249284, term249284.getClass(), "year", 2028);
        setShortField(term249284, term249284.getClass(), "month", (short) 3);
        setShortField(term249284, term249284.getClass(), "day", (short) 20);
        setField(term249283, term249283.getClass(), "date", term249284);
        setByteField(term249288, term249288.getClass(), "hour", (byte) 15);
        setByteField(term249288, term249288.getClass(), "minute", (byte) 5);
        setByteField(term249288, term249288.getClass(), "second", (byte) 16);
        setIntField(term249288, term249288.getClass(), "nano", 223082659);
        setField(term249283, term249283.getClass(), "time", term249288);
        setField(term249282, term249282.getClass(), "dateTime", term249283);
        setIntField(term249293, term249293.getClass(), "totalSeconds", -10800);
        setField(term249293, term249293.getClass(), "id", "-03:00");
        setField(term249282, term249282.getClass(), "offset", term249293);
        setField(term249303, term249303.getClass(), "id", "America/Recife");
        setLongElement(term249321, 0, -1767217224L);
        setField(term249320, term249320.getClass(), "standardTransitions", term249321);
        setElement(term249323, 1, term249293);
        setField(term249320, term249320.getClass(), "standardOffsets", term249323);
        setLongElement(term249324, 0, -1767217224L);
        setLongElement(term249324, 1, -1206957600L);
        setLongElement(term249324, 2, -1191362400L);
        setLongElement(term249324, 3, -1175374800L);
        setLongElement(term249324, 4, -1159826400L);
        setLongElement(term249324, 5, -633819600L);
        setLongElement(term249324, 6, -622069200L);
        setLongElement(term249324, 7, -602283600L);
        setLongElement(term249324, 8, -591832800L);
        setLongElement(term249324, 9, -570747600L);
        setLongElement(term249324, 10, -560210400L);
        setLongElement(term249324, 11, -539125200L);
        setLongElement(term249324, 12, -531352800L);
        setLongElement(term249324, 13, -191365200L);
        setLongElement(term249324, 14, -184197600L);
        setLongElement(term249324, 15, -155163600L);
        setLongElement(term249324, 16, -150069600L);
        setLongElement(term249324, 17, -128898000L);
        setLongElement(term249324, 18, -121125600L);
        setLongElement(term249324, 19, -99954000L);
        setLongElement(term249324, 20, -89589600L);
        setLongElement(term249324, 21, -68418000L);
        setLongElement(term249324, 22, -57967200L);
        setLongElement(term249324, 23, 499748400L);
        setLongElement(term249324, 24, 511236000L);
        setLongElement(term249324, 25, 530593200L);
        setLongElement(term249324, 26, 540266400L);
        setLongElement(term249324, 27, 562129200L);
        setLongElement(term249324, 28, 571197600L);
        setLongElement(term249324, 29, 592974000L);
        setLongElement(term249324, 30, 602042400L);
        setLongElement(term249324, 31, 624423600L);
        setLongElement(term249324, 32, 634701600L);
        setLongElement(term249324, 33, 938919600L);
        setLongElement(term249324, 34, 951616800L);
        setLongElement(term249324, 35, 970974000L);
        setLongElement(term249324, 36, 971575200L);
        setLongElement(term249324, 37, 1003028400L);
        setLongElement(term249324, 38, 1013911200L);
        setField(term249320, term249320.getClass(), "savingsInstantTransitions", term249324);
        setField(term249320, term249320.getClass(), "savingsLocalTransitions", term249364);
        setElement(term249365, 1, term249293);
        setElement(term249365, 3, term249293);
        setElement(term249365, 5, term249293);
        setElement(term249365, 7, term249293);
        setElement(term249365, 9, term249293);
        setElement(term249365, 11, term249293);
        setElement(term249365, 13, term249293);
        setElement(term249365, 15, term249293);
        setElement(term249365, 17, term249293);
        setElement(term249365, 19, term249293);
        setElement(term249365, 21, term249293);
        setElement(term249365, 23, term249293);
        setElement(term249365, 25, term249293);
        setElement(term249365, 27, term249293);
        setElement(term249365, 29, term249293);
        setElement(term249365, 31, term249293);
        setElement(term249365, 33, term249293);
        setElement(term249365, 35, term249293);
        setElement(term249365, 37, term249293);
        setElement(term249365, 39, term249293);
        setField(term249320, term249320.getClass(), "wallOffsets", term249365);
        setField(term249320, term249320.getClass(), "lastRules", term249366);
        setField(term249367, term249367.getClass(), "table", null);
        setField(term249367, term249367.getClass(), "nextTable", null);
        setLongField(term249367, term249367.getClass(), "baseCount", 0L);
        setIntField(term249367, term249367.getClass(), "sizeCtl", 0);
        setIntField(term249367, term249367.getClass(), "transferIndex", 0);
        setIntField(term249367, term249367.getClass(), "cellsBusy", 0);
        setField(term249367, term249367.getClass(), "counterCells", null);
        setField(term249367, term249367.getClass(), "keySet", null);
        setField(term249367, term249367.getClass(), "values", null);
        setField(term249367, term249367.getClass(), "entrySet", null);
        setField(term249367, term249367.getClass(), "keySet", null);
        setField(term249367, term249367.getClass(), "values", null);
        setField(term249320, term249320.getClass(), "lastRulesCache", term249367);
        setField(term249303, term249303.getClass(), "rules", term249320);
        setField(term249282, term249282.getClass(), "zone", term249303);
        setField(term249159, term249159.getClass(), "time_stamp", term249282);
        setField(term249159, term249159.getClass(), "start_up_mode", "hUVFihsVHL");
        setField(term249159, term249159.getClass(), "cmm_dly_mod", "PUamQqZNZj");
        setField(term249159, term249159.getClass(), "cmm_dly_sec", "tfDqvBMzfw");
        setField(term249159, term249159.getClass(), "cmm_err_mod", "rJfJfBomXU");
        setField(term249159, term249159.getClass(), "country_code", "kBdJQbVecB");
        setField(term249159, term249159.getClass(), "region_code", "JlirfQsPTm");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.ingame.StoreSsRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSs_c_itm_id", argTypes, term249159, args);
    }

};


