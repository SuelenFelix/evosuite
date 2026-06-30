package icu.samnyan.aqua.sega.diva.handler.databank;

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
import static icu.samnyan.aqua.sega.diva.handler.databank.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class BannerInfoHandler_handle_11355373981 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2644;
     Object term2645;

    public BannerInfoHandler_handle_11355373981() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2644 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.handler.databank.BannerInfoHandler"));
        setField(term2644, term2644.getClass(), "mapper", null);
        term2645 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.BaseRequest"));
        Object term2730 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term2731 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2732 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2736 = newInstance(Class.forName("java.time.LocalTime"));
        Object term2741 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term2751 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term2768 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term2769 = (long[]) newLongArray(1);
        Object[] term2771 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term2772 = (long[]) newLongArray(39);
        Object[] term2812 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term2813 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term2814 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term2815 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term2645, term2645.getClass(), "cmd", "OWKQODBLzb");
        setField(term2645, term2645.getClass(), "req_id", "wGmYcqUkgE");
        setField(term2645, term2645.getClass(), "game_id", "idgaQsnJpQ");
        setField(term2645, term2645.getClass(), "r_ver", "VgZnGoIFwQ");
        setField(term2645, term2645.getClass(), "kc_serial", "jUbSRrkrYZ");
        setField(term2645, term2645.getClass(), "b_serial", "bWWfajKbEX");
        setField(term2645, term2645.getClass(), "place_id", "cAPeiZHKGJ");
        setIntField(term2732, term2732.getClass(), "year", 2025);
        setShortField(term2732, term2732.getClass(), "month", (short) 4);
        setShortField(term2732, term2732.getClass(), "day", (short) 24);
        setField(term2731, term2731.getClass(), "date", term2732);
        setByteField(term2736, term2736.getClass(), "hour", (byte) 18);
        setByteField(term2736, term2736.getClass(), "minute", (byte) 11);
        setByteField(term2736, term2736.getClass(), "second", (byte) 40);
        setIntField(term2736, term2736.getClass(), "nano", 137454929);
        setField(term2731, term2731.getClass(), "time", term2736);
        setField(term2730, term2730.getClass(), "dateTime", term2731);
        setIntField(term2741, term2741.getClass(), "totalSeconds", -10800);
        setField(term2741, term2741.getClass(), "id", "-03:00");
        setField(term2730, term2730.getClass(), "offset", term2741);
        setField(term2751, term2751.getClass(), "id", "America/Recife");
        setLongElement(term2769, 0, -1767217224L);
        setField(term2768, term2768.getClass(), "standardTransitions", term2769);
        setElement(term2771, 1, term2741);
        setField(term2768, term2768.getClass(), "standardOffsets", term2771);
        setLongElement(term2772, 0, -1767217224L);
        setLongElement(term2772, 1, -1206957600L);
        setLongElement(term2772, 2, -1191362400L);
        setLongElement(term2772, 3, -1175374800L);
        setLongElement(term2772, 4, -1159826400L);
        setLongElement(term2772, 5, -633819600L);
        setLongElement(term2772, 6, -622069200L);
        setLongElement(term2772, 7, -602283600L);
        setLongElement(term2772, 8, -591832800L);
        setLongElement(term2772, 9, -570747600L);
        setLongElement(term2772, 10, -560210400L);
        setLongElement(term2772, 11, -539125200L);
        setLongElement(term2772, 12, -531352800L);
        setLongElement(term2772, 13, -191365200L);
        setLongElement(term2772, 14, -184197600L);
        setLongElement(term2772, 15, -155163600L);
        setLongElement(term2772, 16, -150069600L);
        setLongElement(term2772, 17, -128898000L);
        setLongElement(term2772, 18, -121125600L);
        setLongElement(term2772, 19, -99954000L);
        setLongElement(term2772, 20, -89589600L);
        setLongElement(term2772, 21, -68418000L);
        setLongElement(term2772, 22, -57967200L);
        setLongElement(term2772, 23, 499748400L);
        setLongElement(term2772, 24, 511236000L);
        setLongElement(term2772, 25, 530593200L);
        setLongElement(term2772, 26, 540266400L);
        setLongElement(term2772, 27, 562129200L);
        setLongElement(term2772, 28, 571197600L);
        setLongElement(term2772, 29, 592974000L);
        setLongElement(term2772, 30, 602042400L);
        setLongElement(term2772, 31, 624423600L);
        setLongElement(term2772, 32, 634701600L);
        setLongElement(term2772, 33, 938919600L);
        setLongElement(term2772, 34, 951616800L);
        setLongElement(term2772, 35, 970974000L);
        setLongElement(term2772, 36, 971575200L);
        setLongElement(term2772, 37, 1003028400L);
        setLongElement(term2772, 38, 1013911200L);
        setField(term2768, term2768.getClass(), "savingsInstantTransitions", term2772);
        setField(term2768, term2768.getClass(), "savingsLocalTransitions", term2812);
        setElement(term2813, 1, term2741);
        setElement(term2813, 3, term2741);
        setElement(term2813, 5, term2741);
        setElement(term2813, 7, term2741);
        setElement(term2813, 9, term2741);
        setElement(term2813, 11, term2741);
        setElement(term2813, 13, term2741);
        setElement(term2813, 15, term2741);
        setElement(term2813, 17, term2741);
        setElement(term2813, 19, term2741);
        setElement(term2813, 21, term2741);
        setElement(term2813, 23, term2741);
        setElement(term2813, 25, term2741);
        setElement(term2813, 27, term2741);
        setElement(term2813, 29, term2741);
        setElement(term2813, 31, term2741);
        setElement(term2813, 33, term2741);
        setElement(term2813, 35, term2741);
        setElement(term2813, 37, term2741);
        setElement(term2813, 39, term2741);
        setField(term2768, term2768.getClass(), "wallOffsets", term2813);
        setField(term2768, term2768.getClass(), "lastRules", term2814);
        setField(term2815, term2815.getClass(), "table", null);
        setField(term2815, term2815.getClass(), "nextTable", null);
        setLongField(term2815, term2815.getClass(), "baseCount", 0L);
        setIntField(term2815, term2815.getClass(), "sizeCtl", 0);
        setIntField(term2815, term2815.getClass(), "transferIndex", 0);
        setIntField(term2815, term2815.getClass(), "cellsBusy", 0);
        setField(term2815, term2815.getClass(), "counterCells", null);
        setField(term2815, term2815.getClass(), "keySet", null);
        setField(term2815, term2815.getClass(), "values", null);
        setField(term2815, term2815.getClass(), "entrySet", null);
        setField(term2815, term2815.getClass(), "keySet", null);
        setField(term2815, term2815.getClass(), "values", null);
        setField(term2768, term2768.getClass(), "lastRulesCache", term2815);
        setField(term2751, term2751.getClass(), "rules", term2768);
        setField(term2730, term2730.getClass(), "zone", term2751);
        setField(term2645, term2645.getClass(), "time_stamp", term2730);
        setField(term2645, term2645.getClass(), "start_up_mode", "LvJFtLBaxj");
        setField(term2645, term2645.getClass(), "cmm_dly_mod", "PHvxnGHptP");
        setField(term2645, term2645.getClass(), "cmm_dly_sec", "TimdotUuNC");
        setField(term2645, term2645.getClass(), "cmm_err_mod", "PkWMRdJcBb");
        setField(term2645, term2645.getClass(), "country_code", "jSpAteRute");
        setField(term2645, term2645.getClass(), "region_code", "swZVeJAxjt");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.handler.databank.BannerInfoHandler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.diva.model.request.BaseRequest");
        Object[] args = new Object[1];
        args[0] = term2645;
        callMethod(klass, "handle", argTypes, term2644, args);
    }

};


