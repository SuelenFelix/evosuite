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

public class UserMemoryChapter_setId_199449217314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term395002;
     Object term395278;

    public UserMemoryChapter_setId_199449217314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term395008 = new Long(-3988042285731673145L);
        term395002 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMemoryChapter"));
        Object term395004 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term395006 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term395022 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term395023 = newInstance(Class.forName("java.time.LocalDate"));
        Object term395027 = newInstance(Class.forName("java.time.LocalTime"));
        Object term395032 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term395033 = newInstance(Class.forName("java.time.LocalDate"));
        Object term395037 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term395002, term395002.getClass(), "id", -8900621581808668801L);
        setLongField(term395004, term395004.getClass(), "id", 2130326910524874760L);
        setLongField(term395006, term395006.getClass(), "id", 2706366660445612538L);
        setField(term395006, term395006.getClass(), "extId", term395008);
        setField(term395006, term395006.getClass(), "luid", "bbFEHBLulA");
        setIntField(term395023, term395023.getClass(), "year", 2016);
        setShortField(term395023, term395023.getClass(), "month", (short) 6);
        setShortField(term395023, term395023.getClass(), "day", (short) 9);
        setField(term395022, term395022.getClass(), "date", term395023);
        setByteField(term395027, term395027.getClass(), "hour", (byte) 6);
        setByteField(term395027, term395027.getClass(), "minute", (byte) 36);
        setByteField(term395027, term395027.getClass(), "second", (byte) 6);
        setIntField(term395027, term395027.getClass(), "nano", 581614434);
        setField(term395022, term395022.getClass(), "time", term395027);
        setField(term395006, term395006.getClass(), "registerTime", term395022);
        setIntField(term395033, term395033.getClass(), "year", 2021);
        setShortField(term395033, term395033.getClass(), "month", (short) 9);
        setShortField(term395033, term395033.getClass(), "day", (short) 27);
        setField(term395032, term395032.getClass(), "date", term395033);
        setByteField(term395037, term395037.getClass(), "hour", (byte) 15);
        setByteField(term395037, term395037.getClass(), "minute", (byte) 55);
        setByteField(term395037, term395037.getClass(), "second", (byte) 14);
        setIntField(term395037, term395037.getClass(), "nano", 906528726);
        setField(term395032, term395032.getClass(), "time", term395037);
        setField(term395006, term395006.getClass(), "accessTime", term395032);
        setField(term395004, term395004.getClass(), "card", term395006);
        setField(term395004, term395004.getClass(), "userName", "YcZjnGIkri");
        setIntField(term395004, term395004.getClass(), "level", 1653366809);
        setIntField(term395004, term395004.getClass(), "reincarnationNum", 1831623334);
        setLongField(term395004, term395004.getClass(), "exp", 5325475874564615498L);
        setLongField(term395004, term395004.getClass(), "point", 7261072770276964296L);
        setLongField(term395004, term395004.getClass(), "totalPoint", 3739822250666541713L);
        setIntField(term395004, term395004.getClass(), "playCount", 1922395096);
        setIntField(term395004, term395004.getClass(), "jewelCount", -997369789);
        setIntField(term395004, term395004.getClass(), "totalJewelCount", -99672429);
        setIntField(term395004, term395004.getClass(), "medalCount", 463668948);
        setIntField(term395004, term395004.getClass(), "playerRating", -448816202);
        setIntField(term395004, term395004.getClass(), "highestRating", -79623890);
        setIntField(term395004, term395004.getClass(), "battlePoint", -176581727);
        setIntField(term395004, term395004.getClass(), "bestBattlePoint", 300333066);
        setIntField(term395004, term395004.getClass(), "overDamageBattlePoint", -1930392489);
        setBooleanField(term395004, term395004.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term395004, term395004.getClass(), "nameplateId", 622288523);
        setIntField(term395004, term395004.getClass(), "trophyId", 1375571400);
        setIntField(term395004, term395004.getClass(), "cardId", 907302122);
        setIntField(term395004, term395004.getClass(), "characterId", -2134859305);
        setIntField(term395004, term395004.getClass(), "characterVoiceNo", -565663157);
        setIntField(term395004, term395004.getClass(), "tabSetting", 2105194644);
        setIntField(term395004, term395004.getClass(), "tabSortSetting", -939505132);
        setIntField(term395004, term395004.getClass(), "cardCategorySetting", -1982710986);
        setIntField(term395004, term395004.getClass(), "cardSortSetting", 1153914416);
        setIntField(term395004, term395004.getClass(), "rivalScoreCategorySetting", 2039315679);
        setIntField(term395004, term395004.getClass(), "playedTutorialBit", 1656299300);
        setIntField(term395004, term395004.getClass(), "firstTutorialCancelNum", 44979767);
        setLongField(term395004, term395004.getClass(), "sumTechHighScore", 4960554911544249215L);
        setLongField(term395004, term395004.getClass(), "sumTechBasicHighScore", -7505526095762557687L);
        setLongField(term395004, term395004.getClass(), "sumTechAdvancedHighScore", 4233524282453909799L);
        setLongField(term395004, term395004.getClass(), "sumTechExpertHighScore", -4309242839310028739L);
        setLongField(term395004, term395004.getClass(), "sumTechMasterHighScore", -2330073308716156131L);
        setLongField(term395004, term395004.getClass(), "sumTechLunaticHighScore", 8174316337374336919L);
        setLongField(term395004, term395004.getClass(), "sumBattleHighScore", -7914894203120957126L);
        setLongField(term395004, term395004.getClass(), "sumBattleBasicHighScore", -6650466505107915737L);
        setLongField(term395004, term395004.getClass(), "sumBattleAdvancedHighScore", -6516171837681394125L);
        setLongField(term395004, term395004.getClass(), "sumBattleExpertHighScore", -6397675950829507933L);
        setLongField(term395004, term395004.getClass(), "sumBattleMasterHighScore", -8086360537435351230L);
        setLongField(term395004, term395004.getClass(), "sumBattleLunaticHighScore", 5165854032880293294L);
        setField(term395004, term395004.getClass(), "eventWatchedDate", "eEXhiblaaa");
        setField(term395004, term395004.getClass(), "cmEventWatchedDate", "IjKIxiwaDd");
        setField(term395004, term395004.getClass(), "firstGameId", "CCXrpdzWqt");
        setField(term395004, term395004.getClass(), "firstRomVersion", "lKfutMknNg");
        setField(term395004, term395004.getClass(), "firstDataVersion", "caBNAwbGGG");
        setField(term395004, term395004.getClass(), "firstPlayDate", "EWKAddqMxv");
        setField(term395004, term395004.getClass(), "lastGameId", "hYMXnSSMrQ");
        setField(term395004, term395004.getClass(), "lastRomVersion", "igKwOlHiAA");
        setField(term395004, term395004.getClass(), "lastDataVersion", "RBmCBmyblX");
        setField(term395004, term395004.getClass(), "compatibleCmVersion", "uLzAgUCyCx");
        setField(term395004, term395004.getClass(), "lastPlayDate", "MAYkTpPmlc");
        setIntField(term395004, term395004.getClass(), "lastPlaceId", 471892968);
        setField(term395004, term395004.getClass(), "lastPlaceName", "rtgtYhAcPM");
        setIntField(term395004, term395004.getClass(), "lastRegionId", -596303534);
        setField(term395004, term395004.getClass(), "lastRegionName", "iucHlQQZrh");
        setIntField(term395004, term395004.getClass(), "lastAllNetId", -1855330594);
        setField(term395004, term395004.getClass(), "lastClientId", "sWhJReYMrq");
        setIntField(term395004, term395004.getClass(), "lastUsedDeckId", 879562122);
        setIntField(term395004, term395004.getClass(), "lastPlayMusicLevel", 1514019421);
        setIntField(term395004, term395004.getClass(), "lastEmoneyBrand", 958197548);
        setField(term395002, term395002.getClass(), "user", term395004);
        setIntField(term395002, term395002.getClass(), "chapterId", 787938984);
        setIntField(term395002, term395002.getClass(), "jewelCount", -144354004);
        setIntField(term395002, term395002.getClass(), "lastPlayMusicCategory", -643050421);
        setIntField(term395002, term395002.getClass(), "lastPlayMusicId", -636723390);
        setIntField(term395002, term395002.getClass(), "lastPlayMusicLevel", -1100820168);
        setBooleanField(term395002, term395002.getClass(), "isDialogWatched", false);
        setBooleanField(term395002, term395002.getClass(), "isStoryWatched", false);
        setBooleanField(term395002, term395002.getClass(), "isBossWatched", true);
        setBooleanField(term395002, term395002.getClass(), "isClear", true);
        setIntField(term395002, term395002.getClass(), "gaugeId", 1928435982);
        setIntField(term395002, term395002.getClass(), "gaugeNum", 503718930);
        term395278 = new Long(2615686874066328070L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMemoryChapter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term395278;
        callMethod(klass, "setId", argTypes, term395002, args);
    }

};


