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

public class UserActivity_getParam3_10126042568 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45886;

    public UserActivity_getParam3_10126042568() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term45892 = new Long(-8603648071751666348L);
        term45886 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserActivity"));
        Object term45888 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term45890 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term45906 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term45907 = newInstance(Class.forName("java.time.LocalDate"));
        Object term45911 = newInstance(Class.forName("java.time.LocalTime"));
        Object term45916 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term45917 = newInstance(Class.forName("java.time.LocalDate"));
        Object term45921 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term45886, term45886.getClass(), "id", 3472971833455746664L);
        setLongField(term45888, term45888.getClass(), "id", 3731931947533293029L);
        setLongField(term45890, term45890.getClass(), "id", 9214973322210954344L);
        setField(term45890, term45890.getClass(), "extId", term45892);
        setField(term45890, term45890.getClass(), "luid", "fWMsLtuOEV");
        setIntField(term45907, term45907.getClass(), "year", 2016);
        setShortField(term45907, term45907.getClass(), "month", (short) 5);
        setShortField(term45907, term45907.getClass(), "day", (short) 9);
        setField(term45906, term45906.getClass(), "date", term45907);
        setByteField(term45911, term45911.getClass(), "hour", (byte) 1);
        setByteField(term45911, term45911.getClass(), "minute", (byte) 20);
        setByteField(term45911, term45911.getClass(), "second", (byte) 56);
        setIntField(term45911, term45911.getClass(), "nano", 198437232);
        setField(term45906, term45906.getClass(), "time", term45911);
        setField(term45890, term45890.getClass(), "registerTime", term45906);
        setIntField(term45917, term45917.getClass(), "year", 2021);
        setShortField(term45917, term45917.getClass(), "month", (short) 2);
        setShortField(term45917, term45917.getClass(), "day", (short) 5);
        setField(term45916, term45916.getClass(), "date", term45917);
        setByteField(term45921, term45921.getClass(), "hour", (byte) 20);
        setByteField(term45921, term45921.getClass(), "minute", (byte) 43);
        setByteField(term45921, term45921.getClass(), "second", (byte) 37);
        setIntField(term45921, term45921.getClass(), "nano", 191661361);
        setField(term45916, term45916.getClass(), "time", term45921);
        setField(term45890, term45890.getClass(), "accessTime", term45916);
        setField(term45888, term45888.getClass(), "card", term45890);
        setIntField(term45888, term45888.getClass(), "lastDataVersion", 390373954);
        setField(term45888, term45888.getClass(), "userName", "fvgZQBalnd");
        setIntField(term45888, term45888.getClass(), "point", 1525579039);
        setIntField(term45888, term45888.getClass(), "totalPoint", -509784163);
        setIntField(term45888, term45888.getClass(), "iconId", 1503484564);
        setIntField(term45888, term45888.getClass(), "nameplateId", -433236731);
        setIntField(term45888, term45888.getClass(), "frameId", 2003700950);
        setIntField(term45888, term45888.getClass(), "trophyId", -1309376267);
        setIntField(term45888, term45888.getClass(), "playCount", -1487504399);
        setIntField(term45888, term45888.getClass(), "playVsCount", -345174419);
        setIntField(term45888, term45888.getClass(), "playSyncCount", 1676102379);
        setIntField(term45888, term45888.getClass(), "winCount", 1215582502);
        setIntField(term45888, term45888.getClass(), "helpCount", 997123385);
        setIntField(term45888, term45888.getClass(), "comboCount", -171991376);
        setIntField(term45888, term45888.getClass(), "feverCount", 1966933092);
        setIntField(term45888, term45888.getClass(), "totalHiScore", 1108791337);
        setIntField(term45888, term45888.getClass(), "totalEasyHighScore", -414682663);
        setIntField(term45888, term45888.getClass(), "totalBasicHighScore", 259051944);
        setIntField(term45888, term45888.getClass(), "totalAdvancedHighScore", -958789263);
        setIntField(term45888, term45888.getClass(), "totalExpertHighScore", 120623003);
        setIntField(term45888, term45888.getClass(), "totalMasterHighScore", -1236935869);
        setIntField(term45888, term45888.getClass(), "totalReMasterHighScore", -1707868253);
        setIntField(term45888, term45888.getClass(), "totalHighSync", 487083950);
        setIntField(term45888, term45888.getClass(), "totalEasySync", 33771952);
        setIntField(term45888, term45888.getClass(), "totalBasicSync", -732008756);
        setIntField(term45888, term45888.getClass(), "totalAdvancedSync", -1750902922);
        setIntField(term45888, term45888.getClass(), "totalExpertSync", -1037994843);
        setIntField(term45888, term45888.getClass(), "totalMasterSync", 727200615);
        setIntField(term45888, term45888.getClass(), "totalReMasterSync", -308494890);
        setIntField(term45888, term45888.getClass(), "playerRating", -1113508392);
        setIntField(term45888, term45888.getClass(), "highestRating", 31876246);
        setIntField(term45888, term45888.getClass(), "rankAuthTailId", 55952895);
        setField(term45888, term45888.getClass(), "eventWatchedDate", "tViQSKUCLE");
        setField(term45888, term45888.getClass(), "webLimitDate", "QbaeHheqiP");
        setIntField(term45888, term45888.getClass(), "challengeTrackPhase", -1961513935);
        setIntField(term45888, term45888.getClass(), "firstPlayBits", -22602260);
        setField(term45888, term45888.getClass(), "lastPlayDate", "gASHxChKwn");
        setIntField(term45888, term45888.getClass(), "lastPlaceId", -1494996615);
        setField(term45888, term45888.getClass(), "lastPlaceName", "iasolXlEEn");
        setIntField(term45888, term45888.getClass(), "lastRegionId", -686175319);
        setField(term45888, term45888.getClass(), "lastRegionName", "cAObIvLmLo");
        setField(term45888, term45888.getClass(), "lastClientId", "xwiCqRSWSe");
        setField(term45888, term45888.getClass(), "lastCountryCode", "IbUFkzIgzq");
        setIntField(term45888, term45888.getClass(), "eventPoint", -489193282);
        setIntField(term45888, term45888.getClass(), "totalLv", 1790125855);
        setIntField(term45888, term45888.getClass(), "lastLoginBonusDay", 665331267);
        setIntField(term45888, term45888.getClass(), "lastSurvivalBonusDay", -2014999682);
        setIntField(term45888, term45888.getClass(), "loginBonusLv", 1982258261);
        setField(term45886, term45886.getClass(), "user", term45888);
        setIntField(term45886, term45886.getClass(), "kind", -1489112012);
        setIntField(term45886, term45886.getClass(), "activityId", -723107224);
        setLongField(term45886, term45886.getClass(), "sortNumber", 3662777917800385964L);
        setIntField(term45886, term45886.getClass(), "param1", 304541875);
        setIntField(term45886, term45886.getClass(), "param2", -1638286616);
        setIntField(term45886, term45886.getClass(), "param3", -256866404);
        setIntField(term45886, term45886.getClass(), "param4", -354956895);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserActivity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getParam3", argTypes, term45886, args);
    }

};


