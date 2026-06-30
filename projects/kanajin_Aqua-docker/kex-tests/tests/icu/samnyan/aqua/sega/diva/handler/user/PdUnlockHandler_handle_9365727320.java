package icu.samnyan.aqua.sega.diva.handler.user;

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
import static icu.samnyan.aqua.sega.diva.handler.user.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class PdUnlockHandler_handle_9365727320 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9941;

    public PdUnlockHandler_handle_9365727320() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9941 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.user.PdUnlockRequest"));
        Object term10028 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term10029 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10030 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10034 = newInstance(Class.forName("java.time.LocalTime"));
        Object term10039 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term10049 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term10066 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term10067 = (long[]) newLongArray(1);
        Object[] term10069 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term10070 = (long[]) newLongArray(39);
        Object[] term10110 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term10111 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term10112 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term10113 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setIntField(term9941, term9941.getClass(), "pd_id", 865208305);
        setIntField(term9941, term9941.getClass(), "accept_idx", -1275173084);
        setField(term9941, term9941.getClass(), "cmd", "tShwQLRGNe");
        setField(term9941, term9941.getClass(), "req_id", "LvtrsXUliU");
        setField(term9941, term9941.getClass(), "game_id", "xLbjWUgOIL");
        setField(term9941, term9941.getClass(), "r_ver", "jDtqGUpnZN");
        setField(term9941, term9941.getClass(), "kc_serial", "nGKItKLYNC");
        setField(term9941, term9941.getClass(), "b_serial", "UiUYnPrcCi");
        setField(term9941, term9941.getClass(), "place_id", "UoYtihxVaS");
        setIntField(term10030, term10030.getClass(), "year", 2015);
        setShortField(term10030, term10030.getClass(), "month", (short) 4);
        setShortField(term10030, term10030.getClass(), "day", (short) 14);
        setField(term10029, term10029.getClass(), "date", term10030);
        setByteField(term10034, term10034.getClass(), "hour", (byte) 18);
        setByteField(term10034, term10034.getClass(), "minute", (byte) 24);
        setByteField(term10034, term10034.getClass(), "second", (byte) 32);
        setIntField(term10034, term10034.getClass(), "nano", 369233818);
        setField(term10029, term10029.getClass(), "time", term10034);
        setField(term10028, term10028.getClass(), "dateTime", term10029);
        setIntField(term10039, term10039.getClass(), "totalSeconds", -10800);
        setField(term10039, term10039.getClass(), "id", "-03:00");
        setField(term10028, term10028.getClass(), "offset", term10039);
        setField(term10049, term10049.getClass(), "id", "America/Recife");
        setLongElement(term10067, 0, -1767217224L);
        setField(term10066, term10066.getClass(), "standardTransitions", term10067);
        setElement(term10069, 1, term10039);
        setField(term10066, term10066.getClass(), "standardOffsets", term10069);
        setLongElement(term10070, 0, -1767217224L);
        setLongElement(term10070, 1, -1206957600L);
        setLongElement(term10070, 2, -1191362400L);
        setLongElement(term10070, 3, -1175374800L);
        setLongElement(term10070, 4, -1159826400L);
        setLongElement(term10070, 5, -633819600L);
        setLongElement(term10070, 6, -622069200L);
        setLongElement(term10070, 7, -602283600L);
        setLongElement(term10070, 8, -591832800L);
        setLongElement(term10070, 9, -570747600L);
        setLongElement(term10070, 10, -560210400L);
        setLongElement(term10070, 11, -539125200L);
        setLongElement(term10070, 12, -531352800L);
        setLongElement(term10070, 13, -191365200L);
        setLongElement(term10070, 14, -184197600L);
        setLongElement(term10070, 15, -155163600L);
        setLongElement(term10070, 16, -150069600L);
        setLongElement(term10070, 17, -128898000L);
        setLongElement(term10070, 18, -121125600L);
        setLongElement(term10070, 19, -99954000L);
        setLongElement(term10070, 20, -89589600L);
        setLongElement(term10070, 21, -68418000L);
        setLongElement(term10070, 22, -57967200L);
        setLongElement(term10070, 23, 499748400L);
        setLongElement(term10070, 24, 511236000L);
        setLongElement(term10070, 25, 530593200L);
        setLongElement(term10070, 26, 540266400L);
        setLongElement(term10070, 27, 562129200L);
        setLongElement(term10070, 28, 571197600L);
        setLongElement(term10070, 29, 592974000L);
        setLongElement(term10070, 30, 602042400L);
        setLongElement(term10070, 31, 624423600L);
        setLongElement(term10070, 32, 634701600L);
        setLongElement(term10070, 33, 938919600L);
        setLongElement(term10070, 34, 951616800L);
        setLongElement(term10070, 35, 970974000L);
        setLongElement(term10070, 36, 971575200L);
        setLongElement(term10070, 37, 1003028400L);
        setLongElement(term10070, 38, 1013911200L);
        setField(term10066, term10066.getClass(), "savingsInstantTransitions", term10070);
        setField(term10066, term10066.getClass(), "savingsLocalTransitions", term10110);
        setElement(term10111, 1, term10039);
        setElement(term10111, 3, term10039);
        setElement(term10111, 5, term10039);
        setElement(term10111, 7, term10039);
        setElement(term10111, 9, term10039);
        setElement(term10111, 11, term10039);
        setElement(term10111, 13, term10039);
        setElement(term10111, 15, term10039);
        setElement(term10111, 17, term10039);
        setElement(term10111, 19, term10039);
        setElement(term10111, 21, term10039);
        setElement(term10111, 23, term10039);
        setElement(term10111, 25, term10039);
        setElement(term10111, 27, term10039);
        setElement(term10111, 29, term10039);
        setElement(term10111, 31, term10039);
        setElement(term10111, 33, term10039);
        setElement(term10111, 35, term10039);
        setElement(term10111, 37, term10039);
        setElement(term10111, 39, term10039);
        setField(term10066, term10066.getClass(), "wallOffsets", term10111);
        setField(term10066, term10066.getClass(), "lastRules", term10112);
        setField(term10113, term10113.getClass(), "table", null);
        setField(term10113, term10113.getClass(), "nextTable", null);
        setLongField(term10113, term10113.getClass(), "baseCount", 0L);
        setIntField(term10113, term10113.getClass(), "sizeCtl", 0);
        setIntField(term10113, term10113.getClass(), "transferIndex", 0);
        setIntField(term10113, term10113.getClass(), "cellsBusy", 0);
        setField(term10113, term10113.getClass(), "counterCells", null);
        setField(term10113, term10113.getClass(), "keySet", null);
        setField(term10113, term10113.getClass(), "values", null);
        setField(term10113, term10113.getClass(), "entrySet", null);
        setField(term10113, term10113.getClass(), "keySet", null);
        setField(term10113, term10113.getClass(), "values", null);
        setField(term10066, term10066.getClass(), "lastRulesCache", term10113);
        setField(term10049, term10049.getClass(), "rules", term10066);
        setField(term10028, term10028.getClass(), "zone", term10049);
        setField(term9941, term9941.getClass(), "time_stamp", term10028);
        setField(term9941, term9941.getClass(), "start_up_mode", "JDswTTCZHV");
        setField(term9941, term9941.getClass(), "cmm_dly_mod", "onpbIeEKoi");
        setField(term9941, term9941.getClass(), "cmm_dly_sec", "YRHGsAkhxb");
        setField(term9941, term9941.getClass(), "cmm_err_mod", "ffYhPOzlUs");
        setField(term9941, term9941.getClass(), "country_code", "MLqYREekMl");
        setField(term9941, term9941.getClass(), "region_code", "ytSBIKXogI");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.handler.user.PdUnlockHandler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.diva.model.request.user.PdUnlockRequest");
        Object[] args = new Object[1];
        args[0] = term9941;
        callMethod(klass, "handle", argTypes, null, args);
    }

};


