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

public class UserActivity_getUser_14491314932 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44248;

    public UserActivity_getUser_14491314932() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term44254 = new Long(138235087558060686L);
        term44248 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserActivity"));
        Object term44250 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term44252 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term44268 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term44269 = newInstance(Class.forName("java.time.LocalDate"));
        Object term44273 = newInstance(Class.forName("java.time.LocalTime"));
        Object term44278 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term44279 = newInstance(Class.forName("java.time.LocalDate"));
        Object term44283 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term44248, term44248.getClass(), "id", 146749226579788091L);
        setLongField(term44250, term44250.getClass(), "id", -1279670138064751276L);
        setLongField(term44252, term44252.getClass(), "id", -7205236974351118210L);
        setField(term44252, term44252.getClass(), "extId", term44254);
        setField(term44252, term44252.getClass(), "luid", "mJJkYzNPob");
        setIntField(term44269, term44269.getClass(), "year", 2020);
        setShortField(term44269, term44269.getClass(), "month", (short) 4);
        setShortField(term44269, term44269.getClass(), "day", (short) 16);
        setField(term44268, term44268.getClass(), "date", term44269);
        setByteField(term44273, term44273.getClass(), "hour", (byte) 7);
        setByteField(term44273, term44273.getClass(), "minute", (byte) 46);
        setByteField(term44273, term44273.getClass(), "second", (byte) 47);
        setIntField(term44273, term44273.getClass(), "nano", 687690824);
        setField(term44268, term44268.getClass(), "time", term44273);
        setField(term44252, term44252.getClass(), "registerTime", term44268);
        setIntField(term44279, term44279.getClass(), "year", 2010);
        setShortField(term44279, term44279.getClass(), "month", (short) 7);
        setShortField(term44279, term44279.getClass(), "day", (short) 15);
        setField(term44278, term44278.getClass(), "date", term44279);
        setByteField(term44283, term44283.getClass(), "hour", (byte) 11);
        setByteField(term44283, term44283.getClass(), "minute", (byte) 28);
        setByteField(term44283, term44283.getClass(), "second", (byte) 5);
        setIntField(term44283, term44283.getClass(), "nano", 471613968);
        setField(term44278, term44278.getClass(), "time", term44283);
        setField(term44252, term44252.getClass(), "accessTime", term44278);
        setField(term44250, term44250.getClass(), "card", term44252);
        setIntField(term44250, term44250.getClass(), "lastDataVersion", -1506731850);
        setField(term44250, term44250.getClass(), "userName", "mRDwekkZQg");
        setIntField(term44250, term44250.getClass(), "point", 19036895);
        setIntField(term44250, term44250.getClass(), "totalPoint", 848352999);
        setIntField(term44250, term44250.getClass(), "iconId", 1414809033);
        setIntField(term44250, term44250.getClass(), "nameplateId", 234055254);
        setIntField(term44250, term44250.getClass(), "frameId", 977791910);
        setIntField(term44250, term44250.getClass(), "trophyId", 1763791756);
        setIntField(term44250, term44250.getClass(), "playCount", 1902011317);
        setIntField(term44250, term44250.getClass(), "playVsCount", 739273183);
        setIntField(term44250, term44250.getClass(), "playSyncCount", 577671776);
        setIntField(term44250, term44250.getClass(), "winCount", -573536902);
        setIntField(term44250, term44250.getClass(), "helpCount", -1477265705);
        setIntField(term44250, term44250.getClass(), "comboCount", 560880959);
        setIntField(term44250, term44250.getClass(), "feverCount", -175208201);
        setIntField(term44250, term44250.getClass(), "totalHiScore", -129568329);
        setIntField(term44250, term44250.getClass(), "totalEasyHighScore", -1439138016);
        setIntField(term44250, term44250.getClass(), "totalBasicHighScore", 299991969);
        setIntField(term44250, term44250.getClass(), "totalAdvancedHighScore", -314712088);
        setIntField(term44250, term44250.getClass(), "totalExpertHighScore", 673401830);
        setIntField(term44250, term44250.getClass(), "totalMasterHighScore", 274393548);
        setIntField(term44250, term44250.getClass(), "totalReMasterHighScore", 2009167871);
        setIntField(term44250, term44250.getClass(), "totalHighSync", -1001649335);
        setIntField(term44250, term44250.getClass(), "totalEasySync", -1983284991);
        setIntField(term44250, term44250.getClass(), "totalBasicSync", 386592778);
        setIntField(term44250, term44250.getClass(), "totalAdvancedSync", 1718374650);
        setIntField(term44250, term44250.getClass(), "totalExpertSync", -1170695156);
        setIntField(term44250, term44250.getClass(), "totalMasterSync", -854423228);
        setIntField(term44250, term44250.getClass(), "totalReMasterSync", -135398430);
        setIntField(term44250, term44250.getClass(), "playerRating", 1404546541);
        setIntField(term44250, term44250.getClass(), "highestRating", 1350945157);
        setIntField(term44250, term44250.getClass(), "rankAuthTailId", 917364076);
        setField(term44250, term44250.getClass(), "eventWatchedDate", "RIGChgqpTI");
        setField(term44250, term44250.getClass(), "webLimitDate", "YCrgXnhgoK");
        setIntField(term44250, term44250.getClass(), "challengeTrackPhase", 727152467);
        setIntField(term44250, term44250.getClass(), "firstPlayBits", -138608321);
        setField(term44250, term44250.getClass(), "lastPlayDate", "nQodIeQekM");
        setIntField(term44250, term44250.getClass(), "lastPlaceId", 2095812393);
        setField(term44250, term44250.getClass(), "lastPlaceName", "YXORpHCDcd");
        setIntField(term44250, term44250.getClass(), "lastRegionId", 1431497505);
        setField(term44250, term44250.getClass(), "lastRegionName", "XzZbAcRADD");
        setField(term44250, term44250.getClass(), "lastClientId", "UqSNWSoTRy");
        setField(term44250, term44250.getClass(), "lastCountryCode", "VesRqDfjMa");
        setIntField(term44250, term44250.getClass(), "eventPoint", -135681605);
        setIntField(term44250, term44250.getClass(), "totalLv", -881873928);
        setIntField(term44250, term44250.getClass(), "lastLoginBonusDay", 813195927);
        setIntField(term44250, term44250.getClass(), "lastSurvivalBonusDay", 837178544);
        setIntField(term44250, term44250.getClass(), "loginBonusLv", 933005179);
        setField(term44248, term44248.getClass(), "user", term44250);
        setIntField(term44248, term44248.getClass(), "kind", -1371488618);
        setIntField(term44248, term44248.getClass(), "activityId", -1728526884);
        setLongField(term44248, term44248.getClass(), "sortNumber", -2136893352275781569L);
        setIntField(term44248, term44248.getClass(), "param1", 78399484);
        setIntField(term44248, term44248.getClass(), "param2", -529573926);
        setIntField(term44248, term44248.getClass(), "param3", 1526559521);
        setIntField(term44248, term44248.getClass(), "param4", -1479591438);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserActivity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUser", argTypes, term44248, args);
    }

};


