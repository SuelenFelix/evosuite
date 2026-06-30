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

public class UserPlaylog_setPlayedUserName1_171003835080 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term150531;

    public UserPlaylog_setPlayedUserName1_171003835080() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term150537 = new Long(-6837989212848250735L);
        term150531 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term150533 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term150535 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term150551 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term150552 = newInstance(Class.forName("java.time.LocalDate"));
        Object term150556 = newInstance(Class.forName("java.time.LocalTime"));
        Object term150561 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term150562 = newInstance(Class.forName("java.time.LocalDate"));
        Object term150566 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term150531, term150531.getClass(), "id", 3396057794430157389L);
        setLongField(term150533, term150533.getClass(), "id", -419363521580148942L);
        setLongField(term150535, term150535.getClass(), "id", 7635276988377158212L);
        setField(term150535, term150535.getClass(), "extId", term150537);
        setField(term150535, term150535.getClass(), "luid", "nYfzbXugsB");
        setIntField(term150552, term150552.getClass(), "year", 2017);
        setShortField(term150552, term150552.getClass(), "month", (short) 4);
        setShortField(term150552, term150552.getClass(), "day", (short) 16);
        setField(term150551, term150551.getClass(), "date", term150552);
        setByteField(term150556, term150556.getClass(), "hour", (byte) 4);
        setByteField(term150556, term150556.getClass(), "minute", (byte) 46);
        setByteField(term150556, term150556.getClass(), "second", (byte) 10);
        setIntField(term150556, term150556.getClass(), "nano", 543909144);
        setField(term150551, term150551.getClass(), "time", term150556);
        setField(term150535, term150535.getClass(), "registerTime", term150551);
        setIntField(term150562, term150562.getClass(), "year", 2025);
        setShortField(term150562, term150562.getClass(), "month", (short) 1);
        setShortField(term150562, term150562.getClass(), "day", (short) 18);
        setField(term150561, term150561.getClass(), "date", term150562);
        setByteField(term150566, term150566.getClass(), "hour", (byte) 6);
        setByteField(term150566, term150566.getClass(), "minute", (byte) 53);
        setByteField(term150566, term150566.getClass(), "second", (byte) 54);
        setIntField(term150566, term150566.getClass(), "nano", 781716212);
        setField(term150561, term150561.getClass(), "time", term150566);
        setField(term150535, term150535.getClass(), "accessTime", term150561);
        setField(term150533, term150533.getClass(), "card", term150535);
        setIntField(term150533, term150533.getClass(), "lastDataVersion", 924716132);
        setField(term150533, term150533.getClass(), "userName", "qRQNawdehr");
        setIntField(term150533, term150533.getClass(), "point", 1162631143);
        setIntField(term150533, term150533.getClass(), "totalPoint", 1083987263);
        setIntField(term150533, term150533.getClass(), "iconId", 602646570);
        setIntField(term150533, term150533.getClass(), "nameplateId", -1380056152);
        setIntField(term150533, term150533.getClass(), "frameId", 1488181850);
        setIntField(term150533, term150533.getClass(), "trophyId", -504206122);
        setIntField(term150533, term150533.getClass(), "playCount", 759328703);
        setIntField(term150533, term150533.getClass(), "playVsCount", 32333588);
        setIntField(term150533, term150533.getClass(), "playSyncCount", -1648743744);
        setIntField(term150533, term150533.getClass(), "winCount", 1457691982);
        setIntField(term150533, term150533.getClass(), "helpCount", 1428832627);
        setIntField(term150533, term150533.getClass(), "comboCount", -955584527);
        setIntField(term150533, term150533.getClass(), "feverCount", 775403208);
        setIntField(term150533, term150533.getClass(), "totalHiScore", 1343036162);
        setIntField(term150533, term150533.getClass(), "totalEasyHighScore", -1781890448);
        setIntField(term150533, term150533.getClass(), "totalBasicHighScore", 548618826);
        setIntField(term150533, term150533.getClass(), "totalAdvancedHighScore", 62787565);
        setIntField(term150533, term150533.getClass(), "totalExpertHighScore", -98090991);
        setIntField(term150533, term150533.getClass(), "totalMasterHighScore", 532158335);
        setIntField(term150533, term150533.getClass(), "totalReMasterHighScore", 1558249406);
        setIntField(term150533, term150533.getClass(), "totalHighSync", -1550026828);
        setIntField(term150533, term150533.getClass(), "totalEasySync", -1734320815);
        setIntField(term150533, term150533.getClass(), "totalBasicSync", 2127402225);
        setIntField(term150533, term150533.getClass(), "totalAdvancedSync", -1120916585);
        setIntField(term150533, term150533.getClass(), "totalExpertSync", -219517902);
        setIntField(term150533, term150533.getClass(), "totalMasterSync", 1242441347);
        setIntField(term150533, term150533.getClass(), "totalReMasterSync", 2105280707);
        setIntField(term150533, term150533.getClass(), "playerRating", 1729137690);
        setIntField(term150533, term150533.getClass(), "highestRating", -1206912815);
        setIntField(term150533, term150533.getClass(), "rankAuthTailId", 343354824);
        setField(term150533, term150533.getClass(), "eventWatchedDate", "SQzxKDMlfO");
        setField(term150533, term150533.getClass(), "webLimitDate", "aKrsHDKAga");
        setIntField(term150533, term150533.getClass(), "challengeTrackPhase", -1302609156);
        setIntField(term150533, term150533.getClass(), "firstPlayBits", 849663264);
        setField(term150533, term150533.getClass(), "lastPlayDate", "rKYDoRiKpS");
        setIntField(term150533, term150533.getClass(), "lastPlaceId", -931410094);
        setField(term150533, term150533.getClass(), "lastPlaceName", "XGYvAaNOfz");
        setIntField(term150533, term150533.getClass(), "lastRegionId", 2114265683);
        setField(term150533, term150533.getClass(), "lastRegionName", "xVIwdmzmFH");
        setField(term150533, term150533.getClass(), "lastClientId", "ZUWrlRmxmN");
        setField(term150533, term150533.getClass(), "lastCountryCode", "GHfTuIOuRe");
        setIntField(term150533, term150533.getClass(), "eventPoint", -1906917286);
        setIntField(term150533, term150533.getClass(), "totalLv", 1439786981);
        setIntField(term150533, term150533.getClass(), "lastLoginBonusDay", -843879147);
        setIntField(term150533, term150533.getClass(), "lastSurvivalBonusDay", 1225770592);
        setIntField(term150533, term150533.getClass(), "loginBonusLv", -1690526931);
        setField(term150531, term150531.getClass(), "user", term150533);
        setIntField(term150531, term150531.getClass(), "orderId", -1110000609);
        setLongField(term150531, term150531.getClass(), "sortNumber", -5040671346926017489L);
        setIntField(term150531, term150531.getClass(), "placeId", 1558827160);
        setField(term150531, term150531.getClass(), "placeName", "uTLqPiiyQJ");
        setField(term150531, term150531.getClass(), "country", "ZpBdJcjcRV");
        setIntField(term150531, term150531.getClass(), "regionId", -1274228635);
        setField(term150531, term150531.getClass(), "playDate", "WmcYBwydRb");
        setField(term150531, term150531.getClass(), "userPlayDate", "rUMOOZJWlQ");
        setIntField(term150531, term150531.getClass(), "musicId", -316004735);
        setIntField(term150531, term150531.getClass(), "level", -1426012590);
        setIntField(term150531, term150531.getClass(), "gameMode", 67994429);
        setIntField(term150531, term150531.getClass(), "rivalNum", -1644156026);
        setIntField(term150531, term150531.getClass(), "track", -2094196862);
        setIntField(term150531, term150531.getClass(), "eventId", -1061818526);
        setBooleanField(term150531, term150531.getClass(), "isFreeToPlay", false);
        setIntField(term150531, term150531.getClass(), "playerRating", 654768975);
        setLongField(term150531, term150531.getClass(), "playedUserId1", -8525585238233113814L);
        setField(term150531, term150531.getClass(), "playedUserName1", "STLaUnCnfE");
        setIntField(term150531, term150531.getClass(), "playedMusicLevel1", -1714730163);
        setLongField(term150531, term150531.getClass(), "playedUserId2", -3955508582186061944L);
        setField(term150531, term150531.getClass(), "playedUserName2", "LgOnJRfkhr");
        setIntField(term150531, term150531.getClass(), "playedMusicLevel2", 120480028);
        setLongField(term150531, term150531.getClass(), "playedUserId3", -7986118407298160731L);
        setField(term150531, term150531.getClass(), "playedUserName3", "ZmarCjgmcB");
        setIntField(term150531, term150531.getClass(), "playedMusicLevel3", -37392023);
        setIntField(term150531, term150531.getClass(), "achievement", -1947428282);
        setIntField(term150531, term150531.getClass(), "score", -1250851175);
        setIntField(term150531, term150531.getClass(), "tapScore", -2135677471);
        setIntField(term150531, term150531.getClass(), "holdScore", -830591542);
        setIntField(term150531, term150531.getClass(), "slideScore", 1166134090);
        setIntField(term150531, term150531.getClass(), "breakScore", 559066583);
        setIntField(term150531, term150531.getClass(), "syncRate", -1145674704);
        setIntField(term150531, term150531.getClass(), "vsWin", -787197818);
        setBooleanField(term150531, term150531.getClass(), "isAllPerfect", true);
        setIntField(term150531, term150531.getClass(), "fullCombo", 212534773);
        setIntField(term150531, term150531.getClass(), "maxFever", 96227440);
        setIntField(term150531, term150531.getClass(), "maxCombo", 1523564690);
        setIntField(term150531, term150531.getClass(), "tapPerfect", -1234348850);
        setIntField(term150531, term150531.getClass(), "tapGreat", -740771491);
        setIntField(term150531, term150531.getClass(), "tapGood", 1984259458);
        setIntField(term150531, term150531.getClass(), "tapBad", 1824920167);
        setIntField(term150531, term150531.getClass(), "holdPerfect", 2060402392);
        setIntField(term150531, term150531.getClass(), "holdGreat", 2131190609);
        setIntField(term150531, term150531.getClass(), "holdGood", 1232030673);
        setIntField(term150531, term150531.getClass(), "holdBad", 1862047425);
        setIntField(term150531, term150531.getClass(), "slidePerfect", -1402396938);
        setIntField(term150531, term150531.getClass(), "slideGreat", -1072474143);
        setIntField(term150531, term150531.getClass(), "slideGood", -1824369409);
        setIntField(term150531, term150531.getClass(), "slideBad", -1826886257);
        setIntField(term150531, term150531.getClass(), "breakPerfect", -1770507805);
        setIntField(term150531, term150531.getClass(), "breakGreat", 1979907363);
        setIntField(term150531, term150531.getClass(), "breakGood", -95727621);
        setIntField(term150531, term150531.getClass(), "breakBad", -195410691);
        setBooleanField(term150531, term150531.getClass(), "isTrackSkip", true);
        setBooleanField(term150531, term150531.getClass(), "isHighScore", false);
        setBooleanField(term150531, term150531.getClass(), "isChallengeTrack", true);
        setIntField(term150531, term150531.getClass(), "challengeLife", -2144456096);
        setIntField(term150531, term150531.getClass(), "challengeRemain", -288194764);
        setIntField(term150531, term150531.getClass(), "isAllPerfectPlus", 717407927);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "zxUAROPAUu";
        callMethod(klass, "setPlayedUserName1", argTypes, term150531, args);
    }

};


