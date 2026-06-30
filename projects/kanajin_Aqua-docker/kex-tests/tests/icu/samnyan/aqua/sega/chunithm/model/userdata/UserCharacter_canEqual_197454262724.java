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

public class UserCharacter_canEqual_197454262724 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118969;
     Object term119256;

    public UserCharacter_canEqual_197454262724() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term118975 = new Long(-7904053112604879960L);
        term118969 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCharacter"));
        Object term118971 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term118973 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term118989 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term118990 = newInstance(Class.forName("java.time.LocalDate"));
        Object term118994 = newInstance(Class.forName("java.time.LocalTime"));
        Object term118999 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term119000 = newInstance(Class.forName("java.time.LocalDate"));
        Object term119004 = newInstance(Class.forName("java.time.LocalTime"));
        Object term119021 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term119022 = newInstance(Class.forName("java.time.LocalDate"));
        Object term119026 = newInstance(Class.forName("java.time.LocalTime"));
        Object term119082 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term119083 = newInstance(Class.forName("java.time.LocalDate"));
        Object term119087 = newInstance(Class.forName("java.time.LocalTime"));
        Object term119130 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term119131 = newInstance(Class.forName("java.time.LocalDate"));
        Object term119135 = newInstance(Class.forName("java.time.LocalTime"));
        Object term119176 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term119177 = newInstance(Class.forName("java.time.LocalDate"));
        Object term119181 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term118969, term118969.getClass(), "id", -8090024033686339139L);
        setLongField(term118971, term118971.getClass(), "id", 2068874593380068539L);
        setLongField(term118973, term118973.getClass(), "id", -7302550625879930077L);
        setField(term118973, term118973.getClass(), "extId", term118975);
        setField(term118973, term118973.getClass(), "luid", "aaACqoZRFl");
        setIntField(term118990, term118990.getClass(), "year", 2025);
        setShortField(term118990, term118990.getClass(), "month", (short) 6);
        setShortField(term118990, term118990.getClass(), "day", (short) 18);
        setField(term118989, term118989.getClass(), "date", term118990);
        setByteField(term118994, term118994.getClass(), "hour", (byte) 22);
        setByteField(term118994, term118994.getClass(), "minute", (byte) 0);
        setByteField(term118994, term118994.getClass(), "second", (byte) 37);
        setIntField(term118994, term118994.getClass(), "nano", 773671650);
        setField(term118989, term118989.getClass(), "time", term118994);
        setField(term118973, term118973.getClass(), "registerTime", term118989);
        setIntField(term119000, term119000.getClass(), "year", 2012);
        setShortField(term119000, term119000.getClass(), "month", (short) 11);
        setShortField(term119000, term119000.getClass(), "day", (short) 18);
        setField(term118999, term118999.getClass(), "date", term119000);
        setByteField(term119004, term119004.getClass(), "hour", (byte) 16);
        setByteField(term119004, term119004.getClass(), "minute", (byte) 27);
        setByteField(term119004, term119004.getClass(), "second", (byte) 35);
        setIntField(term119004, term119004.getClass(), "nano", 90549720);
        setField(term118999, term118999.getClass(), "time", term119004);
        setField(term118973, term118973.getClass(), "accessTime", term118999);
        setField(term118971, term118971.getClass(), "card", term118973);
        setField(term118971, term118971.getClass(), "userName", "CtIecpnHzx");
        setIntField(term119022, term119022.getClass(), "year", 2020);
        setShortField(term119022, term119022.getClass(), "month", (short) 12);
        setShortField(term119022, term119022.getClass(), "day", (short) 22);
        setField(term119021, term119021.getClass(), "date", term119022);
        setByteField(term119026, term119026.getClass(), "hour", (byte) 6);
        setByteField(term119026, term119026.getClass(), "minute", (byte) 46);
        setByteField(term119026, term119026.getClass(), "second", (byte) 40);
        setIntField(term119026, term119026.getClass(), "nano", 325486643);
        setField(term119021, term119021.getClass(), "time", term119026);
        setField(term118971, term118971.getClass(), "lastLoginDate", term119021);
        setBooleanField(term118971, term118971.getClass(), "isWebJoin", true);
        setField(term118971, term118971.getClass(), "webLimitDate", "lgGoogCJeG");
        setIntField(term118971, term118971.getClass(), "level", 1537733513);
        setIntField(term118971, term118971.getClass(), "reincarnationNum", -1931737090);
        setField(term118971, term118971.getClass(), "exp", "EyskfGpFOR");
        setLongField(term118971, term118971.getClass(), "point", 547751867620565142L);
        setLongField(term118971, term118971.getClass(), "totalPoint", 7129464628272755377L);
        setIntField(term118971, term118971.getClass(), "playCount", -1599656306);
        setIntField(term118971, term118971.getClass(), "multiPlayCount", 1695987763);
        setIntField(term118971, term118971.getClass(), "multiWinCount", -635843083);
        setIntField(term118971, term118971.getClass(), "requestResCount", 1458601685);
        setIntField(term118971, term118971.getClass(), "acceptResCount", 1144708364);
        setIntField(term118971, term118971.getClass(), "successResCount", 757749198);
        setIntField(term118971, term118971.getClass(), "playerRating", 394416625);
        setIntField(term118971, term118971.getClass(), "highestRating", -385524457);
        setIntField(term118971, term118971.getClass(), "nameplateId", 1453058029);
        setIntField(term118971, term118971.getClass(), "frameId", 632579504);
        setIntField(term118971, term118971.getClass(), "characterId", -2066050715);
        setIntField(term118971, term118971.getClass(), "trophyId", 1838644781);
        setIntField(term118971, term118971.getClass(), "playedTutorialBit", -342802107);
        setIntField(term118971, term118971.getClass(), "firstTutorialCancelNum", 1875014750);
        setIntField(term118971, term118971.getClass(), "masterTutorialCancelNum", 1774722901);
        setIntField(term118971, term118971.getClass(), "totalRepertoireCount", 1496592792);
        setIntField(term118971, term118971.getClass(), "totalMapNum", 1944444886);
        setLongField(term118971, term118971.getClass(), "totalHiScore", -1473630530222186168L);
        setLongField(term118971, term118971.getClass(), "totalBasicHighScore", -491562959649300308L);
        setLongField(term118971, term118971.getClass(), "totalAdvancedHighScore", -348524442664216841L);
        setLongField(term118971, term118971.getClass(), "totalExpertHighScore", 7543403646493723501L);
        setLongField(term118971, term118971.getClass(), "totalMasterHighScore", -6800678833488490645L);
        setIntField(term119083, term119083.getClass(), "year", 2027);
        setShortField(term119083, term119083.getClass(), "month", (short) 8);
        setShortField(term119083, term119083.getClass(), "day", (short) 2);
        setField(term119082, term119082.getClass(), "date", term119083);
        setByteField(term119087, term119087.getClass(), "hour", (byte) 11);
        setByteField(term119087, term119087.getClass(), "minute", (byte) 54);
        setByteField(term119087, term119087.getClass(), "second", (byte) 44);
        setIntField(term119087, term119087.getClass(), "nano", 995449811);
        setField(term119082, term119082.getClass(), "time", term119087);
        setField(term118971, term118971.getClass(), "eventWatchedDate", term119082);
        setIntField(term118971, term118971.getClass(), "friendCount", 813872033);
        setBooleanField(term118971, term118971.getClass(), "isMaimai", true);
        setField(term118971, term118971.getClass(), "firstGameId", "eEKpyfnNFi");
        setField(term118971, term118971.getClass(), "firstRomVersion", "WjMAISAxtn");
        setField(term118971, term118971.getClass(), "firstDataVersion", "GiDsfCiYsm");
        setIntField(term119131, term119131.getClass(), "year", 2023);
        setShortField(term119131, term119131.getClass(), "month", (short) 5);
        setShortField(term119131, term119131.getClass(), "day", (short) 16);
        setField(term119130, term119130.getClass(), "date", term119131);
        setByteField(term119135, term119135.getClass(), "hour", (byte) 5);
        setByteField(term119135, term119135.getClass(), "minute", (byte) 46);
        setByteField(term119135, term119135.getClass(), "second", (byte) 46);
        setIntField(term119135, term119135.getClass(), "nano", 113942424);
        setField(term119130, term119130.getClass(), "time", term119135);
        setField(term118971, term118971.getClass(), "firstPlayDate", term119130);
        setField(term118971, term118971.getClass(), "lastGameId", "RuvnkQFdLv");
        setField(term118971, term118971.getClass(), "lastRomVersion", "zAaRUjWcRI");
        setField(term118971, term118971.getClass(), "lastDataVersion", "biuSELVcRS");
        setIntField(term119177, term119177.getClass(), "year", 2019);
        setShortField(term119177, term119177.getClass(), "month", (short) 3);
        setShortField(term119177, term119177.getClass(), "day", (short) 18);
        setField(term119176, term119176.getClass(), "date", term119177);
        setByteField(term119181, term119181.getClass(), "hour", (byte) 20);
        setByteField(term119181, term119181.getClass(), "minute", (byte) 45);
        setByteField(term119181, term119181.getClass(), "second", (byte) 18);
        setIntField(term119181, term119181.getClass(), "nano", 876974816);
        setField(term119176, term119176.getClass(), "time", term119181);
        setField(term118971, term118971.getClass(), "lastPlayDate", term119176);
        setIntField(term118971, term118971.getClass(), "lastPlaceId", -289587627);
        setField(term118971, term118971.getClass(), "lastPlaceName", "QvIFmvEUyM");
        setField(term118971, term118971.getClass(), "lastRegionId", "WIZrBpMEJd");
        setField(term118971, term118971.getClass(), "lastRegionName", "judJxGaXAJ");
        setField(term118971, term118971.getClass(), "lastAllNetId", "YyIBJVokET");
        setField(term118971, term118971.getClass(), "lastClientId", "oUsLXfeBhj");
        setField(term118969, term118969.getClass(), "user", term118971);
        setIntField(term118969, term118969.getClass(), "characterId", 249117272);
        setIntField(term118969, term118969.getClass(), "playCount", 569136290);
        setIntField(term118969, term118969.getClass(), "level", 1);
        setIntField(term118969, term118969.getClass(), "skillId", -769809783);
        setIntField(term118969, term118969.getClass(), "friendshipExp", -1572273604);
        setBooleanField(term118969, term118969.getClass(), "isValid", true);
        setBooleanField(term118969, term118969.getClass(), "isNewMark", true);
        setIntField(term118969, term118969.getClass(), "param1", -884285296);
        setIntField(term118969, term118969.getClass(), "param2", -332552768);
        term119256 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCharacter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term119256;
        callMethod(klass, "canEqual", argTypes, term118969, args);
    }

};


