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

public class UserActivity_equals_68435176219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49169;
     Object term49352;

    public UserActivity_equals_68435176219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term49175 = new Long(-8471550651709805183L);
        term49169 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserActivity"));
        Object term49171 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term49173 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term49189 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term49190 = newInstance(Class.forName("java.time.LocalDate"));
        Object term49194 = newInstance(Class.forName("java.time.LocalTime"));
        Object term49199 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term49200 = newInstance(Class.forName("java.time.LocalDate"));
        Object term49204 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term49169, term49169.getClass(), "id", -5004803270846838598L);
        setLongField(term49171, term49171.getClass(), "id", -8211859616692114655L);
        setLongField(term49173, term49173.getClass(), "id", 7487838449539103993L);
        setField(term49173, term49173.getClass(), "extId", term49175);
        setField(term49173, term49173.getClass(), "luid", "HvSKssbEES");
        setIntField(term49190, term49190.getClass(), "year", 2023);
        setShortField(term49190, term49190.getClass(), "month", (short) 4);
        setShortField(term49190, term49190.getClass(), "day", (short) 10);
        setField(term49189, term49189.getClass(), "date", term49190);
        setByteField(term49194, term49194.getClass(), "hour", (byte) 19);
        setByteField(term49194, term49194.getClass(), "minute", (byte) 34);
        setByteField(term49194, term49194.getClass(), "second", (byte) 41);
        setIntField(term49194, term49194.getClass(), "nano", 911888376);
        setField(term49189, term49189.getClass(), "time", term49194);
        setField(term49173, term49173.getClass(), "registerTime", term49189);
        setIntField(term49200, term49200.getClass(), "year", 2014);
        setShortField(term49200, term49200.getClass(), "month", (short) 2);
        setShortField(term49200, term49200.getClass(), "day", (short) 5);
        setField(term49199, term49199.getClass(), "date", term49200);
        setByteField(term49204, term49204.getClass(), "hour", (byte) 14);
        setByteField(term49204, term49204.getClass(), "minute", (byte) 2);
        setByteField(term49204, term49204.getClass(), "second", (byte) 4);
        setIntField(term49204, term49204.getClass(), "nano", 458277660);
        setField(term49199, term49199.getClass(), "time", term49204);
        setField(term49173, term49173.getClass(), "accessTime", term49199);
        setField(term49171, term49171.getClass(), "card", term49173);
        setIntField(term49171, term49171.getClass(), "lastDataVersion", 395474596);
        setField(term49171, term49171.getClass(), "userName", "UjIAQAHhul");
        setIntField(term49171, term49171.getClass(), "point", -181917615);
        setIntField(term49171, term49171.getClass(), "totalPoint", -175990400);
        setIntField(term49171, term49171.getClass(), "iconId", -1756176486);
        setIntField(term49171, term49171.getClass(), "nameplateId", -1049589248);
        setIntField(term49171, term49171.getClass(), "frameId", 120294405);
        setIntField(term49171, term49171.getClass(), "trophyId", 1525059844);
        setIntField(term49171, term49171.getClass(), "playCount", 1788101978);
        setIntField(term49171, term49171.getClass(), "playVsCount", -1324289284);
        setIntField(term49171, term49171.getClass(), "playSyncCount", 2057345888);
        setIntField(term49171, term49171.getClass(), "winCount", -2072027172);
        setIntField(term49171, term49171.getClass(), "helpCount", 482848507);
        setIntField(term49171, term49171.getClass(), "comboCount", -710465280);
        setIntField(term49171, term49171.getClass(), "feverCount", -1488460274);
        setIntField(term49171, term49171.getClass(), "totalHiScore", -653095451);
        setIntField(term49171, term49171.getClass(), "totalEasyHighScore", 1716408118);
        setIntField(term49171, term49171.getClass(), "totalBasicHighScore", -1873669731);
        setIntField(term49171, term49171.getClass(), "totalAdvancedHighScore", 2124411599);
        setIntField(term49171, term49171.getClass(), "totalExpertHighScore", -71602583);
        setIntField(term49171, term49171.getClass(), "totalMasterHighScore", -1926082322);
        setIntField(term49171, term49171.getClass(), "totalReMasterHighScore", 210448865);
        setIntField(term49171, term49171.getClass(), "totalHighSync", 1795078195);
        setIntField(term49171, term49171.getClass(), "totalEasySync", -118250608);
        setIntField(term49171, term49171.getClass(), "totalBasicSync", -19855467);
        setIntField(term49171, term49171.getClass(), "totalAdvancedSync", -381214484);
        setIntField(term49171, term49171.getClass(), "totalExpertSync", 1908628900);
        setIntField(term49171, term49171.getClass(), "totalMasterSync", -254024426);
        setIntField(term49171, term49171.getClass(), "totalReMasterSync", 2035106255);
        setIntField(term49171, term49171.getClass(), "playerRating", -65925181);
        setIntField(term49171, term49171.getClass(), "highestRating", -134969175);
        setIntField(term49171, term49171.getClass(), "rankAuthTailId", 985529917);
        setField(term49171, term49171.getClass(), "eventWatchedDate", "oWBXOvjPUT");
        setField(term49171, term49171.getClass(), "webLimitDate", "DcKqrrTdId");
        setIntField(term49171, term49171.getClass(), "challengeTrackPhase", -1459510700);
        setIntField(term49171, term49171.getClass(), "firstPlayBits", -1060341148);
        setField(term49171, term49171.getClass(), "lastPlayDate", "fwtOJhjXbW");
        setIntField(term49171, term49171.getClass(), "lastPlaceId", 1931459176);
        setField(term49171, term49171.getClass(), "lastPlaceName", "ltWBKZaXwJ");
        setIntField(term49171, term49171.getClass(), "lastRegionId", 266090245);
        setField(term49171, term49171.getClass(), "lastRegionName", "FSQpgxQnsH");
        setField(term49171, term49171.getClass(), "lastClientId", "LBPwnVMEpP");
        setField(term49171, term49171.getClass(), "lastCountryCode", "cwALzyQVjH");
        setIntField(term49171, term49171.getClass(), "eventPoint", 1329931034);
        setIntField(term49171, term49171.getClass(), "totalLv", -2040965607);
        setIntField(term49171, term49171.getClass(), "lastLoginBonusDay", 2056421741);
        setIntField(term49171, term49171.getClass(), "lastSurvivalBonusDay", 473013403);
        setIntField(term49171, term49171.getClass(), "loginBonusLv", 139601586);
        setField(term49169, term49169.getClass(), "user", term49171);
        setIntField(term49169, term49169.getClass(), "kind", 198201617);
        setIntField(term49169, term49169.getClass(), "activityId", -816938071);
        setLongField(term49169, term49169.getClass(), "sortNumber", 7010148136855890340L);
        setIntField(term49169, term49169.getClass(), "param1", -703996658);
        setIntField(term49169, term49169.getClass(), "param2", -1472021518);
        setIntField(term49169, term49169.getClass(), "param3", 1339815724);
        setIntField(term49169, term49169.getClass(), "param4", 128296124);
        term49352 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserActivity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term49352;
        callMethod(klass, "equals", argTypes, term49169, args);
    }

};


