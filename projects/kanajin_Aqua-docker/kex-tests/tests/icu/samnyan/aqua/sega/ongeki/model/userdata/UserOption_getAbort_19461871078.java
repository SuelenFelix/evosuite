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

public class UserOption_getAbort_19461871078 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term312147;

    public UserOption_getAbort_19461871078() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term312153 = new Long(9056245012917372169L);
        term312147 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption"));
        Object term312149 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term312151 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term312167 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term312168 = newInstance(Class.forName("java.time.LocalDate"));
        Object term312172 = newInstance(Class.forName("java.time.LocalTime"));
        Object term312177 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term312178 = newInstance(Class.forName("java.time.LocalDate"));
        Object term312182 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term312147, term312147.getClass(), "id", -8800699308304746010L);
        setLongField(term312149, term312149.getClass(), "id", -8914249039855077069L);
        setLongField(term312151, term312151.getClass(), "id", -7686514388971653264L);
        setField(term312151, term312151.getClass(), "extId", term312153);
        setField(term312151, term312151.getClass(), "luid", "gkhkYpAukg");
        setIntField(term312168, term312168.getClass(), "year", 2020);
        setShortField(term312168, term312168.getClass(), "month", (short) 5);
        setShortField(term312168, term312168.getClass(), "day", (short) 16);
        setField(term312167, term312167.getClass(), "date", term312168);
        setByteField(term312172, term312172.getClass(), "hour", (byte) 5);
        setByteField(term312172, term312172.getClass(), "minute", (byte) 22);
        setByteField(term312172, term312172.getClass(), "second", (byte) 27);
        setIntField(term312172, term312172.getClass(), "nano", 680063090);
        setField(term312167, term312167.getClass(), "time", term312172);
        setField(term312151, term312151.getClass(), "registerTime", term312167);
        setIntField(term312178, term312178.getClass(), "year", 2022);
        setShortField(term312178, term312178.getClass(), "month", (short) 5);
        setShortField(term312178, term312178.getClass(), "day", (short) 29);
        setField(term312177, term312177.getClass(), "date", term312178);
        setByteField(term312182, term312182.getClass(), "hour", (byte) 18);
        setByteField(term312182, term312182.getClass(), "minute", (byte) 7);
        setByteField(term312182, term312182.getClass(), "second", (byte) 41);
        setIntField(term312182, term312182.getClass(), "nano", 988527834);
        setField(term312177, term312177.getClass(), "time", term312182);
        setField(term312151, term312151.getClass(), "accessTime", term312177);
        setField(term312149, term312149.getClass(), "card", term312151);
        setField(term312149, term312149.getClass(), "userName", "lnYIyHaqvx");
        setIntField(term312149, term312149.getClass(), "level", -1313471481);
        setIntField(term312149, term312149.getClass(), "reincarnationNum", -1435484067);
        setLongField(term312149, term312149.getClass(), "exp", -6283735883201813852L);
        setLongField(term312149, term312149.getClass(), "point", 8459637861606772777L);
        setLongField(term312149, term312149.getClass(), "totalPoint", 1559665973903894408L);
        setIntField(term312149, term312149.getClass(), "playCount", 1708220860);
        setIntField(term312149, term312149.getClass(), "jewelCount", -1556562154);
        setIntField(term312149, term312149.getClass(), "totalJewelCount", 1714476237);
        setIntField(term312149, term312149.getClass(), "medalCount", 2139138090);
        setIntField(term312149, term312149.getClass(), "playerRating", 1269142010);
        setIntField(term312149, term312149.getClass(), "highestRating", -1772742811);
        setIntField(term312149, term312149.getClass(), "battlePoint", -1358271855);
        setIntField(term312149, term312149.getClass(), "bestBattlePoint", -1051764159);
        setIntField(term312149, term312149.getClass(), "overDamageBattlePoint", 47216676);
        setBooleanField(term312149, term312149.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term312149, term312149.getClass(), "nameplateId", 2105630804);
        setIntField(term312149, term312149.getClass(), "trophyId", 1450349223);
        setIntField(term312149, term312149.getClass(), "cardId", 538200623);
        setIntField(term312149, term312149.getClass(), "characterId", -1705373878);
        setIntField(term312149, term312149.getClass(), "characterVoiceNo", 2135067465);
        setIntField(term312149, term312149.getClass(), "tabSetting", -2031000696);
        setIntField(term312149, term312149.getClass(), "tabSortSetting", -1624438817);
        setIntField(term312149, term312149.getClass(), "cardCategorySetting", -1219246269);
        setIntField(term312149, term312149.getClass(), "cardSortSetting", -733854206);
        setIntField(term312149, term312149.getClass(), "rivalScoreCategorySetting", 926392807);
        setIntField(term312149, term312149.getClass(), "playedTutorialBit", 1041744156);
        setIntField(term312149, term312149.getClass(), "firstTutorialCancelNum", -389758494);
        setLongField(term312149, term312149.getClass(), "sumTechHighScore", -1925656188117699467L);
        setLongField(term312149, term312149.getClass(), "sumTechBasicHighScore", -3948648426254369784L);
        setLongField(term312149, term312149.getClass(), "sumTechAdvancedHighScore", 112257978920464799L);
        setLongField(term312149, term312149.getClass(), "sumTechExpertHighScore", 4038824786796118545L);
        setLongField(term312149, term312149.getClass(), "sumTechMasterHighScore", -8911276405657587683L);
        setLongField(term312149, term312149.getClass(), "sumTechLunaticHighScore", 2395276766264589109L);
        setLongField(term312149, term312149.getClass(), "sumBattleHighScore", -562056978690338281L);
        setLongField(term312149, term312149.getClass(), "sumBattleBasicHighScore", 3976860921304806611L);
        setLongField(term312149, term312149.getClass(), "sumBattleAdvancedHighScore", -2751125951785650646L);
        setLongField(term312149, term312149.getClass(), "sumBattleExpertHighScore", -8747904302371466636L);
        setLongField(term312149, term312149.getClass(), "sumBattleMasterHighScore", -6555570206385855896L);
        setLongField(term312149, term312149.getClass(), "sumBattleLunaticHighScore", -3036791740479235464L);
        setField(term312149, term312149.getClass(), "eventWatchedDate", "TUcJMtBUTR");
        setField(term312149, term312149.getClass(), "cmEventWatchedDate", "rsxzwDmHat");
        setField(term312149, term312149.getClass(), "firstGameId", "xjsSGRmyFe");
        setField(term312149, term312149.getClass(), "firstRomVersion", "UbgPwxhdRe");
        setField(term312149, term312149.getClass(), "firstDataVersion", "XYnNPVUtgo");
        setField(term312149, term312149.getClass(), "firstPlayDate", "ECYpKktLoh");
        setField(term312149, term312149.getClass(), "lastGameId", "sXuWsHuGHf");
        setField(term312149, term312149.getClass(), "lastRomVersion", "LZvKnfYxfp");
        setField(term312149, term312149.getClass(), "lastDataVersion", "udsbOHcFmZ");
        setField(term312149, term312149.getClass(), "compatibleCmVersion", "ocDpcoiyHj");
        setField(term312149, term312149.getClass(), "lastPlayDate", "bmilaaUMzV");
        setIntField(term312149, term312149.getClass(), "lastPlaceId", 1171046840);
        setField(term312149, term312149.getClass(), "lastPlaceName", "JPhJMqQReC");
        setIntField(term312149, term312149.getClass(), "lastRegionId", 1407705857);
        setField(term312149, term312149.getClass(), "lastRegionName", "lcxzrQuzPN");
        setIntField(term312149, term312149.getClass(), "lastAllNetId", -178366636);
        setField(term312149, term312149.getClass(), "lastClientId", "IprMmbNdgK");
        setIntField(term312149, term312149.getClass(), "lastUsedDeckId", -1778372760);
        setIntField(term312149, term312149.getClass(), "lastPlayMusicLevel", 311904385);
        setIntField(term312149, term312149.getClass(), "lastEmoneyBrand", 471793721);
        setField(term312147, term312147.getClass(), "user", term312149);
        setIntField(term312147, term312147.getClass(), "optionSet", -1728672353);
        setIntField(term312147, term312147.getClass(), "speed", -1365213640);
        setIntField(term312147, term312147.getClass(), "mirror", -1686158091);
        setIntField(term312147, term312147.getClass(), "judgeTiming", -1831358493);
        setIntField(term312147, term312147.getClass(), "judgeAdjustment", 1449693950);
        setIntField(term312147, term312147.getClass(), "abort", 1876513233);
        setIntField(term312147, term312147.getClass(), "stealthField", 1279238164);
        setIntField(term312147, term312147.getClass(), "tapSound", -860989601);
        setIntField(term312147, term312147.getClass(), "volGuide", -1034064665);
        setIntField(term312147, term312147.getClass(), "volAll", -948079369);
        setIntField(term312147, term312147.getClass(), "volTap", 2088999271);
        setIntField(term312147, term312147.getClass(), "volCrTap", 742877802);
        setIntField(term312147, term312147.getClass(), "volHold", 1128990209);
        setIntField(term312147, term312147.getClass(), "volSide", -382387405);
        setIntField(term312147, term312147.getClass(), "volFlick", 1116503396);
        setIntField(term312147, term312147.getClass(), "volBell", -789845072);
        setIntField(term312147, term312147.getClass(), "volEnemy", -1509169877);
        setIntField(term312147, term312147.getClass(), "volSkill", 288687486);
        setIntField(term312147, term312147.getClass(), "volDamage", -1005461994);
        setIntField(term312147, term312147.getClass(), "colorField", -401284444);
        setIntField(term312147, term312147.getClass(), "colorLaneBright", -1718824766);
        setIntField(term312147, term312147.getClass(), "colorWallBright", -1467294152);
        setIntField(term312147, term312147.getClass(), "colorLane", -1034276355);
        setIntField(term312147, term312147.getClass(), "colorSide", -1529357676);
        setIntField(term312147, term312147.getClass(), "effectDamage", 10150435);
        setIntField(term312147, term312147.getClass(), "effectPos", -1256890273);
        setIntField(term312147, term312147.getClass(), "judgeDisp", 1443102002);
        setIntField(term312147, term312147.getClass(), "judgePos", 347324151);
        setIntField(term312147, term312147.getClass(), "judgeBreak", -1870606994);
        setIntField(term312147, term312147.getClass(), "judgeHit", -777691652);
        setIntField(term312147, term312147.getClass(), "platinumBreakDisp", -606738226);
        setIntField(term312147, term312147.getClass(), "judgeCriticalBreak", 828287241);
        setIntField(term312147, term312147.getClass(), "matching", 684351885);
        setIntField(term312147, term312147.getClass(), "dispPlayerLv", -1393624608);
        setIntField(term312147, term312147.getClass(), "dispRating", 1752067212);
        setIntField(term312147, term312147.getClass(), "dispBP", -1876266343);
        setIntField(term312147, term312147.getClass(), "headphone", 275874932);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAbort", argTypes, term312147, args);
    }

};


