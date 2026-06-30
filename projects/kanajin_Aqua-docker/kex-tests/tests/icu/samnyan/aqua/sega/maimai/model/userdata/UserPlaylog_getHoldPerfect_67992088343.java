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

public class UserPlaylog_getHoldPerfect_67992088343 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term132687;

    public UserPlaylog_getHoldPerfect_67992088343() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term132693 = new Long(-5004803270846838598L);
        term132687 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term132689 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term132691 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term132707 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term132708 = newInstance(Class.forName("java.time.LocalDate"));
        Object term132712 = newInstance(Class.forName("java.time.LocalTime"));
        Object term132717 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term132718 = newInstance(Class.forName("java.time.LocalDate"));
        Object term132722 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term132687, term132687.getClass(), "id", -5478680438603251116L);
        setLongField(term132689, term132689.getClass(), "id", 3362279702053141081L);
        setLongField(term132691, term132691.getClass(), "id", -58248142535266417L);
        setField(term132691, term132691.getClass(), "extId", term132693);
        setField(term132691, term132691.getClass(), "luid", "NDTlULiAEp");
        setIntField(term132708, term132708.getClass(), "year", 2020);
        setShortField(term132708, term132708.getClass(), "month", (short) 2);
        setShortField(term132708, term132708.getClass(), "day", (short) 28);
        setField(term132707, term132707.getClass(), "date", term132708);
        setByteField(term132712, term132712.getClass(), "hour", (byte) 3);
        setByteField(term132712, term132712.getClass(), "minute", (byte) 46);
        setByteField(term132712, term132712.getClass(), "second", (byte) 58);
        setIntField(term132712, term132712.getClass(), "nano", 519279868);
        setField(term132707, term132707.getClass(), "time", term132712);
        setField(term132691, term132691.getClass(), "registerTime", term132707);
        setIntField(term132718, term132718.getClass(), "year", 2028);
        setShortField(term132718, term132718.getClass(), "month", (short) 8);
        setShortField(term132718, term132718.getClass(), "day", (short) 27);
        setField(term132717, term132717.getClass(), "date", term132718);
        setByteField(term132722, term132722.getClass(), "hour", (byte) 5);
        setByteField(term132722, term132722.getClass(), "minute", (byte) 50);
        setByteField(term132722, term132722.getClass(), "second", (byte) 39);
        setIntField(term132722, term132722.getClass(), "nano", 452455240);
        setField(term132717, term132717.getClass(), "time", term132722);
        setField(term132691, term132691.getClass(), "accessTime", term132717);
        setField(term132689, term132689.getClass(), "card", term132691);
        setIntField(term132689, term132689.getClass(), "lastDataVersion", -973774966);
        setField(term132689, term132689.getClass(), "userName", "KakVHGlMtc");
        setIntField(term132689, term132689.getClass(), "point", 834522817);
        setIntField(term132689, term132689.getClass(), "totalPoint", -347786272);
        setIntField(term132689, term132689.getClass(), "iconId", 1060556162);
        setIntField(term132689, term132689.getClass(), "nameplateId", 959380706);
        setIntField(term132689, term132689.getClass(), "frameId", -326306383);
        setIntField(term132689, term132689.getClass(), "trophyId", 540302191);
        setIntField(term132689, term132689.getClass(), "playCount", -609255604);
        setIntField(term132689, term132689.getClass(), "playVsCount", -82613070);
        setIntField(term132689, term132689.getClass(), "playSyncCount", -784469011);
        setIntField(term132689, term132689.getClass(), "winCount", -1563306162);
        setIntField(term132689, term132689.getClass(), "helpCount", 1768487935);
        setIntField(term132689, term132689.getClass(), "comboCount", -1396395408);
        setIntField(term132689, term132689.getClass(), "feverCount", 1098284426);
        setIntField(term132689, term132689.getClass(), "totalHiScore", 1882274499);
        setIntField(term132689, term132689.getClass(), "totalEasyHighScore", 1481791080);
        setIntField(term132689, term132689.getClass(), "totalBasicHighScore", -1492881566);
        setIntField(term132689, term132689.getClass(), "totalAdvancedHighScore", -885209879);
        setIntField(term132689, term132689.getClass(), "totalExpertHighScore", 1147134253);
        setIntField(term132689, term132689.getClass(), "totalMasterHighScore", -1873437402);
        setIntField(term132689, term132689.getClass(), "totalReMasterHighScore", 1861241151);
        setIntField(term132689, term132689.getClass(), "totalHighSync", -124352876);
        setIntField(term132689, term132689.getClass(), "totalEasySync", -1523749049);
        setIntField(term132689, term132689.getClass(), "totalBasicSync", 1334443168);
        setIntField(term132689, term132689.getClass(), "totalAdvancedSync", 1087084309);
        setIntField(term132689, term132689.getClass(), "totalExpertSync", -1293124018);
        setIntField(term132689, term132689.getClass(), "totalMasterSync", -719018839);
        setIntField(term132689, term132689.getClass(), "totalReMasterSync", -938374088);
        setIntField(term132689, term132689.getClass(), "playerRating", -776177554);
        setIntField(term132689, term132689.getClass(), "highestRating", 814192996);
        setIntField(term132689, term132689.getClass(), "rankAuthTailId", -1434369644);
        setField(term132689, term132689.getClass(), "eventWatchedDate", "XQkRBflDak");
        setField(term132689, term132689.getClass(), "webLimitDate", "UXtNgOITuj");
        setIntField(term132689, term132689.getClass(), "challengeTrackPhase", 1542077120);
        setIntField(term132689, term132689.getClass(), "firstPlayBits", 253803182);
        setField(term132689, term132689.getClass(), "lastPlayDate", "NpmLmrGTHj");
        setIntField(term132689, term132689.getClass(), "lastPlaceId", -503416247);
        setField(term132689, term132689.getClass(), "lastPlaceName", "BPWhlQnFCE");
        setIntField(term132689, term132689.getClass(), "lastRegionId", -1351088914);
        setField(term132689, term132689.getClass(), "lastRegionName", "CPQejCPAgr");
        setField(term132689, term132689.getClass(), "lastClientId", "epVEZIxJwk");
        setField(term132689, term132689.getClass(), "lastCountryCode", "BXROAUdJLA");
        setIntField(term132689, term132689.getClass(), "eventPoint", -1384346068);
        setIntField(term132689, term132689.getClass(), "totalLv", 1031876799);
        setIntField(term132689, term132689.getClass(), "lastLoginBonusDay", 1136599393);
        setIntField(term132689, term132689.getClass(), "lastSurvivalBonusDay", -2098067829);
        setIntField(term132689, term132689.getClass(), "loginBonusLv", 1361717897);
        setField(term132687, term132687.getClass(), "user", term132689);
        setIntField(term132687, term132687.getClass(), "orderId", -1603247889);
        setLongField(term132687, term132687.getClass(), "sortNumber", 370832762515262203L);
        setIntField(term132687, term132687.getClass(), "placeId", 1850330908);
        setField(term132687, term132687.getClass(), "placeName", "hGaZkCaPVx");
        setField(term132687, term132687.getClass(), "country", "NuXhRMHMqg");
        setIntField(term132687, term132687.getClass(), "regionId", -349376083);
        setField(term132687, term132687.getClass(), "playDate", "XZoFaqRxkb");
        setField(term132687, term132687.getClass(), "userPlayDate", "LpERFmEphm");
        setIntField(term132687, term132687.getClass(), "musicId", 432624685);
        setIntField(term132687, term132687.getClass(), "level", 571190552);
        setIntField(term132687, term132687.getClass(), "gameMode", -1418759353);
        setIntField(term132687, term132687.getClass(), "rivalNum", -221912114);
        setIntField(term132687, term132687.getClass(), "track", -1894129360);
        setIntField(term132687, term132687.getClass(), "eventId", 44325120);
        setBooleanField(term132687, term132687.getClass(), "isFreeToPlay", false);
        setIntField(term132687, term132687.getClass(), "playerRating", -1187562082);
        setLongField(term132687, term132687.getClass(), "playedUserId1", 6931806194311088657L);
        setField(term132687, term132687.getClass(), "playedUserName1", "ZtXtZNcDRU");
        setIntField(term132687, term132687.getClass(), "playedMusicLevel1", 1154282396);
        setLongField(term132687, term132687.getClass(), "playedUserId2", -6104317529539097644L);
        setField(term132687, term132687.getClass(), "playedUserName2", "ZHBibLHikD");
        setIntField(term132687, term132687.getClass(), "playedMusicLevel2", -1659679206);
        setLongField(term132687, term132687.getClass(), "playedUserId3", 4456551328322151200L);
        setField(term132687, term132687.getClass(), "playedUserName3", "ytpYllcFQh");
        setIntField(term132687, term132687.getClass(), "playedMusicLevel3", -779611389);
        setIntField(term132687, term132687.getClass(), "achievement", 288629669);
        setIntField(term132687, term132687.getClass(), "score", -1713658812);
        setIntField(term132687, term132687.getClass(), "tapScore", 1823664605);
        setIntField(term132687, term132687.getClass(), "holdScore", 355918575);
        setIntField(term132687, term132687.getClass(), "slideScore", -296980553);
        setIntField(term132687, term132687.getClass(), "breakScore", -1224161037);
        setIntField(term132687, term132687.getClass(), "syncRate", 1173114117);
        setIntField(term132687, term132687.getClass(), "vsWin", -2050055378);
        setBooleanField(term132687, term132687.getClass(), "isAllPerfect", true);
        setIntField(term132687, term132687.getClass(), "fullCombo", -1602048673);
        setIntField(term132687, term132687.getClass(), "maxFever", 1412996249);
        setIntField(term132687, term132687.getClass(), "maxCombo", 1976406061);
        setIntField(term132687, term132687.getClass(), "tapPerfect", 1582458922);
        setIntField(term132687, term132687.getClass(), "tapGreat", 1466992358);
        setIntField(term132687, term132687.getClass(), "tapGood", 1374687727);
        setIntField(term132687, term132687.getClass(), "tapBad", 1326183861);
        setIntField(term132687, term132687.getClass(), "holdPerfect", -2097776148);
        setIntField(term132687, term132687.getClass(), "holdGreat", 236546092);
        setIntField(term132687, term132687.getClass(), "holdGood", 1405001659);
        setIntField(term132687, term132687.getClass(), "holdBad", 1027930801);
        setIntField(term132687, term132687.getClass(), "slidePerfect", 1644151814);
        setIntField(term132687, term132687.getClass(), "slideGreat", -423363909);
        setIntField(term132687, term132687.getClass(), "slideGood", -71168686);
        setIntField(term132687, term132687.getClass(), "slideBad", -2020932828);
        setIntField(term132687, term132687.getClass(), "breakPerfect", 72343475);
        setIntField(term132687, term132687.getClass(), "breakGreat", -1729704168);
        setIntField(term132687, term132687.getClass(), "breakGood", 1241252702);
        setIntField(term132687, term132687.getClass(), "breakBad", 882120045);
        setBooleanField(term132687, term132687.getClass(), "isTrackSkip", false);
        setBooleanField(term132687, term132687.getClass(), "isHighScore", true);
        setBooleanField(term132687, term132687.getClass(), "isChallengeTrack", false);
        setIntField(term132687, term132687.getClass(), "challengeLife", -1734009796);
        setIntField(term132687, term132687.getClass(), "challengeRemain", -1222260900);
        setIntField(term132687, term132687.getClass(), "isAllPerfectPlus", -1352047391);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHoldPerfect", argTypes, term132687, args);
    }

};


