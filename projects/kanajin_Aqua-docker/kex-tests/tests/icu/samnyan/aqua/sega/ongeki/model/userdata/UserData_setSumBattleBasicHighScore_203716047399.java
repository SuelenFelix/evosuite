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

public class UserData_setSumBattleBasicHighScore_203716047399 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63933;
     Object term64196;

    public UserData_setSumBattleBasicHighScore_203716047399() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term63937 = new Long(5381386339318883012L);
        term63933 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term63935 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term63951 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term63952 = newInstance(Class.forName("java.time.LocalDate"));
        Object term63956 = newInstance(Class.forName("java.time.LocalTime"));
        Object term63961 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term63962 = newInstance(Class.forName("java.time.LocalDate"));
        Object term63966 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term63933, term63933.getClass(), "id", 2046502707476774311L);
        setLongField(term63935, term63935.getClass(), "id", 2858054432801655096L);
        setField(term63935, term63935.getClass(), "extId", term63937);
        setField(term63935, term63935.getClass(), "luid", "fbsmDvjMqr");
        setIntField(term63952, term63952.getClass(), "year", 2018);
        setShortField(term63952, term63952.getClass(), "month", (short) 12);
        setShortField(term63952, term63952.getClass(), "day", (short) 17);
        setField(term63951, term63951.getClass(), "date", term63952);
        setByteField(term63956, term63956.getClass(), "hour", (byte) 2);
        setByteField(term63956, term63956.getClass(), "minute", (byte) 8);
        setByteField(term63956, term63956.getClass(), "second", (byte) 33);
        setIntField(term63956, term63956.getClass(), "nano", 799805513);
        setField(term63951, term63951.getClass(), "time", term63956);
        setField(term63935, term63935.getClass(), "registerTime", term63951);
        setIntField(term63962, term63962.getClass(), "year", 2015);
        setShortField(term63962, term63962.getClass(), "month", (short) 12);
        setShortField(term63962, term63962.getClass(), "day", (short) 18);
        setField(term63961, term63961.getClass(), "date", term63962);
        setByteField(term63966, term63966.getClass(), "hour", (byte) 21);
        setByteField(term63966, term63966.getClass(), "minute", (byte) 45);
        setByteField(term63966, term63966.getClass(), "second", (byte) 43);
        setIntField(term63966, term63966.getClass(), "nano", 629261984);
        setField(term63961, term63961.getClass(), "time", term63966);
        setField(term63935, term63935.getClass(), "accessTime", term63961);
        setField(term63933, term63933.getClass(), "card", term63935);
        setField(term63933, term63933.getClass(), "userName", "tycssGWZvU");
        setIntField(term63933, term63933.getClass(), "level", 2061882718);
        setIntField(term63933, term63933.getClass(), "reincarnationNum", -263593334);
        setLongField(term63933, term63933.getClass(), "exp", 7592342194406039680L);
        setLongField(term63933, term63933.getClass(), "point", 2743687876169258951L);
        setLongField(term63933, term63933.getClass(), "totalPoint", 4986949395725716497L);
        setIntField(term63933, term63933.getClass(), "playCount", 257595375);
        setIntField(term63933, term63933.getClass(), "jewelCount", 1494109106);
        setIntField(term63933, term63933.getClass(), "totalJewelCount", 1902576230);
        setIntField(term63933, term63933.getClass(), "medalCount", -1040460528);
        setIntField(term63933, term63933.getClass(), "playerRating", 990725836);
        setIntField(term63933, term63933.getClass(), "highestRating", -1231785501);
        setIntField(term63933, term63933.getClass(), "battlePoint", -2112346885);
        setIntField(term63933, term63933.getClass(), "bestBattlePoint", -26311618);
        setIntField(term63933, term63933.getClass(), "overDamageBattlePoint", -671595545);
        setBooleanField(term63933, term63933.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term63933, term63933.getClass(), "nameplateId", -143541686);
        setIntField(term63933, term63933.getClass(), "trophyId", -1201234880);
        setIntField(term63933, term63933.getClass(), "cardId", 1402881126);
        setIntField(term63933, term63933.getClass(), "characterId", 786987666);
        setIntField(term63933, term63933.getClass(), "characterVoiceNo", 1810592574);
        setIntField(term63933, term63933.getClass(), "tabSetting", 1394978641);
        setIntField(term63933, term63933.getClass(), "tabSortSetting", 1085224973);
        setIntField(term63933, term63933.getClass(), "cardCategorySetting", 580824436);
        setIntField(term63933, term63933.getClass(), "cardSortSetting", 400588448);
        setIntField(term63933, term63933.getClass(), "rivalScoreCategorySetting", -798151545);
        setIntField(term63933, term63933.getClass(), "playedTutorialBit", -243386399);
        setIntField(term63933, term63933.getClass(), "firstTutorialCancelNum", 1238856040);
        setLongField(term63933, term63933.getClass(), "sumTechHighScore", 3710266125279855888L);
        setLongField(term63933, term63933.getClass(), "sumTechBasicHighScore", -2390242218450551640L);
        setLongField(term63933, term63933.getClass(), "sumTechAdvancedHighScore", 6410411768623434810L);
        setLongField(term63933, term63933.getClass(), "sumTechExpertHighScore", 531588883096789016L);
        setLongField(term63933, term63933.getClass(), "sumTechMasterHighScore", 6836437118639426505L);
        setLongField(term63933, term63933.getClass(), "sumTechLunaticHighScore", -4331507977193439740L);
        setLongField(term63933, term63933.getClass(), "sumBattleHighScore", -9195513111314648691L);
        setLongField(term63933, term63933.getClass(), "sumBattleBasicHighScore", -2836676267610333091L);
        setLongField(term63933, term63933.getClass(), "sumBattleAdvancedHighScore", 3399508076702974138L);
        setLongField(term63933, term63933.getClass(), "sumBattleExpertHighScore", 2488466015930515496L);
        setLongField(term63933, term63933.getClass(), "sumBattleMasterHighScore", -937505178592782760L);
        setLongField(term63933, term63933.getClass(), "sumBattleLunaticHighScore", 1129741221881232004L);
        setField(term63933, term63933.getClass(), "eventWatchedDate", "jcvrILwbgt");
        setField(term63933, term63933.getClass(), "cmEventWatchedDate", "AphrAHzPMC");
        setField(term63933, term63933.getClass(), "firstGameId", "iwismCnYjB");
        setField(term63933, term63933.getClass(), "firstRomVersion", "GerBZdiruT");
        setField(term63933, term63933.getClass(), "firstDataVersion", "VzkPDPPGQl");
        setField(term63933, term63933.getClass(), "firstPlayDate", "iojOXjfZFr");
        setField(term63933, term63933.getClass(), "lastGameId", "yyrkuIYJKj");
        setField(term63933, term63933.getClass(), "lastRomVersion", "reGIMbnrGF");
        setField(term63933, term63933.getClass(), "lastDataVersion", "yquSngBHqd");
        setField(term63933, term63933.getClass(), "compatibleCmVersion", "ZSdaJkZZPm");
        setField(term63933, term63933.getClass(), "lastPlayDate", "ICnzwgujDT");
        setIntField(term63933, term63933.getClass(), "lastPlaceId", -171442968);
        setField(term63933, term63933.getClass(), "lastPlaceName", "RfDgUkIYjW");
        setIntField(term63933, term63933.getClass(), "lastRegionId", 1345075451);
        setField(term63933, term63933.getClass(), "lastRegionName", "QnZKCwkmMh");
        setIntField(term63933, term63933.getClass(), "lastAllNetId", -482097687);
        setField(term63933, term63933.getClass(), "lastClientId", "RVQbteztJx");
        setIntField(term63933, term63933.getClass(), "lastUsedDeckId", -1155698012);
        setIntField(term63933, term63933.getClass(), "lastPlayMusicLevel", -1635314310);
        setIntField(term63933, term63933.getClass(), "lastEmoneyBrand", -1583672247);
        term64196 = new Long(-9102400273331433507L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term64196;
        callMethod(klass, "setSumBattleBasicHighScore", argTypes, term63933, args);
    }

};


