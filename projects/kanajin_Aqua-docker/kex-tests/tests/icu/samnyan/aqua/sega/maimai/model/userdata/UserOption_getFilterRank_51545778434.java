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

public class UserOption_getFilterRank_51545778434 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61201;

    public UserOption_getFilterRank_51545778434() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term61207 = new Long(5330761990446327930L);
        term61201 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption"));
        Object term61203 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term61205 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term61221 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term61222 = newInstance(Class.forName("java.time.LocalDate"));
        Object term61226 = newInstance(Class.forName("java.time.LocalTime"));
        Object term61231 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term61232 = newInstance(Class.forName("java.time.LocalDate"));
        Object term61236 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term61201, term61201.getClass(), "id", 5097769785635819744L);
        setLongField(term61203, term61203.getClass(), "id", 9192899183781208922L);
        setLongField(term61205, term61205.getClass(), "id", -7705159544905337794L);
        setField(term61205, term61205.getClass(), "extId", term61207);
        setField(term61205, term61205.getClass(), "luid", "NjmSJhbVEM");
        setIntField(term61222, term61222.getClass(), "year", 2028);
        setShortField(term61222, term61222.getClass(), "month", (short) 4);
        setShortField(term61222, term61222.getClass(), "day", (short) 19);
        setField(term61221, term61221.getClass(), "date", term61222);
        setByteField(term61226, term61226.getClass(), "hour", (byte) 1);
        setByteField(term61226, term61226.getClass(), "minute", (byte) 47);
        setByteField(term61226, term61226.getClass(), "second", (byte) 52);
        setIntField(term61226, term61226.getClass(), "nano", 666536453);
        setField(term61221, term61221.getClass(), "time", term61226);
        setField(term61205, term61205.getClass(), "registerTime", term61221);
        setIntField(term61232, term61232.getClass(), "year", 2023);
        setShortField(term61232, term61232.getClass(), "month", (short) 12);
        setShortField(term61232, term61232.getClass(), "day", (short) 8);
        setField(term61231, term61231.getClass(), "date", term61232);
        setByteField(term61236, term61236.getClass(), "hour", (byte) 1);
        setByteField(term61236, term61236.getClass(), "minute", (byte) 26);
        setByteField(term61236, term61236.getClass(), "second", (byte) 38);
        setIntField(term61236, term61236.getClass(), "nano", 334721598);
        setField(term61231, term61231.getClass(), "time", term61236);
        setField(term61205, term61205.getClass(), "accessTime", term61231);
        setField(term61203, term61203.getClass(), "card", term61205);
        setIntField(term61203, term61203.getClass(), "lastDataVersion", 243686870);
        setField(term61203, term61203.getClass(), "userName", "aftnGRjhKN");
        setIntField(term61203, term61203.getClass(), "point", -220352077);
        setIntField(term61203, term61203.getClass(), "totalPoint", -248969650);
        setIntField(term61203, term61203.getClass(), "iconId", 33246852);
        setIntField(term61203, term61203.getClass(), "nameplateId", 1051049624);
        setIntField(term61203, term61203.getClass(), "frameId", 23316800);
        setIntField(term61203, term61203.getClass(), "trophyId", 1501200024);
        setIntField(term61203, term61203.getClass(), "playCount", 813083025);
        setIntField(term61203, term61203.getClass(), "playVsCount", 1439986578);
        setIntField(term61203, term61203.getClass(), "playSyncCount", -1393477237);
        setIntField(term61203, term61203.getClass(), "winCount", 1806901617);
        setIntField(term61203, term61203.getClass(), "helpCount", -1060700711);
        setIntField(term61203, term61203.getClass(), "comboCount", 1281979005);
        setIntField(term61203, term61203.getClass(), "feverCount", -1535572179);
        setIntField(term61203, term61203.getClass(), "totalHiScore", -1210680742);
        setIntField(term61203, term61203.getClass(), "totalEasyHighScore", -2024761841);
        setIntField(term61203, term61203.getClass(), "totalBasicHighScore", 517435996);
        setIntField(term61203, term61203.getClass(), "totalAdvancedHighScore", 997085806);
        setIntField(term61203, term61203.getClass(), "totalExpertHighScore", -1890633633);
        setIntField(term61203, term61203.getClass(), "totalMasterHighScore", 556792495);
        setIntField(term61203, term61203.getClass(), "totalReMasterHighScore", 1635397327);
        setIntField(term61203, term61203.getClass(), "totalHighSync", -1407747575);
        setIntField(term61203, term61203.getClass(), "totalEasySync", -129952888);
        setIntField(term61203, term61203.getClass(), "totalBasicSync", 1093590118);
        setIntField(term61203, term61203.getClass(), "totalAdvancedSync", -610005848);
        setIntField(term61203, term61203.getClass(), "totalExpertSync", 1856644657);
        setIntField(term61203, term61203.getClass(), "totalMasterSync", -1777396332);
        setIntField(term61203, term61203.getClass(), "totalReMasterSync", 1949483184);
        setIntField(term61203, term61203.getClass(), "playerRating", -116853826);
        setIntField(term61203, term61203.getClass(), "highestRating", 720273368);
        setIntField(term61203, term61203.getClass(), "rankAuthTailId", 439433705);
        setField(term61203, term61203.getClass(), "eventWatchedDate", "TirWkyiCHh");
        setField(term61203, term61203.getClass(), "webLimitDate", "lsQrIFMkgZ");
        setIntField(term61203, term61203.getClass(), "challengeTrackPhase", 651646147);
        setIntField(term61203, term61203.getClass(), "firstPlayBits", -182685183);
        setField(term61203, term61203.getClass(), "lastPlayDate", "VgAyBhgBhq");
        setIntField(term61203, term61203.getClass(), "lastPlaceId", 1900550190);
        setField(term61203, term61203.getClass(), "lastPlaceName", "nhpssUKjpK");
        setIntField(term61203, term61203.getClass(), "lastRegionId", -223373115);
        setField(term61203, term61203.getClass(), "lastRegionName", "lnJVsFNsCN");
        setField(term61203, term61203.getClass(), "lastClientId", "CUagRkEuzN");
        setField(term61203, term61203.getClass(), "lastCountryCode", "eWIWfWobXm");
        setIntField(term61203, term61203.getClass(), "eventPoint", -2069853525);
        setIntField(term61203, term61203.getClass(), "totalLv", -20546610);
        setIntField(term61203, term61203.getClass(), "lastLoginBonusDay", 2028422247);
        setIntField(term61203, term61203.getClass(), "lastSurvivalBonusDay", 776507834);
        setIntField(term61203, term61203.getClass(), "loginBonusLv", -1588665163);
        setField(term61201, term61201.getClass(), "user", term61203);
        setIntField(term61201, term61201.getClass(), "soudEffect", -986489468);
        setIntField(term61201, term61201.getClass(), "mirrorMode", -204607039);
        setIntField(term61201, term61201.getClass(), "guideSpeed", 78293336);
        setIntField(term61201, term61201.getClass(), "bgInfo", -257780975);
        setIntField(term61201, term61201.getClass(), "brightness", 1303949911);
        setIntField(term61201, term61201.getClass(), "isStarRot", 981415365);
        setIntField(term61201, term61201.getClass(), "breakSe", 578948651);
        setIntField(term61201, term61201.getClass(), "slideSe", -159365198);
        setIntField(term61201, term61201.getClass(), "hardJudge", 403862627);
        setIntField(term61201, term61201.getClass(), "isTagJump", -1058988340);
        setIntField(term61201, term61201.getClass(), "breakSeVol", 10811623);
        setIntField(term61201, term61201.getClass(), "slideSeVol", 188015737);
        setIntField(term61201, term61201.getClass(), "isUpperDisp", 1054374404);
        setIntField(term61201, term61201.getClass(), "trackSkip", -666072892);
        setIntField(term61201, term61201.getClass(), "optionMode", -626435102);
        setIntField(term61201, term61201.getClass(), "simpleOptionParam", 734226321);
        setIntField(term61201, term61201.getClass(), "adjustTiming", -818023324);
        setIntField(term61201, term61201.getClass(), "dispTiming", 540998196);
        setIntField(term61201, term61201.getClass(), "timingPos", -1360947775);
        setIntField(term61201, term61201.getClass(), "ansVol", -688211428);
        setIntField(term61201, term61201.getClass(), "noteVol", 976339797);
        setIntField(term61201, term61201.getClass(), "dmgVol", -606155396);
        setIntField(term61201, term61201.getClass(), "appealFlame", 1734679414);
        setIntField(term61201, term61201.getClass(), "isFeverDisp", -1815657201);
        setIntField(term61201, term61201.getClass(), "dispJudge", -888163744);
        setIntField(term61201, term61201.getClass(), "judgePos", 1589783137);
        setIntField(term61201, term61201.getClass(), "ratingGuard", 1822772585);
        setIntField(term61201, term61201.getClass(), "selectChara", -1240567719);
        setIntField(term61201, term61201.getClass(), "sortType", 444592925);
        setIntField(term61201, term61201.getClass(), "filterGenre", 1533907913);
        setIntField(term61201, term61201.getClass(), "filterLevel", 1834871797);
        setIntField(term61201, term61201.getClass(), "filterRank", 2074112074);
        setIntField(term61201, term61201.getClass(), "filterVersion", -1339856700);
        setIntField(term61201, term61201.getClass(), "filterRec", -1979249214);
        setIntField(term61201, term61201.getClass(), "filterFullCombo", -793518315);
        setIntField(term61201, term61201.getClass(), "filterAllPerfect", 2091844914);
        setIntField(term61201, term61201.getClass(), "filterDifficulty", 2021693700);
        setIntField(term61201, term61201.getClass(), "filterFullSync", -1710809144);
        setIntField(term61201, term61201.getClass(), "filterReMaster", -1253292706);
        setIntField(term61201, term61201.getClass(), "filterMaxFever", 1627263304);
        setIntField(term61201, term61201.getClass(), "finalSelectId", 2005816851);
        setIntField(term61201, term61201.getClass(), "finalSelectCategory", -293521593);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFilterRank", argTypes, term61201, args);
    }

};


