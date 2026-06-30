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

public class UserPlaylog_setGameMode_176719557673 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term147213;
     Object term147525;

    public UserPlaylog_setGameMode_176719557673() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term147219 = new Long(6940486570215409900L);
        term147213 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term147215 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term147217 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term147233 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term147234 = newInstance(Class.forName("java.time.LocalDate"));
        Object term147238 = newInstance(Class.forName("java.time.LocalTime"));
        Object term147243 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term147244 = newInstance(Class.forName("java.time.LocalDate"));
        Object term147248 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term147213, term147213.getClass(), "id", -490278022171411868L);
        setLongField(term147215, term147215.getClass(), "id", -8013089614220844724L);
        setLongField(term147217, term147217.getClass(), "id", -1719297732277781462L);
        setField(term147217, term147217.getClass(), "extId", term147219);
        setField(term147217, term147217.getClass(), "luid", "OZIAupXzmm");
        setIntField(term147234, term147234.getClass(), "year", 2024);
        setShortField(term147234, term147234.getClass(), "month", (short) 5);
        setShortField(term147234, term147234.getClass(), "day", (short) 7);
        setField(term147233, term147233.getClass(), "date", term147234);
        setByteField(term147238, term147238.getClass(), "hour", (byte) 11);
        setByteField(term147238, term147238.getClass(), "minute", (byte) 43);
        setByteField(term147238, term147238.getClass(), "second", (byte) 25);
        setIntField(term147238, term147238.getClass(), "nano", 863939499);
        setField(term147233, term147233.getClass(), "time", term147238);
        setField(term147217, term147217.getClass(), "registerTime", term147233);
        setIntField(term147244, term147244.getClass(), "year", 2024);
        setShortField(term147244, term147244.getClass(), "month", (short) 9);
        setShortField(term147244, term147244.getClass(), "day", (short) 7);
        setField(term147243, term147243.getClass(), "date", term147244);
        setByteField(term147248, term147248.getClass(), "hour", (byte) 10);
        setByteField(term147248, term147248.getClass(), "minute", (byte) 12);
        setByteField(term147248, term147248.getClass(), "second", (byte) 46);
        setIntField(term147248, term147248.getClass(), "nano", 856869732);
        setField(term147243, term147243.getClass(), "time", term147248);
        setField(term147217, term147217.getClass(), "accessTime", term147243);
        setField(term147215, term147215.getClass(), "card", term147217);
        setIntField(term147215, term147215.getClass(), "lastDataVersion", -1954378815);
        setField(term147215, term147215.getClass(), "userName", "FYhlObvAKO");
        setIntField(term147215, term147215.getClass(), "point", 1114156711);
        setIntField(term147215, term147215.getClass(), "totalPoint", 58730352);
        setIntField(term147215, term147215.getClass(), "iconId", 851356798);
        setIntField(term147215, term147215.getClass(), "nameplateId", 263083301);
        setIntField(term147215, term147215.getClass(), "frameId", -1977458494);
        setIntField(term147215, term147215.getClass(), "trophyId", -286437571);
        setIntField(term147215, term147215.getClass(), "playCount", 1982685546);
        setIntField(term147215, term147215.getClass(), "playVsCount", 157858456);
        setIntField(term147215, term147215.getClass(), "playSyncCount", -1049992610);
        setIntField(term147215, term147215.getClass(), "winCount", 993510709);
        setIntField(term147215, term147215.getClass(), "helpCount", 478288891);
        setIntField(term147215, term147215.getClass(), "comboCount", 841439984);
        setIntField(term147215, term147215.getClass(), "feverCount", -819772366);
        setIntField(term147215, term147215.getClass(), "totalHiScore", -461010936);
        setIntField(term147215, term147215.getClass(), "totalEasyHighScore", 767479578);
        setIntField(term147215, term147215.getClass(), "totalBasicHighScore", 1611792425);
        setIntField(term147215, term147215.getClass(), "totalAdvancedHighScore", -159368663);
        setIntField(term147215, term147215.getClass(), "totalExpertHighScore", 1769460221);
        setIntField(term147215, term147215.getClass(), "totalMasterHighScore", 246447471);
        setIntField(term147215, term147215.getClass(), "totalReMasterHighScore", -660086116);
        setIntField(term147215, term147215.getClass(), "totalHighSync", -1917620087);
        setIntField(term147215, term147215.getClass(), "totalEasySync", -384585397);
        setIntField(term147215, term147215.getClass(), "totalBasicSync", 2068024615);
        setIntField(term147215, term147215.getClass(), "totalAdvancedSync", -627479697);
        setIntField(term147215, term147215.getClass(), "totalExpertSync", 793382744);
        setIntField(term147215, term147215.getClass(), "totalMasterSync", -1440001626);
        setIntField(term147215, term147215.getClass(), "totalReMasterSync", -219999240);
        setIntField(term147215, term147215.getClass(), "playerRating", -329831857);
        setIntField(term147215, term147215.getClass(), "highestRating", 934973434);
        setIntField(term147215, term147215.getClass(), "rankAuthTailId", -1659253989);
        setField(term147215, term147215.getClass(), "eventWatchedDate", "GFxNoBwsCD");
        setField(term147215, term147215.getClass(), "webLimitDate", "zBVQNMxMvk");
        setIntField(term147215, term147215.getClass(), "challengeTrackPhase", 884105058);
        setIntField(term147215, term147215.getClass(), "firstPlayBits", 128840284);
        setField(term147215, term147215.getClass(), "lastPlayDate", "iJSPWddhZO");
        setIntField(term147215, term147215.getClass(), "lastPlaceId", -506443490);
        setField(term147215, term147215.getClass(), "lastPlaceName", "WbvttDefvl");
        setIntField(term147215, term147215.getClass(), "lastRegionId", -1016296928);
        setField(term147215, term147215.getClass(), "lastRegionName", "coNhvymEkq");
        setField(term147215, term147215.getClass(), "lastClientId", "dMuXJftgrw");
        setField(term147215, term147215.getClass(), "lastCountryCode", "INNyzaqXFS");
        setIntField(term147215, term147215.getClass(), "eventPoint", -526369482);
        setIntField(term147215, term147215.getClass(), "totalLv", -741125531);
        setIntField(term147215, term147215.getClass(), "lastLoginBonusDay", 434722011);
        setIntField(term147215, term147215.getClass(), "lastSurvivalBonusDay", 523412711);
        setIntField(term147215, term147215.getClass(), "loginBonusLv", 608684123);
        setField(term147213, term147213.getClass(), "user", term147215);
        setIntField(term147213, term147213.getClass(), "orderId", -171647915);
        setLongField(term147213, term147213.getClass(), "sortNumber", 2341406897372304425L);
        setIntField(term147213, term147213.getClass(), "placeId", -945146603);
        setField(term147213, term147213.getClass(), "placeName", "GdZWpscDov");
        setField(term147213, term147213.getClass(), "country", "RzzlJFJcij");
        setIntField(term147213, term147213.getClass(), "regionId", -1101286926);
        setField(term147213, term147213.getClass(), "playDate", "eADknKlQVd");
        setField(term147213, term147213.getClass(), "userPlayDate", "hfwLnDHizJ");
        setIntField(term147213, term147213.getClass(), "musicId", -276120113);
        setIntField(term147213, term147213.getClass(), "level", -166727700);
        setIntField(term147213, term147213.getClass(), "gameMode", 438098469);
        setIntField(term147213, term147213.getClass(), "rivalNum", 1528099819);
        setIntField(term147213, term147213.getClass(), "track", 822975980);
        setIntField(term147213, term147213.getClass(), "eventId", 708770993);
        setBooleanField(term147213, term147213.getClass(), "isFreeToPlay", true);
        setIntField(term147213, term147213.getClass(), "playerRating", 2036789177);
        setLongField(term147213, term147213.getClass(), "playedUserId1", -2558783251634097471L);
        setField(term147213, term147213.getClass(), "playedUserName1", "eZGPUdohTF");
        setIntField(term147213, term147213.getClass(), "playedMusicLevel1", -1448284491);
        setLongField(term147213, term147213.getClass(), "playedUserId2", -1057119189849263277L);
        setField(term147213, term147213.getClass(), "playedUserName2", "NyINyLwoLC");
        setIntField(term147213, term147213.getClass(), "playedMusicLevel2", 1048452588);
        setLongField(term147213, term147213.getClass(), "playedUserId3", -8704154300958772604L);
        setField(term147213, term147213.getClass(), "playedUserName3", "VdHJiosxsv");
        setIntField(term147213, term147213.getClass(), "playedMusicLevel3", -2105250010);
        setIntField(term147213, term147213.getClass(), "achievement", 1839043575);
        setIntField(term147213, term147213.getClass(), "score", -462243394);
        setIntField(term147213, term147213.getClass(), "tapScore", -1005539921);
        setIntField(term147213, term147213.getClass(), "holdScore", -1861567171);
        setIntField(term147213, term147213.getClass(), "slideScore", -1174741784);
        setIntField(term147213, term147213.getClass(), "breakScore", 663200662);
        setIntField(term147213, term147213.getClass(), "syncRate", 1512707515);
        setIntField(term147213, term147213.getClass(), "vsWin", -892058101);
        setBooleanField(term147213, term147213.getClass(), "isAllPerfect", false);
        setIntField(term147213, term147213.getClass(), "fullCombo", 1897648147);
        setIntField(term147213, term147213.getClass(), "maxFever", 1055849157);
        setIntField(term147213, term147213.getClass(), "maxCombo", 1811313027);
        setIntField(term147213, term147213.getClass(), "tapPerfect", 160233658);
        setIntField(term147213, term147213.getClass(), "tapGreat", 406040680);
        setIntField(term147213, term147213.getClass(), "tapGood", 1100025816);
        setIntField(term147213, term147213.getClass(), "tapBad", 771688939);
        setIntField(term147213, term147213.getClass(), "holdPerfect", 358282948);
        setIntField(term147213, term147213.getClass(), "holdGreat", 1720436320);
        setIntField(term147213, term147213.getClass(), "holdGood", -1583102787);
        setIntField(term147213, term147213.getClass(), "holdBad", -2065378293);
        setIntField(term147213, term147213.getClass(), "slidePerfect", 1155179870);
        setIntField(term147213, term147213.getClass(), "slideGreat", -1972042143);
        setIntField(term147213, term147213.getClass(), "slideGood", -1086571184);
        setIntField(term147213, term147213.getClass(), "slideBad", 1920833587);
        setIntField(term147213, term147213.getClass(), "breakPerfect", -1824136655);
        setIntField(term147213, term147213.getClass(), "breakGreat", 2135112038);
        setIntField(term147213, term147213.getClass(), "breakGood", -638417611);
        setIntField(term147213, term147213.getClass(), "breakBad", -1225915090);
        setBooleanField(term147213, term147213.getClass(), "isTrackSkip", false);
        setBooleanField(term147213, term147213.getClass(), "isHighScore", false);
        setBooleanField(term147213, term147213.getClass(), "isChallengeTrack", false);
        setIntField(term147213, term147213.getClass(), "challengeLife", 1619873615);
        setIntField(term147213, term147213.getClass(), "challengeRemain", 792693727);
        setIntField(term147213, term147213.getClass(), "isAllPerfectPlus", -474399001);
        term147525 = new Integer(473641931);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term147525;
        callMethod(klass, "setGameMode", argTypes, term147213, args);
    }

};


