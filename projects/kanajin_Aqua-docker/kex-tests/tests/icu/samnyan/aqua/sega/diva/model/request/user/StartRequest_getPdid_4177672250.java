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

public class StartRequest_getPdid_4177672250 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7639;

    public StartRequest_getPdid_4177672250() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7639 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.user.StartRequest"));
        Object term7726 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term7727 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7728 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7732 = newInstance(Class.forName("java.time.LocalTime"));
        Object term7737 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term7747 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term7764 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term7765 = (long[]) newLongArray(1);
        Object[] term7767 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term7768 = (long[]) newLongArray(39);
        Object[] term7808 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term7809 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term7810 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term7811 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setIntField(term7639, term7639.getClass(), "pd_id", 474518942);
        setIntField(term7639, term7639.getClass(), "accept_idx", -1656687479);
        setField(term7639, term7639.getClass(), "cmd", "RMsXuyzKJV");
        setField(term7639, term7639.getClass(), "req_id", "FwPbDZcHmB");
        setField(term7639, term7639.getClass(), "game_id", "hOncybyCAH");
        setField(term7639, term7639.getClass(), "r_ver", "QduALnDSVo");
        setField(term7639, term7639.getClass(), "kc_serial", "izPpKDErnQ");
        setField(term7639, term7639.getClass(), "b_serial", "NnpwZBUTvx");
        setField(term7639, term7639.getClass(), "place_id", "tlQSNgTkQX");
        setIntField(term7728, term7728.getClass(), "year", 2015);
        setShortField(term7728, term7728.getClass(), "month", (short) 9);
        setShortField(term7728, term7728.getClass(), "day", (short) 16);
        setField(term7727, term7727.getClass(), "date", term7728);
        setByteField(term7732, term7732.getClass(), "hour", (byte) 6);
        setByteField(term7732, term7732.getClass(), "minute", (byte) 19);
        setByteField(term7732, term7732.getClass(), "second", (byte) 42);
        setIntField(term7732, term7732.getClass(), "nano", 630084975);
        setField(term7727, term7727.getClass(), "time", term7732);
        setField(term7726, term7726.getClass(), "dateTime", term7727);
        setIntField(term7737, term7737.getClass(), "totalSeconds", -10800);
        setField(term7737, term7737.getClass(), "id", "-03:00");
        setField(term7726, term7726.getClass(), "offset", term7737);
        setField(term7747, term7747.getClass(), "id", "America/Recife");
        setLongElement(term7765, 0, -1767217224L);
        setField(term7764, term7764.getClass(), "standardTransitions", term7765);
        setElement(term7767, 1, term7737);
        setField(term7764, term7764.getClass(), "standardOffsets", term7767);
        setLongElement(term7768, 0, -1767217224L);
        setLongElement(term7768, 1, -1206957600L);
        setLongElement(term7768, 2, -1191362400L);
        setLongElement(term7768, 3, -1175374800L);
        setLongElement(term7768, 4, -1159826400L);
        setLongElement(term7768, 5, -633819600L);
        setLongElement(term7768, 6, -622069200L);
        setLongElement(term7768, 7, -602283600L);
        setLongElement(term7768, 8, -591832800L);
        setLongElement(term7768, 9, -570747600L);
        setLongElement(term7768, 10, -560210400L);
        setLongElement(term7768, 11, -539125200L);
        setLongElement(term7768, 12, -531352800L);
        setLongElement(term7768, 13, -191365200L);
        setLongElement(term7768, 14, -184197600L);
        setLongElement(term7768, 15, -155163600L);
        setLongElement(term7768, 16, -150069600L);
        setLongElement(term7768, 17, -128898000L);
        setLongElement(term7768, 18, -121125600L);
        setLongElement(term7768, 19, -99954000L);
        setLongElement(term7768, 20, -89589600L);
        setLongElement(term7768, 21, -68418000L);
        setLongElement(term7768, 22, -57967200L);
        setLongElement(term7768, 23, 499748400L);
        setLongElement(term7768, 24, 511236000L);
        setLongElement(term7768, 25, 530593200L);
        setLongElement(term7768, 26, 540266400L);
        setLongElement(term7768, 27, 562129200L);
        setLongElement(term7768, 28, 571197600L);
        setLongElement(term7768, 29, 592974000L);
        setLongElement(term7768, 30, 602042400L);
        setLongElement(term7768, 31, 624423600L);
        setLongElement(term7768, 32, 634701600L);
        setLongElement(term7768, 33, 938919600L);
        setLongElement(term7768, 34, 951616800L);
        setLongElement(term7768, 35, 970974000L);
        setLongElement(term7768, 36, 971575200L);
        setLongElement(term7768, 37, 1003028400L);
        setLongElement(term7768, 38, 1013911200L);
        setField(term7764, term7764.getClass(), "savingsInstantTransitions", term7768);
        setField(term7764, term7764.getClass(), "savingsLocalTransitions", term7808);
        setElement(term7809, 1, term7737);
        setElement(term7809, 3, term7737);
        setElement(term7809, 5, term7737);
        setElement(term7809, 7, term7737);
        setElement(term7809, 9, term7737);
        setElement(term7809, 11, term7737);
        setElement(term7809, 13, term7737);
        setElement(term7809, 15, term7737);
        setElement(term7809, 17, term7737);
        setElement(term7809, 19, term7737);
        setElement(term7809, 21, term7737);
        setElement(term7809, 23, term7737);
        setElement(term7809, 25, term7737);
        setElement(term7809, 27, term7737);
        setElement(term7809, 29, term7737);
        setElement(term7809, 31, term7737);
        setElement(term7809, 33, term7737);
        setElement(term7809, 35, term7737);
        setElement(term7809, 37, term7737);
        setElement(term7809, 39, term7737);
        setField(term7764, term7764.getClass(), "wallOffsets", term7809);
        setField(term7764, term7764.getClass(), "lastRules", term7810);
        setField(term7811, term7811.getClass(), "table", null);
        setField(term7811, term7811.getClass(), "nextTable", null);
        setLongField(term7811, term7811.getClass(), "baseCount", 0L);
        setIntField(term7811, term7811.getClass(), "sizeCtl", 0);
        setIntField(term7811, term7811.getClass(), "transferIndex", 0);
        setIntField(term7811, term7811.getClass(), "cellsBusy", 0);
        setField(term7811, term7811.getClass(), "counterCells", null);
        setField(term7811, term7811.getClass(), "keySet", null);
        setField(term7811, term7811.getClass(), "values", null);
        setField(term7811, term7811.getClass(), "entrySet", null);
        setField(term7811, term7811.getClass(), "keySet", null);
        setField(term7811, term7811.getClass(), "values", null);
        setField(term7764, term7764.getClass(), "lastRulesCache", term7811);
        setField(term7747, term7747.getClass(), "rules", term7764);
        setField(term7726, term7726.getClass(), "zone", term7747);
        setField(term7639, term7639.getClass(), "time_stamp", term7726);
        setField(term7639, term7639.getClass(), "start_up_mode", "PCipZnmBOF");
        setField(term7639, term7639.getClass(), "cmm_dly_mod", "zcorEihhLK");
        setField(term7639, term7639.getClass(), "cmm_dly_sec", "GrqozDKFOk");
        setField(term7639, term7639.getClass(), "cmm_err_mod", "CFyoseFGLF");
        setField(term7639, term7639.getClass(), "country_code", "SFqCrhEWLm");
        setField(term7639, term7639.getClass(), "region_code", "GZdcJyZntS");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.user.StartRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPd_id", argTypes, term7639, args);
    }

};


