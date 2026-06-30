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

public class UserOption_getRatingGuard_101989912029 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59661;

    public UserOption_getRatingGuard_101989912029() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term59667 = new Long(-2338103433822116635L);
        term59661 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption"));
        Object term59663 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term59665 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term59681 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term59682 = newInstance(Class.forName("java.time.LocalDate"));
        Object term59686 = newInstance(Class.forName("java.time.LocalTime"));
        Object term59691 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term59692 = newInstance(Class.forName("java.time.LocalDate"));
        Object term59696 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term59661, term59661.getClass(), "id", 6695041041196724237L);
        setLongField(term59663, term59663.getClass(), "id", -9133417318192430290L);
        setLongField(term59665, term59665.getClass(), "id", 3447455321955655601L);
        setField(term59665, term59665.getClass(), "extId", term59667);
        setField(term59665, term59665.getClass(), "luid", "akVNsUcFra");
        setIntField(term59682, term59682.getClass(), "year", 2010);
        setShortField(term59682, term59682.getClass(), "month", (short) 2);
        setShortField(term59682, term59682.getClass(), "day", (short) 22);
        setField(term59681, term59681.getClass(), "date", term59682);
        setByteField(term59686, term59686.getClass(), "hour", (byte) 10);
        setByteField(term59686, term59686.getClass(), "minute", (byte) 57);
        setByteField(term59686, term59686.getClass(), "second", (byte) 47);
        setIntField(term59686, term59686.getClass(), "nano", 236871229);
        setField(term59681, term59681.getClass(), "time", term59686);
        setField(term59665, term59665.getClass(), "registerTime", term59681);
        setIntField(term59692, term59692.getClass(), "year", 2028);
        setShortField(term59692, term59692.getClass(), "month", (short) 10);
        setShortField(term59692, term59692.getClass(), "day", (short) 4);
        setField(term59691, term59691.getClass(), "date", term59692);
        setByteField(term59696, term59696.getClass(), "hour", (byte) 7);
        setByteField(term59696, term59696.getClass(), "minute", (byte) 45);
        setByteField(term59696, term59696.getClass(), "second", (byte) 52);
        setIntField(term59696, term59696.getClass(), "nano", 886309979);
        setField(term59691, term59691.getClass(), "time", term59696);
        setField(term59665, term59665.getClass(), "accessTime", term59691);
        setField(term59663, term59663.getClass(), "card", term59665);
        setIntField(term59663, term59663.getClass(), "lastDataVersion", 376569110);
        setField(term59663, term59663.getClass(), "userName", "BKiHMTzLoY");
        setIntField(term59663, term59663.getClass(), "point", -366233083);
        setIntField(term59663, term59663.getClass(), "totalPoint", -1586250649);
        setIntField(term59663, term59663.getClass(), "iconId", 714204805);
        setIntField(term59663, term59663.getClass(), "nameplateId", -1539644001);
        setIntField(term59663, term59663.getClass(), "frameId", 1694021329);
        setIntField(term59663, term59663.getClass(), "trophyId", -340695215);
        setIntField(term59663, term59663.getClass(), "playCount", -965593105);
        setIntField(term59663, term59663.getClass(), "playVsCount", -1713765557);
        setIntField(term59663, term59663.getClass(), "playSyncCount", -100503999);
        setIntField(term59663, term59663.getClass(), "winCount", -1152780010);
        setIntField(term59663, term59663.getClass(), "helpCount", 1773328262);
        setIntField(term59663, term59663.getClass(), "comboCount", 1076156036);
        setIntField(term59663, term59663.getClass(), "feverCount", 497222104);
        setIntField(term59663, term59663.getClass(), "totalHiScore", -422135580);
        setIntField(term59663, term59663.getClass(), "totalEasyHighScore", -1726471303);
        setIntField(term59663, term59663.getClass(), "totalBasicHighScore", 1563484306);
        setIntField(term59663, term59663.getClass(), "totalAdvancedHighScore", -1064532569);
        setIntField(term59663, term59663.getClass(), "totalExpertHighScore", 1894908411);
        setIntField(term59663, term59663.getClass(), "totalMasterHighScore", 1128957140);
        setIntField(term59663, term59663.getClass(), "totalReMasterHighScore", 1975880274);
        setIntField(term59663, term59663.getClass(), "totalHighSync", 1216213747);
        setIntField(term59663, term59663.getClass(), "totalEasySync", -428741760);
        setIntField(term59663, term59663.getClass(), "totalBasicSync", 570973373);
        setIntField(term59663, term59663.getClass(), "totalAdvancedSync", -1116126684);
        setIntField(term59663, term59663.getClass(), "totalExpertSync", 713171221);
        setIntField(term59663, term59663.getClass(), "totalMasterSync", -922412655);
        setIntField(term59663, term59663.getClass(), "totalReMasterSync", 422773242);
        setIntField(term59663, term59663.getClass(), "playerRating", 1756235049);
        setIntField(term59663, term59663.getClass(), "highestRating", 1252714657);
        setIntField(term59663, term59663.getClass(), "rankAuthTailId", 279120793);
        setField(term59663, term59663.getClass(), "eventWatchedDate", "arrHHpXCBD");
        setField(term59663, term59663.getClass(), "webLimitDate", "zzfzxQYlis");
        setIntField(term59663, term59663.getClass(), "challengeTrackPhase", 1198494389);
        setIntField(term59663, term59663.getClass(), "firstPlayBits", -1775188050);
        setField(term59663, term59663.getClass(), "lastPlayDate", "TJJQwVEzxz");
        setIntField(term59663, term59663.getClass(), "lastPlaceId", -1883712310);
        setField(term59663, term59663.getClass(), "lastPlaceName", "kHtEHBrsFo");
        setIntField(term59663, term59663.getClass(), "lastRegionId", -209552412);
        setField(term59663, term59663.getClass(), "lastRegionName", "EmAvkhGlPV");
        setField(term59663, term59663.getClass(), "lastClientId", "mBrbyQVzve");
        setField(term59663, term59663.getClass(), "lastCountryCode", "FQODEbQeKa");
        setIntField(term59663, term59663.getClass(), "eventPoint", -128147837);
        setIntField(term59663, term59663.getClass(), "totalLv", -628985630);
        setIntField(term59663, term59663.getClass(), "lastLoginBonusDay", -448657659);
        setIntField(term59663, term59663.getClass(), "lastSurvivalBonusDay", -732060555);
        setIntField(term59663, term59663.getClass(), "loginBonusLv", -1192629086);
        setField(term59661, term59661.getClass(), "user", term59663);
        setIntField(term59661, term59661.getClass(), "soudEffect", -2079826481);
        setIntField(term59661, term59661.getClass(), "mirrorMode", 720449771);
        setIntField(term59661, term59661.getClass(), "guideSpeed", -889881321);
        setIntField(term59661, term59661.getClass(), "bgInfo", -210771326);
        setIntField(term59661, term59661.getClass(), "brightness", 281911175);
        setIntField(term59661, term59661.getClass(), "isStarRot", 1704970339);
        setIntField(term59661, term59661.getClass(), "breakSe", 1614956209);
        setIntField(term59661, term59661.getClass(), "slideSe", -151499130);
        setIntField(term59661, term59661.getClass(), "hardJudge", -1822594915);
        setIntField(term59661, term59661.getClass(), "isTagJump", 1838995967);
        setIntField(term59661, term59661.getClass(), "breakSeVol", 265353182);
        setIntField(term59661, term59661.getClass(), "slideSeVol", 1812110091);
        setIntField(term59661, term59661.getClass(), "isUpperDisp", 802315735);
        setIntField(term59661, term59661.getClass(), "trackSkip", 1856249254);
        setIntField(term59661, term59661.getClass(), "optionMode", -5087555);
        setIntField(term59661, term59661.getClass(), "simpleOptionParam", -2060866136);
        setIntField(term59661, term59661.getClass(), "adjustTiming", -1547846111);
        setIntField(term59661, term59661.getClass(), "dispTiming", -534826636);
        setIntField(term59661, term59661.getClass(), "timingPos", 1364855812);
        setIntField(term59661, term59661.getClass(), "ansVol", -1011747145);
        setIntField(term59661, term59661.getClass(), "noteVol", 1581553091);
        setIntField(term59661, term59661.getClass(), "dmgVol", 1367678685);
        setIntField(term59661, term59661.getClass(), "appealFlame", -317170853);
        setIntField(term59661, term59661.getClass(), "isFeverDisp", -1016433388);
        setIntField(term59661, term59661.getClass(), "dispJudge", -385847082);
        setIntField(term59661, term59661.getClass(), "judgePos", 222989848);
        setIntField(term59661, term59661.getClass(), "ratingGuard", -927191833);
        setIntField(term59661, term59661.getClass(), "selectChara", 112439844);
        setIntField(term59661, term59661.getClass(), "sortType", -652984076);
        setIntField(term59661, term59661.getClass(), "filterGenre", 1595362234);
        setIntField(term59661, term59661.getClass(), "filterLevel", 1302209572);
        setIntField(term59661, term59661.getClass(), "filterRank", 1194064409);
        setIntField(term59661, term59661.getClass(), "filterVersion", -1178768850);
        setIntField(term59661, term59661.getClass(), "filterRec", 1310459040);
        setIntField(term59661, term59661.getClass(), "filterFullCombo", -1541373961);
        setIntField(term59661, term59661.getClass(), "filterAllPerfect", 28333171);
        setIntField(term59661, term59661.getClass(), "filterDifficulty", 431237954);
        setIntField(term59661, term59661.getClass(), "filterFullSync", 346905618);
        setIntField(term59661, term59661.getClass(), "filterReMaster", -1748246525);
        setIntField(term59661, term59661.getClass(), "filterMaxFever", 827719881);
        setIntField(term59661, term59661.getClass(), "finalSelectId", 1244517645);
        setIntField(term59661, term59661.getClass(), "finalSelectCategory", 687325220);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRatingGuard", argTypes, term59661, args);
    }

};


