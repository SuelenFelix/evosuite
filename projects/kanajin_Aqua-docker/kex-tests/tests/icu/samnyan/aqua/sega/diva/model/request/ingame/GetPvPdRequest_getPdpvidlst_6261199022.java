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

public class GetPvPdRequest_getPdpvidlst_6261199022 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term271271;

    public GetPvPdRequest_getPdpvidlst_6261199022() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term271271 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.ingame.GetPvPdRequest"));
        int[] term271274 = (int[]) newIntArray(1);
        Object term271360 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term271361 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term271362 = newInstance(Class.forName("java.time.LocalDate"));
        Object term271366 = newInstance(Class.forName("java.time.LocalTime"));
        Object term271371 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term271381 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term271398 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term271399 = (long[]) newLongArray(1);
        Object[] term271401 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term271402 = (long[]) newLongArray(39);
        Object[] term271442 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term271443 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term271444 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term271445 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setIntField(term271271, term271271.getClass(), "pd_id", 601624439);
        setIntField(term271271, term271271.getClass(), "difficulty", 1024755179);
        setIntElement(term271274, 0, -374416181);
        setField(term271271, term271271.getClass(), "pd_pv_id_lst", term271274);
        setField(term271271, term271271.getClass(), "cmd", "tlymfAhXiZ");
        setField(term271271, term271271.getClass(), "req_id", "rlLIYBJlxU");
        setField(term271271, term271271.getClass(), "game_id", "jtfkxwFefh");
        setField(term271271, term271271.getClass(), "r_ver", "ESnYpdjELS");
        setField(term271271, term271271.getClass(), "kc_serial", "IsOpDBwqZb");
        setField(term271271, term271271.getClass(), "b_serial", "GBSKSryDNr");
        setField(term271271, term271271.getClass(), "place_id", "lewYJfdwbu");
        setIntField(term271362, term271362.getClass(), "year", 2017);
        setShortField(term271362, term271362.getClass(), "month", (short) 2);
        setShortField(term271362, term271362.getClass(), "day", (short) 5);
        setField(term271361, term271361.getClass(), "date", term271362);
        setByteField(term271366, term271366.getClass(), "hour", (byte) 5);
        setByteField(term271366, term271366.getClass(), "minute", (byte) 46);
        setByteField(term271366, term271366.getClass(), "second", (byte) 38);
        setIntField(term271366, term271366.getClass(), "nano", 214202896);
        setField(term271361, term271361.getClass(), "time", term271366);
        setField(term271360, term271360.getClass(), "dateTime", term271361);
        setIntField(term271371, term271371.getClass(), "totalSeconds", -10800);
        setField(term271371, term271371.getClass(), "id", "-03:00");
        setField(term271360, term271360.getClass(), "offset", term271371);
        setField(term271381, term271381.getClass(), "id", "America/Recife");
        setLongElement(term271399, 0, -1767217224L);
        setField(term271398, term271398.getClass(), "standardTransitions", term271399);
        setElement(term271401, 1, term271371);
        setField(term271398, term271398.getClass(), "standardOffsets", term271401);
        setLongElement(term271402, 0, -1767217224L);
        setLongElement(term271402, 1, -1206957600L);
        setLongElement(term271402, 2, -1191362400L);
        setLongElement(term271402, 3, -1175374800L);
        setLongElement(term271402, 4, -1159826400L);
        setLongElement(term271402, 5, -633819600L);
        setLongElement(term271402, 6, -622069200L);
        setLongElement(term271402, 7, -602283600L);
        setLongElement(term271402, 8, -591832800L);
        setLongElement(term271402, 9, -570747600L);
        setLongElement(term271402, 10, -560210400L);
        setLongElement(term271402, 11, -539125200L);
        setLongElement(term271402, 12, -531352800L);
        setLongElement(term271402, 13, -191365200L);
        setLongElement(term271402, 14, -184197600L);
        setLongElement(term271402, 15, -155163600L);
        setLongElement(term271402, 16, -150069600L);
        setLongElement(term271402, 17, -128898000L);
        setLongElement(term271402, 18, -121125600L);
        setLongElement(term271402, 19, -99954000L);
        setLongElement(term271402, 20, -89589600L);
        setLongElement(term271402, 21, -68418000L);
        setLongElement(term271402, 22, -57967200L);
        setLongElement(term271402, 23, 499748400L);
        setLongElement(term271402, 24, 511236000L);
        setLongElement(term271402, 25, 530593200L);
        setLongElement(term271402, 26, 540266400L);
        setLongElement(term271402, 27, 562129200L);
        setLongElement(term271402, 28, 571197600L);
        setLongElement(term271402, 29, 592974000L);
        setLongElement(term271402, 30, 602042400L);
        setLongElement(term271402, 31, 624423600L);
        setLongElement(term271402, 32, 634701600L);
        setLongElement(term271402, 33, 938919600L);
        setLongElement(term271402, 34, 951616800L);
        setLongElement(term271402, 35, 970974000L);
        setLongElement(term271402, 36, 971575200L);
        setLongElement(term271402, 37, 1003028400L);
        setLongElement(term271402, 38, 1013911200L);
        setField(term271398, term271398.getClass(), "savingsInstantTransitions", term271402);
        setField(term271398, term271398.getClass(), "savingsLocalTransitions", term271442);
        setElement(term271443, 1, term271371);
        setElement(term271443, 3, term271371);
        setElement(term271443, 5, term271371);
        setElement(term271443, 7, term271371);
        setElement(term271443, 9, term271371);
        setElement(term271443, 11, term271371);
        setElement(term271443, 13, term271371);
        setElement(term271443, 15, term271371);
        setElement(term271443, 17, term271371);
        setElement(term271443, 19, term271371);
        setElement(term271443, 21, term271371);
        setElement(term271443, 23, term271371);
        setElement(term271443, 25, term271371);
        setElement(term271443, 27, term271371);
        setElement(term271443, 29, term271371);
        setElement(term271443, 31, term271371);
        setElement(term271443, 33, term271371);
        setElement(term271443, 35, term271371);
        setElement(term271443, 37, term271371);
        setElement(term271443, 39, term271371);
        setField(term271398, term271398.getClass(), "wallOffsets", term271443);
        setField(term271398, term271398.getClass(), "lastRules", term271444);
        setField(term271445, term271445.getClass(), "table", null);
        setField(term271445, term271445.getClass(), "nextTable", null);
        setLongField(term271445, term271445.getClass(), "baseCount", 0L);
        setIntField(term271445, term271445.getClass(), "sizeCtl", 0);
        setIntField(term271445, term271445.getClass(), "transferIndex", 0);
        setIntField(term271445, term271445.getClass(), "cellsBusy", 0);
        setField(term271445, term271445.getClass(), "counterCells", null);
        setField(term271445, term271445.getClass(), "keySet", null);
        setField(term271445, term271445.getClass(), "values", null);
        setField(term271445, term271445.getClass(), "entrySet", null);
        setField(term271445, term271445.getClass(), "keySet", null);
        setField(term271445, term271445.getClass(), "values", null);
        setField(term271398, term271398.getClass(), "lastRulesCache", term271445);
        setField(term271381, term271381.getClass(), "rules", term271398);
        setField(term271360, term271360.getClass(), "zone", term271381);
        setField(term271271, term271271.getClass(), "time_stamp", term271360);
        setField(term271271, term271271.getClass(), "start_up_mode", "wmCdnKXFIV");
        setField(term271271, term271271.getClass(), "cmm_dly_mod", "OQFYTZSsmT");
        setField(term271271, term271271.getClass(), "cmm_dly_sec", "sERwhJnfhH");
        setField(term271271, term271271.getClass(), "cmm_err_mod", "ttMftcuYTC");
        setField(term271271, term271271.getClass(), "country_code", "ktSwbNnkjp");
        setField(term271271, term271271.getClass(), "region_code", "GnPQSLhuqc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.ingame.GetPvPdRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPd_pv_id_lst", argTypes, term271271, args);
    }

};


