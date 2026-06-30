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
import java.lang.Integer;

public class StartRequest_setAcceptidx_1841799153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8958;
     Object term9207;

    public StartRequest_setAcceptidx_1841799153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8958 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.user.StartRequest"));
        Object term9045 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term9046 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9047 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9051 = newInstance(Class.forName("java.time.LocalTime"));
        Object term9056 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term9066 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term9083 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term9084 = (long[]) newLongArray(1);
        Object[] term9086 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term9087 = (long[]) newLongArray(39);
        Object[] term9127 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term9128 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term9129 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term9130 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setIntField(term8958, term8958.getClass(), "pd_id", -919416536);
        setIntField(term8958, term8958.getClass(), "accept_idx", -43417861);
        setField(term8958, term8958.getClass(), "cmd", "NTlKJDDWlk");
        setField(term8958, term8958.getClass(), "req_id", "vOuMEpOQAg");
        setField(term8958, term8958.getClass(), "game_id", "SIODFGaQhr");
        setField(term8958, term8958.getClass(), "r_ver", "qYzsiuXOgS");
        setField(term8958, term8958.getClass(), "kc_serial", "bxrCBbrrct");
        setField(term8958, term8958.getClass(), "b_serial", "CKWpJaaaxX");
        setField(term8958, term8958.getClass(), "place_id", "UBRmXJmfrt");
        setIntField(term9047, term9047.getClass(), "year", 2020);
        setShortField(term9047, term9047.getClass(), "month", (short) 7);
        setShortField(term9047, term9047.getClass(), "day", (short) 24);
        setField(term9046, term9046.getClass(), "date", term9047);
        setByteField(term9051, term9051.getClass(), "hour", (byte) 0);
        setByteField(term9051, term9051.getClass(), "minute", (byte) 59);
        setByteField(term9051, term9051.getClass(), "second", (byte) 56);
        setIntField(term9051, term9051.getClass(), "nano", 320219201);
        setField(term9046, term9046.getClass(), "time", term9051);
        setField(term9045, term9045.getClass(), "dateTime", term9046);
        setIntField(term9056, term9056.getClass(), "totalSeconds", -10800);
        setField(term9056, term9056.getClass(), "id", "-03:00");
        setField(term9045, term9045.getClass(), "offset", term9056);
        setField(term9066, term9066.getClass(), "id", "America/Recife");
        setLongElement(term9084, 0, -1767217224L);
        setField(term9083, term9083.getClass(), "standardTransitions", term9084);
        setElement(term9086, 1, term9056);
        setField(term9083, term9083.getClass(), "standardOffsets", term9086);
        setLongElement(term9087, 0, -1767217224L);
        setLongElement(term9087, 1, -1206957600L);
        setLongElement(term9087, 2, -1191362400L);
        setLongElement(term9087, 3, -1175374800L);
        setLongElement(term9087, 4, -1159826400L);
        setLongElement(term9087, 5, -633819600L);
        setLongElement(term9087, 6, -622069200L);
        setLongElement(term9087, 7, -602283600L);
        setLongElement(term9087, 8, -591832800L);
        setLongElement(term9087, 9, -570747600L);
        setLongElement(term9087, 10, -560210400L);
        setLongElement(term9087, 11, -539125200L);
        setLongElement(term9087, 12, -531352800L);
        setLongElement(term9087, 13, -191365200L);
        setLongElement(term9087, 14, -184197600L);
        setLongElement(term9087, 15, -155163600L);
        setLongElement(term9087, 16, -150069600L);
        setLongElement(term9087, 17, -128898000L);
        setLongElement(term9087, 18, -121125600L);
        setLongElement(term9087, 19, -99954000L);
        setLongElement(term9087, 20, -89589600L);
        setLongElement(term9087, 21, -68418000L);
        setLongElement(term9087, 22, -57967200L);
        setLongElement(term9087, 23, 499748400L);
        setLongElement(term9087, 24, 511236000L);
        setLongElement(term9087, 25, 530593200L);
        setLongElement(term9087, 26, 540266400L);
        setLongElement(term9087, 27, 562129200L);
        setLongElement(term9087, 28, 571197600L);
        setLongElement(term9087, 29, 592974000L);
        setLongElement(term9087, 30, 602042400L);
        setLongElement(term9087, 31, 624423600L);
        setLongElement(term9087, 32, 634701600L);
        setLongElement(term9087, 33, 938919600L);
        setLongElement(term9087, 34, 951616800L);
        setLongElement(term9087, 35, 970974000L);
        setLongElement(term9087, 36, 971575200L);
        setLongElement(term9087, 37, 1003028400L);
        setLongElement(term9087, 38, 1013911200L);
        setField(term9083, term9083.getClass(), "savingsInstantTransitions", term9087);
        setField(term9083, term9083.getClass(), "savingsLocalTransitions", term9127);
        setElement(term9128, 1, term9056);
        setElement(term9128, 3, term9056);
        setElement(term9128, 5, term9056);
        setElement(term9128, 7, term9056);
        setElement(term9128, 9, term9056);
        setElement(term9128, 11, term9056);
        setElement(term9128, 13, term9056);
        setElement(term9128, 15, term9056);
        setElement(term9128, 17, term9056);
        setElement(term9128, 19, term9056);
        setElement(term9128, 21, term9056);
        setElement(term9128, 23, term9056);
        setElement(term9128, 25, term9056);
        setElement(term9128, 27, term9056);
        setElement(term9128, 29, term9056);
        setElement(term9128, 31, term9056);
        setElement(term9128, 33, term9056);
        setElement(term9128, 35, term9056);
        setElement(term9128, 37, term9056);
        setElement(term9128, 39, term9056);
        setField(term9083, term9083.getClass(), "wallOffsets", term9128);
        setField(term9083, term9083.getClass(), "lastRules", term9129);
        setField(term9130, term9130.getClass(), "table", null);
        setField(term9130, term9130.getClass(), "nextTable", null);
        setLongField(term9130, term9130.getClass(), "baseCount", 0L);
        setIntField(term9130, term9130.getClass(), "sizeCtl", 0);
        setIntField(term9130, term9130.getClass(), "transferIndex", 0);
        setIntField(term9130, term9130.getClass(), "cellsBusy", 0);
        setField(term9130, term9130.getClass(), "counterCells", null);
        setField(term9130, term9130.getClass(), "keySet", null);
        setField(term9130, term9130.getClass(), "values", null);
        setField(term9130, term9130.getClass(), "entrySet", null);
        setField(term9130, term9130.getClass(), "keySet", null);
        setField(term9130, term9130.getClass(), "values", null);
        setField(term9083, term9083.getClass(), "lastRulesCache", term9130);
        setField(term9066, term9066.getClass(), "rules", term9083);
        setField(term9045, term9045.getClass(), "zone", term9066);
        setField(term8958, term8958.getClass(), "time_stamp", term9045);
        setField(term8958, term8958.getClass(), "start_up_mode", "WZzvmIHhzZ");
        setField(term8958, term8958.getClass(), "cmm_dly_mod", "doQLHkjpNm");
        setField(term8958, term8958.getClass(), "cmm_dly_sec", "lCyLIcSuom");
        setField(term8958, term8958.getClass(), "cmm_err_mod", "CGOpQSZZwI");
        setField(term8958, term8958.getClass(), "country_code", "ypEdrstygY");
        setField(term8958, term8958.getClass(), "region_code", "sNQFlATEeQ");
        term9207 = new Integer(-1533843432);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.user.StartRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term9207;
        callMethod(klass, "setAccept_idx", argTypes, term8958, args);
    }

};


