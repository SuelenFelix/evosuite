package icu.samnyan.aqua.sega.diva.model.request.user;

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
import static icu.samnyan.aqua.sega.diva.model.request.user.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class PreStartRequest_setKeyobjtype_97294041716 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19045;

    public PreStartRequest_setKeyobjtype_97294041716() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19045 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.user.PreStartRequest"));
        Object term19216 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term19217 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term19218 = newInstance(Class.forName("java.time.LocalDate"));
        Object term19222 = newInstance(Class.forName("java.time.LocalTime"));
        Object term19227 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term19237 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term19254 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term19255 = (long[]) newLongArray(1);
        Object[] term19257 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term19258 = (long[]) newLongArray(39);
        Object[] term19298 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term19299 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term19300 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term19301 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term19045, term19045.getClass(), "pmm", "EMiMtYgfvr");
        setField(term19045, term19045.getClass(), "idm", "OyYyYYnJuF");
        setField(term19045, term19045.getClass(), "mmgameid", "aYLvcxZohT");
        setField(term19045, term19045.getClass(), "mmuid", "mnHyQbMyld");
        setField(term19045, term19045.getClass(), "a_code", "KHtaDOIcJZ");
        setIntField(term19045, term19045.getClass(), "aime_id", -2003192918);
        setField(term19045, term19045.getClass(), "aime_a_code", "vgdwrCZczl");
        setField(term19045, term19045.getClass(), "key_obj_type", "gKMNrpKBpu");
        setBooleanField(term19045, term19045.getClass(), "exec_vu", true);
        setField(term19045, term19045.getClass(), "cmd", "ZbHJVEqcoa");
        setField(term19045, term19045.getClass(), "req_id", "awDQVEVIKi");
        setField(term19045, term19045.getClass(), "game_id", "HJwNgUzZZR");
        setField(term19045, term19045.getClass(), "r_ver", "FvUCZgTXhq");
        setField(term19045, term19045.getClass(), "kc_serial", "wWWidPCHzx");
        setField(term19045, term19045.getClass(), "b_serial", "OwPIiBRuKK");
        setField(term19045, term19045.getClass(), "place_id", "sgfGySMODT");
        setIntField(term19218, term19218.getClass(), "year", 2010);
        setShortField(term19218, term19218.getClass(), "month", (short) 1);
        setShortField(term19218, term19218.getClass(), "day", (short) 17);
        setField(term19217, term19217.getClass(), "date", term19218);
        setByteField(term19222, term19222.getClass(), "hour", (byte) 13);
        setByteField(term19222, term19222.getClass(), "minute", (byte) 5);
        setByteField(term19222, term19222.getClass(), "second", (byte) 51);
        setIntField(term19222, term19222.getClass(), "nano", 362260580);
        setField(term19217, term19217.getClass(), "time", term19222);
        setField(term19216, term19216.getClass(), "dateTime", term19217);
        setIntField(term19227, term19227.getClass(), "totalSeconds", -10800);
        setField(term19227, term19227.getClass(), "id", "-03:00");
        setField(term19216, term19216.getClass(), "offset", term19227);
        setField(term19237, term19237.getClass(), "id", "America/Recife");
        setLongElement(term19255, 0, -1767217224L);
        setField(term19254, term19254.getClass(), "standardTransitions", term19255);
        setElement(term19257, 1, term19227);
        setField(term19254, term19254.getClass(), "standardOffsets", term19257);
        setLongElement(term19258, 0, -1767217224L);
        setLongElement(term19258, 1, -1206957600L);
        setLongElement(term19258, 2, -1191362400L);
        setLongElement(term19258, 3, -1175374800L);
        setLongElement(term19258, 4, -1159826400L);
        setLongElement(term19258, 5, -633819600L);
        setLongElement(term19258, 6, -622069200L);
        setLongElement(term19258, 7, -602283600L);
        setLongElement(term19258, 8, -591832800L);
        setLongElement(term19258, 9, -570747600L);
        setLongElement(term19258, 10, -560210400L);
        setLongElement(term19258, 11, -539125200L);
        setLongElement(term19258, 12, -531352800L);
        setLongElement(term19258, 13, -191365200L);
        setLongElement(term19258, 14, -184197600L);
        setLongElement(term19258, 15, -155163600L);
        setLongElement(term19258, 16, -150069600L);
        setLongElement(term19258, 17, -128898000L);
        setLongElement(term19258, 18, -121125600L);
        setLongElement(term19258, 19, -99954000L);
        setLongElement(term19258, 20, -89589600L);
        setLongElement(term19258, 21, -68418000L);
        setLongElement(term19258, 22, -57967200L);
        setLongElement(term19258, 23, 499748400L);
        setLongElement(term19258, 24, 511236000L);
        setLongElement(term19258, 25, 530593200L);
        setLongElement(term19258, 26, 540266400L);
        setLongElement(term19258, 27, 562129200L);
        setLongElement(term19258, 28, 571197600L);
        setLongElement(term19258, 29, 592974000L);
        setLongElement(term19258, 30, 602042400L);
        setLongElement(term19258, 31, 624423600L);
        setLongElement(term19258, 32, 634701600L);
        setLongElement(term19258, 33, 938919600L);
        setLongElement(term19258, 34, 951616800L);
        setLongElement(term19258, 35, 970974000L);
        setLongElement(term19258, 36, 971575200L);
        setLongElement(term19258, 37, 1003028400L);
        setLongElement(term19258, 38, 1013911200L);
        setField(term19254, term19254.getClass(), "savingsInstantTransitions", term19258);
        setField(term19254, term19254.getClass(), "savingsLocalTransitions", term19298);
        setElement(term19299, 1, term19227);
        setElement(term19299, 3, term19227);
        setElement(term19299, 5, term19227);
        setElement(term19299, 7, term19227);
        setElement(term19299, 9, term19227);
        setElement(term19299, 11, term19227);
        setElement(term19299, 13, term19227);
        setElement(term19299, 15, term19227);
        setElement(term19299, 17, term19227);
        setElement(term19299, 19, term19227);
        setElement(term19299, 21, term19227);
        setElement(term19299, 23, term19227);
        setElement(term19299, 25, term19227);
        setElement(term19299, 27, term19227);
        setElement(term19299, 29, term19227);
        setElement(term19299, 31, term19227);
        setElement(term19299, 33, term19227);
        setElement(term19299, 35, term19227);
        setElement(term19299, 37, term19227);
        setElement(term19299, 39, term19227);
        setField(term19254, term19254.getClass(), "wallOffsets", term19299);
        setField(term19254, term19254.getClass(), "lastRules", term19300);
        setField(term19301, term19301.getClass(), "table", null);
        setField(term19301, term19301.getClass(), "nextTable", null);
        setLongField(term19301, term19301.getClass(), "baseCount", 0L);
        setIntField(term19301, term19301.getClass(), "sizeCtl", 0);
        setIntField(term19301, term19301.getClass(), "transferIndex", 0);
        setIntField(term19301, term19301.getClass(), "cellsBusy", 0);
        setField(term19301, term19301.getClass(), "counterCells", null);
        setField(term19301, term19301.getClass(), "keySet", null);
        setField(term19301, term19301.getClass(), "values", null);
        setField(term19301, term19301.getClass(), "entrySet", null);
        setField(term19301, term19301.getClass(), "keySet", null);
        setField(term19301, term19301.getClass(), "values", null);
        setField(term19254, term19254.getClass(), "lastRulesCache", term19301);
        setField(term19237, term19237.getClass(), "rules", term19254);
        setField(term19216, term19216.getClass(), "zone", term19237);
        setField(term19045, term19045.getClass(), "time_stamp", term19216);
        setField(term19045, term19045.getClass(), "start_up_mode", "ndAITnOsny");
        setField(term19045, term19045.getClass(), "cmm_dly_mod", "CVZnTiJucs");
        setField(term19045, term19045.getClass(), "cmm_dly_sec", "ecHEQufXoq");
        setField(term19045, term19045.getClass(), "cmm_err_mod", "btBLMvHzJg");
        setField(term19045, term19045.getClass(), "country_code", "JdOMfNWgLP");
        setField(term19045, term19045.getClass(), "region_code", "uWqXrwAsDU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.user.PreStartRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "hgFbWAUtsu";
        callMethod(klass, "setKey_obj_type", argTypes, term19045, args);
    }

};


