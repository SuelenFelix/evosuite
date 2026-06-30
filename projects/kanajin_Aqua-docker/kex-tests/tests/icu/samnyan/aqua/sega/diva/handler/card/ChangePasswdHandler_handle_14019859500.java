package icu.samnyan.aqua.sega.diva.handler.card;

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
import static icu.samnyan.aqua.sega.diva.handler.card.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ChangePasswdHandler_handle_14019859500 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1631;

    public ChangePasswdHandler_handle_14019859500() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1631 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.ChangePasswdRequest"));
        Object term1755 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term1756 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1757 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1761 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1766 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term1776 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term1793 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term1794 = (long[]) newLongArray(1);
        Object[] term1796 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term1797 = (long[]) newLongArray(39);
        Object[] term1837 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term1838 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term1839 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term1840 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term1631, term1631.getClass(), "a_code", "JDswTTCZHV");
        setIntField(term1631, term1631.getClass(), "aime_id", -2038273078);
        setField(term1631, term1631.getClass(), "aime_a_code", "onpbIeEKoi");
        setIntField(term1631, term1631.getClass(), "pd_id", 1227103734);
        setIntField(term1631, term1631.getClass(), "accept_idx", -1339778481);
        setField(term1631, term1631.getClass(), "new_passwd", "YRHGsAkhxb");
        setField(term1631, term1631.getClass(), "cmd", "ffYhPOzlUs");
        setField(term1631, term1631.getClass(), "req_id", "MLqYREekMl");
        setField(term1631, term1631.getClass(), "game_id", "ytSBIKXogI");
        setField(term1631, term1631.getClass(), "r_ver", "nHXjMycHlU");
        setField(term1631, term1631.getClass(), "kc_serial", "ieCtQFdkii");
        setField(term1631, term1631.getClass(), "b_serial", "dEnhdmILtU");
        setField(term1631, term1631.getClass(), "place_id", "hoicvmsovO");
        setIntField(term1757, term1757.getClass(), "year", 2015);
        setShortField(term1757, term1757.getClass(), "month", (short) 4);
        setShortField(term1757, term1757.getClass(), "day", (short) 14);
        setField(term1756, term1756.getClass(), "date", term1757);
        setByteField(term1761, term1761.getClass(), "hour", (byte) 18);
        setByteField(term1761, term1761.getClass(), "minute", (byte) 24);
        setByteField(term1761, term1761.getClass(), "second", (byte) 32);
        setIntField(term1761, term1761.getClass(), "nano", 369233818);
        setField(term1756, term1756.getClass(), "time", term1761);
        setField(term1755, term1755.getClass(), "dateTime", term1756);
        setIntField(term1766, term1766.getClass(), "totalSeconds", -10800);
        setField(term1766, term1766.getClass(), "id", "-03:00");
        setField(term1755, term1755.getClass(), "offset", term1766);
        setField(term1776, term1776.getClass(), "id", "America/Recife");
        setLongElement(term1794, 0, -1767217224L);
        setField(term1793, term1793.getClass(), "standardTransitions", term1794);
        setElement(term1796, 1, term1766);
        setField(term1793, term1793.getClass(), "standardOffsets", term1796);
        setLongElement(term1797, 0, -1767217224L);
        setLongElement(term1797, 1, -1206957600L);
        setLongElement(term1797, 2, -1191362400L);
        setLongElement(term1797, 3, -1175374800L);
        setLongElement(term1797, 4, -1159826400L);
        setLongElement(term1797, 5, -633819600L);
        setLongElement(term1797, 6, -622069200L);
        setLongElement(term1797, 7, -602283600L);
        setLongElement(term1797, 8, -591832800L);
        setLongElement(term1797, 9, -570747600L);
        setLongElement(term1797, 10, -560210400L);
        setLongElement(term1797, 11, -539125200L);
        setLongElement(term1797, 12, -531352800L);
        setLongElement(term1797, 13, -191365200L);
        setLongElement(term1797, 14, -184197600L);
        setLongElement(term1797, 15, -155163600L);
        setLongElement(term1797, 16, -150069600L);
        setLongElement(term1797, 17, -128898000L);
        setLongElement(term1797, 18, -121125600L);
        setLongElement(term1797, 19, -99954000L);
        setLongElement(term1797, 20, -89589600L);
        setLongElement(term1797, 21, -68418000L);
        setLongElement(term1797, 22, -57967200L);
        setLongElement(term1797, 23, 499748400L);
        setLongElement(term1797, 24, 511236000L);
        setLongElement(term1797, 25, 530593200L);
        setLongElement(term1797, 26, 540266400L);
        setLongElement(term1797, 27, 562129200L);
        setLongElement(term1797, 28, 571197600L);
        setLongElement(term1797, 29, 592974000L);
        setLongElement(term1797, 30, 602042400L);
        setLongElement(term1797, 31, 624423600L);
        setLongElement(term1797, 32, 634701600L);
        setLongElement(term1797, 33, 938919600L);
        setLongElement(term1797, 34, 951616800L);
        setLongElement(term1797, 35, 970974000L);
        setLongElement(term1797, 36, 971575200L);
        setLongElement(term1797, 37, 1003028400L);
        setLongElement(term1797, 38, 1013911200L);
        setField(term1793, term1793.getClass(), "savingsInstantTransitions", term1797);
        setField(term1793, term1793.getClass(), "savingsLocalTransitions", term1837);
        setElement(term1838, 1, term1766);
        setElement(term1838, 3, term1766);
        setElement(term1838, 5, term1766);
        setElement(term1838, 7, term1766);
        setElement(term1838, 9, term1766);
        setElement(term1838, 11, term1766);
        setElement(term1838, 13, term1766);
        setElement(term1838, 15, term1766);
        setElement(term1838, 17, term1766);
        setElement(term1838, 19, term1766);
        setElement(term1838, 21, term1766);
        setElement(term1838, 23, term1766);
        setElement(term1838, 25, term1766);
        setElement(term1838, 27, term1766);
        setElement(term1838, 29, term1766);
        setElement(term1838, 31, term1766);
        setElement(term1838, 33, term1766);
        setElement(term1838, 35, term1766);
        setElement(term1838, 37, term1766);
        setElement(term1838, 39, term1766);
        setField(term1793, term1793.getClass(), "wallOffsets", term1838);
        setField(term1793, term1793.getClass(), "lastRules", term1839);
        setField(term1840, term1840.getClass(), "table", null);
        setField(term1840, term1840.getClass(), "nextTable", null);
        setLongField(term1840, term1840.getClass(), "baseCount", 0L);
        setIntField(term1840, term1840.getClass(), "sizeCtl", 0);
        setIntField(term1840, term1840.getClass(), "transferIndex", 0);
        setIntField(term1840, term1840.getClass(), "cellsBusy", 0);
        setField(term1840, term1840.getClass(), "counterCells", null);
        setField(term1840, term1840.getClass(), "keySet", null);
        setField(term1840, term1840.getClass(), "values", null);
        setField(term1840, term1840.getClass(), "entrySet", null);
        setField(term1840, term1840.getClass(), "keySet", null);
        setField(term1840, term1840.getClass(), "values", null);
        setField(term1793, term1793.getClass(), "lastRulesCache", term1840);
        setField(term1776, term1776.getClass(), "rules", term1793);
        setField(term1755, term1755.getClass(), "zone", term1776);
        setField(term1631, term1631.getClass(), "time_stamp", term1755);
        setField(term1631, term1631.getClass(), "start_up_mode", "eqJfYWRaEL");
        setField(term1631, term1631.getClass(), "cmm_dly_mod", "fhkbdRViHi");
        setField(term1631, term1631.getClass(), "cmm_dly_sec", "uWHnvSvaPl");
        setField(term1631, term1631.getClass(), "cmm_err_mod", "kBdSllIBVz");
        setField(term1631, term1631.getClass(), "country_code", "TJmVBGfTML");
        setField(term1631, term1631.getClass(), "region_code", "tPlsykYBqO");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.handler.card.ChangePasswdHandler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.ChangePasswdRequest");
        Object[] args = new Object[1];
        args[0] = term1631;
        callMethod(klass, "handle", argTypes, null, args);
    }

};


