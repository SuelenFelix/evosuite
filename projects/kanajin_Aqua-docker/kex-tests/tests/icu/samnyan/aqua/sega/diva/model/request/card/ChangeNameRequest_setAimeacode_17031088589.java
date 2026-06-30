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

public class ChangeNameRequest_setAimeacode_17031088589 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28020;

    public ChangeNameRequest_setAimeacode_17031088589() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28020 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.ChangeNameRequest"));
        Object term28145 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term28146 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28147 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28151 = newInstance(Class.forName("java.time.LocalTime"));
        Object term28156 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term28166 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term28183 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term28184 = (long[]) newLongArray(1);
        Object[] term28186 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term28187 = (long[]) newLongArray(39);
        Object[] term28227 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term28228 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term28229 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term28230 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term28020, term28020.getClass(), "a_code", "ZdNcodHERG");
        setIntField(term28020, term28020.getClass(), "aime_id", 1072005683);
        setField(term28020, term28020.getClass(), "aime_a_code", "CLHomjAqIM");
        setIntField(term28020, term28020.getClass(), "pd_id", 1861318859);
        setIntField(term28020, term28020.getClass(), "accept_idx", 1474524152);
        setField(term28020, term28020.getClass(), "player_name", "mzCFLzFuSj");
        setIntField(term28020, term28020.getClass(), "chg_name_price", 568954359);
        setField(term28020, term28020.getClass(), "cmd", "WQnMpDlSfA");
        setField(term28020, term28020.getClass(), "req_id", "aOIvTQtXiv");
        setField(term28020, term28020.getClass(), "game_id", "IyjDiknqhA");
        setField(term28020, term28020.getClass(), "r_ver", "IHsXSAFYKi");
        setField(term28020, term28020.getClass(), "kc_serial", "KyGbLglqbW");
        setField(term28020, term28020.getClass(), "b_serial", "ZKVeStsSNT");
        setField(term28020, term28020.getClass(), "place_id", "cqCXYaAnFB");
        setIntField(term28147, term28147.getClass(), "year", 2011);
        setShortField(term28147, term28147.getClass(), "month", (short) 10);
        setShortField(term28147, term28147.getClass(), "day", (short) 25);
        setField(term28146, term28146.getClass(), "date", term28147);
        setByteField(term28151, term28151.getClass(), "hour", (byte) 10);
        setByteField(term28151, term28151.getClass(), "minute", (byte) 33);
        setByteField(term28151, term28151.getClass(), "second", (byte) 8);
        setIntField(term28151, term28151.getClass(), "nano", 268304014);
        setField(term28146, term28146.getClass(), "time", term28151);
        setField(term28145, term28145.getClass(), "dateTime", term28146);
        setIntField(term28156, term28156.getClass(), "totalSeconds", -10800);
        setField(term28156, term28156.getClass(), "id", "-03:00");
        setField(term28145, term28145.getClass(), "offset", term28156);
        setField(term28166, term28166.getClass(), "id", "America/Recife");
        setLongElement(term28184, 0, -1767217224L);
        setField(term28183, term28183.getClass(), "standardTransitions", term28184);
        setElement(term28186, 1, term28156);
        setField(term28183, term28183.getClass(), "standardOffsets", term28186);
        setLongElement(term28187, 0, -1767217224L);
        setLongElement(term28187, 1, -1206957600L);
        setLongElement(term28187, 2, -1191362400L);
        setLongElement(term28187, 3, -1175374800L);
        setLongElement(term28187, 4, -1159826400L);
        setLongElement(term28187, 5, -633819600L);
        setLongElement(term28187, 6, -622069200L);
        setLongElement(term28187, 7, -602283600L);
        setLongElement(term28187, 8, -591832800L);
        setLongElement(term28187, 9, -570747600L);
        setLongElement(term28187, 10, -560210400L);
        setLongElement(term28187, 11, -539125200L);
        setLongElement(term28187, 12, -531352800L);
        setLongElement(term28187, 13, -191365200L);
        setLongElement(term28187, 14, -184197600L);
        setLongElement(term28187, 15, -155163600L);
        setLongElement(term28187, 16, -150069600L);
        setLongElement(term28187, 17, -128898000L);
        setLongElement(term28187, 18, -121125600L);
        setLongElement(term28187, 19, -99954000L);
        setLongElement(term28187, 20, -89589600L);
        setLongElement(term28187, 21, -68418000L);
        setLongElement(term28187, 22, -57967200L);
        setLongElement(term28187, 23, 499748400L);
        setLongElement(term28187, 24, 511236000L);
        setLongElement(term28187, 25, 530593200L);
        setLongElement(term28187, 26, 540266400L);
        setLongElement(term28187, 27, 562129200L);
        setLongElement(term28187, 28, 571197600L);
        setLongElement(term28187, 29, 592974000L);
        setLongElement(term28187, 30, 602042400L);
        setLongElement(term28187, 31, 624423600L);
        setLongElement(term28187, 32, 634701600L);
        setLongElement(term28187, 33, 938919600L);
        setLongElement(term28187, 34, 951616800L);
        setLongElement(term28187, 35, 970974000L);
        setLongElement(term28187, 36, 971575200L);
        setLongElement(term28187, 37, 1003028400L);
        setLongElement(term28187, 38, 1013911200L);
        setField(term28183, term28183.getClass(), "savingsInstantTransitions", term28187);
        setField(term28183, term28183.getClass(), "savingsLocalTransitions", term28227);
        setElement(term28228, 1, term28156);
        setElement(term28228, 3, term28156);
        setElement(term28228, 5, term28156);
        setElement(term28228, 7, term28156);
        setElement(term28228, 9, term28156);
        setElement(term28228, 11, term28156);
        setElement(term28228, 13, term28156);
        setElement(term28228, 15, term28156);
        setElement(term28228, 17, term28156);
        setElement(term28228, 19, term28156);
        setElement(term28228, 21, term28156);
        setElement(term28228, 23, term28156);
        setElement(term28228, 25, term28156);
        setElement(term28228, 27, term28156);
        setElement(term28228, 29, term28156);
        setElement(term28228, 31, term28156);
        setElement(term28228, 33, term28156);
        setElement(term28228, 35, term28156);
        setElement(term28228, 37, term28156);
        setElement(term28228, 39, term28156);
        setField(term28183, term28183.getClass(), "wallOffsets", term28228);
        setField(term28183, term28183.getClass(), "lastRules", term28229);
        setField(term28230, term28230.getClass(), "table", null);
        setField(term28230, term28230.getClass(), "nextTable", null);
        setLongField(term28230, term28230.getClass(), "baseCount", 0L);
        setIntField(term28230, term28230.getClass(), "sizeCtl", 0);
        setIntField(term28230, term28230.getClass(), "transferIndex", 0);
        setIntField(term28230, term28230.getClass(), "cellsBusy", 0);
        setField(term28230, term28230.getClass(), "counterCells", null);
        setField(term28230, term28230.getClass(), "keySet", null);
        setField(term28230, term28230.getClass(), "values", null);
        setField(term28230, term28230.getClass(), "entrySet", null);
        setField(term28230, term28230.getClass(), "keySet", null);
        setField(term28230, term28230.getClass(), "values", null);
        setField(term28183, term28183.getClass(), "lastRulesCache", term28230);
        setField(term28166, term28166.getClass(), "rules", term28183);
        setField(term28145, term28145.getClass(), "zone", term28166);
        setField(term28020, term28020.getClass(), "time_stamp", term28145);
        setField(term28020, term28020.getClass(), "start_up_mode", "UPLNFZHXjw");
        setField(term28020, term28020.getClass(), "cmm_dly_mod", "CwrrJlrGmg");
        setField(term28020, term28020.getClass(), "cmm_dly_sec", "HejzvyejjG");
        setField(term28020, term28020.getClass(), "cmm_err_mod", "pbqJjeooBM");
        setField(term28020, term28020.getClass(), "country_code", "ccnotFfPXt");
        setField(term28020, term28020.getClass(), "region_code", "plWlgdgIhn");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.ChangeNameRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "RZaKVKWtND";
        callMethod(klass, "setAime_a_code", argTypes, term28020, args);
    }

};


