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

public class CardProcedureRequest_getAcode_18134741411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19924;

    public CardProcedureRequest_getAcode_18134741411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19924 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.CardProcedureRequest"));
        Object term20035 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term20036 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term20037 = newInstance(Class.forName("java.time.LocalDate"));
        Object term20041 = newInstance(Class.forName("java.time.LocalTime"));
        Object term20046 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term20056 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term20073 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term20074 = (long[]) newLongArray(1);
        Object[] term20076 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term20077 = (long[]) newLongArray(39);
        Object[] term20117 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term20118 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term20119 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term20120 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setIntField(term19924, term19924.getClass(), "cd_adm_cmd", -1588772968);
        setField(term19924, term19924.getClass(), "a_code", "ATSXJPySio");
        setIntField(term19924, term19924.getClass(), "aime_id", -93135961);
        setField(term19924, term19924.getClass(), "aime_a_code", "XZkOUcbfFg");
        setField(term19924, term19924.getClass(), "cmd", "TGiJfagfky");
        setField(term19924, term19924.getClass(), "req_id", "BJklinBmhN");
        setField(term19924, term19924.getClass(), "game_id", "IOddzvEWcl");
        setField(term19924, term19924.getClass(), "r_ver", "bIrtpkYJWT");
        setField(term19924, term19924.getClass(), "kc_serial", "VuLLXpvPpZ");
        setField(term19924, term19924.getClass(), "b_serial", "UEdzEKEEEV");
        setField(term19924, term19924.getClass(), "place_id", "BcENaQFYSd");
        setIntField(term20037, term20037.getClass(), "year", 2010);
        setShortField(term20037, term20037.getClass(), "month", (short) 6);
        setShortField(term20037, term20037.getClass(), "day", (short) 14);
        setField(term20036, term20036.getClass(), "date", term20037);
        setByteField(term20041, term20041.getClass(), "hour", (byte) 6);
        setByteField(term20041, term20041.getClass(), "minute", (byte) 22);
        setByteField(term20041, term20041.getClass(), "second", (byte) 20);
        setIntField(term20041, term20041.getClass(), "nano", 25133051);
        setField(term20036, term20036.getClass(), "time", term20041);
        setField(term20035, term20035.getClass(), "dateTime", term20036);
        setIntField(term20046, term20046.getClass(), "totalSeconds", -10800);
        setField(term20046, term20046.getClass(), "id", "-03:00");
        setField(term20035, term20035.getClass(), "offset", term20046);
        setField(term20056, term20056.getClass(), "id", "America/Recife");
        setLongElement(term20074, 0, -1767217224L);
        setField(term20073, term20073.getClass(), "standardTransitions", term20074);
        setElement(term20076, 1, term20046);
        setField(term20073, term20073.getClass(), "standardOffsets", term20076);
        setLongElement(term20077, 0, -1767217224L);
        setLongElement(term20077, 1, -1206957600L);
        setLongElement(term20077, 2, -1191362400L);
        setLongElement(term20077, 3, -1175374800L);
        setLongElement(term20077, 4, -1159826400L);
        setLongElement(term20077, 5, -633819600L);
        setLongElement(term20077, 6, -622069200L);
        setLongElement(term20077, 7, -602283600L);
        setLongElement(term20077, 8, -591832800L);
        setLongElement(term20077, 9, -570747600L);
        setLongElement(term20077, 10, -560210400L);
        setLongElement(term20077, 11, -539125200L);
        setLongElement(term20077, 12, -531352800L);
        setLongElement(term20077, 13, -191365200L);
        setLongElement(term20077, 14, -184197600L);
        setLongElement(term20077, 15, -155163600L);
        setLongElement(term20077, 16, -150069600L);
        setLongElement(term20077, 17, -128898000L);
        setLongElement(term20077, 18, -121125600L);
        setLongElement(term20077, 19, -99954000L);
        setLongElement(term20077, 20, -89589600L);
        setLongElement(term20077, 21, -68418000L);
        setLongElement(term20077, 22, -57967200L);
        setLongElement(term20077, 23, 499748400L);
        setLongElement(term20077, 24, 511236000L);
        setLongElement(term20077, 25, 530593200L);
        setLongElement(term20077, 26, 540266400L);
        setLongElement(term20077, 27, 562129200L);
        setLongElement(term20077, 28, 571197600L);
        setLongElement(term20077, 29, 592974000L);
        setLongElement(term20077, 30, 602042400L);
        setLongElement(term20077, 31, 624423600L);
        setLongElement(term20077, 32, 634701600L);
        setLongElement(term20077, 33, 938919600L);
        setLongElement(term20077, 34, 951616800L);
        setLongElement(term20077, 35, 970974000L);
        setLongElement(term20077, 36, 971575200L);
        setLongElement(term20077, 37, 1003028400L);
        setLongElement(term20077, 38, 1013911200L);
        setField(term20073, term20073.getClass(), "savingsInstantTransitions", term20077);
        setField(term20073, term20073.getClass(), "savingsLocalTransitions", term20117);
        setElement(term20118, 1, term20046);
        setElement(term20118, 3, term20046);
        setElement(term20118, 5, term20046);
        setElement(term20118, 7, term20046);
        setElement(term20118, 9, term20046);
        setElement(term20118, 11, term20046);
        setElement(term20118, 13, term20046);
        setElement(term20118, 15, term20046);
        setElement(term20118, 17, term20046);
        setElement(term20118, 19, term20046);
        setElement(term20118, 21, term20046);
        setElement(term20118, 23, term20046);
        setElement(term20118, 25, term20046);
        setElement(term20118, 27, term20046);
        setElement(term20118, 29, term20046);
        setElement(term20118, 31, term20046);
        setElement(term20118, 33, term20046);
        setElement(term20118, 35, term20046);
        setElement(term20118, 37, term20046);
        setElement(term20118, 39, term20046);
        setField(term20073, term20073.getClass(), "wallOffsets", term20118);
        setField(term20073, term20073.getClass(), "lastRules", term20119);
        setField(term20120, term20120.getClass(), "table", null);
        setField(term20120, term20120.getClass(), "nextTable", null);
        setLongField(term20120, term20120.getClass(), "baseCount", 0L);
        setIntField(term20120, term20120.getClass(), "sizeCtl", 0);
        setIntField(term20120, term20120.getClass(), "transferIndex", 0);
        setIntField(term20120, term20120.getClass(), "cellsBusy", 0);
        setField(term20120, term20120.getClass(), "counterCells", null);
        setField(term20120, term20120.getClass(), "keySet", null);
        setField(term20120, term20120.getClass(), "values", null);
        setField(term20120, term20120.getClass(), "entrySet", null);
        setField(term20120, term20120.getClass(), "keySet", null);
        setField(term20120, term20120.getClass(), "values", null);
        setField(term20073, term20073.getClass(), "lastRulesCache", term20120);
        setField(term20056, term20056.getClass(), "rules", term20073);
        setField(term20035, term20035.getClass(), "zone", term20056);
        setField(term19924, term19924.getClass(), "time_stamp", term20035);
        setField(term19924, term19924.getClass(), "start_up_mode", "POPYycoDBy");
        setField(term19924, term19924.getClass(), "cmm_dly_mod", "LuWMOXdAPA");
        setField(term19924, term19924.getClass(), "cmm_dly_sec", "blSffTnsOv");
        setField(term19924, term19924.getClass(), "cmm_err_mod", "qbUMcIvEXH");
        setField(term19924, term19924.getClass(), "country_code", "TVxGTjeDcu");
        setField(term19924, term19924.getClass(), "region_code", "ABPtcyCzkR");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.CardProcedureRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getA_code", argTypes, term19924, args);
    }

};


