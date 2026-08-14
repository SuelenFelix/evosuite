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

public class UserPlaylog_equals_2046852727122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3996865;
     Object term3997177;

    public UserPlaylog_equals_2046852727122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3996871 = new Long(6190867656233459127L);
        term3996865 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term3996867 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term3996869 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term3996885 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3996886 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3996890 = newInstance(Class.forName("java.time.LocalTime"));
        Object term3996895 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3996896 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3996900 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term3996865, term3996865.getClass(), "id", 1566148194648163749L);
        setLongField(term3996867, term3996867.getClass(), "id", -2254523234468694533L);
        setLongField(term3996869, term3996869.getClass(), "id", -1183084811157500714L);
        setField(term3996869, term3996869.getClass(), "extId", term3996871);
        setField(term3996869, term3996869.getClass(), "luid", "QLXCwhokuo");
        setIntField(term3996886, term3996886.getClass(), "year", 2012);
        setShortField(term3996886, term3996886.getClass(), "month", (short) 10);
        setShortField(term3996886, term3996886.getClass(), "day", (short) 23);
        setField(term3996885, term3996885.getClass(), "date", term3996886);
        setByteField(term3996890, term3996890.getClass(), "hour", (byte) 15);
        setByteField(term3996890, term3996890.getClass(), "minute", (byte) 21);
        setByteField(term3996890, term3996890.getClass(), "second", (byte) 14);
        setIntField(term3996890, term3996890.getClass(), "nano", 325396614);
        setField(term3996885, term3996885.getClass(), "time", term3996890);
        setField(term3996869, term3996869.getClass(), "registerTime", term3996885);
        setIntField(term3996896, term3996896.getClass(), "year", 2011);
        setShortField(term3996896, term3996896.getClass(), "month", (short) 5);
        setShortField(term3996896, term3996896.getClass(), "day", (short) 8);
        setField(term3996895, term3996895.getClass(), "date", term3996896);
        setByteField(term3996900, term3996900.getClass(), "hour", (byte) 12);
        setByteField(term3996900, term3996900.getClass(), "minute", (byte) 4);
        setByteField(term3996900, term3996900.getClass(), "second", (byte) 0);
        setIntField(term3996900, term3996900.getClass(), "nano", 586862595);
        setField(term3996895, term3996895.getClass(), "time", term3996900);
        setField(term3996869, term3996869.getClass(), "accessTime", term3996895);
        setField(term3996867, term3996867.getClass(), "card", term3996869);
        setIntField(term3996867, term3996867.getClass(), "lastDataVersion", 404454862);
        setField(term3996867, term3996867.getClass(), "userName", "RiECUqkayY");
        setIntField(term3996867, term3996867.getClass(), "point", 1976588683);
        setIntField(term3996867, term3996867.getClass(), "totalPoint", -1134321395);
        setIntField(term3996867, term3996867.getClass(), "iconId", -2122147671);
        setIntField(term3996867, term3996867.getClass(), "nameplateId", -1907882283);
        setIntField(term3996867, term3996867.getClass(), "frameId", 1858627480);
        setIntField(term3996867, term3996867.getClass(), "trophyId", -1351921326);
        setIntField(term3996867, term3996867.getClass(), "playCount", -2126293584);
        setIntField(term3996867, term3996867.getClass(), "playVsCount", -440820051);
        setIntField(term3996867, term3996867.getClass(), "playSyncCount", 379838120);
        setIntField(term3996867, term3996867.getClass(), "winCount", -12298496);
        setIntField(term3996867, term3996867.getClass(), "helpCount", -408912632);
        setIntField(term3996867, term3996867.getClass(), "comboCount", -447665788);
        setIntField(term3996867, term3996867.getClass(), "feverCount", -726594061);
        setIntField(term3996867, term3996867.getClass(), "totalHiScore", 1419747873);
        setIntField(term3996867, term3996867.getClass(), "totalEasyHighScore", -1352909781);
        setIntField(term3996867, term3996867.getClass(), "totalBasicHighScore", -748222276);
        setIntField(term3996867, term3996867.getClass(), "totalAdvancedHighScore", 814934972);
        setIntField(term3996867, term3996867.getClass(), "totalExpertHighScore", 707550730);
        setIntField(term3996867, term3996867.getClass(), "totalMasterHighScore", -240143182);
        setIntField(term3996867, term3996867.getClass(), "totalReMasterHighScore", 1992480167);
        setIntField(term3996867, term3996867.getClass(), "totalHighSync", -231230778);
        setIntField(term3996867, term3996867.getClass(), "totalEasySync", -1191234625);
        setIntField(term3996867, term3996867.getClass(), "totalBasicSync", 1075321063);
        setIntField(term3996867, term3996867.getClass(), "totalAdvancedSync", 1259177106);
        setIntField(term3996867, term3996867.getClass(), "totalExpertSync", -1047043321);
        setIntField(term3996867, term3996867.getClass(), "totalMasterSync", -499069291);
        setIntField(term3996867, term3996867.getClass(), "totalReMasterSync", 1845525912);
        setIntField(term3996867, term3996867.getClass(), "playerRating", 940848132);
        setIntField(term3996867, term3996867.getClass(), "highestRating", 1057823131);
        setIntField(term3996867, term3996867.getClass(), "rankAuthTailId", 2133690137);
        setField(term3996867, term3996867.getClass(), "eventWatchedDate", "kqpXZRQKUs");
        setField(term3996867, term3996867.getClass(), "webLimitDate", "yxSwSPGOrk");
        setIntField(term3996867, term3996867.getClass(), "challengeTrackPhase", -1772718802);
        setIntField(term3996867, term3996867.getClass(), "firstPlayBits", -1009636281);
        setField(term3996867, term3996867.getClass(), "lastPlayDate", "ZgwopsLLnf");
        setIntField(term3996867, term3996867.getClass(), "lastPlaceId", 1389982715);
        setField(term3996867, term3996867.getClass(), "lastPlaceName", "jAgmRpfRcN");
        setIntField(term3996867, term3996867.getClass(), "lastRegionId", -324380624);
        setField(term3996867, term3996867.getClass(), "lastRegionName", "JyZANOCkEE");
        setField(term3996867, term3996867.getClass(), "lastClientId", "ZFiOOUTTTd");
        setField(term3996867, term3996867.getClass(), "lastCountryCode", "pLIPZeXFpl");
        setIntField(term3996867, term3996867.getClass(), "eventPoint", -1822111747);
        setIntField(term3996867, term3996867.getClass(), "totalLv", 1637667623);
        setIntField(term3996867, term3996867.getClass(), "lastLoginBonusDay", 277574254);
        setIntField(term3996867, term3996867.getClass(), "lastSurvivalBonusDay", 1968276095);
        setIntField(term3996867, term3996867.getClass(), "loginBonusLv", -651108900);
        setField(term3996865, term3996865.getClass(), "user", term3996867);
        setIntField(term3996865, term3996865.getClass(), "orderId", 87332857);
        setLongField(term3996865, term3996865.getClass(), "sortNumber", 2422252443041164855L);
        setIntField(term3996865, term3996865.getClass(), "placeId", -1796174402);
        setField(term3996865, term3996865.getClass(), "placeName", "lOSIjWDFoQ");
        setField(term3996865, term3996865.getClass(), "country", "OSwtixjAHF");
        setIntField(term3996865, term3996865.getClass(), "regionId", -1642364404);
        setField(term3996865, term3996865.getClass(), "playDate", "gMmZtaBlkL");
        setField(term3996865, term3996865.getClass(), "userPlayDate", "jFzmVqMwaw");
        setIntField(term3996865, term3996865.getClass(), "musicId", -1857245960);
        setIntField(term3996865, term3996865.getClass(), "level", -1691739169);
        setIntField(term3996865, term3996865.getClass(), "gameMode", 1107555375);
        setIntField(term3996865, term3996865.getClass(), "rivalNum", 1693399589);
        setIntField(term3996865, term3996865.getClass(), "track", -203931163);
        setIntField(term3996865, term3996865.getClass(), "eventId", 423041609);
        setBooleanField(term3996865, term3996865.getClass(), "isFreeToPlay", true);
        setIntField(term3996865, term3996865.getClass(), "playerRating", 1734353324);
        setLongField(term3996865, term3996865.getClass(), "playedUserId1", -3292747942008753494L);
        setField(term3996865, term3996865.getClass(), "playedUserName1", "dtViMqcSLs");
        setIntField(term3996865, term3996865.getClass(), "playedMusicLevel1", 1873705856);
        setLongField(term3996865, term3996865.getClass(), "playedUserId2", 5594823487833520599L);
        setField(term3996865, term3996865.getClass(), "playedUserName2", "TwLBAieEXu");
        setIntField(term3996865, term3996865.getClass(), "playedMusicLevel2", 1904948469);
        setLongField(term3996865, term3996865.getClass(), "playedUserId3", -4471735389282022454L);
        setField(term3996865, term3996865.getClass(), "playedUserName3", "HAPEZsUsZh");
        setIntField(term3996865, term3996865.getClass(), "playedMusicLevel3", -450964034);
        setIntField(term3996865, term3996865.getClass(), "achievement", -298498237);
        setIntField(term3996865, term3996865.getClass(), "score", -1677571933);
        setIntField(term3996865, term3996865.getClass(), "tapScore", 927965389);
        setIntField(term3996865, term3996865.getClass(), "holdScore", -1079898917);
        setIntField(term3996865, term3996865.getClass(), "slideScore", -386255405);
        setIntField(term3996865, term3996865.getClass(), "breakScore", -1770226554);
        setIntField(term3996865, term3996865.getClass(), "syncRate", -1703055820);
        setIntField(term3996865, term3996865.getClass(), "vsWin", -548488292);
        setBooleanField(term3996865, term3996865.getClass(), "isAllPerfect", true);
        setIntField(term3996865, term3996865.getClass(), "fullCombo", -936067068);
        setIntField(term3996865, term3996865.getClass(), "maxFever", 1088075638);
        setIntField(term3996865, term3996865.getClass(), "maxCombo", -564262610);
        setIntField(term3996865, term3996865.getClass(), "tapPerfect", -1531695910);
        setIntField(term3996865, term3996865.getClass(), "tapGreat", 2047985526);
        setIntField(term3996865, term3996865.getClass(), "tapGood", 93369915);
        setIntField(term3996865, term3996865.getClass(), "tapBad", -1651649719);
        setIntField(term3996865, term3996865.getClass(), "holdPerfect", 1124605972);
        setIntField(term3996865, term3996865.getClass(), "holdGreat", 1632921916);
        setIntField(term3996865, term3996865.getClass(), "holdGood", 1887336316);
        setIntField(term3996865, term3996865.getClass(), "holdBad", -1521359050);
        setIntField(term3996865, term3996865.getClass(), "slidePerfect", -707655823);
        setIntField(term3996865, term3996865.getClass(), "slideGreat", 212270475);
        setIntField(term3996865, term3996865.getClass(), "slideGood", -736570526);
        setIntField(term3996865, term3996865.getClass(), "slideBad", -1018297958);
        setIntField(term3996865, term3996865.getClass(), "breakPerfect", -503471611);
        setIntField(term3996865, term3996865.getClass(), "breakGreat", 282058414);
        setIntField(term3996865, term3996865.getClass(), "breakGood", -1651414660);
        setIntField(term3996865, term3996865.getClass(), "breakBad", -2140167386);
        setBooleanField(term3996865, term3996865.getClass(), "isTrackSkip", true);
        setBooleanField(term3996865, term3996865.getClass(), "isHighScore", false);
        setBooleanField(term3996865, term3996865.getClass(), "isChallengeTrack", true);
        setIntField(term3996865, term3996865.getClass(), "challengeLife", -284789165);
        setIntField(term3996865, term3996865.getClass(), "challengeRemain", -1174983875);
        setIntField(term3996865, term3996865.getClass(), "isAllPerfectPlus", -1678440222);
        term3997177 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term3997177;
        callMethod(klass, "equals", argTypes, term3996865, args);
    }

};


