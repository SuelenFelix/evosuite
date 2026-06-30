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

public class UserPlaylog_setSyncRate_16112840294 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term157227;
     Object term157539;

    public UserPlaylog_setSyncRate_16112840294() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term157233 = new Long(-9168517519350392654L);
        term157227 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term157229 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term157231 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term157247 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term157248 = newInstance(Class.forName("java.time.LocalDate"));
        Object term157252 = newInstance(Class.forName("java.time.LocalTime"));
        Object term157257 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term157258 = newInstance(Class.forName("java.time.LocalDate"));
        Object term157262 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term157227, term157227.getClass(), "id", 4601901314293570056L);
        setLongField(term157229, term157229.getClass(), "id", 3811147117668167855L);
        setLongField(term157231, term157231.getClass(), "id", -5397349204553241395L);
        setField(term157231, term157231.getClass(), "extId", term157233);
        setField(term157231, term157231.getClass(), "luid", "USOHXZaoed");
        setIntField(term157248, term157248.getClass(), "year", 2012);
        setShortField(term157248, term157248.getClass(), "month", (short) 10);
        setShortField(term157248, term157248.getClass(), "day", (short) 1);
        setField(term157247, term157247.getClass(), "date", term157248);
        setByteField(term157252, term157252.getClass(), "hour", (byte) 19);
        setByteField(term157252, term157252.getClass(), "minute", (byte) 43);
        setByteField(term157252, term157252.getClass(), "second", (byte) 49);
        setIntField(term157252, term157252.getClass(), "nano", 81513180);
        setField(term157247, term157247.getClass(), "time", term157252);
        setField(term157231, term157231.getClass(), "registerTime", term157247);
        setIntField(term157258, term157258.getClass(), "year", 2028);
        setShortField(term157258, term157258.getClass(), "month", (short) 2);
        setShortField(term157258, term157258.getClass(), "day", (short) 2);
        setField(term157257, term157257.getClass(), "date", term157258);
        setByteField(term157262, term157262.getClass(), "hour", (byte) 17);
        setByteField(term157262, term157262.getClass(), "minute", (byte) 55);
        setByteField(term157262, term157262.getClass(), "second", (byte) 40);
        setIntField(term157262, term157262.getClass(), "nano", 907692691);
        setField(term157257, term157257.getClass(), "time", term157262);
        setField(term157231, term157231.getClass(), "accessTime", term157257);
        setField(term157229, term157229.getClass(), "card", term157231);
        setIntField(term157229, term157229.getClass(), "lastDataVersion", -1800270634);
        setField(term157229, term157229.getClass(), "userName", "sIAuMXSPLw");
        setIntField(term157229, term157229.getClass(), "point", 2063284492);
        setIntField(term157229, term157229.getClass(), "totalPoint", -544984538);
        setIntField(term157229, term157229.getClass(), "iconId", -1377446937);
        setIntField(term157229, term157229.getClass(), "nameplateId", -1242189550);
        setIntField(term157229, term157229.getClass(), "frameId", -1245175992);
        setIntField(term157229, term157229.getClass(), "trophyId", -1285624829);
        setIntField(term157229, term157229.getClass(), "playCount", -575933303);
        setIntField(term157229, term157229.getClass(), "playVsCount", 220842489);
        setIntField(term157229, term157229.getClass(), "playSyncCount", 509983681);
        setIntField(term157229, term157229.getClass(), "winCount", 949160032);
        setIntField(term157229, term157229.getClass(), "helpCount", -663146155);
        setIntField(term157229, term157229.getClass(), "comboCount", -756879395);
        setIntField(term157229, term157229.getClass(), "feverCount", 1085421816);
        setIntField(term157229, term157229.getClass(), "totalHiScore", 1255911049);
        setIntField(term157229, term157229.getClass(), "totalEasyHighScore", -839027611);
        setIntField(term157229, term157229.getClass(), "totalBasicHighScore", -1124162495);
        setIntField(term157229, term157229.getClass(), "totalAdvancedHighScore", 1340944720);
        setIntField(term157229, term157229.getClass(), "totalExpertHighScore", -909139484);
        setIntField(term157229, term157229.getClass(), "totalMasterHighScore", -1976139427);
        setIntField(term157229, term157229.getClass(), "totalReMasterHighScore", 303991487);
        setIntField(term157229, term157229.getClass(), "totalHighSync", 1367064616);
        setIntField(term157229, term157229.getClass(), "totalEasySync", 203718519);
        setIntField(term157229, term157229.getClass(), "totalBasicSync", 537247387);
        setIntField(term157229, term157229.getClass(), "totalAdvancedSync", 1914948652);
        setIntField(term157229, term157229.getClass(), "totalExpertSync", -239857621);
        setIntField(term157229, term157229.getClass(), "totalMasterSync", 1772736429);
        setIntField(term157229, term157229.getClass(), "totalReMasterSync", -1816339027);
        setIntField(term157229, term157229.getClass(), "playerRating", -1235548167);
        setIntField(term157229, term157229.getClass(), "highestRating", -1314719002);
        setIntField(term157229, term157229.getClass(), "rankAuthTailId", -1170411431);
        setField(term157229, term157229.getClass(), "eventWatchedDate", "BHUMLKEWjf");
        setField(term157229, term157229.getClass(), "webLimitDate", "bCRIEMBwda");
        setIntField(term157229, term157229.getClass(), "challengeTrackPhase", 1088952067);
        setIntField(term157229, term157229.getClass(), "firstPlayBits", 472610780);
        setField(term157229, term157229.getClass(), "lastPlayDate", "rJpPoVDPxO");
        setIntField(term157229, term157229.getClass(), "lastPlaceId", -2133619302);
        setField(term157229, term157229.getClass(), "lastPlaceName", "wAzHMzePqz");
        setIntField(term157229, term157229.getClass(), "lastRegionId", 1552095995);
        setField(term157229, term157229.getClass(), "lastRegionName", "apDIHttQkF");
        setField(term157229, term157229.getClass(), "lastClientId", "JnkpKxjKwX");
        setField(term157229, term157229.getClass(), "lastCountryCode", "QmmFUcQTWe");
        setIntField(term157229, term157229.getClass(), "eventPoint", -1747718939);
        setIntField(term157229, term157229.getClass(), "totalLv", 1965173166);
        setIntField(term157229, term157229.getClass(), "lastLoginBonusDay", 1581877075);
        setIntField(term157229, term157229.getClass(), "lastSurvivalBonusDay", 1615268673);
        setIntField(term157229, term157229.getClass(), "loginBonusLv", 1152887206);
        setField(term157227, term157227.getClass(), "user", term157229);
        setIntField(term157227, term157227.getClass(), "orderId", 1901884310);
        setLongField(term157227, term157227.getClass(), "sortNumber", -5533270660427460254L);
        setIntField(term157227, term157227.getClass(), "placeId", -178445255);
        setField(term157227, term157227.getClass(), "placeName", "SrhlGLISlG");
        setField(term157227, term157227.getClass(), "country", "UPhCxQiSer");
        setIntField(term157227, term157227.getClass(), "regionId", 304875983);
        setField(term157227, term157227.getClass(), "playDate", "jHjQEFLfrD");
        setField(term157227, term157227.getClass(), "userPlayDate", "jDgLTvGduh");
        setIntField(term157227, term157227.getClass(), "musicId", 1800211738);
        setIntField(term157227, term157227.getClass(), "level", -1008531865);
        setIntField(term157227, term157227.getClass(), "gameMode", -1757951451);
        setIntField(term157227, term157227.getClass(), "rivalNum", -1455399102);
        setIntField(term157227, term157227.getClass(), "track", -1590633148);
        setIntField(term157227, term157227.getClass(), "eventId", -38190522);
        setBooleanField(term157227, term157227.getClass(), "isFreeToPlay", true);
        setIntField(term157227, term157227.getClass(), "playerRating", -2053739914);
        setLongField(term157227, term157227.getClass(), "playedUserId1", 6870806673850570339L);
        setField(term157227, term157227.getClass(), "playedUserName1", "HfgMTpkgaK");
        setIntField(term157227, term157227.getClass(), "playedMusicLevel1", -954895502);
        setLongField(term157227, term157227.getClass(), "playedUserId2", -2212129370801839337L);
        setField(term157227, term157227.getClass(), "playedUserName2", "QUAzjGTSxv");
        setIntField(term157227, term157227.getClass(), "playedMusicLevel2", -286306732);
        setLongField(term157227, term157227.getClass(), "playedUserId3", 5474646196659258873L);
        setField(term157227, term157227.getClass(), "playedUserName3", "cIWnHZgAhI");
        setIntField(term157227, term157227.getClass(), "playedMusicLevel3", -1837452912);
        setIntField(term157227, term157227.getClass(), "achievement", 1752149285);
        setIntField(term157227, term157227.getClass(), "score", -391897865);
        setIntField(term157227, term157227.getClass(), "tapScore", -967150129);
        setIntField(term157227, term157227.getClass(), "holdScore", -1298477574);
        setIntField(term157227, term157227.getClass(), "slideScore", 2070493463);
        setIntField(term157227, term157227.getClass(), "breakScore", -1515723538);
        setIntField(term157227, term157227.getClass(), "syncRate", 1811430671);
        setIntField(term157227, term157227.getClass(), "vsWin", 301560824);
        setBooleanField(term157227, term157227.getClass(), "isAllPerfect", false);
        setIntField(term157227, term157227.getClass(), "fullCombo", -1830244942);
        setIntField(term157227, term157227.getClass(), "maxFever", -2054929667);
        setIntField(term157227, term157227.getClass(), "maxCombo", 1547208430);
        setIntField(term157227, term157227.getClass(), "tapPerfect", 2143332451);
        setIntField(term157227, term157227.getClass(), "tapGreat", 1883382194);
        setIntField(term157227, term157227.getClass(), "tapGood", 1618154899);
        setIntField(term157227, term157227.getClass(), "tapBad", 1123777726);
        setIntField(term157227, term157227.getClass(), "holdPerfect", 2091291733);
        setIntField(term157227, term157227.getClass(), "holdGreat", -229688515);
        setIntField(term157227, term157227.getClass(), "holdGood", 1508629108);
        setIntField(term157227, term157227.getClass(), "holdBad", -402966917);
        setIntField(term157227, term157227.getClass(), "slidePerfect", -117908649);
        setIntField(term157227, term157227.getClass(), "slideGreat", -791202508);
        setIntField(term157227, term157227.getClass(), "slideGood", -500733068);
        setIntField(term157227, term157227.getClass(), "slideBad", 741028419);
        setIntField(term157227, term157227.getClass(), "breakPerfect", -1299927106);
        setIntField(term157227, term157227.getClass(), "breakGreat", -1629395509);
        setIntField(term157227, term157227.getClass(), "breakGood", 1083982722);
        setIntField(term157227, term157227.getClass(), "breakBad", -1101836538);
        setBooleanField(term157227, term157227.getClass(), "isTrackSkip", true);
        setBooleanField(term157227, term157227.getClass(), "isHighScore", false);
        setBooleanField(term157227, term157227.getClass(), "isChallengeTrack", false);
        setIntField(term157227, term157227.getClass(), "challengeLife", -1916712623);
        setIntField(term157227, term157227.getClass(), "challengeRemain", 2140215899);
        setIntField(term157227, term157227.getClass(), "isAllPerfectPlus", -1668575256);
        term157539 = new Integer(1599291001);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term157539;
        callMethod(klass, "setSyncRate", argTypes, term157227, args);
    }

};


