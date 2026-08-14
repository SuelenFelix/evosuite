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

public class RegistrationRequest_setPasswd_186187489620 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term241675;

    public RegistrationRequest_setPasswd_186187489620() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term241675 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.RegistrationRequest"));
        Object term241869 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term241870 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term241871 = newInstance(Class.forName("java.time.LocalDate"));
        Object term241875 = newInstance(Class.forName("java.time.LocalTime"));
        Object term241880 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term241890 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term241907 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term241908 = (long[]) newLongArray(1);
        Object[] term241910 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term241911 = (long[]) newLongArray(39);
        Object[] term241951 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term241952 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term241953 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term241954 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term241675, term241675.getClass(), "pmm", "SrodJwobhd");
        setField(term241675, term241675.getClass(), "idm", "aEKxCMZaAl");
        setField(term241675, term241675.getClass(), "mmgameid", "uVksDvNeyo");
        setField(term241675, term241675.getClass(), "mmuid", "KThgZcLeyJ");
        setField(term241675, term241675.getClass(), "a_code", "qTgeYJrPfV");
        setIntField(term241675, term241675.getClass(), "aime_id", -120616752);
        setField(term241675, term241675.getClass(), "aime_a_code", "aMXuzqauuw");
        setField(term241675, term241675.getClass(), "key_obj_type", "OsLyHIAMvZ");
        setField(term241675, term241675.getClass(), "player_name", "fANlppmeZc");
        setField(term241675, term241675.getClass(), "passwd", "vwXdXCgQIr");
        setField(term241675, term241675.getClass(), "cmd", "nSnrziJcBE");
        setField(term241675, term241675.getClass(), "req_id", "xbhJrXUuCP");
        setField(term241675, term241675.getClass(), "game_id", "bvjVBhkXQU");
        setField(term241675, term241675.getClass(), "r_ver", "IrOvUMupuD");
        setField(term241675, term241675.getClass(), "kc_serial", "UgFQTaylqs");
        setField(term241675, term241675.getClass(), "b_serial", "CZksebZXsC");
        setField(term241675, term241675.getClass(), "place_id", "NDTlULiAEp");
        setIntField(term241871, term241871.getClass(), "year", 2021);
        setShortField(term241871, term241871.getClass(), "month", (short) 11);
        setShortField(term241871, term241871.getClass(), "day", (short) 12);
        setField(term241870, term241870.getClass(), "date", term241871);
        setByteField(term241875, term241875.getClass(), "hour", (byte) 0);
        setByteField(term241875, term241875.getClass(), "minute", (byte) 51);
        setByteField(term241875, term241875.getClass(), "second", (byte) 55);
        setIntField(term241875, term241875.getClass(), "nano", 745543124);
        setField(term241870, term241870.getClass(), "time", term241875);
        setField(term241869, term241869.getClass(), "dateTime", term241870);
        setIntField(term241880, term241880.getClass(), "totalSeconds", -10800);
        setField(term241880, term241880.getClass(), "id", "-03:00");
        setField(term241869, term241869.getClass(), "offset", term241880);
        setField(term241890, term241890.getClass(), "id", "America/Recife");
        setLongElement(term241908, 0, -1767217224L);
        setField(term241907, term241907.getClass(), "standardTransitions", term241908);
        setElement(term241910, 1, term241880);
        setField(term241907, term241907.getClass(), "standardOffsets", term241910);
        setLongElement(term241911, 0, -1767217224L);
        setLongElement(term241911, 1, -1206957600L);
        setLongElement(term241911, 2, -1191362400L);
        setLongElement(term241911, 3, -1175374800L);
        setLongElement(term241911, 4, -1159826400L);
        setLongElement(term241911, 5, -633819600L);
        setLongElement(term241911, 6, -622069200L);
        setLongElement(term241911, 7, -602283600L);
        setLongElement(term241911, 8, -591832800L);
        setLongElement(term241911, 9, -570747600L);
        setLongElement(term241911, 10, -560210400L);
        setLongElement(term241911, 11, -539125200L);
        setLongElement(term241911, 12, -531352800L);
        setLongElement(term241911, 13, -191365200L);
        setLongElement(term241911, 14, -184197600L);
        setLongElement(term241911, 15, -155163600L);
        setLongElement(term241911, 16, -150069600L);
        setLongElement(term241911, 17, -128898000L);
        setLongElement(term241911, 18, -121125600L);
        setLongElement(term241911, 19, -99954000L);
        setLongElement(term241911, 20, -89589600L);
        setLongElement(term241911, 21, -68418000L);
        setLongElement(term241911, 22, -57967200L);
        setLongElement(term241911, 23, 499748400L);
        setLongElement(term241911, 24, 511236000L);
        setLongElement(term241911, 25, 530593200L);
        setLongElement(term241911, 26, 540266400L);
        setLongElement(term241911, 27, 562129200L);
        setLongElement(term241911, 28, 571197600L);
        setLongElement(term241911, 29, 592974000L);
        setLongElement(term241911, 30, 602042400L);
        setLongElement(term241911, 31, 624423600L);
        setLongElement(term241911, 32, 634701600L);
        setLongElement(term241911, 33, 938919600L);
        setLongElement(term241911, 34, 951616800L);
        setLongElement(term241911, 35, 970974000L);
        setLongElement(term241911, 36, 971575200L);
        setLongElement(term241911, 37, 1003028400L);
        setLongElement(term241911, 38, 1013911200L);
        setField(term241907, term241907.getClass(), "savingsInstantTransitions", term241911);
        setField(term241907, term241907.getClass(), "savingsLocalTransitions", term241951);
        setElement(term241952, 1, term241880);
        setElement(term241952, 3, term241880);
        setElement(term241952, 5, term241880);
        setElement(term241952, 7, term241880);
        setElement(term241952, 9, term241880);
        setElement(term241952, 11, term241880);
        setElement(term241952, 13, term241880);
        setElement(term241952, 15, term241880);
        setElement(term241952, 17, term241880);
        setElement(term241952, 19, term241880);
        setElement(term241952, 21, term241880);
        setElement(term241952, 23, term241880);
        setElement(term241952, 25, term241880);
        setElement(term241952, 27, term241880);
        setElement(term241952, 29, term241880);
        setElement(term241952, 31, term241880);
        setElement(term241952, 33, term241880);
        setElement(term241952, 35, term241880);
        setElement(term241952, 37, term241880);
        setElement(term241952, 39, term241880);
        setField(term241907, term241907.getClass(), "wallOffsets", term241952);
        setField(term241907, term241907.getClass(), "lastRules", term241953);
        setField(term241954, term241954.getClass(), "table", null);
        setField(term241954, term241954.getClass(), "nextTable", null);
        setLongField(term241954, term241954.getClass(), "baseCount", 0L);
        setIntField(term241954, term241954.getClass(), "sizeCtl", 0);
        setIntField(term241954, term241954.getClass(), "transferIndex", 0);
        setIntField(term241954, term241954.getClass(), "cellsBusy", 0);
        setField(term241954, term241954.getClass(), "counterCells", null);
        setField(term241954, term241954.getClass(), "keySet", null);
        setField(term241954, term241954.getClass(), "values", null);
        setField(term241954, term241954.getClass(), "entrySet", null);
        setField(term241954, term241954.getClass(), "keySet", null);
        setField(term241954, term241954.getClass(), "values", null);
        setField(term241907, term241907.getClass(), "lastRulesCache", term241954);
        setField(term241890, term241890.getClass(), "rules", term241907);
        setField(term241869, term241869.getClass(), "zone", term241890);
        setField(term241675, term241675.getClass(), "time_stamp", term241869);
        setField(term241675, term241675.getClass(), "start_up_mode", "KakVHGlMtc");
        setField(term241675, term241675.getClass(), "cmm_dly_mod", "XQkRBflDak");
        setField(term241675, term241675.getClass(), "cmm_dly_sec", "UXtNgOITuj");
        setField(term241675, term241675.getClass(), "cmm_err_mod", "NpmLmrGTHj");
        setField(term241675, term241675.getClass(), "country_code", "BPWhlQnFCE");
        setField(term241675, term241675.getClass(), "region_code", "CPQejCPAgr");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.RegistrationRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "epVEZIxJwk";
        callMethod(klass, "setPasswd", argTypes, term241675, args);
    }

};


