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

public class ChangePasswdRequest_getPdid_16851370923 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1519;

    public ChangePasswdRequest_getPdid_16851370923() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1519 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.ChangePasswdRequest"));
        Object term1643 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term1644 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1645 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1649 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1654 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term1664 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term1681 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term1682 = (long[]) newLongArray(1);
        Object[] term1684 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term1685 = (long[]) newLongArray(39);
        Object[] term1725 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term1726 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term1727 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term1728 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term1519, term1519.getClass(), "a_code", "xLbjWUgOIL");
        setIntField(term1519, term1519.getClass(), "aime_id", -1339778481);
        setField(term1519, term1519.getClass(), "aime_a_code", "jDtqGUpnZN");
        setIntField(term1519, term1519.getClass(), "pd_id", 1725571209);
        setIntField(term1519, term1519.getClass(), "accept_idx", -522618178);
        setField(term1519, term1519.getClass(), "new_passwd", "nGKItKLYNC");
        setField(term1519, term1519.getClass(), "cmd", "UiUYnPrcCi");
        setField(term1519, term1519.getClass(), "req_id", "UoYtihxVaS");
        setField(term1519, term1519.getClass(), "game_id", "JDswTTCZHV");
        setField(term1519, term1519.getClass(), "r_ver", "onpbIeEKoi");
        setField(term1519, term1519.getClass(), "kc_serial", "YRHGsAkhxb");
        setField(term1519, term1519.getClass(), "b_serial", "ffYhPOzlUs");
        setField(term1519, term1519.getClass(), "place_id", "MLqYREekMl");
        setIntField(term1645, term1645.getClass(), "year", 2015);
        setShortField(term1645, term1645.getClass(), "month", (short) 4);
        setShortField(term1645, term1645.getClass(), "day", (short) 14);
        setField(term1644, term1644.getClass(), "date", term1645);
        setByteField(term1649, term1649.getClass(), "hour", (byte) 18);
        setByteField(term1649, term1649.getClass(), "minute", (byte) 24);
        setByteField(term1649, term1649.getClass(), "second", (byte) 32);
        setIntField(term1649, term1649.getClass(), "nano", 369233818);
        setField(term1644, term1644.getClass(), "time", term1649);
        setField(term1643, term1643.getClass(), "dateTime", term1644);
        setIntField(term1654, term1654.getClass(), "totalSeconds", -10800);
        setField(term1654, term1654.getClass(), "id", "-03:00");
        setField(term1643, term1643.getClass(), "offset", term1654);
        setField(term1664, term1664.getClass(), "id", "America/Recife");
        setLongElement(term1682, 0, -1767217224L);
        setField(term1681, term1681.getClass(), "standardTransitions", term1682);
        setElement(term1684, 1, term1654);
        setField(term1681, term1681.getClass(), "standardOffsets", term1684);
        setLongElement(term1685, 0, -1767217224L);
        setLongElement(term1685, 1, -1206957600L);
        setLongElement(term1685, 2, -1191362400L);
        setLongElement(term1685, 3, -1175374800L);
        setLongElement(term1685, 4, -1159826400L);
        setLongElement(term1685, 5, -633819600L);
        setLongElement(term1685, 6, -622069200L);
        setLongElement(term1685, 7, -602283600L);
        setLongElement(term1685, 8, -591832800L);
        setLongElement(term1685, 9, -570747600L);
        setLongElement(term1685, 10, -560210400L);
        setLongElement(term1685, 11, -539125200L);
        setLongElement(term1685, 12, -531352800L);
        setLongElement(term1685, 13, -191365200L);
        setLongElement(term1685, 14, -184197600L);
        setLongElement(term1685, 15, -155163600L);
        setLongElement(term1685, 16, -150069600L);
        setLongElement(term1685, 17, -128898000L);
        setLongElement(term1685, 18, -121125600L);
        setLongElement(term1685, 19, -99954000L);
        setLongElement(term1685, 20, -89589600L);
        setLongElement(term1685, 21, -68418000L);
        setLongElement(term1685, 22, -57967200L);
        setLongElement(term1685, 23, 499748400L);
        setLongElement(term1685, 24, 511236000L);
        setLongElement(term1685, 25, 530593200L);
        setLongElement(term1685, 26, 540266400L);
        setLongElement(term1685, 27, 562129200L);
        setLongElement(term1685, 28, 571197600L);
        setLongElement(term1685, 29, 592974000L);
        setLongElement(term1685, 30, 602042400L);
        setLongElement(term1685, 31, 624423600L);
        setLongElement(term1685, 32, 634701600L);
        setLongElement(term1685, 33, 938919600L);
        setLongElement(term1685, 34, 951616800L);
        setLongElement(term1685, 35, 970974000L);
        setLongElement(term1685, 36, 971575200L);
        setLongElement(term1685, 37, 1003028400L);
        setLongElement(term1685, 38, 1013911200L);
        setField(term1681, term1681.getClass(), "savingsInstantTransitions", term1685);
        setField(term1681, term1681.getClass(), "savingsLocalTransitions", term1725);
        setElement(term1726, 1, term1654);
        setElement(term1726, 3, term1654);
        setElement(term1726, 5, term1654);
        setElement(term1726, 7, term1654);
        setElement(term1726, 9, term1654);
        setElement(term1726, 11, term1654);
        setElement(term1726, 13, term1654);
        setElement(term1726, 15, term1654);
        setElement(term1726, 17, term1654);
        setElement(term1726, 19, term1654);
        setElement(term1726, 21, term1654);
        setElement(term1726, 23, term1654);
        setElement(term1726, 25, term1654);
        setElement(term1726, 27, term1654);
        setElement(term1726, 29, term1654);
        setElement(term1726, 31, term1654);
        setElement(term1726, 33, term1654);
        setElement(term1726, 35, term1654);
        setElement(term1726, 37, term1654);
        setElement(term1726, 39, term1654);
        setField(term1681, term1681.getClass(), "wallOffsets", term1726);
        setField(term1681, term1681.getClass(), "lastRules", term1727);
        setField(term1728, term1728.getClass(), "table", null);
        setField(term1728, term1728.getClass(), "nextTable", null);
        setLongField(term1728, term1728.getClass(), "baseCount", 0L);
        setIntField(term1728, term1728.getClass(), "sizeCtl", 0);
        setIntField(term1728, term1728.getClass(), "transferIndex", 0);
        setIntField(term1728, term1728.getClass(), "cellsBusy", 0);
        setField(term1728, term1728.getClass(), "counterCells", null);
        setField(term1728, term1728.getClass(), "keySet", null);
        setField(term1728, term1728.getClass(), "values", null);
        setField(term1728, term1728.getClass(), "entrySet", null);
        setField(term1728, term1728.getClass(), "keySet", null);
        setField(term1728, term1728.getClass(), "values", null);
        setField(term1681, term1681.getClass(), "lastRulesCache", term1728);
        setField(term1664, term1664.getClass(), "rules", term1681);
        setField(term1643, term1643.getClass(), "zone", term1664);
        setField(term1519, term1519.getClass(), "time_stamp", term1643);
        setField(term1519, term1519.getClass(), "start_up_mode", "ytSBIKXogI");
        setField(term1519, term1519.getClass(), "cmm_dly_mod", "nHXjMycHlU");
        setField(term1519, term1519.getClass(), "cmm_dly_sec", "ieCtQFdkii");
        setField(term1519, term1519.getClass(), "cmm_err_mod", "dEnhdmILtU");
        setField(term1519, term1519.getClass(), "country_code", "hoicvmsovO");
        setField(term1519, term1519.getClass(), "region_code", "eqJfYWRaEL");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.ChangePasswdRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPd_id", argTypes, term1519, args);
    }

};


