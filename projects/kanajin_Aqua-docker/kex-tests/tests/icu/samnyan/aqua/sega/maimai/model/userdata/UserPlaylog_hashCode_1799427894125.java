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

public class UserPlaylog_hashCode_1799427894125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term171501;

    public UserPlaylog_hashCode_1799427894125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term171507 = new Long(3831994970480278159L);
        term171501 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term171503 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term171505 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term171521 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term171522 = newInstance(Class.forName("java.time.LocalDate"));
        Object term171526 = newInstance(Class.forName("java.time.LocalTime"));
        Object term171531 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term171532 = newInstance(Class.forName("java.time.LocalDate"));
        Object term171536 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term171501, term171501.getClass(), "id", -3034337124103524360L);
        setLongField(term171503, term171503.getClass(), "id", 7703860081138133014L);
        setLongField(term171505, term171505.getClass(), "id", -5836140469306562215L);
        setField(term171505, term171505.getClass(), "extId", term171507);
        setField(term171505, term171505.getClass(), "luid", "vvGvdVbopl");
        setIntField(term171522, term171522.getClass(), "year", 2017);
        setShortField(term171522, term171522.getClass(), "month", (short) 10);
        setShortField(term171522, term171522.getClass(), "day", (short) 4);
        setField(term171521, term171521.getClass(), "date", term171522);
        setByteField(term171526, term171526.getClass(), "hour", (byte) 1);
        setByteField(term171526, term171526.getClass(), "minute", (byte) 21);
        setByteField(term171526, term171526.getClass(), "second", (byte) 3);
        setIntField(term171526, term171526.getClass(), "nano", 164928538);
        setField(term171521, term171521.getClass(), "time", term171526);
        setField(term171505, term171505.getClass(), "registerTime", term171521);
        setIntField(term171532, term171532.getClass(), "year", 2014);
        setShortField(term171532, term171532.getClass(), "month", (short) 5);
        setShortField(term171532, term171532.getClass(), "day", (short) 12);
        setField(term171531, term171531.getClass(), "date", term171532);
        setByteField(term171536, term171536.getClass(), "hour", (byte) 21);
        setByteField(term171536, term171536.getClass(), "minute", (byte) 50);
        setByteField(term171536, term171536.getClass(), "second", (byte) 24);
        setIntField(term171536, term171536.getClass(), "nano", 165505767);
        setField(term171531, term171531.getClass(), "time", term171536);
        setField(term171505, term171505.getClass(), "accessTime", term171531);
        setField(term171503, term171503.getClass(), "card", term171505);
        setIntField(term171503, term171503.getClass(), "lastDataVersion", -1318830181);
        setField(term171503, term171503.getClass(), "userName", "oWsWBayari");
        setIntField(term171503, term171503.getClass(), "point", -411986062);
        setIntField(term171503, term171503.getClass(), "totalPoint", 223396801);
        setIntField(term171503, term171503.getClass(), "iconId", -122362734);
        setIntField(term171503, term171503.getClass(), "nameplateId", -144271238);
        setIntField(term171503, term171503.getClass(), "frameId", 1424972713);
        setIntField(term171503, term171503.getClass(), "trophyId", 976032868);
        setIntField(term171503, term171503.getClass(), "playCount", -310064999);
        setIntField(term171503, term171503.getClass(), "playVsCount", -2030318903);
        setIntField(term171503, term171503.getClass(), "playSyncCount", -51718924);
        setIntField(term171503, term171503.getClass(), "winCount", -117211526);
        setIntField(term171503, term171503.getClass(), "helpCount", -1794673562);
        setIntField(term171503, term171503.getClass(), "comboCount", 1133657429);
        setIntField(term171503, term171503.getClass(), "feverCount", 1175680784);
        setIntField(term171503, term171503.getClass(), "totalHiScore", 2123481875);
        setIntField(term171503, term171503.getClass(), "totalEasyHighScore", 2097954663);
        setIntField(term171503, term171503.getClass(), "totalBasicHighScore", -770292134);
        setIntField(term171503, term171503.getClass(), "totalAdvancedHighScore", -165812143);
        setIntField(term171503, term171503.getClass(), "totalExpertHighScore", 758059302);
        setIntField(term171503, term171503.getClass(), "totalMasterHighScore", -1305073260);
        setIntField(term171503, term171503.getClass(), "totalReMasterHighScore", -1526379005);
        setIntField(term171503, term171503.getClass(), "totalHighSync", -795063337);
        setIntField(term171503, term171503.getClass(), "totalEasySync", 159274420);
        setIntField(term171503, term171503.getClass(), "totalBasicSync", -1122479423);
        setIntField(term171503, term171503.getClass(), "totalAdvancedSync", 775034161);
        setIntField(term171503, term171503.getClass(), "totalExpertSync", 1406434046);
        setIntField(term171503, term171503.getClass(), "totalMasterSync", 674425388);
        setIntField(term171503, term171503.getClass(), "totalReMasterSync", -1882057934);
        setIntField(term171503, term171503.getClass(), "playerRating", 1220551803);
        setIntField(term171503, term171503.getClass(), "highestRating", -1908678118);
        setIntField(term171503, term171503.getClass(), "rankAuthTailId", 1778861329);
        setField(term171503, term171503.getClass(), "eventWatchedDate", "zHAsiDDJCb");
        setField(term171503, term171503.getClass(), "webLimitDate", "yQPIyadxOz");
        setIntField(term171503, term171503.getClass(), "challengeTrackPhase", 1073449332);
        setIntField(term171503, term171503.getClass(), "firstPlayBits", -2118604939);
        setField(term171503, term171503.getClass(), "lastPlayDate", "pBpdxKmyFY");
        setIntField(term171503, term171503.getClass(), "lastPlaceId", -578292636);
        setField(term171503, term171503.getClass(), "lastPlaceName", "lEnMgQzxMz");
        setIntField(term171503, term171503.getClass(), "lastRegionId", 450597081);
        setField(term171503, term171503.getClass(), "lastRegionName", "KYrVRQYYLY");
        setField(term171503, term171503.getClass(), "lastClientId", "iiXiwzHGtZ");
        setField(term171503, term171503.getClass(), "lastCountryCode", "vMUryzcVEt");
        setIntField(term171503, term171503.getClass(), "eventPoint", 342667626);
        setIntField(term171503, term171503.getClass(), "totalLv", 1929066549);
        setIntField(term171503, term171503.getClass(), "lastLoginBonusDay", 331180846);
        setIntField(term171503, term171503.getClass(), "lastSurvivalBonusDay", -940815080);
        setIntField(term171503, term171503.getClass(), "loginBonusLv", -1804183387);
        setField(term171501, term171501.getClass(), "user", term171503);
        setIntField(term171501, term171501.getClass(), "orderId", 2138136338);
        setLongField(term171501, term171501.getClass(), "sortNumber", -9007332134350463845L);
        setIntField(term171501, term171501.getClass(), "placeId", -1634220962);
        setField(term171501, term171501.getClass(), "placeName", "bekkhEJXox");
        setField(term171501, term171501.getClass(), "country", "pTiGxmDpUW");
        setIntField(term171501, term171501.getClass(), "regionId", 762273245);
        setField(term171501, term171501.getClass(), "playDate", "OoCofiAnPP");
        setField(term171501, term171501.getClass(), "userPlayDate", "vjPbHKOEPZ");
        setIntField(term171501, term171501.getClass(), "musicId", -1211792391);
        setIntField(term171501, term171501.getClass(), "level", -2137797969);
        setIntField(term171501, term171501.getClass(), "gameMode", 893760537);
        setIntField(term171501, term171501.getClass(), "rivalNum", 1743269212);
        setIntField(term171501, term171501.getClass(), "track", -1197532596);
        setIntField(term171501, term171501.getClass(), "eventId", 951878711);
        setBooleanField(term171501, term171501.getClass(), "isFreeToPlay", false);
        setIntField(term171501, term171501.getClass(), "playerRating", -2029093442);
        setLongField(term171501, term171501.getClass(), "playedUserId1", 8545694832530342054L);
        setField(term171501, term171501.getClass(), "playedUserName1", "rvTeECGvmV");
        setIntField(term171501, term171501.getClass(), "playedMusicLevel1", 2003420108);
        setLongField(term171501, term171501.getClass(), "playedUserId2", -2935013818936662643L);
        setField(term171501, term171501.getClass(), "playedUserName2", "lDBTAFbBEZ");
        setIntField(term171501, term171501.getClass(), "playedMusicLevel2", 380299441);
        setLongField(term171501, term171501.getClass(), "playedUserId3", -8356746197417996521L);
        setField(term171501, term171501.getClass(), "playedUserName3", "YdjPhVNTEu");
        setIntField(term171501, term171501.getClass(), "playedMusicLevel3", 61973481);
        setIntField(term171501, term171501.getClass(), "achievement", -432052203);
        setIntField(term171501, term171501.getClass(), "score", -1794639470);
        setIntField(term171501, term171501.getClass(), "tapScore", 476206004);
        setIntField(term171501, term171501.getClass(), "holdScore", 1804093911);
        setIntField(term171501, term171501.getClass(), "slideScore", -453001017);
        setIntField(term171501, term171501.getClass(), "breakScore", 992421791);
        setIntField(term171501, term171501.getClass(), "syncRate", 1437092343);
        setIntField(term171501, term171501.getClass(), "vsWin", 599252713);
        setBooleanField(term171501, term171501.getClass(), "isAllPerfect", false);
        setIntField(term171501, term171501.getClass(), "fullCombo", -258137327);
        setIntField(term171501, term171501.getClass(), "maxFever", 309066261);
        setIntField(term171501, term171501.getClass(), "maxCombo", 1347767293);
        setIntField(term171501, term171501.getClass(), "tapPerfect", -483270104);
        setIntField(term171501, term171501.getClass(), "tapGreat", -1027017292);
        setIntField(term171501, term171501.getClass(), "tapGood", 486754608);
        setIntField(term171501, term171501.getClass(), "tapBad", 1088134469);
        setIntField(term171501, term171501.getClass(), "holdPerfect", -1731017159);
        setIntField(term171501, term171501.getClass(), "holdGreat", -899984336);
        setIntField(term171501, term171501.getClass(), "holdGood", -2095834013);
        setIntField(term171501, term171501.getClass(), "holdBad", -1697320294);
        setIntField(term171501, term171501.getClass(), "slidePerfect", 935633702);
        setIntField(term171501, term171501.getClass(), "slideGreat", -1245784272);
        setIntField(term171501, term171501.getClass(), "slideGood", -1146340415);
        setIntField(term171501, term171501.getClass(), "slideBad", -930336343);
        setIntField(term171501, term171501.getClass(), "breakPerfect", -1816870812);
        setIntField(term171501, term171501.getClass(), "breakGreat", 57405511);
        setIntField(term171501, term171501.getClass(), "breakGood", -2019953762);
        setIntField(term171501, term171501.getClass(), "breakBad", 850073044);
        setBooleanField(term171501, term171501.getClass(), "isTrackSkip", false);
        setBooleanField(term171501, term171501.getClass(), "isHighScore", false);
        setBooleanField(term171501, term171501.getClass(), "isChallengeTrack", false);
        setIntField(term171501, term171501.getClass(), "challengeLife", 1934179089);
        setIntField(term171501, term171501.getClass(), "challengeRemain", -804139811);
        setIntField(term171501, term171501.getClass(), "isAllPerfectPlus", 1168895606);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term171501, args);
    }

};


