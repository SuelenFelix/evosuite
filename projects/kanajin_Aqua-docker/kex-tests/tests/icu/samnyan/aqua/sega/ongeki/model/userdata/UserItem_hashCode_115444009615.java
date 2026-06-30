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

public class UserItem_hashCode_115444009615 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109452;

    public UserItem_hashCode_115444009615() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term109458 = new Long(868503089567085985L);
        term109452 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserItem"));
        Object term109454 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term109456 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term109472 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term109473 = newInstance(Class.forName("java.time.LocalDate"));
        Object term109477 = newInstance(Class.forName("java.time.LocalTime"));
        Object term109482 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term109483 = newInstance(Class.forName("java.time.LocalDate"));
        Object term109487 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term109452, term109452.getClass(), "id", -6329353215186838591L);
        setLongField(term109454, term109454.getClass(), "id", 7925418162187755469L);
        setLongField(term109456, term109456.getClass(), "id", -6971795230712890698L);
        setField(term109456, term109456.getClass(), "extId", term109458);
        setField(term109456, term109456.getClass(), "luid", "tmiPUgRXrn");
        setIntField(term109473, term109473.getClass(), "year", 2026);
        setShortField(term109473, term109473.getClass(), "month", (short) 10);
        setShortField(term109473, term109473.getClass(), "day", (short) 15);
        setField(term109472, term109472.getClass(), "date", term109473);
        setByteField(term109477, term109477.getClass(), "hour", (byte) 15);
        setByteField(term109477, term109477.getClass(), "minute", (byte) 25);
        setByteField(term109477, term109477.getClass(), "second", (byte) 12);
        setIntField(term109477, term109477.getClass(), "nano", 467763340);
        setField(term109472, term109472.getClass(), "time", term109477);
        setField(term109456, term109456.getClass(), "registerTime", term109472);
        setIntField(term109483, term109483.getClass(), "year", 2023);
        setShortField(term109483, term109483.getClass(), "month", (short) 1);
        setShortField(term109483, term109483.getClass(), "day", (short) 25);
        setField(term109482, term109482.getClass(), "date", term109483);
        setByteField(term109487, term109487.getClass(), "hour", (byte) 2);
        setByteField(term109487, term109487.getClass(), "minute", (byte) 13);
        setByteField(term109487, term109487.getClass(), "second", (byte) 2);
        setIntField(term109487, term109487.getClass(), "nano", 723644716);
        setField(term109482, term109482.getClass(), "time", term109487);
        setField(term109456, term109456.getClass(), "accessTime", term109482);
        setField(term109454, term109454.getClass(), "card", term109456);
        setField(term109454, term109454.getClass(), "userName", "VuZmwqnade");
        setIntField(term109454, term109454.getClass(), "level", 1868194288);
        setIntField(term109454, term109454.getClass(), "reincarnationNum", 517487974);
        setLongField(term109454, term109454.getClass(), "exp", -1390219565032927962L);
        setLongField(term109454, term109454.getClass(), "point", -1648679242770360877L);
        setLongField(term109454, term109454.getClass(), "totalPoint", 4286064964693758340L);
        setIntField(term109454, term109454.getClass(), "playCount", -1609952826);
        setIntField(term109454, term109454.getClass(), "jewelCount", -2135129588);
        setIntField(term109454, term109454.getClass(), "totalJewelCount", -1453667786);
        setIntField(term109454, term109454.getClass(), "medalCount", 390534071);
        setIntField(term109454, term109454.getClass(), "playerRating", 134001300);
        setIntField(term109454, term109454.getClass(), "highestRating", -1533628114);
        setIntField(term109454, term109454.getClass(), "battlePoint", 886396590);
        setIntField(term109454, term109454.getClass(), "bestBattlePoint", -1864639476);
        setIntField(term109454, term109454.getClass(), "overDamageBattlePoint", 233887874);
        setBooleanField(term109454, term109454.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term109454, term109454.getClass(), "nameplateId", 1421452259);
        setIntField(term109454, term109454.getClass(), "trophyId", 2051816737);
        setIntField(term109454, term109454.getClass(), "cardId", 191145214);
        setIntField(term109454, term109454.getClass(), "characterId", 597423188);
        setIntField(term109454, term109454.getClass(), "characterVoiceNo", 170448789);
        setIntField(term109454, term109454.getClass(), "tabSetting", -105784895);
        setIntField(term109454, term109454.getClass(), "tabSortSetting", -190866786);
        setIntField(term109454, term109454.getClass(), "cardCategorySetting", -1192542298);
        setIntField(term109454, term109454.getClass(), "cardSortSetting", 1742896562);
        setIntField(term109454, term109454.getClass(), "rivalScoreCategorySetting", -1205180837);
        setIntField(term109454, term109454.getClass(), "playedTutorialBit", 1782497174);
        setIntField(term109454, term109454.getClass(), "firstTutorialCancelNum", 354412864);
        setLongField(term109454, term109454.getClass(), "sumTechHighScore", 4164374892238891636L);
        setLongField(term109454, term109454.getClass(), "sumTechBasicHighScore", 5584714342078180658L);
        setLongField(term109454, term109454.getClass(), "sumTechAdvancedHighScore", 7575928610718304621L);
        setLongField(term109454, term109454.getClass(), "sumTechExpertHighScore", 4581700942967623503L);
        setLongField(term109454, term109454.getClass(), "sumTechMasterHighScore", -630528110690701745L);
        setLongField(term109454, term109454.getClass(), "sumTechLunaticHighScore", -494884932332549971L);
        setLongField(term109454, term109454.getClass(), "sumBattleHighScore", 8409270799800125161L);
        setLongField(term109454, term109454.getClass(), "sumBattleBasicHighScore", -5545139938394814214L);
        setLongField(term109454, term109454.getClass(), "sumBattleAdvancedHighScore", 8805944711185051409L);
        setLongField(term109454, term109454.getClass(), "sumBattleExpertHighScore", 6820162780633729573L);
        setLongField(term109454, term109454.getClass(), "sumBattleMasterHighScore", -4641746681583770460L);
        setLongField(term109454, term109454.getClass(), "sumBattleLunaticHighScore", 6860967281797221882L);
        setField(term109454, term109454.getClass(), "eventWatchedDate", "ohZrjboUnX");
        setField(term109454, term109454.getClass(), "cmEventWatchedDate", "rwlrpQuNrG");
        setField(term109454, term109454.getClass(), "firstGameId", "fctYGLXetS");
        setField(term109454, term109454.getClass(), "firstRomVersion", "UPbgrEUWQD");
        setField(term109454, term109454.getClass(), "firstDataVersion", "HABnTZidNp");
        setField(term109454, term109454.getClass(), "firstPlayDate", "qXysRdBrsg");
        setField(term109454, term109454.getClass(), "lastGameId", "hbtKoWkZLU");
        setField(term109454, term109454.getClass(), "lastRomVersion", "VCWjXeMQGX");
        setField(term109454, term109454.getClass(), "lastDataVersion", "KzrkBfSzqK");
        setField(term109454, term109454.getClass(), "compatibleCmVersion", "cFNqeNRwhB");
        setField(term109454, term109454.getClass(), "lastPlayDate", "TQJASDuFUN");
        setIntField(term109454, term109454.getClass(), "lastPlaceId", -1323183254);
        setField(term109454, term109454.getClass(), "lastPlaceName", "mOILNTkENv");
        setIntField(term109454, term109454.getClass(), "lastRegionId", 366309576);
        setField(term109454, term109454.getClass(), "lastRegionName", "xgjvpKAqFv");
        setIntField(term109454, term109454.getClass(), "lastAllNetId", 202085518);
        setField(term109454, term109454.getClass(), "lastClientId", "RspkCWCAFM");
        setIntField(term109454, term109454.getClass(), "lastUsedDeckId", -527355218);
        setIntField(term109454, term109454.getClass(), "lastPlayMusicLevel", 1946726839);
        setIntField(term109454, term109454.getClass(), "lastEmoneyBrand", 185844905);
        setField(term109452, term109452.getClass(), "user", term109454);
        setIntField(term109452, term109452.getClass(), "itemKind", 1821594065);
        setIntField(term109452, term109452.getClass(), "itemId", 888820496);
        setIntField(term109452, term109452.getClass(), "stock", 1745066397);
        setBooleanField(term109452, term109452.getClass(), "isValid", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term109452, args);
    }

};


