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

public class UserPlaylog_setTapPerfect_1366631613100 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3986437;
     Object term3986749;

    public UserPlaylog_setTapPerfect_1366631613100() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3986443 = new Long(7585912269663848364L);
        term3986437 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term3986439 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term3986441 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term3986457 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3986458 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3986462 = newInstance(Class.forName("java.time.LocalTime"));
        Object term3986467 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3986468 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3986472 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term3986437, term3986437.getClass(), "id", -9028871813448261145L);
        setLongField(term3986439, term3986439.getClass(), "id", 5031517220299149068L);
        setLongField(term3986441, term3986441.getClass(), "id", -8056663911236516382L);
        setField(term3986441, term3986441.getClass(), "extId", term3986443);
        setField(term3986441, term3986441.getClass(), "luid", "bMLtkCaBTe");
        setIntField(term3986458, term3986458.getClass(), "year", 2014);
        setShortField(term3986458, term3986458.getClass(), "month", (short) 6);
        setShortField(term3986458, term3986458.getClass(), "day", (short) 9);
        setField(term3986457, term3986457.getClass(), "date", term3986458);
        setByteField(term3986462, term3986462.getClass(), "hour", (byte) 16);
        setByteField(term3986462, term3986462.getClass(), "minute", (byte) 44);
        setByteField(term3986462, term3986462.getClass(), "second", (byte) 36);
        setIntField(term3986462, term3986462.getClass(), "nano", 608959157);
        setField(term3986457, term3986457.getClass(), "time", term3986462);
        setField(term3986441, term3986441.getClass(), "registerTime", term3986457);
        setIntField(term3986468, term3986468.getClass(), "year", 2029);
        setShortField(term3986468, term3986468.getClass(), "month", (short) 11);
        setShortField(term3986468, term3986468.getClass(), "day", (short) 3);
        setField(term3986467, term3986467.getClass(), "date", term3986468);
        setByteField(term3986472, term3986472.getClass(), "hour", (byte) 18);
        setByteField(term3986472, term3986472.getClass(), "minute", (byte) 13);
        setByteField(term3986472, term3986472.getClass(), "second", (byte) 27);
        setIntField(term3986472, term3986472.getClass(), "nano", 313178599);
        setField(term3986467, term3986467.getClass(), "time", term3986472);
        setField(term3986441, term3986441.getClass(), "accessTime", term3986467);
        setField(term3986439, term3986439.getClass(), "card", term3986441);
        setIntField(term3986439, term3986439.getClass(), "lastDataVersion", -1118810488);
        setField(term3986439, term3986439.getClass(), "userName", "wUZySLpyvr");
        setIntField(term3986439, term3986439.getClass(), "point", 1676411289);
        setIntField(term3986439, term3986439.getClass(), "totalPoint", 192882165);
        setIntField(term3986439, term3986439.getClass(), "iconId", -1930552685);
        setIntField(term3986439, term3986439.getClass(), "nameplateId", -322528870);
        setIntField(term3986439, term3986439.getClass(), "frameId", 502346331);
        setIntField(term3986439, term3986439.getClass(), "trophyId", -1588185728);
        setIntField(term3986439, term3986439.getClass(), "playCount", 1853565766);
        setIntField(term3986439, term3986439.getClass(), "playVsCount", -1134851755);
        setIntField(term3986439, term3986439.getClass(), "playSyncCount", -539219965);
        setIntField(term3986439, term3986439.getClass(), "winCount", -1952487576);
        setIntField(term3986439, term3986439.getClass(), "helpCount", -1924295402);
        setIntField(term3986439, term3986439.getClass(), "comboCount", 1132914335);
        setIntField(term3986439, term3986439.getClass(), "feverCount", 1948786505);
        setIntField(term3986439, term3986439.getClass(), "totalHiScore", 1518115229);
        setIntField(term3986439, term3986439.getClass(), "totalEasyHighScore", 1847717796);
        setIntField(term3986439, term3986439.getClass(), "totalBasicHighScore", -1609848157);
        setIntField(term3986439, term3986439.getClass(), "totalAdvancedHighScore", -1375135263);
        setIntField(term3986439, term3986439.getClass(), "totalExpertHighScore", -306107654);
        setIntField(term3986439, term3986439.getClass(), "totalMasterHighScore", -1664649081);
        setIntField(term3986439, term3986439.getClass(), "totalReMasterHighScore", 2117842406);
        setIntField(term3986439, term3986439.getClass(), "totalHighSync", 1663879681);
        setIntField(term3986439, term3986439.getClass(), "totalEasySync", -1252074894);
        setIntField(term3986439, term3986439.getClass(), "totalBasicSync", -957098893);
        setIntField(term3986439, term3986439.getClass(), "totalAdvancedSync", 165110936);
        setIntField(term3986439, term3986439.getClass(), "totalExpertSync", 1872769569);
        setIntField(term3986439, term3986439.getClass(), "totalMasterSync", -396040822);
        setIntField(term3986439, term3986439.getClass(), "totalReMasterSync", 120536728);
        setIntField(term3986439, term3986439.getClass(), "playerRating", 1868665900);
        setIntField(term3986439, term3986439.getClass(), "highestRating", -1073152767);
        setIntField(term3986439, term3986439.getClass(), "rankAuthTailId", 3021318);
        setField(term3986439, term3986439.getClass(), "eventWatchedDate", "pCdFRwYHHt");
        setField(term3986439, term3986439.getClass(), "webLimitDate", "wdKbgBJlsS");
        setIntField(term3986439, term3986439.getClass(), "challengeTrackPhase", 625592903);
        setIntField(term3986439, term3986439.getClass(), "firstPlayBits", 1647701546);
        setField(term3986439, term3986439.getClass(), "lastPlayDate", "lWHlrEWvVJ");
        setIntField(term3986439, term3986439.getClass(), "lastPlaceId", 1137562096);
        setField(term3986439, term3986439.getClass(), "lastPlaceName", "yITqEMGowD");
        setIntField(term3986439, term3986439.getClass(), "lastRegionId", -1242444057);
        setField(term3986439, term3986439.getClass(), "lastRegionName", "RsbTAGnaKR");
        setField(term3986439, term3986439.getClass(), "lastClientId", "acmPlqigbw");
        setField(term3986439, term3986439.getClass(), "lastCountryCode", "lKhuokWZoP");
        setIntField(term3986439, term3986439.getClass(), "eventPoint", -441410853);
        setIntField(term3986439, term3986439.getClass(), "totalLv", -1304916925);
        setIntField(term3986439, term3986439.getClass(), "lastLoginBonusDay", 280570186);
        setIntField(term3986439, term3986439.getClass(), "lastSurvivalBonusDay", -608765804);
        setIntField(term3986439, term3986439.getClass(), "loginBonusLv", -2063321642);
        setField(term3986437, term3986437.getClass(), "user", term3986439);
        setIntField(term3986437, term3986437.getClass(), "orderId", -372029019);
        setLongField(term3986437, term3986437.getClass(), "sortNumber", 3283987296686507746L);
        setIntField(term3986437, term3986437.getClass(), "placeId", 274097473);
        setField(term3986437, term3986437.getClass(), "placeName", "dWSKPkXGbr");
        setField(term3986437, term3986437.getClass(), "country", "XmMxyCPEaf");
        setIntField(term3986437, term3986437.getClass(), "regionId", -1645753258);
        setField(term3986437, term3986437.getClass(), "playDate", "ujwScySFGh");
        setField(term3986437, term3986437.getClass(), "userPlayDate", "evYkSVKpgD");
        setIntField(term3986437, term3986437.getClass(), "musicId", -1883286711);
        setIntField(term3986437, term3986437.getClass(), "level", -748268143);
        setIntField(term3986437, term3986437.getClass(), "gameMode", 1828795104);
        setIntField(term3986437, term3986437.getClass(), "rivalNum", -1414027511);
        setIntField(term3986437, term3986437.getClass(), "track", 1758449785);
        setIntField(term3986437, term3986437.getClass(), "eventId", 429316906);
        setBooleanField(term3986437, term3986437.getClass(), "isFreeToPlay", true);
        setIntField(term3986437, term3986437.getClass(), "playerRating", 228292429);
        setLongField(term3986437, term3986437.getClass(), "playedUserId1", 6579652898402568059L);
        setField(term3986437, term3986437.getClass(), "playedUserName1", "aHYMLLUaHv");
        setIntField(term3986437, term3986437.getClass(), "playedMusicLevel1", 158608144);
        setLongField(term3986437, term3986437.getClass(), "playedUserId2", 3250913006892052566L);
        setField(term3986437, term3986437.getClass(), "playedUserName2", "EnOfcdbnnF");
        setIntField(term3986437, term3986437.getClass(), "playedMusicLevel2", -335959873);
        setLongField(term3986437, term3986437.getClass(), "playedUserId3", 5840186822876001527L);
        setField(term3986437, term3986437.getClass(), "playedUserName3", "QmRhbBaoIF");
        setIntField(term3986437, term3986437.getClass(), "playedMusicLevel3", -2126523762);
        setIntField(term3986437, term3986437.getClass(), "achievement", -1285665458);
        setIntField(term3986437, term3986437.getClass(), "score", -1275737719);
        setIntField(term3986437, term3986437.getClass(), "tapScore", -1275717456);
        setIntField(term3986437, term3986437.getClass(), "holdScore", 1534480170);
        setIntField(term3986437, term3986437.getClass(), "slideScore", 1904137998);
        setIntField(term3986437, term3986437.getClass(), "breakScore", -17618239);
        setIntField(term3986437, term3986437.getClass(), "syncRate", 381636476);
        setIntField(term3986437, term3986437.getClass(), "vsWin", 861134665);
        setBooleanField(term3986437, term3986437.getClass(), "isAllPerfect", false);
        setIntField(term3986437, term3986437.getClass(), "fullCombo", -223877089);
        setIntField(term3986437, term3986437.getClass(), "maxFever", -1405212182);
        setIntField(term3986437, term3986437.getClass(), "maxCombo", -157592933);
        setIntField(term3986437, term3986437.getClass(), "tapPerfect", -1420898066);
        setIntField(term3986437, term3986437.getClass(), "tapGreat", 1356188610);
        setIntField(term3986437, term3986437.getClass(), "tapGood", 120084491);
        setIntField(term3986437, term3986437.getClass(), "tapBad", 176093093);
        setIntField(term3986437, term3986437.getClass(), "holdPerfect", 1376874468);
        setIntField(term3986437, term3986437.getClass(), "holdGreat", -1456362650);
        setIntField(term3986437, term3986437.getClass(), "holdGood", -256361929);
        setIntField(term3986437, term3986437.getClass(), "holdBad", 1452021889);
        setIntField(term3986437, term3986437.getClass(), "slidePerfect", -1673621229);
        setIntField(term3986437, term3986437.getClass(), "slideGreat", 1398692206);
        setIntField(term3986437, term3986437.getClass(), "slideGood", 1312274177);
        setIntField(term3986437, term3986437.getClass(), "slideBad", -1275304510);
        setIntField(term3986437, term3986437.getClass(), "breakPerfect", 1755512596);
        setIntField(term3986437, term3986437.getClass(), "breakGreat", 41976887);
        setIntField(term3986437, term3986437.getClass(), "breakGood", -147364050);
        setIntField(term3986437, term3986437.getClass(), "breakBad", -1594066099);
        setBooleanField(term3986437, term3986437.getClass(), "isTrackSkip", false);
        setBooleanField(term3986437, term3986437.getClass(), "isHighScore", true);
        setBooleanField(term3986437, term3986437.getClass(), "isChallengeTrack", true);
        setIntField(term3986437, term3986437.getClass(), "challengeLife", -1808229370);
        setIntField(term3986437, term3986437.getClass(), "challengeRemain", -1570204327);
        setIntField(term3986437, term3986437.getClass(), "isAllPerfectPlus", 1235860908);
        term3986749 = new Integer(588323646);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term3986749;
        callMethod(klass, "setTapPerfect", argTypes, term3986437, args);
    }

};


