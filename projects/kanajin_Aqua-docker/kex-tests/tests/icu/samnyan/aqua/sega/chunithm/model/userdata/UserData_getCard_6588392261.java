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

public class UserData_getCard_6588392261 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term129807;

    public UserData_getCard_6588392261() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term129811 = new Long(-88538481937688851L);
        term129807 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term129809 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term129825 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term129826 = newInstance(Class.forName("java.time.LocalDate"));
        Object term129830 = newInstance(Class.forName("java.time.LocalTime"));
        Object term129835 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term129836 = newInstance(Class.forName("java.time.LocalDate"));
        Object term129840 = newInstance(Class.forName("java.time.LocalTime"));
        Object term129857 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term129858 = newInstance(Class.forName("java.time.LocalDate"));
        Object term129862 = newInstance(Class.forName("java.time.LocalTime"));
        Object term129918 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term129919 = newInstance(Class.forName("java.time.LocalDate"));
        Object term129923 = newInstance(Class.forName("java.time.LocalTime"));
        Object term129966 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term129967 = newInstance(Class.forName("java.time.LocalDate"));
        Object term129971 = newInstance(Class.forName("java.time.LocalTime"));
        Object term130012 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term130013 = newInstance(Class.forName("java.time.LocalDate"));
        Object term130017 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term129807, term129807.getClass(), "id", 2030253959753351191L);
        setLongField(term129809, term129809.getClass(), "id", 6362772764317235471L);
        setField(term129809, term129809.getClass(), "extId", term129811);
        setField(term129809, term129809.getClass(), "luid", "xPXCillnkF");
        setIntField(term129826, term129826.getClass(), "year", 2016);
        setShortField(term129826, term129826.getClass(), "month", (short) 7);
        setShortField(term129826, term129826.getClass(), "day", (short) 21);
        setField(term129825, term129825.getClass(), "date", term129826);
        setByteField(term129830, term129830.getClass(), "hour", (byte) 14);
        setByteField(term129830, term129830.getClass(), "minute", (byte) 40);
        setByteField(term129830, term129830.getClass(), "second", (byte) 6);
        setIntField(term129830, term129830.getClass(), "nano", 100705510);
        setField(term129825, term129825.getClass(), "time", term129830);
        setField(term129809, term129809.getClass(), "registerTime", term129825);
        setIntField(term129836, term129836.getClass(), "year", 2028);
        setShortField(term129836, term129836.getClass(), "month", (short) 9);
        setShortField(term129836, term129836.getClass(), "day", (short) 23);
        setField(term129835, term129835.getClass(), "date", term129836);
        setByteField(term129840, term129840.getClass(), "hour", (byte) 12);
        setByteField(term129840, term129840.getClass(), "minute", (byte) 0);
        setByteField(term129840, term129840.getClass(), "second", (byte) 6);
        setIntField(term129840, term129840.getClass(), "nano", 531523723);
        setField(term129835, term129835.getClass(), "time", term129840);
        setField(term129809, term129809.getClass(), "accessTime", term129835);
        setField(term129807, term129807.getClass(), "card", term129809);
        setField(term129807, term129807.getClass(), "userName", "UQdNECYgYF");
        setIntField(term129858, term129858.getClass(), "year", 2017);
        setShortField(term129858, term129858.getClass(), "month", (short) 3);
        setShortField(term129858, term129858.getClass(), "day", (short) 3);
        setField(term129857, term129857.getClass(), "date", term129858);
        setByteField(term129862, term129862.getClass(), "hour", (byte) 3);
        setByteField(term129862, term129862.getClass(), "minute", (byte) 38);
        setByteField(term129862, term129862.getClass(), "second", (byte) 23);
        setIntField(term129862, term129862.getClass(), "nano", 523322909);
        setField(term129857, term129857.getClass(), "time", term129862);
        setField(term129807, term129807.getClass(), "lastLoginDate", term129857);
        setBooleanField(term129807, term129807.getClass(), "isWebJoin", true);
        setField(term129807, term129807.getClass(), "webLimitDate", "tWKRqEdXvq");
        setIntField(term129807, term129807.getClass(), "level", -880340280);
        setIntField(term129807, term129807.getClass(), "reincarnationNum", -1194222550);
        setField(term129807, term129807.getClass(), "exp", "IzICHEiRZJ");
        setLongField(term129807, term129807.getClass(), "point", 1215709099559006092L);
        setLongField(term129807, term129807.getClass(), "totalPoint", -172822749745985404L);
        setIntField(term129807, term129807.getClass(), "playCount", 566167796);
        setIntField(term129807, term129807.getClass(), "multiPlayCount", -1082962860);
        setIntField(term129807, term129807.getClass(), "multiWinCount", 1200402655);
        setIntField(term129807, term129807.getClass(), "requestResCount", -1500378498);
        setIntField(term129807, term129807.getClass(), "acceptResCount", -1429162976);
        setIntField(term129807, term129807.getClass(), "successResCount", 1773815133);
        setIntField(term129807, term129807.getClass(), "playerRating", -1518311473);
        setIntField(term129807, term129807.getClass(), "highestRating", 1910611561);
        setIntField(term129807, term129807.getClass(), "nameplateId", -141028019);
        setIntField(term129807, term129807.getClass(), "frameId", -2084912991);
        setIntField(term129807, term129807.getClass(), "characterId", -374431639);
        setIntField(term129807, term129807.getClass(), "trophyId", -1331172307);
        setIntField(term129807, term129807.getClass(), "playedTutorialBit", 2092822782);
        setIntField(term129807, term129807.getClass(), "firstTutorialCancelNum", 1740023276);
        setIntField(term129807, term129807.getClass(), "masterTutorialCancelNum", 412259963);
        setIntField(term129807, term129807.getClass(), "totalRepertoireCount", 581068095);
        setIntField(term129807, term129807.getClass(), "totalMapNum", 1081427463);
        setLongField(term129807, term129807.getClass(), "totalHiScore", -2843381080508194463L);
        setLongField(term129807, term129807.getClass(), "totalBasicHighScore", 3880291114635681794L);
        setLongField(term129807, term129807.getClass(), "totalAdvancedHighScore", 5004839268187097411L);
        setLongField(term129807, term129807.getClass(), "totalExpertHighScore", -6710070540839416735L);
        setLongField(term129807, term129807.getClass(), "totalMasterHighScore", -8433345414293758986L);
        setIntField(term129919, term129919.getClass(), "year", 2016);
        setShortField(term129919, term129919.getClass(), "month", (short) 7);
        setShortField(term129919, term129919.getClass(), "day", (short) 17);
        setField(term129918, term129918.getClass(), "date", term129919);
        setByteField(term129923, term129923.getClass(), "hour", (byte) 3);
        setByteField(term129923, term129923.getClass(), "minute", (byte) 44);
        setByteField(term129923, term129923.getClass(), "second", (byte) 18);
        setIntField(term129923, term129923.getClass(), "nano", 761029754);
        setField(term129918, term129918.getClass(), "time", term129923);
        setField(term129807, term129807.getClass(), "eventWatchedDate", term129918);
        setIntField(term129807, term129807.getClass(), "friendCount", -276588662);
        setBooleanField(term129807, term129807.getClass(), "isMaimai", true);
        setField(term129807, term129807.getClass(), "firstGameId", "OVdPWRdMle");
        setField(term129807, term129807.getClass(), "firstRomVersion", "oimCfCnzdd");
        setField(term129807, term129807.getClass(), "firstDataVersion", "kDhZwzBdJr");
        setIntField(term129967, term129967.getClass(), "year", 2010);
        setShortField(term129967, term129967.getClass(), "month", (short) 1);
        setShortField(term129967, term129967.getClass(), "day", (short) 3);
        setField(term129966, term129966.getClass(), "date", term129967);
        setByteField(term129971, term129971.getClass(), "hour", (byte) 21);
        setByteField(term129971, term129971.getClass(), "minute", (byte) 22);
        setByteField(term129971, term129971.getClass(), "second", (byte) 34);
        setIntField(term129971, term129971.getClass(), "nano", 761927783);
        setField(term129966, term129966.getClass(), "time", term129971);
        setField(term129807, term129807.getClass(), "firstPlayDate", term129966);
        setField(term129807, term129807.getClass(), "lastGameId", "lGNwldURrK");
        setField(term129807, term129807.getClass(), "lastRomVersion", "AfRMrnPQsz");
        setField(term129807, term129807.getClass(), "lastDataVersion", "ilHCxxLSlR");
        setIntField(term130013, term130013.getClass(), "year", 2014);
        setShortField(term130013, term130013.getClass(), "month", (short) 8);
        setShortField(term130013, term130013.getClass(), "day", (short) 4);
        setField(term130012, term130012.getClass(), "date", term130013);
        setByteField(term130017, term130017.getClass(), "hour", (byte) 20);
        setByteField(term130017, term130017.getClass(), "minute", (byte) 44);
        setByteField(term130017, term130017.getClass(), "second", (byte) 33);
        setIntField(term130017, term130017.getClass(), "nano", 225183341);
        setField(term130012, term130012.getClass(), "time", term130017);
        setField(term129807, term129807.getClass(), "lastPlayDate", term130012);
        setIntField(term129807, term129807.getClass(), "lastPlaceId", 41461773);
        setField(term129807, term129807.getClass(), "lastPlaceName", "KINWoNPskz");
        setField(term129807, term129807.getClass(), "lastRegionId", "ThcARbQtxE");
        setField(term129807, term129807.getClass(), "lastRegionName", "zPIvKiioyO");
        setField(term129807, term129807.getClass(), "lastAllNetId", "gkpveaZSZa");
        setField(term129807, term129807.getClass(), "lastClientId", "MJwprBacue");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCard", argTypes, term129807, args);
    }

};


