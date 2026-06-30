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

public class ChangeNameRequest_getPdid_8138719213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24954;

    public ChangeNameRequest_getPdid_8138719213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24954 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.ChangeNameRequest"));
        Object term25079 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term25080 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term25081 = newInstance(Class.forName("java.time.LocalDate"));
        Object term25085 = newInstance(Class.forName("java.time.LocalTime"));
        Object term25090 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term25100 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term25117 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term25118 = (long[]) newLongArray(1);
        Object[] term25120 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term25121 = (long[]) newLongArray(39);
        Object[] term25161 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term25162 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term25163 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term25164 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term24954, term24954.getClass(), "a_code", "IdGzDFfcZf");
        setIntField(term24954, term24954.getClass(), "aime_id", -1034506028);
        setField(term24954, term24954.getClass(), "aime_a_code", "KDdRNhZmnU");
        setIntField(term24954, term24954.getClass(), "pd_id", -1263114719);
        setIntField(term24954, term24954.getClass(), "accept_idx", -894662986);
        setField(term24954, term24954.getClass(), "player_name", "iMsqJaKlDC");
        setIntField(term24954, term24954.getClass(), "chg_name_price", 304775596);
        setField(term24954, term24954.getClass(), "cmd", "aPkGHbZyjj");
        setField(term24954, term24954.getClass(), "req_id", "nSWdsVyJRI");
        setField(term24954, term24954.getClass(), "game_id", "JBOPGgGKnc");
        setField(term24954, term24954.getClass(), "r_ver", "GlPTiCMCGP");
        setField(term24954, term24954.getClass(), "kc_serial", "jlcBpLoWfd");
        setField(term24954, term24954.getClass(), "b_serial", "oYymmLqbfJ");
        setField(term24954, term24954.getClass(), "place_id", "YaDWphDOSz");
        setIntField(term25081, term25081.getClass(), "year", 2014);
        setShortField(term25081, term25081.getClass(), "month", (short) 11);
        setShortField(term25081, term25081.getClass(), "day", (short) 8);
        setField(term25080, term25080.getClass(), "date", term25081);
        setByteField(term25085, term25085.getClass(), "hour", (byte) 8);
        setByteField(term25085, term25085.getClass(), "minute", (byte) 43);
        setByteField(term25085, term25085.getClass(), "second", (byte) 32);
        setIntField(term25085, term25085.getClass(), "nano", 154434838);
        setField(term25080, term25080.getClass(), "time", term25085);
        setField(term25079, term25079.getClass(), "dateTime", term25080);
        setIntField(term25090, term25090.getClass(), "totalSeconds", -10800);
        setField(term25090, term25090.getClass(), "id", "-03:00");
        setField(term25079, term25079.getClass(), "offset", term25090);
        setField(term25100, term25100.getClass(), "id", "America/Recife");
        setLongElement(term25118, 0, -1767217224L);
        setField(term25117, term25117.getClass(), "standardTransitions", term25118);
        setElement(term25120, 1, term25090);
        setField(term25117, term25117.getClass(), "standardOffsets", term25120);
        setLongElement(term25121, 0, -1767217224L);
        setLongElement(term25121, 1, -1206957600L);
        setLongElement(term25121, 2, -1191362400L);
        setLongElement(term25121, 3, -1175374800L);
        setLongElement(term25121, 4, -1159826400L);
        setLongElement(term25121, 5, -633819600L);
        setLongElement(term25121, 6, -622069200L);
        setLongElement(term25121, 7, -602283600L);
        setLongElement(term25121, 8, -591832800L);
        setLongElement(term25121, 9, -570747600L);
        setLongElement(term25121, 10, -560210400L);
        setLongElement(term25121, 11, -539125200L);
        setLongElement(term25121, 12, -531352800L);
        setLongElement(term25121, 13, -191365200L);
        setLongElement(term25121, 14, -184197600L);
        setLongElement(term25121, 15, -155163600L);
        setLongElement(term25121, 16, -150069600L);
        setLongElement(term25121, 17, -128898000L);
        setLongElement(term25121, 18, -121125600L);
        setLongElement(term25121, 19, -99954000L);
        setLongElement(term25121, 20, -89589600L);
        setLongElement(term25121, 21, -68418000L);
        setLongElement(term25121, 22, -57967200L);
        setLongElement(term25121, 23, 499748400L);
        setLongElement(term25121, 24, 511236000L);
        setLongElement(term25121, 25, 530593200L);
        setLongElement(term25121, 26, 540266400L);
        setLongElement(term25121, 27, 562129200L);
        setLongElement(term25121, 28, 571197600L);
        setLongElement(term25121, 29, 592974000L);
        setLongElement(term25121, 30, 602042400L);
        setLongElement(term25121, 31, 624423600L);
        setLongElement(term25121, 32, 634701600L);
        setLongElement(term25121, 33, 938919600L);
        setLongElement(term25121, 34, 951616800L);
        setLongElement(term25121, 35, 970974000L);
        setLongElement(term25121, 36, 971575200L);
        setLongElement(term25121, 37, 1003028400L);
        setLongElement(term25121, 38, 1013911200L);
        setField(term25117, term25117.getClass(), "savingsInstantTransitions", term25121);
        setField(term25117, term25117.getClass(), "savingsLocalTransitions", term25161);
        setElement(term25162, 1, term25090);
        setElement(term25162, 3, term25090);
        setElement(term25162, 5, term25090);
        setElement(term25162, 7, term25090);
        setElement(term25162, 9, term25090);
        setElement(term25162, 11, term25090);
        setElement(term25162, 13, term25090);
        setElement(term25162, 15, term25090);
        setElement(term25162, 17, term25090);
        setElement(term25162, 19, term25090);
        setElement(term25162, 21, term25090);
        setElement(term25162, 23, term25090);
        setElement(term25162, 25, term25090);
        setElement(term25162, 27, term25090);
        setElement(term25162, 29, term25090);
        setElement(term25162, 31, term25090);
        setElement(term25162, 33, term25090);
        setElement(term25162, 35, term25090);
        setElement(term25162, 37, term25090);
        setElement(term25162, 39, term25090);
        setField(term25117, term25117.getClass(), "wallOffsets", term25162);
        setField(term25117, term25117.getClass(), "lastRules", term25163);
        setField(term25164, term25164.getClass(), "table", null);
        setField(term25164, term25164.getClass(), "nextTable", null);
        setLongField(term25164, term25164.getClass(), "baseCount", 0L);
        setIntField(term25164, term25164.getClass(), "sizeCtl", 0);
        setIntField(term25164, term25164.getClass(), "transferIndex", 0);
        setIntField(term25164, term25164.getClass(), "cellsBusy", 0);
        setField(term25164, term25164.getClass(), "counterCells", null);
        setField(term25164, term25164.getClass(), "keySet", null);
        setField(term25164, term25164.getClass(), "values", null);
        setField(term25164, term25164.getClass(), "entrySet", null);
        setField(term25164, term25164.getClass(), "keySet", null);
        setField(term25164, term25164.getClass(), "values", null);
        setField(term25117, term25117.getClass(), "lastRulesCache", term25164);
        setField(term25100, term25100.getClass(), "rules", term25117);
        setField(term25079, term25079.getClass(), "zone", term25100);
        setField(term24954, term24954.getClass(), "time_stamp", term25079);
        setField(term24954, term24954.getClass(), "start_up_mode", "nnnmCgFBLw");
        setField(term24954, term24954.getClass(), "cmm_dly_mod", "hSSCyNEhyH");
        setField(term24954, term24954.getClass(), "cmm_dly_sec", "jDFNSuvZqm");
        setField(term24954, term24954.getClass(), "cmm_err_mod", "pLvkKHqNYX");
        setField(term24954, term24954.getClass(), "country_code", "PwqnuJJwjR");
        setField(term24954, term24954.getClass(), "region_code", "NFkbBiPeiw");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.ChangeNameRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPd_id", argTypes, term24954, args);
    }

};


