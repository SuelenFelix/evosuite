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
import java.lang.Integer;

public class ChangePasswdRequest_setAcceptidx_191872440210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5109;
     Object term5395;

    public ChangePasswdRequest_setAcceptidx_191872440210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5109 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.ChangePasswdRequest"));
        Object term5233 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term5234 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5235 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5239 = newInstance(Class.forName("java.time.LocalTime"));
        Object term5244 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term5254 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term5271 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term5272 = (long[]) newLongArray(1);
        Object[] term5274 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term5275 = (long[]) newLongArray(39);
        Object[] term5315 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term5316 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term5317 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term5318 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term5109, term5109.getClass(), "a_code", "BRIVNtfUWU");
        setIntField(term5109, term5109.getClass(), "aime_id", -73683645);
        setField(term5109, term5109.getClass(), "aime_a_code", "DbiCVtPPCT");
        setIntField(term5109, term5109.getClass(), "pd_id", -226514366);
        setIntField(term5109, term5109.getClass(), "accept_idx", 1193880199);
        setField(term5109, term5109.getClass(), "new_passwd", "WzFopsaDuG");
        setField(term5109, term5109.getClass(), "cmd", "PapWxkhEWe");
        setField(term5109, term5109.getClass(), "req_id", "smnHEqRFRx");
        setField(term5109, term5109.getClass(), "game_id", "XYtryyobou");
        setField(term5109, term5109.getClass(), "r_ver", "OYbzXylRWW");
        setField(term5109, term5109.getClass(), "kc_serial", "DSNsTGYXDF");
        setField(term5109, term5109.getClass(), "b_serial", "sQvGcVjdEx");
        setField(term5109, term5109.getClass(), "place_id", "rLHAoqXgPh");
        setIntField(term5235, term5235.getClass(), "year", 2019);
        setShortField(term5235, term5235.getClass(), "month", (short) 2);
        setShortField(term5235, term5235.getClass(), "day", (short) 21);
        setField(term5234, term5234.getClass(), "date", term5235);
        setByteField(term5239, term5239.getClass(), "hour", (byte) 5);
        setByteField(term5239, term5239.getClass(), "minute", (byte) 41);
        setByteField(term5239, term5239.getClass(), "second", (byte) 11);
        setIntField(term5239, term5239.getClass(), "nano", 859829782);
        setField(term5234, term5234.getClass(), "time", term5239);
        setField(term5233, term5233.getClass(), "dateTime", term5234);
        setIntField(term5244, term5244.getClass(), "totalSeconds", -10800);
        setField(term5244, term5244.getClass(), "id", "-03:00");
        setField(term5233, term5233.getClass(), "offset", term5244);
        setField(term5254, term5254.getClass(), "id", "America/Recife");
        setLongElement(term5272, 0, -1767217224L);
        setField(term5271, term5271.getClass(), "standardTransitions", term5272);
        setElement(term5274, 1, term5244);
        setField(term5271, term5271.getClass(), "standardOffsets", term5274);
        setLongElement(term5275, 0, -1767217224L);
        setLongElement(term5275, 1, -1206957600L);
        setLongElement(term5275, 2, -1191362400L);
        setLongElement(term5275, 3, -1175374800L);
        setLongElement(term5275, 4, -1159826400L);
        setLongElement(term5275, 5, -633819600L);
        setLongElement(term5275, 6, -622069200L);
        setLongElement(term5275, 7, -602283600L);
        setLongElement(term5275, 8, -591832800L);
        setLongElement(term5275, 9, -570747600L);
        setLongElement(term5275, 10, -560210400L);
        setLongElement(term5275, 11, -539125200L);
        setLongElement(term5275, 12, -531352800L);
        setLongElement(term5275, 13, -191365200L);
        setLongElement(term5275, 14, -184197600L);
        setLongElement(term5275, 15, -155163600L);
        setLongElement(term5275, 16, -150069600L);
        setLongElement(term5275, 17, -128898000L);
        setLongElement(term5275, 18, -121125600L);
        setLongElement(term5275, 19, -99954000L);
        setLongElement(term5275, 20, -89589600L);
        setLongElement(term5275, 21, -68418000L);
        setLongElement(term5275, 22, -57967200L);
        setLongElement(term5275, 23, 499748400L);
        setLongElement(term5275, 24, 511236000L);
        setLongElement(term5275, 25, 530593200L);
        setLongElement(term5275, 26, 540266400L);
        setLongElement(term5275, 27, 562129200L);
        setLongElement(term5275, 28, 571197600L);
        setLongElement(term5275, 29, 592974000L);
        setLongElement(term5275, 30, 602042400L);
        setLongElement(term5275, 31, 624423600L);
        setLongElement(term5275, 32, 634701600L);
        setLongElement(term5275, 33, 938919600L);
        setLongElement(term5275, 34, 951616800L);
        setLongElement(term5275, 35, 970974000L);
        setLongElement(term5275, 36, 971575200L);
        setLongElement(term5275, 37, 1003028400L);
        setLongElement(term5275, 38, 1013911200L);
        setField(term5271, term5271.getClass(), "savingsInstantTransitions", term5275);
        setField(term5271, term5271.getClass(), "savingsLocalTransitions", term5315);
        setElement(term5316, 1, term5244);
        setElement(term5316, 3, term5244);
        setElement(term5316, 5, term5244);
        setElement(term5316, 7, term5244);
        setElement(term5316, 9, term5244);
        setElement(term5316, 11, term5244);
        setElement(term5316, 13, term5244);
        setElement(term5316, 15, term5244);
        setElement(term5316, 17, term5244);
        setElement(term5316, 19, term5244);
        setElement(term5316, 21, term5244);
        setElement(term5316, 23, term5244);
        setElement(term5316, 25, term5244);
        setElement(term5316, 27, term5244);
        setElement(term5316, 29, term5244);
        setElement(term5316, 31, term5244);
        setElement(term5316, 33, term5244);
        setElement(term5316, 35, term5244);
        setElement(term5316, 37, term5244);
        setElement(term5316, 39, term5244);
        setField(term5271, term5271.getClass(), "wallOffsets", term5316);
        setField(term5271, term5271.getClass(), "lastRules", term5317);
        setField(term5318, term5318.getClass(), "table", null);
        setField(term5318, term5318.getClass(), "nextTable", null);
        setLongField(term5318, term5318.getClass(), "baseCount", 0L);
        setIntField(term5318, term5318.getClass(), "sizeCtl", 0);
        setIntField(term5318, term5318.getClass(), "transferIndex", 0);
        setIntField(term5318, term5318.getClass(), "cellsBusy", 0);
        setField(term5318, term5318.getClass(), "counterCells", null);
        setField(term5318, term5318.getClass(), "keySet", null);
        setField(term5318, term5318.getClass(), "values", null);
        setField(term5318, term5318.getClass(), "entrySet", null);
        setField(term5318, term5318.getClass(), "keySet", null);
        setField(term5318, term5318.getClass(), "values", null);
        setField(term5271, term5271.getClass(), "lastRulesCache", term5318);
        setField(term5254, term5254.getClass(), "rules", term5271);
        setField(term5233, term5233.getClass(), "zone", term5254);
        setField(term5109, term5109.getClass(), "time_stamp", term5233);
        setField(term5109, term5109.getClass(), "start_up_mode", "zUlRdimJtU");
        setField(term5109, term5109.getClass(), "cmm_dly_mod", "vwbEQQNQrx");
        setField(term5109, term5109.getClass(), "cmm_dly_sec", "xtftXXMbem");
        setField(term5109, term5109.getClass(), "cmm_err_mod", "cudZvLMQon");
        setField(term5109, term5109.getClass(), "country_code", "lihXWlGDxk");
        setField(term5109, term5109.getClass(), "region_code", "JmcmxoGhIK");
        term5395 = new Integer(-1087774327);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.ChangePasswdRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term5395;
        callMethod(klass, "setAccept_idx", argTypes, term5109, args);
    }

};


