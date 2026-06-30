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

public class UserOption_getFinalSelectCategory_167871519244 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64281;

    public UserOption_getFinalSelectCategory_167871519244() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term64287 = new Long(860079646007397083L);
        term64281 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption"));
        Object term64283 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term64285 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term64301 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term64302 = newInstance(Class.forName("java.time.LocalDate"));
        Object term64306 = newInstance(Class.forName("java.time.LocalTime"));
        Object term64311 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term64312 = newInstance(Class.forName("java.time.LocalDate"));
        Object term64316 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term64281, term64281.getClass(), "id", -1889784286465977825L);
        setLongField(term64283, term64283.getClass(), "id", 5592522907226111065L);
        setLongField(term64285, term64285.getClass(), "id", -2577420466618938650L);
        setField(term64285, term64285.getClass(), "extId", term64287);
        setField(term64285, term64285.getClass(), "luid", "IExlbTemvJ");
        setIntField(term64302, term64302.getClass(), "year", 2019);
        setShortField(term64302, term64302.getClass(), "month", (short) 11);
        setShortField(term64302, term64302.getClass(), "day", (short) 1);
        setField(term64301, term64301.getClass(), "date", term64302);
        setByteField(term64306, term64306.getClass(), "hour", (byte) 23);
        setByteField(term64306, term64306.getClass(), "minute", (byte) 29);
        setByteField(term64306, term64306.getClass(), "second", (byte) 31);
        setIntField(term64306, term64306.getClass(), "nano", 58449597);
        setField(term64301, term64301.getClass(), "time", term64306);
        setField(term64285, term64285.getClass(), "registerTime", term64301);
        setIntField(term64312, term64312.getClass(), "year", 2025);
        setShortField(term64312, term64312.getClass(), "month", (short) 2);
        setShortField(term64312, term64312.getClass(), "day", (short) 4);
        setField(term64311, term64311.getClass(), "date", term64312);
        setByteField(term64316, term64316.getClass(), "hour", (byte) 1);
        setByteField(term64316, term64316.getClass(), "minute", (byte) 30);
        setByteField(term64316, term64316.getClass(), "second", (byte) 28);
        setIntField(term64316, term64316.getClass(), "nano", 555720830);
        setField(term64311, term64311.getClass(), "time", term64316);
        setField(term64285, term64285.getClass(), "accessTime", term64311);
        setField(term64283, term64283.getClass(), "card", term64285);
        setIntField(term64283, term64283.getClass(), "lastDataVersion", 1455387853);
        setField(term64283, term64283.getClass(), "userName", "zaljyXXCoy");
        setIntField(term64283, term64283.getClass(), "point", -991820426);
        setIntField(term64283, term64283.getClass(), "totalPoint", 1097512745);
        setIntField(term64283, term64283.getClass(), "iconId", 449748254);
        setIntField(term64283, term64283.getClass(), "nameplateId", 446092014);
        setIntField(term64283, term64283.getClass(), "frameId", 1299747957);
        setIntField(term64283, term64283.getClass(), "trophyId", 1495850839);
        setIntField(term64283, term64283.getClass(), "playCount", -803230600);
        setIntField(term64283, term64283.getClass(), "playVsCount", -1664980170);
        setIntField(term64283, term64283.getClass(), "playSyncCount", -1434914663);
        setIntField(term64283, term64283.getClass(), "winCount", -1057659831);
        setIntField(term64283, term64283.getClass(), "helpCount", -1734417411);
        setIntField(term64283, term64283.getClass(), "comboCount", 2082696095);
        setIntField(term64283, term64283.getClass(), "feverCount", 1962199891);
        setIntField(term64283, term64283.getClass(), "totalHiScore", 47146584);
        setIntField(term64283, term64283.getClass(), "totalEasyHighScore", 2101216461);
        setIntField(term64283, term64283.getClass(), "totalBasicHighScore", 1476730674);
        setIntField(term64283, term64283.getClass(), "totalAdvancedHighScore", 1325210683);
        setIntField(term64283, term64283.getClass(), "totalExpertHighScore", 794195150);
        setIntField(term64283, term64283.getClass(), "totalMasterHighScore", -84410522);
        setIntField(term64283, term64283.getClass(), "totalReMasterHighScore", 512600470);
        setIntField(term64283, term64283.getClass(), "totalHighSync", -694618352);
        setIntField(term64283, term64283.getClass(), "totalEasySync", -656718439);
        setIntField(term64283, term64283.getClass(), "totalBasicSync", 1609229129);
        setIntField(term64283, term64283.getClass(), "totalAdvancedSync", 558262249);
        setIntField(term64283, term64283.getClass(), "totalExpertSync", 105201149);
        setIntField(term64283, term64283.getClass(), "totalMasterSync", 848802875);
        setIntField(term64283, term64283.getClass(), "totalReMasterSync", 103720158);
        setIntField(term64283, term64283.getClass(), "playerRating", 1049168594);
        setIntField(term64283, term64283.getClass(), "highestRating", 1078375453);
        setIntField(term64283, term64283.getClass(), "rankAuthTailId", 687029252);
        setField(term64283, term64283.getClass(), "eventWatchedDate", "dKoYnXLGEI");
        setField(term64283, term64283.getClass(), "webLimitDate", "MQvSpklpkB");
        setIntField(term64283, term64283.getClass(), "challengeTrackPhase", -289940076);
        setIntField(term64283, term64283.getClass(), "firstPlayBits", -438583850);
        setField(term64283, term64283.getClass(), "lastPlayDate", "SbTxRdDQQc");
        setIntField(term64283, term64283.getClass(), "lastPlaceId", 246166593);
        setField(term64283, term64283.getClass(), "lastPlaceName", "MrVdoUYAdO");
        setIntField(term64283, term64283.getClass(), "lastRegionId", -1806147197);
        setField(term64283, term64283.getClass(), "lastRegionName", "schPUnVfDW");
        setField(term64283, term64283.getClass(), "lastClientId", "CpdMEgjUka");
        setField(term64283, term64283.getClass(), "lastCountryCode", "WRisHdgnmm");
        setIntField(term64283, term64283.getClass(), "eventPoint", -236721588);
        setIntField(term64283, term64283.getClass(), "totalLv", 1662513131);
        setIntField(term64283, term64283.getClass(), "lastLoginBonusDay", 997658608);
        setIntField(term64283, term64283.getClass(), "lastSurvivalBonusDay", -680345799);
        setIntField(term64283, term64283.getClass(), "loginBonusLv", -1388442633);
        setField(term64281, term64281.getClass(), "user", term64283);
        setIntField(term64281, term64281.getClass(), "soudEffect", -2049142454);
        setIntField(term64281, term64281.getClass(), "mirrorMode", -1757685074);
        setIntField(term64281, term64281.getClass(), "guideSpeed", 1123330448);
        setIntField(term64281, term64281.getClass(), "bgInfo", 1289973373);
        setIntField(term64281, term64281.getClass(), "brightness", 1367726729);
        setIntField(term64281, term64281.getClass(), "isStarRot", 1626219905);
        setIntField(term64281, term64281.getClass(), "breakSe", -1484874229);
        setIntField(term64281, term64281.getClass(), "slideSe", 887503328);
        setIntField(term64281, term64281.getClass(), "hardJudge", 586281192);
        setIntField(term64281, term64281.getClass(), "isTagJump", 1538125488);
        setIntField(term64281, term64281.getClass(), "breakSeVol", 825356733);
        setIntField(term64281, term64281.getClass(), "slideSeVol", -1301409375);
        setIntField(term64281, term64281.getClass(), "isUpperDisp", 1979382762);
        setIntField(term64281, term64281.getClass(), "trackSkip", -812267058);
        setIntField(term64281, term64281.getClass(), "optionMode", 1394307839);
        setIntField(term64281, term64281.getClass(), "simpleOptionParam", 794207842);
        setIntField(term64281, term64281.getClass(), "adjustTiming", -771456985);
        setIntField(term64281, term64281.getClass(), "dispTiming", -722140170);
        setIntField(term64281, term64281.getClass(), "timingPos", 1916400220);
        setIntField(term64281, term64281.getClass(), "ansVol", -1141686836);
        setIntField(term64281, term64281.getClass(), "noteVol", 478352224);
        setIntField(term64281, term64281.getClass(), "dmgVol", -1101969321);
        setIntField(term64281, term64281.getClass(), "appealFlame", -1548753200);
        setIntField(term64281, term64281.getClass(), "isFeverDisp", 464016562);
        setIntField(term64281, term64281.getClass(), "dispJudge", -1354580524);
        setIntField(term64281, term64281.getClass(), "judgePos", 1631553778);
        setIntField(term64281, term64281.getClass(), "ratingGuard", 518955314);
        setIntField(term64281, term64281.getClass(), "selectChara", 947568502);
        setIntField(term64281, term64281.getClass(), "sortType", -1214145327);
        setIntField(term64281, term64281.getClass(), "filterGenre", -1998835806);
        setIntField(term64281, term64281.getClass(), "filterLevel", -1633893651);
        setIntField(term64281, term64281.getClass(), "filterRank", -104469333);
        setIntField(term64281, term64281.getClass(), "filterVersion", 154770061);
        setIntField(term64281, term64281.getClass(), "filterRec", 1923537756);
        setIntField(term64281, term64281.getClass(), "filterFullCombo", 1759570934);
        setIntField(term64281, term64281.getClass(), "filterAllPerfect", -650039812);
        setIntField(term64281, term64281.getClass(), "filterDifficulty", 986533686);
        setIntField(term64281, term64281.getClass(), "filterFullSync", -939119176);
        setIntField(term64281, term64281.getClass(), "filterReMaster", -455814151);
        setIntField(term64281, term64281.getClass(), "filterMaxFever", 1100360523);
        setIntField(term64281, term64281.getClass(), "finalSelectId", 1962499910);
        setIntField(term64281, term64281.getClass(), "finalSelectCategory", -939758416);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFinalSelectCategory", argTypes, term64281, args);
    }

};


