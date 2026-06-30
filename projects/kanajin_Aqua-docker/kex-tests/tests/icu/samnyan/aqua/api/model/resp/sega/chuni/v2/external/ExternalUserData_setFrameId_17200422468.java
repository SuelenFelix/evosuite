package icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external;

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
import static icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class ExternalUserData_setFrameId_17200422468 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27395;
     Object term27646;

    public ExternalUserData_setFrameId_17200422468() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27395 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData"));
        Object term27420 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term27421 = newInstance(Class.forName("java.time.LocalDate"));
        Object term27425 = newInstance(Class.forName("java.time.LocalTime"));
        Object term27481 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term27482 = newInstance(Class.forName("java.time.LocalDate"));
        Object term27486 = newInstance(Class.forName("java.time.LocalTime"));
        Object term27529 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term27530 = newInstance(Class.forName("java.time.LocalDate"));
        Object term27534 = newInstance(Class.forName("java.time.LocalTime"));
        Object term27575 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term27576 = newInstance(Class.forName("java.time.LocalDate"));
        Object term27580 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term27395, term27395.getClass(), "accessCode", "wkqPmmFDAa");
        setField(term27395, term27395.getClass(), "userName", "rLTDtNqLyW");
        setIntField(term27421, term27421.getClass(), "year", 2016);
        setShortField(term27421, term27421.getClass(), "month", (short) 7);
        setShortField(term27421, term27421.getClass(), "day", (short) 21);
        setField(term27420, term27420.getClass(), "date", term27421);
        setByteField(term27425, term27425.getClass(), "hour", (byte) 22);
        setByteField(term27425, term27425.getClass(), "minute", (byte) 2);
        setByteField(term27425, term27425.getClass(), "second", (byte) 21);
        setIntField(term27425, term27425.getClass(), "nano", 729266668);
        setField(term27420, term27420.getClass(), "time", term27425);
        setField(term27395, term27395.getClass(), "lastLoginDate", term27420);
        setBooleanField(term27395, term27395.getClass(), "isWebJoin", false);
        setField(term27395, term27395.getClass(), "webLimitDate", "CLsbWobdgS");
        setIntField(term27395, term27395.getClass(), "level", -1016478729);
        setIntField(term27395, term27395.getClass(), "reincarnationNum", -206889003);
        setField(term27395, term27395.getClass(), "exp", "TbYrjEyFPc");
        setLongField(term27395, term27395.getClass(), "point", -6237686742902369498L);
        setLongField(term27395, term27395.getClass(), "totalPoint", -2286229228641472715L);
        setIntField(term27395, term27395.getClass(), "playCount", 638046409);
        setIntField(term27395, term27395.getClass(), "multiPlayCount", 427274898);
        setIntField(term27395, term27395.getClass(), "multiWinCount", -1654552020);
        setIntField(term27395, term27395.getClass(), "requestResCount", -1049546692);
        setIntField(term27395, term27395.getClass(), "acceptResCount", 1397781598);
        setIntField(term27395, term27395.getClass(), "successResCount", -44720365);
        setIntField(term27395, term27395.getClass(), "playerRating", 1963632911);
        setIntField(term27395, term27395.getClass(), "highestRating", -1100497683);
        setIntField(term27395, term27395.getClass(), "nameplateId", 155423433);
        setIntField(term27395, term27395.getClass(), "frameId", -815471632);
        setIntField(term27395, term27395.getClass(), "characterId", -1469668708);
        setIntField(term27395, term27395.getClass(), "trophyId", 1796950482);
        setIntField(term27395, term27395.getClass(), "playedTutorialBit", -945759470);
        setIntField(term27395, term27395.getClass(), "firstTutorialCancelNum", 657342039);
        setIntField(term27395, term27395.getClass(), "masterTutorialCancelNum", 1483999606);
        setIntField(term27395, term27395.getClass(), "totalRepertoireCount", 1871761182);
        setIntField(term27395, term27395.getClass(), "totalMapNum", 233983728);
        setLongField(term27395, term27395.getClass(), "totalHiScore", 7464122056779140588L);
        setLongField(term27395, term27395.getClass(), "totalBasicHighScore", 6542357174275680335L);
        setLongField(term27395, term27395.getClass(), "totalAdvancedHighScore", 206360660645917003L);
        setLongField(term27395, term27395.getClass(), "totalExpertHighScore", 8680715663951713735L);
        setLongField(term27395, term27395.getClass(), "totalMasterHighScore", -4905558793519537969L);
        setIntField(term27482, term27482.getClass(), "year", 2020);
        setShortField(term27482, term27482.getClass(), "month", (short) 5);
        setShortField(term27482, term27482.getClass(), "day", (short) 31);
        setField(term27481, term27481.getClass(), "date", term27482);
        setByteField(term27486, term27486.getClass(), "hour", (byte) 17);
        setByteField(term27486, term27486.getClass(), "minute", (byte) 5);
        setByteField(term27486, term27486.getClass(), "second", (byte) 38);
        setIntField(term27486, term27486.getClass(), "nano", 709012300);
        setField(term27481, term27481.getClass(), "time", term27486);
        setField(term27395, term27395.getClass(), "eventWatchedDate", term27481);
        setIntField(term27395, term27395.getClass(), "friendCount", -1650132476);
        setBooleanField(term27395, term27395.getClass(), "isMaimai", true);
        setField(term27395, term27395.getClass(), "firstGameId", "muefchpJiZ");
        setField(term27395, term27395.getClass(), "firstRomVersion", "tuYaAqvYrh");
        setField(term27395, term27395.getClass(), "firstDataVersion", "CIbhheukbR");
        setIntField(term27530, term27530.getClass(), "year", 2021);
        setShortField(term27530, term27530.getClass(), "month", (short) 7);
        setShortField(term27530, term27530.getClass(), "day", (short) 6);
        setField(term27529, term27529.getClass(), "date", term27530);
        setByteField(term27534, term27534.getClass(), "hour", (byte) 12);
        setByteField(term27534, term27534.getClass(), "minute", (byte) 46);
        setByteField(term27534, term27534.getClass(), "second", (byte) 42);
        setIntField(term27534, term27534.getClass(), "nano", 512890850);
        setField(term27529, term27529.getClass(), "time", term27534);
        setField(term27395, term27395.getClass(), "firstPlayDate", term27529);
        setField(term27395, term27395.getClass(), "lastGameId", "VOHPpErtan");
        setField(term27395, term27395.getClass(), "lastRomVersion", "GDMUlolTNs");
        setField(term27395, term27395.getClass(), "lastDataVersion", "xpLvWisjzN");
        setIntField(term27576, term27576.getClass(), "year", 2017);
        setShortField(term27576, term27576.getClass(), "month", (short) 2);
        setShortField(term27576, term27576.getClass(), "day", (short) 5);
        setField(term27575, term27575.getClass(), "date", term27576);
        setByteField(term27580, term27580.getClass(), "hour", (byte) 5);
        setByteField(term27580, term27580.getClass(), "minute", (byte) 46);
        setByteField(term27580, term27580.getClass(), "second", (byte) 38);
        setIntField(term27580, term27580.getClass(), "nano", 214202896);
        setField(term27575, term27575.getClass(), "time", term27580);
        setField(term27395, term27395.getClass(), "lastPlayDate", term27575);
        setIntField(term27395, term27395.getClass(), "lastPlaceId", 1719680265);
        setField(term27395, term27395.getClass(), "lastPlaceName", "IKfozyyKEj");
        setField(term27395, term27395.getClass(), "lastRegionId", "thCjwQjRBL");
        setField(term27395, term27395.getClass(), "lastRegionName", "ojLrjltndD");
        setField(term27395, term27395.getClass(), "lastAllNetId", "VJtFSexKat");
        setField(term27395, term27395.getClass(), "lastClientId", "xPVddlPSQR");
        term27646 = new Integer(-1890898783);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term27646;
        callMethod(klass, "setFrameId", argTypes, term27395, args);
    }

};


