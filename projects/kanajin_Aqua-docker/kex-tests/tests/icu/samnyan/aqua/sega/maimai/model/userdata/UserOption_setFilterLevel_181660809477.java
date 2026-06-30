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

public class UserOption_setFilterLevel_181660809477 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term74771;
     Object term74989;

    public UserOption_setFilterLevel_181660809477() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term74777 = new Long(4576699120365923235L);
        term74771 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption"));
        Object term74773 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term74775 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term74791 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term74792 = newInstance(Class.forName("java.time.LocalDate"));
        Object term74796 = newInstance(Class.forName("java.time.LocalTime"));
        Object term74801 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term74802 = newInstance(Class.forName("java.time.LocalDate"));
        Object term74806 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term74771, term74771.getClass(), "id", -1283936527800858962L);
        setLongField(term74773, term74773.getClass(), "id", -8901189796092679153L);
        setLongField(term74775, term74775.getClass(), "id", 1731335447688885587L);
        setField(term74775, term74775.getClass(), "extId", term74777);
        setField(term74775, term74775.getClass(), "luid", "apnNoBOovC");
        setIntField(term74792, term74792.getClass(), "year", 2019);
        setShortField(term74792, term74792.getClass(), "month", (short) 8);
        setShortField(term74792, term74792.getClass(), "day", (short) 7);
        setField(term74791, term74791.getClass(), "date", term74792);
        setByteField(term74796, term74796.getClass(), "hour", (byte) 5);
        setByteField(term74796, term74796.getClass(), "minute", (byte) 54);
        setByteField(term74796, term74796.getClass(), "second", (byte) 59);
        setIntField(term74796, term74796.getClass(), "nano", 56284870);
        setField(term74791, term74791.getClass(), "time", term74796);
        setField(term74775, term74775.getClass(), "registerTime", term74791);
        setIntField(term74802, term74802.getClass(), "year", 2023);
        setShortField(term74802, term74802.getClass(), "month", (short) 9);
        setShortField(term74802, term74802.getClass(), "day", (short) 23);
        setField(term74801, term74801.getClass(), "date", term74802);
        setByteField(term74806, term74806.getClass(), "hour", (byte) 14);
        setByteField(term74806, term74806.getClass(), "minute", (byte) 52);
        setByteField(term74806, term74806.getClass(), "second", (byte) 34);
        setIntField(term74806, term74806.getClass(), "nano", 879945118);
        setField(term74801, term74801.getClass(), "time", term74806);
        setField(term74775, term74775.getClass(), "accessTime", term74801);
        setField(term74773, term74773.getClass(), "card", term74775);
        setIntField(term74773, term74773.getClass(), "lastDataVersion", -1176292056);
        setField(term74773, term74773.getClass(), "userName", "SyGIHWAumE");
        setIntField(term74773, term74773.getClass(), "point", -419239990);
        setIntField(term74773, term74773.getClass(), "totalPoint", 1812087138);
        setIntField(term74773, term74773.getClass(), "iconId", 559878621);
        setIntField(term74773, term74773.getClass(), "nameplateId", -1043553054);
        setIntField(term74773, term74773.getClass(), "frameId", 1703046066);
        setIntField(term74773, term74773.getClass(), "trophyId", 926839329);
        setIntField(term74773, term74773.getClass(), "playCount", 1637499416);
        setIntField(term74773, term74773.getClass(), "playVsCount", -1283934329);
        setIntField(term74773, term74773.getClass(), "playSyncCount", -413523309);
        setIntField(term74773, term74773.getClass(), "winCount", -765029045);
        setIntField(term74773, term74773.getClass(), "helpCount", 989766200);
        setIntField(term74773, term74773.getClass(), "comboCount", 676995399);
        setIntField(term74773, term74773.getClass(), "feverCount", -799948673);
        setIntField(term74773, term74773.getClass(), "totalHiScore", -1757936898);
        setIntField(term74773, term74773.getClass(), "totalEasyHighScore", -2117118311);
        setIntField(term74773, term74773.getClass(), "totalBasicHighScore", -1036079269);
        setIntField(term74773, term74773.getClass(), "totalAdvancedHighScore", -909354936);
        setIntField(term74773, term74773.getClass(), "totalExpertHighScore", -289436930);
        setIntField(term74773, term74773.getClass(), "totalMasterHighScore", -1940604591);
        setIntField(term74773, term74773.getClass(), "totalReMasterHighScore", -51328239);
        setIntField(term74773, term74773.getClass(), "totalHighSync", 1321280254);
        setIntField(term74773, term74773.getClass(), "totalEasySync", -751370259);
        setIntField(term74773, term74773.getClass(), "totalBasicSync", -181315764);
        setIntField(term74773, term74773.getClass(), "totalAdvancedSync", -586835416);
        setIntField(term74773, term74773.getClass(), "totalExpertSync", -268780619);
        setIntField(term74773, term74773.getClass(), "totalMasterSync", -1085029958);
        setIntField(term74773, term74773.getClass(), "totalReMasterSync", 1260854199);
        setIntField(term74773, term74773.getClass(), "playerRating", -1543745443);
        setIntField(term74773, term74773.getClass(), "highestRating", -1255681142);
        setIntField(term74773, term74773.getClass(), "rankAuthTailId", 1875835735);
        setField(term74773, term74773.getClass(), "eventWatchedDate", "bMQUwQqyMc");
        setField(term74773, term74773.getClass(), "webLimitDate", "CVaGhXmAUN");
        setIntField(term74773, term74773.getClass(), "challengeTrackPhase", -646361694);
        setIntField(term74773, term74773.getClass(), "firstPlayBits", 923305541);
        setField(term74773, term74773.getClass(), "lastPlayDate", "KnclcuNYRb");
        setIntField(term74773, term74773.getClass(), "lastPlaceId", -1904959000);
        setField(term74773, term74773.getClass(), "lastPlaceName", "UDZJbJPmCC");
        setIntField(term74773, term74773.getClass(), "lastRegionId", -1824028754);
        setField(term74773, term74773.getClass(), "lastRegionName", "oVkgUUfHis");
        setField(term74773, term74773.getClass(), "lastClientId", "hoCKQzIOhx");
        setField(term74773, term74773.getClass(), "lastCountryCode", "znUxTdEvUD");
        setIntField(term74773, term74773.getClass(), "eventPoint", 666780640);
        setIntField(term74773, term74773.getClass(), "totalLv", -2127910563);
        setIntField(term74773, term74773.getClass(), "lastLoginBonusDay", -1206610681);
        setIntField(term74773, term74773.getClass(), "lastSurvivalBonusDay", 304656853);
        setIntField(term74773, term74773.getClass(), "loginBonusLv", 800977713);
        setField(term74771, term74771.getClass(), "user", term74773);
        setIntField(term74771, term74771.getClass(), "soudEffect", -1747527329);
        setIntField(term74771, term74771.getClass(), "mirrorMode", 563611317);
        setIntField(term74771, term74771.getClass(), "guideSpeed", -1421851521);
        setIntField(term74771, term74771.getClass(), "bgInfo", -1305953629);
        setIntField(term74771, term74771.getClass(), "brightness", 748406486);
        setIntField(term74771, term74771.getClass(), "isStarRot", 1180825945);
        setIntField(term74771, term74771.getClass(), "breakSe", -1654547274);
        setIntField(term74771, term74771.getClass(), "slideSe", 1237586484);
        setIntField(term74771, term74771.getClass(), "hardJudge", 322987764);
        setIntField(term74771, term74771.getClass(), "isTagJump", -1756487373);
        setIntField(term74771, term74771.getClass(), "breakSeVol", 1377481670);
        setIntField(term74771, term74771.getClass(), "slideSeVol", -2040463428);
        setIntField(term74771, term74771.getClass(), "isUpperDisp", -1545039709);
        setIntField(term74771, term74771.getClass(), "trackSkip", 1339538920);
        setIntField(term74771, term74771.getClass(), "optionMode", 73094268);
        setIntField(term74771, term74771.getClass(), "simpleOptionParam", 1070233097);
        setIntField(term74771, term74771.getClass(), "adjustTiming", 557700825);
        setIntField(term74771, term74771.getClass(), "dispTiming", -954857411);
        setIntField(term74771, term74771.getClass(), "timingPos", 792588176);
        setIntField(term74771, term74771.getClass(), "ansVol", -1558707637);
        setIntField(term74771, term74771.getClass(), "noteVol", 1016804400);
        setIntField(term74771, term74771.getClass(), "dmgVol", 1995126818);
        setIntField(term74771, term74771.getClass(), "appealFlame", -534461601);
        setIntField(term74771, term74771.getClass(), "isFeverDisp", 213085106);
        setIntField(term74771, term74771.getClass(), "dispJudge", 1527733173);
        setIntField(term74771, term74771.getClass(), "judgePos", -837851405);
        setIntField(term74771, term74771.getClass(), "ratingGuard", 2069187292);
        setIntField(term74771, term74771.getClass(), "selectChara", 1160128853);
        setIntField(term74771, term74771.getClass(), "sortType", 1995621119);
        setIntField(term74771, term74771.getClass(), "filterGenre", -1401892359);
        setIntField(term74771, term74771.getClass(), "filterLevel", -161011768);
        setIntField(term74771, term74771.getClass(), "filterRank", 145609301);
        setIntField(term74771, term74771.getClass(), "filterVersion", -804537981);
        setIntField(term74771, term74771.getClass(), "filterRec", 687292726);
        setIntField(term74771, term74771.getClass(), "filterFullCombo", 1333460001);
        setIntField(term74771, term74771.getClass(), "filterAllPerfect", 535096386);
        setIntField(term74771, term74771.getClass(), "filterDifficulty", 286007591);
        setIntField(term74771, term74771.getClass(), "filterFullSync", -61827487);
        setIntField(term74771, term74771.getClass(), "filterReMaster", 511764183);
        setIntField(term74771, term74771.getClass(), "filterMaxFever", -1665156164);
        setIntField(term74771, term74771.getClass(), "finalSelectId", -103179244);
        setIntField(term74771, term74771.getClass(), "finalSelectCategory", -230111185);
        term74989 = new Integer(2115868613);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term74989;
        callMethod(klass, "setFilterLevel", argTypes, term74771, args);
    }

};


