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

public class UserOption_setDmgVol_203264334968 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71981;
     Object term72199;

    public UserOption_setDmgVol_203264334968() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term71987 = new Long(-3277773415369003529L);
        term71981 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption"));
        Object term71983 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term71985 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term72001 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term72002 = newInstance(Class.forName("java.time.LocalDate"));
        Object term72006 = newInstance(Class.forName("java.time.LocalTime"));
        Object term72011 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term72012 = newInstance(Class.forName("java.time.LocalDate"));
        Object term72016 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term71981, term71981.getClass(), "id", 7065003857377879971L);
        setLongField(term71983, term71983.getClass(), "id", 2243864141567980599L);
        setLongField(term71985, term71985.getClass(), "id", 353705949229610067L);
        setField(term71985, term71985.getClass(), "extId", term71987);
        setField(term71985, term71985.getClass(), "luid", "nlvRWrTxvz");
        setIntField(term72002, term72002.getClass(), "year", 2020);
        setShortField(term72002, term72002.getClass(), "month", (short) 12);
        setShortField(term72002, term72002.getClass(), "day", (short) 10);
        setField(term72001, term72001.getClass(), "date", term72002);
        setByteField(term72006, term72006.getClass(), "hour", (byte) 3);
        setByteField(term72006, term72006.getClass(), "minute", (byte) 40);
        setByteField(term72006, term72006.getClass(), "second", (byte) 14);
        setIntField(term72006, term72006.getClass(), "nano", 879978907);
        setField(term72001, term72001.getClass(), "time", term72006);
        setField(term71985, term71985.getClass(), "registerTime", term72001);
        setIntField(term72012, term72012.getClass(), "year", 2010);
        setShortField(term72012, term72012.getClass(), "month", (short) 3);
        setShortField(term72012, term72012.getClass(), "day", (short) 31);
        setField(term72011, term72011.getClass(), "date", term72012);
        setByteField(term72016, term72016.getClass(), "hour", (byte) 17);
        setByteField(term72016, term72016.getClass(), "minute", (byte) 7);
        setByteField(term72016, term72016.getClass(), "second", (byte) 55);
        setIntField(term72016, term72016.getClass(), "nano", 725965566);
        setField(term72011, term72011.getClass(), "time", term72016);
        setField(term71985, term71985.getClass(), "accessTime", term72011);
        setField(term71983, term71983.getClass(), "card", term71985);
        setIntField(term71983, term71983.getClass(), "lastDataVersion", 1829452545);
        setField(term71983, term71983.getClass(), "userName", "isMKwgUmka");
        setIntField(term71983, term71983.getClass(), "point", -1952040826);
        setIntField(term71983, term71983.getClass(), "totalPoint", -1905052022);
        setIntField(term71983, term71983.getClass(), "iconId", -1302189658);
        setIntField(term71983, term71983.getClass(), "nameplateId", 705205776);
        setIntField(term71983, term71983.getClass(), "frameId", -1701516448);
        setIntField(term71983, term71983.getClass(), "trophyId", 843651557);
        setIntField(term71983, term71983.getClass(), "playCount", -1996144425);
        setIntField(term71983, term71983.getClass(), "playVsCount", -645546910);
        setIntField(term71983, term71983.getClass(), "playSyncCount", -1272725557);
        setIntField(term71983, term71983.getClass(), "winCount", -757065748);
        setIntField(term71983, term71983.getClass(), "helpCount", -374472220);
        setIntField(term71983, term71983.getClass(), "comboCount", -1374592335);
        setIntField(term71983, term71983.getClass(), "feverCount", 758565825);
        setIntField(term71983, term71983.getClass(), "totalHiScore", 1226378564);
        setIntField(term71983, term71983.getClass(), "totalEasyHighScore", 202421209);
        setIntField(term71983, term71983.getClass(), "totalBasicHighScore", -1834354298);
        setIntField(term71983, term71983.getClass(), "totalAdvancedHighScore", 1081947752);
        setIntField(term71983, term71983.getClass(), "totalExpertHighScore", 1276576124);
        setIntField(term71983, term71983.getClass(), "totalMasterHighScore", 806312193);
        setIntField(term71983, term71983.getClass(), "totalReMasterHighScore", -34164224);
        setIntField(term71983, term71983.getClass(), "totalHighSync", -1800382588);
        setIntField(term71983, term71983.getClass(), "totalEasySync", -414071951);
        setIntField(term71983, term71983.getClass(), "totalBasicSync", -2141708936);
        setIntField(term71983, term71983.getClass(), "totalAdvancedSync", 260410067);
        setIntField(term71983, term71983.getClass(), "totalExpertSync", -413083092);
        setIntField(term71983, term71983.getClass(), "totalMasterSync", -1760860172);
        setIntField(term71983, term71983.getClass(), "totalReMasterSync", -1218209025);
        setIntField(term71983, term71983.getClass(), "playerRating", -1603360365);
        setIntField(term71983, term71983.getClass(), "highestRating", 661051072);
        setIntField(term71983, term71983.getClass(), "rankAuthTailId", -968061271);
        setField(term71983, term71983.getClass(), "eventWatchedDate", "pDIyzhDtTy");
        setField(term71983, term71983.getClass(), "webLimitDate", "wXiUlhXQoC");
        setIntField(term71983, term71983.getClass(), "challengeTrackPhase", -1544354289);
        setIntField(term71983, term71983.getClass(), "firstPlayBits", -268598222);
        setField(term71983, term71983.getClass(), "lastPlayDate", "gKhmgJzimH");
        setIntField(term71983, term71983.getClass(), "lastPlaceId", -1310386151);
        setField(term71983, term71983.getClass(), "lastPlaceName", "OzRiWLVXNx");
        setIntField(term71983, term71983.getClass(), "lastRegionId", -1654288079);
        setField(term71983, term71983.getClass(), "lastRegionName", "pktmgYsknu");
        setField(term71983, term71983.getClass(), "lastClientId", "SsMHzYNeji");
        setField(term71983, term71983.getClass(), "lastCountryCode", "wzAFLFdaEQ");
        setIntField(term71983, term71983.getClass(), "eventPoint", -744777680);
        setIntField(term71983, term71983.getClass(), "totalLv", 1610915527);
        setIntField(term71983, term71983.getClass(), "lastLoginBonusDay", -1491140606);
        setIntField(term71983, term71983.getClass(), "lastSurvivalBonusDay", 2133917835);
        setIntField(term71983, term71983.getClass(), "loginBonusLv", -185742454);
        setField(term71981, term71981.getClass(), "user", term71983);
        setIntField(term71981, term71981.getClass(), "soudEffect", -1014439536);
        setIntField(term71981, term71981.getClass(), "mirrorMode", 476298983);
        setIntField(term71981, term71981.getClass(), "guideSpeed", 271979703);
        setIntField(term71981, term71981.getClass(), "bgInfo", -191087684);
        setIntField(term71981, term71981.getClass(), "brightness", -776090822);
        setIntField(term71981, term71981.getClass(), "isStarRot", -179776820);
        setIntField(term71981, term71981.getClass(), "breakSe", -477105508);
        setIntField(term71981, term71981.getClass(), "slideSe", -1964032020);
        setIntField(term71981, term71981.getClass(), "hardJudge", -1625554081);
        setIntField(term71981, term71981.getClass(), "isTagJump", 1134100864);
        setIntField(term71981, term71981.getClass(), "breakSeVol", -932647893);
        setIntField(term71981, term71981.getClass(), "slideSeVol", 1309643294);
        setIntField(term71981, term71981.getClass(), "isUpperDisp", -1829760689);
        setIntField(term71981, term71981.getClass(), "trackSkip", -2114174447);
        setIntField(term71981, term71981.getClass(), "optionMode", 1848057539);
        setIntField(term71981, term71981.getClass(), "simpleOptionParam", 1803786185);
        setIntField(term71981, term71981.getClass(), "adjustTiming", 827800338);
        setIntField(term71981, term71981.getClass(), "dispTiming", -726644350);
        setIntField(term71981, term71981.getClass(), "timingPos", -1889922089);
        setIntField(term71981, term71981.getClass(), "ansVol", -1126162521);
        setIntField(term71981, term71981.getClass(), "noteVol", -1937977171);
        setIntField(term71981, term71981.getClass(), "dmgVol", -1393512773);
        setIntField(term71981, term71981.getClass(), "appealFlame", -766556211);
        setIntField(term71981, term71981.getClass(), "isFeverDisp", -362370868);
        setIntField(term71981, term71981.getClass(), "dispJudge", 340420516);
        setIntField(term71981, term71981.getClass(), "judgePos", -500639296);
        setIntField(term71981, term71981.getClass(), "ratingGuard", -64111831);
        setIntField(term71981, term71981.getClass(), "selectChara", -145193222);
        setIntField(term71981, term71981.getClass(), "sortType", 1575078592);
        setIntField(term71981, term71981.getClass(), "filterGenre", 788083238);
        setIntField(term71981, term71981.getClass(), "filterLevel", 1054274026);
        setIntField(term71981, term71981.getClass(), "filterRank", -1201178573);
        setIntField(term71981, term71981.getClass(), "filterVersion", -195059182);
        setIntField(term71981, term71981.getClass(), "filterRec", 1388069057);
        setIntField(term71981, term71981.getClass(), "filterFullCombo", 1154352435);
        setIntField(term71981, term71981.getClass(), "filterAllPerfect", -98467954);
        setIntField(term71981, term71981.getClass(), "filterDifficulty", 785520439);
        setIntField(term71981, term71981.getClass(), "filterFullSync", 701479074);
        setIntField(term71981, term71981.getClass(), "filterReMaster", -11818194);
        setIntField(term71981, term71981.getClass(), "filterMaxFever", 1019156814);
        setIntField(term71981, term71981.getClass(), "finalSelectId", -1002505764);
        setIntField(term71981, term71981.getClass(), "finalSelectCategory", 1521523520);
        term72199 = new Integer(464541997);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term72199;
        callMethod(klass, "setDmgVol", argTypes, term71981, args);
    }

};


