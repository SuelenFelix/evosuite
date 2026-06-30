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

public class BaseRequest_setCmmdlysec_161608457624 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term259048;

    public BaseRequest_setCmmdlysec_161608457624() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term259048 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.BaseRequest"));
        Object term259133 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term259134 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term259135 = newInstance(Class.forName("java.time.LocalDate"));
        Object term259139 = newInstance(Class.forName("java.time.LocalTime"));
        Object term259144 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term259154 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term259171 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term259172 = (long[]) newLongArray(1);
        Object[] term259174 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term259175 = (long[]) newLongArray(39);
        Object[] term259215 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term259216 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term259217 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term259218 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term259048, term259048.getClass(), "cmd", "cIeVoTDYCV");
        setField(term259048, term259048.getClass(), "req_id", "zHjWGfGucL");
        setField(term259048, term259048.getClass(), "game_id", "BrQDOXlSKX");
        setField(term259048, term259048.getClass(), "r_ver", "rqZXFCcyZu");
        setField(term259048, term259048.getClass(), "kc_serial", "rGcDZdOanr");
        setField(term259048, term259048.getClass(), "b_serial", "qlnQoljKQM");
        setField(term259048, term259048.getClass(), "place_id", "RMEDwLGQoG");
        setIntField(term259135, term259135.getClass(), "year", 2019);
        setShortField(term259135, term259135.getClass(), "month", (short) 12);
        setShortField(term259135, term259135.getClass(), "day", (short) 20);
        setField(term259134, term259134.getClass(), "date", term259135);
        setByteField(term259139, term259139.getClass(), "hour", (byte) 22);
        setByteField(term259139, term259139.getClass(), "minute", (byte) 20);
        setByteField(term259139, term259139.getClass(), "second", (byte) 29);
        setIntField(term259139, term259139.getClass(), "nano", 582302461);
        setField(term259134, term259134.getClass(), "time", term259139);
        setField(term259133, term259133.getClass(), "dateTime", term259134);
        setIntField(term259144, term259144.getClass(), "totalSeconds", -10800);
        setField(term259144, term259144.getClass(), "id", "-03:00");
        setField(term259133, term259133.getClass(), "offset", term259144);
        setField(term259154, term259154.getClass(), "id", "America/Recife");
        setLongElement(term259172, 0, -1767217224L);
        setField(term259171, term259171.getClass(), "standardTransitions", term259172);
        setElement(term259174, 1, term259144);
        setField(term259171, term259171.getClass(), "standardOffsets", term259174);
        setLongElement(term259175, 0, -1767217224L);
        setLongElement(term259175, 1, -1206957600L);
        setLongElement(term259175, 2, -1191362400L);
        setLongElement(term259175, 3, -1175374800L);
        setLongElement(term259175, 4, -1159826400L);
        setLongElement(term259175, 5, -633819600L);
        setLongElement(term259175, 6, -622069200L);
        setLongElement(term259175, 7, -602283600L);
        setLongElement(term259175, 8, -591832800L);
        setLongElement(term259175, 9, -570747600L);
        setLongElement(term259175, 10, -560210400L);
        setLongElement(term259175, 11, -539125200L);
        setLongElement(term259175, 12, -531352800L);
        setLongElement(term259175, 13, -191365200L);
        setLongElement(term259175, 14, -184197600L);
        setLongElement(term259175, 15, -155163600L);
        setLongElement(term259175, 16, -150069600L);
        setLongElement(term259175, 17, -128898000L);
        setLongElement(term259175, 18, -121125600L);
        setLongElement(term259175, 19, -99954000L);
        setLongElement(term259175, 20, -89589600L);
        setLongElement(term259175, 21, -68418000L);
        setLongElement(term259175, 22, -57967200L);
        setLongElement(term259175, 23, 499748400L);
        setLongElement(term259175, 24, 511236000L);
        setLongElement(term259175, 25, 530593200L);
        setLongElement(term259175, 26, 540266400L);
        setLongElement(term259175, 27, 562129200L);
        setLongElement(term259175, 28, 571197600L);
        setLongElement(term259175, 29, 592974000L);
        setLongElement(term259175, 30, 602042400L);
        setLongElement(term259175, 31, 624423600L);
        setLongElement(term259175, 32, 634701600L);
        setLongElement(term259175, 33, 938919600L);
        setLongElement(term259175, 34, 951616800L);
        setLongElement(term259175, 35, 970974000L);
        setLongElement(term259175, 36, 971575200L);
        setLongElement(term259175, 37, 1003028400L);
        setLongElement(term259175, 38, 1013911200L);
        setField(term259171, term259171.getClass(), "savingsInstantTransitions", term259175);
        setField(term259171, term259171.getClass(), "savingsLocalTransitions", term259215);
        setElement(term259216, 1, term259144);
        setElement(term259216, 3, term259144);
        setElement(term259216, 5, term259144);
        setElement(term259216, 7, term259144);
        setElement(term259216, 9, term259144);
        setElement(term259216, 11, term259144);
        setElement(term259216, 13, term259144);
        setElement(term259216, 15, term259144);
        setElement(term259216, 17, term259144);
        setElement(term259216, 19, term259144);
        setElement(term259216, 21, term259144);
        setElement(term259216, 23, term259144);
        setElement(term259216, 25, term259144);
        setElement(term259216, 27, term259144);
        setElement(term259216, 29, term259144);
        setElement(term259216, 31, term259144);
        setElement(term259216, 33, term259144);
        setElement(term259216, 35, term259144);
        setElement(term259216, 37, term259144);
        setElement(term259216, 39, term259144);
        setField(term259171, term259171.getClass(), "wallOffsets", term259216);
        setField(term259171, term259171.getClass(), "lastRules", term259217);
        setField(term259218, term259218.getClass(), "table", null);
        setField(term259218, term259218.getClass(), "nextTable", null);
        setLongField(term259218, term259218.getClass(), "baseCount", 0L);
        setIntField(term259218, term259218.getClass(), "sizeCtl", 0);
        setIntField(term259218, term259218.getClass(), "transferIndex", 0);
        setIntField(term259218, term259218.getClass(), "cellsBusy", 0);
        setField(term259218, term259218.getClass(), "counterCells", null);
        setField(term259218, term259218.getClass(), "keySet", null);
        setField(term259218, term259218.getClass(), "values", null);
        setField(term259218, term259218.getClass(), "entrySet", null);
        setField(term259218, term259218.getClass(), "keySet", null);
        setField(term259218, term259218.getClass(), "values", null);
        setField(term259171, term259171.getClass(), "lastRulesCache", term259218);
        setField(term259154, term259154.getClass(), "rules", term259171);
        setField(term259133, term259133.getClass(), "zone", term259154);
        setField(term259048, term259048.getClass(), "time_stamp", term259133);
        setField(term259048, term259048.getClass(), "start_up_mode", "wZEFxRSqVY");
        setField(term259048, term259048.getClass(), "cmm_dly_mod", "tHcDbcviFO");
        setField(term259048, term259048.getClass(), "cmm_dly_sec", "cmEWCrpoCO");
        setField(term259048, term259048.getClass(), "cmm_err_mod", "OApdoCtolu");
        setField(term259048, term259048.getClass(), "country_code", "ONkDXTThKL");
        setField(term259048, term259048.getClass(), "region_code", "AKbzAaAcmX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.BaseRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xiloHjgKux";
        callMethod(klass, "setCmm_dly_sec", argTypes, term259048, args);
    }

};


