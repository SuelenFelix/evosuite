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

public class ExternalUserData_getMultiWinCount_47214748212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4813;

    public ExternalUserData_getMultiWinCount_47214748212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4813 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData"));
        Object term4838 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4839 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4843 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4899 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4900 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4904 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4947 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4948 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4952 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4993 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4994 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4998 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term4813, term4813.getClass(), "accessCode", "DyiXbeYIaN");
        setField(term4813, term4813.getClass(), "userName", "VGizxZnyHX");
        setIntField(term4839, term4839.getClass(), "year", 2012);
        setShortField(term4839, term4839.getClass(), "month", (short) 4);
        setShortField(term4839, term4839.getClass(), "day", (short) 25);
        setField(term4838, term4838.getClass(), "date", term4839);
        setByteField(term4843, term4843.getClass(), "hour", (byte) 21);
        setByteField(term4843, term4843.getClass(), "minute", (byte) 14);
        setByteField(term4843, term4843.getClass(), "second", (byte) 15);
        setIntField(term4843, term4843.getClass(), "nano", 561700934);
        setField(term4838, term4838.getClass(), "time", term4843);
        setField(term4813, term4813.getClass(), "lastLoginDate", term4838);
        setBooleanField(term4813, term4813.getClass(), "isWebJoin", true);
        setField(term4813, term4813.getClass(), "webLimitDate", "kVEZMHmRtR");
        setIntField(term4813, term4813.getClass(), "level", 1935707624);
        setIntField(term4813, term4813.getClass(), "reincarnationNum", 1507074215);
        setField(term4813, term4813.getClass(), "exp", "ekxGuOYIwi");
        setLongField(term4813, term4813.getClass(), "point", -8652538484981166496L);
        setLongField(term4813, term4813.getClass(), "totalPoint", 2701184207686293431L);
        setIntField(term4813, term4813.getClass(), "playCount", -282881827);
        setIntField(term4813, term4813.getClass(), "multiPlayCount", -1183353915);
        setIntField(term4813, term4813.getClass(), "multiWinCount", -420030135);
        setIntField(term4813, term4813.getClass(), "requestResCount", 267763294);
        setIntField(term4813, term4813.getClass(), "acceptResCount", -1497710478);
        setIntField(term4813, term4813.getClass(), "successResCount", 49950830);
        setIntField(term4813, term4813.getClass(), "playerRating", -525257914);
        setIntField(term4813, term4813.getClass(), "highestRating", 147209682);
        setIntField(term4813, term4813.getClass(), "nameplateId", 34470066);
        setIntField(term4813, term4813.getClass(), "frameId", 2058711405);
        setIntField(term4813, term4813.getClass(), "characterId", 1743683601);
        setIntField(term4813, term4813.getClass(), "trophyId", -945116798);
        setIntField(term4813, term4813.getClass(), "playedTutorialBit", 1593461795);
        setIntField(term4813, term4813.getClass(), "firstTutorialCancelNum", 515182546);
        setIntField(term4813, term4813.getClass(), "masterTutorialCancelNum", -936895502);
        setIntField(term4813, term4813.getClass(), "totalRepertoireCount", -129547140);
        setIntField(term4813, term4813.getClass(), "totalMapNum", 199287428);
        setLongField(term4813, term4813.getClass(), "totalHiScore", 4474998035090263139L);
        setLongField(term4813, term4813.getClass(), "totalBasicHighScore", 2848819812340321742L);
        setLongField(term4813, term4813.getClass(), "totalAdvancedHighScore", -8876856890348836498L);
        setLongField(term4813, term4813.getClass(), "totalExpertHighScore", 846579494941632714L);
        setLongField(term4813, term4813.getClass(), "totalMasterHighScore", 6689117472719450333L);
        setIntField(term4900, term4900.getClass(), "year", 2011);
        setShortField(term4900, term4900.getClass(), "month", (short) 10);
        setShortField(term4900, term4900.getClass(), "day", (short) 25);
        setField(term4899, term4899.getClass(), "date", term4900);
        setByteField(term4904, term4904.getClass(), "hour", (byte) 10);
        setByteField(term4904, term4904.getClass(), "minute", (byte) 33);
        setByteField(term4904, term4904.getClass(), "second", (byte) 8);
        setIntField(term4904, term4904.getClass(), "nano", 268304014);
        setField(term4899, term4899.getClass(), "time", term4904);
        setField(term4813, term4813.getClass(), "eventWatchedDate", term4899);
        setIntField(term4813, term4813.getClass(), "friendCount", -1195339592);
        setBooleanField(term4813, term4813.getClass(), "isMaimai", false);
        setField(term4813, term4813.getClass(), "firstGameId", "RbVQXSpxXy");
        setField(term4813, term4813.getClass(), "firstRomVersion", "YpJbIgJWWv");
        setField(term4813, term4813.getClass(), "firstDataVersion", "JppkknKVOw");
        setIntField(term4948, term4948.getClass(), "year", 2024);
        setShortField(term4948, term4948.getClass(), "month", (short) 5);
        setShortField(term4948, term4948.getClass(), "day", (short) 6);
        setField(term4947, term4947.getClass(), "date", term4948);
        setByteField(term4952, term4952.getClass(), "hour", (byte) 20);
        setByteField(term4952, term4952.getClass(), "minute", (byte) 14);
        setByteField(term4952, term4952.getClass(), "second", (byte) 27);
        setIntField(term4952, term4952.getClass(), "nano", 900636101);
        setField(term4947, term4947.getClass(), "time", term4952);
        setField(term4813, term4813.getClass(), "firstPlayDate", term4947);
        setField(term4813, term4813.getClass(), "lastGameId", "iljANwuEjk");
        setField(term4813, term4813.getClass(), "lastRomVersion", "kNqaJKIATy");
        setField(term4813, term4813.getClass(), "lastDataVersion", "vKQukfbJUd");
        setIntField(term4994, term4994.getClass(), "year", 2021);
        setShortField(term4994, term4994.getClass(), "month", (short) 4);
        setShortField(term4994, term4994.getClass(), "day", (short) 17);
        setField(term4993, term4993.getClass(), "date", term4994);
        setByteField(term4998, term4998.getClass(), "hour", (byte) 4);
        setByteField(term4998, term4998.getClass(), "minute", (byte) 11);
        setByteField(term4998, term4998.getClass(), "second", (byte) 16);
        setIntField(term4998, term4998.getClass(), "nano", 509895858);
        setField(term4993, term4993.getClass(), "time", term4998);
        setField(term4813, term4813.getClass(), "lastPlayDate", term4993);
        setIntField(term4813, term4813.getClass(), "lastPlaceId", -376422566);
        setField(term4813, term4813.getClass(), "lastPlaceName", "lFRJFUMVbx");
        setField(term4813, term4813.getClass(), "lastRegionId", "sZdUNdggUW");
        setField(term4813, term4813.getClass(), "lastRegionName", "OqbwYQfvAe");
        setField(term4813, term4813.getClass(), "lastAllNetId", "tRxZafjqIx");
        setField(term4813, term4813.getClass(), "lastClientId", "DhjNLmRMCu");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMultiWinCount", argTypes, term4813, args);
    }

};


