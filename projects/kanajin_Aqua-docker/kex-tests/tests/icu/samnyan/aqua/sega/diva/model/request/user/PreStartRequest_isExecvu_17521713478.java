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

public class PreStartRequest_isExecvu_17521713478 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14167;

    public PreStartRequest_isExecvu_17521713478() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14167 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.user.PreStartRequest"));
        Object term14338 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term14339 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term14340 = newInstance(Class.forName("java.time.LocalDate"));
        Object term14344 = newInstance(Class.forName("java.time.LocalTime"));
        Object term14349 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term14359 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term14376 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term14377 = (long[]) newLongArray(1);
        Object[] term14379 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term14380 = (long[]) newLongArray(39);
        Object[] term14420 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term14421 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term14422 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term14423 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term14167, term14167.getClass(), "pmm", "EusenEbIoF");
        setField(term14167, term14167.getClass(), "idm", "SScVQYSvWH");
        setField(term14167, term14167.getClass(), "mmgameid", "MnovcqFhCl");
        setField(term14167, term14167.getClass(), "mmuid", "qYtAeLzOhW");
        setField(term14167, term14167.getClass(), "a_code", "tJzmOfcUnY");
        setIntField(term14167, term14167.getClass(), "aime_id", 574481092);
        setField(term14167, term14167.getClass(), "aime_a_code", "TKlccZUpjz");
        setField(term14167, term14167.getClass(), "key_obj_type", "GGzwMoHZXC");
        setBooleanField(term14167, term14167.getClass(), "exec_vu", false);
        setField(term14167, term14167.getClass(), "cmd", "IpmgwHTgnG");
        setField(term14167, term14167.getClass(), "req_id", "tIpkeYIezR");
        setField(term14167, term14167.getClass(), "game_id", "YkZtEtthvz");
        setField(term14167, term14167.getClass(), "r_ver", "dwlZSxlXOo");
        setField(term14167, term14167.getClass(), "kc_serial", "lKrEAkypza");
        setField(term14167, term14167.getClass(), "b_serial", "KtuuNAqGCQ");
        setField(term14167, term14167.getClass(), "place_id", "OGQsfjmReM");
        setIntField(term14340, term14340.getClass(), "year", 2021);
        setShortField(term14340, term14340.getClass(), "month", (short) 8);
        setShortField(term14340, term14340.getClass(), "day", (short) 12);
        setField(term14339, term14339.getClass(), "date", term14340);
        setByteField(term14344, term14344.getClass(), "hour", (byte) 2);
        setByteField(term14344, term14344.getClass(), "minute", (byte) 17);
        setByteField(term14344, term14344.getClass(), "second", (byte) 51);
        setIntField(term14344, term14344.getClass(), "nano", 207375141);
        setField(term14339, term14339.getClass(), "time", term14344);
        setField(term14338, term14338.getClass(), "dateTime", term14339);
        setIntField(term14349, term14349.getClass(), "totalSeconds", -10800);
        setField(term14349, term14349.getClass(), "id", "-03:00");
        setField(term14338, term14338.getClass(), "offset", term14349);
        setField(term14359, term14359.getClass(), "id", "America/Recife");
        setLongElement(term14377, 0, -1767217224L);
        setField(term14376, term14376.getClass(), "standardTransitions", term14377);
        setElement(term14379, 1, term14349);
        setField(term14376, term14376.getClass(), "standardOffsets", term14379);
        setLongElement(term14380, 0, -1767217224L);
        setLongElement(term14380, 1, -1206957600L);
        setLongElement(term14380, 2, -1191362400L);
        setLongElement(term14380, 3, -1175374800L);
        setLongElement(term14380, 4, -1159826400L);
        setLongElement(term14380, 5, -633819600L);
        setLongElement(term14380, 6, -622069200L);
        setLongElement(term14380, 7, -602283600L);
        setLongElement(term14380, 8, -591832800L);
        setLongElement(term14380, 9, -570747600L);
        setLongElement(term14380, 10, -560210400L);
        setLongElement(term14380, 11, -539125200L);
        setLongElement(term14380, 12, -531352800L);
        setLongElement(term14380, 13, -191365200L);
        setLongElement(term14380, 14, -184197600L);
        setLongElement(term14380, 15, -155163600L);
        setLongElement(term14380, 16, -150069600L);
        setLongElement(term14380, 17, -128898000L);
        setLongElement(term14380, 18, -121125600L);
        setLongElement(term14380, 19, -99954000L);
        setLongElement(term14380, 20, -89589600L);
        setLongElement(term14380, 21, -68418000L);
        setLongElement(term14380, 22, -57967200L);
        setLongElement(term14380, 23, 499748400L);
        setLongElement(term14380, 24, 511236000L);
        setLongElement(term14380, 25, 530593200L);
        setLongElement(term14380, 26, 540266400L);
        setLongElement(term14380, 27, 562129200L);
        setLongElement(term14380, 28, 571197600L);
        setLongElement(term14380, 29, 592974000L);
        setLongElement(term14380, 30, 602042400L);
        setLongElement(term14380, 31, 624423600L);
        setLongElement(term14380, 32, 634701600L);
        setLongElement(term14380, 33, 938919600L);
        setLongElement(term14380, 34, 951616800L);
        setLongElement(term14380, 35, 970974000L);
        setLongElement(term14380, 36, 971575200L);
        setLongElement(term14380, 37, 1003028400L);
        setLongElement(term14380, 38, 1013911200L);
        setField(term14376, term14376.getClass(), "savingsInstantTransitions", term14380);
        setField(term14376, term14376.getClass(), "savingsLocalTransitions", term14420);
        setElement(term14421, 1, term14349);
        setElement(term14421, 3, term14349);
        setElement(term14421, 5, term14349);
        setElement(term14421, 7, term14349);
        setElement(term14421, 9, term14349);
        setElement(term14421, 11, term14349);
        setElement(term14421, 13, term14349);
        setElement(term14421, 15, term14349);
        setElement(term14421, 17, term14349);
        setElement(term14421, 19, term14349);
        setElement(term14421, 21, term14349);
        setElement(term14421, 23, term14349);
        setElement(term14421, 25, term14349);
        setElement(term14421, 27, term14349);
        setElement(term14421, 29, term14349);
        setElement(term14421, 31, term14349);
        setElement(term14421, 33, term14349);
        setElement(term14421, 35, term14349);
        setElement(term14421, 37, term14349);
        setElement(term14421, 39, term14349);
        setField(term14376, term14376.getClass(), "wallOffsets", term14421);
        setField(term14376, term14376.getClass(), "lastRules", term14422);
        setField(term14423, term14423.getClass(), "table", null);
        setField(term14423, term14423.getClass(), "nextTable", null);
        setLongField(term14423, term14423.getClass(), "baseCount", 0L);
        setIntField(term14423, term14423.getClass(), "sizeCtl", 0);
        setIntField(term14423, term14423.getClass(), "transferIndex", 0);
        setIntField(term14423, term14423.getClass(), "cellsBusy", 0);
        setField(term14423, term14423.getClass(), "counterCells", null);
        setField(term14423, term14423.getClass(), "keySet", null);
        setField(term14423, term14423.getClass(), "values", null);
        setField(term14423, term14423.getClass(), "entrySet", null);
        setField(term14423, term14423.getClass(), "keySet", null);
        setField(term14423, term14423.getClass(), "values", null);
        setField(term14376, term14376.getClass(), "lastRulesCache", term14423);
        setField(term14359, term14359.getClass(), "rules", term14376);
        setField(term14338, term14338.getClass(), "zone", term14359);
        setField(term14167, term14167.getClass(), "time_stamp", term14338);
        setField(term14167, term14167.getClass(), "start_up_mode", "YsUtbngnRO");
        setField(term14167, term14167.getClass(), "cmm_dly_mod", "JisaWUxcNb");
        setField(term14167, term14167.getClass(), "cmm_dly_sec", "NxgmYPzWCI");
        setField(term14167, term14167.getClass(), "cmm_err_mod", "SqjyKmayBx");
        setField(term14167, term14167.getClass(), "country_code", "XjDhvToxJy");
        setField(term14167, term14167.getClass(), "region_code", "nxSTJflLQy");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.user.PreStartRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isExec_vu", argTypes, term14167, args);
    }

};


