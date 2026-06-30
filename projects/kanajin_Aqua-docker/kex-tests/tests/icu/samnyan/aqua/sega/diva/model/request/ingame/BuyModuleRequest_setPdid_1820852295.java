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

public class BuyModuleRequest_setPdid_1820852295 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term256603;
     Object term256855;

    public BuyModuleRequest_setPdid_1820852295() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term256603 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.ingame.BuyModuleRequest"));
        Object term256693 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term256694 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term256695 = newInstance(Class.forName("java.time.LocalDate"));
        Object term256699 = newInstance(Class.forName("java.time.LocalTime"));
        Object term256704 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term256714 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term256731 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term256732 = (long[]) newLongArray(1);
        Object[] term256734 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term256735 = (long[]) newLongArray(39);
        Object[] term256775 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term256776 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term256777 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term256778 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setIntField(term256603, term256603.getClass(), "pd_id", 860464092);
        setIntField(term256603, term256603.getClass(), "accept_idx", 1341330547);
        setIntField(term256603, term256603.getClass(), "start_idx", 2126846445);
        setIntField(term256603, term256603.getClass(), "mdl_id", -2130794508);
        setIntField(term256603, term256603.getClass(), "mdl_price", 2142300888);
        setField(term256603, term256603.getClass(), "cmd", "IEbHsgLKBk");
        setField(term256603, term256603.getClass(), "req_id", "uFZktToTuS");
        setField(term256603, term256603.getClass(), "game_id", "pVpSARCHtf");
        setField(term256603, term256603.getClass(), "r_ver", "wnvCIiaAYo");
        setField(term256603, term256603.getClass(), "kc_serial", "waPCjDLHIu");
        setField(term256603, term256603.getClass(), "b_serial", "ziLgjZfcmc");
        setField(term256603, term256603.getClass(), "place_id", "NpOgFaCXxB");
        setIntField(term256695, term256695.getClass(), "year", 2029);
        setShortField(term256695, term256695.getClass(), "month", (short) 11);
        setShortField(term256695, term256695.getClass(), "day", (short) 6);
        setField(term256694, term256694.getClass(), "date", term256695);
        setByteField(term256699, term256699.getClass(), "hour", (byte) 2);
        setByteField(term256699, term256699.getClass(), "minute", (byte) 55);
        setByteField(term256699, term256699.getClass(), "second", (byte) 43);
        setIntField(term256699, term256699.getClass(), "nano", 109400580);
        setField(term256694, term256694.getClass(), "time", term256699);
        setField(term256693, term256693.getClass(), "dateTime", term256694);
        setIntField(term256704, term256704.getClass(), "totalSeconds", -10800);
        setField(term256704, term256704.getClass(), "id", "-03:00");
        setField(term256693, term256693.getClass(), "offset", term256704);
        setField(term256714, term256714.getClass(), "id", "America/Recife");
        setLongElement(term256732, 0, -1767217224L);
        setField(term256731, term256731.getClass(), "standardTransitions", term256732);
        setElement(term256734, 1, term256704);
        setField(term256731, term256731.getClass(), "standardOffsets", term256734);
        setLongElement(term256735, 0, -1767217224L);
        setLongElement(term256735, 1, -1206957600L);
        setLongElement(term256735, 2, -1191362400L);
        setLongElement(term256735, 3, -1175374800L);
        setLongElement(term256735, 4, -1159826400L);
        setLongElement(term256735, 5, -633819600L);
        setLongElement(term256735, 6, -622069200L);
        setLongElement(term256735, 7, -602283600L);
        setLongElement(term256735, 8, -591832800L);
        setLongElement(term256735, 9, -570747600L);
        setLongElement(term256735, 10, -560210400L);
        setLongElement(term256735, 11, -539125200L);
        setLongElement(term256735, 12, -531352800L);
        setLongElement(term256735, 13, -191365200L);
        setLongElement(term256735, 14, -184197600L);
        setLongElement(term256735, 15, -155163600L);
        setLongElement(term256735, 16, -150069600L);
        setLongElement(term256735, 17, -128898000L);
        setLongElement(term256735, 18, -121125600L);
        setLongElement(term256735, 19, -99954000L);
        setLongElement(term256735, 20, -89589600L);
        setLongElement(term256735, 21, -68418000L);
        setLongElement(term256735, 22, -57967200L);
        setLongElement(term256735, 23, 499748400L);
        setLongElement(term256735, 24, 511236000L);
        setLongElement(term256735, 25, 530593200L);
        setLongElement(term256735, 26, 540266400L);
        setLongElement(term256735, 27, 562129200L);
        setLongElement(term256735, 28, 571197600L);
        setLongElement(term256735, 29, 592974000L);
        setLongElement(term256735, 30, 602042400L);
        setLongElement(term256735, 31, 624423600L);
        setLongElement(term256735, 32, 634701600L);
        setLongElement(term256735, 33, 938919600L);
        setLongElement(term256735, 34, 951616800L);
        setLongElement(term256735, 35, 970974000L);
        setLongElement(term256735, 36, 971575200L);
        setLongElement(term256735, 37, 1003028400L);
        setLongElement(term256735, 38, 1013911200L);
        setField(term256731, term256731.getClass(), "savingsInstantTransitions", term256735);
        setField(term256731, term256731.getClass(), "savingsLocalTransitions", term256775);
        setElement(term256776, 1, term256704);
        setElement(term256776, 3, term256704);
        setElement(term256776, 5, term256704);
        setElement(term256776, 7, term256704);
        setElement(term256776, 9, term256704);
        setElement(term256776, 11, term256704);
        setElement(term256776, 13, term256704);
        setElement(term256776, 15, term256704);
        setElement(term256776, 17, term256704);
        setElement(term256776, 19, term256704);
        setElement(term256776, 21, term256704);
        setElement(term256776, 23, term256704);
        setElement(term256776, 25, term256704);
        setElement(term256776, 27, term256704);
        setElement(term256776, 29, term256704);
        setElement(term256776, 31, term256704);
        setElement(term256776, 33, term256704);
        setElement(term256776, 35, term256704);
        setElement(term256776, 37, term256704);
        setElement(term256776, 39, term256704);
        setField(term256731, term256731.getClass(), "wallOffsets", term256776);
        setField(term256731, term256731.getClass(), "lastRules", term256777);
        setField(term256778, term256778.getClass(), "table", null);
        setField(term256778, term256778.getClass(), "nextTable", null);
        setLongField(term256778, term256778.getClass(), "baseCount", 0L);
        setIntField(term256778, term256778.getClass(), "sizeCtl", 0);
        setIntField(term256778, term256778.getClass(), "transferIndex", 0);
        setIntField(term256778, term256778.getClass(), "cellsBusy", 0);
        setField(term256778, term256778.getClass(), "counterCells", null);
        setField(term256778, term256778.getClass(), "keySet", null);
        setField(term256778, term256778.getClass(), "values", null);
        setField(term256778, term256778.getClass(), "entrySet", null);
        setField(term256778, term256778.getClass(), "keySet", null);
        setField(term256778, term256778.getClass(), "values", null);
        setField(term256731, term256731.getClass(), "lastRulesCache", term256778);
        setField(term256714, term256714.getClass(), "rules", term256731);
        setField(term256693, term256693.getClass(), "zone", term256714);
        setField(term256603, term256603.getClass(), "time_stamp", term256693);
        setField(term256603, term256603.getClass(), "start_up_mode", "xAfHHeOBie");
        setField(term256603, term256603.getClass(), "cmm_dly_mod", "NTXawZXYgT");
        setField(term256603, term256603.getClass(), "cmm_dly_sec", "KrNHXyCftn");
        setField(term256603, term256603.getClass(), "cmm_err_mod", "qoZIehoMQV");
        setField(term256603, term256603.getClass(), "country_code", "mUjsuGJONY");
        setField(term256603, term256603.getClass(), "region_code", "GOumeOeOmE");
        term256855 = new Integer(644364981);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.ingame.BuyModuleRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term256855;
        callMethod(klass, "setPd_id", argTypes, term256603, args);
    }

};


