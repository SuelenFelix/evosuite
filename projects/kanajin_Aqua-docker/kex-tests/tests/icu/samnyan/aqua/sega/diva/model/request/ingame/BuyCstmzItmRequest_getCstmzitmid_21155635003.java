package icu.samnyan.aqua.sega.diva.model.request.ingame;

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
import static icu.samnyan.aqua.sega.diva.model.request.ingame.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class BuyCstmzItmRequest_getCstmzitmid_21155635003 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term274443;

    public BuyCstmzItmRequest_getCstmzitmid_21155635003() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term274443 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.ingame.BuyCstmzItmRequest"));
        Object term274533 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term274534 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term274535 = newInstance(Class.forName("java.time.LocalDate"));
        Object term274539 = newInstance(Class.forName("java.time.LocalTime"));
        Object term274544 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term274554 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term274571 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term274572 = (long[]) newLongArray(1);
        Object[] term274574 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term274575 = (long[]) newLongArray(39);
        Object[] term274615 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term274616 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term274617 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term274618 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setIntField(term274443, term274443.getClass(), "pd_id", 1125229447);
        setIntField(term274443, term274443.getClass(), "accept_idx", -1034989151);
        setIntField(term274443, term274443.getClass(), "start_idx", -125859746);
        setIntField(term274443, term274443.getClass(), "cstmz_itm_id", 1727746558);
        setIntField(term274443, term274443.getClass(), "cstmz_itm_price", 1394068184);
        setField(term274443, term274443.getClass(), "cmd", "coNhvymEkq");
        setField(term274443, term274443.getClass(), "req_id", "dMuXJftgrw");
        setField(term274443, term274443.getClass(), "game_id", "INNyzaqXFS");
        setField(term274443, term274443.getClass(), "r_ver", "GdZWpscDov");
        setField(term274443, term274443.getClass(), "kc_serial", "RzzlJFJcij");
        setField(term274443, term274443.getClass(), "b_serial", "eADknKlQVd");
        setField(term274443, term274443.getClass(), "place_id", "hfwLnDHizJ");
        setIntField(term274535, term274535.getClass(), "year", 2024);
        setShortField(term274535, term274535.getClass(), "month", (short) 3);
        setShortField(term274535, term274535.getClass(), "day", (short) 19);
        setField(term274534, term274534.getClass(), "date", term274535);
        setByteField(term274539, term274539.getClass(), "hour", (byte) 16);
        setByteField(term274539, term274539.getClass(), "minute", (byte) 8);
        setByteField(term274539, term274539.getClass(), "second", (byte) 55);
        setIntField(term274539, term274539.getClass(), "nano", 955822950);
        setField(term274534, term274534.getClass(), "time", term274539);
        setField(term274533, term274533.getClass(), "dateTime", term274534);
        setIntField(term274544, term274544.getClass(), "totalSeconds", -10800);
        setField(term274544, term274544.getClass(), "id", "-03:00");
        setField(term274533, term274533.getClass(), "offset", term274544);
        setField(term274554, term274554.getClass(), "id", "America/Recife");
        setLongElement(term274572, 0, -1767217224L);
        setField(term274571, term274571.getClass(), "standardTransitions", term274572);
        setElement(term274574, 1, term274544);
        setField(term274571, term274571.getClass(), "standardOffsets", term274574);
        setLongElement(term274575, 0, -1767217224L);
        setLongElement(term274575, 1, -1206957600L);
        setLongElement(term274575, 2, -1191362400L);
        setLongElement(term274575, 3, -1175374800L);
        setLongElement(term274575, 4, -1159826400L);
        setLongElement(term274575, 5, -633819600L);
        setLongElement(term274575, 6, -622069200L);
        setLongElement(term274575, 7, -602283600L);
        setLongElement(term274575, 8, -591832800L);
        setLongElement(term274575, 9, -570747600L);
        setLongElement(term274575, 10, -560210400L);
        setLongElement(term274575, 11, -539125200L);
        setLongElement(term274575, 12, -531352800L);
        setLongElement(term274575, 13, -191365200L);
        setLongElement(term274575, 14, -184197600L);
        setLongElement(term274575, 15, -155163600L);
        setLongElement(term274575, 16, -150069600L);
        setLongElement(term274575, 17, -128898000L);
        setLongElement(term274575, 18, -121125600L);
        setLongElement(term274575, 19, -99954000L);
        setLongElement(term274575, 20, -89589600L);
        setLongElement(term274575, 21, -68418000L);
        setLongElement(term274575, 22, -57967200L);
        setLongElement(term274575, 23, 499748400L);
        setLongElement(term274575, 24, 511236000L);
        setLongElement(term274575, 25, 530593200L);
        setLongElement(term274575, 26, 540266400L);
        setLongElement(term274575, 27, 562129200L);
        setLongElement(term274575, 28, 571197600L);
        setLongElement(term274575, 29, 592974000L);
        setLongElement(term274575, 30, 602042400L);
        setLongElement(term274575, 31, 624423600L);
        setLongElement(term274575, 32, 634701600L);
        setLongElement(term274575, 33, 938919600L);
        setLongElement(term274575, 34, 951616800L);
        setLongElement(term274575, 35, 970974000L);
        setLongElement(term274575, 36, 971575200L);
        setLongElement(term274575, 37, 1003028400L);
        setLongElement(term274575, 38, 1013911200L);
        setField(term274571, term274571.getClass(), "savingsInstantTransitions", term274575);
        setField(term274571, term274571.getClass(), "savingsLocalTransitions", term274615);
        setElement(term274616, 1, term274544);
        setElement(term274616, 3, term274544);
        setElement(term274616, 5, term274544);
        setElement(term274616, 7, term274544);
        setElement(term274616, 9, term274544);
        setElement(term274616, 11, term274544);
        setElement(term274616, 13, term274544);
        setElement(term274616, 15, term274544);
        setElement(term274616, 17, term274544);
        setElement(term274616, 19, term274544);
        setElement(term274616, 21, term274544);
        setElement(term274616, 23, term274544);
        setElement(term274616, 25, term274544);
        setElement(term274616, 27, term274544);
        setElement(term274616, 29, term274544);
        setElement(term274616, 31, term274544);
        setElement(term274616, 33, term274544);
        setElement(term274616, 35, term274544);
        setElement(term274616, 37, term274544);
        setElement(term274616, 39, term274544);
        setField(term274571, term274571.getClass(), "wallOffsets", term274616);
        setField(term274571, term274571.getClass(), "lastRules", term274617);
        setField(term274618, term274618.getClass(), "table", null);
        setField(term274618, term274618.getClass(), "nextTable", null);
        setLongField(term274618, term274618.getClass(), "baseCount", 0L);
        setIntField(term274618, term274618.getClass(), "sizeCtl", 0);
        setIntField(term274618, term274618.getClass(), "transferIndex", 0);
        setIntField(term274618, term274618.getClass(), "cellsBusy", 0);
        setField(term274618, term274618.getClass(), "counterCells", null);
        setField(term274618, term274618.getClass(), "keySet", null);
        setField(term274618, term274618.getClass(), "values", null);
        setField(term274618, term274618.getClass(), "entrySet", null);
        setField(term274618, term274618.getClass(), "keySet", null);
        setField(term274618, term274618.getClass(), "values", null);
        setField(term274571, term274571.getClass(), "lastRulesCache", term274618);
        setField(term274554, term274554.getClass(), "rules", term274571);
        setField(term274533, term274533.getClass(), "zone", term274554);
        setField(term274443, term274443.getClass(), "time_stamp", term274533);
        setField(term274443, term274443.getClass(), "start_up_mode", "eZGPUdohTF");
        setField(term274443, term274443.getClass(), "cmm_dly_mod", "NyINyLwoLC");
        setField(term274443, term274443.getClass(), "cmm_dly_sec", "VdHJiosxsv");
        setField(term274443, term274443.getClass(), "cmm_err_mod", "wOuPdBQeOx");
        setField(term274443, term274443.getClass(), "country_code", "qKKlbLWTDU");
        setField(term274443, term274443.getClass(), "region_code", "vtiTWIgEVa");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.ingame.BuyCstmzItmRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCstmz_itm_id", argTypes, term274443, args);
    }

};


