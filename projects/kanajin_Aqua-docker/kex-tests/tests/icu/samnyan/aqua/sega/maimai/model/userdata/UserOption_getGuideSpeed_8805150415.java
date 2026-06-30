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

public class UserOption_getGuideSpeed_8805150415 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52269;

    public UserOption_getGuideSpeed_8805150415() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term52275 = new Long(-6100012593724108983L);
        term52269 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption"));
        Object term52271 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term52273 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term52289 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term52290 = newInstance(Class.forName("java.time.LocalDate"));
        Object term52294 = newInstance(Class.forName("java.time.LocalTime"));
        Object term52299 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term52300 = newInstance(Class.forName("java.time.LocalDate"));
        Object term52304 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term52269, term52269.getClass(), "id", 1193381106528373019L);
        setLongField(term52271, term52271.getClass(), "id", -1365372122034008688L);
        setLongField(term52273, term52273.getClass(), "id", -6108006981756732593L);
        setField(term52273, term52273.getClass(), "extId", term52275);
        setField(term52273, term52273.getClass(), "luid", "fkeYGEUxMA");
        setIntField(term52290, term52290.getClass(), "year", 2017);
        setShortField(term52290, term52290.getClass(), "month", (short) 5);
        setShortField(term52290, term52290.getClass(), "day", (short) 2);
        setField(term52289, term52289.getClass(), "date", term52290);
        setByteField(term52294, term52294.getClass(), "hour", (byte) 7);
        setByteField(term52294, term52294.getClass(), "minute", (byte) 24);
        setByteField(term52294, term52294.getClass(), "second", (byte) 51);
        setIntField(term52294, term52294.getClass(), "nano", 706502334);
        setField(term52289, term52289.getClass(), "time", term52294);
        setField(term52273, term52273.getClass(), "registerTime", term52289);
        setIntField(term52300, term52300.getClass(), "year", 2026);
        setShortField(term52300, term52300.getClass(), "month", (short) 11);
        setShortField(term52300, term52300.getClass(), "day", (short) 1);
        setField(term52299, term52299.getClass(), "date", term52300);
        setByteField(term52304, term52304.getClass(), "hour", (byte) 9);
        setByteField(term52304, term52304.getClass(), "minute", (byte) 4);
        setByteField(term52304, term52304.getClass(), "second", (byte) 25);
        setIntField(term52304, term52304.getClass(), "nano", 272299951);
        setField(term52299, term52299.getClass(), "time", term52304);
        setField(term52273, term52273.getClass(), "accessTime", term52299);
        setField(term52271, term52271.getClass(), "card", term52273);
        setIntField(term52271, term52271.getClass(), "lastDataVersion", 1947256067);
        setField(term52271, term52271.getClass(), "userName", "aJUGPodUIW");
        setIntField(term52271, term52271.getClass(), "point", -2111706143);
        setIntField(term52271, term52271.getClass(), "totalPoint", 1147638144);
        setIntField(term52271, term52271.getClass(), "iconId", 1513541114);
        setIntField(term52271, term52271.getClass(), "nameplateId", 558747577);
        setIntField(term52271, term52271.getClass(), "frameId", 532432884);
        setIntField(term52271, term52271.getClass(), "trophyId", 177236415);
        setIntField(term52271, term52271.getClass(), "playCount", -2132027119);
        setIntField(term52271, term52271.getClass(), "playVsCount", -2101727195);
        setIntField(term52271, term52271.getClass(), "playSyncCount", 2111423493);
        setIntField(term52271, term52271.getClass(), "winCount", -1312934868);
        setIntField(term52271, term52271.getClass(), "helpCount", 603212671);
        setIntField(term52271, term52271.getClass(), "comboCount", 751318072);
        setIntField(term52271, term52271.getClass(), "feverCount", 1804409580);
        setIntField(term52271, term52271.getClass(), "totalHiScore", -1690181848);
        setIntField(term52271, term52271.getClass(), "totalEasyHighScore", 2007546193);
        setIntField(term52271, term52271.getClass(), "totalBasicHighScore", 499702355);
        setIntField(term52271, term52271.getClass(), "totalAdvancedHighScore", 1045240417);
        setIntField(term52271, term52271.getClass(), "totalExpertHighScore", -1436610766);
        setIntField(term52271, term52271.getClass(), "totalMasterHighScore", 276963904);
        setIntField(term52271, term52271.getClass(), "totalReMasterHighScore", -919658244);
        setIntField(term52271, term52271.getClass(), "totalHighSync", -1456911717);
        setIntField(term52271, term52271.getClass(), "totalEasySync", -142288958);
        setIntField(term52271, term52271.getClass(), "totalBasicSync", 1673468911);
        setIntField(term52271, term52271.getClass(), "totalAdvancedSync", 814489039);
        setIntField(term52271, term52271.getClass(), "totalExpertSync", -1649480647);
        setIntField(term52271, term52271.getClass(), "totalMasterSync", 337161557);
        setIntField(term52271, term52271.getClass(), "totalReMasterSync", 2092620912);
        setIntField(term52271, term52271.getClass(), "playerRating", 1992363953);
        setIntField(term52271, term52271.getClass(), "highestRating", -729452443);
        setIntField(term52271, term52271.getClass(), "rankAuthTailId", -1036655415);
        setField(term52271, term52271.getClass(), "eventWatchedDate", "NpjPDfnDRd");
        setField(term52271, term52271.getClass(), "webLimitDate", "SWMYovqYdk");
        setIntField(term52271, term52271.getClass(), "challengeTrackPhase", 2135681292);
        setIntField(term52271, term52271.getClass(), "firstPlayBits", -2013011892);
        setField(term52271, term52271.getClass(), "lastPlayDate", "TQuvAoQcBe");
        setIntField(term52271, term52271.getClass(), "lastPlaceId", 1385680694);
        setField(term52271, term52271.getClass(), "lastPlaceName", "nGYLfZrtWO");
        setIntField(term52271, term52271.getClass(), "lastRegionId", 655709162);
        setField(term52271, term52271.getClass(), "lastRegionName", "DBufEhhBCQ");
        setField(term52271, term52271.getClass(), "lastClientId", "GiNZRBZjgO");
        setField(term52271, term52271.getClass(), "lastCountryCode", "ceGAKcClsG");
        setIntField(term52271, term52271.getClass(), "eventPoint", -1734841021);
        setIntField(term52271, term52271.getClass(), "totalLv", 438683830);
        setIntField(term52271, term52271.getClass(), "lastLoginBonusDay", -317562794);
        setIntField(term52271, term52271.getClass(), "lastSurvivalBonusDay", -34216116);
        setIntField(term52271, term52271.getClass(), "loginBonusLv", -1708491247);
        setField(term52269, term52269.getClass(), "user", term52271);
        setIntField(term52269, term52269.getClass(), "soudEffect", -481096333);
        setIntField(term52269, term52269.getClass(), "mirrorMode", -1194124828);
        setIntField(term52269, term52269.getClass(), "guideSpeed", -1785183910);
        setIntField(term52269, term52269.getClass(), "bgInfo", -152121998);
        setIntField(term52269, term52269.getClass(), "brightness", 494798237);
        setIntField(term52269, term52269.getClass(), "isStarRot", -479962725);
        setIntField(term52269, term52269.getClass(), "breakSe", 686601903);
        setIntField(term52269, term52269.getClass(), "slideSe", 1265406504);
        setIntField(term52269, term52269.getClass(), "hardJudge", 1628889441);
        setIntField(term52269, term52269.getClass(), "isTagJump", 2054724659);
        setIntField(term52269, term52269.getClass(), "breakSeVol", -1112261724);
        setIntField(term52269, term52269.getClass(), "slideSeVol", 439199675);
        setIntField(term52269, term52269.getClass(), "isUpperDisp", 1708450733);
        setIntField(term52269, term52269.getClass(), "trackSkip", -1788885241);
        setIntField(term52269, term52269.getClass(), "optionMode", 1187649321);
        setIntField(term52269, term52269.getClass(), "simpleOptionParam", 1329212097);
        setIntField(term52269, term52269.getClass(), "adjustTiming", 325911335);
        setIntField(term52269, term52269.getClass(), "dispTiming", -2141919241);
        setIntField(term52269, term52269.getClass(), "timingPos", -1932169512);
        setIntField(term52269, term52269.getClass(), "ansVol", 1375409503);
        setIntField(term52269, term52269.getClass(), "noteVol", 2036147808);
        setIntField(term52269, term52269.getClass(), "dmgVol", 1846382479);
        setIntField(term52269, term52269.getClass(), "appealFlame", -461438905);
        setIntField(term52269, term52269.getClass(), "isFeverDisp", -1878286321);
        setIntField(term52269, term52269.getClass(), "dispJudge", 867331913);
        setIntField(term52269, term52269.getClass(), "judgePos", -1360909976);
        setIntField(term52269, term52269.getClass(), "ratingGuard", 507026333);
        setIntField(term52269, term52269.getClass(), "selectChara", 632908451);
        setIntField(term52269, term52269.getClass(), "sortType", -1776006683);
        setIntField(term52269, term52269.getClass(), "filterGenre", 7927502);
        setIntField(term52269, term52269.getClass(), "filterLevel", 1449735015);
        setIntField(term52269, term52269.getClass(), "filterRank", -2039500407);
        setIntField(term52269, term52269.getClass(), "filterVersion", -968543680);
        setIntField(term52269, term52269.getClass(), "filterRec", -1689022557);
        setIntField(term52269, term52269.getClass(), "filterFullCombo", 1722389932);
        setIntField(term52269, term52269.getClass(), "filterAllPerfect", 944378703);
        setIntField(term52269, term52269.getClass(), "filterDifficulty", 69559711);
        setIntField(term52269, term52269.getClass(), "filterFullSync", -1086780030);
        setIntField(term52269, term52269.getClass(), "filterReMaster", 250290750);
        setIntField(term52269, term52269.getClass(), "filterMaxFever", 248490601);
        setIntField(term52269, term52269.getClass(), "finalSelectId", 2110976760);
        setIntField(term52269, term52269.getClass(), "finalSelectCategory", -1837808345);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGuideSpeed", argTypes, term52269, args);
    }

};


