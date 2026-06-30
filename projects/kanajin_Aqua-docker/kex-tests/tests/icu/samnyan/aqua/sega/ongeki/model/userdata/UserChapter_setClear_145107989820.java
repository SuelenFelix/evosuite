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
import java.lang.Boolean;

public class UserChapter_setClear_145107989820 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term92306;
     Object term92580;

    public UserChapter_setClear_145107989820() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term92312 = new Long(-2338103433822116635L);
        term92306 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserChapter"));
        Object term92308 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term92310 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term92326 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term92327 = newInstance(Class.forName("java.time.LocalDate"));
        Object term92331 = newInstance(Class.forName("java.time.LocalTime"));
        Object term92336 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term92337 = newInstance(Class.forName("java.time.LocalDate"));
        Object term92341 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term92306, term92306.getClass(), "id", 2744046861965577334L);
        setLongField(term92308, term92308.getClass(), "id", 5536006113004390813L);
        setLongField(term92310, term92310.getClass(), "id", 7613276437096698267L);
        setField(term92310, term92310.getClass(), "extId", term92312);
        setField(term92310, term92310.getClass(), "luid", "LCjhPHXcwj");
        setIntField(term92327, term92327.getClass(), "year", 2010);
        setShortField(term92327, term92327.getClass(), "month", (short) 2);
        setShortField(term92327, term92327.getClass(), "day", (short) 22);
        setField(term92326, term92326.getClass(), "date", term92327);
        setByteField(term92331, term92331.getClass(), "hour", (byte) 10);
        setByteField(term92331, term92331.getClass(), "minute", (byte) 57);
        setByteField(term92331, term92331.getClass(), "second", (byte) 47);
        setIntField(term92331, term92331.getClass(), "nano", 236871229);
        setField(term92326, term92326.getClass(), "time", term92331);
        setField(term92310, term92310.getClass(), "registerTime", term92326);
        setIntField(term92337, term92337.getClass(), "year", 2028);
        setShortField(term92337, term92337.getClass(), "month", (short) 10);
        setShortField(term92337, term92337.getClass(), "day", (short) 4);
        setField(term92336, term92336.getClass(), "date", term92337);
        setByteField(term92341, term92341.getClass(), "hour", (byte) 7);
        setByteField(term92341, term92341.getClass(), "minute", (byte) 45);
        setByteField(term92341, term92341.getClass(), "second", (byte) 52);
        setIntField(term92341, term92341.getClass(), "nano", 886309979);
        setField(term92336, term92336.getClass(), "time", term92341);
        setField(term92310, term92310.getClass(), "accessTime", term92336);
        setField(term92308, term92308.getClass(), "card", term92310);
        setField(term92308, term92308.getClass(), "userName", "inoNzxBFDa");
        setIntField(term92308, term92308.getClass(), "level", -200717429);
        setIntField(term92308, term92308.getClass(), "reincarnationNum", 1017751788);
        setLongField(term92308, term92308.getClass(), "exp", -15012344473260735L);
        setLongField(term92308, term92308.getClass(), "point", -7302717476024398618L);
        setLongField(term92308, term92308.getClass(), "totalPoint", 6708116358743842821L);
        setIntField(term92308, term92308.getClass(), "playCount", 452190809);
        setIntField(term92308, term92308.getClass(), "jewelCount", -868819495);
        setIntField(term92308, term92308.getClass(), "totalJewelCount", -1011591867);
        setIntField(term92308, term92308.getClass(), "medalCount", 709949296);
        setIntField(term92308, term92308.getClass(), "playerRating", 1078431447);
        setIntField(term92308, term92308.getClass(), "highestRating", -894257039);
        setIntField(term92308, term92308.getClass(), "battlePoint", 1586412497);
        setIntField(term92308, term92308.getClass(), "bestBattlePoint", 719020316);
        setIntField(term92308, term92308.getClass(), "overDamageBattlePoint", 1522532191);
        setBooleanField(term92308, term92308.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term92308, term92308.getClass(), "nameplateId", 137516958);
        setIntField(term92308, term92308.getClass(), "trophyId", -1233770688);
        setIntField(term92308, term92308.getClass(), "cardId", 722935077);
        setIntField(term92308, term92308.getClass(), "characterId", -304660297);
        setIntField(term92308, term92308.getClass(), "characterVoiceNo", 1530655970);
        setIntField(term92308, term92308.getClass(), "tabSetting", -154857398);
        setIntField(term92308, term92308.getClass(), "tabSortSetting", 385239631);
        setIntField(term92308, term92308.getClass(), "cardCategorySetting", 836211088);
        setIntField(term92308, term92308.getClass(), "cardSortSetting", -365730201);
        setIntField(term92308, term92308.getClass(), "rivalScoreCategorySetting", -1218078298);
        setIntField(term92308, term92308.getClass(), "playedTutorialBit", -1186533450);
        setIntField(term92308, term92308.getClass(), "firstTutorialCancelNum", 1385418235);
        setLongField(term92308, term92308.getClass(), "sumTechHighScore", 8164291404572285008L);
        setLongField(term92308, term92308.getClass(), "sumTechBasicHighScore", -2427315021561332890L);
        setLongField(term92308, term92308.getClass(), "sumTechAdvancedHighScore", -6816141902035124591L);
        setLongField(term92308, term92308.getClass(), "sumTechExpertHighScore", -83252622637557191L);
        setLongField(term92308, term92308.getClass(), "sumTechMasterHighScore", 2703347811680968422L);
        setLongField(term92308, term92308.getClass(), "sumTechLunaticHighScore", -3614998234615616494L);
        setLongField(term92308, term92308.getClass(), "sumBattleHighScore", 448310655487166741L);
        setLongField(term92308, term92308.getClass(), "sumBattleBasicHighScore", 6665682102336248554L);
        setLongField(term92308, term92308.getClass(), "sumBattleAdvancedHighScore", -7801053273167145554L);
        setLongField(term92308, term92308.getClass(), "sumBattleExpertHighScore", -3527774235000527109L);
        setLongField(term92308, term92308.getClass(), "sumBattleMasterHighScore", 7471635522817277586L);
        setLongField(term92308, term92308.getClass(), "sumBattleLunaticHighScore", -275396578570511122L);
        setField(term92308, term92308.getClass(), "eventWatchedDate", "dFDHlXwhMk");
        setField(term92308, term92308.getClass(), "cmEventWatchedDate", "AUMXeSohOi");
        setField(term92308, term92308.getClass(), "firstGameId", "HjZSMjBIEl");
        setField(term92308, term92308.getClass(), "firstRomVersion", "SQQNAxPlwz");
        setField(term92308, term92308.getClass(), "firstDataVersion", "AoOgJDNbaF");
        setField(term92308, term92308.getClass(), "firstPlayDate", "PoxurfXwit");
        setField(term92308, term92308.getClass(), "lastGameId", "fhKxidKBbV");
        setField(term92308, term92308.getClass(), "lastRomVersion", "SIJmlwIkel");
        setField(term92308, term92308.getClass(), "lastDataVersion", "lqucbHOiHE");
        setField(term92308, term92308.getClass(), "compatibleCmVersion", "AtnEadrVWF");
        setField(term92308, term92308.getClass(), "lastPlayDate", "YghxvBBBOW");
        setIntField(term92308, term92308.getClass(), "lastPlaceId", 928651112);
        setField(term92308, term92308.getClass(), "lastPlaceName", "LHuytJdqwq");
        setIntField(term92308, term92308.getClass(), "lastRegionId", -970446181);
        setField(term92308, term92308.getClass(), "lastRegionName", "SqSvcPPMTC");
        setIntField(term92308, term92308.getClass(), "lastAllNetId", 484689354);
        setField(term92308, term92308.getClass(), "lastClientId", "SsLBbqIZdp");
        setIntField(term92308, term92308.getClass(), "lastUsedDeckId", 1836490268);
        setIntField(term92308, term92308.getClass(), "lastPlayMusicLevel", 388735696);
        setIntField(term92308, term92308.getClass(), "lastEmoneyBrand", 105946838);
        setField(term92306, term92306.getClass(), "user", term92308);
        setIntField(term92306, term92306.getClass(), "chapterId", -2076570725);
        setIntField(term92306, term92306.getClass(), "jewelCount", -976659428);
        setIntField(term92306, term92306.getClass(), "lastPlayMusicCategory", 974582816);
        setIntField(term92306, term92306.getClass(), "lastPlayMusicId", 1915101054);
        setIntField(term92306, term92306.getClass(), "lastPlayMusicLevel", -956240810);
        setBooleanField(term92306, term92306.getClass(), "isStoryWatched", false);
        setBooleanField(term92306, term92306.getClass(), "isClear", true);
        setIntField(term92306, term92306.getClass(), "skipTiming1", 2125391204);
        setIntField(term92306, term92306.getClass(), "skipTiming2", -1473375595);
        term92580 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserChapter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term92580;
        callMethod(klass, "setClear", argTypes, term92306, args);
    }

};


