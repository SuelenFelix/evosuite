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

public class UserPlaylog_getPlayedMusicLevel1_138107244420 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term121831;

    public UserPlaylog_getPlayedMusicLevel1_138107244420() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term121837 = new Long(1442167273909860961L);
        term121831 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term121833 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term121835 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term121851 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term121852 = newInstance(Class.forName("java.time.LocalDate"));
        Object term121856 = newInstance(Class.forName("java.time.LocalTime"));
        Object term121861 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term121862 = newInstance(Class.forName("java.time.LocalDate"));
        Object term121866 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term121831, term121831.getClass(), "id", -8165230786269861125L);
        setLongField(term121833, term121833.getClass(), "id", 7818214521807331044L);
        setLongField(term121835, term121835.getClass(), "id", 7027549200302660557L);
        setField(term121835, term121835.getClass(), "extId", term121837);
        setField(term121835, term121835.getClass(), "luid", "YeemjiDgab");
        setIntField(term121852, term121852.getClass(), "year", 2010);
        setShortField(term121852, term121852.getClass(), "month", (short) 7);
        setShortField(term121852, term121852.getClass(), "day", (short) 21);
        setField(term121851, term121851.getClass(), "date", term121852);
        setByteField(term121856, term121856.getClass(), "hour", (byte) 12);
        setByteField(term121856, term121856.getClass(), "minute", (byte) 18);
        setByteField(term121856, term121856.getClass(), "second", (byte) 51);
        setIntField(term121856, term121856.getClass(), "nano", 209901550);
        setField(term121851, term121851.getClass(), "time", term121856);
        setField(term121835, term121835.getClass(), "registerTime", term121851);
        setIntField(term121862, term121862.getClass(), "year", 2028);
        setShortField(term121862, term121862.getClass(), "month", (short) 7);
        setShortField(term121862, term121862.getClass(), "day", (short) 2);
        setField(term121861, term121861.getClass(), "date", term121862);
        setByteField(term121866, term121866.getClass(), "hour", (byte) 23);
        setByteField(term121866, term121866.getClass(), "minute", (byte) 41);
        setByteField(term121866, term121866.getClass(), "second", (byte) 2);
        setIntField(term121866, term121866.getClass(), "nano", 187705257);
        setField(term121861, term121861.getClass(), "time", term121866);
        setField(term121835, term121835.getClass(), "accessTime", term121861);
        setField(term121833, term121833.getClass(), "card", term121835);
        setIntField(term121833, term121833.getClass(), "lastDataVersion", 72566816);
        setField(term121833, term121833.getClass(), "userName", "tihFwBkjdt");
        setIntField(term121833, term121833.getClass(), "point", -188533678);
        setIntField(term121833, term121833.getClass(), "totalPoint", 145353220);
        setIntField(term121833, term121833.getClass(), "iconId", 743278024);
        setIntField(term121833, term121833.getClass(), "nameplateId", 1804144939);
        setIntField(term121833, term121833.getClass(), "frameId", 647434101);
        setIntField(term121833, term121833.getClass(), "trophyId", -1053102933);
        setIntField(term121833, term121833.getClass(), "playCount", -1147306541);
        setIntField(term121833, term121833.getClass(), "playVsCount", -709169906);
        setIntField(term121833, term121833.getClass(), "playSyncCount", -1521964012);
        setIntField(term121833, term121833.getClass(), "winCount", 1670532643);
        setIntField(term121833, term121833.getClass(), "helpCount", 1132888529);
        setIntField(term121833, term121833.getClass(), "comboCount", -749019689);
        setIntField(term121833, term121833.getClass(), "feverCount", 10308038);
        setIntField(term121833, term121833.getClass(), "totalHiScore", 1806892057);
        setIntField(term121833, term121833.getClass(), "totalEasyHighScore", 753991973);
        setIntField(term121833, term121833.getClass(), "totalBasicHighScore", -1799585006);
        setIntField(term121833, term121833.getClass(), "totalAdvancedHighScore", -570035943);
        setIntField(term121833, term121833.getClass(), "totalExpertHighScore", 1887980610);
        setIntField(term121833, term121833.getClass(), "totalMasterHighScore", -856907689);
        setIntField(term121833, term121833.getClass(), "totalReMasterHighScore", -1114722762);
        setIntField(term121833, term121833.getClass(), "totalHighSync", -1313611523);
        setIntField(term121833, term121833.getClass(), "totalEasySync", -602904585);
        setIntField(term121833, term121833.getClass(), "totalBasicSync", 1876360979);
        setIntField(term121833, term121833.getClass(), "totalAdvancedSync", -34256286);
        setIntField(term121833, term121833.getClass(), "totalExpertSync", -423891359);
        setIntField(term121833, term121833.getClass(), "totalMasterSync", 763976967);
        setIntField(term121833, term121833.getClass(), "totalReMasterSync", 1595562615);
        setIntField(term121833, term121833.getClass(), "playerRating", 1496157000);
        setIntField(term121833, term121833.getClass(), "highestRating", 1444788766);
        setIntField(term121833, term121833.getClass(), "rankAuthTailId", -2011306040);
        setField(term121833, term121833.getClass(), "eventWatchedDate", "llYGfgCigY");
        setField(term121833, term121833.getClass(), "webLimitDate", "WToYKUjMGj");
        setIntField(term121833, term121833.getClass(), "challengeTrackPhase", -2135060594);
        setIntField(term121833, term121833.getClass(), "firstPlayBits", 1104254825);
        setField(term121833, term121833.getClass(), "lastPlayDate", "wbtDRRVkMv");
        setIntField(term121833, term121833.getClass(), "lastPlaceId", 443408660);
        setField(term121833, term121833.getClass(), "lastPlaceName", "abzzbYwTRo");
        setIntField(term121833, term121833.getClass(), "lastRegionId", 1389120111);
        setField(term121833, term121833.getClass(), "lastRegionName", "HxIZqtNMYu");
        setField(term121833, term121833.getClass(), "lastClientId", "NVlTBmmeHa");
        setField(term121833, term121833.getClass(), "lastCountryCode", "QZomwNJvGF");
        setIntField(term121833, term121833.getClass(), "eventPoint", 731070998);
        setIntField(term121833, term121833.getClass(), "totalLv", 57680258);
        setIntField(term121833, term121833.getClass(), "lastLoginBonusDay", -936342894);
        setIntField(term121833, term121833.getClass(), "lastSurvivalBonusDay", -1894595167);
        setIntField(term121833, term121833.getClass(), "loginBonusLv", -2089931895);
        setField(term121831, term121831.getClass(), "user", term121833);
        setIntField(term121831, term121831.getClass(), "orderId", 1400874310);
        setLongField(term121831, term121831.getClass(), "sortNumber", -4623233001658453008L);
        setIntField(term121831, term121831.getClass(), "placeId", -1142687493);
        setField(term121831, term121831.getClass(), "placeName", "qfHzTgyYaj");
        setField(term121831, term121831.getClass(), "country", "BzOSSnQpxM");
        setIntField(term121831, term121831.getClass(), "regionId", 546473545);
        setField(term121831, term121831.getClass(), "playDate", "LoFkuWLahf");
        setField(term121831, term121831.getClass(), "userPlayDate", "GwcCGdSyQT");
        setIntField(term121831, term121831.getClass(), "musicId", 1922881115);
        setIntField(term121831, term121831.getClass(), "level", 1341930316);
        setIntField(term121831, term121831.getClass(), "gameMode", 1284571301);
        setIntField(term121831, term121831.getClass(), "rivalNum", 1905466539);
        setIntField(term121831, term121831.getClass(), "track", -246462081);
        setIntField(term121831, term121831.getClass(), "eventId", -746964918);
        setBooleanField(term121831, term121831.getClass(), "isFreeToPlay", true);
        setIntField(term121831, term121831.getClass(), "playerRating", 783386884);
        setLongField(term121831, term121831.getClass(), "playedUserId1", -2816485221625714088L);
        setField(term121831, term121831.getClass(), "playedUserName1", "pQLjQOCQOz");
        setIntField(term121831, term121831.getClass(), "playedMusicLevel1", -329396039);
        setLongField(term121831, term121831.getClass(), "playedUserId2", 2920715047797197542L);
        setField(term121831, term121831.getClass(), "playedUserName2", "RaVKdrEtNk");
        setIntField(term121831, term121831.getClass(), "playedMusicLevel2", 1420650543);
        setLongField(term121831, term121831.getClass(), "playedUserId3", -7084245215702303910L);
        setField(term121831, term121831.getClass(), "playedUserName3", "pLrycUApoJ");
        setIntField(term121831, term121831.getClass(), "playedMusicLevel3", 2087127939);
        setIntField(term121831, term121831.getClass(), "achievement", 2107341831);
        setIntField(term121831, term121831.getClass(), "score", 2030659493);
        setIntField(term121831, term121831.getClass(), "tapScore", 1854736876);
        setIntField(term121831, term121831.getClass(), "holdScore", 1658130558);
        setIntField(term121831, term121831.getClass(), "slideScore", -1415526463);
        setIntField(term121831, term121831.getClass(), "breakScore", 935603895);
        setIntField(term121831, term121831.getClass(), "syncRate", 941821636);
        setIntField(term121831, term121831.getClass(), "vsWin", -2067380232);
        setBooleanField(term121831, term121831.getClass(), "isAllPerfect", false);
        setIntField(term121831, term121831.getClass(), "fullCombo", -654617012);
        setIntField(term121831, term121831.getClass(), "maxFever", -1036820640);
        setIntField(term121831, term121831.getClass(), "maxCombo", -168102957);
        setIntField(term121831, term121831.getClass(), "tapPerfect", -407557094);
        setIntField(term121831, term121831.getClass(), "tapGreat", -1046077462);
        setIntField(term121831, term121831.getClass(), "tapGood", 1750872206);
        setIntField(term121831, term121831.getClass(), "tapBad", 1580510219);
        setIntField(term121831, term121831.getClass(), "holdPerfect", 1046090734);
        setIntField(term121831, term121831.getClass(), "holdGreat", -256722068);
        setIntField(term121831, term121831.getClass(), "holdGood", -1073993407);
        setIntField(term121831, term121831.getClass(), "holdBad", 1942012215);
        setIntField(term121831, term121831.getClass(), "slidePerfect", 782162447);
        setIntField(term121831, term121831.getClass(), "slideGreat", 918360278);
        setIntField(term121831, term121831.getClass(), "slideGood", -310671267);
        setIntField(term121831, term121831.getClass(), "slideBad", -296812228);
        setIntField(term121831, term121831.getClass(), "breakPerfect", -1264993632);
        setIntField(term121831, term121831.getClass(), "breakGreat", 1729434179);
        setIntField(term121831, term121831.getClass(), "breakGood", -721562174);
        setIntField(term121831, term121831.getClass(), "breakBad", 388250530);
        setBooleanField(term121831, term121831.getClass(), "isTrackSkip", false);
        setBooleanField(term121831, term121831.getClass(), "isHighScore", true);
        setBooleanField(term121831, term121831.getClass(), "isChallengeTrack", false);
        setIntField(term121831, term121831.getClass(), "challengeLife", 1602460798);
        setIntField(term121831, term121831.getClass(), "challengeRemain", 642817798);
        setIntField(term121831, term121831.getClass(), "isAllPerfectPlus", -1111363431);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayedMusicLevel1", argTypes, term121831, args);
    }

};


