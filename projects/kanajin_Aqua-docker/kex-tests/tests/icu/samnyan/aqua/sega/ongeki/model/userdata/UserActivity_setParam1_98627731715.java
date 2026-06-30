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

public class UserActivity_setParam1_98627731715 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term289633;
     Object term289905;

    public UserActivity_setParam1_98627731715() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term289639 = new Long(5592522907226111065L);
        term289633 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserActivity"));
        Object term289635 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term289637 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term289653 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term289654 = newInstance(Class.forName("java.time.LocalDate"));
        Object term289658 = newInstance(Class.forName("java.time.LocalTime"));
        Object term289663 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term289664 = newInstance(Class.forName("java.time.LocalDate"));
        Object term289668 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term289633, term289633.getClass(), "id", -4216267886380985871L);
        setLongField(term289635, term289635.getClass(), "id", 654188209022417545L);
        setLongField(term289637, term289637.getClass(), "id", 3235307216092066296L);
        setField(term289637, term289637.getClass(), "extId", term289639);
        setField(term289637, term289637.getClass(), "luid", "ZiwCIBjVsO");
        setIntField(term289654, term289654.getClass(), "year", 2011);
        setShortField(term289654, term289654.getClass(), "month", (short) 6);
        setShortField(term289654, term289654.getClass(), "day", (short) 18);
        setField(term289653, term289653.getClass(), "date", term289654);
        setByteField(term289658, term289658.getClass(), "hour", (byte) 18);
        setByteField(term289658, term289658.getClass(), "minute", (byte) 40);
        setByteField(term289658, term289658.getClass(), "second", (byte) 37);
        setIntField(term289658, term289658.getClass(), "nano", 623088445);
        setField(term289653, term289653.getClass(), "time", term289658);
        setField(term289637, term289637.getClass(), "registerTime", term289653);
        setIntField(term289664, term289664.getClass(), "year", 2027);
        setShortField(term289664, term289664.getClass(), "month", (short) 6);
        setShortField(term289664, term289664.getClass(), "day", (short) 19);
        setField(term289663, term289663.getClass(), "date", term289664);
        setByteField(term289668, term289668.getClass(), "hour", (byte) 16);
        setByteField(term289668, term289668.getClass(), "minute", (byte) 11);
        setByteField(term289668, term289668.getClass(), "second", (byte) 55);
        setIntField(term289668, term289668.getClass(), "nano", 573311540);
        setField(term289663, term289663.getClass(), "time", term289668);
        setField(term289637, term289637.getClass(), "accessTime", term289663);
        setField(term289635, term289635.getClass(), "card", term289637);
        setField(term289635, term289635.getClass(), "userName", "llOXbdniOh");
        setIntField(term289635, term289635.getClass(), "level", 1673917093);
        setIntField(term289635, term289635.getClass(), "reincarnationNum", -1047967944);
        setLongField(term289635, term289635.getClass(), "exp", -8151490391827003775L);
        setLongField(term289635, term289635.getClass(), "point", 8192882484215179435L);
        setLongField(term289635, term289635.getClass(), "totalPoint", 3056745374091049099L);
        setIntField(term289635, term289635.getClass(), "playCount", 511285893);
        setIntField(term289635, term289635.getClass(), "jewelCount", 1432059745);
        setIntField(term289635, term289635.getClass(), "totalJewelCount", 161873548);
        setIntField(term289635, term289635.getClass(), "medalCount", -1673034493);
        setIntField(term289635, term289635.getClass(), "playerRating", 808226931);
        setIntField(term289635, term289635.getClass(), "highestRating", 1030017773);
        setIntField(term289635, term289635.getClass(), "battlePoint", -340125599);
        setIntField(term289635, term289635.getClass(), "bestBattlePoint", -852623679);
        setIntField(term289635, term289635.getClass(), "overDamageBattlePoint", -272917720);
        setBooleanField(term289635, term289635.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term289635, term289635.getClass(), "nameplateId", 235629515);
        setIntField(term289635, term289635.getClass(), "trophyId", 1831552674);
        setIntField(term289635, term289635.getClass(), "cardId", 660540546);
        setIntField(term289635, term289635.getClass(), "characterId", -1265313720);
        setIntField(term289635, term289635.getClass(), "characterVoiceNo", -2081318997);
        setIntField(term289635, term289635.getClass(), "tabSetting", 1409397366);
        setIntField(term289635, term289635.getClass(), "tabSortSetting", 717025660);
        setIntField(term289635, term289635.getClass(), "cardCategorySetting", 1730031357);
        setIntField(term289635, term289635.getClass(), "cardSortSetting", -1411877325);
        setIntField(term289635, term289635.getClass(), "rivalScoreCategorySetting", -1348582927);
        setIntField(term289635, term289635.getClass(), "playedTutorialBit", -1795579142);
        setIntField(term289635, term289635.getClass(), "firstTutorialCancelNum", 1914453462);
        setLongField(term289635, term289635.getClass(), "sumTechHighScore", 6790269078346125000L);
        setLongField(term289635, term289635.getClass(), "sumTechBasicHighScore", 1496483601008906709L);
        setLongField(term289635, term289635.getClass(), "sumTechAdvancedHighScore", 7301461069152215533L);
        setLongField(term289635, term289635.getClass(), "sumTechExpertHighScore", -5374890984889431336L);
        setLongField(term289635, term289635.getClass(), "sumTechMasterHighScore", 840696654300268671L);
        setLongField(term289635, term289635.getClass(), "sumTechLunaticHighScore", 1723426390048576477L);
        setLongField(term289635, term289635.getClass(), "sumBattleHighScore", -5809801147126992947L);
        setLongField(term289635, term289635.getClass(), "sumBattleBasicHighScore", 3358567219211983298L);
        setLongField(term289635, term289635.getClass(), "sumBattleAdvancedHighScore", -9205050743556003724L);
        setLongField(term289635, term289635.getClass(), "sumBattleExpertHighScore", 9148860044597498621L);
        setLongField(term289635, term289635.getClass(), "sumBattleMasterHighScore", 281576628995810564L);
        setLongField(term289635, term289635.getClass(), "sumBattleLunaticHighScore", -1829765889823860511L);
        setField(term289635, term289635.getClass(), "eventWatchedDate", "COqsWjaVOy");
        setField(term289635, term289635.getClass(), "cmEventWatchedDate", "PJOXWELqDU");
        setField(term289635, term289635.getClass(), "firstGameId", "qxYfLsDxVm");
        setField(term289635, term289635.getClass(), "firstRomVersion", "IyiMbCQwHK");
        setField(term289635, term289635.getClass(), "firstDataVersion", "qgMxuDOVlx");
        setField(term289635, term289635.getClass(), "firstPlayDate", "zjOGGlnQSZ");
        setField(term289635, term289635.getClass(), "lastGameId", "lqDEahPiir");
        setField(term289635, term289635.getClass(), "lastRomVersion", "GyYnoejQdg");
        setField(term289635, term289635.getClass(), "lastDataVersion", "NuDZzHrXrn");
        setField(term289635, term289635.getClass(), "compatibleCmVersion", "OuLKyvvPWX");
        setField(term289635, term289635.getClass(), "lastPlayDate", "XCikiAMbLv");
        setIntField(term289635, term289635.getClass(), "lastPlaceId", 727587601);
        setField(term289635, term289635.getClass(), "lastPlaceName", "VnvZpXcWbJ");
        setIntField(term289635, term289635.getClass(), "lastRegionId", 1723667094);
        setField(term289635, term289635.getClass(), "lastRegionName", "CqfTXppaYd");
        setIntField(term289635, term289635.getClass(), "lastAllNetId", 2087160467);
        setField(term289635, term289635.getClass(), "lastClientId", "vGKebDDKcW");
        setIntField(term289635, term289635.getClass(), "lastUsedDeckId", -603995413);
        setIntField(term289635, term289635.getClass(), "lastPlayMusicLevel", -877445805);
        setIntField(term289635, term289635.getClass(), "lastEmoneyBrand", -70871011);
        setField(term289633, term289633.getClass(), "user", term289635);
        setIntField(term289633, term289633.getClass(), "kind", 483899295);
        setIntField(term289633, term289633.getClass(), "activityId", 1356784196);
        setIntField(term289633, term289633.getClass(), "sortNumber", 1244399605);
        setIntField(term289633, term289633.getClass(), "param1", 374170485);
        setIntField(term289633, term289633.getClass(), "param2", 1386558439);
        setIntField(term289633, term289633.getClass(), "param3", -497947013);
        setIntField(term289633, term289633.getClass(), "param4", -1800085573);
        term289905 = new Integer(1643304459);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserActivity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term289905;
        callMethod(klass, "setParam1", argTypes, term289633, args);
    }

};


