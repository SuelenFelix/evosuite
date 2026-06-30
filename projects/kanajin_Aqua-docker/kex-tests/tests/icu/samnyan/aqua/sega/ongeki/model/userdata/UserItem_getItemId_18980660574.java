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

public class UserItem_getItemId_18980660574 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term104298;

    public UserItem_getItemId_18980660574() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term104304 = new Long(394960377236392159L);
        term104298 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserItem"));
        Object term104300 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term104302 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term104318 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term104319 = newInstance(Class.forName("java.time.LocalDate"));
        Object term104323 = newInstance(Class.forName("java.time.LocalTime"));
        Object term104328 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term104329 = newInstance(Class.forName("java.time.LocalDate"));
        Object term104333 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term104298, term104298.getClass(), "id", -8708465919524844765L);
        setLongField(term104300, term104300.getClass(), "id", -704142162825170826L);
        setLongField(term104302, term104302.getClass(), "id", 5763481023374009618L);
        setField(term104302, term104302.getClass(), "extId", term104304);
        setField(term104302, term104302.getClass(), "luid", "UrAeseWSFd");
        setIntField(term104319, term104319.getClass(), "year", 2012);
        setShortField(term104319, term104319.getClass(), "month", (short) 4);
        setShortField(term104319, term104319.getClass(), "day", (short) 21);
        setField(term104318, term104318.getClass(), "date", term104319);
        setByteField(term104323, term104323.getClass(), "hour", (byte) 8);
        setByteField(term104323, term104323.getClass(), "minute", (byte) 7);
        setByteField(term104323, term104323.getClass(), "second", (byte) 21);
        setIntField(term104323, term104323.getClass(), "nano", 641327534);
        setField(term104318, term104318.getClass(), "time", term104323);
        setField(term104302, term104302.getClass(), "registerTime", term104318);
        setIntField(term104329, term104329.getClass(), "year", 2028);
        setShortField(term104329, term104329.getClass(), "month", (short) 6);
        setShortField(term104329, term104329.getClass(), "day", (short) 11);
        setField(term104328, term104328.getClass(), "date", term104329);
        setByteField(term104333, term104333.getClass(), "hour", (byte) 15);
        setByteField(term104333, term104333.getClass(), "minute", (byte) 2);
        setByteField(term104333, term104333.getClass(), "second", (byte) 44);
        setIntField(term104333, term104333.getClass(), "nano", 463103620);
        setField(term104328, term104328.getClass(), "time", term104333);
        setField(term104302, term104302.getClass(), "accessTime", term104328);
        setField(term104300, term104300.getClass(), "card", term104302);
        setField(term104300, term104300.getClass(), "userName", "udLLyuUbuM");
        setIntField(term104300, term104300.getClass(), "level", 1739332917);
        setIntField(term104300, term104300.getClass(), "reincarnationNum", -1942607717);
        setLongField(term104300, term104300.getClass(), "exp", -8524505479557663199L);
        setLongField(term104300, term104300.getClass(), "point", -6487429259464781998L);
        setLongField(term104300, term104300.getClass(), "totalPoint", -3030396384377409618L);
        setIntField(term104300, term104300.getClass(), "playCount", 2004204445);
        setIntField(term104300, term104300.getClass(), "jewelCount", 1813480917);
        setIntField(term104300, term104300.getClass(), "totalJewelCount", -164198746);
        setIntField(term104300, term104300.getClass(), "medalCount", -335778340);
        setIntField(term104300, term104300.getClass(), "playerRating", 1446088650);
        setIntField(term104300, term104300.getClass(), "highestRating", 1275760441);
        setIntField(term104300, term104300.getClass(), "battlePoint", 1486085635);
        setIntField(term104300, term104300.getClass(), "bestBattlePoint", -2029499473);
        setIntField(term104300, term104300.getClass(), "overDamageBattlePoint", 543873732);
        setBooleanField(term104300, term104300.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term104300, term104300.getClass(), "nameplateId", -214745694);
        setIntField(term104300, term104300.getClass(), "trophyId", -18584549);
        setIntField(term104300, term104300.getClass(), "cardId", -1678828778);
        setIntField(term104300, term104300.getClass(), "characterId", 1466641302);
        setIntField(term104300, term104300.getClass(), "characterVoiceNo", -365255901);
        setIntField(term104300, term104300.getClass(), "tabSetting", -1861629783);
        setIntField(term104300, term104300.getClass(), "tabSortSetting", 1512542473);
        setIntField(term104300, term104300.getClass(), "cardCategorySetting", 395474596);
        setIntField(term104300, term104300.getClass(), "cardSortSetting", -181917615);
        setIntField(term104300, term104300.getClass(), "rivalScoreCategorySetting", -175990400);
        setIntField(term104300, term104300.getClass(), "playedTutorialBit", -1756176486);
        setIntField(term104300, term104300.getClass(), "firstTutorialCancelNum", -1049589248);
        setLongField(term104300, term104300.getClass(), "sumTechHighScore", 2946981130573967101L);
        setLongField(term104300, term104300.getClass(), "sumTechBasicHighScore", 1103834255350828015L);
        setLongField(term104300, term104300.getClass(), "sumTechAdvancedHighScore", -6703714899145499790L);
        setLongField(term104300, term104300.getClass(), "sumTechExpertHighScore", -2092586213522560044L);
        setLongField(term104300, term104300.getClass(), "sumTechMasterHighScore", 7521364751791985311L);
        setLongField(term104300, term104300.getClass(), "sumTechLunaticHighScore", -2362717211512784297L);
        setLongField(term104300, term104300.getClass(), "sumBattleHighScore", 5025604058324282754L);
        setLongField(term104300, term104300.getClass(), "sumBattleBasicHighScore", -2959397318742188388L);
        setLongField(term104300, term104300.getClass(), "sumBattleAdvancedHighScore", 8582136574218148076L);
        setLongField(term104300, term104300.getClass(), "sumBattleExpertHighScore", 220429133805481043L);
        setLongField(term104300, term104300.getClass(), "sumBattleMasterHighScore", -443610926537795961L);
        setLongField(term104300, term104300.getClass(), "sumBattleLunaticHighScore", -2826747481250662816L);
        setField(term104300, term104300.getClass(), "eventWatchedDate", "sNNylQpAva");
        setField(term104300, term104300.getClass(), "cmEventWatchedDate", "fiwockBanw");
        setField(term104300, term104300.getClass(), "firstGameId", "VbcximgVTz");
        setField(term104300, term104300.getClass(), "firstRomVersion", "TGJZvuTmTU");
        setField(term104300, term104300.getClass(), "firstDataVersion", "BSkkjeLezA");
        setField(term104300, term104300.getClass(), "firstPlayDate", "uAlTVusgen");
        setField(term104300, term104300.getClass(), "lastGameId", "PAUaymMOSJ");
        setField(term104300, term104300.getClass(), "lastRomVersion", "OcTjqWhWJS");
        setField(term104300, term104300.getClass(), "lastDataVersion", "XkidVezikV");
        setField(term104300, term104300.getClass(), "compatibleCmVersion", "xSsMPNRSUV");
        setField(term104300, term104300.getClass(), "lastPlayDate", "DRbcFFNcSr");
        setIntField(term104300, term104300.getClass(), "lastPlaceId", 120294405);
        setField(term104300, term104300.getClass(), "lastPlaceName", "WGDSInQrVz");
        setIntField(term104300, term104300.getClass(), "lastRegionId", 1525059844);
        setField(term104300, term104300.getClass(), "lastRegionName", "pJboxLnvbb");
        setIntField(term104300, term104300.getClass(), "lastAllNetId", 1788101978);
        setField(term104300, term104300.getClass(), "lastClientId", "ofGdinTYHj");
        setIntField(term104300, term104300.getClass(), "lastUsedDeckId", -1324289284);
        setIntField(term104300, term104300.getClass(), "lastPlayMusicLevel", 2057345888);
        setIntField(term104300, term104300.getClass(), "lastEmoneyBrand", -2072027172);
        setField(term104298, term104298.getClass(), "user", term104300);
        setIntField(term104298, term104298.getClass(), "itemKind", 482848507);
        setIntField(term104298, term104298.getClass(), "itemId", -710465280);
        setIntField(term104298, term104298.getClass(), "stock", -1488460274);
        setBooleanField(term104298, term104298.getClass(), "isValid", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getItemId", argTypes, term104298, args);
    }

};


