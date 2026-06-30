package icu.samnyan.aqua.sega.diva.handler.ingame;

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
import static icu.samnyan.aqua.sega.diva.handler.ingame.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class BuyModuleHandler_handle_8349956420 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public BuyModuleHandler_handle_8349956420() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.ingame.BuyModuleRequest"));
        Object term91 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term92 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term93 = newInstance(Class.forName("java.time.LocalDate"));
        Object term97 = newInstance(Class.forName("java.time.LocalTime"));
        Object term102 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term112 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term129 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term130 = (long[]) newLongArray(1);
        Object[] term132 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term133 = (long[]) newLongArray(39);
        Object[] term173 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term174 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term175 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term176 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setIntField(term1, term1.getClass(), "pd_id", 568599855);
        setIntField(term1, term1.getClass(), "accept_idx", 1162663216);
        setIntField(term1, term1.getClass(), "start_idx", 1484323161);
        setIntField(term1, term1.getClass(), "mdl_id", 391863371);
        setIntField(term1, term1.getClass(), "mdl_price", -1922583790);
        setField(term1, term1.getClass(), "cmd", "PAEBtnZtTD");
        setField(term1, term1.getClass(), "req_id", "sjlJAEtRrb");
        setField(term1, term1.getClass(), "game_id", "MuLcgQHgqz");
        setField(term1, term1.getClass(), "r_ver", "xxtlPwDYFs");
        setField(term1, term1.getClass(), "kc_serial", "jJCZpVmanW");
        setField(term1, term1.getClass(), "b_serial", "EGtDIRbSSb");
        setField(term1, term1.getClass(), "place_id", "SzjVpOQTyS");
        setIntField(term93, term93.getClass(), "year", 2012);
        setShortField(term93, term93.getClass(), "month", (short) 8);
        setShortField(term93, term93.getClass(), "day", (short) 25);
        setField(term92, term92.getClass(), "date", term93);
        setByteField(term97, term97.getClass(), "hour", (byte) 5);
        setByteField(term97, term97.getClass(), "minute", (byte) 20);
        setByteField(term97, term97.getClass(), "second", (byte) 50);
        setIntField(term97, term97.getClass(), "nano", 345595912);
        setField(term92, term92.getClass(), "time", term97);
        setField(term91, term91.getClass(), "dateTime", term92);
        setIntField(term102, term102.getClass(), "totalSeconds", -10800);
        setField(term102, term102.getClass(), "id", "-03:00");
        setField(term91, term91.getClass(), "offset", term102);
        setField(term112, term112.getClass(), "id", "America/Recife");
        setLongElement(term130, 0, -1767217224L);
        setField(term129, term129.getClass(), "standardTransitions", term130);
        setElement(term132, 1, term102);
        setField(term129, term129.getClass(), "standardOffsets", term132);
        setLongElement(term133, 0, -1767217224L);
        setLongElement(term133, 1, -1206957600L);
        setLongElement(term133, 2, -1191362400L);
        setLongElement(term133, 3, -1175374800L);
        setLongElement(term133, 4, -1159826400L);
        setLongElement(term133, 5, -633819600L);
        setLongElement(term133, 6, -622069200L);
        setLongElement(term133, 7, -602283600L);
        setLongElement(term133, 8, -591832800L);
        setLongElement(term133, 9, -570747600L);
        setLongElement(term133, 10, -560210400L);
        setLongElement(term133, 11, -539125200L);
        setLongElement(term133, 12, -531352800L);
        setLongElement(term133, 13, -191365200L);
        setLongElement(term133, 14, -184197600L);
        setLongElement(term133, 15, -155163600L);
        setLongElement(term133, 16, -150069600L);
        setLongElement(term133, 17, -128898000L);
        setLongElement(term133, 18, -121125600L);
        setLongElement(term133, 19, -99954000L);
        setLongElement(term133, 20, -89589600L);
        setLongElement(term133, 21, -68418000L);
        setLongElement(term133, 22, -57967200L);
        setLongElement(term133, 23, 499748400L);
        setLongElement(term133, 24, 511236000L);
        setLongElement(term133, 25, 530593200L);
        setLongElement(term133, 26, 540266400L);
        setLongElement(term133, 27, 562129200L);
        setLongElement(term133, 28, 571197600L);
        setLongElement(term133, 29, 592974000L);
        setLongElement(term133, 30, 602042400L);
        setLongElement(term133, 31, 624423600L);
        setLongElement(term133, 32, 634701600L);
        setLongElement(term133, 33, 938919600L);
        setLongElement(term133, 34, 951616800L);
        setLongElement(term133, 35, 970974000L);
        setLongElement(term133, 36, 971575200L);
        setLongElement(term133, 37, 1003028400L);
        setLongElement(term133, 38, 1013911200L);
        setField(term129, term129.getClass(), "savingsInstantTransitions", term133);
        setField(term129, term129.getClass(), "savingsLocalTransitions", term173);
        setElement(term174, 1, term102);
        setElement(term174, 3, term102);
        setElement(term174, 5, term102);
        setElement(term174, 7, term102);
        setElement(term174, 9, term102);
        setElement(term174, 11, term102);
        setElement(term174, 13, term102);
        setElement(term174, 15, term102);
        setElement(term174, 17, term102);
        setElement(term174, 19, term102);
        setElement(term174, 21, term102);
        setElement(term174, 23, term102);
        setElement(term174, 25, term102);
        setElement(term174, 27, term102);
        setElement(term174, 29, term102);
        setElement(term174, 31, term102);
        setElement(term174, 33, term102);
        setElement(term174, 35, term102);
        setElement(term174, 37, term102);
        setElement(term174, 39, term102);
        setField(term129, term129.getClass(), "wallOffsets", term174);
        setField(term129, term129.getClass(), "lastRules", term175);
        setField(term176, term176.getClass(), "table", null);
        setField(term176, term176.getClass(), "nextTable", null);
        setLongField(term176, term176.getClass(), "baseCount", 0L);
        setIntField(term176, term176.getClass(), "sizeCtl", 0);
        setIntField(term176, term176.getClass(), "transferIndex", 0);
        setIntField(term176, term176.getClass(), "cellsBusy", 0);
        setField(term176, term176.getClass(), "counterCells", null);
        setField(term176, term176.getClass(), "keySet", null);
        setField(term176, term176.getClass(), "values", null);
        setField(term176, term176.getClass(), "entrySet", null);
        setField(term176, term176.getClass(), "keySet", null);
        setField(term176, term176.getClass(), "values", null);
        setField(term129, term129.getClass(), "lastRulesCache", term176);
        setField(term112, term112.getClass(), "rules", term129);
        setField(term91, term91.getClass(), "zone", term112);
        setField(term1, term1.getClass(), "time_stamp", term91);
        setField(term1, term1.getClass(), "start_up_mode", "MjGYSRKTNF");
        setField(term1, term1.getClass(), "cmm_dly_mod", "hRNSzYYIrc");
        setField(term1, term1.getClass(), "cmm_dly_sec", "RMFIsYGgne");
        setField(term1, term1.getClass(), "cmm_err_mod", "NRdvgJlhkX");
        setField(term1, term1.getClass(), "country_code", "uuaPigETmJ");
        setField(term1, term1.getClass(), "region_code", "MxlszYVzRf");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.handler.ingame.BuyModuleHandler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.diva.model.request.ingame.BuyModuleRequest");
        Object[] args = new Object[1];
        args[0] = term1;
        callMethod(klass, "handle", argTypes, null, args);
    }

};


