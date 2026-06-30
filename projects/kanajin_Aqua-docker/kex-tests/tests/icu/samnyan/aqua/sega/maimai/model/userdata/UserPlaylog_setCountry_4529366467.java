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

public class UserPlaylog_setCountry_4529366467 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term144309;

    public UserPlaylog_setCountry_4529366467() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term144315 = new Long(-3753621038448351550L);
        term144309 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term144311 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term144313 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term144329 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term144330 = newInstance(Class.forName("java.time.LocalDate"));
        Object term144334 = newInstance(Class.forName("java.time.LocalTime"));
        Object term144339 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term144340 = newInstance(Class.forName("java.time.LocalDate"));
        Object term144344 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term144309, term144309.getClass(), "id", 7523325429211619652L);
        setLongField(term144311, term144311.getClass(), "id", 2129332791275186868L);
        setLongField(term144313, term144313.getClass(), "id", 5292512705125717689L);
        setField(term144313, term144313.getClass(), "extId", term144315);
        setField(term144313, term144313.getClass(), "luid", "HOEmWmVnLk");
        setIntField(term144330, term144330.getClass(), "year", 2028);
        setShortField(term144330, term144330.getClass(), "month", (short) 11);
        setShortField(term144330, term144330.getClass(), "day", (short) 9);
        setField(term144329, term144329.getClass(), "date", term144330);
        setByteField(term144334, term144334.getClass(), "hour", (byte) 7);
        setByteField(term144334, term144334.getClass(), "minute", (byte) 38);
        setByteField(term144334, term144334.getClass(), "second", (byte) 24);
        setIntField(term144334, term144334.getClass(), "nano", 528146857);
        setField(term144329, term144329.getClass(), "time", term144334);
        setField(term144313, term144313.getClass(), "registerTime", term144329);
        setIntField(term144340, term144340.getClass(), "year", 2025);
        setShortField(term144340, term144340.getClass(), "month", (short) 3);
        setShortField(term144340, term144340.getClass(), "day", (short) 6);
        setField(term144339, term144339.getClass(), "date", term144340);
        setByteField(term144344, term144344.getClass(), "hour", (byte) 12);
        setByteField(term144344, term144344.getClass(), "minute", (byte) 2);
        setByteField(term144344, term144344.getClass(), "second", (byte) 23);
        setIntField(term144344, term144344.getClass(), "nano", 463787680);
        setField(term144339, term144339.getClass(), "time", term144344);
        setField(term144313, term144313.getClass(), "accessTime", term144339);
        setField(term144311, term144311.getClass(), "card", term144313);
        setIntField(term144311, term144311.getClass(), "lastDataVersion", -505455303);
        setField(term144311, term144311.getClass(), "userName", "LxSzRiSUke");
        setIntField(term144311, term144311.getClass(), "point", -1820411156);
        setIntField(term144311, term144311.getClass(), "totalPoint", -816796496);
        setIntField(term144311, term144311.getClass(), "iconId", 201587887);
        setIntField(term144311, term144311.getClass(), "nameplateId", -1562978304);
        setIntField(term144311, term144311.getClass(), "frameId", 1161862220);
        setIntField(term144311, term144311.getClass(), "trophyId", -219537493);
        setIntField(term144311, term144311.getClass(), "playCount", 1255898251);
        setIntField(term144311, term144311.getClass(), "playVsCount", -261229652);
        setIntField(term144311, term144311.getClass(), "playSyncCount", 584620540);
        setIntField(term144311, term144311.getClass(), "winCount", -1504668819);
        setIntField(term144311, term144311.getClass(), "helpCount", -1410798140);
        setIntField(term144311, term144311.getClass(), "comboCount", -996211894);
        setIntField(term144311, term144311.getClass(), "feverCount", -130664317);
        setIntField(term144311, term144311.getClass(), "totalHiScore", -687335461);
        setIntField(term144311, term144311.getClass(), "totalEasyHighScore", -1611499918);
        setIntField(term144311, term144311.getClass(), "totalBasicHighScore", -1087834259);
        setIntField(term144311, term144311.getClass(), "totalAdvancedHighScore", 1822652652);
        setIntField(term144311, term144311.getClass(), "totalExpertHighScore", -25646020);
        setIntField(term144311, term144311.getClass(), "totalMasterHighScore", 317746944);
        setIntField(term144311, term144311.getClass(), "totalReMasterHighScore", -1585854857);
        setIntField(term144311, term144311.getClass(), "totalHighSync", 1978684857);
        setIntField(term144311, term144311.getClass(), "totalEasySync", 111520540);
        setIntField(term144311, term144311.getClass(), "totalBasicSync", -951768509);
        setIntField(term144311, term144311.getClass(), "totalAdvancedSync", 228627739);
        setIntField(term144311, term144311.getClass(), "totalExpertSync", 128228119);
        setIntField(term144311, term144311.getClass(), "totalMasterSync", 311791730);
        setIntField(term144311, term144311.getClass(), "totalReMasterSync", -954160434);
        setIntField(term144311, term144311.getClass(), "playerRating", 1679516445);
        setIntField(term144311, term144311.getClass(), "highestRating", -1988456878);
        setIntField(term144311, term144311.getClass(), "rankAuthTailId", 434994693);
        setField(term144311, term144311.getClass(), "eventWatchedDate", "NxbQJWSXQu");
        setField(term144311, term144311.getClass(), "webLimitDate", "ByfIvofaQE");
        setIntField(term144311, term144311.getClass(), "challengeTrackPhase", 584702339);
        setIntField(term144311, term144311.getClass(), "firstPlayBits", -1622392740);
        setField(term144311, term144311.getClass(), "lastPlayDate", "xvhHgJLoQS");
        setIntField(term144311, term144311.getClass(), "lastPlaceId", -308799350);
        setField(term144311, term144311.getClass(), "lastPlaceName", "bKSYtrrxDp");
        setIntField(term144311, term144311.getClass(), "lastRegionId", 831922698);
        setField(term144311, term144311.getClass(), "lastRegionName", "fQYVEGPLIF");
        setField(term144311, term144311.getClass(), "lastClientId", "qRwTBVZctS");
        setField(term144311, term144311.getClass(), "lastCountryCode", "BRBDbdsahC");
        setIntField(term144311, term144311.getClass(), "eventPoint", -578023059);
        setIntField(term144311, term144311.getClass(), "totalLv", 1570655761);
        setIntField(term144311, term144311.getClass(), "lastLoginBonusDay", 1680042151);
        setIntField(term144311, term144311.getClass(), "lastSurvivalBonusDay", 1886774290);
        setIntField(term144311, term144311.getClass(), "loginBonusLv", -1360980787);
        setField(term144309, term144309.getClass(), "user", term144311);
        setIntField(term144309, term144309.getClass(), "orderId", 488837209);
        setLongField(term144309, term144309.getClass(), "sortNumber", -4100892279770468602L);
        setIntField(term144309, term144309.getClass(), "placeId", -1305788278);
        setField(term144309, term144309.getClass(), "placeName", "TQAFOeWgvq");
        setField(term144309, term144309.getClass(), "country", "AtYIxbvLDg");
        setIntField(term144309, term144309.getClass(), "regionId", -374965214);
        setField(term144309, term144309.getClass(), "playDate", "rQdqhBCIJv");
        setField(term144309, term144309.getClass(), "userPlayDate", "OWnGgqSmUN");
        setIntField(term144309, term144309.getClass(), "musicId", 1054654322);
        setIntField(term144309, term144309.getClass(), "level", -252390416);
        setIntField(term144309, term144309.getClass(), "gameMode", -1666555516);
        setIntField(term144309, term144309.getClass(), "rivalNum", -481667037);
        setIntField(term144309, term144309.getClass(), "track", 1744898637);
        setIntField(term144309, term144309.getClass(), "eventId", -1439486914);
        setBooleanField(term144309, term144309.getClass(), "isFreeToPlay", true);
        setIntField(term144309, term144309.getClass(), "playerRating", -655307765);
        setLongField(term144309, term144309.getClass(), "playedUserId1", -459560970226052057L);
        setField(term144309, term144309.getClass(), "playedUserName1", "BLSUZfTILp");
        setIntField(term144309, term144309.getClass(), "playedMusicLevel1", -1802996868);
        setLongField(term144309, term144309.getClass(), "playedUserId2", 7829682507826908709L);
        setField(term144309, term144309.getClass(), "playedUserName2", "tlymfAhXiZ");
        setIntField(term144309, term144309.getClass(), "playedMusicLevel2", 1651913796);
        setLongField(term144309, term144309.getClass(), "playedUserId3", 2414820119632962722L);
        setField(term144309, term144309.getClass(), "playedUserName3", "rlLIYBJlxU");
        setIntField(term144309, term144309.getClass(), "playedMusicLevel3", -935670376);
        setIntField(term144309, term144309.getClass(), "achievement", -1321941334);
        setIntField(term144309, term144309.getClass(), "score", -2072279811);
        setIntField(term144309, term144309.getClass(), "tapScore", 424420422);
        setIntField(term144309, term144309.getClass(), "holdScore", 1175078847);
        setIntField(term144309, term144309.getClass(), "slideScore", 1639505977);
        setIntField(term144309, term144309.getClass(), "breakScore", 2035001086);
        setIntField(term144309, term144309.getClass(), "syncRate", 1051154591);
        setIntField(term144309, term144309.getClass(), "vsWin", 165242027);
        setBooleanField(term144309, term144309.getClass(), "isAllPerfect", true);
        setIntField(term144309, term144309.getClass(), "fullCombo", -267165362);
        setIntField(term144309, term144309.getClass(), "maxFever", -2139628089);
        setIntField(term144309, term144309.getClass(), "maxCombo", 2113730444);
        setIntField(term144309, term144309.getClass(), "tapPerfect", -536793202);
        setIntField(term144309, term144309.getClass(), "tapGreat", 1710678259);
        setIntField(term144309, term144309.getClass(), "tapGood", 1506222130);
        setIntField(term144309, term144309.getClass(), "tapBad", -1046031086);
        setIntField(term144309, term144309.getClass(), "holdPerfect", 1336862739);
        setIntField(term144309, term144309.getClass(), "holdGreat", 1654845592);
        setIntField(term144309, term144309.getClass(), "holdGood", -1146173809);
        setIntField(term144309, term144309.getClass(), "holdBad", 1280410123);
        setIntField(term144309, term144309.getClass(), "slidePerfect", -1900255770);
        setIntField(term144309, term144309.getClass(), "slideGreat", -1927343285);
        setIntField(term144309, term144309.getClass(), "slideGood", -327777337);
        setIntField(term144309, term144309.getClass(), "slideBad", 609466496);
        setIntField(term144309, term144309.getClass(), "breakPerfect", 1991028856);
        setIntField(term144309, term144309.getClass(), "breakGreat", -1261341659);
        setIntField(term144309, term144309.getClass(), "breakGood", -717206333);
        setIntField(term144309, term144309.getClass(), "breakBad", 1344256318);
        setBooleanField(term144309, term144309.getClass(), "isTrackSkip", false);
        setBooleanField(term144309, term144309.getClass(), "isHighScore", true);
        setBooleanField(term144309, term144309.getClass(), "isChallengeTrack", true);
        setIntField(term144309, term144309.getClass(), "challengeLife", -1217147133);
        setIntField(term144309, term144309.getClass(), "challengeRemain", 824578055);
        setIntField(term144309, term144309.getClass(), "isAllPerfectPlus", 1973211662);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "jtfkxwFefh";
        callMethod(klass, "setCountry", argTypes, term144309, args);
    }

};


