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

public class RegistrationRequest_getKeyobjtype_13437042607 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10729;

    public RegistrationRequest_getKeyobjtype_13437042607() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10729 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.RegistrationRequest"));
        Object term10923 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term10924 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10925 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10929 = newInstance(Class.forName("java.time.LocalTime"));
        Object term10934 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term10944 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term10961 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term10962 = (long[]) newLongArray(1);
        Object[] term10964 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term10965 = (long[]) newLongArray(39);
        Object[] term11005 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term11006 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term11007 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term11008 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term10729, term10729.getClass(), "pmm", "UPUbwyHQKN");
        setField(term10729, term10729.getClass(), "idm", "lgQkrXANyI");
        setField(term10729, term10729.getClass(), "mmgameid", "MeTmRZXErV");
        setField(term10729, term10729.getClass(), "mmuid", "jNxbVmoZgq");
        setField(term10729, term10729.getClass(), "a_code", "PvmBHIXaMY");
        setIntField(term10729, term10729.getClass(), "aime_id", -14890619);
        setField(term10729, term10729.getClass(), "aime_a_code", "hulYxtowxw");
        setField(term10729, term10729.getClass(), "key_obj_type", "GNEmuHPNcU");
        setField(term10729, term10729.getClass(), "player_name", "IoSfuKDFRe");
        setField(term10729, term10729.getClass(), "passwd", "AWYyZiNfsm");
        setField(term10729, term10729.getClass(), "cmd", "ITRRYiuDwH");
        setField(term10729, term10729.getClass(), "req_id", "llRfwANcVF");
        setField(term10729, term10729.getClass(), "game_id", "sUEeHQTWkA");
        setField(term10729, term10729.getClass(), "r_ver", "BDIRCxAWLA");
        setField(term10729, term10729.getClass(), "kc_serial", "eOJfbiZLnb");
        setField(term10729, term10729.getClass(), "b_serial", "nKZKnxWYCK");
        setField(term10729, term10729.getClass(), "place_id", "JOqQxuzRuZ");
        setIntField(term10925, term10925.getClass(), "year", 2020);
        setShortField(term10925, term10925.getClass(), "month", (short) 7);
        setShortField(term10925, term10925.getClass(), "day", (short) 24);
        setField(term10924, term10924.getClass(), "date", term10925);
        setByteField(term10929, term10929.getClass(), "hour", (byte) 0);
        setByteField(term10929, term10929.getClass(), "minute", (byte) 59);
        setByteField(term10929, term10929.getClass(), "second", (byte) 56);
        setIntField(term10929, term10929.getClass(), "nano", 320219201);
        setField(term10924, term10924.getClass(), "time", term10929);
        setField(term10923, term10923.getClass(), "dateTime", term10924);
        setIntField(term10934, term10934.getClass(), "totalSeconds", -10800);
        setField(term10934, term10934.getClass(), "id", "-03:00");
        setField(term10923, term10923.getClass(), "offset", term10934);
        setField(term10944, term10944.getClass(), "id", "America/Recife");
        setLongElement(term10962, 0, -1767217224L);
        setField(term10961, term10961.getClass(), "standardTransitions", term10962);
        setElement(term10964, 1, term10934);
        setField(term10961, term10961.getClass(), "standardOffsets", term10964);
        setLongElement(term10965, 0, -1767217224L);
        setLongElement(term10965, 1, -1206957600L);
        setLongElement(term10965, 2, -1191362400L);
        setLongElement(term10965, 3, -1175374800L);
        setLongElement(term10965, 4, -1159826400L);
        setLongElement(term10965, 5, -633819600L);
        setLongElement(term10965, 6, -622069200L);
        setLongElement(term10965, 7, -602283600L);
        setLongElement(term10965, 8, -591832800L);
        setLongElement(term10965, 9, -570747600L);
        setLongElement(term10965, 10, -560210400L);
        setLongElement(term10965, 11, -539125200L);
        setLongElement(term10965, 12, -531352800L);
        setLongElement(term10965, 13, -191365200L);
        setLongElement(term10965, 14, -184197600L);
        setLongElement(term10965, 15, -155163600L);
        setLongElement(term10965, 16, -150069600L);
        setLongElement(term10965, 17, -128898000L);
        setLongElement(term10965, 18, -121125600L);
        setLongElement(term10965, 19, -99954000L);
        setLongElement(term10965, 20, -89589600L);
        setLongElement(term10965, 21, -68418000L);
        setLongElement(term10965, 22, -57967200L);
        setLongElement(term10965, 23, 499748400L);
        setLongElement(term10965, 24, 511236000L);
        setLongElement(term10965, 25, 530593200L);
        setLongElement(term10965, 26, 540266400L);
        setLongElement(term10965, 27, 562129200L);
        setLongElement(term10965, 28, 571197600L);
        setLongElement(term10965, 29, 592974000L);
        setLongElement(term10965, 30, 602042400L);
        setLongElement(term10965, 31, 624423600L);
        setLongElement(term10965, 32, 634701600L);
        setLongElement(term10965, 33, 938919600L);
        setLongElement(term10965, 34, 951616800L);
        setLongElement(term10965, 35, 970974000L);
        setLongElement(term10965, 36, 971575200L);
        setLongElement(term10965, 37, 1003028400L);
        setLongElement(term10965, 38, 1013911200L);
        setField(term10961, term10961.getClass(), "savingsInstantTransitions", term10965);
        setField(term10961, term10961.getClass(), "savingsLocalTransitions", term11005);
        setElement(term11006, 1, term10934);
        setElement(term11006, 3, term10934);
        setElement(term11006, 5, term10934);
        setElement(term11006, 7, term10934);
        setElement(term11006, 9, term10934);
        setElement(term11006, 11, term10934);
        setElement(term11006, 13, term10934);
        setElement(term11006, 15, term10934);
        setElement(term11006, 17, term10934);
        setElement(term11006, 19, term10934);
        setElement(term11006, 21, term10934);
        setElement(term11006, 23, term10934);
        setElement(term11006, 25, term10934);
        setElement(term11006, 27, term10934);
        setElement(term11006, 29, term10934);
        setElement(term11006, 31, term10934);
        setElement(term11006, 33, term10934);
        setElement(term11006, 35, term10934);
        setElement(term11006, 37, term10934);
        setElement(term11006, 39, term10934);
        setField(term10961, term10961.getClass(), "wallOffsets", term11006);
        setField(term10961, term10961.getClass(), "lastRules", term11007);
        setField(term11008, term11008.getClass(), "table", null);
        setField(term11008, term11008.getClass(), "nextTable", null);
        setLongField(term11008, term11008.getClass(), "baseCount", 0L);
        setIntField(term11008, term11008.getClass(), "sizeCtl", 0);
        setIntField(term11008, term11008.getClass(), "transferIndex", 0);
        setIntField(term11008, term11008.getClass(), "cellsBusy", 0);
        setField(term11008, term11008.getClass(), "counterCells", null);
        setField(term11008, term11008.getClass(), "keySet", null);
        setField(term11008, term11008.getClass(), "values", null);
        setField(term11008, term11008.getClass(), "entrySet", null);
        setField(term11008, term11008.getClass(), "keySet", null);
        setField(term11008, term11008.getClass(), "values", null);
        setField(term10961, term10961.getClass(), "lastRulesCache", term11008);
        setField(term10944, term10944.getClass(), "rules", term10961);
        setField(term10923, term10923.getClass(), "zone", term10944);
        setField(term10729, term10729.getClass(), "time_stamp", term10923);
        setField(term10729, term10729.getClass(), "start_up_mode", "RSaoipUlsg");
        setField(term10729, term10729.getClass(), "cmm_dly_mod", "cSHGbqKqlN");
        setField(term10729, term10729.getClass(), "cmm_dly_sec", "pFAfANnxup");
        setField(term10729, term10729.getClass(), "cmm_err_mod", "FbSIUZyBXZ");
        setField(term10729, term10729.getClass(), "country_code", "mhQDwIyrRi");
        setField(term10729, term10729.getClass(), "region_code", "HpZXWDPhlg");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.RegistrationRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getKey_obj_type", argTypes, term10729, args);
    }

};


