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
import java.lang.Boolean;

public class UserSurvival_setNoDamage_68326060514 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105950;
     Object term106131;

    public UserSurvival_setNoDamage_68326060514() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term105956 = new Long(-3225860270104198596L);
        term105950 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserSurvival"));
        Object term105952 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term105954 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term105970 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term105971 = newInstance(Class.forName("java.time.LocalDate"));
        Object term105975 = newInstance(Class.forName("java.time.LocalTime"));
        Object term105980 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term105981 = newInstance(Class.forName("java.time.LocalDate"));
        Object term105985 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term105950, term105950.getClass(), "id", 27732590148100485L);
        setLongField(term105952, term105952.getClass(), "id", -963498294796483851L);
        setLongField(term105954, term105954.getClass(), "id", -8667643757273196191L);
        setField(term105954, term105954.getClass(), "extId", term105956);
        setField(term105954, term105954.getClass(), "luid", "jyRmrZMyEy");
        setIntField(term105971, term105971.getClass(), "year", 2016);
        setShortField(term105971, term105971.getClass(), "month", (short) 4);
        setShortField(term105971, term105971.getClass(), "day", (short) 16);
        setField(term105970, term105970.getClass(), "date", term105971);
        setByteField(term105975, term105975.getClass(), "hour", (byte) 16);
        setByteField(term105975, term105975.getClass(), "minute", (byte) 43);
        setByteField(term105975, term105975.getClass(), "second", (byte) 51);
        setIntField(term105975, term105975.getClass(), "nano", 40671521);
        setField(term105970, term105970.getClass(), "time", term105975);
        setField(term105954, term105954.getClass(), "registerTime", term105970);
        setIntField(term105981, term105981.getClass(), "year", 2028);
        setShortField(term105981, term105981.getClass(), "month", (short) 7);
        setShortField(term105981, term105981.getClass(), "day", (short) 13);
        setField(term105980, term105980.getClass(), "date", term105981);
        setByteField(term105985, term105985.getClass(), "hour", (byte) 9);
        setByteField(term105985, term105985.getClass(), "minute", (byte) 46);
        setByteField(term105985, term105985.getClass(), "second", (byte) 40);
        setIntField(term105985, term105985.getClass(), "nano", 919051236);
        setField(term105980, term105980.getClass(), "time", term105985);
        setField(term105954, term105954.getClass(), "accessTime", term105980);
        setField(term105952, term105952.getClass(), "card", term105954);
        setIntField(term105952, term105952.getClass(), "lastDataVersion", 986125029);
        setField(term105952, term105952.getClass(), "userName", "EMhKuKuvTr");
        setIntField(term105952, term105952.getClass(), "point", -242915796);
        setIntField(term105952, term105952.getClass(), "totalPoint", 798178790);
        setIntField(term105952, term105952.getClass(), "iconId", 1885105361);
        setIntField(term105952, term105952.getClass(), "nameplateId", 406483559);
        setIntField(term105952, term105952.getClass(), "frameId", -882073821);
        setIntField(term105952, term105952.getClass(), "trophyId", -1619724361);
        setIntField(term105952, term105952.getClass(), "playCount", -448769991);
        setIntField(term105952, term105952.getClass(), "playVsCount", -2115906125);
        setIntField(term105952, term105952.getClass(), "playSyncCount", -1115852180);
        setIntField(term105952, term105952.getClass(), "winCount", 410129937);
        setIntField(term105952, term105952.getClass(), "helpCount", -1826076292);
        setIntField(term105952, term105952.getClass(), "comboCount", 1375700443);
        setIntField(term105952, term105952.getClass(), "feverCount", -1592779289);
        setIntField(term105952, term105952.getClass(), "totalHiScore", -1382233254);
        setIntField(term105952, term105952.getClass(), "totalEasyHighScore", -52296693);
        setIntField(term105952, term105952.getClass(), "totalBasicHighScore", -1374309882);
        setIntField(term105952, term105952.getClass(), "totalAdvancedHighScore", -1954550269);
        setIntField(term105952, term105952.getClass(), "totalExpertHighScore", 120683825);
        setIntField(term105952, term105952.getClass(), "totalMasterHighScore", 1923456353);
        setIntField(term105952, term105952.getClass(), "totalReMasterHighScore", -1649560697);
        setIntField(term105952, term105952.getClass(), "totalHighSync", 580727356);
        setIntField(term105952, term105952.getClass(), "totalEasySync", -1703249761);
        setIntField(term105952, term105952.getClass(), "totalBasicSync", -1444931808);
        setIntField(term105952, term105952.getClass(), "totalAdvancedSync", -12124373);
        setIntField(term105952, term105952.getClass(), "totalExpertSync", -458525211);
        setIntField(term105952, term105952.getClass(), "totalMasterSync", 79574412);
        setIntField(term105952, term105952.getClass(), "totalReMasterSync", 1278232442);
        setIntField(term105952, term105952.getClass(), "playerRating", -30189614);
        setIntField(term105952, term105952.getClass(), "highestRating", 621019431);
        setIntField(term105952, term105952.getClass(), "rankAuthTailId", 67755379);
        setField(term105952, term105952.getClass(), "eventWatchedDate", "hjuOnNVIUc");
        setField(term105952, term105952.getClass(), "webLimitDate", "MTxeYrMCEJ");
        setIntField(term105952, term105952.getClass(), "challengeTrackPhase", 546827218);
        setIntField(term105952, term105952.getClass(), "firstPlayBits", 443225664);
        setField(term105952, term105952.getClass(), "lastPlayDate", "SbPIlRKXLL");
        setIntField(term105952, term105952.getClass(), "lastPlaceId", 695264841);
        setField(term105952, term105952.getClass(), "lastPlaceName", "TGjqGBrVob");
        setIntField(term105952, term105952.getClass(), "lastRegionId", -141489831);
        setField(term105952, term105952.getClass(), "lastRegionName", "oOHlrJrFIp");
        setField(term105952, term105952.getClass(), "lastClientId", "vqZvnioIVM");
        setField(term105952, term105952.getClass(), "lastCountryCode", "CXNFlzEpBC");
        setIntField(term105952, term105952.getClass(), "eventPoint", 1842921890);
        setIntField(term105952, term105952.getClass(), "totalLv", 1488820788);
        setIntField(term105952, term105952.getClass(), "lastLoginBonusDay", -892002512);
        setIntField(term105952, term105952.getClass(), "lastSurvivalBonusDay", -8983814);
        setIntField(term105952, term105952.getClass(), "loginBonusLv", 1376766367);
        setField(term105950, term105950.getClass(), "user", term105952);
        setIntField(term105950, term105950.getClass(), "survivalId", 728709306);
        setIntField(term105950, term105950.getClass(), "totalScore", -235241687);
        setIntField(term105950, term105950.getClass(), "totalAchieve", 6575429);
        setBooleanField(term105950, term105950.getClass(), "isClear", true);
        setBooleanField(term105950, term105950.getClass(), "isNoDamage", true);
        term106131 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserSurvival");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term106131;
        callMethod(klass, "setNoDamage", argTypes, term105950, args);
    }

};


