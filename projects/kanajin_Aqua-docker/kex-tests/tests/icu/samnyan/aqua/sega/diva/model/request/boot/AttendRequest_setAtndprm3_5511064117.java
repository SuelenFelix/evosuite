package icu.samnyan.aqua.sega.diva.model.request.boot;

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
import static icu.samnyan.aqua.sega.diva.model.request.boot.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class AttendRequest_setAtndprm3_5511064117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3742;

    public AttendRequest_setAtndprm3_5511064117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3742 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.boot.AttendRequest"));
        Object term3875 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term3876 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3877 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3881 = newInstance(Class.forName("java.time.LocalTime"));
        Object term3886 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term3896 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term3913 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term3914 = (long[]) newLongArray(1);
        Object[] term3916 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term3917 = (long[]) newLongArray(39);
        Object[] term3957 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term3958 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term3959 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term3960 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term3742, term3742.getClass(), "atnd_lut", "WzMEhMXkKx");
        setField(term3742, term3742.getClass(), "atnd_prm1", "XOiDvlDhdc");
        setField(term3742, term3742.getClass(), "atnd_prm2", "AdxvLJhNLe");
        setField(term3742, term3742.getClass(), "atnd_prm3", "lHfTrWKMPk");
        setField(term3742, term3742.getClass(), "cmd", "JDaAnsVTGV");
        setField(term3742, term3742.getClass(), "req_id", "mLUZFTfjle");
        setField(term3742, term3742.getClass(), "game_id", "xIeFjkHkOe");
        setField(term3742, term3742.getClass(), "r_ver", "SdCKLMIYnX");
        setField(term3742, term3742.getClass(), "kc_serial", "OJJtVNPyKZ");
        setField(term3742, term3742.getClass(), "b_serial", "AKNapTAfmD");
        setField(term3742, term3742.getClass(), "place_id", "xJgPlLxpgC");
        setIntField(term3877, term3877.getClass(), "year", 2024);
        setShortField(term3877, term3877.getClass(), "month", (short) 1);
        setShortField(term3877, term3877.getClass(), "day", (short) 24);
        setField(term3876, term3876.getClass(), "date", term3877);
        setByteField(term3881, term3881.getClass(), "hour", (byte) 20);
        setByteField(term3881, term3881.getClass(), "minute", (byte) 28);
        setByteField(term3881, term3881.getClass(), "second", (byte) 39);
        setIntField(term3881, term3881.getClass(), "nano", 952728177);
        setField(term3876, term3876.getClass(), "time", term3881);
        setField(term3875, term3875.getClass(), "dateTime", term3876);
        setIntField(term3886, term3886.getClass(), "totalSeconds", -10800);
        setField(term3886, term3886.getClass(), "id", "-03:00");
        setField(term3875, term3875.getClass(), "offset", term3886);
        setField(term3896, term3896.getClass(), "id", "America/Recife");
        setLongElement(term3914, 0, -1767217224L);
        setField(term3913, term3913.getClass(), "standardTransitions", term3914);
        setElement(term3916, 1, term3886);
        setField(term3913, term3913.getClass(), "standardOffsets", term3916);
        setLongElement(term3917, 0, -1767217224L);
        setLongElement(term3917, 1, -1206957600L);
        setLongElement(term3917, 2, -1191362400L);
        setLongElement(term3917, 3, -1175374800L);
        setLongElement(term3917, 4, -1159826400L);
        setLongElement(term3917, 5, -633819600L);
        setLongElement(term3917, 6, -622069200L);
        setLongElement(term3917, 7, -602283600L);
        setLongElement(term3917, 8, -591832800L);
        setLongElement(term3917, 9, -570747600L);
        setLongElement(term3917, 10, -560210400L);
        setLongElement(term3917, 11, -539125200L);
        setLongElement(term3917, 12, -531352800L);
        setLongElement(term3917, 13, -191365200L);
        setLongElement(term3917, 14, -184197600L);
        setLongElement(term3917, 15, -155163600L);
        setLongElement(term3917, 16, -150069600L);
        setLongElement(term3917, 17, -128898000L);
        setLongElement(term3917, 18, -121125600L);
        setLongElement(term3917, 19, -99954000L);
        setLongElement(term3917, 20, -89589600L);
        setLongElement(term3917, 21, -68418000L);
        setLongElement(term3917, 22, -57967200L);
        setLongElement(term3917, 23, 499748400L);
        setLongElement(term3917, 24, 511236000L);
        setLongElement(term3917, 25, 530593200L);
        setLongElement(term3917, 26, 540266400L);
        setLongElement(term3917, 27, 562129200L);
        setLongElement(term3917, 28, 571197600L);
        setLongElement(term3917, 29, 592974000L);
        setLongElement(term3917, 30, 602042400L);
        setLongElement(term3917, 31, 624423600L);
        setLongElement(term3917, 32, 634701600L);
        setLongElement(term3917, 33, 938919600L);
        setLongElement(term3917, 34, 951616800L);
        setLongElement(term3917, 35, 970974000L);
        setLongElement(term3917, 36, 971575200L);
        setLongElement(term3917, 37, 1003028400L);
        setLongElement(term3917, 38, 1013911200L);
        setField(term3913, term3913.getClass(), "savingsInstantTransitions", term3917);
        setField(term3913, term3913.getClass(), "savingsLocalTransitions", term3957);
        setElement(term3958, 1, term3886);
        setElement(term3958, 3, term3886);
        setElement(term3958, 5, term3886);
        setElement(term3958, 7, term3886);
        setElement(term3958, 9, term3886);
        setElement(term3958, 11, term3886);
        setElement(term3958, 13, term3886);
        setElement(term3958, 15, term3886);
        setElement(term3958, 17, term3886);
        setElement(term3958, 19, term3886);
        setElement(term3958, 21, term3886);
        setElement(term3958, 23, term3886);
        setElement(term3958, 25, term3886);
        setElement(term3958, 27, term3886);
        setElement(term3958, 29, term3886);
        setElement(term3958, 31, term3886);
        setElement(term3958, 33, term3886);
        setElement(term3958, 35, term3886);
        setElement(term3958, 37, term3886);
        setElement(term3958, 39, term3886);
        setField(term3913, term3913.getClass(), "wallOffsets", term3958);
        setField(term3913, term3913.getClass(), "lastRules", term3959);
        setField(term3960, term3960.getClass(), "table", null);
        setField(term3960, term3960.getClass(), "nextTable", null);
        setLongField(term3960, term3960.getClass(), "baseCount", 0L);
        setIntField(term3960, term3960.getClass(), "sizeCtl", 0);
        setIntField(term3960, term3960.getClass(), "transferIndex", 0);
        setIntField(term3960, term3960.getClass(), "cellsBusy", 0);
        setField(term3960, term3960.getClass(), "counterCells", null);
        setField(term3960, term3960.getClass(), "keySet", null);
        setField(term3960, term3960.getClass(), "values", null);
        setField(term3960, term3960.getClass(), "entrySet", null);
        setField(term3960, term3960.getClass(), "keySet", null);
        setField(term3960, term3960.getClass(), "values", null);
        setField(term3913, term3913.getClass(), "lastRulesCache", term3960);
        setField(term3896, term3896.getClass(), "rules", term3913);
        setField(term3875, term3875.getClass(), "zone", term3896);
        setField(term3742, term3742.getClass(), "time_stamp", term3875);
        setField(term3742, term3742.getClass(), "start_up_mode", "EYtfuJaxiM");
        setField(term3742, term3742.getClass(), "cmm_dly_mod", "gCWtLVKVVe");
        setField(term3742, term3742.getClass(), "cmm_dly_sec", "fWKJoSoCwE");
        setField(term3742, term3742.getClass(), "cmm_err_mod", "wfaXBpWAUH");
        setField(term3742, term3742.getClass(), "country_code", "VMeAzAHwZj");
        setField(term3742, term3742.getClass(), "region_code", "PznxWXsZME");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.boot.AttendRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ZzIujlwVsw";
        callMethod(klass, "setAtnd_prm3", argTypes, term3742, args);
    }

};


