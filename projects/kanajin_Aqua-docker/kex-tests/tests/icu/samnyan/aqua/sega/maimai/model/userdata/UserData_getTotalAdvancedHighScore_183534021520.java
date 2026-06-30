package icu.samnyan.aqua.sega.maimai.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class UserData_getTotalAdvancedHighScore_183534021520 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5281;

    public UserData_getTotalAdvancedHighScore_183534021520() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5285 = new Long(8428634514691209827L);
        term5281 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term5283 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term5299 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5300 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5304 = newInstance(Class.forName("java.time.LocalTime"));
        Object term5309 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5310 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5314 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term5281, term5281.getClass(), "id", 4178434741742309755L);
        setLongField(term5283, term5283.getClass(), "id", -2068172595987555756L);
        setField(term5283, term5283.getClass(), "extId", term5285);
        setField(term5283, term5283.getClass(), "luid", "DyiXbeYIaN");
        setIntField(term5300, term5300.getClass(), "year", 2015);
        setShortField(term5300, term5300.getClass(), "month", (short) 12);
        setShortField(term5300, term5300.getClass(), "day", (short) 23);
        setField(term5299, term5299.getClass(), "date", term5300);
        setByteField(term5304, term5304.getClass(), "hour", (byte) 14);
        setByteField(term5304, term5304.getClass(), "minute", (byte) 17);
        setByteField(term5304, term5304.getClass(), "second", (byte) 50);
        setIntField(term5304, term5304.getClass(), "nano", 325544804);
        setField(term5299, term5299.getClass(), "time", term5304);
        setField(term5283, term5283.getClass(), "registerTime", term5299);
        setIntField(term5310, term5310.getClass(), "year", 2027);
        setShortField(term5310, term5310.getClass(), "month", (short) 11);
        setShortField(term5310, term5310.getClass(), "day", (short) 8);
        setField(term5309, term5309.getClass(), "date", term5310);
        setByteField(term5314, term5314.getClass(), "hour", (byte) 11);
        setByteField(term5314, term5314.getClass(), "minute", (byte) 59);
        setByteField(term5314, term5314.getClass(), "second", (byte) 14);
        setIntField(term5314, term5314.getClass(), "nano", 322375591);
        setField(term5309, term5309.getClass(), "time", term5314);
        setField(term5283, term5283.getClass(), "accessTime", term5309);
        setField(term5281, term5281.getClass(), "card", term5283);
        setIntField(term5281, term5281.getClass(), "lastDataVersion", 1631305277);
        setField(term5281, term5281.getClass(), "userName", "VGizxZnyHX");
        setIntField(term5281, term5281.getClass(), "point", 162113491);
        setIntField(term5281, term5281.getClass(), "totalPoint", -932147928);
        setIntField(term5281, term5281.getClass(), "iconId", 487369012);
        setIntField(term5281, term5281.getClass(), "nameplateId", -179238712);
        setIntField(term5281, term5281.getClass(), "frameId", -2018735535);
        setIntField(term5281, term5281.getClass(), "trophyId", -658524954);
        setIntField(term5281, term5281.getClass(), "playCount", -2009613557);
        setIntField(term5281, term5281.getClass(), "playVsCount", 654195547);
        setIntField(term5281, term5281.getClass(), "playSyncCount", 1622857008);
        setIntField(term5281, term5281.getClass(), "winCount", 934338954);
        setIntField(term5281, term5281.getClass(), "helpCount", 598635505);
        setIntField(term5281, term5281.getClass(), "comboCount", -944986533);
        setIntField(term5281, term5281.getClass(), "feverCount", 1894454926);
        setIntField(term5281, term5281.getClass(), "totalHiScore", 1415142780);
        setIntField(term5281, term5281.getClass(), "totalEasyHighScore", -574105759);
        setIntField(term5281, term5281.getClass(), "totalBasicHighScore", -1165271567);
        setIntField(term5281, term5281.getClass(), "totalAdvancedHighScore", 376834234);
        setIntField(term5281, term5281.getClass(), "totalExpertHighScore", -1911972560);
        setIntField(term5281, term5281.getClass(), "totalMasterHighScore", -642716895);
        setIntField(term5281, term5281.getClass(), "totalReMasterHighScore", 1743398246);
        setIntField(term5281, term5281.getClass(), "totalHighSync", -934658823);
        setIntField(term5281, term5281.getClass(), "totalEasySync", 1632177303);
        setIntField(term5281, term5281.getClass(), "totalBasicSync", -802592348);
        setIntField(term5281, term5281.getClass(), "totalAdvancedSync", -1576584269);
        setIntField(term5281, term5281.getClass(), "totalExpertSync", 1474899591);
        setIntField(term5281, term5281.getClass(), "totalMasterSync", 297582552);
        setIntField(term5281, term5281.getClass(), "totalReMasterSync", -1485916498);
        setIntField(term5281, term5281.getClass(), "playerRating", 722787672);
        setIntField(term5281, term5281.getClass(), "highestRating", 2077491675);
        setIntField(term5281, term5281.getClass(), "rankAuthTailId", -1728316609);
        setField(term5281, term5281.getClass(), "eventWatchedDate", "kVEZMHmRtR");
        setField(term5281, term5281.getClass(), "webLimitDate", "ekxGuOYIwi");
        setIntField(term5281, term5281.getClass(), "challengeTrackPhase", 47118909);
        setIntField(term5281, term5281.getClass(), "firstPlayBits", -2093707412);
        setField(term5281, term5281.getClass(), "lastPlayDate", "RbVQXSpxXy");
        setIntField(term5281, term5281.getClass(), "lastPlaceId", -680627153);
        setField(term5281, term5281.getClass(), "lastPlaceName", "YpJbIgJWWv");
        setIntField(term5281, term5281.getClass(), "lastRegionId", 722519669);
        setField(term5281, term5281.getClass(), "lastRegionName", "JppkknKVOw");
        setField(term5281, term5281.getClass(), "lastClientId", "iljANwuEjk");
        setField(term5281, term5281.getClass(), "lastCountryCode", "kNqaJKIATy");
        setIntField(term5281, term5281.getClass(), "eventPoint", -40335961);
        setIntField(term5281, term5281.getClass(), "totalLv", 175343605);
        setIntField(term5281, term5281.getClass(), "lastLoginBonusDay", 1050853183);
        setIntField(term5281, term5281.getClass(), "lastSurvivalBonusDay", 848428785);
        setIntField(term5281, term5281.getClass(), "loginBonusLv", -1984436481);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalAdvancedHighScore", argTypes, term5281, args);
    }

};


