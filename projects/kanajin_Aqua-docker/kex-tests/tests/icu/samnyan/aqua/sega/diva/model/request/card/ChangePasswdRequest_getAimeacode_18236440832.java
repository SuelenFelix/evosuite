package icu.samnyan.aqua.sega.diva.model.request.card;

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
import static icu.samnyan.aqua.sega.diva.model.request.card.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ChangePasswdRequest_getAimeacode_18236440832 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1013;

    public ChangePasswdRequest_getAimeacode_18236440832() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1013 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.ChangePasswdRequest"));
        Object term1137 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term1138 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1139 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1143 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1148 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term1158 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term1175 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term1176 = (long[]) newLongArray(1);
        Object[] term1178 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term1179 = (long[]) newLongArray(39);
        Object[] term1219 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term1220 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term1221 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term1222 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term1013, term1013.getClass(), "a_code", "AijpHYOFuy");
        setIntField(term1013, term1013.getClass(), "aime_id", -1955890973);
        setField(term1013, term1013.getClass(), "aime_a_code", "SbAoxhfrkn");
        setIntField(term1013, term1013.getClass(), "pd_id", -2038273078);
        setIntField(term1013, term1013.getClass(), "accept_idx", 1227103734);
        setField(term1013, term1013.getClass(), "new_passwd", "kuTXqwMtDB");
        setField(term1013, term1013.getClass(), "cmd", "Ghbwtircqb");
        setField(term1013, term1013.getClass(), "req_id", "xrwlQZdwCp");
        setField(term1013, term1013.getClass(), "game_id", "IDCWpPLRkE");
        setField(term1013, term1013.getClass(), "r_ver", "nyiiPDVjAc");
        setField(term1013, term1013.getClass(), "kc_serial", "aKnKipADSo");
        setField(term1013, term1013.getClass(), "b_serial", "wSQxaModmm");
        setField(term1013, term1013.getClass(), "place_id", "UlajhuVLaP");
        setIntField(term1139, term1139.getClass(), "year", 2015);
        setShortField(term1139, term1139.getClass(), "month", (short) 9);
        setShortField(term1139, term1139.getClass(), "day", (short) 19);
        setField(term1138, term1138.getClass(), "date", term1139);
        setByteField(term1143, term1143.getClass(), "hour", (byte) 9);
        setByteField(term1143, term1143.getClass(), "minute", (byte) 4);
        setByteField(term1143, term1143.getClass(), "second", (byte) 10);
        setIntField(term1143, term1143.getClass(), "nano", 401765865);
        setField(term1138, term1138.getClass(), "time", term1143);
        setField(term1137, term1137.getClass(), "dateTime", term1138);
        setIntField(term1148, term1148.getClass(), "totalSeconds", -10800);
        setField(term1148, term1148.getClass(), "id", "-03:00");
        setField(term1137, term1137.getClass(), "offset", term1148);
        setField(term1158, term1158.getClass(), "id", "America/Recife");
        setLongElement(term1176, 0, -1767217224L);
        setField(term1175, term1175.getClass(), "standardTransitions", term1176);
        setElement(term1178, 1, term1148);
        setField(term1175, term1175.getClass(), "standardOffsets", term1178);
        setLongElement(term1179, 0, -1767217224L);
        setLongElement(term1179, 1, -1206957600L);
        setLongElement(term1179, 2, -1191362400L);
        setLongElement(term1179, 3, -1175374800L);
        setLongElement(term1179, 4, -1159826400L);
        setLongElement(term1179, 5, -633819600L);
        setLongElement(term1179, 6, -622069200L);
        setLongElement(term1179, 7, -602283600L);
        setLongElement(term1179, 8, -591832800L);
        setLongElement(term1179, 9, -570747600L);
        setLongElement(term1179, 10, -560210400L);
        setLongElement(term1179, 11, -539125200L);
        setLongElement(term1179, 12, -531352800L);
        setLongElement(term1179, 13, -191365200L);
        setLongElement(term1179, 14, -184197600L);
        setLongElement(term1179, 15, -155163600L);
        setLongElement(term1179, 16, -150069600L);
        setLongElement(term1179, 17, -128898000L);
        setLongElement(term1179, 18, -121125600L);
        setLongElement(term1179, 19, -99954000L);
        setLongElement(term1179, 20, -89589600L);
        setLongElement(term1179, 21, -68418000L);
        setLongElement(term1179, 22, -57967200L);
        setLongElement(term1179, 23, 499748400L);
        setLongElement(term1179, 24, 511236000L);
        setLongElement(term1179, 25, 530593200L);
        setLongElement(term1179, 26, 540266400L);
        setLongElement(term1179, 27, 562129200L);
        setLongElement(term1179, 28, 571197600L);
        setLongElement(term1179, 29, 592974000L);
        setLongElement(term1179, 30, 602042400L);
        setLongElement(term1179, 31, 624423600L);
        setLongElement(term1179, 32, 634701600L);
        setLongElement(term1179, 33, 938919600L);
        setLongElement(term1179, 34, 951616800L);
        setLongElement(term1179, 35, 970974000L);
        setLongElement(term1179, 36, 971575200L);
        setLongElement(term1179, 37, 1003028400L);
        setLongElement(term1179, 38, 1013911200L);
        setField(term1175, term1175.getClass(), "savingsInstantTransitions", term1179);
        setField(term1175, term1175.getClass(), "savingsLocalTransitions", term1219);
        setElement(term1220, 1, term1148);
        setElement(term1220, 3, term1148);
        setElement(term1220, 5, term1148);
        setElement(term1220, 7, term1148);
        setElement(term1220, 9, term1148);
        setElement(term1220, 11, term1148);
        setElement(term1220, 13, term1148);
        setElement(term1220, 15, term1148);
        setElement(term1220, 17, term1148);
        setElement(term1220, 19, term1148);
        setElement(term1220, 21, term1148);
        setElement(term1220, 23, term1148);
        setElement(term1220, 25, term1148);
        setElement(term1220, 27, term1148);
        setElement(term1220, 29, term1148);
        setElement(term1220, 31, term1148);
        setElement(term1220, 33, term1148);
        setElement(term1220, 35, term1148);
        setElement(term1220, 37, term1148);
        setElement(term1220, 39, term1148);
        setField(term1175, term1175.getClass(), "wallOffsets", term1220);
        setField(term1175, term1175.getClass(), "lastRules", term1221);
        setField(term1222, term1222.getClass(), "table", null);
        setField(term1222, term1222.getClass(), "nextTable", null);
        setLongField(term1222, term1222.getClass(), "baseCount", 0L);
        setIntField(term1222, term1222.getClass(), "sizeCtl", 0);
        setIntField(term1222, term1222.getClass(), "transferIndex", 0);
        setIntField(term1222, term1222.getClass(), "cellsBusy", 0);
        setField(term1222, term1222.getClass(), "counterCells", null);
        setField(term1222, term1222.getClass(), "keySet", null);
        setField(term1222, term1222.getClass(), "values", null);
        setField(term1222, term1222.getClass(), "entrySet", null);
        setField(term1222, term1222.getClass(), "keySet", null);
        setField(term1222, term1222.getClass(), "values", null);
        setField(term1175, term1175.getClass(), "lastRulesCache", term1222);
        setField(term1158, term1158.getClass(), "rules", term1175);
        setField(term1137, term1137.getClass(), "zone", term1158);
        setField(term1013, term1013.getClass(), "time_stamp", term1137);
        setField(term1013, term1013.getClass(), "start_up_mode", "gGSMzuGICf");
        setField(term1013, term1013.getClass(), "cmm_dly_mod", "hxCBltsObl");
        setField(term1013, term1013.getClass(), "cmm_dly_sec", "BndsHwAFMv");
        setField(term1013, term1013.getClass(), "cmm_err_mod", "GzFkzHGYFt");
        setField(term1013, term1013.getClass(), "country_code", "tShwQLRGNe");
        setField(term1013, term1013.getClass(), "region_code", "LvtrsXUliU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.ChangePasswdRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAime_a_code", argTypes, term1013, args);
    }

};


