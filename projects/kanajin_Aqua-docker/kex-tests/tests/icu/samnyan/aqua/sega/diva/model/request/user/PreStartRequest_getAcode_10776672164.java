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

public class PreStartRequest_getAcode_10776672164 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11795;

    public PreStartRequest_getAcode_10776672164() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11795 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.user.PreStartRequest"));
        Object term11966 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term11967 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11968 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11972 = newInstance(Class.forName("java.time.LocalTime"));
        Object term11977 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term11987 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term12004 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term12005 = (long[]) newLongArray(1);
        Object[] term12007 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term12008 = (long[]) newLongArray(39);
        Object[] term12048 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term12049 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term12050 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term12051 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term11795, term11795.getClass(), "pmm", "fzeqPnzpnt");
        setField(term11795, term11795.getClass(), "idm", "RxbhrFBjkO");
        setField(term11795, term11795.getClass(), "mmgameid", "aanyiAOJCl");
        setField(term11795, term11795.getClass(), "mmuid", "VDokbsCuqq");
        setField(term11795, term11795.getClass(), "a_code", "xClUIcPECX");
        setIntField(term11795, term11795.getClass(), "aime_id", -1464172784);
        setField(term11795, term11795.getClass(), "aime_a_code", "avhRaGZaBF");
        setField(term11795, term11795.getClass(), "key_obj_type", "JkgoRtImdE");
        setBooleanField(term11795, term11795.getClass(), "exec_vu", true);
        setField(term11795, term11795.getClass(), "cmd", "qFGKIJjlmV");
        setField(term11795, term11795.getClass(), "req_id", "IHqvyhMtuM");
        setField(term11795, term11795.getClass(), "game_id", "dAldIGYAXV");
        setField(term11795, term11795.getClass(), "r_ver", "mLwibAPEsa");
        setField(term11795, term11795.getClass(), "kc_serial", "zsWKWiTFuo");
        setField(term11795, term11795.getClass(), "b_serial", "UPUbwyHQKN");
        setField(term11795, term11795.getClass(), "place_id", "lgQkrXANyI");
        setIntField(term11968, term11968.getClass(), "year", 2025);
        setShortField(term11968, term11968.getClass(), "month", (short) 3);
        setShortField(term11968, term11968.getClass(), "day", (short) 9);
        setField(term11967, term11967.getClass(), "date", term11968);
        setByteField(term11972, term11972.getClass(), "hour", (byte) 5);
        setByteField(term11972, term11972.getClass(), "minute", (byte) 49);
        setByteField(term11972, term11972.getClass(), "second", (byte) 12);
        setIntField(term11972, term11972.getClass(), "nano", 791695028);
        setField(term11967, term11967.getClass(), "time", term11972);
        setField(term11966, term11966.getClass(), "dateTime", term11967);
        setIntField(term11977, term11977.getClass(), "totalSeconds", -10800);
        setField(term11977, term11977.getClass(), "id", "-03:00");
        setField(term11966, term11966.getClass(), "offset", term11977);
        setField(term11987, term11987.getClass(), "id", "America/Recife");
        setLongElement(term12005, 0, -1767217224L);
        setField(term12004, term12004.getClass(), "standardTransitions", term12005);
        setElement(term12007, 1, term11977);
        setField(term12004, term12004.getClass(), "standardOffsets", term12007);
        setLongElement(term12008, 0, -1767217224L);
        setLongElement(term12008, 1, -1206957600L);
        setLongElement(term12008, 2, -1191362400L);
        setLongElement(term12008, 3, -1175374800L);
        setLongElement(term12008, 4, -1159826400L);
        setLongElement(term12008, 5, -633819600L);
        setLongElement(term12008, 6, -622069200L);
        setLongElement(term12008, 7, -602283600L);
        setLongElement(term12008, 8, -591832800L);
        setLongElement(term12008, 9, -570747600L);
        setLongElement(term12008, 10, -560210400L);
        setLongElement(term12008, 11, -539125200L);
        setLongElement(term12008, 12, -531352800L);
        setLongElement(term12008, 13, -191365200L);
        setLongElement(term12008, 14, -184197600L);
        setLongElement(term12008, 15, -155163600L);
        setLongElement(term12008, 16, -150069600L);
        setLongElement(term12008, 17, -128898000L);
        setLongElement(term12008, 18, -121125600L);
        setLongElement(term12008, 19, -99954000L);
        setLongElement(term12008, 20, -89589600L);
        setLongElement(term12008, 21, -68418000L);
        setLongElement(term12008, 22, -57967200L);
        setLongElement(term12008, 23, 499748400L);
        setLongElement(term12008, 24, 511236000L);
        setLongElement(term12008, 25, 530593200L);
        setLongElement(term12008, 26, 540266400L);
        setLongElement(term12008, 27, 562129200L);
        setLongElement(term12008, 28, 571197600L);
        setLongElement(term12008, 29, 592974000L);
        setLongElement(term12008, 30, 602042400L);
        setLongElement(term12008, 31, 624423600L);
        setLongElement(term12008, 32, 634701600L);
        setLongElement(term12008, 33, 938919600L);
        setLongElement(term12008, 34, 951616800L);
        setLongElement(term12008, 35, 970974000L);
        setLongElement(term12008, 36, 971575200L);
        setLongElement(term12008, 37, 1003028400L);
        setLongElement(term12008, 38, 1013911200L);
        setField(term12004, term12004.getClass(), "savingsInstantTransitions", term12008);
        setField(term12004, term12004.getClass(), "savingsLocalTransitions", term12048);
        setElement(term12049, 1, term11977);
        setElement(term12049, 3, term11977);
        setElement(term12049, 5, term11977);
        setElement(term12049, 7, term11977);
        setElement(term12049, 9, term11977);
        setElement(term12049, 11, term11977);
        setElement(term12049, 13, term11977);
        setElement(term12049, 15, term11977);
        setElement(term12049, 17, term11977);
        setElement(term12049, 19, term11977);
        setElement(term12049, 21, term11977);
        setElement(term12049, 23, term11977);
        setElement(term12049, 25, term11977);
        setElement(term12049, 27, term11977);
        setElement(term12049, 29, term11977);
        setElement(term12049, 31, term11977);
        setElement(term12049, 33, term11977);
        setElement(term12049, 35, term11977);
        setElement(term12049, 37, term11977);
        setElement(term12049, 39, term11977);
        setField(term12004, term12004.getClass(), "wallOffsets", term12049);
        setField(term12004, term12004.getClass(), "lastRules", term12050);
        setField(term12051, term12051.getClass(), "table", null);
        setField(term12051, term12051.getClass(), "nextTable", null);
        setLongField(term12051, term12051.getClass(), "baseCount", 0L);
        setIntField(term12051, term12051.getClass(), "sizeCtl", 0);
        setIntField(term12051, term12051.getClass(), "transferIndex", 0);
        setIntField(term12051, term12051.getClass(), "cellsBusy", 0);
        setField(term12051, term12051.getClass(), "counterCells", null);
        setField(term12051, term12051.getClass(), "keySet", null);
        setField(term12051, term12051.getClass(), "values", null);
        setField(term12051, term12051.getClass(), "entrySet", null);
        setField(term12051, term12051.getClass(), "keySet", null);
        setField(term12051, term12051.getClass(), "values", null);
        setField(term12004, term12004.getClass(), "lastRulesCache", term12051);
        setField(term11987, term11987.getClass(), "rules", term12004);
        setField(term11966, term11966.getClass(), "zone", term11987);
        setField(term11795, term11795.getClass(), "time_stamp", term11966);
        setField(term11795, term11795.getClass(), "start_up_mode", "MeTmRZXErV");
        setField(term11795, term11795.getClass(), "cmm_dly_mod", "jNxbVmoZgq");
        setField(term11795, term11795.getClass(), "cmm_dly_sec", "PvmBHIXaMY");
        setField(term11795, term11795.getClass(), "cmm_err_mod", "hulYxtowxw");
        setField(term11795, term11795.getClass(), "country_code", "GNEmuHPNcU");
        setField(term11795, term11795.getClass(), "region_code", "IoSfuKDFRe");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.user.PreStartRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getA_code", argTypes, term11795, args);
    }

};


