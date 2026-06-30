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

public class UserData_getTotalPoint_21078460695 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1321;

    public UserData_getTotalPoint_21078460695() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1325 = new Long(7411271909051562686L);
        term1321 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term1323 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term1339 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1340 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1344 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1349 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1350 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1354 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term1321, term1321.getClass(), "id", -2813493605142626659L);
        setLongField(term1323, term1323.getClass(), "id", -8885298608300233488L);
        setField(term1323, term1323.getClass(), "extId", term1325);
        setField(term1323, term1323.getClass(), "luid", "GzFkzHGYFt");
        setIntField(term1340, term1340.getClass(), "year", 2019);
        setShortField(term1340, term1340.getClass(), "month", (short) 2);
        setShortField(term1340, term1340.getClass(), "day", (short) 21);
        setField(term1339, term1339.getClass(), "date", term1340);
        setByteField(term1344, term1344.getClass(), "hour", (byte) 5);
        setByteField(term1344, term1344.getClass(), "minute", (byte) 41);
        setByteField(term1344, term1344.getClass(), "second", (byte) 11);
        setIntField(term1344, term1344.getClass(), "nano", 859829782);
        setField(term1339, term1339.getClass(), "time", term1344);
        setField(term1323, term1323.getClass(), "registerTime", term1339);
        setIntField(term1350, term1350.getClass(), "year", 2018);
        setShortField(term1350, term1350.getClass(), "month", (short) 9);
        setShortField(term1350, term1350.getClass(), "day", (short) 28);
        setField(term1349, term1349.getClass(), "date", term1350);
        setByteField(term1354, term1354.getClass(), "hour", (byte) 3);
        setByteField(term1354, term1354.getClass(), "minute", (byte) 37);
        setByteField(term1354, term1354.getClass(), "second", (byte) 46);
        setIntField(term1354, term1354.getClass(), "nano", 763326845);
        setField(term1349, term1349.getClass(), "time", term1354);
        setField(term1323, term1323.getClass(), "accessTime", term1349);
        setField(term1321, term1321.getClass(), "card", term1323);
        setIntField(term1321, term1321.getClass(), "lastDataVersion", -1214628358);
        setField(term1321, term1321.getClass(), "userName", "tShwQLRGNe");
        setIntField(term1321, term1321.getClass(), "point", 1102721075);
        setIntField(term1321, term1321.getClass(), "totalPoint", -426764678);
        setIntField(term1321, term1321.getClass(), "iconId", -1222614956);
        setIntField(term1321, term1321.getClass(), "nameplateId", -1870495012);
        setIntField(term1321, term1321.getClass(), "frameId", -1310015129);
        setIntField(term1321, term1321.getClass(), "trophyId", -2104981311);
        setIntField(term1321, term1321.getClass(), "playCount", -571169753);
        setIntField(term1321, term1321.getClass(), "playVsCount", 318591690);
        setIntField(term1321, term1321.getClass(), "playSyncCount", -165587447);
        setIntField(term1321, term1321.getClass(), "winCount", -1347358701);
        setIntField(term1321, term1321.getClass(), "helpCount", 806595993);
        setIntField(term1321, term1321.getClass(), "comboCount", 548228925);
        setIntField(term1321, term1321.getClass(), "feverCount", -749861210);
        setIntField(term1321, term1321.getClass(), "totalHiScore", 1694224101);
        setIntField(term1321, term1321.getClass(), "totalEasyHighScore", 937859191);
        setIntField(term1321, term1321.getClass(), "totalBasicHighScore", -916584829);
        setIntField(term1321, term1321.getClass(), "totalAdvancedHighScore", -2131181468);
        setIntField(term1321, term1321.getClass(), "totalExpertHighScore", 282916351);
        setIntField(term1321, term1321.getClass(), "totalMasterHighScore", 880977281);
        setIntField(term1321, term1321.getClass(), "totalReMasterHighScore", 371943306);
        setIntField(term1321, term1321.getClass(), "totalHighSync", 982388293);
        setIntField(term1321, term1321.getClass(), "totalEasySync", -159494544);
        setIntField(term1321, term1321.getClass(), "totalBasicSync", -75206835);
        setIntField(term1321, term1321.getClass(), "totalAdvancedSync", -1618206977);
        setIntField(term1321, term1321.getClass(), "totalExpertSync", -1747406163);
        setIntField(term1321, term1321.getClass(), "totalMasterSync", 388157121);
        setIntField(term1321, term1321.getClass(), "totalReMasterSync", 1684998508);
        setIntField(term1321, term1321.getClass(), "playerRating", -1476644457);
        setIntField(term1321, term1321.getClass(), "highestRating", 1270666529);
        setIntField(term1321, term1321.getClass(), "rankAuthTailId", -1146679443);
        setField(term1321, term1321.getClass(), "eventWatchedDate", "LvtrsXUliU");
        setField(term1321, term1321.getClass(), "webLimitDate", "xLbjWUgOIL");
        setIntField(term1321, term1321.getClass(), "challengeTrackPhase", -860131894);
        setIntField(term1321, term1321.getClass(), "firstPlayBits", -1022990421);
        setField(term1321, term1321.getClass(), "lastPlayDate", "jDtqGUpnZN");
        setIntField(term1321, term1321.getClass(), "lastPlaceId", 1045547089);
        setField(term1321, term1321.getClass(), "lastPlaceName", "nGKItKLYNC");
        setIntField(term1321, term1321.getClass(), "lastRegionId", -1122880881);
        setField(term1321, term1321.getClass(), "lastRegionName", "UiUYnPrcCi");
        setField(term1321, term1321.getClass(), "lastClientId", "UoYtihxVaS");
        setField(term1321, term1321.getClass(), "lastCountryCode", "JDswTTCZHV");
        setIntField(term1321, term1321.getClass(), "eventPoint", -542712742);
        setIntField(term1321, term1321.getClass(), "totalLv", -1254072822);
        setIntField(term1321, term1321.getClass(), "lastLoginBonusDay", -1111249833);
        setIntField(term1321, term1321.getClass(), "lastSurvivalBonusDay", -1692331299);
        setIntField(term1321, term1321.getClass(), "loginBonusLv", 479531250);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalPoint", argTypes, term1321, args);
    }

};


