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

public class PreStartRequest_setMmgameid_164563879411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15990;

    public PreStartRequest_setMmgameid_164563879411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15990 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.user.PreStartRequest"));
        Object term16161 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term16162 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term16163 = newInstance(Class.forName("java.time.LocalDate"));
        Object term16167 = newInstance(Class.forName("java.time.LocalTime"));
        Object term16172 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term16182 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term16199 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term16200 = (long[]) newLongArray(1);
        Object[] term16202 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term16203 = (long[]) newLongArray(39);
        Object[] term16243 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term16244 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term16245 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term16246 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term15990, term15990.getClass(), "pmm", "JWodNQzjjV");
        setField(term15990, term15990.getClass(), "idm", "CAgxWjhxNf");
        setField(term15990, term15990.getClass(), "mmgameid", "goAoCMhKBu");
        setField(term15990, term15990.getClass(), "mmuid", "BWxJSgKHRT");
        setField(term15990, term15990.getClass(), "a_code", "AGXoIndFnm");
        setIntField(term15990, term15990.getClass(), "aime_id", -1015274146);
        setField(term15990, term15990.getClass(), "aime_a_code", "mwmFMNEzkK");
        setField(term15990, term15990.getClass(), "key_obj_type", "kVAmKknVln");
        setBooleanField(term15990, term15990.getClass(), "exec_vu", true);
        setField(term15990, term15990.getClass(), "cmd", "MRFLbEGYKG");
        setField(term15990, term15990.getClass(), "req_id", "BYrGukTyof");
        setField(term15990, term15990.getClass(), "game_id", "jiCGTTzKGB");
        setField(term15990, term15990.getClass(), "r_ver", "MqICFYzDJj");
        setField(term15990, term15990.getClass(), "kc_serial", "YgQvdcBQKw");
        setField(term15990, term15990.getClass(), "b_serial", "FiYYLuailz");
        setField(term15990, term15990.getClass(), "place_id", "XebAeSnCKZ");
        setIntField(term16163, term16163.getClass(), "year", 2012);
        setShortField(term16163, term16163.getClass(), "month", (short) 8);
        setShortField(term16163, term16163.getClass(), "day", (short) 25);
        setField(term16162, term16162.getClass(), "date", term16163);
        setByteField(term16167, term16167.getClass(), "hour", (byte) 19);
        setByteField(term16167, term16167.getClass(), "minute", (byte) 49);
        setByteField(term16167, term16167.getClass(), "second", (byte) 8);
        setIntField(term16167, term16167.getClass(), "nano", 912685024);
        setField(term16162, term16162.getClass(), "time", term16167);
        setField(term16161, term16161.getClass(), "dateTime", term16162);
        setIntField(term16172, term16172.getClass(), "totalSeconds", -10800);
        setField(term16172, term16172.getClass(), "id", "-03:00");
        setField(term16161, term16161.getClass(), "offset", term16172);
        setField(term16182, term16182.getClass(), "id", "America/Recife");
        setLongElement(term16200, 0, -1767217224L);
        setField(term16199, term16199.getClass(), "standardTransitions", term16200);
        setElement(term16202, 1, term16172);
        setField(term16199, term16199.getClass(), "standardOffsets", term16202);
        setLongElement(term16203, 0, -1767217224L);
        setLongElement(term16203, 1, -1206957600L);
        setLongElement(term16203, 2, -1191362400L);
        setLongElement(term16203, 3, -1175374800L);
        setLongElement(term16203, 4, -1159826400L);
        setLongElement(term16203, 5, -633819600L);
        setLongElement(term16203, 6, -622069200L);
        setLongElement(term16203, 7, -602283600L);
        setLongElement(term16203, 8, -591832800L);
        setLongElement(term16203, 9, -570747600L);
        setLongElement(term16203, 10, -560210400L);
        setLongElement(term16203, 11, -539125200L);
        setLongElement(term16203, 12, -531352800L);
        setLongElement(term16203, 13, -191365200L);
        setLongElement(term16203, 14, -184197600L);
        setLongElement(term16203, 15, -155163600L);
        setLongElement(term16203, 16, -150069600L);
        setLongElement(term16203, 17, -128898000L);
        setLongElement(term16203, 18, -121125600L);
        setLongElement(term16203, 19, -99954000L);
        setLongElement(term16203, 20, -89589600L);
        setLongElement(term16203, 21, -68418000L);
        setLongElement(term16203, 22, -57967200L);
        setLongElement(term16203, 23, 499748400L);
        setLongElement(term16203, 24, 511236000L);
        setLongElement(term16203, 25, 530593200L);
        setLongElement(term16203, 26, 540266400L);
        setLongElement(term16203, 27, 562129200L);
        setLongElement(term16203, 28, 571197600L);
        setLongElement(term16203, 29, 592974000L);
        setLongElement(term16203, 30, 602042400L);
        setLongElement(term16203, 31, 624423600L);
        setLongElement(term16203, 32, 634701600L);
        setLongElement(term16203, 33, 938919600L);
        setLongElement(term16203, 34, 951616800L);
        setLongElement(term16203, 35, 970974000L);
        setLongElement(term16203, 36, 971575200L);
        setLongElement(term16203, 37, 1003028400L);
        setLongElement(term16203, 38, 1013911200L);
        setField(term16199, term16199.getClass(), "savingsInstantTransitions", term16203);
        setField(term16199, term16199.getClass(), "savingsLocalTransitions", term16243);
        setElement(term16244, 1, term16172);
        setElement(term16244, 3, term16172);
        setElement(term16244, 5, term16172);
        setElement(term16244, 7, term16172);
        setElement(term16244, 9, term16172);
        setElement(term16244, 11, term16172);
        setElement(term16244, 13, term16172);
        setElement(term16244, 15, term16172);
        setElement(term16244, 17, term16172);
        setElement(term16244, 19, term16172);
        setElement(term16244, 21, term16172);
        setElement(term16244, 23, term16172);
        setElement(term16244, 25, term16172);
        setElement(term16244, 27, term16172);
        setElement(term16244, 29, term16172);
        setElement(term16244, 31, term16172);
        setElement(term16244, 33, term16172);
        setElement(term16244, 35, term16172);
        setElement(term16244, 37, term16172);
        setElement(term16244, 39, term16172);
        setField(term16199, term16199.getClass(), "wallOffsets", term16244);
        setField(term16199, term16199.getClass(), "lastRules", term16245);
        setField(term16246, term16246.getClass(), "table", null);
        setField(term16246, term16246.getClass(), "nextTable", null);
        setLongField(term16246, term16246.getClass(), "baseCount", 0L);
        setIntField(term16246, term16246.getClass(), "sizeCtl", 0);
        setIntField(term16246, term16246.getClass(), "transferIndex", 0);
        setIntField(term16246, term16246.getClass(), "cellsBusy", 0);
        setField(term16246, term16246.getClass(), "counterCells", null);
        setField(term16246, term16246.getClass(), "keySet", null);
        setField(term16246, term16246.getClass(), "values", null);
        setField(term16246, term16246.getClass(), "entrySet", null);
        setField(term16246, term16246.getClass(), "keySet", null);
        setField(term16246, term16246.getClass(), "values", null);
        setField(term16199, term16199.getClass(), "lastRulesCache", term16246);
        setField(term16182, term16182.getClass(), "rules", term16199);
        setField(term16161, term16161.getClass(), "zone", term16182);
        setField(term15990, term15990.getClass(), "time_stamp", term16161);
        setField(term15990, term15990.getClass(), "start_up_mode", "GeddnXjHGy");
        setField(term15990, term15990.getClass(), "cmm_dly_mod", "vLTbaoAxBm");
        setField(term15990, term15990.getClass(), "cmm_dly_sec", "BXTjEyEZxD");
        setField(term15990, term15990.getClass(), "cmm_err_mod", "oKhVzOKUFW");
        setField(term15990, term15990.getClass(), "country_code", "mNHyqmOAFy");
        setField(term15990, term15990.getClass(), "region_code", "UxgSdhxPCH");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.user.PreStartRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "DAujxZPHJC";
        callMethod(klass, "setMmgameid", argTypes, term15990, args);
    }

};


