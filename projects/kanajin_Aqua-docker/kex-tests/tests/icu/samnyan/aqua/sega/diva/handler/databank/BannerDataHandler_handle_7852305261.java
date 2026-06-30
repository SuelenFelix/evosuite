package icu.samnyan.aqua.sega.diva.handler.databank;

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
import static icu.samnyan.aqua.sega.diva.handler.databank.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class BannerDataHandler_handle_7852305261 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8318;
     Object term8319;

    public BannerDataHandler_handle_7852305261() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8318 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.handler.databank.BannerDataHandler"));
        setField(term8318, term8318.getClass(), "mapper", null);
        term8319 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.databank.BannerDataRequest"));
        Object term8405 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term8406 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8407 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8411 = newInstance(Class.forName("java.time.LocalTime"));
        Object term8416 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term8426 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term8443 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term8444 = (long[]) newLongArray(1);
        Object[] term8446 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term8447 = (long[]) newLongArray(39);
        Object[] term8487 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term8488 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term8489 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term8490 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setIntField(term8319, term8319.getClass(), "bd_id", 1725571209);
        setField(term8319, term8319.getClass(), "cmd", "RMsXuyzKJV");
        setField(term8319, term8319.getClass(), "req_id", "FwPbDZcHmB");
        setField(term8319, term8319.getClass(), "game_id", "hOncybyCAH");
        setField(term8319, term8319.getClass(), "r_ver", "QduALnDSVo");
        setField(term8319, term8319.getClass(), "kc_serial", "izPpKDErnQ");
        setField(term8319, term8319.getClass(), "b_serial", "NnpwZBUTvx");
        setField(term8319, term8319.getClass(), "place_id", "tlQSNgTkQX");
        setIntField(term8407, term8407.getClass(), "year", 2015);
        setShortField(term8407, term8407.getClass(), "month", (short) 9);
        setShortField(term8407, term8407.getClass(), "day", (short) 16);
        setField(term8406, term8406.getClass(), "date", term8407);
        setByteField(term8411, term8411.getClass(), "hour", (byte) 6);
        setByteField(term8411, term8411.getClass(), "minute", (byte) 19);
        setByteField(term8411, term8411.getClass(), "second", (byte) 42);
        setIntField(term8411, term8411.getClass(), "nano", 630084975);
        setField(term8406, term8406.getClass(), "time", term8411);
        setField(term8405, term8405.getClass(), "dateTime", term8406);
        setIntField(term8416, term8416.getClass(), "totalSeconds", -10800);
        setField(term8416, term8416.getClass(), "id", "-03:00");
        setField(term8405, term8405.getClass(), "offset", term8416);
        setField(term8426, term8426.getClass(), "id", "America/Recife");
        setLongElement(term8444, 0, -1767217224L);
        setField(term8443, term8443.getClass(), "standardTransitions", term8444);
        setElement(term8446, 1, term8416);
        setField(term8443, term8443.getClass(), "standardOffsets", term8446);
        setLongElement(term8447, 0, -1767217224L);
        setLongElement(term8447, 1, -1206957600L);
        setLongElement(term8447, 2, -1191362400L);
        setLongElement(term8447, 3, -1175374800L);
        setLongElement(term8447, 4, -1159826400L);
        setLongElement(term8447, 5, -633819600L);
        setLongElement(term8447, 6, -622069200L);
        setLongElement(term8447, 7, -602283600L);
        setLongElement(term8447, 8, -591832800L);
        setLongElement(term8447, 9, -570747600L);
        setLongElement(term8447, 10, -560210400L);
        setLongElement(term8447, 11, -539125200L);
        setLongElement(term8447, 12, -531352800L);
        setLongElement(term8447, 13, -191365200L);
        setLongElement(term8447, 14, -184197600L);
        setLongElement(term8447, 15, -155163600L);
        setLongElement(term8447, 16, -150069600L);
        setLongElement(term8447, 17, -128898000L);
        setLongElement(term8447, 18, -121125600L);
        setLongElement(term8447, 19, -99954000L);
        setLongElement(term8447, 20, -89589600L);
        setLongElement(term8447, 21, -68418000L);
        setLongElement(term8447, 22, -57967200L);
        setLongElement(term8447, 23, 499748400L);
        setLongElement(term8447, 24, 511236000L);
        setLongElement(term8447, 25, 530593200L);
        setLongElement(term8447, 26, 540266400L);
        setLongElement(term8447, 27, 562129200L);
        setLongElement(term8447, 28, 571197600L);
        setLongElement(term8447, 29, 592974000L);
        setLongElement(term8447, 30, 602042400L);
        setLongElement(term8447, 31, 624423600L);
        setLongElement(term8447, 32, 634701600L);
        setLongElement(term8447, 33, 938919600L);
        setLongElement(term8447, 34, 951616800L);
        setLongElement(term8447, 35, 970974000L);
        setLongElement(term8447, 36, 971575200L);
        setLongElement(term8447, 37, 1003028400L);
        setLongElement(term8447, 38, 1013911200L);
        setField(term8443, term8443.getClass(), "savingsInstantTransitions", term8447);
        setField(term8443, term8443.getClass(), "savingsLocalTransitions", term8487);
        setElement(term8488, 1, term8416);
        setElement(term8488, 3, term8416);
        setElement(term8488, 5, term8416);
        setElement(term8488, 7, term8416);
        setElement(term8488, 9, term8416);
        setElement(term8488, 11, term8416);
        setElement(term8488, 13, term8416);
        setElement(term8488, 15, term8416);
        setElement(term8488, 17, term8416);
        setElement(term8488, 19, term8416);
        setElement(term8488, 21, term8416);
        setElement(term8488, 23, term8416);
        setElement(term8488, 25, term8416);
        setElement(term8488, 27, term8416);
        setElement(term8488, 29, term8416);
        setElement(term8488, 31, term8416);
        setElement(term8488, 33, term8416);
        setElement(term8488, 35, term8416);
        setElement(term8488, 37, term8416);
        setElement(term8488, 39, term8416);
        setField(term8443, term8443.getClass(), "wallOffsets", term8488);
        setField(term8443, term8443.getClass(), "lastRules", term8489);
        setField(term8490, term8490.getClass(), "table", null);
        setField(term8490, term8490.getClass(), "nextTable", null);
        setLongField(term8490, term8490.getClass(), "baseCount", 0L);
        setIntField(term8490, term8490.getClass(), "sizeCtl", 0);
        setIntField(term8490, term8490.getClass(), "transferIndex", 0);
        setIntField(term8490, term8490.getClass(), "cellsBusy", 0);
        setField(term8490, term8490.getClass(), "counterCells", null);
        setField(term8490, term8490.getClass(), "keySet", null);
        setField(term8490, term8490.getClass(), "values", null);
        setField(term8490, term8490.getClass(), "entrySet", null);
        setField(term8490, term8490.getClass(), "keySet", null);
        setField(term8490, term8490.getClass(), "values", null);
        setField(term8443, term8443.getClass(), "lastRulesCache", term8490);
        setField(term8426, term8426.getClass(), "rules", term8443);
        setField(term8405, term8405.getClass(), "zone", term8426);
        setField(term8319, term8319.getClass(), "time_stamp", term8405);
        setField(term8319, term8319.getClass(), "start_up_mode", "PCipZnmBOF");
        setField(term8319, term8319.getClass(), "cmm_dly_mod", "zcorEihhLK");
        setField(term8319, term8319.getClass(), "cmm_dly_sec", "GrqozDKFOk");
        setField(term8319, term8319.getClass(), "cmm_err_mod", "CFyoseFGLF");
        setField(term8319, term8319.getClass(), "country_code", "SFqCrhEWLm");
        setField(term8319, term8319.getClass(), "region_code", "GZdcJyZntS");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.handler.databank.BannerDataHandler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.diva.model.request.databank.BannerDataRequest");
        Object[] args = new Object[1];
        args[0] = term8319;
        callMethod(klass, "handle", argTypes, term8318, args);
    }

};


