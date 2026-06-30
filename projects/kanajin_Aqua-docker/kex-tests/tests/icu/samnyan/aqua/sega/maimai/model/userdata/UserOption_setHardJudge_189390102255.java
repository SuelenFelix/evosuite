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

public class UserOption_setHardJudge_189390102255 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67951;
     Object term68169;

    public UserOption_setHardJudge_189390102255() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term67957 = new Long(394960377236392159L);
        term67951 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption"));
        Object term67953 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term67955 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term67971 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term67972 = newInstance(Class.forName("java.time.LocalDate"));
        Object term67976 = newInstance(Class.forName("java.time.LocalTime"));
        Object term67981 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term67982 = newInstance(Class.forName("java.time.LocalDate"));
        Object term67986 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term67951, term67951.getClass(), "id", 8699742215739444902L);
        setLongField(term67953, term67953.getClass(), "id", 8261619652909874476L);
        setLongField(term67955, term67955.getClass(), "id", -3692936312179064102L);
        setField(term67955, term67955.getClass(), "extId", term67957);
        setField(term67955, term67955.getClass(), "luid", "TvmWaJWmLY");
        setIntField(term67972, term67972.getClass(), "year", 2012);
        setShortField(term67972, term67972.getClass(), "month", (short) 4);
        setShortField(term67972, term67972.getClass(), "day", (short) 21);
        setField(term67971, term67971.getClass(), "date", term67972);
        setByteField(term67976, term67976.getClass(), "hour", (byte) 8);
        setByteField(term67976, term67976.getClass(), "minute", (byte) 7);
        setByteField(term67976, term67976.getClass(), "second", (byte) 21);
        setIntField(term67976, term67976.getClass(), "nano", 641327534);
        setField(term67971, term67971.getClass(), "time", term67976);
        setField(term67955, term67955.getClass(), "registerTime", term67971);
        setIntField(term67982, term67982.getClass(), "year", 2028);
        setShortField(term67982, term67982.getClass(), "month", (short) 6);
        setShortField(term67982, term67982.getClass(), "day", (short) 11);
        setField(term67981, term67981.getClass(), "date", term67982);
        setByteField(term67986, term67986.getClass(), "hour", (byte) 15);
        setByteField(term67986, term67986.getClass(), "minute", (byte) 2);
        setByteField(term67986, term67986.getClass(), "second", (byte) 44);
        setIntField(term67986, term67986.getClass(), "nano", 463103620);
        setField(term67981, term67981.getClass(), "time", term67986);
        setField(term67955, term67955.getClass(), "accessTime", term67981);
        setField(term67953, term67953.getClass(), "card", term67955);
        setIntField(term67953, term67953.getClass(), "lastDataVersion", 247896466);
        setField(term67953, term67953.getClass(), "userName", "TSUdwgvHgU");
        setIntField(term67953, term67953.getClass(), "point", -931397750);
        setIntField(term67953, term67953.getClass(), "totalPoint", 1967564631);
        setIntField(term67953, term67953.getClass(), "iconId", -1201113309);
        setIntField(term67953, term67953.getClass(), "nameplateId", 1234432017);
        setIntField(term67953, term67953.getClass(), "frameId", -1323037797);
        setIntField(term67953, term67953.getClass(), "trophyId", -534003181);
        setIntField(term67953, term67953.getClass(), "playCount", 656088138);
        setIntField(term67953, term67953.getClass(), "playVsCount", -1756129889);
        setIntField(term67953, term67953.getClass(), "playSyncCount", -1649701020);
        setIntField(term67953, term67953.getClass(), "winCount", 183048798);
        setIntField(term67953, term67953.getClass(), "helpCount", 50192659);
        setIntField(term67953, term67953.getClass(), "comboCount", -1586884307);
        setIntField(term67953, term67953.getClass(), "feverCount", 761198462);
        setIntField(term67953, term67953.getClass(), "totalHiScore", -2001015455);
        setIntField(term67953, term67953.getClass(), "totalEasyHighScore", -1300443569);
        setIntField(term67953, term67953.getClass(), "totalBasicHighScore", 1758954430);
        setIntField(term67953, term67953.getClass(), "totalAdvancedHighScore", 343381557);
        setIntField(term67953, term67953.getClass(), "totalExpertHighScore", 1072458409);
        setIntField(term67953, term67953.getClass(), "totalMasterHighScore", -369157778);
        setIntField(term67953, term67953.getClass(), "totalReMasterHighScore", -1406308770);
        setIntField(term67953, term67953.getClass(), "totalHighSync", 1787438187);
        setIntField(term67953, term67953.getClass(), "totalEasySync", -1595839174);
        setIntField(term67953, term67953.getClass(), "totalBasicSync", -842864130);
        setIntField(term67953, term67953.getClass(), "totalAdvancedSync", 1397121874);
        setIntField(term67953, term67953.getClass(), "totalExpertSync", 81915067);
        setIntField(term67953, term67953.getClass(), "totalMasterSync", 81408490);
        setIntField(term67953, term67953.getClass(), "totalReMasterSync", 242316145);
        setIntField(term67953, term67953.getClass(), "playerRating", 1646990992);
        setIntField(term67953, term67953.getClass(), "highestRating", 1908475105);
        setIntField(term67953, term67953.getClass(), "rankAuthTailId", -66347285);
        setField(term67953, term67953.getClass(), "eventWatchedDate", "YBQxTjzIrN");
        setField(term67953, term67953.getClass(), "webLimitDate", "xfqaJVcHGx");
        setIntField(term67953, term67953.getClass(), "challengeTrackPhase", 1312057122);
        setIntField(term67953, term67953.getClass(), "firstPlayBits", -615284367);
        setField(term67953, term67953.getClass(), "lastPlayDate", "bANxpqKESI");
        setIntField(term67953, term67953.getClass(), "lastPlaceId", -702531240);
        setField(term67953, term67953.getClass(), "lastPlaceName", "sgpUSVSuVZ");
        setIntField(term67953, term67953.getClass(), "lastRegionId", -1724125016);
        setField(term67953, term67953.getClass(), "lastRegionName", "ZOYhOzwINI");
        setField(term67953, term67953.getClass(), "lastClientId", "sPqjQQfymN");
        setField(term67953, term67953.getClass(), "lastCountryCode", "tNKFzflLBd");
        setIntField(term67953, term67953.getClass(), "eventPoint", 1092747930);
        setIntField(term67953, term67953.getClass(), "totalLv", -1054208604);
        setIntField(term67953, term67953.getClass(), "lastLoginBonusDay", -1676701884);
        setIntField(term67953, term67953.getClass(), "lastSurvivalBonusDay", -608378923);
        setIntField(term67953, term67953.getClass(), "loginBonusLv", -43696626);
        setField(term67951, term67951.getClass(), "user", term67953);
        setIntField(term67951, term67951.getClass(), "soudEffect", -1432224922);
        setIntField(term67951, term67951.getClass(), "mirrorMode", 646086802);
        setIntField(term67951, term67951.getClass(), "guideSpeed", 1687786689);
        setIntField(term67951, term67951.getClass(), "bgInfo", -1847861460);
        setIntField(term67951, term67951.getClass(), "brightness", 772896495);
        setIntField(term67951, term67951.getClass(), "isStarRot", -1637788067);
        setIntField(term67951, term67951.getClass(), "breakSe", 1784675310);
        setIntField(term67951, term67951.getClass(), "slideSe", 87847958);
        setIntField(term67951, term67951.getClass(), "hardJudge", -2087513809);
        setIntField(term67951, term67951.getClass(), "isTagJump", 107693459);
        setIntField(term67951, term67951.getClass(), "breakSeVol", -179154974);
        setIntField(term67951, term67951.getClass(), "slideSeVol", 1618115246);
        setIntField(term67951, term67951.getClass(), "isUpperDisp", -465989702);
        setIntField(term67951, term67951.getClass(), "trackSkip", -1643433512);
        setIntField(term67951, term67951.getClass(), "optionMode", 2101799999);
        setIntField(term67951, term67951.getClass(), "simpleOptionParam", -318818284);
        setIntField(term67951, term67951.getClass(), "adjustTiming", 1083983871);
        setIntField(term67951, term67951.getClass(), "dispTiming", -520406359);
        setIntField(term67951, term67951.getClass(), "timingPos", 139050513);
        setIntField(term67951, term67951.getClass(), "ansVol", -1340996500);
        setIntField(term67951, term67951.getClass(), "noteVol", 1324448192);
        setIntField(term67951, term67951.getClass(), "dmgVol", 816936644);
        setIntField(term67951, term67951.getClass(), "appealFlame", 1987306855);
        setIntField(term67951, term67951.getClass(), "isFeverDisp", -1124921628);
        setIntField(term67951, term67951.getClass(), "dispJudge", -1169204034);
        setIntField(term67951, term67951.getClass(), "judgePos", 525500871);
        setIntField(term67951, term67951.getClass(), "ratingGuard", 564354084);
        setIntField(term67951, term67951.getClass(), "selectChara", -645407244);
        setIntField(term67951, term67951.getClass(), "sortType", 1896076723);
        setIntField(term67951, term67951.getClass(), "filterGenre", 9224215);
        setIntField(term67951, term67951.getClass(), "filterLevel", -670714346);
        setIntField(term67951, term67951.getClass(), "filterRank", 1047072744);
        setIntField(term67951, term67951.getClass(), "filterVersion", -360839548);
        setIntField(term67951, term67951.getClass(), "filterRec", -1920369405);
        setIntField(term67951, term67951.getClass(), "filterFullCombo", 1275481671);
        setIntField(term67951, term67951.getClass(), "filterAllPerfect", -579526757);
        setIntField(term67951, term67951.getClass(), "filterDifficulty", 1833184694);
        setIntField(term67951, term67951.getClass(), "filterFullSync", 743393064);
        setIntField(term67951, term67951.getClass(), "filterReMaster", -1134463597);
        setIntField(term67951, term67951.getClass(), "filterMaxFever", 1984180612);
        setIntField(term67951, term67951.getClass(), "finalSelectId", 1176733985);
        setIntField(term67951, term67951.getClass(), "finalSelectCategory", -1966919914);
        term68169 = new Integer(153319034);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term68169;
        callMethod(klass, "setHardJudge", argTypes, term67951, args);
    }

};


