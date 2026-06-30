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

public class UserCharacter_setIntimateCountDate_121104116221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term177703;

    public UserCharacter_setIntimateCountDate_121104116221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term177709 = new Long(8073378116544724166L);
        term177703 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCharacter"));
        Object term177705 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term177707 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term177723 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term177724 = newInstance(Class.forName("java.time.LocalDate"));
        Object term177728 = newInstance(Class.forName("java.time.LocalTime"));
        Object term177733 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term177734 = newInstance(Class.forName("java.time.LocalDate"));
        Object term177738 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term177703, term177703.getClass(), "id", -3285774727775346120L);
        setLongField(term177705, term177705.getClass(), "id", 2907673097447522431L);
        setLongField(term177707, term177707.getClass(), "id", -7550281487458806119L);
        setField(term177707, term177707.getClass(), "extId", term177709);
        setField(term177707, term177707.getClass(), "luid", "tXtEQPpSEE");
        setIntField(term177724, term177724.getClass(), "year", 2029);
        setShortField(term177724, term177724.getClass(), "month", (short) 9);
        setShortField(term177724, term177724.getClass(), "day", (short) 28);
        setField(term177723, term177723.getClass(), "date", term177724);
        setByteField(term177728, term177728.getClass(), "hour", (byte) 23);
        setByteField(term177728, term177728.getClass(), "minute", (byte) 32);
        setByteField(term177728, term177728.getClass(), "second", (byte) 19);
        setIntField(term177728, term177728.getClass(), "nano", 974262271);
        setField(term177723, term177723.getClass(), "time", term177728);
        setField(term177707, term177707.getClass(), "registerTime", term177723);
        setIntField(term177734, term177734.getClass(), "year", 2022);
        setShortField(term177734, term177734.getClass(), "month", (short) 2);
        setShortField(term177734, term177734.getClass(), "day", (short) 27);
        setField(term177733, term177733.getClass(), "date", term177734);
        setByteField(term177738, term177738.getClass(), "hour", (byte) 8);
        setByteField(term177738, term177738.getClass(), "minute", (byte) 19);
        setByteField(term177738, term177738.getClass(), "second", (byte) 13);
        setIntField(term177738, term177738.getClass(), "nano", 625027479);
        setField(term177733, term177733.getClass(), "time", term177738);
        setField(term177707, term177707.getClass(), "accessTime", term177733);
        setField(term177705, term177705.getClass(), "card", term177707);
        setField(term177705, term177705.getClass(), "userName", "DzwVEhJZMS");
        setIntField(term177705, term177705.getClass(), "level", 1875820558);
        setIntField(term177705, term177705.getClass(), "reincarnationNum", -1407454153);
        setLongField(term177705, term177705.getClass(), "exp", -4449926577327941560L);
        setLongField(term177705, term177705.getClass(), "point", -1243122150545245871L);
        setLongField(term177705, term177705.getClass(), "totalPoint", -220453106544991490L);
        setIntField(term177705, term177705.getClass(), "playCount", -1726816471);
        setIntField(term177705, term177705.getClass(), "jewelCount", -865440827);
        setIntField(term177705, term177705.getClass(), "totalJewelCount", -2087127412);
        setIntField(term177705, term177705.getClass(), "medalCount", -72570405);
        setIntField(term177705, term177705.getClass(), "playerRating", 581438361);
        setIntField(term177705, term177705.getClass(), "highestRating", 20384639);
        setIntField(term177705, term177705.getClass(), "battlePoint", -1080775278);
        setIntField(term177705, term177705.getClass(), "bestBattlePoint", 2060368087);
        setIntField(term177705, term177705.getClass(), "overDamageBattlePoint", 1408834928);
        setBooleanField(term177705, term177705.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term177705, term177705.getClass(), "nameplateId", 1892858909);
        setIntField(term177705, term177705.getClass(), "trophyId", -33022984);
        setIntField(term177705, term177705.getClass(), "cardId", -1693956020);
        setIntField(term177705, term177705.getClass(), "characterId", 1085043333);
        setIntField(term177705, term177705.getClass(), "characterVoiceNo", -49131583);
        setIntField(term177705, term177705.getClass(), "tabSetting", -1387551467);
        setIntField(term177705, term177705.getClass(), "tabSortSetting", 1764522064);
        setIntField(term177705, term177705.getClass(), "cardCategorySetting", -1284390757);
        setIntField(term177705, term177705.getClass(), "cardSortSetting", 151931305);
        setIntField(term177705, term177705.getClass(), "rivalScoreCategorySetting", -1047267671);
        setIntField(term177705, term177705.getClass(), "playedTutorialBit", 1567945730);
        setIntField(term177705, term177705.getClass(), "firstTutorialCancelNum", -996982809);
        setLongField(term177705, term177705.getClass(), "sumTechHighScore", -3227110689773365428L);
        setLongField(term177705, term177705.getClass(), "sumTechBasicHighScore", -2520438920123335755L);
        setLongField(term177705, term177705.getClass(), "sumTechAdvancedHighScore", -4660168183529399369L);
        setLongField(term177705, term177705.getClass(), "sumTechExpertHighScore", -6630336192289713270L);
        setLongField(term177705, term177705.getClass(), "sumTechMasterHighScore", 8056653133846760866L);
        setLongField(term177705, term177705.getClass(), "sumTechLunaticHighScore", 3965567100905628136L);
        setLongField(term177705, term177705.getClass(), "sumBattleHighScore", -7834143844726848544L);
        setLongField(term177705, term177705.getClass(), "sumBattleBasicHighScore", -9139306278104558329L);
        setLongField(term177705, term177705.getClass(), "sumBattleAdvancedHighScore", 1308491220938257201L);
        setLongField(term177705, term177705.getClass(), "sumBattleExpertHighScore", -7505572726357621067L);
        setLongField(term177705, term177705.getClass(), "sumBattleMasterHighScore", -6106805783768810845L);
        setLongField(term177705, term177705.getClass(), "sumBattleLunaticHighScore", 3214381382665107801L);
        setField(term177705, term177705.getClass(), "eventWatchedDate", "VGkwPggfzZ");
        setField(term177705, term177705.getClass(), "cmEventWatchedDate", "PFgASmmelX");
        setField(term177705, term177705.getClass(), "firstGameId", "hSyCiiwQkz");
        setField(term177705, term177705.getClass(), "firstRomVersion", "fkEwbIayDt");
        setField(term177705, term177705.getClass(), "firstDataVersion", "vltEBcsvel");
        setField(term177705, term177705.getClass(), "firstPlayDate", "hoJeCkpqsd");
        setField(term177705, term177705.getClass(), "lastGameId", "gRpupkcTcW");
        setField(term177705, term177705.getClass(), "lastRomVersion", "ZJDDVrpWKQ");
        setField(term177705, term177705.getClass(), "lastDataVersion", "OujZcbIAvX");
        setField(term177705, term177705.getClass(), "compatibleCmVersion", "putgxqKzNb");
        setField(term177705, term177705.getClass(), "lastPlayDate", "eYvQfPfILC");
        setIntField(term177705, term177705.getClass(), "lastPlaceId", -1428909988);
        setField(term177705, term177705.getClass(), "lastPlaceName", "xpTFhKPifw");
        setIntField(term177705, term177705.getClass(), "lastRegionId", -475684612);
        setField(term177705, term177705.getClass(), "lastRegionName", "rTWxqzcgFU");
        setIntField(term177705, term177705.getClass(), "lastAllNetId", 299503838);
        setField(term177705, term177705.getClass(), "lastClientId", "sCeWhCgsvx");
        setIntField(term177705, term177705.getClass(), "lastUsedDeckId", 1662024143);
        setIntField(term177705, term177705.getClass(), "lastPlayMusicLevel", -1236889825);
        setIntField(term177705, term177705.getClass(), "lastEmoneyBrand", 308776262);
        setField(term177703, term177703.getClass(), "user", term177705);
        setIntField(term177703, term177703.getClass(), "characterId", 2147290962);
        setIntField(term177703, term177703.getClass(), "costumeId", 131121140);
        setIntField(term177703, term177703.getClass(), "attachmentId", -1875674450);
        setIntField(term177703, term177703.getClass(), "playCount", -1933838767);
        setIntField(term177703, term177703.getClass(), "intimateLevel", -249737071);
        setIntField(term177703, term177703.getClass(), "intimateCount", -1495822478);
        setIntField(term177703, term177703.getClass(), "intimateCountRewarded", 1837477160);
        setField(term177703, term177703.getClass(), "intimateCountDate", "nVVpGoWnZd");
        setBooleanField(term177703, term177703.getClass(), "isNew", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCharacter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "EEEzvJXKOf";
        callMethod(klass, "setIntimateCountDate", argTypes, term177703, args);
    }

};


