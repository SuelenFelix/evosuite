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

public class ChangeNameRequest_getPlayername_550226635 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25968;

    public ChangeNameRequest_getPlayername_550226635() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25968 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.ChangeNameRequest"));
        Object term26093 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term26094 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term26095 = newInstance(Class.forName("java.time.LocalDate"));
        Object term26099 = newInstance(Class.forName("java.time.LocalTime"));
        Object term26104 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term26114 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term26131 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term26132 = (long[]) newLongArray(1);
        Object[] term26134 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term26135 = (long[]) newLongArray(39);
        Object[] term26175 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term26176 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term26177 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term26178 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term25968, term25968.getClass(), "a_code", "TLxQzxvizR");
        setIntField(term25968, term25968.getClass(), "aime_id", -268815336);
        setField(term25968, term25968.getClass(), "aime_a_code", "uUgJfKAzDM");
        setIntField(term25968, term25968.getClass(), "pd_id", -1210583429);
        setIntField(term25968, term25968.getClass(), "accept_idx", -663691365);
        setField(term25968, term25968.getClass(), "player_name", "gZPZNkweEp");
        setIntField(term25968, term25968.getClass(), "chg_name_price", 339854490);
        setField(term25968, term25968.getClass(), "cmd", "vfennwtmqe");
        setField(term25968, term25968.getClass(), "req_id", "zZxoNkohbw");
        setField(term25968, term25968.getClass(), "game_id", "DQrjPcLysX");
        setField(term25968, term25968.getClass(), "r_ver", "VWPFyrpmmb");
        setField(term25968, term25968.getClass(), "kc_serial", "gYYKrIeThw");
        setField(term25968, term25968.getClass(), "b_serial", "UsxeLMVkAK");
        setField(term25968, term25968.getClass(), "place_id", "ITrhiKKzcb");
        setIntField(term26095, term26095.getClass(), "year", 2017);
        setShortField(term26095, term26095.getClass(), "month", (short) 4);
        setShortField(term26095, term26095.getClass(), "day", (short) 3);
        setField(term26094, term26094.getClass(), "date", term26095);
        setByteField(term26099, term26099.getClass(), "hour", (byte) 6);
        setByteField(term26099, term26099.getClass(), "minute", (byte) 51);
        setByteField(term26099, term26099.getClass(), "second", (byte) 10);
        setIntField(term26099, term26099.getClass(), "nano", 316377166);
        setField(term26094, term26094.getClass(), "time", term26099);
        setField(term26093, term26093.getClass(), "dateTime", term26094);
        setIntField(term26104, term26104.getClass(), "totalSeconds", -10800);
        setField(term26104, term26104.getClass(), "id", "-03:00");
        setField(term26093, term26093.getClass(), "offset", term26104);
        setField(term26114, term26114.getClass(), "id", "America/Recife");
        setLongElement(term26132, 0, -1767217224L);
        setField(term26131, term26131.getClass(), "standardTransitions", term26132);
        setElement(term26134, 1, term26104);
        setField(term26131, term26131.getClass(), "standardOffsets", term26134);
        setLongElement(term26135, 0, -1767217224L);
        setLongElement(term26135, 1, -1206957600L);
        setLongElement(term26135, 2, -1191362400L);
        setLongElement(term26135, 3, -1175374800L);
        setLongElement(term26135, 4, -1159826400L);
        setLongElement(term26135, 5, -633819600L);
        setLongElement(term26135, 6, -622069200L);
        setLongElement(term26135, 7, -602283600L);
        setLongElement(term26135, 8, -591832800L);
        setLongElement(term26135, 9, -570747600L);
        setLongElement(term26135, 10, -560210400L);
        setLongElement(term26135, 11, -539125200L);
        setLongElement(term26135, 12, -531352800L);
        setLongElement(term26135, 13, -191365200L);
        setLongElement(term26135, 14, -184197600L);
        setLongElement(term26135, 15, -155163600L);
        setLongElement(term26135, 16, -150069600L);
        setLongElement(term26135, 17, -128898000L);
        setLongElement(term26135, 18, -121125600L);
        setLongElement(term26135, 19, -99954000L);
        setLongElement(term26135, 20, -89589600L);
        setLongElement(term26135, 21, -68418000L);
        setLongElement(term26135, 22, -57967200L);
        setLongElement(term26135, 23, 499748400L);
        setLongElement(term26135, 24, 511236000L);
        setLongElement(term26135, 25, 530593200L);
        setLongElement(term26135, 26, 540266400L);
        setLongElement(term26135, 27, 562129200L);
        setLongElement(term26135, 28, 571197600L);
        setLongElement(term26135, 29, 592974000L);
        setLongElement(term26135, 30, 602042400L);
        setLongElement(term26135, 31, 624423600L);
        setLongElement(term26135, 32, 634701600L);
        setLongElement(term26135, 33, 938919600L);
        setLongElement(term26135, 34, 951616800L);
        setLongElement(term26135, 35, 970974000L);
        setLongElement(term26135, 36, 971575200L);
        setLongElement(term26135, 37, 1003028400L);
        setLongElement(term26135, 38, 1013911200L);
        setField(term26131, term26131.getClass(), "savingsInstantTransitions", term26135);
        setField(term26131, term26131.getClass(), "savingsLocalTransitions", term26175);
        setElement(term26176, 1, term26104);
        setElement(term26176, 3, term26104);
        setElement(term26176, 5, term26104);
        setElement(term26176, 7, term26104);
        setElement(term26176, 9, term26104);
        setElement(term26176, 11, term26104);
        setElement(term26176, 13, term26104);
        setElement(term26176, 15, term26104);
        setElement(term26176, 17, term26104);
        setElement(term26176, 19, term26104);
        setElement(term26176, 21, term26104);
        setElement(term26176, 23, term26104);
        setElement(term26176, 25, term26104);
        setElement(term26176, 27, term26104);
        setElement(term26176, 29, term26104);
        setElement(term26176, 31, term26104);
        setElement(term26176, 33, term26104);
        setElement(term26176, 35, term26104);
        setElement(term26176, 37, term26104);
        setElement(term26176, 39, term26104);
        setField(term26131, term26131.getClass(), "wallOffsets", term26176);
        setField(term26131, term26131.getClass(), "lastRules", term26177);
        setField(term26178, term26178.getClass(), "table", null);
        setField(term26178, term26178.getClass(), "nextTable", null);
        setLongField(term26178, term26178.getClass(), "baseCount", 0L);
        setIntField(term26178, term26178.getClass(), "sizeCtl", 0);
        setIntField(term26178, term26178.getClass(), "transferIndex", 0);
        setIntField(term26178, term26178.getClass(), "cellsBusy", 0);
        setField(term26178, term26178.getClass(), "counterCells", null);
        setField(term26178, term26178.getClass(), "keySet", null);
        setField(term26178, term26178.getClass(), "values", null);
        setField(term26178, term26178.getClass(), "entrySet", null);
        setField(term26178, term26178.getClass(), "keySet", null);
        setField(term26178, term26178.getClass(), "values", null);
        setField(term26131, term26131.getClass(), "lastRulesCache", term26178);
        setField(term26114, term26114.getClass(), "rules", term26131);
        setField(term26093, term26093.getClass(), "zone", term26114);
        setField(term25968, term25968.getClass(), "time_stamp", term26093);
        setField(term25968, term25968.getClass(), "start_up_mode", "qMKmSzOQXg");
        setField(term25968, term25968.getClass(), "cmm_dly_mod", "CURQCMkqbZ");
        setField(term25968, term25968.getClass(), "cmm_dly_sec", "VZwkkQktrm");
        setField(term25968, term25968.getClass(), "cmm_err_mod", "wIuJvIvEMb");
        setField(term25968, term25968.getClass(), "country_code", "EyojsbSjWT");
        setField(term25968, term25968.getClass(), "region_code", "szGicGyWDL");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.ChangeNameRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayer_name", argTypes, term25968, args);
    }

};


