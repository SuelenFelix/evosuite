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

public class UserItem_setItemKind_8839591729 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term106868;
     Object term107137;

    public UserItem_setItemKind_8839591729() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term106874 = new Long(21047099434645581L);
        term106868 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserItem"));
        Object term106870 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term106872 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term106888 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term106889 = newInstance(Class.forName("java.time.LocalDate"));
        Object term106893 = newInstance(Class.forName("java.time.LocalTime"));
        Object term106898 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term106899 = newInstance(Class.forName("java.time.LocalDate"));
        Object term106903 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term106868, term106868.getClass(), "id", 1335656234045854132L);
        setLongField(term106870, term106870.getClass(), "id", 6329344177797642642L);
        setLongField(term106872, term106872.getClass(), "id", -379801462734499278L);
        setField(term106872, term106872.getClass(), "extId", term106874);
        setField(term106872, term106872.getClass(), "luid", "BsupMZxOfn");
        setIntField(term106889, term106889.getClass(), "year", 2014);
        setShortField(term106889, term106889.getClass(), "month", (short) 6);
        setShortField(term106889, term106889.getClass(), "day", (short) 26);
        setField(term106888, term106888.getClass(), "date", term106889);
        setByteField(term106893, term106893.getClass(), "hour", (byte) 1);
        setByteField(term106893, term106893.getClass(), "minute", (byte) 48);
        setByteField(term106893, term106893.getClass(), "second", (byte) 51);
        setIntField(term106893, term106893.getClass(), "nano", 770527454);
        setField(term106888, term106888.getClass(), "time", term106893);
        setField(term106872, term106872.getClass(), "registerTime", term106888);
        setIntField(term106899, term106899.getClass(), "year", 2019);
        setShortField(term106899, term106899.getClass(), "month", (short) 10);
        setShortField(term106899, term106899.getClass(), "day", (short) 21);
        setField(term106898, term106898.getClass(), "date", term106899);
        setByteField(term106903, term106903.getClass(), "hour", (byte) 23);
        setByteField(term106903, term106903.getClass(), "minute", (byte) 33);
        setByteField(term106903, term106903.getClass(), "second", (byte) 19);
        setIntField(term106903, term106903.getClass(), "nano", 72784109);
        setField(term106898, term106898.getClass(), "time", term106903);
        setField(term106872, term106872.getClass(), "accessTime", term106898);
        setField(term106870, term106870.getClass(), "card", term106872);
        setField(term106870, term106870.getClass(), "userName", "KWWTEtQZKa");
        setIntField(term106870, term106870.getClass(), "level", 2101098539);
        setIntField(term106870, term106870.getClass(), "reincarnationNum", 222587472);
        setLongField(term106870, term106870.getClass(), "exp", -43453793118016545L);
        setLongField(term106870, term106870.getClass(), "point", -1791426284813917337L);
        setLongField(term106870, term106870.getClass(), "totalPoint", -7269211581156867258L);
        setIntField(term106870, term106870.getClass(), "playCount", -222360853);
        setIntField(term106870, term106870.getClass(), "jewelCount", -886522384);
        setIntField(term106870, term106870.getClass(), "totalJewelCount", -1780849406);
        setIntField(term106870, term106870.getClass(), "medalCount", -938188610);
        setIntField(term106870, term106870.getClass(), "playerRating", 716282229);
        setIntField(term106870, term106870.getClass(), "highestRating", -749259966);
        setIntField(term106870, term106870.getClass(), "battlePoint", 1042892041);
        setIntField(term106870, term106870.getClass(), "bestBattlePoint", 1690194849);
        setIntField(term106870, term106870.getClass(), "overDamageBattlePoint", 411327783);
        setBooleanField(term106870, term106870.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term106870, term106870.getClass(), "nameplateId", -1499151614);
        setIntField(term106870, term106870.getClass(), "trophyId", -417329093);
        setIntField(term106870, term106870.getClass(), "cardId", -1454824229);
        setIntField(term106870, term106870.getClass(), "characterId", -94200317);
        setIntField(term106870, term106870.getClass(), "characterVoiceNo", -1822530946);
        setIntField(term106870, term106870.getClass(), "tabSetting", 362870886);
        setIntField(term106870, term106870.getClass(), "tabSortSetting", -728892845);
        setIntField(term106870, term106870.getClass(), "cardCategorySetting", -344829493);
        setIntField(term106870, term106870.getClass(), "cardSortSetting", -542170709);
        setIntField(term106870, term106870.getClass(), "rivalScoreCategorySetting", 1069599758);
        setIntField(term106870, term106870.getClass(), "playedTutorialBit", 339833097);
        setIntField(term106870, term106870.getClass(), "firstTutorialCancelNum", -669854850);
        setLongField(term106870, term106870.getClass(), "sumTechHighScore", -922501789254675769L);
        setLongField(term106870, term106870.getClass(), "sumTechBasicHighScore", 4601630418248923726L);
        setLongField(term106870, term106870.getClass(), "sumTechAdvancedHighScore", 480039199470672932L);
        setLongField(term106870, term106870.getClass(), "sumTechExpertHighScore", -7755825356575550601L);
        setLongField(term106870, term106870.getClass(), "sumTechMasterHighScore", -7010012266529110156L);
        setLongField(term106870, term106870.getClass(), "sumTechLunaticHighScore", 5236095463512454816L);
        setLongField(term106870, term106870.getClass(), "sumBattleHighScore", -1421362129691631912L);
        setLongField(term106870, term106870.getClass(), "sumBattleBasicHighScore", -1652507985634410327L);
        setLongField(term106870, term106870.getClass(), "sumBattleAdvancedHighScore", -3585886572555403047L);
        setLongField(term106870, term106870.getClass(), "sumBattleExpertHighScore", 8745393770629785944L);
        setLongField(term106870, term106870.getClass(), "sumBattleMasterHighScore", -5304817075733769484L);
        setLongField(term106870, term106870.getClass(), "sumBattleLunaticHighScore", 2308240981940675456L);
        setField(term106870, term106870.getClass(), "eventWatchedDate", "QRoYxbbXBu");
        setField(term106870, term106870.getClass(), "cmEventWatchedDate", "gGVmBWDOsX");
        setField(term106870, term106870.getClass(), "firstGameId", "NktLacflHU");
        setField(term106870, term106870.getClass(), "firstRomVersion", "evgfwrURFw");
        setField(term106870, term106870.getClass(), "firstDataVersion", "fFCtsKLEIk");
        setField(term106870, term106870.getClass(), "firstPlayDate", "VJiRAWIpQj");
        setField(term106870, term106870.getClass(), "lastGameId", "LurvjUHtJk");
        setField(term106870, term106870.getClass(), "lastRomVersion", "OBilYfBQsT");
        setField(term106870, term106870.getClass(), "lastDataVersion", "iNsUMLKPwV");
        setField(term106870, term106870.getClass(), "compatibleCmVersion", "gLfAVhVVRi");
        setField(term106870, term106870.getClass(), "lastPlayDate", "sfcitSKGGv");
        setIntField(term106870, term106870.getClass(), "lastPlaceId", -958077351);
        setField(term106870, term106870.getClass(), "lastPlaceName", "sPFYXUJQhh");
        setIntField(term106870, term106870.getClass(), "lastRegionId", 254501776);
        setField(term106870, term106870.getClass(), "lastRegionName", "rgqlgxwfGD");
        setIntField(term106870, term106870.getClass(), "lastAllNetId", -655069845);
        setField(term106870, term106870.getClass(), "lastClientId", "PDYTQfQsZd");
        setIntField(term106870, term106870.getClass(), "lastUsedDeckId", -489615582);
        setIntField(term106870, term106870.getClass(), "lastPlayMusicLevel", 627648167);
        setIntField(term106870, term106870.getClass(), "lastEmoneyBrand", -1937818486);
        setField(term106868, term106868.getClass(), "user", term106870);
        setIntField(term106868, term106868.getClass(), "itemKind", -1847517978);
        setIntField(term106868, term106868.getClass(), "itemId", 1452025284);
        setIntField(term106868, term106868.getClass(), "stock", 694572730);
        setBooleanField(term106868, term106868.getClass(), "isValid", false);
        term107137 = new Integer(809297786);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserItem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term107137;
        callMethod(klass, "setItemKind", argTypes, term106868, args);
    }

};


