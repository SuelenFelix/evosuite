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

public class RegistrationRequest_setPmm_5708236610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12637;

    public RegistrationRequest_setPmm_5708236610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12637 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.RegistrationRequest"));
        Object term12831 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term12832 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12833 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12837 = newInstance(Class.forName("java.time.LocalTime"));
        Object term12842 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term12852 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term12869 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term12870 = (long[]) newLongArray(1);
        Object[] term12872 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term12873 = (long[]) newLongArray(39);
        Object[] term12913 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term12914 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term12915 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term12916 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term12637, term12637.getClass(), "pmm", "vhKzFyKPOT");
        setField(term12637, term12637.getClass(), "idm", "nQhIgWXdRc");
        setField(term12637, term12637.getClass(), "mmgameid", "EusenEbIoF");
        setField(term12637, term12637.getClass(), "mmuid", "SScVQYSvWH");
        setField(term12637, term12637.getClass(), "a_code", "MnovcqFhCl");
        setIntField(term12637, term12637.getClass(), "aime_id", -1786399638);
        setField(term12637, term12637.getClass(), "aime_a_code", "qYtAeLzOhW");
        setField(term12637, term12637.getClass(), "key_obj_type", "tJzmOfcUnY");
        setField(term12637, term12637.getClass(), "player_name", "TKlccZUpjz");
        setField(term12637, term12637.getClass(), "passwd", "GGzwMoHZXC");
        setField(term12637, term12637.getClass(), "cmd", "IpmgwHTgnG");
        setField(term12637, term12637.getClass(), "req_id", "tIpkeYIezR");
        setField(term12637, term12637.getClass(), "game_id", "YkZtEtthvz");
        setField(term12637, term12637.getClass(), "r_ver", "dwlZSxlXOo");
        setField(term12637, term12637.getClass(), "kc_serial", "lKrEAkypza");
        setField(term12637, term12637.getClass(), "b_serial", "KtuuNAqGCQ");
        setField(term12637, term12637.getClass(), "place_id", "OGQsfjmReM");
        setIntField(term12833, term12833.getClass(), "year", 2015);
        setShortField(term12833, term12833.getClass(), "month", (short) 3);
        setShortField(term12833, term12833.getClass(), "day", (short) 10);
        setField(term12832, term12832.getClass(), "date", term12833);
        setByteField(term12837, term12837.getClass(), "hour", (byte) 23);
        setByteField(term12837, term12837.getClass(), "minute", (byte) 34);
        setByteField(term12837, term12837.getClass(), "second", (byte) 44);
        setIntField(term12837, term12837.getClass(), "nano", 587322824);
        setField(term12832, term12832.getClass(), "time", term12837);
        setField(term12831, term12831.getClass(), "dateTime", term12832);
        setIntField(term12842, term12842.getClass(), "totalSeconds", -10800);
        setField(term12842, term12842.getClass(), "id", "-03:00");
        setField(term12831, term12831.getClass(), "offset", term12842);
        setField(term12852, term12852.getClass(), "id", "America/Recife");
        setLongElement(term12870, 0, -1767217224L);
        setField(term12869, term12869.getClass(), "standardTransitions", term12870);
        setElement(term12872, 1, term12842);
        setField(term12869, term12869.getClass(), "standardOffsets", term12872);
        setLongElement(term12873, 0, -1767217224L);
        setLongElement(term12873, 1, -1206957600L);
        setLongElement(term12873, 2, -1191362400L);
        setLongElement(term12873, 3, -1175374800L);
        setLongElement(term12873, 4, -1159826400L);
        setLongElement(term12873, 5, -633819600L);
        setLongElement(term12873, 6, -622069200L);
        setLongElement(term12873, 7, -602283600L);
        setLongElement(term12873, 8, -591832800L);
        setLongElement(term12873, 9, -570747600L);
        setLongElement(term12873, 10, -560210400L);
        setLongElement(term12873, 11, -539125200L);
        setLongElement(term12873, 12, -531352800L);
        setLongElement(term12873, 13, -191365200L);
        setLongElement(term12873, 14, -184197600L);
        setLongElement(term12873, 15, -155163600L);
        setLongElement(term12873, 16, -150069600L);
        setLongElement(term12873, 17, -128898000L);
        setLongElement(term12873, 18, -121125600L);
        setLongElement(term12873, 19, -99954000L);
        setLongElement(term12873, 20, -89589600L);
        setLongElement(term12873, 21, -68418000L);
        setLongElement(term12873, 22, -57967200L);
        setLongElement(term12873, 23, 499748400L);
        setLongElement(term12873, 24, 511236000L);
        setLongElement(term12873, 25, 530593200L);
        setLongElement(term12873, 26, 540266400L);
        setLongElement(term12873, 27, 562129200L);
        setLongElement(term12873, 28, 571197600L);
        setLongElement(term12873, 29, 592974000L);
        setLongElement(term12873, 30, 602042400L);
        setLongElement(term12873, 31, 624423600L);
        setLongElement(term12873, 32, 634701600L);
        setLongElement(term12873, 33, 938919600L);
        setLongElement(term12873, 34, 951616800L);
        setLongElement(term12873, 35, 970974000L);
        setLongElement(term12873, 36, 971575200L);
        setLongElement(term12873, 37, 1003028400L);
        setLongElement(term12873, 38, 1013911200L);
        setField(term12869, term12869.getClass(), "savingsInstantTransitions", term12873);
        setField(term12869, term12869.getClass(), "savingsLocalTransitions", term12913);
        setElement(term12914, 1, term12842);
        setElement(term12914, 3, term12842);
        setElement(term12914, 5, term12842);
        setElement(term12914, 7, term12842);
        setElement(term12914, 9, term12842);
        setElement(term12914, 11, term12842);
        setElement(term12914, 13, term12842);
        setElement(term12914, 15, term12842);
        setElement(term12914, 17, term12842);
        setElement(term12914, 19, term12842);
        setElement(term12914, 21, term12842);
        setElement(term12914, 23, term12842);
        setElement(term12914, 25, term12842);
        setElement(term12914, 27, term12842);
        setElement(term12914, 29, term12842);
        setElement(term12914, 31, term12842);
        setElement(term12914, 33, term12842);
        setElement(term12914, 35, term12842);
        setElement(term12914, 37, term12842);
        setElement(term12914, 39, term12842);
        setField(term12869, term12869.getClass(), "wallOffsets", term12914);
        setField(term12869, term12869.getClass(), "lastRules", term12915);
        setField(term12916, term12916.getClass(), "table", null);
        setField(term12916, term12916.getClass(), "nextTable", null);
        setLongField(term12916, term12916.getClass(), "baseCount", 0L);
        setIntField(term12916, term12916.getClass(), "sizeCtl", 0);
        setIntField(term12916, term12916.getClass(), "transferIndex", 0);
        setIntField(term12916, term12916.getClass(), "cellsBusy", 0);
        setField(term12916, term12916.getClass(), "counterCells", null);
        setField(term12916, term12916.getClass(), "keySet", null);
        setField(term12916, term12916.getClass(), "values", null);
        setField(term12916, term12916.getClass(), "entrySet", null);
        setField(term12916, term12916.getClass(), "keySet", null);
        setField(term12916, term12916.getClass(), "values", null);
        setField(term12869, term12869.getClass(), "lastRulesCache", term12916);
        setField(term12852, term12852.getClass(), "rules", term12869);
        setField(term12831, term12831.getClass(), "zone", term12852);
        setField(term12637, term12637.getClass(), "time_stamp", term12831);
        setField(term12637, term12637.getClass(), "start_up_mode", "YsUtbngnRO");
        setField(term12637, term12637.getClass(), "cmm_dly_mod", "JisaWUxcNb");
        setField(term12637, term12637.getClass(), "cmm_dly_sec", "NxgmYPzWCI");
        setField(term12637, term12637.getClass(), "cmm_err_mod", "SqjyKmayBx");
        setField(term12637, term12637.getClass(), "country_code", "XjDhvToxJy");
        setField(term12637, term12637.getClass(), "region_code", "nxSTJflLQy");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.RegistrationRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "FlHzxEfFzI";
        callMethod(klass, "setPmm", argTypes, term12637, args);
    }

};


