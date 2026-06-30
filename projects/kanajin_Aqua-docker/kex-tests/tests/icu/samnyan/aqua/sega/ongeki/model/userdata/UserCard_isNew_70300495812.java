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

public class UserCard_isNew_70300495812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term117411;

    public UserCard_isNew_70300495812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term117417 = new Long(6248239231585852341L);
        term117411 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCard"));
        Object term117413 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term117415 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term117431 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term117432 = newInstance(Class.forName("java.time.LocalDate"));
        Object term117436 = newInstance(Class.forName("java.time.LocalTime"));
        Object term117441 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term117442 = newInstance(Class.forName("java.time.LocalDate"));
        Object term117446 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term117411, term117411.getClass(), "id", -5593770341473146640L);
        setLongField(term117413, term117413.getClass(), "id", 6496629583300657659L);
        setLongField(term117415, term117415.getClass(), "id", 2629323353523802483L);
        setField(term117415, term117415.getClass(), "extId", term117417);
        setField(term117415, term117415.getClass(), "luid", "FXwdarPRcu");
        setIntField(term117432, term117432.getClass(), "year", 2020);
        setShortField(term117432, term117432.getClass(), "month", (short) 3);
        setShortField(term117432, term117432.getClass(), "day", (short) 11);
        setField(term117431, term117431.getClass(), "date", term117432);
        setByteField(term117436, term117436.getClass(), "hour", (byte) 3);
        setByteField(term117436, term117436.getClass(), "minute", (byte) 24);
        setByteField(term117436, term117436.getClass(), "second", (byte) 7);
        setIntField(term117436, term117436.getClass(), "nano", 685767594);
        setField(term117431, term117431.getClass(), "time", term117436);
        setField(term117415, term117415.getClass(), "registerTime", term117431);
        setIntField(term117442, term117442.getClass(), "year", 2014);
        setShortField(term117442, term117442.getClass(), "month", (short) 9);
        setShortField(term117442, term117442.getClass(), "day", (short) 30);
        setField(term117441, term117441.getClass(), "date", term117442);
        setByteField(term117446, term117446.getClass(), "hour", (byte) 6);
        setByteField(term117446, term117446.getClass(), "minute", (byte) 5);
        setByteField(term117446, term117446.getClass(), "second", (byte) 42);
        setIntField(term117446, term117446.getClass(), "nano", 798954614);
        setField(term117441, term117441.getClass(), "time", term117446);
        setField(term117415, term117415.getClass(), "accessTime", term117441);
        setField(term117413, term117413.getClass(), "card", term117415);
        setField(term117413, term117413.getClass(), "userName", "HzWNDDgUtc");
        setIntField(term117413, term117413.getClass(), "level", -292946895);
        setIntField(term117413, term117413.getClass(), "reincarnationNum", -1582974640);
        setLongField(term117413, term117413.getClass(), "exp", 4634293118023415749L);
        setLongField(term117413, term117413.getClass(), "point", -1746705594173317645L);
        setLongField(term117413, term117413.getClass(), "totalPoint", -4351156485678193124L);
        setIntField(term117413, term117413.getClass(), "playCount", -425384218);
        setIntField(term117413, term117413.getClass(), "jewelCount", -1593819000);
        setIntField(term117413, term117413.getClass(), "totalJewelCount", -358856964);
        setIntField(term117413, term117413.getClass(), "medalCount", -367287466);
        setIntField(term117413, term117413.getClass(), "playerRating", 784852065);
        setIntField(term117413, term117413.getClass(), "highestRating", 358212017);
        setIntField(term117413, term117413.getClass(), "battlePoint", -1993296712);
        setIntField(term117413, term117413.getClass(), "bestBattlePoint", -1609787368);
        setIntField(term117413, term117413.getClass(), "overDamageBattlePoint", -1900357855);
        setBooleanField(term117413, term117413.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term117413, term117413.getClass(), "nameplateId", 1044601336);
        setIntField(term117413, term117413.getClass(), "trophyId", 562228242);
        setIntField(term117413, term117413.getClass(), "cardId", 995283566);
        setIntField(term117413, term117413.getClass(), "characterId", 1311217437);
        setIntField(term117413, term117413.getClass(), "characterVoiceNo", 289716613);
        setIntField(term117413, term117413.getClass(), "tabSetting", 2114806182);
        setIntField(term117413, term117413.getClass(), "tabSortSetting", 41155687);
        setIntField(term117413, term117413.getClass(), "cardCategorySetting", 1224581311);
        setIntField(term117413, term117413.getClass(), "cardSortSetting", 1017569554);
        setIntField(term117413, term117413.getClass(), "rivalScoreCategorySetting", -1457930793);
        setIntField(term117413, term117413.getClass(), "playedTutorialBit", -1761017199);
        setIntField(term117413, term117413.getClass(), "firstTutorialCancelNum", -1171889960);
        setLongField(term117413, term117413.getClass(), "sumTechHighScore", -3274901946251283016L);
        setLongField(term117413, term117413.getClass(), "sumTechBasicHighScore", -1191915632110205259L);
        setLongField(term117413, term117413.getClass(), "sumTechAdvancedHighScore", -109837841494633251L);
        setLongField(term117413, term117413.getClass(), "sumTechExpertHighScore", -1968874635471618257L);
        setLongField(term117413, term117413.getClass(), "sumTechMasterHighScore", 7746286716986335503L);
        setLongField(term117413, term117413.getClass(), "sumTechLunaticHighScore", -83739886134866568L);
        setLongField(term117413, term117413.getClass(), "sumBattleHighScore", -6617693381241289068L);
        setLongField(term117413, term117413.getClass(), "sumBattleBasicHighScore", -4638865229187525010L);
        setLongField(term117413, term117413.getClass(), "sumBattleAdvancedHighScore", -7661181241933749873L);
        setLongField(term117413, term117413.getClass(), "sumBattleExpertHighScore", 4515262739708705481L);
        setLongField(term117413, term117413.getClass(), "sumBattleMasterHighScore", 2663732911776823170L);
        setLongField(term117413, term117413.getClass(), "sumBattleLunaticHighScore", 2961405755335562807L);
        setField(term117413, term117413.getClass(), "eventWatchedDate", "umqvxozDpq");
        setField(term117413, term117413.getClass(), "cmEventWatchedDate", "HieTCBVeDD");
        setField(term117413, term117413.getClass(), "firstGameId", "cTSwYlchXv");
        setField(term117413, term117413.getClass(), "firstRomVersion", "QbalcMEEdv");
        setField(term117413, term117413.getClass(), "firstDataVersion", "xiYIPdzlXo");
        setField(term117413, term117413.getClass(), "firstPlayDate", "MYonccVvzc");
        setField(term117413, term117413.getClass(), "lastGameId", "cxwnnBgfmJ");
        setField(term117413, term117413.getClass(), "lastRomVersion", "tNXQltoRar");
        setField(term117413, term117413.getClass(), "lastDataVersion", "ALdRRCOlhZ");
        setField(term117413, term117413.getClass(), "compatibleCmVersion", "vXmDfMgmHu");
        setField(term117413, term117413.getClass(), "lastPlayDate", "fyRJvzWMpe");
        setIntField(term117413, term117413.getClass(), "lastPlaceId", -708194098);
        setField(term117413, term117413.getClass(), "lastPlaceName", "KMDtTdvTCJ");
        setIntField(term117413, term117413.getClass(), "lastRegionId", 613501922);
        setField(term117413, term117413.getClass(), "lastRegionName", "EGFHrFOTWy");
        setIntField(term117413, term117413.getClass(), "lastAllNetId", -1145481353);
        setField(term117413, term117413.getClass(), "lastClientId", "VQLNXTwXTJ");
        setIntField(term117413, term117413.getClass(), "lastUsedDeckId", -69628972);
        setIntField(term117413, term117413.getClass(), "lastPlayMusicLevel", 2136375684);
        setIntField(term117413, term117413.getClass(), "lastEmoneyBrand", 1534903857);
        setField(term117411, term117411.getClass(), "user", term117413);
        setIntField(term117411, term117411.getClass(), "cardId", -1);
        setIntField(term117411, term117411.getClass(), "digitalStock", 1);
        setIntField(term117411, term117411.getClass(), "analogStock", -1364694166);
        setIntField(term117411, term117411.getClass(), "level", -1031588818);
        setIntField(term117411, term117411.getClass(), "maxLevel", 10);
        setIntField(term117411, term117411.getClass(), "exp", -2142065668);
        setIntField(term117411, term117411.getClass(), "printCount", -1027337235);
        setIntField(term117411, term117411.getClass(), "useCount", 2078039172);
        setBooleanField(term117411, term117411.getClass(), "isNew", true);
        setField(term117411, term117411.getClass(), "kaikaDate", "0000-00-00 00:00:00.0");
        setField(term117411, term117411.getClass(), "choKaikaDate", "0000-00-00 00:00:00.0");
        setIntField(term117411, term117411.getClass(), "skillId", 810570789);
        setBooleanField(term117411, term117411.getClass(), "isAcquired", true);
        setField(term117411, term117411.getClass(), "created", "0000-00-00 00:00:00.0");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCard");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isNew", argTypes, term117411, args);
    }

};


