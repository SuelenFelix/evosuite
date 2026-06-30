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

public class UserOption_setFilterReMaster_81040537385 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77251;
     Object term77469;

    public UserOption_setFilterReMaster_81040537385() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term77257 = new Long(5184635470881147510L);
        term77251 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption"));
        Object term77253 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term77255 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term77271 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term77272 = newInstance(Class.forName("java.time.LocalDate"));
        Object term77276 = newInstance(Class.forName("java.time.LocalTime"));
        Object term77281 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term77282 = newInstance(Class.forName("java.time.LocalDate"));
        Object term77286 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term77251, term77251.getClass(), "id", 5271284328066798769L);
        setLongField(term77253, term77253.getClass(), "id", 1924411240174876881L);
        setLongField(term77255, term77255.getClass(), "id", -8287954071414913487L);
        setField(term77255, term77255.getClass(), "extId", term77257);
        setField(term77255, term77255.getClass(), "luid", "LBNEEquiet");
        setIntField(term77272, term77272.getClass(), "year", 2013);
        setShortField(term77272, term77272.getClass(), "month", (short) 9);
        setShortField(term77272, term77272.getClass(), "day", (short) 12);
        setField(term77271, term77271.getClass(), "date", term77272);
        setByteField(term77276, term77276.getClass(), "hour", (byte) 19);
        setByteField(term77276, term77276.getClass(), "minute", (byte) 26);
        setByteField(term77276, term77276.getClass(), "second", (byte) 25);
        setIntField(term77276, term77276.getClass(), "nano", 897835144);
        setField(term77271, term77271.getClass(), "time", term77276);
        setField(term77255, term77255.getClass(), "registerTime", term77271);
        setIntField(term77282, term77282.getClass(), "year", 2014);
        setShortField(term77282, term77282.getClass(), "month", (short) 6);
        setShortField(term77282, term77282.getClass(), "day", (short) 17);
        setField(term77281, term77281.getClass(), "date", term77282);
        setByteField(term77286, term77286.getClass(), "hour", (byte) 1);
        setByteField(term77286, term77286.getClass(), "minute", (byte) 42);
        setByteField(term77286, term77286.getClass(), "second", (byte) 16);
        setIntField(term77286, term77286.getClass(), "nano", 607959128);
        setField(term77281, term77281.getClass(), "time", term77286);
        setField(term77255, term77255.getClass(), "accessTime", term77281);
        setField(term77253, term77253.getClass(), "card", term77255);
        setIntField(term77253, term77253.getClass(), "lastDataVersion", 672665437);
        setField(term77253, term77253.getClass(), "userName", "cBMdxJirJj");
        setIntField(term77253, term77253.getClass(), "point", -28548982);
        setIntField(term77253, term77253.getClass(), "totalPoint", 1976376491);
        setIntField(term77253, term77253.getClass(), "iconId", 849311838);
        setIntField(term77253, term77253.getClass(), "nameplateId", -2041662844);
        setIntField(term77253, term77253.getClass(), "frameId", 867518512);
        setIntField(term77253, term77253.getClass(), "trophyId", 46460788);
        setIntField(term77253, term77253.getClass(), "playCount", -1763767597);
        setIntField(term77253, term77253.getClass(), "playVsCount", -106138011);
        setIntField(term77253, term77253.getClass(), "playSyncCount", -1019012612);
        setIntField(term77253, term77253.getClass(), "winCount", 141522548);
        setIntField(term77253, term77253.getClass(), "helpCount", 1957150366);
        setIntField(term77253, term77253.getClass(), "comboCount", -1442578297);
        setIntField(term77253, term77253.getClass(), "feverCount", 1147293585);
        setIntField(term77253, term77253.getClass(), "totalHiScore", 983648264);
        setIntField(term77253, term77253.getClass(), "totalEasyHighScore", -778484185);
        setIntField(term77253, term77253.getClass(), "totalBasicHighScore", 317333804);
        setIntField(term77253, term77253.getClass(), "totalAdvancedHighScore", 780704931);
        setIntField(term77253, term77253.getClass(), "totalExpertHighScore", 1433790124);
        setIntField(term77253, term77253.getClass(), "totalMasterHighScore", -134680413);
        setIntField(term77253, term77253.getClass(), "totalReMasterHighScore", 1593555430);
        setIntField(term77253, term77253.getClass(), "totalHighSync", 1804669953);
        setIntField(term77253, term77253.getClass(), "totalEasySync", -813884495);
        setIntField(term77253, term77253.getClass(), "totalBasicSync", -915472199);
        setIntField(term77253, term77253.getClass(), "totalAdvancedSync", -712836753);
        setIntField(term77253, term77253.getClass(), "totalExpertSync", 2051479764);
        setIntField(term77253, term77253.getClass(), "totalMasterSync", -967390932);
        setIntField(term77253, term77253.getClass(), "totalReMasterSync", -1594865304);
        setIntField(term77253, term77253.getClass(), "playerRating", 1209270458);
        setIntField(term77253, term77253.getClass(), "highestRating", 1557700648);
        setIntField(term77253, term77253.getClass(), "rankAuthTailId", 166029105);
        setField(term77253, term77253.getClass(), "eventWatchedDate", "kVnxgkemHF");
        setField(term77253, term77253.getClass(), "webLimitDate", "JUQnEoujef");
        setIntField(term77253, term77253.getClass(), "challengeTrackPhase", -139840217);
        setIntField(term77253, term77253.getClass(), "firstPlayBits", 648430917);
        setField(term77253, term77253.getClass(), "lastPlayDate", "riXARUiigm");
        setIntField(term77253, term77253.getClass(), "lastPlaceId", 1936492204);
        setField(term77253, term77253.getClass(), "lastPlaceName", "RbXhBDZbRT");
        setIntField(term77253, term77253.getClass(), "lastRegionId", 1208918081);
        setField(term77253, term77253.getClass(), "lastRegionName", "QDaTqkWnGj");
        setField(term77253, term77253.getClass(), "lastClientId", "vNObzQvzxo");
        setField(term77253, term77253.getClass(), "lastCountryCode", "uyuWzXeJvn");
        setIntField(term77253, term77253.getClass(), "eventPoint", -444228787);
        setIntField(term77253, term77253.getClass(), "totalLv", 858866865);
        setIntField(term77253, term77253.getClass(), "lastLoginBonusDay", -1549664587);
        setIntField(term77253, term77253.getClass(), "lastSurvivalBonusDay", 1048887552);
        setIntField(term77253, term77253.getClass(), "loginBonusLv", 1614219187);
        setField(term77251, term77251.getClass(), "user", term77253);
        setIntField(term77251, term77251.getClass(), "soudEffect", 1059610003);
        setIntField(term77251, term77251.getClass(), "mirrorMode", 109730440);
        setIntField(term77251, term77251.getClass(), "guideSpeed", -1467289814);
        setIntField(term77251, term77251.getClass(), "bgInfo", 35215511);
        setIntField(term77251, term77251.getClass(), "brightness", -2036670068);
        setIntField(term77251, term77251.getClass(), "isStarRot", -2013350184);
        setIntField(term77251, term77251.getClass(), "breakSe", -1219404857);
        setIntField(term77251, term77251.getClass(), "slideSe", 2121914051);
        setIntField(term77251, term77251.getClass(), "hardJudge", 192590998);
        setIntField(term77251, term77251.getClass(), "isTagJump", -263763571);
        setIntField(term77251, term77251.getClass(), "breakSeVol", 329639070);
        setIntField(term77251, term77251.getClass(), "slideSeVol", 2043358189);
        setIntField(term77251, term77251.getClass(), "isUpperDisp", 1222446497);
        setIntField(term77251, term77251.getClass(), "trackSkip", 1143101638);
        setIntField(term77251, term77251.getClass(), "optionMode", 847829222);
        setIntField(term77251, term77251.getClass(), "simpleOptionParam", -1549345951);
        setIntField(term77251, term77251.getClass(), "adjustTiming", 120466526);
        setIntField(term77251, term77251.getClass(), "dispTiming", 194321953);
        setIntField(term77251, term77251.getClass(), "timingPos", -1560488637);
        setIntField(term77251, term77251.getClass(), "ansVol", -186965795);
        setIntField(term77251, term77251.getClass(), "noteVol", 1888098393);
        setIntField(term77251, term77251.getClass(), "dmgVol", 902896185);
        setIntField(term77251, term77251.getClass(), "appealFlame", -1788613904);
        setIntField(term77251, term77251.getClass(), "isFeverDisp", 1060985275);
        setIntField(term77251, term77251.getClass(), "dispJudge", 2096741709);
        setIntField(term77251, term77251.getClass(), "judgePos", 203201648);
        setIntField(term77251, term77251.getClass(), "ratingGuard", 1395361336);
        setIntField(term77251, term77251.getClass(), "selectChara", -1646830507);
        setIntField(term77251, term77251.getClass(), "sortType", -1166739277);
        setIntField(term77251, term77251.getClass(), "filterGenre", 257262317);
        setIntField(term77251, term77251.getClass(), "filterLevel", -2085894102);
        setIntField(term77251, term77251.getClass(), "filterRank", 1015570852);
        setIntField(term77251, term77251.getClass(), "filterVersion", 2038394011);
        setIntField(term77251, term77251.getClass(), "filterRec", 261191400);
        setIntField(term77251, term77251.getClass(), "filterFullCombo", -1204402292);
        setIntField(term77251, term77251.getClass(), "filterAllPerfect", -1265081046);
        setIntField(term77251, term77251.getClass(), "filterDifficulty", -1103156289);
        setIntField(term77251, term77251.getClass(), "filterFullSync", 734996772);
        setIntField(term77251, term77251.getClass(), "filterReMaster", -929338097);
        setIntField(term77251, term77251.getClass(), "filterMaxFever", 1514610449);
        setIntField(term77251, term77251.getClass(), "finalSelectId", -1941335339);
        setIntField(term77251, term77251.getClass(), "finalSelectCategory", 1423987389);
        term77469 = new Integer(2049760964);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term77469;
        callMethod(klass, "setFilterReMaster", argTypes, term77251, args);
    }

};


