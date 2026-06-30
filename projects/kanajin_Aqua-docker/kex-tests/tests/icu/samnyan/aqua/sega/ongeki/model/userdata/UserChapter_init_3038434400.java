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

public class UserChapter_init_3038434400 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83200;

    public UserChapter_init_3038434400() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term83204 = new Long(-78240609295693193L);
        term83200 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term83202 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term83218 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term83219 = newInstance(Class.forName("java.time.LocalDate"));
        Object term83223 = newInstance(Class.forName("java.time.LocalTime"));
        Object term83228 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term83229 = newInstance(Class.forName("java.time.LocalDate"));
        Object term83233 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term83200, term83200.getClass(), "id", 5558244994938325139L);
        setLongField(term83202, term83202.getClass(), "id", 7731755337784936423L);
        setField(term83202, term83202.getClass(), "extId", term83204);
        setField(term83202, term83202.getClass(), "luid", "xkIacuRHpE");
        setIntField(term83219, term83219.getClass(), "year", 2021);
        setShortField(term83219, term83219.getClass(), "month", (short) 11);
        setShortField(term83219, term83219.getClass(), "day", (short) 19);
        setField(term83218, term83218.getClass(), "date", term83219);
        setByteField(term83223, term83223.getClass(), "hour", (byte) 4);
        setByteField(term83223, term83223.getClass(), "minute", (byte) 39);
        setByteField(term83223, term83223.getClass(), "second", (byte) 43);
        setIntField(term83223, term83223.getClass(), "nano", 638695514);
        setField(term83218, term83218.getClass(), "time", term83223);
        setField(term83202, term83202.getClass(), "registerTime", term83218);
        setIntField(term83229, term83229.getClass(), "year", 2015);
        setShortField(term83229, term83229.getClass(), "month", (short) 10);
        setShortField(term83229, term83229.getClass(), "day", (short) 4);
        setField(term83228, term83228.getClass(), "date", term83229);
        setByteField(term83233, term83233.getClass(), "hour", (byte) 1);
        setByteField(term83233, term83233.getClass(), "minute", (byte) 29);
        setByteField(term83233, term83233.getClass(), "second", (byte) 20);
        setIntField(term83233, term83233.getClass(), "nano", 558273892);
        setField(term83228, term83228.getClass(), "time", term83233);
        setField(term83202, term83202.getClass(), "accessTime", term83228);
        setField(term83200, term83200.getClass(), "card", term83202);
        setField(term83200, term83200.getClass(), "userName", "xFULXQCABK");
        setIntField(term83200, term83200.getClass(), "level", 1801514751);
        setIntField(term83200, term83200.getClass(), "reincarnationNum", 458342034);
        setLongField(term83200, term83200.getClass(), "exp", -1374127091272456168L);
        setLongField(term83200, term83200.getClass(), "point", 9130044369997098420L);
        setLongField(term83200, term83200.getClass(), "totalPoint", 7290022068563009794L);
        setIntField(term83200, term83200.getClass(), "playCount", 859867598);
        setIntField(term83200, term83200.getClass(), "jewelCount", 781983880);
        setIntField(term83200, term83200.getClass(), "totalJewelCount", -1804104652);
        setIntField(term83200, term83200.getClass(), "medalCount", -618717355);
        setIntField(term83200, term83200.getClass(), "playerRating", 942277782);
        setIntField(term83200, term83200.getClass(), "highestRating", 1822833628);
        setIntField(term83200, term83200.getClass(), "battlePoint", -125384487);
        setIntField(term83200, term83200.getClass(), "bestBattlePoint", 335305737);
        setIntField(term83200, term83200.getClass(), "overDamageBattlePoint", -925570940);
        setBooleanField(term83200, term83200.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term83200, term83200.getClass(), "nameplateId", -995970411);
        setIntField(term83200, term83200.getClass(), "trophyId", -1408698769);
        setIntField(term83200, term83200.getClass(), "cardId", -833650140);
        setIntField(term83200, term83200.getClass(), "characterId", 383587236);
        setIntField(term83200, term83200.getClass(), "characterVoiceNo", 1305946167);
        setIntField(term83200, term83200.getClass(), "tabSetting", 1819681111);
        setIntField(term83200, term83200.getClass(), "tabSortSetting", 1985692620);
        setIntField(term83200, term83200.getClass(), "cardCategorySetting", 534050336);
        setIntField(term83200, term83200.getClass(), "cardSortSetting", -1372609370);
        setIntField(term83200, term83200.getClass(), "rivalScoreCategorySetting", 1366651612);
        setIntField(term83200, term83200.getClass(), "playedTutorialBit", -2147136630);
        setIntField(term83200, term83200.getClass(), "firstTutorialCancelNum", -639963675);
        setLongField(term83200, term83200.getClass(), "sumTechHighScore", 2323440960270760830L);
        setLongField(term83200, term83200.getClass(), "sumTechBasicHighScore", 4533583496836744726L);
        setLongField(term83200, term83200.getClass(), "sumTechAdvancedHighScore", 2414597052032100136L);
        setLongField(term83200, term83200.getClass(), "sumTechExpertHighScore", -1963815850972856990L);
        setLongField(term83200, term83200.getClass(), "sumTechMasterHighScore", 6662149042039246051L);
        setLongField(term83200, term83200.getClass(), "sumTechLunaticHighScore", -4813337266375113125L);
        setLongField(term83200, term83200.getClass(), "sumBattleHighScore", -5645042874196452363L);
        setLongField(term83200, term83200.getClass(), "sumBattleBasicHighScore", 1089144432691396169L);
        setLongField(term83200, term83200.getClass(), "sumBattleAdvancedHighScore", 6043571308877237179L);
        setLongField(term83200, term83200.getClass(), "sumBattleExpertHighScore", 1857688668677867235L);
        setLongField(term83200, term83200.getClass(), "sumBattleMasterHighScore", -1175329770645054224L);
        setLongField(term83200, term83200.getClass(), "sumBattleLunaticHighScore", -8641861887771020491L);
        setField(term83200, term83200.getClass(), "eventWatchedDate", "ONotPjASxK");
        setField(term83200, term83200.getClass(), "cmEventWatchedDate", "LzgtTgYOFG");
        setField(term83200, term83200.getClass(), "firstGameId", "ouCBOakoEl");
        setField(term83200, term83200.getClass(), "firstRomVersion", "wQVWUCbSgW");
        setField(term83200, term83200.getClass(), "firstDataVersion", "tHzdWkkvkE");
        setField(term83200, term83200.getClass(), "firstPlayDate", "OeOnaLqxoy");
        setField(term83200, term83200.getClass(), "lastGameId", "buRlIDjuAa");
        setField(term83200, term83200.getClass(), "lastRomVersion", "qDicwPaclz");
        setField(term83200, term83200.getClass(), "lastDataVersion", "eZlPEKWGYm");
        setField(term83200, term83200.getClass(), "compatibleCmVersion", "KuunqhygWm");
        setField(term83200, term83200.getClass(), "lastPlayDate", "wKOfSnwiZS");
        setIntField(term83200, term83200.getClass(), "lastPlaceId", -111415044);
        setField(term83200, term83200.getClass(), "lastPlaceName", "oIlPhWewqE");
        setIntField(term83200, term83200.getClass(), "lastRegionId", -1724633225);
        setField(term83200, term83200.getClass(), "lastRegionName", "IfOJiWUkHp");
        setIntField(term83200, term83200.getClass(), "lastAllNetId", -285108418);
        setField(term83200, term83200.getClass(), "lastClientId", "YQNWnfnWil");
        setIntField(term83200, term83200.getClass(), "lastUsedDeckId", -1833551739);
        setIntField(term83200, term83200.getClass(), "lastPlayMusicLevel", -408588900);
        setIntField(term83200, term83200.getClass(), "lastEmoneyBrand", -768092851);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserChapter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Object[] args = new Object[1];
        args[0] = term83200;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


