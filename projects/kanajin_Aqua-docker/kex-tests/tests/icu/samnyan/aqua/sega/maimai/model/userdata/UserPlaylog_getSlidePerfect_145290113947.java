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

public class UserPlaylog_getSlidePerfect_145290113947 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term134575;

    public UserPlaylog_getSlidePerfect_145290113947() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term134581 = new Long(-6771377873268167033L);
        term134575 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term134577 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term134579 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term134595 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term134596 = newInstance(Class.forName("java.time.LocalDate"));
        Object term134600 = newInstance(Class.forName("java.time.LocalTime"));
        Object term134605 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term134606 = newInstance(Class.forName("java.time.LocalDate"));
        Object term134610 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term134575, term134575.getClass(), "id", 3872000207938391416L);
        setLongField(term134577, term134577.getClass(), "id", -1383665096049300821L);
        setLongField(term134579, term134579.getClass(), "id", 3462550822198292676L);
        setField(term134579, term134579.getClass(), "extId", term134581);
        setField(term134579, term134579.getClass(), "luid", "rbJDQpboBH");
        setIntField(term134596, term134596.getClass(), "year", 2029);
        setShortField(term134596, term134596.getClass(), "month", (short) 7);
        setShortField(term134596, term134596.getClass(), "day", (short) 8);
        setField(term134595, term134595.getClass(), "date", term134596);
        setByteField(term134600, term134600.getClass(), "hour", (byte) 17);
        setByteField(term134600, term134600.getClass(), "minute", (byte) 0);
        setByteField(term134600, term134600.getClass(), "second", (byte) 26);
        setIntField(term134600, term134600.getClass(), "nano", 789866170);
        setField(term134595, term134595.getClass(), "time", term134600);
        setField(term134579, term134579.getClass(), "registerTime", term134595);
        setIntField(term134606, term134606.getClass(), "year", 2010);
        setShortField(term134606, term134606.getClass(), "month", (short) 3);
        setShortField(term134606, term134606.getClass(), "day", (short) 28);
        setField(term134605, term134605.getClass(), "date", term134606);
        setByteField(term134610, term134610.getClass(), "hour", (byte) 22);
        setByteField(term134610, term134610.getClass(), "minute", (byte) 36);
        setByteField(term134610, term134610.getClass(), "second", (byte) 47);
        setIntField(term134610, term134610.getClass(), "nano", 84020683);
        setField(term134605, term134605.getClass(), "time", term134610);
        setField(term134579, term134579.getClass(), "accessTime", term134605);
        setField(term134577, term134577.getClass(), "card", term134579);
        setIntField(term134577, term134577.getClass(), "lastDataVersion", -496314738);
        setField(term134577, term134577.getClass(), "userName", "AJvPxKmklj");
        setIntField(term134577, term134577.getClass(), "point", -1147690688);
        setIntField(term134577, term134577.getClass(), "totalPoint", 1474442364);
        setIntField(term134577, term134577.getClass(), "iconId", -1979534719);
        setIntField(term134577, term134577.getClass(), "nameplateId", 358862811);
        setIntField(term134577, term134577.getClass(), "frameId", -607854753);
        setIntField(term134577, term134577.getClass(), "trophyId", -660755702);
        setIntField(term134577, term134577.getClass(), "playCount", 679880948);
        setIntField(term134577, term134577.getClass(), "playVsCount", 1895163953);
        setIntField(term134577, term134577.getClass(), "playSyncCount", -691223106);
        setIntField(term134577, term134577.getClass(), "winCount", -818213947);
        setIntField(term134577, term134577.getClass(), "helpCount", -1160766511);
        setIntField(term134577, term134577.getClass(), "comboCount", -1983614159);
        setIntField(term134577, term134577.getClass(), "feverCount", -1538026717);
        setIntField(term134577, term134577.getClass(), "totalHiScore", 1157723902);
        setIntField(term134577, term134577.getClass(), "totalEasyHighScore", -1911978209);
        setIntField(term134577, term134577.getClass(), "totalBasicHighScore", -947895752);
        setIntField(term134577, term134577.getClass(), "totalAdvancedHighScore", -488348638);
        setIntField(term134577, term134577.getClass(), "totalExpertHighScore", 1971447014);
        setIntField(term134577, term134577.getClass(), "totalMasterHighScore", -424778605);
        setIntField(term134577, term134577.getClass(), "totalReMasterHighScore", -2027250240);
        setIntField(term134577, term134577.getClass(), "totalHighSync", 984955567);
        setIntField(term134577, term134577.getClass(), "totalEasySync", 1330468760);
        setIntField(term134577, term134577.getClass(), "totalBasicSync", 314609478);
        setIntField(term134577, term134577.getClass(), "totalAdvancedSync", -1790709498);
        setIntField(term134577, term134577.getClass(), "totalExpertSync", -991204620);
        setIntField(term134577, term134577.getClass(), "totalMasterSync", 290302300);
        setIntField(term134577, term134577.getClass(), "totalReMasterSync", 1352183463);
        setIntField(term134577, term134577.getClass(), "playerRating", 1489439725);
        setIntField(term134577, term134577.getClass(), "highestRating", -1946582683);
        setIntField(term134577, term134577.getClass(), "rankAuthTailId", -1041859799);
        setField(term134577, term134577.getClass(), "eventWatchedDate", "nXIqTwQhkl");
        setField(term134577, term134577.getClass(), "webLimitDate", "TwSWGxsbpT");
        setIntField(term134577, term134577.getClass(), "challengeTrackPhase", 2011585714);
        setIntField(term134577, term134577.getClass(), "firstPlayBits", 981212962);
        setField(term134577, term134577.getClass(), "lastPlayDate", "hfUAGLGTYY");
        setIntField(term134577, term134577.getClass(), "lastPlaceId", -1045629424);
        setField(term134577, term134577.getClass(), "lastPlaceName", "pjXjkGlBZo");
        setIntField(term134577, term134577.getClass(), "lastRegionId", -1420294293);
        setField(term134577, term134577.getClass(), "lastRegionName", "pHNOfQlhKa");
        setField(term134577, term134577.getClass(), "lastClientId", "rsZnYHnYCE");
        setField(term134577, term134577.getClass(), "lastCountryCode", "xVlcioeikJ");
        setIntField(term134577, term134577.getClass(), "eventPoint", -36701343);
        setIntField(term134577, term134577.getClass(), "totalLv", 1597822592);
        setIntField(term134577, term134577.getClass(), "lastLoginBonusDay", 1242775865);
        setIntField(term134577, term134577.getClass(), "lastSurvivalBonusDay", -1607082745);
        setIntField(term134577, term134577.getClass(), "loginBonusLv", -1489638045);
        setField(term134575, term134575.getClass(), "user", term134577);
        setIntField(term134575, term134575.getClass(), "orderId", 1366635956);
        setLongField(term134575, term134575.getClass(), "sortNumber", 4366106993552057355L);
        setIntField(term134575, term134575.getClass(), "placeId", 1287857445);
        setField(term134575, term134575.getClass(), "placeName", "nDWnDqypnc");
        setField(term134575, term134575.getClass(), "country", "YUysoEeBVh");
        setIntField(term134575, term134575.getClass(), "regionId", -1755330917);
        setField(term134575, term134575.getClass(), "playDate", "UALDaFojXX");
        setField(term134575, term134575.getClass(), "userPlayDate", "zfXUaOpwPJ");
        setIntField(term134575, term134575.getClass(), "musicId", -1138481653);
        setIntField(term134575, term134575.getClass(), "level", 1019419428);
        setIntField(term134575, term134575.getClass(), "gameMode", 1234190646);
        setIntField(term134575, term134575.getClass(), "rivalNum", -1056218614);
        setIntField(term134575, term134575.getClass(), "track", -1061665653);
        setIntField(term134575, term134575.getClass(), "eventId", -1873769204);
        setBooleanField(term134575, term134575.getClass(), "isFreeToPlay", false);
        setIntField(term134575, term134575.getClass(), "playerRating", -1350811081);
        setLongField(term134575, term134575.getClass(), "playedUserId1", -1403100578084357233L);
        setField(term134575, term134575.getClass(), "playedUserName1", "AdOVSTNkEG");
        setIntField(term134575, term134575.getClass(), "playedMusicLevel1", -497996745);
        setLongField(term134575, term134575.getClass(), "playedUserId2", -5878958370799790472L);
        setField(term134575, term134575.getClass(), "playedUserName2", "BTnZZOfDVg");
        setIntField(term134575, term134575.getClass(), "playedMusicLevel2", -109990303);
        setLongField(term134575, term134575.getClass(), "playedUserId3", 1801020535033823321L);
        setField(term134575, term134575.getClass(), "playedUserName3", "ntMbgqrkHY");
        setIntField(term134575, term134575.getClass(), "playedMusicLevel3", 1201878250);
        setIntField(term134575, term134575.getClass(), "achievement", -1105574919);
        setIntField(term134575, term134575.getClass(), "score", -493353713);
        setIntField(term134575, term134575.getClass(), "tapScore", 1715756304);
        setIntField(term134575, term134575.getClass(), "holdScore", 1885187356);
        setIntField(term134575, term134575.getClass(), "slideScore", -271697890);
        setIntField(term134575, term134575.getClass(), "breakScore", -1570345011);
        setIntField(term134575, term134575.getClass(), "syncRate", 1881035539);
        setIntField(term134575, term134575.getClass(), "vsWin", 1544914118);
        setBooleanField(term134575, term134575.getClass(), "isAllPerfect", false);
        setIntField(term134575, term134575.getClass(), "fullCombo", -946117068);
        setIntField(term134575, term134575.getClass(), "maxFever", -1915677831);
        setIntField(term134575, term134575.getClass(), "maxCombo", 2065361934);
        setIntField(term134575, term134575.getClass(), "tapPerfect", 36380153);
        setIntField(term134575, term134575.getClass(), "tapGreat", 1825724677);
        setIntField(term134575, term134575.getClass(), "tapGood", -902676559);
        setIntField(term134575, term134575.getClass(), "tapBad", -1684112314);
        setIntField(term134575, term134575.getClass(), "holdPerfect", -2067871215);
        setIntField(term134575, term134575.getClass(), "holdGreat", 1663028524);
        setIntField(term134575, term134575.getClass(), "holdGood", 1196325291);
        setIntField(term134575, term134575.getClass(), "holdBad", 826798931);
        setIntField(term134575, term134575.getClass(), "slidePerfect", 1471203421);
        setIntField(term134575, term134575.getClass(), "slideGreat", 461599979);
        setIntField(term134575, term134575.getClass(), "slideGood", -1949936263);
        setIntField(term134575, term134575.getClass(), "slideBad", 2135782931);
        setIntField(term134575, term134575.getClass(), "breakPerfect", -682620155);
        setIntField(term134575, term134575.getClass(), "breakGreat", 1540269372);
        setIntField(term134575, term134575.getClass(), "breakGood", 2079727503);
        setIntField(term134575, term134575.getClass(), "breakBad", 162800610);
        setBooleanField(term134575, term134575.getClass(), "isTrackSkip", false);
        setBooleanField(term134575, term134575.getClass(), "isHighScore", true);
        setBooleanField(term134575, term134575.getClass(), "isChallengeTrack", true);
        setIntField(term134575, term134575.getClass(), "challengeLife", -130685400);
        setIntField(term134575, term134575.getClass(), "challengeRemain", 733495333);
        setIntField(term134575, term134575.getClass(), "isAllPerfectPlus", 224926338);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSlidePerfect", argTypes, term134575, args);
    }

};


