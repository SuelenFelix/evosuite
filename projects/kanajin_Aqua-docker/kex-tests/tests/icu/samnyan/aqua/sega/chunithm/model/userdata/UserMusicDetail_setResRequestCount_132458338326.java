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

public class UserMusicDetail_setResRequestCount_132458338326 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99635;
     Object term99929;

    public UserMusicDetail_setResRequestCount_132458338326() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term99641 = new Long(-433040798405298080L);
        term99635 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMusicDetail"));
        Object term99637 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term99639 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term99655 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term99656 = newInstance(Class.forName("java.time.LocalDate"));
        Object term99660 = newInstance(Class.forName("java.time.LocalTime"));
        Object term99665 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term99666 = newInstance(Class.forName("java.time.LocalDate"));
        Object term99670 = newInstance(Class.forName("java.time.LocalTime"));
        Object term99687 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term99688 = newInstance(Class.forName("java.time.LocalDate"));
        Object term99692 = newInstance(Class.forName("java.time.LocalTime"));
        Object term99748 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term99749 = newInstance(Class.forName("java.time.LocalDate"));
        Object term99753 = newInstance(Class.forName("java.time.LocalTime"));
        Object term99796 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term99797 = newInstance(Class.forName("java.time.LocalDate"));
        Object term99801 = newInstance(Class.forName("java.time.LocalTime"));
        Object term99842 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term99843 = newInstance(Class.forName("java.time.LocalDate"));
        Object term99847 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term99635, term99635.getClass(), "id", -4985422849657460879L);
        setLongField(term99637, term99637.getClass(), "id", -5119974436779485754L);
        setLongField(term99639, term99639.getClass(), "id", -983800227104783410L);
        setField(term99639, term99639.getClass(), "extId", term99641);
        setField(term99639, term99639.getClass(), "luid", "GqITHNYwXE");
        setIntField(term99656, term99656.getClass(), "year", 2013);
        setShortField(term99656, term99656.getClass(), "month", (short) 3);
        setShortField(term99656, term99656.getClass(), "day", (short) 17);
        setField(term99655, term99655.getClass(), "date", term99656);
        setByteField(term99660, term99660.getClass(), "hour", (byte) 13);
        setByteField(term99660, term99660.getClass(), "minute", (byte) 47);
        setByteField(term99660, term99660.getClass(), "second", (byte) 51);
        setIntField(term99660, term99660.getClass(), "nano", 910194729);
        setField(term99655, term99655.getClass(), "time", term99660);
        setField(term99639, term99639.getClass(), "registerTime", term99655);
        setIntField(term99666, term99666.getClass(), "year", 2022);
        setShortField(term99666, term99666.getClass(), "month", (short) 10);
        setShortField(term99666, term99666.getClass(), "day", (short) 17);
        setField(term99665, term99665.getClass(), "date", term99666);
        setByteField(term99670, term99670.getClass(), "hour", (byte) 20);
        setByteField(term99670, term99670.getClass(), "minute", (byte) 20);
        setByteField(term99670, term99670.getClass(), "second", (byte) 44);
        setIntField(term99670, term99670.getClass(), "nano", 756805002);
        setField(term99665, term99665.getClass(), "time", term99670);
        setField(term99639, term99639.getClass(), "accessTime", term99665);
        setField(term99637, term99637.getClass(), "card", term99639);
        setField(term99637, term99637.getClass(), "userName", "UZgYyXlvna");
        setIntField(term99688, term99688.getClass(), "year", 2023);
        setShortField(term99688, term99688.getClass(), "month", (short) 6);
        setShortField(term99688, term99688.getClass(), "day", (short) 26);
        setField(term99687, term99687.getClass(), "date", term99688);
        setByteField(term99692, term99692.getClass(), "hour", (byte) 14);
        setByteField(term99692, term99692.getClass(), "minute", (byte) 53);
        setByteField(term99692, term99692.getClass(), "second", (byte) 55);
        setIntField(term99692, term99692.getClass(), "nano", 121097351);
        setField(term99687, term99687.getClass(), "time", term99692);
        setField(term99637, term99637.getClass(), "lastLoginDate", term99687);
        setBooleanField(term99637, term99637.getClass(), "isWebJoin", true);
        setField(term99637, term99637.getClass(), "webLimitDate", "VGFyNxXSkc");
        setIntField(term99637, term99637.getClass(), "level", 1044749648);
        setIntField(term99637, term99637.getClass(), "reincarnationNum", -2066536273);
        setField(term99637, term99637.getClass(), "exp", "qkZsBlbGpw");
        setLongField(term99637, term99637.getClass(), "point", 6682873780442022620L);
        setLongField(term99637, term99637.getClass(), "totalPoint", -3902939984522157167L);
        setIntField(term99637, term99637.getClass(), "playCount", -1532896934);
        setIntField(term99637, term99637.getClass(), "multiPlayCount", -1907871387);
        setIntField(term99637, term99637.getClass(), "multiWinCount", 11100609);
        setIntField(term99637, term99637.getClass(), "requestResCount", -747715686);
        setIntField(term99637, term99637.getClass(), "acceptResCount", -1565507534);
        setIntField(term99637, term99637.getClass(), "successResCount", -1665001312);
        setIntField(term99637, term99637.getClass(), "playerRating", -904092395);
        setIntField(term99637, term99637.getClass(), "highestRating", -1209882989);
        setIntField(term99637, term99637.getClass(), "nameplateId", -635477822);
        setIntField(term99637, term99637.getClass(), "frameId", -1577181902);
        setIntField(term99637, term99637.getClass(), "characterId", 1943392765);
        setIntField(term99637, term99637.getClass(), "trophyId", -1788693144);
        setIntField(term99637, term99637.getClass(), "playedTutorialBit", 1939961371);
        setIntField(term99637, term99637.getClass(), "firstTutorialCancelNum", 435301324);
        setIntField(term99637, term99637.getClass(), "masterTutorialCancelNum", -1422958225);
        setIntField(term99637, term99637.getClass(), "totalRepertoireCount", 1608477594);
        setIntField(term99637, term99637.getClass(), "totalMapNum", -250008835);
        setLongField(term99637, term99637.getClass(), "totalHiScore", 7961135201719676082L);
        setLongField(term99637, term99637.getClass(), "totalBasicHighScore", -1611050402158000680L);
        setLongField(term99637, term99637.getClass(), "totalAdvancedHighScore", 8861575654665150501L);
        setLongField(term99637, term99637.getClass(), "totalExpertHighScore", 293702982753277786L);
        setLongField(term99637, term99637.getClass(), "totalMasterHighScore", 7809414208372445190L);
        setIntField(term99749, term99749.getClass(), "year", 2017);
        setShortField(term99749, term99749.getClass(), "month", (short) 6);
        setShortField(term99749, term99749.getClass(), "day", (short) 20);
        setField(term99748, term99748.getClass(), "date", term99749);
        setByteField(term99753, term99753.getClass(), "hour", (byte) 22);
        setByteField(term99753, term99753.getClass(), "minute", (byte) 51);
        setByteField(term99753, term99753.getClass(), "second", (byte) 8);
        setIntField(term99753, term99753.getClass(), "nano", 735893362);
        setField(term99748, term99748.getClass(), "time", term99753);
        setField(term99637, term99637.getClass(), "eventWatchedDate", term99748);
        setIntField(term99637, term99637.getClass(), "friendCount", -1865187594);
        setBooleanField(term99637, term99637.getClass(), "isMaimai", true);
        setField(term99637, term99637.getClass(), "firstGameId", "UonOkFcwuK");
        setField(term99637, term99637.getClass(), "firstRomVersion", "coDGKPmcIo");
        setField(term99637, term99637.getClass(), "firstDataVersion", "sNKnkClMjH");
        setIntField(term99797, term99797.getClass(), "year", 2018);
        setShortField(term99797, term99797.getClass(), "month", (short) 5);
        setShortField(term99797, term99797.getClass(), "day", (short) 27);
        setField(term99796, term99796.getClass(), "date", term99797);
        setByteField(term99801, term99801.getClass(), "hour", (byte) 18);
        setByteField(term99801, term99801.getClass(), "minute", (byte) 33);
        setByteField(term99801, term99801.getClass(), "second", (byte) 52);
        setIntField(term99801, term99801.getClass(), "nano", 983510975);
        setField(term99796, term99796.getClass(), "time", term99801);
        setField(term99637, term99637.getClass(), "firstPlayDate", term99796);
        setField(term99637, term99637.getClass(), "lastGameId", "DzuhSmFHcg");
        setField(term99637, term99637.getClass(), "lastRomVersion", "lHFGeijIrp");
        setField(term99637, term99637.getClass(), "lastDataVersion", "OjqiiqbEQC");
        setIntField(term99843, term99843.getClass(), "year", 2022);
        setShortField(term99843, term99843.getClass(), "month", (short) 10);
        setShortField(term99843, term99843.getClass(), "day", (short) 15);
        setField(term99842, term99842.getClass(), "date", term99843);
        setByteField(term99847, term99847.getClass(), "hour", (byte) 5);
        setByteField(term99847, term99847.getClass(), "minute", (byte) 15);
        setByteField(term99847, term99847.getClass(), "second", (byte) 3);
        setIntField(term99847, term99847.getClass(), "nano", 660248234);
        setField(term99842, term99842.getClass(), "time", term99847);
        setField(term99637, term99637.getClass(), "lastPlayDate", term99842);
        setIntField(term99637, term99637.getClass(), "lastPlaceId", -1806281595);
        setField(term99637, term99637.getClass(), "lastPlaceName", "lOnziohwRj");
        setField(term99637, term99637.getClass(), "lastRegionId", "FcuzXnxIut");
        setField(term99637, term99637.getClass(), "lastRegionName", "fyepabvKPu");
        setField(term99637, term99637.getClass(), "lastAllNetId", "igjhLhfUDg");
        setField(term99637, term99637.getClass(), "lastClientId", "aphCSNJgJZ");
        setField(term99635, term99635.getClass(), "user", term99637);
        setIntField(term99635, term99635.getClass(), "musicId", -1207788939);
        setIntField(term99635, term99635.getClass(), "level", -1116962728);
        setIntField(term99635, term99635.getClass(), "playCount", 1420647748);
        setIntField(term99635, term99635.getClass(), "scoreMax", 1179379876);
        setIntField(term99635, term99635.getClass(), "resRequestCount", -1997441951);
        setIntField(term99635, term99635.getClass(), "resAcceptCount", -138340336);
        setIntField(term99635, term99635.getClass(), "resSuccessCount", 233375431);
        setIntField(term99635, term99635.getClass(), "missCount", 1527507424);
        setIntField(term99635, term99635.getClass(), "maxComboCount", -2100070024);
        setBooleanField(term99635, term99635.getClass(), "isFullCombo", false);
        setBooleanField(term99635, term99635.getClass(), "isAllJustice", true);
        setBooleanField(term99635, term99635.getClass(), "isSuccess", true);
        setIntField(term99635, term99635.getClass(), "fullChain", 1206642688);
        setIntField(term99635, term99635.getClass(), "maxChain", 224560582);
        setIntField(term99635, term99635.getClass(), "scoreRank", 1608206239);
        setBooleanField(term99635, term99635.getClass(), "isLock", false);
        term99929 = new Integer(-989652648);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term99929;
        callMethod(klass, "setResRequestCount", argTypes, term99635, args);
    }

};


