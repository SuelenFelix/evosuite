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

public class UserOption_getFinalSelectId_49774103543 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63973;

    public UserOption_getFinalSelectId_49774103543() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term63979 = new Long(2191130532479601175L);
        term63973 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption"));
        Object term63975 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term63977 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term63993 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term63994 = newInstance(Class.forName("java.time.LocalDate"));
        Object term63998 = newInstance(Class.forName("java.time.LocalTime"));
        Object term64003 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term64004 = newInstance(Class.forName("java.time.LocalDate"));
        Object term64008 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term63973, term63973.getClass(), "id", 4626639872957534248L);
        setLongField(term63975, term63975.getClass(), "id", -7062466217011408314L);
        setLongField(term63977, term63977.getClass(), "id", -5455716707538294699L);
        setField(term63977, term63977.getClass(), "extId", term63979);
        setField(term63977, term63977.getClass(), "luid", "iQCLduwSPi");
        setIntField(term63994, term63994.getClass(), "year", 2016);
        setShortField(term63994, term63994.getClass(), "month", (short) 12);
        setShortField(term63994, term63994.getClass(), "day", (short) 3);
        setField(term63993, term63993.getClass(), "date", term63994);
        setByteField(term63998, term63998.getClass(), "hour", (byte) 8);
        setByteField(term63998, term63998.getClass(), "minute", (byte) 59);
        setByteField(term63998, term63998.getClass(), "second", (byte) 39);
        setIntField(term63998, term63998.getClass(), "nano", 208911877);
        setField(term63993, term63993.getClass(), "time", term63998);
        setField(term63977, term63977.getClass(), "registerTime", term63993);
        setIntField(term64004, term64004.getClass(), "year", 2023);
        setShortField(term64004, term64004.getClass(), "month", (short) 6);
        setShortField(term64004, term64004.getClass(), "day", (short) 5);
        setField(term64003, term64003.getClass(), "date", term64004);
        setByteField(term64008, term64008.getClass(), "hour", (byte) 22);
        setByteField(term64008, term64008.getClass(), "minute", (byte) 22);
        setByteField(term64008, term64008.getClass(), "second", (byte) 4);
        setIntField(term64008, term64008.getClass(), "nano", 656087896);
        setField(term64003, term64003.getClass(), "time", term64008);
        setField(term63977, term63977.getClass(), "accessTime", term64003);
        setField(term63975, term63975.getClass(), "card", term63977);
        setIntField(term63975, term63975.getClass(), "lastDataVersion", -118801642);
        setField(term63975, term63975.getClass(), "userName", "ZcODLNhxqg");
        setIntField(term63975, term63975.getClass(), "point", -1584878256);
        setIntField(term63975, term63975.getClass(), "totalPoint", -1322460687);
        setIntField(term63975, term63975.getClass(), "iconId", -1227589816);
        setIntField(term63975, term63975.getClass(), "nameplateId", -2138540955);
        setIntField(term63975, term63975.getClass(), "frameId", 1205424873);
        setIntField(term63975, term63975.getClass(), "trophyId", -1362218312);
        setIntField(term63975, term63975.getClass(), "playCount", -931123286);
        setIntField(term63975, term63975.getClass(), "playVsCount", -225670855);
        setIntField(term63975, term63975.getClass(), "playSyncCount", 1809930249);
        setIntField(term63975, term63975.getClass(), "winCount", 742585707);
        setIntField(term63975, term63975.getClass(), "helpCount", -665502806);
        setIntField(term63975, term63975.getClass(), "comboCount", 1816216567);
        setIntField(term63975, term63975.getClass(), "feverCount", -1787268270);
        setIntField(term63975, term63975.getClass(), "totalHiScore", 612540772);
        setIntField(term63975, term63975.getClass(), "totalEasyHighScore", 664095791);
        setIntField(term63975, term63975.getClass(), "totalBasicHighScore", 1805310704);
        setIntField(term63975, term63975.getClass(), "totalAdvancedHighScore", 1348119055);
        setIntField(term63975, term63975.getClass(), "totalExpertHighScore", -1042667016);
        setIntField(term63975, term63975.getClass(), "totalMasterHighScore", -1341064078);
        setIntField(term63975, term63975.getClass(), "totalReMasterHighScore", -1088816172);
        setIntField(term63975, term63975.getClass(), "totalHighSync", -1935578983);
        setIntField(term63975, term63975.getClass(), "totalEasySync", 1905602832);
        setIntField(term63975, term63975.getClass(), "totalBasicSync", -431572220);
        setIntField(term63975, term63975.getClass(), "totalAdvancedSync", 972986984);
        setIntField(term63975, term63975.getClass(), "totalExpertSync", -1542767364);
        setIntField(term63975, term63975.getClass(), "totalMasterSync", -597174536);
        setIntField(term63975, term63975.getClass(), "totalReMasterSync", -23544043);
        setIntField(term63975, term63975.getClass(), "playerRating", -1186171274);
        setIntField(term63975, term63975.getClass(), "highestRating", -1573775399);
        setIntField(term63975, term63975.getClass(), "rankAuthTailId", -301649033);
        setField(term63975, term63975.getClass(), "eventWatchedDate", "iNtHOROBMq");
        setField(term63975, term63975.getClass(), "webLimitDate", "GbvfbbsrOl");
        setIntField(term63975, term63975.getClass(), "challengeTrackPhase", 1335266802);
        setIntField(term63975, term63975.getClass(), "firstPlayBits", -1732408059);
        setField(term63975, term63975.getClass(), "lastPlayDate", "IIZlqzOmtY");
        setIntField(term63975, term63975.getClass(), "lastPlaceId", 1433024397);
        setField(term63975, term63975.getClass(), "lastPlaceName", "iRFRSxtnkr");
        setIntField(term63975, term63975.getClass(), "lastRegionId", 1216072735);
        setField(term63975, term63975.getClass(), "lastRegionName", "iGWkLjLGBY");
        setField(term63975, term63975.getClass(), "lastClientId", "jUkXaNkoAg");
        setField(term63975, term63975.getClass(), "lastCountryCode", "mZsPsRzyhQ");
        setIntField(term63975, term63975.getClass(), "eventPoint", 1880806607);
        setIntField(term63975, term63975.getClass(), "totalLv", 265152714);
        setIntField(term63975, term63975.getClass(), "lastLoginBonusDay", 1291985298);
        setIntField(term63975, term63975.getClass(), "lastSurvivalBonusDay", -1615684635);
        setIntField(term63975, term63975.getClass(), "loginBonusLv", -725181754);
        setField(term63973, term63973.getClass(), "user", term63975);
        setIntField(term63973, term63973.getClass(), "soudEffect", -2117106210);
        setIntField(term63973, term63973.getClass(), "mirrorMode", -767668699);
        setIntField(term63973, term63973.getClass(), "guideSpeed", 1274445811);
        setIntField(term63973, term63973.getClass(), "bgInfo", 1903103775);
        setIntField(term63973, term63973.getClass(), "brightness", -5489488);
        setIntField(term63973, term63973.getClass(), "isStarRot", -1846449623);
        setIntField(term63973, term63973.getClass(), "breakSe", -1053745732);
        setIntField(term63973, term63973.getClass(), "slideSe", 1084454865);
        setIntField(term63973, term63973.getClass(), "hardJudge", -1444485060);
        setIntField(term63973, term63973.getClass(), "isTagJump", -1355001013);
        setIntField(term63973, term63973.getClass(), "breakSeVol", -1335912879);
        setIntField(term63973, term63973.getClass(), "slideSeVol", 1371866185);
        setIntField(term63973, term63973.getClass(), "isUpperDisp", 1556888444);
        setIntField(term63973, term63973.getClass(), "trackSkip", 1393504869);
        setIntField(term63973, term63973.getClass(), "optionMode", 728799986);
        setIntField(term63973, term63973.getClass(), "simpleOptionParam", -444430231);
        setIntField(term63973, term63973.getClass(), "adjustTiming", -623445473);
        setIntField(term63973, term63973.getClass(), "dispTiming", 565663783);
        setIntField(term63973, term63973.getClass(), "timingPos", -971589912);
        setIntField(term63973, term63973.getClass(), "ansVol", 1025926099);
        setIntField(term63973, term63973.getClass(), "noteVol", 961710200);
        setIntField(term63973, term63973.getClass(), "dmgVol", -698630156);
        setIntField(term63973, term63973.getClass(), "appealFlame", 160752273);
        setIntField(term63973, term63973.getClass(), "isFeverDisp", -1555752602);
        setIntField(term63973, term63973.getClass(), "dispJudge", -1803417927);
        setIntField(term63973, term63973.getClass(), "judgePos", 1174691081);
        setIntField(term63973, term63973.getClass(), "ratingGuard", -1554467908);
        setIntField(term63973, term63973.getClass(), "selectChara", 809458440);
        setIntField(term63973, term63973.getClass(), "sortType", 1648454496);
        setIntField(term63973, term63973.getClass(), "filterGenre", 1189516772);
        setIntField(term63973, term63973.getClass(), "filterLevel", 261537591);
        setIntField(term63973, term63973.getClass(), "filterRank", 988974502);
        setIntField(term63973, term63973.getClass(), "filterVersion", 796479728);
        setIntField(term63973, term63973.getClass(), "filterRec", 527667682);
        setIntField(term63973, term63973.getClass(), "filterFullCombo", -2024603739);
        setIntField(term63973, term63973.getClass(), "filterAllPerfect", -501282440);
        setIntField(term63973, term63973.getClass(), "filterDifficulty", 890596068);
        setIntField(term63973, term63973.getClass(), "filterFullSync", -917816022);
        setIntField(term63973, term63973.getClass(), "filterReMaster", 629691796);
        setIntField(term63973, term63973.getClass(), "filterMaxFever", -977560951);
        setIntField(term63973, term63973.getClass(), "finalSelectId", 934860256);
        setIntField(term63973, term63973.getClass(), "finalSelectCategory", 956376778);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFinalSelectId", argTypes, term63973, args);
    }

};


