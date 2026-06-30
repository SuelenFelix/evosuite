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

public class PdUnlockRequest_getAcceptidx_373128331 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6294;

    public PdUnlockRequest_getAcceptidx_373128331() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6294 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.user.PdUnlockRequest"));
        Object term6381 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term6382 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6383 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6387 = newInstance(Class.forName("java.time.LocalTime"));
        Object term6392 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term6402 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term6419 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term6420 = (long[]) newLongArray(1);
        Object[] term6422 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term6423 = (long[]) newLongArray(39);
        Object[] term6463 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term6464 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term6465 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term6466 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setIntField(term6294, term6294.getClass(), "pd_id", -129547140);
        setIntField(term6294, term6294.getClass(), "accept_idx", 199287428);
        setField(term6294, term6294.getClass(), "cmd", "DSNsTGYXDF");
        setField(term6294, term6294.getClass(), "req_id", "sQvGcVjdEx");
        setField(term6294, term6294.getClass(), "game_id", "rLHAoqXgPh");
        setField(term6294, term6294.getClass(), "r_ver", "zUlRdimJtU");
        setField(term6294, term6294.getClass(), "kc_serial", "vwbEQQNQrx");
        setField(term6294, term6294.getClass(), "b_serial", "xtftXXMbem");
        setField(term6294, term6294.getClass(), "place_id", "cudZvLMQon");
        setIntField(term6383, term6383.getClass(), "year", 2021);
        setShortField(term6383, term6383.getClass(), "month", (short) 9);
        setShortField(term6383, term6383.getClass(), "day", (short) 7);
        setField(term6382, term6382.getClass(), "date", term6383);
        setByteField(term6387, term6387.getClass(), "hour", (byte) 5);
        setByteField(term6387, term6387.getClass(), "minute", (byte) 25);
        setByteField(term6387, term6387.getClass(), "second", (byte) 7);
        setIntField(term6387, term6387.getClass(), "nano", 755924076);
        setField(term6382, term6382.getClass(), "time", term6387);
        setField(term6381, term6381.getClass(), "dateTime", term6382);
        setIntField(term6392, term6392.getClass(), "totalSeconds", -10800);
        setField(term6392, term6392.getClass(), "id", "-03:00");
        setField(term6381, term6381.getClass(), "offset", term6392);
        setField(term6402, term6402.getClass(), "id", "America/Recife");
        setLongElement(term6420, 0, -1767217224L);
        setField(term6419, term6419.getClass(), "standardTransitions", term6420);
        setElement(term6422, 1, term6392);
        setField(term6419, term6419.getClass(), "standardOffsets", term6422);
        setLongElement(term6423, 0, -1767217224L);
        setLongElement(term6423, 1, -1206957600L);
        setLongElement(term6423, 2, -1191362400L);
        setLongElement(term6423, 3, -1175374800L);
        setLongElement(term6423, 4, -1159826400L);
        setLongElement(term6423, 5, -633819600L);
        setLongElement(term6423, 6, -622069200L);
        setLongElement(term6423, 7, -602283600L);
        setLongElement(term6423, 8, -591832800L);
        setLongElement(term6423, 9, -570747600L);
        setLongElement(term6423, 10, -560210400L);
        setLongElement(term6423, 11, -539125200L);
        setLongElement(term6423, 12, -531352800L);
        setLongElement(term6423, 13, -191365200L);
        setLongElement(term6423, 14, -184197600L);
        setLongElement(term6423, 15, -155163600L);
        setLongElement(term6423, 16, -150069600L);
        setLongElement(term6423, 17, -128898000L);
        setLongElement(term6423, 18, -121125600L);
        setLongElement(term6423, 19, -99954000L);
        setLongElement(term6423, 20, -89589600L);
        setLongElement(term6423, 21, -68418000L);
        setLongElement(term6423, 22, -57967200L);
        setLongElement(term6423, 23, 499748400L);
        setLongElement(term6423, 24, 511236000L);
        setLongElement(term6423, 25, 530593200L);
        setLongElement(term6423, 26, 540266400L);
        setLongElement(term6423, 27, 562129200L);
        setLongElement(term6423, 28, 571197600L);
        setLongElement(term6423, 29, 592974000L);
        setLongElement(term6423, 30, 602042400L);
        setLongElement(term6423, 31, 624423600L);
        setLongElement(term6423, 32, 634701600L);
        setLongElement(term6423, 33, 938919600L);
        setLongElement(term6423, 34, 951616800L);
        setLongElement(term6423, 35, 970974000L);
        setLongElement(term6423, 36, 971575200L);
        setLongElement(term6423, 37, 1003028400L);
        setLongElement(term6423, 38, 1013911200L);
        setField(term6419, term6419.getClass(), "savingsInstantTransitions", term6423);
        setField(term6419, term6419.getClass(), "savingsLocalTransitions", term6463);
        setElement(term6464, 1, term6392);
        setElement(term6464, 3, term6392);
        setElement(term6464, 5, term6392);
        setElement(term6464, 7, term6392);
        setElement(term6464, 9, term6392);
        setElement(term6464, 11, term6392);
        setElement(term6464, 13, term6392);
        setElement(term6464, 15, term6392);
        setElement(term6464, 17, term6392);
        setElement(term6464, 19, term6392);
        setElement(term6464, 21, term6392);
        setElement(term6464, 23, term6392);
        setElement(term6464, 25, term6392);
        setElement(term6464, 27, term6392);
        setElement(term6464, 29, term6392);
        setElement(term6464, 31, term6392);
        setElement(term6464, 33, term6392);
        setElement(term6464, 35, term6392);
        setElement(term6464, 37, term6392);
        setElement(term6464, 39, term6392);
        setField(term6419, term6419.getClass(), "wallOffsets", term6464);
        setField(term6419, term6419.getClass(), "lastRules", term6465);
        setField(term6466, term6466.getClass(), "table", null);
        setField(term6466, term6466.getClass(), "nextTable", null);
        setLongField(term6466, term6466.getClass(), "baseCount", 0L);
        setIntField(term6466, term6466.getClass(), "sizeCtl", 0);
        setIntField(term6466, term6466.getClass(), "transferIndex", 0);
        setIntField(term6466, term6466.getClass(), "cellsBusy", 0);
        setField(term6466, term6466.getClass(), "counterCells", null);
        setField(term6466, term6466.getClass(), "keySet", null);
        setField(term6466, term6466.getClass(), "values", null);
        setField(term6466, term6466.getClass(), "entrySet", null);
        setField(term6466, term6466.getClass(), "keySet", null);
        setField(term6466, term6466.getClass(), "values", null);
        setField(term6419, term6419.getClass(), "lastRulesCache", term6466);
        setField(term6402, term6402.getClass(), "rules", term6419);
        setField(term6381, term6381.getClass(), "zone", term6402);
        setField(term6294, term6294.getClass(), "time_stamp", term6381);
        setField(term6294, term6294.getClass(), "start_up_mode", "lihXWlGDxk");
        setField(term6294, term6294.getClass(), "cmm_dly_mod", "JmcmxoGhIK");
        setField(term6294, term6294.getClass(), "cmm_dly_sec", "jXzmYyrnnT");
        setField(term6294, term6294.getClass(), "cmm_err_mod", "igCAtimmYB");
        setField(term6294, term6294.getClass(), "country_code", "DyiXbeYIaN");
        setField(term6294, term6294.getClass(), "region_code", "VGizxZnyHX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.user.PdUnlockRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAccept_idx", argTypes, term6294, args);
    }

};


