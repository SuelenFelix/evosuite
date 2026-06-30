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

public class UserMissionPoint_init_172287312914 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12446;
     Object term12448;
     Object term12711;
     Object term12713;

    public UserMissionPoint_init_172287312914() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12446 = new Long(2551047634163864862L);
        Long term12452 = new Long(2120084523938730454L);
        term12448 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term12450 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term12466 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12467 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12471 = newInstance(Class.forName("java.time.LocalTime"));
        Object term12476 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12477 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12481 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term12448, term12448.getClass(), "id", -6656996002079682356L);
        setLongField(term12450, term12450.getClass(), "id", 2166921473521388808L);
        setField(term12450, term12450.getClass(), "extId", term12452);
        setField(term12450, term12450.getClass(), "luid", "bxyfeicqrK");
        setIntField(term12467, term12467.getClass(), "year", 2025);
        setShortField(term12467, term12467.getClass(), "month", (short) 3);
        setShortField(term12467, term12467.getClass(), "day", (short) 28);
        setField(term12466, term12466.getClass(), "date", term12467);
        setByteField(term12471, term12471.getClass(), "hour", (byte) 19);
        setByteField(term12471, term12471.getClass(), "minute", (byte) 56);
        setByteField(term12471, term12471.getClass(), "second", (byte) 52);
        setIntField(term12471, term12471.getClass(), "nano", 738558930);
        setField(term12466, term12466.getClass(), "time", term12471);
        setField(term12450, term12450.getClass(), "registerTime", term12466);
        setIntField(term12477, term12477.getClass(), "year", 2024);
        setShortField(term12477, term12477.getClass(), "month", (short) 2);
        setShortField(term12477, term12477.getClass(), "day", (short) 29);
        setField(term12476, term12476.getClass(), "date", term12477);
        setByteField(term12481, term12481.getClass(), "hour", (byte) 17);
        setByteField(term12481, term12481.getClass(), "minute", (byte) 54);
        setByteField(term12481, term12481.getClass(), "second", (byte) 21);
        setIntField(term12481, term12481.getClass(), "nano", 605973408);
        setField(term12476, term12476.getClass(), "time", term12481);
        setField(term12450, term12450.getClass(), "accessTime", term12476);
        setField(term12448, term12448.getClass(), "card", term12450);
        setField(term12448, term12448.getClass(), "userName", "vBnWPlsZMk");
        setIntField(term12448, term12448.getClass(), "level", -252449812);
        setIntField(term12448, term12448.getClass(), "reincarnationNum", -1885268968);
        setLongField(term12448, term12448.getClass(), "exp", 1964822153944985001L);
        setLongField(term12448, term12448.getClass(), "point", -955253666696787757L);
        setLongField(term12448, term12448.getClass(), "totalPoint", -99017747847004910L);
        setIntField(term12448, term12448.getClass(), "playCount", 277855691);
        setIntField(term12448, term12448.getClass(), "jewelCount", 675891483);
        setIntField(term12448, term12448.getClass(), "totalJewelCount", -317900470);
        setIntField(term12448, term12448.getClass(), "medalCount", -979568);
        setIntField(term12448, term12448.getClass(), "playerRating", -1422131197);
        setIntField(term12448, term12448.getClass(), "highestRating", -20399281);
        setIntField(term12448, term12448.getClass(), "battlePoint", -830170410);
        setIntField(term12448, term12448.getClass(), "bestBattlePoint", -1742790308);
        setIntField(term12448, term12448.getClass(), "overDamageBattlePoint", -1592093430);
        setBooleanField(term12448, term12448.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term12448, term12448.getClass(), "nameplateId", 1178214545);
        setIntField(term12448, term12448.getClass(), "trophyId", -985334541);
        setIntField(term12448, term12448.getClass(), "cardId", -1870004228);
        setIntField(term12448, term12448.getClass(), "characterId", 380484139);
        setIntField(term12448, term12448.getClass(), "characterVoiceNo", 1822317628);
        setIntField(term12448, term12448.getClass(), "tabSetting", -608830309);
        setIntField(term12448, term12448.getClass(), "tabSortSetting", -537786484);
        setIntField(term12448, term12448.getClass(), "cardCategorySetting", 263859424);
        setIntField(term12448, term12448.getClass(), "cardSortSetting", 1436978289);
        setIntField(term12448, term12448.getClass(), "rivalScoreCategorySetting", 696225243);
        setIntField(term12448, term12448.getClass(), "playedTutorialBit", -1421649118);
        setIntField(term12448, term12448.getClass(), "firstTutorialCancelNum", -511248284);
        setLongField(term12448, term12448.getClass(), "sumTechHighScore", 797798302378380033L);
        setLongField(term12448, term12448.getClass(), "sumTechBasicHighScore", 4892304277320345810L);
        setLongField(term12448, term12448.getClass(), "sumTechAdvancedHighScore", -3271370917942710167L);
        setLongField(term12448, term12448.getClass(), "sumTechExpertHighScore", -8928717808154338062L);
        setLongField(term12448, term12448.getClass(), "sumTechMasterHighScore", 4628458998884457238L);
        setLongField(term12448, term12448.getClass(), "sumTechLunaticHighScore", -6806576523000182981L);
        setLongField(term12448, term12448.getClass(), "sumBattleHighScore", 6437032166810658671L);
        setLongField(term12448, term12448.getClass(), "sumBattleBasicHighScore", 6044346825617132280L);
        setLongField(term12448, term12448.getClass(), "sumBattleAdvancedHighScore", -4994148485124075625L);
        setLongField(term12448, term12448.getClass(), "sumBattleExpertHighScore", -8842842172497711872L);
        setLongField(term12448, term12448.getClass(), "sumBattleMasterHighScore", -5367775625638780650L);
        setLongField(term12448, term12448.getClass(), "sumBattleLunaticHighScore", -7830820957252387854L);
        setField(term12448, term12448.getClass(), "eventWatchedDate", "fIZsWucfXz");
        setField(term12448, term12448.getClass(), "cmEventWatchedDate", "IApvtmfhnq");
        setField(term12448, term12448.getClass(), "firstGameId", "VSaNnhMpRc");
        setField(term12448, term12448.getClass(), "firstRomVersion", "QNjNTLlUaV");
        setField(term12448, term12448.getClass(), "firstDataVersion", "hIYsRyOZxk");
        setField(term12448, term12448.getClass(), "firstPlayDate", "RjNoEywJbC");
        setField(term12448, term12448.getClass(), "lastGameId", "RTTvrwwhou");
        setField(term12448, term12448.getClass(), "lastRomVersion", "lRORwXipuk");
        setField(term12448, term12448.getClass(), "lastDataVersion", "fVdTcjgHdw");
        setField(term12448, term12448.getClass(), "compatibleCmVersion", "wwAwLLcLPp");
        setField(term12448, term12448.getClass(), "lastPlayDate", "nHpMKOmlpQ");
        setIntField(term12448, term12448.getClass(), "lastPlaceId", 788630042);
        setField(term12448, term12448.getClass(), "lastPlaceName", "fKhrQsJToZ");
        setIntField(term12448, term12448.getClass(), "lastRegionId", 1430066560);
        setField(term12448, term12448.getClass(), "lastRegionName", "wsysQLGFnl");
        setIntField(term12448, term12448.getClass(), "lastAllNetId", 836734074);
        setField(term12448, term12448.getClass(), "lastClientId", "ckQLZGFjMX");
        setIntField(term12448, term12448.getClass(), "lastUsedDeckId", -1747711865);
        setIntField(term12448, term12448.getClass(), "lastPlayMusicLevel", 682812715);
        setIntField(term12448, term12448.getClass(), "lastEmoneyBrand", -1092883950);
        term12711 = new Integer(950385621);
        term12713 = new Long(-8985577692063635272L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMissionPoint");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = long.class;
        argTypes[1] = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        argTypes[2] = int.class;
        argTypes[3] = long.class;
        Object[] args = new Object[4];
        args[0] = term12446;
        args[1] = term12448;
        args[2] = term12711;
        args[3] = term12713;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


