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

public class UserOption_setDispTiming_25572909064 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70741;
     Object term70959;

    public UserOption_setDispTiming_25572909064() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term70747 = new Long(-4867941246533901410L);
        term70741 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption"));
        Object term70743 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term70745 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term70761 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term70762 = newInstance(Class.forName("java.time.LocalDate"));
        Object term70766 = newInstance(Class.forName("java.time.LocalTime"));
        Object term70771 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term70772 = newInstance(Class.forName("java.time.LocalDate"));
        Object term70776 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term70741, term70741.getClass(), "id", -6314099457945626605L);
        setLongField(term70743, term70743.getClass(), "id", -8697239524885136781L);
        setLongField(term70745, term70745.getClass(), "id", 6465539339431559532L);
        setField(term70745, term70745.getClass(), "extId", term70747);
        setField(term70745, term70745.getClass(), "luid", "kNkFIdfwqs");
        setIntField(term70762, term70762.getClass(), "year", 2023);
        setShortField(term70762, term70762.getClass(), "month", (short) 3);
        setShortField(term70762, term70762.getClass(), "day", (short) 9);
        setField(term70761, term70761.getClass(), "date", term70762);
        setByteField(term70766, term70766.getClass(), "hour", (byte) 0);
        setByteField(term70766, term70766.getClass(), "minute", (byte) 39);
        setByteField(term70766, term70766.getClass(), "second", (byte) 8);
        setIntField(term70766, term70766.getClass(), "nano", 231503726);
        setField(term70761, term70761.getClass(), "time", term70766);
        setField(term70745, term70745.getClass(), "registerTime", term70761);
        setIntField(term70772, term70772.getClass(), "year", 2018);
        setShortField(term70772, term70772.getClass(), "month", (short) 4);
        setShortField(term70772, term70772.getClass(), "day", (short) 18);
        setField(term70771, term70771.getClass(), "date", term70772);
        setByteField(term70776, term70776.getClass(), "hour", (byte) 12);
        setByteField(term70776, term70776.getClass(), "minute", (byte) 26);
        setByteField(term70776, term70776.getClass(), "second", (byte) 54);
        setIntField(term70776, term70776.getClass(), "nano", 499786988);
        setField(term70771, term70771.getClass(), "time", term70776);
        setField(term70745, term70745.getClass(), "accessTime", term70771);
        setField(term70743, term70743.getClass(), "card", term70745);
        setIntField(term70743, term70743.getClass(), "lastDataVersion", -994963847);
        setField(term70743, term70743.getClass(), "userName", "sHLdqoTjnP");
        setIntField(term70743, term70743.getClass(), "point", 1267196825);
        setIntField(term70743, term70743.getClass(), "totalPoint", -1556772835);
        setIntField(term70743, term70743.getClass(), "iconId", 826496758);
        setIntField(term70743, term70743.getClass(), "nameplateId", -1092524320);
        setIntField(term70743, term70743.getClass(), "frameId", -1369169185);
        setIntField(term70743, term70743.getClass(), "trophyId", 621086741);
        setIntField(term70743, term70743.getClass(), "playCount", 1859131268);
        setIntField(term70743, term70743.getClass(), "playVsCount", -2039488454);
        setIntField(term70743, term70743.getClass(), "playSyncCount", 2103290677);
        setIntField(term70743, term70743.getClass(), "winCount", 1837373391);
        setIntField(term70743, term70743.getClass(), "helpCount", -128438506);
        setIntField(term70743, term70743.getClass(), "comboCount", 714422066);
        setIntField(term70743, term70743.getClass(), "feverCount", 1681162409);
        setIntField(term70743, term70743.getClass(), "totalHiScore", 1970231092);
        setIntField(term70743, term70743.getClass(), "totalEasyHighScore", 1491681461);
        setIntField(term70743, term70743.getClass(), "totalBasicHighScore", 671852602);
        setIntField(term70743, term70743.getClass(), "totalAdvancedHighScore", 644767573);
        setIntField(term70743, term70743.getClass(), "totalExpertHighScore", 530544685);
        setIntField(term70743, term70743.getClass(), "totalMasterHighScore", 1402078763);
        setIntField(term70743, term70743.getClass(), "totalReMasterHighScore", -1642283126);
        setIntField(term70743, term70743.getClass(), "totalHighSync", -195107561);
        setIntField(term70743, term70743.getClass(), "totalEasySync", 1290451013);
        setIntField(term70743, term70743.getClass(), "totalBasicSync", 1222406873);
        setIntField(term70743, term70743.getClass(), "totalAdvancedSync", 844932455);
        setIntField(term70743, term70743.getClass(), "totalExpertSync", -283368825);
        setIntField(term70743, term70743.getClass(), "totalMasterSync", -26095476);
        setIntField(term70743, term70743.getClass(), "totalReMasterSync", -817451064);
        setIntField(term70743, term70743.getClass(), "playerRating", 1763142312);
        setIntField(term70743, term70743.getClass(), "highestRating", 58115877);
        setIntField(term70743, term70743.getClass(), "rankAuthTailId", 1626439614);
        setField(term70743, term70743.getClass(), "eventWatchedDate", "UakuVGzEav");
        setField(term70743, term70743.getClass(), "webLimitDate", "DxiwTTouEo");
        setIntField(term70743, term70743.getClass(), "challengeTrackPhase", 1481065725);
        setIntField(term70743, term70743.getClass(), "firstPlayBits", -1767368331);
        setField(term70743, term70743.getClass(), "lastPlayDate", "ghoklPMuMt");
        setIntField(term70743, term70743.getClass(), "lastPlaceId", 1372347602);
        setField(term70743, term70743.getClass(), "lastPlaceName", "uAgfQbLPeZ");
        setIntField(term70743, term70743.getClass(), "lastRegionId", 1235227301);
        setField(term70743, term70743.getClass(), "lastRegionName", "aZiFZfzhQT");
        setField(term70743, term70743.getClass(), "lastClientId", "HbzAbCwWRh");
        setField(term70743, term70743.getClass(), "lastCountryCode", "yBgWgFtVxP");
        setIntField(term70743, term70743.getClass(), "eventPoint", -681966576);
        setIntField(term70743, term70743.getClass(), "totalLv", 858361426);
        setIntField(term70743, term70743.getClass(), "lastLoginBonusDay", 989677185);
        setIntField(term70743, term70743.getClass(), "lastSurvivalBonusDay", -1548710213);
        setIntField(term70743, term70743.getClass(), "loginBonusLv", -1034385409);
        setField(term70741, term70741.getClass(), "user", term70743);
        setIntField(term70741, term70741.getClass(), "soudEffect", 846028123);
        setIntField(term70741, term70741.getClass(), "mirrorMode", -113805778);
        setIntField(term70741, term70741.getClass(), "guideSpeed", -217357550);
        setIntField(term70741, term70741.getClass(), "bgInfo", 1933205055);
        setIntField(term70741, term70741.getClass(), "brightness", 2116372433);
        setIntField(term70741, term70741.getClass(), "isStarRot", -1327362546);
        setIntField(term70741, term70741.getClass(), "breakSe", -278477960);
        setIntField(term70741, term70741.getClass(), "slideSe", 1350970644);
        setIntField(term70741, term70741.getClass(), "hardJudge", 66061780);
        setIntField(term70741, term70741.getClass(), "isTagJump", -502963961);
        setIntField(term70741, term70741.getClass(), "breakSeVol", 1088885205);
        setIntField(term70741, term70741.getClass(), "slideSeVol", 478047010);
        setIntField(term70741, term70741.getClass(), "isUpperDisp", 750938225);
        setIntField(term70741, term70741.getClass(), "trackSkip", -2008152478);
        setIntField(term70741, term70741.getClass(), "optionMode", 655489496);
        setIntField(term70741, term70741.getClass(), "simpleOptionParam", 682196034);
        setIntField(term70741, term70741.getClass(), "adjustTiming", -2093869089);
        setIntField(term70741, term70741.getClass(), "dispTiming", 1853945022);
        setIntField(term70741, term70741.getClass(), "timingPos", -1033559342);
        setIntField(term70741, term70741.getClass(), "ansVol", -989968487);
        setIntField(term70741, term70741.getClass(), "noteVol", -893947386);
        setIntField(term70741, term70741.getClass(), "dmgVol", -584984505);
        setIntField(term70741, term70741.getClass(), "appealFlame", 1921752033);
        setIntField(term70741, term70741.getClass(), "isFeverDisp", 1157339879);
        setIntField(term70741, term70741.getClass(), "dispJudge", -1756345024);
        setIntField(term70741, term70741.getClass(), "judgePos", -362014680);
        setIntField(term70741, term70741.getClass(), "ratingGuard", 1027302993);
        setIntField(term70741, term70741.getClass(), "selectChara", 578940700);
        setIntField(term70741, term70741.getClass(), "sortType", 1531290466);
        setIntField(term70741, term70741.getClass(), "filterGenre", 248659773);
        setIntField(term70741, term70741.getClass(), "filterLevel", 511099454);
        setIntField(term70741, term70741.getClass(), "filterRank", -1280548304);
        setIntField(term70741, term70741.getClass(), "filterVersion", -328046339);
        setIntField(term70741, term70741.getClass(), "filterRec", -197215219);
        setIntField(term70741, term70741.getClass(), "filterFullCombo", 8593789);
        setIntField(term70741, term70741.getClass(), "filterAllPerfect", 1063189043);
        setIntField(term70741, term70741.getClass(), "filterDifficulty", 1133122784);
        setIntField(term70741, term70741.getClass(), "filterFullSync", -1433654281);
        setIntField(term70741, term70741.getClass(), "filterReMaster", -1834883908);
        setIntField(term70741, term70741.getClass(), "filterMaxFever", -116554333);
        setIntField(term70741, term70741.getClass(), "finalSelectId", 46242785);
        setIntField(term70741, term70741.getClass(), "finalSelectCategory", -530930262);
        term70959 = new Integer(1471497959);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term70959;
        callMethod(klass, "setDispTiming", argTypes, term70741, args);
    }

};


