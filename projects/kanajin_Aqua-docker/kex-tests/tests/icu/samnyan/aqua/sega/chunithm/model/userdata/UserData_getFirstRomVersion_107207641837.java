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

public class UserData_getFirstRomVersion_107207641837 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term145143;

    public UserData_getFirstRomVersion_107207641837() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term145147 = new Long(11315815278355083L);
        term145143 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term145145 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term145161 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term145162 = newInstance(Class.forName("java.time.LocalDate"));
        Object term145166 = newInstance(Class.forName("java.time.LocalTime"));
        Object term145171 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term145172 = newInstance(Class.forName("java.time.LocalDate"));
        Object term145176 = newInstance(Class.forName("java.time.LocalTime"));
        Object term145193 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term145194 = newInstance(Class.forName("java.time.LocalDate"));
        Object term145198 = newInstance(Class.forName("java.time.LocalTime"));
        Object term145254 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term145255 = newInstance(Class.forName("java.time.LocalDate"));
        Object term145259 = newInstance(Class.forName("java.time.LocalTime"));
        Object term145302 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term145303 = newInstance(Class.forName("java.time.LocalDate"));
        Object term145307 = newInstance(Class.forName("java.time.LocalTime"));
        Object term145348 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term145349 = newInstance(Class.forName("java.time.LocalDate"));
        Object term145353 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term145143, term145143.getClass(), "id", 7593602767052909314L);
        setLongField(term145145, term145145.getClass(), "id", 7009846690732806829L);
        setField(term145145, term145145.getClass(), "extId", term145147);
        setField(term145145, term145145.getClass(), "luid", "CiRiThUkzG");
        setIntField(term145162, term145162.getClass(), "year", 2023);
        setShortField(term145162, term145162.getClass(), "month", (short) 3);
        setShortField(term145162, term145162.getClass(), "day", (short) 25);
        setField(term145161, term145161.getClass(), "date", term145162);
        setByteField(term145166, term145166.getClass(), "hour", (byte) 6);
        setByteField(term145166, term145166.getClass(), "minute", (byte) 8);
        setByteField(term145166, term145166.getClass(), "second", (byte) 17);
        setIntField(term145166, term145166.getClass(), "nano", 575658933);
        setField(term145161, term145161.getClass(), "time", term145166);
        setField(term145145, term145145.getClass(), "registerTime", term145161);
        setIntField(term145172, term145172.getClass(), "year", 2026);
        setShortField(term145172, term145172.getClass(), "month", (short) 8);
        setShortField(term145172, term145172.getClass(), "day", (short) 11);
        setField(term145171, term145171.getClass(), "date", term145172);
        setByteField(term145176, term145176.getClass(), "hour", (byte) 2);
        setByteField(term145176, term145176.getClass(), "minute", (byte) 37);
        setByteField(term145176, term145176.getClass(), "second", (byte) 6);
        setIntField(term145176, term145176.getClass(), "nano", 873766037);
        setField(term145171, term145171.getClass(), "time", term145176);
        setField(term145145, term145145.getClass(), "accessTime", term145171);
        setField(term145143, term145143.getClass(), "card", term145145);
        setField(term145143, term145143.getClass(), "userName", "USOHXZaoed");
        setIntField(term145194, term145194.getClass(), "year", 2011);
        setShortField(term145194, term145194.getClass(), "month", (short) 8);
        setShortField(term145194, term145194.getClass(), "day", (short) 2);
        setField(term145193, term145193.getClass(), "date", term145194);
        setByteField(term145198, term145198.getClass(), "hour", (byte) 1);
        setByteField(term145198, term145198.getClass(), "minute", (byte) 50);
        setByteField(term145198, term145198.getClass(), "second", (byte) 35);
        setIntField(term145198, term145198.getClass(), "nano", 776930227);
        setField(term145193, term145193.getClass(), "time", term145198);
        setField(term145143, term145143.getClass(), "lastLoginDate", term145193);
        setBooleanField(term145143, term145143.getClass(), "isWebJoin", true);
        setField(term145143, term145143.getClass(), "webLimitDate", "sIAuMXSPLw");
        setIntField(term145143, term145143.getClass(), "level", -1143681603);
        setIntField(term145143, term145143.getClass(), "reincarnationNum", 671881052);
        setField(term145143, term145143.getClass(), "exp", "BHUMLKEWjf");
        setLongField(term145143, term145143.getClass(), "point", 8159301017712143715L);
        setLongField(term145143, term145143.getClass(), "totalPoint", 7716553209665440346L);
        setIntField(term145143, term145143.getClass(), "playCount", 1496400210);
        setIntField(term145143, term145143.getClass(), "multiPlayCount", -1434027177);
        setIntField(term145143, term145143.getClass(), "multiWinCount", 1385323795);
        setIntField(term145143, term145143.getClass(), "requestResCount", -66414124);
        setIntField(term145143, term145143.getClass(), "acceptResCount", 497879148);
        setIntField(term145143, term145143.getClass(), "successResCount", -237343326);
        setIntField(term145143, term145143.getClass(), "playerRating", -392082342);
        setIntField(term145143, term145143.getClass(), "highestRating", -854451115);
        setIntField(term145143, term145143.getClass(), "nameplateId", 1986079462);
        setIntField(term145143, term145143.getClass(), "frameId", -1259832629);
        setIntField(term145143, term145143.getClass(), "characterId", -614088635);
        setIntField(term145143, term145143.getClass(), "trophyId", 2118042800);
        setIntField(term145143, term145143.getClass(), "playedTutorialBit", -1128188846);
        setIntField(term145143, term145143.getClass(), "firstTutorialCancelNum", -1601581964);
        setIntField(term145143, term145143.getClass(), "masterTutorialCancelNum", -1178253517);
        setIntField(term145143, term145143.getClass(), "totalRepertoireCount", 1443002510);
        setIntField(term145143, term145143.getClass(), "totalMapNum", 1678623341);
        setLongField(term145143, term145143.getClass(), "totalHiScore", 2104945851697951566L);
        setLongField(term145143, term145143.getClass(), "totalBasicHighScore", 2226274535113455673L);
        setLongField(term145143, term145143.getClass(), "totalAdvancedHighScore", -3483009961035969884L);
        setLongField(term145143, term145143.getClass(), "totalExpertHighScore", -6330284814052668407L);
        setLongField(term145143, term145143.getClass(), "totalMasterHighScore", 151946226512995551L);
        setIntField(term145255, term145255.getClass(), "year", 2026);
        setShortField(term145255, term145255.getClass(), "month", (short) 12);
        setShortField(term145255, term145255.getClass(), "day", (short) 14);
        setField(term145254, term145254.getClass(), "date", term145255);
        setByteField(term145259, term145259.getClass(), "hour", (byte) 16);
        setByteField(term145259, term145259.getClass(), "minute", (byte) 28);
        setByteField(term145259, term145259.getClass(), "second", (byte) 29);
        setIntField(term145259, term145259.getClass(), "nano", 146135725);
        setField(term145254, term145254.getClass(), "time", term145259);
        setField(term145143, term145143.getClass(), "eventWatchedDate", term145254);
        setIntField(term145143, term145143.getClass(), "friendCount", -1023826937);
        setBooleanField(term145143, term145143.getClass(), "isMaimai", false);
        setField(term145143, term145143.getClass(), "firstGameId", "bCRIEMBwda");
        setField(term145143, term145143.getClass(), "firstRomVersion", "rJpPoVDPxO");
        setField(term145143, term145143.getClass(), "firstDataVersion", "wAzHMzePqz");
        setIntField(term145303, term145303.getClass(), "year", 2021);
        setShortField(term145303, term145303.getClass(), "month", (short) 5);
        setShortField(term145303, term145303.getClass(), "day", (short) 26);
        setField(term145302, term145302.getClass(), "date", term145303);
        setByteField(term145307, term145307.getClass(), "hour", (byte) 6);
        setByteField(term145307, term145307.getClass(), "minute", (byte) 14);
        setByteField(term145307, term145307.getClass(), "second", (byte) 4);
        setIntField(term145307, term145307.getClass(), "nano", 161717804);
        setField(term145302, term145302.getClass(), "time", term145307);
        setField(term145143, term145143.getClass(), "firstPlayDate", term145302);
        setField(term145143, term145143.getClass(), "lastGameId", "apDIHttQkF");
        setField(term145143, term145143.getClass(), "lastRomVersion", "JnkpKxjKwX");
        setField(term145143, term145143.getClass(), "lastDataVersion", "QmmFUcQTWe");
        setIntField(term145349, term145349.getClass(), "year", 2015);
        setShortField(term145349, term145349.getClass(), "month", (short) 10);
        setShortField(term145349, term145349.getClass(), "day", (short) 29);
        setField(term145348, term145348.getClass(), "date", term145349);
        setByteField(term145353, term145353.getClass(), "hour", (byte) 17);
        setByteField(term145353, term145353.getClass(), "minute", (byte) 15);
        setByteField(term145353, term145353.getClass(), "second", (byte) 56);
        setIntField(term145353, term145353.getClass(), "nano", 970367295);
        setField(term145348, term145348.getClass(), "time", term145353);
        setField(term145143, term145143.getClass(), "lastPlayDate", term145348);
        setIntField(term145143, term145143.getClass(), "lastPlaceId", 1573871540);
        setField(term145143, term145143.getClass(), "lastPlaceName", "SrhlGLISlG");
        setField(term145143, term145143.getClass(), "lastRegionId", "UPhCxQiSer");
        setField(term145143, term145143.getClass(), "lastRegionName", "jHjQEFLfrD");
        setField(term145143, term145143.getClass(), "lastAllNetId", "jDgLTvGduh");
        setField(term145143, term145143.getClass(), "lastClientId", "HfgMTpkgaK");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFirstRomVersion", argTypes, term145143, args);
    }

};


