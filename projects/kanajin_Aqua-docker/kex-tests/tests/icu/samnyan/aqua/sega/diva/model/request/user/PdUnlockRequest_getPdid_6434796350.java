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

public class PdUnlockRequest_getPdid_6434796350 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5855;

    public PdUnlockRequest_getPdid_6434796350() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5855 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.user.PdUnlockRequest"));
        Object term5942 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term5943 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5944 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5948 = newInstance(Class.forName("java.time.LocalTime"));
        Object term5953 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term5963 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term5980 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term5981 = (long[]) newLongArray(1);
        Object[] term5983 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term5984 = (long[]) newLongArray(39);
        Object[] term6024 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term6025 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term6026 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term6027 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setIntField(term5855, term5855.getClass(), "pd_id", 515182546);
        setIntField(term5855, term5855.getClass(), "accept_idx", -936895502);
        setField(term5855, term5855.getClass(), "cmd", "HHmNoYxIGj");
        setField(term5855, term5855.getClass(), "req_id", "PtirvZmsGt");
        setField(term5855, term5855.getClass(), "game_id", "HWkpTmtlrc");
        setField(term5855, term5855.getClass(), "r_ver", "hMmaoREuCK");
        setField(term5855, term5855.getClass(), "kc_serial", "VeDtgDzGAN");
        setField(term5855, term5855.getClass(), "b_serial", "aWYOWZFyaX");
        setField(term5855, term5855.getClass(), "place_id", "BRIVNtfUWU");
        setIntField(term5944, term5944.getClass(), "year", 2012);
        setShortField(term5944, term5944.getClass(), "month", (short) 9);
        setShortField(term5944, term5944.getClass(), "day", (short) 11);
        setField(term5943, term5943.getClass(), "date", term5944);
        setByteField(term5948, term5948.getClass(), "hour", (byte) 22);
        setByteField(term5948, term5948.getClass(), "minute", (byte) 10);
        setByteField(term5948, term5948.getClass(), "second", (byte) 8);
        setIntField(term5948, term5948.getClass(), "nano", 380008862);
        setField(term5943, term5943.getClass(), "time", term5948);
        setField(term5942, term5942.getClass(), "dateTime", term5943);
        setIntField(term5953, term5953.getClass(), "totalSeconds", -10800);
        setField(term5953, term5953.getClass(), "id", "-03:00");
        setField(term5942, term5942.getClass(), "offset", term5953);
        setField(term5963, term5963.getClass(), "id", "America/Recife");
        setLongElement(term5981, 0, -1767217224L);
        setField(term5980, term5980.getClass(), "standardTransitions", term5981);
        setElement(term5983, 1, term5953);
        setField(term5980, term5980.getClass(), "standardOffsets", term5983);
        setLongElement(term5984, 0, -1767217224L);
        setLongElement(term5984, 1, -1206957600L);
        setLongElement(term5984, 2, -1191362400L);
        setLongElement(term5984, 3, -1175374800L);
        setLongElement(term5984, 4, -1159826400L);
        setLongElement(term5984, 5, -633819600L);
        setLongElement(term5984, 6, -622069200L);
        setLongElement(term5984, 7, -602283600L);
        setLongElement(term5984, 8, -591832800L);
        setLongElement(term5984, 9, -570747600L);
        setLongElement(term5984, 10, -560210400L);
        setLongElement(term5984, 11, -539125200L);
        setLongElement(term5984, 12, -531352800L);
        setLongElement(term5984, 13, -191365200L);
        setLongElement(term5984, 14, -184197600L);
        setLongElement(term5984, 15, -155163600L);
        setLongElement(term5984, 16, -150069600L);
        setLongElement(term5984, 17, -128898000L);
        setLongElement(term5984, 18, -121125600L);
        setLongElement(term5984, 19, -99954000L);
        setLongElement(term5984, 20, -89589600L);
        setLongElement(term5984, 21, -68418000L);
        setLongElement(term5984, 22, -57967200L);
        setLongElement(term5984, 23, 499748400L);
        setLongElement(term5984, 24, 511236000L);
        setLongElement(term5984, 25, 530593200L);
        setLongElement(term5984, 26, 540266400L);
        setLongElement(term5984, 27, 562129200L);
        setLongElement(term5984, 28, 571197600L);
        setLongElement(term5984, 29, 592974000L);
        setLongElement(term5984, 30, 602042400L);
        setLongElement(term5984, 31, 624423600L);
        setLongElement(term5984, 32, 634701600L);
        setLongElement(term5984, 33, 938919600L);
        setLongElement(term5984, 34, 951616800L);
        setLongElement(term5984, 35, 970974000L);
        setLongElement(term5984, 36, 971575200L);
        setLongElement(term5984, 37, 1003028400L);
        setLongElement(term5984, 38, 1013911200L);
        setField(term5980, term5980.getClass(), "savingsInstantTransitions", term5984);
        setField(term5980, term5980.getClass(), "savingsLocalTransitions", term6024);
        setElement(term6025, 1, term5953);
        setElement(term6025, 3, term5953);
        setElement(term6025, 5, term5953);
        setElement(term6025, 7, term5953);
        setElement(term6025, 9, term5953);
        setElement(term6025, 11, term5953);
        setElement(term6025, 13, term5953);
        setElement(term6025, 15, term5953);
        setElement(term6025, 17, term5953);
        setElement(term6025, 19, term5953);
        setElement(term6025, 21, term5953);
        setElement(term6025, 23, term5953);
        setElement(term6025, 25, term5953);
        setElement(term6025, 27, term5953);
        setElement(term6025, 29, term5953);
        setElement(term6025, 31, term5953);
        setElement(term6025, 33, term5953);
        setElement(term6025, 35, term5953);
        setElement(term6025, 37, term5953);
        setElement(term6025, 39, term5953);
        setField(term5980, term5980.getClass(), "wallOffsets", term6025);
        setField(term5980, term5980.getClass(), "lastRules", term6026);
        setField(term6027, term6027.getClass(), "table", null);
        setField(term6027, term6027.getClass(), "nextTable", null);
        setLongField(term6027, term6027.getClass(), "baseCount", 0L);
        setIntField(term6027, term6027.getClass(), "sizeCtl", 0);
        setIntField(term6027, term6027.getClass(), "transferIndex", 0);
        setIntField(term6027, term6027.getClass(), "cellsBusy", 0);
        setField(term6027, term6027.getClass(), "counterCells", null);
        setField(term6027, term6027.getClass(), "keySet", null);
        setField(term6027, term6027.getClass(), "values", null);
        setField(term6027, term6027.getClass(), "entrySet", null);
        setField(term6027, term6027.getClass(), "keySet", null);
        setField(term6027, term6027.getClass(), "values", null);
        setField(term5980, term5980.getClass(), "lastRulesCache", term6027);
        setField(term5963, term5963.getClass(), "rules", term5980);
        setField(term5942, term5942.getClass(), "zone", term5963);
        setField(term5855, term5855.getClass(), "time_stamp", term5942);
        setField(term5855, term5855.getClass(), "start_up_mode", "DbiCVtPPCT");
        setField(term5855, term5855.getClass(), "cmm_dly_mod", "WzFopsaDuG");
        setField(term5855, term5855.getClass(), "cmm_dly_sec", "PapWxkhEWe");
        setField(term5855, term5855.getClass(), "cmm_err_mod", "smnHEqRFRx");
        setField(term5855, term5855.getClass(), "country_code", "XYtryyobou");
        setField(term5855, term5855.getClass(), "region_code", "OYbzXylRWW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.user.PdUnlockRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPd_id", argTypes, term5855, args);
    }

};


