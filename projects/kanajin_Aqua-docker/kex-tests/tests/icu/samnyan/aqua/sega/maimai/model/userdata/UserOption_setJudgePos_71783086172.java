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

public class UserOption_setJudgePos_71783086172 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73221;
     Object term73439;

    public UserOption_setJudgePos_71783086172() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term73227 = new Long(3752337209837437327L);
        term73221 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption"));
        Object term73223 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term73225 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term73241 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term73242 = newInstance(Class.forName("java.time.LocalDate"));
        Object term73246 = newInstance(Class.forName("java.time.LocalTime"));
        Object term73251 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term73252 = newInstance(Class.forName("java.time.LocalDate"));
        Object term73256 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term73221, term73221.getClass(), "id", 6801904611028883308L);
        setLongField(term73223, term73223.getClass(), "id", -7717027128782374599L);
        setLongField(term73225, term73225.getClass(), "id", 4872921045907555824L);
        setField(term73225, term73225.getClass(), "extId", term73227);
        setField(term73225, term73225.getClass(), "luid", "gcFzvYOUch");
        setIntField(term73242, term73242.getClass(), "year", 2017);
        setShortField(term73242, term73242.getClass(), "month", (short) 8);
        setShortField(term73242, term73242.getClass(), "day", (short) 31);
        setField(term73241, term73241.getClass(), "date", term73242);
        setByteField(term73246, term73246.getClass(), "hour", (byte) 12);
        setByteField(term73246, term73246.getClass(), "minute", (byte) 32);
        setByteField(term73246, term73246.getClass(), "second", (byte) 28);
        setIntField(term73246, term73246.getClass(), "nano", 428210685);
        setField(term73241, term73241.getClass(), "time", term73246);
        setField(term73225, term73225.getClass(), "registerTime", term73241);
        setIntField(term73252, term73252.getClass(), "year", 2013);
        setShortField(term73252, term73252.getClass(), "month", (short) 8);
        setShortField(term73252, term73252.getClass(), "day", (short) 27);
        setField(term73251, term73251.getClass(), "date", term73252);
        setByteField(term73256, term73256.getClass(), "hour", (byte) 16);
        setByteField(term73256, term73256.getClass(), "minute", (byte) 55);
        setByteField(term73256, term73256.getClass(), "second", (byte) 23);
        setIntField(term73256, term73256.getClass(), "nano", 979193613);
        setField(term73251, term73251.getClass(), "time", term73256);
        setField(term73225, term73225.getClass(), "accessTime", term73251);
        setField(term73223, term73223.getClass(), "card", term73225);
        setIntField(term73223, term73223.getClass(), "lastDataVersion", -790690511);
        setField(term73223, term73223.getClass(), "userName", "NnFSMXLOUA");
        setIntField(term73223, term73223.getClass(), "point", -2007184748);
        setIntField(term73223, term73223.getClass(), "totalPoint", 792882108);
        setIntField(term73223, term73223.getClass(), "iconId", 2119225413);
        setIntField(term73223, term73223.getClass(), "nameplateId", 1862656703);
        setIntField(term73223, term73223.getClass(), "frameId", 1394553752);
        setIntField(term73223, term73223.getClass(), "trophyId", -1070458690);
        setIntField(term73223, term73223.getClass(), "playCount", -1037572139);
        setIntField(term73223, term73223.getClass(), "playVsCount", 946784328);
        setIntField(term73223, term73223.getClass(), "playSyncCount", 773507510);
        setIntField(term73223, term73223.getClass(), "winCount", -1404471865);
        setIntField(term73223, term73223.getClass(), "helpCount", -1734326428);
        setIntField(term73223, term73223.getClass(), "comboCount", 599751351);
        setIntField(term73223, term73223.getClass(), "feverCount", -1744677844);
        setIntField(term73223, term73223.getClass(), "totalHiScore", 2043210489);
        setIntField(term73223, term73223.getClass(), "totalEasyHighScore", 633961334);
        setIntField(term73223, term73223.getClass(), "totalBasicHighScore", 1646368018);
        setIntField(term73223, term73223.getClass(), "totalAdvancedHighScore", -1919736389);
        setIntField(term73223, term73223.getClass(), "totalExpertHighScore", -50803568);
        setIntField(term73223, term73223.getClass(), "totalMasterHighScore", 355570570);
        setIntField(term73223, term73223.getClass(), "totalReMasterHighScore", -1567660546);
        setIntField(term73223, term73223.getClass(), "totalHighSync", -301726238);
        setIntField(term73223, term73223.getClass(), "totalEasySync", -724083201);
        setIntField(term73223, term73223.getClass(), "totalBasicSync", 603902059);
        setIntField(term73223, term73223.getClass(), "totalAdvancedSync", 2127733128);
        setIntField(term73223, term73223.getClass(), "totalExpertSync", -1881343665);
        setIntField(term73223, term73223.getClass(), "totalMasterSync", -1946066087);
        setIntField(term73223, term73223.getClass(), "totalReMasterSync", -691706938);
        setIntField(term73223, term73223.getClass(), "playerRating", -434771166);
        setIntField(term73223, term73223.getClass(), "highestRating", 379493778);
        setIntField(term73223, term73223.getClass(), "rankAuthTailId", -1891113742);
        setField(term73223, term73223.getClass(), "eventWatchedDate", "bacruLIvDW");
        setField(term73223, term73223.getClass(), "webLimitDate", "ydbVEuslYx");
        setIntField(term73223, term73223.getClass(), "challengeTrackPhase", -1740565252);
        setIntField(term73223, term73223.getClass(), "firstPlayBits", -948536342);
        setField(term73223, term73223.getClass(), "lastPlayDate", "DKWEhukBpG");
        setIntField(term73223, term73223.getClass(), "lastPlaceId", -1395192813);
        setField(term73223, term73223.getClass(), "lastPlaceName", "YaowqyqxBH");
        setIntField(term73223, term73223.getClass(), "lastRegionId", -43251386);
        setField(term73223, term73223.getClass(), "lastRegionName", "dbxhsKyZWZ");
        setField(term73223, term73223.getClass(), "lastClientId", "oXxafKyyrx");
        setField(term73223, term73223.getClass(), "lastCountryCode", "TapDFGQNLY");
        setIntField(term73223, term73223.getClass(), "eventPoint", -2008817863);
        setIntField(term73223, term73223.getClass(), "totalLv", -1575786190);
        setIntField(term73223, term73223.getClass(), "lastLoginBonusDay", -1918011322);
        setIntField(term73223, term73223.getClass(), "lastSurvivalBonusDay", -1750849256);
        setIntField(term73223, term73223.getClass(), "loginBonusLv", 1034411205);
        setField(term73221, term73221.getClass(), "user", term73223);
        setIntField(term73221, term73221.getClass(), "soudEffect", 1005342524);
        setIntField(term73221, term73221.getClass(), "mirrorMode", 1405943068);
        setIntField(term73221, term73221.getClass(), "guideSpeed", 1327202782);
        setIntField(term73221, term73221.getClass(), "bgInfo", -333180006);
        setIntField(term73221, term73221.getClass(), "brightness", -575052731);
        setIntField(term73221, term73221.getClass(), "isStarRot", -1792389700);
        setIntField(term73221, term73221.getClass(), "breakSe", 852503132);
        setIntField(term73221, term73221.getClass(), "slideSe", -725027019);
        setIntField(term73221, term73221.getClass(), "hardJudge", -1677510716);
        setIntField(term73221, term73221.getClass(), "isTagJump", -1566098062);
        setIntField(term73221, term73221.getClass(), "breakSeVol", -515297906);
        setIntField(term73221, term73221.getClass(), "slideSeVol", -824003664);
        setIntField(term73221, term73221.getClass(), "isUpperDisp", 2103484915);
        setIntField(term73221, term73221.getClass(), "trackSkip", -1152232729);
        setIntField(term73221, term73221.getClass(), "optionMode", 1155067850);
        setIntField(term73221, term73221.getClass(), "simpleOptionParam", -1941137904);
        setIntField(term73221, term73221.getClass(), "adjustTiming", -2027575410);
        setIntField(term73221, term73221.getClass(), "dispTiming", -2077238638);
        setIntField(term73221, term73221.getClass(), "timingPos", -708951514);
        setIntField(term73221, term73221.getClass(), "ansVol", 287450588);
        setIntField(term73221, term73221.getClass(), "noteVol", -1120512550);
        setIntField(term73221, term73221.getClass(), "dmgVol", -1302516626);
        setIntField(term73221, term73221.getClass(), "appealFlame", 364431382);
        setIntField(term73221, term73221.getClass(), "isFeverDisp", -1871723538);
        setIntField(term73221, term73221.getClass(), "dispJudge", 190634728);
        setIntField(term73221, term73221.getClass(), "judgePos", 355866861);
        setIntField(term73221, term73221.getClass(), "ratingGuard", -1966369959);
        setIntField(term73221, term73221.getClass(), "selectChara", 2001592972);
        setIntField(term73221, term73221.getClass(), "sortType", 2125618714);
        setIntField(term73221, term73221.getClass(), "filterGenre", 1278193964);
        setIntField(term73221, term73221.getClass(), "filterLevel", 1697847830);
        setIntField(term73221, term73221.getClass(), "filterRank", 854534842);
        setIntField(term73221, term73221.getClass(), "filterVersion", -1868669722);
        setIntField(term73221, term73221.getClass(), "filterRec", -1617240473);
        setIntField(term73221, term73221.getClass(), "filterFullCombo", -717100223);
        setIntField(term73221, term73221.getClass(), "filterAllPerfect", 232465097);
        setIntField(term73221, term73221.getClass(), "filterDifficulty", -219639847);
        setIntField(term73221, term73221.getClass(), "filterFullSync", -1883997010);
        setIntField(term73221, term73221.getClass(), "filterReMaster", 589940035);
        setIntField(term73221, term73221.getClass(), "filterMaxFever", 303311411);
        setIntField(term73221, term73221.getClass(), "finalSelectId", -107635745);
        setIntField(term73221, term73221.getClass(), "finalSelectCategory", -1852838695);
        term73439 = new Integer(49083098);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term73439;
        callMethod(klass, "setJudgePos", argTypes, term73221, args);
    }

};


