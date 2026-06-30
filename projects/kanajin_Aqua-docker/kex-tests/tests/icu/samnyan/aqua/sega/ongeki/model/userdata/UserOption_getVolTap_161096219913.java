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

public class UserOption_getVolTap_161096219913 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term314457;

    public UserOption_getVolTap_161096219913() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term314463 = new Long(-7181112149072926893L);
        term314457 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption"));
        Object term314459 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term314461 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term314477 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term314478 = newInstance(Class.forName("java.time.LocalDate"));
        Object term314482 = newInstance(Class.forName("java.time.LocalTime"));
        Object term314487 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term314488 = newInstance(Class.forName("java.time.LocalDate"));
        Object term314492 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term314457, term314457.getClass(), "id", 6320625869270906125L);
        setLongField(term314459, term314459.getClass(), "id", 1636172794498843100L);
        setLongField(term314461, term314461.getClass(), "id", 1034321271323921411L);
        setField(term314461, term314461.getClass(), "extId", term314463);
        setField(term314461, term314461.getClass(), "luid", "uzOLHHrsVY");
        setIntField(term314478, term314478.getClass(), "year", 2020);
        setShortField(term314478, term314478.getClass(), "month", (short) 3);
        setShortField(term314478, term314478.getClass(), "day", (short) 21);
        setField(term314477, term314477.getClass(), "date", term314478);
        setByteField(term314482, term314482.getClass(), "hour", (byte) 4);
        setByteField(term314482, term314482.getClass(), "minute", (byte) 37);
        setByteField(term314482, term314482.getClass(), "second", (byte) 54);
        setIntField(term314482, term314482.getClass(), "nano", 623488559);
        setField(term314477, term314477.getClass(), "time", term314482);
        setField(term314461, term314461.getClass(), "registerTime", term314477);
        setIntField(term314488, term314488.getClass(), "year", 2017);
        setShortField(term314488, term314488.getClass(), "month", (short) 12);
        setShortField(term314488, term314488.getClass(), "day", (short) 11);
        setField(term314487, term314487.getClass(), "date", term314488);
        setByteField(term314492, term314492.getClass(), "hour", (byte) 4);
        setByteField(term314492, term314492.getClass(), "minute", (byte) 59);
        setByteField(term314492, term314492.getClass(), "second", (byte) 55);
        setIntField(term314492, term314492.getClass(), "nano", 672136833);
        setField(term314487, term314487.getClass(), "time", term314492);
        setField(term314461, term314461.getClass(), "accessTime", term314487);
        setField(term314459, term314459.getClass(), "card", term314461);
        setField(term314459, term314459.getClass(), "userName", "AaWWwZcnLu");
        setIntField(term314459, term314459.getClass(), "level", 343354824);
        setIntField(term314459, term314459.getClass(), "reincarnationNum", -1302609156);
        setLongField(term314459, term314459.getClass(), "exp", 7489815551710446305L);
        setLongField(term314459, term314459.getClass(), "point", -374349236710521948L);
        setLongField(term314459, term314459.getClass(), "totalPoint", -5238523878513723722L);
        setIntField(term314459, term314459.getClass(), "playCount", 849663264);
        setIntField(term314459, term314459.getClass(), "jewelCount", -931410094);
        setIntField(term314459, term314459.getClass(), "totalJewelCount", 2114265683);
        setIntField(term314459, term314459.getClass(), "medalCount", -1906917286);
        setIntField(term314459, term314459.getClass(), "playerRating", 1439786981);
        setIntField(term314459, term314459.getClass(), "highestRating", -843879147);
        setIntField(term314459, term314459.getClass(), "battlePoint", 1225770592);
        setIntField(term314459, term314459.getClass(), "bestBattlePoint", -1690526931);
        setIntField(term314459, term314459.getClass(), "overDamageBattlePoint", -1110000609);
        setBooleanField(term314459, term314459.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term314459, term314459.getClass(), "nameplateId", 1558827160);
        setIntField(term314459, term314459.getClass(), "trophyId", -1274228635);
        setIntField(term314459, term314459.getClass(), "cardId", -316004735);
        setIntField(term314459, term314459.getClass(), "characterId", -1426012590);
        setIntField(term314459, term314459.getClass(), "characterVoiceNo", 67994429);
        setIntField(term314459, term314459.getClass(), "tabSetting", -1644156026);
        setIntField(term314459, term314459.getClass(), "tabSortSetting", -2094196862);
        setIntField(term314459, term314459.getClass(), "cardCategorySetting", -1061818526);
        setIntField(term314459, term314459.getClass(), "cardSortSetting", 654768975);
        setIntField(term314459, term314459.getClass(), "rivalScoreCategorySetting", -1714730163);
        setIntField(term314459, term314459.getClass(), "playedTutorialBit", 120480028);
        setIntField(term314459, term314459.getClass(), "firstTutorialCancelNum", -37392023);
        setLongField(term314459, term314459.getClass(), "sumTechHighScore", -6182282744663747682L);
        setLongField(term314459, term314459.getClass(), "sumTechBasicHighScore", 4676890742228221924L);
        setLongField(term314459, term314459.getClass(), "sumTechAdvancedHighScore", -3877844964746055171L);
        setLongField(term314459, term314459.getClass(), "sumTechExpertHighScore", -1065037303035039927L);
        setLongField(term314459, term314459.getClass(), "sumTechMasterHighScore", 8033870363487384746L);
        setLongField(term314459, term314459.getClass(), "sumTechLunaticHighScore", 8441916493630565180L);
        setLongField(term314459, term314459.getClass(), "sumBattleHighScore", 3944115787569612596L);
        setLongField(term314459, term314459.getClass(), "sumBattleBasicHighScore", 1571434730800981236L);
        setLongField(term314459, term314459.getClass(), "sumBattleAdvancedHighScore", 912810367612008658L);
        setLongField(term314459, term314459.getClass(), "sumBattleExpertHighScore", 2356229171548635178L);
        setLongField(term314459, term314459.getClass(), "sumBattleMasterHighScore", -4413880757033638232L);
        setLongField(term314459, term314459.getClass(), "sumBattleLunaticHighScore", -4335927853937962757L);
        setField(term314459, term314459.getClass(), "eventWatchedDate", "ZVIGMbBKbL");
        setField(term314459, term314459.getClass(), "cmEventWatchedDate", "gVMFMkMhbp");
        setField(term314459, term314459.getClass(), "firstGameId", "UHsHREPriw");
        setField(term314459, term314459.getClass(), "firstRomVersion", "DIwfYhyVhT");
        setField(term314459, term314459.getClass(), "firstDataVersion", "jtunRPVOvC");
        setField(term314459, term314459.getClass(), "firstPlayDate", "MkzyPfWvZB");
        setField(term314459, term314459.getClass(), "lastGameId", "BTiJXpfldl");
        setField(term314459, term314459.getClass(), "lastRomVersion", "WayKgiTEQo");
        setField(term314459, term314459.getClass(), "lastDataVersion", "SQWqwRyawD");
        setField(term314459, term314459.getClass(), "compatibleCmVersion", "oqZiibHuxe");
        setField(term314459, term314459.getClass(), "lastPlayDate", "OQkrchliwX");
        setIntField(term314459, term314459.getClass(), "lastPlaceId", -1947428282);
        setField(term314459, term314459.getClass(), "lastPlaceName", "WTGgxPgcFt");
        setIntField(term314459, term314459.getClass(), "lastRegionId", -1250851175);
        setField(term314459, term314459.getClass(), "lastRegionName", "AHhfsLjJbn");
        setIntField(term314459, term314459.getClass(), "lastAllNetId", -2135677471);
        setField(term314459, term314459.getClass(), "lastClientId", "CcDBslvvvR");
        setIntField(term314459, term314459.getClass(), "lastUsedDeckId", -830591542);
        setIntField(term314459, term314459.getClass(), "lastPlayMusicLevel", 1166134090);
        setIntField(term314459, term314459.getClass(), "lastEmoneyBrand", 559066583);
        setField(term314457, term314457.getClass(), "user", term314459);
        setIntField(term314457, term314457.getClass(), "optionSet", -1145674704);
        setIntField(term314457, term314457.getClass(), "speed", -787197818);
        setIntField(term314457, term314457.getClass(), "mirror", 212534773);
        setIntField(term314457, term314457.getClass(), "judgeTiming", 96227440);
        setIntField(term314457, term314457.getClass(), "judgeAdjustment", 1523564690);
        setIntField(term314457, term314457.getClass(), "abort", -1234348850);
        setIntField(term314457, term314457.getClass(), "stealthField", -740771491);
        setIntField(term314457, term314457.getClass(), "tapSound", 1984259458);
        setIntField(term314457, term314457.getClass(), "volGuide", 1824920167);
        setIntField(term314457, term314457.getClass(), "volAll", 2060402392);
        setIntField(term314457, term314457.getClass(), "volTap", 2131190609);
        setIntField(term314457, term314457.getClass(), "volCrTap", 1232030673);
        setIntField(term314457, term314457.getClass(), "volHold", 1862047425);
        setIntField(term314457, term314457.getClass(), "volSide", -1402396938);
        setIntField(term314457, term314457.getClass(), "volFlick", -1072474143);
        setIntField(term314457, term314457.getClass(), "volBell", -1824369409);
        setIntField(term314457, term314457.getClass(), "volEnemy", -1826886257);
        setIntField(term314457, term314457.getClass(), "volSkill", -1770507805);
        setIntField(term314457, term314457.getClass(), "volDamage", 1979907363);
        setIntField(term314457, term314457.getClass(), "colorField", -95727621);
        setIntField(term314457, term314457.getClass(), "colorLaneBright", -195410691);
        setIntField(term314457, term314457.getClass(), "colorWallBright", -2144456096);
        setIntField(term314457, term314457.getClass(), "colorLane", -288194764);
        setIntField(term314457, term314457.getClass(), "colorSide", 717407927);
        setIntField(term314457, term314457.getClass(), "effectDamage", -628074725);
        setIntField(term314457, term314457.getClass(), "effectPos", 598913023);
        setIntField(term314457, term314457.getClass(), "judgeDisp", -1434959747);
        setIntField(term314457, term314457.getClass(), "judgePos", 1392370461);
        setIntField(term314457, term314457.getClass(), "judgeBreak", -856810052);
        setIntField(term314457, term314457.getClass(), "judgeHit", -1931313347);
        setIntField(term314457, term314457.getClass(), "platinumBreakDisp", -611743177);
        setIntField(term314457, term314457.getClass(), "judgeCriticalBreak", 299118403);
        setIntField(term314457, term314457.getClass(), "matching", -974364512);
        setIntField(term314457, term314457.getClass(), "dispPlayerLv", 2114819798);
        setIntField(term314457, term314457.getClass(), "dispRating", -1034206928);
        setIntField(term314457, term314457.getClass(), "dispBP", 1118086364);
        setIntField(term314457, term314457.getClass(), "headphone", 1950777813);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVolTap", argTypes, term314457, args);
    }

};


