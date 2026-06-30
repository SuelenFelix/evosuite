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

public class PreStartRequest_setPmm_5664946159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14760;

    public PreStartRequest_setPmm_5664946159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14760 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.user.PreStartRequest"));
        Object term14931 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term14932 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term14933 = newInstance(Class.forName("java.time.LocalDate"));
        Object term14937 = newInstance(Class.forName("java.time.LocalTime"));
        Object term14942 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term14952 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term14969 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term14970 = (long[]) newLongArray(1);
        Object[] term14972 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term14973 = (long[]) newLongArray(39);
        Object[] term15013 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term15014 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term15015 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term15016 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term14760, term14760.getClass(), "pmm", "FlHzxEfFzI");
        setField(term14760, term14760.getClass(), "idm", "aSATgQUpoe");
        setField(term14760, term14760.getClass(), "mmgameid", "VkPSXewZfB");
        setField(term14760, term14760.getClass(), "mmuid", "ubodzJoMGW");
        setField(term14760, term14760.getClass(), "a_code", "weddIktxOA");
        setIntField(term14760, term14760.getClass(), "aime_id", -310528004);
        setField(term14760, term14760.getClass(), "aime_a_code", "uSlMeISsDD");
        setField(term14760, term14760.getClass(), "key_obj_type", "WdCiTDUKqn");
        setBooleanField(term14760, term14760.getClass(), "exec_vu", true);
        setField(term14760, term14760.getClass(), "cmd", "PSizQDoxxe");
        setField(term14760, term14760.getClass(), "req_id", "mKaHyMybrK");
        setField(term14760, term14760.getClass(), "game_id", "AyrEXuGrEj");
        setField(term14760, term14760.getClass(), "r_ver", "yevIIoVYHq");
        setField(term14760, term14760.getClass(), "kc_serial", "UuYWMTqWTV");
        setField(term14760, term14760.getClass(), "b_serial", "DSFGlcaXUb");
        setField(term14760, term14760.getClass(), "place_id", "sHMXNUzNeM");
        setIntField(term14933, term14933.getClass(), "year", 2025);
        setShortField(term14933, term14933.getClass(), "month", (short) 11);
        setShortField(term14933, term14933.getClass(), "day", (short) 3);
        setField(term14932, term14932.getClass(), "date", term14933);
        setByteField(term14937, term14937.getClass(), "hour", (byte) 21);
        setByteField(term14937, term14937.getClass(), "minute", (byte) 24);
        setByteField(term14937, term14937.getClass(), "second", (byte) 23);
        setIntField(term14937, term14937.getClass(), "nano", 210986721);
        setField(term14932, term14932.getClass(), "time", term14937);
        setField(term14931, term14931.getClass(), "dateTime", term14932);
        setIntField(term14942, term14942.getClass(), "totalSeconds", -10800);
        setField(term14942, term14942.getClass(), "id", "-03:00");
        setField(term14931, term14931.getClass(), "offset", term14942);
        setField(term14952, term14952.getClass(), "id", "America/Recife");
        setLongElement(term14970, 0, -1767217224L);
        setField(term14969, term14969.getClass(), "standardTransitions", term14970);
        setElement(term14972, 1, term14942);
        setField(term14969, term14969.getClass(), "standardOffsets", term14972);
        setLongElement(term14973, 0, -1767217224L);
        setLongElement(term14973, 1, -1206957600L);
        setLongElement(term14973, 2, -1191362400L);
        setLongElement(term14973, 3, -1175374800L);
        setLongElement(term14973, 4, -1159826400L);
        setLongElement(term14973, 5, -633819600L);
        setLongElement(term14973, 6, -622069200L);
        setLongElement(term14973, 7, -602283600L);
        setLongElement(term14973, 8, -591832800L);
        setLongElement(term14973, 9, -570747600L);
        setLongElement(term14973, 10, -560210400L);
        setLongElement(term14973, 11, -539125200L);
        setLongElement(term14973, 12, -531352800L);
        setLongElement(term14973, 13, -191365200L);
        setLongElement(term14973, 14, -184197600L);
        setLongElement(term14973, 15, -155163600L);
        setLongElement(term14973, 16, -150069600L);
        setLongElement(term14973, 17, -128898000L);
        setLongElement(term14973, 18, -121125600L);
        setLongElement(term14973, 19, -99954000L);
        setLongElement(term14973, 20, -89589600L);
        setLongElement(term14973, 21, -68418000L);
        setLongElement(term14973, 22, -57967200L);
        setLongElement(term14973, 23, 499748400L);
        setLongElement(term14973, 24, 511236000L);
        setLongElement(term14973, 25, 530593200L);
        setLongElement(term14973, 26, 540266400L);
        setLongElement(term14973, 27, 562129200L);
        setLongElement(term14973, 28, 571197600L);
        setLongElement(term14973, 29, 592974000L);
        setLongElement(term14973, 30, 602042400L);
        setLongElement(term14973, 31, 624423600L);
        setLongElement(term14973, 32, 634701600L);
        setLongElement(term14973, 33, 938919600L);
        setLongElement(term14973, 34, 951616800L);
        setLongElement(term14973, 35, 970974000L);
        setLongElement(term14973, 36, 971575200L);
        setLongElement(term14973, 37, 1003028400L);
        setLongElement(term14973, 38, 1013911200L);
        setField(term14969, term14969.getClass(), "savingsInstantTransitions", term14973);
        setField(term14969, term14969.getClass(), "savingsLocalTransitions", term15013);
        setElement(term15014, 1, term14942);
        setElement(term15014, 3, term14942);
        setElement(term15014, 5, term14942);
        setElement(term15014, 7, term14942);
        setElement(term15014, 9, term14942);
        setElement(term15014, 11, term14942);
        setElement(term15014, 13, term14942);
        setElement(term15014, 15, term14942);
        setElement(term15014, 17, term14942);
        setElement(term15014, 19, term14942);
        setElement(term15014, 21, term14942);
        setElement(term15014, 23, term14942);
        setElement(term15014, 25, term14942);
        setElement(term15014, 27, term14942);
        setElement(term15014, 29, term14942);
        setElement(term15014, 31, term14942);
        setElement(term15014, 33, term14942);
        setElement(term15014, 35, term14942);
        setElement(term15014, 37, term14942);
        setElement(term15014, 39, term14942);
        setField(term14969, term14969.getClass(), "wallOffsets", term15014);
        setField(term14969, term14969.getClass(), "lastRules", term15015);
        setField(term15016, term15016.getClass(), "table", null);
        setField(term15016, term15016.getClass(), "nextTable", null);
        setLongField(term15016, term15016.getClass(), "baseCount", 0L);
        setIntField(term15016, term15016.getClass(), "sizeCtl", 0);
        setIntField(term15016, term15016.getClass(), "transferIndex", 0);
        setIntField(term15016, term15016.getClass(), "cellsBusy", 0);
        setField(term15016, term15016.getClass(), "counterCells", null);
        setField(term15016, term15016.getClass(), "keySet", null);
        setField(term15016, term15016.getClass(), "values", null);
        setField(term15016, term15016.getClass(), "entrySet", null);
        setField(term15016, term15016.getClass(), "keySet", null);
        setField(term15016, term15016.getClass(), "values", null);
        setField(term14969, term14969.getClass(), "lastRulesCache", term15016);
        setField(term14952, term14952.getClass(), "rules", term14969);
        setField(term14931, term14931.getClass(), "zone", term14952);
        setField(term14760, term14760.getClass(), "time_stamp", term14931);
        setField(term14760, term14760.getClass(), "start_up_mode", "gPzGDOEPPw");
        setField(term14760, term14760.getClass(), "cmm_dly_mod", "rwKoAngzCu");
        setField(term14760, term14760.getClass(), "cmm_dly_sec", "VUkRVwROTl");
        setField(term14760, term14760.getClass(), "cmm_err_mod", "UDlkdccCRn");
        setField(term14760, term14760.getClass(), "country_code", "McpzErOcYb");
        setField(term14760, term14760.getClass(), "region_code", "jqrVEUvYEz");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.user.PreStartRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "QITgiBrmfj";
        callMethod(klass, "setPmm", argTypes, term14760, args);
    }

};


