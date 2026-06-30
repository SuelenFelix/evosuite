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

public class BaseRequest_getCmmerrmod_71250413311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term253158;

    public BaseRequest_getCmmerrmod_71250413311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term253158 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.BaseRequest"));
        Object term253243 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term253244 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term253245 = newInstance(Class.forName("java.time.LocalDate"));
        Object term253249 = newInstance(Class.forName("java.time.LocalTime"));
        Object term253254 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term253264 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term253281 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term253282 = (long[]) newLongArray(1);
        Object[] term253284 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term253285 = (long[]) newLongArray(39);
        Object[] term253325 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term253326 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term253327 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term253328 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term253158, term253158.getClass(), "cmd", "VKpNTpPbui");
        setField(term253158, term253158.getClass(), "req_id", "TuzuoEoycc");
        setField(term253158, term253158.getClass(), "game_id", "LXWldHIZNy");
        setField(term253158, term253158.getClass(), "r_ver", "BATrPAXgpa");
        setField(term253158, term253158.getClass(), "kc_serial", "vgwMeHgaql");
        setField(term253158, term253158.getClass(), "b_serial", "apRNMfAeJs");
        setField(term253158, term253158.getClass(), "place_id", "xXjFLOrnwn");
        setIntField(term253245, term253245.getClass(), "year", 2029);
        setShortField(term253245, term253245.getClass(), "month", (short) 8);
        setShortField(term253245, term253245.getClass(), "day", (short) 14);
        setField(term253244, term253244.getClass(), "date", term253245);
        setByteField(term253249, term253249.getClass(), "hour", (byte) 10);
        setByteField(term253249, term253249.getClass(), "minute", (byte) 28);
        setByteField(term253249, term253249.getClass(), "second", (byte) 23);
        setIntField(term253249, term253249.getClass(), "nano", 676524979);
        setField(term253244, term253244.getClass(), "time", term253249);
        setField(term253243, term253243.getClass(), "dateTime", term253244);
        setIntField(term253254, term253254.getClass(), "totalSeconds", -10800);
        setField(term253254, term253254.getClass(), "id", "-03:00");
        setField(term253243, term253243.getClass(), "offset", term253254);
        setField(term253264, term253264.getClass(), "id", "America/Recife");
        setLongElement(term253282, 0, -1767217224L);
        setField(term253281, term253281.getClass(), "standardTransitions", term253282);
        setElement(term253284, 1, term253254);
        setField(term253281, term253281.getClass(), "standardOffsets", term253284);
        setLongElement(term253285, 0, -1767217224L);
        setLongElement(term253285, 1, -1206957600L);
        setLongElement(term253285, 2, -1191362400L);
        setLongElement(term253285, 3, -1175374800L);
        setLongElement(term253285, 4, -1159826400L);
        setLongElement(term253285, 5, -633819600L);
        setLongElement(term253285, 6, -622069200L);
        setLongElement(term253285, 7, -602283600L);
        setLongElement(term253285, 8, -591832800L);
        setLongElement(term253285, 9, -570747600L);
        setLongElement(term253285, 10, -560210400L);
        setLongElement(term253285, 11, -539125200L);
        setLongElement(term253285, 12, -531352800L);
        setLongElement(term253285, 13, -191365200L);
        setLongElement(term253285, 14, -184197600L);
        setLongElement(term253285, 15, -155163600L);
        setLongElement(term253285, 16, -150069600L);
        setLongElement(term253285, 17, -128898000L);
        setLongElement(term253285, 18, -121125600L);
        setLongElement(term253285, 19, -99954000L);
        setLongElement(term253285, 20, -89589600L);
        setLongElement(term253285, 21, -68418000L);
        setLongElement(term253285, 22, -57967200L);
        setLongElement(term253285, 23, 499748400L);
        setLongElement(term253285, 24, 511236000L);
        setLongElement(term253285, 25, 530593200L);
        setLongElement(term253285, 26, 540266400L);
        setLongElement(term253285, 27, 562129200L);
        setLongElement(term253285, 28, 571197600L);
        setLongElement(term253285, 29, 592974000L);
        setLongElement(term253285, 30, 602042400L);
        setLongElement(term253285, 31, 624423600L);
        setLongElement(term253285, 32, 634701600L);
        setLongElement(term253285, 33, 938919600L);
        setLongElement(term253285, 34, 951616800L);
        setLongElement(term253285, 35, 970974000L);
        setLongElement(term253285, 36, 971575200L);
        setLongElement(term253285, 37, 1003028400L);
        setLongElement(term253285, 38, 1013911200L);
        setField(term253281, term253281.getClass(), "savingsInstantTransitions", term253285);
        setField(term253281, term253281.getClass(), "savingsLocalTransitions", term253325);
        setElement(term253326, 1, term253254);
        setElement(term253326, 3, term253254);
        setElement(term253326, 5, term253254);
        setElement(term253326, 7, term253254);
        setElement(term253326, 9, term253254);
        setElement(term253326, 11, term253254);
        setElement(term253326, 13, term253254);
        setElement(term253326, 15, term253254);
        setElement(term253326, 17, term253254);
        setElement(term253326, 19, term253254);
        setElement(term253326, 21, term253254);
        setElement(term253326, 23, term253254);
        setElement(term253326, 25, term253254);
        setElement(term253326, 27, term253254);
        setElement(term253326, 29, term253254);
        setElement(term253326, 31, term253254);
        setElement(term253326, 33, term253254);
        setElement(term253326, 35, term253254);
        setElement(term253326, 37, term253254);
        setElement(term253326, 39, term253254);
        setField(term253281, term253281.getClass(), "wallOffsets", term253326);
        setField(term253281, term253281.getClass(), "lastRules", term253327);
        setField(term253328, term253328.getClass(), "table", null);
        setField(term253328, term253328.getClass(), "nextTable", null);
        setLongField(term253328, term253328.getClass(), "baseCount", 0L);
        setIntField(term253328, term253328.getClass(), "sizeCtl", 0);
        setIntField(term253328, term253328.getClass(), "transferIndex", 0);
        setIntField(term253328, term253328.getClass(), "cellsBusy", 0);
        setField(term253328, term253328.getClass(), "counterCells", null);
        setField(term253328, term253328.getClass(), "keySet", null);
        setField(term253328, term253328.getClass(), "values", null);
        setField(term253328, term253328.getClass(), "entrySet", null);
        setField(term253328, term253328.getClass(), "keySet", null);
        setField(term253328, term253328.getClass(), "values", null);
        setField(term253281, term253281.getClass(), "lastRulesCache", term253328);
        setField(term253264, term253264.getClass(), "rules", term253281);
        setField(term253243, term253243.getClass(), "zone", term253264);
        setField(term253158, term253158.getClass(), "time_stamp", term253243);
        setField(term253158, term253158.getClass(), "start_up_mode", "EwHXheApdJ");
        setField(term253158, term253158.getClass(), "cmm_dly_mod", "FSxGuVZthC");
        setField(term253158, term253158.getClass(), "cmm_dly_sec", "vZxqxBKdGD");
        setField(term253158, term253158.getClass(), "cmm_err_mod", "ScVMeCBvvv");
        setField(term253158, term253158.getClass(), "country_code", "xysssjuOdh");
        setField(term253158, term253158.getClass(), "region_code", "LQWvIhnGeL");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.BaseRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCmm_err_mod", argTypes, term253158, args);
    }

};


