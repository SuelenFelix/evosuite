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
import java.lang.Integer;

public class UserOption_setAdjustTiming_175719684763 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70431;
     Object term70649;

    public UserOption_setAdjustTiming_175719684763() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term70437 = new Long(-6394943900800506753L);
        term70431 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption"));
        Object term70433 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term70435 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term70451 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term70452 = newInstance(Class.forName("java.time.LocalDate"));
        Object term70456 = newInstance(Class.forName("java.time.LocalTime"));
        Object term70461 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term70462 = newInstance(Class.forName("java.time.LocalDate"));
        Object term70466 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term70431, term70431.getClass(), "id", 3535528164828723056L);
        setLongField(term70433, term70433.getClass(), "id", 4036794646678680547L);
        setLongField(term70435, term70435.getClass(), "id", 4006388896509492239L);
        setField(term70435, term70435.getClass(), "extId", term70437);
        setField(term70435, term70435.getClass(), "luid", "TRfRRMMCZw");
        setIntField(term70452, term70452.getClass(), "year", 2026);
        setShortField(term70452, term70452.getClass(), "month", (short) 10);
        setShortField(term70452, term70452.getClass(), "day", (short) 26);
        setField(term70451, term70451.getClass(), "date", term70452);
        setByteField(term70456, term70456.getClass(), "hour", (byte) 16);
        setByteField(term70456, term70456.getClass(), "minute", (byte) 45);
        setByteField(term70456, term70456.getClass(), "second", (byte) 43);
        setIntField(term70456, term70456.getClass(), "nano", 206234347);
        setField(term70451, term70451.getClass(), "time", term70456);
        setField(term70435, term70435.getClass(), "registerTime", term70451);
        setIntField(term70462, term70462.getClass(), "year", 2024);
        setShortField(term70462, term70462.getClass(), "month", (short) 3);
        setShortField(term70462, term70462.getClass(), "day", (short) 27);
        setField(term70461, term70461.getClass(), "date", term70462);
        setByteField(term70466, term70466.getClass(), "hour", (byte) 23);
        setByteField(term70466, term70466.getClass(), "minute", (byte) 48);
        setByteField(term70466, term70466.getClass(), "second", (byte) 45);
        setIntField(term70466, term70466.getClass(), "nano", 181365728);
        setField(term70461, term70461.getClass(), "time", term70466);
        setField(term70435, term70435.getClass(), "accessTime", term70461);
        setField(term70433, term70433.getClass(), "card", term70435);
        setIntField(term70433, term70433.getClass(), "lastDataVersion", 51452417);
        setField(term70433, term70433.getClass(), "userName", "rwbfUcOMVc");
        setIntField(term70433, term70433.getClass(), "point", 1419486741);
        setIntField(term70433, term70433.getClass(), "totalPoint", 1354604715);
        setIntField(term70433, term70433.getClass(), "iconId", 860219207);
        setIntField(term70433, term70433.getClass(), "nameplateId", 1870807379);
        setIntField(term70433, term70433.getClass(), "frameId", -667004842);
        setIntField(term70433, term70433.getClass(), "trophyId", -1826721895);
        setIntField(term70433, term70433.getClass(), "playCount", 61071892);
        setIntField(term70433, term70433.getClass(), "playVsCount", -76539716);
        setIntField(term70433, term70433.getClass(), "playSyncCount", 1044482948);
        setIntField(term70433, term70433.getClass(), "winCount", 524326924);
        setIntField(term70433, term70433.getClass(), "helpCount", -38117113);
        setIntField(term70433, term70433.getClass(), "comboCount", 2089667764);
        setIntField(term70433, term70433.getClass(), "feverCount", 1175452649);
        setIntField(term70433, term70433.getClass(), "totalHiScore", 535398079);
        setIntField(term70433, term70433.getClass(), "totalEasyHighScore", -1827195972);
        setIntField(term70433, term70433.getClass(), "totalBasicHighScore", 72074430);
        setIntField(term70433, term70433.getClass(), "totalAdvancedHighScore", -1852734181);
        setIntField(term70433, term70433.getClass(), "totalExpertHighScore", -1308471159);
        setIntField(term70433, term70433.getClass(), "totalMasterHighScore", -268958262);
        setIntField(term70433, term70433.getClass(), "totalReMasterHighScore", -180125474);
        setIntField(term70433, term70433.getClass(), "totalHighSync", 1811860572);
        setIntField(term70433, term70433.getClass(), "totalEasySync", 2147225333);
        setIntField(term70433, term70433.getClass(), "totalBasicSync", 10666427);
        setIntField(term70433, term70433.getClass(), "totalAdvancedSync", 1920948808);
        setIntField(term70433, term70433.getClass(), "totalExpertSync", 1619000643);
        setIntField(term70433, term70433.getClass(), "totalMasterSync", 121958929);
        setIntField(term70433, term70433.getClass(), "totalReMasterSync", 2041749592);
        setIntField(term70433, term70433.getClass(), "playerRating", 783358809);
        setIntField(term70433, term70433.getClass(), "highestRating", 769701019);
        setIntField(term70433, term70433.getClass(), "rankAuthTailId", 1125915526);
        setField(term70433, term70433.getClass(), "eventWatchedDate", "ljTkNgJRUl");
        setField(term70433, term70433.getClass(), "webLimitDate", "siRXAywvyp");
        setIntField(term70433, term70433.getClass(), "challengeTrackPhase", 965765161);
        setIntField(term70433, term70433.getClass(), "firstPlayBits", -81419574);
        setField(term70433, term70433.getClass(), "lastPlayDate", "ZRLaReQeFg");
        setIntField(term70433, term70433.getClass(), "lastPlaceId", 350041482);
        setField(term70433, term70433.getClass(), "lastPlaceName", "cOcXspUxKR");
        setIntField(term70433, term70433.getClass(), "lastRegionId", -1772120343);
        setField(term70433, term70433.getClass(), "lastRegionName", "JNzgWUmqtl");
        setField(term70433, term70433.getClass(), "lastClientId", "UxVfWaXiSr");
        setField(term70433, term70433.getClass(), "lastCountryCode", "yTrvklotrs");
        setIntField(term70433, term70433.getClass(), "eventPoint", -1481596613);
        setIntField(term70433, term70433.getClass(), "totalLv", -395114974);
        setIntField(term70433, term70433.getClass(), "lastLoginBonusDay", -1876210443);
        setIntField(term70433, term70433.getClass(), "lastSurvivalBonusDay", 2077295439);
        setIntField(term70433, term70433.getClass(), "loginBonusLv", 513458467);
        setField(term70431, term70431.getClass(), "user", term70433);
        setIntField(term70431, term70431.getClass(), "soudEffect", -389945492);
        setIntField(term70431, term70431.getClass(), "mirrorMode", 1789101859);
        setIntField(term70431, term70431.getClass(), "guideSpeed", -1492991450);
        setIntField(term70431, term70431.getClass(), "bgInfo", 208180035);
        setIntField(term70431, term70431.getClass(), "brightness", 879358506);
        setIntField(term70431, term70431.getClass(), "isStarRot", -149578848);
        setIntField(term70431, term70431.getClass(), "breakSe", -790053054);
        setIntField(term70431, term70431.getClass(), "slideSe", -358784693);
        setIntField(term70431, term70431.getClass(), "hardJudge", -257641591);
        setIntField(term70431, term70431.getClass(), "isTagJump", 547173219);
        setIntField(term70431, term70431.getClass(), "breakSeVol", -1222302154);
        setIntField(term70431, term70431.getClass(), "slideSeVol", -567762942);
        setIntField(term70431, term70431.getClass(), "isUpperDisp", -191282731);
        setIntField(term70431, term70431.getClass(), "trackSkip", -1074107086);
        setIntField(term70431, term70431.getClass(), "optionMode", -1109747483);
        setIntField(term70431, term70431.getClass(), "simpleOptionParam", 593503302);
        setIntField(term70431, term70431.getClass(), "adjustTiming", -432642258);
        setIntField(term70431, term70431.getClass(), "dispTiming", 1556333637);
        setIntField(term70431, term70431.getClass(), "timingPos", -565003432);
        setIntField(term70431, term70431.getClass(), "ansVol", 200942673);
        setIntField(term70431, term70431.getClass(), "noteVol", 494420860);
        setIntField(term70431, term70431.getClass(), "dmgVol", 1719483689);
        setIntField(term70431, term70431.getClass(), "appealFlame", -496949040);
        setIntField(term70431, term70431.getClass(), "isFeverDisp", 1993312573);
        setIntField(term70431, term70431.getClass(), "dispJudge", -720266848);
        setIntField(term70431, term70431.getClass(), "judgePos", 1274739943);
        setIntField(term70431, term70431.getClass(), "ratingGuard", 2052597279);
        setIntField(term70431, term70431.getClass(), "selectChara", 1051940041);
        setIntField(term70431, term70431.getClass(), "sortType", -1438630933);
        setIntField(term70431, term70431.getClass(), "filterGenre", 1429450341);
        setIntField(term70431, term70431.getClass(), "filterLevel", 853910835);
        setIntField(term70431, term70431.getClass(), "filterRank", 523509597);
        setIntField(term70431, term70431.getClass(), "filterVersion", 2115455955);
        setIntField(term70431, term70431.getClass(), "filterRec", 386488843);
        setIntField(term70431, term70431.getClass(), "filterFullCombo", 914648563);
        setIntField(term70431, term70431.getClass(), "filterAllPerfect", 938013259);
        setIntField(term70431, term70431.getClass(), "filterDifficulty", -1744748317);
        setIntField(term70431, term70431.getClass(), "filterFullSync", -136997975);
        setIntField(term70431, term70431.getClass(), "filterReMaster", -1265205171);
        setIntField(term70431, term70431.getClass(), "filterMaxFever", 1765474903);
        setIntField(term70431, term70431.getClass(), "finalSelectId", -823727373);
        setIntField(term70431, term70431.getClass(), "finalSelectCategory", -521133417);
        term70649 = new Integer(-1409612913);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term70649;
        callMethod(klass, "setAdjustTiming", argTypes, term70431, args);
    }

};


