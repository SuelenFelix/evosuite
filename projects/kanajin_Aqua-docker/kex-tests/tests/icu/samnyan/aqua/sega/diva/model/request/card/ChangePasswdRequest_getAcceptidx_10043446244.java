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

public class ChangePasswdRequest_getAcceptidx_10043446244 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2025;

    public ChangePasswdRequest_getAcceptidx_10043446244() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2025 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.ChangePasswdRequest"));
        Object term2149 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term2150 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2151 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2155 = newInstance(Class.forName("java.time.LocalTime"));
        Object term2160 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term2170 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term2187 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term2188 = (long[]) newLongArray(1);
        Object[] term2190 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term2191 = (long[]) newLongArray(39);
        Object[] term2231 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term2232 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term2233 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term2234 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term2025, term2025.getClass(), "a_code", "fhkbdRViHi");
        setIntField(term2025, term2025.getClass(), "aime_id", 1134449235);
        setField(term2025, term2025.getClass(), "aime_a_code", "uWHnvSvaPl");
        setIntField(term2025, term2025.getClass(), "pd_id", -883034806);
        setIntField(term2025, term2025.getClass(), "accept_idx", 1585847225);
        setField(term2025, term2025.getClass(), "new_passwd", "kBdSllIBVz");
        setField(term2025, term2025.getClass(), "cmd", "TJmVBGfTML");
        setField(term2025, term2025.getClass(), "req_id", "tPlsykYBqO");
        setField(term2025, term2025.getClass(), "game_id", "bLPjGVBhlX");
        setField(term2025, term2025.getClass(), "r_ver", "whBvTVIIlC");
        setField(term2025, term2025.getClass(), "kc_serial", "IgRJUzaCwW");
        setField(term2025, term2025.getClass(), "b_serial", "JUmudUmaaV");
        setField(term2025, term2025.getClass(), "place_id", "KoyGrUJeJW");
        setIntField(term2151, term2151.getClass(), "year", 2022);
        setShortField(term2151, term2151.getClass(), "month", (short) 2);
        setShortField(term2151, term2151.getClass(), "day", (short) 26);
        setField(term2150, term2150.getClass(), "date", term2151);
        setByteField(term2155, term2155.getClass(), "hour", (byte) 11);
        setByteField(term2155, term2155.getClass(), "minute", (byte) 42);
        setByteField(term2155, term2155.getClass(), "second", (byte) 15);
        setIntField(term2155, term2155.getClass(), "nano", 377731937);
        setField(term2150, term2150.getClass(), "time", term2155);
        setField(term2149, term2149.getClass(), "dateTime", term2150);
        setIntField(term2160, term2160.getClass(), "totalSeconds", -10800);
        setField(term2160, term2160.getClass(), "id", "-03:00");
        setField(term2149, term2149.getClass(), "offset", term2160);
        setField(term2170, term2170.getClass(), "id", "America/Recife");
        setLongElement(term2188, 0, -1767217224L);
        setField(term2187, term2187.getClass(), "standardTransitions", term2188);
        setElement(term2190, 1, term2160);
        setField(term2187, term2187.getClass(), "standardOffsets", term2190);
        setLongElement(term2191, 0, -1767217224L);
        setLongElement(term2191, 1, -1206957600L);
        setLongElement(term2191, 2, -1191362400L);
        setLongElement(term2191, 3, -1175374800L);
        setLongElement(term2191, 4, -1159826400L);
        setLongElement(term2191, 5, -633819600L);
        setLongElement(term2191, 6, -622069200L);
        setLongElement(term2191, 7, -602283600L);
        setLongElement(term2191, 8, -591832800L);
        setLongElement(term2191, 9, -570747600L);
        setLongElement(term2191, 10, -560210400L);
        setLongElement(term2191, 11, -539125200L);
        setLongElement(term2191, 12, -531352800L);
        setLongElement(term2191, 13, -191365200L);
        setLongElement(term2191, 14, -184197600L);
        setLongElement(term2191, 15, -155163600L);
        setLongElement(term2191, 16, -150069600L);
        setLongElement(term2191, 17, -128898000L);
        setLongElement(term2191, 18, -121125600L);
        setLongElement(term2191, 19, -99954000L);
        setLongElement(term2191, 20, -89589600L);
        setLongElement(term2191, 21, -68418000L);
        setLongElement(term2191, 22, -57967200L);
        setLongElement(term2191, 23, 499748400L);
        setLongElement(term2191, 24, 511236000L);
        setLongElement(term2191, 25, 530593200L);
        setLongElement(term2191, 26, 540266400L);
        setLongElement(term2191, 27, 562129200L);
        setLongElement(term2191, 28, 571197600L);
        setLongElement(term2191, 29, 592974000L);
        setLongElement(term2191, 30, 602042400L);
        setLongElement(term2191, 31, 624423600L);
        setLongElement(term2191, 32, 634701600L);
        setLongElement(term2191, 33, 938919600L);
        setLongElement(term2191, 34, 951616800L);
        setLongElement(term2191, 35, 970974000L);
        setLongElement(term2191, 36, 971575200L);
        setLongElement(term2191, 37, 1003028400L);
        setLongElement(term2191, 38, 1013911200L);
        setField(term2187, term2187.getClass(), "savingsInstantTransitions", term2191);
        setField(term2187, term2187.getClass(), "savingsLocalTransitions", term2231);
        setElement(term2232, 1, term2160);
        setElement(term2232, 3, term2160);
        setElement(term2232, 5, term2160);
        setElement(term2232, 7, term2160);
        setElement(term2232, 9, term2160);
        setElement(term2232, 11, term2160);
        setElement(term2232, 13, term2160);
        setElement(term2232, 15, term2160);
        setElement(term2232, 17, term2160);
        setElement(term2232, 19, term2160);
        setElement(term2232, 21, term2160);
        setElement(term2232, 23, term2160);
        setElement(term2232, 25, term2160);
        setElement(term2232, 27, term2160);
        setElement(term2232, 29, term2160);
        setElement(term2232, 31, term2160);
        setElement(term2232, 33, term2160);
        setElement(term2232, 35, term2160);
        setElement(term2232, 37, term2160);
        setElement(term2232, 39, term2160);
        setField(term2187, term2187.getClass(), "wallOffsets", term2232);
        setField(term2187, term2187.getClass(), "lastRules", term2233);
        setField(term2234, term2234.getClass(), "table", null);
        setField(term2234, term2234.getClass(), "nextTable", null);
        setLongField(term2234, term2234.getClass(), "baseCount", 0L);
        setIntField(term2234, term2234.getClass(), "sizeCtl", 0);
        setIntField(term2234, term2234.getClass(), "transferIndex", 0);
        setIntField(term2234, term2234.getClass(), "cellsBusy", 0);
        setField(term2234, term2234.getClass(), "counterCells", null);
        setField(term2234, term2234.getClass(), "keySet", null);
        setField(term2234, term2234.getClass(), "values", null);
        setField(term2234, term2234.getClass(), "entrySet", null);
        setField(term2234, term2234.getClass(), "keySet", null);
        setField(term2234, term2234.getClass(), "values", null);
        setField(term2187, term2187.getClass(), "lastRulesCache", term2234);
        setField(term2170, term2170.getClass(), "rules", term2187);
        setField(term2149, term2149.getClass(), "zone", term2170);
        setField(term2025, term2025.getClass(), "time_stamp", term2149);
        setField(term2025, term2025.getClass(), "start_up_mode", "HqBOwkVqjD");
        setField(term2025, term2025.getClass(), "cmm_dly_mod", "MAcUBcBckh");
        setField(term2025, term2025.getClass(), "cmm_dly_sec", "oVgzLbrsFr");
        setField(term2025, term2025.getClass(), "cmm_err_mod", "vQVyKLdtaz");
        setField(term2025, term2025.getClass(), "country_code", "OWKQODBLzb");
        setField(term2025, term2025.getClass(), "region_code", "wGmYcqUkgE");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.ChangePasswdRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAccept_idx", argTypes, term2025, args);
    }

};


