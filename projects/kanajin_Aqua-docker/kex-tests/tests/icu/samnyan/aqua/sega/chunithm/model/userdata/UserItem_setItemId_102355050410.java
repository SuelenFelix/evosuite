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
import java.lang.Integer;

public class UserItem_setItemId_102355050410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term125797;
     Object term126079;

    public UserItem_setItemId_102355050410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term125803 = new Long(-7456852906235966771L);
        term125797 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserItem"));
        Object term125799 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term125801 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term125817 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term125818 = newInstance(Class.forName("java.time.LocalDate"));
        Object term125822 = newInstance(Class.forName("java.time.LocalTime"));
        Object term125827 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term125828 = newInstance(Class.forName("java.time.LocalDate"));
        Object term125832 = newInstance(Class.forName("java.time.LocalTime"));
        Object term125849 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term125850 = newInstance(Class.forName("java.time.LocalDate"));
        Object term125854 = newInstance(Class.forName("java.time.LocalTime"));
        Object term125910 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term125911 = newInstance(Class.forName("java.time.LocalDate"));
        Object term125915 = newInstance(Class.forName("java.time.LocalTime"));
        Object term125958 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term125959 = newInstance(Class.forName("java.time.LocalDate"));
        Object term125963 = newInstance(Class.forName("java.time.LocalTime"));
        Object term126004 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term126005 = newInstance(Class.forName("java.time.LocalDate"));
        Object term126009 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term125797, term125797.getClass(), "id", 8507610962194526217L);
        setLongField(term125799, term125799.getClass(), "id", 4405633700704963930L);
        setLongField(term125801, term125801.getClass(), "id", -2839037457841740486L);
        setField(term125801, term125801.getClass(), "extId", term125803);
        setField(term125801, term125801.getClass(), "luid", "yICoZygmis");
        setIntField(term125818, term125818.getClass(), "year", 2029);
        setShortField(term125818, term125818.getClass(), "month", (short) 1);
        setShortField(term125818, term125818.getClass(), "day", (short) 25);
        setField(term125817, term125817.getClass(), "date", term125818);
        setByteField(term125822, term125822.getClass(), "hour", (byte) 13);
        setByteField(term125822, term125822.getClass(), "minute", (byte) 37);
        setByteField(term125822, term125822.getClass(), "second", (byte) 9);
        setIntField(term125822, term125822.getClass(), "nano", 105283883);
        setField(term125817, term125817.getClass(), "time", term125822);
        setField(term125801, term125801.getClass(), "registerTime", term125817);
        setIntField(term125828, term125828.getClass(), "year", 2025);
        setShortField(term125828, term125828.getClass(), "month", (short) 4);
        setShortField(term125828, term125828.getClass(), "day", (short) 17);
        setField(term125827, term125827.getClass(), "date", term125828);
        setByteField(term125832, term125832.getClass(), "hour", (byte) 5);
        setByteField(term125832, term125832.getClass(), "minute", (byte) 18);
        setByteField(term125832, term125832.getClass(), "second", (byte) 1);
        setIntField(term125832, term125832.getClass(), "nano", 251091894);
        setField(term125827, term125827.getClass(), "time", term125832);
        setField(term125801, term125801.getClass(), "accessTime", term125827);
        setField(term125799, term125799.getClass(), "card", term125801);
        setField(term125799, term125799.getClass(), "userName", "jkpqjRyuQn");
        setIntField(term125850, term125850.getClass(), "year", 2017);
        setShortField(term125850, term125850.getClass(), "month", (short) 5);
        setShortField(term125850, term125850.getClass(), "day", (short) 22);
        setField(term125849, term125849.getClass(), "date", term125850);
        setByteField(term125854, term125854.getClass(), "hour", (byte) 14);
        setByteField(term125854, term125854.getClass(), "minute", (byte) 0);
        setByteField(term125854, term125854.getClass(), "second", (byte) 49);
        setIntField(term125854, term125854.getClass(), "nano", 354492142);
        setField(term125849, term125849.getClass(), "time", term125854);
        setField(term125799, term125799.getClass(), "lastLoginDate", term125849);
        setBooleanField(term125799, term125799.getClass(), "isWebJoin", true);
        setField(term125799, term125799.getClass(), "webLimitDate", "VyUAUXqMnJ");
        setIntField(term125799, term125799.getClass(), "level", 18274749);
        setIntField(term125799, term125799.getClass(), "reincarnationNum", -1198028507);
        setField(term125799, term125799.getClass(), "exp", "kpIzuOxHoi");
        setLongField(term125799, term125799.getClass(), "point", -1513496915959494427L);
        setLongField(term125799, term125799.getClass(), "totalPoint", -7420758314888274572L);
        setIntField(term125799, term125799.getClass(), "playCount", 1662186988);
        setIntField(term125799, term125799.getClass(), "multiPlayCount", -705500735);
        setIntField(term125799, term125799.getClass(), "multiWinCount", 1413163657);
        setIntField(term125799, term125799.getClass(), "requestResCount", 1786383370);
        setIntField(term125799, term125799.getClass(), "acceptResCount", -15655134);
        setIntField(term125799, term125799.getClass(), "successResCount", -1172202773);
        setIntField(term125799, term125799.getClass(), "playerRating", -1605235550);
        setIntField(term125799, term125799.getClass(), "highestRating", 2000557141);
        setIntField(term125799, term125799.getClass(), "nameplateId", 869332244);
        setIntField(term125799, term125799.getClass(), "frameId", 451620754);
        setIntField(term125799, term125799.getClass(), "characterId", -2071921290);
        setIntField(term125799, term125799.getClass(), "trophyId", -727695802);
        setIntField(term125799, term125799.getClass(), "playedTutorialBit", 703774169);
        setIntField(term125799, term125799.getClass(), "firstTutorialCancelNum", 1054985494);
        setIntField(term125799, term125799.getClass(), "masterTutorialCancelNum", 1945574428);
        setIntField(term125799, term125799.getClass(), "totalRepertoireCount", -1773198269);
        setIntField(term125799, term125799.getClass(), "totalMapNum", 1316134921);
        setLongField(term125799, term125799.getClass(), "totalHiScore", 100921021167076044L);
        setLongField(term125799, term125799.getClass(), "totalBasicHighScore", 3172098761380472870L);
        setLongField(term125799, term125799.getClass(), "totalAdvancedHighScore", 2052550259156258390L);
        setLongField(term125799, term125799.getClass(), "totalExpertHighScore", -5876574528929327037L);
        setLongField(term125799, term125799.getClass(), "totalMasterHighScore", 8591209862636160040L);
        setIntField(term125911, term125911.getClass(), "year", 2024);
        setShortField(term125911, term125911.getClass(), "month", (short) 4);
        setShortField(term125911, term125911.getClass(), "day", (short) 4);
        setField(term125910, term125910.getClass(), "date", term125911);
        setByteField(term125915, term125915.getClass(), "hour", (byte) 6);
        setByteField(term125915, term125915.getClass(), "minute", (byte) 44);
        setByteField(term125915, term125915.getClass(), "second", (byte) 55);
        setIntField(term125915, term125915.getClass(), "nano", 929065738);
        setField(term125910, term125910.getClass(), "time", term125915);
        setField(term125799, term125799.getClass(), "eventWatchedDate", term125910);
        setIntField(term125799, term125799.getClass(), "friendCount", 1056847308);
        setBooleanField(term125799, term125799.getClass(), "isMaimai", false);
        setField(term125799, term125799.getClass(), "firstGameId", "HnyxpTbQyj");
        setField(term125799, term125799.getClass(), "firstRomVersion", "jCoeBTGJOl");
        setField(term125799, term125799.getClass(), "firstDataVersion", "RpcnPMoqQP");
        setIntField(term125959, term125959.getClass(), "year", 2029);
        setShortField(term125959, term125959.getClass(), "month", (short) 4);
        setShortField(term125959, term125959.getClass(), "day", (short) 13);
        setField(term125958, term125958.getClass(), "date", term125959);
        setByteField(term125963, term125963.getClass(), "hour", (byte) 13);
        setByteField(term125963, term125963.getClass(), "minute", (byte) 52);
        setByteField(term125963, term125963.getClass(), "second", (byte) 32);
        setIntField(term125963, term125963.getClass(), "nano", 194695575);
        setField(term125958, term125958.getClass(), "time", term125963);
        setField(term125799, term125799.getClass(), "firstPlayDate", term125958);
        setField(term125799, term125799.getClass(), "lastGameId", "rcSNzDRILu");
        setField(term125799, term125799.getClass(), "lastRomVersion", "VAFzJeEFAQ");
        setField(term125799, term125799.getClass(), "lastDataVersion", "yqhryWPaPb");
        setIntField(term126005, term126005.getClass(), "year", 2024);
        setShortField(term126005, term126005.getClass(), "month", (short) 4);
        setShortField(term126005, term126005.getClass(), "day", (short) 30);
        setField(term126004, term126004.getClass(), "date", term126005);
        setByteField(term126009, term126009.getClass(), "hour", (byte) 23);
        setByteField(term126009, term126009.getClass(), "minute", (byte) 23);
        setByteField(term126009, term126009.getClass(), "second", (byte) 51);
        setIntField(term126009, term126009.getClass(), "nano", 322567808);
        setField(term126004, term126004.getClass(), "time", term126009);
        setField(term125799, term125799.getClass(), "lastPlayDate", term126004);
        setIntField(term125799, term125799.getClass(), "lastPlaceId", 1211085720);
        setField(term125799, term125799.getClass(), "lastPlaceName", "TBvkESDYGc");
        setField(term125799, term125799.getClass(), "lastRegionId", "xPXaeMXfJb");
        setField(term125799, term125799.getClass(), "lastRegionName", "ujCcQbAWoz");
        setField(term125799, term125799.getClass(), "lastAllNetId", "gJKBShUpxP");
        setField(term125799, term125799.getClass(), "lastClientId", "AgLTAjLwXk");
        setField(term125797, term125797.getClass(), "user", term125799);
        setIntField(term125797, term125797.getClass(), "itemKind", 1797871047);
        setIntField(term125797, term125797.getClass(), "itemId", -1831206748);
        setIntField(term125797, term125797.getClass(), "stock", 1);
        setBooleanField(term125797, term125797.getClass(), "isValid", true);
        term126079 = new Integer(-63988972);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserItem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term126079;
        callMethod(klass, "setItemId", argTypes, term125797, args);
    }

};


