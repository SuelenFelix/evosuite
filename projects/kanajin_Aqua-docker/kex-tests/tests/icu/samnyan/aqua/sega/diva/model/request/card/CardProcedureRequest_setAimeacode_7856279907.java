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

public class CardProcedureRequest_setAimeacode_7856279907 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22848;

    public CardProcedureRequest_setAimeacode_7856279907() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22848 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.CardProcedureRequest"));
        Object term22959 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term22960 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term22961 = newInstance(Class.forName("java.time.LocalDate"));
        Object term22965 = newInstance(Class.forName("java.time.LocalTime"));
        Object term22970 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term22980 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term22997 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term22998 = (long[]) newLongArray(1);
        Object[] term23000 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term23001 = (long[]) newLongArray(39);
        Object[] term23041 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term23042 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term23043 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term23044 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setIntField(term22848, term22848.getClass(), "cd_adm_cmd", 972867650);
        setField(term22848, term22848.getClass(), "a_code", "qGkNzZAeDN");
        setIntField(term22848, term22848.getClass(), "aime_id", 1655935355);
        setField(term22848, term22848.getClass(), "aime_a_code", "wdtiuPgTVJ");
        setField(term22848, term22848.getClass(), "cmd", "HUgzMgrpsK");
        setField(term22848, term22848.getClass(), "req_id", "ubaBUfLolu");
        setField(term22848, term22848.getClass(), "game_id", "itAUCFhZhq");
        setField(term22848, term22848.getClass(), "r_ver", "bIqaKgXgPm");
        setField(term22848, term22848.getClass(), "kc_serial", "uOJFOUcNvv");
        setField(term22848, term22848.getClass(), "b_serial", "tkmmGweDwJ");
        setField(term22848, term22848.getClass(), "place_id", "pMfTuAFXxg");
        setIntField(term22961, term22961.getClass(), "year", 2018);
        setShortField(term22961, term22961.getClass(), "month", (short) 7);
        setShortField(term22961, term22961.getClass(), "day", (short) 12);
        setField(term22960, term22960.getClass(), "date", term22961);
        setByteField(term22965, term22965.getClass(), "hour", (byte) 1);
        setByteField(term22965, term22965.getClass(), "minute", (byte) 3);
        setByteField(term22965, term22965.getClass(), "second", (byte) 47);
        setIntField(term22965, term22965.getClass(), "nano", 2729929);
        setField(term22960, term22960.getClass(), "time", term22965);
        setField(term22959, term22959.getClass(), "dateTime", term22960);
        setIntField(term22970, term22970.getClass(), "totalSeconds", -10800);
        setField(term22970, term22970.getClass(), "id", "-03:00");
        setField(term22959, term22959.getClass(), "offset", term22970);
        setField(term22980, term22980.getClass(), "id", "America/Recife");
        setLongElement(term22998, 0, -1767217224L);
        setField(term22997, term22997.getClass(), "standardTransitions", term22998);
        setElement(term23000, 1, term22970);
        setField(term22997, term22997.getClass(), "standardOffsets", term23000);
        setLongElement(term23001, 0, -1767217224L);
        setLongElement(term23001, 1, -1206957600L);
        setLongElement(term23001, 2, -1191362400L);
        setLongElement(term23001, 3, -1175374800L);
        setLongElement(term23001, 4, -1159826400L);
        setLongElement(term23001, 5, -633819600L);
        setLongElement(term23001, 6, -622069200L);
        setLongElement(term23001, 7, -602283600L);
        setLongElement(term23001, 8, -591832800L);
        setLongElement(term23001, 9, -570747600L);
        setLongElement(term23001, 10, -560210400L);
        setLongElement(term23001, 11, -539125200L);
        setLongElement(term23001, 12, -531352800L);
        setLongElement(term23001, 13, -191365200L);
        setLongElement(term23001, 14, -184197600L);
        setLongElement(term23001, 15, -155163600L);
        setLongElement(term23001, 16, -150069600L);
        setLongElement(term23001, 17, -128898000L);
        setLongElement(term23001, 18, -121125600L);
        setLongElement(term23001, 19, -99954000L);
        setLongElement(term23001, 20, -89589600L);
        setLongElement(term23001, 21, -68418000L);
        setLongElement(term23001, 22, -57967200L);
        setLongElement(term23001, 23, 499748400L);
        setLongElement(term23001, 24, 511236000L);
        setLongElement(term23001, 25, 530593200L);
        setLongElement(term23001, 26, 540266400L);
        setLongElement(term23001, 27, 562129200L);
        setLongElement(term23001, 28, 571197600L);
        setLongElement(term23001, 29, 592974000L);
        setLongElement(term23001, 30, 602042400L);
        setLongElement(term23001, 31, 624423600L);
        setLongElement(term23001, 32, 634701600L);
        setLongElement(term23001, 33, 938919600L);
        setLongElement(term23001, 34, 951616800L);
        setLongElement(term23001, 35, 970974000L);
        setLongElement(term23001, 36, 971575200L);
        setLongElement(term23001, 37, 1003028400L);
        setLongElement(term23001, 38, 1013911200L);
        setField(term22997, term22997.getClass(), "savingsInstantTransitions", term23001);
        setField(term22997, term22997.getClass(), "savingsLocalTransitions", term23041);
        setElement(term23042, 1, term22970);
        setElement(term23042, 3, term22970);
        setElement(term23042, 5, term22970);
        setElement(term23042, 7, term22970);
        setElement(term23042, 9, term22970);
        setElement(term23042, 11, term22970);
        setElement(term23042, 13, term22970);
        setElement(term23042, 15, term22970);
        setElement(term23042, 17, term22970);
        setElement(term23042, 19, term22970);
        setElement(term23042, 21, term22970);
        setElement(term23042, 23, term22970);
        setElement(term23042, 25, term22970);
        setElement(term23042, 27, term22970);
        setElement(term23042, 29, term22970);
        setElement(term23042, 31, term22970);
        setElement(term23042, 33, term22970);
        setElement(term23042, 35, term22970);
        setElement(term23042, 37, term22970);
        setElement(term23042, 39, term22970);
        setField(term22997, term22997.getClass(), "wallOffsets", term23042);
        setField(term22997, term22997.getClass(), "lastRules", term23043);
        setField(term23044, term23044.getClass(), "table", null);
        setField(term23044, term23044.getClass(), "nextTable", null);
        setLongField(term23044, term23044.getClass(), "baseCount", 0L);
        setIntField(term23044, term23044.getClass(), "sizeCtl", 0);
        setIntField(term23044, term23044.getClass(), "transferIndex", 0);
        setIntField(term23044, term23044.getClass(), "cellsBusy", 0);
        setField(term23044, term23044.getClass(), "counterCells", null);
        setField(term23044, term23044.getClass(), "keySet", null);
        setField(term23044, term23044.getClass(), "values", null);
        setField(term23044, term23044.getClass(), "entrySet", null);
        setField(term23044, term23044.getClass(), "keySet", null);
        setField(term23044, term23044.getClass(), "values", null);
        setField(term22997, term22997.getClass(), "lastRulesCache", term23044);
        setField(term22980, term22980.getClass(), "rules", term22997);
        setField(term22959, term22959.getClass(), "zone", term22980);
        setField(term22848, term22848.getClass(), "time_stamp", term22959);
        setField(term22848, term22848.getClass(), "start_up_mode", "XCZmhkblRc");
        setField(term22848, term22848.getClass(), "cmm_dly_mod", "gFUWMydGCU");
        setField(term22848, term22848.getClass(), "cmm_dly_sec", "LLegSTfqJt");
        setField(term22848, term22848.getClass(), "cmm_err_mod", "XQfmqLbqHS");
        setField(term22848, term22848.getClass(), "country_code", "jLVLqQSjqg");
        setField(term22848, term22848.getClass(), "region_code", "JKGueoHesL");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.CardProcedureRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "CRAUqtVBkU";
        callMethod(klass, "setAime_a_code", argTypes, term22848, args);
    }

};


