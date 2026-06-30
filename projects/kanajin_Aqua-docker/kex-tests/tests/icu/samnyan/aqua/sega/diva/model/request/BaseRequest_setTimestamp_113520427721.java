package icu.samnyan.aqua.sega.diva.model.request;

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
import static icu.samnyan.aqua.sega.diva.model.request.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class BaseRequest_setTimestamp_113520427721 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term257682;
     Object term257929;

    public BaseRequest_setTimestamp_113520427721() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term257682 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.BaseRequest"));
        Object term257767 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term257768 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term257769 = newInstance(Class.forName("java.time.LocalDate"));
        Object term257773 = newInstance(Class.forName("java.time.LocalTime"));
        Object term257778 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term257788 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term257805 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term257806 = (long[]) newLongArray(1);
        Object[] term257808 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term257809 = (long[]) newLongArray(39);
        Object[] term257849 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term257850 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term257851 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term257852 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term257682, term257682.getClass(), "cmd", "ZyTXwKjtvO");
        setField(term257682, term257682.getClass(), "req_id", "mrIomiQpXW");
        setField(term257682, term257682.getClass(), "game_id", "mDIAdszXHc");
        setField(term257682, term257682.getClass(), "r_ver", "GYljRejWKI");
        setField(term257682, term257682.getClass(), "kc_serial", "AwXWFyuuXB");
        setField(term257682, term257682.getClass(), "b_serial", "hHUEukVMwn");
        setField(term257682, term257682.getClass(), "place_id", "yvAOmWOExs");
        setIntField(term257769, term257769.getClass(), "year", 2011);
        setShortField(term257769, term257769.getClass(), "month", (short) 8);
        setShortField(term257769, term257769.getClass(), "day", (short) 29);
        setField(term257768, term257768.getClass(), "date", term257769);
        setByteField(term257773, term257773.getClass(), "hour", (byte) 10);
        setByteField(term257773, term257773.getClass(), "minute", (byte) 15);
        setByteField(term257773, term257773.getClass(), "second", (byte) 18);
        setIntField(term257773, term257773.getClass(), "nano", 171360352);
        setField(term257768, term257768.getClass(), "time", term257773);
        setField(term257767, term257767.getClass(), "dateTime", term257768);
        setIntField(term257778, term257778.getClass(), "totalSeconds", -10800);
        setField(term257778, term257778.getClass(), "id", "-03:00");
        setField(term257767, term257767.getClass(), "offset", term257778);
        setField(term257788, term257788.getClass(), "id", "America/Recife");
        setLongElement(term257806, 0, -1767217224L);
        setField(term257805, term257805.getClass(), "standardTransitions", term257806);
        setElement(term257808, 1, term257778);
        setField(term257805, term257805.getClass(), "standardOffsets", term257808);
        setLongElement(term257809, 0, -1767217224L);
        setLongElement(term257809, 1, -1206957600L);
        setLongElement(term257809, 2, -1191362400L);
        setLongElement(term257809, 3, -1175374800L);
        setLongElement(term257809, 4, -1159826400L);
        setLongElement(term257809, 5, -633819600L);
        setLongElement(term257809, 6, -622069200L);
        setLongElement(term257809, 7, -602283600L);
        setLongElement(term257809, 8, -591832800L);
        setLongElement(term257809, 9, -570747600L);
        setLongElement(term257809, 10, -560210400L);
        setLongElement(term257809, 11, -539125200L);
        setLongElement(term257809, 12, -531352800L);
        setLongElement(term257809, 13, -191365200L);
        setLongElement(term257809, 14, -184197600L);
        setLongElement(term257809, 15, -155163600L);
        setLongElement(term257809, 16, -150069600L);
        setLongElement(term257809, 17, -128898000L);
        setLongElement(term257809, 18, -121125600L);
        setLongElement(term257809, 19, -99954000L);
        setLongElement(term257809, 20, -89589600L);
        setLongElement(term257809, 21, -68418000L);
        setLongElement(term257809, 22, -57967200L);
        setLongElement(term257809, 23, 499748400L);
        setLongElement(term257809, 24, 511236000L);
        setLongElement(term257809, 25, 530593200L);
        setLongElement(term257809, 26, 540266400L);
        setLongElement(term257809, 27, 562129200L);
        setLongElement(term257809, 28, 571197600L);
        setLongElement(term257809, 29, 592974000L);
        setLongElement(term257809, 30, 602042400L);
        setLongElement(term257809, 31, 624423600L);
        setLongElement(term257809, 32, 634701600L);
        setLongElement(term257809, 33, 938919600L);
        setLongElement(term257809, 34, 951616800L);
        setLongElement(term257809, 35, 970974000L);
        setLongElement(term257809, 36, 971575200L);
        setLongElement(term257809, 37, 1003028400L);
        setLongElement(term257809, 38, 1013911200L);
        setField(term257805, term257805.getClass(), "savingsInstantTransitions", term257809);
        setField(term257805, term257805.getClass(), "savingsLocalTransitions", term257849);
        setElement(term257850, 1, term257778);
        setElement(term257850, 3, term257778);
        setElement(term257850, 5, term257778);
        setElement(term257850, 7, term257778);
        setElement(term257850, 9, term257778);
        setElement(term257850, 11, term257778);
        setElement(term257850, 13, term257778);
        setElement(term257850, 15, term257778);
        setElement(term257850, 17, term257778);
        setElement(term257850, 19, term257778);
        setElement(term257850, 21, term257778);
        setElement(term257850, 23, term257778);
        setElement(term257850, 25, term257778);
        setElement(term257850, 27, term257778);
        setElement(term257850, 29, term257778);
        setElement(term257850, 31, term257778);
        setElement(term257850, 33, term257778);
        setElement(term257850, 35, term257778);
        setElement(term257850, 37, term257778);
        setElement(term257850, 39, term257778);
        setField(term257805, term257805.getClass(), "wallOffsets", term257850);
        setField(term257805, term257805.getClass(), "lastRules", term257851);
        setField(term257852, term257852.getClass(), "table", null);
        setField(term257852, term257852.getClass(), "nextTable", null);
        setLongField(term257852, term257852.getClass(), "baseCount", 0L);
        setIntField(term257852, term257852.getClass(), "sizeCtl", 0);
        setIntField(term257852, term257852.getClass(), "transferIndex", 0);
        setIntField(term257852, term257852.getClass(), "cellsBusy", 0);
        setField(term257852, term257852.getClass(), "counterCells", null);
        setField(term257852, term257852.getClass(), "keySet", null);
        setField(term257852, term257852.getClass(), "values", null);
        setField(term257852, term257852.getClass(), "entrySet", null);
        setField(term257852, term257852.getClass(), "keySet", null);
        setField(term257852, term257852.getClass(), "values", null);
        setField(term257805, term257805.getClass(), "lastRulesCache", term257852);
        setField(term257788, term257788.getClass(), "rules", term257805);
        setField(term257767, term257767.getClass(), "zone", term257788);
        setField(term257682, term257682.getClass(), "time_stamp", term257767);
        setField(term257682, term257682.getClass(), "start_up_mode", "DmsJwEkQmO");
        setField(term257682, term257682.getClass(), "cmm_dly_mod", "HzibsEDFOp");
        setField(term257682, term257682.getClass(), "cmm_dly_sec", "nxccuKoVbt");
        setField(term257682, term257682.getClass(), "cmm_err_mod", "fgSbKLymzA");
        setField(term257682, term257682.getClass(), "country_code", "kSFJgZpdtf");
        setField(term257682, term257682.getClass(), "region_code", "ujNUCJKMUq");
        term257929 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term257930 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term257931 = newInstance(Class.forName("java.time.LocalDate"));
        Object term257935 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term257931, term257931.getClass(), "year", 2019);
        setShortField(term257931, term257931.getClass(), "month", (short) 5);
        setShortField(term257931, term257931.getClass(), "day", (short) 16);
        setField(term257930, term257930.getClass(), "date", term257931);
        setByteField(term257935, term257935.getClass(), "hour", (byte) 3);
        setByteField(term257935, term257935.getClass(), "minute", (byte) 12);
        setByteField(term257935, term257935.getClass(), "second", (byte) 27);
        setIntField(term257935, term257935.getClass(), "nano", 775737832);
        setField(term257930, term257930.getClass(), "time", term257935);
        setField(term257929, term257929.getClass(), "dateTime", term257930);
        setField(term257929, term257929.getClass(), "offset", term257778);
        setField(term257929, term257929.getClass(), "zone", term257788);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.BaseRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.ZonedDateTime");
        Object[] args = new Object[1];
        args[0] = term257929;
        callMethod(klass, "setTime_stamp", argTypes, term257682, args);
    }

};


