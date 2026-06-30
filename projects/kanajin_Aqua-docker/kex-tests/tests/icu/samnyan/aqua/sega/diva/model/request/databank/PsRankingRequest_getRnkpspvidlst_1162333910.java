package icu.samnyan.aqua.sega.diva.model.request.databank;

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
import static icu.samnyan.aqua.sega.diva.model.request.databank.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class PsRankingRequest_getRnkpspvidlst_1162333910 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public PsRankingRequest_getRnkpspvidlst_1162333910() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.databank.PsRankingRequest"));
        int[] term2 = (int[]) newIntArray(5);
        Object term93 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term94 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term95 = newInstance(Class.forName("java.time.LocalDate"));
        Object term99 = newInstance(Class.forName("java.time.LocalTime"));
        Object term104 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term114 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term131 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term132 = (long[]) newLongArray(1);
        Object[] term134 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term135 = (long[]) newLongArray(39);
        Object[] term175 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term176 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term177 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term178 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setIntElement(term2, 0, 568599855);
        setIntElement(term2, 1, 1162663216);
        setIntElement(term2, 2, 1484323161);
        setIntElement(term2, 3, 391863371);
        setIntElement(term2, 4, -1922583790);
        setField(term1, term1.getClass(), "rnk_ps_pv_id_lst", term2);
        setIntField(term1, term1.getClass(), "rnk_ps_idx", -616727354);
        setField(term1, term1.getClass(), "cmd", "PAEBtnZtTD");
        setField(term1, term1.getClass(), "req_id", "sjlJAEtRrb");
        setField(term1, term1.getClass(), "game_id", "MuLcgQHgqz");
        setField(term1, term1.getClass(), "r_ver", "xxtlPwDYFs");
        setField(term1, term1.getClass(), "kc_serial", "jJCZpVmanW");
        setField(term1, term1.getClass(), "b_serial", "EGtDIRbSSb");
        setField(term1, term1.getClass(), "place_id", "SzjVpOQTyS");
        setIntField(term95, term95.getClass(), "year", 2012);
        setShortField(term95, term95.getClass(), "month", (short) 8);
        setShortField(term95, term95.getClass(), "day", (short) 25);
        setField(term94, term94.getClass(), "date", term95);
        setByteField(term99, term99.getClass(), "hour", (byte) 5);
        setByteField(term99, term99.getClass(), "minute", (byte) 20);
        setByteField(term99, term99.getClass(), "second", (byte) 50);
        setIntField(term99, term99.getClass(), "nano", 345595912);
        setField(term94, term94.getClass(), "time", term99);
        setField(term93, term93.getClass(), "dateTime", term94);
        setIntField(term104, term104.getClass(), "totalSeconds", -10800);
        setField(term104, term104.getClass(), "id", "-03:00");
        setField(term93, term93.getClass(), "offset", term104);
        setField(term114, term114.getClass(), "id", "America/Recife");
        setLongElement(term132, 0, -1767217224L);
        setField(term131, term131.getClass(), "standardTransitions", term132);
        setElement(term134, 1, term104);
        setField(term131, term131.getClass(), "standardOffsets", term134);
        setLongElement(term135, 0, -1767217224L);
        setLongElement(term135, 1, -1206957600L);
        setLongElement(term135, 2, -1191362400L);
        setLongElement(term135, 3, -1175374800L);
        setLongElement(term135, 4, -1159826400L);
        setLongElement(term135, 5, -633819600L);
        setLongElement(term135, 6, -622069200L);
        setLongElement(term135, 7, -602283600L);
        setLongElement(term135, 8, -591832800L);
        setLongElement(term135, 9, -570747600L);
        setLongElement(term135, 10, -560210400L);
        setLongElement(term135, 11, -539125200L);
        setLongElement(term135, 12, -531352800L);
        setLongElement(term135, 13, -191365200L);
        setLongElement(term135, 14, -184197600L);
        setLongElement(term135, 15, -155163600L);
        setLongElement(term135, 16, -150069600L);
        setLongElement(term135, 17, -128898000L);
        setLongElement(term135, 18, -121125600L);
        setLongElement(term135, 19, -99954000L);
        setLongElement(term135, 20, -89589600L);
        setLongElement(term135, 21, -68418000L);
        setLongElement(term135, 22, -57967200L);
        setLongElement(term135, 23, 499748400L);
        setLongElement(term135, 24, 511236000L);
        setLongElement(term135, 25, 530593200L);
        setLongElement(term135, 26, 540266400L);
        setLongElement(term135, 27, 562129200L);
        setLongElement(term135, 28, 571197600L);
        setLongElement(term135, 29, 592974000L);
        setLongElement(term135, 30, 602042400L);
        setLongElement(term135, 31, 624423600L);
        setLongElement(term135, 32, 634701600L);
        setLongElement(term135, 33, 938919600L);
        setLongElement(term135, 34, 951616800L);
        setLongElement(term135, 35, 970974000L);
        setLongElement(term135, 36, 971575200L);
        setLongElement(term135, 37, 1003028400L);
        setLongElement(term135, 38, 1013911200L);
        setField(term131, term131.getClass(), "savingsInstantTransitions", term135);
        setField(term131, term131.getClass(), "savingsLocalTransitions", term175);
        setElement(term176, 1, term104);
        setElement(term176, 3, term104);
        setElement(term176, 5, term104);
        setElement(term176, 7, term104);
        setElement(term176, 9, term104);
        setElement(term176, 11, term104);
        setElement(term176, 13, term104);
        setElement(term176, 15, term104);
        setElement(term176, 17, term104);
        setElement(term176, 19, term104);
        setElement(term176, 21, term104);
        setElement(term176, 23, term104);
        setElement(term176, 25, term104);
        setElement(term176, 27, term104);
        setElement(term176, 29, term104);
        setElement(term176, 31, term104);
        setElement(term176, 33, term104);
        setElement(term176, 35, term104);
        setElement(term176, 37, term104);
        setElement(term176, 39, term104);
        setField(term131, term131.getClass(), "wallOffsets", term176);
        setField(term131, term131.getClass(), "lastRules", term177);
        setField(term178, term178.getClass(), "table", null);
        setField(term178, term178.getClass(), "nextTable", null);
        setLongField(term178, term178.getClass(), "baseCount", 0L);
        setIntField(term178, term178.getClass(), "sizeCtl", 0);
        setIntField(term178, term178.getClass(), "transferIndex", 0);
        setIntField(term178, term178.getClass(), "cellsBusy", 0);
        setField(term178, term178.getClass(), "counterCells", null);
        setField(term178, term178.getClass(), "keySet", null);
        setField(term178, term178.getClass(), "values", null);
        setField(term178, term178.getClass(), "entrySet", null);
        setField(term178, term178.getClass(), "keySet", null);
        setField(term178, term178.getClass(), "values", null);
        setField(term131, term131.getClass(), "lastRulesCache", term178);
        setField(term114, term114.getClass(), "rules", term131);
        setField(term93, term93.getClass(), "zone", term114);
        setField(term1, term1.getClass(), "time_stamp", term93);
        setField(term1, term1.getClass(), "start_up_mode", "MjGYSRKTNF");
        setField(term1, term1.getClass(), "cmm_dly_mod", "hRNSzYYIrc");
        setField(term1, term1.getClass(), "cmm_dly_sec", "RMFIsYGgne");
        setField(term1, term1.getClass(), "cmm_err_mod", "NRdvgJlhkX");
        setField(term1, term1.getClass(), "country_code", "uuaPigETmJ");
        setField(term1, term1.getClass(), "region_code", "MxlszYVzRf");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.databank.PsRankingRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRnk_ps_pv_id_lst", argTypes, term1, args);
    }

};


