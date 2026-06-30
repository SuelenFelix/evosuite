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

public class ExternalUserData_getExp_19048213607 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2808;

    public ExternalUserData_getExp_19048213607() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2808 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData"));
        Object term2833 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2834 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2838 = newInstance(Class.forName("java.time.LocalTime"));
        Object term2894 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2895 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2899 = newInstance(Class.forName("java.time.LocalTime"));
        Object term2942 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2943 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2947 = newInstance(Class.forName("java.time.LocalTime"));
        Object term2988 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2989 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2993 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term2808, term2808.getClass(), "accessCode", "qxSDVejjiY");
        setField(term2808, term2808.getClass(), "userName", "xBsXSDjXYK");
        setIntField(term2834, term2834.getClass(), "year", 2021);
        setShortField(term2834, term2834.getClass(), "month", (short) 8);
        setShortField(term2834, term2834.getClass(), "day", (short) 12);
        setField(term2833, term2833.getClass(), "date", term2834);
        setByteField(term2838, term2838.getClass(), "hour", (byte) 2);
        setByteField(term2838, term2838.getClass(), "minute", (byte) 17);
        setByteField(term2838, term2838.getClass(), "second", (byte) 51);
        setIntField(term2838, term2838.getClass(), "nano", 207375141);
        setField(term2833, term2833.getClass(), "time", term2838);
        setField(term2808, term2808.getClass(), "lastLoginDate", term2833);
        setBooleanField(term2808, term2808.getClass(), "isWebJoin", false);
        setField(term2808, term2808.getClass(), "webLimitDate", "sEnIVFtZuQ");
        setIntField(term2808, term2808.getClass(), "level", 202001407);
        setIntField(term2808, term2808.getClass(), "reincarnationNum", 158873461);
        setField(term2808, term2808.getClass(), "exp", "ZVecLZMLHF");
        setLongField(term2808, term2808.getClass(), "point", -3842548265506930260L);
        setLongField(term2808, term2808.getClass(), "totalPoint", -5788180182343976541L);
        setIntField(term2808, term2808.getClass(), "playCount", -430151637);
        setIntField(term2808, term2808.getClass(), "multiPlayCount", -1697741339);
        setIntField(term2808, term2808.getClass(), "multiWinCount", 98922530);
        setIntField(term2808, term2808.getClass(), "requestResCount", -1388471422);
        setIntField(term2808, term2808.getClass(), "acceptResCount", -1498296052);
        setIntField(term2808, term2808.getClass(), "successResCount", 2098647989);
        setIntField(term2808, term2808.getClass(), "playerRating", 1598895173);
        setIntField(term2808, term2808.getClass(), "highestRating", 1830648570);
        setIntField(term2808, term2808.getClass(), "nameplateId", -227365013);
        setIntField(term2808, term2808.getClass(), "frameId", 11724947);
        setIntField(term2808, term2808.getClass(), "characterId", 1953277050);
        setIntField(term2808, term2808.getClass(), "trophyId", 1283079251);
        setIntField(term2808, term2808.getClass(), "playedTutorialBit", -523949691);
        setIntField(term2808, term2808.getClass(), "firstTutorialCancelNum", 1398204340);
        setIntField(term2808, term2808.getClass(), "masterTutorialCancelNum", 229204365);
        setIntField(term2808, term2808.getClass(), "totalRepertoireCount", -461771056);
        setIntField(term2808, term2808.getClass(), "totalMapNum", -243422082);
        setLongField(term2808, term2808.getClass(), "totalHiScore", 2936323121573284007L);
        setLongField(term2808, term2808.getClass(), "totalBasicHighScore", -1154553077993834885L);
        setLongField(term2808, term2808.getClass(), "totalAdvancedHighScore", -2850532706972744550L);
        setLongField(term2808, term2808.getClass(), "totalExpertHighScore", -2644215923136513282L);
        setLongField(term2808, term2808.getClass(), "totalMasterHighScore", -1468719814009985452L);
        setIntField(term2895, term2895.getClass(), "year", 2025);
        setShortField(term2895, term2895.getClass(), "month", (short) 11);
        setShortField(term2895, term2895.getClass(), "day", (short) 3);
        setField(term2894, term2894.getClass(), "date", term2895);
        setByteField(term2899, term2899.getClass(), "hour", (byte) 21);
        setByteField(term2899, term2899.getClass(), "minute", (byte) 24);
        setByteField(term2899, term2899.getClass(), "second", (byte) 23);
        setIntField(term2899, term2899.getClass(), "nano", 210986721);
        setField(term2894, term2894.getClass(), "time", term2899);
        setField(term2808, term2808.getClass(), "eventWatchedDate", term2894);
        setIntField(term2808, term2808.getClass(), "friendCount", 1384592638);
        setBooleanField(term2808, term2808.getClass(), "isMaimai", false);
        setField(term2808, term2808.getClass(), "firstGameId", "fztQhjqwdP");
        setField(term2808, term2808.getClass(), "firstRomVersion", "eVpkWxjuki");
        setField(term2808, term2808.getClass(), "firstDataVersion", "SJiQaLvSKv");
        setIntField(term2943, term2943.getClass(), "year", 2016);
        setShortField(term2943, term2943.getClass(), "month", (short) 6);
        setShortField(term2943, term2943.getClass(), "day", (short) 15);
        setField(term2942, term2942.getClass(), "date", term2943);
        setByteField(term2947, term2947.getClass(), "hour", (byte) 21);
        setByteField(term2947, term2947.getClass(), "minute", (byte) 23);
        setByteField(term2947, term2947.getClass(), "second", (byte) 23);
        setIntField(term2947, term2947.getClass(), "nano", 433372070);
        setField(term2942, term2942.getClass(), "time", term2947);
        setField(term2808, term2808.getClass(), "firstPlayDate", term2942);
        setField(term2808, term2808.getClass(), "lastGameId", "OEXDRUKcFl");
        setField(term2808, term2808.getClass(), "lastRomVersion", "RYdKCNNMBR");
        setField(term2808, term2808.getClass(), "lastDataVersion", "yGtHPyvYiQ");
        setIntField(term2989, term2989.getClass(), "year", 2012);
        setShortField(term2989, term2989.getClass(), "month", (short) 8);
        setShortField(term2989, term2989.getClass(), "day", (short) 25);
        setField(term2988, term2988.getClass(), "date", term2989);
        setByteField(term2993, term2993.getClass(), "hour", (byte) 19);
        setByteField(term2993, term2993.getClass(), "minute", (byte) 49);
        setByteField(term2993, term2993.getClass(), "second", (byte) 8);
        setIntField(term2993, term2993.getClass(), "nano", 912685024);
        setField(term2988, term2988.getClass(), "time", term2993);
        setField(term2808, term2808.getClass(), "lastPlayDate", term2988);
        setIntField(term2808, term2808.getClass(), "lastPlaceId", -1002370457);
        setField(term2808, term2808.getClass(), "lastPlaceName", "MvRIxilFMJ");
        setField(term2808, term2808.getClass(), "lastRegionId", "iNwOJRBEjp");
        setField(term2808, term2808.getClass(), "lastRegionName", "XylxrMBraH");
        setField(term2808, term2808.getClass(), "lastAllNetId", "pORebkoRdD");
        setField(term2808, term2808.getClass(), "lastClientId", "mXGCWJDOqA");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExp", argTypes, term2808, args);
    }

};


