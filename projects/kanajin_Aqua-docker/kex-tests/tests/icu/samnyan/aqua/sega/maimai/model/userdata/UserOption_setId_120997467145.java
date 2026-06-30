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

public class UserOption_setId_120997467145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64589;
     Object term64807;

    public UserOption_setId_120997467145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term64595 = new Long(3230472384687362867L);
        term64589 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption"));
        Object term64591 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term64593 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term64609 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term64610 = newInstance(Class.forName("java.time.LocalDate"));
        Object term64614 = newInstance(Class.forName("java.time.LocalTime"));
        Object term64619 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term64620 = newInstance(Class.forName("java.time.LocalDate"));
        Object term64624 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term64589, term64589.getClass(), "id", 5614572229094721840L);
        setLongField(term64591, term64591.getClass(), "id", -159468133651974975L);
        setLongField(term64593, term64593.getClass(), "id", 9160882370265093763L);
        setField(term64593, term64593.getClass(), "extId", term64595);
        setField(term64593, term64593.getClass(), "luid", "XxZiwWPLOx");
        setIntField(term64610, term64610.getClass(), "year", 2026);
        setShortField(term64610, term64610.getClass(), "month", (short) 8);
        setShortField(term64610, term64610.getClass(), "day", (short) 6);
        setField(term64609, term64609.getClass(), "date", term64610);
        setByteField(term64614, term64614.getClass(), "hour", (byte) 17);
        setByteField(term64614, term64614.getClass(), "minute", (byte) 50);
        setByteField(term64614, term64614.getClass(), "second", (byte) 27);
        setIntField(term64614, term64614.getClass(), "nano", 8961627);
        setField(term64609, term64609.getClass(), "time", term64614);
        setField(term64593, term64593.getClass(), "registerTime", term64609);
        setIntField(term64620, term64620.getClass(), "year", 2018);
        setShortField(term64620, term64620.getClass(), "month", (short) 7);
        setShortField(term64620, term64620.getClass(), "day", (short) 30);
        setField(term64619, term64619.getClass(), "date", term64620);
        setByteField(term64624, term64624.getClass(), "hour", (byte) 22);
        setByteField(term64624, term64624.getClass(), "minute", (byte) 55);
        setByteField(term64624, term64624.getClass(), "second", (byte) 39);
        setIntField(term64624, term64624.getClass(), "nano", 564474532);
        setField(term64619, term64619.getClass(), "time", term64624);
        setField(term64593, term64593.getClass(), "accessTime", term64619);
        setField(term64591, term64591.getClass(), "card", term64593);
        setIntField(term64591, term64591.getClass(), "lastDataVersion", -1099676971);
        setField(term64591, term64591.getClass(), "userName", "nyqsjMHTba");
        setIntField(term64591, term64591.getClass(), "point", 826860572);
        setIntField(term64591, term64591.getClass(), "totalPoint", 1080879900);
        setIntField(term64591, term64591.getClass(), "iconId", -35783514);
        setIntField(term64591, term64591.getClass(), "nameplateId", -1751212981);
        setIntField(term64591, term64591.getClass(), "frameId", -573316300);
        setIntField(term64591, term64591.getClass(), "trophyId", 578872264);
        setIntField(term64591, term64591.getClass(), "playCount", -278464853);
        setIntField(term64591, term64591.getClass(), "playVsCount", 184087281);
        setIntField(term64591, term64591.getClass(), "playSyncCount", 467765373);
        setIntField(term64591, term64591.getClass(), "winCount", 1278171430);
        setIntField(term64591, term64591.getClass(), "helpCount", 513629950);
        setIntField(term64591, term64591.getClass(), "comboCount", 1877595756);
        setIntField(term64591, term64591.getClass(), "feverCount", 1018531116);
        setIntField(term64591, term64591.getClass(), "totalHiScore", -1243015891);
        setIntField(term64591, term64591.getClass(), "totalEasyHighScore", -691945518);
        setIntField(term64591, term64591.getClass(), "totalBasicHighScore", -322481955);
        setIntField(term64591, term64591.getClass(), "totalAdvancedHighScore", 1550329381);
        setIntField(term64591, term64591.getClass(), "totalExpertHighScore", -69658488);
        setIntField(term64591, term64591.getClass(), "totalMasterHighScore", -949474221);
        setIntField(term64591, term64591.getClass(), "totalReMasterHighScore", 954386331);
        setIntField(term64591, term64591.getClass(), "totalHighSync", -356095843);
        setIntField(term64591, term64591.getClass(), "totalEasySync", 1057672294);
        setIntField(term64591, term64591.getClass(), "totalBasicSync", -101715989);
        setIntField(term64591, term64591.getClass(), "totalAdvancedSync", 849720099);
        setIntField(term64591, term64591.getClass(), "totalExpertSync", -1883122431);
        setIntField(term64591, term64591.getClass(), "totalMasterSync", 1642134926);
        setIntField(term64591, term64591.getClass(), "totalReMasterSync", 1144024512);
        setIntField(term64591, term64591.getClass(), "playerRating", -1985125812);
        setIntField(term64591, term64591.getClass(), "highestRating", -1768739818);
        setIntField(term64591, term64591.getClass(), "rankAuthTailId", -1499925323);
        setField(term64591, term64591.getClass(), "eventWatchedDate", "ylUHzURWyg");
        setField(term64591, term64591.getClass(), "webLimitDate", "VuAuFBlHxQ");
        setIntField(term64591, term64591.getClass(), "challengeTrackPhase", -745147263);
        setIntField(term64591, term64591.getClass(), "firstPlayBits", 285424830);
        setField(term64591, term64591.getClass(), "lastPlayDate", "nOLtCslMMH");
        setIntField(term64591, term64591.getClass(), "lastPlaceId", 1448276576);
        setField(term64591, term64591.getClass(), "lastPlaceName", "dIQWOeKQVj");
        setIntField(term64591, term64591.getClass(), "lastRegionId", 376848403);
        setField(term64591, term64591.getClass(), "lastRegionName", "tHiDGaNXAL");
        setField(term64591, term64591.getClass(), "lastClientId", "VsizBWhPWL");
        setField(term64591, term64591.getClass(), "lastCountryCode", "jAFSxnVMcD");
        setIntField(term64591, term64591.getClass(), "eventPoint", -1638823326);
        setIntField(term64591, term64591.getClass(), "totalLv", 1836202148);
        setIntField(term64591, term64591.getClass(), "lastLoginBonusDay", -838056504);
        setIntField(term64591, term64591.getClass(), "lastSurvivalBonusDay", 216597043);
        setIntField(term64591, term64591.getClass(), "loginBonusLv", -1863649948);
        setField(term64589, term64589.getClass(), "user", term64591);
        setIntField(term64589, term64589.getClass(), "soudEffect", 1188132768);
        setIntField(term64589, term64589.getClass(), "mirrorMode", -210441864);
        setIntField(term64589, term64589.getClass(), "guideSpeed", -993404406);
        setIntField(term64589, term64589.getClass(), "bgInfo", -843807783);
        setIntField(term64589, term64589.getClass(), "brightness", -1540931841);
        setIntField(term64589, term64589.getClass(), "isStarRot", 1086303241);
        setIntField(term64589, term64589.getClass(), "breakSe", 602126411);
        setIntField(term64589, term64589.getClass(), "slideSe", -1382786777);
        setIntField(term64589, term64589.getClass(), "hardJudge", -653869267);
        setIntField(term64589, term64589.getClass(), "isTagJump", 2108460000);
        setIntField(term64589, term64589.getClass(), "breakSeVol", 464860665);
        setIntField(term64589, term64589.getClass(), "slideSeVol", -829472053);
        setIntField(term64589, term64589.getClass(), "isUpperDisp", 1237212779);
        setIntField(term64589, term64589.getClass(), "trackSkip", -733200940);
        setIntField(term64589, term64589.getClass(), "optionMode", -2099756995);
        setIntField(term64589, term64589.getClass(), "simpleOptionParam", 146626977);
        setIntField(term64589, term64589.getClass(), "adjustTiming", 588479166);
        setIntField(term64589, term64589.getClass(), "dispTiming", 555940372);
        setIntField(term64589, term64589.getClass(), "timingPos", 303574393);
        setIntField(term64589, term64589.getClass(), "ansVol", -837749919);
        setIntField(term64589, term64589.getClass(), "noteVol", -56371414);
        setIntField(term64589, term64589.getClass(), "dmgVol", 1655747400);
        setIntField(term64589, term64589.getClass(), "appealFlame", 1345032092);
        setIntField(term64589, term64589.getClass(), "isFeverDisp", 953985132);
        setIntField(term64589, term64589.getClass(), "dispJudge", -1177278432);
        setIntField(term64589, term64589.getClass(), "judgePos", -467461131);
        setIntField(term64589, term64589.getClass(), "ratingGuard", 1619548087);
        setIntField(term64589, term64589.getClass(), "selectChara", -661818935);
        setIntField(term64589, term64589.getClass(), "sortType", 263615284);
        setIntField(term64589, term64589.getClass(), "filterGenre", -1940382171);
        setIntField(term64589, term64589.getClass(), "filterLevel", 1646141136);
        setIntField(term64589, term64589.getClass(), "filterRank", 1608131433);
        setIntField(term64589, term64589.getClass(), "filterVersion", 97138194);
        setIntField(term64589, term64589.getClass(), "filterRec", -744642234);
        setIntField(term64589, term64589.getClass(), "filterFullCombo", -349460490);
        setIntField(term64589, term64589.getClass(), "filterAllPerfect", 1945749170);
        setIntField(term64589, term64589.getClass(), "filterDifficulty", -282883918);
        setIntField(term64589, term64589.getClass(), "filterFullSync", -1576666542);
        setIntField(term64589, term64589.getClass(), "filterReMaster", 622981013);
        setIntField(term64589, term64589.getClass(), "filterMaxFever", -2054776518);
        setIntField(term64589, term64589.getClass(), "finalSelectId", -2002407733);
        setIntField(term64589, term64589.getClass(), "finalSelectCategory", 2079703600);
        term64807 = new Long(6848008460134431064L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term64807;
        callMethod(klass, "setId", argTypes, term64589, args);
    }

};


