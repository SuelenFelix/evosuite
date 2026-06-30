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

public class BaseRequest_setKcserial_74747447618 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term256305;

    public BaseRequest_setKcserial_74747447618() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term256305 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.BaseRequest"));
        Object term256390 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term256391 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term256392 = newInstance(Class.forName("java.time.LocalDate"));
        Object term256396 = newInstance(Class.forName("java.time.LocalTime"));
        Object term256401 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term256411 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term256428 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term256429 = (long[]) newLongArray(1);
        Object[] term256431 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term256432 = (long[]) newLongArray(39);
        Object[] term256472 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term256473 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term256474 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term256475 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term256305, term256305.getClass(), "cmd", "iRfJJNrMLZ");
        setField(term256305, term256305.getClass(), "req_id", "sYrnlJNHsq");
        setField(term256305, term256305.getClass(), "game_id", "POHTKvZAAU");
        setField(term256305, term256305.getClass(), "r_ver", "HSQaALDFNu");
        setField(term256305, term256305.getClass(), "kc_serial", "aOaXBQyJal");
        setField(term256305, term256305.getClass(), "b_serial", "vRbigVGnNS");
        setField(term256305, term256305.getClass(), "place_id", "bVteGrLeFP");
        setIntField(term256392, term256392.getClass(), "year", 2013);
        setShortField(term256392, term256392.getClass(), "month", (short) 9);
        setShortField(term256392, term256392.getClass(), "day", (short) 27);
        setField(term256391, term256391.getClass(), "date", term256392);
        setByteField(term256396, term256396.getClass(), "hour", (byte) 9);
        setByteField(term256396, term256396.getClass(), "minute", (byte) 30);
        setByteField(term256396, term256396.getClass(), "second", (byte) 6);
        setIntField(term256396, term256396.getClass(), "nano", 647438502);
        setField(term256391, term256391.getClass(), "time", term256396);
        setField(term256390, term256390.getClass(), "dateTime", term256391);
        setIntField(term256401, term256401.getClass(), "totalSeconds", -10800);
        setField(term256401, term256401.getClass(), "id", "-03:00");
        setField(term256390, term256390.getClass(), "offset", term256401);
        setField(term256411, term256411.getClass(), "id", "America/Recife");
        setLongElement(term256429, 0, -1767217224L);
        setField(term256428, term256428.getClass(), "standardTransitions", term256429);
        setElement(term256431, 1, term256401);
        setField(term256428, term256428.getClass(), "standardOffsets", term256431);
        setLongElement(term256432, 0, -1767217224L);
        setLongElement(term256432, 1, -1206957600L);
        setLongElement(term256432, 2, -1191362400L);
        setLongElement(term256432, 3, -1175374800L);
        setLongElement(term256432, 4, -1159826400L);
        setLongElement(term256432, 5, -633819600L);
        setLongElement(term256432, 6, -622069200L);
        setLongElement(term256432, 7, -602283600L);
        setLongElement(term256432, 8, -591832800L);
        setLongElement(term256432, 9, -570747600L);
        setLongElement(term256432, 10, -560210400L);
        setLongElement(term256432, 11, -539125200L);
        setLongElement(term256432, 12, -531352800L);
        setLongElement(term256432, 13, -191365200L);
        setLongElement(term256432, 14, -184197600L);
        setLongElement(term256432, 15, -155163600L);
        setLongElement(term256432, 16, -150069600L);
        setLongElement(term256432, 17, -128898000L);
        setLongElement(term256432, 18, -121125600L);
        setLongElement(term256432, 19, -99954000L);
        setLongElement(term256432, 20, -89589600L);
        setLongElement(term256432, 21, -68418000L);
        setLongElement(term256432, 22, -57967200L);
        setLongElement(term256432, 23, 499748400L);
        setLongElement(term256432, 24, 511236000L);
        setLongElement(term256432, 25, 530593200L);
        setLongElement(term256432, 26, 540266400L);
        setLongElement(term256432, 27, 562129200L);
        setLongElement(term256432, 28, 571197600L);
        setLongElement(term256432, 29, 592974000L);
        setLongElement(term256432, 30, 602042400L);
        setLongElement(term256432, 31, 624423600L);
        setLongElement(term256432, 32, 634701600L);
        setLongElement(term256432, 33, 938919600L);
        setLongElement(term256432, 34, 951616800L);
        setLongElement(term256432, 35, 970974000L);
        setLongElement(term256432, 36, 971575200L);
        setLongElement(term256432, 37, 1003028400L);
        setLongElement(term256432, 38, 1013911200L);
        setField(term256428, term256428.getClass(), "savingsInstantTransitions", term256432);
        setField(term256428, term256428.getClass(), "savingsLocalTransitions", term256472);
        setElement(term256473, 1, term256401);
        setElement(term256473, 3, term256401);
        setElement(term256473, 5, term256401);
        setElement(term256473, 7, term256401);
        setElement(term256473, 9, term256401);
        setElement(term256473, 11, term256401);
        setElement(term256473, 13, term256401);
        setElement(term256473, 15, term256401);
        setElement(term256473, 17, term256401);
        setElement(term256473, 19, term256401);
        setElement(term256473, 21, term256401);
        setElement(term256473, 23, term256401);
        setElement(term256473, 25, term256401);
        setElement(term256473, 27, term256401);
        setElement(term256473, 29, term256401);
        setElement(term256473, 31, term256401);
        setElement(term256473, 33, term256401);
        setElement(term256473, 35, term256401);
        setElement(term256473, 37, term256401);
        setElement(term256473, 39, term256401);
        setField(term256428, term256428.getClass(), "wallOffsets", term256473);
        setField(term256428, term256428.getClass(), "lastRules", term256474);
        setField(term256475, term256475.getClass(), "table", null);
        setField(term256475, term256475.getClass(), "nextTable", null);
        setLongField(term256475, term256475.getClass(), "baseCount", 0L);
        setIntField(term256475, term256475.getClass(), "sizeCtl", 0);
        setIntField(term256475, term256475.getClass(), "transferIndex", 0);
        setIntField(term256475, term256475.getClass(), "cellsBusy", 0);
        setField(term256475, term256475.getClass(), "counterCells", null);
        setField(term256475, term256475.getClass(), "keySet", null);
        setField(term256475, term256475.getClass(), "values", null);
        setField(term256475, term256475.getClass(), "entrySet", null);
        setField(term256475, term256475.getClass(), "keySet", null);
        setField(term256475, term256475.getClass(), "values", null);
        setField(term256428, term256428.getClass(), "lastRulesCache", term256475);
        setField(term256411, term256411.getClass(), "rules", term256428);
        setField(term256390, term256390.getClass(), "zone", term256411);
        setField(term256305, term256305.getClass(), "time_stamp", term256390);
        setField(term256305, term256305.getClass(), "start_up_mode", "LLVxzGZuym");
        setField(term256305, term256305.getClass(), "cmm_dly_mod", "FHWZKmPKlK");
        setField(term256305, term256305.getClass(), "cmm_dly_sec", "MqWvZIWxCr");
        setField(term256305, term256305.getClass(), "cmm_err_mod", "iiMXpaWLIH");
        setField(term256305, term256305.getClass(), "country_code", "MqMDTdIpYR");
        setField(term256305, term256305.getClass(), "region_code", "uuwidsQbSs");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.BaseRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "rXLmNRoJfU";
        callMethod(klass, "setKc_serial", argTypes, term256305, args);
    }

};


