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
import java.lang.Integer;
import java.lang.Boolean;

public class UserItem_init_198597557818 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term110310;
     Object term110312;
     Object term110575;
     Object term110577;
     Object term110579;
     Object term110581;

    public UserItem_init_198597557818() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term110310 = new Long(-8533120697864087610L);
        Long term110316 = new Long(1253549421411622358L);
        term110312 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term110314 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term110330 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term110331 = newInstance(Class.forName("java.time.LocalDate"));
        Object term110335 = newInstance(Class.forName("java.time.LocalTime"));
        Object term110340 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term110341 = newInstance(Class.forName("java.time.LocalDate"));
        Object term110345 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term110312, term110312.getClass(), "id", -2662490208363678899L);
        setLongField(term110314, term110314.getClass(), "id", -4424831168975735932L);
        setField(term110314, term110314.getClass(), "extId", term110316);
        setField(term110314, term110314.getClass(), "luid", "rQFJbYZksA");
        setIntField(term110331, term110331.getClass(), "year", 2026);
        setShortField(term110331, term110331.getClass(), "month", (short) 2);
        setShortField(term110331, term110331.getClass(), "day", (short) 5);
        setField(term110330, term110330.getClass(), "date", term110331);
        setByteField(term110335, term110335.getClass(), "hour", (byte) 8);
        setByteField(term110335, term110335.getClass(), "minute", (byte) 6);
        setByteField(term110335, term110335.getClass(), "second", (byte) 3);
        setIntField(term110335, term110335.getClass(), "nano", 107243113);
        setField(term110330, term110330.getClass(), "time", term110335);
        setField(term110314, term110314.getClass(), "registerTime", term110330);
        setIntField(term110341, term110341.getClass(), "year", 2013);
        setShortField(term110341, term110341.getClass(), "month", (short) 3);
        setShortField(term110341, term110341.getClass(), "day", (short) 17);
        setField(term110340, term110340.getClass(), "date", term110341);
        setByteField(term110345, term110345.getClass(), "hour", (byte) 6);
        setByteField(term110345, term110345.getClass(), "minute", (byte) 13);
        setByteField(term110345, term110345.getClass(), "second", (byte) 20);
        setIntField(term110345, term110345.getClass(), "nano", 748150546);
        setField(term110340, term110340.getClass(), "time", term110345);
        setField(term110314, term110314.getClass(), "accessTime", term110340);
        setField(term110312, term110312.getClass(), "card", term110314);
        setField(term110312, term110312.getClass(), "userName", "jndrnlnwbO");
        setIntField(term110312, term110312.getClass(), "level", 741097031);
        setIntField(term110312, term110312.getClass(), "reincarnationNum", -1525517989);
        setLongField(term110312, term110312.getClass(), "exp", 6693935559545558408L);
        setLongField(term110312, term110312.getClass(), "point", -6433100511031376773L);
        setLongField(term110312, term110312.getClass(), "totalPoint", -7914310730896725122L);
        setIntField(term110312, term110312.getClass(), "playCount", -1137095698);
        setIntField(term110312, term110312.getClass(), "jewelCount", -1037663898);
        setIntField(term110312, term110312.getClass(), "totalJewelCount", 425749446);
        setIntField(term110312, term110312.getClass(), "medalCount", -1720765811);
        setIntField(term110312, term110312.getClass(), "playerRating", 1856736903);
        setIntField(term110312, term110312.getClass(), "highestRating", 601640545);
        setIntField(term110312, term110312.getClass(), "battlePoint", 1768015672);
        setIntField(term110312, term110312.getClass(), "bestBattlePoint", -575165301);
        setIntField(term110312, term110312.getClass(), "overDamageBattlePoint", -1576541436);
        setBooleanField(term110312, term110312.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term110312, term110312.getClass(), "nameplateId", -220907120);
        setIntField(term110312, term110312.getClass(), "trophyId", -1401366212);
        setIntField(term110312, term110312.getClass(), "cardId", 1124444723);
        setIntField(term110312, term110312.getClass(), "characterId", -149423332);
        setIntField(term110312, term110312.getClass(), "characterVoiceNo", 1593811012);
        setIntField(term110312, term110312.getClass(), "tabSetting", 1743792661);
        setIntField(term110312, term110312.getClass(), "tabSortSetting", -1347677159);
        setIntField(term110312, term110312.getClass(), "cardCategorySetting", 405531807);
        setIntField(term110312, term110312.getClass(), "cardSortSetting", -784847348);
        setIntField(term110312, term110312.getClass(), "rivalScoreCategorySetting", -1819128604);
        setIntField(term110312, term110312.getClass(), "playedTutorialBit", 937586090);
        setIntField(term110312, term110312.getClass(), "firstTutorialCancelNum", -507719222);
        setLongField(term110312, term110312.getClass(), "sumTechHighScore", 2540539108605766178L);
        setLongField(term110312, term110312.getClass(), "sumTechBasicHighScore", -8724394930084436347L);
        setLongField(term110312, term110312.getClass(), "sumTechAdvancedHighScore", 8450461365517127787L);
        setLongField(term110312, term110312.getClass(), "sumTechExpertHighScore", -1798490101551867119L);
        setLongField(term110312, term110312.getClass(), "sumTechMasterHighScore", 2857537321280049041L);
        setLongField(term110312, term110312.getClass(), "sumTechLunaticHighScore", 631345976660422673L);
        setLongField(term110312, term110312.getClass(), "sumBattleHighScore", 1665453023351702547L);
        setLongField(term110312, term110312.getClass(), "sumBattleBasicHighScore", -1593642402870239080L);
        setLongField(term110312, term110312.getClass(), "sumBattleAdvancedHighScore", 4413528788382655231L);
        setLongField(term110312, term110312.getClass(), "sumBattleExpertHighScore", 6376234063744922560L);
        setLongField(term110312, term110312.getClass(), "sumBattleMasterHighScore", -6464012852650897805L);
        setLongField(term110312, term110312.getClass(), "sumBattleLunaticHighScore", -8720576105608818998L);
        setField(term110312, term110312.getClass(), "eventWatchedDate", "qdFzHeHbQc");
        setField(term110312, term110312.getClass(), "cmEventWatchedDate", "EcxYliBmNQ");
        setField(term110312, term110312.getClass(), "firstGameId", "MGbwgunHMQ");
        setField(term110312, term110312.getClass(), "firstRomVersion", "wCgQVdppSI");
        setField(term110312, term110312.getClass(), "firstDataVersion", "oQWxaFnrYq");
        setField(term110312, term110312.getClass(), "firstPlayDate", "uZcUOSgoMp");
        setField(term110312, term110312.getClass(), "lastGameId", "eMxNpewLIS");
        setField(term110312, term110312.getClass(), "lastRomVersion", "GxNdoXawUZ");
        setField(term110312, term110312.getClass(), "lastDataVersion", "YAFTYAtere");
        setField(term110312, term110312.getClass(), "compatibleCmVersion", "EYQnrjiZfX");
        setField(term110312, term110312.getClass(), "lastPlayDate", "xydFPTvtMs");
        setIntField(term110312, term110312.getClass(), "lastPlaceId", -100427651);
        setField(term110312, term110312.getClass(), "lastPlaceName", "lopARHjeMT");
        setIntField(term110312, term110312.getClass(), "lastRegionId", -836703719);
        setField(term110312, term110312.getClass(), "lastRegionName", "wizysRLgRr");
        setIntField(term110312, term110312.getClass(), "lastAllNetId", -1563918188);
        setField(term110312, term110312.getClass(), "lastClientId", "VbDDltcmiT");
        setIntField(term110312, term110312.getClass(), "lastUsedDeckId", 153656028);
        setIntField(term110312, term110312.getClass(), "lastPlayMusicLevel", 440521526);
        setIntField(term110312, term110312.getClass(), "lastEmoneyBrand", -1106412249);
        term110575 = new Integer(-1922114971);
        term110577 = new Integer(-1285495576);
        term110579 = new Integer(605159454);
        term110581 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserItem");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = long.class;
        argTypes[1] = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        argTypes[5] = boolean.class;
        Object[] args = new Object[6];
        args[0] = term110310;
        args[1] = term110312;
        args[2] = term110575;
        args[3] = term110577;
        args[4] = term110579;
        args[5] = term110581;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


