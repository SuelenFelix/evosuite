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

public class UserOption_getSoudEffect_369017443 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51653;

    public UserOption_getSoudEffect_369017443() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term51659 = new Long(-5447369594017685765L);
        term51653 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption"));
        Object term51655 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term51657 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term51673 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term51674 = newInstance(Class.forName("java.time.LocalDate"));
        Object term51678 = newInstance(Class.forName("java.time.LocalTime"));
        Object term51683 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term51684 = newInstance(Class.forName("java.time.LocalDate"));
        Object term51688 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term51653, term51653.getClass(), "id", 7711054832353934171L);
        setLongField(term51655, term51655.getClass(), "id", 185544001230120339L);
        setLongField(term51657, term51657.getClass(), "id", 4096288569907305445L);
        setField(term51657, term51657.getClass(), "extId", term51659);
        setField(term51657, term51657.getClass(), "luid", "jkVaRrZHQX");
        setIntField(term51674, term51674.getClass(), "year", 2012);
        setShortField(term51674, term51674.getClass(), "month", (short) 11);
        setShortField(term51674, term51674.getClass(), "day", (short) 23);
        setField(term51673, term51673.getClass(), "date", term51674);
        setByteField(term51678, term51678.getClass(), "hour", (byte) 21);
        setByteField(term51678, term51678.getClass(), "minute", (byte) 45);
        setByteField(term51678, term51678.getClass(), "second", (byte) 46);
        setIntField(term51678, term51678.getClass(), "nano", 484678696);
        setField(term51673, term51673.getClass(), "time", term51678);
        setField(term51657, term51657.getClass(), "registerTime", term51673);
        setIntField(term51684, term51684.getClass(), "year", 2027);
        setShortField(term51684, term51684.getClass(), "month", (short) 12);
        setShortField(term51684, term51684.getClass(), "day", (short) 25);
        setField(term51683, term51683.getClass(), "date", term51684);
        setByteField(term51688, term51688.getClass(), "hour", (byte) 8);
        setByteField(term51688, term51688.getClass(), "minute", (byte) 19);
        setByteField(term51688, term51688.getClass(), "second", (byte) 20);
        setIntField(term51688, term51688.getClass(), "nano", 127700185);
        setField(term51683, term51683.getClass(), "time", term51688);
        setField(term51657, term51657.getClass(), "accessTime", term51683);
        setField(term51655, term51655.getClass(), "card", term51657);
        setIntField(term51655, term51655.getClass(), "lastDataVersion", 425749446);
        setField(term51655, term51655.getClass(), "userName", "gSFFUuJipG");
        setIntField(term51655, term51655.getClass(), "point", -1720765811);
        setIntField(term51655, term51655.getClass(), "totalPoint", 1856736903);
        setIntField(term51655, term51655.getClass(), "iconId", 601640545);
        setIntField(term51655, term51655.getClass(), "nameplateId", 1768015672);
        setIntField(term51655, term51655.getClass(), "frameId", -575165301);
        setIntField(term51655, term51655.getClass(), "trophyId", -1576541436);
        setIntField(term51655, term51655.getClass(), "playCount", -220907120);
        setIntField(term51655, term51655.getClass(), "playVsCount", -1401366212);
        setIntField(term51655, term51655.getClass(), "playSyncCount", 1124444723);
        setIntField(term51655, term51655.getClass(), "winCount", -149423332);
        setIntField(term51655, term51655.getClass(), "helpCount", 1593811012);
        setIntField(term51655, term51655.getClass(), "comboCount", 1743792661);
        setIntField(term51655, term51655.getClass(), "feverCount", -1347677159);
        setIntField(term51655, term51655.getClass(), "totalHiScore", 405531807);
        setIntField(term51655, term51655.getClass(), "totalEasyHighScore", -784847348);
        setIntField(term51655, term51655.getClass(), "totalBasicHighScore", -1819128604);
        setIntField(term51655, term51655.getClass(), "totalAdvancedHighScore", 937586090);
        setIntField(term51655, term51655.getClass(), "totalExpertHighScore", -507719222);
        setIntField(term51655, term51655.getClass(), "totalMasterHighScore", -100427651);
        setIntField(term51655, term51655.getClass(), "totalReMasterHighScore", -836703719);
        setIntField(term51655, term51655.getClass(), "totalHighSync", -1563918188);
        setIntField(term51655, term51655.getClass(), "totalEasySync", 153656028);
        setIntField(term51655, term51655.getClass(), "totalBasicSync", 440521526);
        setIntField(term51655, term51655.getClass(), "totalAdvancedSync", -1106412249);
        setIntField(term51655, term51655.getClass(), "totalExpertSync", -1922114971);
        setIntField(term51655, term51655.getClass(), "totalMasterSync", -1285495576);
        setIntField(term51655, term51655.getClass(), "totalReMasterSync", 605159454);
        setIntField(term51655, term51655.getClass(), "playerRating", 1393801591);
        setIntField(term51655, term51655.getClass(), "highestRating", -1187577742);
        setIntField(term51655, term51655.getClass(), "rankAuthTailId", -793777683);
        setField(term51655, term51655.getClass(), "eventWatchedDate", "bQWfIFvxkQ");
        setField(term51655, term51655.getClass(), "webLimitDate", "aDoBLXfFQI");
        setIntField(term51655, term51655.getClass(), "challengeTrackPhase", 1741594607);
        setIntField(term51655, term51655.getClass(), "firstPlayBits", 853592734);
        setField(term51655, term51655.getClass(), "lastPlayDate", "HTimNhSNVi");
        setIntField(term51655, term51655.getClass(), "lastPlaceId", -626491911);
        setField(term51655, term51655.getClass(), "lastPlaceName", "IWJWbrHcqm");
        setIntField(term51655, term51655.getClass(), "lastRegionId", -648815069);
        setField(term51655, term51655.getClass(), "lastRegionName", "ucTcadpUdW");
        setField(term51655, term51655.getClass(), "lastClientId", "AscVKZhCwm");
        setField(term51655, term51655.getClass(), "lastCountryCode", "HCvSsQWjLn");
        setIntField(term51655, term51655.getClass(), "eventPoint", 1501415160);
        setIntField(term51655, term51655.getClass(), "totalLv", 905044945);
        setIntField(term51655, term51655.getClass(), "lastLoginBonusDay", -1878642551);
        setIntField(term51655, term51655.getClass(), "lastSurvivalBonusDay", 300043927);
        setIntField(term51655, term51655.getClass(), "loginBonusLv", 2122930718);
        setField(term51653, term51653.getClass(), "user", term51655);
        setIntField(term51653, term51653.getClass(), "soudEffect", -578301288);
        setIntField(term51653, term51653.getClass(), "mirrorMode", -977176926);
        setIntField(term51653, term51653.getClass(), "guideSpeed", 57300217);
        setIntField(term51653, term51653.getClass(), "bgInfo", -296773597);
        setIntField(term51653, term51653.getClass(), "brightness", 1865713857);
        setIntField(term51653, term51653.getClass(), "isStarRot", 1621042327);
        setIntField(term51653, term51653.getClass(), "breakSe", -1687833420);
        setIntField(term51653, term51653.getClass(), "slideSe", -1302564054);
        setIntField(term51653, term51653.getClass(), "hardJudge", 1902301591);
        setIntField(term51653, term51653.getClass(), "isTagJump", 1413243835);
        setIntField(term51653, term51653.getClass(), "breakSeVol", 267793727);
        setIntField(term51653, term51653.getClass(), "slideSeVol", 824213114);
        setIntField(term51653, term51653.getClass(), "isUpperDisp", -1652054445);
        setIntField(term51653, term51653.getClass(), "trackSkip", -2032148548);
        setIntField(term51653, term51653.getClass(), "optionMode", 1592642995);
        setIntField(term51653, term51653.getClass(), "simpleOptionParam", 537031810);
        setIntField(term51653, term51653.getClass(), "adjustTiming", -1280322093);
        setIntField(term51653, term51653.getClass(), "dispTiming", -614078903);
        setIntField(term51653, term51653.getClass(), "timingPos", 250967452);
        setIntField(term51653, term51653.getClass(), "ansVol", -67856100);
        setIntField(term51653, term51653.getClass(), "noteVol", -1760300151);
        setIntField(term51653, term51653.getClass(), "dmgVol", 635198715);
        setIntField(term51653, term51653.getClass(), "appealFlame", -619729133);
        setIntField(term51653, term51653.getClass(), "isFeverDisp", -91784171);
        setIntField(term51653, term51653.getClass(), "dispJudge", -1752710731);
        setIntField(term51653, term51653.getClass(), "judgePos", -1991397007);
        setIntField(term51653, term51653.getClass(), "ratingGuard", -1896800756);
        setIntField(term51653, term51653.getClass(), "selectChara", -855121939);
        setIntField(term51653, term51653.getClass(), "sortType", 389647062);
        setIntField(term51653, term51653.getClass(), "filterGenre", 59254717);
        setIntField(term51653, term51653.getClass(), "filterLevel", -1753562901);
        setIntField(term51653, term51653.getClass(), "filterRank", 1942866138);
        setIntField(term51653, term51653.getClass(), "filterVersion", -628548003);
        setIntField(term51653, term51653.getClass(), "filterRec", -1600050434);
        setIntField(term51653, term51653.getClass(), "filterFullCombo", 2068225629);
        setIntField(term51653, term51653.getClass(), "filterAllPerfect", 230619154);
        setIntField(term51653, term51653.getClass(), "filterDifficulty", 939877540);
        setIntField(term51653, term51653.getClass(), "filterFullSync", -1177910195);
        setIntField(term51653, term51653.getClass(), "filterReMaster", 2096168037);
        setIntField(term51653, term51653.getClass(), "filterMaxFever", -681093302);
        setIntField(term51653, term51653.getClass(), "finalSelectId", 1008385565);
        setIntField(term51653, term51653.getClass(), "finalSelectCategory", -1408656420);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSoudEffect", argTypes, term51653, args);
    }

};


