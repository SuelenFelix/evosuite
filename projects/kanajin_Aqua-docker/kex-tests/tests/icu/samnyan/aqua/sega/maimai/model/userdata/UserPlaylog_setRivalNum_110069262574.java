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

public class UserPlaylog_setRivalNum_110069262574 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term147687;
     Object term147999;

    public UserPlaylog_setRivalNum_110069262574() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term147693 = new Long(-7370364068296402536L);
        term147687 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term147689 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term147691 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term147707 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term147708 = newInstance(Class.forName("java.time.LocalDate"));
        Object term147712 = newInstance(Class.forName("java.time.LocalTime"));
        Object term147717 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term147718 = newInstance(Class.forName("java.time.LocalDate"));
        Object term147722 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term147687, term147687.getClass(), "id", -4450089717153471904L);
        setLongField(term147689, term147689.getClass(), "id", 8555372807363389523L);
        setLongField(term147691, term147691.getClass(), "id", 4135693817001955957L);
        setField(term147691, term147691.getClass(), "extId", term147693);
        setField(term147691, term147691.getClass(), "luid", "wOuPdBQeOx");
        setIntField(term147708, term147708.getClass(), "year", 2023);
        setShortField(term147708, term147708.getClass(), "month", (short) 5);
        setShortField(term147708, term147708.getClass(), "day", (short) 31);
        setField(term147707, term147707.getClass(), "date", term147708);
        setByteField(term147712, term147712.getClass(), "hour", (byte) 3);
        setByteField(term147712, term147712.getClass(), "minute", (byte) 15);
        setByteField(term147712, term147712.getClass(), "second", (byte) 34);
        setIntField(term147712, term147712.getClass(), "nano", 794699238);
        setField(term147707, term147707.getClass(), "time", term147712);
        setField(term147691, term147691.getClass(), "registerTime", term147707);
        setIntField(term147718, term147718.getClass(), "year", 2013);
        setShortField(term147718, term147718.getClass(), "month", (short) 10);
        setShortField(term147718, term147718.getClass(), "day", (short) 1);
        setField(term147717, term147717.getClass(), "date", term147718);
        setByteField(term147722, term147722.getClass(), "hour", (byte) 21);
        setByteField(term147722, term147722.getClass(), "minute", (byte) 9);
        setByteField(term147722, term147722.getClass(), "second", (byte) 5);
        setIntField(term147722, term147722.getClass(), "nano", 986326309);
        setField(term147717, term147717.getClass(), "time", term147722);
        setField(term147691, term147691.getClass(), "accessTime", term147717);
        setField(term147689, term147689.getClass(), "card", term147691);
        setIntField(term147689, term147689.getClass(), "lastDataVersion", 270920292);
        setField(term147689, term147689.getClass(), "userName", "qKKlbLWTDU");
        setIntField(term147689, term147689.getClass(), "point", 1123722965);
        setIntField(term147689, term147689.getClass(), "totalPoint", -291983343);
        setIntField(term147689, term147689.getClass(), "iconId", 1903320728);
        setIntField(term147689, term147689.getClass(), "nameplateId", 146563883);
        setIntField(term147689, term147689.getClass(), "frameId", 1799665489);
        setIntField(term147689, term147689.getClass(), "trophyId", 169721628);
        setIntField(term147689, term147689.getClass(), "playCount", -1490169360);
        setIntField(term147689, term147689.getClass(), "playVsCount", 69395748);
        setIntField(term147689, term147689.getClass(), "playSyncCount", 378800126);
        setIntField(term147689, term147689.getClass(), "winCount", -1992116727);
        setIntField(term147689, term147689.getClass(), "helpCount", 640309304);
        setIntField(term147689, term147689.getClass(), "comboCount", -219854717);
        setIntField(term147689, term147689.getClass(), "feverCount", 873009421);
        setIntField(term147689, term147689.getClass(), "totalHiScore", 262200959);
        setIntField(term147689, term147689.getClass(), "totalEasyHighScore", 974169701);
        setIntField(term147689, term147689.getClass(), "totalBasicHighScore", -314909077);
        setIntField(term147689, term147689.getClass(), "totalAdvancedHighScore", 1607017048);
        setIntField(term147689, term147689.getClass(), "totalExpertHighScore", -99136729);
        setIntField(term147689, term147689.getClass(), "totalMasterHighScore", -355824448);
        setIntField(term147689, term147689.getClass(), "totalReMasterHighScore", 852249692);
        setIntField(term147689, term147689.getClass(), "totalHighSync", 1951861706);
        setIntField(term147689, term147689.getClass(), "totalEasySync", -586915273);
        setIntField(term147689, term147689.getClass(), "totalBasicSync", -2047610899);
        setIntField(term147689, term147689.getClass(), "totalAdvancedSync", 926362344);
        setIntField(term147689, term147689.getClass(), "totalExpertSync", -2061277187);
        setIntField(term147689, term147689.getClass(), "totalMasterSync", -571146931);
        setIntField(term147689, term147689.getClass(), "totalReMasterSync", 1416875561);
        setIntField(term147689, term147689.getClass(), "playerRating", 1101028268);
        setIntField(term147689, term147689.getClass(), "highestRating", 503606564);
        setIntField(term147689, term147689.getClass(), "rankAuthTailId", -1450888579);
        setField(term147689, term147689.getClass(), "eventWatchedDate", "vtiTWIgEVa");
        setField(term147689, term147689.getClass(), "webLimitDate", "eLERRBMHza");
        setIntField(term147689, term147689.getClass(), "challengeTrackPhase", -162933550);
        setIntField(term147689, term147689.getClass(), "firstPlayBits", -2059318658);
        setField(term147689, term147689.getClass(), "lastPlayDate", "nNDwdMSbzC");
        setIntField(term147689, term147689.getClass(), "lastPlaceId", -740333526);
        setField(term147689, term147689.getClass(), "lastPlaceName", "cIeVoTDYCV");
        setIntField(term147689, term147689.getClass(), "lastRegionId", 224139949);
        setField(term147689, term147689.getClass(), "lastRegionName", "zHjWGfGucL");
        setField(term147689, term147689.getClass(), "lastClientId", "BrQDOXlSKX");
        setField(term147689, term147689.getClass(), "lastCountryCode", "rqZXFCcyZu");
        setIntField(term147689, term147689.getClass(), "eventPoint", -731821524);
        setIntField(term147689, term147689.getClass(), "totalLv", -1897165341);
        setIntField(term147689, term147689.getClass(), "lastLoginBonusDay", -1429453285);
        setIntField(term147689, term147689.getClass(), "lastSurvivalBonusDay", -1024644833);
        setIntField(term147689, term147689.getClass(), "loginBonusLv", 1040338785);
        setField(term147687, term147687.getClass(), "user", term147689);
        setIntField(term147687, term147687.getClass(), "orderId", -482239805);
        setLongField(term147687, term147687.getClass(), "sortNumber", -3822804973679381574L);
        setIntField(term147687, term147687.getClass(), "placeId", 664653763);
        setField(term147687, term147687.getClass(), "placeName", "rGcDZdOanr");
        setField(term147687, term147687.getClass(), "country", "qlnQoljKQM");
        setIntField(term147687, term147687.getClass(), "regionId", 2134829135);
        setField(term147687, term147687.getClass(), "playDate", "RMEDwLGQoG");
        setField(term147687, term147687.getClass(), "userPlayDate", "wZEFxRSqVY");
        setIntField(term147687, term147687.getClass(), "musicId", -1719222583);
        setIntField(term147687, term147687.getClass(), "level", 437944159);
        setIntField(term147687, term147687.getClass(), "gameMode", -2076214380);
        setIntField(term147687, term147687.getClass(), "rivalNum", -1080020994);
        setIntField(term147687, term147687.getClass(), "track", -1903678868);
        setIntField(term147687, term147687.getClass(), "eventId", 1081203074);
        setBooleanField(term147687, term147687.getClass(), "isFreeToPlay", true);
        setIntField(term147687, term147687.getClass(), "playerRating", 168032716);
        setLongField(term147687, term147687.getClass(), "playedUserId1", 8503915599730893579L);
        setField(term147687, term147687.getClass(), "playedUserName1", "tHcDbcviFO");
        setIntField(term147687, term147687.getClass(), "playedMusicLevel1", 942811278);
        setLongField(term147687, term147687.getClass(), "playedUserId2", 995860001169768274L);
        setField(term147687, term147687.getClass(), "playedUserName2", "cmEWCrpoCO");
        setIntField(term147687, term147687.getClass(), "playedMusicLevel2", -15679804);
        setLongField(term147687, term147687.getClass(), "playedUserId3", 1369830788516662006L);
        setField(term147687, term147687.getClass(), "playedUserName3", "OApdoCtolu");
        setIntField(term147687, term147687.getClass(), "playedMusicLevel3", -492536842);
        setIntField(term147687, term147687.getClass(), "achievement", 151903958);
        setIntField(term147687, term147687.getClass(), "score", 12496784);
        setIntField(term147687, term147687.getClass(), "tapScore", -844034618);
        setIntField(term147687, term147687.getClass(), "holdScore", -1748142279);
        setIntField(term147687, term147687.getClass(), "slideScore", -491909135);
        setIntField(term147687, term147687.getClass(), "breakScore", 867692955);
        setIntField(term147687, term147687.getClass(), "syncRate", -604436957);
        setIntField(term147687, term147687.getClass(), "vsWin", -199329423);
        setBooleanField(term147687, term147687.getClass(), "isAllPerfect", true);
        setIntField(term147687, term147687.getClass(), "fullCombo", -1406544369);
        setIntField(term147687, term147687.getClass(), "maxFever", 1404521823);
        setIntField(term147687, term147687.getClass(), "maxCombo", -269313334);
        setIntField(term147687, term147687.getClass(), "tapPerfect", 1447672220);
        setIntField(term147687, term147687.getClass(), "tapGreat", -1173046529);
        setIntField(term147687, term147687.getClass(), "tapGood", 1923011577);
        setIntField(term147687, term147687.getClass(), "tapBad", -1675567439);
        setIntField(term147687, term147687.getClass(), "holdPerfect", 1925374475);
        setIntField(term147687, term147687.getClass(), "holdGreat", -125266739);
        setIntField(term147687, term147687.getClass(), "holdGood", 1407318663);
        setIntField(term147687, term147687.getClass(), "holdBad", 879663317);
        setIntField(term147687, term147687.getClass(), "slidePerfect", -503337456);
        setIntField(term147687, term147687.getClass(), "slideGreat", 71852904);
        setIntField(term147687, term147687.getClass(), "slideGood", -22064897);
        setIntField(term147687, term147687.getClass(), "slideBad", -408710017);
        setIntField(term147687, term147687.getClass(), "breakPerfect", 1412968182);
        setIntField(term147687, term147687.getClass(), "breakGreat", 444654725);
        setIntField(term147687, term147687.getClass(), "breakGood", -436317636);
        setIntField(term147687, term147687.getClass(), "breakBad", 1621635528);
        setBooleanField(term147687, term147687.getClass(), "isTrackSkip", false);
        setBooleanField(term147687, term147687.getClass(), "isHighScore", true);
        setBooleanField(term147687, term147687.getClass(), "isChallengeTrack", false);
        setIntField(term147687, term147687.getClass(), "challengeLife", -1598952399);
        setIntField(term147687, term147687.getClass(), "challengeRemain", -492568124);
        setIntField(term147687, term147687.getClass(), "isAllPerfectPlus", -1054760615);
        term147999 = new Integer(-1051526562);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term147999;
        callMethod(klass, "setRivalNum", argTypes, term147687, args);
    }

};


