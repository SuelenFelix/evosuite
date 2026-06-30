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

public class UserActivity_setParam3_98627923917 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term290501;
     Object term290773;

    public UserActivity_setParam3_98627923917() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term290507 = new Long(5614572229094721840L);
        term290501 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserActivity"));
        Object term290503 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term290505 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term290521 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term290522 = newInstance(Class.forName("java.time.LocalDate"));
        Object term290526 = newInstance(Class.forName("java.time.LocalTime"));
        Object term290531 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term290532 = newInstance(Class.forName("java.time.LocalDate"));
        Object term290536 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term290501, term290501.getClass(), "id", 613082307832518791L);
        setLongField(term290503, term290503.getClass(), "id", -4873339440749526825L);
        setLongField(term290505, term290505.getClass(), "id", 415080973629770186L);
        setField(term290505, term290505.getClass(), "extId", term290507);
        setField(term290505, term290505.getClass(), "luid", "QShAEmzTpm");
        setIntField(term290522, term290522.getClass(), "year", 2022);
        setShortField(term290522, term290522.getClass(), "month", (short) 11);
        setShortField(term290522, term290522.getClass(), "day", (short) 25);
        setField(term290521, term290521.getClass(), "date", term290522);
        setByteField(term290526, term290526.getClass(), "hour", (byte) 18);
        setByteField(term290526, term290526.getClass(), "minute", (byte) 57);
        setByteField(term290526, term290526.getClass(), "second", (byte) 3);
        setIntField(term290526, term290526.getClass(), "nano", 835421273);
        setField(term290521, term290521.getClass(), "time", term290526);
        setField(term290505, term290505.getClass(), "registerTime", term290521);
        setIntField(term290532, term290532.getClass(), "year", 2014);
        setShortField(term290532, term290532.getClass(), "month", (short) 11);
        setShortField(term290532, term290532.getClass(), "day", (short) 22);
        setField(term290531, term290531.getClass(), "date", term290532);
        setByteField(term290536, term290536.getClass(), "hour", (byte) 15);
        setByteField(term290536, term290536.getClass(), "minute", (byte) 0);
        setByteField(term290536, term290536.getClass(), "second", (byte) 49);
        setIntField(term290536, term290536.getClass(), "nano", 252745625);
        setField(term290531, term290531.getClass(), "time", term290536);
        setField(term290505, term290505.getClass(), "accessTime", term290531);
        setField(term290503, term290503.getClass(), "card", term290505);
        setField(term290503, term290503.getClass(), "userName", "WfIDYpqgan");
        setIntField(term290503, term290503.getClass(), "level", -1055643003);
        setIntField(term290503, term290503.getClass(), "reincarnationNum", 847395228);
        setLongField(term290503, term290503.getClass(), "exp", -1235085191557191455L);
        setLongField(term290503, term290503.getClass(), "point", -8516820043346139663L);
        setLongField(term290503, term290503.getClass(), "totalPoint", 46549841552108153L);
        setIntField(term290503, term290503.getClass(), "playCount", 81677145);
        setIntField(term290503, term290503.getClass(), "jewelCount", -1790813734);
        setIntField(term290503, term290503.getClass(), "totalJewelCount", -493533883);
        setIntField(term290503, term290503.getClass(), "medalCount", 335230518);
        setIntField(term290503, term290503.getClass(), "playerRating", -1710727689);
        setIntField(term290503, term290503.getClass(), "highestRating", -869098490);
        setIntField(term290503, term290503.getClass(), "battlePoint", 752837910);
        setIntField(term290503, term290503.getClass(), "bestBattlePoint", 1252903646);
        setIntField(term290503, term290503.getClass(), "overDamageBattlePoint", -2047081294);
        setBooleanField(term290503, term290503.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term290503, term290503.getClass(), "nameplateId", 889571984);
        setIntField(term290503, term290503.getClass(), "trophyId", -154928117);
        setIntField(term290503, term290503.getClass(), "cardId", -110710151);
        setIntField(term290503, term290503.getClass(), "characterId", 578504241);
        setIntField(term290503, term290503.getClass(), "characterVoiceNo", 1413016419);
        setIntField(term290503, term290503.getClass(), "tabSetting", 1824247809);
        setIntField(term290503, term290503.getClass(), "tabSortSetting", 1919683206);
        setIntField(term290503, term290503.getClass(), "cardCategorySetting", -1794675312);
        setIntField(term290503, term290503.getClass(), "cardSortSetting", 1894030186);
        setIntField(term290503, term290503.getClass(), "rivalScoreCategorySetting", 771179779);
        setIntField(term290503, term290503.getClass(), "playedTutorialBit", 108189623);
        setIntField(term290503, term290503.getClass(), "firstTutorialCancelNum", 318207331);
        setLongField(term290503, term290503.getClass(), "sumTechHighScore", -5281472270658507547L);
        setLongField(term290503, term290503.getClass(), "sumTechBasicHighScore", 4969272958395913487L);
        setLongField(term290503, term290503.getClass(), "sumTechAdvancedHighScore", 7779224155555854778L);
        setLongField(term290503, term290503.getClass(), "sumTechExpertHighScore", 8378478514624627426L);
        setLongField(term290503, term290503.getClass(), "sumTechMasterHighScore", -2558220530430827760L);
        setLongField(term290503, term290503.getClass(), "sumTechLunaticHighScore", -169097657236944370L);
        setLongField(term290503, term290503.getClass(), "sumBattleHighScore", -5378080679253066309L);
        setLongField(term290503, term290503.getClass(), "sumBattleBasicHighScore", -4564093479470188087L);
        setLongField(term290503, term290503.getClass(), "sumBattleAdvancedHighScore", 4106102816988145062L);
        setLongField(term290503, term290503.getClass(), "sumBattleExpertHighScore", -4335894421631735831L);
        setLongField(term290503, term290503.getClass(), "sumBattleMasterHighScore", 6056385836879311092L);
        setLongField(term290503, term290503.getClass(), "sumBattleLunaticHighScore", -6883187084264041815L);
        setField(term290503, term290503.getClass(), "eventWatchedDate", "jkqkgaaQOn");
        setField(term290503, term290503.getClass(), "cmEventWatchedDate", "VxoGAcPGVp");
        setField(term290503, term290503.getClass(), "firstGameId", "ltoRvwhmcS");
        setField(term290503, term290503.getClass(), "firstRomVersion", "iSXUZmUzsG");
        setField(term290503, term290503.getClass(), "firstDataVersion", "wCLSYvOrxz");
        setField(term290503, term290503.getClass(), "firstPlayDate", "rzlCRHVFsA");
        setField(term290503, term290503.getClass(), "lastGameId", "XICyfUgpjZ");
        setField(term290503, term290503.getClass(), "lastRomVersion", "SOwukZbyqx");
        setField(term290503, term290503.getClass(), "lastDataVersion", "BPCRnKSWXh");
        setField(term290503, term290503.getClass(), "compatibleCmVersion", "QawFvvoVNe");
        setField(term290503, term290503.getClass(), "lastPlayDate", "JMmYwwRqLn");
        setIntField(term290503, term290503.getClass(), "lastPlaceId", -702662847);
        setField(term290503, term290503.getClass(), "lastPlaceName", "wiHmWKChBU");
        setIntField(term290503, term290503.getClass(), "lastRegionId", 188639727);
        setField(term290503, term290503.getClass(), "lastRegionName", "slHIDqbhVK");
        setIntField(term290503, term290503.getClass(), "lastAllNetId", 1955577795);
        setField(term290503, term290503.getClass(), "lastClientId", "lcdIOwjGRb");
        setIntField(term290503, term290503.getClass(), "lastUsedDeckId", -111436038);
        setIntField(term290503, term290503.getClass(), "lastPlayMusicLevel", -478782674);
        setIntField(term290503, term290503.getClass(), "lastEmoneyBrand", 1085451097);
        setField(term290501, term290501.getClass(), "user", term290503);
        setIntField(term290501, term290501.getClass(), "kind", 714673274);
        setIntField(term290501, term290501.getClass(), "activityId", 1944893926);
        setIntField(term290501, term290501.getClass(), "sortNumber", -2134184366);
        setIntField(term290501, term290501.getClass(), "param1", -398569298);
        setIntField(term290501, term290501.getClass(), "param2", -1103279079);
        setIntField(term290501, term290501.getClass(), "param3", 86630332);
        setIntField(term290501, term290501.getClass(), "param4", -632148709);
        term290773 = new Integer(815540124);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserActivity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term290773;
        callMethod(klass, "setParam3", argTypes, term290501, args);
    }

};


