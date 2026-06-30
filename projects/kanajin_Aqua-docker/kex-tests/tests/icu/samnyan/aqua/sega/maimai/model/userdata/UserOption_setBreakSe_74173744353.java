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

public class UserOption_setBreakSe_74173744353 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67331;
     Object term67549;

    public UserOption_setBreakSe_74173744353() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term67337 = new Long(6902365338255307910L);
        term67331 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption"));
        Object term67333 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term67335 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term67351 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term67352 = newInstance(Class.forName("java.time.LocalDate"));
        Object term67356 = newInstance(Class.forName("java.time.LocalTime"));
        Object term67361 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term67362 = newInstance(Class.forName("java.time.LocalDate"));
        Object term67366 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term67331, term67331.getClass(), "id", -8699693633047465617L);
        setLongField(term67333, term67333.getClass(), "id", -590890905395927244L);
        setLongField(term67335, term67335.getClass(), "id", 6978548804004471804L);
        setField(term67335, term67335.getClass(), "extId", term67337);
        setField(term67335, term67335.getClass(), "luid", "UnkpYLSsCR");
        setIntField(term67352, term67352.getClass(), "year", 2010);
        setShortField(term67352, term67352.getClass(), "month", (short) 5);
        setShortField(term67352, term67352.getClass(), "day", (short) 27);
        setField(term67351, term67351.getClass(), "date", term67352);
        setByteField(term67356, term67356.getClass(), "hour", (byte) 12);
        setByteField(term67356, term67356.getClass(), "minute", (byte) 53);
        setByteField(term67356, term67356.getClass(), "second", (byte) 45);
        setIntField(term67356, term67356.getClass(), "nano", 508314626);
        setField(term67351, term67351.getClass(), "time", term67356);
        setField(term67335, term67335.getClass(), "registerTime", term67351);
        setIntField(term67362, term67362.getClass(), "year", 2028);
        setShortField(term67362, term67362.getClass(), "month", (short) 2);
        setShortField(term67362, term67362.getClass(), "day", (short) 29);
        setField(term67361, term67361.getClass(), "date", term67362);
        setByteField(term67366, term67366.getClass(), "hour", (byte) 9);
        setByteField(term67366, term67366.getClass(), "minute", (byte) 45);
        setByteField(term67366, term67366.getClass(), "second", (byte) 4);
        setIntField(term67366, term67366.getClass(), "nano", 508964901);
        setField(term67361, term67361.getClass(), "time", term67366);
        setField(term67335, term67335.getClass(), "accessTime", term67361);
        setField(term67333, term67333.getClass(), "card", term67335);
        setIntField(term67333, term67333.getClass(), "lastDataVersion", 1646304251);
        setField(term67333, term67333.getClass(), "userName", "AaxnITALtd");
        setIntField(term67333, term67333.getClass(), "point", -385959598);
        setIntField(term67333, term67333.getClass(), "totalPoint", -1919082628);
        setIntField(term67333, term67333.getClass(), "iconId", 1097362886);
        setIntField(term67333, term67333.getClass(), "nameplateId", 1976963675);
        setIntField(term67333, term67333.getClass(), "frameId", 1318525762);
        setIntField(term67333, term67333.getClass(), "trophyId", -1657759952);
        setIntField(term67333, term67333.getClass(), "playCount", -1302867740);
        setIntField(term67333, term67333.getClass(), "playVsCount", -74421758);
        setIntField(term67333, term67333.getClass(), "playSyncCount", -1715609258);
        setIntField(term67333, term67333.getClass(), "winCount", -325309589);
        setIntField(term67333, term67333.getClass(), "helpCount", 1225997367);
        setIntField(term67333, term67333.getClass(), "comboCount", 1463513606);
        setIntField(term67333, term67333.getClass(), "feverCount", -2105056168);
        setIntField(term67333, term67333.getClass(), "totalHiScore", 275133293);
        setIntField(term67333, term67333.getClass(), "totalEasyHighScore", 915181151);
        setIntField(term67333, term67333.getClass(), "totalBasicHighScore", 1537010523);
        setIntField(term67333, term67333.getClass(), "totalAdvancedHighScore", -661143608);
        setIntField(term67333, term67333.getClass(), "totalExpertHighScore", -605823310);
        setIntField(term67333, term67333.getClass(), "totalMasterHighScore", -1277195157);
        setIntField(term67333, term67333.getClass(), "totalReMasterHighScore", 1132183912);
        setIntField(term67333, term67333.getClass(), "totalHighSync", 1444602079);
        setIntField(term67333, term67333.getClass(), "totalEasySync", 1644507567);
        setIntField(term67333, term67333.getClass(), "totalBasicSync", -1406782851);
        setIntField(term67333, term67333.getClass(), "totalAdvancedSync", 1353299927);
        setIntField(term67333, term67333.getClass(), "totalExpertSync", 545259984);
        setIntField(term67333, term67333.getClass(), "totalMasterSync", -795371078);
        setIntField(term67333, term67333.getClass(), "totalReMasterSync", -441521491);
        setIntField(term67333, term67333.getClass(), "playerRating", 1603903916);
        setIntField(term67333, term67333.getClass(), "highestRating", -1285876400);
        setIntField(term67333, term67333.getClass(), "rankAuthTailId", -1903604663);
        setField(term67333, term67333.getClass(), "eventWatchedDate", "RdnRRpWglh");
        setField(term67333, term67333.getClass(), "webLimitDate", "YcXTXuOFYV");
        setIntField(term67333, term67333.getClass(), "challengeTrackPhase", 1210371629);
        setIntField(term67333, term67333.getClass(), "firstPlayBits", 909735321);
        setField(term67333, term67333.getClass(), "lastPlayDate", "HGhIlMCaKM");
        setIntField(term67333, term67333.getClass(), "lastPlaceId", -151853480);
        setField(term67333, term67333.getClass(), "lastPlaceName", "pPxivEPfHY");
        setIntField(term67333, term67333.getClass(), "lastRegionId", -945363618);
        setField(term67333, term67333.getClass(), "lastRegionName", "BiitfiJmRW");
        setField(term67333, term67333.getClass(), "lastClientId", "ILHarzuGbn");
        setField(term67333, term67333.getClass(), "lastCountryCode", "uNGHHAwCFL");
        setIntField(term67333, term67333.getClass(), "eventPoint", 1670927534);
        setIntField(term67333, term67333.getClass(), "totalLv", 946393999);
        setIntField(term67333, term67333.getClass(), "lastLoginBonusDay", 254472233);
        setIntField(term67333, term67333.getClass(), "lastSurvivalBonusDay", 972028226);
        setIntField(term67333, term67333.getClass(), "loginBonusLv", 1113134594);
        setField(term67331, term67331.getClass(), "user", term67333);
        setIntField(term67331, term67331.getClass(), "soudEffect", 551145368);
        setIntField(term67331, term67331.getClass(), "mirrorMode", -589024624);
        setIntField(term67331, term67331.getClass(), "guideSpeed", -248083088);
        setIntField(term67331, term67331.getClass(), "bgInfo", -1418231293);
        setIntField(term67331, term67331.getClass(), "brightness", 464721379);
        setIntField(term67331, term67331.getClass(), "isStarRot", -1679784341);
        setIntField(term67331, term67331.getClass(), "breakSe", 545828052);
        setIntField(term67331, term67331.getClass(), "slideSe", 1204794034);
        setIntField(term67331, term67331.getClass(), "hardJudge", 908573728);
        setIntField(term67331, term67331.getClass(), "isTagJump", -1645726101);
        setIntField(term67331, term67331.getClass(), "breakSeVol", 1696762677);
        setIntField(term67331, term67331.getClass(), "slideSeVol", -169034590);
        setIntField(term67331, term67331.getClass(), "isUpperDisp", 615142414);
        setIntField(term67331, term67331.getClass(), "trackSkip", 162127898);
        setIntField(term67331, term67331.getClass(), "optionMode", 396028910);
        setIntField(term67331, term67331.getClass(), "simpleOptionParam", 69607831);
        setIntField(term67331, term67331.getClass(), "adjustTiming", 1571165009);
        setIntField(term67331, term67331.getClass(), "dispTiming", 617144608);
        setIntField(term67331, term67331.getClass(), "timingPos", 2095235044);
        setIntField(term67331, term67331.getClass(), "ansVol", -363902615);
        setIntField(term67331, term67331.getClass(), "noteVol", -100522872);
        setIntField(term67331, term67331.getClass(), "dmgVol", -49359679);
        setIntField(term67331, term67331.getClass(), "appealFlame", 1959538355);
        setIntField(term67331, term67331.getClass(), "isFeverDisp", 2137728302);
        setIntField(term67331, term67331.getClass(), "dispJudge", -1805617761);
        setIntField(term67331, term67331.getClass(), "judgePos", -252123735);
        setIntField(term67331, term67331.getClass(), "ratingGuard", -295928022);
        setIntField(term67331, term67331.getClass(), "selectChara", -95133545);
        setIntField(term67331, term67331.getClass(), "sortType", -313878687);
        setIntField(term67331, term67331.getClass(), "filterGenre", 1545730027);
        setIntField(term67331, term67331.getClass(), "filterLevel", -428895495);
        setIntField(term67331, term67331.getClass(), "filterRank", 1617741210);
        setIntField(term67331, term67331.getClass(), "filterVersion", -1298890160);
        setIntField(term67331, term67331.getClass(), "filterRec", -2070483129);
        setIntField(term67331, term67331.getClass(), "filterFullCombo", -362092120);
        setIntField(term67331, term67331.getClass(), "filterAllPerfect", 1366079057);
        setIntField(term67331, term67331.getClass(), "filterDifficulty", -999926600);
        setIntField(term67331, term67331.getClass(), "filterFullSync", 1395824043);
        setIntField(term67331, term67331.getClass(), "filterReMaster", 573136587);
        setIntField(term67331, term67331.getClass(), "filterMaxFever", 2106974497);
        setIntField(term67331, term67331.getClass(), "finalSelectId", 1608211969);
        setIntField(term67331, term67331.getClass(), "finalSelectCategory", -1494030852);
        term67549 = new Integer(1361581940);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term67549;
        callMethod(klass, "setBreakSe", argTypes, term67331, args);
    }

};


