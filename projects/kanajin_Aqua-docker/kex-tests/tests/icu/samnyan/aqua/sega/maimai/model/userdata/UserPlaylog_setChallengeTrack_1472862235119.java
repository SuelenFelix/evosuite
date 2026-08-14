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

public class UserPlaylog_setChallengeTrack_1472862235119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term168659;
     Object term168971;

    public UserPlaylog_setChallengeTrack_1472862235119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term168665 = new Long(-4905558793519537969L);
        term168659 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term168661 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term168663 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term168679 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term168680 = newInstance(Class.forName("java.time.LocalDate"));
        Object term168684 = newInstance(Class.forName("java.time.LocalTime"));
        Object term168689 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term168690 = newInstance(Class.forName("java.time.LocalDate"));
        Object term168694 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term168659, term168659.getClass(), "id", -9087544875525123832L);
        setLongField(term168661, term168661.getClass(), "id", -5307421637859729894L);
        setLongField(term168663, term168663.getClass(), "id", -7052314256530764447L);
        setField(term168663, term168663.getClass(), "extId", term168665);
        setField(term168663, term168663.getClass(), "luid", "kydwcBIblz");
        setIntField(term168680, term168680.getClass(), "year", 2015);
        setShortField(term168680, term168680.getClass(), "month", (short) 5);
        setShortField(term168680, term168680.getClass(), "day", (short) 3);
        setField(term168679, term168679.getClass(), "date", term168680);
        setByteField(term168684, term168684.getClass(), "hour", (byte) 15);
        setByteField(term168684, term168684.getClass(), "minute", (byte) 13);
        setByteField(term168684, term168684.getClass(), "second", (byte) 30);
        setIntField(term168684, term168684.getClass(), "nano", 724073253);
        setField(term168679, term168679.getClass(), "time", term168684);
        setField(term168663, term168663.getClass(), "registerTime", term168679);
        setIntField(term168690, term168690.getClass(), "year", 2026);
        setShortField(term168690, term168690.getClass(), "month", (short) 2);
        setShortField(term168690, term168690.getClass(), "day", (short) 4);
        setField(term168689, term168689.getClass(), "date", term168690);
        setByteField(term168694, term168694.getClass(), "hour", (byte) 23);
        setByteField(term168694, term168694.getClass(), "minute", (byte) 53);
        setByteField(term168694, term168694.getClass(), "second", (byte) 24);
        setIntField(term168694, term168694.getClass(), "nano", 653800614);
        setField(term168689, term168689.getClass(), "time", term168694);
        setField(term168663, term168663.getClass(), "accessTime", term168689);
        setField(term168661, term168661.getClass(), "card", term168663);
        setIntField(term168661, term168661.getClass(), "lastDataVersion", 1187309385);
        setField(term168661, term168661.getClass(), "userName", "uALaoojxvW");
        setIntField(term168661, term168661.getClass(), "point", 1360267925);
        setIntField(term168661, term168661.getClass(), "totalPoint", -233655523);
        setIntField(term168661, term168661.getClass(), "iconId", -970673768);
        setIntField(term168661, term168661.getClass(), "nameplateId", -231957549);
        setIntField(term168661, term168661.getClass(), "frameId", 1535019242);
        setIntField(term168661, term168661.getClass(), "trophyId", 426918157);
        setIntField(term168661, term168661.getClass(), "playCount", 582043286);
        setIntField(term168661, term168661.getClass(), "playVsCount", 2107777966);
        setIntField(term168661, term168661.getClass(), "playSyncCount", 1347083795);
        setIntField(term168661, term168661.getClass(), "winCount", 167846104);
        setIntField(term168661, term168661.getClass(), "helpCount", -857716498);
        setIntField(term168661, term168661.getClass(), "comboCount", -1683621105);
        setIntField(term168661, term168661.getClass(), "feverCount", 618291149);
        setIntField(term168661, term168661.getClass(), "totalHiScore", -570699973);
        setIntField(term168661, term168661.getClass(), "totalEasyHighScore", -1263476242);
        setIntField(term168661, term168661.getClass(), "totalBasicHighScore", -1662894949);
        setIntField(term168661, term168661.getClass(), "totalAdvancedHighScore", 277322130);
        setIntField(term168661, term168661.getClass(), "totalExpertHighScore", 978924008);
        setIntField(term168661, term168661.getClass(), "totalMasterHighScore", 1200256505);
        setIntField(term168661, term168661.getClass(), "totalReMasterHighScore", 1690799933);
        setIntField(term168661, term168661.getClass(), "totalHighSync", -929822762);
        setIntField(term168661, term168661.getClass(), "totalEasySync", 66218873);
        setIntField(term168661, term168661.getClass(), "totalBasicSync", 1468996453);
        setIntField(term168661, term168661.getClass(), "totalAdvancedSync", 1353358649);
        setIntField(term168661, term168661.getClass(), "totalExpertSync", 2132788108);
        setIntField(term168661, term168661.getClass(), "totalMasterSync", 146766497);
        setIntField(term168661, term168661.getClass(), "totalReMasterSync", 2103712678);
        setIntField(term168661, term168661.getClass(), "playerRating", 1129932929);
        setIntField(term168661, term168661.getClass(), "highestRating", -1863196178);
        setIntField(term168661, term168661.getClass(), "rankAuthTailId", 1155668132);
        setField(term168661, term168661.getClass(), "eventWatchedDate", "FrsBgmvjej");
        setField(term168661, term168661.getClass(), "webLimitDate", "OmLoZDdbMy");
        setIntField(term168661, term168661.getClass(), "challengeTrackPhase", -325131605);
        setIntField(term168661, term168661.getClass(), "firstPlayBits", 1589710919);
        setField(term168661, term168661.getClass(), "lastPlayDate", "mbNJbZsitQ");
        setIntField(term168661, term168661.getClass(), "lastPlaceId", -50295682);
        setField(term168661, term168661.getClass(), "lastPlaceName", "VMuWmeVPqW");
        setIntField(term168661, term168661.getClass(), "lastRegionId", -1462007032);
        setField(term168661, term168661.getClass(), "lastRegionName", "wtmpUxaoro");
        setField(term168661, term168661.getClass(), "lastClientId", "lZpqCAUiaE");
        setField(term168661, term168661.getClass(), "lastCountryCode", "rwsydXSAIm");
        setIntField(term168661, term168661.getClass(), "eventPoint", -1660485496);
        setIntField(term168661, term168661.getClass(), "totalLv", -1649288237);
        setIntField(term168661, term168661.getClass(), "lastLoginBonusDay", -770435769);
        setIntField(term168661, term168661.getClass(), "lastSurvivalBonusDay", -220111732);
        setIntField(term168661, term168661.getClass(), "loginBonusLv", 180625748);
        setField(term168659, term168659.getClass(), "user", term168661);
        setIntField(term168659, term168659.getClass(), "orderId", 844668565);
        setLongField(term168659, term168659.getClass(), "sortNumber", -5504583784484702218L);
        setIntField(term168659, term168659.getClass(), "placeId", 315657064);
        setField(term168659, term168659.getClass(), "placeName", "PXtEfvnxXo");
        setField(term168659, term168659.getClass(), "country", "VRanEGfPea");
        setIntField(term168659, term168659.getClass(), "regionId", -1005571751);
        setField(term168659, term168659.getClass(), "playDate", "aGdROcHtyG");
        setField(term168659, term168659.getClass(), "userPlayDate", "grxNCPTaxQ");
        setIntField(term168659, term168659.getClass(), "musicId", -1617354924);
        setIntField(term168659, term168659.getClass(), "level", 1474414973);
        setIntField(term168659, term168659.getClass(), "gameMode", 1260753874);
        setIntField(term168659, term168659.getClass(), "rivalNum", -1971639689);
        setIntField(term168659, term168659.getClass(), "track", 1975227224);
        setIntField(term168659, term168659.getClass(), "eventId", -936657526);
        setBooleanField(term168659, term168659.getClass(), "isFreeToPlay", true);
        setIntField(term168659, term168659.getClass(), "playerRating", 1541179984);
        setLongField(term168659, term168659.getClass(), "playedUserId1", -717218840624209572L);
        setField(term168659, term168659.getClass(), "playedUserName1", "VSAOMfeZza");
        setIntField(term168659, term168659.getClass(), "playedMusicLevel1", -972452734);
        setLongField(term168659, term168659.getClass(), "playedUserId2", -2831937652710360219L);
        setField(term168659, term168659.getClass(), "playedUserName2", "SfwPnHKjAh");
        setIntField(term168659, term168659.getClass(), "playedMusicLevel2", -1813411995);
        setLongField(term168659, term168659.getClass(), "playedUserId3", 5283775914828093148L);
        setField(term168659, term168659.getClass(), "playedUserName3", "slVCZJOwTn");
        setIntField(term168659, term168659.getClass(), "playedMusicLevel3", -1229769823);
        setIntField(term168659, term168659.getClass(), "achievement", 1173958343);
        setIntField(term168659, term168659.getClass(), "score", 788241820);
        setIntField(term168659, term168659.getClass(), "tapScore", -397070445);
        setIntField(term168659, term168659.getClass(), "holdScore", -1724002913);
        setIntField(term168659, term168659.getClass(), "slideScore", -266247489);
        setIntField(term168659, term168659.getClass(), "breakScore", 621473445);
        setIntField(term168659, term168659.getClass(), "syncRate", 790154552);
        setIntField(term168659, term168659.getClass(), "vsWin", 41166001);
        setBooleanField(term168659, term168659.getClass(), "isAllPerfect", false);
        setIntField(term168659, term168659.getClass(), "fullCombo", -1333478623);
        setIntField(term168659, term168659.getClass(), "maxFever", -861305943);
        setIntField(term168659, term168659.getClass(), "maxCombo", 123936838);
        setIntField(term168659, term168659.getClass(), "tapPerfect", -740431646);
        setIntField(term168659, term168659.getClass(), "tapGreat", -1912280510);
        setIntField(term168659, term168659.getClass(), "tapGood", 1344704410);
        setIntField(term168659, term168659.getClass(), "tapBad", -760280335);
        setIntField(term168659, term168659.getClass(), "holdPerfect", 1489495541);
        setIntField(term168659, term168659.getClass(), "holdGreat", -1477687777);
        setIntField(term168659, term168659.getClass(), "holdGood", -1011435714);
        setIntField(term168659, term168659.getClass(), "holdBad", -1990243436);
        setIntField(term168659, term168659.getClass(), "slidePerfect", -876281484);
        setIntField(term168659, term168659.getClass(), "slideGreat", -2070941974);
        setIntField(term168659, term168659.getClass(), "slideGood", 1221136234);
        setIntField(term168659, term168659.getClass(), "slideBad", -1841205035);
        setIntField(term168659, term168659.getClass(), "breakPerfect", 167282184);
        setIntField(term168659, term168659.getClass(), "breakGreat", 1896831429);
        setIntField(term168659, term168659.getClass(), "breakGood", -839824784);
        setIntField(term168659, term168659.getClass(), "breakBad", 1560898566);
        setBooleanField(term168659, term168659.getClass(), "isTrackSkip", false);
        setBooleanField(term168659, term168659.getClass(), "isHighScore", false);
        setBooleanField(term168659, term168659.getClass(), "isChallengeTrack", true);
        setIntField(term168659, term168659.getClass(), "challengeLife", 191451147);
        setIntField(term168659, term168659.getClass(), "challengeRemain", -415546420);
        setIntField(term168659, term168659.getClass(), "isAllPerfectPlus", 1883424981);
        term168971 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term168971;
        callMethod(klass, "setChallengeTrack", argTypes, term168659, args);
    }

};


