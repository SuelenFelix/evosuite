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

public class UserOption_getFilterVersion_156738093635 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61509;

    public UserOption_getFilterVersion_156738093635() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term61515 = new Long(-3954795081650780841L);
        term61509 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption"));
        Object term61511 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term61513 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term61529 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term61530 = newInstance(Class.forName("java.time.LocalDate"));
        Object term61534 = newInstance(Class.forName("java.time.LocalTime"));
        Object term61539 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term61540 = newInstance(Class.forName("java.time.LocalDate"));
        Object term61544 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term61509, term61509.getClass(), "id", 678465732474023847L);
        setLongField(term61511, term61511.getClass(), "id", 2551047634163864862L);
        setLongField(term61513, term61513.getClass(), "id", -6656996002079682356L);
        setField(term61513, term61513.getClass(), "extId", term61515);
        setField(term61513, term61513.getClass(), "luid", "lkPJVVXhDd");
        setIntField(term61530, term61530.getClass(), "year", 2015);
        setShortField(term61530, term61530.getClass(), "month", (short) 5);
        setShortField(term61530, term61530.getClass(), "day", (short) 26);
        setField(term61529, term61529.getClass(), "date", term61530);
        setByteField(term61534, term61534.getClass(), "hour", (byte) 9);
        setByteField(term61534, term61534.getClass(), "minute", (byte) 34);
        setByteField(term61534, term61534.getClass(), "second", (byte) 10);
        setIntField(term61534, term61534.getClass(), "nano", 873043034);
        setField(term61529, term61529.getClass(), "time", term61534);
        setField(term61513, term61513.getClass(), "registerTime", term61529);
        setIntField(term61540, term61540.getClass(), "year", 2021);
        setShortField(term61540, term61540.getClass(), "month", (short) 11);
        setShortField(term61540, term61540.getClass(), "day", (short) 13);
        setField(term61539, term61539.getClass(), "date", term61540);
        setByteField(term61544, term61544.getClass(), "hour", (byte) 7);
        setByteField(term61544, term61544.getClass(), "minute", (byte) 27);
        setByteField(term61544, term61544.getClass(), "second", (byte) 1);
        setIntField(term61544, term61544.getClass(), "nano", 59611302);
        setField(term61539, term61539.getClass(), "time", term61544);
        setField(term61513, term61513.getClass(), "accessTime", term61539);
        setField(term61511, term61511.getClass(), "card", term61513);
        setIntField(term61511, term61511.getClass(), "lastDataVersion", 1850801712);
        setField(term61511, term61511.getClass(), "userName", "OpMnUyJTrb");
        setIntField(term61511, term61511.getClass(), "point", -1360189234);
        setIntField(term61511, term61511.getClass(), "totalPoint", -1602849275);
        setIntField(term61511, term61511.getClass(), "iconId", 1177628254);
        setIntField(term61511, term61511.getClass(), "nameplateId", 1828135720);
        setIntField(term61511, term61511.getClass(), "frameId", -1714978703);
        setIntField(term61511, term61511.getClass(), "trophyId", -100914335);
        setIntField(term61511, term61511.getClass(), "playCount", 789838565);
        setIntField(term61511, term61511.getClass(), "playVsCount", 1970218200);
        setIntField(term61511, term61511.getClass(), "playSyncCount", -742793739);
        setIntField(term61511, term61511.getClass(), "winCount", 160879345);
        setIntField(term61511, term61511.getClass(), "helpCount", 1294846385);
        setIntField(term61511, term61511.getClass(), "comboCount", -663912774);
        setIntField(term61511, term61511.getClass(), "feverCount", 1537502993);
        setIntField(term61511, term61511.getClass(), "totalHiScore", -821343526);
        setIntField(term61511, term61511.getClass(), "totalEasyHighScore", -578811370);
        setIntField(term61511, term61511.getClass(), "totalBasicHighScore", 1509308001);
        setIntField(term61511, term61511.getClass(), "totalAdvancedHighScore", -235361641);
        setIntField(term61511, term61511.getClass(), "totalExpertHighScore", -1537530133);
        setIntField(term61511, term61511.getClass(), "totalMasterHighScore", 223751596);
        setIntField(term61511, term61511.getClass(), "totalReMasterHighScore", 302291440);
        setIntField(term61511, term61511.getClass(), "totalHighSync", -1607360552);
        setIntField(term61511, term61511.getClass(), "totalEasySync", -343779783);
        setIntField(term61511, term61511.getClass(), "totalBasicSync", 1396187222);
        setIntField(term61511, term61511.getClass(), "totalAdvancedSync", 1061941712);
        setIntField(term61511, term61511.getClass(), "totalExpertSync", 2121750597);
        setIntField(term61511, term61511.getClass(), "totalMasterSync", 972099051);
        setIntField(term61511, term61511.getClass(), "totalReMasterSync", -834814848);
        setIntField(term61511, term61511.getClass(), "playerRating", -18540131);
        setIntField(term61511, term61511.getClass(), "highestRating", 2028220249);
        setIntField(term61511, term61511.getClass(), "rankAuthTailId", 1647906129);
        setField(term61511, term61511.getClass(), "eventWatchedDate", "ACBGZgugev");
        setField(term61511, term61511.getClass(), "webLimitDate", "rcbQDpUkab");
        setIntField(term61511, term61511.getClass(), "challengeTrackPhase", 711901095);
        setIntField(term61511, term61511.getClass(), "firstPlayBits", -1601686432);
        setField(term61511, term61511.getClass(), "lastPlayDate", "oZAbUeXmhW");
        setIntField(term61511, term61511.getClass(), "lastPlaceId", 1005405366);
        setField(term61511, term61511.getClass(), "lastPlaceName", "NDSDpOeQda");
        setIntField(term61511, term61511.getClass(), "lastRegionId", 1682083643);
        setField(term61511, term61511.getClass(), "lastRegionName", "HlKwxzAqTg");
        setField(term61511, term61511.getClass(), "lastClientId", "xKjkdjTYfe");
        setField(term61511, term61511.getClass(), "lastCountryCode", "HcfabJkuEQ");
        setIntField(term61511, term61511.getClass(), "eventPoint", -913374434);
        setIntField(term61511, term61511.getClass(), "totalLv", -852430845);
        setIntField(term61511, term61511.getClass(), "lastLoginBonusDay", 64842894);
        setIntField(term61511, term61511.getClass(), "lastSurvivalBonusDay", -1932624760);
        setIntField(term61511, term61511.getClass(), "loginBonusLv", 527367438);
        setField(term61509, term61509.getClass(), "user", term61511);
        setIntField(term61509, term61509.getClass(), "soudEffect", -1862333439);
        setIntField(term61509, term61509.getClass(), "mirrorMode", -798735804);
        setIntField(term61509, term61509.getClass(), "guideSpeed", 1532015613);
        setIntField(term61509, term61509.getClass(), "bgInfo", -1143681603);
        setIntField(term61509, term61509.getClass(), "brightness", 671881052);
        setIntField(term61509, term61509.getClass(), "isStarRot", 1496400210);
        setIntField(term61509, term61509.getClass(), "breakSe", -1434027177);
        setIntField(term61509, term61509.getClass(), "slideSe", 1385323795);
        setIntField(term61509, term61509.getClass(), "hardJudge", -66414124);
        setIntField(term61509, term61509.getClass(), "isTagJump", 497879148);
        setIntField(term61509, term61509.getClass(), "breakSeVol", -237343326);
        setIntField(term61509, term61509.getClass(), "slideSeVol", -392082342);
        setIntField(term61509, term61509.getClass(), "isUpperDisp", -854451115);
        setIntField(term61509, term61509.getClass(), "trackSkip", 1986079462);
        setIntField(term61509, term61509.getClass(), "optionMode", -1259832629);
        setIntField(term61509, term61509.getClass(), "simpleOptionParam", -614088635);
        setIntField(term61509, term61509.getClass(), "adjustTiming", 2118042800);
        setIntField(term61509, term61509.getClass(), "dispTiming", -1128188846);
        setIntField(term61509, term61509.getClass(), "timingPos", -1601581964);
        setIntField(term61509, term61509.getClass(), "ansVol", -1178253517);
        setIntField(term61509, term61509.getClass(), "noteVol", 1443002510);
        setIntField(term61509, term61509.getClass(), "dmgVol", 1678623341);
        setIntField(term61509, term61509.getClass(), "appealFlame", -1023826937);
        setIntField(term61509, term61509.getClass(), "isFeverDisp", 1573871540);
        setIntField(term61509, term61509.getClass(), "dispJudge", -848249952);
        setIntField(term61509, term61509.getClass(), "judgePos", 1446304058);
        setIntField(term61509, term61509.getClass(), "ratingGuard", 1814136333);
        setIntField(term61509, term61509.getClass(), "selectChara", -1517722805);
        setIntField(term61509, term61509.getClass(), "sortType", -659702501);
        setIntField(term61509, term61509.getClass(), "filterGenre", -1876896401);
        setIntField(term61509, term61509.getClass(), "filterLevel", -718518592);
        setIntField(term61509, term61509.getClass(), "filterRank", -632825483);
        setIntField(term61509, term61509.getClass(), "filterVersion", 675039331);
        setIntField(term61509, term61509.getClass(), "filterRec", -199646960);
        setIntField(term61509, term61509.getClass(), "filterFullCombo", -932918306);
        setIntField(term61509, term61509.getClass(), "filterAllPerfect", -736397590);
        setIntField(term61509, term61509.getClass(), "filterDifficulty", 1986891014);
        setIntField(term61509, term61509.getClass(), "filterFullSync", -1661858214);
        setIntField(term61509, term61509.getClass(), "filterReMaster", 1298044863);
        setIntField(term61509, term61509.getClass(), "filterMaxFever", 1115180322);
        setIntField(term61509, term61509.getClass(), "finalSelectId", -252644885);
        setIntField(term61509, term61509.getClass(), "finalSelectCategory", -738886431);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFilterVersion", argTypes, term61509, args);
    }

};


