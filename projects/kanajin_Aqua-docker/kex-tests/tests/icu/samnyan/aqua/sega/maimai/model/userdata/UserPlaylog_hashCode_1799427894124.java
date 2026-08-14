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

public class UserPlaylog_hashCode_1799427894124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3997811;

    public UserPlaylog_hashCode_1799427894124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3997817 = new Long(-3951747327991411147L);
        term3997811 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term3997813 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term3997815 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term3997831 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3997832 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3997836 = newInstance(Class.forName("java.time.LocalTime"));
        Object term3997841 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3997842 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3997846 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term3997811, term3997811.getClass(), "id", 1143087175376656679L);
        setLongField(term3997813, term3997813.getClass(), "id", 3136787796352542095L);
        setLongField(term3997815, term3997815.getClass(), "id", 2231207345282005536L);
        setField(term3997815, term3997815.getClass(), "extId", term3997817);
        setField(term3997815, term3997815.getClass(), "luid", "niqeuWxqbf");
        setIntField(term3997832, term3997832.getClass(), "year", 2027);
        setShortField(term3997832, term3997832.getClass(), "month", (short) 8);
        setShortField(term3997832, term3997832.getClass(), "day", (short) 1);
        setField(term3997831, term3997831.getClass(), "date", term3997832);
        setByteField(term3997836, term3997836.getClass(), "hour", (byte) 17);
        setByteField(term3997836, term3997836.getClass(), "minute", (byte) 5);
        setByteField(term3997836, term3997836.getClass(), "second", (byte) 3);
        setIntField(term3997836, term3997836.getClass(), "nano", 971101993);
        setField(term3997831, term3997831.getClass(), "time", term3997836);
        setField(term3997815, term3997815.getClass(), "registerTime", term3997831);
        setIntField(term3997842, term3997842.getClass(), "year", 2016);
        setShortField(term3997842, term3997842.getClass(), "month", (short) 4);
        setShortField(term3997842, term3997842.getClass(), "day", (short) 16);
        setField(term3997841, term3997841.getClass(), "date", term3997842);
        setByteField(term3997846, term3997846.getClass(), "hour", (byte) 15);
        setByteField(term3997846, term3997846.getClass(), "minute", (byte) 44);
        setByteField(term3997846, term3997846.getClass(), "second", (byte) 3);
        setIntField(term3997846, term3997846.getClass(), "nano", 904301836);
        setField(term3997841, term3997841.getClass(), "time", term3997846);
        setField(term3997815, term3997815.getClass(), "accessTime", term3997841);
        setField(term3997813, term3997813.getClass(), "card", term3997815);
        setIntField(term3997813, term3997813.getClass(), "lastDataVersion", -1572535128);
        setField(term3997813, term3997813.getClass(), "userName", "XaXUUkdsIf");
        setIntField(term3997813, term3997813.getClass(), "point", -1611606174);
        setIntField(term3997813, term3997813.getClass(), "totalPoint", -1856320854);
        setIntField(term3997813, term3997813.getClass(), "iconId", 1578208451);
        setIntField(term3997813, term3997813.getClass(), "nameplateId", 1315236206);
        setIntField(term3997813, term3997813.getClass(), "frameId", 1839032767);
        setIntField(term3997813, term3997813.getClass(), "trophyId", 357730320);
        setIntField(term3997813, term3997813.getClass(), "playCount", 452762700);
        setIntField(term3997813, term3997813.getClass(), "playVsCount", 854340800);
        setIntField(term3997813, term3997813.getClass(), "playSyncCount", 560417573);
        setIntField(term3997813, term3997813.getClass(), "winCount", 348791598);
        setIntField(term3997813, term3997813.getClass(), "helpCount", 1479138108);
        setIntField(term3997813, term3997813.getClass(), "comboCount", 46122717);
        setIntField(term3997813, term3997813.getClass(), "feverCount", -1213734708);
        setIntField(term3997813, term3997813.getClass(), "totalHiScore", -580809388);
        setIntField(term3997813, term3997813.getClass(), "totalEasyHighScore", -1926785592);
        setIntField(term3997813, term3997813.getClass(), "totalBasicHighScore", 2128618066);
        setIntField(term3997813, term3997813.getClass(), "totalAdvancedHighScore", -1108215615);
        setIntField(term3997813, term3997813.getClass(), "totalExpertHighScore", 2092783719);
        setIntField(term3997813, term3997813.getClass(), "totalMasterHighScore", 1872773752);
        setIntField(term3997813, term3997813.getClass(), "totalReMasterHighScore", -1634624865);
        setIntField(term3997813, term3997813.getClass(), "totalHighSync", -1119552075);
        setIntField(term3997813, term3997813.getClass(), "totalEasySync", -1739309015);
        setIntField(term3997813, term3997813.getClass(), "totalBasicSync", 31525914);
        setIntField(term3997813, term3997813.getClass(), "totalAdvancedSync", 1669744922);
        setIntField(term3997813, term3997813.getClass(), "totalExpertSync", -1138813936);
        setIntField(term3997813, term3997813.getClass(), "totalMasterSync", 1001751485);
        setIntField(term3997813, term3997813.getClass(), "totalReMasterSync", -1729460486);
        setIntField(term3997813, term3997813.getClass(), "playerRating", -1783108589);
        setIntField(term3997813, term3997813.getClass(), "highestRating", -437554100);
        setIntField(term3997813, term3997813.getClass(), "rankAuthTailId", 1696387946);
        setField(term3997813, term3997813.getClass(), "eventWatchedDate", "owgMFppnWp");
        setField(term3997813, term3997813.getClass(), "webLimitDate", "avZQskeQzN");
        setIntField(term3997813, term3997813.getClass(), "challengeTrackPhase", -944044721);
        setIntField(term3997813, term3997813.getClass(), "firstPlayBits", 752751672);
        setField(term3997813, term3997813.getClass(), "lastPlayDate", "ZavcHOcyPD");
        setIntField(term3997813, term3997813.getClass(), "lastPlaceId", 793482881);
        setField(term3997813, term3997813.getClass(), "lastPlaceName", "MZpPoMxsbh");
        setIntField(term3997813, term3997813.getClass(), "lastRegionId", 976279198);
        setField(term3997813, term3997813.getClass(), "lastRegionName", "uXimmMcPRE");
        setField(term3997813, term3997813.getClass(), "lastClientId", "WFMvintWad");
        setField(term3997813, term3997813.getClass(), "lastCountryCode", "accFcpOfGc");
        setIntField(term3997813, term3997813.getClass(), "eventPoint", 75841271);
        setIntField(term3997813, term3997813.getClass(), "totalLv", 1968129083);
        setIntField(term3997813, term3997813.getClass(), "lastLoginBonusDay", -1349582021);
        setIntField(term3997813, term3997813.getClass(), "lastSurvivalBonusDay", 555060790);
        setIntField(term3997813, term3997813.getClass(), "loginBonusLv", 1753038951);
        setField(term3997811, term3997811.getClass(), "user", term3997813);
        setIntField(term3997811, term3997811.getClass(), "orderId", -1176377679);
        setLongField(term3997811, term3997811.getClass(), "sortNumber", 5627033279533676675L);
        setIntField(term3997811, term3997811.getClass(), "placeId", 2023153043);
        setField(term3997811, term3997811.getClass(), "placeName", "liyOfVXEJt");
        setField(term3997811, term3997811.getClass(), "country", "tZhwTCEPkA");
        setIntField(term3997811, term3997811.getClass(), "regionId", -1127475460);
        setField(term3997811, term3997811.getClass(), "playDate", "WVEEwLeOTs");
        setField(term3997811, term3997811.getClass(), "userPlayDate", "zXcWtsWMfw");
        setIntField(term3997811, term3997811.getClass(), "musicId", -149891876);
        setIntField(term3997811, term3997811.getClass(), "level", 1179401789);
        setIntField(term3997811, term3997811.getClass(), "gameMode", 1688173181);
        setIntField(term3997811, term3997811.getClass(), "rivalNum", 57512048);
        setIntField(term3997811, term3997811.getClass(), "track", -1258299434);
        setIntField(term3997811, term3997811.getClass(), "eventId", 735097837);
        setBooleanField(term3997811, term3997811.getClass(), "isFreeToPlay", false);
        setIntField(term3997811, term3997811.getClass(), "playerRating", -1640261283);
        setLongField(term3997811, term3997811.getClass(), "playedUserId1", -5185362666374239619L);
        setField(term3997811, term3997811.getClass(), "playedUserName1", "wnBvEMUKNg");
        setIntField(term3997811, term3997811.getClass(), "playedMusicLevel1", 1499933643);
        setLongField(term3997811, term3997811.getClass(), "playedUserId2", 5798863453588704390L);
        setField(term3997811, term3997811.getClass(), "playedUserName2", "QzKymesWJO");
        setIntField(term3997811, term3997811.getClass(), "playedMusicLevel2", -2044962362);
        setLongField(term3997811, term3997811.getClass(), "playedUserId3", -8943046451980599571L);
        setField(term3997811, term3997811.getClass(), "playedUserName3", "agtNYwjmtB");
        setIntField(term3997811, term3997811.getClass(), "playedMusicLevel3", 922101731);
        setIntField(term3997811, term3997811.getClass(), "achievement", 1735528928);
        setIntField(term3997811, term3997811.getClass(), "score", 448374592);
        setIntField(term3997811, term3997811.getClass(), "tapScore", 1086383109);
        setIntField(term3997811, term3997811.getClass(), "holdScore", -1092474825);
        setIntField(term3997811, term3997811.getClass(), "slideScore", -1029174519);
        setIntField(term3997811, term3997811.getClass(), "breakScore", 312392068);
        setIntField(term3997811, term3997811.getClass(), "syncRate", -746051576);
        setIntField(term3997811, term3997811.getClass(), "vsWin", 1340420636);
        setBooleanField(term3997811, term3997811.getClass(), "isAllPerfect", false);
        setIntField(term3997811, term3997811.getClass(), "fullCombo", 1477382026);
        setIntField(term3997811, term3997811.getClass(), "maxFever", -1491390063);
        setIntField(term3997811, term3997811.getClass(), "maxCombo", 1539208658);
        setIntField(term3997811, term3997811.getClass(), "tapPerfect", -114859711);
        setIntField(term3997811, term3997811.getClass(), "tapGreat", 368022357);
        setIntField(term3997811, term3997811.getClass(), "tapGood", -1993552219);
        setIntField(term3997811, term3997811.getClass(), "tapBad", -190163543);
        setIntField(term3997811, term3997811.getClass(), "holdPerfect", 728117625);
        setIntField(term3997811, term3997811.getClass(), "holdGreat", 1050525297);
        setIntField(term3997811, term3997811.getClass(), "holdGood", 1739527312);
        setIntField(term3997811, term3997811.getClass(), "holdBad", 543162636);
        setIntField(term3997811, term3997811.getClass(), "slidePerfect", 1922709149);
        setIntField(term3997811, term3997811.getClass(), "slideGreat", -1787850479);
        setIntField(term3997811, term3997811.getClass(), "slideGood", -754802641);
        setIntField(term3997811, term3997811.getClass(), "slideBad", 1839134435);
        setIntField(term3997811, term3997811.getClass(), "breakPerfect", -530190672);
        setIntField(term3997811, term3997811.getClass(), "breakGreat", 837334241);
        setIntField(term3997811, term3997811.getClass(), "breakGood", 1446428723);
        setIntField(term3997811, term3997811.getClass(), "breakBad", 1517821688);
        setBooleanField(term3997811, term3997811.getClass(), "isTrackSkip", false);
        setBooleanField(term3997811, term3997811.getClass(), "isHighScore", false);
        setBooleanField(term3997811, term3997811.getClass(), "isChallengeTrack", false);
        setIntField(term3997811, term3997811.getClass(), "challengeLife", 396169796);
        setIntField(term3997811, term3997811.getClass(), "challengeRemain", -826175581);
        setIntField(term3997811, term3997811.getClass(), "isAllPerfectPlus", -265464281);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term3997811, args);
    }

};


