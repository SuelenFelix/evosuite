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

public class UserPlaylog_setHoldBad_19618261107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3989755;
     Object term3990067;

    public UserPlaylog_setHoldBad_19618261107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3989761 = new Long(1570467111691681029L);
        term3989755 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term3989757 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term3989759 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term3989775 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3989776 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3989780 = newInstance(Class.forName("java.time.LocalTime"));
        Object term3989785 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3989786 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3989790 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term3989755, term3989755.getClass(), "id", -7631008929120738483L);
        setLongField(term3989757, term3989757.getClass(), "id", 2744480392642003703L);
        setLongField(term3989759, term3989759.getClass(), "id", -6765597715174771L);
        setField(term3989759, term3989759.getClass(), "extId", term3989761);
        setField(term3989759, term3989759.getClass(), "luid", "XysYCtJfLm");
        setIntField(term3989776, term3989776.getClass(), "year", 2021);
        setShortField(term3989776, term3989776.getClass(), "month", (short) 12);
        setShortField(term3989776, term3989776.getClass(), "day", (short) 6);
        setField(term3989775, term3989775.getClass(), "date", term3989776);
        setByteField(term3989780, term3989780.getClass(), "hour", (byte) 9);
        setByteField(term3989780, term3989780.getClass(), "minute", (byte) 23);
        setByteField(term3989780, term3989780.getClass(), "second", (byte) 2);
        setIntField(term3989780, term3989780.getClass(), "nano", 664867952);
        setField(term3989775, term3989775.getClass(), "time", term3989780);
        setField(term3989759, term3989759.getClass(), "registerTime", term3989775);
        setIntField(term3989786, term3989786.getClass(), "year", 2015);
        setShortField(term3989786, term3989786.getClass(), "month", (short) 9);
        setShortField(term3989786, term3989786.getClass(), "day", (short) 20);
        setField(term3989785, term3989785.getClass(), "date", term3989786);
        setByteField(term3989790, term3989790.getClass(), "hour", (byte) 21);
        setByteField(term3989790, term3989790.getClass(), "minute", (byte) 52);
        setByteField(term3989790, term3989790.getClass(), "second", (byte) 53);
        setIntField(term3989790, term3989790.getClass(), "nano", 999335416);
        setField(term3989785, term3989785.getClass(), "time", term3989790);
        setField(term3989759, term3989759.getClass(), "accessTime", term3989785);
        setField(term3989757, term3989757.getClass(), "card", term3989759);
        setIntField(term3989757, term3989757.getClass(), "lastDataVersion", 1364461557);
        setField(term3989757, term3989757.getClass(), "userName", "mEPSeWbDHH");
        setIntField(term3989757, term3989757.getClass(), "point", -111020894);
        setIntField(term3989757, term3989757.getClass(), "totalPoint", -2029085766);
        setIntField(term3989757, term3989757.getClass(), "iconId", 141983927);
        setIntField(term3989757, term3989757.getClass(), "nameplateId", 2107794215);
        setIntField(term3989757, term3989757.getClass(), "frameId", -1840795494);
        setIntField(term3989757, term3989757.getClass(), "trophyId", 1896969873);
        setIntField(term3989757, term3989757.getClass(), "playCount", -428959196);
        setIntField(term3989757, term3989757.getClass(), "playVsCount", -17771939);
        setIntField(term3989757, term3989757.getClass(), "playSyncCount", -455374442);
        setIntField(term3989757, term3989757.getClass(), "winCount", 137175274);
        setIntField(term3989757, term3989757.getClass(), "helpCount", -1214393584);
        setIntField(term3989757, term3989757.getClass(), "comboCount", 1357951195);
        setIntField(term3989757, term3989757.getClass(), "feverCount", -631040622);
        setIntField(term3989757, term3989757.getClass(), "totalHiScore", 1858092925);
        setIntField(term3989757, term3989757.getClass(), "totalEasyHighScore", 1510215630);
        setIntField(term3989757, term3989757.getClass(), "totalBasicHighScore", -2126628760);
        setIntField(term3989757, term3989757.getClass(), "totalAdvancedHighScore", -172767468);
        setIntField(term3989757, term3989757.getClass(), "totalExpertHighScore", 514311814);
        setIntField(term3989757, term3989757.getClass(), "totalMasterHighScore", -967312618);
        setIntField(term3989757, term3989757.getClass(), "totalReMasterHighScore", -1986568159);
        setIntField(term3989757, term3989757.getClass(), "totalHighSync", 1278362987);
        setIntField(term3989757, term3989757.getClass(), "totalEasySync", -1376475467);
        setIntField(term3989757, term3989757.getClass(), "totalBasicSync", 330621413);
        setIntField(term3989757, term3989757.getClass(), "totalAdvancedSync", -2103356278);
        setIntField(term3989757, term3989757.getClass(), "totalExpertSync", -1741126342);
        setIntField(term3989757, term3989757.getClass(), "totalMasterSync", 1880806760);
        setIntField(term3989757, term3989757.getClass(), "totalReMasterSync", 32500128);
        setIntField(term3989757, term3989757.getClass(), "playerRating", 973397221);
        setIntField(term3989757, term3989757.getClass(), "highestRating", -408525512);
        setIntField(term3989757, term3989757.getClass(), "rankAuthTailId", 856433691);
        setField(term3989757, term3989757.getClass(), "eventWatchedDate", "YAKmCHKAZJ");
        setField(term3989757, term3989757.getClass(), "webLimitDate", "IdlQHBVghi");
        setIntField(term3989757, term3989757.getClass(), "challengeTrackPhase", -762837889);
        setIntField(term3989757, term3989757.getClass(), "firstPlayBits", 710623686);
        setField(term3989757, term3989757.getClass(), "lastPlayDate", "KnXDZTjvnO");
        setIntField(term3989757, term3989757.getClass(), "lastPlaceId", -346500304);
        setField(term3989757, term3989757.getClass(), "lastPlaceName", "neSCVFqvCm");
        setIntField(term3989757, term3989757.getClass(), "lastRegionId", -1209754850);
        setField(term3989757, term3989757.getClass(), "lastRegionName", "esISkStKLh");
        setField(term3989757, term3989757.getClass(), "lastClientId", "ZtAiEEJaZJ");
        setField(term3989757, term3989757.getClass(), "lastCountryCode", "bEDuSSLKLW");
        setIntField(term3989757, term3989757.getClass(), "eventPoint", 964053032);
        setIntField(term3989757, term3989757.getClass(), "totalLv", 1223330023);
        setIntField(term3989757, term3989757.getClass(), "lastLoginBonusDay", -1384137393);
        setIntField(term3989757, term3989757.getClass(), "lastSurvivalBonusDay", -285914231);
        setIntField(term3989757, term3989757.getClass(), "loginBonusLv", -883258726);
        setField(term3989755, term3989755.getClass(), "user", term3989757);
        setIntField(term3989755, term3989755.getClass(), "orderId", 1573460536);
        setLongField(term3989755, term3989755.getClass(), "sortNumber", -6292564308304347677L);
        setIntField(term3989755, term3989755.getClass(), "placeId", -1517595746);
        setField(term3989755, term3989755.getClass(), "placeName", "jyNUGWJVsj");
        setField(term3989755, term3989755.getClass(), "country", "VaBpJjzKKb");
        setIntField(term3989755, term3989755.getClass(), "regionId", 2052443245);
        setField(term3989755, term3989755.getClass(), "playDate", "dsygrdQRrt");
        setField(term3989755, term3989755.getClass(), "userPlayDate", "ARFCAIwtQk");
        setIntField(term3989755, term3989755.getClass(), "musicId", -807769780);
        setIntField(term3989755, term3989755.getClass(), "level", -1007803846);
        setIntField(term3989755, term3989755.getClass(), "gameMode", -1259512372);
        setIntField(term3989755, term3989755.getClass(), "rivalNum", 133420876);
        setIntField(term3989755, term3989755.getClass(), "track", 1942429333);
        setIntField(term3989755, term3989755.getClass(), "eventId", 825574797);
        setBooleanField(term3989755, term3989755.getClass(), "isFreeToPlay", false);
        setIntField(term3989755, term3989755.getClass(), "playerRating", -2005685967);
        setLongField(term3989755, term3989755.getClass(), "playedUserId1", 209476285642707466L);
        setField(term3989755, term3989755.getClass(), "playedUserName1", "ywYMasIFNw");
        setIntField(term3989755, term3989755.getClass(), "playedMusicLevel1", -409225270);
        setLongField(term3989755, term3989755.getClass(), "playedUserId2", 2168883936135361383L);
        setField(term3989755, term3989755.getClass(), "playedUserName2", "PCOFtXPVcs");
        setIntField(term3989755, term3989755.getClass(), "playedMusicLevel2", 1359006030);
        setLongField(term3989755, term3989755.getClass(), "playedUserId3", 6844848179876481215L);
        setField(term3989755, term3989755.getClass(), "playedUserName3", "SLzLggCLZo");
        setIntField(term3989755, term3989755.getClass(), "playedMusicLevel3", 129071559);
        setIntField(term3989755, term3989755.getClass(), "achievement", 1657590543);
        setIntField(term3989755, term3989755.getClass(), "score", 32211619);
        setIntField(term3989755, term3989755.getClass(), "tapScore", 1481902773);
        setIntField(term3989755, term3989755.getClass(), "holdScore", 1259607942);
        setIntField(term3989755, term3989755.getClass(), "slideScore", 907604762);
        setIntField(term3989755, term3989755.getClass(), "breakScore", 1573799903);
        setIntField(term3989755, term3989755.getClass(), "syncRate", -1241964908);
        setIntField(term3989755, term3989755.getClass(), "vsWin", -1817544248);
        setBooleanField(term3989755, term3989755.getClass(), "isAllPerfect", true);
        setIntField(term3989755, term3989755.getClass(), "fullCombo", -1334056391);
        setIntField(term3989755, term3989755.getClass(), "maxFever", -2110016444);
        setIntField(term3989755, term3989755.getClass(), "maxCombo", 170512802);
        setIntField(term3989755, term3989755.getClass(), "tapPerfect", -1111114119);
        setIntField(term3989755, term3989755.getClass(), "tapGreat", 46094734);
        setIntField(term3989755, term3989755.getClass(), "tapGood", -1127492084);
        setIntField(term3989755, term3989755.getClass(), "tapBad", -1498023384);
        setIntField(term3989755, term3989755.getClass(), "holdPerfect", -175801267);
        setIntField(term3989755, term3989755.getClass(), "holdGreat", 2087617972);
        setIntField(term3989755, term3989755.getClass(), "holdGood", 578156760);
        setIntField(term3989755, term3989755.getClass(), "holdBad", -1227598105);
        setIntField(term3989755, term3989755.getClass(), "slidePerfect", -2059959856);
        setIntField(term3989755, term3989755.getClass(), "slideGreat", -290018745);
        setIntField(term3989755, term3989755.getClass(), "slideGood", -1446195996);
        setIntField(term3989755, term3989755.getClass(), "slideBad", -1310197704);
        setIntField(term3989755, term3989755.getClass(), "breakPerfect", 889975226);
        setIntField(term3989755, term3989755.getClass(), "breakGreat", 855277992);
        setIntField(term3989755, term3989755.getClass(), "breakGood", 611929467);
        setIntField(term3989755, term3989755.getClass(), "breakBad", 181442421);
        setBooleanField(term3989755, term3989755.getClass(), "isTrackSkip", true);
        setBooleanField(term3989755, term3989755.getClass(), "isHighScore", true);
        setBooleanField(term3989755, term3989755.getClass(), "isChallengeTrack", true);
        setIntField(term3989755, term3989755.getClass(), "challengeLife", 1727942791);
        setIntField(term3989755, term3989755.getClass(), "challengeRemain", 1269826817);
        setIntField(term3989755, term3989755.getClass(), "isAllPerfectPlus", -203875668);
        term3990067 = new Integer(635338903);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term3990067;
        callMethod(klass, "setHoldBad", argTypes, term3989755, args);
    }

};


