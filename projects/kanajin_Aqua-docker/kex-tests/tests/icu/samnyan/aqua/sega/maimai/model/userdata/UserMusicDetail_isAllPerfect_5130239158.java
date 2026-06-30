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

public class UserMusicDetail_isAllPerfect_5130239158 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term182125;

    public UserMusicDetail_isAllPerfect_5130239158() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term182131 = new Long(6323132402520425961L);
        term182125 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserMusicDetail"));
        Object term182127 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term182129 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term182145 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term182146 = newInstance(Class.forName("java.time.LocalDate"));
        Object term182150 = newInstance(Class.forName("java.time.LocalTime"));
        Object term182155 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term182156 = newInstance(Class.forName("java.time.LocalDate"));
        Object term182160 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term182125, term182125.getClass(), "id", 8962086662826420449L);
        setLongField(term182127, term182127.getClass(), "id", 4633683327243391760L);
        setLongField(term182129, term182129.getClass(), "id", -5857237775500629566L);
        setField(term182129, term182129.getClass(), "extId", term182131);
        setField(term182129, term182129.getClass(), "luid", "itHxInHLQD");
        setIntField(term182146, term182146.getClass(), "year", 2029);
        setShortField(term182146, term182146.getClass(), "month", (short) 7);
        setShortField(term182146, term182146.getClass(), "day", (short) 13);
        setField(term182145, term182145.getClass(), "date", term182146);
        setByteField(term182150, term182150.getClass(), "hour", (byte) 7);
        setByteField(term182150, term182150.getClass(), "minute", (byte) 34);
        setByteField(term182150, term182150.getClass(), "second", (byte) 20);
        setIntField(term182150, term182150.getClass(), "nano", 680789319);
        setField(term182145, term182145.getClass(), "time", term182150);
        setField(term182129, term182129.getClass(), "registerTime", term182145);
        setIntField(term182156, term182156.getClass(), "year", 2026);
        setShortField(term182156, term182156.getClass(), "month", (short) 11);
        setShortField(term182156, term182156.getClass(), "day", (short) 25);
        setField(term182155, term182155.getClass(), "date", term182156);
        setByteField(term182160, term182160.getClass(), "hour", (byte) 23);
        setByteField(term182160, term182160.getClass(), "minute", (byte) 11);
        setByteField(term182160, term182160.getClass(), "second", (byte) 13);
        setIntField(term182160, term182160.getClass(), "nano", 68488401);
        setField(term182155, term182155.getClass(), "time", term182160);
        setField(term182129, term182129.getClass(), "accessTime", term182155);
        setField(term182127, term182127.getClass(), "card", term182129);
        setIntField(term182127, term182127.getClass(), "lastDataVersion", -2064557685);
        setField(term182127, term182127.getClass(), "userName", "YKcZHffhWM");
        setIntField(term182127, term182127.getClass(), "point", 1780252787);
        setIntField(term182127, term182127.getClass(), "totalPoint", 336902594);
        setIntField(term182127, term182127.getClass(), "iconId", 2077151107);
        setIntField(term182127, term182127.getClass(), "nameplateId", 1496911063);
        setIntField(term182127, term182127.getClass(), "frameId", -530622611);
        setIntField(term182127, term182127.getClass(), "trophyId", -706366573);
        setIntField(term182127, term182127.getClass(), "playCount", -22867344);
        setIntField(term182127, term182127.getClass(), "playVsCount", -510774872);
        setIntField(term182127, term182127.getClass(), "playSyncCount", -1105898284);
        setIntField(term182127, term182127.getClass(), "winCount", -1824588871);
        setIntField(term182127, term182127.getClass(), "helpCount", 880022277);
        setIntField(term182127, term182127.getClass(), "comboCount", -1876545561);
        setIntField(term182127, term182127.getClass(), "feverCount", 1577196058);
        setIntField(term182127, term182127.getClass(), "totalHiScore", -1764173170);
        setIntField(term182127, term182127.getClass(), "totalEasyHighScore", 1395719969);
        setIntField(term182127, term182127.getClass(), "totalBasicHighScore", -674781917);
        setIntField(term182127, term182127.getClass(), "totalAdvancedHighScore", -237391583);
        setIntField(term182127, term182127.getClass(), "totalExpertHighScore", -1381301432);
        setIntField(term182127, term182127.getClass(), "totalMasterHighScore", -2144324925);
        setIntField(term182127, term182127.getClass(), "totalReMasterHighScore", 1774236307);
        setIntField(term182127, term182127.getClass(), "totalHighSync", -1847108627);
        setIntField(term182127, term182127.getClass(), "totalEasySync", 1098824608);
        setIntField(term182127, term182127.getClass(), "totalBasicSync", 859271394);
        setIntField(term182127, term182127.getClass(), "totalAdvancedSync", -18503845);
        setIntField(term182127, term182127.getClass(), "totalExpertSync", -1926943845);
        setIntField(term182127, term182127.getClass(), "totalMasterSync", 1703500212);
        setIntField(term182127, term182127.getClass(), "totalReMasterSync", 663639421);
        setIntField(term182127, term182127.getClass(), "playerRating", 291080974);
        setIntField(term182127, term182127.getClass(), "highestRating", -641625454);
        setIntField(term182127, term182127.getClass(), "rankAuthTailId", -1600766931);
        setField(term182127, term182127.getClass(), "eventWatchedDate", "FVvtvTPEiD");
        setField(term182127, term182127.getClass(), "webLimitDate", "paedcGulXI");
        setIntField(term182127, term182127.getClass(), "challengeTrackPhase", 503141615);
        setIntField(term182127, term182127.getClass(), "firstPlayBits", -923382668);
        setField(term182127, term182127.getClass(), "lastPlayDate", "voVkXMJSsx");
        setIntField(term182127, term182127.getClass(), "lastPlaceId", 1815045623);
        setField(term182127, term182127.getClass(), "lastPlaceName", "tOqDchKApH");
        setIntField(term182127, term182127.getClass(), "lastRegionId", 1326817444);
        setField(term182127, term182127.getClass(), "lastRegionName", "iqeVuiibgM");
        setField(term182127, term182127.getClass(), "lastClientId", "LCPfALdqnP");
        setField(term182127, term182127.getClass(), "lastCountryCode", "YRvjJByBZa");
        setIntField(term182127, term182127.getClass(), "eventPoint", 1307368584);
        setIntField(term182127, term182127.getClass(), "totalLv", 2101516428);
        setIntField(term182127, term182127.getClass(), "lastLoginBonusDay", 464519782);
        setIntField(term182127, term182127.getClass(), "lastSurvivalBonusDay", -52954047);
        setIntField(term182127, term182127.getClass(), "loginBonusLv", -620926886);
        setField(term182125, term182125.getClass(), "user", term182127);
        setIntField(term182125, term182125.getClass(), "musicId", 1648336339);
        setIntField(term182125, term182125.getClass(), "level", 235833310);
        setIntField(term182125, term182125.getClass(), "playCount", 1486076581);
        setIntField(term182125, term182125.getClass(), "scoreMax", 1621795408);
        setIntField(term182125, term182125.getClass(), "syncRateMax", -1992736826);
        setBooleanField(term182125, term182125.getClass(), "isAllPerfect", true);
        setIntField(term182125, term182125.getClass(), "isAllPerfectPlus", 339632380);
        setIntField(term182125, term182125.getClass(), "fullCombo", -858945783);
        setIntField(term182125, term182125.getClass(), "maxFever", 1679351427);
        setIntField(term182125, term182125.getClass(), "achievement", 1751613094);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isAllPerfect", argTypes, term182125, args);
    }

};


