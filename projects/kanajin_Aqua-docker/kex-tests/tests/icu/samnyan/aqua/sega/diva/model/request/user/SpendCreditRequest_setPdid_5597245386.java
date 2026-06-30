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

public class SpendCreditRequest_setPdid_5597245386 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2843;
     Object term3115;

    public SpendCreditRequest_setPdid_5597245386() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2843 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.user.SpendCreditRequest"));
        int[] term2845 = (int[]) newIntArray(5);
        int[] term2851 = (int[]) newIntArray(6);
        int[] term2859 = (int[]) newIntArray(5);
        int[] term2865 = (int[]) newIntArray(3);
        Object term2953 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term2954 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2955 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2959 = newInstance(Class.forName("java.time.LocalTime"));
        Object term2964 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term2974 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term2991 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term2992 = (long[]) newLongArray(1);
        Object[] term2994 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term2995 = (long[]) newLongArray(39);
        Object[] term3035 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term3036 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term3037 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term3038 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setIntField(term2843, term2843.getClass(), "pd_id", -268815336);
        setIntElement(term2845, 0, -1210583429);
        setIntElement(term2845, 1, -663691365);
        setIntElement(term2845, 2, 339854490);
        setIntElement(term2845, 3, -615654495);
        setIntElement(term2845, 4, -1476117762);
        setField(term2843, term2843.getClass(), "my_qst_id", term2845);
        setIntElement(term2851, 0, -341962980);
        setIntElement(term2851, 1, 1532716628);
        setIntElement(term2851, 2, -1801760683);
        setIntElement(term2851, 3, 1141317871);
        setIntElement(term2851, 4, 890669485);
        setIntElement(term2851, 5, 691577392);
        setField(term2843, term2843.getClass(), "my_qst_sts", term2851);
        setIntField(term2843, term2843.getClass(), "crdt_typ", -893623680);
        setIntElement(term2859, 0, -1963434938);
        setIntElement(term2859, 1, 906181092);
        setIntElement(term2859, 2, 1045657203);
        setIntElement(term2859, 3, 1386130016);
        setIntElement(term2859, 4, 1072005683);
        setField(term2843, term2843.getClass(), "cmpgn_id", term2859);
        setIntElement(term2865, 0, 1861318859);
        setIntElement(term2865, 1, 1474524152);
        setIntElement(term2865, 2, 568954359);
        setField(term2843, term2843.getClass(), "cmpgn_pb", term2865);
        setField(term2843, term2843.getClass(), "cmd", "OWKQODBLzb");
        setField(term2843, term2843.getClass(), "req_id", "wGmYcqUkgE");
        setField(term2843, term2843.getClass(), "game_id", "idgaQsnJpQ");
        setField(term2843, term2843.getClass(), "r_ver", "VgZnGoIFwQ");
        setField(term2843, term2843.getClass(), "kc_serial", "jUbSRrkrYZ");
        setField(term2843, term2843.getClass(), "b_serial", "bWWfajKbEX");
        setField(term2843, term2843.getClass(), "place_id", "cAPeiZHKGJ");
        setIntField(term2955, term2955.getClass(), "year", 2025);
        setShortField(term2955, term2955.getClass(), "month", (short) 4);
        setShortField(term2955, term2955.getClass(), "day", (short) 24);
        setField(term2954, term2954.getClass(), "date", term2955);
        setByteField(term2959, term2959.getClass(), "hour", (byte) 18);
        setByteField(term2959, term2959.getClass(), "minute", (byte) 11);
        setByteField(term2959, term2959.getClass(), "second", (byte) 40);
        setIntField(term2959, term2959.getClass(), "nano", 137454929);
        setField(term2954, term2954.getClass(), "time", term2959);
        setField(term2953, term2953.getClass(), "dateTime", term2954);
        setIntField(term2964, term2964.getClass(), "totalSeconds", -10800);
        setField(term2964, term2964.getClass(), "id", "-03:00");
        setField(term2953, term2953.getClass(), "offset", term2964);
        setField(term2974, term2974.getClass(), "id", "America/Recife");
        setLongElement(term2992, 0, -1767217224L);
        setField(term2991, term2991.getClass(), "standardTransitions", term2992);
        setElement(term2994, 1, term2964);
        setField(term2991, term2991.getClass(), "standardOffsets", term2994);
        setLongElement(term2995, 0, -1767217224L);
        setLongElement(term2995, 1, -1206957600L);
        setLongElement(term2995, 2, -1191362400L);
        setLongElement(term2995, 3, -1175374800L);
        setLongElement(term2995, 4, -1159826400L);
        setLongElement(term2995, 5, -633819600L);
        setLongElement(term2995, 6, -622069200L);
        setLongElement(term2995, 7, -602283600L);
        setLongElement(term2995, 8, -591832800L);
        setLongElement(term2995, 9, -570747600L);
        setLongElement(term2995, 10, -560210400L);
        setLongElement(term2995, 11, -539125200L);
        setLongElement(term2995, 12, -531352800L);
        setLongElement(term2995, 13, -191365200L);
        setLongElement(term2995, 14, -184197600L);
        setLongElement(term2995, 15, -155163600L);
        setLongElement(term2995, 16, -150069600L);
        setLongElement(term2995, 17, -128898000L);
        setLongElement(term2995, 18, -121125600L);
        setLongElement(term2995, 19, -99954000L);
        setLongElement(term2995, 20, -89589600L);
        setLongElement(term2995, 21, -68418000L);
        setLongElement(term2995, 22, -57967200L);
        setLongElement(term2995, 23, 499748400L);
        setLongElement(term2995, 24, 511236000L);
        setLongElement(term2995, 25, 530593200L);
        setLongElement(term2995, 26, 540266400L);
        setLongElement(term2995, 27, 562129200L);
        setLongElement(term2995, 28, 571197600L);
        setLongElement(term2995, 29, 592974000L);
        setLongElement(term2995, 30, 602042400L);
        setLongElement(term2995, 31, 624423600L);
        setLongElement(term2995, 32, 634701600L);
        setLongElement(term2995, 33, 938919600L);
        setLongElement(term2995, 34, 951616800L);
        setLongElement(term2995, 35, 970974000L);
        setLongElement(term2995, 36, 971575200L);
        setLongElement(term2995, 37, 1003028400L);
        setLongElement(term2995, 38, 1013911200L);
        setField(term2991, term2991.getClass(), "savingsInstantTransitions", term2995);
        setField(term2991, term2991.getClass(), "savingsLocalTransitions", term3035);
        setElement(term3036, 1, term2964);
        setElement(term3036, 3, term2964);
        setElement(term3036, 5, term2964);
        setElement(term3036, 7, term2964);
        setElement(term3036, 9, term2964);
        setElement(term3036, 11, term2964);
        setElement(term3036, 13, term2964);
        setElement(term3036, 15, term2964);
        setElement(term3036, 17, term2964);
        setElement(term3036, 19, term2964);
        setElement(term3036, 21, term2964);
        setElement(term3036, 23, term2964);
        setElement(term3036, 25, term2964);
        setElement(term3036, 27, term2964);
        setElement(term3036, 29, term2964);
        setElement(term3036, 31, term2964);
        setElement(term3036, 33, term2964);
        setElement(term3036, 35, term2964);
        setElement(term3036, 37, term2964);
        setElement(term3036, 39, term2964);
        setField(term2991, term2991.getClass(), "wallOffsets", term3036);
        setField(term2991, term2991.getClass(), "lastRules", term3037);
        setField(term3038, term3038.getClass(), "table", null);
        setField(term3038, term3038.getClass(), "nextTable", null);
        setLongField(term3038, term3038.getClass(), "baseCount", 0L);
        setIntField(term3038, term3038.getClass(), "sizeCtl", 0);
        setIntField(term3038, term3038.getClass(), "transferIndex", 0);
        setIntField(term3038, term3038.getClass(), "cellsBusy", 0);
        setField(term3038, term3038.getClass(), "counterCells", null);
        setField(term3038, term3038.getClass(), "keySet", null);
        setField(term3038, term3038.getClass(), "values", null);
        setField(term3038, term3038.getClass(), "entrySet", null);
        setField(term3038, term3038.getClass(), "keySet", null);
        setField(term3038, term3038.getClass(), "values", null);
        setField(term2991, term2991.getClass(), "lastRulesCache", term3038);
        setField(term2974, term2974.getClass(), "rules", term2991);
        setField(term2953, term2953.getClass(), "zone", term2974);
        setField(term2843, term2843.getClass(), "time_stamp", term2953);
        setField(term2843, term2843.getClass(), "start_up_mode", "LvJFtLBaxj");
        setField(term2843, term2843.getClass(), "cmm_dly_mod", "PHvxnGHptP");
        setField(term2843, term2843.getClass(), "cmm_dly_sec", "TimdotUuNC");
        setField(term2843, term2843.getClass(), "cmm_err_mod", "PkWMRdJcBb");
        setField(term2843, term2843.getClass(), "country_code", "jSpAteRute");
        setField(term2843, term2843.getClass(), "region_code", "swZVeJAxjt");
        term3115 = new Integer(53410913);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.user.SpendCreditRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term3115;
        callMethod(klass, "setPd_id", argTypes, term2843, args);
    }

};


