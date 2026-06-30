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

public class UserScenario_init_14230143350 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96121;

    public UserScenario_init_14230143350() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term96125 = new Long(3288941170644426558L);
        term96121 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term96123 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term96139 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term96140 = newInstance(Class.forName("java.time.LocalDate"));
        Object term96144 = newInstance(Class.forName("java.time.LocalTime"));
        Object term96149 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term96150 = newInstance(Class.forName("java.time.LocalDate"));
        Object term96154 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term96121, term96121.getClass(), "id", -4299409543631835734L);
        setLongField(term96123, term96123.getClass(), "id", 6496498735697852989L);
        setField(term96123, term96123.getClass(), "extId", term96125);
        setField(term96123, term96123.getClass(), "luid", "RYptfEmCie");
        setIntField(term96140, term96140.getClass(), "year", 2020);
        setShortField(term96140, term96140.getClass(), "month", (short) 5);
        setShortField(term96140, term96140.getClass(), "day", (short) 25);
        setField(term96139, term96139.getClass(), "date", term96140);
        setByteField(term96144, term96144.getClass(), "hour", (byte) 4);
        setByteField(term96144, term96144.getClass(), "minute", (byte) 20);
        setByteField(term96144, term96144.getClass(), "second", (byte) 39);
        setIntField(term96144, term96144.getClass(), "nano", 382102366);
        setField(term96139, term96139.getClass(), "time", term96144);
        setField(term96123, term96123.getClass(), "registerTime", term96139);
        setIntField(term96150, term96150.getClass(), "year", 2023);
        setShortField(term96150, term96150.getClass(), "month", (short) 3);
        setShortField(term96150, term96150.getClass(), "day", (short) 4);
        setField(term96149, term96149.getClass(), "date", term96150);
        setByteField(term96154, term96154.getClass(), "hour", (byte) 20);
        setByteField(term96154, term96154.getClass(), "minute", (byte) 17);
        setByteField(term96154, term96154.getClass(), "second", (byte) 33);
        setIntField(term96154, term96154.getClass(), "nano", 193707533);
        setField(term96149, term96149.getClass(), "time", term96154);
        setField(term96123, term96123.getClass(), "accessTime", term96149);
        setField(term96121, term96121.getClass(), "card", term96123);
        setField(term96121, term96121.getClass(), "userName", "roQkSUEGom");
        setIntField(term96121, term96121.getClass(), "level", 186607713);
        setIntField(term96121, term96121.getClass(), "reincarnationNum", -400018942);
        setLongField(term96121, term96121.getClass(), "exp", 7607548906254675970L);
        setLongField(term96121, term96121.getClass(), "point", 5281800336304339067L);
        setLongField(term96121, term96121.getClass(), "totalPoint", -4878234287626708686L);
        setIntField(term96121, term96121.getClass(), "playCount", -101025934);
        setIntField(term96121, term96121.getClass(), "jewelCount", 1587463337);
        setIntField(term96121, term96121.getClass(), "totalJewelCount", 463114370);
        setIntField(term96121, term96121.getClass(), "medalCount", 1541842334);
        setIntField(term96121, term96121.getClass(), "playerRating", 947697692);
        setIntField(term96121, term96121.getClass(), "highestRating", -372056343);
        setIntField(term96121, term96121.getClass(), "battlePoint", 625501454);
        setIntField(term96121, term96121.getClass(), "bestBattlePoint", -1941817273);
        setIntField(term96121, term96121.getClass(), "overDamageBattlePoint", -919598814);
        setBooleanField(term96121, term96121.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term96121, term96121.getClass(), "nameplateId", -1521283679);
        setIntField(term96121, term96121.getClass(), "trophyId", 1502377250);
        setIntField(term96121, term96121.getClass(), "cardId", 1581416400);
        setIntField(term96121, term96121.getClass(), "characterId", 1963777573);
        setIntField(term96121, term96121.getClass(), "characterVoiceNo", -998538950);
        setIntField(term96121, term96121.getClass(), "tabSetting", 1644825964);
        setIntField(term96121, term96121.getClass(), "tabSortSetting", -331554346);
        setIntField(term96121, term96121.getClass(), "cardCategorySetting", -774907545);
        setIntField(term96121, term96121.getClass(), "cardSortSetting", -2104980850);
        setIntField(term96121, term96121.getClass(), "rivalScoreCategorySetting", -1700414059);
        setIntField(term96121, term96121.getClass(), "playedTutorialBit", 894475811);
        setIntField(term96121, term96121.getClass(), "firstTutorialCancelNum", -1219489703);
        setLongField(term96121, term96121.getClass(), "sumTechHighScore", -2024073282985790424L);
        setLongField(term96121, term96121.getClass(), "sumTechBasicHighScore", -3649102514229401546L);
        setLongField(term96121, term96121.getClass(), "sumTechAdvancedHighScore", 3713715739646445715L);
        setLongField(term96121, term96121.getClass(), "sumTechExpertHighScore", -8676537686298141977L);
        setLongField(term96121, term96121.getClass(), "sumTechMasterHighScore", 551686776820505988L);
        setLongField(term96121, term96121.getClass(), "sumTechLunaticHighScore", -8646107147325484092L);
        setLongField(term96121, term96121.getClass(), "sumBattleHighScore", 8466615981775064224L);
        setLongField(term96121, term96121.getClass(), "sumBattleBasicHighScore", 2731353493639960564L);
        setLongField(term96121, term96121.getClass(), "sumBattleAdvancedHighScore", 6896878573943470353L);
        setLongField(term96121, term96121.getClass(), "sumBattleExpertHighScore", 1888273898418481547L);
        setLongField(term96121, term96121.getClass(), "sumBattleMasterHighScore", 8023833370051493222L);
        setLongField(term96121, term96121.getClass(), "sumBattleLunaticHighScore", -6914694737907908084L);
        setField(term96121, term96121.getClass(), "eventWatchedDate", "sKmuUYuuTa");
        setField(term96121, term96121.getClass(), "cmEventWatchedDate", "KxdfNdyjGO");
        setField(term96121, term96121.getClass(), "firstGameId", "vPinPzceBb");
        setField(term96121, term96121.getClass(), "firstRomVersion", "jPhUwTVUvX");
        setField(term96121, term96121.getClass(), "firstDataVersion", "GIBMEPcBjc");
        setField(term96121, term96121.getClass(), "firstPlayDate", "noofsnMNpz");
        setField(term96121, term96121.getClass(), "lastGameId", "zorMRlODHM");
        setField(term96121, term96121.getClass(), "lastRomVersion", "xLZEtHhKOn");
        setField(term96121, term96121.getClass(), "lastDataVersion", "wfqnUhLFCy");
        setField(term96121, term96121.getClass(), "compatibleCmVersion", "UKRJIjNXmC");
        setField(term96121, term96121.getClass(), "lastPlayDate", "CJBElYMXZF");
        setIntField(term96121, term96121.getClass(), "lastPlaceId", 710854131);
        setField(term96121, term96121.getClass(), "lastPlaceName", "uZOAWgAORh");
        setIntField(term96121, term96121.getClass(), "lastRegionId", 1477787899);
        setField(term96121, term96121.getClass(), "lastRegionName", "fmFvklptLM");
        setIntField(term96121, term96121.getClass(), "lastAllNetId", 296655703);
        setField(term96121, term96121.getClass(), "lastClientId", "CYfPHswxIT");
        setIntField(term96121, term96121.getClass(), "lastUsedDeckId", -1558411918);
        setIntField(term96121, term96121.getClass(), "lastPlayMusicLevel", 595358328);
        setIntField(term96121, term96121.getClass(), "lastEmoneyBrand", -1447510365);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserScenario");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Object[] args = new Object[1];
        args[0] = term96121;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


