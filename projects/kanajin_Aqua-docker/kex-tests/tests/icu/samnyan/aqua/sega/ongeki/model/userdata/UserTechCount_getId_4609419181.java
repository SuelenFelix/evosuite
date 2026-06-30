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

public class UserTechCount_getId_4609419181 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term362113;

    public UserTechCount_getId_4609419181() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term362119 = new Long(5305896099727663023L);
        term362113 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTechCount"));
        Object term362115 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term362117 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term362133 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term362134 = newInstance(Class.forName("java.time.LocalDate"));
        Object term362138 = newInstance(Class.forName("java.time.LocalTime"));
        Object term362143 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term362144 = newInstance(Class.forName("java.time.LocalDate"));
        Object term362148 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term362113, term362113.getClass(), "id", 6044387633515108565L);
        setLongField(term362115, term362115.getClass(), "id", -2161817912299986072L);
        setLongField(term362117, term362117.getClass(), "id", -94768011413318529L);
        setField(term362117, term362117.getClass(), "extId", term362119);
        setField(term362117, term362117.getClass(), "luid", "BaJbwjuEOT");
        setIntField(term362134, term362134.getClass(), "year", 2021);
        setShortField(term362134, term362134.getClass(), "month", (short) 11);
        setShortField(term362134, term362134.getClass(), "day", (short) 16);
        setField(term362133, term362133.getClass(), "date", term362134);
        setByteField(term362138, term362138.getClass(), "hour", (byte) 14);
        setByteField(term362138, term362138.getClass(), "minute", (byte) 7);
        setByteField(term362138, term362138.getClass(), "second", (byte) 50);
        setIntField(term362138, term362138.getClass(), "nano", 829348078);
        setField(term362133, term362133.getClass(), "time", term362138);
        setField(term362117, term362117.getClass(), "registerTime", term362133);
        setIntField(term362144, term362144.getClass(), "year", 2014);
        setShortField(term362144, term362144.getClass(), "month", (short) 9);
        setShortField(term362144, term362144.getClass(), "day", (short) 18);
        setField(term362143, term362143.getClass(), "date", term362144);
        setByteField(term362148, term362148.getClass(), "hour", (byte) 8);
        setByteField(term362148, term362148.getClass(), "minute", (byte) 56);
        setByteField(term362148, term362148.getClass(), "second", (byte) 12);
        setIntField(term362148, term362148.getClass(), "nano", 319239876);
        setField(term362143, term362143.getClass(), "time", term362148);
        setField(term362117, term362117.getClass(), "accessTime", term362143);
        setField(term362115, term362115.getClass(), "card", term362117);
        setField(term362115, term362115.getClass(), "userName", "LsMEmvmhNV");
        setIntField(term362115, term362115.getClass(), "level", -1123288800);
        setIntField(term362115, term362115.getClass(), "reincarnationNum", 1996722369);
        setLongField(term362115, term362115.getClass(), "exp", 6068652132423230597L);
        setLongField(term362115, term362115.getClass(), "point", -1873969975666396728L);
        setLongField(term362115, term362115.getClass(), "totalPoint", -6867448262058311228L);
        setIntField(term362115, term362115.getClass(), "playCount", 238135706);
        setIntField(term362115, term362115.getClass(), "jewelCount", 1123033608);
        setIntField(term362115, term362115.getClass(), "totalJewelCount", 232473537);
        setIntField(term362115, term362115.getClass(), "medalCount", 2093221237);
        setIntField(term362115, term362115.getClass(), "playerRating", 2070792175);
        setIntField(term362115, term362115.getClass(), "highestRating", -2087958689);
        setIntField(term362115, term362115.getClass(), "battlePoint", 1691189816);
        setIntField(term362115, term362115.getClass(), "bestBattlePoint", 914377209);
        setIntField(term362115, term362115.getClass(), "overDamageBattlePoint", -1360416915);
        setBooleanField(term362115, term362115.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term362115, term362115.getClass(), "nameplateId", -1464281525);
        setIntField(term362115, term362115.getClass(), "trophyId", 423696021);
        setIntField(term362115, term362115.getClass(), "cardId", -1513384869);
        setIntField(term362115, term362115.getClass(), "characterId", -34616403);
        setIntField(term362115, term362115.getClass(), "characterVoiceNo", -1719856199);
        setIntField(term362115, term362115.getClass(), "tabSetting", -1082420812);
        setIntField(term362115, term362115.getClass(), "tabSortSetting", 1438111194);
        setIntField(term362115, term362115.getClass(), "cardCategorySetting", -857172656);
        setIntField(term362115, term362115.getClass(), "cardSortSetting", -1270682147);
        setIntField(term362115, term362115.getClass(), "rivalScoreCategorySetting", 416304780);
        setIntField(term362115, term362115.getClass(), "playedTutorialBit", 1413698987);
        setIntField(term362115, term362115.getClass(), "firstTutorialCancelNum", -524185733);
        setLongField(term362115, term362115.getClass(), "sumTechHighScore", -4530162347585373602L);
        setLongField(term362115, term362115.getClass(), "sumTechBasicHighScore", 6890598508652035344L);
        setLongField(term362115, term362115.getClass(), "sumTechAdvancedHighScore", -3985887695788032377L);
        setLongField(term362115, term362115.getClass(), "sumTechExpertHighScore", 9176128548956110666L);
        setLongField(term362115, term362115.getClass(), "sumTechMasterHighScore", 9121420402895093349L);
        setLongField(term362115, term362115.getClass(), "sumTechLunaticHighScore", -6396531745828639447L);
        setLongField(term362115, term362115.getClass(), "sumBattleHighScore", -4733802784871767172L);
        setLongField(term362115, term362115.getClass(), "sumBattleBasicHighScore", -4063770900217354661L);
        setLongField(term362115, term362115.getClass(), "sumBattleAdvancedHighScore", 2920595754088222321L);
        setLongField(term362115, term362115.getClass(), "sumBattleExpertHighScore", -1358828919313853712L);
        setLongField(term362115, term362115.getClass(), "sumBattleMasterHighScore", 5021197186554051860L);
        setLongField(term362115, term362115.getClass(), "sumBattleLunaticHighScore", 245193511737598712L);
        setField(term362115, term362115.getClass(), "eventWatchedDate", "FlgdIZjHDE");
        setField(term362115, term362115.getClass(), "cmEventWatchedDate", "tkVrhqJOcP");
        setField(term362115, term362115.getClass(), "firstGameId", "TYUrIStGwb");
        setField(term362115, term362115.getClass(), "firstRomVersion", "JYQJJDdMaH");
        setField(term362115, term362115.getClass(), "firstDataVersion", "NYiWdyCjDY");
        setField(term362115, term362115.getClass(), "firstPlayDate", "NxxpXdrIPo");
        setField(term362115, term362115.getClass(), "lastGameId", "LoXDruySRx");
        setField(term362115, term362115.getClass(), "lastRomVersion", "NArqvBoreJ");
        setField(term362115, term362115.getClass(), "lastDataVersion", "wNQBwmSlCW");
        setField(term362115, term362115.getClass(), "compatibleCmVersion", "htETaiDMgw");
        setField(term362115, term362115.getClass(), "lastPlayDate", "UjqNGJSBEX");
        setIntField(term362115, term362115.getClass(), "lastPlaceId", 1045896859);
        setField(term362115, term362115.getClass(), "lastPlaceName", "qWPcKUbGGx");
        setIntField(term362115, term362115.getClass(), "lastRegionId", 407170760);
        setField(term362115, term362115.getClass(), "lastRegionName", "nUKWXpkdOn");
        setIntField(term362115, term362115.getClass(), "lastAllNetId", 616477690);
        setField(term362115, term362115.getClass(), "lastClientId", "bjxyKMjXrD");
        setIntField(term362115, term362115.getClass(), "lastUsedDeckId", 2059544706);
        setIntField(term362115, term362115.getClass(), "lastPlayMusicLevel", -1117876184);
        setIntField(term362115, term362115.getClass(), "lastEmoneyBrand", 1898482839);
        setField(term362113, term362113.getClass(), "user", term362115);
        setIntField(term362113, term362113.getClass(), "levelId", 341940526);
        setIntField(term362113, term362113.getClass(), "allBreakCount", 2080469474);
        setIntField(term362113, term362113.getClass(), "allBreakPlusCount", 11200497);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTechCount");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term362113, args);
    }

};


