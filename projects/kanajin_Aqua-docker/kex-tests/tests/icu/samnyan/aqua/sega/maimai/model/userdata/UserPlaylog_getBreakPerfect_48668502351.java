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

public class UserPlaylog_getBreakPerfect_48668502351 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term136463;

    public UserPlaylog_getBreakPerfect_48668502351() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term136469 = new Long(-8992404862613425105L);
        term136463 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term136465 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term136467 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term136483 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term136484 = newInstance(Class.forName("java.time.LocalDate"));
        Object term136488 = newInstance(Class.forName("java.time.LocalTime"));
        Object term136493 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term136494 = newInstance(Class.forName("java.time.LocalDate"));
        Object term136498 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term136463, term136463.getClass(), "id", 2727169839819823552L);
        setLongField(term136465, term136465.getClass(), "id", -6164517614137158832L);
        setLongField(term136467, term136467.getClass(), "id", 1093252632013547881L);
        setField(term136467, term136467.getClass(), "extId", term136469);
        setField(term136467, term136467.getClass(), "luid", "bQNBqTrhUF");
        setIntField(term136484, term136484.getClass(), "year", 2025);
        setShortField(term136484, term136484.getClass(), "month", (short) 5);
        setShortField(term136484, term136484.getClass(), "day", (short) 7);
        setField(term136483, term136483.getClass(), "date", term136484);
        setByteField(term136488, term136488.getClass(), "hour", (byte) 9);
        setByteField(term136488, term136488.getClass(), "minute", (byte) 7);
        setByteField(term136488, term136488.getClass(), "second", (byte) 58);
        setIntField(term136488, term136488.getClass(), "nano", 974291074);
        setField(term136483, term136483.getClass(), "time", term136488);
        setField(term136467, term136467.getClass(), "registerTime", term136483);
        setIntField(term136494, term136494.getClass(), "year", 2026);
        setShortField(term136494, term136494.getClass(), "month", (short) 9);
        setShortField(term136494, term136494.getClass(), "day", (short) 29);
        setField(term136493, term136493.getClass(), "date", term136494);
        setByteField(term136498, term136498.getClass(), "hour", (byte) 18);
        setByteField(term136498, term136498.getClass(), "minute", (byte) 42);
        setByteField(term136498, term136498.getClass(), "second", (byte) 40);
        setIntField(term136498, term136498.getClass(), "nano", 611001144);
        setField(term136493, term136493.getClass(), "time", term136498);
        setField(term136467, term136467.getClass(), "accessTime", term136493);
        setField(term136465, term136465.getClass(), "card", term136467);
        setIntField(term136465, term136465.getClass(), "lastDataVersion", 117481309);
        setField(term136465, term136465.getClass(), "userName", "pNNhlLiKcO");
        setIntField(term136465, term136465.getClass(), "point", 1993168996);
        setIntField(term136465, term136465.getClass(), "totalPoint", 951239293);
        setIntField(term136465, term136465.getClass(), "iconId", -255324540);
        setIntField(term136465, term136465.getClass(), "nameplateId", 1090348247);
        setIntField(term136465, term136465.getClass(), "frameId", 1680192191);
        setIntField(term136465, term136465.getClass(), "trophyId", 295190981);
        setIntField(term136465, term136465.getClass(), "playCount", -1492427400);
        setIntField(term136465, term136465.getClass(), "playVsCount", 884288171);
        setIntField(term136465, term136465.getClass(), "playSyncCount", 1319605673);
        setIntField(term136465, term136465.getClass(), "winCount", -1516059020);
        setIntField(term136465, term136465.getClass(), "helpCount", 397981508);
        setIntField(term136465, term136465.getClass(), "comboCount", -1333512086);
        setIntField(term136465, term136465.getClass(), "feverCount", -1753703153);
        setIntField(term136465, term136465.getClass(), "totalHiScore", 1023725891);
        setIntField(term136465, term136465.getClass(), "totalEasyHighScore", -980165954);
        setIntField(term136465, term136465.getClass(), "totalBasicHighScore", -1137562740);
        setIntField(term136465, term136465.getClass(), "totalAdvancedHighScore", -1654532760);
        setIntField(term136465, term136465.getClass(), "totalExpertHighScore", -106292001);
        setIntField(term136465, term136465.getClass(), "totalMasterHighScore", 1380387716);
        setIntField(term136465, term136465.getClass(), "totalReMasterHighScore", -1881487472);
        setIntField(term136465, term136465.getClass(), "totalHighSync", 572568329);
        setIntField(term136465, term136465.getClass(), "totalEasySync", -1839831897);
        setIntField(term136465, term136465.getClass(), "totalBasicSync", 96586612);
        setIntField(term136465, term136465.getClass(), "totalAdvancedSync", -523164569);
        setIntField(term136465, term136465.getClass(), "totalExpertSync", -1627411785);
        setIntField(term136465, term136465.getClass(), "totalMasterSync", 1898140596);
        setIntField(term136465, term136465.getClass(), "totalReMasterSync", -1102760096);
        setIntField(term136465, term136465.getClass(), "playerRating", -1071849710);
        setIntField(term136465, term136465.getClass(), "highestRating", -1996013699);
        setIntField(term136465, term136465.getClass(), "rankAuthTailId", 1715462169);
        setField(term136465, term136465.getClass(), "eventWatchedDate", "hyXBBcBogW");
        setField(term136465, term136465.getClass(), "webLimitDate", "ZkdrWdXgOr");
        setIntField(term136465, term136465.getClass(), "challengeTrackPhase", 311229186);
        setIntField(term136465, term136465.getClass(), "firstPlayBits", 1845964937);
        setField(term136465, term136465.getClass(), "lastPlayDate", "MaBKpYpsjS");
        setIntField(term136465, term136465.getClass(), "lastPlaceId", -120481344);
        setField(term136465, term136465.getClass(), "lastPlaceName", "kojhIAlLyo");
        setIntField(term136465, term136465.getClass(), "lastRegionId", -718039445);
        setField(term136465, term136465.getClass(), "lastRegionName", "qbdOdimzOh");
        setField(term136465, term136465.getClass(), "lastClientId", "DMjvFejbDc");
        setField(term136465, term136465.getClass(), "lastCountryCode", "LsszPdpMvX");
        setIntField(term136465, term136465.getClass(), "eventPoint", 587141165);
        setIntField(term136465, term136465.getClass(), "totalLv", -1389883682);
        setIntField(term136465, term136465.getClass(), "lastLoginBonusDay", -1743258736);
        setIntField(term136465, term136465.getClass(), "lastSurvivalBonusDay", 101489027);
        setIntField(term136465, term136465.getClass(), "loginBonusLv", 1052491077);
        setField(term136463, term136463.getClass(), "user", term136465);
        setIntField(term136463, term136463.getClass(), "orderId", -1816019806);
        setLongField(term136463, term136463.getClass(), "sortNumber", 8773809312823881228L);
        setIntField(term136463, term136463.getClass(), "placeId", -256727488);
        setField(term136463, term136463.getClass(), "placeName", "YJYOluXjkb");
        setField(term136463, term136463.getClass(), "country", "NRsURcfaWn");
        setIntField(term136463, term136463.getClass(), "regionId", -1392027006);
        setField(term136463, term136463.getClass(), "playDate", "ykYKNlqHwA");
        setField(term136463, term136463.getClass(), "userPlayDate", "CaYUiktPks");
        setIntField(term136463, term136463.getClass(), "musicId", 1896515313);
        setIntField(term136463, term136463.getClass(), "level", -1908708729);
        setIntField(term136463, term136463.getClass(), "gameMode", -482802376);
        setIntField(term136463, term136463.getClass(), "rivalNum", -1498723051);
        setIntField(term136463, term136463.getClass(), "track", -1976039154);
        setIntField(term136463, term136463.getClass(), "eventId", 259116870);
        setBooleanField(term136463, term136463.getClass(), "isFreeToPlay", false);
        setIntField(term136463, term136463.getClass(), "playerRating", -537316856);
        setLongField(term136463, term136463.getClass(), "playedUserId1", 316148538598902256L);
        setField(term136463, term136463.getClass(), "playedUserName1", "xSNRqymNqF");
        setIntField(term136463, term136463.getClass(), "playedMusicLevel1", -1270342663);
        setLongField(term136463, term136463.getClass(), "playedUserId2", -3355803345734534021L);
        setField(term136463, term136463.getClass(), "playedUserName2", "rswcpmelQS");
        setIntField(term136463, term136463.getClass(), "playedMusicLevel2", -1077679386);
        setLongField(term136463, term136463.getClass(), "playedUserId3", 5579342693904906403L);
        setField(term136463, term136463.getClass(), "playedUserName3", "OyCqSonMpX");
        setIntField(term136463, term136463.getClass(), "playedMusicLevel3", 1168038339);
        setIntField(term136463, term136463.getClass(), "achievement", -1998903871);
        setIntField(term136463, term136463.getClass(), "score", -646766143);
        setIntField(term136463, term136463.getClass(), "tapScore", -2114100575);
        setIntField(term136463, term136463.getClass(), "holdScore", 1929896302);
        setIntField(term136463, term136463.getClass(), "slideScore", 1194666880);
        setIntField(term136463, term136463.getClass(), "breakScore", -19060265);
        setIntField(term136463, term136463.getClass(), "syncRate", 1142946811);
        setIntField(term136463, term136463.getClass(), "vsWin", 1119090923);
        setBooleanField(term136463, term136463.getClass(), "isAllPerfect", false);
        setIntField(term136463, term136463.getClass(), "fullCombo", -1831049142);
        setIntField(term136463, term136463.getClass(), "maxFever", 500481472);
        setIntField(term136463, term136463.getClass(), "maxCombo", 1189713463);
        setIntField(term136463, term136463.getClass(), "tapPerfect", -2124265740);
        setIntField(term136463, term136463.getClass(), "tapGreat", -1323987937);
        setIntField(term136463, term136463.getClass(), "tapGood", 1648984739);
        setIntField(term136463, term136463.getClass(), "tapBad", -943862445);
        setIntField(term136463, term136463.getClass(), "holdPerfect", 336759166);
        setIntField(term136463, term136463.getClass(), "holdGreat", 1874264137);
        setIntField(term136463, term136463.getClass(), "holdGood", 459893515);
        setIntField(term136463, term136463.getClass(), "holdBad", -2030419332);
        setIntField(term136463, term136463.getClass(), "slidePerfect", 1173366554);
        setIntField(term136463, term136463.getClass(), "slideGreat", 1141843700);
        setIntField(term136463, term136463.getClass(), "slideGood", -1254571797);
        setIntField(term136463, term136463.getClass(), "slideBad", 1516402627);
        setIntField(term136463, term136463.getClass(), "breakPerfect", -1450020194);
        setIntField(term136463, term136463.getClass(), "breakGreat", -2093580285);
        setIntField(term136463, term136463.getClass(), "breakGood", 1276267490);
        setIntField(term136463, term136463.getClass(), "breakBad", 1539388177);
        setBooleanField(term136463, term136463.getClass(), "isTrackSkip", false);
        setBooleanField(term136463, term136463.getClass(), "isHighScore", true);
        setBooleanField(term136463, term136463.getClass(), "isChallengeTrack", true);
        setIntField(term136463, term136463.getClass(), "challengeLife", -1014299388);
        setIntField(term136463, term136463.getClass(), "challengeRemain", 2074003232);
        setIntField(term136463, term136463.getClass(), "isAllPerfectPlus", 906827712);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBreakPerfect", argTypes, term136463, args);
    }

};


