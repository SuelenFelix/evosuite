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

public class RegistrationRequest_setKeyobjtype_34936343617 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17223;

    public RegistrationRequest_setKeyobjtype_34936343617() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17223 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.RegistrationRequest"));
        Object term17417 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term17418 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term17419 = newInstance(Class.forName("java.time.LocalDate"));
        Object term17423 = newInstance(Class.forName("java.time.LocalTime"));
        Object term17428 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term17438 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term17455 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term17456 = (long[]) newLongArray(1);
        Object[] term17458 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term17459 = (long[]) newLongArray(39);
        Object[] term17499 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term17500 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term17501 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term17502 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term17223, term17223.getClass(), "pmm", "XXvscsYBWv");
        setField(term17223, term17223.getClass(), "idm", "uePedtiAfL");
        setField(term17223, term17223.getClass(), "mmgameid", "AdSHvysxQB");
        setField(term17223, term17223.getClass(), "mmuid", "jlraKkBWFA");
        setField(term17223, term17223.getClass(), "a_code", "mRBtFTxVdE");
        setIntField(term17223, term17223.getClass(), "aime_id", 1596070772);
        setField(term17223, term17223.getClass(), "aime_a_code", "IVacFDAZcj");
        setField(term17223, term17223.getClass(), "key_obj_type", "EEYmuwyVDP");
        setField(term17223, term17223.getClass(), "player_name", "EWFbEDAVrE");
        setField(term17223, term17223.getClass(), "passwd", "EMiMtYgfvr");
        setField(term17223, term17223.getClass(), "cmd", "OyYyYYnJuF");
        setField(term17223, term17223.getClass(), "req_id", "aYLvcxZohT");
        setField(term17223, term17223.getClass(), "game_id", "mnHyQbMyld");
        setField(term17223, term17223.getClass(), "r_ver", "KHtaDOIcJZ");
        setField(term17223, term17223.getClass(), "kc_serial", "vgdwrCZczl");
        setField(term17223, term17223.getClass(), "b_serial", "gKMNrpKBpu");
        setField(term17223, term17223.getClass(), "place_id", "ZbHJVEqcoa");
        setIntField(term17419, term17419.getClass(), "year", 2025);
        setShortField(term17419, term17419.getClass(), "month", (short) 11);
        setShortField(term17419, term17419.getClass(), "day", (short) 3);
        setField(term17418, term17418.getClass(), "date", term17419);
        setByteField(term17423, term17423.getClass(), "hour", (byte) 21);
        setByteField(term17423, term17423.getClass(), "minute", (byte) 24);
        setByteField(term17423, term17423.getClass(), "second", (byte) 23);
        setIntField(term17423, term17423.getClass(), "nano", 210986721);
        setField(term17418, term17418.getClass(), "time", term17423);
        setField(term17417, term17417.getClass(), "dateTime", term17418);
        setIntField(term17428, term17428.getClass(), "totalSeconds", -10800);
        setField(term17428, term17428.getClass(), "id", "-03:00");
        setField(term17417, term17417.getClass(), "offset", term17428);
        setField(term17438, term17438.getClass(), "id", "America/Recife");
        setLongElement(term17456, 0, -1767217224L);
        setField(term17455, term17455.getClass(), "standardTransitions", term17456);
        setElement(term17458, 1, term17428);
        setField(term17455, term17455.getClass(), "standardOffsets", term17458);
        setLongElement(term17459, 0, -1767217224L);
        setLongElement(term17459, 1, -1206957600L);
        setLongElement(term17459, 2, -1191362400L);
        setLongElement(term17459, 3, -1175374800L);
        setLongElement(term17459, 4, -1159826400L);
        setLongElement(term17459, 5, -633819600L);
        setLongElement(term17459, 6, -622069200L);
        setLongElement(term17459, 7, -602283600L);
        setLongElement(term17459, 8, -591832800L);
        setLongElement(term17459, 9, -570747600L);
        setLongElement(term17459, 10, -560210400L);
        setLongElement(term17459, 11, -539125200L);
        setLongElement(term17459, 12, -531352800L);
        setLongElement(term17459, 13, -191365200L);
        setLongElement(term17459, 14, -184197600L);
        setLongElement(term17459, 15, -155163600L);
        setLongElement(term17459, 16, -150069600L);
        setLongElement(term17459, 17, -128898000L);
        setLongElement(term17459, 18, -121125600L);
        setLongElement(term17459, 19, -99954000L);
        setLongElement(term17459, 20, -89589600L);
        setLongElement(term17459, 21, -68418000L);
        setLongElement(term17459, 22, -57967200L);
        setLongElement(term17459, 23, 499748400L);
        setLongElement(term17459, 24, 511236000L);
        setLongElement(term17459, 25, 530593200L);
        setLongElement(term17459, 26, 540266400L);
        setLongElement(term17459, 27, 562129200L);
        setLongElement(term17459, 28, 571197600L);
        setLongElement(term17459, 29, 592974000L);
        setLongElement(term17459, 30, 602042400L);
        setLongElement(term17459, 31, 624423600L);
        setLongElement(term17459, 32, 634701600L);
        setLongElement(term17459, 33, 938919600L);
        setLongElement(term17459, 34, 951616800L);
        setLongElement(term17459, 35, 970974000L);
        setLongElement(term17459, 36, 971575200L);
        setLongElement(term17459, 37, 1003028400L);
        setLongElement(term17459, 38, 1013911200L);
        setField(term17455, term17455.getClass(), "savingsInstantTransitions", term17459);
        setField(term17455, term17455.getClass(), "savingsLocalTransitions", term17499);
        setElement(term17500, 1, term17428);
        setElement(term17500, 3, term17428);
        setElement(term17500, 5, term17428);
        setElement(term17500, 7, term17428);
        setElement(term17500, 9, term17428);
        setElement(term17500, 11, term17428);
        setElement(term17500, 13, term17428);
        setElement(term17500, 15, term17428);
        setElement(term17500, 17, term17428);
        setElement(term17500, 19, term17428);
        setElement(term17500, 21, term17428);
        setElement(term17500, 23, term17428);
        setElement(term17500, 25, term17428);
        setElement(term17500, 27, term17428);
        setElement(term17500, 29, term17428);
        setElement(term17500, 31, term17428);
        setElement(term17500, 33, term17428);
        setElement(term17500, 35, term17428);
        setElement(term17500, 37, term17428);
        setElement(term17500, 39, term17428);
        setField(term17455, term17455.getClass(), "wallOffsets", term17500);
        setField(term17455, term17455.getClass(), "lastRules", term17501);
        setField(term17502, term17502.getClass(), "table", null);
        setField(term17502, term17502.getClass(), "nextTable", null);
        setLongField(term17502, term17502.getClass(), "baseCount", 0L);
        setIntField(term17502, term17502.getClass(), "sizeCtl", 0);
        setIntField(term17502, term17502.getClass(), "transferIndex", 0);
        setIntField(term17502, term17502.getClass(), "cellsBusy", 0);
        setField(term17502, term17502.getClass(), "counterCells", null);
        setField(term17502, term17502.getClass(), "keySet", null);
        setField(term17502, term17502.getClass(), "values", null);
        setField(term17502, term17502.getClass(), "entrySet", null);
        setField(term17502, term17502.getClass(), "keySet", null);
        setField(term17502, term17502.getClass(), "values", null);
        setField(term17455, term17455.getClass(), "lastRulesCache", term17502);
        setField(term17438, term17438.getClass(), "rules", term17455);
        setField(term17417, term17417.getClass(), "zone", term17438);
        setField(term17223, term17223.getClass(), "time_stamp", term17417);
        setField(term17223, term17223.getClass(), "start_up_mode", "awDQVEVIKi");
        setField(term17223, term17223.getClass(), "cmm_dly_mod", "HJwNgUzZZR");
        setField(term17223, term17223.getClass(), "cmm_dly_sec", "FvUCZgTXhq");
        setField(term17223, term17223.getClass(), "cmm_err_mod", "wWWidPCHzx");
        setField(term17223, term17223.getClass(), "country_code", "OwPIiBRuKK");
        setField(term17223, term17223.getClass(), "region_code", "sgfGySMODT");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.RegistrationRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ndAITnOsny";
        callMethod(klass, "setKey_obj_type", argTypes, term17223, args);
    }

};


