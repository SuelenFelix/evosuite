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

public class UserPlaylog_setIsAllPerfectPlus_982294141121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term170025;
     Object term170337;

    public UserPlaylog_setIsAllPerfectPlus_982294141121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term170031 = new Long(-5876259280451647338L);
        term170025 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term170027 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term170029 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term170045 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term170046 = newInstance(Class.forName("java.time.LocalDate"));
        Object term170050 = newInstance(Class.forName("java.time.LocalTime"));
        Object term170055 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term170056 = newInstance(Class.forName("java.time.LocalDate"));
        Object term170060 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term170025, term170025.getClass(), "id", -4884840909566332937L);
        setLongField(term170027, term170027.getClass(), "id", -169133604410652254L);
        setLongField(term170029, term170029.getClass(), "id", -3017833790131447565L);
        setField(term170029, term170029.getClass(), "extId", term170031);
        setField(term170029, term170029.getClass(), "luid", "THllnCKhSX");
        setIntField(term170046, term170046.getClass(), "year", 2022);
        setShortField(term170046, term170046.getClass(), "month", (short) 12);
        setShortField(term170046, term170046.getClass(), "day", (short) 31);
        setField(term170045, term170045.getClass(), "date", term170046);
        setByteField(term170050, term170050.getClass(), "hour", (byte) 12);
        setByteField(term170050, term170050.getClass(), "minute", (byte) 2);
        setByteField(term170050, term170050.getClass(), "second", (byte) 5);
        setIntField(term170050, term170050.getClass(), "nano", 238792504);
        setField(term170045, term170045.getClass(), "time", term170050);
        setField(term170029, term170029.getClass(), "registerTime", term170045);
        setIntField(term170056, term170056.getClass(), "year", 2021);
        setShortField(term170056, term170056.getClass(), "month", (short) 5);
        setShortField(term170056, term170056.getClass(), "day", (short) 16);
        setField(term170055, term170055.getClass(), "date", term170056);
        setByteField(term170060, term170060.getClass(), "hour", (byte) 4);
        setByteField(term170060, term170060.getClass(), "minute", (byte) 27);
        setByteField(term170060, term170060.getClass(), "second", (byte) 14);
        setIntField(term170060, term170060.getClass(), "nano", 585753199);
        setField(term170055, term170055.getClass(), "time", term170060);
        setField(term170029, term170029.getClass(), "accessTime", term170055);
        setField(term170027, term170027.getClass(), "card", term170029);
        setIntField(term170027, term170027.getClass(), "lastDataVersion", -455804842);
        setField(term170027, term170027.getClass(), "userName", "QENisOjsdU");
        setIntField(term170027, term170027.getClass(), "point", 429921311);
        setIntField(term170027, term170027.getClass(), "totalPoint", 827676453);
        setIntField(term170027, term170027.getClass(), "iconId", 1048915364);
        setIntField(term170027, term170027.getClass(), "nameplateId", -388477517);
        setIntField(term170027, term170027.getClass(), "frameId", -1994993875);
        setIntField(term170027, term170027.getClass(), "trophyId", -566027885);
        setIntField(term170027, term170027.getClass(), "playCount", -1584226980);
        setIntField(term170027, term170027.getClass(), "playVsCount", -492887005);
        setIntField(term170027, term170027.getClass(), "playSyncCount", 1182666323);
        setIntField(term170027, term170027.getClass(), "winCount", 520575264);
        setIntField(term170027, term170027.getClass(), "helpCount", -1361437867);
        setIntField(term170027, term170027.getClass(), "comboCount", -1851906932);
        setIntField(term170027, term170027.getClass(), "feverCount", 148069559);
        setIntField(term170027, term170027.getClass(), "totalHiScore", 939123049);
        setIntField(term170027, term170027.getClass(), "totalEasyHighScore", -2071936675);
        setIntField(term170027, term170027.getClass(), "totalBasicHighScore", -1628609313);
        setIntField(term170027, term170027.getClass(), "totalAdvancedHighScore", 2123622494);
        setIntField(term170027, term170027.getClass(), "totalExpertHighScore", -1131110979);
        setIntField(term170027, term170027.getClass(), "totalMasterHighScore", 1683626627);
        setIntField(term170027, term170027.getClass(), "totalReMasterHighScore", 511247995);
        setIntField(term170027, term170027.getClass(), "totalHighSync", -1175598404);
        setIntField(term170027, term170027.getClass(), "totalEasySync", 672430116);
        setIntField(term170027, term170027.getClass(), "totalBasicSync", 1215606727);
        setIntField(term170027, term170027.getClass(), "totalAdvancedSync", -483207469);
        setIntField(term170027, term170027.getClass(), "totalExpertSync", -278608242);
        setIntField(term170027, term170027.getClass(), "totalMasterSync", -476404573);
        setIntField(term170027, term170027.getClass(), "totalReMasterSync", -1013568492);
        setIntField(term170027, term170027.getClass(), "playerRating", 1495979597);
        setIntField(term170027, term170027.getClass(), "highestRating", 1839501032);
        setIntField(term170027, term170027.getClass(), "rankAuthTailId", -1795105601);
        setField(term170027, term170027.getClass(), "eventWatchedDate", "XcNzjytYdo");
        setField(term170027, term170027.getClass(), "webLimitDate", "yaWHpyBtzq");
        setIntField(term170027, term170027.getClass(), "challengeTrackPhase", -1799271570);
        setIntField(term170027, term170027.getClass(), "firstPlayBits", 1181665645);
        setField(term170027, term170027.getClass(), "lastPlayDate", "avheFeRlbW");
        setIntField(term170027, term170027.getClass(), "lastPlaceId", -1639453815);
        setField(term170027, term170027.getClass(), "lastPlaceName", "tOwnGveRxa");
        setIntField(term170027, term170027.getClass(), "lastRegionId", -1279832258);
        setField(term170027, term170027.getClass(), "lastRegionName", "poFpgGCWFn");
        setField(term170027, term170027.getClass(), "lastClientId", "RqdyWjrKTf");
        setField(term170027, term170027.getClass(), "lastCountryCode", "rWmZbuScqX");
        setIntField(term170027, term170027.getClass(), "eventPoint", 1875839335);
        setIntField(term170027, term170027.getClass(), "totalLv", 1055864882);
        setIntField(term170027, term170027.getClass(), "lastLoginBonusDay", 1140674166);
        setIntField(term170027, term170027.getClass(), "lastSurvivalBonusDay", 422266932);
        setIntField(term170027, term170027.getClass(), "loginBonusLv", 264749783);
        setField(term170025, term170025.getClass(), "user", term170027);
        setIntField(term170025, term170025.getClass(), "orderId", -1297449024);
        setLongField(term170025, term170025.getClass(), "sortNumber", -4035098953611869778L);
        setIntField(term170025, term170025.getClass(), "placeId", -1343836475);
        setField(term170025, term170025.getClass(), "placeName", "TjNFMlAPjg");
        setField(term170025, term170025.getClass(), "country", "RtwermybyK");
        setIntField(term170025, term170025.getClass(), "regionId", 1822545213);
        setField(term170025, term170025.getClass(), "playDate", "viHGfcpsVu");
        setField(term170025, term170025.getClass(), "userPlayDate", "UGKENyzPxk");
        setIntField(term170025, term170025.getClass(), "musicId", -113230133);
        setIntField(term170025, term170025.getClass(), "level", 507828798);
        setIntField(term170025, term170025.getClass(), "gameMode", 127646905);
        setIntField(term170025, term170025.getClass(), "rivalNum", 1197599238);
        setIntField(term170025, term170025.getClass(), "track", -557198659);
        setIntField(term170025, term170025.getClass(), "eventId", 121536769);
        setBooleanField(term170025, term170025.getClass(), "isFreeToPlay", false);
        setIntField(term170025, term170025.getClass(), "playerRating", -65879281);
        setLongField(term170025, term170025.getClass(), "playedUserId1", -4647988450998060301L);
        setField(term170025, term170025.getClass(), "playedUserName1", "xsGPsLxzxW");
        setIntField(term170025, term170025.getClass(), "playedMusicLevel1", -507655918);
        setLongField(term170025, term170025.getClass(), "playedUserId2", -6799265768469176623L);
        setField(term170025, term170025.getClass(), "playedUserName2", "XoKkEYIzVX");
        setIntField(term170025, term170025.getClass(), "playedMusicLevel2", 1321473541);
        setLongField(term170025, term170025.getClass(), "playedUserId3", -6960323426014178409L);
        setField(term170025, term170025.getClass(), "playedUserName3", "rtKwDvMEWe");
        setIntField(term170025, term170025.getClass(), "playedMusicLevel3", 1818709225);
        setIntField(term170025, term170025.getClass(), "achievement", 556124567);
        setIntField(term170025, term170025.getClass(), "score", 742634683);
        setIntField(term170025, term170025.getClass(), "tapScore", -741222257);
        setIntField(term170025, term170025.getClass(), "holdScore", 859928843);
        setIntField(term170025, term170025.getClass(), "slideScore", -491860731);
        setIntField(term170025, term170025.getClass(), "breakScore", -698733451);
        setIntField(term170025, term170025.getClass(), "syncRate", -1759883058);
        setIntField(term170025, term170025.getClass(), "vsWin", -1040487536);
        setBooleanField(term170025, term170025.getClass(), "isAllPerfect", true);
        setIntField(term170025, term170025.getClass(), "fullCombo", 1754210312);
        setIntField(term170025, term170025.getClass(), "maxFever", -586401190);
        setIntField(term170025, term170025.getClass(), "maxCombo", -1466256144);
        setIntField(term170025, term170025.getClass(), "tapPerfect", 1841473756);
        setIntField(term170025, term170025.getClass(), "tapGreat", 1940081052);
        setIntField(term170025, term170025.getClass(), "tapGood", -2045864734);
        setIntField(term170025, term170025.getClass(), "tapBad", -1789152429);
        setIntField(term170025, term170025.getClass(), "holdPerfect", 481318130);
        setIntField(term170025, term170025.getClass(), "holdGreat", -874122084);
        setIntField(term170025, term170025.getClass(), "holdGood", -598828815);
        setIntField(term170025, term170025.getClass(), "holdBad", -660505033);
        setIntField(term170025, term170025.getClass(), "slidePerfect", -2085492970);
        setIntField(term170025, term170025.getClass(), "slideGreat", -2129017702);
        setIntField(term170025, term170025.getClass(), "slideGood", -655859690);
        setIntField(term170025, term170025.getClass(), "slideBad", -479961421);
        setIntField(term170025, term170025.getClass(), "breakPerfect", -1177095245);
        setIntField(term170025, term170025.getClass(), "breakGreat", 1551574002);
        setIntField(term170025, term170025.getClass(), "breakGood", -579766511);
        setIntField(term170025, term170025.getClass(), "breakBad", 130745069);
        setBooleanField(term170025, term170025.getClass(), "isTrackSkip", false);
        setBooleanField(term170025, term170025.getClass(), "isHighScore", true);
        setBooleanField(term170025, term170025.getClass(), "isChallengeTrack", true);
        setIntField(term170025, term170025.getClass(), "challengeLife", -1919471489);
        setIntField(term170025, term170025.getClass(), "challengeRemain", 544759580);
        setIntField(term170025, term170025.getClass(), "isAllPerfectPlus", 1197078678);
        term170337 = new Integer(473889669);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term170337;
        callMethod(klass, "setIsAllPerfectPlus", argTypes, term170025, args);
    }

};


