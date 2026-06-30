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

public class UserOption_getMirrorMode_3223885544 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51961;

    public UserOption_getMirrorMode_3223885544() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term51967 = new Long(-5724112525188606013L);
        term51961 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption"));
        Object term51963 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term51965 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term51981 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term51982 = newInstance(Class.forName("java.time.LocalDate"));
        Object term51986 = newInstance(Class.forName("java.time.LocalTime"));
        Object term51991 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term51992 = newInstance(Class.forName("java.time.LocalDate"));
        Object term51996 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term51961, term51961.getClass(), "id", 6940486570215409900L);
        setLongField(term51963, term51963.getClass(), "id", -7370364068296402536L);
        setLongField(term51965, term51965.getClass(), "id", -1084263688306617320L);
        setField(term51965, term51965.getClass(), "extId", term51967);
        setField(term51965, term51965.getClass(), "luid", "FTuOcSieav");
        setIntField(term51982, term51982.getClass(), "year", 2018);
        setShortField(term51982, term51982.getClass(), "month", (short) 1);
        setShortField(term51982, term51982.getClass(), "day", (short) 7);
        setField(term51981, term51981.getClass(), "date", term51982);
        setByteField(term51986, term51986.getClass(), "hour", (byte) 5);
        setByteField(term51986, term51986.getClass(), "minute", (byte) 42);
        setByteField(term51986, term51986.getClass(), "second", (byte) 49);
        setIntField(term51986, term51986.getClass(), "nano", 291814792);
        setField(term51981, term51981.getClass(), "time", term51986);
        setField(term51965, term51965.getClass(), "registerTime", term51981);
        setIntField(term51992, term51992.getClass(), "year", 2022);
        setShortField(term51992, term51992.getClass(), "month", (short) 7);
        setShortField(term51992, term51992.getClass(), "day", (short) 9);
        setField(term51991, term51991.getClass(), "date", term51992);
        setByteField(term51996, term51996.getClass(), "hour", (byte) 21);
        setByteField(term51996, term51996.getClass(), "minute", (byte) 48);
        setByteField(term51996, term51996.getClass(), "second", (byte) 58);
        setIntField(term51996, term51996.getClass(), "nano", 579553780);
        setField(term51991, term51991.getClass(), "time", term51996);
        setField(term51965, term51965.getClass(), "accessTime", term51991);
        setField(term51963, term51963.getClass(), "card", term51965);
        setIntField(term51963, term51963.getClass(), "lastDataVersion", 1356166325);
        setField(term51963, term51963.getClass(), "userName", "qSnwPXRuzC");
        setIntField(term51963, term51963.getClass(), "point", 36575353);
        setIntField(term51963, term51963.getClass(), "totalPoint", 1173070286);
        setIntField(term51963, term51963.getClass(), "iconId", -373348260);
        setIntField(term51963, term51963.getClass(), "nameplateId", -476546497);
        setIntField(term51963, term51963.getClass(), "frameId", 1196854753);
        setIntField(term51963, term51963.getClass(), "trophyId", -59756804);
        setIntField(term51963, term51963.getClass(), "playCount", 535818399);
        setIntField(term51963, term51963.getClass(), "playVsCount", 1397433354);
        setIntField(term51963, term51963.getClass(), "playSyncCount", -135791025);
        setIntField(term51963, term51963.getClass(), "winCount", 59811366);
        setIntField(term51963, term51963.getClass(), "helpCount", 874873727);
        setIntField(term51963, term51963.getClass(), "comboCount", 729829705);
        setIntField(term51963, term51963.getClass(), "feverCount", 713554336);
        setIntField(term51963, term51963.getClass(), "totalHiScore", 196738357);
        setIntField(term51963, term51963.getClass(), "totalEasyHighScore", 466094589);
        setIntField(term51963, term51963.getClass(), "totalBasicHighScore", -1165526360);
        setIntField(term51963, term51963.getClass(), "totalAdvancedHighScore", -1358499449);
        setIntField(term51963, term51963.getClass(), "totalExpertHighScore", -1565850896);
        setIntField(term51963, term51963.getClass(), "totalMasterHighScore", 1480628140);
        setIntField(term51963, term51963.getClass(), "totalReMasterHighScore", -1804417815);
        setIntField(term51963, term51963.getClass(), "totalHighSync", -988341618);
        setIntField(term51963, term51963.getClass(), "totalEasySync", 892061109);
        setIntField(term51963, term51963.getClass(), "totalBasicSync", 1044749648);
        setIntField(term51963, term51963.getClass(), "totalAdvancedSync", -2066536273);
        setIntField(term51963, term51963.getClass(), "totalExpertSync", -1532896934);
        setIntField(term51963, term51963.getClass(), "totalMasterSync", -1907871387);
        setIntField(term51963, term51963.getClass(), "totalReMasterSync", 11100609);
        setIntField(term51963, term51963.getClass(), "playerRating", -747715686);
        setIntField(term51963, term51963.getClass(), "highestRating", -1565507534);
        setIntField(term51963, term51963.getClass(), "rankAuthTailId", -1665001312);
        setField(term51963, term51963.getClass(), "eventWatchedDate", "gqhqalMaKC");
        setField(term51963, term51963.getClass(), "webLimitDate", "qkMduZHBXR");
        setIntField(term51963, term51963.getClass(), "challengeTrackPhase", -904092395);
        setIntField(term51963, term51963.getClass(), "firstPlayBits", -1209882989);
        setField(term51963, term51963.getClass(), "lastPlayDate", "jMQsCLYfKd");
        setIntField(term51963, term51963.getClass(), "lastPlaceId", -635477822);
        setField(term51963, term51963.getClass(), "lastPlaceName", "dpcpGqEQLd");
        setIntField(term51963, term51963.getClass(), "lastRegionId", -1577181902);
        setField(term51963, term51963.getClass(), "lastRegionName", "pButgbcWlR");
        setField(term51963, term51963.getClass(), "lastClientId", "tPiZMhJIXj");
        setField(term51963, term51963.getClass(), "lastCountryCode", "lrEkNimddJ");
        setIntField(term51963, term51963.getClass(), "eventPoint", 1943392765);
        setIntField(term51963, term51963.getClass(), "totalLv", -1788693144);
        setIntField(term51963, term51963.getClass(), "lastLoginBonusDay", 1939961371);
        setIntField(term51963, term51963.getClass(), "lastSurvivalBonusDay", 435301324);
        setIntField(term51963, term51963.getClass(), "loginBonusLv", -1422958225);
        setField(term51961, term51961.getClass(), "user", term51963);
        setIntField(term51961, term51961.getClass(), "soudEffect", 1608477594);
        setIntField(term51961, term51961.getClass(), "mirrorMode", -250008835);
        setIntField(term51961, term51961.getClass(), "guideSpeed", -1865187594);
        setIntField(term51961, term51961.getClass(), "bgInfo", -1806281595);
        setIntField(term51961, term51961.getClass(), "brightness", -1207788939);
        setIntField(term51961, term51961.getClass(), "isStarRot", -1116962728);
        setIntField(term51961, term51961.getClass(), "breakSe", 1420647748);
        setIntField(term51961, term51961.getClass(), "slideSe", 1179379876);
        setIntField(term51961, term51961.getClass(), "hardJudge", -1997441951);
        setIntField(term51961, term51961.getClass(), "isTagJump", -138340336);
        setIntField(term51961, term51961.getClass(), "breakSeVol", 233375431);
        setIntField(term51961, term51961.getClass(), "slideSeVol", 1527507424);
        setIntField(term51961, term51961.getClass(), "isUpperDisp", -2100070024);
        setIntField(term51961, term51961.getClass(), "trackSkip", 1206642688);
        setIntField(term51961, term51961.getClass(), "optionMode", 224560582);
        setIntField(term51961, term51961.getClass(), "simpleOptionParam", 1608206239);
        setIntField(term51961, term51961.getClass(), "adjustTiming", -989652648);
        setIntField(term51961, term51961.getClass(), "dispTiming", 234527042);
        setIntField(term51961, term51961.getClass(), "timingPos", -1070770514);
        setIntField(term51961, term51961.getClass(), "ansVol", 1004064636);
        setIntField(term51961, term51961.getClass(), "noteVol", -1815732679);
        setIntField(term51961, term51961.getClass(), "dmgVol", -2141382740);
        setIntField(term51961, term51961.getClass(), "appealFlame", -1545135290);
        setIntField(term51961, term51961.getClass(), "isFeverDisp", -802934163);
        setIntField(term51961, term51961.getClass(), "dispJudge", -1934019263);
        setIntField(term51961, term51961.getClass(), "judgePos", 530191772);
        setIntField(term51961, term51961.getClass(), "ratingGuard", 698731814);
        setIntField(term51961, term51961.getClass(), "selectChara", -1282557913);
        setIntField(term51961, term51961.getClass(), "sortType", -2080692202);
        setIntField(term51961, term51961.getClass(), "filterGenre", 601982968);
        setIntField(term51961, term51961.getClass(), "filterLevel", -999152791);
        setIntField(term51961, term51961.getClass(), "filterRank", 771966144);
        setIntField(term51961, term51961.getClass(), "filterVersion", -270951499);
        setIntField(term51961, term51961.getClass(), "filterRec", 1283219056);
        setIntField(term51961, term51961.getClass(), "filterFullCombo", 1914052513);
        setIntField(term51961, term51961.getClass(), "filterAllPerfect", -1810525034);
        setIntField(term51961, term51961.getClass(), "filterDifficulty", -2104858494);
        setIntField(term51961, term51961.getClass(), "filterFullSync", 1665727494);
        setIntField(term51961, term51961.getClass(), "filterReMaster", 487781899);
        setIntField(term51961, term51961.getClass(), "filterMaxFever", 322622063);
        setIntField(term51961, term51961.getClass(), "finalSelectId", -1768300641);
        setIntField(term51961, term51961.getClass(), "finalSelectCategory", 996684751);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMirrorMode", argTypes, term51961, args);
    }

};


