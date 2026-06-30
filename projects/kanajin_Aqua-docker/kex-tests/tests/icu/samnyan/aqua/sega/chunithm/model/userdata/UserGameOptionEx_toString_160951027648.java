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

public class UserGameOptionEx_toString_160951027648 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term331557;

    public UserGameOptionEx_toString_160951027648() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term331563 = new Long(2289954139848415685L);
        term331557 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOptionEx"));
        Object term331559 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term331561 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term331577 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term331578 = newInstance(Class.forName("java.time.LocalDate"));
        Object term331582 = newInstance(Class.forName("java.time.LocalTime"));
        Object term331587 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term331588 = newInstance(Class.forName("java.time.LocalDate"));
        Object term331592 = newInstance(Class.forName("java.time.LocalTime"));
        Object term331609 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term331610 = newInstance(Class.forName("java.time.LocalDate"));
        Object term331614 = newInstance(Class.forName("java.time.LocalTime"));
        Object term331670 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term331671 = newInstance(Class.forName("java.time.LocalDate"));
        Object term331675 = newInstance(Class.forName("java.time.LocalTime"));
        Object term331718 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term331719 = newInstance(Class.forName("java.time.LocalDate"));
        Object term331723 = newInstance(Class.forName("java.time.LocalTime"));
        Object term331764 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term331765 = newInstance(Class.forName("java.time.LocalDate"));
        Object term331769 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term331557, term331557.getClass(), "id", 1379952003868337325L);
        setLongField(term331559, term331559.getClass(), "id", -7308035967659707286L);
        setLongField(term331561, term331561.getClass(), "id", -3079188602701979724L);
        setField(term331561, term331561.getClass(), "extId", term331563);
        setField(term331561, term331561.getClass(), "luid", "OGWjAZOglO");
        setIntField(term331578, term331578.getClass(), "year", 2010);
        setShortField(term331578, term331578.getClass(), "month", (short) 2);
        setShortField(term331578, term331578.getClass(), "day", (short) 19);
        setField(term331577, term331577.getClass(), "date", term331578);
        setByteField(term331582, term331582.getClass(), "hour", (byte) 23);
        setByteField(term331582, term331582.getClass(), "minute", (byte) 22);
        setByteField(term331582, term331582.getClass(), "second", (byte) 3);
        setIntField(term331582, term331582.getClass(), "nano", 464914250);
        setField(term331577, term331577.getClass(), "time", term331582);
        setField(term331561, term331561.getClass(), "registerTime", term331577);
        setIntField(term331588, term331588.getClass(), "year", 2028);
        setShortField(term331588, term331588.getClass(), "month", (short) 12);
        setShortField(term331588, term331588.getClass(), "day", (short) 8);
        setField(term331587, term331587.getClass(), "date", term331588);
        setByteField(term331592, term331592.getClass(), "hour", (byte) 23);
        setByteField(term331592, term331592.getClass(), "minute", (byte) 0);
        setByteField(term331592, term331592.getClass(), "second", (byte) 50);
        setIntField(term331592, term331592.getClass(), "nano", 607515899);
        setField(term331587, term331587.getClass(), "time", term331592);
        setField(term331561, term331561.getClass(), "accessTime", term331587);
        setField(term331559, term331559.getClass(), "card", term331561);
        setField(term331559, term331559.getClass(), "userName", "wWxdwPvBFu");
        setIntField(term331610, term331610.getClass(), "year", 2025);
        setShortField(term331610, term331610.getClass(), "month", (short) 4);
        setShortField(term331610, term331610.getClass(), "day", (short) 28);
        setField(term331609, term331609.getClass(), "date", term331610);
        setByteField(term331614, term331614.getClass(), "hour", (byte) 14);
        setByteField(term331614, term331614.getClass(), "minute", (byte) 54);
        setByteField(term331614, term331614.getClass(), "second", (byte) 19);
        setIntField(term331614, term331614.getClass(), "nano", 722676435);
        setField(term331609, term331609.getClass(), "time", term331614);
        setField(term331559, term331559.getClass(), "lastLoginDate", term331609);
        setBooleanField(term331559, term331559.getClass(), "isWebJoin", true);
        setField(term331559, term331559.getClass(), "webLimitDate", "utAzCMewid");
        setIntField(term331559, term331559.getClass(), "level", -1459746793);
        setIntField(term331559, term331559.getClass(), "reincarnationNum", -279967601);
        setField(term331559, term331559.getClass(), "exp", "IELAUsJQhq");
        setLongField(term331559, term331559.getClass(), "point", 4594249833913677901L);
        setLongField(term331559, term331559.getClass(), "totalPoint", -8011749040065963433L);
        setIntField(term331559, term331559.getClass(), "playCount", -1365630426);
        setIntField(term331559, term331559.getClass(), "multiPlayCount", 1879163737);
        setIntField(term331559, term331559.getClass(), "multiWinCount", -1375213258);
        setIntField(term331559, term331559.getClass(), "requestResCount", -580235834);
        setIntField(term331559, term331559.getClass(), "acceptResCount", 1181558786);
        setIntField(term331559, term331559.getClass(), "successResCount", -1568789746);
        setIntField(term331559, term331559.getClass(), "playerRating", -1942621984);
        setIntField(term331559, term331559.getClass(), "highestRating", -854433925);
        setIntField(term331559, term331559.getClass(), "nameplateId", -1818927728);
        setIntField(term331559, term331559.getClass(), "frameId", 653066001);
        setIntField(term331559, term331559.getClass(), "characterId", -1176620233);
        setIntField(term331559, term331559.getClass(), "trophyId", -415346336);
        setIntField(term331559, term331559.getClass(), "playedTutorialBit", -651043129);
        setIntField(term331559, term331559.getClass(), "firstTutorialCancelNum", -1070416601);
        setIntField(term331559, term331559.getClass(), "masterTutorialCancelNum", 1760447346);
        setIntField(term331559, term331559.getClass(), "totalRepertoireCount", -1931685197);
        setIntField(term331559, term331559.getClass(), "totalMapNum", -809040939);
        setLongField(term331559, term331559.getClass(), "totalHiScore", 6646239697396383164L);
        setLongField(term331559, term331559.getClass(), "totalBasicHighScore", -6302123431012645974L);
        setLongField(term331559, term331559.getClass(), "totalAdvancedHighScore", -6774894129275295131L);
        setLongField(term331559, term331559.getClass(), "totalExpertHighScore", 538680737345231926L);
        setLongField(term331559, term331559.getClass(), "totalMasterHighScore", -3323235787265392046L);
        setIntField(term331671, term331671.getClass(), "year", 2011);
        setShortField(term331671, term331671.getClass(), "month", (short) 5);
        setShortField(term331671, term331671.getClass(), "day", (short) 4);
        setField(term331670, term331670.getClass(), "date", term331671);
        setByteField(term331675, term331675.getClass(), "hour", (byte) 6);
        setByteField(term331675, term331675.getClass(), "minute", (byte) 34);
        setByteField(term331675, term331675.getClass(), "second", (byte) 5);
        setIntField(term331675, term331675.getClass(), "nano", 200152957);
        setField(term331670, term331670.getClass(), "time", term331675);
        setField(term331559, term331559.getClass(), "eventWatchedDate", term331670);
        setIntField(term331559, term331559.getClass(), "friendCount", -841536999);
        setBooleanField(term331559, term331559.getClass(), "isMaimai", false);
        setField(term331559, term331559.getClass(), "firstGameId", "ddvFjqCIzo");
        setField(term331559, term331559.getClass(), "firstRomVersion", "vLEvTfUqXL");
        setField(term331559, term331559.getClass(), "firstDataVersion", "vpXbryqFFp");
        setIntField(term331719, term331719.getClass(), "year", 2029);
        setShortField(term331719, term331719.getClass(), "month", (short) 11);
        setShortField(term331719, term331719.getClass(), "day", (short) 5);
        setField(term331718, term331718.getClass(), "date", term331719);
        setByteField(term331723, term331723.getClass(), "hour", (byte) 10);
        setByteField(term331723, term331723.getClass(), "minute", (byte) 51);
        setByteField(term331723, term331723.getClass(), "second", (byte) 38);
        setIntField(term331723, term331723.getClass(), "nano", 616017929);
        setField(term331718, term331718.getClass(), "time", term331723);
        setField(term331559, term331559.getClass(), "firstPlayDate", term331718);
        setField(term331559, term331559.getClass(), "lastGameId", "bITrIdZmIi");
        setField(term331559, term331559.getClass(), "lastRomVersion", "BybNDgOqaU");
        setField(term331559, term331559.getClass(), "lastDataVersion", "kBHetuXVIX");
        setIntField(term331765, term331765.getClass(), "year", 2026);
        setShortField(term331765, term331765.getClass(), "month", (short) 10);
        setShortField(term331765, term331765.getClass(), "day", (short) 30);
        setField(term331764, term331764.getClass(), "date", term331765);
        setByteField(term331769, term331769.getClass(), "hour", (byte) 3);
        setByteField(term331769, term331769.getClass(), "minute", (byte) 53);
        setByteField(term331769, term331769.getClass(), "second", (byte) 44);
        setIntField(term331769, term331769.getClass(), "nano", 185517044);
        setField(term331764, term331764.getClass(), "time", term331769);
        setField(term331559, term331559.getClass(), "lastPlayDate", term331764);
        setIntField(term331559, term331559.getClass(), "lastPlaceId", 1407954932);
        setField(term331559, term331559.getClass(), "lastPlaceName", "wjgkxGVWLp");
        setField(term331559, term331559.getClass(), "lastRegionId", "CGBDZPutSb");
        setField(term331559, term331559.getClass(), "lastRegionName", "zlUSnfUdoF");
        setField(term331559, term331559.getClass(), "lastAllNetId", "HdpjMQhjhR");
        setField(term331559, term331559.getClass(), "lastClientId", "YGkFfIaeGd");
        setField(term331557, term331557.getClass(), "user", term331559);
        setIntField(term331557, term331557.getClass(), "ext1", -973933888);
        setIntField(term331557, term331557.getClass(), "ext2", 1428792658);
        setIntField(term331557, term331557.getClass(), "ext3", -1972890664);
        setIntField(term331557, term331557.getClass(), "ext4", 966570906);
        setIntField(term331557, term331557.getClass(), "ext5", -785176151);
        setIntField(term331557, term331557.getClass(), "ext6", 1314779063);
        setIntField(term331557, term331557.getClass(), "ext7", -264007193);
        setIntField(term331557, term331557.getClass(), "ext8", 288344148);
        setIntField(term331557, term331557.getClass(), "ext9", 1458940265);
        setIntField(term331557, term331557.getClass(), "ext10", -1681163759);
        setIntField(term331557, term331557.getClass(), "ext11", -2045024263);
        setIntField(term331557, term331557.getClass(), "ext12", 1341904631);
        setIntField(term331557, term331557.getClass(), "ext13", -1166656746);
        setIntField(term331557, term331557.getClass(), "ext14", 940545009);
        setIntField(term331557, term331557.getClass(), "ext15", -445026599);
        setIntField(term331557, term331557.getClass(), "ext16", -1873952688);
        setIntField(term331557, term331557.getClass(), "ext17", 398208102);
        setIntField(term331557, term331557.getClass(), "ext18", 550633126);
        setIntField(term331557, term331557.getClass(), "ext19", -811128951);
        setIntField(term331557, term331557.getClass(), "ext20", 1667521403);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOptionEx");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term331557, args);
    }

};


