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

public class UserEventPoint_setId_14723346776 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term384109;
     Object term384377;

    public UserEventPoint_setId_14723346776() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term384115 = new Long(-4868523627266698649L);
        term384109 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserEventPoint"));
        Object term384111 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term384113 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term384129 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term384130 = newInstance(Class.forName("java.time.LocalDate"));
        Object term384134 = newInstance(Class.forName("java.time.LocalTime"));
        Object term384139 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term384140 = newInstance(Class.forName("java.time.LocalDate"));
        Object term384144 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term384109, term384109.getClass(), "id", -5243103828800318017L);
        setLongField(term384111, term384111.getClass(), "id", 5693556325862346871L);
        setLongField(term384113, term384113.getClass(), "id", 3362210549632663518L);
        setField(term384113, term384113.getClass(), "extId", term384115);
        setField(term384113, term384113.getClass(), "luid", "gZSVTnlWtb");
        setIntField(term384130, term384130.getClass(), "year", 2023);
        setShortField(term384130, term384130.getClass(), "month", (short) 3);
        setShortField(term384130, term384130.getClass(), "day", (short) 7);
        setField(term384129, term384129.getClass(), "date", term384130);
        setByteField(term384134, term384134.getClass(), "hour", (byte) 7);
        setByteField(term384134, term384134.getClass(), "minute", (byte) 6);
        setByteField(term384134, term384134.getClass(), "second", (byte) 41);
        setIntField(term384134, term384134.getClass(), "nano", 888823271);
        setField(term384129, term384129.getClass(), "time", term384134);
        setField(term384113, term384113.getClass(), "registerTime", term384129);
        setIntField(term384140, term384140.getClass(), "year", 2020);
        setShortField(term384140, term384140.getClass(), "month", (short) 5);
        setShortField(term384140, term384140.getClass(), "day", (short) 12);
        setField(term384139, term384139.getClass(), "date", term384140);
        setByteField(term384144, term384144.getClass(), "hour", (byte) 6);
        setByteField(term384144, term384144.getClass(), "minute", (byte) 28);
        setByteField(term384144, term384144.getClass(), "second", (byte) 29);
        setIntField(term384144, term384144.getClass(), "nano", 672930064);
        setField(term384139, term384139.getClass(), "time", term384144);
        setField(term384113, term384113.getClass(), "accessTime", term384139);
        setField(term384111, term384111.getClass(), "card", term384113);
        setField(term384111, term384111.getClass(), "userName", "HbanoeFIwz");
        setIntField(term384111, term384111.getClass(), "level", 1086999941);
        setIntField(term384111, term384111.getClass(), "reincarnationNum", -1395560689);
        setLongField(term384111, term384111.getClass(), "exp", 8202779668766163259L);
        setLongField(term384111, term384111.getClass(), "point", -2455639218427487005L);
        setLongField(term384111, term384111.getClass(), "totalPoint", 3242904605678825353L);
        setIntField(term384111, term384111.getClass(), "playCount", 760470872);
        setIntField(term384111, term384111.getClass(), "jewelCount", 387220403);
        setIntField(term384111, term384111.getClass(), "totalJewelCount", -1069314463);
        setIntField(term384111, term384111.getClass(), "medalCount", -1322205143);
        setIntField(term384111, term384111.getClass(), "playerRating", -1676339448);
        setIntField(term384111, term384111.getClass(), "highestRating", 280447480);
        setIntField(term384111, term384111.getClass(), "battlePoint", 808355334);
        setIntField(term384111, term384111.getClass(), "bestBattlePoint", 1606695207);
        setIntField(term384111, term384111.getClass(), "overDamageBattlePoint", 817550496);
        setBooleanField(term384111, term384111.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term384111, term384111.getClass(), "nameplateId", -1160270508);
        setIntField(term384111, term384111.getClass(), "trophyId", 1223826258);
        setIntField(term384111, term384111.getClass(), "cardId", 690891924);
        setIntField(term384111, term384111.getClass(), "characterId", 1016199806);
        setIntField(term384111, term384111.getClass(), "characterVoiceNo", -1903135985);
        setIntField(term384111, term384111.getClass(), "tabSetting", -385665061);
        setIntField(term384111, term384111.getClass(), "tabSortSetting", -219694976);
        setIntField(term384111, term384111.getClass(), "cardCategorySetting", 377074350);
        setIntField(term384111, term384111.getClass(), "cardSortSetting", 207689981);
        setIntField(term384111, term384111.getClass(), "rivalScoreCategorySetting", 252048418);
        setIntField(term384111, term384111.getClass(), "playedTutorialBit", 1023889576);
        setIntField(term384111, term384111.getClass(), "firstTutorialCancelNum", 565745204);
        setLongField(term384111, term384111.getClass(), "sumTechHighScore", 5703459904035105844L);
        setLongField(term384111, term384111.getClass(), "sumTechBasicHighScore", -3288274870163865024L);
        setLongField(term384111, term384111.getClass(), "sumTechAdvancedHighScore", 4773887236522927373L);
        setLongField(term384111, term384111.getClass(), "sumTechExpertHighScore", 1053542191713931078L);
        setLongField(term384111, term384111.getClass(), "sumTechMasterHighScore", 1664316872722461164L);
        setLongField(term384111, term384111.getClass(), "sumTechLunaticHighScore", 550028742588587912L);
        setLongField(term384111, term384111.getClass(), "sumBattleHighScore", 563780931077307951L);
        setLongField(term384111, term384111.getClass(), "sumBattleBasicHighScore", -4221247668690686146L);
        setLongField(term384111, term384111.getClass(), "sumBattleAdvancedHighScore", -5486125636601628166L);
        setLongField(term384111, term384111.getClass(), "sumBattleExpertHighScore", 972799231384448627L);
        setLongField(term384111, term384111.getClass(), "sumBattleMasterHighScore", -4396773150932322210L);
        setLongField(term384111, term384111.getClass(), "sumBattleLunaticHighScore", 4031885419638162884L);
        setField(term384111, term384111.getClass(), "eventWatchedDate", "tmHTZjDCqX");
        setField(term384111, term384111.getClass(), "cmEventWatchedDate", "LouyZCuuMR");
        setField(term384111, term384111.getClass(), "firstGameId", "XVQMfbuaMI");
        setField(term384111, term384111.getClass(), "firstRomVersion", "bobQudWVXQ");
        setField(term384111, term384111.getClass(), "firstDataVersion", "LfgjKrydGF");
        setField(term384111, term384111.getClass(), "firstPlayDate", "nXRTYwRjGW");
        setField(term384111, term384111.getClass(), "lastGameId", "OugdOcvnRU");
        setField(term384111, term384111.getClass(), "lastRomVersion", "RnHZQsIDyS");
        setField(term384111, term384111.getClass(), "lastDataVersion", "jbIjuJIjto");
        setField(term384111, term384111.getClass(), "compatibleCmVersion", "gWNhgjBaAi");
        setField(term384111, term384111.getClass(), "lastPlayDate", "RCkosxJzsN");
        setIntField(term384111, term384111.getClass(), "lastPlaceId", 427943495);
        setField(term384111, term384111.getClass(), "lastPlaceName", "wiEBiCazra");
        setIntField(term384111, term384111.getClass(), "lastRegionId", -1973890296);
        setField(term384111, term384111.getClass(), "lastRegionName", "KhEZQJRtSx");
        setIntField(term384111, term384111.getClass(), "lastAllNetId", -874297645);
        setField(term384111, term384111.getClass(), "lastClientId", "IGOqwCoQFI");
        setIntField(term384111, term384111.getClass(), "lastUsedDeckId", -2098554968);
        setIntField(term384111, term384111.getClass(), "lastPlayMusicLevel", 1650574448);
        setIntField(term384111, term384111.getClass(), "lastEmoneyBrand", -2091663232);
        setField(term384109, term384109.getClass(), "user", term384111);
        setIntField(term384109, term384109.getClass(), "eventId", 699004286);
        setLongField(term384109, term384109.getClass(), "point", -4357753829392659529L);
        setBooleanField(term384109, term384109.getClass(), "isRankingRewarded", false);
        term384377 = new Long(4153290004847829863L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserEventPoint");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term384377;
        callMethod(klass, "setId", argTypes, term384109, args);
    }

};


