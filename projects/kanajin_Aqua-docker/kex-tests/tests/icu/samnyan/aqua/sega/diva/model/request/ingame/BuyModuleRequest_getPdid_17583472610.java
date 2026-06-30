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

public class BuyModuleRequest_getPdid_17583472610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term254393;

    public BuyModuleRequest_getPdid_17583472610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term254393 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.ingame.BuyModuleRequest"));
        Object term254483 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term254484 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term254485 = newInstance(Class.forName("java.time.LocalDate"));
        Object term254489 = newInstance(Class.forName("java.time.LocalTime"));
        Object term254494 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term254504 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term254521 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term254522 = (long[]) newLongArray(1);
        Object[] term254524 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term254525 = (long[]) newLongArray(39);
        Object[] term254565 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term254566 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term254567 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term254568 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setIntField(term254393, term254393.getClass(), "pd_id", -950554438);
        setIntField(term254393, term254393.getClass(), "accept_idx", -2092302525);
        setIntField(term254393, term254393.getClass(), "start_idx", -695046678);
        setIntField(term254393, term254393.getClass(), "mdl_id", -1911831824);
        setIntField(term254393, term254393.getClass(), "mdl_price", 725411933);
        setField(term254393, term254393.getClass(), "cmd", "NupNPsPxZu");
        setField(term254393, term254393.getClass(), "req_id", "bOTZrbSitH");
        setField(term254393, term254393.getClass(), "game_id", "ojFfVocDNH");
        setField(term254393, term254393.getClass(), "r_ver", "gqBOEdccip");
        setField(term254393, term254393.getClass(), "kc_serial", "biglNwhOOx");
        setField(term254393, term254393.getClass(), "b_serial", "mianqYKlGq");
        setField(term254393, term254393.getClass(), "place_id", "GmpbCvsoQd");
        setIntField(term254485, term254485.getClass(), "year", 2024);
        setShortField(term254485, term254485.getClass(), "month", (short) 9);
        setShortField(term254485, term254485.getClass(), "day", (short) 7);
        setField(term254484, term254484.getClass(), "date", term254485);
        setByteField(term254489, term254489.getClass(), "hour", (byte) 2);
        setByteField(term254489, term254489.getClass(), "minute", (byte) 37);
        setByteField(term254489, term254489.getClass(), "second", (byte) 4);
        setIntField(term254489, term254489.getClass(), "nano", 236043949);
        setField(term254484, term254484.getClass(), "time", term254489);
        setField(term254483, term254483.getClass(), "dateTime", term254484);
        setIntField(term254494, term254494.getClass(), "totalSeconds", -10800);
        setField(term254494, term254494.getClass(), "id", "-03:00");
        setField(term254483, term254483.getClass(), "offset", term254494);
        setField(term254504, term254504.getClass(), "id", "America/Recife");
        setLongElement(term254522, 0, -1767217224L);
        setField(term254521, term254521.getClass(), "standardTransitions", term254522);
        setElement(term254524, 1, term254494);
        setField(term254521, term254521.getClass(), "standardOffsets", term254524);
        setLongElement(term254525, 0, -1767217224L);
        setLongElement(term254525, 1, -1206957600L);
        setLongElement(term254525, 2, -1191362400L);
        setLongElement(term254525, 3, -1175374800L);
        setLongElement(term254525, 4, -1159826400L);
        setLongElement(term254525, 5, -633819600L);
        setLongElement(term254525, 6, -622069200L);
        setLongElement(term254525, 7, -602283600L);
        setLongElement(term254525, 8, -591832800L);
        setLongElement(term254525, 9, -570747600L);
        setLongElement(term254525, 10, -560210400L);
        setLongElement(term254525, 11, -539125200L);
        setLongElement(term254525, 12, -531352800L);
        setLongElement(term254525, 13, -191365200L);
        setLongElement(term254525, 14, -184197600L);
        setLongElement(term254525, 15, -155163600L);
        setLongElement(term254525, 16, -150069600L);
        setLongElement(term254525, 17, -128898000L);
        setLongElement(term254525, 18, -121125600L);
        setLongElement(term254525, 19, -99954000L);
        setLongElement(term254525, 20, -89589600L);
        setLongElement(term254525, 21, -68418000L);
        setLongElement(term254525, 22, -57967200L);
        setLongElement(term254525, 23, 499748400L);
        setLongElement(term254525, 24, 511236000L);
        setLongElement(term254525, 25, 530593200L);
        setLongElement(term254525, 26, 540266400L);
        setLongElement(term254525, 27, 562129200L);
        setLongElement(term254525, 28, 571197600L);
        setLongElement(term254525, 29, 592974000L);
        setLongElement(term254525, 30, 602042400L);
        setLongElement(term254525, 31, 624423600L);
        setLongElement(term254525, 32, 634701600L);
        setLongElement(term254525, 33, 938919600L);
        setLongElement(term254525, 34, 951616800L);
        setLongElement(term254525, 35, 970974000L);
        setLongElement(term254525, 36, 971575200L);
        setLongElement(term254525, 37, 1003028400L);
        setLongElement(term254525, 38, 1013911200L);
        setField(term254521, term254521.getClass(), "savingsInstantTransitions", term254525);
        setField(term254521, term254521.getClass(), "savingsLocalTransitions", term254565);
        setElement(term254566, 1, term254494);
        setElement(term254566, 3, term254494);
        setElement(term254566, 5, term254494);
        setElement(term254566, 7, term254494);
        setElement(term254566, 9, term254494);
        setElement(term254566, 11, term254494);
        setElement(term254566, 13, term254494);
        setElement(term254566, 15, term254494);
        setElement(term254566, 17, term254494);
        setElement(term254566, 19, term254494);
        setElement(term254566, 21, term254494);
        setElement(term254566, 23, term254494);
        setElement(term254566, 25, term254494);
        setElement(term254566, 27, term254494);
        setElement(term254566, 29, term254494);
        setElement(term254566, 31, term254494);
        setElement(term254566, 33, term254494);
        setElement(term254566, 35, term254494);
        setElement(term254566, 37, term254494);
        setElement(term254566, 39, term254494);
        setField(term254521, term254521.getClass(), "wallOffsets", term254566);
        setField(term254521, term254521.getClass(), "lastRules", term254567);
        setField(term254568, term254568.getClass(), "table", null);
        setField(term254568, term254568.getClass(), "nextTable", null);
        setLongField(term254568, term254568.getClass(), "baseCount", 0L);
        setIntField(term254568, term254568.getClass(), "sizeCtl", 0);
        setIntField(term254568, term254568.getClass(), "transferIndex", 0);
        setIntField(term254568, term254568.getClass(), "cellsBusy", 0);
        setField(term254568, term254568.getClass(), "counterCells", null);
        setField(term254568, term254568.getClass(), "keySet", null);
        setField(term254568, term254568.getClass(), "values", null);
        setField(term254568, term254568.getClass(), "entrySet", null);
        setField(term254568, term254568.getClass(), "keySet", null);
        setField(term254568, term254568.getClass(), "values", null);
        setField(term254521, term254521.getClass(), "lastRulesCache", term254568);
        setField(term254504, term254504.getClass(), "rules", term254521);
        setField(term254483, term254483.getClass(), "zone", term254504);
        setField(term254393, term254393.getClass(), "time_stamp", term254483);
        setField(term254393, term254393.getClass(), "start_up_mode", "ypYkYRcFQq");
        setField(term254393, term254393.getClass(), "cmm_dly_mod", "lXLLmOVwcF");
        setField(term254393, term254393.getClass(), "cmm_dly_sec", "lIrBbPBrDY");
        setField(term254393, term254393.getClass(), "cmm_err_mod", "RDqKYQTmEE");
        setField(term254393, term254393.getClass(), "country_code", "MrUUMyYAHK");
        setField(term254393, term254393.getClass(), "region_code", "mltJfFDGWB");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.ingame.BuyModuleRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPd_id", argTypes, term254393, args);
    }

};


