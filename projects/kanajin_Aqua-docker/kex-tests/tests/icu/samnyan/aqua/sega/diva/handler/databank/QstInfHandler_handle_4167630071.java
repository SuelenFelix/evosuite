package icu.samnyan.aqua.sega.diva.handler.databank;

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
import static icu.samnyan.aqua.sega.diva.handler.databank.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class QstInfHandler_handle_4167630071 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5716;
     Object term5717;

    public QstInfHandler_handle_4167630071() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5716 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.handler.databank.QstInfHandler"));
        setField(term5716, term5716.getClass(), "mapper", null);
        term5717 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.BaseRequest"));
        Object term5802 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term5803 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5804 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5808 = newInstance(Class.forName("java.time.LocalTime"));
        Object term5813 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term5823 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term5840 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term5841 = (long[]) newLongArray(1);
        Object[] term5843 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term5844 = (long[]) newLongArray(39);
        Object[] term5884 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term5885 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term5886 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term5887 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term5717, term5717.getClass(), "cmd", "DSNsTGYXDF");
        setField(term5717, term5717.getClass(), "req_id", "sQvGcVjdEx");
        setField(term5717, term5717.getClass(), "game_id", "rLHAoqXgPh");
        setField(term5717, term5717.getClass(), "r_ver", "zUlRdimJtU");
        setField(term5717, term5717.getClass(), "kc_serial", "vwbEQQNQrx");
        setField(term5717, term5717.getClass(), "b_serial", "xtftXXMbem");
        setField(term5717, term5717.getClass(), "place_id", "cudZvLMQon");
        setIntField(term5804, term5804.getClass(), "year", 2021);
        setShortField(term5804, term5804.getClass(), "month", (short) 9);
        setShortField(term5804, term5804.getClass(), "day", (short) 7);
        setField(term5803, term5803.getClass(), "date", term5804);
        setByteField(term5808, term5808.getClass(), "hour", (byte) 5);
        setByteField(term5808, term5808.getClass(), "minute", (byte) 25);
        setByteField(term5808, term5808.getClass(), "second", (byte) 7);
        setIntField(term5808, term5808.getClass(), "nano", 755924076);
        setField(term5803, term5803.getClass(), "time", term5808);
        setField(term5802, term5802.getClass(), "dateTime", term5803);
        setIntField(term5813, term5813.getClass(), "totalSeconds", -10800);
        setField(term5813, term5813.getClass(), "id", "-03:00");
        setField(term5802, term5802.getClass(), "offset", term5813);
        setField(term5823, term5823.getClass(), "id", "America/Recife");
        setLongElement(term5841, 0, -1767217224L);
        setField(term5840, term5840.getClass(), "standardTransitions", term5841);
        setElement(term5843, 1, term5813);
        setField(term5840, term5840.getClass(), "standardOffsets", term5843);
        setLongElement(term5844, 0, -1767217224L);
        setLongElement(term5844, 1, -1206957600L);
        setLongElement(term5844, 2, -1191362400L);
        setLongElement(term5844, 3, -1175374800L);
        setLongElement(term5844, 4, -1159826400L);
        setLongElement(term5844, 5, -633819600L);
        setLongElement(term5844, 6, -622069200L);
        setLongElement(term5844, 7, -602283600L);
        setLongElement(term5844, 8, -591832800L);
        setLongElement(term5844, 9, -570747600L);
        setLongElement(term5844, 10, -560210400L);
        setLongElement(term5844, 11, -539125200L);
        setLongElement(term5844, 12, -531352800L);
        setLongElement(term5844, 13, -191365200L);
        setLongElement(term5844, 14, -184197600L);
        setLongElement(term5844, 15, -155163600L);
        setLongElement(term5844, 16, -150069600L);
        setLongElement(term5844, 17, -128898000L);
        setLongElement(term5844, 18, -121125600L);
        setLongElement(term5844, 19, -99954000L);
        setLongElement(term5844, 20, -89589600L);
        setLongElement(term5844, 21, -68418000L);
        setLongElement(term5844, 22, -57967200L);
        setLongElement(term5844, 23, 499748400L);
        setLongElement(term5844, 24, 511236000L);
        setLongElement(term5844, 25, 530593200L);
        setLongElement(term5844, 26, 540266400L);
        setLongElement(term5844, 27, 562129200L);
        setLongElement(term5844, 28, 571197600L);
        setLongElement(term5844, 29, 592974000L);
        setLongElement(term5844, 30, 602042400L);
        setLongElement(term5844, 31, 624423600L);
        setLongElement(term5844, 32, 634701600L);
        setLongElement(term5844, 33, 938919600L);
        setLongElement(term5844, 34, 951616800L);
        setLongElement(term5844, 35, 970974000L);
        setLongElement(term5844, 36, 971575200L);
        setLongElement(term5844, 37, 1003028400L);
        setLongElement(term5844, 38, 1013911200L);
        setField(term5840, term5840.getClass(), "savingsInstantTransitions", term5844);
        setField(term5840, term5840.getClass(), "savingsLocalTransitions", term5884);
        setElement(term5885, 1, term5813);
        setElement(term5885, 3, term5813);
        setElement(term5885, 5, term5813);
        setElement(term5885, 7, term5813);
        setElement(term5885, 9, term5813);
        setElement(term5885, 11, term5813);
        setElement(term5885, 13, term5813);
        setElement(term5885, 15, term5813);
        setElement(term5885, 17, term5813);
        setElement(term5885, 19, term5813);
        setElement(term5885, 21, term5813);
        setElement(term5885, 23, term5813);
        setElement(term5885, 25, term5813);
        setElement(term5885, 27, term5813);
        setElement(term5885, 29, term5813);
        setElement(term5885, 31, term5813);
        setElement(term5885, 33, term5813);
        setElement(term5885, 35, term5813);
        setElement(term5885, 37, term5813);
        setElement(term5885, 39, term5813);
        setField(term5840, term5840.getClass(), "wallOffsets", term5885);
        setField(term5840, term5840.getClass(), "lastRules", term5886);
        setField(term5887, term5887.getClass(), "table", null);
        setField(term5887, term5887.getClass(), "nextTable", null);
        setLongField(term5887, term5887.getClass(), "baseCount", 0L);
        setIntField(term5887, term5887.getClass(), "sizeCtl", 0);
        setIntField(term5887, term5887.getClass(), "transferIndex", 0);
        setIntField(term5887, term5887.getClass(), "cellsBusy", 0);
        setField(term5887, term5887.getClass(), "counterCells", null);
        setField(term5887, term5887.getClass(), "keySet", null);
        setField(term5887, term5887.getClass(), "values", null);
        setField(term5887, term5887.getClass(), "entrySet", null);
        setField(term5887, term5887.getClass(), "keySet", null);
        setField(term5887, term5887.getClass(), "values", null);
        setField(term5840, term5840.getClass(), "lastRulesCache", term5887);
        setField(term5823, term5823.getClass(), "rules", term5840);
        setField(term5802, term5802.getClass(), "zone", term5823);
        setField(term5717, term5717.getClass(), "time_stamp", term5802);
        setField(term5717, term5717.getClass(), "start_up_mode", "lihXWlGDxk");
        setField(term5717, term5717.getClass(), "cmm_dly_mod", "JmcmxoGhIK");
        setField(term5717, term5717.getClass(), "cmm_dly_sec", "jXzmYyrnnT");
        setField(term5717, term5717.getClass(), "cmm_err_mod", "igCAtimmYB");
        setField(term5717, term5717.getClass(), "country_code", "DyiXbeYIaN");
        setField(term5717, term5717.getClass(), "region_code", "VGizxZnyHX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.handler.databank.QstInfHandler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.diva.model.request.BaseRequest");
        Object[] args = new Object[1];
        args[0] = term5717;
        callMethod(klass, "handle", argTypes, term5716, args);
    }

};


