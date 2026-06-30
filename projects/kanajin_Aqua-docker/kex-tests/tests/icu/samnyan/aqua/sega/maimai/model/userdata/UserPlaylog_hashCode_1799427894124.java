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

public class UserPlaylog_hashCode_1799427894124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term171445;

    public UserPlaylog_hashCode_1799427894124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term171451 = new Long(3831994970480278159L);
        term171445 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term171447 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term171449 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term171465 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term171466 = newInstance(Class.forName("java.time.LocalDate"));
        Object term171470 = newInstance(Class.forName("java.time.LocalTime"));
        Object term171475 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term171476 = newInstance(Class.forName("java.time.LocalDate"));
        Object term171480 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term171445, term171445.getClass(), "id", -3034337124103524360L);
        setLongField(term171447, term171447.getClass(), "id", 7703860081138133014L);
        setLongField(term171449, term171449.getClass(), "id", -5836140469306562215L);
        setField(term171449, term171449.getClass(), "extId", term171451);
        setField(term171449, term171449.getClass(), "luid", "vvGvdVbopl");
        setIntField(term171466, term171466.getClass(), "year", 2017);
        setShortField(term171466, term171466.getClass(), "month", (short) 10);
        setShortField(term171466, term171466.getClass(), "day", (short) 4);
        setField(term171465, term171465.getClass(), "date", term171466);
        setByteField(term171470, term171470.getClass(), "hour", (byte) 1);
        setByteField(term171470, term171470.getClass(), "minute", (byte) 21);
        setByteField(term171470, term171470.getClass(), "second", (byte) 3);
        setIntField(term171470, term171470.getClass(), "nano", 164928538);
        setField(term171465, term171465.getClass(), "time", term171470);
        setField(term171449, term171449.getClass(), "registerTime", term171465);
        setIntField(term171476, term171476.getClass(), "year", 2014);
        setShortField(term171476, term171476.getClass(), "month", (short) 5);
        setShortField(term171476, term171476.getClass(), "day", (short) 12);
        setField(term171475, term171475.getClass(), "date", term171476);
        setByteField(term171480, term171480.getClass(), "hour", (byte) 21);
        setByteField(term171480, term171480.getClass(), "minute", (byte) 50);
        setByteField(term171480, term171480.getClass(), "second", (byte) 24);
        setIntField(term171480, term171480.getClass(), "nano", 165505767);
        setField(term171475, term171475.getClass(), "time", term171480);
        setField(term171449, term171449.getClass(), "accessTime", term171475);
        setField(term171447, term171447.getClass(), "card", term171449);
        setIntField(term171447, term171447.getClass(), "lastDataVersion", -1318830181);
        setField(term171447, term171447.getClass(), "userName", "oWsWBayari");
        setIntField(term171447, term171447.getClass(), "point", -411986062);
        setIntField(term171447, term171447.getClass(), "totalPoint", 223396801);
        setIntField(term171447, term171447.getClass(), "iconId", -122362734);
        setIntField(term171447, term171447.getClass(), "nameplateId", -144271238);
        setIntField(term171447, term171447.getClass(), "frameId", 1424972713);
        setIntField(term171447, term171447.getClass(), "trophyId", 976032868);
        setIntField(term171447, term171447.getClass(), "playCount", -310064999);
        setIntField(term171447, term171447.getClass(), "playVsCount", -2030318903);
        setIntField(term171447, term171447.getClass(), "playSyncCount", -51718924);
        setIntField(term171447, term171447.getClass(), "winCount", -117211526);
        setIntField(term171447, term171447.getClass(), "helpCount", -1794673562);
        setIntField(term171447, term171447.getClass(), "comboCount", 1133657429);
        setIntField(term171447, term171447.getClass(), "feverCount", 1175680784);
        setIntField(term171447, term171447.getClass(), "totalHiScore", 2123481875);
        setIntField(term171447, term171447.getClass(), "totalEasyHighScore", 2097954663);
        setIntField(term171447, term171447.getClass(), "totalBasicHighScore", -770292134);
        setIntField(term171447, term171447.getClass(), "totalAdvancedHighScore", -165812143);
        setIntField(term171447, term171447.getClass(), "totalExpertHighScore", 758059302);
        setIntField(term171447, term171447.getClass(), "totalMasterHighScore", -1305073260);
        setIntField(term171447, term171447.getClass(), "totalReMasterHighScore", -1526379005);
        setIntField(term171447, term171447.getClass(), "totalHighSync", -795063337);
        setIntField(term171447, term171447.getClass(), "totalEasySync", 159274420);
        setIntField(term171447, term171447.getClass(), "totalBasicSync", -1122479423);
        setIntField(term171447, term171447.getClass(), "totalAdvancedSync", 775034161);
        setIntField(term171447, term171447.getClass(), "totalExpertSync", 1406434046);
        setIntField(term171447, term171447.getClass(), "totalMasterSync", 674425388);
        setIntField(term171447, term171447.getClass(), "totalReMasterSync", -1882057934);
        setIntField(term171447, term171447.getClass(), "playerRating", 1220551803);
        setIntField(term171447, term171447.getClass(), "highestRating", -1908678118);
        setIntField(term171447, term171447.getClass(), "rankAuthTailId", 1778861329);
        setField(term171447, term171447.getClass(), "eventWatchedDate", "zHAsiDDJCb");
        setField(term171447, term171447.getClass(), "webLimitDate", "yQPIyadxOz");
        setIntField(term171447, term171447.getClass(), "challengeTrackPhase", 1073449332);
        setIntField(term171447, term171447.getClass(), "firstPlayBits", -2118604939);
        setField(term171447, term171447.getClass(), "lastPlayDate", "pBpdxKmyFY");
        setIntField(term171447, term171447.getClass(), "lastPlaceId", -578292636);
        setField(term171447, term171447.getClass(), "lastPlaceName", "lEnMgQzxMz");
        setIntField(term171447, term171447.getClass(), "lastRegionId", 450597081);
        setField(term171447, term171447.getClass(), "lastRegionName", "KYrVRQYYLY");
        setField(term171447, term171447.getClass(), "lastClientId", "iiXiwzHGtZ");
        setField(term171447, term171447.getClass(), "lastCountryCode", "vMUryzcVEt");
        setIntField(term171447, term171447.getClass(), "eventPoint", 342667626);
        setIntField(term171447, term171447.getClass(), "totalLv", 1929066549);
        setIntField(term171447, term171447.getClass(), "lastLoginBonusDay", 331180846);
        setIntField(term171447, term171447.getClass(), "lastSurvivalBonusDay", -940815080);
        setIntField(term171447, term171447.getClass(), "loginBonusLv", -1804183387);
        setField(term171445, term171445.getClass(), "user", term171447);
        setIntField(term171445, term171445.getClass(), "orderId", 2138136338);
        setLongField(term171445, term171445.getClass(), "sortNumber", -9007332134350463845L);
        setIntField(term171445, term171445.getClass(), "placeId", -1634220962);
        setField(term171445, term171445.getClass(), "placeName", "bekkhEJXox");
        setField(term171445, term171445.getClass(), "country", "pTiGxmDpUW");
        setIntField(term171445, term171445.getClass(), "regionId", 762273245);
        setField(term171445, term171445.getClass(), "playDate", "OoCofiAnPP");
        setField(term171445, term171445.getClass(), "userPlayDate", "vjPbHKOEPZ");
        setIntField(term171445, term171445.getClass(), "musicId", -1211792391);
        setIntField(term171445, term171445.getClass(), "level", -2137797969);
        setIntField(term171445, term171445.getClass(), "gameMode", 893760537);
        setIntField(term171445, term171445.getClass(), "rivalNum", 1743269212);
        setIntField(term171445, term171445.getClass(), "track", -1197532596);
        setIntField(term171445, term171445.getClass(), "eventId", 951878711);
        setBooleanField(term171445, term171445.getClass(), "isFreeToPlay", false);
        setIntField(term171445, term171445.getClass(), "playerRating", -2029093442);
        setLongField(term171445, term171445.getClass(), "playedUserId1", 8545694832530342054L);
        setField(term171445, term171445.getClass(), "playedUserName1", "rvTeECGvmV");
        setIntField(term171445, term171445.getClass(), "playedMusicLevel1", 2003420108);
        setLongField(term171445, term171445.getClass(), "playedUserId2", -2935013818936662643L);
        setField(term171445, term171445.getClass(), "playedUserName2", "lDBTAFbBEZ");
        setIntField(term171445, term171445.getClass(), "playedMusicLevel2", 380299441);
        setLongField(term171445, term171445.getClass(), "playedUserId3", -8356746197417996521L);
        setField(term171445, term171445.getClass(), "playedUserName3", "YdjPhVNTEu");
        setIntField(term171445, term171445.getClass(), "playedMusicLevel3", 61973481);
        setIntField(term171445, term171445.getClass(), "achievement", -432052203);
        setIntField(term171445, term171445.getClass(), "score", -1794639470);
        setIntField(term171445, term171445.getClass(), "tapScore", 476206004);
        setIntField(term171445, term171445.getClass(), "holdScore", 1804093911);
        setIntField(term171445, term171445.getClass(), "slideScore", -453001017);
        setIntField(term171445, term171445.getClass(), "breakScore", 992421791);
        setIntField(term171445, term171445.getClass(), "syncRate", 1437092343);
        setIntField(term171445, term171445.getClass(), "vsWin", 599252713);
        setBooleanField(term171445, term171445.getClass(), "isAllPerfect", false);
        setIntField(term171445, term171445.getClass(), "fullCombo", -258137327);
        setIntField(term171445, term171445.getClass(), "maxFever", 309066261);
        setIntField(term171445, term171445.getClass(), "maxCombo", 1347767293);
        setIntField(term171445, term171445.getClass(), "tapPerfect", -483270104);
        setIntField(term171445, term171445.getClass(), "tapGreat", -1027017292);
        setIntField(term171445, term171445.getClass(), "tapGood", 486754608);
        setIntField(term171445, term171445.getClass(), "tapBad", 1088134469);
        setIntField(term171445, term171445.getClass(), "holdPerfect", -1731017159);
        setIntField(term171445, term171445.getClass(), "holdGreat", -899984336);
        setIntField(term171445, term171445.getClass(), "holdGood", -2095834013);
        setIntField(term171445, term171445.getClass(), "holdBad", -1697320294);
        setIntField(term171445, term171445.getClass(), "slidePerfect", 935633702);
        setIntField(term171445, term171445.getClass(), "slideGreat", -1245784272);
        setIntField(term171445, term171445.getClass(), "slideGood", -1146340415);
        setIntField(term171445, term171445.getClass(), "slideBad", -930336343);
        setIntField(term171445, term171445.getClass(), "breakPerfect", -1816870812);
        setIntField(term171445, term171445.getClass(), "breakGreat", 57405511);
        setIntField(term171445, term171445.getClass(), "breakGood", -2019953762);
        setIntField(term171445, term171445.getClass(), "breakBad", 850073044);
        setBooleanField(term171445, term171445.getClass(), "isTrackSkip", false);
        setBooleanField(term171445, term171445.getClass(), "isHighScore", false);
        setBooleanField(term171445, term171445.getClass(), "isChallengeTrack", false);
        setIntField(term171445, term171445.getClass(), "challengeLife", 1934179089);
        setIntField(term171445, term171445.getClass(), "challengeRemain", -804139811);
        setIntField(term171445, term171445.getClass(), "isAllPerfectPlus", 1168895606);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term171445, args);
    }

};


