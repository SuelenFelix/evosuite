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

public class UserTechEvent_setTechRecordDate_141975858214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term357877;

    public UserTechEvent_setTechRecordDate_141975858214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term357883 = new Long(5383032785479262184L);
        term357877 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTechEvent"));
        Object term357879 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term357881 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term357897 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term357898 = newInstance(Class.forName("java.time.LocalDate"));
        Object term357902 = newInstance(Class.forName("java.time.LocalTime"));
        Object term357907 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term357908 = newInstance(Class.forName("java.time.LocalDate"));
        Object term357912 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term357877, term357877.getClass(), "id", -8728861673957106184L);
        setLongField(term357879, term357879.getClass(), "id", -4056981837615541992L);
        setLongField(term357881, term357881.getClass(), "id", 7010048378657888724L);
        setField(term357881, term357881.getClass(), "extId", term357883);
        setField(term357881, term357881.getClass(), "luid", "HMVCCQEwwy");
        setIntField(term357898, term357898.getClass(), "year", 2011);
        setShortField(term357898, term357898.getClass(), "month", (short) 8);
        setShortField(term357898, term357898.getClass(), "day", (short) 11);
        setField(term357897, term357897.getClass(), "date", term357898);
        setByteField(term357902, term357902.getClass(), "hour", (byte) 2);
        setByteField(term357902, term357902.getClass(), "minute", (byte) 28);
        setByteField(term357902, term357902.getClass(), "second", (byte) 16);
        setIntField(term357902, term357902.getClass(), "nano", 938751053);
        setField(term357897, term357897.getClass(), "time", term357902);
        setField(term357881, term357881.getClass(), "registerTime", term357897);
        setIntField(term357908, term357908.getClass(), "year", 2029);
        setShortField(term357908, term357908.getClass(), "month", (short) 8);
        setShortField(term357908, term357908.getClass(), "day", (short) 14);
        setField(term357907, term357907.getClass(), "date", term357908);
        setByteField(term357912, term357912.getClass(), "hour", (byte) 18);
        setByteField(term357912, term357912.getClass(), "minute", (byte) 55);
        setByteField(term357912, term357912.getClass(), "second", (byte) 35);
        setIntField(term357912, term357912.getClass(), "nano", 39373191);
        setField(term357907, term357907.getClass(), "time", term357912);
        setField(term357881, term357881.getClass(), "accessTime", term357907);
        setField(term357879, term357879.getClass(), "card", term357881);
        setField(term357879, term357879.getClass(), "userName", "bFDyBEfifY");
        setIntField(term357879, term357879.getClass(), "level", -1287885106);
        setIntField(term357879, term357879.getClass(), "reincarnationNum", 41458419);
        setLongField(term357879, term357879.getClass(), "exp", -9160609662258879744L);
        setLongField(term357879, term357879.getClass(), "point", -5589410057502725103L);
        setLongField(term357879, term357879.getClass(), "totalPoint", -4247579780791123868L);
        setIntField(term357879, term357879.getClass(), "playCount", -927034658);
        setIntField(term357879, term357879.getClass(), "jewelCount", -495109012);
        setIntField(term357879, term357879.getClass(), "totalJewelCount", -1056451884);
        setIntField(term357879, term357879.getClass(), "medalCount", 972525295);
        setIntField(term357879, term357879.getClass(), "playerRating", 510633890);
        setIntField(term357879, term357879.getClass(), "highestRating", -1687219669);
        setIntField(term357879, term357879.getClass(), "battlePoint", 1524862265);
        setIntField(term357879, term357879.getClass(), "bestBattlePoint", -358964327);
        setIntField(term357879, term357879.getClass(), "overDamageBattlePoint", -449070744);
        setBooleanField(term357879, term357879.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term357879, term357879.getClass(), "nameplateId", 1541411377);
        setIntField(term357879, term357879.getClass(), "trophyId", 190495382);
        setIntField(term357879, term357879.getClass(), "cardId", 1945670371);
        setIntField(term357879, term357879.getClass(), "characterId", 418708429);
        setIntField(term357879, term357879.getClass(), "characterVoiceNo", -128095447);
        setIntField(term357879, term357879.getClass(), "tabSetting", -309711442);
        setIntField(term357879, term357879.getClass(), "tabSortSetting", 2144312377);
        setIntField(term357879, term357879.getClass(), "cardCategorySetting", -1222180796);
        setIntField(term357879, term357879.getClass(), "cardSortSetting", 1524166809);
        setIntField(term357879, term357879.getClass(), "rivalScoreCategorySetting", 2077786067);
        setIntField(term357879, term357879.getClass(), "playedTutorialBit", 961435421);
        setIntField(term357879, term357879.getClass(), "firstTutorialCancelNum", 783898390);
        setLongField(term357879, term357879.getClass(), "sumTechHighScore", 3098771544588936569L);
        setLongField(term357879, term357879.getClass(), "sumTechBasicHighScore", -7878184107052794882L);
        setLongField(term357879, term357879.getClass(), "sumTechAdvancedHighScore", -1805065546599090714L);
        setLongField(term357879, term357879.getClass(), "sumTechExpertHighScore", 2127840054045635552L);
        setLongField(term357879, term357879.getClass(), "sumTechMasterHighScore", 7116550395888805604L);
        setLongField(term357879, term357879.getClass(), "sumTechLunaticHighScore", 8770237315414148792L);
        setLongField(term357879, term357879.getClass(), "sumBattleHighScore", 5310083575054900373L);
        setLongField(term357879, term357879.getClass(), "sumBattleBasicHighScore", 1688975108161886549L);
        setLongField(term357879, term357879.getClass(), "sumBattleAdvancedHighScore", -6522425052073525035L);
        setLongField(term357879, term357879.getClass(), "sumBattleExpertHighScore", -5613439004292894615L);
        setLongField(term357879, term357879.getClass(), "sumBattleMasterHighScore", 7587388201893248157L);
        setLongField(term357879, term357879.getClass(), "sumBattleLunaticHighScore", 5491528399554421392L);
        setField(term357879, term357879.getClass(), "eventWatchedDate", "wFHVmYOtOx");
        setField(term357879, term357879.getClass(), "cmEventWatchedDate", "lkaWLaUiEp");
        setField(term357879, term357879.getClass(), "firstGameId", "bLFcoYpadb");
        setField(term357879, term357879.getClass(), "firstRomVersion", "hukUVPbMjH");
        setField(term357879, term357879.getClass(), "firstDataVersion", "LMEwfmZWvS");
        setField(term357879, term357879.getClass(), "firstPlayDate", "EmirNlqKga");
        setField(term357879, term357879.getClass(), "lastGameId", "XURlvDAvFa");
        setField(term357879, term357879.getClass(), "lastRomVersion", "TrMNpnHtwt");
        setField(term357879, term357879.getClass(), "lastDataVersion", "DtXnFbPdmv");
        setField(term357879, term357879.getClass(), "compatibleCmVersion", "UyldENVbot");
        setField(term357879, term357879.getClass(), "lastPlayDate", "oEftwIIqBJ");
        setIntField(term357879, term357879.getClass(), "lastPlaceId", 255934878);
        setField(term357879, term357879.getClass(), "lastPlaceName", "wAMjVbniSD");
        setIntField(term357879, term357879.getClass(), "lastRegionId", -445365368);
        setField(term357879, term357879.getClass(), "lastRegionName", "wUkHgGqfCL");
        setIntField(term357879, term357879.getClass(), "lastAllNetId", -58811662);
        setField(term357879, term357879.getClass(), "lastClientId", "RxxduKZsCH");
        setIntField(term357879, term357879.getClass(), "lastUsedDeckId", -1406354262);
        setIntField(term357879, term357879.getClass(), "lastPlayMusicLevel", 1659447004);
        setIntField(term357879, term357879.getClass(), "lastEmoneyBrand", -2135933593);
        setField(term357877, term357877.getClass(), "user", term357879);
        setIntField(term357877, term357877.getClass(), "eventId", 215388183);
        setIntField(term357877, term357877.getClass(), "totalTechScore", 1093097222);
        setIntField(term357877, term357877.getClass(), "totalPlatinumScore", 1748130735);
        setField(term357877, term357877.getClass(), "techRecordDate", "dxJqFUCQcY");
        setBooleanField(term357877, term357877.getClass(), "isRankingRewarded", false);
        setBooleanField(term357877, term357877.getClass(), "isTotalTechNewRecord", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTechEvent");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "vwwpEivoqH";
        callMethod(klass, "setTechRecordDate", argTypes, term357877, args);
    }

};


