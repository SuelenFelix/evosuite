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

public class AttendRequest_getAtndprm1_3883470491 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term526;

    public AttendRequest_getAtndprm1_3883470491() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term526 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.boot.AttendRequest"));
        Object term659 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term660 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term661 = newInstance(Class.forName("java.time.LocalDate"));
        Object term665 = newInstance(Class.forName("java.time.LocalTime"));
        Object term670 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term680 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term697 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term698 = (long[]) newLongArray(1);
        Object[] term700 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term701 = (long[]) newLongArray(39);
        Object[] term741 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term742 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term743 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term744 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term526, term526.getClass(), "atnd_lut", "tbcdzjIfER");
        setField(term526, term526.getClass(), "atnd_prm1", "HyxfbSQYBe");
        setField(term526, term526.getClass(), "atnd_prm2", "pCTimMblYc");
        setField(term526, term526.getClass(), "atnd_prm3", "hNxWaHcfhY");
        setField(term526, term526.getClass(), "cmd", "RkybSrpybU");
        setField(term526, term526.getClass(), "req_id", "xOEqzGAmDU");
        setField(term526, term526.getClass(), "game_id", "eZFUvlxvGV");
        setField(term526, term526.getClass(), "r_ver", "BYqFIqCKAV");
        setField(term526, term526.getClass(), "kc_serial", "vrQLuWIDJX");
        setField(term526, term526.getClass(), "b_serial", "flxyYxBRtu");
        setField(term526, term526.getClass(), "place_id", "OclPbYPkcH");
        setIntField(term661, term661.getClass(), "year", 2021);
        setShortField(term661, term661.getClass(), "month", (short) 1);
        setShortField(term661, term661.getClass(), "day", (short) 18);
        setField(term660, term660.getClass(), "date", term661);
        setByteField(term665, term665.getClass(), "hour", (byte) 13);
        setByteField(term665, term665.getClass(), "minute", (byte) 38);
        setByteField(term665, term665.getClass(), "second", (byte) 26);
        setIntField(term665, term665.getClass(), "nano", 544608644);
        setField(term660, term660.getClass(), "time", term665);
        setField(term659, term659.getClass(), "dateTime", term660);
        setIntField(term670, term670.getClass(), "totalSeconds", -10800);
        setField(term670, term670.getClass(), "id", "-03:00");
        setField(term659, term659.getClass(), "offset", term670);
        setField(term680, term680.getClass(), "id", "America/Recife");
        setLongElement(term698, 0, -1767217224L);
        setField(term697, term697.getClass(), "standardTransitions", term698);
        setElement(term700, 1, term670);
        setField(term697, term697.getClass(), "standardOffsets", term700);
        setLongElement(term701, 0, -1767217224L);
        setLongElement(term701, 1, -1206957600L);
        setLongElement(term701, 2, -1191362400L);
        setLongElement(term701, 3, -1175374800L);
        setLongElement(term701, 4, -1159826400L);
        setLongElement(term701, 5, -633819600L);
        setLongElement(term701, 6, -622069200L);
        setLongElement(term701, 7, -602283600L);
        setLongElement(term701, 8, -591832800L);
        setLongElement(term701, 9, -570747600L);
        setLongElement(term701, 10, -560210400L);
        setLongElement(term701, 11, -539125200L);
        setLongElement(term701, 12, -531352800L);
        setLongElement(term701, 13, -191365200L);
        setLongElement(term701, 14, -184197600L);
        setLongElement(term701, 15, -155163600L);
        setLongElement(term701, 16, -150069600L);
        setLongElement(term701, 17, -128898000L);
        setLongElement(term701, 18, -121125600L);
        setLongElement(term701, 19, -99954000L);
        setLongElement(term701, 20, -89589600L);
        setLongElement(term701, 21, -68418000L);
        setLongElement(term701, 22, -57967200L);
        setLongElement(term701, 23, 499748400L);
        setLongElement(term701, 24, 511236000L);
        setLongElement(term701, 25, 530593200L);
        setLongElement(term701, 26, 540266400L);
        setLongElement(term701, 27, 562129200L);
        setLongElement(term701, 28, 571197600L);
        setLongElement(term701, 29, 592974000L);
        setLongElement(term701, 30, 602042400L);
        setLongElement(term701, 31, 624423600L);
        setLongElement(term701, 32, 634701600L);
        setLongElement(term701, 33, 938919600L);
        setLongElement(term701, 34, 951616800L);
        setLongElement(term701, 35, 970974000L);
        setLongElement(term701, 36, 971575200L);
        setLongElement(term701, 37, 1003028400L);
        setLongElement(term701, 38, 1013911200L);
        setField(term697, term697.getClass(), "savingsInstantTransitions", term701);
        setField(term697, term697.getClass(), "savingsLocalTransitions", term741);
        setElement(term742, 1, term670);
        setElement(term742, 3, term670);
        setElement(term742, 5, term670);
        setElement(term742, 7, term670);
        setElement(term742, 9, term670);
        setElement(term742, 11, term670);
        setElement(term742, 13, term670);
        setElement(term742, 15, term670);
        setElement(term742, 17, term670);
        setElement(term742, 19, term670);
        setElement(term742, 21, term670);
        setElement(term742, 23, term670);
        setElement(term742, 25, term670);
        setElement(term742, 27, term670);
        setElement(term742, 29, term670);
        setElement(term742, 31, term670);
        setElement(term742, 33, term670);
        setElement(term742, 35, term670);
        setElement(term742, 37, term670);
        setElement(term742, 39, term670);
        setField(term697, term697.getClass(), "wallOffsets", term742);
        setField(term697, term697.getClass(), "lastRules", term743);
        setField(term744, term744.getClass(), "table", null);
        setField(term744, term744.getClass(), "nextTable", null);
        setLongField(term744, term744.getClass(), "baseCount", 0L);
        setIntField(term744, term744.getClass(), "sizeCtl", 0);
        setIntField(term744, term744.getClass(), "transferIndex", 0);
        setIntField(term744, term744.getClass(), "cellsBusy", 0);
        setField(term744, term744.getClass(), "counterCells", null);
        setField(term744, term744.getClass(), "keySet", null);
        setField(term744, term744.getClass(), "values", null);
        setField(term744, term744.getClass(), "entrySet", null);
        setField(term744, term744.getClass(), "keySet", null);
        setField(term744, term744.getClass(), "values", null);
        setField(term697, term697.getClass(), "lastRulesCache", term744);
        setField(term680, term680.getClass(), "rules", term697);
        setField(term659, term659.getClass(), "zone", term680);
        setField(term526, term526.getClass(), "time_stamp", term659);
        setField(term526, term526.getClass(), "start_up_mode", "IoAlmYsBwc");
        setField(term526, term526.getClass(), "cmm_dly_mod", "TEParAifyi");
        setField(term526, term526.getClass(), "cmm_dly_sec", "OWDIEULEFu");
        setField(term526, term526.getClass(), "cmm_err_mod", "dWRymuLBtr");
        setField(term526, term526.getClass(), "country_code", "AijpHYOFuy");
        setField(term526, term526.getClass(), "region_code", "SbAoxhfrkn");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.boot.AttendRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAtnd_prm1", argTypes, term526, args);
    }

};


