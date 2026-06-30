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

public class UserDetail_setTotalDeluxscore_1672568388132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4304915;
     Object term4305264;

    public UserDetail_setTotalDeluxscore_1672568388132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4304919 = new Long(-2320858494141057588L);
        ArrayList term4304980 = new ArrayList();
        Integer term4304986 = new Integer(1888684596);
        Integer term4304988 = new Integer(1391968678);
        Integer term4304990 = new Integer(-573573198);
        Integer term4304992 = new Integer(-721584808);
        Integer term4304994 = new Integer(2146307582);
        ArrayList term4304984 = new ArrayList();
        ((ArrayList) term4304984).add(term4304986);
        ((ArrayList) term4304984).add(term4304988);
        ((ArrayList) term4304984).add(term4304990);
        ((ArrayList) term4304984).add(term4304992);
        ((ArrayList) term4304984).add(term4304994);
        term4304915 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4304917 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4304933 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4304934 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4304938 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4304943 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4304944 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4304948 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4304915, term4304915.getClass(), "id", -4249911058099585328L);
        setLongField(term4304917, term4304917.getClass(), "id", 4401268324774043984L);
        setField(term4304917, term4304917.getClass(), "extId", term4304919);
        setField(term4304917, term4304917.getClass(), "luid", "vWZpnJSWIH");
        setIntField(term4304934, term4304934.getClass(), "year", 2013);
        setShortField(term4304934, term4304934.getClass(), "month", (short) 11);
        setShortField(term4304934, term4304934.getClass(), "day", (short) 7);
        setField(term4304933, term4304933.getClass(), "date", term4304934);
        setByteField(term4304938, term4304938.getClass(), "hour", (byte) 3);
        setByteField(term4304938, term4304938.getClass(), "minute", (byte) 42);
        setByteField(term4304938, term4304938.getClass(), "second", (byte) 13);
        setIntField(term4304938, term4304938.getClass(), "nano", 790882548);
        setField(term4304933, term4304933.getClass(), "time", term4304938);
        setField(term4304917, term4304917.getClass(), "registerTime", term4304933);
        setIntField(term4304944, term4304944.getClass(), "year", 2026);
        setShortField(term4304944, term4304944.getClass(), "month", (short) 2);
        setShortField(term4304944, term4304944.getClass(), "day", (short) 25);
        setField(term4304943, term4304943.getClass(), "date", term4304944);
        setByteField(term4304948, term4304948.getClass(), "hour", (byte) 9);
        setByteField(term4304948, term4304948.getClass(), "minute", (byte) 28);
        setByteField(term4304948, term4304948.getClass(), "second", (byte) 31);
        setIntField(term4304948, term4304948.getClass(), "nano", 309985369);
        setField(term4304943, term4304943.getClass(), "time", term4304948);
        setField(term4304917, term4304917.getClass(), "accessTime", term4304943);
        setField(term4304915, term4304915.getClass(), "card", term4304917);
        setField(term4304915, term4304915.getClass(), "userName", "gZoIGmpMnl");
        setIntField(term4304915, term4304915.getClass(), "isNetMember", -2102184856);
        setIntField(term4304915, term4304915.getClass(), "iconId", -1405907223);
        setIntField(term4304915, term4304915.getClass(), "plateId", -1719992953);
        setIntField(term4304915, term4304915.getClass(), "titleId", 41421630);
        setIntField(term4304915, term4304915.getClass(), "partnerId", 621331014);
        setIntField(term4304915, term4304915.getClass(), "frameId", 66564468);
        setIntField(term4304915, term4304915.getClass(), "selectMapId", 1519784520);
        setIntField(term4304915, term4304915.getClass(), "totalAwake", -1487489184);
        setIntField(term4304915, term4304915.getClass(), "gradeRating", -644343183);
        setIntField(term4304915, term4304915.getClass(), "musicRating", -929324757);
        setIntField(term4304915, term4304915.getClass(), "playerRating", 440249216);
        setIntField(term4304915, term4304915.getClass(), "highestRating", 1634860237);
        setIntField(term4304915, term4304915.getClass(), "gradeRank", 1476249003);
        setIntField(term4304915, term4304915.getClass(), "classRank", -565716909);
        setIntField(term4304915, term4304915.getClass(), "courseRank", 998182641);
        setField(term4304915, term4304915.getClass(), "charaSlot", term4304980);
        setField(term4304915, term4304915.getClass(), "charaLockSlot", term4304984);
        setLongField(term4304915, term4304915.getClass(), "contentBit", -826700279362391099L);
        setIntField(term4304915, term4304915.getClass(), "playCount", -1471272057);
        setField(term4304915, term4304915.getClass(), "eventWatchedDate", "MJMiIbQYGK");
        setField(term4304915, term4304915.getClass(), "lastGameId", "soJcDZGWbm");
        setField(term4304915, term4304915.getClass(), "lastRomVersion", "qwXQvUqPBC");
        setField(term4304915, term4304915.getClass(), "lastDataVersion", "QkvfzvHeEO");
        setField(term4304915, term4304915.getClass(), "lastLoginDate", "LsJOhcoYme");
        setField(term4304915, term4304915.getClass(), "lastPlayDate", "tRTtFnEoby");
        setIntField(term4304915, term4304915.getClass(), "lastPlayCredit", -276662786);
        setIntField(term4304915, term4304915.getClass(), "lastPlayMode", -453987138);
        setIntField(term4304915, term4304915.getClass(), "lastPlaceId", -2026300965);
        setField(term4304915, term4304915.getClass(), "lastPlaceName", "mKprxyhMzG");
        setIntField(term4304915, term4304915.getClass(), "lastAllNetId", -5537328);
        setIntField(term4304915, term4304915.getClass(), "lastRegionId", 1990782651);
        setField(term4304915, term4304915.getClass(), "lastRegionName", "ZSBEBxDUPZ");
        setField(term4304915, term4304915.getClass(), "lastClientId", "GphGnePpDF");
        setField(term4304915, term4304915.getClass(), "lastCountryCode", "HenzjylTem");
        setIntField(term4304915, term4304915.getClass(), "lastSelectEMoney", 300276100);
        setIntField(term4304915, term4304915.getClass(), "lastSelectTicket", -908029278);
        setIntField(term4304915, term4304915.getClass(), "lastSelectCourse", 10897152);
        setIntField(term4304915, term4304915.getClass(), "lastCountCourse", -1721505601);
        setField(term4304915, term4304915.getClass(), "firstGameId", "cNIjCDEqQS");
        setField(term4304915, term4304915.getClass(), "firstRomVersion", "kAvgVemnYq");
        setField(term4304915, term4304915.getClass(), "firstDataVersion", "nbQeBcBCst");
        setField(term4304915, term4304915.getClass(), "firstPlayDate", "WtfpgOicEh");
        setField(term4304915, term4304915.getClass(), "compatibleCmVersion", "TkwxxreVls");
        setField(term4304915, term4304915.getClass(), "dailyBonusDate", "cnFhLJGzLG");
        setField(term4304915, term4304915.getClass(), "dailyCourseBonusDate", "mFZJiMOhbg");
        setField(term4304915, term4304915.getClass(), "lastPairLoginDate", "wWEdGNQNnP");
        setField(term4304915, term4304915.getClass(), "lastTrialPlayDate", "WBwGpbtEvT");
        setIntField(term4304915, term4304915.getClass(), "playVsCount", 1317631987);
        setIntField(term4304915, term4304915.getClass(), "playSyncCount", 1812295854);
        setIntField(term4304915, term4304915.getClass(), "winCount", 121454488);
        setIntField(term4304915, term4304915.getClass(), "helpCount", -502302984);
        setIntField(term4304915, term4304915.getClass(), "comboCount", 1014936515);
        setLongField(term4304915, term4304915.getClass(), "totalDeluxscore", 3300423006633804764L);
        setLongField(term4304915, term4304915.getClass(), "totalBasicDeluxscore", -6811711755316597884L);
        setLongField(term4304915, term4304915.getClass(), "totalAdvancedDeluxscore", -4281045153529867880L);
        setLongField(term4304915, term4304915.getClass(), "totalExpertDeluxscore", -1486686276940195304L);
        setLongField(term4304915, term4304915.getClass(), "totalMasterDeluxscore", 6632632696318165729L);
        setLongField(term4304915, term4304915.getClass(), "totalReMasterDeluxscore", -2753339598091945983L);
        setIntField(term4304915, term4304915.getClass(), "totalSync", 1611284114);
        setIntField(term4304915, term4304915.getClass(), "totalBasicSync", -591212906);
        setIntField(term4304915, term4304915.getClass(), "totalAdvancedSync", -2130858201);
        setIntField(term4304915, term4304915.getClass(), "totalExpertSync", 417175182);
        setIntField(term4304915, term4304915.getClass(), "totalMasterSync", -1829963153);
        setIntField(term4304915, term4304915.getClass(), "totalReMasterSync", -886155254);
        setLongField(term4304915, term4304915.getClass(), "totalAchievement", 114524120963334932L);
        setLongField(term4304915, term4304915.getClass(), "totalBasicAchievement", 772166988900707160L);
        setLongField(term4304915, term4304915.getClass(), "totalAdvancedAchievement", 555814066736248913L);
        setLongField(term4304915, term4304915.getClass(), "totalExpertAchievement", 2717904167421091639L);
        setLongField(term4304915, term4304915.getClass(), "totalMasterAchievement", -943820649850813566L);
        setLongField(term4304915, term4304915.getClass(), "totalReMasterAchievement", 4364104581347683671L);
        setLongField(term4304915, term4304915.getClass(), "playerOldRating", 6610898776255069339L);
        setLongField(term4304915, term4304915.getClass(), "playerNewRating", -2666843494950486535L);
        setIntField(term4304915, term4304915.getClass(), "banState", -585196825);
        setLongField(term4304915, term4304915.getClass(), "dateTime", 1433493005922578211L);
        term4305264 = new Long(5957529827889152522L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term4305264;
        callMethod(klass, "setTotalDeluxscore", argTypes, term4304915, args);
    }

};


