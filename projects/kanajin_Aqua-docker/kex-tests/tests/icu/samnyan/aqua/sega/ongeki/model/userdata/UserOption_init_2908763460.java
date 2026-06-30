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

public class UserOption_init_2908763460 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term308490;

    public UserOption_init_2908763460() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term308494 = new Long(4548576710115075073L);
        term308490 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term308492 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term308508 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term308509 = newInstance(Class.forName("java.time.LocalDate"));
        Object term308513 = newInstance(Class.forName("java.time.LocalTime"));
        Object term308518 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term308519 = newInstance(Class.forName("java.time.LocalDate"));
        Object term308523 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term308490, term308490.getClass(), "id", 9138691004020726263L);
        setLongField(term308492, term308492.getClass(), "id", -828036660673468059L);
        setField(term308492, term308492.getClass(), "extId", term308494);
        setField(term308492, term308492.getClass(), "luid", "AiITUhJkJU");
        setIntField(term308509, term308509.getClass(), "year", 2013);
        setShortField(term308509, term308509.getClass(), "month", (short) 7);
        setShortField(term308509, term308509.getClass(), "day", (short) 23);
        setField(term308508, term308508.getClass(), "date", term308509);
        setByteField(term308513, term308513.getClass(), "hour", (byte) 17);
        setByteField(term308513, term308513.getClass(), "minute", (byte) 48);
        setByteField(term308513, term308513.getClass(), "second", (byte) 26);
        setIntField(term308513, term308513.getClass(), "nano", 830729623);
        setField(term308508, term308508.getClass(), "time", term308513);
        setField(term308492, term308492.getClass(), "registerTime", term308508);
        setIntField(term308519, term308519.getClass(), "year", 2017);
        setShortField(term308519, term308519.getClass(), "month", (short) 3);
        setShortField(term308519, term308519.getClass(), "day", (short) 4);
        setField(term308518, term308518.getClass(), "date", term308519);
        setByteField(term308523, term308523.getClass(), "hour", (byte) 8);
        setByteField(term308523, term308523.getClass(), "minute", (byte) 46);
        setByteField(term308523, term308523.getClass(), "second", (byte) 7);
        setIntField(term308523, term308523.getClass(), "nano", 282753659);
        setField(term308518, term308518.getClass(), "time", term308523);
        setField(term308492, term308492.getClass(), "accessTime", term308518);
        setField(term308490, term308490.getClass(), "card", term308492);
        setField(term308490, term308490.getClass(), "userName", "vrdcxFmoiP");
        setIntField(term308490, term308490.getClass(), "level", -1985015039);
        setIntField(term308490, term308490.getClass(), "reincarnationNum", 1342441822);
        setLongField(term308490, term308490.getClass(), "exp", 5104069322343212285L);
        setLongField(term308490, term308490.getClass(), "point", 8433767848502479997L);
        setLongField(term308490, term308490.getClass(), "totalPoint", 450011500002908737L);
        setIntField(term308490, term308490.getClass(), "playCount", 368673307);
        setIntField(term308490, term308490.getClass(), "jewelCount", -1720235890);
        setIntField(term308490, term308490.getClass(), "totalJewelCount", -2140644211);
        setIntField(term308490, term308490.getClass(), "medalCount", 1521652550);
        setIntField(term308490, term308490.getClass(), "playerRating", 1361373044);
        setIntField(term308490, term308490.getClass(), "highestRating", -1178276792);
        setIntField(term308490, term308490.getClass(), "battlePoint", -773752165);
        setIntField(term308490, term308490.getClass(), "bestBattlePoint", -1842010799);
        setIntField(term308490, term308490.getClass(), "overDamageBattlePoint", -487747690);
        setBooleanField(term308490, term308490.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term308490, term308490.getClass(), "nameplateId", 1055878202);
        setIntField(term308490, term308490.getClass(), "trophyId", -1662864117);
        setIntField(term308490, term308490.getClass(), "cardId", -1327285672);
        setIntField(term308490, term308490.getClass(), "characterId", 2136037217);
        setIntField(term308490, term308490.getClass(), "characterVoiceNo", 1001407525);
        setIntField(term308490, term308490.getClass(), "tabSetting", -1424893901);
        setIntField(term308490, term308490.getClass(), "tabSortSetting", -446854523);
        setIntField(term308490, term308490.getClass(), "cardCategorySetting", 762171453);
        setIntField(term308490, term308490.getClass(), "cardSortSetting", 912786468);
        setIntField(term308490, term308490.getClass(), "rivalScoreCategorySetting", 66790297);
        setIntField(term308490, term308490.getClass(), "playedTutorialBit", -2003841860);
        setIntField(term308490, term308490.getClass(), "firstTutorialCancelNum", 1224595074);
        setLongField(term308490, term308490.getClass(), "sumTechHighScore", 867587187914624495L);
        setLongField(term308490, term308490.getClass(), "sumTechBasicHighScore", 1577448768531931612L);
        setLongField(term308490, term308490.getClass(), "sumTechAdvancedHighScore", -1632069325593422940L);
        setLongField(term308490, term308490.getClass(), "sumTechExpertHighScore", -3098374862131518839L);
        setLongField(term308490, term308490.getClass(), "sumTechMasterHighScore", 7703388386131020435L);
        setLongField(term308490, term308490.getClass(), "sumTechLunaticHighScore", -8202360978870918775L);
        setLongField(term308490, term308490.getClass(), "sumBattleHighScore", -7149706963528637633L);
        setLongField(term308490, term308490.getClass(), "sumBattleBasicHighScore", 1915443529359178950L);
        setLongField(term308490, term308490.getClass(), "sumBattleAdvancedHighScore", -7738162181745732989L);
        setLongField(term308490, term308490.getClass(), "sumBattleExpertHighScore", 5640741024748725051L);
        setLongField(term308490, term308490.getClass(), "sumBattleMasterHighScore", 6079745410988513937L);
        setLongField(term308490, term308490.getClass(), "sumBattleLunaticHighScore", 8768343595519094674L);
        setField(term308490, term308490.getClass(), "eventWatchedDate", "GtvElQvKPH");
        setField(term308490, term308490.getClass(), "cmEventWatchedDate", "cOSgncciPE");
        setField(term308490, term308490.getClass(), "firstGameId", "DsuqUYdhHr");
        setField(term308490, term308490.getClass(), "firstRomVersion", "zydfWNkGTk");
        setField(term308490, term308490.getClass(), "firstDataVersion", "JQUYGZnGvW");
        setField(term308490, term308490.getClass(), "firstPlayDate", "tnkxAtWMbF");
        setField(term308490, term308490.getClass(), "lastGameId", "XKUBaukekX");
        setField(term308490, term308490.getClass(), "lastRomVersion", "IYWVYrRcKf");
        setField(term308490, term308490.getClass(), "lastDataVersion", "gVkscSyrAF");
        setField(term308490, term308490.getClass(), "compatibleCmVersion", "iEhjaMuTSF");
        setField(term308490, term308490.getClass(), "lastPlayDate", "qJrFbnMItH");
        setIntField(term308490, term308490.getClass(), "lastPlaceId", -52088508);
        setField(term308490, term308490.getClass(), "lastPlaceName", "budoEMvbXU");
        setIntField(term308490, term308490.getClass(), "lastRegionId", 653517054);
        setField(term308490, term308490.getClass(), "lastRegionName", "RrHQiUwApR");
        setIntField(term308490, term308490.getClass(), "lastAllNetId", 109615960);
        setField(term308490, term308490.getClass(), "lastClientId", "hoYSPkUlUz");
        setIntField(term308490, term308490.getClass(), "lastUsedDeckId", -1951421926);
        setIntField(term308490, term308490.getClass(), "lastPlayMusicLevel", -413131943);
        setIntField(term308490, term308490.getClass(), "lastEmoneyBrand", -908007521);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Object[] args = new Object[1];
        args[0] = term308490;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


