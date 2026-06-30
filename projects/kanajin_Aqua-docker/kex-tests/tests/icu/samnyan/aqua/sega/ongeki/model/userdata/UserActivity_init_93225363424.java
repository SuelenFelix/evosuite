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
import java.lang.Long;
import java.lang.Object;
import java.lang.Integer;

public class UserActivity_init_93225363424 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term293099;
     Object term293101;
     Object term293364;
     Object term293366;
     Object term293368;
     Object term293370;
     Object term293372;
     Object term293374;
     Object term293376;

    public UserActivity_init_93225363424() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term293099 = new Long(2938589450035381926L);
        Long term293105 = new Long(800893933628130392L);
        term293101 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term293103 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term293119 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term293120 = newInstance(Class.forName("java.time.LocalDate"));
        Object term293124 = newInstance(Class.forName("java.time.LocalTime"));
        Object term293129 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term293130 = newInstance(Class.forName("java.time.LocalDate"));
        Object term293134 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term293101, term293101.getClass(), "id", 206223168796316290L);
        setLongField(term293103, term293103.getClass(), "id", -8740662888614129781L);
        setField(term293103, term293103.getClass(), "extId", term293105);
        setField(term293103, term293103.getClass(), "luid", "xUMqyqCvcb");
        setIntField(term293120, term293120.getClass(), "year", 2028);
        setShortField(term293120, term293120.getClass(), "month", (short) 12);
        setShortField(term293120, term293120.getClass(), "day", (short) 27);
        setField(term293119, term293119.getClass(), "date", term293120);
        setByteField(term293124, term293124.getClass(), "hour", (byte) 11);
        setByteField(term293124, term293124.getClass(), "minute", (byte) 50);
        setByteField(term293124, term293124.getClass(), "second", (byte) 19);
        setIntField(term293124, term293124.getClass(), "nano", 442106208);
        setField(term293119, term293119.getClass(), "time", term293124);
        setField(term293103, term293103.getClass(), "registerTime", term293119);
        setIntField(term293130, term293130.getClass(), "year", 2015);
        setShortField(term293130, term293130.getClass(), "month", (short) 7);
        setShortField(term293130, term293130.getClass(), "day", (short) 7);
        setField(term293129, term293129.getClass(), "date", term293130);
        setByteField(term293134, term293134.getClass(), "hour", (byte) 12);
        setByteField(term293134, term293134.getClass(), "minute", (byte) 2);
        setByteField(term293134, term293134.getClass(), "second", (byte) 41);
        setIntField(term293134, term293134.getClass(), "nano", 584842280);
        setField(term293129, term293129.getClass(), "time", term293134);
        setField(term293103, term293103.getClass(), "accessTime", term293129);
        setField(term293101, term293101.getClass(), "card", term293103);
        setField(term293101, term293101.getClass(), "userName", "UQNPJMVgtC");
        setIntField(term293101, term293101.getClass(), "level", 1457126791);
        setIntField(term293101, term293101.getClass(), "reincarnationNum", 856920140);
        setLongField(term293101, term293101.getClass(), "exp", -3442626788324011810L);
        setLongField(term293101, term293101.getClass(), "point", 7032394804324324720L);
        setLongField(term293101, term293101.getClass(), "totalPoint", -8673026120267862876L);
        setIntField(term293101, term293101.getClass(), "playCount", -383713307);
        setIntField(term293101, term293101.getClass(), "jewelCount", -1558025995);
        setIntField(term293101, term293101.getClass(), "totalJewelCount", 1056318989);
        setIntField(term293101, term293101.getClass(), "medalCount", 334255307);
        setIntField(term293101, term293101.getClass(), "playerRating", 1723184992);
        setIntField(term293101, term293101.getClass(), "highestRating", 221967550);
        setIntField(term293101, term293101.getClass(), "battlePoint", 2081272358);
        setIntField(term293101, term293101.getClass(), "bestBattlePoint", 307424802);
        setIntField(term293101, term293101.getClass(), "overDamageBattlePoint", 2082908668);
        setBooleanField(term293101, term293101.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term293101, term293101.getClass(), "nameplateId", 1900872551);
        setIntField(term293101, term293101.getClass(), "trophyId", -1892474530);
        setIntField(term293101, term293101.getClass(), "cardId", 964981570);
        setIntField(term293101, term293101.getClass(), "characterId", 2100756755);
        setIntField(term293101, term293101.getClass(), "characterVoiceNo", -1101017120);
        setIntField(term293101, term293101.getClass(), "tabSetting", 811430983);
        setIntField(term293101, term293101.getClass(), "tabSortSetting", 382004944);
        setIntField(term293101, term293101.getClass(), "cardCategorySetting", 805654152);
        setIntField(term293101, term293101.getClass(), "cardSortSetting", -1148079165);
        setIntField(term293101, term293101.getClass(), "rivalScoreCategorySetting", 678349065);
        setIntField(term293101, term293101.getClass(), "playedTutorialBit", 1082039133);
        setIntField(term293101, term293101.getClass(), "firstTutorialCancelNum", -44112156);
        setLongField(term293101, term293101.getClass(), "sumTechHighScore", -3656837579978412253L);
        setLongField(term293101, term293101.getClass(), "sumTechBasicHighScore", 6212967653971071075L);
        setLongField(term293101, term293101.getClass(), "sumTechAdvancedHighScore", 3045243955752101750L);
        setLongField(term293101, term293101.getClass(), "sumTechExpertHighScore", -6892450534392851944L);
        setLongField(term293101, term293101.getClass(), "sumTechMasterHighScore", 7001157691841680159L);
        setLongField(term293101, term293101.getClass(), "sumTechLunaticHighScore", -3292722651808082515L);
        setLongField(term293101, term293101.getClass(), "sumBattleHighScore", -15954764981067554L);
        setLongField(term293101, term293101.getClass(), "sumBattleBasicHighScore", 5167858639284507587L);
        setLongField(term293101, term293101.getClass(), "sumBattleAdvancedHighScore", 2585021719863429092L);
        setLongField(term293101, term293101.getClass(), "sumBattleExpertHighScore", 118550826970384561L);
        setLongField(term293101, term293101.getClass(), "sumBattleMasterHighScore", 6230628803053516915L);
        setLongField(term293101, term293101.getClass(), "sumBattleLunaticHighScore", 4459794405314596811L);
        setField(term293101, term293101.getClass(), "eventWatchedDate", "YxqBgErhNo");
        setField(term293101, term293101.getClass(), "cmEventWatchedDate", "WquZFpGWYY");
        setField(term293101, term293101.getClass(), "firstGameId", "DVdLunspbQ");
        setField(term293101, term293101.getClass(), "firstRomVersion", "OUQVWAHprD");
        setField(term293101, term293101.getClass(), "firstDataVersion", "ptFvDczffY");
        setField(term293101, term293101.getClass(), "firstPlayDate", "yDXeFOuvlq");
        setField(term293101, term293101.getClass(), "lastGameId", "gvnDtiMlxS");
        setField(term293101, term293101.getClass(), "lastRomVersion", "UQbUgGUwXM");
        setField(term293101, term293101.getClass(), "lastDataVersion", "IsNPwCcyyl");
        setField(term293101, term293101.getClass(), "compatibleCmVersion", "zoWVYvefpE");
        setField(term293101, term293101.getClass(), "lastPlayDate", "qxWXWoDENr");
        setIntField(term293101, term293101.getClass(), "lastPlaceId", -809377626);
        setField(term293101, term293101.getClass(), "lastPlaceName", "mEuPBmaYON");
        setIntField(term293101, term293101.getClass(), "lastRegionId", -2106999779);
        setField(term293101, term293101.getClass(), "lastRegionName", "ObPGyohonw");
        setIntField(term293101, term293101.getClass(), "lastAllNetId", 1805397722);
        setField(term293101, term293101.getClass(), "lastClientId", "gQKUmoXhdM");
        setIntField(term293101, term293101.getClass(), "lastUsedDeckId", 1324104129);
        setIntField(term293101, term293101.getClass(), "lastPlayMusicLevel", 638311088);
        setIntField(term293101, term293101.getClass(), "lastEmoneyBrand", 1553305941);
        term293364 = new Integer(1014491466);
        term293366 = new Integer(-232797078);
        term293368 = new Integer(-907573138);
        term293370 = new Integer(533555487);
        term293372 = new Integer(270555833);
        term293374 = new Integer(-1454916925);
        term293376 = new Integer(-1348867097);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserActivity");
        Class<?>[] argTypes = new Class<?>[9];
        argTypes[0] = long.class;
        argTypes[1] = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        argTypes[5] = int.class;
        argTypes[6] = int.class;
        argTypes[7] = int.class;
        argTypes[8] = int.class;
        Object[] args = new Object[9];
        args[0] = term293099;
        args[1] = term293101;
        args[2] = term293364;
        args[3] = term293366;
        args[4] = term293368;
        args[5] = term293370;
        args[6] = term293372;
        args[7] = term293374;
        args[8] = term293376;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


