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

public class UserTechCount_init_37232490216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term368538;
     Object term368540;
     Object term368803;
     Object term368805;
     Object term368807;

    public UserTechCount_init_37232490216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term368538 = new Long(-8737650629105379644L);
        Long term368544 = new Long(-3502423991725415780L);
        term368540 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term368542 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term368558 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term368559 = newInstance(Class.forName("java.time.LocalDate"));
        Object term368563 = newInstance(Class.forName("java.time.LocalTime"));
        Object term368568 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term368569 = newInstance(Class.forName("java.time.LocalDate"));
        Object term368573 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term368540, term368540.getClass(), "id", -3704244741379736983L);
        setLongField(term368542, term368542.getClass(), "id", -2303599825971778972L);
        setField(term368542, term368542.getClass(), "extId", term368544);
        setField(term368542, term368542.getClass(), "luid", "OPzVnrXHUs");
        setIntField(term368559, term368559.getClass(), "year", 2029);
        setShortField(term368559, term368559.getClass(), "month", (short) 9);
        setShortField(term368559, term368559.getClass(), "day", (short) 15);
        setField(term368558, term368558.getClass(), "date", term368559);
        setByteField(term368563, term368563.getClass(), "hour", (byte) 8);
        setByteField(term368563, term368563.getClass(), "minute", (byte) 38);
        setByteField(term368563, term368563.getClass(), "second", (byte) 35);
        setIntField(term368563, term368563.getClass(), "nano", 900863726);
        setField(term368558, term368558.getClass(), "time", term368563);
        setField(term368542, term368542.getClass(), "registerTime", term368558);
        setIntField(term368569, term368569.getClass(), "year", 2020);
        setShortField(term368569, term368569.getClass(), "month", (short) 12);
        setShortField(term368569, term368569.getClass(), "day", (short) 28);
        setField(term368568, term368568.getClass(), "date", term368569);
        setByteField(term368573, term368573.getClass(), "hour", (byte) 9);
        setByteField(term368573, term368573.getClass(), "minute", (byte) 30);
        setByteField(term368573, term368573.getClass(), "second", (byte) 17);
        setIntField(term368573, term368573.getClass(), "nano", 277857354);
        setField(term368568, term368568.getClass(), "time", term368573);
        setField(term368542, term368542.getClass(), "accessTime", term368568);
        setField(term368540, term368540.getClass(), "card", term368542);
        setField(term368540, term368540.getClass(), "userName", "aCBgsRxtYa");
        setIntField(term368540, term368540.getClass(), "level", 1297714500);
        setIntField(term368540, term368540.getClass(), "reincarnationNum", 971040083);
        setLongField(term368540, term368540.getClass(), "exp", -4894588749991765629L);
        setLongField(term368540, term368540.getClass(), "point", 8871403961476504991L);
        setLongField(term368540, term368540.getClass(), "totalPoint", 2626223667163469065L);
        setIntField(term368540, term368540.getClass(), "playCount", -387057191);
        setIntField(term368540, term368540.getClass(), "jewelCount", 1081726768);
        setIntField(term368540, term368540.getClass(), "totalJewelCount", -734370776);
        setIntField(term368540, term368540.getClass(), "medalCount", -112111942);
        setIntField(term368540, term368540.getClass(), "playerRating", -515542479);
        setIntField(term368540, term368540.getClass(), "highestRating", -599681226);
        setIntField(term368540, term368540.getClass(), "battlePoint", 614526808);
        setIntField(term368540, term368540.getClass(), "bestBattlePoint", 149823857);
        setIntField(term368540, term368540.getClass(), "overDamageBattlePoint", 1871075538);
        setBooleanField(term368540, term368540.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term368540, term368540.getClass(), "nameplateId", -2141470866);
        setIntField(term368540, term368540.getClass(), "trophyId", -1697332210);
        setIntField(term368540, term368540.getClass(), "cardId", 546406070);
        setIntField(term368540, term368540.getClass(), "characterId", -287272983);
        setIntField(term368540, term368540.getClass(), "characterVoiceNo", 626382497);
        setIntField(term368540, term368540.getClass(), "tabSetting", 488305322);
        setIntField(term368540, term368540.getClass(), "tabSortSetting", 87099349);
        setIntField(term368540, term368540.getClass(), "cardCategorySetting", 1791171089);
        setIntField(term368540, term368540.getClass(), "cardSortSetting", -1440903998);
        setIntField(term368540, term368540.getClass(), "rivalScoreCategorySetting", -468121590);
        setIntField(term368540, term368540.getClass(), "playedTutorialBit", -542710031);
        setIntField(term368540, term368540.getClass(), "firstTutorialCancelNum", 1023733184);
        setLongField(term368540, term368540.getClass(), "sumTechHighScore", 8390982191006222529L);
        setLongField(term368540, term368540.getClass(), "sumTechBasicHighScore", -5781176143169251556L);
        setLongField(term368540, term368540.getClass(), "sumTechAdvancedHighScore", 6800777881487032009L);
        setLongField(term368540, term368540.getClass(), "sumTechExpertHighScore", -7205480443925452724L);
        setLongField(term368540, term368540.getClass(), "sumTechMasterHighScore", 48581496965373039L);
        setLongField(term368540, term368540.getClass(), "sumTechLunaticHighScore", -4672899354766655430L);
        setLongField(term368540, term368540.getClass(), "sumBattleHighScore", -3007913614082243737L);
        setLongField(term368540, term368540.getClass(), "sumBattleBasicHighScore", -3317467339604788099L);
        setLongField(term368540, term368540.getClass(), "sumBattleAdvancedHighScore", -4225949148448029209L);
        setLongField(term368540, term368540.getClass(), "sumBattleExpertHighScore", 1385982097536213449L);
        setLongField(term368540, term368540.getClass(), "sumBattleMasterHighScore", 6790537866734569063L);
        setLongField(term368540, term368540.getClass(), "sumBattleLunaticHighScore", 3436434912076467022L);
        setField(term368540, term368540.getClass(), "eventWatchedDate", "gEiEnMGaDd");
        setField(term368540, term368540.getClass(), "cmEventWatchedDate", "wDQFsyJFGK");
        setField(term368540, term368540.getClass(), "firstGameId", "mDECKRvKvu");
        setField(term368540, term368540.getClass(), "firstRomVersion", "ehThxEoiQB");
        setField(term368540, term368540.getClass(), "firstDataVersion", "HpupuOlsyn");
        setField(term368540, term368540.getClass(), "firstPlayDate", "ffSpWMetxS");
        setField(term368540, term368540.getClass(), "lastGameId", "KIfYZLtrHx");
        setField(term368540, term368540.getClass(), "lastRomVersion", "sYAjNsAtvM");
        setField(term368540, term368540.getClass(), "lastDataVersion", "wzreOHptRS");
        setField(term368540, term368540.getClass(), "compatibleCmVersion", "ChLKGGkSGj");
        setField(term368540, term368540.getClass(), "lastPlayDate", "ZacgmriFeL");
        setIntField(term368540, term368540.getClass(), "lastPlaceId", 1615657811);
        setField(term368540, term368540.getClass(), "lastPlaceName", "suFipvmkKJ");
        setIntField(term368540, term368540.getClass(), "lastRegionId", -849981410);
        setField(term368540, term368540.getClass(), "lastRegionName", "PbrIyZCcsi");
        setIntField(term368540, term368540.getClass(), "lastAllNetId", 939270146);
        setField(term368540, term368540.getClass(), "lastClientId", "OXlQelCxIj");
        setIntField(term368540, term368540.getClass(), "lastUsedDeckId", -117240829);
        setIntField(term368540, term368540.getClass(), "lastPlayMusicLevel", 911214599);
        setIntField(term368540, term368540.getClass(), "lastEmoneyBrand", 183905722);
        term368803 = new Integer(35155489);
        term368805 = new Integer(-973287827);
        term368807 = new Integer(-1817522775);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTechCount");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = long.class;
        argTypes[1] = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        Object[] args = new Object[5];
        args[0] = term368538;
        args[1] = term368540;
        args[2] = term368803;
        args[3] = term368805;
        args[4] = term368807;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


