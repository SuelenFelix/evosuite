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

public class UserOption_setTimingPos_202396464465 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71051;
     Object term71269;

    public UserOption_setTimingPos_202396464465() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term71057 = new Long(1044883697493326351L);
        term71051 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption"));
        Object term71053 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term71055 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term71071 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term71072 = newInstance(Class.forName("java.time.LocalDate"));
        Object term71076 = newInstance(Class.forName("java.time.LocalTime"));
        Object term71081 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term71082 = newInstance(Class.forName("java.time.LocalDate"));
        Object term71086 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term71051, term71051.getClass(), "id", -5304831679802174866L);
        setLongField(term71053, term71053.getClass(), "id", 1909175111101717943L);
        setLongField(term71055, term71055.getClass(), "id", 8499930868919012909L);
        setField(term71055, term71055.getClass(), "extId", term71057);
        setField(term71055, term71055.getClass(), "luid", "NAwiEDVBcB");
        setIntField(term71072, term71072.getClass(), "year", 2015);
        setShortField(term71072, term71072.getClass(), "month", (short) 8);
        setShortField(term71072, term71072.getClass(), "day", (short) 3);
        setField(term71071, term71071.getClass(), "date", term71072);
        setByteField(term71076, term71076.getClass(), "hour", (byte) 21);
        setByteField(term71076, term71076.getClass(), "minute", (byte) 57);
        setByteField(term71076, term71076.getClass(), "second", (byte) 2);
        setIntField(term71076, term71076.getClass(), "nano", 438141628);
        setField(term71071, term71071.getClass(), "time", term71076);
        setField(term71055, term71055.getClass(), "registerTime", term71071);
        setIntField(term71082, term71082.getClass(), "year", 2011);
        setShortField(term71082, term71082.getClass(), "month", (short) 3);
        setShortField(term71082, term71082.getClass(), "day", (short) 10);
        setField(term71081, term71081.getClass(), "date", term71082);
        setByteField(term71086, term71086.getClass(), "hour", (byte) 4);
        setByteField(term71086, term71086.getClass(), "minute", (byte) 13);
        setByteField(term71086, term71086.getClass(), "second", (byte) 46);
        setIntField(term71086, term71086.getClass(), "nano", 212390008);
        setField(term71081, term71081.getClass(), "time", term71086);
        setField(term71055, term71055.getClass(), "accessTime", term71081);
        setField(term71053, term71053.getClass(), "card", term71055);
        setIntField(term71053, term71053.getClass(), "lastDataVersion", 547335421);
        setField(term71053, term71053.getClass(), "userName", "jxuVQHHLqy");
        setIntField(term71053, term71053.getClass(), "point", 2116412636);
        setIntField(term71053, term71053.getClass(), "totalPoint", -2016758054);
        setIntField(term71053, term71053.getClass(), "iconId", -1010951475);
        setIntField(term71053, term71053.getClass(), "nameplateId", -1802761834);
        setIntField(term71053, term71053.getClass(), "frameId", 722925820);
        setIntField(term71053, term71053.getClass(), "trophyId", 1912473903);
        setIntField(term71053, term71053.getClass(), "playCount", -1362804989);
        setIntField(term71053, term71053.getClass(), "playVsCount", 193811882);
        setIntField(term71053, term71053.getClass(), "playSyncCount", -1508936648);
        setIntField(term71053, term71053.getClass(), "winCount", 633922177);
        setIntField(term71053, term71053.getClass(), "helpCount", 2140007432);
        setIntField(term71053, term71053.getClass(), "comboCount", -1242429003);
        setIntField(term71053, term71053.getClass(), "feverCount", -900466144);
        setIntField(term71053, term71053.getClass(), "totalHiScore", 889123906);
        setIntField(term71053, term71053.getClass(), "totalEasyHighScore", 1453080745);
        setIntField(term71053, term71053.getClass(), "totalBasicHighScore", -1783104767);
        setIntField(term71053, term71053.getClass(), "totalAdvancedHighScore", -1902202151);
        setIntField(term71053, term71053.getClass(), "totalExpertHighScore", -75944389);
        setIntField(term71053, term71053.getClass(), "totalMasterHighScore", -185749338);
        setIntField(term71053, term71053.getClass(), "totalReMasterHighScore", -1515532416);
        setIntField(term71053, term71053.getClass(), "totalHighSync", -1466493850);
        setIntField(term71053, term71053.getClass(), "totalEasySync", 1520011387);
        setIntField(term71053, term71053.getClass(), "totalBasicSync", -1082705514);
        setIntField(term71053, term71053.getClass(), "totalAdvancedSync", 869620443);
        setIntField(term71053, term71053.getClass(), "totalExpertSync", 254180392);
        setIntField(term71053, term71053.getClass(), "totalMasterSync", 921499787);
        setIntField(term71053, term71053.getClass(), "totalReMasterSync", -480804345);
        setIntField(term71053, term71053.getClass(), "playerRating", 1073952970);
        setIntField(term71053, term71053.getClass(), "highestRating", -977380185);
        setIntField(term71053, term71053.getClass(), "rankAuthTailId", 987432422);
        setField(term71053, term71053.getClass(), "eventWatchedDate", "TnUXNtKOns");
        setField(term71053, term71053.getClass(), "webLimitDate", "umsYdaPflb");
        setIntField(term71053, term71053.getClass(), "challengeTrackPhase", 1827227369);
        setIntField(term71053, term71053.getClass(), "firstPlayBits", 1829845158);
        setField(term71053, term71053.getClass(), "lastPlayDate", "CnNmpSyiBE");
        setIntField(term71053, term71053.getClass(), "lastPlaceId", 1621951378);
        setField(term71053, term71053.getClass(), "lastPlaceName", "JvKKIGdUWh");
        setIntField(term71053, term71053.getClass(), "lastRegionId", 1549119911);
        setField(term71053, term71053.getClass(), "lastRegionName", "DInvDrzBtt");
        setField(term71053, term71053.getClass(), "lastClientId", "igZJubDPuK");
        setField(term71053, term71053.getClass(), "lastCountryCode", "qxBdFhLbAN");
        setIntField(term71053, term71053.getClass(), "eventPoint", -272319701);
        setIntField(term71053, term71053.getClass(), "totalLv", 681602619);
        setIntField(term71053, term71053.getClass(), "lastLoginBonusDay", 686439428);
        setIntField(term71053, term71053.getClass(), "lastSurvivalBonusDay", -2089572988);
        setIntField(term71053, term71053.getClass(), "loginBonusLv", -578503258);
        setField(term71051, term71051.getClass(), "user", term71053);
        setIntField(term71051, term71051.getClass(), "soudEffect", 833158114);
        setIntField(term71051, term71051.getClass(), "mirrorMode", -325758712);
        setIntField(term71051, term71051.getClass(), "guideSpeed", 1342823930);
        setIntField(term71051, term71051.getClass(), "bgInfo", -1223751366);
        setIntField(term71051, term71051.getClass(), "brightness", 145156559);
        setIntField(term71051, term71051.getClass(), "isStarRot", 1693594719);
        setIntField(term71051, term71051.getClass(), "breakSe", -1409727542);
        setIntField(term71051, term71051.getClass(), "slideSe", 510444342);
        setIntField(term71051, term71051.getClass(), "hardJudge", 351051431);
        setIntField(term71051, term71051.getClass(), "isTagJump", -1286877824);
        setIntField(term71051, term71051.getClass(), "breakSeVol", -1707611997);
        setIntField(term71051, term71051.getClass(), "slideSeVol", 1479740413);
        setIntField(term71051, term71051.getClass(), "isUpperDisp", 1061932374);
        setIntField(term71051, term71051.getClass(), "trackSkip", 402502879);
        setIntField(term71051, term71051.getClass(), "optionMode", 2128927520);
        setIntField(term71051, term71051.getClass(), "simpleOptionParam", -917408283);
        setIntField(term71051, term71051.getClass(), "adjustTiming", 1409215518);
        setIntField(term71051, term71051.getClass(), "dispTiming", -2109218958);
        setIntField(term71051, term71051.getClass(), "timingPos", 506512884);
        setIntField(term71051, term71051.getClass(), "ansVol", 1528202850);
        setIntField(term71051, term71051.getClass(), "noteVol", -372602638);
        setIntField(term71051, term71051.getClass(), "dmgVol", -2135753104);
        setIntField(term71051, term71051.getClass(), "appealFlame", 1708445283);
        setIntField(term71051, term71051.getClass(), "isFeverDisp", -1181178525);
        setIntField(term71051, term71051.getClass(), "dispJudge", -1544614140);
        setIntField(term71051, term71051.getClass(), "judgePos", 150247259);
        setIntField(term71051, term71051.getClass(), "ratingGuard", 309618163);
        setIntField(term71051, term71051.getClass(), "selectChara", 179576571);
        setIntField(term71051, term71051.getClass(), "sortType", 217633179);
        setIntField(term71051, term71051.getClass(), "filterGenre", 1605244993);
        setIntField(term71051, term71051.getClass(), "filterLevel", -1361181853);
        setIntField(term71051, term71051.getClass(), "filterRank", -608887996);
        setIntField(term71051, term71051.getClass(), "filterVersion", -1157271510);
        setIntField(term71051, term71051.getClass(), "filterRec", 2085776446);
        setIntField(term71051, term71051.getClass(), "filterFullCombo", -1041631524);
        setIntField(term71051, term71051.getClass(), "filterAllPerfect", -1815170945);
        setIntField(term71051, term71051.getClass(), "filterDifficulty", -135075938);
        setIntField(term71051, term71051.getClass(), "filterFullSync", -1070476220);
        setIntField(term71051, term71051.getClass(), "filterReMaster", 804638054);
        setIntField(term71051, term71051.getClass(), "filterMaxFever", 401503104);
        setIntField(term71051, term71051.getClass(), "finalSelectId", 1784538359);
        setIntField(term71051, term71051.getClass(), "finalSelectCategory", -513538018);
        term71269 = new Integer(-2115111012);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term71269;
        callMethod(klass, "setTimingPos", argTypes, term71051, args);
    }

};


