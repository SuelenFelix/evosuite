package icu.samnyan.aqua.sega.diva.handler.card;

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
import static icu.samnyan.aqua.sega.diva.handler.card.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class RegistrationHandler_handle_5589632521 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term2;

    public RegistrationHandler_handle_5589632521() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.handler.card.RegistrationHandler"));
        setField(term1, term1.getClass(), "playerProfileService", null);
        setField(term1, term1.getClass(), "mapper", null);
        term2 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.RegistrationRequest"));
        Object term196 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term197 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term198 = newInstance(Class.forName("java.time.LocalDate"));
        Object term202 = newInstance(Class.forName("java.time.LocalTime"));
        Object term207 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term217 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term234 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term235 = (long[]) newLongArray(1);
        Object[] term237 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term238 = (long[]) newLongArray(39);
        Object[] term278 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term279 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term280 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term281 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term2, term2.getClass(), "pmm", "PAEBtnZtTD");
        setField(term2, term2.getClass(), "idm", "sjlJAEtRrb");
        setField(term2, term2.getClass(), "mmgameid", "MuLcgQHgqz");
        setField(term2, term2.getClass(), "mmuid", "xxtlPwDYFs");
        setField(term2, term2.getClass(), "a_code", "jJCZpVmanW");
        setIntField(term2, term2.getClass(), "aime_id", 568599855);
        setField(term2, term2.getClass(), "aime_a_code", "EGtDIRbSSb");
        setField(term2, term2.getClass(), "key_obj_type", "SzjVpOQTyS");
        setField(term2, term2.getClass(), "player_name", "MjGYSRKTNF");
        setField(term2, term2.getClass(), "passwd", "hRNSzYYIrc");
        setField(term2, term2.getClass(), "cmd", "RMFIsYGgne");
        setField(term2, term2.getClass(), "req_id", "NRdvgJlhkX");
        setField(term2, term2.getClass(), "game_id", "uuaPigETmJ");
        setField(term2, term2.getClass(), "r_ver", "MxlszYVzRf");
        setField(term2, term2.getClass(), "kc_serial", "LQFpaHEwXR");
        setField(term2, term2.getClass(), "b_serial", "oVcInYnLWB");
        setField(term2, term2.getClass(), "place_id", "aJlieCFVtF");
        setIntField(term198, term198.getClass(), "year", 2012);
        setShortField(term198, term198.getClass(), "month", (short) 8);
        setShortField(term198, term198.getClass(), "day", (short) 25);
        setField(term197, term197.getClass(), "date", term198);
        setByteField(term202, term202.getClass(), "hour", (byte) 5);
        setByteField(term202, term202.getClass(), "minute", (byte) 20);
        setByteField(term202, term202.getClass(), "second", (byte) 50);
        setIntField(term202, term202.getClass(), "nano", 345595912);
        setField(term197, term197.getClass(), "time", term202);
        setField(term196, term196.getClass(), "dateTime", term197);
        setIntField(term207, term207.getClass(), "totalSeconds", -10800);
        setField(term207, term207.getClass(), "id", "-03:00");
        setField(term196, term196.getClass(), "offset", term207);
        setField(term217, term217.getClass(), "id", "America/Recife");
        setLongElement(term235, 0, -1767217224L);
        setField(term234, term234.getClass(), "standardTransitions", term235);
        setElement(term237, 1, term207);
        setField(term234, term234.getClass(), "standardOffsets", term237);
        setLongElement(term238, 0, -1767217224L);
        setLongElement(term238, 1, -1206957600L);
        setLongElement(term238, 2, -1191362400L);
        setLongElement(term238, 3, -1175374800L);
        setLongElement(term238, 4, -1159826400L);
        setLongElement(term238, 5, -633819600L);
        setLongElement(term238, 6, -622069200L);
        setLongElement(term238, 7, -602283600L);
        setLongElement(term238, 8, -591832800L);
        setLongElement(term238, 9, -570747600L);
        setLongElement(term238, 10, -560210400L);
        setLongElement(term238, 11, -539125200L);
        setLongElement(term238, 12, -531352800L);
        setLongElement(term238, 13, -191365200L);
        setLongElement(term238, 14, -184197600L);
        setLongElement(term238, 15, -155163600L);
        setLongElement(term238, 16, -150069600L);
        setLongElement(term238, 17, -128898000L);
        setLongElement(term238, 18, -121125600L);
        setLongElement(term238, 19, -99954000L);
        setLongElement(term238, 20, -89589600L);
        setLongElement(term238, 21, -68418000L);
        setLongElement(term238, 22, -57967200L);
        setLongElement(term238, 23, 499748400L);
        setLongElement(term238, 24, 511236000L);
        setLongElement(term238, 25, 530593200L);
        setLongElement(term238, 26, 540266400L);
        setLongElement(term238, 27, 562129200L);
        setLongElement(term238, 28, 571197600L);
        setLongElement(term238, 29, 592974000L);
        setLongElement(term238, 30, 602042400L);
        setLongElement(term238, 31, 624423600L);
        setLongElement(term238, 32, 634701600L);
        setLongElement(term238, 33, 938919600L);
        setLongElement(term238, 34, 951616800L);
        setLongElement(term238, 35, 970974000L);
        setLongElement(term238, 36, 971575200L);
        setLongElement(term238, 37, 1003028400L);
        setLongElement(term238, 38, 1013911200L);
        setField(term234, term234.getClass(), "savingsInstantTransitions", term238);
        setField(term234, term234.getClass(), "savingsLocalTransitions", term278);
        setElement(term279, 1, term207);
        setElement(term279, 3, term207);
        setElement(term279, 5, term207);
        setElement(term279, 7, term207);
        setElement(term279, 9, term207);
        setElement(term279, 11, term207);
        setElement(term279, 13, term207);
        setElement(term279, 15, term207);
        setElement(term279, 17, term207);
        setElement(term279, 19, term207);
        setElement(term279, 21, term207);
        setElement(term279, 23, term207);
        setElement(term279, 25, term207);
        setElement(term279, 27, term207);
        setElement(term279, 29, term207);
        setElement(term279, 31, term207);
        setElement(term279, 33, term207);
        setElement(term279, 35, term207);
        setElement(term279, 37, term207);
        setElement(term279, 39, term207);
        setField(term234, term234.getClass(), "wallOffsets", term279);
        setField(term234, term234.getClass(), "lastRules", term280);
        setField(term281, term281.getClass(), "table", null);
        setField(term281, term281.getClass(), "nextTable", null);
        setLongField(term281, term281.getClass(), "baseCount", 0L);
        setIntField(term281, term281.getClass(), "sizeCtl", 0);
        setIntField(term281, term281.getClass(), "transferIndex", 0);
        setIntField(term281, term281.getClass(), "cellsBusy", 0);
        setField(term281, term281.getClass(), "counterCells", null);
        setField(term281, term281.getClass(), "keySet", null);
        setField(term281, term281.getClass(), "values", null);
        setField(term281, term281.getClass(), "entrySet", null);
        setField(term281, term281.getClass(), "keySet", null);
        setField(term281, term281.getClass(), "values", null);
        setField(term234, term234.getClass(), "lastRulesCache", term281);
        setField(term217, term217.getClass(), "rules", term234);
        setField(term196, term196.getClass(), "zone", term217);
        setField(term2, term2.getClass(), "time_stamp", term196);
        setField(term2, term2.getClass(), "start_up_mode", "ZiaGIbnzTs");
        setField(term2, term2.getClass(), "cmm_dly_mod", "tbcdzjIfER");
        setField(term2, term2.getClass(), "cmm_dly_sec", "HyxfbSQYBe");
        setField(term2, term2.getClass(), "cmm_err_mod", "pCTimMblYc");
        setField(term2, term2.getClass(), "country_code", "hNxWaHcfhY");
        setField(term2, term2.getClass(), "region_code", "RkybSrpybU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.handler.card.RegistrationHandler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.RegistrationRequest");
        Object[] args = new Object[1];
        args[0] = term2;
        callMethod(klass, "handle", argTypes, term1, args);
    }

};


