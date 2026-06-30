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

public class UserOption_getSimpleOptionParam_181861812618 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56273;

    public UserOption_getSimpleOptionParam_181861812618() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term56279 = new Long(-433040798405298080L);
        term56273 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption"));
        Object term56275 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term56277 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term56293 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term56294 = newInstance(Class.forName("java.time.LocalDate"));
        Object term56298 = newInstance(Class.forName("java.time.LocalTime"));
        Object term56303 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term56304 = newInstance(Class.forName("java.time.LocalDate"));
        Object term56308 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term56273, term56273.getClass(), "id", 6542357174275680335L);
        setLongField(term56275, term56275.getClass(), "id", 206360660645917003L);
        setLongField(term56277, term56277.getClass(), "id", 8680715663951713735L);
        setField(term56277, term56277.getClass(), "extId", term56279);
        setField(term56277, term56277.getClass(), "luid", "SvSKSCjgTM");
        setIntField(term56294, term56294.getClass(), "year", 2020);
        setShortField(term56294, term56294.getClass(), "month", (short) 10);
        setShortField(term56294, term56294.getClass(), "day", (short) 10);
        setField(term56293, term56293.getClass(), "date", term56294);
        setByteField(term56298, term56298.getClass(), "hour", (byte) 8);
        setByteField(term56298, term56298.getClass(), "minute", (byte) 35);
        setByteField(term56298, term56298.getClass(), "second", (byte) 54);
        setIntField(term56298, term56298.getClass(), "nano", 115111505);
        setField(term56293, term56293.getClass(), "time", term56298);
        setField(term56277, term56277.getClass(), "registerTime", term56293);
        setIntField(term56304, term56304.getClass(), "year", 2017);
        setShortField(term56304, term56304.getClass(), "month", (short) 10);
        setShortField(term56304, term56304.getClass(), "day", (short) 24);
        setField(term56303, term56303.getClass(), "date", term56304);
        setByteField(term56308, term56308.getClass(), "hour", (byte) 21);
        setByteField(term56308, term56308.getClass(), "minute", (byte) 10);
        setByteField(term56308, term56308.getClass(), "second", (byte) 20);
        setIntField(term56308, term56308.getClass(), "nano", 736076804);
        setField(term56303, term56303.getClass(), "time", term56308);
        setField(term56277, term56277.getClass(), "accessTime", term56303);
        setField(term56275, term56275.getClass(), "card", term56277);
        setIntField(term56275, term56275.getClass(), "lastDataVersion", 1087029364);
        setField(term56275, term56275.getClass(), "userName", "UFxnRbWtog");
        setIntField(term56275, term56275.getClass(), "point", 862581532);
        setIntField(term56275, term56275.getClass(), "totalPoint", -1973508048);
        setIntField(term56275, term56275.getClass(), "iconId", 1749871768);
        setIntField(term56275, term56275.getClass(), "nameplateId", 1267245359);
        setIntField(term56275, term56275.getClass(), "frameId", -487049656);
        setIntField(term56275, term56275.getClass(), "trophyId", -971073075);
        setIntField(term56275, term56275.getClass(), "playCount", -1888637904);
        setIntField(term56275, term56275.getClass(), "playVsCount", 564828352);
        setIntField(term56275, term56275.getClass(), "playSyncCount", 1355977590);
        setIntField(term56275, term56275.getClass(), "winCount", 1151839814);
        setIntField(term56275, term56275.getClass(), "helpCount", 928463816);
        setIntField(term56275, term56275.getClass(), "comboCount", 800632148);
        setIntField(term56275, term56275.getClass(), "feverCount", 979506554);
        setIntField(term56275, term56275.getClass(), "totalHiScore", 1291963778);
        setIntField(term56275, term56275.getClass(), "totalEasyHighScore", -1370168960);
        setIntField(term56275, term56275.getClass(), "totalBasicHighScore", 214661063);
        setIntField(term56275, term56275.getClass(), "totalAdvancedHighScore", -1712764742);
        setIntField(term56275, term56275.getClass(), "totalExpertHighScore", 1102291792);
        setIntField(term56275, term56275.getClass(), "totalMasterHighScore", -1173378523);
        setIntField(term56275, term56275.getClass(), "totalReMasterHighScore", 1809390829);
        setIntField(term56275, term56275.getClass(), "totalHighSync", 1035721712);
        setIntField(term56275, term56275.getClass(), "totalEasySync", 714222306);
        setIntField(term56275, term56275.getClass(), "totalBasicSync", -483982962);
        setIntField(term56275, term56275.getClass(), "totalAdvancedSync", -1731721170);
        setIntField(term56275, term56275.getClass(), "totalExpertSync", 893978926);
        setIntField(term56275, term56275.getClass(), "totalMasterSync", -1002898053);
        setIntField(term56275, term56275.getClass(), "totalReMasterSync", -938480312);
        setIntField(term56275, term56275.getClass(), "playerRating", -1755694249);
        setIntField(term56275, term56275.getClass(), "highestRating", -730526942);
        setIntField(term56275, term56275.getClass(), "rankAuthTailId", 1596741735);
        setField(term56275, term56275.getClass(), "eventWatchedDate", "NSxzAUSujy");
        setField(term56275, term56275.getClass(), "webLimitDate", "FEezgglqXC");
        setIntField(term56275, term56275.getClass(), "challengeTrackPhase", -992293515);
        setIntField(term56275, term56275.getClass(), "firstPlayBits", -941799505);
        setField(term56275, term56275.getClass(), "lastPlayDate", "rvYqMRgiPA");
        setIntField(term56275, term56275.getClass(), "lastPlaceId", -490855781);
        setField(term56275, term56275.getClass(), "lastPlaceName", "qOZXeUUmdz");
        setIntField(term56275, term56275.getClass(), "lastRegionId", -1019146708);
        setField(term56275, term56275.getClass(), "lastRegionName", "FCovVZHqPx");
        setField(term56275, term56275.getClass(), "lastClientId", "jSTBfkWjge");
        setField(term56275, term56275.getClass(), "lastCountryCode", "uKYhZULSHp");
        setIntField(term56275, term56275.getClass(), "eventPoint", -1659254800);
        setIntField(term56275, term56275.getClass(), "totalLv", 1069040713);
        setIntField(term56275, term56275.getClass(), "lastLoginBonusDay", -932319157);
        setIntField(term56275, term56275.getClass(), "lastSurvivalBonusDay", 2096486142);
        setIntField(term56275, term56275.getClass(), "loginBonusLv", 1814053301);
        setField(term56273, term56273.getClass(), "user", term56275);
        setIntField(term56273, term56273.getClass(), "soudEffect", -1145940584);
        setIntField(term56273, term56273.getClass(), "mirrorMode", 1759520462);
        setIntField(term56273, term56273.getClass(), "guideSpeed", -450055049);
        setIntField(term56273, term56273.getClass(), "bgInfo", -2139747712);
        setIntField(term56273, term56273.getClass(), "brightness", -60712376);
        setIntField(term56273, term56273.getClass(), "isStarRot", 1374935274);
        setIntField(term56273, term56273.getClass(), "breakSe", 1063935111);
        setIntField(term56273, term56273.getClass(), "slideSe", 1742675635);
        setIntField(term56273, term56273.getClass(), "hardJudge", 1406898507);
        setIntField(term56273, term56273.getClass(), "isTagJump", -28514280);
        setIntField(term56273, term56273.getClass(), "breakSeVol", 313319336);
        setIntField(term56273, term56273.getClass(), "slideSeVol", -335338628);
        setIntField(term56273, term56273.getClass(), "isUpperDisp", 1539132721);
        setIntField(term56273, term56273.getClass(), "trackSkip", -564177085);
        setIntField(term56273, term56273.getClass(), "optionMode", 1951006294);
        setIntField(term56273, term56273.getClass(), "simpleOptionParam", 315490614);
        setIntField(term56273, term56273.getClass(), "adjustTiming", -181204804);
        setIntField(term56273, term56273.getClass(), "dispTiming", 2073462223);
        setIntField(term56273, term56273.getClass(), "timingPos", 509141438);
        setIntField(term56273, term56273.getClass(), "ansVol", 55918608);
        setIntField(term56273, term56273.getClass(), "noteVol", 1863053491);
        setIntField(term56273, term56273.getClass(), "dmgVol", 1569101532);
        setIntField(term56273, term56273.getClass(), "appealFlame", -1825428555);
        setIntField(term56273, term56273.getClass(), "isFeverDisp", 2124679916);
        setIntField(term56273, term56273.getClass(), "dispJudge", -1587529994);
        setIntField(term56273, term56273.getClass(), "judgePos", -214529845);
        setIntField(term56273, term56273.getClass(), "ratingGuard", 684495339);
        setIntField(term56273, term56273.getClass(), "selectChara", 361364617);
        setIntField(term56273, term56273.getClass(), "sortType", -132332846);
        setIntField(term56273, term56273.getClass(), "filterGenre", -160055040);
        setIntField(term56273, term56273.getClass(), "filterLevel", 7043168);
        setIntField(term56273, term56273.getClass(), "filterRank", 2007440099);
        setIntField(term56273, term56273.getClass(), "filterVersion", 1462309526);
        setIntField(term56273, term56273.getClass(), "filterRec", -451407895);
        setIntField(term56273, term56273.getClass(), "filterFullCombo", -1132970218);
        setIntField(term56273, term56273.getClass(), "filterAllPerfect", -693000999);
        setIntField(term56273, term56273.getClass(), "filterDifficulty", -518970778);
        setIntField(term56273, term56273.getClass(), "filterFullSync", -534810305);
        setIntField(term56273, term56273.getClass(), "filterReMaster", 1052129031);
        setIntField(term56273, term56273.getClass(), "filterMaxFever", -107440624);
        setIntField(term56273, term56273.getClass(), "finalSelectId", 1835428942);
        setIntField(term56273, term56273.getClass(), "finalSelectCategory", -1551168372);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSimpleOptionParam", argTypes, term56273, args);
    }

};


