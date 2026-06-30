package icu.samnyan.aqua.sega.diva.model.request.boot;

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
import static icu.samnyan.aqua.sega.diva.model.request.boot.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class AttendRequest_getAtndprm2_3883480102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1051;

    public AttendRequest_getAtndprm2_3883480102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1051 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.boot.AttendRequest"));
        Object term1184 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term1185 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1186 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1190 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1195 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term1205 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term1222 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term1223 = (long[]) newLongArray(1);
        Object[] term1225 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term1226 = (long[]) newLongArray(39);
        Object[] term1266 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term1267 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term1268 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term1269 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term1051, term1051.getClass(), "atnd_lut", "kuTXqwMtDB");
        setField(term1051, term1051.getClass(), "atnd_prm1", "Ghbwtircqb");
        setField(term1051, term1051.getClass(), "atnd_prm2", "xrwlQZdwCp");
        setField(term1051, term1051.getClass(), "atnd_prm3", "IDCWpPLRkE");
        setField(term1051, term1051.getClass(), "cmd", "nyiiPDVjAc");
        setField(term1051, term1051.getClass(), "req_id", "aKnKipADSo");
        setField(term1051, term1051.getClass(), "game_id", "wSQxaModmm");
        setField(term1051, term1051.getClass(), "r_ver", "UlajhuVLaP");
        setField(term1051, term1051.getClass(), "kc_serial", "gGSMzuGICf");
        setField(term1051, term1051.getClass(), "b_serial", "hxCBltsObl");
        setField(term1051, term1051.getClass(), "place_id", "BndsHwAFMv");
        setIntField(term1186, term1186.getClass(), "year", 2015);
        setShortField(term1186, term1186.getClass(), "month", (short) 9);
        setShortField(term1186, term1186.getClass(), "day", (short) 19);
        setField(term1185, term1185.getClass(), "date", term1186);
        setByteField(term1190, term1190.getClass(), "hour", (byte) 9);
        setByteField(term1190, term1190.getClass(), "minute", (byte) 4);
        setByteField(term1190, term1190.getClass(), "second", (byte) 10);
        setIntField(term1190, term1190.getClass(), "nano", 401765865);
        setField(term1185, term1185.getClass(), "time", term1190);
        setField(term1184, term1184.getClass(), "dateTime", term1185);
        setIntField(term1195, term1195.getClass(), "totalSeconds", -10800);
        setField(term1195, term1195.getClass(), "id", "-03:00");
        setField(term1184, term1184.getClass(), "offset", term1195);
        setField(term1205, term1205.getClass(), "id", "America/Recife");
        setLongElement(term1223, 0, -1767217224L);
        setField(term1222, term1222.getClass(), "standardTransitions", term1223);
        setElement(term1225, 1, term1195);
        setField(term1222, term1222.getClass(), "standardOffsets", term1225);
        setLongElement(term1226, 0, -1767217224L);
        setLongElement(term1226, 1, -1206957600L);
        setLongElement(term1226, 2, -1191362400L);
        setLongElement(term1226, 3, -1175374800L);
        setLongElement(term1226, 4, -1159826400L);
        setLongElement(term1226, 5, -633819600L);
        setLongElement(term1226, 6, -622069200L);
        setLongElement(term1226, 7, -602283600L);
        setLongElement(term1226, 8, -591832800L);
        setLongElement(term1226, 9, -570747600L);
        setLongElement(term1226, 10, -560210400L);
        setLongElement(term1226, 11, -539125200L);
        setLongElement(term1226, 12, -531352800L);
        setLongElement(term1226, 13, -191365200L);
        setLongElement(term1226, 14, -184197600L);
        setLongElement(term1226, 15, -155163600L);
        setLongElement(term1226, 16, -150069600L);
        setLongElement(term1226, 17, -128898000L);
        setLongElement(term1226, 18, -121125600L);
        setLongElement(term1226, 19, -99954000L);
        setLongElement(term1226, 20, -89589600L);
        setLongElement(term1226, 21, -68418000L);
        setLongElement(term1226, 22, -57967200L);
        setLongElement(term1226, 23, 499748400L);
        setLongElement(term1226, 24, 511236000L);
        setLongElement(term1226, 25, 530593200L);
        setLongElement(term1226, 26, 540266400L);
        setLongElement(term1226, 27, 562129200L);
        setLongElement(term1226, 28, 571197600L);
        setLongElement(term1226, 29, 592974000L);
        setLongElement(term1226, 30, 602042400L);
        setLongElement(term1226, 31, 624423600L);
        setLongElement(term1226, 32, 634701600L);
        setLongElement(term1226, 33, 938919600L);
        setLongElement(term1226, 34, 951616800L);
        setLongElement(term1226, 35, 970974000L);
        setLongElement(term1226, 36, 971575200L);
        setLongElement(term1226, 37, 1003028400L);
        setLongElement(term1226, 38, 1013911200L);
        setField(term1222, term1222.getClass(), "savingsInstantTransitions", term1226);
        setField(term1222, term1222.getClass(), "savingsLocalTransitions", term1266);
        setElement(term1267, 1, term1195);
        setElement(term1267, 3, term1195);
        setElement(term1267, 5, term1195);
        setElement(term1267, 7, term1195);
        setElement(term1267, 9, term1195);
        setElement(term1267, 11, term1195);
        setElement(term1267, 13, term1195);
        setElement(term1267, 15, term1195);
        setElement(term1267, 17, term1195);
        setElement(term1267, 19, term1195);
        setElement(term1267, 21, term1195);
        setElement(term1267, 23, term1195);
        setElement(term1267, 25, term1195);
        setElement(term1267, 27, term1195);
        setElement(term1267, 29, term1195);
        setElement(term1267, 31, term1195);
        setElement(term1267, 33, term1195);
        setElement(term1267, 35, term1195);
        setElement(term1267, 37, term1195);
        setElement(term1267, 39, term1195);
        setField(term1222, term1222.getClass(), "wallOffsets", term1267);
        setField(term1222, term1222.getClass(), "lastRules", term1268);
        setField(term1269, term1269.getClass(), "table", null);
        setField(term1269, term1269.getClass(), "nextTable", null);
        setLongField(term1269, term1269.getClass(), "baseCount", 0L);
        setIntField(term1269, term1269.getClass(), "sizeCtl", 0);
        setIntField(term1269, term1269.getClass(), "transferIndex", 0);
        setIntField(term1269, term1269.getClass(), "cellsBusy", 0);
        setField(term1269, term1269.getClass(), "counterCells", null);
        setField(term1269, term1269.getClass(), "keySet", null);
        setField(term1269, term1269.getClass(), "values", null);
        setField(term1269, term1269.getClass(), "entrySet", null);
        setField(term1269, term1269.getClass(), "keySet", null);
        setField(term1269, term1269.getClass(), "values", null);
        setField(term1222, term1222.getClass(), "lastRulesCache", term1269);
        setField(term1205, term1205.getClass(), "rules", term1222);
        setField(term1184, term1184.getClass(), "zone", term1205);
        setField(term1051, term1051.getClass(), "time_stamp", term1184);
        setField(term1051, term1051.getClass(), "start_up_mode", "GzFkzHGYFt");
        setField(term1051, term1051.getClass(), "cmm_dly_mod", "tShwQLRGNe");
        setField(term1051, term1051.getClass(), "cmm_dly_sec", "LvtrsXUliU");
        setField(term1051, term1051.getClass(), "cmm_err_mod", "xLbjWUgOIL");
        setField(term1051, term1051.getClass(), "country_code", "jDtqGUpnZN");
        setField(term1051, term1051.getClass(), "region_code", "nGKItKLYNC");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.boot.AttendRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAtnd_prm2", argTypes, term1051, args);
    }

};


