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

public class UserOption_getVolCrTap_64129869414 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term314919;

    public UserOption_getVolCrTap_64129869414() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term314925 = new Long(-5850316381591949820L);
        term314919 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption"));
        Object term314921 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term314923 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term314939 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term314940 = newInstance(Class.forName("java.time.LocalDate"));
        Object term314944 = newInstance(Class.forName("java.time.LocalTime"));
        Object term314949 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term314950 = newInstance(Class.forName("java.time.LocalDate"));
        Object term314954 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term314919, term314919.getClass(), "id", 295181862865716809L);
        setLongField(term314921, term314921.getClass(), "id", 1406864587062039571L);
        setLongField(term314923, term314923.getClass(), "id", -5491285354671926148L);
        setField(term314923, term314923.getClass(), "extId", term314925);
        setField(term314923, term314923.getClass(), "luid", "fKupCAFXkv");
        setIntField(term314940, term314940.getClass(), "year", 2026);
        setShortField(term314940, term314940.getClass(), "month", (short) 11);
        setShortField(term314940, term314940.getClass(), "day", (short) 19);
        setField(term314939, term314939.getClass(), "date", term314940);
        setByteField(term314944, term314944.getClass(), "hour", (byte) 12);
        setByteField(term314944, term314944.getClass(), "minute", (byte) 3);
        setByteField(term314944, term314944.getClass(), "second", (byte) 5);
        setIntField(term314944, term314944.getClass(), "nano", 172986053);
        setField(term314939, term314939.getClass(), "time", term314944);
        setField(term314923, term314923.getClass(), "registerTime", term314939);
        setIntField(term314950, term314950.getClass(), "year", 2013);
        setShortField(term314950, term314950.getClass(), "month", (short) 9);
        setShortField(term314950, term314950.getClass(), "day", (short) 29);
        setField(term314949, term314949.getClass(), "date", term314950);
        setByteField(term314954, term314954.getClass(), "hour", (byte) 15);
        setByteField(term314954, term314954.getClass(), "minute", (byte) 27);
        setByteField(term314954, term314954.getClass(), "second", (byte) 16);
        setIntField(term314954, term314954.getClass(), "nano", 618632470);
        setField(term314949, term314949.getClass(), "time", term314954);
        setField(term314923, term314923.getClass(), "accessTime", term314949);
        setField(term314921, term314921.getClass(), "card", term314923);
        setField(term314921, term314921.getClass(), "userName", "vnufBQQZvH");
        setIntField(term314921, term314921.getClass(), "level", -1406865835);
        setIntField(term314921, term314921.getClass(), "reincarnationNum", 183673550);
        setLongField(term314921, term314921.getClass(), "exp", 3907869928011760904L);
        setLongField(term314921, term314921.getClass(), "point", -5143578829115347901L);
        setLongField(term314921, term314921.getClass(), "totalPoint", -927543050581919997L);
        setIntField(term314921, term314921.getClass(), "playCount", -27803663);
        setIntField(term314921, term314921.getClass(), "jewelCount", -610653095);
        setIntField(term314921, term314921.getClass(), "totalJewelCount", -791727638);
        setIntField(term314921, term314921.getClass(), "medalCount", -1193914796);
        setIntField(term314921, term314921.getClass(), "playerRating", 1415809233);
        setIntField(term314921, term314921.getClass(), "highestRating", -2130654972);
        setIntField(term314921, term314921.getClass(), "battlePoint", 16015231);
        setIntField(term314921, term314921.getClass(), "bestBattlePoint", -1777328540);
        setIntField(term314921, term314921.getClass(), "overDamageBattlePoint", 900843846);
        setBooleanField(term314921, term314921.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term314921, term314921.getClass(), "nameplateId", 1724964260);
        setIntField(term314921, term314921.getClass(), "trophyId", -2034392820);
        setIntField(term314921, term314921.getClass(), "cardId", 11835076);
        setIntField(term314921, term314921.getClass(), "characterId", -862461687);
        setIntField(term314921, term314921.getClass(), "characterVoiceNo", -1661748631);
        setIntField(term314921, term314921.getClass(), "tabSetting", -536348630);
        setIntField(term314921, term314921.getClass(), "tabSortSetting", -867374492);
        setIntField(term314921, term314921.getClass(), "cardCategorySetting", -1139610249);
        setIntField(term314921, term314921.getClass(), "cardSortSetting", -350348925);
        setIntField(term314921, term314921.getClass(), "rivalScoreCategorySetting", 2065534694);
        setIntField(term314921, term314921.getClass(), "playedTutorialBit", 1993137567);
        setIntField(term314921, term314921.getClass(), "firstTutorialCancelNum", 611465347);
        setLongField(term314921, term314921.getClass(), "sumTechHighScore", 1274408905020131864L);
        setLongField(term314921, term314921.getClass(), "sumTechBasicHighScore", -7831827434825149531L);
        setLongField(term314921, term314921.getClass(), "sumTechAdvancedHighScore", 3132652121465438073L);
        setLongField(term314921, term314921.getClass(), "sumTechExpertHighScore", -3079207170623970265L);
        setLongField(term314921, term314921.getClass(), "sumTechMasterHighScore", -8401645991143253337L);
        setLongField(term314921, term314921.getClass(), "sumTechLunaticHighScore", -4704714553528039229L);
        setLongField(term314921, term314921.getClass(), "sumBattleHighScore", 6499961921815152297L);
        setLongField(term314921, term314921.getClass(), "sumBattleBasicHighScore", 3825592171529142866L);
        setLongField(term314921, term314921.getClass(), "sumBattleAdvancedHighScore", 4632681505958586263L);
        setLongField(term314921, term314921.getClass(), "sumBattleExpertHighScore", 4045309829680706102L);
        setLongField(term314921, term314921.getClass(), "sumBattleMasterHighScore", -6601976175767619820L);
        setLongField(term314921, term314921.getClass(), "sumBattleLunaticHighScore", 6849965402050507897L);
        setField(term314921, term314921.getClass(), "eventWatchedDate", "JvtHeDpYNv");
        setField(term314921, term314921.getClass(), "cmEventWatchedDate", "xtwwtMncul");
        setField(term314921, term314921.getClass(), "firstGameId", "PGcgloCtHr");
        setField(term314921, term314921.getClass(), "firstRomVersion", "ZuCEgKeADg");
        setField(term314921, term314921.getClass(), "firstDataVersion", "muekHYeDxD");
        setField(term314921, term314921.getClass(), "firstPlayDate", "XyBNlUmuhq");
        setField(term314921, term314921.getClass(), "lastGameId", "fDaYummWby");
        setField(term314921, term314921.getClass(), "lastRomVersion", "vlYoQMtIRL");
        setField(term314921, term314921.getClass(), "lastDataVersion", "rCSnisBQJk");
        setField(term314921, term314921.getClass(), "compatibleCmVersion", "GuHkcLwuif");
        setField(term314921, term314921.getClass(), "lastPlayDate", "FbkINIVhcv");
        setIntField(term314921, term314921.getClass(), "lastPlaceId", -838822647);
        setField(term314921, term314921.getClass(), "lastPlaceName", "zOKYtJiLAn");
        setIntField(term314921, term314921.getClass(), "lastRegionId", 1953677784);
        setField(term314921, term314921.getClass(), "lastRegionName", "VfkivCbvdM");
        setIntField(term314921, term314921.getClass(), "lastAllNetId", 1804470465);
        setField(term314921, term314921.getClass(), "lastClientId", "aRYuvgpWih");
        setIntField(term314921, term314921.getClass(), "lastUsedDeckId", -1346034962);
        setIntField(term314921, term314921.getClass(), "lastPlayMusicLevel", -2106648804);
        setIntField(term314921, term314921.getClass(), "lastEmoneyBrand", 1583429491);
        setField(term314919, term314919.getClass(), "user", term314921);
        setIntField(term314919, term314919.getClass(), "optionSet", 2120105673);
        setIntField(term314919, term314919.getClass(), "speed", -1677656650);
        setIntField(term314919, term314919.getClass(), "mirror", 1741465676);
        setIntField(term314919, term314919.getClass(), "judgeTiming", 11311261);
        setIntField(term314919, term314919.getClass(), "judgeAdjustment", 893852783);
        setIntField(term314919, term314919.getClass(), "abort", -1087994165);
        setIntField(term314919, term314919.getClass(), "stealthField", 2147172410);
        setIntField(term314919, term314919.getClass(), "tapSound", -700334463);
        setIntField(term314919, term314919.getClass(), "volGuide", 764478311);
        setIntField(term314919, term314919.getClass(), "volAll", -772408056);
        setIntField(term314919, term314919.getClass(), "volTap", 82148477);
        setIntField(term314919, term314919.getClass(), "volCrTap", -983930460);
        setIntField(term314919, term314919.getClass(), "volHold", -1209793049);
        setIntField(term314919, term314919.getClass(), "volSide", 322699104);
        setIntField(term314919, term314919.getClass(), "volFlick", -592289335);
        setIntField(term314919, term314919.getClass(), "volBell", 1581045302);
        setIntField(term314919, term314919.getClass(), "volEnemy", 1150125671);
        setIntField(term314919, term314919.getClass(), "volSkill", 800107352);
        setIntField(term314919, term314919.getClass(), "volDamage", 1947306830);
        setIntField(term314919, term314919.getClass(), "colorField", -1469070934);
        setIntField(term314919, term314919.getClass(), "colorLaneBright", -65433689);
        setIntField(term314919, term314919.getClass(), "colorWallBright", -1677349196);
        setIntField(term314919, term314919.getClass(), "colorLane", 605056093);
        setIntField(term314919, term314919.getClass(), "colorSide", -760171128);
        setIntField(term314919, term314919.getClass(), "effectDamage", -975492874);
        setIntField(term314919, term314919.getClass(), "effectPos", 2136424565);
        setIntField(term314919, term314919.getClass(), "judgeDisp", -1664120751);
        setIntField(term314919, term314919.getClass(), "judgePos", -1333548159);
        setIntField(term314919, term314919.getClass(), "judgeBreak", 1710172848);
        setIntField(term314919, term314919.getClass(), "judgeHit", 1728001282);
        setIntField(term314919, term314919.getClass(), "platinumBreakDisp", -763837268);
        setIntField(term314919, term314919.getClass(), "judgeCriticalBreak", -569352509);
        setIntField(term314919, term314919.getClass(), "matching", 1794725639);
        setIntField(term314919, term314919.getClass(), "dispPlayerLv", 822649252);
        setIntField(term314919, term314919.getClass(), "dispRating", -62506625);
        setIntField(term314919, term314919.getClass(), "dispBP", 1232264847);
        setIntField(term314919, term314919.getClass(), "headphone", -2121024762);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVolCrTap", argTypes, term314919, args);
    }

};


