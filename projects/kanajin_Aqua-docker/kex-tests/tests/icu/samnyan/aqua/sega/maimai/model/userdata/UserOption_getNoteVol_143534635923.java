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

public class UserOption_getNoteVol_143534635923 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57813;

    public UserOption_getNoteVol_143534635923() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term57819 = new Long(4394651392080968777L);
        term57813 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption"));
        Object term57815 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term57817 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term57833 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term57834 = newInstance(Class.forName("java.time.LocalDate"));
        Object term57838 = newInstance(Class.forName("java.time.LocalTime"));
        Object term57843 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term57844 = newInstance(Class.forName("java.time.LocalDate"));
        Object term57848 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term57813, term57813.getClass(), "id", -8705953038984862378L);
        setLongField(term57815, term57815.getClass(), "id", -7589547201844161961L);
        setLongField(term57817, term57817.getClass(), "id", 8847748922379375307L);
        setField(term57817, term57817.getClass(), "extId", term57819);
        setField(term57817, term57817.getClass(), "luid", "UsCZaSgXzI");
        setIntField(term57834, term57834.getClass(), "year", 2013);
        setShortField(term57834, term57834.getClass(), "month", (short) 1);
        setShortField(term57834, term57834.getClass(), "day", (short) 1);
        setField(term57833, term57833.getClass(), "date", term57834);
        setByteField(term57838, term57838.getClass(), "hour", (byte) 17);
        setByteField(term57838, term57838.getClass(), "minute", (byte) 16);
        setByteField(term57838, term57838.getClass(), "second", (byte) 19);
        setIntField(term57838, term57838.getClass(), "nano", 656333309);
        setField(term57833, term57833.getClass(), "time", term57838);
        setField(term57817, term57817.getClass(), "registerTime", term57833);
        setIntField(term57844, term57844.getClass(), "year", 2012);
        setShortField(term57844, term57844.getClass(), "month", (short) 3);
        setShortField(term57844, term57844.getClass(), "day", (short) 8);
        setField(term57843, term57843.getClass(), "date", term57844);
        setByteField(term57848, term57848.getClass(), "hour", (byte) 18);
        setByteField(term57848, term57848.getClass(), "minute", (byte) 5);
        setByteField(term57848, term57848.getClass(), "second", (byte) 29);
        setIntField(term57848, term57848.getClass(), "nano", 800260160);
        setField(term57843, term57843.getClass(), "time", term57848);
        setField(term57817, term57817.getClass(), "accessTime", term57843);
        setField(term57815, term57815.getClass(), "card", term57817);
        setIntField(term57815, term57815.getClass(), "lastDataVersion", 530563698);
        setField(term57815, term57815.getClass(), "userName", "IXZCeVwvBM");
        setIntField(term57815, term57815.getClass(), "point", 246325554);
        setIntField(term57815, term57815.getClass(), "totalPoint", -101942956);
        setIntField(term57815, term57815.getClass(), "iconId", -879653940);
        setIntField(term57815, term57815.getClass(), "nameplateId", 1525281725);
        setIntField(term57815, term57815.getClass(), "frameId", 942819176);
        setIntField(term57815, term57815.getClass(), "trophyId", 574235419);
        setIntField(term57815, term57815.getClass(), "playCount", 296302576);
        setIntField(term57815, term57815.getClass(), "playVsCount", -2007722929);
        setIntField(term57815, term57815.getClass(), "playSyncCount", -437524378);
        setIntField(term57815, term57815.getClass(), "winCount", 1763408351);
        setIntField(term57815, term57815.getClass(), "helpCount", -1795069152);
        setIntField(term57815, term57815.getClass(), "comboCount", 1150223319);
        setIntField(term57815, term57815.getClass(), "feverCount", 1090258751);
        setIntField(term57815, term57815.getClass(), "totalHiScore", 1121387085);
        setIntField(term57815, term57815.getClass(), "totalEasyHighScore", 239345617);
        setIntField(term57815, term57815.getClass(), "totalBasicHighScore", -1703154971);
        setIntField(term57815, term57815.getClass(), "totalAdvancedHighScore", -187409593);
        setIntField(term57815, term57815.getClass(), "totalExpertHighScore", 1976370886);
        setIntField(term57815, term57815.getClass(), "totalMasterHighScore", 55334433);
        setIntField(term57815, term57815.getClass(), "totalReMasterHighScore", -666821151);
        setIntField(term57815, term57815.getClass(), "totalHighSync", -36525575);
        setIntField(term57815, term57815.getClass(), "totalEasySync", -933677706);
        setIntField(term57815, term57815.getClass(), "totalBasicSync", -1767089569);
        setIntField(term57815, term57815.getClass(), "totalAdvancedSync", 142490431);
        setIntField(term57815, term57815.getClass(), "totalExpertSync", 1200937755);
        setIntField(term57815, term57815.getClass(), "totalMasterSync", -1108898907);
        setIntField(term57815, term57815.getClass(), "totalReMasterSync", -1636601903);
        setIntField(term57815, term57815.getClass(), "playerRating", -1601013520);
        setIntField(term57815, term57815.getClass(), "highestRating", -1774736608);
        setIntField(term57815, term57815.getClass(), "rankAuthTailId", 1729897037);
        setField(term57815, term57815.getClass(), "eventWatchedDate", "ElTdyUVQYi");
        setField(term57815, term57815.getClass(), "webLimitDate", "KkgJnxXxVl");
        setIntField(term57815, term57815.getClass(), "challengeTrackPhase", -144907344);
        setIntField(term57815, term57815.getClass(), "firstPlayBits", 913134875);
        setField(term57815, term57815.getClass(), "lastPlayDate", "TGnzPlGFMb");
        setIntField(term57815, term57815.getClass(), "lastPlaceId", 1826856908);
        setField(term57815, term57815.getClass(), "lastPlaceName", "yEvLMSpdHy");
        setIntField(term57815, term57815.getClass(), "lastRegionId", -288182293);
        setField(term57815, term57815.getClass(), "lastRegionName", "qdErlZeTVv");
        setField(term57815, term57815.getClass(), "lastClientId", "OCCDQbndDE");
        setField(term57815, term57815.getClass(), "lastCountryCode", "NMANMKfctU");
        setIntField(term57815, term57815.getClass(), "eventPoint", -1548825481);
        setIntField(term57815, term57815.getClass(), "totalLv", 267197964);
        setIntField(term57815, term57815.getClass(), "lastLoginBonusDay", -199089378);
        setIntField(term57815, term57815.getClass(), "lastSurvivalBonusDay", -1531718758);
        setIntField(term57815, term57815.getClass(), "loginBonusLv", -55641764);
        setField(term57813, term57813.getClass(), "user", term57815);
        setIntField(term57813, term57813.getClass(), "soudEffect", -2037807764);
        setIntField(term57813, term57813.getClass(), "mirrorMode", 1974397033);
        setIntField(term57813, term57813.getClass(), "guideSpeed", 1265335644);
        setIntField(term57813, term57813.getClass(), "bgInfo", -419899874);
        setIntField(term57813, term57813.getClass(), "brightness", 1798812338);
        setIntField(term57813, term57813.getClass(), "isStarRot", 1746403267);
        setIntField(term57813, term57813.getClass(), "breakSe", 1970079675);
        setIntField(term57813, term57813.getClass(), "slideSe", 1835484929);
        setIntField(term57813, term57813.getClass(), "hardJudge", 1666746585);
        setIntField(term57813, term57813.getClass(), "isTagJump", 1824603043);
        setIntField(term57813, term57813.getClass(), "breakSeVol", -1528375664);
        setIntField(term57813, term57813.getClass(), "slideSeVol", 2146550038);
        setIntField(term57813, term57813.getClass(), "isUpperDisp", 660149075);
        setIntField(term57813, term57813.getClass(), "trackSkip", 621137093);
        setIntField(term57813, term57813.getClass(), "optionMode", -1420783838);
        setIntField(term57813, term57813.getClass(), "simpleOptionParam", 1946952384);
        setIntField(term57813, term57813.getClass(), "adjustTiming", 1505250876);
        setIntField(term57813, term57813.getClass(), "dispTiming", -1719846831);
        setIntField(term57813, term57813.getClass(), "timingPos", -1206108814);
        setIntField(term57813, term57813.getClass(), "ansVol", -1358098318);
        setIntField(term57813, term57813.getClass(), "noteVol", -2002469421);
        setIntField(term57813, term57813.getClass(), "dmgVol", -1223226309);
        setIntField(term57813, term57813.getClass(), "appealFlame", -2050753836);
        setIntField(term57813, term57813.getClass(), "isFeverDisp", 18274749);
        setIntField(term57813, term57813.getClass(), "dispJudge", -1198028507);
        setIntField(term57813, term57813.getClass(), "judgePos", 1662186988);
        setIntField(term57813, term57813.getClass(), "ratingGuard", -705500735);
        setIntField(term57813, term57813.getClass(), "selectChara", 1413163657);
        setIntField(term57813, term57813.getClass(), "sortType", 1786383370);
        setIntField(term57813, term57813.getClass(), "filterGenre", -15655134);
        setIntField(term57813, term57813.getClass(), "filterLevel", -1172202773);
        setIntField(term57813, term57813.getClass(), "filterRank", -1605235550);
        setIntField(term57813, term57813.getClass(), "filterVersion", 2000557141);
        setIntField(term57813, term57813.getClass(), "filterRec", 869332244);
        setIntField(term57813, term57813.getClass(), "filterFullCombo", 451620754);
        setIntField(term57813, term57813.getClass(), "filterAllPerfect", -2071921290);
        setIntField(term57813, term57813.getClass(), "filterDifficulty", -727695802);
        setIntField(term57813, term57813.getClass(), "filterFullSync", 703774169);
        setIntField(term57813, term57813.getClass(), "filterReMaster", 1054985494);
        setIntField(term57813, term57813.getClass(), "filterMaxFever", 1945574428);
        setIntField(term57813, term57813.getClass(), "finalSelectId", -1773198269);
        setIntField(term57813, term57813.getClass(), "finalSelectCategory", 1316134921);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNoteVol", argTypes, term57813, args);
    }

};


