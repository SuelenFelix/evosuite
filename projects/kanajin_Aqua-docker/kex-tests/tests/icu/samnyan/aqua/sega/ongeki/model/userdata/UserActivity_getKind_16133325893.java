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

public class UserActivity_getKind_16133325893 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term284018;

    public UserActivity_getKind_16133325893() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term284024 = new Long(-4994148485124075625L);
        term284018 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserActivity"));
        Object term284020 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term284022 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term284038 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term284039 = newInstance(Class.forName("java.time.LocalDate"));
        Object term284043 = newInstance(Class.forName("java.time.LocalTime"));
        Object term284048 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term284049 = newInstance(Class.forName("java.time.LocalDate"));
        Object term284053 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term284018, term284018.getClass(), "id", 7741158020203228779L);
        setLongField(term284020, term284020.getClass(), "id", -970564288278153703L);
        setLongField(term284022, term284022.getClass(), "id", 849341324566256131L);
        setField(term284022, term284022.getClass(), "extId", term284024);
        setField(term284022, term284022.getClass(), "luid", "oBbrOFbyjc");
        setIntField(term284039, term284039.getClass(), "year", 2027);
        setShortField(term284039, term284039.getClass(), "month", (short) 6);
        setShortField(term284039, term284039.getClass(), "day", (short) 14);
        setField(term284038, term284038.getClass(), "date", term284039);
        setByteField(term284043, term284043.getClass(), "hour", (byte) 5);
        setByteField(term284043, term284043.getClass(), "minute", (byte) 37);
        setByteField(term284043, term284043.getClass(), "second", (byte) 15);
        setIntField(term284043, term284043.getClass(), "nano", 593611066);
        setField(term284038, term284038.getClass(), "time", term284043);
        setField(term284022, term284022.getClass(), "registerTime", term284038);
        setIntField(term284049, term284049.getClass(), "year", 2020);
        setShortField(term284049, term284049.getClass(), "month", (short) 12);
        setShortField(term284049, term284049.getClass(), "day", (short) 11);
        setField(term284048, term284048.getClass(), "date", term284049);
        setByteField(term284053, term284053.getClass(), "hour", (byte) 3);
        setByteField(term284053, term284053.getClass(), "minute", (byte) 44);
        setByteField(term284053, term284053.getClass(), "second", (byte) 8);
        setIntField(term284053, term284053.getClass(), "nano", 966467180);
        setField(term284048, term284048.getClass(), "time", term284053);
        setField(term284022, term284022.getClass(), "accessTime", term284048);
        setField(term284020, term284020.getClass(), "card", term284022);
        setField(term284020, term284020.getClass(), "userName", "VRZXwrWoco");
        setIntField(term284020, term284020.getClass(), "level", -137484132);
        setIntField(term284020, term284020.getClass(), "reincarnationNum", -836521071);
        setLongField(term284020, term284020.getClass(), "exp", -1202751708768800985L);
        setLongField(term284020, term284020.getClass(), "point", 1450793413272614509L);
        setLongField(term284020, term284020.getClass(), "totalPoint", -8017699787562367909L);
        setIntField(term284020, term284020.getClass(), "playCount", -1451275875);
        setIntField(term284020, term284020.getClass(), "jewelCount", -1232558510);
        setIntField(term284020, term284020.getClass(), "totalJewelCount", -1593478425);
        setIntField(term284020, term284020.getClass(), "medalCount", -1069502098);
        setIntField(term284020, term284020.getClass(), "playerRating", 1543953179);
        setIntField(term284020, term284020.getClass(), "highestRating", 1411978050);
        setIntField(term284020, term284020.getClass(), "battlePoint", 581571023);
        setIntField(term284020, term284020.getClass(), "bestBattlePoint", -150922197);
        setIntField(term284020, term284020.getClass(), "overDamageBattlePoint", 374168654);
        setBooleanField(term284020, term284020.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term284020, term284020.getClass(), "nameplateId", 550576763);
        setIntField(term284020, term284020.getClass(), "trophyId", 1169615135);
        setIntField(term284020, term284020.getClass(), "cardId", 936896201);
        setIntField(term284020, term284020.getClass(), "characterId", -577135458);
        setIntField(term284020, term284020.getClass(), "characterVoiceNo", -2015362123);
        setIntField(term284020, term284020.getClass(), "tabSetting", 1512483063);
        setIntField(term284020, term284020.getClass(), "tabSortSetting", -1114353828);
        setIntField(term284020, term284020.getClass(), "cardCategorySetting", -1036997079);
        setIntField(term284020, term284020.getClass(), "cardSortSetting", 1656123916);
        setIntField(term284020, term284020.getClass(), "rivalScoreCategorySetting", 2024821526);
        setIntField(term284020, term284020.getClass(), "playedTutorialBit", 1745990909);
        setIntField(term284020, term284020.getClass(), "firstTutorialCancelNum", -61000033);
        setLongField(term284020, term284020.getClass(), "sumTechHighScore", -4140370903463908036L);
        setLongField(term284020, term284020.getClass(), "sumTechBasicHighScore", 5629139511685000612L);
        setLongField(term284020, term284020.getClass(), "sumTechAdvancedHighScore", -4936446950294205074L);
        setLongField(term284020, term284020.getClass(), "sumTechExpertHighScore", -1796392663590188118L);
        setLongField(term284020, term284020.getClass(), "sumTechMasterHighScore", -6401133262975923179L);
        setLongField(term284020, term284020.getClass(), "sumTechLunaticHighScore", 7183641479203115793L);
        setLongField(term284020, term284020.getClass(), "sumBattleHighScore", 587099963975592761L);
        setLongField(term284020, term284020.getClass(), "sumBattleBasicHighScore", -263366917714974721L);
        setLongField(term284020, term284020.getClass(), "sumBattleAdvancedHighScore", 4382896440313195260L);
        setLongField(term284020, term284020.getClass(), "sumBattleExpertHighScore", 847474133973773787L);
        setLongField(term284020, term284020.getClass(), "sumBattleMasterHighScore", -2766158776214296321L);
        setLongField(term284020, term284020.getClass(), "sumBattleLunaticHighScore", -6548283173749354664L);
        setField(term284020, term284020.getClass(), "eventWatchedDate", "RrxbbTEHjO");
        setField(term284020, term284020.getClass(), "cmEventWatchedDate", "AszeYDlmYY");
        setField(term284020, term284020.getClass(), "firstGameId", "DujdUzFIMa");
        setField(term284020, term284020.getClass(), "firstRomVersion", "NOySWCkmik");
        setField(term284020, term284020.getClass(), "firstDataVersion", "DNMHqWALqA");
        setField(term284020, term284020.getClass(), "firstPlayDate", "xlwLAxfWId");
        setField(term284020, term284020.getClass(), "lastGameId", "ksdQQJdyNW");
        setField(term284020, term284020.getClass(), "lastRomVersion", "OMmpfwVAqq");
        setField(term284020, term284020.getClass(), "lastDataVersion", "epjWinvtVU");
        setField(term284020, term284020.getClass(), "compatibleCmVersion", "UjaiuciVbk");
        setField(term284020, term284020.getClass(), "lastPlayDate", "RWHiRCpYTv");
        setIntField(term284020, term284020.getClass(), "lastPlaceId", 833682710);
        setField(term284020, term284020.getClass(), "lastPlaceName", "bkkYKGVZSl");
        setIntField(term284020, term284020.getClass(), "lastRegionId", 1500532827);
        setField(term284020, term284020.getClass(), "lastRegionName", "zxSymDvdRR");
        setIntField(term284020, term284020.getClass(), "lastAllNetId", 1496996100);
        setField(term284020, term284020.getClass(), "lastClientId", "vLzflhmVIO");
        setIntField(term284020, term284020.getClass(), "lastUsedDeckId", 1948281454);
        setIntField(term284020, term284020.getClass(), "lastPlayMusicLevel", -1588244681);
        setIntField(term284020, term284020.getClass(), "lastEmoneyBrand", 1657723528);
        setField(term284018, term284018.getClass(), "user", term284020);
        setIntField(term284018, term284018.getClass(), "kind", -925335689);
        setIntField(term284018, term284018.getClass(), "activityId", 1465194014);
        setIntField(term284018, term284018.getClass(), "sortNumber", 1373439283);
        setIntField(term284018, term284018.getClass(), "param1", 1908194889);
        setIntField(term284018, term284018.getClass(), "param2", 812950204);
        setIntField(term284018, term284018.getClass(), "param3", 732912125);
        setIntField(term284018, term284018.getClass(), "param4", 1994255108);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserActivity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getKind", argTypes, term284018, args);
    }

};


