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

public class UserData_setNameplateId_127491138480 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55858;
     Object term56121;

    public UserData_setNameplateId_127491138480() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term55862 = new Long(-2255965562447970862L);
        term55858 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term55860 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term55876 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term55877 = newInstance(Class.forName("java.time.LocalDate"));
        Object term55881 = newInstance(Class.forName("java.time.LocalTime"));
        Object term55886 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term55887 = newInstance(Class.forName("java.time.LocalDate"));
        Object term55891 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term55858, term55858.getClass(), "id", -5735822732056753596L);
        setLongField(term55860, term55860.getClass(), "id", 8187221303948483835L);
        setField(term55860, term55860.getClass(), "extId", term55862);
        setField(term55860, term55860.getClass(), "luid", "QdRcxOxNSl");
        setIntField(term55877, term55877.getClass(), "year", 2027);
        setShortField(term55877, term55877.getClass(), "month", (short) 11);
        setShortField(term55877, term55877.getClass(), "day", (short) 10);
        setField(term55876, term55876.getClass(), "date", term55877);
        setByteField(term55881, term55881.getClass(), "hour", (byte) 9);
        setByteField(term55881, term55881.getClass(), "minute", (byte) 27);
        setByteField(term55881, term55881.getClass(), "second", (byte) 5);
        setIntField(term55881, term55881.getClass(), "nano", 574938581);
        setField(term55876, term55876.getClass(), "time", term55881);
        setField(term55860, term55860.getClass(), "registerTime", term55876);
        setIntField(term55887, term55887.getClass(), "year", 2011);
        setShortField(term55887, term55887.getClass(), "month", (short) 8);
        setShortField(term55887, term55887.getClass(), "day", (short) 29);
        setField(term55886, term55886.getClass(), "date", term55887);
        setByteField(term55891, term55891.getClass(), "hour", (byte) 10);
        setByteField(term55891, term55891.getClass(), "minute", (byte) 15);
        setByteField(term55891, term55891.getClass(), "second", (byte) 18);
        setIntField(term55891, term55891.getClass(), "nano", 171360352);
        setField(term55886, term55886.getClass(), "time", term55891);
        setField(term55860, term55860.getClass(), "accessTime", term55886);
        setField(term55858, term55858.getClass(), "card", term55860);
        setField(term55858, term55858.getClass(), "userName", "lvdsucnNvR");
        setIntField(term55858, term55858.getClass(), "level", -1430157795);
        setIntField(term55858, term55858.getClass(), "reincarnationNum", -1943692500);
        setLongField(term55858, term55858.getClass(), "exp", -2465500898055958051L);
        setLongField(term55858, term55858.getClass(), "point", 3840348555099491893L);
        setLongField(term55858, term55858.getClass(), "totalPoint", 4998922959033216897L);
        setIntField(term55858, term55858.getClass(), "playCount", -108045978);
        setIntField(term55858, term55858.getClass(), "jewelCount", -1242612066);
        setIntField(term55858, term55858.getClass(), "totalJewelCount", -1492896610);
        setIntField(term55858, term55858.getClass(), "medalCount", 1239212151);
        setIntField(term55858, term55858.getClass(), "playerRating", 1513817979);
        setIntField(term55858, term55858.getClass(), "highestRating", 222944981);
        setIntField(term55858, term55858.getClass(), "battlePoint", -1880135720);
        setIntField(term55858, term55858.getClass(), "bestBattlePoint", 1065058113);
        setIntField(term55858, term55858.getClass(), "overDamageBattlePoint", 159521199);
        setBooleanField(term55858, term55858.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term55858, term55858.getClass(), "nameplateId", 2020510924);
        setIntField(term55858, term55858.getClass(), "trophyId", -644848160);
        setIntField(term55858, term55858.getClass(), "cardId", -413768483);
        setIntField(term55858, term55858.getClass(), "characterId", 565614678);
        setIntField(term55858, term55858.getClass(), "characterVoiceNo", -1248504675);
        setIntField(term55858, term55858.getClass(), "tabSetting", 1366246744);
        setIntField(term55858, term55858.getClass(), "tabSortSetting", -369295588);
        setIntField(term55858, term55858.getClass(), "cardCategorySetting", 728215296);
        setIntField(term55858, term55858.getClass(), "cardSortSetting", -1236147031);
        setIntField(term55858, term55858.getClass(), "rivalScoreCategorySetting", 2030051112);
        setIntField(term55858, term55858.getClass(), "playedTutorialBit", 1023614449);
        setIntField(term55858, term55858.getClass(), "firstTutorialCancelNum", -717220010);
        setLongField(term55858, term55858.getClass(), "sumTechHighScore", 2782559589071225543L);
        setLongField(term55858, term55858.getClass(), "sumTechBasicHighScore", -3924790970169443418L);
        setLongField(term55858, term55858.getClass(), "sumTechAdvancedHighScore", -1803333754619597089L);
        setLongField(term55858, term55858.getClass(), "sumTechExpertHighScore", -572086959828885449L);
        setLongField(term55858, term55858.getClass(), "sumTechMasterHighScore", -5605174994139612712L);
        setLongField(term55858, term55858.getClass(), "sumTechLunaticHighScore", -5580906279881288806L);
        setLongField(term55858, term55858.getClass(), "sumBattleHighScore", -4821939044127073567L);
        setLongField(term55858, term55858.getClass(), "sumBattleBasicHighScore", 5690319333104320494L);
        setLongField(term55858, term55858.getClass(), "sumBattleAdvancedHighScore", 3924949950728854492L);
        setLongField(term55858, term55858.getClass(), "sumBattleExpertHighScore", -935483464256316780L);
        setLongField(term55858, term55858.getClass(), "sumBattleMasterHighScore", 8155420036739278471L);
        setLongField(term55858, term55858.getClass(), "sumBattleLunaticHighScore", 5083842693203849201L);
        setField(term55858, term55858.getClass(), "eventWatchedDate", "mSjSKfeMUn");
        setField(term55858, term55858.getClass(), "cmEventWatchedDate", "nVXCBYnEcg");
        setField(term55858, term55858.getClass(), "firstGameId", "fcLnKXxzfM");
        setField(term55858, term55858.getClass(), "firstRomVersion", "FtyaWnfsgn");
        setField(term55858, term55858.getClass(), "firstDataVersion", "qphbpPdwrD");
        setField(term55858, term55858.getClass(), "firstPlayDate", "xHdHafzFSM");
        setField(term55858, term55858.getClass(), "lastGameId", "fAsiOEKVaH");
        setField(term55858, term55858.getClass(), "lastRomVersion", "EltrILhEwT");
        setField(term55858, term55858.getClass(), "lastDataVersion", "wCcSeUJzhg");
        setField(term55858, term55858.getClass(), "compatibleCmVersion", "HlVHAsOBmJ");
        setField(term55858, term55858.getClass(), "lastPlayDate", "nyThJEXHhd");
        setIntField(term55858, term55858.getClass(), "lastPlaceId", 280068573);
        setField(term55858, term55858.getClass(), "lastPlaceName", "TRfRRMMCZw");
        setIntField(term55858, term55858.getClass(), "lastRegionId", -1081530515);
        setField(term55858, term55858.getClass(), "lastRegionName", "rwbfUcOMVc");
        setIntField(term55858, term55858.getClass(), "lastAllNetId", 492096339);
        setField(term55858, term55858.getClass(), "lastClientId", "ljTkNgJRUl");
        setIntField(term55858, term55858.getClass(), "lastUsedDeckId", -1679827671);
        setIntField(term55858, term55858.getClass(), "lastPlayMusicLevel", 932019255);
        setIntField(term55858, term55858.getClass(), "lastEmoneyBrand", 1939661233);
        term56121 = new Integer(-485147289);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term56121;
        callMethod(klass, "setNameplateId", argTypes, term55858, args);
    }

};


