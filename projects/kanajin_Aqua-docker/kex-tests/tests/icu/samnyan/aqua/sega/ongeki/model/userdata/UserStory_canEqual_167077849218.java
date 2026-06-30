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

public class UserStory_canEqual_167077849218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term165822;
     Object term166093;

    public UserStory_canEqual_167077849218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term165828 = new Long(8765880103547975810L);
        term165822 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserStory"));
        Object term165824 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term165826 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term165842 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term165843 = newInstance(Class.forName("java.time.LocalDate"));
        Object term165847 = newInstance(Class.forName("java.time.LocalTime"));
        Object term165852 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term165853 = newInstance(Class.forName("java.time.LocalDate"));
        Object term165857 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term165822, term165822.getClass(), "id", -4970443285956760514L);
        setLongField(term165824, term165824.getClass(), "id", -4473773331877810049L);
        setLongField(term165826, term165826.getClass(), "id", -580146737256999868L);
        setField(term165826, term165826.getClass(), "extId", term165828);
        setField(term165826, term165826.getClass(), "luid", "ubvofxfseb");
        setIntField(term165843, term165843.getClass(), "year", 2026);
        setShortField(term165843, term165843.getClass(), "month", (short) 11);
        setShortField(term165843, term165843.getClass(), "day", (short) 15);
        setField(term165842, term165842.getClass(), "date", term165843);
        setByteField(term165847, term165847.getClass(), "hour", (byte) 8);
        setByteField(term165847, term165847.getClass(), "minute", (byte) 24);
        setByteField(term165847, term165847.getClass(), "second", (byte) 53);
        setIntField(term165847, term165847.getClass(), "nano", 2108775);
        setField(term165842, term165842.getClass(), "time", term165847);
        setField(term165826, term165826.getClass(), "registerTime", term165842);
        setIntField(term165853, term165853.getClass(), "year", 2012);
        setShortField(term165853, term165853.getClass(), "month", (short) 5);
        setShortField(term165853, term165853.getClass(), "day", (short) 8);
        setField(term165852, term165852.getClass(), "date", term165853);
        setByteField(term165857, term165857.getClass(), "hour", (byte) 9);
        setByteField(term165857, term165857.getClass(), "minute", (byte) 56);
        setByteField(term165857, term165857.getClass(), "second", (byte) 42);
        setIntField(term165857, term165857.getClass(), "nano", 128569906);
        setField(term165852, term165852.getClass(), "time", term165857);
        setField(term165826, term165826.getClass(), "accessTime", term165852);
        setField(term165824, term165824.getClass(), "card", term165826);
        setField(term165824, term165824.getClass(), "userName", "tyfceKrVos");
        setIntField(term165824, term165824.getClass(), "level", -2074909519);
        setIntField(term165824, term165824.getClass(), "reincarnationNum", -1055211106);
        setLongField(term165824, term165824.getClass(), "exp", 3455894127448585088L);
        setLongField(term165824, term165824.getClass(), "point", 7664533889848969246L);
        setLongField(term165824, term165824.getClass(), "totalPoint", -9084332621876549048L);
        setIntField(term165824, term165824.getClass(), "playCount", -1730335296);
        setIntField(term165824, term165824.getClass(), "jewelCount", -891933643);
        setIntField(term165824, term165824.getClass(), "totalJewelCount", -1896713868);
        setIntField(term165824, term165824.getClass(), "medalCount", -461903855);
        setIntField(term165824, term165824.getClass(), "playerRating", -865104705);
        setIntField(term165824, term165824.getClass(), "highestRating", -871992654);
        setIntField(term165824, term165824.getClass(), "battlePoint", 2144355880);
        setIntField(term165824, term165824.getClass(), "bestBattlePoint", -1872843252);
        setIntField(term165824, term165824.getClass(), "overDamageBattlePoint", -1245312089);
        setBooleanField(term165824, term165824.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term165824, term165824.getClass(), "nameplateId", -1415132995);
        setIntField(term165824, term165824.getClass(), "trophyId", -298988561);
        setIntField(term165824, term165824.getClass(), "cardId", 83719437);
        setIntField(term165824, term165824.getClass(), "characterId", 992945340);
        setIntField(term165824, term165824.getClass(), "characterVoiceNo", -1487299154);
        setIntField(term165824, term165824.getClass(), "tabSetting", 1803636451);
        setIntField(term165824, term165824.getClass(), "tabSortSetting", -409541287);
        setIntField(term165824, term165824.getClass(), "cardCategorySetting", -294350291);
        setIntField(term165824, term165824.getClass(), "cardSortSetting", 741222064);
        setIntField(term165824, term165824.getClass(), "rivalScoreCategorySetting", -1480233398);
        setIntField(term165824, term165824.getClass(), "playedTutorialBit", 735898654);
        setIntField(term165824, term165824.getClass(), "firstTutorialCancelNum", -1440883870);
        setLongField(term165824, term165824.getClass(), "sumTechHighScore", -6009441163360803919L);
        setLongField(term165824, term165824.getClass(), "sumTechBasicHighScore", -8881477098752211725L);
        setLongField(term165824, term165824.getClass(), "sumTechAdvancedHighScore", -1861906512478722940L);
        setLongField(term165824, term165824.getClass(), "sumTechExpertHighScore", 6061874064969433300L);
        setLongField(term165824, term165824.getClass(), "sumTechMasterHighScore", 4026231818761862019L);
        setLongField(term165824, term165824.getClass(), "sumTechLunaticHighScore", -6754907102141916706L);
        setLongField(term165824, term165824.getClass(), "sumBattleHighScore", -8345234984232913153L);
        setLongField(term165824, term165824.getClass(), "sumBattleBasicHighScore", -2442368390326309307L);
        setLongField(term165824, term165824.getClass(), "sumBattleAdvancedHighScore", 7572573105910581497L);
        setLongField(term165824, term165824.getClass(), "sumBattleExpertHighScore", -6674527660526749596L);
        setLongField(term165824, term165824.getClass(), "sumBattleMasterHighScore", 1256500349564726688L);
        setLongField(term165824, term165824.getClass(), "sumBattleLunaticHighScore", -4864013709685046559L);
        setField(term165824, term165824.getClass(), "eventWatchedDate", "fvlLLikQLO");
        setField(term165824, term165824.getClass(), "cmEventWatchedDate", "TGSSYDMNWY");
        setField(term165824, term165824.getClass(), "firstGameId", "GuRcyFWnot");
        setField(term165824, term165824.getClass(), "firstRomVersion", "BWuJUuPVmd");
        setField(term165824, term165824.getClass(), "firstDataVersion", "qSBOaqyZCf");
        setField(term165824, term165824.getClass(), "firstPlayDate", "iYkstxuhcz");
        setField(term165824, term165824.getClass(), "lastGameId", "ZjUBmbXewJ");
        setField(term165824, term165824.getClass(), "lastRomVersion", "qIhzUowsTu");
        setField(term165824, term165824.getClass(), "lastDataVersion", "TzJKUbeSkU");
        setField(term165824, term165824.getClass(), "compatibleCmVersion", "lcNxBgxdPz");
        setField(term165824, term165824.getClass(), "lastPlayDate", "tCJUSNFwrz");
        setIntField(term165824, term165824.getClass(), "lastPlaceId", -1201667200);
        setField(term165824, term165824.getClass(), "lastPlaceName", "gtIsCrPlcG");
        setIntField(term165824, term165824.getClass(), "lastRegionId", -1698014200);
        setField(term165824, term165824.getClass(), "lastRegionName", "GVOpFGDgdb");
        setIntField(term165824, term165824.getClass(), "lastAllNetId", -1048905765);
        setField(term165824, term165824.getClass(), "lastClientId", "qaCabhijXy");
        setIntField(term165824, term165824.getClass(), "lastUsedDeckId", 196993945);
        setIntField(term165824, term165824.getClass(), "lastPlayMusicLevel", 1692789621);
        setIntField(term165824, term165824.getClass(), "lastEmoneyBrand", 1024925524);
        setField(term165822, term165822.getClass(), "user", term165824);
        setIntField(term165822, term165822.getClass(), "storyId", 1138562815);
        setIntField(term165822, term165822.getClass(), "lastChapterId", -1468904016);
        setIntField(term165822, term165822.getClass(), "jewelCount", -1831885121);
        setIntField(term165822, term165822.getClass(), "lastPlayMusicId", -1987064146);
        setIntField(term165822, term165822.getClass(), "lastPlayMusicCategory", 184016080);
        setIntField(term165822, term165822.getClass(), "lastPlayMusicLevel", -2083206845);
        term166093 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserStory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term166093;
        callMethod(klass, "canEqual", argTypes, term165822, args);
    }

};


