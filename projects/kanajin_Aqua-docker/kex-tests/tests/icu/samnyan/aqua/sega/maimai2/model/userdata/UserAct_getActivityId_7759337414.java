package icu.samnyan.aqua.sega.maimai2.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai2.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;
import java.util.ArrayList;
import java.lang.Integer;

public class UserAct_getActivityId_7759337414 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2286;

    public UserAct_getActivityId_7759337414() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2292 = new Long(5270370404989704783L);
        Integer term2355 = new Integer(-1179120542);
        Integer term2357 = new Integer(-73683645);
        Integer term2359 = new Integer(-226514366);
        Integer term2361 = new Integer(1193880199);
        Integer term2363 = new Integer(-1087774327);
        Integer term2365 = new Integer(-1530420153);
        Integer term2367 = new Integer(-469968304);
        ArrayList term2353 = new ArrayList();
        ((ArrayList) term2353).add(term2355);
        ((ArrayList) term2353).add(term2357);
        ((ArrayList) term2353).add(term2359);
        ((ArrayList) term2353).add(term2361);
        ((ArrayList) term2353).add(term2363);
        ((ArrayList) term2353).add(term2365);
        ((ArrayList) term2353).add(term2367);
        Integer term2373 = new Integer(-1145578966);
        ArrayList term2371 = new ArrayList();
        ((ArrayList) term2371).add(term2373);
        term2286 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserAct"));
        Object term2288 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term2290 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term2306 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2307 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2311 = newInstance(Class.forName("java.time.LocalTime"));
        Object term2316 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2317 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2321 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term2286, term2286.getClass(), "id", 7862575738391801707L);
        setLongField(term2288, term2288.getClass(), "id", 50358265865610362L);
        setLongField(term2290, term2290.getClass(), "id", 5510783420697225605L);
        setField(term2290, term2290.getClass(), "extId", term2292);
        setField(term2290, term2290.getClass(), "luid", "cAPeiZHKGJ");
        setIntField(term2307, term2307.getClass(), "year", 2029);
        setShortField(term2307, term2307.getClass(), "month", (short) 8);
        setShortField(term2307, term2307.getClass(), "day", (short) 29);
        setField(term2306, term2306.getClass(), "date", term2307);
        setByteField(term2311, term2311.getClass(), "hour", (byte) 15);
        setByteField(term2311, term2311.getClass(), "minute", (byte) 50);
        setByteField(term2311, term2311.getClass(), "second", (byte) 1);
        setIntField(term2311, term2311.getClass(), "nano", 277971904);
        setField(term2306, term2306.getClass(), "time", term2311);
        setField(term2290, term2290.getClass(), "registerTime", term2306);
        setIntField(term2317, term2317.getClass(), "year", 2022);
        setShortField(term2317, term2317.getClass(), "month", (short) 11);
        setShortField(term2317, term2317.getClass(), "day", (short) 16);
        setField(term2316, term2316.getClass(), "date", term2317);
        setByteField(term2321, term2321.getClass(), "hour", (byte) 15);
        setByteField(term2321, term2321.getClass(), "minute", (byte) 54);
        setByteField(term2321, term2321.getClass(), "second", (byte) 2);
        setIntField(term2321, term2321.getClass(), "nano", 733274103);
        setField(term2316, term2316.getClass(), "time", term2321);
        setField(term2290, term2290.getClass(), "accessTime", term2316);
        setField(term2288, term2288.getClass(), "card", term2290);
        setField(term2288, term2288.getClass(), "userName", "LvJFtLBaxj");
        setIntField(term2288, term2288.getClass(), "isNetMember", 1384592638);
        setIntField(term2288, term2288.getClass(), "iconId", -1002370457);
        setIntField(term2288, term2288.getClass(), "plateId", -2014576105);
        setIntField(term2288, term2288.getClass(), "titleId", 1296895584);
        setIntField(term2288, term2288.getClass(), "partnerId", 628918458);
        setIntField(term2288, term2288.getClass(), "frameId", -1274456137);
        setIntField(term2288, term2288.getClass(), "selectMapId", 1041916673);
        setIntField(term2288, term2288.getClass(), "totalAwake", -601863069);
        setIntField(term2288, term2288.getClass(), "gradeRating", 663292551);
        setIntField(term2288, term2288.getClass(), "musicRating", -1885090354);
        setIntField(term2288, term2288.getClass(), "playerRating", -2066804303);
        setIntField(term2288, term2288.getClass(), "highestRating", -1731761810);
        setIntField(term2288, term2288.getClass(), "gradeRank", 197109649);
        setIntField(term2288, term2288.getClass(), "classRank", -1239406390);
        setIntField(term2288, term2288.getClass(), "courseRank", 1557431527);
        setField(term2288, term2288.getClass(), "charaSlot", term2353);
        setField(term2288, term2288.getClass(), "charaLockSlot", term2371);
        setLongField(term2288, term2288.getClass(), "contentBit", 6005241913654469005L);
        setIntField(term2288, term2288.getClass(), "playCount", -1504890659);
        setField(term2288, term2288.getClass(), "eventWatchedDate", "PHvxnGHptP");
        setField(term2288, term2288.getClass(), "lastGameId", "TimdotUuNC");
        setField(term2288, term2288.getClass(), "lastRomVersion", "PkWMRdJcBb");
        setField(term2288, term2288.getClass(), "lastDataVersion", "jSpAteRute");
        setField(term2288, term2288.getClass(), "lastLoginDate", "swZVeJAxjt");
        setField(term2288, term2288.getClass(), "lastPlayDate", "xOcJIiQQDu");
        setIntField(term2288, term2288.getClass(), "lastPlayCredit", 1358829571);
        setIntField(term2288, term2288.getClass(), "lastPlayMode", 991356662);
        setIntField(term2288, term2288.getClass(), "lastPlaceId", -506958186);
        setField(term2288, term2288.getClass(), "lastPlaceName", "GVizqqzXpy");
        setIntField(term2288, term2288.getClass(), "lastAllNetId", -507387516);
        setIntField(term2288, term2288.getClass(), "lastRegionId", -1970452551);
        setField(term2288, term2288.getClass(), "lastRegionName", "JqXGgAhZPl");
        setField(term2288, term2288.getClass(), "lastClientId", "jiKYgYHqIS");
        setField(term2288, term2288.getClass(), "lastCountryCode", "DfISiziTgG");
        setIntField(term2288, term2288.getClass(), "lastSelectEMoney", -1896376975);
        setIntField(term2288, term2288.getClass(), "lastSelectTicket", 729658803);
        setIntField(term2288, term2288.getClass(), "lastSelectCourse", 114754804);
        setIntField(term2288, term2288.getClass(), "lastCountCourse", 1687361082);
        setField(term2288, term2288.getClass(), "firstGameId", "XqgfKFvPSD");
        setField(term2288, term2288.getClass(), "firstRomVersion", "JiVRgTZvKc");
        setField(term2288, term2288.getClass(), "firstDataVersion", "XPKmummaqg");
        setField(term2288, term2288.getClass(), "firstPlayDate", "BKLfkLiZTH");
        setField(term2288, term2288.getClass(), "compatibleCmVersion", "SPpkrGcPRr");
        setField(term2288, term2288.getClass(), "dailyBonusDate", "sEccwbJKYE");
        setField(term2288, term2288.getClass(), "dailyCourseBonusDate", "AWRooQKkdW");
        setField(term2288, term2288.getClass(), "lastPairLoginDate", "vjxIhXHxGR");
        setField(term2288, term2288.getClass(), "lastTrialPlayDate", "QXzGXbEXMu");
        setIntField(term2288, term2288.getClass(), "playVsCount", 584893196);
        setIntField(term2288, term2288.getClass(), "playSyncCount", 497269071);
        setIntField(term2288, term2288.getClass(), "winCount", -1899301124);
        setIntField(term2288, term2288.getClass(), "helpCount", -1882480155);
        setIntField(term2288, term2288.getClass(), "comboCount", -1410220680);
        setLongField(term2288, term2288.getClass(), "totalDeluxscore", -1983291584002806658L);
        setLongField(term2288, term2288.getClass(), "totalBasicDeluxscore", 5946780097489996391L);
        setLongField(term2288, term2288.getClass(), "totalAdvancedDeluxscore", -8652538484981166496L);
        setLongField(term2288, term2288.getClass(), "totalExpertDeluxscore", 2701184207686293431L);
        setLongField(term2288, term2288.getClass(), "totalMasterDeluxscore", 4474998035090263139L);
        setLongField(term2288, term2288.getClass(), "totalReMasterDeluxscore", 2848819812340321742L);
        setIntField(term2288, term2288.getClass(), "totalSync", 389427431);
        setIntField(term2288, term2288.getClass(), "totalBasicSync", -1945706126);
        setIntField(term2288, term2288.getClass(), "totalAdvancedSync", 1152356969);
        setIntField(term2288, term2288.getClass(), "totalExpertSync", -1667990367);
        setIntField(term2288, term2288.getClass(), "totalMasterSync", -1214628358);
        setIntField(term2288, term2288.getClass(), "totalReMasterSync", 1102721075);
        setLongField(term2288, term2288.getClass(), "totalAchievement", -8876856890348836498L);
        setLongField(term2288, term2288.getClass(), "totalBasicAchievement", 846579494941632714L);
        setLongField(term2288, term2288.getClass(), "totalAdvancedAchievement", 6689117472719450333L);
        setLongField(term2288, term2288.getClass(), "totalExpertAchievement", 5836128569274066678L);
        setLongField(term2288, term2288.getClass(), "totalMasterAchievement", -2177368829816872572L);
        setLongField(term2288, term2288.getClass(), "totalReMasterAchievement", -8463029266761149071L);
        setLongField(term2288, term2288.getClass(), "playerOldRating", 3133860696238261492L);
        setLongField(term2288, term2288.getClass(), "playerNewRating", 7247160664318067468L);
        setIntField(term2288, term2288.getClass(), "banState", -426764678);
        setLongField(term2288, term2288.getClass(), "dateTime", 2135754395358000892L);
        setField(term2286, term2286.getClass(), "user", term2288);
        setIntField(term2286, term2286.getClass(), "kind", -1222614956);
        setIntField(term2286, term2286.getClass(), "activityId", -1870495012);
        setLongField(term2286, term2286.getClass(), "sortNumber", -8085190702504231560L);
        setIntField(term2286, term2286.getClass(), "param1", -1310015129);
        setIntField(term2286, term2286.getClass(), "param2", -2104981311);
        setIntField(term2286, term2286.getClass(), "param3", -571169753);
        setIntField(term2286, term2286.getClass(), "param4", 318591690);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserAct");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getActivityId", argTypes, term2286, args);
    }

};


