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

public class UserMemoryChapter_init_20853551210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term388911;

    public UserMemoryChapter_init_20853551210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term388915 = new Long(7921404547326630089L);
        term388911 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term388913 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term388929 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term388930 = newInstance(Class.forName("java.time.LocalDate"));
        Object term388934 = newInstance(Class.forName("java.time.LocalTime"));
        Object term388939 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term388940 = newInstance(Class.forName("java.time.LocalDate"));
        Object term388944 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term388911, term388911.getClass(), "id", -3087597196222720006L);
        setLongField(term388913, term388913.getClass(), "id", -8406661475578252457L);
        setField(term388913, term388913.getClass(), "extId", term388915);
        setField(term388913, term388913.getClass(), "luid", "hfTozlPdET");
        setIntField(term388930, term388930.getClass(), "year", 2026);
        setShortField(term388930, term388930.getClass(), "month", (short) 8);
        setShortField(term388930, term388930.getClass(), "day", (short) 28);
        setField(term388929, term388929.getClass(), "date", term388930);
        setByteField(term388934, term388934.getClass(), "hour", (byte) 11);
        setByteField(term388934, term388934.getClass(), "minute", (byte) 49);
        setByteField(term388934, term388934.getClass(), "second", (byte) 46);
        setIntField(term388934, term388934.getClass(), "nano", 100197670);
        setField(term388929, term388929.getClass(), "time", term388934);
        setField(term388913, term388913.getClass(), "registerTime", term388929);
        setIntField(term388940, term388940.getClass(), "year", 2011);
        setShortField(term388940, term388940.getClass(), "month", (short) 7);
        setShortField(term388940, term388940.getClass(), "day", (short) 24);
        setField(term388939, term388939.getClass(), "date", term388940);
        setByteField(term388944, term388944.getClass(), "hour", (byte) 16);
        setByteField(term388944, term388944.getClass(), "minute", (byte) 0);
        setByteField(term388944, term388944.getClass(), "second", (byte) 47);
        setIntField(term388944, term388944.getClass(), "nano", 892722998);
        setField(term388939, term388939.getClass(), "time", term388944);
        setField(term388913, term388913.getClass(), "accessTime", term388939);
        setField(term388911, term388911.getClass(), "card", term388913);
        setField(term388911, term388911.getClass(), "userName", "wFaDnvIaNu");
        setIntField(term388911, term388911.getClass(), "level", 2080642075);
        setIntField(term388911, term388911.getClass(), "reincarnationNum", 1517524669);
        setLongField(term388911, term388911.getClass(), "exp", 6316232653678195901L);
        setLongField(term388911, term388911.getClass(), "point", -3737668217606222220L);
        setLongField(term388911, term388911.getClass(), "totalPoint", 4050980449229785098L);
        setIntField(term388911, term388911.getClass(), "playCount", 1739525973);
        setIntField(term388911, term388911.getClass(), "jewelCount", -1153158325);
        setIntField(term388911, term388911.getClass(), "totalJewelCount", 1076038489);
        setIntField(term388911, term388911.getClass(), "medalCount", 808474089);
        setIntField(term388911, term388911.getClass(), "playerRating", 280772453);
        setIntField(term388911, term388911.getClass(), "highestRating", 1350106440);
        setIntField(term388911, term388911.getClass(), "battlePoint", -219708017);
        setIntField(term388911, term388911.getClass(), "bestBattlePoint", 1648465515);
        setIntField(term388911, term388911.getClass(), "overDamageBattlePoint", -95398220);
        setBooleanField(term388911, term388911.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term388911, term388911.getClass(), "nameplateId", 360008565);
        setIntField(term388911, term388911.getClass(), "trophyId", -1730111992);
        setIntField(term388911, term388911.getClass(), "cardId", 1313130081);
        setIntField(term388911, term388911.getClass(), "characterId", -1731549687);
        setIntField(term388911, term388911.getClass(), "characterVoiceNo", 1326576048);
        setIntField(term388911, term388911.getClass(), "tabSetting", -1853257248);
        setIntField(term388911, term388911.getClass(), "tabSortSetting", 1187312002);
        setIntField(term388911, term388911.getClass(), "cardCategorySetting", -1255644806);
        setIntField(term388911, term388911.getClass(), "cardSortSetting", 635263431);
        setIntField(term388911, term388911.getClass(), "rivalScoreCategorySetting", -466015272);
        setIntField(term388911, term388911.getClass(), "playedTutorialBit", -1417995681);
        setIntField(term388911, term388911.getClass(), "firstTutorialCancelNum", -749880729);
        setLongField(term388911, term388911.getClass(), "sumTechHighScore", 6311629037568312158L);
        setLongField(term388911, term388911.getClass(), "sumTechBasicHighScore", -3019926032490838996L);
        setLongField(term388911, term388911.getClass(), "sumTechAdvancedHighScore", -6509344045141222452L);
        setLongField(term388911, term388911.getClass(), "sumTechExpertHighScore", -4552980968183458032L);
        setLongField(term388911, term388911.getClass(), "sumTechMasterHighScore", 8685024808717697622L);
        setLongField(term388911, term388911.getClass(), "sumTechLunaticHighScore", -613996853299455921L);
        setLongField(term388911, term388911.getClass(), "sumBattleHighScore", -6165696210716997101L);
        setLongField(term388911, term388911.getClass(), "sumBattleBasicHighScore", 2429768576345002859L);
        setLongField(term388911, term388911.getClass(), "sumBattleAdvancedHighScore", 290301657459707010L);
        setLongField(term388911, term388911.getClass(), "sumBattleExpertHighScore", -1115910393720016296L);
        setLongField(term388911, term388911.getClass(), "sumBattleMasterHighScore", -5904943813369216595L);
        setLongField(term388911, term388911.getClass(), "sumBattleLunaticHighScore", 541081362579475518L);
        setField(term388911, term388911.getClass(), "eventWatchedDate", "AicbLTvBKc");
        setField(term388911, term388911.getClass(), "cmEventWatchedDate", "jseHOuiPHN");
        setField(term388911, term388911.getClass(), "firstGameId", "YLUHmjGHTD");
        setField(term388911, term388911.getClass(), "firstRomVersion", "YXUoXbgsYO");
        setField(term388911, term388911.getClass(), "firstDataVersion", "QGWegacymw");
        setField(term388911, term388911.getClass(), "firstPlayDate", "JXnjELHtjG");
        setField(term388911, term388911.getClass(), "lastGameId", "fCWwpBINDj");
        setField(term388911, term388911.getClass(), "lastRomVersion", "LvaPOVZFgN");
        setField(term388911, term388911.getClass(), "lastDataVersion", "DMrsWGHner");
        setField(term388911, term388911.getClass(), "compatibleCmVersion", "eWqFxtCWxr");
        setField(term388911, term388911.getClass(), "lastPlayDate", "udLOPXtika");
        setIntField(term388911, term388911.getClass(), "lastPlaceId", 1702676577);
        setField(term388911, term388911.getClass(), "lastPlaceName", "XKxYjMvmNq");
        setIntField(term388911, term388911.getClass(), "lastRegionId", 1520497001);
        setField(term388911, term388911.getClass(), "lastRegionName", "rtmdOSFztV");
        setIntField(term388911, term388911.getClass(), "lastAllNetId", 1516528619);
        setField(term388911, term388911.getClass(), "lastClientId", "AuTgVbQJct");
        setIntField(term388911, term388911.getClass(), "lastUsedDeckId", -9296726);
        setIntField(term388911, term388911.getClass(), "lastPlayMusicLevel", 501386271);
        setIntField(term388911, term388911.getClass(), "lastEmoneyBrand", -2140576485);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMemoryChapter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Object[] args = new Object[1];
        args[0] = term388911;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


