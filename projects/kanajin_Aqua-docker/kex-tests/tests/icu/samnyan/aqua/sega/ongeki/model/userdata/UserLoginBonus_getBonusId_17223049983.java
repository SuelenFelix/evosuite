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

public class UserLoginBonus_getBonusId_17223049983 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term302130;

    public UserLoginBonus_getBonusId_17223049983() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term302136 = new Long(5071015720043054072L);
        term302130 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserLoginBonus"));
        Object term302132 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term302134 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term302150 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term302151 = newInstance(Class.forName("java.time.LocalDate"));
        Object term302155 = newInstance(Class.forName("java.time.LocalTime"));
        Object term302160 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term302161 = newInstance(Class.forName("java.time.LocalDate"));
        Object term302165 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term302130, term302130.getClass(), "id", -730660035673749525L);
        setLongField(term302132, term302132.getClass(), "id", -3843328897758975161L);
        setLongField(term302134, term302134.getClass(), "id", 1511516632682470278L);
        setField(term302134, term302134.getClass(), "extId", term302136);
        setField(term302134, term302134.getClass(), "luid", "JKuMejdhzA");
        setIntField(term302151, term302151.getClass(), "year", 2015);
        setShortField(term302151, term302151.getClass(), "month", (short) 7);
        setShortField(term302151, term302151.getClass(), "day", (short) 21);
        setField(term302150, term302150.getClass(), "date", term302151);
        setByteField(term302155, term302155.getClass(), "hour", (byte) 2);
        setByteField(term302155, term302155.getClass(), "minute", (byte) 17);
        setByteField(term302155, term302155.getClass(), "second", (byte) 58);
        setIntField(term302155, term302155.getClass(), "nano", 480547800);
        setField(term302150, term302150.getClass(), "time", term302155);
        setField(term302134, term302134.getClass(), "registerTime", term302150);
        setIntField(term302161, term302161.getClass(), "year", 2013);
        setShortField(term302161, term302161.getClass(), "month", (short) 11);
        setShortField(term302161, term302161.getClass(), "day", (short) 10);
        setField(term302160, term302160.getClass(), "date", term302161);
        setByteField(term302165, term302165.getClass(), "hour", (byte) 22);
        setByteField(term302165, term302165.getClass(), "minute", (byte) 18);
        setByteField(term302165, term302165.getClass(), "second", (byte) 36);
        setIntField(term302165, term302165.getClass(), "nano", 175039099);
        setField(term302160, term302160.getClass(), "time", term302165);
        setField(term302134, term302134.getClass(), "accessTime", term302160);
        setField(term302132, term302132.getClass(), "card", term302134);
        setField(term302132, term302132.getClass(), "userName", "suLlbdYAIy");
        setIntField(term302132, term302132.getClass(), "level", 1300315118);
        setIntField(term302132, term302132.getClass(), "reincarnationNum", 1494217218);
        setLongField(term302132, term302132.getClass(), "exp", -1542008354115707985L);
        setLongField(term302132, term302132.getClass(), "point", -8410961629356499887L);
        setLongField(term302132, term302132.getClass(), "totalPoint", -3509279523547428450L);
        setIntField(term302132, term302132.getClass(), "playCount", -2037485412);
        setIntField(term302132, term302132.getClass(), "jewelCount", -549589079);
        setIntField(term302132, term302132.getClass(), "totalJewelCount", 319457509);
        setIntField(term302132, term302132.getClass(), "medalCount", -361422672);
        setIntField(term302132, term302132.getClass(), "playerRating", -2135866024);
        setIntField(term302132, term302132.getClass(), "highestRating", -1192954298);
        setIntField(term302132, term302132.getClass(), "battlePoint", -2107983925);
        setIntField(term302132, term302132.getClass(), "bestBattlePoint", 1817073450);
        setIntField(term302132, term302132.getClass(), "overDamageBattlePoint", 1538684322);
        setBooleanField(term302132, term302132.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term302132, term302132.getClass(), "nameplateId", 1265800499);
        setIntField(term302132, term302132.getClass(), "trophyId", -1249500498);
        setIntField(term302132, term302132.getClass(), "cardId", 1324965525);
        setIntField(term302132, term302132.getClass(), "characterId", 1911093628);
        setIntField(term302132, term302132.getClass(), "characterVoiceNo", -1831251547);
        setIntField(term302132, term302132.getClass(), "tabSetting", 1390806098);
        setIntField(term302132, term302132.getClass(), "tabSortSetting", 294546226);
        setIntField(term302132, term302132.getClass(), "cardCategorySetting", -1074589146);
        setIntField(term302132, term302132.getClass(), "cardSortSetting", -936863059);
        setIntField(term302132, term302132.getClass(), "rivalScoreCategorySetting", -136501931);
        setIntField(term302132, term302132.getClass(), "playedTutorialBit", 1079782575);
        setIntField(term302132, term302132.getClass(), "firstTutorialCancelNum", -1681082907);
        setLongField(term302132, term302132.getClass(), "sumTechHighScore", 9044414700774929260L);
        setLongField(term302132, term302132.getClass(), "sumTechBasicHighScore", -953553145639101319L);
        setLongField(term302132, term302132.getClass(), "sumTechAdvancedHighScore", 2160536010250354852L);
        setLongField(term302132, term302132.getClass(), "sumTechExpertHighScore", 7687633793073008123L);
        setLongField(term302132, term302132.getClass(), "sumTechMasterHighScore", -3839297176192437552L);
        setLongField(term302132, term302132.getClass(), "sumTechLunaticHighScore", -7132232330815712460L);
        setLongField(term302132, term302132.getClass(), "sumBattleHighScore", 2981064124677456509L);
        setLongField(term302132, term302132.getClass(), "sumBattleBasicHighScore", 2874083936836735443L);
        setLongField(term302132, term302132.getClass(), "sumBattleAdvancedHighScore", 1846880203086148301L);
        setLongField(term302132, term302132.getClass(), "sumBattleExpertHighScore", -8671846713987258969L);
        setLongField(term302132, term302132.getClass(), "sumBattleMasterHighScore", 3594886553416498331L);
        setLongField(term302132, term302132.getClass(), "sumBattleLunaticHighScore", -4587269938618418590L);
        setField(term302132, term302132.getClass(), "eventWatchedDate", "wDDbneJdEB");
        setField(term302132, term302132.getClass(), "cmEventWatchedDate", "DbAALmmBfw");
        setField(term302132, term302132.getClass(), "firstGameId", "iMsKpObxTr");
        setField(term302132, term302132.getClass(), "firstRomVersion", "aIYplUbvHO");
        setField(term302132, term302132.getClass(), "firstDataVersion", "JkaZHJDhYZ");
        setField(term302132, term302132.getClass(), "firstPlayDate", "roZerEuiZa");
        setField(term302132, term302132.getClass(), "lastGameId", "COZVMMcYKc");
        setField(term302132, term302132.getClass(), "lastRomVersion", "gaGndEorGU");
        setField(term302132, term302132.getClass(), "lastDataVersion", "OfFpMTyLVK");
        setField(term302132, term302132.getClass(), "compatibleCmVersion", "WqeYNMSjhf");
        setField(term302132, term302132.getClass(), "lastPlayDate", "yeKFEzsyvy");
        setIntField(term302132, term302132.getClass(), "lastPlaceId", -896351319);
        setField(term302132, term302132.getClass(), "lastPlaceName", "QdKvoTHPsd");
        setIntField(term302132, term302132.getClass(), "lastRegionId", -900221037);
        setField(term302132, term302132.getClass(), "lastRegionName", "aglgSCaSUZ");
        setIntField(term302132, term302132.getClass(), "lastAllNetId", 1067716537);
        setField(term302132, term302132.getClass(), "lastClientId", "CBcAPJulAJ");
        setIntField(term302132, term302132.getClass(), "lastUsedDeckId", -163679227);
        setIntField(term302132, term302132.getClass(), "lastPlayMusicLevel", 1219736060);
        setIntField(term302132, term302132.getClass(), "lastEmoneyBrand", -974978101);
        setField(term302130, term302130.getClass(), "user", term302132);
        setIntField(term302130, term302130.getClass(), "bonusId", -1344240427);
        setIntField(term302130, term302130.getClass(), "bonusCount", 1407194399);
        setField(term302130, term302130.getClass(), "lastUpdateDate", "OvhWHNceRd");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserLoginBonus");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBonusId", argTypes, term302130, args);
    }

};


