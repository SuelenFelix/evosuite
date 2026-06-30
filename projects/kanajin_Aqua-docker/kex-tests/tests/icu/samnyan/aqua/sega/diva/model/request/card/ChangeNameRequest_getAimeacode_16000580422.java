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

public class ChangeNameRequest_getAimeacode_16000580422 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24447;

    public ChangeNameRequest_getAimeacode_16000580422() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24447 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.ChangeNameRequest"));
        Object term24572 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term24573 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term24574 = newInstance(Class.forName("java.time.LocalDate"));
        Object term24578 = newInstance(Class.forName("java.time.LocalTime"));
        Object term24583 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term24593 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term24610 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term24611 = (long[]) newLongArray(1);
        Object[] term24613 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term24614 = (long[]) newLongArray(39);
        Object[] term24654 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term24655 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term24656 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term24657 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term24447, term24447.getClass(), "a_code", "PoTZjDuBHa");
        setIntField(term24447, term24447.getClass(), "aime_id", -505439934);
        setField(term24447, term24447.getClass(), "aime_a_code", "MIwvgVrhzP");
        setIntField(term24447, term24447.getClass(), "pd_id", -344842608);
        setIntField(term24447, term24447.getClass(), "accept_idx", 941650513);
        setField(term24447, term24447.getClass(), "player_name", "HcUUieXdep");
        setIntField(term24447, term24447.getClass(), "chg_name_price", 444029505);
        setField(term24447, term24447.getClass(), "cmd", "AbonCTtbef");
        setField(term24447, term24447.getClass(), "req_id", "maXrGOGoKA");
        setField(term24447, term24447.getClass(), "game_id", "zAkgWQVCpM");
        setField(term24447, term24447.getClass(), "r_ver", "yQUDyOroXU");
        setField(term24447, term24447.getClass(), "kc_serial", "xweqkPdyJH");
        setField(term24447, term24447.getClass(), "b_serial", "kwteHWzwcc");
        setField(term24447, term24447.getClass(), "place_id", "uMsWXqNhln");
        setIntField(term24574, term24574.getClass(), "year", 2020);
        setShortField(term24574, term24574.getClass(), "month", (short) 8);
        setShortField(term24574, term24574.getClass(), "day", (short) 15);
        setField(term24573, term24573.getClass(), "date", term24574);
        setByteField(term24578, term24578.getClass(), "hour", (byte) 2);
        setByteField(term24578, term24578.getClass(), "minute", (byte) 0);
        setByteField(term24578, term24578.getClass(), "second", (byte) 38);
        setIntField(term24578, term24578.getClass(), "nano", 146431486);
        setField(term24573, term24573.getClass(), "time", term24578);
        setField(term24572, term24572.getClass(), "dateTime", term24573);
        setIntField(term24583, term24583.getClass(), "totalSeconds", -10800);
        setField(term24583, term24583.getClass(), "id", "-03:00");
        setField(term24572, term24572.getClass(), "offset", term24583);
        setField(term24593, term24593.getClass(), "id", "America/Recife");
        setLongElement(term24611, 0, -1767217224L);
        setField(term24610, term24610.getClass(), "standardTransitions", term24611);
        setElement(term24613, 1, term24583);
        setField(term24610, term24610.getClass(), "standardOffsets", term24613);
        setLongElement(term24614, 0, -1767217224L);
        setLongElement(term24614, 1, -1206957600L);
        setLongElement(term24614, 2, -1191362400L);
        setLongElement(term24614, 3, -1175374800L);
        setLongElement(term24614, 4, -1159826400L);
        setLongElement(term24614, 5, -633819600L);
        setLongElement(term24614, 6, -622069200L);
        setLongElement(term24614, 7, -602283600L);
        setLongElement(term24614, 8, -591832800L);
        setLongElement(term24614, 9, -570747600L);
        setLongElement(term24614, 10, -560210400L);
        setLongElement(term24614, 11, -539125200L);
        setLongElement(term24614, 12, -531352800L);
        setLongElement(term24614, 13, -191365200L);
        setLongElement(term24614, 14, -184197600L);
        setLongElement(term24614, 15, -155163600L);
        setLongElement(term24614, 16, -150069600L);
        setLongElement(term24614, 17, -128898000L);
        setLongElement(term24614, 18, -121125600L);
        setLongElement(term24614, 19, -99954000L);
        setLongElement(term24614, 20, -89589600L);
        setLongElement(term24614, 21, -68418000L);
        setLongElement(term24614, 22, -57967200L);
        setLongElement(term24614, 23, 499748400L);
        setLongElement(term24614, 24, 511236000L);
        setLongElement(term24614, 25, 530593200L);
        setLongElement(term24614, 26, 540266400L);
        setLongElement(term24614, 27, 562129200L);
        setLongElement(term24614, 28, 571197600L);
        setLongElement(term24614, 29, 592974000L);
        setLongElement(term24614, 30, 602042400L);
        setLongElement(term24614, 31, 624423600L);
        setLongElement(term24614, 32, 634701600L);
        setLongElement(term24614, 33, 938919600L);
        setLongElement(term24614, 34, 951616800L);
        setLongElement(term24614, 35, 970974000L);
        setLongElement(term24614, 36, 971575200L);
        setLongElement(term24614, 37, 1003028400L);
        setLongElement(term24614, 38, 1013911200L);
        setField(term24610, term24610.getClass(), "savingsInstantTransitions", term24614);
        setField(term24610, term24610.getClass(), "savingsLocalTransitions", term24654);
        setElement(term24655, 1, term24583);
        setElement(term24655, 3, term24583);
        setElement(term24655, 5, term24583);
        setElement(term24655, 7, term24583);
        setElement(term24655, 9, term24583);
        setElement(term24655, 11, term24583);
        setElement(term24655, 13, term24583);
        setElement(term24655, 15, term24583);
        setElement(term24655, 17, term24583);
        setElement(term24655, 19, term24583);
        setElement(term24655, 21, term24583);
        setElement(term24655, 23, term24583);
        setElement(term24655, 25, term24583);
        setElement(term24655, 27, term24583);
        setElement(term24655, 29, term24583);
        setElement(term24655, 31, term24583);
        setElement(term24655, 33, term24583);
        setElement(term24655, 35, term24583);
        setElement(term24655, 37, term24583);
        setElement(term24655, 39, term24583);
        setField(term24610, term24610.getClass(), "wallOffsets", term24655);
        setField(term24610, term24610.getClass(), "lastRules", term24656);
        setField(term24657, term24657.getClass(), "table", null);
        setField(term24657, term24657.getClass(), "nextTable", null);
        setLongField(term24657, term24657.getClass(), "baseCount", 0L);
        setIntField(term24657, term24657.getClass(), "sizeCtl", 0);
        setIntField(term24657, term24657.getClass(), "transferIndex", 0);
        setIntField(term24657, term24657.getClass(), "cellsBusy", 0);
        setField(term24657, term24657.getClass(), "counterCells", null);
        setField(term24657, term24657.getClass(), "keySet", null);
        setField(term24657, term24657.getClass(), "values", null);
        setField(term24657, term24657.getClass(), "entrySet", null);
        setField(term24657, term24657.getClass(), "keySet", null);
        setField(term24657, term24657.getClass(), "values", null);
        setField(term24610, term24610.getClass(), "lastRulesCache", term24657);
        setField(term24593, term24593.getClass(), "rules", term24610);
        setField(term24572, term24572.getClass(), "zone", term24593);
        setField(term24447, term24447.getClass(), "time_stamp", term24572);
        setField(term24447, term24447.getClass(), "start_up_mode", "MAnhIPOtHL");
        setField(term24447, term24447.getClass(), "cmm_dly_mod", "dikKjYjmRO");
        setField(term24447, term24447.getClass(), "cmm_dly_sec", "GJnnMDVnEP");
        setField(term24447, term24447.getClass(), "cmm_err_mod", "zSMVllDpfk");
        setField(term24447, term24447.getClass(), "country_code", "iptRXVDoYE");
        setField(term24447, term24447.getClass(), "region_code", "kucsxnvbES");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.ChangeNameRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAime_a_code", argTypes, term24447, args);
    }

};


