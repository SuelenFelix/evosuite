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
import java.lang.Integer;

public class ChangePasswdRequest_setPdid_6693977149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4601;
     Object term4887;

    public ChangePasswdRequest_setPdid_6693977149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4601 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.ChangePasswdRequest"));
        Object term4725 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term4726 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4727 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4731 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4736 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term4746 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term4763 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term4764 = (long[]) newLongArray(1);
        Object[] term4766 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term4767 = (long[]) newLongArray(39);
        Object[] term4807 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term4808 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term4809 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term4810 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term4601, term4601.getClass(), "a_code", "UfQtPRyWRC");
        setIntField(term4601, term4601.getClass(), "aime_id", -1275173084);
        setField(term4601, term4601.getClass(), "aime_a_code", "FPvxVzzSvD");
        setIntField(term4601, term4601.getClass(), "pd_id", -244121226);
        setIntField(term4601, term4601.getClass(), "accept_idx", -203030934);
        setField(term4601, term4601.getClass(), "new_passwd", "WHcwFgsGFC");
        setField(term4601, term4601.getClass(), "cmd", "HzqpegHiRq");
        setField(term4601, term4601.getClass(), "req_id", "jwsfVjMoJT");
        setField(term4601, term4601.getClass(), "game_id", "ZfdXfCCFDf");
        setField(term4601, term4601.getClass(), "r_ver", "MwwjNtdOFT");
        setField(term4601, term4601.getClass(), "kc_serial", "VYkqXKVlAJ");
        setField(term4601, term4601.getClass(), "b_serial", "XkIoWJRNwN");
        setField(term4601, term4601.getClass(), "place_id", "aNWLJdrZMq");
        setIntField(term4727, term4727.getClass(), "year", 2022);
        setShortField(term4727, term4727.getClass(), "month", (short) 11);
        setShortField(term4727, term4727.getClass(), "day", (short) 16);
        setField(term4726, term4726.getClass(), "date", term4727);
        setByteField(term4731, term4731.getClass(), "hour", (byte) 15);
        setByteField(term4731, term4731.getClass(), "minute", (byte) 54);
        setByteField(term4731, term4731.getClass(), "second", (byte) 2);
        setIntField(term4731, term4731.getClass(), "nano", 733274103);
        setField(term4726, term4726.getClass(), "time", term4731);
        setField(term4725, term4725.getClass(), "dateTime", term4726);
        setIntField(term4736, term4736.getClass(), "totalSeconds", -10800);
        setField(term4736, term4736.getClass(), "id", "-03:00");
        setField(term4725, term4725.getClass(), "offset", term4736);
        setField(term4746, term4746.getClass(), "id", "America/Recife");
        setLongElement(term4764, 0, -1767217224L);
        setField(term4763, term4763.getClass(), "standardTransitions", term4764);
        setElement(term4766, 1, term4736);
        setField(term4763, term4763.getClass(), "standardOffsets", term4766);
        setLongElement(term4767, 0, -1767217224L);
        setLongElement(term4767, 1, -1206957600L);
        setLongElement(term4767, 2, -1191362400L);
        setLongElement(term4767, 3, -1175374800L);
        setLongElement(term4767, 4, -1159826400L);
        setLongElement(term4767, 5, -633819600L);
        setLongElement(term4767, 6, -622069200L);
        setLongElement(term4767, 7, -602283600L);
        setLongElement(term4767, 8, -591832800L);
        setLongElement(term4767, 9, -570747600L);
        setLongElement(term4767, 10, -560210400L);
        setLongElement(term4767, 11, -539125200L);
        setLongElement(term4767, 12, -531352800L);
        setLongElement(term4767, 13, -191365200L);
        setLongElement(term4767, 14, -184197600L);
        setLongElement(term4767, 15, -155163600L);
        setLongElement(term4767, 16, -150069600L);
        setLongElement(term4767, 17, -128898000L);
        setLongElement(term4767, 18, -121125600L);
        setLongElement(term4767, 19, -99954000L);
        setLongElement(term4767, 20, -89589600L);
        setLongElement(term4767, 21, -68418000L);
        setLongElement(term4767, 22, -57967200L);
        setLongElement(term4767, 23, 499748400L);
        setLongElement(term4767, 24, 511236000L);
        setLongElement(term4767, 25, 530593200L);
        setLongElement(term4767, 26, 540266400L);
        setLongElement(term4767, 27, 562129200L);
        setLongElement(term4767, 28, 571197600L);
        setLongElement(term4767, 29, 592974000L);
        setLongElement(term4767, 30, 602042400L);
        setLongElement(term4767, 31, 624423600L);
        setLongElement(term4767, 32, 634701600L);
        setLongElement(term4767, 33, 938919600L);
        setLongElement(term4767, 34, 951616800L);
        setLongElement(term4767, 35, 970974000L);
        setLongElement(term4767, 36, 971575200L);
        setLongElement(term4767, 37, 1003028400L);
        setLongElement(term4767, 38, 1013911200L);
        setField(term4763, term4763.getClass(), "savingsInstantTransitions", term4767);
        setField(term4763, term4763.getClass(), "savingsLocalTransitions", term4807);
        setElement(term4808, 1, term4736);
        setElement(term4808, 3, term4736);
        setElement(term4808, 5, term4736);
        setElement(term4808, 7, term4736);
        setElement(term4808, 9, term4736);
        setElement(term4808, 11, term4736);
        setElement(term4808, 13, term4736);
        setElement(term4808, 15, term4736);
        setElement(term4808, 17, term4736);
        setElement(term4808, 19, term4736);
        setElement(term4808, 21, term4736);
        setElement(term4808, 23, term4736);
        setElement(term4808, 25, term4736);
        setElement(term4808, 27, term4736);
        setElement(term4808, 29, term4736);
        setElement(term4808, 31, term4736);
        setElement(term4808, 33, term4736);
        setElement(term4808, 35, term4736);
        setElement(term4808, 37, term4736);
        setElement(term4808, 39, term4736);
        setField(term4763, term4763.getClass(), "wallOffsets", term4808);
        setField(term4763, term4763.getClass(), "lastRules", term4809);
        setField(term4810, term4810.getClass(), "table", null);
        setField(term4810, term4810.getClass(), "nextTable", null);
        setLongField(term4810, term4810.getClass(), "baseCount", 0L);
        setIntField(term4810, term4810.getClass(), "sizeCtl", 0);
        setIntField(term4810, term4810.getClass(), "transferIndex", 0);
        setIntField(term4810, term4810.getClass(), "cellsBusy", 0);
        setField(term4810, term4810.getClass(), "counterCells", null);
        setField(term4810, term4810.getClass(), "keySet", null);
        setField(term4810, term4810.getClass(), "values", null);
        setField(term4810, term4810.getClass(), "entrySet", null);
        setField(term4810, term4810.getClass(), "keySet", null);
        setField(term4810, term4810.getClass(), "values", null);
        setField(term4763, term4763.getClass(), "lastRulesCache", term4810);
        setField(term4746, term4746.getClass(), "rules", term4763);
        setField(term4725, term4725.getClass(), "zone", term4746);
        setField(term4601, term4601.getClass(), "time_stamp", term4725);
        setField(term4601, term4601.getClass(), "start_up_mode", "HHmNoYxIGj");
        setField(term4601, term4601.getClass(), "cmm_dly_mod", "PtirvZmsGt");
        setField(term4601, term4601.getClass(), "cmm_dly_sec", "HWkpTmtlrc");
        setField(term4601, term4601.getClass(), "cmm_err_mod", "hMmaoREuCK");
        setField(term4601, term4601.getClass(), "country_code", "VeDtgDzGAN");
        setField(term4601, term4601.getClass(), "region_code", "aWYOWZFyaX");
        term4887 = new Integer(-1179120542);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.ChangePasswdRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4887;
        callMethod(klass, "setPd_id", argTypes, term4601, args);
    }

};


