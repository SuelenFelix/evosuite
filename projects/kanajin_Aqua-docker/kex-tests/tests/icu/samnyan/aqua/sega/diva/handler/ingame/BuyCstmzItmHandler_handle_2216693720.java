package icu.samnyan.aqua.sega.diva.handler.ingame;

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
import static icu.samnyan.aqua.sega.diva.handler.ingame.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class BuyCstmzItmHandler_handle_2216693720 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1550;

    public BuyCstmzItmHandler_handle_2216693720() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1550 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.ingame.BuyCstmzItmRequest"));
        Object term1640 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term1641 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1642 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1646 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1651 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term1661 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term1678 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term1679 = (long[]) newLongArray(1);
        Object[] term1681 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term1682 = (long[]) newLongArray(39);
        Object[] term1722 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term1723 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term1724 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term1725 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setIntField(term1550, term1550.getClass(), "pd_id", -1801760683);
        setIntField(term1550, term1550.getClass(), "accept_idx", 1141317871);
        setIntField(term1550, term1550.getClass(), "start_idx", 890669485);
        setIntField(term1550, term1550.getClass(), "cstmz_itm_id", 691577392);
        setIntField(term1550, term1550.getClass(), "cstmz_itm_price", -893623680);
        setField(term1550, term1550.getClass(), "cmd", "aKnKipADSo");
        setField(term1550, term1550.getClass(), "req_id", "wSQxaModmm");
        setField(term1550, term1550.getClass(), "game_id", "UlajhuVLaP");
        setField(term1550, term1550.getClass(), "r_ver", "gGSMzuGICf");
        setField(term1550, term1550.getClass(), "kc_serial", "hxCBltsObl");
        setField(term1550, term1550.getClass(), "b_serial", "BndsHwAFMv");
        setField(term1550, term1550.getClass(), "place_id", "GzFkzHGYFt");
        setIntField(term1642, term1642.getClass(), "year", 2015);
        setShortField(term1642, term1642.getClass(), "month", (short) 4);
        setShortField(term1642, term1642.getClass(), "day", (short) 14);
        setField(term1641, term1641.getClass(), "date", term1642);
        setByteField(term1646, term1646.getClass(), "hour", (byte) 18);
        setByteField(term1646, term1646.getClass(), "minute", (byte) 24);
        setByteField(term1646, term1646.getClass(), "second", (byte) 32);
        setIntField(term1646, term1646.getClass(), "nano", 369233818);
        setField(term1641, term1641.getClass(), "time", term1646);
        setField(term1640, term1640.getClass(), "dateTime", term1641);
        setIntField(term1651, term1651.getClass(), "totalSeconds", -10800);
        setField(term1651, term1651.getClass(), "id", "-03:00");
        setField(term1640, term1640.getClass(), "offset", term1651);
        setField(term1661, term1661.getClass(), "id", "America/Recife");
        setLongElement(term1679, 0, -1767217224L);
        setField(term1678, term1678.getClass(), "standardTransitions", term1679);
        setElement(term1681, 1, term1651);
        setField(term1678, term1678.getClass(), "standardOffsets", term1681);
        setLongElement(term1682, 0, -1767217224L);
        setLongElement(term1682, 1, -1206957600L);
        setLongElement(term1682, 2, -1191362400L);
        setLongElement(term1682, 3, -1175374800L);
        setLongElement(term1682, 4, -1159826400L);
        setLongElement(term1682, 5, -633819600L);
        setLongElement(term1682, 6, -622069200L);
        setLongElement(term1682, 7, -602283600L);
        setLongElement(term1682, 8, -591832800L);
        setLongElement(term1682, 9, -570747600L);
        setLongElement(term1682, 10, -560210400L);
        setLongElement(term1682, 11, -539125200L);
        setLongElement(term1682, 12, -531352800L);
        setLongElement(term1682, 13, -191365200L);
        setLongElement(term1682, 14, -184197600L);
        setLongElement(term1682, 15, -155163600L);
        setLongElement(term1682, 16, -150069600L);
        setLongElement(term1682, 17, -128898000L);
        setLongElement(term1682, 18, -121125600L);
        setLongElement(term1682, 19, -99954000L);
        setLongElement(term1682, 20, -89589600L);
        setLongElement(term1682, 21, -68418000L);
        setLongElement(term1682, 22, -57967200L);
        setLongElement(term1682, 23, 499748400L);
        setLongElement(term1682, 24, 511236000L);
        setLongElement(term1682, 25, 530593200L);
        setLongElement(term1682, 26, 540266400L);
        setLongElement(term1682, 27, 562129200L);
        setLongElement(term1682, 28, 571197600L);
        setLongElement(term1682, 29, 592974000L);
        setLongElement(term1682, 30, 602042400L);
        setLongElement(term1682, 31, 624423600L);
        setLongElement(term1682, 32, 634701600L);
        setLongElement(term1682, 33, 938919600L);
        setLongElement(term1682, 34, 951616800L);
        setLongElement(term1682, 35, 970974000L);
        setLongElement(term1682, 36, 971575200L);
        setLongElement(term1682, 37, 1003028400L);
        setLongElement(term1682, 38, 1013911200L);
        setField(term1678, term1678.getClass(), "savingsInstantTransitions", term1682);
        setField(term1678, term1678.getClass(), "savingsLocalTransitions", term1722);
        setElement(term1723, 1, term1651);
        setElement(term1723, 3, term1651);
        setElement(term1723, 5, term1651);
        setElement(term1723, 7, term1651);
        setElement(term1723, 9, term1651);
        setElement(term1723, 11, term1651);
        setElement(term1723, 13, term1651);
        setElement(term1723, 15, term1651);
        setElement(term1723, 17, term1651);
        setElement(term1723, 19, term1651);
        setElement(term1723, 21, term1651);
        setElement(term1723, 23, term1651);
        setElement(term1723, 25, term1651);
        setElement(term1723, 27, term1651);
        setElement(term1723, 29, term1651);
        setElement(term1723, 31, term1651);
        setElement(term1723, 33, term1651);
        setElement(term1723, 35, term1651);
        setElement(term1723, 37, term1651);
        setElement(term1723, 39, term1651);
        setField(term1678, term1678.getClass(), "wallOffsets", term1723);
        setField(term1678, term1678.getClass(), "lastRules", term1724);
        setField(term1725, term1725.getClass(), "table", null);
        setField(term1725, term1725.getClass(), "nextTable", null);
        setLongField(term1725, term1725.getClass(), "baseCount", 0L);
        setIntField(term1725, term1725.getClass(), "sizeCtl", 0);
        setIntField(term1725, term1725.getClass(), "transferIndex", 0);
        setIntField(term1725, term1725.getClass(), "cellsBusy", 0);
        setField(term1725, term1725.getClass(), "counterCells", null);
        setField(term1725, term1725.getClass(), "keySet", null);
        setField(term1725, term1725.getClass(), "values", null);
        setField(term1725, term1725.getClass(), "entrySet", null);
        setField(term1725, term1725.getClass(), "keySet", null);
        setField(term1725, term1725.getClass(), "values", null);
        setField(term1678, term1678.getClass(), "lastRulesCache", term1725);
        setField(term1661, term1661.getClass(), "rules", term1678);
        setField(term1640, term1640.getClass(), "zone", term1661);
        setField(term1550, term1550.getClass(), "time_stamp", term1640);
        setField(term1550, term1550.getClass(), "start_up_mode", "tShwQLRGNe");
        setField(term1550, term1550.getClass(), "cmm_dly_mod", "LvtrsXUliU");
        setField(term1550, term1550.getClass(), "cmm_dly_sec", "xLbjWUgOIL");
        setField(term1550, term1550.getClass(), "cmm_err_mod", "jDtqGUpnZN");
        setField(term1550, term1550.getClass(), "country_code", "nGKItKLYNC");
        setField(term1550, term1550.getClass(), "region_code", "UiUYnPrcCi");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.handler.ingame.BuyCstmzItmHandler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.diva.model.request.ingame.BuyCstmzItmRequest");
        Object[] args = new Object[1];
        args[0] = term1550;
        callMethod(klass, "handle", argTypes, null, args);
    }

};


