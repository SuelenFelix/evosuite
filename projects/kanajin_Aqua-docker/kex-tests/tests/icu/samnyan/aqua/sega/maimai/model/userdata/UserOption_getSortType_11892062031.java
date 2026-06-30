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

public class UserOption_getSortType_11892062031 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60277;

    public UserOption_getSortType_11892062031() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term60283 = new Long(5731563613239387113L);
        term60277 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption"));
        Object term60279 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term60281 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term60297 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term60298 = newInstance(Class.forName("java.time.LocalDate"));
        Object term60302 = newInstance(Class.forName("java.time.LocalTime"));
        Object term60307 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term60308 = newInstance(Class.forName("java.time.LocalDate"));
        Object term60312 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term60277, term60277.getClass(), "id", -1978508496784157882L);
        setLongField(term60279, term60279.getClass(), "id", -7840999196900383276L);
        setLongField(term60281, term60281.getClass(), "id", 1528628920302068646L);
        setField(term60281, term60281.getClass(), "extId", term60283);
        setField(term60281, term60281.getClass(), "luid", "NeEetzFhTt");
        setIntField(term60298, term60298.getClass(), "year", 2026);
        setShortField(term60298, term60298.getClass(), "month", (short) 12);
        setShortField(term60298, term60298.getClass(), "day", (short) 22);
        setField(term60297, term60297.getClass(), "date", term60298);
        setByteField(term60302, term60302.getClass(), "hour", (byte) 19);
        setByteField(term60302, term60302.getClass(), "minute", (byte) 39);
        setByteField(term60302, term60302.getClass(), "second", (byte) 23);
        setIntField(term60302, term60302.getClass(), "nano", 342247024);
        setField(term60297, term60297.getClass(), "time", term60302);
        setField(term60281, term60281.getClass(), "registerTime", term60297);
        setIntField(term60308, term60308.getClass(), "year", 2020);
        setShortField(term60308, term60308.getClass(), "month", (short) 5);
        setShortField(term60308, term60308.getClass(), "day", (short) 8);
        setField(term60307, term60307.getClass(), "date", term60308);
        setByteField(term60312, term60312.getClass(), "hour", (byte) 8);
        setByteField(term60312, term60312.getClass(), "minute", (byte) 25);
        setByteField(term60312, term60312.getClass(), "second", (byte) 28);
        setIntField(term60312, term60312.getClass(), "nano", 159788425);
        setField(term60307, term60307.getClass(), "time", term60312);
        setField(term60281, term60281.getClass(), "accessTime", term60307);
        setField(term60279, term60279.getClass(), "card", term60281);
        setIntField(term60279, term60279.getClass(), "lastDataVersion", -448183926);
        setField(term60279, term60279.getClass(), "userName", "UgvuvUxKed");
        setIntField(term60279, term60279.getClass(), "point", -1475942094);
        setIntField(term60279, term60279.getClass(), "totalPoint", 602519677);
        setIntField(term60279, term60279.getClass(), "iconId", -370431003);
        setIntField(term60279, term60279.getClass(), "nameplateId", 822630139);
        setIntField(term60279, term60279.getClass(), "frameId", 385347406);
        setIntField(term60279, term60279.getClass(), "trophyId", -46704413);
        setIntField(term60279, term60279.getClass(), "playCount", -2137913899);
        setIntField(term60279, term60279.getClass(), "playVsCount", -688835502);
        setIntField(term60279, term60279.getClass(), "playSyncCount", 1469264963);
        setIntField(term60279, term60279.getClass(), "winCount", 802302241);
        setIntField(term60279, term60279.getClass(), "helpCount", -2086174298);
        setIntField(term60279, term60279.getClass(), "comboCount", -218426551);
        setIntField(term60279, term60279.getClass(), "feverCount", -1670070098);
        setIntField(term60279, term60279.getClass(), "totalHiScore", 467509047);
        setIntField(term60279, term60279.getClass(), "totalEasyHighScore", -904447748);
        setIntField(term60279, term60279.getClass(), "totalBasicHighScore", 854911566);
        setIntField(term60279, term60279.getClass(), "totalAdvancedHighScore", -1420033797);
        setIntField(term60279, term60279.getClass(), "totalExpertHighScore", 747673390);
        setIntField(term60279, term60279.getClass(), "totalMasterHighScore", 705588535);
        setIntField(term60279, term60279.getClass(), "totalReMasterHighScore", -2070496137);
        setIntField(term60279, term60279.getClass(), "totalHighSync", -716175280);
        setIntField(term60279, term60279.getClass(), "totalEasySync", 1978574372);
        setIntField(term60279, term60279.getClass(), "totalBasicSync", 267968248);
        setIntField(term60279, term60279.getClass(), "totalAdvancedSync", 994276530);
        setIntField(term60279, term60279.getClass(), "totalExpertSync", 1628085673);
        setIntField(term60279, term60279.getClass(), "totalMasterSync", -2024076633);
        setIntField(term60279, term60279.getClass(), "totalReMasterSync", -1871930908);
        setIntField(term60279, term60279.getClass(), "playerRating", 1529921600);
        setIntField(term60279, term60279.getClass(), "highestRating", 1411675971);
        setIntField(term60279, term60279.getClass(), "rankAuthTailId", 1224330822);
        setField(term60279, term60279.getClass(), "eventWatchedDate", "ljBBMsQpaM");
        setField(term60279, term60279.getClass(), "webLimitDate", "hHNIOlOzJc");
        setIntField(term60279, term60279.getClass(), "challengeTrackPhase", 991967399);
        setIntField(term60279, term60279.getClass(), "firstPlayBits", -653419421);
        setField(term60279, term60279.getClass(), "lastPlayDate", "ALRSeULyWV");
        setIntField(term60279, term60279.getClass(), "lastPlaceId", -364951490);
        setField(term60279, term60279.getClass(), "lastPlaceName", "WVhzXHdyFF");
        setIntField(term60279, term60279.getClass(), "lastRegionId", 1275653221);
        setField(term60279, term60279.getClass(), "lastRegionName", "GLAWYoxkyw");
        setField(term60279, term60279.getClass(), "lastClientId", "cfpPTNNVnW");
        setField(term60279, term60279.getClass(), "lastCountryCode", "VPkEFShMUB");
        setIntField(term60279, term60279.getClass(), "eventPoint", 221439292);
        setIntField(term60279, term60279.getClass(), "totalLv", -1449686187);
        setIntField(term60279, term60279.getClass(), "lastLoginBonusDay", -1374649219);
        setIntField(term60279, term60279.getClass(), "lastSurvivalBonusDay", 1856279121);
        setIntField(term60279, term60279.getClass(), "loginBonusLv", -407004822);
        setField(term60277, term60277.getClass(), "user", term60279);
        setIntField(term60277, term60277.getClass(), "soudEffect", -1357273988);
        setIntField(term60277, term60277.getClass(), "mirrorMode", -923140400);
        setIntField(term60277, term60277.getClass(), "guideSpeed", -553202541);
        setIntField(term60277, term60277.getClass(), "bgInfo", -921082991);
        setIntField(term60277, term60277.getClass(), "brightness", -1697647652);
        setIntField(term60277, term60277.getClass(), "isStarRot", -653540011);
        setIntField(term60277, term60277.getClass(), "breakSe", -897305207);
        setIntField(term60277, term60277.getClass(), "slideSe", -1682000986);
        setIntField(term60277, term60277.getClass(), "hardJudge", 417127629);
        setIntField(term60277, term60277.getClass(), "isTagJump", 891084826);
        setIntField(term60277, term60277.getClass(), "breakSeVol", -1903396559);
        setIntField(term60277, term60277.getClass(), "slideSeVol", -379718533);
        setIntField(term60277, term60277.getClass(), "isUpperDisp", 1847948269);
        setIntField(term60277, term60277.getClass(), "trackSkip", -1587620345);
        setIntField(term60277, term60277.getClass(), "optionMode", 1594802760);
        setIntField(term60277, term60277.getClass(), "simpleOptionParam", -737020605);
        setIntField(term60277, term60277.getClass(), "adjustTiming", -1689975721);
        setIntField(term60277, term60277.getClass(), "dispTiming", -559277061);
        setIntField(term60277, term60277.getClass(), "timingPos", -1559272301);
        setIntField(term60277, term60277.getClass(), "ansVol", -695146667);
        setIntField(term60277, term60277.getClass(), "noteVol", 504837140);
        setIntField(term60277, term60277.getClass(), "dmgVol", 1644155444);
        setIntField(term60277, term60277.getClass(), "appealFlame", -146974597);
        setIntField(term60277, term60277.getClass(), "isFeverDisp", 1867052080);
        setIntField(term60277, term60277.getClass(), "dispJudge", 1062960081);
        setIntField(term60277, term60277.getClass(), "judgePos", -1298172941);
        setIntField(term60277, term60277.getClass(), "ratingGuard", -601138209);
        setIntField(term60277, term60277.getClass(), "selectChara", -1113477185);
        setIntField(term60277, term60277.getClass(), "sortType", 585885138);
        setIntField(term60277, term60277.getClass(), "filterGenre", 567631199);
        setIntField(term60277, term60277.getClass(), "filterLevel", -1413886938);
        setIntField(term60277, term60277.getClass(), "filterRank", 2087447261);
        setIntField(term60277, term60277.getClass(), "filterVersion", 1781286950);
        setIntField(term60277, term60277.getClass(), "filterRec", -1567536215);
        setIntField(term60277, term60277.getClass(), "filterFullCombo", -193229422);
        setIntField(term60277, term60277.getClass(), "filterAllPerfect", -1390564838);
        setIntField(term60277, term60277.getClass(), "filterDifficulty", 1895198236);
        setIntField(term60277, term60277.getClass(), "filterFullSync", -1239270544);
        setIntField(term60277, term60277.getClass(), "filterReMaster", -877554724);
        setIntField(term60277, term60277.getClass(), "filterMaxFever", -1123007297);
        setIntField(term60277, term60277.getClass(), "finalSelectId", 144368885);
        setIntField(term60277, term60277.getClass(), "finalSelectCategory", -1855501977);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSortType", argTypes, term60277, args);
    }

};


