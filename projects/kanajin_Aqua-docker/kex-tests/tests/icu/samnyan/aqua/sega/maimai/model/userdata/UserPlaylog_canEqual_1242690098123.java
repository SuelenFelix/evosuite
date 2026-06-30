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

public class UserPlaylog_canEqual_1242690098123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term170972;
     Object term171284;

    public UserPlaylog_canEqual_1242690098123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term170978 = new Long(-6254265799185295775L);
        term170972 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term170974 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term170976 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term170992 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term170993 = newInstance(Class.forName("java.time.LocalDate"));
        Object term170997 = newInstance(Class.forName("java.time.LocalTime"));
        Object term171002 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term171003 = newInstance(Class.forName("java.time.LocalDate"));
        Object term171007 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term170972, term170972.getClass(), "id", 38842281830560892L);
        setLongField(term170974, term170974.getClass(), "id", 2485168218246856776L);
        setLongField(term170976, term170976.getClass(), "id", 7984812876118160348L);
        setField(term170976, term170976.getClass(), "extId", term170978);
        setField(term170976, term170976.getClass(), "luid", "ZXcuwiDFkz");
        setIntField(term170993, term170993.getClass(), "year", 2021);
        setShortField(term170993, term170993.getClass(), "month", (short) 4);
        setShortField(term170993, term170993.getClass(), "day", (short) 3);
        setField(term170992, term170992.getClass(), "date", term170993);
        setByteField(term170997, term170997.getClass(), "hour", (byte) 12);
        setByteField(term170997, term170997.getClass(), "minute", (byte) 34);
        setByteField(term170997, term170997.getClass(), "second", (byte) 25);
        setIntField(term170997, term170997.getClass(), "nano", 691683257);
        setField(term170992, term170992.getClass(), "time", term170997);
        setField(term170976, term170976.getClass(), "registerTime", term170992);
        setIntField(term171003, term171003.getClass(), "year", 2010);
        setShortField(term171003, term171003.getClass(), "month", (short) 9);
        setShortField(term171003, term171003.getClass(), "day", (short) 12);
        setField(term171002, term171002.getClass(), "date", term171003);
        setByteField(term171007, term171007.getClass(), "hour", (byte) 19);
        setByteField(term171007, term171007.getClass(), "minute", (byte) 55);
        setByteField(term171007, term171007.getClass(), "second", (byte) 15);
        setIntField(term171007, term171007.getClass(), "nano", 784115402);
        setField(term171002, term171002.getClass(), "time", term171007);
        setField(term170976, term170976.getClass(), "accessTime", term171002);
        setField(term170974, term170974.getClass(), "card", term170976);
        setIntField(term170974, term170974.getClass(), "lastDataVersion", -433430711);
        setField(term170974, term170974.getClass(), "userName", "OdQhbRFMKu");
        setIntField(term170974, term170974.getClass(), "point", -1857663039);
        setIntField(term170974, term170974.getClass(), "totalPoint", -1822997386);
        setIntField(term170974, term170974.getClass(), "iconId", -2139265574);
        setIntField(term170974, term170974.getClass(), "nameplateId", -2108555858);
        setIntField(term170974, term170974.getClass(), "frameId", 880277489);
        setIntField(term170974, term170974.getClass(), "trophyId", -764881926);
        setIntField(term170974, term170974.getClass(), "playCount", -1386724721);
        setIntField(term170974, term170974.getClass(), "playVsCount", 153311722);
        setIntField(term170974, term170974.getClass(), "playSyncCount", -243803795);
        setIntField(term170974, term170974.getClass(), "winCount", 1430449023);
        setIntField(term170974, term170974.getClass(), "helpCount", -171935996);
        setIntField(term170974, term170974.getClass(), "comboCount", 723680896);
        setIntField(term170974, term170974.getClass(), "feverCount", -386874080);
        setIntField(term170974, term170974.getClass(), "totalHiScore", 1815240252);
        setIntField(term170974, term170974.getClass(), "totalEasyHighScore", 1573146841);
        setIntField(term170974, term170974.getClass(), "totalBasicHighScore", -1594246910);
        setIntField(term170974, term170974.getClass(), "totalAdvancedHighScore", -614832476);
        setIntField(term170974, term170974.getClass(), "totalExpertHighScore", -301186353);
        setIntField(term170974, term170974.getClass(), "totalMasterHighScore", -858077362);
        setIntField(term170974, term170974.getClass(), "totalReMasterHighScore", 449900555);
        setIntField(term170974, term170974.getClass(), "totalHighSync", 1565660460);
        setIntField(term170974, term170974.getClass(), "totalEasySync", -1747207092);
        setIntField(term170974, term170974.getClass(), "totalBasicSync", -1543892799);
        setIntField(term170974, term170974.getClass(), "totalAdvancedSync", -1074797455);
        setIntField(term170974, term170974.getClass(), "totalExpertSync", 708136611);
        setIntField(term170974, term170974.getClass(), "totalMasterSync", -1065697128);
        setIntField(term170974, term170974.getClass(), "totalReMasterSync", 625183859);
        setIntField(term170974, term170974.getClass(), "playerRating", 1067897275);
        setIntField(term170974, term170974.getClass(), "highestRating", -632930027);
        setIntField(term170974, term170974.getClass(), "rankAuthTailId", 432041976);
        setField(term170974, term170974.getClass(), "eventWatchedDate", "pwniyUkqxT");
        setField(term170974, term170974.getClass(), "webLimitDate", "gtChMrVhZn");
        setIntField(term170974, term170974.getClass(), "challengeTrackPhase", 1809712274);
        setIntField(term170974, term170974.getClass(), "firstPlayBits", -1002692144);
        setField(term170974, term170974.getClass(), "lastPlayDate", "wghzZSjyPl");
        setIntField(term170974, term170974.getClass(), "lastPlaceId", -1555757490);
        setField(term170974, term170974.getClass(), "lastPlaceName", "CPkpKPIQrd");
        setIntField(term170974, term170974.getClass(), "lastRegionId", -1870343708);
        setField(term170974, term170974.getClass(), "lastRegionName", "KTqaReORfO");
        setField(term170974, term170974.getClass(), "lastClientId", "AfaIIRjDxi");
        setField(term170974, term170974.getClass(), "lastCountryCode", "oeadlojIQZ");
        setIntField(term170974, term170974.getClass(), "eventPoint", 346262643);
        setIntField(term170974, term170974.getClass(), "totalLv", -648730639);
        setIntField(term170974, term170974.getClass(), "lastLoginBonusDay", 2079225280);
        setIntField(term170974, term170974.getClass(), "lastSurvivalBonusDay", -1872557279);
        setIntField(term170974, term170974.getClass(), "loginBonusLv", -958890210);
        setField(term170972, term170972.getClass(), "user", term170974);
        setIntField(term170972, term170972.getClass(), "orderId", 607852265);
        setLongField(term170972, term170972.getClass(), "sortNumber", -234963564219631183L);
        setIntField(term170972, term170972.getClass(), "placeId", -1770278743);
        setField(term170972, term170972.getClass(), "placeName", "DqbGwXvmSC");
        setField(term170972, term170972.getClass(), "country", "aIIGYUOaLR");
        setIntField(term170972, term170972.getClass(), "regionId", 757096718);
        setField(term170972, term170972.getClass(), "playDate", "saqdcGiRfC");
        setField(term170972, term170972.getClass(), "userPlayDate", "xhQojgWfiF");
        setIntField(term170972, term170972.getClass(), "musicId", 1265984015);
        setIntField(term170972, term170972.getClass(), "level", -1262705021);
        setIntField(term170972, term170972.getClass(), "gameMode", -1437873035);
        setIntField(term170972, term170972.getClass(), "rivalNum", -1154507203);
        setIntField(term170972, term170972.getClass(), "track", -1713000389);
        setIntField(term170972, term170972.getClass(), "eventId", 2088770619);
        setBooleanField(term170972, term170972.getClass(), "isFreeToPlay", false);
        setIntField(term170972, term170972.getClass(), "playerRating", -1819066528);
        setLongField(term170972, term170972.getClass(), "playedUserId1", 3148960129338863858L);
        setField(term170972, term170972.getClass(), "playedUserName1", "hFxhVQNBry");
        setIntField(term170972, term170972.getClass(), "playedMusicLevel1", -936530875);
        setLongField(term170972, term170972.getClass(), "playedUserId2", 8567007307199068093L);
        setField(term170972, term170972.getClass(), "playedUserName2", "JrFOkJdQNH");
        setIntField(term170972, term170972.getClass(), "playedMusicLevel2", 1052365136);
        setLongField(term170972, term170972.getClass(), "playedUserId3", 8125394137486820640L);
        setField(term170972, term170972.getClass(), "playedUserName3", "SgjnbEXsMB");
        setIntField(term170972, term170972.getClass(), "playedMusicLevel3", -677336265);
        setIntField(term170972, term170972.getClass(), "achievement", -276630689);
        setIntField(term170972, term170972.getClass(), "score", -726829355);
        setIntField(term170972, term170972.getClass(), "tapScore", 1407893825);
        setIntField(term170972, term170972.getClass(), "holdScore", -273850505);
        setIntField(term170972, term170972.getClass(), "slideScore", 907223872);
        setIntField(term170972, term170972.getClass(), "breakScore", -1485411316);
        setIntField(term170972, term170972.getClass(), "syncRate", 1060252673);
        setIntField(term170972, term170972.getClass(), "vsWin", -2133915573);
        setBooleanField(term170972, term170972.getClass(), "isAllPerfect", false);
        setIntField(term170972, term170972.getClass(), "fullCombo", 1992058383);
        setIntField(term170972, term170972.getClass(), "maxFever", 549072392);
        setIntField(term170972, term170972.getClass(), "maxCombo", -371064434);
        setIntField(term170972, term170972.getClass(), "tapPerfect", 993908229);
        setIntField(term170972, term170972.getClass(), "tapGreat", -47477573);
        setIntField(term170972, term170972.getClass(), "tapGood", 2130397629);
        setIntField(term170972, term170972.getClass(), "tapBad", -1026374096);
        setIntField(term170972, term170972.getClass(), "holdPerfect", -1467572496);
        setIntField(term170972, term170972.getClass(), "holdGreat", 1419982330);
        setIntField(term170972, term170972.getClass(), "holdGood", -2002254073);
        setIntField(term170972, term170972.getClass(), "holdBad", -1229970686);
        setIntField(term170972, term170972.getClass(), "slidePerfect", 1605042048);
        setIntField(term170972, term170972.getClass(), "slideGreat", 512244841);
        setIntField(term170972, term170972.getClass(), "slideGood", -771119615);
        setIntField(term170972, term170972.getClass(), "slideBad", 1230994097);
        setIntField(term170972, term170972.getClass(), "breakPerfect", 472304074);
        setIntField(term170972, term170972.getClass(), "breakGreat", 415523574);
        setIntField(term170972, term170972.getClass(), "breakGood", -1067868777);
        setIntField(term170972, term170972.getClass(), "breakBad", 78939779);
        setBooleanField(term170972, term170972.getClass(), "isTrackSkip", true);
        setBooleanField(term170972, term170972.getClass(), "isHighScore", true);
        setBooleanField(term170972, term170972.getClass(), "isChallengeTrack", false);
        setIntField(term170972, term170972.getClass(), "challengeLife", 1570273334);
        setIntField(term170972, term170972.getClass(), "challengeRemain", 1165812609);
        setIntField(term170972, term170972.getClass(), "isAllPerfectPlus", 768847705);
        term171284 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term171284;
        callMethod(klass, "canEqual", argTypes, term170972, args);
    }

};


