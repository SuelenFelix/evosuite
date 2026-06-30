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

public class UserOption_getOptionSet_14964620423 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term309837;

    public UserOption_getOptionSet_14964620423() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term309843 = new Long(6462632207326555041L);
        term309837 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption"));
        Object term309839 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term309841 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term309857 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term309858 = newInstance(Class.forName("java.time.LocalDate"));
        Object term309862 = newInstance(Class.forName("java.time.LocalTime"));
        Object term309867 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term309868 = newInstance(Class.forName("java.time.LocalDate"));
        Object term309872 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term309837, term309837.getClass(), "id", 6794298165226854849L);
        setLongField(term309839, term309839.getClass(), "id", -5138078687614978607L);
        setLongField(term309841, term309841.getClass(), "id", -2262451742054862630L);
        setField(term309841, term309841.getClass(), "extId", term309843);
        setField(term309841, term309841.getClass(), "luid", "fAdWwXotkA");
        setIntField(term309858, term309858.getClass(), "year", 2017);
        setShortField(term309858, term309858.getClass(), "month", (short) 8);
        setShortField(term309858, term309858.getClass(), "day", (short) 20);
        setField(term309857, term309857.getClass(), "date", term309858);
        setByteField(term309862, term309862.getClass(), "hour", (byte) 5);
        setByteField(term309862, term309862.getClass(), "minute", (byte) 32);
        setByteField(term309862, term309862.getClass(), "second", (byte) 38);
        setIntField(term309862, term309862.getClass(), "nano", 305374448);
        setField(term309857, term309857.getClass(), "time", term309862);
        setField(term309841, term309841.getClass(), "registerTime", term309857);
        setIntField(term309868, term309868.getClass(), "year", 2012);
        setShortField(term309868, term309868.getClass(), "month", (short) 6);
        setShortField(term309868, term309868.getClass(), "day", (short) 17);
        setField(term309867, term309867.getClass(), "date", term309868);
        setByteField(term309872, term309872.getClass(), "hour", (byte) 6);
        setByteField(term309872, term309872.getClass(), "minute", (byte) 7);
        setByteField(term309872, term309872.getClass(), "second", (byte) 50);
        setIntField(term309872, term309872.getClass(), "nano", 177119565);
        setField(term309867, term309867.getClass(), "time", term309872);
        setField(term309841, term309841.getClass(), "accessTime", term309867);
        setField(term309839, term309839.getClass(), "card", term309841);
        setField(term309839, term309839.getClass(), "userName", "bviXUjxTVM");
        setIntField(term309839, term309839.getClass(), "level", 623165698);
        setIntField(term309839, term309839.getClass(), "reincarnationNum", -501370916);
        setLongField(term309839, term309839.getClass(), "exp", 8431121119551698352L);
        setLongField(term309839, term309839.getClass(), "point", 5316579365368352932L);
        setLongField(term309839, term309839.getClass(), "totalPoint", -6969814392066731413L);
        setIntField(term309839, term309839.getClass(), "playCount", 1563227237);
        setIntField(term309839, term309839.getClass(), "jewelCount", -842127329);
        setIntField(term309839, term309839.getClass(), "totalJewelCount", -764787306);
        setIntField(term309839, term309839.getClass(), "medalCount", -105844576);
        setIntField(term309839, term309839.getClass(), "playerRating", -542844187);
        setIntField(term309839, term309839.getClass(), "highestRating", -1177667412);
        setIntField(term309839, term309839.getClass(), "battlePoint", 1248769105);
        setIntField(term309839, term309839.getClass(), "bestBattlePoint", 443403037);
        setIntField(term309839, term309839.getClass(), "overDamageBattlePoint", 361792760);
        setBooleanField(term309839, term309839.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term309839, term309839.getClass(), "nameplateId", 944201659);
        setIntField(term309839, term309839.getClass(), "trophyId", -354873535);
        setIntField(term309839, term309839.getClass(), "cardId", -222455686);
        setIntField(term309839, term309839.getClass(), "characterId", 55563742);
        setIntField(term309839, term309839.getClass(), "characterVoiceNo", -1617934340);
        setIntField(term309839, term309839.getClass(), "tabSetting", -1202350370);
        setIntField(term309839, term309839.getClass(), "tabSortSetting", -793206516);
        setIntField(term309839, term309839.getClass(), "cardCategorySetting", 873560919);
        setIntField(term309839, term309839.getClass(), "cardSortSetting", -17868049);
        setIntField(term309839, term309839.getClass(), "rivalScoreCategorySetting", 373456257);
        setIntField(term309839, term309839.getClass(), "playedTutorialBit", 114867379);
        setIntField(term309839, term309839.getClass(), "firstTutorialCancelNum", -1440018382);
        setLongField(term309839, term309839.getClass(), "sumTechHighScore", 5257863366438349788L);
        setLongField(term309839, term309839.getClass(), "sumTechBasicHighScore", -1105128665489084910L);
        setLongField(term309839, term309839.getClass(), "sumTechAdvancedHighScore", 500025007176394481L);
        setLongField(term309839, term309839.getClass(), "sumTechExpertHighScore", -2532817991514286043L);
        setLongField(term309839, term309839.getClass(), "sumTechMasterHighScore", 652053836521182988L);
        setLongField(term309839, term309839.getClass(), "sumTechLunaticHighScore", 3299133836581490229L);
        setLongField(term309839, term309839.getClass(), "sumBattleHighScore", -958625180959363760L);
        setLongField(term309839, term309839.getClass(), "sumBattleBasicHighScore", 7352971617348182729L);
        setLongField(term309839, term309839.getClass(), "sumBattleAdvancedHighScore", 8337856926161965666L);
        setLongField(term309839, term309839.getClass(), "sumBattleExpertHighScore", 1261654460086152837L);
        setLongField(term309839, term309839.getClass(), "sumBattleMasterHighScore", 8433870520868156971L);
        setLongField(term309839, term309839.getClass(), "sumBattleLunaticHighScore", -5689250399246225528L);
        setField(term309839, term309839.getClass(), "eventWatchedDate", "kchlDlnXwq");
        setField(term309839, term309839.getClass(), "cmEventWatchedDate", "bIRvjZZUjf");
        setField(term309839, term309839.getClass(), "firstGameId", "BehfSbxgxB");
        setField(term309839, term309839.getClass(), "firstRomVersion", "wjLowxXqMV");
        setField(term309839, term309839.getClass(), "firstDataVersion", "ZKmgqtnyWl");
        setField(term309839, term309839.getClass(), "firstPlayDate", "jbKfSPsbrl");
        setField(term309839, term309839.getClass(), "lastGameId", "cgnSRPOCMZ");
        setField(term309839, term309839.getClass(), "lastRomVersion", "rsZIFmJCSV");
        setField(term309839, term309839.getClass(), "lastDataVersion", "tGfCBlTvvA");
        setField(term309839, term309839.getClass(), "compatibleCmVersion", "XRvQvyRaeI");
        setField(term309839, term309839.getClass(), "lastPlayDate", "PiiAJlvOam");
        setIntField(term309839, term309839.getClass(), "lastPlaceId", -610110994);
        setField(term309839, term309839.getClass(), "lastPlaceName", "siXyhYgybV");
        setIntField(term309839, term309839.getClass(), "lastRegionId", -743449066);
        setField(term309839, term309839.getClass(), "lastRegionName", "ZyNlPlXuvg");
        setIntField(term309839, term309839.getClass(), "lastAllNetId", -225766012);
        setField(term309839, term309839.getClass(), "lastClientId", "OXzFwGxUWY");
        setIntField(term309839, term309839.getClass(), "lastUsedDeckId", 1194873891);
        setIntField(term309839, term309839.getClass(), "lastPlayMusicLevel", -507374736);
        setIntField(term309839, term309839.getClass(), "lastEmoneyBrand", 400288272);
        setField(term309837, term309837.getClass(), "user", term309839);
        setIntField(term309837, term309837.getClass(), "optionSet", 860418216);
        setIntField(term309837, term309837.getClass(), "speed", 1884654809);
        setIntField(term309837, term309837.getClass(), "mirror", 449101963);
        setIntField(term309837, term309837.getClass(), "judgeTiming", 2104459933);
        setIntField(term309837, term309837.getClass(), "judgeAdjustment", 150577539);
        setIntField(term309837, term309837.getClass(), "abort", -1686739888);
        setIntField(term309837, term309837.getClass(), "stealthField", -190114118);
        setIntField(term309837, term309837.getClass(), "tapSound", -548490981);
        setIntField(term309837, term309837.getClass(), "volGuide", 2011040536);
        setIntField(term309837, term309837.getClass(), "volAll", 823908451);
        setIntField(term309837, term309837.getClass(), "volTap", 103139808);
        setIntField(term309837, term309837.getClass(), "volCrTap", -283921719);
        setIntField(term309837, term309837.getClass(), "volHold", -915909717);
        setIntField(term309837, term309837.getClass(), "volSide", 113315748);
        setIntField(term309837, term309837.getClass(), "volFlick", 26393228);
        setIntField(term309837, term309837.getClass(), "volBell", -1954378815);
        setIntField(term309837, term309837.getClass(), "volEnemy", 1114156711);
        setIntField(term309837, term309837.getClass(), "volSkill", 58730352);
        setIntField(term309837, term309837.getClass(), "volDamage", 851356798);
        setIntField(term309837, term309837.getClass(), "colorField", 263083301);
        setIntField(term309837, term309837.getClass(), "colorLaneBright", -1977458494);
        setIntField(term309837, term309837.getClass(), "colorWallBright", -286437571);
        setIntField(term309837, term309837.getClass(), "colorLane", 1982685546);
        setIntField(term309837, term309837.getClass(), "colorSide", 157858456);
        setIntField(term309837, term309837.getClass(), "effectDamage", -1049992610);
        setIntField(term309837, term309837.getClass(), "effectPos", 993510709);
        setIntField(term309837, term309837.getClass(), "judgeDisp", 478288891);
        setIntField(term309837, term309837.getClass(), "judgePos", 841439984);
        setIntField(term309837, term309837.getClass(), "judgeBreak", -819772366);
        setIntField(term309837, term309837.getClass(), "judgeHit", -461010936);
        setIntField(term309837, term309837.getClass(), "platinumBreakDisp", 767479578);
        setIntField(term309837, term309837.getClass(), "judgeCriticalBreak", 1611792425);
        setIntField(term309837, term309837.getClass(), "matching", -159368663);
        setIntField(term309837, term309837.getClass(), "dispPlayerLv", 1769460221);
        setIntField(term309837, term309837.getClass(), "dispRating", 246447471);
        setIntField(term309837, term309837.getClass(), "dispBP", -660086116);
        setIntField(term309837, term309837.getClass(), "headphone", -1917620087);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOptionSet", argTypes, term309837, args);
    }

};


