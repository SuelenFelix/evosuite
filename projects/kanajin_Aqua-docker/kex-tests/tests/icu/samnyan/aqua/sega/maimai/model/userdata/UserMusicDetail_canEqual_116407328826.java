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

public class UserMusicDetail_canEqual_116407328826 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term187380;
     Object term187566;

    public UserMusicDetail_canEqual_116407328826() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term187386 = new Long(-1978508496784157882L);
        term187380 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserMusicDetail"));
        Object term187382 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term187384 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term187400 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term187401 = newInstance(Class.forName("java.time.LocalDate"));
        Object term187405 = newInstance(Class.forName("java.time.LocalTime"));
        Object term187410 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term187411 = newInstance(Class.forName("java.time.LocalDate"));
        Object term187415 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term187380, term187380.getClass(), "id", -2355117979885740284L);
        setLongField(term187382, term187382.getClass(), "id", -7496552559644191814L);
        setLongField(term187384, term187384.getClass(), "id", -8354421580727921114L);
        setField(term187384, term187384.getClass(), "extId", term187386);
        setField(term187384, term187384.getClass(), "luid", "XQbCHMjIJN");
        setIntField(term187401, term187401.getClass(), "year", 2010);
        setShortField(term187401, term187401.getClass(), "month", (short) 1);
        setShortField(term187401, term187401.getClass(), "day", (short) 16);
        setField(term187400, term187400.getClass(), "date", term187401);
        setByteField(term187405, term187405.getClass(), "hour", (byte) 9);
        setByteField(term187405, term187405.getClass(), "minute", (byte) 12);
        setByteField(term187405, term187405.getClass(), "second", (byte) 44);
        setIntField(term187405, term187405.getClass(), "nano", 134721246);
        setField(term187400, term187400.getClass(), "time", term187405);
        setField(term187384, term187384.getClass(), "registerTime", term187400);
        setIntField(term187411, term187411.getClass(), "year", 2018);
        setShortField(term187411, term187411.getClass(), "month", (short) 8);
        setShortField(term187411, term187411.getClass(), "day", (short) 29);
        setField(term187410, term187410.getClass(), "date", term187411);
        setByteField(term187415, term187415.getClass(), "hour", (byte) 10);
        setByteField(term187415, term187415.getClass(), "minute", (byte) 58);
        setByteField(term187415, term187415.getClass(), "second", (byte) 45);
        setIntField(term187415, term187415.getClass(), "nano", 987262592);
        setField(term187410, term187410.getClass(), "time", term187415);
        setField(term187384, term187384.getClass(), "accessTime", term187410);
        setField(term187382, term187382.getClass(), "card", term187384);
        setIntField(term187382, term187382.getClass(), "lastDataVersion", 580423385);
        setField(term187382, term187382.getClass(), "userName", "amaRjUoHzE");
        setIntField(term187382, term187382.getClass(), "point", -993751148);
        setIntField(term187382, term187382.getClass(), "totalPoint", -371303023);
        setIntField(term187382, term187382.getClass(), "iconId", 1906471864);
        setIntField(term187382, term187382.getClass(), "nameplateId", -1954935302);
        setIntField(term187382, term187382.getClass(), "frameId", -809003340);
        setIntField(term187382, term187382.getClass(), "trophyId", 907200516);
        setIntField(term187382, term187382.getClass(), "playCount", -2022414187);
        setIntField(term187382, term187382.getClass(), "playVsCount", -1344470563);
        setIntField(term187382, term187382.getClass(), "playSyncCount", -791458673);
        setIntField(term187382, term187382.getClass(), "winCount", -1363139657);
        setIntField(term187382, term187382.getClass(), "helpCount", -1287885106);
        setIntField(term187382, term187382.getClass(), "comboCount", 41458419);
        setIntField(term187382, term187382.getClass(), "feverCount", -927034658);
        setIntField(term187382, term187382.getClass(), "totalHiScore", -495109012);
        setIntField(term187382, term187382.getClass(), "totalEasyHighScore", -1056451884);
        setIntField(term187382, term187382.getClass(), "totalBasicHighScore", 972525295);
        setIntField(term187382, term187382.getClass(), "totalAdvancedHighScore", 510633890);
        setIntField(term187382, term187382.getClass(), "totalExpertHighScore", -1687219669);
        setIntField(term187382, term187382.getClass(), "totalMasterHighScore", 1524862265);
        setIntField(term187382, term187382.getClass(), "totalReMasterHighScore", -358964327);
        setIntField(term187382, term187382.getClass(), "totalHighSync", -449070744);
        setIntField(term187382, term187382.getClass(), "totalEasySync", 1541411377);
        setIntField(term187382, term187382.getClass(), "totalBasicSync", 190495382);
        setIntField(term187382, term187382.getClass(), "totalAdvancedSync", 1945670371);
        setIntField(term187382, term187382.getClass(), "totalExpertSync", 418708429);
        setIntField(term187382, term187382.getClass(), "totalMasterSync", -128095447);
        setIntField(term187382, term187382.getClass(), "totalReMasterSync", -309711442);
        setIntField(term187382, term187382.getClass(), "playerRating", 2144312377);
        setIntField(term187382, term187382.getClass(), "highestRating", -1222180796);
        setIntField(term187382, term187382.getClass(), "rankAuthTailId", 1524166809);
        setField(term187382, term187382.getClass(), "eventWatchedDate", "wZvDZQbQkT");
        setField(term187382, term187382.getClass(), "webLimitDate", "PjoFrjVnvp");
        setIntField(term187382, term187382.getClass(), "challengeTrackPhase", 2077786067);
        setIntField(term187382, term187382.getClass(), "firstPlayBits", 961435421);
        setField(term187382, term187382.getClass(), "lastPlayDate", "GpMCgmyrOD");
        setIntField(term187382, term187382.getClass(), "lastPlaceId", 783898390);
        setField(term187382, term187382.getClass(), "lastPlaceName", "PLzRVzTTYD");
        setIntField(term187382, term187382.getClass(), "lastRegionId", 255934878);
        setField(term187382, term187382.getClass(), "lastRegionName", "CqbaNMhyiw");
        setField(term187382, term187382.getClass(), "lastClientId", "wONtKlWTYQ");
        setField(term187382, term187382.getClass(), "lastCountryCode", "bWswflOaHX");
        setIntField(term187382, term187382.getClass(), "eventPoint", -445365368);
        setIntField(term187382, term187382.getClass(), "totalLv", -58811662);
        setIntField(term187382, term187382.getClass(), "lastLoginBonusDay", -1406354262);
        setIntField(term187382, term187382.getClass(), "lastSurvivalBonusDay", 1659447004);
        setIntField(term187382, term187382.getClass(), "loginBonusLv", -2135933593);
        setField(term187380, term187380.getClass(), "user", term187382);
        setIntField(term187380, term187380.getClass(), "musicId", 215388183);
        setIntField(term187380, term187380.getClass(), "level", 1093097222);
        setIntField(term187380, term187380.getClass(), "playCount", 1748130735);
        setIntField(term187380, term187380.getClass(), "scoreMax", 1601161029);
        setIntField(term187380, term187380.getClass(), "syncRateMax", -979288521);
        setBooleanField(term187380, term187380.getClass(), "isAllPerfect", true);
        setIntField(term187380, term187380.getClass(), "isAllPerfectPlus", 2118698901);
        setIntField(term187380, term187380.getClass(), "fullCombo", 1451177637);
        setIntField(term187380, term187380.getClass(), "maxFever", 693354899);
        setIntField(term187380, term187380.getClass(), "achievement", 540093406);
        term187566 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term187566;
        callMethod(klass, "canEqual", argTypes, term187380, args);
    }

};


