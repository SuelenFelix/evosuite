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

public class UserPlaylog_getTapPerfect_45225183539 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term130799;

    public UserPlaylog_getTapPerfect_45225183539() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term130805 = new Long(2809748481176687920L);
        term130799 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog"));
        Object term130801 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term130803 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term130819 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term130820 = newInstance(Class.forName("java.time.LocalDate"));
        Object term130824 = newInstance(Class.forName("java.time.LocalTime"));
        Object term130829 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term130830 = newInstance(Class.forName("java.time.LocalDate"));
        Object term130834 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term130799, term130799.getClass(), "id", -9063283724358706942L);
        setLongField(term130801, term130801.getClass(), "id", -8579515460152917650L);
        setLongField(term130803, term130803.getClass(), "id", -3033236171719733686L);
        setField(term130803, term130803.getClass(), "extId", term130805);
        setField(term130803, term130803.getClass(), "luid", "WjMAISAxtn");
        setIntField(term130820, term130820.getClass(), "year", 2020);
        setShortField(term130820, term130820.getClass(), "month", (short) 9);
        setShortField(term130820, term130820.getClass(), "day", (short) 4);
        setField(term130819, term130819.getClass(), "date", term130820);
        setByteField(term130824, term130824.getClass(), "hour", (byte) 12);
        setByteField(term130824, term130824.getClass(), "minute", (byte) 38);
        setByteField(term130824, term130824.getClass(), "second", (byte) 4);
        setIntField(term130824, term130824.getClass(), "nano", 271635259);
        setField(term130819, term130819.getClass(), "time", term130824);
        setField(term130803, term130803.getClass(), "registerTime", term130819);
        setIntField(term130830, term130830.getClass(), "year", 2018);
        setShortField(term130830, term130830.getClass(), "month", (short) 7);
        setShortField(term130830, term130830.getClass(), "day", (short) 4);
        setField(term130829, term130829.getClass(), "date", term130830);
        setByteField(term130834, term130834.getClass(), "hour", (byte) 3);
        setByteField(term130834, term130834.getClass(), "minute", (byte) 57);
        setByteField(term130834, term130834.getClass(), "second", (byte) 49);
        setIntField(term130834, term130834.getClass(), "nano", 243468525);
        setField(term130829, term130829.getClass(), "time", term130834);
        setField(term130803, term130803.getClass(), "accessTime", term130829);
        setField(term130801, term130801.getClass(), "card", term130803);
        setIntField(term130801, term130801.getClass(), "lastDataVersion", -1534444558);
        setField(term130801, term130801.getClass(), "userName", "GiDsfCiYsm");
        setIntField(term130801, term130801.getClass(), "point", 1271435487);
        setIntField(term130801, term130801.getClass(), "totalPoint", 1526872682);
        setIntField(term130801, term130801.getClass(), "iconId", 470395773);
        setIntField(term130801, term130801.getClass(), "nameplateId", 1966072241);
        setIntField(term130801, term130801.getClass(), "frameId", 2108900398);
        setIntField(term130801, term130801.getClass(), "trophyId", 1744719785);
        setIntField(term130801, term130801.getClass(), "playCount", 1795343970);
        setIntField(term130801, term130801.getClass(), "playVsCount", -1650657014);
        setIntField(term130801, term130801.getClass(), "playSyncCount", 2107394839);
        setIntField(term130801, term130801.getClass(), "winCount", 1203559115);
        setIntField(term130801, term130801.getClass(), "helpCount", -735043039);
        setIntField(term130801, term130801.getClass(), "comboCount", 374592590);
        setIntField(term130801, term130801.getClass(), "feverCount", -1110893653);
        setIntField(term130801, term130801.getClass(), "totalHiScore", -480361808);
        setIntField(term130801, term130801.getClass(), "totalEasyHighScore", -1011653088);
        setIntField(term130801, term130801.getClass(), "totalBasicHighScore", 215281647);
        setIntField(term130801, term130801.getClass(), "totalAdvancedHighScore", 1705304596);
        setIntField(term130801, term130801.getClass(), "totalExpertHighScore", -1346401084);
        setIntField(term130801, term130801.getClass(), "totalMasterHighScore", -1539654405);
        setIntField(term130801, term130801.getClass(), "totalReMasterHighScore", 1858554469);
        setIntField(term130801, term130801.getClass(), "totalHighSync", -1894464350);
        setIntField(term130801, term130801.getClass(), "totalEasySync", -1711976057);
        setIntField(term130801, term130801.getClass(), "totalBasicSync", -390494018);
        setIntField(term130801, term130801.getClass(), "totalAdvancedSync", 930338389);
        setIntField(term130801, term130801.getClass(), "totalExpertSync", -1648110301);
        setIntField(term130801, term130801.getClass(), "totalMasterSync", -1092422328);
        setIntField(term130801, term130801.getClass(), "totalReMasterSync", 1635493456);
        setIntField(term130801, term130801.getClass(), "playerRating", -1098683664);
        setIntField(term130801, term130801.getClass(), "highestRating", -1070840970);
        setIntField(term130801, term130801.getClass(), "rankAuthTailId", -1744426701);
        setField(term130801, term130801.getClass(), "eventWatchedDate", "RuvnkQFdLv");
        setField(term130801, term130801.getClass(), "webLimitDate", "zAaRUjWcRI");
        setIntField(term130801, term130801.getClass(), "challengeTrackPhase", -1939540947);
        setIntField(term130801, term130801.getClass(), "firstPlayBits", 1006687897);
        setField(term130801, term130801.getClass(), "lastPlayDate", "biuSELVcRS");
        setIntField(term130801, term130801.getClass(), "lastPlaceId", 1751688546);
        setField(term130801, term130801.getClass(), "lastPlaceName", "QvIFmvEUyM");
        setIntField(term130801, term130801.getClass(), "lastRegionId", -2104821618);
        setField(term130801, term130801.getClass(), "lastRegionName", "WIZrBpMEJd");
        setField(term130801, term130801.getClass(), "lastClientId", "judJxGaXAJ");
        setField(term130801, term130801.getClass(), "lastCountryCode", "YyIBJVokET");
        setIntField(term130801, term130801.getClass(), "eventPoint", 1326846039);
        setIntField(term130801, term130801.getClass(), "totalLv", -1047070774);
        setIntField(term130801, term130801.getClass(), "lastLoginBonusDay", -533633117);
        setIntField(term130801, term130801.getClass(), "lastSurvivalBonusDay", 205317695);
        setIntField(term130801, term130801.getClass(), "loginBonusLv", 130711950);
        setField(term130799, term130799.getClass(), "user", term130801);
        setIntField(term130799, term130799.getClass(), "orderId", 370999352);
        setLongField(term130799, term130799.getClass(), "sortNumber", 2458513029160061715L);
        setIntField(term130799, term130799.getClass(), "placeId", -451429306);
        setField(term130799, term130799.getClass(), "placeName", "oUsLXfeBhj");
        setField(term130799, term130799.getClass(), "country", "dNmDNoDsCT");
        setIntField(term130799, term130799.getClass(), "regionId", -131211631);
        setField(term130799, term130799.getClass(), "playDate", "FKYroLkXZi");
        setField(term130799, term130799.getClass(), "userPlayDate", "qnoyvZRqBI");
        setIntField(term130799, term130799.getClass(), "musicId", 1582546878);
        setIntField(term130799, term130799.getClass(), "level", -1660860876);
        setIntField(term130799, term130799.getClass(), "gameMode", -380593610);
        setIntField(term130799, term130799.getClass(), "rivalNum", 724828471);
        setIntField(term130799, term130799.getClass(), "track", -1395142728);
        setIntField(term130799, term130799.getClass(), "eventId", -783988653);
        setBooleanField(term130799, term130799.getClass(), "isFreeToPlay", true);
        setIntField(term130799, term130799.getClass(), "playerRating", 1870111253);
        setLongField(term130799, term130799.getClass(), "playedUserId1", 8528564099162820842L);
        setField(term130799, term130799.getClass(), "playedUserName1", "iBRFyvlgRW");
        setIntField(term130799, term130799.getClass(), "playedMusicLevel1", -1561622640);
        setLongField(term130799, term130799.getClass(), "playedUserId2", -1931621459457925623L);
        setField(term130799, term130799.getClass(), "playedUserName2", "UjtHbgdpKi");
        setIntField(term130799, term130799.getClass(), "playedMusicLevel2", 523331108);
        setLongField(term130799, term130799.getClass(), "playedUserId3", -947267660485940099L);
        setField(term130799, term130799.getClass(), "playedUserName3", "QZUqVBZaTe");
        setIntField(term130799, term130799.getClass(), "playedMusicLevel3", -775698607);
        setIntField(term130799, term130799.getClass(), "achievement", 1440414800);
        setIntField(term130799, term130799.getClass(), "score", -1057338580);
        setIntField(term130799, term130799.getClass(), "tapScore", -482687562);
        setIntField(term130799, term130799.getClass(), "holdScore", 614734386);
        setIntField(term130799, term130799.getClass(), "slideScore", 1969128557);
        setIntField(term130799, term130799.getClass(), "breakScore", -735661938);
        setIntField(term130799, term130799.getClass(), "syncRate", -2094281568);
        setIntField(term130799, term130799.getClass(), "vsWin", -1335091031);
        setBooleanField(term130799, term130799.getClass(), "isAllPerfect", true);
        setIntField(term130799, term130799.getClass(), "fullCombo", -99232346);
        setIntField(term130799, term130799.getClass(), "maxFever", 699136563);
        setIntField(term130799, term130799.getClass(), "maxCombo", 147252551);
        setIntField(term130799, term130799.getClass(), "tapPerfect", 341079997);
        setIntField(term130799, term130799.getClass(), "tapGreat", 1704594619);
        setIntField(term130799, term130799.getClass(), "tapGood", -1621997613);
        setIntField(term130799, term130799.getClass(), "tapBad", 194498105);
        setIntField(term130799, term130799.getClass(), "holdPerfect", 228119722);
        setIntField(term130799, term130799.getClass(), "holdGreat", 1712935684);
        setIntField(term130799, term130799.getClass(), "holdGood", -1167014426);
        setIntField(term130799, term130799.getClass(), "holdBad", -1186828963);
        setIntField(term130799, term130799.getClass(), "slidePerfect", -1632065019);
        setIntField(term130799, term130799.getClass(), "slideGreat", 376145605);
        setIntField(term130799, term130799.getClass(), "slideGood", -2056990359);
        setIntField(term130799, term130799.getClass(), "slideBad", 470753899);
        setIntField(term130799, term130799.getClass(), "breakPerfect", -969245918);
        setIntField(term130799, term130799.getClass(), "breakGreat", -463956795);
        setIntField(term130799, term130799.getClass(), "breakGood", -1133440031);
        setIntField(term130799, term130799.getClass(), "breakBad", -188396386);
        setBooleanField(term130799, term130799.getClass(), "isTrackSkip", false);
        setBooleanField(term130799, term130799.getClass(), "isHighScore", false);
        setBooleanField(term130799, term130799.getClass(), "isChallengeTrack", true);
        setIntField(term130799, term130799.getClass(), "challengeLife", -288980551);
        setIntField(term130799, term130799.getClass(), "challengeRemain", 670193441);
        setIntField(term130799, term130799.getClass(), "isAllPerfectPlus", 1084480415);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTapPerfect", argTypes, term130799, args);
    }

};


