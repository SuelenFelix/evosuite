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

public class ChangeNameRequest_getAcceptidx_1330794534 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25461;

    public ChangeNameRequest_getAcceptidx_1330794534() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25461 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.ChangeNameRequest"));
        Object term25586 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term25587 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term25588 = newInstance(Class.forName("java.time.LocalDate"));
        Object term25592 = newInstance(Class.forName("java.time.LocalTime"));
        Object term25597 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term25607 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term25624 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term25625 = (long[]) newLongArray(1);
        Object[] term25627 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term25628 = (long[]) newLongArray(39);
        Object[] term25668 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term25669 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term25670 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term25671 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term25461, term25461.getClass(), "a_code", "tlRvilQyjJ");
        setIntField(term25461, term25461.getClass(), "aime_id", -1347665717);
        setField(term25461, term25461.getClass(), "aime_a_code", "gwTUlYNpjM");
        setIntField(term25461, term25461.getClass(), "pd_id", -1888585309);
        setIntField(term25461, term25461.getClass(), "accept_idx", 683666002);
        setField(term25461, term25461.getClass(), "player_name", "uXYojRmxrM");
        setIntField(term25461, term25461.getClass(), "chg_name_price", 1596213415);
        setField(term25461, term25461.getClass(), "cmd", "cxRwRcodud");
        setField(term25461, term25461.getClass(), "req_id", "GDGBPlYeLn");
        setField(term25461, term25461.getClass(), "game_id", "jdQANIXSTq");
        setField(term25461, term25461.getClass(), "r_ver", "stVcZLTNpu");
        setField(term25461, term25461.getClass(), "kc_serial", "LgXdqWrsLL");
        setField(term25461, term25461.getClass(), "b_serial", "bbHWyibNmy");
        setField(term25461, term25461.getClass(), "place_id", "vYYOYhWMWZ");
        setIntField(term25588, term25588.getClass(), "year", 2020);
        setShortField(term25588, term25588.getClass(), "month", (short) 5);
        setShortField(term25588, term25588.getClass(), "day", (short) 18);
        setField(term25587, term25587.getClass(), "date", term25588);
        setByteField(term25592, term25592.getClass(), "hour", (byte) 5);
        setByteField(term25592, term25592.getClass(), "minute", (byte) 46);
        setByteField(term25592, term25592.getClass(), "second", (byte) 13);
        setIntField(term25592, term25592.getClass(), "nano", 45893173);
        setField(term25587, term25587.getClass(), "time", term25592);
        setField(term25586, term25586.getClass(), "dateTime", term25587);
        setIntField(term25597, term25597.getClass(), "totalSeconds", -10800);
        setField(term25597, term25597.getClass(), "id", "-03:00");
        setField(term25586, term25586.getClass(), "offset", term25597);
        setField(term25607, term25607.getClass(), "id", "America/Recife");
        setLongElement(term25625, 0, -1767217224L);
        setField(term25624, term25624.getClass(), "standardTransitions", term25625);
        setElement(term25627, 1, term25597);
        setField(term25624, term25624.getClass(), "standardOffsets", term25627);
        setLongElement(term25628, 0, -1767217224L);
        setLongElement(term25628, 1, -1206957600L);
        setLongElement(term25628, 2, -1191362400L);
        setLongElement(term25628, 3, -1175374800L);
        setLongElement(term25628, 4, -1159826400L);
        setLongElement(term25628, 5, -633819600L);
        setLongElement(term25628, 6, -622069200L);
        setLongElement(term25628, 7, -602283600L);
        setLongElement(term25628, 8, -591832800L);
        setLongElement(term25628, 9, -570747600L);
        setLongElement(term25628, 10, -560210400L);
        setLongElement(term25628, 11, -539125200L);
        setLongElement(term25628, 12, -531352800L);
        setLongElement(term25628, 13, -191365200L);
        setLongElement(term25628, 14, -184197600L);
        setLongElement(term25628, 15, -155163600L);
        setLongElement(term25628, 16, -150069600L);
        setLongElement(term25628, 17, -128898000L);
        setLongElement(term25628, 18, -121125600L);
        setLongElement(term25628, 19, -99954000L);
        setLongElement(term25628, 20, -89589600L);
        setLongElement(term25628, 21, -68418000L);
        setLongElement(term25628, 22, -57967200L);
        setLongElement(term25628, 23, 499748400L);
        setLongElement(term25628, 24, 511236000L);
        setLongElement(term25628, 25, 530593200L);
        setLongElement(term25628, 26, 540266400L);
        setLongElement(term25628, 27, 562129200L);
        setLongElement(term25628, 28, 571197600L);
        setLongElement(term25628, 29, 592974000L);
        setLongElement(term25628, 30, 602042400L);
        setLongElement(term25628, 31, 624423600L);
        setLongElement(term25628, 32, 634701600L);
        setLongElement(term25628, 33, 938919600L);
        setLongElement(term25628, 34, 951616800L);
        setLongElement(term25628, 35, 970974000L);
        setLongElement(term25628, 36, 971575200L);
        setLongElement(term25628, 37, 1003028400L);
        setLongElement(term25628, 38, 1013911200L);
        setField(term25624, term25624.getClass(), "savingsInstantTransitions", term25628);
        setField(term25624, term25624.getClass(), "savingsLocalTransitions", term25668);
        setElement(term25669, 1, term25597);
        setElement(term25669, 3, term25597);
        setElement(term25669, 5, term25597);
        setElement(term25669, 7, term25597);
        setElement(term25669, 9, term25597);
        setElement(term25669, 11, term25597);
        setElement(term25669, 13, term25597);
        setElement(term25669, 15, term25597);
        setElement(term25669, 17, term25597);
        setElement(term25669, 19, term25597);
        setElement(term25669, 21, term25597);
        setElement(term25669, 23, term25597);
        setElement(term25669, 25, term25597);
        setElement(term25669, 27, term25597);
        setElement(term25669, 29, term25597);
        setElement(term25669, 31, term25597);
        setElement(term25669, 33, term25597);
        setElement(term25669, 35, term25597);
        setElement(term25669, 37, term25597);
        setElement(term25669, 39, term25597);
        setField(term25624, term25624.getClass(), "wallOffsets", term25669);
        setField(term25624, term25624.getClass(), "lastRules", term25670);
        setField(term25671, term25671.getClass(), "table", null);
        setField(term25671, term25671.getClass(), "nextTable", null);
        setLongField(term25671, term25671.getClass(), "baseCount", 0L);
        setIntField(term25671, term25671.getClass(), "sizeCtl", 0);
        setIntField(term25671, term25671.getClass(), "transferIndex", 0);
        setIntField(term25671, term25671.getClass(), "cellsBusy", 0);
        setField(term25671, term25671.getClass(), "counterCells", null);
        setField(term25671, term25671.getClass(), "keySet", null);
        setField(term25671, term25671.getClass(), "values", null);
        setField(term25671, term25671.getClass(), "entrySet", null);
        setField(term25671, term25671.getClass(), "keySet", null);
        setField(term25671, term25671.getClass(), "values", null);
        setField(term25624, term25624.getClass(), "lastRulesCache", term25671);
        setField(term25607, term25607.getClass(), "rules", term25624);
        setField(term25586, term25586.getClass(), "zone", term25607);
        setField(term25461, term25461.getClass(), "time_stamp", term25586);
        setField(term25461, term25461.getClass(), "start_up_mode", "FLQJOzEXff");
        setField(term25461, term25461.getClass(), "cmm_dly_mod", "qlaIVJBSfQ");
        setField(term25461, term25461.getClass(), "cmm_dly_sec", "lYvIWBFFsq");
        setField(term25461, term25461.getClass(), "cmm_err_mod", "tThwsqWKcE");
        setField(term25461, term25461.getClass(), "country_code", "bkSgsDrkCN");
        setField(term25461, term25461.getClass(), "region_code", "hwjlcimgJH");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.ChangeNameRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAccept_idx", argTypes, term25461, args);
    }

};


