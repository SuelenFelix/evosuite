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

public class UserMemoryChapter_setStoryWatched_103226440522 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term398927;
     Object term399203;

    public UserMemoryChapter_setStoryWatched_103226440522() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term398933 = new Long(3233502115953753827L);
        term398927 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMemoryChapter"));
        Object term398929 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term398931 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term398947 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term398948 = newInstance(Class.forName("java.time.LocalDate"));
        Object term398952 = newInstance(Class.forName("java.time.LocalTime"));
        Object term398957 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term398958 = newInstance(Class.forName("java.time.LocalDate"));
        Object term398962 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term398927, term398927.getClass(), "id", -7809136736018829608L);
        setLongField(term398929, term398929.getClass(), "id", 4276672231842319653L);
        setLongField(term398931, term398931.getClass(), "id", 8036845243966637640L);
        setField(term398931, term398931.getClass(), "extId", term398933);
        setField(term398931, term398931.getClass(), "luid", "KTbLokBqhn");
        setIntField(term398948, term398948.getClass(), "year", 2028);
        setShortField(term398948, term398948.getClass(), "month", (short) 9);
        setShortField(term398948, term398948.getClass(), "day", (short) 25);
        setField(term398947, term398947.getClass(), "date", term398948);
        setByteField(term398952, term398952.getClass(), "hour", (byte) 14);
        setByteField(term398952, term398952.getClass(), "minute", (byte) 21);
        setByteField(term398952, term398952.getClass(), "second", (byte) 57);
        setIntField(term398952, term398952.getClass(), "nano", 769245395);
        setField(term398947, term398947.getClass(), "time", term398952);
        setField(term398931, term398931.getClass(), "registerTime", term398947);
        setIntField(term398958, term398958.getClass(), "year", 2015);
        setShortField(term398958, term398958.getClass(), "month", (short) 5);
        setShortField(term398958, term398958.getClass(), "day", (short) 20);
        setField(term398957, term398957.getClass(), "date", term398958);
        setByteField(term398962, term398962.getClass(), "hour", (byte) 15);
        setByteField(term398962, term398962.getClass(), "minute", (byte) 23);
        setByteField(term398962, term398962.getClass(), "second", (byte) 59);
        setIntField(term398962, term398962.getClass(), "nano", 160941979);
        setField(term398957, term398957.getClass(), "time", term398962);
        setField(term398931, term398931.getClass(), "accessTime", term398957);
        setField(term398929, term398929.getClass(), "card", term398931);
        setField(term398929, term398929.getClass(), "userName", "XXzcnTspmb");
        setIntField(term398929, term398929.getClass(), "level", -1196738760);
        setIntField(term398929, term398929.getClass(), "reincarnationNum", -1021593227);
        setLongField(term398929, term398929.getClass(), "exp", -4584073394624976877L);
        setLongField(term398929, term398929.getClass(), "point", 2804974107412429674L);
        setLongField(term398929, term398929.getClass(), "totalPoint", -5429028487043252674L);
        setIntField(term398929, term398929.getClass(), "playCount", -1691402525);
        setIntField(term398929, term398929.getClass(), "jewelCount", -486052043);
        setIntField(term398929, term398929.getClass(), "totalJewelCount", 164278589);
        setIntField(term398929, term398929.getClass(), "medalCount", -1523319758);
        setIntField(term398929, term398929.getClass(), "playerRating", -1937626636);
        setIntField(term398929, term398929.getClass(), "highestRating", -322001993);
        setIntField(term398929, term398929.getClass(), "battlePoint", -27021717);
        setIntField(term398929, term398929.getClass(), "bestBattlePoint", -557211650);
        setIntField(term398929, term398929.getClass(), "overDamageBattlePoint", -1097840090);
        setBooleanField(term398929, term398929.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term398929, term398929.getClass(), "nameplateId", 1890400888);
        setIntField(term398929, term398929.getClass(), "trophyId", 1694845938);
        setIntField(term398929, term398929.getClass(), "cardId", -900088756);
        setIntField(term398929, term398929.getClass(), "characterId", -106562504);
        setIntField(term398929, term398929.getClass(), "characterVoiceNo", 1239665471);
        setIntField(term398929, term398929.getClass(), "tabSetting", 1607638819);
        setIntField(term398929, term398929.getClass(), "tabSortSetting", -60566364);
        setIntField(term398929, term398929.getClass(), "cardCategorySetting", 927578489);
        setIntField(term398929, term398929.getClass(), "cardSortSetting", -1344137463);
        setIntField(term398929, term398929.getClass(), "rivalScoreCategorySetting", -663098023);
        setIntField(term398929, term398929.getClass(), "playedTutorialBit", -32277321);
        setIntField(term398929, term398929.getClass(), "firstTutorialCancelNum", 542174277);
        setLongField(term398929, term398929.getClass(), "sumTechHighScore", -8734878147587574374L);
        setLongField(term398929, term398929.getClass(), "sumTechBasicHighScore", 6886333193902557349L);
        setLongField(term398929, term398929.getClass(), "sumTechAdvancedHighScore", 5886312546789802954L);
        setLongField(term398929, term398929.getClass(), "sumTechExpertHighScore", 220207956758911845L);
        setLongField(term398929, term398929.getClass(), "sumTechMasterHighScore", -594995129493039195L);
        setLongField(term398929, term398929.getClass(), "sumTechLunaticHighScore", -1527013582515384446L);
        setLongField(term398929, term398929.getClass(), "sumBattleHighScore", 3500242375717703414L);
        setLongField(term398929, term398929.getClass(), "sumBattleBasicHighScore", -1021404098416409370L);
        setLongField(term398929, term398929.getClass(), "sumBattleAdvancedHighScore", 7719008326819245899L);
        setLongField(term398929, term398929.getClass(), "sumBattleExpertHighScore", -3431503640917606232L);
        setLongField(term398929, term398929.getClass(), "sumBattleMasterHighScore", 3694672349594925013L);
        setLongField(term398929, term398929.getClass(), "sumBattleLunaticHighScore", 288749861746273170L);
        setField(term398929, term398929.getClass(), "eventWatchedDate", "TINEyLOuZi");
        setField(term398929, term398929.getClass(), "cmEventWatchedDate", "xPPAfMTjqV");
        setField(term398929, term398929.getClass(), "firstGameId", "knbmShxeRN");
        setField(term398929, term398929.getClass(), "firstRomVersion", "noEzqSZmJa");
        setField(term398929, term398929.getClass(), "firstDataVersion", "QjWBVMiaya");
        setField(term398929, term398929.getClass(), "firstPlayDate", "QYeaKodgBd");
        setField(term398929, term398929.getClass(), "lastGameId", "GOQSwneqEb");
        setField(term398929, term398929.getClass(), "lastRomVersion", "JbqYSRevLD");
        setField(term398929, term398929.getClass(), "lastDataVersion", "HNSZguBZTH");
        setField(term398929, term398929.getClass(), "compatibleCmVersion", "PHooqPydcC");
        setField(term398929, term398929.getClass(), "lastPlayDate", "ZuPNUurPRd");
        setIntField(term398929, term398929.getClass(), "lastPlaceId", -37479360);
        setField(term398929, term398929.getClass(), "lastPlaceName", "CTUXadVRLh");
        setIntField(term398929, term398929.getClass(), "lastRegionId", -2004025834);
        setField(term398929, term398929.getClass(), "lastRegionName", "KuPlFHMdCA");
        setIntField(term398929, term398929.getClass(), "lastAllNetId", 634890675);
        setField(term398929, term398929.getClass(), "lastClientId", "aOiLWtdwnn");
        setIntField(term398929, term398929.getClass(), "lastUsedDeckId", 164563151);
        setIntField(term398929, term398929.getClass(), "lastPlayMusicLevel", 17807916);
        setIntField(term398929, term398929.getClass(), "lastEmoneyBrand", 671738732);
        setField(term398927, term398927.getClass(), "user", term398929);
        setIntField(term398927, term398927.getClass(), "chapterId", 655181016);
        setIntField(term398927, term398927.getClass(), "jewelCount", -657002977);
        setIntField(term398927, term398927.getClass(), "lastPlayMusicCategory", -1746626647);
        setIntField(term398927, term398927.getClass(), "lastPlayMusicId", -1762257763);
        setIntField(term398927, term398927.getClass(), "lastPlayMusicLevel", -433597621);
        setBooleanField(term398927, term398927.getClass(), "isDialogWatched", false);
        setBooleanField(term398927, term398927.getClass(), "isStoryWatched", false);
        setBooleanField(term398927, term398927.getClass(), "isBossWatched", false);
        setBooleanField(term398927, term398927.getClass(), "isClear", false);
        setIntField(term398927, term398927.getClass(), "gaugeId", 1845678942);
        setIntField(term398927, term398927.getClass(), "gaugeNum", 1270300954);
        term399203 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMemoryChapter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term399203;
        callMethod(klass, "setStoryWatched", argTypes, term398927, args);
    }

};


