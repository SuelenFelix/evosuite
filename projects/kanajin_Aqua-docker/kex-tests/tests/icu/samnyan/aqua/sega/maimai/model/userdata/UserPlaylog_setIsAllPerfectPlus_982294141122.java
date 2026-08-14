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

public class UserPlaylog_setIsAllPerfectPlus_982294141122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term170081;
     Object term170393;

    public UserPlaylog_setIsAllPerfectPlus_982294141122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term170087 = new Long(-5876259280451647338L);
        term170081 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term170083 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term170085 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term170101 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term170102 = newInstance(Class.forName("java.time.LocalDate"));
        Object term170106 = newInstance(Class.forName("java.time.LocalTime"));
        Object term170111 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term170112 = newInstance(Class.forName("java.time.LocalDate"));
        Object term170116 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term170081, term170081.getClass(), "id", -4884840909566332937L);
        setLongField(term170083, term170083.getClass(), "id", -169133604410652254L);
        setLongField(term170085, term170085.getClass(), "id", -3017833790131447565L);
        setField(term170085, term170085.getClass(), "extId", term170087);
        setField(term170085, term170085.getClass(), "luid", "THllnCKhSX");
        setIntField(term170102, term170102.getClass(), "year", 2022);
        setShortField(term170102, term170102.getClass(), "month", (short) 12);
        setShortField(term170102, term170102.getClass(), "day", (short) 31);
        setField(term170101, term170101.getClass(), "date", term170102);
        setByteField(term170106, term170106.getClass(), "hour", (byte) 12);
        setByteField(term170106, term170106.getClass(), "minute", (byte) 2);
        setByteField(term170106, term170106.getClass(), "second", (byte) 5);
        setIntField(term170106, term170106.getClass(), "nano", 238792504);
        setField(term170101, term170101.getClass(), "time", term170106);
        setField(term170085, term170085.getClass(), "registerTime", term170101);
        setIntField(term170112, term170112.getClass(), "year", 2021);
        setShortField(term170112, term170112.getClass(), "month", (short) 5);
        setShortField(term170112, term170112.getClass(), "day", (short) 16);
        setField(term170111, term170111.getClass(), "date", term170112);
        setByteField(term170116, term170116.getClass(), "hour", (byte) 4);
        setByteField(term170116, term170116.getClass(), "minute", (byte) 27);
        setByteField(term170116, term170116.getClass(), "second", (byte) 14);
        setIntField(term170116, term170116.getClass(), "nano", 585753199);
        setField(term170111, term170111.getClass(), "time", term170116);
        setField(term170085, term170085.getClass(), "accessTime", term170111);
        setField(term170083, term170083.getClass(), "card", term170085);
        setIntField(term170083, term170083.getClass(), "lastDataVersion", -455804842);
        setField(term170083, term170083.getClass(), "userName", "QENisOjsdU");
        setIntField(term170083, term170083.getClass(), "point", 429921311);
        setIntField(term170083, term170083.getClass(), "totalPoint", 827676453);
        setIntField(term170083, term170083.getClass(), "iconId", 1048915364);
        setIntField(term170083, term170083.getClass(), "nameplateId", -388477517);
        setIntField(term170083, term170083.getClass(), "frameId", -1994993875);
        setIntField(term170083, term170083.getClass(), "trophyId", -566027885);
        setIntField(term170083, term170083.getClass(), "playCount", -1584226980);
        setIntField(term170083, term170083.getClass(), "playVsCount", -492887005);
        setIntField(term170083, term170083.getClass(), "playSyncCount", 1182666323);
        setIntField(term170083, term170083.getClass(), "winCount", 520575264);
        setIntField(term170083, term170083.getClass(), "helpCount", -1361437867);
        setIntField(term170083, term170083.getClass(), "comboCount", -1851906932);
        setIntField(term170083, term170083.getClass(), "feverCount", 148069559);
        setIntField(term170083, term170083.getClass(), "totalHiScore", 939123049);
        setIntField(term170083, term170083.getClass(), "totalEasyHighScore", -2071936675);
        setIntField(term170083, term170083.getClass(), "totalBasicHighScore", -1628609313);
        setIntField(term170083, term170083.getClass(), "totalAdvancedHighScore", 2123622494);
        setIntField(term170083, term170083.getClass(), "totalExpertHighScore", -1131110979);
        setIntField(term170083, term170083.getClass(), "totalMasterHighScore", 1683626627);
        setIntField(term170083, term170083.getClass(), "totalReMasterHighScore", 511247995);
        setIntField(term170083, term170083.getClass(), "totalHighSync", -1175598404);
        setIntField(term170083, term170083.getClass(), "totalEasySync", 672430116);
        setIntField(term170083, term170083.getClass(), "totalBasicSync", 1215606727);
        setIntField(term170083, term170083.getClass(), "totalAdvancedSync", -483207469);
        setIntField(term170083, term170083.getClass(), "totalExpertSync", -278608242);
        setIntField(term170083, term170083.getClass(), "totalMasterSync", -476404573);
        setIntField(term170083, term170083.getClass(), "totalReMasterSync", -1013568492);
        setIntField(term170083, term170083.getClass(), "playerRating", 1495979597);
        setIntField(term170083, term170083.getClass(), "highestRating", 1839501032);
        setIntField(term170083, term170083.getClass(), "rankAuthTailId", -1795105601);
        setField(term170083, term170083.getClass(), "eventWatchedDate", "XcNzjytYdo");
        setField(term170083, term170083.getClass(), "webLimitDate", "yaWHpyBtzq");
        setIntField(term170083, term170083.getClass(), "challengeTrackPhase", -1799271570);
        setIntField(term170083, term170083.getClass(), "firstPlayBits", 1181665645);
        setField(term170083, term170083.getClass(), "lastPlayDate", "avheFeRlbW");
        setIntField(term170083, term170083.getClass(), "lastPlaceId", -1639453815);
        setField(term170083, term170083.getClass(), "lastPlaceName", "tOwnGveRxa");
        setIntField(term170083, term170083.getClass(), "lastRegionId", -1279832258);
        setField(term170083, term170083.getClass(), "lastRegionName", "poFpgGCWFn");
        setField(term170083, term170083.getClass(), "lastClientId", "RqdyWjrKTf");
        setField(term170083, term170083.getClass(), "lastCountryCode", "rWmZbuScqX");
        setIntField(term170083, term170083.getClass(), "eventPoint", 1875839335);
        setIntField(term170083, term170083.getClass(), "totalLv", 1055864882);
        setIntField(term170083, term170083.getClass(), "lastLoginBonusDay", 1140674166);
        setIntField(term170083, term170083.getClass(), "lastSurvivalBonusDay", 422266932);
        setIntField(term170083, term170083.getClass(), "loginBonusLv", 264749783);
        setField(term170081, term170081.getClass(), "user", term170083);
        setIntField(term170081, term170081.getClass(), "orderId", -1297449024);
        setLongField(term170081, term170081.getClass(), "sortNumber", -4035098953611869778L);
        setIntField(term170081, term170081.getClass(), "placeId", -1343836475);
        setField(term170081, term170081.getClass(), "placeName", "TjNFMlAPjg");
        setField(term170081, term170081.getClass(), "country", "RtwermybyK");
        setIntField(term170081, term170081.getClass(), "regionId", 1822545213);
        setField(term170081, term170081.getClass(), "playDate", "viHGfcpsVu");
        setField(term170081, term170081.getClass(), "userPlayDate", "UGKENyzPxk");
        setIntField(term170081, term170081.getClass(), "musicId", -113230133);
        setIntField(term170081, term170081.getClass(), "level", 507828798);
        setIntField(term170081, term170081.getClass(), "gameMode", 127646905);
        setIntField(term170081, term170081.getClass(), "rivalNum", 1197599238);
        setIntField(term170081, term170081.getClass(), "track", -557198659);
        setIntField(term170081, term170081.getClass(), "eventId", 121536769);
        setBooleanField(term170081, term170081.getClass(), "isFreeToPlay", false);
        setIntField(term170081, term170081.getClass(), "playerRating", -65879281);
        setLongField(term170081, term170081.getClass(), "playedUserId1", -4647988450998060301L);
        setField(term170081, term170081.getClass(), "playedUserName1", "xsGPsLxzxW");
        setIntField(term170081, term170081.getClass(), "playedMusicLevel1", -507655918);
        setLongField(term170081, term170081.getClass(), "playedUserId2", -6799265768469176623L);
        setField(term170081, term170081.getClass(), "playedUserName2", "XoKkEYIzVX");
        setIntField(term170081, term170081.getClass(), "playedMusicLevel2", 1321473541);
        setLongField(term170081, term170081.getClass(), "playedUserId3", -6960323426014178409L);
        setField(term170081, term170081.getClass(), "playedUserName3", "rtKwDvMEWe");
        setIntField(term170081, term170081.getClass(), "playedMusicLevel3", 1818709225);
        setIntField(term170081, term170081.getClass(), "achievement", 556124567);
        setIntField(term170081, term170081.getClass(), "score", 742634683);
        setIntField(term170081, term170081.getClass(), "tapScore", -741222257);
        setIntField(term170081, term170081.getClass(), "holdScore", 859928843);
        setIntField(term170081, term170081.getClass(), "slideScore", -491860731);
        setIntField(term170081, term170081.getClass(), "breakScore", -698733451);
        setIntField(term170081, term170081.getClass(), "syncRate", -1759883058);
        setIntField(term170081, term170081.getClass(), "vsWin", -1040487536);
        setBooleanField(term170081, term170081.getClass(), "isAllPerfect", true);
        setIntField(term170081, term170081.getClass(), "fullCombo", 1754210312);
        setIntField(term170081, term170081.getClass(), "maxFever", -586401190);
        setIntField(term170081, term170081.getClass(), "maxCombo", -1466256144);
        setIntField(term170081, term170081.getClass(), "tapPerfect", 1841473756);
        setIntField(term170081, term170081.getClass(), "tapGreat", 1940081052);
        setIntField(term170081, term170081.getClass(), "tapGood", -2045864734);
        setIntField(term170081, term170081.getClass(), "tapBad", -1789152429);
        setIntField(term170081, term170081.getClass(), "holdPerfect", 481318130);
        setIntField(term170081, term170081.getClass(), "holdGreat", -874122084);
        setIntField(term170081, term170081.getClass(), "holdGood", -598828815);
        setIntField(term170081, term170081.getClass(), "holdBad", -660505033);
        setIntField(term170081, term170081.getClass(), "slidePerfect", -2085492970);
        setIntField(term170081, term170081.getClass(), "slideGreat", -2129017702);
        setIntField(term170081, term170081.getClass(), "slideGood", -655859690);
        setIntField(term170081, term170081.getClass(), "slideBad", -479961421);
        setIntField(term170081, term170081.getClass(), "breakPerfect", -1177095245);
        setIntField(term170081, term170081.getClass(), "breakGreat", 1551574002);
        setIntField(term170081, term170081.getClass(), "breakGood", -579766511);
        setIntField(term170081, term170081.getClass(), "breakBad", 130745069);
        setBooleanField(term170081, term170081.getClass(), "isTrackSkip", false);
        setBooleanField(term170081, term170081.getClass(), "isHighScore", true);
        setBooleanField(term170081, term170081.getClass(), "isChallengeTrack", true);
        setIntField(term170081, term170081.getClass(), "challengeLife", -1919471489);
        setIntField(term170081, term170081.getClass(), "challengeRemain", 544759580);
        setIntField(term170081, term170081.getClass(), "isAllPerfectPlus", 1197078678);
        term170393 = new Integer(473889669);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term170393;
        callMethod(klass, "setIsAllPerfectPlus", argTypes, term170081, args);
    }

};


