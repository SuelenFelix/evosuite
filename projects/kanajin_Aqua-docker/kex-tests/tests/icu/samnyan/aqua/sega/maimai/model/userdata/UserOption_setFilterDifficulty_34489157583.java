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

public class UserOption_setFilterDifficulty_34489157583 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76631;
     Object term76849;

    public UserOption_setFilterDifficulty_34489157583() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term76637 = new Long(-88538481937688851L);
        term76631 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption"));
        Object term76633 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term76635 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term76651 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term76652 = newInstance(Class.forName("java.time.LocalDate"));
        Object term76656 = newInstance(Class.forName("java.time.LocalTime"));
        Object term76661 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term76662 = newInstance(Class.forName("java.time.LocalDate"));
        Object term76666 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term76631, term76631.getClass(), "id", -4318584834500248968L);
        setLongField(term76633, term76633.getClass(), "id", -7839957570751440706L);
        setLongField(term76635, term76635.getClass(), "id", -4944032768681866361L);
        setField(term76635, term76635.getClass(), "extId", term76637);
        setField(term76635, term76635.getClass(), "luid", "pkfsHvqODq");
        setIntField(term76652, term76652.getClass(), "year", 2012);
        setShortField(term76652, term76652.getClass(), "month", (short) 7);
        setShortField(term76652, term76652.getClass(), "day", (short) 23);
        setField(term76651, term76651.getClass(), "date", term76652);
        setByteField(term76656, term76656.getClass(), "hour", (byte) 8);
        setByteField(term76656, term76656.getClass(), "minute", (byte) 33);
        setByteField(term76656, term76656.getClass(), "second", (byte) 50);
        setIntField(term76656, term76656.getClass(), "nano", 663997596);
        setField(term76651, term76651.getClass(), "time", term76656);
        setField(term76635, term76635.getClass(), "registerTime", term76651);
        setIntField(term76662, term76662.getClass(), "year", 2018);
        setShortField(term76662, term76662.getClass(), "month", (short) 5);
        setShortField(term76662, term76662.getClass(), "day", (short) 18);
        setField(term76661, term76661.getClass(), "date", term76662);
        setByteField(term76666, term76666.getClass(), "hour", (byte) 22);
        setByteField(term76666, term76666.getClass(), "minute", (byte) 7);
        setByteField(term76666, term76666.getClass(), "second", (byte) 58);
        setIntField(term76666, term76666.getClass(), "nano", 802311880);
        setField(term76661, term76661.getClass(), "time", term76666);
        setField(term76635, term76635.getClass(), "accessTime", term76661);
        setField(term76633, term76633.getClass(), "card", term76635);
        setIntField(term76633, term76633.getClass(), "lastDataVersion", -785822775);
        setField(term76633, term76633.getClass(), "userName", "OoRBUdwown");
        setIntField(term76633, term76633.getClass(), "point", -1481927507);
        setIntField(term76633, term76633.getClass(), "totalPoint", -1877062491);
        setIntField(term76633, term76633.getClass(), "iconId", 807661218);
        setIntField(term76633, term76633.getClass(), "nameplateId", -6550207);
        setIntField(term76633, term76633.getClass(), "frameId", 2028051965);
        setIntField(term76633, term76633.getClass(), "trophyId", 1503074692);
        setIntField(term76633, term76633.getClass(), "playCount", -1315234681);
        setIntField(term76633, term76633.getClass(), "playVsCount", -1162608784);
        setIntField(term76633, term76633.getClass(), "playSyncCount", 746495371);
        setIntField(term76633, term76633.getClass(), "winCount", -556744853);
        setIntField(term76633, term76633.getClass(), "helpCount", -1396568132);
        setIntField(term76633, term76633.getClass(), "comboCount", 1504884095);
        setIntField(term76633, term76633.getClass(), "feverCount", 1296219492);
        setIntField(term76633, term76633.getClass(), "totalHiScore", -951865069);
        setIntField(term76633, term76633.getClass(), "totalEasyHighScore", -1273231913);
        setIntField(term76633, term76633.getClass(), "totalBasicHighScore", 1882849261);
        setIntField(term76633, term76633.getClass(), "totalAdvancedHighScore", 133409083);
        setIntField(term76633, term76633.getClass(), "totalExpertHighScore", -1711345026);
        setIntField(term76633, term76633.getClass(), "totalMasterHighScore", -1999181791);
        setIntField(term76633, term76633.getClass(), "totalReMasterHighScore", 617751238);
        setIntField(term76633, term76633.getClass(), "totalHighSync", -1490789748);
        setIntField(term76633, term76633.getClass(), "totalEasySync", 1548901455);
        setIntField(term76633, term76633.getClass(), "totalBasicSync", -1959301548);
        setIntField(term76633, term76633.getClass(), "totalAdvancedSync", 987806484);
        setIntField(term76633, term76633.getClass(), "totalExpertSync", -1033174268);
        setIntField(term76633, term76633.getClass(), "totalMasterSync", -393658283);
        setIntField(term76633, term76633.getClass(), "totalReMasterSync", 1751001510);
        setIntField(term76633, term76633.getClass(), "playerRating", -1222375530);
        setIntField(term76633, term76633.getClass(), "highestRating", 673233183);
        setIntField(term76633, term76633.getClass(), "rankAuthTailId", 147997544);
        setField(term76633, term76633.getClass(), "eventWatchedDate", "lSidZunNtu");
        setField(term76633, term76633.getClass(), "webLimitDate", "TLUhUnoanK");
        setIntField(term76633, term76633.getClass(), "challengeTrackPhase", -2078032890);
        setIntField(term76633, term76633.getClass(), "firstPlayBits", -1228044113);
        setField(term76633, term76633.getClass(), "lastPlayDate", "JXyQTIyIrU");
        setIntField(term76633, term76633.getClass(), "lastPlaceId", 1818020627);
        setField(term76633, term76633.getClass(), "lastPlaceName", "uplmRQRGWr");
        setIntField(term76633, term76633.getClass(), "lastRegionId", 1189773432);
        setField(term76633, term76633.getClass(), "lastRegionName", "ZEmNnaQFYB");
        setField(term76633, term76633.getClass(), "lastClientId", "FNxFpCZxLW");
        setField(term76633, term76633.getClass(), "lastCountryCode", "sXMXSCUbRu");
        setIntField(term76633, term76633.getClass(), "eventPoint", -722813020);
        setIntField(term76633, term76633.getClass(), "totalLv", -2087572575);
        setIntField(term76633, term76633.getClass(), "lastLoginBonusDay", -426255380);
        setIntField(term76633, term76633.getClass(), "lastSurvivalBonusDay", -1947252510);
        setIntField(term76633, term76633.getClass(), "loginBonusLv", -2010504521);
        setField(term76631, term76631.getClass(), "user", term76633);
        setIntField(term76631, term76631.getClass(), "soudEffect", -2118814470);
        setIntField(term76631, term76631.getClass(), "mirrorMode", -813617417);
        setIntField(term76631, term76631.getClass(), "guideSpeed", -1373956603);
        setIntField(term76631, term76631.getClass(), "bgInfo", 693828474);
        setIntField(term76631, term76631.getClass(), "brightness", 1534615118);
        setIntField(term76631, term76631.getClass(), "isStarRot", -732773020);
        setIntField(term76631, term76631.getClass(), "breakSe", 1231519765);
        setIntField(term76631, term76631.getClass(), "slideSe", -970909578);
        setIntField(term76631, term76631.getClass(), "hardJudge", -827598043);
        setIntField(term76631, term76631.getClass(), "isTagJump", 1788293670);
        setIntField(term76631, term76631.getClass(), "breakSeVol", 894914094);
        setIntField(term76631, term76631.getClass(), "slideSeVol", -902442746);
        setIntField(term76631, term76631.getClass(), "isUpperDisp", -122537673);
        setIntField(term76631, term76631.getClass(), "trackSkip", 824068126);
        setIntField(term76631, term76631.getClass(), "optionMode", 1657336748);
        setIntField(term76631, term76631.getClass(), "simpleOptionParam", -267331048);
        setIntField(term76631, term76631.getClass(), "adjustTiming", -1707487274);
        setIntField(term76631, term76631.getClass(), "dispTiming", -687077769);
        setIntField(term76631, term76631.getClass(), "timingPos", 1239617209);
        setIntField(term76631, term76631.getClass(), "ansVol", -1866259664);
        setIntField(term76631, term76631.getClass(), "noteVol", -240209237);
        setIntField(term76631, term76631.getClass(), "dmgVol", 448751443);
        setIntField(term76631, term76631.getClass(), "appealFlame", -2026783706);
        setIntField(term76631, term76631.getClass(), "isFeverDisp", 36962226);
        setIntField(term76631, term76631.getClass(), "dispJudge", -787981404);
        setIntField(term76631, term76631.getClass(), "judgePos", 503641255);
        setIntField(term76631, term76631.getClass(), "ratingGuard", 556061823);
        setIntField(term76631, term76631.getClass(), "selectChara", 1060184160);
        setIntField(term76631, term76631.getClass(), "sortType", 74678316);
        setIntField(term76631, term76631.getClass(), "filterGenre", 1440958306);
        setIntField(term76631, term76631.getClass(), "filterLevel", -913545640);
        setIntField(term76631, term76631.getClass(), "filterRank", 1019617568);
        setIntField(term76631, term76631.getClass(), "filterVersion", -89684579);
        setIntField(term76631, term76631.getClass(), "filterRec", -259140396);
        setIntField(term76631, term76631.getClass(), "filterFullCombo", 2058486253);
        setIntField(term76631, term76631.getClass(), "filterAllPerfect", -1940345085);
        setIntField(term76631, term76631.getClass(), "filterDifficulty", -1732622094);
        setIntField(term76631, term76631.getClass(), "filterFullSync", 2112663117);
        setIntField(term76631, term76631.getClass(), "filterReMaster", 310553066);
        setIntField(term76631, term76631.getClass(), "filterMaxFever", -162362750);
        setIntField(term76631, term76631.getClass(), "finalSelectId", -516149823);
        setIntField(term76631, term76631.getClass(), "finalSelectCategory", -1393682683);
        term76849 = new Integer(556170630);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term76849;
        callMethod(klass, "setFilterDifficulty", argTypes, term76631, args);
    }

};


