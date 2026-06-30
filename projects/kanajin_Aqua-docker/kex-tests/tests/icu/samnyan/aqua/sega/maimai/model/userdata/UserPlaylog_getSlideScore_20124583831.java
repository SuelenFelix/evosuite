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

public class UserPlaylog_getSlideScore_20124583831 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term127023;

    public UserPlaylog_getSlideScore_20124583831() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term127029 = new Long(-421166328269063791L);
        term127023 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term127025 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term127027 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term127043 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term127044 = newInstance(Class.forName("java.time.LocalDate"));
        Object term127048 = newInstance(Class.forName("java.time.LocalTime"));
        Object term127053 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term127054 = newInstance(Class.forName("java.time.LocalDate"));
        Object term127058 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term127023, term127023.getClass(), "id", 7585284844822710343L);
        setLongField(term127025, term127025.getClass(), "id", 6803750423071360242L);
        setLongField(term127027, term127027.getClass(), "id", -4234850307320476025L);
        setField(term127027, term127027.getClass(), "extId", term127029);
        setField(term127027, term127027.getClass(), "luid", "DpAnlOynPS");
        setIntField(term127044, term127044.getClass(), "year", 2028);
        setShortField(term127044, term127044.getClass(), "month", (short) 3);
        setShortField(term127044, term127044.getClass(), "day", (short) 23);
        setField(term127043, term127043.getClass(), "date", term127044);
        setByteField(term127048, term127048.getClass(), "hour", (byte) 18);
        setByteField(term127048, term127048.getClass(), "minute", (byte) 27);
        setByteField(term127048, term127048.getClass(), "second", (byte) 54);
        setIntField(term127048, term127048.getClass(), "nano", 421491474);
        setField(term127043, term127043.getClass(), "time", term127048);
        setField(term127027, term127027.getClass(), "registerTime", term127043);
        setIntField(term127054, term127054.getClass(), "year", 2025);
        setShortField(term127054, term127054.getClass(), "month", (short) 9);
        setShortField(term127054, term127054.getClass(), "day", (short) 18);
        setField(term127053, term127053.getClass(), "date", term127054);
        setByteField(term127058, term127058.getClass(), "hour", (byte) 13);
        setByteField(term127058, term127058.getClass(), "minute", (byte) 47);
        setByteField(term127058, term127058.getClass(), "second", (byte) 29);
        setIntField(term127058, term127058.getClass(), "nano", 832215473);
        setField(term127053, term127053.getClass(), "time", term127058);
        setField(term127027, term127027.getClass(), "accessTime", term127053);
        setField(term127025, term127025.getClass(), "card", term127027);
        setIntField(term127025, term127025.getClass(), "lastDataVersion", 2032473075);
        setField(term127025, term127025.getClass(), "userName", "CyKngDoFFr");
        setIntField(term127025, term127025.getClass(), "point", 2015184957);
        setIntField(term127025, term127025.getClass(), "totalPoint", 1154663622);
        setIntField(term127025, term127025.getClass(), "iconId", 1056435262);
        setIntField(term127025, term127025.getClass(), "nameplateId", 2016018259);
        setIntField(term127025, term127025.getClass(), "frameId", 615756327);
        setIntField(term127025, term127025.getClass(), "trophyId", -1171119194);
        setIntField(term127025, term127025.getClass(), "playCount", -2070175203);
        setIntField(term127025, term127025.getClass(), "playVsCount", 883783872);
        setIntField(term127025, term127025.getClass(), "playSyncCount", -378128944);
        setIntField(term127025, term127025.getClass(), "winCount", -40756380);
        setIntField(term127025, term127025.getClass(), "helpCount", 1408392536);
        setIntField(term127025, term127025.getClass(), "comboCount", -2144080312);
        setIntField(term127025, term127025.getClass(), "feverCount", -904183704);
        setIntField(term127025, term127025.getClass(), "totalHiScore", 1752556805);
        setIntField(term127025, term127025.getClass(), "totalEasyHighScore", -557171448);
        setIntField(term127025, term127025.getClass(), "totalBasicHighScore", -1947507324);
        setIntField(term127025, term127025.getClass(), "totalAdvancedHighScore", -1163396485);
        setIntField(term127025, term127025.getClass(), "totalExpertHighScore", 968050623);
        setIntField(term127025, term127025.getClass(), "totalMasterHighScore", -830087679);
        setIntField(term127025, term127025.getClass(), "totalReMasterHighScore", -503037443);
        setIntField(term127025, term127025.getClass(), "totalHighSync", 682268807);
        setIntField(term127025, term127025.getClass(), "totalEasySync", 136044547);
        setIntField(term127025, term127025.getClass(), "totalBasicSync", 464334734);
        setIntField(term127025, term127025.getClass(), "totalAdvancedSync", 2070253003);
        setIntField(term127025, term127025.getClass(), "totalExpertSync", 1634771150);
        setIntField(term127025, term127025.getClass(), "totalMasterSync", 1103450812);
        setIntField(term127025, term127025.getClass(), "totalReMasterSync", 1483366240);
        setIntField(term127025, term127025.getClass(), "playerRating", -808802177);
        setIntField(term127025, term127025.getClass(), "highestRating", 201013869);
        setIntField(term127025, term127025.getClass(), "rankAuthTailId", -695537447);
        setField(term127025, term127025.getClass(), "eventWatchedDate", "eXHygaZKkI");
        setField(term127025, term127025.getClass(), "webLimitDate", "exVBhDpyTv");
        setIntField(term127025, term127025.getClass(), "challengeTrackPhase", -128642878);
        setIntField(term127025, term127025.getClass(), "firstPlayBits", -153976766);
        setField(term127025, term127025.getClass(), "lastPlayDate", "HIROkhxmYq");
        setIntField(term127025, term127025.getClass(), "lastPlaceId", -822027858);
        setField(term127025, term127025.getClass(), "lastPlaceName", "IOCISrBpxa");
        setIntField(term127025, term127025.getClass(), "lastRegionId", 487034633);
        setField(term127025, term127025.getClass(), "lastRegionName", "xYPVdJYlie");
        setField(term127025, term127025.getClass(), "lastClientId", "ReKmMCwzEQ");
        setField(term127025, term127025.getClass(), "lastCountryCode", "tNcYNTIZXy");
        setIntField(term127025, term127025.getClass(), "eventPoint", 660427537);
        setIntField(term127025, term127025.getClass(), "totalLv", 241613117);
        setIntField(term127025, term127025.getClass(), "lastLoginBonusDay", -1603478119);
        setIntField(term127025, term127025.getClass(), "lastSurvivalBonusDay", -269576763);
        setIntField(term127025, term127025.getClass(), "loginBonusLv", -1999959189);
        setField(term127023, term127023.getClass(), "user", term127025);
        setIntField(term127023, term127023.getClass(), "orderId", -1872533700);
        setLongField(term127023, term127023.getClass(), "sortNumber", 4525524239494718372L);
        setIntField(term127023, term127023.getClass(), "placeId", 1237512912);
        setField(term127023, term127023.getClass(), "placeName", "XntyZLMPel");
        setField(term127023, term127023.getClass(), "country", "kRYwILGOiG");
        setIntField(term127023, term127023.getClass(), "regionId", 1251446163);
        setField(term127023, term127023.getClass(), "playDate", "lGzUITCYwf");
        setField(term127023, term127023.getClass(), "userPlayDate", "OOTylmfCYh");
        setIntField(term127023, term127023.getClass(), "musicId", -2057452122);
        setIntField(term127023, term127023.getClass(), "level", 1691237773);
        setIntField(term127023, term127023.getClass(), "gameMode", -1663742052);
        setIntField(term127023, term127023.getClass(), "rivalNum", 788507527);
        setIntField(term127023, term127023.getClass(), "track", -1612439420);
        setIntField(term127023, term127023.getClass(), "eventId", -914990802);
        setBooleanField(term127023, term127023.getClass(), "isFreeToPlay", true);
        setIntField(term127023, term127023.getClass(), "playerRating", 865738050);
        setLongField(term127023, term127023.getClass(), "playedUserId1", 5204341701727130016L);
        setField(term127023, term127023.getClass(), "playedUserName1", "tDqwvIixso");
        setIntField(term127023, term127023.getClass(), "playedMusicLevel1", 28910093);
        setLongField(term127023, term127023.getClass(), "playedUserId2", -5167573302796126161L);
        setField(term127023, term127023.getClass(), "playedUserName2", "liEYQdFeWW");
        setIntField(term127023, term127023.getClass(), "playedMusicLevel2", 157370660);
        setLongField(term127023, term127023.getClass(), "playedUserId3", 199834233798511747L);
        setField(term127023, term127023.getClass(), "playedUserName3", "ADqXMyhBwX");
        setIntField(term127023, term127023.getClass(), "playedMusicLevel3", 2042890534);
        setIntField(term127023, term127023.getClass(), "achievement", -2049072485);
        setIntField(term127023, term127023.getClass(), "score", 1903704550);
        setIntField(term127023, term127023.getClass(), "tapScore", -2075510342);
        setIntField(term127023, term127023.getClass(), "holdScore", 1544698163);
        setIntField(term127023, term127023.getClass(), "slideScore", -1789656093);
        setIntField(term127023, term127023.getClass(), "breakScore", 1550481264);
        setIntField(term127023, term127023.getClass(), "syncRate", -1463046270);
        setIntField(term127023, term127023.getClass(), "vsWin", -1017027932);
        setBooleanField(term127023, term127023.getClass(), "isAllPerfect", false);
        setIntField(term127023, term127023.getClass(), "fullCombo", 1969662928);
        setIntField(term127023, term127023.getClass(), "maxFever", 1703170089);
        setIntField(term127023, term127023.getClass(), "maxCombo", 363138033);
        setIntField(term127023, term127023.getClass(), "tapPerfect", -1764874360);
        setIntField(term127023, term127023.getClass(), "tapGreat", -448351770);
        setIntField(term127023, term127023.getClass(), "tapGood", 1136014453);
        setIntField(term127023, term127023.getClass(), "tapBad", -919366355);
        setIntField(term127023, term127023.getClass(), "holdPerfect", 1513356296);
        setIntField(term127023, term127023.getClass(), "holdGreat", 26137097);
        setIntField(term127023, term127023.getClass(), "holdGood", 2093085087);
        setIntField(term127023, term127023.getClass(), "holdBad", 940362175);
        setIntField(term127023, term127023.getClass(), "slidePerfect", -1224310255);
        setIntField(term127023, term127023.getClass(), "slideGreat", -2074818221);
        setIntField(term127023, term127023.getClass(), "slideGood", -1317687267);
        setIntField(term127023, term127023.getClass(), "slideBad", 557693831);
        setIntField(term127023, term127023.getClass(), "breakPerfect", 938638133);
        setIntField(term127023, term127023.getClass(), "breakGreat", -130864088);
        setIntField(term127023, term127023.getClass(), "breakGood", -509472233);
        setIntField(term127023, term127023.getClass(), "breakBad", 925935088);
        setBooleanField(term127023, term127023.getClass(), "isTrackSkip", true);
        setBooleanField(term127023, term127023.getClass(), "isHighScore", true);
        setBooleanField(term127023, term127023.getClass(), "isChallengeTrack", false);
        setIntField(term127023, term127023.getClass(), "challengeLife", 125924563);
        setIntField(term127023, term127023.getClass(), "challengeRemain", -640546426);
        setIntField(term127023, term127023.getClass(), "isAllPerfectPlus", -545966550);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSlideScore", argTypes, term127023, args);
    }

};


