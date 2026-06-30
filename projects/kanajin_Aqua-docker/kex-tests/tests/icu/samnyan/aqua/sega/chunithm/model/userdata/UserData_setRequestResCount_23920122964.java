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

public class UserData_setRequestResCount_23920122964 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term156785;
     Object term157061;

    public UserData_setRequestResCount_23920122964() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term156789 = new Long(6073193746616629086L);
        term156785 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term156787 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term156803 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term156804 = newInstance(Class.forName("java.time.LocalDate"));
        Object term156808 = newInstance(Class.forName("java.time.LocalTime"));
        Object term156813 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term156814 = newInstance(Class.forName("java.time.LocalDate"));
        Object term156818 = newInstance(Class.forName("java.time.LocalTime"));
        Object term156835 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term156836 = newInstance(Class.forName("java.time.LocalDate"));
        Object term156840 = newInstance(Class.forName("java.time.LocalTime"));
        Object term156896 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term156897 = newInstance(Class.forName("java.time.LocalDate"));
        Object term156901 = newInstance(Class.forName("java.time.LocalTime"));
        Object term156944 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term156945 = newInstance(Class.forName("java.time.LocalDate"));
        Object term156949 = newInstance(Class.forName("java.time.LocalTime"));
        Object term156990 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term156991 = newInstance(Class.forName("java.time.LocalDate"));
        Object term156995 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term156785, term156785.getClass(), "id", 1683089019175871123L);
        setLongField(term156787, term156787.getClass(), "id", -116582168956576769L);
        setField(term156787, term156787.getClass(), "extId", term156789);
        setField(term156787, term156787.getClass(), "luid", "GQONGOQPIz");
        setIntField(term156804, term156804.getClass(), "year", 2010);
        setShortField(term156804, term156804.getClass(), "month", (short) 11);
        setShortField(term156804, term156804.getClass(), "day", (short) 4);
        setField(term156803, term156803.getClass(), "date", term156804);
        setByteField(term156808, term156808.getClass(), "hour", (byte) 17);
        setByteField(term156808, term156808.getClass(), "minute", (byte) 19);
        setByteField(term156808, term156808.getClass(), "second", (byte) 27);
        setIntField(term156808, term156808.getClass(), "nano", 857048890);
        setField(term156803, term156803.getClass(), "time", term156808);
        setField(term156787, term156787.getClass(), "registerTime", term156803);
        setIntField(term156814, term156814.getClass(), "year", 2020);
        setShortField(term156814, term156814.getClass(), "month", (short) 6);
        setShortField(term156814, term156814.getClass(), "day", (short) 11);
        setField(term156813, term156813.getClass(), "date", term156814);
        setByteField(term156818, term156818.getClass(), "hour", (byte) 8);
        setByteField(term156818, term156818.getClass(), "minute", (byte) 23);
        setByteField(term156818, term156818.getClass(), "second", (byte) 31);
        setIntField(term156818, term156818.getClass(), "nano", 945590067);
        setField(term156813, term156813.getClass(), "time", term156818);
        setField(term156787, term156787.getClass(), "accessTime", term156813);
        setField(term156785, term156785.getClass(), "card", term156787);
        setField(term156785, term156785.getClass(), "userName", "IjWJbokDwC");
        setIntField(term156836, term156836.getClass(), "year", 2020);
        setShortField(term156836, term156836.getClass(), "month", (short) 6);
        setShortField(term156836, term156836.getClass(), "day", (short) 27);
        setField(term156835, term156835.getClass(), "date", term156836);
        setByteField(term156840, term156840.getClass(), "hour", (byte) 3);
        setByteField(term156840, term156840.getClass(), "minute", (byte) 31);
        setByteField(term156840, term156840.getClass(), "second", (byte) 13);
        setIntField(term156840, term156840.getClass(), "nano", 455632441);
        setField(term156835, term156835.getClass(), "time", term156840);
        setField(term156785, term156785.getClass(), "lastLoginDate", term156835);
        setBooleanField(term156785, term156785.getClass(), "isWebJoin", false);
        setField(term156785, term156785.getClass(), "webLimitDate", "CgjnSgLArx");
        setIntField(term156785, term156785.getClass(), "level", 1713974544);
        setIntField(term156785, term156785.getClass(), "reincarnationNum", 1347754720);
        setField(term156785, term156785.getClass(), "exp", "VDsGrlxIKZ");
        setLongField(term156785, term156785.getClass(), "point", -3371877100400482630L);
        setLongField(term156785, term156785.getClass(), "totalPoint", 3994546230408844547L);
        setIntField(term156785, term156785.getClass(), "playCount", -1244357131);
        setIntField(term156785, term156785.getClass(), "multiPlayCount", -1253293420);
        setIntField(term156785, term156785.getClass(), "multiWinCount", -1372607343);
        setIntField(term156785, term156785.getClass(), "requestResCount", -1259276992);
        setIntField(term156785, term156785.getClass(), "acceptResCount", -1544616625);
        setIntField(term156785, term156785.getClass(), "successResCount", -1541499013);
        setIntField(term156785, term156785.getClass(), "playerRating", -1553107114);
        setIntField(term156785, term156785.getClass(), "highestRating", -1215527230);
        setIntField(term156785, term156785.getClass(), "nameplateId", 2122251083);
        setIntField(term156785, term156785.getClass(), "frameId", 69182156);
        setIntField(term156785, term156785.getClass(), "characterId", -90311637);
        setIntField(term156785, term156785.getClass(), "trophyId", -1830483575);
        setIntField(term156785, term156785.getClass(), "playedTutorialBit", 666844768);
        setIntField(term156785, term156785.getClass(), "firstTutorialCancelNum", 592251593);
        setIntField(term156785, term156785.getClass(), "masterTutorialCancelNum", -201367159);
        setIntField(term156785, term156785.getClass(), "totalRepertoireCount", 1825158106);
        setIntField(term156785, term156785.getClass(), "totalMapNum", 52007815);
        setLongField(term156785, term156785.getClass(), "totalHiScore", 1481162221525502572L);
        setLongField(term156785, term156785.getClass(), "totalBasicHighScore", 7397544487121976299L);
        setLongField(term156785, term156785.getClass(), "totalAdvancedHighScore", -1979212149451637717L);
        setLongField(term156785, term156785.getClass(), "totalExpertHighScore", 7118890039290414390L);
        setLongField(term156785, term156785.getClass(), "totalMasterHighScore", 3568278118244677868L);
        setIntField(term156897, term156897.getClass(), "year", 2017);
        setShortField(term156897, term156897.getClass(), "month", (short) 4);
        setShortField(term156897, term156897.getClass(), "day", (short) 15);
        setField(term156896, term156896.getClass(), "date", term156897);
        setByteField(term156901, term156901.getClass(), "hour", (byte) 3);
        setByteField(term156901, term156901.getClass(), "minute", (byte) 36);
        setByteField(term156901, term156901.getClass(), "second", (byte) 59);
        setIntField(term156901, term156901.getClass(), "nano", 297280667);
        setField(term156896, term156896.getClass(), "time", term156901);
        setField(term156785, term156785.getClass(), "eventWatchedDate", term156896);
        setIntField(term156785, term156785.getClass(), "friendCount", -1005174618);
        setBooleanField(term156785, term156785.getClass(), "isMaimai", false);
        setField(term156785, term156785.getClass(), "firstGameId", "WWdkxUzoEC");
        setField(term156785, term156785.getClass(), "firstRomVersion", "rnkaCxMcIX");
        setField(term156785, term156785.getClass(), "firstDataVersion", "EFZQPeNhLf");
        setIntField(term156945, term156945.getClass(), "year", 2013);
        setShortField(term156945, term156945.getClass(), "month", (short) 12);
        setShortField(term156945, term156945.getClass(), "day", (short) 27);
        setField(term156944, term156944.getClass(), "date", term156945);
        setByteField(term156949, term156949.getClass(), "hour", (byte) 5);
        setByteField(term156949, term156949.getClass(), "minute", (byte) 24);
        setByteField(term156949, term156949.getClass(), "second", (byte) 57);
        setIntField(term156949, term156949.getClass(), "nano", 526059211);
        setField(term156944, term156944.getClass(), "time", term156949);
        setField(term156785, term156785.getClass(), "firstPlayDate", term156944);
        setField(term156785, term156785.getClass(), "lastGameId", "XEJckhziWa");
        setField(term156785, term156785.getClass(), "lastRomVersion", "rnwvPkpKVX");
        setField(term156785, term156785.getClass(), "lastDataVersion", "BxSVyceqSm");
        setIntField(term156991, term156991.getClass(), "year", 2014);
        setShortField(term156991, term156991.getClass(), "month", (short) 11);
        setShortField(term156991, term156991.getClass(), "day", (short) 26);
        setField(term156990, term156990.getClass(), "date", term156991);
        setByteField(term156995, term156995.getClass(), "hour", (byte) 13);
        setByteField(term156995, term156995.getClass(), "minute", (byte) 43);
        setByteField(term156995, term156995.getClass(), "second", (byte) 29);
        setIntField(term156995, term156995.getClass(), "nano", 924236846);
        setField(term156990, term156990.getClass(), "time", term156995);
        setField(term156785, term156785.getClass(), "lastPlayDate", term156990);
        setIntField(term156785, term156785.getClass(), "lastPlaceId", -1473069102);
        setField(term156785, term156785.getClass(), "lastPlaceName", "wMPExrcpuS");
        setField(term156785, term156785.getClass(), "lastRegionId", "OarbTBiJae");
        setField(term156785, term156785.getClass(), "lastRegionName", "mXZKaytExY");
        setField(term156785, term156785.getClass(), "lastAllNetId", "YePrhNqEVB");
        setField(term156785, term156785.getClass(), "lastClientId", "ItBnSfBOeK");
        term157061 = new Integer(748392208);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term157061;
        callMethod(klass, "setRequestResCount", argTypes, term156785, args);
    }

};


