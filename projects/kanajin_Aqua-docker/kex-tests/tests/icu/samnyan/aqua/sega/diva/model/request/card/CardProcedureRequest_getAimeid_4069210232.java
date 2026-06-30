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

public class CardProcedureRequest_getAimeid_4069210232 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20407;

    public CardProcedureRequest_getAimeid_4069210232() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20407 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.CardProcedureRequest"));
        Object term20518 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term20519 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term20520 = newInstance(Class.forName("java.time.LocalDate"));
        Object term20524 = newInstance(Class.forName("java.time.LocalTime"));
        Object term20529 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term20539 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term20556 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term20557 = (long[]) newLongArray(1);
        Object[] term20559 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term20560 = (long[]) newLongArray(39);
        Object[] term20600 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term20601 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term20602 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term20603 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setIntField(term20407, term20407.getClass(), "cd_adm_cmd", -112921587);
        setField(term20407, term20407.getClass(), "a_code", "QgHhxMyKvr");
        setIntField(term20407, term20407.getClass(), "aime_id", 933028652);
        setField(term20407, term20407.getClass(), "aime_a_code", "VGiXZZTWRO");
        setField(term20407, term20407.getClass(), "cmd", "MlPtwXnJOJ");
        setField(term20407, term20407.getClass(), "req_id", "DbfiyFeaTe");
        setField(term20407, term20407.getClass(), "game_id", "dQxXGBtDLZ");
        setField(term20407, term20407.getClass(), "r_ver", "EgSgEFIyyN");
        setField(term20407, term20407.getClass(), "kc_serial", "iAOFcXaLSf");
        setField(term20407, term20407.getClass(), "b_serial", "EHoNUaeyvT");
        setField(term20407, term20407.getClass(), "place_id", "ZwKmasCVIy");
        setIntField(term20520, term20520.getClass(), "year", 2010);
        setShortField(term20520, term20520.getClass(), "month", (short) 5);
        setShortField(term20520, term20520.getClass(), "day", (short) 2);
        setField(term20519, term20519.getClass(), "date", term20520);
        setByteField(term20524, term20524.getClass(), "hour", (byte) 2);
        setByteField(term20524, term20524.getClass(), "minute", (byte) 22);
        setByteField(term20524, term20524.getClass(), "second", (byte) 33);
        setIntField(term20524, term20524.getClass(), "nano", 530835039);
        setField(term20519, term20519.getClass(), "time", term20524);
        setField(term20518, term20518.getClass(), "dateTime", term20519);
        setIntField(term20529, term20529.getClass(), "totalSeconds", -10800);
        setField(term20529, term20529.getClass(), "id", "-03:00");
        setField(term20518, term20518.getClass(), "offset", term20529);
        setField(term20539, term20539.getClass(), "id", "America/Recife");
        setLongElement(term20557, 0, -1767217224L);
        setField(term20556, term20556.getClass(), "standardTransitions", term20557);
        setElement(term20559, 1, term20529);
        setField(term20556, term20556.getClass(), "standardOffsets", term20559);
        setLongElement(term20560, 0, -1767217224L);
        setLongElement(term20560, 1, -1206957600L);
        setLongElement(term20560, 2, -1191362400L);
        setLongElement(term20560, 3, -1175374800L);
        setLongElement(term20560, 4, -1159826400L);
        setLongElement(term20560, 5, -633819600L);
        setLongElement(term20560, 6, -622069200L);
        setLongElement(term20560, 7, -602283600L);
        setLongElement(term20560, 8, -591832800L);
        setLongElement(term20560, 9, -570747600L);
        setLongElement(term20560, 10, -560210400L);
        setLongElement(term20560, 11, -539125200L);
        setLongElement(term20560, 12, -531352800L);
        setLongElement(term20560, 13, -191365200L);
        setLongElement(term20560, 14, -184197600L);
        setLongElement(term20560, 15, -155163600L);
        setLongElement(term20560, 16, -150069600L);
        setLongElement(term20560, 17, -128898000L);
        setLongElement(term20560, 18, -121125600L);
        setLongElement(term20560, 19, -99954000L);
        setLongElement(term20560, 20, -89589600L);
        setLongElement(term20560, 21, -68418000L);
        setLongElement(term20560, 22, -57967200L);
        setLongElement(term20560, 23, 499748400L);
        setLongElement(term20560, 24, 511236000L);
        setLongElement(term20560, 25, 530593200L);
        setLongElement(term20560, 26, 540266400L);
        setLongElement(term20560, 27, 562129200L);
        setLongElement(term20560, 28, 571197600L);
        setLongElement(term20560, 29, 592974000L);
        setLongElement(term20560, 30, 602042400L);
        setLongElement(term20560, 31, 624423600L);
        setLongElement(term20560, 32, 634701600L);
        setLongElement(term20560, 33, 938919600L);
        setLongElement(term20560, 34, 951616800L);
        setLongElement(term20560, 35, 970974000L);
        setLongElement(term20560, 36, 971575200L);
        setLongElement(term20560, 37, 1003028400L);
        setLongElement(term20560, 38, 1013911200L);
        setField(term20556, term20556.getClass(), "savingsInstantTransitions", term20560);
        setField(term20556, term20556.getClass(), "savingsLocalTransitions", term20600);
        setElement(term20601, 1, term20529);
        setElement(term20601, 3, term20529);
        setElement(term20601, 5, term20529);
        setElement(term20601, 7, term20529);
        setElement(term20601, 9, term20529);
        setElement(term20601, 11, term20529);
        setElement(term20601, 13, term20529);
        setElement(term20601, 15, term20529);
        setElement(term20601, 17, term20529);
        setElement(term20601, 19, term20529);
        setElement(term20601, 21, term20529);
        setElement(term20601, 23, term20529);
        setElement(term20601, 25, term20529);
        setElement(term20601, 27, term20529);
        setElement(term20601, 29, term20529);
        setElement(term20601, 31, term20529);
        setElement(term20601, 33, term20529);
        setElement(term20601, 35, term20529);
        setElement(term20601, 37, term20529);
        setElement(term20601, 39, term20529);
        setField(term20556, term20556.getClass(), "wallOffsets", term20601);
        setField(term20556, term20556.getClass(), "lastRules", term20602);
        setField(term20603, term20603.getClass(), "table", null);
        setField(term20603, term20603.getClass(), "nextTable", null);
        setLongField(term20603, term20603.getClass(), "baseCount", 0L);
        setIntField(term20603, term20603.getClass(), "sizeCtl", 0);
        setIntField(term20603, term20603.getClass(), "transferIndex", 0);
        setIntField(term20603, term20603.getClass(), "cellsBusy", 0);
        setField(term20603, term20603.getClass(), "counterCells", null);
        setField(term20603, term20603.getClass(), "keySet", null);
        setField(term20603, term20603.getClass(), "values", null);
        setField(term20603, term20603.getClass(), "entrySet", null);
        setField(term20603, term20603.getClass(), "keySet", null);
        setField(term20603, term20603.getClass(), "values", null);
        setField(term20556, term20556.getClass(), "lastRulesCache", term20603);
        setField(term20539, term20539.getClass(), "rules", term20556);
        setField(term20518, term20518.getClass(), "zone", term20539);
        setField(term20407, term20407.getClass(), "time_stamp", term20518);
        setField(term20407, term20407.getClass(), "start_up_mode", "pxokrVaeMd");
        setField(term20407, term20407.getClass(), "cmm_dly_mod", "ujxmmZZcbT");
        setField(term20407, term20407.getClass(), "cmm_dly_sec", "BOvgwHfoHQ");
        setField(term20407, term20407.getClass(), "cmm_err_mod", "hPpFNeDBIb");
        setField(term20407, term20407.getClass(), "country_code", "DNOtiLPAIY");
        setField(term20407, term20407.getClass(), "region_code", "FnEkAHBfyV");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.CardProcedureRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAime_id", argTypes, term20407, args);
    }

};


