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

public class UserOption_getIsUpperDisp_204149833815 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55349;

    public UserOption_getIsUpperDisp_204149833815() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term55355 = new Long(3412644969878030772L);
        term55349 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption"));
        Object term55351 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term55353 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term55369 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term55370 = newInstance(Class.forName("java.time.LocalDate"));
        Object term55374 = newInstance(Class.forName("java.time.LocalTime"));
        Object term55379 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term55380 = newInstance(Class.forName("java.time.LocalDate"));
        Object term55384 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term55349, term55349.getClass(), "id", -5903549884298836343L);
        setLongField(term55351, term55351.getClass(), "id", -3058119213533262883L);
        setLongField(term55353, term55353.getClass(), "id", 1950957495500453461L);
        setField(term55353, term55353.getClass(), "extId", term55355);
        setField(term55353, term55353.getClass(), "luid", "vLrTnQTIPg");
        setIntField(term55370, term55370.getClass(), "year", 2026);
        setShortField(term55370, term55370.getClass(), "month", (short) 2);
        setShortField(term55370, term55370.getClass(), "day", (short) 26);
        setField(term55369, term55369.getClass(), "date", term55370);
        setByteField(term55374, term55374.getClass(), "hour", (byte) 12);
        setByteField(term55374, term55374.getClass(), "minute", (byte) 23);
        setByteField(term55374, term55374.getClass(), "second", (byte) 14);
        setIntField(term55374, term55374.getClass(), "nano", 86303611);
        setField(term55369, term55369.getClass(), "time", term55374);
        setField(term55353, term55353.getClass(), "registerTime", term55369);
        setIntField(term55380, term55380.getClass(), "year", 2014);
        setShortField(term55380, term55380.getClass(), "month", (short) 6);
        setShortField(term55380, term55380.getClass(), "day", (short) 12);
        setField(term55379, term55379.getClass(), "date", term55380);
        setByteField(term55384, term55384.getClass(), "hour", (byte) 5);
        setByteField(term55384, term55384.getClass(), "minute", (byte) 4);
        setByteField(term55384, term55384.getClass(), "second", (byte) 20);
        setIntField(term55384, term55384.getClass(), "nano", 169602296);
        setField(term55379, term55379.getClass(), "time", term55384);
        setField(term55353, term55353.getClass(), "accessTime", term55379);
        setField(term55351, term55351.getClass(), "card", term55353);
        setIntField(term55351, term55351.getClass(), "lastDataVersion", 2023713138);
        setField(term55351, term55351.getClass(), "userName", "GsXvLZCFtf");
        setIntField(term55351, term55351.getClass(), "point", -1417229054);
        setIntField(term55351, term55351.getClass(), "totalPoint", 1916815084);
        setIntField(term55351, term55351.getClass(), "iconId", -1194686394);
        setIntField(term55351, term55351.getClass(), "nameplateId", 535352285);
        setIntField(term55351, term55351.getClass(), "frameId", -427127256);
        setIntField(term55351, term55351.getClass(), "trophyId", -1844788019);
        setIntField(term55351, term55351.getClass(), "playCount", 1373587197);
        setIntField(term55351, term55351.getClass(), "playVsCount", 375888422);
        setIntField(term55351, term55351.getClass(), "playSyncCount", 1548760361);
        setIntField(term55351, term55351.getClass(), "winCount", 558749477);
        setIntField(term55351, term55351.getClass(), "helpCount", -1670336590);
        setIntField(term55351, term55351.getClass(), "comboCount", 403038510);
        setIntField(term55351, term55351.getClass(), "feverCount", 1412304335);
        setIntField(term55351, term55351.getClass(), "totalHiScore", 2118050444);
        setIntField(term55351, term55351.getClass(), "totalEasyHighScore", -1079036443);
        setIntField(term55351, term55351.getClass(), "totalBasicHighScore", -1417718040);
        setIntField(term55351, term55351.getClass(), "totalAdvancedHighScore", 18353300);
        setIntField(term55351, term55351.getClass(), "totalExpertHighScore", 1452754173);
        setIntField(term55351, term55351.getClass(), "totalMasterHighScore", 1189377206);
        setIntField(term55351, term55351.getClass(), "totalReMasterHighScore", -748230577);
        setIntField(term55351, term55351.getClass(), "totalHighSync", 1467449226);
        setIntField(term55351, term55351.getClass(), "totalEasySync", 1200062192);
        setIntField(term55351, term55351.getClass(), "totalBasicSync", -380394398);
        setIntField(term55351, term55351.getClass(), "totalAdvancedSync", -1610784102);
        setIntField(term55351, term55351.getClass(), "totalExpertSync", -1370330753);
        setIntField(term55351, term55351.getClass(), "totalMasterSync", 344676776);
        setIntField(term55351, term55351.getClass(), "totalReMasterSync", -1435671539);
        setIntField(term55351, term55351.getClass(), "playerRating", 1697936302);
        setIntField(term55351, term55351.getClass(), "highestRating", 1944775515);
        setIntField(term55351, term55351.getClass(), "rankAuthTailId", -1473667383);
        setField(term55351, term55351.getClass(), "eventWatchedDate", "JqSCTBGSUs");
        setField(term55351, term55351.getClass(), "webLimitDate", "bZrrPiMnsr");
        setIntField(term55351, term55351.getClass(), "challengeTrackPhase", -19932223);
        setIntField(term55351, term55351.getClass(), "firstPlayBits", 1845280212);
        setField(term55351, term55351.getClass(), "lastPlayDate", "IeromvfDmz");
        setIntField(term55351, term55351.getClass(), "lastPlaceId", -308191283);
        setField(term55351, term55351.getClass(), "lastPlaceName", "xJLHPTRSqe");
        setIntField(term55351, term55351.getClass(), "lastRegionId", -1623247571);
        setField(term55351, term55351.getClass(), "lastRegionName", "OIFZYdbUZz");
        setField(term55351, term55351.getClass(), "lastClientId", "FPablxseTr");
        setField(term55351, term55351.getClass(), "lastCountryCode", "wNndrIQDbr");
        setIntField(term55351, term55351.getClass(), "eventPoint", 43547318);
        setIntField(term55351, term55351.getClass(), "totalLv", -323685716);
        setIntField(term55351, term55351.getClass(), "lastLoginBonusDay", -630584026);
        setIntField(term55351, term55351.getClass(), "lastSurvivalBonusDay", -383863049);
        setIntField(term55351, term55351.getClass(), "loginBonusLv", -1172515373);
        setField(term55349, term55349.getClass(), "user", term55351);
        setIntField(term55349, term55349.getClass(), "soudEffect", 997927264);
        setIntField(term55349, term55349.getClass(), "mirrorMode", 2027000196);
        setIntField(term55349, term55349.getClass(), "guideSpeed", 969594087);
        setIntField(term55349, term55349.getClass(), "bgInfo", -1821087116);
        setIntField(term55349, term55349.getClass(), "brightness", 1300292635);
        setIntField(term55349, term55349.getClass(), "isStarRot", -476484302);
        setIntField(term55349, term55349.getClass(), "breakSe", 1763908335);
        setIntField(term55349, term55349.getClass(), "slideSe", -1248507539);
        setIntField(term55349, term55349.getClass(), "hardJudge", 1066760380);
        setIntField(term55349, term55349.getClass(), "isTagJump", -1800908977);
        setIntField(term55349, term55349.getClass(), "breakSeVol", -146806266);
        setIntField(term55349, term55349.getClass(), "slideSeVol", 627174991);
        setIntField(term55349, term55349.getClass(), "isUpperDisp", -115224377);
        setIntField(term55349, term55349.getClass(), "trackSkip", -1415575379);
        setIntField(term55349, term55349.getClass(), "optionMode", 1957935933);
        setIntField(term55349, term55349.getClass(), "simpleOptionParam", -98122007);
        setIntField(term55349, term55349.getClass(), "adjustTiming", -1291078501);
        setIntField(term55349, term55349.getClass(), "dispTiming", -31110918);
        setIntField(term55349, term55349.getClass(), "timingPos", 2050293775);
        setIntField(term55349, term55349.getClass(), "ansVol", 367669009);
        setIntField(term55349, term55349.getClass(), "noteVol", 1587942890);
        setIntField(term55349, term55349.getClass(), "dmgVol", 168004133);
        setIntField(term55349, term55349.getClass(), "appealFlame", -1080740868);
        setIntField(term55349, term55349.getClass(), "isFeverDisp", 1926882468);
        setIntField(term55349, term55349.getClass(), "dispJudge", 1597443428);
        setIntField(term55349, term55349.getClass(), "judgePos", 1327091194);
        setIntField(term55349, term55349.getClass(), "ratingGuard", 589230936);
        setIntField(term55349, term55349.getClass(), "selectChara", -1303562294);
        setIntField(term55349, term55349.getClass(), "sortType", -604799051);
        setIntField(term55349, term55349.getClass(), "filterGenre", -157085169);
        setIntField(term55349, term55349.getClass(), "filterLevel", -1984025761);
        setIntField(term55349, term55349.getClass(), "filterRank", 1401125758);
        setIntField(term55349, term55349.getClass(), "filterVersion", 1507564978);
        setIntField(term55349, term55349.getClass(), "filterRec", -1187537437);
        setIntField(term55349, term55349.getClass(), "filterFullCombo", 988985229);
        setIntField(term55349, term55349.getClass(), "filterAllPerfect", -1262847411);
        setIntField(term55349, term55349.getClass(), "filterDifficulty", -69028914);
        setIntField(term55349, term55349.getClass(), "filterFullSync", -887976125);
        setIntField(term55349, term55349.getClass(), "filterReMaster", 448725036);
        setIntField(term55349, term55349.getClass(), "filterMaxFever", -1464798371);
        setIntField(term55349, term55349.getClass(), "finalSelectId", 528481490);
        setIntField(term55349, term55349.getClass(), "finalSelectCategory", -117880593);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIsUpperDisp", argTypes, term55349, args);
    }

};


