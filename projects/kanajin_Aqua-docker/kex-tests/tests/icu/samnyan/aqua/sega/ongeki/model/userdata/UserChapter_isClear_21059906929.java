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

public class UserChapter_isClear_21059906929 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87095;

    public UserChapter_isClear_21059906929() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term87101 = new Long(-8327432141027603933L);
        term87095 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserChapter"));
        Object term87097 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term87099 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term87115 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term87116 = newInstance(Class.forName("java.time.LocalDate"));
        Object term87120 = newInstance(Class.forName("java.time.LocalTime"));
        Object term87125 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term87126 = newInstance(Class.forName("java.time.LocalDate"));
        Object term87130 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term87095, term87095.getClass(), "id", -6330284814052668407L);
        setLongField(term87097, term87097.getClass(), "id", 151946226512995551L);
        setLongField(term87099, term87099.getClass(), "id", 1982970791443207752L);
        setField(term87099, term87099.getClass(), "extId", term87101);
        setField(term87099, term87099.getClass(), "luid", "kugZgYRWcG");
        setIntField(term87116, term87116.getClass(), "year", 2029);
        setShortField(term87116, term87116.getClass(), "month", (short) 2);
        setShortField(term87116, term87116.getClass(), "day", (short) 4);
        setField(term87115, term87115.getClass(), "date", term87116);
        setByteField(term87120, term87120.getClass(), "hour", (byte) 18);
        setByteField(term87120, term87120.getClass(), "minute", (byte) 31);
        setByteField(term87120, term87120.getClass(), "second", (byte) 27);
        setIntField(term87120, term87120.getClass(), "nano", 737016275);
        setField(term87115, term87115.getClass(), "time", term87120);
        setField(term87099, term87099.getClass(), "registerTime", term87115);
        setIntField(term87126, term87126.getClass(), "year", 2022);
        setShortField(term87126, term87126.getClass(), "month", (short) 3);
        setShortField(term87126, term87126.getClass(), "day", (short) 27);
        setField(term87125, term87125.getClass(), "date", term87126);
        setByteField(term87130, term87130.getClass(), "hour", (byte) 18);
        setByteField(term87130, term87130.getClass(), "minute", (byte) 52);
        setByteField(term87130, term87130.getClass(), "second", (byte) 30);
        setIntField(term87130, term87130.getClass(), "nano", 610437590);
        setField(term87125, term87125.getClass(), "time", term87130);
        setField(term87099, term87099.getClass(), "accessTime", term87125);
        setField(term87097, term87097.getClass(), "card", term87099);
        setField(term87097, term87097.getClass(), "userName", "OzucqAMebQ");
        setIntField(term87097, term87097.getClass(), "level", 2089342829);
        setIntField(term87097, term87097.getClass(), "reincarnationNum", 1201220971);
        setLongField(term87097, term87097.getClass(), "exp", 3439989480249101943L);
        setLongField(term87097, term87097.getClass(), "point", -7959316538142185407L);
        setLongField(term87097, term87097.getClass(), "totalPoint", 7180761268865120390L);
        setIntField(term87097, term87097.getClass(), "playCount", -811460564);
        setIntField(term87097, term87097.getClass(), "jewelCount", 1527746173);
        setIntField(term87097, term87097.getClass(), "totalJewelCount", -1236801752);
        setIntField(term87097, term87097.getClass(), "medalCount", -1407542097);
        setIntField(term87097, term87097.getClass(), "playerRating", 844756084);
        setIntField(term87097, term87097.getClass(), "highestRating", -1078424855);
        setIntField(term87097, term87097.getClass(), "battlePoint", -17867996);
        setIntField(term87097, term87097.getClass(), "bestBattlePoint", -586625757);
        setIntField(term87097, term87097.getClass(), "overDamageBattlePoint", -111956576);
        setBooleanField(term87097, term87097.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term87097, term87097.getClass(), "nameplateId", 746489478);
        setIntField(term87097, term87097.getClass(), "trophyId", 620249855);
        setIntField(term87097, term87097.getClass(), "cardId", -1978063697);
        setIntField(term87097, term87097.getClass(), "characterId", -1375837847);
        setIntField(term87097, term87097.getClass(), "characterVoiceNo", 591972229);
        setIntField(term87097, term87097.getClass(), "tabSetting", 1509332180);
        setIntField(term87097, term87097.getClass(), "tabSortSetting", 1537664818);
        setIntField(term87097, term87097.getClass(), "cardCategorySetting", -1542814057);
        setIntField(term87097, term87097.getClass(), "cardSortSetting", -813013442);
        setIntField(term87097, term87097.getClass(), "rivalScoreCategorySetting", 129913260);
        setIntField(term87097, term87097.getClass(), "playedTutorialBit", 1161032682);
        setIntField(term87097, term87097.getClass(), "firstTutorialCancelNum", 345139347);
        setLongField(term87097, term87097.getClass(), "sumTechHighScore", 610952698138243145L);
        setLongField(term87097, term87097.getClass(), "sumTechBasicHighScore", -8975810343836354386L);
        setLongField(term87097, term87097.getClass(), "sumTechAdvancedHighScore", -4837495843996953019L);
        setLongField(term87097, term87097.getClass(), "sumTechExpertHighScore", -4035391635091594438L);
        setLongField(term87097, term87097.getClass(), "sumTechMasterHighScore", 4081339751421418606L);
        setLongField(term87097, term87097.getClass(), "sumTechLunaticHighScore", -5669989120629087357L);
        setLongField(term87097, term87097.getClass(), "sumBattleHighScore", -8530393515143116712L);
        setLongField(term87097, term87097.getClass(), "sumBattleBasicHighScore", 4695281402868299412L);
        setLongField(term87097, term87097.getClass(), "sumBattleAdvancedHighScore", -2959985673430542289L);
        setLongField(term87097, term87097.getClass(), "sumBattleExpertHighScore", -8908499017977435119L);
        setLongField(term87097, term87097.getClass(), "sumBattleMasterHighScore", -953055683184375740L);
        setLongField(term87097, term87097.getClass(), "sumBattleLunaticHighScore", -5426612898117103276L);
        setField(term87097, term87097.getClass(), "eventWatchedDate", "VecourIOHN");
        setField(term87097, term87097.getClass(), "cmEventWatchedDate", "tZiwBSETUL");
        setField(term87097, term87097.getClass(), "firstGameId", "fmecFLYSIi");
        setField(term87097, term87097.getClass(), "firstRomVersion", "bjjsWtQeyp");
        setField(term87097, term87097.getClass(), "firstDataVersion", "CoPgTYdcst");
        setField(term87097, term87097.getClass(), "firstPlayDate", "UYWsaWaOUS");
        setField(term87097, term87097.getClass(), "lastGameId", "oOxKzvqxUJ");
        setField(term87097, term87097.getClass(), "lastRomVersion", "tjqgiPrtgj");
        setField(term87097, term87097.getClass(), "lastDataVersion", "atajdBiCpk");
        setField(term87097, term87097.getClass(), "compatibleCmVersion", "iZkNHOfNWw");
        setField(term87097, term87097.getClass(), "lastPlayDate", "SxvlCppquX");
        setIntField(term87097, term87097.getClass(), "lastPlaceId", 972415791);
        setField(term87097, term87097.getClass(), "lastPlaceName", "KXtTCHHVWr");
        setIntField(term87097, term87097.getClass(), "lastRegionId", -263062220);
        setField(term87097, term87097.getClass(), "lastRegionName", "ylbTmYKeKr");
        setIntField(term87097, term87097.getClass(), "lastAllNetId", -814910184);
        setField(term87097, term87097.getClass(), "lastClientId", "iyKZenGXgC");
        setIntField(term87097, term87097.getClass(), "lastUsedDeckId", -82425798);
        setIntField(term87097, term87097.getClass(), "lastPlayMusicLevel", 12949829);
        setIntField(term87097, term87097.getClass(), "lastEmoneyBrand", 169106608);
        setField(term87095, term87095.getClass(), "user", term87097);
        setIntField(term87095, term87095.getClass(), "chapterId", 735667683);
        setIntField(term87095, term87095.getClass(), "jewelCount", -2099694093);
        setIntField(term87095, term87095.getClass(), "lastPlayMusicCategory", -1230860198);
        setIntField(term87095, term87095.getClass(), "lastPlayMusicId", -756895441);
        setIntField(term87095, term87095.getClass(), "lastPlayMusicLevel", -415493508);
        setBooleanField(term87095, term87095.getClass(), "isStoryWatched", true);
        setBooleanField(term87095, term87095.getClass(), "isClear", true);
        setIntField(term87095, term87095.getClass(), "skipTiming1", -2039940861);
        setIntField(term87095, term87095.getClass(), "skipTiming2", 1657238527);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserChapter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isClear", argTypes, term87095, args);
    }

};


