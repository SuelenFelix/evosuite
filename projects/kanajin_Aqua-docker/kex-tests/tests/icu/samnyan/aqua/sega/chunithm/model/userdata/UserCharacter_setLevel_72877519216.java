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

public class UserCharacter_setLevel_72877519216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term115458;
     Object term115745;

    public UserCharacter_setLevel_72877519216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term115464 = new Long(3238645206498300107L);
        term115458 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCharacter"));
        Object term115460 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term115462 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term115478 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term115479 = newInstance(Class.forName("java.time.LocalDate"));
        Object term115483 = newInstance(Class.forName("java.time.LocalTime"));
        Object term115488 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term115489 = newInstance(Class.forName("java.time.LocalDate"));
        Object term115493 = newInstance(Class.forName("java.time.LocalTime"));
        Object term115510 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term115511 = newInstance(Class.forName("java.time.LocalDate"));
        Object term115515 = newInstance(Class.forName("java.time.LocalTime"));
        Object term115571 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term115572 = newInstance(Class.forName("java.time.LocalDate"));
        Object term115576 = newInstance(Class.forName("java.time.LocalTime"));
        Object term115619 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term115620 = newInstance(Class.forName("java.time.LocalDate"));
        Object term115624 = newInstance(Class.forName("java.time.LocalTime"));
        Object term115665 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term115666 = newInstance(Class.forName("java.time.LocalDate"));
        Object term115670 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term115458, term115458.getClass(), "id", 3263003405250803159L);
        setLongField(term115460, term115460.getClass(), "id", 7457643343142968442L);
        setLongField(term115462, term115462.getClass(), "id", -1467781323351622064L);
        setField(term115462, term115462.getClass(), "extId", term115464);
        setField(term115462, term115462.getClass(), "luid", "exVBhDpyTv");
        setIntField(term115479, term115479.getClass(), "year", 2019);
        setShortField(term115479, term115479.getClass(), "month", (short) 8);
        setShortField(term115479, term115479.getClass(), "day", (short) 16);
        setField(term115478, term115478.getClass(), "date", term115479);
        setByteField(term115483, term115483.getClass(), "hour", (byte) 4);
        setByteField(term115483, term115483.getClass(), "minute", (byte) 5);
        setByteField(term115483, term115483.getClass(), "second", (byte) 12);
        setIntField(term115483, term115483.getClass(), "nano", 47206353);
        setField(term115478, term115478.getClass(), "time", term115483);
        setField(term115462, term115462.getClass(), "registerTime", term115478);
        setIntField(term115489, term115489.getClass(), "year", 2023);
        setShortField(term115489, term115489.getClass(), "month", (short) 7);
        setShortField(term115489, term115489.getClass(), "day", (short) 30);
        setField(term115488, term115488.getClass(), "date", term115489);
        setByteField(term115493, term115493.getClass(), "hour", (byte) 0);
        setByteField(term115493, term115493.getClass(), "minute", (byte) 18);
        setByteField(term115493, term115493.getClass(), "second", (byte) 26);
        setIntField(term115493, term115493.getClass(), "nano", 187537490);
        setField(term115488, term115488.getClass(), "time", term115493);
        setField(term115462, term115462.getClass(), "accessTime", term115488);
        setField(term115460, term115460.getClass(), "card", term115462);
        setField(term115460, term115460.getClass(), "userName", "HIROkhxmYq");
        setIntField(term115511, term115511.getClass(), "year", 2027);
        setShortField(term115511, term115511.getClass(), "month", (short) 7);
        setShortField(term115511, term115511.getClass(), "day", (short) 11);
        setField(term115510, term115510.getClass(), "date", term115511);
        setByteField(term115515, term115515.getClass(), "hour", (byte) 7);
        setByteField(term115515, term115515.getClass(), "minute", (byte) 42);
        setByteField(term115515, term115515.getClass(), "second", (byte) 4);
        setIntField(term115515, term115515.getClass(), "nano", 413305212);
        setField(term115510, term115510.getClass(), "time", term115515);
        setField(term115460, term115460.getClass(), "lastLoginDate", term115510);
        setBooleanField(term115460, term115460.getClass(), "isWebJoin", false);
        setField(term115460, term115460.getClass(), "webLimitDate", "IOCISrBpxa");
        setIntField(term115460, term115460.getClass(), "level", -1203130784);
        setIntField(term115460, term115460.getClass(), "reincarnationNum", 728397857);
        setField(term115460, term115460.getClass(), "exp", "xYPVdJYlie");
        setLongField(term115460, term115460.getClass(), "point", -5585704080249558832L);
        setLongField(term115460, term115460.getClass(), "totalPoint", 4016618299857011653L);
        setIntField(term115460, term115460.getClass(), "playCount", -1851390582);
        setIntField(term115460, term115460.getClass(), "multiPlayCount", 436551890);
        setIntField(term115460, term115460.getClass(), "multiWinCount", -1176677999);
        setIntField(term115460, term115460.getClass(), "requestResCount", -1491389341);
        setIntField(term115460, term115460.getClass(), "acceptResCount", -1204433663);
        setIntField(term115460, term115460.getClass(), "successResCount", 784981368);
        setIntField(term115460, term115460.getClass(), "playerRating", 1786501867);
        setIntField(term115460, term115460.getClass(), "highestRating", 608414757);
        setIntField(term115460, term115460.getClass(), "nameplateId", -67554229);
        setIntField(term115460, term115460.getClass(), "frameId", 1715935221);
        setIntField(term115460, term115460.getClass(), "characterId", 1396211446);
        setIntField(term115460, term115460.getClass(), "trophyId", -407124155);
        setIntField(term115460, term115460.getClass(), "playedTutorialBit", 488605627);
        setIntField(term115460, term115460.getClass(), "firstTutorialCancelNum", 469579894);
        setIntField(term115460, term115460.getClass(), "masterTutorialCancelNum", 1767003547);
        setIntField(term115460, term115460.getClass(), "totalRepertoireCount", -2092805936);
        setIntField(term115460, term115460.getClass(), "totalMapNum", -1286454716);
        setLongField(term115460, term115460.getClass(), "totalHiScore", -8830414189681727376L);
        setLongField(term115460, term115460.getClass(), "totalBasicHighScore", 3804733307680394319L);
        setLongField(term115460, term115460.getClass(), "totalAdvancedHighScore", -5476696661208638394L);
        setLongField(term115460, term115460.getClass(), "totalExpertHighScore", -2060623851955948674L);
        setLongField(term115460, term115460.getClass(), "totalMasterHighScore", -330187935331339969L);
        setIntField(term115572, term115572.getClass(), "year", 2028);
        setShortField(term115572, term115572.getClass(), "month", (short) 6);
        setShortField(term115572, term115572.getClass(), "day", (short) 1);
        setField(term115571, term115571.getClass(), "date", term115572);
        setByteField(term115576, term115576.getClass(), "hour", (byte) 17);
        setByteField(term115576, term115576.getClass(), "minute", (byte) 36);
        setByteField(term115576, term115576.getClass(), "second", (byte) 14);
        setIntField(term115576, term115576.getClass(), "nano", 720148114);
        setField(term115571, term115571.getClass(), "time", term115576);
        setField(term115460, term115460.getClass(), "eventWatchedDate", term115571);
        setIntField(term115460, term115460.getClass(), "friendCount", -1514697210);
        setBooleanField(term115460, term115460.getClass(), "isMaimai", true);
        setField(term115460, term115460.getClass(), "firstGameId", "ReKmMCwzEQ");
        setField(term115460, term115460.getClass(), "firstRomVersion", "tNcYNTIZXy");
        setField(term115460, term115460.getClass(), "firstDataVersion", "XntyZLMPel");
        setIntField(term115620, term115620.getClass(), "year", 2023);
        setShortField(term115620, term115620.getClass(), "month", (short) 5);
        setShortField(term115620, term115620.getClass(), "day", (short) 2);
        setField(term115619, term115619.getClass(), "date", term115620);
        setByteField(term115624, term115624.getClass(), "hour", (byte) 12);
        setByteField(term115624, term115624.getClass(), "minute", (byte) 32);
        setByteField(term115624, term115624.getClass(), "second", (byte) 16);
        setIntField(term115624, term115624.getClass(), "nano", 791561001);
        setField(term115619, term115619.getClass(), "time", term115624);
        setField(term115460, term115460.getClass(), "firstPlayDate", term115619);
        setField(term115460, term115460.getClass(), "lastGameId", "kRYwILGOiG");
        setField(term115460, term115460.getClass(), "lastRomVersion", "lGzUITCYwf");
        setField(term115460, term115460.getClass(), "lastDataVersion", "OOTylmfCYh");
        setIntField(term115666, term115666.getClass(), "year", 2028);
        setShortField(term115666, term115666.getClass(), "month", (short) 10);
        setShortField(term115666, term115666.getClass(), "day", (short) 26);
        setField(term115665, term115665.getClass(), "date", term115666);
        setByteField(term115670, term115670.getClass(), "hour", (byte) 22);
        setByteField(term115670, term115670.getClass(), "minute", (byte) 23);
        setByteField(term115670, term115670.getClass(), "second", (byte) 48);
        setIntField(term115670, term115670.getClass(), "nano", 951922094);
        setField(term115665, term115665.getClass(), "time", term115670);
        setField(term115460, term115460.getClass(), "lastPlayDate", term115665);
        setIntField(term115460, term115460.getClass(), "lastPlaceId", -1991261137);
        setField(term115460, term115460.getClass(), "lastPlaceName", "tDqwvIixso");
        setField(term115460, term115460.getClass(), "lastRegionId", "liEYQdFeWW");
        setField(term115460, term115460.getClass(), "lastRegionName", "ADqXMyhBwX");
        setField(term115460, term115460.getClass(), "lastAllNetId", "bxkUNyUzCb");
        setField(term115460, term115460.getClass(), "lastClientId", "lyiWNZdiRp");
        setField(term115458, term115458.getClass(), "user", term115460);
        setIntField(term115458, term115458.getClass(), "characterId", 353940151);
        setIntField(term115458, term115458.getClass(), "playCount", 1335341338);
        setIntField(term115458, term115458.getClass(), "level", 1);
        setIntField(term115458, term115458.getClass(), "skillId", 1933669224);
        setIntField(term115458, term115458.getClass(), "friendshipExp", -455605328);
        setBooleanField(term115458, term115458.getClass(), "isValid", true);
        setBooleanField(term115458, term115458.getClass(), "isNewMark", true);
        setIntField(term115458, term115458.getClass(), "param1", 988952771);
        setIntField(term115458, term115458.getClass(), "param2", 860466584);
        term115745 = new Integer(-1230615258);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCharacter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term115745;
        callMethod(klass, "setLevel", argTypes, term115458, args);
    }

};


