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
     Object term168603;
     Object term168915;

    public UserPlaylog_setChallengeTrack_1472862235118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term168609 = new Long(-4905558793519537969L);
        term168603 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term168605 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term168607 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term168623 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term168624 = newInstance(Class.forName("java.time.LocalDate"));
        Object term168628 = newInstance(Class.forName("java.time.LocalTime"));
        Object term168633 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term168634 = newInstance(Class.forName("java.time.LocalDate"));
        Object term168638 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term168603, term168603.getClass(), "id", -9087544875525123832L);
        setLongField(term168605, term168605.getClass(), "id", -5307421637859729894L);
        setLongField(term168607, term168607.getClass(), "id", -7052314256530764447L);
        setField(term168607, term168607.getClass(), "extId", term168609);
        setField(term168607, term168607.getClass(), "luid", "kydwcBIblz");
        setIntField(term168624, term168624.getClass(), "year", 2015);
        setShortField(term168624, term168624.getClass(), "month", (short) 5);
        setShortField(term168624, term168624.getClass(), "day", (short) 3);
        setField(term168623, term168623.getClass(), "date", term168624);
        setByteField(term168628, term168628.getClass(), "hour", (byte) 15);
        setByteField(term168628, term168628.getClass(), "minute", (byte) 13);
        setByteField(term168628, term168628.getClass(), "second", (byte) 30);
        setIntField(term168628, term168628.getClass(), "nano", 724073253);
        setField(term168623, term168623.getClass(), "time", term168628);
        setField(term168607, term168607.getClass(), "registerTime", term168623);
        setIntField(term168634, term168634.getClass(), "year", 2026);
        setShortField(term168634, term168634.getClass(), "month", (short) 2);
        setShortField(term168634, term168634.getClass(), "day", (short) 4);
        setField(term168633, term168633.getClass(), "date", term168634);
        setByteField(term168638, term168638.getClass(), "hour", (byte) 23);
        setByteField(term168638, term168638.getClass(), "minute", (byte) 53);
        setByteField(term168638, term168638.getClass(), "second", (byte) 24);
        setIntField(term168638, term168638.getClass(), "nano", 653800614);
        setField(term168633, term168633.getClass(), "time", term168638);
        setField(term168607, term168607.getClass(), "accessTime", term168633);
        setField(term168605, term168605.getClass(), "card", term168607);
        setIntField(term168605, term168605.getClass(), "lastDataVersion", 1187309385);
        setField(term168605, term168605.getClass(), "userName", "uALaoojxvW");
        setIntField(term168605, term168605.getClass(), "point", 1360267925);
        setIntField(term168605, term168605.getClass(), "totalPoint", -233655523);
        setIntField(term168605, term168605.getClass(), "iconId", -970673768);
        setIntField(term168605, term168605.getClass(), "nameplateId", -231957549);
        setIntField(term168605, term168605.getClass(), "frameId", 1535019242);
        setIntField(term168605, term168605.getClass(), "trophyId", 426918157);
        setIntField(term168605, term168605.getClass(), "playCount", 582043286);
        setIntField(term168605, term168605.getClass(), "playVsCount", 2107777966);
        setIntField(term168605, term168605.getClass(), "playSyncCount", 1347083795);
        setIntField(term168605, term168605.getClass(), "winCount", 167846104);
        setIntField(term168605, term168605.getClass(), "helpCount", -857716498);
        setIntField(term168605, term168605.getClass(), "comboCount", -1683621105);
        setIntField(term168605, term168605.getClass(), "feverCount", 618291149);
        setIntField(term168605, term168605.getClass(), "totalHiScore", -570699973);
        setIntField(term168605, term168605.getClass(), "totalEasyHighScore", -1263476242);
        setIntField(term168605, term168605.getClass(), "totalBasicHighScore", -1662894949);
        setIntField(term168605, term168605.getClass(), "totalAdvancedHighScore", 277322130);
        setIntField(term168605, term168605.getClass(), "totalExpertHighScore", 978924008);
        setIntField(term168605, term168605.getClass(), "totalMasterHighScore", 1200256505);
        setIntField(term168605, term168605.getClass(), "totalReMasterHighScore", 1690799933);
        setIntField(term168605, term168605.getClass(), "totalHighSync", -929822762);
        setIntField(term168605, term168605.getClass(), "totalEasySync", 66218873);
        setIntField(term168605, term168605.getClass(), "totalBasicSync", 1468996453);
        setIntField(term168605, term168605.getClass(), "totalAdvancedSync", 1353358649);
        setIntField(term168605, term168605.getClass(), "totalExpertSync", 2132788108);
        setIntField(term168605, term168605.getClass(), "totalMasterSync", 146766497);
        setIntField(term168605, term168605.getClass(), "totalReMasterSync", 2103712678);
        setIntField(term168605, term168605.getClass(), "playerRating", 1129932929);
        setIntField(term168605, term168605.getClass(), "highestRating", -1863196178);
        setIntField(term168605, term168605.getClass(), "rankAuthTailId", 1155668132);
        setField(term168605, term168605.getClass(), "eventWatchedDate", "FrsBgmvjej");
        setField(term168605, term168605.getClass(), "webLimitDate", "OmLoZDdbMy");
        setIntField(term168605, term168605.getClass(), "challengeTrackPhase", -325131605);
        setIntField(term168605, term168605.getClass(), "firstPlayBits", 1589710919);
        setField(term168605, term168605.getClass(), "lastPlayDate", "mbNJbZsitQ");
        setIntField(term168605, term168605.getClass(), "lastPlaceId", -50295682);
        setField(term168605, term168605.getClass(), "lastPlaceName", "VMuWmeVPqW");
        setIntField(term168605, term168605.getClass(), "lastRegionId", -1462007032);
        setField(term168605, term168605.getClass(), "lastRegionName", "wtmpUxaoro");
        setField(term168605, term168605.getClass(), "lastClientId", "lZpqCAUiaE");
        setField(term168605, term168605.getClass(), "lastCountryCode", "rwsydXSAIm");
        setIntField(term168605, term168605.getClass(), "eventPoint", -1660485496);
        setIntField(term168605, term168605.getClass(), "totalLv", -1649288237);
        setIntField(term168605, term168605.getClass(), "lastLoginBonusDay", -770435769);
        setIntField(term168605, term168605.getClass(), "lastSurvivalBonusDay", -220111732);
        setIntField(term168605, term168605.getClass(), "loginBonusLv", 180625748);
        setField(term168603, term168603.getClass(), "user", term168605);
        setIntField(term168603, term168603.getClass(), "orderId", 844668565);
        setLongField(term168603, term168603.getClass(), "sortNumber", -5504583784484702218L);
        setIntField(term168603, term168603.getClass(), "placeId", 315657064);
        setField(term168603, term168603.getClass(), "placeName", "PXtEfvnxXo");
        setField(term168603, term168603.getClass(), "country", "VRanEGfPea");
        setIntField(term168603, term168603.getClass(), "regionId", -1005571751);
        setField(term168603, term168603.getClass(), "playDate", "aGdROcHtyG");
        setField(term168603, term168603.getClass(), "userPlayDate", "grxNCPTaxQ");
        setIntField(term168603, term168603.getClass(), "musicId", -1617354924);
        setIntField(term168603, term168603.getClass(), "level", 1474414973);
        setIntField(term168603, term168603.getClass(), "gameMode", 1260753874);
        setIntField(term168603, term168603.getClass(), "rivalNum", -1971639689);
        setIntField(term168603, term168603.getClass(), "track", 1975227224);
        setIntField(term168603, term168603.getClass(), "eventId", -936657526);
        setBooleanField(term168603, term168603.getClass(), "isFreeToPlay", true);
        setIntField(term168603, term168603.getClass(), "playerRating", 1541179984);
        setLongField(term168603, term168603.getClass(), "playedUserId1", -717218840624209572L);
        setField(term168603, term168603.getClass(), "playedUserName1", "VSAOMfeZza");
        setIntField(term168603, term168603.getClass(), "playedMusicLevel1", -972452734);
        setLongField(term168603, term168603.getClass(), "playedUserId2", -2831937652710360219L);
        setField(term168603, term168603.getClass(), "playedUserName2", "SfwPnHKjAh");
        setIntField(term168603, term168603.getClass(), "playedMusicLevel2", -1813411995);
        setLongField(term168603, term168603.getClass(), "playedUserId3", 5283775914828093148L);
        setField(term168603, term168603.getClass(), "playedUserName3", "slVCZJOwTn");
        setIntField(term168603, term168603.getClass(), "playedMusicLevel3", -1229769823);
        setIntField(term168603, term168603.getClass(), "achievement", 1173958343);
        setIntField(term168603, term168603.getClass(), "score", 788241820);
        setIntField(term168603, term168603.getClass(), "tapScore", -397070445);
        setIntField(term168603, term168603.getClass(), "holdScore", -1724002913);
        setIntField(term168603, term168603.getClass(), "slideScore", -266247489);
        setIntField(term168603, term168603.getClass(), "breakScore", 621473445);
        setIntField(term168603, term168603.getClass(), "syncRate", 790154552);
        setIntField(term168603, term168603.getClass(), "vsWin", 41166001);
        setBooleanField(term168603, term168603.getClass(), "isAllPerfect", false);
        setIntField(term168603, term168603.getClass(), "fullCombo", -1333478623);
        setIntField(term168603, term168603.getClass(), "maxFever", -861305943);
        setIntField(term168603, term168603.getClass(), "maxCombo", 123936838);
        setIntField(term168603, term168603.getClass(), "tapPerfect", -740431646);
        setIntField(term168603, term168603.getClass(), "tapGreat", -1912280510);
        setIntField(term168603, term168603.getClass(), "tapGood", 1344704410);
        setIntField(term168603, term168603.getClass(), "tapBad", -760280335);
        setIntField(term168603, term168603.getClass(), "holdPerfect", 1489495541);
        setIntField(term168603, term168603.getClass(), "holdGreat", -1477687777);
        setIntField(term168603, term168603.getClass(), "holdGood", -1011435714);
        setIntField(term168603, term168603.getClass(), "holdBad", -1990243436);
        setIntField(term168603, term168603.getClass(), "slidePerfect", -876281484);
        setIntField(term168603, term168603.getClass(), "slideGreat", -2070941974);
        setIntField(term168603, term168603.getClass(), "slideGood", 1221136234);
        setIntField(term168603, term168603.getClass(), "slideBad", -1841205035);
        setIntField(term168603, term168603.getClass(), "breakPerfect", 167282184);
        setIntField(term168603, term168603.getClass(), "breakGreat", 1896831429);
        setIntField(term168603, term168603.getClass(), "breakGood", -839824784);
        setIntField(term168603, term168603.getClass(), "breakBad", 1560898566);
        setBooleanField(term168603, term168603.getClass(), "isTrackSkip", false);
        setBooleanField(term168603, term168603.getClass(), "isHighScore", false);
        setBooleanField(term168603, term168603.getClass(), "isChallengeTrack", true);
        setIntField(term168603, term168603.getClass(), "challengeLife", 191451147);
        setIntField(term168603, term168603.getClass(), "challengeRemain", -415546420);
        setIntField(term168603, term168603.getClass(), "isAllPerfectPlus", 1883424981);
        term168915 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term168915;
        callMethod(klass, "setChallengeTrack", argTypes, term168603, args);
    }

};


