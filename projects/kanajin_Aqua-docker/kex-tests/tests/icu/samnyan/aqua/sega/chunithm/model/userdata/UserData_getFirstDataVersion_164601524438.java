package icu.samnyan.aqua.sega.chunithm.model.userdata;

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
import static icu.samnyan.aqua.sega.chunithm.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class UserData_getFirstDataVersion_164601524438 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term145569;

    public UserData_getFirstDataVersion_164601524438() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term145573 = new Long(7735460540091431012L);
        term145569 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term145571 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term145587 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term145588 = newInstance(Class.forName("java.time.LocalDate"));
        Object term145592 = newInstance(Class.forName("java.time.LocalTime"));
        Object term145597 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term145598 = newInstance(Class.forName("java.time.LocalDate"));
        Object term145602 = newInstance(Class.forName("java.time.LocalTime"));
        Object term145619 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term145620 = newInstance(Class.forName("java.time.LocalDate"));
        Object term145624 = newInstance(Class.forName("java.time.LocalTime"));
        Object term145680 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term145681 = newInstance(Class.forName("java.time.LocalDate"));
        Object term145685 = newInstance(Class.forName("java.time.LocalTime"));
        Object term145728 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term145729 = newInstance(Class.forName("java.time.LocalDate"));
        Object term145733 = newInstance(Class.forName("java.time.LocalTime"));
        Object term145774 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term145775 = newInstance(Class.forName("java.time.LocalDate"));
        Object term145779 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term145569, term145569.getClass(), "id", 1982970791443207752L);
        setLongField(term145571, term145571.getClass(), "id", 3439989480249101943L);
        setField(term145571, term145571.getClass(), "extId", term145573);
        setField(term145571, term145571.getClass(), "luid", "QUAzjGTSxv");
        setIntField(term145588, term145588.getClass(), "year", 2017);
        setShortField(term145588, term145588.getClass(), "month", (short) 1);
        setShortField(term145588, term145588.getClass(), "day", (short) 29);
        setField(term145587, term145587.getClass(), "date", term145588);
        setByteField(term145592, term145592.getClass(), "hour", (byte) 16);
        setByteField(term145592, term145592.getClass(), "minute", (byte) 20);
        setByteField(term145592, term145592.getClass(), "second", (byte) 43);
        setIntField(term145592, term145592.getClass(), "nano", 854959827);
        setField(term145587, term145587.getClass(), "time", term145592);
        setField(term145571, term145571.getClass(), "registerTime", term145587);
        setIntField(term145598, term145598.getClass(), "year", 2022);
        setShortField(term145598, term145598.getClass(), "month", (short) 8);
        setShortField(term145598, term145598.getClass(), "day", (short) 18);
        setField(term145597, term145597.getClass(), "date", term145598);
        setByteField(term145602, term145602.getClass(), "hour", (byte) 20);
        setByteField(term145602, term145602.getClass(), "minute", (byte) 21);
        setByteField(term145602, term145602.getClass(), "second", (byte) 59);
        setIntField(term145602, term145602.getClass(), "nano", 828981155);
        setField(term145597, term145597.getClass(), "time", term145602);
        setField(term145571, term145571.getClass(), "accessTime", term145597);
        setField(term145569, term145569.getClass(), "card", term145571);
        setField(term145569, term145569.getClass(), "userName", "cIWnHZgAhI");
        setIntField(term145620, term145620.getClass(), "year", 2010);
        setShortField(term145620, term145620.getClass(), "month", (short) 7);
        setShortField(term145620, term145620.getClass(), "day", (short) 30);
        setField(term145619, term145619.getClass(), "date", term145620);
        setByteField(term145624, term145624.getClass(), "hour", (byte) 15);
        setByteField(term145624, term145624.getClass(), "minute", (byte) 27);
        setByteField(term145624, term145624.getClass(), "second", (byte) 35);
        setIntField(term145624, term145624.getClass(), "nano", 989741448);
        setField(term145619, term145619.getClass(), "time", term145624);
        setField(term145569, term145569.getClass(), "lastLoginDate", term145619);
        setBooleanField(term145569, term145569.getClass(), "isWebJoin", true);
        setField(term145569, term145569.getClass(), "webLimitDate", "vEHRRwNajA");
        setIntField(term145569, term145569.getClass(), "level", -848249952);
        setIntField(term145569, term145569.getClass(), "reincarnationNum", 1446304058);
        setField(term145569, term145569.getClass(), "exp", "JePWfnKmqE");
        setLongField(term145569, term145569.getClass(), "point", -7959316538142185407L);
        setLongField(term145569, term145569.getClass(), "totalPoint", 7180761268865120390L);
        setIntField(term145569, term145569.getClass(), "playCount", 1814136333);
        setIntField(term145569, term145569.getClass(), "multiPlayCount", -1517722805);
        setIntField(term145569, term145569.getClass(), "multiWinCount", -659702501);
        setIntField(term145569, term145569.getClass(), "requestResCount", -1876896401);
        setIntField(term145569, term145569.getClass(), "acceptResCount", -718518592);
        setIntField(term145569, term145569.getClass(), "successResCount", -632825483);
        setIntField(term145569, term145569.getClass(), "playerRating", 675039331);
        setIntField(term145569, term145569.getClass(), "highestRating", -199646960);
        setIntField(term145569, term145569.getClass(), "nameplateId", -932918306);
        setIntField(term145569, term145569.getClass(), "frameId", -736397590);
        setIntField(term145569, term145569.getClass(), "characterId", 1986891014);
        setIntField(term145569, term145569.getClass(), "trophyId", -1661858214);
        setIntField(term145569, term145569.getClass(), "playedTutorialBit", 1298044863);
        setIntField(term145569, term145569.getClass(), "firstTutorialCancelNum", 1115180322);
        setIntField(term145569, term145569.getClass(), "masterTutorialCancelNum", -252644885);
        setIntField(term145569, term145569.getClass(), "totalRepertoireCount", -738886431);
        setIntField(term145569, term145569.getClass(), "totalMapNum", 1454600617);
        setLongField(term145569, term145569.getClass(), "totalHiScore", 610952698138243145L);
        setLongField(term145569, term145569.getClass(), "totalBasicHighScore", -8975810343836354386L);
        setLongField(term145569, term145569.getClass(), "totalAdvancedHighScore", -4837495843996953019L);
        setLongField(term145569, term145569.getClass(), "totalExpertHighScore", -4035391635091594438L);
        setLongField(term145569, term145569.getClass(), "totalMasterHighScore", 4081339751421418606L);
        setIntField(term145681, term145681.getClass(), "year", 2017);
        setShortField(term145681, term145681.getClass(), "month", (short) 7);
        setShortField(term145681, term145681.getClass(), "day", (short) 8);
        setField(term145680, term145680.getClass(), "date", term145681);
        setByteField(term145685, term145685.getClass(), "hour", (byte) 15);
        setByteField(term145685, term145685.getClass(), "minute", (byte) 34);
        setByteField(term145685, term145685.getClass(), "second", (byte) 50);
        setIntField(term145685, term145685.getClass(), "nano", 834312102);
        setField(term145680, term145680.getClass(), "time", term145685);
        setField(term145569, term145569.getClass(), "eventWatchedDate", term145680);
        setIntField(term145569, term145569.getClass(), "friendCount", 279047706);
        setBooleanField(term145569, term145569.getClass(), "isMaimai", false);
        setField(term145569, term145569.getClass(), "firstGameId", "eoNrxoHMqo");
        setField(term145569, term145569.getClass(), "firstRomVersion", "klaJiaCEJi");
        setField(term145569, term145569.getClass(), "firstDataVersion", "gcfVossSeW");
        setIntField(term145729, term145729.getClass(), "year", 2023);
        setShortField(term145729, term145729.getClass(), "month", (short) 11);
        setShortField(term145729, term145729.getClass(), "day", (short) 7);
        setField(term145728, term145728.getClass(), "date", term145729);
        setByteField(term145733, term145733.getClass(), "hour", (byte) 7);
        setByteField(term145733, term145733.getClass(), "minute", (byte) 24);
        setByteField(term145733, term145733.getClass(), "second", (byte) 43);
        setIntField(term145733, term145733.getClass(), "nano", 593119269);
        setField(term145728, term145728.getClass(), "time", term145733);
        setField(term145569, term145569.getClass(), "firstPlayDate", term145728);
        setField(term145569, term145569.getClass(), "lastGameId", "xBlXstmAsQ");
        setField(term145569, term145569.getClass(), "lastRomVersion", "jewrbmDdcT");
        setField(term145569, term145569.getClass(), "lastDataVersion", "ltNoNMOfWV");
        setIntField(term145775, term145775.getClass(), "year", 2024);
        setShortField(term145775, term145775.getClass(), "month", (short) 8);
        setShortField(term145775, term145775.getClass(), "day", (short) 7);
        setField(term145774, term145774.getClass(), "date", term145775);
        setByteField(term145779, term145779.getClass(), "hour", (byte) 4);
        setByteField(term145779, term145779.getClass(), "minute", (byte) 51);
        setByteField(term145779, term145779.getClass(), "second", (byte) 18);
        setIntField(term145779, term145779.getClass(), "nano", 465463653);
        setField(term145774, term145774.getClass(), "time", term145779);
        setField(term145569, term145569.getClass(), "lastPlayDate", term145774);
        setIntField(term145569, term145569.getClass(), "lastPlaceId", 330393546);
        setField(term145569, term145569.getClass(), "lastPlaceName", "VgdfvIeVod");
        setField(term145569, term145569.getClass(), "lastRegionId", "TKUDnkrdyn");
        setField(term145569, term145569.getClass(), "lastRegionName", "zyGPpAGuKz");
        setField(term145569, term145569.getClass(), "lastAllNetId", "vgJuNJDSQu");
        setField(term145569, term145569.getClass(), "lastClientId", "TokIIKaqkw");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFirstDataVersion", argTypes, term145569, args);
    }

};


