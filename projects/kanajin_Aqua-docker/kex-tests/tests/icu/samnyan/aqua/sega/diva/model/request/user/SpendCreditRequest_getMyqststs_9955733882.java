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

public class SpendCreditRequest_getMyqststs_9955733882 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term949;

    public SpendCreditRequest_getMyqststs_9955733882() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term949 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.user.SpendCreditRequest"));
        int[] term951 = (int[]) newIntArray(7);
        int[] term959 = (int[]) newIntArray(1);
        int[] term962 = (int[]) newIntArray(6);
        int[] term969 = (int[]) newIntArray(5);
        Object term1059 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term1060 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1061 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1065 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1070 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term1080 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term1097 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term1098 = (long[]) newLongArray(1);
        Object[] term1100 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term1101 = (long[]) newLongArray(39);
        Object[] term1141 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term1142 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term1143 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term1144 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setIntField(term949, term949.getClass(), "pd_id", -1087774327);
        setIntElement(term951, 0, -1530420153);
        setIntElement(term951, 1, -469968304);
        setIntElement(term951, 2, -1145578966);
        setIntElement(term951, 3, 679763016);
        setIntElement(term951, 4, 1962444399);
        setIntElement(term951, 5, 767834723);
        setIntElement(term951, 6, -602026508);
        setField(term949, term949.getClass(), "my_qst_id", term951);
        setIntElement(term959, 0, -157887805);
        setField(term949, term949.getClass(), "my_qst_sts", term959);
        setIntField(term949, term949.getClass(), "crdt_typ", 1876565163);
        setIntElement(term962, 0, -817164822);
        setIntElement(term962, 1, -1016503459);
        setIntElement(term962, 2, -1968847291);
        setIntElement(term962, 3, 579005622);
        setIntElement(term962, 4, -14890619);
        setIntElement(term962, 5, 1632125673);
        setField(term949, term949.getClass(), "cmpgn_id", term962);
        setIntElement(term969, 0, 454281060);
        setIntElement(term969, 1, -1786399638);
        setIntElement(term969, 2, 2055867847);
        setIntElement(term969, 3, -1048298087);
        setIntElement(term969, 4, 292681826);
        setField(term949, term949.getClass(), "cmpgn_pb", term969);
        setField(term949, term949.getClass(), "cmd", "flxyYxBRtu");
        setField(term949, term949.getClass(), "req_id", "OclPbYPkcH");
        setField(term949, term949.getClass(), "game_id", "IoAlmYsBwc");
        setField(term949, term949.getClass(), "r_ver", "TEParAifyi");
        setField(term949, term949.getClass(), "kc_serial", "OWDIEULEFu");
        setField(term949, term949.getClass(), "b_serial", "dWRymuLBtr");
        setField(term949, term949.getClass(), "place_id", "AijpHYOFuy");
        setIntField(term1061, term1061.getClass(), "year", 2015);
        setShortField(term1061, term1061.getClass(), "month", (short) 9);
        setShortField(term1061, term1061.getClass(), "day", (short) 19);
        setField(term1060, term1060.getClass(), "date", term1061);
        setByteField(term1065, term1065.getClass(), "hour", (byte) 9);
        setByteField(term1065, term1065.getClass(), "minute", (byte) 4);
        setByteField(term1065, term1065.getClass(), "second", (byte) 10);
        setIntField(term1065, term1065.getClass(), "nano", 401765865);
        setField(term1060, term1060.getClass(), "time", term1065);
        setField(term1059, term1059.getClass(), "dateTime", term1060);
        setIntField(term1070, term1070.getClass(), "totalSeconds", -10800);
        setField(term1070, term1070.getClass(), "id", "-03:00");
        setField(term1059, term1059.getClass(), "offset", term1070);
        setField(term1080, term1080.getClass(), "id", "America/Recife");
        setLongElement(term1098, 0, -1767217224L);
        setField(term1097, term1097.getClass(), "standardTransitions", term1098);
        setElement(term1100, 1, term1070);
        setField(term1097, term1097.getClass(), "standardOffsets", term1100);
        setLongElement(term1101, 0, -1767217224L);
        setLongElement(term1101, 1, -1206957600L);
        setLongElement(term1101, 2, -1191362400L);
        setLongElement(term1101, 3, -1175374800L);
        setLongElement(term1101, 4, -1159826400L);
        setLongElement(term1101, 5, -633819600L);
        setLongElement(term1101, 6, -622069200L);
        setLongElement(term1101, 7, -602283600L);
        setLongElement(term1101, 8, -591832800L);
        setLongElement(term1101, 9, -570747600L);
        setLongElement(term1101, 10, -560210400L);
        setLongElement(term1101, 11, -539125200L);
        setLongElement(term1101, 12, -531352800L);
        setLongElement(term1101, 13, -191365200L);
        setLongElement(term1101, 14, -184197600L);
        setLongElement(term1101, 15, -155163600L);
        setLongElement(term1101, 16, -150069600L);
        setLongElement(term1101, 17, -128898000L);
        setLongElement(term1101, 18, -121125600L);
        setLongElement(term1101, 19, -99954000L);
        setLongElement(term1101, 20, -89589600L);
        setLongElement(term1101, 21, -68418000L);
        setLongElement(term1101, 22, -57967200L);
        setLongElement(term1101, 23, 499748400L);
        setLongElement(term1101, 24, 511236000L);
        setLongElement(term1101, 25, 530593200L);
        setLongElement(term1101, 26, 540266400L);
        setLongElement(term1101, 27, 562129200L);
        setLongElement(term1101, 28, 571197600L);
        setLongElement(term1101, 29, 592974000L);
        setLongElement(term1101, 30, 602042400L);
        setLongElement(term1101, 31, 624423600L);
        setLongElement(term1101, 32, 634701600L);
        setLongElement(term1101, 33, 938919600L);
        setLongElement(term1101, 34, 951616800L);
        setLongElement(term1101, 35, 970974000L);
        setLongElement(term1101, 36, 971575200L);
        setLongElement(term1101, 37, 1003028400L);
        setLongElement(term1101, 38, 1013911200L);
        setField(term1097, term1097.getClass(), "savingsInstantTransitions", term1101);
        setField(term1097, term1097.getClass(), "savingsLocalTransitions", term1141);
        setElement(term1142, 1, term1070);
        setElement(term1142, 3, term1070);
        setElement(term1142, 5, term1070);
        setElement(term1142, 7, term1070);
        setElement(term1142, 9, term1070);
        setElement(term1142, 11, term1070);
        setElement(term1142, 13, term1070);
        setElement(term1142, 15, term1070);
        setElement(term1142, 17, term1070);
        setElement(term1142, 19, term1070);
        setElement(term1142, 21, term1070);
        setElement(term1142, 23, term1070);
        setElement(term1142, 25, term1070);
        setElement(term1142, 27, term1070);
        setElement(term1142, 29, term1070);
        setElement(term1142, 31, term1070);
        setElement(term1142, 33, term1070);
        setElement(term1142, 35, term1070);
        setElement(term1142, 37, term1070);
        setElement(term1142, 39, term1070);
        setField(term1097, term1097.getClass(), "wallOffsets", term1142);
        setField(term1097, term1097.getClass(), "lastRules", term1143);
        setField(term1144, term1144.getClass(), "table", null);
        setField(term1144, term1144.getClass(), "nextTable", null);
        setLongField(term1144, term1144.getClass(), "baseCount", 0L);
        setIntField(term1144, term1144.getClass(), "sizeCtl", 0);
        setIntField(term1144, term1144.getClass(), "transferIndex", 0);
        setIntField(term1144, term1144.getClass(), "cellsBusy", 0);
        setField(term1144, term1144.getClass(), "counterCells", null);
        setField(term1144, term1144.getClass(), "keySet", null);
        setField(term1144, term1144.getClass(), "values", null);
        setField(term1144, term1144.getClass(), "entrySet", null);
        setField(term1144, term1144.getClass(), "keySet", null);
        setField(term1144, term1144.getClass(), "values", null);
        setField(term1097, term1097.getClass(), "lastRulesCache", term1144);
        setField(term1080, term1080.getClass(), "rules", term1097);
        setField(term1059, term1059.getClass(), "zone", term1080);
        setField(term949, term949.getClass(), "time_stamp", term1059);
        setField(term949, term949.getClass(), "start_up_mode", "SbAoxhfrkn");
        setField(term949, term949.getClass(), "cmm_dly_mod", "kuTXqwMtDB");
        setField(term949, term949.getClass(), "cmm_dly_sec", "Ghbwtircqb");
        setField(term949, term949.getClass(), "cmm_err_mod", "xrwlQZdwCp");
        setField(term949, term949.getClass(), "country_code", "IDCWpPLRkE");
        setField(term949, term949.getClass(), "region_code", "nyiiPDVjAc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.user.SpendCreditRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMy_qst_sts", argTypes, term949, args);
    }

};


