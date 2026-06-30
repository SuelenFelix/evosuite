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

public class UserTradeItem_setId_12998012466 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term152832;
     Object term153100;

    public UserTradeItem_setId_12998012466() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term152838 = new Long(5319740127125920367L);
        term152832 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTradeItem"));
        Object term152834 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term152836 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term152852 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term152853 = newInstance(Class.forName("java.time.LocalDate"));
        Object term152857 = newInstance(Class.forName("java.time.LocalTime"));
        Object term152862 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term152863 = newInstance(Class.forName("java.time.LocalDate"));
        Object term152867 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term152832, term152832.getClass(), "id", 8467443504765666649L);
        setLongField(term152834, term152834.getClass(), "id", -2973693745170987047L);
        setLongField(term152836, term152836.getClass(), "id", 7653085189229399472L);
        setField(term152836, term152836.getClass(), "extId", term152838);
        setField(term152836, term152836.getClass(), "luid", "YTiiBmPBxA");
        setIntField(term152853, term152853.getClass(), "year", 2010);
        setShortField(term152853, term152853.getClass(), "month", (short) 8);
        setShortField(term152853, term152853.getClass(), "day", (short) 25);
        setField(term152852, term152852.getClass(), "date", term152853);
        setByteField(term152857, term152857.getClass(), "hour", (byte) 7);
        setByteField(term152857, term152857.getClass(), "minute", (byte) 13);
        setByteField(term152857, term152857.getClass(), "second", (byte) 16);
        setIntField(term152857, term152857.getClass(), "nano", 196716483);
        setField(term152852, term152852.getClass(), "time", term152857);
        setField(term152836, term152836.getClass(), "registerTime", term152852);
        setIntField(term152863, term152863.getClass(), "year", 2016);
        setShortField(term152863, term152863.getClass(), "month", (short) 2);
        setShortField(term152863, term152863.getClass(), "day", (short) 19);
        setField(term152862, term152862.getClass(), "date", term152863);
        setByteField(term152867, term152867.getClass(), "hour", (byte) 1);
        setByteField(term152867, term152867.getClass(), "minute", (byte) 32);
        setByteField(term152867, term152867.getClass(), "second", (byte) 43);
        setIntField(term152867, term152867.getClass(), "nano", 671735228);
        setField(term152862, term152862.getClass(), "time", term152867);
        setField(term152836, term152836.getClass(), "accessTime", term152862);
        setField(term152834, term152834.getClass(), "card", term152836);
        setField(term152834, term152834.getClass(), "userName", "DeKKQvsCKV");
        setIntField(term152834, term152834.getClass(), "level", -1013688248);
        setIntField(term152834, term152834.getClass(), "reincarnationNum", -164074275);
        setLongField(term152834, term152834.getClass(), "exp", 515823041410317993L);
        setLongField(term152834, term152834.getClass(), "point", 488055456685935685L);
        setLongField(term152834, term152834.getClass(), "totalPoint", 7070822916924815698L);
        setIntField(term152834, term152834.getClass(), "playCount", 344170834);
        setIntField(term152834, term152834.getClass(), "jewelCount", -305813067);
        setIntField(term152834, term152834.getClass(), "totalJewelCount", 956385164);
        setIntField(term152834, term152834.getClass(), "medalCount", -696090550);
        setIntField(term152834, term152834.getClass(), "playerRating", -453710990);
        setIntField(term152834, term152834.getClass(), "highestRating", -986333882);
        setIntField(term152834, term152834.getClass(), "battlePoint", -163205883);
        setIntField(term152834, term152834.getClass(), "bestBattlePoint", -1916495224);
        setIntField(term152834, term152834.getClass(), "overDamageBattlePoint", -409557637);
        setBooleanField(term152834, term152834.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term152834, term152834.getClass(), "nameplateId", 1817886491);
        setIntField(term152834, term152834.getClass(), "trophyId", 252819186);
        setIntField(term152834, term152834.getClass(), "cardId", -1730296941);
        setIntField(term152834, term152834.getClass(), "characterId", 315600005);
        setIntField(term152834, term152834.getClass(), "characterVoiceNo", 862341418);
        setIntField(term152834, term152834.getClass(), "tabSetting", 2068475777);
        setIntField(term152834, term152834.getClass(), "tabSortSetting", 865947404);
        setIntField(term152834, term152834.getClass(), "cardCategorySetting", -685471102);
        setIntField(term152834, term152834.getClass(), "cardSortSetting", -1392152397);
        setIntField(term152834, term152834.getClass(), "rivalScoreCategorySetting", 559505850);
        setIntField(term152834, term152834.getClass(), "playedTutorialBit", 83945804);
        setIntField(term152834, term152834.getClass(), "firstTutorialCancelNum", -1680670781);
        setLongField(term152834, term152834.getClass(), "sumTechHighScore", -8242397124484371002L);
        setLongField(term152834, term152834.getClass(), "sumTechBasicHighScore", 8490994330823498562L);
        setLongField(term152834, term152834.getClass(), "sumTechAdvancedHighScore", -7120024779761397532L);
        setLongField(term152834, term152834.getClass(), "sumTechExpertHighScore", -319639018436435626L);
        setLongField(term152834, term152834.getClass(), "sumTechMasterHighScore", -1397194044604203977L);
        setLongField(term152834, term152834.getClass(), "sumTechLunaticHighScore", 6285743072915973208L);
        setLongField(term152834, term152834.getClass(), "sumBattleHighScore", 1181688496390966879L);
        setLongField(term152834, term152834.getClass(), "sumBattleBasicHighScore", 6601409929231712200L);
        setLongField(term152834, term152834.getClass(), "sumBattleAdvancedHighScore", -2601991304881664917L);
        setLongField(term152834, term152834.getClass(), "sumBattleExpertHighScore", 4862692876541944031L);
        setLongField(term152834, term152834.getClass(), "sumBattleMasterHighScore", 7063106216882745981L);
        setLongField(term152834, term152834.getClass(), "sumBattleLunaticHighScore", 5812378928689447376L);
        setField(term152834, term152834.getClass(), "eventWatchedDate", "djcluFSRjM");
        setField(term152834, term152834.getClass(), "cmEventWatchedDate", "MBcybJsfOP");
        setField(term152834, term152834.getClass(), "firstGameId", "spZaeqpTCZ");
        setField(term152834, term152834.getClass(), "firstRomVersion", "vXFjQWxORA");
        setField(term152834, term152834.getClass(), "firstDataVersion", "jzhkCKcgje");
        setField(term152834, term152834.getClass(), "firstPlayDate", "THllnCKhSX");
        setField(term152834, term152834.getClass(), "lastGameId", "QENisOjsdU");
        setField(term152834, term152834.getClass(), "lastRomVersion", "XcNzjytYdo");
        setField(term152834, term152834.getClass(), "lastDataVersion", "yaWHpyBtzq");
        setField(term152834, term152834.getClass(), "compatibleCmVersion", "avheFeRlbW");
        setField(term152834, term152834.getClass(), "lastPlayDate", "tOwnGveRxa");
        setIntField(term152834, term152834.getClass(), "lastPlaceId", -1210651793);
        setField(term152834, term152834.getClass(), "lastPlaceName", "poFpgGCWFn");
        setIntField(term152834, term152834.getClass(), "lastRegionId", 1725376668);
        setField(term152834, term152834.getClass(), "lastRegionName", "RqdyWjrKTf");
        setIntField(term152834, term152834.getClass(), "lastAllNetId", 563995066);
        setField(term152834, term152834.getClass(), "lastClientId", "rWmZbuScqX");
        setIntField(term152834, term152834.getClass(), "lastUsedDeckId", -1143070528);
        setIntField(term152834, term152834.getClass(), "lastPlayMusicLevel", -2013146103);
        setIntField(term152834, term152834.getClass(), "lastEmoneyBrand", 1831685253);
        setField(term152832, term152832.getClass(), "user", term152834);
        setIntField(term152832, term152832.getClass(), "chapterId", 430196321);
        setIntField(term152832, term152832.getClass(), "tradeItemId", 211291160);
        setIntField(term152832, term152832.getClass(), "tradeCount", -317734451);
        term153100 = new Long(-3416092768635786579L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTradeItem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term153100;
        callMethod(klass, "setId", argTypes, term152832, args);
    }

};


