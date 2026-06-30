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
import java.lang.Integer;

public class UserOption_setVolEnemy_181301652858 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term335704;
     Object term336006;

    public UserOption_setVolEnemy_181301652858() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term335710 = new Long(3221586604131689186L);
        term335704 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption"));
        Object term335706 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term335708 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term335724 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term335725 = newInstance(Class.forName("java.time.LocalDate"));
        Object term335729 = newInstance(Class.forName("java.time.LocalTime"));
        Object term335734 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term335735 = newInstance(Class.forName("java.time.LocalDate"));
        Object term335739 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term335704, term335704.getClass(), "id", 9215880761647674721L);
        setLongField(term335706, term335706.getClass(), "id", -4716715040638117230L);
        setLongField(term335708, term335708.getClass(), "id", -3222096931819402842L);
        setField(term335708, term335708.getClass(), "extId", term335710);
        setField(term335708, term335708.getClass(), "luid", "uUqNYoBspc");
        setIntField(term335725, term335725.getClass(), "year", 2025);
        setShortField(term335725, term335725.getClass(), "month", (short) 5);
        setShortField(term335725, term335725.getClass(), "day", (short) 13);
        setField(term335724, term335724.getClass(), "date", term335725);
        setByteField(term335729, term335729.getClass(), "hour", (byte) 19);
        setByteField(term335729, term335729.getClass(), "minute", (byte) 3);
        setByteField(term335729, term335729.getClass(), "second", (byte) 14);
        setIntField(term335729, term335729.getClass(), "nano", 805900693);
        setField(term335724, term335724.getClass(), "time", term335729);
        setField(term335708, term335708.getClass(), "registerTime", term335724);
        setIntField(term335735, term335735.getClass(), "year", 2016);
        setShortField(term335735, term335735.getClass(), "month", (short) 1);
        setShortField(term335735, term335735.getClass(), "day", (short) 31);
        setField(term335734, term335734.getClass(), "date", term335735);
        setByteField(term335739, term335739.getClass(), "hour", (byte) 11);
        setByteField(term335739, term335739.getClass(), "minute", (byte) 50);
        setByteField(term335739, term335739.getClass(), "second", (byte) 49);
        setIntField(term335739, term335739.getClass(), "nano", 462330089);
        setField(term335734, term335734.getClass(), "time", term335739);
        setField(term335708, term335708.getClass(), "accessTime", term335734);
        setField(term335706, term335706.getClass(), "card", term335708);
        setField(term335706, term335706.getClass(), "userName", "IkzGQgLbPx");
        setIntField(term335706, term335706.getClass(), "level", 1364004519);
        setIntField(term335706, term335706.getClass(), "reincarnationNum", 861046709);
        setLongField(term335706, term335706.getClass(), "exp", 8369064211820410310L);
        setLongField(term335706, term335706.getClass(), "point", 2679101600476374403L);
        setLongField(term335706, term335706.getClass(), "totalPoint", -4991260996405302667L);
        setIntField(term335706, term335706.getClass(), "playCount", -1744914166);
        setIntField(term335706, term335706.getClass(), "jewelCount", 906584268);
        setIntField(term335706, term335706.getClass(), "totalJewelCount", -187032905);
        setIntField(term335706, term335706.getClass(), "medalCount", 1584947245);
        setIntField(term335706, term335706.getClass(), "playerRating", -354980213);
        setIntField(term335706, term335706.getClass(), "highestRating", -1623647602);
        setIntField(term335706, term335706.getClass(), "battlePoint", 505830311);
        setIntField(term335706, term335706.getClass(), "bestBattlePoint", 1992873484);
        setIntField(term335706, term335706.getClass(), "overDamageBattlePoint", 1375612429);
        setBooleanField(term335706, term335706.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term335706, term335706.getClass(), "nameplateId", -1704318634);
        setIntField(term335706, term335706.getClass(), "trophyId", -480834081);
        setIntField(term335706, term335706.getClass(), "cardId", 1993531080);
        setIntField(term335706, term335706.getClass(), "characterId", -326745097);
        setIntField(term335706, term335706.getClass(), "characterVoiceNo", 472467722);
        setIntField(term335706, term335706.getClass(), "tabSetting", 2128617137);
        setIntField(term335706, term335706.getClass(), "tabSortSetting", -1159330323);
        setIntField(term335706, term335706.getClass(), "cardCategorySetting", 1179306009);
        setIntField(term335706, term335706.getClass(), "cardSortSetting", 1486204313);
        setIntField(term335706, term335706.getClass(), "rivalScoreCategorySetting", -1032722719);
        setIntField(term335706, term335706.getClass(), "playedTutorialBit", -275943600);
        setIntField(term335706, term335706.getClass(), "firstTutorialCancelNum", -2043066933);
        setLongField(term335706, term335706.getClass(), "sumTechHighScore", 1540040088615278880L);
        setLongField(term335706, term335706.getClass(), "sumTechBasicHighScore", -6595099474586765107L);
        setLongField(term335706, term335706.getClass(), "sumTechAdvancedHighScore", 5090166102113455931L);
        setLongField(term335706, term335706.getClass(), "sumTechExpertHighScore", 7621309538944422477L);
        setLongField(term335706, term335706.getClass(), "sumTechMasterHighScore", 5158026024177121834L);
        setLongField(term335706, term335706.getClass(), "sumTechLunaticHighScore", -4792922023170377628L);
        setLongField(term335706, term335706.getClass(), "sumBattleHighScore", 3968778366791355680L);
        setLongField(term335706, term335706.getClass(), "sumBattleBasicHighScore", 6985368864514253144L);
        setLongField(term335706, term335706.getClass(), "sumBattleAdvancedHighScore", 6026540193972569518L);
        setLongField(term335706, term335706.getClass(), "sumBattleExpertHighScore", 6457473681394534249L);
        setLongField(term335706, term335706.getClass(), "sumBattleMasterHighScore", -3437718293614851699L);
        setLongField(term335706, term335706.getClass(), "sumBattleLunaticHighScore", 4541229434728531510L);
        setField(term335706, term335706.getClass(), "eventWatchedDate", "FPJZmNwXeA");
        setField(term335706, term335706.getClass(), "cmEventWatchedDate", "KGEYpqhyix");
        setField(term335706, term335706.getClass(), "firstGameId", "aGfTbfKkta");
        setField(term335706, term335706.getClass(), "firstRomVersion", "gPjxhkCfLk");
        setField(term335706, term335706.getClass(), "firstDataVersion", "CgaZBWEliI");
        setField(term335706, term335706.getClass(), "firstPlayDate", "zoGIuapUuH");
        setField(term335706, term335706.getClass(), "lastGameId", "wmFNFItEDO");
        setField(term335706, term335706.getClass(), "lastRomVersion", "zuSHCmjoJr");
        setField(term335706, term335706.getClass(), "lastDataVersion", "oFWSOiBgQG");
        setField(term335706, term335706.getClass(), "compatibleCmVersion", "rWcuGowgzR");
        setField(term335706, term335706.getClass(), "lastPlayDate", "NctZSlLgAp");
        setIntField(term335706, term335706.getClass(), "lastPlaceId", -982846897);
        setField(term335706, term335706.getClass(), "lastPlaceName", "YzfyNKMJHF");
        setIntField(term335706, term335706.getClass(), "lastRegionId", 1537837415);
        setField(term335706, term335706.getClass(), "lastRegionName", "tQXRrIsWnO");
        setIntField(term335706, term335706.getClass(), "lastAllNetId", 444352650);
        setField(term335706, term335706.getClass(), "lastClientId", "pWBQUtFpDR");
        setIntField(term335706, term335706.getClass(), "lastUsedDeckId", -673430955);
        setIntField(term335706, term335706.getClass(), "lastPlayMusicLevel", 451553897);
        setIntField(term335706, term335706.getClass(), "lastEmoneyBrand", 1017248371);
        setField(term335704, term335704.getClass(), "user", term335706);
        setIntField(term335704, term335704.getClass(), "optionSet", 1548443044);
        setIntField(term335704, term335704.getClass(), "speed", 1788691857);
        setIntField(term335704, term335704.getClass(), "mirror", -2048203029);
        setIntField(term335704, term335704.getClass(), "judgeTiming", 1876947632);
        setIntField(term335704, term335704.getClass(), "judgeAdjustment", 1664009487);
        setIntField(term335704, term335704.getClass(), "abort", -1634973489);
        setIntField(term335704, term335704.getClass(), "stealthField", -661240399);
        setIntField(term335704, term335704.getClass(), "tapSound", 636703436);
        setIntField(term335704, term335704.getClass(), "volGuide", 1841682134);
        setIntField(term335704, term335704.getClass(), "volAll", 183807992);
        setIntField(term335704, term335704.getClass(), "volTap", 349920708);
        setIntField(term335704, term335704.getClass(), "volCrTap", -137577672);
        setIntField(term335704, term335704.getClass(), "volHold", 1352065814);
        setIntField(term335704, term335704.getClass(), "volSide", -991547147);
        setIntField(term335704, term335704.getClass(), "volFlick", 2093849839);
        setIntField(term335704, term335704.getClass(), "volBell", 1131306028);
        setIntField(term335704, term335704.getClass(), "volEnemy", 65756077);
        setIntField(term335704, term335704.getClass(), "volSkill", 492457297);
        setIntField(term335704, term335704.getClass(), "volDamage", -1894585711);
        setIntField(term335704, term335704.getClass(), "colorField", -1920253459);
        setIntField(term335704, term335704.getClass(), "colorLaneBright", -1713871568);
        setIntField(term335704, term335704.getClass(), "colorWallBright", 1308967452);
        setIntField(term335704, term335704.getClass(), "colorLane", 831562675);
        setIntField(term335704, term335704.getClass(), "colorSide", -770137774);
        setIntField(term335704, term335704.getClass(), "effectDamage", 411763491);
        setIntField(term335704, term335704.getClass(), "effectPos", -1284795885);
        setIntField(term335704, term335704.getClass(), "judgeDisp", 1474544732);
        setIntField(term335704, term335704.getClass(), "judgePos", 1275652227);
        setIntField(term335704, term335704.getClass(), "judgeBreak", 44979043);
        setIntField(term335704, term335704.getClass(), "judgeHit", 549686781);
        setIntField(term335704, term335704.getClass(), "platinumBreakDisp", -819867100);
        setIntField(term335704, term335704.getClass(), "judgeCriticalBreak", 564172804);
        setIntField(term335704, term335704.getClass(), "matching", 2050329830);
        setIntField(term335704, term335704.getClass(), "dispPlayerLv", 280788823);
        setIntField(term335704, term335704.getClass(), "dispRating", 2049268742);
        setIntField(term335704, term335704.getClass(), "dispBP", 2068916209);
        setIntField(term335704, term335704.getClass(), "headphone", -130370137);
        term336006 = new Integer(1539004723);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term336006;
        callMethod(klass, "setVolEnemy", argTypes, term335704, args);
    }

};


