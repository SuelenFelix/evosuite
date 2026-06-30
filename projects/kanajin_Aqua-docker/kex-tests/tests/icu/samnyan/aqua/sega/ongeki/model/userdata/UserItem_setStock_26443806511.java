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

public class UserItem_setStock_26443806511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107730;
     Object term107999;

    public UserItem_setStock_26443806511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term107736 = new Long(-6394943900800506753L);
        term107730 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserItem"));
        Object term107732 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term107734 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term107750 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term107751 = newInstance(Class.forName("java.time.LocalDate"));
        Object term107755 = newInstance(Class.forName("java.time.LocalTime"));
        Object term107760 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term107761 = newInstance(Class.forName("java.time.LocalDate"));
        Object term107765 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term107730, term107730.getClass(), "id", -4412204534351657942L);
        setLongField(term107732, term107732.getClass(), "id", 1502402416005720575L);
        setLongField(term107734, term107734.getClass(), "id", -8968751634411616639L);
        setField(term107734, term107734.getClass(), "extId", term107736);
        setField(term107734, term107734.getClass(), "luid", "aSBloErOPY");
        setIntField(term107751, term107751.getClass(), "year", 2026);
        setShortField(term107751, term107751.getClass(), "month", (short) 10);
        setShortField(term107751, term107751.getClass(), "day", (short) 26);
        setField(term107750, term107750.getClass(), "date", term107751);
        setByteField(term107755, term107755.getClass(), "hour", (byte) 16);
        setByteField(term107755, term107755.getClass(), "minute", (byte) 45);
        setByteField(term107755, term107755.getClass(), "second", (byte) 43);
        setIntField(term107755, term107755.getClass(), "nano", 206234347);
        setField(term107750, term107750.getClass(), "time", term107755);
        setField(term107734, term107734.getClass(), "registerTime", term107750);
        setIntField(term107761, term107761.getClass(), "year", 2024);
        setShortField(term107761, term107761.getClass(), "month", (short) 3);
        setShortField(term107761, term107761.getClass(), "day", (short) 27);
        setField(term107760, term107760.getClass(), "date", term107761);
        setByteField(term107765, term107765.getClass(), "hour", (byte) 23);
        setByteField(term107765, term107765.getClass(), "minute", (byte) 48);
        setByteField(term107765, term107765.getClass(), "second", (byte) 45);
        setIntField(term107765, term107765.getClass(), "nano", 181365728);
        setField(term107760, term107760.getClass(), "time", term107765);
        setField(term107734, term107734.getClass(), "accessTime", term107760);
        setField(term107732, term107732.getClass(), "card", term107734);
        setField(term107732, term107732.getClass(), "userName", "ItfmeAXEYy");
        setIntField(term107732, term107732.getClass(), "level", 1286437691);
        setIntField(term107732, term107732.getClass(), "reincarnationNum", -447971579);
        setLongField(term107732, term107732.getClass(), "exp", 5717217363255266611L);
        setLongField(term107732, term107732.getClass(), "point", 4386790398434386143L);
        setLongField(term107732, term107732.getClass(), "totalPoint", -7382853148490912965L);
        setIntField(term107732, term107732.getClass(), "playCount", -2040992903);
        setIntField(term107732, term107732.getClass(), "jewelCount", -366879890);
        setIntField(term107732, term107732.getClass(), "totalJewelCount", 2127723603);
        setIntField(term107732, term107732.getClass(), "medalCount", 1512218420);
        setIntField(term107732, term107732.getClass(), "playerRating", 745526581);
        setIntField(term107732, term107732.getClass(), "highestRating", -699594655);
        setIntField(term107732, term107732.getClass(), "battlePoint", -1851012399);
        setIntField(term107732, term107732.getClass(), "bestBattlePoint", -116319790);
        setIntField(term107732, term107732.getClass(), "overDamageBattlePoint", -1988687324);
        setBooleanField(term107732, term107732.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term107732, term107732.getClass(), "nameplateId", -57909074);
        setIntField(term107732, term107732.getClass(), "trophyId", 1592412);
        setIntField(term107732, term107732.getClass(), "cardId", -743417086);
        setIntField(term107732, term107732.getClass(), "characterId", 2040843352);
        setIntField(term107732, term107732.getClass(), "characterVoiceNo", 1204883248);
        setIntField(term107732, term107732.getClass(), "tabSetting", -388281703);
        setIntField(term107732, term107732.getClass(), "tabSortSetting", 565641932);
        setIntField(term107732, term107732.getClass(), "cardCategorySetting", -648267047);
        setIntField(term107732, term107732.getClass(), "cardSortSetting", -2094100197);
        setIntField(term107732, term107732.getClass(), "rivalScoreCategorySetting", 1058557611);
        setIntField(term107732, term107732.getClass(), "playedTutorialBit", 43971669);
        setIntField(term107732, term107732.getClass(), "firstTutorialCancelNum", 1611498185);
        setLongField(term107732, term107732.getClass(), "sumTechHighScore", -4141185344985298529L);
        setLongField(term107732, term107732.getClass(), "sumTechBasicHighScore", 5182118809986194172L);
        setLongField(term107732, term107732.getClass(), "sumTechAdvancedHighScore", 7770343092404304772L);
        setLongField(term107732, term107732.getClass(), "sumTechExpertHighScore", 8126336292793193625L);
        setLongField(term107732, term107732.getClass(), "sumTechMasterHighScore", -1515877345563579395L);
        setLongField(term107732, term107732.getClass(), "sumTechLunaticHighScore", 7135285391651019613L);
        setLongField(term107732, term107732.getClass(), "sumBattleHighScore", 5347132559941771690L);
        setLongField(term107732, term107732.getClass(), "sumBattleBasicHighScore", -7859725320879250978L);
        setLongField(term107732, term107732.getClass(), "sumBattleAdvancedHighScore", -7221606490586796258L);
        setLongField(term107732, term107732.getClass(), "sumBattleExpertHighScore", 3090936584422427742L);
        setLongField(term107732, term107732.getClass(), "sumBattleMasterHighScore", -4645096430045620762L);
        setLongField(term107732, term107732.getClass(), "sumBattleLunaticHighScore", 8129128609221522804L);
        setField(term107732, term107732.getClass(), "eventWatchedDate", "zkqcwCycKC");
        setField(term107732, term107732.getClass(), "cmEventWatchedDate", "jSBwpGbJJI");
        setField(term107732, term107732.getClass(), "firstGameId", "xnmcxyNSBe");
        setField(term107732, term107732.getClass(), "firstRomVersion", "FXflwvEdHL");
        setField(term107732, term107732.getClass(), "firstDataVersion", "aTdLOvYsQE");
        setField(term107732, term107732.getClass(), "firstPlayDate", "AavZwxppSr");
        setField(term107732, term107732.getClass(), "lastGameId", "bozHpjFCmy");
        setField(term107732, term107732.getClass(), "lastRomVersion", "fufOvYOUme");
        setField(term107732, term107732.getClass(), "lastDataVersion", "hFUzxlerfo");
        setField(term107732, term107732.getClass(), "compatibleCmVersion", "SSClrWPMGg");
        setField(term107732, term107732.getClass(), "lastPlayDate", "pWwlfpmeFT");
        setIntField(term107732, term107732.getClass(), "lastPlaceId", 2091252305);
        setField(term107732, term107732.getClass(), "lastPlaceName", "PKwVSkPPMv");
        setIntField(term107732, term107732.getClass(), "lastRegionId", 263368957);
        setField(term107732, term107732.getClass(), "lastRegionName", "DpAnlOynPS");
        setIntField(term107732, term107732.getClass(), "lastAllNetId", 1664066639);
        setField(term107732, term107732.getClass(), "lastClientId", "CyKngDoFFr");
        setIntField(term107732, term107732.getClass(), "lastUsedDeckId", -1987739959);
        setIntField(term107732, term107732.getClass(), "lastPlayMusicLevel", -1921996045);
        setIntField(term107732, term107732.getClass(), "lastEmoneyBrand", 1689248062);
        setField(term107730, term107730.getClass(), "user", term107732);
        setIntField(term107730, term107730.getClass(), "itemKind", -155559246);
        setIntField(term107730, term107730.getClass(), "itemId", -2121439077);
        setIntField(term107730, term107730.getClass(), "stock", 1640516155);
        setBooleanField(term107730, term107730.getClass(), "isValid", true);
        term107999 = new Integer(338143917);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserItem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term107999;
        callMethod(klass, "setStock", argTypes, term107730, args);
    }

};


