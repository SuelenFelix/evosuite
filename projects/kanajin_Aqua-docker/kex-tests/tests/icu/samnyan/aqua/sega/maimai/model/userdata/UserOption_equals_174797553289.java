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

public class UserOption_equals_174797553289 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78491;
     Object term78709;

    public UserOption_equals_174797553289() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term78497 = new Long(-2986201902216133814L);
        term78491 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption"));
        Object term78493 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term78495 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term78511 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term78512 = newInstance(Class.forName("java.time.LocalDate"));
        Object term78516 = newInstance(Class.forName("java.time.LocalTime"));
        Object term78521 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term78522 = newInstance(Class.forName("java.time.LocalDate"));
        Object term78526 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term78491, term78491.getClass(), "id", 8940743873279878610L);
        setLongField(term78493, term78493.getClass(), "id", -1865007698397606253L);
        setLongField(term78495, term78495.getClass(), "id", 2355652609935652353L);
        setField(term78495, term78495.getClass(), "extId", term78497);
        setField(term78495, term78495.getClass(), "luid", "baFwYJAfPz");
        setIntField(term78512, term78512.getClass(), "year", 2027);
        setShortField(term78512, term78512.getClass(), "month", (short) 11);
        setShortField(term78512, term78512.getClass(), "day", (short) 17);
        setField(term78511, term78511.getClass(), "date", term78512);
        setByteField(term78516, term78516.getClass(), "hour", (byte) 8);
        setByteField(term78516, term78516.getClass(), "minute", (byte) 27);
        setByteField(term78516, term78516.getClass(), "second", (byte) 41);
        setIntField(term78516, term78516.getClass(), "nano", 737345800);
        setField(term78511, term78511.getClass(), "time", term78516);
        setField(term78495, term78495.getClass(), "registerTime", term78511);
        setIntField(term78522, term78522.getClass(), "year", 2028);
        setShortField(term78522, term78522.getClass(), "month", (short) 9);
        setShortField(term78522, term78522.getClass(), "day", (short) 4);
        setField(term78521, term78521.getClass(), "date", term78522);
        setByteField(term78526, term78526.getClass(), "hour", (byte) 2);
        setByteField(term78526, term78526.getClass(), "minute", (byte) 4);
        setByteField(term78526, term78526.getClass(), "second", (byte) 33);
        setIntField(term78526, term78526.getClass(), "nano", 927519741);
        setField(term78521, term78521.getClass(), "time", term78526);
        setField(term78495, term78495.getClass(), "accessTime", term78521);
        setField(term78493, term78493.getClass(), "card", term78495);
        setIntField(term78493, term78493.getClass(), "lastDataVersion", -2118855483);
        setField(term78493, term78493.getClass(), "userName", "PxBSOwkatN");
        setIntField(term78493, term78493.getClass(), "point", 956610045);
        setIntField(term78493, term78493.getClass(), "totalPoint", -1942169307);
        setIntField(term78493, term78493.getClass(), "iconId", 617724553);
        setIntField(term78493, term78493.getClass(), "nameplateId", -1338530967);
        setIntField(term78493, term78493.getClass(), "frameId", 595533783);
        setIntField(term78493, term78493.getClass(), "trophyId", 246042148);
        setIntField(term78493, term78493.getClass(), "playCount", -1721990512);
        setIntField(term78493, term78493.getClass(), "playVsCount", 1019098195);
        setIntField(term78493, term78493.getClass(), "playSyncCount", 2106958856);
        setIntField(term78493, term78493.getClass(), "winCount", -2063685170);
        setIntField(term78493, term78493.getClass(), "helpCount", -1311140530);
        setIntField(term78493, term78493.getClass(), "comboCount", 1303003392);
        setIntField(term78493, term78493.getClass(), "feverCount", -831139026);
        setIntField(term78493, term78493.getClass(), "totalHiScore", 1382899869);
        setIntField(term78493, term78493.getClass(), "totalEasyHighScore", -1429671338);
        setIntField(term78493, term78493.getClass(), "totalBasicHighScore", 927915366);
        setIntField(term78493, term78493.getClass(), "totalAdvancedHighScore", -777997560);
        setIntField(term78493, term78493.getClass(), "totalExpertHighScore", 1311293255);
        setIntField(term78493, term78493.getClass(), "totalMasterHighScore", 311485940);
        setIntField(term78493, term78493.getClass(), "totalReMasterHighScore", -1792008630);
        setIntField(term78493, term78493.getClass(), "totalHighSync", -1813772232);
        setIntField(term78493, term78493.getClass(), "totalEasySync", 175926067);
        setIntField(term78493, term78493.getClass(), "totalBasicSync", -501288301);
        setIntField(term78493, term78493.getClass(), "totalAdvancedSync", 946229454);
        setIntField(term78493, term78493.getClass(), "totalExpertSync", -1409812406);
        setIntField(term78493, term78493.getClass(), "totalMasterSync", 1663759912);
        setIntField(term78493, term78493.getClass(), "totalReMasterSync", 1868786781);
        setIntField(term78493, term78493.getClass(), "playerRating", 658806605);
        setIntField(term78493, term78493.getClass(), "highestRating", 818300916);
        setIntField(term78493, term78493.getClass(), "rankAuthTailId", -1167820473);
        setField(term78493, term78493.getClass(), "eventWatchedDate", "uKjlgaHcoc");
        setField(term78493, term78493.getClass(), "webLimitDate", "ITJMSWaPGZ");
        setIntField(term78493, term78493.getClass(), "challengeTrackPhase", 1652075304);
        setIntField(term78493, term78493.getClass(), "firstPlayBits", -334758037);
        setField(term78493, term78493.getClass(), "lastPlayDate", "ivvEvcUacU");
        setIntField(term78493, term78493.getClass(), "lastPlaceId", -739198561);
        setField(term78493, term78493.getClass(), "lastPlaceName", "gbSukHPGfP");
        setIntField(term78493, term78493.getClass(), "lastRegionId", -1768461509);
        setField(term78493, term78493.getClass(), "lastRegionName", "jEDnJjwhoo");
        setField(term78493, term78493.getClass(), "lastClientId", "TkTHRRicKc");
        setField(term78493, term78493.getClass(), "lastCountryCode", "xwBoTnuoQg");
        setIntField(term78493, term78493.getClass(), "eventPoint", 401667728);
        setIntField(term78493, term78493.getClass(), "totalLv", 1534158183);
        setIntField(term78493, term78493.getClass(), "lastLoginBonusDay", 478171174);
        setIntField(term78493, term78493.getClass(), "lastSurvivalBonusDay", -1715722834);
        setIntField(term78493, term78493.getClass(), "loginBonusLv", 1691652192);
        setField(term78491, term78491.getClass(), "user", term78493);
        setIntField(term78491, term78491.getClass(), "soudEffect", -1857177422);
        setIntField(term78491, term78491.getClass(), "mirrorMode", -335578660);
        setIntField(term78491, term78491.getClass(), "guideSpeed", -808530434);
        setIntField(term78491, term78491.getClass(), "bgInfo", 629899573);
        setIntField(term78491, term78491.getClass(), "brightness", -1221233211);
        setIntField(term78491, term78491.getClass(), "isStarRot", 1272801235);
        setIntField(term78491, term78491.getClass(), "breakSe", -852323024);
        setIntField(term78491, term78491.getClass(), "slideSe", -427488411);
        setIntField(term78491, term78491.getClass(), "hardJudge", -416454353);
        setIntField(term78491, term78491.getClass(), "isTagJump", -1978067621);
        setIntField(term78491, term78491.getClass(), "breakSeVol", -235633884);
        setIntField(term78491, term78491.getClass(), "slideSeVol", -165091300);
        setIntField(term78491, term78491.getClass(), "isUpperDisp", 562040813);
        setIntField(term78491, term78491.getClass(), "trackSkip", 1058456521);
        setIntField(term78491, term78491.getClass(), "optionMode", -1013759734);
        setIntField(term78491, term78491.getClass(), "simpleOptionParam", 1505538760);
        setIntField(term78491, term78491.getClass(), "adjustTiming", 1763191037);
        setIntField(term78491, term78491.getClass(), "dispTiming", 1265299065);
        setIntField(term78491, term78491.getClass(), "timingPos", -1084975340);
        setIntField(term78491, term78491.getClass(), "ansVol", 615130806);
        setIntField(term78491, term78491.getClass(), "noteVol", 318393397);
        setIntField(term78491, term78491.getClass(), "dmgVol", -812516587);
        setIntField(term78491, term78491.getClass(), "appealFlame", 1384681837);
        setIntField(term78491, term78491.getClass(), "isFeverDisp", 691606269);
        setIntField(term78491, term78491.getClass(), "dispJudge", -1530881456);
        setIntField(term78491, term78491.getClass(), "judgePos", -1321457130);
        setIntField(term78491, term78491.getClass(), "ratingGuard", 128286825);
        setIntField(term78491, term78491.getClass(), "selectChara", -1650841446);
        setIntField(term78491, term78491.getClass(), "sortType", 278452809);
        setIntField(term78491, term78491.getClass(), "filterGenre", 1447660426);
        setIntField(term78491, term78491.getClass(), "filterLevel", 505890812);
        setIntField(term78491, term78491.getClass(), "filterRank", 1045300956);
        setIntField(term78491, term78491.getClass(), "filterVersion", 343316459);
        setIntField(term78491, term78491.getClass(), "filterRec", -1123419112);
        setIntField(term78491, term78491.getClass(), "filterFullCombo", 315601520);
        setIntField(term78491, term78491.getClass(), "filterAllPerfect", 1908812290);
        setIntField(term78491, term78491.getClass(), "filterDifficulty", 858789801);
        setIntField(term78491, term78491.getClass(), "filterFullSync", 806448705);
        setIntField(term78491, term78491.getClass(), "filterReMaster", 1837939282);
        setIntField(term78491, term78491.getClass(), "filterMaxFever", -1630298078);
        setIntField(term78491, term78491.getClass(), "finalSelectId", 1918251946);
        setIntField(term78491, term78491.getClass(), "finalSelectCategory", 842073064);
        term78709 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term78709;
        callMethod(klass, "equals", argTypes, term78491, args);
    }

};


