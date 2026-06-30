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

public class UserData_setLastEmoneyBrand_777508056123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term74413;
     Object term74676;

    public UserData_setLastEmoneyBrand_777508056123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term74417 = new Long(-8614778293741404325L);
        term74413 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term74415 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term74431 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term74432 = newInstance(Class.forName("java.time.LocalDate"));
        Object term74436 = newInstance(Class.forName("java.time.LocalTime"));
        Object term74441 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term74442 = newInstance(Class.forName("java.time.LocalDate"));
        Object term74446 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term74413, term74413.getClass(), "id", 329075143180309928L);
        setLongField(term74415, term74415.getClass(), "id", -8203373005676064618L);
        setField(term74415, term74415.getClass(), "extId", term74417);
        setField(term74415, term74415.getClass(), "luid", "AbIDnsFOzO");
        setIntField(term74432, term74432.getClass(), "year", 2013);
        setShortField(term74432, term74432.getClass(), "month", (short) 9);
        setShortField(term74432, term74432.getClass(), "day", (short) 12);
        setField(term74431, term74431.getClass(), "date", term74432);
        setByteField(term74436, term74436.getClass(), "hour", (byte) 14);
        setByteField(term74436, term74436.getClass(), "minute", (byte) 21);
        setByteField(term74436, term74436.getClass(), "second", (byte) 35);
        setIntField(term74436, term74436.getClass(), "nano", 520302725);
        setField(term74431, term74431.getClass(), "time", term74436);
        setField(term74415, term74415.getClass(), "registerTime", term74431);
        setIntField(term74442, term74442.getClass(), "year", 2016);
        setShortField(term74442, term74442.getClass(), "month", (short) 2);
        setShortField(term74442, term74442.getClass(), "day", (short) 15);
        setField(term74441, term74441.getClass(), "date", term74442);
        setByteField(term74446, term74446.getClass(), "hour", (byte) 7);
        setByteField(term74446, term74446.getClass(), "minute", (byte) 36);
        setByteField(term74446, term74446.getClass(), "second", (byte) 21);
        setIntField(term74446, term74446.getClass(), "nano", 74269011);
        setField(term74441, term74441.getClass(), "time", term74446);
        setField(term74415, term74415.getClass(), "accessTime", term74441);
        setField(term74413, term74413.getClass(), "card", term74415);
        setField(term74413, term74413.getClass(), "userName", "ekTUXbqVGx");
        setIntField(term74413, term74413.getClass(), "level", -808109817);
        setIntField(term74413, term74413.getClass(), "reincarnationNum", 33486504);
        setLongField(term74413, term74413.getClass(), "exp", -2387931839279962287L);
        setLongField(term74413, term74413.getClass(), "point", -781213565213959299L);
        setLongField(term74413, term74413.getClass(), "totalPoint", 1627503725336812835L);
        setIntField(term74413, term74413.getClass(), "playCount", -2112546178);
        setIntField(term74413, term74413.getClass(), "jewelCount", 2088023767);
        setIntField(term74413, term74413.getClass(), "totalJewelCount", -1750178936);
        setIntField(term74413, term74413.getClass(), "medalCount", 1007162436);
        setIntField(term74413, term74413.getClass(), "playerRating", -1475097555);
        setIntField(term74413, term74413.getClass(), "highestRating", 1715200190);
        setIntField(term74413, term74413.getClass(), "battlePoint", 766065716);
        setIntField(term74413, term74413.getClass(), "bestBattlePoint", -431182213);
        setIntField(term74413, term74413.getClass(), "overDamageBattlePoint", 419448852);
        setBooleanField(term74413, term74413.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term74413, term74413.getClass(), "nameplateId", -494367790);
        setIntField(term74413, term74413.getClass(), "trophyId", 620015992);
        setIntField(term74413, term74413.getClass(), "cardId", 396108638);
        setIntField(term74413, term74413.getClass(), "characterId", 581841369);
        setIntField(term74413, term74413.getClass(), "characterVoiceNo", 970094723);
        setIntField(term74413, term74413.getClass(), "tabSetting", 376622340);
        setIntField(term74413, term74413.getClass(), "tabSortSetting", 1985101421);
        setIntField(term74413, term74413.getClass(), "cardCategorySetting", 422564495);
        setIntField(term74413, term74413.getClass(), "cardSortSetting", -1614243846);
        setIntField(term74413, term74413.getClass(), "rivalScoreCategorySetting", 1218830458);
        setIntField(term74413, term74413.getClass(), "playedTutorialBit", 476903736);
        setIntField(term74413, term74413.getClass(), "firstTutorialCancelNum", -832801133);
        setLongField(term74413, term74413.getClass(), "sumTechHighScore", -6399585202609591962L);
        setLongField(term74413, term74413.getClass(), "sumTechBasicHighScore", -7548100222716923684L);
        setLongField(term74413, term74413.getClass(), "sumTechAdvancedHighScore", -862074792274450196L);
        setLongField(term74413, term74413.getClass(), "sumTechExpertHighScore", 1942144735337962969L);
        setLongField(term74413, term74413.getClass(), "sumTechMasterHighScore", -4344753984954632336L);
        setLongField(term74413, term74413.getClass(), "sumTechLunaticHighScore", 4631827794948700273L);
        setLongField(term74413, term74413.getClass(), "sumBattleHighScore", 6813589793299718428L);
        setLongField(term74413, term74413.getClass(), "sumBattleBasicHighScore", 6539225967589742494L);
        setLongField(term74413, term74413.getClass(), "sumBattleAdvancedHighScore", -5299004755000484571L);
        setLongField(term74413, term74413.getClass(), "sumBattleExpertHighScore", -1308506010473990942L);
        setLongField(term74413, term74413.getClass(), "sumBattleMasterHighScore", -665107459568416177L);
        setLongField(term74413, term74413.getClass(), "sumBattleLunaticHighScore", 3591499275146847847L);
        setField(term74413, term74413.getClass(), "eventWatchedDate", "ECPFDcnHIT");
        setField(term74413, term74413.getClass(), "cmEventWatchedDate", "cgHejOgcDW");
        setField(term74413, term74413.getClass(), "firstGameId", "QYNTEJcWIQ");
        setField(term74413, term74413.getClass(), "firstRomVersion", "SbdSVclvuX");
        setField(term74413, term74413.getClass(), "firstDataVersion", "QpoSxHFuJh");
        setField(term74413, term74413.getClass(), "firstPlayDate", "GLAJgnHQMo");
        setField(term74413, term74413.getClass(), "lastGameId", "nDzlNeexNi");
        setField(term74413, term74413.getClass(), "lastRomVersion", "XhILAYdtGS");
        setField(term74413, term74413.getClass(), "lastDataVersion", "ZRWORAfStn");
        setField(term74413, term74413.getClass(), "compatibleCmVersion", "loCxNBoGfW");
        setField(term74413, term74413.getClass(), "lastPlayDate", "PGVYUjJrZh");
        setIntField(term74413, term74413.getClass(), "lastPlaceId", 658732890);
        setField(term74413, term74413.getClass(), "lastPlaceName", "OHliEqVque");
        setIntField(term74413, term74413.getClass(), "lastRegionId", 888621409);
        setField(term74413, term74413.getClass(), "lastRegionName", "kQWmmbQQqu");
        setIntField(term74413, term74413.getClass(), "lastAllNetId", 665526857);
        setField(term74413, term74413.getClass(), "lastClientId", "bLKLlXYEeh");
        setIntField(term74413, term74413.getClass(), "lastUsedDeckId", 184439959);
        setIntField(term74413, term74413.getClass(), "lastPlayMusicLevel", -153314488);
        setIntField(term74413, term74413.getClass(), "lastEmoneyBrand", -1106116513);
        term74676 = new Integer(1454640705);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term74676;
        callMethod(klass, "setLastEmoneyBrand", argTypes, term74413, args);
    }

};


