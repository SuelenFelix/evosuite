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

public class UserOption_setSortType_89667908675 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term74151;
     Object term74369;

    public UserOption_setSortType_89667908675() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term74157 = new Long(-67485388932970712L);
        term74151 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption"));
        Object term74153 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term74155 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term74171 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term74172 = newInstance(Class.forName("java.time.LocalDate"));
        Object term74176 = newInstance(Class.forName("java.time.LocalTime"));
        Object term74181 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term74182 = newInstance(Class.forName("java.time.LocalDate"));
        Object term74186 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term74151, term74151.getClass(), "id", 2289954139848415685L);
        setLongField(term74153, term74153.getClass(), "id", -6137280723045949220L);
        setLongField(term74155, term74155.getClass(), "id", -7787918913179897745L);
        setField(term74155, term74155.getClass(), "extId", term74157);
        setField(term74155, term74155.getClass(), "luid", "DRdgywxCcP");
        setIntField(term74172, term74172.getClass(), "year", 2016);
        setShortField(term74172, term74172.getClass(), "month", (short) 1);
        setShortField(term74172, term74172.getClass(), "day", (short) 2);
        setField(term74171, term74171.getClass(), "date", term74172);
        setByteField(term74176, term74176.getClass(), "hour", (byte) 13);
        setByteField(term74176, term74176.getClass(), "minute", (byte) 24);
        setByteField(term74176, term74176.getClass(), "second", (byte) 10);
        setIntField(term74176, term74176.getClass(), "nano", 70073780);
        setField(term74171, term74171.getClass(), "time", term74176);
        setField(term74155, term74155.getClass(), "registerTime", term74171);
        setIntField(term74182, term74182.getClass(), "year", 2013);
        setShortField(term74182, term74182.getClass(), "month", (short) 2);
        setShortField(term74182, term74182.getClass(), "day", (short) 21);
        setField(term74181, term74181.getClass(), "date", term74182);
        setByteField(term74186, term74186.getClass(), "hour", (byte) 4);
        setByteField(term74186, term74186.getClass(), "minute", (byte) 18);
        setByteField(term74186, term74186.getClass(), "second", (byte) 6);
        setIntField(term74186, term74186.getClass(), "nano", 2952762);
        setField(term74181, term74181.getClass(), "time", term74186);
        setField(term74155, term74155.getClass(), "accessTime", term74181);
        setField(term74153, term74153.getClass(), "card", term74155);
        setIntField(term74153, term74153.getClass(), "lastDataVersion", 1806608456);
        setField(term74153, term74153.getClass(), "userName", "uelmUHzwnS");
        setIntField(term74153, term74153.getClass(), "point", -1102443676);
        setIntField(term74153, term74153.getClass(), "totalPoint", 826146957);
        setIntField(term74153, term74153.getClass(), "iconId", 2111085515);
        setIntField(term74153, term74153.getClass(), "nameplateId", 2060986);
        setIntField(term74153, term74153.getClass(), "frameId", 1033399504);
        setIntField(term74153, term74153.getClass(), "trophyId", -863210192);
        setIntField(term74153, term74153.getClass(), "playCount", 829387311);
        setIntField(term74153, term74153.getClass(), "playVsCount", -1196127941);
        setIntField(term74153, term74153.getClass(), "playSyncCount", 396258542);
        setIntField(term74153, term74153.getClass(), "winCount", 172123409);
        setIntField(term74153, term74153.getClass(), "helpCount", 1029355238);
        setIntField(term74153, term74153.getClass(), "comboCount", -888533020);
        setIntField(term74153, term74153.getClass(), "feverCount", -1902510285);
        setIntField(term74153, term74153.getClass(), "totalHiScore", -1026090353);
        setIntField(term74153, term74153.getClass(), "totalEasyHighScore", -117488752);
        setIntField(term74153, term74153.getClass(), "totalBasicHighScore", 1600435884);
        setIntField(term74153, term74153.getClass(), "totalAdvancedHighScore", 1871067296);
        setIntField(term74153, term74153.getClass(), "totalExpertHighScore", 1477572376);
        setIntField(term74153, term74153.getClass(), "totalMasterHighScore", -1593818198);
        setIntField(term74153, term74153.getClass(), "totalReMasterHighScore", -666808287);
        setIntField(term74153, term74153.getClass(), "totalHighSync", -1852558744);
        setIntField(term74153, term74153.getClass(), "totalEasySync", -1101903102);
        setIntField(term74153, term74153.getClass(), "totalBasicSync", -1507159608);
        setIntField(term74153, term74153.getClass(), "totalAdvancedSync", 1857724245);
        setIntField(term74153, term74153.getClass(), "totalExpertSync", 1501360853);
        setIntField(term74153, term74153.getClass(), "totalMasterSync", 1742493339);
        setIntField(term74153, term74153.getClass(), "totalReMasterSync", 1655055649);
        setIntField(term74153, term74153.getClass(), "playerRating", 782864661);
        setIntField(term74153, term74153.getClass(), "highestRating", -628195221);
        setIntField(term74153, term74153.getClass(), "rankAuthTailId", -204683138);
        setField(term74153, term74153.getClass(), "eventWatchedDate", "iKuSKqVzvy");
        setField(term74153, term74153.getClass(), "webLimitDate", "SgyGAlytLF");
        setIntField(term74153, term74153.getClass(), "challengeTrackPhase", -1466805424);
        setIntField(term74153, term74153.getClass(), "firstPlayBits", -1426893727);
        setField(term74153, term74153.getClass(), "lastPlayDate", "OoXopVvpwr");
        setIntField(term74153, term74153.getClass(), "lastPlaceId", -388725939);
        setField(term74153, term74153.getClass(), "lastPlaceName", "lwwreKJCFL");
        setIntField(term74153, term74153.getClass(), "lastRegionId", -359314137);
        setField(term74153, term74153.getClass(), "lastRegionName", "PWBggYjpOQ");
        setField(term74153, term74153.getClass(), "lastClientId", "FDzNpfjYDI");
        setField(term74153, term74153.getClass(), "lastCountryCode", "vSbbcByIuA");
        setIntField(term74153, term74153.getClass(), "eventPoint", -1602360743);
        setIntField(term74153, term74153.getClass(), "totalLv", 297534999);
        setIntField(term74153, term74153.getClass(), "lastLoginBonusDay", -1696655137);
        setIntField(term74153, term74153.getClass(), "lastSurvivalBonusDay", -184941622);
        setIntField(term74153, term74153.getClass(), "loginBonusLv", 1975019241);
        setField(term74151, term74151.getClass(), "user", term74153);
        setIntField(term74151, term74151.getClass(), "soudEffect", -2140412944);
        setIntField(term74151, term74151.getClass(), "mirrorMode", 1286651308);
        setIntField(term74151, term74151.getClass(), "guideSpeed", 833678431);
        setIntField(term74151, term74151.getClass(), "bgInfo", -628503839);
        setIntField(term74151, term74151.getClass(), "brightness", -1277150544);
        setIntField(term74151, term74151.getClass(), "isStarRot", 1250324874);
        setIntField(term74151, term74151.getClass(), "breakSe", 1178706689);
        setIntField(term74151, term74151.getClass(), "slideSe", -1020078059);
        setIntField(term74151, term74151.getClass(), "hardJudge", 16810905);
        setIntField(term74151, term74151.getClass(), "isTagJump", 1606121980);
        setIntField(term74151, term74151.getClass(), "breakSeVol", -1026229128);
        setIntField(term74151, term74151.getClass(), "slideSeVol", 477082448);
        setIntField(term74151, term74151.getClass(), "isUpperDisp", 679699744);
        setIntField(term74151, term74151.getClass(), "trackSkip", -1103337770);
        setIntField(term74151, term74151.getClass(), "optionMode", -2088151020);
        setIntField(term74151, term74151.getClass(), "simpleOptionParam", 1163080603);
        setIntField(term74151, term74151.getClass(), "adjustTiming", 1295420131);
        setIntField(term74151, term74151.getClass(), "dispTiming", 336805159);
        setIntField(term74151, term74151.getClass(), "timingPos", 232372924);
        setIntField(term74151, term74151.getClass(), "ansVol", -990813762);
        setIntField(term74151, term74151.getClass(), "noteVol", -2116581159);
        setIntField(term74151, term74151.getClass(), "dmgVol", 1490086994);
        setIntField(term74151, term74151.getClass(), "appealFlame", -84736186);
        setIntField(term74151, term74151.getClass(), "isFeverDisp", -424416249);
        setIntField(term74151, term74151.getClass(), "dispJudge", -373604918);
        setIntField(term74151, term74151.getClass(), "judgePos", 1916170622);
        setIntField(term74151, term74151.getClass(), "ratingGuard", 1639180296);
        setIntField(term74151, term74151.getClass(), "selectChara", 1956352585);
        setIntField(term74151, term74151.getClass(), "sortType", -647730942);
        setIntField(term74151, term74151.getClass(), "filterGenre", 2025999664);
        setIntField(term74151, term74151.getClass(), "filterLevel", -909558354);
        setIntField(term74151, term74151.getClass(), "filterRank", -916599257);
        setIntField(term74151, term74151.getClass(), "filterVersion", 1224828737);
        setIntField(term74151, term74151.getClass(), "filterRec", 938290997);
        setIntField(term74151, term74151.getClass(), "filterFullCombo", 1981949773);
        setIntField(term74151, term74151.getClass(), "filterAllPerfect", -1921107054);
        setIntField(term74151, term74151.getClass(), "filterDifficulty", -36418827);
        setIntField(term74151, term74151.getClass(), "filterFullSync", -1121256252);
        setIntField(term74151, term74151.getClass(), "filterReMaster", 353630136);
        setIntField(term74151, term74151.getClass(), "filterMaxFever", 108496271);
        setIntField(term74151, term74151.getClass(), "finalSelectId", 1074250666);
        setIntField(term74151, term74151.getClass(), "finalSelectCategory", 41129188);
        term74369 = new Integer(20425746);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term74369;
        callMethod(klass, "setSortType", argTypes, term74151, args);
    }

};


