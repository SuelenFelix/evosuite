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

public class StoreSsRequest_getPdid_9784411700 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term246149;

    public StoreSsRequest_getPdid_9784411700() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term246149 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.ingame.StoreSsRequest"));
        int[] term246165 = (int[]) newIntArray(1);
        int[] term246167 = (int[]) newIntArray(6);
        int[] term246174 = (int[]) newIntArray(1);
        int[] term246176 = (int[]) newIntArray(4);
        Object term246265 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term246266 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term246267 = newInstance(Class.forName("java.time.LocalDate"));
        Object term246271 = newInstance(Class.forName("java.time.LocalTime"));
        Object term246276 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term246286 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term246303 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term246304 = (long[]) newLongArray(1);
        Object[] term246306 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term246307 = (long[]) newLongArray(39);
        Object[] term246347 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term246348 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term246349 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term246350 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setIntField(term246149, term246149.getClass(), "pd_id", -729883555);
        setField(term246149, term246149.getClass(), "ss_dat_id", "DAYFgLtcSK");
        setIntField(term246149, term246149.getClass(), "ss_pv_id", -455991761);
        setIntField(term246149, term246149.getClass(), "ss_sel_pv_id", 1475586197);
        setIntElement(term246165, 0, 34061998);
        setField(term246149, term246149.getClass(), "ss_mdl_id", term246165);
        setIntElement(term246167, 0, 1272966370);
        setIntElement(term246167, 1, 1317626019);
        setIntElement(term246167, 2, -2028048587);
        setIntElement(term246167, 3, 1829201486);
        setIntElement(term246167, 4, 2048472599);
        setIntElement(term246167, 5, -839427721);
        setField(term246149, term246149.getClass(), "ss_sel_mdl_id", term246167);
        setIntElement(term246174, 0, -1362676412);
        setField(term246149, term246149.getClass(), "ss_c_itm_id", term246174);
        setIntElement(term246176, 0, 718184918);
        setIntElement(term246176, 1, 196229165);
        setIntElement(term246176, 2, -1664894378);
        setIntElement(term246176, 3, -802621511);
        setField(term246149, term246149.getClass(), "ss_pxl_sz", term246176);
        setField(term246149, term246149.getClass(), "cmd", "yYSkqbbdqk");
        setField(term246149, term246149.getClass(), "req_id", "pZqOHvYzUt");
        setField(term246149, term246149.getClass(), "game_id", "DtSvRdcfBd");
        setField(term246149, term246149.getClass(), "r_ver", "rfJbISvNQS");
        setField(term246149, term246149.getClass(), "kc_serial", "SoQIwZITjf");
        setField(term246149, term246149.getClass(), "b_serial", "MuFCHnASsR");
        setField(term246149, term246149.getClass(), "place_id", "lTGjdlngGR");
        setIntField(term246267, term246267.getClass(), "year", 2027);
        setShortField(term246267, term246267.getClass(), "month", (short) 8);
        setShortField(term246267, term246267.getClass(), "day", (short) 16);
        setField(term246266, term246266.getClass(), "date", term246267);
        setByteField(term246271, term246271.getClass(), "hour", (byte) 8);
        setByteField(term246271, term246271.getClass(), "minute", (byte) 3);
        setByteField(term246271, term246271.getClass(), "second", (byte) 15);
        setIntField(term246271, term246271.getClass(), "nano", 332963320);
        setField(term246266, term246266.getClass(), "time", term246271);
        setField(term246265, term246265.getClass(), "dateTime", term246266);
        setIntField(term246276, term246276.getClass(), "totalSeconds", -10800);
        setField(term246276, term246276.getClass(), "id", "-03:00");
        setField(term246265, term246265.getClass(), "offset", term246276);
        setField(term246286, term246286.getClass(), "id", "America/Recife");
        setLongElement(term246304, 0, -1767217224L);
        setField(term246303, term246303.getClass(), "standardTransitions", term246304);
        setElement(term246306, 1, term246276);
        setField(term246303, term246303.getClass(), "standardOffsets", term246306);
        setLongElement(term246307, 0, -1767217224L);
        setLongElement(term246307, 1, -1206957600L);
        setLongElement(term246307, 2, -1191362400L);
        setLongElement(term246307, 3, -1175374800L);
        setLongElement(term246307, 4, -1159826400L);
        setLongElement(term246307, 5, -633819600L);
        setLongElement(term246307, 6, -622069200L);
        setLongElement(term246307, 7, -602283600L);
        setLongElement(term246307, 8, -591832800L);
        setLongElement(term246307, 9, -570747600L);
        setLongElement(term246307, 10, -560210400L);
        setLongElement(term246307, 11, -539125200L);
        setLongElement(term246307, 12, -531352800L);
        setLongElement(term246307, 13, -191365200L);
        setLongElement(term246307, 14, -184197600L);
        setLongElement(term246307, 15, -155163600L);
        setLongElement(term246307, 16, -150069600L);
        setLongElement(term246307, 17, -128898000L);
        setLongElement(term246307, 18, -121125600L);
        setLongElement(term246307, 19, -99954000L);
        setLongElement(term246307, 20, -89589600L);
        setLongElement(term246307, 21, -68418000L);
        setLongElement(term246307, 22, -57967200L);
        setLongElement(term246307, 23, 499748400L);
        setLongElement(term246307, 24, 511236000L);
        setLongElement(term246307, 25, 530593200L);
        setLongElement(term246307, 26, 540266400L);
        setLongElement(term246307, 27, 562129200L);
        setLongElement(term246307, 28, 571197600L);
        setLongElement(term246307, 29, 592974000L);
        setLongElement(term246307, 30, 602042400L);
        setLongElement(term246307, 31, 624423600L);
        setLongElement(term246307, 32, 634701600L);
        setLongElement(term246307, 33, 938919600L);
        setLongElement(term246307, 34, 951616800L);
        setLongElement(term246307, 35, 970974000L);
        setLongElement(term246307, 36, 971575200L);
        setLongElement(term246307, 37, 1003028400L);
        setLongElement(term246307, 38, 1013911200L);
        setField(term246303, term246303.getClass(), "savingsInstantTransitions", term246307);
        setField(term246303, term246303.getClass(), "savingsLocalTransitions", term246347);
        setElement(term246348, 1, term246276);
        setElement(term246348, 3, term246276);
        setElement(term246348, 5, term246276);
        setElement(term246348, 7, term246276);
        setElement(term246348, 9, term246276);
        setElement(term246348, 11, term246276);
        setElement(term246348, 13, term246276);
        setElement(term246348, 15, term246276);
        setElement(term246348, 17, term246276);
        setElement(term246348, 19, term246276);
        setElement(term246348, 21, term246276);
        setElement(term246348, 23, term246276);
        setElement(term246348, 25, term246276);
        setElement(term246348, 27, term246276);
        setElement(term246348, 29, term246276);
        setElement(term246348, 31, term246276);
        setElement(term246348, 33, term246276);
        setElement(term246348, 35, term246276);
        setElement(term246348, 37, term246276);
        setElement(term246348, 39, term246276);
        setField(term246303, term246303.getClass(), "wallOffsets", term246348);
        setField(term246303, term246303.getClass(), "lastRules", term246349);
        setField(term246350, term246350.getClass(), "table", null);
        setField(term246350, term246350.getClass(), "nextTable", null);
        setLongField(term246350, term246350.getClass(), "baseCount", 0L);
        setIntField(term246350, term246350.getClass(), "sizeCtl", 0);
        setIntField(term246350, term246350.getClass(), "transferIndex", 0);
        setIntField(term246350, term246350.getClass(), "cellsBusy", 0);
        setField(term246350, term246350.getClass(), "counterCells", null);
        setField(term246350, term246350.getClass(), "keySet", null);
        setField(term246350, term246350.getClass(), "values", null);
        setField(term246350, term246350.getClass(), "entrySet", null);
        setField(term246350, term246350.getClass(), "keySet", null);
        setField(term246350, term246350.getClass(), "values", null);
        setField(term246303, term246303.getClass(), "lastRulesCache", term246350);
        setField(term246286, term246286.getClass(), "rules", term246303);
        setField(term246265, term246265.getClass(), "zone", term246286);
        setField(term246149, term246149.getClass(), "time_stamp", term246265);
        setField(term246149, term246149.getClass(), "start_up_mode", "VXtvOjnEqD");
        setField(term246149, term246149.getClass(), "cmm_dly_mod", "CvLRyPNOVI");
        setField(term246149, term246149.getClass(), "cmm_dly_sec", "kGkLTNoGnp");
        setField(term246149, term246149.getClass(), "cmm_err_mod", "CptQjqRnUi");
        setField(term246149, term246149.getClass(), "country_code", "gFKwlpZWQn");
        setField(term246149, term246149.getClass(), "region_code", "zkXBYRvjpo");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.ingame.StoreSsRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPd_id", argTypes, term246149, args);
    }

};


