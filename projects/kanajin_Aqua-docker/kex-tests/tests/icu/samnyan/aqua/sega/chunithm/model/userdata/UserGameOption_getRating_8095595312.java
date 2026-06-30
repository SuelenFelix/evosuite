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

public class UserGameOption_getRating_8095595312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54121;

    public UserGameOption_getRating_8095595312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term54127 = new Long(5836128569274066678L);
        term54121 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOption"));
        Object term54123 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term54125 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term54141 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term54142 = newInstance(Class.forName("java.time.LocalDate"));
        Object term54146 = newInstance(Class.forName("java.time.LocalTime"));
        Object term54151 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term54152 = newInstance(Class.forName("java.time.LocalDate"));
        Object term54156 = newInstance(Class.forName("java.time.LocalTime"));
        Object term54173 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term54174 = newInstance(Class.forName("java.time.LocalDate"));
        Object term54178 = newInstance(Class.forName("java.time.LocalTime"));
        Object term54234 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term54235 = newInstance(Class.forName("java.time.LocalDate"));
        Object term54239 = newInstance(Class.forName("java.time.LocalTime"));
        Object term54282 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term54283 = newInstance(Class.forName("java.time.LocalDate"));
        Object term54287 = newInstance(Class.forName("java.time.LocalTime"));
        Object term54328 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term54329 = newInstance(Class.forName("java.time.LocalDate"));
        Object term54333 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term54121, term54121.getClass(), "id", 6091220404570069089L);
        setLongField(term54123, term54123.getClass(), "id", 8116689826697820264L);
        setLongField(term54125, term54125.getClass(), "id", 6594952836231202437L);
        setField(term54125, term54125.getClass(), "extId", term54127);
        setField(term54125, term54125.getClass(), "luid", "YaWdTQZkTw");
        setIntField(term54142, term54142.getClass(), "year", 2010);
        setShortField(term54142, term54142.getClass(), "month", (short) 8);
        setShortField(term54142, term54142.getClass(), "day", (short) 17);
        setField(term54141, term54141.getClass(), "date", term54142);
        setByteField(term54146, term54146.getClass(), "hour", (byte) 5);
        setByteField(term54146, term54146.getClass(), "minute", (byte) 41);
        setByteField(term54146, term54146.getClass(), "second", (byte) 7);
        setIntField(term54146, term54146.getClass(), "nano", 26533684);
        setField(term54141, term54141.getClass(), "time", term54146);
        setField(term54125, term54125.getClass(), "registerTime", term54141);
        setIntField(term54152, term54152.getClass(), "year", 2012);
        setShortField(term54152, term54152.getClass(), "month", (short) 4);
        setShortField(term54152, term54152.getClass(), "day", (short) 28);
        setField(term54151, term54151.getClass(), "date", term54152);
        setByteField(term54156, term54156.getClass(), "hour", (byte) 11);
        setByteField(term54156, term54156.getClass(), "minute", (byte) 47);
        setByteField(term54156, term54156.getClass(), "second", (byte) 25);
        setIntField(term54156, term54156.getClass(), "nano", 790659871);
        setField(term54151, term54151.getClass(), "time", term54156);
        setField(term54125, term54125.getClass(), "accessTime", term54151);
        setField(term54123, term54123.getClass(), "card", term54125);
        setField(term54123, term54123.getClass(), "userName", "QqsjlsXtmm");
        setIntField(term54174, term54174.getClass(), "year", 2013);
        setShortField(term54174, term54174.getClass(), "month", (short) 8);
        setShortField(term54174, term54174.getClass(), "day", (short) 30);
        setField(term54173, term54173.getClass(), "date", term54174);
        setByteField(term54178, term54178.getClass(), "hour", (byte) 23);
        setByteField(term54178, term54178.getClass(), "minute", (byte) 18);
        setByteField(term54178, term54178.getClass(), "second", (byte) 55);
        setIntField(term54178, term54178.getClass(), "nano", 174457563);
        setField(term54173, term54173.getClass(), "time", term54178);
        setField(term54123, term54123.getClass(), "lastLoginDate", term54173);
        setBooleanField(term54123, term54123.getClass(), "isWebJoin", false);
        setField(term54123, term54123.getClass(), "webLimitDate", "FuWUjAYXxz");
        setIntField(term54123, term54123.getClass(), "level", 191435935);
        setIntField(term54123, term54123.getClass(), "reincarnationNum", -1320856251);
        setField(term54123, term54123.getClass(), "exp", "rKIvvYydou");
        setLongField(term54123, term54123.getClass(), "point", -6888944543104457634L);
        setLongField(term54123, term54123.getClass(), "totalPoint", 3965773362038690712L);
        setIntField(term54123, term54123.getClass(), "playCount", 957604584);
        setIntField(term54123, term54123.getClass(), "multiPlayCount", 1124496804);
        setIntField(term54123, term54123.getClass(), "multiWinCount", -792786703);
        setIntField(term54123, term54123.getClass(), "requestResCount", 331010013);
        setIntField(term54123, term54123.getClass(), "acceptResCount", 275287586);
        setIntField(term54123, term54123.getClass(), "successResCount", 628507821);
        setIntField(term54123, term54123.getClass(), "playerRating", 247792610);
        setIntField(term54123, term54123.getClass(), "highestRating", -2059652097);
        setIntField(term54123, term54123.getClass(), "nameplateId", 75564248);
        setIntField(term54123, term54123.getClass(), "frameId", -829801689);
        setIntField(term54123, term54123.getClass(), "characterId", 265481386);
        setIntField(term54123, term54123.getClass(), "trophyId", -893720551);
        setIntField(term54123, term54123.getClass(), "playedTutorialBit", 696829611);
        setIntField(term54123, term54123.getClass(), "firstTutorialCancelNum", 1751983051);
        setIntField(term54123, term54123.getClass(), "masterTutorialCancelNum", -1416766445);
        setIntField(term54123, term54123.getClass(), "totalRepertoireCount", -203238563);
        setIntField(term54123, term54123.getClass(), "totalMapNum", -132358473);
        setLongField(term54123, term54123.getClass(), "totalHiScore", 7329701902499669605L);
        setLongField(term54123, term54123.getClass(), "totalBasicHighScore", 596630330404532696L);
        setLongField(term54123, term54123.getClass(), "totalAdvancedHighScore", 3628778546975266226L);
        setLongField(term54123, term54123.getClass(), "totalExpertHighScore", 5655884987926296954L);
        setLongField(term54123, term54123.getClass(), "totalMasterHighScore", -6055416231811865303L);
        setIntField(term54235, term54235.getClass(), "year", 2025);
        setShortField(term54235, term54235.getClass(), "month", (short) 12);
        setShortField(term54235, term54235.getClass(), "day", (short) 30);
        setField(term54234, term54234.getClass(), "date", term54235);
        setByteField(term54239, term54239.getClass(), "hour", (byte) 16);
        setByteField(term54239, term54239.getClass(), "minute", (byte) 48);
        setByteField(term54239, term54239.getClass(), "second", (byte) 54);
        setIntField(term54239, term54239.getClass(), "nano", 288599555);
        setField(term54234, term54234.getClass(), "time", term54239);
        setField(term54123, term54123.getClass(), "eventWatchedDate", term54234);
        setIntField(term54123, term54123.getClass(), "friendCount", 130567867);
        setBooleanField(term54123, term54123.getClass(), "isMaimai", false);
        setField(term54123, term54123.getClass(), "firstGameId", "KNgeIkQoef");
        setField(term54123, term54123.getClass(), "firstRomVersion", "MeMWAHyjMR");
        setField(term54123, term54123.getClass(), "firstDataVersion", "lTuLOcnSnJ");
        setIntField(term54283, term54283.getClass(), "year", 2014);
        setShortField(term54283, term54283.getClass(), "month", (short) 11);
        setShortField(term54283, term54283.getClass(), "day", (short) 16);
        setField(term54282, term54282.getClass(), "date", term54283);
        setByteField(term54287, term54287.getClass(), "hour", (byte) 22);
        setByteField(term54287, term54287.getClass(), "minute", (byte) 31);
        setByteField(term54287, term54287.getClass(), "second", (byte) 12);
        setIntField(term54287, term54287.getClass(), "nano", 196022579);
        setField(term54282, term54282.getClass(), "time", term54287);
        setField(term54123, term54123.getClass(), "firstPlayDate", term54282);
        setField(term54123, term54123.getClass(), "lastGameId", "govbBrRstA");
        setField(term54123, term54123.getClass(), "lastRomVersion", "zSMUNzRRyM");
        setField(term54123, term54123.getClass(), "lastDataVersion", "aKwJiIZSjJ");
        setIntField(term54329, term54329.getClass(), "year", 2020);
        setShortField(term54329, term54329.getClass(), "month", (short) 4);
        setShortField(term54329, term54329.getClass(), "day", (short) 19);
        setField(term54328, term54328.getClass(), "date", term54329);
        setByteField(term54333, term54333.getClass(), "hour", (byte) 5);
        setByteField(term54333, term54333.getClass(), "minute", (byte) 30);
        setByteField(term54333, term54333.getClass(), "second", (byte) 22);
        setIntField(term54333, term54333.getClass(), "nano", 839145960);
        setField(term54328, term54328.getClass(), "time", term54333);
        setField(term54123, term54123.getClass(), "lastPlayDate", term54328);
        setIntField(term54123, term54123.getClass(), "lastPlaceId", 33782620);
        setField(term54123, term54123.getClass(), "lastPlaceName", "lYbeaINKud");
        setField(term54123, term54123.getClass(), "lastRegionId", "BrwuUkkatt");
        setField(term54123, term54123.getClass(), "lastRegionName", "NjmSJhbVEM");
        setField(term54123, term54123.getClass(), "lastAllNetId", "aftnGRjhKN");
        setField(term54123, term54123.getClass(), "lastClientId", "TirWkyiCHh");
        setField(term54121, term54121.getClass(), "user", term54123);
        setIntField(term54121, term54121.getClass(), "bgInfo", -818766632);
        setIntField(term54121, term54121.getClass(), "fieldColor", 45627161);
        setIntField(term54121, term54121.getClass(), "guideSound", -206817101);
        setIntField(term54121, term54121.getClass(), "soundEffect", 1541533024);
        setIntField(term54121, term54121.getClass(), "guideLine", -1032828989);
        setIntField(term54121, term54121.getClass(), "speed", -649944911);
        setIntField(term54121, term54121.getClass(), "optionSet", -1426067073);
        setIntField(term54121, term54121.getClass(), "matching", -1679645192);
        setIntField(term54121, term54121.getClass(), "judgePos", 1524285721);
        setIntField(term54121, term54121.getClass(), "rating", -808971480);
        setIntField(term54121, term54121.getClass(), "judgeJustice", 534508972);
        setIntField(term54121, term54121.getClass(), "judgeAttack", -301935716);
        setIntField(term54121, term54121.getClass(), "headphone", 1701720681);
        setIntField(term54121, term54121.getClass(), "playerLevel", -378738380);
        setIntField(term54121, term54121.getClass(), "successTap", 1984720770);
        setIntField(term54121, term54121.getClass(), "successExTap", -8765616);
        setIntField(term54121, term54121.getClass(), "successSlideHold", -1365627412);
        setIntField(term54121, term54121.getClass(), "successAir", 520625434);
        setIntField(term54121, term54121.getClass(), "successFlick", 1531056945);
        setIntField(term54121, term54121.getClass(), "successSkill", -2128361795);
        setIntField(term54121, term54121.getClass(), "successTapTimbre", 925239258);
        setIntField(term54121, term54121.getClass(), "privacy", 1041156468);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRating", argTypes, term54121, args);
    }

};


