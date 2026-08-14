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

public class RegistrationRequest_setPlayername_164970167319 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term241017;

    public RegistrationRequest_setPlayername_164970167319() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term241017 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.RegistrationRequest"));
        Object term241211 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term241212 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term241213 = newInstance(Class.forName("java.time.LocalDate"));
        Object term241217 = newInstance(Class.forName("java.time.LocalTime"));
        Object term241222 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term241232 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term241249 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term241250 = (long[]) newLongArray(1);
        Object[] term241252 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term241253 = (long[]) newLongArray(39);
        Object[] term241293 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term241294 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term241295 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term241296 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term241017, term241017.getClass(), "pmm", "dVepDETefb");
        setField(term241017, term241017.getClass(), "idm", "IVzSENeLxP");
        setField(term241017, term241017.getClass(), "mmgameid", "XlXuNQwqYb");
        setField(term241017, term241017.getClass(), "mmuid", "ePtDnXODVc");
        setField(term241017, term241017.getClass(), "a_code", "NupNPsPxZu");
        setIntField(term241017, term241017.getClass(), "aime_id", 1112064805);
        setField(term241017, term241017.getClass(), "aime_a_code", "bOTZrbSitH");
        setField(term241017, term241017.getClass(), "key_obj_type", "ojFfVocDNH");
        setField(term241017, term241017.getClass(), "player_name", "gqBOEdccip");
        setField(term241017, term241017.getClass(), "passwd", "biglNwhOOx");
        setField(term241017, term241017.getClass(), "cmd", "mianqYKlGq");
        setField(term241017, term241017.getClass(), "req_id", "GmpbCvsoQd");
        setField(term241017, term241017.getClass(), "game_id", "ypYkYRcFQq");
        setField(term241017, term241017.getClass(), "r_ver", "lXLLmOVwcF");
        setField(term241017, term241017.getClass(), "kc_serial", "lIrBbPBrDY");
        setField(term241017, term241017.getClass(), "b_serial", "RDqKYQTmEE");
        setField(term241017, term241017.getClass(), "place_id", "MrUUMyYAHK");
        setIntField(term241213, term241213.getClass(), "year", 2027);
        setShortField(term241213, term241213.getClass(), "month", (short) 8);
        setShortField(term241213, term241213.getClass(), "day", (short) 16);
        setField(term241212, term241212.getClass(), "date", term241213);
        setByteField(term241217, term241217.getClass(), "hour", (byte) 8);
        setByteField(term241217, term241217.getClass(), "minute", (byte) 3);
        setByteField(term241217, term241217.getClass(), "second", (byte) 15);
        setIntField(term241217, term241217.getClass(), "nano", 332963320);
        setField(term241212, term241212.getClass(), "time", term241217);
        setField(term241211, term241211.getClass(), "dateTime", term241212);
        setIntField(term241222, term241222.getClass(), "totalSeconds", -10800);
        setField(term241222, term241222.getClass(), "id", "-03:00");
        setField(term241211, term241211.getClass(), "offset", term241222);
        setField(term241232, term241232.getClass(), "id", "America/Recife");
        setLongElement(term241250, 0, -1767217224L);
        setField(term241249, term241249.getClass(), "standardTransitions", term241250);
        setElement(term241252, 1, term241222);
        setField(term241249, term241249.getClass(), "standardOffsets", term241252);
        setLongElement(term241253, 0, -1767217224L);
        setLongElement(term241253, 1, -1206957600L);
        setLongElement(term241253, 2, -1191362400L);
        setLongElement(term241253, 3, -1175374800L);
        setLongElement(term241253, 4, -1159826400L);
        setLongElement(term241253, 5, -633819600L);
        setLongElement(term241253, 6, -622069200L);
        setLongElement(term241253, 7, -602283600L);
        setLongElement(term241253, 8, -591832800L);
        setLongElement(term241253, 9, -570747600L);
        setLongElement(term241253, 10, -560210400L);
        setLongElement(term241253, 11, -539125200L);
        setLongElement(term241253, 12, -531352800L);
        setLongElement(term241253, 13, -191365200L);
        setLongElement(term241253, 14, -184197600L);
        setLongElement(term241253, 15, -155163600L);
        setLongElement(term241253, 16, -150069600L);
        setLongElement(term241253, 17, -128898000L);
        setLongElement(term241253, 18, -121125600L);
        setLongElement(term241253, 19, -99954000L);
        setLongElement(term241253, 20, -89589600L);
        setLongElement(term241253, 21, -68418000L);
        setLongElement(term241253, 22, -57967200L);
        setLongElement(term241253, 23, 499748400L);
        setLongElement(term241253, 24, 511236000L);
        setLongElement(term241253, 25, 530593200L);
        setLongElement(term241253, 26, 540266400L);
        setLongElement(term241253, 27, 562129200L);
        setLongElement(term241253, 28, 571197600L);
        setLongElement(term241253, 29, 592974000L);
        setLongElement(term241253, 30, 602042400L);
        setLongElement(term241253, 31, 624423600L);
        setLongElement(term241253, 32, 634701600L);
        setLongElement(term241253, 33, 938919600L);
        setLongElement(term241253, 34, 951616800L);
        setLongElement(term241253, 35, 970974000L);
        setLongElement(term241253, 36, 971575200L);
        setLongElement(term241253, 37, 1003028400L);
        setLongElement(term241253, 38, 1013911200L);
        setField(term241249, term241249.getClass(), "savingsInstantTransitions", term241253);
        setField(term241249, term241249.getClass(), "savingsLocalTransitions", term241293);
        setElement(term241294, 1, term241222);
        setElement(term241294, 3, term241222);
        setElement(term241294, 5, term241222);
        setElement(term241294, 7, term241222);
        setElement(term241294, 9, term241222);
        setElement(term241294, 11, term241222);
        setElement(term241294, 13, term241222);
        setElement(term241294, 15, term241222);
        setElement(term241294, 17, term241222);
        setElement(term241294, 19, term241222);
        setElement(term241294, 21, term241222);
        setElement(term241294, 23, term241222);
        setElement(term241294, 25, term241222);
        setElement(term241294, 27, term241222);
        setElement(term241294, 29, term241222);
        setElement(term241294, 31, term241222);
        setElement(term241294, 33, term241222);
        setElement(term241294, 35, term241222);
        setElement(term241294, 37, term241222);
        setElement(term241294, 39, term241222);
        setField(term241249, term241249.getClass(), "wallOffsets", term241294);
        setField(term241249, term241249.getClass(), "lastRules", term241295);
        setField(term241296, term241296.getClass(), "table", null);
        setField(term241296, term241296.getClass(), "nextTable", null);
        setLongField(term241296, term241296.getClass(), "baseCount", 0L);
        setIntField(term241296, term241296.getClass(), "sizeCtl", 0);
        setIntField(term241296, term241296.getClass(), "transferIndex", 0);
        setIntField(term241296, term241296.getClass(), "cellsBusy", 0);
        setField(term241296, term241296.getClass(), "counterCells", null);
        setField(term241296, term241296.getClass(), "keySet", null);
        setField(term241296, term241296.getClass(), "values", null);
        setField(term241296, term241296.getClass(), "entrySet", null);
        setField(term241296, term241296.getClass(), "keySet", null);
        setField(term241296, term241296.getClass(), "values", null);
        setField(term241249, term241249.getClass(), "lastRulesCache", term241296);
        setField(term241232, term241232.getClass(), "rules", term241249);
        setField(term241211, term241211.getClass(), "zone", term241232);
        setField(term241017, term241017.getClass(), "time_stamp", term241211);
        setField(term241017, term241017.getClass(), "start_up_mode", "mltJfFDGWB");
        setField(term241017, term241017.getClass(), "cmm_dly_mod", "jXearfyNpX");
        setField(term241017, term241017.getClass(), "cmm_dly_sec", "BhmFDzFKBZ");
        setField(term241017, term241017.getClass(), "cmm_err_mod", "LfhJOBaMfN");
        setField(term241017, term241017.getClass(), "country_code", "gTpNrKjAOw");
        setField(term241017, term241017.getClass(), "region_code", "mezvZVqRCp");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.RegistrationRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "bZOShgQvtT";
        callMethod(klass, "setPlayer_name", argTypes, term241017, args);
    }

};


