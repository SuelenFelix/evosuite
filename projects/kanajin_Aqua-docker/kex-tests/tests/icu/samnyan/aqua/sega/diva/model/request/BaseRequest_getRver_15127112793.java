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

public class BaseRequest_getRver_15127112793 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term249662;

    public BaseRequest_getRver_15127112793() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term249662 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.BaseRequest"));
        Object term249747 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term249748 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term249749 = newInstance(Class.forName("java.time.LocalDate"));
        Object term249753 = newInstance(Class.forName("java.time.LocalTime"));
        Object term249758 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term249768 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term249785 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term249786 = (long[]) newLongArray(1);
        Object[] term249788 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term249789 = (long[]) newLongArray(39);
        Object[] term249829 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term249830 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term249831 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term249832 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term249662, term249662.getClass(), "cmd", "ChlXqeeQJI");
        setField(term249662, term249662.getClass(), "req_id", "RAiPMSzjOv");
        setField(term249662, term249662.getClass(), "game_id", "HVRnXyYuKh");
        setField(term249662, term249662.getClass(), "r_ver", "SKvGKyhOVM");
        setField(term249662, term249662.getClass(), "kc_serial", "rfjheENdEG");
        setField(term249662, term249662.getClass(), "b_serial", "DqnOOFfIgX");
        setField(term249662, term249662.getClass(), "place_id", "ENRTZxfyCj");
        setIntField(term249749, term249749.getClass(), "year", 2025);
        setShortField(term249749, term249749.getClass(), "month", (short) 7);
        setShortField(term249749, term249749.getClass(), "day", (short) 4);
        setField(term249748, term249748.getClass(), "date", term249749);
        setByteField(term249753, term249753.getClass(), "hour", (byte) 18);
        setByteField(term249753, term249753.getClass(), "minute", (byte) 13);
        setByteField(term249753, term249753.getClass(), "second", (byte) 37);
        setIntField(term249753, term249753.getClass(), "nano", 681447348);
        setField(term249748, term249748.getClass(), "time", term249753);
        setField(term249747, term249747.getClass(), "dateTime", term249748);
        setIntField(term249758, term249758.getClass(), "totalSeconds", -10800);
        setField(term249758, term249758.getClass(), "id", "-03:00");
        setField(term249747, term249747.getClass(), "offset", term249758);
        setField(term249768, term249768.getClass(), "id", "America/Recife");
        setLongElement(term249786, 0, -1767217224L);
        setField(term249785, term249785.getClass(), "standardTransitions", term249786);
        setElement(term249788, 1, term249758);
        setField(term249785, term249785.getClass(), "standardOffsets", term249788);
        setLongElement(term249789, 0, -1767217224L);
        setLongElement(term249789, 1, -1206957600L);
        setLongElement(term249789, 2, -1191362400L);
        setLongElement(term249789, 3, -1175374800L);
        setLongElement(term249789, 4, -1159826400L);
        setLongElement(term249789, 5, -633819600L);
        setLongElement(term249789, 6, -622069200L);
        setLongElement(term249789, 7, -602283600L);
        setLongElement(term249789, 8, -591832800L);
        setLongElement(term249789, 9, -570747600L);
        setLongElement(term249789, 10, -560210400L);
        setLongElement(term249789, 11, -539125200L);
        setLongElement(term249789, 12, -531352800L);
        setLongElement(term249789, 13, -191365200L);
        setLongElement(term249789, 14, -184197600L);
        setLongElement(term249789, 15, -155163600L);
        setLongElement(term249789, 16, -150069600L);
        setLongElement(term249789, 17, -128898000L);
        setLongElement(term249789, 18, -121125600L);
        setLongElement(term249789, 19, -99954000L);
        setLongElement(term249789, 20, -89589600L);
        setLongElement(term249789, 21, -68418000L);
        setLongElement(term249789, 22, -57967200L);
        setLongElement(term249789, 23, 499748400L);
        setLongElement(term249789, 24, 511236000L);
        setLongElement(term249789, 25, 530593200L);
        setLongElement(term249789, 26, 540266400L);
        setLongElement(term249789, 27, 562129200L);
        setLongElement(term249789, 28, 571197600L);
        setLongElement(term249789, 29, 592974000L);
        setLongElement(term249789, 30, 602042400L);
        setLongElement(term249789, 31, 624423600L);
        setLongElement(term249789, 32, 634701600L);
        setLongElement(term249789, 33, 938919600L);
        setLongElement(term249789, 34, 951616800L);
        setLongElement(term249789, 35, 970974000L);
        setLongElement(term249789, 36, 971575200L);
        setLongElement(term249789, 37, 1003028400L);
        setLongElement(term249789, 38, 1013911200L);
        setField(term249785, term249785.getClass(), "savingsInstantTransitions", term249789);
        setField(term249785, term249785.getClass(), "savingsLocalTransitions", term249829);
        setElement(term249830, 1, term249758);
        setElement(term249830, 3, term249758);
        setElement(term249830, 5, term249758);
        setElement(term249830, 7, term249758);
        setElement(term249830, 9, term249758);
        setElement(term249830, 11, term249758);
        setElement(term249830, 13, term249758);
        setElement(term249830, 15, term249758);
        setElement(term249830, 17, term249758);
        setElement(term249830, 19, term249758);
        setElement(term249830, 21, term249758);
        setElement(term249830, 23, term249758);
        setElement(term249830, 25, term249758);
        setElement(term249830, 27, term249758);
        setElement(term249830, 29, term249758);
        setElement(term249830, 31, term249758);
        setElement(term249830, 33, term249758);
        setElement(term249830, 35, term249758);
        setElement(term249830, 37, term249758);
        setElement(term249830, 39, term249758);
        setField(term249785, term249785.getClass(), "wallOffsets", term249830);
        setField(term249785, term249785.getClass(), "lastRules", term249831);
        setField(term249832, term249832.getClass(), "table", null);
        setField(term249832, term249832.getClass(), "nextTable", null);
        setLongField(term249832, term249832.getClass(), "baseCount", 0L);
        setIntField(term249832, term249832.getClass(), "sizeCtl", 0);
        setIntField(term249832, term249832.getClass(), "transferIndex", 0);
        setIntField(term249832, term249832.getClass(), "cellsBusy", 0);
        setField(term249832, term249832.getClass(), "counterCells", null);
        setField(term249832, term249832.getClass(), "keySet", null);
        setField(term249832, term249832.getClass(), "values", null);
        setField(term249832, term249832.getClass(), "entrySet", null);
        setField(term249832, term249832.getClass(), "keySet", null);
        setField(term249832, term249832.getClass(), "values", null);
        setField(term249785, term249785.getClass(), "lastRulesCache", term249832);
        setField(term249768, term249768.getClass(), "rules", term249785);
        setField(term249747, term249747.getClass(), "zone", term249768);
        setField(term249662, term249662.getClass(), "time_stamp", term249747);
        setField(term249662, term249662.getClass(), "start_up_mode", "CRCgbTFQSa");
        setField(term249662, term249662.getClass(), "cmm_dly_mod", "HpODnMoCGi");
        setField(term249662, term249662.getClass(), "cmm_dly_sec", "QoZOWwrkVW");
        setField(term249662, term249662.getClass(), "cmm_err_mod", "eGOXSsYDTH");
        setField(term249662, term249662.getClass(), "country_code", "LIheLKvBPl");
        setField(term249662, term249662.getClass(), "region_code", "skbwTMoBkR");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.BaseRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getR_ver", argTypes, term249662, args);
    }

};


