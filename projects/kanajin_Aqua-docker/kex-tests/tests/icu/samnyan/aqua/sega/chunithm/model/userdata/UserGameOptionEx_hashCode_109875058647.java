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

public class UserGameOptionEx_hashCode_109875058647 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term331109;

    public UserGameOptionEx_hashCode_109875058647() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term331115 = new Long(8734518435788772658L);
        term331109 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOptionEx"));
        Object term331111 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term331113 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term331129 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term331130 = newInstance(Class.forName("java.time.LocalDate"));
        Object term331134 = newInstance(Class.forName("java.time.LocalTime"));
        Object term331139 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term331140 = newInstance(Class.forName("java.time.LocalDate"));
        Object term331144 = newInstance(Class.forName("java.time.LocalTime"));
        Object term331161 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term331162 = newInstance(Class.forName("java.time.LocalDate"));
        Object term331166 = newInstance(Class.forName("java.time.LocalTime"));
        Object term331222 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term331223 = newInstance(Class.forName("java.time.LocalDate"));
        Object term331227 = newInstance(Class.forName("java.time.LocalTime"));
        Object term331270 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term331271 = newInstance(Class.forName("java.time.LocalDate"));
        Object term331275 = newInstance(Class.forName("java.time.LocalTime"));
        Object term331316 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term331317 = newInstance(Class.forName("java.time.LocalDate"));
        Object term331321 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term331109, term331109.getClass(), "id", -1591719784370334403L);
        setLongField(term331111, term331111.getClass(), "id", 3216330630601724959L);
        setLongField(term331113, term331113.getClass(), "id", -6756414322797783883L);
        setField(term331113, term331113.getClass(), "extId", term331115);
        setField(term331113, term331113.getClass(), "luid", "rsZIFmJCSV");
        setIntField(term331130, term331130.getClass(), "year", 2022);
        setShortField(term331130, term331130.getClass(), "month", (short) 5);
        setShortField(term331130, term331130.getClass(), "day", (short) 1);
        setField(term331129, term331129.getClass(), "date", term331130);
        setByteField(term331134, term331134.getClass(), "hour", (byte) 14);
        setByteField(term331134, term331134.getClass(), "minute", (byte) 39);
        setByteField(term331134, term331134.getClass(), "second", (byte) 42);
        setIntField(term331134, term331134.getClass(), "nano", 943667421);
        setField(term331129, term331129.getClass(), "time", term331134);
        setField(term331113, term331113.getClass(), "registerTime", term331129);
        setIntField(term331140, term331140.getClass(), "year", 2028);
        setShortField(term331140, term331140.getClass(), "month", (short) 1);
        setShortField(term331140, term331140.getClass(), "day", (short) 11);
        setField(term331139, term331139.getClass(), "date", term331140);
        setByteField(term331144, term331144.getClass(), "hour", (byte) 7);
        setByteField(term331144, term331144.getClass(), "minute", (byte) 54);
        setByteField(term331144, term331144.getClass(), "second", (byte) 48);
        setIntField(term331144, term331144.getClass(), "nano", 308392579);
        setField(term331139, term331139.getClass(), "time", term331144);
        setField(term331113, term331113.getClass(), "accessTime", term331139);
        setField(term331111, term331111.getClass(), "card", term331113);
        setField(term331111, term331111.getClass(), "userName", "tGfCBlTvvA");
        setIntField(term331162, term331162.getClass(), "year", 2014);
        setShortField(term331162, term331162.getClass(), "month", (short) 11);
        setShortField(term331162, term331162.getClass(), "day", (short) 5);
        setField(term331161, term331161.getClass(), "date", term331162);
        setByteField(term331166, term331166.getClass(), "hour", (byte) 22);
        setByteField(term331166, term331166.getClass(), "minute", (byte) 9);
        setByteField(term331166, term331166.getClass(), "second", (byte) 20);
        setIntField(term331166, term331166.getClass(), "nano", 210824116);
        setField(term331161, term331161.getClass(), "time", term331166);
        setField(term331111, term331111.getClass(), "lastLoginDate", term331161);
        setBooleanField(term331111, term331111.getClass(), "isWebJoin", false);
        setField(term331111, term331111.getClass(), "webLimitDate", "XRvQvyRaeI");
        setIntField(term331111, term331111.getClass(), "level", 1591998669);
        setIntField(term331111, term331111.getClass(), "reincarnationNum", 1185146650);
        setField(term331111, term331111.getClass(), "exp", "PiiAJlvOam");
        setLongField(term331111, term331111.getClass(), "point", 3041223353818110326L);
        setLongField(term331111, term331111.getClass(), "totalPoint", -4947393274942672796L);
        setIntField(term331111, term331111.getClass(), "playCount", -600502469);
        setIntField(term331111, term331111.getClass(), "multiPlayCount", 1774474405);
        setIntField(term331111, term331111.getClass(), "multiWinCount", 1880363597);
        setIntField(term331111, term331111.getClass(), "requestResCount", 1200946519);
        setIntField(term331111, term331111.getClass(), "acceptResCount", 827079210);
        setIntField(term331111, term331111.getClass(), "successResCount", -1115939120);
        setIntField(term331111, term331111.getClass(), "playerRating", 1556641892);
        setIntField(term331111, term331111.getClass(), "highestRating", 924053222);
        setIntField(term331111, term331111.getClass(), "nameplateId", -1462072032);
        setIntField(term331111, term331111.getClass(), "frameId", 1626407929);
        setIntField(term331111, term331111.getClass(), "characterId", -495836840);
        setIntField(term331111, term331111.getClass(), "trophyId", 1403163232);
        setIntField(term331111, term331111.getClass(), "playedTutorialBit", 1582908846);
        setIntField(term331111, term331111.getClass(), "firstTutorialCancelNum", 1503497754);
        setIntField(term331111, term331111.getClass(), "masterTutorialCancelNum", -1644918935);
        setIntField(term331111, term331111.getClass(), "totalRepertoireCount", -800406163);
        setIntField(term331111, term331111.getClass(), "totalMapNum", -13006451);
        setLongField(term331111, term331111.getClass(), "totalHiScore", 2725107251661268942L);
        setLongField(term331111, term331111.getClass(), "totalBasicHighScore", 3521183508234920638L);
        setLongField(term331111, term331111.getClass(), "totalAdvancedHighScore", 8944490321421801220L);
        setLongField(term331111, term331111.getClass(), "totalExpertHighScore", -8223468232855038726L);
        setLongField(term331111, term331111.getClass(), "totalMasterHighScore", 4918693338600446333L);
        setIntField(term331223, term331223.getClass(), "year", 2024);
        setShortField(term331223, term331223.getClass(), "month", (short) 8);
        setShortField(term331223, term331223.getClass(), "day", (short) 11);
        setField(term331222, term331222.getClass(), "date", term331223);
        setByteField(term331227, term331227.getClass(), "hour", (byte) 22);
        setByteField(term331227, term331227.getClass(), "minute", (byte) 0);
        setByteField(term331227, term331227.getClass(), "second", (byte) 53);
        setIntField(term331227, term331227.getClass(), "nano", 991078766);
        setField(term331222, term331222.getClass(), "time", term331227);
        setField(term331111, term331111.getClass(), "eventWatchedDate", term331222);
        setIntField(term331111, term331111.getClass(), "friendCount", 1057337372);
        setBooleanField(term331111, term331111.getClass(), "isMaimai", true);
        setField(term331111, term331111.getClass(), "firstGameId", "siXyhYgybV");
        setField(term331111, term331111.getClass(), "firstRomVersion", "ZyNlPlXuvg");
        setField(term331111, term331111.getClass(), "firstDataVersion", "OXzFwGxUWY");
        setIntField(term331271, term331271.getClass(), "year", 2028);
        setShortField(term331271, term331271.getClass(), "month", (short) 2);
        setShortField(term331271, term331271.getClass(), "day", (short) 12);
        setField(term331270, term331270.getClass(), "date", term331271);
        setByteField(term331275, term331275.getClass(), "hour", (byte) 15);
        setByteField(term331275, term331275.getClass(), "minute", (byte) 28);
        setByteField(term331275, term331275.getClass(), "second", (byte) 24);
        setIntField(term331275, term331275.getClass(), "nano", 754979738);
        setField(term331270, term331270.getClass(), "time", term331275);
        setField(term331111, term331111.getClass(), "firstPlayDate", term331270);
        setField(term331111, term331111.getClass(), "lastGameId", "hlYhjhXVeY");
        setField(term331111, term331111.getClass(), "lastRomVersion", "njAcVNaDsK");
        setField(term331111, term331111.getClass(), "lastDataVersion", "BLAiTuvVcu");
        setIntField(term331317, term331317.getClass(), "year", 2017);
        setShortField(term331317, term331317.getClass(), "month", (short) 4);
        setShortField(term331317, term331317.getClass(), "day", (short) 21);
        setField(term331316, term331316.getClass(), "date", term331317);
        setByteField(term331321, term331321.getClass(), "hour", (byte) 23);
        setByteField(term331321, term331321.getClass(), "minute", (byte) 44);
        setByteField(term331321, term331321.getClass(), "second", (byte) 29);
        setIntField(term331321, term331321.getClass(), "nano", 822184275);
        setField(term331316, term331316.getClass(), "time", term331321);
        setField(term331111, term331111.getClass(), "lastPlayDate", term331316);
        setIntField(term331111, term331111.getClass(), "lastPlaceId", 1149945398);
        setField(term331111, term331111.getClass(), "lastPlaceName", "ULOrmjXoPg");
        setField(term331111, term331111.getClass(), "lastRegionId", "blGAwKqdqO");
        setField(term331111, term331111.getClass(), "lastRegionName", "BmJPqfZtnd");
        setField(term331111, term331111.getClass(), "lastAllNetId", "LCmMOQqvkv");
        setField(term331111, term331111.getClass(), "lastClientId", "fyjDMAuZiJ");
        setField(term331109, term331109.getClass(), "user", term331111);
        setIntField(term331109, term331109.getClass(), "ext1", -1228683179);
        setIntField(term331109, term331109.getClass(), "ext2", 1770216602);
        setIntField(term331109, term331109.getClass(), "ext3", -652403316);
        setIntField(term331109, term331109.getClass(), "ext4", -99177890);
        setIntField(term331109, term331109.getClass(), "ext5", 1381580503);
        setIntField(term331109, term331109.getClass(), "ext6", 1449095969);
        setIntField(term331109, term331109.getClass(), "ext7", 1586424206);
        setIntField(term331109, term331109.getClass(), "ext8", 1331599209);
        setIntField(term331109, term331109.getClass(), "ext9", -1291785671);
        setIntField(term331109, term331109.getClass(), "ext10", -1846188963);
        setIntField(term331109, term331109.getClass(), "ext11", -378822383);
        setIntField(term331109, term331109.getClass(), "ext12", -1683396631);
        setIntField(term331109, term331109.getClass(), "ext13", -1186369376);
        setIntField(term331109, term331109.getClass(), "ext14", 815530303);
        setIntField(term331109, term331109.getClass(), "ext15", 2137150532);
        setIntField(term331109, term331109.getClass(), "ext16", 175483868);
        setIntField(term331109, term331109.getClass(), "ext17", -878852703);
        setIntField(term331109, term331109.getClass(), "ext18", 217174894);
        setIntField(term331109, term331109.getClass(), "ext19", 1409041223);
        setIntField(term331109, term331109.getClass(), "ext20", -1174673068);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOptionEx");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term331109, args);
    }

};


