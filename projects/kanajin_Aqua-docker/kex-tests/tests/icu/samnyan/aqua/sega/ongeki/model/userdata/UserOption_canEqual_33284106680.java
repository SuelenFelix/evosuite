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

public class UserOption_canEqual_33284106680 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term345911;
     Object term346213;

    public UserOption_canEqual_33284106680() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term345917 = new Long(-6657309314982735134L);
        term345911 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption"));
        Object term345913 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term345915 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term345931 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term345932 = newInstance(Class.forName("java.time.LocalDate"));
        Object term345936 = newInstance(Class.forName("java.time.LocalTime"));
        Object term345941 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term345942 = newInstance(Class.forName("java.time.LocalDate"));
        Object term345946 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term345911, term345911.getClass(), "id", 3774176686635912888L);
        setLongField(term345913, term345913.getClass(), "id", -7932968043854505693L);
        setLongField(term345915, term345915.getClass(), "id", -2170865537216433956L);
        setField(term345915, term345915.getClass(), "extId", term345917);
        setField(term345915, term345915.getClass(), "luid", "uMQMSzFzJe");
        setIntField(term345932, term345932.getClass(), "year", 2014);
        setShortField(term345932, term345932.getClass(), "month", (short) 12);
        setShortField(term345932, term345932.getClass(), "day", (short) 2);
        setField(term345931, term345931.getClass(), "date", term345932);
        setByteField(term345936, term345936.getClass(), "hour", (byte) 6);
        setByteField(term345936, term345936.getClass(), "minute", (byte) 19);
        setByteField(term345936, term345936.getClass(), "second", (byte) 32);
        setIntField(term345936, term345936.getClass(), "nano", 912349578);
        setField(term345931, term345931.getClass(), "time", term345936);
        setField(term345915, term345915.getClass(), "registerTime", term345931);
        setIntField(term345942, term345942.getClass(), "year", 2012);
        setShortField(term345942, term345942.getClass(), "month", (short) 5);
        setShortField(term345942, term345942.getClass(), "day", (short) 22);
        setField(term345941, term345941.getClass(), "date", term345942);
        setByteField(term345946, term345946.getClass(), "hour", (byte) 23);
        setByteField(term345946, term345946.getClass(), "minute", (byte) 10);
        setByteField(term345946, term345946.getClass(), "second", (byte) 13);
        setIntField(term345946, term345946.getClass(), "nano", 585273851);
        setField(term345941, term345941.getClass(), "time", term345946);
        setField(term345915, term345915.getClass(), "accessTime", term345941);
        setField(term345913, term345913.getClass(), "card", term345915);
        setField(term345913, term345913.getClass(), "userName", "XkKAHDYtRx");
        setIntField(term345913, term345913.getClass(), "level", 2111155870);
        setIntField(term345913, term345913.getClass(), "reincarnationNum", -1212199958);
        setLongField(term345913, term345913.getClass(), "exp", 5952257413296711289L);
        setLongField(term345913, term345913.getClass(), "point", -7421969647145466885L);
        setLongField(term345913, term345913.getClass(), "totalPoint", -8114807847084151379L);
        setIntField(term345913, term345913.getClass(), "playCount", -17156620);
        setIntField(term345913, term345913.getClass(), "jewelCount", 1035486061);
        setIntField(term345913, term345913.getClass(), "totalJewelCount", -61511771);
        setIntField(term345913, term345913.getClass(), "medalCount", -2091211182);
        setIntField(term345913, term345913.getClass(), "playerRating", -1089395185);
        setIntField(term345913, term345913.getClass(), "highestRating", 91597068);
        setIntField(term345913, term345913.getClass(), "battlePoint", -827122687);
        setIntField(term345913, term345913.getClass(), "bestBattlePoint", -389628664);
        setIntField(term345913, term345913.getClass(), "overDamageBattlePoint", -500289334);
        setBooleanField(term345913, term345913.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term345913, term345913.getClass(), "nameplateId", -825119915);
        setIntField(term345913, term345913.getClass(), "trophyId", 1551858482);
        setIntField(term345913, term345913.getClass(), "cardId", -385229935);
        setIntField(term345913, term345913.getClass(), "characterId", 1482152184);
        setIntField(term345913, term345913.getClass(), "characterVoiceNo", 1499591192);
        setIntField(term345913, term345913.getClass(), "tabSetting", 1900142480);
        setIntField(term345913, term345913.getClass(), "tabSortSetting", 446525078);
        setIntField(term345913, term345913.getClass(), "cardCategorySetting", 505748531);
        setIntField(term345913, term345913.getClass(), "cardSortSetting", -2087175082);
        setIntField(term345913, term345913.getClass(), "rivalScoreCategorySetting", 822598782);
        setIntField(term345913, term345913.getClass(), "playedTutorialBit", -197113842);
        setIntField(term345913, term345913.getClass(), "firstTutorialCancelNum", 179097140);
        setLongField(term345913, term345913.getClass(), "sumTechHighScore", 191632039447731108L);
        setLongField(term345913, term345913.getClass(), "sumTechBasicHighScore", 2659354808314956433L);
        setLongField(term345913, term345913.getClass(), "sumTechAdvancedHighScore", -1171046233711835438L);
        setLongField(term345913, term345913.getClass(), "sumTechExpertHighScore", -6935606967541681445L);
        setLongField(term345913, term345913.getClass(), "sumTechMasterHighScore", 7340761448437101168L);
        setLongField(term345913, term345913.getClass(), "sumTechLunaticHighScore", 9014198132504020555L);
        setLongField(term345913, term345913.getClass(), "sumBattleHighScore", 6242719009573711902L);
        setLongField(term345913, term345913.getClass(), "sumBattleBasicHighScore", -503156403359859437L);
        setLongField(term345913, term345913.getClass(), "sumBattleAdvancedHighScore", 2766463982050878773L);
        setLongField(term345913, term345913.getClass(), "sumBattleExpertHighScore", 4809740725519997042L);
        setLongField(term345913, term345913.getClass(), "sumBattleMasterHighScore", 5914254749573899784L);
        setLongField(term345913, term345913.getClass(), "sumBattleLunaticHighScore", -2184872780386305631L);
        setField(term345913, term345913.getClass(), "eventWatchedDate", "OQKfqoyvDC");
        setField(term345913, term345913.getClass(), "cmEventWatchedDate", "BkVqpsLSht");
        setField(term345913, term345913.getClass(), "firstGameId", "lLOMgLjGQO");
        setField(term345913, term345913.getClass(), "firstRomVersion", "GCtSacRpUA");
        setField(term345913, term345913.getClass(), "firstDataVersion", "JVfDXmoTtQ");
        setField(term345913, term345913.getClass(), "firstPlayDate", "GCdVTQIvhS");
        setField(term345913, term345913.getClass(), "lastGameId", "cDMjKpBqug");
        setField(term345913, term345913.getClass(), "lastRomVersion", "nPoWdvLVJk");
        setField(term345913, term345913.getClass(), "lastDataVersion", "PJZSvisrOr");
        setField(term345913, term345913.getClass(), "compatibleCmVersion", "MBtdiVGKPd");
        setField(term345913, term345913.getClass(), "lastPlayDate", "DVDTdaDKVX");
        setIntField(term345913, term345913.getClass(), "lastPlaceId", 254393089);
        setField(term345913, term345913.getClass(), "lastPlaceName", "FveHsENglh");
        setIntField(term345913, term345913.getClass(), "lastRegionId", 950205408);
        setField(term345913, term345913.getClass(), "lastRegionName", "NIeHFkZeJc");
        setIntField(term345913, term345913.getClass(), "lastAllNetId", 1046905244);
        setField(term345913, term345913.getClass(), "lastClientId", "swmcBYbxZS");
        setIntField(term345913, term345913.getClass(), "lastUsedDeckId", 230610277);
        setIntField(term345913, term345913.getClass(), "lastPlayMusicLevel", -1135946747);
        setIntField(term345913, term345913.getClass(), "lastEmoneyBrand", 654335690);
        setField(term345911, term345911.getClass(), "user", term345913);
        setIntField(term345911, term345911.getClass(), "optionSet", -2049269451);
        setIntField(term345911, term345911.getClass(), "speed", -996401996);
        setIntField(term345911, term345911.getClass(), "mirror", -1498050165);
        setIntField(term345911, term345911.getClass(), "judgeTiming", -1953680007);
        setIntField(term345911, term345911.getClass(), "judgeAdjustment", 221897733);
        setIntField(term345911, term345911.getClass(), "abort", -1185198422);
        setIntField(term345911, term345911.getClass(), "stealthField", -1844362885);
        setIntField(term345911, term345911.getClass(), "tapSound", 223756934);
        setIntField(term345911, term345911.getClass(), "volGuide", -785394797);
        setIntField(term345911, term345911.getClass(), "volAll", 1836428731);
        setIntField(term345911, term345911.getClass(), "volTap", 934676803);
        setIntField(term345911, term345911.getClass(), "volCrTap", 1858067800);
        setIntField(term345911, term345911.getClass(), "volHold", 1257474338);
        setIntField(term345911, term345911.getClass(), "volSide", -1948738081);
        setIntField(term345911, term345911.getClass(), "volFlick", -2043711017);
        setIntField(term345911, term345911.getClass(), "volBell", 1838622682);
        setIntField(term345911, term345911.getClass(), "volEnemy", -406109350);
        setIntField(term345911, term345911.getClass(), "volSkill", 797815649);
        setIntField(term345911, term345911.getClass(), "volDamage", 931999736);
        setIntField(term345911, term345911.getClass(), "colorField", -300651667);
        setIntField(term345911, term345911.getClass(), "colorLaneBright", -1048497625);
        setIntField(term345911, term345911.getClass(), "colorWallBright", 181689078);
        setIntField(term345911, term345911.getClass(), "colorLane", -826168137);
        setIntField(term345911, term345911.getClass(), "colorSide", 477221152);
        setIntField(term345911, term345911.getClass(), "effectDamage", 1023319265);
        setIntField(term345911, term345911.getClass(), "effectPos", -1264226544);
        setIntField(term345911, term345911.getClass(), "judgeDisp", 1380061756);
        setIntField(term345911, term345911.getClass(), "judgePos", 1798891806);
        setIntField(term345911, term345911.getClass(), "judgeBreak", 1878050477);
        setIntField(term345911, term345911.getClass(), "judgeHit", 1498041972);
        setIntField(term345911, term345911.getClass(), "platinumBreakDisp", 1662247107);
        setIntField(term345911, term345911.getClass(), "judgeCriticalBreak", 1872541031);
        setIntField(term345911, term345911.getClass(), "matching", -827509470);
        setIntField(term345911, term345911.getClass(), "dispPlayerLv", 859195402);
        setIntField(term345911, term345911.getClass(), "dispRating", 1202737127);
        setIntField(term345911, term345911.getClass(), "dispBP", 1885154242);
        setIntField(term345911, term345911.getClass(), "headphone", -826196689);
        term346213 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term346213;
        callMethod(klass, "canEqual", argTypes, term345911, args);
    }

};


