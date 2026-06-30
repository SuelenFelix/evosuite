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

public class UserData_setCard_172400674963 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48569;
     Object term48832;

    public UserData_setCard_172400674963() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term48573 = new Long(-6950146046121430355L);
        term48569 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term48571 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term48587 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term48588 = newInstance(Class.forName("java.time.LocalDate"));
        Object term48592 = newInstance(Class.forName("java.time.LocalTime"));
        Object term48597 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term48598 = newInstance(Class.forName("java.time.LocalDate"));
        Object term48602 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term48569, term48569.getClass(), "id", -8834993911974447264L);
        setLongField(term48571, term48571.getClass(), "id", 2641309860463903358L);
        setField(term48571, term48571.getClass(), "extId", term48573);
        setField(term48571, term48571.getClass(), "luid", "ofSfQtWBjp");
        setIntField(term48588, term48588.getClass(), "year", 2011);
        setShortField(term48588, term48588.getClass(), "month", (short) 10);
        setShortField(term48588, term48588.getClass(), "day", (short) 10);
        setField(term48587, term48587.getClass(), "date", term48588);
        setByteField(term48592, term48592.getClass(), "hour", (byte) 5);
        setByteField(term48592, term48592.getClass(), "minute", (byte) 26);
        setByteField(term48592, term48592.getClass(), "second", (byte) 16);
        setIntField(term48592, term48592.getClass(), "nano", 858245653);
        setField(term48587, term48587.getClass(), "time", term48592);
        setField(term48571, term48571.getClass(), "registerTime", term48587);
        setIntField(term48598, term48598.getClass(), "year", 2011);
        setShortField(term48598, term48598.getClass(), "month", (short) 3);
        setShortField(term48598, term48598.getClass(), "day", (short) 25);
        setField(term48597, term48597.getClass(), "date", term48598);
        setByteField(term48602, term48602.getClass(), "hour", (byte) 20);
        setByteField(term48602, term48602.getClass(), "minute", (byte) 10);
        setByteField(term48602, term48602.getClass(), "second", (byte) 51);
        setIntField(term48602, term48602.getClass(), "nano", 162102574);
        setField(term48597, term48597.getClass(), "time", term48602);
        setField(term48571, term48571.getClass(), "accessTime", term48597);
        setField(term48569, term48569.getClass(), "card", term48571);
        setField(term48569, term48569.getClass(), "userName", "vkbIpZOlcY");
        setIntField(term48569, term48569.getClass(), "level", -1947540595);
        setIntField(term48569, term48569.getClass(), "reincarnationNum", -1198145043);
        setLongField(term48569, term48569.getClass(), "exp", -7886022676278295268L);
        setLongField(term48569, term48569.getClass(), "point", 3856313132425831260L);
        setLongField(term48569, term48569.getClass(), "totalPoint", 4915114639652309312L);
        setIntField(term48569, term48569.getClass(), "playCount", -999740641);
        setIntField(term48569, term48569.getClass(), "jewelCount", -639247037);
        setIntField(term48569, term48569.getClass(), "totalJewelCount", -110418958);
        setIntField(term48569, term48569.getClass(), "medalCount", 1131695499);
        setIntField(term48569, term48569.getClass(), "playerRating", -699693103);
        setIntField(term48569, term48569.getClass(), "highestRating", -365179239);
        setIntField(term48569, term48569.getClass(), "battlePoint", -1670737346);
        setIntField(term48569, term48569.getClass(), "bestBattlePoint", -1150935030);
        setIntField(term48569, term48569.getClass(), "overDamageBattlePoint", 78607598);
        setBooleanField(term48569, term48569.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term48569, term48569.getClass(), "nameplateId", -126292072);
        setIntField(term48569, term48569.getClass(), "trophyId", -1541809993);
        setIntField(term48569, term48569.getClass(), "cardId", -1100665028);
        setIntField(term48569, term48569.getClass(), "characterId", -1572533124);
        setIntField(term48569, term48569.getClass(), "characterVoiceNo", 1577766413);
        setIntField(term48569, term48569.getClass(), "tabSetting", -1615367460);
        setIntField(term48569, term48569.getClass(), "tabSortSetting", 1119103227);
        setIntField(term48569, term48569.getClass(), "cardCategorySetting", 1061904558);
        setIntField(term48569, term48569.getClass(), "cardSortSetting", -390418218);
        setIntField(term48569, term48569.getClass(), "rivalScoreCategorySetting", 72302997);
        setIntField(term48569, term48569.getClass(), "playedTutorialBit", 1619477832);
        setIntField(term48569, term48569.getClass(), "firstTutorialCancelNum", 611208497);
        setLongField(term48569, term48569.getClass(), "sumTechHighScore", 8639233526934323841L);
        setLongField(term48569, term48569.getClass(), "sumTechBasicHighScore", 1837377990745487524L);
        setLongField(term48569, term48569.getClass(), "sumTechAdvancedHighScore", 7253514194157710276L);
        setLongField(term48569, term48569.getClass(), "sumTechExpertHighScore", -4401374981717945185L);
        setLongField(term48569, term48569.getClass(), "sumTechMasterHighScore", -5673034399804562712L);
        setLongField(term48569, term48569.getClass(), "sumTechLunaticHighScore", 4829676996843735281L);
        setLongField(term48569, term48569.getClass(), "sumBattleHighScore", 1421677180758822434L);
        setLongField(term48569, term48569.getClass(), "sumBattleBasicHighScore", 2699420536723014626L);
        setLongField(term48569, term48569.getClass(), "sumBattleAdvancedHighScore", -8846138397677255464L);
        setLongField(term48569, term48569.getClass(), "sumBattleExpertHighScore", -3563971116155081558L);
        setLongField(term48569, term48569.getClass(), "sumBattleMasterHighScore", -3838500537611270485L);
        setLongField(term48569, term48569.getClass(), "sumBattleLunaticHighScore", 7524709905774533651L);
        setField(term48569, term48569.getClass(), "eventWatchedDate", "XbAeosZekH");
        setField(term48569, term48569.getClass(), "cmEventWatchedDate", "EvGPvjswTz");
        setField(term48569, term48569.getClass(), "firstGameId", "lbnnCkEZgE");
        setField(term48569, term48569.getClass(), "firstRomVersion", "YaWdTQZkTw");
        setField(term48569, term48569.getClass(), "firstDataVersion", "QqsjlsXtmm");
        setField(term48569, term48569.getClass(), "firstPlayDate", "FuWUjAYXxz");
        setField(term48569, term48569.getClass(), "lastGameId", "rKIvvYydou");
        setField(term48569, term48569.getClass(), "lastRomVersion", "KNgeIkQoef");
        setField(term48569, term48569.getClass(), "lastDataVersion", "MeMWAHyjMR");
        setField(term48569, term48569.getClass(), "compatibleCmVersion", "lTuLOcnSnJ");
        setField(term48569, term48569.getClass(), "lastPlayDate", "govbBrRstA");
        setIntField(term48569, term48569.getClass(), "lastPlaceId", 1184968868);
        setField(term48569, term48569.getClass(), "lastPlaceName", "zSMUNzRRyM");
        setIntField(term48569, term48569.getClass(), "lastRegionId", -882725204);
        setField(term48569, term48569.getClass(), "lastRegionName", "aKwJiIZSjJ");
        setIntField(term48569, term48569.getClass(), "lastAllNetId", 912627382);
        setField(term48569, term48569.getClass(), "lastClientId", "lYbeaINKud");
        setIntField(term48569, term48569.getClass(), "lastUsedDeckId", -761296444);
        setIntField(term48569, term48569.getClass(), "lastPlayMusicLevel", -189523711);
        setIntField(term48569, term48569.getClass(), "lastEmoneyBrand", 1697321852);
        Long term48834 = new Long(1667122142089513324L);
        term48832 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term48848 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term48849 = newInstance(Class.forName("java.time.LocalDate"));
        Object term48853 = newInstance(Class.forName("java.time.LocalTime"));
        Object term48858 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term48859 = newInstance(Class.forName("java.time.LocalDate"));
        Object term48863 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term48832, term48832.getClass(), "id", -872902981503394121L);
        setField(term48832, term48832.getClass(), "extId", term48834);
        setField(term48832, term48832.getClass(), "luid", "BrwuUkkatt");
        setIntField(term48849, term48849.getClass(), "year", 2027);
        setShortField(term48849, term48849.getClass(), "month", (short) 8);
        setShortField(term48849, term48849.getClass(), "day", (short) 16);
        setField(term48848, term48848.getClass(), "date", term48849);
        setByteField(term48853, term48853.getClass(), "hour", (byte) 8);
        setByteField(term48853, term48853.getClass(), "minute", (byte) 3);
        setByteField(term48853, term48853.getClass(), "second", (byte) 15);
        setIntField(term48853, term48853.getClass(), "nano", 332963320);
        setField(term48848, term48848.getClass(), "time", term48853);
        setField(term48832, term48832.getClass(), "registerTime", term48848);
        setIntField(term48859, term48859.getClass(), "year", 2021);
        setShortField(term48859, term48859.getClass(), "month", (short) 11);
        setShortField(term48859, term48859.getClass(), "day", (short) 12);
        setField(term48858, term48858.getClass(), "date", term48859);
        setByteField(term48863, term48863.getClass(), "hour", (byte) 0);
        setByteField(term48863, term48863.getClass(), "minute", (byte) 51);
        setByteField(term48863, term48863.getClass(), "second", (byte) 55);
        setIntField(term48863, term48863.getClass(), "nano", 745543124);
        setField(term48858, term48858.getClass(), "time", term48863);
        setField(term48832, term48832.getClass(), "accessTime", term48858);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.general.model.Card");
        Object[] args = new Object[1];
        args[0] = term48832;
        callMethod(klass, "setCard", argTypes, term48569, args);
    }

};


