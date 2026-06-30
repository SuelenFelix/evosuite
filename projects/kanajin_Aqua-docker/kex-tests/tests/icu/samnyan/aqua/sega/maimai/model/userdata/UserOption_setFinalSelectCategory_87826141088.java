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

public class UserOption_setFinalSelectCategory_87826141088 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78181;
     Object term78399;

    public UserOption_setFinalSelectCategory_87826141088() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term78187 = new Long(8708846223293804408L);
        term78181 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption"));
        Object term78183 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term78185 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term78201 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term78202 = newInstance(Class.forName("java.time.LocalDate"));
        Object term78206 = newInstance(Class.forName("java.time.LocalTime"));
        Object term78211 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term78212 = newInstance(Class.forName("java.time.LocalDate"));
        Object term78216 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term78181, term78181.getClass(), "id", 5646422912118770408L);
        setLongField(term78183, term78183.getClass(), "id", 1370021222113276207L);
        setLongField(term78185, term78185.getClass(), "id", 2671083699707412572L);
        setField(term78185, term78185.getClass(), "extId", term78187);
        setField(term78185, term78185.getClass(), "luid", "mXVgkxjTjD");
        setIntField(term78202, term78202.getClass(), "year", 2015);
        setShortField(term78202, term78202.getClass(), "month", (short) 10);
        setShortField(term78202, term78202.getClass(), "day", (short) 4);
        setField(term78201, term78201.getClass(), "date", term78202);
        setByteField(term78206, term78206.getClass(), "hour", (byte) 4);
        setByteField(term78206, term78206.getClass(), "minute", (byte) 28);
        setByteField(term78206, term78206.getClass(), "second", (byte) 5);
        setIntField(term78206, term78206.getClass(), "nano", 457950228);
        setField(term78201, term78201.getClass(), "time", term78206);
        setField(term78185, term78185.getClass(), "registerTime", term78201);
        setIntField(term78212, term78212.getClass(), "year", 2017);
        setShortField(term78212, term78212.getClass(), "month", (short) 2);
        setShortField(term78212, term78212.getClass(), "day", (short) 8);
        setField(term78211, term78211.getClass(), "date", term78212);
        setByteField(term78216, term78216.getClass(), "hour", (byte) 12);
        setByteField(term78216, term78216.getClass(), "minute", (byte) 5);
        setByteField(term78216, term78216.getClass(), "second", (byte) 46);
        setIntField(term78216, term78216.getClass(), "nano", 847487783);
        setField(term78211, term78211.getClass(), "time", term78216);
        setField(term78185, term78185.getClass(), "accessTime", term78211);
        setField(term78183, term78183.getClass(), "card", term78185);
        setIntField(term78183, term78183.getClass(), "lastDataVersion", 1794533150);
        setField(term78183, term78183.getClass(), "userName", "qodBmKUkev");
        setIntField(term78183, term78183.getClass(), "point", 1439937964);
        setIntField(term78183, term78183.getClass(), "totalPoint", 396099571);
        setIntField(term78183, term78183.getClass(), "iconId", 27502386);
        setIntField(term78183, term78183.getClass(), "nameplateId", -1896431724);
        setIntField(term78183, term78183.getClass(), "frameId", 1369021992);
        setIntField(term78183, term78183.getClass(), "trophyId", 1377583451);
        setIntField(term78183, term78183.getClass(), "playCount", -1325246237);
        setIntField(term78183, term78183.getClass(), "playVsCount", 1255513875);
        setIntField(term78183, term78183.getClass(), "playSyncCount", -1516283725);
        setIntField(term78183, term78183.getClass(), "winCount", -707995578);
        setIntField(term78183, term78183.getClass(), "helpCount", 543654400);
        setIntField(term78183, term78183.getClass(), "comboCount", 894504879);
        setIntField(term78183, term78183.getClass(), "feverCount", -692731433);
        setIntField(term78183, term78183.getClass(), "totalHiScore", -239715972);
        setIntField(term78183, term78183.getClass(), "totalEasyHighScore", -1397849483);
        setIntField(term78183, term78183.getClass(), "totalBasicHighScore", 54409547);
        setIntField(term78183, term78183.getClass(), "totalAdvancedHighScore", -703207529);
        setIntField(term78183, term78183.getClass(), "totalExpertHighScore", -48362230);
        setIntField(term78183, term78183.getClass(), "totalMasterHighScore", -1592415080);
        setIntField(term78183, term78183.getClass(), "totalReMasterHighScore", -840627688);
        setIntField(term78183, term78183.getClass(), "totalHighSync", 561930657);
        setIntField(term78183, term78183.getClass(), "totalEasySync", -919309210);
        setIntField(term78183, term78183.getClass(), "totalBasicSync", 741964410);
        setIntField(term78183, term78183.getClass(), "totalAdvancedSync", 357524316);
        setIntField(term78183, term78183.getClass(), "totalExpertSync", 500267199);
        setIntField(term78183, term78183.getClass(), "totalMasterSync", 1154289365);
        setIntField(term78183, term78183.getClass(), "totalReMasterSync", 335365247);
        setIntField(term78183, term78183.getClass(), "playerRating", 383241844);
        setIntField(term78183, term78183.getClass(), "highestRating", -2144743021);
        setIntField(term78183, term78183.getClass(), "rankAuthTailId", 1098473489);
        setField(term78183, term78183.getClass(), "eventWatchedDate", "QJuqwUQEyr");
        setField(term78183, term78183.getClass(), "webLimitDate", "qqUAzxxpNB");
        setIntField(term78183, term78183.getClass(), "challengeTrackPhase", 825249073);
        setIntField(term78183, term78183.getClass(), "firstPlayBits", 2055208476);
        setField(term78183, term78183.getClass(), "lastPlayDate", "WqaQxuPbzr");
        setIntField(term78183, term78183.getClass(), "lastPlaceId", -159215997);
        setField(term78183, term78183.getClass(), "lastPlaceName", "bjLZqJqmnv");
        setIntField(term78183, term78183.getClass(), "lastRegionId", 915438885);
        setField(term78183, term78183.getClass(), "lastRegionName", "TPbMBzbcHs");
        setField(term78183, term78183.getClass(), "lastClientId", "spkDvqsOhJ");
        setField(term78183, term78183.getClass(), "lastCountryCode", "faFVBESzWc");
        setIntField(term78183, term78183.getClass(), "eventPoint", 2035758672);
        setIntField(term78183, term78183.getClass(), "totalLv", -1017667604);
        setIntField(term78183, term78183.getClass(), "lastLoginBonusDay", 23796977);
        setIntField(term78183, term78183.getClass(), "lastSurvivalBonusDay", -1056300132);
        setIntField(term78183, term78183.getClass(), "loginBonusLv", -756075731);
        setField(term78181, term78181.getClass(), "user", term78183);
        setIntField(term78181, term78181.getClass(), "soudEffect", 1287668261);
        setIntField(term78181, term78181.getClass(), "mirrorMode", -1827790417);
        setIntField(term78181, term78181.getClass(), "guideSpeed", 617717466);
        setIntField(term78181, term78181.getClass(), "bgInfo", -805204937);
        setIntField(term78181, term78181.getClass(), "brightness", -404532819);
        setIntField(term78181, term78181.getClass(), "isStarRot", -1068091214);
        setIntField(term78181, term78181.getClass(), "breakSe", -1885921336);
        setIntField(term78181, term78181.getClass(), "slideSe", 959662038);
        setIntField(term78181, term78181.getClass(), "hardJudge", -1636076456);
        setIntField(term78181, term78181.getClass(), "isTagJump", -965575676);
        setIntField(term78181, term78181.getClass(), "breakSeVol", -2073269577);
        setIntField(term78181, term78181.getClass(), "slideSeVol", -1444541321);
        setIntField(term78181, term78181.getClass(), "isUpperDisp", 2053292904);
        setIntField(term78181, term78181.getClass(), "trackSkip", 883426815);
        setIntField(term78181, term78181.getClass(), "optionMode", 82050941);
        setIntField(term78181, term78181.getClass(), "simpleOptionParam", 1237094375);
        setIntField(term78181, term78181.getClass(), "adjustTiming", -127161769);
        setIntField(term78181, term78181.getClass(), "dispTiming", -8592713);
        setIntField(term78181, term78181.getClass(), "timingPos", 2117607396);
        setIntField(term78181, term78181.getClass(), "ansVol", 1915103204);
        setIntField(term78181, term78181.getClass(), "noteVol", -1994232365);
        setIntField(term78181, term78181.getClass(), "dmgVol", 572269752);
        setIntField(term78181, term78181.getClass(), "appealFlame", -1720625083);
        setIntField(term78181, term78181.getClass(), "isFeverDisp", 481972209);
        setIntField(term78181, term78181.getClass(), "dispJudge", -9330935);
        setIntField(term78181, term78181.getClass(), "judgePos", -1264971535);
        setIntField(term78181, term78181.getClass(), "ratingGuard", 316305007);
        setIntField(term78181, term78181.getClass(), "selectChara", -1167706006);
        setIntField(term78181, term78181.getClass(), "sortType", 1543765797);
        setIntField(term78181, term78181.getClass(), "filterGenre", -1397058066);
        setIntField(term78181, term78181.getClass(), "filterLevel", 428464844);
        setIntField(term78181, term78181.getClass(), "filterRank", 1224454871);
        setIntField(term78181, term78181.getClass(), "filterVersion", 417503001);
        setIntField(term78181, term78181.getClass(), "filterRec", -95714739);
        setIntField(term78181, term78181.getClass(), "filterFullCombo", 967258054);
        setIntField(term78181, term78181.getClass(), "filterAllPerfect", 1976700804);
        setIntField(term78181, term78181.getClass(), "filterDifficulty", 192284574);
        setIntField(term78181, term78181.getClass(), "filterFullSync", 726085226);
        setIntField(term78181, term78181.getClass(), "filterReMaster", -308997274);
        setIntField(term78181, term78181.getClass(), "filterMaxFever", 2115944528);
        setIntField(term78181, term78181.getClass(), "finalSelectId", 2147374456);
        setIntField(term78181, term78181.getClass(), "finalSelectCategory", 101420380);
        term78399 = new Integer(-108089538);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term78399;
        callMethod(klass, "setFinalSelectCategory", argTypes, term78181, args);
    }

};


