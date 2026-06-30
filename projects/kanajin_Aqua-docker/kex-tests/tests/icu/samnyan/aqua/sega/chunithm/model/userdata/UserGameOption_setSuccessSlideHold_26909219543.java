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

public class UserGameOption_setSuccessSlideHold_26909219543 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68531;
     Object term68831;

    public UserGameOption_setSuccessSlideHold_26909219543() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term68537 = new Long(1084801489398441516L);
        term68531 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOption"));
        Object term68533 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term68535 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term68551 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term68552 = newInstance(Class.forName("java.time.LocalDate"));
        Object term68556 = newInstance(Class.forName("java.time.LocalTime"));
        Object term68561 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term68562 = newInstance(Class.forName("java.time.LocalDate"));
        Object term68566 = newInstance(Class.forName("java.time.LocalTime"));
        Object term68583 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term68584 = newInstance(Class.forName("java.time.LocalDate"));
        Object term68588 = newInstance(Class.forName("java.time.LocalTime"));
        Object term68644 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term68645 = newInstance(Class.forName("java.time.LocalDate"));
        Object term68649 = newInstance(Class.forName("java.time.LocalTime"));
        Object term68692 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term68693 = newInstance(Class.forName("java.time.LocalDate"));
        Object term68697 = newInstance(Class.forName("java.time.LocalTime"));
        Object term68738 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term68739 = newInstance(Class.forName("java.time.LocalDate"));
        Object term68743 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term68531, term68531.getClass(), "id", 7842681756773659507L);
        setLongField(term68533, term68533.getClass(), "id", 4491201672462106083L);
        setLongField(term68535, term68535.getClass(), "id", 9035414347228692356L);
        setField(term68535, term68535.getClass(), "extId", term68537);
        setField(term68535, term68535.getClass(), "luid", "LBNEEquiet");
        setIntField(term68552, term68552.getClass(), "year", 2016);
        setShortField(term68552, term68552.getClass(), "month", (short) 12);
        setShortField(term68552, term68552.getClass(), "day", (short) 23);
        setField(term68551, term68551.getClass(), "date", term68552);
        setByteField(term68556, term68556.getClass(), "hour", (byte) 13);
        setByteField(term68556, term68556.getClass(), "minute", (byte) 59);
        setByteField(term68556, term68556.getClass(), "second", (byte) 38);
        setIntField(term68556, term68556.getClass(), "nano", 70840095);
        setField(term68551, term68551.getClass(), "time", term68556);
        setField(term68535, term68535.getClass(), "registerTime", term68551);
        setIntField(term68562, term68562.getClass(), "year", 2029);
        setShortField(term68562, term68562.getClass(), "month", (short) 7);
        setShortField(term68562, term68562.getClass(), "day", (short) 14);
        setField(term68561, term68561.getClass(), "date", term68562);
        setByteField(term68566, term68566.getClass(), "hour", (byte) 23);
        setByteField(term68566, term68566.getClass(), "minute", (byte) 7);
        setByteField(term68566, term68566.getClass(), "second", (byte) 5);
        setIntField(term68566, term68566.getClass(), "nano", 909102915);
        setField(term68561, term68561.getClass(), "time", term68566);
        setField(term68535, term68535.getClass(), "accessTime", term68561);
        setField(term68533, term68533.getClass(), "card", term68535);
        setField(term68533, term68533.getClass(), "userName", "cBMdxJirJj");
        setIntField(term68584, term68584.getClass(), "year", 2016);
        setShortField(term68584, term68584.getClass(), "month", (short) 12);
        setShortField(term68584, term68584.getClass(), "day", (short) 21);
        setField(term68583, term68583.getClass(), "date", term68584);
        setByteField(term68588, term68588.getClass(), "hour", (byte) 14);
        setByteField(term68588, term68588.getClass(), "minute", (byte) 3);
        setByteField(term68588, term68588.getClass(), "second", (byte) 9);
        setIntField(term68588, term68588.getClass(), "nano", 805869273);
        setField(term68583, term68583.getClass(), "time", term68588);
        setField(term68533, term68533.getClass(), "lastLoginDate", term68583);
        setBooleanField(term68533, term68533.getClass(), "isWebJoin", false);
        setField(term68533, term68533.getClass(), "webLimitDate", "kVnxgkemHF");
        setIntField(term68533, term68533.getClass(), "level", 1731404822);
        setIntField(term68533, term68533.getClass(), "reincarnationNum", -877806535);
        setField(term68533, term68533.getClass(), "exp", "JUQnEoujef");
        setLongField(term68533, term68533.getClass(), "point", -6860884095299687457L);
        setLongField(term68533, term68533.getClass(), "totalPoint", 7536418221491626978L);
        setIntField(term68533, term68533.getClass(), "playCount", -1489914829);
        setIntField(term68533, term68533.getClass(), "multiPlayCount", -1208940453);
        setIntField(term68533, term68533.getClass(), "multiWinCount", 661206297);
        setIntField(term68533, term68533.getClass(), "requestResCount", 155345516);
        setIntField(term68533, term68533.getClass(), "acceptResCount", 1328408059);
        setIntField(term68533, term68533.getClass(), "successResCount", 1491641290);
        setIntField(term68533, term68533.getClass(), "playerRating", 917414277);
        setIntField(term68533, term68533.getClass(), "highestRating", 1585368761);
        setIntField(term68533, term68533.getClass(), "nameplateId", -1814545416);
        setIntField(term68533, term68533.getClass(), "frameId", -1486799161);
        setIntField(term68533, term68533.getClass(), "characterId", -455064174);
        setIntField(term68533, term68533.getClass(), "trophyId", -1278860746);
        setIntField(term68533, term68533.getClass(), "playedTutorialBit", 1573046503);
        setIntField(term68533, term68533.getClass(), "firstTutorialCancelNum", -1546535153);
        setIntField(term68533, term68533.getClass(), "masterTutorialCancelNum", 933284110);
        setIntField(term68533, term68533.getClass(), "totalRepertoireCount", -2017108585);
        setIntField(term68533, term68533.getClass(), "totalMapNum", 1915480534);
        setLongField(term68533, term68533.getClass(), "totalHiScore", 8852560867977898159L);
        setLongField(term68533, term68533.getClass(), "totalBasicHighScore", -8478725267603949004L);
        setLongField(term68533, term68533.getClass(), "totalAdvancedHighScore", 7338947505433756976L);
        setLongField(term68533, term68533.getClass(), "totalExpertHighScore", -6284173466459484010L);
        setLongField(term68533, term68533.getClass(), "totalMasterHighScore", -5513509665682251667L);
        setIntField(term68645, term68645.getClass(), "year", 2011);
        setShortField(term68645, term68645.getClass(), "month", (short) 12);
        setShortField(term68645, term68645.getClass(), "day", (short) 31);
        setField(term68644, term68644.getClass(), "date", term68645);
        setByteField(term68649, term68649.getClass(), "hour", (byte) 6);
        setByteField(term68649, term68649.getClass(), "minute", (byte) 27);
        setByteField(term68649, term68649.getClass(), "second", (byte) 8);
        setIntField(term68649, term68649.getClass(), "nano", 782094318);
        setField(term68644, term68644.getClass(), "time", term68649);
        setField(term68533, term68533.getClass(), "eventWatchedDate", term68644);
        setIntField(term68533, term68533.getClass(), "friendCount", -1435370707);
        setBooleanField(term68533, term68533.getClass(), "isMaimai", false);
        setField(term68533, term68533.getClass(), "firstGameId", "riXARUiigm");
        setField(term68533, term68533.getClass(), "firstRomVersion", "RbXhBDZbRT");
        setField(term68533, term68533.getClass(), "firstDataVersion", "QDaTqkWnGj");
        setIntField(term68693, term68693.getClass(), "year", 2015);
        setShortField(term68693, term68693.getClass(), "month", (short) 3);
        setShortField(term68693, term68693.getClass(), "day", (short) 31);
        setField(term68692, term68692.getClass(), "date", term68693);
        setByteField(term68697, term68697.getClass(), "hour", (byte) 9);
        setByteField(term68697, term68697.getClass(), "minute", (byte) 42);
        setByteField(term68697, term68697.getClass(), "second", (byte) 3);
        setIntField(term68697, term68697.getClass(), "nano", 508678403);
        setField(term68692, term68692.getClass(), "time", term68697);
        setField(term68533, term68533.getClass(), "firstPlayDate", term68692);
        setField(term68533, term68533.getClass(), "lastGameId", "vNObzQvzxo");
        setField(term68533, term68533.getClass(), "lastRomVersion", "uyuWzXeJvn");
        setField(term68533, term68533.getClass(), "lastDataVersion", "jvQHxWAYDO");
        setIntField(term68739, term68739.getClass(), "year", 2020);
        setShortField(term68739, term68739.getClass(), "month", (short) 9);
        setShortField(term68739, term68739.getClass(), "day", (short) 13);
        setField(term68738, term68738.getClass(), "date", term68739);
        setByteField(term68743, term68743.getClass(), "hour", (byte) 0);
        setByteField(term68743, term68743.getClass(), "minute", (byte) 7);
        setByteField(term68743, term68743.getClass(), "second", (byte) 27);
        setIntField(term68743, term68743.getClass(), "nano", 835567947);
        setField(term68738, term68738.getClass(), "time", term68743);
        setField(term68533, term68533.getClass(), "lastPlayDate", term68738);
        setIntField(term68533, term68533.getClass(), "lastPlaceId", 1417436255);
        setField(term68533, term68533.getClass(), "lastPlaceName", "mntnLPfhte");
        setField(term68533, term68533.getClass(), "lastRegionId", "rIKLUjcdnZ");
        setField(term68533, term68533.getClass(), "lastRegionName", "MQaKKukkYD");
        setField(term68533, term68533.getClass(), "lastAllNetId", "ThGyaiqnHq");
        setField(term68533, term68533.getClass(), "lastClientId", "AtEuOtHJrK");
        setField(term68531, term68531.getClass(), "user", term68533);
        setIntField(term68531, term68531.getClass(), "bgInfo", -198413341);
        setIntField(term68531, term68531.getClass(), "fieldColor", 310965446);
        setIntField(term68531, term68531.getClass(), "guideSound", 828272209);
        setIntField(term68531, term68531.getClass(), "soundEffect", 689750472);
        setIntField(term68531, term68531.getClass(), "guideLine", -1898359702);
        setIntField(term68531, term68531.getClass(), "speed", 1270525323);
        setIntField(term68531, term68531.getClass(), "optionSet", 488822117);
        setIntField(term68531, term68531.getClass(), "matching", 433989355);
        setIntField(term68531, term68531.getClass(), "judgePos", 2018844661);
        setIntField(term68531, term68531.getClass(), "rating", -1021729545);
        setIntField(term68531, term68531.getClass(), "judgeJustice", 430508385);
        setIntField(term68531, term68531.getClass(), "judgeAttack", -1793486194);
        setIntField(term68531, term68531.getClass(), "headphone", 433257791);
        setIntField(term68531, term68531.getClass(), "playerLevel", 29812279);
        setIntField(term68531, term68531.getClass(), "successTap", -1215649058);
        setIntField(term68531, term68531.getClass(), "successExTap", 1937894049);
        setIntField(term68531, term68531.getClass(), "successSlideHold", -1008516956);
        setIntField(term68531, term68531.getClass(), "successAir", -1366321540);
        setIntField(term68531, term68531.getClass(), "successFlick", -157715735);
        setIntField(term68531, term68531.getClass(), "successSkill", -935537025);
        setIntField(term68531, term68531.getClass(), "successTapTimbre", 855956248);
        setIntField(term68531, term68531.getClass(), "privacy", -1971819811);
        term68831 = new Integer(2136685850);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term68831;
        callMethod(klass, "setSuccessSlideHold", argTypes, term68531, args);
    }

};


