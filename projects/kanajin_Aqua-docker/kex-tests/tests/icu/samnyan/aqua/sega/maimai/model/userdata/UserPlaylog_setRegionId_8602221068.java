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

public class UserPlaylog_setRegionId_8602221068 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term144803;
     Object term145115;

    public UserPlaylog_setRegionId_8602221068() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term144809 = new Long(5304481534735378567L);
        term144803 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term144805 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term144807 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term144823 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term144824 = newInstance(Class.forName("java.time.LocalDate"));
        Object term144828 = newInstance(Class.forName("java.time.LocalTime"));
        Object term144833 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term144834 = newInstance(Class.forName("java.time.LocalDate"));
        Object term144838 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term144803, term144803.getClass(), "id", -6228694154790578964L);
        setLongField(term144805, term144805.getClass(), "id", 1652025727169242768L);
        setLongField(term144807, term144807.getClass(), "id", 4659041496243630964L);
        setField(term144807, term144807.getClass(), "extId", term144809);
        setField(term144807, term144807.getClass(), "luid", "ESnYpdjELS");
        setIntField(term144824, term144824.getClass(), "year", 2014);
        setShortField(term144824, term144824.getClass(), "month", (short) 6);
        setShortField(term144824, term144824.getClass(), "day", (short) 26);
        setField(term144823, term144823.getClass(), "date", term144824);
        setByteField(term144828, term144828.getClass(), "hour", (byte) 23);
        setByteField(term144828, term144828.getClass(), "minute", (byte) 29);
        setByteField(term144828, term144828.getClass(), "second", (byte) 42);
        setIntField(term144828, term144828.getClass(), "nano", 792765324);
        setField(term144823, term144823.getClass(), "time", term144828);
        setField(term144807, term144807.getClass(), "registerTime", term144823);
        setIntField(term144834, term144834.getClass(), "year", 2019);
        setShortField(term144834, term144834.getClass(), "month", (short) 3);
        setShortField(term144834, term144834.getClass(), "day", (short) 23);
        setField(term144833, term144833.getClass(), "date", term144834);
        setByteField(term144838, term144838.getClass(), "hour", (byte) 1);
        setByteField(term144838, term144838.getClass(), "minute", (byte) 15);
        setByteField(term144838, term144838.getClass(), "second", (byte) 57);
        setIntField(term144838, term144838.getClass(), "nano", 53985671);
        setField(term144833, term144833.getClass(), "time", term144838);
        setField(term144807, term144807.getClass(), "accessTime", term144833);
        setField(term144805, term144805.getClass(), "card", term144807);
        setIntField(term144805, term144805.getClass(), "lastDataVersion", -856396125);
        setField(term144805, term144805.getClass(), "userName", "IsOpDBwqZb");
        setIntField(term144805, term144805.getClass(), "point", -107146036);
        setIntField(term144805, term144805.getClass(), "totalPoint", 454182534);
        setIntField(term144805, term144805.getClass(), "iconId", -843354184);
        setIntField(term144805, term144805.getClass(), "nameplateId", 889022648);
        setIntField(term144805, term144805.getClass(), "frameId", 282291623);
        setIntField(term144805, term144805.getClass(), "trophyId", 1200358947);
        setIntField(term144805, term144805.getClass(), "playCount", 1825486717);
        setIntField(term144805, term144805.getClass(), "playVsCount", 1164838532);
        setIntField(term144805, term144805.getClass(), "playSyncCount", 1845718720);
        setIntField(term144805, term144805.getClass(), "winCount", -406124609);
        setIntField(term144805, term144805.getClass(), "helpCount", -1356007129);
        setIntField(term144805, term144805.getClass(), "comboCount", 18178207);
        setIntField(term144805, term144805.getClass(), "feverCount", 1434922903);
        setIntField(term144805, term144805.getClass(), "totalHiScore", -2036478643);
        setIntField(term144805, term144805.getClass(), "totalEasyHighScore", -565809872);
        setIntField(term144805, term144805.getClass(), "totalBasicHighScore", -38942459);
        setIntField(term144805, term144805.getClass(), "totalAdvancedHighScore", -431476916);
        setIntField(term144805, term144805.getClass(), "totalExpertHighScore", -662480951);
        setIntField(term144805, term144805.getClass(), "totalMasterHighScore", 973137323);
        setIntField(term144805, term144805.getClass(), "totalReMasterHighScore", -1962675156);
        setIntField(term144805, term144805.getClass(), "totalHighSync", 717474332);
        setIntField(term144805, term144805.getClass(), "totalEasySync", -908736408);
        setIntField(term144805, term144805.getClass(), "totalBasicSync", 27470179);
        setIntField(term144805, term144805.getClass(), "totalAdvancedSync", 809443159);
        setIntField(term144805, term144805.getClass(), "totalExpertSync", 1889731371);
        setIntField(term144805, term144805.getClass(), "totalMasterSync", 576807184);
        setIntField(term144805, term144805.getClass(), "totalReMasterSync", -931635900);
        setIntField(term144805, term144805.getClass(), "playerRating", 1716832300);
        setIntField(term144805, term144805.getClass(), "highestRating", 928949891);
        setIntField(term144805, term144805.getClass(), "rankAuthTailId", 1803982857);
        setField(term144805, term144805.getClass(), "eventWatchedDate", "GBSKSryDNr");
        setField(term144805, term144805.getClass(), "webLimitDate", "lewYJfdwbu");
        setIntField(term144805, term144805.getClass(), "challengeTrackPhase", 1375084537);
        setIntField(term144805, term144805.getClass(), "firstPlayBits", 1145555332);
        setField(term144805, term144805.getClass(), "lastPlayDate", "wmCdnKXFIV");
        setIntField(term144805, term144805.getClass(), "lastPlaceId", -1502279844);
        setField(term144805, term144805.getClass(), "lastPlaceName", "OQFYTZSsmT");
        setIntField(term144805, term144805.getClass(), "lastRegionId", -323144971);
        setField(term144805, term144805.getClass(), "lastRegionName", "sERwhJnfhH");
        setField(term144805, term144805.getClass(), "lastClientId", "ttMftcuYTC");
        setField(term144805, term144805.getClass(), "lastCountryCode", "ktSwbNnkjp");
        setIntField(term144805, term144805.getClass(), "eventPoint", 1354120150);
        setIntField(term144805, term144805.getClass(), "totalLv", -612634238);
        setIntField(term144805, term144805.getClass(), "lastLoginBonusDay", -1471750499);
        setIntField(term144805, term144805.getClass(), "lastSurvivalBonusDay", 624532733);
        setIntField(term144805, term144805.getClass(), "loginBonusLv", 1295979256);
        setField(term144803, term144803.getClass(), "user", term144805);
        setIntField(term144803, term144803.getClass(), "orderId", 1969513702);
        setLongField(term144803, term144803.getClass(), "sortNumber", -7465474190642854260L);
        setIntField(term144803, term144803.getClass(), "placeId", 1141181858);
        setField(term144803, term144803.getClass(), "placeName", "GnPQSLhuqc");
        setField(term144803, term144803.getClass(), "country", "mfxNrcSOVD");
        setIntField(term144803, term144803.getClass(), "regionId", 936701005);
        setField(term144803, term144803.getClass(), "playDate", "jrsTEswExz");
        setField(term144803, term144803.getClass(), "userPlayDate", "ZQJeRspiaW");
        setIntField(term144803, term144803.getClass(), "musicId", -1415304789);
        setIntField(term144803, term144803.getClass(), "level", -2124127326);
        setIntField(term144803, term144803.getClass(), "gameMode", 1735477568);
        setIntField(term144803, term144803.getClass(), "rivalNum", 191580865);
        setIntField(term144803, term144803.getClass(), "track", -474320117);
        setIntField(term144803, term144803.getClass(), "eventId", 1595884206);
        setBooleanField(term144803, term144803.getClass(), "isFreeToPlay", true);
        setIntField(term144803, term144803.getClass(), "playerRating", 214954245);
        setLongField(term144803, term144803.getClass(), "playedUserId1", -8372788044669645675L);
        setField(term144803, term144803.getClass(), "playedUserName1", "ZPHvVTleEx");
        setIntField(term144803, term144803.getClass(), "playedMusicLevel1", 619427296);
        setLongField(term144803, term144803.getClass(), "playedUserId2", -1591356946285738868L);
        setField(term144803, term144803.getClass(), "playedUserName2", "HTaevTdmSx");
        setIntField(term144803, term144803.getClass(), "playedMusicLevel2", 221397997);
        setLongField(term144803, term144803.getClass(), "playedUserId3", 8225112290225174957L);
        setField(term144803, term144803.getClass(), "playedUserName3", "fxACzuCTdG");
        setIntField(term144803, term144803.getClass(), "playedMusicLevel3", -135418088);
        setIntField(term144803, term144803.getClass(), "achievement", 445224644);
        setIntField(term144803, term144803.getClass(), "score", 1687112200);
        setIntField(term144803, term144803.getClass(), "tapScore", -1985802241);
        setIntField(term144803, term144803.getClass(), "holdScore", 1190891102);
        setIntField(term144803, term144803.getClass(), "slideScore", -723584432);
        setIntField(term144803, term144803.getClass(), "breakScore", 878546155);
        setIntField(term144803, term144803.getClass(), "syncRate", -390900435);
        setIntField(term144803, term144803.getClass(), "vsWin", 334696447);
        setBooleanField(term144803, term144803.getClass(), "isAllPerfect", false);
        setIntField(term144803, term144803.getClass(), "fullCombo", -1761968762);
        setIntField(term144803, term144803.getClass(), "maxFever", 1854303033);
        setIntField(term144803, term144803.getClass(), "maxCombo", -800499386);
        setIntField(term144803, term144803.getClass(), "tapPerfect", -1521564593);
        setIntField(term144803, term144803.getClass(), "tapGreat", 1674990736);
        setIntField(term144803, term144803.getClass(), "tapGood", 1433525662);
        setIntField(term144803, term144803.getClass(), "tapBad", 1381473759);
        setIntField(term144803, term144803.getClass(), "holdPerfect", -2034905973);
        setIntField(term144803, term144803.getClass(), "holdGreat", -652282264);
        setIntField(term144803, term144803.getClass(), "holdGood", -1594857233);
        setIntField(term144803, term144803.getClass(), "holdBad", 1705127543);
        setIntField(term144803, term144803.getClass(), "slidePerfect", 2053273644);
        setIntField(term144803, term144803.getClass(), "slideGreat", 179147163);
        setIntField(term144803, term144803.getClass(), "slideGood", -1829311073);
        setIntField(term144803, term144803.getClass(), "slideBad", 1292381403);
        setIntField(term144803, term144803.getClass(), "breakPerfect", -1413160065);
        setIntField(term144803, term144803.getClass(), "breakGreat", -1263630001);
        setIntField(term144803, term144803.getClass(), "breakGood", -1643939209);
        setIntField(term144803, term144803.getClass(), "breakBad", 1538211788);
        setBooleanField(term144803, term144803.getClass(), "isTrackSkip", false);
        setBooleanField(term144803, term144803.getClass(), "isHighScore", true);
        setBooleanField(term144803, term144803.getClass(), "isChallengeTrack", false);
        setIntField(term144803, term144803.getClass(), "challengeLife", 1922591605);
        setIntField(term144803, term144803.getClass(), "challengeRemain", 826556039);
        setIntField(term144803, term144803.getClass(), "isAllPerfectPlus", -1091561850);
        term145115 = new Integer(1512359902);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term145115;
        callMethod(klass, "setRegionId", argTypes, term144803, args);
    }

};


