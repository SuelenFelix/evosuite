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

public class UserOption_getAnsVol_165010099122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57505;

    public UserOption_getAnsVol_165010099122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term57511 = new Long(5246058710498845622L);
        term57505 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption"));
        Object term57507 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term57509 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term57525 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term57526 = newInstance(Class.forName("java.time.LocalDate"));
        Object term57530 = newInstance(Class.forName("java.time.LocalTime"));
        Object term57535 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term57536 = newInstance(Class.forName("java.time.LocalDate"));
        Object term57540 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term57505, term57505.getClass(), "id", 6269054578518955349L);
        setLongField(term57507, term57507.getClass(), "id", -143609946830350439L);
        setLongField(term57509, term57509.getClass(), "id", 2018084438165711668L);
        setField(term57509, term57509.getClass(), "extId", term57511);
        setField(term57509, term57509.getClass(), "luid", "JpFIuyNEKW");
        setIntField(term57526, term57526.getClass(), "year", 2025);
        setShortField(term57526, term57526.getClass(), "month", (short) 8);
        setShortField(term57526, term57526.getClass(), "day", (short) 18);
        setField(term57525, term57525.getClass(), "date", term57526);
        setByteField(term57530, term57530.getClass(), "hour", (byte) 11);
        setByteField(term57530, term57530.getClass(), "minute", (byte) 28);
        setByteField(term57530, term57530.getClass(), "second", (byte) 28);
        setIntField(term57530, term57530.getClass(), "nano", 32159081);
        setField(term57525, term57525.getClass(), "time", term57530);
        setField(term57509, term57509.getClass(), "registerTime", term57525);
        setIntField(term57536, term57536.getClass(), "year", 2026);
        setShortField(term57536, term57536.getClass(), "month", (short) 5);
        setShortField(term57536, term57536.getClass(), "day", (short) 14);
        setField(term57535, term57535.getClass(), "date", term57536);
        setByteField(term57540, term57540.getClass(), "hour", (byte) 3);
        setByteField(term57540, term57540.getClass(), "minute", (byte) 43);
        setByteField(term57540, term57540.getClass(), "second", (byte) 41);
        setIntField(term57540, term57540.getClass(), "nano", 519970122);
        setField(term57535, term57535.getClass(), "time", term57540);
        setField(term57509, term57509.getClass(), "accessTime", term57535);
        setField(term57507, term57507.getClass(), "card", term57509);
        setIntField(term57507, term57507.getClass(), "lastDataVersion", -406686588);
        setField(term57507, term57507.getClass(), "userName", "NksHsgcqDx");
        setIntField(term57507, term57507.getClass(), "point", 1008508403);
        setIntField(term57507, term57507.getClass(), "totalPoint", -1013082565);
        setIntField(term57507, term57507.getClass(), "iconId", -855398884);
        setIntField(term57507, term57507.getClass(), "nameplateId", -762497528);
        setIntField(term57507, term57507.getClass(), "frameId", -210438728);
        setIntField(term57507, term57507.getClass(), "trophyId", -277514484);
        setIntField(term57507, term57507.getClass(), "playCount", 836110005);
        setIntField(term57507, term57507.getClass(), "playVsCount", -25573615);
        setIntField(term57507, term57507.getClass(), "playSyncCount", -1429138211);
        setIntField(term57507, term57507.getClass(), "winCount", -458414349);
        setIntField(term57507, term57507.getClass(), "helpCount", 1500512047);
        setIntField(term57507, term57507.getClass(), "comboCount", 1803572922);
        setIntField(term57507, term57507.getClass(), "feverCount", 1045176591);
        setIntField(term57507, term57507.getClass(), "totalHiScore", -19497212);
        setIntField(term57507, term57507.getClass(), "totalEasyHighScore", 1768312184);
        setIntField(term57507, term57507.getClass(), "totalBasicHighScore", -1540801809);
        setIntField(term57507, term57507.getClass(), "totalAdvancedHighScore", -1968650604);
        setIntField(term57507, term57507.getClass(), "totalExpertHighScore", -1080069977);
        setIntField(term57507, term57507.getClass(), "totalMasterHighScore", -581052818);
        setIntField(term57507, term57507.getClass(), "totalReMasterHighScore", -1783757760);
        setIntField(term57507, term57507.getClass(), "totalHighSync", 1252467087);
        setIntField(term57507, term57507.getClass(), "totalEasySync", 1051291530);
        setIntField(term57507, term57507.getClass(), "totalBasicSync", -203097399);
        setIntField(term57507, term57507.getClass(), "totalAdvancedSync", 620198648);
        setIntField(term57507, term57507.getClass(), "totalExpertSync", 1593407362);
        setIntField(term57507, term57507.getClass(), "totalMasterSync", 689506008);
        setIntField(term57507, term57507.getClass(), "totalReMasterSync", 580048439);
        setIntField(term57507, term57507.getClass(), "playerRating", 534108526);
        setIntField(term57507, term57507.getClass(), "highestRating", -1525906157);
        setIntField(term57507, term57507.getClass(), "rankAuthTailId", -747827797);
        setField(term57507, term57507.getClass(), "eventWatchedDate", "RjSNvOEvcT");
        setField(term57507, term57507.getClass(), "webLimitDate", "HLzuMxigqS");
        setIntField(term57507, term57507.getClass(), "challengeTrackPhase", -88552248);
        setIntField(term57507, term57507.getClass(), "firstPlayBits", 835835802);
        setField(term57507, term57507.getClass(), "lastPlayDate", "wiBOoDCyzd");
        setIntField(term57507, term57507.getClass(), "lastPlaceId", 148923410);
        setField(term57507, term57507.getClass(), "lastPlaceName", "TIaFKUJELS");
        setIntField(term57507, term57507.getClass(), "lastRegionId", 892350142);
        setField(term57507, term57507.getClass(), "lastRegionName", "IPmndzGjtG");
        setField(term57507, term57507.getClass(), "lastClientId", "pkQiBgYrkQ");
        setField(term57507, term57507.getClass(), "lastCountryCode", "SJLRFsNagf");
        setIntField(term57507, term57507.getClass(), "eventPoint", 97847948);
        setIntField(term57507, term57507.getClass(), "totalLv", -2100667414);
        setIntField(term57507, term57507.getClass(), "lastLoginBonusDay", -1770304070);
        setIntField(term57507, term57507.getClass(), "lastSurvivalBonusDay", -2146519194);
        setIntField(term57507, term57507.getClass(), "loginBonusLv", 314235257);
        setField(term57505, term57505.getClass(), "user", term57507);
        setIntField(term57505, term57505.getClass(), "soudEffect", -1266948778);
        setIntField(term57505, term57505.getClass(), "mirrorMode", 944749878);
        setIntField(term57505, term57505.getClass(), "guideSpeed", 1040572866);
        setIntField(term57505, term57505.getClass(), "bgInfo", 206565778);
        setIntField(term57505, term57505.getClass(), "brightness", -2142502223);
        setIntField(term57505, term57505.getClass(), "isStarRot", -1920747929);
        setIntField(term57505, term57505.getClass(), "breakSe", -872346063);
        setIntField(term57505, term57505.getClass(), "slideSe", -15980730);
        setIntField(term57505, term57505.getClass(), "hardJudge", 1099197250);
        setIntField(term57505, term57505.getClass(), "isTagJump", -576768796);
        setIntField(term57505, term57505.getClass(), "breakSeVol", -1567842300);
        setIntField(term57505, term57505.getClass(), "slideSeVol", 1297816597);
        setIntField(term57505, term57505.getClass(), "isUpperDisp", 382635155);
        setIntField(term57505, term57505.getClass(), "trackSkip", -217839806);
        setIntField(term57505, term57505.getClass(), "optionMode", 613249396);
        setIntField(term57505, term57505.getClass(), "simpleOptionParam", 47568249);
        setIntField(term57505, term57505.getClass(), "adjustTiming", -512122488);
        setIntField(term57505, term57505.getClass(), "dispTiming", 1660000916);
        setIntField(term57505, term57505.getClass(), "timingPos", -949546282);
        setIntField(term57505, term57505.getClass(), "ansVol", -1522246141);
        setIntField(term57505, term57505.getClass(), "noteVol", 2132977330);
        setIntField(term57505, term57505.getClass(), "dmgVol", 352025141);
        setIntField(term57505, term57505.getClass(), "appealFlame", -135640820);
        setIntField(term57505, term57505.getClass(), "isFeverDisp", 515232963);
        setIntField(term57505, term57505.getClass(), "dispJudge", -67715099);
        setIntField(term57505, term57505.getClass(), "judgePos", 1291945924);
        setIntField(term57505, term57505.getClass(), "ratingGuard", 1997045566);
        setIntField(term57505, term57505.getClass(), "selectChara", 1476366061);
        setIntField(term57505, term57505.getClass(), "sortType", -834804985);
        setIntField(term57505, term57505.getClass(), "filterGenre", -299552913);
        setIntField(term57505, term57505.getClass(), "filterLevel", 1340088266);
        setIntField(term57505, term57505.getClass(), "filterRank", -1394987080);
        setIntField(term57505, term57505.getClass(), "filterVersion", 677698603);
        setIntField(term57505, term57505.getClass(), "filterRec", -2094588812);
        setIntField(term57505, term57505.getClass(), "filterFullCombo", 2038499448);
        setIntField(term57505, term57505.getClass(), "filterAllPerfect", -2065835383);
        setIntField(term57505, term57505.getClass(), "filterDifficulty", 580583133);
        setIntField(term57505, term57505.getClass(), "filterFullSync", -179490331);
        setIntField(term57505, term57505.getClass(), "filterReMaster", -1593340430);
        setIntField(term57505, term57505.getClass(), "filterMaxFever", 1829561168);
        setIntField(term57505, term57505.getClass(), "finalSelectId", -1987503937);
        setIntField(term57505, term57505.getClass(), "finalSelectCategory", -425145429);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAnsVol", argTypes, term57505, args);
    }

};


