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

public class ChangePasswdRequest_getNewpasswd_5245494845 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2531;

    public ChangePasswdRequest_getNewpasswd_5245494845() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2531 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.ChangePasswdRequest"));
        Object term2655 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term2656 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2657 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2661 = newInstance(Class.forName("java.time.LocalTime"));
        Object term2666 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term2676 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term2693 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term2694 = (long[]) newLongArray(1);
        Object[] term2696 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term2697 = (long[]) newLongArray(39);
        Object[] term2737 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term2738 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term2739 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term2740 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term2531, term2531.getClass(), "a_code", "idgaQsnJpQ");
        setIntField(term2531, term2531.getClass(), "aime_id", 597278769);
        setField(term2531, term2531.getClass(), "aime_a_code", "VgZnGoIFwQ");
        setIntField(term2531, term2531.getClass(), "pd_id", -1685132342);
        setIntField(term2531, term2531.getClass(), "accept_idx", -1456670397);
        setField(term2531, term2531.getClass(), "new_passwd", "jUbSRrkrYZ");
        setField(term2531, term2531.getClass(), "cmd", "bWWfajKbEX");
        setField(term2531, term2531.getClass(), "req_id", "cAPeiZHKGJ");
        setField(term2531, term2531.getClass(), "game_id", "LvJFtLBaxj");
        setField(term2531, term2531.getClass(), "r_ver", "PHvxnGHptP");
        setField(term2531, term2531.getClass(), "kc_serial", "TimdotUuNC");
        setField(term2531, term2531.getClass(), "b_serial", "PkWMRdJcBb");
        setField(term2531, term2531.getClass(), "place_id", "jSpAteRute");
        setIntField(term2657, term2657.getClass(), "year", 2026);
        setShortField(term2657, term2657.getClass(), "month", (short) 12);
        setShortField(term2657, term2657.getClass(), "day", (short) 14);
        setField(term2656, term2656.getClass(), "date", term2657);
        setByteField(term2661, term2661.getClass(), "hour", (byte) 16);
        setByteField(term2661, term2661.getClass(), "minute", (byte) 34);
        setByteField(term2661, term2661.getClass(), "second", (byte) 9);
        setIntField(term2661, term2661.getClass(), "nano", 518326996);
        setField(term2656, term2656.getClass(), "time", term2661);
        setField(term2655, term2655.getClass(), "dateTime", term2656);
        setIntField(term2666, term2666.getClass(), "totalSeconds", -10800);
        setField(term2666, term2666.getClass(), "id", "-03:00");
        setField(term2655, term2655.getClass(), "offset", term2666);
        setField(term2676, term2676.getClass(), "id", "America/Recife");
        setLongElement(term2694, 0, -1767217224L);
        setField(term2693, term2693.getClass(), "standardTransitions", term2694);
        setElement(term2696, 1, term2666);
        setField(term2693, term2693.getClass(), "standardOffsets", term2696);
        setLongElement(term2697, 0, -1767217224L);
        setLongElement(term2697, 1, -1206957600L);
        setLongElement(term2697, 2, -1191362400L);
        setLongElement(term2697, 3, -1175374800L);
        setLongElement(term2697, 4, -1159826400L);
        setLongElement(term2697, 5, -633819600L);
        setLongElement(term2697, 6, -622069200L);
        setLongElement(term2697, 7, -602283600L);
        setLongElement(term2697, 8, -591832800L);
        setLongElement(term2697, 9, -570747600L);
        setLongElement(term2697, 10, -560210400L);
        setLongElement(term2697, 11, -539125200L);
        setLongElement(term2697, 12, -531352800L);
        setLongElement(term2697, 13, -191365200L);
        setLongElement(term2697, 14, -184197600L);
        setLongElement(term2697, 15, -155163600L);
        setLongElement(term2697, 16, -150069600L);
        setLongElement(term2697, 17, -128898000L);
        setLongElement(term2697, 18, -121125600L);
        setLongElement(term2697, 19, -99954000L);
        setLongElement(term2697, 20, -89589600L);
        setLongElement(term2697, 21, -68418000L);
        setLongElement(term2697, 22, -57967200L);
        setLongElement(term2697, 23, 499748400L);
        setLongElement(term2697, 24, 511236000L);
        setLongElement(term2697, 25, 530593200L);
        setLongElement(term2697, 26, 540266400L);
        setLongElement(term2697, 27, 562129200L);
        setLongElement(term2697, 28, 571197600L);
        setLongElement(term2697, 29, 592974000L);
        setLongElement(term2697, 30, 602042400L);
        setLongElement(term2697, 31, 624423600L);
        setLongElement(term2697, 32, 634701600L);
        setLongElement(term2697, 33, 938919600L);
        setLongElement(term2697, 34, 951616800L);
        setLongElement(term2697, 35, 970974000L);
        setLongElement(term2697, 36, 971575200L);
        setLongElement(term2697, 37, 1003028400L);
        setLongElement(term2697, 38, 1013911200L);
        setField(term2693, term2693.getClass(), "savingsInstantTransitions", term2697);
        setField(term2693, term2693.getClass(), "savingsLocalTransitions", term2737);
        setElement(term2738, 1, term2666);
        setElement(term2738, 3, term2666);
        setElement(term2738, 5, term2666);
        setElement(term2738, 7, term2666);
        setElement(term2738, 9, term2666);
        setElement(term2738, 11, term2666);
        setElement(term2738, 13, term2666);
        setElement(term2738, 15, term2666);
        setElement(term2738, 17, term2666);
        setElement(term2738, 19, term2666);
        setElement(term2738, 21, term2666);
        setElement(term2738, 23, term2666);
        setElement(term2738, 25, term2666);
        setElement(term2738, 27, term2666);
        setElement(term2738, 29, term2666);
        setElement(term2738, 31, term2666);
        setElement(term2738, 33, term2666);
        setElement(term2738, 35, term2666);
        setElement(term2738, 37, term2666);
        setElement(term2738, 39, term2666);
        setField(term2693, term2693.getClass(), "wallOffsets", term2738);
        setField(term2693, term2693.getClass(), "lastRules", term2739);
        setField(term2740, term2740.getClass(), "table", null);
        setField(term2740, term2740.getClass(), "nextTable", null);
        setLongField(term2740, term2740.getClass(), "baseCount", 0L);
        setIntField(term2740, term2740.getClass(), "sizeCtl", 0);
        setIntField(term2740, term2740.getClass(), "transferIndex", 0);
        setIntField(term2740, term2740.getClass(), "cellsBusy", 0);
        setField(term2740, term2740.getClass(), "counterCells", null);
        setField(term2740, term2740.getClass(), "keySet", null);
        setField(term2740, term2740.getClass(), "values", null);
        setField(term2740, term2740.getClass(), "entrySet", null);
        setField(term2740, term2740.getClass(), "keySet", null);
        setField(term2740, term2740.getClass(), "values", null);
        setField(term2693, term2693.getClass(), "lastRulesCache", term2740);
        setField(term2676, term2676.getClass(), "rules", term2693);
        setField(term2655, term2655.getClass(), "zone", term2676);
        setField(term2531, term2531.getClass(), "time_stamp", term2655);
        setField(term2531, term2531.getClass(), "start_up_mode", "swZVeJAxjt");
        setField(term2531, term2531.getClass(), "cmm_dly_mod", "xOcJIiQQDu");
        setField(term2531, term2531.getClass(), "cmm_dly_sec", "GVizqqzXpy");
        setField(term2531, term2531.getClass(), "cmm_err_mod", "JqXGgAhZPl");
        setField(term2531, term2531.getClass(), "country_code", "jiKYgYHqIS");
        setField(term2531, term2531.getClass(), "region_code", "DfISiziTgG");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.ChangePasswdRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNew_passwd", argTypes, term2531, args);
    }

};


