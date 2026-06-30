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

public class UserLoginBonus_toString_1705783714 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term307522;

    public UserLoginBonus_toString_1705783714() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term307528 = new Long(-6838909359433858599L);
        term307522 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserLoginBonus"));
        Object term307524 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term307526 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term307542 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term307543 = newInstance(Class.forName("java.time.LocalDate"));
        Object term307547 = newInstance(Class.forName("java.time.LocalTime"));
        Object term307552 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term307553 = newInstance(Class.forName("java.time.LocalDate"));
        Object term307557 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term307522, term307522.getClass(), "id", 69188228644434194L);
        setLongField(term307524, term307524.getClass(), "id", -1753101998562567661L);
        setLongField(term307526, term307526.getClass(), "id", 5363120255715285850L);
        setField(term307526, term307526.getClass(), "extId", term307528);
        setField(term307526, term307526.getClass(), "luid", "hQbREUtOdY");
        setIntField(term307543, term307543.getClass(), "year", 2021);
        setShortField(term307543, term307543.getClass(), "month", (short) 8);
        setShortField(term307543, term307543.getClass(), "day", (short) 18);
        setField(term307542, term307542.getClass(), "date", term307543);
        setByteField(term307547, term307547.getClass(), "hour", (byte) 23);
        setByteField(term307547, term307547.getClass(), "minute", (byte) 11);
        setByteField(term307547, term307547.getClass(), "second", (byte) 44);
        setIntField(term307547, term307547.getClass(), "nano", 804306638);
        setField(term307542, term307542.getClass(), "time", term307547);
        setField(term307526, term307526.getClass(), "registerTime", term307542);
        setIntField(term307553, term307553.getClass(), "year", 2027);
        setShortField(term307553, term307553.getClass(), "month", (short) 11);
        setShortField(term307553, term307553.getClass(), "day", (short) 1);
        setField(term307552, term307552.getClass(), "date", term307553);
        setByteField(term307557, term307557.getClass(), "hour", (byte) 16);
        setByteField(term307557, term307557.getClass(), "minute", (byte) 52);
        setByteField(term307557, term307557.getClass(), "second", (byte) 36);
        setIntField(term307557, term307557.getClass(), "nano", 59738907);
        setField(term307552, term307552.getClass(), "time", term307557);
        setField(term307526, term307526.getClass(), "accessTime", term307552);
        setField(term307524, term307524.getClass(), "card", term307526);
        setField(term307524, term307524.getClass(), "userName", "PYGbHSlLQs");
        setIntField(term307524, term307524.getClass(), "level", 342934559);
        setIntField(term307524, term307524.getClass(), "reincarnationNum", 1103167653);
        setLongField(term307524, term307524.getClass(), "exp", 5489591297016050030L);
        setLongField(term307524, term307524.getClass(), "point", -1986761442572014726L);
        setLongField(term307524, term307524.getClass(), "totalPoint", -3898919044199605665L);
        setIntField(term307524, term307524.getClass(), "playCount", 681051450);
        setIntField(term307524, term307524.getClass(), "jewelCount", -250002255);
        setIntField(term307524, term307524.getClass(), "totalJewelCount", 1800364);
        setIntField(term307524, term307524.getClass(), "medalCount", -304061975);
        setIntField(term307524, term307524.getClass(), "playerRating", -1743837327);
        setIntField(term307524, term307524.getClass(), "highestRating", -2074707092);
        setIntField(term307524, term307524.getClass(), "battlePoint", -1546650170);
        setIntField(term307524, term307524.getClass(), "bestBattlePoint", 845666879);
        setIntField(term307524, term307524.getClass(), "overDamageBattlePoint", -2138689322);
        setBooleanField(term307524, term307524.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term307524, term307524.getClass(), "nameplateId", 191811468);
        setIntField(term307524, term307524.getClass(), "trophyId", -1361727288);
        setIntField(term307524, term307524.getClass(), "cardId", 605815345);
        setIntField(term307524, term307524.getClass(), "characterId", -95586153);
        setIntField(term307524, term307524.getClass(), "characterVoiceNo", 926007523);
        setIntField(term307524, term307524.getClass(), "tabSetting", -668356776);
        setIntField(term307524, term307524.getClass(), "tabSortSetting", 1390020457);
        setIntField(term307524, term307524.getClass(), "cardCategorySetting", -1315169575);
        setIntField(term307524, term307524.getClass(), "cardSortSetting", -1487987516);
        setIntField(term307524, term307524.getClass(), "rivalScoreCategorySetting", 481913288);
        setIntField(term307524, term307524.getClass(), "playedTutorialBit", -1807886018);
        setIntField(term307524, term307524.getClass(), "firstTutorialCancelNum", -338826312);
        setLongField(term307524, term307524.getClass(), "sumTechHighScore", -27417151475143058L);
        setLongField(term307524, term307524.getClass(), "sumTechBasicHighScore", -8710260891588313312L);
        setLongField(term307524, term307524.getClass(), "sumTechAdvancedHighScore", 5475473200926861964L);
        setLongField(term307524, term307524.getClass(), "sumTechExpertHighScore", -8081424242198784403L);
        setLongField(term307524, term307524.getClass(), "sumTechMasterHighScore", 6371122681092715242L);
        setLongField(term307524, term307524.getClass(), "sumTechLunaticHighScore", 4845413729137115019L);
        setLongField(term307524, term307524.getClass(), "sumBattleHighScore", -7548367670388781828L);
        setLongField(term307524, term307524.getClass(), "sumBattleBasicHighScore", 7626664177877916299L);
        setLongField(term307524, term307524.getClass(), "sumBattleAdvancedHighScore", -4651584950466442110L);
        setLongField(term307524, term307524.getClass(), "sumBattleExpertHighScore", 6322496846605099215L);
        setLongField(term307524, term307524.getClass(), "sumBattleMasterHighScore", 10787351573793184L);
        setLongField(term307524, term307524.getClass(), "sumBattleLunaticHighScore", -2205003184408133171L);
        setField(term307524, term307524.getClass(), "eventWatchedDate", "tKIPCrqYcE");
        setField(term307524, term307524.getClass(), "cmEventWatchedDate", "epiSKrHTNO");
        setField(term307524, term307524.getClass(), "firstGameId", "WFOEQjkbXp");
        setField(term307524, term307524.getClass(), "firstRomVersion", "BlZJucuIKY");
        setField(term307524, term307524.getClass(), "firstDataVersion", "LFHcFsKeGk");
        setField(term307524, term307524.getClass(), "firstPlayDate", "imfDJZDBWh");
        setField(term307524, term307524.getClass(), "lastGameId", "QJmtwzmUnd");
        setField(term307524, term307524.getClass(), "lastRomVersion", "DCUNPyCrFE");
        setField(term307524, term307524.getClass(), "lastDataVersion", "BxbGKzqjgJ");
        setField(term307524, term307524.getClass(), "compatibleCmVersion", "xcpoffFZBm");
        setField(term307524, term307524.getClass(), "lastPlayDate", "FNxQNaLXgf");
        setIntField(term307524, term307524.getClass(), "lastPlaceId", 1304235700);
        setField(term307524, term307524.getClass(), "lastPlaceName", "FuNTofkcKF");
        setIntField(term307524, term307524.getClass(), "lastRegionId", 1120499647);
        setField(term307524, term307524.getClass(), "lastRegionName", "JcGIJVAGEN");
        setIntField(term307524, term307524.getClass(), "lastAllNetId", -1733948783);
        setField(term307524, term307524.getClass(), "lastClientId", "KqIlQkMfyL");
        setIntField(term307524, term307524.getClass(), "lastUsedDeckId", 2120160907);
        setIntField(term307524, term307524.getClass(), "lastPlayMusicLevel", 1939998816);
        setIntField(term307524, term307524.getClass(), "lastEmoneyBrand", -2065525992);
        setField(term307522, term307522.getClass(), "user", term307524);
        setIntField(term307522, term307522.getClass(), "bonusId", -1649181478);
        setIntField(term307522, term307522.getClass(), "bonusCount", -1855197844);
        setField(term307522, term307522.getClass(), "lastUpdateDate", "wrLXJeWMsL");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserLoginBonus");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term307522, args);
    }

};


