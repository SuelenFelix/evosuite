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

public class UserTechCount_init_16794246360 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term361690;

    public UserTechCount_init_16794246360() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term361694 = new Long(-6903160242975707710L);
        term361690 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term361692 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term361708 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term361709 = newInstance(Class.forName("java.time.LocalDate"));
        Object term361713 = newInstance(Class.forName("java.time.LocalTime"));
        Object term361718 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term361719 = newInstance(Class.forName("java.time.LocalDate"));
        Object term361723 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term361690, term361690.getClass(), "id", -8148263096129141221L);
        setLongField(term361692, term361692.getClass(), "id", -4400816046710042783L);
        setField(term361692, term361692.getClass(), "extId", term361694);
        setField(term361692, term361692.getClass(), "luid", "umZbyHuBhr");
        setIntField(term361709, term361709.getClass(), "year", 2023);
        setShortField(term361709, term361709.getClass(), "month", (short) 5);
        setShortField(term361709, term361709.getClass(), "day", (short) 16);
        setField(term361708, term361708.getClass(), "date", term361709);
        setByteField(term361713, term361713.getClass(), "hour", (byte) 5);
        setByteField(term361713, term361713.getClass(), "minute", (byte) 46);
        setByteField(term361713, term361713.getClass(), "second", (byte) 46);
        setIntField(term361713, term361713.getClass(), "nano", 113942424);
        setField(term361708, term361708.getClass(), "time", term361713);
        setField(term361692, term361692.getClass(), "registerTime", term361708);
        setIntField(term361719, term361719.getClass(), "year", 2019);
        setShortField(term361719, term361719.getClass(), "month", (short) 3);
        setShortField(term361719, term361719.getClass(), "day", (short) 18);
        setField(term361718, term361718.getClass(), "date", term361719);
        setByteField(term361723, term361723.getClass(), "hour", (byte) 20);
        setByteField(term361723, term361723.getClass(), "minute", (byte) 45);
        setByteField(term361723, term361723.getClass(), "second", (byte) 18);
        setIntField(term361723, term361723.getClass(), "nano", 876974816);
        setField(term361718, term361718.getClass(), "time", term361723);
        setField(term361692, term361692.getClass(), "accessTime", term361718);
        setField(term361690, term361690.getClass(), "card", term361692);
        setField(term361690, term361690.getClass(), "userName", "tOrFBrfbWp");
        setIntField(term361690, term361690.getClass(), "level", 261589942);
        setIntField(term361690, term361690.getClass(), "reincarnationNum", -1946341733);
        setLongField(term361690, term361690.getClass(), "exp", -2071204190639763517L);
        setLongField(term361690, term361690.getClass(), "point", 9169021315653746377L);
        setLongField(term361690, term361690.getClass(), "totalPoint", 1880955838303009684L);
        setIntField(term361690, term361690.getClass(), "playCount", -1478962098);
        setIntField(term361690, term361690.getClass(), "jewelCount", -1046659377);
        setIntField(term361690, term361690.getClass(), "totalJewelCount", -1368626821);
        setIntField(term361690, term361690.getClass(), "medalCount", 584468414);
        setIntField(term361690, term361690.getClass(), "playerRating", -1938531976);
        setIntField(term361690, term361690.getClass(), "highestRating", 1422513561);
        setIntField(term361690, term361690.getClass(), "battlePoint", 1384791953);
        setIntField(term361690, term361690.getClass(), "bestBattlePoint", -107283668);
        setIntField(term361690, term361690.getClass(), "overDamageBattlePoint", -15158914);
        setBooleanField(term361690, term361690.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term361690, term361690.getClass(), "nameplateId", 1088854544);
        setIntField(term361690, term361690.getClass(), "trophyId", -91572064);
        setIntField(term361690, term361690.getClass(), "cardId", -998842458);
        setIntField(term361690, term361690.getClass(), "characterId", -1390611316);
        setIntField(term361690, term361690.getClass(), "characterVoiceNo", -365990867);
        setIntField(term361690, term361690.getClass(), "tabSetting", -1208351108);
        setIntField(term361690, term361690.getClass(), "tabSortSetting", -1396961685);
        setIntField(term361690, term361690.getClass(), "cardCategorySetting", -412003932);
        setIntField(term361690, term361690.getClass(), "cardSortSetting", 1119655367);
        setIntField(term361690, term361690.getClass(), "rivalScoreCategorySetting", 2108359300);
        setIntField(term361690, term361690.getClass(), "playedTutorialBit", 1409205705);
        setIntField(term361690, term361690.getClass(), "firstTutorialCancelNum", 31735713);
        setLongField(term361690, term361690.getClass(), "sumTechHighScore", -4638654850127091092L);
        setLongField(term361690, term361690.getClass(), "sumTechBasicHighScore", 4643731843332700620L);
        setLongField(term361690, term361690.getClass(), "sumTechAdvancedHighScore", 4049343605294284484L);
        setLongField(term361690, term361690.getClass(), "sumTechExpertHighScore", -2115429628313215274L);
        setLongField(term361690, term361690.getClass(), "sumTechMasterHighScore", 53673277741141446L);
        setLongField(term361690, term361690.getClass(), "sumTechLunaticHighScore", -7508213917551816719L);
        setLongField(term361690, term361690.getClass(), "sumBattleHighScore", 3726712864090162723L);
        setLongField(term361690, term361690.getClass(), "sumBattleBasicHighScore", -856113354322094577L);
        setLongField(term361690, term361690.getClass(), "sumBattleAdvancedHighScore", 6032375296033987274L);
        setLongField(term361690, term361690.getClass(), "sumBattleExpertHighScore", 6217704839054670591L);
        setLongField(term361690, term361690.getClass(), "sumBattleMasterHighScore", 8259271831368818353L);
        setLongField(term361690, term361690.getClass(), "sumBattleLunaticHighScore", 8269420402552902861L);
        setField(term361690, term361690.getClass(), "eventWatchedDate", "lmFPylVjXc");
        setField(term361690, term361690.getClass(), "cmEventWatchedDate", "JWkqmdEawJ");
        setField(term361690, term361690.getClass(), "firstGameId", "vvuzTrHlgy");
        setField(term361690, term361690.getClass(), "firstRomVersion", "YJrFsMWVir");
        setField(term361690, term361690.getClass(), "firstDataVersion", "qOiyGQvBYd");
        setField(term361690, term361690.getClass(), "firstPlayDate", "pLqzknftJT");
        setField(term361690, term361690.getClass(), "lastGameId", "ThVBdUbZdZ");
        setField(term361690, term361690.getClass(), "lastRomVersion", "aczVliXJwv");
        setField(term361690, term361690.getClass(), "lastDataVersion", "arwgNGuWdv");
        setField(term361690, term361690.getClass(), "compatibleCmVersion", "qMURXVkZvu");
        setField(term361690, term361690.getClass(), "lastPlayDate", "OcsyFzRMMM");
        setIntField(term361690, term361690.getClass(), "lastPlaceId", 749879628);
        setField(term361690, term361690.getClass(), "lastPlaceName", "searaDdQeL");
        setIntField(term361690, term361690.getClass(), "lastRegionId", 411201615);
        setField(term361690, term361690.getClass(), "lastRegionName", "zVqsalzJmP");
        setIntField(term361690, term361690.getClass(), "lastAllNetId", 128983286);
        setField(term361690, term361690.getClass(), "lastClientId", "vvKAGoTfGL");
        setIntField(term361690, term361690.getClass(), "lastUsedDeckId", -1667548552);
        setIntField(term361690, term361690.getClass(), "lastPlayMusicLevel", -1352390739);
        setIntField(term361690, term361690.getClass(), "lastEmoneyBrand", -756988284);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTechCount");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Object[] args = new Object[1];
        args[0] = term361690;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


