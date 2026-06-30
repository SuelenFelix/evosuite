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

public class UserGameOptionEx_getExt5_8944055477 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term312719;

    public UserGameOptionEx_getExt5_8944055477() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term312725 = new Long(-1325109462577461208L);
        term312719 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOptionEx"));
        Object term312721 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term312723 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term312739 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term312740 = newInstance(Class.forName("java.time.LocalDate"));
        Object term312744 = newInstance(Class.forName("java.time.LocalTime"));
        Object term312749 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term312750 = newInstance(Class.forName("java.time.LocalDate"));
        Object term312754 = newInstance(Class.forName("java.time.LocalTime"));
        Object term312771 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term312772 = newInstance(Class.forName("java.time.LocalDate"));
        Object term312776 = newInstance(Class.forName("java.time.LocalTime"));
        Object term312832 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term312833 = newInstance(Class.forName("java.time.LocalDate"));
        Object term312837 = newInstance(Class.forName("java.time.LocalTime"));
        Object term312880 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term312881 = newInstance(Class.forName("java.time.LocalDate"));
        Object term312885 = newInstance(Class.forName("java.time.LocalTime"));
        Object term312926 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term312927 = newInstance(Class.forName("java.time.LocalDate"));
        Object term312931 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term312719, term312719.getClass(), "id", -2150229403476575447L);
        setLongField(term312721, term312721.getClass(), "id", -623600138515789120L);
        setLongField(term312723, term312723.getClass(), "id", 3384791734790058474L);
        setField(term312723, term312723.getClass(), "extId", term312725);
        setField(term312723, term312723.getClass(), "luid", "gQKUmoXhdM");
        setIntField(term312740, term312740.getClass(), "year", 2011);
        setShortField(term312740, term312740.getClass(), "month", (short) 8);
        setShortField(term312740, term312740.getClass(), "day", (short) 22);
        setField(term312739, term312739.getClass(), "date", term312740);
        setByteField(term312744, term312744.getClass(), "hour", (byte) 11);
        setByteField(term312744, term312744.getClass(), "minute", (byte) 38);
        setByteField(term312744, term312744.getClass(), "second", (byte) 10);
        setIntField(term312744, term312744.getClass(), "nano", 744167181);
        setField(term312739, term312739.getClass(), "time", term312744);
        setField(term312723, term312723.getClass(), "registerTime", term312739);
        setIntField(term312750, term312750.getClass(), "year", 2013);
        setShortField(term312750, term312750.getClass(), "month", (short) 5);
        setShortField(term312750, term312750.getClass(), "day", (short) 25);
        setField(term312749, term312749.getClass(), "date", term312750);
        setByteField(term312754, term312754.getClass(), "hour", (byte) 14);
        setByteField(term312754, term312754.getClass(), "minute", (byte) 26);
        setByteField(term312754, term312754.getClass(), "second", (byte) 42);
        setIntField(term312754, term312754.getClass(), "nano", 569079004);
        setField(term312749, term312749.getClass(), "time", term312754);
        setField(term312723, term312723.getClass(), "accessTime", term312749);
        setField(term312721, term312721.getClass(), "card", term312723);
        setField(term312721, term312721.getClass(), "userName", "tvvzjEdEMh");
        setIntField(term312772, term312772.getClass(), "year", 2016);
        setShortField(term312772, term312772.getClass(), "month", (short) 8);
        setShortField(term312772, term312772.getClass(), "day", (short) 9);
        setField(term312771, term312771.getClass(), "date", term312772);
        setByteField(term312776, term312776.getClass(), "hour", (byte) 15);
        setByteField(term312776, term312776.getClass(), "minute", (byte) 20);
        setByteField(term312776, term312776.getClass(), "second", (byte) 10);
        setIntField(term312776, term312776.getClass(), "nano", 585517593);
        setField(term312771, term312771.getClass(), "time", term312776);
        setField(term312721, term312721.getClass(), "lastLoginDate", term312771);
        setBooleanField(term312721, term312721.getClass(), "isWebJoin", false);
        setField(term312721, term312721.getClass(), "webLimitDate", "MxEEwZkyaW");
        setIntField(term312721, term312721.getClass(), "level", -553060939);
        setIntField(term312721, term312721.getClass(), "reincarnationNum", -2072078720);
        setField(term312721, term312721.getClass(), "exp", "lOGWYEqHxj");
        setLongField(term312721, term312721.getClass(), "point", -5159022687886007790L);
        setLongField(term312721, term312721.getClass(), "totalPoint", 5961711205558912307L);
        setIntField(term312721, term312721.getClass(), "playCount", -2132989706);
        setIntField(term312721, term312721.getClass(), "multiPlayCount", 89843427);
        setIntField(term312721, term312721.getClass(), "multiWinCount", -1714759689);
        setIntField(term312721, term312721.getClass(), "requestResCount", 2124238526);
        setIntField(term312721, term312721.getClass(), "acceptResCount", 149013193);
        setIntField(term312721, term312721.getClass(), "successResCount", -717409234);
        setIntField(term312721, term312721.getClass(), "playerRating", 201560884);
        setIntField(term312721, term312721.getClass(), "highestRating", 133431955);
        setIntField(term312721, term312721.getClass(), "nameplateId", 1471635389);
        setIntField(term312721, term312721.getClass(), "frameId", 1879667981);
        setIntField(term312721, term312721.getClass(), "characterId", 380951165);
        setIntField(term312721, term312721.getClass(), "trophyId", -549256740);
        setIntField(term312721, term312721.getClass(), "playedTutorialBit", 240821687);
        setIntField(term312721, term312721.getClass(), "firstTutorialCancelNum", 1491373059);
        setIntField(term312721, term312721.getClass(), "masterTutorialCancelNum", 1743858576);
        setIntField(term312721, term312721.getClass(), "totalRepertoireCount", -1058684191);
        setIntField(term312721, term312721.getClass(), "totalMapNum", -87159974);
        setLongField(term312721, term312721.getClass(), "totalHiScore", -422916641348511945L);
        setLongField(term312721, term312721.getClass(), "totalBasicHighScore", 3012829681646545710L);
        setLongField(term312721, term312721.getClass(), "totalAdvancedHighScore", 4377245184623049180L);
        setLongField(term312721, term312721.getClass(), "totalExpertHighScore", 6534893758959343917L);
        setLongField(term312721, term312721.getClass(), "totalMasterHighScore", -1038048723599808380L);
        setIntField(term312833, term312833.getClass(), "year", 2018);
        setShortField(term312833, term312833.getClass(), "month", (short) 10);
        setShortField(term312833, term312833.getClass(), "day", (short) 9);
        setField(term312832, term312832.getClass(), "date", term312833);
        setByteField(term312837, term312837.getClass(), "hour", (byte) 18);
        setByteField(term312837, term312837.getClass(), "minute", (byte) 54);
        setByteField(term312837, term312837.getClass(), "second", (byte) 19);
        setIntField(term312837, term312837.getClass(), "nano", 478244039);
        setField(term312832, term312832.getClass(), "time", term312837);
        setField(term312721, term312721.getClass(), "eventWatchedDate", term312832);
        setIntField(term312721, term312721.getClass(), "friendCount", 1139688356);
        setBooleanField(term312721, term312721.getClass(), "isMaimai", true);
        setField(term312721, term312721.getClass(), "firstGameId", "bfmcuNDfeS");
        setField(term312721, term312721.getClass(), "firstRomVersion", "oNwwaNwhoB");
        setField(term312721, term312721.getClass(), "firstDataVersion", "YVrwLJWJoI");
        setIntField(term312881, term312881.getClass(), "year", 2010);
        setShortField(term312881, term312881.getClass(), "month", (short) 1);
        setShortField(term312881, term312881.getClass(), "day", (short) 19);
        setField(term312880, term312880.getClass(), "date", term312881);
        setByteField(term312885, term312885.getClass(), "hour", (byte) 4);
        setByteField(term312885, term312885.getClass(), "minute", (byte) 14);
        setByteField(term312885, term312885.getClass(), "second", (byte) 24);
        setIntField(term312885, term312885.getClass(), "nano", 713949654);
        setField(term312880, term312880.getClass(), "time", term312885);
        setField(term312721, term312721.getClass(), "firstPlayDate", term312880);
        setField(term312721, term312721.getClass(), "lastGameId", "IDBsGgnCMF");
        setField(term312721, term312721.getClass(), "lastRomVersion", "zogoMEslwR");
        setField(term312721, term312721.getClass(), "lastDataVersion", "SfWNBumWCS");
        setIntField(term312927, term312927.getClass(), "year", 2029);
        setShortField(term312927, term312927.getClass(), "month", (short) 11);
        setShortField(term312927, term312927.getClass(), "day", (short) 5);
        setField(term312926, term312926.getClass(), "date", term312927);
        setByteField(term312931, term312931.getClass(), "hour", (byte) 16);
        setByteField(term312931, term312931.getClass(), "minute", (byte) 16);
        setByteField(term312931, term312931.getClass(), "second", (byte) 50);
        setIntField(term312931, term312931.getClass(), "nano", 571905423);
        setField(term312926, term312926.getClass(), "time", term312931);
        setField(term312721, term312721.getClass(), "lastPlayDate", term312926);
        setIntField(term312721, term312721.getClass(), "lastPlaceId", -1219688886);
        setField(term312721, term312721.getClass(), "lastPlaceName", "fHJImkGpKa");
        setField(term312721, term312721.getClass(), "lastRegionId", "FFuRCJTPFU");
        setField(term312721, term312721.getClass(), "lastRegionName", "TFqQgSYtAg");
        setField(term312721, term312721.getClass(), "lastAllNetId", "qIbUvSzenQ");
        setField(term312721, term312721.getClass(), "lastClientId", "syLbtpcFxr");
        setField(term312719, term312719.getClass(), "user", term312721);
        setIntField(term312719, term312719.getClass(), "ext1", -1849051466);
        setIntField(term312719, term312719.getClass(), "ext2", -1439424871);
        setIntField(term312719, term312719.getClass(), "ext3", 1330271134);
        setIntField(term312719, term312719.getClass(), "ext4", 1088923482);
        setIntField(term312719, term312719.getClass(), "ext5", -808222748);
        setIntField(term312719, term312719.getClass(), "ext6", -902881139);
        setIntField(term312719, term312719.getClass(), "ext7", -565825027);
        setIntField(term312719, term312719.getClass(), "ext8", -247973321);
        setIntField(term312719, term312719.getClass(), "ext9", 940470089);
        setIntField(term312719, term312719.getClass(), "ext10", 1870531208);
        setIntField(term312719, term312719.getClass(), "ext11", -1019988822);
        setIntField(term312719, term312719.getClass(), "ext12", 1965536851);
        setIntField(term312719, term312719.getClass(), "ext13", -497259716);
        setIntField(term312719, term312719.getClass(), "ext14", 918311017);
        setIntField(term312719, term312719.getClass(), "ext15", 1998112564);
        setIntField(term312719, term312719.getClass(), "ext16", 365878160);
        setIntField(term312719, term312719.getClass(), "ext17", -719674124);
        setIntField(term312719, term312719.getClass(), "ext18", 212530225);
        setIntField(term312719, term312719.getClass(), "ext19", 1825487058);
        setIntField(term312719, term312719.getClass(), "ext20", 548602355);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOptionEx");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExt5", argTypes, term312719, args);
    }

};


