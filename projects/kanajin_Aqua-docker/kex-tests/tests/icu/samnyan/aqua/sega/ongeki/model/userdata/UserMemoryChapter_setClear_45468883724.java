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
import java.lang.Boolean;

public class UserMemoryChapter_setClear_45468883724 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term399803;
     Object term400079;

    public UserMemoryChapter_setClear_45468883724() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term399809 = new Long(-6325201865655646423L);
        term399803 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMemoryChapter"));
        Object term399805 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term399807 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term399823 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term399824 = newInstance(Class.forName("java.time.LocalDate"));
        Object term399828 = newInstance(Class.forName("java.time.LocalTime"));
        Object term399833 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term399834 = newInstance(Class.forName("java.time.LocalDate"));
        Object term399838 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term399803, term399803.getClass(), "id", 5962096497172262429L);
        setLongField(term399805, term399805.getClass(), "id", 1987635967184493092L);
        setLongField(term399807, term399807.getClass(), "id", 4864144176037460244L);
        setField(term399807, term399807.getClass(), "extId", term399809);
        setField(term399807, term399807.getClass(), "luid", "oNpSvZXyPj");
        setIntField(term399824, term399824.getClass(), "year", 2011);
        setShortField(term399824, term399824.getClass(), "month", (short) 10);
        setShortField(term399824, term399824.getClass(), "day", (short) 27);
        setField(term399823, term399823.getClass(), "date", term399824);
        setByteField(term399828, term399828.getClass(), "hour", (byte) 1);
        setByteField(term399828, term399828.getClass(), "minute", (byte) 11);
        setByteField(term399828, term399828.getClass(), "second", (byte) 44);
        setIntField(term399828, term399828.getClass(), "nano", 881306622);
        setField(term399823, term399823.getClass(), "time", term399828);
        setField(term399807, term399807.getClass(), "registerTime", term399823);
        setIntField(term399834, term399834.getClass(), "year", 2027);
        setShortField(term399834, term399834.getClass(), "month", (short) 12);
        setShortField(term399834, term399834.getClass(), "day", (short) 27);
        setField(term399833, term399833.getClass(), "date", term399834);
        setByteField(term399838, term399838.getClass(), "hour", (byte) 0);
        setByteField(term399838, term399838.getClass(), "minute", (byte) 54);
        setByteField(term399838, term399838.getClass(), "second", (byte) 48);
        setIntField(term399838, term399838.getClass(), "nano", 695137077);
        setField(term399833, term399833.getClass(), "time", term399838);
        setField(term399807, term399807.getClass(), "accessTime", term399833);
        setField(term399805, term399805.getClass(), "card", term399807);
        setField(term399805, term399805.getClass(), "userName", "ftAzfOqnZr");
        setIntField(term399805, term399805.getClass(), "level", 1297158692);
        setIntField(term399805, term399805.getClass(), "reincarnationNum", -1952404846);
        setLongField(term399805, term399805.getClass(), "exp", -457660150580130067L);
        setLongField(term399805, term399805.getClass(), "point", 5137382071068804795L);
        setLongField(term399805, term399805.getClass(), "totalPoint", 670070327724971227L);
        setIntField(term399805, term399805.getClass(), "playCount", -1217004366);
        setIntField(term399805, term399805.getClass(), "jewelCount", -1944775912);
        setIntField(term399805, term399805.getClass(), "totalJewelCount", 466965348);
        setIntField(term399805, term399805.getClass(), "medalCount", -1531097940);
        setIntField(term399805, term399805.getClass(), "playerRating", 427268664);
        setIntField(term399805, term399805.getClass(), "highestRating", 2015099252);
        setIntField(term399805, term399805.getClass(), "battlePoint", 1598438764);
        setIntField(term399805, term399805.getClass(), "bestBattlePoint", -294531241);
        setIntField(term399805, term399805.getClass(), "overDamageBattlePoint", 1044517890);
        setBooleanField(term399805, term399805.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term399805, term399805.getClass(), "nameplateId", -304963892);
        setIntField(term399805, term399805.getClass(), "trophyId", 1379123992);
        setIntField(term399805, term399805.getClass(), "cardId", -1852489864);
        setIntField(term399805, term399805.getClass(), "characterId", -1383979118);
        setIntField(term399805, term399805.getClass(), "characterVoiceNo", 2078654430);
        setIntField(term399805, term399805.getClass(), "tabSetting", -79680080);
        setIntField(term399805, term399805.getClass(), "tabSortSetting", 568584882);
        setIntField(term399805, term399805.getClass(), "cardCategorySetting", 1990339198);
        setIntField(term399805, term399805.getClass(), "cardSortSetting", -712438905);
        setIntField(term399805, term399805.getClass(), "rivalScoreCategorySetting", -1168510647);
        setIntField(term399805, term399805.getClass(), "playedTutorialBit", 950052343);
        setIntField(term399805, term399805.getClass(), "firstTutorialCancelNum", 1431179124);
        setLongField(term399805, term399805.getClass(), "sumTechHighScore", 8534940695365868418L);
        setLongField(term399805, term399805.getClass(), "sumTechBasicHighScore", 6141950199644561235L);
        setLongField(term399805, term399805.getClass(), "sumTechAdvancedHighScore", -6326228260050563017L);
        setLongField(term399805, term399805.getClass(), "sumTechExpertHighScore", -6960859150814287131L);
        setLongField(term399805, term399805.getClass(), "sumTechMasterHighScore", 3786521201412149676L);
        setLongField(term399805, term399805.getClass(), "sumTechLunaticHighScore", 6229800505568460683L);
        setLongField(term399805, term399805.getClass(), "sumBattleHighScore", -46966081812728169L);
        setLongField(term399805, term399805.getClass(), "sumBattleBasicHighScore", 2203717168327283506L);
        setLongField(term399805, term399805.getClass(), "sumBattleAdvancedHighScore", 2045863109445898168L);
        setLongField(term399805, term399805.getClass(), "sumBattleExpertHighScore", -7450546233309048710L);
        setLongField(term399805, term399805.getClass(), "sumBattleMasterHighScore", -4517611496515463615L);
        setLongField(term399805, term399805.getClass(), "sumBattleLunaticHighScore", -473424060599761478L);
        setField(term399805, term399805.getClass(), "eventWatchedDate", "jckztwMGrA");
        setField(term399805, term399805.getClass(), "cmEventWatchedDate", "YlqllxIQBy");
        setField(term399805, term399805.getClass(), "firstGameId", "BGhMrmEysC");
        setField(term399805, term399805.getClass(), "firstRomVersion", "aLKOGFrndu");
        setField(term399805, term399805.getClass(), "firstDataVersion", "WbjxvbILWe");
        setField(term399805, term399805.getClass(), "firstPlayDate", "DknuPrXeDb");
        setField(term399805, term399805.getClass(), "lastGameId", "zVsPMRjwOg");
        setField(term399805, term399805.getClass(), "lastRomVersion", "kkhlffhYhX");
        setField(term399805, term399805.getClass(), "lastDataVersion", "dQHhcmvVyO");
        setField(term399805, term399805.getClass(), "compatibleCmVersion", "JLmeSfRGLA");
        setField(term399805, term399805.getClass(), "lastPlayDate", "mzsjrtrrth");
        setIntField(term399805, term399805.getClass(), "lastPlaceId", 316595574);
        setField(term399805, term399805.getClass(), "lastPlaceName", "MxxhsoJaEf");
        setIntField(term399805, term399805.getClass(), "lastRegionId", 479454058);
        setField(term399805, term399805.getClass(), "lastRegionName", "BjoTdnUIMh");
        setIntField(term399805, term399805.getClass(), "lastAllNetId", 2146134370);
        setField(term399805, term399805.getClass(), "lastClientId", "VJvZhUmAGg");
        setIntField(term399805, term399805.getClass(), "lastUsedDeckId", -725338243);
        setIntField(term399805, term399805.getClass(), "lastPlayMusicLevel", 957640738);
        setIntField(term399805, term399805.getClass(), "lastEmoneyBrand", -906512399);
        setField(term399803, term399803.getClass(), "user", term399805);
        setIntField(term399803, term399803.getClass(), "chapterId", -339389116);
        setIntField(term399803, term399803.getClass(), "jewelCount", 965448581);
        setIntField(term399803, term399803.getClass(), "lastPlayMusicCategory", -1128613379);
        setIntField(term399803, term399803.getClass(), "lastPlayMusicId", -536287177);
        setIntField(term399803, term399803.getClass(), "lastPlayMusicLevel", 749171836);
        setBooleanField(term399803, term399803.getClass(), "isDialogWatched", false);
        setBooleanField(term399803, term399803.getClass(), "isStoryWatched", true);
        setBooleanField(term399803, term399803.getClass(), "isBossWatched", true);
        setBooleanField(term399803, term399803.getClass(), "isClear", false);
        setIntField(term399803, term399803.getClass(), "gaugeId", -1146365414);
        setIntField(term399803, term399803.getClass(), "gaugeNum", 1421044201);
        term400079 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMemoryChapter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term400079;
        callMethod(klass, "setClear", argTypes, term399803, args);
    }

};


