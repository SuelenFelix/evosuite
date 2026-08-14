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

public class RegistrationRequest_setKeyobjtype_34936343618 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term240359;

    public RegistrationRequest_setKeyobjtype_34936343618() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term240359 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.RegistrationRequest"));
        Object term240553 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term240554 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term240555 = newInstance(Class.forName("java.time.LocalDate"));
        Object term240559 = newInstance(Class.forName("java.time.LocalTime"));
        Object term240564 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term240574 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term240591 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term240592 = (long[]) newLongArray(1);
        Object[] term240594 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term240595 = (long[]) newLongArray(39);
        Object[] term240635 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term240636 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term240637 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term240638 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term240359, term240359.getClass(), "pmm", "zAaRUjWcRI");
        setField(term240359, term240359.getClass(), "idm", "biuSELVcRS");
        setField(term240359, term240359.getClass(), "mmgameid", "QvIFmvEUyM");
        setField(term240359, term240359.getClass(), "mmuid", "WIZrBpMEJd");
        setField(term240359, term240359.getClass(), "a_code", "judJxGaXAJ");
        setIntField(term240359, term240359.getClass(), "aime_id", -1542255910);
        setField(term240359, term240359.getClass(), "aime_a_code", "YyIBJVokET");
        setField(term240359, term240359.getClass(), "key_obj_type", "oUsLXfeBhj");
        setField(term240359, term240359.getClass(), "player_name", "dNmDNoDsCT");
        setField(term240359, term240359.getClass(), "passwd", "FKYroLkXZi");
        setField(term240359, term240359.getClass(), "cmd", "qnoyvZRqBI");
        setField(term240359, term240359.getClass(), "req_id", "iBRFyvlgRW");
        setField(term240359, term240359.getClass(), "game_id", "UjtHbgdpKi");
        setField(term240359, term240359.getClass(), "r_ver", "QZUqVBZaTe");
        setField(term240359, term240359.getClass(), "kc_serial", "ulsJyRLpjn");
        setField(term240359, term240359.getClass(), "b_serial", "mPvRCwfDas");
        setField(term240359, term240359.getClass(), "place_id", "XTbkEKEVGp");
        setIntField(term240555, term240555.getClass(), "year", 2011);
        setShortField(term240555, term240555.getClass(), "month", (short) 3);
        setShortField(term240555, term240555.getClass(), "day", (short) 25);
        setField(term240554, term240554.getClass(), "date", term240555);
        setByteField(term240559, term240559.getClass(), "hour", (byte) 20);
        setByteField(term240559, term240559.getClass(), "minute", (byte) 10);
        setByteField(term240559, term240559.getClass(), "second", (byte) 51);
        setIntField(term240559, term240559.getClass(), "nano", 162102574);
        setField(term240554, term240554.getClass(), "time", term240559);
        setField(term240553, term240553.getClass(), "dateTime", term240554);
        setIntField(term240564, term240564.getClass(), "totalSeconds", -10800);
        setField(term240564, term240564.getClass(), "id", "-03:00");
        setField(term240553, term240553.getClass(), "offset", term240564);
        setField(term240574, term240574.getClass(), "id", "America/Recife");
        setLongElement(term240592, 0, -1767217224L);
        setField(term240591, term240591.getClass(), "standardTransitions", term240592);
        setElement(term240594, 1, term240564);
        setField(term240591, term240591.getClass(), "standardOffsets", term240594);
        setLongElement(term240595, 0, -1767217224L);
        setLongElement(term240595, 1, -1206957600L);
        setLongElement(term240595, 2, -1191362400L);
        setLongElement(term240595, 3, -1175374800L);
        setLongElement(term240595, 4, -1159826400L);
        setLongElement(term240595, 5, -633819600L);
        setLongElement(term240595, 6, -622069200L);
        setLongElement(term240595, 7, -602283600L);
        setLongElement(term240595, 8, -591832800L);
        setLongElement(term240595, 9, -570747600L);
        setLongElement(term240595, 10, -560210400L);
        setLongElement(term240595, 11, -539125200L);
        setLongElement(term240595, 12, -531352800L);
        setLongElement(term240595, 13, -191365200L);
        setLongElement(term240595, 14, -184197600L);
        setLongElement(term240595, 15, -155163600L);
        setLongElement(term240595, 16, -150069600L);
        setLongElement(term240595, 17, -128898000L);
        setLongElement(term240595, 18, -121125600L);
        setLongElement(term240595, 19, -99954000L);
        setLongElement(term240595, 20, -89589600L);
        setLongElement(term240595, 21, -68418000L);
        setLongElement(term240595, 22, -57967200L);
        setLongElement(term240595, 23, 499748400L);
        setLongElement(term240595, 24, 511236000L);
        setLongElement(term240595, 25, 530593200L);
        setLongElement(term240595, 26, 540266400L);
        setLongElement(term240595, 27, 562129200L);
        setLongElement(term240595, 28, 571197600L);
        setLongElement(term240595, 29, 592974000L);
        setLongElement(term240595, 30, 602042400L);
        setLongElement(term240595, 31, 624423600L);
        setLongElement(term240595, 32, 634701600L);
        setLongElement(term240595, 33, 938919600L);
        setLongElement(term240595, 34, 951616800L);
        setLongElement(term240595, 35, 970974000L);
        setLongElement(term240595, 36, 971575200L);
        setLongElement(term240595, 37, 1003028400L);
        setLongElement(term240595, 38, 1013911200L);
        setField(term240591, term240591.getClass(), "savingsInstantTransitions", term240595);
        setField(term240591, term240591.getClass(), "savingsLocalTransitions", term240635);
        setElement(term240636, 1, term240564);
        setElement(term240636, 3, term240564);
        setElement(term240636, 5, term240564);
        setElement(term240636, 7, term240564);
        setElement(term240636, 9, term240564);
        setElement(term240636, 11, term240564);
        setElement(term240636, 13, term240564);
        setElement(term240636, 15, term240564);
        setElement(term240636, 17, term240564);
        setElement(term240636, 19, term240564);
        setElement(term240636, 21, term240564);
        setElement(term240636, 23, term240564);
        setElement(term240636, 25, term240564);
        setElement(term240636, 27, term240564);
        setElement(term240636, 29, term240564);
        setElement(term240636, 31, term240564);
        setElement(term240636, 33, term240564);
        setElement(term240636, 35, term240564);
        setElement(term240636, 37, term240564);
        setElement(term240636, 39, term240564);
        setField(term240591, term240591.getClass(), "wallOffsets", term240636);
        setField(term240591, term240591.getClass(), "lastRules", term240637);
        setField(term240638, term240638.getClass(), "table", null);
        setField(term240638, term240638.getClass(), "nextTable", null);
        setLongField(term240638, term240638.getClass(), "baseCount", 0L);
        setIntField(term240638, term240638.getClass(), "sizeCtl", 0);
        setIntField(term240638, term240638.getClass(), "transferIndex", 0);
        setIntField(term240638, term240638.getClass(), "cellsBusy", 0);
        setField(term240638, term240638.getClass(), "counterCells", null);
        setField(term240638, term240638.getClass(), "keySet", null);
        setField(term240638, term240638.getClass(), "values", null);
        setField(term240638, term240638.getClass(), "entrySet", null);
        setField(term240638, term240638.getClass(), "keySet", null);
        setField(term240638, term240638.getClass(), "values", null);
        setField(term240591, term240591.getClass(), "lastRulesCache", term240638);
        setField(term240574, term240574.getClass(), "rules", term240591);
        setField(term240553, term240553.getClass(), "zone", term240574);
        setField(term240359, term240359.getClass(), "time_stamp", term240553);
        setField(term240359, term240359.getClass(), "start_up_mode", "cJBWpbUYku");
        setField(term240359, term240359.getClass(), "cmm_dly_mod", "FuPIwSZZLv");
        setField(term240359, term240359.getClass(), "cmm_dly_sec", "IHnthsxNjP");
        setField(term240359, term240359.getClass(), "cmm_err_mod", "AmuZWWgIan");
        setField(term240359, term240359.getClass(), "country_code", "niexDrHktN");
        setField(term240359, term240359.getClass(), "region_code", "zkKyhlpdHO");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.RegistrationRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "deRevaCteK";
        callMethod(klass, "setKey_obj_type", argTypes, term240359, args);
    }

};


