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
import java.lang.Integer;

public class PreStartRequest_setAimeid_25812708014 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17835;
     Object term18168;

    public PreStartRequest_setAimeid_25812708014() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17835 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.user.PreStartRequest"));
        Object term18006 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term18007 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term18008 = newInstance(Class.forName("java.time.LocalDate"));
        Object term18012 = newInstance(Class.forName("java.time.LocalTime"));
        Object term18017 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term18027 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term18044 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term18045 = (long[]) newLongArray(1);
        Object[] term18047 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term18048 = (long[]) newLongArray(39);
        Object[] term18088 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term18089 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term18090 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term18091 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term17835, term17835.getClass(), "pmm", "zHvfKaOstO");
        setField(term17835, term17835.getClass(), "idm", "tOszriqETr");
        setField(term17835, term17835.getClass(), "mmgameid", "ncSPTkhKjO");
        setField(term17835, term17835.getClass(), "mmuid", "jcWKHRWhyj");
        setField(term17835, term17835.getClass(), "a_code", "nrQjODRMLD");
        setIntField(term17835, term17835.getClass(), "aime_id", -851097944);
        setField(term17835, term17835.getClass(), "aime_a_code", "PNoWXrsFic");
        setField(term17835, term17835.getClass(), "key_obj_type", "QZBHZqZope");
        setBooleanField(term17835, term17835.getClass(), "exec_vu", false);
        setField(term17835, term17835.getClass(), "cmd", "VBUahCvyxC");
        setField(term17835, term17835.getClass(), "req_id", "MlzTkzKMCX");
        setField(term17835, term17835.getClass(), "game_id", "UqKUbMyPMJ");
        setField(term17835, term17835.getClass(), "r_ver", "QpYltHAdyY");
        setField(term17835, term17835.getClass(), "kc_serial", "lbmSGBwIiV");
        setField(term17835, term17835.getClass(), "b_serial", "DAxyHoTLzZ");
        setField(term17835, term17835.getClass(), "place_id", "fhZgTouhCC");
        setIntField(term18008, term18008.getClass(), "year", 2010);
        setShortField(term18008, term18008.getClass(), "month", (short) 5);
        setShortField(term18008, term18008.getClass(), "day", (short) 2);
        setField(term18007, term18007.getClass(), "date", term18008);
        setByteField(term18012, term18012.getClass(), "hour", (byte) 2);
        setByteField(term18012, term18012.getClass(), "minute", (byte) 22);
        setByteField(term18012, term18012.getClass(), "second", (byte) 33);
        setIntField(term18012, term18012.getClass(), "nano", 530835039);
        setField(term18007, term18007.getClass(), "time", term18012);
        setField(term18006, term18006.getClass(), "dateTime", term18007);
        setIntField(term18017, term18017.getClass(), "totalSeconds", -10800);
        setField(term18017, term18017.getClass(), "id", "-03:00");
        setField(term18006, term18006.getClass(), "offset", term18017);
        setField(term18027, term18027.getClass(), "id", "America/Recife");
        setLongElement(term18045, 0, -1767217224L);
        setField(term18044, term18044.getClass(), "standardTransitions", term18045);
        setElement(term18047, 1, term18017);
        setField(term18044, term18044.getClass(), "standardOffsets", term18047);
        setLongElement(term18048, 0, -1767217224L);
        setLongElement(term18048, 1, -1206957600L);
        setLongElement(term18048, 2, -1191362400L);
        setLongElement(term18048, 3, -1175374800L);
        setLongElement(term18048, 4, -1159826400L);
        setLongElement(term18048, 5, -633819600L);
        setLongElement(term18048, 6, -622069200L);
        setLongElement(term18048, 7, -602283600L);
        setLongElement(term18048, 8, -591832800L);
        setLongElement(term18048, 9, -570747600L);
        setLongElement(term18048, 10, -560210400L);
        setLongElement(term18048, 11, -539125200L);
        setLongElement(term18048, 12, -531352800L);
        setLongElement(term18048, 13, -191365200L);
        setLongElement(term18048, 14, -184197600L);
        setLongElement(term18048, 15, -155163600L);
        setLongElement(term18048, 16, -150069600L);
        setLongElement(term18048, 17, -128898000L);
        setLongElement(term18048, 18, -121125600L);
        setLongElement(term18048, 19, -99954000L);
        setLongElement(term18048, 20, -89589600L);
        setLongElement(term18048, 21, -68418000L);
        setLongElement(term18048, 22, -57967200L);
        setLongElement(term18048, 23, 499748400L);
        setLongElement(term18048, 24, 511236000L);
        setLongElement(term18048, 25, 530593200L);
        setLongElement(term18048, 26, 540266400L);
        setLongElement(term18048, 27, 562129200L);
        setLongElement(term18048, 28, 571197600L);
        setLongElement(term18048, 29, 592974000L);
        setLongElement(term18048, 30, 602042400L);
        setLongElement(term18048, 31, 624423600L);
        setLongElement(term18048, 32, 634701600L);
        setLongElement(term18048, 33, 938919600L);
        setLongElement(term18048, 34, 951616800L);
        setLongElement(term18048, 35, 970974000L);
        setLongElement(term18048, 36, 971575200L);
        setLongElement(term18048, 37, 1003028400L);
        setLongElement(term18048, 38, 1013911200L);
        setField(term18044, term18044.getClass(), "savingsInstantTransitions", term18048);
        setField(term18044, term18044.getClass(), "savingsLocalTransitions", term18088);
        setElement(term18089, 1, term18017);
        setElement(term18089, 3, term18017);
        setElement(term18089, 5, term18017);
        setElement(term18089, 7, term18017);
        setElement(term18089, 9, term18017);
        setElement(term18089, 11, term18017);
        setElement(term18089, 13, term18017);
        setElement(term18089, 15, term18017);
        setElement(term18089, 17, term18017);
        setElement(term18089, 19, term18017);
        setElement(term18089, 21, term18017);
        setElement(term18089, 23, term18017);
        setElement(term18089, 25, term18017);
        setElement(term18089, 27, term18017);
        setElement(term18089, 29, term18017);
        setElement(term18089, 31, term18017);
        setElement(term18089, 33, term18017);
        setElement(term18089, 35, term18017);
        setElement(term18089, 37, term18017);
        setElement(term18089, 39, term18017);
        setField(term18044, term18044.getClass(), "wallOffsets", term18089);
        setField(term18044, term18044.getClass(), "lastRules", term18090);
        setField(term18091, term18091.getClass(), "table", null);
        setField(term18091, term18091.getClass(), "nextTable", null);
        setLongField(term18091, term18091.getClass(), "baseCount", 0L);
        setIntField(term18091, term18091.getClass(), "sizeCtl", 0);
        setIntField(term18091, term18091.getClass(), "transferIndex", 0);
        setIntField(term18091, term18091.getClass(), "cellsBusy", 0);
        setField(term18091, term18091.getClass(), "counterCells", null);
        setField(term18091, term18091.getClass(), "keySet", null);
        setField(term18091, term18091.getClass(), "values", null);
        setField(term18091, term18091.getClass(), "entrySet", null);
        setField(term18091, term18091.getClass(), "keySet", null);
        setField(term18091, term18091.getClass(), "values", null);
        setField(term18044, term18044.getClass(), "lastRulesCache", term18091);
        setField(term18027, term18027.getClass(), "rules", term18044);
        setField(term18006, term18006.getClass(), "zone", term18027);
        setField(term17835, term17835.getClass(), "time_stamp", term18006);
        setField(term17835, term17835.getClass(), "start_up_mode", "wrikqJwXvL");
        setField(term17835, term17835.getClass(), "cmm_dly_mod", "UiWhvbypdr");
        setField(term17835, term17835.getClass(), "cmm_dly_sec", "CgleElJNje");
        setField(term17835, term17835.getClass(), "cmm_err_mod", "ZrchvNGMtd");
        setField(term17835, term17835.getClass(), "country_code", "WaEcyVlcIx");
        setField(term17835, term17835.getClass(), "region_code", "ONcbPCQnHd");
        term18168 = new Integer(803925431);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.user.PreStartRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term18168;
        callMethod(klass, "setAime_id", argTypes, term17835, args);
    }

};


