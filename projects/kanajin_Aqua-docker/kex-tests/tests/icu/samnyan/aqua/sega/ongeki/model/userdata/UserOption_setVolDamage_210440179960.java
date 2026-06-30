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

public class UserOption_setVolDamage_210440179960 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term336632;
     Object term336934;

    public UserOption_setVolDamage_210440179960() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term336638 = new Long(-8901189796092679153L);
        term336632 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption"));
        Object term336634 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term336636 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term336652 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term336653 = newInstance(Class.forName("java.time.LocalDate"));
        Object term336657 = newInstance(Class.forName("java.time.LocalTime"));
        Object term336662 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term336663 = newInstance(Class.forName("java.time.LocalDate"));
        Object term336667 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term336632, term336632.getClass(), "id", 7561063775468311219L);
        setLongField(term336634, term336634.getClass(), "id", -3474804374971667943L);
        setLongField(term336636, term336636.getClass(), "id", 6047120386207969984L);
        setField(term336636, term336636.getClass(), "extId", term336638);
        setField(term336636, term336636.getClass(), "luid", "WyJHJQsUdL");
        setIntField(term336653, term336653.getClass(), "year", 2028);
        setShortField(term336653, term336653.getClass(), "month", (short) 2);
        setShortField(term336653, term336653.getClass(), "day", (short) 6);
        setField(term336652, term336652.getClass(), "date", term336653);
        setByteField(term336657, term336657.getClass(), "hour", (byte) 23);
        setByteField(term336657, term336657.getClass(), "minute", (byte) 10);
        setByteField(term336657, term336657.getClass(), "second", (byte) 20);
        setIntField(term336657, term336657.getClass(), "nano", 524964235);
        setField(term336652, term336652.getClass(), "time", term336657);
        setField(term336636, term336636.getClass(), "registerTime", term336652);
        setIntField(term336663, term336663.getClass(), "year", 2028);
        setShortField(term336663, term336663.getClass(), "month", (short) 6);
        setShortField(term336663, term336663.getClass(), "day", (short) 10);
        setField(term336662, term336662.getClass(), "date", term336663);
        setByteField(term336667, term336667.getClass(), "hour", (byte) 15);
        setByteField(term336667, term336667.getClass(), "minute", (byte) 10);
        setByteField(term336667, term336667.getClass(), "second", (byte) 25);
        setIntField(term336667, term336667.getClass(), "nano", 956921052);
        setField(term336662, term336662.getClass(), "time", term336667);
        setField(term336636, term336636.getClass(), "accessTime", term336662);
        setField(term336634, term336634.getClass(), "card", term336636);
        setField(term336634, term336634.getClass(), "userName", "ltCdJiulEQ");
        setIntField(term336634, term336634.getClass(), "level", -993791957);
        setIntField(term336634, term336634.getClass(), "reincarnationNum", -552751175);
        setLongField(term336634, term336634.getClass(), "exp", 6136617736902022104L);
        setLongField(term336634, term336634.getClass(), "point", 4151390429749914025L);
        setLongField(term336634, term336634.getClass(), "totalPoint", 5646933076786516455L);
        setIntField(term336634, term336634.getClass(), "playCount", 1109193734);
        setIntField(term336634, term336634.getClass(), "jewelCount", -1316804985);
        setIntField(term336634, term336634.getClass(), "totalJewelCount", 704056081);
        setIntField(term336634, term336634.getClass(), "medalCount", 1187309385);
        setIntField(term336634, term336634.getClass(), "playerRating", 1360267925);
        setIntField(term336634, term336634.getClass(), "highestRating", -233655523);
        setIntField(term336634, term336634.getClass(), "battlePoint", -970673768);
        setIntField(term336634, term336634.getClass(), "bestBattlePoint", -231957549);
        setIntField(term336634, term336634.getClass(), "overDamageBattlePoint", 1535019242);
        setBooleanField(term336634, term336634.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term336634, term336634.getClass(), "nameplateId", 426918157);
        setIntField(term336634, term336634.getClass(), "trophyId", 582043286);
        setIntField(term336634, term336634.getClass(), "cardId", 2107777966);
        setIntField(term336634, term336634.getClass(), "characterId", 1347083795);
        setIntField(term336634, term336634.getClass(), "characterVoiceNo", 167846104);
        setIntField(term336634, term336634.getClass(), "tabSetting", -857716498);
        setIntField(term336634, term336634.getClass(), "tabSortSetting", -1683621105);
        setIntField(term336634, term336634.getClass(), "cardCategorySetting", 618291149);
        setIntField(term336634, term336634.getClass(), "cardSortSetting", -570699973);
        setIntField(term336634, term336634.getClass(), "rivalScoreCategorySetting", -1263476242);
        setIntField(term336634, term336634.getClass(), "playedTutorialBit", -1662894949);
        setIntField(term336634, term336634.getClass(), "firstTutorialCancelNum", 277322130);
        setLongField(term336634, term336634.getClass(), "sumTechHighScore", 1238428687111924073L);
        setLongField(term336634, term336634.getClass(), "sumTechBasicHighScore", -7220543366170449927L);
        setLongField(term336634, term336634.getClass(), "sumTechAdvancedHighScore", 5763436503329291030L);
        setLongField(term336634, term336634.getClass(), "sumTechExpertHighScore", 4039610053625999065L);
        setLongField(term336634, term336634.getClass(), "sumTechMasterHighScore", -8048565508813083546L);
        setLongField(term336634, term336634.getClass(), "sumTechLunaticHighScore", 2364951267453118345L);
        setLongField(term336634, term336634.getClass(), "sumBattleHighScore", 7161949892872835443L);
        setLongField(term336634, term336634.getClass(), "sumBattleBasicHighScore", -4715403308790391634L);
        setLongField(term336634, term336634.getClass(), "sumBattleAdvancedHighScore", -8575551376001376574L);
        setLongField(term336634, term336634.getClass(), "sumBattleExpertHighScore", 1698185160469444139L);
        setLongField(term336634, term336634.getClass(), "sumBattleMasterHighScore", 8208960341100339073L);
        setLongField(term336634, term336634.getClass(), "sumBattleLunaticHighScore", 1908918271695282954L);
        setField(term336634, term336634.getClass(), "eventWatchedDate", "KqykKhYOZq");
        setField(term336634, term336634.getClass(), "cmEventWatchedDate", "CcaQtbMaOs");
        setField(term336634, term336634.getClass(), "firstGameId", "tlvqaHevvq");
        setField(term336634, term336634.getClass(), "firstRomVersion", "whPLnbdbhY");
        setField(term336634, term336634.getClass(), "firstDataVersion", "eUJtYpIucj");
        setField(term336634, term336634.getClass(), "firstPlayDate", "wPtngdophV");
        setField(term336634, term336634.getClass(), "lastGameId", "LIJSGRYSOn");
        setField(term336634, term336634.getClass(), "lastRomVersion", "byXUhrgxoa");
        setField(term336634, term336634.getClass(), "lastDataVersion", "EDItIGhUQA");
        setField(term336634, term336634.getClass(), "compatibleCmVersion", "yqQLbHBpvP");
        setField(term336634, term336634.getClass(), "lastPlayDate", "YhnmHHwAWE");
        setIntField(term336634, term336634.getClass(), "lastPlaceId", 978924008);
        setField(term336634, term336634.getClass(), "lastPlaceName", "kFSfQFeIxm");
        setIntField(term336634, term336634.getClass(), "lastRegionId", 1200256505);
        setField(term336634, term336634.getClass(), "lastRegionName", "aIBCpwRVKi");
        setIntField(term336634, term336634.getClass(), "lastAllNetId", 1690799933);
        setField(term336634, term336634.getClass(), "lastClientId", "WUrlcTbILm");
        setIntField(term336634, term336634.getClass(), "lastUsedDeckId", -929822762);
        setIntField(term336634, term336634.getClass(), "lastPlayMusicLevel", 66218873);
        setIntField(term336634, term336634.getClass(), "lastEmoneyBrand", 1468996453);
        setField(term336632, term336632.getClass(), "user", term336634);
        setIntField(term336632, term336632.getClass(), "optionSet", 1353358649);
        setIntField(term336632, term336632.getClass(), "speed", 2132788108);
        setIntField(term336632, term336632.getClass(), "mirror", 146766497);
        setIntField(term336632, term336632.getClass(), "judgeTiming", 2103712678);
        setIntField(term336632, term336632.getClass(), "judgeAdjustment", 1129932929);
        setIntField(term336632, term336632.getClass(), "abort", -1863196178);
        setIntField(term336632, term336632.getClass(), "stealthField", 1155668132);
        setIntField(term336632, term336632.getClass(), "tapSound", -325131605);
        setIntField(term336632, term336632.getClass(), "volGuide", 1589710919);
        setIntField(term336632, term336632.getClass(), "volAll", -50295682);
        setIntField(term336632, term336632.getClass(), "volTap", -1462007032);
        setIntField(term336632, term336632.getClass(), "volCrTap", -1660485496);
        setIntField(term336632, term336632.getClass(), "volHold", -1649288237);
        setIntField(term336632, term336632.getClass(), "volSide", -770435769);
        setIntField(term336632, term336632.getClass(), "volFlick", -220111732);
        setIntField(term336632, term336632.getClass(), "volBell", 180625748);
        setIntField(term336632, term336632.getClass(), "volEnemy", 844668565);
        setIntField(term336632, term336632.getClass(), "volSkill", 315657064);
        setIntField(term336632, term336632.getClass(), "volDamage", -1005571751);
        setIntField(term336632, term336632.getClass(), "colorField", -1617354924);
        setIntField(term336632, term336632.getClass(), "colorLaneBright", 1474414973);
        setIntField(term336632, term336632.getClass(), "colorWallBright", 1260753874);
        setIntField(term336632, term336632.getClass(), "colorLane", -1971639689);
        setIntField(term336632, term336632.getClass(), "colorSide", 1975227224);
        setIntField(term336632, term336632.getClass(), "effectDamage", -936657526);
        setIntField(term336632, term336632.getClass(), "effectPos", 1541179984);
        setIntField(term336632, term336632.getClass(), "judgeDisp", -972452734);
        setIntField(term336632, term336632.getClass(), "judgePos", -1813411995);
        setIntField(term336632, term336632.getClass(), "judgeBreak", -1229769823);
        setIntField(term336632, term336632.getClass(), "judgeHit", 1173958343);
        setIntField(term336632, term336632.getClass(), "platinumBreakDisp", 788241820);
        setIntField(term336632, term336632.getClass(), "judgeCriticalBreak", -397070445);
        setIntField(term336632, term336632.getClass(), "matching", -1724002913);
        setIntField(term336632, term336632.getClass(), "dispPlayerLv", -266247489);
        setIntField(term336632, term336632.getClass(), "dispRating", 621473445);
        setIntField(term336632, term336632.getClass(), "dispBP", 790154552);
        setIntField(term336632, term336632.getClass(), "headphone", 41166001);
        term336934 = new Integer(-1333478623);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term336934;
        callMethod(klass, "setVolDamage", argTypes, term336632, args);
    }

};


