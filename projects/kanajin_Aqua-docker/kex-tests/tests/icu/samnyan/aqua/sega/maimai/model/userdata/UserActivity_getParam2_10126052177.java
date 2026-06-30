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

public class UserActivity_getParam2_10126052177 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45613;

    public UserActivity_getParam2_10126052177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term45619 = new Long(3452833434644634217L);
        term45613 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserActivity"));
        Object term45615 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term45617 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term45633 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term45634 = newInstance(Class.forName("java.time.LocalDate"));
        Object term45638 = newInstance(Class.forName("java.time.LocalTime"));
        Object term45643 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term45644 = newInstance(Class.forName("java.time.LocalDate"));
        Object term45648 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term45613, term45613.getClass(), "id", 8765880103547975810L);
        setLongField(term45615, term45615.getClass(), "id", 4552367707739103094L);
        setLongField(term45617, term45617.getClass(), "id", -6001151456088965547L);
        setField(term45617, term45617.getClass(), "extId", term45619);
        setField(term45617, term45617.getClass(), "luid", "scReMUKyGq");
        setIntField(term45634, term45634.getClass(), "year", 2025);
        setShortField(term45634, term45634.getClass(), "month", (short) 4);
        setShortField(term45634, term45634.getClass(), "day", (short) 6);
        setField(term45633, term45633.getClass(), "date", term45634);
        setByteField(term45638, term45638.getClass(), "hour", (byte) 23);
        setByteField(term45638, term45638.getClass(), "minute", (byte) 17);
        setByteField(term45638, term45638.getClass(), "second", (byte) 11);
        setIntField(term45638, term45638.getClass(), "nano", 928165672);
        setField(term45633, term45633.getClass(), "time", term45638);
        setField(term45617, term45617.getClass(), "registerTime", term45633);
        setIntField(term45644, term45644.getClass(), "year", 2022);
        setShortField(term45644, term45644.getClass(), "month", (short) 3);
        setShortField(term45644, term45644.getClass(), "day", (short) 20);
        setField(term45643, term45643.getClass(), "date", term45644);
        setByteField(term45648, term45648.getClass(), "hour", (byte) 20);
        setByteField(term45648, term45648.getClass(), "minute", (byte) 31);
        setByteField(term45648, term45648.getClass(), "second", (byte) 56);
        setIntField(term45648, term45648.getClass(), "nano", 682853702);
        setField(term45643, term45643.getClass(), "time", term45648);
        setField(term45617, term45617.getClass(), "accessTime", term45643);
        setField(term45615, term45615.getClass(), "card", term45617);
        setIntField(term45615, term45615.getClass(), "lastDataVersion", 625501454);
        setField(term45615, term45615.getClass(), "userName", "FmIpnxjRxA");
        setIntField(term45615, term45615.getClass(), "point", -1941817273);
        setIntField(term45615, term45615.getClass(), "totalPoint", -919598814);
        setIntField(term45615, term45615.getClass(), "iconId", -1521283679);
        setIntField(term45615, term45615.getClass(), "nameplateId", 1502377250);
        setIntField(term45615, term45615.getClass(), "frameId", 1581416400);
        setIntField(term45615, term45615.getClass(), "trophyId", 1963777573);
        setIntField(term45615, term45615.getClass(), "playCount", -998538950);
        setIntField(term45615, term45615.getClass(), "playVsCount", 1644825964);
        setIntField(term45615, term45615.getClass(), "playSyncCount", -331554346);
        setIntField(term45615, term45615.getClass(), "winCount", -774907545);
        setIntField(term45615, term45615.getClass(), "helpCount", -2104980850);
        setIntField(term45615, term45615.getClass(), "comboCount", -1700414059);
        setIntField(term45615, term45615.getClass(), "feverCount", 894475811);
        setIntField(term45615, term45615.getClass(), "totalHiScore", -1219489703);
        setIntField(term45615, term45615.getClass(), "totalEasyHighScore", 710854131);
        setIntField(term45615, term45615.getClass(), "totalBasicHighScore", 1477787899);
        setIntField(term45615, term45615.getClass(), "totalAdvancedHighScore", 296655703);
        setIntField(term45615, term45615.getClass(), "totalExpertHighScore", -1558411918);
        setIntField(term45615, term45615.getClass(), "totalMasterHighScore", 595358328);
        setIntField(term45615, term45615.getClass(), "totalReMasterHighScore", -1447510365);
        setIntField(term45615, term45615.getClass(), "totalHighSync", 2021579205);
        setIntField(term45615, term45615.getClass(), "totalEasySync", 1117186881);
        setIntField(term45615, term45615.getClass(), "totalBasicSync", -116229778);
        setIntField(term45615, term45615.getClass(), "totalAdvancedSync", 1102287982);
        setIntField(term45615, term45615.getClass(), "totalExpertSync", 82817178);
        setIntField(term45615, term45615.getClass(), "totalMasterSync", 1619985605);
        setIntField(term45615, term45615.getClass(), "totalReMasterSync", -1020794327);
        setIntField(term45615, term45615.getClass(), "playerRating", 719987081);
        setIntField(term45615, term45615.getClass(), "highestRating", -1306969788);
        setIntField(term45615, term45615.getClass(), "rankAuthTailId", -272419076);
        setField(term45615, term45615.getClass(), "eventWatchedDate", "FTjxxGvyun");
        setField(term45615, term45615.getClass(), "webLimitDate", "qsjXSwKloH");
        setIntField(term45615, term45615.getClass(), "challengeTrackPhase", -1366102520);
        setIntField(term45615, term45615.getClass(), "firstPlayBits", -991083478);
        setField(term45615, term45615.getClass(), "lastPlayDate", "DDZHUPglvb");
        setIntField(term45615, term45615.getClass(), "lastPlaceId", -1423864560);
        setField(term45615, term45615.getClass(), "lastPlaceName", "rWoaXvNyVg");
        setIntField(term45615, term45615.getClass(), "lastRegionId", 1155538873);
        setField(term45615, term45615.getClass(), "lastRegionName", "FLzaBCFjGv");
        setField(term45615, term45615.getClass(), "lastClientId", "OLYhTSqTqJ");
        setField(term45615, term45615.getClass(), "lastCountryCode", "AIHoadcpQz");
        setIntField(term45615, term45615.getClass(), "eventPoint", 868120753);
        setIntField(term45615, term45615.getClass(), "totalLv", 691240568);
        setIntField(term45615, term45615.getClass(), "lastLoginBonusDay", 1689565461);
        setIntField(term45615, term45615.getClass(), "lastSurvivalBonusDay", 1105348026);
        setIntField(term45615, term45615.getClass(), "loginBonusLv", -35374943);
        setField(term45613, term45613.getClass(), "user", term45615);
        setIntField(term45613, term45613.getClass(), "kind", -561318198);
        setIntField(term45613, term45613.getClass(), "activityId", -1196585904);
        setLongField(term45613, term45613.getClass(), "sortNumber", 1740732617708040141L);
        setIntField(term45613, term45613.getClass(), "param1", 123352569);
        setIntField(term45613, term45613.getClass(), "param2", 2027326435);
        setIntField(term45613, term45613.getClass(), "param3", 1185859348);
        setIntField(term45613, term45613.getClass(), "param4", -1963285488);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserActivity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getParam2", argTypes, term45613, args);
    }

};


