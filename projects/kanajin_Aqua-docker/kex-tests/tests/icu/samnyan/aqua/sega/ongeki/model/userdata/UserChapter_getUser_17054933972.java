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

public class UserChapter_getUser_17054933972 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84057;

    public UserChapter_getUser_17054933972() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term84063 = new Long(-1677189124507026637L);
        term84057 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserChapter"));
        Object term84059 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term84061 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term84077 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term84078 = newInstance(Class.forName("java.time.LocalDate"));
        Object term84082 = newInstance(Class.forName("java.time.LocalTime"));
        Object term84087 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term84088 = newInstance(Class.forName("java.time.LocalDate"));
        Object term84092 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term84057, term84057.getClass(), "id", -7620925860140899942L);
        setLongField(term84059, term84059.getClass(), "id", -1724240476349102238L);
        setLongField(term84061, term84061.getClass(), "id", -7264050965874537139L);
        setField(term84061, term84061.getClass(), "extId", term84063);
        setField(term84061, term84061.getClass(), "luid", "mEYsXJvgdv");
        setIntField(term84078, term84078.getClass(), "year", 2024);
        setShortField(term84078, term84078.getClass(), "month", (short) 11);
        setShortField(term84078, term84078.getClass(), "day", (short) 16);
        setField(term84077, term84077.getClass(), "date", term84078);
        setByteField(term84082, term84082.getClass(), "hour", (byte) 23);
        setByteField(term84082, term84082.getClass(), "minute", (byte) 40);
        setByteField(term84082, term84082.getClass(), "second", (byte) 40);
        setIntField(term84082, term84082.getClass(), "nano", 810133212);
        setField(term84077, term84077.getClass(), "time", term84082);
        setField(term84061, term84061.getClass(), "registerTime", term84077);
        setIntField(term84088, term84088.getClass(), "year", 2018);
        setShortField(term84088, term84088.getClass(), "month", (short) 5);
        setShortField(term84088, term84088.getClass(), "day", (short) 15);
        setField(term84087, term84087.getClass(), "date", term84088);
        setByteField(term84092, term84092.getClass(), "hour", (byte) 17);
        setByteField(term84092, term84092.getClass(), "minute", (byte) 19);
        setByteField(term84092, term84092.getClass(), "second", (byte) 28);
        setIntField(term84092, term84092.getClass(), "nano", 153049369);
        setField(term84087, term84087.getClass(), "time", term84092);
        setField(term84061, term84061.getClass(), "accessTime", term84087);
        setField(term84059, term84059.getClass(), "card", term84061);
        setField(term84059, term84059.getClass(), "userName", "JKbmIUKwNm");
        setIntField(term84059, term84059.getClass(), "level", -2017108585);
        setIntField(term84059, term84059.getClass(), "reincarnationNum", 1915480534);
        setLongField(term84059, term84059.getClass(), "exp", -3852768873412739872L);
        setLongField(term84059, term84059.getClass(), "point", 2712970677838289717L);
        setLongField(term84059, term84059.getClass(), "totalPoint", -6168541673690224010L);
        setIntField(term84059, term84059.getClass(), "playCount", -1435370707);
        setIntField(term84059, term84059.getClass(), "jewelCount", 1417436255);
        setIntField(term84059, term84059.getClass(), "totalJewelCount", -198413341);
        setIntField(term84059, term84059.getClass(), "medalCount", 310965446);
        setIntField(term84059, term84059.getClass(), "playerRating", 828272209);
        setIntField(term84059, term84059.getClass(), "highestRating", 689750472);
        setIntField(term84059, term84059.getClass(), "battlePoint", -1898359702);
        setIntField(term84059, term84059.getClass(), "bestBattlePoint", 1270525323);
        setIntField(term84059, term84059.getClass(), "overDamageBattlePoint", 488822117);
        setBooleanField(term84059, term84059.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term84059, term84059.getClass(), "nameplateId", 433989355);
        setIntField(term84059, term84059.getClass(), "trophyId", 2018844661);
        setIntField(term84059, term84059.getClass(), "cardId", -1021729545);
        setIntField(term84059, term84059.getClass(), "characterId", 430508385);
        setIntField(term84059, term84059.getClass(), "characterVoiceNo", -1793486194);
        setIntField(term84059, term84059.getClass(), "tabSetting", 433257791);
        setIntField(term84059, term84059.getClass(), "tabSortSetting", 29812279);
        setIntField(term84059, term84059.getClass(), "cardCategorySetting", -1215649058);
        setIntField(term84059, term84059.getClass(), "cardSortSetting", 1937894049);
        setIntField(term84059, term84059.getClass(), "rivalScoreCategorySetting", -1008516956);
        setIntField(term84059, term84059.getClass(), "playedTutorialBit", -1366321540);
        setIntField(term84059, term84059.getClass(), "firstTutorialCancelNum", -157715735);
        setLongField(term84059, term84059.getClass(), "sumTechHighScore", -1730227990793261400L);
        setLongField(term84059, term84059.getClass(), "sumTechBasicHighScore", 6980156273711850847L);
        setLongField(term84059, term84059.getClass(), "sumTechAdvancedHighScore", 7999738434372521040L);
        setLongField(term84059, term84059.getClass(), "sumTechExpertHighScore", 8493039976562850019L);
        setLongField(term84059, term84059.getClass(), "sumTechMasterHighScore", -4375263216052145361L);
        setLongField(term84059, term84059.getClass(), "sumTechLunaticHighScore", 3225363048280133888L);
        setLongField(term84059, term84059.getClass(), "sumBattleHighScore", 8856252785841406435L);
        setLongField(term84059, term84059.getClass(), "sumBattleBasicHighScore", 8758451103376419654L);
        setLongField(term84059, term84059.getClass(), "sumBattleAdvancedHighScore", 8118053651038956587L);
        setLongField(term84059, term84059.getClass(), "sumBattleExpertHighScore", 801474024116335106L);
        setLongField(term84059, term84059.getClass(), "sumBattleMasterHighScore", -433903080990391127L);
        setLongField(term84059, term84059.getClass(), "sumBattleLunaticHighScore", 1989061074999485854L);
        setField(term84059, term84059.getClass(), "eventWatchedDate", "rftaOUctkN");
        setField(term84059, term84059.getClass(), "cmEventWatchedDate", "BqodsrSZso");
        setField(term84059, term84059.getClass(), "firstGameId", "APQYHLBKit");
        setField(term84059, term84059.getClass(), "firstRomVersion", "tIucnzigbY");
        setField(term84059, term84059.getClass(), "firstDataVersion", "SMZbMLuReo");
        setField(term84059, term84059.getClass(), "firstPlayDate", "YNXNgIokRz");
        setField(term84059, term84059.getClass(), "lastGameId", "XRDgUBBIlB");
        setField(term84059, term84059.getClass(), "lastRomVersion", "kWMQGdvKwx");
        setField(term84059, term84059.getClass(), "lastDataVersion", "zRwnGNjqEc");
        setField(term84059, term84059.getClass(), "compatibleCmVersion", "PadBNsKGSM");
        setField(term84059, term84059.getClass(), "lastPlayDate", "BqLgONTWcn");
        setIntField(term84059, term84059.getClass(), "lastPlaceId", -935537025);
        setField(term84059, term84059.getClass(), "lastPlaceName", "QyyvfuUsSl");
        setIntField(term84059, term84059.getClass(), "lastRegionId", 855956248);
        setField(term84059, term84059.getClass(), "lastRegionName", "urXLfQoyuc");
        setIntField(term84059, term84059.getClass(), "lastAllNetId", -1971819811);
        setField(term84059, term84059.getClass(), "lastClientId", "KoWkwRBvcY");
        setIntField(term84059, term84059.getClass(), "lastUsedDeckId", 2136685850);
        setIntField(term84059, term84059.getClass(), "lastPlayMusicLevel", 1848705396);
        setIntField(term84059, term84059.getClass(), "lastEmoneyBrand", -748010406);
        setField(term84057, term84057.getClass(), "user", term84059);
        setIntField(term84057, term84057.getClass(), "chapterId", 904927355);
        setIntField(term84057, term84057.getClass(), "jewelCount", -2089541916);
        setIntField(term84057, term84057.getClass(), "lastPlayMusicCategory", 1066893695);
        setIntField(term84057, term84057.getClass(), "lastPlayMusicId", -1058646936);
        setIntField(term84057, term84057.getClass(), "lastPlayMusicLevel", 49685222);
        setBooleanField(term84057, term84057.getClass(), "isStoryWatched", true);
        setBooleanField(term84057, term84057.getClass(), "isClear", true);
        setIntField(term84057, term84057.getClass(), "skipTiming1", 298459181);
        setIntField(term84057, term84057.getClass(), "skipTiming2", -2122946984);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserChapter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUser", argTypes, term84057, args);
    }

};


