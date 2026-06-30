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

public class UserOption_toString_78852916792 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79417;

    public UserOption_toString_78852916792() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term79423 = new Long(2209808079059619773L);
        term79417 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption"));
        Object term79419 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term79421 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term79437 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term79438 = newInstance(Class.forName("java.time.LocalDate"));
        Object term79442 = newInstance(Class.forName("java.time.LocalTime"));
        Object term79447 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term79448 = newInstance(Class.forName("java.time.LocalDate"));
        Object term79452 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term79417, term79417.getClass(), "id", -2922851649897789783L);
        setLongField(term79419, term79419.getClass(), "id", 5023047512459111304L);
        setLongField(term79421, term79421.getClass(), "id", 7269420277013840543L);
        setField(term79421, term79421.getClass(), "extId", term79423);
        setField(term79421, term79421.getClass(), "luid", "YZNLZnNFNI");
        setIntField(term79438, term79438.getClass(), "year", 2024);
        setShortField(term79438, term79438.getClass(), "month", (short) 5);
        setShortField(term79438, term79438.getClass(), "day", (short) 8);
        setField(term79437, term79437.getClass(), "date", term79438);
        setByteField(term79442, term79442.getClass(), "hour", (byte) 10);
        setByteField(term79442, term79442.getClass(), "minute", (byte) 21);
        setByteField(term79442, term79442.getClass(), "second", (byte) 1);
        setIntField(term79442, term79442.getClass(), "nano", 912060546);
        setField(term79437, term79437.getClass(), "time", term79442);
        setField(term79421, term79421.getClass(), "registerTime", term79437);
        setIntField(term79448, term79448.getClass(), "year", 2016);
        setShortField(term79448, term79448.getClass(), "month", (short) 1);
        setShortField(term79448, term79448.getClass(), "day", (short) 22);
        setField(term79447, term79447.getClass(), "date", term79448);
        setByteField(term79452, term79452.getClass(), "hour", (byte) 23);
        setByteField(term79452, term79452.getClass(), "minute", (byte) 0);
        setByteField(term79452, term79452.getClass(), "second", (byte) 1);
        setIntField(term79452, term79452.getClass(), "nano", 558329369);
        setField(term79447, term79447.getClass(), "time", term79452);
        setField(term79421, term79421.getClass(), "accessTime", term79447);
        setField(term79419, term79419.getClass(), "card", term79421);
        setIntField(term79419, term79419.getClass(), "lastDataVersion", 200659094);
        setField(term79419, term79419.getClass(), "userName", "uHcUlIseio");
        setIntField(term79419, term79419.getClass(), "point", 1478933339);
        setIntField(term79419, term79419.getClass(), "totalPoint", -1365187159);
        setIntField(term79419, term79419.getClass(), "iconId", -598050030);
        setIntField(term79419, term79419.getClass(), "nameplateId", -2021435874);
        setIntField(term79419, term79419.getClass(), "frameId", -472753268);
        setIntField(term79419, term79419.getClass(), "trophyId", -71568231);
        setIntField(term79419, term79419.getClass(), "playCount", -323433716);
        setIntField(term79419, term79419.getClass(), "playVsCount", 642234337);
        setIntField(term79419, term79419.getClass(), "playSyncCount", 868094454);
        setIntField(term79419, term79419.getClass(), "winCount", -372419681);
        setIntField(term79419, term79419.getClass(), "helpCount", -1558460902);
        setIntField(term79419, term79419.getClass(), "comboCount", 1921138991);
        setIntField(term79419, term79419.getClass(), "feverCount", -528755484);
        setIntField(term79419, term79419.getClass(), "totalHiScore", 2092929808);
        setIntField(term79419, term79419.getClass(), "totalEasyHighScore", -125968267);
        setIntField(term79419, term79419.getClass(), "totalBasicHighScore", -2072312648);
        setIntField(term79419, term79419.getClass(), "totalAdvancedHighScore", -2067197521);
        setIntField(term79419, term79419.getClass(), "totalExpertHighScore", 244892117);
        setIntField(term79419, term79419.getClass(), "totalMasterHighScore", 648802737);
        setIntField(term79419, term79419.getClass(), "totalReMasterHighScore", 1881844545);
        setIntField(term79419, term79419.getClass(), "totalHighSync", -676894877);
        setIntField(term79419, term79419.getClass(), "totalEasySync", -354337478);
        setIntField(term79419, term79419.getClass(), "totalBasicSync", -1590416902);
        setIntField(term79419, term79419.getClass(), "totalAdvancedSync", 100923797);
        setIntField(term79419, term79419.getClass(), "totalExpertSync", -445388895);
        setIntField(term79419, term79419.getClass(), "totalMasterSync", 201796101);
        setIntField(term79419, term79419.getClass(), "totalReMasterSync", 234395553);
        setIntField(term79419, term79419.getClass(), "playerRating", -621067847);
        setIntField(term79419, term79419.getClass(), "highestRating", -1632173626);
        setIntField(term79419, term79419.getClass(), "rankAuthTailId", -1269306678);
        setField(term79419, term79419.getClass(), "eventWatchedDate", "bsmWXOcLZJ");
        setField(term79419, term79419.getClass(), "webLimitDate", "ltTwdndtbe");
        setIntField(term79419, term79419.getClass(), "challengeTrackPhase", 1965424854);
        setIntField(term79419, term79419.getClass(), "firstPlayBits", 888615778);
        setField(term79419, term79419.getClass(), "lastPlayDate", "XaldiIeyMi");
        setIntField(term79419, term79419.getClass(), "lastPlaceId", -1570407348);
        setField(term79419, term79419.getClass(), "lastPlaceName", "lkujDCFpdm");
        setIntField(term79419, term79419.getClass(), "lastRegionId", -1947588739);
        setField(term79419, term79419.getClass(), "lastRegionName", "sGfzmhpQEH");
        setField(term79419, term79419.getClass(), "lastClientId", "FqGkFGXAbg");
        setField(term79419, term79419.getClass(), "lastCountryCode", "SSWEZgFiFO");
        setIntField(term79419, term79419.getClass(), "eventPoint", -1793583689);
        setIntField(term79419, term79419.getClass(), "totalLv", 1536802731);
        setIntField(term79419, term79419.getClass(), "lastLoginBonusDay", 569188464);
        setIntField(term79419, term79419.getClass(), "lastSurvivalBonusDay", -1888994743);
        setIntField(term79419, term79419.getClass(), "loginBonusLv", -1749008759);
        setField(term79417, term79417.getClass(), "user", term79419);
        setIntField(term79417, term79417.getClass(), "soudEffect", 1359414274);
        setIntField(term79417, term79417.getClass(), "mirrorMode", 1978530837);
        setIntField(term79417, term79417.getClass(), "guideSpeed", 1247024543);
        setIntField(term79417, term79417.getClass(), "bgInfo", 1421118020);
        setIntField(term79417, term79417.getClass(), "brightness", -1237618589);
        setIntField(term79417, term79417.getClass(), "isStarRot", 220945896);
        setIntField(term79417, term79417.getClass(), "breakSe", -1084557423);
        setIntField(term79417, term79417.getClass(), "slideSe", -1721728684);
        setIntField(term79417, term79417.getClass(), "hardJudge", -1444832055);
        setIntField(term79417, term79417.getClass(), "isTagJump", -900862013);
        setIntField(term79417, term79417.getClass(), "breakSeVol", -1008697761);
        setIntField(term79417, term79417.getClass(), "slideSeVol", 1747574942);
        setIntField(term79417, term79417.getClass(), "isUpperDisp", -1968471584);
        setIntField(term79417, term79417.getClass(), "trackSkip", 1254265686);
        setIntField(term79417, term79417.getClass(), "optionMode", 105771602);
        setIntField(term79417, term79417.getClass(), "simpleOptionParam", -872972096);
        setIntField(term79417, term79417.getClass(), "adjustTiming", 1715079422);
        setIntField(term79417, term79417.getClass(), "dispTiming", 2006443268);
        setIntField(term79417, term79417.getClass(), "timingPos", 573298888);
        setIntField(term79417, term79417.getClass(), "ansVol", 1336470941);
        setIntField(term79417, term79417.getClass(), "noteVol", 1859725140);
        setIntField(term79417, term79417.getClass(), "dmgVol", -755594998);
        setIntField(term79417, term79417.getClass(), "appealFlame", 114893968);
        setIntField(term79417, term79417.getClass(), "isFeverDisp", -1259245032);
        setIntField(term79417, term79417.getClass(), "dispJudge", 1946548320);
        setIntField(term79417, term79417.getClass(), "judgePos", 1072604902);
        setIntField(term79417, term79417.getClass(), "ratingGuard", 521443191);
        setIntField(term79417, term79417.getClass(), "selectChara", -2081317858);
        setIntField(term79417, term79417.getClass(), "sortType", 521636774);
        setIntField(term79417, term79417.getClass(), "filterGenre", 957822710);
        setIntField(term79417, term79417.getClass(), "filterLevel", 2109876514);
        setIntField(term79417, term79417.getClass(), "filterRank", 420904170);
        setIntField(term79417, term79417.getClass(), "filterVersion", -1514514018);
        setIntField(term79417, term79417.getClass(), "filterRec", 589432414);
        setIntField(term79417, term79417.getClass(), "filterFullCombo", 1352632094);
        setIntField(term79417, term79417.getClass(), "filterAllPerfect", 292956547);
        setIntField(term79417, term79417.getClass(), "filterDifficulty", -92695569);
        setIntField(term79417, term79417.getClass(), "filterFullSync", 1565627695);
        setIntField(term79417, term79417.getClass(), "filterReMaster", -919076299);
        setIntField(term79417, term79417.getClass(), "filterMaxFever", 1129660297);
        setIntField(term79417, term79417.getClass(), "finalSelectId", -275725090);
        setIntField(term79417, term79417.getClass(), "finalSelectCategory", 15479492);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term79417, args);
    }

};


