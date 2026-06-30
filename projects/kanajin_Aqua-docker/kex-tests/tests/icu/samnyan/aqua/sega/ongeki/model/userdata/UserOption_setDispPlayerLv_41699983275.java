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

public class UserOption_setDispPlayerLv_41699983275 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term343592;
     Object term343894;

    public UserOption_setDispPlayerLv_41699983275() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term343598 = new Long(-5717327658642389548L);
        term343592 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption"));
        Object term343594 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term343596 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term343612 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term343613 = newInstance(Class.forName("java.time.LocalDate"));
        Object term343617 = newInstance(Class.forName("java.time.LocalTime"));
        Object term343622 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term343623 = newInstance(Class.forName("java.time.LocalDate"));
        Object term343627 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term343592, term343592.getClass(), "id", -8450153175886826308L);
        setLongField(term343594, term343594.getClass(), "id", 3694862706160402032L);
        setLongField(term343596, term343596.getClass(), "id", -9129137812653901366L);
        setField(term343596, term343596.getClass(), "extId", term343598);
        setField(term343596, term343596.getClass(), "luid", "AgvCGWLgAV");
        setIntField(term343613, term343613.getClass(), "year", 2010);
        setShortField(term343613, term343613.getClass(), "month", (short) 7);
        setShortField(term343613, term343613.getClass(), "day", (short) 28);
        setField(term343612, term343612.getClass(), "date", term343613);
        setByteField(term343617, term343617.getClass(), "hour", (byte) 3);
        setByteField(term343617, term343617.getClass(), "minute", (byte) 56);
        setByteField(term343617, term343617.getClass(), "second", (byte) 12);
        setIntField(term343617, term343617.getClass(), "nano", 875469418);
        setField(term343612, term343612.getClass(), "time", term343617);
        setField(term343596, term343596.getClass(), "registerTime", term343612);
        setIntField(term343623, term343623.getClass(), "year", 2018);
        setShortField(term343623, term343623.getClass(), "month", (short) 9);
        setShortField(term343623, term343623.getClass(), "day", (short) 17);
        setField(term343622, term343622.getClass(), "date", term343623);
        setByteField(term343627, term343627.getClass(), "hour", (byte) 10);
        setByteField(term343627, term343627.getClass(), "minute", (byte) 3);
        setByteField(term343627, term343627.getClass(), "second", (byte) 22);
        setIntField(term343627, term343627.getClass(), "nano", 633488486);
        setField(term343622, term343622.getClass(), "time", term343627);
        setField(term343596, term343596.getClass(), "accessTime", term343622);
        setField(term343594, term343594.getClass(), "card", term343596);
        setField(term343594, term343594.getClass(), "userName", "vOurrQqcsV");
        setIntField(term343594, term343594.getClass(), "level", -1758237048);
        setIntField(term343594, term343594.getClass(), "reincarnationNum", -2141953039);
        setLongField(term343594, term343594.getClass(), "exp", -2861154500484004092L);
        setLongField(term343594, term343594.getClass(), "point", -8869661970121880454L);
        setLongField(term343594, term343594.getClass(), "totalPoint", -470388858119450510L);
        setIntField(term343594, term343594.getClass(), "playCount", -861060846);
        setIntField(term343594, term343594.getClass(), "jewelCount", 483850181);
        setIntField(term343594, term343594.getClass(), "totalJewelCount", 231079422);
        setIntField(term343594, term343594.getClass(), "medalCount", 1335931396);
        setIntField(term343594, term343594.getClass(), "playerRating", 377258577);
        setIntField(term343594, term343594.getClass(), "highestRating", 750783547);
        setIntField(term343594, term343594.getClass(), "battlePoint", -768389590);
        setIntField(term343594, term343594.getClass(), "bestBattlePoint", 498754379);
        setIntField(term343594, term343594.getClass(), "overDamageBattlePoint", -1140236709);
        setBooleanField(term343594, term343594.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term343594, term343594.getClass(), "nameplateId", 553843984);
        setIntField(term343594, term343594.getClass(), "trophyId", 43468859);
        setIntField(term343594, term343594.getClass(), "cardId", 1155600394);
        setIntField(term343594, term343594.getClass(), "characterId", 1967252096);
        setIntField(term343594, term343594.getClass(), "characterVoiceNo", -1437510628);
        setIntField(term343594, term343594.getClass(), "tabSetting", 1564866334);
        setIntField(term343594, term343594.getClass(), "tabSortSetting", -1043457054);
        setIntField(term343594, term343594.getClass(), "cardCategorySetting", -924635767);
        setIntField(term343594, term343594.getClass(), "cardSortSetting", -799356883);
        setIntField(term343594, term343594.getClass(), "rivalScoreCategorySetting", -1050123832);
        setIntField(term343594, term343594.getClass(), "playedTutorialBit", 1385372);
        setIntField(term343594, term343594.getClass(), "firstTutorialCancelNum", -589937615);
        setLongField(term343594, term343594.getClass(), "sumTechHighScore", -5451547543128057793L);
        setLongField(term343594, term343594.getClass(), "sumTechBasicHighScore", -8737657840779988257L);
        setLongField(term343594, term343594.getClass(), "sumTechAdvancedHighScore", 6885734800311510406L);
        setLongField(term343594, term343594.getClass(), "sumTechExpertHighScore", -8292045313519002946L);
        setLongField(term343594, term343594.getClass(), "sumTechMasterHighScore", 7285961792716703991L);
        setLongField(term343594, term343594.getClass(), "sumTechLunaticHighScore", 3007321803944399805L);
        setLongField(term343594, term343594.getClass(), "sumBattleHighScore", -5611139441863720198L);
        setLongField(term343594, term343594.getClass(), "sumBattleBasicHighScore", -6231753535182168607L);
        setLongField(term343594, term343594.getClass(), "sumBattleAdvancedHighScore", -5067637487214193796L);
        setLongField(term343594, term343594.getClass(), "sumBattleExpertHighScore", 8872370986104910063L);
        setLongField(term343594, term343594.getClass(), "sumBattleMasterHighScore", -4869296584242821646L);
        setLongField(term343594, term343594.getClass(), "sumBattleLunaticHighScore", 734787515348095502L);
        setField(term343594, term343594.getClass(), "eventWatchedDate", "mHfWCxcvph");
        setField(term343594, term343594.getClass(), "cmEventWatchedDate", "pGiFHyughE");
        setField(term343594, term343594.getClass(), "firstGameId", "BVVILJrNia");
        setField(term343594, term343594.getClass(), "firstRomVersion", "LnCCnEofrk");
        setField(term343594, term343594.getClass(), "firstDataVersion", "McGIyCSPDq");
        setField(term343594, term343594.getClass(), "firstPlayDate", "DomylWWXxB");
        setField(term343594, term343594.getClass(), "lastGameId", "vRfpRLdeAD");
        setField(term343594, term343594.getClass(), "lastRomVersion", "DDnnywrZnT");
        setField(term343594, term343594.getClass(), "lastDataVersion", "RTPWtjtHWK");
        setField(term343594, term343594.getClass(), "compatibleCmVersion", "pqDGjszenJ");
        setField(term343594, term343594.getClass(), "lastPlayDate", "sKsDdPqeTA");
        setIntField(term343594, term343594.getClass(), "lastPlaceId", -2094798221);
        setField(term343594, term343594.getClass(), "lastPlaceName", "vFUYXLYAFj");
        setIntField(term343594, term343594.getClass(), "lastRegionId", -2133051693);
        setField(term343594, term343594.getClass(), "lastRegionName", "rOSqQHTefu");
        setIntField(term343594, term343594.getClass(), "lastAllNetId", 787940133);
        setField(term343594, term343594.getClass(), "lastClientId", "PdimqYzqnq");
        setIntField(term343594, term343594.getClass(), "lastUsedDeckId", 790706388);
        setIntField(term343594, term343594.getClass(), "lastPlayMusicLevel", -1253063138);
        setIntField(term343594, term343594.getClass(), "lastEmoneyBrand", 438967628);
        setField(term343592, term343592.getClass(), "user", term343594);
        setIntField(term343592, term343592.getClass(), "optionSet", 391165913);
        setIntField(term343592, term343592.getClass(), "speed", -627664282);
        setIntField(term343592, term343592.getClass(), "mirror", 426858053);
        setIntField(term343592, term343592.getClass(), "judgeTiming", 1783611082);
        setIntField(term343592, term343592.getClass(), "judgeAdjustment", 1981784835);
        setIntField(term343592, term343592.getClass(), "abort", -1097310555);
        setIntField(term343592, term343592.getClass(), "stealthField", 778302985);
        setIntField(term343592, term343592.getClass(), "tapSound", -61350205);
        setIntField(term343592, term343592.getClass(), "volGuide", -559353692);
        setIntField(term343592, term343592.getClass(), "volAll", -454902894);
        setIntField(term343592, term343592.getClass(), "volTap", -453497094);
        setIntField(term343592, term343592.getClass(), "volCrTap", -779349222);
        setIntField(term343592, term343592.getClass(), "volHold", 602547827);
        setIntField(term343592, term343592.getClass(), "volSide", -693722083);
        setIntField(term343592, term343592.getClass(), "volFlick", -1238070855);
        setIntField(term343592, term343592.getClass(), "volBell", -1515130373);
        setIntField(term343592, term343592.getClass(), "volEnemy", -1898635483);
        setIntField(term343592, term343592.getClass(), "volSkill", 847436830);
        setIntField(term343592, term343592.getClass(), "volDamage", 1128285405);
        setIntField(term343592, term343592.getClass(), "colorField", 947308779);
        setIntField(term343592, term343592.getClass(), "colorLaneBright", -2043021842);
        setIntField(term343592, term343592.getClass(), "colorWallBright", -362424436);
        setIntField(term343592, term343592.getClass(), "colorLane", 2030573082);
        setIntField(term343592, term343592.getClass(), "colorSide", -984207078);
        setIntField(term343592, term343592.getClass(), "effectDamage", 1516611142);
        setIntField(term343592, term343592.getClass(), "effectPos", -1169041176);
        setIntField(term343592, term343592.getClass(), "judgeDisp", 743840);
        setIntField(term343592, term343592.getClass(), "judgePos", 1588663547);
        setIntField(term343592, term343592.getClass(), "judgeBreak", 967074800);
        setIntField(term343592, term343592.getClass(), "judgeHit", -90176774);
        setIntField(term343592, term343592.getClass(), "platinumBreakDisp", 1858229184);
        setIntField(term343592, term343592.getClass(), "judgeCriticalBreak", -41551082);
        setIntField(term343592, term343592.getClass(), "matching", -935137481);
        setIntField(term343592, term343592.getClass(), "dispPlayerLv", 821449151);
        setIntField(term343592, term343592.getClass(), "dispRating", 418670805);
        setIntField(term343592, term343592.getClass(), "dispBP", 2106370588);
        setIntField(term343592, term343592.getClass(), "headphone", -828741254);
        term343894 = new Integer(770682529);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term343894;
        callMethod(klass, "setDispPlayerLv", argTypes, term343592, args);
    }

};


