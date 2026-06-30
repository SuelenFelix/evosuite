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

public class UserBoss_getEventId_13421416226 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term136295;

    public UserBoss_getEventId_13421416226() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term136301 = new Long(-6078481855513028760L);
        term136295 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserBoss"));
        Object term136297 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term136299 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term136315 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term136316 = newInstance(Class.forName("java.time.LocalDate"));
        Object term136320 = newInstance(Class.forName("java.time.LocalTime"));
        Object term136325 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term136326 = newInstance(Class.forName("java.time.LocalDate"));
        Object term136330 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term136295, term136295.getClass(), "id", 123972715252086883L);
        setLongField(term136297, term136297.getClass(), "id", -5113221367564005371L);
        setLongField(term136299, term136299.getClass(), "id", 5079261875940240033L);
        setField(term136299, term136299.getClass(), "extId", term136301);
        setField(term136299, term136299.getClass(), "luid", "gdOOqYLTIa");
        setIntField(term136316, term136316.getClass(), "year", 2020);
        setShortField(term136316, term136316.getClass(), "month", (short) 8);
        setShortField(term136316, term136316.getClass(), "day", (short) 9);
        setField(term136315, term136315.getClass(), "date", term136316);
        setByteField(term136320, term136320.getClass(), "hour", (byte) 2);
        setByteField(term136320, term136320.getClass(), "minute", (byte) 25);
        setByteField(term136320, term136320.getClass(), "second", (byte) 38);
        setIntField(term136320, term136320.getClass(), "nano", 447739818);
        setField(term136315, term136315.getClass(), "time", term136320);
        setField(term136299, term136299.getClass(), "registerTime", term136315);
        setIntField(term136326, term136326.getClass(), "year", 2026);
        setShortField(term136326, term136326.getClass(), "month", (short) 2);
        setShortField(term136326, term136326.getClass(), "day", (short) 28);
        setField(term136325, term136325.getClass(), "date", term136326);
        setByteField(term136330, term136330.getClass(), "hour", (byte) 19);
        setByteField(term136330, term136330.getClass(), "minute", (byte) 20);
        setByteField(term136330, term136330.getClass(), "second", (byte) 45);
        setIntField(term136330, term136330.getClass(), "nano", 843222042);
        setField(term136325, term136325.getClass(), "time", term136330);
        setField(term136299, term136299.getClass(), "accessTime", term136325);
        setField(term136297, term136297.getClass(), "card", term136299);
        setField(term136297, term136297.getClass(), "userName", "laVtzInYkB");
        setIntField(term136297, term136297.getClass(), "level", 47568249);
        setIntField(term136297, term136297.getClass(), "reincarnationNum", -512122488);
        setLongField(term136297, term136297.getClass(), "exp", -1372894277820954618L);
        setLongField(term136297, term136297.getClass(), "point", -7368898198734775546L);
        setLongField(term136297, term136297.getClass(), "totalPoint", -5512630224159172678L);
        setIntField(term136297, term136297.getClass(), "playCount", 1660000916);
        setIntField(term136297, term136297.getClass(), "jewelCount", -949546282);
        setIntField(term136297, term136297.getClass(), "totalJewelCount", -1522246141);
        setIntField(term136297, term136297.getClass(), "medalCount", 2132977330);
        setIntField(term136297, term136297.getClass(), "playerRating", 352025141);
        setIntField(term136297, term136297.getClass(), "highestRating", -135640820);
        setIntField(term136297, term136297.getClass(), "battlePoint", 515232963);
        setIntField(term136297, term136297.getClass(), "bestBattlePoint", -67715099);
        setIntField(term136297, term136297.getClass(), "overDamageBattlePoint", 1291945924);
        setBooleanField(term136297, term136297.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term136297, term136297.getClass(), "nameplateId", 1997045566);
        setIntField(term136297, term136297.getClass(), "trophyId", 1476366061);
        setIntField(term136297, term136297.getClass(), "cardId", -834804985);
        setIntField(term136297, term136297.getClass(), "characterId", -299552913);
        setIntField(term136297, term136297.getClass(), "characterVoiceNo", 1340088266);
        setIntField(term136297, term136297.getClass(), "tabSetting", -1394987080);
        setIntField(term136297, term136297.getClass(), "tabSortSetting", 677698603);
        setIntField(term136297, term136297.getClass(), "cardCategorySetting", -2094588812);
        setIntField(term136297, term136297.getClass(), "cardSortSetting", 2038499448);
        setIntField(term136297, term136297.getClass(), "rivalScoreCategorySetting", -2065835383);
        setIntField(term136297, term136297.getClass(), "playedTutorialBit", 580583133);
        setIntField(term136297, term136297.getClass(), "firstTutorialCancelNum", -179490331);
        setLongField(term136297, term136297.getClass(), "sumTechHighScore", -6925545224697163588L);
        setLongField(term136297, term136297.getClass(), "sumTechBasicHighScore", 4454073487365103417L);
        setLongField(term136297, term136297.getClass(), "sumTechAdvancedHighScore", 6045163719516190718L);
        setLongField(term136297, term136297.getClass(), "sumTechExpertHighScore", 7460174161866670071L);
        setLongField(term136297, term136297.getClass(), "sumTechMasterHighScore", -7585349898806920009L);
        setLongField(term136297, term136297.getClass(), "sumTechLunaticHighScore", -3362290512287927808L);
        setLongField(term136297, term136297.getClass(), "sumBattleHighScore", 8608618297977334632L);
        setLongField(term136297, term136297.getClass(), "sumBattleBasicHighScore", -5740146080456431228L);
        setLongField(term136297, term136297.getClass(), "sumBattleAdvancedHighScore", 6363453882080361550L);
        setLongField(term136297, term136297.getClass(), "sumBattleExpertHighScore", -6686295474626473834L);
        setLongField(term136297, term136297.getClass(), "sumBattleMasterHighScore", 7222466618100214979L);
        setLongField(term136297, term136297.getClass(), "sumBattleLunaticHighScore", -2026036706441881296L);
        setField(term136297, term136297.getClass(), "eventWatchedDate", "QlMgZrPWFc");
        setField(term136297, term136297.getClass(), "cmEventWatchedDate", "RBFdhcXDVw");
        setField(term136297, term136297.getClass(), "firstGameId", "xVeXohNyns");
        setField(term136297, term136297.getClass(), "firstRomVersion", "GPeSysvTtW");
        setField(term136297, term136297.getClass(), "firstDataVersion", "gHCWHtrKMj");
        setField(term136297, term136297.getClass(), "firstPlayDate", "sRhnTEwrac");
        setField(term136297, term136297.getClass(), "lastGameId", "JHOBLjcqST");
        setField(term136297, term136297.getClass(), "lastRomVersion", "SMOeUyvURd");
        setField(term136297, term136297.getClass(), "lastDataVersion", "FdqAMXxgBA");
        setField(term136297, term136297.getClass(), "compatibleCmVersion", "amjxvUlDTF");
        setField(term136297, term136297.getClass(), "lastPlayDate", "homzrGHfwX");
        setIntField(term136297, term136297.getClass(), "lastPlaceId", -1593340430);
        setField(term136297, term136297.getClass(), "lastPlaceName", "fIeNSTsisH");
        setIntField(term136297, term136297.getClass(), "lastRegionId", 1829561168);
        setField(term136297, term136297.getClass(), "lastRegionName", "rsKcNOWfZH");
        setIntField(term136297, term136297.getClass(), "lastAllNetId", -1987503937);
        setField(term136297, term136297.getClass(), "lastClientId", "NwcJhozXMr");
        setIntField(term136297, term136297.getClass(), "lastUsedDeckId", -425145429);
        setIntField(term136297, term136297.getClass(), "lastPlayMusicLevel", 530563698);
        setIntField(term136297, term136297.getClass(), "lastEmoneyBrand", 246325554);
        setField(term136295, term136295.getClass(), "user", term136297);
        setIntField(term136295, term136295.getClass(), "musicId", -101942956);
        setIntField(term136295, term136295.getClass(), "damage", -879653940);
        setBooleanField(term136295, term136295.getClass(), "isClear", false);
        setIntField(term136295, term136295.getClass(), "eventId", 1525281725);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserBoss");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEventId", argTypes, term136295, args);
    }

};


