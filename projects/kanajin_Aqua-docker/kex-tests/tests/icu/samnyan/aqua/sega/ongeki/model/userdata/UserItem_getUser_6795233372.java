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

public class UserItem_getUser_6795233372 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103440;

    public UserItem_getUser_6795233372() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term103446 = new Long(6902365338255307910L);
        term103440 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserItem"));
        Object term103442 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term103444 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term103460 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term103461 = newInstance(Class.forName("java.time.LocalDate"));
        Object term103465 = newInstance(Class.forName("java.time.LocalTime"));
        Object term103470 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term103471 = newInstance(Class.forName("java.time.LocalDate"));
        Object term103475 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term103440, term103440.getClass(), "id", -5281137098573086443L);
        setLongField(term103442, term103442.getClass(), "id", 1415254719896625217L);
        setLongField(term103444, term103444.getClass(), "id", 180002764419338595L);
        setField(term103444, term103444.getClass(), "extId", term103446);
        setField(term103444, term103444.getClass(), "luid", "llYGfgCigY");
        setIntField(term103461, term103461.getClass(), "year", 2010);
        setShortField(term103461, term103461.getClass(), "month", (short) 5);
        setShortField(term103461, term103461.getClass(), "day", (short) 27);
        setField(term103460, term103460.getClass(), "date", term103461);
        setByteField(term103465, term103465.getClass(), "hour", (byte) 12);
        setByteField(term103465, term103465.getClass(), "minute", (byte) 53);
        setByteField(term103465, term103465.getClass(), "second", (byte) 45);
        setIntField(term103465, term103465.getClass(), "nano", 508314626);
        setField(term103460, term103460.getClass(), "time", term103465);
        setField(term103444, term103444.getClass(), "registerTime", term103460);
        setIntField(term103471, term103471.getClass(), "year", 2028);
        setShortField(term103471, term103471.getClass(), "month", (short) 2);
        setShortField(term103471, term103471.getClass(), "day", (short) 29);
        setField(term103470, term103470.getClass(), "date", term103471);
        setByteField(term103475, term103475.getClass(), "hour", (byte) 9);
        setByteField(term103475, term103475.getClass(), "minute", (byte) 45);
        setByteField(term103475, term103475.getClass(), "second", (byte) 4);
        setIntField(term103475, term103475.getClass(), "nano", 508964901);
        setField(term103470, term103470.getClass(), "time", term103475);
        setField(term103444, term103444.getClass(), "accessTime", term103470);
        setField(term103442, term103442.getClass(), "card", term103444);
        setField(term103442, term103442.getClass(), "userName", "WToYKUjMGj");
        setIntField(term103442, term103442.getClass(), "level", 150764621);
        setIntField(term103442, term103442.getClass(), "reincarnationNum", 1888338766);
        setLongField(term103442, term103442.getClass(), "exp", -7962448518424234345L);
        setLongField(term103442, term103442.getClass(), "point", -5034511656983081481L);
        setLongField(term103442, term103442.getClass(), "totalPoint", 2294241049428445689L);
        setIntField(term103442, term103442.getClass(), "playCount", 1982543201);
        setIntField(term103442, term103442.getClass(), "jewelCount", 74831560);
        setIntField(term103442, term103442.getClass(), "totalJewelCount", 1825435825);
        setIntField(term103442, term103442.getClass(), "medalCount", 1481132137);
        setIntField(term103442, term103442.getClass(), "playerRating", -781680177);
        setIntField(term103442, term103442.getClass(), "highestRating", -897834640);
        setIntField(term103442, term103442.getClass(), "battlePoint", -375611393);
        setIntField(term103442, term103442.getClass(), "bestBattlePoint", -1798238449);
        setIntField(term103442, term103442.getClass(), "overDamageBattlePoint", 470207750);
        setBooleanField(term103442, term103442.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term103442, term103442.getClass(), "nameplateId", -1220080582);
        setIntField(term103442, term103442.getClass(), "trophyId", -607572941);
        setIntField(term103442, term103442.getClass(), "cardId", 684781565);
        setIntField(term103442, term103442.getClass(), "characterId", -1582304993);
        setIntField(term103442, term103442.getClass(), "characterVoiceNo", -1728289450);
        setIntField(term103442, term103442.getClass(), "tabSetting", 1143106804);
        setIntField(term103442, term103442.getClass(), "tabSortSetting", -574562393);
        setIntField(term103442, term103442.getClass(), "cardCategorySetting", 621957704);
        setIntField(term103442, term103442.getClass(), "cardSortSetting", 1938454325);
        setIntField(term103442, term103442.getClass(), "rivalScoreCategorySetting", -1406084415);
        setIntField(term103442, term103442.getClass(), "playedTutorialBit", 642206554);
        setIntField(term103442, term103442.getClass(), "firstTutorialCancelNum", 947904287);
        setLongField(term103442, term103442.getClass(), "sumTechHighScore", -4428406875939495103L);
        setLongField(term103442, term103442.getClass(), "sumTechBasicHighScore", 251205446189774619L);
        setLongField(term103442, term103442.getClass(), "sumTechAdvancedHighScore", 7494616801718312435L);
        setLongField(term103442, term103442.getClass(), "sumTechExpertHighScore", 7015036847228295050L);
        setLongField(term103442, term103442.getClass(), "sumTechMasterHighScore", -4914451098628831553L);
        setLongField(term103442, term103442.getClass(), "sumTechLunaticHighScore", 6171184492519640340L);
        setLongField(term103442, term103442.getClass(), "sumBattleHighScore", -7456060183040854427L);
        setLongField(term103442, term103442.getClass(), "sumBattleBasicHighScore", -2127992200468340889L);
        setLongField(term103442, term103442.getClass(), "sumBattleAdvancedHighScore", 7975033780430202348L);
        setLongField(term103442, term103442.getClass(), "sumBattleExpertHighScore", -5537620848003018760L);
        setLongField(term103442, term103442.getClass(), "sumBattleMasterHighScore", -5183723444715290833L);
        setLongField(term103442, term103442.getClass(), "sumBattleLunaticHighScore", 3528662942109485094L);
        setField(term103442, term103442.getClass(), "eventWatchedDate", "wbtDRRVkMv");
        setField(term103442, term103442.getClass(), "cmEventWatchedDate", "abzzbYwTRo");
        setField(term103442, term103442.getClass(), "firstGameId", "HxIZqtNMYu");
        setField(term103442, term103442.getClass(), "firstRomVersion", "NVlTBmmeHa");
        setField(term103442, term103442.getClass(), "firstDataVersion", "QZomwNJvGF");
        setField(term103442, term103442.getClass(), "firstPlayDate", "qfHzTgyYaj");
        setField(term103442, term103442.getClass(), "lastGameId", "BzOSSnQpxM");
        setField(term103442, term103442.getClass(), "lastRomVersion", "LoFkuWLahf");
        setField(term103442, term103442.getClass(), "lastDataVersion", "GwcCGdSyQT");
        setField(term103442, term103442.getClass(), "compatibleCmVersion", "pQLjQOCQOz");
        setField(term103442, term103442.getClass(), "lastPlayDate", "RaVKdrEtNk");
        setIntField(term103442, term103442.getClass(), "lastPlaceId", 1008116811);
        setField(term103442, term103442.getClass(), "lastPlaceName", "pLrycUApoJ");
        setIntField(term103442, term103442.getClass(), "lastRegionId", -453969559);
        setField(term103442, term103442.getClass(), "lastRegionName", "QJTDOLXoVI");
        setIntField(term103442, term103442.getClass(), "lastAllNetId", -1976851292);
        setField(term103442, term103442.getClass(), "lastClientId", "MVXNdXioDJ");
        setIntField(term103442, term103442.getClass(), "lastUsedDeckId", 1007436356);
        setIntField(term103442, term103442.getClass(), "lastPlayMusicLevel", 953383703);
        setIntField(term103442, term103442.getClass(), "lastEmoneyBrand", 379942336);
        setField(term103440, term103440.getClass(), "user", term103442);
        setIntField(term103440, term103440.getClass(), "itemKind", -1553154317);
        setIntField(term103440, term103440.getClass(), "itemId", -1016850135);
        setIntField(term103440, term103440.getClass(), "stock", 475367008);
        setBooleanField(term103440, term103440.getClass(), "isValid", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUser", argTypes, term103440, args);
    }

};


