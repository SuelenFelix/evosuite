package icu.samnyan.aqua.sega.diva.model.request.user;

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
import static icu.samnyan.aqua.sega.diva.model.request.user.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class PreStartRequest_setAcode_137138626413 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17220;

    public PreStartRequest_setAcode_137138626413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17220 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.user.PreStartRequest"));
        Object term17391 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term17392 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term17393 = newInstance(Class.forName("java.time.LocalDate"));
        Object term17397 = newInstance(Class.forName("java.time.LocalTime"));
        Object term17402 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term17412 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term17429 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term17430 = (long[]) newLongArray(1);
        Object[] term17432 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term17433 = (long[]) newLongArray(39);
        Object[] term17473 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term17474 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term17475 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term17476 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term17220, term17220.getClass(), "pmm", "CAMnvfDLJL");
        setField(term17220, term17220.getClass(), "idm", "mfHtgSbdjD");
        setField(term17220, term17220.getClass(), "mmgameid", "cmuaUiHMVL");
        setField(term17220, term17220.getClass(), "mmuid", "xjoSGPWUgu");
        setField(term17220, term17220.getClass(), "a_code", "uzmqjnOUXu");
        setIntField(term17220, term17220.getClass(), "aime_id", 339372704);
        setField(term17220, term17220.getClass(), "aime_a_code", "xeyjTOCOJb");
        setField(term17220, term17220.getClass(), "key_obj_type", "DGRqjjdhzy");
        setBooleanField(term17220, term17220.getClass(), "exec_vu", true);
        setField(term17220, term17220.getClass(), "cmd", "lQFkjJUPAR");
        setField(term17220, term17220.getClass(), "req_id", "BsuVlGUUjV");
        setField(term17220, term17220.getClass(), "game_id", "bHHjfDCntT");
        setField(term17220, term17220.getClass(), "r_ver", "sEphiduvkv");
        setField(term17220, term17220.getClass(), "kc_serial", "PbLgCSAHce");
        setField(term17220, term17220.getClass(), "b_serial", "NWldOLAbqk");
        setField(term17220, term17220.getClass(), "place_id", "qnYaYSpDwO");
        setIntField(term17393, term17393.getClass(), "year", 2010);
        setShortField(term17393, term17393.getClass(), "month", (short) 6);
        setShortField(term17393, term17393.getClass(), "day", (short) 14);
        setField(term17392, term17392.getClass(), "date", term17393);
        setByteField(term17397, term17397.getClass(), "hour", (byte) 6);
        setByteField(term17397, term17397.getClass(), "minute", (byte) 22);
        setByteField(term17397, term17397.getClass(), "second", (byte) 20);
        setIntField(term17397, term17397.getClass(), "nano", 25133051);
        setField(term17392, term17392.getClass(), "time", term17397);
        setField(term17391, term17391.getClass(), "dateTime", term17392);
        setIntField(term17402, term17402.getClass(), "totalSeconds", -10800);
        setField(term17402, term17402.getClass(), "id", "-03:00");
        setField(term17391, term17391.getClass(), "offset", term17402);
        setField(term17412, term17412.getClass(), "id", "America/Recife");
        setLongElement(term17430, 0, -1767217224L);
        setField(term17429, term17429.getClass(), "standardTransitions", term17430);
        setElement(term17432, 1, term17402);
        setField(term17429, term17429.getClass(), "standardOffsets", term17432);
        setLongElement(term17433, 0, -1767217224L);
        setLongElement(term17433, 1, -1206957600L);
        setLongElement(term17433, 2, -1191362400L);
        setLongElement(term17433, 3, -1175374800L);
        setLongElement(term17433, 4, -1159826400L);
        setLongElement(term17433, 5, -633819600L);
        setLongElement(term17433, 6, -622069200L);
        setLongElement(term17433, 7, -602283600L);
        setLongElement(term17433, 8, -591832800L);
        setLongElement(term17433, 9, -570747600L);
        setLongElement(term17433, 10, -560210400L);
        setLongElement(term17433, 11, -539125200L);
        setLongElement(term17433, 12, -531352800L);
        setLongElement(term17433, 13, -191365200L);
        setLongElement(term17433, 14, -184197600L);
        setLongElement(term17433, 15, -155163600L);
        setLongElement(term17433, 16, -150069600L);
        setLongElement(term17433, 17, -128898000L);
        setLongElement(term17433, 18, -121125600L);
        setLongElement(term17433, 19, -99954000L);
        setLongElement(term17433, 20, -89589600L);
        setLongElement(term17433, 21, -68418000L);
        setLongElement(term17433, 22, -57967200L);
        setLongElement(term17433, 23, 499748400L);
        setLongElement(term17433, 24, 511236000L);
        setLongElement(term17433, 25, 530593200L);
        setLongElement(term17433, 26, 540266400L);
        setLongElement(term17433, 27, 562129200L);
        setLongElement(term17433, 28, 571197600L);
        setLongElement(term17433, 29, 592974000L);
        setLongElement(term17433, 30, 602042400L);
        setLongElement(term17433, 31, 624423600L);
        setLongElement(term17433, 32, 634701600L);
        setLongElement(term17433, 33, 938919600L);
        setLongElement(term17433, 34, 951616800L);
        setLongElement(term17433, 35, 970974000L);
        setLongElement(term17433, 36, 971575200L);
        setLongElement(term17433, 37, 1003028400L);
        setLongElement(term17433, 38, 1013911200L);
        setField(term17429, term17429.getClass(), "savingsInstantTransitions", term17433);
        setField(term17429, term17429.getClass(), "savingsLocalTransitions", term17473);
        setElement(term17474, 1, term17402);
        setElement(term17474, 3, term17402);
        setElement(term17474, 5, term17402);
        setElement(term17474, 7, term17402);
        setElement(term17474, 9, term17402);
        setElement(term17474, 11, term17402);
        setElement(term17474, 13, term17402);
        setElement(term17474, 15, term17402);
        setElement(term17474, 17, term17402);
        setElement(term17474, 19, term17402);
        setElement(term17474, 21, term17402);
        setElement(term17474, 23, term17402);
        setElement(term17474, 25, term17402);
        setElement(term17474, 27, term17402);
        setElement(term17474, 29, term17402);
        setElement(term17474, 31, term17402);
        setElement(term17474, 33, term17402);
        setElement(term17474, 35, term17402);
        setElement(term17474, 37, term17402);
        setElement(term17474, 39, term17402);
        setField(term17429, term17429.getClass(), "wallOffsets", term17474);
        setField(term17429, term17429.getClass(), "lastRules", term17475);
        setField(term17476, term17476.getClass(), "table", null);
        setField(term17476, term17476.getClass(), "nextTable", null);
        setLongField(term17476, term17476.getClass(), "baseCount", 0L);
        setIntField(term17476, term17476.getClass(), "sizeCtl", 0);
        setIntField(term17476, term17476.getClass(), "transferIndex", 0);
        setIntField(term17476, term17476.getClass(), "cellsBusy", 0);
        setField(term17476, term17476.getClass(), "counterCells", null);
        setField(term17476, term17476.getClass(), "keySet", null);
        setField(term17476, term17476.getClass(), "values", null);
        setField(term17476, term17476.getClass(), "entrySet", null);
        setField(term17476, term17476.getClass(), "keySet", null);
        setField(term17476, term17476.getClass(), "values", null);
        setField(term17429, term17429.getClass(), "lastRulesCache", term17476);
        setField(term17412, term17412.getClass(), "rules", term17429);
        setField(term17391, term17391.getClass(), "zone", term17412);
        setField(term17220, term17220.getClass(), "time_stamp", term17391);
        setField(term17220, term17220.getClass(), "start_up_mode", "dgbFDCdHtj");
        setField(term17220, term17220.getClass(), "cmm_dly_mod", "EKpdCBubDE");
        setField(term17220, term17220.getClass(), "cmm_dly_sec", "zMsSLTfGhl");
        setField(term17220, term17220.getClass(), "cmm_err_mod", "bEmHScVZaQ");
        setField(term17220, term17220.getClass(), "country_code", "TcuXODkzBV");
        setField(term17220, term17220.getClass(), "region_code", "coJPjrBZNe");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.user.PreStartRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "vMsWjuPTnO";
        callMethod(klass, "setA_code", argTypes, term17220, args);
    }

};


