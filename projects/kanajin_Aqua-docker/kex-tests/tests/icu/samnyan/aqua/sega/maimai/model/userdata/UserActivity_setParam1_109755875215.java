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

public class UserActivity_setParam1_109755875215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48069;
     Object term48252;

    public UserActivity_setParam1_109755875215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term48075 = new Long(4266570509071948633L);
        term48069 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserActivity"));
        Object term48071 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term48073 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term48089 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term48090 = newInstance(Class.forName("java.time.LocalDate"));
        Object term48094 = newInstance(Class.forName("java.time.LocalTime"));
        Object term48099 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term48100 = newInstance(Class.forName("java.time.LocalDate"));
        Object term48104 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term48069, term48069.getClass(), "id", 6351887424140565471L);
        setLongField(term48071, term48071.getClass(), "id", 6273670659288205855L);
        setLongField(term48073, term48073.getClass(), "id", -4776514981294468834L);
        setField(term48073, term48073.getClass(), "extId", term48075);
        setField(term48073, term48073.getClass(), "luid", "rawiXxuyRn");
        setIntField(term48090, term48090.getClass(), "year", 2015);
        setShortField(term48090, term48090.getClass(), "month", (short) 4);
        setShortField(term48090, term48090.getClass(), "day", (short) 14);
        setField(term48089, term48089.getClass(), "date", term48090);
        setByteField(term48094, term48094.getClass(), "hour", (byte) 23);
        setByteField(term48094, term48094.getClass(), "minute", (byte) 8);
        setByteField(term48094, term48094.getClass(), "second", (byte) 53);
        setIntField(term48094, term48094.getClass(), "nano", 375234559);
        setField(term48089, term48089.getClass(), "time", term48094);
        setField(term48073, term48073.getClass(), "registerTime", term48089);
        setIntField(term48100, term48100.getClass(), "year", 2018);
        setShortField(term48100, term48100.getClass(), "month", (short) 1);
        setShortField(term48100, term48100.getClass(), "day", (short) 29);
        setField(term48099, term48099.getClass(), "date", term48100);
        setByteField(term48104, term48104.getClass(), "hour", (byte) 17);
        setByteField(term48104, term48104.getClass(), "minute", (byte) 5);
        setByteField(term48104, term48104.getClass(), "second", (byte) 53);
        setIntField(term48104, term48104.getClass(), "nano", 36624440);
        setField(term48099, term48099.getClass(), "time", term48104);
        setField(term48073, term48073.getClass(), "accessTime", term48099);
        setField(term48071, term48071.getClass(), "card", term48073);
        setIntField(term48071, term48071.getClass(), "lastDataVersion", -1184413887);
        setField(term48071, term48071.getClass(), "userName", "ZyAecZGope");
        setIntField(term48071, term48071.getClass(), "point", -831173295);
        setIntField(term48071, term48071.getClass(), "totalPoint", 1563333150);
        setIntField(term48071, term48071.getClass(), "iconId", -766475202);
        setIntField(term48071, term48071.getClass(), "nameplateId", 1362362674);
        setIntField(term48071, term48071.getClass(), "frameId", 553585097);
        setIntField(term48071, term48071.getClass(), "trophyId", 1212393039);
        setIntField(term48071, term48071.getClass(), "playCount", -1346793067);
        setIntField(term48071, term48071.getClass(), "playVsCount", 517580821);
        setIntField(term48071, term48071.getClass(), "playSyncCount", 1804537299);
        setIntField(term48071, term48071.getClass(), "winCount", 1200772934);
        setIntField(term48071, term48071.getClass(), "helpCount", -639549660);
        setIntField(term48071, term48071.getClass(), "comboCount", -92008992);
        setIntField(term48071, term48071.getClass(), "feverCount", -1867096385);
        setIntField(term48071, term48071.getClass(), "totalHiScore", 1228854608);
        setIntField(term48071, term48071.getClass(), "totalEasyHighScore", -1210488188);
        setIntField(term48071, term48071.getClass(), "totalBasicHighScore", -529430973);
        setIntField(term48071, term48071.getClass(), "totalAdvancedHighScore", 1735280371);
        setIntField(term48071, term48071.getClass(), "totalExpertHighScore", 2014178265);
        setIntField(term48071, term48071.getClass(), "totalMasterHighScore", 650318106);
        setIntField(term48071, term48071.getClass(), "totalReMasterHighScore", 361184580);
        setIntField(term48071, term48071.getClass(), "totalHighSync", -1132844305);
        setIntField(term48071, term48071.getClass(), "totalEasySync", -1893839838);
        setIntField(term48071, term48071.getClass(), "totalBasicSync", -1899964739);
        setIntField(term48071, term48071.getClass(), "totalAdvancedSync", 1320936203);
        setIntField(term48071, term48071.getClass(), "totalExpertSync", 815999627);
        setIntField(term48071, term48071.getClass(), "totalMasterSync", -1361096912);
        setIntField(term48071, term48071.getClass(), "totalReMasterSync", -1489448292);
        setIntField(term48071, term48071.getClass(), "playerRating", -111099654);
        setIntField(term48071, term48071.getClass(), "highestRating", 1865814659);
        setIntField(term48071, term48071.getClass(), "rankAuthTailId", -715300089);
        setField(term48071, term48071.getClass(), "eventWatchedDate", "uYnmxkwLfB");
        setField(term48071, term48071.getClass(), "webLimitDate", "RVZTQxYOUO");
        setIntField(term48071, term48071.getClass(), "challengeTrackPhase", 493602399);
        setIntField(term48071, term48071.getClass(), "firstPlayBits", 306088960);
        setField(term48071, term48071.getClass(), "lastPlayDate", "tydPpKxAbv");
        setIntField(term48071, term48071.getClass(), "lastPlaceId", 1739612725);
        setField(term48071, term48071.getClass(), "lastPlaceName", "CJxQpJUfLJ");
        setIntField(term48071, term48071.getClass(), "lastRegionId", 684431128);
        setField(term48071, term48071.getClass(), "lastRegionName", "NUUjAyqOva");
        setField(term48071, term48071.getClass(), "lastClientId", "EoAMIIUdDX");
        setField(term48071, term48071.getClass(), "lastCountryCode", "OATNwRncsv");
        setIntField(term48071, term48071.getClass(), "eventPoint", -131718261);
        setIntField(term48071, term48071.getClass(), "totalLv", 1392281647);
        setIntField(term48071, term48071.getClass(), "lastLoginBonusDay", 1896966568);
        setIntField(term48071, term48071.getClass(), "lastSurvivalBonusDay", 95747063);
        setIntField(term48071, term48071.getClass(), "loginBonusLv", 1353810730);
        setField(term48069, term48069.getClass(), "user", term48071);
        setIntField(term48069, term48069.getClass(), "kind", 1704841611);
        setIntField(term48069, term48069.getClass(), "activityId", -1055865904);
        setLongField(term48069, term48069.getClass(), "sortNumber", -7273680182770718108L);
        setIntField(term48069, term48069.getClass(), "param1", 1639434832);
        setIntField(term48069, term48069.getClass(), "param2", 41120682);
        setIntField(term48069, term48069.getClass(), "param3", -565584348);
        setIntField(term48069, term48069.getClass(), "param4", 768323855);
        term48252 = new Integer(-346585829);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserActivity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term48252;
        callMethod(klass, "setParam1", argTypes, term48069, args);
    }

};


