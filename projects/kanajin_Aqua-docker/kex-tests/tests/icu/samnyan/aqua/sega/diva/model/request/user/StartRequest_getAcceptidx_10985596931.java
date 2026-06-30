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

public class StartRequest_getAcceptidx_10985596931 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8078;

    public StartRequest_getAcceptidx_10985596931() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8078 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.user.StartRequest"));
        Object term8165 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term8166 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8167 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8171 = newInstance(Class.forName("java.time.LocalTime"));
        Object term8176 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term8186 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term8203 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term8204 = (long[]) newLongArray(1);
        Object[] term8206 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term8207 = (long[]) newLongArray(39);
        Object[] term8247 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term8248 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term8249 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term8250 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setIntField(term8078, term8078.getClass(), "pd_id", -249614216);
        setIntField(term8078, term8078.getClass(), "accept_idx", 1870727665);
        setField(term8078, term8078.getClass(), "cmd", "OIHoJeysUi");
        setField(term8078, term8078.getClass(), "req_id", "WXMWFDGcLB");
        setField(term8078, term8078.getClass(), "game_id", "wKWbJssZuG");
        setField(term8078, term8078.getClass(), "r_ver", "NzBMMhkhpT");
        setField(term8078, term8078.getClass(), "kc_serial", "qCpEbQDHdF");
        setField(term8078, term8078.getClass(), "b_serial", "AHbZyFOmlo");
        setField(term8078, term8078.getClass(), "place_id", "TwfWVQGiIj");
        setIntField(term8167, term8167.getClass(), "year", 2029);
        setShortField(term8167, term8167.getClass(), "month", (short) 6);
        setShortField(term8167, term8167.getClass(), "day", (short) 23);
        setField(term8166, term8166.getClass(), "date", term8167);
        setByteField(term8171, term8171.getClass(), "hour", (byte) 21);
        setByteField(term8171, term8171.getClass(), "minute", (byte) 55);
        setByteField(term8171, term8171.getClass(), "second", (byte) 27);
        setIntField(term8171, term8171.getClass(), "nano", 66889274);
        setField(term8166, term8166.getClass(), "time", term8171);
        setField(term8165, term8165.getClass(), "dateTime", term8166);
        setIntField(term8176, term8176.getClass(), "totalSeconds", -10800);
        setField(term8176, term8176.getClass(), "id", "-03:00");
        setField(term8165, term8165.getClass(), "offset", term8176);
        setField(term8186, term8186.getClass(), "id", "America/Recife");
        setLongElement(term8204, 0, -1767217224L);
        setField(term8203, term8203.getClass(), "standardTransitions", term8204);
        setElement(term8206, 1, term8176);
        setField(term8203, term8203.getClass(), "standardOffsets", term8206);
        setLongElement(term8207, 0, -1767217224L);
        setLongElement(term8207, 1, -1206957600L);
        setLongElement(term8207, 2, -1191362400L);
        setLongElement(term8207, 3, -1175374800L);
        setLongElement(term8207, 4, -1159826400L);
        setLongElement(term8207, 5, -633819600L);
        setLongElement(term8207, 6, -622069200L);
        setLongElement(term8207, 7, -602283600L);
        setLongElement(term8207, 8, -591832800L);
        setLongElement(term8207, 9, -570747600L);
        setLongElement(term8207, 10, -560210400L);
        setLongElement(term8207, 11, -539125200L);
        setLongElement(term8207, 12, -531352800L);
        setLongElement(term8207, 13, -191365200L);
        setLongElement(term8207, 14, -184197600L);
        setLongElement(term8207, 15, -155163600L);
        setLongElement(term8207, 16, -150069600L);
        setLongElement(term8207, 17, -128898000L);
        setLongElement(term8207, 18, -121125600L);
        setLongElement(term8207, 19, -99954000L);
        setLongElement(term8207, 20, -89589600L);
        setLongElement(term8207, 21, -68418000L);
        setLongElement(term8207, 22, -57967200L);
        setLongElement(term8207, 23, 499748400L);
        setLongElement(term8207, 24, 511236000L);
        setLongElement(term8207, 25, 530593200L);
        setLongElement(term8207, 26, 540266400L);
        setLongElement(term8207, 27, 562129200L);
        setLongElement(term8207, 28, 571197600L);
        setLongElement(term8207, 29, 592974000L);
        setLongElement(term8207, 30, 602042400L);
        setLongElement(term8207, 31, 624423600L);
        setLongElement(term8207, 32, 634701600L);
        setLongElement(term8207, 33, 938919600L);
        setLongElement(term8207, 34, 951616800L);
        setLongElement(term8207, 35, 970974000L);
        setLongElement(term8207, 36, 971575200L);
        setLongElement(term8207, 37, 1003028400L);
        setLongElement(term8207, 38, 1013911200L);
        setField(term8203, term8203.getClass(), "savingsInstantTransitions", term8207);
        setField(term8203, term8203.getClass(), "savingsLocalTransitions", term8247);
        setElement(term8248, 1, term8176);
        setElement(term8248, 3, term8176);
        setElement(term8248, 5, term8176);
        setElement(term8248, 7, term8176);
        setElement(term8248, 9, term8176);
        setElement(term8248, 11, term8176);
        setElement(term8248, 13, term8176);
        setElement(term8248, 15, term8176);
        setElement(term8248, 17, term8176);
        setElement(term8248, 19, term8176);
        setElement(term8248, 21, term8176);
        setElement(term8248, 23, term8176);
        setElement(term8248, 25, term8176);
        setElement(term8248, 27, term8176);
        setElement(term8248, 29, term8176);
        setElement(term8248, 31, term8176);
        setElement(term8248, 33, term8176);
        setElement(term8248, 35, term8176);
        setElement(term8248, 37, term8176);
        setElement(term8248, 39, term8176);
        setField(term8203, term8203.getClass(), "wallOffsets", term8248);
        setField(term8203, term8203.getClass(), "lastRules", term8249);
        setField(term8250, term8250.getClass(), "table", null);
        setField(term8250, term8250.getClass(), "nextTable", null);
        setLongField(term8250, term8250.getClass(), "baseCount", 0L);
        setIntField(term8250, term8250.getClass(), "sizeCtl", 0);
        setIntField(term8250, term8250.getClass(), "transferIndex", 0);
        setIntField(term8250, term8250.getClass(), "cellsBusy", 0);
        setField(term8250, term8250.getClass(), "counterCells", null);
        setField(term8250, term8250.getClass(), "keySet", null);
        setField(term8250, term8250.getClass(), "values", null);
        setField(term8250, term8250.getClass(), "entrySet", null);
        setField(term8250, term8250.getClass(), "keySet", null);
        setField(term8250, term8250.getClass(), "values", null);
        setField(term8203, term8203.getClass(), "lastRulesCache", term8250);
        setField(term8186, term8186.getClass(), "rules", term8203);
        setField(term8165, term8165.getClass(), "zone", term8186);
        setField(term8078, term8078.getClass(), "time_stamp", term8165);
        setField(term8078, term8078.getClass(), "start_up_mode", "gUvcueTURF");
        setField(term8078, term8078.getClass(), "cmm_dly_mod", "EwQBhZjCIT");
        setField(term8078, term8078.getClass(), "cmm_dly_sec", "aSkmSwTnEw");
        setField(term8078, term8078.getClass(), "cmm_err_mod", "xvkbvaEGYd");
        setField(term8078, term8078.getClass(), "country_code", "HBGNxdNURv");
        setField(term8078, term8078.getClass(), "region_code", "mfCpTPPQQm");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.user.StartRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAccept_idx", argTypes, term8078, args);
    }

};


