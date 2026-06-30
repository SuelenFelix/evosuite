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

public class UserMusicItem_toString_195695849712 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5552;

    public UserMusicItem_toString_195695849712() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5558 = new Long(2535595959091595249L);
        term5552 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicItem"));
        Object term5554 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term5556 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term5572 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5573 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5577 = newInstance(Class.forName("java.time.LocalTime"));
        Object term5582 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5583 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5587 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term5552, term5552.getClass(), "id", 21047099434645581L);
        setLongField(term5554, term5554.getClass(), "id", -8862087040734407227L);
        setLongField(term5556, term5556.getClass(), "id", -6394943900800506753L);
        setField(term5556, term5556.getClass(), "extId", term5558);
        setField(term5556, term5556.getClass(), "luid", "RMsXuyzKJV");
        setIntField(term5573, term5573.getClass(), "year", 2028);
        setShortField(term5573, term5573.getClass(), "month", (short) 10);
        setShortField(term5573, term5573.getClass(), "day", (short) 1);
        setField(term5572, term5572.getClass(), "date", term5573);
        setByteField(term5577, term5577.getClass(), "hour", (byte) 17);
        setByteField(term5577, term5577.getClass(), "minute", (byte) 29);
        setByteField(term5577, term5577.getClass(), "second", (byte) 30);
        setIntField(term5577, term5577.getClass(), "nano", 845472306);
        setField(term5572, term5572.getClass(), "time", term5577);
        setField(term5556, term5556.getClass(), "registerTime", term5572);
        setIntField(term5583, term5583.getClass(), "year", 2027);
        setShortField(term5583, term5583.getClass(), "month", (short) 2);
        setShortField(term5583, term5583.getClass(), "day", (short) 19);
        setField(term5582, term5582.getClass(), "date", term5583);
        setByteField(term5587, term5587.getClass(), "hour", (byte) 17);
        setByteField(term5587, term5587.getClass(), "minute", (byte) 37);
        setByteField(term5587, term5587.getClass(), "second", (byte) 27);
        setIntField(term5587, term5587.getClass(), "nano", 920380537);
        setField(term5582, term5582.getClass(), "time", term5587);
        setField(term5556, term5556.getClass(), "accessTime", term5582);
        setField(term5554, term5554.getClass(), "card", term5556);
        setField(term5554, term5554.getClass(), "userName", "FwPbDZcHmB");
        setIntField(term5554, term5554.getClass(), "level", -1830198043);
        setIntField(term5554, term5554.getClass(), "reincarnationNum", -439048495);
        setLongField(term5554, term5554.getClass(), "exp", -4867941246533901410L);
        setLongField(term5554, term5554.getClass(), "point", 1044883697493326351L);
        setLongField(term5554, term5554.getClass(), "totalPoint", -7406618974062419277L);
        setIntField(term5554, term5554.getClass(), "playCount", -1849105286);
        setIntField(term5554, term5554.getClass(), "jewelCount", 1334483645);
        setIntField(term5554, term5554.getClass(), "totalJewelCount", 917513193);
        setIntField(term5554, term5554.getClass(), "medalCount", 787278105);
        setIntField(term5554, term5554.getClass(), "playerRating", -2063843486);
        setIntField(term5554, term5554.getClass(), "highestRating", 833762980);
        setIntField(term5554, term5554.getClass(), "battlePoint", 320711637);
        setIntField(term5554, term5554.getClass(), "bestBattlePoint", 1241164745);
        setIntField(term5554, term5554.getClass(), "overDamageBattlePoint", 1723148410);
        setBooleanField(term5554, term5554.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term5554, term5554.getClass(), "nameplateId", -920797484);
        setIntField(term5554, term5554.getClass(), "trophyId", -1631697577);
        setIntField(term5554, term5554.getClass(), "cardId", 765731371);
        setIntField(term5554, term5554.getClass(), "characterId", -1703035419);
        setIntField(term5554, term5554.getClass(), "characterVoiceNo", 765766290);
        setIntField(term5554, term5554.getClass(), "tabSetting", -1284825282);
        setIntField(term5554, term5554.getClass(), "tabSortSetting", -1941343035);
        setIntField(term5554, term5554.getClass(), "cardCategorySetting", 947897214);
        setIntField(term5554, term5554.getClass(), "cardSortSetting", 1496340209);
        setIntField(term5554, term5554.getClass(), "rivalScoreCategorySetting", -1748391876);
        setIntField(term5554, term5554.getClass(), "playedTutorialBit", 43258317);
        setIntField(term5554, term5554.getClass(), "firstTutorialCancelNum", 1707220033);
        setLongField(term5554, term5554.getClass(), "sumTechHighScore", 868503089567085985L);
        setLongField(term5554, term5554.getClass(), "sumTechBasicHighScore", -3277773415369003529L);
        setLongField(term5554, term5554.getClass(), "sumTechAdvancedHighScore", 1253549421411622358L);
        setLongField(term5554, term5554.getClass(), "sumTechExpertHighScore", 3666226122807672448L);
        setLongField(term5554, term5554.getClass(), "sumTechMasterHighScore", 3108750145697087661L);
        setLongField(term5554, term5554.getClass(), "sumTechLunaticHighScore", 3752337209837437327L);
        setLongField(term5554, term5554.getClass(), "sumBattleHighScore", 1860789353508856614L);
        setLongField(term5554, term5554.getClass(), "sumBattleBasicHighScore", -7456852906235966771L);
        setLongField(term5554, term5554.getClass(), "sumBattleAdvancedHighScore", -67485388932970712L);
        setLongField(term5554, term5554.getClass(), "sumBattleExpertHighScore", 5806367330808555223L);
        setLongField(term5554, term5554.getClass(), "sumBattleMasterHighScore", 4576699120365923235L);
        setLongField(term5554, term5554.getClass(), "sumBattleLunaticHighScore", -1635471392209071620L);
        setField(term5554, term5554.getClass(), "eventWatchedDate", "hOncybyCAH");
        setField(term5554, term5554.getClass(), "cmEventWatchedDate", "QduALnDSVo");
        setField(term5554, term5554.getClass(), "firstGameId", "izPpKDErnQ");
        setField(term5554, term5554.getClass(), "firstRomVersion", "NnpwZBUTvx");
        setField(term5554, term5554.getClass(), "firstDataVersion", "tlQSNgTkQX");
        setField(term5554, term5554.getClass(), "firstPlayDate", "PCipZnmBOF");
        setField(term5554, term5554.getClass(), "lastGameId", "zcorEihhLK");
        setField(term5554, term5554.getClass(), "lastRomVersion", "GrqozDKFOk");
        setField(term5554, term5554.getClass(), "lastDataVersion", "CFyoseFGLF");
        setField(term5554, term5554.getClass(), "compatibleCmVersion", "SFqCrhEWLm");
        setField(term5554, term5554.getClass(), "lastPlayDate", "GZdcJyZntS");
        setIntField(term5554, term5554.getClass(), "lastPlaceId", -1792504217);
        setField(term5554, term5554.getClass(), "lastPlaceName", "OIHoJeysUi");
        setIntField(term5554, term5554.getClass(), "lastRegionId", 1824538861);
        setField(term5554, term5554.getClass(), "lastRegionName", "WXMWFDGcLB");
        setIntField(term5554, term5554.getClass(), "lastAllNetId", 499519708);
        setField(term5554, term5554.getClass(), "lastClientId", "wKWbJssZuG");
        setIntField(term5554, term5554.getClass(), "lastUsedDeckId", 1501165033);
        setIntField(term5554, term5554.getClass(), "lastPlayMusicLevel", 510162332);
        setIntField(term5554, term5554.getClass(), "lastEmoneyBrand", 888506903);
        setField(term5552, term5552.getClass(), "user", term5554);
        setIntField(term5552, term5552.getClass(), "musicId", 200252898);
        setIntField(term5552, term5552.getClass(), "status", -1831826725);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term5552, args);
    }

};


