package icu.samnyan.aqua.sega.diva.model.request.boot;

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
import static icu.samnyan.aqua.sega.diva.model.request.boot.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class AttendRequest_getAtndprm3_3883489713 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1576;

    public AttendRequest_getAtndprm3_3883489713() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1576 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.boot.AttendRequest"));
        Object term1709 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term1710 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1711 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1715 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1720 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term1730 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term1747 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term1748 = (long[]) newLongArray(1);
        Object[] term1750 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term1751 = (long[]) newLongArray(39);
        Object[] term1791 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term1792 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term1793 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term1794 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term1576, term1576.getClass(), "atnd_lut", "UiUYnPrcCi");
        setField(term1576, term1576.getClass(), "atnd_prm1", "UoYtihxVaS");
        setField(term1576, term1576.getClass(), "atnd_prm2", "JDswTTCZHV");
        setField(term1576, term1576.getClass(), "atnd_prm3", "onpbIeEKoi");
        setField(term1576, term1576.getClass(), "cmd", "YRHGsAkhxb");
        setField(term1576, term1576.getClass(), "req_id", "ffYhPOzlUs");
        setField(term1576, term1576.getClass(), "game_id", "MLqYREekMl");
        setField(term1576, term1576.getClass(), "r_ver", "ytSBIKXogI");
        setField(term1576, term1576.getClass(), "kc_serial", "nHXjMycHlU");
        setField(term1576, term1576.getClass(), "b_serial", "ieCtQFdkii");
        setField(term1576, term1576.getClass(), "place_id", "dEnhdmILtU");
        setIntField(term1711, term1711.getClass(), "year", 2015);
        setShortField(term1711, term1711.getClass(), "month", (short) 4);
        setShortField(term1711, term1711.getClass(), "day", (short) 14);
        setField(term1710, term1710.getClass(), "date", term1711);
        setByteField(term1715, term1715.getClass(), "hour", (byte) 18);
        setByteField(term1715, term1715.getClass(), "minute", (byte) 24);
        setByteField(term1715, term1715.getClass(), "second", (byte) 32);
        setIntField(term1715, term1715.getClass(), "nano", 369233818);
        setField(term1710, term1710.getClass(), "time", term1715);
        setField(term1709, term1709.getClass(), "dateTime", term1710);
        setIntField(term1720, term1720.getClass(), "totalSeconds", -10800);
        setField(term1720, term1720.getClass(), "id", "-03:00");
        setField(term1709, term1709.getClass(), "offset", term1720);
        setField(term1730, term1730.getClass(), "id", "America/Recife");
        setLongElement(term1748, 0, -1767217224L);
        setField(term1747, term1747.getClass(), "standardTransitions", term1748);
        setElement(term1750, 1, term1720);
        setField(term1747, term1747.getClass(), "standardOffsets", term1750);
        setLongElement(term1751, 0, -1767217224L);
        setLongElement(term1751, 1, -1206957600L);
        setLongElement(term1751, 2, -1191362400L);
        setLongElement(term1751, 3, -1175374800L);
        setLongElement(term1751, 4, -1159826400L);
        setLongElement(term1751, 5, -633819600L);
        setLongElement(term1751, 6, -622069200L);
        setLongElement(term1751, 7, -602283600L);
        setLongElement(term1751, 8, -591832800L);
        setLongElement(term1751, 9, -570747600L);
        setLongElement(term1751, 10, -560210400L);
        setLongElement(term1751, 11, -539125200L);
        setLongElement(term1751, 12, -531352800L);
        setLongElement(term1751, 13, -191365200L);
        setLongElement(term1751, 14, -184197600L);
        setLongElement(term1751, 15, -155163600L);
        setLongElement(term1751, 16, -150069600L);
        setLongElement(term1751, 17, -128898000L);
        setLongElement(term1751, 18, -121125600L);
        setLongElement(term1751, 19, -99954000L);
        setLongElement(term1751, 20, -89589600L);
        setLongElement(term1751, 21, -68418000L);
        setLongElement(term1751, 22, -57967200L);
        setLongElement(term1751, 23, 499748400L);
        setLongElement(term1751, 24, 511236000L);
        setLongElement(term1751, 25, 530593200L);
        setLongElement(term1751, 26, 540266400L);
        setLongElement(term1751, 27, 562129200L);
        setLongElement(term1751, 28, 571197600L);
        setLongElement(term1751, 29, 592974000L);
        setLongElement(term1751, 30, 602042400L);
        setLongElement(term1751, 31, 624423600L);
        setLongElement(term1751, 32, 634701600L);
        setLongElement(term1751, 33, 938919600L);
        setLongElement(term1751, 34, 951616800L);
        setLongElement(term1751, 35, 970974000L);
        setLongElement(term1751, 36, 971575200L);
        setLongElement(term1751, 37, 1003028400L);
        setLongElement(term1751, 38, 1013911200L);
        setField(term1747, term1747.getClass(), "savingsInstantTransitions", term1751);
        setField(term1747, term1747.getClass(), "savingsLocalTransitions", term1791);
        setElement(term1792, 1, term1720);
        setElement(term1792, 3, term1720);
        setElement(term1792, 5, term1720);
        setElement(term1792, 7, term1720);
        setElement(term1792, 9, term1720);
        setElement(term1792, 11, term1720);
        setElement(term1792, 13, term1720);
        setElement(term1792, 15, term1720);
        setElement(term1792, 17, term1720);
        setElement(term1792, 19, term1720);
        setElement(term1792, 21, term1720);
        setElement(term1792, 23, term1720);
        setElement(term1792, 25, term1720);
        setElement(term1792, 27, term1720);
        setElement(term1792, 29, term1720);
        setElement(term1792, 31, term1720);
        setElement(term1792, 33, term1720);
        setElement(term1792, 35, term1720);
        setElement(term1792, 37, term1720);
        setElement(term1792, 39, term1720);
        setField(term1747, term1747.getClass(), "wallOffsets", term1792);
        setField(term1747, term1747.getClass(), "lastRules", term1793);
        setField(term1794, term1794.getClass(), "table", null);
        setField(term1794, term1794.getClass(), "nextTable", null);
        setLongField(term1794, term1794.getClass(), "baseCount", 0L);
        setIntField(term1794, term1794.getClass(), "sizeCtl", 0);
        setIntField(term1794, term1794.getClass(), "transferIndex", 0);
        setIntField(term1794, term1794.getClass(), "cellsBusy", 0);
        setField(term1794, term1794.getClass(), "counterCells", null);
        setField(term1794, term1794.getClass(), "keySet", null);
        setField(term1794, term1794.getClass(), "values", null);
        setField(term1794, term1794.getClass(), "entrySet", null);
        setField(term1794, term1794.getClass(), "keySet", null);
        setField(term1794, term1794.getClass(), "values", null);
        setField(term1747, term1747.getClass(), "lastRulesCache", term1794);
        setField(term1730, term1730.getClass(), "rules", term1747);
        setField(term1709, term1709.getClass(), "zone", term1730);
        setField(term1576, term1576.getClass(), "time_stamp", term1709);
        setField(term1576, term1576.getClass(), "start_up_mode", "hoicvmsovO");
        setField(term1576, term1576.getClass(), "cmm_dly_mod", "eqJfYWRaEL");
        setField(term1576, term1576.getClass(), "cmm_dly_sec", "fhkbdRViHi");
        setField(term1576, term1576.getClass(), "cmm_err_mod", "uWHnvSvaPl");
        setField(term1576, term1576.getClass(), "country_code", "kBdSllIBVz");
        setField(term1576, term1576.getClass(), "region_code", "TJmVBGfTML");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.boot.AttendRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAtnd_prm3", argTypes, term1576, args);
    }

};


