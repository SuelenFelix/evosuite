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

public class UserChapter_toString_160379745026 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term94918;

    public UserChapter_toString_160379745026() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term94924 = new Long(-3954795081650780841L);
        term94918 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserChapter"));
        Object term94920 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term94922 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term94938 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term94939 = newInstance(Class.forName("java.time.LocalDate"));
        Object term94943 = newInstance(Class.forName("java.time.LocalTime"));
        Object term94948 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term94949 = newInstance(Class.forName("java.time.LocalDate"));
        Object term94953 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term94918, term94918.getClass(), "id", -8254910154627096258L);
        setLongField(term94920, term94920.getClass(), "id", -668121876281857893L);
        setLongField(term94922, term94922.getClass(), "id", 7045963234622810797L);
        setField(term94922, term94922.getClass(), "extId", term94924);
        setField(term94922, term94922.getClass(), "luid", "mouoQUznmq");
        setIntField(term94939, term94939.getClass(), "year", 2015);
        setShortField(term94939, term94939.getClass(), "month", (short) 5);
        setShortField(term94939, term94939.getClass(), "day", (short) 26);
        setField(term94938, term94938.getClass(), "date", term94939);
        setByteField(term94943, term94943.getClass(), "hour", (byte) 9);
        setByteField(term94943, term94943.getClass(), "minute", (byte) 34);
        setByteField(term94943, term94943.getClass(), "second", (byte) 10);
        setIntField(term94943, term94943.getClass(), "nano", 873043034);
        setField(term94938, term94938.getClass(), "time", term94943);
        setField(term94922, term94922.getClass(), "registerTime", term94938);
        setIntField(term94949, term94949.getClass(), "year", 2021);
        setShortField(term94949, term94949.getClass(), "month", (short) 11);
        setShortField(term94949, term94949.getClass(), "day", (short) 13);
        setField(term94948, term94948.getClass(), "date", term94949);
        setByteField(term94953, term94953.getClass(), "hour", (byte) 7);
        setByteField(term94953, term94953.getClass(), "minute", (byte) 27);
        setByteField(term94953, term94953.getClass(), "second", (byte) 1);
        setIntField(term94953, term94953.getClass(), "nano", 59611302);
        setField(term94948, term94948.getClass(), "time", term94953);
        setField(term94922, term94922.getClass(), "accessTime", term94948);
        setField(term94920, term94920.getClass(), "card", term94922);
        setField(term94920, term94920.getClass(), "userName", "WaacgRHGZQ");
        setIntField(term94920, term94920.getClass(), "level", 432526848);
        setIntField(term94920, term94920.getClass(), "reincarnationNum", 1875904227);
        setLongField(term94920, term94920.getClass(), "exp", 1687824749559906568L);
        setLongField(term94920, term94920.getClass(), "point", 1995968235555387542L);
        setLongField(term94920, term94920.getClass(), "totalPoint", -6996856775306653180L);
        setIntField(term94920, term94920.getClass(), "playCount", -273652787);
        setIntField(term94920, term94920.getClass(), "jewelCount", -20800272);
        setIntField(term94920, term94920.getClass(), "totalJewelCount", -2012090266);
        setIntField(term94920, term94920.getClass(), "medalCount", 1298920245);
        setIntField(term94920, term94920.getClass(), "playerRating", 1539128914);
        setIntField(term94920, term94920.getClass(), "highestRating", 627813167);
        setIntField(term94920, term94920.getClass(), "battlePoint", -2047312469);
        setIntField(term94920, term94920.getClass(), "bestBattlePoint", 38231753);
        setIntField(term94920, term94920.getClass(), "overDamageBattlePoint", 1404509429);
        setBooleanField(term94920, term94920.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term94920, term94920.getClass(), "nameplateId", -438218058);
        setIntField(term94920, term94920.getClass(), "trophyId", -1026369377);
        setIntField(term94920, term94920.getClass(), "cardId", 1373311750);
        setIntField(term94920, term94920.getClass(), "characterId", 1699366);
        setIntField(term94920, term94920.getClass(), "characterVoiceNo", 692170348);
        setIntField(term94920, term94920.getClass(), "tabSetting", -1022512329);
        setIntField(term94920, term94920.getClass(), "tabSortSetting", 201236178);
        setIntField(term94920, term94920.getClass(), "cardCategorySetting", 985775690);
        setIntField(term94920, term94920.getClass(), "cardSortSetting", 1159262757);
        setIntField(term94920, term94920.getClass(), "rivalScoreCategorySetting", 967155072);
        setIntField(term94920, term94920.getClass(), "playedTutorialBit", 1011025023);
        setIntField(term94920, term94920.getClass(), "firstTutorialCancelNum", 921803217);
        setLongField(term94920, term94920.getClass(), "sumTechHighScore", 3835090764096200475L);
        setLongField(term94920, term94920.getClass(), "sumTechBasicHighScore", 5730377142391172879L);
        setLongField(term94920, term94920.getClass(), "sumTechAdvancedHighScore", 8635274882082794551L);
        setLongField(term94920, term94920.getClass(), "sumTechExpertHighScore", -2681394215473457187L);
        setLongField(term94920, term94920.getClass(), "sumTechMasterHighScore", 7947192455627146496L);
        setLongField(term94920, term94920.getClass(), "sumTechLunaticHighScore", -8572163224279293640L);
        setLongField(term94920, term94920.getClass(), "sumBattleHighScore", 7794597996404888363L);
        setLongField(term94920, term94920.getClass(), "sumBattleBasicHighScore", -3603957943133943771L);
        setLongField(term94920, term94920.getClass(), "sumBattleAdvancedHighScore", -9117629478982711595L);
        setLongField(term94920, term94920.getClass(), "sumBattleExpertHighScore", -1518888676325043386L);
        setLongField(term94920, term94920.getClass(), "sumBattleMasterHighScore", -2277595927632613248L);
        setLongField(term94920, term94920.getClass(), "sumBattleLunaticHighScore", 1646543620789839486L);
        setField(term94920, term94920.getClass(), "eventWatchedDate", "GiqQhSRhZD");
        setField(term94920, term94920.getClass(), "cmEventWatchedDate", "oycMVEbykz");
        setField(term94920, term94920.getClass(), "firstGameId", "DdxinlKAiI");
        setField(term94920, term94920.getClass(), "firstRomVersion", "DZPXiwRtmo");
        setField(term94920, term94920.getClass(), "firstDataVersion", "abnCcSSxwb");
        setField(term94920, term94920.getClass(), "firstPlayDate", "PMbUpRmZHC");
        setField(term94920, term94920.getClass(), "lastGameId", "VGeGoUWPCQ");
        setField(term94920, term94920.getClass(), "lastRomVersion", "ZjkLeKLILi");
        setField(term94920, term94920.getClass(), "lastDataVersion", "CZAqWlBJTT");
        setField(term94920, term94920.getClass(), "compatibleCmVersion", "WPMnhxMKAm");
        setField(term94920, term94920.getClass(), "lastPlayDate", "tTGimFVzYt");
        setIntField(term94920, term94920.getClass(), "lastPlaceId", 2011014435);
        setField(term94920, term94920.getClass(), "lastPlaceName", "bkFWSyioMj");
        setIntField(term94920, term94920.getClass(), "lastRegionId", 256804816);
        setField(term94920, term94920.getClass(), "lastRegionName", "XBzdZXeLDL");
        setIntField(term94920, term94920.getClass(), "lastAllNetId", -726670877);
        setField(term94920, term94920.getClass(), "lastClientId", "eTycxkowtY");
        setIntField(term94920, term94920.getClass(), "lastUsedDeckId", 1595800712);
        setIntField(term94920, term94920.getClass(), "lastPlayMusicLevel", -1315471137);
        setIntField(term94920, term94920.getClass(), "lastEmoneyBrand", 307541055);
        setField(term94918, term94918.getClass(), "user", term94920);
        setIntField(term94918, term94918.getClass(), "chapterId", -664242488);
        setIntField(term94918, term94918.getClass(), "jewelCount", 1562272299);
        setIntField(term94918, term94918.getClass(), "lastPlayMusicCategory", 961476617);
        setIntField(term94918, term94918.getClass(), "lastPlayMusicId", -1978217643);
        setIntField(term94918, term94918.getClass(), "lastPlayMusicLevel", 53489031);
        setBooleanField(term94918, term94918.getClass(), "isStoryWatched", false);
        setBooleanField(term94918, term94918.getClass(), "isClear", true);
        setIntField(term94918, term94918.getClass(), "skipTiming1", -1349596098);
        setIntField(term94918, term94918.getClass(), "skipTiming2", 490711502);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserChapter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term94918, args);
    }

};


