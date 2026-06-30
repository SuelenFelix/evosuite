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

public class UserGeneralData_getId_20618370931 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term294213;

    public UserGeneralData_getId_20618370931() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term294219 = new Long(-2720964670491002091L);
        term294213 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserGeneralData"));
        Object term294215 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term294217 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term294233 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term294234 = newInstance(Class.forName("java.time.LocalDate"));
        Object term294238 = newInstance(Class.forName("java.time.LocalTime"));
        Object term294243 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term294244 = newInstance(Class.forName("java.time.LocalDate"));
        Object term294248 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term294213, term294213.getClass(), "id", -5422291707781154248L);
        setLongField(term294215, term294215.getClass(), "id", 6909533123351505003L);
        setLongField(term294217, term294217.getClass(), "id", -8322379433771819427L);
        setField(term294217, term294217.getClass(), "extId", term294219);
        setField(term294217, term294217.getClass(), "luid", "zOpsVAnrwk");
        setIntField(term294234, term294234.getClass(), "year", 2025);
        setShortField(term294234, term294234.getClass(), "month", (short) 10);
        setShortField(term294234, term294234.getClass(), "day", (short) 9);
        setField(term294233, term294233.getClass(), "date", term294234);
        setByteField(term294238, term294238.getClass(), "hour", (byte) 4);
        setByteField(term294238, term294238.getClass(), "minute", (byte) 55);
        setByteField(term294238, term294238.getClass(), "second", (byte) 37);
        setIntField(term294238, term294238.getClass(), "nano", 431574004);
        setField(term294233, term294233.getClass(), "time", term294238);
        setField(term294217, term294217.getClass(), "registerTime", term294233);
        setIntField(term294244, term294244.getClass(), "year", 2028);
        setShortField(term294244, term294244.getClass(), "month", (short) 4);
        setShortField(term294244, term294244.getClass(), "day", (short) 3);
        setField(term294243, term294243.getClass(), "date", term294244);
        setByteField(term294248, term294248.getClass(), "hour", (byte) 22);
        setByteField(term294248, term294248.getClass(), "minute", (byte) 17);
        setByteField(term294248, term294248.getClass(), "second", (byte) 37);
        setIntField(term294248, term294248.getClass(), "nano", 480386978);
        setField(term294243, term294243.getClass(), "time", term294248);
        setField(term294217, term294217.getClass(), "accessTime", term294243);
        setField(term294215, term294215.getClass(), "card", term294217);
        setField(term294215, term294215.getClass(), "userName", "nnUWRbjEHe");
        setIntField(term294215, term294215.getClass(), "level", 1839854669);
        setIntField(term294215, term294215.getClass(), "reincarnationNum", -254326776);
        setLongField(term294215, term294215.getClass(), "exp", 7168468373953571623L);
        setLongField(term294215, term294215.getClass(), "point", -2189945166726158705L);
        setLongField(term294215, term294215.getClass(), "totalPoint", 6008405949487711870L);
        setIntField(term294215, term294215.getClass(), "playCount", 1210575332);
        setIntField(term294215, term294215.getClass(), "jewelCount", 258225079);
        setIntField(term294215, term294215.getClass(), "totalJewelCount", -46744367);
        setIntField(term294215, term294215.getClass(), "medalCount", 1667028397);
        setIntField(term294215, term294215.getClass(), "playerRating", -676471924);
        setIntField(term294215, term294215.getClass(), "highestRating", 1494923419);
        setIntField(term294215, term294215.getClass(), "battlePoint", 556950465);
        setIntField(term294215, term294215.getClass(), "bestBattlePoint", 1099903179);
        setIntField(term294215, term294215.getClass(), "overDamageBattlePoint", -1521358551);
        setBooleanField(term294215, term294215.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term294215, term294215.getClass(), "nameplateId", 1832556877);
        setIntField(term294215, term294215.getClass(), "trophyId", -1087471651);
        setIntField(term294215, term294215.getClass(), "cardId", 1869899776);
        setIntField(term294215, term294215.getClass(), "characterId", 2034369438);
        setIntField(term294215, term294215.getClass(), "characterVoiceNo", -1784707255);
        setIntField(term294215, term294215.getClass(), "tabSetting", -1007991583);
        setIntField(term294215, term294215.getClass(), "tabSortSetting", 509641395);
        setIntField(term294215, term294215.getClass(), "cardCategorySetting", -1784404553);
        setIntField(term294215, term294215.getClass(), "cardSortSetting", -1943012393);
        setIntField(term294215, term294215.getClass(), "rivalScoreCategorySetting", -1950346318);
        setIntField(term294215, term294215.getClass(), "playedTutorialBit", 989437746);
        setIntField(term294215, term294215.getClass(), "firstTutorialCancelNum", 1117487487);
        setLongField(term294215, term294215.getClass(), "sumTechHighScore", 6264051857734578091L);
        setLongField(term294215, term294215.getClass(), "sumTechBasicHighScore", -4814895510042195285L);
        setLongField(term294215, term294215.getClass(), "sumTechAdvancedHighScore", 5150955163420602050L);
        setLongField(term294215, term294215.getClass(), "sumTechExpertHighScore", -7681533259990346189L);
        setLongField(term294215, term294215.getClass(), "sumTechMasterHighScore", -3251314307262751784L);
        setLongField(term294215, term294215.getClass(), "sumTechLunaticHighScore", 3569957616464840778L);
        setLongField(term294215, term294215.getClass(), "sumBattleHighScore", 8869826270410540265L);
        setLongField(term294215, term294215.getClass(), "sumBattleBasicHighScore", 7515900806840218998L);
        setLongField(term294215, term294215.getClass(), "sumBattleAdvancedHighScore", 2670476342408744236L);
        setLongField(term294215, term294215.getClass(), "sumBattleExpertHighScore", 8622173942291939954L);
        setLongField(term294215, term294215.getClass(), "sumBattleMasterHighScore", 2347459488676060314L);
        setLongField(term294215, term294215.getClass(), "sumBattleLunaticHighScore", -7682483871334315692L);
        setField(term294215, term294215.getClass(), "eventWatchedDate", "nqnYFZYCst");
        setField(term294215, term294215.getClass(), "cmEventWatchedDate", "cyTSgJMCVE");
        setField(term294215, term294215.getClass(), "firstGameId", "yooiSdRAOb");
        setField(term294215, term294215.getClass(), "firstRomVersion", "SoTgnoBFiD");
        setField(term294215, term294215.getClass(), "firstDataVersion", "xkhqTWXZqZ");
        setField(term294215, term294215.getClass(), "firstPlayDate", "ABldombRYF");
        setField(term294215, term294215.getClass(), "lastGameId", "LJiniBXnjB");
        setField(term294215, term294215.getClass(), "lastRomVersion", "ySvbXaxFVk");
        setField(term294215, term294215.getClass(), "lastDataVersion", "IkBWbcZtiH");
        setField(term294215, term294215.getClass(), "compatibleCmVersion", "mItcHoacSH");
        setField(term294215, term294215.getClass(), "lastPlayDate", "fzMkBxNUHB");
        setIntField(term294215, term294215.getClass(), "lastPlaceId", 1631255765);
        setField(term294215, term294215.getClass(), "lastPlaceName", "qzVIBCSTKC");
        setIntField(term294215, term294215.getClass(), "lastRegionId", -1811916333);
        setField(term294215, term294215.getClass(), "lastRegionName", "ITnfwxpCsl");
        setIntField(term294215, term294215.getClass(), "lastAllNetId", 752701210);
        setField(term294215, term294215.getClass(), "lastClientId", "KZCgNQgPRl");
        setIntField(term294215, term294215.getClass(), "lastUsedDeckId", -589123886);
        setIntField(term294215, term294215.getClass(), "lastPlayMusicLevel", -2123961926);
        setIntField(term294215, term294215.getClass(), "lastEmoneyBrand", 92959773);
        setField(term294213, term294213.getClass(), "user", term294215);
        setField(term294213, term294213.getClass(), "propertyKey", "cRXtToSuNf");
        setField(term294213, term294213.getClass(), "propertyValue", "EGhoDGUsdp");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserGeneralData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term294213, args);
    }

};


