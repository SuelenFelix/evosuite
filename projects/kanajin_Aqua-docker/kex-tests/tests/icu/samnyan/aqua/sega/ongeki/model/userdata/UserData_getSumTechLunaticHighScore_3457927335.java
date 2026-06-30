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

public class UserData_getSumTechLunaticHighScore_3457927335 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36723;

    public UserData_getSumTechLunaticHighScore_3457927335() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term36727 = new Long(-8652538484981166496L);
        term36723 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term36725 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term36741 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term36742 = newInstance(Class.forName("java.time.LocalDate"));
        Object term36746 = newInstance(Class.forName("java.time.LocalTime"));
        Object term36751 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term36752 = newInstance(Class.forName("java.time.LocalDate"));
        Object term36756 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term36723, term36723.getClass(), "id", 2458513029160061715L);
        setLongField(term36725, term36725.getClass(), "id", 8528564099162820842L);
        setField(term36725, term36725.getClass(), "extId", term36727);
        setField(term36725, term36725.getClass(), "luid", "qsjXSwKloH");
        setIntField(term36742, term36742.getClass(), "year", 2010);
        setShortField(term36742, term36742.getClass(), "month", (short) 2);
        setShortField(term36742, term36742.getClass(), "day", (short) 28);
        setField(term36741, term36741.getClass(), "date", term36742);
        setByteField(term36746, term36746.getClass(), "hour", (byte) 2);
        setByteField(term36746, term36746.getClass(), "minute", (byte) 54);
        setByteField(term36746, term36746.getClass(), "second", (byte) 48);
        setIntField(term36746, term36746.getClass(), "nano", 930628940);
        setField(term36741, term36741.getClass(), "time", term36746);
        setField(term36725, term36725.getClass(), "registerTime", term36741);
        setIntField(term36752, term36752.getClass(), "year", 2022);
        setShortField(term36752, term36752.getClass(), "month", (short) 3);
        setShortField(term36752, term36752.getClass(), "day", (short) 11);
        setField(term36751, term36751.getClass(), "date", term36752);
        setByteField(term36756, term36756.getClass(), "hour", (byte) 7);
        setByteField(term36756, term36756.getClass(), "minute", (byte) 12);
        setByteField(term36756, term36756.getClass(), "second", (byte) 56);
        setIntField(term36756, term36756.getClass(), "nano", 884158779);
        setField(term36751, term36751.getClass(), "time", term36756);
        setField(term36725, term36725.getClass(), "accessTime", term36751);
        setField(term36723, term36723.getClass(), "card", term36725);
        setField(term36723, term36723.getClass(), "userName", "DDZHUPglvb");
        setIntField(term36723, term36723.getClass(), "level", 1415001538);
        setIntField(term36723, term36723.getClass(), "reincarnationNum", 1738077695);
        setLongField(term36723, term36723.getClass(), "exp", -1931621459457925623L);
        setLongField(term36723, term36723.getClass(), "point", -947267660485940099L);
        setLongField(term36723, term36723.getClass(), "totalPoint", -1329447485805427573L);
        setIntField(term36723, term36723.getClass(), "playCount", -1351117314);
        setIntField(term36723, term36723.getClass(), "jewelCount", 1693588815);
        setIntField(term36723, term36723.getClass(), "totalJewelCount", 1272985537);
        setIntField(term36723, term36723.getClass(), "medalCount", -785719854);
        setIntField(term36723, term36723.getClass(), "playerRating", -1542292796);
        setIntField(term36723, term36723.getClass(), "highestRating", 1892295932);
        setIntField(term36723, term36723.getClass(), "battlePoint", 1028855301);
        setIntField(term36723, term36723.getClass(), "bestBattlePoint", -2075314038);
        setIntField(term36723, term36723.getClass(), "overDamageBattlePoint", 1085906450);
        setBooleanField(term36723, term36723.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term36723, term36723.getClass(), "nameplateId", 1892947629);
        setIntField(term36723, term36723.getClass(), "trophyId", -1350968212);
        setIntField(term36723, term36723.getClass(), "cardId", 2027049805);
        setIntField(term36723, term36723.getClass(), "characterId", 1777210338);
        setIntField(term36723, term36723.getClass(), "characterVoiceNo", 1406833110);
        setIntField(term36723, term36723.getClass(), "tabSetting", 971309393);
        setIntField(term36723, term36723.getClass(), "tabSortSetting", 1506905403);
        setIntField(term36723, term36723.getClass(), "cardCategorySetting", 1022586170);
        setIntField(term36723, term36723.getClass(), "cardSortSetting", -175612916);
        setIntField(term36723, term36723.getClass(), "rivalScoreCategorySetting", -1966814722);
        setIntField(term36723, term36723.getClass(), "playedTutorialBit", -2040048430);
        setIntField(term36723, term36723.getClass(), "firstTutorialCancelNum", 795243460);
        setLongField(term36723, term36723.getClass(), "sumTechHighScore", -2298075900308676256L);
        setLongField(term36723, term36723.getClass(), "sumTechBasicHighScore", -32504336313564415L);
        setLongField(term36723, term36723.getClass(), "sumTechAdvancedHighScore", -3072149709226785130L);
        setLongField(term36723, term36723.getClass(), "sumTechExpertHighScore", -539562950566320509L);
        setLongField(term36723, term36723.getClass(), "sumTechMasterHighScore", -6590502822258678292L);
        setLongField(term36723, term36723.getClass(), "sumTechLunaticHighScore", 707619162419050395L);
        setLongField(term36723, term36723.getClass(), "sumBattleHighScore", -2742794200189356451L);
        setLongField(term36723, term36723.getClass(), "sumBattleBasicHighScore", 784504767592240462L);
        setLongField(term36723, term36723.getClass(), "sumBattleAdvancedHighScore", -2000525962887472969L);
        setLongField(term36723, term36723.getClass(), "sumBattleExpertHighScore", 7651884502076816477L);
        setLongField(term36723, term36723.getClass(), "sumBattleMasterHighScore", -45437711112045954L);
        setLongField(term36723, term36723.getClass(), "sumBattleLunaticHighScore", -2665418140152906040L);
        setField(term36723, term36723.getClass(), "eventWatchedDate", "rWoaXvNyVg");
        setField(term36723, term36723.getClass(), "cmEventWatchedDate", "FLzaBCFjGv");
        setField(term36723, term36723.getClass(), "firstGameId", "OLYhTSqTqJ");
        setField(term36723, term36723.getClass(), "firstRomVersion", "AIHoadcpQz");
        setField(term36723, term36723.getClass(), "firstDataVersion", "fWMsLtuOEV");
        setField(term36723, term36723.getClass(), "firstPlayDate", "fvgZQBalnd");
        setField(term36723, term36723.getClass(), "lastGameId", "tViQSKUCLE");
        setField(term36723, term36723.getClass(), "lastRomVersion", "QbaeHheqiP");
        setField(term36723, term36723.getClass(), "lastDataVersion", "gASHxChKwn");
        setField(term36723, term36723.getClass(), "compatibleCmVersion", "iasolXlEEn");
        setField(term36723, term36723.getClass(), "lastPlayDate", "cAObIvLmLo");
        setIntField(term36723, term36723.getClass(), "lastPlaceId", 1116550927);
        setField(term36723, term36723.getClass(), "lastPlaceName", "xwiCqRSWSe");
        setIntField(term36723, term36723.getClass(), "lastRegionId", -1500511650);
        setField(term36723, term36723.getClass(), "lastRegionName", "IbUFkzIgzq");
        setIntField(term36723, term36723.getClass(), "lastAllNetId", 1722619795);
        setField(term36723, term36723.getClass(), "lastClientId", "dTOUSTDdbw");
        setIntField(term36723, term36723.getClass(), "lastUsedDeckId", 558598813);
        setIntField(term36723, term36723.getClass(), "lastPlayMusicLevel", -282356982);
        setIntField(term36723, term36723.getClass(), "lastEmoneyBrand", 1060240374);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSumTechLunaticHighScore", argTypes, term36723, args);
    }

};


