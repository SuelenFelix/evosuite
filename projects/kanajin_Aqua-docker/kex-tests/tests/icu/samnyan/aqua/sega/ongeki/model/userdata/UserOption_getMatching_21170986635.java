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

public class UserOption_getMatching_21170986635 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term324621;

    public UserOption_getMatching_21170986635() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term324627 = new Long(353705949229610067L);
        term324621 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption"));
        Object term324623 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term324625 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term324641 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term324642 = newInstance(Class.forName("java.time.LocalDate"));
        Object term324646 = newInstance(Class.forName("java.time.LocalTime"));
        Object term324651 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term324652 = newInstance(Class.forName("java.time.LocalDate"));
        Object term324656 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term324621, term324621.getClass(), "id", 3496932289017889172L);
        setLongField(term324623, term324623.getClass(), "id", 6623170798563670702L);
        setLongField(term324625, term324625.getClass(), "id", -2162156318491147026L);
        setField(term324625, term324625.getClass(), "extId", term324627);
        setField(term324625, term324625.getClass(), "luid", "RtCXmezBgn");
        setIntField(term324642, term324642.getClass(), "year", 2022);
        setShortField(term324642, term324642.getClass(), "month", (short) 9);
        setShortField(term324642, term324642.getClass(), "day", (short) 30);
        setField(term324641, term324641.getClass(), "date", term324642);
        setByteField(term324646, term324646.getClass(), "hour", (byte) 18);
        setByteField(term324646, term324646.getClass(), "minute", (byte) 17);
        setByteField(term324646, term324646.getClass(), "second", (byte) 27);
        setIntField(term324646, term324646.getClass(), "nano", 167226799);
        setField(term324641, term324641.getClass(), "time", term324646);
        setField(term324625, term324625.getClass(), "registerTime", term324641);
        setIntField(term324652, term324652.getClass(), "year", 2026);
        setShortField(term324652, term324652.getClass(), "month", (short) 3);
        setShortField(term324652, term324652.getClass(), "day", (short) 11);
        setField(term324651, term324651.getClass(), "date", term324652);
        setByteField(term324656, term324656.getClass(), "hour", (byte) 15);
        setByteField(term324656, term324656.getClass(), "minute", (byte) 20);
        setByteField(term324656, term324656.getClass(), "second", (byte) 22);
        setIntField(term324656, term324656.getClass(), "nano", 811847268);
        setField(term324651, term324651.getClass(), "time", term324656);
        setField(term324625, term324625.getClass(), "accessTime", term324651);
        setField(term324623, term324623.getClass(), "card", term324625);
        setField(term324623, term324623.getClass(), "userName", "dreLrCoWLX");
        setIntField(term324623, term324623.getClass(), "level", -2098889927);
        setIntField(term324623, term324623.getClass(), "reincarnationNum", 303165594);
        setLongField(term324623, term324623.getClass(), "exp", -5945721087374315329L);
        setLongField(term324623, term324623.getClass(), "point", 4881657219490383499L);
        setLongField(term324623, term324623.getClass(), "totalPoint", 5848533832389648623L);
        setIntField(term324623, term324623.getClass(), "playCount", 965505668);
        setIntField(term324623, term324623.getClass(), "jewelCount", 484030783);
        setIntField(term324623, term324623.getClass(), "totalJewelCount", -1065095360);
        setIntField(term324623, term324623.getClass(), "medalCount", -1792666903);
        setIntField(term324623, term324623.getClass(), "playerRating", -357530730);
        setIntField(term324623, term324623.getClass(), "highestRating", -1572391740);
        setIntField(term324623, term324623.getClass(), "battlePoint", 1513294330);
        setIntField(term324623, term324623.getClass(), "bestBattlePoint", 5176980);
        setIntField(term324623, term324623.getClass(), "overDamageBattlePoint", 556020394);
        setBooleanField(term324623, term324623.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term324623, term324623.getClass(), "nameplateId", -1290224726);
        setIntField(term324623, term324623.getClass(), "trophyId", -390790902);
        setIntField(term324623, term324623.getClass(), "cardId", -2125333816);
        setIntField(term324623, term324623.getClass(), "characterId", -1762438474);
        setIntField(term324623, term324623.getClass(), "characterVoiceNo", -1960460221);
        setIntField(term324623, term324623.getClass(), "tabSetting", 521694652);
        setIntField(term324623, term324623.getClass(), "tabSortSetting", -1117414883);
        setIntField(term324623, term324623.getClass(), "cardCategorySetting", -1801762710);
        setIntField(term324623, term324623.getClass(), "cardSortSetting", -846738955);
        setIntField(term324623, term324623.getClass(), "rivalScoreCategorySetting", 1151997055);
        setIntField(term324623, term324623.getClass(), "playedTutorialBit", 1833295608);
        setIntField(term324623, term324623.getClass(), "firstTutorialCancelNum", -1031774004);
        setLongField(term324623, term324623.getClass(), "sumTechHighScore", 7947110736288608685L);
        setLongField(term324623, term324623.getClass(), "sumTechBasicHighScore", 1858108874088492312L);
        setLongField(term324623, term324623.getClass(), "sumTechAdvancedHighScore", -6093525022251031602L);
        setLongField(term324623, term324623.getClass(), "sumTechExpertHighScore", -8135223655549085440L);
        setLongField(term324623, term324623.getClass(), "sumTechMasterHighScore", -5100540303005387876L);
        setLongField(term324623, term324623.getClass(), "sumTechLunaticHighScore", -7128267912400858365L);
        setLongField(term324623, term324623.getClass(), "sumBattleHighScore", 1239654987296646212L);
        setLongField(term324623, term324623.getClass(), "sumBattleBasicHighScore", 7832579837703676655L);
        setLongField(term324623, term324623.getClass(), "sumBattleAdvancedHighScore", -1275521763907155725L);
        setLongField(term324623, term324623.getClass(), "sumBattleExpertHighScore", 5038486764940862254L);
        setLongField(term324623, term324623.getClass(), "sumBattleMasterHighScore", -6880746655722201959L);
        setLongField(term324623, term324623.getClass(), "sumBattleLunaticHighScore", 8488599397193639978L);
        setField(term324623, term324623.getClass(), "eventWatchedDate", "TJoLLSFdFV");
        setField(term324623, term324623.getClass(), "cmEventWatchedDate", "DlYJNbsgPr");
        setField(term324623, term324623.getClass(), "firstGameId", "yVgEXUpgAR");
        setField(term324623, term324623.getClass(), "firstRomVersion", "rPPDgIYIXM");
        setField(term324623, term324623.getClass(), "firstDataVersion", "XJvuycHkCW");
        setField(term324623, term324623.getClass(), "firstPlayDate", "TBUcKpuFcN");
        setField(term324623, term324623.getClass(), "lastGameId", "cFsjhCTuDw");
        setField(term324623, term324623.getClass(), "lastRomVersion", "rEsRGZOyng");
        setField(term324623, term324623.getClass(), "lastDataVersion", "ivFlsOgmnv");
        setField(term324623, term324623.getClass(), "compatibleCmVersion", "RfBKEEOjtF");
        setField(term324623, term324623.getClass(), "lastPlayDate", "COQmNueGwj");
        setIntField(term324623, term324623.getClass(), "lastPlaceId", 1204374078);
        setField(term324623, term324623.getClass(), "lastPlaceName", "RPRgIgwxpR");
        setIntField(term324623, term324623.getClass(), "lastRegionId", 989278096);
        setField(term324623, term324623.getClass(), "lastRegionName", "xaogdJthGl");
        setIntField(term324623, term324623.getClass(), "lastAllNetId", -247741903);
        setField(term324623, term324623.getClass(), "lastClientId", "FBHiKEZDZh");
        setIntField(term324623, term324623.getClass(), "lastUsedDeckId", 1246330116);
        setIntField(term324623, term324623.getClass(), "lastPlayMusicLevel", -1044496905);
        setIntField(term324623, term324623.getClass(), "lastEmoneyBrand", 1084043512);
        setField(term324621, term324621.getClass(), "user", term324623);
        setIntField(term324621, term324621.getClass(), "optionSet", 1355022325);
        setIntField(term324621, term324621.getClass(), "speed", 657074036);
        setIntField(term324621, term324621.getClass(), "mirror", -2106646820);
        setIntField(term324621, term324621.getClass(), "judgeTiming", -1140904008);
        setIntField(term324621, term324621.getClass(), "judgeAdjustment", 1306218220);
        setIntField(term324621, term324621.getClass(), "abort", -468687349);
        setIntField(term324621, term324621.getClass(), "stealthField", 839051595);
        setIntField(term324621, term324621.getClass(), "tapSound", -171412415);
        setIntField(term324621, term324621.getClass(), "volGuide", 733242781);
        setIntField(term324621, term324621.getClass(), "volAll", 1881988571);
        setIntField(term324621, term324621.getClass(), "volTap", -870499765);
        setIntField(term324621, term324621.getClass(), "volCrTap", -39397335);
        setIntField(term324621, term324621.getClass(), "volHold", -704744943);
        setIntField(term324621, term324621.getClass(), "volSide", -1432282136);
        setIntField(term324621, term324621.getClass(), "volFlick", -1443771952);
        setIntField(term324621, term324621.getClass(), "volBell", 589229340);
        setIntField(term324621, term324621.getClass(), "volEnemy", 1864951734);
        setIntField(term324621, term324621.getClass(), "volSkill", 1720260418);
        setIntField(term324621, term324621.getClass(), "volDamage", 127845692);
        setIntField(term324621, term324621.getClass(), "colorField", -737730800);
        setIntField(term324621, term324621.getClass(), "colorLaneBright", 1266403206);
        setIntField(term324621, term324621.getClass(), "colorWallBright", -565034923);
        setIntField(term324621, term324621.getClass(), "colorLane", 1366543913);
        setIntField(term324621, term324621.getClass(), "colorSide", 559302076);
        setIntField(term324621, term324621.getClass(), "effectDamage", -1029061016);
        setIntField(term324621, term324621.getClass(), "effectPos", 1503900030);
        setIntField(term324621, term324621.getClass(), "judgeDisp", -2082234011);
        setIntField(term324621, term324621.getClass(), "judgePos", 616913226);
        setIntField(term324621, term324621.getClass(), "judgeBreak", 1811150294);
        setIntField(term324621, term324621.getClass(), "judgeHit", -2126490398);
        setIntField(term324621, term324621.getClass(), "platinumBreakDisp", -935679427);
        setIntField(term324621, term324621.getClass(), "judgeCriticalBreak", 2106277450);
        setIntField(term324621, term324621.getClass(), "matching", -1874013505);
        setIntField(term324621, term324621.getClass(), "dispPlayerLv", -377154693);
        setIntField(term324621, term324621.getClass(), "dispRating", -1995110914);
        setIntField(term324621, term324621.getClass(), "dispBP", -1015751446);
        setIntField(term324621, term324621.getClass(), "headphone", 1281547949);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMatching", argTypes, term324621, args);
    }

};


