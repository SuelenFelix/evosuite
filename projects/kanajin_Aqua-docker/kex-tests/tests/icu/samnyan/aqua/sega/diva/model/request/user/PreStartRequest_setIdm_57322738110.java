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

public class PreStartRequest_setIdm_57322738110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15375;

    public PreStartRequest_setIdm_57322738110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15375 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.user.PreStartRequest"));
        Object term15546 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term15547 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term15548 = newInstance(Class.forName("java.time.LocalDate"));
        Object term15552 = newInstance(Class.forName("java.time.LocalTime"));
        Object term15557 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term15567 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term15584 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term15585 = (long[]) newLongArray(1);
        Object[] term15587 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term15588 = (long[]) newLongArray(39);
        Object[] term15628 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term15629 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term15630 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term15631 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term15375, term15375.getClass(), "pmm", "pXxkiXgQnq");
        setField(term15375, term15375.getClass(), "idm", "tKmrUDURku");
        setField(term15375, term15375.getClass(), "mmgameid", "JeZbrwZmsP");
        setField(term15375, term15375.getClass(), "mmuid", "bxyfeicqrK");
        setField(term15375, term15375.getClass(), "a_code", "vBnWPlsZMk");
        setIntField(term15375, term15375.getClass(), "aime_id", -634976996);
        setField(term15375, term15375.getClass(), "aime_a_code", "fIZsWucfXz");
        setField(term15375, term15375.getClass(), "key_obj_type", "IApvtmfhnq");
        setBooleanField(term15375, term15375.getClass(), "exec_vu", false);
        setField(term15375, term15375.getClass(), "cmd", "VSaNnhMpRc");
        setField(term15375, term15375.getClass(), "req_id", "QNjNTLlUaV");
        setField(term15375, term15375.getClass(), "game_id", "hIYsRyOZxk");
        setField(term15375, term15375.getClass(), "r_ver", "RjNoEywJbC");
        setField(term15375, term15375.getClass(), "kc_serial", "RTTvrwwhou");
        setField(term15375, term15375.getClass(), "b_serial", "lRORwXipuk");
        setField(term15375, term15375.getClass(), "place_id", "fVdTcjgHdw");
        setIntField(term15548, term15548.getClass(), "year", 2016);
        setShortField(term15548, term15548.getClass(), "month", (short) 6);
        setShortField(term15548, term15548.getClass(), "day", (short) 15);
        setField(term15547, term15547.getClass(), "date", term15548);
        setByteField(term15552, term15552.getClass(), "hour", (byte) 21);
        setByteField(term15552, term15552.getClass(), "minute", (byte) 23);
        setByteField(term15552, term15552.getClass(), "second", (byte) 23);
        setIntField(term15552, term15552.getClass(), "nano", 433372070);
        setField(term15547, term15547.getClass(), "time", term15552);
        setField(term15546, term15546.getClass(), "dateTime", term15547);
        setIntField(term15557, term15557.getClass(), "totalSeconds", -10800);
        setField(term15557, term15557.getClass(), "id", "-03:00");
        setField(term15546, term15546.getClass(), "offset", term15557);
        setField(term15567, term15567.getClass(), "id", "America/Recife");
        setLongElement(term15585, 0, -1767217224L);
        setField(term15584, term15584.getClass(), "standardTransitions", term15585);
        setElement(term15587, 1, term15557);
        setField(term15584, term15584.getClass(), "standardOffsets", term15587);
        setLongElement(term15588, 0, -1767217224L);
        setLongElement(term15588, 1, -1206957600L);
        setLongElement(term15588, 2, -1191362400L);
        setLongElement(term15588, 3, -1175374800L);
        setLongElement(term15588, 4, -1159826400L);
        setLongElement(term15588, 5, -633819600L);
        setLongElement(term15588, 6, -622069200L);
        setLongElement(term15588, 7, -602283600L);
        setLongElement(term15588, 8, -591832800L);
        setLongElement(term15588, 9, -570747600L);
        setLongElement(term15588, 10, -560210400L);
        setLongElement(term15588, 11, -539125200L);
        setLongElement(term15588, 12, -531352800L);
        setLongElement(term15588, 13, -191365200L);
        setLongElement(term15588, 14, -184197600L);
        setLongElement(term15588, 15, -155163600L);
        setLongElement(term15588, 16, -150069600L);
        setLongElement(term15588, 17, -128898000L);
        setLongElement(term15588, 18, -121125600L);
        setLongElement(term15588, 19, -99954000L);
        setLongElement(term15588, 20, -89589600L);
        setLongElement(term15588, 21, -68418000L);
        setLongElement(term15588, 22, -57967200L);
        setLongElement(term15588, 23, 499748400L);
        setLongElement(term15588, 24, 511236000L);
        setLongElement(term15588, 25, 530593200L);
        setLongElement(term15588, 26, 540266400L);
        setLongElement(term15588, 27, 562129200L);
        setLongElement(term15588, 28, 571197600L);
        setLongElement(term15588, 29, 592974000L);
        setLongElement(term15588, 30, 602042400L);
        setLongElement(term15588, 31, 624423600L);
        setLongElement(term15588, 32, 634701600L);
        setLongElement(term15588, 33, 938919600L);
        setLongElement(term15588, 34, 951616800L);
        setLongElement(term15588, 35, 970974000L);
        setLongElement(term15588, 36, 971575200L);
        setLongElement(term15588, 37, 1003028400L);
        setLongElement(term15588, 38, 1013911200L);
        setField(term15584, term15584.getClass(), "savingsInstantTransitions", term15588);
        setField(term15584, term15584.getClass(), "savingsLocalTransitions", term15628);
        setElement(term15629, 1, term15557);
        setElement(term15629, 3, term15557);
        setElement(term15629, 5, term15557);
        setElement(term15629, 7, term15557);
        setElement(term15629, 9, term15557);
        setElement(term15629, 11, term15557);
        setElement(term15629, 13, term15557);
        setElement(term15629, 15, term15557);
        setElement(term15629, 17, term15557);
        setElement(term15629, 19, term15557);
        setElement(term15629, 21, term15557);
        setElement(term15629, 23, term15557);
        setElement(term15629, 25, term15557);
        setElement(term15629, 27, term15557);
        setElement(term15629, 29, term15557);
        setElement(term15629, 31, term15557);
        setElement(term15629, 33, term15557);
        setElement(term15629, 35, term15557);
        setElement(term15629, 37, term15557);
        setElement(term15629, 39, term15557);
        setField(term15584, term15584.getClass(), "wallOffsets", term15629);
        setField(term15584, term15584.getClass(), "lastRules", term15630);
        setField(term15631, term15631.getClass(), "table", null);
        setField(term15631, term15631.getClass(), "nextTable", null);
        setLongField(term15631, term15631.getClass(), "baseCount", 0L);
        setIntField(term15631, term15631.getClass(), "sizeCtl", 0);
        setIntField(term15631, term15631.getClass(), "transferIndex", 0);
        setIntField(term15631, term15631.getClass(), "cellsBusy", 0);
        setField(term15631, term15631.getClass(), "counterCells", null);
        setField(term15631, term15631.getClass(), "keySet", null);
        setField(term15631, term15631.getClass(), "values", null);
        setField(term15631, term15631.getClass(), "entrySet", null);
        setField(term15631, term15631.getClass(), "keySet", null);
        setField(term15631, term15631.getClass(), "values", null);
        setField(term15584, term15584.getClass(), "lastRulesCache", term15631);
        setField(term15567, term15567.getClass(), "rules", term15584);
        setField(term15546, term15546.getClass(), "zone", term15567);
        setField(term15375, term15375.getClass(), "time_stamp", term15546);
        setField(term15375, term15375.getClass(), "start_up_mode", "wwAwLLcLPp");
        setField(term15375, term15375.getClass(), "cmm_dly_mod", "nHpMKOmlpQ");
        setField(term15375, term15375.getClass(), "cmm_dly_sec", "fKhrQsJToZ");
        setField(term15375, term15375.getClass(), "cmm_err_mod", "wsysQLGFnl");
        setField(term15375, term15375.getClass(), "country_code", "ckQLZGFjMX");
        setField(term15375, term15375.getClass(), "region_code", "qphdrqUtNx");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.user.PreStartRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "bwlLFAfNWx";
        callMethod(klass, "setIdm", argTypes, term15375, args);
    }

};


