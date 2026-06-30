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

public class BuyCstmzItmRequest_getCstmzitmprice_2676706884 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term274885;

    public BuyCstmzItmRequest_getCstmzitmprice_2676706884() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term274885 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.ingame.BuyCstmzItmRequest"));
        Object term274975 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term274976 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term274977 = newInstance(Class.forName("java.time.LocalDate"));
        Object term274981 = newInstance(Class.forName("java.time.LocalTime"));
        Object term274986 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term274996 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term275013 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term275014 = (long[]) newLongArray(1);
        Object[] term275016 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term275017 = (long[]) newLongArray(39);
        Object[] term275057 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term275058 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term275059 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term275060 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setIntField(term274885, term274885.getClass(), "pd_id", -764051040);
        setIntField(term274885, term274885.getClass(), "accept_idx", 1911905115);
        setIntField(term274885, term274885.getClass(), "start_idx", 1169570714);
        setIntField(term274885, term274885.getClass(), "cstmz_itm_id", 179208004);
        setIntField(term274885, term274885.getClass(), "cstmz_itm_price", 878023734);
        setField(term274885, term274885.getClass(), "cmd", "eLERRBMHza");
        setField(term274885, term274885.getClass(), "req_id", "nNDwdMSbzC");
        setField(term274885, term274885.getClass(), "game_id", "cIeVoTDYCV");
        setField(term274885, term274885.getClass(), "r_ver", "zHjWGfGucL");
        setField(term274885, term274885.getClass(), "kc_serial", "BrQDOXlSKX");
        setField(term274885, term274885.getClass(), "b_serial", "rqZXFCcyZu");
        setField(term274885, term274885.getClass(), "place_id", "rGcDZdOanr");
        setIntField(term274977, term274977.getClass(), "year", 2010);
        setShortField(term274977, term274977.getClass(), "month", (short) 11);
        setShortField(term274977, term274977.getClass(), "day", (short) 14);
        setField(term274976, term274976.getClass(), "date", term274977);
        setByteField(term274981, term274981.getClass(), "hour", (byte) 4);
        setByteField(term274981, term274981.getClass(), "minute", (byte) 49);
        setByteField(term274981, term274981.getClass(), "second", (byte) 50);
        setIntField(term274981, term274981.getClass(), "nano", 621399921);
        setField(term274976, term274976.getClass(), "time", term274981);
        setField(term274975, term274975.getClass(), "dateTime", term274976);
        setIntField(term274986, term274986.getClass(), "totalSeconds", -10800);
        setField(term274986, term274986.getClass(), "id", "-03:00");
        setField(term274975, term274975.getClass(), "offset", term274986);
        setField(term274996, term274996.getClass(), "id", "America/Recife");
        setLongElement(term275014, 0, -1767217224L);
        setField(term275013, term275013.getClass(), "standardTransitions", term275014);
        setElement(term275016, 1, term274986);
        setField(term275013, term275013.getClass(), "standardOffsets", term275016);
        setLongElement(term275017, 0, -1767217224L);
        setLongElement(term275017, 1, -1206957600L);
        setLongElement(term275017, 2, -1191362400L);
        setLongElement(term275017, 3, -1175374800L);
        setLongElement(term275017, 4, -1159826400L);
        setLongElement(term275017, 5, -633819600L);
        setLongElement(term275017, 6, -622069200L);
        setLongElement(term275017, 7, -602283600L);
        setLongElement(term275017, 8, -591832800L);
        setLongElement(term275017, 9, -570747600L);
        setLongElement(term275017, 10, -560210400L);
        setLongElement(term275017, 11, -539125200L);
        setLongElement(term275017, 12, -531352800L);
        setLongElement(term275017, 13, -191365200L);
        setLongElement(term275017, 14, -184197600L);
        setLongElement(term275017, 15, -155163600L);
        setLongElement(term275017, 16, -150069600L);
        setLongElement(term275017, 17, -128898000L);
        setLongElement(term275017, 18, -121125600L);
        setLongElement(term275017, 19, -99954000L);
        setLongElement(term275017, 20, -89589600L);
        setLongElement(term275017, 21, -68418000L);
        setLongElement(term275017, 22, -57967200L);
        setLongElement(term275017, 23, 499748400L);
        setLongElement(term275017, 24, 511236000L);
        setLongElement(term275017, 25, 530593200L);
        setLongElement(term275017, 26, 540266400L);
        setLongElement(term275017, 27, 562129200L);
        setLongElement(term275017, 28, 571197600L);
        setLongElement(term275017, 29, 592974000L);
        setLongElement(term275017, 30, 602042400L);
        setLongElement(term275017, 31, 624423600L);
        setLongElement(term275017, 32, 634701600L);
        setLongElement(term275017, 33, 938919600L);
        setLongElement(term275017, 34, 951616800L);
        setLongElement(term275017, 35, 970974000L);
        setLongElement(term275017, 36, 971575200L);
        setLongElement(term275017, 37, 1003028400L);
        setLongElement(term275017, 38, 1013911200L);
        setField(term275013, term275013.getClass(), "savingsInstantTransitions", term275017);
        setField(term275013, term275013.getClass(), "savingsLocalTransitions", term275057);
        setElement(term275058, 1, term274986);
        setElement(term275058, 3, term274986);
        setElement(term275058, 5, term274986);
        setElement(term275058, 7, term274986);
        setElement(term275058, 9, term274986);
        setElement(term275058, 11, term274986);
        setElement(term275058, 13, term274986);
        setElement(term275058, 15, term274986);
        setElement(term275058, 17, term274986);
        setElement(term275058, 19, term274986);
        setElement(term275058, 21, term274986);
        setElement(term275058, 23, term274986);
        setElement(term275058, 25, term274986);
        setElement(term275058, 27, term274986);
        setElement(term275058, 29, term274986);
        setElement(term275058, 31, term274986);
        setElement(term275058, 33, term274986);
        setElement(term275058, 35, term274986);
        setElement(term275058, 37, term274986);
        setElement(term275058, 39, term274986);
        setField(term275013, term275013.getClass(), "wallOffsets", term275058);
        setField(term275013, term275013.getClass(), "lastRules", term275059);
        setField(term275060, term275060.getClass(), "table", null);
        setField(term275060, term275060.getClass(), "nextTable", null);
        setLongField(term275060, term275060.getClass(), "baseCount", 0L);
        setIntField(term275060, term275060.getClass(), "sizeCtl", 0);
        setIntField(term275060, term275060.getClass(), "transferIndex", 0);
        setIntField(term275060, term275060.getClass(), "cellsBusy", 0);
        setField(term275060, term275060.getClass(), "counterCells", null);
        setField(term275060, term275060.getClass(), "keySet", null);
        setField(term275060, term275060.getClass(), "values", null);
        setField(term275060, term275060.getClass(), "entrySet", null);
        setField(term275060, term275060.getClass(), "keySet", null);
        setField(term275060, term275060.getClass(), "values", null);
        setField(term275013, term275013.getClass(), "lastRulesCache", term275060);
        setField(term274996, term274996.getClass(), "rules", term275013);
        setField(term274975, term274975.getClass(), "zone", term274996);
        setField(term274885, term274885.getClass(), "time_stamp", term274975);
        setField(term274885, term274885.getClass(), "start_up_mode", "qlnQoljKQM");
        setField(term274885, term274885.getClass(), "cmm_dly_mod", "RMEDwLGQoG");
        setField(term274885, term274885.getClass(), "cmm_dly_sec", "wZEFxRSqVY");
        setField(term274885, term274885.getClass(), "cmm_err_mod", "tHcDbcviFO");
        setField(term274885, term274885.getClass(), "country_code", "cmEWCrpoCO");
        setField(term274885, term274885.getClass(), "region_code", "OApdoCtolu");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.ingame.BuyCstmzItmRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCstmz_itm_price", argTypes, term274885, args);
    }

};


