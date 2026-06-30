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

public class UserPlaylog_getBreakScore_80704809232 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term127495;

    public UserPlaylog_getBreakScore_80704809232() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term127501 = new Long(4811527754205378980L);
        term127495 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term127497 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term127499 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term127515 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term127516 = newInstance(Class.forName("java.time.LocalDate"));
        Object term127520 = newInstance(Class.forName("java.time.LocalTime"));
        Object term127525 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term127526 = newInstance(Class.forName("java.time.LocalDate"));
        Object term127530 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term127495, term127495.getClass(), "id", 3151699339436192337L);
        setLongField(term127497, term127497.getClass(), "id", 8601797948269882230L);
        setLongField(term127499, term127499.getClass(), "id", -7129626484175473918L);
        setField(term127499, term127499.getClass(), "extId", term127501);
        setField(term127499, term127499.getClass(), "luid", "bxkUNyUzCb");
        setIntField(term127516, term127516.getClass(), "year", 2023);
        setShortField(term127516, term127516.getClass(), "month", (short) 3);
        setShortField(term127516, term127516.getClass(), "day", (short) 26);
        setField(term127515, term127515.getClass(), "date", term127516);
        setByteField(term127520, term127520.getClass(), "hour", (byte) 7);
        setByteField(term127520, term127520.getClass(), "minute", (byte) 20);
        setByteField(term127520, term127520.getClass(), "second", (byte) 59);
        setIntField(term127520, term127520.getClass(), "nano", 990229662);
        setField(term127515, term127515.getClass(), "time", term127520);
        setField(term127499, term127499.getClass(), "registerTime", term127515);
        setIntField(term127526, term127526.getClass(), "year", 2028);
        setShortField(term127526, term127526.getClass(), "month", (short) 3);
        setShortField(term127526, term127526.getClass(), "day", (short) 16);
        setField(term127525, term127525.getClass(), "date", term127526);
        setByteField(term127530, term127530.getClass(), "hour", (byte) 3);
        setByteField(term127530, term127530.getClass(), "minute", (byte) 36);
        setByteField(term127530, term127530.getClass(), "second", (byte) 15);
        setIntField(term127530, term127530.getClass(), "nano", 536214083);
        setField(term127525, term127525.getClass(), "time", term127530);
        setField(term127499, term127499.getClass(), "accessTime", term127525);
        setField(term127497, term127497.getClass(), "card", term127499);
        setIntField(term127497, term127497.getClass(), "lastDataVersion", -2036780189);
        setField(term127497, term127497.getClass(), "userName", "lyiWNZdiRp");
        setIntField(term127497, term127497.getClass(), "point", -1475767692);
        setIntField(term127497, term127497.getClass(), "totalPoint", -1526337631);
        setIntField(term127497, term127497.getClass(), "iconId", 1413259880);
        setIntField(term127497, term127497.getClass(), "nameplateId", -707058176);
        setIntField(term127497, term127497.getClass(), "frameId", 1810176632);
        setIntField(term127497, term127497.getClass(), "trophyId", -872274514);
        setIntField(term127497, term127497.getClass(), "playCount", 1210866595);
        setIntField(term127497, term127497.getClass(), "playVsCount", -1100589173);
        setIntField(term127497, term127497.getClass(), "playSyncCount", 1988339953);
        setIntField(term127497, term127497.getClass(), "winCount", 1100230399);
        setIntField(term127497, term127497.getClass(), "helpCount", -1544966933);
        setIntField(term127497, term127497.getClass(), "comboCount", -373406556);
        setIntField(term127497, term127497.getClass(), "feverCount", -341758770);
        setIntField(term127497, term127497.getClass(), "totalHiScore", -1876169905);
        setIntField(term127497, term127497.getClass(), "totalEasyHighScore", -243506348);
        setIntField(term127497, term127497.getClass(), "totalBasicHighScore", 76715835);
        setIntField(term127497, term127497.getClass(), "totalAdvancedHighScore", -1207102661);
        setIntField(term127497, term127497.getClass(), "totalExpertHighScore", -2824097);
        setIntField(term127497, term127497.getClass(), "totalMasterHighScore", 322011644);
        setIntField(term127497, term127497.getClass(), "totalReMasterHighScore", -1229888447);
        setIntField(term127497, term127497.getClass(), "totalHighSync", -1053932216);
        setIntField(term127497, term127497.getClass(), "totalEasySync", 1920645313);
        setIntField(term127497, term127497.getClass(), "totalBasicSync", 1445376587);
        setIntField(term127497, term127497.getClass(), "totalAdvancedSync", 1173557411);
        setIntField(term127497, term127497.getClass(), "totalExpertSync", -602481720);
        setIntField(term127497, term127497.getClass(), "totalMasterSync", -652516365);
        setIntField(term127497, term127497.getClass(), "totalReMasterSync", 1407579260);
        setIntField(term127497, term127497.getClass(), "playerRating", -1211428493);
        setIntField(term127497, term127497.getClass(), "highestRating", 1824828795);
        setIntField(term127497, term127497.getClass(), "rankAuthTailId", 1126712238);
        setField(term127497, term127497.getClass(), "eventWatchedDate", "BeeLASibwX");
        setField(term127497, term127497.getClass(), "webLimitDate", "BqctwXkUdR");
        setIntField(term127497, term127497.getClass(), "challengeTrackPhase", 1726829660);
        setIntField(term127497, term127497.getClass(), "firstPlayBits", -131597464);
        setField(term127497, term127497.getClass(), "lastPlayDate", "GRVnFiwbnZ");
        setIntField(term127497, term127497.getClass(), "lastPlaceId", 408558447);
        setField(term127497, term127497.getClass(), "lastPlaceName", "bZevkoTsGp");
        setIntField(term127497, term127497.getClass(), "lastRegionId", -326704512);
        setField(term127497, term127497.getClass(), "lastRegionName", "TjanzjjMgi");
        setField(term127497, term127497.getClass(), "lastClientId", "UOZvJkhjUs");
        setField(term127497, term127497.getClass(), "lastCountryCode", "hUVFihsVHL");
        setIntField(term127497, term127497.getClass(), "eventPoint", -243882414);
        setIntField(term127497, term127497.getClass(), "totalLv", 671126920);
        setIntField(term127497, term127497.getClass(), "lastLoginBonusDay", 1273806754);
        setIntField(term127497, term127497.getClass(), "lastSurvivalBonusDay", -1951879272);
        setIntField(term127497, term127497.getClass(), "loginBonusLv", -2003857250);
        setField(term127495, term127495.getClass(), "user", term127497);
        setIntField(term127495, term127495.getClass(), "orderId", 294839075);
        setLongField(term127495, term127495.getClass(), "sortNumber", -470660852193401098L);
        setIntField(term127495, term127495.getClass(), "placeId", 591258092);
        setField(term127495, term127495.getClass(), "placeName", "PUamQqZNZj");
        setField(term127495, term127495.getClass(), "country", "tfDqvBMzfw");
        setIntField(term127495, term127495.getClass(), "regionId", -1052140576);
        setField(term127495, term127495.getClass(), "playDate", "rJfJfBomXU");
        setField(term127495, term127495.getClass(), "userPlayDate", "kBdJQbVecB");
        setIntField(term127495, term127495.getClass(), "musicId", -271424283);
        setIntField(term127495, term127495.getClass(), "level", 1731549443);
        setIntField(term127495, term127495.getClass(), "gameMode", 1099618075);
        setIntField(term127495, term127495.getClass(), "rivalNum", -1949109167);
        setIntField(term127495, term127495.getClass(), "track", 672435692);
        setIntField(term127495, term127495.getClass(), "eventId", -488001056);
        setBooleanField(term127495, term127495.getClass(), "isFreeToPlay", true);
        setIntField(term127495, term127495.getClass(), "playerRating", -1595822497);
        setLongField(term127495, term127495.getClass(), "playedUserId1", -2861878171001013253L);
        setField(term127495, term127495.getClass(), "playedUserName1", "JlirfQsPTm");
        setIntField(term127495, term127495.getClass(), "playedMusicLevel1", 845221249);
        setLongField(term127495, term127495.getClass(), "playedUserId2", 8195384410089351384L);
        setField(term127495, term127495.getClass(), "playedUserName2", "jqfJtiVFaf");
        setIntField(term127495, term127495.getClass(), "playedMusicLevel2", 493327780);
        setLongField(term127495, term127495.getClass(), "playedUserId3", -6437827706975956105L);
        setField(term127495, term127495.getClass(), "playedUserName3", "ZvqUprynBE");
        setIntField(term127495, term127495.getClass(), "playedMusicLevel3", 1273239065);
        setIntField(term127495, term127495.getClass(), "achievement", 206098664);
        setIntField(term127495, term127495.getClass(), "score", 1145017472);
        setIntField(term127495, term127495.getClass(), "tapScore", 2065041254);
        setIntField(term127495, term127495.getClass(), "holdScore", 2066778785);
        setIntField(term127495, term127495.getClass(), "slideScore", -1664190515);
        setIntField(term127495, term127495.getClass(), "breakScore", 580491493);
        setIntField(term127495, term127495.getClass(), "syncRate", 387297918);
        setIntField(term127495, term127495.getClass(), "vsWin", -1932797129);
        setBooleanField(term127495, term127495.getClass(), "isAllPerfect", true);
        setIntField(term127495, term127495.getClass(), "fullCombo", 58661935);
        setIntField(term127495, term127495.getClass(), "maxFever", -2141739997);
        setIntField(term127495, term127495.getClass(), "maxCombo", 1174212845);
        setIntField(term127495, term127495.getClass(), "tapPerfect", -836471847);
        setIntField(term127495, term127495.getClass(), "tapGreat", -393198178);
        setIntField(term127495, term127495.getClass(), "tapGood", 1492611616);
        setIntField(term127495, term127495.getClass(), "tapBad", 1159845482);
        setIntField(term127495, term127495.getClass(), "holdPerfect", -1320493702);
        setIntField(term127495, term127495.getClass(), "holdGreat", 352279226);
        setIntField(term127495, term127495.getClass(), "holdGood", -405922040);
        setIntField(term127495, term127495.getClass(), "holdBad", 241363882);
        setIntField(term127495, term127495.getClass(), "slidePerfect", 207671794);
        setIntField(term127495, term127495.getClass(), "slideGreat", 1035622429);
        setIntField(term127495, term127495.getClass(), "slideGood", 249486941);
        setIntField(term127495, term127495.getClass(), "slideBad", 679500257);
        setIntField(term127495, term127495.getClass(), "breakPerfect", 1649482549);
        setIntField(term127495, term127495.getClass(), "breakGreat", 140677496);
        setIntField(term127495, term127495.getClass(), "breakGood", -1669492910);
        setIntField(term127495, term127495.getClass(), "breakBad", -200807801);
        setBooleanField(term127495, term127495.getClass(), "isTrackSkip", true);
        setBooleanField(term127495, term127495.getClass(), "isHighScore", true);
        setBooleanField(term127495, term127495.getClass(), "isChallengeTrack", true);
        setIntField(term127495, term127495.getClass(), "challengeLife", 2076815815);
        setIntField(term127495, term127495.getClass(), "challengeRemain", -1877483268);
        setIntField(term127495, term127495.getClass(), "isAllPerfectPlus", -896155047);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBreakScore", argTypes, term127495, args);
    }

};


