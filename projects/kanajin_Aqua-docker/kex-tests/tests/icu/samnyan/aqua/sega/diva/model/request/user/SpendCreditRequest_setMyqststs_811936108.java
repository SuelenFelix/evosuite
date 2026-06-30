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

public class SpendCreditRequest_setMyqststs_811936108 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3816;
     Object term4087;

    public SpendCreditRequest_setMyqststs_811936108() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3816 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.user.SpendCreditRequest"));
        int[] term3818 = (int[]) newIntArray(5);
        int[] term3824 = (int[]) newIntArray(3);
        int[] term3829 = (int[]) newIntArray(5);
        int[] term3835 = (int[]) newIntArray(5);
        Object term3925 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term3926 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3927 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3931 = newInstance(Class.forName("java.time.LocalTime"));
        Object term3936 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term3946 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term3963 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term3964 = (long[]) newLongArray(1);
        Object[] term3966 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term3967 = (long[]) newLongArray(39);
        Object[] term4007 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term4008 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term4009 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term4010 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setIntField(term3816, term3816.getClass(), "pd_id", 98922530);
        setIntElement(term3818, 0, -1388471422);
        setIntElement(term3818, 1, -1498296052);
        setIntElement(term3818, 2, 2098647989);
        setIntElement(term3818, 3, 1598895173);
        setIntElement(term3818, 4, 1830648570);
        setField(term3816, term3816.getClass(), "my_qst_id", term3818);
        setIntElement(term3824, 0, -227365013);
        setIntElement(term3824, 1, 11724947);
        setIntElement(term3824, 2, 1953277050);
        setField(term3816, term3816.getClass(), "my_qst_sts", term3824);
        setIntField(term3816, term3816.getClass(), "crdt_typ", 1283079251);
        setIntElement(term3829, 0, -523949691);
        setIntElement(term3829, 1, 1398204340);
        setIntElement(term3829, 2, 229204365);
        setIntElement(term3829, 3, -461771056);
        setIntElement(term3829, 4, -243422082);
        setField(term3816, term3816.getClass(), "cmpgn_id", term3829);
        setIntElement(term3835, 0, 1384592638);
        setIntElement(term3835, 1, -1002370457);
        setIntElement(term3835, 2, -2014576105);
        setIntElement(term3835, 3, 1296895584);
        setIntElement(term3835, 4, 628918458);
        setField(term3816, term3816.getClass(), "cmpgn_pb", term3835);
        setField(term3816, term3816.getClass(), "cmd", "QXzGXbEXMu");
        setField(term3816, term3816.getClass(), "req_id", "qxSDVejjiY");
        setField(term3816, term3816.getClass(), "game_id", "xBsXSDjXYK");
        setField(term3816, term3816.getClass(), "r_ver", "sEnIVFtZuQ");
        setField(term3816, term3816.getClass(), "kc_serial", "ZVecLZMLHF");
        setField(term3816, term3816.getClass(), "b_serial", "fztQhjqwdP");
        setField(term3816, term3816.getClass(), "place_id", "eVpkWxjuki");
        setIntField(term3927, term3927.getClass(), "year", 2029);
        setShortField(term3927, term3927.getClass(), "month", (short) 8);
        setShortField(term3927, term3927.getClass(), "day", (short) 29);
        setField(term3926, term3926.getClass(), "date", term3927);
        setByteField(term3931, term3931.getClass(), "hour", (byte) 15);
        setByteField(term3931, term3931.getClass(), "minute", (byte) 50);
        setByteField(term3931, term3931.getClass(), "second", (byte) 1);
        setIntField(term3931, term3931.getClass(), "nano", 277971904);
        setField(term3926, term3926.getClass(), "time", term3931);
        setField(term3925, term3925.getClass(), "dateTime", term3926);
        setIntField(term3936, term3936.getClass(), "totalSeconds", -10800);
        setField(term3936, term3936.getClass(), "id", "-03:00");
        setField(term3925, term3925.getClass(), "offset", term3936);
        setField(term3946, term3946.getClass(), "id", "America/Recife");
        setLongElement(term3964, 0, -1767217224L);
        setField(term3963, term3963.getClass(), "standardTransitions", term3964);
        setElement(term3966, 1, term3936);
        setField(term3963, term3963.getClass(), "standardOffsets", term3966);
        setLongElement(term3967, 0, -1767217224L);
        setLongElement(term3967, 1, -1206957600L);
        setLongElement(term3967, 2, -1191362400L);
        setLongElement(term3967, 3, -1175374800L);
        setLongElement(term3967, 4, -1159826400L);
        setLongElement(term3967, 5, -633819600L);
        setLongElement(term3967, 6, -622069200L);
        setLongElement(term3967, 7, -602283600L);
        setLongElement(term3967, 8, -591832800L);
        setLongElement(term3967, 9, -570747600L);
        setLongElement(term3967, 10, -560210400L);
        setLongElement(term3967, 11, -539125200L);
        setLongElement(term3967, 12, -531352800L);
        setLongElement(term3967, 13, -191365200L);
        setLongElement(term3967, 14, -184197600L);
        setLongElement(term3967, 15, -155163600L);
        setLongElement(term3967, 16, -150069600L);
        setLongElement(term3967, 17, -128898000L);
        setLongElement(term3967, 18, -121125600L);
        setLongElement(term3967, 19, -99954000L);
        setLongElement(term3967, 20, -89589600L);
        setLongElement(term3967, 21, -68418000L);
        setLongElement(term3967, 22, -57967200L);
        setLongElement(term3967, 23, 499748400L);
        setLongElement(term3967, 24, 511236000L);
        setLongElement(term3967, 25, 530593200L);
        setLongElement(term3967, 26, 540266400L);
        setLongElement(term3967, 27, 562129200L);
        setLongElement(term3967, 28, 571197600L);
        setLongElement(term3967, 29, 592974000L);
        setLongElement(term3967, 30, 602042400L);
        setLongElement(term3967, 31, 624423600L);
        setLongElement(term3967, 32, 634701600L);
        setLongElement(term3967, 33, 938919600L);
        setLongElement(term3967, 34, 951616800L);
        setLongElement(term3967, 35, 970974000L);
        setLongElement(term3967, 36, 971575200L);
        setLongElement(term3967, 37, 1003028400L);
        setLongElement(term3967, 38, 1013911200L);
        setField(term3963, term3963.getClass(), "savingsInstantTransitions", term3967);
        setField(term3963, term3963.getClass(), "savingsLocalTransitions", term4007);
        setElement(term4008, 1, term3936);
        setElement(term4008, 3, term3936);
        setElement(term4008, 5, term3936);
        setElement(term4008, 7, term3936);
        setElement(term4008, 9, term3936);
        setElement(term4008, 11, term3936);
        setElement(term4008, 13, term3936);
        setElement(term4008, 15, term3936);
        setElement(term4008, 17, term3936);
        setElement(term4008, 19, term3936);
        setElement(term4008, 21, term3936);
        setElement(term4008, 23, term3936);
        setElement(term4008, 25, term3936);
        setElement(term4008, 27, term3936);
        setElement(term4008, 29, term3936);
        setElement(term4008, 31, term3936);
        setElement(term4008, 33, term3936);
        setElement(term4008, 35, term3936);
        setElement(term4008, 37, term3936);
        setElement(term4008, 39, term3936);
        setField(term3963, term3963.getClass(), "wallOffsets", term4008);
        setField(term3963, term3963.getClass(), "lastRules", term4009);
        setField(term4010, term4010.getClass(), "table", null);
        setField(term4010, term4010.getClass(), "nextTable", null);
        setLongField(term4010, term4010.getClass(), "baseCount", 0L);
        setIntField(term4010, term4010.getClass(), "sizeCtl", 0);
        setIntField(term4010, term4010.getClass(), "transferIndex", 0);
        setIntField(term4010, term4010.getClass(), "cellsBusy", 0);
        setField(term4010, term4010.getClass(), "counterCells", null);
        setField(term4010, term4010.getClass(), "keySet", null);
        setField(term4010, term4010.getClass(), "values", null);
        setField(term4010, term4010.getClass(), "entrySet", null);
        setField(term4010, term4010.getClass(), "keySet", null);
        setField(term4010, term4010.getClass(), "values", null);
        setField(term3963, term3963.getClass(), "lastRulesCache", term4010);
        setField(term3946, term3946.getClass(), "rules", term3963);
        setField(term3925, term3925.getClass(), "zone", term3946);
        setField(term3816, term3816.getClass(), "time_stamp", term3925);
        setField(term3816, term3816.getClass(), "start_up_mode", "SJiQaLvSKv");
        setField(term3816, term3816.getClass(), "cmm_dly_mod", "OEXDRUKcFl");
        setField(term3816, term3816.getClass(), "cmm_dly_sec", "RYdKCNNMBR");
        setField(term3816, term3816.getClass(), "cmm_err_mod", "yGtHPyvYiQ");
        setField(term3816, term3816.getClass(), "country_code", "MvRIxilFMJ");
        setField(term3816, term3816.getClass(), "region_code", "iNwOJRBEjp");
        term4087 = (int[]) newIntArray(1);
        setIntElement(term4087, 0, -1274456137);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.user.SpendCreditRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term4087;
        callMethod(klass, "setMy_qst_sts", argTypes, term3816, args);
    }

};


