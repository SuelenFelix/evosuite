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

public class UserOption_getSpeed_15351475084 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term310299;

    public UserOption_getSpeed_15351475084() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term310305 = new Long(-3188913050877092148L);
        term310299 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption"));
        Object term310301 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term310303 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term310319 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term310320 = newInstance(Class.forName("java.time.LocalDate"));
        Object term310324 = newInstance(Class.forName("java.time.LocalTime"));
        Object term310329 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term310330 = newInstance(Class.forName("java.time.LocalDate"));
        Object term310334 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term310299, term310299.getClass(), "id", 8344071345310701532L);
        setLongField(term310301, term310301.getClass(), "id", -8469959435736220906L);
        setLongField(term310303, term310303.getClass(), "id", -7343108419817502158L);
        setField(term310303, term310303.getClass(), "extId", term310305);
        setField(term310303, term310303.getClass(), "luid", "hlYhjhXVeY");
        setIntField(term310320, term310320.getClass(), "year", 2022);
        setShortField(term310320, term310320.getClass(), "month", (short) 12);
        setShortField(term310320, term310320.getClass(), "day", (short) 28);
        setField(term310319, term310319.getClass(), "date", term310320);
        setByteField(term310324, term310324.getClass(), "hour", (byte) 3);
        setByteField(term310324, term310324.getClass(), "minute", (byte) 53);
        setByteField(term310324, term310324.getClass(), "second", (byte) 54);
        setIntField(term310324, term310324.getClass(), "nano", 342790000);
        setField(term310319, term310319.getClass(), "time", term310324);
        setField(term310303, term310303.getClass(), "registerTime", term310319);
        setIntField(term310330, term310330.getClass(), "year", 2018);
        setShortField(term310330, term310330.getClass(), "month", (short) 4);
        setShortField(term310330, term310330.getClass(), "day", (short) 14);
        setField(term310329, term310329.getClass(), "date", term310330);
        setByteField(term310334, term310334.getClass(), "hour", (byte) 10);
        setByteField(term310334, term310334.getClass(), "minute", (byte) 6);
        setByteField(term310334, term310334.getClass(), "second", (byte) 20);
        setIntField(term310334, term310334.getClass(), "nano", 981356633);
        setField(term310329, term310329.getClass(), "time", term310334);
        setField(term310303, term310303.getClass(), "accessTime", term310329);
        setField(term310301, term310301.getClass(), "card", term310303);
        setField(term310301, term310301.getClass(), "userName", "njAcVNaDsK");
        setIntField(term310301, term310301.getClass(), "level", -384585397);
        setIntField(term310301, term310301.getClass(), "reincarnationNum", 2068024615);
        setLongField(term310301, term310301.getClass(), "exp", -6800838614561725065L);
        setLongField(term310301, term310301.getClass(), "point", 4525136614777714683L);
        setLongField(term310301, term310301.getClass(), "totalPoint", -756674411465210850L);
        setIntField(term310301, term310301.getClass(), "playCount", -627479697);
        setIntField(term310301, term310301.getClass(), "jewelCount", 793382744);
        setIntField(term310301, term310301.getClass(), "totalJewelCount", -1440001626);
        setIntField(term310301, term310301.getClass(), "medalCount", -219999240);
        setIntField(term310301, term310301.getClass(), "playerRating", -329831857);
        setIntField(term310301, term310301.getClass(), "highestRating", 934973434);
        setIntField(term310301, term310301.getClass(), "battlePoint", -1659253989);
        setIntField(term310301, term310301.getClass(), "bestBattlePoint", 884105058);
        setIntField(term310301, term310301.getClass(), "overDamageBattlePoint", 128840284);
        setBooleanField(term310301, term310301.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term310301, term310301.getClass(), "nameplateId", -506443490);
        setIntField(term310301, term310301.getClass(), "trophyId", -1016296928);
        setIntField(term310301, term310301.getClass(), "cardId", -526369482);
        setIntField(term310301, term310301.getClass(), "characterId", -741125531);
        setIntField(term310301, term310301.getClass(), "characterVoiceNo", 434722011);
        setIntField(term310301, term310301.getClass(), "tabSetting", 523412711);
        setIntField(term310301, term310301.getClass(), "tabSortSetting", 608684123);
        setIntField(term310301, term310301.getClass(), "cardCategorySetting", -171647915);
        setIntField(term310301, term310301.getClass(), "cardSortSetting", -945146603);
        setIntField(term310301, term310301.getClass(), "rivalScoreCategorySetting", -1101286926);
        setIntField(term310301, term310301.getClass(), "playedTutorialBit", -276120113);
        setIntField(term310301, term310301.getClass(), "firstTutorialCancelNum", -166727700);
        setLongField(term310301, term310301.getClass(), "sumTechHighScore", 1585279153749978328L);
        setLongField(term310301, term310301.getClass(), "sumTechBasicHighScore", -4976564770157498868L);
        setLongField(term310301, term310301.getClass(), "sumTechAdvancedHighScore", 2707466989733406275L);
        setLongField(term310301, term310301.getClass(), "sumTechExpertHighScore", 6566422066736389750L);
        setLongField(term310301, term310301.getClass(), "sumTechMasterHighScore", -544726895446150957L);
        setLongField(term310301, term310301.getClass(), "sumTechLunaticHighScore", 832978810774625701L);
        setLongField(term310301, term310301.getClass(), "sumBattleHighScore", 1835232208093238718L);
        setLongField(term310301, term310301.getClass(), "sumBattleBasicHighScore", -5454581820231052259L);
        setLongField(term310301, term310301.getClass(), "sumBattleAdvancedHighScore", 8189571713399512224L);
        setLongField(term310301, term310301.getClass(), "sumBattleExpertHighScore", -4100138434332529663L);
        setLongField(term310301, term310301.getClass(), "sumBattleMasterHighScore", 3275021386232751482L);
        setLongField(term310301, term310301.getClass(), "sumBattleLunaticHighScore", -7423280248196668235L);
        setField(term310301, term310301.getClass(), "eventWatchedDate", "BLAiTuvVcu");
        setField(term310301, term310301.getClass(), "cmEventWatchedDate", "ULOrmjXoPg");
        setField(term310301, term310301.getClass(), "firstGameId", "blGAwKqdqO");
        setField(term310301, term310301.getClass(), "firstRomVersion", "BmJPqfZtnd");
        setField(term310301, term310301.getClass(), "firstDataVersion", "LCmMOQqvkv");
        setField(term310301, term310301.getClass(), "firstPlayDate", "fyjDMAuZiJ");
        setField(term310301, term310301.getClass(), "lastGameId", "OGWjAZOglO");
        setField(term310301, term310301.getClass(), "lastRomVersion", "wWxdwPvBFu");
        setField(term310301, term310301.getClass(), "lastDataVersion", "utAzCMewid");
        setField(term310301, term310301.getClass(), "compatibleCmVersion", "IELAUsJQhq");
        setField(term310301, term310301.getClass(), "lastPlayDate", "ddvFjqCIzo");
        setIntField(term310301, term310301.getClass(), "lastPlaceId", 438098469);
        setField(term310301, term310301.getClass(), "lastPlaceName", "vLEvTfUqXL");
        setIntField(term310301, term310301.getClass(), "lastRegionId", 1528099819);
        setField(term310301, term310301.getClass(), "lastRegionName", "vpXbryqFFp");
        setIntField(term310301, term310301.getClass(), "lastAllNetId", 822975980);
        setField(term310301, term310301.getClass(), "lastClientId", "bITrIdZmIi");
        setIntField(term310301, term310301.getClass(), "lastUsedDeckId", 708770993);
        setIntField(term310301, term310301.getClass(), "lastPlayMusicLevel", 2036789177);
        setIntField(term310301, term310301.getClass(), "lastEmoneyBrand", -1448284491);
        setField(term310299, term310299.getClass(), "user", term310301);
        setIntField(term310299, term310299.getClass(), "optionSet", 1048452588);
        setIntField(term310299, term310299.getClass(), "speed", -2105250010);
        setIntField(term310299, term310299.getClass(), "mirror", 1839043575);
        setIntField(term310299, term310299.getClass(), "judgeTiming", -462243394);
        setIntField(term310299, term310299.getClass(), "judgeAdjustment", -1005539921);
        setIntField(term310299, term310299.getClass(), "abort", -1861567171);
        setIntField(term310299, term310299.getClass(), "stealthField", -1174741784);
        setIntField(term310299, term310299.getClass(), "tapSound", 663200662);
        setIntField(term310299, term310299.getClass(), "volGuide", 1512707515);
        setIntField(term310299, term310299.getClass(), "volAll", -892058101);
        setIntField(term310299, term310299.getClass(), "volTap", 1897648147);
        setIntField(term310299, term310299.getClass(), "volCrTap", 1055849157);
        setIntField(term310299, term310299.getClass(), "volHold", 1811313027);
        setIntField(term310299, term310299.getClass(), "volSide", 160233658);
        setIntField(term310299, term310299.getClass(), "volFlick", 406040680);
        setIntField(term310299, term310299.getClass(), "volBell", 1100025816);
        setIntField(term310299, term310299.getClass(), "volEnemy", 771688939);
        setIntField(term310299, term310299.getClass(), "volSkill", 358282948);
        setIntField(term310299, term310299.getClass(), "volDamage", 1720436320);
        setIntField(term310299, term310299.getClass(), "colorField", -1583102787);
        setIntField(term310299, term310299.getClass(), "colorLaneBright", -2065378293);
        setIntField(term310299, term310299.getClass(), "colorWallBright", 1155179870);
        setIntField(term310299, term310299.getClass(), "colorLane", -1972042143);
        setIntField(term310299, term310299.getClass(), "colorSide", -1086571184);
        setIntField(term310299, term310299.getClass(), "effectDamage", 1920833587);
        setIntField(term310299, term310299.getClass(), "effectPos", -1824136655);
        setIntField(term310299, term310299.getClass(), "judgeDisp", 2135112038);
        setIntField(term310299, term310299.getClass(), "judgePos", -638417611);
        setIntField(term310299, term310299.getClass(), "judgeBreak", -1225915090);
        setIntField(term310299, term310299.getClass(), "judgeHit", 1619873615);
        setIntField(term310299, term310299.getClass(), "platinumBreakDisp", 792693727);
        setIntField(term310299, term310299.getClass(), "judgeCriticalBreak", -474399001);
        setIntField(term310299, term310299.getClass(), "matching", 473641931);
        setIntField(term310299, term310299.getClass(), "dispPlayerLv", 270920292);
        setIntField(term310299, term310299.getClass(), "dispRating", 1123722965);
        setIntField(term310299, term310299.getClass(), "dispBP", -291983343);
        setIntField(term310299, term310299.getClass(), "headphone", 1903320728);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSpeed", argTypes, term310299, args);
    }

};


