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

public class UserData_getJewelCount_20465877289 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25725;

    public UserData_getJewelCount_20465877289() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term25729 = new Long(-3838084482494604218L);
        term25725 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term25727 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term25743 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term25744 = newInstance(Class.forName("java.time.LocalDate"));
        Object term25748 = newInstance(Class.forName("java.time.LocalTime"));
        Object term25753 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term25754 = newInstance(Class.forName("java.time.LocalDate"));
        Object term25758 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term25725, term25725.getClass(), "id", -1224346442914356241L);
        setLongField(term25727, term25727.getClass(), "id", -1337024735423070709L);
        setField(term25727, term25727.getClass(), "extId", term25729);
        setField(term25727, term25727.getClass(), "luid", "fFhdWuJbdC");
        setIntField(term25744, term25744.getClass(), "year", 2022);
        setShortField(term25744, term25744.getClass(), "month", (short) 11);
        setShortField(term25744, term25744.getClass(), "day", (short) 5);
        setField(term25743, term25743.getClass(), "date", term25744);
        setByteField(term25748, term25748.getClass(), "hour", (byte) 0);
        setByteField(term25748, term25748.getClass(), "minute", (byte) 51);
        setByteField(term25748, term25748.getClass(), "second", (byte) 23);
        setIntField(term25748, term25748.getClass(), "nano", 1140962);
        setField(term25743, term25743.getClass(), "time", term25748);
        setField(term25727, term25727.getClass(), "registerTime", term25743);
        setIntField(term25754, term25754.getClass(), "year", 2020);
        setShortField(term25754, term25754.getClass(), "month", (short) 5);
        setShortField(term25754, term25754.getClass(), "day", (short) 24);
        setField(term25753, term25753.getClass(), "date", term25754);
        setByteField(term25758, term25758.getClass(), "hour", (byte) 2);
        setByteField(term25758, term25758.getClass(), "minute", (byte) 9);
        setByteField(term25758, term25758.getClass(), "second", (byte) 52);
        setIntField(term25758, term25758.getClass(), "nano", 653329393);
        setField(term25753, term25753.getClass(), "time", term25758);
        setField(term25727, term25727.getClass(), "accessTime", term25753);
        setField(term25725, term25725.getClass(), "card", term25727);
        setField(term25725, term25725.getClass(), "userName", "JlgLIHPabR");
        setIntField(term25725, term25725.getClass(), "level", -491132382);
        setIntField(term25725, term25725.getClass(), "reincarnationNum", 918882916);
        setLongField(term25725, term25725.getClass(), "exp", 5406702435763021326L);
        setLongField(term25725, term25725.getClass(), "point", 2674610463314008194L);
        setLongField(term25725, term25725.getClass(), "totalPoint", 4782766292773586077L);
        setIntField(term25725, term25725.getClass(), "playCount", 1544012770);
        setIntField(term25725, term25725.getClass(), "jewelCount", 1922068039);
        setIntField(term25725, term25725.getClass(), "totalJewelCount", -410564443);
        setIntField(term25725, term25725.getClass(), "medalCount", 996017434);
        setIntField(term25725, term25725.getClass(), "playerRating", -983870300);
        setIntField(term25725, term25725.getClass(), "highestRating", 360715062);
        setIntField(term25725, term25725.getClass(), "battlePoint", 1047409266);
        setIntField(term25725, term25725.getClass(), "bestBattlePoint", 1427248961);
        setIntField(term25725, term25725.getClass(), "overDamageBattlePoint", 1445291866);
        setBooleanField(term25725, term25725.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term25725, term25725.getClass(), "nameplateId", -139927812);
        setIntField(term25725, term25725.getClass(), "trophyId", -2065157320);
        setIntField(term25725, term25725.getClass(), "cardId", 1782011477);
        setIntField(term25725, term25725.getClass(), "characterId", 2129957018);
        setIntField(term25725, term25725.getClass(), "characterVoiceNo", 691663312);
        setIntField(term25725, term25725.getClass(), "tabSetting", -1236696275);
        setIntField(term25725, term25725.getClass(), "tabSortSetting", 575249858);
        setIntField(term25725, term25725.getClass(), "cardCategorySetting", -297957951);
        setIntField(term25725, term25725.getClass(), "cardSortSetting", -1816920588);
        setIntField(term25725, term25725.getClass(), "rivalScoreCategorySetting", 1674165862);
        setIntField(term25725, term25725.getClass(), "playedTutorialBit", 1875252647);
        setIntField(term25725, term25725.getClass(), "firstTutorialCancelNum", -1298688401);
        setLongField(term25725, term25725.getClass(), "sumTechHighScore", -1368803674967453727L);
        setLongField(term25725, term25725.getClass(), "sumTechBasicHighScore", -1596516630146686041L);
        setLongField(term25725, term25725.getClass(), "sumTechAdvancedHighScore", -8370506620911901379L);
        setLongField(term25725, term25725.getClass(), "sumTechExpertHighScore", -7185067999629587082L);
        setLongField(term25725, term25725.getClass(), "sumTechMasterHighScore", 8819168165968601827L);
        setLongField(term25725, term25725.getClass(), "sumTechLunaticHighScore", -5212780037221633520L);
        setLongField(term25725, term25725.getClass(), "sumBattleHighScore", -1622196407723421321L);
        setLongField(term25725, term25725.getClass(), "sumBattleBasicHighScore", 5587445443876887300L);
        setLongField(term25725, term25725.getClass(), "sumBattleAdvancedHighScore", -8147385208615265440L);
        setLongField(term25725, term25725.getClass(), "sumBattleExpertHighScore", 2169332993170315110L);
        setLongField(term25725, term25725.getClass(), "sumBattleMasterHighScore", -4266854609277222301L);
        setLongField(term25725, term25725.getClass(), "sumBattleLunaticHighScore", -3517544832850746345L);
        setField(term25725, term25725.getClass(), "eventWatchedDate", "LHnkeoNwHq");
        setField(term25725, term25725.getClass(), "cmEventWatchedDate", "gVnDVbSyKa");
        setField(term25725, term25725.getClass(), "firstGameId", "kdCYNMSuoD");
        setField(term25725, term25725.getClass(), "firstRomVersion", "eRYlSLwtvV");
        setField(term25725, term25725.getClass(), "firstDataVersion", "duOyJsARTD");
        setField(term25725, term25725.getClass(), "firstPlayDate", "xPnOHsNlyc");
        setField(term25725, term25725.getClass(), "lastGameId", "OTSPWPJefj");
        setField(term25725, term25725.getClass(), "lastRomVersion", "EOTYMqXRmE");
        setField(term25725, term25725.getClass(), "lastDataVersion", "iTxNduwSjE");
        setField(term25725, term25725.getClass(), "compatibleCmVersion", "MQUTfIiFnh");
        setField(term25725, term25725.getClass(), "lastPlayDate", "JeyKRznnft");
        setIntField(term25725, term25725.getClass(), "lastPlaceId", 1907832341);
        setField(term25725, term25725.getClass(), "lastPlaceName", "vQJUCtuYpK");
        setIntField(term25725, term25725.getClass(), "lastRegionId", 932199784);
        setField(term25725, term25725.getClass(), "lastRegionName", "GHtOeztAdz");
        setIntField(term25725, term25725.getClass(), "lastAllNetId", 1953620444);
        setField(term25725, term25725.getClass(), "lastClientId", "gSAtqakaLY");
        setIntField(term25725, term25725.getClass(), "lastUsedDeckId", -1111307978);
        setIntField(term25725, term25725.getClass(), "lastPlayMusicLevel", 609697271);
        setIntField(term25725, term25725.getClass(), "lastEmoneyBrand", 1121247998);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getJewelCount", argTypes, term25725, args);
    }

};


