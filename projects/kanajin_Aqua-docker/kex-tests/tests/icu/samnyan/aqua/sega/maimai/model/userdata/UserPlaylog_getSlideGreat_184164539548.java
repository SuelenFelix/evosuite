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

public class UserPlaylog_getSlideGreat_184164539548 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term135047;

    public UserPlaylog_getSlideGreat_184164539548() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term135053 = new Long(1278107327214302894L);
        term135047 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term135049 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term135051 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term135067 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term135068 = newInstance(Class.forName("java.time.LocalDate"));
        Object term135072 = newInstance(Class.forName("java.time.LocalTime"));
        Object term135077 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term135078 = newInstance(Class.forName("java.time.LocalDate"));
        Object term135082 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term135047, term135047.getClass(), "id", 7022012163884672746L);
        setLongField(term135049, term135049.getClass(), "id", -5668489101686002218L);
        setLongField(term135051, term135051.getClass(), "id", 8713229483070783866L);
        setField(term135051, term135051.getClass(), "extId", term135053);
        setField(term135051, term135051.getClass(), "luid", "ysjcSaLtGI");
        setIntField(term135068, term135068.getClass(), "year", 2011);
        setShortField(term135068, term135068.getClass(), "month", (short) 12);
        setShortField(term135068, term135068.getClass(), "day", (short) 6);
        setField(term135067, term135067.getClass(), "date", term135068);
        setByteField(term135072, term135072.getClass(), "hour", (byte) 21);
        setByteField(term135072, term135072.getClass(), "minute", (byte) 3);
        setByteField(term135072, term135072.getClass(), "second", (byte) 28);
        setIntField(term135072, term135072.getClass(), "nano", 650612376);
        setField(term135067, term135067.getClass(), "time", term135072);
        setField(term135051, term135051.getClass(), "registerTime", term135067);
        setIntField(term135078, term135078.getClass(), "year", 2025);
        setShortField(term135078, term135078.getClass(), "month", (short) 1);
        setShortField(term135078, term135078.getClass(), "day", (short) 2);
        setField(term135077, term135077.getClass(), "date", term135078);
        setByteField(term135082, term135082.getClass(), "hour", (byte) 12);
        setByteField(term135082, term135082.getClass(), "minute", (byte) 18);
        setByteField(term135082, term135082.getClass(), "second", (byte) 4);
        setIntField(term135082, term135082.getClass(), "nano", 249732001);
        setField(term135077, term135077.getClass(), "time", term135082);
        setField(term135051, term135051.getClass(), "accessTime", term135077);
        setField(term135049, term135049.getClass(), "card", term135051);
        setIntField(term135049, term135049.getClass(), "lastDataVersion", -1994228985);
        setField(term135049, term135049.getClass(), "userName", "OqSicVymRV");
        setIntField(term135049, term135049.getClass(), "point", 1359678788);
        setIntField(term135049, term135049.getClass(), "totalPoint", 1234464848);
        setIntField(term135049, term135049.getClass(), "iconId", 1342592274);
        setIntField(term135049, term135049.getClass(), "nameplateId", 1594888304);
        setIntField(term135049, term135049.getClass(), "frameId", -472612133);
        setIntField(term135049, term135049.getClass(), "trophyId", 580127194);
        setIntField(term135049, term135049.getClass(), "playCount", 763714666);
        setIntField(term135049, term135049.getClass(), "playVsCount", 1091341986);
        setIntField(term135049, term135049.getClass(), "playSyncCount", 1965907538);
        setIntField(term135049, term135049.getClass(), "winCount", 72918123);
        setIntField(term135049, term135049.getClass(), "helpCount", -145666395);
        setIntField(term135049, term135049.getClass(), "comboCount", 788738026);
        setIntField(term135049, term135049.getClass(), "feverCount", -960721893);
        setIntField(term135049, term135049.getClass(), "totalHiScore", 619168390);
        setIntField(term135049, term135049.getClass(), "totalEasyHighScore", 1473974676);
        setIntField(term135049, term135049.getClass(), "totalBasicHighScore", 83830744);
        setIntField(term135049, term135049.getClass(), "totalAdvancedHighScore", -310121450);
        setIntField(term135049, term135049.getClass(), "totalExpertHighScore", 869833249);
        setIntField(term135049, term135049.getClass(), "totalMasterHighScore", -2051296834);
        setIntField(term135049, term135049.getClass(), "totalReMasterHighScore", 407416813);
        setIntField(term135049, term135049.getClass(), "totalHighSync", 513307188);
        setIntField(term135049, term135049.getClass(), "totalEasySync", 1094537848);
        setIntField(term135049, term135049.getClass(), "totalBasicSync", -100651609);
        setIntField(term135049, term135049.getClass(), "totalAdvancedSync", 1224321939);
        setIntField(term135049, term135049.getClass(), "totalExpertSync", 1940467037);
        setIntField(term135049, term135049.getClass(), "totalMasterSync", -847131875);
        setIntField(term135049, term135049.getClass(), "totalReMasterSync", 928002389);
        setIntField(term135049, term135049.getClass(), "playerRating", -274458803);
        setIntField(term135049, term135049.getClass(), "highestRating", 1052072083);
        setIntField(term135049, term135049.getClass(), "rankAuthTailId", 109527123);
        setField(term135049, term135049.getClass(), "eventWatchedDate", "wiCYSRXKPQ");
        setField(term135049, term135049.getClass(), "webLimitDate", "pZsKceaypG");
        setIntField(term135049, term135049.getClass(), "challengeTrackPhase", -104430065);
        setIntField(term135049, term135049.getClass(), "firstPlayBits", -1315719378);
        setField(term135049, term135049.getClass(), "lastPlayDate", "XZfWiBghln");
        setIntField(term135049, term135049.getClass(), "lastPlaceId", -676341161);
        setField(term135049, term135049.getClass(), "lastPlaceName", "mzCiczKZrz");
        setIntField(term135049, term135049.getClass(), "lastRegionId", 1659199645);
        setField(term135049, term135049.getClass(), "lastRegionName", "KHTorTPpue");
        setField(term135049, term135049.getClass(), "lastClientId", "UZGFzJfIBQ");
        setField(term135049, term135049.getClass(), "lastCountryCode", "HVZdePgPWv");
        setIntField(term135049, term135049.getClass(), "eventPoint", 125450855);
        setIntField(term135049, term135049.getClass(), "totalLv", -522733425);
        setIntField(term135049, term135049.getClass(), "lastLoginBonusDay", 1372640843);
        setIntField(term135049, term135049.getClass(), "lastSurvivalBonusDay", -1716607087);
        setIntField(term135049, term135049.getClass(), "loginBonusLv", -1406941573);
        setField(term135047, term135047.getClass(), "user", term135049);
        setIntField(term135047, term135047.getClass(), "orderId", -422036741);
        setLongField(term135047, term135047.getClass(), "sortNumber", 7598786125321910224L);
        setIntField(term135047, term135047.getClass(), "placeId", 255603992);
        setField(term135047, term135047.getClass(), "placeName", "VhpcclRPZX");
        setField(term135047, term135047.getClass(), "country", "jecnsmPrVs");
        setIntField(term135047, term135047.getClass(), "regionId", 480186865);
        setField(term135047, term135047.getClass(), "playDate", "QkdgrEdqYo");
        setField(term135047, term135047.getClass(), "userPlayDate", "oqAIcYaMFy");
        setIntField(term135047, term135047.getClass(), "musicId", 255438967);
        setIntField(term135047, term135047.getClass(), "level", -871959442);
        setIntField(term135047, term135047.getClass(), "gameMode", -1297201519);
        setIntField(term135047, term135047.getClass(), "rivalNum", -914784517);
        setIntField(term135047, term135047.getClass(), "track", 798258525);
        setIntField(term135047, term135047.getClass(), "eventId", 746153151);
        setBooleanField(term135047, term135047.getClass(), "isFreeToPlay", false);
        setIntField(term135047, term135047.getClass(), "playerRating", -699538920);
        setLongField(term135047, term135047.getClass(), "playedUserId1", 2008211696778135261L);
        setField(term135047, term135047.getClass(), "playedUserName1", "eMJZEUCuiE");
        setIntField(term135047, term135047.getClass(), "playedMusicLevel1", 516510463);
        setLongField(term135047, term135047.getClass(), "playedUserId2", 915665059113544268L);
        setField(term135047, term135047.getClass(), "playedUserName2", "psNXkIHjLW");
        setIntField(term135047, term135047.getClass(), "playedMusicLevel2", -1973306872);
        setLongField(term135047, term135047.getClass(), "playedUserId3", -3380318205328241107L);
        setField(term135047, term135047.getClass(), "playedUserName3", "DeWUQxbivp");
        setIntField(term135047, term135047.getClass(), "playedMusicLevel3", 1932414041);
        setIntField(term135047, term135047.getClass(), "achievement", 919972160);
        setIntField(term135047, term135047.getClass(), "score", 1434660658);
        setIntField(term135047, term135047.getClass(), "tapScore", -1188362131);
        setIntField(term135047, term135047.getClass(), "holdScore", -1549313487);
        setIntField(term135047, term135047.getClass(), "slideScore", -1858318156);
        setIntField(term135047, term135047.getClass(), "breakScore", -581381438);
        setIntField(term135047, term135047.getClass(), "syncRate", -1808491228);
        setIntField(term135047, term135047.getClass(), "vsWin", 379274483);
        setBooleanField(term135047, term135047.getClass(), "isAllPerfect", true);
        setIntField(term135047, term135047.getClass(), "fullCombo", 1360925526);
        setIntField(term135047, term135047.getClass(), "maxFever", -1170114262);
        setIntField(term135047, term135047.getClass(), "maxCombo", 1472006438);
        setIntField(term135047, term135047.getClass(), "tapPerfect", -1709980802);
        setIntField(term135047, term135047.getClass(), "tapGreat", -844647509);
        setIntField(term135047, term135047.getClass(), "tapGood", -1745270330);
        setIntField(term135047, term135047.getClass(), "tapBad", -1544639528);
        setIntField(term135047, term135047.getClass(), "holdPerfect", 1385044115);
        setIntField(term135047, term135047.getClass(), "holdGreat", 1139126133);
        setIntField(term135047, term135047.getClass(), "holdGood", 1498393769);
        setIntField(term135047, term135047.getClass(), "holdBad", -320845496);
        setIntField(term135047, term135047.getClass(), "slidePerfect", 1894524360);
        setIntField(term135047, term135047.getClass(), "slideGreat", -161445471);
        setIntField(term135047, term135047.getClass(), "slideGood", -834299730);
        setIntField(term135047, term135047.getClass(), "slideBad", -1844297547);
        setIntField(term135047, term135047.getClass(), "breakPerfect", 1802451394);
        setIntField(term135047, term135047.getClass(), "breakGreat", -182890909);
        setIntField(term135047, term135047.getClass(), "breakGood", -1032180019);
        setIntField(term135047, term135047.getClass(), "breakBad", -1616238764);
        setBooleanField(term135047, term135047.getClass(), "isTrackSkip", true);
        setBooleanField(term135047, term135047.getClass(), "isHighScore", true);
        setBooleanField(term135047, term135047.getClass(), "isChallengeTrack", true);
        setIntField(term135047, term135047.getClass(), "challengeLife", 1976896930);
        setIntField(term135047, term135047.getClass(), "challengeRemain", -1937263201);
        setIntField(term135047, term135047.getClass(), "isAllPerfectPlus", -25872721);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSlideGreat", argTypes, term135047, args);
    }

};


