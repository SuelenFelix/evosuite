package icu.samnyan.aqua.sega.diva.model.request.ingame;

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
import static icu.samnyan.aqua.sega.diva.model.request.ingame.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class BuyModuleRequest_setStartidx_17168581057 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term257491;
     Object term257743;

    public BuyModuleRequest_setStartidx_17168581057() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term257491 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.ingame.BuyModuleRequest"));
        Object term257581 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term257582 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term257583 = newInstance(Class.forName("java.time.LocalDate"));
        Object term257587 = newInstance(Class.forName("java.time.LocalTime"));
        Object term257592 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term257602 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term257619 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term257620 = (long[]) newLongArray(1);
        Object[] term257622 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term257623 = (long[]) newLongArray(39);
        Object[] term257663 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term257664 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term257665 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term257666 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setIntField(term257491, term257491.getClass(), "pd_id", 1091699242);
        setIntField(term257491, term257491.getClass(), "accept_idx", -1365884226);
        setIntField(term257491, term257491.getClass(), "start_idx", 1534588480);
        setIntField(term257491, term257491.getClass(), "mdl_id", -1535488892);
        setIntField(term257491, term257491.getClass(), "mdl_price", 1701620812);
        setField(term257491, term257491.getClass(), "cmd", "NSGSwngDCi");
        setField(term257491, term257491.getClass(), "req_id", "IqTXCynBeA");
        setField(term257491, term257491.getClass(), "game_id", "bgIAbyunKO");
        setField(term257491, term257491.getClass(), "r_ver", "ECOAkMOcmP");
        setField(term257491, term257491.getClass(), "kc_serial", "GropLwcnsd");
        setField(term257491, term257491.getClass(), "b_serial", "OPVlJKGGVY");
        setField(term257491, term257491.getClass(), "place_id", "kcbEwUStJX");
        setIntField(term257583, term257583.getClass(), "year", 2019);
        setShortField(term257583, term257583.getClass(), "month", (short) 8);
        setShortField(term257583, term257583.getClass(), "day", (short) 6);
        setField(term257582, term257582.getClass(), "date", term257583);
        setByteField(term257587, term257587.getClass(), "hour", (byte) 5);
        setByteField(term257587, term257587.getClass(), "minute", (byte) 32);
        setByteField(term257587, term257587.getClass(), "second", (byte) 47);
        setIntField(term257587, term257587.getClass(), "nano", 73220317);
        setField(term257582, term257582.getClass(), "time", term257587);
        setField(term257581, term257581.getClass(), "dateTime", term257582);
        setIntField(term257592, term257592.getClass(), "totalSeconds", -10800);
        setField(term257592, term257592.getClass(), "id", "-03:00");
        setField(term257581, term257581.getClass(), "offset", term257592);
        setField(term257602, term257602.getClass(), "id", "America/Recife");
        setLongElement(term257620, 0, -1767217224L);
        setField(term257619, term257619.getClass(), "standardTransitions", term257620);
        setElement(term257622, 1, term257592);
        setField(term257619, term257619.getClass(), "standardOffsets", term257622);
        setLongElement(term257623, 0, -1767217224L);
        setLongElement(term257623, 1, -1206957600L);
        setLongElement(term257623, 2, -1191362400L);
        setLongElement(term257623, 3, -1175374800L);
        setLongElement(term257623, 4, -1159826400L);
        setLongElement(term257623, 5, -633819600L);
        setLongElement(term257623, 6, -622069200L);
        setLongElement(term257623, 7, -602283600L);
        setLongElement(term257623, 8, -591832800L);
        setLongElement(term257623, 9, -570747600L);
        setLongElement(term257623, 10, -560210400L);
        setLongElement(term257623, 11, -539125200L);
        setLongElement(term257623, 12, -531352800L);
        setLongElement(term257623, 13, -191365200L);
        setLongElement(term257623, 14, -184197600L);
        setLongElement(term257623, 15, -155163600L);
        setLongElement(term257623, 16, -150069600L);
        setLongElement(term257623, 17, -128898000L);
        setLongElement(term257623, 18, -121125600L);
        setLongElement(term257623, 19, -99954000L);
        setLongElement(term257623, 20, -89589600L);
        setLongElement(term257623, 21, -68418000L);
        setLongElement(term257623, 22, -57967200L);
        setLongElement(term257623, 23, 499748400L);
        setLongElement(term257623, 24, 511236000L);
        setLongElement(term257623, 25, 530593200L);
        setLongElement(term257623, 26, 540266400L);
        setLongElement(term257623, 27, 562129200L);
        setLongElement(term257623, 28, 571197600L);
        setLongElement(term257623, 29, 592974000L);
        setLongElement(term257623, 30, 602042400L);
        setLongElement(term257623, 31, 624423600L);
        setLongElement(term257623, 32, 634701600L);
        setLongElement(term257623, 33, 938919600L);
        setLongElement(term257623, 34, 951616800L);
        setLongElement(term257623, 35, 970974000L);
        setLongElement(term257623, 36, 971575200L);
        setLongElement(term257623, 37, 1003028400L);
        setLongElement(term257623, 38, 1013911200L);
        setField(term257619, term257619.getClass(), "savingsInstantTransitions", term257623);
        setField(term257619, term257619.getClass(), "savingsLocalTransitions", term257663);
        setElement(term257664, 1, term257592);
        setElement(term257664, 3, term257592);
        setElement(term257664, 5, term257592);
        setElement(term257664, 7, term257592);
        setElement(term257664, 9, term257592);
        setElement(term257664, 11, term257592);
        setElement(term257664, 13, term257592);
        setElement(term257664, 15, term257592);
        setElement(term257664, 17, term257592);
        setElement(term257664, 19, term257592);
        setElement(term257664, 21, term257592);
        setElement(term257664, 23, term257592);
        setElement(term257664, 25, term257592);
        setElement(term257664, 27, term257592);
        setElement(term257664, 29, term257592);
        setElement(term257664, 31, term257592);
        setElement(term257664, 33, term257592);
        setElement(term257664, 35, term257592);
        setElement(term257664, 37, term257592);
        setElement(term257664, 39, term257592);
        setField(term257619, term257619.getClass(), "wallOffsets", term257664);
        setField(term257619, term257619.getClass(), "lastRules", term257665);
        setField(term257666, term257666.getClass(), "table", null);
        setField(term257666, term257666.getClass(), "nextTable", null);
        setLongField(term257666, term257666.getClass(), "baseCount", 0L);
        setIntField(term257666, term257666.getClass(), "sizeCtl", 0);
        setIntField(term257666, term257666.getClass(), "transferIndex", 0);
        setIntField(term257666, term257666.getClass(), "cellsBusy", 0);
        setField(term257666, term257666.getClass(), "counterCells", null);
        setField(term257666, term257666.getClass(), "keySet", null);
        setField(term257666, term257666.getClass(), "values", null);
        setField(term257666, term257666.getClass(), "entrySet", null);
        setField(term257666, term257666.getClass(), "keySet", null);
        setField(term257666, term257666.getClass(), "values", null);
        setField(term257619, term257619.getClass(), "lastRulesCache", term257666);
        setField(term257602, term257602.getClass(), "rules", term257619);
        setField(term257581, term257581.getClass(), "zone", term257602);
        setField(term257491, term257491.getClass(), "time_stamp", term257581);
        setField(term257491, term257491.getClass(), "start_up_mode", "rbJDQpboBH");
        setField(term257491, term257491.getClass(), "cmm_dly_mod", "AJvPxKmklj");
        setField(term257491, term257491.getClass(), "cmm_dly_sec", "nXIqTwQhkl");
        setField(term257491, term257491.getClass(), "cmm_err_mod", "TwSWGxsbpT");
        setField(term257491, term257491.getClass(), "country_code", "hfUAGLGTYY");
        setField(term257491, term257491.getClass(), "region_code", "pjXjkGlBZo");
        term257743 = new Integer(-1146635989);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.ingame.BuyModuleRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term257743;
        callMethod(klass, "setStart_idx", argTypes, term257491, args);
    }

};


