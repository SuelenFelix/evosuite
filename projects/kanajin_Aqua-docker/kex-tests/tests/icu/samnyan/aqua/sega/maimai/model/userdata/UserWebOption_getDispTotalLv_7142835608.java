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

public class UserWebOption_getDispTotalLv_7142835608 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39429;

    public UserWebOption_getDispTotalLv_7142835608() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term39435 = new Long(148047808219672941L);
        term39429 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserWebOption"));
        Object term39431 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term39433 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term39449 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term39450 = newInstance(Class.forName("java.time.LocalDate"));
        Object term39454 = newInstance(Class.forName("java.time.LocalTime"));
        Object term39459 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term39460 = newInstance(Class.forName("java.time.LocalDate"));
        Object term39464 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term39429, term39429.getClass(), "id", -8477368071089201577L);
        setLongField(term39431, term39431.getClass(), "id", -1526729287349763895L);
        setLongField(term39433, term39433.getClass(), "id", 7017605765544766728L);
        setField(term39433, term39433.getClass(), "extId", term39435);
        setField(term39433, term39433.getClass(), "luid", "TSTZcXdFFi");
        setIntField(term39450, term39450.getClass(), "year", 2019);
        setShortField(term39450, term39450.getClass(), "month", (short) 5);
        setShortField(term39450, term39450.getClass(), "day", (short) 16);
        setField(term39449, term39449.getClass(), "date", term39450);
        setByteField(term39454, term39454.getClass(), "hour", (byte) 3);
        setByteField(term39454, term39454.getClass(), "minute", (byte) 12);
        setByteField(term39454, term39454.getClass(), "second", (byte) 27);
        setIntField(term39454, term39454.getClass(), "nano", 775737832);
        setField(term39449, term39449.getClass(), "time", term39454);
        setField(term39433, term39433.getClass(), "registerTime", term39449);
        setIntField(term39460, term39460.getClass(), "year", 2016);
        setShortField(term39460, term39460.getClass(), "month", (short) 12);
        setShortField(term39460, term39460.getClass(), "day", (short) 2);
        setField(term39459, term39459.getClass(), "date", term39460);
        setByteField(term39464, term39464.getClass(), "hour", (byte) 7);
        setByteField(term39464, term39464.getClass(), "minute", (byte) 38);
        setByteField(term39464, term39464.getClass(), "second", (byte) 49);
        setIntField(term39464, term39464.getClass(), "nano", 415044053);
        setField(term39459, term39459.getClass(), "time", term39464);
        setField(term39433, term39433.getClass(), "accessTime", term39459);
        setField(term39431, term39431.getClass(), "card", term39433);
        setIntField(term39431, term39431.getClass(), "lastDataVersion", 1328408059);
        setField(term39431, term39431.getClass(), "userName", "RyaaOzWfYO");
        setIntField(term39431, term39431.getClass(), "point", 1491641290);
        setIntField(term39431, term39431.getClass(), "totalPoint", 917414277);
        setIntField(term39431, term39431.getClass(), "iconId", 1585368761);
        setIntField(term39431, term39431.getClass(), "nameplateId", -1814545416);
        setIntField(term39431, term39431.getClass(), "frameId", -1486799161);
        setIntField(term39431, term39431.getClass(), "trophyId", -455064174);
        setIntField(term39431, term39431.getClass(), "playCount", -1278860746);
        setIntField(term39431, term39431.getClass(), "playVsCount", 1573046503);
        setIntField(term39431, term39431.getClass(), "playSyncCount", -1546535153);
        setIntField(term39431, term39431.getClass(), "winCount", 933284110);
        setIntField(term39431, term39431.getClass(), "helpCount", -2017108585);
        setIntField(term39431, term39431.getClass(), "comboCount", 1915480534);
        setIntField(term39431, term39431.getClass(), "feverCount", -1435370707);
        setIntField(term39431, term39431.getClass(), "totalHiScore", 1417436255);
        setIntField(term39431, term39431.getClass(), "totalEasyHighScore", -198413341);
        setIntField(term39431, term39431.getClass(), "totalBasicHighScore", 310965446);
        setIntField(term39431, term39431.getClass(), "totalAdvancedHighScore", 828272209);
        setIntField(term39431, term39431.getClass(), "totalExpertHighScore", 689750472);
        setIntField(term39431, term39431.getClass(), "totalMasterHighScore", -1898359702);
        setIntField(term39431, term39431.getClass(), "totalReMasterHighScore", 1270525323);
        setIntField(term39431, term39431.getClass(), "totalHighSync", 488822117);
        setIntField(term39431, term39431.getClass(), "totalEasySync", 433989355);
        setIntField(term39431, term39431.getClass(), "totalBasicSync", 2018844661);
        setIntField(term39431, term39431.getClass(), "totalAdvancedSync", -1021729545);
        setIntField(term39431, term39431.getClass(), "totalExpertSync", 430508385);
        setIntField(term39431, term39431.getClass(), "totalMasterSync", -1793486194);
        setIntField(term39431, term39431.getClass(), "totalReMasterSync", 433257791);
        setIntField(term39431, term39431.getClass(), "playerRating", 29812279);
        setIntField(term39431, term39431.getClass(), "highestRating", -1215649058);
        setIntField(term39431, term39431.getClass(), "rankAuthTailId", 1937894049);
        setField(term39431, term39431.getClass(), "eventWatchedDate", "HAkxFBZZzz");
        setField(term39431, term39431.getClass(), "webLimitDate", "yejonZnVuy");
        setIntField(term39431, term39431.getClass(), "challengeTrackPhase", -1008516956);
        setIntField(term39431, term39431.getClass(), "firstPlayBits", -1366321540);
        setField(term39431, term39431.getClass(), "lastPlayDate", "ouesGIsvuG");
        setIntField(term39431, term39431.getClass(), "lastPlaceId", -157715735);
        setField(term39431, term39431.getClass(), "lastPlaceName", "pHBHlmLIZQ");
        setIntField(term39431, term39431.getClass(), "lastRegionId", -935537025);
        setField(term39431, term39431.getClass(), "lastRegionName", "ZWRAbOuktl");
        setField(term39431, term39431.getClass(), "lastClientId", "iqFRvFmVID");
        setField(term39431, term39431.getClass(), "lastCountryCode", "pNAEtppZdv");
        setIntField(term39431, term39431.getClass(), "eventPoint", 855956248);
        setIntField(term39431, term39431.getClass(), "totalLv", -1971819811);
        setIntField(term39431, term39431.getClass(), "lastLoginBonusDay", 2136685850);
        setIntField(term39431, term39431.getClass(), "lastSurvivalBonusDay", 1848705396);
        setIntField(term39431, term39431.getClass(), "loginBonusLv", -748010406);
        setField(term39429, term39429.getClass(), "user", term39431);
        setBooleanField(term39429, term39429.getClass(), "isNetMember", true);
        setIntField(term39429, term39429.getClass(), "dispRate", 904927355);
        setIntField(term39429, term39429.getClass(), "dispJudgeStyle", -2089541916);
        setIntField(term39429, term39429.getClass(), "dispRank", 1066893695);
        setIntField(term39429, term39429.getClass(), "dispHomeRanker", -1058646936);
        setIntField(term39429, term39429.getClass(), "dispTotalLv", 49685222);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserWebOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDispTotalLv", argTypes, term39429, args);
    }

};


