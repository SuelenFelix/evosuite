package icu.samnyan.aqua.sega.chunithm.model.userdata;

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
import static icu.samnyan.aqua.sega.chunithm.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class UserGeneralData_setPropertyKey_5782053127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term306227;

    public UserGeneralData_setPropertyKey_5782053127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term306233 = new Long(-6838909359433858599L);
        term306227 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGeneralData"));
        Object term306229 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term306231 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term306247 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term306248 = newInstance(Class.forName("java.time.LocalDate"));
        Object term306252 = newInstance(Class.forName("java.time.LocalTime"));
        Object term306257 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term306258 = newInstance(Class.forName("java.time.LocalDate"));
        Object term306262 = newInstance(Class.forName("java.time.LocalTime"));
        Object term306279 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term306280 = newInstance(Class.forName("java.time.LocalDate"));
        Object term306284 = newInstance(Class.forName("java.time.LocalTime"));
        Object term306340 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term306341 = newInstance(Class.forName("java.time.LocalDate"));
        Object term306345 = newInstance(Class.forName("java.time.LocalTime"));
        Object term306388 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term306389 = newInstance(Class.forName("java.time.LocalDate"));
        Object term306393 = newInstance(Class.forName("java.time.LocalTime"));
        Object term306434 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term306435 = newInstance(Class.forName("java.time.LocalDate"));
        Object term306439 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term306227, term306227.getClass(), "id", 2927460958159387652L);
        setLongField(term306229, term306229.getClass(), "id", -8974647646643503706L);
        setLongField(term306231, term306231.getClass(), "id", 3578386851701281032L);
        setField(term306231, term306231.getClass(), "extId", term306233);
        setField(term306231, term306231.getClass(), "luid", "WqsZmoEMhC");
        setIntField(term306248, term306248.getClass(), "year", 2029);
        setShortField(term306248, term306248.getClass(), "month", (short) 6);
        setShortField(term306248, term306248.getClass(), "day", (short) 29);
        setField(term306247, term306247.getClass(), "date", term306248);
        setByteField(term306252, term306252.getClass(), "hour", (byte) 21);
        setByteField(term306252, term306252.getClass(), "minute", (byte) 23);
        setByteField(term306252, term306252.getClass(), "second", (byte) 6);
        setIntField(term306252, term306252.getClass(), "nano", 270980149);
        setField(term306247, term306247.getClass(), "time", term306252);
        setField(term306231, term306231.getClass(), "registerTime", term306247);
        setIntField(term306258, term306258.getClass(), "year", 2013);
        setShortField(term306258, term306258.getClass(), "month", (short) 1);
        setShortField(term306258, term306258.getClass(), "day", (short) 23);
        setField(term306257, term306257.getClass(), "date", term306258);
        setByteField(term306262, term306262.getClass(), "hour", (byte) 18);
        setByteField(term306262, term306262.getClass(), "minute", (byte) 47);
        setByteField(term306262, term306262.getClass(), "second", (byte) 52);
        setIntField(term306262, term306262.getClass(), "nano", 256636706);
        setField(term306257, term306257.getClass(), "time", term306262);
        setField(term306231, term306231.getClass(), "accessTime", term306257);
        setField(term306229, term306229.getClass(), "card", term306231);
        setField(term306229, term306229.getClass(), "userName", "PZnyLdXxJA");
        setIntField(term306280, term306280.getClass(), "year", 2023);
        setShortField(term306280, term306280.getClass(), "month", (short) 7);
        setShortField(term306280, term306280.getClass(), "day", (short) 10);
        setField(term306279, term306279.getClass(), "date", term306280);
        setByteField(term306284, term306284.getClass(), "hour", (byte) 12);
        setByteField(term306284, term306284.getClass(), "minute", (byte) 35);
        setByteField(term306284, term306284.getClass(), "second", (byte) 15);
        setIntField(term306284, term306284.getClass(), "nano", 564922436);
        setField(term306279, term306279.getClass(), "time", term306284);
        setField(term306229, term306229.getClass(), "lastLoginDate", term306279);
        setBooleanField(term306229, term306229.getClass(), "isWebJoin", true);
        setField(term306229, term306229.getClass(), "webLimitDate", "vQxIPNOxke");
        setIntField(term306229, term306229.getClass(), "level", 843136842);
        setIntField(term306229, term306229.getClass(), "reincarnationNum", -536389141);
        setField(term306229, term306229.getClass(), "exp", "sEwNYnInbT");
        setLongField(term306229, term306229.getClass(), "point", 5767384862412441914L);
        setLongField(term306229, term306229.getClass(), "totalPoint", 623442675398489183L);
        setIntField(term306229, term306229.getClass(), "playCount", 1439863682);
        setIntField(term306229, term306229.getClass(), "multiPlayCount", 837914754);
        setIntField(term306229, term306229.getClass(), "multiWinCount", 182357886);
        setIntField(term306229, term306229.getClass(), "requestResCount", -100647034);
        setIntField(term306229, term306229.getClass(), "acceptResCount", 1940859649);
        setIntField(term306229, term306229.getClass(), "successResCount", 15211378);
        setIntField(term306229, term306229.getClass(), "playerRating", -60335940);
        setIntField(term306229, term306229.getClass(), "highestRating", -1627060708);
        setIntField(term306229, term306229.getClass(), "nameplateId", -733101104);
        setIntField(term306229, term306229.getClass(), "frameId", -179610883);
        setIntField(term306229, term306229.getClass(), "characterId", -1083733353);
        setIntField(term306229, term306229.getClass(), "trophyId", -422100154);
        setIntField(term306229, term306229.getClass(), "playedTutorialBit", 1638326283);
        setIntField(term306229, term306229.getClass(), "firstTutorialCancelNum", 2130384239);
        setIntField(term306229, term306229.getClass(), "masterTutorialCancelNum", 1789203008);
        setIntField(term306229, term306229.getClass(), "totalRepertoireCount", -1942237169);
        setIntField(term306229, term306229.getClass(), "totalMapNum", -1688458291);
        setLongField(term306229, term306229.getClass(), "totalHiScore", -6054733688650022090L);
        setLongField(term306229, term306229.getClass(), "totalBasicHighScore", 1507754414072122752L);
        setLongField(term306229, term306229.getClass(), "totalAdvancedHighScore", -7334137679892509699L);
        setLongField(term306229, term306229.getClass(), "totalExpertHighScore", 4560964817296143583L);
        setLongField(term306229, term306229.getClass(), "totalMasterHighScore", 9143674073036977637L);
        setIntField(term306341, term306341.getClass(), "year", 2022);
        setShortField(term306341, term306341.getClass(), "month", (short) 7);
        setShortField(term306341, term306341.getClass(), "day", (short) 24);
        setField(term306340, term306340.getClass(), "date", term306341);
        setByteField(term306345, term306345.getClass(), "hour", (byte) 14);
        setByteField(term306345, term306345.getClass(), "minute", (byte) 42);
        setByteField(term306345, term306345.getClass(), "second", (byte) 22);
        setIntField(term306345, term306345.getClass(), "nano", 311234016);
        setField(term306340, term306340.getClass(), "time", term306345);
        setField(term306229, term306229.getClass(), "eventWatchedDate", term306340);
        setIntField(term306229, term306229.getClass(), "friendCount", 325600836);
        setBooleanField(term306229, term306229.getClass(), "isMaimai", true);
        setField(term306229, term306229.getClass(), "firstGameId", "KLfssEwvtj");
        setField(term306229, term306229.getClass(), "firstRomVersion", "juDedtXBCp");
        setField(term306229, term306229.getClass(), "firstDataVersion", "mUfRoHLCvm");
        setIntField(term306389, term306389.getClass(), "year", 2019);
        setShortField(term306389, term306389.getClass(), "month", (short) 10);
        setShortField(term306389, term306389.getClass(), "day", (short) 31);
        setField(term306388, term306388.getClass(), "date", term306389);
        setByteField(term306393, term306393.getClass(), "hour", (byte) 3);
        setByteField(term306393, term306393.getClass(), "minute", (byte) 32);
        setByteField(term306393, term306393.getClass(), "second", (byte) 53);
        setIntField(term306393, term306393.getClass(), "nano", 64220001);
        setField(term306388, term306388.getClass(), "time", term306393);
        setField(term306229, term306229.getClass(), "firstPlayDate", term306388);
        setField(term306229, term306229.getClass(), "lastGameId", "YIpQzrPaCw");
        setField(term306229, term306229.getClass(), "lastRomVersion", "UukIqXfDkU");
        setField(term306229, term306229.getClass(), "lastDataVersion", "bTTcisLwAU");
        setIntField(term306435, term306435.getClass(), "year", 2028);
        setShortField(term306435, term306435.getClass(), "month", (short) 12);
        setShortField(term306435, term306435.getClass(), "day", (short) 9);
        setField(term306434, term306434.getClass(), "date", term306435);
        setByteField(term306439, term306439.getClass(), "hour", (byte) 21);
        setByteField(term306439, term306439.getClass(), "minute", (byte) 27);
        setByteField(term306439, term306439.getClass(), "second", (byte) 10);
        setIntField(term306439, term306439.getClass(), "nano", 263808183);
        setField(term306434, term306434.getClass(), "time", term306439);
        setField(term306229, term306229.getClass(), "lastPlayDate", term306434);
        setIntField(term306229, term306229.getClass(), "lastPlaceId", 1269042968);
        setField(term306229, term306229.getClass(), "lastPlaceName", "vApcsqSBYB");
        setField(term306229, term306229.getClass(), "lastRegionId", "bJbKGvPggm");
        setField(term306229, term306229.getClass(), "lastRegionName", "ClJWxuFhvY");
        setField(term306229, term306229.getClass(), "lastAllNetId", "owPqnSCjlr");
        setField(term306229, term306229.getClass(), "lastClientId", "bstKSThCsH");
        setField(term306227, term306227.getClass(), "user", term306229);
        setField(term306227, term306227.getClass(), "propertyKey", "QuJUFXGoAL");
        setField(term306227, term306227.getClass(), "propertyValue", "NHyvoceYPA");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGeneralData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "zvfYpTBhsN";
        callMethod(klass, "setPropertyKey", argTypes, term306227, args);
    }

};


