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

public class UserOption_getDispTiming_65865068820 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56889;

    public UserOption_getDispTiming_65865068820() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term56895 = new Long(-1000830646340880796L);
        term56889 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption"));
        Object term56891 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term56893 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term56909 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term56910 = newInstance(Class.forName("java.time.LocalDate"));
        Object term56914 = newInstance(Class.forName("java.time.LocalTime"));
        Object term56919 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term56920 = newInstance(Class.forName("java.time.LocalDate"));
        Object term56924 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term56889, term56889.getClass(), "id", -5876259280451647338L);
        setLongField(term56891, term56891.getClass(), "id", -4562564710769146498L);
        setLongField(term56893, term56893.getClass(), "id", -6254265799185295775L);
        setField(term56893, term56893.getClass(), "extId", term56895);
        setField(term56893, term56893.getClass(), "luid", "fNzFTiRCjp");
        setIntField(term56910, term56910.getClass(), "year", 2012);
        setShortField(term56910, term56910.getClass(), "month", (short) 7);
        setShortField(term56910, term56910.getClass(), "day", (short) 6);
        setField(term56909, term56909.getClass(), "date", term56910);
        setByteField(term56914, term56914.getClass(), "hour", (byte) 0);
        setByteField(term56914, term56914.getClass(), "minute", (byte) 48);
        setByteField(term56914, term56914.getClass(), "second", (byte) 16);
        setIntField(term56914, term56914.getClass(), "nano", 235139356);
        setField(term56909, term56909.getClass(), "time", term56914);
        setField(term56893, term56893.getClass(), "registerTime", term56909);
        setIntField(term56920, term56920.getClass(), "year", 2023);
        setShortField(term56920, term56920.getClass(), "month", (short) 2);
        setShortField(term56920, term56920.getClass(), "day", (short) 6);
        setField(term56919, term56919.getClass(), "date", term56920);
        setByteField(term56924, term56924.getClass(), "hour", (byte) 3);
        setByteField(term56924, term56924.getClass(), "minute", (byte) 1);
        setByteField(term56924, term56924.getClass(), "second", (byte) 52);
        setIntField(term56924, term56924.getClass(), "nano", 345404097);
        setField(term56919, term56919.getClass(), "time", term56924);
        setField(term56893, term56893.getClass(), "accessTime", term56919);
        setField(term56891, term56891.getClass(), "card", term56893);
        setIntField(term56891, term56891.getClass(), "lastDataVersion", -269773023);
        setField(term56891, term56891.getClass(), "userName", "yaCGGogKro");
        setIntField(term56891, term56891.getClass(), "point", -718649828);
        setIntField(term56891, term56891.getClass(), "totalPoint", -324751303);
        setIntField(term56891, term56891.getClass(), "iconId", 59394991);
        setIntField(term56891, term56891.getClass(), "nameplateId", 1340125056);
        setIntField(term56891, term56891.getClass(), "frameId", -163957346);
        setIntField(term56891, term56891.getClass(), "trophyId", 536808724);
        setIntField(term56891, term56891.getClass(), "playCount", -534385154);
        setIntField(term56891, term56891.getClass(), "playVsCount", -1277688883);
        setIntField(term56891, term56891.getClass(), "playSyncCount", 2143702118);
        setIntField(term56891, term56891.getClass(), "winCount", -1514256392);
        setIntField(term56891, term56891.getClass(), "helpCount", -706084233);
        setIntField(term56891, term56891.getClass(), "comboCount", 786595172);
        setIntField(term56891, term56891.getClass(), "feverCount", 1090005556);
        setIntField(term56891, term56891.getClass(), "totalHiScore", 86451720);
        setIntField(term56891, term56891.getClass(), "totalEasyHighScore", -1916270131);
        setIntField(term56891, term56891.getClass(), "totalBasicHighScore", 430692285);
        setIntField(term56891, term56891.getClass(), "totalAdvancedHighScore", 354561212);
        setIntField(term56891, term56891.getClass(), "totalExpertHighScore", -1171538201);
        setIntField(term56891, term56891.getClass(), "totalMasterHighScore", 1030420582);
        setIntField(term56891, term56891.getClass(), "totalReMasterHighScore", 1441242370);
        setIntField(term56891, term56891.getClass(), "totalHighSync", -1266421079);
        setIntField(term56891, term56891.getClass(), "totalEasySync", -428024469);
        setIntField(term56891, term56891.getClass(), "totalBasicSync", -428926218);
        setIntField(term56891, term56891.getClass(), "totalAdvancedSync", 1874384865);
        setIntField(term56891, term56891.getClass(), "totalExpertSync", -559576348);
        setIntField(term56891, term56891.getClass(), "totalMasterSync", -779864176);
        setIntField(term56891, term56891.getClass(), "totalReMasterSync", -819912343);
        setIntField(term56891, term56891.getClass(), "playerRating", 1828884130);
        setIntField(term56891, term56891.getClass(), "highestRating", -1130376171);
        setIntField(term56891, term56891.getClass(), "rankAuthTailId", 1286975918);
        setField(term56891, term56891.getClass(), "eventWatchedDate", "qxrRUnjshF");
        setField(term56891, term56891.getClass(), "webLimitDate", "WmVcapKAeJ");
        setIntField(term56891, term56891.getClass(), "challengeTrackPhase", 1198027781);
        setIntField(term56891, term56891.getClass(), "firstPlayBits", -488875141);
        setField(term56891, term56891.getClass(), "lastPlayDate", "jevOVdQdpc");
        setIntField(term56891, term56891.getClass(), "lastPlaceId", 168611945);
        setField(term56891, term56891.getClass(), "lastPlaceName", "TLLVSGTNsz");
        setIntField(term56891, term56891.getClass(), "lastRegionId", 1037377774);
        setField(term56891, term56891.getClass(), "lastRegionName", "mbBWfaHCrP");
        setField(term56891, term56891.getClass(), "lastClientId", "wFyiZloCxg");
        setField(term56891, term56891.getClass(), "lastCountryCode", "xYztJEIPWy");
        setIntField(term56891, term56891.getClass(), "eventPoint", 270481103);
        setIntField(term56891, term56891.getClass(), "totalLv", -515394013);
        setIntField(term56891, term56891.getClass(), "lastLoginBonusDay", 2109927830);
        setIntField(term56891, term56891.getClass(), "lastSurvivalBonusDay", 145834234);
        setIntField(term56891, term56891.getClass(), "loginBonusLv", -228810962);
        setField(term56889, term56889.getClass(), "user", term56891);
        setIntField(term56889, term56889.getClass(), "soudEffect", 1375191716);
        setIntField(term56889, term56889.getClass(), "mirrorMode", 740991259);
        setIntField(term56889, term56889.getClass(), "guideSpeed", -592719629);
        setIntField(term56889, term56889.getClass(), "bgInfo", 1432125390);
        setIntField(term56889, term56889.getClass(), "brightness", -2117682827);
        setIntField(term56889, term56889.getClass(), "isStarRot", -735213364);
        setIntField(term56889, term56889.getClass(), "breakSe", -1015936088);
        setIntField(term56889, term56889.getClass(), "slideSe", 653864647);
        setIntField(term56889, term56889.getClass(), "hardJudge", 43072711);
        setIntField(term56889, term56889.getClass(), "isTagJump", -1716297843);
        setIntField(term56889, term56889.getClass(), "breakSeVol", -456659197);
        setIntField(term56889, term56889.getClass(), "slideSeVol", -765777411);
        setIntField(term56889, term56889.getClass(), "isUpperDisp", -975098081);
        setIntField(term56889, term56889.getClass(), "trackSkip", 93863517);
        setIntField(term56889, term56889.getClass(), "optionMode", -1434712378);
        setIntField(term56889, term56889.getClass(), "simpleOptionParam", -1932255799);
        setIntField(term56889, term56889.getClass(), "adjustTiming", -178856156);
        setIntField(term56889, term56889.getClass(), "dispTiming", -414924394);
        setIntField(term56889, term56889.getClass(), "timingPos", 515944055);
        setIntField(term56889, term56889.getClass(), "ansVol", 403780056);
        setIntField(term56889, term56889.getClass(), "noteVol", 1834523834);
        setIntField(term56889, term56889.getClass(), "dmgVol", 399538802);
        setIntField(term56889, term56889.getClass(), "appealFlame", 293797529);
        setIntField(term56889, term56889.getClass(), "isFeverDisp", -2060795821);
        setIntField(term56889, term56889.getClass(), "dispJudge", -159511730);
        setIntField(term56889, term56889.getClass(), "judgePos", 370898129);
        setIntField(term56889, term56889.getClass(), "ratingGuard", -970532580);
        setIntField(term56889, term56889.getClass(), "selectChara", 869653312);
        setIntField(term56889, term56889.getClass(), "sortType", 464373107);
        setIntField(term56889, term56889.getClass(), "filterGenre", -153889480);
        setIntField(term56889, term56889.getClass(), "filterLevel", 1435683093);
        setIntField(term56889, term56889.getClass(), "filterRank", -1906424793);
        setIntField(term56889, term56889.getClass(), "filterVersion", 1262036398);
        setIntField(term56889, term56889.getClass(), "filterRec", 1864946460);
        setIntField(term56889, term56889.getClass(), "filterFullCombo", -1209161295);
        setIntField(term56889, term56889.getClass(), "filterAllPerfect", 341162488);
        setIntField(term56889, term56889.getClass(), "filterDifficulty", 1772832909);
        setIntField(term56889, term56889.getClass(), "filterFullSync", -1791192223);
        setIntField(term56889, term56889.getClass(), "filterReMaster", -384087961);
        setIntField(term56889, term56889.getClass(), "filterMaxFever", 2102378795);
        setIntField(term56889, term56889.getClass(), "finalSelectId", 180198397);
        setIntField(term56889, term56889.getClass(), "finalSelectCategory", -763713763);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDispTiming", argTypes, term56889, args);
    }

};


