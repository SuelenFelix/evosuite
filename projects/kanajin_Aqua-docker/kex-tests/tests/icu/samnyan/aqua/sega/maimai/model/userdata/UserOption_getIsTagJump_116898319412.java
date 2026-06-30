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

public class UserOption_getIsTagJump_116898319412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54425;

    public UserOption_getIsTagJump_116898319412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term54431 = new Long(-4030863184426321096L);
        term54425 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption"));
        Object term54427 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term54429 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term54445 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term54446 = newInstance(Class.forName("java.time.LocalDate"));
        Object term54450 = newInstance(Class.forName("java.time.LocalTime"));
        Object term54455 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term54456 = newInstance(Class.forName("java.time.LocalDate"));
        Object term54460 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term54425, term54425.getClass(), "id", 77619432202128806L);
        setLongField(term54427, term54427.getClass(), "id", -1647156882669215876L);
        setLongField(term54429, term54429.getClass(), "id", 4115148503664117517L);
        setField(term54429, term54429.getClass(), "extId", term54431);
        setField(term54429, term54429.getClass(), "luid", "ggFhMyQvdw");
        setIntField(term54446, term54446.getClass(), "year", 2025);
        setShortField(term54446, term54446.getClass(), "month", (short) 2);
        setShortField(term54446, term54446.getClass(), "day", (short) 24);
        setField(term54445, term54445.getClass(), "date", term54446);
        setByteField(term54450, term54450.getClass(), "hour", (byte) 10);
        setByteField(term54450, term54450.getClass(), "minute", (byte) 56);
        setByteField(term54450, term54450.getClass(), "second", (byte) 29);
        setIntField(term54450, term54450.getClass(), "nano", 207724630);
        setField(term54445, term54445.getClass(), "time", term54450);
        setField(term54429, term54429.getClass(), "registerTime", term54445);
        setIntField(term54456, term54456.getClass(), "year", 2027);
        setShortField(term54456, term54456.getClass(), "month", (short) 8);
        setShortField(term54456, term54456.getClass(), "day", (short) 16);
        setField(term54455, term54455.getClass(), "date", term54456);
        setByteField(term54460, term54460.getClass(), "hour", (byte) 1);
        setByteField(term54460, term54460.getClass(), "minute", (byte) 50);
        setByteField(term54460, term54460.getClass(), "second", (byte) 52);
        setIntField(term54460, term54460.getClass(), "nano", 161814778);
        setField(term54455, term54455.getClass(), "time", term54460);
        setField(term54429, term54429.getClass(), "accessTime", term54455);
        setField(term54427, term54427.getClass(), "card", term54429);
        setIntField(term54427, term54427.getClass(), "lastDataVersion", 375976050);
        setField(term54427, term54427.getClass(), "userName", "vZpMxQNHKu");
        setIntField(term54427, term54427.getClass(), "point", -1932003593);
        setIntField(term54427, term54427.getClass(), "totalPoint", 1475174061);
        setIntField(term54427, term54427.getClass(), "iconId", -1586912461);
        setIntField(term54427, term54427.getClass(), "nameplateId", -25528003);
        setIntField(term54427, term54427.getClass(), "frameId", 1719470688);
        setIntField(term54427, term54427.getClass(), "trophyId", 1817327304);
        setIntField(term54427, term54427.getClass(), "playCount", -1498307773);
        setIntField(term54427, term54427.getClass(), "playVsCount", -919077833);
        setIntField(term54427, term54427.getClass(), "playSyncCount", 86490701);
        setIntField(term54427, term54427.getClass(), "winCount", -406097429);
        setIntField(term54427, term54427.getClass(), "helpCount", 473643844);
        setIntField(term54427, term54427.getClass(), "comboCount", 1336551685);
        setIntField(term54427, term54427.getClass(), "feverCount", -171146643);
        setIntField(term54427, term54427.getClass(), "totalHiScore", 1243420669);
        setIntField(term54427, term54427.getClass(), "totalEasyHighScore", 1961265905);
        setIntField(term54427, term54427.getClass(), "totalBasicHighScore", -194331877);
        setIntField(term54427, term54427.getClass(), "totalAdvancedHighScore", -948751278);
        setIntField(term54427, term54427.getClass(), "totalExpertHighScore", -403239789);
        setIntField(term54427, term54427.getClass(), "totalMasterHighScore", 1919856422);
        setIntField(term54427, term54427.getClass(), "totalReMasterHighScore", 1075667277);
        setIntField(term54427, term54427.getClass(), "totalHighSync", 523284856);
        setIntField(term54427, term54427.getClass(), "totalEasySync", -1189621083);
        setIntField(term54427, term54427.getClass(), "totalBasicSync", -1476735618);
        setIntField(term54427, term54427.getClass(), "totalAdvancedSync", -1126757723);
        setIntField(term54427, term54427.getClass(), "totalExpertSync", -1650915963);
        setIntField(term54427, term54427.getClass(), "totalMasterSync", 1043027844);
        setIntField(term54427, term54427.getClass(), "totalReMasterSync", 893498941);
        setIntField(term54427, term54427.getClass(), "playerRating", -1645433738);
        setIntField(term54427, term54427.getClass(), "highestRating", 170899666);
        setIntField(term54427, term54427.getClass(), "rankAuthTailId", -1076430581);
        setField(term54427, term54427.getClass(), "eventWatchedDate", "QLMSDWYwBC");
        setField(term54427, term54427.getClass(), "webLimitDate", "feyxNWUenU");
        setIntField(term54427, term54427.getClass(), "challengeTrackPhase", 1009467504);
        setIntField(term54427, term54427.getClass(), "firstPlayBits", -140520015);
        setField(term54427, term54427.getClass(), "lastPlayDate", "qvqwmSUIiP");
        setIntField(term54427, term54427.getClass(), "lastPlaceId", -1112538327);
        setField(term54427, term54427.getClass(), "lastPlaceName", "eNOEXYoAtV");
        setIntField(term54427, term54427.getClass(), "lastRegionId", 834878229);
        setField(term54427, term54427.getClass(), "lastRegionName", "SNqwfZGLFh");
        setField(term54427, term54427.getClass(), "lastClientId", "sMqpXbgEga");
        setField(term54427, term54427.getClass(), "lastCountryCode", "nYJlDpoMcL");
        setIntField(term54427, term54427.getClass(), "eventPoint", 602457171);
        setIntField(term54427, term54427.getClass(), "totalLv", -625958026);
        setIntField(term54427, term54427.getClass(), "lastLoginBonusDay", 1365173968);
        setIntField(term54427, term54427.getClass(), "lastSurvivalBonusDay", -58269650);
        setIntField(term54427, term54427.getClass(), "loginBonusLv", -1473226766);
        setField(term54425, term54425.getClass(), "user", term54427);
        setIntField(term54425, term54425.getClass(), "soudEffect", 675408622);
        setIntField(term54425, term54425.getClass(), "mirrorMode", 1010137030);
        setIntField(term54425, term54425.getClass(), "guideSpeed", -1889642100);
        setIntField(term54425, term54425.getClass(), "bgInfo", 2145169938);
        setIntField(term54425, term54425.getClass(), "brightness", 200649815);
        setIntField(term54425, term54425.getClass(), "isStarRot", -825109684);
        setIntField(term54425, term54425.getClass(), "breakSe", -908737984);
        setIntField(term54425, term54425.getClass(), "slideSe", -1108486320);
        setIntField(term54425, term54425.getClass(), "hardJudge", -1175116960);
        setIntField(term54425, term54425.getClass(), "isTagJump", 1090620326);
        setIntField(term54425, term54425.getClass(), "breakSeVol", 1832573352);
        setIntField(term54425, term54425.getClass(), "slideSeVol", 17102219);
        setIntField(term54425, term54425.getClass(), "isUpperDisp", -436664138);
        setIntField(term54425, term54425.getClass(), "trackSkip", -1751086046);
        setIntField(term54425, term54425.getClass(), "optionMode", -384847577);
        setIntField(term54425, term54425.getClass(), "simpleOptionParam", -1036512897);
        setIntField(term54425, term54425.getClass(), "adjustTiming", -862201634);
        setIntField(term54425, term54425.getClass(), "dispTiming", -1414284967);
        setIntField(term54425, term54425.getClass(), "timingPos", 68026648);
        setIntField(term54425, term54425.getClass(), "ansVol", 851471025);
        setIntField(term54425, term54425.getClass(), "noteVol", 310981701);
        setIntField(term54425, term54425.getClass(), "dmgVol", -1403596364);
        setIntField(term54425, term54425.getClass(), "appealFlame", 1473665279);
        setIntField(term54425, term54425.getClass(), "isFeverDisp", -758072942);
        setIntField(term54425, term54425.getClass(), "dispJudge", -88429419);
        setIntField(term54425, term54425.getClass(), "judgePos", -125218254);
        setIntField(term54425, term54425.getClass(), "ratingGuard", -10117375);
        setIntField(term54425, term54425.getClass(), "selectChara", 1628351455);
        setIntField(term54425, term54425.getClass(), "sortType", -417098935);
        setIntField(term54425, term54425.getClass(), "filterGenre", 207512423);
        setIntField(term54425, term54425.getClass(), "filterLevel", -1692495211);
        setIntField(term54425, term54425.getClass(), "filterRank", -1275247802);
        setIntField(term54425, term54425.getClass(), "filterVersion", -214786685);
        setIntField(term54425, term54425.getClass(), "filterRec", -1563422009);
        setIntField(term54425, term54425.getClass(), "filterFullCombo", 1071400572);
        setIntField(term54425, term54425.getClass(), "filterAllPerfect", 593230414);
        setIntField(term54425, term54425.getClass(), "filterDifficulty", 111767836);
        setIntField(term54425, term54425.getClass(), "filterFullSync", -894018524);
        setIntField(term54425, term54425.getClass(), "filterReMaster", -1805793810);
        setIntField(term54425, term54425.getClass(), "filterMaxFever", 693687159);
        setIntField(term54425, term54425.getClass(), "finalSelectId", -1632145668);
        setIntField(term54425, term54425.getClass(), "finalSelectCategory", -161036428);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIsTagJump", argTypes, term54425, args);
    }

};


