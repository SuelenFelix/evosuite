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

public class UserOption_getFilterRec_44595289636 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61817;

    public UserOption_getFilterRec_44595289636() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term61823 = new Long(3288791194263207397L);
        term61817 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption"));
        Object term61819 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term61821 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term61837 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term61838 = newInstance(Class.forName("java.time.LocalDate"));
        Object term61842 = newInstance(Class.forName("java.time.LocalTime"));
        Object term61847 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term61848 = newInstance(Class.forName("java.time.LocalDate"));
        Object term61852 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term61817, term61817.getClass(), "id", 2166921473521388808L);
        setLongField(term61819, term61819.getClass(), "id", 1964822153944985001L);
        setLongField(term61821, term61821.getClass(), "id", -955253666696787757L);
        setField(term61821, term61821.getClass(), "extId", term61823);
        setField(term61821, term61821.getClass(), "luid", "JlnoFYxLfk");
        setIntField(term61838, term61838.getClass(), "year", 2015);
        setShortField(term61838, term61838.getClass(), "month", (short) 11);
        setShortField(term61838, term61838.getClass(), "day", (short) 6);
        setField(term61837, term61837.getClass(), "date", term61838);
        setByteField(term61842, term61842.getClass(), "hour", (byte) 5);
        setByteField(term61842, term61842.getClass(), "minute", (byte) 30);
        setByteField(term61842, term61842.getClass(), "second", (byte) 37);
        setIntField(term61842, term61842.getClass(), "nano", 396534729);
        setField(term61837, term61837.getClass(), "time", term61842);
        setField(term61821, term61821.getClass(), "registerTime", term61837);
        setIntField(term61848, term61848.getClass(), "year", 2013);
        setShortField(term61848, term61848.getClass(), "month", (short) 1);
        setShortField(term61848, term61848.getClass(), "day", (short) 4);
        setField(term61847, term61847.getClass(), "date", term61848);
        setByteField(term61852, term61852.getClass(), "hour", (byte) 22);
        setByteField(term61852, term61852.getClass(), "minute", (byte) 8);
        setByteField(term61852, term61852.getClass(), "second", (byte) 55);
        setIntField(term61852, term61852.getClass(), "nano", 284915768);
        setField(term61847, term61847.getClass(), "time", term61852);
        setField(term61821, term61821.getClass(), "accessTime", term61847);
        setField(term61819, term61819.getClass(), "card", term61821);
        setIntField(term61819, term61819.getClass(), "lastDataVersion", 1454600617);
        setField(term61819, term61819.getClass(), "userName", "tMMLkDkFYW");
        setIntField(term61819, term61819.getClass(), "point", 279047706);
        setIntField(term61819, term61819.getClass(), "totalPoint", 330393546);
        setIntField(term61819, term61819.getClass(), "iconId", -1272435460);
        setIntField(term61819, term61819.getClass(), "nameplateId", -1484603549);
        setIntField(term61819, term61819.getClass(), "frameId", 1942980695);
        setIntField(term61819, term61819.getClass(), "trophyId", 1796271838);
        setIntField(term61819, term61819.getClass(), "playCount", -1313938080);
        setIntField(term61819, term61819.getClass(), "playVsCount", -2070649848);
        setIntField(term61819, term61819.getClass(), "playSyncCount", -291029205);
        setIntField(term61819, term61819.getClass(), "winCount", 929711065);
        setIntField(term61819, term61819.getClass(), "helpCount", -1034367222);
        setIntField(term61819, term61819.getClass(), "comboCount", 1086994460);
        setIntField(term61819, term61819.getClass(), "feverCount", 434127670);
        setIntField(term61819, term61819.getClass(), "totalHiScore", -1916016616);
        setIntField(term61819, term61819.getClass(), "totalEasyHighScore", -24073374);
        setIntField(term61819, term61819.getClass(), "totalBasicHighScore", -1683460380);
        setIntField(term61819, term61819.getClass(), "totalAdvancedHighScore", -1328582865);
        setIntField(term61819, term61819.getClass(), "totalExpertHighScore", -2124482280);
        setIntField(term61819, term61819.getClass(), "totalMasterHighScore", -559363939);
        setIntField(term61819, term61819.getClass(), "totalReMasterHighScore", 477002993);
        setIntField(term61819, term61819.getClass(), "totalHighSync", -1566937884);
        setIntField(term61819, term61819.getClass(), "totalEasySync", 18844455);
        setIntField(term61819, term61819.getClass(), "totalBasicSync", -104376222);
        setIntField(term61819, term61819.getClass(), "totalAdvancedSync", -910208002);
        setIntField(term61819, term61819.getClass(), "totalExpertSync", 1779017343);
        setIntField(term61819, term61819.getClass(), "totalMasterSync", 1035172702);
        setIntField(term61819, term61819.getClass(), "totalReMasterSync", -2014376784);
        setIntField(term61819, term61819.getClass(), "playerRating", -1636759557);
        setIntField(term61819, term61819.getClass(), "highestRating", -558790646);
        setIntField(term61819, term61819.getClass(), "rankAuthTailId", -1501041458);
        setField(term61819, term61819.getClass(), "eventWatchedDate", "EYJXMlkLoO");
        setField(term61819, term61819.getClass(), "webLimitDate", "qJtkJJhOSV");
        setIntField(term61819, term61819.getClass(), "challengeTrackPhase", 704257790);
        setIntField(term61819, term61819.getClass(), "firstPlayBits", 84488553);
        setField(term61819, term61819.getClass(), "lastPlayDate", "vQbiGKncal");
        setIntField(term61819, term61819.getClass(), "lastPlaceId", 112186676);
        setField(term61819, term61819.getClass(), "lastPlaceName", "NTSNSiYeUu");
        setIntField(term61819, term61819.getClass(), "lastRegionId", 1529668856);
        setField(term61819, term61819.getClass(), "lastRegionName", "SBTEFDmQVY");
        setField(term61819, term61819.getClass(), "lastClientId", "ohZpRiNDZM");
        setField(term61819, term61819.getClass(), "lastCountryCode", "qEXIxhmUwz");
        setIntField(term61819, term61819.getClass(), "eventPoint", 1327244707);
        setIntField(term61819, term61819.getClass(), "totalLv", 636264680);
        setIntField(term61819, term61819.getClass(), "lastLoginBonusDay", 549590868);
        setIntField(term61819, term61819.getClass(), "lastSurvivalBonusDay", -2123777150);
        setIntField(term61819, term61819.getClass(), "loginBonusLv", 1239505784);
        setField(term61817, term61817.getClass(), "user", term61819);
        setIntField(term61817, term61817.getClass(), "soudEffect", 1973303309);
        setIntField(term61817, term61817.getClass(), "mirrorMode", 1732667310);
        setIntField(term61817, term61817.getClass(), "guideSpeed", 1895584040);
        setIntField(term61817, term61817.getClass(), "bgInfo", -51888709);
        setIntField(term61817, term61817.getClass(), "brightness", 1238498169);
        setIntField(term61817, term61817.getClass(), "isStarRot", -1375200779);
        setIntField(term61817, term61817.getClass(), "breakSe", 1855996400);
        setIntField(term61817, term61817.getClass(), "slideSe", 1409066038);
        setIntField(term61817, term61817.getClass(), "hardJudge", 987148838);
        setIntField(term61817, term61817.getClass(), "isTagJump", 2060323601);
        setIntField(term61817, term61817.getClass(), "breakSeVol", -1877309791);
        setIntField(term61817, term61817.getClass(), "slideSeVol", 1057601439);
        setIntField(term61817, term61817.getClass(), "isUpperDisp", 1009362436);
        setIntField(term61817, term61817.getClass(), "trackSkip", 465082402);
        setIntField(term61817, term61817.getClass(), "optionMode", -572966539);
        setIntField(term61817, term61817.getClass(), "simpleOptionParam", -70620606);
        setIntField(term61817, term61817.getClass(), "adjustTiming", -131245628);
        setIntField(term61817, term61817.getClass(), "dispTiming", 1389986243);
        setIntField(term61817, term61817.getClass(), "timingPos", 1400795661);
        setIntField(term61817, term61817.getClass(), "ansVol", 1870026461);
        setIntField(term61817, term61817.getClass(), "noteVol", -2127214606);
        setIntField(term61817, term61817.getClass(), "dmgVol", -1001373806);
        setIntField(term61817, term61817.getClass(), "appealFlame", -1431802716);
        setIntField(term61817, term61817.getClass(), "isFeverDisp", -1927075382);
        setIntField(term61817, term61817.getClass(), "dispJudge", -1834614967);
        setIntField(term61817, term61817.getClass(), "judgePos", 2144962544);
        setIntField(term61817, term61817.getClass(), "ratingGuard", 28864647);
        setIntField(term61817, term61817.getClass(), "selectChara", 376502371);
        setIntField(term61817, term61817.getClass(), "sortType", -1190514622);
        setIntField(term61817, term61817.getClass(), "filterGenre", -664203259);
        setIntField(term61817, term61817.getClass(), "filterLevel", 1182607812);
        setIntField(term61817, term61817.getClass(), "filterRank", -593876319);
        setIntField(term61817, term61817.getClass(), "filterVersion", -319651858);
        setIntField(term61817, term61817.getClass(), "filterRec", -1605318650);
        setIntField(term61817, term61817.getClass(), "filterFullCombo", -1715705311);
        setIntField(term61817, term61817.getClass(), "filterAllPerfect", 1583733510);
        setIntField(term61817, term61817.getClass(), "filterDifficulty", -1283509243);
        setIntField(term61817, term61817.getClass(), "filterFullSync", -1360455750);
        setIntField(term61817, term61817.getClass(), "filterReMaster", -1612479152);
        setIntField(term61817, term61817.getClass(), "filterMaxFever", -1375350596);
        setIntField(term61817, term61817.getClass(), "finalSelectId", 1037044797);
        setIntField(term61817, term61817.getClass(), "finalSelectCategory", -236855495);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFilterRec", argTypes, term61817, args);
    }

};


