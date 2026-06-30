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

public class ChangeNameRequest_setPlayername_4802815312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29567;

    public ChangeNameRequest_setPlayername_4802815312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29567 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.ChangeNameRequest"));
        Object term29692 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term29693 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29694 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29698 = newInstance(Class.forName("java.time.LocalTime"));
        Object term29703 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term29713 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term29730 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term29731 = (long[]) newLongArray(1);
        Object[] term29733 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term29734 = (long[]) newLongArray(39);
        Object[] term29774 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term29775 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term29776 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term29777 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term29567, term29567.getClass(), "a_code", "iTxNduwSjE");
        setIntField(term29567, term29567.getClass(), "aime_id", -1963464809);
        setField(term29567, term29567.getClass(), "aime_a_code", "MQUTfIiFnh");
        setIntField(term29567, term29567.getClass(), "pd_id", 71190297);
        setIntField(term29567, term29567.getClass(), "accept_idx", 1202361360);
        setField(term29567, term29567.getClass(), "player_name", "JeyKRznnft");
        setIntField(term29567, term29567.getClass(), "chg_name_price", -2015048153);
        setField(term29567, term29567.getClass(), "cmd", "vQJUCtuYpK");
        setField(term29567, term29567.getClass(), "req_id", "GHtOeztAdz");
        setField(term29567, term29567.getClass(), "game_id", "gSAtqakaLY");
        setField(term29567, term29567.getClass(), "r_ver", "taPBiMFNEZ");
        setField(term29567, term29567.getClass(), "kc_serial", "NoAFAfGyYL");
        setField(term29567, term29567.getClass(), "b_serial", "MFtfkBMyOD");
        setField(term29567, term29567.getClass(), "place_id", "rdiIyXfRtL");
        setIntField(term29694, term29694.getClass(), "year", 2011);
        setShortField(term29694, term29694.getClass(), "month", (short) 6);
        setShortField(term29694, term29694.getClass(), "day", (short) 26);
        setField(term29693, term29693.getClass(), "date", term29694);
        setByteField(term29698, term29698.getClass(), "hour", (byte) 22);
        setByteField(term29698, term29698.getClass(), "minute", (byte) 39);
        setByteField(term29698, term29698.getClass(), "second", (byte) 11);
        setIntField(term29698, term29698.getClass(), "nano", 686293604);
        setField(term29693, term29693.getClass(), "time", term29698);
        setField(term29692, term29692.getClass(), "dateTime", term29693);
        setIntField(term29703, term29703.getClass(), "totalSeconds", -10800);
        setField(term29703, term29703.getClass(), "id", "-03:00");
        setField(term29692, term29692.getClass(), "offset", term29703);
        setField(term29713, term29713.getClass(), "id", "America/Recife");
        setLongElement(term29731, 0, -1767217224L);
        setField(term29730, term29730.getClass(), "standardTransitions", term29731);
        setElement(term29733, 1, term29703);
        setField(term29730, term29730.getClass(), "standardOffsets", term29733);
        setLongElement(term29734, 0, -1767217224L);
        setLongElement(term29734, 1, -1206957600L);
        setLongElement(term29734, 2, -1191362400L);
        setLongElement(term29734, 3, -1175374800L);
        setLongElement(term29734, 4, -1159826400L);
        setLongElement(term29734, 5, -633819600L);
        setLongElement(term29734, 6, -622069200L);
        setLongElement(term29734, 7, -602283600L);
        setLongElement(term29734, 8, -591832800L);
        setLongElement(term29734, 9, -570747600L);
        setLongElement(term29734, 10, -560210400L);
        setLongElement(term29734, 11, -539125200L);
        setLongElement(term29734, 12, -531352800L);
        setLongElement(term29734, 13, -191365200L);
        setLongElement(term29734, 14, -184197600L);
        setLongElement(term29734, 15, -155163600L);
        setLongElement(term29734, 16, -150069600L);
        setLongElement(term29734, 17, -128898000L);
        setLongElement(term29734, 18, -121125600L);
        setLongElement(term29734, 19, -99954000L);
        setLongElement(term29734, 20, -89589600L);
        setLongElement(term29734, 21, -68418000L);
        setLongElement(term29734, 22, -57967200L);
        setLongElement(term29734, 23, 499748400L);
        setLongElement(term29734, 24, 511236000L);
        setLongElement(term29734, 25, 530593200L);
        setLongElement(term29734, 26, 540266400L);
        setLongElement(term29734, 27, 562129200L);
        setLongElement(term29734, 28, 571197600L);
        setLongElement(term29734, 29, 592974000L);
        setLongElement(term29734, 30, 602042400L);
        setLongElement(term29734, 31, 624423600L);
        setLongElement(term29734, 32, 634701600L);
        setLongElement(term29734, 33, 938919600L);
        setLongElement(term29734, 34, 951616800L);
        setLongElement(term29734, 35, 970974000L);
        setLongElement(term29734, 36, 971575200L);
        setLongElement(term29734, 37, 1003028400L);
        setLongElement(term29734, 38, 1013911200L);
        setField(term29730, term29730.getClass(), "savingsInstantTransitions", term29734);
        setField(term29730, term29730.getClass(), "savingsLocalTransitions", term29774);
        setElement(term29775, 1, term29703);
        setElement(term29775, 3, term29703);
        setElement(term29775, 5, term29703);
        setElement(term29775, 7, term29703);
        setElement(term29775, 9, term29703);
        setElement(term29775, 11, term29703);
        setElement(term29775, 13, term29703);
        setElement(term29775, 15, term29703);
        setElement(term29775, 17, term29703);
        setElement(term29775, 19, term29703);
        setElement(term29775, 21, term29703);
        setElement(term29775, 23, term29703);
        setElement(term29775, 25, term29703);
        setElement(term29775, 27, term29703);
        setElement(term29775, 29, term29703);
        setElement(term29775, 31, term29703);
        setElement(term29775, 33, term29703);
        setElement(term29775, 35, term29703);
        setElement(term29775, 37, term29703);
        setElement(term29775, 39, term29703);
        setField(term29730, term29730.getClass(), "wallOffsets", term29775);
        setField(term29730, term29730.getClass(), "lastRules", term29776);
        setField(term29777, term29777.getClass(), "table", null);
        setField(term29777, term29777.getClass(), "nextTable", null);
        setLongField(term29777, term29777.getClass(), "baseCount", 0L);
        setIntField(term29777, term29777.getClass(), "sizeCtl", 0);
        setIntField(term29777, term29777.getClass(), "transferIndex", 0);
        setIntField(term29777, term29777.getClass(), "cellsBusy", 0);
        setField(term29777, term29777.getClass(), "counterCells", null);
        setField(term29777, term29777.getClass(), "keySet", null);
        setField(term29777, term29777.getClass(), "values", null);
        setField(term29777, term29777.getClass(), "entrySet", null);
        setField(term29777, term29777.getClass(), "keySet", null);
        setField(term29777, term29777.getClass(), "values", null);
        setField(term29730, term29730.getClass(), "lastRulesCache", term29777);
        setField(term29713, term29713.getClass(), "rules", term29730);
        setField(term29692, term29692.getClass(), "zone", term29713);
        setField(term29567, term29567.getClass(), "time_stamp", term29692);
        setField(term29567, term29567.getClass(), "start_up_mode", "douzkltmiI");
        setField(term29567, term29567.getClass(), "cmm_dly_mod", "MFKjhvLtpe");
        setField(term29567, term29567.getClass(), "cmm_dly_sec", "xpbLKEsput");
        setField(term29567, term29567.getClass(), "cmm_err_mod", "urlyLwPBVn");
        setField(term29567, term29567.getClass(), "country_code", "SPQVzOlOzZ");
        setField(term29567, term29567.getClass(), "region_code", "bOUAgAptAI");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.ChangeNameRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "KSZfGbvzPE";
        callMethod(klass, "setPlayer_name", argTypes, term29567, args);
    }

};


