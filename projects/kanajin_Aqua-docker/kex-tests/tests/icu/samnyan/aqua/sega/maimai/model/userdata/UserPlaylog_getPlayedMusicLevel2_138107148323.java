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

public class UserPlaylog_getPlayedMusicLevel2_138107148323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term123247;

    public UserPlaylog_getPlayedMusicLevel2_138107148323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term123253 = new Long(-7400951017937830861L);
        term123247 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term123249 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term123251 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term123267 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term123268 = newInstance(Class.forName("java.time.LocalDate"));
        Object term123272 = newInstance(Class.forName("java.time.LocalTime"));
        Object term123277 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term123278 = newInstance(Class.forName("java.time.LocalDate"));
        Object term123282 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term123247, term123247.getClass(), "id", -5539140353886034290L);
        setLongField(term123249, term123249.getClass(), "id", -2993798135603613656L);
        setLongField(term123251, term123251.getClass(), "id", 7643902889687500887L);
        setField(term123251, term123251.getClass(), "extId", term123253);
        setField(term123251, term123251.getClass(), "luid", "pJboxLnvbb");
        setIntField(term123268, term123268.getClass(), "year", 2012);
        setShortField(term123268, term123268.getClass(), "month", (short) 3);
        setShortField(term123268, term123268.getClass(), "day", (short) 6);
        setField(term123267, term123267.getClass(), "date", term123268);
        setByteField(term123272, term123272.getClass(), "hour", (byte) 8);
        setByteField(term123272, term123272.getClass(), "minute", (byte) 53);
        setByteField(term123272, term123272.getClass(), "second", (byte) 27);
        setIntField(term123272, term123272.getClass(), "nano", 49638302);
        setField(term123267, term123267.getClass(), "time", term123272);
        setField(term123251, term123251.getClass(), "registerTime", term123267);
        setIntField(term123278, term123278.getClass(), "year", 2026);
        setShortField(term123278, term123278.getClass(), "month", (short) 5);
        setShortField(term123278, term123278.getClass(), "day", (short) 4);
        setField(term123277, term123277.getClass(), "date", term123278);
        setByteField(term123282, term123282.getClass(), "hour", (byte) 4);
        setByteField(term123282, term123282.getClass(), "minute", (byte) 39);
        setByteField(term123282, term123282.getClass(), "second", (byte) 57);
        setIntField(term123282, term123282.getClass(), "nano", 807455541);
        setField(term123277, term123277.getClass(), "time", term123282);
        setField(term123251, term123251.getClass(), "accessTime", term123277);
        setField(term123249, term123249.getClass(), "card", term123251);
        setIntField(term123249, term123249.getClass(), "lastDataVersion", 1841048082);
        setField(term123249, term123249.getClass(), "userName", "ofGdinTYHj");
        setIntField(term123249, term123249.getClass(), "point", -57312033);
        setIntField(term123249, term123249.getClass(), "totalPoint", 1742098836);
        setIntField(term123249, term123249.getClass(), "iconId", 64098614);
        setIntField(term123249, term123249.getClass(), "nameplateId", 1944053676);
        setIntField(term123249, term123249.getClass(), "frameId", 783466223);
        setIntField(term123249, term123249.getClass(), "trophyId", 5087099);
        setIntField(term123249, term123249.getClass(), "playCount", 637442694);
        setIntField(term123249, term123249.getClass(), "playVsCount", 1058907718);
        setIntField(term123249, term123249.getClass(), "playSyncCount", 1946590161);
        setIntField(term123249, term123249.getClass(), "winCount", -663998937);
        setIntField(term123249, term123249.getClass(), "helpCount", 672324332);
        setIntField(term123249, term123249.getClass(), "comboCount", 696727230);
        setIntField(term123249, term123249.getClass(), "feverCount", -1533142622);
        setIntField(term123249, term123249.getClass(), "totalHiScore", 285134412);
        setIntField(term123249, term123249.getClass(), "totalEasyHighScore", 1477109630);
        setIntField(term123249, term123249.getClass(), "totalBasicHighScore", 1716965346);
        setIntField(term123249, term123249.getClass(), "totalAdvancedHighScore", -1457239006);
        setIntField(term123249, term123249.getClass(), "totalExpertHighScore", 3643262);
        setIntField(term123249, term123249.getClass(), "totalMasterHighScore", 1345774236);
        setIntField(term123249, term123249.getClass(), "totalReMasterHighScore", 1940738905);
        setIntField(term123249, term123249.getClass(), "totalHighSync", 351961548);
        setIntField(term123249, term123249.getClass(), "totalEasySync", 1827213743);
        setIntField(term123249, term123249.getClass(), "totalBasicSync", 342376736);
        setIntField(term123249, term123249.getClass(), "totalAdvancedSync", 385187012);
        setIntField(term123249, term123249.getClass(), "totalExpertSync", 1711124007);
        setIntField(term123249, term123249.getClass(), "totalMasterSync", -259263754);
        setIntField(term123249, term123249.getClass(), "totalReMasterSync", -544100653);
        setIntField(term123249, term123249.getClass(), "playerRating", -1003987169);
        setIntField(term123249, term123249.getClass(), "highestRating", -712530596);
        setIntField(term123249, term123249.getClass(), "rankAuthTailId", 1421637009);
        setField(term123249, term123249.getClass(), "eventWatchedDate", "FaJjdWrmzf");
        setField(term123249, term123249.getClass(), "webLimitDate", "qBRgIZjugc");
        setIntField(term123249, term123249.getClass(), "challengeTrackPhase", 1360807458);
        setIntField(term123249, term123249.getClass(), "firstPlayBits", -317598611);
        setField(term123249, term123249.getClass(), "lastPlayDate", "ZPnUGVLyiF");
        setIntField(term123249, term123249.getClass(), "lastPlaceId", -1206911737);
        setField(term123249, term123249.getClass(), "lastPlaceName", "iGWKoojIzf");
        setIntField(term123249, term123249.getClass(), "lastRegionId", -265778643);
        setField(term123249, term123249.getClass(), "lastRegionName", "hBwCfmunWp");
        setField(term123249, term123249.getClass(), "lastClientId", "dEmUNxEaGp");
        setField(term123249, term123249.getClass(), "lastCountryCode", "FiihXkdDjE");
        setIntField(term123249, term123249.getClass(), "eventPoint", 1311510289);
        setIntField(term123249, term123249.getClass(), "totalLv", 377078676);
        setIntField(term123249, term123249.getClass(), "lastLoginBonusDay", -1162238383);
        setIntField(term123249, term123249.getClass(), "lastSurvivalBonusDay", 1991797348);
        setIntField(term123249, term123249.getClass(), "loginBonusLv", -1606878866);
        setField(term123247, term123247.getClass(), "user", term123249);
        setIntField(term123247, term123247.getClass(), "orderId", -1878957947);
        setLongField(term123247, term123247.getClass(), "sortNumber", 5801400276670793406L);
        setIntField(term123247, term123247.getClass(), "placeId", 1297585470);
        setField(term123247, term123247.getClass(), "placeName", "ttkSFEAzwY");
        setField(term123247, term123247.getClass(), "country", "ZTUqSMjJHU");
        setIntField(term123247, term123247.getClass(), "regionId", 1699696518);
        setField(term123247, term123247.getClass(), "playDate", "TAvUGVCPaa");
        setField(term123247, term123247.getClass(), "userPlayDate", "oacMptGUKE");
        setIntField(term123247, term123247.getClass(), "musicId", 1862321738);
        setIntField(term123247, term123247.getClass(), "level", -2033071457);
        setIntField(term123247, term123247.getClass(), "gameMode", 893651267);
        setIntField(term123247, term123247.getClass(), "rivalNum", 857362843);
        setIntField(term123247, term123247.getClass(), "track", 724145317);
        setIntField(term123247, term123247.getClass(), "eventId", -986993323);
        setBooleanField(term123247, term123247.getClass(), "isFreeToPlay", true);
        setIntField(term123247, term123247.getClass(), "playerRating", 1997228827);
        setLongField(term123247, term123247.getClass(), "playedUserId1", 750257143483156761L);
        setField(term123247, term123247.getClass(), "playedUserName1", "vjVwvYdNhl");
        setIntField(term123247, term123247.getClass(), "playedMusicLevel1", 222278312);
        setLongField(term123247, term123247.getClass(), "playedUserId2", -1357354750773482244L);
        setField(term123247, term123247.getClass(), "playedUserName2", "sqJqznmMco");
        setIntField(term123247, term123247.getClass(), "playedMusicLevel2", 1345586536);
        setLongField(term123247, term123247.getClass(), "playedUserId3", -1493241070032348830L);
        setField(term123247, term123247.getClass(), "playedUserName3", "ZufWIAjLXm");
        setIntField(term123247, term123247.getClass(), "playedMusicLevel3", -1883388147);
        setIntField(term123247, term123247.getClass(), "achievement", 1671689178);
        setIntField(term123247, term123247.getClass(), "score", -434038223);
        setIntField(term123247, term123247.getClass(), "tapScore", -1160303977);
        setIntField(term123247, term123247.getClass(), "holdScore", -1616741813);
        setIntField(term123247, term123247.getClass(), "slideScore", -553905854);
        setIntField(term123247, term123247.getClass(), "breakScore", -1551399681);
        setIntField(term123247, term123247.getClass(), "syncRate", -875579962);
        setIntField(term123247, term123247.getClass(), "vsWin", -2092774130);
        setBooleanField(term123247, term123247.getClass(), "isAllPerfect", false);
        setIntField(term123247, term123247.getClass(), "fullCombo", -1169966252);
        setIntField(term123247, term123247.getClass(), "maxFever", -818418397);
        setIntField(term123247, term123247.getClass(), "maxCombo", -2117133876);
        setIntField(term123247, term123247.getClass(), "tapPerfect", -1419806086);
        setIntField(term123247, term123247.getClass(), "tapGreat", -506269910);
        setIntField(term123247, term123247.getClass(), "tapGood", 937160250);
        setIntField(term123247, term123247.getClass(), "tapBad", 1724814262);
        setIntField(term123247, term123247.getClass(), "holdPerfect", -362349898);
        setIntField(term123247, term123247.getClass(), "holdGreat", -569261309);
        setIntField(term123247, term123247.getClass(), "holdGood", -853939727);
        setIntField(term123247, term123247.getClass(), "holdBad", 416632574);
        setIntField(term123247, term123247.getClass(), "slidePerfect", 759801111);
        setIntField(term123247, term123247.getClass(), "slideGreat", -844675169);
        setIntField(term123247, term123247.getClass(), "slideGood", -714313525);
        setIntField(term123247, term123247.getClass(), "slideBad", 1266686205);
        setIntField(term123247, term123247.getClass(), "breakPerfect", 342577277);
        setIntField(term123247, term123247.getClass(), "breakGreat", 782543565);
        setIntField(term123247, term123247.getClass(), "breakGood", -1895763167);
        setIntField(term123247, term123247.getClass(), "breakBad", 25974685);
        setBooleanField(term123247, term123247.getClass(), "isTrackSkip", false);
        setBooleanField(term123247, term123247.getClass(), "isHighScore", false);
        setBooleanField(term123247, term123247.getClass(), "isChallengeTrack", true);
        setIntField(term123247, term123247.getClass(), "challengeLife", -748415491);
        setIntField(term123247, term123247.getClass(), "challengeRemain", -106467519);
        setIntField(term123247, term123247.getClass(), "isAllPerfectPlus", -891158934);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayedMusicLevel2", argTypes, term123247, args);
    }

};


