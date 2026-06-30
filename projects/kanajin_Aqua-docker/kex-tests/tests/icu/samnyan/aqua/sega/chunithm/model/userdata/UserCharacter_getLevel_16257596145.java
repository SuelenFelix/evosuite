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

public class UserCharacter_getLevel_16257596145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term110219;

    public UserCharacter_getLevel_16257596145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term110225 = new Long(185793058502220865L);
        term110219 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCharacter"));
        Object term110221 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term110223 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term110239 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term110240 = newInstance(Class.forName("java.time.LocalDate"));
        Object term110244 = newInstance(Class.forName("java.time.LocalTime"));
        Object term110249 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term110250 = newInstance(Class.forName("java.time.LocalDate"));
        Object term110254 = newInstance(Class.forName("java.time.LocalTime"));
        Object term110271 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term110272 = newInstance(Class.forName("java.time.LocalDate"));
        Object term110276 = newInstance(Class.forName("java.time.LocalTime"));
        Object term110332 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term110333 = newInstance(Class.forName("java.time.LocalDate"));
        Object term110337 = newInstance(Class.forName("java.time.LocalTime"));
        Object term110380 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term110381 = newInstance(Class.forName("java.time.LocalDate"));
        Object term110385 = newInstance(Class.forName("java.time.LocalTime"));
        Object term110426 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term110427 = newInstance(Class.forName("java.time.LocalDate"));
        Object term110431 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term110219, term110219.getClass(), "id", 6916415397024602364L);
        setLongField(term110221, term110221.getClass(), "id", 3958291965587234274L);
        setLongField(term110223, term110223.getClass(), "id", 3506568970076223101L);
        setField(term110223, term110223.getClass(), "extId", term110225);
        setField(term110223, term110223.getClass(), "luid", "ItamIWoOLr");
        setIntField(term110240, term110240.getClass(), "year", 2012);
        setShortField(term110240, term110240.getClass(), "month", (short) 3);
        setShortField(term110240, term110240.getClass(), "day", (short) 21);
        setField(term110239, term110239.getClass(), "date", term110240);
        setByteField(term110244, term110244.getClass(), "hour", (byte) 12);
        setByteField(term110244, term110244.getClass(), "minute", (byte) 51);
        setByteField(term110244, term110244.getClass(), "second", (byte) 45);
        setIntField(term110244, term110244.getClass(), "nano", 154935437);
        setField(term110239, term110239.getClass(), "time", term110244);
        setField(term110223, term110223.getClass(), "registerTime", term110239);
        setIntField(term110250, term110250.getClass(), "year", 2018);
        setShortField(term110250, term110250.getClass(), "month", (short) 3);
        setShortField(term110250, term110250.getClass(), "day", (short) 27);
        setField(term110249, term110249.getClass(), "date", term110250);
        setByteField(term110254, term110254.getClass(), "hour", (byte) 0);
        setByteField(term110254, term110254.getClass(), "minute", (byte) 22);
        setByteField(term110254, term110254.getClass(), "second", (byte) 59);
        setIntField(term110254, term110254.getClass(), "nano", 148735615);
        setField(term110249, term110249.getClass(), "time", term110254);
        setField(term110223, term110223.getClass(), "accessTime", term110249);
        setField(term110221, term110221.getClass(), "card", term110223);
        setField(term110221, term110221.getClass(), "userName", "YeemjiDgab");
        setIntField(term110272, term110272.getClass(), "year", 2015);
        setShortField(term110272, term110272.getClass(), "month", (short) 5);
        setShortField(term110272, term110272.getClass(), "day", (short) 30);
        setField(term110271, term110271.getClass(), "date", term110272);
        setByteField(term110276, term110276.getClass(), "hour", (byte) 3);
        setByteField(term110276, term110276.getClass(), "minute", (byte) 2);
        setByteField(term110276, term110276.getClass(), "second", (byte) 10);
        setIntField(term110276, term110276.getClass(), "nano", 201133922);
        setField(term110271, term110271.getClass(), "time", term110276);
        setField(term110221, term110221.getClass(), "lastLoginDate", term110271);
        setBooleanField(term110221, term110221.getClass(), "isWebJoin", true);
        setField(term110221, term110221.getClass(), "webLimitDate", "tihFwBkjdt");
        setIntField(term110221, term110221.getClass(), "level", -125218254);
        setIntField(term110221, term110221.getClass(), "reincarnationNum", -10117375);
        setField(term110221, term110221.getClass(), "exp", "llYGfgCigY");
        setLongField(term110221, term110221.getClass(), "point", -2397817278487988239L);
        setLongField(term110221, term110221.getClass(), "totalPoint", 1618391554363715092L);
        setIntField(term110221, term110221.getClass(), "playCount", 1628351455);
        setIntField(term110221, term110221.getClass(), "multiPlayCount", -417098935);
        setIntField(term110221, term110221.getClass(), "multiWinCount", 207512423);
        setIntField(term110221, term110221.getClass(), "requestResCount", -1692495211);
        setIntField(term110221, term110221.getClass(), "acceptResCount", -1275247802);
        setIntField(term110221, term110221.getClass(), "successResCount", -214786685);
        setIntField(term110221, term110221.getClass(), "playerRating", -1563422009);
        setIntField(term110221, term110221.getClass(), "highestRating", 1071400572);
        setIntField(term110221, term110221.getClass(), "nameplateId", 593230414);
        setIntField(term110221, term110221.getClass(), "frameId", 111767836);
        setIntField(term110221, term110221.getClass(), "characterId", -894018524);
        setIntField(term110221, term110221.getClass(), "trophyId", -1805793810);
        setIntField(term110221, term110221.getClass(), "playedTutorialBit", 693687159);
        setIntField(term110221, term110221.getClass(), "firstTutorialCancelNum", -1632145668);
        setIntField(term110221, term110221.getClass(), "masterTutorialCancelNum", -161036428);
        setIntField(term110221, term110221.getClass(), "totalRepertoireCount", 1219123477);
        setIntField(term110221, term110221.getClass(), "totalMapNum", 11646624);
        setLongField(term110221, term110221.getClass(), "totalHiScore", -1576466761979476990L);
        setLongField(term110221, term110221.getClass(), "totalBasicHighScore", 7724921193278956157L);
        setLongField(term110221, term110221.getClass(), "totalAdvancedHighScore", 433374929829481228L);
        setLongField(term110221, term110221.getClass(), "totalExpertHighScore", -2013335001765194503L);
        setLongField(term110221, term110221.getClass(), "totalMasterHighScore", 2099082576325089685L);
        setIntField(term110333, term110333.getClass(), "year", 2027);
        setShortField(term110333, term110333.getClass(), "month", (short) 5);
        setShortField(term110333, term110333.getClass(), "day", (short) 31);
        setField(term110332, term110332.getClass(), "date", term110333);
        setByteField(term110337, term110337.getClass(), "hour", (byte) 7);
        setByteField(term110337, term110337.getClass(), "minute", (byte) 45);
        setByteField(term110337, term110337.getClass(), "second", (byte) 3);
        setIntField(term110337, term110337.getClass(), "nano", 347509118);
        setField(term110332, term110332.getClass(), "time", term110337);
        setField(term110221, term110221.getClass(), "eventWatchedDate", term110332);
        setIntField(term110221, term110221.getClass(), "friendCount", -330936660);
        setBooleanField(term110221, term110221.getClass(), "isMaimai", false);
        setField(term110221, term110221.getClass(), "firstGameId", "WToYKUjMGj");
        setField(term110221, term110221.getClass(), "firstRomVersion", "wbtDRRVkMv");
        setField(term110221, term110221.getClass(), "firstDataVersion", "abzzbYwTRo");
        setIntField(term110381, term110381.getClass(), "year", 2010);
        setShortField(term110381, term110381.getClass(), "month", (short) 7);
        setShortField(term110381, term110381.getClass(), "day", (short) 30);
        setField(term110380, term110380.getClass(), "date", term110381);
        setByteField(term110385, term110385.getClass(), "hour", (byte) 12);
        setByteField(term110385, term110385.getClass(), "minute", (byte) 58);
        setByteField(term110385, term110385.getClass(), "second", (byte) 33);
        setIntField(term110385, term110385.getClass(), "nano", 370604002);
        setField(term110380, term110380.getClass(), "time", term110385);
        setField(term110221, term110221.getClass(), "firstPlayDate", term110380);
        setField(term110221, term110221.getClass(), "lastGameId", "HxIZqtNMYu");
        setField(term110221, term110221.getClass(), "lastRomVersion", "NVlTBmmeHa");
        setField(term110221, term110221.getClass(), "lastDataVersion", "QZomwNJvGF");
        setIntField(term110427, term110427.getClass(), "year", 2025);
        setShortField(term110427, term110427.getClass(), "month", (short) 4);
        setShortField(term110427, term110427.getClass(), "day", (short) 22);
        setField(term110426, term110426.getClass(), "date", term110427);
        setByteField(term110431, term110431.getClass(), "hour", (byte) 11);
        setByteField(term110431, term110431.getClass(), "minute", (byte) 12);
        setByteField(term110431, term110431.getClass(), "second", (byte) 31);
        setIntField(term110431, term110431.getClass(), "nano", 501510240);
        setField(term110426, term110426.getClass(), "time", term110431);
        setField(term110221, term110221.getClass(), "lastPlayDate", term110426);
        setIntField(term110221, term110221.getClass(), "lastPlaceId", 2055839448);
        setField(term110221, term110221.getClass(), "lastPlaceName", "qfHzTgyYaj");
        setField(term110221, term110221.getClass(), "lastRegionId", "BzOSSnQpxM");
        setField(term110221, term110221.getClass(), "lastRegionName", "LoFkuWLahf");
        setField(term110221, term110221.getClass(), "lastAllNetId", "GwcCGdSyQT");
        setField(term110221, term110221.getClass(), "lastClientId", "pQLjQOCQOz");
        setField(term110219, term110219.getClass(), "user", term110221);
        setIntField(term110219, term110219.getClass(), "characterId", -384754498);
        setIntField(term110219, term110219.getClass(), "playCount", 264487081);
        setIntField(term110219, term110219.getClass(), "level", 1);
        setIntField(term110219, term110219.getClass(), "skillId", -834904279);
        setIntField(term110219, term110219.getClass(), "friendshipExp", 1040056537);
        setBooleanField(term110219, term110219.getClass(), "isValid", true);
        setBooleanField(term110219, term110219.getClass(), "isNewMark", true);
        setIntField(term110219, term110219.getClass(), "param1", 2036195661);
        setIntField(term110219, term110219.getClass(), "param2", -1622316712);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCharacter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLevel", argTypes, term110219, args);
    }

};


