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

public class UserMusicDetail_isLock_61173897116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term410786;

    public UserMusicDetail_isLock_61173897116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term410792 = new Long(5067793047038594982L);
        term410786 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicDetail"));
        Object term410788 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term410790 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term410806 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term410807 = newInstance(Class.forName("java.time.LocalDate"));
        Object term410811 = newInstance(Class.forName("java.time.LocalTime"));
        Object term410816 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term410817 = newInstance(Class.forName("java.time.LocalDate"));
        Object term410821 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term410786, term410786.getClass(), "id", 2339724581479774358L);
        setLongField(term410788, term410788.getClass(), "id", 2035340628592826076L);
        setLongField(term410790, term410790.getClass(), "id", -3134609510921007024L);
        setField(term410790, term410790.getClass(), "extId", term410792);
        setField(term410790, term410790.getClass(), "luid", "FecpJpcLDh");
        setIntField(term410807, term410807.getClass(), "year", 2020);
        setShortField(term410807, term410807.getClass(), "month", (short) 10);
        setShortField(term410807, term410807.getClass(), "day", (short) 2);
        setField(term410806, term410806.getClass(), "date", term410807);
        setByteField(term410811, term410811.getClass(), "hour", (byte) 11);
        setByteField(term410811, term410811.getClass(), "minute", (byte) 3);
        setByteField(term410811, term410811.getClass(), "second", (byte) 0);
        setIntField(term410811, term410811.getClass(), "nano", 254531713);
        setField(term410806, term410806.getClass(), "time", term410811);
        setField(term410790, term410790.getClass(), "registerTime", term410806);
        setIntField(term410817, term410817.getClass(), "year", 2026);
        setShortField(term410817, term410817.getClass(), "month", (short) 10);
        setShortField(term410817, term410817.getClass(), "day", (short) 17);
        setField(term410816, term410816.getClass(), "date", term410817);
        setByteField(term410821, term410821.getClass(), "hour", (byte) 16);
        setByteField(term410821, term410821.getClass(), "minute", (byte) 5);
        setByteField(term410821, term410821.getClass(), "second", (byte) 59);
        setIntField(term410821, term410821.getClass(), "nano", 517069304);
        setField(term410816, term410816.getClass(), "time", term410821);
        setField(term410790, term410790.getClass(), "accessTime", term410816);
        setField(term410788, term410788.getClass(), "card", term410790);
        setField(term410788, term410788.getClass(), "userName", "FQlbnBEqNv");
        setIntField(term410788, term410788.getClass(), "level", -648243330);
        setIntField(term410788, term410788.getClass(), "reincarnationNum", 735807125);
        setLongField(term410788, term410788.getClass(), "exp", 7369890448384182401L);
        setLongField(term410788, term410788.getClass(), "point", 8347323031636290088L);
        setLongField(term410788, term410788.getClass(), "totalPoint", -8657409081910158759L);
        setIntField(term410788, term410788.getClass(), "playCount", 1185061954);
        setIntField(term410788, term410788.getClass(), "jewelCount", -1544542259);
        setIntField(term410788, term410788.getClass(), "totalJewelCount", 962140090);
        setIntField(term410788, term410788.getClass(), "medalCount", -1155845990);
        setIntField(term410788, term410788.getClass(), "playerRating", -589001020);
        setIntField(term410788, term410788.getClass(), "highestRating", 1552808032);
        setIntField(term410788, term410788.getClass(), "battlePoint", -971152899);
        setIntField(term410788, term410788.getClass(), "bestBattlePoint", -1282628103);
        setIntField(term410788, term410788.getClass(), "overDamageBattlePoint", -1187909933);
        setBooleanField(term410788, term410788.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term410788, term410788.getClass(), "nameplateId", -981299895);
        setIntField(term410788, term410788.getClass(), "trophyId", 1406994756);
        setIntField(term410788, term410788.getClass(), "cardId", -641693408);
        setIntField(term410788, term410788.getClass(), "characterId", -343194810);
        setIntField(term410788, term410788.getClass(), "characterVoiceNo", 741234101);
        setIntField(term410788, term410788.getClass(), "tabSetting", -782544343);
        setIntField(term410788, term410788.getClass(), "tabSortSetting", -284308864);
        setIntField(term410788, term410788.getClass(), "cardCategorySetting", 1812549483);
        setIntField(term410788, term410788.getClass(), "cardSortSetting", 539743809);
        setIntField(term410788, term410788.getClass(), "rivalScoreCategorySetting", 1856037345);
        setIntField(term410788, term410788.getClass(), "playedTutorialBit", 1225547376);
        setIntField(term410788, term410788.getClass(), "firstTutorialCancelNum", 1068981530);
        setLongField(term410788, term410788.getClass(), "sumTechHighScore", 1184786260704907718L);
        setLongField(term410788, term410788.getClass(), "sumTechBasicHighScore", 3286449977075100074L);
        setLongField(term410788, term410788.getClass(), "sumTechAdvancedHighScore", 5975353931369383511L);
        setLongField(term410788, term410788.getClass(), "sumTechExpertHighScore", -534239435021672582L);
        setLongField(term410788, term410788.getClass(), "sumTechMasterHighScore", 5255853078398502544L);
        setLongField(term410788, term410788.getClass(), "sumTechLunaticHighScore", 2738829194305734189L);
        setLongField(term410788, term410788.getClass(), "sumBattleHighScore", -8096980405317281549L);
        setLongField(term410788, term410788.getClass(), "sumBattleBasicHighScore", 5938062867488101746L);
        setLongField(term410788, term410788.getClass(), "sumBattleAdvancedHighScore", 1358556891212092497L);
        setLongField(term410788, term410788.getClass(), "sumBattleExpertHighScore", 2197622562977519712L);
        setLongField(term410788, term410788.getClass(), "sumBattleMasterHighScore", 2294215595274775695L);
        setLongField(term410788, term410788.getClass(), "sumBattleLunaticHighScore", -6722720131967168037L);
        setField(term410788, term410788.getClass(), "eventWatchedDate", "ULknbkmVHB");
        setField(term410788, term410788.getClass(), "cmEventWatchedDate", "SEOJpetDzs");
        setField(term410788, term410788.getClass(), "firstGameId", "JgABqWpglE");
        setField(term410788, term410788.getClass(), "firstRomVersion", "GICBbvUDUj");
        setField(term410788, term410788.getClass(), "firstDataVersion", "ZQeKNDwCup");
        setField(term410788, term410788.getClass(), "firstPlayDate", "DsFsupeSRm");
        setField(term410788, term410788.getClass(), "lastGameId", "nLkCfAAMJQ");
        setField(term410788, term410788.getClass(), "lastRomVersion", "QnTFzZeUuz");
        setField(term410788, term410788.getClass(), "lastDataVersion", "gjXbhzclWi");
        setField(term410788, term410788.getClass(), "compatibleCmVersion", "TQlHPxOBNd");
        setField(term410788, term410788.getClass(), "lastPlayDate", "sDMsUtzHBU");
        setIntField(term410788, term410788.getClass(), "lastPlaceId", -448844937);
        setField(term410788, term410788.getClass(), "lastPlaceName", "uvCMwMATdk");
        setIntField(term410788, term410788.getClass(), "lastRegionId", 417917035);
        setField(term410788, term410788.getClass(), "lastRegionName", "FeyOzsCDAL");
        setIntField(term410788, term410788.getClass(), "lastAllNetId", -1452610222);
        setField(term410788, term410788.getClass(), "lastClientId", "sMEsrChvXG");
        setIntField(term410788, term410788.getClass(), "lastUsedDeckId", -201354234);
        setIntField(term410788, term410788.getClass(), "lastPlayMusicLevel", -1336102761);
        setIntField(term410788, term410788.getClass(), "lastEmoneyBrand", 620378629);
        setField(term410786, term410786.getClass(), "user", term410788);
        setIntField(term410786, term410786.getClass(), "musicId", -508763661);
        setIntField(term410786, term410786.getClass(), "level", 330625622);
        setIntField(term410786, term410786.getClass(), "playCount", -223555943);
        setIntField(term410786, term410786.getClass(), "techScoreMax", -76280862);
        setIntField(term410786, term410786.getClass(), "techScoreRank", 793803319);
        setIntField(term410786, term410786.getClass(), "battleScoreMax", 627817075);
        setIntField(term410786, term410786.getClass(), "battleScoreRank", 793720690);
        setIntField(term410786, term410786.getClass(), "maxComboCount", 517818394);
        setIntField(term410786, term410786.getClass(), "maxOverKill", -1833779723);
        setIntField(term410786, term410786.getClass(), "maxTeamOverKill", -863344093);
        setBooleanField(term410786, term410786.getClass(), "isFullBell", true);
        setBooleanField(term410786, term410786.getClass(), "isFullCombo", true);
        setBooleanField(term410786, term410786.getClass(), "isAllBreake", true);
        setBooleanField(term410786, term410786.getClass(), "isLock", false);
        setIntField(term410786, term410786.getClass(), "clearStatus", 1811943830);
        setBooleanField(term410786, term410786.getClass(), "isStoryWatched", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isLock", argTypes, term410786, args);
    }

};


