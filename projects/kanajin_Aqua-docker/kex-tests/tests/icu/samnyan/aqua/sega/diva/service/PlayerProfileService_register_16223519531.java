package icu.samnyan.aqua.sega.diva.service;

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
import static icu.samnyan.aqua.sega.diva.service.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class PlayerProfileService_register_16223519531 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3;

    public PlayerProfileService_register_16223519531() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.RegistrationRequest"));
        Object term197 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term198 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term199 = newInstance(Class.forName("java.time.LocalDate"));
        Object term203 = newInstance(Class.forName("java.time.LocalTime"));
        Object term208 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term218 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term235 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term236 = (long[]) newLongArray(1);
        Object[] term238 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term239 = (long[]) newLongArray(39);
        Object[] term279 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term280 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term281 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term282 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term3, term3.getClass(), "pmm", "PAEBtnZtTD");
        setField(term3, term3.getClass(), "idm", "sjlJAEtRrb");
        setField(term3, term3.getClass(), "mmgameid", "MuLcgQHgqz");
        setField(term3, term3.getClass(), "mmuid", "xxtlPwDYFs");
        setField(term3, term3.getClass(), "a_code", "jJCZpVmanW");
        setIntField(term3, term3.getClass(), "aime_id", 1162663216);
        setField(term3, term3.getClass(), "aime_a_code", "EGtDIRbSSb");
        setField(term3, term3.getClass(), "key_obj_type", "SzjVpOQTyS");
        setField(term3, term3.getClass(), "player_name", "MjGYSRKTNF");
        setField(term3, term3.getClass(), "passwd", "hRNSzYYIrc");
        setField(term3, term3.getClass(), "cmd", "RMFIsYGgne");
        setField(term3, term3.getClass(), "req_id", "NRdvgJlhkX");
        setField(term3, term3.getClass(), "game_id", "uuaPigETmJ");
        setField(term3, term3.getClass(), "r_ver", "MxlszYVzRf");
        setField(term3, term3.getClass(), "kc_serial", "LQFpaHEwXR");
        setField(term3, term3.getClass(), "b_serial", "oVcInYnLWB");
        setField(term3, term3.getClass(), "place_id", "aJlieCFVtF");
        setIntField(term199, term199.getClass(), "year", 2012);
        setShortField(term199, term199.getClass(), "month", (short) 8);
        setShortField(term199, term199.getClass(), "day", (short) 25);
        setField(term198, term198.getClass(), "date", term199);
        setByteField(term203, term203.getClass(), "hour", (byte) 5);
        setByteField(term203, term203.getClass(), "minute", (byte) 20);
        setByteField(term203, term203.getClass(), "second", (byte) 50);
        setIntField(term203, term203.getClass(), "nano", 345595912);
        setField(term198, term198.getClass(), "time", term203);
        setField(term197, term197.getClass(), "dateTime", term198);
        setIntField(term208, term208.getClass(), "totalSeconds", -10800);
        setField(term208, term208.getClass(), "id", "-03:00");
        setField(term197, term197.getClass(), "offset", term208);
        setField(term218, term218.getClass(), "id", "America/Recife");
        setLongElement(term236, 0, -1767217224L);
        setField(term235, term235.getClass(), "standardTransitions", term236);
        setElement(term238, 1, term208);
        setField(term235, term235.getClass(), "standardOffsets", term238);
        setLongElement(term239, 0, -1767217224L);
        setLongElement(term239, 1, -1206957600L);
        setLongElement(term239, 2, -1191362400L);
        setLongElement(term239, 3, -1175374800L);
        setLongElement(term239, 4, -1159826400L);
        setLongElement(term239, 5, -633819600L);
        setLongElement(term239, 6, -622069200L);
        setLongElement(term239, 7, -602283600L);
        setLongElement(term239, 8, -591832800L);
        setLongElement(term239, 9, -570747600L);
        setLongElement(term239, 10, -560210400L);
        setLongElement(term239, 11, -539125200L);
        setLongElement(term239, 12, -531352800L);
        setLongElement(term239, 13, -191365200L);
        setLongElement(term239, 14, -184197600L);
        setLongElement(term239, 15, -155163600L);
        setLongElement(term239, 16, -150069600L);
        setLongElement(term239, 17, -128898000L);
        setLongElement(term239, 18, -121125600L);
        setLongElement(term239, 19, -99954000L);
        setLongElement(term239, 20, -89589600L);
        setLongElement(term239, 21, -68418000L);
        setLongElement(term239, 22, -57967200L);
        setLongElement(term239, 23, 499748400L);
        setLongElement(term239, 24, 511236000L);
        setLongElement(term239, 25, 530593200L);
        setLongElement(term239, 26, 540266400L);
        setLongElement(term239, 27, 562129200L);
        setLongElement(term239, 28, 571197600L);
        setLongElement(term239, 29, 592974000L);
        setLongElement(term239, 30, 602042400L);
        setLongElement(term239, 31, 624423600L);
        setLongElement(term239, 32, 634701600L);
        setLongElement(term239, 33, 938919600L);
        setLongElement(term239, 34, 951616800L);
        setLongElement(term239, 35, 970974000L);
        setLongElement(term239, 36, 971575200L);
        setLongElement(term239, 37, 1003028400L);
        setLongElement(term239, 38, 1013911200L);
        setField(term235, term235.getClass(), "savingsInstantTransitions", term239);
        setField(term235, term235.getClass(), "savingsLocalTransitions", term279);
        setElement(term280, 1, term208);
        setElement(term280, 3, term208);
        setElement(term280, 5, term208);
        setElement(term280, 7, term208);
        setElement(term280, 9, term208);
        setElement(term280, 11, term208);
        setElement(term280, 13, term208);
        setElement(term280, 15, term208);
        setElement(term280, 17, term208);
        setElement(term280, 19, term208);
        setElement(term280, 21, term208);
        setElement(term280, 23, term208);
        setElement(term280, 25, term208);
        setElement(term280, 27, term208);
        setElement(term280, 29, term208);
        setElement(term280, 31, term208);
        setElement(term280, 33, term208);
        setElement(term280, 35, term208);
        setElement(term280, 37, term208);
        setElement(term280, 39, term208);
        setField(term235, term235.getClass(), "wallOffsets", term280);
        setField(term235, term235.getClass(), "lastRules", term281);
        setField(term282, term282.getClass(), "table", null);
        setField(term282, term282.getClass(), "nextTable", null);
        setLongField(term282, term282.getClass(), "baseCount", 0L);
        setIntField(term282, term282.getClass(), "sizeCtl", 0);
        setIntField(term282, term282.getClass(), "transferIndex", 0);
        setIntField(term282, term282.getClass(), "cellsBusy", 0);
        setField(term282, term282.getClass(), "counterCells", null);
        setField(term282, term282.getClass(), "keySet", null);
        setField(term282, term282.getClass(), "values", null);
        setField(term282, term282.getClass(), "entrySet", null);
        setField(term282, term282.getClass(), "keySet", null);
        setField(term282, term282.getClass(), "values", null);
        setField(term235, term235.getClass(), "lastRulesCache", term282);
        setField(term218, term218.getClass(), "rules", term235);
        setField(term197, term197.getClass(), "zone", term218);
        setField(term3, term3.getClass(), "time_stamp", term197);
        setField(term3, term3.getClass(), "start_up_mode", "ZiaGIbnzTs");
        setField(term3, term3.getClass(), "cmm_dly_mod", "tbcdzjIfER");
        setField(term3, term3.getClass(), "cmm_dly_sec", "HyxfbSQYBe");
        setField(term3, term3.getClass(), "cmm_err_mod", "pCTimMblYc");
        setField(term3, term3.getClass(), "country_code", "hNxWaHcfhY");
        setField(term3, term3.getClass(), "region_code", "RkybSrpybU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.service.PlayerProfileService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.RegistrationRequest");
        Object[] args = new Object[1];
        args[0] = term3;
        callMethod(klass, "register", argTypes, null, args);
    }

};


