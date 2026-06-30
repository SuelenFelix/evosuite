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

public class UserCharacter_toString_8562362914 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36634;

    public UserCharacter_toString_8562362914() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term36640 = new Long(2297097306706899827L);
        term36634 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserCharacter"));
        Object term36636 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term36638 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term36654 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term36655 = newInstance(Class.forName("java.time.LocalDate"));
        Object term36659 = newInstance(Class.forName("java.time.LocalTime"));
        Object term36664 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term36665 = newInstance(Class.forName("java.time.LocalDate"));
        Object term36669 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term36634, term36634.getClass(), "id", 4069264186851023313L);
        setLongField(term36636, term36636.getClass(), "id", 5184635470881147510L);
        setLongField(term36638, term36638.getClass(), "id", 918397384129253729L);
        setField(term36638, term36638.getClass(), "extId", term36640);
        setField(term36638, term36638.getClass(), "luid", "cGQJTTxcXr");
        setIntField(term36655, term36655.getClass(), "year", 2024);
        setShortField(term36655, term36655.getClass(), "month", (short) 9);
        setShortField(term36655, term36655.getClass(), "day", (short) 7);
        setField(term36654, term36654.getClass(), "date", term36655);
        setByteField(term36659, term36659.getClass(), "hour", (byte) 2);
        setByteField(term36659, term36659.getClass(), "minute", (byte) 37);
        setByteField(term36659, term36659.getClass(), "second", (byte) 4);
        setIntField(term36659, term36659.getClass(), "nano", 236043949);
        setField(term36654, term36654.getClass(), "time", term36659);
        setField(term36638, term36638.getClass(), "registerTime", term36654);
        setIntField(term36665, term36665.getClass(), "year", 2025);
        setShortField(term36665, term36665.getClass(), "month", (short) 7);
        setShortField(term36665, term36665.getClass(), "day", (short) 4);
        setField(term36664, term36664.getClass(), "date", term36665);
        setByteField(term36669, term36669.getClass(), "hour", (byte) 18);
        setByteField(term36669, term36669.getClass(), "minute", (byte) 13);
        setByteField(term36669, term36669.getClass(), "second", (byte) 37);
        setIntField(term36669, term36669.getClass(), "nano", 681447348);
        setField(term36664, term36664.getClass(), "time", term36669);
        setField(term36638, term36638.getClass(), "accessTime", term36664);
        setField(term36636, term36636.getClass(), "card", term36638);
        setIntField(term36636, term36636.getClass(), "lastDataVersion", -416886439);
        setField(term36636, term36636.getClass(), "userName", "aKaqvssiby");
        setIntField(term36636, term36636.getClass(), "point", -1632599980);
        setIntField(term36636, term36636.getClass(), "totalPoint", -445306395);
        setIntField(term36636, term36636.getClass(), "iconId", -1543037055);
        setIntField(term36636, term36636.getClass(), "nameplateId", -150763986);
        setIntField(term36636, term36636.getClass(), "frameId", 1946252506);
        setIntField(term36636, term36636.getClass(), "trophyId", -1279902182);
        setIntField(term36636, term36636.getClass(), "playCount", -551427938);
        setIntField(term36636, term36636.getClass(), "playVsCount", 1334551737);
        setIntField(term36636, term36636.getClass(), "playSyncCount", -1187792021);
        setIntField(term36636, term36636.getClass(), "winCount", 1724189490);
        setIntField(term36636, term36636.getClass(), "helpCount", -850819450);
        setIntField(term36636, term36636.getClass(), "comboCount", 1652716990);
        setIntField(term36636, term36636.getClass(), "feverCount", 958228032);
        setIntField(term36636, term36636.getClass(), "totalHiScore", 624789164);
        setIntField(term36636, term36636.getClass(), "totalEasyHighScore", 117919201);
        setIntField(term36636, term36636.getClass(), "totalBasicHighScore", 1389237948);
        setIntField(term36636, term36636.getClass(), "totalAdvancedHighScore", 866670285);
        setIntField(term36636, term36636.getClass(), "totalExpertHighScore", -2004076717);
        setIntField(term36636, term36636.getClass(), "totalMasterHighScore", -1695237959);
        setIntField(term36636, term36636.getClass(), "totalReMasterHighScore", 1317356126);
        setIntField(term36636, term36636.getClass(), "totalHighSync", 2058932005);
        setIntField(term36636, term36636.getClass(), "totalEasySync", -773196588);
        setIntField(term36636, term36636.getClass(), "totalBasicSync", -1082451840);
        setIntField(term36636, term36636.getClass(), "totalAdvancedSync", 120368183);
        setIntField(term36636, term36636.getClass(), "totalExpertSync", 1721841052);
        setIntField(term36636, term36636.getClass(), "totalMasterSync", -1801745263);
        setIntField(term36636, term36636.getClass(), "totalReMasterSync", 1232286807);
        setIntField(term36636, term36636.getClass(), "playerRating", -507386961);
        setIntField(term36636, term36636.getClass(), "highestRating", -476320083);
        setIntField(term36636, term36636.getClass(), "rankAuthTailId", -2100928588);
        setField(term36636, term36636.getClass(), "eventWatchedDate", "tTVbtBVAfo");
        setField(term36636, term36636.getClass(), "webLimitDate", "cjaaJUnNCR");
        setIntField(term36636, term36636.getClass(), "challengeTrackPhase", -81621107);
        setIntField(term36636, term36636.getClass(), "firstPlayBits", -1617104329);
        setField(term36636, term36636.getClass(), "lastPlayDate", "ETbxNuJLii");
        setIntField(term36636, term36636.getClass(), "lastPlaceId", -34705122);
        setField(term36636, term36636.getClass(), "lastPlaceName", "YJhnPtWtJR");
        setIntField(term36636, term36636.getClass(), "lastRegionId", 1705528966);
        setField(term36636, term36636.getClass(), "lastRegionName", "xzGnrvbExX");
        setField(term36636, term36636.getClass(), "lastClientId", "LFZNDELxUZ");
        setField(term36636, term36636.getClass(), "lastCountryCode", "GNIVsSTglt");
        setIntField(term36636, term36636.getClass(), "eventPoint", 988288101);
        setIntField(term36636, term36636.getClass(), "totalLv", -1408161596);
        setIntField(term36636, term36636.getClass(), "lastLoginBonusDay", 1726412898);
        setIntField(term36636, term36636.getClass(), "lastSurvivalBonusDay", -669874944);
        setIntField(term36636, term36636.getClass(), "loginBonusLv", -1111349476);
        setField(term36634, term36634.getClass(), "user", term36636);
        setIntField(term36634, term36634.getClass(), "characterId", 742969465);
        setIntField(term36634, term36634.getClass(), "point", -1810335427);
        setIntField(term36634, term36634.getClass(), "level", 803994786);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserCharacter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term36634, args);
    }

};


