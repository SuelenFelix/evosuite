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

public class UserActivity_equals_152677946519 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291369;
     Object term291641;

    public UserActivity_equals_152677946519() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term291375 = new Long(9160882370265093763L);
        term291369 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserActivity"));
        Object term291371 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term291373 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term291389 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term291390 = newInstance(Class.forName("java.time.LocalDate"));
        Object term291394 = newInstance(Class.forName("java.time.LocalTime"));
        Object term291399 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term291400 = newInstance(Class.forName("java.time.LocalDate"));
        Object term291404 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term291369, term291369.getClass(), "id", -6530164465676543782L);
        setLongField(term291371, term291371.getClass(), "id", -4265601445962889972L);
        setLongField(term291373, term291373.getClass(), "id", -4606176869166505899L);
        setField(term291373, term291373.getClass(), "extId", term291375);
        setField(term291373, term291373.getClass(), "luid", "OFdIUrEOJR");
        setIntField(term291390, term291390.getClass(), "year", 2024);
        setShortField(term291390, term291390.getClass(), "month", (short) 4);
        setShortField(term291390, term291390.getClass(), "day", (short) 23);
        setField(term291389, term291389.getClass(), "date", term291390);
        setByteField(term291394, term291394.getClass(), "hour", (byte) 3);
        setByteField(term291394, term291394.getClass(), "minute", (byte) 59);
        setByteField(term291394, term291394.getClass(), "second", (byte) 56);
        setIntField(term291394, term291394.getClass(), "nano", 861034830);
        setField(term291389, term291389.getClass(), "time", term291394);
        setField(term291373, term291373.getClass(), "registerTime", term291389);
        setIntField(term291400, term291400.getClass(), "year", 2023);
        setShortField(term291400, term291400.getClass(), "month", (short) 10);
        setShortField(term291400, term291400.getClass(), "day", (short) 14);
        setField(term291399, term291399.getClass(), "date", term291400);
        setByteField(term291404, term291404.getClass(), "hour", (byte) 6);
        setByteField(term291404, term291404.getClass(), "minute", (byte) 36);
        setByteField(term291404, term291404.getClass(), "second", (byte) 40);
        setIntField(term291404, term291404.getClass(), "nano", 443830160);
        setField(term291399, term291399.getClass(), "time", term291404);
        setField(term291373, term291373.getClass(), "accessTime", term291399);
        setField(term291371, term291371.getClass(), "card", term291373);
        setField(term291371, term291371.getClass(), "userName", "xUODPydxaT");
        setIntField(term291371, term291371.getClass(), "level", -1763192318);
        setIntField(term291371, term291371.getClass(), "reincarnationNum", 1971653394);
        setLongField(term291371, term291371.getClass(), "exp", 1060479560793040885L);
        setLongField(term291371, term291371.getClass(), "point", -1503849424925355755L);
        setLongField(term291371, term291371.getClass(), "totalPoint", 1584468811860131003L);
        setIntField(term291371, term291371.getClass(), "playCount", 1865396715);
        setIntField(term291371, term291371.getClass(), "jewelCount", -690638114);
        setIntField(term291371, term291371.getClass(), "totalJewelCount", 371111200);
        setIntField(term291371, term291371.getClass(), "medalCount", -316850029);
        setIntField(term291371, term291371.getClass(), "playerRating", 1533443366);
        setIntField(term291371, term291371.getClass(), "highestRating", -1540437173);
        setIntField(term291371, term291371.getClass(), "battlePoint", 297826139);
        setIntField(term291371, term291371.getClass(), "bestBattlePoint", -1493036473);
        setIntField(term291371, term291371.getClass(), "overDamageBattlePoint", -1216310667);
        setBooleanField(term291371, term291371.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term291371, term291371.getClass(), "nameplateId", -780354849);
        setIntField(term291371, term291371.getClass(), "trophyId", -1963671315);
        setIntField(term291371, term291371.getClass(), "cardId", 2102666147);
        setIntField(term291371, term291371.getClass(), "characterId", -2128240390);
        setIntField(term291371, term291371.getClass(), "characterVoiceNo", -642220987);
        setIntField(term291371, term291371.getClass(), "tabSetting", -330877175);
        setIntField(term291371, term291371.getClass(), "tabSortSetting", 924610813);
        setIntField(term291371, term291371.getClass(), "cardCategorySetting", 326759885);
        setIntField(term291371, term291371.getClass(), "cardSortSetting", 1717078401);
        setIntField(term291371, term291371.getClass(), "rivalScoreCategorySetting", 937682788);
        setIntField(term291371, term291371.getClass(), "playedTutorialBit", 374255307);
        setIntField(term291371, term291371.getClass(), "firstTutorialCancelNum", -1684423391);
        setLongField(term291371, term291371.getClass(), "sumTechHighScore", 2490157212398889918L);
        setLongField(term291371, term291371.getClass(), "sumTechBasicHighScore", -7861006005527806692L);
        setLongField(term291371, term291371.getClass(), "sumTechAdvancedHighScore", 4330210697154841448L);
        setLongField(term291371, term291371.getClass(), "sumTechExpertHighScore", -2354372097718177231L);
        setLongField(term291371, term291371.getClass(), "sumTechMasterHighScore", 4550244066712056450L);
        setLongField(term291371, term291371.getClass(), "sumTechLunaticHighScore", -247811548697582090L);
        setLongField(term291371, term291371.getClass(), "sumBattleHighScore", -6350435453272604172L);
        setLongField(term291371, term291371.getClass(), "sumBattleBasicHighScore", 4574497079154829577L);
        setLongField(term291371, term291371.getClass(), "sumBattleAdvancedHighScore", -254052526061109628L);
        setLongField(term291371, term291371.getClass(), "sumBattleExpertHighScore", -247304583130533710L);
        setLongField(term291371, term291371.getClass(), "sumBattleMasterHighScore", 2484156985479563386L);
        setLongField(term291371, term291371.getClass(), "sumBattleLunaticHighScore", 6477823115925295395L);
        setField(term291371, term291371.getClass(), "eventWatchedDate", "EdjuGrPKel");
        setField(term291371, term291371.getClass(), "cmEventWatchedDate", "xKRCOGzNgc");
        setField(term291371, term291371.getClass(), "firstGameId", "JTfrTZUkVR");
        setField(term291371, term291371.getClass(), "firstRomVersion", "klkctrXEId");
        setField(term291371, term291371.getClass(), "firstDataVersion", "HITkgFdUxC");
        setField(term291371, term291371.getClass(), "firstPlayDate", "JtTgctnzIb");
        setField(term291371, term291371.getClass(), "lastGameId", "jkqncveFue");
        setField(term291371, term291371.getClass(), "lastRomVersion", "ORAFZEKabw");
        setField(term291371, term291371.getClass(), "lastDataVersion", "lNHeCcQUrM");
        setField(term291371, term291371.getClass(), "compatibleCmVersion", "xDzfsTlPyO");
        setField(term291371, term291371.getClass(), "lastPlayDate", "xtNbDPazRs");
        setIntField(term291371, term291371.getClass(), "lastPlaceId", -377360316);
        setField(term291371, term291371.getClass(), "lastPlaceName", "STfGRumXvX");
        setIntField(term291371, term291371.getClass(), "lastRegionId", 1546676215);
        setField(term291371, term291371.getClass(), "lastRegionName", "qoMGJyerSD");
        setIntField(term291371, term291371.getClass(), "lastAllNetId", -1338644465);
        setField(term291371, term291371.getClass(), "lastClientId", "YHHJhPAXoN");
        setIntField(term291371, term291371.getClass(), "lastUsedDeckId", -2145078875);
        setIntField(term291371, term291371.getClass(), "lastPlayMusicLevel", -1673144446);
        setIntField(term291371, term291371.getClass(), "lastEmoneyBrand", 913354499);
        setField(term291369, term291369.getClass(), "user", term291371);
        setIntField(term291369, term291369.getClass(), "kind", -1016590318);
        setIntField(term291369, term291369.getClass(), "activityId", -1194664404);
        setIntField(term291369, term291369.getClass(), "sortNumber", -155628991);
        setIntField(term291369, term291369.getClass(), "param1", -393025707);
        setIntField(term291369, term291369.getClass(), "param2", -2030798001);
        setIntField(term291369, term291369.getClass(), "param3", 1588680079);
        setIntField(term291369, term291369.getClass(), "param4", -432120908);
        term291641 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserActivity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term291641;
        callMethod(klass, "equals", argTypes, term291369, args);
    }

};


