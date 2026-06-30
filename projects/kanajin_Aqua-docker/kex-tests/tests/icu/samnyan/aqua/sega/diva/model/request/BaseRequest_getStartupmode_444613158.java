package icu.samnyan.aqua.sega.diva.model.request;

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
import static icu.samnyan.aqua.sega.diva.model.request.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class BaseRequest_getStartupmode_444613158 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term251847;

    public BaseRequest_getStartupmode_444613158() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term251847 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.BaseRequest"));
        Object term251932 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term251933 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term251934 = newInstance(Class.forName("java.time.LocalDate"));
        Object term251938 = newInstance(Class.forName("java.time.LocalTime"));
        Object term251943 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term251953 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term251970 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term251971 = (long[]) newLongArray(1);
        Object[] term251973 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term251974 = (long[]) newLongArray(39);
        Object[] term252014 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term252015 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term252016 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term252017 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term251847, term251847.getClass(), "cmd", "kDhZwzBdJr");
        setField(term251847, term251847.getClass(), "req_id", "lGNwldURrK");
        setField(term251847, term251847.getClass(), "game_id", "AfRMrnPQsz");
        setField(term251847, term251847.getClass(), "r_ver", "ilHCxxLSlR");
        setField(term251847, term251847.getClass(), "kc_serial", "KINWoNPskz");
        setField(term251847, term251847.getClass(), "b_serial", "ThcARbQtxE");
        setField(term251847, term251847.getClass(), "place_id", "zPIvKiioyO");
        setIntField(term251934, term251934.getClass(), "year", 2020);
        setShortField(term251934, term251934.getClass(), "month", (short) 7);
        setShortField(term251934, term251934.getClass(), "day", (short) 24);
        setField(term251933, term251933.getClass(), "date", term251934);
        setByteField(term251938, term251938.getClass(), "hour", (byte) 22);
        setByteField(term251938, term251938.getClass(), "minute", (byte) 16);
        setByteField(term251938, term251938.getClass(), "second", (byte) 59);
        setIntField(term251938, term251938.getClass(), "nano", 588569833);
        setField(term251933, term251933.getClass(), "time", term251938);
        setField(term251932, term251932.getClass(), "dateTime", term251933);
        setIntField(term251943, term251943.getClass(), "totalSeconds", -10800);
        setField(term251943, term251943.getClass(), "id", "-03:00");
        setField(term251932, term251932.getClass(), "offset", term251943);
        setField(term251953, term251953.getClass(), "id", "America/Recife");
        setLongElement(term251971, 0, -1767217224L);
        setField(term251970, term251970.getClass(), "standardTransitions", term251971);
        setElement(term251973, 1, term251943);
        setField(term251970, term251970.getClass(), "standardOffsets", term251973);
        setLongElement(term251974, 0, -1767217224L);
        setLongElement(term251974, 1, -1206957600L);
        setLongElement(term251974, 2, -1191362400L);
        setLongElement(term251974, 3, -1175374800L);
        setLongElement(term251974, 4, -1159826400L);
        setLongElement(term251974, 5, -633819600L);
        setLongElement(term251974, 6, -622069200L);
        setLongElement(term251974, 7, -602283600L);
        setLongElement(term251974, 8, -591832800L);
        setLongElement(term251974, 9, -570747600L);
        setLongElement(term251974, 10, -560210400L);
        setLongElement(term251974, 11, -539125200L);
        setLongElement(term251974, 12, -531352800L);
        setLongElement(term251974, 13, -191365200L);
        setLongElement(term251974, 14, -184197600L);
        setLongElement(term251974, 15, -155163600L);
        setLongElement(term251974, 16, -150069600L);
        setLongElement(term251974, 17, -128898000L);
        setLongElement(term251974, 18, -121125600L);
        setLongElement(term251974, 19, -99954000L);
        setLongElement(term251974, 20, -89589600L);
        setLongElement(term251974, 21, -68418000L);
        setLongElement(term251974, 22, -57967200L);
        setLongElement(term251974, 23, 499748400L);
        setLongElement(term251974, 24, 511236000L);
        setLongElement(term251974, 25, 530593200L);
        setLongElement(term251974, 26, 540266400L);
        setLongElement(term251974, 27, 562129200L);
        setLongElement(term251974, 28, 571197600L);
        setLongElement(term251974, 29, 592974000L);
        setLongElement(term251974, 30, 602042400L);
        setLongElement(term251974, 31, 624423600L);
        setLongElement(term251974, 32, 634701600L);
        setLongElement(term251974, 33, 938919600L);
        setLongElement(term251974, 34, 951616800L);
        setLongElement(term251974, 35, 970974000L);
        setLongElement(term251974, 36, 971575200L);
        setLongElement(term251974, 37, 1003028400L);
        setLongElement(term251974, 38, 1013911200L);
        setField(term251970, term251970.getClass(), "savingsInstantTransitions", term251974);
        setField(term251970, term251970.getClass(), "savingsLocalTransitions", term252014);
        setElement(term252015, 1, term251943);
        setElement(term252015, 3, term251943);
        setElement(term252015, 5, term251943);
        setElement(term252015, 7, term251943);
        setElement(term252015, 9, term251943);
        setElement(term252015, 11, term251943);
        setElement(term252015, 13, term251943);
        setElement(term252015, 15, term251943);
        setElement(term252015, 17, term251943);
        setElement(term252015, 19, term251943);
        setElement(term252015, 21, term251943);
        setElement(term252015, 23, term251943);
        setElement(term252015, 25, term251943);
        setElement(term252015, 27, term251943);
        setElement(term252015, 29, term251943);
        setElement(term252015, 31, term251943);
        setElement(term252015, 33, term251943);
        setElement(term252015, 35, term251943);
        setElement(term252015, 37, term251943);
        setElement(term252015, 39, term251943);
        setField(term251970, term251970.getClass(), "wallOffsets", term252015);
        setField(term251970, term251970.getClass(), "lastRules", term252016);
        setField(term252017, term252017.getClass(), "table", null);
        setField(term252017, term252017.getClass(), "nextTable", null);
        setLongField(term252017, term252017.getClass(), "baseCount", 0L);
        setIntField(term252017, term252017.getClass(), "sizeCtl", 0);
        setIntField(term252017, term252017.getClass(), "transferIndex", 0);
        setIntField(term252017, term252017.getClass(), "cellsBusy", 0);
        setField(term252017, term252017.getClass(), "counterCells", null);
        setField(term252017, term252017.getClass(), "keySet", null);
        setField(term252017, term252017.getClass(), "values", null);
        setField(term252017, term252017.getClass(), "entrySet", null);
        setField(term252017, term252017.getClass(), "keySet", null);
        setField(term252017, term252017.getClass(), "values", null);
        setField(term251970, term251970.getClass(), "lastRulesCache", term252017);
        setField(term251953, term251953.getClass(), "rules", term251970);
        setField(term251932, term251932.getClass(), "zone", term251953);
        setField(term251847, term251847.getClass(), "time_stamp", term251932);
        setField(term251847, term251847.getClass(), "start_up_mode", "gkpveaZSZa");
        setField(term251847, term251847.getClass(), "cmm_dly_mod", "MJwprBacue");
        setField(term251847, term251847.getClass(), "cmm_dly_sec", "mpuBHnTLtZ");
        setField(term251847, term251847.getClass(), "cmm_err_mod", "mwseGQwGCJ");
        setField(term251847, term251847.getClass(), "country_code", "GFnDQFsVrR");
        setField(term251847, term251847.getClass(), "region_code", "UQmUTrbRaN");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.BaseRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStart_up_mode", argTypes, term251847, args);
    }

};


