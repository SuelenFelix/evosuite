package icu.samnyan.aqua.sega.diva.model.request;

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
import static icu.samnyan.aqua.sega.diva.model.request.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class BaseRequest_setRegioncode_106080785727 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term260425;

    public BaseRequest_setRegioncode_106080785727() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term260425 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.BaseRequest"));
        Object term260510 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term260511 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term260512 = newInstance(Class.forName("java.time.LocalDate"));
        Object term260516 = newInstance(Class.forName("java.time.LocalTime"));
        Object term260521 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term260531 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term260548 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term260549 = (long[]) newLongArray(1);
        Object[] term260551 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term260552 = (long[]) newLongArray(39);
        Object[] term260592 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term260593 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term260594 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term260595 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term260425, term260425.getClass(), "cmd", "GZSnqwBCPQ");
        setField(term260425, term260425.getClass(), "req_id", "zxdSWLKWYw");
        setField(term260425, term260425.getClass(), "game_id", "VurQtsudbR");
        setField(term260425, term260425.getClass(), "r_ver", "KdIGyBXZVB");
        setField(term260425, term260425.getClass(), "kc_serial", "eKvGCdbyoP");
        setField(term260425, term260425.getClass(), "b_serial", "MgMUmPLywB");
        setField(term260425, term260425.getClass(), "place_id", "pNJhowQpXJ");
        setIntField(term260512, term260512.getClass(), "year", 2012);
        setShortField(term260512, term260512.getClass(), "month", (short) 2);
        setShortField(term260512, term260512.getClass(), "day", (short) 18);
        setField(term260511, term260511.getClass(), "date", term260512);
        setByteField(term260516, term260516.getClass(), "hour", (byte) 4);
        setByteField(term260516, term260516.getClass(), "minute", (byte) 27);
        setByteField(term260516, term260516.getClass(), "second", (byte) 19);
        setIntField(term260516, term260516.getClass(), "nano", 948215601);
        setField(term260511, term260511.getClass(), "time", term260516);
        setField(term260510, term260510.getClass(), "dateTime", term260511);
        setIntField(term260521, term260521.getClass(), "totalSeconds", -10800);
        setField(term260521, term260521.getClass(), "id", "-03:00");
        setField(term260510, term260510.getClass(), "offset", term260521);
        setField(term260531, term260531.getClass(), "id", "America/Recife");
        setLongElement(term260549, 0, -1767217224L);
        setField(term260548, term260548.getClass(), "standardTransitions", term260549);
        setElement(term260551, 1, term260521);
        setField(term260548, term260548.getClass(), "standardOffsets", term260551);
        setLongElement(term260552, 0, -1767217224L);
        setLongElement(term260552, 1, -1206957600L);
        setLongElement(term260552, 2, -1191362400L);
        setLongElement(term260552, 3, -1175374800L);
        setLongElement(term260552, 4, -1159826400L);
        setLongElement(term260552, 5, -633819600L);
        setLongElement(term260552, 6, -622069200L);
        setLongElement(term260552, 7, -602283600L);
        setLongElement(term260552, 8, -591832800L);
        setLongElement(term260552, 9, -570747600L);
        setLongElement(term260552, 10, -560210400L);
        setLongElement(term260552, 11, -539125200L);
        setLongElement(term260552, 12, -531352800L);
        setLongElement(term260552, 13, -191365200L);
        setLongElement(term260552, 14, -184197600L);
        setLongElement(term260552, 15, -155163600L);
        setLongElement(term260552, 16, -150069600L);
        setLongElement(term260552, 17, -128898000L);
        setLongElement(term260552, 18, -121125600L);
        setLongElement(term260552, 19, -99954000L);
        setLongElement(term260552, 20, -89589600L);
        setLongElement(term260552, 21, -68418000L);
        setLongElement(term260552, 22, -57967200L);
        setLongElement(term260552, 23, 499748400L);
        setLongElement(term260552, 24, 511236000L);
        setLongElement(term260552, 25, 530593200L);
        setLongElement(term260552, 26, 540266400L);
        setLongElement(term260552, 27, 562129200L);
        setLongElement(term260552, 28, 571197600L);
        setLongElement(term260552, 29, 592974000L);
        setLongElement(term260552, 30, 602042400L);
        setLongElement(term260552, 31, 624423600L);
        setLongElement(term260552, 32, 634701600L);
        setLongElement(term260552, 33, 938919600L);
        setLongElement(term260552, 34, 951616800L);
        setLongElement(term260552, 35, 970974000L);
        setLongElement(term260552, 36, 971575200L);
        setLongElement(term260552, 37, 1003028400L);
        setLongElement(term260552, 38, 1013911200L);
        setField(term260548, term260548.getClass(), "savingsInstantTransitions", term260552);
        setField(term260548, term260548.getClass(), "savingsLocalTransitions", term260592);
        setElement(term260593, 1, term260521);
        setElement(term260593, 3, term260521);
        setElement(term260593, 5, term260521);
        setElement(term260593, 7, term260521);
        setElement(term260593, 9, term260521);
        setElement(term260593, 11, term260521);
        setElement(term260593, 13, term260521);
        setElement(term260593, 15, term260521);
        setElement(term260593, 17, term260521);
        setElement(term260593, 19, term260521);
        setElement(term260593, 21, term260521);
        setElement(term260593, 23, term260521);
        setElement(term260593, 25, term260521);
        setElement(term260593, 27, term260521);
        setElement(term260593, 29, term260521);
        setElement(term260593, 31, term260521);
        setElement(term260593, 33, term260521);
        setElement(term260593, 35, term260521);
        setElement(term260593, 37, term260521);
        setElement(term260593, 39, term260521);
        setField(term260548, term260548.getClass(), "wallOffsets", term260593);
        setField(term260548, term260548.getClass(), "lastRules", term260594);
        setField(term260595, term260595.getClass(), "table", null);
        setField(term260595, term260595.getClass(), "nextTable", null);
        setLongField(term260595, term260595.getClass(), "baseCount", 0L);
        setIntField(term260595, term260595.getClass(), "sizeCtl", 0);
        setIntField(term260595, term260595.getClass(), "transferIndex", 0);
        setIntField(term260595, term260595.getClass(), "cellsBusy", 0);
        setField(term260595, term260595.getClass(), "counterCells", null);
        setField(term260595, term260595.getClass(), "keySet", null);
        setField(term260595, term260595.getClass(), "values", null);
        setField(term260595, term260595.getClass(), "entrySet", null);
        setField(term260595, term260595.getClass(), "keySet", null);
        setField(term260595, term260595.getClass(), "values", null);
        setField(term260548, term260548.getClass(), "lastRulesCache", term260595);
        setField(term260531, term260531.getClass(), "rules", term260548);
        setField(term260510, term260510.getClass(), "zone", term260531);
        setField(term260425, term260425.getClass(), "time_stamp", term260510);
        setField(term260425, term260425.getClass(), "start_up_mode", "gyfupqhzxo");
        setField(term260425, term260425.getClass(), "cmm_dly_mod", "WUwUHGneAq");
        setField(term260425, term260425.getClass(), "cmm_dly_sec", "zlVKedpZvy");
        setField(term260425, term260425.getClass(), "cmm_err_mod", "PEUAKKJLwI");
        setField(term260425, term260425.getClass(), "country_code", "cYvFrvYBOd");
        setField(term260425, term260425.getClass(), "region_code", "WfCGsRvHTg");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.BaseRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "jsThoorJsk";
        callMethod(klass, "setRegion_code", argTypes, term260425, args);
    }

};


