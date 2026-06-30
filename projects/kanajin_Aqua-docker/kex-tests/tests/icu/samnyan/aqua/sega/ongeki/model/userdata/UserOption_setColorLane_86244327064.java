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

public class UserOption_setColorLane_86244327064 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term338488;
     Object term338790;

    public UserOption_setColorLane_86244327064() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term338494 = new Long(3778691000276335279L);
        term338488 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption"));
        Object term338490 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term338492 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term338508 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term338509 = newInstance(Class.forName("java.time.LocalDate"));
        Object term338513 = newInstance(Class.forName("java.time.LocalTime"));
        Object term338518 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term338519 = newInstance(Class.forName("java.time.LocalDate"));
        Object term338523 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term338488, term338488.getClass(), "id", 6918940128599273923L);
        setLongField(term338490, term338490.getClass(), "id", 2942685029487463016L);
        setLongField(term338492, term338492.getClass(), "id", 7491836351425513441L);
        setField(term338492, term338492.getClass(), "extId", term338494);
        setField(term338492, term338492.getClass(), "luid", "gbiNWdiyup");
        setIntField(term338509, term338509.getClass(), "year", 2023);
        setShortField(term338509, term338509.getClass(), "month", (short) 1);
        setShortField(term338509, term338509.getClass(), "day", (short) 29);
        setField(term338508, term338508.getClass(), "date", term338509);
        setByteField(term338513, term338513.getClass(), "hour", (byte) 20);
        setByteField(term338513, term338513.getClass(), "minute", (byte) 44);
        setByteField(term338513, term338513.getClass(), "second", (byte) 51);
        setIntField(term338513, term338513.getClass(), "nano", 702242021);
        setField(term338508, term338508.getClass(), "time", term338513);
        setField(term338492, term338492.getClass(), "registerTime", term338508);
        setIntField(term338519, term338519.getClass(), "year", 2022);
        setShortField(term338519, term338519.getClass(), "month", (short) 10);
        setShortField(term338519, term338519.getClass(), "day", (short) 20);
        setField(term338518, term338518.getClass(), "date", term338519);
        setByteField(term338523, term338523.getClass(), "hour", (byte) 5);
        setByteField(term338523, term338523.getClass(), "minute", (byte) 59);
        setByteField(term338523, term338523.getClass(), "second", (byte) 46);
        setIntField(term338523, term338523.getClass(), "nano", 530355310);
        setField(term338518, term338518.getClass(), "time", term338523);
        setField(term338492, term338492.getClass(), "accessTime", term338518);
        setField(term338490, term338490.getClass(), "card", term338492);
        setField(term338490, term338490.getClass(), "userName", "XlXZxQQHbX");
        setIntField(term338490, term338490.getClass(), "level", -1851906932);
        setIntField(term338490, term338490.getClass(), "reincarnationNum", 148069559);
        setLongField(term338490, term338490.getClass(), "exp", 1735240088735197829L);
        setLongField(term338490, term338490.getClass(), "point", 3639534791128140633L);
        setLongField(term338490, term338490.getClass(), "totalPoint", -7691486421251177147L);
        setIntField(term338490, term338490.getClass(), "playCount", 939123049);
        setIntField(term338490, term338490.getClass(), "jewelCount", -2071936675);
        setIntField(term338490, term338490.getClass(), "totalJewelCount", -1628609313);
        setIntField(term338490, term338490.getClass(), "medalCount", 2123622494);
        setIntField(term338490, term338490.getClass(), "playerRating", -1131110979);
        setIntField(term338490, term338490.getClass(), "highestRating", 1683626627);
        setIntField(term338490, term338490.getClass(), "battlePoint", 511247995);
        setIntField(term338490, term338490.getClass(), "bestBattlePoint", -1175598404);
        setIntField(term338490, term338490.getClass(), "overDamageBattlePoint", 672430116);
        setBooleanField(term338490, term338490.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term338490, term338490.getClass(), "nameplateId", 1215606727);
        setIntField(term338490, term338490.getClass(), "trophyId", -483207469);
        setIntField(term338490, term338490.getClass(), "cardId", -278608242);
        setIntField(term338490, term338490.getClass(), "characterId", -476404573);
        setIntField(term338490, term338490.getClass(), "characterVoiceNo", -1013568492);
        setIntField(term338490, term338490.getClass(), "tabSetting", 1495979597);
        setIntField(term338490, term338490.getClass(), "tabSortSetting", 1839501032);
        setIntField(term338490, term338490.getClass(), "cardCategorySetting", -1795105601);
        setIntField(term338490, term338490.getClass(), "cardSortSetting", -1799271570);
        setIntField(term338490, term338490.getClass(), "rivalScoreCategorySetting", 1181665645);
        setIntField(term338490, term338490.getClass(), "playedTutorialBit", -1639453815);
        setIntField(term338490, term338490.getClass(), "firstTutorialCancelNum", -1279832258);
        setLongField(term338490, term338490.getClass(), "sumTechHighScore", 1439804109720411639L);
        setLongField(term338490, term338490.getClass(), "sumTechBasicHighScore", -3732749590800145130L);
        setLongField(term338490, term338490.getClass(), "sumTechAdvancedHighScore", 5381180182562079922L);
        setLongField(term338490, term338490.getClass(), "sumTechExpertHighScore", 3820682578562907147L);
        setLongField(term338490, term338490.getClass(), "sumTechMasterHighScore", -475496477301717455L);
        setLongField(term338490, term338490.getClass(), "sumTechLunaticHighScore", 6068859310140280833L);
        setLongField(term338490, term338490.getClass(), "sumBattleHighScore", 8244976586655755664L);
        setLongField(term338490, term338490.getClass(), "sumBattleBasicHighScore", 8134797707277976835L);
        setLongField(term338490, term338490.getClass(), "sumBattleAdvancedHighScore", 464670892869776739L);
        setLongField(term338490, term338490.getClass(), "sumBattleExpertHighScore", -3017913947790611985L);
        setLongField(term338490, term338490.getClass(), "sumBattleMasterHighScore", 8399142674197356282L);
        setLongField(term338490, term338490.getClass(), "sumBattleLunaticHighScore", -2056355925635978407L);
        setField(term338490, term338490.getClass(), "eventWatchedDate", "EwTPlqWVFW");
        setField(term338490, term338490.getClass(), "cmEventWatchedDate", "eKXiLPLpaC");
        setField(term338490, term338490.getClass(), "firstGameId", "GcpvJCMJnI");
        setField(term338490, term338490.getClass(), "firstRomVersion", "gVODfCYhbA");
        setField(term338490, term338490.getClass(), "firstDataVersion", "LuIfELVLso");
        setField(term338490, term338490.getClass(), "firstPlayDate", "zQtwGUIDBi");
        setField(term338490, term338490.getClass(), "lastGameId", "nrBQXUdJjd");
        setField(term338490, term338490.getClass(), "lastRomVersion", "pQVhCNHASt");
        setField(term338490, term338490.getClass(), "lastDataVersion", "uUlaXjjoZB");
        setField(term338490, term338490.getClass(), "compatibleCmVersion", "ozPHDOeXTB");
        setField(term338490, term338490.getClass(), "lastPlayDate", "wwRNyOvpdM");
        setIntField(term338490, term338490.getClass(), "lastPlaceId", 1875839335);
        setField(term338490, term338490.getClass(), "lastPlaceName", "VBEqDKMmrk");
        setIntField(term338490, term338490.getClass(), "lastRegionId", 1055864882);
        setField(term338490, term338490.getClass(), "lastRegionName", "MPlbHUxmdT");
        setIntField(term338490, term338490.getClass(), "lastAllNetId", 1140674166);
        setField(term338490, term338490.getClass(), "lastClientId", "cSLVXQnisy");
        setIntField(term338490, term338490.getClass(), "lastUsedDeckId", 422266932);
        setIntField(term338490, term338490.getClass(), "lastPlayMusicLevel", 264749783);
        setIntField(term338490, term338490.getClass(), "lastEmoneyBrand", -1297449024);
        setField(term338488, term338488.getClass(), "user", term338490);
        setIntField(term338488, term338488.getClass(), "optionSet", -1343836475);
        setIntField(term338488, term338488.getClass(), "speed", 1822545213);
        setIntField(term338488, term338488.getClass(), "mirror", -113230133);
        setIntField(term338488, term338488.getClass(), "judgeTiming", 507828798);
        setIntField(term338488, term338488.getClass(), "judgeAdjustment", 127646905);
        setIntField(term338488, term338488.getClass(), "abort", 1197599238);
        setIntField(term338488, term338488.getClass(), "stealthField", -557198659);
        setIntField(term338488, term338488.getClass(), "tapSound", 121536769);
        setIntField(term338488, term338488.getClass(), "volGuide", -65879281);
        setIntField(term338488, term338488.getClass(), "volAll", -507655918);
        setIntField(term338488, term338488.getClass(), "volTap", 1321473541);
        setIntField(term338488, term338488.getClass(), "volCrTap", 1818709225);
        setIntField(term338488, term338488.getClass(), "volHold", 556124567);
        setIntField(term338488, term338488.getClass(), "volSide", 742634683);
        setIntField(term338488, term338488.getClass(), "volFlick", -741222257);
        setIntField(term338488, term338488.getClass(), "volBell", 859928843);
        setIntField(term338488, term338488.getClass(), "volEnemy", -491860731);
        setIntField(term338488, term338488.getClass(), "volSkill", -698733451);
        setIntField(term338488, term338488.getClass(), "volDamage", -1759883058);
        setIntField(term338488, term338488.getClass(), "colorField", -1040487536);
        setIntField(term338488, term338488.getClass(), "colorLaneBright", 1754210312);
        setIntField(term338488, term338488.getClass(), "colorWallBright", -586401190);
        setIntField(term338488, term338488.getClass(), "colorLane", -1466256144);
        setIntField(term338488, term338488.getClass(), "colorSide", 1841473756);
        setIntField(term338488, term338488.getClass(), "effectDamage", 1940081052);
        setIntField(term338488, term338488.getClass(), "effectPos", -2045864734);
        setIntField(term338488, term338488.getClass(), "judgeDisp", -1789152429);
        setIntField(term338488, term338488.getClass(), "judgePos", 481318130);
        setIntField(term338488, term338488.getClass(), "judgeBreak", -874122084);
        setIntField(term338488, term338488.getClass(), "judgeHit", -598828815);
        setIntField(term338488, term338488.getClass(), "platinumBreakDisp", -660505033);
        setIntField(term338488, term338488.getClass(), "judgeCriticalBreak", -2085492970);
        setIntField(term338488, term338488.getClass(), "matching", -2129017702);
        setIntField(term338488, term338488.getClass(), "dispPlayerLv", -655859690);
        setIntField(term338488, term338488.getClass(), "dispRating", -479961421);
        setIntField(term338488, term338488.getClass(), "dispBP", -1177095245);
        setIntField(term338488, term338488.getClass(), "headphone", 1551574002);
        term338790 = new Integer(-579766511);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term338790;
        callMethod(klass, "setColorLane", argTypes, term338488, args);
    }

};


