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

public class UserOption_setGuideSpeed_3386473749 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66091;
     Object term66309;

    public UserOption_setGuideSpeed_3386473749() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term66097 = new Long(5904678961906211249L);
        term66091 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption"));
        Object term66093 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term66095 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term66111 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term66112 = newInstance(Class.forName("java.time.LocalDate"));
        Object term66116 = newInstance(Class.forName("java.time.LocalTime"));
        Object term66121 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term66122 = newInstance(Class.forName("java.time.LocalDate"));
        Object term66126 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term66091, term66091.getClass(), "id", 7199459243454109261L);
        setLongField(term66093, term66093.getClass(), "id", -1009485425289165749L);
        setLongField(term66095, term66095.getClass(), "id", -5044181804110715069L);
        setField(term66095, term66095.getClass(), "extId", term66097);
        setField(term66095, term66095.getClass(), "luid", "SqMpUczXhg");
        setIntField(term66112, term66112.getClass(), "year", 2014);
        setShortField(term66112, term66112.getClass(), "month", (short) 11);
        setShortField(term66112, term66112.getClass(), "day", (short) 17);
        setField(term66111, term66111.getClass(), "date", term66112);
        setByteField(term66116, term66116.getClass(), "hour", (byte) 16);
        setByteField(term66116, term66116.getClass(), "minute", (byte) 57);
        setByteField(term66116, term66116.getClass(), "second", (byte) 36);
        setIntField(term66116, term66116.getClass(), "nano", 336508243);
        setField(term66111, term66111.getClass(), "time", term66116);
        setField(term66095, term66095.getClass(), "registerTime", term66111);
        setIntField(term66122, term66122.getClass(), "year", 2020);
        setShortField(term66122, term66122.getClass(), "month", (short) 5);
        setShortField(term66122, term66122.getClass(), "day", (short) 21);
        setField(term66121, term66121.getClass(), "date", term66122);
        setByteField(term66126, term66126.getClass(), "hour", (byte) 1);
        setByteField(term66126, term66126.getClass(), "minute", (byte) 0);
        setByteField(term66126, term66126.getClass(), "second", (byte) 30);
        setIntField(term66126, term66126.getClass(), "nano", 495919259);
        setField(term66121, term66121.getClass(), "time", term66126);
        setField(term66095, term66095.getClass(), "accessTime", term66121);
        setField(term66093, term66093.getClass(), "card", term66095);
        setIntField(term66093, term66093.getClass(), "lastDataVersion", -579422575);
        setField(term66093, term66093.getClass(), "userName", "voDQuoTpgt");
        setIntField(term66093, term66093.getClass(), "point", 223876386);
        setIntField(term66093, term66093.getClass(), "totalPoint", 87499307);
        setIntField(term66093, term66093.getClass(), "iconId", 762125008);
        setIntField(term66093, term66093.getClass(), "nameplateId", -828578391);
        setIntField(term66093, term66093.getClass(), "frameId", 1227082809);
        setIntField(term66093, term66093.getClass(), "trophyId", -830464254);
        setIntField(term66093, term66093.getClass(), "playCount", -1633113382);
        setIntField(term66093, term66093.getClass(), "playVsCount", 1665043120);
        setIntField(term66093, term66093.getClass(), "playSyncCount", -1816157328);
        setIntField(term66093, term66093.getClass(), "winCount", -1918609852);
        setIntField(term66093, term66093.getClass(), "helpCount", -1410223524);
        setIntField(term66093, term66093.getClass(), "comboCount", 1492158172);
        setIntField(term66093, term66093.getClass(), "feverCount", 705497880);
        setIntField(term66093, term66093.getClass(), "totalHiScore", -540039355);
        setIntField(term66093, term66093.getClass(), "totalEasyHighScore", -319029519);
        setIntField(term66093, term66093.getClass(), "totalBasicHighScore", 856050368);
        setIntField(term66093, term66093.getClass(), "totalAdvancedHighScore", 1929961324);
        setIntField(term66093, term66093.getClass(), "totalExpertHighScore", 342396095);
        setIntField(term66093, term66093.getClass(), "totalMasterHighScore", 352957175);
        setIntField(term66093, term66093.getClass(), "totalReMasterHighScore", -416881882);
        setIntField(term66093, term66093.getClass(), "totalHighSync", 272127700);
        setIntField(term66093, term66093.getClass(), "totalEasySync", -1473075262);
        setIntField(term66093, term66093.getClass(), "totalBasicSync", 443000686);
        setIntField(term66093, term66093.getClass(), "totalAdvancedSync", 1667596064);
        setIntField(term66093, term66093.getClass(), "totalExpertSync", -251654040);
        setIntField(term66093, term66093.getClass(), "totalMasterSync", -1843755543);
        setIntField(term66093, term66093.getClass(), "totalReMasterSync", -852260826);
        setIntField(term66093, term66093.getClass(), "playerRating", -418135199);
        setIntField(term66093, term66093.getClass(), "highestRating", -998308174);
        setIntField(term66093, term66093.getClass(), "rankAuthTailId", 943396558);
        setField(term66093, term66093.getClass(), "eventWatchedDate", "wgwSIKAsrj");
        setField(term66093, term66093.getClass(), "webLimitDate", "aGJCHRHyCe");
        setIntField(term66093, term66093.getClass(), "challengeTrackPhase", -249229799);
        setIntField(term66093, term66093.getClass(), "firstPlayBits", 1410694856);
        setField(term66093, term66093.getClass(), "lastPlayDate", "WingwhSgfc");
        setIntField(term66093, term66093.getClass(), "lastPlaceId", -1629525320);
        setField(term66093, term66093.getClass(), "lastPlaceName", "YEcmxINfnL");
        setIntField(term66093, term66093.getClass(), "lastRegionId", -675248961);
        setField(term66093, term66093.getClass(), "lastRegionName", "EGytMwlDVe");
        setField(term66093, term66093.getClass(), "lastClientId", "GFQCmYZmcg");
        setField(term66093, term66093.getClass(), "lastCountryCode", "qPgbFtsgtk");
        setIntField(term66093, term66093.getClass(), "eventPoint", 633732117);
        setIntField(term66093, term66093.getClass(), "totalLv", 2061669437);
        setIntField(term66093, term66093.getClass(), "lastLoginBonusDay", 1974184760);
        setIntField(term66093, term66093.getClass(), "lastSurvivalBonusDay", -2074909519);
        setIntField(term66093, term66093.getClass(), "loginBonusLv", -1055211106);
        setField(term66091, term66091.getClass(), "user", term66093);
        setIntField(term66091, term66091.getClass(), "soudEffect", -1730335296);
        setIntField(term66091, term66091.getClass(), "mirrorMode", -891933643);
        setIntField(term66091, term66091.getClass(), "guideSpeed", -1896713868);
        setIntField(term66091, term66091.getClass(), "bgInfo", -461903855);
        setIntField(term66091, term66091.getClass(), "brightness", -865104705);
        setIntField(term66091, term66091.getClass(), "isStarRot", -871992654);
        setIntField(term66091, term66091.getClass(), "breakSe", 2144355880);
        setIntField(term66091, term66091.getClass(), "slideSe", -1872843252);
        setIntField(term66091, term66091.getClass(), "hardJudge", -1245312089);
        setIntField(term66091, term66091.getClass(), "isTagJump", -1415132995);
        setIntField(term66091, term66091.getClass(), "breakSeVol", -298988561);
        setIntField(term66091, term66091.getClass(), "slideSeVol", 83719437);
        setIntField(term66091, term66091.getClass(), "isUpperDisp", 992945340);
        setIntField(term66091, term66091.getClass(), "trackSkip", -1487299154);
        setIntField(term66091, term66091.getClass(), "optionMode", 1803636451);
        setIntField(term66091, term66091.getClass(), "simpleOptionParam", -409541287);
        setIntField(term66091, term66091.getClass(), "adjustTiming", -294350291);
        setIntField(term66091, term66091.getClass(), "dispTiming", 741222064);
        setIntField(term66091, term66091.getClass(), "timingPos", -1480233398);
        setIntField(term66091, term66091.getClass(), "ansVol", 735898654);
        setIntField(term66091, term66091.getClass(), "noteVol", -1440883870);
        setIntField(term66091, term66091.getClass(), "dmgVol", -1201667200);
        setIntField(term66091, term66091.getClass(), "appealFlame", -1698014200);
        setIntField(term66091, term66091.getClass(), "isFeverDisp", -1048905765);
        setIntField(term66091, term66091.getClass(), "dispJudge", 196993945);
        setIntField(term66091, term66091.getClass(), "judgePos", 1692789621);
        setIntField(term66091, term66091.getClass(), "ratingGuard", 1024925524);
        setIntField(term66091, term66091.getClass(), "selectChara", 1138562815);
        setIntField(term66091, term66091.getClass(), "sortType", -1468904016);
        setIntField(term66091, term66091.getClass(), "filterGenre", -1831885121);
        setIntField(term66091, term66091.getClass(), "filterLevel", -1987064146);
        setIntField(term66091, term66091.getClass(), "filterRank", 184016080);
        setIntField(term66091, term66091.getClass(), "filterVersion", -2083206845);
        setIntField(term66091, term66091.getClass(), "filterRec", -1045178381);
        setIntField(term66091, term66091.getClass(), "filterFullCombo", -1427049200);
        setIntField(term66091, term66091.getClass(), "filterAllPerfect", -911265650);
        setIntField(term66091, term66091.getClass(), "filterDifficulty", 218864889);
        setIntField(term66091, term66091.getClass(), "filterFullSync", -1988994618);
        setIntField(term66091, term66091.getClass(), "filterReMaster", 1551865443);
        setIntField(term66091, term66091.getClass(), "filterMaxFever", -1883739433);
        setIntField(term66091, term66091.getClass(), "finalSelectId", -492305893);
        setIntField(term66091, term66091.getClass(), "finalSelectCategory", -1969736424);
        term66309 = new Integer(1464895284);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term66309;
        callMethod(klass, "setGuideSpeed", argTypes, term66091, args);
    }

};


