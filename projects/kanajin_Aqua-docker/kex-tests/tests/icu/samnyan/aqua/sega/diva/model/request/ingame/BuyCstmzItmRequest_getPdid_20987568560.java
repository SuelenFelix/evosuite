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

public class BuyCstmzItmRequest_getPdid_20987568560 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term273117;

    public BuyCstmzItmRequest_getPdid_20987568560() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term273117 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.ingame.BuyCstmzItmRequest"));
        Object term273207 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term273208 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term273209 = newInstance(Class.forName("java.time.LocalDate"));
        Object term273213 = newInstance(Class.forName("java.time.LocalTime"));
        Object term273218 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term273228 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term273245 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term273246 = (long[]) newLongArray(1);
        Object[] term273248 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term273249 = (long[]) newLongArray(39);
        Object[] term273289 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term273290 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term273291 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term273292 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setIntField(term273117, term273117.getClass(), "pd_id", -1718337929);
        setIntField(term273117, term273117.getClass(), "accept_idx", -1842127764);
        setIntField(term273117, term273117.getClass(), "start_idx", -275474328);
        setIntField(term273117, term273117.getClass(), "cstmz_itm_id", 134958358);
        setIntField(term273117, term273117.getClass(), "cstmz_itm_price", -803903891);
        setField(term273117, term273117.getClass(), "cmd", "wqwrSGuByQ");
        setField(term273117, term273117.getClass(), "req_id", "KJOrIBIJCp");
        setField(term273117, term273117.getClass(), "game_id", "LHDRljWYoi");
        setField(term273117, term273117.getClass(), "r_ver", "buQOGnBPlD");
        setField(term273117, term273117.getClass(), "kc_serial", "ofiucEZNjp");
        setField(term273117, term273117.getClass(), "b_serial", "kbQZxTtvgH");
        setField(term273117, term273117.getClass(), "place_id", "aYWilzmMDP");
        setIntField(term273209, term273209.getClass(), "year", 2016);
        setShortField(term273209, term273209.getClass(), "month", (short) 1);
        setShortField(term273209, term273209.getClass(), "day", (short) 24);
        setField(term273208, term273208.getClass(), "date", term273209);
        setByteField(term273213, term273213.getClass(), "hour", (byte) 23);
        setByteField(term273213, term273213.getClass(), "minute", (byte) 15);
        setByteField(term273213, term273213.getClass(), "second", (byte) 43);
        setIntField(term273213, term273213.getClass(), "nano", 860277753);
        setField(term273208, term273208.getClass(), "time", term273213);
        setField(term273207, term273207.getClass(), "dateTime", term273208);
        setIntField(term273218, term273218.getClass(), "totalSeconds", -10800);
        setField(term273218, term273218.getClass(), "id", "-03:00");
        setField(term273207, term273207.getClass(), "offset", term273218);
        setField(term273228, term273228.getClass(), "id", "America/Recife");
        setLongElement(term273246, 0, -1767217224L);
        setField(term273245, term273245.getClass(), "standardTransitions", term273246);
        setElement(term273248, 1, term273218);
        setField(term273245, term273245.getClass(), "standardOffsets", term273248);
        setLongElement(term273249, 0, -1767217224L);
        setLongElement(term273249, 1, -1206957600L);
        setLongElement(term273249, 2, -1191362400L);
        setLongElement(term273249, 3, -1175374800L);
        setLongElement(term273249, 4, -1159826400L);
        setLongElement(term273249, 5, -633819600L);
        setLongElement(term273249, 6, -622069200L);
        setLongElement(term273249, 7, -602283600L);
        setLongElement(term273249, 8, -591832800L);
        setLongElement(term273249, 9, -570747600L);
        setLongElement(term273249, 10, -560210400L);
        setLongElement(term273249, 11, -539125200L);
        setLongElement(term273249, 12, -531352800L);
        setLongElement(term273249, 13, -191365200L);
        setLongElement(term273249, 14, -184197600L);
        setLongElement(term273249, 15, -155163600L);
        setLongElement(term273249, 16, -150069600L);
        setLongElement(term273249, 17, -128898000L);
        setLongElement(term273249, 18, -121125600L);
        setLongElement(term273249, 19, -99954000L);
        setLongElement(term273249, 20, -89589600L);
        setLongElement(term273249, 21, -68418000L);
        setLongElement(term273249, 22, -57967200L);
        setLongElement(term273249, 23, 499748400L);
        setLongElement(term273249, 24, 511236000L);
        setLongElement(term273249, 25, 530593200L);
        setLongElement(term273249, 26, 540266400L);
        setLongElement(term273249, 27, 562129200L);
        setLongElement(term273249, 28, 571197600L);
        setLongElement(term273249, 29, 592974000L);
        setLongElement(term273249, 30, 602042400L);
        setLongElement(term273249, 31, 624423600L);
        setLongElement(term273249, 32, 634701600L);
        setLongElement(term273249, 33, 938919600L);
        setLongElement(term273249, 34, 951616800L);
        setLongElement(term273249, 35, 970974000L);
        setLongElement(term273249, 36, 971575200L);
        setLongElement(term273249, 37, 1003028400L);
        setLongElement(term273249, 38, 1013911200L);
        setField(term273245, term273245.getClass(), "savingsInstantTransitions", term273249);
        setField(term273245, term273245.getClass(), "savingsLocalTransitions", term273289);
        setElement(term273290, 1, term273218);
        setElement(term273290, 3, term273218);
        setElement(term273290, 5, term273218);
        setElement(term273290, 7, term273218);
        setElement(term273290, 9, term273218);
        setElement(term273290, 11, term273218);
        setElement(term273290, 13, term273218);
        setElement(term273290, 15, term273218);
        setElement(term273290, 17, term273218);
        setElement(term273290, 19, term273218);
        setElement(term273290, 21, term273218);
        setElement(term273290, 23, term273218);
        setElement(term273290, 25, term273218);
        setElement(term273290, 27, term273218);
        setElement(term273290, 29, term273218);
        setElement(term273290, 31, term273218);
        setElement(term273290, 33, term273218);
        setElement(term273290, 35, term273218);
        setElement(term273290, 37, term273218);
        setElement(term273290, 39, term273218);
        setField(term273245, term273245.getClass(), "wallOffsets", term273290);
        setField(term273245, term273245.getClass(), "lastRules", term273291);
        setField(term273292, term273292.getClass(), "table", null);
        setField(term273292, term273292.getClass(), "nextTable", null);
        setLongField(term273292, term273292.getClass(), "baseCount", 0L);
        setIntField(term273292, term273292.getClass(), "sizeCtl", 0);
        setIntField(term273292, term273292.getClass(), "transferIndex", 0);
        setIntField(term273292, term273292.getClass(), "cellsBusy", 0);
        setField(term273292, term273292.getClass(), "counterCells", null);
        setField(term273292, term273292.getClass(), "keySet", null);
        setField(term273292, term273292.getClass(), "values", null);
        setField(term273292, term273292.getClass(), "entrySet", null);
        setField(term273292, term273292.getClass(), "keySet", null);
        setField(term273292, term273292.getClass(), "values", null);
        setField(term273245, term273245.getClass(), "lastRulesCache", term273292);
        setField(term273228, term273228.getClass(), "rules", term273245);
        setField(term273207, term273207.getClass(), "zone", term273228);
        setField(term273117, term273117.getClass(), "time_stamp", term273207);
        setField(term273117, term273117.getClass(), "start_up_mode", "AaQIoxTkkz");
        setField(term273117, term273117.getClass(), "cmm_dly_mod", "utuhuXZwKw");
        setField(term273117, term273117.getClass(), "cmm_dly_sec", "HDmUBvnTDS");
        setField(term273117, term273117.getClass(), "cmm_err_mod", "JySfuJQGCc");
        setField(term273117, term273117.getClass(), "country_code", "EYFlXZZTDu");
        setField(term273117, term273117.getClass(), "region_code", "DRGzFlWxaV");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.ingame.BuyCstmzItmRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPd_id", argTypes, term273117, args);
    }

};


