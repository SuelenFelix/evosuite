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

public class UserCharacter_setPlayCount_150822915315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term115019;
     Object term115306;

    public UserCharacter_setPlayCount_150822915315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term115025 = new Long(-1820639665251914495L);
        term115019 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCharacter"));
        Object term115021 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term115023 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term115039 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term115040 = newInstance(Class.forName("java.time.LocalDate"));
        Object term115044 = newInstance(Class.forName("java.time.LocalTime"));
        Object term115049 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term115050 = newInstance(Class.forName("java.time.LocalDate"));
        Object term115054 = newInstance(Class.forName("java.time.LocalTime"));
        Object term115071 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term115072 = newInstance(Class.forName("java.time.LocalDate"));
        Object term115076 = newInstance(Class.forName("java.time.LocalTime"));
        Object term115132 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term115133 = newInstance(Class.forName("java.time.LocalDate"));
        Object term115137 = newInstance(Class.forName("java.time.LocalTime"));
        Object term115180 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term115181 = newInstance(Class.forName("java.time.LocalDate"));
        Object term115185 = newInstance(Class.forName("java.time.LocalTime"));
        Object term115226 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term115227 = newInstance(Class.forName("java.time.LocalDate"));
        Object term115231 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term115019, term115019.getClass(), "id", -9102400273331433507L);
        setLongField(term115021, term115021.getClass(), "id", -7603034666961874453L);
        setLongField(term115023, term115023.getClass(), "id", 6171188519299774487L);
        setField(term115023, term115023.getClass(), "extId", term115025);
        setField(term115023, term115023.getClass(), "luid", "zkqcwCycKC");
        setIntField(term115040, term115040.getClass(), "year", 2021);
        setShortField(term115040, term115040.getClass(), "month", (short) 8);
        setShortField(term115040, term115040.getClass(), "day", (short) 8);
        setField(term115039, term115039.getClass(), "date", term115040);
        setByteField(term115044, term115044.getClass(), "hour", (byte) 2);
        setByteField(term115044, term115044.getClass(), "minute", (byte) 11);
        setByteField(term115044, term115044.getClass(), "second", (byte) 51);
        setIntField(term115044, term115044.getClass(), "nano", 531225083);
        setField(term115039, term115039.getClass(), "time", term115044);
        setField(term115023, term115023.getClass(), "registerTime", term115039);
        setIntField(term115050, term115050.getClass(), "year", 2022);
        setShortField(term115050, term115050.getClass(), "month", (short) 1);
        setShortField(term115050, term115050.getClass(), "day", (short) 2);
        setField(term115049, term115049.getClass(), "date", term115050);
        setByteField(term115054, term115054.getClass(), "hour", (byte) 1);
        setByteField(term115054, term115054.getClass(), "minute", (byte) 2);
        setByteField(term115054, term115054.getClass(), "second", (byte) 39);
        setIntField(term115054, term115054.getClass(), "nano", 742900273);
        setField(term115049, term115049.getClass(), "time", term115054);
        setField(term115023, term115023.getClass(), "accessTime", term115049);
        setField(term115021, term115021.getClass(), "card", term115023);
        setField(term115021, term115021.getClass(), "userName", "jSBwpGbJJI");
        setIntField(term115072, term115072.getClass(), "year", 2018);
        setShortField(term115072, term115072.getClass(), "month", (short) 5);
        setShortField(term115072, term115072.getClass(), "day", (short) 14);
        setField(term115071, term115071.getClass(), "date", term115072);
        setByteField(term115076, term115076.getClass(), "hour", (byte) 13);
        setByteField(term115076, term115076.getClass(), "minute", (byte) 42);
        setByteField(term115076, term115076.getClass(), "second", (byte) 58);
        setIntField(term115076, term115076.getClass(), "nano", 934560950);
        setField(term115071, term115071.getClass(), "time", term115076);
        setField(term115021, term115021.getClass(), "lastLoginDate", term115071);
        setBooleanField(term115021, term115021.getClass(), "isWebJoin", true);
        setField(term115021, term115021.getClass(), "webLimitDate", "xnmcxyNSBe");
        setIntField(term115021, term115021.getClass(), "level", 1402422395);
        setIntField(term115021, term115021.getClass(), "reincarnationNum", -1842694062);
        setField(term115021, term115021.getClass(), "exp", "FXflwvEdHL");
        setLongField(term115021, term115021.getClass(), "point", 8409252889039339447L);
        setLongField(term115021, term115021.getClass(), "totalPoint", 6113018989695983183L);
        setIntField(term115021, term115021.getClass(), "playCount", 1926671230);
        setIntField(term115021, term115021.getClass(), "multiPlayCount", 591515356);
        setIntField(term115021, term115021.getClass(), "multiWinCount", -496031198);
        setIntField(term115021, term115021.getClass(), "requestResCount", -2031306487);
        setIntField(term115021, term115021.getClass(), "acceptResCount", -266787195);
        setIntField(term115021, term115021.getClass(), "successResCount", 1967526359);
        setIntField(term115021, term115021.getClass(), "playerRating", -405827477);
        setIntField(term115021, term115021.getClass(), "highestRating", -418743608);
        setIntField(term115021, term115021.getClass(), "nameplateId", 217176849);
        setIntField(term115021, term115021.getClass(), "frameId", 665322254);
        setIntField(term115021, term115021.getClass(), "characterId", -950956143);
        setIntField(term115021, term115021.getClass(), "trophyId", 146996690);
        setIntField(term115021, term115021.getClass(), "playedTutorialBit", 490172433);
        setIntField(term115021, term115021.getClass(), "firstTutorialCancelNum", 387768499);
        setIntField(term115021, term115021.getClass(), "masterTutorialCancelNum", 1727693843);
        setIntField(term115021, term115021.getClass(), "totalRepertoireCount", -371048786);
        setIntField(term115021, term115021.getClass(), "totalMapNum", -1779736424);
        setLongField(term115021, term115021.getClass(), "totalHiScore", 7008972996434680296L);
        setLongField(term115021, term115021.getClass(), "totalBasicHighScore", 678000773176130475L);
        setLongField(term115021, term115021.getClass(), "totalAdvancedHighScore", -1750640202321719004L);
        setLongField(term115021, term115021.getClass(), "totalExpertHighScore", -5655330187112396076L);
        setLongField(term115021, term115021.getClass(), "totalMasterHighScore", 6764238104675879678L);
        setIntField(term115133, term115133.getClass(), "year", 2026);
        setShortField(term115133, term115133.getClass(), "month", (short) 4);
        setShortField(term115133, term115133.getClass(), "day", (short) 14);
        setField(term115132, term115132.getClass(), "date", term115133);
        setByteField(term115137, term115137.getClass(), "hour", (byte) 7);
        setByteField(term115137, term115137.getClass(), "minute", (byte) 8);
        setByteField(term115137, term115137.getClass(), "second", (byte) 29);
        setIntField(term115137, term115137.getClass(), "nano", 688827647);
        setField(term115132, term115132.getClass(), "time", term115137);
        setField(term115021, term115021.getClass(), "eventWatchedDate", term115132);
        setIntField(term115021, term115021.getClass(), "friendCount", 1027604749);
        setBooleanField(term115021, term115021.getClass(), "isMaimai", false);
        setField(term115021, term115021.getClass(), "firstGameId", "aTdLOvYsQE");
        setField(term115021, term115021.getClass(), "firstRomVersion", "AavZwxppSr");
        setField(term115021, term115021.getClass(), "firstDataVersion", "bozHpjFCmy");
        setIntField(term115181, term115181.getClass(), "year", 2014);
        setShortField(term115181, term115181.getClass(), "month", (short) 12);
        setShortField(term115181, term115181.getClass(), "day", (short) 2);
        setField(term115180, term115180.getClass(), "date", term115181);
        setByteField(term115185, term115185.getClass(), "hour", (byte) 6);
        setByteField(term115185, term115185.getClass(), "minute", (byte) 19);
        setByteField(term115185, term115185.getClass(), "second", (byte) 32);
        setIntField(term115185, term115185.getClass(), "nano", 912349578);
        setField(term115180, term115180.getClass(), "time", term115185);
        setField(term115021, term115021.getClass(), "firstPlayDate", term115180);
        setField(term115021, term115021.getClass(), "lastGameId", "fufOvYOUme");
        setField(term115021, term115021.getClass(), "lastRomVersion", "hFUzxlerfo");
        setField(term115021, term115021.getClass(), "lastDataVersion", "SSClrWPMGg");
        setIntField(term115227, term115227.getClass(), "year", 2012);
        setShortField(term115227, term115227.getClass(), "month", (short) 5);
        setShortField(term115227, term115227.getClass(), "day", (short) 22);
        setField(term115226, term115226.getClass(), "date", term115227);
        setByteField(term115231, term115231.getClass(), "hour", (byte) 23);
        setByteField(term115231, term115231.getClass(), "minute", (byte) 10);
        setByteField(term115231, term115231.getClass(), "second", (byte) 13);
        setIntField(term115231, term115231.getClass(), "nano", 585273851);
        setField(term115226, term115226.getClass(), "time", term115231);
        setField(term115021, term115021.getClass(), "lastPlayDate", term115226);
        setIntField(term115021, term115021.getClass(), "lastPlaceId", -1786633473);
        setField(term115021, term115021.getClass(), "lastPlaceName", "pWwlfpmeFT");
        setField(term115021, term115021.getClass(), "lastRegionId", "PKwVSkPPMv");
        setField(term115021, term115021.getClass(), "lastRegionName", "DpAnlOynPS");
        setField(term115021, term115021.getClass(), "lastAllNetId", "CyKngDoFFr");
        setField(term115021, term115021.getClass(), "lastClientId", "eXHygaZKkI");
        setField(term115019, term115019.getClass(), "user", term115021);
        setIntField(term115019, term115019.getClass(), "characterId", 1484582681);
        setIntField(term115019, term115019.getClass(), "playCount", 641921984);
        setIntField(term115019, term115019.getClass(), "level", 1);
        setIntField(term115019, term115019.getClass(), "skillId", -1505020273);
        setIntField(term115019, term115019.getClass(), "friendshipExp", -298905997);
        setBooleanField(term115019, term115019.getClass(), "isValid", true);
        setBooleanField(term115019, term115019.getClass(), "isNewMark", true);
        setIntField(term115019, term115019.getClass(), "param1", -2030417348);
        setIntField(term115019, term115019.getClass(), "param2", 1282232010);
        term115306 = new Integer(-1360469722);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCharacter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term115306;
        callMethod(klass, "setPlayCount", argTypes, term115019, args);
    }

};


