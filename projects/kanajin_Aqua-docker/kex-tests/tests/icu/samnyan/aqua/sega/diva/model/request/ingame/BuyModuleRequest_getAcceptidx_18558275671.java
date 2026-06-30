package icu.samnyan.aqua.sega.diva.model.request.ingame;

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
import static icu.samnyan.aqua.sega.diva.model.request.ingame.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class BuyModuleRequest_getAcceptidx_18558275671 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term254835;

    public BuyModuleRequest_getAcceptidx_18558275671() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term254835 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.ingame.BuyModuleRequest"));
        Object term254925 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term254926 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term254927 = newInstance(Class.forName("java.time.LocalDate"));
        Object term254931 = newInstance(Class.forName("java.time.LocalTime"));
        Object term254936 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term254946 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term254963 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term254964 = (long[]) newLongArray(1);
        Object[] term254966 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term254967 = (long[]) newLongArray(39);
        Object[] term255007 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term255008 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term255009 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term255010 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setIntField(term254835, term254835.getClass(), "pd_id", -1420183470);
        setIntField(term254835, term254835.getClass(), "accept_idx", 2037678367);
        setIntField(term254835, term254835.getClass(), "start_idx", -1458617520);
        setIntField(term254835, term254835.getClass(), "mdl_id", -679782713);
        setIntField(term254835, term254835.getClass(), "mdl_price", -650669637);
        setField(term254835, term254835.getClass(), "cmd", "jXearfyNpX");
        setField(term254835, term254835.getClass(), "req_id", "BhmFDzFKBZ");
        setField(term254835, term254835.getClass(), "game_id", "LfhJOBaMfN");
        setField(term254835, term254835.getClass(), "r_ver", "gTpNrKjAOw");
        setField(term254835, term254835.getClass(), "kc_serial", "mezvZVqRCp");
        setField(term254835, term254835.getClass(), "b_serial", "bZOShgQvtT");
        setField(term254835, term254835.getClass(), "place_id", "SrodJwobhd");
        setIntField(term254927, term254927.getClass(), "year", 2025);
        setShortField(term254927, term254927.getClass(), "month", (short) 7);
        setShortField(term254927, term254927.getClass(), "day", (short) 4);
        setField(term254926, term254926.getClass(), "date", term254927);
        setByteField(term254931, term254931.getClass(), "hour", (byte) 18);
        setByteField(term254931, term254931.getClass(), "minute", (byte) 13);
        setByteField(term254931, term254931.getClass(), "second", (byte) 37);
        setIntField(term254931, term254931.getClass(), "nano", 681447348);
        setField(term254926, term254926.getClass(), "time", term254931);
        setField(term254925, term254925.getClass(), "dateTime", term254926);
        setIntField(term254936, term254936.getClass(), "totalSeconds", -10800);
        setField(term254936, term254936.getClass(), "id", "-03:00");
        setField(term254925, term254925.getClass(), "offset", term254936);
        setField(term254946, term254946.getClass(), "id", "America/Recife");
        setLongElement(term254964, 0, -1767217224L);
        setField(term254963, term254963.getClass(), "standardTransitions", term254964);
        setElement(term254966, 1, term254936);
        setField(term254963, term254963.getClass(), "standardOffsets", term254966);
        setLongElement(term254967, 0, -1767217224L);
        setLongElement(term254967, 1, -1206957600L);
        setLongElement(term254967, 2, -1191362400L);
        setLongElement(term254967, 3, -1175374800L);
        setLongElement(term254967, 4, -1159826400L);
        setLongElement(term254967, 5, -633819600L);
        setLongElement(term254967, 6, -622069200L);
        setLongElement(term254967, 7, -602283600L);
        setLongElement(term254967, 8, -591832800L);
        setLongElement(term254967, 9, -570747600L);
        setLongElement(term254967, 10, -560210400L);
        setLongElement(term254967, 11, -539125200L);
        setLongElement(term254967, 12, -531352800L);
        setLongElement(term254967, 13, -191365200L);
        setLongElement(term254967, 14, -184197600L);
        setLongElement(term254967, 15, -155163600L);
        setLongElement(term254967, 16, -150069600L);
        setLongElement(term254967, 17, -128898000L);
        setLongElement(term254967, 18, -121125600L);
        setLongElement(term254967, 19, -99954000L);
        setLongElement(term254967, 20, -89589600L);
        setLongElement(term254967, 21, -68418000L);
        setLongElement(term254967, 22, -57967200L);
        setLongElement(term254967, 23, 499748400L);
        setLongElement(term254967, 24, 511236000L);
        setLongElement(term254967, 25, 530593200L);
        setLongElement(term254967, 26, 540266400L);
        setLongElement(term254967, 27, 562129200L);
        setLongElement(term254967, 28, 571197600L);
        setLongElement(term254967, 29, 592974000L);
        setLongElement(term254967, 30, 602042400L);
        setLongElement(term254967, 31, 624423600L);
        setLongElement(term254967, 32, 634701600L);
        setLongElement(term254967, 33, 938919600L);
        setLongElement(term254967, 34, 951616800L);
        setLongElement(term254967, 35, 970974000L);
        setLongElement(term254967, 36, 971575200L);
        setLongElement(term254967, 37, 1003028400L);
        setLongElement(term254967, 38, 1013911200L);
        setField(term254963, term254963.getClass(), "savingsInstantTransitions", term254967);
        setField(term254963, term254963.getClass(), "savingsLocalTransitions", term255007);
        setElement(term255008, 1, term254936);
        setElement(term255008, 3, term254936);
        setElement(term255008, 5, term254936);
        setElement(term255008, 7, term254936);
        setElement(term255008, 9, term254936);
        setElement(term255008, 11, term254936);
        setElement(term255008, 13, term254936);
        setElement(term255008, 15, term254936);
        setElement(term255008, 17, term254936);
        setElement(term255008, 19, term254936);
        setElement(term255008, 21, term254936);
        setElement(term255008, 23, term254936);
        setElement(term255008, 25, term254936);
        setElement(term255008, 27, term254936);
        setElement(term255008, 29, term254936);
        setElement(term255008, 31, term254936);
        setElement(term255008, 33, term254936);
        setElement(term255008, 35, term254936);
        setElement(term255008, 37, term254936);
        setElement(term255008, 39, term254936);
        setField(term254963, term254963.getClass(), "wallOffsets", term255008);
        setField(term254963, term254963.getClass(), "lastRules", term255009);
        setField(term255010, term255010.getClass(), "table", null);
        setField(term255010, term255010.getClass(), "nextTable", null);
        setLongField(term255010, term255010.getClass(), "baseCount", 0L);
        setIntField(term255010, term255010.getClass(), "sizeCtl", 0);
        setIntField(term255010, term255010.getClass(), "transferIndex", 0);
        setIntField(term255010, term255010.getClass(), "cellsBusy", 0);
        setField(term255010, term255010.getClass(), "counterCells", null);
        setField(term255010, term255010.getClass(), "keySet", null);
        setField(term255010, term255010.getClass(), "values", null);
        setField(term255010, term255010.getClass(), "entrySet", null);
        setField(term255010, term255010.getClass(), "keySet", null);
        setField(term255010, term255010.getClass(), "values", null);
        setField(term254963, term254963.getClass(), "lastRulesCache", term255010);
        setField(term254946, term254946.getClass(), "rules", term254963);
        setField(term254925, term254925.getClass(), "zone", term254946);
        setField(term254835, term254835.getClass(), "time_stamp", term254925);
        setField(term254835, term254835.getClass(), "start_up_mode", "aEKxCMZaAl");
        setField(term254835, term254835.getClass(), "cmm_dly_mod", "uVksDvNeyo");
        setField(term254835, term254835.getClass(), "cmm_dly_sec", "KThgZcLeyJ");
        setField(term254835, term254835.getClass(), "cmm_err_mod", "qTgeYJrPfV");
        setField(term254835, term254835.getClass(), "country_code", "aMXuzqauuw");
        setField(term254835, term254835.getClass(), "region_code", "OsLyHIAMvZ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.ingame.BuyModuleRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAccept_idx", argTypes, term254835, args);
    }

};


