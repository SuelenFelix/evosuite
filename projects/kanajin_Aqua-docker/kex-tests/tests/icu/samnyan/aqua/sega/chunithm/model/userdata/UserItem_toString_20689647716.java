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

public class UserItem_toString_20689647716 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term128397;

    public UserItem_toString_20689647716() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term128403 = new Long(6906379511067694917L);
        term128397 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserItem"));
        Object term128399 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term128401 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term128417 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term128418 = newInstance(Class.forName("java.time.LocalDate"));
        Object term128422 = newInstance(Class.forName("java.time.LocalTime"));
        Object term128427 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term128428 = newInstance(Class.forName("java.time.LocalDate"));
        Object term128432 = newInstance(Class.forName("java.time.LocalTime"));
        Object term128449 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term128450 = newInstance(Class.forName("java.time.LocalDate"));
        Object term128454 = newInstance(Class.forName("java.time.LocalTime"));
        Object term128510 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term128511 = newInstance(Class.forName("java.time.LocalDate"));
        Object term128515 = newInstance(Class.forName("java.time.LocalTime"));
        Object term128558 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term128559 = newInstance(Class.forName("java.time.LocalDate"));
        Object term128563 = newInstance(Class.forName("java.time.LocalTime"));
        Object term128604 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term128605 = newInstance(Class.forName("java.time.LocalDate"));
        Object term128609 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term128397, term128397.getClass(), "id", 6728314318147485883L);
        setLongField(term128399, term128399.getClass(), "id", -9137168165760106798L);
        setLongField(term128401, term128401.getClass(), "id", 7708778616739137981L);
        setField(term128401, term128401.getClass(), "extId", term128403);
        setField(term128401, term128401.getClass(), "luid", "mYUsMDfwJF");
        setIntField(term128418, term128418.getClass(), "year", 2026);
        setShortField(term128418, term128418.getClass(), "month", (short) 8);
        setShortField(term128418, term128418.getClass(), "day", (short) 28);
        setField(term128417, term128417.getClass(), "date", term128418);
        setByteField(term128422, term128422.getClass(), "hour", (byte) 11);
        setByteField(term128422, term128422.getClass(), "minute", (byte) 49);
        setByteField(term128422, term128422.getClass(), "second", (byte) 46);
        setIntField(term128422, term128422.getClass(), "nano", 100197670);
        setField(term128417, term128417.getClass(), "time", term128422);
        setField(term128401, term128401.getClass(), "registerTime", term128417);
        setIntField(term128428, term128428.getClass(), "year", 2011);
        setShortField(term128428, term128428.getClass(), "month", (short) 7);
        setShortField(term128428, term128428.getClass(), "day", (short) 24);
        setField(term128427, term128427.getClass(), "date", term128428);
        setByteField(term128432, term128432.getClass(), "hour", (byte) 16);
        setByteField(term128432, term128432.getClass(), "minute", (byte) 0);
        setByteField(term128432, term128432.getClass(), "second", (byte) 47);
        setIntField(term128432, term128432.getClass(), "nano", 892722998);
        setField(term128427, term128427.getClass(), "time", term128432);
        setField(term128401, term128401.getClass(), "accessTime", term128427);
        setField(term128399, term128399.getClass(), "card", term128401);
        setField(term128399, term128399.getClass(), "userName", "IYNumeLuJm");
        setIntField(term128450, term128450.getClass(), "year", 2010);
        setShortField(term128450, term128450.getClass(), "month", (short) 7);
        setShortField(term128450, term128450.getClass(), "day", (short) 11);
        setField(term128449, term128449.getClass(), "date", term128450);
        setByteField(term128454, term128454.getClass(), "hour", (byte) 1);
        setByteField(term128454, term128454.getClass(), "minute", (byte) 34);
        setByteField(term128454, term128454.getClass(), "second", (byte) 16);
        setIntField(term128454, term128454.getClass(), "nano", 785092864);
        setField(term128449, term128449.getClass(), "time", term128454);
        setField(term128399, term128399.getClass(), "lastLoginDate", term128449);
        setBooleanField(term128399, term128399.getClass(), "isWebJoin", false);
        setField(term128399, term128399.getClass(), "webLimitDate", "baWqGUwddd");
        setIntField(term128399, term128399.getClass(), "level", 1771106298);
        setIntField(term128399, term128399.getClass(), "reincarnationNum", 489428207);
        setField(term128399, term128399.getClass(), "exp", "ytUYpWefdA");
        setLongField(term128399, term128399.getClass(), "point", 8715204132761098696L);
        setLongField(term128399, term128399.getClass(), "totalPoint", -7560086943976921411L);
        setIntField(term128399, term128399.getClass(), "playCount", -1189670798);
        setIntField(term128399, term128399.getClass(), "multiPlayCount", 1856659430);
        setIntField(term128399, term128399.getClass(), "multiWinCount", 1163865944);
        setIntField(term128399, term128399.getClass(), "requestResCount", 791409574);
        setIntField(term128399, term128399.getClass(), "acceptResCount", 1650362015);
        setIntField(term128399, term128399.getClass(), "successResCount", 1500712275);
        setIntField(term128399, term128399.getClass(), "playerRating", 1770935991);
        setIntField(term128399, term128399.getClass(), "highestRating", -1431015722);
        setIntField(term128399, term128399.getClass(), "nameplateId", 848351607);
        setIntField(term128399, term128399.getClass(), "frameId", -273652793);
        setIntField(term128399, term128399.getClass(), "characterId", 765378004);
        setIntField(term128399, term128399.getClass(), "trophyId", 831719919);
        setIntField(term128399, term128399.getClass(), "playedTutorialBit", 1340129291);
        setIntField(term128399, term128399.getClass(), "firstTutorialCancelNum", -1877793816);
        setIntField(term128399, term128399.getClass(), "masterTutorialCancelNum", 1815838239);
        setIntField(term128399, term128399.getClass(), "totalRepertoireCount", -897797215);
        setIntField(term128399, term128399.getClass(), "totalMapNum", -1187799333);
        setLongField(term128399, term128399.getClass(), "totalHiScore", 9199331845494156353L);
        setLongField(term128399, term128399.getClass(), "totalBasicHighScore", -5753568340370307157L);
        setLongField(term128399, term128399.getClass(), "totalAdvancedHighScore", -7036699446832430477L);
        setLongField(term128399, term128399.getClass(), "totalExpertHighScore", 4078914953725326519L);
        setLongField(term128399, term128399.getClass(), "totalMasterHighScore", 2204505325171318122L);
        setIntField(term128511, term128511.getClass(), "year", 2013);
        setShortField(term128511, term128511.getClass(), "month", (short) 1);
        setShortField(term128511, term128511.getClass(), "day", (short) 21);
        setField(term128510, term128510.getClass(), "date", term128511);
        setByteField(term128515, term128515.getClass(), "hour", (byte) 3);
        setByteField(term128515, term128515.getClass(), "minute", (byte) 21);
        setByteField(term128515, term128515.getClass(), "second", (byte) 11);
        setIntField(term128515, term128515.getClass(), "nano", 386422534);
        setField(term128510, term128510.getClass(), "time", term128515);
        setField(term128399, term128399.getClass(), "eventWatchedDate", term128510);
        setIntField(term128399, term128399.getClass(), "friendCount", -1222671412);
        setBooleanField(term128399, term128399.getClass(), "isMaimai", true);
        setField(term128399, term128399.getClass(), "firstGameId", "fdBtFIcFIQ");
        setField(term128399, term128399.getClass(), "firstRomVersion", "XixxNbivtN");
        setField(term128399, term128399.getClass(), "firstDataVersion", "wOXNBqWiix");
        setIntField(term128559, term128559.getClass(), "year", 2018);
        setShortField(term128559, term128559.getClass(), "month", (short) 12);
        setShortField(term128559, term128559.getClass(), "day", (short) 17);
        setField(term128558, term128558.getClass(), "date", term128559);
        setByteField(term128563, term128563.getClass(), "hour", (byte) 14);
        setByteField(term128563, term128563.getClass(), "minute", (byte) 2);
        setByteField(term128563, term128563.getClass(), "second", (byte) 27);
        setIntField(term128563, term128563.getClass(), "nano", 303910253);
        setField(term128558, term128558.getClass(), "time", term128563);
        setField(term128399, term128399.getClass(), "firstPlayDate", term128558);
        setField(term128399, term128399.getClass(), "lastGameId", "inGpCNlqqu");
        setField(term128399, term128399.getClass(), "lastRomVersion", "PzAzTtIUoU");
        setField(term128399, term128399.getClass(), "lastDataVersion", "pltGCOzvHY");
        setIntField(term128605, term128605.getClass(), "year", 2022);
        setShortField(term128605, term128605.getClass(), "month", (short) 1);
        setShortField(term128605, term128605.getClass(), "day", (short) 18);
        setField(term128604, term128604.getClass(), "date", term128605);
        setByteField(term128609, term128609.getClass(), "hour", (byte) 14);
        setByteField(term128609, term128609.getClass(), "minute", (byte) 16);
        setByteField(term128609, term128609.getClass(), "second", (byte) 30);
        setIntField(term128609, term128609.getClass(), "nano", 392308423);
        setField(term128604, term128604.getClass(), "time", term128609);
        setField(term128399, term128399.getClass(), "lastPlayDate", term128604);
        setIntField(term128399, term128399.getClass(), "lastPlaceId", 1753444798);
        setField(term128399, term128399.getClass(), "lastPlaceName", "snpbZcNTTs");
        setField(term128399, term128399.getClass(), "lastRegionId", "SXATqDKVMx");
        setField(term128399, term128399.getClass(), "lastRegionName", "WmLDnzSUcH");
        setField(term128399, term128399.getClass(), "lastAllNetId", "jzYgniVftZ");
        setField(term128399, term128399.getClass(), "lastClientId", "hCbXOXOOYP");
        setField(term128397, term128397.getClass(), "user", term128399);
        setIntField(term128397, term128397.getClass(), "itemKind", -1511001461);
        setIntField(term128397, term128397.getClass(), "itemId", -1668810633);
        setIntField(term128397, term128397.getClass(), "stock", 1);
        setBooleanField(term128397, term128397.getClass(), "isValid", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term128397, args);
    }

};


