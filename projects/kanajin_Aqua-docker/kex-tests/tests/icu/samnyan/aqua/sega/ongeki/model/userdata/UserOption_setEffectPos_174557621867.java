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

public class UserOption_setEffectPos_174557621867 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term339880;
     Object term340182;

    public UserOption_setEffectPos_174557621867() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term339886 = new Long(-1610129689783641208L);
        term339880 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption"));
        Object term339882 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term339884 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term339900 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term339901 = newInstance(Class.forName("java.time.LocalDate"));
        Object term339905 = newInstance(Class.forName("java.time.LocalTime"));
        Object term339910 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term339911 = newInstance(Class.forName("java.time.LocalDate"));
        Object term339915 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term339880, term339880.getClass(), "id", -7186100676140683517L);
        setLongField(term339882, term339882.getClass(), "id", -4366222170434904532L);
        setLongField(term339884, term339884.getClass(), "id", -668421427047504043L);
        setField(term339884, term339884.getClass(), "extId", term339886);
        setField(term339884, term339884.getClass(), "luid", "PtNZZVTegX");
        setIntField(term339901, term339901.getClass(), "year", 2024);
        setShortField(term339901, term339901.getClass(), "month", (short) 5);
        setShortField(term339901, term339901.getClass(), "day", (short) 5);
        setField(term339900, term339900.getClass(), "date", term339901);
        setByteField(term339905, term339905.getClass(), "hour", (byte) 2);
        setByteField(term339905, term339905.getClass(), "minute", (byte) 34);
        setByteField(term339905, term339905.getClass(), "second", (byte) 19);
        setIntField(term339905, term339905.getClass(), "nano", 765186349);
        setField(term339900, term339900.getClass(), "time", term339905);
        setField(term339884, term339884.getClass(), "registerTime", term339900);
        setIntField(term339911, term339911.getClass(), "year", 2029);
        setShortField(term339911, term339911.getClass(), "month", (short) 4);
        setShortField(term339911, term339911.getClass(), "day", (short) 8);
        setField(term339910, term339910.getClass(), "date", term339911);
        setByteField(term339915, term339915.getClass(), "hour", (byte) 17);
        setByteField(term339915, term339915.getClass(), "minute", (byte) 10);
        setByteField(term339915, term339915.getClass(), "second", (byte) 59);
        setIntField(term339915, term339915.getClass(), "nano", 199292846);
        setField(term339910, term339910.getClass(), "time", term339915);
        setField(term339884, term339884.getClass(), "accessTime", term339910);
        setField(term339882, term339882.getClass(), "card", term339884);
        setField(term339882, term339882.getClass(), "userName", "RRKmFpdESO");
        setIntField(term339882, term339882.getClass(), "level", -1154507203);
        setIntField(term339882, term339882.getClass(), "reincarnationNum", -1713000389);
        setLongField(term339882, term339882.getClass(), "exp", -8722210997488495217L);
        setLongField(term339882, term339882.getClass(), "point", -1855945166583642933L);
        setLongField(term339882, term339882.getClass(), "totalPoint", 7011105929232909521L);
        setIntField(term339882, term339882.getClass(), "playCount", 2088770619);
        setIntField(term339882, term339882.getClass(), "jewelCount", -1819066528);
        setIntField(term339882, term339882.getClass(), "totalJewelCount", -936530875);
        setIntField(term339882, term339882.getClass(), "medalCount", 1052365136);
        setIntField(term339882, term339882.getClass(), "playerRating", -677336265);
        setIntField(term339882, term339882.getClass(), "highestRating", -276630689);
        setIntField(term339882, term339882.getClass(), "battlePoint", -726829355);
        setIntField(term339882, term339882.getClass(), "bestBattlePoint", 1407893825);
        setIntField(term339882, term339882.getClass(), "overDamageBattlePoint", -273850505);
        setBooleanField(term339882, term339882.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term339882, term339882.getClass(), "nameplateId", 907223872);
        setIntField(term339882, term339882.getClass(), "trophyId", -1485411316);
        setIntField(term339882, term339882.getClass(), "cardId", 1060252673);
        setIntField(term339882, term339882.getClass(), "characterId", -2133915573);
        setIntField(term339882, term339882.getClass(), "characterVoiceNo", 1992058383);
        setIntField(term339882, term339882.getClass(), "tabSetting", 549072392);
        setIntField(term339882, term339882.getClass(), "tabSortSetting", -371064434);
        setIntField(term339882, term339882.getClass(), "cardCategorySetting", 993908229);
        setIntField(term339882, term339882.getClass(), "cardSortSetting", -47477573);
        setIntField(term339882, term339882.getClass(), "rivalScoreCategorySetting", 2130397629);
        setIntField(term339882, term339882.getClass(), "playedTutorialBit", -1026374096);
        setIntField(term339882, term339882.getClass(), "firstTutorialCancelNum", -1467572496);
        setLongField(term339882, term339882.getClass(), "sumTechHighScore", 879038142092483862L);
        setLongField(term339882, term339882.getClass(), "sumTechBasicHighScore", 118320654412415876L);
        setLongField(term339882, term339882.getClass(), "sumTechAdvancedHighScore", -3626812238746040128L);
        setLongField(term339882, term339882.getClass(), "sumTechExpertHighScore", 2269557590033958508L);
        setLongField(term339882, term339882.getClass(), "sumTechMasterHighScore", 7575137270763491440L);
        setLongField(term339882, term339882.getClass(), "sumTechLunaticHighScore", 4682797339585992801L);
        setLongField(term339882, term339882.getClass(), "sumBattleHighScore", 3052665755045997165L);
        setLongField(term339882, term339882.getClass(), "sumBattleBasicHighScore", -6584217657195233927L);
        setLongField(term339882, term339882.getClass(), "sumBattleAdvancedHighScore", 905886264759192672L);
        setLongField(term339882, term339882.getClass(), "sumBattleExpertHighScore", 419077838048388197L);
        setLongField(term339882, term339882.getClass(), "sumBattleMasterHighScore", 1714241205171656029L);
        setLongField(term339882, term339882.getClass(), "sumBattleLunaticHighScore", 6889522820995828251L);
        setField(term339882, term339882.getClass(), "eventWatchedDate", "EfdwbmFEfd");
        setField(term339882, term339882.getClass(), "cmEventWatchedDate", "VbiyNNDmFT");
        setField(term339882, term339882.getClass(), "firstGameId", "XiSUZHAmfq");
        setField(term339882, term339882.getClass(), "firstRomVersion", "RBSuIXzLQO");
        setField(term339882, term339882.getClass(), "firstDataVersion", "wHRmnBkHuv");
        setField(term339882, term339882.getClass(), "firstPlayDate", "XLxOqSFQec");
        setField(term339882, term339882.getClass(), "lastGameId", "ZYYULVvGMe");
        setField(term339882, term339882.getClass(), "lastRomVersion", "PtpYNDHLFn");
        setField(term339882, term339882.getClass(), "lastDataVersion", "yfiSeJGQTt");
        setField(term339882, term339882.getClass(), "compatibleCmVersion", "eRnfQjCPQW");
        setField(term339882, term339882.getClass(), "lastPlayDate", "WfQSpMWeNA");
        setIntField(term339882, term339882.getClass(), "lastPlaceId", 1419982330);
        setField(term339882, term339882.getClass(), "lastPlaceName", "IeCauATlRt");
        setIntField(term339882, term339882.getClass(), "lastRegionId", -2002254073);
        setField(term339882, term339882.getClass(), "lastRegionName", "ivTeWLYaUy");
        setIntField(term339882, term339882.getClass(), "lastAllNetId", -1229970686);
        setField(term339882, term339882.getClass(), "lastClientId", "IayPqIheRj");
        setIntField(term339882, term339882.getClass(), "lastUsedDeckId", 1605042048);
        setIntField(term339882, term339882.getClass(), "lastPlayMusicLevel", 512244841);
        setIntField(term339882, term339882.getClass(), "lastEmoneyBrand", -771119615);
        setField(term339880, term339880.getClass(), "user", term339882);
        setIntField(term339880, term339880.getClass(), "optionSet", 1230994097);
        setIntField(term339880, term339880.getClass(), "speed", 472304074);
        setIntField(term339880, term339880.getClass(), "mirror", 415523574);
        setIntField(term339880, term339880.getClass(), "judgeTiming", -1067868777);
        setIntField(term339880, term339880.getClass(), "judgeAdjustment", 78939779);
        setIntField(term339880, term339880.getClass(), "abort", 1570273334);
        setIntField(term339880, term339880.getClass(), "stealthField", 1165812609);
        setIntField(term339880, term339880.getClass(), "tapSound", 768847705);
        setIntField(term339880, term339880.getClass(), "volGuide", -1318830181);
        setIntField(term339880, term339880.getClass(), "volAll", -411986062);
        setIntField(term339880, term339880.getClass(), "volTap", 223396801);
        setIntField(term339880, term339880.getClass(), "volCrTap", -122362734);
        setIntField(term339880, term339880.getClass(), "volHold", -144271238);
        setIntField(term339880, term339880.getClass(), "volSide", 1424972713);
        setIntField(term339880, term339880.getClass(), "volFlick", 976032868);
        setIntField(term339880, term339880.getClass(), "volBell", -310064999);
        setIntField(term339880, term339880.getClass(), "volEnemy", -2030318903);
        setIntField(term339880, term339880.getClass(), "volSkill", -51718924);
        setIntField(term339880, term339880.getClass(), "volDamage", -117211526);
        setIntField(term339880, term339880.getClass(), "colorField", -1794673562);
        setIntField(term339880, term339880.getClass(), "colorLaneBright", 1133657429);
        setIntField(term339880, term339880.getClass(), "colorWallBright", 1175680784);
        setIntField(term339880, term339880.getClass(), "colorLane", 2123481875);
        setIntField(term339880, term339880.getClass(), "colorSide", 2097954663);
        setIntField(term339880, term339880.getClass(), "effectDamage", -770292134);
        setIntField(term339880, term339880.getClass(), "effectPos", -165812143);
        setIntField(term339880, term339880.getClass(), "judgeDisp", 758059302);
        setIntField(term339880, term339880.getClass(), "judgePos", -1305073260);
        setIntField(term339880, term339880.getClass(), "judgeBreak", -1526379005);
        setIntField(term339880, term339880.getClass(), "judgeHit", -795063337);
        setIntField(term339880, term339880.getClass(), "platinumBreakDisp", 159274420);
        setIntField(term339880, term339880.getClass(), "judgeCriticalBreak", -1122479423);
        setIntField(term339880, term339880.getClass(), "matching", 775034161);
        setIntField(term339880, term339880.getClass(), "dispPlayerLv", 1406434046);
        setIntField(term339880, term339880.getClass(), "dispRating", 674425388);
        setIntField(term339880, term339880.getClass(), "dispBP", -1882057934);
        setIntField(term339880, term339880.getClass(), "headphone", 1220551803);
        term340182 = new Integer(-1908678118);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term340182;
        callMethod(klass, "setEffectPos", argTypes, term339880, args);
    }

};


