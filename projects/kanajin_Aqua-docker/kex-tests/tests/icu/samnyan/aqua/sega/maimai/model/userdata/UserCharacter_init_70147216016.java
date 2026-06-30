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
import java.lang.Long;
import java.lang.Object;
import java.lang.Integer;

public class UserCharacter_init_70147216016 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36903;
     Object term36905;
     Object term37079;
     Object term37081;
     Object term37083;

    public UserCharacter_init_70147216016() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36903 = new Long(-2187638136407967948L);
        Long term36909 = new Long(-900457279156388404L);
        term36905 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term36907 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term36923 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term36924 = newInstance(Class.forName("java.time.LocalDate"));
        Object term36928 = newInstance(Class.forName("java.time.LocalTime"));
        Object term36933 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term36934 = newInstance(Class.forName("java.time.LocalDate"));
        Object term36938 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term36905, term36905.getClass(), "id", 8708846223293804408L);
        setLongField(term36907, term36907.getClass(), "id", -2986201902216133814L);
        setField(term36907, term36907.getClass(), "extId", term36909);
        setField(term36907, term36907.getClass(), "luid", "mzPebFiUSP");
        setIntField(term36924, term36924.getClass(), "year", 2025);
        setShortField(term36924, term36924.getClass(), "month", (short) 1);
        setShortField(term36924, term36924.getClass(), "day", (short) 20);
        setField(term36923, term36923.getClass(), "date", term36924);
        setByteField(term36928, term36928.getClass(), "hour", (byte) 22);
        setByteField(term36928, term36928.getClass(), "minute", (byte) 55);
        setByteField(term36928, term36928.getClass(), "second", (byte) 9);
        setIntField(term36928, term36928.getClass(), "nano", 660955568);
        setField(term36923, term36923.getClass(), "time", term36928);
        setField(term36907, term36907.getClass(), "registerTime", term36923);
        setIntField(term36934, term36934.getClass(), "year", 2014);
        setShortField(term36934, term36934.getClass(), "month", (short) 2);
        setShortField(term36934, term36934.getClass(), "day", (short) 26);
        setField(term36933, term36933.getClass(), "date", term36934);
        setByteField(term36938, term36938.getClass(), "hour", (byte) 16);
        setByteField(term36938, term36938.getClass(), "minute", (byte) 42);
        setByteField(term36938, term36938.getClass(), "second", (byte) 39);
        setIntField(term36938, term36938.getClass(), "nano", 690212071);
        setField(term36933, term36933.getClass(), "time", term36938);
        setField(term36907, term36907.getClass(), "accessTime", term36933);
        setField(term36905, term36905.getClass(), "card", term36907);
        setIntField(term36905, term36905.getClass(), "lastDataVersion", -1141611223);
        setField(term36905, term36905.getClass(), "userName", "HvbkjsQyDy");
        setIntField(term36905, term36905.getClass(), "point", -1637961050);
        setIntField(term36905, term36905.getClass(), "totalPoint", 1515109550);
        setIntField(term36905, term36905.getClass(), "iconId", 1249494915);
        setIntField(term36905, term36905.getClass(), "nameplateId", 1840485574);
        setIntField(term36905, term36905.getClass(), "frameId", -1384928271);
        setIntField(term36905, term36905.getClass(), "trophyId", 1760478472);
        setIntField(term36905, term36905.getClass(), "playCount", 611874985);
        setIntField(term36905, term36905.getClass(), "playVsCount", -1490909009);
        setIntField(term36905, term36905.getClass(), "playSyncCount", -1045578030);
        setIntField(term36905, term36905.getClass(), "winCount", 1595269473);
        setIntField(term36905, term36905.getClass(), "helpCount", 1542667674);
        setIntField(term36905, term36905.getClass(), "comboCount", 1314061353);
        setIntField(term36905, term36905.getClass(), "feverCount", 1341217092);
        setIntField(term36905, term36905.getClass(), "totalHiScore", -1945365712);
        setIntField(term36905, term36905.getClass(), "totalEasyHighScore", -746947278);
        setIntField(term36905, term36905.getClass(), "totalBasicHighScore", 799648581);
        setIntField(term36905, term36905.getClass(), "totalAdvancedHighScore", -1929592392);
        setIntField(term36905, term36905.getClass(), "totalExpertHighScore", -557536719);
        setIntField(term36905, term36905.getClass(), "totalMasterHighScore", -1507520585);
        setIntField(term36905, term36905.getClass(), "totalReMasterHighScore", 87370597);
        setIntField(term36905, term36905.getClass(), "totalHighSync", -1516708019);
        setIntField(term36905, term36905.getClass(), "totalEasySync", 1316108940);
        setIntField(term36905, term36905.getClass(), "totalBasicSync", -1092328406);
        setIntField(term36905, term36905.getClass(), "totalAdvancedSync", -1065662465);
        setIntField(term36905, term36905.getClass(), "totalExpertSync", 689033534);
        setIntField(term36905, term36905.getClass(), "totalMasterSync", -1092529867);
        setIntField(term36905, term36905.getClass(), "totalReMasterSync", -1788533025);
        setIntField(term36905, term36905.getClass(), "playerRating", -1271339104);
        setIntField(term36905, term36905.getClass(), "highestRating", -815986276);
        setIntField(term36905, term36905.getClass(), "rankAuthTailId", 1352632981);
        setField(term36905, term36905.getClass(), "eventWatchedDate", "wzSukELQFL");
        setField(term36905, term36905.getClass(), "webLimitDate", "VZyeaOWYEj");
        setIntField(term36905, term36905.getClass(), "challengeTrackPhase", -2076492465);
        setIntField(term36905, term36905.getClass(), "firstPlayBits", -926106316);
        setField(term36905, term36905.getClass(), "lastPlayDate", "PErxMBQSUv");
        setIntField(term36905, term36905.getClass(), "lastPlaceId", 142204732);
        setField(term36905, term36905.getClass(), "lastPlaceName", "KZQwbvujui");
        setIntField(term36905, term36905.getClass(), "lastRegionId", 1428877162);
        setField(term36905, term36905.getClass(), "lastRegionName", "JPUZuGxKlI");
        setField(term36905, term36905.getClass(), "lastClientId", "xqIbVsUspl");
        setField(term36905, term36905.getClass(), "lastCountryCode", "GnjLRtJywq");
        setIntField(term36905, term36905.getClass(), "eventPoint", -1464784083);
        setIntField(term36905, term36905.getClass(), "totalLv", -1564128892);
        setIntField(term36905, term36905.getClass(), "lastLoginBonusDay", -638268686);
        setIntField(term36905, term36905.getClass(), "lastSurvivalBonusDay", 213892075);
        setIntField(term36905, term36905.getClass(), "loginBonusLv", 1635792054);
        term37079 = new Integer(-2087784193);
        term37081 = new Integer(-112933890);
        term37083 = new Integer(-1810303698);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserCharacter");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = long.class;
        argTypes[1] = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        Object[] args = new Object[5];
        args[0] = term36903;
        args[1] = term36905;
        args[2] = term37079;
        args[3] = term37081;
        args[4] = term37083;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


