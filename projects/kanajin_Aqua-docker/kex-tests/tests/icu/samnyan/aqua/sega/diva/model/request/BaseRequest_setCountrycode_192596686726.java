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

public class BaseRequest_setCountrycode_192596686726 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term259966;

    public BaseRequest_setCountrycode_192596686726() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term259966 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.BaseRequest"));
        Object term260051 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term260052 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term260053 = newInstance(Class.forName("java.time.LocalDate"));
        Object term260057 = newInstance(Class.forName("java.time.LocalTime"));
        Object term260062 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term260072 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term260089 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term260090 = (long[]) newLongArray(1);
        Object[] term260092 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term260093 = (long[]) newLongArray(39);
        Object[] term260133 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term260134 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term260135 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term260136 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term259966, term259966.getClass(), "cmd", "UPDwVukZbZ");
        setField(term259966, term259966.getClass(), "req_id", "nFQQbKAYNp");
        setField(term259966, term259966.getClass(), "game_id", "VQkWATPAEW");
        setField(term259966, term259966.getClass(), "r_ver", "giGfkdhPAE");
        setField(term259966, term259966.getClass(), "kc_serial", "wNfBmUuDuP");
        setField(term259966, term259966.getClass(), "b_serial", "lNTNKavUNL");
        setField(term259966, term259966.getClass(), "place_id", "BXfmFjgpOy");
        setIntField(term260053, term260053.getClass(), "year", 2022);
        setShortField(term260053, term260053.getClass(), "month", (short) 10);
        setShortField(term260053, term260053.getClass(), "day", (short) 14);
        setField(term260052, term260052.getClass(), "date", term260053);
        setByteField(term260057, term260057.getClass(), "hour", (byte) 10);
        setByteField(term260057, term260057.getClass(), "minute", (byte) 28);
        setByteField(term260057, term260057.getClass(), "second", (byte) 24);
        setIntField(term260057, term260057.getClass(), "nano", 117469048);
        setField(term260052, term260052.getClass(), "time", term260057);
        setField(term260051, term260051.getClass(), "dateTime", term260052);
        setIntField(term260062, term260062.getClass(), "totalSeconds", -10800);
        setField(term260062, term260062.getClass(), "id", "-03:00");
        setField(term260051, term260051.getClass(), "offset", term260062);
        setField(term260072, term260072.getClass(), "id", "America/Recife");
        setLongElement(term260090, 0, -1767217224L);
        setField(term260089, term260089.getClass(), "standardTransitions", term260090);
        setElement(term260092, 1, term260062);
        setField(term260089, term260089.getClass(), "standardOffsets", term260092);
        setLongElement(term260093, 0, -1767217224L);
        setLongElement(term260093, 1, -1206957600L);
        setLongElement(term260093, 2, -1191362400L);
        setLongElement(term260093, 3, -1175374800L);
        setLongElement(term260093, 4, -1159826400L);
        setLongElement(term260093, 5, -633819600L);
        setLongElement(term260093, 6, -622069200L);
        setLongElement(term260093, 7, -602283600L);
        setLongElement(term260093, 8, -591832800L);
        setLongElement(term260093, 9, -570747600L);
        setLongElement(term260093, 10, -560210400L);
        setLongElement(term260093, 11, -539125200L);
        setLongElement(term260093, 12, -531352800L);
        setLongElement(term260093, 13, -191365200L);
        setLongElement(term260093, 14, -184197600L);
        setLongElement(term260093, 15, -155163600L);
        setLongElement(term260093, 16, -150069600L);
        setLongElement(term260093, 17, -128898000L);
        setLongElement(term260093, 18, -121125600L);
        setLongElement(term260093, 19, -99954000L);
        setLongElement(term260093, 20, -89589600L);
        setLongElement(term260093, 21, -68418000L);
        setLongElement(term260093, 22, -57967200L);
        setLongElement(term260093, 23, 499748400L);
        setLongElement(term260093, 24, 511236000L);
        setLongElement(term260093, 25, 530593200L);
        setLongElement(term260093, 26, 540266400L);
        setLongElement(term260093, 27, 562129200L);
        setLongElement(term260093, 28, 571197600L);
        setLongElement(term260093, 29, 592974000L);
        setLongElement(term260093, 30, 602042400L);
        setLongElement(term260093, 31, 624423600L);
        setLongElement(term260093, 32, 634701600L);
        setLongElement(term260093, 33, 938919600L);
        setLongElement(term260093, 34, 951616800L);
        setLongElement(term260093, 35, 970974000L);
        setLongElement(term260093, 36, 971575200L);
        setLongElement(term260093, 37, 1003028400L);
        setLongElement(term260093, 38, 1013911200L);
        setField(term260089, term260089.getClass(), "savingsInstantTransitions", term260093);
        setField(term260089, term260089.getClass(), "savingsLocalTransitions", term260133);
        setElement(term260134, 1, term260062);
        setElement(term260134, 3, term260062);
        setElement(term260134, 5, term260062);
        setElement(term260134, 7, term260062);
        setElement(term260134, 9, term260062);
        setElement(term260134, 11, term260062);
        setElement(term260134, 13, term260062);
        setElement(term260134, 15, term260062);
        setElement(term260134, 17, term260062);
        setElement(term260134, 19, term260062);
        setElement(term260134, 21, term260062);
        setElement(term260134, 23, term260062);
        setElement(term260134, 25, term260062);
        setElement(term260134, 27, term260062);
        setElement(term260134, 29, term260062);
        setElement(term260134, 31, term260062);
        setElement(term260134, 33, term260062);
        setElement(term260134, 35, term260062);
        setElement(term260134, 37, term260062);
        setElement(term260134, 39, term260062);
        setField(term260089, term260089.getClass(), "wallOffsets", term260134);
        setField(term260089, term260089.getClass(), "lastRules", term260135);
        setField(term260136, term260136.getClass(), "table", null);
        setField(term260136, term260136.getClass(), "nextTable", null);
        setLongField(term260136, term260136.getClass(), "baseCount", 0L);
        setIntField(term260136, term260136.getClass(), "sizeCtl", 0);
        setIntField(term260136, term260136.getClass(), "transferIndex", 0);
        setIntField(term260136, term260136.getClass(), "cellsBusy", 0);
        setField(term260136, term260136.getClass(), "counterCells", null);
        setField(term260136, term260136.getClass(), "keySet", null);
        setField(term260136, term260136.getClass(), "values", null);
        setField(term260136, term260136.getClass(), "entrySet", null);
        setField(term260136, term260136.getClass(), "keySet", null);
        setField(term260136, term260136.getClass(), "values", null);
        setField(term260089, term260089.getClass(), "lastRulesCache", term260136);
        setField(term260072, term260072.getClass(), "rules", term260089);
        setField(term260051, term260051.getClass(), "zone", term260072);
        setField(term259966, term259966.getClass(), "time_stamp", term260051);
        setField(term259966, term259966.getClass(), "start_up_mode", "JCeHaSFOWK");
        setField(term259966, term259966.getClass(), "cmm_dly_mod", "PNtiQWTZzA");
        setField(term259966, term259966.getClass(), "cmm_dly_sec", "raishRurKx");
        setField(term259966, term259966.getClass(), "cmm_err_mod", "PpeSAmBPlT");
        setField(term259966, term259966.getClass(), "country_code", "XmRRZpyFKp");
        setField(term259966, term259966.getClass(), "region_code", "QXOnXJGHZk");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.BaseRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "tckSURIPmO";
        callMethod(klass, "setCountry_code", argTypes, term259966, args);
    }

};


