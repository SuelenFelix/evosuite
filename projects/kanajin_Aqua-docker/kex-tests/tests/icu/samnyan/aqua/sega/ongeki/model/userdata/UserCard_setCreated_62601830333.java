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

public class UserCard_setCreated_62601830333 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term129830;

    public UserCard_setCreated_62601830333() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term129836 = new Long(174253963298276221L);
        term129830 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCard"));
        Object term129832 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term129834 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term129850 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term129851 = newInstance(Class.forName("java.time.LocalDate"));
        Object term129855 = newInstance(Class.forName("java.time.LocalTime"));
        Object term129860 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term129861 = newInstance(Class.forName("java.time.LocalDate"));
        Object term129865 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term129830, term129830.getClass(), "id", -3853896520277511258L);
        setLongField(term129832, term129832.getClass(), "id", 1791549525704106010L);
        setLongField(term129834, term129834.getClass(), "id", -8175025972603652997L);
        setField(term129834, term129834.getClass(), "extId", term129836);
        setField(term129834, term129834.getClass(), "luid", "urqqtlYppy");
        setIntField(term129851, term129851.getClass(), "year", 2013);
        setShortField(term129851, term129851.getClass(), "month", (short) 5);
        setShortField(term129851, term129851.getClass(), "day", (short) 5);
        setField(term129850, term129850.getClass(), "date", term129851);
        setByteField(term129855, term129855.getClass(), "hour", (byte) 7);
        setByteField(term129855, term129855.getClass(), "minute", (byte) 44);
        setByteField(term129855, term129855.getClass(), "second", (byte) 24);
        setIntField(term129855, term129855.getClass(), "nano", 458681760);
        setField(term129850, term129850.getClass(), "time", term129855);
        setField(term129834, term129834.getClass(), "registerTime", term129850);
        setIntField(term129861, term129861.getClass(), "year", 2019);
        setShortField(term129861, term129861.getClass(), "month", (short) 1);
        setShortField(term129861, term129861.getClass(), "day", (short) 12);
        setField(term129860, term129860.getClass(), "date", term129861);
        setByteField(term129865, term129865.getClass(), "hour", (byte) 5);
        setByteField(term129865, term129865.getClass(), "minute", (byte) 47);
        setByteField(term129865, term129865.getClass(), "second", (byte) 36);
        setIntField(term129865, term129865.getClass(), "nano", 50353124);
        setField(term129860, term129860.getClass(), "time", term129865);
        setField(term129834, term129834.getClass(), "accessTime", term129860);
        setField(term129832, term129832.getClass(), "card", term129834);
        setField(term129832, term129832.getClass(), "userName", "znNUsUuegd");
        setIntField(term129832, term129832.getClass(), "level", -321103963);
        setIntField(term129832, term129832.getClass(), "reincarnationNum", 8427599);
        setLongField(term129832, term129832.getClass(), "exp", 7936877378467190279L);
        setLongField(term129832, term129832.getClass(), "point", 6849625697033516355L);
        setLongField(term129832, term129832.getClass(), "totalPoint", -7258390453288297477L);
        setIntField(term129832, term129832.getClass(), "playCount", 565643760);
        setIntField(term129832, term129832.getClass(), "jewelCount", -999329318);
        setIntField(term129832, term129832.getClass(), "totalJewelCount", 1219080873);
        setIntField(term129832, term129832.getClass(), "medalCount", -1369941721);
        setIntField(term129832, term129832.getClass(), "playerRating", 1986462729);
        setIntField(term129832, term129832.getClass(), "highestRating", 1566646372);
        setIntField(term129832, term129832.getClass(), "battlePoint", 1570723755);
        setIntField(term129832, term129832.getClass(), "bestBattlePoint", 1595861707);
        setIntField(term129832, term129832.getClass(), "overDamageBattlePoint", 2030560074);
        setBooleanField(term129832, term129832.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term129832, term129832.getClass(), "nameplateId", 961353937);
        setIntField(term129832, term129832.getClass(), "trophyId", 2105207916);
        setIntField(term129832, term129832.getClass(), "cardId", -1476783213);
        setIntField(term129832, term129832.getClass(), "characterId", -1012030562);
        setIntField(term129832, term129832.getClass(), "characterVoiceNo", -224086286);
        setIntField(term129832, term129832.getClass(), "tabSetting", -516725720);
        setIntField(term129832, term129832.getClass(), "tabSortSetting", 2065578304);
        setIntField(term129832, term129832.getClass(), "cardCategorySetting", 1871438692);
        setIntField(term129832, term129832.getClass(), "cardSortSetting", 1087029364);
        setIntField(term129832, term129832.getClass(), "rivalScoreCategorySetting", 862581532);
        setIntField(term129832, term129832.getClass(), "playedTutorialBit", -1973508048);
        setIntField(term129832, term129832.getClass(), "firstTutorialCancelNum", 1749871768);
        setLongField(term129832, term129832.getClass(), "sumTechHighScore", -6697023539048814763L);
        setLongField(term129832, term129832.getClass(), "sumTechBasicHighScore", 2168259007750328884L);
        setLongField(term129832, term129832.getClass(), "sumTechAdvancedHighScore", -631251085590727632L);
        setLongField(term129832, term129832.getClass(), "sumTechExpertHighScore", 4565378783550338035L);
        setLongField(term129832, term129832.getClass(), "sumTechMasterHighScore", -2581868949144490049L);
        setLongField(term129832, term129832.getClass(), "sumTechLunaticHighScore", 2516357507490078047L);
        setLongField(term129832, term129832.getClass(), "sumBattleHighScore", -6072598156864132387L);
        setLongField(term129832, term129832.getClass(), "sumBattleBasicHighScore", 7650569193474050985L);
        setLongField(term129832, term129832.getClass(), "sumBattleAdvancedHighScore", -829914049505547750L);
        setLongField(term129832, term129832.getClass(), "sumBattleExpertHighScore", 8139814441817619312L);
        setLongField(term129832, term129832.getClass(), "sumBattleMasterHighScore", -3769068841153313601L);
        setLongField(term129832, term129832.getClass(), "sumBattleLunaticHighScore", 620059637779482983L);
        setField(term129832, term129832.getClass(), "eventWatchedDate", "TvOdQLksId");
        setField(term129832, term129832.getClass(), "cmEventWatchedDate", "gbrBAjYfeF");
        setField(term129832, term129832.getClass(), "firstGameId", "oQyDIyWghi");
        setField(term129832, term129832.getClass(), "firstRomVersion", "VGvITdbKFh");
        setField(term129832, term129832.getClass(), "firstDataVersion", "OzwgkolGue");
        setField(term129832, term129832.getClass(), "firstPlayDate", "wqwrSGuByQ");
        setField(term129832, term129832.getClass(), "lastGameId", "KJOrIBIJCp");
        setField(term129832, term129832.getClass(), "lastRomVersion", "LHDRljWYoi");
        setField(term129832, term129832.getClass(), "lastDataVersion", "buQOGnBPlD");
        setField(term129832, term129832.getClass(), "compatibleCmVersion", "ofiucEZNjp");
        setField(term129832, term129832.getClass(), "lastPlayDate", "kbQZxTtvgH");
        setIntField(term129832, term129832.getClass(), "lastPlaceId", 1267245359);
        setField(term129832, term129832.getClass(), "lastPlaceName", "aYWilzmMDP");
        setIntField(term129832, term129832.getClass(), "lastRegionId", -487049656);
        setField(term129832, term129832.getClass(), "lastRegionName", "AaQIoxTkkz");
        setIntField(term129832, term129832.getClass(), "lastAllNetId", -971073075);
        setField(term129832, term129832.getClass(), "lastClientId", "utuhuXZwKw");
        setIntField(term129832, term129832.getClass(), "lastUsedDeckId", -1888637904);
        setIntField(term129832, term129832.getClass(), "lastPlayMusicLevel", 564828352);
        setIntField(term129832, term129832.getClass(), "lastEmoneyBrand", 1355977590);
        setField(term129830, term129830.getClass(), "user", term129832);
        setIntField(term129830, term129830.getClass(), "cardId", -1);
        setIntField(term129830, term129830.getClass(), "digitalStock", 1);
        setIntField(term129830, term129830.getClass(), "analogStock", 1151839814);
        setIntField(term129830, term129830.getClass(), "level", 928463816);
        setIntField(term129830, term129830.getClass(), "maxLevel", 10);
        setIntField(term129830, term129830.getClass(), "exp", 800632148);
        setIntField(term129830, term129830.getClass(), "printCount", 979506554);
        setIntField(term129830, term129830.getClass(), "useCount", 1291963778);
        setBooleanField(term129830, term129830.getClass(), "isNew", true);
        setField(term129830, term129830.getClass(), "kaikaDate", "0000-00-00 00:00:00.0");
        setField(term129830, term129830.getClass(), "choKaikaDate", "0000-00-00 00:00:00.0");
        setIntField(term129830, term129830.getClass(), "skillId", -1370168960);
        setBooleanField(term129830, term129830.getClass(), "isAcquired", true);
        setField(term129830, term129830.getClass(), "created", "0000-00-00 00:00:00.0");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCard");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "HDmUBvnTDS";
        callMethod(klass, "setCreated", argTypes, term129830, args);
    }

};


