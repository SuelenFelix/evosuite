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

public class UserPlaylog_getPlayedUserName3_126136062825 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term124191;

    public UserPlaylog_getPlayedUserName3_126136062825() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term124197 = new Long(2287785643837657068L);
        term124191 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term124193 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term124195 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term124211 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term124212 = newInstance(Class.forName("java.time.LocalDate"));
        Object term124216 = newInstance(Class.forName("java.time.LocalTime"));
        Object term124221 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term124222 = newInstance(Class.forName("java.time.LocalDate"));
        Object term124226 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term124191, term124191.getClass(), "id", -4179615237632495585L);
        setLongField(term124193, term124193.getClass(), "id", -2071004435163577830L);
        setLongField(term124195, term124195.getClass(), "id", 4083439166031950748L);
        setField(term124195, term124195.getClass(), "extId", term124197);
        setField(term124195, term124195.getClass(), "luid", "CssqWIyxap");
        setIntField(term124212, term124212.getClass(), "year", 2019);
        setShortField(term124212, term124212.getClass(), "month", (short) 3);
        setShortField(term124212, term124212.getClass(), "day", (short) 15);
        setField(term124211, term124211.getClass(), "date", term124212);
        setByteField(term124216, term124216.getClass(), "hour", (byte) 19);
        setByteField(term124216, term124216.getClass(), "minute", (byte) 20);
        setByteField(term124216, term124216.getClass(), "second", (byte) 17);
        setIntField(term124216, term124216.getClass(), "nano", 872983779);
        setField(term124211, term124211.getClass(), "time", term124216);
        setField(term124195, term124195.getClass(), "registerTime", term124211);
        setIntField(term124222, term124222.getClass(), "year", 2028);
        setShortField(term124222, term124222.getClass(), "month", (short) 10);
        setShortField(term124222, term124222.getClass(), "day", (short) 1);
        setField(term124221, term124221.getClass(), "date", term124222);
        setByteField(term124226, term124226.getClass(), "hour", (byte) 12);
        setByteField(term124226, term124226.getClass(), "minute", (byte) 47);
        setByteField(term124226, term124226.getClass(), "second", (byte) 33);
        setIntField(term124226, term124226.getClass(), "nano", 170475636);
        setField(term124221, term124221.getClass(), "time", term124226);
        setField(term124195, term124195.getClass(), "accessTime", term124221);
        setField(term124193, term124193.getClass(), "card", term124195);
        setIntField(term124193, term124193.getClass(), "lastDataVersion", -1266383288);
        setField(term124193, term124193.getClass(), "userName", "EtmaqZMoVN");
        setIntField(term124193, term124193.getClass(), "point", 657464621);
        setIntField(term124193, term124193.getClass(), "totalPoint", 535916307);
        setIntField(term124193, term124193.getClass(), "iconId", 1217567885);
        setIntField(term124193, term124193.getClass(), "nameplateId", -1677196593);
        setIntField(term124193, term124193.getClass(), "frameId", 1628523425);
        setIntField(term124193, term124193.getClass(), "trophyId", 270590291);
        setIntField(term124193, term124193.getClass(), "playCount", 1699156979);
        setIntField(term124193, term124193.getClass(), "playVsCount", 872536270);
        setIntField(term124193, term124193.getClass(), "playSyncCount", 1426868992);
        setIntField(term124193, term124193.getClass(), "winCount", -1911436409);
        setIntField(term124193, term124193.getClass(), "helpCount", -1246915365);
        setIntField(term124193, term124193.getClass(), "comboCount", -797491695);
        setIntField(term124193, term124193.getClass(), "feverCount", -2030749607);
        setIntField(term124193, term124193.getClass(), "totalHiScore", -1872053985);
        setIntField(term124193, term124193.getClass(), "totalEasyHighScore", -422300479);
        setIntField(term124193, term124193.getClass(), "totalBasicHighScore", -1821425052);
        setIntField(term124193, term124193.getClass(), "totalAdvancedHighScore", 1258372185);
        setIntField(term124193, term124193.getClass(), "totalExpertHighScore", -1942969820);
        setIntField(term124193, term124193.getClass(), "totalMasterHighScore", 1799543885);
        setIntField(term124193, term124193.getClass(), "totalReMasterHighScore", 1388414809);
        setIntField(term124193, term124193.getClass(), "totalHighSync", -1198202437);
        setIntField(term124193, term124193.getClass(), "totalEasySync", -2093092193);
        setIntField(term124193, term124193.getClass(), "totalBasicSync", 477971691);
        setIntField(term124193, term124193.getClass(), "totalAdvancedSync", 1118974024);
        setIntField(term124193, term124193.getClass(), "totalExpertSync", 603774719);
        setIntField(term124193, term124193.getClass(), "totalMasterSync", -417848261);
        setIntField(term124193, term124193.getClass(), "totalReMasterSync", -1825653861);
        setIntField(term124193, term124193.getClass(), "playerRating", 1158565526);
        setIntField(term124193, term124193.getClass(), "highestRating", 494749529);
        setIntField(term124193, term124193.getClass(), "rankAuthTailId", -1856844247);
        setField(term124193, term124193.getClass(), "eventWatchedDate", "mluXYJByNP");
        setField(term124193, term124193.getClass(), "webLimitDate", "kLMqANSDgO");
        setIntField(term124193, term124193.getClass(), "challengeTrackPhase", 1204731141);
        setIntField(term124193, term124193.getClass(), "firstPlayBits", -303280582);
        setField(term124193, term124193.getClass(), "lastPlayDate", "nStYnHGCom");
        setIntField(term124193, term124193.getClass(), "lastPlaceId", -630302996);
        setField(term124193, term124193.getClass(), "lastPlaceName", "gfqZitqjcH");
        setIntField(term124193, term124193.getClass(), "lastRegionId", -1137094845);
        setField(term124193, term124193.getClass(), "lastRegionName", "QfJOLCTCHY");
        setField(term124193, term124193.getClass(), "lastClientId", "yNQuuhZyAX");
        setField(term124193, term124193.getClass(), "lastCountryCode", "IqzRlGAXKQ");
        setIntField(term124193, term124193.getClass(), "eventPoint", -219496753);
        setIntField(term124193, term124193.getClass(), "totalLv", 1063790205);
        setIntField(term124193, term124193.getClass(), "lastLoginBonusDay", 618483255);
        setIntField(term124193, term124193.getClass(), "lastSurvivalBonusDay", 1986426483);
        setIntField(term124193, term124193.getClass(), "loginBonusLv", -97338829);
        setField(term124191, term124191.getClass(), "user", term124193);
        setIntField(term124191, term124191.getClass(), "orderId", 1961579264);
        setLongField(term124191, term124191.getClass(), "sortNumber", 4354307959269121855L);
        setIntField(term124191, term124191.getClass(), "placeId", -1701113649);
        setField(term124191, term124191.getClass(), "placeName", "XiytdmxGYa");
        setField(term124191, term124191.getClass(), "country", "xuWbTDWaJN");
        setIntField(term124191, term124191.getClass(), "regionId", 75746646);
        setField(term124191, term124191.getClass(), "playDate", "LvZCXbeNaa");
        setField(term124191, term124191.getClass(), "userPlayDate", "CaxKtuZUJI");
        setIntField(term124191, term124191.getClass(), "musicId", -215266357);
        setIntField(term124191, term124191.getClass(), "level", -519251709);
        setIntField(term124191, term124191.getClass(), "gameMode", 1024031566);
        setIntField(term124191, term124191.getClass(), "rivalNum", 1809869083);
        setIntField(term124191, term124191.getClass(), "track", 1866562735);
        setIntField(term124191, term124191.getClass(), "eventId", 1326832867);
        setBooleanField(term124191, term124191.getClass(), "isFreeToPlay", true);
        setIntField(term124191, term124191.getClass(), "playerRating", 1653843083);
        setLongField(term124191, term124191.getClass(), "playedUserId1", -4627619845164555164L);
        setField(term124191, term124191.getClass(), "playedUserName1", "wokzuoOQRu");
        setIntField(term124191, term124191.getClass(), "playedMusicLevel1", -2127993423);
        setLongField(term124191, term124191.getClass(), "playedUserId2", 3702843766990151556L);
        setField(term124191, term124191.getClass(), "playedUserName2", "jIVcJcAtbp");
        setIntField(term124191, term124191.getClass(), "playedMusicLevel2", -1138128703);
        setLongField(term124191, term124191.getClass(), "playedUserId3", 8588047499427599529L);
        setField(term124191, term124191.getClass(), "playedUserName3", "eugajHLhOv");
        setIntField(term124191, term124191.getClass(), "playedMusicLevel3", -1090810908);
        setIntField(term124191, term124191.getClass(), "achievement", -1060340214);
        setIntField(term124191, term124191.getClass(), "score", 1049390881);
        setIntField(term124191, term124191.getClass(), "tapScore", -130861498);
        setIntField(term124191, term124191.getClass(), "holdScore", -395878863);
        setIntField(term124191, term124191.getClass(), "slideScore", -168654922);
        setIntField(term124191, term124191.getClass(), "breakScore", 1714355511);
        setIntField(term124191, term124191.getClass(), "syncRate", -1848405319);
        setIntField(term124191, term124191.getClass(), "vsWin", 863171872);
        setBooleanField(term124191, term124191.getClass(), "isAllPerfect", true);
        setIntField(term124191, term124191.getClass(), "fullCombo", 424577741);
        setIntField(term124191, term124191.getClass(), "maxFever", 124462440);
        setIntField(term124191, term124191.getClass(), "maxCombo", -582145829);
        setIntField(term124191, term124191.getClass(), "tapPerfect", -1001580103);
        setIntField(term124191, term124191.getClass(), "tapGreat", 114200603);
        setIntField(term124191, term124191.getClass(), "tapGood", -118675729);
        setIntField(term124191, term124191.getClass(), "tapBad", 140313614);
        setIntField(term124191, term124191.getClass(), "holdPerfect", -1773035656);
        setIntField(term124191, term124191.getClass(), "holdGreat", 1654490474);
        setIntField(term124191, term124191.getClass(), "holdGood", -1109715656);
        setIntField(term124191, term124191.getClass(), "holdBad", 459543779);
        setIntField(term124191, term124191.getClass(), "slidePerfect", 997601106);
        setIntField(term124191, term124191.getClass(), "slideGreat", 2022393400);
        setIntField(term124191, term124191.getClass(), "slideGood", 987907202);
        setIntField(term124191, term124191.getClass(), "slideBad", 2129251057);
        setIntField(term124191, term124191.getClass(), "breakPerfect", -1299562763);
        setIntField(term124191, term124191.getClass(), "breakGreat", -668992598);
        setIntField(term124191, term124191.getClass(), "breakGood", -1617142593);
        setIntField(term124191, term124191.getClass(), "breakBad", 1288566760);
        setBooleanField(term124191, term124191.getClass(), "isTrackSkip", false);
        setBooleanField(term124191, term124191.getClass(), "isHighScore", false);
        setBooleanField(term124191, term124191.getClass(), "isChallengeTrack", true);
        setIntField(term124191, term124191.getClass(), "challengeLife", 2045294676);
        setIntField(term124191, term124191.getClass(), "challengeRemain", -865007679);
        setIntField(term124191, term124191.getClass(), "isAllPerfectPlus", -1552402754);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayedUserName3", argTypes, term124191, args);
    }

};


