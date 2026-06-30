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

public class RegistrationRequest_getPasswd_159610809 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12001;

    public RegistrationRequest_getPasswd_159610809() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12001 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.RegistrationRequest"));
        Object term12195 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term12196 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12197 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12201 = newInstance(Class.forName("java.time.LocalTime"));
        Object term12206 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term12216 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term12233 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term12234 = (long[]) newLongArray(1);
        Object[] term12236 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term12237 = (long[]) newLongArray(39);
        Object[] term12277 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term12278 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term12279 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term12280 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term12001, term12001.getClass(), "pmm", "gltJarNuUk");
        setField(term12001, term12001.getClass(), "idm", "ZwZIDwYcSW");
        setField(term12001, term12001.getClass(), "mmgameid", "sOdkipUKRu");
        setField(term12001, term12001.getClass(), "mmuid", "oKwCDqywym");
        setField(term12001, term12001.getClass(), "a_code", "zjZYTddemL");
        setIntField(term12001, term12001.getClass(), "aime_id", 454281060);
        setField(term12001, term12001.getClass(), "aime_a_code", "QtrylgCLiF");
        setField(term12001, term12001.getClass(), "key_obj_type", "orEuhCStGM");
        setField(term12001, term12001.getClass(), "player_name", "HhEaSXWvrY");
        setField(term12001, term12001.getClass(), "passwd", "CVRGEomOth");
        setField(term12001, term12001.getClass(), "cmd", "vSeruUyNWX");
        setField(term12001, term12001.getClass(), "req_id", "UkKvaeJfEC");
        setField(term12001, term12001.getClass(), "game_id", "WPxXsahPRq");
        setField(term12001, term12001.getClass(), "r_ver", "IENRuqmwUU");
        setField(term12001, term12001.getClass(), "kc_serial", "GsWxOwXvSu");
        setField(term12001, term12001.getClass(), "b_serial", "bKBSncrMEZ");
        setField(term12001, term12001.getClass(), "place_id", "yeSXGqQExb");
        setIntField(term12197, term12197.getClass(), "year", 2023);
        setShortField(term12197, term12197.getClass(), "month", (short) 3);
        setShortField(term12197, term12197.getClass(), "day", (short) 7);
        setField(term12196, term12196.getClass(), "date", term12197);
        setByteField(term12201, term12201.getClass(), "hour", (byte) 21);
        setByteField(term12201, term12201.getClass(), "minute", (byte) 15);
        setByteField(term12201, term12201.getClass(), "second", (byte) 43);
        setIntField(term12201, term12201.getClass(), "nano", 639721472);
        setField(term12196, term12196.getClass(), "time", term12201);
        setField(term12195, term12195.getClass(), "dateTime", term12196);
        setIntField(term12206, term12206.getClass(), "totalSeconds", -10800);
        setField(term12206, term12206.getClass(), "id", "-03:00");
        setField(term12195, term12195.getClass(), "offset", term12206);
        setField(term12216, term12216.getClass(), "id", "America/Recife");
        setLongElement(term12234, 0, -1767217224L);
        setField(term12233, term12233.getClass(), "standardTransitions", term12234);
        setElement(term12236, 1, term12206);
        setField(term12233, term12233.getClass(), "standardOffsets", term12236);
        setLongElement(term12237, 0, -1767217224L);
        setLongElement(term12237, 1, -1206957600L);
        setLongElement(term12237, 2, -1191362400L);
        setLongElement(term12237, 3, -1175374800L);
        setLongElement(term12237, 4, -1159826400L);
        setLongElement(term12237, 5, -633819600L);
        setLongElement(term12237, 6, -622069200L);
        setLongElement(term12237, 7, -602283600L);
        setLongElement(term12237, 8, -591832800L);
        setLongElement(term12237, 9, -570747600L);
        setLongElement(term12237, 10, -560210400L);
        setLongElement(term12237, 11, -539125200L);
        setLongElement(term12237, 12, -531352800L);
        setLongElement(term12237, 13, -191365200L);
        setLongElement(term12237, 14, -184197600L);
        setLongElement(term12237, 15, -155163600L);
        setLongElement(term12237, 16, -150069600L);
        setLongElement(term12237, 17, -128898000L);
        setLongElement(term12237, 18, -121125600L);
        setLongElement(term12237, 19, -99954000L);
        setLongElement(term12237, 20, -89589600L);
        setLongElement(term12237, 21, -68418000L);
        setLongElement(term12237, 22, -57967200L);
        setLongElement(term12237, 23, 499748400L);
        setLongElement(term12237, 24, 511236000L);
        setLongElement(term12237, 25, 530593200L);
        setLongElement(term12237, 26, 540266400L);
        setLongElement(term12237, 27, 562129200L);
        setLongElement(term12237, 28, 571197600L);
        setLongElement(term12237, 29, 592974000L);
        setLongElement(term12237, 30, 602042400L);
        setLongElement(term12237, 31, 624423600L);
        setLongElement(term12237, 32, 634701600L);
        setLongElement(term12237, 33, 938919600L);
        setLongElement(term12237, 34, 951616800L);
        setLongElement(term12237, 35, 970974000L);
        setLongElement(term12237, 36, 971575200L);
        setLongElement(term12237, 37, 1003028400L);
        setLongElement(term12237, 38, 1013911200L);
        setField(term12233, term12233.getClass(), "savingsInstantTransitions", term12237);
        setField(term12233, term12233.getClass(), "savingsLocalTransitions", term12277);
        setElement(term12278, 1, term12206);
        setElement(term12278, 3, term12206);
        setElement(term12278, 5, term12206);
        setElement(term12278, 7, term12206);
        setElement(term12278, 9, term12206);
        setElement(term12278, 11, term12206);
        setElement(term12278, 13, term12206);
        setElement(term12278, 15, term12206);
        setElement(term12278, 17, term12206);
        setElement(term12278, 19, term12206);
        setElement(term12278, 21, term12206);
        setElement(term12278, 23, term12206);
        setElement(term12278, 25, term12206);
        setElement(term12278, 27, term12206);
        setElement(term12278, 29, term12206);
        setElement(term12278, 31, term12206);
        setElement(term12278, 33, term12206);
        setElement(term12278, 35, term12206);
        setElement(term12278, 37, term12206);
        setElement(term12278, 39, term12206);
        setField(term12233, term12233.getClass(), "wallOffsets", term12278);
        setField(term12233, term12233.getClass(), "lastRules", term12279);
        setField(term12280, term12280.getClass(), "table", null);
        setField(term12280, term12280.getClass(), "nextTable", null);
        setLongField(term12280, term12280.getClass(), "baseCount", 0L);
        setIntField(term12280, term12280.getClass(), "sizeCtl", 0);
        setIntField(term12280, term12280.getClass(), "transferIndex", 0);
        setIntField(term12280, term12280.getClass(), "cellsBusy", 0);
        setField(term12280, term12280.getClass(), "counterCells", null);
        setField(term12280, term12280.getClass(), "keySet", null);
        setField(term12280, term12280.getClass(), "values", null);
        setField(term12280, term12280.getClass(), "entrySet", null);
        setField(term12280, term12280.getClass(), "keySet", null);
        setField(term12280, term12280.getClass(), "values", null);
        setField(term12233, term12233.getClass(), "lastRulesCache", term12280);
        setField(term12216, term12216.getClass(), "rules", term12233);
        setField(term12195, term12195.getClass(), "zone", term12216);
        setField(term12001, term12001.getClass(), "time_stamp", term12195);
        setField(term12001, term12001.getClass(), "start_up_mode", "uXYcXVYJZM");
        setField(term12001, term12001.getClass(), "cmm_dly_mod", "BJhjdJUhkz");
        setField(term12001, term12001.getClass(), "cmm_dly_sec", "cdHYQDgUZR");
        setField(term12001, term12001.getClass(), "cmm_err_mod", "KAORSSPSeV");
        setField(term12001, term12001.getClass(), "country_code", "UimMMORkzd");
        setField(term12001, term12001.getClass(), "region_code", "huVIXUWLtI");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.RegistrationRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPasswd", argTypes, term12001, args);
    }

};


