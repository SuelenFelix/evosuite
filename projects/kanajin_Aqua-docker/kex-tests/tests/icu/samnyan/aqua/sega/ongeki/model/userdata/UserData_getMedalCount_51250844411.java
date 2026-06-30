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

public class UserData_getMedalCount_51250844411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26571;

    public UserData_getMedalCount_51250844411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term26575 = new Long(5953383087795962419L);
        term26571 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term26573 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term26589 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term26590 = newInstance(Class.forName("java.time.LocalDate"));
        Object term26594 = newInstance(Class.forName("java.time.LocalTime"));
        Object term26599 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term26600 = newInstance(Class.forName("java.time.LocalDate"));
        Object term26604 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term26571, term26571.getClass(), "id", 7170045607484390400L);
        setLongField(term26573, term26573.getClass(), "id", 8650489888932702486L);
        setField(term26573, term26573.getClass(), "extId", term26575);
        setField(term26573, term26573.getClass(), "luid", "yBiVacDcZX");
        setIntField(term26590, term26590.getClass(), "year", 2026);
        setShortField(term26590, term26590.getClass(), "month", (short) 6);
        setShortField(term26590, term26590.getClass(), "day", (short) 13);
        setField(term26589, term26589.getClass(), "date", term26590);
        setByteField(term26594, term26594.getClass(), "hour", (byte) 19);
        setByteField(term26594, term26594.getClass(), "minute", (byte) 23);
        setByteField(term26594, term26594.getClass(), "second", (byte) 46);
        setIntField(term26594, term26594.getClass(), "nano", 67955056);
        setField(term26589, term26589.getClass(), "time", term26594);
        setField(term26573, term26573.getClass(), "registerTime", term26589);
        setIntField(term26600, term26600.getClass(), "year", 2013);
        setShortField(term26600, term26600.getClass(), "month", (short) 12);
        setShortField(term26600, term26600.getClass(), "day", (short) 23);
        setField(term26599, term26599.getClass(), "date", term26600);
        setByteField(term26604, term26604.getClass(), "hour", (byte) 1);
        setByteField(term26604, term26604.getClass(), "minute", (byte) 0);
        setByteField(term26604, term26604.getClass(), "second", (byte) 32);
        setIntField(term26604, term26604.getClass(), "nano", 168525686);
        setField(term26599, term26599.getClass(), "time", term26604);
        setField(term26573, term26573.getClass(), "accessTime", term26599);
        setField(term26571, term26571.getClass(), "card", term26573);
        setField(term26571, term26571.getClass(), "userName", "QrKfEgQeoy");
        setIntField(term26571, term26571.getClass(), "level", -1540486514);
        setIntField(term26571, term26571.getClass(), "reincarnationNum", 1471031478);
        setLongField(term26571, term26571.getClass(), "exp", -723301799439650268L);
        setLongField(term26571, term26571.getClass(), "point", 7218261959613569082L);
        setLongField(term26571, term26571.getClass(), "totalPoint", 8997626143537750821L);
        setIntField(term26571, term26571.getClass(), "playCount", -334716487);
        setIntField(term26571, term26571.getClass(), "jewelCount", -1739012814);
        setIntField(term26571, term26571.getClass(), "totalJewelCount", 1989014880);
        setIntField(term26571, term26571.getClass(), "medalCount", -330280702);
        setIntField(term26571, term26571.getClass(), "playerRating", -1858425735);
        setIntField(term26571, term26571.getClass(), "highestRating", 1818274550);
        setIntField(term26571, term26571.getClass(), "battlePoint", 1044519085);
        setIntField(term26571, term26571.getClass(), "bestBattlePoint", 2095699770);
        setIntField(term26571, term26571.getClass(), "overDamageBattlePoint", -1365904757);
        setBooleanField(term26571, term26571.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term26571, term26571.getClass(), "nameplateId", -1487263349);
        setIntField(term26571, term26571.getClass(), "trophyId", -1009732764);
        setIntField(term26571, term26571.getClass(), "cardId", 950783153);
        setIntField(term26571, term26571.getClass(), "characterId", -801175078);
        setIntField(term26571, term26571.getClass(), "characterVoiceNo", 2085098404);
        setIntField(term26571, term26571.getClass(), "tabSetting", -684064427);
        setIntField(term26571, term26571.getClass(), "tabSortSetting", -1981080836);
        setIntField(term26571, term26571.getClass(), "cardCategorySetting", -176676344);
        setIntField(term26571, term26571.getClass(), "cardSortSetting", 1949009312);
        setIntField(term26571, term26571.getClass(), "rivalScoreCategorySetting", -432054743);
        setIntField(term26571, term26571.getClass(), "playedTutorialBit", -859726380);
        setIntField(term26571, term26571.getClass(), "firstTutorialCancelNum", -1498422654);
        setLongField(term26571, term26571.getClass(), "sumTechHighScore", -671374290989371865L);
        setLongField(term26571, term26571.getClass(), "sumTechBasicHighScore", -344973543098043088L);
        setLongField(term26571, term26571.getClass(), "sumTechAdvancedHighScore", -8743015685701431890L);
        setLongField(term26571, term26571.getClass(), "sumTechExpertHighScore", 3627398214180261490L);
        setLongField(term26571, term26571.getClass(), "sumTechMasterHighScore", -8287703806860141511L);
        setLongField(term26571, term26571.getClass(), "sumTechLunaticHighScore", 4190829300851698907L);
        setLongField(term26571, term26571.getClass(), "sumBattleHighScore", -1013042203229198032L);
        setLongField(term26571, term26571.getClass(), "sumBattleBasicHighScore", 576269924637193764L);
        setLongField(term26571, term26571.getClass(), "sumBattleAdvancedHighScore", 489460221587679133L);
        setLongField(term26571, term26571.getClass(), "sumBattleExpertHighScore", 2142335215837283347L);
        setLongField(term26571, term26571.getClass(), "sumBattleMasterHighScore", -3861643867197678062L);
        setLongField(term26571, term26571.getClass(), "sumBattleLunaticHighScore", 3378211908158042365L);
        setField(term26571, term26571.getClass(), "eventWatchedDate", "oApgdbwnti");
        setField(term26571, term26571.getClass(), "cmEventWatchedDate", "YcgHACNgyo");
        setField(term26571, term26571.getClass(), "firstGameId", "MrUPJzBTEn");
        setField(term26571, term26571.getClass(), "firstRomVersion", "IaSymdfFGa");
        setField(term26571, term26571.getClass(), "firstDataVersion", "FxSvJCIpul");
        setField(term26571, term26571.getClass(), "firstPlayDate", "HCjKwpexJj");
        setField(term26571, term26571.getClass(), "lastGameId", "sCpIHVPdfl");
        setField(term26571, term26571.getClass(), "lastRomVersion", "lMUBBGRjfY");
        setField(term26571, term26571.getClass(), "lastDataVersion", "olYpqbolWL");
        setField(term26571, term26571.getClass(), "compatibleCmVersion", "MCMCjxXzjw");
        setField(term26571, term26571.getClass(), "lastPlayDate", "pZbbwCURge");
        setIntField(term26571, term26571.getClass(), "lastPlaceId", -1499829233);
        setField(term26571, term26571.getClass(), "lastPlaceName", "RsOfgdMCMv");
        setIntField(term26571, term26571.getClass(), "lastRegionId", -888855662);
        setField(term26571, term26571.getClass(), "lastRegionName", "nsofCJqJOR");
        setIntField(term26571, term26571.getClass(), "lastAllNetId", -1483966656);
        setField(term26571, term26571.getClass(), "lastClientId", "CitJiZwsjF");
        setIntField(term26571, term26571.getClass(), "lastUsedDeckId", -334260786);
        setIntField(term26571, term26571.getClass(), "lastPlayMusicLevel", -765890956);
        setIntField(term26571, term26571.getClass(), "lastEmoneyBrand", -214452542);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMedalCount", argTypes, term26571, args);
    }

};


