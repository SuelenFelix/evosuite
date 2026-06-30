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

public class UserMusicItem_getId_17242328331 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term424;

    public UserMusicItem_getId_17242328331() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term430 = new Long(6375119433582206027L);
        term424 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicItem"));
        Object term426 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term428 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term444 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term445 = newInstance(Class.forName("java.time.LocalDate"));
        Object term449 = newInstance(Class.forName("java.time.LocalTime"));
        Object term454 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term455 = newInstance(Class.forName("java.time.LocalDate"));
        Object term459 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term424, term424.getClass(), "id", 5127676408959197577L);
        setLongField(term426, term426.getClass(), "id", -6573104506744284592L);
        setLongField(term428, term428.getClass(), "id", -4920224193275732920L);
        setField(term428, term428.getClass(), "extId", term430);
        setField(term428, term428.getClass(), "luid", "ZiaGIbnzTs");
        setIntField(term445, term445.getClass(), "year", 2015);
        setShortField(term445, term445.getClass(), "month", (short) 9);
        setShortField(term445, term445.getClass(), "day", (short) 19);
        setField(term444, term444.getClass(), "date", term445);
        setByteField(term449, term449.getClass(), "hour", (byte) 9);
        setByteField(term449, term449.getClass(), "minute", (byte) 4);
        setByteField(term449, term449.getClass(), "second", (byte) 10);
        setIntField(term449, term449.getClass(), "nano", 401765865);
        setField(term444, term444.getClass(), "time", term449);
        setField(term428, term428.getClass(), "registerTime", term444);
        setIntField(term455, term455.getClass(), "year", 2015);
        setShortField(term455, term455.getClass(), "month", (short) 4);
        setShortField(term455, term455.getClass(), "day", (short) 14);
        setField(term454, term454.getClass(), "date", term455);
        setByteField(term459, term459.getClass(), "hour", (byte) 18);
        setByteField(term459, term459.getClass(), "minute", (byte) 24);
        setByteField(term459, term459.getClass(), "second", (byte) 32);
        setIntField(term459, term459.getClass(), "nano", 369233818);
        setField(term454, term454.getClass(), "time", term459);
        setField(term428, term428.getClass(), "accessTime", term454);
        setField(term426, term426.getClass(), "card", term428);
        setField(term426, term426.getClass(), "userName", "tbcdzjIfER");
        setIntField(term426, term426.getClass(), "level", -244121226);
        setIntField(term426, term426.getClass(), "reincarnationNum", -203030934);
        setLongField(term426, term426.getClass(), "exp", 8428634514691209827L);
        setLongField(term426, term426.getClass(), "point", -2585684163342970173L);
        setLongField(term426, term426.getClass(), "totalPoint", 8059786003080744426L);
        setIntField(term426, term426.getClass(), "playCount", -1179120542);
        setIntField(term426, term426.getClass(), "jewelCount", -73683645);
        setIntField(term426, term426.getClass(), "totalJewelCount", -226514366);
        setIntField(term426, term426.getClass(), "medalCount", 1193880199);
        setIntField(term426, term426.getClass(), "playerRating", -1087774327);
        setIntField(term426, term426.getClass(), "highestRating", -1530420153);
        setIntField(term426, term426.getClass(), "battlePoint", -469968304);
        setIntField(term426, term426.getClass(), "bestBattlePoint", -1145578966);
        setIntField(term426, term426.getClass(), "overDamageBattlePoint", 679763016);
        setBooleanField(term426, term426.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term426, term426.getClass(), "nameplateId", 1962444399);
        setIntField(term426, term426.getClass(), "trophyId", 767834723);
        setIntField(term426, term426.getClass(), "cardId", -602026508);
        setIntField(term426, term426.getClass(), "characterId", -157887805);
        setIntField(term426, term426.getClass(), "characterVoiceNo", 1876565163);
        setIntField(term426, term426.getClass(), "tabSetting", -817164822);
        setIntField(term426, term426.getClass(), "tabSortSetting", -1016503459);
        setIntField(term426, term426.getClass(), "cardCategorySetting", -1968847291);
        setIntField(term426, term426.getClass(), "cardSortSetting", 579005622);
        setIntField(term426, term426.getClass(), "rivalScoreCategorySetting", -14890619);
        setIntField(term426, term426.getClass(), "playedTutorialBit", 1632125673);
        setIntField(term426, term426.getClass(), "firstTutorialCancelNum", 454281060);
        setLongField(term426, term426.getClass(), "sumTechHighScore", -4365849114644724155L);
        setLongField(term426, term426.getClass(), "sumTechBasicHighScore", 2486810210675247493L);
        setLongField(term426, term426.getClass(), "sumTechAdvancedHighScore", 7009926388951271268L);
        setLongField(term426, term426.getClass(), "sumTechExpertHighScore", -7672528020740371001L);
        setLongField(term426, term426.getClass(), "sumTechMasterHighScore", -4502405999831680926L);
        setLongField(term426, term426.getClass(), "sumTechLunaticHighScore", 1967728129628047933L);
        setLongField(term426, term426.getClass(), "sumBattleHighScore", 2120084523938730454L);
        setLongField(term426, term426.getClass(), "sumBattleBasicHighScore", 6855071767938501807L);
        setLongField(term426, term426.getClass(), "sumBattleAdvancedHighScore", -5892135042702373494L);
        setLongField(term426, term426.getClass(), "sumBattleExpertHighScore", 5262507301787091109L);
        setLongField(term426, term426.getClass(), "sumBattleMasterHighScore", -6823727938421990489L);
        setLongField(term426, term426.getClass(), "sumBattleLunaticHighScore", -484994522244390100L);
        setField(term426, term426.getClass(), "eventWatchedDate", "HyxfbSQYBe");
        setField(term426, term426.getClass(), "cmEventWatchedDate", "pCTimMblYc");
        setField(term426, term426.getClass(), "firstGameId", "hNxWaHcfhY");
        setField(term426, term426.getClass(), "firstRomVersion", "RkybSrpybU");
        setField(term426, term426.getClass(), "firstDataVersion", "xOEqzGAmDU");
        setField(term426, term426.getClass(), "firstPlayDate", "eZFUvlxvGV");
        setField(term426, term426.getClass(), "lastGameId", "BYqFIqCKAV");
        setField(term426, term426.getClass(), "lastRomVersion", "vrQLuWIDJX");
        setField(term426, term426.getClass(), "lastDataVersion", "flxyYxBRtu");
        setField(term426, term426.getClass(), "compatibleCmVersion", "OclPbYPkcH");
        setField(term426, term426.getClass(), "lastPlayDate", "IoAlmYsBwc");
        setIntField(term426, term426.getClass(), "lastPlaceId", -1786399638);
        setField(term426, term426.getClass(), "lastPlaceName", "TEParAifyi");
        setIntField(term426, term426.getClass(), "lastRegionId", 2055867847);
        setField(term426, term426.getClass(), "lastRegionName", "OWDIEULEFu");
        setIntField(term426, term426.getClass(), "lastAllNetId", -1048298087);
        setField(term426, term426.getClass(), "lastClientId", "dWRymuLBtr");
        setIntField(term426, term426.getClass(), "lastUsedDeckId", 292681826);
        setIntField(term426, term426.getClass(), "lastPlayMusicLevel", 458147407);
        setIntField(term426, term426.getClass(), "lastEmoneyBrand", -184153539);
        setField(term424, term424.getClass(), "user", term426);
        setIntField(term424, term424.getClass(), "musicId", 493620644);
        setIntField(term424, term424.getClass(), "status", 1328271830);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term424, args);
    }

};


