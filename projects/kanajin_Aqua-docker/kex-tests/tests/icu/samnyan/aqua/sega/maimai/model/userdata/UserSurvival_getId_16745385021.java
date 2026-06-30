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

public class UserSurvival_getId_16745385021 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term102153;

    public UserSurvival_getId_16745385021() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term102159 = new Long(3746481521207337771L);
        term102153 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserSurvival"));
        Object term102155 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term102157 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term102173 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term102174 = newInstance(Class.forName("java.time.LocalDate"));
        Object term102178 = newInstance(Class.forName("java.time.LocalTime"));
        Object term102183 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term102184 = newInstance(Class.forName("java.time.LocalDate"));
        Object term102188 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term102153, term102153.getClass(), "id", 3746407492061591608L);
        setLongField(term102155, term102155.getClass(), "id", -8815714356297321412L);
        setLongField(term102157, term102157.getClass(), "id", -4738455258060622217L);
        setField(term102157, term102157.getClass(), "extId", term102159);
        setField(term102157, term102157.getClass(), "luid", "bZISImXSTe");
        setIntField(term102174, term102174.getClass(), "year", 2017);
        setShortField(term102174, term102174.getClass(), "month", (short) 7);
        setShortField(term102174, term102174.getClass(), "day", (short) 24);
        setField(term102173, term102173.getClass(), "date", term102174);
        setByteField(term102178, term102178.getClass(), "hour", (byte) 3);
        setByteField(term102178, term102178.getClass(), "minute", (byte) 55);
        setByteField(term102178, term102178.getClass(), "second", (byte) 40);
        setIntField(term102178, term102178.getClass(), "nano", 397924395);
        setField(term102173, term102173.getClass(), "time", term102178);
        setField(term102157, term102157.getClass(), "registerTime", term102173);
        setIntField(term102184, term102184.getClass(), "year", 2019);
        setShortField(term102184, term102184.getClass(), "month", (short) 1);
        setShortField(term102184, term102184.getClass(), "day", (short) 4);
        setField(term102183, term102183.getClass(), "date", term102184);
        setByteField(term102188, term102188.getClass(), "hour", (byte) 6);
        setByteField(term102188, term102188.getClass(), "minute", (byte) 53);
        setByteField(term102188, term102188.getClass(), "second", (byte) 23);
        setIntField(term102188, term102188.getClass(), "nano", 416630544);
        setField(term102183, term102183.getClass(), "time", term102188);
        setField(term102157, term102157.getClass(), "accessTime", term102183);
        setField(term102155, term102155.getClass(), "card", term102157);
        setIntField(term102155, term102155.getClass(), "lastDataVersion", -1696711810);
        setField(term102155, term102155.getClass(), "userName", "yrKoMMHHHY");
        setIntField(term102155, term102155.getClass(), "point", -147714929);
        setIntField(term102155, term102155.getClass(), "totalPoint", -2045202054);
        setIntField(term102155, term102155.getClass(), "iconId", 1996188078);
        setIntField(term102155, term102155.getClass(), "nameplateId", -56413483);
        setIntField(term102155, term102155.getClass(), "frameId", -1181416306);
        setIntField(term102155, term102155.getClass(), "trophyId", 2099316913);
        setIntField(term102155, term102155.getClass(), "playCount", -992105490);
        setIntField(term102155, term102155.getClass(), "playVsCount", -1449542606);
        setIntField(term102155, term102155.getClass(), "playSyncCount", 406259462);
        setIntField(term102155, term102155.getClass(), "winCount", 660518206);
        setIntField(term102155, term102155.getClass(), "helpCount", -2010658317);
        setIntField(term102155, term102155.getClass(), "comboCount", -2061982603);
        setIntField(term102155, term102155.getClass(), "feverCount", -1288997751);
        setIntField(term102155, term102155.getClass(), "totalHiScore", -218628475);
        setIntField(term102155, term102155.getClass(), "totalEasyHighScore", 704093413);
        setIntField(term102155, term102155.getClass(), "totalBasicHighScore", 718574088);
        setIntField(term102155, term102155.getClass(), "totalAdvancedHighScore", -1983026826);
        setIntField(term102155, term102155.getClass(), "totalExpertHighScore", 340317830);
        setIntField(term102155, term102155.getClass(), "totalMasterHighScore", -1778062754);
        setIntField(term102155, term102155.getClass(), "totalReMasterHighScore", 656886359);
        setIntField(term102155, term102155.getClass(), "totalHighSync", -1737586602);
        setIntField(term102155, term102155.getClass(), "totalEasySync", -11215244);
        setIntField(term102155, term102155.getClass(), "totalBasicSync", -256225420);
        setIntField(term102155, term102155.getClass(), "totalAdvancedSync", 42031743);
        setIntField(term102155, term102155.getClass(), "totalExpertSync", 1933411977);
        setIntField(term102155, term102155.getClass(), "totalMasterSync", 1568448645);
        setIntField(term102155, term102155.getClass(), "totalReMasterSync", 784553974);
        setIntField(term102155, term102155.getClass(), "playerRating", -595519675);
        setIntField(term102155, term102155.getClass(), "highestRating", -2047451359);
        setIntField(term102155, term102155.getClass(), "rankAuthTailId", 460067592);
        setField(term102155, term102155.getClass(), "eventWatchedDate", "JqDCwLjqnp");
        setField(term102155, term102155.getClass(), "webLimitDate", "FHqHhmdJat");
        setIntField(term102155, term102155.getClass(), "challengeTrackPhase", 2077115892);
        setIntField(term102155, term102155.getClass(), "firstPlayBits", -1419433911);
        setField(term102155, term102155.getClass(), "lastPlayDate", "QvpedpvzkV");
        setIntField(term102155, term102155.getClass(), "lastPlaceId", 1822969869);
        setField(term102155, term102155.getClass(), "lastPlaceName", "hSWpWtRQyH");
        setIntField(term102155, term102155.getClass(), "lastRegionId", -1408911173);
        setField(term102155, term102155.getClass(), "lastRegionName", "DgHnOCKjBN");
        setField(term102155, term102155.getClass(), "lastClientId", "nSSytCAuBk");
        setField(term102155, term102155.getClass(), "lastCountryCode", "XiZyOHXnNC");
        setIntField(term102155, term102155.getClass(), "eventPoint", -1658565244);
        setIntField(term102155, term102155.getClass(), "totalLv", 222302842);
        setIntField(term102155, term102155.getClass(), "lastLoginBonusDay", -1879308935);
        setIntField(term102155, term102155.getClass(), "lastSurvivalBonusDay", 1433334366);
        setIntField(term102155, term102155.getClass(), "loginBonusLv", 1570982083);
        setField(term102153, term102153.getClass(), "user", term102155);
        setIntField(term102153, term102153.getClass(), "survivalId", 79001036);
        setIntField(term102153, term102153.getClass(), "totalScore", -2128177291);
        setIntField(term102153, term102153.getClass(), "totalAchieve", -1298705021);
        setBooleanField(term102153, term102153.getClass(), "isClear", false);
        setBooleanField(term102153, term102153.getClass(), "isNoDamage", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserSurvival");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term102153, args);
    }

};


