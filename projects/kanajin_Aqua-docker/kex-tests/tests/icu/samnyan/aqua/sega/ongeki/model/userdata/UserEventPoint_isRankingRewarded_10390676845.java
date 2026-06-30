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

public class UserEventPoint_isRankingRewarded_10390676845 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term383681;

    public UserEventPoint_isRankingRewarded_10390676845() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term383687 = new Long(7205698466499430091L);
        term383681 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserEventPoint"));
        Object term383683 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term383685 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term383701 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term383702 = newInstance(Class.forName("java.time.LocalDate"));
        Object term383706 = newInstance(Class.forName("java.time.LocalTime"));
        Object term383711 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term383712 = newInstance(Class.forName("java.time.LocalDate"));
        Object term383716 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term383681, term383681.getClass(), "id", 3623825548172431665L);
        setLongField(term383683, term383683.getClass(), "id", -3632351422147541533L);
        setLongField(term383685, term383685.getClass(), "id", 5589075229413657561L);
        setField(term383685, term383685.getClass(), "extId", term383687);
        setField(term383685, term383685.getClass(), "luid", "OKqcbFoTHp");
        setIntField(term383702, term383702.getClass(), "year", 2018);
        setShortField(term383702, term383702.getClass(), "month", (short) 9);
        setShortField(term383702, term383702.getClass(), "day", (short) 2);
        setField(term383701, term383701.getClass(), "date", term383702);
        setByteField(term383706, term383706.getClass(), "hour", (byte) 22);
        setByteField(term383706, term383706.getClass(), "minute", (byte) 50);
        setByteField(term383706, term383706.getClass(), "second", (byte) 58);
        setIntField(term383706, term383706.getClass(), "nano", 374371327);
        setField(term383701, term383701.getClass(), "time", term383706);
        setField(term383685, term383685.getClass(), "registerTime", term383701);
        setIntField(term383712, term383712.getClass(), "year", 2012);
        setShortField(term383712, term383712.getClass(), "month", (short) 11);
        setShortField(term383712, term383712.getClass(), "day", (short) 2);
        setField(term383711, term383711.getClass(), "date", term383712);
        setByteField(term383716, term383716.getClass(), "hour", (byte) 16);
        setByteField(term383716, term383716.getClass(), "minute", (byte) 51);
        setByteField(term383716, term383716.getClass(), "second", (byte) 10);
        setIntField(term383716, term383716.getClass(), "nano", 30584226);
        setField(term383711, term383711.getClass(), "time", term383716);
        setField(term383685, term383685.getClass(), "accessTime", term383711);
        setField(term383683, term383683.getClass(), "card", term383685);
        setField(term383683, term383683.getClass(), "userName", "SUnxanDYGI");
        setIntField(term383683, term383683.getClass(), "level", 430997707);
        setIntField(term383683, term383683.getClass(), "reincarnationNum", -1861654250);
        setLongField(term383683, term383683.getClass(), "exp", -8286575017081655965L);
        setLongField(term383683, term383683.getClass(), "point", -2771325276907789184L);
        setLongField(term383683, term383683.getClass(), "totalPoint", -853054564988427023L);
        setIntField(term383683, term383683.getClass(), "playCount", 1863480272);
        setIntField(term383683, term383683.getClass(), "jewelCount", -1274788620);
        setIntField(term383683, term383683.getClass(), "totalJewelCount", -1532130902);
        setIntField(term383683, term383683.getClass(), "medalCount", -1466931361);
        setIntField(term383683, term383683.getClass(), "playerRating", 2022669973);
        setIntField(term383683, term383683.getClass(), "highestRating", -1308088329);
        setIntField(term383683, term383683.getClass(), "battlePoint", 584621151);
        setIntField(term383683, term383683.getClass(), "bestBattlePoint", -164121728);
        setIntField(term383683, term383683.getClass(), "overDamageBattlePoint", 304899462);
        setBooleanField(term383683, term383683.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term383683, term383683.getClass(), "nameplateId", 1922594930);
        setIntField(term383683, term383683.getClass(), "trophyId", -161287728);
        setIntField(term383683, term383683.getClass(), "cardId", 1741321163);
        setIntField(term383683, term383683.getClass(), "characterId", -577636049);
        setIntField(term383683, term383683.getClass(), "characterVoiceNo", -661606603);
        setIntField(term383683, term383683.getClass(), "tabSetting", 565906155);
        setIntField(term383683, term383683.getClass(), "tabSortSetting", -504706556);
        setIntField(term383683, term383683.getClass(), "cardCategorySetting", 517206632);
        setIntField(term383683, term383683.getClass(), "cardSortSetting", -1578907496);
        setIntField(term383683, term383683.getClass(), "rivalScoreCategorySetting", 2004066302);
        setIntField(term383683, term383683.getClass(), "playedTutorialBit", -1713688029);
        setIntField(term383683, term383683.getClass(), "firstTutorialCancelNum", 922903495);
        setLongField(term383683, term383683.getClass(), "sumTechHighScore", 5038802455612763574L);
        setLongField(term383683, term383683.getClass(), "sumTechBasicHighScore", 8409792586225041048L);
        setLongField(term383683, term383683.getClass(), "sumTechAdvancedHighScore", -8196859184320970069L);
        setLongField(term383683, term383683.getClass(), "sumTechExpertHighScore", -8294299073539526919L);
        setLongField(term383683, term383683.getClass(), "sumTechMasterHighScore", -7449510472909828948L);
        setLongField(term383683, term383683.getClass(), "sumTechLunaticHighScore", 637848491845793905L);
        setLongField(term383683, term383683.getClass(), "sumBattleHighScore", -4641875526039724819L);
        setLongField(term383683, term383683.getClass(), "sumBattleBasicHighScore", 2106641375780693114L);
        setLongField(term383683, term383683.getClass(), "sumBattleAdvancedHighScore", -5239724549885321592L);
        setLongField(term383683, term383683.getClass(), "sumBattleExpertHighScore", 4187543993047576401L);
        setLongField(term383683, term383683.getClass(), "sumBattleMasterHighScore", 1224100905449284805L);
        setLongField(term383683, term383683.getClass(), "sumBattleLunaticHighScore", -1670956438205003303L);
        setField(term383683, term383683.getClass(), "eventWatchedDate", "ThlPiSQgoR");
        setField(term383683, term383683.getClass(), "cmEventWatchedDate", "vhFgNCkSjD");
        setField(term383683, term383683.getClass(), "firstGameId", "WHqskOyQUr");
        setField(term383683, term383683.getClass(), "firstRomVersion", "QIfAplGtVD");
        setField(term383683, term383683.getClass(), "firstDataVersion", "yPgcXmTBoH");
        setField(term383683, term383683.getClass(), "firstPlayDate", "eTkltoSANd");
        setField(term383683, term383683.getClass(), "lastGameId", "ywmYqQUXTW");
        setField(term383683, term383683.getClass(), "lastRomVersion", "YoFBxkKKSL");
        setField(term383683, term383683.getClass(), "lastDataVersion", "WEmdpXkXaa");
        setField(term383683, term383683.getClass(), "compatibleCmVersion", "ZCsNRtTCeu");
        setField(term383683, term383683.getClass(), "lastPlayDate", "heTGHQCeca");
        setIntField(term383683, term383683.getClass(), "lastPlaceId", 1919404771);
        setField(term383683, term383683.getClass(), "lastPlaceName", "tvAEbSlJmF");
        setIntField(term383683, term383683.getClass(), "lastRegionId", -1445351098);
        setField(term383683, term383683.getClass(), "lastRegionName", "DgwiLIEOvx");
        setIntField(term383683, term383683.getClass(), "lastAllNetId", 733514071);
        setField(term383683, term383683.getClass(), "lastClientId", "PqYrtmYjOm");
        setIntField(term383683, term383683.getClass(), "lastUsedDeckId", 752635477);
        setIntField(term383683, term383683.getClass(), "lastPlayMusicLevel", -1486303504);
        setIntField(term383683, term383683.getClass(), "lastEmoneyBrand", -1451062075);
        setField(term383681, term383681.getClass(), "user", term383683);
        setIntField(term383681, term383681.getClass(), "eventId", -1382088370);
        setLongField(term383681, term383681.getClass(), "point", 4502461935849527708L);
        setBooleanField(term383681, term383681.getClass(), "isRankingRewarded", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserEventPoint");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isRankingRewarded", argTypes, term383681, args);
    }

};


