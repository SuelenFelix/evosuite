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
import java.lang.Integer;

public class UserMemoryChapter_setJewelCount_3439830217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term396737;
     Object term397013;

    public UserMemoryChapter_setJewelCount_3439830217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term396743 = new Long(-205762347192500511L);
        term396737 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMemoryChapter"));
        Object term396739 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term396741 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term396757 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term396758 = newInstance(Class.forName("java.time.LocalDate"));
        Object term396762 = newInstance(Class.forName("java.time.LocalTime"));
        Object term396767 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term396768 = newInstance(Class.forName("java.time.LocalDate"));
        Object term396772 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term396737, term396737.getClass(), "id", -407857484202759438L);
        setLongField(term396739, term396739.getClass(), "id", -6640112612664470324L);
        setLongField(term396741, term396741.getClass(), "id", -2303481683520306797L);
        setField(term396741, term396741.getClass(), "extId", term396743);
        setField(term396741, term396741.getClass(), "luid", "yPstwCtCXt");
        setIntField(term396758, term396758.getClass(), "year", 2018);
        setShortField(term396758, term396758.getClass(), "month", (short) 10);
        setShortField(term396758, term396758.getClass(), "day", (short) 21);
        setField(term396757, term396757.getClass(), "date", term396758);
        setByteField(term396762, term396762.getClass(), "hour", (byte) 5);
        setByteField(term396762, term396762.getClass(), "minute", (byte) 29);
        setByteField(term396762, term396762.getClass(), "second", (byte) 20);
        setIntField(term396762, term396762.getClass(), "nano", 43447999);
        setField(term396757, term396757.getClass(), "time", term396762);
        setField(term396741, term396741.getClass(), "registerTime", term396757);
        setIntField(term396768, term396768.getClass(), "year", 2029);
        setShortField(term396768, term396768.getClass(), "month", (short) 7);
        setShortField(term396768, term396768.getClass(), "day", (short) 14);
        setField(term396767, term396767.getClass(), "date", term396768);
        setByteField(term396772, term396772.getClass(), "hour", (byte) 3);
        setByteField(term396772, term396772.getClass(), "minute", (byte) 34);
        setByteField(term396772, term396772.getClass(), "second", (byte) 7);
        setIntField(term396772, term396772.getClass(), "nano", 107827221);
        setField(term396767, term396767.getClass(), "time", term396772);
        setField(term396741, term396741.getClass(), "accessTime", term396767);
        setField(term396739, term396739.getClass(), "card", term396741);
        setField(term396739, term396739.getClass(), "userName", "wriAipDMMQ");
        setIntField(term396739, term396739.getClass(), "level", -1618803592);
        setIntField(term396739, term396739.getClass(), "reincarnationNum", 1144952073);
        setLongField(term396739, term396739.getClass(), "exp", -2466013599161348963L);
        setLongField(term396739, term396739.getClass(), "point", 933166127036935939L);
        setLongField(term396739, term396739.getClass(), "totalPoint", 778070503698107839L);
        setIntField(term396739, term396739.getClass(), "playCount", 619661429);
        setIntField(term396739, term396739.getClass(), "jewelCount", 1034420588);
        setIntField(term396739, term396739.getClass(), "totalJewelCount", 697935016);
        setIntField(term396739, term396739.getClass(), "medalCount", 55211244);
        setIntField(term396739, term396739.getClass(), "playerRating", 2087269828);
        setIntField(term396739, term396739.getClass(), "highestRating", 845880108);
        setIntField(term396739, term396739.getClass(), "battlePoint", 1556817583);
        setIntField(term396739, term396739.getClass(), "bestBattlePoint", 1303640771);
        setIntField(term396739, term396739.getClass(), "overDamageBattlePoint", -1115947905);
        setBooleanField(term396739, term396739.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term396739, term396739.getClass(), "nameplateId", 1188153220);
        setIntField(term396739, term396739.getClass(), "trophyId", -1521770663);
        setIntField(term396739, term396739.getClass(), "cardId", 1324500643);
        setIntField(term396739, term396739.getClass(), "characterId", -1350982249);
        setIntField(term396739, term396739.getClass(), "characterVoiceNo", 1341161953);
        setIntField(term396739, term396739.getClass(), "tabSetting", -1552176930);
        setIntField(term396739, term396739.getClass(), "tabSortSetting", -893272993);
        setIntField(term396739, term396739.getClass(), "cardCategorySetting", -100329199);
        setIntField(term396739, term396739.getClass(), "cardSortSetting", -1008602416);
        setIntField(term396739, term396739.getClass(), "rivalScoreCategorySetting", 104212290);
        setIntField(term396739, term396739.getClass(), "playedTutorialBit", -1293780454);
        setIntField(term396739, term396739.getClass(), "firstTutorialCancelNum", -1373400308);
        setLongField(term396739, term396739.getClass(), "sumTechHighScore", 3768864628757510145L);
        setLongField(term396739, term396739.getClass(), "sumTechBasicHighScore", -6796635995012351438L);
        setLongField(term396739, term396739.getClass(), "sumTechAdvancedHighScore", -3179135527747206068L);
        setLongField(term396739, term396739.getClass(), "sumTechExpertHighScore", -4951536499363469726L);
        setLongField(term396739, term396739.getClass(), "sumTechMasterHighScore", 7374998902411388045L);
        setLongField(term396739, term396739.getClass(), "sumTechLunaticHighScore", -2001340366695650392L);
        setLongField(term396739, term396739.getClass(), "sumBattleHighScore", -6724266774522277260L);
        setLongField(term396739, term396739.getClass(), "sumBattleBasicHighScore", -3629055115799732458L);
        setLongField(term396739, term396739.getClass(), "sumBattleAdvancedHighScore", -7531060248188268768L);
        setLongField(term396739, term396739.getClass(), "sumBattleExpertHighScore", -2868282596086632333L);
        setLongField(term396739, term396739.getClass(), "sumBattleMasterHighScore", 3768900472924603331L);
        setLongField(term396739, term396739.getClass(), "sumBattleLunaticHighScore", -3304218531907046012L);
        setField(term396739, term396739.getClass(), "eventWatchedDate", "cnoKaPdAVO");
        setField(term396739, term396739.getClass(), "cmEventWatchedDate", "ZmdwUxGJnc");
        setField(term396739, term396739.getClass(), "firstGameId", "cYHkDddCQC");
        setField(term396739, term396739.getClass(), "firstRomVersion", "fGiHctnjhc");
        setField(term396739, term396739.getClass(), "firstDataVersion", "ARMktJPmNs");
        setField(term396739, term396739.getClass(), "firstPlayDate", "CpbeVUdClO");
        setField(term396739, term396739.getClass(), "lastGameId", "ydGAbVAkmh");
        setField(term396739, term396739.getClass(), "lastRomVersion", "mRfOrscMjK");
        setField(term396739, term396739.getClass(), "lastDataVersion", "lKqcOFCrtU");
        setField(term396739, term396739.getClass(), "compatibleCmVersion", "QiHRFjbtmx");
        setField(term396739, term396739.getClass(), "lastPlayDate", "VNpviJaBBq");
        setIntField(term396739, term396739.getClass(), "lastPlaceId", 487021231);
        setField(term396739, term396739.getClass(), "lastPlaceName", "ztmYnbPwjV");
        setIntField(term396739, term396739.getClass(), "lastRegionId", 587951870);
        setField(term396739, term396739.getClass(), "lastRegionName", "LaQZxTZNBp");
        setIntField(term396739, term396739.getClass(), "lastAllNetId", -198237155);
        setField(term396739, term396739.getClass(), "lastClientId", "GSOQFzITcM");
        setIntField(term396739, term396739.getClass(), "lastUsedDeckId", -746461950);
        setIntField(term396739, term396739.getClass(), "lastPlayMusicLevel", 1540912039);
        setIntField(term396739, term396739.getClass(), "lastEmoneyBrand", -441077280);
        setField(term396737, term396737.getClass(), "user", term396739);
        setIntField(term396737, term396737.getClass(), "chapterId", 523508202);
        setIntField(term396737, term396737.getClass(), "jewelCount", 1358301005);
        setIntField(term396737, term396737.getClass(), "lastPlayMusicCategory", 209387225);
        setIntField(term396737, term396737.getClass(), "lastPlayMusicId", -1637034449);
        setIntField(term396737, term396737.getClass(), "lastPlayMusicLevel", 576481425);
        setBooleanField(term396737, term396737.getClass(), "isDialogWatched", false);
        setBooleanField(term396737, term396737.getClass(), "isStoryWatched", false);
        setBooleanField(term396737, term396737.getClass(), "isBossWatched", true);
        setBooleanField(term396737, term396737.getClass(), "isClear", false);
        setIntField(term396737, term396737.getClass(), "gaugeId", -792084755);
        setIntField(term396737, term396737.getClass(), "gaugeNum", 1412002007);
        term397013 = new Integer(-2005001198);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMemoryChapter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term397013;
        callMethod(klass, "setJewelCount", argTypes, term396737, args);
    }

};


