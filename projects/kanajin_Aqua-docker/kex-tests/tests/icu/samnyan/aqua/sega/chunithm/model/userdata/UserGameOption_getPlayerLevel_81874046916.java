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

public class UserGameOption_getPlayerLevel_81874046916 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55921;

    public UserGameOption_getPlayerLevel_81874046916() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term55927 = new Long(7247160664318067468L);
        term55921 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOption"));
        Object term55923 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term55925 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term55941 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term55942 = newInstance(Class.forName("java.time.LocalDate"));
        Object term55946 = newInstance(Class.forName("java.time.LocalTime"));
        Object term55951 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term55952 = newInstance(Class.forName("java.time.LocalDate"));
        Object term55956 = newInstance(Class.forName("java.time.LocalTime"));
        Object term55973 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term55974 = newInstance(Class.forName("java.time.LocalDate"));
        Object term55978 = newInstance(Class.forName("java.time.LocalTime"));
        Object term56034 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term56035 = newInstance(Class.forName("java.time.LocalDate"));
        Object term56039 = newInstance(Class.forName("java.time.LocalTime"));
        Object term56082 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term56083 = newInstance(Class.forName("java.time.LocalDate"));
        Object term56087 = newInstance(Class.forName("java.time.LocalTime"));
        Object term56128 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term56129 = newInstance(Class.forName("java.time.LocalDate"));
        Object term56133 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term55921, term55921.getClass(), "id", -366973868174666045L);
        setLongField(term55923, term55923.getClass(), "id", -7657074490059876332L);
        setLongField(term55925, term55925.getClass(), "id", -4773629433896348407L);
        setField(term55925, term55925.getClass(), "extId", term55927);
        setField(term55925, term55925.getClass(), "luid", "ZXLgGUqgyW");
        setIntField(term55942, term55942.getClass(), "year", 2010);
        setShortField(term55942, term55942.getClass(), "month", (short) 7);
        setShortField(term55942, term55942.getClass(), "day", (short) 15);
        setField(term55941, term55941.getClass(), "date", term55942);
        setByteField(term55946, term55946.getClass(), "hour", (byte) 10);
        setByteField(term55946, term55946.getClass(), "minute", (byte) 47);
        setByteField(term55946, term55946.getClass(), "second", (byte) 0);
        setIntField(term55946, term55946.getClass(), "nano", 513170187);
        setField(term55941, term55941.getClass(), "time", term55946);
        setField(term55925, term55925.getClass(), "registerTime", term55941);
        setIntField(term55952, term55952.getClass(), "year", 2022);
        setShortField(term55952, term55952.getClass(), "month", (short) 3);
        setShortField(term55952, term55952.getClass(), "day", (short) 1);
        setField(term55951, term55951.getClass(), "date", term55952);
        setByteField(term55956, term55956.getClass(), "hour", (byte) 15);
        setByteField(term55956, term55956.getClass(), "minute", (byte) 32);
        setByteField(term55956, term55956.getClass(), "second", (byte) 30);
        setIntField(term55956, term55956.getClass(), "nano", 406959223);
        setField(term55951, term55951.getClass(), "time", term55956);
        setField(term55925, term55925.getClass(), "accessTime", term55951);
        setField(term55923, term55923.getClass(), "card", term55925);
        setField(term55923, term55923.getClass(), "userName", "PdeSzTcBgY");
        setIntField(term55974, term55974.getClass(), "year", 2019);
        setShortField(term55974, term55974.getClass(), "month", (short) 7);
        setShortField(term55974, term55974.getClass(), "day", (short) 9);
        setField(term55973, term55973.getClass(), "date", term55974);
        setByteField(term55978, term55978.getClass(), "hour", (byte) 21);
        setByteField(term55978, term55978.getClass(), "minute", (byte) 37);
        setByteField(term55978, term55978.getClass(), "second", (byte) 42);
        setIntField(term55978, term55978.getClass(), "nano", 399935883);
        setField(term55973, term55973.getClass(), "time", term55978);
        setField(term55923, term55923.getClass(), "lastLoginDate", term55973);
        setBooleanField(term55923, term55923.getClass(), "isWebJoin", false);
        setField(term55923, term55923.getClass(), "webLimitDate", "PmSvMYNoIS");
        setIntField(term55923, term55923.getClass(), "level", -1728872282);
        setIntField(term55923, term55923.getClass(), "reincarnationNum", -537646987);
        setField(term55923, term55923.getClass(), "exp", "zejWtMxJdV");
        setLongField(term55923, term55923.getClass(), "point", -5187796980288712037L);
        setLongField(term55923, term55923.getClass(), "totalPoint", 238025331923627916L);
        setIntField(term55923, term55923.getClass(), "playCount", -558527010);
        setIntField(term55923, term55923.getClass(), "multiPlayCount", -271207664);
        setIntField(term55923, term55923.getClass(), "multiWinCount", -1452529928);
        setIntField(term55923, term55923.getClass(), "requestResCount", -467618426);
        setIntField(term55923, term55923.getClass(), "acceptResCount", 1728446971);
        setIntField(term55923, term55923.getClass(), "successResCount", 871757481);
        setIntField(term55923, term55923.getClass(), "playerRating", -866223414);
        setIntField(term55923, term55923.getClass(), "highestRating", -914821646);
        setIntField(term55923, term55923.getClass(), "nameplateId", -1420229744);
        setIntField(term55923, term55923.getClass(), "frameId", -2026011046);
        setIntField(term55923, term55923.getClass(), "characterId", -930966430);
        setIntField(term55923, term55923.getClass(), "trophyId", -1137340653);
        setIntField(term55923, term55923.getClass(), "playedTutorialBit", -520048649);
        setIntField(term55923, term55923.getClass(), "firstTutorialCancelNum", -39379486);
        setIntField(term55923, term55923.getClass(), "masterTutorialCancelNum", 92637602);
        setIntField(term55923, term55923.getClass(), "totalRepertoireCount", -702644184);
        setIntField(term55923, term55923.getClass(), "totalMapNum", 873158899);
        setLongField(term55923, term55923.getClass(), "totalHiScore", -6163417416099720642L);
        setLongField(term55923, term55923.getClass(), "totalBasicHighScore", -4498877698180346473L);
        setLongField(term55923, term55923.getClass(), "totalAdvancedHighScore", 4642147601851708039L);
        setLongField(term55923, term55923.getClass(), "totalExpertHighScore", 1425489182033961019L);
        setLongField(term55923, term55923.getClass(), "totalMasterHighScore", -884853141515650306L);
        setIntField(term56035, term56035.getClass(), "year", 2013);
        setShortField(term56035, term56035.getClass(), "month", (short) 9);
        setShortField(term56035, term56035.getClass(), "day", (short) 23);
        setField(term56034, term56034.getClass(), "date", term56035);
        setByteField(term56039, term56039.getClass(), "hour", (byte) 14);
        setByteField(term56039, term56039.getClass(), "minute", (byte) 21);
        setByteField(term56039, term56039.getClass(), "second", (byte) 30);
        setIntField(term56039, term56039.getClass(), "nano", 871245576);
        setField(term56034, term56034.getClass(), "time", term56039);
        setField(term55923, term55923.getClass(), "eventWatchedDate", term56034);
        setIntField(term55923, term55923.getClass(), "friendCount", -939494687);
        setBooleanField(term55923, term55923.getClass(), "isMaimai", false);
        setField(term55923, term55923.getClass(), "firstGameId", "YUIUZeZiMK");
        setField(term55923, term55923.getClass(), "firstRomVersion", "rrPETbKRef");
        setField(term55923, term55923.getClass(), "firstDataVersion", "viZRlrisPY");
        setIntField(term56083, term56083.getClass(), "year", 2013);
        setShortField(term56083, term56083.getClass(), "month", (short) 4);
        setShortField(term56083, term56083.getClass(), "day", (short) 26);
        setField(term56082, term56082.getClass(), "date", term56083);
        setByteField(term56087, term56087.getClass(), "hour", (byte) 11);
        setByteField(term56087, term56087.getClass(), "minute", (byte) 7);
        setByteField(term56087, term56087.getClass(), "second", (byte) 42);
        setIntField(term56087, term56087.getClass(), "nano", 202198585);
        setField(term56082, term56082.getClass(), "time", term56087);
        setField(term55923, term55923.getClass(), "firstPlayDate", term56082);
        setField(term55923, term55923.getClass(), "lastGameId", "VSfRsPLslq");
        setField(term55923, term55923.getClass(), "lastRomVersion", "dwygneuBjP");
        setField(term55923, term55923.getClass(), "lastDataVersion", "LfKgkzPZpX");
        setIntField(term56129, term56129.getClass(), "year", 2010);
        setShortField(term56129, term56129.getClass(), "month", (short) 1);
        setShortField(term56129, term56129.getClass(), "day", (short) 11);
        setField(term56128, term56128.getClass(), "date", term56129);
        setByteField(term56133, term56133.getClass(), "hour", (byte) 23);
        setByteField(term56133, term56133.getClass(), "minute", (byte) 36);
        setByteField(term56133, term56133.getClass(), "second", (byte) 37);
        setIntField(term56133, term56133.getClass(), "nano", 947768655);
        setField(term56128, term56128.getClass(), "time", term56133);
        setField(term55923, term55923.getClass(), "lastPlayDate", term56128);
        setIntField(term55923, term55923.getClass(), "lastPlaceId", 1818886574);
        setField(term55923, term55923.getClass(), "lastPlaceName", "belyXxMqFm");
        setField(term55923, term55923.getClass(), "lastRegionId", "LPotuCwkwB");
        setField(term55923, term55923.getClass(), "lastRegionName", "zpCKXLOzse");
        setField(term55923, term55923.getClass(), "lastAllNetId", "qhlWSiHAHt");
        setField(term55923, term55923.getClass(), "lastClientId", "XrKIhxpIJD");
        setField(term55921, term55921.getClass(), "user", term55923);
        setIntField(term55921, term55921.getClass(), "bgInfo", -1082194143);
        setIntField(term55921, term55921.getClass(), "fieldColor", 1109687027);
        setIntField(term55921, term55921.getClass(), "guideSound", -1583077425);
        setIntField(term55921, term55921.getClass(), "soundEffect", -1058283823);
        setIntField(term55921, term55921.getClass(), "guideLine", -1620576583);
        setIntField(term55921, term55921.getClass(), "speed", -1365748841);
        setIntField(term55921, term55921.getClass(), "optionSet", 1223391792);
        setIntField(term55921, term55921.getClass(), "matching", -1134943583);
        setIntField(term55921, term55921.getClass(), "judgePos", -694277686);
        setIntField(term55921, term55921.getClass(), "rating", -2044994445);
        setIntField(term55921, term55921.getClass(), "judgeJustice", -883941371);
        setIntField(term55921, term55921.getClass(), "judgeAttack", -1545047968);
        setIntField(term55921, term55921.getClass(), "headphone", 665116636);
        setIntField(term55921, term55921.getClass(), "playerLevel", 1255353874);
        setIntField(term55921, term55921.getClass(), "successTap", 550111365);
        setIntField(term55921, term55921.getClass(), "successExTap", 1756090789);
        setIntField(term55921, term55921.getClass(), "successSlideHold", -315044098);
        setIntField(term55921, term55921.getClass(), "successAir", 2920253);
        setIntField(term55921, term55921.getClass(), "successFlick", 310113293);
        setIntField(term55921, term55921.getClass(), "successSkill", -1668505285);
        setIntField(term55921, term55921.getClass(), "successTapTimbre", 9043673);
        setIntField(term55921, term55921.getClass(), "privacy", 2059842684);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayerLevel", argTypes, term55921, args);
    }

};


