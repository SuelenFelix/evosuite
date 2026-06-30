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

public class BaseRequest_getRegioncode_95775704113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term254032;

    public BaseRequest_getRegioncode_95775704113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term254032 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.BaseRequest"));
        Object term254117 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term254118 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term254119 = newInstance(Class.forName("java.time.LocalDate"));
        Object term254123 = newInstance(Class.forName("java.time.LocalTime"));
        Object term254128 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term254138 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term254155 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term254156 = (long[]) newLongArray(1);
        Object[] term254158 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term254159 = (long[]) newLongArray(39);
        Object[] term254199 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term254200 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term254201 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term254202 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term254032, term254032.getClass(), "cmd", "hPPpARaLPc");
        setField(term254032, term254032.getClass(), "req_id", "DtBDapYLSe");
        setField(term254032, term254032.getClass(), "game_id", "PrJzEmEvlo");
        setField(term254032, term254032.getClass(), "r_ver", "DWGWVuqpug");
        setField(term254032, term254032.getClass(), "kc_serial", "MCSpZrEsbC");
        setField(term254032, term254032.getClass(), "b_serial", "HisKZVFThP");
        setField(term254032, term254032.getClass(), "place_id", "aYnflhXuDg");
        setIntField(term254119, term254119.getClass(), "year", 2018);
        setShortField(term254119, term254119.getClass(), "month", (short) 1);
        setShortField(term254119, term254119.getClass(), "day", (short) 29);
        setField(term254118, term254118.getClass(), "date", term254119);
        setByteField(term254123, term254123.getClass(), "hour", (byte) 22);
        setByteField(term254123, term254123.getClass(), "minute", (byte) 20);
        setByteField(term254123, term254123.getClass(), "second", (byte) 36);
        setIntField(term254123, term254123.getClass(), "nano", 74678080);
        setField(term254118, term254118.getClass(), "time", term254123);
        setField(term254117, term254117.getClass(), "dateTime", term254118);
        setIntField(term254128, term254128.getClass(), "totalSeconds", -10800);
        setField(term254128, term254128.getClass(), "id", "-03:00");
        setField(term254117, term254117.getClass(), "offset", term254128);
        setField(term254138, term254138.getClass(), "id", "America/Recife");
        setLongElement(term254156, 0, -1767217224L);
        setField(term254155, term254155.getClass(), "standardTransitions", term254156);
        setElement(term254158, 1, term254128);
        setField(term254155, term254155.getClass(), "standardOffsets", term254158);
        setLongElement(term254159, 0, -1767217224L);
        setLongElement(term254159, 1, -1206957600L);
        setLongElement(term254159, 2, -1191362400L);
        setLongElement(term254159, 3, -1175374800L);
        setLongElement(term254159, 4, -1159826400L);
        setLongElement(term254159, 5, -633819600L);
        setLongElement(term254159, 6, -622069200L);
        setLongElement(term254159, 7, -602283600L);
        setLongElement(term254159, 8, -591832800L);
        setLongElement(term254159, 9, -570747600L);
        setLongElement(term254159, 10, -560210400L);
        setLongElement(term254159, 11, -539125200L);
        setLongElement(term254159, 12, -531352800L);
        setLongElement(term254159, 13, -191365200L);
        setLongElement(term254159, 14, -184197600L);
        setLongElement(term254159, 15, -155163600L);
        setLongElement(term254159, 16, -150069600L);
        setLongElement(term254159, 17, -128898000L);
        setLongElement(term254159, 18, -121125600L);
        setLongElement(term254159, 19, -99954000L);
        setLongElement(term254159, 20, -89589600L);
        setLongElement(term254159, 21, -68418000L);
        setLongElement(term254159, 22, -57967200L);
        setLongElement(term254159, 23, 499748400L);
        setLongElement(term254159, 24, 511236000L);
        setLongElement(term254159, 25, 530593200L);
        setLongElement(term254159, 26, 540266400L);
        setLongElement(term254159, 27, 562129200L);
        setLongElement(term254159, 28, 571197600L);
        setLongElement(term254159, 29, 592974000L);
        setLongElement(term254159, 30, 602042400L);
        setLongElement(term254159, 31, 624423600L);
        setLongElement(term254159, 32, 634701600L);
        setLongElement(term254159, 33, 938919600L);
        setLongElement(term254159, 34, 951616800L);
        setLongElement(term254159, 35, 970974000L);
        setLongElement(term254159, 36, 971575200L);
        setLongElement(term254159, 37, 1003028400L);
        setLongElement(term254159, 38, 1013911200L);
        setField(term254155, term254155.getClass(), "savingsInstantTransitions", term254159);
        setField(term254155, term254155.getClass(), "savingsLocalTransitions", term254199);
        setElement(term254200, 1, term254128);
        setElement(term254200, 3, term254128);
        setElement(term254200, 5, term254128);
        setElement(term254200, 7, term254128);
        setElement(term254200, 9, term254128);
        setElement(term254200, 11, term254128);
        setElement(term254200, 13, term254128);
        setElement(term254200, 15, term254128);
        setElement(term254200, 17, term254128);
        setElement(term254200, 19, term254128);
        setElement(term254200, 21, term254128);
        setElement(term254200, 23, term254128);
        setElement(term254200, 25, term254128);
        setElement(term254200, 27, term254128);
        setElement(term254200, 29, term254128);
        setElement(term254200, 31, term254128);
        setElement(term254200, 33, term254128);
        setElement(term254200, 35, term254128);
        setElement(term254200, 37, term254128);
        setElement(term254200, 39, term254128);
        setField(term254155, term254155.getClass(), "wallOffsets", term254200);
        setField(term254155, term254155.getClass(), "lastRules", term254201);
        setField(term254202, term254202.getClass(), "table", null);
        setField(term254202, term254202.getClass(), "nextTable", null);
        setLongField(term254202, term254202.getClass(), "baseCount", 0L);
        setIntField(term254202, term254202.getClass(), "sizeCtl", 0);
        setIntField(term254202, term254202.getClass(), "transferIndex", 0);
        setIntField(term254202, term254202.getClass(), "cellsBusy", 0);
        setField(term254202, term254202.getClass(), "counterCells", null);
        setField(term254202, term254202.getClass(), "keySet", null);
        setField(term254202, term254202.getClass(), "values", null);
        setField(term254202, term254202.getClass(), "entrySet", null);
        setField(term254202, term254202.getClass(), "keySet", null);
        setField(term254202, term254202.getClass(), "values", null);
        setField(term254155, term254155.getClass(), "lastRulesCache", term254202);
        setField(term254138, term254138.getClass(), "rules", term254155);
        setField(term254117, term254117.getClass(), "zone", term254138);
        setField(term254032, term254032.getClass(), "time_stamp", term254117);
        setField(term254032, term254032.getClass(), "start_up_mode", "CfykLOhTuP");
        setField(term254032, term254032.getClass(), "cmm_dly_mod", "pGIHyjmseT");
        setField(term254032, term254032.getClass(), "cmm_dly_sec", "DFKfoJgHLx");
        setField(term254032, term254032.getClass(), "cmm_err_mod", "kbySPSiGhF");
        setField(term254032, term254032.getClass(), "country_code", "sKCjjNeVoI");
        setField(term254032, term254032.getClass(), "region_code", "HuoMsoUWrV");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.BaseRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRegion_code", argTypes, term254032, args);
    }

};


