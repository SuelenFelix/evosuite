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

public class UserData_setPlayedTutorialBit_8122183573 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term160637;
     Object term160913;

    public UserData_setPlayedTutorialBit_8122183573() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term160641 = new Long(-136372844051852955L);
        term160637 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term160639 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term160655 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term160656 = newInstance(Class.forName("java.time.LocalDate"));
        Object term160660 = newInstance(Class.forName("java.time.LocalTime"));
        Object term160665 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term160666 = newInstance(Class.forName("java.time.LocalDate"));
        Object term160670 = newInstance(Class.forName("java.time.LocalTime"));
        Object term160687 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term160688 = newInstance(Class.forName("java.time.LocalDate"));
        Object term160692 = newInstance(Class.forName("java.time.LocalTime"));
        Object term160748 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term160749 = newInstance(Class.forName("java.time.LocalDate"));
        Object term160753 = newInstance(Class.forName("java.time.LocalTime"));
        Object term160796 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term160797 = newInstance(Class.forName("java.time.LocalDate"));
        Object term160801 = newInstance(Class.forName("java.time.LocalTime"));
        Object term160842 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term160843 = newInstance(Class.forName("java.time.LocalDate"));
        Object term160847 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term160637, term160637.getClass(), "id", 188856881917035209L);
        setLongField(term160639, term160639.getClass(), "id", 8981860257922986237L);
        setField(term160639, term160639.getClass(), "extId", term160641);
        setField(term160639, term160639.getClass(), "luid", "PVcLgfdPEf");
        setIntField(term160656, term160656.getClass(), "year", 2022);
        setShortField(term160656, term160656.getClass(), "month", (short) 5);
        setShortField(term160656, term160656.getClass(), "day", (short) 7);
        setField(term160655, term160655.getClass(), "date", term160656);
        setByteField(term160660, term160660.getClass(), "hour", (byte) 8);
        setByteField(term160660, term160660.getClass(), "minute", (byte) 52);
        setByteField(term160660, term160660.getClass(), "second", (byte) 59);
        setIntField(term160660, term160660.getClass(), "nano", 442873871);
        setField(term160655, term160655.getClass(), "time", term160660);
        setField(term160639, term160639.getClass(), "registerTime", term160655);
        setIntField(term160666, term160666.getClass(), "year", 2023);
        setShortField(term160666, term160666.getClass(), "month", (short) 12);
        setShortField(term160666, term160666.getClass(), "day", (short) 26);
        setField(term160665, term160665.getClass(), "date", term160666);
        setByteField(term160670, term160670.getClass(), "hour", (byte) 8);
        setByteField(term160670, term160670.getClass(), "minute", (byte) 2);
        setByteField(term160670, term160670.getClass(), "second", (byte) 43);
        setIntField(term160670, term160670.getClass(), "nano", 333103686);
        setField(term160665, term160665.getClass(), "time", term160670);
        setField(term160639, term160639.getClass(), "accessTime", term160665);
        setField(term160637, term160637.getClass(), "card", term160639);
        setField(term160637, term160637.getClass(), "userName", "PEDTNvvicf");
        setIntField(term160688, term160688.getClass(), "year", 2021);
        setShortField(term160688, term160688.getClass(), "month", (short) 3);
        setShortField(term160688, term160688.getClass(), "day", (short) 9);
        setField(term160687, term160687.getClass(), "date", term160688);
        setByteField(term160692, term160692.getClass(), "hour", (byte) 3);
        setByteField(term160692, term160692.getClass(), "minute", (byte) 29);
        setByteField(term160692, term160692.getClass(), "second", (byte) 40);
        setIntField(term160692, term160692.getClass(), "nano", 532732859);
        setField(term160687, term160687.getClass(), "time", term160692);
        setField(term160637, term160637.getClass(), "lastLoginDate", term160687);
        setBooleanField(term160637, term160637.getClass(), "isWebJoin", false);
        setField(term160637, term160637.getClass(), "webLimitDate", "CoEwWlFbOr");
        setIntField(term160637, term160637.getClass(), "level", -650039812);
        setIntField(term160637, term160637.getClass(), "reincarnationNum", 986533686);
        setField(term160637, term160637.getClass(), "exp", "oKzUOrAFFo");
        setLongField(term160637, term160637.getClass(), "point", 7147111790881898185L);
        setLongField(term160637, term160637.getClass(), "totalPoint", -8254910154627096258L);
        setIntField(term160637, term160637.getClass(), "playCount", -939119176);
        setIntField(term160637, term160637.getClass(), "multiPlayCount", -455814151);
        setIntField(term160637, term160637.getClass(), "multiWinCount", 1100360523);
        setIntField(term160637, term160637.getClass(), "requestResCount", 1962499910);
        setIntField(term160637, term160637.getClass(), "acceptResCount", -939758416);
        setIntField(term160637, term160637.getClass(), "successResCount", -1099676971);
        setIntField(term160637, term160637.getClass(), "playerRating", 826860572);
        setIntField(term160637, term160637.getClass(), "highestRating", 1080879900);
        setIntField(term160637, term160637.getClass(), "nameplateId", -35783514);
        setIntField(term160637, term160637.getClass(), "frameId", -1751212981);
        setIntField(term160637, term160637.getClass(), "characterId", -573316300);
        setIntField(term160637, term160637.getClass(), "trophyId", 578872264);
        setIntField(term160637, term160637.getClass(), "playedTutorialBit", -278464853);
        setIntField(term160637, term160637.getClass(), "firstTutorialCancelNum", 184087281);
        setIntField(term160637, term160637.getClass(), "masterTutorialCancelNum", 467765373);
        setIntField(term160637, term160637.getClass(), "totalRepertoireCount", 1278171430);
        setIntField(term160637, term160637.getClass(), "totalMapNum", 513629950);
        setLongField(term160637, term160637.getClass(), "totalHiScore", -668121876281857893L);
        setLongField(term160637, term160637.getClass(), "totalBasicHighScore", 7045963234622810797L);
        setLongField(term160637, term160637.getClass(), "totalAdvancedHighScore", 1687824749559906568L);
        setLongField(term160637, term160637.getClass(), "totalExpertHighScore", 1995968235555387542L);
        setLongField(term160637, term160637.getClass(), "totalMasterHighScore", -6996856775306653180L);
        setIntField(term160749, term160749.getClass(), "year", 2022);
        setShortField(term160749, term160749.getClass(), "month", (short) 12);
        setShortField(term160749, term160749.getClass(), "day", (short) 3);
        setField(term160748, term160748.getClass(), "date", term160749);
        setByteField(term160753, term160753.getClass(), "hour", (byte) 10);
        setByteField(term160753, term160753.getClass(), "minute", (byte) 53);
        setByteField(term160753, term160753.getClass(), "second", (byte) 57);
        setIntField(term160753, term160753.getClass(), "nano", 145761140);
        setField(term160748, term160748.getClass(), "time", term160753);
        setField(term160637, term160637.getClass(), "eventWatchedDate", term160748);
        setIntField(term160637, term160637.getClass(), "friendCount", 1877595756);
        setBooleanField(term160637, term160637.getClass(), "isMaimai", false);
        setField(term160637, term160637.getClass(), "firstGameId", "cShhTkvRUF");
        setField(term160637, term160637.getClass(), "firstRomVersion", "qgiseKtoqu");
        setField(term160637, term160637.getClass(), "firstDataVersion", "FfGmyAKSaB");
        setIntField(term160797, term160797.getClass(), "year", 2011);
        setShortField(term160797, term160797.getClass(), "month", (short) 6);
        setShortField(term160797, term160797.getClass(), "day", (short) 2);
        setField(term160796, term160796.getClass(), "date", term160797);
        setByteField(term160801, term160801.getClass(), "hour", (byte) 21);
        setByteField(term160801, term160801.getClass(), "minute", (byte) 34);
        setByteField(term160801, term160801.getClass(), "second", (byte) 4);
        setIntField(term160801, term160801.getClass(), "nano", 579632284);
        setField(term160796, term160796.getClass(), "time", term160801);
        setField(term160637, term160637.getClass(), "firstPlayDate", term160796);
        setField(term160637, term160637.getClass(), "lastGameId", "icoPCGhgWH");
        setField(term160637, term160637.getClass(), "lastRomVersion", "CHQBuYSRSj");
        setField(term160637, term160637.getClass(), "lastDataVersion", "UyXrmrYEff");
        setIntField(term160843, term160843.getClass(), "year", 2018);
        setShortField(term160843, term160843.getClass(), "month", (short) 2);
        setShortField(term160843, term160843.getClass(), "day", (short) 28);
        setField(term160842, term160842.getClass(), "date", term160843);
        setByteField(term160847, term160847.getClass(), "hour", (byte) 2);
        setByteField(term160847, term160847.getClass(), "minute", (byte) 9);
        setByteField(term160847, term160847.getClass(), "second", (byte) 21);
        setIntField(term160847, term160847.getClass(), "nano", 663694921);
        setField(term160842, term160842.getClass(), "time", term160847);
        setField(term160637, term160637.getClass(), "lastPlayDate", term160842);
        setIntField(term160637, term160637.getClass(), "lastPlaceId", 1018531116);
        setField(term160637, term160637.getClass(), "lastPlaceName", "hKmKbZReWq");
        setField(term160637, term160637.getClass(), "lastRegionId", "dVNQlaRjno");
        setField(term160637, term160637.getClass(), "lastRegionName", "heuePoxaMW");
        setField(term160637, term160637.getClass(), "lastAllNetId", "MxqYtTLyvM");
        setField(term160637, term160637.getClass(), "lastClientId", "FuAWIrUgQq");
        term160913 = new Integer(-1243015891);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term160913;
        callMethod(klass, "setPlayedTutorialBit", argTypes, term160637, args);
    }

};


