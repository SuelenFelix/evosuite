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

public class PreStartRequest_getAimeacode_7212487656 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12981;

    public PreStartRequest_getAimeacode_7212487656() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12981 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.user.PreStartRequest"));
        Object term13152 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term13153 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term13154 = newInstance(Class.forName("java.time.LocalDate"));
        Object term13158 = newInstance(Class.forName("java.time.LocalTime"));
        Object term13163 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term13173 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term13190 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term13191 = (long[]) newLongArray(1);
        Object[] term13193 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term13194 = (long[]) newLongArray(39);
        Object[] term13234 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term13235 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term13236 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term13237 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term12981, term12981.getClass(), "pmm", "qUtkFGMNUV");
        setField(term12981, term12981.getClass(), "idm", "mGRiYhnMcR");
        setField(term12981, term12981.getClass(), "mmgameid", "NFlvfJCVPO");
        setField(term12981, term12981.getClass(), "mmuid", "KarbTXFmUU");
        setField(term12981, term12981.getClass(), "a_code", "jiUSjqwSIQ");
        setIntField(term12981, term12981.getClass(), "aime_id", 1768204942);
        setField(term12981, term12981.getClass(), "aime_a_code", "MgLCedQfoj");
        setField(term12981, term12981.getClass(), "key_obj_type", "zgKiINdgNu");
        setBooleanField(term12981, term12981.getClass(), "exec_vu", true);
        setField(term12981, term12981.getClass(), "cmd", "zLMTXDQHYH");
        setField(term12981, term12981.getClass(), "req_id", "PqywFWJlpE");
        setField(term12981, term12981.getClass(), "game_id", "OzXRsFGTIp");
        setField(term12981, term12981.getClass(), "r_ver", "TjWpyghUWN");
        setField(term12981, term12981.getClass(), "kc_serial", "dkZFDZxcde");
        setField(term12981, term12981.getClass(), "b_serial", "WXcZEtUKlI");
        setField(term12981, term12981.getClass(), "place_id", "IkpjUOuWQU");
        setIntField(term13154, term13154.getClass(), "year", 2028);
        setShortField(term13154, term13154.getClass(), "month", (short) 10);
        setShortField(term13154, term13154.getClass(), "day", (short) 1);
        setField(term13153, term13153.getClass(), "date", term13154);
        setByteField(term13158, term13158.getClass(), "hour", (byte) 17);
        setByteField(term13158, term13158.getClass(), "minute", (byte) 29);
        setByteField(term13158, term13158.getClass(), "second", (byte) 30);
        setIntField(term13158, term13158.getClass(), "nano", 845472306);
        setField(term13153, term13153.getClass(), "time", term13158);
        setField(term13152, term13152.getClass(), "dateTime", term13153);
        setIntField(term13163, term13163.getClass(), "totalSeconds", -10800);
        setField(term13163, term13163.getClass(), "id", "-03:00");
        setField(term13152, term13152.getClass(), "offset", term13163);
        setField(term13173, term13173.getClass(), "id", "America/Recife");
        setLongElement(term13191, 0, -1767217224L);
        setField(term13190, term13190.getClass(), "standardTransitions", term13191);
        setElement(term13193, 1, term13163);
        setField(term13190, term13190.getClass(), "standardOffsets", term13193);
        setLongElement(term13194, 0, -1767217224L);
        setLongElement(term13194, 1, -1206957600L);
        setLongElement(term13194, 2, -1191362400L);
        setLongElement(term13194, 3, -1175374800L);
        setLongElement(term13194, 4, -1159826400L);
        setLongElement(term13194, 5, -633819600L);
        setLongElement(term13194, 6, -622069200L);
        setLongElement(term13194, 7, -602283600L);
        setLongElement(term13194, 8, -591832800L);
        setLongElement(term13194, 9, -570747600L);
        setLongElement(term13194, 10, -560210400L);
        setLongElement(term13194, 11, -539125200L);
        setLongElement(term13194, 12, -531352800L);
        setLongElement(term13194, 13, -191365200L);
        setLongElement(term13194, 14, -184197600L);
        setLongElement(term13194, 15, -155163600L);
        setLongElement(term13194, 16, -150069600L);
        setLongElement(term13194, 17, -128898000L);
        setLongElement(term13194, 18, -121125600L);
        setLongElement(term13194, 19, -99954000L);
        setLongElement(term13194, 20, -89589600L);
        setLongElement(term13194, 21, -68418000L);
        setLongElement(term13194, 22, -57967200L);
        setLongElement(term13194, 23, 499748400L);
        setLongElement(term13194, 24, 511236000L);
        setLongElement(term13194, 25, 530593200L);
        setLongElement(term13194, 26, 540266400L);
        setLongElement(term13194, 27, 562129200L);
        setLongElement(term13194, 28, 571197600L);
        setLongElement(term13194, 29, 592974000L);
        setLongElement(term13194, 30, 602042400L);
        setLongElement(term13194, 31, 624423600L);
        setLongElement(term13194, 32, 634701600L);
        setLongElement(term13194, 33, 938919600L);
        setLongElement(term13194, 34, 951616800L);
        setLongElement(term13194, 35, 970974000L);
        setLongElement(term13194, 36, 971575200L);
        setLongElement(term13194, 37, 1003028400L);
        setLongElement(term13194, 38, 1013911200L);
        setField(term13190, term13190.getClass(), "savingsInstantTransitions", term13194);
        setField(term13190, term13190.getClass(), "savingsLocalTransitions", term13234);
        setElement(term13235, 1, term13163);
        setElement(term13235, 3, term13163);
        setElement(term13235, 5, term13163);
        setElement(term13235, 7, term13163);
        setElement(term13235, 9, term13163);
        setElement(term13235, 11, term13163);
        setElement(term13235, 13, term13163);
        setElement(term13235, 15, term13163);
        setElement(term13235, 17, term13163);
        setElement(term13235, 19, term13163);
        setElement(term13235, 21, term13163);
        setElement(term13235, 23, term13163);
        setElement(term13235, 25, term13163);
        setElement(term13235, 27, term13163);
        setElement(term13235, 29, term13163);
        setElement(term13235, 31, term13163);
        setElement(term13235, 33, term13163);
        setElement(term13235, 35, term13163);
        setElement(term13235, 37, term13163);
        setElement(term13235, 39, term13163);
        setField(term13190, term13190.getClass(), "wallOffsets", term13235);
        setField(term13190, term13190.getClass(), "lastRules", term13236);
        setField(term13237, term13237.getClass(), "table", null);
        setField(term13237, term13237.getClass(), "nextTable", null);
        setLongField(term13237, term13237.getClass(), "baseCount", 0L);
        setIntField(term13237, term13237.getClass(), "sizeCtl", 0);
        setIntField(term13237, term13237.getClass(), "transferIndex", 0);
        setIntField(term13237, term13237.getClass(), "cellsBusy", 0);
        setField(term13237, term13237.getClass(), "counterCells", null);
        setField(term13237, term13237.getClass(), "keySet", null);
        setField(term13237, term13237.getClass(), "values", null);
        setField(term13237, term13237.getClass(), "entrySet", null);
        setField(term13237, term13237.getClass(), "keySet", null);
        setField(term13237, term13237.getClass(), "values", null);
        setField(term13190, term13190.getClass(), "lastRulesCache", term13237);
        setField(term13173, term13173.getClass(), "rules", term13190);
        setField(term13152, term13152.getClass(), "zone", term13173);
        setField(term12981, term12981.getClass(), "time_stamp", term13152);
        setField(term12981, term12981.getClass(), "start_up_mode", "boSSpezHeU");
        setField(term12981, term12981.getClass(), "cmm_dly_mod", "OUeBWNTQDh");
        setField(term12981, term12981.getClass(), "cmm_dly_sec", "gltJarNuUk");
        setField(term12981, term12981.getClass(), "cmm_err_mod", "ZwZIDwYcSW");
        setField(term12981, term12981.getClass(), "country_code", "sOdkipUKRu");
        setField(term12981, term12981.getClass(), "region_code", "oKwCDqywym");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.user.PreStartRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAime_a_code", argTypes, term12981, args);
    }

};


