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
import java.lang.Object;
import java.lang.Long;

public class UserData_equals_710923012124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term74838;
     Object term75101;

    public UserData_equals_710923012124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term74842 = new Long(-5447369594017685765L);
        term74838 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term74840 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term74856 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term74857 = newInstance(Class.forName("java.time.LocalDate"));
        Object term74861 = newInstance(Class.forName("java.time.LocalTime"));
        Object term74866 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term74867 = newInstance(Class.forName("java.time.LocalDate"));
        Object term74871 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term74838, term74838.getClass(), "id", -5231606455063875658L);
        setLongField(term74840, term74840.getClass(), "id", 5950326011535693672L);
        setField(term74840, term74840.getClass(), "extId", term74842);
        setField(term74840, term74840.getClass(), "luid", "amltyOnIBK");
        setIntField(term74857, term74857.getClass(), "year", 2012);
        setShortField(term74857, term74857.getClass(), "month", (short) 11);
        setShortField(term74857, term74857.getClass(), "day", (short) 23);
        setField(term74856, term74856.getClass(), "date", term74857);
        setByteField(term74861, term74861.getClass(), "hour", (byte) 21);
        setByteField(term74861, term74861.getClass(), "minute", (byte) 45);
        setByteField(term74861, term74861.getClass(), "second", (byte) 46);
        setIntField(term74861, term74861.getClass(), "nano", 484678696);
        setField(term74856, term74856.getClass(), "time", term74861);
        setField(term74840, term74840.getClass(), "registerTime", term74856);
        setIntField(term74867, term74867.getClass(), "year", 2027);
        setShortField(term74867, term74867.getClass(), "month", (short) 12);
        setShortField(term74867, term74867.getClass(), "day", (short) 25);
        setField(term74866, term74866.getClass(), "date", term74867);
        setByteField(term74871, term74871.getClass(), "hour", (byte) 8);
        setByteField(term74871, term74871.getClass(), "minute", (byte) 19);
        setByteField(term74871, term74871.getClass(), "second", (byte) 20);
        setIntField(term74871, term74871.getClass(), "nano", 127700185);
        setField(term74866, term74866.getClass(), "time", term74871);
        setField(term74840, term74840.getClass(), "accessTime", term74866);
        setField(term74838, term74838.getClass(), "card", term74840);
        setField(term74838, term74838.getClass(), "userName", "hjGlJibBAS");
        setIntField(term74838, term74838.getClass(), "level", -1492168193);
        setIntField(term74838, term74838.getClass(), "reincarnationNum", 144805805);
        setLongField(term74838, term74838.getClass(), "exp", -4168034609438407222L);
        setLongField(term74838, term74838.getClass(), "point", 7887665640871011024L);
        setLongField(term74838, term74838.getClass(), "totalPoint", 455038202248039323L);
        setIntField(term74838, term74838.getClass(), "playCount", 804939687);
        setIntField(term74838, term74838.getClass(), "jewelCount", 1638315840);
        setIntField(term74838, term74838.getClass(), "totalJewelCount", 2098018411);
        setIntField(term74838, term74838.getClass(), "medalCount", 696364986);
        setIntField(term74838, term74838.getClass(), "playerRating", 2133855407);
        setIntField(term74838, term74838.getClass(), "highestRating", -646910326);
        setIntField(term74838, term74838.getClass(), "battlePoint", -740085612);
        setIntField(term74838, term74838.getClass(), "bestBattlePoint", -377361876);
        setIntField(term74838, term74838.getClass(), "overDamageBattlePoint", -138587866);
        setBooleanField(term74838, term74838.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term74838, term74838.getClass(), "nameplateId", 473269350);
        setIntField(term74838, term74838.getClass(), "trophyId", -1267755429);
        setIntField(term74838, term74838.getClass(), "cardId", 481428944);
        setIntField(term74838, term74838.getClass(), "characterId", 585379621);
        setIntField(term74838, term74838.getClass(), "characterVoiceNo", 1343392329);
        setIntField(term74838, term74838.getClass(), "tabSetting", 9075231);
        setIntField(term74838, term74838.getClass(), "tabSortSetting", -1835849143);
        setIntField(term74838, term74838.getClass(), "cardCategorySetting", 156667044);
        setIntField(term74838, term74838.getClass(), "cardSortSetting", -1224273100);
        setIntField(term74838, term74838.getClass(), "rivalScoreCategorySetting", -1428004018);
        setIntField(term74838, term74838.getClass(), "playedTutorialBit", -296242927);
        setIntField(term74838, term74838.getClass(), "firstTutorialCancelNum", -1009003985);
        setLongField(term74838, term74838.getClass(), "sumTechHighScore", -4194720301615483872L);
        setLongField(term74838, term74838.getClass(), "sumTechBasicHighScore", 8225296394508889174L);
        setLongField(term74838, term74838.getClass(), "sumTechAdvancedHighScore", 9128485710912688789L);
        setLongField(term74838, term74838.getClass(), "sumTechExpertHighScore", 3638619900345530638L);
        setLongField(term74838, term74838.getClass(), "sumTechMasterHighScore", 2980761758683429513L);
        setLongField(term74838, term74838.getClass(), "sumTechLunaticHighScore", -719725737683944768L);
        setLongField(term74838, term74838.getClass(), "sumBattleHighScore", 1074272882002635033L);
        setLongField(term74838, term74838.getClass(), "sumBattleBasicHighScore", -399567772073942896L);
        setLongField(term74838, term74838.getClass(), "sumBattleAdvancedHighScore", -5288897655304765945L);
        setLongField(term74838, term74838.getClass(), "sumBattleExpertHighScore", 7996161227095395929L);
        setLongField(term74838, term74838.getClass(), "sumBattleMasterHighScore", 6905932167175886818L);
        setLongField(term74838, term74838.getClass(), "sumBattleLunaticHighScore", 2617544460322738020L);
        setField(term74838, term74838.getClass(), "eventWatchedDate", "vinKDMUJMl");
        setField(term74838, term74838.getClass(), "cmEventWatchedDate", "MgjVPQNbcu");
        setField(term74838, term74838.getClass(), "firstGameId", "QNYLGZGxNy");
        setField(term74838, term74838.getClass(), "firstRomVersion", "BrECRdedgj");
        setField(term74838, term74838.getClass(), "firstDataVersion", "lktYSRAAkX");
        setField(term74838, term74838.getClass(), "firstPlayDate", "KmbCndAIRO");
        setField(term74838, term74838.getClass(), "lastGameId", "LfLWkWgTGE");
        setField(term74838, term74838.getClass(), "lastRomVersion", "uleoYrEbgk");
        setField(term74838, term74838.getClass(), "lastDataVersion", "JINAWGBEol");
        setField(term74838, term74838.getClass(), "compatibleCmVersion", "HZRzxVDGhV");
        setField(term74838, term74838.getClass(), "lastPlayDate", "wOWOSBOjln");
        setIntField(term74838, term74838.getClass(), "lastPlaceId", 281679450);
        setField(term74838, term74838.getClass(), "lastPlaceName", "iVXUeGctUB");
        setIntField(term74838, term74838.getClass(), "lastRegionId", -1773524930);
        setField(term74838, term74838.getClass(), "lastRegionName", "bmLiVLNmZC");
        setIntField(term74838, term74838.getClass(), "lastAllNetId", 2053145277);
        setField(term74838, term74838.getClass(), "lastClientId", "ORExcUfatr");
        setIntField(term74838, term74838.getClass(), "lastUsedDeckId", 472692952);
        setIntField(term74838, term74838.getClass(), "lastPlayMusicLevel", 140138500);
        setIntField(term74838, term74838.getClass(), "lastEmoneyBrand", -244584643);
        term75101 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term75101;
        callMethod(klass, "equals", argTypes, term74838, args);
    }

};


