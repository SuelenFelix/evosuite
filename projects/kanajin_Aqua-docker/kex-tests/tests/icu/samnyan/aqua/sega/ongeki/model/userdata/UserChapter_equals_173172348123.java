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

public class UserChapter_equals_173172348123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term93614;
     Object term93888;

    public UserChapter_equals_173172348123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term93620 = new Long(3381333711768010594L);
        term93614 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserChapter"));
        Object term93616 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term93618 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term93634 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term93635 = newInstance(Class.forName("java.time.LocalDate"));
        Object term93639 = newInstance(Class.forName("java.time.LocalTime"));
        Object term93644 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term93645 = newInstance(Class.forName("java.time.LocalDate"));
        Object term93649 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term93614, term93614.getClass(), "id", -6992013352199756588L);
        setLongField(term93616, term93616.getClass(), "id", -4792083559351629166L);
        setLongField(term93618, term93618.getClass(), "id", -865520563203189439L);
        setField(term93618, term93618.getClass(), "extId", term93620);
        setField(term93618, term93618.getClass(), "luid", "hvbJVpbmAQ");
        setIntField(term93635, term93635.getClass(), "year", 2017);
        setShortField(term93635, term93635.getClass(), "month", (short) 11);
        setShortField(term93635, term93635.getClass(), "day", (short) 17);
        setField(term93634, term93634.getClass(), "date", term93635);
        setByteField(term93639, term93639.getClass(), "hour", (byte) 8);
        setByteField(term93639, term93639.getClass(), "minute", (byte) 54);
        setByteField(term93639, term93639.getClass(), "second", (byte) 50);
        setIntField(term93639, term93639.getClass(), "nano", 819857135);
        setField(term93634, term93634.getClass(), "time", term93639);
        setField(term93618, term93618.getClass(), "registerTime", term93634);
        setIntField(term93645, term93645.getClass(), "year", 2020);
        setShortField(term93645, term93645.getClass(), "month", (short) 2);
        setShortField(term93645, term93645.getClass(), "day", (short) 27);
        setField(term93644, term93644.getClass(), "date", term93645);
        setByteField(term93649, term93649.getClass(), "hour", (byte) 21);
        setByteField(term93649, term93649.getClass(), "minute", (byte) 35);
        setByteField(term93649, term93649.getClass(), "second", (byte) 42);
        setIntField(term93649, term93649.getClass(), "nano", 887239335);
        setField(term93644, term93644.getClass(), "time", term93649);
        setField(term93618, term93618.getClass(), "accessTime", term93644);
        setField(term93616, term93616.getClass(), "card", term93618);
        setField(term93616, term93616.getClass(), "userName", "aqayJgOWOQ");
        setIntField(term93616, term93616.getClass(), "level", 78399484);
        setIntField(term93616, term93616.getClass(), "reincarnationNum", -529573926);
        setLongField(term93616, term93616.getClass(), "exp", 943353555627069347L);
        setLongField(term93616, term93616.getClass(), "point", 6265344567302607504L);
        setLongField(term93616, term93616.getClass(), "totalPoint", 7538755489771520951L);
        setIntField(term93616, term93616.getClass(), "playCount", 1526559521);
        setIntField(term93616, term93616.getClass(), "jewelCount", -1479591438);
        setIntField(term93616, term93616.getClass(), "totalJewelCount", -1395828554);
        setIntField(term93616, term93616.getClass(), "medalCount", -2081139415);
        setIntField(term93616, term93616.getClass(), "playerRating", 22197373);
        setIntField(term93616, term93616.getClass(), "highestRating", 872043914);
        setIntField(term93616, term93616.getClass(), "battlePoint", -1710077493);
        setIntField(term93616, term93616.getClass(), "bestBattlePoint", -634148056);
        setIntField(term93616, term93616.getClass(), "overDamageBattlePoint", -1791932674);
        setBooleanField(term93616, term93616.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term93616, term93616.getClass(), "nameplateId", -2069953525);
        setIntField(term93616, term93616.getClass(), "trophyId", -1911653858);
        setIntField(term93616, term93616.getClass(), "cardId", 1817540520);
        setIntField(term93616, term93616.getClass(), "characterId", 83060289);
        setIntField(term93616, term93616.getClass(), "characterVoiceNo", -2109132583);
        setIntField(term93616, term93616.getClass(), "tabSetting", -1992824713);
        setIntField(term93616, term93616.getClass(), "tabSortSetting", 1482207601);
        setIntField(term93616, term93616.getClass(), "cardCategorySetting", 1943923769);
        setIntField(term93616, term93616.getClass(), "cardSortSetting", 125133530);
        setIntField(term93616, term93616.getClass(), "rivalScoreCategorySetting", -1931017542);
        setIntField(term93616, term93616.getClass(), "playedTutorialBit", -619243163);
        setIntField(term93616, term93616.getClass(), "firstTutorialCancelNum", 228873608);
        setLongField(term93616, term93616.getClass(), "sumTechHighScore", 7535903882054995964L);
        setLongField(term93616, term93616.getClass(), "sumTechBasicHighScore", 7098896161393358891L);
        setLongField(term93616, term93616.getClass(), "sumTechAdvancedHighScore", 956005912516954859L);
        setLongField(term93616, term93616.getClass(), "sumTechExpertHighScore", -3807584648232803070L);
        setLongField(term93616, term93616.getClass(), "sumTechMasterHighScore", -4029489396713416331L);
        setLongField(term93616, term93616.getClass(), "sumTechLunaticHighScore", -3218047049129179895L);
        setLongField(term93616, term93616.getClass(), "sumBattleHighScore", 7259331600733986087L);
        setLongField(term93616, term93616.getClass(), "sumBattleBasicHighScore", -6438807154292944837L);
        setLongField(term93616, term93616.getClass(), "sumBattleAdvancedHighScore", -6248422485077615101L);
        setLongField(term93616, term93616.getClass(), "sumBattleExpertHighScore", -7827710808655071130L);
        setLongField(term93616, term93616.getClass(), "sumBattleMasterHighScore", -3130570931908226613L);
        setLongField(term93616, term93616.getClass(), "sumBattleLunaticHighScore", -2328605462934533106L);
        setField(term93616, term93616.getClass(), "eventWatchedDate", "YStxlrcedL");
        setField(term93616, term93616.getClass(), "cmEventWatchedDate", "mDLwflwlja");
        setField(term93616, term93616.getClass(), "firstGameId", "RqkgPxDFnv");
        setField(term93616, term93616.getClass(), "firstRomVersion", "egaLajwFgY");
        setField(term93616, term93616.getClass(), "firstDataVersion", "wUXTYOJezz");
        setField(term93616, term93616.getClass(), "firstPlayDate", "dovCZEmPER");
        setField(term93616, term93616.getClass(), "lastGameId", "QIADULuFso");
        setField(term93616, term93616.getClass(), "lastRomVersion", "XWnZIYfmmD");
        setField(term93616, term93616.getClass(), "lastDataVersion", "PbkTntqZDZ");
        setField(term93616, term93616.getClass(), "compatibleCmVersion", "yDWoqUswuW");
        setField(term93616, term93616.getClass(), "lastPlayDate", "mgjEDzRwET");
        setIntField(term93616, term93616.getClass(), "lastPlaceId", 1629097013);
        setField(term93616, term93616.getClass(), "lastPlaceName", "CepeBzACyE");
        setIntField(term93616, term93616.getClass(), "lastRegionId", 875017307);
        setField(term93616, term93616.getClass(), "lastRegionName", "WtgzEUhZIl");
        setIntField(term93616, term93616.getClass(), "lastAllNetId", 523540965);
        setField(term93616, term93616.getClass(), "lastClientId", "tzigWGaijF");
        setIntField(term93616, term93616.getClass(), "lastUsedDeckId", -633850097);
        setIntField(term93616, term93616.getClass(), "lastPlayMusicLevel", -1643146660);
        setIntField(term93616, term93616.getClass(), "lastEmoneyBrand", -706189295);
        setField(term93614, term93614.getClass(), "user", term93616);
        setIntField(term93614, term93614.getClass(), "chapterId", -1332037518);
        setIntField(term93614, term93614.getClass(), "jewelCount", -861800248);
        setIntField(term93614, term93614.getClass(), "lastPlayMusicCategory", -1398648244);
        setIntField(term93614, term93614.getClass(), "lastPlayMusicId", 850063561);
        setIntField(term93614, term93614.getClass(), "lastPlayMusicLevel", -1157169769);
        setBooleanField(term93614, term93614.getClass(), "isStoryWatched", false);
        setBooleanField(term93614, term93614.getClass(), "isClear", false);
        setIntField(term93614, term93614.getClass(), "skipTiming1", -718673454);
        setIntField(term93614, term93614.getClass(), "skipTiming2", -662035181);
        term93888 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserChapter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term93888;
        callMethod(klass, "equals", argTypes, term93614, args);
    }

};


