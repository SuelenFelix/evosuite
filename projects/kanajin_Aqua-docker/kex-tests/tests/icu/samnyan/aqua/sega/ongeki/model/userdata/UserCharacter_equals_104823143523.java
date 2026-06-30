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

public class UserCharacter_equals_104823143523 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term178637;
     Object term178922;

    public UserCharacter_equals_104823143523() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term178643 = new Long(6853972830905120647L);
        term178637 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCharacter"));
        Object term178639 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term178641 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term178657 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term178658 = newInstance(Class.forName("java.time.LocalDate"));
        Object term178662 = newInstance(Class.forName("java.time.LocalTime"));
        Object term178667 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term178668 = newInstance(Class.forName("java.time.LocalDate"));
        Object term178672 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term178637, term178637.getClass(), "id", 9087586494678498141L);
        setLongField(term178639, term178639.getClass(), "id", -2032737721665991212L);
        setLongField(term178641, term178641.getClass(), "id", 6861285564186139862L);
        setField(term178641, term178641.getClass(), "extId", term178643);
        setField(term178641, term178641.getClass(), "luid", "HEFcNDOCWd");
        setIntField(term178658, term178658.getClass(), "year", 2011);
        setShortField(term178658, term178658.getClass(), "month", (short) 12);
        setShortField(term178658, term178658.getClass(), "day", (short) 8);
        setField(term178657, term178657.getClass(), "date", term178658);
        setByteField(term178662, term178662.getClass(), "hour", (byte) 14);
        setByteField(term178662, term178662.getClass(), "minute", (byte) 21);
        setByteField(term178662, term178662.getClass(), "second", (byte) 41);
        setIntField(term178662, term178662.getClass(), "nano", 831066682);
        setField(term178657, term178657.getClass(), "time", term178662);
        setField(term178641, term178641.getClass(), "registerTime", term178657);
        setIntField(term178668, term178668.getClass(), "year", 2018);
        setShortField(term178668, term178668.getClass(), "month", (short) 12);
        setShortField(term178668, term178668.getClass(), "day", (short) 8);
        setField(term178667, term178667.getClass(), "date", term178668);
        setByteField(term178672, term178672.getClass(), "hour", (byte) 14);
        setByteField(term178672, term178672.getClass(), "minute", (byte) 50);
        setByteField(term178672, term178672.getClass(), "second", (byte) 10);
        setIntField(term178672, term178672.getClass(), "nano", 698726170);
        setField(term178667, term178667.getClass(), "time", term178672);
        setField(term178641, term178641.getClass(), "accessTime", term178667);
        setField(term178639, term178639.getClass(), "card", term178641);
        setField(term178639, term178639.getClass(), "userName", "uGtmSuLIbe");
        setIntField(term178639, term178639.getClass(), "level", 1267426986);
        setIntField(term178639, term178639.getClass(), "reincarnationNum", -796963513);
        setLongField(term178639, term178639.getClass(), "exp", -3094749699593978168L);
        setLongField(term178639, term178639.getClass(), "point", 4911838016842299479L);
        setLongField(term178639, term178639.getClass(), "totalPoint", 2600758108305337038L);
        setIntField(term178639, term178639.getClass(), "playCount", -968061478);
        setIntField(term178639, term178639.getClass(), "jewelCount", -1731545429);
        setIntField(term178639, term178639.getClass(), "totalJewelCount", 1529459552);
        setIntField(term178639, term178639.getClass(), "medalCount", -319743898);
        setIntField(term178639, term178639.getClass(), "playerRating", 1259713000);
        setIntField(term178639, term178639.getClass(), "highestRating", -56433677);
        setIntField(term178639, term178639.getClass(), "battlePoint", -362651319);
        setIntField(term178639, term178639.getClass(), "bestBattlePoint", -1194579845);
        setIntField(term178639, term178639.getClass(), "overDamageBattlePoint", 423662191);
        setBooleanField(term178639, term178639.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term178639, term178639.getClass(), "nameplateId", -1353912745);
        setIntField(term178639, term178639.getClass(), "trophyId", -1991138903);
        setIntField(term178639, term178639.getClass(), "cardId", -1011499047);
        setIntField(term178639, term178639.getClass(), "characterId", 1739555012);
        setIntField(term178639, term178639.getClass(), "characterVoiceNo", -648034125);
        setIntField(term178639, term178639.getClass(), "tabSetting", 463060109);
        setIntField(term178639, term178639.getClass(), "tabSortSetting", 1272416881);
        setIntField(term178639, term178639.getClass(), "cardCategorySetting", -1392505419);
        setIntField(term178639, term178639.getClass(), "cardSortSetting", -1881547807);
        setIntField(term178639, term178639.getClass(), "rivalScoreCategorySetting", -2118350031);
        setIntField(term178639, term178639.getClass(), "playedTutorialBit", 1226740323);
        setIntField(term178639, term178639.getClass(), "firstTutorialCancelNum", -913955707);
        setLongField(term178639, term178639.getClass(), "sumTechHighScore", -5607146584686916044L);
        setLongField(term178639, term178639.getClass(), "sumTechBasicHighScore", -8618661675368845775L);
        setLongField(term178639, term178639.getClass(), "sumTechAdvancedHighScore", -6321289617766826299L);
        setLongField(term178639, term178639.getClass(), "sumTechExpertHighScore", -7179960800513030576L);
        setLongField(term178639, term178639.getClass(), "sumTechMasterHighScore", -7672585496330101619L);
        setLongField(term178639, term178639.getClass(), "sumTechLunaticHighScore", 5916186589944818269L);
        setLongField(term178639, term178639.getClass(), "sumBattleHighScore", -8277612990946001763L);
        setLongField(term178639, term178639.getClass(), "sumBattleBasicHighScore", 5997593072795724897L);
        setLongField(term178639, term178639.getClass(), "sumBattleAdvancedHighScore", 8596222194900412730L);
        setLongField(term178639, term178639.getClass(), "sumBattleExpertHighScore", 2886701952614491778L);
        setLongField(term178639, term178639.getClass(), "sumBattleMasterHighScore", 5991101022744926909L);
        setLongField(term178639, term178639.getClass(), "sumBattleLunaticHighScore", -2448299584042846072L);
        setField(term178639, term178639.getClass(), "eventWatchedDate", "jXprxniQLh");
        setField(term178639, term178639.getClass(), "cmEventWatchedDate", "qpyqWqBXuI");
        setField(term178639, term178639.getClass(), "firstGameId", "VmcHOGdUdL");
        setField(term178639, term178639.getClass(), "firstRomVersion", "jMjdEiZGZp");
        setField(term178639, term178639.getClass(), "firstDataVersion", "efxUIvyTyg");
        setField(term178639, term178639.getClass(), "firstPlayDate", "YJcfqsYvpK");
        setField(term178639, term178639.getClass(), "lastGameId", "DuTBCYJBrz");
        setField(term178639, term178639.getClass(), "lastRomVersion", "yztwwqDqge");
        setField(term178639, term178639.getClass(), "lastDataVersion", "orSUlVDZoM");
        setField(term178639, term178639.getClass(), "compatibleCmVersion", "UwuTUXfZlO");
        setField(term178639, term178639.getClass(), "lastPlayDate", "BuECvnjNNp");
        setIntField(term178639, term178639.getClass(), "lastPlaceId", -1375658129);
        setField(term178639, term178639.getClass(), "lastPlaceName", "BjCrVrqCvg");
        setIntField(term178639, term178639.getClass(), "lastRegionId", -1851280223);
        setField(term178639, term178639.getClass(), "lastRegionName", "yaNWgtVtAg");
        setIntField(term178639, term178639.getClass(), "lastAllNetId", 1587309016);
        setField(term178639, term178639.getClass(), "lastClientId", "BbNOrjlUDe");
        setIntField(term178639, term178639.getClass(), "lastUsedDeckId", -2135993804);
        setIntField(term178639, term178639.getClass(), "lastPlayMusicLevel", 1633651090);
        setIntField(term178639, term178639.getClass(), "lastEmoneyBrand", 1253413026);
        setField(term178637, term178637.getClass(), "user", term178639);
        setIntField(term178637, term178637.getClass(), "characterId", -1393517042);
        setIntField(term178637, term178637.getClass(), "costumeId", 1002224898);
        setIntField(term178637, term178637.getClass(), "attachmentId", -855504293);
        setIntField(term178637, term178637.getClass(), "playCount", -1726032687);
        setIntField(term178637, term178637.getClass(), "intimateLevel", 7194547);
        setIntField(term178637, term178637.getClass(), "intimateCount", -509177802);
        setIntField(term178637, term178637.getClass(), "intimateCountRewarded", -1731230168);
        setField(term178637, term178637.getClass(), "intimateCountDate", "tHYPJBuwZT");
        setBooleanField(term178637, term178637.getClass(), "isNew", false);
        term178922 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCharacter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term178922;
        callMethod(klass, "equals", argTypes, term178637, args);
    }

};


