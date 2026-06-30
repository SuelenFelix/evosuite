package icu.samnyan.aqua.sega.diva.handler.databank;

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
import static icu.samnyan.aqua.sega.diva.handler.databank.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class NgWordHandler_handle_6800888191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3960;
     Object term3961;

    public NgWordHandler_handle_6800888191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3960 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.handler.databank.NgWordHandler"));
        setField(term3960, term3960.getClass(), "mapper", null);
        term3961 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.BaseRequest"));
        Object term4046 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term4047 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4048 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4052 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4057 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term4067 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term4084 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term4085 = (long[]) newLongArray(1);
        Object[] term4087 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term4088 = (long[]) newLongArray(39);
        Object[] term4128 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term4129 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term4130 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term4131 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term3961, term3961.getClass(), "cmd", "XylxrMBraH");
        setField(term3961, term3961.getClass(), "req_id", "pORebkoRdD");
        setField(term3961, term3961.getClass(), "game_id", "mXGCWJDOqA");
        setField(term3961, term3961.getClass(), "r_ver", "dpNsDgfPso");
        setField(term3961, term3961.getClass(), "kc_serial", "hCWPJQKpdc");
        setField(term3961, term3961.getClass(), "b_serial", "WzMEhMXkKx");
        setField(term3961, term3961.getClass(), "place_id", "XOiDvlDhdc");
        setIntField(term4048, term4048.getClass(), "year", 2022);
        setShortField(term4048, term4048.getClass(), "month", (short) 11);
        setShortField(term4048, term4048.getClass(), "day", (short) 16);
        setField(term4047, term4047.getClass(), "date", term4048);
        setByteField(term4052, term4052.getClass(), "hour", (byte) 15);
        setByteField(term4052, term4052.getClass(), "minute", (byte) 54);
        setByteField(term4052, term4052.getClass(), "second", (byte) 2);
        setIntField(term4052, term4052.getClass(), "nano", 733274103);
        setField(term4047, term4047.getClass(), "time", term4052);
        setField(term4046, term4046.getClass(), "dateTime", term4047);
        setIntField(term4057, term4057.getClass(), "totalSeconds", -10800);
        setField(term4057, term4057.getClass(), "id", "-03:00");
        setField(term4046, term4046.getClass(), "offset", term4057);
        setField(term4067, term4067.getClass(), "id", "America/Recife");
        setLongElement(term4085, 0, -1767217224L);
        setField(term4084, term4084.getClass(), "standardTransitions", term4085);
        setElement(term4087, 1, term4057);
        setField(term4084, term4084.getClass(), "standardOffsets", term4087);
        setLongElement(term4088, 0, -1767217224L);
        setLongElement(term4088, 1, -1206957600L);
        setLongElement(term4088, 2, -1191362400L);
        setLongElement(term4088, 3, -1175374800L);
        setLongElement(term4088, 4, -1159826400L);
        setLongElement(term4088, 5, -633819600L);
        setLongElement(term4088, 6, -622069200L);
        setLongElement(term4088, 7, -602283600L);
        setLongElement(term4088, 8, -591832800L);
        setLongElement(term4088, 9, -570747600L);
        setLongElement(term4088, 10, -560210400L);
        setLongElement(term4088, 11, -539125200L);
        setLongElement(term4088, 12, -531352800L);
        setLongElement(term4088, 13, -191365200L);
        setLongElement(term4088, 14, -184197600L);
        setLongElement(term4088, 15, -155163600L);
        setLongElement(term4088, 16, -150069600L);
        setLongElement(term4088, 17, -128898000L);
        setLongElement(term4088, 18, -121125600L);
        setLongElement(term4088, 19, -99954000L);
        setLongElement(term4088, 20, -89589600L);
        setLongElement(term4088, 21, -68418000L);
        setLongElement(term4088, 22, -57967200L);
        setLongElement(term4088, 23, 499748400L);
        setLongElement(term4088, 24, 511236000L);
        setLongElement(term4088, 25, 530593200L);
        setLongElement(term4088, 26, 540266400L);
        setLongElement(term4088, 27, 562129200L);
        setLongElement(term4088, 28, 571197600L);
        setLongElement(term4088, 29, 592974000L);
        setLongElement(term4088, 30, 602042400L);
        setLongElement(term4088, 31, 624423600L);
        setLongElement(term4088, 32, 634701600L);
        setLongElement(term4088, 33, 938919600L);
        setLongElement(term4088, 34, 951616800L);
        setLongElement(term4088, 35, 970974000L);
        setLongElement(term4088, 36, 971575200L);
        setLongElement(term4088, 37, 1003028400L);
        setLongElement(term4088, 38, 1013911200L);
        setField(term4084, term4084.getClass(), "savingsInstantTransitions", term4088);
        setField(term4084, term4084.getClass(), "savingsLocalTransitions", term4128);
        setElement(term4129, 1, term4057);
        setElement(term4129, 3, term4057);
        setElement(term4129, 5, term4057);
        setElement(term4129, 7, term4057);
        setElement(term4129, 9, term4057);
        setElement(term4129, 11, term4057);
        setElement(term4129, 13, term4057);
        setElement(term4129, 15, term4057);
        setElement(term4129, 17, term4057);
        setElement(term4129, 19, term4057);
        setElement(term4129, 21, term4057);
        setElement(term4129, 23, term4057);
        setElement(term4129, 25, term4057);
        setElement(term4129, 27, term4057);
        setElement(term4129, 29, term4057);
        setElement(term4129, 31, term4057);
        setElement(term4129, 33, term4057);
        setElement(term4129, 35, term4057);
        setElement(term4129, 37, term4057);
        setElement(term4129, 39, term4057);
        setField(term4084, term4084.getClass(), "wallOffsets", term4129);
        setField(term4084, term4084.getClass(), "lastRules", term4130);
        setField(term4131, term4131.getClass(), "table", null);
        setField(term4131, term4131.getClass(), "nextTable", null);
        setLongField(term4131, term4131.getClass(), "baseCount", 0L);
        setIntField(term4131, term4131.getClass(), "sizeCtl", 0);
        setIntField(term4131, term4131.getClass(), "transferIndex", 0);
        setIntField(term4131, term4131.getClass(), "cellsBusy", 0);
        setField(term4131, term4131.getClass(), "counterCells", null);
        setField(term4131, term4131.getClass(), "keySet", null);
        setField(term4131, term4131.getClass(), "values", null);
        setField(term4131, term4131.getClass(), "entrySet", null);
        setField(term4131, term4131.getClass(), "keySet", null);
        setField(term4131, term4131.getClass(), "values", null);
        setField(term4084, term4084.getClass(), "lastRulesCache", term4131);
        setField(term4067, term4067.getClass(), "rules", term4084);
        setField(term4046, term4046.getClass(), "zone", term4067);
        setField(term3961, term3961.getClass(), "time_stamp", term4046);
        setField(term3961, term3961.getClass(), "start_up_mode", "AdxvLJhNLe");
        setField(term3961, term3961.getClass(), "cmm_dly_mod", "lHfTrWKMPk");
        setField(term3961, term3961.getClass(), "cmm_dly_sec", "JDaAnsVTGV");
        setField(term3961, term3961.getClass(), "cmm_err_mod", "mLUZFTfjle");
        setField(term3961, term3961.getClass(), "country_code", "xIeFjkHkOe");
        setField(term3961, term3961.getClass(), "region_code", "SdCKLMIYnX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.handler.databank.NgWordHandler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.diva.model.request.BaseRequest");
        Object[] args = new Object[1];
        args[0] = term3961;
        callMethod(klass, "handle", argTypes, term3960, args);
    }

};


