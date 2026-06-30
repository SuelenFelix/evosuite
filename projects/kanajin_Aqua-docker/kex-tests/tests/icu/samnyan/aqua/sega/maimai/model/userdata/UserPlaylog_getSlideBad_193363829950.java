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

public class UserPlaylog_getSlideBad_193363829950 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term135991;

    public UserPlaylog_getSlideBad_193363829950() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term135997 = new Long(-7423063312741500355L);
        term135991 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term135993 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term135995 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term136011 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term136012 = newInstance(Class.forName("java.time.LocalDate"));
        Object term136016 = newInstance(Class.forName("java.time.LocalTime"));
        Object term136021 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term136022 = newInstance(Class.forName("java.time.LocalDate"));
        Object term136026 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term135991, term135991.getClass(), "id", -1155047331993508760L);
        setLongField(term135993, term135993.getClass(), "id", 3144720397872891648L);
        setLongField(term135995, term135995.getClass(), "id", -2622219131724744003L);
        setField(term135995, term135995.getClass(), "extId", term135997);
        setField(term135995, term135995.getClass(), "luid", "KMDtTdvTCJ");
        setIntField(term136012, term136012.getClass(), "year", 2016);
        setShortField(term136012, term136012.getClass(), "month", (short) 6);
        setShortField(term136012, term136012.getClass(), "day", (short) 2);
        setField(term136011, term136011.getClass(), "date", term136012);
        setByteField(term136016, term136016.getClass(), "hour", (byte) 5);
        setByteField(term136016, term136016.getClass(), "minute", (byte) 24);
        setByteField(term136016, term136016.getClass(), "second", (byte) 28);
        setIntField(term136016, term136016.getClass(), "nano", 586692762);
        setField(term136011, term136011.getClass(), "time", term136016);
        setField(term135995, term135995.getClass(), "registerTime", term136011);
        setIntField(term136022, term136022.getClass(), "year", 2012);
        setShortField(term136022, term136022.getClass(), "month", (short) 3);
        setShortField(term136022, term136022.getClass(), "day", (short) 20);
        setField(term136021, term136021.getClass(), "date", term136022);
        setByteField(term136026, term136026.getClass(), "hour", (byte) 16);
        setByteField(term136026, term136026.getClass(), "minute", (byte) 41);
        setByteField(term136026, term136026.getClass(), "second", (byte) 13);
        setIntField(term136026, term136026.getClass(), "nano", 546552876);
        setField(term136021, term136021.getClass(), "time", term136026);
        setField(term135995, term135995.getClass(), "accessTime", term136021);
        setField(term135993, term135993.getClass(), "card", term135995);
        setIntField(term135993, term135993.getClass(), "lastDataVersion", -1232558510);
        setField(term135993, term135993.getClass(), "userName", "EGFHrFOTWy");
        setIntField(term135993, term135993.getClass(), "point", -1593478425);
        setIntField(term135993, term135993.getClass(), "totalPoint", -1069502098);
        setIntField(term135993, term135993.getClass(), "iconId", 1543953179);
        setIntField(term135993, term135993.getClass(), "nameplateId", 1411978050);
        setIntField(term135993, term135993.getClass(), "frameId", 581571023);
        setIntField(term135993, term135993.getClass(), "trophyId", -150922197);
        setIntField(term135993, term135993.getClass(), "playCount", 374168654);
        setIntField(term135993, term135993.getClass(), "playVsCount", 550576763);
        setIntField(term135993, term135993.getClass(), "playSyncCount", 1169615135);
        setIntField(term135993, term135993.getClass(), "winCount", 936896201);
        setIntField(term135993, term135993.getClass(), "helpCount", -577135458);
        setIntField(term135993, term135993.getClass(), "comboCount", -2015362123);
        setIntField(term135993, term135993.getClass(), "feverCount", 1512483063);
        setIntField(term135993, term135993.getClass(), "totalHiScore", -1114353828);
        setIntField(term135993, term135993.getClass(), "totalEasyHighScore", -1036997079);
        setIntField(term135993, term135993.getClass(), "totalBasicHighScore", 1656123916);
        setIntField(term135993, term135993.getClass(), "totalAdvancedHighScore", 2024821526);
        setIntField(term135993, term135993.getClass(), "totalExpertHighScore", 1745990909);
        setIntField(term135993, term135993.getClass(), "totalMasterHighScore", -61000033);
        setIntField(term135993, term135993.getClass(), "totalReMasterHighScore", 833682710);
        setIntField(term135993, term135993.getClass(), "totalHighSync", 1500532827);
        setIntField(term135993, term135993.getClass(), "totalEasySync", 1496996100);
        setIntField(term135993, term135993.getClass(), "totalBasicSync", 1948281454);
        setIntField(term135993, term135993.getClass(), "totalAdvancedSync", -1588244681);
        setIntField(term135993, term135993.getClass(), "totalExpertSync", 1657723528);
        setIntField(term135993, term135993.getClass(), "totalMasterSync", -925335689);
        setIntField(term135993, term135993.getClass(), "totalReMasterSync", 1465194014);
        setIntField(term135993, term135993.getClass(), "playerRating", 1373439283);
        setIntField(term135993, term135993.getClass(), "highestRating", 1908194889);
        setIntField(term135993, term135993.getClass(), "rankAuthTailId", 812950204);
        setField(term135993, term135993.getClass(), "eventWatchedDate", "VQLNXTwXTJ");
        setField(term135993, term135993.getClass(), "webLimitDate", "GZygAttIuk");
        setIntField(term135993, term135993.getClass(), "challengeTrackPhase", 732912125);
        setIntField(term135993, term135993.getClass(), "firstPlayBits", 1994255108);
        setField(term135993, term135993.getClass(), "lastPlayDate", "WSDrFHxHqO");
        setIntField(term135993, term135993.getClass(), "lastPlaceId", -429147788);
        setField(term135993, term135993.getClass(), "lastPlaceName", "kbdjWUKDix");
        setIntField(term135993, term135993.getClass(), "lastRegionId", 959884950);
        setField(term135993, term135993.getClass(), "lastRegionName", "jhXmnsQIUw");
        setField(term135993, term135993.getClass(), "lastClientId", "qTRnuuLERk");
        setField(term135993, term135993.getClass(), "lastCountryCode", "ieCQQDUgWu");
        setIntField(term135993, term135993.getClass(), "eventPoint", 1669987326);
        setIntField(term135993, term135993.getClass(), "totalLv", -528961043);
        setIntField(term135993, term135993.getClass(), "lastLoginBonusDay", -1221068398);
        setIntField(term135993, term135993.getClass(), "lastSurvivalBonusDay", -1431603634);
        setIntField(term135993, term135993.getClass(), "loginBonusLv", -2145618978);
        setField(term135991, term135991.getClass(), "user", term135993);
        setIntField(term135991, term135991.getClass(), "orderId", -2072742962);
        setLongField(term135991, term135991.getClass(), "sortNumber", 9130132268364804177L);
        setIntField(term135991, term135991.getClass(), "placeId", 1926004382);
        setField(term135991, term135991.getClass(), "placeName", "tIHHXpuCOh");
        setField(term135991, term135991.getClass(), "country", "oCLpbAHyax");
        setIntField(term135991, term135991.getClass(), "regionId", 162454064);
        setField(term135991, term135991.getClass(), "playDate", "nKWQlKSRtt");
        setField(term135991, term135991.getClass(), "userPlayDate", "PiyYqhsqYA");
        setIntField(term135991, term135991.getClass(), "musicId", 935531911);
        setIntField(term135991, term135991.getClass(), "level", 1832818618);
        setIntField(term135991, term135991.getClass(), "gameMode", -85694964);
        setIntField(term135991, term135991.getClass(), "rivalNum", 1708019769);
        setIntField(term135991, term135991.getClass(), "track", -1917518407);
        setIntField(term135991, term135991.getClass(), "eventId", -1540625466);
        setBooleanField(term135991, term135991.getClass(), "isFreeToPlay", false);
        setIntField(term135991, term135991.getClass(), "playerRating", 1722245644);
        setLongField(term135991, term135991.getClass(), "playedUserId1", 7597058252879142457L);
        setField(term135991, term135991.getClass(), "playedUserName1", "awpFkVwkVc");
        setIntField(term135991, term135991.getClass(), "playedMusicLevel1", -1199651827);
        setLongField(term135991, term135991.getClass(), "playedUserId2", -2916052431291931409L);
        setField(term135991, term135991.getClass(), "playedUserName2", "mfjXySIEmZ");
        setIntField(term135991, term135991.getClass(), "playedMusicLevel2", -803625753);
        setLongField(term135991, term135991.getClass(), "playedUserId3", 3771508378771734822L);
        setField(term135991, term135991.getClass(), "playedUserName3", "IGtYdNRgoQ");
        setIntField(term135991, term135991.getClass(), "playedMusicLevel3", -456062941);
        setIntField(term135991, term135991.getClass(), "achievement", 1992286479);
        setIntField(term135991, term135991.getClass(), "score", 532415022);
        setIntField(term135991, term135991.getClass(), "tapScore", -1272300450);
        setIntField(term135991, term135991.getClass(), "holdScore", -1508552849);
        setIntField(term135991, term135991.getClass(), "slideScore", -1439848054);
        setIntField(term135991, term135991.getClass(), "breakScore", -2074664341);
        setIntField(term135991, term135991.getClass(), "syncRate", 1411987884);
        setIntField(term135991, term135991.getClass(), "vsWin", -603643833);
        setBooleanField(term135991, term135991.getClass(), "isAllPerfect", false);
        setIntField(term135991, term135991.getClass(), "fullCombo", -1447039495);
        setIntField(term135991, term135991.getClass(), "maxFever", -157506155);
        setIntField(term135991, term135991.getClass(), "maxCombo", 1522316351);
        setIntField(term135991, term135991.getClass(), "tapPerfect", 681380896);
        setIntField(term135991, term135991.getClass(), "tapGreat", 89005350);
        setIntField(term135991, term135991.getClass(), "tapGood", 1095907961);
        setIntField(term135991, term135991.getClass(), "tapBad", -1059161781);
        setIntField(term135991, term135991.getClass(), "holdPerfect", 2064721751);
        setIntField(term135991, term135991.getClass(), "holdGreat", 1098314410);
        setIntField(term135991, term135991.getClass(), "holdGood", 513236489);
        setIntField(term135991, term135991.getClass(), "holdBad", -379651599);
        setIntField(term135991, term135991.getClass(), "slidePerfect", 699451013);
        setIntField(term135991, term135991.getClass(), "slideGreat", -618558540);
        setIntField(term135991, term135991.getClass(), "slideGood", -885830948);
        setIntField(term135991, term135991.getClass(), "slideBad", -1255770211);
        setIntField(term135991, term135991.getClass(), "breakPerfect", -1011335912);
        setIntField(term135991, term135991.getClass(), "breakGreat", 393511944);
        setIntField(term135991, term135991.getClass(), "breakGood", -829559848);
        setIntField(term135991, term135991.getClass(), "breakBad", 674370223);
        setBooleanField(term135991, term135991.getClass(), "isTrackSkip", true);
        setBooleanField(term135991, term135991.getClass(), "isHighScore", true);
        setBooleanField(term135991, term135991.getClass(), "isChallengeTrack", false);
        setIntField(term135991, term135991.getClass(), "challengeLife", 1667723550);
        setIntField(term135991, term135991.getClass(), "challengeRemain", 1605590859);
        setIntField(term135991, term135991.getClass(), "isAllPerfectPlus", 121161260);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSlideBad", argTypes, term135991, args);
    }

};


