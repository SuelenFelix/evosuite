package icu.samnyan.aqua.sega.maimai.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class UserGeneralData_getPropertyValue_8194188124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108951;

    public UserGeneralData_getPropertyValue_8194188124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term108957 = new Long(-3850323135468805420L);
        term108951 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserGeneralData"));
        Object term108953 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term108955 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term108971 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term108972 = newInstance(Class.forName("java.time.LocalDate"));
        Object term108976 = newInstance(Class.forName("java.time.LocalTime"));
        Object term108981 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term108982 = newInstance(Class.forName("java.time.LocalDate"));
        Object term108986 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term108951, term108951.getClass(), "id", 8324238777146638579L);
        setLongField(term108953, term108953.getClass(), "id", 8580739755779561159L);
        setLongField(term108955, term108955.getClass(), "id", -4916056690424367636L);
        setField(term108955, term108955.getClass(), "extId", term108957);
        setField(term108955, term108955.getClass(), "luid", "iiDSRMEZEA");
        setIntField(term108972, term108972.getClass(), "year", 2029);
        setShortField(term108972, term108972.getClass(), "month", (short) 5);
        setShortField(term108972, term108972.getClass(), "day", (short) 13);
        setField(term108971, term108971.getClass(), "date", term108972);
        setByteField(term108976, term108976.getClass(), "hour", (byte) 15);
        setByteField(term108976, term108976.getClass(), "minute", (byte) 43);
        setByteField(term108976, term108976.getClass(), "second", (byte) 9);
        setIntField(term108976, term108976.getClass(), "nano", 324755756);
        setField(term108971, term108971.getClass(), "time", term108976);
        setField(term108955, term108955.getClass(), "registerTime", term108971);
        setIntField(term108982, term108982.getClass(), "year", 2010);
        setShortField(term108982, term108982.getClass(), "month", (short) 4);
        setShortField(term108982, term108982.getClass(), "day", (short) 17);
        setField(term108981, term108981.getClass(), "date", term108982);
        setByteField(term108986, term108986.getClass(), "hour", (byte) 5);
        setByteField(term108986, term108986.getClass(), "minute", (byte) 31);
        setByteField(term108986, term108986.getClass(), "second", (byte) 28);
        setIntField(term108986, term108986.getClass(), "nano", 783557285);
        setField(term108981, term108981.getClass(), "time", term108986);
        setField(term108955, term108955.getClass(), "accessTime", term108981);
        setField(term108953, term108953.getClass(), "card", term108955);
        setIntField(term108953, term108953.getClass(), "lastDataVersion", -225149829);
        setField(term108953, term108953.getClass(), "userName", "wBhcQErbFz");
        setIntField(term108953, term108953.getClass(), "point", 147540958);
        setIntField(term108953, term108953.getClass(), "totalPoint", 839776949);
        setIntField(term108953, term108953.getClass(), "iconId", -1235436426);
        setIntField(term108953, term108953.getClass(), "nameplateId", 92199099);
        setIntField(term108953, term108953.getClass(), "frameId", -2101013011);
        setIntField(term108953, term108953.getClass(), "trophyId", -1006825547);
        setIntField(term108953, term108953.getClass(), "playCount", -1076793344);
        setIntField(term108953, term108953.getClass(), "playVsCount", -1800952181);
        setIntField(term108953, term108953.getClass(), "playSyncCount", 1755467533);
        setIntField(term108953, term108953.getClass(), "winCount", -305063129);
        setIntField(term108953, term108953.getClass(), "helpCount", 2054925050);
        setIntField(term108953, term108953.getClass(), "comboCount", 1265462453);
        setIntField(term108953, term108953.getClass(), "feverCount", 1876466793);
        setIntField(term108953, term108953.getClass(), "totalHiScore", -731464605);
        setIntField(term108953, term108953.getClass(), "totalEasyHighScore", -1071813858);
        setIntField(term108953, term108953.getClass(), "totalBasicHighScore", 1363577177);
        setIntField(term108953, term108953.getClass(), "totalAdvancedHighScore", -43272492);
        setIntField(term108953, term108953.getClass(), "totalExpertHighScore", -1971106290);
        setIntField(term108953, term108953.getClass(), "totalMasterHighScore", 1004223441);
        setIntField(term108953, term108953.getClass(), "totalReMasterHighScore", 904333346);
        setIntField(term108953, term108953.getClass(), "totalHighSync", 1080841965);
        setIntField(term108953, term108953.getClass(), "totalEasySync", 1245170022);
        setIntField(term108953, term108953.getClass(), "totalBasicSync", 453277937);
        setIntField(term108953, term108953.getClass(), "totalAdvancedSync", -1489950790);
        setIntField(term108953, term108953.getClass(), "totalExpertSync", 1614233470);
        setIntField(term108953, term108953.getClass(), "totalMasterSync", 356387551);
        setIntField(term108953, term108953.getClass(), "totalReMasterSync", -1328121391);
        setIntField(term108953, term108953.getClass(), "playerRating", -1549516161);
        setIntField(term108953, term108953.getClass(), "highestRating", 951061028);
        setIntField(term108953, term108953.getClass(), "rankAuthTailId", -1928508433);
        setField(term108953, term108953.getClass(), "eventWatchedDate", "iJLzZkhOlH");
        setField(term108953, term108953.getClass(), "webLimitDate", "GUDWKmTIil");
        setIntField(term108953, term108953.getClass(), "challengeTrackPhase", 68741249);
        setIntField(term108953, term108953.getClass(), "firstPlayBits", -1492840842);
        setField(term108953, term108953.getClass(), "lastPlayDate", "hZnzaYDeRe");
        setIntField(term108953, term108953.getClass(), "lastPlaceId", 340367925);
        setField(term108953, term108953.getClass(), "lastPlaceName", "TbzRSKYwZN");
        setIntField(term108953, term108953.getClass(), "lastRegionId", 1641801254);
        setField(term108953, term108953.getClass(), "lastRegionName", "IMobeYICFK");
        setField(term108953, term108953.getClass(), "lastClientId", "HkkBqbwwlq");
        setField(term108953, term108953.getClass(), "lastCountryCode", "iJCoKDwoAB");
        setIntField(term108953, term108953.getClass(), "eventPoint", -695088814);
        setIntField(term108953, term108953.getClass(), "totalLv", 2067097728);
        setIntField(term108953, term108953.getClass(), "lastLoginBonusDay", -462923299);
        setIntField(term108953, term108953.getClass(), "lastSurvivalBonusDay", 747746176);
        setIntField(term108953, term108953.getClass(), "loginBonusLv", -650905960);
        setField(term108951, term108951.getClass(), "user", term108953);
        setField(term108951, term108951.getClass(), "propertyKey", "vmxQPAehpJ");
        setField(term108951, term108951.getClass(), "propertyValue", "xoFNyRpjCp");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserGeneralData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPropertyValue", argTypes, term108951, args);
    }

};


