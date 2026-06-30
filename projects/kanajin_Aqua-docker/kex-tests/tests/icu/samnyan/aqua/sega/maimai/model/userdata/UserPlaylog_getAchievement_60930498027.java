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

public class UserPlaylog_getAchievement_60930498027 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term125135;

    public UserPlaylog_getAchievement_60930498027() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term125141 = new Long(6351887424140565471L);
        term125135 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term125137 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term125139 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term125155 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term125156 = newInstance(Class.forName("java.time.LocalDate"));
        Object term125160 = newInstance(Class.forName("java.time.LocalTime"));
        Object term125165 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term125166 = newInstance(Class.forName("java.time.LocalDate"));
        Object term125170 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term125135, term125135.getClass(), "id", -5511482978305240721L);
        setLongField(term125137, term125137.getClass(), "id", 7004919285972689886L);
        setLongField(term125139, term125139.getClass(), "id", 7099191052876902273L);
        setField(term125139, term125139.getClass(), "extId", term125141);
        setField(term125139, term125139.getClass(), "luid", "rfJbISvNQS");
        setIntField(term125156, term125156.getClass(), "year", 2014);
        setShortField(term125156, term125156.getClass(), "month", (short) 2);
        setShortField(term125156, term125156.getClass(), "day", (short) 2);
        setField(term125155, term125155.getClass(), "date", term125156);
        setByteField(term125160, term125160.getClass(), "hour", (byte) 17);
        setByteField(term125160, term125160.getClass(), "minute", (byte) 45);
        setByteField(term125160, term125160.getClass(), "second", (byte) 37);
        setIntField(term125160, term125160.getClass(), "nano", 147840174);
        setField(term125155, term125155.getClass(), "time", term125160);
        setField(term125139, term125139.getClass(), "registerTime", term125155);
        setIntField(term125166, term125166.getClass(), "year", 2023);
        setShortField(term125166, term125166.getClass(), "month", (short) 4);
        setShortField(term125166, term125166.getClass(), "day", (short) 27);
        setField(term125165, term125165.getClass(), "date", term125166);
        setByteField(term125170, term125170.getClass(), "hour", (byte) 11);
        setByteField(term125170, term125170.getClass(), "minute", (byte) 41);
        setByteField(term125170, term125170.getClass(), "second", (byte) 10);
        setIntField(term125170, term125170.getClass(), "nano", 59265345);
        setField(term125165, term125165.getClass(), "time", term125170);
        setField(term125139, term125139.getClass(), "accessTime", term125165);
        setField(term125137, term125137.getClass(), "card", term125139);
        setIntField(term125137, term125137.getClass(), "lastDataVersion", -1051326797);
        setField(term125137, term125137.getClass(), "userName", "SoQIwZITjf");
        setIntField(term125137, term125137.getClass(), "point", -694443859);
        setIntField(term125137, term125137.getClass(), "totalPoint", -1566825264);
        setIntField(term125137, term125137.getClass(), "iconId", 364041118);
        setIntField(term125137, term125137.getClass(), "nameplateId", -1797543289);
        setIntField(term125137, term125137.getClass(), "frameId", -73122887);
        setIntField(term125137, term125137.getClass(), "trophyId", -65424483);
        setIntField(term125137, term125137.getClass(), "playCount", 1974117816);
        setIntField(term125137, term125137.getClass(), "playVsCount", 463127264);
        setIntField(term125137, term125137.getClass(), "playSyncCount", -787419032);
        setIntField(term125137, term125137.getClass(), "winCount", 992513563);
        setIntField(term125137, term125137.getClass(), "helpCount", 1574814985);
        setIntField(term125137, term125137.getClass(), "comboCount", -324668111);
        setIntField(term125137, term125137.getClass(), "feverCount", 1556199811);
        setIntField(term125137, term125137.getClass(), "totalHiScore", 1170381399);
        setIntField(term125137, term125137.getClass(), "totalEasyHighScore", 2051375168);
        setIntField(term125137, term125137.getClass(), "totalBasicHighScore", 1951565709);
        setIntField(term125137, term125137.getClass(), "totalAdvancedHighScore", -609869128);
        setIntField(term125137, term125137.getClass(), "totalExpertHighScore", -1798058557);
        setIntField(term125137, term125137.getClass(), "totalMasterHighScore", 1566465773);
        setIntField(term125137, term125137.getClass(), "totalReMasterHighScore", -319806392);
        setIntField(term125137, term125137.getClass(), "totalHighSync", 1425075560);
        setIntField(term125137, term125137.getClass(), "totalEasySync", 314430334);
        setIntField(term125137, term125137.getClass(), "totalBasicSync", -1001978760);
        setIntField(term125137, term125137.getClass(), "totalAdvancedSync", -255413282);
        setIntField(term125137, term125137.getClass(), "totalExpertSync", 1797303999);
        setIntField(term125137, term125137.getClass(), "totalMasterSync", -327593257);
        setIntField(term125137, term125137.getClass(), "totalReMasterSync", 16109140);
        setIntField(term125137, term125137.getClass(), "playerRating", -822251246);
        setIntField(term125137, term125137.getClass(), "highestRating", -408175867);
        setIntField(term125137, term125137.getClass(), "rankAuthTailId", 1218877971);
        setField(term125137, term125137.getClass(), "eventWatchedDate", "MuFCHnASsR");
        setField(term125137, term125137.getClass(), "webLimitDate", "lTGjdlngGR");
        setIntField(term125137, term125137.getClass(), "challengeTrackPhase", 1248698741);
        setIntField(term125137, term125137.getClass(), "firstPlayBits", 563911514);
        setField(term125137, term125137.getClass(), "lastPlayDate", "VXtvOjnEqD");
        setIntField(term125137, term125137.getClass(), "lastPlaceId", 1278145075);
        setField(term125137, term125137.getClass(), "lastPlaceName", "CvLRyPNOVI");
        setIntField(term125137, term125137.getClass(), "lastRegionId", 347582830);
        setField(term125137, term125137.getClass(), "lastRegionName", "kGkLTNoGnp");
        setField(term125137, term125137.getClass(), "lastClientId", "CptQjqRnUi");
        setField(term125137, term125137.getClass(), "lastCountryCode", "gFKwlpZWQn");
        setIntField(term125137, term125137.getClass(), "eventPoint", -462578945);
        setIntField(term125137, term125137.getClass(), "totalLv", -1978832006);
        setIntField(term125137, term125137.getClass(), "lastLoginBonusDay", -907787831);
        setIntField(term125137, term125137.getClass(), "lastSurvivalBonusDay", 1652169311);
        setIntField(term125137, term125137.getClass(), "loginBonusLv", -6383553);
        setField(term125135, term125135.getClass(), "user", term125137);
        setIntField(term125135, term125135.getClass(), "orderId", -107860370);
        setLongField(term125135, term125135.getClass(), "sortNumber", 4098126979899957789L);
        setIntField(term125135, term125135.getClass(), "placeId", -2028015650);
        setField(term125135, term125135.getClass(), "placeName", "zkXBYRvjpo");
        setField(term125135, term125135.getClass(), "country", "nmebweybpn");
        setIntField(term125135, term125135.getClass(), "regionId", 937869088);
        setField(term125135, term125135.getClass(), "playDate", "rRiUyNVzoJ");
        setField(term125135, term125135.getClass(), "userPlayDate", "IpeZajjVYM");
        setIntField(term125135, term125135.getClass(), "musicId", 1274857950);
        setIntField(term125135, term125135.getClass(), "level", -1368741236);
        setIntField(term125135, term125135.getClass(), "gameMode", -1881603208);
        setIntField(term125135, term125135.getClass(), "rivalNum", 209901165);
        setIntField(term125135, term125135.getClass(), "track", 1483392595);
        setIntField(term125135, term125135.getClass(), "eventId", -1560857878);
        setBooleanField(term125135, term125135.getClass(), "isFreeToPlay", true);
        setIntField(term125135, term125135.getClass(), "playerRating", 1128160797);
        setLongField(term125135, term125135.getClass(), "playedUserId1", 1429711781003863063L);
        setField(term125135, term125135.getClass(), "playedUserName1", "ZZMugYyPLU");
        setIntField(term125135, term125135.getClass(), "playedMusicLevel1", 1392820107);
        setLongField(term125135, term125135.getClass(), "playedUserId2", -1033267581061931547L);
        setField(term125135, term125135.getClass(), "playedUserName2", "UknzoUqzIv");
        setIntField(term125135, term125135.getClass(), "playedMusicLevel2", -1757491303);
        setLongField(term125135, term125135.getClass(), "playedUserId3", 8918321414047974185L);
        setField(term125135, term125135.getClass(), "playedUserName3", "xctmTnBQin");
        setIntField(term125135, term125135.getClass(), "playedMusicLevel3", -999355140);
        setIntField(term125135, term125135.getClass(), "achievement", 1775721129);
        setIntField(term125135, term125135.getClass(), "score", 2006719115);
        setIntField(term125135, term125135.getClass(), "tapScore", -1083031518);
        setIntField(term125135, term125135.getClass(), "holdScore", -119206782);
        setIntField(term125135, term125135.getClass(), "slideScore", 1472071010);
        setIntField(term125135, term125135.getClass(), "breakScore", 1265410255);
        setIntField(term125135, term125135.getClass(), "syncRate", 2511626);
        setIntField(term125135, term125135.getClass(), "vsWin", 44009888);
        setBooleanField(term125135, term125135.getClass(), "isAllPerfect", false);
        setIntField(term125135, term125135.getClass(), "fullCombo", -513392311);
        setIntField(term125135, term125135.getClass(), "maxFever", 1354727885);
        setIntField(term125135, term125135.getClass(), "maxCombo", 1202764688);
        setIntField(term125135, term125135.getClass(), "tapPerfect", 1198986574);
        setIntField(term125135, term125135.getClass(), "tapGreat", 1496477362);
        setIntField(term125135, term125135.getClass(), "tapGood", 694634515);
        setIntField(term125135, term125135.getClass(), "tapBad", -1684684863);
        setIntField(term125135, term125135.getClass(), "holdPerfect", -1337880590);
        setIntField(term125135, term125135.getClass(), "holdGreat", -40671465);
        setIntField(term125135, term125135.getClass(), "holdGood", 906922634);
        setIntField(term125135, term125135.getClass(), "holdBad", 50121333);
        setIntField(term125135, term125135.getClass(), "slidePerfect", 1552254538);
        setIntField(term125135, term125135.getClass(), "slideGreat", -66330072);
        setIntField(term125135, term125135.getClass(), "slideGood", 1911156222);
        setIntField(term125135, term125135.getClass(), "slideBad", -595089281);
        setIntField(term125135, term125135.getClass(), "breakPerfect", 336328847);
        setIntField(term125135, term125135.getClass(), "breakGreat", -1839425499);
        setIntField(term125135, term125135.getClass(), "breakGood", -1228260643);
        setIntField(term125135, term125135.getClass(), "breakBad", 574874911);
        setBooleanField(term125135, term125135.getClass(), "isTrackSkip", true);
        setBooleanField(term125135, term125135.getClass(), "isHighScore", false);
        setBooleanField(term125135, term125135.getClass(), "isChallengeTrack", true);
        setIntField(term125135, term125135.getClass(), "challengeLife", -526061609);
        setIntField(term125135, term125135.getClass(), "challengeRemain", -1784695440);
        setIntField(term125135, term125135.getClass(), "isAllPerfectPlus", -770471106);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAchievement", argTypes, term125135, args);
    }

};


