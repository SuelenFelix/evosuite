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

public class UserOption_getAppealFlame_199402494025 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58429;

    public UserOption_getAppealFlame_199402494025() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term58435 = new Long(8863790908271299748L);
        term58429 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption"));
        Object term58431 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term58433 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term58449 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term58450 = newInstance(Class.forName("java.time.LocalDate"));
        Object term58454 = newInstance(Class.forName("java.time.LocalTime"));
        Object term58459 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term58460 = newInstance(Class.forName("java.time.LocalDate"));
        Object term58464 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term58429, term58429.getClass(), "id", -354905832180781372L);
        setLongField(term58431, term58431.getClass(), "id", -5967061076297699457L);
        setLongField(term58433, term58433.getClass(), "id", 1550364590565203407L);
        setField(term58433, term58433.getClass(), "extId", term58435);
        setField(term58433, term58433.getClass(), "luid", "EhuyRKrUJu");
        setIntField(term58450, term58450.getClass(), "year", 2025);
        setShortField(term58450, term58450.getClass(), "month", (short) 9);
        setShortField(term58450, term58450.getClass(), "day", (short) 5);
        setField(term58449, term58449.getClass(), "date", term58450);
        setByteField(term58454, term58454.getClass(), "hour", (byte) 11);
        setByteField(term58454, term58454.getClass(), "minute", (byte) 59);
        setByteField(term58454, term58454.getClass(), "second", (byte) 37);
        setIntField(term58454, term58454.getClass(), "nano", 93740487);
        setField(term58449, term58449.getClass(), "time", term58454);
        setField(term58433, term58433.getClass(), "registerTime", term58449);
        setIntField(term58460, term58460.getClass(), "year", 2028);
        setShortField(term58460, term58460.getClass(), "month", (short) 12);
        setShortField(term58460, term58460.getClass(), "day", (short) 28);
        setField(term58459, term58459.getClass(), "date", term58460);
        setByteField(term58464, term58464.getClass(), "hour", (byte) 11);
        setByteField(term58464, term58464.getClass(), "minute", (byte) 37);
        setByteField(term58464, term58464.getClass(), "second", (byte) 0);
        setIntField(term58464, term58464.getClass(), "nano", 315383282);
        setField(term58459, term58459.getClass(), "time", term58464);
        setField(term58433, term58433.getClass(), "accessTime", term58459);
        setField(term58431, term58431.getClass(), "card", term58433);
        setIntField(term58431, term58431.getClass(), "lastDataVersion", -836318034);
        setField(term58431, term58431.getClass(), "userName", "UlBxuoBXcJ");
        setIntField(term58431, term58431.getClass(), "point", 2012369494);
        setIntField(term58431, term58431.getClass(), "totalPoint", -380390171);
        setIntField(term58431, term58431.getClass(), "iconId", -733694118);
        setIntField(term58431, term58431.getClass(), "nameplateId", -1720693402);
        setIntField(term58431, term58431.getClass(), "frameId", 325282129);
        setIntField(term58431, term58431.getClass(), "trophyId", -446219627);
        setIntField(term58431, term58431.getClass(), "playCount", 1440215146);
        setIntField(term58431, term58431.getClass(), "playVsCount", 593096680);
        setIntField(term58431, term58431.getClass(), "playSyncCount", -223776565);
        setIntField(term58431, term58431.getClass(), "winCount", -1246811706);
        setIntField(term58431, term58431.getClass(), "helpCount", 904470208);
        setIntField(term58431, term58431.getClass(), "comboCount", -2102304044);
        setIntField(term58431, term58431.getClass(), "feverCount", 810803651);
        setIntField(term58431, term58431.getClass(), "totalHiScore", 552468029);
        setIntField(term58431, term58431.getClass(), "totalEasyHighScore", -556247755);
        setIntField(term58431, term58431.getClass(), "totalBasicHighScore", 1888522182);
        setIntField(term58431, term58431.getClass(), "totalAdvancedHighScore", -2083490818);
        setIntField(term58431, term58431.getClass(), "totalExpertHighScore", 1865419687);
        setIntField(term58431, term58431.getClass(), "totalMasterHighScore", -1342626701);
        setIntField(term58431, term58431.getClass(), "totalReMasterHighScore", -2008937598);
        setIntField(term58431, term58431.getClass(), "totalHighSync", 980261932);
        setIntField(term58431, term58431.getClass(), "totalEasySync", 778013422);
        setIntField(term58431, term58431.getClass(), "totalBasicSync", -704266313);
        setIntField(term58431, term58431.getClass(), "totalAdvancedSync", -1073752722);
        setIntField(term58431, term58431.getClass(), "totalExpertSync", 394545224);
        setIntField(term58431, term58431.getClass(), "totalMasterSync", -2021938994);
        setIntField(term58431, term58431.getClass(), "totalReMasterSync", -753325610);
        setIntField(term58431, term58431.getClass(), "playerRating", 177871424);
        setIntField(term58431, term58431.getClass(), "highestRating", -1856602556);
        setIntField(term58431, term58431.getClass(), "rankAuthTailId", -1558615641);
        setField(term58431, term58431.getClass(), "eventWatchedDate", "PqduvNFXXw");
        setField(term58431, term58431.getClass(), "webLimitDate", "bMQrxvaBAI");
        setIntField(term58431, term58431.getClass(), "challengeTrackPhase", -172970364);
        setIntField(term58431, term58431.getClass(), "firstPlayBits", 414903799);
        setField(term58431, term58431.getClass(), "lastPlayDate", "StFtysZlWm");
        setIntField(term58431, term58431.getClass(), "lastPlaceId", -119095068);
        setField(term58431, term58431.getClass(), "lastPlaceName", "CoqUcmjnkF");
        setIntField(term58431, term58431.getClass(), "lastRegionId", -554797420);
        setField(term58431, term58431.getClass(), "lastRegionName", "oOrXvGaFwa");
        setField(term58431, term58431.getClass(), "lastClientId", "KJSTLGsSvO");
        setField(term58431, term58431.getClass(), "lastCountryCode", "kSkiIpaepq");
        setIntField(term58431, term58431.getClass(), "eventPoint", 1064643540);
        setIntField(term58431, term58431.getClass(), "totalLv", -1302908658);
        setIntField(term58431, term58431.getClass(), "lastLoginBonusDay", 1625710313);
        setIntField(term58431, term58431.getClass(), "lastSurvivalBonusDay", 1771251643);
        setIntField(term58431, term58431.getClass(), "loginBonusLv", 1771106298);
        setField(term58429, term58429.getClass(), "user", term58431);
        setIntField(term58429, term58429.getClass(), "soudEffect", 489428207);
        setIntField(term58429, term58429.getClass(), "mirrorMode", -1189670798);
        setIntField(term58429, term58429.getClass(), "guideSpeed", 1856659430);
        setIntField(term58429, term58429.getClass(), "bgInfo", 1163865944);
        setIntField(term58429, term58429.getClass(), "brightness", 791409574);
        setIntField(term58429, term58429.getClass(), "isStarRot", 1650362015);
        setIntField(term58429, term58429.getClass(), "breakSe", 1500712275);
        setIntField(term58429, term58429.getClass(), "slideSe", 1770935991);
        setIntField(term58429, term58429.getClass(), "hardJudge", -1431015722);
        setIntField(term58429, term58429.getClass(), "isTagJump", 848351607);
        setIntField(term58429, term58429.getClass(), "breakSeVol", -273652793);
        setIntField(term58429, term58429.getClass(), "slideSeVol", 765378004);
        setIntField(term58429, term58429.getClass(), "isUpperDisp", 831719919);
        setIntField(term58429, term58429.getClass(), "trackSkip", 1340129291);
        setIntField(term58429, term58429.getClass(), "optionMode", -1877793816);
        setIntField(term58429, term58429.getClass(), "simpleOptionParam", 1815838239);
        setIntField(term58429, term58429.getClass(), "adjustTiming", -897797215);
        setIntField(term58429, term58429.getClass(), "dispTiming", -1187799333);
        setIntField(term58429, term58429.getClass(), "timingPos", -1222671412);
        setIntField(term58429, term58429.getClass(), "ansVol", 1753444798);
        setIntField(term58429, term58429.getClass(), "noteVol", -1511001461);
        setIntField(term58429, term58429.getClass(), "dmgVol", -1668810633);
        setIntField(term58429, term58429.getClass(), "appealFlame", -382694195);
        setIntField(term58429, term58429.getClass(), "isFeverDisp", -818635049);
        setIntField(term58429, term58429.getClass(), "dispJudge", 2059446583);
        setIntField(term58429, term58429.getClass(), "judgePos", -1921696663);
        setIntField(term58429, term58429.getClass(), "ratingGuard", 687014558);
        setIntField(term58429, term58429.getClass(), "selectChara", -217279729);
        setIntField(term58429, term58429.getClass(), "sortType", -1559780022);
        setIntField(term58429, term58429.getClass(), "filterGenre", 767848530);
        setIntField(term58429, term58429.getClass(), "filterLevel", 1958684579);
        setIntField(term58429, term58429.getClass(), "filterRank", -1479249075);
        setIntField(term58429, term58429.getClass(), "filterVersion", -1222677001);
        setIntField(term58429, term58429.getClass(), "filterRec", 931155794);
        setIntField(term58429, term58429.getClass(), "filterFullCombo", 869921404);
        setIntField(term58429, term58429.getClass(), "filterAllPerfect", 431473602);
        setIntField(term58429, term58429.getClass(), "filterDifficulty", 284886453);
        setIntField(term58429, term58429.getClass(), "filterFullSync", 81623981);
        setIntField(term58429, term58429.getClass(), "filterReMaster", -1407481630);
        setIntField(term58429, term58429.getClass(), "filterMaxFever", -1963906003);
        setIntField(term58429, term58429.getClass(), "finalSelectId", -1380281551);
        setIntField(term58429, term58429.getClass(), "finalSelectCategory", -2059295062);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAppealFlame", argTypes, term58429, args);
    }

};


