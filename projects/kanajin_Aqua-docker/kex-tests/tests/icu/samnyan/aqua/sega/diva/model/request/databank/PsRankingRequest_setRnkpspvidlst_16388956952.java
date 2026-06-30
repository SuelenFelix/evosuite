package icu.samnyan.aqua.sega.diva.model.request.databank;

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
import static icu.samnyan.aqua.sega.diva.model.request.databank.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class PsRankingRequest_setRnkpspvidlst_16388956952 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term897;
     Object term1149;

    public PsRankingRequest_setRnkpspvidlst_16388956952() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term897 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.databank.PsRankingRequest"));
        int[] term898 = (int[]) newIntArray(3);
        Object term987 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term988 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term989 = newInstance(Class.forName("java.time.LocalDate"));
        Object term993 = newInstance(Class.forName("java.time.LocalTime"));
        Object term998 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term1008 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term1025 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term1026 = (long[]) newLongArray(1);
        Object[] term1028 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term1029 = (long[]) newLongArray(39);
        Object[] term1069 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term1070 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term1071 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term1072 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setIntElement(term898, 0, -522618178);
        setIntElement(term898, 1, 1134449235);
        setIntElement(term898, 2, -883034806);
        setField(term897, term897.getClass(), "rnk_ps_pv_id_lst", term898);
        setIntField(term897, term897.getClass(), "rnk_ps_idx", 1585847225);
        setField(term897, term897.getClass(), "cmd", "flxyYxBRtu");
        setField(term897, term897.getClass(), "req_id", "OclPbYPkcH");
        setField(term897, term897.getClass(), "game_id", "IoAlmYsBwc");
        setField(term897, term897.getClass(), "r_ver", "TEParAifyi");
        setField(term897, term897.getClass(), "kc_serial", "OWDIEULEFu");
        setField(term897, term897.getClass(), "b_serial", "dWRymuLBtr");
        setField(term897, term897.getClass(), "place_id", "AijpHYOFuy");
        setIntField(term989, term989.getClass(), "year", 2015);
        setShortField(term989, term989.getClass(), "month", (short) 9);
        setShortField(term989, term989.getClass(), "day", (short) 19);
        setField(term988, term988.getClass(), "date", term989);
        setByteField(term993, term993.getClass(), "hour", (byte) 9);
        setByteField(term993, term993.getClass(), "minute", (byte) 4);
        setByteField(term993, term993.getClass(), "second", (byte) 10);
        setIntField(term993, term993.getClass(), "nano", 401765865);
        setField(term988, term988.getClass(), "time", term993);
        setField(term987, term987.getClass(), "dateTime", term988);
        setIntField(term998, term998.getClass(), "totalSeconds", -10800);
        setField(term998, term998.getClass(), "id", "-03:00");
        setField(term987, term987.getClass(), "offset", term998);
        setField(term1008, term1008.getClass(), "id", "America/Recife");
        setLongElement(term1026, 0, -1767217224L);
        setField(term1025, term1025.getClass(), "standardTransitions", term1026);
        setElement(term1028, 1, term998);
        setField(term1025, term1025.getClass(), "standardOffsets", term1028);
        setLongElement(term1029, 0, -1767217224L);
        setLongElement(term1029, 1, -1206957600L);
        setLongElement(term1029, 2, -1191362400L);
        setLongElement(term1029, 3, -1175374800L);
        setLongElement(term1029, 4, -1159826400L);
        setLongElement(term1029, 5, -633819600L);
        setLongElement(term1029, 6, -622069200L);
        setLongElement(term1029, 7, -602283600L);
        setLongElement(term1029, 8, -591832800L);
        setLongElement(term1029, 9, -570747600L);
        setLongElement(term1029, 10, -560210400L);
        setLongElement(term1029, 11, -539125200L);
        setLongElement(term1029, 12, -531352800L);
        setLongElement(term1029, 13, -191365200L);
        setLongElement(term1029, 14, -184197600L);
        setLongElement(term1029, 15, -155163600L);
        setLongElement(term1029, 16, -150069600L);
        setLongElement(term1029, 17, -128898000L);
        setLongElement(term1029, 18, -121125600L);
        setLongElement(term1029, 19, -99954000L);
        setLongElement(term1029, 20, -89589600L);
        setLongElement(term1029, 21, -68418000L);
        setLongElement(term1029, 22, -57967200L);
        setLongElement(term1029, 23, 499748400L);
        setLongElement(term1029, 24, 511236000L);
        setLongElement(term1029, 25, 530593200L);
        setLongElement(term1029, 26, 540266400L);
        setLongElement(term1029, 27, 562129200L);
        setLongElement(term1029, 28, 571197600L);
        setLongElement(term1029, 29, 592974000L);
        setLongElement(term1029, 30, 602042400L);
        setLongElement(term1029, 31, 624423600L);
        setLongElement(term1029, 32, 634701600L);
        setLongElement(term1029, 33, 938919600L);
        setLongElement(term1029, 34, 951616800L);
        setLongElement(term1029, 35, 970974000L);
        setLongElement(term1029, 36, 971575200L);
        setLongElement(term1029, 37, 1003028400L);
        setLongElement(term1029, 38, 1013911200L);
        setField(term1025, term1025.getClass(), "savingsInstantTransitions", term1029);
        setField(term1025, term1025.getClass(), "savingsLocalTransitions", term1069);
        setElement(term1070, 1, term998);
        setElement(term1070, 3, term998);
        setElement(term1070, 5, term998);
        setElement(term1070, 7, term998);
        setElement(term1070, 9, term998);
        setElement(term1070, 11, term998);
        setElement(term1070, 13, term998);
        setElement(term1070, 15, term998);
        setElement(term1070, 17, term998);
        setElement(term1070, 19, term998);
        setElement(term1070, 21, term998);
        setElement(term1070, 23, term998);
        setElement(term1070, 25, term998);
        setElement(term1070, 27, term998);
        setElement(term1070, 29, term998);
        setElement(term1070, 31, term998);
        setElement(term1070, 33, term998);
        setElement(term1070, 35, term998);
        setElement(term1070, 37, term998);
        setElement(term1070, 39, term998);
        setField(term1025, term1025.getClass(), "wallOffsets", term1070);
        setField(term1025, term1025.getClass(), "lastRules", term1071);
        setField(term1072, term1072.getClass(), "table", null);
        setField(term1072, term1072.getClass(), "nextTable", null);
        setLongField(term1072, term1072.getClass(), "baseCount", 0L);
        setIntField(term1072, term1072.getClass(), "sizeCtl", 0);
        setIntField(term1072, term1072.getClass(), "transferIndex", 0);
        setIntField(term1072, term1072.getClass(), "cellsBusy", 0);
        setField(term1072, term1072.getClass(), "counterCells", null);
        setField(term1072, term1072.getClass(), "keySet", null);
        setField(term1072, term1072.getClass(), "values", null);
        setField(term1072, term1072.getClass(), "entrySet", null);
        setField(term1072, term1072.getClass(), "keySet", null);
        setField(term1072, term1072.getClass(), "values", null);
        setField(term1025, term1025.getClass(), "lastRulesCache", term1072);
        setField(term1008, term1008.getClass(), "rules", term1025);
        setField(term987, term987.getClass(), "zone", term1008);
        setField(term897, term897.getClass(), "time_stamp", term987);
        setField(term897, term897.getClass(), "start_up_mode", "SbAoxhfrkn");
        setField(term897, term897.getClass(), "cmm_dly_mod", "kuTXqwMtDB");
        setField(term897, term897.getClass(), "cmm_dly_sec", "Ghbwtircqb");
        setField(term897, term897.getClass(), "cmm_err_mod", "xrwlQZdwCp");
        setField(term897, term897.getClass(), "country_code", "IDCWpPLRkE");
        setField(term897, term897.getClass(), "region_code", "nyiiPDVjAc");
        term1149 = (int[]) newIntArray(4);
        setIntElement(term1149, 0, 597278769);
        setIntElement(term1149, 1, -1685132342);
        setIntElement(term1149, 2, -1456670397);
        setIntElement(term1149, 3, 1622346318);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.databank.PsRankingRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1149;
        callMethod(klass, "setRnk_ps_pv_id_lst", argTypes, term897, args);
    }

};


