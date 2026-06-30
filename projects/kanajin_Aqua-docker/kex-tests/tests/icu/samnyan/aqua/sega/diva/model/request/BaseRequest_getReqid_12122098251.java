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

public class BaseRequest_getReqid_12122098251 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term248788;

    public BaseRequest_getReqid_12122098251() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term248788 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.BaseRequest"));
        Object term248873 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term248874 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term248875 = newInstance(Class.forName("java.time.LocalDate"));
        Object term248879 = newInstance(Class.forName("java.time.LocalTime"));
        Object term248884 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term248894 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term248911 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term248912 = (long[]) newLongArray(1);
        Object[] term248914 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term248915 = (long[]) newLongArray(39);
        Object[] term248955 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term248956 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term248957 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term248958 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term248788, term248788.getClass(), "cmd", "kBoIUinjBw");
        setField(term248788, term248788.getClass(), "req_id", "DrCWSqTYSn");
        setField(term248788, term248788.getClass(), "game_id", "porFPgKTrM");
        setField(term248788, term248788.getClass(), "r_ver", "PvoRpvEjZQ");
        setField(term248788, term248788.getClass(), "kc_serial", "usnNnhdlFi");
        setField(term248788, term248788.getClass(), "b_serial", "QXQboaRWMP");
        setField(term248788, term248788.getClass(), "place_id", "eykOlhRHsN");
        setIntField(term248875, term248875.getClass(), "year", 2010);
        setShortField(term248875, term248875.getClass(), "month", (short) 3);
        setShortField(term248875, term248875.getClass(), "day", (short) 23);
        setField(term248874, term248874.getClass(), "date", term248875);
        setByteField(term248879, term248879.getClass(), "hour", (byte) 17);
        setByteField(term248879, term248879.getClass(), "minute", (byte) 32);
        setByteField(term248879, term248879.getClass(), "second", (byte) 36);
        setIntField(term248879, term248879.getClass(), "nano", 470582535);
        setField(term248874, term248874.getClass(), "time", term248879);
        setField(term248873, term248873.getClass(), "dateTime", term248874);
        setIntField(term248884, term248884.getClass(), "totalSeconds", -10800);
        setField(term248884, term248884.getClass(), "id", "-03:00");
        setField(term248873, term248873.getClass(), "offset", term248884);
        setField(term248894, term248894.getClass(), "id", "America/Recife");
        setLongElement(term248912, 0, -1767217224L);
        setField(term248911, term248911.getClass(), "standardTransitions", term248912);
        setElement(term248914, 1, term248884);
        setField(term248911, term248911.getClass(), "standardOffsets", term248914);
        setLongElement(term248915, 0, -1767217224L);
        setLongElement(term248915, 1, -1206957600L);
        setLongElement(term248915, 2, -1191362400L);
        setLongElement(term248915, 3, -1175374800L);
        setLongElement(term248915, 4, -1159826400L);
        setLongElement(term248915, 5, -633819600L);
        setLongElement(term248915, 6, -622069200L);
        setLongElement(term248915, 7, -602283600L);
        setLongElement(term248915, 8, -591832800L);
        setLongElement(term248915, 9, -570747600L);
        setLongElement(term248915, 10, -560210400L);
        setLongElement(term248915, 11, -539125200L);
        setLongElement(term248915, 12, -531352800L);
        setLongElement(term248915, 13, -191365200L);
        setLongElement(term248915, 14, -184197600L);
        setLongElement(term248915, 15, -155163600L);
        setLongElement(term248915, 16, -150069600L);
        setLongElement(term248915, 17, -128898000L);
        setLongElement(term248915, 18, -121125600L);
        setLongElement(term248915, 19, -99954000L);
        setLongElement(term248915, 20, -89589600L);
        setLongElement(term248915, 21, -68418000L);
        setLongElement(term248915, 22, -57967200L);
        setLongElement(term248915, 23, 499748400L);
        setLongElement(term248915, 24, 511236000L);
        setLongElement(term248915, 25, 530593200L);
        setLongElement(term248915, 26, 540266400L);
        setLongElement(term248915, 27, 562129200L);
        setLongElement(term248915, 28, 571197600L);
        setLongElement(term248915, 29, 592974000L);
        setLongElement(term248915, 30, 602042400L);
        setLongElement(term248915, 31, 624423600L);
        setLongElement(term248915, 32, 634701600L);
        setLongElement(term248915, 33, 938919600L);
        setLongElement(term248915, 34, 951616800L);
        setLongElement(term248915, 35, 970974000L);
        setLongElement(term248915, 36, 971575200L);
        setLongElement(term248915, 37, 1003028400L);
        setLongElement(term248915, 38, 1013911200L);
        setField(term248911, term248911.getClass(), "savingsInstantTransitions", term248915);
        setField(term248911, term248911.getClass(), "savingsLocalTransitions", term248955);
        setElement(term248956, 1, term248884);
        setElement(term248956, 3, term248884);
        setElement(term248956, 5, term248884);
        setElement(term248956, 7, term248884);
        setElement(term248956, 9, term248884);
        setElement(term248956, 11, term248884);
        setElement(term248956, 13, term248884);
        setElement(term248956, 15, term248884);
        setElement(term248956, 17, term248884);
        setElement(term248956, 19, term248884);
        setElement(term248956, 21, term248884);
        setElement(term248956, 23, term248884);
        setElement(term248956, 25, term248884);
        setElement(term248956, 27, term248884);
        setElement(term248956, 29, term248884);
        setElement(term248956, 31, term248884);
        setElement(term248956, 33, term248884);
        setElement(term248956, 35, term248884);
        setElement(term248956, 37, term248884);
        setElement(term248956, 39, term248884);
        setField(term248911, term248911.getClass(), "wallOffsets", term248956);
        setField(term248911, term248911.getClass(), "lastRules", term248957);
        setField(term248958, term248958.getClass(), "table", null);
        setField(term248958, term248958.getClass(), "nextTable", null);
        setLongField(term248958, term248958.getClass(), "baseCount", 0L);
        setIntField(term248958, term248958.getClass(), "sizeCtl", 0);
        setIntField(term248958, term248958.getClass(), "transferIndex", 0);
        setIntField(term248958, term248958.getClass(), "cellsBusy", 0);
        setField(term248958, term248958.getClass(), "counterCells", null);
        setField(term248958, term248958.getClass(), "keySet", null);
        setField(term248958, term248958.getClass(), "values", null);
        setField(term248958, term248958.getClass(), "entrySet", null);
        setField(term248958, term248958.getClass(), "keySet", null);
        setField(term248958, term248958.getClass(), "values", null);
        setField(term248911, term248911.getClass(), "lastRulesCache", term248958);
        setField(term248894, term248894.getClass(), "rules", term248911);
        setField(term248873, term248873.getClass(), "zone", term248894);
        setField(term248788, term248788.getClass(), "time_stamp", term248873);
        setField(term248788, term248788.getClass(), "start_up_mode", "LZatFkMSRt");
        setField(term248788, term248788.getClass(), "cmm_dly_mod", "fKGSaWAVQr");
        setField(term248788, term248788.getClass(), "cmm_dly_sec", "fBbPBwYFmd");
        setField(term248788, term248788.getClass(), "cmm_err_mod", "BRqjZHWrDB");
        setField(term248788, term248788.getClass(), "country_code", "jOEgAmeXaq");
        setField(term248788, term248788.getClass(), "region_code", "EArfIBFidz");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.BaseRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getReq_id", argTypes, term248788, args);
    }

};


