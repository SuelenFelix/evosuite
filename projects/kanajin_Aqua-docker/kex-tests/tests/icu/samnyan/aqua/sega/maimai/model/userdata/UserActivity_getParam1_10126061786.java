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

public class UserActivity_getParam1_10126061786 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45340;

    public UserActivity_getParam1_10126061786() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term45346 = new Long(1457594663983990440L);
        term45340 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserActivity"));
        Object term45342 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term45344 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term45360 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term45361 = newInstance(Class.forName("java.time.LocalDate"));
        Object term45365 = newInstance(Class.forName("java.time.LocalTime"));
        Object term45370 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term45371 = newInstance(Class.forName("java.time.LocalDate"));
        Object term45375 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term45340, term45340.getClass(), "id", -432424084523104253L);
        setLongField(term45342, term45342.getClass(), "id", 6150186973473930616L);
        setLongField(term45344, term45344.getClass(), "id", -3850323135468805420L);
        setField(term45344, term45344.getClass(), "extId", term45346);
        setField(term45344, term45344.getClass(), "luid", "kOaAQOLyqd");
        setIntField(term45361, term45361.getClass(), "year", 2018);
        setShortField(term45361, term45361.getClass(), "month", (short) 7);
        setShortField(term45361, term45361.getClass(), "day", (short) 24);
        setField(term45360, term45360.getClass(), "date", term45361);
        setByteField(term45365, term45365.getClass(), "hour", (byte) 8);
        setByteField(term45365, term45365.getClass(), "minute", (byte) 32);
        setByteField(term45365, term45365.getClass(), "second", (byte) 43);
        setIntField(term45365, term45365.getClass(), "nano", 490940025);
        setField(term45360, term45360.getClass(), "time", term45365);
        setField(term45344, term45344.getClass(), "registerTime", term45360);
        setIntField(term45371, term45371.getClass(), "year", 2018);
        setShortField(term45371, term45371.getClass(), "month", (short) 7);
        setShortField(term45371, term45371.getClass(), "day", (short) 6);
        setField(term45370, term45370.getClass(), "date", term45371);
        setByteField(term45375, term45375.getClass(), "hour", (byte) 6);
        setByteField(term45375, term45375.getClass(), "minute", (byte) 33);
        setByteField(term45375, term45375.getClass(), "second", (byte) 21);
        setIntField(term45375, term45375.getClass(), "nano", 484192339);
        setField(term45370, term45370.getClass(), "time", term45375);
        setField(term45344, term45344.getClass(), "accessTime", term45370);
        setField(term45342, term45342.getClass(), "card", term45344);
        setIntField(term45342, term45342.getClass(), "lastDataVersion", -1349596098);
        setField(term45342, term45342.getClass(), "userName", "ICBWiKaeHC");
        setIntField(term45342, term45342.getClass(), "point", 490711502);
        setIntField(term45342, term45342.getClass(), "totalPoint", -1967126524);
        setIntField(term45342, term45342.getClass(), "iconId", -803436050);
        setIntField(term45342, term45342.getClass(), "nameplateId", 1382240540);
        setIntField(term45342, term45342.getClass(), "frameId", -894941864);
        setIntField(term45342, term45342.getClass(), "trophyId", -1796952360);
        setIntField(term45342, term45342.getClass(), "playCount", -29580694);
        setIntField(term45342, term45342.getClass(), "playVsCount", -1774385073);
        setIntField(term45342, term45342.getClass(), "playSyncCount", -1095327334);
        setIntField(term45342, term45342.getClass(), "winCount", -401456020);
        setIntField(term45342, term45342.getClass(), "helpCount", 333219682);
        setIntField(term45342, term45342.getClass(), "comboCount", -1691293662);
        setIntField(term45342, term45342.getClass(), "feverCount", 347540813);
        setIntField(term45342, term45342.getClass(), "totalHiScore", -897042657);
        setIntField(term45342, term45342.getClass(), "totalEasyHighScore", 1519205600);
        setIntField(term45342, term45342.getClass(), "totalBasicHighScore", 631662709);
        setIntField(term45342, term45342.getClass(), "totalAdvancedHighScore", 580524853);
        setIntField(term45342, term45342.getClass(), "totalExpertHighScore", -1436225528);
        setIntField(term45342, term45342.getClass(), "totalMasterHighScore", -1249891722);
        setIntField(term45342, term45342.getClass(), "totalReMasterHighScore", -402850097);
        setIntField(term45342, term45342.getClass(), "totalHighSync", 1012166312);
        setIntField(term45342, term45342.getClass(), "totalEasySync", 1625194278);
        setIntField(term45342, term45342.getClass(), "totalBasicSync", 55518559);
        setIntField(term45342, term45342.getClass(), "totalAdvancedSync", 1862584249);
        setIntField(term45342, term45342.getClass(), "totalExpertSync", -1127199664);
        setIntField(term45342, term45342.getClass(), "totalMasterSync", 1977439964);
        setIntField(term45342, term45342.getClass(), "totalReMasterSync", 1379432675);
        setIntField(term45342, term45342.getClass(), "playerRating", -1018695351);
        setIntField(term45342, term45342.getClass(), "highestRating", 1080095535);
        setIntField(term45342, term45342.getClass(), "rankAuthTailId", 750963355);
        setField(term45342, term45342.getClass(), "eventWatchedDate", "WAljagiCzu");
        setField(term45342, term45342.getClass(), "webLimitDate", "XKMXfDZajw");
        setIntField(term45342, term45342.getClass(), "challengeTrackPhase", -1939304192);
        setIntField(term45342, term45342.getClass(), "firstPlayBits", 2062007036);
        setField(term45342, term45342.getClass(), "lastPlayDate", "avZoBQSrBy");
        setIntField(term45342, term45342.getClass(), "lastPlaceId", 2099511779);
        setField(term45342, term45342.getClass(), "lastPlaceName", "KIXGeHXdwi");
        setIntField(term45342, term45342.getClass(), "lastRegionId", 2039235808);
        setField(term45342, term45342.getClass(), "lastRegionName", "tTfdvLMwEE");
        setField(term45342, term45342.getClass(), "lastClientId", "DiSkERzqOE");
        setField(term45342, term45342.getClass(), "lastCountryCode", "hPSZZeYqHQ");
        setIntField(term45342, term45342.getClass(), "eventPoint", -815715514);
        setIntField(term45342, term45342.getClass(), "totalLv", 1890131657);
        setIntField(term45342, term45342.getClass(), "lastLoginBonusDay", -910332885);
        setIntField(term45342, term45342.getClass(), "lastSurvivalBonusDay", 186607713);
        setIntField(term45342, term45342.getClass(), "loginBonusLv", -400018942);
        setField(term45340, term45340.getClass(), "user", term45342);
        setIntField(term45340, term45340.getClass(), "kind", -101025934);
        setIntField(term45340, term45340.getClass(), "activityId", 1587463337);
        setLongField(term45340, term45340.getClass(), "sortNumber", -5207216109884759743L);
        setIntField(term45340, term45340.getClass(), "param1", 463114370);
        setIntField(term45340, term45340.getClass(), "param2", 1541842334);
        setIntField(term45340, term45340.getClass(), "param3", 947697692);
        setIntField(term45340, term45340.getClass(), "param4", -372056343);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserActivity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getParam1", argTypes, term45340, args);
    }

};


