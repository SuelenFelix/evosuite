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

public class UserPlaylog_setEventId_112402108476 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term148635;
     Object term148947;

    public UserPlaylog_setEventId_112402108476() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term148641 = new Long(1193381106528373019L);
        term148635 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term148637 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term148639 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term148655 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term148656 = newInstance(Class.forName("java.time.LocalDate"));
        Object term148660 = newInstance(Class.forName("java.time.LocalTime"));
        Object term148665 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term148666 = newInstance(Class.forName("java.time.LocalDate"));
        Object term148670 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term148635, term148635.getClass(), "id", -4520530213003895999L);
        setLongField(term148637, term148637.getClass(), "id", 1915067600167472834L);
        setLongField(term148639, term148639.getClass(), "id", -5052214162065838650L);
        setField(term148639, term148639.getClass(), "extId", term148641);
        setField(term148639, term148639.getClass(), "luid", "wsWWrTxdcC");
        setIntField(term148656, term148656.getClass(), "year", 2029);
        setShortField(term148656, term148656.getClass(), "month", (short) 8);
        setShortField(term148656, term148656.getClass(), "day", (short) 27);
        setField(term148655, term148655.getClass(), "date", term148656);
        setByteField(term148660, term148660.getClass(), "hour", (byte) 10);
        setByteField(term148660, term148660.getClass(), "minute", (byte) 54);
        setByteField(term148660, term148660.getClass(), "second", (byte) 17);
        setIntField(term148660, term148660.getClass(), "nano", 953558700);
        setField(term148655, term148655.getClass(), "time", term148660);
        setField(term148639, term148639.getClass(), "registerTime", term148655);
        setIntField(term148666, term148666.getClass(), "year", 2012);
        setShortField(term148666, term148666.getClass(), "month", (short) 1);
        setShortField(term148666, term148666.getClass(), "day", (short) 12);
        setField(term148665, term148665.getClass(), "date", term148666);
        setByteField(term148670, term148670.getClass(), "hour", (byte) 16);
        setByteField(term148670, term148670.getClass(), "minute", (byte) 4);
        setByteField(term148670, term148670.getClass(), "second", (byte) 10);
        setIntField(term148670, term148670.getClass(), "nano", 245911854);
        setField(term148665, term148665.getClass(), "time", term148670);
        setField(term148639, term148639.getClass(), "accessTime", term148665);
        setField(term148637, term148637.getClass(), "card", term148639);
        setIntField(term148637, term148637.getClass(), "lastDataVersion", 1912303002);
        setField(term148637, term148637.getClass(), "userName", "UPDwVukZbZ");
        setIntField(term148637, term148637.getClass(), "point", 841275891);
        setIntField(term148637, term148637.getClass(), "totalPoint", 1227667358);
        setIntField(term148637, term148637.getClass(), "iconId", -337967801);
        setIntField(term148637, term148637.getClass(), "nameplateId", -249491798);
        setIntField(term148637, term148637.getClass(), "frameId", -2037907670);
        setIntField(term148637, term148637.getClass(), "trophyId", -2012031870);
        setIntField(term148637, term148637.getClass(), "playCount", -1653068374);
        setIntField(term148637, term148637.getClass(), "playVsCount", 2031019868);
        setIntField(term148637, term148637.getClass(), "playSyncCount", 2017946383);
        setIntField(term148637, term148637.getClass(), "winCount", -1410381787);
        setIntField(term148637, term148637.getClass(), "helpCount", 1239942527);
        setIntField(term148637, term148637.getClass(), "comboCount", -1210859103);
        setIntField(term148637, term148637.getClass(), "feverCount", 490331672);
        setIntField(term148637, term148637.getClass(), "totalHiScore", 1630658432);
        setIntField(term148637, term148637.getClass(), "totalEasyHighScore", 391740930);
        setIntField(term148637, term148637.getClass(), "totalBasicHighScore", -1628180576);
        setIntField(term148637, term148637.getClass(), "totalAdvancedHighScore", 492708361);
        setIntField(term148637, term148637.getClass(), "totalExpertHighScore", -1291238125);
        setIntField(term148637, term148637.getClass(), "totalMasterHighScore", 43815341);
        setIntField(term148637, term148637.getClass(), "totalReMasterHighScore", 870044581);
        setIntField(term148637, term148637.getClass(), "totalHighSync", 1186211038);
        setIntField(term148637, term148637.getClass(), "totalEasySync", -1892922379);
        setIntField(term148637, term148637.getClass(), "totalBasicSync", 1673212855);
        setIntField(term148637, term148637.getClass(), "totalAdvancedSync", -1310821543);
        setIntField(term148637, term148637.getClass(), "totalExpertSync", -1965924883);
        setIntField(term148637, term148637.getClass(), "totalMasterSync", 1820612652);
        setIntField(term148637, term148637.getClass(), "totalReMasterSync", 62075868);
        setIntField(term148637, term148637.getClass(), "playerRating", -1112700365);
        setIntField(term148637, term148637.getClass(), "highestRating", 1686757708);
        setIntField(term148637, term148637.getClass(), "rankAuthTailId", -1817872322);
        setField(term148637, term148637.getClass(), "eventWatchedDate", "nFQQbKAYNp");
        setField(term148637, term148637.getClass(), "webLimitDate", "VQkWATPAEW");
        setIntField(term148637, term148637.getClass(), "challengeTrackPhase", -888923549);
        setIntField(term148637, term148637.getClass(), "firstPlayBits", 1998311214);
        setField(term148637, term148637.getClass(), "lastPlayDate", "giGfkdhPAE");
        setIntField(term148637, term148637.getClass(), "lastPlaceId", 1278068079);
        setField(term148637, term148637.getClass(), "lastPlaceName", "wNfBmUuDuP");
        setIntField(term148637, term148637.getClass(), "lastRegionId", -1313471481);
        setField(term148637, term148637.getClass(), "lastRegionName", "lNTNKavUNL");
        setField(term148637, term148637.getClass(), "lastClientId", "BXfmFjgpOy");
        setField(term148637, term148637.getClass(), "lastCountryCode", "JCeHaSFOWK");
        setIntField(term148637, term148637.getClass(), "eventPoint", -1435484067);
        setIntField(term148637, term148637.getClass(), "totalLv", 1708220860);
        setIntField(term148637, term148637.getClass(), "lastLoginBonusDay", -1556562154);
        setIntField(term148637, term148637.getClass(), "lastSurvivalBonusDay", 1714476237);
        setIntField(term148637, term148637.getClass(), "loginBonusLv", 2139138090);
        setField(term148635, term148635.getClass(), "user", term148637);
        setIntField(term148635, term148635.getClass(), "orderId", 1269142010);
        setLongField(term148635, term148635.getClass(), "sortNumber", -94222650078853780L);
        setIntField(term148635, term148635.getClass(), "placeId", -1772742811);
        setField(term148635, term148635.getClass(), "placeName", "PNtiQWTZzA");
        setField(term148635, term148635.getClass(), "country", "raishRurKx");
        setIntField(term148635, term148635.getClass(), "regionId", -1358271855);
        setField(term148635, term148635.getClass(), "playDate", "PpeSAmBPlT");
        setField(term148635, term148635.getClass(), "userPlayDate", "XmRRZpyFKp");
        setIntField(term148635, term148635.getClass(), "musicId", -1051764159);
        setIntField(term148635, term148635.getClass(), "level", 47216676);
        setIntField(term148635, term148635.getClass(), "gameMode", 2105630804);
        setIntField(term148635, term148635.getClass(), "rivalNum", 1450349223);
        setIntField(term148635, term148635.getClass(), "track", 538200623);
        setIntField(term148635, term148635.getClass(), "eventId", -1705373878);
        setBooleanField(term148635, term148635.getClass(), "isFreeToPlay", false);
        setIntField(term148635, term148635.getClass(), "playerRating", 2135067465);
        setLongField(term148635, term148635.getClass(), "playedUserId1", -2164399567942958295L);
        setField(term148635, term148635.getClass(), "playedUserName1", "QXOnXJGHZk");
        setIntField(term148635, term148635.getClass(), "playedMusicLevel1", -2031000696);
        setLongField(term148635, term148635.getClass(), "playedUserId2", 6485127487584904536L);
        setField(term148635, term148635.getClass(), "playedUserName2", "tckSURIPmO");
        setIntField(term148635, term148635.getClass(), "playedMusicLevel2", -1624438817);
        setLongField(term148635, term148635.getClass(), "playedUserId3", 6217646173265243924L);
        setField(term148635, term148635.getClass(), "playedUserName3", "GZSnqwBCPQ");
        setIntField(term148635, term148635.getClass(), "playedMusicLevel3", -1219246269);
        setIntField(term148635, term148635.getClass(), "achievement", -733854206);
        setIntField(term148635, term148635.getClass(), "score", 926392807);
        setIntField(term148635, term148635.getClass(), "tapScore", 1041744156);
        setIntField(term148635, term148635.getClass(), "holdScore", -389758494);
        setIntField(term148635, term148635.getClass(), "slideScore", 1171046840);
        setIntField(term148635, term148635.getClass(), "breakScore", 1407705857);
        setIntField(term148635, term148635.getClass(), "syncRate", -178366636);
        setIntField(term148635, term148635.getClass(), "vsWin", -1778372760);
        setBooleanField(term148635, term148635.getClass(), "isAllPerfect", false);
        setIntField(term148635, term148635.getClass(), "fullCombo", 311904385);
        setIntField(term148635, term148635.getClass(), "maxFever", 471793721);
        setIntField(term148635, term148635.getClass(), "maxCombo", -1728672353);
        setIntField(term148635, term148635.getClass(), "tapPerfect", -1365213640);
        setIntField(term148635, term148635.getClass(), "tapGreat", -1686158091);
        setIntField(term148635, term148635.getClass(), "tapGood", -1831358493);
        setIntField(term148635, term148635.getClass(), "tapBad", 1449693950);
        setIntField(term148635, term148635.getClass(), "holdPerfect", 1876513233);
        setIntField(term148635, term148635.getClass(), "holdGreat", 1279238164);
        setIntField(term148635, term148635.getClass(), "holdGood", -860989601);
        setIntField(term148635, term148635.getClass(), "holdBad", -1034064665);
        setIntField(term148635, term148635.getClass(), "slidePerfect", -948079369);
        setIntField(term148635, term148635.getClass(), "slideGreat", 2088999271);
        setIntField(term148635, term148635.getClass(), "slideGood", 742877802);
        setIntField(term148635, term148635.getClass(), "slideBad", 1128990209);
        setIntField(term148635, term148635.getClass(), "breakPerfect", -382387405);
        setIntField(term148635, term148635.getClass(), "breakGreat", 1116503396);
        setIntField(term148635, term148635.getClass(), "breakGood", -789845072);
        setIntField(term148635, term148635.getClass(), "breakBad", -1509169877);
        setBooleanField(term148635, term148635.getClass(), "isTrackSkip", true);
        setBooleanField(term148635, term148635.getClass(), "isHighScore", false);
        setBooleanField(term148635, term148635.getClass(), "isChallengeTrack", false);
        setIntField(term148635, term148635.getClass(), "challengeLife", 288687486);
        setIntField(term148635, term148635.getClass(), "challengeRemain", -1005461994);
        setIntField(term148635, term148635.getClass(), "isAllPerfectPlus", -401284444);
        term148947 = new Integer(-1718824766);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term148947;
        callMethod(klass, "setEventId", argTypes, term148635, args);
    }

};


