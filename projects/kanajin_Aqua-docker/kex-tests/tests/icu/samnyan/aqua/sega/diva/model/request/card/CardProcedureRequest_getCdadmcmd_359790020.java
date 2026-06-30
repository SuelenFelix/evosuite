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

public class CardProcedureRequest_getCdadmcmd_359790020 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19441;

    public CardProcedureRequest_getCdadmcmd_359790020() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19441 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.CardProcedureRequest"));
        Object term19552 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term19553 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term19554 = newInstance(Class.forName("java.time.LocalDate"));
        Object term19558 = newInstance(Class.forName("java.time.LocalTime"));
        Object term19563 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term19573 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term19590 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term19591 = (long[]) newLongArray(1);
        Object[] term19593 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term19594 = (long[]) newLongArray(39);
        Object[] term19634 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term19635 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term19636 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term19637 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setIntField(term19441, term19441.getClass(), "cd_adm_cmd", 1225272962);
        setField(term19441, term19441.getClass(), "a_code", "IiNCZfdouL");
        setIntField(term19441, term19441.getClass(), "aime_id", 1324040357);
        setField(term19441, term19441.getClass(), "aime_a_code", "AhOHzCsHKW");
        setField(term19441, term19441.getClass(), "cmd", "UqgLPaaAHi");
        setField(term19441, term19441.getClass(), "req_id", "xypryEkUPF");
        setField(term19441, term19441.getClass(), "game_id", "zyZTzHNjQr");
        setField(term19441, term19441.getClass(), "r_ver", "YSrFKQQwXE");
        setField(term19441, term19441.getClass(), "kc_serial", "qxhOsmyyjm");
        setField(term19441, term19441.getClass(), "b_serial", "DuKcNfVVYR");
        setField(term19441, term19441.getClass(), "place_id", "fRujHWvXjJ");
        setIntField(term19554, term19554.getClass(), "year", 2012);
        setShortField(term19554, term19554.getClass(), "month", (short) 3);
        setShortField(term19554, term19554.getClass(), "day", (short) 27);
        setField(term19553, term19553.getClass(), "date", term19554);
        setByteField(term19558, term19558.getClass(), "hour", (byte) 17);
        setByteField(term19558, term19558.getClass(), "minute", (byte) 49);
        setByteField(term19558, term19558.getClass(), "second", (byte) 24);
        setIntField(term19558, term19558.getClass(), "nano", 530647398);
        setField(term19553, term19553.getClass(), "time", term19558);
        setField(term19552, term19552.getClass(), "dateTime", term19553);
        setIntField(term19563, term19563.getClass(), "totalSeconds", -10800);
        setField(term19563, term19563.getClass(), "id", "-03:00");
        setField(term19552, term19552.getClass(), "offset", term19563);
        setField(term19573, term19573.getClass(), "id", "America/Recife");
        setLongElement(term19591, 0, -1767217224L);
        setField(term19590, term19590.getClass(), "standardTransitions", term19591);
        setElement(term19593, 1, term19563);
        setField(term19590, term19590.getClass(), "standardOffsets", term19593);
        setLongElement(term19594, 0, -1767217224L);
        setLongElement(term19594, 1, -1206957600L);
        setLongElement(term19594, 2, -1191362400L);
        setLongElement(term19594, 3, -1175374800L);
        setLongElement(term19594, 4, -1159826400L);
        setLongElement(term19594, 5, -633819600L);
        setLongElement(term19594, 6, -622069200L);
        setLongElement(term19594, 7, -602283600L);
        setLongElement(term19594, 8, -591832800L);
        setLongElement(term19594, 9, -570747600L);
        setLongElement(term19594, 10, -560210400L);
        setLongElement(term19594, 11, -539125200L);
        setLongElement(term19594, 12, -531352800L);
        setLongElement(term19594, 13, -191365200L);
        setLongElement(term19594, 14, -184197600L);
        setLongElement(term19594, 15, -155163600L);
        setLongElement(term19594, 16, -150069600L);
        setLongElement(term19594, 17, -128898000L);
        setLongElement(term19594, 18, -121125600L);
        setLongElement(term19594, 19, -99954000L);
        setLongElement(term19594, 20, -89589600L);
        setLongElement(term19594, 21, -68418000L);
        setLongElement(term19594, 22, -57967200L);
        setLongElement(term19594, 23, 499748400L);
        setLongElement(term19594, 24, 511236000L);
        setLongElement(term19594, 25, 530593200L);
        setLongElement(term19594, 26, 540266400L);
        setLongElement(term19594, 27, 562129200L);
        setLongElement(term19594, 28, 571197600L);
        setLongElement(term19594, 29, 592974000L);
        setLongElement(term19594, 30, 602042400L);
        setLongElement(term19594, 31, 624423600L);
        setLongElement(term19594, 32, 634701600L);
        setLongElement(term19594, 33, 938919600L);
        setLongElement(term19594, 34, 951616800L);
        setLongElement(term19594, 35, 970974000L);
        setLongElement(term19594, 36, 971575200L);
        setLongElement(term19594, 37, 1003028400L);
        setLongElement(term19594, 38, 1013911200L);
        setField(term19590, term19590.getClass(), "savingsInstantTransitions", term19594);
        setField(term19590, term19590.getClass(), "savingsLocalTransitions", term19634);
        setElement(term19635, 1, term19563);
        setElement(term19635, 3, term19563);
        setElement(term19635, 5, term19563);
        setElement(term19635, 7, term19563);
        setElement(term19635, 9, term19563);
        setElement(term19635, 11, term19563);
        setElement(term19635, 13, term19563);
        setElement(term19635, 15, term19563);
        setElement(term19635, 17, term19563);
        setElement(term19635, 19, term19563);
        setElement(term19635, 21, term19563);
        setElement(term19635, 23, term19563);
        setElement(term19635, 25, term19563);
        setElement(term19635, 27, term19563);
        setElement(term19635, 29, term19563);
        setElement(term19635, 31, term19563);
        setElement(term19635, 33, term19563);
        setElement(term19635, 35, term19563);
        setElement(term19635, 37, term19563);
        setElement(term19635, 39, term19563);
        setField(term19590, term19590.getClass(), "wallOffsets", term19635);
        setField(term19590, term19590.getClass(), "lastRules", term19636);
        setField(term19637, term19637.getClass(), "table", null);
        setField(term19637, term19637.getClass(), "nextTable", null);
        setLongField(term19637, term19637.getClass(), "baseCount", 0L);
        setIntField(term19637, term19637.getClass(), "sizeCtl", 0);
        setIntField(term19637, term19637.getClass(), "transferIndex", 0);
        setIntField(term19637, term19637.getClass(), "cellsBusy", 0);
        setField(term19637, term19637.getClass(), "counterCells", null);
        setField(term19637, term19637.getClass(), "keySet", null);
        setField(term19637, term19637.getClass(), "values", null);
        setField(term19637, term19637.getClass(), "entrySet", null);
        setField(term19637, term19637.getClass(), "keySet", null);
        setField(term19637, term19637.getClass(), "values", null);
        setField(term19590, term19590.getClass(), "lastRulesCache", term19637);
        setField(term19573, term19573.getClass(), "rules", term19590);
        setField(term19552, term19552.getClass(), "zone", term19573);
        setField(term19441, term19441.getClass(), "time_stamp", term19552);
        setField(term19441, term19441.getClass(), "start_up_mode", "EAIAAStlTz");
        setField(term19441, term19441.getClass(), "cmm_dly_mod", "yIWXcOQTgy");
        setField(term19441, term19441.getClass(), "cmm_dly_sec", "xAWekqanqc");
        setField(term19441, term19441.getClass(), "cmm_err_mod", "GSOWFHMlbF");
        setField(term19441, term19441.getClass(), "country_code", "vpZIqpFbKM");
        setField(term19441, term19441.getClass(), "region_code", "dAbwpJCDif");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.CardProcedureRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCd_adm_cmd", argTypes, term19441, args);
    }

};


