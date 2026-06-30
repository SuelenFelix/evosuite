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

public class UserMemoryChapter_isDialogWatched_8914233708 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term392386;

    public UserMemoryChapter_isDialogWatched_8914233708() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term392392 = new Long(2014229530618878786L);
        term392386 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMemoryChapter"));
        Object term392388 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term392390 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term392406 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term392407 = newInstance(Class.forName("java.time.LocalDate"));
        Object term392411 = newInstance(Class.forName("java.time.LocalTime"));
        Object term392416 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term392417 = newInstance(Class.forName("java.time.LocalDate"));
        Object term392421 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term392386, term392386.getClass(), "id", 8117629111081773240L);
        setLongField(term392388, term392388.getClass(), "id", -6364270156186231848L);
        setLongField(term392390, term392390.getClass(), "id", 9079628325284052434L);
        setField(term392390, term392390.getClass(), "extId", term392392);
        setField(term392390, term392390.getClass(), "luid", "hDOPqcsRKr");
        setIntField(term392407, term392407.getClass(), "year", 2017);
        setShortField(term392407, term392407.getClass(), "month", (short) 3);
        setShortField(term392407, term392407.getClass(), "day", (short) 23);
        setField(term392406, term392406.getClass(), "date", term392407);
        setByteField(term392411, term392411.getClass(), "hour", (byte) 14);
        setByteField(term392411, term392411.getClass(), "minute", (byte) 30);
        setByteField(term392411, term392411.getClass(), "second", (byte) 28);
        setIntField(term392411, term392411.getClass(), "nano", 739068464);
        setField(term392406, term392406.getClass(), "time", term392411);
        setField(term392390, term392390.getClass(), "registerTime", term392406);
        setIntField(term392417, term392417.getClass(), "year", 2023);
        setShortField(term392417, term392417.getClass(), "month", (short) 11);
        setShortField(term392417, term392417.getClass(), "day", (short) 19);
        setField(term392416, term392416.getClass(), "date", term392417);
        setByteField(term392421, term392421.getClass(), "hour", (byte) 5);
        setByteField(term392421, term392421.getClass(), "minute", (byte) 30);
        setByteField(term392421, term392421.getClass(), "second", (byte) 37);
        setIntField(term392421, term392421.getClass(), "nano", 59042636);
        setField(term392416, term392416.getClass(), "time", term392421);
        setField(term392390, term392390.getClass(), "accessTime", term392416);
        setField(term392388, term392388.getClass(), "card", term392390);
        setField(term392388, term392388.getClass(), "userName", "pcUuDIzHpb");
        setIntField(term392388, term392388.getClass(), "level", 859230585);
        setIntField(term392388, term392388.getClass(), "reincarnationNum", -78047892);
        setLongField(term392388, term392388.getClass(), "exp", 225362301391781209L);
        setLongField(term392388, term392388.getClass(), "point", 3617115730171050714L);
        setLongField(term392388, term392388.getClass(), "totalPoint", 6497582195726114729L);
        setIntField(term392388, term392388.getClass(), "playCount", 1099196013);
        setIntField(term392388, term392388.getClass(), "jewelCount", 1302436565);
        setIntField(term392388, term392388.getClass(), "totalJewelCount", 363252512);
        setIntField(term392388, term392388.getClass(), "medalCount", 1839293852);
        setIntField(term392388, term392388.getClass(), "playerRating", -583004668);
        setIntField(term392388, term392388.getClass(), "highestRating", -1997710193);
        setIntField(term392388, term392388.getClass(), "battlePoint", 621445525);
        setIntField(term392388, term392388.getClass(), "bestBattlePoint", 201279470);
        setIntField(term392388, term392388.getClass(), "overDamageBattlePoint", -1459206354);
        setBooleanField(term392388, term392388.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term392388, term392388.getClass(), "nameplateId", -802451635);
        setIntField(term392388, term392388.getClass(), "trophyId", 1517257747);
        setIntField(term392388, term392388.getClass(), "cardId", -746412108);
        setIntField(term392388, term392388.getClass(), "characterId", 889758178);
        setIntField(term392388, term392388.getClass(), "characterVoiceNo", 1428193287);
        setIntField(term392388, term392388.getClass(), "tabSetting", -558955578);
        setIntField(term392388, term392388.getClass(), "tabSortSetting", -278381298);
        setIntField(term392388, term392388.getClass(), "cardCategorySetting", 1198095393);
        setIntField(term392388, term392388.getClass(), "cardSortSetting", -1356305520);
        setIntField(term392388, term392388.getClass(), "rivalScoreCategorySetting", -615834996);
        setIntField(term392388, term392388.getClass(), "playedTutorialBit", -1449867685);
        setIntField(term392388, term392388.getClass(), "firstTutorialCancelNum", -2059292582);
        setLongField(term392388, term392388.getClass(), "sumTechHighScore", -3214348502059634465L);
        setLongField(term392388, term392388.getClass(), "sumTechBasicHighScore", -1505397547266367181L);
        setLongField(term392388, term392388.getClass(), "sumTechAdvancedHighScore", 2243354548018435980L);
        setLongField(term392388, term392388.getClass(), "sumTechExpertHighScore", 511935443347160104L);
        setLongField(term392388, term392388.getClass(), "sumTechMasterHighScore", 620320792988185737L);
        setLongField(term392388, term392388.getClass(), "sumTechLunaticHighScore", -5794386543936842110L);
        setLongField(term392388, term392388.getClass(), "sumBattleHighScore", 5545591278736168224L);
        setLongField(term392388, term392388.getClass(), "sumBattleBasicHighScore", -5531478394066203067L);
        setLongField(term392388, term392388.getClass(), "sumBattleAdvancedHighScore", 7795568939646221859L);
        setLongField(term392388, term392388.getClass(), "sumBattleExpertHighScore", -5078431915868355065L);
        setLongField(term392388, term392388.getClass(), "sumBattleMasterHighScore", 6735596149732177421L);
        setLongField(term392388, term392388.getClass(), "sumBattleLunaticHighScore", -4388921639678593613L);
        setField(term392388, term392388.getClass(), "eventWatchedDate", "cbEqcfAiVu");
        setField(term392388, term392388.getClass(), "cmEventWatchedDate", "lJgxCBLHFM");
        setField(term392388, term392388.getClass(), "firstGameId", "AMJhKACfge");
        setField(term392388, term392388.getClass(), "firstRomVersion", "ojirbuIOdW");
        setField(term392388, term392388.getClass(), "firstDataVersion", "GBtmoSoIuB");
        setField(term392388, term392388.getClass(), "firstPlayDate", "LOqdJRaXPm");
        setField(term392388, term392388.getClass(), "lastGameId", "iFmgidNTpy");
        setField(term392388, term392388.getClass(), "lastRomVersion", "ILeEQwQBZy");
        setField(term392388, term392388.getClass(), "lastDataVersion", "RPGGLeBsra");
        setField(term392388, term392388.getClass(), "compatibleCmVersion", "nlwCqQVEZc");
        setField(term392388, term392388.getClass(), "lastPlayDate", "GZxxphcsJI");
        setIntField(term392388, term392388.getClass(), "lastPlaceId", 1770034991);
        setField(term392388, term392388.getClass(), "lastPlaceName", "UmQkCFzvDC");
        setIntField(term392388, term392388.getClass(), "lastRegionId", -1139590657);
        setField(term392388, term392388.getClass(), "lastRegionName", "WFsvWcdxyE");
        setIntField(term392388, term392388.getClass(), "lastAllNetId", -385489684);
        setField(term392388, term392388.getClass(), "lastClientId", "huVhrFhAXC");
        setIntField(term392388, term392388.getClass(), "lastUsedDeckId", 1021855248);
        setIntField(term392388, term392388.getClass(), "lastPlayMusicLevel", -1682907538);
        setIntField(term392388, term392388.getClass(), "lastEmoneyBrand", -2131622221);
        setField(term392386, term392386.getClass(), "user", term392388);
        setIntField(term392386, term392386.getClass(), "chapterId", 338137338);
        setIntField(term392386, term392386.getClass(), "jewelCount", 124913849);
        setIntField(term392386, term392386.getClass(), "lastPlayMusicCategory", 547342897);
        setIntField(term392386, term392386.getClass(), "lastPlayMusicId", -593026116);
        setIntField(term392386, term392386.getClass(), "lastPlayMusicLevel", 678975706);
        setBooleanField(term392386, term392386.getClass(), "isDialogWatched", true);
        setBooleanField(term392386, term392386.getClass(), "isStoryWatched", false);
        setBooleanField(term392386, term392386.getClass(), "isBossWatched", true);
        setBooleanField(term392386, term392386.getClass(), "isClear", true);
        setIntField(term392386, term392386.getClass(), "gaugeId", -967235351);
        setIntField(term392386, term392386.getClass(), "gaugeNum", -152533751);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMemoryChapter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isDialogWatched", argTypes, term392386, args);
    }

};


