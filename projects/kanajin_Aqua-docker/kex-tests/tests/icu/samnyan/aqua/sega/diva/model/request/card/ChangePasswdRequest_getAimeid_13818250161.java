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

public class ChangePasswdRequest_getAimeid_13818250161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term507;

    public ChangePasswdRequest_getAimeid_13818250161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term507 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.ChangePasswdRequest"));
        Object term631 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term632 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term633 = newInstance(Class.forName("java.time.LocalDate"));
        Object term637 = newInstance(Class.forName("java.time.LocalTime"));
        Object term642 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term652 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term669 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term670 = (long[]) newLongArray(1);
        Object[] term672 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term673 = (long[]) newLongArray(39);
        Object[] term713 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term714 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term715 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term716 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term507, term507.getClass(), "a_code", "ZiaGIbnzTs");
        setIntField(term507, term507.getClass(), "aime_id", 391863371);
        setField(term507, term507.getClass(), "aime_a_code", "tbcdzjIfER");
        setIntField(term507, term507.getClass(), "pd_id", -1922583790);
        setIntField(term507, term507.getClass(), "accept_idx", -616727354);
        setField(term507, term507.getClass(), "new_passwd", "HyxfbSQYBe");
        setField(term507, term507.getClass(), "cmd", "pCTimMblYc");
        setField(term507, term507.getClass(), "req_id", "hNxWaHcfhY");
        setField(term507, term507.getClass(), "game_id", "RkybSrpybU");
        setField(term507, term507.getClass(), "r_ver", "xOEqzGAmDU");
        setField(term507, term507.getClass(), "kc_serial", "eZFUvlxvGV");
        setField(term507, term507.getClass(), "b_serial", "BYqFIqCKAV");
        setField(term507, term507.getClass(), "place_id", "vrQLuWIDJX");
        setIntField(term633, term633.getClass(), "year", 2021);
        setShortField(term633, term633.getClass(), "month", (short) 1);
        setShortField(term633, term633.getClass(), "day", (short) 18);
        setField(term632, term632.getClass(), "date", term633);
        setByteField(term637, term637.getClass(), "hour", (byte) 13);
        setByteField(term637, term637.getClass(), "minute", (byte) 38);
        setByteField(term637, term637.getClass(), "second", (byte) 26);
        setIntField(term637, term637.getClass(), "nano", 544608644);
        setField(term632, term632.getClass(), "time", term637);
        setField(term631, term631.getClass(), "dateTime", term632);
        setIntField(term642, term642.getClass(), "totalSeconds", -10800);
        setField(term642, term642.getClass(), "id", "-03:00");
        setField(term631, term631.getClass(), "offset", term642);
        setField(term652, term652.getClass(), "id", "America/Recife");
        setLongElement(term670, 0, -1767217224L);
        setField(term669, term669.getClass(), "standardTransitions", term670);
        setElement(term672, 1, term642);
        setField(term669, term669.getClass(), "standardOffsets", term672);
        setLongElement(term673, 0, -1767217224L);
        setLongElement(term673, 1, -1206957600L);
        setLongElement(term673, 2, -1191362400L);
        setLongElement(term673, 3, -1175374800L);
        setLongElement(term673, 4, -1159826400L);
        setLongElement(term673, 5, -633819600L);
        setLongElement(term673, 6, -622069200L);
        setLongElement(term673, 7, -602283600L);
        setLongElement(term673, 8, -591832800L);
        setLongElement(term673, 9, -570747600L);
        setLongElement(term673, 10, -560210400L);
        setLongElement(term673, 11, -539125200L);
        setLongElement(term673, 12, -531352800L);
        setLongElement(term673, 13, -191365200L);
        setLongElement(term673, 14, -184197600L);
        setLongElement(term673, 15, -155163600L);
        setLongElement(term673, 16, -150069600L);
        setLongElement(term673, 17, -128898000L);
        setLongElement(term673, 18, -121125600L);
        setLongElement(term673, 19, -99954000L);
        setLongElement(term673, 20, -89589600L);
        setLongElement(term673, 21, -68418000L);
        setLongElement(term673, 22, -57967200L);
        setLongElement(term673, 23, 499748400L);
        setLongElement(term673, 24, 511236000L);
        setLongElement(term673, 25, 530593200L);
        setLongElement(term673, 26, 540266400L);
        setLongElement(term673, 27, 562129200L);
        setLongElement(term673, 28, 571197600L);
        setLongElement(term673, 29, 592974000L);
        setLongElement(term673, 30, 602042400L);
        setLongElement(term673, 31, 624423600L);
        setLongElement(term673, 32, 634701600L);
        setLongElement(term673, 33, 938919600L);
        setLongElement(term673, 34, 951616800L);
        setLongElement(term673, 35, 970974000L);
        setLongElement(term673, 36, 971575200L);
        setLongElement(term673, 37, 1003028400L);
        setLongElement(term673, 38, 1013911200L);
        setField(term669, term669.getClass(), "savingsInstantTransitions", term673);
        setField(term669, term669.getClass(), "savingsLocalTransitions", term713);
        setElement(term714, 1, term642);
        setElement(term714, 3, term642);
        setElement(term714, 5, term642);
        setElement(term714, 7, term642);
        setElement(term714, 9, term642);
        setElement(term714, 11, term642);
        setElement(term714, 13, term642);
        setElement(term714, 15, term642);
        setElement(term714, 17, term642);
        setElement(term714, 19, term642);
        setElement(term714, 21, term642);
        setElement(term714, 23, term642);
        setElement(term714, 25, term642);
        setElement(term714, 27, term642);
        setElement(term714, 29, term642);
        setElement(term714, 31, term642);
        setElement(term714, 33, term642);
        setElement(term714, 35, term642);
        setElement(term714, 37, term642);
        setElement(term714, 39, term642);
        setField(term669, term669.getClass(), "wallOffsets", term714);
        setField(term669, term669.getClass(), "lastRules", term715);
        setField(term716, term716.getClass(), "table", null);
        setField(term716, term716.getClass(), "nextTable", null);
        setLongField(term716, term716.getClass(), "baseCount", 0L);
        setIntField(term716, term716.getClass(), "sizeCtl", 0);
        setIntField(term716, term716.getClass(), "transferIndex", 0);
        setIntField(term716, term716.getClass(), "cellsBusy", 0);
        setField(term716, term716.getClass(), "counterCells", null);
        setField(term716, term716.getClass(), "keySet", null);
        setField(term716, term716.getClass(), "values", null);
        setField(term716, term716.getClass(), "entrySet", null);
        setField(term716, term716.getClass(), "keySet", null);
        setField(term716, term716.getClass(), "values", null);
        setField(term669, term669.getClass(), "lastRulesCache", term716);
        setField(term652, term652.getClass(), "rules", term669);
        setField(term631, term631.getClass(), "zone", term652);
        setField(term507, term507.getClass(), "time_stamp", term631);
        setField(term507, term507.getClass(), "start_up_mode", "flxyYxBRtu");
        setField(term507, term507.getClass(), "cmm_dly_mod", "OclPbYPkcH");
        setField(term507, term507.getClass(), "cmm_dly_sec", "IoAlmYsBwc");
        setField(term507, term507.getClass(), "cmm_err_mod", "TEParAifyi");
        setField(term507, term507.getClass(), "country_code", "OWDIEULEFu");
        setField(term507, term507.getClass(), "region_code", "dWRymuLBtr");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.ChangePasswdRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAime_id", argTypes, term507, args);
    }

};


