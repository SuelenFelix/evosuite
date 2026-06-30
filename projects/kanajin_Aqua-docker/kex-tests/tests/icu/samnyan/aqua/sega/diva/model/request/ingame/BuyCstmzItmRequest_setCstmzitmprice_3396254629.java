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
import java.lang.Integer;

public class BuyCstmzItmRequest_setCstmzitmprice_3396254629 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term277103;
     Object term277355;

    public BuyCstmzItmRequest_setCstmzitmprice_3396254629() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term277103 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.ingame.BuyCstmzItmRequest"));
        Object term277193 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term277194 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term277195 = newInstance(Class.forName("java.time.LocalDate"));
        Object term277199 = newInstance(Class.forName("java.time.LocalTime"));
        Object term277204 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term277214 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term277231 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term277232 = (long[]) newLongArray(1);
        Object[] term277234 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term277235 = (long[]) newLongArray(39);
        Object[] term277275 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term277276 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term277277 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term277278 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setIntField(term277103, term277103.getClass(), "pd_id", 1466917658);
        setIntField(term277103, term277103.getClass(), "accept_idx", -1845698282);
        setIntField(term277103, term277103.getClass(), "start_idx", -1555804191);
        setIntField(term277103, term277103.getClass(), "cstmz_itm_id", 1301082117);
        setIntField(term277103, term277103.getClass(), "cstmz_itm_price", -1716182562);
        setField(term277103, term277103.getClass(), "cmd", "hYyOXAATCh");
        setField(term277103, term277103.getClass(), "req_id", "UbvbXQRnLW");
        setField(term277103, term277103.getClass(), "game_id", "CkIbQCWOgW");
        setField(term277103, term277103.getClass(), "r_ver", "JWaRuPqymE");
        setField(term277103, term277103.getClass(), "kc_serial", "nTasTwGyTu");
        setField(term277103, term277103.getClass(), "b_serial", "qRRPimcPhW");
        setField(term277103, term277103.getClass(), "place_id", "vhGXukwBWg");
        setIntField(term277195, term277195.getClass(), "year", 2028);
        setShortField(term277195, term277195.getClass(), "month", (short) 11);
        setShortField(term277195, term277195.getClass(), "day", (short) 28);
        setField(term277194, term277194.getClass(), "date", term277195);
        setByteField(term277199, term277199.getClass(), "hour", (byte) 4);
        setByteField(term277199, term277199.getClass(), "minute", (byte) 25);
        setByteField(term277199, term277199.getClass(), "second", (byte) 12);
        setIntField(term277199, term277199.getClass(), "nano", 726554360);
        setField(term277194, term277194.getClass(), "time", term277199);
        setField(term277193, term277193.getClass(), "dateTime", term277194);
        setIntField(term277204, term277204.getClass(), "totalSeconds", -10800);
        setField(term277204, term277204.getClass(), "id", "-03:00");
        setField(term277193, term277193.getClass(), "offset", term277204);
        setField(term277214, term277214.getClass(), "id", "America/Recife");
        setLongElement(term277232, 0, -1767217224L);
        setField(term277231, term277231.getClass(), "standardTransitions", term277232);
        setElement(term277234, 1, term277204);
        setField(term277231, term277231.getClass(), "standardOffsets", term277234);
        setLongElement(term277235, 0, -1767217224L);
        setLongElement(term277235, 1, -1206957600L);
        setLongElement(term277235, 2, -1191362400L);
        setLongElement(term277235, 3, -1175374800L);
        setLongElement(term277235, 4, -1159826400L);
        setLongElement(term277235, 5, -633819600L);
        setLongElement(term277235, 6, -622069200L);
        setLongElement(term277235, 7, -602283600L);
        setLongElement(term277235, 8, -591832800L);
        setLongElement(term277235, 9, -570747600L);
        setLongElement(term277235, 10, -560210400L);
        setLongElement(term277235, 11, -539125200L);
        setLongElement(term277235, 12, -531352800L);
        setLongElement(term277235, 13, -191365200L);
        setLongElement(term277235, 14, -184197600L);
        setLongElement(term277235, 15, -155163600L);
        setLongElement(term277235, 16, -150069600L);
        setLongElement(term277235, 17, -128898000L);
        setLongElement(term277235, 18, -121125600L);
        setLongElement(term277235, 19, -99954000L);
        setLongElement(term277235, 20, -89589600L);
        setLongElement(term277235, 21, -68418000L);
        setLongElement(term277235, 22, -57967200L);
        setLongElement(term277235, 23, 499748400L);
        setLongElement(term277235, 24, 511236000L);
        setLongElement(term277235, 25, 530593200L);
        setLongElement(term277235, 26, 540266400L);
        setLongElement(term277235, 27, 562129200L);
        setLongElement(term277235, 28, 571197600L);
        setLongElement(term277235, 29, 592974000L);
        setLongElement(term277235, 30, 602042400L);
        setLongElement(term277235, 31, 624423600L);
        setLongElement(term277235, 32, 634701600L);
        setLongElement(term277235, 33, 938919600L);
        setLongElement(term277235, 34, 951616800L);
        setLongElement(term277235, 35, 970974000L);
        setLongElement(term277235, 36, 971575200L);
        setLongElement(term277235, 37, 1003028400L);
        setLongElement(term277235, 38, 1013911200L);
        setField(term277231, term277231.getClass(), "savingsInstantTransitions", term277235);
        setField(term277231, term277231.getClass(), "savingsLocalTransitions", term277275);
        setElement(term277276, 1, term277204);
        setElement(term277276, 3, term277204);
        setElement(term277276, 5, term277204);
        setElement(term277276, 7, term277204);
        setElement(term277276, 9, term277204);
        setElement(term277276, 11, term277204);
        setElement(term277276, 13, term277204);
        setElement(term277276, 15, term277204);
        setElement(term277276, 17, term277204);
        setElement(term277276, 19, term277204);
        setElement(term277276, 21, term277204);
        setElement(term277276, 23, term277204);
        setElement(term277276, 25, term277204);
        setElement(term277276, 27, term277204);
        setElement(term277276, 29, term277204);
        setElement(term277276, 31, term277204);
        setElement(term277276, 33, term277204);
        setElement(term277276, 35, term277204);
        setElement(term277276, 37, term277204);
        setElement(term277276, 39, term277204);
        setField(term277231, term277231.getClass(), "wallOffsets", term277276);
        setField(term277231, term277231.getClass(), "lastRules", term277277);
        setField(term277278, term277278.getClass(), "table", null);
        setField(term277278, term277278.getClass(), "nextTable", null);
        setLongField(term277278, term277278.getClass(), "baseCount", 0L);
        setIntField(term277278, term277278.getClass(), "sizeCtl", 0);
        setIntField(term277278, term277278.getClass(), "transferIndex", 0);
        setIntField(term277278, term277278.getClass(), "cellsBusy", 0);
        setField(term277278, term277278.getClass(), "counterCells", null);
        setField(term277278, term277278.getClass(), "keySet", null);
        setField(term277278, term277278.getClass(), "values", null);
        setField(term277278, term277278.getClass(), "entrySet", null);
        setField(term277278, term277278.getClass(), "keySet", null);
        setField(term277278, term277278.getClass(), "values", null);
        setField(term277231, term277231.getClass(), "lastRulesCache", term277278);
        setField(term277214, term277214.getClass(), "rules", term277231);
        setField(term277193, term277193.getClass(), "zone", term277214);
        setField(term277103, term277103.getClass(), "time_stamp", term277193);
        setField(term277103, term277103.getClass(), "start_up_mode", "JahleHixdz");
        setField(term277103, term277103.getClass(), "cmm_dly_mod", "rnkTocCEbH");
        setField(term277103, term277103.getClass(), "cmm_dly_sec", "wsDKWECjHf");
        setField(term277103, term277103.getClass(), "cmm_err_mod", "FBPRmfNDEr");
        setField(term277103, term277103.getClass(), "country_code", "qOEJpzrzgF");
        setField(term277103, term277103.getClass(), "region_code", "ExvDwmtNdV");
        term277355 = new Integer(-970317861);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.ingame.BuyCstmzItmRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term277355;
        callMethod(klass, "setCstmz_itm_price", argTypes, term277103, args);
    }

};


