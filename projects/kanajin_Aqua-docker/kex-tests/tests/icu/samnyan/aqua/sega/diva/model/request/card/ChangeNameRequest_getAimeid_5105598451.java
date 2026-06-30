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

public class ChangeNameRequest_getAimeid_5105598451 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23940;

    public ChangeNameRequest_getAimeid_5105598451() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23940 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.ChangeNameRequest"));
        Object term24065 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term24066 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term24067 = newInstance(Class.forName("java.time.LocalDate"));
        Object term24071 = newInstance(Class.forName("java.time.LocalTime"));
        Object term24076 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term24086 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term24103 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term24104 = (long[]) newLongArray(1);
        Object[] term24106 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term24107 = (long[]) newLongArray(39);
        Object[] term24147 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term24148 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term24149 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term24150 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term23940, term23940.getClass(), "a_code", "nDCcyhiTnS");
        setIntField(term23940, term23940.getClass(), "aime_id", 1114000454);
        setField(term23940, term23940.getClass(), "aime_a_code", "Bcivwcjece");
        setIntField(term23940, term23940.getClass(), "pd_id", -556405712);
        setIntField(term23940, term23940.getClass(), "accept_idx", -1772434990);
        setField(term23940, term23940.getClass(), "player_name", "QTefjRuiez");
        setIntField(term23940, term23940.getClass(), "chg_name_price", -1845499264);
        setField(term23940, term23940.getClass(), "cmd", "SQZVNkAVBB");
        setField(term23940, term23940.getClass(), "req_id", "mrSAYJlddZ");
        setField(term23940, term23940.getClass(), "game_id", "KbwxawvYsw");
        setField(term23940, term23940.getClass(), "r_ver", "gvjdfHNzOa");
        setField(term23940, term23940.getClass(), "kc_serial", "HqitWglYWX");
        setField(term23940, term23940.getClass(), "b_serial", "pOuFRlHmbK");
        setField(term23940, term23940.getClass(), "place_id", "WrzdBkinqV");
        setIntField(term24067, term24067.getClass(), "year", 2027);
        setShortField(term24067, term24067.getClass(), "month", (short) 11);
        setShortField(term24067, term24067.getClass(), "day", (short) 8);
        setField(term24066, term24066.getClass(), "date", term24067);
        setByteField(term24071, term24071.getClass(), "hour", (byte) 11);
        setByteField(term24071, term24071.getClass(), "minute", (byte) 59);
        setByteField(term24071, term24071.getClass(), "second", (byte) 14);
        setIntField(term24071, term24071.getClass(), "nano", 322375591);
        setField(term24066, term24066.getClass(), "time", term24071);
        setField(term24065, term24065.getClass(), "dateTime", term24066);
        setIntField(term24076, term24076.getClass(), "totalSeconds", -10800);
        setField(term24076, term24076.getClass(), "id", "-03:00");
        setField(term24065, term24065.getClass(), "offset", term24076);
        setField(term24086, term24086.getClass(), "id", "America/Recife");
        setLongElement(term24104, 0, -1767217224L);
        setField(term24103, term24103.getClass(), "standardTransitions", term24104);
        setElement(term24106, 1, term24076);
        setField(term24103, term24103.getClass(), "standardOffsets", term24106);
        setLongElement(term24107, 0, -1767217224L);
        setLongElement(term24107, 1, -1206957600L);
        setLongElement(term24107, 2, -1191362400L);
        setLongElement(term24107, 3, -1175374800L);
        setLongElement(term24107, 4, -1159826400L);
        setLongElement(term24107, 5, -633819600L);
        setLongElement(term24107, 6, -622069200L);
        setLongElement(term24107, 7, -602283600L);
        setLongElement(term24107, 8, -591832800L);
        setLongElement(term24107, 9, -570747600L);
        setLongElement(term24107, 10, -560210400L);
        setLongElement(term24107, 11, -539125200L);
        setLongElement(term24107, 12, -531352800L);
        setLongElement(term24107, 13, -191365200L);
        setLongElement(term24107, 14, -184197600L);
        setLongElement(term24107, 15, -155163600L);
        setLongElement(term24107, 16, -150069600L);
        setLongElement(term24107, 17, -128898000L);
        setLongElement(term24107, 18, -121125600L);
        setLongElement(term24107, 19, -99954000L);
        setLongElement(term24107, 20, -89589600L);
        setLongElement(term24107, 21, -68418000L);
        setLongElement(term24107, 22, -57967200L);
        setLongElement(term24107, 23, 499748400L);
        setLongElement(term24107, 24, 511236000L);
        setLongElement(term24107, 25, 530593200L);
        setLongElement(term24107, 26, 540266400L);
        setLongElement(term24107, 27, 562129200L);
        setLongElement(term24107, 28, 571197600L);
        setLongElement(term24107, 29, 592974000L);
        setLongElement(term24107, 30, 602042400L);
        setLongElement(term24107, 31, 624423600L);
        setLongElement(term24107, 32, 634701600L);
        setLongElement(term24107, 33, 938919600L);
        setLongElement(term24107, 34, 951616800L);
        setLongElement(term24107, 35, 970974000L);
        setLongElement(term24107, 36, 971575200L);
        setLongElement(term24107, 37, 1003028400L);
        setLongElement(term24107, 38, 1013911200L);
        setField(term24103, term24103.getClass(), "savingsInstantTransitions", term24107);
        setField(term24103, term24103.getClass(), "savingsLocalTransitions", term24147);
        setElement(term24148, 1, term24076);
        setElement(term24148, 3, term24076);
        setElement(term24148, 5, term24076);
        setElement(term24148, 7, term24076);
        setElement(term24148, 9, term24076);
        setElement(term24148, 11, term24076);
        setElement(term24148, 13, term24076);
        setElement(term24148, 15, term24076);
        setElement(term24148, 17, term24076);
        setElement(term24148, 19, term24076);
        setElement(term24148, 21, term24076);
        setElement(term24148, 23, term24076);
        setElement(term24148, 25, term24076);
        setElement(term24148, 27, term24076);
        setElement(term24148, 29, term24076);
        setElement(term24148, 31, term24076);
        setElement(term24148, 33, term24076);
        setElement(term24148, 35, term24076);
        setElement(term24148, 37, term24076);
        setElement(term24148, 39, term24076);
        setField(term24103, term24103.getClass(), "wallOffsets", term24148);
        setField(term24103, term24103.getClass(), "lastRules", term24149);
        setField(term24150, term24150.getClass(), "table", null);
        setField(term24150, term24150.getClass(), "nextTable", null);
        setLongField(term24150, term24150.getClass(), "baseCount", 0L);
        setIntField(term24150, term24150.getClass(), "sizeCtl", 0);
        setIntField(term24150, term24150.getClass(), "transferIndex", 0);
        setIntField(term24150, term24150.getClass(), "cellsBusy", 0);
        setField(term24150, term24150.getClass(), "counterCells", null);
        setField(term24150, term24150.getClass(), "keySet", null);
        setField(term24150, term24150.getClass(), "values", null);
        setField(term24150, term24150.getClass(), "entrySet", null);
        setField(term24150, term24150.getClass(), "keySet", null);
        setField(term24150, term24150.getClass(), "values", null);
        setField(term24103, term24103.getClass(), "lastRulesCache", term24150);
        setField(term24086, term24086.getClass(), "rules", term24103);
        setField(term24065, term24065.getClass(), "zone", term24086);
        setField(term23940, term23940.getClass(), "time_stamp", term24065);
        setField(term23940, term23940.getClass(), "start_up_mode", "vydWXHfFTw");
        setField(term23940, term23940.getClass(), "cmm_dly_mod", "DRhkpDneCC");
        setField(term23940, term23940.getClass(), "cmm_dly_sec", "vuIJRrypuA");
        setField(term23940, term23940.getClass(), "cmm_err_mod", "AxfSZmaiyA");
        setField(term23940, term23940.getClass(), "country_code", "lBpveIKbea");
        setField(term23940, term23940.getClass(), "region_code", "uyLBVQYcOV");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.ChangeNameRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAime_id", argTypes, term23940, args);
    }

};


