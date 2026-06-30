package icu.samnyan.aqua.sega.diva.model.request.user;

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
import static icu.samnyan.aqua.sega.diva.model.request.user.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class SpendCreditRequest_getCrdttyp_920195073 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1430;

    public SpendCreditRequest_getCrdttyp_920195073() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1430 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.user.SpendCreditRequest"));
        int[] term1432 = (int[]) newIntArray(5);
        int[] term1438 = (int[]) newIntArray(2);
        int[] term1442 = (int[]) newIntArray(3);
        int[] term1446 = (int[]) newIntArray(1);
        Object term1532 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term1533 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1534 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1538 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1543 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term1553 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term1570 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term1571 = (long[]) newLongArray(1);
        Object[] term1573 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term1574 = (long[]) newLongArray(39);
        Object[] term1614 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term1615 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term1616 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term1617 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setIntField(term1430, term1430.getClass(), "pd_id", 458147407);
        setIntElement(term1432, 0, -184153539);
        setIntElement(term1432, 1, 493620644);
        setIntElement(term1432, 2, 1328271830);
        setIntElement(term1432, 3, 1596070772);
        setIntElement(term1432, 4, 97029295);
        setField(term1430, term1430.getClass(), "my_qst_id", term1432);
        setIntElement(term1438, 0, -1371869594);
        setIntElement(term1438, 1, -2095575670);
        setField(term1430, term1430.getClass(), "my_qst_sts", term1438);
        setIntField(term1430, term1430.getClass(), "crdt_typ", 1225272962);
        setIntElement(term1442, 0, 1324040357);
        setIntElement(term1442, 1, -1588772968);
        setIntElement(term1442, 2, -93135961);
        setField(term1430, term1430.getClass(), "cmpgn_id", term1442);
        setIntElement(term1446, 0, -112921587);
        setField(term1430, term1430.getClass(), "cmpgn_pb", term1446);
        setField(term1430, term1430.getClass(), "cmd", "aKnKipADSo");
        setField(term1430, term1430.getClass(), "req_id", "wSQxaModmm");
        setField(term1430, term1430.getClass(), "game_id", "UlajhuVLaP");
        setField(term1430, term1430.getClass(), "r_ver", "gGSMzuGICf");
        setField(term1430, term1430.getClass(), "kc_serial", "hxCBltsObl");
        setField(term1430, term1430.getClass(), "b_serial", "BndsHwAFMv");
        setField(term1430, term1430.getClass(), "place_id", "GzFkzHGYFt");
        setIntField(term1534, term1534.getClass(), "year", 2015);
        setShortField(term1534, term1534.getClass(), "month", (short) 4);
        setShortField(term1534, term1534.getClass(), "day", (short) 14);
        setField(term1533, term1533.getClass(), "date", term1534);
        setByteField(term1538, term1538.getClass(), "hour", (byte) 18);
        setByteField(term1538, term1538.getClass(), "minute", (byte) 24);
        setByteField(term1538, term1538.getClass(), "second", (byte) 32);
        setIntField(term1538, term1538.getClass(), "nano", 369233818);
        setField(term1533, term1533.getClass(), "time", term1538);
        setField(term1532, term1532.getClass(), "dateTime", term1533);
        setIntField(term1543, term1543.getClass(), "totalSeconds", -10800);
        setField(term1543, term1543.getClass(), "id", "-03:00");
        setField(term1532, term1532.getClass(), "offset", term1543);
        setField(term1553, term1553.getClass(), "id", "America/Recife");
        setLongElement(term1571, 0, -1767217224L);
        setField(term1570, term1570.getClass(), "standardTransitions", term1571);
        setElement(term1573, 1, term1543);
        setField(term1570, term1570.getClass(), "standardOffsets", term1573);
        setLongElement(term1574, 0, -1767217224L);
        setLongElement(term1574, 1, -1206957600L);
        setLongElement(term1574, 2, -1191362400L);
        setLongElement(term1574, 3, -1175374800L);
        setLongElement(term1574, 4, -1159826400L);
        setLongElement(term1574, 5, -633819600L);
        setLongElement(term1574, 6, -622069200L);
        setLongElement(term1574, 7, -602283600L);
        setLongElement(term1574, 8, -591832800L);
        setLongElement(term1574, 9, -570747600L);
        setLongElement(term1574, 10, -560210400L);
        setLongElement(term1574, 11, -539125200L);
        setLongElement(term1574, 12, -531352800L);
        setLongElement(term1574, 13, -191365200L);
        setLongElement(term1574, 14, -184197600L);
        setLongElement(term1574, 15, -155163600L);
        setLongElement(term1574, 16, -150069600L);
        setLongElement(term1574, 17, -128898000L);
        setLongElement(term1574, 18, -121125600L);
        setLongElement(term1574, 19, -99954000L);
        setLongElement(term1574, 20, -89589600L);
        setLongElement(term1574, 21, -68418000L);
        setLongElement(term1574, 22, -57967200L);
        setLongElement(term1574, 23, 499748400L);
        setLongElement(term1574, 24, 511236000L);
        setLongElement(term1574, 25, 530593200L);
        setLongElement(term1574, 26, 540266400L);
        setLongElement(term1574, 27, 562129200L);
        setLongElement(term1574, 28, 571197600L);
        setLongElement(term1574, 29, 592974000L);
        setLongElement(term1574, 30, 602042400L);
        setLongElement(term1574, 31, 624423600L);
        setLongElement(term1574, 32, 634701600L);
        setLongElement(term1574, 33, 938919600L);
        setLongElement(term1574, 34, 951616800L);
        setLongElement(term1574, 35, 970974000L);
        setLongElement(term1574, 36, 971575200L);
        setLongElement(term1574, 37, 1003028400L);
        setLongElement(term1574, 38, 1013911200L);
        setField(term1570, term1570.getClass(), "savingsInstantTransitions", term1574);
        setField(term1570, term1570.getClass(), "savingsLocalTransitions", term1614);
        setElement(term1615, 1, term1543);
        setElement(term1615, 3, term1543);
        setElement(term1615, 5, term1543);
        setElement(term1615, 7, term1543);
        setElement(term1615, 9, term1543);
        setElement(term1615, 11, term1543);
        setElement(term1615, 13, term1543);
        setElement(term1615, 15, term1543);
        setElement(term1615, 17, term1543);
        setElement(term1615, 19, term1543);
        setElement(term1615, 21, term1543);
        setElement(term1615, 23, term1543);
        setElement(term1615, 25, term1543);
        setElement(term1615, 27, term1543);
        setElement(term1615, 29, term1543);
        setElement(term1615, 31, term1543);
        setElement(term1615, 33, term1543);
        setElement(term1615, 35, term1543);
        setElement(term1615, 37, term1543);
        setElement(term1615, 39, term1543);
        setField(term1570, term1570.getClass(), "wallOffsets", term1615);
        setField(term1570, term1570.getClass(), "lastRules", term1616);
        setField(term1617, term1617.getClass(), "table", null);
        setField(term1617, term1617.getClass(), "nextTable", null);
        setLongField(term1617, term1617.getClass(), "baseCount", 0L);
        setIntField(term1617, term1617.getClass(), "sizeCtl", 0);
        setIntField(term1617, term1617.getClass(), "transferIndex", 0);
        setIntField(term1617, term1617.getClass(), "cellsBusy", 0);
        setField(term1617, term1617.getClass(), "counterCells", null);
        setField(term1617, term1617.getClass(), "keySet", null);
        setField(term1617, term1617.getClass(), "values", null);
        setField(term1617, term1617.getClass(), "entrySet", null);
        setField(term1617, term1617.getClass(), "keySet", null);
        setField(term1617, term1617.getClass(), "values", null);
        setField(term1570, term1570.getClass(), "lastRulesCache", term1617);
        setField(term1553, term1553.getClass(), "rules", term1570);
        setField(term1532, term1532.getClass(), "zone", term1553);
        setField(term1430, term1430.getClass(), "time_stamp", term1532);
        setField(term1430, term1430.getClass(), "start_up_mode", "tShwQLRGNe");
        setField(term1430, term1430.getClass(), "cmm_dly_mod", "LvtrsXUliU");
        setField(term1430, term1430.getClass(), "cmm_dly_sec", "xLbjWUgOIL");
        setField(term1430, term1430.getClass(), "cmm_err_mod", "jDtqGUpnZN");
        setField(term1430, term1430.getClass(), "country_code", "nGKItKLYNC");
        setField(term1430, term1430.getClass(), "region_code", "UiUYnPrcCi");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.user.SpendCreditRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCrdt_typ", argTypes, term1430, args);
    }

};


