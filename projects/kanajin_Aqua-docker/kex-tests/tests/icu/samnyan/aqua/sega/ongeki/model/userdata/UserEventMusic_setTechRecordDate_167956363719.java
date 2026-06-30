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

public class UserEventMusic_setTechRecordDate_167956363719 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term378087;

    public UserEventMusic_setTechRecordDate_167956363719() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term378093 = new Long(4098407345651793258L);
        term378087 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserEventMusic"));
        Object term378089 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term378091 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term378107 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term378108 = newInstance(Class.forName("java.time.LocalDate"));
        Object term378112 = newInstance(Class.forName("java.time.LocalTime"));
        Object term378117 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term378118 = newInstance(Class.forName("java.time.LocalDate"));
        Object term378122 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term378087, term378087.getClass(), "id", -7194337761874127990L);
        setLongField(term378089, term378089.getClass(), "id", 3319779540744788344L);
        setLongField(term378091, term378091.getClass(), "id", 6539809190615602526L);
        setField(term378091, term378091.getClass(), "extId", term378093);
        setField(term378091, term378091.getClass(), "luid", "ATIgfeMsOV");
        setIntField(term378108, term378108.getClass(), "year", 2019);
        setShortField(term378108, term378108.getClass(), "month", (short) 10);
        setShortField(term378108, term378108.getClass(), "day", (short) 26);
        setField(term378107, term378107.getClass(), "date", term378108);
        setByteField(term378112, term378112.getClass(), "hour", (byte) 11);
        setByteField(term378112, term378112.getClass(), "minute", (byte) 19);
        setByteField(term378112, term378112.getClass(), "second", (byte) 48);
        setIntField(term378112, term378112.getClass(), "nano", 189674146);
        setField(term378107, term378107.getClass(), "time", term378112);
        setField(term378091, term378091.getClass(), "registerTime", term378107);
        setIntField(term378118, term378118.getClass(), "year", 2014);
        setShortField(term378118, term378118.getClass(), "month", (short) 6);
        setShortField(term378118, term378118.getClass(), "day", (short) 23);
        setField(term378117, term378117.getClass(), "date", term378118);
        setByteField(term378122, term378122.getClass(), "hour", (byte) 1);
        setByteField(term378122, term378122.getClass(), "minute", (byte) 31);
        setByteField(term378122, term378122.getClass(), "second", (byte) 38);
        setIntField(term378122, term378122.getClass(), "nano", 288745850);
        setField(term378117, term378117.getClass(), "time", term378122);
        setField(term378091, term378091.getClass(), "accessTime", term378117);
        setField(term378089, term378089.getClass(), "card", term378091);
        setField(term378089, term378089.getClass(), "userName", "jaERgzZpZs");
        setIntField(term378089, term378089.getClass(), "level", 974683425);
        setIntField(term378089, term378089.getClass(), "reincarnationNum", 641822467);
        setLongField(term378089, term378089.getClass(), "exp", 6706158168337837144L);
        setLongField(term378089, term378089.getClass(), "point", 7402253591394607386L);
        setLongField(term378089, term378089.getClass(), "totalPoint", -6554392465675484995L);
        setIntField(term378089, term378089.getClass(), "playCount", -1872489289);
        setIntField(term378089, term378089.getClass(), "jewelCount", 1184593185);
        setIntField(term378089, term378089.getClass(), "totalJewelCount", -2146103227);
        setIntField(term378089, term378089.getClass(), "medalCount", -41981877);
        setIntField(term378089, term378089.getClass(), "playerRating", 1068311383);
        setIntField(term378089, term378089.getClass(), "highestRating", 411636515);
        setIntField(term378089, term378089.getClass(), "battlePoint", -606302219);
        setIntField(term378089, term378089.getClass(), "bestBattlePoint", 1571772499);
        setIntField(term378089, term378089.getClass(), "overDamageBattlePoint", 58748297);
        setBooleanField(term378089, term378089.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term378089, term378089.getClass(), "nameplateId", -2026652455);
        setIntField(term378089, term378089.getClass(), "trophyId", 1377742875);
        setIntField(term378089, term378089.getClass(), "cardId", 440743051);
        setIntField(term378089, term378089.getClass(), "characterId", 1230595174);
        setIntField(term378089, term378089.getClass(), "characterVoiceNo", 941555370);
        setIntField(term378089, term378089.getClass(), "tabSetting", -323535726);
        setIntField(term378089, term378089.getClass(), "tabSortSetting", -1576331582);
        setIntField(term378089, term378089.getClass(), "cardCategorySetting", -1989107035);
        setIntField(term378089, term378089.getClass(), "cardSortSetting", -857276891);
        setIntField(term378089, term378089.getClass(), "rivalScoreCategorySetting", 2117099734);
        setIntField(term378089, term378089.getClass(), "playedTutorialBit", 2079685831);
        setIntField(term378089, term378089.getClass(), "firstTutorialCancelNum", 24665460);
        setLongField(term378089, term378089.getClass(), "sumTechHighScore", 7992951990682179008L);
        setLongField(term378089, term378089.getClass(), "sumTechBasicHighScore", 7566658333584494366L);
        setLongField(term378089, term378089.getClass(), "sumTechAdvancedHighScore", -5926878215581122643L);
        setLongField(term378089, term378089.getClass(), "sumTechExpertHighScore", -5000130266482189798L);
        setLongField(term378089, term378089.getClass(), "sumTechMasterHighScore", 418832848119670850L);
        setLongField(term378089, term378089.getClass(), "sumTechLunaticHighScore", 6768071667555729596L);
        setLongField(term378089, term378089.getClass(), "sumBattleHighScore", 4845501735174192070L);
        setLongField(term378089, term378089.getClass(), "sumBattleBasicHighScore", -5864515065271652097L);
        setLongField(term378089, term378089.getClass(), "sumBattleAdvancedHighScore", 2872465380789873035L);
        setLongField(term378089, term378089.getClass(), "sumBattleExpertHighScore", -3694482437246648684L);
        setLongField(term378089, term378089.getClass(), "sumBattleMasterHighScore", -1503547135752084914L);
        setLongField(term378089, term378089.getClass(), "sumBattleLunaticHighScore", -4359504032859938334L);
        setField(term378089, term378089.getClass(), "eventWatchedDate", "XYoVPHxeyo");
        setField(term378089, term378089.getClass(), "cmEventWatchedDate", "cbjmISHslg");
        setField(term378089, term378089.getClass(), "firstGameId", "BkXpkQPNOT");
        setField(term378089, term378089.getClass(), "firstRomVersion", "XHLKiyqjGj");
        setField(term378089, term378089.getClass(), "firstDataVersion", "IcfRPeVQzg");
        setField(term378089, term378089.getClass(), "firstPlayDate", "dNZKZNgKGF");
        setField(term378089, term378089.getClass(), "lastGameId", "yNUtbMlhNf");
        setField(term378089, term378089.getClass(), "lastRomVersion", "eHvxXssaKr");
        setField(term378089, term378089.getClass(), "lastDataVersion", "RhIMXJgnoS");
        setField(term378089, term378089.getClass(), "compatibleCmVersion", "tvMiyiLSlL");
        setField(term378089, term378089.getClass(), "lastPlayDate", "eDBXIeleUw");
        setIntField(term378089, term378089.getClass(), "lastPlaceId", -1907688379);
        setField(term378089, term378089.getClass(), "lastPlaceName", "fypoGGlvtB");
        setIntField(term378089, term378089.getClass(), "lastRegionId", -185256197);
        setField(term378089, term378089.getClass(), "lastRegionName", "zNTuElUkJH");
        setIntField(term378089, term378089.getClass(), "lastAllNetId", -2130092461);
        setField(term378089, term378089.getClass(), "lastClientId", "JDrXIGnDFI");
        setIntField(term378089, term378089.getClass(), "lastUsedDeckId", -110195062);
        setIntField(term378089, term378089.getClass(), "lastPlayMusicLevel", -1377355787);
        setIntField(term378089, term378089.getClass(), "lastEmoneyBrand", -1565928992);
        setField(term378087, term378087.getClass(), "user", term378089);
        setIntField(term378087, term378087.getClass(), "eventId", -705479387);
        setIntField(term378087, term378087.getClass(), "type", -627102852);
        setIntField(term378087, term378087.getClass(), "musicId", -380898091);
        setIntField(term378087, term378087.getClass(), "level", -1849870684);
        setIntField(term378087, term378087.getClass(), "techScoreMax", 255628143);
        setIntField(term378087, term378087.getClass(), "platinumScoreMax", 398589520);
        setField(term378087, term378087.getClass(), "techRecordDate", "xTdlEQSuBq");
        setBooleanField(term378087, term378087.getClass(), "isTechNewRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserEventMusic");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PFGSSQCYPp";
        callMethod(klass, "setTechRecordDate", argTypes, term378087, args);
    }

};


