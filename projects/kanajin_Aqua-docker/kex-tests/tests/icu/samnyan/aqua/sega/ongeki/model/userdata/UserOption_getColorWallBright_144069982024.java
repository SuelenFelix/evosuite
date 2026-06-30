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

public class UserOption_getColorWallBright_144069982024 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term319539;

    public UserOption_getColorWallBright_144069982024() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term319545 = new Long(-5304831679802174866L);
        term319539 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption"));
        Object term319541 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term319543 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term319559 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term319560 = newInstance(Class.forName("java.time.LocalDate"));
        Object term319564 = newInstance(Class.forName("java.time.LocalTime"));
        Object term319569 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term319570 = newInstance(Class.forName("java.time.LocalDate"));
        Object term319574 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term319539, term319539.getClass(), "id", 1539737812596605225L);
        setLongField(term319541, term319541.getClass(), "id", -4956131686403609151L);
        setLongField(term319543, term319543.getClass(), "id", -2885002194148757475L);
        setField(term319543, term319543.getClass(), "extId", term319545);
        setField(term319543, term319543.getClass(), "luid", "YFZLyDMuhY");
        setIntField(term319560, term319560.getClass(), "year", 2028);
        setShortField(term319560, term319560.getClass(), "month", (short) 4);
        setShortField(term319560, term319560.getClass(), "day", (short) 17);
        setField(term319559, term319559.getClass(), "date", term319560);
        setByteField(term319564, term319564.getClass(), "hour", (byte) 15);
        setByteField(term319564, term319564.getClass(), "minute", (byte) 1);
        setByteField(term319564, term319564.getClass(), "second", (byte) 29);
        setIntField(term319564, term319564.getClass(), "nano", 418768816);
        setField(term319559, term319559.getClass(), "time", term319564);
        setField(term319543, term319543.getClass(), "registerTime", term319559);
        setIntField(term319570, term319570.getClass(), "year", 2010);
        setShortField(term319570, term319570.getClass(), "month", (short) 6);
        setShortField(term319570, term319570.getClass(), "day", (short) 21);
        setField(term319569, term319569.getClass(), "date", term319570);
        setByteField(term319574, term319574.getClass(), "hour", (byte) 15);
        setByteField(term319574, term319574.getClass(), "minute", (byte) 24);
        setByteField(term319574, term319574.getClass(), "second", (byte) 34);
        setIntField(term319574, term319574.getClass(), "nano", 890856885);
        setField(term319569, term319569.getClass(), "time", term319574);
        setField(term319543, term319543.getClass(), "accessTime", term319569);
        setField(term319541, term319541.getClass(), "card", term319543);
        setField(term319541, term319541.getClass(), "userName", "eSxfKsvpvb");
        setIntField(term319541, term319541.getClass(), "level", 286148133);
        setIntField(term319541, term319541.getClass(), "reincarnationNum", -1449899243);
        setLongField(term319541, term319541.getClass(), "exp", -3866349070225686569L);
        setLongField(term319541, term319541.getClass(), "point", 4765816365694048349L);
        setLongField(term319541, term319541.getClass(), "totalPoint", -1436998257770716812L);
        setIntField(term319541, term319541.getClass(), "playCount", 876020017);
        setIntField(term319541, term319541.getClass(), "jewelCount", 1695842603);
        setIntField(term319541, term319541.getClass(), "totalJewelCount", 742165444);
        setIntField(term319541, term319541.getClass(), "medalCount", 1508517248);
        setIntField(term319541, term319541.getClass(), "playerRating", 2066768205);
        setIntField(term319541, term319541.getClass(), "highestRating", 822003306);
        setIntField(term319541, term319541.getClass(), "battlePoint", 1462055910);
        setIntField(term319541, term319541.getClass(), "bestBattlePoint", -962847489);
        setIntField(term319541, term319541.getClass(), "overDamageBattlePoint", 1578579602);
        setBooleanField(term319541, term319541.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term319541, term319541.getClass(), "nameplateId", -1583718184);
        setIntField(term319541, term319541.getClass(), "trophyId", 858078327);
        setIntField(term319541, term319541.getClass(), "cardId", 834810548);
        setIntField(term319541, term319541.getClass(), "characterId", 1931636538);
        setIntField(term319541, term319541.getClass(), "characterVoiceNo", 832341694);
        setIntField(term319541, term319541.getClass(), "tabSetting", -364504021);
        setIntField(term319541, term319541.getClass(), "tabSortSetting", -1497625798);
        setIntField(term319541, term319541.getClass(), "cardCategorySetting", 385234662);
        setIntField(term319541, term319541.getClass(), "cardSortSetting", 1645696733);
        setIntField(term319541, term319541.getClass(), "rivalScoreCategorySetting", -310541938);
        setIntField(term319541, term319541.getClass(), "playedTutorialBit", -1083096531);
        setIntField(term319541, term319541.getClass(), "firstTutorialCancelNum", -1447027246);
        setLongField(term319541, term319541.getClass(), "sumTechHighScore", 1424695283246745551L);
        setLongField(term319541, term319541.getClass(), "sumTechBasicHighScore", -5707374722335700504L);
        setLongField(term319541, term319541.getClass(), "sumTechAdvancedHighScore", 303764544288341380L);
        setLongField(term319541, term319541.getClass(), "sumTechExpertHighScore", -628963889549333372L);
        setLongField(term319541, term319541.getClass(), "sumTechMasterHighScore", 7490198341808057333L);
        setLongField(term319541, term319541.getClass(), "sumTechLunaticHighScore", -6655165191989621123L);
        setLongField(term319541, term319541.getClass(), "sumBattleHighScore", -629861372330370161L);
        setLongField(term319541, term319541.getClass(), "sumBattleBasicHighScore", -1837230234318432491L);
        setLongField(term319541, term319541.getClass(), "sumBattleAdvancedHighScore", 8474542450568409457L);
        setLongField(term319541, term319541.getClass(), "sumBattleExpertHighScore", 3557135882745118204L);
        setLongField(term319541, term319541.getClass(), "sumBattleMasterHighScore", -6337824338755559821L);
        setLongField(term319541, term319541.getClass(), "sumBattleLunaticHighScore", -2994027012155622414L);
        setField(term319541, term319541.getClass(), "eventWatchedDate", "ObgoTiGGqJ");
        setField(term319541, term319541.getClass(), "cmEventWatchedDate", "vttSvVkwKf");
        setField(term319541, term319541.getClass(), "firstGameId", "eVerXajqbf");
        setField(term319541, term319541.getClass(), "firstRomVersion", "gEUVMHAYLC");
        setField(term319541, term319541.getClass(), "firstDataVersion", "bfkswvdlWr");
        setField(term319541, term319541.getClass(), "firstPlayDate", "VUVFZbHDVM");
        setField(term319541, term319541.getClass(), "lastGameId", "TuqpEkDWfJ");
        setField(term319541, term319541.getClass(), "lastRomVersion", "ZnTbplZaYU");
        setField(term319541, term319541.getClass(), "lastDataVersion", "FqFTgKznIP");
        setField(term319541, term319541.getClass(), "compatibleCmVersion", "JBKPJenQRu");
        setField(term319541, term319541.getClass(), "lastPlayDate", "bTdyzpRIdQ");
        setIntField(term319541, term319541.getClass(), "lastPlaceId", 1184842126);
        setField(term319541, term319541.getClass(), "lastPlaceName", "asRtqVqPdG");
        setIntField(term319541, term319541.getClass(), "lastRegionId", 1648455512);
        setField(term319541, term319541.getClass(), "lastRegionName", "UJPTKcUnZi");
        setIntField(term319541, term319541.getClass(), "lastAllNetId", 1397027310);
        setField(term319541, term319541.getClass(), "lastClientId", "GzcrOTeeyR");
        setIntField(term319541, term319541.getClass(), "lastUsedDeckId", -107872439);
        setIntField(term319541, term319541.getClass(), "lastPlayMusicLevel", -2080677845);
        setIntField(term319541, term319541.getClass(), "lastEmoneyBrand", 1246841349);
        setField(term319539, term319539.getClass(), "user", term319541);
        setIntField(term319539, term319539.getClass(), "optionSet", -430738521);
        setIntField(term319539, term319539.getClass(), "speed", -1780458662);
        setIntField(term319539, term319539.getClass(), "mirror", 729374381);
        setIntField(term319539, term319539.getClass(), "judgeTiming", -443962715);
        setIntField(term319539, term319539.getClass(), "judgeAdjustment", -746742900);
        setIntField(term319539, term319539.getClass(), "abort", 1428166603);
        setIntField(term319539, term319539.getClass(), "stealthField", -748430442);
        setIntField(term319539, term319539.getClass(), "tapSound", -1801319696);
        setIntField(term319539, term319539.getClass(), "volGuide", 976549220);
        setIntField(term319539, term319539.getClass(), "volAll", 1422580813);
        setIntField(term319539, term319539.getClass(), "volTap", -1683725807);
        setIntField(term319539, term319539.getClass(), "volCrTap", 705732253);
        setIntField(term319539, term319539.getClass(), "volHold", 1446036807);
        setIntField(term319539, term319539.getClass(), "volSide", -1664057871);
        setIntField(term319539, term319539.getClass(), "volFlick", 1384669782);
        setIntField(term319539, term319539.getClass(), "volBell", 1027730931);
        setIntField(term319539, term319539.getClass(), "volEnemy", -1150562135);
        setIntField(term319539, term319539.getClass(), "volSkill", 1961831898);
        setIntField(term319539, term319539.getClass(), "volDamage", 724749395);
        setIntField(term319539, term319539.getClass(), "colorField", -1323891297);
        setIntField(term319539, term319539.getClass(), "colorLaneBright", -397986922);
        setIntField(term319539, term319539.getClass(), "colorWallBright", 2077450036);
        setIntField(term319539, term319539.getClass(), "colorLane", -742772600);
        setIntField(term319539, term319539.getClass(), "colorSide", 980832200);
        setIntField(term319539, term319539.getClass(), "effectDamage", 716097087);
        setIntField(term319539, term319539.getClass(), "effectPos", -126117788);
        setIntField(term319539, term319539.getClass(), "judgeDisp", -1098020046);
        setIntField(term319539, term319539.getClass(), "judgePos", -1410831776);
        setIntField(term319539, term319539.getClass(), "judgeBreak", 668980916);
        setIntField(term319539, term319539.getClass(), "judgeHit", 1835770752);
        setIntField(term319539, term319539.getClass(), "platinumBreakDisp", 263724459);
        setIntField(term319539, term319539.getClass(), "judgeCriticalBreak", 284921533);
        setIntField(term319539, term319539.getClass(), "matching", -1455736078);
        setIntField(term319539, term319539.getClass(), "dispPlayerLv", -1644310015);
        setIntField(term319539, term319539.getClass(), "dispRating", 1698626064);
        setIntField(term319539, term319539.getClass(), "dispBP", -54698393);
        setIntField(term319539, term319539.getClass(), "headphone", 530054944);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getColorWallBright", argTypes, term319539, args);
    }

};


