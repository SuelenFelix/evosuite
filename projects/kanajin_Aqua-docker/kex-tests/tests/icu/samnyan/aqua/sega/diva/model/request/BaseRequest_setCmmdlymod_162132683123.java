package icu.samnyan.aqua.sega.diva.model.request;

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
import static icu.samnyan.aqua.sega.diva.model.request.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class BaseRequest_setCmmdlymod_162132683123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term258589;

    public BaseRequest_setCmmdlymod_162132683123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term258589 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.BaseRequest"));
        Object term258674 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term258675 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term258676 = newInstance(Class.forName("java.time.LocalDate"));
        Object term258680 = newInstance(Class.forName("java.time.LocalTime"));
        Object term258685 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term258695 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term258712 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term258713 = (long[]) newLongArray(1);
        Object[] term258715 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term258716 = (long[]) newLongArray(39);
        Object[] term258756 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term258757 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term258758 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term258759 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term258589, term258589.getClass(), "cmd", "dMuXJftgrw");
        setField(term258589, term258589.getClass(), "req_id", "INNyzaqXFS");
        setField(term258589, term258589.getClass(), "game_id", "GdZWpscDov");
        setField(term258589, term258589.getClass(), "r_ver", "RzzlJFJcij");
        setField(term258589, term258589.getClass(), "kc_serial", "eADknKlQVd");
        setField(term258589, term258589.getClass(), "b_serial", "hfwLnDHizJ");
        setField(term258589, term258589.getClass(), "place_id", "eZGPUdohTF");
        setIntField(term258676, term258676.getClass(), "year", 2029);
        setShortField(term258676, term258676.getClass(), "month", (short) 1);
        setShortField(term258676, term258676.getClass(), "day", (short) 21);
        setField(term258675, term258675.getClass(), "date", term258676);
        setByteField(term258680, term258680.getClass(), "hour", (byte) 9);
        setByteField(term258680, term258680.getClass(), "minute", (byte) 46);
        setByteField(term258680, term258680.getClass(), "second", (byte) 1);
        setIntField(term258680, term258680.getClass(), "nano", 276350652);
        setField(term258675, term258675.getClass(), "time", term258680);
        setField(term258674, term258674.getClass(), "dateTime", term258675);
        setIntField(term258685, term258685.getClass(), "totalSeconds", -10800);
        setField(term258685, term258685.getClass(), "id", "-03:00");
        setField(term258674, term258674.getClass(), "offset", term258685);
        setField(term258695, term258695.getClass(), "id", "America/Recife");
        setLongElement(term258713, 0, -1767217224L);
        setField(term258712, term258712.getClass(), "standardTransitions", term258713);
        setElement(term258715, 1, term258685);
        setField(term258712, term258712.getClass(), "standardOffsets", term258715);
        setLongElement(term258716, 0, -1767217224L);
        setLongElement(term258716, 1, -1206957600L);
        setLongElement(term258716, 2, -1191362400L);
        setLongElement(term258716, 3, -1175374800L);
        setLongElement(term258716, 4, -1159826400L);
        setLongElement(term258716, 5, -633819600L);
        setLongElement(term258716, 6, -622069200L);
        setLongElement(term258716, 7, -602283600L);
        setLongElement(term258716, 8, -591832800L);
        setLongElement(term258716, 9, -570747600L);
        setLongElement(term258716, 10, -560210400L);
        setLongElement(term258716, 11, -539125200L);
        setLongElement(term258716, 12, -531352800L);
        setLongElement(term258716, 13, -191365200L);
        setLongElement(term258716, 14, -184197600L);
        setLongElement(term258716, 15, -155163600L);
        setLongElement(term258716, 16, -150069600L);
        setLongElement(term258716, 17, -128898000L);
        setLongElement(term258716, 18, -121125600L);
        setLongElement(term258716, 19, -99954000L);
        setLongElement(term258716, 20, -89589600L);
        setLongElement(term258716, 21, -68418000L);
        setLongElement(term258716, 22, -57967200L);
        setLongElement(term258716, 23, 499748400L);
        setLongElement(term258716, 24, 511236000L);
        setLongElement(term258716, 25, 530593200L);
        setLongElement(term258716, 26, 540266400L);
        setLongElement(term258716, 27, 562129200L);
        setLongElement(term258716, 28, 571197600L);
        setLongElement(term258716, 29, 592974000L);
        setLongElement(term258716, 30, 602042400L);
        setLongElement(term258716, 31, 624423600L);
        setLongElement(term258716, 32, 634701600L);
        setLongElement(term258716, 33, 938919600L);
        setLongElement(term258716, 34, 951616800L);
        setLongElement(term258716, 35, 970974000L);
        setLongElement(term258716, 36, 971575200L);
        setLongElement(term258716, 37, 1003028400L);
        setLongElement(term258716, 38, 1013911200L);
        setField(term258712, term258712.getClass(), "savingsInstantTransitions", term258716);
        setField(term258712, term258712.getClass(), "savingsLocalTransitions", term258756);
        setElement(term258757, 1, term258685);
        setElement(term258757, 3, term258685);
        setElement(term258757, 5, term258685);
        setElement(term258757, 7, term258685);
        setElement(term258757, 9, term258685);
        setElement(term258757, 11, term258685);
        setElement(term258757, 13, term258685);
        setElement(term258757, 15, term258685);
        setElement(term258757, 17, term258685);
        setElement(term258757, 19, term258685);
        setElement(term258757, 21, term258685);
        setElement(term258757, 23, term258685);
        setElement(term258757, 25, term258685);
        setElement(term258757, 27, term258685);
        setElement(term258757, 29, term258685);
        setElement(term258757, 31, term258685);
        setElement(term258757, 33, term258685);
        setElement(term258757, 35, term258685);
        setElement(term258757, 37, term258685);
        setElement(term258757, 39, term258685);
        setField(term258712, term258712.getClass(), "wallOffsets", term258757);
        setField(term258712, term258712.getClass(), "lastRules", term258758);
        setField(term258759, term258759.getClass(), "table", null);
        setField(term258759, term258759.getClass(), "nextTable", null);
        setLongField(term258759, term258759.getClass(), "baseCount", 0L);
        setIntField(term258759, term258759.getClass(), "sizeCtl", 0);
        setIntField(term258759, term258759.getClass(), "transferIndex", 0);
        setIntField(term258759, term258759.getClass(), "cellsBusy", 0);
        setField(term258759, term258759.getClass(), "counterCells", null);
        setField(term258759, term258759.getClass(), "keySet", null);
        setField(term258759, term258759.getClass(), "values", null);
        setField(term258759, term258759.getClass(), "entrySet", null);
        setField(term258759, term258759.getClass(), "keySet", null);
        setField(term258759, term258759.getClass(), "values", null);
        setField(term258712, term258712.getClass(), "lastRulesCache", term258759);
        setField(term258695, term258695.getClass(), "rules", term258712);
        setField(term258674, term258674.getClass(), "zone", term258695);
        setField(term258589, term258589.getClass(), "time_stamp", term258674);
        setField(term258589, term258589.getClass(), "start_up_mode", "NyINyLwoLC");
        setField(term258589, term258589.getClass(), "cmm_dly_mod", "VdHJiosxsv");
        setField(term258589, term258589.getClass(), "cmm_dly_sec", "wOuPdBQeOx");
        setField(term258589, term258589.getClass(), "cmm_err_mod", "qKKlbLWTDU");
        setField(term258589, term258589.getClass(), "country_code", "vtiTWIgEVa");
        setField(term258589, term258589.getClass(), "region_code", "eLERRBMHza");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.BaseRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "nNDwdMSbzC";
        callMethod(klass, "setCmm_dly_mod", argTypes, term258589, args);
    }

};


