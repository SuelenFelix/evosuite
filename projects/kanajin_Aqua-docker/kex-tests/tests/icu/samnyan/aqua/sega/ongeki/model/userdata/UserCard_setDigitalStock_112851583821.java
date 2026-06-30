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
import java.lang.Integer;

public class UserCard_setDigitalStock_112851583821 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term122950;
     Object term123295;

    public UserCard_setDigitalStock_112851583821() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term122956 = new Long(2209808079059619773L);
        term122950 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCard"));
        Object term122952 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term122954 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term122970 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term122971 = newInstance(Class.forName("java.time.LocalDate"));
        Object term122975 = newInstance(Class.forName("java.time.LocalTime"));
        Object term122980 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term122981 = newInstance(Class.forName("java.time.LocalDate"));
        Object term122985 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term122950, term122950.getClass(), "id", 4638802650052629192L);
        setLongField(term122952, term122952.getClass(), "id", -5129146795829557004L);
        setLongField(term122954, term122954.getClass(), "id", -4651290065282223905L);
        setField(term122954, term122954.getClass(), "extId", term122956);
        setField(term122954, term122954.getClass(), "luid", "jzYgniVftZ");
        setIntField(term122971, term122971.getClass(), "year", 2024);
        setShortField(term122971, term122971.getClass(), "month", (short) 5);
        setShortField(term122971, term122971.getClass(), "day", (short) 8);
        setField(term122970, term122970.getClass(), "date", term122971);
        setByteField(term122975, term122975.getClass(), "hour", (byte) 10);
        setByteField(term122975, term122975.getClass(), "minute", (byte) 21);
        setByteField(term122975, term122975.getClass(), "second", (byte) 1);
        setIntField(term122975, term122975.getClass(), "nano", 912060546);
        setField(term122970, term122970.getClass(), "time", term122975);
        setField(term122954, term122954.getClass(), "registerTime", term122970);
        setIntField(term122981, term122981.getClass(), "year", 2016);
        setShortField(term122981, term122981.getClass(), "month", (short) 1);
        setShortField(term122981, term122981.getClass(), "day", (short) 22);
        setField(term122980, term122980.getClass(), "date", term122981);
        setByteField(term122985, term122985.getClass(), "hour", (byte) 23);
        setByteField(term122985, term122985.getClass(), "minute", (byte) 0);
        setByteField(term122985, term122985.getClass(), "second", (byte) 1);
        setIntField(term122985, term122985.getClass(), "nano", 558329369);
        setField(term122980, term122980.getClass(), "time", term122985);
        setField(term122954, term122954.getClass(), "accessTime", term122980);
        setField(term122952, term122952.getClass(), "card", term122954);
        setField(term122952, term122952.getClass(), "userName", "hCbXOXOOYP");
        setIntField(term122952, term122952.getClass(), "level", -825109684);
        setIntField(term122952, term122952.getClass(), "reincarnationNum", -908737984);
        setLongField(term122952, term122952.getClass(), "exp", -6444076581960764384L);
        setLongField(term122952, term122952.getClass(), "point", 7618477983866578895L);
        setLongField(term122952, term122952.getClass(), "totalPoint", 8206014169713481037L);
        setIntField(term122952, term122952.getClass(), "playCount", -1108486320);
        setIntField(term122952, term122952.getClass(), "jewelCount", -1175116960);
        setIntField(term122952, term122952.getClass(), "totalJewelCount", 1090620326);
        setIntField(term122952, term122952.getClass(), "medalCount", 1832573352);
        setIntField(term122952, term122952.getClass(), "playerRating", 17102219);
        setIntField(term122952, term122952.getClass(), "highestRating", -436664138);
        setIntField(term122952, term122952.getClass(), "battlePoint", -1751086046);
        setIntField(term122952, term122952.getClass(), "bestBattlePoint", -384847577);
        setIntField(term122952, term122952.getClass(), "overDamageBattlePoint", -1036512897);
        setBooleanField(term122952, term122952.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term122952, term122952.getClass(), "nameplateId", -862201634);
        setIntField(term122952, term122952.getClass(), "trophyId", -1414284967);
        setIntField(term122952, term122952.getClass(), "cardId", 68026648);
        setIntField(term122952, term122952.getClass(), "characterId", 851471025);
        setIntField(term122952, term122952.getClass(), "characterVoiceNo", 310981701);
        setIntField(term122952, term122952.getClass(), "tabSetting", -1403596364);
        setIntField(term122952, term122952.getClass(), "tabSortSetting", 1473665279);
        setIntField(term122952, term122952.getClass(), "cardCategorySetting", -758072942);
        setIntField(term122952, term122952.getClass(), "cardSortSetting", -88429419);
        setIntField(term122952, term122952.getClass(), "rivalScoreCategorySetting", -125218254);
        setIntField(term122952, term122952.getClass(), "playedTutorialBit", -10117375);
        setIntField(term122952, term122952.getClass(), "firstTutorialCancelNum", 1628351455);
        setLongField(term122952, term122952.getClass(), "sumTechHighScore", -8954633111724973975L);
        setLongField(term122952, term122952.getClass(), "sumTechBasicHighScore", -5717341521813049090L);
        setLongField(term122952, term122952.getClass(), "sumTechAdvancedHighScore", 7473343065111041659L);
        setLongField(term122952, term122952.getClass(), "sumTechExpertHighScore", 2495668465855448583L);
        setLongField(term122952, term122952.getClass(), "sumTechMasterHighScore", -1187939257692936179L);
        setLongField(term122952, term122952.getClass(), "sumTechLunaticHighScore", 4856903758483191927L);
        setLongField(term122952, term122952.getClass(), "sumBattleHighScore", -25599494357789464L);
        setLongField(term122952, term122952.getClass(), "sumBattleBasicHighScore", -7734637563722873167L);
        setLongField(term122952, term122952.getClass(), "sumBattleAdvancedHighScore", 7459242265957184087L);
        setLongField(term122952, term122952.getClass(), "sumBattleExpertHighScore", -650292226426573604L);
        setLongField(term122952, term122952.getClass(), "sumBattleMasterHighScore", 6666616792740026161L);
        setLongField(term122952, term122952.getClass(), "sumBattleLunaticHighScore", -8562629129795659140L);
        setField(term122952, term122952.getClass(), "eventWatchedDate", "QDpqtNZTXP");
        setField(term122952, term122952.getClass(), "cmEventWatchedDate", "ERsxGrzfGd");
        setField(term122952, term122952.getClass(), "firstGameId", "CRKkCjukkS");
        setField(term122952, term122952.getClass(), "firstRomVersion", "PqRZMgCthN");
        setField(term122952, term122952.getClass(), "firstDataVersion", "GrJVQEmmlP");
        setField(term122952, term122952.getClass(), "firstPlayDate", "znnUCOtZMp");
        setField(term122952, term122952.getClass(), "lastGameId", "QhqWOzlnRY");
        setField(term122952, term122952.getClass(), "lastRomVersion", "PgDJdYVklE");
        setField(term122952, term122952.getClass(), "lastDataVersion", "mdNIWipYwz");
        setField(term122952, term122952.getClass(), "compatibleCmVersion", "LPiRxaDRZj");
        setField(term122952, term122952.getClass(), "lastPlayDate", "ghNeQsQdJv");
        setIntField(term122952, term122952.getClass(), "lastPlaceId", -417098935);
        setField(term122952, term122952.getClass(), "lastPlaceName", "WdJpcVlXsy");
        setIntField(term122952, term122952.getClass(), "lastRegionId", 207512423);
        setField(term122952, term122952.getClass(), "lastRegionName", "uYQVtgtMJM");
        setIntField(term122952, term122952.getClass(), "lastAllNetId", -1692495211);
        setField(term122952, term122952.getClass(), "lastClientId", "AxhrYuHpMZ");
        setIntField(term122952, term122952.getClass(), "lastUsedDeckId", -1275247802);
        setIntField(term122952, term122952.getClass(), "lastPlayMusicLevel", -214786685);
        setIntField(term122952, term122952.getClass(), "lastEmoneyBrand", -1563422009);
        setField(term122950, term122950.getClass(), "user", term122952);
        setIntField(term122950, term122950.getClass(), "cardId", -1);
        setIntField(term122950, term122950.getClass(), "digitalStock", 1);
        setIntField(term122950, term122950.getClass(), "analogStock", 1071400572);
        setIntField(term122950, term122950.getClass(), "level", 593230414);
        setIntField(term122950, term122950.getClass(), "maxLevel", 10);
        setIntField(term122950, term122950.getClass(), "exp", 111767836);
        setIntField(term122950, term122950.getClass(), "printCount", -894018524);
        setIntField(term122950, term122950.getClass(), "useCount", -1805793810);
        setBooleanField(term122950, term122950.getClass(), "isNew", true);
        setField(term122950, term122950.getClass(), "kaikaDate", "0000-00-00 00:00:00.0");
        setField(term122950, term122950.getClass(), "choKaikaDate", "0000-00-00 00:00:00.0");
        setIntField(term122950, term122950.getClass(), "skillId", 693687159);
        setBooleanField(term122950, term122950.getClass(), "isAcquired", true);
        setField(term122950, term122950.getClass(), "created", "0000-00-00 00:00:00.0");
        term123295 = new Integer(-1632145668);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCard");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term123295;
        callMethod(klass, "setDigitalStock", argTypes, term122950, args);
    }

};


