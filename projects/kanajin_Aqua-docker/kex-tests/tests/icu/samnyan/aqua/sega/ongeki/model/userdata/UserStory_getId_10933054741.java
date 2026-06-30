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

public class UserStory_getId_10933054741 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term158057;

    public UserStory_getId_10933054741() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term158063 = new Long(-7205236974351118210L);
        term158057 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserStory"));
        Object term158059 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term158061 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term158077 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term158078 = newInstance(Class.forName("java.time.LocalDate"));
        Object term158082 = newInstance(Class.forName("java.time.LocalTime"));
        Object term158087 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term158088 = newInstance(Class.forName("java.time.LocalDate"));
        Object term158092 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term158057, term158057.getClass(), "id", -4353084055559864019L);
        setLongField(term158059, term158059.getClass(), "id", -8799574851656203932L);
        setLongField(term158061, term158061.getClass(), "id", 9119196902802481035L);
        setField(term158061, term158061.getClass(), "extId", term158063);
        setField(term158061, term158061.getClass(), "luid", "ObBNcwkdKb");
        setIntField(term158078, term158078.getClass(), "year", 2021);
        setShortField(term158078, term158078.getClass(), "month", (short) 2);
        setShortField(term158078, term158078.getClass(), "day", (short) 24);
        setField(term158077, term158077.getClass(), "date", term158078);
        setByteField(term158082, term158082.getClass(), "hour", (byte) 2);
        setByteField(term158082, term158082.getClass(), "minute", (byte) 4);
        setByteField(term158082, term158082.getClass(), "second", (byte) 26);
        setIntField(term158082, term158082.getClass(), "nano", 423826252);
        setField(term158077, term158077.getClass(), "time", term158082);
        setField(term158061, term158061.getClass(), "registerTime", term158077);
        setIntField(term158088, term158088.getClass(), "year", 2017);
        setShortField(term158088, term158088.getClass(), "month", (short) 8);
        setShortField(term158088, term158088.getClass(), "day", (short) 15);
        setField(term158087, term158087.getClass(), "date", term158088);
        setByteField(term158092, term158092.getClass(), "hour", (byte) 7);
        setByteField(term158092, term158092.getClass(), "minute", (byte) 47);
        setByteField(term158092, term158092.getClass(), "second", (byte) 20);
        setIntField(term158092, term158092.getClass(), "nano", 749374038);
        setField(term158087, term158087.getClass(), "time", term158092);
        setField(term158061, term158061.getClass(), "accessTime", term158087);
        setField(term158059, term158059.getClass(), "card", term158061);
        setField(term158059, term158059.getClass(), "userName", "bbKtLbiXSm");
        setIntField(term158059, term158059.getClass(), "level", 1546600239);
        setIntField(term158059, term158059.getClass(), "reincarnationNum", -1396225638);
        setLongField(term158059, term158059.getClass(), "exp", 4931009322006466376L);
        setLongField(term158059, term158059.getClass(), "point", -8335387959910631302L);
        setLongField(term158059, term158059.getClass(), "totalPoint", 4470484728975762932L);
        setIntField(term158059, term158059.getClass(), "playCount", -241102183);
        setIntField(term158059, term158059.getClass(), "jewelCount", -1633122154);
        setIntField(term158059, term158059.getClass(), "totalJewelCount", 1017124411);
        setIntField(term158059, term158059.getClass(), "medalCount", -1833430963);
        setIntField(term158059, term158059.getClass(), "playerRating", -1688592299);
        setIntField(term158059, term158059.getClass(), "highestRating", 1835314181);
        setIntField(term158059, term158059.getClass(), "battlePoint", 990656402);
        setIntField(term158059, term158059.getClass(), "bestBattlePoint", -105353462);
        setIntField(term158059, term158059.getClass(), "overDamageBattlePoint", 1445070014);
        setBooleanField(term158059, term158059.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term158059, term158059.getClass(), "nameplateId", -2066241981);
        setIntField(term158059, term158059.getClass(), "trophyId", -891786731);
        setIntField(term158059, term158059.getClass(), "cardId", -807543898);
        setIntField(term158059, term158059.getClass(), "characterId", -1643992590);
        setIntField(term158059, term158059.getClass(), "characterVoiceNo", 1617077670);
        setIntField(term158059, term158059.getClass(), "tabSetting", 2071351288);
        setIntField(term158059, term158059.getClass(), "tabSortSetting", 1713974544);
        setIntField(term158059, term158059.getClass(), "cardCategorySetting", 1347754720);
        setIntField(term158059, term158059.getClass(), "cardSortSetting", -1244357131);
        setIntField(term158059, term158059.getClass(), "rivalScoreCategorySetting", -1253293420);
        setIntField(term158059, term158059.getClass(), "playedTutorialBit", -1372607343);
        setIntField(term158059, term158059.getClass(), "firstTutorialCancelNum", -1259276992);
        setLongField(term158059, term158059.getClass(), "sumTechHighScore", -5400620616344659195L);
        setLongField(term158059, term158059.getClass(), "sumTechBasicHighScore", 3658867409065185810L);
        setLongField(term158059, term158059.getClass(), "sumTechAdvancedHighScore", 4167680443067684492L);
        setLongField(term158059, term158059.getClass(), "sumTechExpertHighScore", -1861554319067695362L);
        setLongField(term158059, term158059.getClass(), "sumTechMasterHighScore", -8812663182485143537L);
        setLongField(term158059, term158059.getClass(), "sumTechLunaticHighScore", 7890865761493819305L);
        setLongField(term158059, term158059.getClass(), "sumBattleHighScore", 5591213151956322219L);
        setLongField(term158059, term158059.getClass(), "sumBattleBasicHighScore", 822587833802979777L);
        setLongField(term158059, term158059.getClass(), "sumBattleAdvancedHighScore", -492887364617117085L);
        setLongField(term158059, term158059.getClass(), "sumBattleExpertHighScore", -266916873843810546L);
        setLongField(term158059, term158059.getClass(), "sumBattleMasterHighScore", 1051431076691020835L);
        setLongField(term158059, term158059.getClass(), "sumBattleLunaticHighScore", 6000339484311671071L);
        setField(term158059, term158059.getClass(), "eventWatchedDate", "AYcehuoFwZ");
        setField(term158059, term158059.getClass(), "cmEventWatchedDate", "MkKeGpajFk");
        setField(term158059, term158059.getClass(), "firstGameId", "JhIjEseRRP");
        setField(term158059, term158059.getClass(), "firstRomVersion", "qlzeNoUsis");
        setField(term158059, term158059.getClass(), "firstDataVersion", "yzmxcgrHQF");
        setField(term158059, term158059.getClass(), "firstPlayDate", "XCCRJOWaYi");
        setField(term158059, term158059.getClass(), "lastGameId", "LGjjIEeXNn");
        setField(term158059, term158059.getClass(), "lastRomVersion", "gxjxaNDCjb");
        setField(term158059, term158059.getClass(), "lastDataVersion", "ZkckWvQlSC");
        setField(term158059, term158059.getClass(), "compatibleCmVersion", "RMAILvTevE");
        setField(term158059, term158059.getClass(), "lastPlayDate", "xKATihyOsy");
        setIntField(term158059, term158059.getClass(), "lastPlaceId", -1544616625);
        setField(term158059, term158059.getClass(), "lastPlaceName", "uinyvocUGz");
        setIntField(term158059, term158059.getClass(), "lastRegionId", -1541499013);
        setField(term158059, term158059.getClass(), "lastRegionName", "mhGOBiEPDs");
        setIntField(term158059, term158059.getClass(), "lastAllNetId", -1553107114);
        setField(term158059, term158059.getClass(), "lastClientId", "BtaROXxZYZ");
        setIntField(term158059, term158059.getClass(), "lastUsedDeckId", -1215527230);
        setIntField(term158059, term158059.getClass(), "lastPlayMusicLevel", 2122251083);
        setIntField(term158059, term158059.getClass(), "lastEmoneyBrand", 69182156);
        setField(term158057, term158057.getClass(), "user", term158059);
        setIntField(term158057, term158057.getClass(), "storyId", -90311637);
        setIntField(term158057, term158057.getClass(), "lastChapterId", -1830483575);
        setIntField(term158057, term158057.getClass(), "jewelCount", 666844768);
        setIntField(term158057, term158057.getClass(), "lastPlayMusicId", 592251593);
        setIntField(term158057, term158057.getClass(), "lastPlayMusicCategory", -201367159);
        setIntField(term158057, term158057.getClass(), "lastPlayMusicLevel", 1825158106);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserStory");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term158057, args);
    }

};


