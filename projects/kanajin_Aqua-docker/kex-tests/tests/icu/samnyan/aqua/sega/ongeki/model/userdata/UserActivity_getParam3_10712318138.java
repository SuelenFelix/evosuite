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

public class UserActivity_getParam3_10712318138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term286178;

    public UserActivity_getParam3_10712318138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term286184 = new Long(6545086285386938562L);
        term286178 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserActivity"));
        Object term286180 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term286182 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term286198 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term286199 = newInstance(Class.forName("java.time.LocalDate"));
        Object term286203 = newInstance(Class.forName("java.time.LocalTime"));
        Object term286208 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term286209 = newInstance(Class.forName("java.time.LocalDate"));
        Object term286213 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term286178, term286178.getClass(), "id", 7459985102307900191L);
        setLongField(term286180, term286180.getClass(), "id", -567900635458830819L);
        setLongField(term286182, term286182.getClass(), "id", -9056941630579317792L);
        setField(term286182, term286182.getClass(), "extId", term286184);
        setField(term286182, term286182.getClass(), "luid", "TNCsQimVZr");
        setIntField(term286199, term286199.getClass(), "year", 2029);
        setShortField(term286199, term286199.getClass(), "month", (short) 3);
        setShortField(term286199, term286199.getClass(), "day", (short) 16);
        setField(term286198, term286198.getClass(), "date", term286199);
        setByteField(term286203, term286203.getClass(), "hour", (byte) 8);
        setByteField(term286203, term286203.getClass(), "minute", (byte) 45);
        setByteField(term286203, term286203.getClass(), "second", (byte) 41);
        setIntField(term286203, term286203.getClass(), "nano", 887752885);
        setField(term286198, term286198.getClass(), "time", term286203);
        setField(term286182, term286182.getClass(), "registerTime", term286198);
        setIntField(term286209, term286209.getClass(), "year", 2022);
        setShortField(term286209, term286209.getClass(), "month", (short) 5);
        setShortField(term286209, term286209.getClass(), "day", (short) 22);
        setField(term286208, term286208.getClass(), "date", term286209);
        setByteField(term286213, term286213.getClass(), "hour", (byte) 5);
        setByteField(term286213, term286213.getClass(), "minute", (byte) 32);
        setByteField(term286213, term286213.getClass(), "second", (byte) 45);
        setIntField(term286213, term286213.getClass(), "nano", 267921436);
        setField(term286208, term286208.getClass(), "time", term286213);
        setField(term286182, term286182.getClass(), "accessTime", term286208);
        setField(term286180, term286180.getClass(), "card", term286182);
        setField(term286180, term286180.getClass(), "userName", "dTJYyhSqZb");
        setIntField(term286180, term286180.getClass(), "level", -2105010810);
        setIntField(term286180, term286180.getClass(), "reincarnationNum", 1181204338);
        setLongField(term286180, term286180.getClass(), "exp", -5872215452316587662L);
        setLongField(term286180, term286180.getClass(), "point", -7197450155611120244L);
        setLongField(term286180, term286180.getClass(), "totalPoint", -5643521397705326959L);
        setIntField(term286180, term286180.getClass(), "playCount", 508081446);
        setIntField(term286180, term286180.getClass(), "jewelCount", 376898409);
        setIntField(term286180, term286180.getClass(), "totalJewelCount", 1386885355);
        setIntField(term286180, term286180.getClass(), "medalCount", -515424228);
        setIntField(term286180, term286180.getClass(), "playerRating", -438220867);
        setIntField(term286180, term286180.getClass(), "highestRating", 1698753362);
        setIntField(term286180, term286180.getClass(), "battlePoint", -2145373019);
        setIntField(term286180, term286180.getClass(), "bestBattlePoint", 401498563);
        setIntField(term286180, term286180.getClass(), "overDamageBattlePoint", -1044642405);
        setBooleanField(term286180, term286180.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term286180, term286180.getClass(), "nameplateId", 444235950);
        setIntField(term286180, term286180.getClass(), "trophyId", 503125111);
        setIntField(term286180, term286180.getClass(), "cardId", -1215717148);
        setIntField(term286180, term286180.getClass(), "characterId", -1294590794);
        setIntField(term286180, term286180.getClass(), "characterVoiceNo", -1898767144);
        setIntField(term286180, term286180.getClass(), "tabSetting", -1615737612);
        setIntField(term286180, term286180.getClass(), "tabSortSetting", -1929266577);
        setIntField(term286180, term286180.getClass(), "cardCategorySetting", -693218996);
        setIntField(term286180, term286180.getClass(), "cardSortSetting", 1600991895);
        setIntField(term286180, term286180.getClass(), "rivalScoreCategorySetting", -116605955);
        setIntField(term286180, term286180.getClass(), "playedTutorialBit", 2146104322);
        setIntField(term286180, term286180.getClass(), "firstTutorialCancelNum", -2114620413);
        setLongField(term286180, term286180.getClass(), "sumTechHighScore", -4669144842735371317L);
        setLongField(term286180, term286180.getClass(), "sumTechBasicHighScore", -157411734190836154L);
        setLongField(term286180, term286180.getClass(), "sumTechAdvancedHighScore", 6393374764022609931L);
        setLongField(term286180, term286180.getClass(), "sumTechExpertHighScore", 367725929209371784L);
        setLongField(term286180, term286180.getClass(), "sumTechMasterHighScore", 5438476421286568799L);
        setLongField(term286180, term286180.getClass(), "sumTechLunaticHighScore", 7729191629610168062L);
        setLongField(term286180, term286180.getClass(), "sumBattleHighScore", 5879974315032007332L);
        setLongField(term286180, term286180.getClass(), "sumBattleBasicHighScore", 5595244825559719876L);
        setLongField(term286180, term286180.getClass(), "sumBattleAdvancedHighScore", -2001260296518850331L);
        setLongField(term286180, term286180.getClass(), "sumBattleExpertHighScore", -2412068432338468754L);
        setLongField(term286180, term286180.getClass(), "sumBattleMasterHighScore", -8584932088726543360L);
        setLongField(term286180, term286180.getClass(), "sumBattleLunaticHighScore", 3712778743607564620L);
        setField(term286180, term286180.getClass(), "eventWatchedDate", "iicxxwOzxG");
        setField(term286180, term286180.getClass(), "cmEventWatchedDate", "BSnMedHMbT");
        setField(term286180, term286180.getClass(), "firstGameId", "suxAdGELQz");
        setField(term286180, term286180.getClass(), "firstRomVersion", "tDWIXysudb");
        setField(term286180, term286180.getClass(), "firstDataVersion", "RpgUAcoIsr");
        setField(term286180, term286180.getClass(), "firstPlayDate", "lQcYldlbRe");
        setField(term286180, term286180.getClass(), "lastGameId", "wLBfWSBNBp");
        setField(term286180, term286180.getClass(), "lastRomVersion", "mmSpCBAGwv");
        setField(term286180, term286180.getClass(), "lastDataVersion", "cFItYVTeZD");
        setField(term286180, term286180.getClass(), "compatibleCmVersion", "CFWwaVWFFR");
        setField(term286180, term286180.getClass(), "lastPlayDate", "mVUqRSEsUR");
        setIntField(term286180, term286180.getClass(), "lastPlaceId", 1985278829);
        setField(term286180, term286180.getClass(), "lastPlaceName", "CgmarxBJZT");
        setIntField(term286180, term286180.getClass(), "lastRegionId", 314015111);
        setField(term286180, term286180.getClass(), "lastRegionName", "keaFywfzbU");
        setIntField(term286180, term286180.getClass(), "lastAllNetId", -1121701030);
        setField(term286180, term286180.getClass(), "lastClientId", "ADlubZpgSu");
        setIntField(term286180, term286180.getClass(), "lastUsedDeckId", -1941072303);
        setIntField(term286180, term286180.getClass(), "lastPlayMusicLevel", 405501485);
        setIntField(term286180, term286180.getClass(), "lastEmoneyBrand", 1227837601);
        setField(term286178, term286178.getClass(), "user", term286180);
        setIntField(term286178, term286178.getClass(), "kind", -1995728635);
        setIntField(term286178, term286178.getClass(), "activityId", -912416483);
        setIntField(term286178, term286178.getClass(), "sortNumber", -1119538480);
        setIntField(term286178, term286178.getClass(), "param1", 1097877685);
        setIntField(term286178, term286178.getClass(), "param2", -44723620);
        setIntField(term286178, term286178.getClass(), "param3", 1035284902);
        setIntField(term286178, term286178.getClass(), "param4", -1592531065);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserActivity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getParam3", argTypes, term286178, args);
    }

};


