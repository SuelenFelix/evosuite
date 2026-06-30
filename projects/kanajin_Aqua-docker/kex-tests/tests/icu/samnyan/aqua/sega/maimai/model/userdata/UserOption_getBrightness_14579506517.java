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

public class UserOption_getBrightness_14579506517 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52885;

    public UserOption_getBrightness_14579506517() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term52891 = new Long(4699157009689333952L);
        term52885 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption"));
        Object term52887 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term52889 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term52905 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term52906 = newInstance(Class.forName("java.time.LocalDate"));
        Object term52910 = newInstance(Class.forName("java.time.LocalTime"));
        Object term52915 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term52916 = newInstance(Class.forName("java.time.LocalDate"));
        Object term52920 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term52885, term52885.getClass(), "id", 1634166935474035772L);
        setLongField(term52887, term52887.getClass(), "id", -2614906266506360948L);
        setLongField(term52889, term52889.getClass(), "id", 1133267598258375793L);
        setField(term52889, term52889.getClass(), "extId", term52891);
        setField(term52889, term52889.getClass(), "luid", "VUVgiQvSYa");
        setIntField(term52906, term52906.getClass(), "year", 2013);
        setShortField(term52906, term52906.getClass(), "month", (short) 3);
        setShortField(term52906, term52906.getClass(), "day", (short) 3);
        setField(term52905, term52905.getClass(), "date", term52906);
        setByteField(term52910, term52910.getClass(), "hour", (byte) 22);
        setByteField(term52910, term52910.getClass(), "minute", (byte) 27);
        setByteField(term52910, term52910.getClass(), "second", (byte) 52);
        setIntField(term52910, term52910.getClass(), "nano", 968779154);
        setField(term52905, term52905.getClass(), "time", term52910);
        setField(term52889, term52889.getClass(), "registerTime", term52905);
        setIntField(term52916, term52916.getClass(), "year", 2019);
        setShortField(term52916, term52916.getClass(), "month", (short) 8);
        setShortField(term52916, term52916.getClass(), "day", (short) 31);
        setField(term52915, term52915.getClass(), "date", term52916);
        setByteField(term52920, term52920.getClass(), "hour", (byte) 22);
        setByteField(term52920, term52920.getClass(), "minute", (byte) 31);
        setByteField(term52920, term52920.getClass(), "second", (byte) 36);
        setIntField(term52920, term52920.getClass(), "nano", 403358328);
        setField(term52915, term52915.getClass(), "time", term52920);
        setField(term52889, term52889.getClass(), "accessTime", term52915);
        setField(term52887, term52887.getClass(), "card", term52889);
        setIntField(term52887, term52887.getClass(), "lastDataVersion", 580191788);
        setField(term52887, term52887.getClass(), "userName", "sEGgJJplmE");
        setIntField(term52887, term52887.getClass(), "point", -1340848376);
        setIntField(term52887, term52887.getClass(), "totalPoint", -1482512097);
        setIntField(term52887, term52887.getClass(), "iconId", -2076427376);
        setIntField(term52887, term52887.getClass(), "nameplateId", -852476369);
        setIntField(term52887, term52887.getClass(), "frameId", 596868453);
        setIntField(term52887, term52887.getClass(), "trophyId", -1890744188);
        setIntField(term52887, term52887.getClass(), "playCount", 2118439468);
        setIntField(term52887, term52887.getClass(), "playVsCount", -241809702);
        setIntField(term52887, term52887.getClass(), "playSyncCount", 711539411);
        setIntField(term52887, term52887.getClass(), "winCount", 702531885);
        setIntField(term52887, term52887.getClass(), "helpCount", 137777785);
        setIntField(term52887, term52887.getClass(), "comboCount", -1972381311);
        setIntField(term52887, term52887.getClass(), "feverCount", -1871425005);
        setIntField(term52887, term52887.getClass(), "totalHiScore", -1968820002);
        setIntField(term52887, term52887.getClass(), "totalEasyHighScore", 1126576455);
        setIntField(term52887, term52887.getClass(), "totalBasicHighScore", -84202309);
        setIntField(term52887, term52887.getClass(), "totalAdvancedHighScore", 54744840);
        setIntField(term52887, term52887.getClass(), "totalExpertHighScore", -1017477523);
        setIntField(term52887, term52887.getClass(), "totalMasterHighScore", 1084453109);
        setIntField(term52887, term52887.getClass(), "totalReMasterHighScore", -1674658475);
        setIntField(term52887, term52887.getClass(), "totalHighSync", 1130325657);
        setIntField(term52887, term52887.getClass(), "totalEasySync", 247563740);
        setIntField(term52887, term52887.getClass(), "totalBasicSync", 1806796271);
        setIntField(term52887, term52887.getClass(), "totalAdvancedSync", -91540855);
        setIntField(term52887, term52887.getClass(), "totalExpertSync", -2120152870);
        setIntField(term52887, term52887.getClass(), "totalMasterSync", -2111077974);
        setIntField(term52887, term52887.getClass(), "totalReMasterSync", 1055817592);
        setIntField(term52887, term52887.getClass(), "playerRating", 967496047);
        setIntField(term52887, term52887.getClass(), "highestRating", -1410428562);
        setIntField(term52887, term52887.getClass(), "rankAuthTailId", 1498236261);
        setField(term52887, term52887.getClass(), "eventWatchedDate", "jyexiarswN");
        setField(term52887, term52887.getClass(), "webLimitDate", "ZBLFNFVEHD");
        setIntField(term52887, term52887.getClass(), "challengeTrackPhase", -1544783703);
        setIntField(term52887, term52887.getClass(), "firstPlayBits", -1332726862);
        setField(term52887, term52887.getClass(), "lastPlayDate", "miNxpUfOyL");
        setIntField(term52887, term52887.getClass(), "lastPlaceId", 953524774);
        setField(term52887, term52887.getClass(), "lastPlaceName", "BAPTojeHRU");
        setIntField(term52887, term52887.getClass(), "lastRegionId", 959188355);
        setField(term52887, term52887.getClass(), "lastRegionName", "uqDEIRoVVf");
        setField(term52887, term52887.getClass(), "lastClientId", "HnLeZhnLzz");
        setField(term52887, term52887.getClass(), "lastCountryCode", "ziYEsRkZmD");
        setIntField(term52887, term52887.getClass(), "eventPoint", -1044212296);
        setIntField(term52887, term52887.getClass(), "totalLv", -1818413689);
        setIntField(term52887, term52887.getClass(), "lastLoginBonusDay", 1416082413);
        setIntField(term52887, term52887.getClass(), "lastSurvivalBonusDay", 1462806642);
        setIntField(term52887, term52887.getClass(), "loginBonusLv", -1504046723);
        setField(term52885, term52885.getClass(), "user", term52887);
        setIntField(term52885, term52885.getClass(), "soudEffect", 842419931);
        setIntField(term52885, term52885.getClass(), "mirrorMode", 886819304);
        setIntField(term52885, term52885.getClass(), "guideSpeed", 639833326);
        setIntField(term52885, term52885.getClass(), "bgInfo", -884990158);
        setIntField(term52885, term52885.getClass(), "brightness", 765840331);
        setIntField(term52885, term52885.getClass(), "isStarRot", 1089843929);
        setIntField(term52885, term52885.getClass(), "breakSe", 1964061073);
        setIntField(term52885, term52885.getClass(), "slideSe", -1274174342);
        setIntField(term52885, term52885.getClass(), "hardJudge", 269850713);
        setIntField(term52885, term52885.getClass(), "isTagJump", -1487569724);
        setIntField(term52885, term52885.getClass(), "breakSeVol", 288903600);
        setIntField(term52885, term52885.getClass(), "slideSeVol", -972943452);
        setIntField(term52885, term52885.getClass(), "isUpperDisp", -1263692965);
        setIntField(term52885, term52885.getClass(), "trackSkip", 47709908);
        setIntField(term52885, term52885.getClass(), "optionMode", 1429392228);
        setIntField(term52885, term52885.getClass(), "simpleOptionParam", 2122239536);
        setIntField(term52885, term52885.getClass(), "adjustTiming", 542088374);
        setIntField(term52885, term52885.getClass(), "dispTiming", -950297218);
        setIntField(term52885, term52885.getClass(), "timingPos", 1244123877);
        setIntField(term52885, term52885.getClass(), "ansVol", -1662703727);
        setIntField(term52885, term52885.getClass(), "noteVol", 1279906508);
        setIntField(term52885, term52885.getClass(), "dmgVol", -238375706);
        setIntField(term52885, term52885.getClass(), "appealFlame", 1556952863);
        setIntField(term52885, term52885.getClass(), "isFeverDisp", -198148044);
        setIntField(term52885, term52885.getClass(), "dispJudge", 1022014258);
        setIntField(term52885, term52885.getClass(), "judgePos", -125889150);
        setIntField(term52885, term52885.getClass(), "ratingGuard", 1022350206);
        setIntField(term52885, term52885.getClass(), "selectChara", -171751232);
        setIntField(term52885, term52885.getClass(), "sortType", -999681370);
        setIntField(term52885, term52885.getClass(), "filterGenre", 1143545597);
        setIntField(term52885, term52885.getClass(), "filterLevel", 1949354764);
        setIntField(term52885, term52885.getClass(), "filterRank", -1317200481);
        setIntField(term52885, term52885.getClass(), "filterVersion", -229302209);
        setIntField(term52885, term52885.getClass(), "filterRec", -1214413475);
        setIntField(term52885, term52885.getClass(), "filterFullCombo", 351461566);
        setIntField(term52885, term52885.getClass(), "filterAllPerfect", -745219395);
        setIntField(term52885, term52885.getClass(), "filterDifficulty", 1205528550);
        setIntField(term52885, term52885.getClass(), "filterFullSync", -1936901017);
        setIntField(term52885, term52885.getClass(), "filterReMaster", -1504411382);
        setIntField(term52885, term52885.getClass(), "filterMaxFever", -283531377);
        setIntField(term52885, term52885.getClass(), "finalSelectId", -314963964);
        setIntField(term52885, term52885.getClass(), "finalSelectCategory", 1047233857);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBrightness", argTypes, term52885, args);
    }

};


