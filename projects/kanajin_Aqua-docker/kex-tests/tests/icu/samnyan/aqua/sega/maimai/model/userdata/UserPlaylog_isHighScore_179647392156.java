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

public class UserPlaylog_isHighScore_179647392156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term138823;

    public UserPlaylog_isHighScore_179647392156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term138829 = new Long(-3231440836116263235L);
        term138823 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term138825 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term138827 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term138843 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term138844 = newInstance(Class.forName("java.time.LocalDate"));
        Object term138848 = newInstance(Class.forName("java.time.LocalTime"));
        Object term138853 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term138854 = newInstance(Class.forName("java.time.LocalDate"));
        Object term138858 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term138823, term138823.getClass(), "id", 7505187196596103566L);
        setLongField(term138825, term138825.getClass(), "id", 3827525335107462030L);
        setLongField(term138827, term138827.getClass(), "id", -6895327543559831172L);
        setField(term138827, term138827.getClass(), "extId", term138829);
        setField(term138827, term138827.getClass(), "luid", "porFPgKTrM");
        setIntField(term138844, term138844.getClass(), "year", 2019);
        setShortField(term138844, term138844.getClass(), "month", (short) 10);
        setShortField(term138844, term138844.getClass(), "day", (short) 25);
        setField(term138843, term138843.getClass(), "date", term138844);
        setByteField(term138848, term138848.getClass(), "hour", (byte) 18);
        setByteField(term138848, term138848.getClass(), "minute", (byte) 58);
        setByteField(term138848, term138848.getClass(), "second", (byte) 55);
        setIntField(term138848, term138848.getClass(), "nano", 407840282);
        setField(term138843, term138843.getClass(), "time", term138848);
        setField(term138827, term138827.getClass(), "registerTime", term138843);
        setIntField(term138854, term138854.getClass(), "year", 2012);
        setShortField(term138854, term138854.getClass(), "month", (short) 4);
        setShortField(term138854, term138854.getClass(), "day", (short) 23);
        setField(term138853, term138853.getClass(), "date", term138854);
        setByteField(term138858, term138858.getClass(), "hour", (byte) 8);
        setByteField(term138858, term138858.getClass(), "minute", (byte) 11);
        setByteField(term138858, term138858.getClass(), "second", (byte) 45);
        setIntField(term138858, term138858.getClass(), "nano", 286907697);
        setField(term138853, term138853.getClass(), "time", term138858);
        setField(term138827, term138827.getClass(), "accessTime", term138853);
        setField(term138825, term138825.getClass(), "card", term138827);
        setIntField(term138825, term138825.getClass(), "lastDataVersion", 903114651);
        setField(term138825, term138825.getClass(), "userName", "PvoRpvEjZQ");
        setIntField(term138825, term138825.getClass(), "point", 1807849375);
        setIntField(term138825, term138825.getClass(), "totalPoint", -1351798207);
        setIntField(term138825, term138825.getClass(), "iconId", -1513274036);
        setIntField(term138825, term138825.getClass(), "nameplateId", 170457224);
        setIntField(term138825, term138825.getClass(), "frameId", 1244570715);
        setIntField(term138825, term138825.getClass(), "trophyId", 1245160016);
        setIntField(term138825, term138825.getClass(), "playCount", -1341238679);
        setIntField(term138825, term138825.getClass(), "playVsCount", -394071927);
        setIntField(term138825, term138825.getClass(), "playSyncCount", 1012504918);
        setIntField(term138825, term138825.getClass(), "winCount", -634378894);
        setIntField(term138825, term138825.getClass(), "helpCount", -397378983);
        setIntField(term138825, term138825.getClass(), "comboCount", -185010370);
        setIntField(term138825, term138825.getClass(), "feverCount", 1035137757);
        setIntField(term138825, term138825.getClass(), "totalHiScore", 15591111);
        setIntField(term138825, term138825.getClass(), "totalEasyHighScore", 1809785379);
        setIntField(term138825, term138825.getClass(), "totalBasicHighScore", 1798994684);
        setIntField(term138825, term138825.getClass(), "totalAdvancedHighScore", 1508037823);
        setIntField(term138825, term138825.getClass(), "totalExpertHighScore", 1669333785);
        setIntField(term138825, term138825.getClass(), "totalMasterHighScore", 1656529757);
        setIntField(term138825, term138825.getClass(), "totalReMasterHighScore", 1125229827);
        setIntField(term138825, term138825.getClass(), "totalHighSync", 1245795448);
        setIntField(term138825, term138825.getClass(), "totalEasySync", 1517384238);
        setIntField(term138825, term138825.getClass(), "totalBasicSync", 1717443823);
        setIntField(term138825, term138825.getClass(), "totalAdvancedSync", 412833014);
        setIntField(term138825, term138825.getClass(), "totalExpertSync", 143049105);
        setIntField(term138825, term138825.getClass(), "totalMasterSync", 1007792478);
        setIntField(term138825, term138825.getClass(), "totalReMasterSync", 72158236);
        setIntField(term138825, term138825.getClass(), "playerRating", -2109808761);
        setIntField(term138825, term138825.getClass(), "highestRating", -460484538);
        setIntField(term138825, term138825.getClass(), "rankAuthTailId", 1610941284);
        setField(term138825, term138825.getClass(), "eventWatchedDate", "usnNnhdlFi");
        setField(term138825, term138825.getClass(), "webLimitDate", "QXQboaRWMP");
        setIntField(term138825, term138825.getClass(), "challengeTrackPhase", -1956974141);
        setIntField(term138825, term138825.getClass(), "firstPlayBits", 685147249);
        setField(term138825, term138825.getClass(), "lastPlayDate", "eykOlhRHsN");
        setIntField(term138825, term138825.getClass(), "lastPlaceId", 2088094312);
        setField(term138825, term138825.getClass(), "lastPlaceName", "LZatFkMSRt");
        setIntField(term138825, term138825.getClass(), "lastRegionId", 1744329080);
        setField(term138825, term138825.getClass(), "lastRegionName", "fKGSaWAVQr");
        setField(term138825, term138825.getClass(), "lastClientId", "fBbPBwYFmd");
        setField(term138825, term138825.getClass(), "lastCountryCode", "BRqjZHWrDB");
        setIntField(term138825, term138825.getClass(), "eventPoint", -636254239);
        setIntField(term138825, term138825.getClass(), "totalLv", 404017067);
        setIntField(term138825, term138825.getClass(), "lastLoginBonusDay", -1055643003);
        setIntField(term138825, term138825.getClass(), "lastSurvivalBonusDay", 847395228);
        setIntField(term138825, term138825.getClass(), "loginBonusLv", 81677145);
        setField(term138823, term138823.getClass(), "user", term138825);
        setIntField(term138823, term138823.getClass(), "orderId", -1790813734);
        setLongField(term138823, term138823.getClass(), "sortNumber", 475216242691154379L);
        setIntField(term138823, term138823.getClass(), "placeId", -493533883);
        setField(term138823, term138823.getClass(), "placeName", "jOEgAmeXaq");
        setField(term138823, term138823.getClass(), "country", "EArfIBFidz");
        setIntField(term138823, term138823.getClass(), "regionId", 335230518);
        setField(term138823, term138823.getClass(), "playDate", "lIKlxUmvSr");
        setField(term138823, term138823.getClass(), "userPlayDate", "maygNVZYRz");
        setIntField(term138823, term138823.getClass(), "musicId", -1710727689);
        setIntField(term138823, term138823.getClass(), "level", -869098490);
        setIntField(term138823, term138823.getClass(), "gameMode", 752837910);
        setIntField(term138823, term138823.getClass(), "rivalNum", 1252903646);
        setIntField(term138823, term138823.getClass(), "track", -2047081294);
        setIntField(term138823, term138823.getClass(), "eventId", 889571984);
        setBooleanField(term138823, term138823.getClass(), "isFreeToPlay", true);
        setIntField(term138823, term138823.getClass(), "playerRating", -154928117);
        setLongField(term138823, term138823.getClass(), "playedUserId1", 7397884986768994824L);
        setField(term138823, term138823.getClass(), "playedUserName1", "DSgAYHcbQe");
        setIntField(term138823, term138823.getClass(), "playedMusicLevel1", -110710151);
        setLongField(term138823, term138823.getClass(), "playedUserId2", -4644072102027655025L);
        setField(term138823, term138823.getClass(), "playedUserName2", "zEXmuuorCI");
        setIntField(term138823, term138823.getClass(), "playedMusicLevel2", 578504241);
        setLongField(term138823, term138823.getClass(), "playedUserId3", 2739809214146796829L);
        setField(term138823, term138823.getClass(), "playedUserName3", "NEjergWRnM");
        setIntField(term138823, term138823.getClass(), "playedMusicLevel3", 1413016419);
        setIntField(term138823, term138823.getClass(), "achievement", 1824247809);
        setIntField(term138823, term138823.getClass(), "score", 1919683206);
        setIntField(term138823, term138823.getClass(), "tapScore", -1794675312);
        setIntField(term138823, term138823.getClass(), "holdScore", 1894030186);
        setIntField(term138823, term138823.getClass(), "slideScore", 771179779);
        setIntField(term138823, term138823.getClass(), "breakScore", 108189623);
        setIntField(term138823, term138823.getClass(), "syncRate", 318207331);
        setIntField(term138823, term138823.getClass(), "vsWin", -702662847);
        setBooleanField(term138823, term138823.getClass(), "isAllPerfect", false);
        setIntField(term138823, term138823.getClass(), "fullCombo", 188639727);
        setIntField(term138823, term138823.getClass(), "maxFever", 1955577795);
        setIntField(term138823, term138823.getClass(), "maxCombo", -111436038);
        setIntField(term138823, term138823.getClass(), "tapPerfect", -478782674);
        setIntField(term138823, term138823.getClass(), "tapGreat", 1085451097);
        setIntField(term138823, term138823.getClass(), "tapGood", 714673274);
        setIntField(term138823, term138823.getClass(), "tapBad", 1944893926);
        setIntField(term138823, term138823.getClass(), "holdPerfect", -2134184366);
        setIntField(term138823, term138823.getClass(), "holdGreat", -398569298);
        setIntField(term138823, term138823.getClass(), "holdGood", -1103279079);
        setIntField(term138823, term138823.getClass(), "holdBad", 86630332);
        setIntField(term138823, term138823.getClass(), "slidePerfect", -632148709);
        setIntField(term138823, term138823.getClass(), "slideGreat", 815540124);
        setIntField(term138823, term138823.getClass(), "slideGood", -143449377);
        setIntField(term138823, term138823.getClass(), "slideBad", -89151464);
        setIntField(term138823, term138823.getClass(), "breakPerfect", -1373149444);
        setIntField(term138823, term138823.getClass(), "breakGreat", -828112463);
        setIntField(term138823, term138823.getClass(), "breakGood", -769908256);
        setIntField(term138823, term138823.getClass(), "breakBad", 1342183652);
        setBooleanField(term138823, term138823.getClass(), "isTrackSkip", false);
        setBooleanField(term138823, term138823.getClass(), "isHighScore", true);
        setBooleanField(term138823, term138823.getClass(), "isChallengeTrack", true);
        setIntField(term138823, term138823.getClass(), "challengeLife", -201759904);
        setIntField(term138823, term138823.getClass(), "challengeRemain", -1171331006);
        setIntField(term138823, term138823.getClass(), "isAllPerfectPlus", 2147333912);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isHighScore", argTypes, term138823, args);
    }

};


