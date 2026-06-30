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

public class RegistrationRequest_setPasswd_186187489619 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18539;

    public RegistrationRequest_setPasswd_186187489619() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18539 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.RegistrationRequest"));
        Object term18733 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term18734 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term18735 = newInstance(Class.forName("java.time.LocalDate"));
        Object term18739 = newInstance(Class.forName("java.time.LocalTime"));
        Object term18744 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term18754 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term18771 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term18772 = (long[]) newLongArray(1);
        Object[] term18774 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term18775 = (long[]) newLongArray(39);
        Object[] term18815 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term18816 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term18817 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term18818 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term18539, term18539.getClass(), "pmm", "ZDhASPHjDG");
        setField(term18539, term18539.getClass(), "idm", "HNVOAXYNEZ");
        setField(term18539, term18539.getClass(), "mmgameid", "gbbYBYyfvr");
        setField(term18539, term18539.getClass(), "mmuid", "SrWMUlbtWV");
        setField(term18539, term18539.getClass(), "a_code", "VePIumgrrU");
        setIntField(term18539, term18539.getClass(), "aime_id", -1371869594);
        setField(term18539, term18539.getClass(), "aime_a_code", "DPwIqlszZo");
        setField(term18539, term18539.getClass(), "key_obj_type", "mNgDshwZNc");
        setField(term18539, term18539.getClass(), "player_name", "pDqgDbJoFw");
        setField(term18539, term18539.getClass(), "passwd", "iVOvTzOxwt");
        setField(term18539, term18539.getClass(), "cmd", "BjZQdecXvB");
        setField(term18539, term18539.getClass(), "req_id", "iUkOOQhEkw");
        setField(term18539, term18539.getClass(), "game_id", "wmVoFoUVmU");
        setField(term18539, term18539.getClass(), "r_ver", "lLiSiPCciB");
        setField(term18539, term18539.getClass(), "kc_serial", "PsMKIIEwdR");
        setField(term18539, term18539.getClass(), "b_serial", "RbQmXqfXAT");
        setField(term18539, term18539.getClass(), "place_id", "fcCAsvfBbe");
        setIntField(term18735, term18735.getClass(), "year", 2012);
        setShortField(term18735, term18735.getClass(), "month", (short) 8);
        setShortField(term18735, term18735.getClass(), "day", (short) 25);
        setField(term18734, term18734.getClass(), "date", term18735);
        setByteField(term18739, term18739.getClass(), "hour", (byte) 19);
        setByteField(term18739, term18739.getClass(), "minute", (byte) 49);
        setByteField(term18739, term18739.getClass(), "second", (byte) 8);
        setIntField(term18739, term18739.getClass(), "nano", 912685024);
        setField(term18734, term18734.getClass(), "time", term18739);
        setField(term18733, term18733.getClass(), "dateTime", term18734);
        setIntField(term18744, term18744.getClass(), "totalSeconds", -10800);
        setField(term18744, term18744.getClass(), "id", "-03:00");
        setField(term18733, term18733.getClass(), "offset", term18744);
        setField(term18754, term18754.getClass(), "id", "America/Recife");
        setLongElement(term18772, 0, -1767217224L);
        setField(term18771, term18771.getClass(), "standardTransitions", term18772);
        setElement(term18774, 1, term18744);
        setField(term18771, term18771.getClass(), "standardOffsets", term18774);
        setLongElement(term18775, 0, -1767217224L);
        setLongElement(term18775, 1, -1206957600L);
        setLongElement(term18775, 2, -1191362400L);
        setLongElement(term18775, 3, -1175374800L);
        setLongElement(term18775, 4, -1159826400L);
        setLongElement(term18775, 5, -633819600L);
        setLongElement(term18775, 6, -622069200L);
        setLongElement(term18775, 7, -602283600L);
        setLongElement(term18775, 8, -591832800L);
        setLongElement(term18775, 9, -570747600L);
        setLongElement(term18775, 10, -560210400L);
        setLongElement(term18775, 11, -539125200L);
        setLongElement(term18775, 12, -531352800L);
        setLongElement(term18775, 13, -191365200L);
        setLongElement(term18775, 14, -184197600L);
        setLongElement(term18775, 15, -155163600L);
        setLongElement(term18775, 16, -150069600L);
        setLongElement(term18775, 17, -128898000L);
        setLongElement(term18775, 18, -121125600L);
        setLongElement(term18775, 19, -99954000L);
        setLongElement(term18775, 20, -89589600L);
        setLongElement(term18775, 21, -68418000L);
        setLongElement(term18775, 22, -57967200L);
        setLongElement(term18775, 23, 499748400L);
        setLongElement(term18775, 24, 511236000L);
        setLongElement(term18775, 25, 530593200L);
        setLongElement(term18775, 26, 540266400L);
        setLongElement(term18775, 27, 562129200L);
        setLongElement(term18775, 28, 571197600L);
        setLongElement(term18775, 29, 592974000L);
        setLongElement(term18775, 30, 602042400L);
        setLongElement(term18775, 31, 624423600L);
        setLongElement(term18775, 32, 634701600L);
        setLongElement(term18775, 33, 938919600L);
        setLongElement(term18775, 34, 951616800L);
        setLongElement(term18775, 35, 970974000L);
        setLongElement(term18775, 36, 971575200L);
        setLongElement(term18775, 37, 1003028400L);
        setLongElement(term18775, 38, 1013911200L);
        setField(term18771, term18771.getClass(), "savingsInstantTransitions", term18775);
        setField(term18771, term18771.getClass(), "savingsLocalTransitions", term18815);
        setElement(term18816, 1, term18744);
        setElement(term18816, 3, term18744);
        setElement(term18816, 5, term18744);
        setElement(term18816, 7, term18744);
        setElement(term18816, 9, term18744);
        setElement(term18816, 11, term18744);
        setElement(term18816, 13, term18744);
        setElement(term18816, 15, term18744);
        setElement(term18816, 17, term18744);
        setElement(term18816, 19, term18744);
        setElement(term18816, 21, term18744);
        setElement(term18816, 23, term18744);
        setElement(term18816, 25, term18744);
        setElement(term18816, 27, term18744);
        setElement(term18816, 29, term18744);
        setElement(term18816, 31, term18744);
        setElement(term18816, 33, term18744);
        setElement(term18816, 35, term18744);
        setElement(term18816, 37, term18744);
        setElement(term18816, 39, term18744);
        setField(term18771, term18771.getClass(), "wallOffsets", term18816);
        setField(term18771, term18771.getClass(), "lastRules", term18817);
        setField(term18818, term18818.getClass(), "table", null);
        setField(term18818, term18818.getClass(), "nextTable", null);
        setLongField(term18818, term18818.getClass(), "baseCount", 0L);
        setIntField(term18818, term18818.getClass(), "sizeCtl", 0);
        setIntField(term18818, term18818.getClass(), "transferIndex", 0);
        setIntField(term18818, term18818.getClass(), "cellsBusy", 0);
        setField(term18818, term18818.getClass(), "counterCells", null);
        setField(term18818, term18818.getClass(), "keySet", null);
        setField(term18818, term18818.getClass(), "values", null);
        setField(term18818, term18818.getClass(), "entrySet", null);
        setField(term18818, term18818.getClass(), "keySet", null);
        setField(term18818, term18818.getClass(), "values", null);
        setField(term18771, term18771.getClass(), "lastRulesCache", term18818);
        setField(term18754, term18754.getClass(), "rules", term18771);
        setField(term18733, term18733.getClass(), "zone", term18754);
        setField(term18539, term18539.getClass(), "time_stamp", term18733);
        setField(term18539, term18539.getClass(), "start_up_mode", "mUNcKUxghj");
        setField(term18539, term18539.getClass(), "cmm_dly_mod", "lnvLKbtveE");
        setField(term18539, term18539.getClass(), "cmm_dly_sec", "FfrrEhTHzQ");
        setField(term18539, term18539.getClass(), "cmm_err_mod", "LXnDNrMsqT");
        setField(term18539, term18539.getClass(), "country_code", "ZLQamJFBmu");
        setField(term18539, term18539.getClass(), "region_code", "ZWcOCwKNvd");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.RegistrationRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "GTmoNrziyc";
        callMethod(klass, "setPasswd", argTypes, term18539, args);
    }

};


