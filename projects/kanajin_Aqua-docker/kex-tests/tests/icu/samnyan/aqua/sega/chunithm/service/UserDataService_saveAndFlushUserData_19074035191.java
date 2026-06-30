package icu.samnyan.aqua.sega.chunithm.service;

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
import static icu.samnyan.aqua.sega.chunithm.service.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class UserDataService_saveAndFlushUserData_19074035191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term427;

    public UserDataService_saveAndFlushUserData_19074035191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term431 = new Long(6375119433582206027L);
        term427 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term429 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term445 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term446 = newInstance(Class.forName("java.time.LocalDate"));
        Object term450 = newInstance(Class.forName("java.time.LocalTime"));
        Object term455 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term456 = newInstance(Class.forName("java.time.LocalDate"));
        Object term460 = newInstance(Class.forName("java.time.LocalTime"));
        Object term477 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term478 = newInstance(Class.forName("java.time.LocalDate"));
        Object term482 = newInstance(Class.forName("java.time.LocalTime"));
        Object term538 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term539 = newInstance(Class.forName("java.time.LocalDate"));
        Object term543 = newInstance(Class.forName("java.time.LocalTime"));
        Object term586 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term587 = newInstance(Class.forName("java.time.LocalDate"));
        Object term591 = newInstance(Class.forName("java.time.LocalTime"));
        Object term632 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term633 = newInstance(Class.forName("java.time.LocalDate"));
        Object term637 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term427, term427.getClass(), "id", 6967924379644551255L);
        setLongField(term429, term429.getClass(), "id", -2813493605142626659L);
        setField(term429, term429.getClass(), "extId", term431);
        setField(term429, term429.getClass(), "luid", "aJlieCFVtF");
        setIntField(term446, term446.getClass(), "year", 2025);
        setShortField(term446, term446.getClass(), "month", (short) 4);
        setShortField(term446, term446.getClass(), "day", (short) 24);
        setField(term445, term445.getClass(), "date", term446);
        setByteField(term450, term450.getClass(), "hour", (byte) 18);
        setByteField(term450, term450.getClass(), "minute", (byte) 11);
        setByteField(term450, term450.getClass(), "second", (byte) 40);
        setIntField(term450, term450.getClass(), "nano", 137454929);
        setField(term445, term445.getClass(), "time", term450);
        setField(term429, term429.getClass(), "registerTime", term445);
        setIntField(term456, term456.getClass(), "year", 2024);
        setShortField(term456, term456.getClass(), "month", (short) 1);
        setShortField(term456, term456.getClass(), "day", (short) 24);
        setField(term455, term455.getClass(), "date", term456);
        setByteField(term460, term460.getClass(), "hour", (byte) 20);
        setByteField(term460, term460.getClass(), "minute", (byte) 28);
        setByteField(term460, term460.getClass(), "second", (byte) 39);
        setIntField(term460, term460.getClass(), "nano", 952728177);
        setField(term455, term455.getClass(), "time", term460);
        setField(term429, term429.getClass(), "accessTime", term455);
        setField(term427, term427.getClass(), "card", term429);
        setField(term427, term427.getClass(), "userName", "ZiaGIbnzTs");
        setIntField(term478, term478.getClass(), "year", 2029);
        setShortField(term478, term478.getClass(), "month", (short) 8);
        setShortField(term478, term478.getClass(), "day", (short) 29);
        setField(term477, term477.getClass(), "date", term478);
        setByteField(term482, term482.getClass(), "hour", (byte) 15);
        setByteField(term482, term482.getClass(), "minute", (byte) 50);
        setByteField(term482, term482.getClass(), "second", (byte) 1);
        setIntField(term482, term482.getClass(), "nano", 277971904);
        setField(term477, term477.getClass(), "time", term482);
        setField(term427, term427.getClass(), "lastLoginDate", term477);
        setBooleanField(term427, term427.getClass(), "isWebJoin", false);
        setField(term427, term427.getClass(), "webLimitDate", "tbcdzjIfER");
        setIntField(term427, term427.getClass(), "level", -6029667);
        setIntField(term427, term427.getClass(), "reincarnationNum", -2068769794);
        setField(term427, term427.getClass(), "exp", "HyxfbSQYBe");
        setLongField(term427, term427.getClass(), "point", -8885298608300233488L);
        setLongField(term427, term427.getClass(), "totalPoint", -4325723315152823407L);
        setIntField(term427, term427.getClass(), "playCount", -117576464);
        setIntField(term427, term427.getClass(), "multiPlayCount", -1007160944);
        setIntField(term427, term427.getClass(), "multiWinCount", 1135664017);
        setIntField(term427, term427.getClass(), "requestResCount", 590364439);
        setIntField(term427, term427.getClass(), "acceptResCount", 865208305);
        setIntField(term427, term427.getClass(), "successResCount", -1275173084);
        setIntField(term427, term427.getClass(), "playerRating", -244121226);
        setIntField(term427, term427.getClass(), "highestRating", -203030934);
        setIntField(term427, term427.getClass(), "nameplateId", -1179120542);
        setIntField(term427, term427.getClass(), "frameId", -73683645);
        setIntField(term427, term427.getClass(), "characterId", -226514366);
        setIntField(term427, term427.getClass(), "trophyId", 1193880199);
        setIntField(term427, term427.getClass(), "playedTutorialBit", -1087774327);
        setIntField(term427, term427.getClass(), "firstTutorialCancelNum", -1530420153);
        setIntField(term427, term427.getClass(), "masterTutorialCancelNum", -469968304);
        setIntField(term427, term427.getClass(), "totalRepertoireCount", -1145578966);
        setIntField(term427, term427.getClass(), "totalMapNum", 679763016);
        setLongField(term427, term427.getClass(), "totalHiScore", 2535595959091595249L);
        setLongField(term427, term427.getClass(), "totalBasicHighScore", -5476826692763582090L);
        setLongField(term427, term427.getClass(), "totalAdvancedHighScore", -872011222785455006L);
        setLongField(term427, term427.getClass(), "totalExpertHighScore", -316468845751588286L);
        setLongField(term427, term427.getClass(), "totalMasterHighScore", 5127676408959197577L);
        setIntField(term539, term539.getClass(), "year", 2022);
        setShortField(term539, term539.getClass(), "month", (short) 11);
        setShortField(term539, term539.getClass(), "day", (short) 16);
        setField(term538, term538.getClass(), "date", term539);
        setByteField(term543, term543.getClass(), "hour", (byte) 15);
        setByteField(term543, term543.getClass(), "minute", (byte) 54);
        setByteField(term543, term543.getClass(), "second", (byte) 2);
        setIntField(term543, term543.getClass(), "nano", 733274103);
        setField(term538, term538.getClass(), "time", term543);
        setField(term427, term427.getClass(), "eventWatchedDate", term538);
        setIntField(term427, term427.getClass(), "friendCount", 1962444399);
        setBooleanField(term427, term427.getClass(), "isMaimai", false);
        setField(term427, term427.getClass(), "firstGameId", "pCTimMblYc");
        setField(term427, term427.getClass(), "firstRomVersion", "hNxWaHcfhY");
        setField(term427, term427.getClass(), "firstDataVersion", "RkybSrpybU");
        setIntField(term587, term587.getClass(), "year", 2019);
        setShortField(term587, term587.getClass(), "month", (short) 2);
        setShortField(term587, term587.getClass(), "day", (short) 21);
        setField(term586, term586.getClass(), "date", term587);
        setByteField(term591, term591.getClass(), "hour", (byte) 5);
        setByteField(term591, term591.getClass(), "minute", (byte) 41);
        setByteField(term591, term591.getClass(), "second", (byte) 11);
        setIntField(term591, term591.getClass(), "nano", 859829782);
        setField(term586, term586.getClass(), "time", term591);
        setField(term427, term427.getClass(), "firstPlayDate", term586);
        setField(term427, term427.getClass(), "lastGameId", "xOEqzGAmDU");
        setField(term427, term427.getClass(), "lastRomVersion", "eZFUvlxvGV");
        setField(term427, term427.getClass(), "lastDataVersion", "BYqFIqCKAV");
        setIntField(term633, term633.getClass(), "year", 2018);
        setShortField(term633, term633.getClass(), "month", (short) 9);
        setShortField(term633, term633.getClass(), "day", (short) 28);
        setField(term632, term632.getClass(), "date", term633);
        setByteField(term637, term637.getClass(), "hour", (byte) 3);
        setByteField(term637, term637.getClass(), "minute", (byte) 37);
        setByteField(term637, term637.getClass(), "second", (byte) 46);
        setIntField(term637, term637.getClass(), "nano", 763326845);
        setField(term632, term632.getClass(), "time", term637);
        setField(term427, term427.getClass(), "lastPlayDate", term632);
        setIntField(term427, term427.getClass(), "lastPlaceId", 767834723);
        setField(term427, term427.getClass(), "lastPlaceName", "vrQLuWIDJX");
        setField(term427, term427.getClass(), "lastRegionId", "flxyYxBRtu");
        setField(term427, term427.getClass(), "lastRegionName", "OclPbYPkcH");
        setField(term427, term427.getClass(), "lastAllNetId", "IoAlmYsBwc");
        setField(term427, term427.getClass(), "lastClientId", "TEParAifyi");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.service.UserDataService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Object[] args = new Object[1];
        args[0] = term427;
        callMethod(klass, "saveAndFlushUserData", argTypes, null, args);
    }

};


