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

public class UserPlaylog_setScore_209179183989 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term154857;
     Object term155169;

    public UserPlaylog_setScore_209179183989() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term154863 = new Long(-4693900822622913579L);
        term154857 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term154859 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term154861 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term154877 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term154878 = newInstance(Class.forName("java.time.LocalDate"));
        Object term154882 = newInstance(Class.forName("java.time.LocalTime"));
        Object term154887 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term154888 = newInstance(Class.forName("java.time.LocalDate"));
        Object term154892 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term154857, term154857.getClass(), "id", -1765527138913795029L);
        setLongField(term154859, term154859.getClass(), "id", -1702769190313660197L);
        setLongField(term154861, term154861.getClass(), "id", 4850987747626140720L);
        setField(term154861, term154861.getClass(), "extId", term154863);
        setField(term154861, term154861.getClass(), "luid", "XgtGzhZjwe");
        setIntField(term154878, term154878.getClass(), "year", 2023);
        setShortField(term154878, term154878.getClass(), "month", (short) 3);
        setShortField(term154878, term154878.getClass(), "day", (short) 15);
        setField(term154877, term154877.getClass(), "date", term154878);
        setByteField(term154882, term154882.getClass(), "hour", (byte) 9);
        setByteField(term154882, term154882.getClass(), "minute", (byte) 10);
        setByteField(term154882, term154882.getClass(), "second", (byte) 38);
        setIntField(term154882, term154882.getClass(), "nano", 695302180);
        setField(term154877, term154877.getClass(), "time", term154882);
        setField(term154861, term154861.getClass(), "registerTime", term154877);
        setIntField(term154888, term154888.getClass(), "year", 2019);
        setShortField(term154888, term154888.getClass(), "month", (short) 12);
        setShortField(term154888, term154888.getClass(), "day", (short) 29);
        setField(term154887, term154887.getClass(), "date", term154888);
        setByteField(term154892, term154892.getClass(), "hour", (byte) 19);
        setByteField(term154892, term154892.getClass(), "minute", (byte) 43);
        setByteField(term154892, term154892.getClass(), "second", (byte) 47);
        setIntField(term154892, term154892.getClass(), "nano", 957440346);
        setField(term154887, term154887.getClass(), "time", term154892);
        setField(term154861, term154861.getClass(), "accessTime", term154887);
        setField(term154859, term154859.getClass(), "card", term154861);
        setIntField(term154859, term154859.getClass(), "lastDataVersion", -848898997);
        setField(term154859, term154859.getClass(), "userName", "kuzULljuRL");
        setIntField(term154859, term154859.getClass(), "point", 792668171);
        setIntField(term154859, term154859.getClass(), "totalPoint", -1538372393);
        setIntField(term154859, term154859.getClass(), "iconId", 63080824);
        setIntField(term154859, term154859.getClass(), "nameplateId", 1582457956);
        setIntField(term154859, term154859.getClass(), "frameId", 286148133);
        setIntField(term154859, term154859.getClass(), "trophyId", -1449899243);
        setIntField(term154859, term154859.getClass(), "playCount", 876020017);
        setIntField(term154859, term154859.getClass(), "playVsCount", 1695842603);
        setIntField(term154859, term154859.getClass(), "playSyncCount", 742165444);
        setIntField(term154859, term154859.getClass(), "winCount", 1508517248);
        setIntField(term154859, term154859.getClass(), "helpCount", 2066768205);
        setIntField(term154859, term154859.getClass(), "comboCount", 822003306);
        setIntField(term154859, term154859.getClass(), "feverCount", 1462055910);
        setIntField(term154859, term154859.getClass(), "totalHiScore", -962847489);
        setIntField(term154859, term154859.getClass(), "totalEasyHighScore", 1578579602);
        setIntField(term154859, term154859.getClass(), "totalBasicHighScore", -1583718184);
        setIntField(term154859, term154859.getClass(), "totalAdvancedHighScore", 858078327);
        setIntField(term154859, term154859.getClass(), "totalExpertHighScore", 834810548);
        setIntField(term154859, term154859.getClass(), "totalMasterHighScore", 1931636538);
        setIntField(term154859, term154859.getClass(), "totalReMasterHighScore", 832341694);
        setIntField(term154859, term154859.getClass(), "totalHighSync", -364504021);
        setIntField(term154859, term154859.getClass(), "totalEasySync", -1497625798);
        setIntField(term154859, term154859.getClass(), "totalBasicSync", 385234662);
        setIntField(term154859, term154859.getClass(), "totalAdvancedSync", 1645696733);
        setIntField(term154859, term154859.getClass(), "totalExpertSync", -310541938);
        setIntField(term154859, term154859.getClass(), "totalMasterSync", -1083096531);
        setIntField(term154859, term154859.getClass(), "totalReMasterSync", -1447027246);
        setIntField(term154859, term154859.getClass(), "playerRating", 1184842126);
        setIntField(term154859, term154859.getClass(), "highestRating", 1648455512);
        setIntField(term154859, term154859.getClass(), "rankAuthTailId", 1397027310);
        setField(term154859, term154859.getClass(), "eventWatchedDate", "DNgbgDcryI");
        setField(term154859, term154859.getClass(), "webLimitDate", "NHOLoiInVI");
        setIntField(term154859, term154859.getClass(), "challengeTrackPhase", -107872439);
        setIntField(term154859, term154859.getClass(), "firstPlayBits", -2080677845);
        setField(term154859, term154859.getClass(), "lastPlayDate", "PVcjWjrzGf");
        setIntField(term154859, term154859.getClass(), "lastPlaceId", 1246841349);
        setField(term154859, term154859.getClass(), "lastPlaceName", "EsauoauZcZ");
        setIntField(term154859, term154859.getClass(), "lastRegionId", -430738521);
        setField(term154859, term154859.getClass(), "lastRegionName", "qiDNqUNRHY");
        setField(term154859, term154859.getClass(), "lastClientId", "WjRIILfuQl");
        setField(term154859, term154859.getClass(), "lastCountryCode", "FqgiIhfmCu");
        setIntField(term154859, term154859.getClass(), "eventPoint", -1780458662);
        setIntField(term154859, term154859.getClass(), "totalLv", 729374381);
        setIntField(term154859, term154859.getClass(), "lastLoginBonusDay", -443962715);
        setIntField(term154859, term154859.getClass(), "lastSurvivalBonusDay", -746742900);
        setIntField(term154859, term154859.getClass(), "loginBonusLv", 1428166603);
        setField(term154857, term154857.getClass(), "user", term154859);
        setIntField(term154857, term154857.getClass(), "orderId", -748430442);
        setLongField(term154857, term154857.getClass(), "sortNumber", 1805176718113697933L);
        setIntField(term154857, term154857.getClass(), "placeId", -1801319696);
        setField(term154857, term154857.getClass(), "placeName", "oENXVcVJUC");
        setField(term154857, term154857.getClass(), "country", "ytIVCXPyNV");
        setIntField(term154857, term154857.getClass(), "regionId", 976549220);
        setField(term154857, term154857.getClass(), "playDate", "LmUSMvJtpQ");
        setField(term154857, term154857.getClass(), "userPlayDate", "eoDQvGDMGx");
        setIntField(term154857, term154857.getClass(), "musicId", 1422580813);
        setIntField(term154857, term154857.getClass(), "level", -1683725807);
        setIntField(term154857, term154857.getClass(), "gameMode", 705732253);
        setIntField(term154857, term154857.getClass(), "rivalNum", 1446036807);
        setIntField(term154857, term154857.getClass(), "track", -1664057871);
        setIntField(term154857, term154857.getClass(), "eventId", 1384669782);
        setBooleanField(term154857, term154857.getClass(), "isFreeToPlay", false);
        setIntField(term154857, term154857.getClass(), "playerRating", 1027730931);
        setLongField(term154857, term154857.getClass(), "playedUserId1", 8453512367875425981L);
        setField(term154857, term154857.getClass(), "playedUserName1", "OtuSXazGGk");
        setIntField(term154857, term154857.getClass(), "playedMusicLevel1", -1150562135);
        setLongField(term154857, term154857.getClass(), "playedUserId2", -5710142537128696043L);
        setField(term154857, term154857.getClass(), "playedUserName2", "tBhjvegtdH");
        setIntField(term154857, term154857.getClass(), "playedMusicLevel2", 1961831898);
        setLongField(term154857, term154857.getClass(), "playedUserId3", 3423802125971060085L);
        setField(term154857, term154857.getClass(), "playedUserName3", "OpHteeKkID");
        setIntField(term154857, term154857.getClass(), "playedMusicLevel3", 724749395);
        setIntField(term154857, term154857.getClass(), "achievement", -1323891297);
        setIntField(term154857, term154857.getClass(), "score", -397986922);
        setIntField(term154857, term154857.getClass(), "tapScore", 2077450036);
        setIntField(term154857, term154857.getClass(), "holdScore", -742772600);
        setIntField(term154857, term154857.getClass(), "slideScore", 980832200);
        setIntField(term154857, term154857.getClass(), "breakScore", 716097087);
        setIntField(term154857, term154857.getClass(), "syncRate", -126117788);
        setIntField(term154857, term154857.getClass(), "vsWin", -1098020046);
        setBooleanField(term154857, term154857.getClass(), "isAllPerfect", true);
        setIntField(term154857, term154857.getClass(), "fullCombo", -1410831776);
        setIntField(term154857, term154857.getClass(), "maxFever", 668980916);
        setIntField(term154857, term154857.getClass(), "maxCombo", 1835770752);
        setIntField(term154857, term154857.getClass(), "tapPerfect", 263724459);
        setIntField(term154857, term154857.getClass(), "tapGreat", 284921533);
        setIntField(term154857, term154857.getClass(), "tapGood", -1455736078);
        setIntField(term154857, term154857.getClass(), "tapBad", -1644310015);
        setIntField(term154857, term154857.getClass(), "holdPerfect", 1698626064);
        setIntField(term154857, term154857.getClass(), "holdGreat", -54698393);
        setIntField(term154857, term154857.getClass(), "holdGood", 530054944);
        setIntField(term154857, term154857.getClass(), "holdBad", 1608009655);
        setIntField(term154857, term154857.getClass(), "slidePerfect", 408495396);
        setIntField(term154857, term154857.getClass(), "slideGreat", -1287378637);
        setIntField(term154857, term154857.getClass(), "slideGood", -1709427691);
        setIntField(term154857, term154857.getClass(), "slideBad", 1484226812);
        setIntField(term154857, term154857.getClass(), "breakPerfect", 904753779);
        setIntField(term154857, term154857.getClass(), "breakGreat", 876478608);
        setIntField(term154857, term154857.getClass(), "breakGood", 2046140958);
        setIntField(term154857, term154857.getClass(), "breakBad", 941525036);
        setBooleanField(term154857, term154857.getClass(), "isTrackSkip", false);
        setBooleanField(term154857, term154857.getClass(), "isHighScore", true);
        setBooleanField(term154857, term154857.getClass(), "isChallengeTrack", true);
        setIntField(term154857, term154857.getClass(), "challengeLife", 1171226298);
        setIntField(term154857, term154857.getClass(), "challengeRemain", 1695362080);
        setIntField(term154857, term154857.getClass(), "isAllPerfectPlus", -1046191107);
        term155169 = new Integer(-477065644);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term155169;
        callMethod(klass, "setScore", argTypes, term154857, args);
    }

};


