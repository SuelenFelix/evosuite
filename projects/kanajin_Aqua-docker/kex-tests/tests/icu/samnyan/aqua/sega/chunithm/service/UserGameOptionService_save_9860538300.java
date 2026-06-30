package icu.samnyan.aqua.sega.chunithm.service;

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
import static icu.samnyan.aqua.sega.chunithm.service.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class UserGameOptionService_save_9860538300 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6782;

    public UserGameOptionService_save_9860538300() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term6788 = new Long(-7672528020740371001L);
        term6782 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOption"));
        Object term6784 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term6786 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term6802 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6803 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6807 = newInstance(Class.forName("java.time.LocalTime"));
        Object term6812 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6813 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6817 = newInstance(Class.forName("java.time.LocalTime"));
        Object term6834 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6835 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6839 = newInstance(Class.forName("java.time.LocalTime"));
        Object term6895 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6896 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6900 = newInstance(Class.forName("java.time.LocalTime"));
        Object term6943 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6944 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6948 = newInstance(Class.forName("java.time.LocalTime"));
        Object term6989 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6990 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6994 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term6782, term6782.getClass(), "id", 3666226122807672448L);
        setLongField(term6784, term6784.getClass(), "id", 3108750145697087661L);
        setLongField(term6786, term6786.getClass(), "id", 3752337209837437327L);
        setField(term6786, term6786.getClass(), "extId", term6788);
        setField(term6786, term6786.getClass(), "luid", "jiUSjqwSIQ");
        setIntField(term6803, term6803.getClass(), "year", 2027);
        setShortField(term6803, term6803.getClass(), "month", (short) 8);
        setShortField(term6803, term6803.getClass(), "day", (short) 16);
        setField(term6802, term6802.getClass(), "date", term6803);
        setByteField(term6807, term6807.getClass(), "hour", (byte) 15);
        setByteField(term6807, term6807.getClass(), "minute", (byte) 1);
        setByteField(term6807, term6807.getClass(), "second", (byte) 18);
        setIntField(term6807, term6807.getClass(), "nano", 245350825);
        setField(term6802, term6802.getClass(), "time", term6807);
        setField(term6786, term6786.getClass(), "registerTime", term6802);
        setIntField(term6813, term6813.getClass(), "year", 2026);
        setShortField(term6813, term6813.getClass(), "month", (short) 7);
        setShortField(term6813, term6813.getClass(), "day", (short) 4);
        setField(term6812, term6812.getClass(), "date", term6813);
        setByteField(term6817, term6817.getClass(), "hour", (byte) 8);
        setByteField(term6817, term6817.getClass(), "minute", (byte) 51);
        setByteField(term6817, term6817.getClass(), "second", (byte) 9);
        setIntField(term6817, term6817.getClass(), "nano", 936880887);
        setField(term6812, term6812.getClass(), "time", term6817);
        setField(term6786, term6786.getClass(), "accessTime", term6812);
        setField(term6784, term6784.getClass(), "card", term6786);
        setField(term6784, term6784.getClass(), "userName", "MgLCedQfoj");
        setIntField(term6835, term6835.getClass(), "year", 2022);
        setShortField(term6835, term6835.getClass(), "month", (short) 5);
        setShortField(term6835, term6835.getClass(), "day", (short) 26);
        setField(term6834, term6834.getClass(), "date", term6835);
        setByteField(term6839, term6839.getClass(), "hour", (byte) 6);
        setByteField(term6839, term6839.getClass(), "minute", (byte) 54);
        setByteField(term6839, term6839.getClass(), "second", (byte) 49);
        setIntField(term6839, term6839.getClass(), "nano", 822216068);
        setField(term6834, term6834.getClass(), "time", term6839);
        setField(term6784, term6784.getClass(), "lastLoginDate", term6834);
        setBooleanField(term6784, term6784.getClass(), "isWebJoin", false);
        setField(term6784, term6784.getClass(), "webLimitDate", "zgKiINdgNu");
        setIntField(term6784, term6784.getClass(), "level", 777492093);
        setIntField(term6784, term6784.getClass(), "reincarnationNum", 1414025609);
        setField(term6784, term6784.getClass(), "exp", "zLMTXDQHYH");
        setLongField(term6784, term6784.getClass(), "point", 1860789353508856614L);
        setLongField(term6784, term6784.getClass(), "totalPoint", -7456852906235966771L);
        setIntField(term6784, term6784.getClass(), "playCount", 255145822);
        setIntField(term6784, term6784.getClass(), "multiPlayCount", -573608449);
        setIntField(term6784, term6784.getClass(), "multiWinCount", -1660057757);
        setIntField(term6784, term6784.getClass(), "requestResCount", 1816273440);
        setIntField(term6784, term6784.getClass(), "acceptResCount", -96541009);
        setIntField(term6784, term6784.getClass(), "successResCount", -43719302);
        setIntField(term6784, term6784.getClass(), "playerRating", 1024134939);
        setIntField(term6784, term6784.getClass(), "highestRating", 109078154);
        setIntField(term6784, term6784.getClass(), "nameplateId", -314165467);
        setIntField(term6784, term6784.getClass(), "frameId", 963694071);
        setIntField(term6784, term6784.getClass(), "characterId", -995785731);
        setIntField(term6784, term6784.getClass(), "trophyId", 1349815364);
        setIntField(term6784, term6784.getClass(), "playedTutorialBit", 2128383340);
        setIntField(term6784, term6784.getClass(), "firstTutorialCancelNum", 1238598518);
        setIntField(term6784, term6784.getClass(), "masterTutorialCancelNum", -558146961);
        setIntField(term6784, term6784.getClass(), "totalRepertoireCount", 1505480070);
        setIntField(term6784, term6784.getClass(), "totalMapNum", -829088844);
        setLongField(term6784, term6784.getClass(), "totalHiScore", -67485388932970712L);
        setLongField(term6784, term6784.getClass(), "totalBasicHighScore", 5806367330808555223L);
        setLongField(term6784, term6784.getClass(), "totalAdvancedHighScore", 4576699120365923235L);
        setLongField(term6784, term6784.getClass(), "totalExpertHighScore", -1635471392209071620L);
        setLongField(term6784, term6784.getClass(), "totalMasterHighScore", -4714000263923324167L);
        setIntField(term6896, term6896.getClass(), "year", 2022);
        setShortField(term6896, term6896.getClass(), "month", (short) 12);
        setShortField(term6896, term6896.getClass(), "day", (short) 19);
        setField(term6895, term6895.getClass(), "date", term6896);
        setByteField(term6900, term6900.getClass(), "hour", (byte) 11);
        setByteField(term6900, term6900.getClass(), "minute", (byte) 25);
        setByteField(term6900, term6900.getClass(), "second", (byte) 6);
        setIntField(term6900, term6900.getClass(), "nano", 620469872);
        setField(term6895, term6895.getClass(), "time", term6900);
        setField(term6784, term6784.getClass(), "eventWatchedDate", term6895);
        setIntField(term6784, term6784.getClass(), "friendCount", -31751777);
        setBooleanField(term6784, term6784.getClass(), "isMaimai", true);
        setField(term6784, term6784.getClass(), "firstGameId", "PqywFWJlpE");
        setField(term6784, term6784.getClass(), "firstRomVersion", "OzXRsFGTIp");
        setField(term6784, term6784.getClass(), "firstDataVersion", "TjWpyghUWN");
        setIntField(term6944, term6944.getClass(), "year", 2013);
        setShortField(term6944, term6944.getClass(), "month", (short) 5);
        setShortField(term6944, term6944.getClass(), "day", (short) 3);
        setField(term6943, term6943.getClass(), "date", term6944);
        setByteField(term6948, term6948.getClass(), "hour", (byte) 18);
        setByteField(term6948, term6948.getClass(), "minute", (byte) 52);
        setByteField(term6948, term6948.getClass(), "second", (byte) 15);
        setIntField(term6948, term6948.getClass(), "nano", 241685081);
        setField(term6943, term6943.getClass(), "time", term6948);
        setField(term6784, term6784.getClass(), "firstPlayDate", term6943);
        setField(term6784, term6784.getClass(), "lastGameId", "dkZFDZxcde");
        setField(term6784, term6784.getClass(), "lastRomVersion", "WXcZEtUKlI");
        setField(term6784, term6784.getClass(), "lastDataVersion", "IkpjUOuWQU");
        setIntField(term6990, term6990.getClass(), "year", 2029);
        setShortField(term6990, term6990.getClass(), "month", (short) 7);
        setShortField(term6990, term6990.getClass(), "day", (short) 14);
        setField(term6989, term6989.getClass(), "date", term6990);
        setByteField(term6994, term6994.getClass(), "hour", (byte) 17);
        setByteField(term6994, term6994.getClass(), "minute", (byte) 37);
        setByteField(term6994, term6994.getClass(), "second", (byte) 39);
        setIntField(term6994, term6994.getClass(), "nano", 333402299);
        setField(term6989, term6989.getClass(), "time", term6994);
        setField(term6784, term6784.getClass(), "lastPlayDate", term6989);
        setIntField(term6784, term6784.getClass(), "lastPlaceId", -246967963);
        setField(term6784, term6784.getClass(), "lastPlaceName", "boSSpezHeU");
        setField(term6784, term6784.getClass(), "lastRegionId", "OUeBWNTQDh");
        setField(term6784, term6784.getClass(), "lastRegionName", "gltJarNuUk");
        setField(term6784, term6784.getClass(), "lastAllNetId", "ZwZIDwYcSW");
        setField(term6784, term6784.getClass(), "lastClientId", "sOdkipUKRu");
        setField(term6782, term6782.getClass(), "user", term6784);
        setIntField(term6782, term6782.getClass(), "bgInfo", -1777140369);
        setIntField(term6782, term6782.getClass(), "fieldColor", 993627098);
        setIntField(term6782, term6782.getClass(), "guideSound", 872295704);
        setIntField(term6782, term6782.getClass(), "soundEffect", 86041387);
        setIntField(term6782, term6782.getClass(), "guideLine", 1010721666);
        setIntField(term6782, term6782.getClass(), "speed", 27043781);
        setIntField(term6782, term6782.getClass(), "optionSet", -1367122405);
        setIntField(term6782, term6782.getClass(), "matching", -1703625118);
        setIntField(term6782, term6782.getClass(), "judgePos", 1104108112);
        setIntField(term6782, term6782.getClass(), "rating", 1648665618);
        setIntField(term6782, term6782.getClass(), "judgeJustice", 633765954);
        setIntField(term6782, term6782.getClass(), "judgeAttack", 269110087);
        setIntField(term6782, term6782.getClass(), "headphone", 1545119095);
        setIntField(term6782, term6782.getClass(), "playerLevel", 1671229683);
        setIntField(term6782, term6782.getClass(), "successTap", 34167717);
        setIntField(term6782, term6782.getClass(), "successExTap", -514195141);
        setIntField(term6782, term6782.getClass(), "successSlideHold", -297946422);
        setIntField(term6782, term6782.getClass(), "successAir", 385463636);
        setIntField(term6782, term6782.getClass(), "successFlick", -1677599962);
        setIntField(term6782, term6782.getClass(), "successSkill", -1790275458);
        setIntField(term6782, term6782.getClass(), "successTapTimbre", -497534255);
        setIntField(term6782, term6782.getClass(), "privacy", 1588942911);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.service.UserGameOptionService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOption");
        Object[] args = new Object[1];
        args[0] = term6782;
        callMethod(klass, "save", argTypes, null, args);
    }

};


