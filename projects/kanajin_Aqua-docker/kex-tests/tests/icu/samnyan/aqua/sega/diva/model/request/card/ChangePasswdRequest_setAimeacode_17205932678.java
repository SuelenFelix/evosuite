package icu.samnyan.aqua.sega.diva.model.request.card;

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
import static icu.samnyan.aqua.sega.diva.model.request.card.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ChangePasswdRequest_setAimeacode_17205932678 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4073;

    public ChangePasswdRequest_setAimeacode_17205932678() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4073 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.ChangePasswdRequest"));
        Object term4197 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term4198 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4199 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4203 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4208 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term4218 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term4235 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term4236 = (long[]) newLongArray(1);
        Object[] term4238 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term4239 = (long[]) newLongArray(39);
        Object[] term4279 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term4280 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term4281 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term4282 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term4073, term4073.getClass(), "a_code", "SdCKLMIYnX");
        setIntField(term4073, term4073.getClass(), "aime_id", 1135664017);
        setField(term4073, term4073.getClass(), "aime_a_code", "OJJtVNPyKZ");
        setIntField(term4073, term4073.getClass(), "pd_id", 590364439);
        setIntField(term4073, term4073.getClass(), "accept_idx", 865208305);
        setField(term4073, term4073.getClass(), "new_passwd", "AKNapTAfmD");
        setField(term4073, term4073.getClass(), "cmd", "xJgPlLxpgC");
        setField(term4073, term4073.getClass(), "req_id", "EYtfuJaxiM");
        setField(term4073, term4073.getClass(), "game_id", "gCWtLVKVVe");
        setField(term4073, term4073.getClass(), "r_ver", "fWKJoSoCwE");
        setField(term4073, term4073.getClass(), "kc_serial", "wfaXBpWAUH");
        setField(term4073, term4073.getClass(), "b_serial", "VMeAzAHwZj");
        setField(term4073, term4073.getClass(), "place_id", "PznxWXsZME");
        setIntField(term4199, term4199.getClass(), "year", 2029);
        setShortField(term4199, term4199.getClass(), "month", (short) 8);
        setShortField(term4199, term4199.getClass(), "day", (short) 29);
        setField(term4198, term4198.getClass(), "date", term4199);
        setByteField(term4203, term4203.getClass(), "hour", (byte) 15);
        setByteField(term4203, term4203.getClass(), "minute", (byte) 50);
        setByteField(term4203, term4203.getClass(), "second", (byte) 1);
        setIntField(term4203, term4203.getClass(), "nano", 277971904);
        setField(term4198, term4198.getClass(), "time", term4203);
        setField(term4197, term4197.getClass(), "dateTime", term4198);
        setIntField(term4208, term4208.getClass(), "totalSeconds", -10800);
        setField(term4208, term4208.getClass(), "id", "-03:00");
        setField(term4197, term4197.getClass(), "offset", term4208);
        setField(term4218, term4218.getClass(), "id", "America/Recife");
        setLongElement(term4236, 0, -1767217224L);
        setField(term4235, term4235.getClass(), "standardTransitions", term4236);
        setElement(term4238, 1, term4208);
        setField(term4235, term4235.getClass(), "standardOffsets", term4238);
        setLongElement(term4239, 0, -1767217224L);
        setLongElement(term4239, 1, -1206957600L);
        setLongElement(term4239, 2, -1191362400L);
        setLongElement(term4239, 3, -1175374800L);
        setLongElement(term4239, 4, -1159826400L);
        setLongElement(term4239, 5, -633819600L);
        setLongElement(term4239, 6, -622069200L);
        setLongElement(term4239, 7, -602283600L);
        setLongElement(term4239, 8, -591832800L);
        setLongElement(term4239, 9, -570747600L);
        setLongElement(term4239, 10, -560210400L);
        setLongElement(term4239, 11, -539125200L);
        setLongElement(term4239, 12, -531352800L);
        setLongElement(term4239, 13, -191365200L);
        setLongElement(term4239, 14, -184197600L);
        setLongElement(term4239, 15, -155163600L);
        setLongElement(term4239, 16, -150069600L);
        setLongElement(term4239, 17, -128898000L);
        setLongElement(term4239, 18, -121125600L);
        setLongElement(term4239, 19, -99954000L);
        setLongElement(term4239, 20, -89589600L);
        setLongElement(term4239, 21, -68418000L);
        setLongElement(term4239, 22, -57967200L);
        setLongElement(term4239, 23, 499748400L);
        setLongElement(term4239, 24, 511236000L);
        setLongElement(term4239, 25, 530593200L);
        setLongElement(term4239, 26, 540266400L);
        setLongElement(term4239, 27, 562129200L);
        setLongElement(term4239, 28, 571197600L);
        setLongElement(term4239, 29, 592974000L);
        setLongElement(term4239, 30, 602042400L);
        setLongElement(term4239, 31, 624423600L);
        setLongElement(term4239, 32, 634701600L);
        setLongElement(term4239, 33, 938919600L);
        setLongElement(term4239, 34, 951616800L);
        setLongElement(term4239, 35, 970974000L);
        setLongElement(term4239, 36, 971575200L);
        setLongElement(term4239, 37, 1003028400L);
        setLongElement(term4239, 38, 1013911200L);
        setField(term4235, term4235.getClass(), "savingsInstantTransitions", term4239);
        setField(term4235, term4235.getClass(), "savingsLocalTransitions", term4279);
        setElement(term4280, 1, term4208);
        setElement(term4280, 3, term4208);
        setElement(term4280, 5, term4208);
        setElement(term4280, 7, term4208);
        setElement(term4280, 9, term4208);
        setElement(term4280, 11, term4208);
        setElement(term4280, 13, term4208);
        setElement(term4280, 15, term4208);
        setElement(term4280, 17, term4208);
        setElement(term4280, 19, term4208);
        setElement(term4280, 21, term4208);
        setElement(term4280, 23, term4208);
        setElement(term4280, 25, term4208);
        setElement(term4280, 27, term4208);
        setElement(term4280, 29, term4208);
        setElement(term4280, 31, term4208);
        setElement(term4280, 33, term4208);
        setElement(term4280, 35, term4208);
        setElement(term4280, 37, term4208);
        setElement(term4280, 39, term4208);
        setField(term4235, term4235.getClass(), "wallOffsets", term4280);
        setField(term4235, term4235.getClass(), "lastRules", term4281);
        setField(term4282, term4282.getClass(), "table", null);
        setField(term4282, term4282.getClass(), "nextTable", null);
        setLongField(term4282, term4282.getClass(), "baseCount", 0L);
        setIntField(term4282, term4282.getClass(), "sizeCtl", 0);
        setIntField(term4282, term4282.getClass(), "transferIndex", 0);
        setIntField(term4282, term4282.getClass(), "cellsBusy", 0);
        setField(term4282, term4282.getClass(), "counterCells", null);
        setField(term4282, term4282.getClass(), "keySet", null);
        setField(term4282, term4282.getClass(), "values", null);
        setField(term4282, term4282.getClass(), "entrySet", null);
        setField(term4282, term4282.getClass(), "keySet", null);
        setField(term4282, term4282.getClass(), "values", null);
        setField(term4235, term4235.getClass(), "lastRulesCache", term4282);
        setField(term4218, term4218.getClass(), "rules", term4235);
        setField(term4197, term4197.getClass(), "zone", term4218);
        setField(term4073, term4073.getClass(), "time_stamp", term4197);
        setField(term4073, term4073.getClass(), "start_up_mode", "ZzIujlwVsw");
        setField(term4073, term4073.getClass(), "cmm_dly_mod", "LWyEaeIyAo");
        setField(term4073, term4073.getClass(), "cmm_dly_sec", "yVMkkQhvmN");
        setField(term4073, term4073.getClass(), "cmm_err_mod", "mvrkADEgpp");
        setField(term4073, term4073.getClass(), "country_code", "pXOkjyeIRb");
        setField(term4073, term4073.getClass(), "region_code", "GgZWSjxjyE");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.ChangePasswdRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "EeBVbzjcCI";
        callMethod(klass, "setAime_a_code", argTypes, term4073, args);
    }

};


