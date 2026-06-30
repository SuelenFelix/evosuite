package icu.samnyan.aqua.sega.ongeki.model.userdata;

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
import static icu.samnyan.aqua.sega.ongeki.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class UserGeneralData_init_169853671314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term300312;
     Object term300314;

    public UserGeneralData_init_169853671314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term300312 = new Long(5966225447691960854L);
        Long term300318 = new Long(-7514437039500876647L);
        term300314 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term300316 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term300332 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term300333 = newInstance(Class.forName("java.time.LocalDate"));
        Object term300337 = newInstance(Class.forName("java.time.LocalTime"));
        Object term300342 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term300343 = newInstance(Class.forName("java.time.LocalDate"));
        Object term300347 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term300314, term300314.getClass(), "id", 247734820798499474L);
        setLongField(term300316, term300316.getClass(), "id", -8137224283514590327L);
        setField(term300316, term300316.getClass(), "extId", term300318);
        setField(term300316, term300316.getClass(), "luid", "geOXZNZZIn");
        setIntField(term300333, term300333.getClass(), "year", 2018);
        setShortField(term300333, term300333.getClass(), "month", (short) 5);
        setShortField(term300333, term300333.getClass(), "day", (short) 27);
        setField(term300332, term300332.getClass(), "date", term300333);
        setByteField(term300337, term300337.getClass(), "hour", (byte) 18);
        setByteField(term300337, term300337.getClass(), "minute", (byte) 33);
        setByteField(term300337, term300337.getClass(), "second", (byte) 52);
        setIntField(term300337, term300337.getClass(), "nano", 983510975);
        setField(term300332, term300332.getClass(), "time", term300337);
        setField(term300316, term300316.getClass(), "registerTime", term300332);
        setIntField(term300343, term300343.getClass(), "year", 2022);
        setShortField(term300343, term300343.getClass(), "month", (short) 10);
        setShortField(term300343, term300343.getClass(), "day", (short) 15);
        setField(term300342, term300342.getClass(), "date", term300343);
        setByteField(term300347, term300347.getClass(), "hour", (byte) 5);
        setByteField(term300347, term300347.getClass(), "minute", (byte) 15);
        setByteField(term300347, term300347.getClass(), "second", (byte) 3);
        setIntField(term300347, term300347.getClass(), "nano", 660248234);
        setField(term300342, term300342.getClass(), "time", term300347);
        setField(term300316, term300316.getClass(), "accessTime", term300342);
        setField(term300314, term300314.getClass(), "card", term300316);
        setField(term300314, term300314.getClass(), "userName", "WklUkZmIds");
        setIntField(term300314, term300314.getClass(), "level", 1316405768);
        setIntField(term300314, term300314.getClass(), "reincarnationNum", 639847501);
        setLongField(term300314, term300314.getClass(), "exp", 6016709346113878267L);
        setLongField(term300314, term300314.getClass(), "point", 2347086005827065435L);
        setLongField(term300314, term300314.getClass(), "totalPoint", 5763546822015516837L);
        setIntField(term300314, term300314.getClass(), "playCount", -1147608963);
        setIntField(term300314, term300314.getClass(), "jewelCount", 544608152);
        setIntField(term300314, term300314.getClass(), "totalJewelCount", -973548795);
        setIntField(term300314, term300314.getClass(), "medalCount", -2005365152);
        setIntField(term300314, term300314.getClass(), "playerRating", 1841267577);
        setIntField(term300314, term300314.getClass(), "highestRating", -1696437268);
        setIntField(term300314, term300314.getClass(), "battlePoint", -1612328990);
        setIntField(term300314, term300314.getClass(), "bestBattlePoint", 824967439);
        setIntField(term300314, term300314.getClass(), "overDamageBattlePoint", 1484193841);
        setBooleanField(term300314, term300314.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term300314, term300314.getClass(), "nameplateId", 136266266);
        setIntField(term300314, term300314.getClass(), "trophyId", 2020115381);
        setIntField(term300314, term300314.getClass(), "cardId", 814559519);
        setIntField(term300314, term300314.getClass(), "characterId", 1859715105);
        setIntField(term300314, term300314.getClass(), "characterVoiceNo", 1029473371);
        setIntField(term300314, term300314.getClass(), "tabSetting", -834678189);
        setIntField(term300314, term300314.getClass(), "tabSortSetting", 689447382);
        setIntField(term300314, term300314.getClass(), "cardCategorySetting", 1745666381);
        setIntField(term300314, term300314.getClass(), "cardSortSetting", 304073833);
        setIntField(term300314, term300314.getClass(), "rivalScoreCategorySetting", -1851662861);
        setIntField(term300314, term300314.getClass(), "playedTutorialBit", 623750096);
        setIntField(term300314, term300314.getClass(), "firstTutorialCancelNum", -1486229880);
        setLongField(term300314, term300314.getClass(), "sumTechHighScore", 8183916468380846463L);
        setLongField(term300314, term300314.getClass(), "sumTechBasicHighScore", -3208189893285934844L);
        setLongField(term300314, term300314.getClass(), "sumTechAdvancedHighScore", -1414745213516290001L);
        setLongField(term300314, term300314.getClass(), "sumTechExpertHighScore", 8964146242680224775L);
        setLongField(term300314, term300314.getClass(), "sumTechMasterHighScore", 8721616113601677804L);
        setLongField(term300314, term300314.getClass(), "sumTechLunaticHighScore", 7121616517692704705L);
        setLongField(term300314, term300314.getClass(), "sumBattleHighScore", 4018388131977039556L);
        setLongField(term300314, term300314.getClass(), "sumBattleBasicHighScore", -8879330485491509684L);
        setLongField(term300314, term300314.getClass(), "sumBattleAdvancedHighScore", -4453110740785892397L);
        setLongField(term300314, term300314.getClass(), "sumBattleExpertHighScore", -1750444391028875286L);
        setLongField(term300314, term300314.getClass(), "sumBattleMasterHighScore", 7519938865825885195L);
        setLongField(term300314, term300314.getClass(), "sumBattleLunaticHighScore", 4492925490921913196L);
        setField(term300314, term300314.getClass(), "eventWatchedDate", "qsaAfuuDnj");
        setField(term300314, term300314.getClass(), "cmEventWatchedDate", "AwwrbMzNDx");
        setField(term300314, term300314.getClass(), "firstGameId", "IaqOJMthEm");
        setField(term300314, term300314.getClass(), "firstRomVersion", "WqzNDQfLBu");
        setField(term300314, term300314.getClass(), "firstDataVersion", "dpnIixBhZZ");
        setField(term300314, term300314.getClass(), "firstPlayDate", "pxPStUWNTS");
        setField(term300314, term300314.getClass(), "lastGameId", "zUHSvWTyxk");
        setField(term300314, term300314.getClass(), "lastRomVersion", "BNWPFHqDSK");
        setField(term300314, term300314.getClass(), "lastDataVersion", "vrYaIwwcMN");
        setField(term300314, term300314.getClass(), "compatibleCmVersion", "LcVLocUBWS");
        setField(term300314, term300314.getClass(), "lastPlayDate", "joSmLtjBvB");
        setIntField(term300314, term300314.getClass(), "lastPlaceId", -602437515);
        setField(term300314, term300314.getClass(), "lastPlaceName", "wyNmzyMLQI");
        setIntField(term300314, term300314.getClass(), "lastRegionId", -1602657519);
        setField(term300314, term300314.getClass(), "lastRegionName", "wiZrzOpgQw");
        setIntField(term300314, term300314.getClass(), "lastAllNetId", 200439058);
        setField(term300314, term300314.getClass(), "lastClientId", "WQqnouSTpD");
        setIntField(term300314, term300314.getClass(), "lastUsedDeckId", 1555707891);
        setIntField(term300314, term300314.getClass(), "lastPlayMusicLevel", 733971294);
        setIntField(term300314, term300314.getClass(), "lastEmoneyBrand", -1832751468);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserGeneralData");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = long.class;
        argTypes[1] = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.String");
        Object[] args = new Object[4];
        args[0] = term300312;
        args[1] = term300314;
        args[2] = "ytoXodivzA";
        args[3] = "sEcSjAkjSq";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


