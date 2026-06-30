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
import java.lang.Integer;

public class StartRequest_setPdid_15226652652 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8517;
     Object term8766;

    public StartRequest_setPdid_15226652652() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8517 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.user.StartRequest"));
        Object term8604 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term8605 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8606 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8610 = newInstance(Class.forName("java.time.LocalTime"));
        Object term8615 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term8625 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term8642 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term8643 = (long[]) newLongArray(1);
        Object[] term8645 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term8646 = (long[]) newLongArray(39);
        Object[] term8686 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term8687 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term8688 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term8689 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setIntField(term8517, term8517.getClass(), "pd_id", -519881101);
        setIntField(term8517, term8517.getClass(), "accept_idx", -680920524);
        setField(term8517, term8517.getClass(), "cmd", "OcJCIDNIXA");
        setField(term8517, term8517.getClass(), "req_id", "XfRABIFVEp");
        setField(term8517, term8517.getClass(), "game_id", "MHGKyEnwKc");
        setField(term8517, term8517.getClass(), "r_ver", "ShIELyuULw");
        setField(term8517, term8517.getClass(), "kc_serial", "IpQuOGMgmj");
        setField(term8517, term8517.getClass(), "b_serial", "pJbnHTYrxn");
        setField(term8517, term8517.getClass(), "place_id", "iIRsCSYqXH");
        setIntField(term8606, term8606.getClass(), "year", 2017);
        setShortField(term8606, term8606.getClass(), "month", (short) 3);
        setShortField(term8606, term8606.getClass(), "day", (short) 5);
        setField(term8605, term8605.getClass(), "date", term8606);
        setByteField(term8610, term8610.getClass(), "hour", (byte) 20);
        setByteField(term8610, term8610.getClass(), "minute", (byte) 34);
        setByteField(term8610, term8610.getClass(), "second", (byte) 55);
        setIntField(term8610, term8610.getClass(), "nano", 78024496);
        setField(term8605, term8605.getClass(), "time", term8610);
        setField(term8604, term8604.getClass(), "dateTime", term8605);
        setIntField(term8615, term8615.getClass(), "totalSeconds", -10800);
        setField(term8615, term8615.getClass(), "id", "-03:00");
        setField(term8604, term8604.getClass(), "offset", term8615);
        setField(term8625, term8625.getClass(), "id", "America/Recife");
        setLongElement(term8643, 0, -1767217224L);
        setField(term8642, term8642.getClass(), "standardTransitions", term8643);
        setElement(term8645, 1, term8615);
        setField(term8642, term8642.getClass(), "standardOffsets", term8645);
        setLongElement(term8646, 0, -1767217224L);
        setLongElement(term8646, 1, -1206957600L);
        setLongElement(term8646, 2, -1191362400L);
        setLongElement(term8646, 3, -1175374800L);
        setLongElement(term8646, 4, -1159826400L);
        setLongElement(term8646, 5, -633819600L);
        setLongElement(term8646, 6, -622069200L);
        setLongElement(term8646, 7, -602283600L);
        setLongElement(term8646, 8, -591832800L);
        setLongElement(term8646, 9, -570747600L);
        setLongElement(term8646, 10, -560210400L);
        setLongElement(term8646, 11, -539125200L);
        setLongElement(term8646, 12, -531352800L);
        setLongElement(term8646, 13, -191365200L);
        setLongElement(term8646, 14, -184197600L);
        setLongElement(term8646, 15, -155163600L);
        setLongElement(term8646, 16, -150069600L);
        setLongElement(term8646, 17, -128898000L);
        setLongElement(term8646, 18, -121125600L);
        setLongElement(term8646, 19, -99954000L);
        setLongElement(term8646, 20, -89589600L);
        setLongElement(term8646, 21, -68418000L);
        setLongElement(term8646, 22, -57967200L);
        setLongElement(term8646, 23, 499748400L);
        setLongElement(term8646, 24, 511236000L);
        setLongElement(term8646, 25, 530593200L);
        setLongElement(term8646, 26, 540266400L);
        setLongElement(term8646, 27, 562129200L);
        setLongElement(term8646, 28, 571197600L);
        setLongElement(term8646, 29, 592974000L);
        setLongElement(term8646, 30, 602042400L);
        setLongElement(term8646, 31, 624423600L);
        setLongElement(term8646, 32, 634701600L);
        setLongElement(term8646, 33, 938919600L);
        setLongElement(term8646, 34, 951616800L);
        setLongElement(term8646, 35, 970974000L);
        setLongElement(term8646, 36, 971575200L);
        setLongElement(term8646, 37, 1003028400L);
        setLongElement(term8646, 38, 1013911200L);
        setField(term8642, term8642.getClass(), "savingsInstantTransitions", term8646);
        setField(term8642, term8642.getClass(), "savingsLocalTransitions", term8686);
        setElement(term8687, 1, term8615);
        setElement(term8687, 3, term8615);
        setElement(term8687, 5, term8615);
        setElement(term8687, 7, term8615);
        setElement(term8687, 9, term8615);
        setElement(term8687, 11, term8615);
        setElement(term8687, 13, term8615);
        setElement(term8687, 15, term8615);
        setElement(term8687, 17, term8615);
        setElement(term8687, 19, term8615);
        setElement(term8687, 21, term8615);
        setElement(term8687, 23, term8615);
        setElement(term8687, 25, term8615);
        setElement(term8687, 27, term8615);
        setElement(term8687, 29, term8615);
        setElement(term8687, 31, term8615);
        setElement(term8687, 33, term8615);
        setElement(term8687, 35, term8615);
        setElement(term8687, 37, term8615);
        setElement(term8687, 39, term8615);
        setField(term8642, term8642.getClass(), "wallOffsets", term8687);
        setField(term8642, term8642.getClass(), "lastRules", term8688);
        setField(term8689, term8689.getClass(), "table", null);
        setField(term8689, term8689.getClass(), "nextTable", null);
        setLongField(term8689, term8689.getClass(), "baseCount", 0L);
        setIntField(term8689, term8689.getClass(), "sizeCtl", 0);
        setIntField(term8689, term8689.getClass(), "transferIndex", 0);
        setIntField(term8689, term8689.getClass(), "cellsBusy", 0);
        setField(term8689, term8689.getClass(), "counterCells", null);
        setField(term8689, term8689.getClass(), "keySet", null);
        setField(term8689, term8689.getClass(), "values", null);
        setField(term8689, term8689.getClass(), "entrySet", null);
        setField(term8689, term8689.getClass(), "keySet", null);
        setField(term8689, term8689.getClass(), "values", null);
        setField(term8642, term8642.getClass(), "lastRulesCache", term8689);
        setField(term8625, term8625.getClass(), "rules", term8642);
        setField(term8604, term8604.getClass(), "zone", term8625);
        setField(term8517, term8517.getClass(), "time_stamp", term8604);
        setField(term8517, term8517.getClass(), "start_up_mode", "nghfqDXyCG");
        setField(term8517, term8517.getClass(), "cmm_dly_mod", "WBAOTqErtm");
        setField(term8517, term8517.getClass(), "cmm_dly_sec", "PqtVXXZMqK");
        setField(term8517, term8517.getClass(), "cmm_err_mod", "rYbtIDVdnd");
        setField(term8517, term8517.getClass(), "country_code", "UKAReurpHG");
        setField(term8517, term8517.getClass(), "region_code", "WVRMUmrljA");
        term8766 = new Integer(-916335264);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.user.StartRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term8766;
        callMethod(klass, "setPd_id", argTypes, term8517, args);
    }

};


