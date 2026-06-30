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

public class ChangeNameRequest_setAcceptidx_104745923111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29058;
     Object term29345;

    public ChangeNameRequest_setAcceptidx_104745923111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29058 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.ChangeNameRequest"));
        Object term29183 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term29184 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29185 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29189 = newInstance(Class.forName("java.time.LocalTime"));
        Object term29194 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term29204 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term29221 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term29222 = (long[]) newLongArray(1);
        Object[] term29224 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term29225 = (long[]) newLongArray(39);
        Object[] term29265 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term29266 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term29267 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term29268 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term29058, term29058.getClass(), "a_code", "eBcTbweeYp");
        setIntField(term29058, term29058.getClass(), "aime_id", -2015854073);
        setField(term29058, term29058.getClass(), "aime_a_code", "drcmjfQUDq");
        setIntField(term29058, term29058.getClass(), "pd_id", 538259104);
        setIntField(term29058, term29058.getClass(), "accept_idx", 96566506);
        setField(term29058, term29058.getClass(), "player_name", "GjdWUoUSyA");
        setIntField(term29058, term29058.getClass(), "chg_name_price", -343325701);
        setField(term29058, term29058.getClass(), "cmd", "YEkxWsWaUl");
        setField(term29058, term29058.getClass(), "req_id", "RINhPkhhct");
        setField(term29058, term29058.getClass(), "game_id", "vjNPcTSqmS");
        setField(term29058, term29058.getClass(), "r_ver", "fFhdWuJbdC");
        setField(term29058, term29058.getClass(), "kc_serial", "JlgLIHPabR");
        setField(term29058, term29058.getClass(), "b_serial", "LHnkeoNwHq");
        setField(term29058, term29058.getClass(), "place_id", "gVnDVbSyKa");
        setIntField(term29185, term29185.getClass(), "year", 2021);
        setShortField(term29185, term29185.getClass(), "month", (short) 4);
        setShortField(term29185, term29185.getClass(), "day", (short) 17);
        setField(term29184, term29184.getClass(), "date", term29185);
        setByteField(term29189, term29189.getClass(), "hour", (byte) 4);
        setByteField(term29189, term29189.getClass(), "minute", (byte) 11);
        setByteField(term29189, term29189.getClass(), "second", (byte) 16);
        setIntField(term29189, term29189.getClass(), "nano", 509895858);
        setField(term29184, term29184.getClass(), "time", term29189);
        setField(term29183, term29183.getClass(), "dateTime", term29184);
        setIntField(term29194, term29194.getClass(), "totalSeconds", -10800);
        setField(term29194, term29194.getClass(), "id", "-03:00");
        setField(term29183, term29183.getClass(), "offset", term29194);
        setField(term29204, term29204.getClass(), "id", "America/Recife");
        setLongElement(term29222, 0, -1767217224L);
        setField(term29221, term29221.getClass(), "standardTransitions", term29222);
        setElement(term29224, 1, term29194);
        setField(term29221, term29221.getClass(), "standardOffsets", term29224);
        setLongElement(term29225, 0, -1767217224L);
        setLongElement(term29225, 1, -1206957600L);
        setLongElement(term29225, 2, -1191362400L);
        setLongElement(term29225, 3, -1175374800L);
        setLongElement(term29225, 4, -1159826400L);
        setLongElement(term29225, 5, -633819600L);
        setLongElement(term29225, 6, -622069200L);
        setLongElement(term29225, 7, -602283600L);
        setLongElement(term29225, 8, -591832800L);
        setLongElement(term29225, 9, -570747600L);
        setLongElement(term29225, 10, -560210400L);
        setLongElement(term29225, 11, -539125200L);
        setLongElement(term29225, 12, -531352800L);
        setLongElement(term29225, 13, -191365200L);
        setLongElement(term29225, 14, -184197600L);
        setLongElement(term29225, 15, -155163600L);
        setLongElement(term29225, 16, -150069600L);
        setLongElement(term29225, 17, -128898000L);
        setLongElement(term29225, 18, -121125600L);
        setLongElement(term29225, 19, -99954000L);
        setLongElement(term29225, 20, -89589600L);
        setLongElement(term29225, 21, -68418000L);
        setLongElement(term29225, 22, -57967200L);
        setLongElement(term29225, 23, 499748400L);
        setLongElement(term29225, 24, 511236000L);
        setLongElement(term29225, 25, 530593200L);
        setLongElement(term29225, 26, 540266400L);
        setLongElement(term29225, 27, 562129200L);
        setLongElement(term29225, 28, 571197600L);
        setLongElement(term29225, 29, 592974000L);
        setLongElement(term29225, 30, 602042400L);
        setLongElement(term29225, 31, 624423600L);
        setLongElement(term29225, 32, 634701600L);
        setLongElement(term29225, 33, 938919600L);
        setLongElement(term29225, 34, 951616800L);
        setLongElement(term29225, 35, 970974000L);
        setLongElement(term29225, 36, 971575200L);
        setLongElement(term29225, 37, 1003028400L);
        setLongElement(term29225, 38, 1013911200L);
        setField(term29221, term29221.getClass(), "savingsInstantTransitions", term29225);
        setField(term29221, term29221.getClass(), "savingsLocalTransitions", term29265);
        setElement(term29266, 1, term29194);
        setElement(term29266, 3, term29194);
        setElement(term29266, 5, term29194);
        setElement(term29266, 7, term29194);
        setElement(term29266, 9, term29194);
        setElement(term29266, 11, term29194);
        setElement(term29266, 13, term29194);
        setElement(term29266, 15, term29194);
        setElement(term29266, 17, term29194);
        setElement(term29266, 19, term29194);
        setElement(term29266, 21, term29194);
        setElement(term29266, 23, term29194);
        setElement(term29266, 25, term29194);
        setElement(term29266, 27, term29194);
        setElement(term29266, 29, term29194);
        setElement(term29266, 31, term29194);
        setElement(term29266, 33, term29194);
        setElement(term29266, 35, term29194);
        setElement(term29266, 37, term29194);
        setElement(term29266, 39, term29194);
        setField(term29221, term29221.getClass(), "wallOffsets", term29266);
        setField(term29221, term29221.getClass(), "lastRules", term29267);
        setField(term29268, term29268.getClass(), "table", null);
        setField(term29268, term29268.getClass(), "nextTable", null);
        setLongField(term29268, term29268.getClass(), "baseCount", 0L);
        setIntField(term29268, term29268.getClass(), "sizeCtl", 0);
        setIntField(term29268, term29268.getClass(), "transferIndex", 0);
        setIntField(term29268, term29268.getClass(), "cellsBusy", 0);
        setField(term29268, term29268.getClass(), "counterCells", null);
        setField(term29268, term29268.getClass(), "keySet", null);
        setField(term29268, term29268.getClass(), "values", null);
        setField(term29268, term29268.getClass(), "entrySet", null);
        setField(term29268, term29268.getClass(), "keySet", null);
        setField(term29268, term29268.getClass(), "values", null);
        setField(term29221, term29221.getClass(), "lastRulesCache", term29268);
        setField(term29204, term29204.getClass(), "rules", term29221);
        setField(term29183, term29183.getClass(), "zone", term29204);
        setField(term29058, term29058.getClass(), "time_stamp", term29183);
        setField(term29058, term29058.getClass(), "start_up_mode", "kdCYNMSuoD");
        setField(term29058, term29058.getClass(), "cmm_dly_mod", "eRYlSLwtvV");
        setField(term29058, term29058.getClass(), "cmm_dly_sec", "duOyJsARTD");
        setField(term29058, term29058.getClass(), "cmm_err_mod", "xPnOHsNlyc");
        setField(term29058, term29058.getClass(), "country_code", "OTSPWPJefj");
        setField(term29058, term29058.getClass(), "region_code", "EOTYMqXRmE");
        term29345 = new Integer(107945604);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.ChangeNameRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term29345;
        callMethod(klass, "setAccept_idx", argTypes, term29058, args);
    }

};


