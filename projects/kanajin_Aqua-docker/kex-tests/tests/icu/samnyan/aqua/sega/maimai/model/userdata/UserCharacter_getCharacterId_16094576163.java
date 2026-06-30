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

public class UserCharacter_getCharacterId_16094576163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33401;

    public UserCharacter_getCharacterId_16094576163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term33407 = new Long(1215116475929634177L);
        term33401 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserCharacter"));
        Object term33403 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term33405 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term33421 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term33422 = newInstance(Class.forName("java.time.LocalDate"));
        Object term33426 = newInstance(Class.forName("java.time.LocalTime"));
        Object term33431 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term33432 = newInstance(Class.forName("java.time.LocalDate"));
        Object term33436 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term33401, term33401.getClass(), "id", -419800263764810394L);
        setLongField(term33403, term33403.getClass(), "id", 5904678961906211249L);
        setLongField(term33405, term33405.getClass(), "id", -1820639665251914495L);
        setField(term33405, term33405.getClass(), "extId", term33407);
        setField(term33405, term33405.getClass(), "luid", "NoAFAfGyYL");
        setIntField(term33422, term33422.getClass(), "year", 2018);
        setShortField(term33422, term33422.getClass(), "month", (short) 5);
        setShortField(term33422, term33422.getClass(), "day", (short) 13);
        setField(term33421, term33421.getClass(), "date", term33422);
        setByteField(term33426, term33426.getClass(), "hour", (byte) 0);
        setByteField(term33426, term33426.getClass(), "minute", (byte) 47);
        setByteField(term33426, term33426.getClass(), "second", (byte) 45);
        setIntField(term33426, term33426.getClass(), "nano", 10058361);
        setField(term33421, term33421.getClass(), "time", term33426);
        setField(term33405, term33405.getClass(), "registerTime", term33421);
        setIntField(term33432, term33432.getClass(), "year", 2014);
        setShortField(term33432, term33432.getClass(), "month", (short) 6);
        setShortField(term33432, term33432.getClass(), "day", (short) 11);
        setField(term33431, term33431.getClass(), "date", term33432);
        setByteField(term33436, term33436.getClass(), "hour", (byte) 8);
        setByteField(term33436, term33436.getClass(), "minute", (byte) 55);
        setByteField(term33436, term33436.getClass(), "second", (byte) 58);
        setIntField(term33436, term33436.getClass(), "nano", 376244535);
        setField(term33431, term33431.getClass(), "time", term33436);
        setField(term33405, term33405.getClass(), "accessTime", term33431);
        setField(term33403, term33403.getClass(), "card", term33405);
        setIntField(term33403, term33403.getClass(), "lastDataVersion", -920088882);
        setField(term33403, term33403.getClass(), "userName", "MFtfkBMyOD");
        setIntField(term33403, term33403.getClass(), "point", -1963888580);
        setIntField(term33403, term33403.getClass(), "totalPoint", 885969140);
        setIntField(term33403, term33403.getClass(), "iconId", -573115224);
        setIntField(term33403, term33403.getClass(), "nameplateId", 716083613);
        setIntField(term33403, term33403.getClass(), "frameId", 236114197);
        setIntField(term33403, term33403.getClass(), "trophyId", -1633292626);
        setIntField(term33403, term33403.getClass(), "playCount", 689769597);
        setIntField(term33403, term33403.getClass(), "playVsCount", -1219602723);
        setIntField(term33403, term33403.getClass(), "playSyncCount", 1668201364);
        setIntField(term33403, term33403.getClass(), "winCount", -548343635);
        setIntField(term33403, term33403.getClass(), "helpCount", -590979324);
        setIntField(term33403, term33403.getClass(), "comboCount", -1745427158);
        setIntField(term33403, term33403.getClass(), "feverCount", 1516032954);
        setIntField(term33403, term33403.getClass(), "totalHiScore", -1945165354);
        setIntField(term33403, term33403.getClass(), "totalEasyHighScore", 14341670);
        setIntField(term33403, term33403.getClass(), "totalBasicHighScore", -144022361);
        setIntField(term33403, term33403.getClass(), "totalAdvancedHighScore", -1419212893);
        setIntField(term33403, term33403.getClass(), "totalExpertHighScore", -457189882);
        setIntField(term33403, term33403.getClass(), "totalMasterHighScore", -1227023001);
        setIntField(term33403, term33403.getClass(), "totalReMasterHighScore", -622827471);
        setIntField(term33403, term33403.getClass(), "totalHighSync", -1759579486);
        setIntField(term33403, term33403.getClass(), "totalEasySync", 147748970);
        setIntField(term33403, term33403.getClass(), "totalBasicSync", -459525196);
        setIntField(term33403, term33403.getClass(), "totalAdvancedSync", 2129073623);
        setIntField(term33403, term33403.getClass(), "totalExpertSync", -1623896406);
        setIntField(term33403, term33403.getClass(), "totalMasterSync", -1767855347);
        setIntField(term33403, term33403.getClass(), "totalReMasterSync", 2061882718);
        setIntField(term33403, term33403.getClass(), "playerRating", -263593334);
        setIntField(term33403, term33403.getClass(), "highestRating", 257595375);
        setIntField(term33403, term33403.getClass(), "rankAuthTailId", 1494109106);
        setField(term33403, term33403.getClass(), "eventWatchedDate", "rdiIyXfRtL");
        setField(term33403, term33403.getClass(), "webLimitDate", "douzkltmiI");
        setIntField(term33403, term33403.getClass(), "challengeTrackPhase", 1902576230);
        setIntField(term33403, term33403.getClass(), "firstPlayBits", -1040460528);
        setField(term33403, term33403.getClass(), "lastPlayDate", "MFKjhvLtpe");
        setIntField(term33403, term33403.getClass(), "lastPlaceId", 990725836);
        setField(term33403, term33403.getClass(), "lastPlaceName", "xpbLKEsput");
        setIntField(term33403, term33403.getClass(), "lastRegionId", -1231785501);
        setField(term33403, term33403.getClass(), "lastRegionName", "urlyLwPBVn");
        setField(term33403, term33403.getClass(), "lastClientId", "SPQVzOlOzZ");
        setField(term33403, term33403.getClass(), "lastCountryCode", "bOUAgAptAI");
        setIntField(term33403, term33403.getClass(), "eventPoint", -2112346885);
        setIntField(term33403, term33403.getClass(), "totalLv", -26311618);
        setIntField(term33403, term33403.getClass(), "lastLoginBonusDay", -671595545);
        setIntField(term33403, term33403.getClass(), "lastSurvivalBonusDay", -143541686);
        setIntField(term33403, term33403.getClass(), "loginBonusLv", -1201234880);
        setField(term33401, term33401.getClass(), "user", term33403);
        setIntField(term33401, term33401.getClass(), "characterId", 1402881126);
        setIntField(term33401, term33401.getClass(), "point", 786987666);
        setIntField(term33401, term33401.getClass(), "level", 1810592574);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserCharacter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCharacterId", argTypes, term33401, args);
    }

};


