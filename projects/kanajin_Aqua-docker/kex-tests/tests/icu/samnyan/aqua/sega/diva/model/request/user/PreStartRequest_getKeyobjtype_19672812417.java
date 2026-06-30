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

public class PreStartRequest_getKeyobjtype_19672812417 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13574;

    public PreStartRequest_getKeyobjtype_19672812417() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13574 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.user.PreStartRequest"));
        Object term13745 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term13746 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term13747 = newInstance(Class.forName("java.time.LocalDate"));
        Object term13751 = newInstance(Class.forName("java.time.LocalTime"));
        Object term13756 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term13766 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term13783 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term13784 = (long[]) newLongArray(1);
        Object[] term13786 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term13787 = (long[]) newLongArray(39);
        Object[] term13827 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term13828 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term13829 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term13830 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term13574, term13574.getClass(), "pmm", "zjZYTddemL");
        setField(term13574, term13574.getClass(), "idm", "QtrylgCLiF");
        setField(term13574, term13574.getClass(), "mmgameid", "orEuhCStGM");
        setField(term13574, term13574.getClass(), "mmuid", "HhEaSXWvrY");
        setField(term13574, term13574.getClass(), "a_code", "CVRGEomOth");
        setIntField(term13574, term13574.getClass(), "aime_id", 1252951645);
        setField(term13574, term13574.getClass(), "aime_a_code", "vSeruUyNWX");
        setField(term13574, term13574.getClass(), "key_obj_type", "UkKvaeJfEC");
        setBooleanField(term13574, term13574.getClass(), "exec_vu", true);
        setField(term13574, term13574.getClass(), "cmd", "WPxXsahPRq");
        setField(term13574, term13574.getClass(), "req_id", "IENRuqmwUU");
        setField(term13574, term13574.getClass(), "game_id", "GsWxOwXvSu");
        setField(term13574, term13574.getClass(), "r_ver", "bKBSncrMEZ");
        setField(term13574, term13574.getClass(), "kc_serial", "yeSXGqQExb");
        setField(term13574, term13574.getClass(), "b_serial", "uXYcXVYJZM");
        setField(term13574, term13574.getClass(), "place_id", "BJhjdJUhkz");
        setIntField(term13747, term13747.getClass(), "year", 2027);
        setShortField(term13747, term13747.getClass(), "month", (short) 2);
        setShortField(term13747, term13747.getClass(), "day", (short) 19);
        setField(term13746, term13746.getClass(), "date", term13747);
        setByteField(term13751, term13751.getClass(), "hour", (byte) 17);
        setByteField(term13751, term13751.getClass(), "minute", (byte) 37);
        setByteField(term13751, term13751.getClass(), "second", (byte) 27);
        setIntField(term13751, term13751.getClass(), "nano", 920380537);
        setField(term13746, term13746.getClass(), "time", term13751);
        setField(term13745, term13745.getClass(), "dateTime", term13746);
        setIntField(term13756, term13756.getClass(), "totalSeconds", -10800);
        setField(term13756, term13756.getClass(), "id", "-03:00");
        setField(term13745, term13745.getClass(), "offset", term13756);
        setField(term13766, term13766.getClass(), "id", "America/Recife");
        setLongElement(term13784, 0, -1767217224L);
        setField(term13783, term13783.getClass(), "standardTransitions", term13784);
        setElement(term13786, 1, term13756);
        setField(term13783, term13783.getClass(), "standardOffsets", term13786);
        setLongElement(term13787, 0, -1767217224L);
        setLongElement(term13787, 1, -1206957600L);
        setLongElement(term13787, 2, -1191362400L);
        setLongElement(term13787, 3, -1175374800L);
        setLongElement(term13787, 4, -1159826400L);
        setLongElement(term13787, 5, -633819600L);
        setLongElement(term13787, 6, -622069200L);
        setLongElement(term13787, 7, -602283600L);
        setLongElement(term13787, 8, -591832800L);
        setLongElement(term13787, 9, -570747600L);
        setLongElement(term13787, 10, -560210400L);
        setLongElement(term13787, 11, -539125200L);
        setLongElement(term13787, 12, -531352800L);
        setLongElement(term13787, 13, -191365200L);
        setLongElement(term13787, 14, -184197600L);
        setLongElement(term13787, 15, -155163600L);
        setLongElement(term13787, 16, -150069600L);
        setLongElement(term13787, 17, -128898000L);
        setLongElement(term13787, 18, -121125600L);
        setLongElement(term13787, 19, -99954000L);
        setLongElement(term13787, 20, -89589600L);
        setLongElement(term13787, 21, -68418000L);
        setLongElement(term13787, 22, -57967200L);
        setLongElement(term13787, 23, 499748400L);
        setLongElement(term13787, 24, 511236000L);
        setLongElement(term13787, 25, 530593200L);
        setLongElement(term13787, 26, 540266400L);
        setLongElement(term13787, 27, 562129200L);
        setLongElement(term13787, 28, 571197600L);
        setLongElement(term13787, 29, 592974000L);
        setLongElement(term13787, 30, 602042400L);
        setLongElement(term13787, 31, 624423600L);
        setLongElement(term13787, 32, 634701600L);
        setLongElement(term13787, 33, 938919600L);
        setLongElement(term13787, 34, 951616800L);
        setLongElement(term13787, 35, 970974000L);
        setLongElement(term13787, 36, 971575200L);
        setLongElement(term13787, 37, 1003028400L);
        setLongElement(term13787, 38, 1013911200L);
        setField(term13783, term13783.getClass(), "savingsInstantTransitions", term13787);
        setField(term13783, term13783.getClass(), "savingsLocalTransitions", term13827);
        setElement(term13828, 1, term13756);
        setElement(term13828, 3, term13756);
        setElement(term13828, 5, term13756);
        setElement(term13828, 7, term13756);
        setElement(term13828, 9, term13756);
        setElement(term13828, 11, term13756);
        setElement(term13828, 13, term13756);
        setElement(term13828, 15, term13756);
        setElement(term13828, 17, term13756);
        setElement(term13828, 19, term13756);
        setElement(term13828, 21, term13756);
        setElement(term13828, 23, term13756);
        setElement(term13828, 25, term13756);
        setElement(term13828, 27, term13756);
        setElement(term13828, 29, term13756);
        setElement(term13828, 31, term13756);
        setElement(term13828, 33, term13756);
        setElement(term13828, 35, term13756);
        setElement(term13828, 37, term13756);
        setElement(term13828, 39, term13756);
        setField(term13783, term13783.getClass(), "wallOffsets", term13828);
        setField(term13783, term13783.getClass(), "lastRules", term13829);
        setField(term13830, term13830.getClass(), "table", null);
        setField(term13830, term13830.getClass(), "nextTable", null);
        setLongField(term13830, term13830.getClass(), "baseCount", 0L);
        setIntField(term13830, term13830.getClass(), "sizeCtl", 0);
        setIntField(term13830, term13830.getClass(), "transferIndex", 0);
        setIntField(term13830, term13830.getClass(), "cellsBusy", 0);
        setField(term13830, term13830.getClass(), "counterCells", null);
        setField(term13830, term13830.getClass(), "keySet", null);
        setField(term13830, term13830.getClass(), "values", null);
        setField(term13830, term13830.getClass(), "entrySet", null);
        setField(term13830, term13830.getClass(), "keySet", null);
        setField(term13830, term13830.getClass(), "values", null);
        setField(term13783, term13783.getClass(), "lastRulesCache", term13830);
        setField(term13766, term13766.getClass(), "rules", term13783);
        setField(term13745, term13745.getClass(), "zone", term13766);
        setField(term13574, term13574.getClass(), "time_stamp", term13745);
        setField(term13574, term13574.getClass(), "start_up_mode", "cdHYQDgUZR");
        setField(term13574, term13574.getClass(), "cmm_dly_mod", "KAORSSPSeV");
        setField(term13574, term13574.getClass(), "cmm_dly_sec", "UimMMORkzd");
        setField(term13574, term13574.getClass(), "cmm_err_mod", "huVIXUWLtI");
        setField(term13574, term13574.getClass(), "country_code", "vhKzFyKPOT");
        setField(term13574, term13574.getClass(), "region_code", "nQhIgWXdRc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.user.PreStartRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getKey_obj_type", argTypes, term13574, args);
    }

};


