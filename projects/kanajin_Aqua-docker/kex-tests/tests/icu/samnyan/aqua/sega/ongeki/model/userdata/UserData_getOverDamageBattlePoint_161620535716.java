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

public class UserData_getOverDamageBattlePoint_161620535716 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28686;

    public UserData_getOverDamageBattlePoint_161620535716() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term28690 = new Long(-8658027316505137504L);
        term28686 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term28688 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term28704 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28705 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28709 = newInstance(Class.forName("java.time.LocalTime"));
        Object term28714 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28715 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28719 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term28686, term28686.getClass(), "id", 3834297266838969495L);
        setLongField(term28688, term28688.getClass(), "id", -3257831489581525693L);
        setField(term28688, term28688.getClass(), "extId", term28690);
        setField(term28688, term28688.getClass(), "luid", "dPHtrzKWgf");
        setIntField(term28705, term28705.getClass(), "year", 2019);
        setShortField(term28705, term28705.getClass(), "month", (short) 6);
        setShortField(term28705, term28705.getClass(), "day", (short) 12);
        setField(term28704, term28704.getClass(), "date", term28705);
        setByteField(term28709, term28709.getClass(), "hour", (byte) 5);
        setByteField(term28709, term28709.getClass(), "minute", (byte) 13);
        setByteField(term28709, term28709.getClass(), "second", (byte) 8);
        setIntField(term28709, term28709.getClass(), "nano", 838117658);
        setField(term28704, term28704.getClass(), "time", term28709);
        setField(term28688, term28688.getClass(), "registerTime", term28704);
        setIntField(term28715, term28715.getClass(), "year", 2014);
        setShortField(term28715, term28715.getClass(), "month", (short) 8);
        setShortField(term28715, term28715.getClass(), "day", (short) 13);
        setField(term28714, term28714.getClass(), "date", term28715);
        setByteField(term28719, term28719.getClass(), "hour", (byte) 13);
        setByteField(term28719, term28719.getClass(), "minute", (byte) 15);
        setByteField(term28719, term28719.getClass(), "second", (byte) 51);
        setIntField(term28719, term28719.getClass(), "nano", 433726678);
        setField(term28714, term28714.getClass(), "time", term28719);
        setField(term28688, term28688.getClass(), "accessTime", term28714);
        setField(term28686, term28686.getClass(), "card", term28688);
        setField(term28686, term28686.getClass(), "userName", "olmFxfIVeh");
        setIntField(term28686, term28686.getClass(), "level", -337695922);
        setIntField(term28686, term28686.getClass(), "reincarnationNum", 817836900);
        setLongField(term28686, term28686.getClass(), "exp", 273141122717896399L);
        setLongField(term28686, term28686.getClass(), "point", 4057255693458933280L);
        setLongField(term28686, term28686.getClass(), "totalPoint", 3365899934091025813L);
        setIntField(term28686, term28686.getClass(), "playCount", 1691654567);
        setIntField(term28686, term28686.getClass(), "jewelCount", -1604942135);
        setIntField(term28686, term28686.getClass(), "totalJewelCount", 2000275611);
        setIntField(term28686, term28686.getClass(), "medalCount", 2060369122);
        setIntField(term28686, term28686.getClass(), "playerRating", -1275204506);
        setIntField(term28686, term28686.getClass(), "highestRating", 507439888);
        setIntField(term28686, term28686.getClass(), "battlePoint", 1936798149);
        setIntField(term28686, term28686.getClass(), "bestBattlePoint", 188304401);
        setIntField(term28686, term28686.getClass(), "overDamageBattlePoint", -40613160);
        setBooleanField(term28686, term28686.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term28686, term28686.getClass(), "nameplateId", 1359973218);
        setIntField(term28686, term28686.getClass(), "trophyId", -218759803);
        setIntField(term28686, term28686.getClass(), "cardId", 1288936083);
        setIntField(term28686, term28686.getClass(), "characterId", 4086209);
        setIntField(term28686, term28686.getClass(), "characterVoiceNo", 300964556);
        setIntField(term28686, term28686.getClass(), "tabSetting", -958207893);
        setIntField(term28686, term28686.getClass(), "tabSortSetting", 674390543);
        setIntField(term28686, term28686.getClass(), "cardCategorySetting", 1472100258);
        setIntField(term28686, term28686.getClass(), "cardSortSetting", 12681987);
        setIntField(term28686, term28686.getClass(), "rivalScoreCategorySetting", -1987364934);
        setIntField(term28686, term28686.getClass(), "playedTutorialBit", 1364414277);
        setIntField(term28686, term28686.getClass(), "firstTutorialCancelNum", -961137606);
        setLongField(term28686, term28686.getClass(), "sumTechHighScore", 8532808243879007296L);
        setLongField(term28686, term28686.getClass(), "sumTechBasicHighScore", 3757985447600693853L);
        setLongField(term28686, term28686.getClass(), "sumTechAdvancedHighScore", 7118424169978013558L);
        setLongField(term28686, term28686.getClass(), "sumTechExpertHighScore", 1145539328952774873L);
        setLongField(term28686, term28686.getClass(), "sumTechMasterHighScore", -4593197356529163455L);
        setLongField(term28686, term28686.getClass(), "sumTechLunaticHighScore", -8449554760304422682L);
        setLongField(term28686, term28686.getClass(), "sumBattleHighScore", -8538697616110187183L);
        setLongField(term28686, term28686.getClass(), "sumBattleBasicHighScore", -1177978844927364440L);
        setLongField(term28686, term28686.getClass(), "sumBattleAdvancedHighScore", -2253606887164749750L);
        setLongField(term28686, term28686.getClass(), "sumBattleExpertHighScore", 8324238777146638579L);
        setLongField(term28686, term28686.getClass(), "sumBattleMasterHighScore", 8580739755779561159L);
        setLongField(term28686, term28686.getClass(), "sumBattleLunaticHighScore", -4916056690424367636L);
        setField(term28686, term28686.getClass(), "eventWatchedDate", "iSPirUEhXs");
        setField(term28686, term28686.getClass(), "cmEventWatchedDate", "WWyLFmYpAy");
        setField(term28686, term28686.getClass(), "firstGameId", "vbSWeJWOQh");
        setField(term28686, term28686.getClass(), "firstRomVersion", "hyvFdAvkOr");
        setField(term28686, term28686.getClass(), "firstDataVersion", "ewbQRtustW");
        setField(term28686, term28686.getClass(), "firstPlayDate", "cABEHYBnys");
        setField(term28686, term28686.getClass(), "lastGameId", "EhlWSobaco");
        setField(term28686, term28686.getClass(), "lastRomVersion", "hEuycunsSe");
        setField(term28686, term28686.getClass(), "lastDataVersion", "IMFzXhpNCx");
        setField(term28686, term28686.getClass(), "compatibleCmVersion", "xAtFmANjwD");
        setField(term28686, term28686.getClass(), "lastPlayDate", "ICysuFllEZ");
        setIntField(term28686, term28686.getClass(), "lastPlaceId", 795205527);
        setField(term28686, term28686.getClass(), "lastPlaceName", "cGQJTTxcXr");
        setIntField(term28686, term28686.getClass(), "lastRegionId", 600958607);
        setField(term28686, term28686.getClass(), "lastRegionName", "aKaqvssiby");
        setIntField(term28686, term28686.getClass(), "lastAllNetId", 897159778);
        setField(term28686, term28686.getClass(), "lastClientId", "tTVbtBVAfo");
        setIntField(term28686, term28686.getClass(), "lastUsedDeckId", -1934934961);
        setIntField(term28686, term28686.getClass(), "lastPlayMusicLevel", 2120054887);
        setIntField(term28686, term28686.getClass(), "lastEmoneyBrand", 2145648967);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOverDamageBattlePoint", argTypes, term28686, args);
    }

};


