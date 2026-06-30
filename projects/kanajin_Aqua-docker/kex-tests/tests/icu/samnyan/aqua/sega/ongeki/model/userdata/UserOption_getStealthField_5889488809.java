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

public class UserOption_getStealthField_5889488809 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term312609;

    public UserOption_getStealthField_5889488809() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term312615 = new Long(7848004402682338886L);
        term312609 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption"));
        Object term312611 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term312613 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term312629 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term312630 = newInstance(Class.forName("java.time.LocalDate"));
        Object term312634 = newInstance(Class.forName("java.time.LocalTime"));
        Object term312639 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term312640 = newInstance(Class.forName("java.time.LocalDate"));
        Object term312644 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term312609, term312609.getClass(), "id", -3746390509553427549L);
        setLongField(term312611, term312611.getClass(), "id", -4726994502378346255L);
        setLongField(term312613, term312613.getClass(), "id", 4725453580225064171L);
        setField(term312613, term312613.getClass(), "extId", term312615);
        setField(term312613, term312613.getClass(), "luid", "UQNUJZpRUb");
        setIntField(term312630, term312630.getClass(), "year", 2015);
        setShortField(term312630, term312630.getClass(), "month", (short) 6);
        setShortField(term312630, term312630.getClass(), "day", (short) 2);
        setField(term312629, term312629.getClass(), "date", term312630);
        setByteField(term312634, term312634.getClass(), "hour", (byte) 20);
        setByteField(term312634, term312634.getClass(), "minute", (byte) 44);
        setByteField(term312634, term312634.getClass(), "second", (byte) 56);
        setIntField(term312634, term312634.getClass(), "nano", 902936064);
        setField(term312629, term312629.getClass(), "time", term312634);
        setField(term312613, term312613.getClass(), "registerTime", term312629);
        setIntField(term312640, term312640.getClass(), "year", 2027);
        setShortField(term312640, term312640.getClass(), "month", (short) 12);
        setShortField(term312640, term312640.getClass(), "day", (short) 6);
        setField(term312639, term312639.getClass(), "date", term312640);
        setByteField(term312644, term312644.getClass(), "hour", (byte) 12);
        setByteField(term312644, term312644.getClass(), "minute", (byte) 9);
        setByteField(term312644, term312644.getClass(), "second", (byte) 47);
        setIntField(term312644, term312644.getClass(), "nano", 964897519);
        setField(term312639, term312639.getClass(), "time", term312644);
        setField(term312613, term312613.getClass(), "accessTime", term312639);
        setField(term312611, term312611.getClass(), "card", term312613);
        setField(term312611, term312611.getClass(), "userName", "CBlktFOQda");
        setIntField(term312611, term312611.getClass(), "level", 117844112);
        setIntField(term312611, term312611.getClass(), "reincarnationNum", 185724589);
        setLongField(term312611, term312611.getClass(), "exp", -1603768946473751346L);
        setLongField(term312611, term312611.getClass(), "point", -8058088383957933228L);
        setLongField(term312611, term312611.getClass(), "totalPoint", 329492001203229499L);
        setIntField(term312611, term312611.getClass(), "playCount", 580854305);
        setIntField(term312611, term312611.getClass(), "jewelCount", -1356320855);
        setIntField(term312611, term312611.getClass(), "totalJewelCount", 1349373053);
        setIntField(term312611, term312611.getClass(), "medalCount", 845184539);
        setIntField(term312611, term312611.getClass(), "playerRating", 776438807);
        setIntField(term312611, term312611.getClass(), "highestRating", 312946951);
        setIntField(term312611, term312611.getClass(), "battlePoint", -629153416);
        setIntField(term312611, term312611.getClass(), "bestBattlePoint", -2035643695);
        setIntField(term312611, term312611.getClass(), "overDamageBattlePoint", 345867650);
        setBooleanField(term312611, term312611.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term312611, term312611.getClass(), "nameplateId", 1075950526);
        setIntField(term312611, term312611.getClass(), "trophyId", 443050852);
        setIntField(term312611, term312611.getClass(), "cardId", 120471673);
        setIntField(term312611, term312611.getClass(), "characterId", -1396104241);
        setIntField(term312611, term312611.getClass(), "characterVoiceNo", -445000291);
        setIntField(term312611, term312611.getClass(), "tabSetting", -313254868);
        setIntField(term312611, term312611.getClass(), "tabSortSetting", -1879218346);
        setIntField(term312611, term312611.getClass(), "cardCategorySetting", -658635292);
        setIntField(term312611, term312611.getClass(), "cardSortSetting", -455947117);
        setIntField(term312611, term312611.getClass(), "rivalScoreCategorySetting", 1628366071);
        setIntField(term312611, term312611.getClass(), "playedTutorialBit", -1343885468);
        setIntField(term312611, term312611.getClass(), "firstTutorialCancelNum", 57741941);
        setLongField(term312611, term312611.getClass(), "sumTechHighScore", -12129403933720068L);
        setLongField(term312611, term312611.getClass(), "sumTechBasicHighScore", -5282330658647161528L);
        setLongField(term312611, term312611.getClass(), "sumTechAdvancedHighScore", 8249108807996060235L);
        setLongField(term312611, term312611.getClass(), "sumTechExpertHighScore", 5040390699620948936L);
        setLongField(term312611, term312611.getClass(), "sumTechMasterHighScore", -2802536446372219780L);
        setLongField(term312611, term312611.getClass(), "sumTechLunaticHighScore", -5203045757052736133L);
        setLongField(term312611, term312611.getClass(), "sumBattleHighScore", 4839192215939798108L);
        setLongField(term312611, term312611.getClass(), "sumBattleBasicHighScore", -565206803707978897L);
        setLongField(term312611, term312611.getClass(), "sumBattleAdvancedHighScore", -1403185194739521966L);
        setLongField(term312611, term312611.getClass(), "sumBattleExpertHighScore", 2882468174139015074L);
        setLongField(term312611, term312611.getClass(), "sumBattleMasterHighScore", -8383257640984145762L);
        setLongField(term312611, term312611.getClass(), "sumBattleLunaticHighScore", 1266324185299149292L);
        setField(term312611, term312611.getClass(), "eventWatchedDate", "PCPVxMQysm");
        setField(term312611, term312611.getClass(), "cmEventWatchedDate", "UKPyzDygDu");
        setField(term312611, term312611.getClass(), "firstGameId", "UiqcXrizus");
        setField(term312611, term312611.getClass(), "firstRomVersion", "MCZFJMkSTm");
        setField(term312611, term312611.getClass(), "firstDataVersion", "GVgfhrsULv");
        setField(term312611, term312611.getClass(), "firstPlayDate", "GBfsuXbEmK");
        setField(term312611, term312611.getClass(), "lastGameId", "WSPSzlqJoy");
        setField(term312611, term312611.getClass(), "lastRomVersion", "grQbHXIHXs");
        setField(term312611, term312611.getClass(), "lastDataVersion", "luyQmnpgIR");
        setField(term312611, term312611.getClass(), "compatibleCmVersion", "TDWpnOunaa");
        setField(term312611, term312611.getClass(), "lastPlayDate", "yoiqhkzkiu");
        setIntField(term312611, term312611.getClass(), "lastPlaceId", -1545510798);
        setField(term312611, term312611.getClass(), "lastPlaceName", "BRgMLVjNzh");
        setIntField(term312611, term312611.getClass(), "lastRegionId", -10623334);
        setField(term312611, term312611.getClass(), "lastRegionName", "LqmtuqLGpS");
        setIntField(term312611, term312611.getClass(), "lastAllNetId", -826963523);
        setField(term312611, term312611.getClass(), "lastClientId", "sJIrCinDLf");
        setIntField(term312611, term312611.getClass(), "lastUsedDeckId", 1201706903);
        setIntField(term312611, term312611.getClass(), "lastPlayMusicLevel", 925089014);
        setIntField(term312611, term312611.getClass(), "lastEmoneyBrand", 1864594766);
        setField(term312609, term312609.getClass(), "user", term312611);
        setIntField(term312609, term312609.getClass(), "optionSet", -1496124355);
        setIntField(term312609, term312609.getClass(), "speed", -482420846);
        setIntField(term312609, term312609.getClass(), "mirror", -332013562);
        setIntField(term312609, term312609.getClass(), "judgeTiming", -736943198);
        setIntField(term312609, term312609.getClass(), "judgeAdjustment", 2007882601);
        setIntField(term312609, term312609.getClass(), "abort", 741871354);
        setIntField(term312609, term312609.getClass(), "stealthField", 1577592889);
        setIntField(term312609, term312609.getClass(), "tapSound", 1202129074);
        setIntField(term312609, term312609.getClass(), "volGuide", -1288669556);
        setIntField(term312609, term312609.getClass(), "volAll", -1521858560);
        setIntField(term312609, term312609.getClass(), "volTap", -435042405);
        setIntField(term312609, term312609.getClass(), "volCrTap", 593933721);
        setIntField(term312609, term312609.getClass(), "volHold", 1030504994);
        setIntField(term312609, term312609.getClass(), "volSide", -701067515);
        setIntField(term312609, term312609.getClass(), "volFlick", -1359929680);
        setIntField(term312609, term312609.getClass(), "volBell", 1621331491);
        setIntField(term312609, term312609.getClass(), "volEnemy", 1164803194);
        setIntField(term312609, term312609.getClass(), "volSkill", -1091019664);
        setIntField(term312609, term312609.getClass(), "volDamage", -209173576);
        setIntField(term312609, term312609.getClass(), "colorField", -1009420089);
        setIntField(term312609, term312609.getClass(), "colorLaneBright", -826849130);
        setIntField(term312609, term312609.getClass(), "colorWallBright", -886487104);
        setIntField(term312609, term312609.getClass(), "colorLane", -1580975564);
        setIntField(term312609, term312609.getClass(), "colorSide", -855762476);
        setIntField(term312609, term312609.getClass(), "effectDamage", -559637675);
        setIntField(term312609, term312609.getClass(), "effectPos", 243554276);
        setIntField(term312609, term312609.getClass(), "judgeDisp", -31351128);
        setIntField(term312609, term312609.getClass(), "judgePos", -634909207);
        setIntField(term312609, term312609.getClass(), "judgeBreak", -167225645);
        setIntField(term312609, term312609.getClass(), "judgeHit", -555907895);
        setIntField(term312609, term312609.getClass(), "platinumBreakDisp", 1558825635);
        setIntField(term312609, term312609.getClass(), "judgeCriticalBreak", -1602562135);
        setIntField(term312609, term312609.getClass(), "matching", -1071040496);
        setIntField(term312609, term312609.getClass(), "dispPlayerLv", -132694475);
        setIntField(term312609, term312609.getClass(), "dispRating", 743421180);
        setIntField(term312609, term312609.getClass(), "dispBP", 582186159);
        setIntField(term312609, term312609.getClass(), "headphone", 1121745615);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStealthField", argTypes, term312609, args);
    }

};


