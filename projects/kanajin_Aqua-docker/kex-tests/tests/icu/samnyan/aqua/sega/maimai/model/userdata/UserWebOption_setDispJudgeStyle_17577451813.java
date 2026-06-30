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
import java.lang.Integer;

public class UserWebOption_setDispJudgeStyle_17577451813 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41059;
     Object term41241;

    public UserWebOption_setDispJudgeStyle_17577451813() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term41065 = new Long(7495904023107549024L);
        term41059 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserWebOption"));
        Object term41061 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term41063 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term41079 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term41080 = newInstance(Class.forName("java.time.LocalDate"));
        Object term41084 = newInstance(Class.forName("java.time.LocalTime"));
        Object term41089 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term41090 = newInstance(Class.forName("java.time.LocalDate"));
        Object term41094 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term41059, term41059.getClass(), "id", 6315101499811179240L);
        setLongField(term41061, term41061.getClass(), "id", -3033337370154155851L);
        setLongField(term41063, term41063.getClass(), "id", -3130003589475815807L);
        setField(term41063, term41063.getClass(), "extId", term41065);
        setField(term41063, term41063.getClass(), "luid", "iOCnOQXWTl");
        setIntField(term41080, term41080.getClass(), "year", 2020);
        setShortField(term41080, term41080.getClass(), "month", (short) 5);
        setShortField(term41080, term41080.getClass(), "day", (short) 31);
        setField(term41079, term41079.getClass(), "date", term41080);
        setByteField(term41084, term41084.getClass(), "hour", (byte) 17);
        setByteField(term41084, term41084.getClass(), "minute", (byte) 5);
        setByteField(term41084, term41084.getClass(), "second", (byte) 38);
        setIntField(term41084, term41084.getClass(), "nano", 709012300);
        setField(term41079, term41079.getClass(), "time", term41084);
        setField(term41063, term41063.getClass(), "registerTime", term41079);
        setIntField(term41090, term41090.getClass(), "year", 2021);
        setShortField(term41090, term41090.getClass(), "month", (short) 7);
        setShortField(term41090, term41090.getClass(), "day", (short) 6);
        setField(term41089, term41089.getClass(), "date", term41090);
        setByteField(term41094, term41094.getClass(), "hour", (byte) 12);
        setByteField(term41094, term41094.getClass(), "minute", (byte) 46);
        setByteField(term41094, term41094.getClass(), "second", (byte) 42);
        setIntField(term41094, term41094.getClass(), "nano", 512890850);
        setField(term41089, term41089.getClass(), "time", term41094);
        setField(term41063, term41063.getClass(), "accessTime", term41089);
        setField(term41061, term41061.getClass(), "card", term41063);
        setIntField(term41061, term41061.getClass(), "lastDataVersion", 1527746173);
        setField(term41061, term41061.getClass(), "userName", "ARnOWpgtAg");
        setIntField(term41061, term41061.getClass(), "point", -1236801752);
        setIntField(term41061, term41061.getClass(), "totalPoint", -1407542097);
        setIntField(term41061, term41061.getClass(), "iconId", 844756084);
        setIntField(term41061, term41061.getClass(), "nameplateId", -1078424855);
        setIntField(term41061, term41061.getClass(), "frameId", -17867996);
        setIntField(term41061, term41061.getClass(), "trophyId", -586625757);
        setIntField(term41061, term41061.getClass(), "playCount", -111956576);
        setIntField(term41061, term41061.getClass(), "playVsCount", 746489478);
        setIntField(term41061, term41061.getClass(), "playSyncCount", 620249855);
        setIntField(term41061, term41061.getClass(), "winCount", -1978063697);
        setIntField(term41061, term41061.getClass(), "helpCount", -1375837847);
        setIntField(term41061, term41061.getClass(), "comboCount", 591972229);
        setIntField(term41061, term41061.getClass(), "feverCount", 1509332180);
        setIntField(term41061, term41061.getClass(), "totalHiScore", 1537664818);
        setIntField(term41061, term41061.getClass(), "totalEasyHighScore", -1542814057);
        setIntField(term41061, term41061.getClass(), "totalBasicHighScore", -813013442);
        setIntField(term41061, term41061.getClass(), "totalAdvancedHighScore", 129913260);
        setIntField(term41061, term41061.getClass(), "totalExpertHighScore", 1161032682);
        setIntField(term41061, term41061.getClass(), "totalMasterHighScore", 345139347);
        setIntField(term41061, term41061.getClass(), "totalReMasterHighScore", 972415791);
        setIntField(term41061, term41061.getClass(), "totalHighSync", -263062220);
        setIntField(term41061, term41061.getClass(), "totalEasySync", -814910184);
        setIntField(term41061, term41061.getClass(), "totalBasicSync", -82425798);
        setIntField(term41061, term41061.getClass(), "totalAdvancedSync", 12949829);
        setIntField(term41061, term41061.getClass(), "totalExpertSync", 169106608);
        setIntField(term41061, term41061.getClass(), "totalMasterSync", 735667683);
        setIntField(term41061, term41061.getClass(), "totalReMasterSync", -2099694093);
        setIntField(term41061, term41061.getClass(), "playerRating", -1230860198);
        setIntField(term41061, term41061.getClass(), "highestRating", -756895441);
        setIntField(term41061, term41061.getClass(), "rankAuthTailId", -415493508);
        setField(term41061, term41061.getClass(), "eventWatchedDate", "MRrYxZoJBW");
        setField(term41061, term41061.getClass(), "webLimitDate", "fheZXFNQZh");
        setIntField(term41061, term41061.getClass(), "challengeTrackPhase", -2039940861);
        setIntField(term41061, term41061.getClass(), "firstPlayBits", 1657238527);
        setField(term41061, term41061.getClass(), "lastPlayDate", "YxHVWlebna");
        setIntField(term41061, term41061.getClass(), "lastPlaceId", -1118052096);
        setField(term41061, term41061.getClass(), "lastPlaceName", "IEmAQCkrPE");
        setIntField(term41061, term41061.getClass(), "lastRegionId", 789771906);
        setField(term41061, term41061.getClass(), "lastRegionName", "lqFGhtlNRM");
        setField(term41061, term41061.getClass(), "lastClientId", "GLxLHUsuLw");
        setField(term41061, term41061.getClass(), "lastCountryCode", "HuKdqrrxIm");
        setIntField(term41061, term41061.getClass(), "eventPoint", 1156356127);
        setIntField(term41061, term41061.getClass(), "totalLv", -2104118662);
        setIntField(term41061, term41061.getClass(), "lastLoginBonusDay", -420723612);
        setIntField(term41061, term41061.getClass(), "lastSurvivalBonusDay", -1133208152);
        setIntField(term41061, term41061.getClass(), "loginBonusLv", -696625342);
        setField(term41059, term41059.getClass(), "user", term41061);
        setBooleanField(term41059, term41059.getClass(), "isNetMember", true);
        setIntField(term41059, term41059.getClass(), "dispRate", -1414592494);
        setIntField(term41059, term41059.getClass(), "dispJudgeStyle", 1786579332);
        setIntField(term41059, term41059.getClass(), "dispRank", 1501260437);
        setIntField(term41059, term41059.getClass(), "dispHomeRanker", -76595520);
        setIntField(term41059, term41059.getClass(), "dispTotalLv", 1443232393);
        term41241 = new Integer(-1910414427);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserWebOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term41241;
        callMethod(klass, "setDispJudgeStyle", argTypes, term41059, args);
    }

};


