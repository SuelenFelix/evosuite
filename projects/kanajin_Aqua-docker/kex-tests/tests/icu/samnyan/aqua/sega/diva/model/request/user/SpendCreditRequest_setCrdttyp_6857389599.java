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

public class SpendCreditRequest_setCrdttyp_6857389599 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4298;
     Object term4572;

    public SpendCreditRequest_setCrdttyp_6857389599() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4298 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.user.SpendCreditRequest"));
        int[] term4300 = (int[]) newIntArray(0);
        int[] term4301 = (int[]) newIntArray(9);
        int[] term4312 = (int[]) newIntArray(4);
        int[] term4317 = (int[]) newIntArray(8);
        Object term4410 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term4411 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4412 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4416 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4421 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term4431 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term4448 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term4449 = (long[]) newLongArray(1);
        Object[] term4451 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term4452 = (long[]) newLongArray(39);
        Object[] term4492 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term4493 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term4494 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term4495 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setIntField(term4298, term4298.getClass(), "pd_id", 1041916673);
        setField(term4298, term4298.getClass(), "my_qst_id", term4300);
        setIntElement(term4301, 0, -601863069);
        setIntElement(term4301, 1, 663292551);
        setIntElement(term4301, 2, -1885090354);
        setIntElement(term4301, 3, -2066804303);
        setIntElement(term4301, 4, -1731761810);
        setIntElement(term4301, 5, 197109649);
        setIntElement(term4301, 6, -1239406390);
        setIntElement(term4301, 7, 1557431527);
        setIntElement(term4301, 8, -1504890659);
        setField(term4298, term4298.getClass(), "my_qst_sts", term4301);
        setIntField(term4298, term4298.getClass(), "crdt_typ", 1358829571);
        setIntElement(term4312, 0, 991356662);
        setIntElement(term4312, 1, -506958186);
        setIntElement(term4312, 2, -507387516);
        setIntElement(term4312, 3, -1970452551);
        setField(term4298, term4298.getClass(), "cmpgn_id", term4312);
        setIntElement(term4317, 0, -1896376975);
        setIntElement(term4317, 1, 729658803);
        setIntElement(term4317, 2, 114754804);
        setIntElement(term4317, 3, 1687361082);
        setIntElement(term4317, 4, 584893196);
        setIntElement(term4317, 5, 497269071);
        setIntElement(term4317, 6, -1899301124);
        setIntElement(term4317, 7, -1882480155);
        setField(term4298, term4298.getClass(), "cmpgn_pb", term4317);
        setField(term4298, term4298.getClass(), "cmd", "XylxrMBraH");
        setField(term4298, term4298.getClass(), "req_id", "pORebkoRdD");
        setField(term4298, term4298.getClass(), "game_id", "mXGCWJDOqA");
        setField(term4298, term4298.getClass(), "r_ver", "dpNsDgfPso");
        setField(term4298, term4298.getClass(), "kc_serial", "hCWPJQKpdc");
        setField(term4298, term4298.getClass(), "b_serial", "WzMEhMXkKx");
        setField(term4298, term4298.getClass(), "place_id", "XOiDvlDhdc");
        setIntField(term4412, term4412.getClass(), "year", 2022);
        setShortField(term4412, term4412.getClass(), "month", (short) 11);
        setShortField(term4412, term4412.getClass(), "day", (short) 16);
        setField(term4411, term4411.getClass(), "date", term4412);
        setByteField(term4416, term4416.getClass(), "hour", (byte) 15);
        setByteField(term4416, term4416.getClass(), "minute", (byte) 54);
        setByteField(term4416, term4416.getClass(), "second", (byte) 2);
        setIntField(term4416, term4416.getClass(), "nano", 733274103);
        setField(term4411, term4411.getClass(), "time", term4416);
        setField(term4410, term4410.getClass(), "dateTime", term4411);
        setIntField(term4421, term4421.getClass(), "totalSeconds", -10800);
        setField(term4421, term4421.getClass(), "id", "-03:00");
        setField(term4410, term4410.getClass(), "offset", term4421);
        setField(term4431, term4431.getClass(), "id", "America/Recife");
        setLongElement(term4449, 0, -1767217224L);
        setField(term4448, term4448.getClass(), "standardTransitions", term4449);
        setElement(term4451, 1, term4421);
        setField(term4448, term4448.getClass(), "standardOffsets", term4451);
        setLongElement(term4452, 0, -1767217224L);
        setLongElement(term4452, 1, -1206957600L);
        setLongElement(term4452, 2, -1191362400L);
        setLongElement(term4452, 3, -1175374800L);
        setLongElement(term4452, 4, -1159826400L);
        setLongElement(term4452, 5, -633819600L);
        setLongElement(term4452, 6, -622069200L);
        setLongElement(term4452, 7, -602283600L);
        setLongElement(term4452, 8, -591832800L);
        setLongElement(term4452, 9, -570747600L);
        setLongElement(term4452, 10, -560210400L);
        setLongElement(term4452, 11, -539125200L);
        setLongElement(term4452, 12, -531352800L);
        setLongElement(term4452, 13, -191365200L);
        setLongElement(term4452, 14, -184197600L);
        setLongElement(term4452, 15, -155163600L);
        setLongElement(term4452, 16, -150069600L);
        setLongElement(term4452, 17, -128898000L);
        setLongElement(term4452, 18, -121125600L);
        setLongElement(term4452, 19, -99954000L);
        setLongElement(term4452, 20, -89589600L);
        setLongElement(term4452, 21, -68418000L);
        setLongElement(term4452, 22, -57967200L);
        setLongElement(term4452, 23, 499748400L);
        setLongElement(term4452, 24, 511236000L);
        setLongElement(term4452, 25, 530593200L);
        setLongElement(term4452, 26, 540266400L);
        setLongElement(term4452, 27, 562129200L);
        setLongElement(term4452, 28, 571197600L);
        setLongElement(term4452, 29, 592974000L);
        setLongElement(term4452, 30, 602042400L);
        setLongElement(term4452, 31, 624423600L);
        setLongElement(term4452, 32, 634701600L);
        setLongElement(term4452, 33, 938919600L);
        setLongElement(term4452, 34, 951616800L);
        setLongElement(term4452, 35, 970974000L);
        setLongElement(term4452, 36, 971575200L);
        setLongElement(term4452, 37, 1003028400L);
        setLongElement(term4452, 38, 1013911200L);
        setField(term4448, term4448.getClass(), "savingsInstantTransitions", term4452);
        setField(term4448, term4448.getClass(), "savingsLocalTransitions", term4492);
        setElement(term4493, 1, term4421);
        setElement(term4493, 3, term4421);
        setElement(term4493, 5, term4421);
        setElement(term4493, 7, term4421);
        setElement(term4493, 9, term4421);
        setElement(term4493, 11, term4421);
        setElement(term4493, 13, term4421);
        setElement(term4493, 15, term4421);
        setElement(term4493, 17, term4421);
        setElement(term4493, 19, term4421);
        setElement(term4493, 21, term4421);
        setElement(term4493, 23, term4421);
        setElement(term4493, 25, term4421);
        setElement(term4493, 27, term4421);
        setElement(term4493, 29, term4421);
        setElement(term4493, 31, term4421);
        setElement(term4493, 33, term4421);
        setElement(term4493, 35, term4421);
        setElement(term4493, 37, term4421);
        setElement(term4493, 39, term4421);
        setField(term4448, term4448.getClass(), "wallOffsets", term4493);
        setField(term4448, term4448.getClass(), "lastRules", term4494);
        setField(term4495, term4495.getClass(), "table", null);
        setField(term4495, term4495.getClass(), "nextTable", null);
        setLongField(term4495, term4495.getClass(), "baseCount", 0L);
        setIntField(term4495, term4495.getClass(), "sizeCtl", 0);
        setIntField(term4495, term4495.getClass(), "transferIndex", 0);
        setIntField(term4495, term4495.getClass(), "cellsBusy", 0);
        setField(term4495, term4495.getClass(), "counterCells", null);
        setField(term4495, term4495.getClass(), "keySet", null);
        setField(term4495, term4495.getClass(), "values", null);
        setField(term4495, term4495.getClass(), "entrySet", null);
        setField(term4495, term4495.getClass(), "keySet", null);
        setField(term4495, term4495.getClass(), "values", null);
        setField(term4448, term4448.getClass(), "lastRulesCache", term4495);
        setField(term4431, term4431.getClass(), "rules", term4448);
        setField(term4410, term4410.getClass(), "zone", term4431);
        setField(term4298, term4298.getClass(), "time_stamp", term4410);
        setField(term4298, term4298.getClass(), "start_up_mode", "AdxvLJhNLe");
        setField(term4298, term4298.getClass(), "cmm_dly_mod", "lHfTrWKMPk");
        setField(term4298, term4298.getClass(), "cmm_dly_sec", "JDaAnsVTGV");
        setField(term4298, term4298.getClass(), "cmm_err_mod", "mLUZFTfjle");
        setField(term4298, term4298.getClass(), "country_code", "xIeFjkHkOe");
        setField(term4298, term4298.getClass(), "region_code", "SdCKLMIYnX");
        term4572 = new Integer(-1410220680);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.user.SpendCreditRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4572;
        callMethod(klass, "setCrdt_typ", argTypes, term4298, args);
    }

};


