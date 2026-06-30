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

public class UserOption_setDispJudge_84606419971 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72911;
     Object term73129;

    public UserOption_setDispJudge_84606419971() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term72917 = new Long(3108750145697087661L);
        term72911 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption"));
        Object term72913 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term72915 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term72931 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term72932 = newInstance(Class.forName("java.time.LocalDate"));
        Object term72936 = newInstance(Class.forName("java.time.LocalTime"));
        Object term72941 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term72942 = newInstance(Class.forName("java.time.LocalDate"));
        Object term72946 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term72911, term72911.getClass(), "id", -1283563319051310751L);
        setLongField(term72913, term72913.getClass(), "id", -1413653349314156044L);
        setLongField(term72915, term72915.getClass(), "id", 742593745847006219L);
        setField(term72915, term72915.getClass(), "extId", term72917);
        setField(term72915, term72915.getClass(), "luid", "HtLEppUqzI");
        setIntField(term72932, term72932.getClass(), "year", 2016);
        setShortField(term72932, term72932.getClass(), "month", (short) 12);
        setShortField(term72932, term72932.getClass(), "day", (short) 20);
        setField(term72931, term72931.getClass(), "date", term72932);
        setByteField(term72936, term72936.getClass(), "hour", (byte) 20);
        setByteField(term72936, term72936.getClass(), "minute", (byte) 42);
        setByteField(term72936, term72936.getClass(), "second", (byte) 4);
        setIntField(term72936, term72936.getClass(), "nano", 499637837);
        setField(term72931, term72931.getClass(), "time", term72936);
        setField(term72915, term72915.getClass(), "registerTime", term72931);
        setIntField(term72942, term72942.getClass(), "year", 2017);
        setShortField(term72942, term72942.getClass(), "month", (short) 1);
        setShortField(term72942, term72942.getClass(), "day", (short) 2);
        setField(term72941, term72941.getClass(), "date", term72942);
        setByteField(term72946, term72946.getClass(), "hour", (byte) 17);
        setByteField(term72946, term72946.getClass(), "minute", (byte) 7);
        setByteField(term72946, term72946.getClass(), "second", (byte) 40);
        setIntField(term72946, term72946.getClass(), "nano", 688544705);
        setField(term72941, term72941.getClass(), "time", term72946);
        setField(term72915, term72915.getClass(), "accessTime", term72941);
        setField(term72913, term72913.getClass(), "card", term72915);
        setIntField(term72913, term72913.getClass(), "lastDataVersion", -161988555);
        setField(term72913, term72913.getClass(), "userName", "bVlRrMQeRY");
        setIntField(term72913, term72913.getClass(), "point", 43440548);
        setIntField(term72913, term72913.getClass(), "totalPoint", 4471197);
        setIntField(term72913, term72913.getClass(), "iconId", 1738718362);
        setIntField(term72913, term72913.getClass(), "nameplateId", 581835806);
        setIntField(term72913, term72913.getClass(), "frameId", -421243361);
        setIntField(term72913, term72913.getClass(), "trophyId", -1188968198);
        setIntField(term72913, term72913.getClass(), "playCount", 1939849063);
        setIntField(term72913, term72913.getClass(), "playVsCount", -748650486);
        setIntField(term72913, term72913.getClass(), "playSyncCount", 577034812);
        setIntField(term72913, term72913.getClass(), "winCount", 1899791293);
        setIntField(term72913, term72913.getClass(), "helpCount", -12316989);
        setIntField(term72913, term72913.getClass(), "comboCount", 692299594);
        setIntField(term72913, term72913.getClass(), "feverCount", 882243847);
        setIntField(term72913, term72913.getClass(), "totalHiScore", -2058528763);
        setIntField(term72913, term72913.getClass(), "totalEasyHighScore", -1748699477);
        setIntField(term72913, term72913.getClass(), "totalBasicHighScore", -1325011408);
        setIntField(term72913, term72913.getClass(), "totalAdvancedHighScore", 50151279);
        setIntField(term72913, term72913.getClass(), "totalExpertHighScore", -1106846011);
        setIntField(term72913, term72913.getClass(), "totalMasterHighScore", -1120397462);
        setIntField(term72913, term72913.getClass(), "totalReMasterHighScore", 39917319);
        setIntField(term72913, term72913.getClass(), "totalHighSync", 235259945);
        setIntField(term72913, term72913.getClass(), "totalEasySync", -209966116);
        setIntField(term72913, term72913.getClass(), "totalBasicSync", -21236200);
        setIntField(term72913, term72913.getClass(), "totalAdvancedSync", -521770429);
        setIntField(term72913, term72913.getClass(), "totalExpertSync", -1798788652);
        setIntField(term72913, term72913.getClass(), "totalMasterSync", 496765794);
        setIntField(term72913, term72913.getClass(), "totalReMasterSync", 427463011);
        setIntField(term72913, term72913.getClass(), "playerRating", -563075591);
        setIntField(term72913, term72913.getClass(), "highestRating", 7054174);
        setIntField(term72913, term72913.getClass(), "rankAuthTailId", -1097711548);
        setField(term72913, term72913.getClass(), "eventWatchedDate", "SXaXhlzAIB");
        setField(term72913, term72913.getClass(), "webLimitDate", "UPVTXSXUNh");
        setIntField(term72913, term72913.getClass(), "challengeTrackPhase", -1430651247);
        setIntField(term72913, term72913.getClass(), "firstPlayBits", 1358295184);
        setField(term72913, term72913.getClass(), "lastPlayDate", "cjCXbXuiFn");
        setIntField(term72913, term72913.getClass(), "lastPlaceId", 1150528165);
        setField(term72913, term72913.getClass(), "lastPlaceName", "fhdhDeWdoi");
        setIntField(term72913, term72913.getClass(), "lastRegionId", -1763338222);
        setField(term72913, term72913.getClass(), "lastRegionName", "FqrcltWSUd");
        setField(term72913, term72913.getClass(), "lastClientId", "kAbILlhsZw");
        setField(term72913, term72913.getClass(), "lastCountryCode", "QsIOCSpRow");
        setIntField(term72913, term72913.getClass(), "eventPoint", 99308229);
        setIntField(term72913, term72913.getClass(), "totalLv", -550944071);
        setIntField(term72913, term72913.getClass(), "lastLoginBonusDay", -1977663135);
        setIntField(term72913, term72913.getClass(), "lastSurvivalBonusDay", -1186797545);
        setIntField(term72913, term72913.getClass(), "loginBonusLv", -1477944192);
        setField(term72911, term72911.getClass(), "user", term72913);
        setIntField(term72911, term72911.getClass(), "soudEffect", -2078671716);
        setIntField(term72911, term72911.getClass(), "mirrorMode", 1043772480);
        setIntField(term72911, term72911.getClass(), "guideSpeed", -95270998);
        setIntField(term72911, term72911.getClass(), "bgInfo", 76869994);
        setIntField(term72911, term72911.getClass(), "brightness", -1317889453);
        setIntField(term72911, term72911.getClass(), "isStarRot", -1342265262);
        setIntField(term72911, term72911.getClass(), "breakSe", -1862984765);
        setIntField(term72911, term72911.getClass(), "slideSe", -2078223278);
        setIntField(term72911, term72911.getClass(), "hardJudge", -589382757);
        setIntField(term72911, term72911.getClass(), "isTagJump", -1793353049);
        setIntField(term72911, term72911.getClass(), "breakSeVol", -1977563184);
        setIntField(term72911, term72911.getClass(), "slideSeVol", 762541939);
        setIntField(term72911, term72911.getClass(), "isUpperDisp", -282725688);
        setIntField(term72911, term72911.getClass(), "trackSkip", -822397387);
        setIntField(term72911, term72911.getClass(), "optionMode", -1837951031);
        setIntField(term72911, term72911.getClass(), "simpleOptionParam", -199549191);
        setIntField(term72911, term72911.getClass(), "adjustTiming", -1783623943);
        setIntField(term72911, term72911.getClass(), "dispTiming", 2059576319);
        setIntField(term72911, term72911.getClass(), "timingPos", -203769983);
        setIntField(term72911, term72911.getClass(), "ansVol", -307419197);
        setIntField(term72911, term72911.getClass(), "noteVol", -1329113715);
        setIntField(term72911, term72911.getClass(), "dmgVol", -233883276);
        setIntField(term72911, term72911.getClass(), "appealFlame", -2139141313);
        setIntField(term72911, term72911.getClass(), "isFeverDisp", -585271703);
        setIntField(term72911, term72911.getClass(), "dispJudge", 88104661);
        setIntField(term72911, term72911.getClass(), "judgePos", -844551916);
        setIntField(term72911, term72911.getClass(), "ratingGuard", 1387920781);
        setIntField(term72911, term72911.getClass(), "selectChara", -697347457);
        setIntField(term72911, term72911.getClass(), "sortType", -294221302);
        setIntField(term72911, term72911.getClass(), "filterGenre", -81913511);
        setIntField(term72911, term72911.getClass(), "filterLevel", -1247242673);
        setIntField(term72911, term72911.getClass(), "filterRank", 176304667);
        setIntField(term72911, term72911.getClass(), "filterVersion", 956775553);
        setIntField(term72911, term72911.getClass(), "filterRec", 1966327252);
        setIntField(term72911, term72911.getClass(), "filterFullCombo", 1878159126);
        setIntField(term72911, term72911.getClass(), "filterAllPerfect", -1511966316);
        setIntField(term72911, term72911.getClass(), "filterDifficulty", 782589981);
        setIntField(term72911, term72911.getClass(), "filterFullSync", 2072055445);
        setIntField(term72911, term72911.getClass(), "filterReMaster", -604514122);
        setIntField(term72911, term72911.getClass(), "filterMaxFever", -1364954228);
        setIntField(term72911, term72911.getClass(), "finalSelectId", -2097031932);
        setIntField(term72911, term72911.getClass(), "finalSelectCategory", 830347728);
        term73129 = new Integer(1528415765);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term73129;
        callMethod(klass, "setDispJudge", argTypes, term72911, args);
    }

};


