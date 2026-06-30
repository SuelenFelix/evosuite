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

public class UserData_setLastPlaceId_144296149994 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term169769;
     Object term170045;

    public UserData_setLastPlaceId_144296149994() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term169773 = new Long(-7001094993638840490L);
        term169769 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term169771 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term169787 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term169788 = newInstance(Class.forName("java.time.LocalDate"));
        Object term169792 = newInstance(Class.forName("java.time.LocalTime"));
        Object term169797 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term169798 = newInstance(Class.forName("java.time.LocalDate"));
        Object term169802 = newInstance(Class.forName("java.time.LocalTime"));
        Object term169819 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term169820 = newInstance(Class.forName("java.time.LocalDate"));
        Object term169824 = newInstance(Class.forName("java.time.LocalTime"));
        Object term169880 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term169881 = newInstance(Class.forName("java.time.LocalDate"));
        Object term169885 = newInstance(Class.forName("java.time.LocalTime"));
        Object term169928 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term169929 = newInstance(Class.forName("java.time.LocalDate"));
        Object term169933 = newInstance(Class.forName("java.time.LocalTime"));
        Object term169974 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term169975 = newInstance(Class.forName("java.time.LocalDate"));
        Object term169979 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term169769, term169769.getClass(), "id", 6996026879949446195L);
        setLongField(term169771, term169771.getClass(), "id", -4777127728733378629L);
        setField(term169771, term169771.getClass(), "extId", term169773);
        setField(term169771, term169771.getClass(), "luid", "UqemyfWxle");
        setIntField(term169788, term169788.getClass(), "year", 2022);
        setShortField(term169788, term169788.getClass(), "month", (short) 12);
        setShortField(term169788, term169788.getClass(), "day", (short) 13);
        setField(term169787, term169787.getClass(), "date", term169788);
        setByteField(term169792, term169792.getClass(), "hour", (byte) 9);
        setByteField(term169792, term169792.getClass(), "minute", (byte) 47);
        setByteField(term169792, term169792.getClass(), "second", (byte) 45);
        setIntField(term169792, term169792.getClass(), "nano", 82408104);
        setField(term169787, term169787.getClass(), "time", term169792);
        setField(term169771, term169771.getClass(), "registerTime", term169787);
        setIntField(term169798, term169798.getClass(), "year", 2019);
        setShortField(term169798, term169798.getClass(), "month", (short) 1);
        setShortField(term169798, term169798.getClass(), "day", (short) 3);
        setField(term169797, term169797.getClass(), "date", term169798);
        setByteField(term169802, term169802.getClass(), "hour", (byte) 6);
        setByteField(term169802, term169802.getClass(), "minute", (byte) 55);
        setByteField(term169802, term169802.getClass(), "second", (byte) 44);
        setIntField(term169802, term169802.getClass(), "nano", 230258512);
        setField(term169797, term169797.getClass(), "time", term169802);
        setField(term169771, term169771.getClass(), "accessTime", term169797);
        setField(term169769, term169769.getClass(), "card", term169771);
        setField(term169769, term169769.getClass(), "userName", "nhoRGmIXDW");
        setIntField(term169820, term169820.getClass(), "year", 2024);
        setShortField(term169820, term169820.getClass(), "month", (short) 4);
        setShortField(term169820, term169820.getClass(), "day", (short) 9);
        setField(term169819, term169819.getClass(), "date", term169820);
        setByteField(term169824, term169824.getClass(), "hour", (byte) 15);
        setByteField(term169824, term169824.getClass(), "minute", (byte) 34);
        setByteField(term169824, term169824.getClass(), "second", (byte) 14);
        setIntField(term169824, term169824.getClass(), "nano", 920411048);
        setField(term169819, term169819.getClass(), "time", term169824);
        setField(term169769, term169769.getClass(), "lastLoginDate", term169819);
        setBooleanField(term169769, term169769.getClass(), "isWebJoin", true);
        setField(term169769, term169769.getClass(), "webLimitDate", "jlNEkpWcyV");
        setIntField(term169769, term169769.getClass(), "level", -1987064146);
        setIntField(term169769, term169769.getClass(), "reincarnationNum", 184016080);
        setField(term169769, term169769.getClass(), "exp", "FKSbPLBPmr");
        setLongField(term169769, term169769.getClass(), "point", 7337740023273342727L);
        setLongField(term169769, term169769.getClass(), "totalPoint", 5100914994140818113L);
        setIntField(term169769, term169769.getClass(), "playCount", -2083206845);
        setIntField(term169769, term169769.getClass(), "multiPlayCount", -1045178381);
        setIntField(term169769, term169769.getClass(), "multiWinCount", -1427049200);
        setIntField(term169769, term169769.getClass(), "requestResCount", -911265650);
        setIntField(term169769, term169769.getClass(), "acceptResCount", 218864889);
        setIntField(term169769, term169769.getClass(), "successResCount", -1988994618);
        setIntField(term169769, term169769.getClass(), "playerRating", 1551865443);
        setIntField(term169769, term169769.getClass(), "highestRating", -1883739433);
        setIntField(term169769, term169769.getClass(), "nameplateId", -492305893);
        setIntField(term169769, term169769.getClass(), "frameId", -1969736424);
        setIntField(term169769, term169769.getClass(), "characterId", 1464895284);
        setIntField(term169769, term169769.getClass(), "trophyId", 1538680141);
        setIntField(term169769, term169769.getClass(), "playedTutorialBit", -506059418);
        setIntField(term169769, term169769.getClass(), "firstTutorialCancelNum", -1577159884);
        setIntField(term169769, term169769.getClass(), "masterTutorialCancelNum", -863958105);
        setIntField(term169769, term169769.getClass(), "totalRepertoireCount", 622092405);
        setIntField(term169769, term169769.getClass(), "totalMapNum", -1454644959);
        setLongField(term169769, term169769.getClass(), "totalHiScore", 1399778523078780919L);
        setLongField(term169769, term169769.getClass(), "totalBasicHighScore", -8298604862992870049L);
        setLongField(term169769, term169769.getClass(), "totalAdvancedHighScore", 8745188247028469647L);
        setLongField(term169769, term169769.getClass(), "totalExpertHighScore", -1981865007955337201L);
        setLongField(term169769, term169769.getClass(), "totalMasterHighScore", 3725162199751207272L);
        setIntField(term169881, term169881.getClass(), "year", 2015);
        setShortField(term169881, term169881.getClass(), "month", (short) 7);
        setShortField(term169881, term169881.getClass(), "day", (short) 25);
        setField(term169880, term169880.getClass(), "date", term169881);
        setByteField(term169885, term169885.getClass(), "hour", (byte) 1);
        setByteField(term169885, term169885.getClass(), "minute", (byte) 9);
        setByteField(term169885, term169885.getClass(), "second", (byte) 32);
        setIntField(term169885, term169885.getClass(), "nano", 608435522);
        setField(term169880, term169880.getClass(), "time", term169885);
        setField(term169769, term169769.getClass(), "eventWatchedDate", term169880);
        setIntField(term169769, term169769.getClass(), "friendCount", 101535830);
        setBooleanField(term169769, term169769.getClass(), "isMaimai", false);
        setField(term169769, term169769.getClass(), "firstGameId", "LCslPgYXVZ");
        setField(term169769, term169769.getClass(), "firstRomVersion", "qOrFOOrfRo");
        setField(term169769, term169769.getClass(), "firstDataVersion", "QubZHCpfda");
        setIntField(term169929, term169929.getClass(), "year", 2014);
        setShortField(term169929, term169929.getClass(), "month", (short) 2);
        setShortField(term169929, term169929.getClass(), "day", (short) 28);
        setField(term169928, term169928.getClass(), "date", term169929);
        setByteField(term169933, term169933.getClass(), "hour", (byte) 14);
        setByteField(term169933, term169933.getClass(), "minute", (byte) 58);
        setByteField(term169933, term169933.getClass(), "second", (byte) 43);
        setIntField(term169933, term169933.getClass(), "nano", 161539921);
        setField(term169928, term169928.getClass(), "time", term169933);
        setField(term169769, term169769.getClass(), "firstPlayDate", term169928);
        setField(term169769, term169769.getClass(), "lastGameId", "OKkmdNRQTI");
        setField(term169769, term169769.getClass(), "lastRomVersion", "mMCbEcTRXT");
        setField(term169769, term169769.getClass(), "lastDataVersion", "EdRaWmJlWR");
        setIntField(term169975, term169975.getClass(), "year", 2028);
        setShortField(term169975, term169975.getClass(), "month", (short) 11);
        setShortField(term169975, term169975.getClass(), "day", (short) 15);
        setField(term169974, term169974.getClass(), "date", term169975);
        setByteField(term169979, term169979.getClass(), "hour", (byte) 21);
        setByteField(term169979, term169979.getClass(), "minute", (byte) 12);
        setByteField(term169979, term169979.getClass(), "second", (byte) 3);
        setIntField(term169979, term169979.getClass(), "nano", 248553082);
        setField(term169974, term169974.getClass(), "time", term169979);
        setField(term169769, term169769.getClass(), "lastPlayDate", term169974);
        setIntField(term169769, term169769.getClass(), "lastPlaceId", 1139143083);
        setField(term169769, term169769.getClass(), "lastPlaceName", "idXxJetlwQ");
        setField(term169769, term169769.getClass(), "lastRegionId", "lNzXOjpomI");
        setField(term169769, term169769.getClass(), "lastRegionName", "NtxsTEMAqr");
        setField(term169769, term169769.getClass(), "lastAllNetId", "KyvbiyMmMH");
        setField(term169769, term169769.getClass(), "lastClientId", "QNdmVEKMEm");
        term170045 = new Integer(1041163234);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term170045;
        callMethod(klass, "setLastPlaceId", argTypes, term169769, args);
    }

};


