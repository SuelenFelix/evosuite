package icu.samnyan.aqua.sega.diva.handler.user;

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
import static icu.samnyan.aqua.sega.diva.handler.user.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class PreStartHandler_handle_9297109860 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8870;

    public PreStartHandler_handle_9297109860() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8870 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.user.PreStartRequest"));
        Object term9041 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term9042 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9043 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9047 = newInstance(Class.forName("java.time.LocalTime"));
        Object term9052 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term9062 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term9079 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term9080 = (long[]) newLongArray(1);
        Object[] term9082 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term9083 = (long[]) newLongArray(39);
        Object[] term9123 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term9124 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term9125 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term9126 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term8870, term8870.getClass(), "pmm", "LQFpaHEwXR");
        setField(term8870, term8870.getClass(), "idm", "oVcInYnLWB");
        setField(term8870, term8870.getClass(), "mmgameid", "aJlieCFVtF");
        setField(term8870, term8870.getClass(), "mmuid", "ZiaGIbnzTs");
        setField(term8870, term8870.getClass(), "a_code", "tbcdzjIfER");
        setIntField(term8870, term8870.getClass(), "aime_id", 1227103734);
        setField(term8870, term8870.getClass(), "aime_a_code", "HyxfbSQYBe");
        setField(term8870, term8870.getClass(), "key_obj_type", "pCTimMblYc");
        setBooleanField(term8870, term8870.getClass(), "exec_vu", true);
        setField(term8870, term8870.getClass(), "cmd", "hNxWaHcfhY");
        setField(term8870, term8870.getClass(), "req_id", "RkybSrpybU");
        setField(term8870, term8870.getClass(), "game_id", "xOEqzGAmDU");
        setField(term8870, term8870.getClass(), "r_ver", "eZFUvlxvGV");
        setField(term8870, term8870.getClass(), "kc_serial", "BYqFIqCKAV");
        setField(term8870, term8870.getClass(), "b_serial", "vrQLuWIDJX");
        setField(term8870, term8870.getClass(), "place_id", "flxyYxBRtu");
        setIntField(term9043, term9043.getClass(), "year", 2021);
        setShortField(term9043, term9043.getClass(), "month", (short) 1);
        setShortField(term9043, term9043.getClass(), "day", (short) 18);
        setField(term9042, term9042.getClass(), "date", term9043);
        setByteField(term9047, term9047.getClass(), "hour", (byte) 13);
        setByteField(term9047, term9047.getClass(), "minute", (byte) 38);
        setByteField(term9047, term9047.getClass(), "second", (byte) 26);
        setIntField(term9047, term9047.getClass(), "nano", 544608644);
        setField(term9042, term9042.getClass(), "time", term9047);
        setField(term9041, term9041.getClass(), "dateTime", term9042);
        setIntField(term9052, term9052.getClass(), "totalSeconds", -10800);
        setField(term9052, term9052.getClass(), "id", "-03:00");
        setField(term9041, term9041.getClass(), "offset", term9052);
        setField(term9062, term9062.getClass(), "id", "America/Recife");
        setLongElement(term9080, 0, -1767217224L);
        setField(term9079, term9079.getClass(), "standardTransitions", term9080);
        setElement(term9082, 1, term9052);
        setField(term9079, term9079.getClass(), "standardOffsets", term9082);
        setLongElement(term9083, 0, -1767217224L);
        setLongElement(term9083, 1, -1206957600L);
        setLongElement(term9083, 2, -1191362400L);
        setLongElement(term9083, 3, -1175374800L);
        setLongElement(term9083, 4, -1159826400L);
        setLongElement(term9083, 5, -633819600L);
        setLongElement(term9083, 6, -622069200L);
        setLongElement(term9083, 7, -602283600L);
        setLongElement(term9083, 8, -591832800L);
        setLongElement(term9083, 9, -570747600L);
        setLongElement(term9083, 10, -560210400L);
        setLongElement(term9083, 11, -539125200L);
        setLongElement(term9083, 12, -531352800L);
        setLongElement(term9083, 13, -191365200L);
        setLongElement(term9083, 14, -184197600L);
        setLongElement(term9083, 15, -155163600L);
        setLongElement(term9083, 16, -150069600L);
        setLongElement(term9083, 17, -128898000L);
        setLongElement(term9083, 18, -121125600L);
        setLongElement(term9083, 19, -99954000L);
        setLongElement(term9083, 20, -89589600L);
        setLongElement(term9083, 21, -68418000L);
        setLongElement(term9083, 22, -57967200L);
        setLongElement(term9083, 23, 499748400L);
        setLongElement(term9083, 24, 511236000L);
        setLongElement(term9083, 25, 530593200L);
        setLongElement(term9083, 26, 540266400L);
        setLongElement(term9083, 27, 562129200L);
        setLongElement(term9083, 28, 571197600L);
        setLongElement(term9083, 29, 592974000L);
        setLongElement(term9083, 30, 602042400L);
        setLongElement(term9083, 31, 624423600L);
        setLongElement(term9083, 32, 634701600L);
        setLongElement(term9083, 33, 938919600L);
        setLongElement(term9083, 34, 951616800L);
        setLongElement(term9083, 35, 970974000L);
        setLongElement(term9083, 36, 971575200L);
        setLongElement(term9083, 37, 1003028400L);
        setLongElement(term9083, 38, 1013911200L);
        setField(term9079, term9079.getClass(), "savingsInstantTransitions", term9083);
        setField(term9079, term9079.getClass(), "savingsLocalTransitions", term9123);
        setElement(term9124, 1, term9052);
        setElement(term9124, 3, term9052);
        setElement(term9124, 5, term9052);
        setElement(term9124, 7, term9052);
        setElement(term9124, 9, term9052);
        setElement(term9124, 11, term9052);
        setElement(term9124, 13, term9052);
        setElement(term9124, 15, term9052);
        setElement(term9124, 17, term9052);
        setElement(term9124, 19, term9052);
        setElement(term9124, 21, term9052);
        setElement(term9124, 23, term9052);
        setElement(term9124, 25, term9052);
        setElement(term9124, 27, term9052);
        setElement(term9124, 29, term9052);
        setElement(term9124, 31, term9052);
        setElement(term9124, 33, term9052);
        setElement(term9124, 35, term9052);
        setElement(term9124, 37, term9052);
        setElement(term9124, 39, term9052);
        setField(term9079, term9079.getClass(), "wallOffsets", term9124);
        setField(term9079, term9079.getClass(), "lastRules", term9125);
        setField(term9126, term9126.getClass(), "table", null);
        setField(term9126, term9126.getClass(), "nextTable", null);
        setLongField(term9126, term9126.getClass(), "baseCount", 0L);
        setIntField(term9126, term9126.getClass(), "sizeCtl", 0);
        setIntField(term9126, term9126.getClass(), "transferIndex", 0);
        setIntField(term9126, term9126.getClass(), "cellsBusy", 0);
        setField(term9126, term9126.getClass(), "counterCells", null);
        setField(term9126, term9126.getClass(), "keySet", null);
        setField(term9126, term9126.getClass(), "values", null);
        setField(term9126, term9126.getClass(), "entrySet", null);
        setField(term9126, term9126.getClass(), "keySet", null);
        setField(term9126, term9126.getClass(), "values", null);
        setField(term9079, term9079.getClass(), "lastRulesCache", term9126);
        setField(term9062, term9062.getClass(), "rules", term9079);
        setField(term9041, term9041.getClass(), "zone", term9062);
        setField(term8870, term8870.getClass(), "time_stamp", term9041);
        setField(term8870, term8870.getClass(), "start_up_mode", "OclPbYPkcH");
        setField(term8870, term8870.getClass(), "cmm_dly_mod", "IoAlmYsBwc");
        setField(term8870, term8870.getClass(), "cmm_dly_sec", "TEParAifyi");
        setField(term8870, term8870.getClass(), "cmm_err_mod", "OWDIEULEFu");
        setField(term8870, term8870.getClass(), "country_code", "dWRymuLBtr");
        setField(term8870, term8870.getClass(), "region_code", "AijpHYOFuy");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.handler.user.PreStartHandler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.diva.model.request.user.PreStartRequest");
        Object[] args = new Object[1];
        args[0] = term8870;
        callMethod(klass, "handle", argTypes, null, args);
    }

};


