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

public class ChangePasswdRequest_setAcode_18211857146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3037;

    public ChangePasswdRequest_setAcode_18211857146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3037 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.ChangePasswdRequest"));
        Object term3161 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term3162 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3163 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3167 = newInstance(Class.forName("java.time.LocalTime"));
        Object term3172 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term3182 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term3199 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term3200 = (long[]) newLongArray(1);
        Object[] term3202 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term3203 = (long[]) newLongArray(39);
        Object[] term3243 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term3244 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term3245 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term3246 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term3037, term3037.getClass(), "a_code", "XqgfKFvPSD");
        setIntField(term3037, term3037.getClass(), "aime_id", 1622346318);
        setField(term3037, term3037.getClass(), "aime_a_code", "JiVRgTZvKc");
        setIntField(term3037, term3037.getClass(), "pd_id", 1048535127);
        setIntField(term3037, term3037.getClass(), "accept_idx", -655067527);
        setField(term3037, term3037.getClass(), "new_passwd", "XPKmummaqg");
        setField(term3037, term3037.getClass(), "cmd", "BKLfkLiZTH");
        setField(term3037, term3037.getClass(), "req_id", "SPpkrGcPRr");
        setField(term3037, term3037.getClass(), "game_id", "sEccwbJKYE");
        setField(term3037, term3037.getClass(), "r_ver", "AWRooQKkdW");
        setField(term3037, term3037.getClass(), "kc_serial", "vjxIhXHxGR");
        setField(term3037, term3037.getClass(), "b_serial", "QXzGXbEXMu");
        setField(term3037, term3037.getClass(), "place_id", "qxSDVejjiY");
        setIntField(term3163, term3163.getClass(), "year", 2025);
        setShortField(term3163, term3163.getClass(), "month", (short) 4);
        setShortField(term3163, term3163.getClass(), "day", (short) 24);
        setField(term3162, term3162.getClass(), "date", term3163);
        setByteField(term3167, term3167.getClass(), "hour", (byte) 18);
        setByteField(term3167, term3167.getClass(), "minute", (byte) 11);
        setByteField(term3167, term3167.getClass(), "second", (byte) 40);
        setIntField(term3167, term3167.getClass(), "nano", 137454929);
        setField(term3162, term3162.getClass(), "time", term3167);
        setField(term3161, term3161.getClass(), "dateTime", term3162);
        setIntField(term3172, term3172.getClass(), "totalSeconds", -10800);
        setField(term3172, term3172.getClass(), "id", "-03:00");
        setField(term3161, term3161.getClass(), "offset", term3172);
        setField(term3182, term3182.getClass(), "id", "America/Recife");
        setLongElement(term3200, 0, -1767217224L);
        setField(term3199, term3199.getClass(), "standardTransitions", term3200);
        setElement(term3202, 1, term3172);
        setField(term3199, term3199.getClass(), "standardOffsets", term3202);
        setLongElement(term3203, 0, -1767217224L);
        setLongElement(term3203, 1, -1206957600L);
        setLongElement(term3203, 2, -1191362400L);
        setLongElement(term3203, 3, -1175374800L);
        setLongElement(term3203, 4, -1159826400L);
        setLongElement(term3203, 5, -633819600L);
        setLongElement(term3203, 6, -622069200L);
        setLongElement(term3203, 7, -602283600L);
        setLongElement(term3203, 8, -591832800L);
        setLongElement(term3203, 9, -570747600L);
        setLongElement(term3203, 10, -560210400L);
        setLongElement(term3203, 11, -539125200L);
        setLongElement(term3203, 12, -531352800L);
        setLongElement(term3203, 13, -191365200L);
        setLongElement(term3203, 14, -184197600L);
        setLongElement(term3203, 15, -155163600L);
        setLongElement(term3203, 16, -150069600L);
        setLongElement(term3203, 17, -128898000L);
        setLongElement(term3203, 18, -121125600L);
        setLongElement(term3203, 19, -99954000L);
        setLongElement(term3203, 20, -89589600L);
        setLongElement(term3203, 21, -68418000L);
        setLongElement(term3203, 22, -57967200L);
        setLongElement(term3203, 23, 499748400L);
        setLongElement(term3203, 24, 511236000L);
        setLongElement(term3203, 25, 530593200L);
        setLongElement(term3203, 26, 540266400L);
        setLongElement(term3203, 27, 562129200L);
        setLongElement(term3203, 28, 571197600L);
        setLongElement(term3203, 29, 592974000L);
        setLongElement(term3203, 30, 602042400L);
        setLongElement(term3203, 31, 624423600L);
        setLongElement(term3203, 32, 634701600L);
        setLongElement(term3203, 33, 938919600L);
        setLongElement(term3203, 34, 951616800L);
        setLongElement(term3203, 35, 970974000L);
        setLongElement(term3203, 36, 971575200L);
        setLongElement(term3203, 37, 1003028400L);
        setLongElement(term3203, 38, 1013911200L);
        setField(term3199, term3199.getClass(), "savingsInstantTransitions", term3203);
        setField(term3199, term3199.getClass(), "savingsLocalTransitions", term3243);
        setElement(term3244, 1, term3172);
        setElement(term3244, 3, term3172);
        setElement(term3244, 5, term3172);
        setElement(term3244, 7, term3172);
        setElement(term3244, 9, term3172);
        setElement(term3244, 11, term3172);
        setElement(term3244, 13, term3172);
        setElement(term3244, 15, term3172);
        setElement(term3244, 17, term3172);
        setElement(term3244, 19, term3172);
        setElement(term3244, 21, term3172);
        setElement(term3244, 23, term3172);
        setElement(term3244, 25, term3172);
        setElement(term3244, 27, term3172);
        setElement(term3244, 29, term3172);
        setElement(term3244, 31, term3172);
        setElement(term3244, 33, term3172);
        setElement(term3244, 35, term3172);
        setElement(term3244, 37, term3172);
        setElement(term3244, 39, term3172);
        setField(term3199, term3199.getClass(), "wallOffsets", term3244);
        setField(term3199, term3199.getClass(), "lastRules", term3245);
        setField(term3246, term3246.getClass(), "table", null);
        setField(term3246, term3246.getClass(), "nextTable", null);
        setLongField(term3246, term3246.getClass(), "baseCount", 0L);
        setIntField(term3246, term3246.getClass(), "sizeCtl", 0);
        setIntField(term3246, term3246.getClass(), "transferIndex", 0);
        setIntField(term3246, term3246.getClass(), "cellsBusy", 0);
        setField(term3246, term3246.getClass(), "counterCells", null);
        setField(term3246, term3246.getClass(), "keySet", null);
        setField(term3246, term3246.getClass(), "values", null);
        setField(term3246, term3246.getClass(), "entrySet", null);
        setField(term3246, term3246.getClass(), "keySet", null);
        setField(term3246, term3246.getClass(), "values", null);
        setField(term3199, term3199.getClass(), "lastRulesCache", term3246);
        setField(term3182, term3182.getClass(), "rules", term3199);
        setField(term3161, term3161.getClass(), "zone", term3182);
        setField(term3037, term3037.getClass(), "time_stamp", term3161);
        setField(term3037, term3037.getClass(), "start_up_mode", "xBsXSDjXYK");
        setField(term3037, term3037.getClass(), "cmm_dly_mod", "sEnIVFtZuQ");
        setField(term3037, term3037.getClass(), "cmm_dly_sec", "ZVecLZMLHF");
        setField(term3037, term3037.getClass(), "cmm_err_mod", "fztQhjqwdP");
        setField(term3037, term3037.getClass(), "country_code", "eVpkWxjuki");
        setField(term3037, term3037.getClass(), "region_code", "SJiQaLvSKv");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.ChangePasswdRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "OEXDRUKcFl";
        callMethod(klass, "setA_code", argTypes, term3037, args);
    }

};


