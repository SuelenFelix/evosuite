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

public class UserOption_getSlideSe_29059639510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53809;

    public UserOption_getSlideSe_29059639510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term53815 = new Long(-1677189124507026637L);
        term53809 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption"));
        Object term53811 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term53813 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term53829 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term53830 = newInstance(Class.forName("java.time.LocalDate"));
        Object term53834 = newInstance(Class.forName("java.time.LocalTime"));
        Object term53839 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term53840 = newInstance(Class.forName("java.time.LocalDate"));
        Object term53844 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term53809, term53809.getClass(), "id", -599981502351912419L);
        setLongField(term53811, term53811.getClass(), "id", 8171709541116491249L);
        setLongField(term53813, term53813.getClass(), "id", 1867943942587005261L);
        setField(term53813, term53813.getClass(), "extId", term53815);
        setField(term53813, term53813.getClass(), "luid", "CJlAiZDIQO");
        setIntField(term53830, term53830.getClass(), "year", 2024);
        setShortField(term53830, term53830.getClass(), "month", (short) 11);
        setShortField(term53830, term53830.getClass(), "day", (short) 16);
        setField(term53829, term53829.getClass(), "date", term53830);
        setByteField(term53834, term53834.getClass(), "hour", (byte) 23);
        setByteField(term53834, term53834.getClass(), "minute", (byte) 40);
        setByteField(term53834, term53834.getClass(), "second", (byte) 40);
        setIntField(term53834, term53834.getClass(), "nano", 810133212);
        setField(term53829, term53829.getClass(), "time", term53834);
        setField(term53813, term53813.getClass(), "registerTime", term53829);
        setIntField(term53840, term53840.getClass(), "year", 2018);
        setShortField(term53840, term53840.getClass(), "month", (short) 5);
        setShortField(term53840, term53840.getClass(), "day", (short) 15);
        setField(term53839, term53839.getClass(), "date", term53840);
        setByteField(term53844, term53844.getClass(), "hour", (byte) 17);
        setByteField(term53844, term53844.getClass(), "minute", (byte) 19);
        setByteField(term53844, term53844.getClass(), "second", (byte) 28);
        setIntField(term53844, term53844.getClass(), "nano", 153049369);
        setField(term53839, term53839.getClass(), "time", term53844);
        setField(term53813, term53813.getClass(), "accessTime", term53839);
        setField(term53811, term53811.getClass(), "card", term53813);
        setIntField(term53811, term53811.getClass(), "lastDataVersion", 342864345);
        setField(term53811, term53811.getClass(), "userName", "osgWaTBVoE");
        setIntField(term53811, term53811.getClass(), "point", -36841626);
        setIntField(term53811, term53811.getClass(), "totalPoint", -1582406508);
        setIntField(term53811, term53811.getClass(), "iconId", -1736374121);
        setIntField(term53811, term53811.getClass(), "nameplateId", 1262903454);
        setIntField(term53811, term53811.getClass(), "frameId", 1854068400);
        setIntField(term53811, term53811.getClass(), "trophyId", -2058269574);
        setIntField(term53811, term53811.getClass(), "playCount", 1108197466);
        setIntField(term53811, term53811.getClass(), "playVsCount", -2027597725);
        setIntField(term53811, term53811.getClass(), "playSyncCount", -1205843165);
        setIntField(term53811, term53811.getClass(), "winCount", -163945873);
        setIntField(term53811, term53811.getClass(), "helpCount", 23998582);
        setIntField(term53811, term53811.getClass(), "comboCount", 1341914996);
        setIntField(term53811, term53811.getClass(), "feverCount", 1542038802);
        setIntField(term53811, term53811.getClass(), "totalHiScore", -1984766098);
        setIntField(term53811, term53811.getClass(), "totalEasyHighScore", 1561867809);
        setIntField(term53811, term53811.getClass(), "totalBasicHighScore", -1510472330);
        setIntField(term53811, term53811.getClass(), "totalAdvancedHighScore", -601862318);
        setIntField(term53811, term53811.getClass(), "totalExpertHighScore", -705569141);
        setIntField(term53811, term53811.getClass(), "totalMasterHighScore", 1284403118);
        setIntField(term53811, term53811.getClass(), "totalReMasterHighScore", 686147513);
        setIntField(term53811, term53811.getClass(), "totalHighSync", 2007232253);
        setIntField(term53811, term53811.getClass(), "totalEasySync", 257006440);
        setIntField(term53811, term53811.getClass(), "totalBasicSync", 689441775);
        setIntField(term53811, term53811.getClass(), "totalAdvancedSync", -1560830255);
        setIntField(term53811, term53811.getClass(), "totalExpertSync", 686840690);
        setIntField(term53811, term53811.getClass(), "totalMasterSync", -487218195);
        setIntField(term53811, term53811.getClass(), "totalReMasterSync", 18590676);
        setIntField(term53811, term53811.getClass(), "playerRating", 1751204196);
        setIntField(term53811, term53811.getClass(), "highestRating", 1354011295);
        setIntField(term53811, term53811.getClass(), "rankAuthTailId", -550112969);
        setField(term53811, term53811.getClass(), "eventWatchedDate", "mvkMYcgAod");
        setField(term53811, term53811.getClass(), "webLimitDate", "esbhDGQDgF");
        setIntField(term53811, term53811.getClass(), "challengeTrackPhase", -552322473);
        setIntField(term53811, term53811.getClass(), "firstPlayBits", 1170114628);
        setField(term53811, term53811.getClass(), "lastPlayDate", "tKlyiBloWu");
        setIntField(term53811, term53811.getClass(), "lastPlaceId", -1506923134);
        setField(term53811, term53811.getClass(), "lastPlaceName", "uIgRFcwqLd");
        setIntField(term53811, term53811.getClass(), "lastRegionId", -689038383);
        setField(term53811, term53811.getClass(), "lastRegionName", "AvdsiEyCve");
        setField(term53811, term53811.getClass(), "lastClientId", "XMArCaVAEc");
        setField(term53811, term53811.getClass(), "lastCountryCode", "URWnZtbrQH");
        setIntField(term53811, term53811.getClass(), "eventPoint", 1931533980);
        setIntField(term53811, term53811.getClass(), "totalLv", 1998184383);
        setIntField(term53811, term53811.getClass(), "lastLoginBonusDay", -2144790292);
        setIntField(term53811, term53811.getClass(), "lastSurvivalBonusDay", 51322657);
        setIntField(term53811, term53811.getClass(), "loginBonusLv", 446655571);
        setField(term53809, term53809.getClass(), "user", term53811);
        setIntField(term53809, term53809.getClass(), "soudEffect", -103286218);
        setIntField(term53809, term53809.getClass(), "mirrorMode", 1899730567);
        setIntField(term53809, term53809.getClass(), "guideSpeed", -658153436);
        setIntField(term53809, term53809.getClass(), "bgInfo", 2119366240);
        setIntField(term53809, term53809.getClass(), "brightness", -233596948);
        setIntField(term53809, term53809.getClass(), "isStarRot", -187512293);
        setIntField(term53809, term53809.getClass(), "breakSe", 829156189);
        setIntField(term53809, term53809.getClass(), "slideSe", -745642050);
        setIntField(term53809, term53809.getClass(), "hardJudge", 1498249247);
        setIntField(term53809, term53809.getClass(), "isTagJump", 2032424716);
        setIntField(term53809, term53809.getClass(), "breakSeVol", 1201741322);
        setIntField(term53809, term53809.getClass(), "slideSeVol", 1106593440);
        setIntField(term53809, term53809.getClass(), "isUpperDisp", -1644050596);
        setIntField(term53809, term53809.getClass(), "trackSkip", 543019558);
        setIntField(term53809, term53809.getClass(), "optionMode", 1902128793);
        setIntField(term53809, term53809.getClass(), "simpleOptionParam", 1944258008);
        setIntField(term53809, term53809.getClass(), "adjustTiming", -1292525809);
        setIntField(term53809, term53809.getClass(), "dispTiming", -642577507);
        setIntField(term53809, term53809.getClass(), "timingPos", 1430669401);
        setIntField(term53809, term53809.getClass(), "ansVol", -39090052);
        setIntField(term53809, term53809.getClass(), "noteVol", -1893438887);
        setIntField(term53809, term53809.getClass(), "dmgVol", -310872754);
        setIntField(term53809, term53809.getClass(), "appealFlame", -2006897036);
        setIntField(term53809, term53809.getClass(), "isFeverDisp", 99466182);
        setIntField(term53809, term53809.getClass(), "dispJudge", -1520548826);
        setIntField(term53809, term53809.getClass(), "judgePos", 1183263051);
        setIntField(term53809, term53809.getClass(), "ratingGuard", 626039325);
        setIntField(term53809, term53809.getClass(), "selectChara", -1990497476);
        setIntField(term53809, term53809.getClass(), "sortType", 304456317);
        setIntField(term53809, term53809.getClass(), "filterGenre", -352562026);
        setIntField(term53809, term53809.getClass(), "filterLevel", -1805465595);
        setIntField(term53809, term53809.getClass(), "filterRank", 887599888);
        setIntField(term53809, term53809.getClass(), "filterVersion", 1751900954);
        setIntField(term53809, term53809.getClass(), "filterRec", 2134772267);
        setIntField(term53809, term53809.getClass(), "filterFullCombo", -1444419310);
        setIntField(term53809, term53809.getClass(), "filterAllPerfect", 1149220041);
        setIntField(term53809, term53809.getClass(), "filterDifficulty", 934382905);
        setIntField(term53809, term53809.getClass(), "filterFullSync", -464797117);
        setIntField(term53809, term53809.getClass(), "filterReMaster", -1417713070);
        setIntField(term53809, term53809.getClass(), "filterMaxFever", 545747490);
        setIntField(term53809, term53809.getClass(), "finalSelectId", -922198860);
        setIntField(term53809, term53809.getClass(), "finalSelectCategory", 369166807);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSlideSe", argTypes, term53809, args);
    }

};


