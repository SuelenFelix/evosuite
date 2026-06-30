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

public class UserOption_getJudgePos_149558932728 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59353;

    public UserOption_getJudgePos_149558932728() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term59359 = new Long(8540994973773607992L);
        term59353 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption"));
        Object term59355 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term59357 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term59373 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term59374 = newInstance(Class.forName("java.time.LocalDate"));
        Object term59378 = newInstance(Class.forName("java.time.LocalTime"));
        Object term59383 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term59384 = newInstance(Class.forName("java.time.LocalDate"));
        Object term59388 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term59353, term59353.getClass(), "id", -4191270658895729623L);
        setLongField(term59355, term59355.getClass(), "id", 349726685019432833L);
        setLongField(term59357, term59357.getClass(), "id", 5047215164896153648L);
        setField(term59357, term59357.getClass(), "extId", term59359);
        setField(term59357, term59357.getClass(), "luid", "yCqQIOXRXO");
        setIntField(term59374, term59374.getClass(), "year", 2020);
        setShortField(term59374, term59374.getClass(), "month", (short) 2);
        setShortField(term59374, term59374.getClass(), "day", (short) 22);
        setField(term59373, term59373.getClass(), "date", term59374);
        setByteField(term59378, term59378.getClass(), "hour", (byte) 5);
        setByteField(term59378, term59378.getClass(), "minute", (byte) 45);
        setByteField(term59378, term59378.getClass(), "second", (byte) 53);
        setIntField(term59378, term59378.getClass(), "nano", 933056720);
        setField(term59373, term59373.getClass(), "time", term59378);
        setField(term59357, term59357.getClass(), "registerTime", term59373);
        setIntField(term59384, term59384.getClass(), "year", 2012);
        setShortField(term59384, term59384.getClass(), "month", (short) 11);
        setShortField(term59384, term59384.getClass(), "day", (short) 26);
        setField(term59383, term59383.getClass(), "date", term59384);
        setByteField(term59388, term59388.getClass(), "hour", (byte) 23);
        setByteField(term59388, term59388.getClass(), "minute", (byte) 32);
        setByteField(term59388, term59388.getClass(), "second", (byte) 25);
        setIntField(term59388, term59388.getClass(), "nano", 47326173);
        setField(term59383, term59383.getClass(), "time", term59388);
        setField(term59357, term59357.getClass(), "accessTime", term59383);
        setField(term59355, term59355.getClass(), "card", term59357);
        setIntField(term59355, term59355.getClass(), "lastDataVersion", -362697593);
        setField(term59355, term59355.getClass(), "userName", "aevLPMVcYW");
        setIntField(term59355, term59355.getClass(), "point", -1972052281);
        setIntField(term59355, term59355.getClass(), "totalPoint", 1935086654);
        setIntField(term59355, term59355.getClass(), "iconId", -1631985638);
        setIntField(term59355, term59355.getClass(), "nameplateId", -2095728614);
        setIntField(term59355, term59355.getClass(), "frameId", 436401547);
        setIntField(term59355, term59355.getClass(), "trophyId", 788471676);
        setIntField(term59355, term59355.getClass(), "playCount", -1768256854);
        setIntField(term59355, term59355.getClass(), "playVsCount", -1924640207);
        setIntField(term59355, term59355.getClass(), "playSyncCount", -1337500518);
        setIntField(term59355, term59355.getClass(), "winCount", 1075950264);
        setIntField(term59355, term59355.getClass(), "helpCount", 2023667585);
        setIntField(term59355, term59355.getClass(), "comboCount", -1457367270);
        setIntField(term59355, term59355.getClass(), "feverCount", 599933959);
        setIntField(term59355, term59355.getClass(), "totalHiScore", 1546898322);
        setIntField(term59355, term59355.getClass(), "totalEasyHighScore", 1681670795);
        setIntField(term59355, term59355.getClass(), "totalBasicHighScore", 371953556);
        setIntField(term59355, term59355.getClass(), "totalAdvancedHighScore", 1627368933);
        setIntField(term59355, term59355.getClass(), "totalExpertHighScore", -976378630);
        setIntField(term59355, term59355.getClass(), "totalMasterHighScore", -1198631435);
        setIntField(term59355, term59355.getClass(), "totalReMasterHighScore", 243073628);
        setIntField(term59355, term59355.getClass(), "totalHighSync", 12526162);
        setIntField(term59355, term59355.getClass(), "totalEasySync", 1392375010);
        setIntField(term59355, term59355.getClass(), "totalBasicSync", -1993971761);
        setIntField(term59355, term59355.getClass(), "totalAdvancedSync", 1389251335);
        setIntField(term59355, term59355.getClass(), "totalExpertSync", -921428041);
        setIntField(term59355, term59355.getClass(), "totalMasterSync", 61264180);
        setIntField(term59355, term59355.getClass(), "totalReMasterSync", -1036194324);
        setIntField(term59355, term59355.getClass(), "playerRating", -486471150);
        setIntField(term59355, term59355.getClass(), "highestRating", 837208909);
        setIntField(term59355, term59355.getClass(), "rankAuthTailId", 1016033285);
        setField(term59355, term59355.getClass(), "eventWatchedDate", "orHcHVrwHz");
        setField(term59355, term59355.getClass(), "webLimitDate", "mkEWcQdwUn");
        setIntField(term59355, term59355.getClass(), "challengeTrackPhase", -1981879284);
        setIntField(term59355, term59355.getClass(), "firstPlayBits", -1922383305);
        setField(term59355, term59355.getClass(), "lastPlayDate", "VRjVlzFSIx");
        setIntField(term59355, term59355.getClass(), "lastPlaceId", -1515149854);
        setField(term59355, term59355.getClass(), "lastPlaceName", "fNlDLqQZFT");
        setIntField(term59355, term59355.getClass(), "lastRegionId", 2127902475);
        setField(term59355, term59355.getClass(), "lastRegionName", "szCfpoTDXX");
        setField(term59355, term59355.getClass(), "lastClientId", "blnSDUyHkS");
        setField(term59355, term59355.getClass(), "lastCountryCode", "byyepwHlHN");
        setIntField(term59355, term59355.getClass(), "eventPoint", -974929860);
        setIntField(term59355, term59355.getClass(), "totalLv", -229722367);
        setIntField(term59355, term59355.getClass(), "lastLoginBonusDay", 46745820);
        setIntField(term59355, term59355.getClass(), "lastSurvivalBonusDay", 521784908);
        setIntField(term59355, term59355.getClass(), "loginBonusLv", -716648067);
        setField(term59353, term59353.getClass(), "user", term59355);
        setIntField(term59353, term59353.getClass(), "soudEffect", 100573346);
        setIntField(term59353, term59353.getClass(), "mirrorMode", 72576894);
        setIntField(term59353, term59353.getClass(), "guideSpeed", 1802709528);
        setIntField(term59353, term59353.getClass(), "bgInfo", 625411236);
        setIntField(term59353, term59353.getClass(), "brightness", 1278363908);
        setIntField(term59353, term59353.getClass(), "isStarRot", 1679478889);
        setIntField(term59353, term59353.getClass(), "breakSe", 1711128633);
        setIntField(term59353, term59353.getClass(), "slideSe", 558898048);
        setIntField(term59353, term59353.getClass(), "hardJudge", -1751947747);
        setIntField(term59353, term59353.getClass(), "isTagJump", 750226278);
        setIntField(term59353, term59353.getClass(), "breakSeVol", -1153409944);
        setIntField(term59353, term59353.getClass(), "slideSeVol", 1063281217);
        setIntField(term59353, term59353.getClass(), "isUpperDisp", 981222791);
        setIntField(term59353, term59353.getClass(), "trackSkip", 1297362786);
        setIntField(term59353, term59353.getClass(), "optionMode", -1701558271);
        setIntField(term59353, term59353.getClass(), "simpleOptionParam", 1777553175);
        setIntField(term59353, term59353.getClass(), "adjustTiming", 1321016655);
        setIntField(term59353, term59353.getClass(), "dispTiming", -893412167);
        setIntField(term59353, term59353.getClass(), "timingPos", 985381114);
        setIntField(term59353, term59353.getClass(), "ansVol", 2091907097);
        setIntField(term59353, term59353.getClass(), "noteVol", 589633036);
        setIntField(term59353, term59353.getClass(), "dmgVol", 608454583);
        setIntField(term59353, term59353.getClass(), "appealFlame", -117720047);
        setIntField(term59353, term59353.getClass(), "isFeverDisp", -892566680);
        setIntField(term59353, term59353.getClass(), "dispJudge", 1674142259);
        setIntField(term59353, term59353.getClass(), "judgePos", -1303208102);
        setIntField(term59353, term59353.getClass(), "ratingGuard", 1957563972);
        setIntField(term59353, term59353.getClass(), "selectChara", -193596012);
        setIntField(term59353, term59353.getClass(), "sortType", 919991978);
        setIntField(term59353, term59353.getClass(), "filterGenre", -240870307);
        setIntField(term59353, term59353.getClass(), "filterLevel", -812476026);
        setIntField(term59353, term59353.getClass(), "filterRank", -1921252803);
        setIntField(term59353, term59353.getClass(), "filterVersion", 542685338);
        setIntField(term59353, term59353.getClass(), "filterRec", 593280113);
        setIntField(term59353, term59353.getClass(), "filterFullCombo", 1265600687);
        setIntField(term59353, term59353.getClass(), "filterAllPerfect", 156680957);
        setIntField(term59353, term59353.getClass(), "filterDifficulty", -181324663);
        setIntField(term59353, term59353.getClass(), "filterFullSync", 973270477);
        setIntField(term59353, term59353.getClass(), "filterReMaster", 50996915);
        setIntField(term59353, term59353.getClass(), "filterMaxFever", -241796987);
        setIntField(term59353, term59353.getClass(), "finalSelectId", -1252248921);
        setIntField(term59353, term59353.getClass(), "finalSelectCategory", 1214656233);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getJudgePos", argTypes, term59353, args);
    }

};


