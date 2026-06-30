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

public class UserData_getTrophyId_15126152229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2377;

    public UserData_getTrophyId_15126152229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2381 = new Long(6967924379644551255L);
        term2377 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term2379 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term2395 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2396 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2400 = newInstance(Class.forName("java.time.LocalTime"));
        Object term2405 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2406 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2410 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term2377, term2377.getClass(), "id", -6573104506744284592L);
        setLongField(term2379, term2379.getClass(), "id", -4920224193275732920L);
        setField(term2379, term2379.getClass(), "extId", term2381);
        setField(term2379, term2379.getClass(), "luid", "VgZnGoIFwQ");
        setIntField(term2396, term2396.getClass(), "year", 2017);
        setShortField(term2396, term2396.getClass(), "month", (short) 3);
        setShortField(term2396, term2396.getClass(), "day", (short) 5);
        setField(term2395, term2395.getClass(), "date", term2396);
        setByteField(term2400, term2400.getClass(), "hour", (byte) 20);
        setByteField(term2400, term2400.getClass(), "minute", (byte) 34);
        setByteField(term2400, term2400.getClass(), "second", (byte) 55);
        setIntField(term2400, term2400.getClass(), "nano", 78024496);
        setField(term2395, term2395.getClass(), "time", term2400);
        setField(term2379, term2379.getClass(), "registerTime", term2395);
        setIntField(term2406, term2406.getClass(), "year", 2020);
        setShortField(term2406, term2406.getClass(), "month", (short) 7);
        setShortField(term2406, term2406.getClass(), "day", (short) 24);
        setField(term2405, term2405.getClass(), "date", term2406);
        setByteField(term2410, term2410.getClass(), "hour", (byte) 0);
        setByteField(term2410, term2410.getClass(), "minute", (byte) 59);
        setByteField(term2410, term2410.getClass(), "second", (byte) 56);
        setIntField(term2410, term2410.getClass(), "nano", 320219201);
        setField(term2405, term2405.getClass(), "time", term2410);
        setField(term2379, term2379.getClass(), "accessTime", term2405);
        setField(term2377, term2377.getClass(), "card", term2379);
        setIntField(term2377, term2377.getClass(), "lastDataVersion", 719656595);
        setField(term2377, term2377.getClass(), "userName", "jUbSRrkrYZ");
        setIntField(term2377, term2377.getClass(), "point", -1516995753);
        setIntField(term2377, term2377.getClass(), "totalPoint", -390501023);
        setIntField(term2377, term2377.getClass(), "iconId", -1667482829);
        setIntField(term2377, term2377.getClass(), "nameplateId", 1116576792);
        setIntField(term2377, term2377.getClass(), "frameId", -942194446);
        setIntField(term2377, term2377.getClass(), "trophyId", -938508470);
        setIntField(term2377, term2377.getClass(), "playCount", 1242676024);
        setIntField(term2377, term2377.getClass(), "playVsCount", -1865023308);
        setIntField(term2377, term2377.getClass(), "playSyncCount", 1698510819);
        setIntField(term2377, term2377.getClass(), "winCount", -1553893255);
        setIntField(term2377, term2377.getClass(), "helpCount", 1303442927);
        setIntField(term2377, term2377.getClass(), "comboCount", 794568325);
        setIntField(term2377, term2377.getClass(), "feverCount", -434468428);
        setIntField(term2377, term2377.getClass(), "totalHiScore", 1559605714);
        setIntField(term2377, term2377.getClass(), "totalEasyHighScore", 1146601902);
        setIntField(term2377, term2377.getClass(), "totalBasicHighScore", -1938881385);
        setIntField(term2377, term2377.getClass(), "totalAdvancedHighScore", -1629418973);
        setIntField(term2377, term2377.getClass(), "totalExpertHighScore", -100825168);
        setIntField(term2377, term2377.getClass(), "totalMasterHighScore", 768407648);
        setIntField(term2377, term2377.getClass(), "totalReMasterHighScore", -350454594);
        setIntField(term2377, term2377.getClass(), "totalHighSync", -1148142995);
        setIntField(term2377, term2377.getClass(), "totalEasySync", -233024044);
        setIntField(term2377, term2377.getClass(), "totalBasicSync", 1820784228);
        setIntField(term2377, term2377.getClass(), "totalAdvancedSync", 1390820006);
        setIntField(term2377, term2377.getClass(), "totalExpertSync", -828982065);
        setIntField(term2377, term2377.getClass(), "totalMasterSync", 1221443226);
        setIntField(term2377, term2377.getClass(), "totalReMasterSync", 908108726);
        setIntField(term2377, term2377.getClass(), "playerRating", 1023209512);
        setIntField(term2377, term2377.getClass(), "highestRating", 1084849225);
        setIntField(term2377, term2377.getClass(), "rankAuthTailId", -1702055571);
        setField(term2377, term2377.getClass(), "eventWatchedDate", "bWWfajKbEX");
        setField(term2377, term2377.getClass(), "webLimitDate", "cAPeiZHKGJ");
        setIntField(term2377, term2377.getClass(), "challengeTrackPhase", -944542900);
        setIntField(term2377, term2377.getClass(), "firstPlayBits", 2063762142);
        setField(term2377, term2377.getClass(), "lastPlayDate", "LvJFtLBaxj");
        setIntField(term2377, term2377.getClass(), "lastPlaceId", 1658391716);
        setField(term2377, term2377.getClass(), "lastPlaceName", "PHvxnGHptP");
        setIntField(term2377, term2377.getClass(), "lastRegionId", 2143282300);
        setField(term2377, term2377.getClass(), "lastRegionName", "TimdotUuNC");
        setField(term2377, term2377.getClass(), "lastClientId", "PkWMRdJcBb");
        setField(term2377, term2377.getClass(), "lastCountryCode", "jSpAteRute");
        setIntField(term2377, term2377.getClass(), "eventPoint", 1137624258);
        setIntField(term2377, term2377.getClass(), "totalLv", 977862393);
        setIntField(term2377, term2377.getClass(), "lastLoginBonusDay", 301401782);
        setIntField(term2377, term2377.getClass(), "lastSurvivalBonusDay", 1988605357);
        setIntField(term2377, term2377.getClass(), "loginBonusLv", 808203320);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTrophyId", argTypes, term2377, args);
    }

};


