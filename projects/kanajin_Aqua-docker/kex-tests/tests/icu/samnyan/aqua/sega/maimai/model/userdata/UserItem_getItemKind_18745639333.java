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

public class UserItem_getItemKind_18745639333 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term85097;

    public UserItem_getItemKind_18745639333() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term85103 = new Long(5315236285592892506L);
        term85097 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserItem"));
        Object term85099 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term85101 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term85117 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term85118 = newInstance(Class.forName("java.time.LocalDate"));
        Object term85122 = newInstance(Class.forName("java.time.LocalTime"));
        Object term85127 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term85128 = newInstance(Class.forName("java.time.LocalDate"));
        Object term85132 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term85097, term85097.getClass(), "id", -888581501148999479L);
        setLongField(term85099, term85099.getClass(), "id", 1835131711657183788L);
        setLongField(term85101, term85101.getClass(), "id", -4507768716367203234L);
        setField(term85101, term85101.getClass(), "extId", term85103);
        setField(term85101, term85101.getClass(), "luid", "RVQbteztJx");
        setIntField(term85118, term85118.getClass(), "year", 2010);
        setShortField(term85118, term85118.getClass(), "month", (short) 8);
        setShortField(term85118, term85118.getClass(), "day", (short) 29);
        setField(term85117, term85117.getClass(), "date", term85118);
        setByteField(term85122, term85122.getClass(), "hour", (byte) 14);
        setByteField(term85122, term85122.getClass(), "minute", (byte) 6);
        setByteField(term85122, term85122.getClass(), "second", (byte) 52);
        setIntField(term85122, term85122.getClass(), "nano", 882272618);
        setField(term85117, term85117.getClass(), "time", term85122);
        setField(term85101, term85101.getClass(), "registerTime", term85117);
        setIntField(term85128, term85128.getClass(), "year", 2011);
        setShortField(term85128, term85128.getClass(), "month", (short) 3);
        setShortField(term85128, term85128.getClass(), "day", (short) 21);
        setField(term85127, term85127.getClass(), "date", term85128);
        setByteField(term85132, term85132.getClass(), "hour", (byte) 10);
        setByteField(term85132, term85132.getClass(), "minute", (byte) 56);
        setByteField(term85132, term85132.getClass(), "second", (byte) 39);
        setIntField(term85132, term85132.getClass(), "nano", 54553750);
        setField(term85127, term85127.getClass(), "time", term85132);
        setField(term85101, term85101.getClass(), "accessTime", term85127);
        setField(term85099, term85099.getClass(), "card", term85101);
        setIntField(term85099, term85099.getClass(), "lastDataVersion", 56346497);
        setField(term85099, term85099.getClass(), "userName", "yjmUdvwSdd");
        setIntField(term85099, term85099.getClass(), "point", -557292568);
        setIntField(term85099, term85099.getClass(), "totalPoint", -370318174);
        setIntField(term85099, term85099.getClass(), "iconId", 721583335);
        setIntField(term85099, term85099.getClass(), "nameplateId", 1048340440);
        setIntField(term85099, term85099.getClass(), "frameId", 1746284065);
        setIntField(term85099, term85099.getClass(), "trophyId", 1832660337);
        setIntField(term85099, term85099.getClass(), "playCount", -1990813786);
        setIntField(term85099, term85099.getClass(), "playVsCount", 1064455079);
        setIntField(term85099, term85099.getClass(), "playSyncCount", -1632870355);
        setIntField(term85099, term85099.getClass(), "winCount", 275827584);
        setIntField(term85099, term85099.getClass(), "helpCount", 1517327907);
        setIntField(term85099, term85099.getClass(), "comboCount", -1581493553);
        setIntField(term85099, term85099.getClass(), "feverCount", 1146701831);
        setIntField(term85099, term85099.getClass(), "totalHiScore", -1098689257);
        setIntField(term85099, term85099.getClass(), "totalEasyHighScore", -281818549);
        setIntField(term85099, term85099.getClass(), "totalBasicHighScore", -1418327456);
        setIntField(term85099, term85099.getClass(), "totalAdvancedHighScore", 572666147);
        setIntField(term85099, term85099.getClass(), "totalExpertHighScore", 250271286);
        setIntField(term85099, term85099.getClass(), "totalMasterHighScore", 1309683419);
        setIntField(term85099, term85099.getClass(), "totalReMasterHighScore", -2069969294);
        setIntField(term85099, term85099.getClass(), "totalHighSync", 439212977);
        setIntField(term85099, term85099.getClass(), "totalEasySync", 2018062465);
        setIntField(term85099, term85099.getClass(), "totalBasicSync", 1045822023);
        setIntField(term85099, term85099.getClass(), "totalAdvancedSync", 1104676150);
        setIntField(term85099, term85099.getClass(), "totalExpertSync", 1984472098);
        setIntField(term85099, term85099.getClass(), "totalMasterSync", 1608550008);
        setIntField(term85099, term85099.getClass(), "totalReMasterSync", 1198848988);
        setIntField(term85099, term85099.getClass(), "playerRating", -1791070393);
        setIntField(term85099, term85099.getClass(), "highestRating", 1342512875);
        setIntField(term85099, term85099.getClass(), "rankAuthTailId", 1276618218);
        setField(term85099, term85099.getClass(), "eventWatchedDate", "COsGswsrtI");
        setField(term85099, term85099.getClass(), "webLimitDate", "ebUWnoVDmk");
        setIntField(term85099, term85099.getClass(), "challengeTrackPhase", -437115096);
        setIntField(term85099, term85099.getClass(), "firstPlayBits", 778176837);
        setField(term85099, term85099.getClass(), "lastPlayDate", "wCcojFgWKb");
        setIntField(term85099, term85099.getClass(), "lastPlaceId", 1986276488);
        setField(term85099, term85099.getClass(), "lastPlaceName", "iHtqLPNWTt");
        setIntField(term85099, term85099.getClass(), "lastRegionId", -1699338837);
        setField(term85099, term85099.getClass(), "lastRegionName", "TQgECVDMEf");
        setField(term85099, term85099.getClass(), "lastClientId", "KIBOVYItqe");
        setField(term85099, term85099.getClass(), "lastCountryCode", "GUztJeVeCc");
        setIntField(term85099, term85099.getClass(), "eventPoint", -1616907879);
        setIntField(term85099, term85099.getClass(), "totalLv", -2053674332);
        setIntField(term85099, term85099.getClass(), "lastLoginBonusDay", 1511770563);
        setIntField(term85099, term85099.getClass(), "lastSurvivalBonusDay", -1328010620);
        setIntField(term85099, term85099.getClass(), "loginBonusLv", -1706269085);
        setField(term85097, term85097.getClass(), "user", term85099);
        setIntField(term85097, term85097.getClass(), "itemKind", 2015694273);
        setIntField(term85097, term85097.getClass(), "itemId", 1833181237);
        setIntField(term85097, term85097.getClass(), "stock", -433780886);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getItemKind", argTypes, term85097, args);
    }

};


