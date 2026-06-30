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

public class UserPlaylog_setPlaceName_112279386066 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term143815;

    public UserPlaylog_setPlaceName_112279386066() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term143821 = new Long(661905373566913125L);
        term143815 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term143817 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term143819 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term143835 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term143836 = newInstance(Class.forName("java.time.LocalDate"));
        Object term143840 = newInstance(Class.forName("java.time.LocalTime"));
        Object term143845 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term143846 = newInstance(Class.forName("java.time.LocalDate"));
        Object term143850 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term143815, term143815.getClass(), "id", 852818663192057236L);
        setLongField(term143817, term143817.getClass(), "id", -4175022778768613863L);
        setLongField(term143819, term143819.getClass(), "id", -4902671035184844892L);
        setField(term143819, term143819.getClass(), "extId", term143821);
        setField(term143819, term143819.getClass(), "luid", "VJXbdWMtjC");
        setIntField(term143836, term143836.getClass(), "year", 2021);
        setShortField(term143836, term143836.getClass(), "month", (short) 4);
        setShortField(term143836, term143836.getClass(), "day", (short) 25);
        setField(term143835, term143835.getClass(), "date", term143836);
        setByteField(term143840, term143840.getClass(), "hour", (byte) 8);
        setByteField(term143840, term143840.getClass(), "minute", (byte) 14);
        setByteField(term143840, term143840.getClass(), "second", (byte) 18);
        setIntField(term143840, term143840.getClass(), "nano", 906796683);
        setField(term143835, term143835.getClass(), "time", term143840);
        setField(term143819, term143819.getClass(), "registerTime", term143835);
        setIntField(term143846, term143846.getClass(), "year", 2012);
        setShortField(term143846, term143846.getClass(), "month", (short) 7);
        setShortField(term143846, term143846.getClass(), "day", (short) 16);
        setField(term143845, term143845.getClass(), "date", term143846);
        setByteField(term143850, term143850.getClass(), "hour", (byte) 8);
        setByteField(term143850, term143850.getClass(), "minute", (byte) 3);
        setByteField(term143850, term143850.getClass(), "second", (byte) 1);
        setIntField(term143850, term143850.getClass(), "nano", 861288078);
        setField(term143845, term143845.getClass(), "time", term143850);
        setField(term143819, term143819.getClass(), "accessTime", term143845);
        setField(term143817, term143817.getClass(), "card", term143819);
        setIntField(term143817, term143817.getClass(), "lastDataVersion", 1340578998);
        setField(term143817, term143817.getClass(), "userName", "AugzpVbSsO");
        setIntField(term143817, term143817.getClass(), "point", -1900977720);
        setIntField(term143817, term143817.getClass(), "totalPoint", 109271119);
        setIntField(term143817, term143817.getClass(), "iconId", 825124058);
        setIntField(term143817, term143817.getClass(), "nameplateId", 1957851443);
        setIntField(term143817, term143817.getClass(), "frameId", 1055723029);
        setIntField(term143817, term143817.getClass(), "trophyId", 2108463040);
        setIntField(term143817, term143817.getClass(), "playCount", 1485634751);
        setIntField(term143817, term143817.getClass(), "playVsCount", 1649606615);
        setIntField(term143817, term143817.getClass(), "playSyncCount", 1965144392);
        setIntField(term143817, term143817.getClass(), "winCount", -896244794);
        setIntField(term143817, term143817.getClass(), "helpCount", -1329430786);
        setIntField(term143817, term143817.getClass(), "comboCount", 1526430415);
        setIntField(term143817, term143817.getClass(), "feverCount", -1335813580);
        setIntField(term143817, term143817.getClass(), "totalHiScore", -1945458236);
        setIntField(term143817, term143817.getClass(), "totalEasyHighScore", 620008134);
        setIntField(term143817, term143817.getClass(), "totalBasicHighScore", -1310086261);
        setIntField(term143817, term143817.getClass(), "totalAdvancedHighScore", -1554112233);
        setIntField(term143817, term143817.getClass(), "totalExpertHighScore", 54581392);
        setIntField(term143817, term143817.getClass(), "totalMasterHighScore", 671071231);
        setIntField(term143817, term143817.getClass(), "totalReMasterHighScore", 1323294572);
        setIntField(term143817, term143817.getClass(), "totalHighSync", 562264132);
        setIntField(term143817, term143817.getClass(), "totalEasySync", 220331589);
        setIntField(term143817, term143817.getClass(), "totalBasicSync", 1631094414);
        setIntField(term143817, term143817.getClass(), "totalAdvancedSync", -1544328261);
        setIntField(term143817, term143817.getClass(), "totalExpertSync", -1889604863);
        setIntField(term143817, term143817.getClass(), "totalMasterSync", 279867224);
        setIntField(term143817, term143817.getClass(), "totalReMasterSync", -537026089);
        setIntField(term143817, term143817.getClass(), "playerRating", -1121256227);
        setIntField(term143817, term143817.getClass(), "highestRating", -534653262);
        setIntField(term143817, term143817.getClass(), "rankAuthTailId", -645772567);
        setField(term143817, term143817.getClass(), "eventWatchedDate", "tBGQmugLvu");
        setField(term143817, term143817.getClass(), "webLimitDate", "oxWULKaNGt");
        setIntField(term143817, term143817.getClass(), "challengeTrackPhase", -682512253);
        setIntField(term143817, term143817.getClass(), "firstPlayBits", -766106428);
        setField(term143817, term143817.getClass(), "lastPlayDate", "cbZjrijpVX");
        setIntField(term143817, term143817.getClass(), "lastPlaceId", 1129646646);
        setField(term143817, term143817.getClass(), "lastPlaceName", "OGWRelGqxR");
        setIntField(term143817, term143817.getClass(), "lastRegionId", -800100261);
        setField(term143817, term143817.getClass(), "lastRegionName", "fKSWVsjAjO");
        setField(term143817, term143817.getClass(), "lastClientId", "mgPzmcygcU");
        setField(term143817, term143817.getClass(), "lastCountryCode", "mvEDoAbPuT");
        setIntField(term143817, term143817.getClass(), "eventPoint", -119811965);
        setIntField(term143817, term143817.getClass(), "totalLv", 1546312873);
        setIntField(term143817, term143817.getClass(), "lastLoginBonusDay", 1323349904);
        setIntField(term143817, term143817.getClass(), "lastSurvivalBonusDay", -24593882);
        setIntField(term143817, term143817.getClass(), "loginBonusLv", -283500717);
        setField(term143815, term143815.getClass(), "user", term143817);
        setIntField(term143815, term143815.getClass(), "orderId", 1699540471);
        setLongField(term143815, term143815.getClass(), "sortNumber", -9006928175378855684L);
        setIntField(term143815, term143815.getClass(), "placeId", -2140185654);
        setField(term143815, term143815.getClass(), "placeName", "EUWHyMdRKl");
        setField(term143815, term143815.getClass(), "country", "YsUKZpMHKF");
        setIntField(term143815, term143815.getClass(), "regionId", -2147118613);
        setField(term143815, term143815.getClass(), "playDate", "sPGChMFTge");
        setField(term143815, term143815.getClass(), "userPlayDate", "DYmBIVURjz");
        setIntField(term143815, term143815.getClass(), "musicId", -1853768061);
        setIntField(term143815, term143815.getClass(), "level", 565081738);
        setIntField(term143815, term143815.getClass(), "gameMode", 1614594325);
        setIntField(term143815, term143815.getClass(), "rivalNum", -2109591096);
        setIntField(term143815, term143815.getClass(), "track", 1593580658);
        setIntField(term143815, term143815.getClass(), "eventId", -1309148136);
        setBooleanField(term143815, term143815.getClass(), "isFreeToPlay", false);
        setIntField(term143815, term143815.getClass(), "playerRating", -1127186635);
        setLongField(term143815, term143815.getClass(), "playedUserId1", 4672743577102213082L);
        setField(term143815, term143815.getClass(), "playedUserName1", "BotFhHNSzH");
        setIntField(term143815, term143815.getClass(), "playedMusicLevel1", 1448224493);
        setLongField(term143815, term143815.getClass(), "playedUserId2", -359180515829782685L);
        setField(term143815, term143815.getClass(), "playedUserName2", "LcLfqpnOTW");
        setIntField(term143815, term143815.getClass(), "playedMusicLevel2", -1142323876);
        setLongField(term143815, term143815.getClass(), "playedUserId3", 9051152709789005898L);
        setField(term143815, term143815.getClass(), "playedUserName3", "hGwBHMBbGw");
        setIntField(term143815, term143815.getClass(), "playedMusicLevel3", 10076911);
        setIntField(term143815, term143815.getClass(), "achievement", 1698012699);
        setIntField(term143815, term143815.getClass(), "score", -572528273);
        setIntField(term143815, term143815.getClass(), "tapScore", -858963817);
        setIntField(term143815, term143815.getClass(), "holdScore", 1913609184);
        setIntField(term143815, term143815.getClass(), "slideScore", 1547124435);
        setIntField(term143815, term143815.getClass(), "breakScore", 1173200220);
        setIntField(term143815, term143815.getClass(), "syncRate", 2118630937);
        setIntField(term143815, term143815.getClass(), "vsWin", 2096733563);
        setBooleanField(term143815, term143815.getClass(), "isAllPerfect", true);
        setIntField(term143815, term143815.getClass(), "fullCombo", -985370976);
        setIntField(term143815, term143815.getClass(), "maxFever", 1891127566);
        setIntField(term143815, term143815.getClass(), "maxCombo", 306681917);
        setIntField(term143815, term143815.getClass(), "tapPerfect", 1749187707);
        setIntField(term143815, term143815.getClass(), "tapGreat", 823887972);
        setIntField(term143815, term143815.getClass(), "tapGood", 341855428);
        setIntField(term143815, term143815.getClass(), "tapBad", 430075334);
        setIntField(term143815, term143815.getClass(), "holdPerfect", 1489074052);
        setIntField(term143815, term143815.getClass(), "holdGreat", -2021668795);
        setIntField(term143815, term143815.getClass(), "holdGood", -1290909842);
        setIntField(term143815, term143815.getClass(), "holdBad", 349362211);
        setIntField(term143815, term143815.getClass(), "slidePerfect", 1812892171);
        setIntField(term143815, term143815.getClass(), "slideGreat", -1975388787);
        setIntField(term143815, term143815.getClass(), "slideGood", -2072603449);
        setIntField(term143815, term143815.getClass(), "slideBad", -1901526540);
        setIntField(term143815, term143815.getClass(), "breakPerfect", -157492588);
        setIntField(term143815, term143815.getClass(), "breakGreat", -284211502);
        setIntField(term143815, term143815.getClass(), "breakGood", -585588567);
        setIntField(term143815, term143815.getClass(), "breakBad", -1534090803);
        setBooleanField(term143815, term143815.getClass(), "isTrackSkip", false);
        setBooleanField(term143815, term143815.getClass(), "isHighScore", false);
        setBooleanField(term143815, term143815.getClass(), "isChallengeTrack", true);
        setIntField(term143815, term143815.getClass(), "challengeLife", -1491757021);
        setIntField(term143815, term143815.getClass(), "challengeRemain", -821566378);
        setIntField(term143815, term143815.getClass(), "isAllPerfectPlus", -693482596);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "CzTiZXTrcB";
        callMethod(klass, "setPlaceName", argTypes, term143815, args);
    }

};


