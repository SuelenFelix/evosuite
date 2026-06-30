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

public class UserData_getLastRomVersion_50328718841 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term146847;

    public UserData_getLastRomVersion_50328718841() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term146851 = new Long(1463379874413441830L);
        term146847 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term146849 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term146865 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term146866 = newInstance(Class.forName("java.time.LocalDate"));
        Object term146870 = newInstance(Class.forName("java.time.LocalTime"));
        Object term146875 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term146876 = newInstance(Class.forName("java.time.LocalDate"));
        Object term146880 = newInstance(Class.forName("java.time.LocalTime"));
        Object term146897 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term146898 = newInstance(Class.forName("java.time.LocalDate"));
        Object term146902 = newInstance(Class.forName("java.time.LocalTime"));
        Object term146958 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term146959 = newInstance(Class.forName("java.time.LocalDate"));
        Object term146963 = newInstance(Class.forName("java.time.LocalTime"));
        Object term147006 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term147007 = newInstance(Class.forName("java.time.LocalDate"));
        Object term147011 = newInstance(Class.forName("java.time.LocalTime"));
        Object term147052 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term147053 = newInstance(Class.forName("java.time.LocalDate"));
        Object term147057 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term146847, term146847.getClass(), "id", 4081077498890518776L);
        setLongField(term146849, term146849.getClass(), "id", -2218287258931868955L);
        setField(term146849, term146849.getClass(), "extId", term146851);
        setField(term146849, term146849.getClass(), "luid", "JVxVmSrZrh");
        setIntField(term146866, term146866.getClass(), "year", 2019);
        setShortField(term146866, term146866.getClass(), "month", (short) 5);
        setShortField(term146866, term146866.getClass(), "day", (short) 14);
        setField(term146865, term146865.getClass(), "date", term146866);
        setByteField(term146870, term146870.getClass(), "hour", (byte) 1);
        setByteField(term146870, term146870.getClass(), "minute", (byte) 53);
        setByteField(term146870, term146870.getClass(), "second", (byte) 36);
        setIntField(term146870, term146870.getClass(), "nano", 854641331);
        setField(term146865, term146865.getClass(), "time", term146870);
        setField(term146849, term146849.getClass(), "registerTime", term146865);
        setIntField(term146876, term146876.getClass(), "year", 2018);
        setShortField(term146876, term146876.getClass(), "month", (short) 8);
        setShortField(term146876, term146876.getClass(), "day", (short) 14);
        setField(term146875, term146875.getClass(), "date", term146876);
        setByteField(term146880, term146880.getClass(), "hour", (byte) 13);
        setByteField(term146880, term146880.getClass(), "minute", (byte) 22);
        setByteField(term146880, term146880.getClass(), "second", (byte) 49);
        setIntField(term146880, term146880.getClass(), "nano", 535302101);
        setField(term146875, term146875.getClass(), "time", term146880);
        setField(term146849, term146849.getClass(), "accessTime", term146875);
        setField(term146847, term146847.getClass(), "card", term146849);
        setField(term146847, term146847.getClass(), "userName", "xHynRanbSE");
        setIntField(term146898, term146898.getClass(), "year", 2018);
        setShortField(term146898, term146898.getClass(), "month", (short) 6);
        setShortField(term146898, term146898.getClass(), "day", (short) 15);
        setField(term146897, term146897.getClass(), "date", term146898);
        setByteField(term146902, term146902.getClass(), "hour", (byte) 2);
        setByteField(term146902, term146902.getClass(), "minute", (byte) 54);
        setByteField(term146902, term146902.getClass(), "second", (byte) 25);
        setIntField(term146902, term146902.getClass(), "nano", 804629047);
        setField(term146897, term146897.getClass(), "time", term146902);
        setField(term146847, term146847.getClass(), "lastLoginDate", term146897);
        setBooleanField(term146847, term146847.getClass(), "isWebJoin", false);
        setField(term146847, term146847.getClass(), "webLimitDate", "ACdUTXxFxF");
        setIntField(term146847, term146847.getClass(), "level", -1375200779);
        setIntField(term146847, term146847.getClass(), "reincarnationNum", 1855996400);
        setField(term146847, term146847.getClass(), "exp", "MsjtvLqctc");
        setLongField(term146847, term146847.getClass(), "point", 8007043833946390244L);
        setLongField(term146847, term146847.getClass(), "totalPoint", -1028298066253346513L);
        setIntField(term146847, term146847.getClass(), "playCount", 1409066038);
        setIntField(term146847, term146847.getClass(), "multiPlayCount", 987148838);
        setIntField(term146847, term146847.getClass(), "multiWinCount", 2060323601);
        setIntField(term146847, term146847.getClass(), "requestResCount", -1877309791);
        setIntField(term146847, term146847.getClass(), "acceptResCount", 1057601439);
        setIntField(term146847, term146847.getClass(), "successResCount", 1009362436);
        setIntField(term146847, term146847.getClass(), "playerRating", 465082402);
        setIntField(term146847, term146847.getClass(), "highestRating", -572966539);
        setIntField(term146847, term146847.getClass(), "nameplateId", -70620606);
        setIntField(term146847, term146847.getClass(), "frameId", -131245628);
        setIntField(term146847, term146847.getClass(), "characterId", 1389986243);
        setIntField(term146847, term146847.getClass(), "trophyId", 1400795661);
        setIntField(term146847, term146847.getClass(), "playedTutorialBit", 1870026461);
        setIntField(term146847, term146847.getClass(), "firstTutorialCancelNum", -2127214606);
        setIntField(term146847, term146847.getClass(), "masterTutorialCancelNum", -1001373806);
        setIntField(term146847, term146847.getClass(), "totalRepertoireCount", -1431802716);
        setIntField(term146847, term146847.getClass(), "totalMapNum", -1927075382);
        setLongField(term146847, term146847.getClass(), "totalHiScore", -1736742262774950648L);
        setLongField(term146847, term146847.getClass(), "totalBasicHighScore", -3526785905169020936L);
        setLongField(term146847, term146847.getClass(), "totalAdvancedHighScore", -6164563266809190174L);
        setLongField(term146847, term146847.getClass(), "totalExpertHighScore", 296176504085562157L);
        setLongField(term146847, term146847.getClass(), "totalMasterHighScore", -8754845690934701873L);
        setIntField(term146959, term146959.getClass(), "year", 2020);
        setShortField(term146959, term146959.getClass(), "month", (short) 2);
        setShortField(term146959, term146959.getClass(), "day", (short) 12);
        setField(term146958, term146958.getClass(), "date", term146959);
        setByteField(term146963, term146963.getClass(), "hour", (byte) 21);
        setByteField(term146963, term146963.getClass(), "minute", (byte) 7);
        setByteField(term146963, term146963.getClass(), "second", (byte) 43);
        setIntField(term146963, term146963.getClass(), "nano", 917660888);
        setField(term146958, term146958.getClass(), "time", term146963);
        setField(term146847, term146847.getClass(), "eventWatchedDate", term146958);
        setIntField(term146847, term146847.getClass(), "friendCount", -1834614967);
        setBooleanField(term146847, term146847.getClass(), "isMaimai", false);
        setField(term146847, term146847.getClass(), "firstGameId", "omhBZktFpR");
        setField(term146847, term146847.getClass(), "firstRomVersion", "zEsjjlIKrF");
        setField(term146847, term146847.getClass(), "firstDataVersion", "XeoSSCwSfl");
        setIntField(term147007, term147007.getClass(), "year", 2027);
        setShortField(term147007, term147007.getClass(), "month", (short) 7);
        setShortField(term147007, term147007.getClass(), "day", (short) 14);
        setField(term147006, term147006.getClass(), "date", term147007);
        setByteField(term147011, term147011.getClass(), "hour", (byte) 22);
        setByteField(term147011, term147011.getClass(), "minute", (byte) 29);
        setByteField(term147011, term147011.getClass(), "second", (byte) 59);
        setIntField(term147011, term147011.getClass(), "nano", 89259297);
        setField(term147006, term147006.getClass(), "time", term147011);
        setField(term146847, term146847.getClass(), "firstPlayDate", term147006);
        setField(term146847, term146847.getClass(), "lastGameId", "adcoGovSer");
        setField(term146847, term146847.getClass(), "lastRomVersion", "DZqXfiKqtE");
        setField(term146847, term146847.getClass(), "lastDataVersion", "YOsqpIMuey");
        setIntField(term147053, term147053.getClass(), "year", 2023);
        setShortField(term147053, term147053.getClass(), "month", (short) 1);
        setShortField(term147053, term147053.getClass(), "day", (short) 19);
        setField(term147052, term147052.getClass(), "date", term147053);
        setByteField(term147057, term147057.getClass(), "hour", (byte) 19);
        setByteField(term147057, term147057.getClass(), "minute", (byte) 2);
        setByteField(term147057, term147057.getClass(), "second", (byte) 29);
        setIntField(term147057, term147057.getClass(), "nano", 394464570);
        setField(term147052, term147052.getClass(), "time", term147057);
        setField(term146847, term146847.getClass(), "lastPlayDate", term147052);
        setIntField(term146847, term146847.getClass(), "lastPlaceId", 2144962544);
        setField(term146847, term146847.getClass(), "lastPlaceName", "dfJffzsKZe");
        setField(term146847, term146847.getClass(), "lastRegionId", "dTgyMBkwWX");
        setField(term146847, term146847.getClass(), "lastRegionName", "mhIqZywfDK");
        setField(term146847, term146847.getClass(), "lastAllNetId", "MXPBuilyzu");
        setField(term146847, term146847.getClass(), "lastClientId", "CHVVqdbuYH");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastRomVersion", argTypes, term146847, args);
    }

};


