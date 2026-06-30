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

public class PstdItemNgLstHandler_handle_13838427561 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4838;
     Object term4839;

    public PstdItemNgLstHandler_handle_13838427561() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4838 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.handler.databank.PstdItemNgLstHandler"));
        setField(term4838, term4838.getClass(), "mapper", null);
        term4839 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.BaseRequest"));
        Object term4924 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term4925 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4926 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4930 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4935 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term4945 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term4962 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term4963 = (long[]) newLongArray(1);
        Object[] term4965 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term4966 = (long[]) newLongArray(39);
        Object[] term5006 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term5007 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term5008 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term5009 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term4839, term4839.getClass(), "cmd", "pXOkjyeIRb");
        setField(term4839, term4839.getClass(), "req_id", "GgZWSjxjyE");
        setField(term4839, term4839.getClass(), "game_id", "EeBVbzjcCI");
        setField(term4839, term4839.getClass(), "r_ver", "UfQtPRyWRC");
        setField(term4839, term4839.getClass(), "kc_serial", "FPvxVzzSvD");
        setField(term4839, term4839.getClass(), "b_serial", "WHcwFgsGFC");
        setField(term4839, term4839.getClass(), "place_id", "HzqpegHiRq");
        setIntField(term4926, term4926.getClass(), "year", 2018);
        setShortField(term4926, term4926.getClass(), "month", (short) 9);
        setShortField(term4926, term4926.getClass(), "day", (short) 28);
        setField(term4925, term4925.getClass(), "date", term4926);
        setByteField(term4930, term4930.getClass(), "hour", (byte) 3);
        setByteField(term4930, term4930.getClass(), "minute", (byte) 37);
        setByteField(term4930, term4930.getClass(), "second", (byte) 46);
        setIntField(term4930, term4930.getClass(), "nano", 763326845);
        setField(term4925, term4925.getClass(), "time", term4930);
        setField(term4924, term4924.getClass(), "dateTime", term4925);
        setIntField(term4935, term4935.getClass(), "totalSeconds", -10800);
        setField(term4935, term4935.getClass(), "id", "-03:00");
        setField(term4924, term4924.getClass(), "offset", term4935);
        setField(term4945, term4945.getClass(), "id", "America/Recife");
        setLongElement(term4963, 0, -1767217224L);
        setField(term4962, term4962.getClass(), "standardTransitions", term4963);
        setElement(term4965, 1, term4935);
        setField(term4962, term4962.getClass(), "standardOffsets", term4965);
        setLongElement(term4966, 0, -1767217224L);
        setLongElement(term4966, 1, -1206957600L);
        setLongElement(term4966, 2, -1191362400L);
        setLongElement(term4966, 3, -1175374800L);
        setLongElement(term4966, 4, -1159826400L);
        setLongElement(term4966, 5, -633819600L);
        setLongElement(term4966, 6, -622069200L);
        setLongElement(term4966, 7, -602283600L);
        setLongElement(term4966, 8, -591832800L);
        setLongElement(term4966, 9, -570747600L);
        setLongElement(term4966, 10, -560210400L);
        setLongElement(term4966, 11, -539125200L);
        setLongElement(term4966, 12, -531352800L);
        setLongElement(term4966, 13, -191365200L);
        setLongElement(term4966, 14, -184197600L);
        setLongElement(term4966, 15, -155163600L);
        setLongElement(term4966, 16, -150069600L);
        setLongElement(term4966, 17, -128898000L);
        setLongElement(term4966, 18, -121125600L);
        setLongElement(term4966, 19, -99954000L);
        setLongElement(term4966, 20, -89589600L);
        setLongElement(term4966, 21, -68418000L);
        setLongElement(term4966, 22, -57967200L);
        setLongElement(term4966, 23, 499748400L);
        setLongElement(term4966, 24, 511236000L);
        setLongElement(term4966, 25, 530593200L);
        setLongElement(term4966, 26, 540266400L);
        setLongElement(term4966, 27, 562129200L);
        setLongElement(term4966, 28, 571197600L);
        setLongElement(term4966, 29, 592974000L);
        setLongElement(term4966, 30, 602042400L);
        setLongElement(term4966, 31, 624423600L);
        setLongElement(term4966, 32, 634701600L);
        setLongElement(term4966, 33, 938919600L);
        setLongElement(term4966, 34, 951616800L);
        setLongElement(term4966, 35, 970974000L);
        setLongElement(term4966, 36, 971575200L);
        setLongElement(term4966, 37, 1003028400L);
        setLongElement(term4966, 38, 1013911200L);
        setField(term4962, term4962.getClass(), "savingsInstantTransitions", term4966);
        setField(term4962, term4962.getClass(), "savingsLocalTransitions", term5006);
        setElement(term5007, 1, term4935);
        setElement(term5007, 3, term4935);
        setElement(term5007, 5, term4935);
        setElement(term5007, 7, term4935);
        setElement(term5007, 9, term4935);
        setElement(term5007, 11, term4935);
        setElement(term5007, 13, term4935);
        setElement(term5007, 15, term4935);
        setElement(term5007, 17, term4935);
        setElement(term5007, 19, term4935);
        setElement(term5007, 21, term4935);
        setElement(term5007, 23, term4935);
        setElement(term5007, 25, term4935);
        setElement(term5007, 27, term4935);
        setElement(term5007, 29, term4935);
        setElement(term5007, 31, term4935);
        setElement(term5007, 33, term4935);
        setElement(term5007, 35, term4935);
        setElement(term5007, 37, term4935);
        setElement(term5007, 39, term4935);
        setField(term4962, term4962.getClass(), "wallOffsets", term5007);
        setField(term4962, term4962.getClass(), "lastRules", term5008);
        setField(term5009, term5009.getClass(), "table", null);
        setField(term5009, term5009.getClass(), "nextTable", null);
        setLongField(term5009, term5009.getClass(), "baseCount", 0L);
        setIntField(term5009, term5009.getClass(), "sizeCtl", 0);
        setIntField(term5009, term5009.getClass(), "transferIndex", 0);
        setIntField(term5009, term5009.getClass(), "cellsBusy", 0);
        setField(term5009, term5009.getClass(), "counterCells", null);
        setField(term5009, term5009.getClass(), "keySet", null);
        setField(term5009, term5009.getClass(), "values", null);
        setField(term5009, term5009.getClass(), "entrySet", null);
        setField(term5009, term5009.getClass(), "keySet", null);
        setField(term5009, term5009.getClass(), "values", null);
        setField(term4962, term4962.getClass(), "lastRulesCache", term5009);
        setField(term4945, term4945.getClass(), "rules", term4962);
        setField(term4924, term4924.getClass(), "zone", term4945);
        setField(term4839, term4839.getClass(), "time_stamp", term4924);
        setField(term4839, term4839.getClass(), "start_up_mode", "jwsfVjMoJT");
        setField(term4839, term4839.getClass(), "cmm_dly_mod", "ZfdXfCCFDf");
        setField(term4839, term4839.getClass(), "cmm_dly_sec", "MwwjNtdOFT");
        setField(term4839, term4839.getClass(), "cmm_err_mod", "VYkqXKVlAJ");
        setField(term4839, term4839.getClass(), "country_code", "XkIoWJRNwN");
        setField(term4839, term4839.getClass(), "region_code", "aNWLJdrZMq");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.handler.databank.PstdItemNgLstHandler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.diva.model.request.BaseRequest");
        Object[] args = new Object[1];
        args[0] = term4839;
        callMethod(klass, "handle", argTypes, term4838, args);
    }

};


