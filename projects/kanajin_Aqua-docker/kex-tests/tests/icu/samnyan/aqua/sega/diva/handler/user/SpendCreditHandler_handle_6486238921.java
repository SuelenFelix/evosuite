package icu.samnyan.aqua.sega.diva.handler.user;

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
import static icu.samnyan.aqua.sega.diva.handler.user.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class SpendCreditHandler_handle_6486238921 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9464;
     Object term9465;

    public SpendCreditHandler_handle_6486238921() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9464 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.handler.user.SpendCreditHandler"));
        setField(term9464, term9464.getClass(), "playerProfileService", null);
        setField(term9464, term9464.getClass(), "mapper", null);
        term9465 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.user.SpendCreditRequest"));
        int[] term9467 = (int[]) newIntArray(5);
        int[] term9473 = (int[]) newIntArray(4);
        int[] term9479 = (int[]) newIntArray(3);
        int[] term9483 = (int[]) newIntArray(4);
        Object term9572 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term9573 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9574 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9578 = newInstance(Class.forName("java.time.LocalTime"));
        Object term9583 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term9593 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term9610 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term9611 = (long[]) newLongArray(1);
        Object[] term9613 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term9614 = (long[]) newLongArray(39);
        Object[] term9654 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term9655 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term9656 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term9657 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setIntField(term9465, term9465.getClass(), "pd_id", -1339778481);
        setIntElement(term9467, 0, 1725571209);
        setIntElement(term9467, 1, -522618178);
        setIntElement(term9467, 2, 1134449235);
        setIntElement(term9467, 3, -883034806);
        setIntElement(term9467, 4, 1585847225);
        setField(term9465, term9465.getClass(), "my_qst_id", term9467);
        setIntElement(term9473, 0, 597278769);
        setIntElement(term9473, 1, -1685132342);
        setIntElement(term9473, 2, -1456670397);
        setIntElement(term9473, 3, 1622346318);
        setField(term9465, term9465.getClass(), "my_qst_sts", term9473);
        setIntField(term9465, term9465.getClass(), "crdt_typ", 1048535127);
        setIntElement(term9479, 0, -655067527);
        setIntElement(term9479, 1, -6029667);
        setIntElement(term9479, 2, -2068769794);
        setField(term9465, term9465.getClass(), "cmpgn_id", term9479);
        setIntElement(term9483, 0, -117576464);
        setIntElement(term9483, 1, -1007160944);
        setIntElement(term9483, 2, 1135664017);
        setIntElement(term9483, 3, 590364439);
        setField(term9465, term9465.getClass(), "cmpgn_pb", term9483);
        setField(term9465, term9465.getClass(), "cmd", "SbAoxhfrkn");
        setField(term9465, term9465.getClass(), "req_id", "kuTXqwMtDB");
        setField(term9465, term9465.getClass(), "game_id", "Ghbwtircqb");
        setField(term9465, term9465.getClass(), "r_ver", "xrwlQZdwCp");
        setField(term9465, term9465.getClass(), "kc_serial", "IDCWpPLRkE");
        setField(term9465, term9465.getClass(), "b_serial", "nyiiPDVjAc");
        setField(term9465, term9465.getClass(), "place_id", "aKnKipADSo");
        setIntField(term9574, term9574.getClass(), "year", 2015);
        setShortField(term9574, term9574.getClass(), "month", (short) 9);
        setShortField(term9574, term9574.getClass(), "day", (short) 19);
        setField(term9573, term9573.getClass(), "date", term9574);
        setByteField(term9578, term9578.getClass(), "hour", (byte) 9);
        setByteField(term9578, term9578.getClass(), "minute", (byte) 4);
        setByteField(term9578, term9578.getClass(), "second", (byte) 10);
        setIntField(term9578, term9578.getClass(), "nano", 401765865);
        setField(term9573, term9573.getClass(), "time", term9578);
        setField(term9572, term9572.getClass(), "dateTime", term9573);
        setIntField(term9583, term9583.getClass(), "totalSeconds", -10800);
        setField(term9583, term9583.getClass(), "id", "-03:00");
        setField(term9572, term9572.getClass(), "offset", term9583);
        setField(term9593, term9593.getClass(), "id", "America/Recife");
        setLongElement(term9611, 0, -1767217224L);
        setField(term9610, term9610.getClass(), "standardTransitions", term9611);
        setElement(term9613, 1, term9583);
        setField(term9610, term9610.getClass(), "standardOffsets", term9613);
        setLongElement(term9614, 0, -1767217224L);
        setLongElement(term9614, 1, -1206957600L);
        setLongElement(term9614, 2, -1191362400L);
        setLongElement(term9614, 3, -1175374800L);
        setLongElement(term9614, 4, -1159826400L);
        setLongElement(term9614, 5, -633819600L);
        setLongElement(term9614, 6, -622069200L);
        setLongElement(term9614, 7, -602283600L);
        setLongElement(term9614, 8, -591832800L);
        setLongElement(term9614, 9, -570747600L);
        setLongElement(term9614, 10, -560210400L);
        setLongElement(term9614, 11, -539125200L);
        setLongElement(term9614, 12, -531352800L);
        setLongElement(term9614, 13, -191365200L);
        setLongElement(term9614, 14, -184197600L);
        setLongElement(term9614, 15, -155163600L);
        setLongElement(term9614, 16, -150069600L);
        setLongElement(term9614, 17, -128898000L);
        setLongElement(term9614, 18, -121125600L);
        setLongElement(term9614, 19, -99954000L);
        setLongElement(term9614, 20, -89589600L);
        setLongElement(term9614, 21, -68418000L);
        setLongElement(term9614, 22, -57967200L);
        setLongElement(term9614, 23, 499748400L);
        setLongElement(term9614, 24, 511236000L);
        setLongElement(term9614, 25, 530593200L);
        setLongElement(term9614, 26, 540266400L);
        setLongElement(term9614, 27, 562129200L);
        setLongElement(term9614, 28, 571197600L);
        setLongElement(term9614, 29, 592974000L);
        setLongElement(term9614, 30, 602042400L);
        setLongElement(term9614, 31, 624423600L);
        setLongElement(term9614, 32, 634701600L);
        setLongElement(term9614, 33, 938919600L);
        setLongElement(term9614, 34, 951616800L);
        setLongElement(term9614, 35, 970974000L);
        setLongElement(term9614, 36, 971575200L);
        setLongElement(term9614, 37, 1003028400L);
        setLongElement(term9614, 38, 1013911200L);
        setField(term9610, term9610.getClass(), "savingsInstantTransitions", term9614);
        setField(term9610, term9610.getClass(), "savingsLocalTransitions", term9654);
        setElement(term9655, 1, term9583);
        setElement(term9655, 3, term9583);
        setElement(term9655, 5, term9583);
        setElement(term9655, 7, term9583);
        setElement(term9655, 9, term9583);
        setElement(term9655, 11, term9583);
        setElement(term9655, 13, term9583);
        setElement(term9655, 15, term9583);
        setElement(term9655, 17, term9583);
        setElement(term9655, 19, term9583);
        setElement(term9655, 21, term9583);
        setElement(term9655, 23, term9583);
        setElement(term9655, 25, term9583);
        setElement(term9655, 27, term9583);
        setElement(term9655, 29, term9583);
        setElement(term9655, 31, term9583);
        setElement(term9655, 33, term9583);
        setElement(term9655, 35, term9583);
        setElement(term9655, 37, term9583);
        setElement(term9655, 39, term9583);
        setField(term9610, term9610.getClass(), "wallOffsets", term9655);
        setField(term9610, term9610.getClass(), "lastRules", term9656);
        setField(term9657, term9657.getClass(), "table", null);
        setField(term9657, term9657.getClass(), "nextTable", null);
        setLongField(term9657, term9657.getClass(), "baseCount", 0L);
        setIntField(term9657, term9657.getClass(), "sizeCtl", 0);
        setIntField(term9657, term9657.getClass(), "transferIndex", 0);
        setIntField(term9657, term9657.getClass(), "cellsBusy", 0);
        setField(term9657, term9657.getClass(), "counterCells", null);
        setField(term9657, term9657.getClass(), "keySet", null);
        setField(term9657, term9657.getClass(), "values", null);
        setField(term9657, term9657.getClass(), "entrySet", null);
        setField(term9657, term9657.getClass(), "keySet", null);
        setField(term9657, term9657.getClass(), "values", null);
        setField(term9610, term9610.getClass(), "lastRulesCache", term9657);
        setField(term9593, term9593.getClass(), "rules", term9610);
        setField(term9572, term9572.getClass(), "zone", term9593);
        setField(term9465, term9465.getClass(), "time_stamp", term9572);
        setField(term9465, term9465.getClass(), "start_up_mode", "wSQxaModmm");
        setField(term9465, term9465.getClass(), "cmm_dly_mod", "UlajhuVLaP");
        setField(term9465, term9465.getClass(), "cmm_dly_sec", "gGSMzuGICf");
        setField(term9465, term9465.getClass(), "cmm_err_mod", "hxCBltsObl");
        setField(term9465, term9465.getClass(), "country_code", "BndsHwAFMv");
        setField(term9465, term9465.getClass(), "region_code", "GzFkzHGYFt");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.handler.user.SpendCreditHandler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.diva.model.request.user.SpendCreditRequest");
        Object[] args = new Object[1];
        args[0] = term9465;
        callMethod(klass, "handle", argTypes, term9464, args);
    }

};


