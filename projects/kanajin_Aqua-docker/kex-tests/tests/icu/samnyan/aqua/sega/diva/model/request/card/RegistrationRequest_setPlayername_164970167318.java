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

public class RegistrationRequest_setPlayername_164970167318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17881;

    public RegistrationRequest_setPlayername_164970167318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17881 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.RegistrationRequest"));
        Object term18075 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term18076 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term18077 = newInstance(Class.forName("java.time.LocalDate"));
        Object term18081 = newInstance(Class.forName("java.time.LocalTime"));
        Object term18086 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term18096 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term18113 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term18114 = (long[]) newLongArray(1);
        Object[] term18116 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term18117 = (long[]) newLongArray(39);
        Object[] term18157 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term18158 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term18159 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term18160 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term17881, term17881.getClass(), "pmm", "CVZnTiJucs");
        setField(term17881, term17881.getClass(), "idm", "ecHEQufXoq");
        setField(term17881, term17881.getClass(), "mmgameid", "btBLMvHzJg");
        setField(term17881, term17881.getClass(), "mmuid", "JdOMfNWgLP");
        setField(term17881, term17881.getClass(), "a_code", "uWqXrwAsDU");
        setIntField(term17881, term17881.getClass(), "aime_id", 97029295);
        setField(term17881, term17881.getClass(), "aime_a_code", "hgFbWAUtsu");
        setField(term17881, term17881.getClass(), "key_obj_type", "HqoTWlkbwF");
        setField(term17881, term17881.getClass(), "player_name", "CwNELDTAPP");
        setField(term17881, term17881.getClass(), "passwd", "GSzQdbHLHw");
        setField(term17881, term17881.getClass(), "cmd", "IkfarsYNJO");
        setField(term17881, term17881.getClass(), "req_id", "aZKOWhHMEh");
        setField(term17881, term17881.getClass(), "game_id", "YfkhviKZwl");
        setField(term17881, term17881.getClass(), "r_ver", "DcOhhAfJTI");
        setField(term17881, term17881.getClass(), "kc_serial", "gYTIkBFOoS");
        setField(term17881, term17881.getClass(), "b_serial", "xmzSoVgiED");
        setField(term17881, term17881.getClass(), "place_id", "pdSvedKgPq");
        setIntField(term18077, term18077.getClass(), "year", 2016);
        setShortField(term18077, term18077.getClass(), "month", (short) 6);
        setShortField(term18077, term18077.getClass(), "day", (short) 15);
        setField(term18076, term18076.getClass(), "date", term18077);
        setByteField(term18081, term18081.getClass(), "hour", (byte) 21);
        setByteField(term18081, term18081.getClass(), "minute", (byte) 23);
        setByteField(term18081, term18081.getClass(), "second", (byte) 23);
        setIntField(term18081, term18081.getClass(), "nano", 433372070);
        setField(term18076, term18076.getClass(), "time", term18081);
        setField(term18075, term18075.getClass(), "dateTime", term18076);
        setIntField(term18086, term18086.getClass(), "totalSeconds", -10800);
        setField(term18086, term18086.getClass(), "id", "-03:00");
        setField(term18075, term18075.getClass(), "offset", term18086);
        setField(term18096, term18096.getClass(), "id", "America/Recife");
        setLongElement(term18114, 0, -1767217224L);
        setField(term18113, term18113.getClass(), "standardTransitions", term18114);
        setElement(term18116, 1, term18086);
        setField(term18113, term18113.getClass(), "standardOffsets", term18116);
        setLongElement(term18117, 0, -1767217224L);
        setLongElement(term18117, 1, -1206957600L);
        setLongElement(term18117, 2, -1191362400L);
        setLongElement(term18117, 3, -1175374800L);
        setLongElement(term18117, 4, -1159826400L);
        setLongElement(term18117, 5, -633819600L);
        setLongElement(term18117, 6, -622069200L);
        setLongElement(term18117, 7, -602283600L);
        setLongElement(term18117, 8, -591832800L);
        setLongElement(term18117, 9, -570747600L);
        setLongElement(term18117, 10, -560210400L);
        setLongElement(term18117, 11, -539125200L);
        setLongElement(term18117, 12, -531352800L);
        setLongElement(term18117, 13, -191365200L);
        setLongElement(term18117, 14, -184197600L);
        setLongElement(term18117, 15, -155163600L);
        setLongElement(term18117, 16, -150069600L);
        setLongElement(term18117, 17, -128898000L);
        setLongElement(term18117, 18, -121125600L);
        setLongElement(term18117, 19, -99954000L);
        setLongElement(term18117, 20, -89589600L);
        setLongElement(term18117, 21, -68418000L);
        setLongElement(term18117, 22, -57967200L);
        setLongElement(term18117, 23, 499748400L);
        setLongElement(term18117, 24, 511236000L);
        setLongElement(term18117, 25, 530593200L);
        setLongElement(term18117, 26, 540266400L);
        setLongElement(term18117, 27, 562129200L);
        setLongElement(term18117, 28, 571197600L);
        setLongElement(term18117, 29, 592974000L);
        setLongElement(term18117, 30, 602042400L);
        setLongElement(term18117, 31, 624423600L);
        setLongElement(term18117, 32, 634701600L);
        setLongElement(term18117, 33, 938919600L);
        setLongElement(term18117, 34, 951616800L);
        setLongElement(term18117, 35, 970974000L);
        setLongElement(term18117, 36, 971575200L);
        setLongElement(term18117, 37, 1003028400L);
        setLongElement(term18117, 38, 1013911200L);
        setField(term18113, term18113.getClass(), "savingsInstantTransitions", term18117);
        setField(term18113, term18113.getClass(), "savingsLocalTransitions", term18157);
        setElement(term18158, 1, term18086);
        setElement(term18158, 3, term18086);
        setElement(term18158, 5, term18086);
        setElement(term18158, 7, term18086);
        setElement(term18158, 9, term18086);
        setElement(term18158, 11, term18086);
        setElement(term18158, 13, term18086);
        setElement(term18158, 15, term18086);
        setElement(term18158, 17, term18086);
        setElement(term18158, 19, term18086);
        setElement(term18158, 21, term18086);
        setElement(term18158, 23, term18086);
        setElement(term18158, 25, term18086);
        setElement(term18158, 27, term18086);
        setElement(term18158, 29, term18086);
        setElement(term18158, 31, term18086);
        setElement(term18158, 33, term18086);
        setElement(term18158, 35, term18086);
        setElement(term18158, 37, term18086);
        setElement(term18158, 39, term18086);
        setField(term18113, term18113.getClass(), "wallOffsets", term18158);
        setField(term18113, term18113.getClass(), "lastRules", term18159);
        setField(term18160, term18160.getClass(), "table", null);
        setField(term18160, term18160.getClass(), "nextTable", null);
        setLongField(term18160, term18160.getClass(), "baseCount", 0L);
        setIntField(term18160, term18160.getClass(), "sizeCtl", 0);
        setIntField(term18160, term18160.getClass(), "transferIndex", 0);
        setIntField(term18160, term18160.getClass(), "cellsBusy", 0);
        setField(term18160, term18160.getClass(), "counterCells", null);
        setField(term18160, term18160.getClass(), "keySet", null);
        setField(term18160, term18160.getClass(), "values", null);
        setField(term18160, term18160.getClass(), "entrySet", null);
        setField(term18160, term18160.getClass(), "keySet", null);
        setField(term18160, term18160.getClass(), "values", null);
        setField(term18113, term18113.getClass(), "lastRulesCache", term18160);
        setField(term18096, term18096.getClass(), "rules", term18113);
        setField(term18075, term18075.getClass(), "zone", term18096);
        setField(term17881, term17881.getClass(), "time_stamp", term18075);
        setField(term17881, term17881.getClass(), "start_up_mode", "epPTwvcoyb");
        setField(term17881, term17881.getClass(), "cmm_dly_mod", "UBPHmOICBs");
        setField(term17881, term17881.getClass(), "cmm_dly_sec", "IDJUVPgUJf");
        setField(term17881, term17881.getClass(), "cmm_err_mod", "JmnWRJUxGr");
        setField(term17881, term17881.getClass(), "country_code", "wgRGBNrTGP");
        setField(term17881, term17881.getClass(), "region_code", "FIdNVptZpW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.RegistrationRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "rQjxAhisjm";
        callMethod(klass, "setPlayer_name", argTypes, term17881, args);
    }

};


