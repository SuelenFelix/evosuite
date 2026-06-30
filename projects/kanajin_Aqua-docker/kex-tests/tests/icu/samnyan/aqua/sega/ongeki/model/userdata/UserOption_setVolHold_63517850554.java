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

public class UserOption_setVolHold_63517850554 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term333848;
     Object term334150;

    public UserOption_setVolHold_63517850554() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term333854 = new Long(-6137280723045949220L);
        term333848 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption"));
        Object term333850 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term333852 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term333868 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term333869 = newInstance(Class.forName("java.time.LocalDate"));
        Object term333873 = newInstance(Class.forName("java.time.LocalTime"));
        Object term333878 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term333879 = newInstance(Class.forName("java.time.LocalDate"));
        Object term333883 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term333848, term333848.getClass(), "id", -4959203069220249783L);
        setLongField(term333850, term333850.getClass(), "id", -3451574760766908359L);
        setLongField(term333852, term333852.getClass(), "id", 234361289764265784L);
        setField(term333852, term333852.getClass(), "extId", term333854);
        setField(term333852, term333852.getClass(), "luid", "uZUgwSaDGE");
        setIntField(term333869, term333869.getClass(), "year", 2029);
        setShortField(term333869, term333869.getClass(), "month", (short) 8);
        setShortField(term333869, term333869.getClass(), "day", (short) 24);
        setField(term333868, term333868.getClass(), "date", term333869);
        setByteField(term333873, term333873.getClass(), "hour", (byte) 5);
        setByteField(term333873, term333873.getClass(), "minute", (byte) 25);
        setByteField(term333873, term333873.getClass(), "second", (byte) 34);
        setIntField(term333873, term333873.getClass(), "nano", 402410897);
        setField(term333868, term333868.getClass(), "time", term333873);
        setField(term333852, term333852.getClass(), "registerTime", term333868);
        setIntField(term333879, term333879.getClass(), "year", 2018);
        setShortField(term333879, term333879.getClass(), "month", (short) 6);
        setShortField(term333879, term333879.getClass(), "day", (short) 18);
        setField(term333878, term333878.getClass(), "date", term333879);
        setByteField(term333883, term333883.getClass(), "hour", (byte) 20);
        setByteField(term333883, term333883.getClass(), "minute", (byte) 1);
        setByteField(term333883, term333883.getClass(), "second", (byte) 31);
        setIntField(term333883, term333883.getClass(), "nano", 536441532);
        setField(term333878, term333878.getClass(), "time", term333883);
        setField(term333852, term333852.getClass(), "accessTime", term333878);
        setField(term333850, term333850.getClass(), "card", term333852);
        setField(term333850, term333850.getClass(), "userName", "ONPIEqjsjQ");
        setIntField(term333850, term333850.getClass(), "level", -1689144754);
        setIntField(term333850, term333850.getClass(), "reincarnationNum", 243841357);
        setLongField(term333850, term333850.getClass(), "exp", 4246251025291385409L);
        setLongField(term333850, term333850.getClass(), "point", 7630453387188245894L);
        setLongField(term333850, term333850.getClass(), "totalPoint", 5073234002111411494L);
        setIntField(term333850, term333850.getClass(), "playCount", -1193203879);
        setIntField(term333850, term333850.getClass(), "jewelCount", 1883066023);
        setIntField(term333850, term333850.getClass(), "totalJewelCount", 1104472887);
        setIntField(term333850, term333850.getClass(), "medalCount", -1535418445);
        setIntField(term333850, term333850.getClass(), "playerRating", -1184630728);
        setIntField(term333850, term333850.getClass(), "highestRating", 1585292479);
        setIntField(term333850, term333850.getClass(), "battlePoint", -1307048859);
        setIntField(term333850, term333850.getClass(), "bestBattlePoint", 941877009);
        setIntField(term333850, term333850.getClass(), "overDamageBattlePoint", 1812496746);
        setBooleanField(term333850, term333850.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term333850, term333850.getClass(), "nameplateId", 1962355198);
        setIntField(term333850, term333850.getClass(), "trophyId", -1377253248);
        setIntField(term333850, term333850.getClass(), "cardId", 35996414);
        setIntField(term333850, term333850.getClass(), "characterId", -1882519188);
        setIntField(term333850, term333850.getClass(), "characterVoiceNo", 1211051222);
        setIntField(term333850, term333850.getClass(), "tabSetting", -653882349);
        setIntField(term333850, term333850.getClass(), "tabSortSetting", 1125422349);
        setIntField(term333850, term333850.getClass(), "cardCategorySetting", 1614030391);
        setIntField(term333850, term333850.getClass(), "cardSortSetting", 201566278);
        setIntField(term333850, term333850.getClass(), "rivalScoreCategorySetting", 716178254);
        setIntField(term333850, term333850.getClass(), "playedTutorialBit", 328943934);
        setIntField(term333850, term333850.getClass(), "firstTutorialCancelNum", -1403055456);
        setLongField(term333850, term333850.getClass(), "sumTechHighScore", 1618766341956317419L);
        setLongField(term333850, term333850.getClass(), "sumTechBasicHighScore", -2213730203264268355L);
        setLongField(term333850, term333850.getClass(), "sumTechAdvancedHighScore", 7296090131614676133L);
        setLongField(term333850, term333850.getClass(), "sumTechExpertHighScore", 1724423196431353243L);
        setLongField(term333850, term333850.getClass(), "sumTechMasterHighScore", 1907978877460616311L);
        setLongField(term333850, term333850.getClass(), "sumTechLunaticHighScore", -5221465393140982602L);
        setLongField(term333850, term333850.getClass(), "sumBattleHighScore", -8155142787815060236L);
        setLongField(term333850, term333850.getClass(), "sumBattleBasicHighScore", -8286136854174084788L);
        setLongField(term333850, term333850.getClass(), "sumBattleAdvancedHighScore", 6876207830069459965L);
        setLongField(term333850, term333850.getClass(), "sumBattleExpertHighScore", 9217447874679632899L);
        setLongField(term333850, term333850.getClass(), "sumBattleMasterHighScore", 8526707644310191495L);
        setLongField(term333850, term333850.getClass(), "sumBattleLunaticHighScore", -4817669241680587183L);
        setField(term333850, term333850.getClass(), "eventWatchedDate", "gQHiUXWGzr");
        setField(term333850, term333850.getClass(), "cmEventWatchedDate", "ltFdArIelM");
        setField(term333850, term333850.getClass(), "firstGameId", "TpRzWWImqe");
        setField(term333850, term333850.getClass(), "firstRomVersion", "UUSTaNRgFF");
        setField(term333850, term333850.getClass(), "firstDataVersion", "fEfIqLyNst");
        setField(term333850, term333850.getClass(), "firstPlayDate", "YbkTcEfJCq");
        setField(term333850, term333850.getClass(), "lastGameId", "CWNoCvbaXb");
        setField(term333850, term333850.getClass(), "lastRomVersion", "xJFhyBZkLx");
        setField(term333850, term333850.getClass(), "lastDataVersion", "hLVdcECAxM");
        setField(term333850, term333850.getClass(), "compatibleCmVersion", "tOqWqJAFjz");
        setField(term333850, term333850.getClass(), "lastPlayDate", "GUvWIcQAPY");
        setIntField(term333850, term333850.getClass(), "lastPlaceId", -2109376657);
        setField(term333850, term333850.getClass(), "lastPlaceName", "iQmKOOQWso");
        setIntField(term333850, term333850.getClass(), "lastRegionId", -200134649);
        setField(term333850, term333850.getClass(), "lastRegionName", "RMTdyrwCqF");
        setIntField(term333850, term333850.getClass(), "lastAllNetId", -1355151946);
        setField(term333850, term333850.getClass(), "lastClientId", "CZHHeRyhGd");
        setIntField(term333850, term333850.getClass(), "lastUsedDeckId", -515541503);
        setIntField(term333850, term333850.getClass(), "lastPlayMusicLevel", -1249268120);
        setIntField(term333850, term333850.getClass(), "lastEmoneyBrand", 1017752578);
        setField(term333848, term333848.getClass(), "user", term333850);
        setIntField(term333848, term333848.getClass(), "optionSet", -1591844430);
        setIntField(term333848, term333848.getClass(), "speed", 1678606873);
        setIntField(term333848, term333848.getClass(), "mirror", -512283571);
        setIntField(term333848, term333848.getClass(), "judgeTiming", 1593299825);
        setIntField(term333848, term333848.getClass(), "judgeAdjustment", -349661255);
        setIntField(term333848, term333848.getClass(), "abort", -1384019152);
        setIntField(term333848, term333848.getClass(), "stealthField", 278051486);
        setIntField(term333848, term333848.getClass(), "tapSound", 1442943933);
        setIntField(term333848, term333848.getClass(), "volGuide", -2023905519);
        setIntField(term333848, term333848.getClass(), "volAll", 1621524095);
        setIntField(term333848, term333848.getClass(), "volTap", -992129595);
        setIntField(term333848, term333848.getClass(), "volCrTap", -1759124858);
        setIntField(term333848, term333848.getClass(), "volHold", 114661491);
        setIntField(term333848, term333848.getClass(), "volSide", 1977146061);
        setIntField(term333848, term333848.getClass(), "volFlick", -910345480);
        setIntField(term333848, term333848.getClass(), "volBell", 1882595560);
        setIntField(term333848, term333848.getClass(), "volEnemy", 100456961);
        setIntField(term333848, term333848.getClass(), "volSkill", -802287779);
        setIntField(term333848, term333848.getClass(), "volDamage", 2078570305);
        setIntField(term333848, term333848.getClass(), "colorField", -6623488);
        setIntField(term333848, term333848.getClass(), "colorLaneBright", 1610278519);
        setIntField(term333848, term333848.getClass(), "colorWallBright", -1772985081);
        setIntField(term333848, term333848.getClass(), "colorLane", 611529690);
        setIntField(term333848, term333848.getClass(), "colorSide", 267662254);
        setIntField(term333848, term333848.getClass(), "effectDamage", -1719686239);
        setIntField(term333848, term333848.getClass(), "effectPos", 1090114980);
        setIntField(term333848, term333848.getClass(), "judgeDisp", -927503426);
        setIntField(term333848, term333848.getClass(), "judgePos", -2108990309);
        setIntField(term333848, term333848.getClass(), "judgeBreak", -1185127412);
        setIntField(term333848, term333848.getClass(), "judgeHit", -243501649);
        setIntField(term333848, term333848.getClass(), "platinumBreakDisp", 752825980);
        setIntField(term333848, term333848.getClass(), "judgeCriticalBreak", -572843395);
        setIntField(term333848, term333848.getClass(), "matching", 2053363712);
        setIntField(term333848, term333848.getClass(), "dispPlayerLv", -1583524824);
        setIntField(term333848, term333848.getClass(), "dispRating", -151194547);
        setIntField(term333848, term333848.getClass(), "dispBP", -220193383);
        setIntField(term333848, term333848.getClass(), "headphone", 1767455149);
        term334150 = new Integer(-1811614533);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term334150;
        callMethod(klass, "setVolHold", argTypes, term333848, args);
    }

};


