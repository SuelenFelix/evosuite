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

public class ChangePasswdRequest_getAcode_247281020 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public ChangePasswdRequest_getAcode_247281020() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.ChangePasswdRequest"));
        Object term125 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term126 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term127 = newInstance(Class.forName("java.time.LocalDate"));
        Object term131 = newInstance(Class.forName("java.time.LocalTime"));
        Object term136 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term146 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term163 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term164 = (long[]) newLongArray(1);
        Object[] term166 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term167 = (long[]) newLongArray(39);
        Object[] term207 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term208 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term209 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term210 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term1, term1.getClass(), "a_code", "PAEBtnZtTD");
        setIntField(term1, term1.getClass(), "aime_id", 568599855);
        setField(term1, term1.getClass(), "aime_a_code", "sjlJAEtRrb");
        setIntField(term1, term1.getClass(), "pd_id", 1162663216);
        setIntField(term1, term1.getClass(), "accept_idx", 1484323161);
        setField(term1, term1.getClass(), "new_passwd", "MuLcgQHgqz");
        setField(term1, term1.getClass(), "cmd", "xxtlPwDYFs");
        setField(term1, term1.getClass(), "req_id", "jJCZpVmanW");
        setField(term1, term1.getClass(), "game_id", "EGtDIRbSSb");
        setField(term1, term1.getClass(), "r_ver", "SzjVpOQTyS");
        setField(term1, term1.getClass(), "kc_serial", "MjGYSRKTNF");
        setField(term1, term1.getClass(), "b_serial", "hRNSzYYIrc");
        setField(term1, term1.getClass(), "place_id", "RMFIsYGgne");
        setIntField(term127, term127.getClass(), "year", 2012);
        setShortField(term127, term127.getClass(), "month", (short) 8);
        setShortField(term127, term127.getClass(), "day", (short) 25);
        setField(term126, term126.getClass(), "date", term127);
        setByteField(term131, term131.getClass(), "hour", (byte) 5);
        setByteField(term131, term131.getClass(), "minute", (byte) 20);
        setByteField(term131, term131.getClass(), "second", (byte) 50);
        setIntField(term131, term131.getClass(), "nano", 345595912);
        setField(term126, term126.getClass(), "time", term131);
        setField(term125, term125.getClass(), "dateTime", term126);
        setIntField(term136, term136.getClass(), "totalSeconds", -10800);
        setField(term136, term136.getClass(), "id", "-03:00");
        setField(term125, term125.getClass(), "offset", term136);
        setField(term146, term146.getClass(), "id", "America/Recife");
        setLongElement(term164, 0, -1767217224L);
        setField(term163, term163.getClass(), "standardTransitions", term164);
        setElement(term166, 1, term136);
        setField(term163, term163.getClass(), "standardOffsets", term166);
        setLongElement(term167, 0, -1767217224L);
        setLongElement(term167, 1, -1206957600L);
        setLongElement(term167, 2, -1191362400L);
        setLongElement(term167, 3, -1175374800L);
        setLongElement(term167, 4, -1159826400L);
        setLongElement(term167, 5, -633819600L);
        setLongElement(term167, 6, -622069200L);
        setLongElement(term167, 7, -602283600L);
        setLongElement(term167, 8, -591832800L);
        setLongElement(term167, 9, -570747600L);
        setLongElement(term167, 10, -560210400L);
        setLongElement(term167, 11, -539125200L);
        setLongElement(term167, 12, -531352800L);
        setLongElement(term167, 13, -191365200L);
        setLongElement(term167, 14, -184197600L);
        setLongElement(term167, 15, -155163600L);
        setLongElement(term167, 16, -150069600L);
        setLongElement(term167, 17, -128898000L);
        setLongElement(term167, 18, -121125600L);
        setLongElement(term167, 19, -99954000L);
        setLongElement(term167, 20, -89589600L);
        setLongElement(term167, 21, -68418000L);
        setLongElement(term167, 22, -57967200L);
        setLongElement(term167, 23, 499748400L);
        setLongElement(term167, 24, 511236000L);
        setLongElement(term167, 25, 530593200L);
        setLongElement(term167, 26, 540266400L);
        setLongElement(term167, 27, 562129200L);
        setLongElement(term167, 28, 571197600L);
        setLongElement(term167, 29, 592974000L);
        setLongElement(term167, 30, 602042400L);
        setLongElement(term167, 31, 624423600L);
        setLongElement(term167, 32, 634701600L);
        setLongElement(term167, 33, 938919600L);
        setLongElement(term167, 34, 951616800L);
        setLongElement(term167, 35, 970974000L);
        setLongElement(term167, 36, 971575200L);
        setLongElement(term167, 37, 1003028400L);
        setLongElement(term167, 38, 1013911200L);
        setField(term163, term163.getClass(), "savingsInstantTransitions", term167);
        setField(term163, term163.getClass(), "savingsLocalTransitions", term207);
        setElement(term208, 1, term136);
        setElement(term208, 3, term136);
        setElement(term208, 5, term136);
        setElement(term208, 7, term136);
        setElement(term208, 9, term136);
        setElement(term208, 11, term136);
        setElement(term208, 13, term136);
        setElement(term208, 15, term136);
        setElement(term208, 17, term136);
        setElement(term208, 19, term136);
        setElement(term208, 21, term136);
        setElement(term208, 23, term136);
        setElement(term208, 25, term136);
        setElement(term208, 27, term136);
        setElement(term208, 29, term136);
        setElement(term208, 31, term136);
        setElement(term208, 33, term136);
        setElement(term208, 35, term136);
        setElement(term208, 37, term136);
        setElement(term208, 39, term136);
        setField(term163, term163.getClass(), "wallOffsets", term208);
        setField(term163, term163.getClass(), "lastRules", term209);
        setField(term210, term210.getClass(), "table", null);
        setField(term210, term210.getClass(), "nextTable", null);
        setLongField(term210, term210.getClass(), "baseCount", 0L);
        setIntField(term210, term210.getClass(), "sizeCtl", 0);
        setIntField(term210, term210.getClass(), "transferIndex", 0);
        setIntField(term210, term210.getClass(), "cellsBusy", 0);
        setField(term210, term210.getClass(), "counterCells", null);
        setField(term210, term210.getClass(), "keySet", null);
        setField(term210, term210.getClass(), "values", null);
        setField(term210, term210.getClass(), "entrySet", null);
        setField(term210, term210.getClass(), "keySet", null);
        setField(term210, term210.getClass(), "values", null);
        setField(term163, term163.getClass(), "lastRulesCache", term210);
        setField(term146, term146.getClass(), "rules", term163);
        setField(term125, term125.getClass(), "zone", term146);
        setField(term1, term1.getClass(), "time_stamp", term125);
        setField(term1, term1.getClass(), "start_up_mode", "NRdvgJlhkX");
        setField(term1, term1.getClass(), "cmm_dly_mod", "uuaPigETmJ");
        setField(term1, term1.getClass(), "cmm_dly_sec", "MxlszYVzRf");
        setField(term1, term1.getClass(), "cmm_err_mod", "LQFpaHEwXR");
        setField(term1, term1.getClass(), "country_code", "oVcInYnLWB");
        setField(term1, term1.getClass(), "region_code", "aJlieCFVtF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.ChangePasswdRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getA_code", argTypes, term1, args);
    }

};


