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

public class PreStartRequest_getAimeid_18107469625 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12388;

    public PreStartRequest_getAimeid_18107469625() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12388 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.user.PreStartRequest"));
        Object term12559 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term12560 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12561 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12565 = newInstance(Class.forName("java.time.LocalTime"));
        Object term12570 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term12580 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term12597 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term12598 = (long[]) newLongArray(1);
        Object[] term12600 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term12601 = (long[]) newLongArray(39);
        Object[] term12641 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term12642 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term12643 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term12644 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term12388, term12388.getClass(), "pmm", "AWYyZiNfsm");
        setField(term12388, term12388.getClass(), "idm", "ITRRYiuDwH");
        setField(term12388, term12388.getClass(), "mmgameid", "llRfwANcVF");
        setField(term12388, term12388.getClass(), "mmuid", "sUEeHQTWkA");
        setField(term12388, term12388.getClass(), "a_code", "BDIRCxAWLA");
        setIntField(term12388, term12388.getClass(), "aime_id", 32185364);
        setField(term12388, term12388.getClass(), "aime_a_code", "eOJfbiZLnb");
        setField(term12388, term12388.getClass(), "key_obj_type", "nKZKnxWYCK");
        setBooleanField(term12388, term12388.getClass(), "exec_vu", true);
        setField(term12388, term12388.getClass(), "cmd", "JOqQxuzRuZ");
        setField(term12388, term12388.getClass(), "req_id", "RSaoipUlsg");
        setField(term12388, term12388.getClass(), "game_id", "cSHGbqKqlN");
        setField(term12388, term12388.getClass(), "r_ver", "pFAfANnxup");
        setField(term12388, term12388.getClass(), "kc_serial", "FbSIUZyBXZ");
        setField(term12388, term12388.getClass(), "b_serial", "mhQDwIyrRi");
        setField(term12388, term12388.getClass(), "place_id", "HpZXWDPhlg");
        setIntField(term12561, term12561.getClass(), "year", 2023);
        setShortField(term12561, term12561.getClass(), "month", (short) 9);
        setShortField(term12561, term12561.getClass(), "day", (short) 23);
        setField(term12560, term12560.getClass(), "date", term12561);
        setByteField(term12565, term12565.getClass(), "hour", (byte) 12);
        setByteField(term12565, term12565.getClass(), "minute", (byte) 55);
        setByteField(term12565, term12565.getClass(), "second", (byte) 58);
        setIntField(term12565, term12565.getClass(), "nano", 159178396);
        setField(term12560, term12560.getClass(), "time", term12565);
        setField(term12559, term12559.getClass(), "dateTime", term12560);
        setIntField(term12570, term12570.getClass(), "totalSeconds", -10800);
        setField(term12570, term12570.getClass(), "id", "-03:00");
        setField(term12559, term12559.getClass(), "offset", term12570);
        setField(term12580, term12580.getClass(), "id", "America/Recife");
        setLongElement(term12598, 0, -1767217224L);
        setField(term12597, term12597.getClass(), "standardTransitions", term12598);
        setElement(term12600, 1, term12570);
        setField(term12597, term12597.getClass(), "standardOffsets", term12600);
        setLongElement(term12601, 0, -1767217224L);
        setLongElement(term12601, 1, -1206957600L);
        setLongElement(term12601, 2, -1191362400L);
        setLongElement(term12601, 3, -1175374800L);
        setLongElement(term12601, 4, -1159826400L);
        setLongElement(term12601, 5, -633819600L);
        setLongElement(term12601, 6, -622069200L);
        setLongElement(term12601, 7, -602283600L);
        setLongElement(term12601, 8, -591832800L);
        setLongElement(term12601, 9, -570747600L);
        setLongElement(term12601, 10, -560210400L);
        setLongElement(term12601, 11, -539125200L);
        setLongElement(term12601, 12, -531352800L);
        setLongElement(term12601, 13, -191365200L);
        setLongElement(term12601, 14, -184197600L);
        setLongElement(term12601, 15, -155163600L);
        setLongElement(term12601, 16, -150069600L);
        setLongElement(term12601, 17, -128898000L);
        setLongElement(term12601, 18, -121125600L);
        setLongElement(term12601, 19, -99954000L);
        setLongElement(term12601, 20, -89589600L);
        setLongElement(term12601, 21, -68418000L);
        setLongElement(term12601, 22, -57967200L);
        setLongElement(term12601, 23, 499748400L);
        setLongElement(term12601, 24, 511236000L);
        setLongElement(term12601, 25, 530593200L);
        setLongElement(term12601, 26, 540266400L);
        setLongElement(term12601, 27, 562129200L);
        setLongElement(term12601, 28, 571197600L);
        setLongElement(term12601, 29, 592974000L);
        setLongElement(term12601, 30, 602042400L);
        setLongElement(term12601, 31, 624423600L);
        setLongElement(term12601, 32, 634701600L);
        setLongElement(term12601, 33, 938919600L);
        setLongElement(term12601, 34, 951616800L);
        setLongElement(term12601, 35, 970974000L);
        setLongElement(term12601, 36, 971575200L);
        setLongElement(term12601, 37, 1003028400L);
        setLongElement(term12601, 38, 1013911200L);
        setField(term12597, term12597.getClass(), "savingsInstantTransitions", term12601);
        setField(term12597, term12597.getClass(), "savingsLocalTransitions", term12641);
        setElement(term12642, 1, term12570);
        setElement(term12642, 3, term12570);
        setElement(term12642, 5, term12570);
        setElement(term12642, 7, term12570);
        setElement(term12642, 9, term12570);
        setElement(term12642, 11, term12570);
        setElement(term12642, 13, term12570);
        setElement(term12642, 15, term12570);
        setElement(term12642, 17, term12570);
        setElement(term12642, 19, term12570);
        setElement(term12642, 21, term12570);
        setElement(term12642, 23, term12570);
        setElement(term12642, 25, term12570);
        setElement(term12642, 27, term12570);
        setElement(term12642, 29, term12570);
        setElement(term12642, 31, term12570);
        setElement(term12642, 33, term12570);
        setElement(term12642, 35, term12570);
        setElement(term12642, 37, term12570);
        setElement(term12642, 39, term12570);
        setField(term12597, term12597.getClass(), "wallOffsets", term12642);
        setField(term12597, term12597.getClass(), "lastRules", term12643);
        setField(term12644, term12644.getClass(), "table", null);
        setField(term12644, term12644.getClass(), "nextTable", null);
        setLongField(term12644, term12644.getClass(), "baseCount", 0L);
        setIntField(term12644, term12644.getClass(), "sizeCtl", 0);
        setIntField(term12644, term12644.getClass(), "transferIndex", 0);
        setIntField(term12644, term12644.getClass(), "cellsBusy", 0);
        setField(term12644, term12644.getClass(), "counterCells", null);
        setField(term12644, term12644.getClass(), "keySet", null);
        setField(term12644, term12644.getClass(), "values", null);
        setField(term12644, term12644.getClass(), "entrySet", null);
        setField(term12644, term12644.getClass(), "keySet", null);
        setField(term12644, term12644.getClass(), "values", null);
        setField(term12597, term12597.getClass(), "lastRulesCache", term12644);
        setField(term12580, term12580.getClass(), "rules", term12597);
        setField(term12559, term12559.getClass(), "zone", term12580);
        setField(term12388, term12388.getClass(), "time_stamp", term12559);
        setField(term12388, term12388.getClass(), "start_up_mode", "lBOokzEPfe");
        setField(term12388, term12388.getClass(), "cmm_dly_mod", "dtGZCsKXbW");
        setField(term12388, term12388.getClass(), "cmm_dly_sec", "bdyhHbDAmJ");
        setField(term12388, term12388.getClass(), "cmm_err_mod", "BBXiTNHqGE");
        setField(term12388, term12388.getClass(), "country_code", "IEYhJmgCVd");
        setField(term12388, term12388.getClass(), "region_code", "KSJeYkkvpk");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.user.PreStartRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAime_id", argTypes, term12388, args);
    }

};


