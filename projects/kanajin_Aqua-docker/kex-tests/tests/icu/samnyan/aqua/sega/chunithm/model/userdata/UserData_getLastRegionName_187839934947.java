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

public class UserData_getLastRegionName_187839934947 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term149403;

    public UserData_getLastRegionName_187839934947() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term149407 = new Long(8512025621149521819L);
        term149403 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term149405 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term149421 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term149422 = newInstance(Class.forName("java.time.LocalDate"));
        Object term149426 = newInstance(Class.forName("java.time.LocalTime"));
        Object term149431 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term149432 = newInstance(Class.forName("java.time.LocalDate"));
        Object term149436 = newInstance(Class.forName("java.time.LocalTime"));
        Object term149453 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term149454 = newInstance(Class.forName("java.time.LocalDate"));
        Object term149458 = newInstance(Class.forName("java.time.LocalTime"));
        Object term149514 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term149515 = newInstance(Class.forName("java.time.LocalDate"));
        Object term149519 = newInstance(Class.forName("java.time.LocalTime"));
        Object term149562 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term149563 = newInstance(Class.forName("java.time.LocalDate"));
        Object term149567 = newInstance(Class.forName("java.time.LocalTime"));
        Object term149608 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term149609 = newInstance(Class.forName("java.time.LocalDate"));
        Object term149613 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term149403, term149403.getClass(), "id", 4670842618814938178L);
        setLongField(term149405, term149405.getClass(), "id", -5287005085074415722L);
        setField(term149405, term149405.getClass(), "extId", term149407);
        setField(term149405, term149405.getClass(), "luid", "OvGOlSMJSa");
        setIntField(term149422, term149422.getClass(), "year", 2021);
        setShortField(term149422, term149422.getClass(), "month", (short) 4);
        setShortField(term149422, term149422.getClass(), "day", (short) 21);
        setField(term149421, term149421.getClass(), "date", term149422);
        setByteField(term149426, term149426.getClass(), "hour", (byte) 12);
        setByteField(term149426, term149426.getClass(), "minute", (byte) 10);
        setByteField(term149426, term149426.getClass(), "second", (byte) 37);
        setIntField(term149426, term149426.getClass(), "nano", 933902129);
        setField(term149421, term149421.getClass(), "time", term149426);
        setField(term149405, term149405.getClass(), "registerTime", term149421);
        setIntField(term149432, term149432.getClass(), "year", 2022);
        setShortField(term149432, term149432.getClass(), "month", (short) 11);
        setShortField(term149432, term149432.getClass(), "day", (short) 1);
        setField(term149431, term149431.getClass(), "date", term149432);
        setByteField(term149436, term149436.getClass(), "hour", (byte) 12);
        setByteField(term149436, term149436.getClass(), "minute", (byte) 25);
        setByteField(term149436, term149436.getClass(), "second", (byte) 35);
        setIntField(term149436, term149436.getClass(), "nano", 172550106);
        setField(term149431, term149431.getClass(), "time", term149436);
        setField(term149405, term149405.getClass(), "accessTime", term149431);
        setField(term149403, term149403.getClass(), "card", term149405);
        setField(term149403, term149403.getClass(), "userName", "bxfVqYYRGF");
        setIntField(term149454, term149454.getClass(), "year", 2024);
        setShortField(term149454, term149454.getClass(), "month", (short) 9);
        setShortField(term149454, term149454.getClass(), "day", (short) 15);
        setField(term149453, term149453.getClass(), "date", term149454);
        setByteField(term149458, term149458.getClass(), "hour", (byte) 17);
        setByteField(term149458, term149458.getClass(), "minute", (byte) 32);
        setByteField(term149458, term149458.getClass(), "second", (byte) 56);
        setIntField(term149458, term149458.getClass(), "nano", 99127524);
        setField(term149453, term149453.getClass(), "time", term149458);
        setField(term149403, term149403.getClass(), "lastLoginDate", term149453);
        setBooleanField(term149403, term149403.getClass(), "isWebJoin", false);
        setField(term149403, term149403.getClass(), "webLimitDate", "wFXqDDYRYm");
        setIntField(term149403, term149403.getClass(), "level", -2023283754);
        setIntField(term149403, term149403.getClass(), "reincarnationNum", 100828116);
        setField(term149403, term149403.getClass(), "exp", "kzyZeMslFg");
        setLongField(term149403, term149403.getClass(), "point", 5908822617930076617L);
        setLongField(term149403, term149403.getClass(), "totalPoint", 57360223636415265L);
        setIntField(term149403, term149403.getClass(), "playCount", -1959805707);
        setIntField(term149403, term149403.getClass(), "multiPlayCount", 30813741);
        setIntField(term149403, term149403.getClass(), "multiWinCount", 2044603094);
        setIntField(term149403, term149403.getClass(), "requestResCount", 726068108);
        setIntField(term149403, term149403.getClass(), "acceptResCount", 56736806);
        setIntField(term149403, term149403.getClass(), "successResCount", 496074088);
        setIntField(term149403, term149403.getClass(), "playerRating", -785066858);
        setIntField(term149403, term149403.getClass(), "highestRating", -1086354117);
        setIntField(term149403, term149403.getClass(), "nameplateId", -868397361);
        setIntField(term149403, term149403.getClass(), "frameId", 1974839599);
        setIntField(term149403, term149403.getClass(), "characterId", 975425511);
        setIntField(term149403, term149403.getClass(), "trophyId", 1662673275);
        setIntField(term149403, term149403.getClass(), "playedTutorialBit", 1782831447);
        setIntField(term149403, term149403.getClass(), "firstTutorialCancelNum", -1997327027);
        setIntField(term149403, term149403.getClass(), "masterTutorialCancelNum", -1055738735);
        setIntField(term149403, term149403.getClass(), "totalRepertoireCount", 693030720);
        setIntField(term149403, term149403.getClass(), "totalMapNum", -148509792);
        setLongField(term149403, term149403.getClass(), "totalHiScore", 3617879233449633137L);
        setLongField(term149403, term149403.getClass(), "totalBasicHighScore", 303877126969771627L);
        setLongField(term149403, term149403.getClass(), "totalAdvancedHighScore", 5936855519941672815L);
        setLongField(term149403, term149403.getClass(), "totalExpertHighScore", -3451200643008955738L);
        setLongField(term149403, term149403.getClass(), "totalMasterHighScore", 786575161612473255L);
        setIntField(term149515, term149515.getClass(), "year", 2018);
        setShortField(term149515, term149515.getClass(), "month", (short) 8);
        setShortField(term149515, term149515.getClass(), "day", (short) 25);
        setField(term149514, term149514.getClass(), "date", term149515);
        setByteField(term149519, term149519.getClass(), "hour", (byte) 10);
        setByteField(term149519, term149519.getClass(), "minute", (byte) 7);
        setByteField(term149519, term149519.getClass(), "second", (byte) 53);
        setIntField(term149519, term149519.getClass(), "nano", 411648226);
        setField(term149514, term149514.getClass(), "time", term149519);
        setField(term149403, term149403.getClass(), "eventWatchedDate", term149514);
        setIntField(term149403, term149403.getClass(), "friendCount", 1306551461);
        setBooleanField(term149403, term149403.getClass(), "isMaimai", false);
        setField(term149403, term149403.getClass(), "firstGameId", "SjqDahcFQi");
        setField(term149403, term149403.getClass(), "firstRomVersion", "DVOSJnQsiN");
        setField(term149403, term149403.getClass(), "firstDataVersion", "ktWbLulnVh");
        setIntField(term149563, term149563.getClass(), "year", 2022);
        setShortField(term149563, term149563.getClass(), "month", (short) 8);
        setShortField(term149563, term149563.getClass(), "day", (short) 30);
        setField(term149562, term149562.getClass(), "date", term149563);
        setByteField(term149567, term149567.getClass(), "hour", (byte) 4);
        setByteField(term149567, term149567.getClass(), "minute", (byte) 58);
        setByteField(term149567, term149567.getClass(), "second", (byte) 42);
        setIntField(term149567, term149567.getClass(), "nano", 673718992);
        setField(term149562, term149562.getClass(), "time", term149567);
        setField(term149403, term149403.getClass(), "firstPlayDate", term149562);
        setField(term149403, term149403.getClass(), "lastGameId", "iUWVVoBCUJ");
        setField(term149403, term149403.getClass(), "lastRomVersion", "CdhhQSeUxx");
        setField(term149403, term149403.getClass(), "lastDataVersion", "ibLGcUvUaQ");
        setIntField(term149609, term149609.getClass(), "year", 2029);
        setShortField(term149609, term149609.getClass(), "month", (short) 4);
        setShortField(term149609, term149609.getClass(), "day", (short) 22);
        setField(term149608, term149608.getClass(), "date", term149609);
        setByteField(term149613, term149613.getClass(), "hour", (byte) 19);
        setByteField(term149613, term149613.getClass(), "minute", (byte) 43);
        setByteField(term149613, term149613.getClass(), "second", (byte) 25);
        setIntField(term149613, term149613.getClass(), "nano", 406008372);
        setField(term149608, term149608.getClass(), "time", term149613);
        setField(term149403, term149403.getClass(), "lastPlayDate", term149608);
        setIntField(term149403, term149403.getClass(), "lastPlaceId", -141757322);
        setField(term149403, term149403.getClass(), "lastPlaceName", "NFQfoAnLge");
        setField(term149403, term149403.getClass(), "lastRegionId", "FECGrszMje");
        setField(term149403, term149403.getClass(), "lastRegionName", "uYvUMAqudy");
        setField(term149403, term149403.getClass(), "lastAllNetId", "ynxbUIshhw");
        setField(term149403, term149403.getClass(), "lastClientId", "YLRmtmCngx");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastRegionName", argTypes, term149403, args);
    }

};


