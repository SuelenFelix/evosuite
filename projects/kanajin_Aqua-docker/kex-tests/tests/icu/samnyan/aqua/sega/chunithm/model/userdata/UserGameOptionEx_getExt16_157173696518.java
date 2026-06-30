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

public class UserGameOptionEx_getExt16_157173696518 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term317647;

    public UserGameOptionEx_getExt16_157173696518() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term317653 = new Long(6465539339431559532L);
        term317647 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOptionEx"));
        Object term317649 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term317651 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term317667 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term317668 = newInstance(Class.forName("java.time.LocalDate"));
        Object term317672 = newInstance(Class.forName("java.time.LocalTime"));
        Object term317677 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term317678 = newInstance(Class.forName("java.time.LocalDate"));
        Object term317682 = newInstance(Class.forName("java.time.LocalTime"));
        Object term317699 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term317700 = newInstance(Class.forName("java.time.LocalDate"));
        Object term317704 = newInstance(Class.forName("java.time.LocalTime"));
        Object term317760 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term317761 = newInstance(Class.forName("java.time.LocalDate"));
        Object term317765 = newInstance(Class.forName("java.time.LocalTime"));
        Object term317808 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term317809 = newInstance(Class.forName("java.time.LocalDate"));
        Object term317813 = newInstance(Class.forName("java.time.LocalTime"));
        Object term317854 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term317855 = newInstance(Class.forName("java.time.LocalDate"));
        Object term317859 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term317647, term317647.getClass(), "id", -2366286768847765151L);
        setLongField(term317649, term317649.getClass(), "id", -5097256644226032512L);
        setLongField(term317651, term317651.getClass(), "id", -8927827038296427456L);
        setField(term317651, term317651.getClass(), "extId", term317653);
        setField(term317651, term317651.getClass(), "luid", "sgpWsdnOVL");
        setIntField(term317668, term317668.getClass(), "year", 2010);
        setShortField(term317668, term317668.getClass(), "month", (short) 8);
        setShortField(term317668, term317668.getClass(), "day", (short) 26);
        setField(term317667, term317667.getClass(), "date", term317668);
        setByteField(term317672, term317672.getClass(), "hour", (byte) 9);
        setByteField(term317672, term317672.getClass(), "minute", (byte) 58);
        setByteField(term317672, term317672.getClass(), "second", (byte) 24);
        setIntField(term317672, term317672.getClass(), "nano", 284428701);
        setField(term317667, term317667.getClass(), "time", term317672);
        setField(term317651, term317651.getClass(), "registerTime", term317667);
        setIntField(term317678, term317678.getClass(), "year", 2028);
        setShortField(term317678, term317678.getClass(), "month", (short) 2);
        setShortField(term317678, term317678.getClass(), "day", (short) 12);
        setField(term317677, term317677.getClass(), "date", term317678);
        setByteField(term317682, term317682.getClass(), "hour", (byte) 13);
        setByteField(term317682, term317682.getClass(), "minute", (byte) 53);
        setByteField(term317682, term317682.getClass(), "second", (byte) 12);
        setIntField(term317682, term317682.getClass(), "nano", 286836686);
        setField(term317677, term317677.getClass(), "time", term317682);
        setField(term317651, term317651.getClass(), "accessTime", term317677);
        setField(term317649, term317649.getClass(), "card", term317651);
        setField(term317649, term317649.getClass(), "userName", "hHyjmReKRL");
        setIntField(term317700, term317700.getClass(), "year", 2023);
        setShortField(term317700, term317700.getClass(), "month", (short) 3);
        setShortField(term317700, term317700.getClass(), "day", (short) 16);
        setField(term317699, term317699.getClass(), "date", term317700);
        setByteField(term317704, term317704.getClass(), "hour", (byte) 6);
        setByteField(term317704, term317704.getClass(), "minute", (byte) 5);
        setByteField(term317704, term317704.getClass(), "second", (byte) 37);
        setIntField(term317704, term317704.getClass(), "nano", 550736994);
        setField(term317699, term317699.getClass(), "time", term317704);
        setField(term317649, term317649.getClass(), "lastLoginDate", term317699);
        setBooleanField(term317649, term317649.getClass(), "isWebJoin", false);
        setField(term317649, term317649.getClass(), "webLimitDate", "MujDQptHTA");
        setIntField(term317649, term317649.getClass(), "level", 1203559115);
        setIntField(term317649, term317649.getClass(), "reincarnationNum", -735043039);
        setField(term317649, term317649.getClass(), "exp", "OvCJvfYBjg");
        setLongField(term317649, term317649.getClass(), "point", -409185820590411414L);
        setLongField(term317649, term317649.getClass(), "totalPoint", -5660292101720594350L);
        setIntField(term317649, term317649.getClass(), "playCount", 374592590);
        setIntField(term317649, term317649.getClass(), "multiPlayCount", -1110893653);
        setIntField(term317649, term317649.getClass(), "multiWinCount", -480361808);
        setIntField(term317649, term317649.getClass(), "requestResCount", -1011653088);
        setIntField(term317649, term317649.getClass(), "acceptResCount", 215281647);
        setIntField(term317649, term317649.getClass(), "successResCount", 1705304596);
        setIntField(term317649, term317649.getClass(), "playerRating", -1346401084);
        setIntField(term317649, term317649.getClass(), "highestRating", -1539654405);
        setIntField(term317649, term317649.getClass(), "nameplateId", 1858554469);
        setIntField(term317649, term317649.getClass(), "frameId", -1894464350);
        setIntField(term317649, term317649.getClass(), "characterId", -1711976057);
        setIntField(term317649, term317649.getClass(), "trophyId", -390494018);
        setIntField(term317649, term317649.getClass(), "playedTutorialBit", 930338389);
        setIntField(term317649, term317649.getClass(), "firstTutorialCancelNum", -1648110301);
        setIntField(term317649, term317649.getClass(), "masterTutorialCancelNum", -1092422328);
        setIntField(term317649, term317649.getClass(), "totalRepertoireCount", 1635493456);
        setIntField(term317649, term317649.getClass(), "totalMapNum", -1098683664);
        setLongField(term317649, term317649.getClass(), "totalHiScore", -8001458640699468718L);
        setLongField(term317649, term317649.getClass(), "totalBasicHighScore", -2531379667934668121L);
        setLongField(term317649, term317649.getClass(), "totalAdvancedHighScore", -8493569200291088525L);
        setLongField(term317649, term317649.getClass(), "totalExpertHighScore", -1214297584521497035L);
        setLongField(term317649, term317649.getClass(), "totalMasterHighScore", -7893939569994031367L);
        setIntField(term317761, term317761.getClass(), "year", 2020);
        setShortField(term317761, term317761.getClass(), "month", (short) 9);
        setShortField(term317761, term317761.getClass(), "day", (short) 25);
        setField(term317760, term317760.getClass(), "date", term317761);
        setByteField(term317765, term317765.getClass(), "hour", (byte) 5);
        setByteField(term317765, term317765.getClass(), "minute", (byte) 55);
        setByteField(term317765, term317765.getClass(), "second", (byte) 1);
        setIntField(term317765, term317765.getClass(), "nano", 387644591);
        setField(term317760, term317760.getClass(), "time", term317765);
        setField(term317649, term317649.getClass(), "eventWatchedDate", term317760);
        setIntField(term317649, term317649.getClass(), "friendCount", -1070840970);
        setBooleanField(term317649, term317649.getClass(), "isMaimai", true);
        setField(term317649, term317649.getClass(), "firstGameId", "iGbPhDXCXn");
        setField(term317649, term317649.getClass(), "firstRomVersion", "BIDinWjIgX");
        setField(term317649, term317649.getClass(), "firstDataVersion", "supERaTQjg");
        setIntField(term317809, term317809.getClass(), "year", 2012);
        setShortField(term317809, term317809.getClass(), "month", (short) 4);
        setShortField(term317809, term317809.getClass(), "day", (short) 22);
        setField(term317808, term317808.getClass(), "date", term317809);
        setByteField(term317813, term317813.getClass(), "hour", (byte) 13);
        setByteField(term317813, term317813.getClass(), "minute", (byte) 50);
        setByteField(term317813, term317813.getClass(), "second", (byte) 35);
        setIntField(term317813, term317813.getClass(), "nano", 382947452);
        setField(term317808, term317808.getClass(), "time", term317813);
        setField(term317649, term317649.getClass(), "firstPlayDate", term317808);
        setField(term317649, term317649.getClass(), "lastGameId", "EnJEYUwgVp");
        setField(term317649, term317649.getClass(), "lastRomVersion", "gAPDHJqyTc");
        setField(term317649, term317649.getClass(), "lastDataVersion", "WyCSZSUlnV");
        setIntField(term317855, term317855.getClass(), "year", 2027);
        setShortField(term317855, term317855.getClass(), "month", (short) 12);
        setShortField(term317855, term317855.getClass(), "day", (short) 30);
        setField(term317854, term317854.getClass(), "date", term317855);
        setByteField(term317859, term317859.getClass(), "hour", (byte) 16);
        setByteField(term317859, term317859.getClass(), "minute", (byte) 20);
        setByteField(term317859, term317859.getClass(), "second", (byte) 14);
        setIntField(term317859, term317859.getClass(), "nano", 247726403);
        setField(term317854, term317854.getClass(), "time", term317859);
        setField(term317649, term317649.getClass(), "lastPlayDate", term317854);
        setIntField(term317649, term317649.getClass(), "lastPlaceId", -1744426701);
        setField(term317649, term317649.getClass(), "lastPlaceName", "SyHjOnayQl");
        setField(term317649, term317649.getClass(), "lastRegionId", "fWkuqvVcuK");
        setField(term317649, term317649.getClass(), "lastRegionName", "iCVAQxiyxL");
        setField(term317649, term317649.getClass(), "lastAllNetId", "qacQEntxMw");
        setField(term317649, term317649.getClass(), "lastClientId", "serkapmqZh");
        setField(term317647, term317647.getClass(), "user", term317649);
        setIntField(term317647, term317647.getClass(), "ext1", -1939540947);
        setIntField(term317647, term317647.getClass(), "ext2", 1006687897);
        setIntField(term317647, term317647.getClass(), "ext3", 1751688546);
        setIntField(term317647, term317647.getClass(), "ext4", -2104821618);
        setIntField(term317647, term317647.getClass(), "ext5", 1326846039);
        setIntField(term317647, term317647.getClass(), "ext6", -1047070774);
        setIntField(term317647, term317647.getClass(), "ext7", -533633117);
        setIntField(term317647, term317647.getClass(), "ext8", 205317695);
        setIntField(term317647, term317647.getClass(), "ext9", 130711950);
        setIntField(term317647, term317647.getClass(), "ext10", 370999352);
        setIntField(term317647, term317647.getClass(), "ext11", -451429306);
        setIntField(term317647, term317647.getClass(), "ext12", -131211631);
        setIntField(term317647, term317647.getClass(), "ext13", 1582546878);
        setIntField(term317647, term317647.getClass(), "ext14", -1660860876);
        setIntField(term317647, term317647.getClass(), "ext15", -380593610);
        setIntField(term317647, term317647.getClass(), "ext16", 724828471);
        setIntField(term317647, term317647.getClass(), "ext17", -1395142728);
        setIntField(term317647, term317647.getClass(), "ext18", -783988653);
        setIntField(term317647, term317647.getClass(), "ext19", 1870111253);
        setIntField(term317647, term317647.getClass(), "ext20", -1561622640);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOptionEx");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExt16", argTypes, term317647, args);
    }

};


