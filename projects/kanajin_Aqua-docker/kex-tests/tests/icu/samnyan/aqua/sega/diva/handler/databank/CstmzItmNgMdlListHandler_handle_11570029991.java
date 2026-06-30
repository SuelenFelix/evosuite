package icu.samnyan.aqua.sega.diva.handler.databank;

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
import static icu.samnyan.aqua.sega.diva.handler.databank.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class CstmzItmNgMdlListHandler_handle_11570029991 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term889;
     Object term890;

    public CstmzItmNgMdlListHandler_handle_11570029991() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term889 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.handler.databank.CstmzItmNgMdlListHandler"));
        setField(term889, term889.getClass(), "mapper", null);
        term890 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.BaseRequest"));
        Object term975 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term976 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term977 = newInstance(Class.forName("java.time.LocalDate"));
        Object term981 = newInstance(Class.forName("java.time.LocalTime"));
        Object term986 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term996 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term1013 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term1014 = (long[]) newLongArray(1);
        Object[] term1016 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term1017 = (long[]) newLongArray(39);
        Object[] term1057 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term1058 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term1059 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term1060 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term890, term890.getClass(), "cmd", "flxyYxBRtu");
        setField(term890, term890.getClass(), "req_id", "OclPbYPkcH");
        setField(term890, term890.getClass(), "game_id", "IoAlmYsBwc");
        setField(term890, term890.getClass(), "r_ver", "TEParAifyi");
        setField(term890, term890.getClass(), "kc_serial", "OWDIEULEFu");
        setField(term890, term890.getClass(), "b_serial", "dWRymuLBtr");
        setField(term890, term890.getClass(), "place_id", "AijpHYOFuy");
        setIntField(term977, term977.getClass(), "year", 2015);
        setShortField(term977, term977.getClass(), "month", (short) 9);
        setShortField(term977, term977.getClass(), "day", (short) 19);
        setField(term976, term976.getClass(), "date", term977);
        setByteField(term981, term981.getClass(), "hour", (byte) 9);
        setByteField(term981, term981.getClass(), "minute", (byte) 4);
        setByteField(term981, term981.getClass(), "second", (byte) 10);
        setIntField(term981, term981.getClass(), "nano", 401765865);
        setField(term976, term976.getClass(), "time", term981);
        setField(term975, term975.getClass(), "dateTime", term976);
        setIntField(term986, term986.getClass(), "totalSeconds", -10800);
        setField(term986, term986.getClass(), "id", "-03:00");
        setField(term975, term975.getClass(), "offset", term986);
        setField(term996, term996.getClass(), "id", "America/Recife");
        setLongElement(term1014, 0, -1767217224L);
        setField(term1013, term1013.getClass(), "standardTransitions", term1014);
        setElement(term1016, 1, term986);
        setField(term1013, term1013.getClass(), "standardOffsets", term1016);
        setLongElement(term1017, 0, -1767217224L);
        setLongElement(term1017, 1, -1206957600L);
        setLongElement(term1017, 2, -1191362400L);
        setLongElement(term1017, 3, -1175374800L);
        setLongElement(term1017, 4, -1159826400L);
        setLongElement(term1017, 5, -633819600L);
        setLongElement(term1017, 6, -622069200L);
        setLongElement(term1017, 7, -602283600L);
        setLongElement(term1017, 8, -591832800L);
        setLongElement(term1017, 9, -570747600L);
        setLongElement(term1017, 10, -560210400L);
        setLongElement(term1017, 11, -539125200L);
        setLongElement(term1017, 12, -531352800L);
        setLongElement(term1017, 13, -191365200L);
        setLongElement(term1017, 14, -184197600L);
        setLongElement(term1017, 15, -155163600L);
        setLongElement(term1017, 16, -150069600L);
        setLongElement(term1017, 17, -128898000L);
        setLongElement(term1017, 18, -121125600L);
        setLongElement(term1017, 19, -99954000L);
        setLongElement(term1017, 20, -89589600L);
        setLongElement(term1017, 21, -68418000L);
        setLongElement(term1017, 22, -57967200L);
        setLongElement(term1017, 23, 499748400L);
        setLongElement(term1017, 24, 511236000L);
        setLongElement(term1017, 25, 530593200L);
        setLongElement(term1017, 26, 540266400L);
        setLongElement(term1017, 27, 562129200L);
        setLongElement(term1017, 28, 571197600L);
        setLongElement(term1017, 29, 592974000L);
        setLongElement(term1017, 30, 602042400L);
        setLongElement(term1017, 31, 624423600L);
        setLongElement(term1017, 32, 634701600L);
        setLongElement(term1017, 33, 938919600L);
        setLongElement(term1017, 34, 951616800L);
        setLongElement(term1017, 35, 970974000L);
        setLongElement(term1017, 36, 971575200L);
        setLongElement(term1017, 37, 1003028400L);
        setLongElement(term1017, 38, 1013911200L);
        setField(term1013, term1013.getClass(), "savingsInstantTransitions", term1017);
        setField(term1013, term1013.getClass(), "savingsLocalTransitions", term1057);
        setElement(term1058, 1, term986);
        setElement(term1058, 3, term986);
        setElement(term1058, 5, term986);
        setElement(term1058, 7, term986);
        setElement(term1058, 9, term986);
        setElement(term1058, 11, term986);
        setElement(term1058, 13, term986);
        setElement(term1058, 15, term986);
        setElement(term1058, 17, term986);
        setElement(term1058, 19, term986);
        setElement(term1058, 21, term986);
        setElement(term1058, 23, term986);
        setElement(term1058, 25, term986);
        setElement(term1058, 27, term986);
        setElement(term1058, 29, term986);
        setElement(term1058, 31, term986);
        setElement(term1058, 33, term986);
        setElement(term1058, 35, term986);
        setElement(term1058, 37, term986);
        setElement(term1058, 39, term986);
        setField(term1013, term1013.getClass(), "wallOffsets", term1058);
        setField(term1013, term1013.getClass(), "lastRules", term1059);
        setField(term1060, term1060.getClass(), "table", null);
        setField(term1060, term1060.getClass(), "nextTable", null);
        setLongField(term1060, term1060.getClass(), "baseCount", 0L);
        setIntField(term1060, term1060.getClass(), "sizeCtl", 0);
        setIntField(term1060, term1060.getClass(), "transferIndex", 0);
        setIntField(term1060, term1060.getClass(), "cellsBusy", 0);
        setField(term1060, term1060.getClass(), "counterCells", null);
        setField(term1060, term1060.getClass(), "keySet", null);
        setField(term1060, term1060.getClass(), "values", null);
        setField(term1060, term1060.getClass(), "entrySet", null);
        setField(term1060, term1060.getClass(), "keySet", null);
        setField(term1060, term1060.getClass(), "values", null);
        setField(term1013, term1013.getClass(), "lastRulesCache", term1060);
        setField(term996, term996.getClass(), "rules", term1013);
        setField(term975, term975.getClass(), "zone", term996);
        setField(term890, term890.getClass(), "time_stamp", term975);
        setField(term890, term890.getClass(), "start_up_mode", "SbAoxhfrkn");
        setField(term890, term890.getClass(), "cmm_dly_mod", "kuTXqwMtDB");
        setField(term890, term890.getClass(), "cmm_dly_sec", "Ghbwtircqb");
        setField(term890, term890.getClass(), "cmm_err_mod", "xrwlQZdwCp");
        setField(term890, term890.getClass(), "country_code", "IDCWpPLRkE");
        setField(term890, term890.getClass(), "region_code", "nyiiPDVjAc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.handler.databank.CstmzItmNgMdlListHandler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.diva.model.request.BaseRequest");
        Object[] args = new Object[1];
        args[0] = term890;
        callMethod(klass, "handle", argTypes, term889, args);
    }

};


