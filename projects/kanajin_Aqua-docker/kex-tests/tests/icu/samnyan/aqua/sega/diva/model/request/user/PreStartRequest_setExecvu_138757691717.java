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
import java.lang.Boolean;

public class PreStartRequest_setExecvu_138757691717 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19660;
     Object term19993;

    public PreStartRequest_setExecvu_138757691717() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19660 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.user.PreStartRequest"));
        Object term19831 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term19832 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term19833 = newInstance(Class.forName("java.time.LocalDate"));
        Object term19837 = newInstance(Class.forName("java.time.LocalTime"));
        Object term19842 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term19852 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term19869 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term19870 = (long[]) newLongArray(1);
        Object[] term19872 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term19873 = (long[]) newLongArray(39);
        Object[] term19913 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term19914 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term19915 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term19916 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term19660, term19660.getClass(), "pmm", "HqoTWlkbwF");
        setField(term19660, term19660.getClass(), "idm", "CwNELDTAPP");
        setField(term19660, term19660.getClass(), "mmgameid", "GSzQdbHLHw");
        setField(term19660, term19660.getClass(), "mmuid", "IkfarsYNJO");
        setField(term19660, term19660.getClass(), "a_code", "aZKOWhHMEh");
        setIntField(term19660, term19660.getClass(), "aime_id", -1362856620);
        setField(term19660, term19660.getClass(), "aime_a_code", "YfkhviKZwl");
        setField(term19660, term19660.getClass(), "key_obj_type", "DcOhhAfJTI");
        setBooleanField(term19660, term19660.getClass(), "exec_vu", true);
        setField(term19660, term19660.getClass(), "cmd", "gYTIkBFOoS");
        setField(term19660, term19660.getClass(), "req_id", "xmzSoVgiED");
        setField(term19660, term19660.getClass(), "game_id", "pdSvedKgPq");
        setField(term19660, term19660.getClass(), "r_ver", "epPTwvcoyb");
        setField(term19660, term19660.getClass(), "kc_serial", "UBPHmOICBs");
        setField(term19660, term19660.getClass(), "b_serial", "IDJUVPgUJf");
        setField(term19660, term19660.getClass(), "place_id", "JmnWRJUxGr");
        setIntField(term19833, term19833.getClass(), "year", 2010);
        setShortField(term19833, term19833.getClass(), "month", (short) 9);
        setShortField(term19833, term19833.getClass(), "day", (short) 28);
        setField(term19832, term19832.getClass(), "date", term19833);
        setByteField(term19837, term19837.getClass(), "hour", (byte) 6);
        setByteField(term19837, term19837.getClass(), "minute", (byte) 4);
        setByteField(term19837, term19837.getClass(), "second", (byte) 54);
        setIntField(term19837, term19837.getClass(), "nano", 604713782);
        setField(term19832, term19832.getClass(), "time", term19837);
        setField(term19831, term19831.getClass(), "dateTime", term19832);
        setIntField(term19842, term19842.getClass(), "totalSeconds", -10800);
        setField(term19842, term19842.getClass(), "id", "-03:00");
        setField(term19831, term19831.getClass(), "offset", term19842);
        setField(term19852, term19852.getClass(), "id", "America/Recife");
        setLongElement(term19870, 0, -1767217224L);
        setField(term19869, term19869.getClass(), "standardTransitions", term19870);
        setElement(term19872, 1, term19842);
        setField(term19869, term19869.getClass(), "standardOffsets", term19872);
        setLongElement(term19873, 0, -1767217224L);
        setLongElement(term19873, 1, -1206957600L);
        setLongElement(term19873, 2, -1191362400L);
        setLongElement(term19873, 3, -1175374800L);
        setLongElement(term19873, 4, -1159826400L);
        setLongElement(term19873, 5, -633819600L);
        setLongElement(term19873, 6, -622069200L);
        setLongElement(term19873, 7, -602283600L);
        setLongElement(term19873, 8, -591832800L);
        setLongElement(term19873, 9, -570747600L);
        setLongElement(term19873, 10, -560210400L);
        setLongElement(term19873, 11, -539125200L);
        setLongElement(term19873, 12, -531352800L);
        setLongElement(term19873, 13, -191365200L);
        setLongElement(term19873, 14, -184197600L);
        setLongElement(term19873, 15, -155163600L);
        setLongElement(term19873, 16, -150069600L);
        setLongElement(term19873, 17, -128898000L);
        setLongElement(term19873, 18, -121125600L);
        setLongElement(term19873, 19, -99954000L);
        setLongElement(term19873, 20, -89589600L);
        setLongElement(term19873, 21, -68418000L);
        setLongElement(term19873, 22, -57967200L);
        setLongElement(term19873, 23, 499748400L);
        setLongElement(term19873, 24, 511236000L);
        setLongElement(term19873, 25, 530593200L);
        setLongElement(term19873, 26, 540266400L);
        setLongElement(term19873, 27, 562129200L);
        setLongElement(term19873, 28, 571197600L);
        setLongElement(term19873, 29, 592974000L);
        setLongElement(term19873, 30, 602042400L);
        setLongElement(term19873, 31, 624423600L);
        setLongElement(term19873, 32, 634701600L);
        setLongElement(term19873, 33, 938919600L);
        setLongElement(term19873, 34, 951616800L);
        setLongElement(term19873, 35, 970974000L);
        setLongElement(term19873, 36, 971575200L);
        setLongElement(term19873, 37, 1003028400L);
        setLongElement(term19873, 38, 1013911200L);
        setField(term19869, term19869.getClass(), "savingsInstantTransitions", term19873);
        setField(term19869, term19869.getClass(), "savingsLocalTransitions", term19913);
        setElement(term19914, 1, term19842);
        setElement(term19914, 3, term19842);
        setElement(term19914, 5, term19842);
        setElement(term19914, 7, term19842);
        setElement(term19914, 9, term19842);
        setElement(term19914, 11, term19842);
        setElement(term19914, 13, term19842);
        setElement(term19914, 15, term19842);
        setElement(term19914, 17, term19842);
        setElement(term19914, 19, term19842);
        setElement(term19914, 21, term19842);
        setElement(term19914, 23, term19842);
        setElement(term19914, 25, term19842);
        setElement(term19914, 27, term19842);
        setElement(term19914, 29, term19842);
        setElement(term19914, 31, term19842);
        setElement(term19914, 33, term19842);
        setElement(term19914, 35, term19842);
        setElement(term19914, 37, term19842);
        setElement(term19914, 39, term19842);
        setField(term19869, term19869.getClass(), "wallOffsets", term19914);
        setField(term19869, term19869.getClass(), "lastRules", term19915);
        setField(term19916, term19916.getClass(), "table", null);
        setField(term19916, term19916.getClass(), "nextTable", null);
        setLongField(term19916, term19916.getClass(), "baseCount", 0L);
        setIntField(term19916, term19916.getClass(), "sizeCtl", 0);
        setIntField(term19916, term19916.getClass(), "transferIndex", 0);
        setIntField(term19916, term19916.getClass(), "cellsBusy", 0);
        setField(term19916, term19916.getClass(), "counterCells", null);
        setField(term19916, term19916.getClass(), "keySet", null);
        setField(term19916, term19916.getClass(), "values", null);
        setField(term19916, term19916.getClass(), "entrySet", null);
        setField(term19916, term19916.getClass(), "keySet", null);
        setField(term19916, term19916.getClass(), "values", null);
        setField(term19869, term19869.getClass(), "lastRulesCache", term19916);
        setField(term19852, term19852.getClass(), "rules", term19869);
        setField(term19831, term19831.getClass(), "zone", term19852);
        setField(term19660, term19660.getClass(), "time_stamp", term19831);
        setField(term19660, term19660.getClass(), "start_up_mode", "wgRGBNrTGP");
        setField(term19660, term19660.getClass(), "cmm_dly_mod", "FIdNVptZpW");
        setField(term19660, term19660.getClass(), "cmm_dly_sec", "rQjxAhisjm");
        setField(term19660, term19660.getClass(), "cmm_err_mod", "ZDhASPHjDG");
        setField(term19660, term19660.getClass(), "country_code", "HNVOAXYNEZ");
        setField(term19660, term19660.getClass(), "region_code", "gbbYBYyfvr");
        term19993 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.user.PreStartRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term19993;
        callMethod(klass, "setExec_vu", argTypes, term19660, args);
    }

};


