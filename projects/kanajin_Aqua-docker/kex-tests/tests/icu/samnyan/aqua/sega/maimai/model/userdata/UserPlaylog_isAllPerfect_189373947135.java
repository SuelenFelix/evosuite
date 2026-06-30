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

public class UserPlaylog_isAllPerfect_189373947135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term128911;

    public UserPlaylog_isAllPerfect_189373947135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term128917 = new Long(7006402814669334483L);
        term128911 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term128913 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term128915 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term128931 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term128932 = newInstance(Class.forName("java.time.LocalDate"));
        Object term128936 = newInstance(Class.forName("java.time.LocalTime"));
        Object term128941 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term128942 = newInstance(Class.forName("java.time.LocalDate"));
        Object term128946 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term128911, term128911.getClass(), "id", 1825930100036048086L);
        setLongField(term128913, term128913.getClass(), "id", -2725312432196215741L);
        setLongField(term128915, term128915.getClass(), "id", -4647685842587984295L);
        setField(term128915, term128915.getClass(), "extId", term128917);
        setField(term128915, term128915.getClass(), "luid", "xgjvpKAqFv");
        setIntField(term128932, term128932.getClass(), "year", 2025);
        setShortField(term128932, term128932.getClass(), "month", (short) 8);
        setShortField(term128932, term128932.getClass(), "day", (short) 27);
        setField(term128931, term128931.getClass(), "date", term128932);
        setByteField(term128936, term128936.getClass(), "hour", (byte) 17);
        setByteField(term128936, term128936.getClass(), "minute", (byte) 10);
        setByteField(term128936, term128936.getClass(), "second", (byte) 17);
        setIntField(term128936, term128936.getClass(), "nano", 43520203);
        setField(term128931, term128931.getClass(), "time", term128936);
        setField(term128915, term128915.getClass(), "registerTime", term128931);
        setIntField(term128942, term128942.getClass(), "year", 2029);
        setShortField(term128942, term128942.getClass(), "month", (short) 4);
        setShortField(term128942, term128942.getClass(), "day", (short) 4);
        setField(term128941, term128941.getClass(), "date", term128942);
        setByteField(term128946, term128946.getClass(), "hour", (byte) 21);
        setByteField(term128946, term128946.getClass(), "minute", (byte) 28);
        setByteField(term128946, term128946.getClass(), "second", (byte) 58);
        setIntField(term128946, term128946.getClass(), "nano", 639031577);
        setField(term128941, term128941.getClass(), "time", term128946);
        setField(term128915, term128915.getClass(), "accessTime", term128941);
        setField(term128913, term128913.getClass(), "card", term128915);
        setIntField(term128913, term128913.getClass(), "lastDataVersion", 1351456274);
        setField(term128913, term128913.getClass(), "userName", "RspkCWCAFM");
        setIntField(term128913, term128913.getClass(), "point", -1002447476);
        setIntField(term128913, term128913.getClass(), "totalPoint", 1925781036);
        setIntField(term128913, term128913.getClass(), "iconId", -58183224);
        setIntField(term128913, term128913.getClass(), "nameplateId", -1620159206);
        setIntField(term128913, term128913.getClass(), "frameId", 2040576480);
        setIntField(term128913, term128913.getClass(), "trophyId", 708993481);
        setIntField(term128913, term128913.getClass(), "playCount", 753265710);
        setIntField(term128913, term128913.getClass(), "playVsCount", 1870531016);
        setIntField(term128913, term128913.getClass(), "playSyncCount", 1480820350);
        setIntField(term128913, term128913.getClass(), "winCount", -1991034214);
        setIntField(term128913, term128913.getClass(), "helpCount", 888374930);
        setIntField(term128913, term128913.getClass(), "comboCount", -303377527);
        setIntField(term128913, term128913.getClass(), "feverCount", 1314084459);
        setIntField(term128913, term128913.getClass(), "totalHiScore", 1166953728);
        setIntField(term128913, term128913.getClass(), "totalEasyHighScore", -491154679);
        setIntField(term128913, term128913.getClass(), "totalBasicHighScore", 578988160);
        setIntField(term128913, term128913.getClass(), "totalAdvancedHighScore", 913597896);
        setIntField(term128913, term128913.getClass(), "totalExpertHighScore", -1479510884);
        setIntField(term128913, term128913.getClass(), "totalMasterHighScore", -402293884);
        setIntField(term128913, term128913.getClass(), "totalReMasterHighScore", 1232167596);
        setIntField(term128913, term128913.getClass(), "totalHighSync", 581831203);
        setIntField(term128913, term128913.getClass(), "totalEasySync", 87525395);
        setIntField(term128913, term128913.getClass(), "totalBasicSync", -415212479);
        setIntField(term128913, term128913.getClass(), "totalAdvancedSync", 1307573065);
        setIntField(term128913, term128913.getClass(), "totalExpertSync", -2137861111);
        setIntField(term128913, term128913.getClass(), "totalMasterSync", 2127797521);
        setIntField(term128913, term128913.getClass(), "totalReMasterSync", -2135649917);
        setIntField(term128913, term128913.getClass(), "playerRating", -1474193289);
        setIntField(term128913, term128913.getClass(), "highestRating", -170871329);
        setIntField(term128913, term128913.getClass(), "rankAuthTailId", 291113104);
        setField(term128913, term128913.getClass(), "eventWatchedDate", "zAkmDkobmH");
        setField(term128913, term128913.getClass(), "webLimitDate", "FASdrZqBfN");
        setIntField(term128913, term128913.getClass(), "challengeTrackPhase", 179432580);
        setIntField(term128913, term128913.getClass(), "firstPlayBits", -1258204903);
        setField(term128913, term128913.getClass(), "lastPlayDate", "YNwqJgOcWq");
        setIntField(term128913, term128913.getClass(), "lastPlaceId", -1130609679);
        setField(term128913, term128913.getClass(), "lastPlaceName", "tUcoJjDoJV");
        setIntField(term128913, term128913.getClass(), "lastRegionId", -1261330598);
        setField(term128913, term128913.getClass(), "lastRegionName", "ICNsClDoAn");
        setField(term128913, term128913.getClass(), "lastClientId", "LACfLkaJjq");
        setField(term128913, term128913.getClass(), "lastCountryCode", "OhYEjeUQkK");
        setIntField(term128913, term128913.getClass(), "eventPoint", -1047805014);
        setIntField(term128913, term128913.getClass(), "totalLv", 1879952127);
        setIntField(term128913, term128913.getClass(), "lastLoginBonusDay", -486055477);
        setIntField(term128913, term128913.getClass(), "lastSurvivalBonusDay", -710673716);
        setIntField(term128913, term128913.getClass(), "loginBonusLv", 879448569);
        setField(term128911, term128911.getClass(), "user", term128913);
        setIntField(term128911, term128911.getClass(), "orderId", 1636702023);
        setLongField(term128911, term128911.getClass(), "sortNumber", -7620419977716696564L);
        setIntField(term128911, term128911.getClass(), "placeId", -2138771257);
        setField(term128911, term128911.getClass(), "placeName", "rgZeldfAMO");
        setField(term128911, term128911.getClass(), "country", "btsBDylBZe");
        setIntField(term128911, term128911.getClass(), "regionId", -1258830372);
        setField(term128911, term128911.getClass(), "playDate", "eAWJddaxnT");
        setField(term128911, term128911.getClass(), "userPlayDate", "PyaMftIAzC");
        setIntField(term128911, term128911.getClass(), "musicId", -459007543);
        setIntField(term128911, term128911.getClass(), "level", 1545433344);
        setIntField(term128911, term128911.getClass(), "gameMode", -287288345);
        setIntField(term128911, term128911.getClass(), "rivalNum", 1777620572);
        setIntField(term128911, term128911.getClass(), "track", -841007432);
        setIntField(term128911, term128911.getClass(), "eventId", -287194609);
        setBooleanField(term128911, term128911.getClass(), "isFreeToPlay", true);
        setIntField(term128911, term128911.getClass(), "playerRating", -1593254684);
        setLongField(term128911, term128911.getClass(), "playedUserId1", 102282101180071600L);
        setField(term128911, term128911.getClass(), "playedUserName1", "QiSmNdQUzl");
        setIntField(term128911, term128911.getClass(), "playedMusicLevel1", 13571711);
        setLongField(term128911, term128911.getClass(), "playedUserId2", -1795306210380148654L);
        setField(term128911, term128911.getClass(), "playedUserName2", "FsjVOWFhLi");
        setIntField(term128911, term128911.getClass(), "playedMusicLevel2", 1766722273);
        setLongField(term128911, term128911.getClass(), "playedUserId3", -1441295073480062630L);
        setField(term128911, term128911.getClass(), "playedUserName3", "RReQXZQnIR");
        setIntField(term128911, term128911.getClass(), "playedMusicLevel3", 162206294);
        setIntField(term128911, term128911.getClass(), "achievement", -276924794);
        setIntField(term128911, term128911.getClass(), "score", 59212444);
        setIntField(term128911, term128911.getClass(), "tapScore", -1268575411);
        setIntField(term128911, term128911.getClass(), "holdScore", 1668826386);
        setIntField(term128911, term128911.getClass(), "slideScore", 1361977398);
        setIntField(term128911, term128911.getClass(), "breakScore", 188661554);
        setIntField(term128911, term128911.getClass(), "syncRate", -2020298839);
        setIntField(term128911, term128911.getClass(), "vsWin", -1799370620);
        setBooleanField(term128911, term128911.getClass(), "isAllPerfect", false);
        setIntField(term128911, term128911.getClass(), "fullCombo", -43905327);
        setIntField(term128911, term128911.getClass(), "maxFever", -1939600597);
        setIntField(term128911, term128911.getClass(), "maxCombo", -1029523143);
        setIntField(term128911, term128911.getClass(), "tapPerfect", 1000414163);
        setIntField(term128911, term128911.getClass(), "tapGreat", -112032066);
        setIntField(term128911, term128911.getClass(), "tapGood", 599757412);
        setIntField(term128911, term128911.getClass(), "tapBad", 1560593676);
        setIntField(term128911, term128911.getClass(), "holdPerfect", -1022472400);
        setIntField(term128911, term128911.getClass(), "holdGreat", -2027830462);
        setIntField(term128911, term128911.getClass(), "holdGood", 1123640429);
        setIntField(term128911, term128911.getClass(), "holdBad", -1849340559);
        setIntField(term128911, term128911.getClass(), "slidePerfect", -984948165);
        setIntField(term128911, term128911.getClass(), "slideGreat", -841056494);
        setIntField(term128911, term128911.getClass(), "slideGood", 1087542157);
        setIntField(term128911, term128911.getClass(), "slideBad", 694255273);
        setIntField(term128911, term128911.getClass(), "breakPerfect", 1611637924);
        setIntField(term128911, term128911.getClass(), "breakGreat", 936243753);
        setIntField(term128911, term128911.getClass(), "breakGood", -803028984);
        setIntField(term128911, term128911.getClass(), "breakBad", 1233951453);
        setBooleanField(term128911, term128911.getClass(), "isTrackSkip", false);
        setBooleanField(term128911, term128911.getClass(), "isHighScore", false);
        setBooleanField(term128911, term128911.getClass(), "isChallengeTrack", false);
        setIntField(term128911, term128911.getClass(), "challengeLife", -210141931);
        setIntField(term128911, term128911.getClass(), "challengeRemain", 1459050716);
        setIntField(term128911, term128911.getClass(), "isAllPerfectPlus", -1995664477);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isAllPerfect", argTypes, term128911, args);
    }

};


