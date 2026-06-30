package icu.samnyan.aqua.sega.diva.model.request.ingame;

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
import static icu.samnyan.aqua.sega.diva.model.request.ingame.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class BuyModuleRequest_setMdlid_16455709288 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term257935;
     Object term258187;

    public BuyModuleRequest_setMdlid_16455709288() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term257935 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.ingame.BuyModuleRequest"));
        Object term258025 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term258026 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term258027 = newInstance(Class.forName("java.time.LocalDate"));
        Object term258031 = newInstance(Class.forName("java.time.LocalTime"));
        Object term258036 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term258046 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term258063 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term258064 = (long[]) newLongArray(1);
        Object[] term258066 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term258067 = (long[]) newLongArray(39);
        Object[] term258107 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term258108 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term258109 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term258110 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setIntField(term257935, term257935.getClass(), "pd_id", -1496084712);
        setIntField(term257935, term257935.getClass(), "accept_idx", 544978319);
        setIntField(term257935, term257935.getClass(), "start_idx", -655197367);
        setIntField(term257935, term257935.getClass(), "mdl_id", 1375309817);
        setIntField(term257935, term257935.getClass(), "mdl_price", 881724890);
        setField(term257935, term257935.getClass(), "cmd", "pHNOfQlhKa");
        setField(term257935, term257935.getClass(), "req_id", "rsZnYHnYCE");
        setField(term257935, term257935.getClass(), "game_id", "xVlcioeikJ");
        setField(term257935, term257935.getClass(), "r_ver", "nDWnDqypnc");
        setField(term257935, term257935.getClass(), "kc_serial", "YUysoEeBVh");
        setField(term257935, term257935.getClass(), "b_serial", "UALDaFojXX");
        setField(term257935, term257935.getClass(), "place_id", "zfXUaOpwPJ");
        setIntField(term258027, term258027.getClass(), "year", 2025);
        setShortField(term258027, term258027.getClass(), "month", (short) 2);
        setShortField(term258027, term258027.getClass(), "day", (short) 23);
        setField(term258026, term258026.getClass(), "date", term258027);
        setByteField(term258031, term258031.getClass(), "hour", (byte) 16);
        setByteField(term258031, term258031.getClass(), "minute", (byte) 39);
        setByteField(term258031, term258031.getClass(), "second", (byte) 42);
        setIntField(term258031, term258031.getClass(), "nano", 342777686);
        setField(term258026, term258026.getClass(), "time", term258031);
        setField(term258025, term258025.getClass(), "dateTime", term258026);
        setIntField(term258036, term258036.getClass(), "totalSeconds", -10800);
        setField(term258036, term258036.getClass(), "id", "-03:00");
        setField(term258025, term258025.getClass(), "offset", term258036);
        setField(term258046, term258046.getClass(), "id", "America/Recife");
        setLongElement(term258064, 0, -1767217224L);
        setField(term258063, term258063.getClass(), "standardTransitions", term258064);
        setElement(term258066, 1, term258036);
        setField(term258063, term258063.getClass(), "standardOffsets", term258066);
        setLongElement(term258067, 0, -1767217224L);
        setLongElement(term258067, 1, -1206957600L);
        setLongElement(term258067, 2, -1191362400L);
        setLongElement(term258067, 3, -1175374800L);
        setLongElement(term258067, 4, -1159826400L);
        setLongElement(term258067, 5, -633819600L);
        setLongElement(term258067, 6, -622069200L);
        setLongElement(term258067, 7, -602283600L);
        setLongElement(term258067, 8, -591832800L);
        setLongElement(term258067, 9, -570747600L);
        setLongElement(term258067, 10, -560210400L);
        setLongElement(term258067, 11, -539125200L);
        setLongElement(term258067, 12, -531352800L);
        setLongElement(term258067, 13, -191365200L);
        setLongElement(term258067, 14, -184197600L);
        setLongElement(term258067, 15, -155163600L);
        setLongElement(term258067, 16, -150069600L);
        setLongElement(term258067, 17, -128898000L);
        setLongElement(term258067, 18, -121125600L);
        setLongElement(term258067, 19, -99954000L);
        setLongElement(term258067, 20, -89589600L);
        setLongElement(term258067, 21, -68418000L);
        setLongElement(term258067, 22, -57967200L);
        setLongElement(term258067, 23, 499748400L);
        setLongElement(term258067, 24, 511236000L);
        setLongElement(term258067, 25, 530593200L);
        setLongElement(term258067, 26, 540266400L);
        setLongElement(term258067, 27, 562129200L);
        setLongElement(term258067, 28, 571197600L);
        setLongElement(term258067, 29, 592974000L);
        setLongElement(term258067, 30, 602042400L);
        setLongElement(term258067, 31, 624423600L);
        setLongElement(term258067, 32, 634701600L);
        setLongElement(term258067, 33, 938919600L);
        setLongElement(term258067, 34, 951616800L);
        setLongElement(term258067, 35, 970974000L);
        setLongElement(term258067, 36, 971575200L);
        setLongElement(term258067, 37, 1003028400L);
        setLongElement(term258067, 38, 1013911200L);
        setField(term258063, term258063.getClass(), "savingsInstantTransitions", term258067);
        setField(term258063, term258063.getClass(), "savingsLocalTransitions", term258107);
        setElement(term258108, 1, term258036);
        setElement(term258108, 3, term258036);
        setElement(term258108, 5, term258036);
        setElement(term258108, 7, term258036);
        setElement(term258108, 9, term258036);
        setElement(term258108, 11, term258036);
        setElement(term258108, 13, term258036);
        setElement(term258108, 15, term258036);
        setElement(term258108, 17, term258036);
        setElement(term258108, 19, term258036);
        setElement(term258108, 21, term258036);
        setElement(term258108, 23, term258036);
        setElement(term258108, 25, term258036);
        setElement(term258108, 27, term258036);
        setElement(term258108, 29, term258036);
        setElement(term258108, 31, term258036);
        setElement(term258108, 33, term258036);
        setElement(term258108, 35, term258036);
        setElement(term258108, 37, term258036);
        setElement(term258108, 39, term258036);
        setField(term258063, term258063.getClass(), "wallOffsets", term258108);
        setField(term258063, term258063.getClass(), "lastRules", term258109);
        setField(term258110, term258110.getClass(), "table", null);
        setField(term258110, term258110.getClass(), "nextTable", null);
        setLongField(term258110, term258110.getClass(), "baseCount", 0L);
        setIntField(term258110, term258110.getClass(), "sizeCtl", 0);
        setIntField(term258110, term258110.getClass(), "transferIndex", 0);
        setIntField(term258110, term258110.getClass(), "cellsBusy", 0);
        setField(term258110, term258110.getClass(), "counterCells", null);
        setField(term258110, term258110.getClass(), "keySet", null);
        setField(term258110, term258110.getClass(), "values", null);
        setField(term258110, term258110.getClass(), "entrySet", null);
        setField(term258110, term258110.getClass(), "keySet", null);
        setField(term258110, term258110.getClass(), "values", null);
        setField(term258063, term258063.getClass(), "lastRulesCache", term258110);
        setField(term258046, term258046.getClass(), "rules", term258063);
        setField(term258025, term258025.getClass(), "zone", term258046);
        setField(term257935, term257935.getClass(), "time_stamp", term258025);
        setField(term257935, term257935.getClass(), "start_up_mode", "AdOVSTNkEG");
        setField(term257935, term257935.getClass(), "cmm_dly_mod", "BTnZZOfDVg");
        setField(term257935, term257935.getClass(), "cmm_dly_sec", "ntMbgqrkHY");
        setField(term257935, term257935.getClass(), "cmm_err_mod", "ysjcSaLtGI");
        setField(term257935, term257935.getClass(), "country_code", "OqSicVymRV");
        setField(term257935, term257935.getClass(), "region_code", "wiCYSRXKPQ");
        term258187 = new Integer(1369194834);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.ingame.BuyModuleRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term258187;
        callMethod(klass, "setMdl_id", argTypes, term257935, args);
    }

};


