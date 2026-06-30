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

public class CardProcedureRequest_setAimeid_11456988596 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22363;
     Object term22636;

    public CardProcedureRequest_setAimeid_11456988596() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22363 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.CardProcedureRequest"));
        Object term22474 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term22475 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term22476 = newInstance(Class.forName("java.time.LocalDate"));
        Object term22480 = newInstance(Class.forName("java.time.LocalTime"));
        Object term22485 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term22495 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term22512 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term22513 = (long[]) newLongArray(1);
        Object[] term22515 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term22516 = (long[]) newLongArray(39);
        Object[] term22556 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term22557 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term22558 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term22559 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setIntField(term22363, term22363.getClass(), "cd_adm_cmd", 1063420942);
        setField(term22363, term22363.getClass(), "a_code", "TKOMaGswbU");
        setIntField(term22363, term22363.getClass(), "aime_id", 1375330971);
        setField(term22363, term22363.getClass(), "aime_a_code", "YcTbglHiUq");
        setField(term22363, term22363.getClass(), "cmd", "TiUqHrjoEU");
        setField(term22363, term22363.getClass(), "req_id", "eoEvZbdLjL");
        setField(term22363, term22363.getClass(), "game_id", "BkIxsyPkGy");
        setField(term22363, term22363.getClass(), "r_ver", "mrMGwoRgVY");
        setField(term22363, term22363.getClass(), "kc_serial", "mxVLTgCwki");
        setField(term22363, term22363.getClass(), "b_serial", "wCurppnDSA");
        setField(term22363, term22363.getClass(), "place_id", "JydxSNTMYt");
        setIntField(term22476, term22476.getClass(), "year", 2023);
        setShortField(term22476, term22476.getClass(), "month", (short) 7);
        setShortField(term22476, term22476.getClass(), "day", (short) 16);
        setField(term22475, term22475.getClass(), "date", term22476);
        setByteField(term22480, term22480.getClass(), "hour", (byte) 3);
        setByteField(term22480, term22480.getClass(), "minute", (byte) 1);
        setByteField(term22480, term22480.getClass(), "second", (byte) 19);
        setIntField(term22480, term22480.getClass(), "nano", 488629554);
        setField(term22475, term22475.getClass(), "time", term22480);
        setField(term22474, term22474.getClass(), "dateTime", term22475);
        setIntField(term22485, term22485.getClass(), "totalSeconds", -10800);
        setField(term22485, term22485.getClass(), "id", "-03:00");
        setField(term22474, term22474.getClass(), "offset", term22485);
        setField(term22495, term22495.getClass(), "id", "America/Recife");
        setLongElement(term22513, 0, -1767217224L);
        setField(term22512, term22512.getClass(), "standardTransitions", term22513);
        setElement(term22515, 1, term22485);
        setField(term22512, term22512.getClass(), "standardOffsets", term22515);
        setLongElement(term22516, 0, -1767217224L);
        setLongElement(term22516, 1, -1206957600L);
        setLongElement(term22516, 2, -1191362400L);
        setLongElement(term22516, 3, -1175374800L);
        setLongElement(term22516, 4, -1159826400L);
        setLongElement(term22516, 5, -633819600L);
        setLongElement(term22516, 6, -622069200L);
        setLongElement(term22516, 7, -602283600L);
        setLongElement(term22516, 8, -591832800L);
        setLongElement(term22516, 9, -570747600L);
        setLongElement(term22516, 10, -560210400L);
        setLongElement(term22516, 11, -539125200L);
        setLongElement(term22516, 12, -531352800L);
        setLongElement(term22516, 13, -191365200L);
        setLongElement(term22516, 14, -184197600L);
        setLongElement(term22516, 15, -155163600L);
        setLongElement(term22516, 16, -150069600L);
        setLongElement(term22516, 17, -128898000L);
        setLongElement(term22516, 18, -121125600L);
        setLongElement(term22516, 19, -99954000L);
        setLongElement(term22516, 20, -89589600L);
        setLongElement(term22516, 21, -68418000L);
        setLongElement(term22516, 22, -57967200L);
        setLongElement(term22516, 23, 499748400L);
        setLongElement(term22516, 24, 511236000L);
        setLongElement(term22516, 25, 530593200L);
        setLongElement(term22516, 26, 540266400L);
        setLongElement(term22516, 27, 562129200L);
        setLongElement(term22516, 28, 571197600L);
        setLongElement(term22516, 29, 592974000L);
        setLongElement(term22516, 30, 602042400L);
        setLongElement(term22516, 31, 624423600L);
        setLongElement(term22516, 32, 634701600L);
        setLongElement(term22516, 33, 938919600L);
        setLongElement(term22516, 34, 951616800L);
        setLongElement(term22516, 35, 970974000L);
        setLongElement(term22516, 36, 971575200L);
        setLongElement(term22516, 37, 1003028400L);
        setLongElement(term22516, 38, 1013911200L);
        setField(term22512, term22512.getClass(), "savingsInstantTransitions", term22516);
        setField(term22512, term22512.getClass(), "savingsLocalTransitions", term22556);
        setElement(term22557, 1, term22485);
        setElement(term22557, 3, term22485);
        setElement(term22557, 5, term22485);
        setElement(term22557, 7, term22485);
        setElement(term22557, 9, term22485);
        setElement(term22557, 11, term22485);
        setElement(term22557, 13, term22485);
        setElement(term22557, 15, term22485);
        setElement(term22557, 17, term22485);
        setElement(term22557, 19, term22485);
        setElement(term22557, 21, term22485);
        setElement(term22557, 23, term22485);
        setElement(term22557, 25, term22485);
        setElement(term22557, 27, term22485);
        setElement(term22557, 29, term22485);
        setElement(term22557, 31, term22485);
        setElement(term22557, 33, term22485);
        setElement(term22557, 35, term22485);
        setElement(term22557, 37, term22485);
        setElement(term22557, 39, term22485);
        setField(term22512, term22512.getClass(), "wallOffsets", term22557);
        setField(term22512, term22512.getClass(), "lastRules", term22558);
        setField(term22559, term22559.getClass(), "table", null);
        setField(term22559, term22559.getClass(), "nextTable", null);
        setLongField(term22559, term22559.getClass(), "baseCount", 0L);
        setIntField(term22559, term22559.getClass(), "sizeCtl", 0);
        setIntField(term22559, term22559.getClass(), "transferIndex", 0);
        setIntField(term22559, term22559.getClass(), "cellsBusy", 0);
        setField(term22559, term22559.getClass(), "counterCells", null);
        setField(term22559, term22559.getClass(), "keySet", null);
        setField(term22559, term22559.getClass(), "values", null);
        setField(term22559, term22559.getClass(), "entrySet", null);
        setField(term22559, term22559.getClass(), "keySet", null);
        setField(term22559, term22559.getClass(), "values", null);
        setField(term22512, term22512.getClass(), "lastRulesCache", term22559);
        setField(term22495, term22495.getClass(), "rules", term22512);
        setField(term22474, term22474.getClass(), "zone", term22495);
        setField(term22363, term22363.getClass(), "time_stamp", term22474);
        setField(term22363, term22363.getClass(), "start_up_mode", "KpurAcrHYT");
        setField(term22363, term22363.getClass(), "cmm_dly_mod", "QjvDwgKJGz");
        setField(term22363, term22363.getClass(), "cmm_dly_sec", "ngYxiXTZrk");
        setField(term22363, term22363.getClass(), "cmm_err_mod", "YTxBqWRAlo");
        setField(term22363, term22363.getClass(), "country_code", "ReruUQRXwl");
        setField(term22363, term22363.getClass(), "region_code", "DWEsVQwuaE");
        term22636 = new Integer(-478195677);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.CardProcedureRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term22636;
        callMethod(klass, "setAime_id", argTypes, term22363, args);
    }

};


