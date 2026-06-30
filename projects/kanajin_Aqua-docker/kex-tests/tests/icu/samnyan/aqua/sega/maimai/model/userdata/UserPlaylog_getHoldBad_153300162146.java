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

public class UserPlaylog_getHoldBad_153300162146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term134103;

    public UserPlaylog_getHoldBad_153300162146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term134109 = new Long(7010148136855890340L);
        term134103 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term134105 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term134107 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term134123 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term134124 = newInstance(Class.forName("java.time.LocalDate"));
        Object term134128 = newInstance(Class.forName("java.time.LocalTime"));
        Object term134133 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term134134 = newInstance(Class.forName("java.time.LocalDate"));
        Object term134138 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term134103, term134103.getClass(), "id", 1095152021713790235L);
        setLongField(term134105, term134105.getClass(), "id", 9070668522488722105L);
        setLongField(term134107, term134107.getClass(), "id", 1784073150606702821L);
        setField(term134107, term134107.getClass(), "extId", term134109);
        setField(term134107, term134107.getClass(), "luid", "qqnzeIWFCa");
        setIntField(term134124, term134124.getClass(), "year", 2024);
        setShortField(term134124, term134124.getClass(), "month", (short) 5);
        setShortField(term134124, term134124.getClass(), "day", (short) 28);
        setField(term134123, term134123.getClass(), "date", term134124);
        setByteField(term134128, term134128.getClass(), "hour", (byte) 15);
        setByteField(term134128, term134128.getClass(), "minute", (byte) 17);
        setByteField(term134128, term134128.getClass(), "second", (byte) 52);
        setIntField(term134128, term134128.getClass(), "nano", 650019774);
        setField(term134123, term134123.getClass(), "time", term134128);
        setField(term134107, term134107.getClass(), "registerTime", term134123);
        setIntField(term134134, term134134.getClass(), "year", 2028);
        setShortField(term134134, term134134.getClass(), "month", (short) 12);
        setShortField(term134134, term134134.getClass(), "day", (short) 5);
        setField(term134133, term134133.getClass(), "date", term134134);
        setByteField(term134138, term134138.getClass(), "hour", (byte) 0);
        setByteField(term134138, term134138.getClass(), "minute", (byte) 31);
        setByteField(term134138, term134138.getClass(), "second", (byte) 47);
        setIntField(term134138, term134138.getClass(), "nano", 889672113);
        setField(term134133, term134133.getClass(), "time", term134138);
        setField(term134107, term134107.getClass(), "accessTime", term134133);
        setField(term134105, term134105.getClass(), "card", term134107);
        setIntField(term134105, term134105.getClass(), "lastDataVersion", -1307803249);
        setField(term134105, term134105.getClass(), "userName", "gOdeBqOhYH");
        setIntField(term134105, term134105.getClass(), "point", 534335201);
        setIntField(term134105, term134105.getClass(), "totalPoint", -1255427884);
        setIntField(term134105, term134105.getClass(), "iconId", 1168729369);
        setIntField(term134105, term134105.getClass(), "nameplateId", 151690467);
        setIntField(term134105, term134105.getClass(), "frameId", -186313217);
        setIntField(term134105, term134105.getClass(), "trophyId", -815651409);
        setIntField(term134105, term134105.getClass(), "playCount", -353945578);
        setIntField(term134105, term134105.getClass(), "playVsCount", 1135633);
        setIntField(term134105, term134105.getClass(), "playSyncCount", 1621941924);
        setIntField(term134105, term134105.getClass(), "winCount", 165051353);
        setIntField(term134105, term134105.getClass(), "helpCount", 319228528);
        setIntField(term134105, term134105.getClass(), "comboCount", -1386299179);
        setIntField(term134105, term134105.getClass(), "feverCount", 1707068994);
        setIntField(term134105, term134105.getClass(), "totalHiScore", 679614372);
        setIntField(term134105, term134105.getClass(), "totalEasyHighScore", -1870715839);
        setIntField(term134105, term134105.getClass(), "totalBasicHighScore", -294405038);
        setIntField(term134105, term134105.getClass(), "totalAdvancedHighScore", -795338343);
        setIntField(term134105, term134105.getClass(), "totalExpertHighScore", 229702668);
        setIntField(term134105, term134105.getClass(), "totalMasterHighScore", 1625307154);
        setIntField(term134105, term134105.getClass(), "totalReMasterHighScore", 874439788);
        setIntField(term134105, term134105.getClass(), "totalHighSync", -1064976000);
        setIntField(term134105, term134105.getClass(), "totalEasySync", -398704081);
        setIntField(term134105, term134105.getClass(), "totalBasicSync", -1711507656);
        setIntField(term134105, term134105.getClass(), "totalAdvancedSync", 480387670);
        setIntField(term134105, term134105.getClass(), "totalExpertSync", 1761728485);
        setIntField(term134105, term134105.getClass(), "totalMasterSync", 1806701564);
        setIntField(term134105, term134105.getClass(), "totalReMasterSync", -1488910214);
        setIntField(term134105, term134105.getClass(), "playerRating", -1970174359);
        setIntField(term134105, term134105.getClass(), "highestRating", -2021486318);
        setIntField(term134105, term134105.getClass(), "rankAuthTailId", 1707744811);
        setField(term134105, term134105.getClass(), "eventWatchedDate", "EyPdpJTxkZ");
        setField(term134105, term134105.getClass(), "webLimitDate", "vfKOoCcJXS");
        setIntField(term134105, term134105.getClass(), "challengeTrackPhase", 803063031);
        setIntField(term134105, term134105.getClass(), "firstPlayBits", 832802103);
        setField(term134105, term134105.getClass(), "lastPlayDate", "jCPFInZUzz");
        setIntField(term134105, term134105.getClass(), "lastPlaceId", 2091427121);
        setField(term134105, term134105.getClass(), "lastPlaceName", "WPHeIEBBVh");
        setIntField(term134105, term134105.getClass(), "lastRegionId", -1709658772);
        setField(term134105, term134105.getClass(), "lastRegionName", "ruFkchQbOS");
        setField(term134105, term134105.getClass(), "lastClientId", "tBfuxXsdPa");
        setField(term134105, term134105.getClass(), "lastCountryCode", "fbUKhQMRyD");
        setIntField(term134105, term134105.getClass(), "eventPoint", -1850646714);
        setIntField(term134105, term134105.getClass(), "totalLv", 1704468960);
        setIntField(term134105, term134105.getClass(), "lastLoginBonusDay", -299710958);
        setIntField(term134105, term134105.getClass(), "lastSurvivalBonusDay", -1806570782);
        setIntField(term134105, term134105.getClass(), "loginBonusLv", 598628574);
        setField(term134103, term134103.getClass(), "user", term134105);
        setIntField(term134103, term134103.getClass(), "orderId", 64811427);
        setLongField(term134103, term134103.getClass(), "sortNumber", -3116269489103564104L);
        setIntField(term134103, term134103.getClass(), "placeId", 1227631914);
        setField(term134103, term134103.getClass(), "placeName", "NSGSwngDCi");
        setField(term134103, term134103.getClass(), "country", "IqTXCynBeA");
        setIntField(term134103, term134103.getClass(), "regionId", 1333652434);
        setField(term134103, term134103.getClass(), "playDate", "bgIAbyunKO");
        setField(term134103, term134103.getClass(), "userPlayDate", "ECOAkMOcmP");
        setIntField(term134103, term134103.getClass(), "musicId", -1093703240);
        setIntField(term134103, term134103.getClass(), "level", 468378808);
        setIntField(term134103, term134103.getClass(), "gameMode", -1470659106);
        setIntField(term134103, term134103.getClass(), "rivalNum", 1250265239);
        setIntField(term134103, term134103.getClass(), "track", -1795670477);
        setIntField(term134103, term134103.getClass(), "eventId", 499241052);
        setBooleanField(term134103, term134103.getClass(), "isFreeToPlay", true);
        setIntField(term134103, term134103.getClass(), "playerRating", 1118287873);
        setLongField(term134103, term134103.getClass(), "playedUserId1", 8240231262183296861L);
        setField(term134103, term134103.getClass(), "playedUserName1", "GropLwcnsd");
        setIntField(term134103, term134103.getClass(), "playedMusicLevel1", 1164127961);
        setLongField(term134103, term134103.getClass(), "playedUserId2", -5557521111022569289L);
        setField(term134103, term134103.getClass(), "playedUserName2", "OPVlJKGGVY");
        setIntField(term134103, term134103.getClass(), "playedMusicLevel2", 2072620854);
        setLongField(term134103, term134103.getClass(), "playedUserId3", 508795580601675574L);
        setField(term134103, term134103.getClass(), "playedUserName3", "kcbEwUStJX");
        setIntField(term134103, term134103.getClass(), "playedMusicLevel3", -1096501716);
        setIntField(term134103, term134103.getClass(), "achievement", 705451675);
        setIntField(term134103, term134103.getClass(), "score", 1012015870);
        setIntField(term134103, term134103.getClass(), "tapScore", 1111414939);
        setIntField(term134103, term134103.getClass(), "holdScore", -209050442);
        setIntField(term134103, term134103.getClass(), "slideScore", 1148172012);
        setIntField(term134103, term134103.getClass(), "breakScore", -886315809);
        setIntField(term134103, term134103.getClass(), "syncRate", -665144885);
        setIntField(term134103, term134103.getClass(), "vsWin", -1411805876);
        setBooleanField(term134103, term134103.getClass(), "isAllPerfect", false);
        setIntField(term134103, term134103.getClass(), "fullCombo", -522128464);
        setIntField(term134103, term134103.getClass(), "maxFever", 1776987071);
        setIntField(term134103, term134103.getClass(), "maxCombo", 679742629);
        setIntField(term134103, term134103.getClass(), "tapPerfect", -951606500);
        setIntField(term134103, term134103.getClass(), "tapGreat", 1648648355);
        setIntField(term134103, term134103.getClass(), "tapGood", -1757205128);
        setIntField(term134103, term134103.getClass(), "tapBad", 556277411);
        setIntField(term134103, term134103.getClass(), "holdPerfect", -734980227);
        setIntField(term134103, term134103.getClass(), "holdGreat", 1184444999);
        setIntField(term134103, term134103.getClass(), "holdGood", 649536758);
        setIntField(term134103, term134103.getClass(), "holdBad", 572127295);
        setIntField(term134103, term134103.getClass(), "slidePerfect", -906737781);
        setIntField(term134103, term134103.getClass(), "slideGreat", 1837850084);
        setIntField(term134103, term134103.getClass(), "slideGood", 1470450665);
        setIntField(term134103, term134103.getClass(), "slideBad", 1923583635);
        setIntField(term134103, term134103.getClass(), "breakPerfect", 1371516661);
        setIntField(term134103, term134103.getClass(), "breakGreat", 1190458831);
        setIntField(term134103, term134103.getClass(), "breakGood", -504185930);
        setIntField(term134103, term134103.getClass(), "breakBad", -876397761);
        setBooleanField(term134103, term134103.getClass(), "isTrackSkip", false);
        setBooleanField(term134103, term134103.getClass(), "isHighScore", false);
        setBooleanField(term134103, term134103.getClass(), "isChallengeTrack", false);
        setIntField(term134103, term134103.getClass(), "challengeLife", -2125188076);
        setIntField(term134103, term134103.getClass(), "challengeRemain", 1650623983);
        setIntField(term134103, term134103.getClass(), "isAllPerfectPlus", -1103828562);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHoldBad", argTypes, term134103, args);
    }

};


