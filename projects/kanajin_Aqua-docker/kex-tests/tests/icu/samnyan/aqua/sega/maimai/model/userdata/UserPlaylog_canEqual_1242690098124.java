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

public class UserPlaylog_canEqual_1242690098124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term171028;
     Object term171340;

    public UserPlaylog_canEqual_1242690098124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term171034 = new Long(-6254265799185295775L);
        term171028 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term171030 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term171032 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term171048 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term171049 = newInstance(Class.forName("java.time.LocalDate"));
        Object term171053 = newInstance(Class.forName("java.time.LocalTime"));
        Object term171058 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term171059 = newInstance(Class.forName("java.time.LocalDate"));
        Object term171063 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term171028, term171028.getClass(), "id", 38842281830560892L);
        setLongField(term171030, term171030.getClass(), "id", 2485168218246856776L);
        setLongField(term171032, term171032.getClass(), "id", 7984812876118160348L);
        setField(term171032, term171032.getClass(), "extId", term171034);
        setField(term171032, term171032.getClass(), "luid", "ZXcuwiDFkz");
        setIntField(term171049, term171049.getClass(), "year", 2021);
        setShortField(term171049, term171049.getClass(), "month", (short) 4);
        setShortField(term171049, term171049.getClass(), "day", (short) 3);
        setField(term171048, term171048.getClass(), "date", term171049);
        setByteField(term171053, term171053.getClass(), "hour", (byte) 12);
        setByteField(term171053, term171053.getClass(), "minute", (byte) 34);
        setByteField(term171053, term171053.getClass(), "second", (byte) 25);
        setIntField(term171053, term171053.getClass(), "nano", 691683257);
        setField(term171048, term171048.getClass(), "time", term171053);
        setField(term171032, term171032.getClass(), "registerTime", term171048);
        setIntField(term171059, term171059.getClass(), "year", 2010);
        setShortField(term171059, term171059.getClass(), "month", (short) 9);
        setShortField(term171059, term171059.getClass(), "day", (short) 12);
        setField(term171058, term171058.getClass(), "date", term171059);
        setByteField(term171063, term171063.getClass(), "hour", (byte) 19);
        setByteField(term171063, term171063.getClass(), "minute", (byte) 55);
        setByteField(term171063, term171063.getClass(), "second", (byte) 15);
        setIntField(term171063, term171063.getClass(), "nano", 784115402);
        setField(term171058, term171058.getClass(), "time", term171063);
        setField(term171032, term171032.getClass(), "accessTime", term171058);
        setField(term171030, term171030.getClass(), "card", term171032);
        setIntField(term171030, term171030.getClass(), "lastDataVersion", -433430711);
        setField(term171030, term171030.getClass(), "userName", "OdQhbRFMKu");
        setIntField(term171030, term171030.getClass(), "point", -1857663039);
        setIntField(term171030, term171030.getClass(), "totalPoint", -1822997386);
        setIntField(term171030, term171030.getClass(), "iconId", -2139265574);
        setIntField(term171030, term171030.getClass(), "nameplateId", -2108555858);
        setIntField(term171030, term171030.getClass(), "frameId", 880277489);
        setIntField(term171030, term171030.getClass(), "trophyId", -764881926);
        setIntField(term171030, term171030.getClass(), "playCount", -1386724721);
        setIntField(term171030, term171030.getClass(), "playVsCount", 153311722);
        setIntField(term171030, term171030.getClass(), "playSyncCount", -243803795);
        setIntField(term171030, term171030.getClass(), "winCount", 1430449023);
        setIntField(term171030, term171030.getClass(), "helpCount", -171935996);
        setIntField(term171030, term171030.getClass(), "comboCount", 723680896);
        setIntField(term171030, term171030.getClass(), "feverCount", -386874080);
        setIntField(term171030, term171030.getClass(), "totalHiScore", 1815240252);
        setIntField(term171030, term171030.getClass(), "totalEasyHighScore", 1573146841);
        setIntField(term171030, term171030.getClass(), "totalBasicHighScore", -1594246910);
        setIntField(term171030, term171030.getClass(), "totalAdvancedHighScore", -614832476);
        setIntField(term171030, term171030.getClass(), "totalExpertHighScore", -301186353);
        setIntField(term171030, term171030.getClass(), "totalMasterHighScore", -858077362);
        setIntField(term171030, term171030.getClass(), "totalReMasterHighScore", 449900555);
        setIntField(term171030, term171030.getClass(), "totalHighSync", 1565660460);
        setIntField(term171030, term171030.getClass(), "totalEasySync", -1747207092);
        setIntField(term171030, term171030.getClass(), "totalBasicSync", -1543892799);
        setIntField(term171030, term171030.getClass(), "totalAdvancedSync", -1074797455);
        setIntField(term171030, term171030.getClass(), "totalExpertSync", 708136611);
        setIntField(term171030, term171030.getClass(), "totalMasterSync", -1065697128);
        setIntField(term171030, term171030.getClass(), "totalReMasterSync", 625183859);
        setIntField(term171030, term171030.getClass(), "playerRating", 1067897275);
        setIntField(term171030, term171030.getClass(), "highestRating", -632930027);
        setIntField(term171030, term171030.getClass(), "rankAuthTailId", 432041976);
        setField(term171030, term171030.getClass(), "eventWatchedDate", "pwniyUkqxT");
        setField(term171030, term171030.getClass(), "webLimitDate", "gtChMrVhZn");
        setIntField(term171030, term171030.getClass(), "challengeTrackPhase", 1809712274);
        setIntField(term171030, term171030.getClass(), "firstPlayBits", -1002692144);
        setField(term171030, term171030.getClass(), "lastPlayDate", "wghzZSjyPl");
        setIntField(term171030, term171030.getClass(), "lastPlaceId", -1555757490);
        setField(term171030, term171030.getClass(), "lastPlaceName", "CPkpKPIQrd");
        setIntField(term171030, term171030.getClass(), "lastRegionId", -1870343708);
        setField(term171030, term171030.getClass(), "lastRegionName", "KTqaReORfO");
        setField(term171030, term171030.getClass(), "lastClientId", "AfaIIRjDxi");
        setField(term171030, term171030.getClass(), "lastCountryCode", "oeadlojIQZ");
        setIntField(term171030, term171030.getClass(), "eventPoint", 346262643);
        setIntField(term171030, term171030.getClass(), "totalLv", -648730639);
        setIntField(term171030, term171030.getClass(), "lastLoginBonusDay", 2079225280);
        setIntField(term171030, term171030.getClass(), "lastSurvivalBonusDay", -1872557279);
        setIntField(term171030, term171030.getClass(), "loginBonusLv", -958890210);
        setField(term171028, term171028.getClass(), "user", term171030);
        setIntField(term171028, term171028.getClass(), "orderId", 607852265);
        setLongField(term171028, term171028.getClass(), "sortNumber", -234963564219631183L);
        setIntField(term171028, term171028.getClass(), "placeId", -1770278743);
        setField(term171028, term171028.getClass(), "placeName", "DqbGwXvmSC");
        setField(term171028, term171028.getClass(), "country", "aIIGYUOaLR");
        setIntField(term171028, term171028.getClass(), "regionId", 757096718);
        setField(term171028, term171028.getClass(), "playDate", "saqdcGiRfC");
        setField(term171028, term171028.getClass(), "userPlayDate", "xhQojgWfiF");
        setIntField(term171028, term171028.getClass(), "musicId", 1265984015);
        setIntField(term171028, term171028.getClass(), "level", -1262705021);
        setIntField(term171028, term171028.getClass(), "gameMode", -1437873035);
        setIntField(term171028, term171028.getClass(), "rivalNum", -1154507203);
        setIntField(term171028, term171028.getClass(), "track", -1713000389);
        setIntField(term171028, term171028.getClass(), "eventId", 2088770619);
        setBooleanField(term171028, term171028.getClass(), "isFreeToPlay", false);
        setIntField(term171028, term171028.getClass(), "playerRating", -1819066528);
        setLongField(term171028, term171028.getClass(), "playedUserId1", 3148960129338863858L);
        setField(term171028, term171028.getClass(), "playedUserName1", "hFxhVQNBry");
        setIntField(term171028, term171028.getClass(), "playedMusicLevel1", -936530875);
        setLongField(term171028, term171028.getClass(), "playedUserId2", 8567007307199068093L);
        setField(term171028, term171028.getClass(), "playedUserName2", "JrFOkJdQNH");
        setIntField(term171028, term171028.getClass(), "playedMusicLevel2", 1052365136);
        setLongField(term171028, term171028.getClass(), "playedUserId3", 8125394137486820640L);
        setField(term171028, term171028.getClass(), "playedUserName3", "SgjnbEXsMB");
        setIntField(term171028, term171028.getClass(), "playedMusicLevel3", -677336265);
        setIntField(term171028, term171028.getClass(), "achievement", -276630689);
        setIntField(term171028, term171028.getClass(), "score", -726829355);
        setIntField(term171028, term171028.getClass(), "tapScore", 1407893825);
        setIntField(term171028, term171028.getClass(), "holdScore", -273850505);
        setIntField(term171028, term171028.getClass(), "slideScore", 907223872);
        setIntField(term171028, term171028.getClass(), "breakScore", -1485411316);
        setIntField(term171028, term171028.getClass(), "syncRate", 1060252673);
        setIntField(term171028, term171028.getClass(), "vsWin", -2133915573);
        setBooleanField(term171028, term171028.getClass(), "isAllPerfect", false);
        setIntField(term171028, term171028.getClass(), "fullCombo", 1992058383);
        setIntField(term171028, term171028.getClass(), "maxFever", 549072392);
        setIntField(term171028, term171028.getClass(), "maxCombo", -371064434);
        setIntField(term171028, term171028.getClass(), "tapPerfect", 993908229);
        setIntField(term171028, term171028.getClass(), "tapGreat", -47477573);
        setIntField(term171028, term171028.getClass(), "tapGood", 2130397629);
        setIntField(term171028, term171028.getClass(), "tapBad", -1026374096);
        setIntField(term171028, term171028.getClass(), "holdPerfect", -1467572496);
        setIntField(term171028, term171028.getClass(), "holdGreat", 1419982330);
        setIntField(term171028, term171028.getClass(), "holdGood", -2002254073);
        setIntField(term171028, term171028.getClass(), "holdBad", -1229970686);
        setIntField(term171028, term171028.getClass(), "slidePerfect", 1605042048);
        setIntField(term171028, term171028.getClass(), "slideGreat", 512244841);
        setIntField(term171028, term171028.getClass(), "slideGood", -771119615);
        setIntField(term171028, term171028.getClass(), "slideBad", 1230994097);
        setIntField(term171028, term171028.getClass(), "breakPerfect", 472304074);
        setIntField(term171028, term171028.getClass(), "breakGreat", 415523574);
        setIntField(term171028, term171028.getClass(), "breakGood", -1067868777);
        setIntField(term171028, term171028.getClass(), "breakBad", 78939779);
        setBooleanField(term171028, term171028.getClass(), "isTrackSkip", true);
        setBooleanField(term171028, term171028.getClass(), "isHighScore", true);
        setBooleanField(term171028, term171028.getClass(), "isChallengeTrack", false);
        setIntField(term171028, term171028.getClass(), "challengeLife", 1570273334);
        setIntField(term171028, term171028.getClass(), "challengeRemain", 1165812609);
        setIntField(term171028, term171028.getClass(), "isAllPerfectPlus", 768847705);
        term171340 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term171340;
        callMethod(klass, "canEqual", argTypes, term171028, args);
    }

};


