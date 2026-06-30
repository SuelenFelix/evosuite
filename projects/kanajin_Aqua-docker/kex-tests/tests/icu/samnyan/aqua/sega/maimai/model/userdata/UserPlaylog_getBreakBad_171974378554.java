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

public class UserPlaylog_getBreakBad_171974378554 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term137879;

    public UserPlaylog_getBreakBad_171974378554() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term137885 = new Long(3643973882575578879L);
        term137879 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term137881 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term137883 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term137899 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term137900 = newInstance(Class.forName("java.time.LocalDate"));
        Object term137904 = newInstance(Class.forName("java.time.LocalTime"));
        Object term137909 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term137910 = newInstance(Class.forName("java.time.LocalDate"));
        Object term137914 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term137879, term137879.getClass(), "id", -1658464487289836175L);
        setLongField(term137881, term137881.getClass(), "id", -8555339910220884151L);
        setLongField(term137883, term137883.getClass(), "id", 8483270362078349289L);
        setField(term137883, term137883.getClass(), "extId", term137885);
        setField(term137883, term137883.getClass(), "luid", "mCxcdmaOlh");
        setIntField(term137900, term137900.getClass(), "year", 2026);
        setShortField(term137900, term137900.getClass(), "month", (short) 6);
        setShortField(term137900, term137900.getClass(), "day", (short) 16);
        setField(term137899, term137899.getClass(), "date", term137900);
        setByteField(term137904, term137904.getClass(), "hour", (byte) 23);
        setByteField(term137904, term137904.getClass(), "minute", (byte) 43);
        setByteField(term137904, term137904.getClass(), "second", (byte) 38);
        setIntField(term137904, term137904.getClass(), "nano", 395188532);
        setField(term137899, term137899.getClass(), "time", term137904);
        setField(term137883, term137883.getClass(), "registerTime", term137899);
        setIntField(term137910, term137910.getClass(), "year", 2010);
        setShortField(term137910, term137910.getClass(), "month", (short) 12);
        setShortField(term137910, term137910.getClass(), "day", (short) 4);
        setField(term137909, term137909.getClass(), "date", term137910);
        setByteField(term137914, term137914.getClass(), "hour", (byte) 18);
        setByteField(term137914, term137914.getClass(), "minute", (byte) 23);
        setByteField(term137914, term137914.getClass(), "second", (byte) 50);
        setIntField(term137914, term137914.getClass(), "nano", 773671553);
        setField(term137909, term137909.getClass(), "time", term137914);
        setField(term137883, term137883.getClass(), "accessTime", term137909);
        setField(term137881, term137881.getClass(), "card", term137883);
        setIntField(term137881, term137881.getClass(), "lastDataVersion", 1200946519);
        setField(term137881, term137881.getClass(), "userName", "LjgkHxxdOu");
        setIntField(term137881, term137881.getClass(), "point", 827079210);
        setIntField(term137881, term137881.getClass(), "totalPoint", -1115939120);
        setIntField(term137881, term137881.getClass(), "iconId", 1556641892);
        setIntField(term137881, term137881.getClass(), "nameplateId", 924053222);
        setIntField(term137881, term137881.getClass(), "frameId", -1462072032);
        setIntField(term137881, term137881.getClass(), "trophyId", 1626407929);
        setIntField(term137881, term137881.getClass(), "playCount", -495836840);
        setIntField(term137881, term137881.getClass(), "playVsCount", 1403163232);
        setIntField(term137881, term137881.getClass(), "playSyncCount", 1582908846);
        setIntField(term137881, term137881.getClass(), "winCount", 1503497754);
        setIntField(term137881, term137881.getClass(), "helpCount", -1644918935);
        setIntField(term137881, term137881.getClass(), "comboCount", -800406163);
        setIntField(term137881, term137881.getClass(), "feverCount", -13006451);
        setIntField(term137881, term137881.getClass(), "totalHiScore", 1057337372);
        setIntField(term137881, term137881.getClass(), "totalEasyHighScore", 1149945398);
        setIntField(term137881, term137881.getClass(), "totalBasicHighScore", -1228683179);
        setIntField(term137881, term137881.getClass(), "totalAdvancedHighScore", 1770216602);
        setIntField(term137881, term137881.getClass(), "totalExpertHighScore", -652403316);
        setIntField(term137881, term137881.getClass(), "totalMasterHighScore", -99177890);
        setIntField(term137881, term137881.getClass(), "totalReMasterHighScore", 1381580503);
        setIntField(term137881, term137881.getClass(), "totalHighSync", 1449095969);
        setIntField(term137881, term137881.getClass(), "totalEasySync", 1586424206);
        setIntField(term137881, term137881.getClass(), "totalBasicSync", 1331599209);
        setIntField(term137881, term137881.getClass(), "totalAdvancedSync", -1291785671);
        setIntField(term137881, term137881.getClass(), "totalExpertSync", -1846188963);
        setIntField(term137881, term137881.getClass(), "totalMasterSync", -378822383);
        setIntField(term137881, term137881.getClass(), "totalReMasterSync", -1683396631);
        setIntField(term137881, term137881.getClass(), "playerRating", -1186369376);
        setIntField(term137881, term137881.getClass(), "highestRating", 815530303);
        setIntField(term137881, term137881.getClass(), "rankAuthTailId", 2137150532);
        setField(term137881, term137881.getClass(), "eventWatchedDate", "AHOCvVqPAa");
        setField(term137881, term137881.getClass(), "webLimitDate", "PEALeSdAvS");
        setIntField(term137881, term137881.getClass(), "challengeTrackPhase", 175483868);
        setIntField(term137881, term137881.getClass(), "firstPlayBits", -878852703);
        setField(term137881, term137881.getClass(), "lastPlayDate", "oryVZfLyAF");
        setIntField(term137881, term137881.getClass(), "lastPlaceId", 217174894);
        setField(term137881, term137881.getClass(), "lastPlaceName", "comITQlWZO");
        setIntField(term137881, term137881.getClass(), "lastRegionId", 1409041223);
        setField(term137881, term137881.getClass(), "lastRegionName", "NsaFgLGmdm");
        setField(term137881, term137881.getClass(), "lastClientId", "NpeQNuPyKD");
        setField(term137881, term137881.getClass(), "lastCountryCode", "PWrDivLkwt");
        setIntField(term137881, term137881.getClass(), "eventPoint", -1174673068);
        setIntField(term137881, term137881.getClass(), "totalLv", -1459746793);
        setIntField(term137881, term137881.getClass(), "lastLoginBonusDay", -279967601);
        setIntField(term137881, term137881.getClass(), "lastSurvivalBonusDay", -1365630426);
        setIntField(term137881, term137881.getClass(), "loginBonusLv", 1879163737);
        setField(term137879, term137879.getClass(), "user", term137881);
        setIntField(term137879, term137879.getClass(), "orderId", -1375213258);
        setLongField(term137879, term137879.getClass(), "sortNumber", -2660365005868686870L);
        setIntField(term137879, term137879.getClass(), "placeId", -580235834);
        setField(term137879, term137879.getClass(), "placeName", "oyymZILKkI");
        setField(term137879, term137879.getClass(), "country", "yIAqrFHbcK");
        setIntField(term137879, term137879.getClass(), "regionId", 1181558786);
        setField(term137879, term137879.getClass(), "playDate", "qoqkuSpUdQ");
        setField(term137879, term137879.getClass(), "userPlayDate", "cuOkblUYnI");
        setIntField(term137879, term137879.getClass(), "musicId", -1568789746);
        setIntField(term137879, term137879.getClass(), "level", -1942621984);
        setIntField(term137879, term137879.getClass(), "gameMode", -854433925);
        setIntField(term137879, term137879.getClass(), "rivalNum", -1818927728);
        setIntField(term137879, term137879.getClass(), "track", 653066001);
        setIntField(term137879, term137879.getClass(), "eventId", -1176620233);
        setBooleanField(term137879, term137879.getClass(), "isFreeToPlay", true);
        setIntField(term137879, term137879.getClass(), "playerRating", -415346336);
        setLongField(term137879, term137879.getClass(), "playedUserId1", 79870604313788787L);
        setField(term137879, term137879.getClass(), "playedUserName1", "FpMNcPTbIL");
        setIntField(term137879, term137879.getClass(), "playedMusicLevel1", -651043129);
        setLongField(term137879, term137879.getClass(), "playedUserId2", -5116722010996804482L);
        setField(term137879, term137879.getClass(), "playedUserName2", "xLwIZPJWuC");
        setIntField(term137879, term137879.getClass(), "playedMusicLevel2", -1070416601);
        setLongField(term137879, term137879.getClass(), "playedUserId3", 1713582982697786878L);
        setField(term137879, term137879.getClass(), "playedUserName3", "nWudcjLvSq");
        setIntField(term137879, term137879.getClass(), "playedMusicLevel3", 1760447346);
        setIntField(term137879, term137879.getClass(), "achievement", -1931685197);
        setIntField(term137879, term137879.getClass(), "score", -809040939);
        setIntField(term137879, term137879.getClass(), "tapScore", -841536999);
        setIntField(term137879, term137879.getClass(), "holdScore", 1407954932);
        setIntField(term137879, term137879.getClass(), "slideScore", -973933888);
        setIntField(term137879, term137879.getClass(), "breakScore", 1428792658);
        setIntField(term137879, term137879.getClass(), "syncRate", -1972890664);
        setIntField(term137879, term137879.getClass(), "vsWin", 966570906);
        setBooleanField(term137879, term137879.getClass(), "isAllPerfect", false);
        setIntField(term137879, term137879.getClass(), "fullCombo", -785176151);
        setIntField(term137879, term137879.getClass(), "maxFever", 1314779063);
        setIntField(term137879, term137879.getClass(), "maxCombo", -264007193);
        setIntField(term137879, term137879.getClass(), "tapPerfect", 288344148);
        setIntField(term137879, term137879.getClass(), "tapGreat", 1458940265);
        setIntField(term137879, term137879.getClass(), "tapGood", -1681163759);
        setIntField(term137879, term137879.getClass(), "tapBad", -2045024263);
        setIntField(term137879, term137879.getClass(), "holdPerfect", 1341904631);
        setIntField(term137879, term137879.getClass(), "holdGreat", -1166656746);
        setIntField(term137879, term137879.getClass(), "holdGood", 940545009);
        setIntField(term137879, term137879.getClass(), "holdBad", -445026599);
        setIntField(term137879, term137879.getClass(), "slidePerfect", -1873952688);
        setIntField(term137879, term137879.getClass(), "slideGreat", 398208102);
        setIntField(term137879, term137879.getClass(), "slideGood", 550633126);
        setIntField(term137879, term137879.getClass(), "slideBad", -811128951);
        setIntField(term137879, term137879.getClass(), "breakPerfect", 1667521403);
        setIntField(term137879, term137879.getClass(), "breakGreat", 1607799155);
        setIntField(term137879, term137879.getClass(), "breakGood", -1097890387);
        setIntField(term137879, term137879.getClass(), "breakBad", -2032608082);
        setBooleanField(term137879, term137879.getClass(), "isTrackSkip", true);
        setBooleanField(term137879, term137879.getClass(), "isHighScore", false);
        setBooleanField(term137879, term137879.getClass(), "isChallengeTrack", true);
        setIntField(term137879, term137879.getClass(), "challengeLife", -1996651147);
        setIntField(term137879, term137879.getClass(), "challengeRemain", 1884511938);
        setIntField(term137879, term137879.getClass(), "isAllPerfectPlus", 395389544);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBreakBad", argTypes, term137879, args);
    }

};


