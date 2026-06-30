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

public class ChangeNameRequest_getChgnameprice_17078141676 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26475;

    public ChangeNameRequest_getChgnameprice_17078141676() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26475 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.ChangeNameRequest"));
        Object term26600 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term26601 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term26602 = newInstance(Class.forName("java.time.LocalDate"));
        Object term26606 = newInstance(Class.forName("java.time.LocalTime"));
        Object term26611 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term26621 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term26638 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term26639 = (long[]) newLongArray(1);
        Object[] term26641 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term26642 = (long[]) newLongArray(39);
        Object[] term26682 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term26683 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term26684 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term26685 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term26475, term26475.getClass(), "a_code", "lkdvUiYwRq");
        setIntField(term26475, term26475.getClass(), "aime_id", -615654495);
        setField(term26475, term26475.getClass(), "aime_a_code", "XuxkPrpfND");
        setIntField(term26475, term26475.getClass(), "pd_id", -1476117762);
        setIntField(term26475, term26475.getClass(), "accept_idx", -341962980);
        setField(term26475, term26475.getClass(), "player_name", "OxNXeKMDje");
        setIntField(term26475, term26475.getClass(), "chg_name_price", 1532716628);
        setField(term26475, term26475.getClass(), "cmd", "hGTqHomrbc");
        setField(term26475, term26475.getClass(), "req_id", "NNMBrIWEBw");
        setField(term26475, term26475.getClass(), "game_id", "GrTaccOQzl");
        setField(term26475, term26475.getClass(), "r_ver", "uuSYOUCVHU");
        setField(term26475, term26475.getClass(), "kc_serial", "DfWwbodtVw");
        setField(term26475, term26475.getClass(), "b_serial", "kTbFMpVWqx");
        setField(term26475, term26475.getClass(), "place_id", "HegRNsidFg");
        setIntField(term26602, term26602.getClass(), "year", 2027);
        setShortField(term26602, term26602.getClass(), "month", (short) 8);
        setShortField(term26602, term26602.getClass(), "day", (short) 23);
        setField(term26601, term26601.getClass(), "date", term26602);
        setByteField(term26606, term26606.getClass(), "hour", (byte) 15);
        setByteField(term26606, term26606.getClass(), "minute", (byte) 12);
        setByteField(term26606, term26606.getClass(), "second", (byte) 6);
        setIntField(term26606, term26606.getClass(), "nano", 541218258);
        setField(term26601, term26601.getClass(), "time", term26606);
        setField(term26600, term26600.getClass(), "dateTime", term26601);
        setIntField(term26611, term26611.getClass(), "totalSeconds", -10800);
        setField(term26611, term26611.getClass(), "id", "-03:00");
        setField(term26600, term26600.getClass(), "offset", term26611);
        setField(term26621, term26621.getClass(), "id", "America/Recife");
        setLongElement(term26639, 0, -1767217224L);
        setField(term26638, term26638.getClass(), "standardTransitions", term26639);
        setElement(term26641, 1, term26611);
        setField(term26638, term26638.getClass(), "standardOffsets", term26641);
        setLongElement(term26642, 0, -1767217224L);
        setLongElement(term26642, 1, -1206957600L);
        setLongElement(term26642, 2, -1191362400L);
        setLongElement(term26642, 3, -1175374800L);
        setLongElement(term26642, 4, -1159826400L);
        setLongElement(term26642, 5, -633819600L);
        setLongElement(term26642, 6, -622069200L);
        setLongElement(term26642, 7, -602283600L);
        setLongElement(term26642, 8, -591832800L);
        setLongElement(term26642, 9, -570747600L);
        setLongElement(term26642, 10, -560210400L);
        setLongElement(term26642, 11, -539125200L);
        setLongElement(term26642, 12, -531352800L);
        setLongElement(term26642, 13, -191365200L);
        setLongElement(term26642, 14, -184197600L);
        setLongElement(term26642, 15, -155163600L);
        setLongElement(term26642, 16, -150069600L);
        setLongElement(term26642, 17, -128898000L);
        setLongElement(term26642, 18, -121125600L);
        setLongElement(term26642, 19, -99954000L);
        setLongElement(term26642, 20, -89589600L);
        setLongElement(term26642, 21, -68418000L);
        setLongElement(term26642, 22, -57967200L);
        setLongElement(term26642, 23, 499748400L);
        setLongElement(term26642, 24, 511236000L);
        setLongElement(term26642, 25, 530593200L);
        setLongElement(term26642, 26, 540266400L);
        setLongElement(term26642, 27, 562129200L);
        setLongElement(term26642, 28, 571197600L);
        setLongElement(term26642, 29, 592974000L);
        setLongElement(term26642, 30, 602042400L);
        setLongElement(term26642, 31, 624423600L);
        setLongElement(term26642, 32, 634701600L);
        setLongElement(term26642, 33, 938919600L);
        setLongElement(term26642, 34, 951616800L);
        setLongElement(term26642, 35, 970974000L);
        setLongElement(term26642, 36, 971575200L);
        setLongElement(term26642, 37, 1003028400L);
        setLongElement(term26642, 38, 1013911200L);
        setField(term26638, term26638.getClass(), "savingsInstantTransitions", term26642);
        setField(term26638, term26638.getClass(), "savingsLocalTransitions", term26682);
        setElement(term26683, 1, term26611);
        setElement(term26683, 3, term26611);
        setElement(term26683, 5, term26611);
        setElement(term26683, 7, term26611);
        setElement(term26683, 9, term26611);
        setElement(term26683, 11, term26611);
        setElement(term26683, 13, term26611);
        setElement(term26683, 15, term26611);
        setElement(term26683, 17, term26611);
        setElement(term26683, 19, term26611);
        setElement(term26683, 21, term26611);
        setElement(term26683, 23, term26611);
        setElement(term26683, 25, term26611);
        setElement(term26683, 27, term26611);
        setElement(term26683, 29, term26611);
        setElement(term26683, 31, term26611);
        setElement(term26683, 33, term26611);
        setElement(term26683, 35, term26611);
        setElement(term26683, 37, term26611);
        setElement(term26683, 39, term26611);
        setField(term26638, term26638.getClass(), "wallOffsets", term26683);
        setField(term26638, term26638.getClass(), "lastRules", term26684);
        setField(term26685, term26685.getClass(), "table", null);
        setField(term26685, term26685.getClass(), "nextTable", null);
        setLongField(term26685, term26685.getClass(), "baseCount", 0L);
        setIntField(term26685, term26685.getClass(), "sizeCtl", 0);
        setIntField(term26685, term26685.getClass(), "transferIndex", 0);
        setIntField(term26685, term26685.getClass(), "cellsBusy", 0);
        setField(term26685, term26685.getClass(), "counterCells", null);
        setField(term26685, term26685.getClass(), "keySet", null);
        setField(term26685, term26685.getClass(), "values", null);
        setField(term26685, term26685.getClass(), "entrySet", null);
        setField(term26685, term26685.getClass(), "keySet", null);
        setField(term26685, term26685.getClass(), "values", null);
        setField(term26638, term26638.getClass(), "lastRulesCache", term26685);
        setField(term26621, term26621.getClass(), "rules", term26638);
        setField(term26600, term26600.getClass(), "zone", term26621);
        setField(term26475, term26475.getClass(), "time_stamp", term26600);
        setField(term26475, term26475.getClass(), "start_up_mode", "udRdJkgXmH");
        setField(term26475, term26475.getClass(), "cmm_dly_mod", "FBCXbjHVXO");
        setField(term26475, term26475.getClass(), "cmm_dly_sec", "dIWAnvmLiC");
        setField(term26475, term26475.getClass(), "cmm_err_mod", "CuWebzZQjZ");
        setField(term26475, term26475.getClass(), "country_code", "wRVaaJxKYI");
        setField(term26475, term26475.getClass(), "region_code", "yOQuJXRvOo");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.ChangeNameRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getChg_name_price", argTypes, term26475, args);
    }

};


