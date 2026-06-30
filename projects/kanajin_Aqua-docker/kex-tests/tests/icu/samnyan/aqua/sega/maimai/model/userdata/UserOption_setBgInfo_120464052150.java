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

public class UserOption_setBgInfo_120464052150 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66401;
     Object term66619;

    public UserOption_setBgInfo_120464052150() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term66407 = new Long(-1820639665251914495L);
        term66401 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption"));
        Object term66403 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term66405 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term66421 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term66422 = newInstance(Class.forName("java.time.LocalDate"));
        Object term66426 = newInstance(Class.forName("java.time.LocalTime"));
        Object term66431 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term66432 = newInstance(Class.forName("java.time.LocalDate"));
        Object term66436 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term66401, term66401.getClass(), "id", -2413135395771470086L);
        setLongField(term66403, term66403.getClass(), "id", -823085399570394644L);
        setLongField(term66405, term66405.getClass(), "id", -894705411488729365L);
        setField(term66405, term66405.getClass(), "extId", term66407);
        setField(term66405, term66405.getClass(), "luid", "nkmiePLZgp");
        setIntField(term66422, term66422.getClass(), "year", 2024);
        setShortField(term66422, term66422.getClass(), "month", (short) 3);
        setShortField(term66422, term66422.getClass(), "day", (short) 30);
        setField(term66421, term66421.getClass(), "date", term66422);
        setByteField(term66426, term66426.getClass(), "hour", (byte) 7);
        setByteField(term66426, term66426.getClass(), "minute", (byte) 18);
        setByteField(term66426, term66426.getClass(), "second", (byte) 30);
        setIntField(term66426, term66426.getClass(), "nano", 930626265);
        setField(term66421, term66421.getClass(), "time", term66426);
        setField(term66405, term66405.getClass(), "registerTime", term66421);
        setIntField(term66432, term66432.getClass(), "year", 2017);
        setShortField(term66432, term66432.getClass(), "month", (short) 10);
        setShortField(term66432, term66432.getClass(), "day", (short) 18);
        setField(term66431, term66431.getClass(), "date", term66432);
        setByteField(term66436, term66436.getClass(), "hour", (byte) 20);
        setByteField(term66436, term66436.getClass(), "minute", (byte) 35);
        setByteField(term66436, term66436.getClass(), "second", (byte) 5);
        setIntField(term66436, term66436.getClass(), "nano", 697625538);
        setField(term66431, term66431.getClass(), "time", term66436);
        setField(term66405, term66405.getClass(), "accessTime", term66431);
        setField(term66403, term66403.getClass(), "card", term66405);
        setIntField(term66403, term66403.getClass(), "lastDataVersion", 1538680141);
        setField(term66403, term66403.getClass(), "userName", "VoCvDpwwFr");
        setIntField(term66403, term66403.getClass(), "point", -506059418);
        setIntField(term66403, term66403.getClass(), "totalPoint", -1577159884);
        setIntField(term66403, term66403.getClass(), "iconId", -863958105);
        setIntField(term66403, term66403.getClass(), "nameplateId", 622092405);
        setIntField(term66403, term66403.getClass(), "frameId", -1454644959);
        setIntField(term66403, term66403.getClass(), "trophyId", 101535830);
        setIntField(term66403, term66403.getClass(), "playCount", 1139143083);
        setIntField(term66403, term66403.getClass(), "playVsCount", 1041163234);
        setIntField(term66403, term66403.getClass(), "playSyncCount", 698385520);
        setIntField(term66403, term66403.getClass(), "winCount", 849449580);
        setIntField(term66403, term66403.getClass(), "helpCount", 223713903);
        setIntField(term66403, term66403.getClass(), "comboCount", 1671953554);
        setIntField(term66403, term66403.getClass(), "feverCount", 478755818);
        setIntField(term66403, term66403.getClass(), "totalHiScore", -1272313823);
        setIntField(term66403, term66403.getClass(), "totalEasyHighScore", -872110316);
        setIntField(term66403, term66403.getClass(), "totalBasicHighScore", -1523155561);
        setIntField(term66403, term66403.getClass(), "totalAdvancedHighScore", 538636137);
        setIntField(term66403, term66403.getClass(), "totalExpertHighScore", 1198486550);
        setIntField(term66403, term66403.getClass(), "totalMasterHighScore", 1991523491);
        setIntField(term66403, term66403.getClass(), "totalReMasterHighScore", 1175856889);
        setIntField(term66403, term66403.getClass(), "totalHighSync", -1544836830);
        setIntField(term66403, term66403.getClass(), "totalEasySync", 836331634);
        setIntField(term66403, term66403.getClass(), "totalBasicSync", -1611918528);
        setIntField(term66403, term66403.getClass(), "totalAdvancedSync", -1007102246);
        setIntField(term66403, term66403.getClass(), "totalExpertSync", 284875252);
        setIntField(term66403, term66403.getClass(), "totalMasterSync", -1037642084);
        setIntField(term66403, term66403.getClass(), "totalReMasterSync", -1771453281);
        setIntField(term66403, term66403.getClass(), "playerRating", -1850267429);
        setIntField(term66403, term66403.getClass(), "highestRating", 1810435844);
        setIntField(term66403, term66403.getClass(), "rankAuthTailId", 733566791);
        setField(term66403, term66403.getClass(), "eventWatchedDate", "zYOmoQqDOd");
        setField(term66403, term66403.getClass(), "webLimitDate", "kmgEVEqTGa");
        setIntField(term66403, term66403.getClass(), "challengeTrackPhase", 1116868023);
        setIntField(term66403, term66403.getClass(), "firstPlayBits", -880728130);
        setField(term66403, term66403.getClass(), "lastPlayDate", "qakIqInzyM");
        setIntField(term66403, term66403.getClass(), "lastPlaceId", -931337079);
        setField(term66403, term66403.getClass(), "lastPlaceName", "EOsBgwlmva");
        setIntField(term66403, term66403.getClass(), "lastRegionId", 1123970734);
        setField(term66403, term66403.getClass(), "lastRegionName", "qcSJruZuJy");
        setField(term66403, term66403.getClass(), "lastClientId", "NOSJtfgqAs");
        setField(term66403, term66403.getClass(), "lastCountryCode", "SUDRrjpChc");
        setIntField(term66403, term66403.getClass(), "eventPoint", -649594954);
        setIntField(term66403, term66403.getClass(), "totalLv", 70645068);
        setIntField(term66403, term66403.getClass(), "lastLoginBonusDay", -151223836);
        setIntField(term66403, term66403.getClass(), "lastSurvivalBonusDay", 1752322336);
        setIntField(term66403, term66403.getClass(), "loginBonusLv", 173612084);
        setField(term66401, term66401.getClass(), "user", term66403);
        setIntField(term66401, term66401.getClass(), "soudEffect", 1186172025);
        setIntField(term66401, term66401.getClass(), "mirrorMode", -323007757);
        setIntField(term66401, term66401.getClass(), "guideSpeed", 1298918335);
        setIntField(term66401, term66401.getClass(), "bgInfo", 669874346);
        setIntField(term66401, term66401.getClass(), "brightness", -547487291);
        setIntField(term66401, term66401.getClass(), "isStarRot", 718172838);
        setIntField(term66401, term66401.getClass(), "breakSe", 1520055684);
        setIntField(term66401, term66401.getClass(), "slideSe", -2007202523);
        setIntField(term66401, term66401.getClass(), "hardJudge", 2083513828);
        setIntField(term66401, term66401.getClass(), "isTagJump", 1152264913);
        setIntField(term66401, term66401.getClass(), "breakSeVol", -938013563);
        setIntField(term66401, term66401.getClass(), "slideSeVol", -1414495690);
        setIntField(term66401, term66401.getClass(), "isUpperDisp", -1835290975);
        setIntField(term66401, term66401.getClass(), "trackSkip", 801385795);
        setIntField(term66401, term66401.getClass(), "optionMode", -629922950);
        setIntField(term66401, term66401.getClass(), "simpleOptionParam", 1161572908);
        setIntField(term66401, term66401.getClass(), "adjustTiming", -861910530);
        setIntField(term66401, term66401.getClass(), "dispTiming", 243055128);
        setIntField(term66401, term66401.getClass(), "timingPos", -345324675);
        setIntField(term66401, term66401.getClass(), "ansVol", 1865838980);
        setIntField(term66401, term66401.getClass(), "noteVol", -269402208);
        setIntField(term66401, term66401.getClass(), "dmgVol", 714123083);
        setIntField(term66401, term66401.getClass(), "appealFlame", -1608554992);
        setIntField(term66401, term66401.getClass(), "isFeverDisp", -174955872);
        setIntField(term66401, term66401.getClass(), "dispJudge", 1429537897);
        setIntField(term66401, term66401.getClass(), "judgePos", 216290703);
        setIntField(term66401, term66401.getClass(), "ratingGuard", -294229148);
        setIntField(term66401, term66401.getClass(), "selectChara", -1249763145);
        setIntField(term66401, term66401.getClass(), "sortType", -1872599962);
        setIntField(term66401, term66401.getClass(), "filterGenre", 1889574494);
        setIntField(term66401, term66401.getClass(), "filterLevel", -687378216);
        setIntField(term66401, term66401.getClass(), "filterRank", -1552077299);
        setIntField(term66401, term66401.getClass(), "filterVersion", 2020615916);
        setIntField(term66401, term66401.getClass(), "filterRec", -542896303);
        setIntField(term66401, term66401.getClass(), "filterFullCombo", 1175522239);
        setIntField(term66401, term66401.getClass(), "filterAllPerfect", -1316810397);
        setIntField(term66401, term66401.getClass(), "filterDifficulty", -904376067);
        setIntField(term66401, term66401.getClass(), "filterFullSync", 1501300402);
        setIntField(term66401, term66401.getClass(), "filterReMaster", -1415123866);
        setIntField(term66401, term66401.getClass(), "filterMaxFever", -840575313);
        setIntField(term66401, term66401.getClass(), "finalSelectId", 1369614831);
        setIntField(term66401, term66401.getClass(), "finalSelectCategory", -1862630065);
        term66619 = new Integer(376483156);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term66619;
        callMethod(klass, "setBgInfo", argTypes, term66401, args);
    }

};


