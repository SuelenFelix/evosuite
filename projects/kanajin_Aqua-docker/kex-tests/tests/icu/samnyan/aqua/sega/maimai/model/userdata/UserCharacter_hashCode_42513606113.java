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

public class UserCharacter_hashCode_42513606113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36365;

    public UserCharacter_hashCode_42513606113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term36371 = new Long(5671808784468963649L);
        term36365 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserCharacter"));
        Object term36367 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term36369 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term36385 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term36386 = newInstance(Class.forName("java.time.LocalDate"));
        Object term36390 = newInstance(Class.forName("java.time.LocalTime"));
        Object term36395 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term36396 = newInstance(Class.forName("java.time.LocalDate"));
        Object term36400 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term36365, term36365.getClass(), "id", -9204303423581447271L);
        setLongField(term36367, term36367.getClass(), "id", 6248239231585852341L);
        setLongField(term36369, term36369.getClass(), "id", -88538481937688851L);
        setField(term36369, term36369.getClass(), "extId", term36371);
        setField(term36369, term36369.getClass(), "luid", "vbSWeJWOQh");
        setIntField(term36386, term36386.getClass(), "year", 2018);
        setShortField(term36386, term36386.getClass(), "month", (short) 2);
        setShortField(term36386, term36386.getClass(), "day", (short) 4);
        setField(term36385, term36385.getClass(), "date", term36386);
        setByteField(term36390, term36390.getClass(), "hour", (byte) 5);
        setByteField(term36390, term36390.getClass(), "minute", (byte) 35);
        setByteField(term36390, term36390.getClass(), "second", (byte) 40);
        setIntField(term36390, term36390.getClass(), "nano", 354661894);
        setField(term36385, term36385.getClass(), "time", term36390);
        setField(term36369, term36369.getClass(), "registerTime", term36385);
        setIntField(term36396, term36396.getClass(), "year", 2010);
        setShortField(term36396, term36396.getClass(), "month", (short) 3);
        setShortField(term36396, term36396.getClass(), "day", (short) 23);
        setField(term36395, term36395.getClass(), "date", term36396);
        setByteField(term36400, term36400.getClass(), "hour", (byte) 17);
        setByteField(term36400, term36400.getClass(), "minute", (byte) 32);
        setByteField(term36400, term36400.getClass(), "second", (byte) 36);
        setIntField(term36400, term36400.getClass(), "nano", 470582535);
        setField(term36395, term36395.getClass(), "time", term36400);
        setField(term36369, term36369.getClass(), "accessTime", term36395);
        setField(term36367, term36367.getClass(), "card", term36369);
        setIntField(term36367, term36367.getClass(), "lastDataVersion", -714009282);
        setField(term36367, term36367.getClass(), "userName", "hyvFdAvkOr");
        setIntField(term36367, term36367.getClass(), "point", -1506023567);
        setIntField(term36367, term36367.getClass(), "totalPoint", 172275665);
        setIntField(term36367, term36367.getClass(), "iconId", 1472271840);
        setIntField(term36367, term36367.getClass(), "nameplateId", -2050302351);
        setIntField(term36367, term36367.getClass(), "frameId", 1778549764);
        setIntField(term36367, term36367.getClass(), "trophyId", 456140800);
        setIntField(term36367, term36367.getClass(), "playCount", -80072701);
        setIntField(term36367, term36367.getClass(), "playVsCount", -224845635);
        setIntField(term36367, term36367.getClass(), "playSyncCount", 115902179);
        setIntField(term36367, term36367.getClass(), "winCount", 930979700);
        setIntField(term36367, term36367.getClass(), "helpCount", 630565003);
        setIntField(term36367, term36367.getClass(), "comboCount", -1966988507);
        setIntField(term36367, term36367.getClass(), "feverCount", -1089838622);
        setIntField(term36367, term36367.getClass(), "totalHiScore", -937178869);
        setIntField(term36367, term36367.getClass(), "totalEasyHighScore", -1952449836);
        setIntField(term36367, term36367.getClass(), "totalBasicHighScore", -405260008);
        setIntField(term36367, term36367.getClass(), "totalAdvancedHighScore", -468459707);
        setIntField(term36367, term36367.getClass(), "totalExpertHighScore", -1652639905);
        setIntField(term36367, term36367.getClass(), "totalMasterHighScore", -1461889742);
        setIntField(term36367, term36367.getClass(), "totalReMasterHighScore", 1948939030);
        setIntField(term36367, term36367.getClass(), "totalHighSync", -1707167847);
        setIntField(term36367, term36367.getClass(), "totalEasySync", 1083097092);
        setIntField(term36367, term36367.getClass(), "totalBasicSync", -352580386);
        setIntField(term36367, term36367.getClass(), "totalAdvancedSync", 1000158617);
        setIntField(term36367, term36367.getClass(), "totalExpertSync", 776700097);
        setIntField(term36367, term36367.getClass(), "totalMasterSync", -147634418);
        setIntField(term36367, term36367.getClass(), "totalReMasterSync", 1734729002);
        setIntField(term36367, term36367.getClass(), "playerRating", 356178482);
        setIntField(term36367, term36367.getClass(), "highestRating", 2114777679);
        setIntField(term36367, term36367.getClass(), "rankAuthTailId", 877149909);
        setField(term36367, term36367.getClass(), "eventWatchedDate", "ewbQRtustW");
        setField(term36367, term36367.getClass(), "webLimitDate", "cABEHYBnys");
        setIntField(term36367, term36367.getClass(), "challengeTrackPhase", -649501188);
        setIntField(term36367, term36367.getClass(), "firstPlayBits", 2143993585);
        setField(term36367, term36367.getClass(), "lastPlayDate", "EhlWSobaco");
        setIntField(term36367, term36367.getClass(), "lastPlaceId", -2067989740);
        setField(term36367, term36367.getClass(), "lastPlaceName", "hEuycunsSe");
        setIntField(term36367, term36367.getClass(), "lastRegionId", 229990395);
        setField(term36367, term36367.getClass(), "lastRegionName", "IMFzXhpNCx");
        setField(term36367, term36367.getClass(), "lastClientId", "xAtFmANjwD");
        setField(term36367, term36367.getClass(), "lastCountryCode", "ICysuFllEZ");
        setIntField(term36367, term36367.getClass(), "eventPoint", -1374118535);
        setIntField(term36367, term36367.getClass(), "totalLv", 2009032714);
        setIntField(term36367, term36367.getClass(), "lastLoginBonusDay", -1630891015);
        setIntField(term36367, term36367.getClass(), "lastSurvivalBonusDay", 904551854);
        setIntField(term36367, term36367.getClass(), "loginBonusLv", -49272576);
        setField(term36365, term36365.getClass(), "user", term36367);
        setIntField(term36365, term36365.getClass(), "characterId", 246585268);
        setIntField(term36365, term36365.getClass(), "point", 1163312144);
        setIntField(term36365, term36365.getClass(), "level", 1010014762);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserCharacter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term36365, args);
    }

};


