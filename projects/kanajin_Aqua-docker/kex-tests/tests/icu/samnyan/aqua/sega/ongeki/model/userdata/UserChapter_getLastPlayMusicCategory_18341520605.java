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

public class UserChapter_getLastPlayMusicCategory_18341520605 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term85359;

    public UserChapter_getLastPlayMusicCategory_18341520605() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term85365 = new Long(-8010214112439224349L);
        term85359 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserChapter"));
        Object term85361 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term85363 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term85379 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term85380 = newInstance(Class.forName("java.time.LocalDate"));
        Object term85384 = newInstance(Class.forName("java.time.LocalTime"));
        Object term85389 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term85390 = newInstance(Class.forName("java.time.LocalDate"));
        Object term85394 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term85359, term85359.getClass(), "id", -7520070789498833755L);
        setLongField(term85361, term85361.getClass(), "id", 3123302858747592150L);
        setLongField(term85363, term85363.getClass(), "id", -4782482127429671786L);
        setField(term85363, term85363.getClass(), "extId", term85365);
        setField(term85363, term85363.getClass(), "luid", "EnYnZHmIml");
        setIntField(term85380, term85380.getClass(), "year", 2018);
        setShortField(term85380, term85380.getClass(), "month", (short) 2);
        setShortField(term85380, term85380.getClass(), "day", (short) 16);
        setField(term85379, term85379.getClass(), "date", term85380);
        setByteField(term85384, term85384.getClass(), "hour", (byte) 16);
        setByteField(term85384, term85384.getClass(), "minute", (byte) 32);
        setByteField(term85384, term85384.getClass(), "second", (byte) 46);
        setIntField(term85384, term85384.getClass(), "nano", 932915298);
        setField(term85379, term85379.getClass(), "time", term85384);
        setField(term85363, term85363.getClass(), "registerTime", term85379);
        setIntField(term85390, term85390.getClass(), "year", 2013);
        setShortField(term85390, term85390.getClass(), "month", (short) 11);
        setShortField(term85390, term85390.getClass(), "day", (short) 7);
        setField(term85389, term85389.getClass(), "date", term85390);
        setByteField(term85394, term85394.getClass(), "hour", (byte) 9);
        setByteField(term85394, term85394.getClass(), "minute", (byte) 3);
        setByteField(term85394, term85394.getClass(), "second", (byte) 32);
        setIntField(term85394, term85394.getClass(), "nano", 53548583);
        setField(term85389, term85389.getClass(), "time", term85394);
        setField(term85363, term85363.getClass(), "accessTime", term85389);
        setField(term85361, term85361.getClass(), "card", term85363);
        setField(term85361, term85361.getClass(), "userName", "jvhvoAISsw");
        setIntField(term85361, term85361.getClass(), "level", -2013372984);
        setIntField(term85361, term85361.getClass(), "reincarnationNum", -465191172);
        setLongField(term85361, term85361.getClass(), "exp", 240315852180007985L);
        setLongField(term85361, term85361.getClass(), "point", -97075969010685575L);
        setLongField(term85361, term85361.getClass(), "totalPoint", -2947100554916560706L);
        setIntField(term85361, term85361.getClass(), "playCount", -1717726169);
        setIntField(term85361, term85361.getClass(), "jewelCount", 1191663397);
        setIntField(term85361, term85361.getClass(), "totalJewelCount", -1104234890);
        setIntField(term85361, term85361.getClass(), "medalCount", 2120346422);
        setIntField(term85361, term85361.getClass(), "playerRating", 1796274246);
        setIntField(term85361, term85361.getClass(), "highestRating", 1256591052);
        setIntField(term85361, term85361.getClass(), "battlePoint", -281058594);
        setIntField(term85361, term85361.getClass(), "bestBattlePoint", -924330297);
        setIntField(term85361, term85361.getClass(), "overDamageBattlePoint", -798738362);
        setBooleanField(term85361, term85361.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term85361, term85361.getClass(), "nameplateId", 280855495);
        setIntField(term85361, term85361.getClass(), "trophyId", -1336475116);
        setIntField(term85361, term85361.getClass(), "cardId", -229094004);
        setIntField(term85361, term85361.getClass(), "characterId", 1055966732);
        setIntField(term85361, term85361.getClass(), "characterVoiceNo", -159550312);
        setIntField(term85361, term85361.getClass(), "tabSetting", -376455725);
        setIntField(term85361, term85361.getClass(), "tabSortSetting", -522518067);
        setIntField(term85361, term85361.getClass(), "cardCategorySetting", 513188923);
        setIntField(term85361, term85361.getClass(), "cardSortSetting", 1331840981);
        setIntField(term85361, term85361.getClass(), "rivalScoreCategorySetting", -1781235207);
        setIntField(term85361, term85361.getClass(), "playedTutorialBit", 1513185438);
        setIntField(term85361, term85361.getClass(), "firstTutorialCancelNum", 2065870022);
        setLongField(term85361, term85361.getClass(), "sumTechHighScore", 7688532003614369347L);
        setLongField(term85361, term85361.getClass(), "sumTechBasicHighScore", -8654357733658141611L);
        setLongField(term85361, term85361.getClass(), "sumTechAdvancedHighScore", -6395687392343866776L);
        setLongField(term85361, term85361.getClass(), "sumTechExpertHighScore", 1307997391749233384L);
        setLongField(term85361, term85361.getClass(), "sumTechMasterHighScore", -1103232804976080479L);
        setLongField(term85361, term85361.getClass(), "sumTechLunaticHighScore", 8113209483343094504L);
        setLongField(term85361, term85361.getClass(), "sumBattleHighScore", 8607092516036150255L);
        setLongField(term85361, term85361.getClass(), "sumBattleBasicHighScore", 9029917960021632743L);
        setLongField(term85361, term85361.getClass(), "sumBattleAdvancedHighScore", -7269143746258679330L);
        setLongField(term85361, term85361.getClass(), "sumBattleExpertHighScore", 7440272536369503614L);
        setLongField(term85361, term85361.getClass(), "sumBattleMasterHighScore", -4542644100614481650L);
        setLongField(term85361, term85361.getClass(), "sumBattleLunaticHighScore", -5670050153563737232L);
        setField(term85361, term85361.getClass(), "eventWatchedDate", "NkOntrweCo");
        setField(term85361, term85361.getClass(), "cmEventWatchedDate", "hVtvnBKztu");
        setField(term85361, term85361.getClass(), "firstGameId", "VOpwlWudOv");
        setField(term85361, term85361.getClass(), "firstRomVersion", "eEXpzGjDgl");
        setField(term85361, term85361.getClass(), "firstDataVersion", "vGLuBgtHzA");
        setField(term85361, term85361.getClass(), "firstPlayDate", "iOiyjODkqg");
        setField(term85361, term85361.getClass(), "lastGameId", "pgpXJLwACM");
        setField(term85361, term85361.getClass(), "lastRomVersion", "JgrZdrciib");
        setField(term85361, term85361.getClass(), "lastDataVersion", "mjPUAINebK");
        setField(term85361, term85361.getClass(), "compatibleCmVersion", "QdBJxwpNcu");
        setField(term85361, term85361.getClass(), "lastPlayDate", "jdwewuUtBW");
        setIntField(term85361, term85361.getClass(), "lastPlaceId", 945426732);
        setField(term85361, term85361.getClass(), "lastPlaceName", "CXekzSdVWc");
        setIntField(term85361, term85361.getClass(), "lastRegionId", 202749749);
        setField(term85361, term85361.getClass(), "lastRegionName", "heJZxFqAJC");
        setIntField(term85361, term85361.getClass(), "lastAllNetId", -992491384);
        setField(term85361, term85361.getClass(), "lastClientId", "DGNjGJtXwQ");
        setIntField(term85361, term85361.getClass(), "lastUsedDeckId", -1380307770);
        setIntField(term85361, term85361.getClass(), "lastPlayMusicLevel", -398040410);
        setIntField(term85361, term85361.getClass(), "lastEmoneyBrand", 805467390);
        setField(term85359, term85359.getClass(), "user", term85361);
        setIntField(term85359, term85359.getClass(), "chapterId", -290388375);
        setIntField(term85359, term85359.getClass(), "jewelCount", -532420212);
        setIntField(term85359, term85359.getClass(), "lastPlayMusicCategory", 78868015);
        setIntField(term85359, term85359.getClass(), "lastPlayMusicId", 1775132358);
        setIntField(term85359, term85359.getClass(), "lastPlayMusicLevel", 1425161368);
        setBooleanField(term85359, term85359.getClass(), "isStoryWatched", true);
        setBooleanField(term85359, term85359.getClass(), "isClear", true);
        setIntField(term85359, term85359.getClass(), "skipTiming1", -340532486);
        setIntField(term85359, term85359.getClass(), "skipTiming2", 1445018453);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserChapter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastPlayMusicCategory", argTypes, term85359, args);
    }

};


