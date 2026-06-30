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

public class UserOption_setHeadphone_211158761178 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term344984;
     Object term345286;

    public UserOption_setHeadphone_211158761178() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term344990 = new Long(-7839957570751440706L);
        term344984 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption"));
        Object term344986 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term344988 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term345004 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term345005 = newInstance(Class.forName("java.time.LocalDate"));
        Object term345009 = newInstance(Class.forName("java.time.LocalTime"));
        Object term345014 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term345015 = newInstance(Class.forName("java.time.LocalDate"));
        Object term345019 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term344984, term344984.getClass(), "id", -3932137043117334833L);
        setLongField(term344986, term344986.getClass(), "id", 6280515909369269012L);
        setLongField(term344988, term344988.getClass(), "id", 6577877062869651026L);
        setField(term344988, term344988.getClass(), "extId", term344990);
        setField(term344988, term344988.getClass(), "luid", "WbuAGzHCCA");
        setIntField(term345005, term345005.getClass(), "year", 2021);
        setShortField(term345005, term345005.getClass(), "month", (short) 8);
        setShortField(term345005, term345005.getClass(), "day", (short) 8);
        setField(term345004, term345004.getClass(), "date", term345005);
        setByteField(term345009, term345009.getClass(), "hour", (byte) 2);
        setByteField(term345009, term345009.getClass(), "minute", (byte) 11);
        setByteField(term345009, term345009.getClass(), "second", (byte) 51);
        setIntField(term345009, term345009.getClass(), "nano", 531225083);
        setField(term345004, term345004.getClass(), "time", term345009);
        setField(term344988, term344988.getClass(), "registerTime", term345004);
        setIntField(term345015, term345015.getClass(), "year", 2022);
        setShortField(term345015, term345015.getClass(), "month", (short) 1);
        setShortField(term345015, term345015.getClass(), "day", (short) 2);
        setField(term345014, term345014.getClass(), "date", term345015);
        setByteField(term345019, term345019.getClass(), "hour", (byte) 1);
        setByteField(term345019, term345019.getClass(), "minute", (byte) 2);
        setByteField(term345019, term345019.getClass(), "second", (byte) 39);
        setIntField(term345019, term345019.getClass(), "nano", 742900273);
        setField(term345014, term345014.getClass(), "time", term345019);
        setField(term344988, term344988.getClass(), "accessTime", term345014);
        setField(term344986, term344986.getClass(), "card", term344988);
        setField(term344986, term344986.getClass(), "userName", "DBoiDzoACd");
        setIntField(term344986, term344986.getClass(), "level", -92919720);
        setIntField(term344986, term344986.getClass(), "reincarnationNum", 582214544);
        setLongField(term344986, term344986.getClass(), "exp", 2722014215089901555L);
        setLongField(term344986, term344986.getClass(), "point", 6270500571266683007L);
        setLongField(term344986, term344986.getClass(), "totalPoint", -2117190226728614719L);
        setIntField(term344986, term344986.getClass(), "playCount", 437573893);
        setIntField(term344986, term344986.getClass(), "jewelCount", -1662719279);
        setIntField(term344986, term344986.getClass(), "totalJewelCount", -2103009673);
        setIntField(term344986, term344986.getClass(), "medalCount", -833974170);
        setIntField(term344986, term344986.getClass(), "playerRating", -814411921);
        setIntField(term344986, term344986.getClass(), "highestRating", 1852815037);
        setIntField(term344986, term344986.getClass(), "battlePoint", -2088339057);
        setIntField(term344986, term344986.getClass(), "bestBattlePoint", -1600084871);
        setIntField(term344986, term344986.getClass(), "overDamageBattlePoint", 1608941244);
        setBooleanField(term344986, term344986.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term344986, term344986.getClass(), "nameplateId", 253849583);
        setIntField(term344986, term344986.getClass(), "trophyId", -571449965);
        setIntField(term344986, term344986.getClass(), "cardId", 1138670142);
        setIntField(term344986, term344986.getClass(), "characterId", 1012359462);
        setIntField(term344986, term344986.getClass(), "characterVoiceNo", -515537125);
        setIntField(term344986, term344986.getClass(), "tabSetting", -1776946083);
        setIntField(term344986, term344986.getClass(), "tabSortSetting", -1222338163);
        setIntField(term344986, term344986.getClass(), "cardCategorySetting", 1052405674);
        setIntField(term344986, term344986.getClass(), "cardSortSetting", -1769542870);
        setIntField(term344986, term344986.getClass(), "rivalScoreCategorySetting", 231504885);
        setIntField(term344986, term344986.getClass(), "playedTutorialBit", 128115351);
        setIntField(term344986, term344986.getClass(), "firstTutorialCancelNum", -1166285846);
        setLongField(term344986, term344986.getClass(), "sumTechHighScore", -6092102377620688778L);
        setLongField(term344986, term344986.getClass(), "sumTechBasicHighScore", -3492600743705908692L);
        setLongField(term344986, term344986.getClass(), "sumTechAdvancedHighScore", 6729314978946231866L);
        setLongField(term344986, term344986.getClass(), "sumTechExpertHighScore", -3136997877636080388L);
        setLongField(term344986, term344986.getClass(), "sumTechMasterHighScore", 7403438989883965621L);
        setLongField(term344986, term344986.getClass(), "sumTechLunaticHighScore", 7676318630863622592L);
        setLongField(term344986, term344986.getClass(), "sumBattleHighScore", -8914430121186495489L);
        setLongField(term344986, term344986.getClass(), "sumBattleBasicHighScore", 477136759607518889L);
        setLongField(term344986, term344986.getClass(), "sumBattleAdvancedHighScore", -679214145167333409L);
        setLongField(term344986, term344986.getClass(), "sumBattleExpertHighScore", 560548928910995381L);
        setLongField(term344986, term344986.getClass(), "sumBattleMasterHighScore", -5493118800043478383L);
        setLongField(term344986, term344986.getClass(), "sumBattleLunaticHighScore", -5637625529632153329L);
        setField(term344986, term344986.getClass(), "eventWatchedDate", "dlbzaogrDU");
        setField(term344986, term344986.getClass(), "cmEventWatchedDate", "fJYOHusvTA");
        setField(term344986, term344986.getClass(), "firstGameId", "SVHlVkUhHO");
        setField(term344986, term344986.getClass(), "firstRomVersion", "LzFAWZpFjn");
        setField(term344986, term344986.getClass(), "firstDataVersion", "BqKGAAapbN");
        setField(term344986, term344986.getClass(), "firstPlayDate", "zBuinfJXWL");
        setField(term344986, term344986.getClass(), "lastGameId", "VFVtUIgTiw");
        setField(term344986, term344986.getClass(), "lastRomVersion", "kxPWFZqtzn");
        setField(term344986, term344986.getClass(), "lastDataVersion", "rYcZdXyZVp");
        setField(term344986, term344986.getClass(), "compatibleCmVersion", "LYolXAGOVy");
        setField(term344986, term344986.getClass(), "lastPlayDate", "khHcUBgVet");
        setIntField(term344986, term344986.getClass(), "lastPlaceId", -945508527);
        setField(term344986, term344986.getClass(), "lastPlaceName", "nvviywbFNL");
        setIntField(term344986, term344986.getClass(), "lastRegionId", 1545434386);
        setField(term344986, term344986.getClass(), "lastRegionName", "wlpBfKyzud");
        setIntField(term344986, term344986.getClass(), "lastAllNetId", -273681385);
        setField(term344986, term344986.getClass(), "lastClientId", "ZVLMiVNCSY");
        setIntField(term344986, term344986.getClass(), "lastUsedDeckId", 1328165973);
        setIntField(term344986, term344986.getClass(), "lastPlayMusicLevel", -394101152);
        setIntField(term344986, term344986.getClass(), "lastEmoneyBrand", 693450208);
        setField(term344984, term344984.getClass(), "user", term344986);
        setIntField(term344984, term344984.getClass(), "optionSet", -444038969);
        setIntField(term344984, term344984.getClass(), "speed", -1783894396);
        setIntField(term344984, term344984.getClass(), "mirror", 1987866455);
        setIntField(term344984, term344984.getClass(), "judgeTiming", 169960707);
        setIntField(term344984, term344984.getClass(), "judgeAdjustment", 696223765);
        setIntField(term344984, term344984.getClass(), "abort", -1576119321);
        setIntField(term344984, term344984.getClass(), "stealthField", 2102071103);
        setIntField(term344984, term344984.getClass(), "tapSound", -588406565);
        setIntField(term344984, term344984.getClass(), "volGuide", -278354410);
        setIntField(term344984, term344984.getClass(), "volAll", 1989057696);
        setIntField(term344984, term344984.getClass(), "volTap", 1178448950);
        setIntField(term344984, term344984.getClass(), "volCrTap", -1160980727);
        setIntField(term344984, term344984.getClass(), "volHold", -1136464198);
        setIntField(term344984, term344984.getClass(), "volSide", -1841691474);
        setIntField(term344984, term344984.getClass(), "volFlick", 861826506);
        setIntField(term344984, term344984.getClass(), "volBell", -182317006);
        setIntField(term344984, term344984.getClass(), "volEnemy", -556152767);
        setIntField(term344984, term344984.getClass(), "volSkill", -861993138);
        setIntField(term344984, term344984.getClass(), "volDamage", -42719606);
        setIntField(term344984, term344984.getClass(), "colorField", -1289505790);
        setIntField(term344984, term344984.getClass(), "colorLaneBright", -1686865683);
        setIntField(term344984, term344984.getClass(), "colorWallBright", 1657564317);
        setIntField(term344984, term344984.getClass(), "colorLane", 772590298);
        setIntField(term344984, term344984.getClass(), "colorSide", -1434416781);
        setIntField(term344984, term344984.getClass(), "effectDamage", 1057250297);
        setIntField(term344984, term344984.getClass(), "effectPos", 243338625);
        setIntField(term344984, term344984.getClass(), "judgeDisp", 922913031);
        setIntField(term344984, term344984.getClass(), "judgePos", 1159591759);
        setIntField(term344984, term344984.getClass(), "judgeBreak", 281866697);
        setIntField(term344984, term344984.getClass(), "judgeHit", -247893558);
        setIntField(term344984, term344984.getClass(), "platinumBreakDisp", -997425509);
        setIntField(term344984, term344984.getClass(), "judgeCriticalBreak", 794511603);
        setIntField(term344984, term344984.getClass(), "matching", -1316995230);
        setIntField(term344984, term344984.getClass(), "dispPlayerLv", 670477459);
        setIntField(term344984, term344984.getClass(), "dispRating", 924608241);
        setIntField(term344984, term344984.getClass(), "dispBP", -1363281067);
        setIntField(term344984, term344984.getClass(), "headphone", 1199386907);
        term345286 = new Integer(-999548178);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term345286;
        callMethod(klass, "setHeadphone", argTypes, term344984, args);
    }

};


