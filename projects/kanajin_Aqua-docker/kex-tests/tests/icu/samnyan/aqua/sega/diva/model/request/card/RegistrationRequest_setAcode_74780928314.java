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

public class RegistrationRequest_setAcode_74780928314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15269;

    public RegistrationRequest_setAcode_74780928314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15269 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.RegistrationRequest"));
        Object term15463 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term15464 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term15465 = newInstance(Class.forName("java.time.LocalDate"));
        Object term15469 = newInstance(Class.forName("java.time.LocalTime"));
        Object term15474 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term15484 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term15501 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term15502 = (long[]) newLongArray(1);
        Object[] term15504 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term15505 = (long[]) newLongArray(39);
        Object[] term15545 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term15546 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term15547 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term15548 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term15269, term15269.getClass(), "pmm", "GbahCBMvct");
        setField(term15269, term15269.getClass(), "idm", "iiHBhsNFgk");
        setField(term15269, term15269.getClass(), "mmgameid", "HknsTajwxJ");
        setField(term15269, term15269.getClass(), "mmuid", "XtiurrVYKw");
        setField(term15269, term15269.getClass(), "a_code", "rsumfoDNHa");
        setIntField(term15269, term15269.getClass(), "aime_id", 458147407);
        setField(term15269, term15269.getClass(), "aime_a_code", "ceCWHUTQUM");
        setField(term15269, term15269.getClass(), "key_obj_type", "LrqwfrKKtS");
        setField(term15269, term15269.getClass(), "player_name", "ZUdnQXfzCI");
        setField(term15269, term15269.getClass(), "passwd", "EULDrUNQvw");
        setField(term15269, term15269.getClass(), "cmd", "BtvAvsJSei");
        setField(term15269, term15269.getClass(), "req_id", "vqnBkkxoIa");
        setField(term15269, term15269.getClass(), "game_id", "bycpZjxXFn");
        setField(term15269, term15269.getClass(), "r_ver", "jQWttOAiwL");
        setField(term15269, term15269.getClass(), "kc_serial", "DzKFxEuEEC");
        setField(term15269, term15269.getClass(), "b_serial", "CAMnvfDLJL");
        setField(term15269, term15269.getClass(), "place_id", "mfHtgSbdjD");
        setIntField(term15465, term15465.getClass(), "year", 2028);
        setShortField(term15465, term15465.getClass(), "month", (short) 10);
        setShortField(term15465, term15465.getClass(), "day", (short) 1);
        setField(term15464, term15464.getClass(), "date", term15465);
        setByteField(term15469, term15469.getClass(), "hour", (byte) 17);
        setByteField(term15469, term15469.getClass(), "minute", (byte) 29);
        setByteField(term15469, term15469.getClass(), "second", (byte) 30);
        setIntField(term15469, term15469.getClass(), "nano", 845472306);
        setField(term15464, term15464.getClass(), "time", term15469);
        setField(term15463, term15463.getClass(), "dateTime", term15464);
        setIntField(term15474, term15474.getClass(), "totalSeconds", -10800);
        setField(term15474, term15474.getClass(), "id", "-03:00");
        setField(term15463, term15463.getClass(), "offset", term15474);
        setField(term15484, term15484.getClass(), "id", "America/Recife");
        setLongElement(term15502, 0, -1767217224L);
        setField(term15501, term15501.getClass(), "standardTransitions", term15502);
        setElement(term15504, 1, term15474);
        setField(term15501, term15501.getClass(), "standardOffsets", term15504);
        setLongElement(term15505, 0, -1767217224L);
        setLongElement(term15505, 1, -1206957600L);
        setLongElement(term15505, 2, -1191362400L);
        setLongElement(term15505, 3, -1175374800L);
        setLongElement(term15505, 4, -1159826400L);
        setLongElement(term15505, 5, -633819600L);
        setLongElement(term15505, 6, -622069200L);
        setLongElement(term15505, 7, -602283600L);
        setLongElement(term15505, 8, -591832800L);
        setLongElement(term15505, 9, -570747600L);
        setLongElement(term15505, 10, -560210400L);
        setLongElement(term15505, 11, -539125200L);
        setLongElement(term15505, 12, -531352800L);
        setLongElement(term15505, 13, -191365200L);
        setLongElement(term15505, 14, -184197600L);
        setLongElement(term15505, 15, -155163600L);
        setLongElement(term15505, 16, -150069600L);
        setLongElement(term15505, 17, -128898000L);
        setLongElement(term15505, 18, -121125600L);
        setLongElement(term15505, 19, -99954000L);
        setLongElement(term15505, 20, -89589600L);
        setLongElement(term15505, 21, -68418000L);
        setLongElement(term15505, 22, -57967200L);
        setLongElement(term15505, 23, 499748400L);
        setLongElement(term15505, 24, 511236000L);
        setLongElement(term15505, 25, 530593200L);
        setLongElement(term15505, 26, 540266400L);
        setLongElement(term15505, 27, 562129200L);
        setLongElement(term15505, 28, 571197600L);
        setLongElement(term15505, 29, 592974000L);
        setLongElement(term15505, 30, 602042400L);
        setLongElement(term15505, 31, 624423600L);
        setLongElement(term15505, 32, 634701600L);
        setLongElement(term15505, 33, 938919600L);
        setLongElement(term15505, 34, 951616800L);
        setLongElement(term15505, 35, 970974000L);
        setLongElement(term15505, 36, 971575200L);
        setLongElement(term15505, 37, 1003028400L);
        setLongElement(term15505, 38, 1013911200L);
        setField(term15501, term15501.getClass(), "savingsInstantTransitions", term15505);
        setField(term15501, term15501.getClass(), "savingsLocalTransitions", term15545);
        setElement(term15546, 1, term15474);
        setElement(term15546, 3, term15474);
        setElement(term15546, 5, term15474);
        setElement(term15546, 7, term15474);
        setElement(term15546, 9, term15474);
        setElement(term15546, 11, term15474);
        setElement(term15546, 13, term15474);
        setElement(term15546, 15, term15474);
        setElement(term15546, 17, term15474);
        setElement(term15546, 19, term15474);
        setElement(term15546, 21, term15474);
        setElement(term15546, 23, term15474);
        setElement(term15546, 25, term15474);
        setElement(term15546, 27, term15474);
        setElement(term15546, 29, term15474);
        setElement(term15546, 31, term15474);
        setElement(term15546, 33, term15474);
        setElement(term15546, 35, term15474);
        setElement(term15546, 37, term15474);
        setElement(term15546, 39, term15474);
        setField(term15501, term15501.getClass(), "wallOffsets", term15546);
        setField(term15501, term15501.getClass(), "lastRules", term15547);
        setField(term15548, term15548.getClass(), "table", null);
        setField(term15548, term15548.getClass(), "nextTable", null);
        setLongField(term15548, term15548.getClass(), "baseCount", 0L);
        setIntField(term15548, term15548.getClass(), "sizeCtl", 0);
        setIntField(term15548, term15548.getClass(), "transferIndex", 0);
        setIntField(term15548, term15548.getClass(), "cellsBusy", 0);
        setField(term15548, term15548.getClass(), "counterCells", null);
        setField(term15548, term15548.getClass(), "keySet", null);
        setField(term15548, term15548.getClass(), "values", null);
        setField(term15548, term15548.getClass(), "entrySet", null);
        setField(term15548, term15548.getClass(), "keySet", null);
        setField(term15548, term15548.getClass(), "values", null);
        setField(term15501, term15501.getClass(), "lastRulesCache", term15548);
        setField(term15484, term15484.getClass(), "rules", term15501);
        setField(term15463, term15463.getClass(), "zone", term15484);
        setField(term15269, term15269.getClass(), "time_stamp", term15463);
        setField(term15269, term15269.getClass(), "start_up_mode", "cmuaUiHMVL");
        setField(term15269, term15269.getClass(), "cmm_dly_mod", "xjoSGPWUgu");
        setField(term15269, term15269.getClass(), "cmm_dly_sec", "uzmqjnOUXu");
        setField(term15269, term15269.getClass(), "cmm_err_mod", "xeyjTOCOJb");
        setField(term15269, term15269.getClass(), "country_code", "DGRqjjdhzy");
        setField(term15269, term15269.getClass(), "region_code", "lQFkjJUPAR");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.RegistrationRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "BsuVlGUUjV";
        callMethod(klass, "setA_code", argTypes, term15269, args);
    }

};


