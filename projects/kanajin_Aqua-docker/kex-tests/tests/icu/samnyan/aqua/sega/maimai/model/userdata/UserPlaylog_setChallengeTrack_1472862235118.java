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
import java.lang.Boolean;

public class UserPlaylog_setChallengeTrack_1472862235118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3994969;
     Object term3995281;

    public UserPlaylog_setChallengeTrack_1472862235118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3994975 = new Long(-4877120891991443065L);
        term3994969 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term3994971 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term3994973 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term3994989 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3994990 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3994994 = newInstance(Class.forName("java.time.LocalTime"));
        Object term3994999 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3995000 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3995004 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term3994969, term3994969.getClass(), "id", 6240202416452929156L);
        setLongField(term3994971, term3994971.getClass(), "id", -3276351251001572731L);
        setLongField(term3994973, term3994973.getClass(), "id", -8636385879964366434L);
        setField(term3994973, term3994973.getClass(), "extId", term3994975);
        setField(term3994973, term3994973.getClass(), "luid", "vpEPPGWUsM");
        setIntField(term3994990, term3994990.getClass(), "year", 2024);
        setShortField(term3994990, term3994990.getClass(), "month", (short) 3);
        setShortField(term3994990, term3994990.getClass(), "day", (short) 26);
        setField(term3994989, term3994989.getClass(), "date", term3994990);
        setByteField(term3994994, term3994994.getClass(), "hour", (byte) 15);
        setByteField(term3994994, term3994994.getClass(), "minute", (byte) 35);
        setByteField(term3994994, term3994994.getClass(), "second", (byte) 26);
        setIntField(term3994994, term3994994.getClass(), "nano", 521619951);
        setField(term3994989, term3994989.getClass(), "time", term3994994);
        setField(term3994973, term3994973.getClass(), "registerTime", term3994989);
        setIntField(term3995000, term3995000.getClass(), "year", 2029);
        setShortField(term3995000, term3995000.getClass(), "month", (short) 10);
        setShortField(term3995000, term3995000.getClass(), "day", (short) 17);
        setField(term3994999, term3994999.getClass(), "date", term3995000);
        setByteField(term3995004, term3995004.getClass(), "hour", (byte) 1);
        setByteField(term3995004, term3995004.getClass(), "minute", (byte) 51);
        setByteField(term3995004, term3995004.getClass(), "second", (byte) 21);
        setIntField(term3995004, term3995004.getClass(), "nano", 386963134);
        setField(term3994999, term3994999.getClass(), "time", term3995004);
        setField(term3994973, term3994973.getClass(), "accessTime", term3994999);
        setField(term3994971, term3994971.getClass(), "card", term3994973);
        setIntField(term3994971, term3994971.getClass(), "lastDataVersion", 908888298);
        setField(term3994971, term3994971.getClass(), "userName", "sNdLTmBBqN");
        setIntField(term3994971, term3994971.getClass(), "point", 1937664448);
        setIntField(term3994971, term3994971.getClass(), "totalPoint", 709503503);
        setIntField(term3994971, term3994971.getClass(), "iconId", 1095401025);
        setIntField(term3994971, term3994971.getClass(), "nameplateId", 1106149506);
        setIntField(term3994971, term3994971.getClass(), "frameId", -1279165619);
        setIntField(term3994971, term3994971.getClass(), "trophyId", -717767314);
        setIntField(term3994971, term3994971.getClass(), "playCount", -1066145825);
        setIntField(term3994971, term3994971.getClass(), "playVsCount", 564851603);
        setIntField(term3994971, term3994971.getClass(), "playSyncCount", -1064409264);
        setIntField(term3994971, term3994971.getClass(), "winCount", 924511762);
        setIntField(term3994971, term3994971.getClass(), "helpCount", 1954963450);
        setIntField(term3994971, term3994971.getClass(), "comboCount", 677809229);
        setIntField(term3994971, term3994971.getClass(), "feverCount", -2102869249);
        setIntField(term3994971, term3994971.getClass(), "totalHiScore", -525410619);
        setIntField(term3994971, term3994971.getClass(), "totalEasyHighScore", -770460523);
        setIntField(term3994971, term3994971.getClass(), "totalBasicHighScore", -1542065063);
        setIntField(term3994971, term3994971.getClass(), "totalAdvancedHighScore", 28026506);
        setIntField(term3994971, term3994971.getClass(), "totalExpertHighScore", 642862173);
        setIntField(term3994971, term3994971.getClass(), "totalMasterHighScore", 1913139927);
        setIntField(term3994971, term3994971.getClass(), "totalReMasterHighScore", -1873049262);
        setIntField(term3994971, term3994971.getClass(), "totalHighSync", -505431425);
        setIntField(term3994971, term3994971.getClass(), "totalEasySync", 341711187);
        setIntField(term3994971, term3994971.getClass(), "totalBasicSync", 1618742542);
        setIntField(term3994971, term3994971.getClass(), "totalAdvancedSync", -888707980);
        setIntField(term3994971, term3994971.getClass(), "totalExpertSync", -140888209);
        setIntField(term3994971, term3994971.getClass(), "totalMasterSync", 1803517590);
        setIntField(term3994971, term3994971.getClass(), "totalReMasterSync", 1915133175);
        setIntField(term3994971, term3994971.getClass(), "playerRating", 308521362);
        setIntField(term3994971, term3994971.getClass(), "highestRating", 2107227090);
        setIntField(term3994971, term3994971.getClass(), "rankAuthTailId", 344978845);
        setField(term3994971, term3994971.getClass(), "eventWatchedDate", "nqAyPoojQL");
        setField(term3994971, term3994971.getClass(), "webLimitDate", "ZeMoRQFCMT");
        setIntField(term3994971, term3994971.getClass(), "challengeTrackPhase", -1236466116);
        setIntField(term3994971, term3994971.getClass(), "firstPlayBits", 931287373);
        setField(term3994971, term3994971.getClass(), "lastPlayDate", "CSRrbMBZWv");
        setIntField(term3994971, term3994971.getClass(), "lastPlaceId", -473949145);
        setField(term3994971, term3994971.getClass(), "lastPlaceName", "ldkOgGbiaq");
        setIntField(term3994971, term3994971.getClass(), "lastRegionId", 803745723);
        setField(term3994971, term3994971.getClass(), "lastRegionName", "SQjMqrbhcX");
        setField(term3994971, term3994971.getClass(), "lastClientId", "WWOVxHSbhy");
        setField(term3994971, term3994971.getClass(), "lastCountryCode", "rwEoyNuBUX");
        setIntField(term3994971, term3994971.getClass(), "eventPoint", -526779075);
        setIntField(term3994971, term3994971.getClass(), "totalLv", 1080091266);
        setIntField(term3994971, term3994971.getClass(), "lastLoginBonusDay", -2715297);
        setIntField(term3994971, term3994971.getClass(), "lastSurvivalBonusDay", -1765495114);
        setIntField(term3994971, term3994971.getClass(), "loginBonusLv", -1461406189);
        setField(term3994969, term3994969.getClass(), "user", term3994971);
        setIntField(term3994969, term3994969.getClass(), "orderId", -1173762300);
        setLongField(term3994969, term3994969.getClass(), "sortNumber", -6530728234945683591L);
        setIntField(term3994969, term3994969.getClass(), "placeId", -1929647749);
        setField(term3994969, term3994969.getClass(), "placeName", "kXLqRIGfru");
        setField(term3994969, term3994969.getClass(), "country", "rxtVxCIsLg");
        setIntField(term3994969, term3994969.getClass(), "regionId", 739496601);
        setField(term3994969, term3994969.getClass(), "playDate", "SIvcjUPvbq");
        setField(term3994969, term3994969.getClass(), "userPlayDate", "uAgQoXrggU");
        setIntField(term3994969, term3994969.getClass(), "musicId", -355909679);
        setIntField(term3994969, term3994969.getClass(), "level", 690120586);
        setIntField(term3994969, term3994969.getClass(), "gameMode", 506633843);
        setIntField(term3994969, term3994969.getClass(), "rivalNum", -1648987959);
        setIntField(term3994969, term3994969.getClass(), "track", -1806381044);
        setIntField(term3994969, term3994969.getClass(), "eventId", -1966105877);
        setBooleanField(term3994969, term3994969.getClass(), "isFreeToPlay", true);
        setIntField(term3994969, term3994969.getClass(), "playerRating", -545327270);
        setLongField(term3994969, term3994969.getClass(), "playedUserId1", -3302954743501758112L);
        setField(term3994969, term3994969.getClass(), "playedUserName1", "tijQoEGgRN");
        setIntField(term3994969, term3994969.getClass(), "playedMusicLevel1", 1967802453);
        setLongField(term3994969, term3994969.getClass(), "playedUserId2", 8402185735956963272L);
        setField(term3994969, term3994969.getClass(), "playedUserName2", "cXFzMGBmeR");
        setIntField(term3994969, term3994969.getClass(), "playedMusicLevel2", -970145123);
        setLongField(term3994969, term3994969.getClass(), "playedUserId3", 5279334874881696170L);
        setField(term3994969, term3994969.getClass(), "playedUserName3", "OBsBhTbEfA");
        setIntField(term3994969, term3994969.getClass(), "playedMusicLevel3", -808782712);
        setIntField(term3994969, term3994969.getClass(), "achievement", 90412990);
        setIntField(term3994969, term3994969.getClass(), "score", 1630988178);
        setIntField(term3994969, term3994969.getClass(), "tapScore", -2134945372);
        setIntField(term3994969, term3994969.getClass(), "holdScore", 2065993224);
        setIntField(term3994969, term3994969.getClass(), "slideScore", -1903353516);
        setIntField(term3994969, term3994969.getClass(), "breakScore", 422237927);
        setIntField(term3994969, term3994969.getClass(), "syncRate", -1250342448);
        setIntField(term3994969, term3994969.getClass(), "vsWin", 1556473930);
        setBooleanField(term3994969, term3994969.getClass(), "isAllPerfect", true);
        setIntField(term3994969, term3994969.getClass(), "fullCombo", -714880044);
        setIntField(term3994969, term3994969.getClass(), "maxFever", -440394523);
        setIntField(term3994969, term3994969.getClass(), "maxCombo", -252952866);
        setIntField(term3994969, term3994969.getClass(), "tapPerfect", 949280663);
        setIntField(term3994969, term3994969.getClass(), "tapGreat", 1497634594);
        setIntField(term3994969, term3994969.getClass(), "tapGood", -1361285222);
        setIntField(term3994969, term3994969.getClass(), "tapBad", 931464287);
        setIntField(term3994969, term3994969.getClass(), "holdPerfect", -44749033);
        setIntField(term3994969, term3994969.getClass(), "holdGreat", 2140011438);
        setIntField(term3994969, term3994969.getClass(), "holdGood", 684893990);
        setIntField(term3994969, term3994969.getClass(), "holdBad", 1110077117);
        setIntField(term3994969, term3994969.getClass(), "slidePerfect", -1655031930);
        setIntField(term3994969, term3994969.getClass(), "slideGreat", -708035300);
        setIntField(term3994969, term3994969.getClass(), "slideGood", -1164950130);
        setIntField(term3994969, term3994969.getClass(), "slideBad", 1998102655);
        setIntField(term3994969, term3994969.getClass(), "breakPerfect", 1040317735);
        setIntField(term3994969, term3994969.getClass(), "breakGreat", 2116797222);
        setIntField(term3994969, term3994969.getClass(), "breakGood", -1870977072);
        setIntField(term3994969, term3994969.getClass(), "breakBad", -1244829749);
        setBooleanField(term3994969, term3994969.getClass(), "isTrackSkip", true);
        setBooleanField(term3994969, term3994969.getClass(), "isHighScore", true);
        setBooleanField(term3994969, term3994969.getClass(), "isChallengeTrack", true);
        setIntField(term3994969, term3994969.getClass(), "challengeLife", 353210616);
        setIntField(term3994969, term3994969.getClass(), "challengeRemain", -258663231);
        setIntField(term3994969, term3994969.getClass(), "isAllPerfectPlus", -581913546);
        term3995281 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term3995281;
        callMethod(klass, "setChallengeTrack", argTypes, term3994969, args);
    }

};


