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

public class UserTechCount_equals_118766261911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term366824;
     Object term367092;

    public UserTechCount_equals_118766261911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term366830 = new Long(1835131711657183788L);
        term366824 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTechCount"));
        Object term366826 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term366828 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term366844 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term366845 = newInstance(Class.forName("java.time.LocalDate"));
        Object term366849 = newInstance(Class.forName("java.time.LocalTime"));
        Object term366854 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term366855 = newInstance(Class.forName("java.time.LocalDate"));
        Object term366859 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term366824, term366824.getClass(), "id", -7852083883890840662L);
        setLongField(term366826, term366826.getClass(), "id", 4816449337216368822L);
        setLongField(term366828, term366828.getClass(), "id", 7855733164635245139L);
        setField(term366828, term366828.getClass(), "extId", term366830);
        setField(term366828, term366828.getClass(), "luid", "vdzIVpkLaf");
        setIntField(term366845, term366845.getClass(), "year", 2028);
        setShortField(term366845, term366845.getClass(), "month", (short) 8);
        setShortField(term366845, term366845.getClass(), "day", (short) 10);
        setField(term366844, term366844.getClass(), "date", term366845);
        setByteField(term366849, term366849.getClass(), "hour", (byte) 14);
        setByteField(term366849, term366849.getClass(), "minute", (byte) 7);
        setByteField(term366849, term366849.getClass(), "second", (byte) 18);
        setIntField(term366849, term366849.getClass(), "nano", 756167959);
        setField(term366844, term366844.getClass(), "time", term366849);
        setField(term366828, term366828.getClass(), "registerTime", term366844);
        setIntField(term366855, term366855.getClass(), "year", 2020);
        setShortField(term366855, term366855.getClass(), "month", (short) 6);
        setShortField(term366855, term366855.getClass(), "day", (short) 3);
        setField(term366854, term366854.getClass(), "date", term366855);
        setByteField(term366859, term366859.getClass(), "hour", (byte) 6);
        setByteField(term366859, term366859.getClass(), "minute", (byte) 45);
        setByteField(term366859, term366859.getClass(), "second", (byte) 58);
        setIntField(term366859, term366859.getClass(), "nano", 920763372);
        setField(term366854, term366854.getClass(), "time", term366859);
        setField(term366828, term366828.getClass(), "accessTime", term366854);
        setField(term366826, term366826.getClass(), "card", term366828);
        setField(term366826, term366826.getClass(), "userName", "yVAlpDEcKp");
        setIntField(term366826, term366826.getClass(), "level", 747637550);
        setIntField(term366826, term366826.getClass(), "reincarnationNum", -395460067);
        setLongField(term366826, term366826.getClass(), "exp", 2600284652216901584L);
        setLongField(term366826, term366826.getClass(), "point", -4837925130330284585L);
        setLongField(term366826, term366826.getClass(), "totalPoint", -7209797318505426448L);
        setIntField(term366826, term366826.getClass(), "playCount", 985421264);
        setIntField(term366826, term366826.getClass(), "jewelCount", 1372757276);
        setIntField(term366826, term366826.getClass(), "totalJewelCount", -461253635);
        setIntField(term366826, term366826.getClass(), "medalCount", 553157678);
        setIntField(term366826, term366826.getClass(), "playerRating", 25376389);
        setIntField(term366826, term366826.getClass(), "highestRating", -608938311);
        setIntField(term366826, term366826.getClass(), "battlePoint", -1520513614);
        setIntField(term366826, term366826.getClass(), "bestBattlePoint", 1348052458);
        setIntField(term366826, term366826.getClass(), "overDamageBattlePoint", -46030984);
        setBooleanField(term366826, term366826.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term366826, term366826.getClass(), "nameplateId", 630069009);
        setIntField(term366826, term366826.getClass(), "trophyId", -1343926882);
        setIntField(term366826, term366826.getClass(), "cardId", 196125382);
        setIntField(term366826, term366826.getClass(), "characterId", -899863376);
        setIntField(term366826, term366826.getClass(), "characterVoiceNo", -739928605);
        setIntField(term366826, term366826.getClass(), "tabSetting", 1403391417);
        setIntField(term366826, term366826.getClass(), "tabSortSetting", 262726089);
        setIntField(term366826, term366826.getClass(), "cardCategorySetting", 300769308);
        setIntField(term366826, term366826.getClass(), "cardSortSetting", -34616421);
        setIntField(term366826, term366826.getClass(), "rivalScoreCategorySetting", -1453570566);
        setIntField(term366826, term366826.getClass(), "playedTutorialBit", -265423284);
        setIntField(term366826, term366826.getClass(), "firstTutorialCancelNum", -128234226);
        setLongField(term366826, term366826.getClass(), "sumTechHighScore", -5020031525198787440L);
        setLongField(term366826, term366826.getClass(), "sumTechBasicHighScore", 7286069460031576924L);
        setLongField(term366826, term366826.getClass(), "sumTechAdvancedHighScore", 3544214541099460990L);
        setLongField(term366826, term366826.getClass(), "sumTechExpertHighScore", -639447623077119427L);
        setLongField(term366826, term366826.getClass(), "sumTechMasterHighScore", 3143743639015944775L);
        setLongField(term366826, term366826.getClass(), "sumTechLunaticHighScore", -3122087619924328901L);
        setLongField(term366826, term366826.getClass(), "sumBattleHighScore", -1707889457511028354L);
        setLongField(term366826, term366826.getClass(), "sumBattleBasicHighScore", 8624276302894085732L);
        setLongField(term366826, term366826.getClass(), "sumBattleAdvancedHighScore", -8068222117659242201L);
        setLongField(term366826, term366826.getClass(), "sumBattleExpertHighScore", 7264681265447786833L);
        setLongField(term366826, term366826.getClass(), "sumBattleMasterHighScore", 7457896296727333242L);
        setLongField(term366826, term366826.getClass(), "sumBattleLunaticHighScore", -4530376873620583541L);
        setField(term366826, term366826.getClass(), "eventWatchedDate", "GGZLBajwVD");
        setField(term366826, term366826.getClass(), "cmEventWatchedDate", "daMQWBQbTQ");
        setField(term366826, term366826.getClass(), "firstGameId", "gvBtppHKAT");
        setField(term366826, term366826.getClass(), "firstRomVersion", "XASeUFhFfD");
        setField(term366826, term366826.getClass(), "firstDataVersion", "BSCfmfVQJL");
        setField(term366826, term366826.getClass(), "firstPlayDate", "IzmbyEyVhg");
        setField(term366826, term366826.getClass(), "lastGameId", "TpeXmkELaB");
        setField(term366826, term366826.getClass(), "lastRomVersion", "JSTwVkCPYc");
        setField(term366826, term366826.getClass(), "lastDataVersion", "drTNVCDCul");
        setField(term366826, term366826.getClass(), "compatibleCmVersion", "iCHBSaWOYR");
        setField(term366826, term366826.getClass(), "lastPlayDate", "nUyvqjKTDL");
        setIntField(term366826, term366826.getClass(), "lastPlaceId", 1653025202);
        setField(term366826, term366826.getClass(), "lastPlaceName", "viaWtUUoxq");
        setIntField(term366826, term366826.getClass(), "lastRegionId", 178095849);
        setField(term366826, term366826.getClass(), "lastRegionName", "ttjDQtxJKK");
        setIntField(term366826, term366826.getClass(), "lastAllNetId", -451106559);
        setField(term366826, term366826.getClass(), "lastClientId", "lrKAysGtED");
        setIntField(term366826, term366826.getClass(), "lastUsedDeckId", 445384426);
        setIntField(term366826, term366826.getClass(), "lastPlayMusicLevel", 2023912788);
        setIntField(term366826, term366826.getClass(), "lastEmoneyBrand", -1542182542);
        setField(term366824, term366824.getClass(), "user", term366826);
        setIntField(term366824, term366824.getClass(), "levelId", 2098007349);
        setIntField(term366824, term366824.getClass(), "allBreakCount", -810105062);
        setIntField(term366824, term366824.getClass(), "allBreakPlusCount", 1921787970);
        term367092 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTechCount");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term367092;
        callMethod(klass, "equals", argTypes, term366824, args);
    }

};


