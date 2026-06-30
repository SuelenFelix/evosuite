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

public class BaseRequest_setStartupmode_139597868522 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term258130;

    public BaseRequest_setStartupmode_139597868522() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term258130 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.BaseRequest"));
        Object term258215 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term258216 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term258217 = newInstance(Class.forName("java.time.LocalDate"));
        Object term258221 = newInstance(Class.forName("java.time.LocalTime"));
        Object term258226 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term258236 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term258253 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term258254 = (long[]) newLongArray(1);
        Object[] term258256 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term258257 = (long[]) newLongArray(39);
        Object[] term258297 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term258298 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term258299 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term258300 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term258130, term258130.getClass(), "cmd", "oQFejbSARv");
        setField(term258130, term258130.getClass(), "req_id", "DzSvjuoClh");
        setField(term258130, term258130.getClass(), "game_id", "mKfcJwCzHA");
        setField(term258130, term258130.getClass(), "r_ver", "aAolDGKlZL");
        setField(term258130, term258130.getClass(), "kc_serial", "QowFnXBGSJ");
        setField(term258130, term258130.getClass(), "b_serial", "KZIClWErQV");
        setField(term258130, term258130.getClass(), "place_id", "NlMAkCBTMT");
        setIntField(term258217, term258217.getClass(), "year", 2016);
        setShortField(term258217, term258217.getClass(), "month", (short) 12);
        setShortField(term258217, term258217.getClass(), "day", (short) 2);
        setField(term258216, term258216.getClass(), "date", term258217);
        setByteField(term258221, term258221.getClass(), "hour", (byte) 7);
        setByteField(term258221, term258221.getClass(), "minute", (byte) 38);
        setByteField(term258221, term258221.getClass(), "second", (byte) 49);
        setIntField(term258221, term258221.getClass(), "nano", 415044053);
        setField(term258216, term258216.getClass(), "time", term258221);
        setField(term258215, term258215.getClass(), "dateTime", term258216);
        setIntField(term258226, term258226.getClass(), "totalSeconds", -10800);
        setField(term258226, term258226.getClass(), "id", "-03:00");
        setField(term258215, term258215.getClass(), "offset", term258226);
        setField(term258236, term258236.getClass(), "id", "America/Recife");
        setLongElement(term258254, 0, -1767217224L);
        setField(term258253, term258253.getClass(), "standardTransitions", term258254);
        setElement(term258256, 1, term258226);
        setField(term258253, term258253.getClass(), "standardOffsets", term258256);
        setLongElement(term258257, 0, -1767217224L);
        setLongElement(term258257, 1, -1206957600L);
        setLongElement(term258257, 2, -1191362400L);
        setLongElement(term258257, 3, -1175374800L);
        setLongElement(term258257, 4, -1159826400L);
        setLongElement(term258257, 5, -633819600L);
        setLongElement(term258257, 6, -622069200L);
        setLongElement(term258257, 7, -602283600L);
        setLongElement(term258257, 8, -591832800L);
        setLongElement(term258257, 9, -570747600L);
        setLongElement(term258257, 10, -560210400L);
        setLongElement(term258257, 11, -539125200L);
        setLongElement(term258257, 12, -531352800L);
        setLongElement(term258257, 13, -191365200L);
        setLongElement(term258257, 14, -184197600L);
        setLongElement(term258257, 15, -155163600L);
        setLongElement(term258257, 16, -150069600L);
        setLongElement(term258257, 17, -128898000L);
        setLongElement(term258257, 18, -121125600L);
        setLongElement(term258257, 19, -99954000L);
        setLongElement(term258257, 20, -89589600L);
        setLongElement(term258257, 21, -68418000L);
        setLongElement(term258257, 22, -57967200L);
        setLongElement(term258257, 23, 499748400L);
        setLongElement(term258257, 24, 511236000L);
        setLongElement(term258257, 25, 530593200L);
        setLongElement(term258257, 26, 540266400L);
        setLongElement(term258257, 27, 562129200L);
        setLongElement(term258257, 28, 571197600L);
        setLongElement(term258257, 29, 592974000L);
        setLongElement(term258257, 30, 602042400L);
        setLongElement(term258257, 31, 624423600L);
        setLongElement(term258257, 32, 634701600L);
        setLongElement(term258257, 33, 938919600L);
        setLongElement(term258257, 34, 951616800L);
        setLongElement(term258257, 35, 970974000L);
        setLongElement(term258257, 36, 971575200L);
        setLongElement(term258257, 37, 1003028400L);
        setLongElement(term258257, 38, 1013911200L);
        setField(term258253, term258253.getClass(), "savingsInstantTransitions", term258257);
        setField(term258253, term258253.getClass(), "savingsLocalTransitions", term258297);
        setElement(term258298, 1, term258226);
        setElement(term258298, 3, term258226);
        setElement(term258298, 5, term258226);
        setElement(term258298, 7, term258226);
        setElement(term258298, 9, term258226);
        setElement(term258298, 11, term258226);
        setElement(term258298, 13, term258226);
        setElement(term258298, 15, term258226);
        setElement(term258298, 17, term258226);
        setElement(term258298, 19, term258226);
        setElement(term258298, 21, term258226);
        setElement(term258298, 23, term258226);
        setElement(term258298, 25, term258226);
        setElement(term258298, 27, term258226);
        setElement(term258298, 29, term258226);
        setElement(term258298, 31, term258226);
        setElement(term258298, 33, term258226);
        setElement(term258298, 35, term258226);
        setElement(term258298, 37, term258226);
        setElement(term258298, 39, term258226);
        setField(term258253, term258253.getClass(), "wallOffsets", term258298);
        setField(term258253, term258253.getClass(), "lastRules", term258299);
        setField(term258300, term258300.getClass(), "table", null);
        setField(term258300, term258300.getClass(), "nextTable", null);
        setLongField(term258300, term258300.getClass(), "baseCount", 0L);
        setIntField(term258300, term258300.getClass(), "sizeCtl", 0);
        setIntField(term258300, term258300.getClass(), "transferIndex", 0);
        setIntField(term258300, term258300.getClass(), "cellsBusy", 0);
        setField(term258300, term258300.getClass(), "counterCells", null);
        setField(term258300, term258300.getClass(), "keySet", null);
        setField(term258300, term258300.getClass(), "values", null);
        setField(term258300, term258300.getClass(), "entrySet", null);
        setField(term258300, term258300.getClass(), "keySet", null);
        setField(term258300, term258300.getClass(), "values", null);
        setField(term258253, term258253.getClass(), "lastRulesCache", term258300);
        setField(term258236, term258236.getClass(), "rules", term258253);
        setField(term258215, term258215.getClass(), "zone", term258236);
        setField(term258130, term258130.getClass(), "time_stamp", term258215);
        setField(term258130, term258130.getClass(), "start_up_mode", "OZIAupXzmm");
        setField(term258130, term258130.getClass(), "cmm_dly_mod", "FYhlObvAKO");
        setField(term258130, term258130.getClass(), "cmm_dly_sec", "GFxNoBwsCD");
        setField(term258130, term258130.getClass(), "cmm_err_mod", "zBVQNMxMvk");
        setField(term258130, term258130.getClass(), "country_code", "iJSPWddhZO");
        setField(term258130, term258130.getClass(), "region_code", "WbvttDefvl");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.BaseRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "coNhvymEkq";
        callMethod(klass, "setStart_up_mode", argTypes, term258130, args);
    }

};


