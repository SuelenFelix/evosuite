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

public class ChangeNameRequest_getAcode_8959932730 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23433;

    public ChangeNameRequest_getAcode_8959932730() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23433 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.ChangeNameRequest"));
        Object term23558 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term23559 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term23560 = newInstance(Class.forName("java.time.LocalDate"));
        Object term23564 = newInstance(Class.forName("java.time.LocalTime"));
        Object term23569 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term23579 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term23596 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term23597 = (long[]) newLongArray(1);
        Object[] term23599 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term23600 = (long[]) newLongArray(39);
        Object[] term23640 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term23641 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term23642 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term23643 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term23433, term23433.getClass(), "a_code", "rnPhHoorxj");
        setIntField(term23433, term23433.getClass(), "aime_id", -1465035361);
        setField(term23433, term23433.getClass(), "aime_a_code", "GuwJLKquuI");
        setIntField(term23433, term23433.getClass(), "pd_id", 1090617576);
        setIntField(term23433, term23433.getClass(), "accept_idx", -1547384488);
        setField(term23433, term23433.getClass(), "player_name", "vYMCjgnztg");
        setIntField(term23433, term23433.getClass(), "chg_name_price", 1442160736);
        setField(term23433, term23433.getClass(), "cmd", "YupgKTSEiI");
        setField(term23433, term23433.getClass(), "req_id", "HuOUlaFmvJ");
        setField(term23433, term23433.getClass(), "game_id", "dWVwcwFGNo");
        setField(term23433, term23433.getClass(), "r_ver", "PNdLRrSAIY");
        setField(term23433, term23433.getClass(), "kc_serial", "nJnRIRiLZK");
        setField(term23433, term23433.getClass(), "b_serial", "eWnrMSbYbT");
        setField(term23433, term23433.getClass(), "place_id", "AjoFvDFyCY");
        setIntField(term23560, term23560.getClass(), "year", 2015);
        setShortField(term23560, term23560.getClass(), "month", (short) 12);
        setShortField(term23560, term23560.getClass(), "day", (short) 23);
        setField(term23559, term23559.getClass(), "date", term23560);
        setByteField(term23564, term23564.getClass(), "hour", (byte) 14);
        setByteField(term23564, term23564.getClass(), "minute", (byte) 17);
        setByteField(term23564, term23564.getClass(), "second", (byte) 50);
        setIntField(term23564, term23564.getClass(), "nano", 325544804);
        setField(term23559, term23559.getClass(), "time", term23564);
        setField(term23558, term23558.getClass(), "dateTime", term23559);
        setIntField(term23569, term23569.getClass(), "totalSeconds", -10800);
        setField(term23569, term23569.getClass(), "id", "-03:00");
        setField(term23558, term23558.getClass(), "offset", term23569);
        setField(term23579, term23579.getClass(), "id", "America/Recife");
        setLongElement(term23597, 0, -1767217224L);
        setField(term23596, term23596.getClass(), "standardTransitions", term23597);
        setElement(term23599, 1, term23569);
        setField(term23596, term23596.getClass(), "standardOffsets", term23599);
        setLongElement(term23600, 0, -1767217224L);
        setLongElement(term23600, 1, -1206957600L);
        setLongElement(term23600, 2, -1191362400L);
        setLongElement(term23600, 3, -1175374800L);
        setLongElement(term23600, 4, -1159826400L);
        setLongElement(term23600, 5, -633819600L);
        setLongElement(term23600, 6, -622069200L);
        setLongElement(term23600, 7, -602283600L);
        setLongElement(term23600, 8, -591832800L);
        setLongElement(term23600, 9, -570747600L);
        setLongElement(term23600, 10, -560210400L);
        setLongElement(term23600, 11, -539125200L);
        setLongElement(term23600, 12, -531352800L);
        setLongElement(term23600, 13, -191365200L);
        setLongElement(term23600, 14, -184197600L);
        setLongElement(term23600, 15, -155163600L);
        setLongElement(term23600, 16, -150069600L);
        setLongElement(term23600, 17, -128898000L);
        setLongElement(term23600, 18, -121125600L);
        setLongElement(term23600, 19, -99954000L);
        setLongElement(term23600, 20, -89589600L);
        setLongElement(term23600, 21, -68418000L);
        setLongElement(term23600, 22, -57967200L);
        setLongElement(term23600, 23, 499748400L);
        setLongElement(term23600, 24, 511236000L);
        setLongElement(term23600, 25, 530593200L);
        setLongElement(term23600, 26, 540266400L);
        setLongElement(term23600, 27, 562129200L);
        setLongElement(term23600, 28, 571197600L);
        setLongElement(term23600, 29, 592974000L);
        setLongElement(term23600, 30, 602042400L);
        setLongElement(term23600, 31, 624423600L);
        setLongElement(term23600, 32, 634701600L);
        setLongElement(term23600, 33, 938919600L);
        setLongElement(term23600, 34, 951616800L);
        setLongElement(term23600, 35, 970974000L);
        setLongElement(term23600, 36, 971575200L);
        setLongElement(term23600, 37, 1003028400L);
        setLongElement(term23600, 38, 1013911200L);
        setField(term23596, term23596.getClass(), "savingsInstantTransitions", term23600);
        setField(term23596, term23596.getClass(), "savingsLocalTransitions", term23640);
        setElement(term23641, 1, term23569);
        setElement(term23641, 3, term23569);
        setElement(term23641, 5, term23569);
        setElement(term23641, 7, term23569);
        setElement(term23641, 9, term23569);
        setElement(term23641, 11, term23569);
        setElement(term23641, 13, term23569);
        setElement(term23641, 15, term23569);
        setElement(term23641, 17, term23569);
        setElement(term23641, 19, term23569);
        setElement(term23641, 21, term23569);
        setElement(term23641, 23, term23569);
        setElement(term23641, 25, term23569);
        setElement(term23641, 27, term23569);
        setElement(term23641, 29, term23569);
        setElement(term23641, 31, term23569);
        setElement(term23641, 33, term23569);
        setElement(term23641, 35, term23569);
        setElement(term23641, 37, term23569);
        setElement(term23641, 39, term23569);
        setField(term23596, term23596.getClass(), "wallOffsets", term23641);
        setField(term23596, term23596.getClass(), "lastRules", term23642);
        setField(term23643, term23643.getClass(), "table", null);
        setField(term23643, term23643.getClass(), "nextTable", null);
        setLongField(term23643, term23643.getClass(), "baseCount", 0L);
        setIntField(term23643, term23643.getClass(), "sizeCtl", 0);
        setIntField(term23643, term23643.getClass(), "transferIndex", 0);
        setIntField(term23643, term23643.getClass(), "cellsBusy", 0);
        setField(term23643, term23643.getClass(), "counterCells", null);
        setField(term23643, term23643.getClass(), "keySet", null);
        setField(term23643, term23643.getClass(), "values", null);
        setField(term23643, term23643.getClass(), "entrySet", null);
        setField(term23643, term23643.getClass(), "keySet", null);
        setField(term23643, term23643.getClass(), "values", null);
        setField(term23596, term23596.getClass(), "lastRulesCache", term23643);
        setField(term23579, term23579.getClass(), "rules", term23596);
        setField(term23558, term23558.getClass(), "zone", term23579);
        setField(term23433, term23433.getClass(), "time_stamp", term23558);
        setField(term23433, term23433.getClass(), "start_up_mode", "OFTJwdPiTG");
        setField(term23433, term23433.getClass(), "cmm_dly_mod", "QiUprSEluR");
        setField(term23433, term23433.getClass(), "cmm_dly_sec", "cDOXXottZh");
        setField(term23433, term23433.getClass(), "cmm_err_mod", "rfqJDkDppz");
        setField(term23433, term23433.getClass(), "country_code", "MGorMVGauT");
        setField(term23433, term23433.getClass(), "region_code", "jXKxUGTuEF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.ChangeNameRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getA_code", argTypes, term23433, args);
    }

};


