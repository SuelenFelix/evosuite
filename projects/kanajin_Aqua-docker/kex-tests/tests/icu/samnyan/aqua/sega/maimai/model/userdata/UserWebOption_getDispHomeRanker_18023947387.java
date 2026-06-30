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

public class UserWebOption_getDispHomeRanker_18023947387 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39157;

    public UserWebOption_getDispHomeRanker_18023947387() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term39163 = new Long(-2255965562447970862L);
        term39157 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserWebOption"));
        Object term39159 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term39161 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term39177 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term39178 = newInstance(Class.forName("java.time.LocalDate"));
        Object term39182 = newInstance(Class.forName("java.time.LocalTime"));
        Object term39187 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term39188 = newInstance(Class.forName("java.time.LocalDate"));
        Object term39192 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term39157, term39157.getClass(), "id", 2535970782317488741L);
        setLongField(term39159, term39159.getClass(), "id", -5258945362776941718L);
        setLongField(term39161, term39161.getClass(), "id", 24067105862153728L);
        setField(term39161, term39161.getClass(), "extId", term39163);
        setField(term39161, term39161.getClass(), "luid", "IqDObvPBZX");
        setIntField(term39178, term39178.getClass(), "year", 2027);
        setShortField(term39178, term39178.getClass(), "month", (short) 11);
        setShortField(term39178, term39178.getClass(), "day", (short) 10);
        setField(term39177, term39177.getClass(), "date", term39178);
        setByteField(term39182, term39182.getClass(), "hour", (byte) 9);
        setByteField(term39182, term39182.getClass(), "minute", (byte) 27);
        setByteField(term39182, term39182.getClass(), "second", (byte) 5);
        setIntField(term39182, term39182.getClass(), "nano", 574938581);
        setField(term39177, term39177.getClass(), "time", term39182);
        setField(term39161, term39161.getClass(), "registerTime", term39177);
        setIntField(term39188, term39188.getClass(), "year", 2011);
        setShortField(term39188, term39188.getClass(), "month", (short) 8);
        setShortField(term39188, term39188.getClass(), "day", (short) 29);
        setField(term39187, term39187.getClass(), "date", term39188);
        setByteField(term39192, term39192.getClass(), "hour", (byte) 10);
        setByteField(term39192, term39192.getClass(), "minute", (byte) 15);
        setByteField(term39192, term39192.getClass(), "second", (byte) 18);
        setIntField(term39192, term39192.getClass(), "nano", 171360352);
        setField(term39187, term39187.getClass(), "time", term39192);
        setField(term39161, term39161.getClass(), "accessTime", term39187);
        setField(term39159, term39159.getClass(), "card", term39161);
        setIntField(term39159, term39159.getClass(), "lastDataVersion", 335305737);
        setField(term39159, term39159.getClass(), "userName", "NITCrIISoC");
        setIntField(term39159, term39159.getClass(), "point", -925570940);
        setIntField(term39159, term39159.getClass(), "totalPoint", -995970411);
        setIntField(term39159, term39159.getClass(), "iconId", -1408698769);
        setIntField(term39159, term39159.getClass(), "nameplateId", -833650140);
        setIntField(term39159, term39159.getClass(), "frameId", 383587236);
        setIntField(term39159, term39159.getClass(), "trophyId", 1305946167);
        setIntField(term39159, term39159.getClass(), "playCount", 1819681111);
        setIntField(term39159, term39159.getClass(), "playVsCount", 1985692620);
        setIntField(term39159, term39159.getClass(), "playSyncCount", 534050336);
        setIntField(term39159, term39159.getClass(), "winCount", -1372609370);
        setIntField(term39159, term39159.getClass(), "helpCount", 1366651612);
        setIntField(term39159, term39159.getClass(), "comboCount", -2147136630);
        setIntField(term39159, term39159.getClass(), "feverCount", -639963675);
        setIntField(term39159, term39159.getClass(), "totalHiScore", -111415044);
        setIntField(term39159, term39159.getClass(), "totalEasyHighScore", -1724633225);
        setIntField(term39159, term39159.getClass(), "totalBasicHighScore", -285108418);
        setIntField(term39159, term39159.getClass(), "totalAdvancedHighScore", -1833551739);
        setIntField(term39159, term39159.getClass(), "totalExpertHighScore", -408588900);
        setIntField(term39159, term39159.getClass(), "totalMasterHighScore", -768092851);
        setIntField(term39159, term39159.getClass(), "totalReMasterHighScore", -2040263086);
        setIntField(term39159, term39159.getClass(), "totalHighSync", -1917411490);
        setIntField(term39159, term39159.getClass(), "totalEasySync", -335301241);
        setIntField(term39159, term39159.getClass(), "totalBasicSync", 911548156);
        setIntField(term39159, term39159.getClass(), "totalAdvancedSync", -185022670);
        setIntField(term39159, term39159.getClass(), "totalExpertSync", -761249284);
        setIntField(term39159, term39159.getClass(), "totalMasterSync", 1921491694);
        setIntField(term39159, term39159.getClass(), "totalReMasterSync", -187830634);
        setIntField(term39159, term39159.getClass(), "playerRating", 1691791355);
        setIntField(term39159, term39159.getClass(), "highestRating", -1331748165);
        setIntField(term39159, term39159.getClass(), "rankAuthTailId", 1369016583);
        setField(term39159, term39159.getClass(), "eventWatchedDate", "nSzzeexTDI");
        setField(term39159, term39159.getClass(), "webLimitDate", "WBrpvMhmsz");
        setIntField(term39159, term39159.getClass(), "challengeTrackPhase", 2033476845);
        setIntField(term39159, term39159.getClass(), "firstPlayBits", 463965810);
        setField(term39159, term39159.getClass(), "lastPlayDate", "ZzqRHVEXcM");
        setIntField(term39159, term39159.getClass(), "lastPlaceId", 970217905);
        setField(term39159, term39159.getClass(), "lastPlaceName", "YYwIEARNxi");
        setIntField(term39159, term39159.getClass(), "lastRegionId", -486492381);
        setField(term39159, term39159.getClass(), "lastRegionName", "rblXBUdTFc");
        setField(term39159, term39159.getClass(), "lastClientId", "rbsXSOJFKW");
        setField(term39159, term39159.getClass(), "lastCountryCode", "sAgGDoUNlf");
        setIntField(term39159, term39159.getClass(), "eventPoint", 30517520);
        setIntField(term39159, term39159.getClass(), "totalLv", 1096518455);
        setIntField(term39159, term39159.getClass(), "lastLoginBonusDay", -1731653174);
        setIntField(term39159, term39159.getClass(), "lastSurvivalBonusDay", 1249351936);
        setIntField(term39159, term39159.getClass(), "loginBonusLv", 1731404822);
        setField(term39157, term39157.getClass(), "user", term39159);
        setBooleanField(term39157, term39157.getClass(), "isNetMember", true);
        setIntField(term39157, term39157.getClass(), "dispRate", -877806535);
        setIntField(term39157, term39157.getClass(), "dispJudgeStyle", -1489914829);
        setIntField(term39157, term39157.getClass(), "dispRank", -1208940453);
        setIntField(term39157, term39157.getClass(), "dispHomeRanker", 661206297);
        setIntField(term39157, term39157.getClass(), "dispTotalLv", 155345516);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserWebOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDispHomeRanker", argTypes, term39157, args);
    }

};


