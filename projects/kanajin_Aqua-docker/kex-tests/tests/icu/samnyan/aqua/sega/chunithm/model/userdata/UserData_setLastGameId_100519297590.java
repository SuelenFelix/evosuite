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

public class UserData_setLastGameId_100519297590 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term167989;

    public UserData_setLastGameId_100519297590() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term167993 = new Long(-1164342036939643746L);
        term167989 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term167991 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term168007 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term168008 = newInstance(Class.forName("java.time.LocalDate"));
        Object term168012 = newInstance(Class.forName("java.time.LocalTime"));
        Object term168017 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term168018 = newInstance(Class.forName("java.time.LocalDate"));
        Object term168022 = newInstance(Class.forName("java.time.LocalTime"));
        Object term168039 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term168040 = newInstance(Class.forName("java.time.LocalDate"));
        Object term168044 = newInstance(Class.forName("java.time.LocalTime"));
        Object term168100 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term168101 = newInstance(Class.forName("java.time.LocalDate"));
        Object term168105 = newInstance(Class.forName("java.time.LocalTime"));
        Object term168148 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term168149 = newInstance(Class.forName("java.time.LocalDate"));
        Object term168153 = newInstance(Class.forName("java.time.LocalTime"));
        Object term168194 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term168195 = newInstance(Class.forName("java.time.LocalDate"));
        Object term168199 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term167989, term167989.getClass(), "id", -4598924338147045508L);
        setLongField(term167991, term167991.getClass(), "id", -7798512476724848724L);
        setField(term167991, term167991.getClass(), "extId", term167993);
        setField(term167991, term167991.getClass(), "luid", "horZwJhkMz");
        setIntField(term168008, term168008.getClass(), "year", 2019);
        setShortField(term168008, term168008.getClass(), "month", (short) 7);
        setShortField(term168008, term168008.getClass(), "day", (short) 20);
        setField(term168007, term168007.getClass(), "date", term168008);
        setByteField(term168012, term168012.getClass(), "hour", (byte) 16);
        setByteField(term168012, term168012.getClass(), "minute", (byte) 10);
        setByteField(term168012, term168012.getClass(), "second", (byte) 42);
        setIntField(term168012, term168012.getClass(), "nano", 369721755);
        setField(term168007, term168007.getClass(), "time", term168012);
        setField(term167991, term167991.getClass(), "registerTime", term168007);
        setIntField(term168018, term168018.getClass(), "year", 2024);
        setShortField(term168018, term168018.getClass(), "month", (short) 12);
        setShortField(term168018, term168018.getClass(), "day", (short) 20);
        setField(term168017, term168017.getClass(), "date", term168018);
        setByteField(term168022, term168022.getClass(), "hour", (byte) 14);
        setByteField(term168022, term168022.getClass(), "minute", (byte) 15);
        setByteField(term168022, term168022.getClass(), "second", (byte) 33);
        setIntField(term168022, term168022.getClass(), "nano", 371933777);
        setField(term168017, term168017.getClass(), "time", term168022);
        setField(term167991, term167991.getClass(), "accessTime", term168017);
        setField(term167989, term167989.getClass(), "card", term167991);
        setField(term167989, term167989.getClass(), "userName", "arxpTGARuO");
        setIntField(term168040, term168040.getClass(), "year", 2012);
        setShortField(term168040, term168040.getClass(), "month", (short) 9);
        setShortField(term168040, term168040.getClass(), "day", (short) 29);
        setField(term168039, term168039.getClass(), "date", term168040);
        setByteField(term168044, term168044.getClass(), "hour", (byte) 7);
        setByteField(term168044, term168044.getClass(), "minute", (byte) 37);
        setByteField(term168044, term168044.getClass(), "second", (byte) 21);
        setIntField(term168044, term168044.getClass(), "nano", 859184248);
        setField(term168039, term168039.getClass(), "time", term168044);
        setField(term167989, term167989.getClass(), "lastLoginDate", term168039);
        setBooleanField(term167989, term167989.getClass(), "isWebJoin", false);
        setField(term167989, term167989.getClass(), "webLimitDate", "WJTTZvfEje");
        setIntField(term167989, term167989.getClass(), "level", 766783102);
        setIntField(term167989, term167989.getClass(), "reincarnationNum", 1928797954);
        setField(term167989, term167989.getClass(), "exp", "JcubNxEOPJ");
        setLongField(term167989, term167989.getClass(), "point", -6636305539248410003L);
        setLongField(term167989, term167989.getClass(), "totalPoint", -8306549483888831076L);
        setIntField(term167989, term167989.getClass(), "playCount", 2101488953);
        setIntField(term167989, term167989.getClass(), "multiPlayCount", 471223135);
        setIntField(term167989, term167989.getClass(), "multiWinCount", 1896542364);
        setIntField(term167989, term167989.getClass(), "requestResCount", -1056985553);
        setIntField(term167989, term167989.getClass(), "acceptResCount", 838641171);
        setIntField(term167989, term167989.getClass(), "successResCount", -1468936780);
        setIntField(term167989, term167989.getClass(), "playerRating", 64970847);
        setIntField(term167989, term167989.getClass(), "highestRating", 1468120818);
        setIntField(term167989, term167989.getClass(), "nameplateId", -575994877);
        setIntField(term167989, term167989.getClass(), "frameId", -1798428742);
        setIntField(term167989, term167989.getClass(), "characterId", 204314649);
        setIntField(term167989, term167989.getClass(), "trophyId", 758889924);
        setIntField(term167989, term167989.getClass(), "playedTutorialBit", -579422575);
        setIntField(term167989, term167989.getClass(), "firstTutorialCancelNum", 223876386);
        setIntField(term167989, term167989.getClass(), "masterTutorialCancelNum", 87499307);
        setIntField(term167989, term167989.getClass(), "totalRepertoireCount", 762125008);
        setIntField(term167989, term167989.getClass(), "totalMapNum", -828578391);
        setLongField(term167989, term167989.getClass(), "totalHiScore", 3001030288522197031L);
        setLongField(term167989, term167989.getClass(), "totalBasicHighScore", -8936504960030242824L);
        setLongField(term167989, term167989.getClass(), "totalAdvancedHighScore", -4291328560280156992L);
        setLongField(term167989, term167989.getClass(), "totalExpertHighScore", -1163727825723957648L);
        setLongField(term167989, term167989.getClass(), "totalMasterHighScore", 8220792944351089814L);
        setIntField(term168101, term168101.getClass(), "year", 2020);
        setShortField(term168101, term168101.getClass(), "month", (short) 10);
        setShortField(term168101, term168101.getClass(), "day", (short) 6);
        setField(term168100, term168100.getClass(), "date", term168101);
        setByteField(term168105, term168105.getClass(), "hour", (byte) 1);
        setByteField(term168105, term168105.getClass(), "minute", (byte) 14);
        setByteField(term168105, term168105.getClass(), "second", (byte) 32);
        setIntField(term168105, term168105.getClass(), "nano", 351007322);
        setField(term168100, term168100.getClass(), "time", term168105);
        setField(term167989, term167989.getClass(), "eventWatchedDate", term168100);
        setIntField(term167989, term167989.getClass(), "friendCount", 1227082809);
        setBooleanField(term167989, term167989.getClass(), "isMaimai", false);
        setField(term167989, term167989.getClass(), "firstGameId", "DZwNgsnbSX");
        setField(term167989, term167989.getClass(), "firstRomVersion", "rEnEFWzeqA");
        setField(term167989, term167989.getClass(), "firstDataVersion", "hanonyiyFw");
        setIntField(term168149, term168149.getClass(), "year", 2014);
        setShortField(term168149, term168149.getClass(), "month", (short) 8);
        setShortField(term168149, term168149.getClass(), "day", (short) 10);
        setField(term168148, term168148.getClass(), "date", term168149);
        setByteField(term168153, term168153.getClass(), "hour", (byte) 7);
        setByteField(term168153, term168153.getClass(), "minute", (byte) 46);
        setByteField(term168153, term168153.getClass(), "second", (byte) 28);
        setIntField(term168153, term168153.getClass(), "nano", 983927961);
        setField(term168148, term168148.getClass(), "time", term168153);
        setField(term167989, term167989.getClass(), "firstPlayDate", term168148);
        setField(term167989, term167989.getClass(), "lastGameId", "lDCUhJvbkD");
        setField(term167989, term167989.getClass(), "lastRomVersion", "ifINvZYshC");
        setField(term167989, term167989.getClass(), "lastDataVersion", "acUFFUizDE");
        setIntField(term168195, term168195.getClass(), "year", 2012);
        setShortField(term168195, term168195.getClass(), "month", (short) 2);
        setShortField(term168195, term168195.getClass(), "day", (short) 3);
        setField(term168194, term168194.getClass(), "date", term168195);
        setByteField(term168199, term168199.getClass(), "hour", (byte) 7);
        setByteField(term168199, term168199.getClass(), "minute", (byte) 24);
        setByteField(term168199, term168199.getClass(), "second", (byte) 15);
        setIntField(term168199, term168199.getClass(), "nano", 123046695);
        setField(term168194, term168194.getClass(), "time", term168199);
        setField(term167989, term167989.getClass(), "lastPlayDate", term168194);
        setIntField(term167989, term167989.getClass(), "lastPlaceId", -830464254);
        setField(term167989, term167989.getClass(), "lastPlaceName", "VRnGGrsjgH");
        setField(term167989, term167989.getClass(), "lastRegionId", "rYzEwQHkaO");
        setField(term167989, term167989.getClass(), "lastRegionName", "kVqQcPdrWQ");
        setField(term167989, term167989.getClass(), "lastAllNetId", "jmaWVrOPqd");
        setField(term167989, term167989.getClass(), "lastClientId", "ELKzlCkmvl");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "eauSDrBART";
        callMethod(klass, "setLastGameId", argTypes, term167989, args);
    }

};


