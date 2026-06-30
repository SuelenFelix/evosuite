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

public class UserCourse_getCourseId_4129178025 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1915808;

    public UserCourse_getCourseId_4129178025() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1915814 = new Long(8860147662823251488L);
        term1915808 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCourse"));
        Object term1915810 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term1915812 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term1915828 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1915829 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1915833 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1915838 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1915839 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1915843 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1915860 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1915861 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1915865 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1915921 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1915922 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1915926 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1915969 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1915970 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1915974 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1916015 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1916016 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1916020 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1916095 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1916096 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1916100 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term1915808, term1915808.getClass(), "id", 5551579436191913073L);
        setLongField(term1915810, term1915810.getClass(), "id", 7167816998119424651L);
        setLongField(term1915812, term1915812.getClass(), "id", 2143646587024286781L);
        setField(term1915812, term1915812.getClass(), "extId", term1915814);
        setField(term1915812, term1915812.getClass(), "luid", "rBvahFRvVP");
        setIntField(term1915829, term1915829.getClass(), "year", 2010);
        setShortField(term1915829, term1915829.getClass(), "month", (short) 9);
        setShortField(term1915829, term1915829.getClass(), "day", (short) 23);
        setField(term1915828, term1915828.getClass(), "date", term1915829);
        setByteField(term1915833, term1915833.getClass(), "hour", (byte) 17);
        setByteField(term1915833, term1915833.getClass(), "minute", (byte) 0);
        setByteField(term1915833, term1915833.getClass(), "second", (byte) 33);
        setIntField(term1915833, term1915833.getClass(), "nano", 550894112);
        setField(term1915828, term1915828.getClass(), "time", term1915833);
        setField(term1915812, term1915812.getClass(), "registerTime", term1915828);
        setIntField(term1915839, term1915839.getClass(), "year", 2020);
        setShortField(term1915839, term1915839.getClass(), "month", (short) 1);
        setShortField(term1915839, term1915839.getClass(), "day", (short) 5);
        setField(term1915838, term1915838.getClass(), "date", term1915839);
        setByteField(term1915843, term1915843.getClass(), "hour", (byte) 3);
        setByteField(term1915843, term1915843.getClass(), "minute", (byte) 10);
        setByteField(term1915843, term1915843.getClass(), "second", (byte) 5);
        setIntField(term1915843, term1915843.getClass(), "nano", 503617777);
        setField(term1915838, term1915838.getClass(), "time", term1915843);
        setField(term1915812, term1915812.getClass(), "accessTime", term1915838);
        setField(term1915810, term1915810.getClass(), "card", term1915812);
        setField(term1915810, term1915810.getClass(), "userName", "ZbuZkEWJny");
        setIntField(term1915861, term1915861.getClass(), "year", 2027);
        setShortField(term1915861, term1915861.getClass(), "month", (short) 10);
        setShortField(term1915861, term1915861.getClass(), "day", (short) 27);
        setField(term1915860, term1915860.getClass(), "date", term1915861);
        setByteField(term1915865, term1915865.getClass(), "hour", (byte) 22);
        setByteField(term1915865, term1915865.getClass(), "minute", (byte) 0);
        setByteField(term1915865, term1915865.getClass(), "second", (byte) 25);
        setIntField(term1915865, term1915865.getClass(), "nano", 233395504);
        setField(term1915860, term1915860.getClass(), "time", term1915865);
        setField(term1915810, term1915810.getClass(), "lastLoginDate", term1915860);
        setBooleanField(term1915810, term1915810.getClass(), "isWebJoin", false);
        setField(term1915810, term1915810.getClass(), "webLimitDate", "XCnDMAhbUi");
        setIntField(term1915810, term1915810.getClass(), "level", -265274159);
        setIntField(term1915810, term1915810.getClass(), "reincarnationNum", -1732113643);
        setField(term1915810, term1915810.getClass(), "exp", "fYSBNfxJMr");
        setLongField(term1915810, term1915810.getClass(), "point", 8853643527846644317L);
        setLongField(term1915810, term1915810.getClass(), "totalPoint", -1874599442772270393L);
        setIntField(term1915810, term1915810.getClass(), "playCount", 188805410);
        setIntField(term1915810, term1915810.getClass(), "multiPlayCount", -1153385355);
        setIntField(term1915810, term1915810.getClass(), "multiWinCount", 280440687);
        setIntField(term1915810, term1915810.getClass(), "requestResCount", -968698931);
        setIntField(term1915810, term1915810.getClass(), "acceptResCount", -1625950224);
        setIntField(term1915810, term1915810.getClass(), "successResCount", -1655920833);
        setIntField(term1915810, term1915810.getClass(), "playerRating", 1916669417);
        setIntField(term1915810, term1915810.getClass(), "highestRating", 1958311889);
        setIntField(term1915810, term1915810.getClass(), "nameplateId", -68605078);
        setIntField(term1915810, term1915810.getClass(), "frameId", -749768572);
        setIntField(term1915810, term1915810.getClass(), "characterId", -982280220);
        setIntField(term1915810, term1915810.getClass(), "trophyId", -59382483);
        setIntField(term1915810, term1915810.getClass(), "playedTutorialBit", -1157032166);
        setIntField(term1915810, term1915810.getClass(), "firstTutorialCancelNum", -1403666838);
        setIntField(term1915810, term1915810.getClass(), "masterTutorialCancelNum", -2124158993);
        setIntField(term1915810, term1915810.getClass(), "totalRepertoireCount", 1051276589);
        setIntField(term1915810, term1915810.getClass(), "totalMapNum", 1148434206);
        setLongField(term1915810, term1915810.getClass(), "totalHiScore", 2978501450550492583L);
        setLongField(term1915810, term1915810.getClass(), "totalBasicHighScore", 2776766884895782957L);
        setLongField(term1915810, term1915810.getClass(), "totalAdvancedHighScore", 7818849074293327356L);
        setLongField(term1915810, term1915810.getClass(), "totalExpertHighScore", 6861122659581637912L);
        setLongField(term1915810, term1915810.getClass(), "totalMasterHighScore", -7956717272235928540L);
        setIntField(term1915922, term1915922.getClass(), "year", 2024);
        setShortField(term1915922, term1915922.getClass(), "month", (short) 2);
        setShortField(term1915922, term1915922.getClass(), "day", (short) 13);
        setField(term1915921, term1915921.getClass(), "date", term1915922);
        setByteField(term1915926, term1915926.getClass(), "hour", (byte) 20);
        setByteField(term1915926, term1915926.getClass(), "minute", (byte) 30);
        setByteField(term1915926, term1915926.getClass(), "second", (byte) 3);
        setIntField(term1915926, term1915926.getClass(), "nano", 477417195);
        setField(term1915921, term1915921.getClass(), "time", term1915926);
        setField(term1915810, term1915810.getClass(), "eventWatchedDate", term1915921);
        setIntField(term1915810, term1915810.getClass(), "friendCount", -1351657548);
        setBooleanField(term1915810, term1915810.getClass(), "isMaimai", true);
        setField(term1915810, term1915810.getClass(), "firstGameId", "SDNDgKBYII");
        setField(term1915810, term1915810.getClass(), "firstRomVersion", "QFvmUOCIeJ");
        setField(term1915810, term1915810.getClass(), "firstDataVersion", "RupbfwPAOt");
        setIntField(term1915970, term1915970.getClass(), "year", 2028);
        setShortField(term1915970, term1915970.getClass(), "month", (short) 8);
        setShortField(term1915970, term1915970.getClass(), "day", (short) 1);
        setField(term1915969, term1915969.getClass(), "date", term1915970);
        setByteField(term1915974, term1915974.getClass(), "hour", (byte) 3);
        setByteField(term1915974, term1915974.getClass(), "minute", (byte) 49);
        setByteField(term1915974, term1915974.getClass(), "second", (byte) 40);
        setIntField(term1915974, term1915974.getClass(), "nano", 243253786);
        setField(term1915969, term1915969.getClass(), "time", term1915974);
        setField(term1915810, term1915810.getClass(), "firstPlayDate", term1915969);
        setField(term1915810, term1915810.getClass(), "lastGameId", "UeKEoYZYdQ");
        setField(term1915810, term1915810.getClass(), "lastRomVersion", "PVvFbglTKX");
        setField(term1915810, term1915810.getClass(), "lastDataVersion", "isWDcRsvcQ");
        setIntField(term1916016, term1916016.getClass(), "year", 2029);
        setShortField(term1916016, term1916016.getClass(), "month", (short) 4);
        setShortField(term1916016, term1916016.getClass(), "day", (short) 28);
        setField(term1916015, term1916015.getClass(), "date", term1916016);
        setByteField(term1916020, term1916020.getClass(), "hour", (byte) 13);
        setByteField(term1916020, term1916020.getClass(), "minute", (byte) 8);
        setByteField(term1916020, term1916020.getClass(), "second", (byte) 33);
        setIntField(term1916020, term1916020.getClass(), "nano", 38997678);
        setField(term1916015, term1916015.getClass(), "time", term1916020);
        setField(term1915810, term1915810.getClass(), "lastPlayDate", term1916015);
        setIntField(term1915810, term1915810.getClass(), "lastPlaceId", 839782376);
        setField(term1915810, term1915810.getClass(), "lastPlaceName", "JyXprGwIww");
        setField(term1915810, term1915810.getClass(), "lastRegionId", "EwvEAeGsum");
        setField(term1915810, term1915810.getClass(), "lastRegionName", "kZTfdjouwb");
        setField(term1915810, term1915810.getClass(), "lastAllNetId", "sEVbPggdtR");
        setField(term1915810, term1915810.getClass(), "lastClientId", "KxWCcBxdxb");
        setField(term1915808, term1915808.getClass(), "user", term1915810);
        setIntField(term1915808, term1915808.getClass(), "courseId", 1774918379);
        setIntField(term1915808, term1915808.getClass(), "classId", -674265811);
        setIntField(term1915808, term1915808.getClass(), "playCount", -1491384708);
        setIntField(term1915808, term1915808.getClass(), "scoreMax", -1836279907);
        setBooleanField(term1915808, term1915808.getClass(), "isFullCombo", true);
        setBooleanField(term1915808, term1915808.getClass(), "isAllJustice", true);
        setBooleanField(term1915808, term1915808.getClass(), "isSuccess", false);
        setIntField(term1915808, term1915808.getClass(), "scoreRank", 1976510248);
        setIntField(term1915808, term1915808.getClass(), "eventId", -1451634216);
        setIntField(term1916096, term1916096.getClass(), "year", 2019);
        setShortField(term1916096, term1916096.getClass(), "month", (short) 1);
        setShortField(term1916096, term1916096.getClass(), "day", (short) 8);
        setField(term1916095, term1916095.getClass(), "date", term1916096);
        setByteField(term1916100, term1916100.getClass(), "hour", (byte) 7);
        setByteField(term1916100, term1916100.getClass(), "minute", (byte) 5);
        setByteField(term1916100, term1916100.getClass(), "second", (byte) 26);
        setIntField(term1916100, term1916100.getClass(), "nano", 767598310);
        setField(term1916095, term1916095.getClass(), "time", term1916100);
        setField(term1915808, term1915808.getClass(), "lastPlayDate", term1916095);
        setIntField(term1915808, term1915808.getClass(), "param1", 658960927);
        setIntField(term1915808, term1915808.getClass(), "param2", 1358217653);
        setIntField(term1915808, term1915808.getClass(), "param3", 1548350815);
        setIntField(term1915808, term1915808.getClass(), "param4", 390786578);
        setBooleanField(term1915808, term1915808.getClass(), "isClear", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCourse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCourseId", argTypes, term1915808, args);
    }

};


