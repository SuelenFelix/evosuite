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

public class UserItem_setId_6312636727 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105585;
     Object term105854;

    public UserItem_setId_6312636727() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term105591 = new Long(8107921244631636572L);
        term105585 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserItem"));
        Object term105587 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term105589 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term105605 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term105606 = newInstance(Class.forName("java.time.LocalDate"));
        Object term105610 = newInstance(Class.forName("java.time.LocalTime"));
        Object term105615 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term105616 = newInstance(Class.forName("java.time.LocalDate"));
        Object term105620 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term105585, term105585.getClass(), "id", -3191452368223818248L);
        setLongField(term105587, term105587.getClass(), "id", -6017624031365056434L);
        setLongField(term105589, term105589.getClass(), "id", 7511527551718845732L);
        setField(term105589, term105589.getClass(), "extId", term105591);
        setField(term105589, term105589.getClass(), "luid", "mluXYJByNP");
        setIntField(term105606, term105606.getClass(), "year", 2023);
        setShortField(term105606, term105606.getClass(), "month", (short) 1);
        setShortField(term105606, term105606.getClass(), "day", (short) 10);
        setField(term105605, term105605.getClass(), "date", term105606);
        setByteField(term105610, term105610.getClass(), "hour", (byte) 2);
        setByteField(term105610, term105610.getClass(), "minute", (byte) 12);
        setByteField(term105610, term105610.getClass(), "second", (byte) 45);
        setIntField(term105610, term105610.getClass(), "nano", 793047168);
        setField(term105605, term105605.getClass(), "time", term105610);
        setField(term105589, term105589.getClass(), "registerTime", term105605);
        setIntField(term105616, term105616.getClass(), "year", 2028);
        setShortField(term105616, term105616.getClass(), "month", (short) 6);
        setShortField(term105616, term105616.getClass(), "day", (short) 12);
        setField(term105615, term105615.getClass(), "date", term105616);
        setByteField(term105620, term105620.getClass(), "hour", (byte) 9);
        setByteField(term105620, term105620.getClass(), "minute", (byte) 39);
        setByteField(term105620, term105620.getClass(), "second", (byte) 7);
        setIntField(term105620, term105620.getClass(), "nano", 950068890);
        setField(term105615, term105615.getClass(), "time", term105620);
        setField(term105589, term105589.getClass(), "accessTime", term105615);
        setField(term105587, term105587.getClass(), "card", term105589);
        setField(term105587, term105587.getClass(), "userName", "kLMqANSDgO");
        setIntField(term105587, term105587.getClass(), "level", -821373946);
        setIntField(term105587, term105587.getClass(), "reincarnationNum", 855942907);
        setLongField(term105587, term105587.getClass(), "exp", 7416025899853163226L);
        setLongField(term105587, term105587.getClass(), "point", -2387579833943568446L);
        setLongField(term105587, term105587.getClass(), "totalPoint", -3335753735355355699L);
        setIntField(term105587, term105587.getClass(), "playCount", 1739625708);
        setIntField(term105587, term105587.getClass(), "jewelCount", -323567982);
        setIntField(term105587, term105587.getClass(), "totalJewelCount", -64120763);
        setIntField(term105587, term105587.getClass(), "medalCount", 1509055726);
        setIntField(term105587, term105587.getClass(), "playerRating", -1877152178);
        setIntField(term105587, term105587.getClass(), "highestRating", -1510720583);
        setIntField(term105587, term105587.getClass(), "battlePoint", 993976584);
        setIntField(term105587, term105587.getClass(), "bestBattlePoint", -1655862728);
        setIntField(term105587, term105587.getClass(), "overDamageBattlePoint", -596801958);
        setBooleanField(term105587, term105587.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term105587, term105587.getClass(), "nameplateId", -1416009681);
        setIntField(term105587, term105587.getClass(), "trophyId", 613284576);
        setIntField(term105587, term105587.getClass(), "cardId", -868953151);
        setIntField(term105587, term105587.getClass(), "characterId", 513401096);
        setIntField(term105587, term105587.getClass(), "characterVoiceNo", 1507226462);
        setIntField(term105587, term105587.getClass(), "tabSetting", 1948729123);
        setIntField(term105587, term105587.getClass(), "tabSortSetting", -1745923386);
        setIntField(term105587, term105587.getClass(), "cardCategorySetting", 391874700);
        setIntField(term105587, term105587.getClass(), "cardSortSetting", -1453940077);
        setIntField(term105587, term105587.getClass(), "rivalScoreCategorySetting", -27143901);
        setIntField(term105587, term105587.getClass(), "playedTutorialBit", -1875715073);
        setIntField(term105587, term105587.getClass(), "firstTutorialCancelNum", -785076316);
        setLongField(term105587, term105587.getClass(), "sumTechHighScore", 869748810761192708L);
        setLongField(term105587, term105587.getClass(), "sumTechBasicHighScore", -6191199874090868625L);
        setLongField(term105587, term105587.getClass(), "sumTechAdvancedHighScore", -1382437482852778669L);
        setLongField(term105587, term105587.getClass(), "sumTechExpertHighScore", 6809947462234647288L);
        setLongField(term105587, term105587.getClass(), "sumTechMasterHighScore", -1602487942528769713L);
        setLongField(term105587, term105587.getClass(), "sumTechLunaticHighScore", 5681877231898605362L);
        setLongField(term105587, term105587.getClass(), "sumBattleHighScore", -1243477321420442347L);
        setLongField(term105587, term105587.getClass(), "sumBattleBasicHighScore", 6793438085217832796L);
        setLongField(term105587, term105587.getClass(), "sumBattleAdvancedHighScore", 7073518113220832191L);
        setLongField(term105587, term105587.getClass(), "sumBattleExpertHighScore", 1710603693265995602L);
        setLongField(term105587, term105587.getClass(), "sumBattleMasterHighScore", 5228934009912684336L);
        setLongField(term105587, term105587.getClass(), "sumBattleLunaticHighScore", -6606858516878797846L);
        setField(term105587, term105587.getClass(), "eventWatchedDate", "nStYnHGCom");
        setField(term105587, term105587.getClass(), "cmEventWatchedDate", "gfqZitqjcH");
        setField(term105587, term105587.getClass(), "firstGameId", "QfJOLCTCHY");
        setField(term105587, term105587.getClass(), "firstRomVersion", "yNQuuhZyAX");
        setField(term105587, term105587.getClass(), "firstDataVersion", "IqzRlGAXKQ");
        setField(term105587, term105587.getClass(), "firstPlayDate", "XiytdmxGYa");
        setField(term105587, term105587.getClass(), "lastGameId", "xuWbTDWaJN");
        setField(term105587, term105587.getClass(), "lastRomVersion", "LvZCXbeNaa");
        setField(term105587, term105587.getClass(), "lastDataVersion", "CaxKtuZUJI");
        setField(term105587, term105587.getClass(), "compatibleCmVersion", "wokzuoOQRu");
        setField(term105587, term105587.getClass(), "lastPlayDate", "jIVcJcAtbp");
        setIntField(term105587, term105587.getClass(), "lastPlaceId", 1683678906);
        setField(term105587, term105587.getClass(), "lastPlaceName", "eugajHLhOv");
        setIntField(term105587, term105587.getClass(), "lastRegionId", 930052770);
        setField(term105587, term105587.getClass(), "lastRegionName", "sCSkTLnMUp");
        setIntField(term105587, term105587.getClass(), "lastAllNetId", -295365373);
        setField(term105587, term105587.getClass(), "lastClientId", "MGfUFAWSlA");
        setIntField(term105587, term105587.getClass(), "lastUsedDeckId", 344859953);
        setIntField(term105587, term105587.getClass(), "lastPlayMusicLevel", 1690405484);
        setIntField(term105587, term105587.getClass(), "lastEmoneyBrand", 1722375044);
        setField(term105585, term105585.getClass(), "user", term105587);
        setIntField(term105585, term105585.getClass(), "itemKind", 1695415275);
        setIntField(term105585, term105585.getClass(), "itemId", -460821239);
        setIntField(term105585, term105585.getClass(), "stock", 1355562027);
        setBooleanField(term105585, term105585.getClass(), "isValid", false);
        term105854 = new Long(-7728586487276085232L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserItem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term105854;
        callMethod(klass, "setId", argTypes, term105585, args);
    }

};


