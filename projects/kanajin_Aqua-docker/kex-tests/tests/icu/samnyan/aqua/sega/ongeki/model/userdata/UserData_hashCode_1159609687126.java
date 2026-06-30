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

public class UserData_hashCode_1159609687126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75686;

    public UserData_hashCode_1159609687126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term75690 = new Long(-6100012593724108983L);
        term75686 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term75688 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term75704 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term75705 = newInstance(Class.forName("java.time.LocalDate"));
        Object term75709 = newInstance(Class.forName("java.time.LocalTime"));
        Object term75714 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term75715 = newInstance(Class.forName("java.time.LocalDate"));
        Object term75719 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term75686, term75686.getClass(), "id", 8629310297117297481L);
        setLongField(term75688, term75688.getClass(), "id", -8518144174606061558L);
        setField(term75688, term75688.getClass(), "extId", term75690);
        setField(term75688, term75688.getClass(), "luid", "frPgAZBkug");
        setIntField(term75705, term75705.getClass(), "year", 2017);
        setShortField(term75705, term75705.getClass(), "month", (short) 5);
        setShortField(term75705, term75705.getClass(), "day", (short) 2);
        setField(term75704, term75704.getClass(), "date", term75705);
        setByteField(term75709, term75709.getClass(), "hour", (byte) 7);
        setByteField(term75709, term75709.getClass(), "minute", (byte) 24);
        setByteField(term75709, term75709.getClass(), "second", (byte) 51);
        setIntField(term75709, term75709.getClass(), "nano", 706502334);
        setField(term75704, term75704.getClass(), "time", term75709);
        setField(term75688, term75688.getClass(), "registerTime", term75704);
        setIntField(term75715, term75715.getClass(), "year", 2026);
        setShortField(term75715, term75715.getClass(), "month", (short) 11);
        setShortField(term75715, term75715.getClass(), "day", (short) 1);
        setField(term75714, term75714.getClass(), "date", term75715);
        setByteField(term75719, term75719.getClass(), "hour", (byte) 9);
        setByteField(term75719, term75719.getClass(), "minute", (byte) 4);
        setByteField(term75719, term75719.getClass(), "second", (byte) 25);
        setIntField(term75719, term75719.getClass(), "nano", 272299951);
        setField(term75714, term75714.getClass(), "time", term75719);
        setField(term75688, term75688.getClass(), "accessTime", term75714);
        setField(term75686, term75686.getClass(), "card", term75688);
        setField(term75686, term75686.getClass(), "userName", "AAzuYrqTRq");
        setIntField(term75686, term75686.getClass(), "level", 638814614);
        setIntField(term75686, term75686.getClass(), "reincarnationNum", 832395207);
        setLongField(term75686, term75686.getClass(), "exp", 7380362922854751244L);
        setLongField(term75686, term75686.getClass(), "point", -3669719821338149918L);
        setLongField(term75686, term75686.getClass(), "totalPoint", 6032481460655868293L);
        setIntField(term75686, term75686.getClass(), "playCount", 1161114638);
        setIntField(term75686, term75686.getClass(), "jewelCount", -1391162351);
        setIntField(term75686, term75686.getClass(), "totalJewelCount", 863863650);
        setIntField(term75686, term75686.getClass(), "medalCount", 326665488);
        setIntField(term75686, term75686.getClass(), "playerRating", -556521634);
        setIntField(term75686, term75686.getClass(), "highestRating", -904069976);
        setIntField(term75686, term75686.getClass(), "battlePoint", 1492540298);
        setIntField(term75686, term75686.getClass(), "bestBattlePoint", 751340602);
        setIntField(term75686, term75686.getClass(), "overDamageBattlePoint", 123770182);
        setBooleanField(term75686, term75686.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term75686, term75686.getClass(), "nameplateId", -813178856);
        setIntField(term75686, term75686.getClass(), "trophyId", 1591732055);
        setIntField(term75686, term75686.getClass(), "cardId", -1580446775);
        setIntField(term75686, term75686.getClass(), "characterId", -1008507790);
        setIntField(term75686, term75686.getClass(), "characterVoiceNo", -1382203900);
        setIntField(term75686, term75686.getClass(), "tabSetting", -2140997236);
        setIntField(term75686, term75686.getClass(), "tabSortSetting", -1868254835);
        setIntField(term75686, term75686.getClass(), "cardCategorySetting", -660465161);
        setIntField(term75686, term75686.getClass(), "cardSortSetting", -967958435);
        setIntField(term75686, term75686.getClass(), "rivalScoreCategorySetting", 791509654);
        setIntField(term75686, term75686.getClass(), "playedTutorialBit", -1695301446);
        setIntField(term75686, term75686.getClass(), "firstTutorialCancelNum", 579391144);
        setLongField(term75686, term75686.getClass(), "sumTechHighScore", 3940048705672410963L);
        setLongField(term75686, term75686.getClass(), "sumTechBasicHighScore", -595318203552657623L);
        setLongField(term75686, term75686.getClass(), "sumTechAdvancedHighScore", 6148234968144914875L);
        setLongField(term75686, term75686.getClass(), "sumTechExpertHighScore", -3787619679141862761L);
        setLongField(term75686, term75686.getClass(), "sumTechMasterHighScore", 3595654468325902203L);
        setLongField(term75686, term75686.getClass(), "sumTechLunaticHighScore", -5890498762874763812L);
        setLongField(term75686, term75686.getClass(), "sumBattleHighScore", 336723219273701338L);
        setLongField(term75686, term75686.getClass(), "sumBattleBasicHighScore", 6556523216612833778L);
        setLongField(term75686, term75686.getClass(), "sumBattleAdvancedHighScore", -5995037992334109399L);
        setLongField(term75686, term75686.getClass(), "sumBattleExpertHighScore", 95336991964157322L);
        setLongField(term75686, term75686.getClass(), "sumBattleMasterHighScore", -7344726906694816984L);
        setLongField(term75686, term75686.getClass(), "sumBattleLunaticHighScore", -7696292233533783029L);
        setField(term75686, term75686.getClass(), "eventWatchedDate", "cUQuwEPzJb");
        setField(term75686, term75686.getClass(), "cmEventWatchedDate", "sqPZeXSusM");
        setField(term75686, term75686.getClass(), "firstGameId", "mUCxMstoOT");
        setField(term75686, term75686.getClass(), "firstRomVersion", "LroMhmrHbv");
        setField(term75686, term75686.getClass(), "firstDataVersion", "nUWkEhozFC");
        setField(term75686, term75686.getClass(), "firstPlayDate", "cZOLUZUhxQ");
        setField(term75686, term75686.getClass(), "lastGameId", "fXCybRqtsq");
        setField(term75686, term75686.getClass(), "lastRomVersion", "gPhmseJiob");
        setField(term75686, term75686.getClass(), "lastDataVersion", "dgpHJUBySN");
        setField(term75686, term75686.getClass(), "compatibleCmVersion", "jCEXysSVZf");
        setField(term75686, term75686.getClass(), "lastPlayDate", "jWrmcNnNoB");
        setIntField(term75686, term75686.getClass(), "lastPlaceId", 858488872);
        setField(term75686, term75686.getClass(), "lastPlaceName", "MoncgugUfo");
        setIntField(term75686, term75686.getClass(), "lastRegionId", -218279934);
        setField(term75686, term75686.getClass(), "lastRegionName", "OdbuOWCJTS");
        setIntField(term75686, term75686.getClass(), "lastAllNetId", -689744296);
        setField(term75686, term75686.getClass(), "lastClientId", "ksvfEdmpqg");
        setIntField(term75686, term75686.getClass(), "lastUsedDeckId", 263038376);
        setIntField(term75686, term75686.getClass(), "lastPlayMusicLevel", -631719292);
        setIntField(term75686, term75686.getClass(), "lastEmoneyBrand", -2119317714);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term75686, args);
    }

};


